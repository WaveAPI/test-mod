package org.waveapi.testmod.armour;

import org.waveapi.api.content.items.armour.ArmourSlot;
import org.waveapi.api.content.items.armour.WaveArmourItem;
import org.waveapi.api.content.items.models.SimpleItemModel;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class WeirdBoots extends WaveArmourItem {
    public WeirdBoots() {
        super("weird_boots", TestMod.weird_armour, ArmourSlot.BOOTS, TestMod.getInstance());

        setModel(new SimpleItemModel("test/armour/boots.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Weird Boots");
    }
}