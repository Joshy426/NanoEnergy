package nanoenergy.client.render;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import nanoenergy.client.model.ModelTable;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.ForgeHooksClient;

public class RenderTable extends TileEntitySpecialRenderer implements
	ISimpleBlockRenderingHandler {
	
protected ModelTable model;
protected int renderId;

public RenderTable(int renderId) {
	model = new ModelTable();
	this.renderId = renderId;
}

@Override
public void renderTileEntityAt(TileEntity tileEntity, double x, double y,
		double z, float partialTickTime) {
	ForgeHooksClient.bindTexture("/nanoenergy/nanotable.png", 0);
	int rotation = 0;
	GL11.glPushMatrix();
	GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
	GL11.glScalef(1.0F, -1F, -1F);
	GL11.glRotatef(rotation*90, 0.0F, 1.0F, 0.0F);
	model.doRender(null, x, y, z, partialTickTime, partialTickTime);
	GL11.glPopMatrix(); //end
	}

@Override
public void renderInventoryBlock(Block block, int metadata, int modelID,
		RenderBlocks renderer) {
	ForgeHooksClient.bindTexture("/nanoenergy/nanotable.png", 0);
	int rotation = 0;
	GL11.glPushMatrix();
	GL11.glTranslatef((float)0.5F, (float)1.5F, (float)0.5F);
	GL11.glScalef(1.0F, -1F, -1F);
	GL11.glRotatef(rotation*90, 0.0F, 1.0F, 0.0F);
	model.doRender(null, 0, 0, 0, 0, 0);
	GL11.glPopMatrix();

}

// Should do nothing since the tile entity handles all the rendering of the
// world block
@Override
public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
		Block block, int modelId, RenderBlocks renderer) {
	return true;
}

@Override
public boolean shouldRender3DInInventory() {
	return true;
}

@Override
public int getRenderId() {
	return renderId;
}
}
