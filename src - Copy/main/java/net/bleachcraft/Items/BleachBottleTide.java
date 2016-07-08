package net.bleachcraft.Items;

import net.bleachcraft.BleachCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class BleachBottleTide extends ItemFood {
	public BleachBottleTide()
	{
		super(20, 1.0F, false);
		this.setUnlocalizedName("bleachBottleTide");
		this.setCreativeTab(BleachCraft.sampleTab);
		this.setAlwaysEdible();
		this.setPotionEffect(new PotionEffect(MobEffects.NAUSEA), 1.0f);
		this.setMaxStackSize(1);
	}
}