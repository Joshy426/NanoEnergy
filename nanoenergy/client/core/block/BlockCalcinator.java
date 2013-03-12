package nanoenergy.client.core.block;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;

import nanoenergy.client.core.tileentity.TileNanoTable;
import nanoenergy.common.NanoEnergy;
import nanoenergy.lib.GuiIds;
import nanoenergy.lib.Strings;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;

/**
 * BlockCalcinator
 * 
 * Block class for the Calcinator
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class BlockCalcinator extends BlockNE {

    /**
     * Is the random generator used by calcinator to drop the inventory contents in random directions.
     */
    private Random rand = new Random();
    
    public BlockCalcinator(int id) {

        super(id, Material.rock);
        this.setBlockName(Strings.CALCINATOR_NAME);
        this.setCreativeTab(NanoEnergy.tabNanoEnergy);
        this.setHardness(5F);
        GameRegistry.registerBlock(this, "calcinator");
        GameRegistry.registerTileEntity(TileNanoTable.class,
				"calcinator");
    }

    @Override
    public TileEntity createNewTileEntity(World world) {

        return new TileNanoTable();
    }

    @Override
    public boolean renderAsNormalBlock() {

        return false;
    }

    @Override
    public boolean isOpaqueCube() {

        return false;
    }

    @Override
    public int getRenderType() {

        return 38;
    }

    @Override
    public int getBlockTextureFromSide(int par1) {

        return 1;
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, int id, int meta) {
        dropInventory(world, x, y, z);
        super.breakBlock(world, x, y, z, id, meta);
        
    }
    
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {

        if (!world.isRemote) {
            TileNanoTable tileCalcinator = (TileNanoTable) world.getBlockTileEntity(x, y, z);

            if (tileCalcinator != null) {
                player.openGui(NanoEnergy.instance, GuiIds.NANOTABLE, world, x, y, z);
            }
        }

        return true;

    }
    
    private void dropInventory(World world, int x, int y, int z) {
    	NanoEnergy energy = new NanoEnergy();
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
}