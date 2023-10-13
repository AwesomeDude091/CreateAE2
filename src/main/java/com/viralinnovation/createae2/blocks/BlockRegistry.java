package com.viralinnovation.createae2.blocks;

import com.simibubi.create.foundation.data.CreateBlockEntityBuilder;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.viralinnovation.createae2.CreateAE2;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public class BlockRegistry {

    // public static final Block CreateElectricalGenerator = new CreateElectricalGeneratorBlock(FabricBlockSettings.of(CreateRegistrate));

    public static void onInitialize() {
        //Registry.register(Registry.BLOCK_REGISTRY, CreateAE2.ID + ":electrical_generator", CreateElectricalGenerator);
    }
}
