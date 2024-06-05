package net.reactiveplayz.minecraftrehauled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.reactiveplayz.minecraftrehauled.block.ModBlocks;
import net.reactiveplayz.minecraftrehauled.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool bambooOakPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BAMBOO_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLED_END_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERITE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);

        bambooOakPool.stairs(ModBlocks.BAMBOO_OAK_STAIRS);
        bambooOakPool.slab(ModBlocks.BAMBOO_OAK_SLAB);
        bambooOakPool.button(ModBlocks.BAMBOO_OAK_BUTTON);
        bambooOakPool.pressurePlate(ModBlocks.BAMBOO_OAK_PRESSURE_PLATE);
        bambooOakPool.fence(ModBlocks.BAMBOO_OAK_FENCE);
        bambooOakPool.fenceGate(ModBlocks.BAMBOO_OAK_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.BAMBOO_OAK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BAMBOO_OAK_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.KATANA, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDERITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.IMPURE_ENDERITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.BOTTLE_OF_FIRE, Models.GENERATED);

        itemModelGenerator.register(ModItems.BOTTLE_OF_IMPURE_RESIDUE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUCKET_OF_IMPURE_RESIDUE, Models.GENERATED);

        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
    }
}
