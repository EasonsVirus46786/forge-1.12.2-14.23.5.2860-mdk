package com.virus.testmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
    public static ItemBase ingotCopper = new ItemBase("ingot_copper").setCreativeTab(CreativeTabs.MATERIALS);
    public static ItemCornSeed cornSeed = new ItemCornSeed();
    public static ItemBase corn = new ItemBase("corn").setCreativeTab(CreativeTabs.FOOD);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                corn,
                ingotCopper,
                cornSeed
        );
    }

    public static void registerModels() {
        ingotCopper.registerItemModel();
        corn.registerItemModel();
        cornSeed.registerItemModel(cornSeed);
    }
}
