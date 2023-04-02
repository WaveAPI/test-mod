package org.waveapi.testmod;

import org.waveapi.api.content.items.models.SimpleToolModel;
import org.waveapi.api.content.items.recipes.ingredients.SimpleItemIngredient;
import org.waveapi.api.content.items.tools.WaveSwordItem;
import org.waveapi.api.content.items.tools.WaveToolMaterial;

public class WeirdSword extends WaveSwordItem {
    public WeirdSword() {
        super("weird_sword", TestMod.getInstance(),
                new WaveToolMaterial()
                        .setAttackDamage(1)
                        .setBaseDurability(500)
                        .setMiningLevel(1)
                        .setRepairIngredient(new SimpleItemIngredient(TestMod.another_item)));
        setAttackDamage(14);
        setAttackSpeed(-3.2f);

        setModel(new SimpleToolModel("test/weird_sword.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Weird Sword");
    }
}
