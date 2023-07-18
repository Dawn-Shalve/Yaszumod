
package net.mcreator.yaszumod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.sounds.SoundEvent;

import net.mcreator.yaszumod.init.YaszumodModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.lang.reflect.Type;

public abstract class SteelarmorItem extends ArmorItem {
	public SteelarmorItem(Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 25;
			}

			@Override
			public int getDefenseForType(Type type) {
				return new int[]{2, 5, 6, 2}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return null;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "steelarmor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends SteelarmorItem {

		public Helmet() {
			super(Type.HELMET, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(this));
		}

	}

	public static class Chestplate extends SteelarmorItem {

		public Chestplate() {
			super(Type.CHESTPLATE, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(this));
		}

	}

	public static class Leggings extends SteelarmorItem {

		public Leggings() {
			super(Type.LEGGINGS, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(this));
		}

	}

	public static class Boots extends SteelarmorItem {

		public Boots() {
			super(Type.BOOTS, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(YaszumodModTabs.TAB_YASZUSMOD).register(content -> content.accept(this));
		}

	}
}
