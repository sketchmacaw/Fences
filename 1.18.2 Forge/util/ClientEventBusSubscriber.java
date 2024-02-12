package com.mcwfences.kikoz.util;

import com.mcwfences.kikoz.MacawsFences;
import com.mcwfences.kikoz.init.BlockInit;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MacawsFences.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		
		ItemBlockRenderTypes.setRenderLayer(BlockInit.OAK_WIRED_FENCE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.SPRUCE_WIRED_FENCE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BIRCH_WIRED_FENCE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.JUNGLE_WIRED_FENCE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ACACIA_WIRED_FENCE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DARK_OAK_WIRED_FENCE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CRIMSON_WIRED_FENCE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WARPED_WIRED_FENCE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_STONE_BRICK_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_ANDESITE_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_DIORITE_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_GRANITE_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_SANDSTONE_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_RED_SANDSTONE_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_BLACKSTONE_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_NETHER_BRICK_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_END_BRICK_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_DEEPSLATE_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_DEEPSLATE_BRICK_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_QUARTZ_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RAILING_PRISMARINE_WALL.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(BlockInit.OAK_HEDGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.SPRUCE_HEDGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BIRCH_HEDGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.JUNGLE_HEDGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ACACIA_HEDGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DARK_OAK_HEDGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.AZALEA_HEDGE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.FLOWERING_AZALEA_HEDGE.get(), RenderType.cutout());

		ItemBlockRenderTypes.setRenderLayer(BlockInit.OAK_PICKET_FENCE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BIRCH_PICKET_FENCE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.JUNGLE_PICKET_FENCE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ACACIA_PICKET_FENCE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DARK_OAK_PICKET_FENCE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CRIMSON_PICKET_FENCE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WARPED_PICKET_FENCE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(BlockInit.OAK_HIGHLEY_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BIRCH_HIGHLEY_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.JUNGLE_HIGHLEY_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ACACIA_HIGHLEY_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DARK_OAK_HIGHLEY_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CRIMSON_HIGHLEY_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WARPED_HIGHLEY_GATE.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(BlockInit.STONE_BRICK_RAILING_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ANDESITE_RAILING_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DIORITE_RAILING_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GRANITE_RAILING_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.SANDSTONE_RAILING_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RED_SANDSTONE_RAILING_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKSTONE_RAILING_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKSTONE_BRICK_RAILING_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.NETHER_BRICK_RAILING_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.END_BRICK_RAILING_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DEEPSLATE_RAILING_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DEEPSLATE_BRICK_RAILING_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.QUARTZ_RAILING_GATE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.PRISMARINE_RAILING_GATE.get(), RenderType.cutout());

		
		ItemBlockRenderTypes.setRenderLayer(BlockInit.STONE_PILLAR_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ANDESITE_PILLAR_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DIORITE_PILLAR_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GRANITE_PILLAR_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.SANDSTONE_PILLAR_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RED_SANDSTONE_PILLAR_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKSTONE_PILLAR_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.NETHER_BRICK_PILLAR_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.END_BRICK_PILLAR_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DEEPSLATE_PILLAR_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DEEPSLATE_BRICK_PILLAR_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.QUARTZ_PILLAR_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.PRISMARINE_PILLAR_WALL.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(BlockInit.STONE_GRASS_TOPPED_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ANDESITE_GRASS_TOPPED_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DIORITE_GRASS_TOPPED_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GRANITE_GRASS_TOPPED_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.SANDSTONE_GRASS_TOPPED_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RED_SANDSTONE_GRASS_TOPPED_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLACKSTONE_GRASS_TOPPED_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.NETHER_BRICK_GRASS_TOPPED_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.END_BRICK_GRASS_TOPPED_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DEEPSLATE_GRASS_TOPPED_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DEEPSLATE_BRICK_GRASS_TOPPED_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.QUARTZ_GRASS_TOPPED_WALL.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.PRISMARINE_GRASS_TOPPED_WALL.get(), RenderType.cutout());
		
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WOODEN_CHEVAL_DE_FRISE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.IRON_CHEVAL_DE_FRISE.get(), RenderType.cutout());
				
	}
}
	
