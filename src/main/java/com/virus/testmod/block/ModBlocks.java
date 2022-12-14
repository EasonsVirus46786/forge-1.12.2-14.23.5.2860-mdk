package com.virus.testmod.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * @author Virus46786
 */
public class ModBlocks {

    public static BlockOre oreCopper = new BlockOre("ore_copper").setCreativeTab(CreativeTabs.MATERIALS);
    public static BlockCropCorn cropCorn = new BlockCropCorn();

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                cropCorn,
                oreCopper
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreCopper.createItemBlock()
        );
    }

    public static void registerModels() {
        oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
    }
}
