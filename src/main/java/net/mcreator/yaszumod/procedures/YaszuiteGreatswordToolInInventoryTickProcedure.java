package net.mcreator.yaszumod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.yaszumod.YaszumodMod;

import java.util.Map;

public class YaszuiteGreatswordToolInInventoryTickProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				YaszumodMod.LOGGER.warn("Failed to load dependency sourceentity for procedure YaszuiteGreatswordToolInInventoryTick!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 3));
	}
}
