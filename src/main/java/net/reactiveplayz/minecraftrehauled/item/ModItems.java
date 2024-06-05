package net.reactiveplayz.minecraftrehauled.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.reactiveplayz.minecraftrehauled.MinecraftRehauled;
import net.reactiveplayz.minecraftrehauled.item.custom.MetalDetectorItem;

public class ModItems {
    public static final Item KATANA = registerItem("katana", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new FabricItemSettings()));
    public static final Item IMPURE_ENDERITE_SCRAP = registerItem("impure_enderite_scrap", new Item(new FabricItemSettings()));
    public static final Item ENDERITE_SCRAP = registerItem("enderite_scrap", new Item(new FabricItemSettings()));
    public static final Item BOTTLE_OF_FIRE = registerItem("bottle_of_fire", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BOTTLE_OF_IMPURE_RESIDUE = registerItem("bottle_of_impure_residue", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BUCKET_OF_IMPURE_RESIDUE = registerItem("bucket_of_impure_residue", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(
            new FabricItemSettings().maxDamage(64)));

    private static void addItemsToWeaponsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(KATANA);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MinecraftRehauled.MOD_ID, name), item);
    }

    public static void registerModFuelSources() {
        FuelRegistry.INSTANCE.add(ModItems.BOTTLE_OF_FIRE, 10000);
        MinecraftRehauled.LOGGER.info("Registered Mod Fuel Source items for " + MinecraftRehauled.MOD_ID);


    }

    public static void registerModItems() {
        MinecraftRehauled.LOGGER.info("Registering Mod Items for " + MinecraftRehauled.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToWeaponsTabItemGroup);
    }

}
