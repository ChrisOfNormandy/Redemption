package com.conlib.block;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.material.Material;

public class Main {
    public static Block create_rock(int harvestLevel) {
        return new Block(Properties.create(Material.ROCK).hardnessAndResistance(3.0f).sound(SoundType.STONE).harvestLevel(harvestLevel));
    }

    public static Block create_slab(Block parent) {
        return new SlabBlock(Properties.from(parent));
    }

    public static Block create_stairs(Block parent) {
        return new StairsBlock(() -> parent.getDefaultState(), Properties.from(parent));
    }

    public static Block create_wall(Block parent) {
        return new WallBlock(Properties.from(parent));
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
