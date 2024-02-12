package com.mcwfences.kikoz.init;

import com.mcwfences.kikoz.MacawsFences;


import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MacawsFences.MOD_ID);

	
	public static final RegistryObject<Item> OAK_PICKET_FENCE = ITEMS.register("oak_picket_fence", () -> new BlockItem(BlockInit.OAK_PICKET_FENCE.get(), new Item.Properties().tab(MacawsFences.FencesItemGroup)));

}
