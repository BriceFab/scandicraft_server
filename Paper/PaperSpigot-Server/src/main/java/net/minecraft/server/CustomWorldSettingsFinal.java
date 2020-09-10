package net.minecraft.server;

import com.google.gson.*;

import java.lang.reflect.Type;

public class CustomWorldSettingsFinal {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;
    public final boolean A;
    public final int B;
    public final boolean C;
    public final int D;
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final int Y;
    public final int Z;
    public final int aa;
    public final int ab;
    public final int ac;
    public final int ad;
    public final int ae;
    public final int af;
    public final int ag;
    public final int ah;
    public final int ai;
    public final int aj;
    public final int ak;
    public final int al;
    public final int am;
    public final int an;
    public final int ao;
    public final int ap;
    public final int aq;
    public final int ar;
    public final int as;
    public final int at;
    public final int au;
    public final int av;
    public final int aw;
    public final int ax;
    public final int ay;
    public final int az;

    public final int lazuriteSize;
    public final int lazuriteCount;
    public final int lazuriteMinHeight;
    public final int lazuriteMaxHeight;
    public final int pyriteSize;
    public final int pyriteCount;
    public final int pyriteMinHeight;
    public final int pyriteMaxHeight;
    public final int scandiumSize;
    public final int scandiumCount;
    public final int scandiumMinHeight;
    public final int scandiumMaxHeight;
    public final int randomOreSize;
    public final int randomOreCount;
    public final int randomOreMinHeight;
    public final int randomOreMaxHeight;

    private CustomWorldSettingsFinal(CustomWorldSettingsFinal.CustomWorldSettings settingsFactory) {
        this.a = settingsFactory.b;
        this.b = settingsFactory.c;
        this.c = settingsFactory.d;
        this.d = settingsFactory.e;
        this.e = settingsFactory.f;
        this.f = settingsFactory.g;
        this.g = settingsFactory.h;
        this.h = settingsFactory.i;
        this.i = settingsFactory.j;
        this.j = settingsFactory.k;
        this.k = settingsFactory.l;
        this.l = settingsFactory.m;
        this.m = settingsFactory.n;
        this.n = settingsFactory.o;
        this.o = settingsFactory.p;
        this.p = settingsFactory.q;
        this.q = settingsFactory.r;
        this.r = settingsFactory.s;
        this.s = settingsFactory.t;
        this.t = settingsFactory.u;
        this.u = settingsFactory.v;
        this.v = settingsFactory.w;
        this.w = settingsFactory.x;
        this.x = settingsFactory.y;
        this.y = settingsFactory.z;
        this.z = settingsFactory.A;
        this.A = settingsFactory.B;
        this.B = settingsFactory.C;
        this.C = settingsFactory.D;
        this.D = settingsFactory.E;
        this.E = settingsFactory.F;
        this.F = settingsFactory.G;
        this.G = settingsFactory.H;
        this.H = settingsFactory.I;
        this.I = settingsFactory.J;
        this.J = settingsFactory.K;
        this.K = settingsFactory.L;
        this.L = settingsFactory.M;
        this.M = settingsFactory.N;
        this.N = settingsFactory.O;
        this.O = settingsFactory.P;
        this.P = settingsFactory.Q;
        this.Q = settingsFactory.R;
        this.R = settingsFactory.S;
        this.S = settingsFactory.T;
        this.T = settingsFactory.U;
        this.U = settingsFactory.V;
        this.V = settingsFactory.W;
        this.W = settingsFactory.X;
        this.X = settingsFactory.Y;
        this.Y = settingsFactory.Z;
        this.Z = settingsFactory.aa;
        this.aa = settingsFactory.ab;
        this.ab = settingsFactory.ac;
        this.ac = settingsFactory.ad;
        this.ad = settingsFactory.ae;
        this.ae = settingsFactory.af;
        this.af = settingsFactory.ag;
        this.ag = settingsFactory.ah;
        this.ah = settingsFactory.ai;
        this.ai = settingsFactory.aj;
        this.aj = settingsFactory.ak;
        this.ak = settingsFactory.al;
        this.al = settingsFactory.am;
        this.am = settingsFactory.an;
        this.an = settingsFactory.ao;
        this.ao = settingsFactory.ap;
        this.ap = settingsFactory.aq;
        this.aq = settingsFactory.ar;
        this.ar = settingsFactory.as;
        this.as = settingsFactory.at;
        this.at = settingsFactory.au;
        this.au = settingsFactory.av;
        this.av = settingsFactory.aw;
        this.aw = settingsFactory.ax;
        this.ax = settingsFactory.ay;
        this.ay = settingsFactory.az;
        this.az = settingsFactory.aA;

        this.lazuriteSize = settingsFactory.lazuriteSize;
        this.lazuriteCount = settingsFactory.lazuriteCount;
        this.lazuriteMinHeight = settingsFactory.lazuriteMinHeight;
        this.lazuriteMaxHeight = settingsFactory.lazuriteMaxHeight;
        this.pyriteSize = settingsFactory.pyriteSize;
        this.pyriteCount = settingsFactory.pyriteCount;
        this.pyriteMinHeight = settingsFactory.pyriteMinHeight;
        this.pyriteMaxHeight = settingsFactory.pyriteMaxHeight;
        this.scandiumSize = settingsFactory.scandiumSize;
        this.scandiumCount = settingsFactory.scandiumCount;
        this.scandiumMinHeight = settingsFactory.scandiumMinHeight;
        this.scandiumMaxHeight = settingsFactory.scandiumMaxHeight;
        this.randomOreSize = settingsFactory.randomOreSize;
        this.randomOreCount = settingsFactory.randomOreCount;
        this.randomOreMinHeight = settingsFactory.randomOreMinHeight;
        this.randomOreMaxHeight = settingsFactory.randomOreMaxHeight;
    }

