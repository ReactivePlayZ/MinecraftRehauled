package net.reactiveplayz.minecraftrehauled.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.reactiveplayz.minecraftrehauled.MinecraftRehauled;
import net.reactiveplayz.minecraftrehauled.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup REHAULED_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MinecraftRehauled.MOD_ID, "rehauled_items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rehauled_items"))
                    .icon(() -> new ItemStack(ModItems.BOTTLE_OF_FIRE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.KATANA);
                        entries.add(ModItems.IMPURE_ENDERITE_SCRAP);
                        entries.add(ModItems.ENDERITE_SCRAP);
                        entries.add(ModItems.ENDERITE_INGOT);
                        entries.add(ModItems.BOTTLE_OF_FIRE);
                        entries.add(ModItems.BOTTLE_OF_IMPURE_RESIDUE);
                        entries.add(ModItems.BUCKET_OF_IMPURE_RESIDUE);
                        entries.add(ModItems.AETHEREAL_SWORD);
                        entries.add(ModItems.AETHEREAL_PICKAXE);
                        entries.add(ModItems.AETHEREAL_AXE);
                        entries.add(ModItems.AETHEREAL_SHOVEL);
                        entries.add(ModItems.AETHEREAL_HOE);
                        entries.add(ModItems.WOODEN_KNIFE);
                        entries.add(ModItems.STONE_KNIFE);
                        entries.add(ModItems.IRON_KNIFE);
                        entries.add(ModItems.GOLDEN_KNIFE);
                        entries.add(ModItems.DIAMOND_KNIFE);
                        entries.add(ModItems.NETHERITE_KNIFE);
                        entries.add(ModItems.AETHEREAL_KNIFE);
                    }).build());

    public static final ItemGroup REHAULED_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MinecraftRehauled.MOD_ID, "rehauled_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rehauled_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.ADVANCED_CRAFTING_TABLE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ADVANCED_CRAFTING_TABLE);
                        entries.add(ModBlocks.COBBLED_END_STONE);
                        entries.add(ModBlocks.ENDERITE_RESIDUE);
                        entries.add(ModBlocks.ENDERITE_BLOCK);

                        entries.add(ModBlocks.BAMBOO_OAK_PLANKS);
                        entries.add(ModBlocks.BAMBOO_OAK_STAIRS);
                        entries.add(ModBlocks.BAMBOO_OAK_SLAB);
                        entries.add(ModBlocks.BAMBOO_OAK_PRESSURE_PLATE);
                        entries.add(ModBlocks.BAMBOO_OAK_BUTTON);
                        entries.add(ModBlocks.BAMBOO_OAK_FENCE);
                        entries.add(ModBlocks.BAMBOO_OAK_FENCE_GATE);
                        entries.add(ModBlocks.BAMBOO_OAK_DOOR);
                        entries.add(ModBlocks.BAMBOO_OAK_TRAPDOOR);

                        entries.add(ModBlocks.FIR_PLANKS);
                        entries.add(ModBlocks.FIR_STAIRS);
                        entries.add(ModBlocks.FIR_SLAB);
                        entries.add(ModBlocks.FIR_PRESSURE_PLATE);
                        entries.add(ModBlocks.FIR_BUTTON);
                        entries.add(ModBlocks.FIR_FENCE);
                        entries.add(ModBlocks.FIR_FENCE_GATE);
                        entries.add(ModBlocks.FIR_DOOR);
                        entries.add(ModBlocks.FIR_TRAPDOOR);
                    }).build());

    public static final ItemGroup REHAULED_WEAPONS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MinecraftRehauled.MOD_ID, "rehauled_weapons"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rehauled_weapons"))
                    .icon(() -> new ItemStack(ModItems.KATANA)).entries((displayContext, entries) -> {
                        entries.add(ModItems.AETHEREAL_SWORD);

                        entries.add(ModItems.WOODEN_KNIFE);
                        entries.add(ModItems.STONE_KNIFE);
                        entries.add(ModItems.IRON_KNIFE);
                        entries.add(ModItems.GOLDEN_KNIFE);
                        entries.add(ModItems.DIAMOND_KNIFE);
                        entries.add(ModItems.NETHERITE_KNIFE);
                        entries.add(ModItems.AETHEREAL_KNIFE);

                        entries.add(ModItems.WOODEN_DAGGER);
                        entries.add(ModItems.STONE_DAGGER);
                        entries.add(ModItems.IRON_DAGGER);
                        entries.add(ModItems.GOLDEN_DAGGER);
                        entries.add(ModItems.DIAMOND_DAGGER);
                        entries.add(ModItems.NETHERITE_DAGGER);
                        entries.add(ModItems.AETHEREAL_DAGGER);
                    }).build());

                        public static final ItemGroup MCR_TESTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MinecraftRehauled.MOD_ID, "mcr_tests"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mcr_tests"))
                    .icon(() -> new ItemStack(ModItems.TEST0)).entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.SOUND_BLOCK);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.TEST0);
                        entries.add(ModItems.METAL_DETECTOR);
                    })).build());


    public static void registerItemGroups() {
        MinecraftRehauled.LOGGER.info("Registering Item Groups for " + MinecraftRehauled.MOD_ID);
    }
    
}
