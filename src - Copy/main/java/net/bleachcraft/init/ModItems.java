package net.bleachcraft.init;

import net.bleachcraft.Items.BleachBottle;
import net.bleachcraft.Items.BleachBottleClorox;
import net.bleachcraft.Items.BleachBottleTide;
import net.bleachcraft.Items.BleachChemicals;
import net.bleachcraft.Items.ChickenNoodleSoup;
import net.bleachcraft.Items.Noodle;
import net.bleachcraft.Proxy.ClientProxy;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item bleachBottleClorox;
	public static Item bleachChemicals;
	public static Item bleachBottle;
	public static Item bleachBottleTide;
	public static Item chickenNoodleSoup;
	public static Item noodle;

	public static void registerItems() {
		

		bleachBottleClorox = new BleachBottleClorox();
		bleachBottle = new BleachBottle();
		bleachChemicals = new BleachChemicals();
		bleachBottleTide = new BleachBottleTide();
		noodle = new Noodle();
		chickenNoodleSoup = new ChickenNoodleSoup();
		
		ModItems.reigsterItem(bleachBottleClorox, "bleachBottleClorox");	
		ClientProxy.registerItemRender(bleachBottleClorox, 0);
		
		ModItems.reigsterItem(bleachBottle, "bleachBottle");	
		ClientProxy.registerItemRender(bleachBottle, 0);
		
		ModItems.reigsterItem(bleachBottleTide, "bleachBottleTide");
		ClientProxy.registerItemRender(bleachBottleTide, 0);
		
		ModItems.reigsterItem(bleachChemicals, "bleachChemicals");	
		ClientProxy.registerItemRender(bleachChemicals, 0);
		
		ModItems.reigsterItem(noodle, "noodle");
		ClientProxy.registerItemRender(noodle, 0);
		
		ModItems.reigsterItem(chickenNoodleSoup, "chickenNoodleSoup");
		ClientProxy.registerItemRender(chickenNoodleSoup, 0);
		
	}
	
	public static void reigsterItem(Item item, String name) //maybe store the name in your item class and use a getter method
	{
		GameRegistry.registerItem(item, name);
	}
}
