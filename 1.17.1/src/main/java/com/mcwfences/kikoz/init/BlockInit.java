package com.mcwfences.kikoz.init;

import com.mcwfences.kikoz.MacawsFences;
import com.mcwfences.kikoz.objects.WiredFence;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsFences.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS_STONE = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsFences.MOD_ID);

	public static final RegistryObject<Block> OAK_PICKET_FENCE = BLOCKS.register("oak_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_PICKET_FENCE = BLOCKS.register("spruce_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_PICKET_FENCE = BLOCKS.register("birch_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_PICKET_FENCE = BLOCKS.register("jungle_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_PICKET_FENCE = BLOCKS.register("acacia_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_PICKET_FENCE = BLOCKS.register("dark_oak_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CRIMSON_PICKET_FENCE = BLOCKS.register("crimson_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> WARPED_PICKET_FENCE = BLOCKS.register("warped_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OAK_STOCKADE_FENCE = BLOCKS.register("oak_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_STOCKADE_FENCE = BLOCKS.register("spruce_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_STOCKADE_FENCE = BLOCKS.register("birch_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_STOCKADE_FENCE = BLOCKS.register("jungle_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_STOCKADE_FENCE = BLOCKS.register("acacia_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_STOCKADE_FENCE = BLOCKS.register("dark_oak_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CRIMSON_STOCKADE_FENCE = BLOCKS.register("crimson_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> WARPED_STOCKADE_FENCE = BLOCKS.register("warped_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	
	public static final RegistryObject<Block> OAK_HORSE_FENCE = BLOCKS.register("oak_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_HORSE_FENCE = BLOCKS.register("spruce_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_HORSE_FENCE = BLOCKS.register("birch_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_HORSE_FENCE = BLOCKS.register("jungle_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_HORSE_FENCE = BLOCKS.register("acacia_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_HORSE_FENCE = BLOCKS.register("dark_oak_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CRIMSON_HORSE_FENCE = BLOCKS.register("crimson_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> WARPED_HORSE_FENCE = BLOCKS.register("warped_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	
	public static final RegistryObject<Block> OAK_WIRED_FENCE = BLOCKS.register("oak_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> SPRUCE_WIRED_FENCE = BLOCKS.register("spruce_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> BIRCH_WIRED_FENCE = BLOCKS.register("birch_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> JUNGLE_WIRED_FENCE = BLOCKS.register("jungle_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> ACACIA_WIRED_FENCE = BLOCKS.register("acacia_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> DARK_OAK_WIRED_FENCE = BLOCKS.register("dark_oak_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> CRIMSON_WIRED_FENCE = BLOCKS.register("crimson_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> WARPED_WIRED_FENCE = BLOCKS.register("warped_wired_fence", () -> new WiredFence(null));
	
	public static final RegistryObject<Block> BAMBOO_FENCE = BLOCKS.register("bamboo_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_GREEN).strength(1.0F, 2.0F).sound(SoundType.SCAFFOLDING)));
	
	public static final RegistryObject<Block> OAK_HIGHLEY_GATE = BLOCKS.register("oak_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_HIGHLEY_GATE = BLOCKS.register("spruce_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_HIGHLEY_GATE = BLOCKS.register("birch_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_HIGHLEY_GATE = BLOCKS.register("jungle_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_HIGHLEY_GATE = BLOCKS.register("acacia_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_HIGHLEY_GATE = BLOCKS.register("dark_oak_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CRIMSON_HIGHLEY_GATE = BLOCKS.register("crimson_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> WARPED_HIGHLEY_GATE = BLOCKS.register("warped_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	
	public static final RegistryObject<Block> OAK_PYRAMID_GATE = BLOCKS.register("oak_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_PYRAMID_GATE = BLOCKS.register("spruce_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_PYRAMID_GATE = BLOCKS.register("birch_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_PYRAMID_GATE = BLOCKS.register("jungle_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_PYRAMID_GATE = BLOCKS.register("acacia_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_PYRAMID_GATE = BLOCKS.register("dark_oak_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CRIMSON_PYRAMID_GATE = BLOCKS.register("crimson_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> WARPED_PYRAMID_GATE = BLOCKS.register("warped_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> MODERN_STONE_BRICK_WALL = BLOCKS_STONE.register("modern_stone_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_ANDESITE_WALL = BLOCKS_STONE.register("modern_andesite_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_DIORITE_WALL = BLOCKS_STONE.register("modern_diorite_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_GRANITE_WALL = BLOCKS_STONE.register("modern_granite_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_SANDSTONE_WALL = BLOCKS_STONE.register("modern_sandstone_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.SAND).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_RED_SANDSTONE_WALL = BLOCKS_STONE.register("modern_red_sandstone_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_BLACKSTONE_WALL = BLOCKS_STONE.register("modern_blackstone_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_NETHER_BRICK_WALL = BLOCKS_STONE.register("modern_nether_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_END_BRICK_WALL = BLOCKS_STONE.register("modern_end_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_DEEPSLATE_WALL = BLOCKS_STONE.register("modern_deepslate_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_DEEPSLATE_BRICK_WALL = BLOCKS_STONE.register("modern_deepslate_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_QUARTZ_WALL = BLOCKS_STONE.register("modern_quartz_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> RAILING_STONE_BRICK_WALL = BLOCKS_STONE.register("railing_stone_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_ANDESITE_WALL = BLOCKS_STONE.register("railing_andesite_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_DIORITE_WALL = BLOCKS_STONE.register("railing_diorite_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_GRANITE_WALL = BLOCKS_STONE.register("railing_granite_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_SANDSTONE_WALL = BLOCKS_STONE.register("railing_sandstone_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_RED_SANDSTONE_WALL = BLOCKS_STONE.register("railing_red_sandstone_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_BLACKSTONE_WALL = BLOCKS_STONE.register("railing_blackstone_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_NETHER_BRICK_WALL = BLOCKS_STONE.register("railing_nether_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_END_BRICK_WALL = BLOCKS_STONE.register("railing_end_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_DEEPSLATE_WALL = BLOCKS_STONE.register("railing_deepslate_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_DEEPSLATE_BRICK_WALL = BLOCKS_STONE.register("railing_deepslate_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_QUARTZ_WALL = BLOCKS_STONE.register("railing_quartz_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> STONE_BRICK_RAILING_GATE = BLOCKS_STONE.register("stone_brick_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ANDESITE_RAILING_GATE = BLOCKS_STONE.register("andesite_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIORITE_RAILING_GATE = BLOCKS_STONE.register("diorite_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GRANITE_RAILING_GATE = BLOCKS_STONE.register("granite_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> SANDSTONE_RAILING_GATE = BLOCKS_STONE.register("sandstone_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RED_SANDSTONE_RAILING_GATE = BLOCKS_STONE.register("red_sandstone_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLACKSTONE_RAILING_GATE = BLOCKS_STONE.register("blackstone_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLACKSTONE_BRICK_RAILING_GATE = BLOCKS_STONE.register("blackstone_brick_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> NETHER_BRICK_RAILING_GATE = BLOCKS_STONE.register("nether_brick_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> END_BRICK_RAILING_GATE = BLOCKS_STONE.register("end_brick_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DEEPSLATE_RAILING_GATE = BLOCKS_STONE.register("deepslate_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DEEPSLATE_BRICK_RAILING_GATE = BLOCKS_STONE.register("deepslate_brick_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> QUARTZ_RAILING_GATE = BLOCKS_STONE.register("quartz_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

}
