
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragonpack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.dragonpack.entity.WoodenStaffEntity;
import net.mcreator.dragonpack.entity.AquaTridentEntity;
import net.mcreator.dragonpack.DragonPackMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DragonPackModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, DragonPackMod.MODID);
	public static final RegistryObject<EntityType<AquaTridentEntity>> AQUA_TRIDENT = register("projectile_aqua_trident",
			EntityType.Builder.<AquaTridentEntity>of(AquaTridentEntity::new, MobCategory.MISC).setCustomClientFactory(AquaTridentEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WoodenStaffEntity>> WOODEN_STAFF = register("projectile_wooden_staff",
			EntityType.Builder.<WoodenStaffEntity>of(WoodenStaffEntity::new, MobCategory.MISC).setCustomClientFactory(WoodenStaffEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
