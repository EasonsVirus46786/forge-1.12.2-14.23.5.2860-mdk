package com.virus.testmod.block;

import com.virus.testmod.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * @author Virus46786
 */
public class BlockCropCorn extends BlockCrops {
    public BlockCropCorn() {
        setUnlocalizedName("crop_corn");
        setRegistryName("crop_corn");
    }

    @Override
    protected Item getSeed() {
        return ModItems.cornSeed;
    }

    @Override
    protected Item getCrop() {
        return ModItems.corn;
    }
}
