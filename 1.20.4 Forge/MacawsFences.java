package com.mcwfences.kikoz;

import com.mcwfences.kikoz.init.BlockInit;
import com.mcwfences.kikoz.init.ItemInit;
import com.mcwfences.kikoz.init.TabInit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("mcwfences")
@Mod.EventBusSubscriber(modid = MacawsFences.MOD_ID, bus = Bus.MOD)
public class MacawsFences 
{
	public static final String MOD_ID = "mcwfences";
	public static MacawsFences instance;
	
	public MacawsFences() 
	{
			final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
			modEventBus.addListener(this::setup);
			modEventBus.addListener(this::doClientStuff);

			BlockInit.BLOCKS.register(modEventBus);
			ItemInit.ITEMS.register(modEventBus);
			TabInit.CREATIVE_TABS.register(modEventBus);
			
			instance = this;
			MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
	
	}

	private void doClientStuff(final FMLClientSetupEvent event)
	{
		 
		
		
	}
	
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event)
	{
	
	}


    
}

