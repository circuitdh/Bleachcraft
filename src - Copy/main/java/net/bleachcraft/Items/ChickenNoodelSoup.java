package net.bleachcraft.Items;

import net.bleachcraft.BleachCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ChickenNoodleSoup extends ItemFood {
	public ChickenNoodleSoup()
	{
		super(10, 1.0F, false);
		this.setUnlocalizedName("chickenNoodleSoup");
		this.setCreativeTab(BleachCraft.sampleTab);
		this.setAlwaysEdible();
		this.setMaxStackSize(64);
	
	}
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.POISON, 600, 2));
	
	}
}
