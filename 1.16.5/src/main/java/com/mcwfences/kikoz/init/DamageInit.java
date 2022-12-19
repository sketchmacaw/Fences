package com.mcwfences.kikoz.init;

import net.minecraft.util.DamageSource;

public class DamageInit extends DamageSource {
	

	   public DamageInit(String string) {
		super(string);
	}

	public static final DamageSource WIRED_FENCE = new DamageSource("wired_fence");


}