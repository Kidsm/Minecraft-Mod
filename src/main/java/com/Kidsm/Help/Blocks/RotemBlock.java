package com.Kidsm.Help.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RotemBlock extends Block {

    public RotemBlock() {
        super(Block.Properties.create(Material.IRON)
            .hardnessAndResistance(5.0F, 6.0F)
                //.sound(SoundType.METAL)
                .harvestLevel(2) // Can only be mined by using an iron pickaxe or better
                .harvestTool(ToolType.PICKAXE));
    }
}
