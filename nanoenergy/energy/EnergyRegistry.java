package nanoenergy.energy;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnergyRegistry {
	private static final EnergyRegistry energyRegistry = new EnergyRegistry();

    private HashMap<Integer, HashMap<Integer, Integer>> energyMap = new HashMap<Integer, HashMap<Integer, Integer>>();

    public static EnergyRegistry instance() {

        return energyRegistry;
    }

    public Integer getEnergyValue(Block block) {

        if (block != null) {
            return getEnergyValue(block.blockID, 0);
        }

        return null;
    }

    public Integer getEnergyValue(Item item) {

        if (item != null) {
            return getEnergyValue(item.itemID, 0);
        }

        return null;
    }

    public Integer getEnergyValue(ItemStack itemStack) {

        if (itemStack != null) {
            return getEnergyValue(itemStack.itemID, itemStack.getItemDamage());
        }

        return null;
    }

    public Integer getEnergyValue(int id) {

        return getEnergyValue(id, 0);
    }

    public Integer getEnergyValue(int id, int meta) {
    	if (meta == -1)
    		meta = 0;

        if (energyMap.containsKey(id)) {
            if (energyMap.get(id).containsKey(meta)) {
                return energyMap.get(id).get(meta);
            }
        }

        return null;
    }

    public void addEnergyValue(Block block, Integer EnergyEntry) {

        addEnergyValue(block.blockID, 0, EnergyEntry);
    }

    public void addEnergyValue(Block block, int meta, Integer EnergyEntry) {

        addEnergyValue(block.blockID, meta, EnergyEntry);
    }

    public void addEnergyValue(Item item, Integer EnergyEntry) {

        addEnergyValue(item.itemID, 0, EnergyEntry);
    }

    public void addEnergyValue(ItemStack itemStack, Integer EnergyEntry) {

        addEnergyValue(itemStack.itemID, itemStack.getItemDamage(), EnergyEntry);
    }

    public void addEnergyValue(int id, Integer EnergyEntry) {

        addEnergyValue(id, 0, EnergyEntry);
    }

    public void addEnergyValue(int id, int meta, Integer EnergyEntry) {

        HashMap<Integer, Integer> tempMap = new HashMap<Integer, Integer>();

        if (energyMap.containsKey(id)) {
            tempMap = energyMap.get(id);

            if (tempMap.containsKey(meta)) {
                return;
            }
        }

        tempMap.put(meta, EnergyEntry);
        energyMap.put(id, tempMap);
    }

}
