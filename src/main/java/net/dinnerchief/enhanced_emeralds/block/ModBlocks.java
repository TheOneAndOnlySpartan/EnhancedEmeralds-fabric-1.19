package net.dinnerchief.enhanced_emeralds.block;

import net.dinnerchief.enhanced_emeralds.EnhancedEmeralds;
import net.dinnerchief.enhanced_emeralds.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //// IDK HOW TO MAKE IT BREAK FASTER WITH HIGHER TIER TOOLS HELP
    public static final Block CHARGED_EMERALD_BLOCK = registerBlock("charged_emerald_block",
            new Block(FabricBlockSettings.of(Material.METAL).luminance(10).hardness(3)), ModItemGroup.ENHANCED_EMERALDS);

    private static Block registerBlock(String name, Block block, ItemGroup itemGroup) {
        registerBlockItem(name, block, itemGroup);
        return Registry.register(Registry.BLOCK, new Identifier(EnhancedEmeralds.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup itemGroup) {
        return Registry.register(Registry.ITEM, new Identifier(EnhancedEmeralds.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(itemGroup))
        );
    }

    public static void registerModItems() {
        EnhancedEmeralds.LOGGER.debug("Registering Blocks for " + EnhancedEmeralds.MOD_ID);
    }
}
