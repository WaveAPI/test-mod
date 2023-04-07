package org.waveapi.testmod.armour;

import org.waveapi.api.content.items.armour.ArmourSlot;
import org.waveapi.api.content.items.armour.WaveArmourItem;
import org.waveapi.api.content.items.models.SimpleItemModel;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class WeirdLeggings extends WaveArmourItem {
    public WeirdLeggings() {
        super("weird_leggings", TestMod.weird_armour, ArmourSlot.LEGGINGS, TestMod.getInstance());

        setModel(new SimpleItemModel("test/armour/pants.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Weird Leggings");
    }
}