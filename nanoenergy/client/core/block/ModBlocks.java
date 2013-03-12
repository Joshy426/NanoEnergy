package nanoenergy.client.core.block;

import nanoenergy.lib.Strings;
import net.minecraft.block.Block;


import cpw.mods.fml.common.registry.GameRegistry;

/**
 * ModBlocks
 * 
 * Class containing all the EE3 custom blocks
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ModBlocks {

    /* Mod block instances */
    public static Block calcinator;

    public static void init() {

        calcinator = new BlockCalcinator(235);

        GameRegistry.registerBlock(calcinator, Strings.CALCINATOR_NAME);
        
        initBlockRecipes();

    }

    private static void initBlockRecipes() {

        // Calcinator Recipe
        /*
         * Temporarily disabled for pre-release 1, as it is not completely
         * functional GameRegistry.addRecipe(new ItemStack(calcinator), new
         * Object[] {"i i","iii","sfs", Character.valueOf('i'), Item.ingotIron,
         * Character.valueOf('s'), Block.stone, Character.valueOf('f'),
         * Item.flintAndSteel });
         */
    }

}