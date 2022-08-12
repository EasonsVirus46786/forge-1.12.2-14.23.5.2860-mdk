package com.virus.testmod.item;

import com.virus.testmod.TestMod;
import com.virus.testmod.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.common.IPlantable;

/**
 * @author Virus46786
 */
public class ItemCornSeed extends ItemSeeds implements IPlantable {
    public ItemCornSeed() {
        super(ModBlocks.cropCorn, Blocks.FARMLAND);
        setUnlocalizedName("corn_seed");
        setRegistryName("corn_seed");
    }

    public void registerItemModel(Item item) {
        TestMod.proxy.registerItemRenderer(item, 0, "corn_seed");
    }
}
