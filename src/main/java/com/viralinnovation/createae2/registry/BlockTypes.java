package com.viralinnovation.createae2.registry;

import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static com.simibubi.create.foundation.data.TagGen.axeOrPickaxe;

import com.simibubi.create.content.kinetics.BlockStressDefaults;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.viralinnovation.createae2.CreateAE2;
import com.viralinnovation.createae2.blocks.GeneratorBlock;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.material.MaterialColor;

public class BlockTypes {

	public static final BlockEntry<GeneratorBlock> Generator =
			CreateAE2.REGISTRATE.block("ae2_generator", GeneratorBlock::new)
			.initialProperties(SharedProperties::stone)
			.properties(p -> p.color(MaterialColor.PODZOL))
			.blockstate(BlockStateGen.directionalBlockProvider(true))
			.addLayer(() -> RenderType::cutoutMipped)
			.transform(axeOrPickaxe())
			.transform(BlockStressDefaults.setImpact(2.0))
			.item()
			.transform(customItemModel())
			.register();

	public static void register() {}
}
