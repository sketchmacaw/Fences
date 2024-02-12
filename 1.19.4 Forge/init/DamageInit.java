package com.mcwfences.kikoz.init;

import net.minecraft.core.Holder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;

public class DamageInit extends DamageSource {

	public DamageInit(Holder<DamageType> type) {
		super(type);
	}
}

