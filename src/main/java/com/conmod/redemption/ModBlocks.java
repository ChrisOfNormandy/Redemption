package com.conmod.redemption;

import com.conlib.block.Main;
import com.conlib.block.OreBase;
import com.conlib.block.Node.Tier;
import com.conlib.itemgroup.Groups;
import com.conlib.registry.ModRegister;

import net.minecraft.block.Block;

public class ModBlocks {
    public static void Init() {
        Groups itemGroup = ModRegister.itemGroup("redemption_blocks", "testblock");

        Main.registerRockSuite("testblock", 1, itemGroup);
        Main.registerWoodSuite("testwood", itemGroup);

        Main.registerNode("testnode", ModRegister.registerBlock("nodedrop", Main.create_rock(2), itemGroup), Tier.NORMAL, itemGroup);

        ModRegister.registerOre("testore", new OreBase(1, 4, 2), itemGroup);
    }
}
