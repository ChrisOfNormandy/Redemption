package com.conlib.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Enable {
    public static ForgeConfigSpec.BooleanValue enable_wild_mustard;

    public static void init(ForgeConfigSpec.Builder config) {
        enable_wild_mustard = config
            .comment("Should wild mustard generate?")
            .define("doWildMustard", true);
    }
}