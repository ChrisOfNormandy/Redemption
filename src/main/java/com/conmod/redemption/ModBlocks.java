package com.conmod.redemption;

import com.conlib.block.Main;
import com.conlib.itemgroup.Groups;
import com.conlib.registry.ModRegister;

import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.material.Material;

public class ModBlocks {
    public static void Init() {
        Groups itemGroup = ModRegister.itemGroup("redemption_blocks", "testblock");

        Main.create_collectable("testblock", itemGroup, Properties.create(Material.ROCK));
    }
}
