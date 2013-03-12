package nanoenergy.inventory;



import com.pahimar.ee3.inventory.SlotCalcinator;

import nanoenergy.client.core.tileentity.TileNanoTable;
import nanoenergy.common.NanoEnergy;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerCalcinator extends Container {

	private TileNanoTable tileNanoTable;

    public ContainerCalcinator(InventoryPlayer inventoryPlayer, TileNanoTable tileNanoTable) {

        this.tileNanoTable = tileNanoTable;
        
     // Add the calcined results slot to the container
 
        // Add the Alchemical Chest slots to the container
        for (int chestRowIndex = 0; chestRowIndex < 3; ++chestRowIndex) {
            for (int chestColumnIndex = 0; chestColumnIndex < 9; ++chestColumnIndex) {
                this.addSlotToContainer(new Slot(tileNanoTable, chestColumnIndex + chestRowIndex * 9 + 9, 8 + chestColumnIndex * 18, 48 + chestRowIndex * 18));
            }
        }

        // Add the player's inventory slots to the container
        for (int inventoryRowIndex = 0; inventoryRowIndex < 3; ++inventoryRowIndex) {
            for (int inventoryColumnIndex = 0; inventoryColumnIndex < 9; ++inventoryColumnIndex) {
                this.addSlotToContainer(new Slot(inventoryPlayer, inventoryColumnIndex + inventoryRowIndex * 9 + 9, 8 + inventoryColumnIndex * 18, 115 + inventoryRowIndex * 18));
            }
        }

        // Add the player's action bar slots to the container
        for (int actionBarSlotIndex = 0; actionBarSlotIndex < 9; ++actionBarSlotIndex) {
            this.addSlotToContainer(new Slot(inventoryPlayer, actionBarSlotIndex, 8 + actionBarSlotIndex * 18, 173));
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer var1) {

        return true;
    }
    
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
    {
    		
        ItemStack var3 = null;
        Slot var4 = (Slot)this.inventorySlots.get(par2);

        if (var4 != null && var4.getHasStack())
        {
            ItemStack var5 = var4.getStack();
            var3 = var5.copy();

            if (par2 < 3 * 9)
            {
                if (!this.mergeItemStack(var5, 3 * 9, this.inventorySlots.size(), true))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(var5, 0, 3 * 9, false))
            {
                return null;
            }

            if (var5.stackSize == 0)
            {
                var4.putStack((ItemStack)null);
            }
            else
            {
                var4.onSlotChanged();
            }
        }

        return var3;
    }
}