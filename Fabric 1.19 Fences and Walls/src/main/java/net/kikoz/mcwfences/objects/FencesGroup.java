package net.kikoz.mcwfences.objects;


import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kikoz.mcwfences.MacawsFences;
import net.kikoz.mcwfences.init.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class FencesGroup {
    public static final ItemGroup FENCESGROUP = FabricItemGroupBuilder.build(new Identifier(MacawsFences.MOD_ID, "fencesgroup"),
            () -> new ItemStack(BlockInit.OAK_PICKET_FENCE));
}