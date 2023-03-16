package org.waveapi.testmod;

import org.waveapi.api.content.entities.WaveEntityType;
import org.waveapi.api.content.entities.renderer.WaveEntityRenderer;
import org.waveapi.api.content.entities.renderer.WaveItemBasedEntityRenderer;

public class TestEntityType extends WaveEntityType<TestEntity> {
    public TestEntityType() {
        super("test_entity", TestEntity.class, TestMod.getInstance());
    }

    @Override
    public WaveEntityRenderer getEntityRenderer() {
        return new WaveItemBasedEntityRenderer();
    }
}
