
package net.mcreator.dragonpack.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.dragonpack.entity.DoomwolfEntity;

public class DoomwolfRenderer extends MobRenderer<DoomwolfEntity, CowModel<DoomwolfEntity>> {
	public DoomwolfRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DoomwolfEntity entity) {
		return new ResourceLocation("dragon_pack:textures/egvf.png");
	}
}
