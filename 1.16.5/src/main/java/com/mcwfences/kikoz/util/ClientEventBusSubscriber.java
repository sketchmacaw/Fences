package com.mcwfences.kikoz.util;

import com.mcwfences.kikoz.MacawsFences;
import com.mcwfences.kikoz.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MacawsFences.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_WIRED_FENCE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SPRUCE_WIRED_FENCE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_WIRED_FENCE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_WIRED_FENCE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_WIRED_FENCE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_WIRED_FENCE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_WIRED_FENCE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_WIRED_FENCE.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.RAILING_STONE_BRICK_WALL.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RAILING_ANDESITE_WALL.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RAILING_DIORITE_WALL.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RAILING_GRANITE_WALL.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RAILING_SANDSTONE_WALL.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RAILING_RED_SANDSTONE_WALL.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RAILING_BLACKSTONE_WALL.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RAILING_NETHER_BRICK_WALL.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RAILING_END_BRICK_WALL.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RAILING_QUARTZ_WALL.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_PICKET_FENCE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_PICKET_FENCE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_PICKET_FENCE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_PICKET_FENCE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_PICKET_FENCE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_PICKET_FENCE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_PICKET_FENCE.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.OAK_HIGHLEY_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BIRCH_HIGHLEY_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.JUNGLE_HIGHLEY_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ACACIA_HIGHLEY_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DARK_OAK_HIGHLEY_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.CRIMSON_HIGHLEY_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.WARPED_HIGHLEY_GATE.get(), RenderType.cutout());
		
		RenderTypeLookup.setRenderLayer(BlockInit.STONE_BRICK_RAILING_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.ANDESITE_RAILING_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.DIORITE_RAILING_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.GRANITE_RAILING_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.SANDSTONE_RAILING_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.RED_SANDSTONE_RAILING_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BLACKSTONE_RAILING_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.BLACKSTONE_BRICK_RAILING_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.NETHER_BRICK_RAILING_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.END_BRICK_RAILING_GATE.get(), RenderType.cutout());
		RenderTypeLookup.setRenderLayer(BlockInit.QUARTZ_RAILING_GATE.get(), RenderType.cutout());

	}
}
	
