package net.kikoz.mcwfences.init;

import net.minecraft.entity.damage.DamageSource;

public class DamageInit extends DamageSource {
    public DamageInit(String name) {
        super(name);
    }

    public static final DamageInit WIRED_FENCE = new DamageInit("wired_fence");

}
