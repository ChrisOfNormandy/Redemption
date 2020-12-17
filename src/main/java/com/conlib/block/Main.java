package com.conlib.block;
import com.conlib.registry.ModRegister;

import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.item.ItemGroup;

public class Main {
    public static Block create_collectable(String name, ItemGroup group, Properties properties) {
        Block block = ModRegister.registerBlock(new Block(properties), name, group);

        return block;
    }

    public static Block create_uncollectable(String name, ItemGroup group, Properties properties) {
        Block block = ModRegister.registerBlock(new Block(properties), name);

        return block;
    }

    // public static Block create_ore_gem(String name, int minXp, int maxXp, ItemGroup group, Properties properties) {
    //     Block block = ModRegister.registerOre(name, minXp, maxXp, properties, "gem", group);

    //     return block;
    // }

    // public static Block create_ore_resource() {

    // }

    // public static Block create_ore_fuel() {

    // }
}
