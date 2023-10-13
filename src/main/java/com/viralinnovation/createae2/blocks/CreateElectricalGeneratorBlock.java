package com.viralinnovation.createae2.blocks;

import com.simibubi.create.content.kinetics.base.DirectionalKineticBlock;
import com.simibubi.create.foundation.block.IBE;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CreateElectricalGeneratorBlock extends DirectionalKineticBlock implements IBE<CreateElectricalGeneratorBlockEntity> {

    public CreateElectricalGeneratorBlock(Properties properties) {
        super(properties);
    }

    @Override
    public Direction.Axis getRotationAxis(BlockState state) {
        return null;
    }

    @Override
    public Class<CreateElectricalGeneratorBlockEntity> getBlockEntityClass() {
        return CreateElectricalGeneratorBlockEntity.class;
    }

    @Override
    public BlockEntityType<? extends CreateElectricalGeneratorBlockEntity> getBlockEntityType() {
        return null;
    }
}
