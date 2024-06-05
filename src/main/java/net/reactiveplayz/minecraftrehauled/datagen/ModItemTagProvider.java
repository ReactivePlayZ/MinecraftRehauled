package net.reactiveplayz.minecraftrehauled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.reactiveplayz.minecraftrehauled.block.ModBlocks;
import net.reactiveplayz.minecraftrehauled.item.ModItems;
import net.reactiveplayz.minecraftrehauled.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(ModBlocks.COBBLED_END_STONE.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.BAMBOO_OAK_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.BAMBOO_OAK_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.BAMBOO_OAK_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.BAMBOO_OAK_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.BAMBOO_OAK_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.DOORS)
                .add(ModBlocks.BAMBOO_OAK_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.BAMBOO_OAK_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.TRAPDOORS)
                .add(ModBlocks.BAMBOO_OAK_TRAPDOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.BAMBOO_OAK_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(ModBlocks.BAMBOO_OAK_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.BAMBOO_OAK_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(ModBlocks.BAMBOO_OAK_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.BAMBOO_OAK_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.BUTTONS)
                .add(ModBlocks.BAMBOO_OAK_BUTTON.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.BAMBOO_OAK_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.BUTTONS)
                .add(ModBlocks.BAMBOO_OAK_BUTTON.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.BAMBOO_OAK_BUTTON.asItem());

        getOrCreateTagBuilder(ModTags.Items.IMPURE_ITEMS)
                .add(ModItems.BOTTLE_OF_IMPURE_RESIDUE)
                .add(ModItems.BUCKET_OF_IMPURE_RESIDUE)
                .add(ModItems.IMPURE_ENDERITE_SCRAP);

        getOrCreateTagBuilder(ModTags.Items.ENDERITE_ITEMS)
                .add(ModBlocks.ENDERITE_RESIDUE.asItem())
                .add(ModBlocks.ENDERITE_BLOCK.asItem())
                .add(ModItems.ENDERITE_SCRAP)
                .add(ModItems.IMPURE_ENDERITE_SCRAP)
                .add(ModItems.ENDERITE_INGOT);

    }
}
