package com.conlib.config;

import java.util.HashMap;

import net.minecraftforge.common.ForgeConfigSpec;

public class Enable {
    public static HashMap<String, ForgeConfigSpec.ConfigValue<Boolean>> values = new HashMap<String, ForgeConfigSpec.ConfigValue<Boolean>>();

    static ForgeConfigSpec.Builder config;

    public static void addValue(String key, Boolean defaultValue, String comment) {
        values.put(key, config.comment(comment).define(key, defaultValue));
    }

	public static void Init(ForgeConfigSpec.Builder configIn) {
		config = configIn;
	}
}