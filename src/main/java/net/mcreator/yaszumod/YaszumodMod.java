/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.yaszumod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.yaszumod.init.YaszumodModTrades;
import net.mcreator.yaszumod.init.YaszumodModTabs;
import net.mcreator.yaszumod.init.YaszumodModSounds;
import net.mcreator.yaszumod.init.YaszumodModProcedures;
import net.mcreator.yaszumod.init.YaszumodModPotions;
import net.mcreator.yaszumod.init.YaszumodModPaintings;
import net.mcreator.yaszumod.init.YaszumodModItems;
import net.mcreator.yaszumod.init.YaszumodModFeatures;
import net.mcreator.yaszumod.init.YaszumodModEntities;
import net.mcreator.yaszumod.init.YaszumodModEnchantments;
import net.mcreator.yaszumod.init.YaszumodModBlocks;

import net.fabricmc.api.ModInitializer;

public class YaszumodMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "yaszumod";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing YaszumodMod");

		YaszumodModTabs.load();

		YaszumodModEnchantments.load();

		YaszumodModPotions.load();
		YaszumodModEntities.load();
		YaszumodModBlocks.load();
		YaszumodModItems.load();

		YaszumodModFeatures.load();
		YaszumodModPaintings.load();
		YaszumodModProcedures.load();

		YaszumodModTrades.registerTrades();
		YaszumodModSounds.load();

	}
}
