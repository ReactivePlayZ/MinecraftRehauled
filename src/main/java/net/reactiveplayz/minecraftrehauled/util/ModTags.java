package net.reactiveplayz.minecraftrehauled.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.reactiveplayz.minecraftrehauled.MinecraftRehauled;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> BAMBOO_OAK_BLOCKS = createTag("bamboo_oak_blocks");
        public static final TagKey<Block> FIR_BLOCKS = createTag("fir_blocks");
        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKS = createTag("metal_detector_detectable_blocks");
        private static TagKey<Block> createTag(String name) {
            return  TagKey.of(RegistryKeys.BLOCK, new Identifier(MinecraftRehauled.MOD_ID));
        }

    }

    public static class Items {
        public static final TagKey<Item> BAMBOO_OAK_BLOCKS = createTag("bamboo_oak_items");
        public static final TagKey<Item> FIR_BLOCKS = createTag("fir_items");
        public static final TagKey<Item> AETHEREAL_ITEMS = createTag("aethereal_items");
        public static final TagKey<Item> ENDERITE_ITEMS = createTag("enderite_items");
        public static final TagKey<Item> IMPURE_ITEMS = createTag("impure_items");
        private static TagKey<Item> createTag(String name) {
            return  TagKey.of(RegistryKeys.ITEM, new Identifier(MinecraftRehauled.MOD_ID));
        }
    }


}
