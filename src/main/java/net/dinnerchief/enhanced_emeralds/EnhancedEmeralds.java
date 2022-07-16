package net.dinnerchief.enhanced_emeralds;

import net.dinnerchief.enhanced_emeralds.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnhancedEmeralds implements ModInitializer {
	public static final String MOD_ID = "enhanced_emeralds";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
