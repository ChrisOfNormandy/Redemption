package com.github.chrisofnormandy.redemption;

import com.github.chrisofnormandy.conlib.item.Main;
import com.github.chrisofnormandy.conlib.itemgroup.Groups;
import com.github.chrisofnormandy.conlib.registry.ModRegister;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;

public class ModItems {
    public static void Init() {
        Item icon = Main.create("items_icon", new Properties());
        Groups itemGroup = ModRegister.itemGroup("redemption_items", icon);

        Main.registerDyedSuite("clay_ball", new Properties(), itemGroup);
        Main.registerDyedSuite("brick", new Properties(), itemGroup);
    }
}
