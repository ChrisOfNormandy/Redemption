package com.github.chrisofnormandy.masonry;

import com.github.chrisofnormandy.conlib.block.ModBlock;
import com.github.chrisofnormandy.conlib.block.subsets.Subsets;
import com.github.chrisofnormandy.conlib.itemgroup.GroupList;
import com.github.chrisofnormandy.conlib.registry.ModRegister;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class ModBlocks {
    public static void Init() {
        Block parent = ModBlock.Stone.create(1);

        GroupList groups = new GroupList(ModRegister.itemGroup("masonry_blocks", ModRegister.registerBlock("icon_block", parent)));
        groups.slabs = ModRegister.itemGroup("masonry_slabs", ModRegister.registerBlock("icon_slab", Subsets.create_slab(parent)));
        groups.stairs = ModRegister.itemGroup("masonry_stairs", ModRegister.registerBlock("icon_stairs", Subsets.create_stairs(parent)));
        groups.walls = ModRegister.itemGroup("masonry_walls", ModRegister.registerBlock("icon_wall", Subsets.create_wall(parent)));

        for (int i = 0; i < ModBlock.dyes.length; i++) {
            ModRegister.registerBlock(ModBlock.dyes[i] + "_clay", new Block(Block.Properties.copy(Blocks.CLAY)), groups.blocks);

            ModBlock.Bricks.registerSuite(ModBlock.dyes[i] + "_bricks", 2, groups.getRock());
            ModBlock.Bricks.registerSuite(ModBlock.dyes[i] + "_bricks_mixed", 2, groups.getRock());

            ModBlock.Bricks.registerSuite(ModBlock.dyes[i] + "_bricks_large", 2, groups.getRock());
            ModBlock.Bricks.registerSuite("cracked_" + ModBlock.dyes[i] + "_bricks_large", 2, groups.getRock());
            ModBlock.Bricks.registerSuite("mossy_" + ModBlock.dyes[i] + "_bricks_large", 2, groups.getRock());

            ModBlock.Bricks.registerSuite(ModBlock.dyes[i] + "_bricks_large_tile", 2, groups.getRock());
        }
    }
}