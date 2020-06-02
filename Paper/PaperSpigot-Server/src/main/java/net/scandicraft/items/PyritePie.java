package net.scandicraft.items;

import net.minecraft.server.*;
import net.scandicraft.utils.MathUtils;

public class PyritePie extends ItemFood {
    public PyritePie(int amount, float saturation) {
        super(amount, saturation, false);
    }

    @Override
    protected void c(ItemStack stack, World worldIn, EntityHuman player) {  //c = onFoodEaten
        if (!worldIn.isClientSide) {
            //20 ticks = 1 seconde
            player.addPotionEffect(new MobEffect(MobEffectList.INCREASE_DAMAGE.id, MathUtils.convertMinutesToTicks(3))); //force I: 3mn
            player.addPotionEffect(new MobEffect(MobEffectList.FASTER_MOVEMENT.id, MathUtils.convertMinutesToTicks(3), 1)); //speed II: 3mn
            player.addPotionEffect(new MobEffect(MobEffectList.FIRE_RESISTANCE.id, MathUtils.convertMinutesToTicks(2)));   //fire resist I: 2mn
            player.addPotionEffect(new MobEffect(MobEffectList.REGENERATION.id, MathUtils.convertSecondsToTicks(30)));   //regene I: 30s
        } else {
            super.c(stack, worldIn, player);
        }
    }
}
