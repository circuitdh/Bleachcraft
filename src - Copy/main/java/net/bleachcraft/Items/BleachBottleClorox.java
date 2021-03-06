package net.bleachcraft.Items;

import net.bleachcraft.BleachCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BleachBottleClorox extends ItemFood {
	public BleachBottleClorox()
	{
		super(20, 1.0F, false);
		this.setUnlocalizedName("bleachBottleClorox");
		this.setCreativeTab(BleachCraft.sampleTab);
		this.setAlwaysEdible();
		this.setMaxStackSize(1);
	
	}
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1200, 2));
		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 1200, 2));
		player.addPotionEffect(new PotionEffect(MobEffects.POISON, 600, 2));
	}

}