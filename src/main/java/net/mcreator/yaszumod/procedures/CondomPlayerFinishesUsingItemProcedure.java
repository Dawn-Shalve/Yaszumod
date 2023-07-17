package net.mcreator.yaszumod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.yaszumod.YaszumodMod;

import java.util.Map;

public class CondomPlayerFinishesUsingItemProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				YaszumodMod.LOGGER.warn("Failed to load dependency sourceentity for procedure CondomPlayerFinishesUsingItem!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof Player _player)
			_player.getFoodData().setFoodLevel(0);
	}
}
