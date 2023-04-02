package org.waveapi.testmod.tools;

import org.waveapi.api.content.items.models.SimpleToolModel;
import org.waveapi.api.content.items.tools.WaveSwordItem;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class WeirdSword extends WaveSwordItem {
    public WeirdSword() {
        super("weird_sword", TestMod.getInstance(), TestMod.weird);
        setAttackDamage(14);
        setAttackSpeed(-3.2f);

        setModel(new SimpleToolModel("test/weird_sword.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Weird Sword");
    }
}
