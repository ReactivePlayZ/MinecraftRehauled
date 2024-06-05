package net.reactiveplayz.minecraftrehauled;

import net.fabricmc.api.ModInitializer;
import net.reactiveplayz.minecraftrehauled.block.ModBlocks;
import net.reactiveplayz.minecraftrehauled.item.ModItemGroups;
import net.reactiveplayz.minecraftrehauled.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftRehauled implements ModInitializer {
	public static final String MOD_ID = "minecraft_rehauled";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModItems.registerModFuelSources();
		ModBlocks.registerModBlocks();
	}
}