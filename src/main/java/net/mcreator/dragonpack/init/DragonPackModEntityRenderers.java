
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dragonpack.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.dragonpack.client.renderer.FeRenderer;
import net.mcreator.dragonpack.client.renderer.FRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DragonPackModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DragonPackModEntities.AQUA_TRIDENT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DragonPackModEntities.WOODEN_STAFF.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DragonPackModEntities.BOOM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DragonPackModEntities.BOMB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DragonPackModEntities.F.get(), FRenderer::new);
		event.registerEntityRenderer(DragonPackModEntities.FE.get(), FeRenderer::new);
	}
}
