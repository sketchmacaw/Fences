package com.mcwfences.kikoz.objects;


import com.mcwfences.kikoz.init.DamageInit;

import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class WiredFence extends FenceBlock {

	public WiredFence(Properties properties) {
		super(Properties.of(Material.WOOD)
    			.sound(SoundType.WOOD)
    			.strength(1.5f, 2.5f)
				);	
	}
	
	@Override
	   public void entityInside(BlockState state, World world, BlockPos pos, Entity player) {
		     player.hurt(DamageInit.WIRED_FENCE, 2.0F);
		   }
}