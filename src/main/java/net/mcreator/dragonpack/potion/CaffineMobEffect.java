
package net.mcreator.dragonpack.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CaffineMobEffect extends MobEffect {
	public CaffineMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6724096);
	}

	@Override
	public String getDescriptionId() {
		return "effect.dragon_pack.caffine";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
