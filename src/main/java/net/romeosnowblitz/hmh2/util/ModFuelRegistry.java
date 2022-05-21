package net.romeosnowblitz.hmh2.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.impl.content.registry.FuelRegistryImpl;

public interface ModFuelRegistry extends FuelRegistry {
    FuelRegistry INSTANCE = new ModFuelRegistryImpl();
}
