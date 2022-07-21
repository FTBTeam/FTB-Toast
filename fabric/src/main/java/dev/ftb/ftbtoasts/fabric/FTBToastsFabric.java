package dev.ftb.ftbtoasts.fabric;

import dev.ftb.ftbtoasts.FTBToasts;
import net.fabricmc.api.ModInitializer;

public class FTBToastsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FTBToasts.init();
    }
}
