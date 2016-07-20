package net.bleachcraft.Proxy;

import net.bleachcraft.Fluids.ChlorineBlock;
import net.bleachcraft.init.ModItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxyModelRegistery extends ClientProxy{
	private static ModelResourceLocation gasLocation = new ModelResourceLocation("bleachcraft" + ":" + "ChlorineBlock",
			"gas"); 
	public static void registerModels() {
	
		Item gas = Item.getItemFromBlock(ChlorineBlock.instance);
		ModelBakery.registerItemVariants(gas);
		ModelLoader.setCustomMeshDefinition(gas, new ItemMeshDefinition() {
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return gasLocation;
			}
		});
		ModelLoader.setCustomStateMapper(ChlorineBlock.instance, new StateMapperBase() {
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return gasLocation;
			}
		});
				
		registerItemRender(ModItems.bleachBottleClorox, 0);
		registerItemRender(ModItems.bleachBottle, 0);
		registerItemRender(ModItems.bleachBottleTide, 0);
		registerItemRender(ModItems.bleachChemicals, 0);
		registerItemRender(ModItems.noodle, 0);
		registerItemRender(ModItems.chickenNoodleSoup, 0);
	}
	private static void registerItemRender(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	

}
