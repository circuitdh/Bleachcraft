package net.bleachcraft.Proxy;

import net.bleachcraft.Fluids.Chlorine;
import net.bleachcraft.Fluids.ChlorineBlock;
import net.bleachcraft.init.Fluids;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		FluidRegistry.registerFluid(Chlorine.instance);
	}

	public void registerRenderThingsInit() {
	}

	public void registerRenderThings() {
	}
}
