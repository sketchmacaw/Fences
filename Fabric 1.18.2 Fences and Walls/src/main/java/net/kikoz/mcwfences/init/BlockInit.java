package net.kikoz.mcwfences.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kikoz.mcwfences.MacawsFences;
import net.kikoz.mcwfences.objects.*;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class BlockInit {

    public static final Block OAK_PICKET_FENCE = registerBlock("oak_picket_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block SPRUCE_PICKET_FENCE = registerBlock("spruce_picket_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block BIRCH_PICKET_FENCE = registerBlock("birch_picket_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block JUNGLE_PICKET_FENCE = registerBlock("jungle_picket_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block ACACIA_PICKET_FENCE = registerBlock("acacia_picket_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block DARK_OAK_PICKET_FENCE = registerBlock("dark_oak_picket_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block CRIMSON_PICKET_FENCE = registerBlock("crimson_picket_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block WARPED_PICKET_FENCE = registerBlock("warped_picket_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);

    public static final Block OAK_STOCKADE_FENCE = registerBlock("oak_stockade_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block SPRUCE_STOCKADE_FENCE = registerBlock("spruce_stockade_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block BIRCH_STOCKADE_FENCE = registerBlock("birch_stockade_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block JUNGLE_STOCKADE_FENCE = registerBlock("jungle_stockade_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block ACACIA_STOCKADE_FENCE = registerBlock("acacia_stockade_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block DARK_OAK_STOCKADE_FENCE = registerBlock("dark_oak_stockade_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block CRIMSON_STOCKADE_FENCE = registerBlock("crimson_stockade_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block WARPED_STOCKADE_FENCE = registerBlock("warped_stockade_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);

    public static final Block OAK_HORSE_FENCE = registerBlock("oak_horse_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block SPRUCE_HORSE_FENCE = registerBlock("spruce_horse_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block BIRCH_HORSE_FENCE = registerBlock("birch_horse_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block JUNGLE_HORSE_FENCE = registerBlock("jungle_horse_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block ACACIA_HORSE_FENCE = registerBlock("acacia_horse_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block DARK_OAK_HORSE_FENCE = registerBlock("dark_oak_horse_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block CRIMSON_HORSE_FENCE = registerBlock("crimson_horse_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block WARPED_HORSE_FENCE = registerBlock("warped_horse_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);

    public static final Block OAK_WIRED_FENCE = registerBlock("oak_wired_fence", new WiredFence(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.5f, 2.5f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block SPRUCE_WIRED_FENCE = registerBlock("spruce_wired_fence", new WiredFence(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.5f, 2.5f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block BIRCH_WIRED_FENCE = registerBlock("birch_wired_fence", new WiredFence(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.5f, 2.5f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block JUNGLE_WIRED_FENCE = registerBlock("jungle_wired_fence", new WiredFence(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.5f, 2.5f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block ACACIA_WIRED_FENCE = registerBlock("acacia_wired_fence", new WiredFence(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.5f, 2.5f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block DARK_OAK_WIRED_FENCE = registerBlock("dark_oak_wired_fence", new WiredFence(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.5f, 2.5f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block CRIMSON_WIRED_FENCE = registerBlock("crimson_wired_fence", new WiredFence(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.5f, 2.5f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block WARPED_WIRED_FENCE = registerBlock("warped_wired_fence", new WiredFence(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.5f, 2.5f).nonOpaque()), FencesGroup.FENCESGROUP);

    public static final Block BAMBOO_FENCE = registerBlock("bamboo_fence", new FenceBlock(FabricBlockSettings.of(Material.WOOD, MapColor.EMERALD_GREEN).sounds(BlockSoundGroup.SCAFFOLDING).strength(1.0f, 1.8f).nonOpaque()), FencesGroup.FENCESGROUP);

    public static final Block OAK_HIGHLEY_GATE = registerBlock("oak_highley_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block SPRUCE_HIGHLEY_GATE = registerBlock("spruce_highley_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block BIRCH_HIGHLEY_GATE = registerBlock("birch_highley_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block JUNGLE_HIGHLEY_GATE = registerBlock("jungle_highley_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block ACACIA_HIGHLEY_GATE = registerBlock("acacia_highley_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block DARK_OAK_HIGHLEY_GATE = registerBlock("dark_oak_highley_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block CRIMSON_HIGHLEY_GATE = registerBlock("crimson_highley_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block WARPED_HIGHLEY_GATE = registerBlock("warped_highley_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);

    public static final Block OAK_PYRAMID_GATE = registerBlock("oak_pyramid_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block SPRUCE_PYRAMID_GATE = registerBlock("spruce_pyramid_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block BIRCH_PYRAMID_GATE = registerBlock("birch_pyramid_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block JUNGLE_PYRAMID_GATE = registerBlock("jungle_pyramid_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block ACACIA_PYRAMID_GATE = registerBlock("acacia_pyramid_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block DARK_OAK_PYRAMID_GATE = registerBlock("dark_oak_pyramid_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block CRIMSON_PYRAMID_GATE = registerBlock("crimson_pyramid_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_CRIMSON).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block WARPED_PYRAMID_GATE = registerBlock("warped_pyramid_gate", new FenceGateBlock(FabricBlockSettings.of(Material.WOOD, MapColor.CYAN).sounds(BlockSoundGroup.WOOD).strength(1.8f, 3.0f).nonOpaque()), FencesGroup.FENCESGROUP);

    public static final Block MODERN_STONE_BRICK_WALL = registerBlock("modern_stone_brick_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block MODERN_ANDESITE_WALL = registerBlock("modern_andesite_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block MODERN_DIORITE_WALL = registerBlock("modern_diorite_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block MODERN_GRANITE_WALL = registerBlock("modern_granite_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block MODERN_SANDSTONE_WALL = registerBlock("modern_sandstone_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block MODERN_RED_SANDSTONE_WALL = registerBlock("modern_red_sandstone_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.DULL_RED).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block MODERN_BLACKSTONE_WALL = registerBlock("modern_blackstone_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block MODERN_NETHER_BRICK_WALL = registerBlock("modern_nether_brick_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.DULL_RED).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block MODERN_END_BRICK_WALL = registerBlock("modern_end_brick_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block MODERN_DEEPSLATE_BRICK_WALL = registerBlock("modern_deepslate_brick_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.DEEPSLATE_GRAY).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block MODERN_DEEPSLATE_WALL = registerBlock("modern_deepslate_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.DEEPSLATE_GRAY).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block MODERN_QUARTZ_WALL = registerBlock("modern_quartz_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);


    public static final Block RAILING_STONE_BRICK_WALL = registerBlock("railing_stone_brick_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block RAILING_ANDESITE_WALL = registerBlock("railing_andesite_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block RAILING_DIORITE_WALL = registerBlock("railing_diorite_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block RAILING_GRANITE_WALL = registerBlock("railing_granite_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block RAILING_SANDSTONE_WALL = registerBlock("railing_sandstone_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block RAILING_RED_SANDSTONE_WALL = registerBlock("railing_red_sandstone_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.DULL_RED).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block RAILING_BLACKSTONE_WALL = registerBlock("railing_blackstone_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block RAILING_NETHER_BRICK_WALL = registerBlock("railing_nether_brick_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.DULL_RED).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block RAILING_END_BRICK_WALL = registerBlock("railing_end_brick_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block RAILING_DEEPSLATE_BRICK_WALL = registerBlock("railing_deepslate_brick_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.DEEPSLATE_GRAY).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block RAILING_DEEPSLATE_WALL = registerBlock("railing_deepslate_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.DEEPSLATE_GRAY).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block RAILING_QUARTZ_WALL = registerBlock("railing_quartz_wall", new FenceBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).requiresTool().sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);


    public static final Block STONE_BRICK_RAILING_GATE = registerBlock("stone_brick_railing_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block ANDESITE_RAILING_GATE = registerBlock("andesite_railing_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block DIORITE_RAILING_GATE = registerBlock("diorite_railing_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block GRANITE_RAILING_GATE = registerBlock("granite_railing_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block SANDSTONE_RAILING_GATE = registerBlock("sandstone_railing_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block RED_SANDSTONE_RAILING_GATE = registerBlock("red_sandstone_railing_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE, MapColor.DULL_RED).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block BLACKSTONE_RAILING_GATE = registerBlock("blackstone_railing_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block BLACKSTONE_BRICK_RAILING_GATE = registerBlock("blackstone_brick_railing_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block NETHER_BRICK_RAILING_GATE = registerBlock("nether_brick_railing_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE, MapColor.DULL_RED).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block END_BRICK_RAILING_GATE = registerBlock("end_brick_railing_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block DEEPSLATE_RAILING_GATE = registerBlock("deepslate_railing_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE, MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block DEEPSLATE_BRICK_RAILING_GATE = registerBlock("deepslate_brick_railing_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE, MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);
    public static final Block QUARTZ_RAILING_GATE = registerBlock("quartz_railing_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).sounds(BlockSoundGroup.STONE).strength(3.0f, 6.0f).nonOpaque()), FencesGroup.FENCESGROUP);


    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(MacawsFences.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(MacawsFences.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(new TranslatableText(tooltipKey));
                    }
                });
    }


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MacawsFences.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MacawsFences.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MacawsFences.LOGGER.info("Registering ModBlocks for " + MacawsFences.MOD_ID);
    }
}
