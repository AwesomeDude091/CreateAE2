package com.viralinnovation.createae2;

import com.simibubi.create.Create;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.infrastructure.item.BaseCreativeModeTab;
import com.viralinnovation.createae2.creativetab.CreateAE2CreativeModeTab;
import com.viralinnovation.createae2.registry.BlockEntityTypes;
import com.viralinnovation.createae2.registry.BlockTypes;
import com.viralinnovation.createae2.registry.ItemTypes;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.item.CreativeModeTab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateAE2 implements ModInitializer {
	public static final String ID = "createae2";
	public static final String NAME = "Create AE2";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	public static final CreativeModeTab BASE_CREATIVE_TAB = new CreateAE2CreativeModeTab("Create AE2");

	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ID)
			.creativeModeTab(() -> BASE_CREATIVE_TAB, "Create AE2");

	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);
		ItemTypes.onInitialize();
		BlockEntityTypes.register();
		BlockTypes.register();
		REGISTRATE.register();
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(ID, path);
	}
}
