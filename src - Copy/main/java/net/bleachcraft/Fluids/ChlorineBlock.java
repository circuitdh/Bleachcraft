package net.bleachcraft.Fluids;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fluids.BlockFluidClassic;

public class ChlorineBlock extends BlockFluidClassic {
	public static final ChlorineBlock instance = new ChlorineBlock();

	public ChlorineBlock() {
		super(Chlorine.instance, Material.WATER);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setUnlocalizedName("bleachcraft" + ":" + "ChlorineBlock");

		setRegistryName("ChlorineBlock");
	}
}
