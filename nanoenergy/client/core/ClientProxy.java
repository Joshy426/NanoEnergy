package nanoenergy.client.core;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import nanoenergy.client.core.entity.EntityBullet;
import nanoenergy.client.core.tileentity.TileNanoTable;
import nanoenergy.client.gui.GuiCalcinator;
import nanoenergy.client.render.ItemRenderGun;
import nanoenergy.client.render.RenderBullet;
import nanoenergy.client.render.RenderTable;
import nanoenergy.client.render.tileentity.TileEntityCalcinatorRenderer;
import nanoenergy.common.NanoEnergy;
import nanoenergy.common.core.CommonProxy;
import nanoenergy.lib.GuiIds;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
public class ClientProxy extends CommonProxy {
	
	public void initMod()
	{
		super.initMod();
		MinecraftForgeClient.registerItemRenderer(NanoEnergy.nanogun.itemID, (IItemRenderer)new ItemRenderGun());
		RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new RenderBullet());
		NanoEnergy.modelID = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(new RenderTable(NanoEnergy.modelID));
		ClientRegistry.bindTileEntitySpecialRenderer(TileNanoTable.class, new RenderTable(NanoEnergy.modelID));
		//RenderingRegistry.registerBlockHandler(new TileEntityCalcinatorRenderer());
		//MinecraftForgeClient.registerItemRenderer(235, new ItemCalcinatorRender());
		//ClientRegistry.bindTileEntitySpecialRenderer(TileCalcinator.class, new TileEntityCalcinatorRenderer());
		

	}
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == GuiIds.NANOTABLE) {
	        TileNanoTable tileNanoTable = (TileNanoTable) world.getBlockTileEntity(x, y, z);
	        return new GuiCalcinator(player.inventory, tileNanoTable);
	    }

	    return null;
	}
	
	
        
public void registerRenderInformation(){
	MinecraftForgeClient.preloadTexture("/nanoenergy/items.png");
	
}

}
