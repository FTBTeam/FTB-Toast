package dev.ftb.ftbtoasts.forge;

import dev.ftb.ftbtoasts.FTBToasts;
import net.minecraftforge.fml.common.Mod;

@Mod(FTBToasts.MOD_ID)
public class FTBToastsForge {
    public FTBToastsForge() {
        FTBToasts.init();
    }
}
