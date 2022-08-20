
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragonpack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.dragonpack.potion.CaffineMobEffect;
import net.mcreator.dragonpack.DragonPackMod;

public class DragonPackModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DragonPackMod.MODID);
	public static final RegistryObject<MobEffect> CAFFINE = REGISTRY.register("caffine", () -> new CaffineMobEffect());
}
