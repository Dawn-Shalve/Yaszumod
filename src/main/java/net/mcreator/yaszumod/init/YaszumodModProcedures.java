
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yaszumod.init;

import net.mcreator.yaszumod.procedures.ZaneswordLivingEntityIsHitWithToolProcedure;
import net.mcreator.yaszumod.procedures.YaszuiteGreatswordToolInInventoryTickProcedure;
import net.mcreator.yaszumod.procedures.MinebombOnBlockRightClickedProcedure;
import net.mcreator.yaszumod.procedures.CondomPlayerFinishesUsingItemProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class YaszumodModProcedures {
	public static void load() {
		new ZaneswordLivingEntityIsHitWithToolProcedure();
		new CondomPlayerFinishesUsingItemProcedure();
		new YaszuiteGreatswordToolInInventoryTickProcedure();
		new MinebombOnBlockRightClickedProcedure();
	}
}
