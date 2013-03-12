package nanoenergy.client.core.tileentity;

import nanoenergy.client.core.block.BlockCalcinator;
import nanoenergy.common.NanoEnergy;
import nanoenergy.energy.EnergyEntry;
import nanoenergy.energy.EnergyRegistry;
import nanoenergy.lib.Strings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;

public class TileNanoTable extends TileEntity implements IInventory {
	
	private ItemStack[] tableItemStacks = new ItemStack[3];
    private ItemStack[] inventory;
    public boolean isEmpty;
    EnergyRegistry energyRegistry = EnergyRegistry.instance();
    public static EnergyEntry price = new EnergyEntry();
    public int blockId;
    public static int currentEnergy = 0;
    public int itemId;
    
    public static double total;

    public TileNanoTable() {

        inventory = new ItemStack[13 * 4];
    }

    @Override
    public int getSizeInventory() {

        return this.inventory.length;
    }

    @Override
    public ItemStack getStackInSlot(int slot) {

        return this.inventory[slot];
    }
    
    

    @Override
    public ItemStack decrStackSize(int slot, int amount) {

    	if (this.inventory[slot] != null)
        {
            ItemStack var3;

            if (this.inventory[slot].stackSize <= amount)
            {
                var3 = this.inventory[slot];
                this.inventory[slot] = null;
                return var3;
            }
            else
            {
                var3 = this.inventory[slot].splitStack(amount);

                if (this.inventory[slot].stackSize == 0)
                {
                    this.inventory[slot] = null;
                }

                return var3;
            }
        }
        else
        {
            return null;
        }
    }
    @Override
	public boolean canUpdate() {
		return true;
	}
    @Override
    public void updateEntity() {
    	if(worldObj.isRemote) {
    		return;
    	}
    	for (ItemStack stack : inventory) { 
    		for(int i = 0; i < this.getSizeInventory(); i++) {
    		
    		isEmpty = stack != null;
    		if (stack != null && stack.stackSize <= 0) {
    			stack = null;
    		}
    		
        if (stack != null) {
        	Item item = Item.itemsList[stack.itemID];
        	ItemStack is = this.getStackInSlot(i);
        	if(is == null) {
        	} else {
        	this.decrStackSize(i, 1);
        	
        	System.out.println(i);
        	

                
               
                
                int value = energyRegistry.getEnergyValue(stack);
                currentEnergy += value;
                System.out.println("The Value of the item is: " + value);
                this.onInventoryChanged();
    	if(stack.stackSize == 0) {
    		System.out.println("An Item Is Null!");
    		stack = null;
    		this.onInventoryChanged();
    	}
        	}
        }
    	}
    	}
    	}

    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {

        ItemStack itemStack = getStackInSlot(slot);
        if (itemStack != null) {
            setInventorySlotContents(slot, null);
        }
        return itemStack;
    }
    

    @Override
    public void setInventorySlotContents(int slot, ItemStack itemStack) {

        inventory[slot] = itemStack;
        if (itemStack != null && itemStack.stackSize > getInventoryStackLimit()) {
            itemStack.stackSize = getInventoryStackLimit();
        }
    }

    @Override
    public String getInvName() {

        return "container." + Strings.ALCHEMICAL_CHEST_NAME;
    }

    @Override
    public int getInventoryStackLimit() {

        return 64;
    }

    @Override
    public void openChest() {

    }

    @Override
    public void closeChest() {

    }

    public void readFromNBT(NBTTagCompound nbtTagCompound) {

        super.readFromNBT(nbtTagCompound);

        // Read in the ItemStacks in the inventory from NBT
        NBTTagList tagList = nbtTagCompound.getTagList("Items");
        this.inventory = new ItemStack[this.getSizeInventory()];
        for (int i = 0; i < tagList.tagCount(); ++i) {
            NBTTagCompound tagCompound = (NBTTagCompound) tagList.tagAt(i);
            byte slot = tagCompound.getByte("Slot");
            if (slot >= 0 && slot < this.inventory.length) {
                this.inventory[slot] = ItemStack.loadItemStackFromNBT(tagCompound);
            }
        }
    }

    public void writeToNBT(NBTTagCompound nbtTagCompound) {

        super.writeToNBT(nbtTagCompound);

        // Write the ItemStacks in the inventory to NBT
        NBTTagList tagList = new NBTTagList();
        for (int currentIndex = 0; currentIndex < this.inventory.length; ++currentIndex) {
            if (this.inventory[currentIndex] != null) {
                NBTTagCompound tagCompound = new NBTTagCompound();
                tagCompound.setByte("Slot", (byte) currentIndex);
                this.inventory[currentIndex].writeToNBT(tagCompound);
                tagList.appendTag(tagCompound);
            }
        }
        nbtTagCompound.setTag("Items", tagList);
    }

	@Override
	public boolean isUseableByPlayer(EntityPlayer var1) {
		return true;
	}
	
}