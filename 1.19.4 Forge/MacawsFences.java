package com.mcwfences.kikoz;

import com.mcwfences.kikoz.init.BlockInit;
import com.mcwfences.kikoz.init.ItemInit;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
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

			ItemInit.register(modEventBus);
			BlockInit.register(modEventBus);
			
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
    
    public static CreativeModeTab FencesItemGroup;
    
    @SubscribeEvent
    public static void register(CreativeModeTabEvent.Register event) {
    	FencesItemGroup = event.registerCreativeModeTab(
                new ResourceLocation("mcwfences", MacawsFences.MOD_ID), builder -> builder
                        .icon(() -> new ItemStack(BlockInit.OAK_PICKET_FENCE.get()))
                        .displayItems((featureFlags, output) -> ItemInit.ITEMS.getEntries().forEach(o -> output.accept(o.get())))
                        .title(Component.translatable("itemGroup.mcwfences"))
        );
    }
}

