// Date: 2/9/2013 7:51:57 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package nanoenergy.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.ForgeHooksClient;

public class ModelNanoGun extends ModelBase
{
	//fields
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape17;
	ModelRenderer Shape18;
	ModelRenderer Shape19;
	ModelRenderer Shape20;
	ModelRenderer Shape21;
	ModelRenderer Shape22;
	ModelRenderer Shape23;
	ModelRenderer Shape24;
	ModelRenderer Shape25;
	ModelRenderer Shape26;
	ModelRenderer Shape27;
	ModelRenderer Shape28;
	ModelRenderer Shape29;
	ModelRenderer Shape30;
	ModelRenderer Shape31;
	ModelRenderer Shape32;
	ModelRenderer Shape33;
	ModelRenderer Shape34;
	ModelRenderer Shape35;
	ModelRenderer Shape36;
	ModelRenderer Shape37;
	ModelRenderer Shape38;
	ModelRenderer Shape39;
	ModelRenderer Shape40;
	ModelRenderer Shape41;
	ModelRenderer Shape42;
	ModelRenderer Shape43;
	ModelRenderer Shape44;
	ModelRenderer Shape45;
	ModelRenderer Shape46;
	ModelRenderer Shape47;
	ModelRenderer Shape48;
	ModelRenderer Shape49;
	ModelRenderer Shape50;
	ModelRenderer Shape51;
	ModelRenderer Shape52;
	ModelRenderer Shape53;
	ModelRenderer Shape54;
	ModelRenderer Shape55;
	ModelRenderer Shape56;
	ModelRenderer Shape57;

