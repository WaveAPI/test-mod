package org.waveapi.testmod.tools;

import org.waveapi.api.content.items.models.SimpleToolModel;
import org.waveapi.api.content.items.tools.WaveAxeItem;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class WeirdAxe extends WaveAxeItem {
    public WeirdAxe() {
        super("weird_axe", TestMod.weird, TestMod.getInstance());

        setModel(new SimpleToolModel("test/tools/weird_axe.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Weird Axe");
    }
}
