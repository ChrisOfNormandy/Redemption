package com.conmod.redemption;

import com.github.chrisofnormandy.conlib.block.Main;
import com.github.chrisofnormandy.conlib.block.OreBase;
import com.github.chrisofnormandy.conlib.block.Node.Tier;
import com.github.chrisofnormandy.conlib.itemgroup.Groups;
import com.github.chrisofnormandy.conlib.registry.ModRegister;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class ModBlocks {
    public static void Init() {
        Block parent = Main.create_rock(1);
        Groups blocks = ModRegister.itemGroup("redemption_blocks", ModRegister.registerBlock("icon_block", parent));
        Groups slabs = ModRegister.itemGroup("redemption_slabs", ModRegister.registerBlock("icon_slab", Main.create_slab(parent)));
        Groups stairs = ModRegister.itemGroup("redemption_stairs", ModRegister.registerBlock("icon_stairs", Main.create_stairs(parent)));
        Groups walls = ModRegister.itemGroup("redemption_walls", ModRegister.registerBlock("icon_wall", Main.create_wall(parent)));
        Groups[] groups = new Groups[] {blocks, slabs, stairs, walls};

        Main.registerRockSuite_withProducts("concrete", 2, groups, true);
        Main.registerRockSuite("concrete_large_tile", 2, groups);
        Main.registerRockSuite("cracked_concrete_large_tile", 2, groups);
        Main.registerRockSuite("mossy_concrete_large_tile", 2, groups);

        Main.registerRockSuite_withProducts("polished_concrete", 2, groups, true);
        Main.registerRockSuite("polished_concrete_large_tile", 2, groups);
        Main.registerRockSuite("cracked_polished_concrete_large_tile", 2, groups);
        Main.registerRockSuite("mossy_polished_concrete_large_tile", 2, groups);

        for (int i = 0; i < Main.dyes.length; i++) {
            Main.registerBrickSuite(Main.dyes[i], groups);
        }

        Main.registerDyedSuite("clay", Blocks.CLAY, blocks);
    }
}