    public static class CustomWorldSettingsSerializer implements JsonDeserializer<CustomWorldSettingsFinal.CustomWorldSettings>, JsonSerializer<CustomWorldSettingsFinal.CustomWorldSettings> {
        public CustomWorldSettingsSerializer() {
        }

        public CustomWorldSettingsFinal.CustomWorldSettings a(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
            JsonObject var4 = var1.getAsJsonObject();
            CustomWorldSettingsFinal.CustomWorldSettings settingsFactory = new CustomWorldSettingsFinal.CustomWorldSettings();

            try {
                settingsFactory.b = ChatDeserializer.a(var4, "coordinateScale", settingsFactory.b);
                settingsFactory.c = ChatDeserializer.a(var4, "heightScale", settingsFactory.c);
                settingsFactory.e = ChatDeserializer.a(var4, "lowerLimitScale", settingsFactory.e);
                settingsFactory.d = ChatDeserializer.a(var4, "upperLimitScale", settingsFactory.d);
                settingsFactory.f = ChatDeserializer.a(var4, "depthNoiseScaleX", settingsFactory.f);
                settingsFactory.g = ChatDeserializer.a(var4, "depthNoiseScaleZ", settingsFactory.g);
                settingsFactory.h = ChatDeserializer.a(var4, "depthNoiseScaleExponent", settingsFactory.h);
                settingsFactory.i = ChatDeserializer.a(var4, "mainNoiseScaleX", settingsFactory.i);
                settingsFactory.j = ChatDeserializer.a(var4, "mainNoiseScaleY", settingsFactory.j);
                settingsFactory.k = ChatDeserializer.a(var4, "mainNoiseScaleZ", settingsFactory.k);
                settingsFactory.l = ChatDeserializer.a(var4, "baseSize", settingsFactory.l);
                settingsFactory.m = ChatDeserializer.a(var4, "stretchY", settingsFactory.m);
                settingsFactory.n = ChatDeserializer.a(var4, "biomeDepthWeight", settingsFactory.n);
                settingsFactory.o = ChatDeserializer.a(var4, "biomeDepthOffset", settingsFactory.o);
                settingsFactory.p = ChatDeserializer.a(var4, "biomeScaleWeight", settingsFactory.p);
                settingsFactory.q = ChatDeserializer.a(var4, "biomeScaleOffset", settingsFactory.q);
                settingsFactory.r = ChatDeserializer.a(var4, "seaLevel", settingsFactory.r);
                settingsFactory.s = ChatDeserializer.a(var4, "useCaves", settingsFactory.s);
                settingsFactory.t = ChatDeserializer.a(var4, "useDungeons", settingsFactory.t);
                settingsFactory.u = ChatDeserializer.a(var4, "dungeonChance", settingsFactory.u);
                settingsFactory.v = ChatDeserializer.a(var4, "useStrongholds", settingsFactory.v);
                settingsFactory.w = ChatDeserializer.a(var4, "useVillages", settingsFactory.w);
                settingsFactory.x = ChatDeserializer.a(var4, "useMineShafts", settingsFactory.x);
                settingsFactory.y = ChatDeserializer.a(var4, "useTemples", settingsFactory.y);
                settingsFactory.z = ChatDeserializer.a(var4, "useMonuments", settingsFactory.z);
                settingsFactory.A = ChatDeserializer.a(var4, "useRavines", settingsFactory.A);
                settingsFactory.B = ChatDeserializer.a(var4, "useWaterLakes", settingsFactory.B);
                settingsFactory.C = ChatDeserializer.a(var4, "waterLakeChance", settingsFactory.C);
                settingsFactory.D = ChatDeserializer.a(var4, "useLavaLakes", settingsFactory.D);
                settingsFactory.E = ChatDeserializer.a(var4, "lavaLakeChance", settingsFactory.E);
                settingsFactory.F = ChatDeserializer.a(var4, "useLavaOceans", settingsFactory.F);
                settingsFactory.G = ChatDeserializer.a(var4, "fixedBiome", settingsFactory.G);
                if (settingsFactory.G < 38 && settingsFactory.G >= -1) {
                    if (settingsFactory.G >= BiomeBase.HELL.id) {
                        settingsFactory.G += 2;
                    }
                } else {
                    settingsFactory.G = -1;
                }

                settingsFactory.H = ChatDeserializer.a(var4, "biomeSize", settingsFactory.H);
                settingsFactory.I = ChatDeserializer.a(var4, "riverSize", settingsFactory.I);
                settingsFactory.J = ChatDeserializer.a(var4, "dirtSize", settingsFactory.J);
                settingsFactory.K = ChatDeserializer.a(var4, "dirtCount", settingsFactory.K);
                settingsFactory.L = ChatDeserializer.a(var4, "dirtMinHeight", settingsFactory.L);
                settingsFactory.M = ChatDeserializer.a(var4, "dirtMaxHeight", settingsFactory.M);
                settingsFactory.N = ChatDeserializer.a(var4, "gravelSize", settingsFactory.N);
                settingsFactory.O = ChatDeserializer.a(var4, "gravelCount", settingsFactory.O);
                settingsFactory.P = ChatDeserializer.a(var4, "gravelMinHeight", settingsFactory.P);
                settingsFactory.Q = ChatDeserializer.a(var4, "gravelMaxHeight", settingsFactory.Q);
                settingsFactory.R = ChatDeserializer.a(var4, "graniteSize", settingsFactory.R);
                settingsFactory.S = ChatDeserializer.a(var4, "graniteCount", settingsFactory.S);
                settingsFactory.T = ChatDeserializer.a(var4, "graniteMinHeight", settingsFactory.T);
                settingsFactory.U = ChatDeserializer.a(var4, "graniteMaxHeight", settingsFactory.U);
                settingsFactory.V = ChatDeserializer.a(var4, "dioriteSize", settingsFactory.V);
                settingsFactory.W = ChatDeserializer.a(var4, "dioriteCount", settingsFactory.W);
                settingsFactory.X = ChatDeserializer.a(var4, "dioriteMinHeight", settingsFactory.X);
                settingsFactory.Y = ChatDeserializer.a(var4, "dioriteMaxHeight", settingsFactory.Y);
                settingsFactory.Z = ChatDeserializer.a(var4, "andesiteSize", settingsFactory.Z);
                settingsFactory.aa = ChatDeserializer.a(var4, "andesiteCount", settingsFactory.aa);
                settingsFactory.ab = ChatDeserializer.a(var4, "andesiteMinHeight", settingsFactory.ab);
                settingsFactory.ac = ChatDeserializer.a(var4, "andesiteMaxHeight", settingsFactory.ac);
                settingsFactory.ad = ChatDeserializer.a(var4, "coalSize", settingsFactory.ad);
                settingsFactory.ae = ChatDeserializer.a(var4, "coalCount", settingsFactory.ae);
                settingsFactory.af = ChatDeserializer.a(var4, "coalMinHeight", settingsFactory.af);
                settingsFactory.ag = ChatDeserializer.a(var4, "coalMaxHeight", settingsFactory.ag);
                settingsFactory.ah = ChatDeserializer.a(var4, "ironSize", settingsFactory.ah);
                settingsFactory.ai = ChatDeserializer.a(var4, "ironCount", settingsFactory.ai);
                settingsFactory.aj = ChatDeserializer.a(var4, "ironMinHeight", settingsFactory.aj);
                settingsFactory.ak = ChatDeserializer.a(var4, "ironMaxHeight", settingsFactory.ak);
                settingsFactory.al = ChatDeserializer.a(var4, "goldSize", settingsFactory.al);
                settingsFactory.am = ChatDeserializer.a(var4, "goldCount", settingsFactory.am);
                settingsFactory.an = ChatDeserializer.a(var4, "goldMinHeight", settingsFactory.an);
                settingsFactory.ao = ChatDeserializer.a(var4, "goldMaxHeight", settingsFactory.ao);
                settingsFactory.ap = ChatDeserializer.a(var4, "redstoneSize", settingsFactory.ap);
                settingsFactory.aq = ChatDeserializer.a(var4, "redstoneCount", settingsFactory.aq);
                settingsFactory.ar = ChatDeserializer.a(var4, "redstoneMinHeight", settingsFactory.ar);
                settingsFactory.as = ChatDeserializer.a(var4, "redstoneMaxHeight", settingsFactory.as);
                settingsFactory.at = ChatDeserializer.a(var4, "diamondSize", settingsFactory.at);
                settingsFactory.au = ChatDeserializer.a(var4, "diamondCount", settingsFactory.au);
                settingsFactory.av = ChatDeserializer.a(var4, "diamondMinHeight", settingsFactory.av);
                settingsFactory.aw = ChatDeserializer.a(var4, "diamondMaxHeight", settingsFactory.aw);
                settingsFactory.ax = ChatDeserializer.a(var4, "lapisSize", settingsFactory.ax);
                settingsFactory.ay = ChatDeserializer.a(var4, "lapisCount", settingsFactory.ay);
                settingsFactory.az = ChatDeserializer.a(var4, "lapisCenterHeight", settingsFactory.az);
                settingsFactory.aA = ChatDeserializer.a(var4, "lapisSpread", settingsFactory.aA);

                settingsFactory.lazuriteSize = ChatDeserializer.a(var4, "lazuriteSize", settingsFactory.lazuriteSize);
                settingsFactory.lazuriteCount = ChatDeserializer.a(var4, "lazuriteCount", settingsFactory.lazuriteCount);
                settingsFactory.lazuriteMinHeight = ChatDeserializer.a(var4, "lazuriteMinHeight", settingsFactory.lazuriteMinHeight);
                settingsFactory.lazuriteMaxHeight = ChatDeserializer.a(var4, "lazuriteMaxHeight", settingsFactory.lazuriteMaxHeight);
                settingsFactory.pyriteSize = ChatDeserializer.a(var4, "pyriteSize", settingsFactory.pyriteSize);
                settingsFactory.pyriteCount = ChatDeserializer.a(var4, "pyriteCount", settingsFactory.pyriteCount);
                settingsFactory.pyriteMinHeight = ChatDeserializer.a(var4, "pyriteMinHeight", settingsFactory.pyriteMinHeight);
                settingsFactory.pyriteMaxHeight = ChatDeserializer.a(var4, "pyriteMaxHeight", settingsFactory.pyriteMaxHeight);
                settingsFactory.scandiumSize = ChatDeserializer.a(var4, "scandiumSize", settingsFactory.scandiumSize);
                settingsFactory.scandiumCount = ChatDeserializer.a(var4, "scandiumCount", settingsFactory.scandiumCount);
                settingsFactory.scandiumMinHeight = ChatDeserializer.a(var4, "scandiumMinHeight", settingsFactory.scandiumMinHeight);
                settingsFactory.scandiumMaxHeight = ChatDeserializer.a(var4, "scandiumMaxHeight", settingsFactory.scandiumMaxHeight);
                settingsFactory.randomOreSize = ChatDeserializer.a(var4, "randomOreSize", settingsFactory.randomOreSize);
                settingsFactory.randomOreCount = ChatDeserializer.a(var4, "randomOreCount", settingsFactory.randomOreCount);
                settingsFactory.randomOreMinHeight = ChatDeserializer.a(var4, "randomOreMinHeight", settingsFactory.randomOreMinHeight);
                settingsFactory.randomOreMaxHeight = ChatDeserializer.a(var4, "randomOreMaxHeight", settingsFactory.randomOreMaxHeight);
            } catch (Exception var7) {
            }

            return settingsFactory;
        }

