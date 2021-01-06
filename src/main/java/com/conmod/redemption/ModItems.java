package com.conmod.redemption;

import com.conlib.item.Main;
import com.conlib.itemgroup.Groups;
import com.conlib.registry.ModRegister;

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
