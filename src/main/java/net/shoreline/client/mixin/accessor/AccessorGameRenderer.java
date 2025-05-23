package net.shoreline.client.mixin.accessor;

import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(GameRenderer.class)
public interface AccessorGameRenderer
{

    @Invoker("renderHand")
    void hookRenderHand(Camera camera, float tickDelta, Matrix4f matrix4f);
}
