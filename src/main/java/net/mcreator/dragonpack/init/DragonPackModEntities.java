
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
import net.mcreator.dragonpack.entity.PokeballEntity;
import net.mcreator.dragonpack.entity.FeEntity;
import net.mcreator.dragonpack.entity.FEntity;
import net.mcreator.dragonpack.entity.DoomwolfEntity;
import net.mcreator.dragonpack.entity.BombEntity;
import net.mcreator.dragonpack.entity.BOOMEntity;
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
	public static final RegistryObject<EntityType<BOOMEntity>> BOOM = register("projectile_boom",
			EntityType.Builder.<BOOMEntity>of(BOOMEntity::new, MobCategory.MISC).setCustomClientFactory(BOOMEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BombEntity>> BOMB = register("projectile_bomb",
			EntityType.Builder.<BombEntity>of(BombEntity::new, MobCategory.MISC).setCustomClientFactory(BombEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FEntity>> F = register("f",
			EntityType.Builder.<FEntity>of(FEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FeEntity>> FE = register("fe",
			EntityType.Builder.<FeEntity>of(FeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FeEntity::new).fireImmune().sized(0.7f, 0.4f));
	public static final RegistryObject<EntityType<DoomwolfEntity>> DOOMWOLF = register("doomwolf",
			EntityType.Builder.<DoomwolfEntity>of(DoomwolfEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DoomwolfEntity::new)

					.sized(0.9f, 1.4f));
	public static final RegistryObject<EntityType<PokeballEntity>> POKEBALL = register("projectile_pokeball",
			EntityType.Builder.<PokeballEntity>of(PokeballEntity::new, MobCategory.MISC).setCustomClientFactory(PokeballEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FEntity.init();
			FeEntity.init();
			DoomwolfEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(F.get(), FEntity.createAttributes().build());
		event.put(FE.get(), FeEntity.createAttributes().build());
		event.put(DOOMWOLF.get(), DoomwolfEntity.createAttributes().build());
	}
}
