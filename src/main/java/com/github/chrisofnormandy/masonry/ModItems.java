package com.github.chrisofnormandy.masonry;

import com.github.chrisofnormandy.conlib.item.ModItem;
import com.github.chrisofnormandy.conlib.itemgroup.Groups;
import com.github.chrisofnormandy.conlib.registry.ModRegister;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;

public class ModItems {
    public static void Init() {
        Item icon = ModItem.create("items_icon", new Properties());
        Groups itemGroup = ModRegister.itemGroup("masonry_items", icon);

        ModItem.registerDyedSuite("clay_ball", new Properties(), itemGroup);
        ModItem.registerDyedSuite("brick", new Properties(), itemGroup);
    }
}
