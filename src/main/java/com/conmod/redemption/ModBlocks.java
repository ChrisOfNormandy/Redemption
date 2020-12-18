package com.conmod.redemption;

import com.conlib.block.Main;
import com.conlib.block.OreBase;
import com.conlib.itemgroup.Groups;
import com.conlib.registry.ModRegister;

public class ModBlocks {
    public static void Init() {
        Groups itemGroup = ModRegister.itemGroup("redemption_blocks", "testblock");

        Main.registerRockSuite("testblock", 1, itemGroup);
        ModRegister.registerOre("testore", new OreBase(1, 4, 2), itemGroup);
    }
}
