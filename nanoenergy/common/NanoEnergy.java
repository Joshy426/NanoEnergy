package nanoenergy.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.relauncher.Side;
import nanoenergy.client.core.ClientProxy;
import nanoenergy.client.core.block.BlockCalcinator;
import nanoenergy.client.core.block.BlockTable;
import nanoenergy.client.core.handlers.ClientPacketHandler;
import nanoenergy.client.core.item.ItemNanoChip;
import nanoenergy.client.core.item.ItemNanoGun;
import nanoenergy.client.core.item.ItemSiliconChunk;
import nanoenergy.client.core.item.ItemSiliconPlate;
import nanoenergy.common.core.CommonProxy;
import nanoenergy.common.core.Settings;
import nanoenergy.common.core.handlers.ServerPacketHandler;
import nanoenergy.common.tabs.TabNanoEnergy;
import nanoenergy.energy.EnergyEntry;
import nanoenergy.energy.EnergyRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = false, // Whether
																	// client
																	// side and
																	// server
																	// side are
																	// needed
clientPacketHandlerSpec = @SidedPacketHandler(channels = { "NanoEnergy" }, packetHandler = ClientPacketHandler.class), // For
																														// clientside
																														// packet
																														// handling
serverPacketHandlerSpec = @SidedPacketHandler(channels = {}, packetHandler = ServerPacketHandler.class))
// For serverside packet handling
@Mod(modid = "nanoenergy", name = "Nano Energy", version = "0.1")
// Gives Forge extra info about your mod
public class NanoEnergy { // The class file
	

	@Instance("nanoenergy")
	// The instance, this is very important later on
	public static NanoEnergy instance = new NanoEnergy();

	@SidedProxy(clientSide = "nanoenergy.client.core.ClientProxy", serverSide = "nanoenergy.common.core.CommonProxy")
	// Tells Forge the location of your proxies
	public static CommonProxy proxy;
	public static ClientProxy proxy2;

	@Init
	public void InitCobaltCraft(FMLInitializationEvent event) { // Your main
																// initialization
																// method
		proxy.registerEntity();

		NetworkRegistry.instance().registerGuiHandler(this, proxy); // Registers
																	// the class
																	// that
																	// deals
																	// with GUI
																	// data
		proxy.addNames();
	}

	public int getMetadata(int damageValue) {
		return damageValue;
	}

