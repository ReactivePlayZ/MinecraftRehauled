package net.reactiveplayz.minecraftrehauled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.reactiveplayz.minecraftrehauled.block.ModBlocks;
import net.reactiveplayz.minecraftrehauled.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                .add(ModBlocks.ENDERITE_RESIDUE)
                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.COAL_ORES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ADVANCED_CRAFTING_TABLE)
                .add(ModBlocks.ENDERITE_RESIDUE)
                .add(ModBlocks.ENDERITE_BLOCK)
                .add(ModBlocks.COBBLED_END_STONE)
                .add(ModBlocks.SOUND_BLOCK);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.ENDERITE_RESIDUE)
                .add(ModBlocks.BAMBOO_OAK_PLANKS)
                .add(ModBlocks.BAMBOO_OAK_STAIRS)
                .add(ModBlocks.BAMBOO_OAK_SLAB)
                .add(ModBlocks.BAMBOO_OAK_PRESSURE_PLATE)
                .add(ModBlocks.BAMBOO_OAK_BUTTON)
                .add(ModBlocks.BAMBOO_OAK_FENCE)
                .add(ModBlocks.BAMBOO_OAK_FENCE_GATE)
                .add(ModBlocks.BAMBOO_OAK_DOOR)
                .add(ModBlocks.BAMBOO_OAK_TRAPDOOR)
                .add(ModBlocks.FIR_PLANKS)
                .add(ModBlocks.FIR_STAIRS)
                .add(ModBlocks.FIR_SLAB)
                .add(ModBlocks.FIR_PRESSURE_PLATE)
                .add(ModBlocks.FIR_BUTTON)
                .add(ModBlocks.FIR_FENCE)
                .add(ModBlocks.FIR_FENCE_GATE)
                .add(ModBlocks.FIR_DOOR)
                .add(ModBlocks.FIR_TRAPDOOR)
                .add(ModBlocks.SOUND_BLOCK);


        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ADVANCED_CRAFTING_TABLE)
                .add(ModBlocks.ENDERITE_RESIDUE)
                .add(ModBlocks.ENDERITE_BLOCK)
                .add(ModBlocks.COBBLED_END_STONE);

        getOrCreateTagBuilder(TagKey.of (RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")) )
                .add(ModBlocks.ENDERITE_RESIDUE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.BAMBOO_OAK_FENCE)
                .add(ModBlocks.FIR_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.BAMBOO_OAK_FENCE_GATE)
                .add(ModBlocks.FIR_FENCE_GATE);

        getOrCreateTagBuilder(ModTags.Blocks.BAMBOO_OAK_BLOCKS)
                .add(ModBlocks.BAMBOO_OAK_PLANKS)
                .add(ModBlocks.BAMBOO_OAK_STAIRS)
                .add(ModBlocks.BAMBOO_OAK_SLAB)
                .add(ModBlocks.BAMBOO_OAK_PRESSURE_PLATE)
                .add(ModBlocks.BAMBOO_OAK_BUTTON)
                .add(ModBlocks.BAMBOO_OAK_FENCE)
                .add(ModBlocks.BAMBOO_OAK_FENCE_GATE)
                .add(ModBlocks.BAMBOO_OAK_DOOR)
                .add(ModBlocks.BAMBOO_OAK_TRAPDOOR);

        getOrCreateTagBuilder(ModTags.Blocks.FIR_BLOCKS)
                .add(ModBlocks.FIR_PLANKS)
                .add(ModBlocks.FIR_STAIRS)
                .add(ModBlocks.FIR_SLAB)
                .add(ModBlocks.FIR_PRESSURE_PLATE)
                .add(ModBlocks.FIR_BUTTON)
                .add(ModBlocks.FIR_FENCE)
                .add(ModBlocks.FIR_FENCE_GATE)
                .add(ModBlocks.FIR_DOOR)
                .add(ModBlocks.FIR_TRAPDOOR);


    }
}
