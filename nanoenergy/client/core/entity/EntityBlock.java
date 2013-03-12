package nanoenergy.client.core.entity;

import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.world.World;

public class EntityBlock extends Entity
{
 public int age;
  public int xOri;
  public int yOri;
  public int zOri;
  public TileEntityEnderChest tileEntity;
  public boolean dummy;

  public EntityBlock(World world)
  {
    super(world);
    this.age = 0;
    this.xOri = 0;
    this.yOri = 0;
    this.zOri = 0;

    this.tileEntity = null;

    this.dummy = false;

    this.renderDistanceWeight = 10.0D;
    this.preventEntitySpawning = true;
    this.isImmuneToFire = true;

    setSize(0.925F, 0.925F);

    this.yOffset = (this.height / 2.0F);
  }

  public EntityBlock(World world, int i, int j, int k, boolean isDummy)
  {
    this(world);
    this.xOri = i;
    this.yOri = j;
    this.zOri = k;

    setBlockIdAndMeta(this.worldObj.blockGetRenderType(i, j, k), this.worldObj.getBlockMetadata(i, j, k));

    this.dummy = isDummy;
    setLocationAndAngles(i + 0.5D, j + this.height / 2.0F, k + 0.5D, 0.0F, 0.0F);
  }

  public boolean canBeCollidedWith()
  {
    return !this.isDead;
  }

  public boolean canBePushed()
  {
    return !this.isDead;
  }

  protected void dealFireDamage(int i)
  {
  }


  protected void entityInit()
  {
    this.dataWatcher.addObject(16, Integer.valueOf(0));
    this.dataWatcher.addObject(17, Integer.valueOf(0));
  }

  public void setBlockIdAndMeta(int i, int j)
  {
    this.dataWatcher.updateObject(16, Integer.valueOf(i));
    this.dataWatcher.updateObject(17, Integer.valueOf(j));
  }

  public int getBlockID()
  {
    return this.dataWatcher.getWatchableObjectInt(16);
  }

  public int getMeta()
  {
    return this.dataWatcher.getWatchableObjectInt(17);
  }

  public void setDead()
  {
    super.setDead();
  }

  public void onUpdate()
  {
    this.age += 1;
    extinguish();

    int i = (int)Math.floor(this.posX);
    int j = (int)Math.floor(this.posY);
    int k = (int)Math.floor(this.posZ);

    this.prevPosX = this.posX;
    this.prevPosY = this.posY;
    this.prevPosZ = this.posZ;
    moveEntity(this.motionX, this.motionY, this.motionZ);
  }

  protected void readEntityFromNBT(NBTTagCompound nbt)
  {
    setBlockIdAndMeta(nbt.getByte("block"), nbt.getByte("meta"));
    this.tileEntity = null;
  }

  protected void writeEntityToNBT(NBTTagCompound nbt)
  {
    nbt.setByte("block", (byte)getBlockID());
    nbt.setByte("meta", (byte)getMeta());

    NBTTagCompound tag = new NBTTagCompound();
    if (this.tileEntity != null)
    {
      this.tileEntity.writeToNBT(tag);
    }

    nbt.setCompoundTag("tileEntity", tag);
  }

  public float getShadowSize()
  {
    return 0.0F;
  }
}