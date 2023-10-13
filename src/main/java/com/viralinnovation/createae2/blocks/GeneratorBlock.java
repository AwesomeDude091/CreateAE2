package com.viralinnovation.createae2.blocks;

import org.jetbrains.annotations.NotNull;

import com.simibubi.create.content.kinetics.base.DirectionalKineticBlock;
import com.simibubi.create.content.logistics.chute.AbstractChuteBlock;
import com.simibubi.create.foundation.block.IBE;
import com.viralinnovation.createae2.registry.BlockEntityTypes;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.Axis;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class GeneratorBlock extends DirectionalKineticBlock implements IBE<GeneratorBlockEntity> {

	public GeneratorBlock(Properties properties) {
		super(properties);
	}

	@Override
	public void onPlace(BlockState state, Level worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
		super.onPlace(state, worldIn, pos, oldState, isMoving);
	}

	@Override
	public void updateIndirectNeighbourShapes(BlockState stateIn, LevelAccessor worldIn, BlockPos pos, int flags, int count) {
		super.updateIndirectNeighbourShapes(stateIn, worldIn, pos, flags, count);
	}

	@Override
	public void neighborChanged(@NotNull BlockState state, @NotNull Level worldIn, @NotNull BlockPos pos, @NotNull Block blockIn, @NotNull BlockPos fromPos,
								boolean isMoving) {
	}

	@Override
	public BlockState getStateForPlacement(@NotNull BlockPlaceContext context) {
		Level world = context.getLevel();
		BlockPos pos = context.getClickedPos();
		Direction face = context.getClickedFace();

		BlockState placedOn = world.getBlockState(pos.relative(face.getOpposite()));
		BlockState placedOnOpposite = world.getBlockState(pos.relative(face));
		if (AbstractChuteBlock.isChute(placedOn))
			return defaultBlockState().setValue(FACING, face.getOpposite());
		if (AbstractChuteBlock.isChute(placedOnOpposite))
			return defaultBlockState().setValue(FACING, face);

		Direction preferredFacing = getPreferredFacing(context);
		if (preferredFacing == null)
			preferredFacing = context.getNearestLookingDirection();
		return defaultBlockState().setValue(FACING, context.getPlayer() != null && context.getPlayer()
			.isShiftKeyDown() ? preferredFacing : preferredFacing.getOpposite());
	}

	@Override
	public BlockState updateAfterWrenched(BlockState newState, UseOnContext context) {
		return newState;
	}

	@Override
	public Axis getRotationAxis(BlockState state) {
		return state.getValue(FACING)
			.getAxis();
	}

	@Override
	public boolean hasShaftTowards(LevelReader world, BlockPos pos, BlockState state, Direction face) {
		return face == state.getValue(FACING)
			.getOpposite();
	}

	@Override
	public Class<GeneratorBlockEntity> getBlockEntityClass() {
		return GeneratorBlockEntity.class;
	}

	@Override
	public BlockEntityType<? extends GeneratorBlockEntity> getBlockEntityType() {
		return BlockEntityTypes.GENERATOR.get();
	}

}