package com.mcwfences.kikoz.objects;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraftforge.common.extensions.IForgeItem;

public class FuelItemBlock extends BlockItem implements IForgeItem {

		public FuelItemBlock(Block block, Properties prop) {
			super(block, prop);
		}

		@Override
		public int getBurnTime(ItemStack itemStack, @Nullable IRecipeType<?> recipeType) {
			return 300;
		}
}