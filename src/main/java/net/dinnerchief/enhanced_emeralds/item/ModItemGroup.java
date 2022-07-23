package net.dinnerchief.enhanced_emeralds.item;

import net.dinnerchief.enhanced_emeralds.EnhancedEmeralds;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ENHANCED_EMERALDS = FabricItemGroupBuilder.build(
            new Identifier(EnhancedEmeralds.MOD_ID, "enhanced_emeralds"),
            () -> new ItemStack(Items.EMERALD)
    );
}