	public ModelNanoGun()
	{
		textureWidth = 256;
		textureHeight = 32;

		Shape3 = new ModelRenderer(this, 54, 0);
		Shape3.addBox(-22F, -7F, -1F, 10, 1, 2);
		Shape3.setRotationPoint(0F, 0F, 0F);
		Shape3.setTextureSize(256, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 26, 0);
		Shape4.addBox(-22F, -6F, -2F, 10, 4, 4);
		Shape4.setRotationPoint(0F, 0F, 0F);
		Shape4.setTextureSize(256, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 54, 3);
		Shape5.addBox(-22F, -5F, 2F, 10, 2, 1);
		Shape5.setRotationPoint(0F, 0F, 0F);
		Shape5.setTextureSize(256, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 54, 0);
		Shape6.addBox(-22F, -2F, -1F, 10, 1, 2);
		Shape6.setRotationPoint(0F, 0F, 0F);
		Shape6.setTextureSize(256, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 54, 3);
		Shape7.addBox(-22F, -5F, -3F, 10, 2, 1);
		Shape7.setRotationPoint(0F, 0F, 0F);
		Shape7.setTextureSize(256, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 114, 0);
		Shape8.addBox(-25F, -5.5F, -1.5F, 2, 3, 3);
		Shape8.setRotationPoint(0F, 0F, 0F);
		Shape8.setTextureSize(256, 32);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 28, 28);
		Shape9.addBox(-3F, -2.5F, -1F, 5, 2, 2);
		Shape9.setRotationPoint(0F, 0F, 0F);
		Shape9.setTextureSize(256, 32);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0.3839724F);
		Shape10 = new ModelRenderer(this, 92, 0);
		Shape10.addBox(-23F, -1F, -2F, 1, 1, 4);
		Shape10.setRotationPoint(0F, 0F, 0F);
		Shape10.setTextureSize(256, 32);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 134, 0);
		Shape11.addBox(-25F, -5.5F, 1.5F, 2, 3, 1);
		Shape11.setRotationPoint(0F, 0F, 0F);
		Shape11.setTextureSize(256, 32);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 102, 0);
		Shape12.addBox(-23F, -6F, 3F, 1, 4, 1);
		Shape12.setRotationPoint(0F, 0F, 0F);
		Shape12.setTextureSize(256, 32);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 114, 27);
		Shape13.addBox(-12F, -6F, -4F, 4, 4, 1);
		Shape13.setRotationPoint(0F, 0F, 0F);
		Shape13.setTextureSize(256, 32);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 98, 27);
		Shape14.addBox(-12F, -8F, -2F, 4, 1, 4);
		Shape14.setRotationPoint(0F, 0F, 0F);
		Shape14.setTextureSize(256, 32);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 114, 27);
		Shape15.addBox(-12F, -6F, 3F, 4, 4, 1);
		Shape15.setRotationPoint(0F, 0F, 0F);
		Shape15.setTextureSize(256, 32);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 98, 27);
		Shape16.addBox(-12F, -1F, -2F, 4, 1, 4);
		Shape16.setRotationPoint(0F, 0F, 0F);
		Shape16.setTextureSize(256, 32);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 78, 0);
		Shape17.addBox(-23F, -7F, -3F, 1, 6, 6);
		Shape17.setRotationPoint(0F, 0F, 0F);
		Shape17.setTextureSize(256, 32);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape18 = new ModelRenderer(this, 92, 0);
		Shape18.addBox(-23F, -8F, -2F, 1, 1, 4);
		Shape18.setRotationPoint(0F, 0F, 0F);
		Shape18.setTextureSize(256, 32);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, 0F);
		Shape19 = new ModelRenderer(this, 124, 0);
		Shape19.addBox(-25F, -2.5F, -1.5F, 2, 1, 3);
		Shape19.setRotationPoint(0F, 0F, 0F);
		Shape19.setTextureSize(256, 32);
		Shape19.mirror = true;
		setRotation(Shape19, 0F, 0F, 0F);
		Shape20 = new ModelRenderer(this, 102, 0);
		Shape20.addBox(-23F, -6F, -4F, 1, 4, 1);
		Shape20.setRotationPoint(0F, 0F, 0F);
		Shape20.setTextureSize(256, 32);
		Shape20.mirror = true;
		setRotation(Shape20, 0F, 0F, 0F);
		Shape21 = new ModelRenderer(this, 134, 0);
		Shape21.addBox(-25F, -5.5F, -2.5F, 2, 3, 1);
		Shape21.setRotationPoint(0F, 0F, 0F);
		Shape21.setTextureSize(256, 32);
		Shape21.mirror = true;
		setRotation(Shape21, 0F, 0F, 0F);
		Shape22 = new ModelRenderer(this, 124, 0);
		Shape22.addBox(-25F, -6.5F, -1.5F, 2, 1, 3);
		Shape22.setRotationPoint(0F, 0F, 0F);
		Shape22.setTextureSize(256, 32);
		Shape22.mirror = true;
		setRotation(Shape22, 0F, 0F, 0F);
		Shape23 = new ModelRenderer(this, 0, 15);
		Shape23.addBox(-22F, -3F, 3F, 10, 1, 1);
		Shape23.setRotationPoint(0F, 0F, 0F);
		Shape23.setTextureSize(256, 32);
		Shape23.mirror = true;
		setRotation(Shape23, 0F, 0F, 0F);
		Shape24 = new ModelRenderer(this, 0, 15);
		Shape24.addBox(-22F, -8F, 1F, 10, 1, 1);
		Shape24.setRotationPoint(0F, 0F, 0F);
		Shape24.setTextureSize(256, 32);
		Shape24.mirror = true;
		setRotation(Shape24, 0F, 0F, 0F);
		Shape25 = new ModelRenderer(this, 0, 15);
		Shape25.addBox(-22F, -3F, -4F, 10, 1, 1);
		Shape25.setRotationPoint(0F, 0F, 0F);
		Shape25.setTextureSize(256, 32);
		Shape25.mirror = true;
		setRotation(Shape25, 0F, 0F, 0F);
		Shape26 = new ModelRenderer(this, 0, 15);
		Shape26.addBox(-22F, -8F, -2F, 10, 1, 1);
		Shape26.setRotationPoint(0F, 0F, 0F);
		Shape26.setTextureSize(256, 32);
		Shape26.mirror = true;
		setRotation(Shape26, 0F, 0F, 0F);
		Shape27 = new ModelRenderer(this, 42, 11);
		Shape27.addBox(-3F, -5F, -6.486667F, 1, 3, 4);
		Shape27.setRotationPoint(0F, 0F, 0F);
		Shape27.setTextureSize(256, 32);
		Shape27.mirror = true;
		setRotation(Shape27, 0.0872665F, 0F, 0F);
		Shape28 = new ModelRenderer(this, 78, 20);
		Shape28.addBox(-12F, -7F, -3F, 4, 6, 6);
		Shape28.setRotationPoint(0F, 0F, 0F);
		Shape28.setTextureSize(256, 32);
		Shape28.mirror = true;
		setRotation(Shape28, 0F, 0F, 0F);
		Shape29 = new ModelRenderer(this, 60, 23);
		Shape29.addBox(-7F, -5F, -12.48667F, 3, 3, 6);
		Shape29.setRotationPoint(0F, 0F, 0F);
		Shape29.setTextureSize(256, 32);
		Shape29.mirror = true;
		setRotation(Shape29, 0.0872665F, 0F, 0F);
		Shape30 = new ModelRenderer(this, 0, 28);
		Shape30.addBox(-3.5F, -7F, -6F, 1, 2, 2);
		Shape30.setRotationPoint(0F, 0F, 0F);
		Shape30.setTextureSize(256, 32);
		Shape30.mirror = true;
		setRotation(Shape30, 0F, 0F, 0F);
		Shape31 = new ModelRenderer(this, 42, 18);
		Shape31.addBox(-7F, -1F, -6.486667F, 3, 1, 4);
		Shape31.setRotationPoint(0F, 0F, 0F);
		Shape31.setTextureSize(256, 32);
		Shape31.mirror = true;
		setRotation(Shape31, 0.0872665F, 0F, 0F);
		Shape32 = new ModelRenderer(this, 42, 11);
		Shape32.addBox(-9F, -5F, -6.486667F, 1, 3, 4);
		Shape32.setRotationPoint(0F, 0F, 0F);
		Shape32.setTextureSize(256, 32);
		Shape32.mirror = true;
		setRotation(Shape32, 0.0872665F, 0F, 0F);
		Shape33 = new ModelRenderer(this, 42, 18);
		Shape33.addBox(-7F, -7F, 2.5F, 3, 1, 4);
		Shape33.setRotationPoint(0F, 0F, 0F);
		Shape33.setTextureSize(256, 32);
		Shape33.mirror = true;
		setRotation(Shape33, -0.0872665F, 0F, 0F);
		Shape34 = new ModelRenderer(this, 42, 23);
		Shape34.addBox(-8F, -6F, 2.5F, 5, 5, 4);
		Shape34.setRotationPoint(0F, 0F, 0F);
		Shape34.setTextureSize(256, 32);
		Shape34.mirror = true;
		setRotation(Shape34, -0.0872665F, 0F, 0F);
		Shape35 = new ModelRenderer(this, 42, 11);
		Shape35.addBox(-3F, -5F, 2.5F, 1, 3, 4);
		Shape35.setRotationPoint(0F, 0F, 0F);
		Shape35.setTextureSize(256, 32);
		Shape35.mirror = true;
		setRotation(Shape35, -0.0872665F, 0F, 0F);
		Shape36 = new ModelRenderer(this, 42, 11);
		Shape36.addBox(-9F, -5F, 2.5F, 1, 3, 4);
		Shape36.setRotationPoint(0F, 0F, 0F);
		Shape36.setTextureSize(256, 32);
		Shape36.mirror = true;
		setRotation(Shape36, -0.0872665F, 0F, 0F);
		Shape37 = new ModelRenderer(this, 42, 18);
		Shape37.addBox(-7F, -1F, 2.5F, 3, 1, 4);
		Shape37.setRotationPoint(0F, 0F, 0F);
		Shape37.setTextureSize(256, 32);
		Shape37.mirror = true;
		setRotation(Shape37, -0.0872665F, 0F, 0F);
		Shape38 = new ModelRenderer(this, 42, 23);
		Shape38.addBox(-8F, -6F, -6.486667F, 5, 5, 4);
		Shape38.setRotationPoint(0F, 0F, 0F);
		Shape38.setTextureSize(256, 32);
		Shape38.mirror = true;
		setRotation(Shape38, 0.0872665F, 0F, 0F);
		Shape39 = new ModelRenderer(this, 0, 0);
		Shape39.addBox(-8F, -7.5F, -3.5F, 6, 8, 7);
		Shape39.setRotationPoint(0F, 0F, 0F);
		Shape39.setTextureSize(256, 32);
		Shape39.mirror = true;
		setRotation(Shape39, 0F, 0F, 0F);
		Shape40 = new ModelRenderer(this, 6, 26);
		Shape40.addBox(5F, -2F, -1F, 4, 4, 2);
		Shape40.setRotationPoint(0F, 0F, 0F);
		Shape40.setTextureSize(256, 32);
		Shape40.mirror = true;
		setRotation(Shape40, 0F, 0F, 0F);
		Shape41 = new ModelRenderer(this, 26, 8);
		Shape41.addBox(-2F, -6.5F, -2.5F, 2, 6, 5);
		Shape41.setRotationPoint(0F, 0F, 0F);
		Shape41.setTextureSize(256, 32);
		Shape41.mirror = true;
		setRotation(Shape41, 0F, 0F, 0F);
		Shape42 = new ModelRenderer(this, 18, 27);
		Shape42.addBox(2F, -2F, -1F, 3, 3, 2);
		Shape42.setRotationPoint(0F, 0F, 0F);
		Shape42.setTextureSize(256, 32);
		Shape42.mirror = true;
		setRotation(Shape42, 0F, 0F, 0F);
		Shape43 = new ModelRenderer(this, 0, 17);
		Shape43.addBox(-19.5F, -19.5F, 0F, 1, 5, 0);
		Shape43.setRotationPoint(0F, 0F, 0F);
		Shape43.setTextureSize(256, 32);
		Shape43.mirror = true;
		setRotation(Shape43, 0F, 0F, -0.3490659F);
		Shape44 = new ModelRenderer(this, 106, 0);
		Shape44.addBox(-24F, -8.5F, -0.5F, 3, 2, 1);
		Shape44.setRotationPoint(0F, 0F, 0F);
		Shape44.setTextureSize(256, 32);
		Shape44.mirror = true;
		setRotation(Shape44, 0F, 0F, 0F);
		Shape45 = new ModelRenderer(this, 0, 17);
		Shape45.addBox(-18F, -19.5F, -0.5F, 1, 5, 1);
		Shape45.setRotationPoint(0F, 0F, 0F);
		Shape45.setTextureSize(256, 32);
		Shape45.mirror = true;
		setRotation(Shape45, 0F, 0F, -0.3490659F);
		Shape46 = new ModelRenderer(this, 0, 17);
		Shape46.addBox(-20.5F, -2.5F, 10.5F, 1, 0, 6);
		Shape46.setRotationPoint(0F, 0F, 0F);
		Shape46.setTextureSize(256, 32);
		Shape46.mirror = true;
		setRotation(Shape46, -0.6981317F, -0.3490659F, 0.3490659F);
		Shape47 = new ModelRenderer(this, 106, 0);
		Shape47.addBox(-24F, -1F, 2.5F, 3, 3, 1);
		Shape47.setRotationPoint(0F, 0F, 0F);
		Shape47.setTextureSize(256, 32);
		Shape47.mirror = true;
		setRotation(Shape47, 0.8726646F, 0F, 0F);
		Shape48 = new ModelRenderer(this, 0, 17);
		Shape48.addBox(-19F, -3F, 10.5F, 1, 1, 6);
		Shape48.setRotationPoint(0F, 0F, 0F);
		Shape48.setTextureSize(256, 32);
		Shape48.mirror = true;
		setRotation(Shape48, -0.6981317F, -0.3490659F, 0.3490659F);
		Shape49 = new ModelRenderer(this, 0, 17);
		Shape49.addBox(-20.5F, -2.5F, -16.5F, 1, 0, 6);
		Shape49.setRotationPoint(0F, 0F, 0F);
		Shape49.setTextureSize(256, 32);
		Shape49.mirror = true;
		setRotation(Shape49, 0.6981317F, 0.3490659F, 0.3471036F);
		Shape50 = new ModelRenderer(this, 0, 17);
		Shape50.addBox(-19F, -3F, -16.5F, 1, 1, 6);
		Shape50.setRotationPoint(0F, 0F, 0F);
		Shape50.setTextureSize(256, 32);
		Shape50.mirror = true;
		setRotation(Shape50, 0.6981317F, 0.3490659F, 0.3471036F);
		Shape51 = new ModelRenderer(this, 0, 17);
		Shape51.addBox(-24F, -3F, -17.5F, 5, 1, 1);
		Shape51.setRotationPoint(0F, 0F, 0F);
		Shape51.setTextureSize(256, 32);
		Shape51.mirror = true;
		setRotation(Shape51, 0.6981317F, 0.3490659F, 0.3471036F);
		Shape52 = new ModelRenderer(this, 106, 0);
		Shape52.addBox(-24F, -1F, -3.5F, 3, 3, 1);
		Shape52.setRotationPoint(0F, 0F, 0F);
		Shape52.setTextureSize(256, 32);
		Shape52.mirror = true;
		setRotation(Shape52, -0.8726646F, 0F, 0F);
		Shape53 = new ModelRenderer(this, 0, 17);
		Shape53.addBox(-23F, -20.5F, -0.5F, 5, 1, 1);
		Shape53.setRotationPoint(0F, 0F, 0F);
		Shape53.setTextureSize(256, 32);
		Shape53.mirror = true;
		setRotation(Shape53, 0F, 0F, -0.3490659F);
		Shape54 = new ModelRenderer(this, 0, 17);
		Shape54.addBox(-24F, -3F, 16.5F, 5, 1, 1);
		Shape54.setRotationPoint(0F, 0F, 0F);
		Shape54.setTextureSize(256, 32);
		Shape54.mirror = true;
		setRotation(Shape54, -0.6981317F, -0.3490659F, 0.3490659F);
		Shape55 = new ModelRenderer(this, 42, 18);
		Shape55.addBox(-7F, -7F, -6.486667F, 3, 1, 4);
		Shape55.setRotationPoint(0F, 0F, 0F);
		Shape55.setTextureSize(256, 32);
		Shape55.mirror = true;
		setRotation(Shape55, 0.0872665F, 0F, 0F);
		Shape56 = new ModelRenderer(this, 0, 15);
		Shape56.addBox(-22F, -6F, 3F, 10, 1, 1);
		Shape56.setRotationPoint(0F, 0F, 0F);
		Shape56.setTextureSize(256, 32);
		Shape56.mirror = true;
		setRotation(Shape56, 0F, 0F, 0F);
		Shape57 = new ModelRenderer(this, 0, 15);
		Shape57.addBox(-22F, -6F, -4F, 10, 1, 1);
		Shape57.setRotationPoint(0F, 0F, 0F);
		Shape57.setTextureSize(256, 32);
		Shape57.mirror = true;
		setRotation(Shape57, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
		Shape15.render(f5);
		Shape16.render(f5);
		Shape17.render(f5);
		Shape18.render(f5);
		Shape19.render(f5);
		Shape20.render(f5);
		Shape21.render(f5);
		Shape22.render(f5);
		Shape23.render(f5);
		Shape24.render(f5);
		Shape25.render(f5);
		Shape26.render(f5);
		Shape27.render(f5);
		Shape28.render(f5);
		Shape29.render(f5);
		Shape30.render(f5);
		Shape31.render(f5);
		Shape32.render(f5);
		Shape33.render(f5);
		Shape34.render(f5);
		Shape35.render(f5);
		Shape36.render(f5);
		Shape37.render(f5);
		Shape38.render(f5);
		Shape39.render(f5);
		Shape40.render(f5);
		Shape41.render(f5);
		Shape42.render(f5);
		Shape43.render(f5);
		Shape44.render(f5);
		Shape45.render(f5);
		Shape46.render(f5);
		Shape47.render(f5);
		Shape48.render(f5);
		Shape49.render(f5);
		Shape50.render(f5);
		Shape51.render(f5);
		Shape52.render(f5);
		Shape53.render(f5);
		Shape54.render(f5);
		Shape55.render(f5);
		Shape56.render(f5);
		Shape57.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
	}

}