	private void doRegistrations()
	{
		// Energy Blocks
		// Blocks with an Energy Value of 1
		int energyCobble = 1, energyDeadbush = 1, energyDirt = 1, energyGrass = 1, energySand = 1, energyLeaves = 1, energyEndStone = 1, energyIce = 1, energySnow = 1, energyNetherrack = 1, energyStone = 1;
		// Blocks with an Energy Value of 2
		int energyGlass = 2;
		// Blocks with an Energy Value of 4
		int energyGravel = 4, energyNetherbrick = 4;
		// Blocks with an Energy Value of 8
		int energyCactus = 8, energyVine = 8;
		// Blocks with an energy Value of 12
		int energyWeb = 12;
		// Blocks with an Energy Value of 16
		int energyLilypad = 16, energyFlower = 16, energyRose = 16;
		// Blocks with an Energy Value of 24
		int energyNetherwart = 24;
		// Blocks with an Energy Value of 32
		int energyWood = 32, energySugarcane = 32, energySapling = 32, energyMushroom = 32;
		// Blocks with an Energy Value of 49
		int energySoulsand = 49;
		// Blocks with an Energy Value of 144
		int energyPumpkin = 144, energyMelon = 144;
		// Blocks with an Energy Value of 145
		int energyMoss = 145;
		// Blocks with an Energy Value of 139,264
		int energyDragonEgg = 139264;

		// Energy Items
		// Items with an Energy Value of 4
		int energyFlint = 4;
		// Items with an Energy Value of 8
		int energyDye = 8;
		// Items with an Energy Value of 16
		int energySeeds = 16;
		// Items with an Energy Value of 24
		int energyWheat = 24, energySlimeball = 24;
		// Items with an Energy Value of 32
		int energyEgg = 32;
		// Items with an Energy Value of 48
		int energyFeather = 48;
		// Items with an Energy Value of 64
		int energyClay = 64, energyBrick = 64, energyRedstone = 64, energyObsidian = 64;
		// Items with an Energy Value of 128
		int energyCoal = 128, energyApple = 128, energyCocca = 128;
		// Items with an Energy Value of 192
		int energyGunpowder = 192;
		// Items with an Energy Value of 256
		int energyIron = 256;
		// Items with an Energy Value of 384
		int energyGlowDust = 384;
		// Items with an Energy Value of 768
		int energyBlazePowder = 768;
		// Items with an Energy Value of 792
		int energyMagmaCream = 792;
		// Items with an Energy Value of 864
		int energyLapisLuzi = 864;
		// Items with an Energy Value of 1024
		int energyEnderpearl = 1024;
		// Items with an Energy Value of 1536
		int energyBlazeRod = 1536;
		// Items with an Energy Value of 2048
		int energyGold = 2048;
		// Items with an Energy Value of 4096
		int energyGhastTear = 4096;
		// Items with an Energy Value of 8192
		int energyDiamond = 8192;

		EnergyRegistry energyRegistry = EnergyRegistry.instance();

		// Blocks
		energyRegistry.addEnergyValue(Block.wood.blockID, energyWood);
		energyRegistry.addEnergyValue(Block.cobblestone.blockID, energyCobble);
		energyRegistry.addEnergyValue(Block.sapling.blockID, energySapling);
		energyRegistry.addEnergyValue(Block.sand.blockID, energySand);
		energyRegistry.addEnergyValue(Block.glass.blockID, energyGlass);
		energyRegistry.addEnergyValue(Block.grass.blockID, energyGrass);
		energyRegistry.addEnergyValue(Block.dirt.blockID, energyDirt);
		energyRegistry.addEnergyValue(Block.deadBush.blockID, energyDeadbush);
		energyRegistry.addEnergyValue(Block.leaves.blockID, energyLeaves);
		energyRegistry.addEnergyValue(Block.whiteStone.blockID, energyEndStone);
		energyRegistry.addEnergyValue(Block.ice.blockID, energyIce);
		energyRegistry.addEnergyValue(Block.snow.blockID, energySnow);
		energyRegistry.addEnergyValue(Block.netherrack.blockID, energyNetherrack);
		energyRegistry.addEnergyValue(Block.stone.blockID, energyStone);
		energyRegistry.addEnergyValue(Block.gravel.blockID, energyGravel);
		energyRegistry.addEnergyValue(Block.netherBrick.blockID, energyNetherbrick);
		energyRegistry.addEnergyValue(Block.cactus.blockID, energyCactus);
		energyRegistry.addEnergyValue(Block.vine.blockID, energyVine);
		energyRegistry.addEnergyValue(Block.reed.blockID, energySugarcane);
		energyRegistry.addEnergyValue(Block.waterlily.blockID, energyLilypad);
		energyRegistry.addEnergyValue(Block.mushroomBrown.blockID, energyMushroom);
		energyRegistry.addEnergyValue(Block.mushroomRed.blockID, energyMushroom);
		energyRegistry.addEnergyValue(Block.plantRed.blockID, energyRose);
		energyRegistry.addEnergyValue(Block.plantYellow.blockID, energyFlower);
		energyRegistry.addEnergyValue(Block.slowSand.blockID, energySoulsand);
		energyRegistry.addEnergyValue(Block.pumpkin.blockID, energyPumpkin);
		energyRegistry.addEnergyValue(Block.melon.blockID, energyMelon);
		energyRegistry.addEnergyValue(Block.cobblestoneMossy.blockID, energyMoss);
		energyRegistry.addEnergyValue(Block.dragonEgg.blockID, energyDragonEgg);
		energyRegistry.addEnergyValue(Block.netherStalk.blockID, energyNetherwart);
		energyRegistry.addEnergyValue(Block.obsidian.blockID, energyObsidian);
		// Items
		energyRegistry.addEnergyValue(Item.feather.itemID, energyFeather);
		energyRegistry.addEnergyValue(Item.flint.itemID, energyFlint);
		energyRegistry.addEnergyValue(Item.seeds.itemID, energySeeds);
		energyRegistry.addEnergyValue(Item.wheat.itemID, energyWheat);
		energyRegistry.addEnergyValue(Item.slimeBall.itemID, energySlimeball);
		energyRegistry.addEnergyValue(Item.egg.itemID, energyEgg);
		energyRegistry.addEnergyValue(Item.feather.itemID, energyFeather);
		energyRegistry.addEnergyValue(Item.redstone.itemID, energyRedstone);
		energyRegistry.addEnergyValue(Item.clay.itemID, energyClay);
		energyRegistry.addEnergyValue(Item.brick.itemID, energyBrick);
		energyRegistry.addEnergyValue(Item.gunpowder.itemID, energyGunpowder);
		energyRegistry.addEnergyValue(Item.coal.itemID, energyCoal);
		energyRegistry.addEnergyValue(Item.appleRed.itemID, energyApple);
		energyRegistry.addEnergyValue(Item.ingotIron.itemID, energyIron);
		energyRegistry.addEnergyValue(Item.lightStoneDust.itemID, energyGlowDust);
		energyRegistry.addEnergyValue(Item.blazePowder.itemID, energyBlazePowder);
		energyRegistry.addEnergyValue(Item.magmaCream.itemID, energyCoal);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, energyDye);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 1, energyDye);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 2, energyDye);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 3, energyCocca);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 4, energyLapisLuzi);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 5, energyDye);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 6, energyDye);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 7, energyDye);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 8, energyDye);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 9, energyDye);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 10, energyDye);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 11, energyDye);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 12, energyDye);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 13, energyDye);
		energyRegistry.addEnergyValue(Item.dyePowder.itemID, 14, energyDye);
		energyRegistry.addEnergyValue(Item.leather.itemID, energyDye);
		energyRegistry.addEnergyValue(Item.enderPearl.itemID, energyEnderpearl);
		energyRegistry.addEnergyValue(Item.blazeRod.itemID, energyBlazeRod);
		energyRegistry.addEnergyValue(Item.ingotGold.itemID, energyGold);
		energyRegistry.addEnergyValue(Item.ghastTear.itemID, energyGhastTear);
		energyRegistry.addEnergyValue(Item.diamond.itemID, energyDiamond);
		energyRegistry.addEnergyValue(Item.emerald.itemID, energyDiamond);
		energyRegistry.addEnergyValue(Item.bucketMilk.itemID, 833);
		energyRegistry.addEnergyValue(Item.paper.itemID, 32);
		energyRegistry.addEnergyValue(Block.planks.blockID, 8);
		
		// AbrarAdded   all 100.
		energyRegistry.addEnergyValue(Item.netherStar.itemID, 83530);
		energyRegistry.addEnergyValue(Block.fire.blockID, 100);
	}

	@PostInit
	public void postLoad(FMLPostInitializationEvent event)
	{
		// do all teh hardcoded ones
		doRegistrations();

		// get an instance of the EnergyRegistry
		EnergyRegistry energyRegistry = EnergyRegistry.instance();

		// make some temporaary variables
		Integer tempEnergy;
		int currentEnergy;
		List<ItemStack> inputs;
		boolean shouldSkip;

		ArrayList<IRecipe> recipes = new ArrayList<IRecipe>();
		// get all the recipes and add them to the list.
		recipes.addAll(CraftingManager.getInstance().getRecipeList());

		System.out.println("Recipes started with: " + recipes.size());

		// list of things to be done later.
		ArrayList<IRecipe> laters = new ArrayList<IRecipe>();

		// recipe counter
		int recipeCounter = 0;
		int loopCounter = 0;

		// start looping through recipes.
		// this is a loop through all recipes registerred.
		while (!recipes.isEmpty())
		{
			for (IRecipe recipe : recipes)
			{
				// continue if we already have an item.
				if (recipe.getRecipeOutput() == null || energyRegistry.getEnergyValue(recipe.getRecipeOutput()) != null)
				{
					recipeCounter++;
					continue;
				}

				// get the type, and assign the input list accordingly.
				if (recipe instanceof ShapedRecipes)
					inputs = (List<ItemStack>) Arrays.asList(((ShapedRecipes) recipe).recipeItems);
				else if (recipe instanceof ShapelessRecipes)
					inputs = ((List<ItemStack>) ((ShapelessRecipes) recipe).recipeItems);
				else
					inputs = new ArrayList<ItemStack>();

				// reset the current Energy to 0
				currentEnergy = 0;

				// resets the skip flag to false;
				shouldSkip = false;

				// go through the inputs
				for (ItemStack input : inputs)
				{
					if (input == null)
						continue;

					// get teh energy for the itemstack.
					tempEnergy = energyRegistry.getEnergyValue(input);

					// check if its not existent in the registry.
					if (tempEnergy != null)
					{
						// it EXISTS!   add the temp times the size to the current energy
						currentEnergy += tempEnergy * input.stackSize;
					}
					else
					{
						if (loopCounter >= 3)
							System.out.println(input);
						// this recipe needs to be skipped, and gotten to later.
						shouldSkip = true;
						// break out of the input loop.
						break;
					}
				}

				// if we should skip this recipe...
				if (shouldSkip)
				{
					// add it to the later list
					laters.add(recipe);
					// and skip it.
					continue;
				}

				recipeCounter++;

				// divide the energy by the number of output produces
				currentEnergy /= recipe.getRecipeOutput().stackSize;
				// add it to the registry.
				energyRegistry.addEnergyValue(recipe.getRecipeOutput(), currentEnergy);
			}

			// increment loop counter
			loopCounter++;
			
			System.out.println("recipes parsed on run "+(loopCounter)+": " + recipeCounter);
			recipeCounter = 0;
			
			// we went through all teh recipes in the Recipes object.
			recipes.clear();
			// add all the recipes from the laters
			recipes.addAll(laters);
			// now clear all the laters.
			laters.clear();
			
			if (loopCounter == 5)
				break;
		}

		//		List<ItemStack> inputs = null;
		//		boolean shouldSkip = false;
		//		Integer tempEnergy;
		//
		//		ArrayList<IRecipe> current = new ArrayList<IRecipe>();
		//		ArrayList<IRecipe> later = new ArrayList<IRecipe>();
		//		later.addAll(CraftingManager.getInstance().getRecipeList());
		//		int currentEnergy;

		//		do
		//		{
		//			current.addAll(later);
		//			later.clear();
		//			for (IRecipe recipe : current)
		//			{
		//				ItemStack output = recipe.getRecipeOutput();
		//				if (output == null || energyRegistry.getEnergyValue(output) != null)
		//					// map already has energy;
		//					continue;
		//
		//				currentEnergy = 0;
		//				shouldSkip = false;
		//				// still 200
		//				if (recipe instanceof ShapedRecipes)
		//				{
		//					inputs = (List<ItemStack>) Arrays.asList(((ShapedRecipes) recipe).recipeItems);
		//				}
		//				else if (recipe instanceof ShapelessRecipes)
		//				{
		//					inputs = ((List<ItemStack>) ((ShapelessRecipes) recipe).recipeItems);
		//				}
		//
		//				for (ItemStack input : inputs)
		//				{
		//					tempEnergy = energyRegistry.getEnergyValue(input);
		//
		//					if (tempEnergy == null)
		//					{
		//						shouldSkip = true;
		//						later.add(recipe);
		//						break;
		//					}
		//					else
		//						currentEnergy += tempEnergy; // ItemStack
		//					System.out.println(currentEnergy);
		//				}
		//
		//				if (shouldSkip)
		//					continue;
		//
		//				// add it to the map.
		//				energyRegistry.addEnergyValue(output, currentEnergy);
		//				//current.remove(recipe);
		//			}
		//
		//			current.clear();
		//		} while (!later.isEmpty());
	}

	// Tab
	public static HashMap cHex = new HashMap();
	public static HashMap modPartMap = new HashMap();
	public static CreativeTabs tabNanoEnergy = new TabNanoEnergy(
			CreativeTabs.getNextID(), "Nano Energy"); // Our custom creative
														// tab's object

	// Items
	public static Item nanochip = new ItemNanoChip(5432, 0); // Nano Chip
	public static Item siliconplate = new ItemSiliconPlate(5433, 7); // Silicon
																		// Plate
	public static Item siliconchunk = new ItemSiliconChunk(5434, 6); // Silicon
																		// Chunk
	public static Item nanogun = new ItemNanoGun(5435, 8); // Nano Gun

	// Blocks
	public static Block blockTable;
	public static int modelID = RenderingRegistry.getNextAvailableRenderId();;

	@Init
	public void load(FMLInitializationEvent event) {
		blockTable = new BlockTable(234, Material.rock)
				.setBlockName("yourblock").setHardness(1F).setResistance(1F);
		NetworkRegistry.instance().registerGuiHandler(instance, proxy);
		proxy.initMod();
		proxy.initTileEntities();
	}

}