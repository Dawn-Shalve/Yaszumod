
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yaszumod.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.yaszumod.block.ZaniteoreBlock;
import net.mcreator.yaszumod.block.YaszuiteBlock;
import net.mcreator.yaszumod.block.RubbersaplinBlock;
import net.mcreator.yaszumod.block.RubberlogBlock;
import net.mcreator.yaszumod.block.NerdstoneBlock;
import net.mcreator.yaszumod.block.NerdgrassBlock;
import net.mcreator.yaszumod.block.NerdLeavesBlock;
import net.mcreator.yaszumod.block.MineiteBlock;
import net.mcreator.yaszumod.block.MinebombBlock;
import net.mcreator.yaszumod.block.LosriteBlock;
import net.mcreator.yaszumod.block.GhosteriteBlock;
import net.mcreator.yaszumod.block.FuckyouBlock;
import net.mcreator.yaszumod.block.DuckBlock;
import net.mcreator.yaszumod.block.DildoBlock;
import net.mcreator.yaszumod.YaszumodMod;

public class YaszumodModBlocks {
	public static Block DUCK;
	public static Block GHOSTERITE;
	public static Block NERDGRASS;
	public static Block YASZUITE;
	public static Block COTTONPLANT;
	public static Block DILDO;
	public static Block LOSRITE;
	public static Block MINEBOMB;
	public static Block MINEITE;
	public static Block ZANITEORE;
	public static Block NERDSTONE;
	public static Block NERD_LEAVES;
	public static Block RUBBERLOG;
	public static Block RUBBERSAPLIN;

	public static void load() {
		DUCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "duck"), new DuckBlock());
		GHOSTERITE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "ghosterite"), new GhosteriteBlock());
		NERDGRASS = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "nerdgrass"), new NerdgrassBlock());
		YASZUITE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "yaszuite"), new YaszuiteBlock());
		COTTONPLANT = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "cottonplant"), new FuckyouBlock());
		DILDO = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "dildo"), new DildoBlock());
		LOSRITE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "losrite"), new LosriteBlock());
		MINEBOMB = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "minebomb"), new MinebombBlock());
		MINEITE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "mineite"), new MineiteBlock());
		ZANITEORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "zaniteore"), new ZaniteoreBlock());
		NERDSTONE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "nerdstone"), new NerdstoneBlock());
		NERD_LEAVES = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "nerd_leaves"), new NerdLeavesBlock());
		RUBBERLOG = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "rubberlog"), new RubberlogBlock());
		RUBBERSAPLIN = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(YaszumodMod.MODID, "rubbersaplin"), new RubbersaplinBlock());
	}

	public static void clientLoad() {
		DuckBlock.clientInit();
		GhosteriteBlock.clientInit();
		NerdgrassBlock.clientInit();
		YaszuiteBlock.clientInit();
		FuckyouBlock.clientInit();
		DildoBlock.clientInit();
		LosriteBlock.clientInit();
		MinebombBlock.clientInit();
		MineiteBlock.clientInit();
		ZaniteoreBlock.clientInit();
		NerdstoneBlock.clientInit();
		NerdLeavesBlock.clientInit();
		RubberlogBlock.clientInit();
		RubbersaplinBlock.clientInit();
	}
}
