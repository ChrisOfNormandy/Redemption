package com.conlib.block;

import com.conlib.registry.ModRegister;

import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;

public class Main {
    public static Block create_rock(int harvestLevel) {
        return new Block(Properties.create(Material.ROCK).hardnessAndResistance(3.0f).sound(SoundType.STONE).harvestLevel(harvestLevel));
    }

    public static Block create_wood() {
        return new Block(Properties.create(Material.WOOD).hardnessAndResistance(2.0f).sound(SoundType.WOOD));
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

    public static Block create_fence(Block parent) {
        return new FenceBlock(Properties.from(parent));
    }

    public static void registerRockSuite(String name, int harvestLevel, ItemGroup group) {
        Block block = create_rock(harvestLevel);

        ModRegister.registerBlock(name, block, group);
        ModRegister.registerBlock(name + "_slab", create_slab(block), group);
        ModRegister.registerBlock(name + "_stairs", create_stairs(block), group);
        ModRegister.registerBlock(name + "_wall", create_wall(block), group);
    }

    public static void registerWoodSuite(String name, ItemGroup group) {
        Block log = create_wood();
        Block planks = create_wood();

        ModRegister.registerBlock(name + "_wood", log, group);

        ModRegister.registerBlock(name + "_planks", planks);
        ModRegister.registerBlock(name + "_slab", create_slab(planks), group);
        ModRegister.registerBlock(name + "_stairs", create_stairs(planks), group);
        ModRegister.registerBlock(name + "_fence", create_fence(planks), group);
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
