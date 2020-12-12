package com.conlib.item;

import com.conlib.registry.ModRegister;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;

public class Main {
    public static Item create(String name, ItemGroup group, Properties properties) {
        Item item = ModRegister.registerItem(name, properties, group);

        return item;
    }
}