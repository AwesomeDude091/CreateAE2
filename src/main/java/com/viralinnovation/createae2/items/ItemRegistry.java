package com.viralinnovation.createae2.items;

import com.viralinnovation.createae2.CreateAE2;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public class ItemRegistry {

	public static final Item INCOMPLETE_ENGINEERING_PROCESSOR = new Item(new FabricItemSettings());
	public static final Item INCOMPLETE_CALCULATION_PROCESSOR = new Item(new FabricItemSettings());
    public static final Item INCOMPLETE_LOGIC_PROCESSOR = new Item(new FabricItemSettings());

	public static void onInitialize() {
		Registry.register(Registry.ITEM, CreateAE2.ID + ":incomplete_engineering_processor", INCOMPLETE_ENGINEERING_PROCESSOR);
		Registry.register(Registry.ITEM, CreateAE2.ID + ":incomplete_calculation_processor", INCOMPLETE_CALCULATION_PROCESSOR);
		Registry.register(Registry.ITEM, CreateAE2.ID + ":incomplete_logic_processor", INCOMPLETE_LOGIC_PROCESSOR);
	}
}