        public JsonElement a(CustomWorldSettingsFinal.CustomWorldSettings settingsFactory, Type var2, JsonSerializationContext var3) {
            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("coordinateScale", settingsFactory.b);
            jsonobject.addProperty("heightScale", settingsFactory.c);
            jsonobject.addProperty("lowerLimitScale", settingsFactory.e);
            jsonobject.addProperty("upperLimitScale", settingsFactory.d);
            jsonobject.addProperty("depthNoiseScaleX", settingsFactory.f);
            jsonobject.addProperty("depthNoiseScaleZ", settingsFactory.g);
            jsonobject.addProperty("depthNoiseScaleExponent", settingsFactory.h);
            jsonobject.addProperty("mainNoiseScaleX", settingsFactory.i);
            jsonobject.addProperty("mainNoiseScaleY", settingsFactory.j);
            jsonobject.addProperty("mainNoiseScaleZ", settingsFactory.k);
            jsonobject.addProperty("baseSize", settingsFactory.l);
            jsonobject.addProperty("stretchY", settingsFactory.m);
            jsonobject.addProperty("biomeDepthWeight", settingsFactory.n);
            jsonobject.addProperty("biomeDepthOffset", settingsFactory.o);
            jsonobject.addProperty("biomeScaleWeight", settingsFactory.p);
            jsonobject.addProperty("biomeScaleOffset", settingsFactory.q);
            jsonobject.addProperty("seaLevel", settingsFactory.r);
            jsonobject.addProperty("useCaves", settingsFactory.s);
            jsonobject.addProperty("useDungeons", settingsFactory.t);
            jsonobject.addProperty("dungeonChance", settingsFactory.u);
            jsonobject.addProperty("useStrongholds", settingsFactory.v);
            jsonobject.addProperty("useVillages", settingsFactory.w);
            jsonobject.addProperty("useMineShafts", settingsFactory.x);
            jsonobject.addProperty("useTemples", settingsFactory.y);
            jsonobject.addProperty("useMonuments", settingsFactory.z);
            jsonobject.addProperty("useRavines", settingsFactory.A);
            jsonobject.addProperty("useWaterLakes", settingsFactory.B);
            jsonobject.addProperty("waterLakeChance", settingsFactory.C);
            jsonobject.addProperty("useLavaLakes", settingsFactory.D);
            jsonobject.addProperty("lavaLakeChance", settingsFactory.E);
            jsonobject.addProperty("useLavaOceans", settingsFactory.F);
            jsonobject.addProperty("fixedBiome", settingsFactory.G);
            jsonobject.addProperty("biomeSize", settingsFactory.H);
            jsonobject.addProperty("riverSize", settingsFactory.I);
            jsonobject.addProperty("dirtSize", settingsFactory.J);
            jsonobject.addProperty("dirtCount", settingsFactory.K);
            jsonobject.addProperty("dirtMinHeight", settingsFactory.L);
            jsonobject.addProperty("dirtMaxHeight", settingsFactory.M);
            jsonobject.addProperty("gravelSize", settingsFactory.N);
            jsonobject.addProperty("gravelCount", settingsFactory.O);
            jsonobject.addProperty("gravelMinHeight", settingsFactory.P);
            jsonobject.addProperty("gravelMaxHeight", settingsFactory.Q);
            jsonobject.addProperty("graniteSize", settingsFactory.R);
            jsonobject.addProperty("graniteCount", settingsFactory.S);
            jsonobject.addProperty("graniteMinHeight", settingsFactory.T);
            jsonobject.addProperty("graniteMaxHeight", settingsFactory.U);
            jsonobject.addProperty("dioriteSize", settingsFactory.V);
            jsonobject.addProperty("dioriteCount", settingsFactory.W);
            jsonobject.addProperty("dioriteMinHeight", settingsFactory.X);
            jsonobject.addProperty("dioriteMaxHeight", settingsFactory.Y);
            jsonobject.addProperty("andesiteSize", settingsFactory.Z);
            jsonobject.addProperty("andesiteCount", settingsFactory.aa);
            jsonobject.addProperty("andesiteMinHeight", settingsFactory.ab);
            jsonobject.addProperty("andesiteMaxHeight", settingsFactory.ac);
            jsonobject.addProperty("coalSize", settingsFactory.ad);
            jsonobject.addProperty("coalCount", settingsFactory.ae);
            jsonobject.addProperty("coalMinHeight", settingsFactory.af);
            jsonobject.addProperty("coalMaxHeight", settingsFactory.ag);
            jsonobject.addProperty("ironSize", settingsFactory.ah);
            jsonobject.addProperty("ironCount", settingsFactory.ai);
            jsonobject.addProperty("ironMinHeight", settingsFactory.aj);
            jsonobject.addProperty("ironMaxHeight", settingsFactory.ak);
            jsonobject.addProperty("goldSize", settingsFactory.al);
            jsonobject.addProperty("goldCount", settingsFactory.am);
            jsonobject.addProperty("goldMinHeight", settingsFactory.an);
            jsonobject.addProperty("goldMaxHeight", settingsFactory.ao);
            jsonobject.addProperty("redstoneSize", settingsFactory.ap);
            jsonobject.addProperty("redstoneCount", settingsFactory.aq);
            jsonobject.addProperty("redstoneMinHeight", settingsFactory.ar);
            jsonobject.addProperty("redstoneMaxHeight", settingsFactory.as);
            jsonobject.addProperty("diamondSize", settingsFactory.at);
            jsonobject.addProperty("diamondCount", settingsFactory.au);
            jsonobject.addProperty("diamondMinHeight", settingsFactory.av);
            jsonobject.addProperty("diamondMaxHeight", settingsFactory.aw);
            jsonobject.addProperty("lapisSize", settingsFactory.ax);
            jsonobject.addProperty("lapisCount", settingsFactory.ay);
            jsonobject.addProperty("lapisCenterHeight", settingsFactory.az);
            jsonobject.addProperty("lapisSpread", settingsFactory.aA);

            jsonobject.addProperty("lazuriteSize", settingsFactory.lazuriteSize);
            jsonobject.addProperty("lazuriteCount", settingsFactory.lazuriteCount);
            jsonobject.addProperty("lazuriteMinHeight", settingsFactory.lazuriteMinHeight);
            jsonobject.addProperty("lazuriteMaxHeight", settingsFactory.lazuriteMaxHeight);
            jsonobject.addProperty("pyriteSize", settingsFactory.pyriteSize);
            jsonobject.addProperty("pyriteCount", settingsFactory.pyriteCount);
            jsonobject.addProperty("pyriteMinHeight", settingsFactory.pyriteMinHeight);
            jsonobject.addProperty("pyriteMaxHeight", settingsFactory.pyriteMaxHeight);
            jsonobject.addProperty("scandiumSize", settingsFactory.scandiumSize);
            jsonobject.addProperty("scandiumCount", settingsFactory.scandiumCount);
            jsonobject.addProperty("scandiumMinHeight", settingsFactory.scandiumMinHeight);
            jsonobject.addProperty("scandiumMaxHeight", settingsFactory.scandiumMaxHeight);
            jsonobject.addProperty("randomOreSize", settingsFactory.randomOreSize);
            jsonobject.addProperty("randomOreCount", settingsFactory.randomOreCount);
            jsonobject.addProperty("randomOreMinHeight", settingsFactory.randomOreMinHeight);
            jsonobject.addProperty("randomOreMaxHeight", settingsFactory.randomOreMaxHeight);
            return jsonobject;
        }

