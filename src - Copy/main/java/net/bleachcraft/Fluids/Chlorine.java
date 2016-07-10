package net.bleachcraft.Fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class Chlorine extends Fluid {
	public static final String name = "chlorine";
	public static final Chlorine instance = new Chlorine();

	public Chlorine() {
		super(name, new ResourceLocation("bleachcraft:blocks/chlorine_still"),
				new ResourceLocation("bleachcraft:blocks/chlorine_flow"));
		density = -1000;
		isGaseous = true;
	}

}
