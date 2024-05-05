package net.reactiveplayz.minecraftrehauled.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.reactiveplayz.minecraftrehauled.MinecraftRehauled;
import net.reactiveplayz.minecraftrehauled.block.custom.AdvancedCraftingTable;
import net.reactiveplayz.minecraftrehauled.block.custom.SoundBlock;

public class ModBlocks {
    public static final Block ADVANCED_CRAFTING_TABLE = registerBlock("advanced_crafting_table",
            new AdvancedCraftingTable( FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.METAL)
                    .strength(50.0f, 1200.0f)
                    .mapColor(MapColor.BLACK)
                    .requiresTool() ));
    public static final Block COBBLED_END_STONE = registerBlock("cobbled_end_stone",
            new Block( FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block ENDERITE_RESIDUE = registerBlock("enderite_residue",
        new ExperienceDroppingBlock(UniformIntProvider.create(4, 8), FabricBlockSettings.copyOf(Blocks.STONE).strength(30.0f, 1200.0f)));

    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock( FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MinecraftRehauled.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MinecraftRehauled.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        MinecraftRehauled.LOGGER.info("Registering Mod Blocks for " + MinecraftRehauled.MOD_ID);
    }

}
