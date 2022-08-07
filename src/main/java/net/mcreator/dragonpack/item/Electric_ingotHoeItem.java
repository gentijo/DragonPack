
package net.mcreator.dragonpack.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.dragonpack.init.DragonPackModItems;

public class Electric_ingotHoeItem extends HoeItem {
	public Electric_ingotHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 10;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DragonPackModItems.ELECTRIC_INGOT_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
