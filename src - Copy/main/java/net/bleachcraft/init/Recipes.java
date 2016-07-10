package net.bleachcraft.init;

import net.bleachcraft.Items.BleachBottle;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
	public static void registerRecipes() {
		//Bleach Bottle Recipe
		GameRegistry.addRecipe(new ItemStack(net.bleachcraft.init.ModItems.bleachBottle), "brb", "bmb", "bbb",'b',new ItemStack(Blocks.STAINED_GLASS,1,11), 'r', new ItemStack(Blocks.STAINED_GLASS,1,14),'m',net.bleachcraft.init.ModItems.bleachChemicals);
		//Noodle recipe
		
		//Chicken Noodle Soup recipe
		GameRegistry.addShapelessRecipe(new ItemStack(net.bleachcraft.init.ModItems.chickenNoodleSoup), new ItemStack(Items.BOWL), new ItemStack(Items.CHICKEN), new ItemStack(net.bleachcraft.init.ModItems.noodle), new ItemStack(net.bleachcraft.init.ModItems.bleachBottle));
	}
	
}
