
package net.mcreator.yaszumod.world.biome.regions;

import terrablender.api.RegionType;
import terrablender.api.Region;

import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.yaszumod.init.YaszumodModBiomes;

import java.util.function.Consumer;

import com.mojang.datafixers.util.Pair;

public class NerdBiomeRegion extends Region {
	public static final Climate.ParameterPoint PARAMETER_POINTS = new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f),
			Climate.Parameter.point(0.0f), Climate.Parameter.span(-1f, 1f), 0);

	public NerdBiomeRegion(ResourceLocation name) {
		super(name, RegionType.OVERWORLD, 2);
	}

	@Override
	public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
		this.addBiome(mapper, PARAMETER_POINTS, YaszumodModBiomes.NERD_BIOME);
	}
}
