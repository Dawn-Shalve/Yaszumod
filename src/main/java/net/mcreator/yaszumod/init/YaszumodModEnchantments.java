
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yaszumod.init;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.yaszumod.enchantment.BigbrainEnchantment;
import net.mcreator.yaszumod.YaszumodMod;

public class YaszumodModEnchantments {
	public static Enchantment BIGBRAIN;

	public static void load() {
		BIGBRAIN = Registry.register(BuiltInRegistries.ENCHANTMENT, new ResourceLocation(YaszumodMod.MODID, "bigbrain"), new BigbrainEnchantment());
	}
}
