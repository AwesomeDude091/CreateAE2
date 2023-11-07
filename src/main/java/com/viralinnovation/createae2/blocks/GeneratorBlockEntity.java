package com.viralinnovation.createae2.blocks;

import appeng.api.config.Actionable;
import appeng.api.networking.energy.IAEPowerStorage;

import com.simibubi.create.content.kinetics.base.KineticBlockEntity;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import org.jetbrains.annotations.Nullable;

@MethodsReturnNonnullByDefault
public class GeneratorBlockEntity extends KineticBlockEntity {

	private @Nullable IAEPowerStorage powerStorage;

	public GeneratorBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}

	@Override
	protected void read(CompoundTag compound, boolean clientPacket) {
		super.read(compound, clientPacket);
	}

	@Override
	public void write(CompoundTag compound, boolean clientPacket) {
		super.write(compound, clientPacket);
	}

	@Override
	public void remove() {
		super.remove();
	}

	public void blockInFrontChanged(@Nullable IAEPowerStorage storage) {
		this.powerStorage = storage;
	}

	@Override
	public void tick() {
		super.tick();
		if(powerStorage != null) {
			powerStorage.injectAEPower(100000, Actionable.MODULATE);
			System.out.println(powerStorage.getAECurrentPower());
		}
	}

}
