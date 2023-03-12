package org.waveapi.testmod;

import org.waveapi.api.content.items.WaveTab;

public class TestTab extends WaveTab {

    private static TestTab instance;
    public TestTab() {
        super("tab", "logo.png", TestMod.getInstance());
        instance = this;
        addTranslation("en_us", "Test Tab");
    }

    public static TestTab getInstance() {
        return instance;
    }
}
