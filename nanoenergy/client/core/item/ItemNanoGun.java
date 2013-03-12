package nanoenergy.client.core.item;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;
import nanoenergy.client.core.entity.EntityBullet;
import nanoenergy.common.NanoEnergy;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemNanoGun extends ItemTool {
	
	EntityBullet bullet = new EntityBullet(null);
	public ItemNanoGun(int id, int texture) {
		super(id, 0, EnumToolMaterial.EMERALD, new Block[0]); //Returns super constructor: par1 is ID
		this.setMaxStackSize(1);
		this.setTextureFile("/nanoenergy/items.png"); //Sets the item texture file
		this.setItemName("nanogun"); //Sets the incode name of the item, make sure it doesn't clash with other items, weird stuff happens
		this.setCreativeTab(NanoEnergy.tabNanoEnergy); //Tells the game what creative mode tab it goes in
		this.setIconIndex(texture);
	}
	
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityplayer)
	{
		if (!world.isRemote)
        {
			bullet.setVelocity(100, 100, 100);
			
                        Vec3 look = entityplayer.getLookVec();
                        EntityBullet fireball2 = new EntityBullet(world, 1, 1, 1);
                        fireball2.setPosition(
                                                        entityplayer.posX - .5 + look.xCoord,
                                                        entityplayer.posY + 1.5 + look.yCoord,
                                                        entityplayer.posZ - .5 + look.zCoord);
                        world.spawnEntityInWorld(fireball2);
        }
        return itemStack;
}
	}