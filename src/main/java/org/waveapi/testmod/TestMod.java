package org.waveapi.testmod;

import org.waveapi.api.Logger;
import org.waveapi.api.WaveMod;
import org.waveapi.api.content.entities.WaveEntityType;
import org.waveapi.api.world.entity.EntityBase;

public class TestMod extends WaveMod {

    public static WaveEntityType<? extends EntityBase> entityType;
    private static TestMod instance;
    public static Logger log;

    public TestMod() {
        super("test", "1.0");

        instance = this;
    }

    public static WaveMod getInstance() {
        return instance;
    }

    public static TestItem item;

    @Override
    public void init() {
        log = new Logger(this);

        log.log("Init!");

        new TestTab();

        item = new TestItem();

        entityType = new TestEntityType();
    }
}
