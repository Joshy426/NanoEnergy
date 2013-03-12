package nanoenergy.common.tabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import nanoenergy.common.NanoEnergy;
import net.minecraft.creativetab.CreativeTabs;
public class TabNanoEnergy extends CreativeTabs {
public TabNanoEnergy(int position, String tabID) {
super(position, tabID); //The constructor for your tab
}
@SideOnly(Side.CLIENT)
public int getTabIconItemIndex() //The item it displays for your tab
{
return NanoEnergy.nanochip.itemID; //For this we'll use the ruby
}
public String getTranslatedTabLabel()
{
return "Nano Energy"; //The name of the tab ingame
}
}