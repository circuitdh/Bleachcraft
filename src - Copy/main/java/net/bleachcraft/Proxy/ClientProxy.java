package net.bleachcraft.Proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	private static ModelResourceLocation gasLocation = new ModelResourceLocation("bleachcraft" + ":" + "ChlorineBlock",
			"gas");

		
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		//super.preInit(event);
		ClientProxyModelRegistery.registerModels();
	}

}
