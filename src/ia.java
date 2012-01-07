import java.awt.Canvas;

final class ia extends ta implements Class_w {

   private Object[] f_gb = ura.a(-119, new Object[2]);
   private static int[] f_jb = new int[Math.max(Math.max(104, 20), 24573)];
   private fa f_fb;
   long nativeid = 0L;
   private boolean f_hb = false;
   private static byte[] f_db = new byte[8191];
   private static int[] M = new int[8191];
   private static int[] f_kb = new int[8191];
   private static short[] f_nb = new short[8191];
   static int[] f_lb = f_jb;
   private static float[] f_mb = new float[20];
   private Object[] S;
   private int f_bb = 4096;
   private float U;
   private float f_ib;
   private static int[] P = f_jb;
   private static int[] f_eb = f_jb;
   private Object[] R;
   private Object[] X;
   private Object[] Q;
   private static float[] f_cb = f_mb;
   private float N;
   private int f_ab = 4096;
   private Object[] V = nb.a((byte)91, 4, new Object[5]);
   private Object[] Z;
   private Object[] L;
   private float K;
   static int[] W = new int[6];
   private sa[] O;
   private boolean Y = false;
   int T;


   final boolean r() {
      return true;
   }

   final void a(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {
      throw new IllegalStateException();
   }

   final native void S(int var1, int var2, int var3, int var4, int var5);

   final boolean z() {
      return true;
   }

   final native int XA();

   final native void EA(int var1, Class_s var2, int var3, int var4);

   private final native void E(int var1, int[] var2, float[] var3);

   final int d(int var1, int var2) {
      int var3 = var1 & 1048575;
      int var4 = var2 & 1048575;
      return var3 & var4 ^ var4;
   }

   final int a(int var1, int var2) {
      return var1 | var2;
   }

   final Class_s a(int var1, int var2, int[] var3, int[] var4) {
      return new ua(this, this.f_fb, var1, var2, var3, var4);
   }

   final native void da(long var1, long var3);

   final void d(int var1) {
      this.f_bb = this.f_ab = var1;
      if(this.T > 1) {
         throw new IllegalStateException();
      } else {
         this.g(this.T);
         this.h(0);
      }
   }

   final int x() {
      return 4;
   }

   final native void oa(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

   private final native void na(short var1, int[] var2, short var3, int var4, byte var5, byte var6, int var7, boolean var8, byte var9, byte var10, byte var11, byte var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, byte var18, boolean var19, boolean var20, int var21);

   final void b(int var1, int var2, int var3, int var4) {}

   private final native void RA(int var1, int var2, int var3, int var4);

   protected final synchronized void finalize() {
      this.a((byte)17);
      if(this.nativeid != 0L) {
         lla.a(-120, this);
      }

   }

   private final native void pa(int var1, int var2, int var3, int var4);

   final void b(int var1, Object[] var2) {
      this.va(var1, ((int[])((int[])var2[0]))[1], ((int[])((int[])var2[0]))[5], ((int[])((int[])var2[0]))[0]);
   }

   final sa F() {
      for(int var1 = 0; var1 < this.T; ++var1) {
         if(this.O[var1].b == Thread.currentThread()) {
            return this.O[var1];
         }
      }

      return null;
   }

   public ia(Canvas var1, qa var2, int var3, int var4) {
      super(var2);

      try {
         if(!hp.a((byte)-46, "sw3d")) {
            throw new RuntimeException("");
         } else {
            lla.b((byte)-65);
            this.q(this.k, 0, 0);
            tia.a(-927416089, true, false);
            this.Y = true;
            this.S = ab.a(new Object[2], (byte)-37);
            nj.a(3, new Object[2]);
            this.R = im.a(new Object[2], (int)-16365);
            wua.a(true, new Object[2]);
            this.L = ab.a(new Object[2], (byte)111);
            this.Z = ab.a(new Object[2], (byte)-90);
            this.Q = ab.a(new Object[2], (byte)-111);
            this.d(im.a(new Object[2], (int)-16365));
            this.a(ab.a(new Object[2], (byte)74));
            this.g(1);
            this.h(0);
            if(var1 != null) {
               this.a(var3, var1, var4, -126);
               this.a(var1, -128);
            }

         }
      } catch (Throwable var6) {
         this.a((byte)17);
         throw new RuntimeException();
      }
   }

   final void a(float var1, float var2, float var3, float[] var4) {
      float var5 = ((float[])((float[])this.Q[0]))[14] + ((float[])((float[])this.Q[0]))[2] * var1 + ((float[])((float[])this.Q[0]))[6] * var2 + ((float[])((float[])this.Q[0]))[10] * var3;
      float var6 = ((float[])((float[])this.Q[0]))[15] + ((float[])((float[])this.Q[0]))[3] * var1 + ((float[])((float[])this.Q[0]))[7] * var2 + ((float[])((float[])this.Q[0]))[11] * var3;
      if(var5 >= -var6 && var5 <= var6) {
         float var7 = ((float[])((float[])this.Q[0]))[12] + ((float[])((float[])this.Q[0]))[0] * var1 + ((float[])((float[])this.Q[0]))[4] * var2 + ((float[])((float[])this.Q[0]))[8] * var3;
         if(var7 >= -var6 && var7 <= var6) {
            float var8 = ((float[])((float[])this.Q[0]))[13] + ((float[])((float[])this.Q[0]))[1] * var1 + ((float[])((float[])this.Q[0]))[5] * var2 + ((float[])((float[])this.Q[0]))[9] * var3;
            if(var8 >= -var6 && var8 <= var6) {
               float var9 = ((float[])((float[])this.L[0]))[14] + ((float[])((float[])this.L[0]))[2] * var1 + ((float[])((float[])this.L[0]))[6] * var2 + ((float[])((float[])this.L[0]))[10] * var3;
               var4[0] = this.N + this.U * var7 / var6;
               var4[1] = this.K + this.f_ib * var8 / var6;
               var4[2] = var9;
            } else {
               var4[2] = Float.NaN;
               var4[1] = Float.NaN;
               var4[0] = Float.NaN;
            }
         } else {
            var4[2] = Float.NaN;
            var4[1] = Float.NaN;
            var4[0] = Float.NaN;
         }
      } else {
         var4[2] = Float.NaN;
         var4[1] = Float.NaN;
         var4[0] = Float.NaN;
      }
   }

   final cga a(aea var1, boolean var2) {
      ga var3 = new ga(this, var1.f_i, var1.c, var1.e, 0, var1.a, var1.a, var1.h);
      var3.a(var1.f, var1.b, var1.d, var1.g);
      return var3;
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.F().a(this, var1, var2, var3, var4, var5, var6, var7);
   }

   private final native void fa(za var1);

   final void d(Object[] var1) {
      this.X = var1;
      aqa.a(true, var1, this.L);
      this.BA((float[])((float[])this.L[0]));
      jt.a(this.Z, this.L, 2, this.Q);
   }

   final void c(float var1, float var2, float var3, float[] var4) {
      float var5 = ((float[])((float[])this.Z[0]))[15] + ((float[])((float[])this.Z[0]))[3] * var1 + ((float[])((float[])this.Z[0]))[7] * var2 + ((float[])((float[])this.Z[0]))[11] * var3;
      float var6 = ((float[])((float[])this.Z[0]))[12] + ((float[])((float[])this.Z[0]))[0] * var1 + ((float[])((float[])this.Z[0]))[4] * var2 + ((float[])((float[])this.Z[0]))[8] * var3;
      float var7 = ((float[])((float[])this.Z[0]))[13] + ((float[])((float[])this.Z[0]))[1] * var1 + ((float[])((float[])this.Z[0]))[5] * var2 + ((float[])((float[])this.Z[0]))[9] * var3;
      var4[0] = this.N + this.U * var6 / var5;
      var4[1] = this.K + this.f_ib * var7 / var5;
      var4[2] = var3;
   }

   final void s() {}

   final cga a(int var1, int var2, boolean var3, boolean var4) {
      return new ga(this, var1, var2, var4);
   }

   private final native void ca(int var1);

   final gv a(Canvas var1, int var2, int var3) {
      return new Class_c(this, var1, var2, var3);
   }

   final Object[] c(int var1, int var2, int var3, int var4, int var5, int var6) {
      return null;
   }

   final native int[] Y(int var1, int var2, int var3, int var4);

   final void B() {}

   final native void T(int var1, int var2, int var3, int var4, int var5);

   final boolean j() {
      return false;
   }

   final Object[] h() {
      return this.Z;
   }

   final native void c(boolean var1);

   final boolean u() {
      return false;
   }

   final Object[] c() {
      return this.X;
   }

   final boolean D() {
      return false;
   }

   private final boolean sa(short var1) {
      synchronized(this) {
         Object[] var3 = this.k.a(var1, (byte)54);
         if(var3 == null) {
            return false;
         } else {
            this.la(var1, ((short[])((short[])var3[2]))[0], ((int[])((int[])var3[1]))[0], ((byte[])((byte[])var3[0]))[4], ((byte[])((byte[])var3[0]))[0], ((int[])((int[])var3[1]))[2], ((boolean[])((boolean[])var3[3]))[4], ((byte[])((byte[])var3[0]))[3], ((byte[])((byte[])var3[0]))[1], ((byte[])((byte[])var3[0]))[5], ((byte[])((byte[])var3[0]))[6], ((boolean[])((boolean[])var3[3]))[7], ((boolean[])((boolean[])var3[3]))[3], ((boolean[])((boolean[])var3[3]))[6], ((boolean[])((boolean[])var3[3]))[1], ((boolean[])((boolean[])var3[3]))[5], ((byte[])((byte[])var3[0]))[2], ((boolean[])((boolean[])var3[3]))[0], ((boolean[])((boolean[])var3[3]))[2], ((int[])((int[])var3[1]))[1]);
            return true;
         }
      }
   }

   final native void n(Class_c var1);

   final za a(int var1) {
      fa var2 = new fa(this, var1);
      client.a(111, this.f_gb, var2);
      return var2;
   }

   final native void j(int var1);

   final boolean y() {
      return true;
   }

   private final native void va(int var1, int var2, int var3, int var4);

   final void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.T(var1, var2, var3, var5, var6);
      this.T(var1, var2 + var4 - 1, var3, var5, var6);
      this.HA(var1, var2 + 1, var4 - 1, var5, var6);
      this.HA(var1 + var3 - 1, var2 + 1, var4 - 1, var5, var6);
   }

   final void t() {}

   final cga a(int var1, int var2, int var3, int var4, boolean var5) {
      return new ga(this, var1, var2, var3, var4, !var5);
   }

   final native void JA(int var1, int var2, int var3, int var4);

   private final native void W();

   final boolean m() {
      return true;
   }

   final void a(int var1, Object[] var2) {
      this.RA(var1, ((int[])((int[])var2[0]))[1], ((int[])((int[])var2[0]))[5], ((int[])((int[])var2[0]))[0]);
   }

   final void i() {}

   final void C() {
      if(!this.f_hb) {
         this.O = null;
         this.f_fb = null;
         this.S = null;
         ona.a(this.V, -58);

         for(fa var1 = (fa)dda.a(this.f_gb, 2); var1 != null; var1 = (fa)client.a(this.f_gb, -28280)) {
            var1.a();
         }

         nb.b(this.f_gb, 0);
         this.X();
         if(this.Y) {
            dla.a(false, 32396, true);
            this.Y = false;
         }

         this.l();
         lla.a((byte)-126);
         this.f_hb = true;
      }
   }

   final boolean A() {
      return false;
   }

   final boolean q() {
      return true;
   }

   final native void UA(float var1, float var2);

   final void b(int var1) {
      lla.a((int)2);
      this.ca(var1);

      for(fa var2 = (fa)dda.a(this.f_gb, 2); var2 != null; var2 = (fa)client.a(this.f_gb, -28280)) {
         var2.oa();
      }

   }

   final native void a();

   final void c(int var1) {
      this.O[var1].b();
   }

   final void b(Object[] var1) {}

   final aa a(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
      return new na(this, this.f_fb, var1, var2, var3, var4, var5, var6, var7);
   }

   final void a(int var1, Object[][] var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < var1; ++var4) {
         P[var3++] = lba.a(var2[var4], -25699);
         P[var3++] = sla.a(var2[var4], false);
         P[var3++] = fn.a(var2[var4], -95);
         P[var3++] = mc.a(false, var2[var4]);
         f_cb[var4] = sba.a(0, var2[var4]);
         P[var3++] = gaa.a(var2[var4], (byte)-69);
      }

      this.E(var1, P, f_cb);
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9, int var10, int var11, int var12) {}

