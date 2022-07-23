package net.dinnerchief.enhanced_emeralds.item;

import net.dinnerchief.enhanced_emeralds.EnhancedEmeralds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // INITIALIZING ITEMS
    public static final Item SMALL_EXP_CHUNK = registerItem("small_experience_chunk", new Item(new FabricItemSettings().group(ModItemGroup.ENHANCED_EMERALDS)));
    public static final Item MEDIUM_EXP_CHUNK = registerItem("medium_experience_chunk", new Item(new FabricItemSettings().group(ModItemGroup.ENHANCED_EMERALDS)));
    public static final Item BIG_EXP_CHUNK = registerItem("big_experience_chunk", new Item(new FabricItemSettings().group(ModItemGroup.ENHANCED_EMERALDS)));
    public static final Item CHARGED_EMERALD = registerItem("charged_emerald", new Item(
            new FabricItemSettings()
                    .maxCount(16)
                    .rarity(Rarity.EPIC)
                    .group(ModItemGroup.ENHANCED_EMERALDS)
    ));

    // REGISTERING FUNCTION
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EnhancedEmeralds.MOD_ID, name), item);
    }

    // HAVE TO BE HERE
    public static void registerModItems() {
        EnhancedEmeralds.LOGGER.debug("Registering Items for " + EnhancedEmeralds.MOD_ID);
    }
}
