package org.waveapi.testmod;

import org.waveapi.api.content.entities.WaveEntityType;
import org.waveapi.api.content.entities.renderer.WaveEntityRenderer;

public class TestEntityType extends WaveEntityType<TestEntity> {
    public TestEntityType() {
        super("test_entity", TestEntity.class, new WaveEntityRenderer(), TestMod.getInstance());
    }
}
