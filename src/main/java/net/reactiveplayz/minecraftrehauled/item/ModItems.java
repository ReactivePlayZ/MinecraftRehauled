package net.reactiveplayz.minecraftrehauled.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.reactiveplayz.minecraftrehauled.MinecraftRehauled;
import net.reactiveplayz.minecraftrehauled.item.custom.MetalDetectorItem;

public class ModItems {
    public static final Item KATANA = registerItem("katana",
            new SwordItem(ToolMaterials.IRON, 9999, 9999, new FabricItemSettings()));
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new FabricItemSettings()));
    public static final Item IMPURE_ENDERITE_SCRAP = registerItem("impure_enderite_scrap", new Item(new FabricItemSettings()));
    public static final Item ENDERITE_SCRAP = registerItem("enderite_scrap", new Item(new FabricItemSettings()));
    public static final Item BOTTLE_OF_FIRE = registerItem("bottle_of_fire", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BOTTLE_OF_IMPURE_RESIDUE = registerItem("bottle_of_impure_residue", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item BUCKET_OF_IMPURE_RESIDUE = registerItem("bucket_of_impure_residue", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(
            new FabricItemSettings().maxDamage(64)));
    public static final Item TEST0 = registerItem("test0", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item WOODEN_KNIFE = registerItem("wooden_knife",
            new SwordItem(ToolMaterials.WOOD, 7, -3.2f, new FabricItemSettings()));
    public static final Item STONE_KNIFE = registerItem("stone_knife",
            new SwordItem(ToolMaterials.STONE, 7, -3.2f, new FabricItemSettings()));
    public static final Item IRON_KNIFE = registerItem("iron_knife",
            new SwordItem(ToolMaterials.IRON, 7, -3.2f, new FabricItemSettings()));
    public static final Item COPPER_KNIFE = registerItem("copper_knife",
            new SwordItem(ModToolMaterials.COPPER, 7, -3.2f, new FabricItemSettings()));
    public static final Item GOLDEN_KNIFE = registerItem("golden_knife",
            new SwordItem(ToolMaterials.GOLD, 7, -3.1f, new FabricItemSettings()));
    public static final Item DIAMOND_KNIFE = registerItem("diamond_knife",
            new SwordItem(ToolMaterials.DIAMOND, 6, -3.2f, new FabricItemSettings()));
    public static final Item NETHERITE_KNIFE = registerItem("netherite_knife",
            new SwordItem(ToolMaterials.NETHERITE, 6, -3.3f, new FabricItemSettings().fireproof()));
    public static final Item AETHEREAL_KNIFE = registerItem("aethereal_knife",
            new SwordItem(ModToolMaterials.AETHEREAL, 6, -3.4f, new FabricItemSettings().fireproof()));
    public static final Item WOODEN_DAGGER = registerItem("wooden_dagger",
            new SwordItem(ToolMaterials.WOOD, 2, -2, new FabricItemSettings()));
    public static final Item STONE_DAGGER = registerItem("stone_dagger",
            new SwordItem(ToolMaterials.STONE, 2, -2, new FabricItemSettings()));
    public static final Item IRON_DAGGER = registerItem("iron_dagger",
            new SwordItem(ToolMaterials.IRON, 2, -1, new FabricItemSettings()));
    public static final Item COPPER_DAGGER = registerItem("copper_dagger",
            new SwordItem(ModToolMaterials.COPPER, 2, -1, new FabricItemSettings()));
    public static final Item GOLDEN_DAGGER = registerItem("golden_dagger",
            new SwordItem(ToolMaterials.GOLD, 2, -2, new FabricItemSettings()));
    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger",
            new SwordItem(ToolMaterials.DIAMOND, 2, 0, new FabricItemSettings()));
    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",
            new SwordItem(ToolMaterials.NETHERITE, 2, 0, new FabricItemSettings().fireproof()));
    public static final Item AETHEREAL_DAGGER = registerItem("aethereal_dagger",
            new SwordItem(ModToolMaterials.AETHEREAL, 2, 0, new FabricItemSettings().fireproof()));
    public static final Item WOODEN_KATANA = registerItem("wooden_katana",
            new SwordItem(ToolMaterials.WOOD, 4, -2, new FabricItemSettings()));
    public static final Item STONE_KATANA = registerItem("stone_katana",
            new SwordItem(ToolMaterials.STONE, 4, -2, new FabricItemSettings()));
    public static final Item IRON_KATANA = registerItem("iron_katana",
            new SwordItem(ToolMaterials.IRON, 4, -1, new FabricItemSettings()));
    public static final Item COPPER_KATANA = registerItem("copper_katana",
            new SwordItem(ModToolMaterials.COPPER, 4, -1, new FabricItemSettings()));
    public static final Item GOLDEN_KATANA = registerItem("golden_katana",
            new SwordItem(ToolMaterials.GOLD, 4, -2, new FabricItemSettings()));
    public static final Item DIAMOND_KATANA = registerItem("diamond_katana",
            new SwordItem(ToolMaterials.DIAMOND, 4, -0.5f, new FabricItemSettings()));
    public static final Item NETHERITE_KATANA = registerItem("netherite_katana",
            new SwordItem(ToolMaterials.NETHERITE, 4, -0.5f, new FabricItemSettings().fireproof()));
    public static final Item AETHEREAL_KATANA = registerItem("aethereal_katana",
            new SwordItem(ModToolMaterials.AETHEREAL, 4, -0.5f, new FabricItemSettings().fireproof()));
    public static final Item AETHEREAL_SWORD = registerItem("aethereal_sword",
            new SwordItem(ModToolMaterials.AETHEREAL, 3, -2.4f, new FabricItemSettings().fireproof()));
    public static final Item AETHEREAL_PICKAXE = registerItem("aethereal_pickaxe",
            new PickaxeItem(ModToolMaterials.AETHEREAL, 1, -2.8f, new FabricItemSettings().fireproof()));
    public static final Item AETHEREAL_AXE = registerItem("aethereal_axe",
            new AxeItem(ModToolMaterials.AETHEREAL, 5, -3, new  FabricItemSettings().fireproof()));
    public static final Item AETHEREAL_SHOVEL = registerItem("aethereal_shovel",
            new ShovelItem(ModToolMaterials.AETHEREAL, 1.5f, -3, new FabricItemSettings().fireproof()));
    public static final Item AETHEREAL_HOE = registerItem("aethereal_hoe",
            new HoeItem(ModToolMaterials.AETHEREAL, -5, 0f, new FabricItemSettings().fireproof()));
    public static final Item AETHEREAL_HELMET = registerItem("aethereal_helmet",
            new ArmorItem(ModArmorMaterials.AETHEREAL, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item AETHEREAL_CHESTPLATE = registerItem("aethereal_chestplate",
            new ArmorItem(ModArmorMaterials.AETHEREAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item AETHEREAL_LEGGINGS = registerItem("aethereal_leggings",
            new ArmorItem(ModArmorMaterials.AETHEREAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item AETHEREAL_BOOTS = registerItem("aethereal_boots",
            new ArmorItem(ModArmorMaterials.AETHEREAL, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER, 3, -2.4f, new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterials.COPPER, 1, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterials.COPPER, 6, -3.1f, new  FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER, 1.5f, -3, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterials.COPPER, 0, -1, new FabricItemSettings()));
   public static final Item CHERRY_SWORD = registerItem("cherry_sword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4f, new FabricItemSettings()));
    public static final Item CHERRY_PICKAXE = registerItem("cherry_pickaxe",
            new PickaxeItem(ToolMaterials.WOOD, 1, -2.8f, new FabricItemSettings()));
    public static final Item CHERRY_AXE = registerItem("cherry_axe",
            new AxeItem(ToolMaterials.WOOD, 6, -3.2f, new  FabricItemSettings()));
    public static final Item CHERRY_SHOVEL = registerItem("cherry_shovel",
            new ShovelItem(ToolMaterials.WOOD, 1.5f, -3, new FabricItemSettings()));
    public static final Item CHERRY_HOE = registerItem("cherry_hoe",
            new HoeItem(ToolMaterials.WOOD, 0, -3, new FabricItemSettings()));
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
