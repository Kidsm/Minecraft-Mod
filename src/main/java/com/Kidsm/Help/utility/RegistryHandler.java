package com.Kidsm.Help.utility;

import com.Kidsm.Help.Blocks.RotemBlock;
import com.Kidsm.Help.Blocks.blockItemBase;
import com.Kidsm.Help.Help;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, Help.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, Help.MOD_ID);
    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Blocks
    public static final RegistryObject<Block> ROTEM_BLOCK = BLOCKS.register("rotem_block", RotemBlock::new);

    // Block Item
    public static final RegistryObject<Item> ROTEM_BLOCK_ITEM = ITEMS.register("rotem_block", () -> new blockItemBase(ROTEM_BLOCK.get()));
}
