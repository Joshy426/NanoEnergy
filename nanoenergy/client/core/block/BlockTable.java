package nanoenergy.client.core.block;

import java.util.List;
import java.util.Random;

import nanoenergy.client.core.tileentity.TileNanoTable;
import nanoenergy.common.NanoEnergy;
import nanoenergy.lib.GuiIds;
import nanoenergy.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockTable extends BlockNE {
	private Random rand = new Random();
	protected int renderType;

	public BlockTable setRenderType(int id) {
		this.renderType = id;
		return this;
	}

	public BlockTable(int par1, Material par3material) {
		super(par1, par3material);


		// Block's creative tab
		setCreativeTab(NanoEnergy.tabNanoEnergy);

		// Block's hardness (base time to harvest it with the correct tool).
		// Sand = 0.5, Stone = 1.5, Ore = 3.0 Obsidian = 20

		// Block's resistance to explosions. Stone = 10, obsidian = 2000
		//setResistance(1000.0F);

		// Sound to play when player steps on the block
		setStepSound(Block.soundMetalFootstep);

		// How much light is stopped by this block; 0 for air, 255 for fully
		// opaque.
		setLightOpacity(0);

		// Light level, 0-1. Gets multiplied by 15 and truncated to find the
		// actual light level for the block.
		setLightValue(0.4f);

		// Whether to receive random ticks e.g. plants
		setTickRandomly(false);

		LanguageRegistry.addName(this, "Test Table");

		// Harvest level for this block. par2 can be pickaxe, axe, or shovel, or
		// a different toolclass. par3 is the minimum level of item required to
		// break it:
		// 0=bare hands, 1=wood, 2=stone, 3=iron, 4=diamond
		MinecraftForge.setBlockHarvestLevel(this, "pickaxe", 0);

		// Register the tile entity, which is only used for rendering at the
		// moment
		//GameRegistry.registerTileEntity(TileNanoTable.class,
			//	Strings.TE_TABLE_NAME);

		// Finally, register the block so that it appears in the game. New
		// standard requires a name to be passed.
		GameRegistry.registerBlock(this, "table");

	}
	
	

	/**
	 * returns some value from 0 to 30 or so for different models. Since we're
	 * using a custom renderer, we pass in a completely different ID: the
	 * assigned block ID. It won't conflict with other mods, since Forge looks
	 * it up in a table anyway, but it's still best to have different internal
	 * IDs.
	 */

	@Override
	public boolean isOpaqueCube ()
	{
		return false;
	}
	
	@Override
	public int getRenderType() {
		return NanoEnergy.modelID;
	}

	/**
	 * This method is called on a block after all other blocks gets already
	 * created. You can use it to reference and configure something on the block
	 * that needs the others ones.
	 */
	@Override
	protected void initializeBlock() {
	}
	
	/*public String getTextureFile ()
	{
		return "/nanoenergy/items.png";
	}*/

	public int getBlockTextureFromSideAndMetadata (int side, int meta)
	{
		if (meta == 0)
		{
			if (side == 0)
				return 3;
			else if (side == 1)
				return 0;
			else if (side == 2 || side == 3)
				return 1;
			else
				return 2;
		}
		else if (meta <= 4)
		{
			return 1 + meta * 3 + getBlockTextureFromSide(side);
		}
		else if (meta <= 9)
		{
			return 16 + getBlockTextureFromSide(side);
		}
		else
		{
			return -10 + meta * 3 + getBlockTextureFromSide(side);
		}
	}

	public int getBlockTextureFromSide (int side)
	{
		if (side == 0)
			return 2;
		if (side == 1)
			return 0;

		return 1;
	}
	
	@Override
	public boolean shouldSideBeRendered (IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
	{
		return true;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False
	 * (examples: signs, buttons, stairs, etc)
	 */
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	/**
	 * Called throughout the code as a replacement for block instanceof
	 * BlockContainer Moving this to the Block base class allows for mods that
	 * wish to extend vinella blocks, and also want to have a tile entity on
	 * that block, may.
	 * 
	 * Return true from this function to specify this block has a tile entity.
	 * 
	 * @param metadata
	 *            Metadata of the current block
	 * @return True if block has a tile entity, false otherwise
	 */
	@Override
	public boolean hasTileEntity(int metadata)
	{
		return true;
	}

	/**
	 * Called throughout the code as a replacement for
	 * BlockContainer.getBlockEntity Return the same thing you would from that
	 * function. This will fall back to BlockContainer.getBlockEntity if this
	 * block is a BlockContainer.
	 * 
	 * @param metadata
	 *            The Metadata of the current block
	 * @return A instance of a class extending TileEntity
	 */
	@Override
	public TileEntity createTileEntity(World world, int metadata)
	{
		return new TileNanoTable();

	}
	/**
	 * Location aware and overrideable version of the lightOpacity array, return
	 * the number to subtract from the light value when it passes through this
	 * block.
	 * 
	 * This is not guaranteed to have the tile entity in place before this is
	 * called, so it is Recommended that you have your tile entity call relight
	 * after being placed if you rely on it for light info.
	 * 
	 * @param world
	 *            The current world
	 * @param x
	 *            X Position
	 * @param y
	 *            Y Position
	 * @param z
	 *            Z position
	 * @return The amount of light to block, 0 for air, 255 for fully opaque.
	 */
	@Override
	public int getLightOpacity(World world, int x, int y, int z)
	{
		return 0;
	}
	/**
	 * Called upon block activation (right click on the block.)
	 */
	@Override
    public boolean onBlockActivated(World world, int x, int y, int z,
                    EntityPlayer player, int idk, float what, float these, float are) {
            TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
            if (tileEntity == null || player.isSneaking()) {
                    return false;
            }
    //code to open gui explained later
    player.openGui(NanoEnergy.instance, GuiIds.NANOTABLE, world, x, y, z);
            return true;
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, int par5, int par6) {
            dropInventory(world, x, y, z);
            super.breakBlock(world, x, y, z, par5, par6);
    }
    private void dropInventory(World world, int x, int y, int z) {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        
        if (!(tileEntity instanceof IInventory)) {
            
            return;
        }
        
        IInventory inventory = (IInventory) tileEntity;

        for (int i = 0; i < inventory.getSizeInventory(); i++) {
            
            ItemStack itemStack = inventory.getStackInSlot(i);
            
            if ((itemStack != null) && (itemStack.stackSize > 0)) {
                float dX = this.rand.nextFloat() * 0.8F + 0.1F;
                float dY = this.rand.nextFloat() * 0.8F + 0.1F;
                float dZ = this.rand.nextFloat() * 0.8F + 0.1F;
                
                EntityItem entityItem = new EntityItem(world, x + dX, y + dY, z + dZ, new ItemStack(itemStack.itemID, itemStack.stackSize, itemStack.getItemDamage()));
                
                if (itemStack.hasTagCompound()) {
                    entityItem.getEntityItem().setTagCompound((NBTTagCompound)itemStack.getTagCompound().copy());
                }

                float factor = 0.05F;
                entityItem.motionX = (this.rand.nextGaussian() * factor);
                entityItem.motionY = (this.rand.nextGaussian() * factor + 0.2F);
                entityItem.motionZ = (this.rand.nextGaussian() * factor);
                world.spawnEntityInWorld(entityItem);
                itemStack.stackSize = 0;
            }
        }
    }

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileNanoTable();
	}
	
}

 
