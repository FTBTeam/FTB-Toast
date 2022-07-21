package dev.ftb.ftbtoasts.mixin;

import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.client.tutorial.TutorialStepInstance;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Tutorial.class)
public abstract class TutorialMixin {
    @Shadow @Nullable private TutorialStepInstance instance;

    @Shadow public abstract void stop();

    @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start(CallbackInfo info) {
        if (this.instance != null) {
            this.stop();
        }

        info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick(CallbackInfo info) {
        info.cancel();
    }
}