   private final native void X();

   final void b(boolean var1) {}

   final boolean g() {
      return false;
   }

   private final boolean IA(short var1) {
      qa var2 = this.k;
      synchronized(this.k) {
         if(!this.k.a(-20460, (int)var1)) {
            return false;
         } else {
            Object[] var3 = this.k.a(var1, (byte)59);
            if(var3 == null) {
               return false;
            } else {
               int[] var4;
               if(((int[])((int[])var3[1]))[0] != 2) {
                  var4 = this.k.a(128, 0.7F, true, -6300, 128, var1);
               } else {
                  var4 = this.k.a(128, 0.7F, (byte)-87, 128, true, var1);
               }

               this.na(var1, var4, ((short[])((short[])var3[2]))[0], ((int[])((int[])var3[1]))[0], ((byte[])((byte[])var3[0]))[4], ((byte[])((byte[])var3[0]))[0], ((int[])((int[])var3[1]))[2], ((boolean[])((boolean[])var3[3]))[4], ((byte[])((byte[])var3[0]))[3], ((byte[])((byte[])var3[0]))[1], ((byte[])((byte[])var3[0]))[5], ((byte[])((byte[])var3[0]))[6], ((boolean[])((boolean[])var3[3]))[7], ((boolean[])((boolean[])var3[3]))[3], ((boolean[])((boolean[])var3[3]))[6], ((boolean[])((boolean[])var3[3]))[1], ((boolean[])((boolean[])var3[3]))[5], ((byte[])((byte[])var3[0]))[2], ((boolean[])((boolean[])var3[3]))[0], ((boolean[])((boolean[])var3[3]))[2], ((int[])((int[])var3[1]))[1]);
               return true;
            }
         }
      }
   }

