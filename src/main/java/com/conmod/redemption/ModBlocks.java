package com.conmod.redemption;

import com.conlib.block.Main;
import com.conlib.block.OreBase;
import com.conlib.itemgroup.Groups;
import com.conlib.registry.ModRegister;

import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.material.Material;

public class ModBlocks {
    public static void Init() {
        Groups itemGroup = ModRegister.itemGroup("redemption_blocks", "testblock");

        ModRegister.registerBlock("testblock", Main.create_rock(1), itemGroup);
        ModRegister.registerOre("testore", new OreBase(Properties.create(Material.ROCK), 1, 4), itemGroup);
    }
}
