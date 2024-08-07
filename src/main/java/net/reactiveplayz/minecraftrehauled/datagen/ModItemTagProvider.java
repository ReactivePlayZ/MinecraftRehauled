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

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.WOODEN_KNIFE)
                .add(ModItems.STONE_KNIFE)
                .add(ModItems.IRON_KNIFE)
                .add(ModItems.GOLDEN_KNIFE)
                .add(ModItems.DIAMOND_KNIFE)
                .add(ModItems.NETHERITE_KNIFE)
                .add(ModItems.AETHEREAL_KNIFE)

                .add(ModItems.WOODEN_DAGGER)
                .add(ModItems.STONE_DAGGER)
                .add(ModItems.IRON_DAGGER)
                .add(ModItems.GOLDEN_DAGGER)
                .add(ModItems.DIAMOND_DAGGER)
                .add(ModItems.NETHERITE_DAGGER)
                .add(ModItems.AETHEREAL_DAGGER)

                .add(ModItems.WOODEN_KATANA)
                .add(ModItems.STONE_KATANA)
                .add(ModItems.IRON_KATANA)
                .add(ModItems.GOLDEN_KATANA)
                .add(ModItems.DIAMOND_KATANA)
                .add(ModItems.NETHERITE_KATANA)
                .add(ModItems.AETHEREAL_KATANA)

                .add(ModItems.AETHEREAL_SWORD)
        ;

        getOrCreateTagBuilder(ItemTags.TOOLS)
                .add(ModItems.WOODEN_KNIFE)
                .add(ModItems.STONE_KNIFE)
                .add(ModItems.IRON_KNIFE)
                .add(ModItems.GOLDEN_KNIFE)
                .add(ModItems.DIAMOND_KNIFE)
                .add(ModItems.NETHERITE_KNIFE)
                .add(ModItems.AETHEREAL_KNIFE)

                .add(ModItems.WOODEN_DAGGER)
                .add(ModItems.STONE_DAGGER)
                .add(ModItems.IRON_DAGGER)
                .add(ModItems.GOLDEN_DAGGER)
                .add(ModItems.DIAMOND_DAGGER)
                .add(ModItems.NETHERITE_DAGGER)
                .add(ModItems.AETHEREAL_DAGGER)

                .add(ModItems.WOODEN_KATANA)
                .add(ModItems.STONE_KATANA)
                .add(ModItems.IRON_KATANA)
                .add(ModItems.GOLDEN_KATANA)
                .add(ModItems.DIAMOND_KATANA)
                .add(ModItems.NETHERITE_KATANA)
                .add(ModItems.AETHEREAL_KATANA)

                .add(ModItems.AETHEREAL_SWORD)
                .add(ModItems.AETHEREAL_PICKAXE)
                .add(ModItems.AETHEREAL_AXE)
                .add(ModItems.AETHEREAL_SHOVEL)
                .add(ModItems.AETHEREAL_HOE)
        ;

        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(ModBlocks.COBBLED_END_STONE.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.BAMBOO_OAK_PLANKS.asItem())
                .add(ModBlocks.FIR_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.BAMBOO_OAK_SLAB.asItem())
                .add(ModBlocks.FIR_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.BAMBOO_OAK_SLAB.asItem())
                .add(ModBlocks.FIR_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.BAMBOO_OAK_STAIRS.asItem())
                .add(ModBlocks.FIR_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.BAMBOO_OAK_STAIRS.asItem())
                .add(ModBlocks.FIR_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.DOORS)
                .add(ModBlocks.BAMBOO_OAK_DOOR.asItem())
                .add(ModBlocks.FIR_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.BAMBOO_OAK_DOOR.asItem())
                .add(ModBlocks.FIR_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.TRAPDOORS)
                .add(ModBlocks.BAMBOO_OAK_TRAPDOOR.asItem())
                .add(ModBlocks.FIR_TRAPDOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.BAMBOO_OAK_TRAPDOOR.asItem())
                .add(ModBlocks.FIR_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(ModBlocks.BAMBOO_OAK_FENCE.asItem())
                .add(ModBlocks.FIR_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.BAMBOO_OAK_FENCE.asItem())
                .add(ModBlocks.FIR_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(ModBlocks.BAMBOO_OAK_FENCE_GATE.asItem())
                .add(ModBlocks.FIR_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.BAMBOO_OAK_PRESSURE_PLATE.asItem())
                .add(ModBlocks.FIR_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.BUTTONS)
                .add(ModBlocks.BAMBOO_OAK_BUTTON.asItem())
                .add(ModBlocks.FIR_BUTTON.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.BAMBOO_OAK_BUTTON.asItem())
                .add(ModBlocks.FIR_BUTTON.asItem());

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


        getOrCreateTagBuilder(ModTags.Items.AETHEREAL_ITEMS)
                .add(ModItems.AETHEREAL_KATANA)
                .add(ModItems.AETHEREAL_SWORD)
                .add(ModItems.AETHEREAL_PICKAXE)
                .add(ModItems.AETHEREAL_AXE)
                .add(ModItems.AETHEREAL_KNIFE)
                .add(ModItems.AETHEREAL_DAGGER)
                .add(ModItems.AETHEREAL_SHOVEL)
                .add(ModItems.AETHEREAL_HOE);

        getOrCreateTagBuilder(ModTags.Items.BAMBOO_OAK_BLOCKS)
                .add(ModBlocks.BAMBOO_OAK_PLANKS.asItem())
                .add(ModBlocks.BAMBOO_OAK_STAIRS.asItem())
                .add(ModBlocks.BAMBOO_OAK_SLAB.asItem())
                .add(ModBlocks.BAMBOO_OAK_PRESSURE_PLATE.asItem())
                .add(ModBlocks.BAMBOO_OAK_BUTTON.asItem())
                .add(ModBlocks.BAMBOO_OAK_FENCE.asItem())
                .add(ModBlocks.BAMBOO_OAK_FENCE_GATE.asItem())
                .add(ModBlocks.BAMBOO_OAK_DOOR.asItem())
                .add(ModBlocks.BAMBOO_OAK_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ModTags.Items.FIR_BLOCKS)
                .add(ModBlocks.FIR_PLANKS.asItem())
                .add(ModBlocks.FIR_STAIRS.asItem())
                .add(ModBlocks.FIR_SLAB.asItem())
                .add(ModBlocks.FIR_PRESSURE_PLATE.asItem())
                .add(ModBlocks.FIR_BUTTON.asItem())
                .add(ModBlocks.FIR_FENCE.asItem())
                .add(ModBlocks.FIR_FENCE_GATE.asItem())
                .add(ModBlocks.FIR_DOOR.asItem())
                .add(ModBlocks.FIR_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ModTags.Items.BAMBOO_OAK_BLOCKS)
                .add(ModBlocks.BAMBOO_OAK_PLANKS.asItem())
                .add(ModBlocks.BAMBOO_OAK_STAIRS.asItem())
                .add(ModBlocks.BAMBOO_OAK_SLAB.asItem())
                .add(ModBlocks.BAMBOO_OAK_PRESSURE_PLATE.asItem())
                .add(ModBlocks.BAMBOO_OAK_BUTTON.asItem())
                .add(ModBlocks.BAMBOO_OAK_FENCE.asItem())
                .add(ModBlocks.BAMBOO_OAK_FENCE_GATE.asItem())
                .add(ModBlocks.BAMBOO_OAK_DOOR.asItem())
                .add(ModBlocks.BAMBOO_OAK_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ModTags.Items.FIR_BLOCKS)
                .add(ModBlocks.FIR_PLANKS.asItem())
                .add(ModBlocks.FIR_STAIRS.asItem())
                .add(ModBlocks.FIR_SLAB.asItem())
                .add(ModBlocks.FIR_PRESSURE_PLATE.asItem())
                .add(ModBlocks.FIR_BUTTON.asItem())
                .add(ModBlocks.FIR_FENCE.asItem())
                .add(ModBlocks.FIR_FENCE_GATE.asItem())
                .add(ModBlocks.FIR_DOOR.asItem())
                .add(ModBlocks.FIR_TRAPDOOR.asItem());

    }
}
