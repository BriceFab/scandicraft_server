package net.minecraft.server;

import java.util.Random;

public class BiomeDecorator {
    protected World a;

    protected Random b;

    protected BlockPosition c;

    protected CustomWorldSettingsFinal d;

    public void a(World paramWorld, Random paramRandom, BiomeBase paramBiomeBase, BlockPosition paramBlockPosition) {
        if (this.a != null)
            throw new RuntimeException("Already decorating");
        this.a = paramWorld;
        String str = paramWorld.getWorldData().getGeneratorOptions();
        if (str != null) {
            this.d = CustomWorldSettingsFinal.CustomWorldSettings.a(str).b();
        } else {
            this.d = CustomWorldSettingsFinal.CustomWorldSettings.a("").b();
        }
        this.b = paramRandom;
        this.c = paramBlockPosition;
        this.h = new WorldGenMinable(Blocks.DIRT.getBlockData(), this.d.I);
        this.i = new WorldGenMinable(Blocks.GRAVEL.getBlockData(), this.d.M);
        this.j = new WorldGenMinable(Blocks.STONE.getBlockData().set(BlockStone.VARIANT, BlockStone.EnumStoneVariant.GRANITE), this.d.Q);
        this.k = new WorldGenMinable(Blocks.STONE.getBlockData().set(BlockStone.VARIANT, BlockStone.EnumStoneVariant.DIORITE), this.d.U);
        this.l = new WorldGenMinable(Blocks.STONE.getBlockData().set(BlockStone.VARIANT, BlockStone.EnumStoneVariant.ANDESITE), this.d.Y);
        this.m = new WorldGenMinable(Blocks.COAL_ORE.getBlockData(), this.d.ac);
        this.n = new WorldGenMinable(Blocks.IRON_ORE.getBlockData(), this.d.ag);
        this.o = new WorldGenMinable(Blocks.GOLD_ORE.getBlockData(), this.d.ak);
        this.p = new WorldGenMinable(Blocks.REDSTONE_ORE.getBlockData(), this.d.ao);
        this.q = new WorldGenMinable(Blocks.DIAMOND_ORE.getBlockData(), this.d.as);
        this.r = new WorldGenMinable(Blocks.LAPIS_ORE.getBlockData(), this.d.aw);

        this.lazuriteGen = new WorldGenMinable(Blocks.lazurite_ore.getBlockData(), this.d.lazuriteSize);
        this.pyriteGen = new WorldGenMinable(Blocks.pyrite_ore.getBlockData(), this.d.pyriteSize);
        this.scandiumGen = new WorldGenMinable(Blocks.scandium_ore.getBlockData(), this.d.scandiumSize);

        a(paramBiomeBase);
        this.a = null;
        this.b = null;
    }

    protected WorldGenerator e = new WorldGenClay(4);

    protected WorldGenerator f = new WorldGenSand(Blocks.SAND, 7);

    protected WorldGenerator g = new WorldGenSand(Blocks.GRAVEL, 6);

    protected WorldGenerator h;

    protected WorldGenerator i;

    protected WorldGenerator j;

    protected WorldGenerator k;

    protected WorldGenerator l;

    protected WorldGenerator m;

    protected WorldGenerator n;

    protected WorldGenerator o;

    protected WorldGenerator p;

    protected WorldGenerator q;

    protected WorldGenerator lazuriteGen;
    protected WorldGenerator pyriteGen;
    protected WorldGenerator scandiumGen;

    protected WorldGenerator r;

    protected WorldGenFlowers s = new WorldGenFlowers(Blocks.YELLOW_FLOWER, BlockFlowers.EnumFlowerVarient.DANDELION);

    protected WorldGenerator t = new WorldGenMushrooms(Blocks.BROWN_MUSHROOM);

    protected WorldGenerator u = new WorldGenMushrooms(Blocks.RED_MUSHROOM);

    protected WorldGenerator v = new WorldGenHugeMushroom();

    protected WorldGenerator w = new WorldGenReed();

    protected WorldGenerator x = new WorldGenCactus();

    protected WorldGenerator y = new WorldGenWaterLily();

    protected int z;

    protected int A;

    protected int B = 2;

    protected int C = 1;

    protected int D;

    protected int E;

    protected int F;

    protected int G;

    protected int H = 1;

    protected int I = 3;

    protected int J = 1;

    protected int K;

    public boolean L = true;

