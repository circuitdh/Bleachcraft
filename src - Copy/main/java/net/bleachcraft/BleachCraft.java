package net.bleachcraft;

import net.bleachcraft.CreativeTabs.SampleTab;
import net.bleachcraft.Proxy.ClientProxy;
import net.bleachcraft.Proxy.CommonProxy;
import net.bleachcraft.init.Fluids;
import net.bleachcraft.init.ModItems;
import net.bleachcraft.init.Recipes;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BleachCraft.MODID, version = BleachCraft.VERSION)
public class BleachCraft {
	public static final String MODID = "BleachCraft";
	public static final String VERSION = "1.0";

	// Creative Tabs
	public static CreativeTabs sampleTab = new SampleTab(CreativeTabs.getNextID(), "sampleTab");

	static {
		FluidRegistry.enableUniversalBucket();
	}

	@SidedProxy(serverSide = "net.bleachcraft.Proxy.CommonProxy", clientSide = "net.bleachcraft.Proxy.ClientProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		Fluids.registerFluids();
		ModItems.registerItems();
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Recipes.registerRecipes();
	}

}
