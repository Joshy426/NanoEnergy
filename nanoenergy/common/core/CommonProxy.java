package nanoenergy.common.core;

import java.util.Map;

import com.pahimar.ee3.client.gui.inventory.GuiPortableCrafting;
import com.pahimar.ee3.client.gui.inventory.GuiPortableTransmutation;
import com.pahimar.ee3.tileentity.TileCalcinator;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.potion.Potion;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import nanoenergy.client.core.block.ModBlocks;
import nanoenergy.client.core.entity.EntityBullet;
import nanoenergy.client.core.item.ItemNanoGun;
import nanoenergy.client.core.tileentity.TileNanoTable;
import nanoenergy.client.gui.GuiCalcinator;
import nanoenergy.common.NanoEnergy;
import nanoenergy.inventory.ContainerCalcinator;
import nanoenergy.lib.GuiIds;
import nanoenergy.lib.Strings;

public class CommonProxy implements IGuiHandler{ //THIS IS IMPORTANT, CANNOT BE A PROXY/GUI HANDLER WITHOUT THIS!!
public void registerRenderInformation() //Client side texture registering
{
}
@Override
public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { //For GUI's
	TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
	if (ID == GuiIds.NANOTABLE) {
        TileNanoTable calcinator = (TileNanoTable) world.getBlockTileEntity(x, y, z);
        return new ContainerCalcinator(player.inventory, calcinator);
    }

    return null;
}


public void registerTiles(){ //For registering TileEntities
	
}
public void registerBlocks(){ //For registering Blocks
}
public void registerEntity() {
	
}
public void initTileEntities() {
GameRegistry.registerTileEntity(TileNanoTable.class, Strings.TE_TABLE_NAME);
}
public void addNames(){ //For adding Item's ingame names
	LanguageRegistry.addName(NanoEnergy.nanochip, "Nano Chip");
	LanguageRegistry.addName(NanoEnergy.siliconchunk, "Silicon Chunk");
	LanguageRegistry.addName(NanoEnergy.siliconplate, "Silicon Plate");
	LanguageRegistry.addName(NanoEnergy.nanogun, "Nano Gun");
	LanguageRegistry.addName(NanoEnergy.blockTable, "Test Model");
}
public void addRecipes(){ //For adding your Item's recipes
	
}
public void initMod() {
	EntityRegistry.registerModEntity(EntityBullet.class, "nanoenergy_entitybullet", 82, NanoEnergy.instance, 160, 1, true);
	
		}
@Override
public Object getClientGuiElement(int ID, EntityPlayer player, World world,
		int x, int y, int z) {
	// TODO Auto-generated method stub
	return null;
}
}
