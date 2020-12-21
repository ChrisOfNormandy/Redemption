package com.conmod.redemption;

import com.conlib.config.Config;

public class Mod_Config {
    public static void Init() {
        Config.addRange("test_value", 0, 1, 1, "Comment string.");
        
        Config.addRange("nodes_drops_crude_amount", 1, 64, 2, "Maximum amount of items a crude node will give the player per tier.");
        Config.addRange("nodes_drops_normal_amount", 1, 64, 4, "Maximum amount of items a normal node will give the player per tier.");
        Config.addRange("nodes_drops_rich_amount", 1, 64, 8, "Maximum amount of items a rich node will give the player per tier.");

        Config.addRange("nodes_crude_tiers", 1, 16, 2, "How many times a crude node can be mined before breaking.");
        Config.addRange("nodes_normal_tiers", 1, 16, 3, "How many times a normal node can be mined before breaking.");
        Config.addRange("nodes_rich_tiers", 1, 16, 4, "How many times a rich node can be mined before breaking.");
    }
}
