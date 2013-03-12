package nanoenergy.client.gui;

import nanoenergy.client.core.tileentity.TileNanoTable;
import nanoenergy.common.NanoEnergy;
import nanoenergy.inventory.ContainerCalcinator;
import nanoenergy.lib.Strings;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import com.pahimar.ee3.tileentity.TileCalcinator;


import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * GuiCalcinator
 * 
 * Calcinator Gui class
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class GuiCalcinator extends GuiContainer {

    private TileNanoTable tileNanoTable;

    public GuiCalcinator(InventoryPlayer player, TileNanoTable tileNanoTable) {

        super(new ContainerCalcinator(player, tileNanoTable));
        this.ySize = 197;
    }

    protected void drawGuiContainerForegroundLayer(int x, int y) {

        this.fontRenderer.drawString(Strings.CALCINATOR_NAME, 12, 6, 1210000);
        this.fontRenderer.drawString("Energy: " + TileNanoTable.currentEnergy, 12, 35, 1210000);
        this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float opacity, int x, int y) {

        int backgroundTexture = this.mc.renderEngine.getTexture("/nanoenergy/guicalcinator.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(backgroundTexture);
        int xStart = (this.width - this.xSize) / 2;
        int yStart = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, this.xSize, this.ySize);
    }

}
