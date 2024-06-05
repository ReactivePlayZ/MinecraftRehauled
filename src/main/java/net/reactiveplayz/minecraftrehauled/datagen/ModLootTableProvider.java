package net.reactiveplayz.minecraftrehauled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.reactiveplayz.minecraftrehauled.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ENDERITE_BLOCK);
        addDrop(ModBlocks.ENDERITE_RESIDUE);

        addDrop(ModBlocks.ADVANCED_CRAFTING_TABLE);

        addDrop(ModBlocks.COBBLED_END_STONE);

        addDrop(ModBlocks.BAMBOO_OAK_PLANKS);
        addDrop(ModBlocks.BAMBOO_OAK_STAIRS);
        addDrop(ModBlocks.BAMBOO_OAK_PRESSURE_PLATE);
        addDrop(ModBlocks.BAMBOO_OAK_BUTTON);
        addDrop(ModBlocks.BAMBOO_OAK_FENCE);
        addDrop(ModBlocks.BAMBOO_OAK_FENCE_GATE);

        addDrop(ModBlocks.BAMBOO_OAK_DOOR, doorDrops(ModBlocks.BAMBOO_OAK_DOOR));
        addDrop(ModBlocks.BAMBOO_OAK_SLAB, slabDrops(ModBlocks.BAMBOO_OAK_SLAB));

        addDrop(ModBlocks.COBBLED_END_STONE, oreDrops(Blocks.END_STONE, ModBlocks.COBBLED_END_STONE.asItem()));
    }
}
