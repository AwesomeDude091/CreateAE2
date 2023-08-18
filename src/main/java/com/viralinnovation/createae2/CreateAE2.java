package com.viralinnovation.createae2;

import com.simibubi.create.Create;

import com.viralinnovation.createae2.items.ItemRegistry;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateAE2 implements ModInitializer {
	public static final String ID = "createae2";
	public static final String NAME = "Create AE2";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);
		ItemRegistry.onInitialize();
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(ID, path);
	}
}
