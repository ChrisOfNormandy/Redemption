package com.github.chrisofnormandy.masonry;

import java.util.HashMap;

import com.github.chrisofnormandy.conlib.config.Config;

public class Mod_Config {
    public HashMap<String, Config> configs = new HashMap<String, Config>();

    void mainConfig(Config config) {
        config.Build();
        configs.put(Main.MOD_ID, config);
    }

    public void Init() {
        Config config = new Config(Main.MOD_ID);

        mainConfig(config);
    }
}
