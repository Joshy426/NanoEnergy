package nanoenergy.client.core.item;

import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.*;
import nanoenergy.common.NanoEnergy;
import net.minecraft.creativetab.CreativeTabs;
public class ItemNanoChip extends Item {
public ItemNanoChip(int id, int texture) {
super(id); //Returns super constructor: par1 is ID
this.setTextureFile("/nanoenergy/items.png"); //Sets the item texture file
this.setItemName("nanochip"); //Sets the incode name of the item, make sure it doesn't clash with other items, weird stuff happens
this.setCreativeTab(NanoEnergy.tabNanoEnergy); //Tells the game what creative mode tab it goes in
this.setIconIndex(texture);
}
}