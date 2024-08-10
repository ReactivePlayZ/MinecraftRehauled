package net.reactiveplayz.minecraftrehauled.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.reactiveplayz.minecraftrehauled.MinecraftRehauled;
import net.reactiveplayz.minecraftrehauled.block.custom.AdvancedCraftingTableBlock;
import net.reactiveplayz.minecraftrehauled.block.custom.SoundBlock;

public class ModBlocks {
    public static final Block ADVANCED_CRAFTING_TABLE = registerBlock("advanced_crafting_table",
            new AdvancedCraftingTableBlock( FabricBlockSettings.copyOf(Blocks.SMITHING_TABLE)
                    .sounds(BlockSoundGroup.METAL)
                    .strength(50.0f, 1200.0f)
                    .mapColor(MapColor.BLACK)
                    .requiresTool() ));
    public static final Block COBBLED_END_STONE = registerBlock("cobbled_end_stone",
            new Block( FabricBlockSettings.copyOf(Blocks.END_STONE)) );

    public static final Block ENDERITE_RESIDUE = registerBlock("enderite_residue",
        new ExperienceDroppingBlock(UniformIntProvider.create(4, 8), FabricBlockSettings.copyOf(Blocks.STONE).strength(30.0f, 1200.0f)));
    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
            new Block( FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)) );

    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock( FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BAMBOO_OAK_PLANKS = registerBlock("bamboo_oak_planks",
            new Block( FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS).mapColor(MapColor.PALE_GREEN) ));
    public static final Block BAMBOO_OAK_STAIRS = registerBlock("bamboo_oak_stairs",
            new StairsBlock(ModBlocks.BAMBOO_OAK_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.BAMBOO_STAIRS).mapColor(MapColor.PALE_GREEN)));
    public static final Block BAMBOO_OAK_SLAB = registerBlock("bamboo_oak_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.BAMBOO_SLAB).mapColor(MapColor.PALE_GREEN)));
    public static final Block BAMBOO_OAK_BUTTON = registerBlock("bamboo_oak_button",
            new ButtonBlock( BlockSetType.BAMBOO, 10,
                    FabricBlockSettings.copyOf(Blocks.BAMBOO_BUTTON).mapColor(MapColor.PALE_GREEN).collidable(false) ));
    public static final Block BAMBOO_OAK_PRESSURE_PLATE = registerBlock("bamboo_oak_pressure_plate",
            new PressurePlateBlock(BlockSetType.BAMBOO, FabricBlockSettings.copyOf(Blocks.BAMBOO_PRESSURE_PLATE).mapColor(MapColor.PALE_GREEN)));
    public static final Block BAMBOO_OAK_FENCE = registerBlock("bamboo_oak_fence",
            new FenceBlock( FabricBlockSettings.copyOf(Blocks.BAMBOO_FENCE).mapColor(MapColor.PALE_GREEN)));
    public static final Block BAMBOO_OAK_FENCE_GATE = registerBlock("bamboo_oak_fence_gate",
            new FenceGateBlock( WoodType.BAMBOO, FabricBlockSettings.copyOf(Blocks.BAMBOO_FENCE_GATE).mapColor(MapColor.PALE_GREEN)) );
    public static final Block BAMBOO_OAK_DOOR = registerBlock("bamboo_oak_door",
            new DoorBlock( BlockSetType.BAMBOO, FabricBlockSettings.copyOf(Blocks.BAMBOO_DOOR).mapColor(MapColor.PALE_GREEN)));
    public static final Block BAMBOO_OAK_TRAPDOOR = registerBlock("bamboo_oak_trapdoor",
            new TrapdoorBlock( BlockSetType.BAMBOO, FabricBlockSettings.copyOf(Blocks.BAMBOO_TRAPDOOR).mapColor(MapColor.PALE_GREEN)));

    public static final Block FIR_PLANKS = registerBlock("fir_planks",
            new Block( FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.WHITE) ));
    public static final Block FIR_STAIRS = registerBlock("fir_stairs",
            new StairsBlock(ModBlocks.BAMBOO_OAK_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.WHITE)));
    public static final Block FIR_SLAB = registerBlock("fir_slab",
            new SlabBlock( FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).mapColor(MapColor.WHITE)));
    public static final Block FIR_BUTTON = registerBlock("fir_button",
            new ButtonBlock( BlockSetType.OAK, 20,
                    FabricBlockSettings.copyOf(Blocks.OAK_BUTTON).mapColor(MapColor.WHITE).collidable(false) ));
    public static final Block FIR_PRESSURE_PLATE = registerBlock("fir_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE).mapColor(MapColor.WHITE)));
    public static final Block FIR_FENCE = registerBlock("fir_fence",
            new FenceBlock( FabricBlockSettings.copyOf(Blocks.OAK_FENCE).mapColor(MapColor.WHITE)));
    public static final Block FIR_FENCE_GATE = registerBlock("fir_fence_gate",
            new FenceGateBlock( WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE).mapColor(MapColor.WHITE)) );
    public static final Block FIR_DOOR = registerBlock("fir_door",
            new DoorBlock( BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_DOOR).mapColor(MapColor.WHITE)));
    public static final Block FIR_TRAPDOOR = registerBlock("fir_trapdoor",
            new TrapdoorBlock( BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR).mapColor(MapColor.WHITE)));

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