    protected void a(BiomeBase paramBiomeBase) {
        a();
        int i;
        for (i = 0; i < this.I; i++) {
            int k = this.b.nextInt(16) + 8;
            int m = this.b.nextInt(16) + 8;
            this.f.generate(this.a, this.b, this.a.r(this.c.a(k, 0, m)));
        }
        for (i = 0; i < this.J; i++) {
            int k = this.b.nextInt(16) + 8;
            int m = this.b.nextInt(16) + 8;
            this.e.generate(this.a, this.b, this.a.r(this.c.a(k, 0, m)));
        }
        for (i = 0; i < this.H; i++) {
            int k = this.b.nextInt(16) + 8;
            int m = this.b.nextInt(16) + 8;
            this.g.generate(this.a, this.b, this.a.r(this.c.a(k, 0, m)));
        }
        i = this.A;
        if (this.b.nextInt(10) == 0)
            i++;
        int j;
        for (j = 0; j < i; j++) {
            int k = this.b.nextInt(16) + 8;
            int m = this.b.nextInt(16) + 8;
            WorldGenTreeAbstract worldGenTreeAbstract = paramBiomeBase.a(this.b);
            worldGenTreeAbstract.e();
            BlockPosition blockPosition = this.a.getHighestBlockYAt(this.c.a(k, 0, m));
            if (worldGenTreeAbstract.generate(this.a, this.b, blockPosition))
                worldGenTreeAbstract.a(this.a, this.b, blockPosition);
        }
        for (j = 0; j < this.K; j++) {
            int k = this.b.nextInt(16) + 8;
            int m = this.b.nextInt(16) + 8;
            this.v.generate(this.a, this.b, this.a.getHighestBlockYAt(this.c.a(k, 0, m)));
        }
        for (j = 0; j < this.B; j++) {
            int k = this.b.nextInt(16) + 8;
            int m = this.b.nextInt(16) + 8;
            int n = this.a.getHighestBlockYAt(this.c.a(k, 0, m)).getY() + 32;
            if (n > 0) {
                int i1 = this.b.nextInt(n);
                BlockPosition blockPosition = this.c.a(k, i1, m);
                BlockFlowers.EnumFlowerVarient enumFlowerVarient = paramBiomeBase.a(this.b, blockPosition);
                BlockFlowers blockFlowers = enumFlowerVarient.a().a();
                if (blockFlowers.getMaterial() != Material.AIR) {
                    this.s.a(blockFlowers, enumFlowerVarient);
                    this.s.generate(this.a, this.b, blockPosition);
                }
            }
        }
        for (j = 0; j < this.C; j++) {
            int k = this.b.nextInt(16) + 8;
            int m = this.b.nextInt(16) + 8;
            int n = this.a.getHighestBlockYAt(this.c.a(k, 0, m)).getY() * 2;
            if (n > 0) {
                int i1 = this.b.nextInt(n);
                paramBiomeBase.b(this.b).generate(this.a, this.b, this.c.a(k, i1, m));
            }
        }
        for (j = 0; j < this.D; j++) {
            int k = this.b.nextInt(16) + 8;
            int m = this.b.nextInt(16) + 8;
            int n = this.a.getHighestBlockYAt(this.c.a(k, 0, m)).getY() * 2;
            if (n > 0) {
                int i1 = this.b.nextInt(n);
                (new WorldGenDeadBush()).generate(this.a, this.b, this.c.a(k, i1, m));
            }
        }
        for (j = 0; j < this.z; j++) {
            int k = this.b.nextInt(16) + 8;
            int m = this.b.nextInt(16) + 8;
            int n = this.a.getHighestBlockYAt(this.c.a(k, 0, m)).getY() * 2;
            if (n > 0) {
                int i1 = this.b.nextInt(n);
                BlockPosition blockPosition = this.c.a(k, i1, m);
                while (blockPosition.getY() > 0) {
                    BlockPosition blockPosition1 = blockPosition.down();
                    if (!this.a.isEmpty(blockPosition1))
                        break;
                    blockPosition = blockPosition1;
                }
                this.y.generate(this.a, this.b, blockPosition);
            }
        }
        for (j = 0; j < this.E; j++) {
            if (this.b.nextInt(4) == 0) {
                int k = this.b.nextInt(16) + 8;
                int m = this.b.nextInt(16) + 8;
                BlockPosition blockPosition = this.a.getHighestBlockYAt(this.c.a(k, 0, m));
                this.t.generate(this.a, this.b, blockPosition);
            }
            if (this.b.nextInt(8) == 0) {
                int k = this.b.nextInt(16) + 8;
                int m = this.b.nextInt(16) + 8;
                int n = this.a.getHighestBlockYAt(this.c.a(k, 0, m)).getY() * 2;
                if (n > 0) {
                    int i1 = this.b.nextInt(n);
                    BlockPosition blockPosition = this.c.a(k, i1, m);
                    this.u.generate(this.a, this.b, blockPosition);
                }
            }
        }
        if (this.b.nextInt(4) == 0) {
            j = this.b.nextInt(16) + 8;
            int k = this.b.nextInt(16) + 8;
            int m = this.a.getHighestBlockYAt(this.c.a(j, 0, k)).getY() * 2;
            if (m > 0) {
                int n = this.b.nextInt(m);
                this.t.generate(this.a, this.b, this.c.a(j, n, k));
            }
        }
        if (this.b.nextInt(8) == 0) {
            j = this.b.nextInt(16) + 8;
            int k = this.b.nextInt(16) + 8;
            int m = this.a.getHighestBlockYAt(this.c.a(j, 0, k)).getY() * 2;
            if (m > 0) {
                int n = this.b.nextInt(m);
                this.u.generate(this.a, this.b, this.c.a(j, n, k));
            }
        }
        for (j = 0; j < this.F; j++) {
            int k = this.b.nextInt(16) + 8;
            int m = this.b.nextInt(16) + 8;
            int n = this.a.getHighestBlockYAt(this.c.a(k, 0, m)).getY() * 2;
            if (n > 0) {
                int i1 = this.b.nextInt(n);
                this.w.generate(this.a, this.b, this.c.a(k, i1, m));
            }
        }
        for (j = 0; j < 10; j++) {
            int k = this.b.nextInt(16) + 8;
            int m = this.b.nextInt(16) + 8;
            int n = this.a.getHighestBlockYAt(this.c.a(k, 0, m)).getY() * 2;
            if (n > 0) {
                int i1 = this.b.nextInt(n);
                this.w.generate(this.a, this.b, this.c.a(k, i1, m));
            }
        }
        if (this.b.nextInt(32) == 0) {
            j = this.b.nextInt(16) + 8;
            int k = this.b.nextInt(16) + 8;
            int m = this.a.getHighestBlockYAt(this.c.a(j, 0, k)).getY() * 2;
            if (m > 0) {
                int n = this.b.nextInt(m);
                (new WorldGenPumpkin()).generate(this.a, this.b, this.c.a(j, n, k));
            }
        }
        for (j = 0; j < this.G; j++) {
            int k = this.b.nextInt(16) + 8;
            int m = this.b.nextInt(16) + 8;
            int n = this.a.getHighestBlockYAt(this.c.a(k, 0, m)).getY() * 2;
            if (n > 0) {
                int i1 = this.b.nextInt(n);
                this.x.generate(this.a, this.b, this.c.a(k, i1, m));
            }
        }
        if (this.L) {
            for (j = 0; j < 50; j++) {
                int k = this.b.nextInt(16) + 8;
                int m = this.b.nextInt(16) + 8;
                int n = this.b.nextInt(248) + 8;
                if (n > 0) {
                    int i1 = this.b.nextInt(n);
                    BlockPosition blockPosition = this.c.a(k, i1, m);
                    (new WorldGenLiquids(Blocks.FLOWING_WATER)).generate(this.a, this.b, blockPosition);
                }
            }
            for (j = 0; j < 20; j++) {
                int k = this.b.nextInt(16) + 8;
                int m = this.b.nextInt(16) + 8;
                int n = this.b.nextInt(this.b.nextInt(this.b.nextInt(240) + 8) + 8);
                BlockPosition blockPosition = this.c.a(k, n, m);
                (new WorldGenLiquids(Blocks.FLOWING_LAVA)).generate(this.a, this.b, blockPosition);
            }
        }
    }

