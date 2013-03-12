package nanoenergy.client.render;


import nanoenergy.client.core.entity.EntityBullet;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

// Referenced classes of package net.minecraft.src:
//            Render, Entitylaser, Tessellator, MathHelper, 
//            Entity

public class RenderBullet extends Render
{

    public RenderBullet()
    {
    }

    public void renderLaser(EntityBullet entitylaser, double d, double d1, double d2, 
            float f, float f1)
    {
        if(entitylaser.prevRotationYaw == 0.0F && entitylaser.prevRotationPitch == 0.0F)
        {
            return;
        }
        loadTexture("/nanoenergy/bullet.png");
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef((entitylaser.prevRotationYaw + (entitylaser.rotationYaw - entitylaser.prevRotationYaw) * f1) - 90F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(entitylaser.prevRotationPitch + (entitylaser.rotationPitch - entitylaser.prevRotationPitch) * f1, 0.0F, 0.0F, 1.0F);
        Tessellator tessellator = Tessellator.instance;
        int i = 0;
        float f2 = 0.0F;
        float f3 = 0.5F;
        float f4 = (float)(0 + i * 10) / 32F;
        float f5 = (float)(5 + i * 10) / 32F;
        float f6 = 0.0F;
        float f7 = 0.15625F;
        float f8 = (float)(5 + i * 10) / 32F;
        float f9 = (float)(10 + i * 10) / 32F;
        float f10 = 0.05625F;
        float f11 = 21 / 32F;
        float f12 = 2 / 32F;
        GL11.glEnable(32826 /*GL_RESCALE_NORMAL_EXT*/);
        GL11.glScalef(f10, f10, f10);
        GL11.glNormal3f(f10, 0.0F, 0.0F);
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(0D, -2D, -2D, f6, f8);
        tessellator.addVertexWithUV(0D, -2D, 2D, f7, f8);
        tessellator.addVertexWithUV(0D, 2D, 2D, f7, f9);
        tessellator.addVertexWithUV(0D, 2D, -2D, f6, f9);
        tessellator.draw();
        for(int j = 0; j <= 4; j++)
        {
            GL11.glRotatef(90F, 1.0F, 0.0F, 0.0F);
            GL11.glNormal3f(0.0F, 0.0F, f10);
            tessellator.startDrawingQuads();
            tessellator.addVertexWithUV(0D, -2D, 2D, f2, f4);
            tessellator.addVertexWithUV(50D, -2D, 2D, f3, f4);
            tessellator.addVertexWithUV(50D, 2D, 2D, f3, f5);
            tessellator.addVertexWithUV(0D, 2D, 2D, f2, f5);
            tessellator.draw();
        }
        
        for(int j = 0; j <= 4; j++)
        {
            GL11.glRotatef(90F, 1.0F, 0.0F, 0.0F);
            GL11.glNormal3f(0.0F, 0.0F, f10);
            tessellator.startDrawing(5);
            tessellator.addVertexWithUV(50D, 2D, -2D, f3, f4);
            tessellator.addVertexWithUV(50D, 2D, 2D, f3, f5);
            tessellator.addVertexWithUV(70D, 0D, 0D, f11, f12);
            tessellator.draw();
        }


        GL11.glDisable(32826 /*GL_RESCALE_NORMAL_EXT*/);
        GL11.glPopMatrix();
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	renderLaser((EntityBullet)entity, d, d1, d2, f, f1);
    }
}