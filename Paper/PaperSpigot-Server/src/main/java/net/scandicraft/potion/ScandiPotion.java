package net.scandicraft.potion;

import net.minecraft.server.MinecraftKey;
import net.minecraft.server.MobEffectList;

import java.awt.*;

public class ScandiPotion extends MobEffectList {
    //ScandiCraft Start ID 24
    public static final MobEffectList feather_falling = (new ScandiPotion(24, new MinecraftKey("feather_falling"), false, Color.YELLOW.getRGB()))
            .setIconIndex(3, 2)
            .setPotionName("potion.feather_falling");

    protected ScandiPotion(int potionID, MinecraftKey minecraftkey, boolean badEffect, int potionColor) {
        super(potionID, minecraftkey, badEffect, potionColor);
    }
}
