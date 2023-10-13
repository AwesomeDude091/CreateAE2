package com.viralinnovation.createae2.blocks;

import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CreateElectricalGeneratorBlockEntity extends KineticBlockEntity {
    public CreateElectricalGeneratorBlockEntity(BlockEntityType<?> typeIn, BlockPos pos, BlockState state) {
        super(typeIn, pos, state);
    }

    @Override
    public void tick() {
        assert getLevel() != null;

        BlockPos gridBlockPos;
        System.out.println(getLevel().getBlockState(getBlockPos().above()).getBlock().getDescriptionId());
        //if()

        //IGrid grid = GridHelper.getNodeHost(getLevel(), getBlockPos())

        super.tick();
    }
}