        @Override
        public CustomWorldSettings deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            //j'ai dû rajouter mais n'était pas là
            return null;
        }

        @Override
        public JsonElement serialize(CustomWorldSettings customWorldSettings, Type type, JsonSerializationContext jsonSerializationContext) {
            //j'ai dû rajouter mais n'était pas là
            return null;
        }
    }

    public static class CustomWorldSettings {
        static final Gson a = (new GsonBuilder()).registerTypeAdapter(CustomWorldSettingsFinal.CustomWorldSettings.class, new CustomWorldSettingsFinal.CustomWorldSettingsSerializer()).create();
        public float b = 684.412F;
        public float c = 684.412F;
        public float d = 512.0F;
        public float e = 512.0F;
        public float f = 200.0F;
        public float g = 200.0F;
        public float h = 0.5F;
        public float i = 80.0F;
        public float j = 160.0F;
        public float k = 80.0F;
        public float l = 8.5F;
        public float m = 12.0F;
        public float n = 1.0F;
        public float o = 0.0F;
        public float p = 1.0F;
        public float q = 0.0F;
        public int r = 63;
        public boolean s = true;
        public boolean t = true;
        public int u = 8;
        public boolean v = true;
        public boolean w = true;
        public boolean x = true;
        public boolean y = true;
        public boolean z = true;
        public boolean A = true;
        public boolean B = true;
        public int C = 4;
        public boolean D = true;
        public int E = 80;
        public boolean F = false;
        public int G = -1;
        public int H = 4;
        public int I = 4;
        public int J = 33;
        public int K = 10;
        public int L = 0;
        public int M = 256;
        public int N = 33;
        public int O = 8;
        public int P = 0;
        public int Q = 256;
        public int R = 33;
        public int S = 10;
        public int T = 0;
        public int U = 80;
        public int V = 33;
        public int W = 10;
        public int X = 0;
        public int Y = 80;
        public int Z = 33;
        public int aa = 10;
        public int ab = 0;
        public int ac = 80;
        public int ad = 17;
        public int ae = 20;
        public int af = 0;
        public int ag = 128;
        public int ah = 9;
        public int ai = 20;
        public int aj = 0;
        public int ak = 64;
        public int al = 9;
        public int am = 2;
        public int an = 0;
        public int ao = 32;
        public int ap = 8;
        public int aq = 8;
        public int ar = 0;
        public int as = 16;
        public int at = 8;
        public int au = 1;
        public int av = 0;
        public int aw = 16;
        public int ax = 7;
        public int ay = 1;
        public int az = 16;
        public int aA = 16;

        public int lazuriteSize = 7;
        public int lazuriteCount = 2;
        public int lazuriteMinHeight = 0;
        public int lazuriteMaxHeight = 20;
        public int pyriteSize = 5;
        public int pyriteCount = 1;
        public int pyriteMinHeight = 2;
        public int pyriteMaxHeight = 12;
        public int scandiumSize = 4;
        public int scandiumCount = 1;
        public int scandiumMinHeight = 5;
        public int scandiumMaxHeight = 12;
        public int randomOreSize = 6;
        public int randomOreCount = 1;
        public int randomOreMinHeight = 0;
        public int randomOreMaxHeight = 20;

        public static CustomWorldSettingsFinal.CustomWorldSettings a(String var0) {
            if (var0.length() == 0) {
                return new CustomWorldSettingsFinal.CustomWorldSettings();
            } else {
                try {
                    return (CustomWorldSettingsFinal.CustomWorldSettings) a.fromJson(var0, CustomWorldSettingsFinal.CustomWorldSettings.class);
                } catch (Exception var2) {
                    return new CustomWorldSettingsFinal.CustomWorldSettings();
                }
            }
        }

        public String toString() {
            return a.toJson(this);
        }

        public CustomWorldSettings() {
            this.a();
        }

        public void a() {
            this.b = 684.412F;
            this.c = 684.412F;
            this.d = 512.0F;
            this.e = 512.0F;
            this.f = 200.0F;
            this.g = 200.0F;
            this.h = 0.5F;
            this.i = 80.0F;
            this.j = 160.0F;
            this.k = 80.0F;
            this.l = 8.5F;
            this.m = 12.0F;
            this.n = 1.0F;
            this.o = 0.0F;
            this.p = 1.0F;
            this.q = 0.0F;
            this.r = 63;
            this.s = true;
            this.t = true;
            this.u = 8;
            this.v = true;
            this.w = true;
            this.x = true;
            this.y = true;
            this.z = true;
            this.A = true;
            this.B = true;
            this.C = 4;
            this.D = true;
            this.E = 80;
            this.F = false;
            this.G = -1;
            this.H = 4;
            this.I = 4;
            this.J = 33;
            this.K = 10;
            this.L = 0;
            this.M = 256;
            this.N = 33;
            this.O = 8;
            this.P = 0;
            this.Q = 256;
            this.R = 33;
            this.S = 10;
            this.T = 0;
            this.U = 80;
            this.V = 33;
            this.W = 10;
            this.X = 0;
            this.Y = 80;
            this.Z = 33;
            this.aa = 10;
            this.ab = 0;
            this.ac = 80;
            this.ad = 17;
            this.ae = 20;
            this.af = 0;
            this.ag = 128;
            this.ah = 9;
            this.ai = 20;
            this.aj = 0;
            this.ak = 64;
            this.al = 9;
            this.am = 2;
            this.an = 0;
            this.ao = 32;
            this.ap = 8;
            this.aq = 8;
            this.ar = 0;
            this.as = 16;
            this.at = 8;
            this.au = 1;
            this.av = 0;
            this.aw = 16;
            this.ax = 7;
            this.ay = 1;
            this.az = 16;
            this.aA = 16;

            this.lazuriteSize = 7;
            this.lazuriteCount = 2;
            this.lazuriteMinHeight = 0;
            this.lazuriteMaxHeight = 20;
            this.pyriteSize = 5;
            this.pyriteCount = 1;
            this.pyriteMinHeight = 2;
            this.pyriteMaxHeight = 12;
            this.scandiumSize = 4;
            this.scandiumCount = 1;
            this.scandiumMinHeight = 5;
            this.scandiumMaxHeight = 12;
            this.randomOreSize = 6;
            this.randomOreCount = 1;
            this.randomOreMinHeight = 0;
            this.randomOreMaxHeight = 20;
        }

        public boolean equals(Object var1) {
            if (this == var1) {
                return true;
            } else if (var1 != null && this.getClass() == var1.getClass()) {
                CustomWorldSettingsFinal.CustomWorldSettings var2 = (CustomWorldSettingsFinal.CustomWorldSettings) var1;
                if (this.aa != var2.aa) {
                    return false;
                } else if (this.ac != var2.ac) {
                    return false;
                } else if (this.ab != var2.ab) {
                    return false;
                } else if (this.Z != var2.Z) {
                    return false;
                } else if (Float.compare(var2.l, this.l) != 0) {
                    return false;
                } else if (Float.compare(var2.o, this.o) != 0) {
                    return false;
                } else if (Float.compare(var2.n, this.n) != 0) {
                    return false;
                } else if (Float.compare(var2.q, this.q) != 0) {
                    return false;
                } else if (Float.compare(var2.p, this.p) != 0) {
                    return false;
                } else if (this.H != var2.H) {
                    return false;
                } else if (this.ae != var2.ae) {
                    return false;
                } else if (this.ag != var2.ag) {
                    return false;
                } else if (this.af != var2.af) {
                    return false;
                } else if (this.ad != var2.ad) {
                    return false;
                } else if (Float.compare(var2.b, this.b) != 0) {
                    return false;
                } else if (Float.compare(var2.h, this.h) != 0) {
                    return false;
                } else if (Float.compare(var2.f, this.f) != 0) {
                    return false;
                } else if (Float.compare(var2.g, this.g) != 0) {
                    return false;
                } else if (this.au != var2.au) {
                    return false;
                } else if (this.aw != var2.aw) {
                    return false;
                } else if (this.av != var2.av) {
                    return false;
                } else if (this.at != var2.at) {
                    return false;
                } else if (this.W != var2.W) {
                    return false;
                } else if (this.Y != var2.Y) {
                    return false;
                } else if (this.X != var2.X) {
                    return false;
                } else if (this.V != var2.V) {
                    return false;
                } else if (this.K != var2.K) {
                    return false;
                } else if (this.M != var2.M) {
                    return false;
                } else if (this.L != var2.L) {
                    return false;
                } else if (this.J != var2.J) {
                    return false;
                } else if (this.u != var2.u) {
                    return false;
                } else if (this.G != var2.G) {
                    return false;
                } else if (this.am != var2.am) {
                    return false;
                } else if (this.ao != var2.ao) {
                    return false;
                } else if (this.an != var2.an) {
                    return false;
                } else if (this.al != var2.al) {
                    return false;
                } else if (this.S != var2.S) {
                    return false;
                } else if (this.U != var2.U) {
                    return false;
                } else if (this.T != var2.T) {
                    return false;
                } else if (this.R != var2.R) {
                    return false;
                } else if (this.O != var2.O) {
                    return false;
                } else if (this.Q != var2.Q) {
                    return false;
                } else if (this.P != var2.P) {
                    return false;
                } else if (this.N != var2.N) {
                    return false;
                } else if (Float.compare(var2.c, this.c) != 0) {
                    return false;
                } else if (this.ai != var2.ai) {
                    return false;
                } else if (this.ak != var2.ak) {
                    return false;
                } else if (this.aj != var2.aj) {
                    return false;
                } else if (this.ah != var2.ah) {
                    return false;
                } else if (this.az != var2.az) {
                    return false;
                } else if (this.ay != var2.ay) {
                    return false;
                } else if (this.ax != var2.ax) {
                    return false;
                } else if (this.aA != var2.aA) {
                    return false;
                } else if (this.E != var2.E) {
                    return false;
                } else if (Float.compare(var2.e, this.e) != 0) {
                    return false;
                } else if (Float.compare(var2.i, this.i) != 0) {
                    return false;
                } else if (Float.compare(var2.j, this.j) != 0) {
                    return false;
                } else if (Float.compare(var2.k, this.k) != 0) {
                    return false;
                } else if (this.aq != var2.aq) {
                    return false;
                } else if (this.as != var2.as) {
                    return false;
                } else if (this.ar != var2.ar) {
                    return false;
                } else if (this.ap != var2.ap) {
                    return false;
                } else if (this.I != var2.I) {
                    return false;

                } else if (this.lazuriteCount != var2.lazuriteCount) {
                    return false;
                } else if (this.lazuriteMaxHeight != var2.lazuriteMaxHeight) {
                    return false;
                } else if (this.lazuriteMinHeight != var2.lazuriteMinHeight) {
                    return false;
                } else if (this.lazuriteSize != var2.lazuriteSize) {
                    return false;
                } else if (this.pyriteCount != var2.pyriteCount) {
                    return false;
                } else if (this.pyriteMaxHeight != var2.pyriteMaxHeight) {
                    return false;
                } else if (this.pyriteMinHeight != var2.pyriteMinHeight) {
                    return false;
                } else if (this.pyriteSize != var2.pyriteSize) {
                    return false;
                } else if (this.scandiumCount != var2.scandiumCount) {
                    return false;
                } else if (this.scandiumMaxHeight != var2.scandiumMaxHeight) {
                    return false;
                } else if (this.scandiumMinHeight != var2.scandiumMinHeight) {
                    return false;
                } else if (this.scandiumSize != var2.scandiumSize) {
                    return false;
                } else if (this.randomOreCount != var2.randomOreCount) {
                    return false;
                } else if (this.randomOreMaxHeight != var2.randomOreMaxHeight) {
                    return false;
                } else if (this.randomOreMinHeight != var2.randomOreMinHeight) {
                    return false;
                } else if (this.randomOreSize != var2.randomOreSize) {
                    return false;

                } else if (this.r != var2.r) {
                    return false;
                } else if (Float.compare(var2.m, this.m) != 0) {
                    return false;
                } else if (Float.compare(var2.d, this.d) != 0) {
                    return false;
                } else if (this.s != var2.s) {
                    return false;
                } else if (this.t != var2.t) {
                    return false;
                } else if (this.D != var2.D) {
                    return false;
                } else if (this.F != var2.F) {
                    return false;
                } else if (this.x != var2.x) {
                    return false;
                } else if (this.A != var2.A) {
                    return false;
                } else if (this.v != var2.v) {
                    return false;
                } else if (this.y != var2.y) {
                    return false;
                } else if (this.z != var2.z) {
                    return false;
                } else if (this.w != var2.w) {
                    return false;
                } else if (this.B != var2.B) {
                    return false;
                } else {
                    return this.C == var2.C;
                }
            } else {
                return false;
            }
        }

        public int hashCode() {
            int i = this.b != 0.0F ? Float.floatToIntBits(this.b) : 0;
            i = 31 * i + (this.c != 0.0F ? Float.floatToIntBits(this.c) : 0);
            i = 31 * i + (this.d != 0.0F ? Float.floatToIntBits(this.d) : 0);
            i = 31 * i + (this.e != 0.0F ? Float.floatToIntBits(this.e) : 0);
            i = 31 * i + (this.f != 0.0F ? Float.floatToIntBits(this.f) : 0);
            i = 31 * i + (this.g != 0.0F ? Float.floatToIntBits(this.g) : 0);
            i = 31 * i + (this.h != 0.0F ? Float.floatToIntBits(this.h) : 0);
            i = 31 * i + (this.i != 0.0F ? Float.floatToIntBits(this.i) : 0);
            i = 31 * i + (this.j != 0.0F ? Float.floatToIntBits(this.j) : 0);
            i = 31 * i + (this.k != 0.0F ? Float.floatToIntBits(this.k) : 0);
            i = 31 * i + (this.l != 0.0F ? Float.floatToIntBits(this.l) : 0);
            i = 31 * i + (this.m != 0.0F ? Float.floatToIntBits(this.m) : 0);
            i = 31 * i + (this.n != 0.0F ? Float.floatToIntBits(this.n) : 0);
            i = 31 * i + (this.o != 0.0F ? Float.floatToIntBits(this.o) : 0);
            i = 31 * i + (this.p != 0.0F ? Float.floatToIntBits(this.p) : 0);
            i = 31 * i + (this.q != 0.0F ? Float.floatToIntBits(this.q) : 0);
            i = 31 * i + this.r;
            i = 31 * i + (this.s ? 1 : 0);
            i = 31 * i + (this.t ? 1 : 0);
            i = 31 * i + this.u;
            i = 31 * i + (this.v ? 1 : 0);
            i = 31 * i + (this.w ? 1 : 0);
            i = 31 * i + (this.x ? 1 : 0);
            i = 31 * i + (this.y ? 1 : 0);
            i = 31 * i + (this.z ? 1 : 0);
            i = 31 * i + (this.A ? 1 : 0);
            i = 31 * i + (this.B ? 1 : 0);
            i = 31 * i + this.C;
            i = 31 * i + (this.D ? 1 : 0);
            i = 31 * i + this.E;
            i = 31 * i + (this.F ? 1 : 0);
            i = 31 * i + this.G;
            i = 31 * i + this.H;
            i = 31 * i + this.I;
            i = 31 * i + this.J;
            i = 31 * i + this.K;
            i = 31 * i + this.L;
            i = 31 * i + this.M;
            i = 31 * i + this.N;
            i = 31 * i + this.O;
            i = 31 * i + this.P;
            i = 31 * i + this.Q;
            i = 31 * i + this.R;
            i = 31 * i + this.S;
            i = 31 * i + this.T;
            i = 31 * i + this.U;
            i = 31 * i + this.V;
            i = 31 * i + this.W;
            i = 31 * i + this.X;
            i = 31 * i + this.Y;
            i = 31 * i + this.Z;
            i = 31 * i + this.aa;
            i = 31 * i + this.ab;
            i = 31 * i + this.ac;
            i = 31 * i + this.ad;
            i = 31 * i + this.ae;
            i = 31 * i + this.af;
            i = 31 * i + this.ag;
            i = 31 * i + this.ah;
            i = 31 * i + this.ai;
            i = 31 * i + this.aj;
            i = 31 * i + this.ak;
            i = 31 * i + this.al;
            i = 31 * i + this.am;
            i = 31 * i + this.an;
            i = 31 * i + this.ao;
            i = 31 * i + this.ap;
            i = 31 * i + this.aq;
            i = 31 * i + this.ar;
            i = 31 * i + this.as;
            i = 31 * i + this.at;
            i = 31 * i + this.au;
            i = 31 * i + this.av;
            i = 31 * i + this.aw;
            i = 31 * i + this.ax;
            i = 31 * i + this.ay;
            i = 31 * i + this.az;
            i = 31 * i + this.aA;

            this.i = 31 * this.i + this.lazuriteSize;
            this.i = 31 * this.i + this.lazuriteCount;
            this.i = 31 * this.i + this.lazuriteMinHeight;
            this.i = 31 * this.i + this.lazuriteMaxHeight;
            this.i = 31 * this.i + this.pyriteSize;
            this.i = 31 * this.i + this.pyriteCount;
            this.i = 31 * this.i + this.pyriteMinHeight;
            this.i = 31 * this.i + this.pyriteMaxHeight;
            this.i = 31 * this.i + this.scandiumSize;
            this.i = 31 * this.i + this.scandiumCount;
            this.i = 31 * this.i + this.scandiumMinHeight;
            this.i = 31 * this.i + this.scandiumMaxHeight;
            this.i = 31 * this.i + this.randomOreSize;
            this.i = 31 * this.i + this.randomOreCount;
            this.i = 31 * this.i + this.randomOreMinHeight;
            this.i = 31 * this.i + this.randomOreMaxHeight;

            return i;
        }

        public CustomWorldSettingsFinal b() {
            return new CustomWorldSettingsFinal(this);
        }
    }
}
