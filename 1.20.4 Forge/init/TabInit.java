package com.mcwfences.kikoz.init;

import com.mcwfences.kikoz.MacawsFences;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TabInit {
	
	public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MacawsFences.MOD_ID);

	public static final RegistryObject<CreativeModeTab> FENCEITEMGROUP = CREATIVE_TABS.register("fenceitemgroup", () -> CreativeModeTab.builder()
			.title(Component.translatable("itemGroup." + MacawsFences.MOD_ID))
			.icon(() -> new ItemStack(BlockInit.OAK_PICKET_FENCE.get()))
			.displayItems((enabledFeatures, entries) -> {
				entries.accept(BlockInit.OAK_PICKET_FENCE.get());
				entries.accept(BlockInit.SPRUCE_PICKET_FENCE.get());
				entries.accept(BlockInit.BIRCH_PICKET_FENCE.get());
				entries.accept(BlockInit.JUNGLE_PICKET_FENCE.get());
				entries.accept(BlockInit.ACACIA_PICKET_FENCE.get());
				entries.accept(BlockInit.DARK_OAK_PICKET_FENCE.get());
				entries.accept(BlockInit.CRIMSON_PICKET_FENCE.get());
				entries.accept(BlockInit.WARPED_PICKET_FENCE.get());
				entries.accept(BlockInit.MANGROVE_PICKET_FENCE.get());
				entries.accept(BlockInit.CHERRY_PICKET_FENCE.get());
				entries.accept(BlockInit.BAMBOO_PICKET_FENCE.get());
				
				entries.accept(BlockInit.OAK_STOCKADE_FENCE.get());
				entries.accept(BlockInit.SPRUCE_STOCKADE_FENCE.get());
				entries.accept(BlockInit.BIRCH_STOCKADE_FENCE.get());
				entries.accept(BlockInit.JUNGLE_STOCKADE_FENCE.get());
				entries.accept(BlockInit.ACACIA_STOCKADE_FENCE.get());
				entries.accept(BlockInit.DARK_OAK_STOCKADE_FENCE.get());
				entries.accept(BlockInit.CRIMSON_STOCKADE_FENCE.get());
				entries.accept(BlockInit.WARPED_STOCKADE_FENCE.get());
				entries.accept(BlockInit.MANGROVE_STOCKADE_FENCE.get());
				entries.accept(BlockInit.CHERRY_STOCKADE_FENCE.get());
				entries.accept(BlockInit.BAMBOO_STOCKADE_FENCE.get());
			
				entries.accept(BlockInit.OAK_HORSE_FENCE.get());
				entries.accept(BlockInit.SPRUCE_HORSE_FENCE.get());
				entries.accept(BlockInit.BIRCH_HORSE_FENCE.get());
				entries.accept(BlockInit.JUNGLE_HORSE_FENCE.get());
				entries.accept(BlockInit.ACACIA_HORSE_FENCE.get());
				entries.accept(BlockInit.DARK_OAK_HORSE_FENCE.get());
				entries.accept(BlockInit.CRIMSON_HORSE_FENCE.get());
				entries.accept(BlockInit.WARPED_HORSE_FENCE.get());
				entries.accept(BlockInit.MANGROVE_HORSE_FENCE.get());
				entries.accept(BlockInit.CHERRY_HORSE_FENCE.get());
				entries.accept(BlockInit.BAMBOO_HORSE_FENCE.get());

				
				entries.accept(BlockInit.OAK_WIRED_FENCE.get());
				entries.accept(BlockInit.SPRUCE_WIRED_FENCE.get());
				entries.accept(BlockInit.BIRCH_WIRED_FENCE.get());
				entries.accept(BlockInit.JUNGLE_WIRED_FENCE.get());
				entries.accept(BlockInit.ACACIA_WIRED_FENCE.get());
				entries.accept(BlockInit.DARK_OAK_WIRED_FENCE.get());
				entries.accept(BlockInit.CRIMSON_WIRED_FENCE.get());
				entries.accept(BlockInit.WARPED_WIRED_FENCE.get());
				entries.accept(BlockInit.MANGROVE_WIRED_FENCE.get());
				entries.accept(BlockInit.CHERRY_WIRED_FENCE.get());
				entries.accept(BlockInit.BAMBOO_WIRED_FENCE.get());
				
				entries.accept(BlockInit.OAK_HEDGE.get());
				entries.accept(BlockInit.SPRUCE_HEDGE.get());
				entries.accept(BlockInit.BIRCH_HEDGE.get());
				entries.accept(BlockInit.JUNGLE_HEDGE.get());
				entries.accept(BlockInit.ACACIA_HEDGE.get());
				entries.accept(BlockInit.DARK_OAK_HEDGE.get());
				entries.accept(BlockInit.MANGROVE_HEDGE.get());
				entries.accept(BlockInit.AZALEA_HEDGE.get());
				entries.accept(BlockInit.FLOWERING_AZALEA_HEDGE.get());
				entries.accept(BlockInit.CHERRY_HEDGE.get());
				
				entries.accept(BlockInit.BAMBOO_FENCE.get());
				
				entries.accept(BlockInit.OAK_HIGHLEY_GATE.get());
				entries.accept(BlockInit.SPRUCE_HIGHLEY_GATE.get());
				entries.accept(BlockInit.BIRCH_HIGHLEY_GATE.get());
				entries.accept(BlockInit.JUNGLE_HIGHLEY_GATE.get());
				entries.accept(BlockInit.ACACIA_HIGHLEY_GATE.get());
				entries.accept(BlockInit.DARK_OAK_HIGHLEY_GATE.get());
				entries.accept(BlockInit.CRIMSON_HIGHLEY_GATE.get());
				entries.accept(BlockInit.WARPED_HIGHLEY_GATE.get());
				entries.accept(BlockInit.MANGROVE_HIGHLEY_GATE.get());
				entries.accept(BlockInit.CHERRY_HIGHLEY_GATE.get());
				entries.accept(BlockInit.BAMBOO_HIGHLEY_GATE.get());
				
				entries.accept(BlockInit.OAK_PYRAMID_GATE.get());
				entries.accept(BlockInit.SPRUCE_PYRAMID_GATE.get());
				entries.accept(BlockInit.BIRCH_PYRAMID_GATE.get());
				entries.accept(BlockInit.JUNGLE_PYRAMID_GATE.get());
				entries.accept(BlockInit.ACACIA_PYRAMID_GATE.get());
				entries.accept(BlockInit.DARK_OAK_PYRAMID_GATE.get());
				entries.accept(BlockInit.CRIMSON_PYRAMID_GATE.get());
				entries.accept(BlockInit.WARPED_PYRAMID_GATE.get());
				entries.accept(BlockInit.MANGROVE_PYRAMID_GATE.get());
				entries.accept(BlockInit.CHERRY_PYRAMID_GATE.get());
				entries.accept(BlockInit.BAMBOO_PYRAMID_GATE.get());
				
				entries.accept(BlockInit.MODERN_STONE_BRICK_WALL.get());
				entries.accept(BlockInit.MODERN_ANDESITE_WALL.get());
				entries.accept(BlockInit.MODERN_DIORITE_WALL.get());
				entries.accept(BlockInit.MODERN_GRANITE_WALL.get());
				entries.accept(BlockInit.MODERN_SANDSTONE_WALL.get());
				entries.accept(BlockInit.MODERN_RED_SANDSTONE_WALL.get());
				entries.accept(BlockInit.MODERN_BLACKSTONE_WALL.get());
				entries.accept(BlockInit.MODERN_NETHER_BRICK_WALL.get());
				entries.accept(BlockInit.MODERN_END_BRICK_WALL.get());
				entries.accept(BlockInit.MODERN_DEEPSLATE_WALL.get());
				entries.accept(BlockInit.MODERN_DEEPSLATE_BRICK_WALL.get());
				entries.accept(BlockInit.MODERN_QUARTZ_WALL.get());
				entries.accept(BlockInit.MODERN_MUD_BRICK_WALL.get());
				entries.accept(BlockInit.MODERN_PRISMARINE_WALL.get());
				
				entries.accept(BlockInit.RAILING_STONE_BRICK_WALL.get());
				entries.accept(BlockInit.RAILING_ANDESITE_WALL.get());
				entries.accept(BlockInit.RAILING_DIORITE_WALL.get());
				entries.accept(BlockInit.RAILING_GRANITE_WALL.get());
				entries.accept(BlockInit.RAILING_SANDSTONE_WALL.get());
				entries.accept(BlockInit.RAILING_RED_SANDSTONE_WALL.get());
				entries.accept(BlockInit.RAILING_BLACKSTONE_WALL.get());
				entries.accept(BlockInit.RAILING_NETHER_BRICK_WALL.get());
				entries.accept(BlockInit.RAILING_END_BRICK_WALL.get());
				entries.accept(BlockInit.RAILING_DEEPSLATE_WALL.get());
				entries.accept(BlockInit.RAILING_DEEPSLATE_BRICK_WALL.get());
				entries.accept(BlockInit.RAILING_QUARTZ_WALL.get());
				entries.accept(BlockInit.RAILING_MUD_BRICK_WALL.get());
				entries.accept(BlockInit.RAILING_PRISMARINE_WALL.get());
				
				entries.accept(BlockInit.STONE_BRICK_RAILING_GATE.get());
				entries.accept(BlockInit.ANDESITE_RAILING_GATE.get());
				entries.accept(BlockInit.DIORITE_RAILING_GATE.get());
				entries.accept(BlockInit.GRANITE_RAILING_GATE.get());
				entries.accept(BlockInit.SANDSTONE_RAILING_GATE.get());
				entries.accept(BlockInit.RED_SANDSTONE_RAILING_GATE.get());
				entries.accept(BlockInit.BLACKSTONE_RAILING_GATE.get());
				entries.accept(BlockInit.BLACKSTONE_BRICK_RAILING_GATE.get());
				entries.accept(BlockInit.NETHER_BRICK_RAILING_GATE.get());
				entries.accept(BlockInit.END_BRICK_RAILING_GATE.get());
				entries.accept(BlockInit.DEEPSLATE_RAILING_GATE.get());
				entries.accept(BlockInit.DEEPSLATE_BRICK_RAILING_GATE.get());
				entries.accept(BlockInit.QUARTZ_RAILING_GATE.get());
				entries.accept(BlockInit.MUD_BRICK_RAILING_GATE.get());
				entries.accept(BlockInit.PRISMARINE_RAILING_GATE.get());
				
				entries.accept(BlockInit.STONE_PILLAR_WALL.get());
				entries.accept(BlockInit.ANDESITE_PILLAR_WALL.get());
				entries.accept(BlockInit.DIORITE_PILLAR_WALL.get());
				entries.accept(BlockInit.GRANITE_PILLAR_WALL.get());
				entries.accept(BlockInit.SANDSTONE_PILLAR_WALL.get());
				entries.accept(BlockInit.RED_SANDSTONE_PILLAR_WALL.get());
				entries.accept(BlockInit.BLACKSTONE_PILLAR_WALL.get());
				entries.accept(BlockInit.NETHER_BRICK_PILLAR_WALL.get());
				entries.accept(BlockInit.END_BRICK_PILLAR_WALL.get());
				entries.accept(BlockInit.DEEPSLATE_PILLAR_WALL.get());
				entries.accept(BlockInit.DEEPSLATE_BRICK_PILLAR_WALL.get());
				entries.accept(BlockInit.QUARTZ_PILLAR_WALL.get());
				entries.accept(BlockInit.MUD_BRICK_PILLAR_WALL.get());
				entries.accept(BlockInit.PRISMARINE_PILLAR_WALL.get());

				entries.accept(BlockInit.STONE_GRASS_TOPPED_WALL.get());
				entries.accept(BlockInit.ANDESITE_GRASS_TOPPED_WALL.get());
				entries.accept(BlockInit.DIORITE_GRASS_TOPPED_WALL.get());
				entries.accept(BlockInit.GRANITE_GRASS_TOPPED_WALL.get());
				entries.accept(BlockInit.SANDSTONE_GRASS_TOPPED_WALL.get());
				entries.accept(BlockInit.RED_SANDSTONE_GRASS_TOPPED_WALL.get());
				entries.accept(BlockInit.BLACKSTONE_GRASS_TOPPED_WALL.get());
				entries.accept(BlockInit.NETHER_BRICK_GRASS_TOPPED_WALL.get());
				entries.accept(BlockInit.END_BRICK_GRASS_TOPPED_WALL.get());
				entries.accept(BlockInit.DEEPSLATE_GRASS_TOPPED_WALL.get());
				entries.accept(BlockInit.DEEPSLATE_BRICK_GRASS_TOPPED_WALL.get());
				entries.accept(BlockInit.QUARTZ_GRASS_TOPPED_WALL.get());
				entries.accept(BlockInit.MUD_BRICK_GRASS_TOPPED_WALL.get());
				entries.accept(BlockInit.PRISMARINE_GRASS_TOPPED_WALL.get());
				
				entries.accept(BlockInit.WOODEN_CHEVAL_DE_FRISE.get());
				entries.accept(BlockInit.IRON_CHEVAL_DE_FRISE.get());
			})
			.build());
}
	  
