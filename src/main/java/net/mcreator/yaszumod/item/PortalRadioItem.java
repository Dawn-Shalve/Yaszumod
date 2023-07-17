
package net.mcreator.yaszumod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.yaszumod.init.YaszumodModTabs;
import net.mcreator.yaszumod.init.YaszumodModSounds;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class PortalRadioItem extends RecordItem {
	public PortalRadioItem() {
		super(0, YaszumodModSounds.PORTALDISCMUSIC, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 100);
		ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("help me"));
	}
}
