
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragonpack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.dragonpack.DragonPackMod;

public class DragonPackModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, DragonPackMod.MODID);
	public static final RegistryObject<Potion> COFFE = REGISTRY.register("coffe",
			() -> new Potion(new MobEffectInstance(DragonPackModMobEffects.CAFFINE.get(), 3600, 0, false, true),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 0, false, true)));
}
