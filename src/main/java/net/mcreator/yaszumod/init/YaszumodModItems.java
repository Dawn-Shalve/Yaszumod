
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yaszumod.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.yaszumod.item.ZaniteItem;
import net.mcreator.yaszumod.item.ZaneswordItem;
import net.mcreator.yaszumod.item.YaszuitecrystalItem;
import net.mcreator.yaszumod.item.YaszuiteGreatswordItem;
import net.mcreator.yaszumod.item.YaszuhelmetItem;
import net.mcreator.yaszumod.item.YaszuPickaxeItem;
import net.mcreator.yaszumod.item.PortalRadioItem;
import net.mcreator.yaszumod.item.LosoaItem;
import net.mcreator.yaszumod.item.LoseriteyesItem;
import net.mcreator.yaszumod.item.GhosteriteitemItem;
import net.mcreator.yaszumod.item.GhosteritePickaxeItem;
import net.mcreator.yaszumod.item.CookiedoughItem;
import net.mcreator.yaszumod.item.CondomItem;
import net.mcreator.yaszumod.YaszumodMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class YaszumodModItems {
	public static Item YASZUHELMET_HELMET;
	public static Item LOSOA;
	public static Item DUCK;
	public static Item CONDOM;
	public static Item ZANESWORD;
	public static Item GHOSTERITE;
	public static Item NERDGRASS;
	public static Item GHOSTERITEITEM;
	public static Item GOD_SPAWN_EGG;
	public static Item YASZU_PICKAXE;
	public static Item YASZUITE;
	public static Item COTTONPLANT;
	public static Item PORTAL_RADIO;
	public static Item YASZUITECRYSTAL;
	public static Item DILDO;
	public static Item YASZUITE_GREATSWORD;
	public static Item GHOSTERITE_PICKAXE;
	public static Item LOSRITE;
	public static Item MINEBOMB;
	public static Item MINEITE;
	public static Item LOSERITEYES;
	public static Item ZANITE;
	public static Item COOKIEDOUGH;
	public static Item ZANITEORE;

	public static void load() {
		YASZUHELMET_HELMET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "yaszuhelmet_helmet"), new YaszuhelmetItem.Helmet());
		LOSOA = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "losoa"), new LosoaItem());
		DUCK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "duck"), new BlockItem(YaszumodModBlocks.DUCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(DUCK));
		CONDOM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "condom"), new CondomItem());
		ZANESWORD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "zanesword"), new ZaneswordItem());
		GHOSTERITE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "ghosterite"), new BlockItem(YaszumodModBlocks.GHOSTERITE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(GHOSTERITE));
		NERDGRASS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "nerdgrass"), new BlockItem(YaszumodModBlocks.NERDGRASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(NERDGRASS));
		GHOSTERITEITEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "ghosteriteitem"), new GhosteriteitemItem());
		GOD_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "god_spawn_egg"), new SpawnEggItem(YaszumodModEntities.GOD, -65536, -1, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(GOD_SPAWN_EGG));
		YASZU_PICKAXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "yaszu_pickaxe"), new YaszuPickaxeItem());
		YASZUITE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "yaszuite"), new BlockItem(YaszumodModBlocks.YASZUITE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(YASZUITE));
		COTTONPLANT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "cottonplant"), new BlockItem(YaszumodModBlocks.COTTONPLANT, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> content.accept(COTTONPLANT));
		PORTAL_RADIO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "portal_radio"), new PortalRadioItem());
		YASZUITECRYSTAL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "yaszuitecrystal"), new YaszuitecrystalItem());
		DILDO = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "dildo"), new BlockItem(YaszumodModBlocks.DILDO, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(DILDO));
		YASZUITE_GREATSWORD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "yaszuite_greatsword"), new YaszuiteGreatswordItem());
		GHOSTERITE_PICKAXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "ghosterite_pickaxe"), new GhosteritePickaxeItem());
		LOSRITE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "losrite"), new BlockItem(YaszumodModBlocks.LOSRITE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(LOSRITE));
		MINEBOMB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "minebomb"), new BlockItem(YaszumodModBlocks.MINEBOMB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(MINEBOMB));
		MINEITE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "mineite"), new BlockItem(YaszumodModBlocks.MINEITE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(MINEITE));
		LOSERITEYES = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "loseriteyes"), new LoseriteyesItem());
		ZANITE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "zanite"), new ZaniteItem());
		COOKIEDOUGH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "cookiedough"), new CookiedoughItem());
		ZANITEORE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(YaszumodMod.MODID, "zaniteore"), new BlockItem(YaszumodModBlocks.ZANITEORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(ZANITEORE));
	}
}
