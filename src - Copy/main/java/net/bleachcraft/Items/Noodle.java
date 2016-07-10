package net.bleachcraft.Items;

import net.bleachcraft.BleachCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Noodle extends ItemFood {
	public Noodle()
	{
		super(1, 1.0F, false);
		this.setUnlocalizedName("noodle");
		this.setCreativeTab(BleachCraft.sampleTab);
		this.setAlwaysEdible();
		this.setMaxStackSize(64);
	
	}
}
