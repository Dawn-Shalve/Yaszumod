
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yaszumod.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.yaszumod.YaszumodMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class YaszumodModTabs {
	public static ResourceKey<CreativeModeTab> TAB_YASZUSMOD = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(YaszumodMod.MODID, "yaszusmod"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_YASZUSMOD, FabricItemGroup.builder().title(Component.translatable("item_group." + YaszumodMod.MODID + ".yaszusmod")).icon(() -> new ItemStack(Items.POTION)).build());
	}
}
