package com.mcwfences.kikoz.init;

import com.mcwfences.kikoz.MacawsFences;
import com.mcwfences.kikoz.objects.StoneWiredFence;
import com.mcwfences.kikoz.objects.WiredFence;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsFences.MOD_ID);

	
	public static final RegistryObject<Block> OAK_PICKET_FENCE = BLOCKS.register("oak_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_PICKET_FENCE = BLOCKS.register("spruce_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_PICKET_FENCE = BLOCKS.register("birch_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_PICKET_FENCE = BLOCKS.register("jungle_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_PICKET_FENCE = BLOCKS.register("acacia_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_PICKET_FENCE = BLOCKS.register("dark_oak_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CRIMSON_PICKET_FENCE = BLOCKS.register("crimson_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> WARPED_PICKET_FENCE = BLOCKS.register("warped_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> MANGROVE_PICKET_FENCE = BLOCKS.register("mangrove_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));

	
	public static final RegistryObject<Block> OAK_STOCKADE_FENCE = BLOCKS.register("oak_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_STOCKADE_FENCE = BLOCKS.register("spruce_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_STOCKADE_FENCE = BLOCKS.register("birch_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_STOCKADE_FENCE = BLOCKS.register("jungle_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_STOCKADE_FENCE = BLOCKS.register("acacia_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_STOCKADE_FENCE = BLOCKS.register("dark_oak_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CRIMSON_STOCKADE_FENCE = BLOCKS.register("crimson_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> WARPED_STOCKADE_FENCE = BLOCKS.register("warped_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> MANGROVE_STOCKADE_FENCE = BLOCKS.register("mangrove_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	
	public static final RegistryObject<Block> OAK_HORSE_FENCE = BLOCKS.register("oak_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_HORSE_FENCE = BLOCKS.register("spruce_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_HORSE_FENCE = BLOCKS.register("birch_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_HORSE_FENCE = BLOCKS.register("jungle_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_HORSE_FENCE = BLOCKS.register("acacia_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_HORSE_FENCE = BLOCKS.register("dark_oak_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CRIMSON_HORSE_FENCE = BLOCKS.register("crimson_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> WARPED_HORSE_FENCE = BLOCKS.register("warped_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> MANGROVE_HORSE_FENCE = BLOCKS.register("mangrove_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OAK_WIRED_FENCE = BLOCKS.register("oak_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> SPRUCE_WIRED_FENCE = BLOCKS.register("spruce_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> BIRCH_WIRED_FENCE = BLOCKS.register("birch_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> JUNGLE_WIRED_FENCE = BLOCKS.register("jungle_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> ACACIA_WIRED_FENCE = BLOCKS.register("acacia_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> DARK_OAK_WIRED_FENCE = BLOCKS.register("dark_oak_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> CRIMSON_WIRED_FENCE = BLOCKS.register("crimson_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> WARPED_WIRED_FENCE = BLOCKS.register("warped_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> MANGROVE_WIRED_FENCE = BLOCKS.register("mangrove_wired_fence", () -> new WiredFence(null));
	
	
	public static final RegistryObject<Block> OAK_HEDGE = BLOCKS.register("oak_hedge", () -> new WallBlock(Block.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
	public static final RegistryObject<Block> SPRUCE_HEDGE = BLOCKS.register("spruce_hedge", () -> new WallBlock(Block.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES)));
	public static final RegistryObject<Block> BIRCH_HEDGE = BLOCKS.register("birch_hedge", () -> new WallBlock(Block.Properties.ofFullCopy(Blocks.BIRCH_LEAVES)));
	public static final RegistryObject<Block> JUNGLE_HEDGE = BLOCKS.register("jungle_hedge", () -> new WallBlock(Block.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES)));
	public static final RegistryObject<Block> ACACIA_HEDGE = BLOCKS.register("acacia_hedge", () -> new WallBlock(Block.Properties.ofFullCopy(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> DARK_OAK_HEDGE = BLOCKS.register("dark_oak_hedge", () -> new WallBlock(Block.Properties.ofFullCopy(Blocks.DARK_OAK_LEAVES)));
	public static final RegistryObject<Block> MANGROVE_HEDGE = BLOCKS.register("mangrove_hedge", () -> new WallBlock(Block.Properties.ofFullCopy(Blocks.MANGROVE_LEAVES)));
	public static final RegistryObject<Block> AZALEA_HEDGE = BLOCKS.register("azalea_hedge", () -> new WallBlock(Block.Properties.ofFullCopy(Blocks.AZALEA_LEAVES)));
	public static final RegistryObject<Block> FLOWERING_AZALEA_HEDGE = BLOCKS.register("flowering_azalea_hedge", () -> new WallBlock(Block.Properties.ofFullCopy(Blocks.FLOWERING_AZALEA_LEAVES)));


	public static final RegistryObject<Block> BAMBOO_FENCE = BLOCKS.register("bamboo_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(1.0F, 2.0F).sound(SoundType.SCAFFOLDING)));
	
	public static final RegistryObject<Block> OAK_HIGHLEY_GATE = BLOCKS.register("oak_highley_gate", () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_HIGHLEY_GATE = BLOCKS.register("spruce_highley_gate", () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_HIGHLEY_GATE = BLOCKS.register("birch_highley_gate", () -> new FenceGateBlock(WoodType.BIRCH, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_HIGHLEY_GATE = BLOCKS.register("jungle_highley_gate", () -> new FenceGateBlock(WoodType.JUNGLE, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_HIGHLEY_GATE = BLOCKS.register("acacia_highley_gate", () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_HIGHLEY_GATE = BLOCKS.register("dark_oak_highley_gate", () -> new FenceGateBlock(WoodType.DARK_OAK, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CRIMSON_HIGHLEY_GATE = BLOCKS.register("crimson_highley_gate", () -> new FenceGateBlock(WoodType.CRIMSON, BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> WARPED_HIGHLEY_GATE = BLOCKS.register("warped_highley_gate", () -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> MANGROVE_HIGHLEY_GATE = BLOCKS.register("mangrove_highley_gate", () -> new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OAK_PYRAMID_GATE = BLOCKS.register("oak_pyramid_gate", () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_PYRAMID_GATE = BLOCKS.register("spruce_pyramid_gate", () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_PYRAMID_GATE = BLOCKS.register("birch_pyramid_gate", () -> new FenceGateBlock(WoodType.BIRCH, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_PYRAMID_GATE = BLOCKS.register("jungle_pyramid_gate", () -> new FenceGateBlock(WoodType.JUNGLE, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_PYRAMID_GATE = BLOCKS.register("acacia_pyramid_gate", () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_PYRAMID_GATE = BLOCKS.register("dark_oak_pyramid_gate", () -> new FenceGateBlock(WoodType.DARK_OAK, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> CRIMSON_PYRAMID_GATE = BLOCKS.register("crimson_pyramid_gate", () -> new FenceGateBlock(WoodType.CRIMSON, BlockBehaviour.Properties.of().mapColor(MapColor.CRIMSON_STEM).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> WARPED_PYRAMID_GATE = BLOCKS.register("warped_pyramid_gate", () -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM).strength(1.4F, 2.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> MANGROVE_PYRAMID_GATE = BLOCKS.register("mangrove_pyramid_gate", () -> new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> MODERN_STONE_BRICK_WALL = BLOCKS.register("modern_stone_brick_wall", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_ANDESITE_WALL = BLOCKS.register("modern_andesite_wall", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_DIORITE_WALL = BLOCKS.register("modern_diorite_wall", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_GRANITE_WALL = BLOCKS.register("modern_granite_wall", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_SANDSTONE_WALL = BLOCKS.register("modern_sandstone_wall", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_RED_SANDSTONE_WALL = BLOCKS.register("modern_red_sandstone_wall", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_BLACKSTONE_WALL = BLOCKS.register("modern_blackstone_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_NETHER_BRICK_WALL = BLOCKS.register("modern_nether_brick_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.NETHER).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_END_BRICK_WALL = BLOCKS.register("modern_end_brick_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_DEEPSLATE_WALL = BLOCKS.register("modern_deepslate_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.DEEPSLATE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_DEEPSLATE_BRICK_WALL = BLOCKS.register("modern_deepslate_brick_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.DEEPSLATE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_QUARTZ_WALL = BLOCKS.register("modern_quartz_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.QUARTZ).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_MUD_BRICK_WALL = BLOCKS.register("modern_mud_brick_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MODERN_PRISMARINE_WALL = BLOCKS.register("modern_prismarine_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> RAILING_STONE_BRICK_WALL = BLOCKS.register("railing_stone_brick_wall", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_ANDESITE_WALL = BLOCKS.register("railing_andesite_wall", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_DIORITE_WALL = BLOCKS.register("railing_diorite_wall", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_GRANITE_WALL = BLOCKS.register("railing_granite_wall", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_SANDSTONE_WALL = BLOCKS.register("railing_sandstone_wall", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_RED_SANDSTONE_WALL = BLOCKS.register("railing_red_sandstone_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_BLACKSTONE_WALL = BLOCKS.register("railing_blackstone_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_NETHER_BRICK_WALL = BLOCKS.register("railing_nether_brick_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.NETHER).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_END_BRICK_WALL = BLOCKS.register("railing_end_brick_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_DEEPSLATE_WALL = BLOCKS.register("railing_deepslate_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.DEEPSLATE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_DEEPSLATE_BRICK_WALL = BLOCKS.register("railing_deepslate_brick_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.DEEPSLATE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_QUARTZ_WALL = BLOCKS.register("railing_quartz_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.QUARTZ).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_MUD_BRICK_WALL = BLOCKS.register("railing_mud_brick_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RAILING_PRISMARINE_WALL = BLOCKS.register("railing_prismarine_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> STONE_BRICK_RAILING_GATE = BLOCKS.register("stone_brick_railing_gate", () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ANDESITE_RAILING_GATE = BLOCKS.register("andesite_railing_gate", () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIORITE_RAILING_GATE = BLOCKS.register("diorite_railing_gate", () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GRANITE_RAILING_GATE = BLOCKS.register("granite_railing_gate", () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> SANDSTONE_RAILING_GATE = BLOCKS.register("sandstone_railing_gate", () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RED_SANDSTONE_RAILING_GATE = BLOCKS.register("red_sandstone_railing_gate", () -> new FenceGateBlock(WoodType.OAK, Block.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLACKSTONE_RAILING_GATE = BLOCKS.register("blackstone_railing_gate", () -> new FenceGateBlock(WoodType.OAK, Block.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLACKSTONE_BRICK_RAILING_GATE = BLOCKS.register("blackstone_brick_railing_gate", () -> new FenceGateBlock(WoodType.OAK, Block.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> NETHER_BRICK_RAILING_GATE = BLOCKS.register("nether_brick_railing_gate", () -> new FenceGateBlock(WoodType.OAK, Block.Properties.of().mapColor(MapColor.NETHER).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> END_BRICK_RAILING_GATE = BLOCKS.register("end_brick_railing_gate", () -> new FenceGateBlock(WoodType.OAK, Block.Properties.of().mapColor(MapColor.TERRACOTTA_YELLOW).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DEEPSLATE_RAILING_GATE = BLOCKS.register("deepslate_railing_gate", () -> new FenceGateBlock(WoodType.OAK, Block.Properties.of().mapColor(MapColor.DEEPSLATE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DEEPSLATE_BRICK_RAILING_GATE = BLOCKS.register("deepslate_brick_railing_gate", () -> new FenceGateBlock(WoodType.OAK, Block.Properties.of().mapColor(MapColor.DEEPSLATE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> QUARTZ_RAILING_GATE = BLOCKS.register("quartz_railing_gate", () -> new FenceGateBlock(WoodType.OAK, Block.Properties.of().mapColor(MapColor.QUARTZ).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MUD_BRICK_RAILING_GATE = BLOCKS.register("mud_brick_railing_gate", () -> new FenceGateBlock(WoodType.OAK, Block.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PRISMARINE_RAILING_GATE = BLOCKS.register("prismarine_railing_gate", () -> new FenceGateBlock(WoodType.OAK, Block.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

	//1.20
	
	public static final RegistryObject<Block> CHERRY_PICKET_FENCE = BLOCKS.register("cherry_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.CHERRY_WOOD)));
	public static final RegistryObject<Block> CHERRY_STOCKADE_FENCE = BLOCKS.register("cherry_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.CHERRY_WOOD)));
	public static final RegistryObject<Block> CHERRY_HORSE_FENCE = BLOCKS.register("cherry_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.CHERRY_WOOD)));
	public static final RegistryObject<Block> CHERRY_WIRED_FENCE = BLOCKS.register("cherry_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> CHERRY_HEDGE = BLOCKS.register("cherry_hedge", () -> new WallBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(0.2F, 0.3F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CHERRY_HIGHLEY_GATE = BLOCKS.register("cherry_highley_gate", () -> new FenceGateBlock(WoodType.CHERRY, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.CHERRY_WOOD)));
	public static final RegistryObject<Block> CHERRY_PYRAMID_GATE = BLOCKS.register("cherry_pyramid_gate", () -> new FenceGateBlock(WoodType.CHERRY, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.CHERRY_WOOD)));

	public static final RegistryObject<Block> BAMBOO_PICKET_FENCE = BLOCKS.register("bamboo_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.BAMBOO_WOOD)));
	public static final RegistryObject<Block> BAMBOO_STOCKADE_FENCE = BLOCKS.register("bamboo_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.BAMBOO_WOOD)));
	public static final RegistryObject<Block> BAMBOO_HORSE_FENCE = BLOCKS.register("bamboo_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.BAMBOO_WOOD)));
	public static final RegistryObject<Block> BAMBOO_WIRED_FENCE = BLOCKS.register("bamboo_wired_fence", () -> new WiredFence(null));
	public static final RegistryObject<Block> BAMBOO_HIGHLEY_GATE = BLOCKS.register("bamboo_highley_gate", () -> new FenceGateBlock(WoodType.CHERRY, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.BAMBOO_WOOD)));
	public static final RegistryObject<Block> BAMBOO_PYRAMID_GATE = BLOCKS.register("bamboo_pyramid_gate", () -> new FenceGateBlock(WoodType.CHERRY, BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.4F, 2.0F).sound(SoundType.BAMBOO_WOOD)));

	// New Update 1.1.0
	
	public static final RegistryObject<Block> STONE_PILLAR_WALL = BLOCKS.register("stone_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ANDESITE_PILLAR_WALL = BLOCKS.register("andesite_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIORITE_PILLAR_WALL = BLOCKS.register("diorite_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GRANITE_PILLAR_WALL = BLOCKS.register("granite_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> SANDSTONE_PILLAR_WALL = BLOCKS.register("sandstone_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RED_SANDSTONE_PILLAR_WALL = BLOCKS.register("red_sandstone_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLACKSTONE_PILLAR_WALL = BLOCKS.register("blackstone_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> NETHER_BRICK_PILLAR_WALL = BLOCKS.register("nether_brick_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> END_BRICK_PILLAR_WALL = BLOCKS.register("end_brick_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DEEPSLATE_PILLAR_WALL = BLOCKS.register("deepslate_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DEEPSLATE_BRICK_PILLAR_WALL = BLOCKS.register("deepslate_brick_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> QUARTZ_PILLAR_WALL = BLOCKS.register("quartz_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MUD_BRICK_PILLAR_WALL = BLOCKS.register("mud_brick_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PRISMARINE_PILLAR_WALL = BLOCKS.register("prismarine_pillar_wall", () -> new FenceBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> STONE_GRASS_TOPPED_WALL = BLOCKS.register("stone_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> ANDESITE_GRASS_TOPPED_WALL = BLOCKS.register("andesite_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIORITE_GRASS_TOPPED_WALL = BLOCKS.register("diorite_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GRANITE_GRASS_TOPPED_WALL = BLOCKS.register("granite_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> SANDSTONE_GRASS_TOPPED_WALL = BLOCKS.register("sandstone_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RED_SANDSTONE_GRASS_TOPPED_WALL = BLOCKS.register("red_sandstone_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BLACKSTONE_GRASS_TOPPED_WALL = BLOCKS.register("blackstone_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> NETHER_BRICK_GRASS_TOPPED_WALL = BLOCKS.register("nether_brick_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> END_BRICK_GRASS_TOPPED_WALL = BLOCKS.register("end_brick_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DEEPSLATE_GRASS_TOPPED_WALL = BLOCKS.register("deepslate_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DEEPSLATE_BRICK_GRASS_TOPPED_WALL = BLOCKS.register("deepslate_brick_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> QUARTZ_GRASS_TOPPED_WALL = BLOCKS.register("quartz_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> MUD_BRICK_GRASS_TOPPED_WALL = BLOCKS.register("mud_brick_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PRISMARINE_GRASS_TOPPED_WALL = BLOCKS.register("prismarine_grass_topped_wall", () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

	public static final RegistryObject<Block> WOODEN_CHEVAL_DE_FRISE = BLOCKS.register("wooden_cheval_de_frise", () -> new WiredFence(Block.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(1.0F, 3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> IRON_CHEVAL_DE_FRISE = BLOCKS.register("iron_cheval_de_frise", () -> new StoneWiredFence(Block.Properties.of().mapColor(MapColor.METAL).strength(2.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

	
}
