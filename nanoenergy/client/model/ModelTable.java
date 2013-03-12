package nanoenergy.client.model;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTable extends ModelBase
{
	//fields
	ModelRenderer Base;
	ModelRenderer Base2;
	ModelRenderer Leg1;
	ModelRenderer Leg2;
	ModelRenderer Leg4;
	ModelRenderer Leg3;
	ModelRenderer Middle;
	ModelRenderer Top;
	ModelRenderer TopSide1;
	ModelRenderer TopSide2;
	ModelRenderer TopSide3;
	ModelRenderer TopSide4;
	ModelRenderer TopMiddle1;
	ModelRenderer TopMiddle2;
	ModelRenderer TopMiddle3;
	ModelRenderer TopMiddle4;
	ModelRenderer TopCube;
	private static final Random random = new Random();

	public ModelTable()
	{
		textureWidth = 128;
	    textureHeight = 64;
	    
	      Base = new ModelRenderer(this, 0, 0);
	      Base.addBox(0F, 0F, 0F, 16, 2, 16);
	      Base.setRotationPoint(-8F, 22F, -8F);
	      Base.setTextureSize(128, 64);
	      Base.mirror = true;
	      setRotation(Base, 0F, 0F, 0F);
	      Base2 = new ModelRenderer(this, 71, 0);
	      Base2.addBox(0F, 0F, 0F, 14, 3, 14);
	      Base2.setRotationPoint(-7F, 19F, -7F);
	      Base2.setTextureSize(128, 64);
	      Base2.mirror = true;
	      setRotation(Base2, 0F, 0F, 0F);
	      Leg1 = new ModelRenderer(this, 64, 0);
	      Leg1.addBox(0F, 0F, 0F, 1, 12, 1);
	      Leg1.setRotationPoint(7F, 10F, 7F);
	      Leg1.setTextureSize(128, 64);
	      Leg1.mirror = true;
	      setRotation(Leg1, 0F, 0F, 0F);
	      Leg2 = new ModelRenderer(this, 64, 0);
	      Leg2.addBox(0F, 0F, 0F, 1, 12, 1);
	      Leg2.setRotationPoint(7F, 10F, -8F);
	      Leg2.setTextureSize(128, 64);
	      Leg2.mirror = true;
	      setRotation(Leg2, 0F, 0F, 0F);
	      Leg4 = new ModelRenderer(this, 64, 0);
	      Leg4.addBox(0F, 0F, 0F, 1, 12, 1);
	      Leg4.setRotationPoint(-8F, 10F, 7F);
	      Leg4.setTextureSize(128, 64);
	      Leg4.mirror = true;
	      setRotation(Leg4, 0F, 0F, 0F);
	      Leg3 = new ModelRenderer(this, 64, 0);
	      Leg3.addBox(0F, 0F, 0F, 1, 12, 1);
	      Leg3.setRotationPoint(-8F, 10F, -8F);
	      Leg3.setTextureSize(128, 64);
	      Leg3.mirror = true;
	      setRotation(Leg3, 0F, 0F, 0F);
	      Middle = new ModelRenderer(this, 0, 51);
	      Middle.addBox(0F, 0F, 0F, 3, 9, 3);
	      Middle.setRotationPoint(-1.5F, 10F, -1.5F);
	      Middle.setTextureSize(128, 64);
	      Middle.mirror = true;
	      setRotation(Middle, 0F, 0F, 0F);
	      Top = new ModelRenderer(this, 56, 18);
	      Top.addBox(0F, 0F, 0F, 16, 1, 16);
	      Top.setRotationPoint(-8F, 9F, -8F);
	      Top.setTextureSize(128, 64);
	      Top.mirror = true;
	      setRotation(Top, 0F, 0F, 0F);
	      TopSide1 = new ModelRenderer(this, 24, 34);
	      TopSide1.addBox(0F, 0F, 0F, 1, 1, 16);
	      TopSide1.setRotationPoint(7F, 8F, -8F);
	      TopSide1.setTextureSize(128, 64);
	      TopSide1.mirror = true;
	      setRotation(TopSide1, 0F, 0F, 0F);
	      TopSide2 = new ModelRenderer(this, 24, 34);
	      TopSide2.addBox(-8F, 4F, -8F, 1, 1, 16);
	      TopSide2.setRotationPoint(0F, 4F, 0F);
	      TopSide2.setTextureSize(128, 64);
	      TopSide2.mirror = true;
	      setRotation(TopSide2, 0F, 0F, 0F);
	      TopSide3 = new ModelRenderer(this, 0, 34);
	      TopSide3.addBox(0F, 0F, 0F, 14, 1, 1);
	      TopSide3.setRotationPoint(-7F, 8F, 7F);
	      TopSide3.setTextureSize(128, 64);
	      TopSide3.mirror = true;
	      setRotation(TopSide3, 0F, 0F, 0F);
	      TopSide4 = new ModelRenderer(this, 0, 34);
	      TopSide4.addBox(0F, 0F, 0F, 14, 1, 1);
	      TopSide4.setRotationPoint(-7F, 8F, -8F);
	      TopSide4.setTextureSize(128, 64);
	      TopSide4.mirror = true;
	      setRotation(TopSide4, 0F, 0F, 0F);
	      TopMiddle1 = new ModelRenderer(this, 12, 55);
	      TopMiddle1.addBox(0F, 0F, 0F, 1, 1, 3);
	      TopMiddle1.setRotationPoint(0.5F, 8F, -1.5F);
	      TopMiddle1.setTextureSize(128, 64);
	      TopMiddle1.mirror = true;
	      setRotation(TopMiddle1, 0F, 0F, 0F);
	      TopMiddle2 = new ModelRenderer(this, 12, 55);
	      TopMiddle2.addBox(0F, 0F, 0F, 1, 1, 3);
	      TopMiddle2.setRotationPoint(-1.5F, 8F, -1.5F);
	      TopMiddle2.setTextureSize(128, 64);
	      TopMiddle2.mirror = true;
	      setRotation(TopMiddle2, 0F, 0F, 0F);
	      TopMiddle3 = new ModelRenderer(this, 12, 51);
	      TopMiddle3.addBox(0F, 0F, 0F, 1, 1, 1);
	      TopMiddle3.setRotationPoint(-0.5F, 8F, 0.5F);
	      TopMiddle3.setTextureSize(128, 64);
	      TopMiddle3.mirror = true;
	      setRotation(TopMiddle3, 0F, 0F, 0F);
	      TopMiddle4 = new ModelRenderer(this, 12, 51);
	      TopMiddle4.addBox(0F, 0F, 0F, 1, 1, 1);
	      TopMiddle4.setRotationPoint(-0.5F, 8F, -1.5F);
	      TopMiddle4.setTextureSize(128, 64);
	      TopMiddle4.mirror = true;
	      setRotation(TopMiddle4, 0F, 0F, 0F);
	      TopCube = new ModelRenderer(this, 0, 0);
	      TopCube.addBox(0F, 0F, 0F, 2, 2, 2);
	      TopCube.setRotationPoint(-1.5F, 5.5F, -1.3F);
	      TopCube.setTextureSize(128, 64);
	      TopCube.mirror = true;
	      setRotation(TopCube, 0.8552113F, 0.4363323F, 0.5759587F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Base.render(f5);
	    Base2.render(f5);
	    Leg1.render(f5);
	    Leg2.render(f5);
	    Leg4.render(f5);
	    Leg3.render(f5);
	    Middle.render(f5);
	    Top.render(f5);
	    TopSide1.render(f5);
	    TopSide2.render(f5);
	    TopSide3.render(f5);
	    TopSide4.render(f5);
	    TopMiddle1.render(f5);
	    TopMiddle2.render(f5);
	    TopMiddle3.render(f5);
	    TopMiddle4.render(f5);
	    TopCube.render(f5);
		/* GL11.glPushMatrix();
	GL11.glTranslated(0.5f, 1.05f, 0.5f);
	GL11.glTranslated(0, 0.02f * Math.sin(angle * 3), 0);
	// GLRotate uses degrees instead of radians for some reason grr
	GL11.glRotatef((float) (angle * 57.2957795131), 0.0f, 1.0f, 0.0f);
	GL11.glRotatef(45f, 1.0f, 0.0f, 0.0f);
	// arctangent of 0.5.
	GL11.glRotatef(35.2643897f, 0, 1, 1);
	// cube.render(0.0625f);
	TopCube.render(0.015625f);
	// cube.render(0.016000f);
	GL11.glPopMatrix();*/
	}
	public void doRender(Entity entity, double x, double y, double z, float f,
			float f1)
	{
		int timestep = (int) ((System.currentTimeMillis()) % 10000);
		double angle = timestep * Math.PI / 5000.0;
		f = 0.0625F;
		Base.render(f);
		Base2.render(f);
		Leg1.render(f);
		Leg2.render(f);
		Leg4.render(f);
		Leg3.render(f);
		Top.render(f);
		TopSide1.render(f);
		TopSide2.render(f);
		TopSide3.render(f);
		TopSide4.render(f);
		TopMiddle1.render(f);
		TopMiddle2.render(f);
		TopMiddle3.render(f);
		TopMiddle4.render(f);
		Middle.render(f);
		GL11.glPushMatrix();
		GL11.glTranslated(0f, 0.35f, 0f);
		GL11.glScalef(1F, 1F, 1F);
		GL11.glTranslated(0, 0.02f * Math.sin(angle * 3), 0);
		// GLRotate uses degrees instead of radians for some reason grr
		GL11.glRotatef((float) (angle * 57.2957795131), 0.0f, 1.0f, 0.0f);
		GL11.glRotatef(45f, 1.0f, 0.0f, 0.0f);
		// arctangent of 0.5.
		GL11.glRotatef(35.2643897f, 0, 1, 1);
		// cube.render(0.0625f);
		TopCube.render(f / 3.0f);
		// cube.render(0.016000f);
		GL11.glPopMatrix();
	}
	private void drawScanLine(double angle) {
		float xtarg = random.nextFloat();
		float ytarg = random.nextFloat();
		GL11.glLineWidth(2);
		GL11.glBegin(GL11.GL_LINES);
		GL11.glColor4d(0.0, 1.0, 0.2, 1.0);
		GL11.glVertex3d(0.5, 1.05 + 0.02f * Math.sin(angle * 3), 0.5);
		GL11.glVertex3d(xtarg, 1.2f, ytarg);
		GL11.glEnd();
		// MuseRenderer.drawGradientRect3D(
		// Vec3.createVectorHelper(Math.floor(xtarg * 16.0) / 16.0, 1.201,
		// Math.floor(ytarg * 16.0) / 16.0),
		// Vec3.createVectorHelper(1.0 / 16.0, 0, 1.0 / 16.0),
		// new Colour(0.0f, 1.0f, 0.0f, 0.4f),
		// new Colour(0.0f, 1.0f, 0.0f, 0.4f));
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
