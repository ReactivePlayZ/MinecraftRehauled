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
            new Identifier(MinecraftRehauled.MOD_ID, "katana"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rehauled_items"))
                    .icon(() -> new ItemStack(ModItems.KATANA)).entries((displayContext, entries) -> {
                        entries.add(ModItems.KATANA);
                        entries.add(ModItems.IMPURE_ENDERITE_SCRAP);
                        entries.add(ModItems.ENDERITE_SCRAP);
                        entries.add(ModItems.ENDERITE_INGOT);
                        entries.add(ModItems.BOTTLE_OF_FIRE);
                        entries.add(ModItems.BOTTLE_OF_IMPURE_RESIDUE);
                        entries.add(ModItems.BUCKET_OF_IMPURE_RESIDUE);
                    }).build());

    public static final ItemGroup REHAULED_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MinecraftRehauled.MOD_ID, "advanced_crafting_table"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rehauled_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.ADVANCED_CRAFTING_TABLE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ADVANCED_CRAFTING_TABLE);
                        entries.add(ModBlocks.COBBLED_END_STONE);
                        entries.add(ModBlocks.ENDERITE_RESIDUE);
                    }).build());


    public static void registerItemGroups() {
        MinecraftRehauled.LOGGER.info("Registering Item Groups for " + MinecraftRehauled.MOD_ID);
    }
    
}
