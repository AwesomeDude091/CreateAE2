package com.viralinnovation.createae2.registry;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.kinetics.base.HalfShaftInstance;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import com.viralinnovation.createae2.CreateAE2;
import com.viralinnovation.createae2.blocks.GeneratorBlockEntity;
import com.viralinnovation.createae2.blocks.GeneratorRenderer;

public class BlockEntityTypes {

	public static final BlockEntityEntry<GeneratorBlockEntity> GENERATOR = CreateAE2.REGISTRATE
			.blockEntity("ae2_generator", GeneratorBlockEntity::new)
			.instance(() -> HalfShaftInstance::new, false)
			.validBlocks(AllBlocks.ENCASED_FAN)
			.renderer(() -> GeneratorRenderer::new)
			.register();

	public static void register() {}
}
