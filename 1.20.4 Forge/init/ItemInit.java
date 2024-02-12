package com.mcwfences.kikoz.init;

import com.mcwfences.kikoz.MacawsFences;
import com.mcwfences.kikoz.objects.FuelItemBlock;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsFences.MOD_ID);

	public static final RegistryObject<Item> OAK_PICKET_FENCE = ITEMS.register("oak_picket_fence", () -> new FuelItemBlock(BlockInit.OAK_PICKET_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_PICKET_FENCE = ITEMS.register("spruce_picket_fence", () -> new FuelItemBlock(BlockInit.SPRUCE_PICKET_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_PICKET_FENCE = ITEMS.register("birch_picket_fence", () -> new FuelItemBlock(BlockInit.BIRCH_PICKET_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_PICKET_FENCE = ITEMS.register("jungle_picket_fence", () -> new FuelItemBlock(BlockInit.JUNGLE_PICKET_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_PICKET_FENCE = ITEMS.register("acacia_picket_fence", () -> new FuelItemBlock(BlockInit.ACACIA_PICKET_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_PICKET_FENCE = ITEMS.register("dark_oak_picket_fence", () -> new FuelItemBlock(BlockInit.DARK_OAK_PICKET_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_PICKET_FENCE = ITEMS.register("crimson_picket_fence", () -> new FuelItemBlock(BlockInit.CRIMSON_PICKET_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_PICKET_FENCE = ITEMS.register("warped_picket_fence", () -> new FuelItemBlock(BlockInit.WARPED_PICKET_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_PICKET_FENCE = ITEMS.register("mangrove_picket_fence", () -> new FuelItemBlock(BlockInit.MANGROVE_PICKET_FENCE.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> OAK_STOCKADE_FENCE = ITEMS.register("oak_stockade_fence", () -> new FuelItemBlock(BlockInit.OAK_STOCKADE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_STOCKADE_FENCE = ITEMS.register("spruce_stockade_fence", () -> new FuelItemBlock(BlockInit.SPRUCE_STOCKADE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_STOCKADE_FENCE = ITEMS.register("birch_stockade_fence", () -> new FuelItemBlock(BlockInit.BIRCH_STOCKADE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_STOCKADE_FENCE = ITEMS.register("jungle_stockade_fence", () -> new FuelItemBlock(BlockInit.JUNGLE_STOCKADE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_STOCKADE_FENCE = ITEMS.register("acacia_stockade_fence", () -> new FuelItemBlock(BlockInit.ACACIA_STOCKADE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_STOCKADE_FENCE = ITEMS.register("dark_oak_stockade_fence", () -> new FuelItemBlock(BlockInit.DARK_OAK_STOCKADE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_STOCKADE_FENCE = ITEMS.register("crimson_stockade_fence", () -> new FuelItemBlock(BlockInit.CRIMSON_STOCKADE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_STOCKADE_FENCE = ITEMS.register("warped_stockade_fence", () -> new FuelItemBlock(BlockInit.WARPED_STOCKADE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_STOCKADE_FENCE = ITEMS.register("mangrove_stockade_fence", () -> new FuelItemBlock(BlockInit.MANGROVE_STOCKADE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_HORSE_FENCE = ITEMS.register("oak_horse_fence", () -> new FuelItemBlock(BlockInit.OAK_HORSE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_HORSE_FENCE = ITEMS.register("spruce_horse_fence", () -> new FuelItemBlock(BlockInit.SPRUCE_HORSE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_HORSE_FENCE = ITEMS.register("birch_horse_fence", () -> new FuelItemBlock(BlockInit.BIRCH_HORSE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_HORSE_FENCE = ITEMS.register("jungle_horse_fence", () -> new FuelItemBlock(BlockInit.JUNGLE_HORSE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_HORSE_FENCE = ITEMS.register("acacia_horse_fence", () -> new FuelItemBlock(BlockInit.ACACIA_HORSE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_HORSE_FENCE = ITEMS.register("dark_oak_horse_fence", () -> new FuelItemBlock(BlockInit.DARK_OAK_HORSE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_HORSE_FENCE = ITEMS.register("crimson_horse_fence", () -> new FuelItemBlock(BlockInit.CRIMSON_HORSE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_HORSE_FENCE = ITEMS.register("warped_horse_fence", () -> new FuelItemBlock(BlockInit.WARPED_HORSE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_HORSE_FENCE = ITEMS.register("mangrove_horse_fence", () -> new FuelItemBlock(BlockInit.MANGROVE_HORSE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_WIRED_FENCE = ITEMS.register("oak_wired_fence", () -> new FuelItemBlock(BlockInit.OAK_WIRED_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_WIRED_FENCE = ITEMS.register("spruce_wired_fence", () -> new FuelItemBlock(BlockInit.SPRUCE_WIRED_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_WIRED_FENCE = ITEMS.register("birch_wired_fence", () -> new FuelItemBlock(BlockInit.BIRCH_WIRED_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_WIRED_FENCE = ITEMS.register("jungle_wired_fence", () -> new FuelItemBlock(BlockInit.JUNGLE_WIRED_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_WIRED_FENCE = ITEMS.register("acacia_wired_fence", () -> new FuelItemBlock(BlockInit.ACACIA_WIRED_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_WIRED_FENCE = ITEMS.register("dark_oak_wired_fence", () -> new FuelItemBlock(BlockInit.DARK_OAK_WIRED_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_WIRED_FENCE = ITEMS.register("crimson_wired_fence", () -> new FuelItemBlock(BlockInit.CRIMSON_WIRED_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_WIRED_FENCE = ITEMS.register("warped_wired_fence", () -> new FuelItemBlock(BlockInit.WARPED_WIRED_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_WIRED_FENCE = ITEMS.register("mangrove_wired_fence", () -> new FuelItemBlock(BlockInit.MANGROVE_WIRED_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_HEDGE = ITEMS.register("oak_hedge", () -> new FuelItemBlock(BlockInit.OAK_HEDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_HEDGE = ITEMS.register("spruce_hedge", () -> new FuelItemBlock(BlockInit.SPRUCE_HEDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_HEDGE = ITEMS.register("birch_hedge", () -> new FuelItemBlock(BlockInit.BIRCH_HEDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_HEDGE = ITEMS.register("jungle_hedge", () -> new FuelItemBlock(BlockInit.JUNGLE_HEDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_HEDGE = ITEMS.register("acacia_hedge", () -> new FuelItemBlock(BlockInit.ACACIA_HEDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_HEDGE = ITEMS.register("dark_oak_hedge", () -> new FuelItemBlock(BlockInit.DARK_OAK_HEDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_HEDGE = ITEMS.register("mangrove_hedge", () -> new FuelItemBlock(BlockInit.MANGROVE_HEDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> AZALEA_HEDGE = ITEMS.register("azalea_hedge", () -> new FuelItemBlock(BlockInit.AZALEA_HEDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> FLOWERING_AZALEA_HEDGE = ITEMS.register("flowering_azalea_hedge", () -> new FuelItemBlock(BlockInit.FLOWERING_AZALEA_HEDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_FENCE = ITEMS.register("bamboo_fence", () -> new FuelItemBlock(BlockInit.BAMBOO_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_HIGHLEY_GATE = ITEMS.register("oak_highley_gate", () -> new FuelItemBlock(BlockInit.OAK_HIGHLEY_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_HIGHLEY_GATE = ITEMS.register("spruce_highley_gate", () -> new FuelItemBlock(BlockInit.SPRUCE_HIGHLEY_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_HIGHLEY_GATE = ITEMS.register("birch_highley_gate", () -> new FuelItemBlock(BlockInit.BIRCH_HIGHLEY_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_HIGHLEY_GATE = ITEMS.register("jungle_highley_gate", () -> new FuelItemBlock(BlockInit.JUNGLE_HIGHLEY_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_HIGHLEY_GATE = ITEMS.register("acacia_highley_gate", () -> new FuelItemBlock(BlockInit.ACACIA_HIGHLEY_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_HIGHLEY_GATE = ITEMS.register("dark_oak_highley_gate", () -> new FuelItemBlock(BlockInit.DARK_OAK_HIGHLEY_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_HIGHLEY_GATE = ITEMS.register("crimson_highley_gate", () -> new FuelItemBlock(BlockInit.CRIMSON_HIGHLEY_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_HIGHLEY_GATE = ITEMS.register("warped_highley_gate", () -> new FuelItemBlock(BlockInit.WARPED_HIGHLEY_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_HIGHLEY_GATE = ITEMS.register("mangrove_highley_gate", () -> new FuelItemBlock(BlockInit.MANGROVE_HIGHLEY_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> OAK_PYRAMID_GATE = ITEMS.register("oak_pyramid_gate", () -> new FuelItemBlock(BlockInit.OAK_PYRAMID_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SPRUCE_PYRAMID_GATE = ITEMS.register("spruce_pyramid_gate", () -> new FuelItemBlock(BlockInit.SPRUCE_PYRAMID_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BIRCH_PYRAMID_GATE = ITEMS.register("birch_pyramid_gate", () -> new FuelItemBlock(BlockInit.BIRCH_PYRAMID_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> JUNGLE_PYRAMID_GATE = ITEMS.register("jungle_pyramid_gate", () -> new FuelItemBlock(BlockInit.JUNGLE_PYRAMID_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ACACIA_PYRAMID_GATE = ITEMS.register("acacia_pyramid_gate", () -> new FuelItemBlock(BlockInit.ACACIA_PYRAMID_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DARK_OAK_PYRAMID_GATE = ITEMS.register("dark_oak_pyramid_gate", () -> new FuelItemBlock(BlockInit.DARK_OAK_PYRAMID_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CRIMSON_PYRAMID_GATE = ITEMS.register("crimson_pyramid_gate", () -> new FuelItemBlock(BlockInit.CRIMSON_PYRAMID_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> WARPED_PYRAMID_GATE = ITEMS.register("warped_pyramid_gate", () -> new FuelItemBlock(BlockInit.WARPED_PYRAMID_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MANGROVE_PYRAMID_GATE = ITEMS.register("mangrove_pyramid_gate", () -> new FuelItemBlock(BlockInit.MANGROVE_PYRAMID_GATE.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> MODERN_STONE_BRICK_WALL = ITEMS.register("modern_stone_brick_wall", () -> new BlockItem(BlockInit.MODERN_STONE_BRICK_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MODERN_ANDESITE_WALL = ITEMS.register("modern_andesite_wall", () -> new BlockItem(BlockInit.MODERN_ANDESITE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MODERN_DIORITE_WALL = ITEMS.register("modern_diorite_wall", () -> new BlockItem(BlockInit.MODERN_DIORITE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MODERN_GRANITE_WALL = ITEMS.register("modern_granite_wall", () -> new BlockItem(BlockInit.MODERN_GRANITE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MODERN_SANDSTONE_WALL = ITEMS.register("modern_sandstone_wall", () -> new BlockItem(BlockInit.MODERN_SANDSTONE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MODERN_RED_SANDSTONE_WALL = ITEMS.register("modern_red_sandstone_wall", () -> new BlockItem(BlockInit.MODERN_RED_SANDSTONE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MODERN_BLACKSTONE_WALL = ITEMS.register("modern_blackstone_wall", () -> new BlockItem(BlockInit.MODERN_BLACKSTONE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MODERN_NETHER_BRICK_WALL = ITEMS.register("modern_nether_brick_wall", () -> new BlockItem(BlockInit.MODERN_NETHER_BRICK_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MODERN_END_BRICK_WALL = ITEMS.register("modern_end_brick_wall", () -> new BlockItem(BlockInit.MODERN_END_BRICK_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MODERN_DEEPSLATE_WALL = ITEMS.register("modern_deepslate_wall", () -> new BlockItem(BlockInit.MODERN_DEEPSLATE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MODERN_DEEPSLATE_BRICK_WALL = ITEMS.register("modern_deepslate_brick_wall", () -> new BlockItem(BlockInit.MODERN_DEEPSLATE_BRICK_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MODERN_QUARTZ_WALL = ITEMS.register("modern_quartz_wall", () -> new BlockItem(BlockInit.MODERN_QUARTZ_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MODERN_MUD_BRICK_WALL = ITEMS.register("modern_mud_brick_wall", () -> new BlockItem(BlockInit.MODERN_MUD_BRICK_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MODERN_PRISMARINE_WALL = ITEMS.register("modern_prismarine_wall", () -> new BlockItem(BlockInit.MODERN_PRISMARINE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_STONE_BRICK_WALL = ITEMS.register("railing_stone_brick_wall", () -> new BlockItem(BlockInit.RAILING_STONE_BRICK_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_ANDESITE_WALL = ITEMS.register("railing_andesite_wall", () -> new BlockItem(BlockInit.RAILING_ANDESITE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_DIORITE_WALL = ITEMS.register("railing_diorite_wall", () -> new BlockItem(BlockInit.RAILING_DIORITE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_GRANITE_WALL = ITEMS.register("railing_granite_wall", () -> new BlockItem(BlockInit.RAILING_GRANITE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_SANDSTONE_WALL = ITEMS.register("railing_sandstone_wall", () -> new BlockItem(BlockInit.RAILING_SANDSTONE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_RED_SANDSTONE_WALL = ITEMS.register("railing_red_sandstone_wall", () -> new BlockItem(BlockInit.RAILING_RED_SANDSTONE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_BLACKSTONE_WALL = ITEMS.register("railing_blackstone_wall", () -> new BlockItem(BlockInit.RAILING_BLACKSTONE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_NETHER_BRICK_WALL = ITEMS.register("railing_nether_brick_wall", () -> new BlockItem(BlockInit.RAILING_NETHER_BRICK_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_END_BRICK_WALL = ITEMS.register("railing_end_brick_wall", () -> new BlockItem(BlockInit.RAILING_END_BRICK_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_DEEPSLATE_WALL = ITEMS.register("railing_deepslate_wall", () -> new BlockItem(BlockInit.RAILING_DEEPSLATE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_DEEPSLATE_BRICK_WALL = ITEMS.register("railing_deepslate_brick_wall", () -> new BlockItem(BlockInit.RAILING_DEEPSLATE_BRICK_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_QUARTZ_WALL = ITEMS.register("railing_quartz_wall", () -> new BlockItem(BlockInit.RAILING_QUARTZ_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_MUD_BRICK_WALL = ITEMS.register("railing_mud_brick_wall", () -> new BlockItem(BlockInit.RAILING_MUD_BRICK_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RAILING_PRISMARINE_WALL = ITEMS.register("railing_prismarine_wall", () -> new BlockItem(BlockInit.RAILING_PRISMARINE_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> STONE_BRICK_RAILING_GATE = ITEMS.register("stone_brick_railing_gate", () -> new BlockItem(BlockInit.STONE_BRICK_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> ANDESITE_RAILING_GATE = ITEMS.register("andesite_railing_gate", () -> new BlockItem(BlockInit.ANDESITE_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIORITE_RAILING_GATE = ITEMS.register("diorite_railing_gate", () -> new BlockItem(BlockInit.DIORITE_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> GRANITE_RAILING_GATE = ITEMS.register("granite_railing_gate", () -> new BlockItem(BlockInit.GRANITE_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> SANDSTONE_RAILING_GATE = ITEMS.register("sandstone_railing_gate", () -> new BlockItem(BlockInit.SANDSTONE_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> RED_SANDSTONE_RAILING_GATE = ITEMS.register("red_sandstone_railing_gate", () -> new BlockItem(BlockInit.RED_SANDSTONE_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BLACKSTONE_RAILING_GATE = ITEMS.register("blackstone_railing_gate", () -> new BlockItem(BlockInit.BLACKSTONE_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BLACKSTONE_BRICK_RAILING_GATE = ITEMS.register("blackstone_brick_railing_gate", () -> new BlockItem(BlockInit.BLACKSTONE_BRICK_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHER_BRICK_RAILING_GATE = ITEMS.register("nether_brick_railing_gate", () -> new BlockItem(BlockInit.NETHER_BRICK_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> END_BRICK_RAILING_GATE = ITEMS.register("end_brick_railing_gate", () -> new BlockItem(BlockInit.END_BRICK_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_RAILING_GATE = ITEMS.register("deepslate_railing_gate", () -> new BlockItem(BlockInit.DEEPSLATE_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_BRICK_RAILING_GATE = ITEMS.register("deepslate_brick_railing_gate", () -> new BlockItem(BlockInit.DEEPSLATE_BRICK_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> QUARTZ_RAILING_GATE = ITEMS.register("quartz_railing_gate", () -> new BlockItem(BlockInit.QUARTZ_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> MUD_BRICK_RAILING_GATE = ITEMS.register("mud_brick_railing_gate", () -> new BlockItem(BlockInit.MUD_BRICK_RAILING_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> PRISMARINE_RAILING_GATE = ITEMS.register("prismarine_railing_gate", () -> new BlockItem(BlockInit.PRISMARINE_RAILING_GATE.get(), new Item.Properties()));

	//1.20
	
	public static final RegistryObject<Item> CHERRY_PICKET_FENCE = ITEMS.register("cherry_picket_fence", () -> new FuelItemBlock(BlockInit.CHERRY_PICKET_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CHERRY_STOCKADE_FENCE = ITEMS.register("cherry_stockade_fence", () -> new FuelItemBlock(BlockInit.CHERRY_STOCKADE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CHERRY_HORSE_FENCE = ITEMS.register("cherry_horse_fence", () -> new FuelItemBlock(BlockInit.CHERRY_HORSE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CHERRY_WIRED_FENCE = ITEMS.register("cherry_wired_fence", () -> new FuelItemBlock(BlockInit.CHERRY_WIRED_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CHERRY_HEDGE = ITEMS.register("cherry_hedge", () -> new FuelItemBlock(BlockInit.CHERRY_HEDGE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CHERRY_HIGHLEY_GATE = ITEMS.register("cherry_highley_gate", () -> new FuelItemBlock(BlockInit.CHERRY_HIGHLEY_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> CHERRY_PYRAMID_GATE = ITEMS.register("cherry_pyramid_gate", () -> new FuelItemBlock(BlockInit.CHERRY_PYRAMID_GATE.get(), new Item.Properties()));
	
	public static final RegistryObject<Item> BAMBOO_PICKET_FENCE = ITEMS.register("bamboo_picket_fence", () -> new FuelItemBlock(BlockInit.BAMBOO_PICKET_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_STOCKADE_FENCE = ITEMS.register("bamboo_stockade_fence", () -> new FuelItemBlock(BlockInit.BAMBOO_STOCKADE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_HORSE_FENCE = ITEMS.register("bamboo_horse_fence", () -> new FuelItemBlock(BlockInit.BAMBOO_HORSE_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_WIRED_FENCE = ITEMS.register("bamboo_wired_fence", () -> new FuelItemBlock(BlockInit.BAMBOO_WIRED_FENCE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_HIGHLEY_GATE = ITEMS.register("bamboo_highley_gate", () -> new FuelItemBlock(BlockInit.BAMBOO_HIGHLEY_GATE.get(), new Item.Properties()));
	public static final RegistryObject<Item> BAMBOO_PYRAMID_GATE = ITEMS.register("bamboo_pyramid_gate", () -> new FuelItemBlock(BlockInit.BAMBOO_PYRAMID_GATE.get(), new Item.Properties()));

	
	public static final RegistryObject<Item> STONE_PILLAR_WALL = ITEMS.register("stone_pillar_wall", () -> new BlockItem(BlockInit.STONE_PILLAR_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> ANDESITE_PILLAR_WALL = ITEMS.register("andesite_pillar_wall", () -> new BlockItem(BlockInit.ANDESITE_PILLAR_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIORITE_PILLAR_WALL = ITEMS.register("diorite_pillar_wall", () -> new BlockItem(BlockInit.DIORITE_PILLAR_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> GRANITE_PILLAR_WALL = ITEMS.register("granite_pillar_wall", () -> new BlockItem(BlockInit.GRANITE_PILLAR_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> SANDSTONE_PILLAR_WALL = ITEMS.register("sandstone_pillar_wall", () -> new BlockItem(BlockInit.SANDSTONE_PILLAR_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RED_SANDSTONE_PILLAR_WALL = ITEMS.register("red_sandstone_pillar_wall", () -> new BlockItem(BlockInit.RED_SANDSTONE_PILLAR_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> BLACKSTONE_PILLAR_WALL = ITEMS.register("blackstone_pillar_wall", () -> new BlockItem(BlockInit.BLACKSTONE_PILLAR_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHER_BRICK_PILLAR_WALL = ITEMS.register("nether_brick_pillar_wall", () -> new BlockItem(BlockInit.NETHER_BRICK_PILLAR_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> END_BRICK_PILLAR_WALL = ITEMS.register("end_brick_pillar_wall", () -> new BlockItem(BlockInit.END_BRICK_PILLAR_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_PILLAR_WALL = ITEMS.register("deepslate_pillar_wall", () -> new BlockItem(BlockInit.DEEPSLATE_PILLAR_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_BRICK_PILLAR_WALL = ITEMS.register("deepslate_brick_pillar_wall", () -> new BlockItem(BlockInit.DEEPSLATE_BRICK_PILLAR_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> QUARTZ_PILLAR_WALL = ITEMS.register("quartz_pillar_wall", () -> new BlockItem(BlockInit.QUARTZ_PILLAR_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MUD_BRICK_PILLAR_WALL = ITEMS.register("mud_brick_pillar_wall", () -> new BlockItem(BlockInit.MUD_BRICK_PILLAR_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> PRISMARINE_PILLAR_WALL = ITEMS.register("prismarine_pillar_wall", () -> new BlockItem(BlockInit.PRISMARINE_PILLAR_WALL.get(), new Item.Properties()));

	public static final RegistryObject<Item> STONE_GRASS_TOPPED_WALL = ITEMS.register("stone_grass_topped_wall", () -> new BlockItem(BlockInit.STONE_GRASS_TOPPED_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> ANDESITE_GRASS_TOPPED_WALL = ITEMS.register("andesite_grass_topped_wall", () -> new BlockItem(BlockInit.ANDESITE_GRASS_TOPPED_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> DIORITE_GRASS_TOPPED_WALL = ITEMS.register("diorite_grass_topped_wall", () -> new BlockItem(BlockInit.DIORITE_GRASS_TOPPED_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> GRANITE_GRASS_TOPPED_WALL = ITEMS.register("granite_grass_topped_wall", () -> new BlockItem(BlockInit.GRANITE_GRASS_TOPPED_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> SANDSTONE_GRASS_TOPPED_WALL = ITEMS.register("sandstone_grass_topped_wall", () -> new BlockItem(BlockInit.SANDSTONE_GRASS_TOPPED_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> RED_SANDSTONE_GRASS_TOPPED_WALL = ITEMS.register("red_sandstone_grass_topped_wall", () -> new BlockItem(BlockInit.RED_SANDSTONE_GRASS_TOPPED_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> BLACKSTONE_GRASS_TOPPED_WALL = ITEMS.register("blackstone_grass_topped_wall", () -> new BlockItem(BlockInit.BLACKSTONE_GRASS_TOPPED_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> NETHER_BRICK_GRASS_TOPPED_WALL = ITEMS.register("nether_brick_grass_topped_wall", () -> new BlockItem(BlockInit.NETHER_BRICK_GRASS_TOPPED_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> END_BRICK_GRASS_TOPPED_WALL = ITEMS.register("end_brick_grass_topped_wall", () -> new BlockItem(BlockInit.END_BRICK_GRASS_TOPPED_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_GRASS_TOPPED_WALL = ITEMS.register("deepslate_grass_topped_wall", () -> new BlockItem(BlockInit.DEEPSLATE_GRASS_TOPPED_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> DEEPSLATE_BRICK_GRASS_TOPPED_WALL = ITEMS.register("deepslate_brick_grass_topped_wall", () -> new BlockItem(BlockInit.DEEPSLATE_BRICK_GRASS_TOPPED_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> QUARTZ_GRASS_TOPPED_WALL = ITEMS.register("quartz_grass_topped_wall", () -> new BlockItem(BlockInit.QUARTZ_GRASS_TOPPED_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> MUD_BRICK_GRASS_TOPPED_WALL = ITEMS.register("mud_brick_grass_topped_wall", () -> new BlockItem(BlockInit.MUD_BRICK_GRASS_TOPPED_WALL.get(), new Item.Properties()));
	public static final RegistryObject<Item> PRISMARINE_GRASS_TOPPED_WALL = ITEMS.register("prismarine_grass_topped_wall", () -> new BlockItem(BlockInit.PRISMARINE_GRASS_TOPPED_WALL.get(), new Item.Properties()));

	public static final RegistryObject<Item> WOODEN_CHEVAL_DE_FRISE = ITEMS.register("wooden_cheval_de_frise", () -> new FuelItemBlock(BlockInit.WOODEN_CHEVAL_DE_FRISE.get(), new Item.Properties()));
	public static final RegistryObject<Item> IRON_CHEVAL_DE_FRISE = ITEMS.register("iron_cheval_de_frise", () -> new BlockItem(BlockInit.IRON_CHEVAL_DE_FRISE.get(), new Item.Properties()));
	



	
	
}