package net.bleachcraft.Proxy;

import net.bleachcraft.Fluids.ChlorineBlock;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	private static ModelResourceLocation gasLocation = new ModelResourceLocation("bleachcraft" + ":" + "ChlorineBlock",
			"gas");

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
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

	}

	public static void registerItemRender(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	public static void registerFluidRender(Item item, int meta, String location, String varient) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(location, varient));
	}

}
