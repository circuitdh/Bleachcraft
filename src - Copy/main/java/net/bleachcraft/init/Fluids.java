package net.bleachcraft.init;

import net.bleachcraft.BleachCraft;
import net.bleachcraft.Fluids.Chlorine;
import net.bleachcraft.Fluids.ChlorineBlock;
import net.bleachcraft.Proxy.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Fluids {
	public static Fluid chlorine;

	public static void registerFluids() {

		chlorine = new Chlorine();
		FluidRegistry.registerFluid(Chlorine.instance);
		FluidRegistry.addBucketForFluid(Chlorine.instance);

		registerBlock(ChlorineBlock.instance);
	}

	public static void registerBlock(Block b) {

		GameRegistry.register(b);
		GameRegistry.register(new ItemBlock(b).setRegistryName(b.getRegistryName()));
	}
}
 
