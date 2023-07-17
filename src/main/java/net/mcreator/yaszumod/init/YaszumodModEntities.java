
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yaszumod.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.yaszumod.entity.GodEntity;
import net.mcreator.yaszumod.YaszumodMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class YaszumodModEntities {
	public static EntityType<GodEntity> GOD;

	public static void load() {
		GOD = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(YaszumodMod.MODID, "god"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, GodEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		GodEntity.init();
		FabricDefaultAttributeRegistry.register(GOD, GodEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
