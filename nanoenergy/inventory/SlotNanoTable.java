package nanoenergy.inventory;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotNanoTable extends Slot {
	public SlotNanoTable(IInventory inventory, int x, int y, int z) {

        super(inventory, x, y, z);
    }
    
    public boolean isItemValid(ItemStack par1ItemStack) {
        return false;
    }

}
