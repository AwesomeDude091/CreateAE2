package com.viralinnovation.createae2.mixins;

import com.google.gson.JsonElement;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.item.crafting.RecipeManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Mixin(RecipeManager.class)
public class RecipeManagerMixin {

    private static final List<String> removedRecipes = new ArrayList<>(){{
        add("ae2:inscriber/certus_quartz_dust");
        add("ae2:inscriber/sky_stone_dust");
        add("ae2:inscriber/fluix_dust");
        add("ae2:inscriber/ender_dust");
    }};

    @Inject(method = "apply", at = @At(value = "HEAD"))
    private void applyMixin(Map<ResourceLocation, JsonElement> map, ResourceManager resourceManager, ProfilerFiller profilerFiller, CallbackInfo callbackInfo) {
        List<ResourceLocation> pendingRemoval = new ArrayList<>();
        for(String recipe: removedRecipes) {
            for (ResourceLocation resourceLocation : map.keySet()) {
                if (resourceLocation.toString().equals(recipe)) {
                    pendingRemoval.add(resourceLocation);
                }
            }
        }
        for(ResourceLocation resourceLocation: pendingRemoval) {
            map.remove(resourceLocation);
        }
    }
}
