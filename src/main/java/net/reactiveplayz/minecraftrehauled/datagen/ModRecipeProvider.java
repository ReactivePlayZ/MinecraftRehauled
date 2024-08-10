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
import net.minecraft.registry.tag.ItemTags;
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

        offerReversibleCompactingRecipesWithReverseRecipeGroup(exporter, RecipeCategory.MISC, ModItems.ENDERITE_INGOT,
                                                                         RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDERITE_BLOCK,
                "enderite_ingot_from_enderite_block", "enderite_ingot");

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_OAK_SLAB, ModBlocks.BAMBOO_OAK_PLANKS);
        offerPressurePlateRecipe(exporter, ModBlocks.BAMBOO_OAK_PRESSURE_PLATE, ModBlocks.BAMBOO_OAK_PLANKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIR_SLAB, ModBlocks.FIR_PLANKS);
        offerPressurePlateRecipe(exporter, ModBlocks.FIR_PRESSURE_PLATE, ModBlocks.FIR_PLANKS);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, () -> ModItems.CHERRY_SWORD, 1)
                .input(Items.WOODEN_SWORD)
                .input(Items.CHERRY_PLANKS)
                .criterion(hasItem(Items.WOODEN_SWORD), conditionsFromItem(Items.WOODEN_SWORD))
                .criterion(hasItem(Items.CHERRY_PLANKS), conditionsFromItem(Items.CHERRY_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, () -> ModItems.CHERRY_PICKAXE, 1)
                .input(Items.WOODEN_PICKAXE)
                .input(Items.CHERRY_PLANKS)
                .criterion(hasItem(Items.WOODEN_PICKAXE), conditionsFromItem(Items.WOODEN_PICKAXE))
                .criterion(hasItem(Items.CHERRY_PLANKS), conditionsFromItem(Items.CHERRY_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, () -> ModItems.CHERRY_AXE, 1)
                .input(Items.WOODEN_AXE)
                .input(Items.CHERRY_PLANKS)
                .criterion(hasItem(Items.WOODEN_AXE), conditionsFromItem(Items.WOODEN_AXE))
                .criterion(hasItem(Items.CHERRY_PLANKS), conditionsFromItem(Items.CHERRY_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, () -> ModItems.CHERRY_SHOVEL, 1)
                .input(Items.WOODEN_SHOVEL)
                .input(Items.CHERRY_PLANKS)
                .criterion(hasItem(Items.WOODEN_SHOVEL), conditionsFromItem(Items.WOODEN_SHOVEL))
                .criterion(hasItem(Items.CHERRY_PLANKS), conditionsFromItem(Items.CHERRY_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, () -> ModItems.CHERRY_HOE, 1)
                .input(Items.WOODEN_HOE)
                .input(Items.CHERRY_PLANKS)
                .criterion(hasItem(Items.WOODEN_HOE), conditionsFromItem(Items.WOODEN_HOE))
                .criterion(hasItem(Items.CHERRY_PLANKS), conditionsFromItem(Items.CHERRY_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, () -> ModItems.ENDERITE_INGOT, 1)
                        .input(ModItems.ENDERITE_SCRAP)
                        .input(ModItems.ENDERITE_SCRAP)
                        .input(ModItems.ENDERITE_SCRAP)
                        .input(ModItems.ENDERITE_SCRAP)
                        .input(Items.NETHERITE_SCRAP)
                        .input(Items.NETHERITE_SCRAP)
                        .input(Items.NETHERITE_SCRAP)
                        .input(Items.NETHERITE_SCRAP)
                    .criterion(hasItem(ModItems.ENDERITE_SCRAP), conditionsFromItem(ModItems.ENDERITE_SCRAP))
                    .criterion(hasItem(Items.NETHERITE_SCRAP), conditionsFromItem(Items.NETHERITE_SCRAP))
                    .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_KNIFE, 1)
                .pattern("MM")
                .pattern("MM")
                .pattern(" S")
                .input('M', ItemTags.PLANKS)
                .input('S', Items.STICK)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STONE_KNIFE, 1)
                .pattern("MM")
                .pattern("MM")
                .pattern(" S")
                .input('M', ItemTags.STONE_TOOL_MATERIALS)
                .input('S', Items.STICK)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_KNIFE, 1)
                .pattern("MM")
                .pattern("MM")
                .pattern(" S")
                .input('M', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLDEN_KNIFE, 1)
                .pattern("MM")
                .pattern("MM")
                .pattern(" S")
                .input('M', Items.GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_KNIFE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_KNIFE, 1)
                .pattern("MM")
                .pattern("MM")
                .pattern(" S")
                .input('M', Items.DIAMOND)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_KNIFE)));

        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_KNIFE, RecipeCategory.COMBAT, ModItems.NETHERITE_KNIFE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_DAGGER, 1)
                .pattern("M")
                .pattern("S")
                .input('M', ItemTags.PLANKS)
                .input('S', Items.STICK)
                .criterion("has_planks", conditionsFromTag(ItemTags.PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STONE_DAGGER, 1)
                .pattern("M")
                .pattern("S")
                .input('M', ItemTags.STONE_TOOL_MATERIALS)
                .input('S', Items.STICK)
                .criterion("has_cobblestone", conditionsFromTag(ItemTags.STONE_TOOL_MATERIALS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STONE_DAGGER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_DAGGER, 1)
                .pattern("M")
                .pattern("S")
                .input('M', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_DAGGER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLDEN_DAGGER, 1)
                .pattern("M")
                .pattern("S")
                .input('M', Items.GOLD_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_DAGGER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_DAGGER, 1)
                .pattern("M")
                .pattern("S")
                .input('M', Items.DIAMOND)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_DAGGER)));

        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_DAGGER, RecipeCategory.COMBAT, ModItems.NETHERITE_DAGGER);

        //TODO: Add the crafting recipes for the katanas.

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

        createTransmutationRecipe(ModBlocks.FIR_BUTTON, Ingredient.ofItems(ModBlocks.FIR_PLANKS))
                .criterion(hasItem(ModBlocks.FIR_PLANKS), conditionsFromItem((ModBlocks.FIR_PLANKS)))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIR_BUTTON)));

        createStairsRecipe(ModBlocks.FIR_STAIRS, Ingredient.ofItems(ModBlocks.FIR_PLANKS))
                .criterion(hasItem(ModBlocks.FIR_PLANKS), conditionsFromItem((ModBlocks.FIR_PLANKS)))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIR_STAIRS)));

        createDoorRecipe(ModBlocks.FIR_DOOR, Ingredient.ofItems(ModBlocks.FIR_PLANKS))
                .criterion(hasItem(ModBlocks.FIR_PLANKS), conditionsFromItem((ModBlocks.FIR_PLANKS)))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIR_DOOR)));

        createTrapdoorRecipe(ModBlocks.FIR_TRAPDOOR, Ingredient.ofItems(ModBlocks.FIR_PLANKS))
                .criterion(hasItem(ModBlocks.FIR_PLANKS), conditionsFromItem((ModBlocks.FIR_PLANKS)))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIR_TRAPDOOR)));

        createFenceRecipe(ModBlocks.FIR_FENCE, Ingredient.ofItems(ModBlocks.FIR_PLANKS))
                .criterion(hasItem(ModBlocks.FIR_PLANKS), conditionsFromItem((ModBlocks.FIR_PLANKS)))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIR_FENCE)));

        createFenceGateRecipe(ModBlocks.FIR_FENCE_GATE, Ingredient.ofItems(ModBlocks.FIR_PLANKS))
                .criterion(hasItem(ModBlocks.FIR_PLANKS), conditionsFromItem((ModBlocks.FIR_PLANKS)))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FIR_FENCE_GATE)));




    }
}
