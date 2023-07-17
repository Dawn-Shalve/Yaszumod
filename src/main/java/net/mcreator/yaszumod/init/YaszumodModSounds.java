
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yaszumod.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class YaszumodModSounds {
	public static SoundEvent PORTALDISCMUSIC = SoundEvent.createVariableRangeEvent(new ResourceLocation("yaszumod", "portaldiscmusic"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("yaszumod", "portaldiscmusic"), PORTALDISCMUSIC);
	}
}
