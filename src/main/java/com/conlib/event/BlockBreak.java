package com.conlib.event;

import com.conlib.registry.ModRegister;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class BlockBreak {
    private static Logger LOG = LogManager.getLogger();

    @SubscribeEvent
    public static void cancelBlockBreak(final BlockEvent.BreakEvent event) {
        Block blockIn = event.getState().getBlock();

        if (ModRegister.blocks_unbreakable.containsKey(blockIn.getRegistryName().toString()))
            event.setCanceled(true);
    }

    @SubscribeEvent
    public static void replaceBlock(final BlockEvent.BreakEvent event) {
        Block blockIn = event.getState().getBlock();

        if (ModRegister.blocks_replaceable.containsKey(blockIn.getRegistryName().toString())) {
            event.setCanceled(true);

            event.getWorld().setBlockState(event.getPos(), ModRegister.blocks_replaceable.get(blockIn.getRegistryName().toString()).getDefaultState(), 1);

            LOG.info("Replacing block with: " + ModRegister.blocks_replaceable.get(blockIn.getRegistryName().toString()).getRegistryName().toString());
            LOG.info("Giving: " + ModRegister.nodes.get(blockIn.getRegistryName().toString()).getDrop().getDisplayName().getString());

            event.getPlayer().addItemStackToInventory(ModRegister.nodes.get(blockIn.getRegistryName().toString()).getDrop());
        }
    }
}
