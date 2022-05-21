package net.romeosnowblitz.hmh2.renderer;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.BoatEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BoatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Quaternion;
import net.minecraft.util.math.Vec3f;

import java.util.Map;
import java.util.stream.Stream;

public class ModBoatRenderer extends BoatEntityRenderer {

    private final Map<BoatEntity.Type, Pair<Identifier, BoatEntityModel>> texturesAndModels;
    public ModBoatRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.shadowRadius = 0.8f;
        this.texturesAndModels = Stream.of(BoatEntity.Type.values()).collect(ImmutableMap.toImmutableMap(type -> type, boatType -> Pair.of(new Identifier("textures/entity/boat/" + boatType.getName() + ".png"), new BoatEntityModel(context.getPart(EntityModelLayers.createBoat(boatType))))));
    }

    @Override
    public void render(BoatEntity boatEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        float k;
        matrixStack.push();
        matrixStack.translate(0.0, 0.375, 0.0);
        matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180.0f - f));
        float h = (float)boatEntity.getDamageWobbleTicks() - g;
        float j = boatEntity.getDamageWobbleStrength() - g;
        if (j < 0.0f) {
            j = 0.0f;
        }
        if (h > 0.0f) {
            matrixStack.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(MathHelper.sin(h) * h * j / 10.0f * (float)boatEntity.getDamageWobbleSide()));
        }
        if (!MathHelper.approximatelyEquals(k = boatEntity.interpolateBubbleWobble(g), 0.0f)) {
            matrixStack.multiply(new Quaternion(new Vec3f(1.0f, 0.0f, 1.0f), boatEntity.interpolateBubbleWobble(g), true));
        }
        Pair<Identifier, BoatEntityModel> pair = this.texturesAndModels.get((Object)boatEntity.getBoatType());
        Identifier identifier = pair.getFirst();
        BoatEntityModel boatEntityModel = pair.getSecond();
        matrixStack.scale(-1.0f, -1.0f, 1.0f);
        matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(90.0f));
        boatEntityModel.setAngles(boatEntity, g, 0.0f, -0.1f, 0.0f, 0.0f);
        VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(boatEntityModel.getLayer(identifier));
        boatEntityModel.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 1.0f);
        if (!boatEntity.isSubmergedInWater()) {
            VertexConsumer vertexConsumer2 = vertexConsumerProvider.getBuffer(RenderLayer.getWaterMask());
            boatEntityModel.getWaterPatch().render(matrixStack, vertexConsumer2, i, OverlayTexture.DEFAULT_UV);
        }
        matrixStack.pop();
        super.render(boatEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(BoatEntity boatEntity) {
        return this.texturesAndModels.get((Object)boatEntity.getBoatType()).getFirst();
    }
}
