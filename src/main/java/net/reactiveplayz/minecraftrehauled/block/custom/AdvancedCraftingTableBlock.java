/*
 * Decompiled with CFR 0.2.2 (FabricMC 7c48b8c4).
 */
package net.reactiveplayz.minecraftrehauled.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AdvancedCraftingTableBlock extends Block {
    public static final MapCodec<AdvancedCraftingTableBlock> CODEC = AdvancedCraftingTableBlock.createCodec(AdvancedCraftingTableBlock::new);
    private static final Text TITLE = Text.translatable("container.crafting");

    public MapCodec<? extends AdvancedCraftingTableBlock> getCodec() {
        return CODEC;
    }

    public AdvancedCraftingTableBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        }
        player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
        player.incrementStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
        return ActionResult.CONSUME;
    }

    @Override
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((syncId, inventory, player) -> new CraftingScreenHandler(syncId, inventory, ScreenHandlerContext.create(world, pos)), TITLE);
    }
}

