package net.reactiveplayz.minecraftrehauled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.reactiveplayz.minecraftrehauled.block.ModBlocks;
import net.reactiveplayz.minecraftrehauled.item.ModItems;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> ENDERITE_SCRAP_SMELTABLES = List.of(ModItems.IMPURE_ENDERITE_SCRAP,
            ModBlocks.ENDERITE_RESIDUE);
    private static final List<ItemConvertible> END_STONE = List.of(Items.END_STONE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, ENDERITE_SCRAP_SMELTABLES, RecipeCategory.MISC, ModItems.IMPURE_ENDERITE_SCRAP,
                2.0f, 200, "enderite");
        offerBlasting(exporter, ENDERITE_SCRAP_SMELTABLES, RecipeCategory.MISC, ModItems.IMPURE_ENDERITE_SCRAP,
                2.0f, 100, "enderite");
        offerSmelting(exporter, END_STONE, RecipeCategory.MISC, ModBlocks.COBBLED_END_STONE.asItem(),
                2.0f, 200, "end");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDERITE_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.ENDERITE_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_OAK_SLAB, ModBlocks.BAMBOO_OAK_PLANKS);
        offerPressurePlateRecipe(exporter, ModBlocks.BAMBOO_OAK_PRESSURE_PLATE, ModBlocks.BAMBOO_OAK_PLANKS);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, () -> ModItems.ENDERITE_INGOT, 1)
                        .input(ModItems.ENDERITE_SCRAP)
                        .input(ModItems.ENDERITE_SCRAP)
                        .input(ModItems.ENDERITE_SCRAP)
                        .input(ModItems.ENDERITE_SCRAP)
                        .input(Items.NETHERITE_SCRAP)
                        .input(Items.NETHERITE_SCRAP)
                        .input(Items.NETHERITE_SCRAP)
                        .input(Items.NETHERITE_SCRAP);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ADVANCED_CRAFTING_TABLE, 1)
                .pattern("GTG")
                .pattern("CSC")
                .pattern("CCC")
                .input('G', Items.GOLD_BLOCK)
                .input('T', Items.CRAFTING_TABLE)
                .input('C', Items.CRYING_OBSIDIAN)
                .input('S', Items.SMITHING_TABLE)
                .criterion(hasItem(Items.GOLD_BLOCK), conditionsFromItem(Items.GOLD_BLOCK))
                .criterion(hasItem(Items.CRAFTING_TABLE), conditionsFromItem(Items.CRAFTING_TABLE))
                .criterion(hasItem(Items.CRYING_OBSIDIAN), conditionsFromItem(Items.CRYING_OBSIDIAN))
                .criterion(hasItem(Items.SMITHING_TABLE), conditionsFromItem(Items.SMITHING_TABLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ADVANCED_CRAFTING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BOTTLE_OF_FIRE, 1)
                .pattern("F")
                .pattern("B")
                .input('F', Items.FIRE_CHARGE)
                .input('B', Items.GLASS_BOTTLE)
                .criterion(hasItem(Items.FIRE_CHARGE), conditionsFromItem(Items.FIRE_CHARGE))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BOTTLE_OF_FIRE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_OAK_PLANKS, 4)
                .pattern(" B ")
                .pattern("BPB")
                .pattern(" B ")
                .input('B', Items.BAMBOO_BLOCK)
                .input('P', Items.OAK_PLANKS)
                .criterion(hasItem(Items.BAMBOO), conditionsFromItem(Items.BAMBOO))
                .criterion(hasItem(Items.OAK_PLANKS), conditionsFromItem(Items.OAK_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAMBOO_OAK_PLANKS)));

        createTransmutationRecipe(ModBlocks.BAMBOO_OAK_BUTTON, Ingredient.ofItems(ModBlocks.BAMBOO_OAK_PLANKS))
                .criterion(hasItem(ModBlocks.BAMBOO_OAK_PLANKS), conditionsFromItem((ModBlocks.BAMBOO_OAK_PLANKS)))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAMBOO_OAK_BUTTON)));

        createStairsRecipe(ModBlocks.BAMBOO_OAK_STAIRS, Ingredient.ofItems(ModBlocks.BAMBOO_OAK_PLANKS))
                .criterion(hasItem(ModBlocks.BAMBOO_OAK_PLANKS), conditionsFromItem((ModBlocks.BAMBOO_OAK_PLANKS)))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAMBOO_OAK_STAIRS)));

        createDoorRecipe(ModBlocks.BAMBOO_OAK_DOOR, Ingredient.ofItems(ModBlocks.BAMBOO_OAK_PLANKS))
                .criterion(hasItem(ModBlocks.BAMBOO_OAK_PLANKS), conditionsFromItem((ModBlocks.BAMBOO_OAK_PLANKS)))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAMBOO_OAK_DOOR)));

        createTrapdoorRecipe(ModBlocks.BAMBOO_OAK_TRAPDOOR, Ingredient.ofItems(ModBlocks.BAMBOO_OAK_PLANKS))
                .criterion(hasItem(ModBlocks.BAMBOO_OAK_PLANKS), conditionsFromItem((ModBlocks.BAMBOO_OAK_PLANKS)))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAMBOO_OAK_TRAPDOOR)));

        createFenceRecipe(ModBlocks.BAMBOO_OAK_FENCE, Ingredient.ofItems(ModBlocks.BAMBOO_OAK_PLANKS))
                .criterion(hasItem(ModBlocks.BAMBOO_OAK_PLANKS), conditionsFromItem((ModBlocks.BAMBOO_OAK_PLANKS)))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAMBOO_OAK_FENCE)));

        createFenceGateRecipe(ModBlocks.BAMBOO_OAK_FENCE_GATE, Ingredient.ofItems(ModBlocks.BAMBOO_OAK_PLANKS))
                .criterion(hasItem(ModBlocks.BAMBOO_OAK_PLANKS), conditionsFromItem((ModBlocks.BAMBOO_OAK_PLANKS)))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BAMBOO_OAK_FENCE_GATE)));




    }
}
