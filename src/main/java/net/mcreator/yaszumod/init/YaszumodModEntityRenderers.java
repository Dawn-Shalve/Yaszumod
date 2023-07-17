
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yaszumod.init;

import net.mcreator.yaszumod.client.renderer.GodRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class YaszumodModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(YaszumodModEntities.GOD, GodRenderer::new);
	}
}
