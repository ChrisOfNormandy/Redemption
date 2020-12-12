package com.conmod.redemption;

import com.conlib.item.Main;
import com.conlib.itemgroup.Groups;
import com.conlib.registry.ModRegister;

import net.minecraft.item.Item.Properties;

public class ModItems {
    public static void Init() {
        Groups itemGroup = ModRegister.itemGroup("redemption_items", "testitem");

        Main.create("testitem", itemGroup, new Properties());
    }
}
