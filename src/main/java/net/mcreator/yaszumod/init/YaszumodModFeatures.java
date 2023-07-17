
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yaszumod.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.yaszumod.world.features.plants.FuckyouFeature;
import net.mcreator.yaszumod.world.features.ores.YaszuiteFeature;
import net.mcreator.yaszumod.world.features.ores.NerdgrassFeature;
import net.mcreator.yaszumod.world.features.ores.MineiteFeature;
import net.mcreator.yaszumod.world.features.ores.LosriteFeature;
import net.mcreator.yaszumod.world.features.ores.GhosteriteFeature;
import net.mcreator.yaszumod.YaszumodMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class YaszumodModFeatures {
	public static void load() {
		register("ghosterite", new GhosteriteFeature(), GhosteriteFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("nerdgrass", new NerdgrassFeature(), NerdgrassFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("yaszuite", new YaszuiteFeature(), YaszuiteFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("cottonplant", new FuckyouFeature(), FuckyouFeature.GENERATE_BIOMES, GenerationStep.Decoration.VEGETAL_DECORATION);
		register("losrite", new LosriteFeature(), LosriteFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("mineite", new MineiteFeature(), MineiteFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(YaszumodMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(YaszumodMod.MODID, registryName)));
	}
}
