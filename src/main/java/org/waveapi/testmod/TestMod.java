package org.waveapi.testmod;

import org.waveapi.api.Logger;
import org.waveapi.api.WaveMod;
import org.waveapi.api.content.entities.WaveEntityType;
import org.waveapi.api.content.items.WaveItem;
import org.waveapi.api.content.items.recipes.ingredients.SimpleItemIngredient;
import org.waveapi.api.content.items.tools.WaveToolMaterial;
import org.waveapi.api.events.EventHandler;
import org.waveapi.api.events.Events;
import org.waveapi.api.events.event.message.ClientChatMessageEvent;
import org.waveapi.api.math.BlockPos;
import org.waveapi.api.misc.ClientOnly;
import org.waveapi.api.world.entity.EntityBase;
import org.waveapi.api.world.entity.living.EntityPlayer;
import org.waveapi.testmod.itemsblocks.AnotherTestItem;
import org.waveapi.testmod.itemsblocks.TestBlock;
import org.waveapi.testmod.itemsblocks.TestBlock2;
import org.waveapi.testmod.itemsblocks.TestItem;
import org.waveapi.testmod.tools.WeirdPickaxe;
import org.waveapi.testmod.tools.WeirdSword;

public class TestMod extends WaveMod {

    public static WaveEntityType<? extends EntityBase> entityType;
    public static WaveItem another_item;
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

    public static WaveToolMaterial weird;

    @Override
    public void init() {
        log = new Logger(this);

        log.log("Init!");

        new TestTab();

        item = new TestItem();
        another_item = new AnotherTestItem();

        entityType = new TestEntityType();

        weird = new WaveToolMaterial()
                .setAttackDamage(1)
                .setBaseDurability(500)
                .setMiningLevel(1)
                .setMiningSpeedMultiplier(1000f)
                .setRepairIngredient(new SimpleItemIngredient(TestMod.another_item));

        new TestBlock();
        new TestBlock2();

        new WeirdSword();
        new WeirdPickaxe();
    }

    @Override
    public void registerClientEvents(Events register) {
        register.register(this);
    }

    @EventHandler(priority = 1)
    public void onMessage(ClientChatMessageEvent e) {
        if (e.getText().getText().endsWith("Up, you go!")) {
            log.log("You have been boosted");
            EntityPlayer player = ClientOnly.getPlayer();
            player.setVelocity(player.getVelocity().addY(1.0));

            BlockPos pos = player.getBlockLookingAt(10000);
        }
    }
}
