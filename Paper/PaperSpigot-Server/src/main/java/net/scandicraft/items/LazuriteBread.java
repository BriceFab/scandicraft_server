package net.scandicraft.items;

import net.minecraft.server.*;
import net.scandicraft.utils.MathUtils;

public class LazuriteBread extends ItemFood {
    public LazuriteBread(int amount, float saturation) {
        super(amount, saturation, false);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityHuman player) {
        if (!worldIn.isClientSide) {
            int two_minutes = MathUtils.convertMinutesToTicks(2);
            player.addPotionEffect(new MobEffect(MobEffectList.FASTER_DIG.id, two_minutes)); //haste I: 2mn
            player.addPotionEffect(new MobEffect(MobEffectList.FIRE_RESISTANCE.id, two_minutes)); //fire resit I: 2mn
            player.addPotionEffect(new MobEffect(MobEffectList.FASTER_MOVEMENT.id, two_minutes)); //speed I: 2mn
            player.addPotionEffect(new MobEffect(MobEffectList.NIGHT_VISION.id, two_minutes)); //night vision I: 2mn
        } else {
            super.onFoodEaten(stack, worldIn, player);
        }
    }
}
