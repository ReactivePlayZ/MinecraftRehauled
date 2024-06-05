package net.reactiveplayz.minecraftrehauled;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.reactiveplayz.minecraftrehauled.block.ModBlocks;

public class MinecraftRehauledClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAMBOO_OAK_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAMBOO_OAK_TRAPDOOR, RenderLayer.getCutout());
    }
}