   final void e(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.B(var1, var2, var3, var4, var5, var6);
   }

   private final void a(Object[] var1, boolean var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      Object[] var9 = (Object[])((Object[])var1[0]);
      va var10 = ((va)var9[1]).p;
      va var8;
      if(var9[1] == var10) {
         var9[0] = null;
         var8 = null;
      } else {
         var9[0] = var10.p;
         var8 = var10;
      }

      va var11;
      for(vsa var14 = (vsa)var8; var14 != null; var14 = (vsa)var11) {
         f_eb[var3++] = var14.B;
         f_eb[var3++] = var14.z;
         f_eb[var3++] = var14.v;
         M[var4++] = var14.A;
         f_nb[var6++] = (short)var14.x;
         f_kb[var5++] = var14.C;
         if(var2) {
            f_db[var7++] = var14.w;
         }

         Object[] var12 = (Object[])((Object[])var1[0]);
         va var13 = (va)var12[0];
         if(var13 == var12[1]) {
            var12[0] = null;
            var11 = null;
         } else {
            var11 = var13;
            var12[0] = var13.p;
         }
      }

   }

   final native void ra();

   public final native void o(boolean var1);

   final int a(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      float var8 = ((float[])((float[])this.Q[0]))[14] + ((float[])((float[])this.Q[0]))[2] * (float)var1 + ((float[])((float[])this.Q[0]))[6] * (float)var2 + ((float[])((float[])this.Q[0]))[10] * (float)var3;
      float var9 = ((float[])((float[])this.Q[0]))[14] + ((float[])((float[])this.Q[0]))[2] * (float)var4 + ((float[])((float[])this.Q[0]))[6] * (float)var5 + ((float[])((float[])this.Q[0]))[10] * (float)var6;
      float var10 = ((float[])((float[])this.Q[0]))[15] + ((float[])((float[])this.Q[0]))[3] * (float)var1 + ((float[])((float[])this.Q[0]))[7] * (float)var2 + ((float[])((float[])this.Q[0]))[11] * (float)var3;
      float var11 = ((float[])((float[])this.Q[0]))[15] + ((float[])((float[])this.Q[0]))[3] * (float)var4 + ((float[])((float[])this.Q[0]))[7] * (float)var5 + ((float[])((float[])this.Q[0]))[11] * (float)var6;
      if(var8 < -var10 && var9 < -var11) {
         var7 |= 16;
      } else if(var8 > var10 && var9 > var11) {
         var7 |= 32;
      }

      float var12 = ((float[])((float[])this.Q[0]))[12] + ((float[])((float[])this.Q[0]))[0] * (float)var1 + ((float[])((float[])this.Q[0]))[4] * (float)var2 + ((float[])((float[])this.Q[0]))[8] * (float)var3;
      float var13 = ((float[])((float[])this.Q[0]))[12] + ((float[])((float[])this.Q[0]))[0] * (float)var4 + ((float[])((float[])this.Q[0]))[4] * (float)var5 + ((float[])((float[])this.Q[0]))[8] * (float)var6;
      if(var12 < -var10 && var13 < -var11) {
         var7 |= 1;
      }

      if(var12 > var10 && var13 > var11) {
         var7 |= 2;
      }

      float var14 = ((float[])((float[])this.Q[0]))[13] + ((float[])((float[])this.Q[0]))[1] * (float)var1 + ((float[])((float[])this.Q[0]))[5] * (float)var2 + ((float[])((float[])this.Q[0]))[9] * (float)var3;
      float var15 = ((float[])((float[])this.Q[0]))[13] + ((float[])((float[])this.Q[0]))[1] * (float)var4 + ((float[])((float[])this.Q[0]))[5] * (float)var5 + ((float[])((float[])this.Q[0]))[9] * (float)var6;
      if(var14 < -var10 && var15 < -var11) {
         var7 |= 4;
      }

      if(var14 > var10 && var15 > var11) {
         var7 |= 8;
      }

      return var7;
   }

