package com.viralinnovation.createae2.registry;

import com.viralinnovation.createae2.CreateAE2;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public class ItemTypes {

	public static final Item INCOMPLETE_ENGINEERING_PROCESSOR = new Item(new FabricItemSettings().tab(CreateAE2.BASE_CREATIVE_TAB));
	public static final Item INCOMPLETE_CALCULATION_PROCESSOR = new Item(new FabricItemSettings().tab(CreateAE2.BASE_CREATIVE_TAB));
    public static final Item INCOMPLETE_LOGIC_PROCESSOR = new Item(new FabricItemSettings().tab(CreateAE2.BASE_CREATIVE_TAB));

	public static void onInitialize() {
		Registry.register(Registry.ITEM, CreateAE2.ID + ":incomplete_engineering_processor", INCOMPLETE_ENGINEERING_PROCESSOR);
		Registry.register(Registry.ITEM, CreateAE2.ID + ":incomplete_calculation_processor", INCOMPLETE_CALCULATION_PROCESSOR);
		Registry.register(Registry.ITEM, CreateAE2.ID + ":incomplete_logic_processor", INCOMPLETE_LOGIC_PROCESSOR);
	}
}
