
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yaszumod.init;

import net.mcreator.yaszumod.client.model.Modelcustom_model;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class YaszumodModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