   private final native void k(int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9);

   final native void TA(int[] var1);

   final native void FA(int var1, float var2, float var3, float var4, float var5, float var6);

   final void e() {}

   final native void V(int var1, int var2, int var3, int var4);

   final native void ka(float var1);

   final ka a(ii var1, int var2, int var3, int var4, int var5) {
      return new Class_j(this, this.f_fb, var1, var2, var3, var4, var5);
   }

   final boolean d() {
      return true;
   }

   final native void g(int var1, int var2);

   private final native void B(int var1, int var2, int var3, int var4, int var5, int var6);

   private final native void AA(float[] var1);

   private final native void la(short var1, short var2, int var3, byte var4, byte var5, int var6, boolean var7, byte var8, byte var9, byte var10, byte var11, boolean var12, boolean var13, boolean var14, boolean var15, boolean var16, byte var17, boolean var18, boolean var19, int var20);

   final hsa f() {
      return new xa(this);
   }

   final native void HA(int var1, int var2, int var3, int var4, int var5);

   final native void p(int var1, int var2, int var3);

   private final native void q(qa var1, int var2, int var3);

   final Object[] k() {
      return this.R;
   }

   final re b(int var1, int var2) {
      return (ga)this.a(var1, var2, false, true);
   }

   final void h(int var1) {
      this.O[var1].d();
   }

