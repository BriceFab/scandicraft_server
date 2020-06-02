package net.scandicraft.blocks;

import net.minecraft.server.BlockOre;
import net.minecraft.server.IBlockData;
import net.minecraft.server.Item;
import net.minecraft.server.Items;

import java.util.Random;

public class RandomOre extends BlockOre {

    @Override
    public Item getDropType(IBlockData state, Random rand, int fortune) {   //= getItemDropped
        int chance = rand.nextInt(100);

        if (chance < 30) {  //30%
            return Items.DIAMOND;
        } else if (chance < 60) {   //30%
            return Items.GOLD_INGOT;
        } else if (chance < 95) {   //37%
            return Items.lazurite;
        } else if (chance < 100) {  //3%
            return Items.pyrite;
        }

        return null;
    }
//
//    @Override
//    public void dropBlockAsItemWithChance(World worldIn, BlockPosition pos, IBlockData state, float chance, int fortune) {
//        int nbrXP = MathHelper.getRandomIntegerInRange(worldIn.rand, 1, 3);
//        this.dropXpOnBlockBreak(worldIn, pos, nbrXP);
//
//        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
//    }
//
//    @Override
//    public int quantityDropped(Random random) {
//        return MathHelper.getRandomIntegerInRange(random, 1, 2);
//    }
//
//    @Override
//    public int quantityDroppedWithBonus(int fortune, Random random) {
//        return MathHelper.getRandomIntegerInRange(random, 1, 3);
//    }
//
//    @Override
//    protected void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amount) {
//        super.dropXpOnBlockBreak(worldIn, pos, amount * 5);    //10x plus d'XP
//    }
}
