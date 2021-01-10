package com.github.chrisofnormandy.masonry;

import com.github.chrisofnormandy.conlib.block.Main;
import com.github.chrisofnormandy.conlib.block.subsets.Subsets;
import com.github.chrisofnormandy.conlib.itemgroup.GroupList;
import com.github.chrisofnormandy.conlib.itemgroup.Groups;
import com.github.chrisofnormandy.conlib.registry.ModRegister;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class ModBlocks {
    public static void Init() {
        Block parent = Main.Rock.create(1);

        GroupList groups = new GroupList(ModRegister.itemGroup("masonry_blocks", ModRegister.registerBlock("icon_block", parent)));
        groups.slabs = ModRegister.itemGroup("masonry_slabs", ModRegister.registerBlock("icon_slab", Subsets.create_slab(parent)));
        groups.stairs = ModRegister.itemGroup("masonry_stairs", ModRegister.registerBlock("icon_stairs", Subsets.create_stairs(parent)));
        groups.walls = ModRegister.itemGroup("masonry_walls", ModRegister.registerBlock("icon_wall", Subsets.create_wall(parent)));

        Main.Rock.registerSuiteWithVariants("concrete", 2, groups.getRock());
        Main.Rock.registerSuiteWithVariants("concrete_bricks", 2, groups.getRock());
        Main.Rock.registerSuiteWithVariants("concrete_large_tile", 2, groups.getRock());

        Main.Rock.registerSuiteWithVariants("polished_concrete", 2, groups.getRock());
        Main.Rock.registerSuiteWithVariants("polished_concrete_bricks", 2, groups.getRock());
        Main.Rock.registerSuiteWithVariants("polished_concrete_large_tile", 2, groups.getRock());

        for (int i = 0; i < Main.dyes.length; i++) {
            ModRegister.registerBlock(Main.dyes[i] + "_clay", new Block(Block.Properties.from(Blocks.CLAY)), groups.blocks);

            Main.Bricks.registerSuite(Main.dyes[i] + "_bricks", 2, groups.getRock());
            Main.Bricks.registerSuite(Main.dyes[i] + "_bricks_large", 2, groups.getRock());
            Main.Bricks.registerSuite(Main.dyes[i] + "_bricks_mixed", 2, groups.getRock());
            Main.Bricks.registerSuite(Main.dyes[i] + "_bricks_large_tile", 2, groups.getRock());
        }
    }
}