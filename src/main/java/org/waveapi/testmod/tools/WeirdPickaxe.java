package org.waveapi.testmod.tools;

import org.waveapi.api.content.items.models.SimpleToolModel;
import org.waveapi.api.content.items.tools.WavePickaxeItem;
import org.waveapi.api.math.BlockPos;
import org.waveapi.api.world.entity.DamageSource;
import org.waveapi.api.world.entity.living.EntityLiving;
import org.waveapi.api.world.inventory.ItemStack;
import org.waveapi.api.world.world.BlockState;
import org.waveapi.api.world.world.World;
import org.waveapi.testmod.TestMod;
import org.waveapi.testmod.TestTab;

public class WeirdPickaxe extends WavePickaxeItem {
    public WeirdPickaxe() {
        super("weird_pickaxe", TestMod.weird, TestMod.getInstance());

        setModel(new SimpleToolModel("test/tools/weird_pickaxe.png"));
        setTab(TestTab.getInstance());

        addTranslation("en_us", "Weird Pickaxe");
    }

    @Override
    public boolean onPostMine(ItemStack itemStack, World world, BlockState blockState, BlockPos pos, EntityLiving entity) {

        entity.damage(DamageSource.GENERIC, 0.5f);

        return true;
    }
}
