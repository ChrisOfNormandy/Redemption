package com.conlib.registry;

import java.util.HashMap;

import com.conlib.itemgroup.Groups;
// import com.conlib.block.PlantBase;
import com.conlib.tool.CraftingTool;
import com.conmod.redemption.Main;

import net.minecraft.block.Block;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
// import net.minecraftforge.common.PlantType;
import net.minecraftforge.registries.ForgeRegistries;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModRegister {
    public ModRegister() {

    }

    public static final Logger LOG = LogManager.getLogger();

    // ITEM GROUPS
    public static HashMap<String, ItemGroup> groups = new HashMap<String, ItemGroup>();

    public static Groups itemGroup(String name, String icon_itemName) {
        Groups group = Groups.createGroup(name, icon_itemName);
        groups.put(name, group);
        return group;
    }

    // BLOCK TYPES
    public static Block rock(int harvestLevel) {
        return new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f).sound(SoundType.STONE).harvestLevel(harvestLevel));
    }

    public static Block slab(Block parent) {
        return new SlabBlock(Block.Properties.from(parent));
    }

    public static Block stairs(Block parent) {
        return new StairsBlock(() -> parent.getDefaultState(), Block.Properties.from(parent));
    }

    public static Block wall(Block parent) {
        return new WallBlock(Block.Properties.from(parent));
    }    

    public static Block registerCrop(CropsBlock crop, String name) {
        return registerBlock(crop, name);
    }

    // public static Block registerPlant(String name, PlantType plantType, ItemGroup group) {
    //     Block.Properties properties = Block.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(0.0F).doesNotBlockMovement();
    //     return registerBlock(new PlantBase(properties, name, plantType), name, group);
    // }


    // BLOCKS
    public static HashMap<String, Block> blocks = new HashMap<String, Block>();

    /**
     * Registers new Block and new ItemBlock.
     * @param block
     * @param name
     * @param group
     * @return
     */
    public static Block registerBlock(Block block, String name, ItemGroup group)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(group));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        blocks.put(name, block);
        LOG.info("Registered new block: " + block.getRegistryName());
        return block;
    }

    /**
     * Registers new Block without an ItemBlock.
     * @param block
     * @param name
     * @return
     */
    public static Block registerBlock(Block block, String name)
    {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        blocks.put(name, block);
        return block;
    }
    

    // ITEMS
    public static HashMap<String, Item> items = new HashMap<String, Item>();

    public static Item registerItem(String name, Properties properties, ItemGroup group) {
        Item item = new Item(properties.group(group)).setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        items.put(name, item);
        return item;
    }

    public static <T extends Item> T registerItem(String name, T item) {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        items.put(name, item);
        return item;
    }


    // TOOLS
    public static HashMap<String, Item> tools = new HashMap<String, Item>();

    public static Item registerCraftingTool(String name, Properties properties, ItemGroup group) {
        CraftingTool item = new CraftingTool(properties.group(group));
        tools.put(name, item);
        return registerItem(name, item);
    }


    // FOODS
    public static Food registerFoodNoItem(int hunger, float saturation) {
        return (new Food.Builder()).saturation(saturation).hunger(hunger).build();
    }

    public static Item registerFood(String name, int hunger, float saturation, ItemGroup group) {
        Food food = (new Food.Builder()).saturation(saturation).hunger(hunger).build();
        return registerItem(name, new Item.Properties().food(food), group);
    }

    public static Item registerFood(String name, Food food, ItemGroup group) {
        return registerItem(name, new Item.Properties().food(food), group);
    }

    // WORLD GEN
    public static HashMap<String, Feature<?>> generators = new HashMap<String, Feature<?>>();

    public static Feature<NoFeatureConfig> registerPlantGen(String name, Feature<NoFeatureConfig> feature) {
        Main.LOG.info("Registered Plant Gen: " + name);
        return registerGenFeature(name, feature);
    }

    public static Feature<NoFeatureConfig> registerGenFeature(String name, Feature<NoFeatureConfig> entry) {
        entry.setRegistryName(new ResourceLocation(Main.MOD_ID, name));
        ForgeRegistries.FEATURES.register(entry);
        generators.put(name, entry);
        return entry;
    }



}