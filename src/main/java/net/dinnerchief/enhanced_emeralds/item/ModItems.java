package net.dinnerchief.enhanced_emeralds.item;

import net.dinnerchief.enhanced_emeralds.EnhancedEmeralds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SOLID_EXPERIENCE_ORB = registerItem("solid_experience_orb",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EnhancedEmeralds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EnhancedEmeralds.LOGGER.debug("Registering Items for " + EnhancedEmeralds.MOD_ID);
    }
}
