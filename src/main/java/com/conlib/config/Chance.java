package com.conlib.config;

import java.util.HashMap;

import net.minecraftforge.common.ForgeConfigSpec;

public class Chance {
    public static HashMap<String, ForgeConfigSpec.IntValue> values = new HashMap<String, ForgeConfigSpec.IntValue>();
    static ForgeConfigSpec.Builder config;

    public static void Init(ForgeConfigSpec.Builder configIn) {
        config = configIn;
    }

    public static void addRange(String key, int defaultValue, int min, int max, String comment) {
        values.put(key, config.comment(comment).defineInRange(key, defaultValue, min, max));
    }
}