
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yaszumod.init;

import terrablender.api.SurfaceRuleManager;
import terrablender.api.Regions;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.yaszumod.world.biome.regions.NerdBiomeRegion;
import net.mcreator.yaszumod.YaszumodMod;

public class YaszumodModBiomes {
	public static ResourceKey<Biome> NERD_BIOME = ResourceKey.create(Registries.BIOME, new ResourceLocation(YaszumodMod.MODID, "nerd_biome"));

	public static void load() {
	}

	public static void loadTerraBlenderAPI() {
		Regions.register(new NerdBiomeRegion(new ResourceLocation(YaszumodMod.MODID, "nerd_biome")));
		SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, YaszumodMod.MODID, YaszumodModSurfaceRules.makeOverworldRules());
	}
}