    protected void a(int paramInt1, WorldGenerator paramWorldGenerator, int paramInt2, int paramInt3) {
        if (paramInt3 < paramInt2) {
            int i = paramInt2;
            paramInt2 = paramInt3;
            paramInt3 = i;
        } else if (paramInt3 == paramInt2) {
            if (paramInt2 < 255) {
                paramInt3++;
            } else {
                paramInt2--;
            }
        }
        for (byte b = 0; b < paramInt1; b++) {
            BlockPosition blockPosition = this.c.a(this.b.nextInt(16), this.b.nextInt(paramInt3 - paramInt2) + paramInt2, this.b.nextInt(16));
            paramWorldGenerator.generate(this.a, this.b, blockPosition);
        }
    }

    protected void b(int paramInt1, WorldGenerator paramWorldGenerator, int paramInt2, int paramInt3) {
        for (byte b = 0; b < paramInt1; b++) {
            BlockPosition blockPosition = this.c.a(this.b.nextInt(16), this.b.nextInt(paramInt3) + this.b.nextInt(paramInt3) + paramInt2 - paramInt3, this.b.nextInt(16));
            paramWorldGenerator.generate(this.a, this.b, blockPosition);
        }
    }

    protected void a() {    //=generateOres
        a(this.d.J, this.h, this.d.K, this.d.L);
        a(this.d.N, this.i, this.d.O, this.d.P);
        a(this.d.V, this.k, this.d.W, this.d.X);
        a(this.d.R, this.j, this.d.S, this.d.T);
        a(this.d.Z, this.l, this.d.aa, this.d.ab);
        a(this.d.ad, this.m, this.d.ae, this.d.af);
        a(this.d.ah, this.n, this.d.ai, this.d.aj);
        a(this.d.al, this.o, this.d.am, this.d.an);
        a(this.d.ap, this.p, this.d.aq, this.d.ar);
        a(this.d.at, this.q, this.d.au, this.d.av);
        b(this.d.ax, this.r, this.d.ay, this.d.az);

        a(this.d.lazuriteCount, this.lazuriteGen, this.d.lazuriteMinHeight, this.d.lazuriteMaxHeight);
        a(this.d.pyriteCount, this.pyriteGen, this.d.pyriteMinHeight, this.d.pyriteMaxHeight);
        a(this.d.scandiumCount, this.scandiumGen, this.d.scandiumMinHeight, this.d.scandiumMaxHeight);
    }
}