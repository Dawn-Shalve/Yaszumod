
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yaszumod.init;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.yaszumod.YaszumodMod;

public class YaszumodModPotions {
	public static Potion ALCHOHOL;

	public static void load() {
		ALCHOHOL = Registry.register(BuiltInRegistries.POTION, new ResourceLocation(YaszumodMod.MODID, "alchohol"),
				new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 3, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 3, false, true), new MobEffectInstance(MobEffects.CONFUSION, 3600, 3, false, true)));
	}
}
