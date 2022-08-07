
package net.mcreator.dragonpack.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.dragonpack.init.DragonPackModItems;

public class THunderpEnchantment extends Enchantment {
	public THunderpEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 55;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == DragonPackModItems.THUNDER_FIST.get())
			return true;
		if (stack.getItem() == DragonPackModItems.ELECTRIC_INGOT_SWORD.get())
			return true;
		if (stack.getItem() == DragonPackModItems.ELECTRIC_INGOT_HOE.get())
			return true;
		if (stack.getItem() == DragonPackModItems.ELECTRIC_INGOT_SHOVEL.get())
			return true;
		if (stack.getItem() == DragonPackModItems.ELECTRIC_INGOT_AXE.get())
			return true;
		if (stack.getItem() == DragonPackModItems.ELECTRIC_INGOT_PICKAXE.get())
			return true;
		return false;
	}
}
