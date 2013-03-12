package nanoenergy.client.render;

import org.lwjgl.opengl.GL11;

import nanoenergy.client.model.ModelNanoGun;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderGun 
	implements IItemRenderer
{
	protected ModelNanoGun modelNanoGun;
	
	public ItemRenderGun()
	{
		modelNanoGun = new ModelNanoGun();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		switch(type)
		{
		case EQUIPPED:
			return true;
			default: 
				return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper)
	{
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		switch(type) {
		case EQUIPPED:
		{
			GL11.glPushMatrix();
			ForgeHooksClient.bindTexture("/nanoenergy/ng_skin.png", 0);
			
			GL11.glRotatef(0F, 0.0F, 0.0F, -60.0F);
			GL11.glRotatef(-360F, 0.300F, 1.0F, 0.600F);
			GL11.glRotatef(-135F, 0.0F, 0.0F, 1.0F);
			
			boolean isFirstPerson = false;
			
			if(data[1] != null && data[1] instanceof EntityPlayer)
			{
				if(!((EntityPlayer)data[1] == Minecraft.getMinecraft().renderViewEntity && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && !((Minecraft.getMinecraft().currentScreen instanceof GuiInventory || Minecraft.getMinecraft().currentScreen instanceof GuiContainerCreative) && RenderManager.instance.playerViewY == 180.0F)))
				{
					GL11.glTranslatef(-0.48F, 0.40F, -0.045F);
				}
				else 
				{
					isFirstPerson = true;
					GL11.glTranslatef(-0.300F, 0.0F, 0.0F);
				}
			}
			else
			{
				GL11.glTranslatef(-0.48F, 0.40F, -0.045F);
			}
			
			
			
			
			float scale = 0.685F;
			
			GL11.glScalef(scale, scale, scale);
			
			modelNanoGun.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			
			ForgeHooksClient.unbindTexture();
			
			GL11.glPopMatrix();
		}
		default:
			break;
		}
	}

}
