package net.romeosnowblitz.hmh2.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;

public class ModFluidBlock extends FluidBlock {
    public ModFluidBlock(FlowableFluid fluid, AbstractBlock.Settings settings) {
        super(fluid, settings);
    }
}