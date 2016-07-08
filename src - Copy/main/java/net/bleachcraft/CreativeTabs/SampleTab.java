package net.bleachcraft.CreativeTabs;

import net.bleachcraft.BleachCraft;
import net.bleachcraft.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class SampleTab extends CreativeTabs {

	public SampleTab(int index, String label) {
		super(index, label);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.bleachBottleClorox;
	}

}
