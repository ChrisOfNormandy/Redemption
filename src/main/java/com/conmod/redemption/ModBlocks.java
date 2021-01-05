package com.conmod.redemption;

import com.conlib.block.Main;
import com.conlib.block.OreBase;
import com.conlib.block.Node.Tier;
import com.conlib.itemgroup.Groups;
import com.conlib.registry.ModRegister;

import net.minecraft.block.Block;

public class ModBlocks {
    public static void Init() {
        Block parent = Main.create_rock(1);
        Groups blocks = ModRegister.itemGroup("redemption_blocks", ModRegister.registerBlock("icon_block", parent));
        Groups slabs = ModRegister.itemGroup("redemption_slabs", ModRegister.registerBlock("icon_slab", Main.create_slab(parent)));
        Groups stairs = ModRegister.itemGroup("redemption_stairs", ModRegister.registerBlock("icon_stairs", Main.create_stairs(parent)));
        Groups walls = ModRegister.itemGroup("redemption_walls", ModRegister.registerBlock("icon_wall", Main.create_wall(parent)));
        Groups[] groups = new Groups[] {blocks, slabs, stairs, walls};

        Main.registerRockSuite("concrete", 2, groups);
        Main.registerRockSuite("concrete_bricks", 2, groups);
        Main.registerRockSuite("concrete_large_tile", 2, groups);

        Main.registerRockSuite("cracked_concrete", 2, groups);
        Main.registerRockSuite("cracked_concrete_bricks", 2, groups);
        Main.registerRockSuite("cracked_concrete_large_tile", 2, groups);

        Main.registerRockSuite("mossy_concrete", 2, groups);
        Main.registerRockSuite("mossy_concrete_bricks", 2, groups);
        Main.registerRockSuite("mossy_concrete_large_tile", 2, groups);

        Main.registerRockSuite("polished_concrete", 2, groups);
        Main.registerRockSuite("polished_concrete_bricks", 2, groups);
        Main.registerRockSuite("polished_concrete_large_tile", 2, groups);

        Main.registerRockSuite("red_bricks", 2, groups);
        Main.registerRockSuite("red_bricks_mixed", 2, groups);
        Main.registerRockSuite("red_large_bricks", 2, groups);
        Main.registerRockSuite("red_bricks_large_tile", 2, groups);

        Main.registerRockSuite("cream_bricks", 2, groups);
        Main.registerRockSuite("cream_bricks_mixed", 2, groups);
        Main.registerRockSuite("cream_large_bricks", 2, groups);
        Main.registerRockSuite("cream_bricks_large_tile", 2, groups);

        Main.registerRockSuite("pink_bricks", 2, groups);
        Main.registerRockSuite("pink_bricks_mixed", 2, groups);
        Main.registerRockSuite("pink_large_bricks", 2, groups);
        Main.registerRockSuite("pink_bricks_large_tile", 2, groups);

        Main.registerRockSuite("grey_bricks", 2, groups);
        Main.registerRockSuite("grey_bricks_mixed", 2, groups);
        Main.registerRockSuite("grey_large_bricks", 2, groups);
        Main.registerRockSuite("grey_bricks_large_tile", 2, groups);
    }
}