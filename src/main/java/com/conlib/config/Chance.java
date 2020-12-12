package com.conlib.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Chance {
    public static ForgeConfigSpec.IntValue wild_mustard_chance;

    public static void init(ForgeConfigSpec.Builder config) {

        wild_mustard_chance = config
                .comment("Chance of wild mustard generating in the world. Value is 1 in X chance. Default = 100.")
                .defineInRange("wildMustardGenChance", 100, 1, 1000000000);
    }
}