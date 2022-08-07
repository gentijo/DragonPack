
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragonpack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.dragonpack.enchantment.THunderpEnchantment;
import net.mcreator.dragonpack.DragonPackMod;

public class DragonPackModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, DragonPackMod.MODID);
	public static final RegistryObject<Enchantment> T_HUNDERP = REGISTRY.register("t_hunderp", () -> new THunderpEnchantment());
}
