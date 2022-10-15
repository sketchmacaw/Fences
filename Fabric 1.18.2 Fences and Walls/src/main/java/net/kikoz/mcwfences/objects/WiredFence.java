package net.kikoz.mcwfences.objects;

import net.kikoz.mcwfences.init.DamageInit;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WiredFence extends FenceBlock {
    public WiredFence(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.damage(DamageInit.WIRED_FENCE, 2.0f);
    }
}