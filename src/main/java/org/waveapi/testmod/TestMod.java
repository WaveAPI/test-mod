package org.waveapi.testmod;

import org.waveapi.api.Logger;
import org.waveapi.api.WaveMod;

public class TestMod extends WaveMod {

    private static TestMod instance;
    public static Logger log;

    public TestMod() {
        super("test", "1.0");

        instance = this;
    }

    public static WaveMod getInstance() {
        return instance;
    }

    @Override
    public void init() {
        log = new Logger(this);

        log.log("Init!");

        new TestItem();
    }
}