   final boolean p() {
      return true;
   }

   final lua e(int var1, int var2) {
      return new Class_o(var1, var2);
   }

   private final void l() {
      System.gc();
      System.runFinalization();
      lla.a((int)2);
   }

   final Object[] v() {
      return this.S;
   }

   private final native void BA(float[] var1);

   final Object[] E() {
      return dda.a(1, 0L, new Object[4], 116, "CPU", "SSE", 0);
   }

   final void a(boolean var1) {}

   final void a(za var1) {
      this.f_fb = (fa)var1;
      this.fa(var1);
   }

   final void c(Object[] var1) {
      if(dma.a((byte)100, (Object[])((Object[])var1[0])) != 0) {
         this.a(var1, false);
         this.F().a(this, f_eb, M, f_kb, f_nb, dma.a((byte)95, (Object[])((Object[])var1[0])));
      }
   }

   final void a(int var1, int var2, int var3, int var4) {
      this.U = (float)var3 / 2.0F;
      this.f_ib = (float)var4 / 2.0F;
      this.N = (float)var1 + this.U;
      this.K = (float)var2 + this.f_ib;
      this.pa(var1, var2, var3, var4);
   }

   final void b() {
      this.U = (float)this.e(30626).e() / 2.0F;
      this.f_ib = (float)this.e(30626).d() / 2.0F;
      this.K = 0.0F;
      this.N = 0.0F;
      this.W();
   }

