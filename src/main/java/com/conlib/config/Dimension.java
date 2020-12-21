package com.conlib.config;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import net.minecraftforge.common.ForgeConfigSpec;

public class Dimension {
    public static HashMap<String, ForgeConfigSpec.ConfigValue<List<? extends Integer>>> whitelists = new HashMap<String, ForgeConfigSpec.ConfigValue<List<? extends Integer>>>();
    public static HashMap<String, ForgeConfigSpec.ConfigValue<List<? extends Integer>>> blacklists = new HashMap<String, ForgeConfigSpec.ConfigValue<List<? extends Integer>>>();

    static ForgeConfigSpec.Builder config;

    public static void Init(ForgeConfigSpec.Builder configIn) {
        config = configIn;
    }

    public static void addWhitelist(String key, List<Integer> defaultValue, String comment) {
        ForgeConfigSpec.ConfigValue<List<? extends Integer>> whitelist = config.comment(comment).defineList(key, defaultValue,
        new Predicate<Object>() {
            @Override
            public boolean apply(@Nullable Object val) {
                return val instanceof Integer && val != null;
            }
        });

        whitelists.put(key, whitelist);
    }

    public static void addBlacklist(String key, List<Integer> defaultValue, String comment) {
        ForgeConfigSpec.ConfigValue<List<? extends Integer>> blacklist = config.comment(comment).defineList(key, defaultValue,
        new Predicate<Object>() {
            @Override
            public boolean apply(@Nullable Object val) {
                return val instanceof Integer && val != null;
            }
        });

        blacklists.put(key, blacklist);
    }

    public static void init(ForgeConfigSpec.Builder configIn) {
        config = configIn;
    }
}