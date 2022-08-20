
package net.mcreator.dragonpack.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.dragonpack.init.DragonPackModItems;

public class SwiftnessEnchantment extends Enchantment {
	public SwiftnessEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 100;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == DragonPackModItems.REDSTEELKATANA.get())
			return true;
		if (stack.getItem() == DragonPackModItems.TNT_SWORD.get())
			return true;
		if (stack.getItem() == DragonPackModItems.ELECTRIC_INGOT_SWORD.get())
			return true;
		if (stack.getItem() == Items.DIAMOND_SWORD)
			return true;
		if (stack.getItem() == Items.NETHERITE_SWORD)
			return true;
		if (stack.getItem() == Items.GOLDEN_SWORD)
			return true;
		if (stack.getItem() == Items.IRON_SWORD)
			return true;
		if (stack.getItem() == Items.STONE_SWORD)
			return true;
		if (stack.getItem() == Items.WOODEN_SWORD)
			return true;
		return false;
	}
}
