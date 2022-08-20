
package net.mcreator.dragonpack.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SalmonModel;

import net.mcreator.dragonpack.entity.FeEntity;

public class FeRenderer extends MobRenderer<FeEntity, SalmonModel<FeEntity>> {
	public FeRenderer(EntityRendererProvider.Context context) {
		super(context, new SalmonModel(context.bakeLayer(ModelLayers.SALMON)), 0.5f);
		this.addLayer(new EyesLayer<FeEntity, SalmonModel<FeEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("dragon_pack:textures/trident.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FeEntity entity) {
		return new ResourceLocation("dragon_pack:textures/egvf.png");
	}
}