   final cga a(int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      return new ga(this, var1, var2, var3, var4, var5, false);
   }

   final boolean o() {
      return true;
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9) {
      this.k(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   final void a(Object[] var1) {
      this.Z = var1;
      this.AA((float[])((float[])this.Z[0]));
      jt.a(this.Z, this.L, 2, this.Q);
   }

   final ja a(Object[] var1, aea[] var2, boolean var3) {
      int[] var4 = new int[var2.length];
      int[] var5 = new int[var2.length];
      boolean var6 = false;

      for(int var7 = 0; var7 < var2.length; ++var7) {
         var4[var7] = var2[var7].a;
         var5[var7] = var2[var7].h;
         if(var2[var7].e != null) {
            var6 = true;
         }
      }

      if(var3) {
         if(var6) {
            return new Class_r(this, this.f_fb, var1, var2, (cga[])null);
         } else {
            return new ea(this, this.f_fb, var1, var2, (cga[])null);
         }
      } else if(var6) {
         throw new IllegalArgumentException("");
      } else {
         return new wa(this, this.f_fb, var1, var2, (cga[])null);
      }
   }

   final Object[] a(Object[] var1, Object[] var2, float var3, Object[] var4) {
      return null;
   }

   final void g(int var1) {
      this.T = var1;
      this.O = new sa[this.T];

      for(int var2 = 0; var2 < this.T; ++var2) {
         this.O[var2] = new sa(this, this.f_bb, this.f_ab);
      }

   }

   final void b(float var1, float var2, float var3, float[] var4) {
      float var5 = ((float[])((float[])this.Q[0]))[15] + ((float[])((float[])this.Q[0]))[3] * var1 + ((float[])((float[])this.Q[0]))[7] * var2 + ((float[])((float[])this.Q[0]))[11] * var3;
      float var6 = ((float[])((float[])this.Q[0]))[12] + ((float[])((float[])this.Q[0]))[0] * var1 + ((float[])((float[])this.Q[0]))[4] * var2 + ((float[])((float[])this.Q[0]))[8] * var3;
      float var7 = ((float[])((float[])this.Q[0]))[13] + ((float[])((float[])this.Q[0]))[1] * var1 + ((float[])((float[])this.Q[0]))[5] * var2 + ((float[])((float[])this.Q[0]))[9] * var3;
      float var8 = ((float[])((float[])this.L[0]))[14] + ((float[])((float[])this.L[0]))[2] * var1 + ((float[])((float[])this.L[0]))[6] * var2 + ((float[])((float[])this.L[0]))[10] * var3;
      var4[0] = this.N + this.U * var6 / var5;
      var4[1] = this.K + this.f_ib * var7 / var5;
      var4[2] = var8;
   }

   final native void r(int var1, int var2, int var3, int var4, int var5, int var6);

   final boolean w() {
      return true;
   }

   final boolean n() {
      return true;
   }

   final native void Z(int var1, int var2);

   private final Object U() {
      return new Class_u(this);
   }

   final void c(int var1, int var2) throws cr {
      Class_c var3 = (Class_c)this.i(-26586);
      if(var3 == null) {
         throw new IllegalStateException();
      } else {
         var3.a(var1, var2);
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {}

   final void a(float var1, float var2, float var3, float var4, float var5, float var6) {}

   final native void PA(int[] var1);

}
