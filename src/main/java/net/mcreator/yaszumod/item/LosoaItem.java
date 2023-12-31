
package net.mcreator.yaszumod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.Component;

import net.mcreator.yaszumod.init.YaszumodModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class LosoaItem extends Item {
	public LosoaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(10).saturationMod(10f).alwaysEat()

				.build()));
		ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(this));
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("LOSOA'S PFP"));
	}
}
