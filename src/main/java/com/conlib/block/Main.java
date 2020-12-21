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
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTableManager;

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



    public static Node create_node(Block parent, Node.Tier tier, int damage) {
        return new Node(Properties.from(parent), tier, damage, parent.asItem());
    }

    public static void registerNode(String name, Block parent, Node.Tier tier, ItemGroup group) {
        int crude = 3;
        int normal = 4;
        int rich = 5;

        int count = 0;

        switch (tier) {
            case CRUDE: {
                count = crude;
                break;
            }
            case NORMAL: {
                count = normal;
                break;
            }
            case RICH: {
                count = rich;
                break;
            }
        }

        Node n = create_node(parent, tier, count);

        Block node = ModRegister.registerBlock(name, n, group);
        ModRegister.nodes.put(node.getRegistryName().toString(), n);

        Block old_ = node;
        Block new_ = null;

        for (int i = count - 1; i >= 0; i--) {
            new_ = (i > 0)
                ? ModRegister.registerBlock(name + "_" + i, create_node(parent, tier, i))
                : parent;

            old_ = ModRegister.setBlock_replaceable(old_, new_);

            ModRegister.registerNode(new_.getRegistryName().toString(), n);
        }
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
