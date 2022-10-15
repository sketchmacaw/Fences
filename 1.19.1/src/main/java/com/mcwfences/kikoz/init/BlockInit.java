package com.mcwfences.kikoz.init;

import java.util.List;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import com.mcwfences.kikoz.MacawsFences;
import com.mcwfences.kikoz.objects.FuelItemBlock;
import com.mcwfences.kikoz.objects.WiredFence;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MacawsFences.MOD_ID);

	public static final RegistryObject<Block> OAK_PICKET_FENCE = registerBlock("oak_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> SPRUCE_PICKET_FENCE = registerBlock("spruce_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> BIRCH_PICKET_FENCE = registerBlock("birch_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> JUNGLE_PICKET_FENCE = registerBlock("jungle_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> ACACIA_PICKET_FENCE = registerBlock("acacia_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> DARK_OAK_PICKET_FENCE = registerBlock("dark_oak_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> CRIMSON_PICKET_FENCE = registerBlock("crimson_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> WARPED_PICKET_FENCE = registerBlock("warped_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MANGROVE_PICKET_FENCE = registerBlock("mangrove_picket_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);

	public static final RegistryObject<Block> OAK_STOCKADE_FENCE = registerBlock("oak_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> SPRUCE_STOCKADE_FENCE = registerBlock("spruce_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> BIRCH_STOCKADE_FENCE = registerBlock("birch_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> JUNGLE_STOCKADE_FENCE = registerBlock("jungle_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> ACACIA_STOCKADE_FENCE = registerBlock("acacia_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> DARK_OAK_STOCKADE_FENCE = registerBlock("dark_oak_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> CRIMSON_STOCKADE_FENCE = registerBlock("crimson_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> WARPED_STOCKADE_FENCE = registerBlock("warped_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MANGROVE_STOCKADE_FENCE = registerBlock("mangrove_stockade_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	
	public static final RegistryObject<Block> OAK_HORSE_FENCE = registerBlock("oak_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> SPRUCE_HORSE_FENCE = registerBlock("spruce_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> BIRCH_HORSE_FENCE = registerBlock("birch_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> JUNGLE_HORSE_FENCE = registerBlock("jungle_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> ACACIA_HORSE_FENCE = registerBlock("acacia_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> DARK_OAK_HORSE_FENCE = registerBlock("dark_oak_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> CRIMSON_HORSE_FENCE = registerBlock("crimson_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> WARPED_HORSE_FENCE = registerBlock("warped_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MANGROVE_HORSE_FENCE = registerBlock("mangrove_horse_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);

	public static final RegistryObject<Block> OAK_WIRED_FENCE = registerBlock("oak_wired_fence", () -> new WiredFence(null), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> SPRUCE_WIRED_FENCE = registerBlock("spruce_wired_fence", () -> new WiredFence(null), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> BIRCH_WIRED_FENCE = registerBlock("birch_wired_fence", () -> new WiredFence(null), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> JUNGLE_WIRED_FENCE = registerBlock("jungle_wired_fence", () -> new WiredFence(null), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> ACACIA_WIRED_FENCE = registerBlock("acacia_wired_fence", () -> new WiredFence(null), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> DARK_OAK_WIRED_FENCE = registerBlock("dark_oak_wired_fence", () -> new WiredFence(null), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> CRIMSON_WIRED_FENCE = registerBlock("crimson_wired_fence", () -> new WiredFence(null), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> WARPED_WIRED_FENCE = registerBlock("warped_wired_fence", () -> new WiredFence(null), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MANGROVE_WIRED_FENCE = registerBlock("mangrove_wired_fence", () -> new WiredFence(null), MacawsFences.FencesItemGroup);

	public static final RegistryObject<Block> BAMBOO_FENCE = registerBlock("bamboo_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_GREEN).strength(1.0F, 2.0F).sound(SoundType.SCAFFOLDING)), MacawsFences.FencesItemGroup);
	
	public static final RegistryObject<Block> OAK_HIGHLEY_GATE = registerBlock("oak_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> SPRUCE_HIGHLEY_GATE = registerBlock("spruce_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> BIRCH_HIGHLEY_GATE = registerBlock("birch_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> JUNGLE_HIGHLEY_GATE = registerBlock("jungle_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> ACACIA_HIGHLEY_GATE = registerBlock("acacia_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> DARK_OAK_HIGHLEY_GATE = registerBlock("dark_oak_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> CRIMSON_HIGHLEY_GATE = registerBlock("crimson_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> WARPED_HIGHLEY_GATE = registerBlock("warped_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MANGROVE_HIGHLEY_GATE = registerBlock("mangrove_highley_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);

	public static final RegistryObject<Block> OAK_PYRAMID_GATE = registerBlock("oak_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> SPRUCE_PYRAMID_GATE = registerBlock("spruce_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> BIRCH_PYRAMID_GATE = registerBlock("birch_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> JUNGLE_PYRAMID_GATE = registerBlock("jungle_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> ACACIA_PYRAMID_GATE = registerBlock("acacia_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> DARK_OAK_PYRAMID_GATE = registerBlock("dark_oak_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> CRIMSON_PYRAMID_GATE = registerBlock("crimson_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.CRIMSON_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> WARPED_PYRAMID_GATE = registerBlock("warped_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MANGROVE_PYRAMID_GATE = registerBlock("mangrove_pyramid_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WARPED_STEM).strength(1.8F, 3.0F).sound(SoundType.WOOD)), MacawsFences.FencesItemGroup);

	public static final RegistryObject<Block> MODERN_STONE_BRICK_WALL = registerBlock("modern_stone_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MODERN_ANDESITE_WALL = registerBlock("modern_andesite_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MODERN_DIORITE_WALL = registerBlock("modern_diorite_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MODERN_GRANITE_WALL = registerBlock("modern_granite_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MODERN_SANDSTONE_WALL = registerBlock("modern_sandstone_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.SAND).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MODERN_RED_SANDSTONE_WALL = registerBlock("modern_red_sandstone_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MODERN_BLACKSTONE_WALL = registerBlock("modern_blackstone_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MODERN_NETHER_BRICK_WALL = registerBlock("modern_nether_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MODERN_END_BRICK_WALL = registerBlock("modern_end_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MODERN_DEEPSLATE_WALL = registerBlock("modern_deepslate_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MODERN_DEEPSLATE_BRICK_WALL = registerBlock("modern_deepslate_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MODERN_QUARTZ_WALL = registerBlock("modern_quartz_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MODERN_MUD_BRICK_WALL = registerBlock("modern_mud_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	
	public static final RegistryObject<Block> RAILING_STONE_BRICK_WALL = registerBlock("railing_stone_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> RAILING_ANDESITE_WALL = registerBlock("railing_andesite_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> RAILING_DIORITE_WALL = registerBlock("railing_diorite_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> RAILING_GRANITE_WALL = registerBlock("railing_granite_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> RAILING_SANDSTONE_WALL = registerBlock("railing_sandstone_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> RAILING_RED_SANDSTONE_WALL = registerBlock("railing_red_sandstone_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> RAILING_BLACKSTONE_WALL = registerBlock("railing_blackstone_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> RAILING_NETHER_BRICK_WALL = registerBlock("railing_nether_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> RAILING_END_BRICK_WALL = registerBlock("railing_end_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> RAILING_DEEPSLATE_WALL = registerBlock("railing_deepslate_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> RAILING_DEEPSLATE_BRICK_WALL = registerBlock("railing_deepslate_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> RAILING_QUARTZ_WALL = registerBlock("railing_quartz_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> RAILING_MUD_BRICK_WALL = registerBlock("railing_mud_brick_wall", () -> new FenceBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	
	public static final RegistryObject<Block> STONE_BRICK_RAILING_GATE = registerBlock("stone_brick_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> ANDESITE_RAILING_GATE = registerBlock("andesite_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> DIORITE_RAILING_GATE = registerBlock("diorite_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> GRANITE_RAILING_GATE = registerBlock("granite_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> SANDSTONE_RAILING_GATE = registerBlock("sandstone_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> RED_SANDSTONE_RAILING_GATE = registerBlock("red_sandstone_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> BLACKSTONE_RAILING_GATE = registerBlock("blackstone_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> BLACKSTONE_BRICK_RAILING_GATE = registerBlock("blackstone_brick_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> NETHER_BRICK_RAILING_GATE = registerBlock("nether_brick_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.NETHER).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> END_BRICK_RAILING_GATE = registerBlock("end_brick_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> DEEPSLATE_RAILING_GATE = registerBlock("deepslate_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> DEEPSLATE_BRICK_RAILING_GATE = registerBlock("deepslate_brick_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> QUARTZ_RAILING_GATE = registerBlock("quartz_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	public static final RegistryObject<Block> MUD_BRICK_RAILING_GATE = registerBlock("mud_brick_railing_gate", () -> new FenceGateBlock(Block.Properties.of(Material.STONE, MaterialColor.QUARTZ).strength(3.0F, 6.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()), MacawsFences.FencesItemGroup);
	
	
    @SuppressWarnings("unused")
	private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    @SuppressWarnings("unused")
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltipKey) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(Component.translatable(tooltipKey));
            }
        });
    }

    @SuppressWarnings("unused")
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
    
    	//checks if it is wood to change the item to be able to put it in furnace
    	if (name.contains("oak") || name.contains("birch") || name.contains("spruce") || name.contains("jungle") || name.contains("acacia") || name.contains("warped") || name.contains("crimson") || name.contains("mangrove") || name.contains("bamboo")) {
            return ItemInit.ITEMS.register(name, () -> new FuelItemBlock(block.get(),
                    new Item.Properties().tab(tab)));
    	} else {
            return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)));
    	}
    }
  
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
