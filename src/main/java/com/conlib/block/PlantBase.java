// package com.conlib.block;

// import net.minecraft.util.math.BlockPos;
// import net.minecraft.world.IBlockReader;
// import net.minecraft.block.BushBlock;
// import net.minecraft.block.AbstractBlock.Properties;
// import net.minecraft.block.AbstractBlock;
// import net.minecraftforge.common.PlantType;

// public class PlantBase extends BushBlock {
//     private PlantType plantType;

//     public PlantBase(Properties properties, String name, PlantType plantType) {
//         super(properties);
//         this.plantType = plantType;
//     }

//     public PlantType getPlantType(IBlockReader world, BlockPos pos) {
//         return this.plantType;
//     }
// }