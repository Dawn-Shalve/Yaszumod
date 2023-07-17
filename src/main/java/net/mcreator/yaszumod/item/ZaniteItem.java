
package net.mcreator.yaszumod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.yaszumod.init.YaszumodModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ZaniteItem extends Item {
	public ZaniteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
		ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
