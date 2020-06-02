package net.scandicraft.items;

import net.minecraft.server.*;
import net.scandicraft.utils.MathUtils;

public class ScepterFalling extends Item {

    public ScepterFalling() {
        this.setCreativeTab(CreativeModeTab.tabCombat);
        this.setMaxStackSize(1);
    }

    @Override
    public ItemStack a(ItemStack itemStackIn, World worldIn, EntityHuman playerIn) {    //a = onItemRightClick
        if (!playerIn.abilities.canInstantlyBuild) {
            --itemStackIn.count;
        }

        //20 ticks = 1 seconde
        playerIn.addPotionEffect(new MobEffect(MobEffectList.FEATHER_FALLING.id, MathUtils.convertMinutesToTicks(5)));    //5 mn

        return itemStackIn;
    }

}
