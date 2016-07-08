package net.bleachcraft.Items;

import net.bleachcraft.BleachCraft;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;

public class ChlorineBucket extends ItemBucket {

	public ChlorineBucket(Block containedBlock) {
		super(containedBlock);
		setUnlocalizedName("chlorineBucket");
		setCreativeTab(BleachCraft.sampleTab);
		setMaxStackSize(1);
		setContainerItem(Items.BUCKET);
	}
}
