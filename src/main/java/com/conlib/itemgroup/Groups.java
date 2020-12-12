package com.conlib.itemgroup;

import com.google.common.base.Supplier;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import com.conlib.registry.ModRegister;

public class Groups extends ItemGroup {
    private Supplier<ItemStack> displayStack;

    private Groups(String label, Supplier<ItemStack> icon) {
        super(label);
        this.displayStack = icon;
    }

    public static final Groups createGroup(String name, String icon_itemName) {
        return new Groups("blocks", () -> new ItemStack(ModRegister.items.get(icon_itemName)));
    }

    @Override
    public ItemStack createIcon() {
        return displayStack.get();
    }
}