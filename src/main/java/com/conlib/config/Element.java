package com.conlib.config;

import java.util.HashMap;

import net.minecraftforge.common.ForgeConfigSpec;

public class Element {
	public static HashMap<String, ForgeConfigSpec.IntValue> values = new HashMap<String, ForgeConfigSpec.IntValue>();
	
	static ForgeConfigSpec.Builder config;

	public static void Init(ForgeConfigSpec.Builder configIn) {
		config = configIn;
	}
}