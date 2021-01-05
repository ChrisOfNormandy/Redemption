package com.conmod.redemption;

import com.conlib.block.Main;
import com.conlib.block.OreBase;
import com.conlib.block.Node.Tier;
import com.conlib.itemgroup.Groups;
import com.conlib.registry.ModRegister;

import net.minecraft.block.Block;

public class ModBlocks {
    public static void Init() {
        Groups itemGroup = ModRegister.itemGroup("redemption_blocks", "concrete");

        /*
        Main.registerRockSuite("testblock", 1, itemGroup);
        Main.registerWoodSuite("testwood", itemGroup);

        Block nodedrop = ModRegister.registerBlock("nodedrop", Main.create_rock(2), itemGroup);

        Main.registerNode("crudetestnode", nodedrop, Tier.CRUDE, itemGroup);
        Main.registerNode("normaltestnode", nodedrop, Tier.NORMAL, itemGroup);
        Main.registerNode("richtestnode", nodedrop, Tier.RICH, itemGroup);

        ModRegister.registerOre("testore", new OreBase(1, 4, 2), itemGroup);
        */

        Main.registerRockSuite("concrete_bricks", 2, itemGroup);
        Main.registerRockSuite("concrete_large_tile", 2, itemGroup);
        Main.registerRockSuite("concrete", 2, itemGroup);
        Main.registerRockSuite("cracked_concrete_bricks", 2, itemGroup);
        Main.registerRockSuite("cracked_concrete_large_tile", 2, itemGroup);
        Main.registerRockSuite("cracked_concrete", 2, itemGroup);
        Main.registerRockSuite("mossy_concrete_bricks", 2, itemGroup);
        Main.registerRockSuite("mossy_concrete_large_tile", 2, itemGroup);
        Main.registerRockSuite("mossy_concrete", 2, itemGroup);
        Main.registerRockSuite("polished_concrete", 2, itemGroup);
    }
}