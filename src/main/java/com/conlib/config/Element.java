package com.conlib.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Element {
	public static ForgeConfigSpec.IntValue wild_mustard_cluster;
	public static ForgeConfigSpec.IntValue wild_mustard_radius;

	public static void init(ForgeConfigSpec.Builder config) {
		wild_mustard_cluster = config
			.comment("Amount of wild mustard to grop per cluster. Default = 2")
			.defineInRange("wildMustardSize", 2, 1, 16);

		wild_mustard_radius = config
			.comment("Radius of wild mustard clusters. Default = 2")
			.defineInRange("wildMustardRadius", 2, 1, 8);
	}
}