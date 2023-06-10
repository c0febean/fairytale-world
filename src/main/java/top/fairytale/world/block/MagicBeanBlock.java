package top.fairytale.world.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class MagicBeanBlock extends Block {

    public MagicBeanBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

//    @Override
//    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
//        BlockState blockBelowState = world.getBlockState(pos.below());
//        FluidState fluidState = world.getFluidState(pos);
//
//        return blockBelowState.isIn(BlockTags.DIRT) && world.getDimension().hasCeiling() == World.OVERWORLD
//                && fluidState.getFluid() == Fluids.WATER && fluidState.isSource();
//    }
//
//    @Override
//    public Item asItem() {
//        return null;
//    }
//
//    @Override
//    protected Block asBlock() {
//        return null;
//    }
//
//    @Override
//    public void onPlace(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
//        if (!world.isClient) {
//            if (!canPlaceAt(state, world, pos)) {
//                world.breakBlock(pos, true);
//            }
//        }
//    }
//
//    @Override
//    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
//        if (!world.isClient && world.getFluidState(pos).isSource()) {
//        }
//    }
//
//    @Override
//    public void onBlockRemoved(BlockState state, World world, BlockPos pos, BlockState newState, boolean notify) {
//        if (!world.isClient && !state.is(newState.getBlock())) {
//        }
//    }
}
