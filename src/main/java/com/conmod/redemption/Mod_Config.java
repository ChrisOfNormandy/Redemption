package com.conmod.redemption;

import com.conlib.config.Chance;
import com.conlib.config.Enable;

public class Mod_Config {
    public static void Init() {
        Chance.addRange("test_range", 10, 0, 20, "Comment string.");
        Enable.addValue("test_flag", true, "Comment string.");
    }
}
