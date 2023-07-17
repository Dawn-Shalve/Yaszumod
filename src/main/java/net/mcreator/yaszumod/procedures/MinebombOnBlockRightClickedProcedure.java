package net.mcreator.yaszumod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import net.mcreator.yaszumod.YaszumodMod;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.Map;

public class MinebombOnBlockRightClickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				YaszumodMod.LOGGER.warn("Failed to load dependency world for procedure MinebombOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				YaszumodMod.LOGGER.warn("Failed to load dependency x for procedure MinebombOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				YaszumodMod.LOGGER.warn("Failed to load dependency y for procedure MinebombOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				YaszumodMod.LOGGER.warn("Failed to load dependency z for procedure MinebombOnBlockRightClicked!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 6000) {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 100, Level.ExplosionInteraction.TNT);
						return;
					}
				});
			}
		}.startDelay(world);
	}
}
