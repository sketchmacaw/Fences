package com.mcwfences.kikoz.objects;


import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
public class WiredFence extends FenceBlock {


	public WiredFence(Properties properties) {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD)
    			.sound(SoundType.WOOD)
    			.strength(1.5f)
    			.explosionResistance(2.5f)
				);	
	}
	
	
	@Override
	   public void entityInside(BlockState state, Level worldIn, BlockPos pos, Entity entityIn) {
		     entityIn.hurt(worldIn.damageSources().cactus(), 2.0F);
		   }
}
