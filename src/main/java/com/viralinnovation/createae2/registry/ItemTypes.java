package com.viralinnovation.createae2.registry;

import com.tterrag.registrate.util.entry.ItemEntry;
import com.viralinnovation.createae2.CreateAE2;

import net.minecraft.world.item.Item;

public class ItemTypes {

	public static final ItemEntry<Item> INCOMPLETE_ENGINEERING_PROCESSOR =
			CreateAE2.REGISTRATE.item("incomplete_engineering_processor", Item::new)
					.register();

	public static final ItemEntry<Item> INCOMPLETE_CALCULATION_PROCESSOR =
			CreateAE2.REGISTRATE.item("incomplete_calculation_processor", Item::new)
					.register();

	public static final ItemEntry<Item> INCOMPLETE_LOGIC_PROCESSOR =
			CreateAE2.REGISTRATE
					.item("incomplete_logic_processor", Item::new)
					.register();

	public static void register() {}
}
