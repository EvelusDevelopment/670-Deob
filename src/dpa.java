
final class dpa extends ka {

   private short f_ob;
   private short[] yb;
   private dpa[] f_qb;
   private int[] f_wb;
   private byte[] Bb;
   private dpa[] r;
   private short[] f_ib;
   private short f_bb;
   private short[] X;
   private int C = 0;
   private int[] A;
   private wc[] f_cb;
   private short[] Hb;
   private short q;
   private int[] w;
   private float[] J;
   private int u;
   private float[][] Cb;
   private int[] I;
   private int zb;
   private ifa[] f_vb;
   private int[] W;
   private float[] p;
   private int K = 0;
   private byte[] Q;
   private boolean Z = false;
   private wc[] N;
   private int Ib = 0;
   private Object[] f_rb;
   private int f_ub;
   private short f_db;
   static int z = 4096;
   private Object[] v;
   private short f_jb;
   private int[][] F;
   private short f_kb;
   private int E;
   private byte[] t;
   private int[][] D;
   private boolean S = false;
   private boolean B = false;
   private static int x = 0;
   private int[] O;
   private short[] f_gb;
   private boolean xb = false;
   private short f_nb;
   private boolean f_eb = false;
   private short[] Lb;
   private Object[][] y;
   private int[] Gb;
   private int f_fb = 0;
   private int[] M;
   private Object[][] s;
   private short Y;
   private short[] f_ab;
   private Object[] Eb;
   private float[][] H;
   private int[] P;
   private float[] f_sb;
   private float[] Ab;
   private int[] Db;
   private boolean Jb = false;
   private short[] f_tb;
   private int[][] Kb;
   private int R;
   private uo f_hb;
   private Object[][] V;
   private int L;
   private int[] f_lb;
   private int[] f_pb;
   private Object[][] T;
   static int G = 4096;
   private boolean U;
   private int[] Fb;
   private int f_mb;


   private final void r(int var1) {
      short var2 = this.Hb[var1];
      short var3 = this.f_ib[var1];
      short var4 = this.yb[var1];
      if(this.Lb != null && this.Lb[var1] != -1) {
         int var5 = -16777216;
         if(this.t != null) {
            var5 = 255 - (this.t[var1] & 255) << 24;
         }

         if(this.W[var1] == -1) {
            int var6 = var5 | this.M[var1] & 16777215;
            this.f_hb.g(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var6, var6, var6, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         } else {
            this.f_hb.g(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var5 | this.M[var1] & 16777215, var5 | this.Gb[var1] & 16777215, var5 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         }
      } else {
         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.W[var1] == -1) {
            this.f_hb.h(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], en.c[this.M[var1] & '\uffff']);
         } else {
            this.f_hb.g(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], (float)(this.M[var1] & '\uffff'), (float)(this.Gb[var1] & '\uffff'), (float)(this.W[var1] & '\uffff'));
         }
      }

   }

   final void a(Object[] var1, int var2, boolean var3) {
      if(this.f_ab != null) {
         Object[] var4 = ui.a(this.f_rb, (Runnable)Thread.currentThread());
         Object[] var5 = (Object[])((Object[])var4[16]);
         lg.a(var5, var1, -18072);
         if(var3) {
            kj.a(true, var5);
         }

         Object[] var6 = (Object[])((Object[])var4[27]);
         aqa.a(true, var5, var6);
         float[] var7 = new float[3];

         for(int var8 = 0; var8 < this.C; ++var8) {
            if((var2 & this.f_ab[var8]) != 0) {
               jn.a((float)this.A[var8], (float)this.I[var8], var7, var6, true, (float)this.O[var8]);
               this.A[var8] = (int)var7[0];
               this.I[var8] = (int)var7[1];
               this.O[var8] = (int)var7[2];
            }
         }

      }
   }

   private final boolean a(int var1, int var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      return (float)var2 < var3 && (float)var2 < var4 && (float)var2 < var5?false:((float)var2 > var3 && (float)var2 > var4 && (float)var2 > var5?false:((float)var1 < var6 && (float)var1 < var7 && (float)var1 < var8?false:(float)var1 <= var6 || (float)var1 <= var7 || (float)var1 <= var8));
   }

   private final void l() {
      synchronized(this) {
         int var2;
         for(var2 = 0; var2 < this.C; ++var2) {
            this.A[var2] = -this.A[var2];
            this.O[var2] = -this.O[var2];
            if(this.N[var2] != null) {
               this.N[var2].d = -this.N[var2].d;
               this.N[var2].b = -this.N[var2].b;
            }
         }

         if(this.f_vb != null) {
            for(var2 = 0; var2 < this.K; ++var2) {
               if(this.f_vb[var2] != null) {
                  this.f_vb[var2].a = -this.f_vb[var2].a;
                  this.f_vb[var2].c = -this.f_vb[var2].c;
               }
            }
         }

         for(var2 = this.C; var2 < this.Ib; ++var2) {
            this.A[var2] = -this.A[var2];
            this.O[var2] = -this.O[var2];
         }

         this.f_fb = 0;
         this.xb = false;
      }
   }

   private final void m(int var1) {
      short var2;
      short var3;
      short var4;
      float var6;
      float var7;
      if(!((boolean[])((boolean[])this.Eb[2]))[2]) {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         Object[] var5 = (Object[])((Object[])this.f_rb[13]);
         var6 = ((float[])((float[])var5[0]))[10];
         var7 = ((float[])((float[])var5[0]))[14];
         float var8 = ((float[])((float[])var5[0]))[11];
         float var9 = ((float[])((float[])var5[0]))[15];
         float var10 = var7 * var8 - var6 * var9;
         float var11 = (this.f_sb[var2] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var12 = (this.f_sb[var3] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var13 = (this.f_sb[var4] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var14 = var11 * var10 / (var11 * var8 - var6);
         float var15 = var12 * var10 / (var12 * var8 - var6);
         float var16 = var13 * var10 / (var13 * var8 - var6);
         float var17 = (var14 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var17 > 1.0F) {
            var17 = 1.0F;
         } else if(var17 < 0.0F) {
            var17 = 0.0F;
         }

         float var18 = (var15 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var18 > 1.0F) {
            var18 = 1.0F;
         } else if(var18 < 0.0F) {
            var18 = 0.0F;
         }

         float var19 = (var16 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var19 > 1.0F) {
            var19 = 1.0F;
         } else if(var19 < 0.0F) {
            var19 = 0.0F;
         }

         float var20 = var17 + var18 + var19;
         if(var20 >= 3.0F) {
            return;
         }

         if(var20 <= 0.0F) {
            this.h(var1);
            return;
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var21 = -16777216;
            if(this.t != null) {
               var21 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var22 = var21 | this.M[var1] & 16777215;
               this.f_hb.d(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var22, var22, var22, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.d(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var21 | this.M[var1] & 16777215, var21 | this.Gb[var1] & 16777215, var21 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.g(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 65, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 59, var18 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 54, var19 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.g(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 93, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 90, var18 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 69, var19 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      } else {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         float var23 = 0.0F;
         var6 = 0.0F;
         var7 = 0.0F;
         if(this.w[var2] > ((int[])((int[])this.Eb[1]))[3]) {
            var23 = 1.0F;
         } else if(this.w[var2] > ((int[])((int[])this.Eb[1]))[2]) {
            var23 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var2]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var3] > ((int[])((int[])this.Eb[1]))[3]) {
            var6 = 1.0F;
         } else if(this.w[var3] > ((int[])((int[])this.Eb[1]))[2]) {
            var6 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var3]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var4] > ((int[])((int[])this.Eb[1]))[3]) {
            var7 = 1.0F;
         } else if(this.w[var4] > ((int[])((int[])this.Eb[1]))[2]) {
            var7 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var4]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var24 = -16777216;
            if(this.t != null) {
               var24 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var25 = var24 | this.M[var1] & 16777215;
               this.f_hb.d(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var25, var25, var25, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.d(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var24 | this.M[var1] & 16777215, var24 | this.Gb[var1] & 16777215, var24 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.g(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 90, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 117, var6 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 116, var7 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.g(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 107, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 112, var6 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 94, var7 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      }

   }

   private final void f(boolean var1, boolean var2) {
      int var3;
      Object[] var4;
      if(this.s != null) {
         for(var3 = 0; var3 < this.f_mb; this.f_lb[((int[])((int[])var4[1]))[0]] = var3++) {
            var4 = this.s[var3];
         }
      }

      if(!this.B && this.s == null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            this.c(var3, var1, var2);
         }
      } else if((this.R & 256) == 0 && this.f_gb != null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            short var6 = this.f_gb[var3];
            this.c(var6, var1, var2);
         }
      } else {
         for(var3 = 0; var3 < this.K; ++var3) {
            if(!this.f(var3) && !this.e(var3)) {
               this.c(var3, var1, var2);
            }
         }

         if(this.Bb == null) {
            for(var3 = 0; var3 < this.K; ++var3) {
               if(this.f(var3) || this.e(var3)) {
                  this.c(var3, var1, var2);
               }
            }
         } else {
            for(var3 = 0; var3 < 12; ++var3) {
               for(int var5 = 0; var5 < this.K; ++var5) {
                  if(this.Bb[var5] == var3 && (this.f(var5) || this.e(var5))) {
                     this.c(var5, var1, var2);
                  }
               }
            }
         }
      }

   }

   final int N() {
      if(!this.xb) {
         this.p();
      }

      return this.q;
   }

   final void W(int var1) {
      if((this.R & 4096) != 4096) {
         throw new IllegalStateException();
      } else {
         this.E = var1;
         this.f_fb = 0;
      }
   }

   private final void i(int var1) {
      short var2 = this.Hb[var1];
      short var3 = this.f_ib[var1];
      short var4 = this.yb[var1];
      if(this.Lb != null && this.Lb[var1] != -1) {
         int var5 = -16777216;
         if(this.t != null) {
            var5 = 255 - (this.t[var1] & 255) << 24;
         }

         if(this.W[var1] == -1) {
            int var6 = var5 | this.M[var1] & 16777215;
            this.f_hb.e(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var6, var6, var6, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         } else {
            this.f_hb.e(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var5 | this.M[var1] & 16777215, var5 | this.Gb[var1] & 16777215, var5 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         }
      } else {
         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.W[var1] == -1) {
            this.f_hb.a(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], en.c[this.M[var1] & '\uffff']);
         } else {
            this.f_hb.d(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], (float)(this.M[var1] & '\uffff'), (float)(this.Gb[var1] & '\uffff'), (float)(this.W[var1] & '\uffff'));
         }
      }

   }

   private final void c(boolean var1, boolean var2) {
      int var3;
      Object[] var4;
      if(this.s != null) {
         for(var3 = 0; var3 < this.f_mb; this.f_lb[((int[])((int[])var4[1]))[0]] = var3++) {
            var4 = this.s[var3];
         }
      }

      if(!this.B && this.s == null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            this.d(var3, var1, var2);
         }
      } else if((this.R & 256) == 0 && this.f_gb != null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            short var6 = this.f_gb[var3];
            this.d(var6, var1, var2);
         }
      } else {
         for(var3 = 0; var3 < this.K; ++var3) {
            if(!this.f(var3) && !this.e(var3)) {
               this.d(var3, var1, var2);
            }
         }

         if(this.Bb == null) {
            for(var3 = 0; var3 < this.K; ++var3) {
               if(this.f(var3) || this.e(var3)) {
                  this.d(var3, var1, var2);
               }
            }
         } else {
            for(var3 = 0; var3 < 12; ++var3) {
               for(int var5 = 0; var5 < this.K; ++var5) {
                  if(this.Bb[var5] == var3 && (this.f(var5) || this.e(var5))) {
                     this.d(var5, var1, var2);
                  }
               }
            }
         }
      }

   }

   final boolean QA() {
      if(this.F == null) {
         return false;
      } else {
         this.zb = 0;
         this.f_ub = 0;
         this.u = 0;
         return true;
      }
   }

   final void I(byte var1, byte[] var2) {
      if((this.R & 1048576) == 0) {
         throw new RuntimeException();
      } else {
         if(this.t == null) {
            this.t = new byte[this.K];
         }

         int var3;
         if(var2 == null) {
            for(var3 = 0; var3 < this.K; ++var3) {
               this.t[var3] = var1;
            }
         } else {
            for(var3 = 0; var3 < this.K; ++var3) {
               int var4 = 255 - (255 - (var2[var3] & 255)) * (255 - (var1 & 255)) / 255;
               this.t[var3] = (byte)var4;
            }
         }

         if(this.f_fb == 2) {
            this.f_fb = 1;
         }

      }
   }

   final int pa() {
      if(!this.xb) {
         this.p();
      }

      return this.f_nb;
   }

   private final void h(int var1, boolean var2, boolean var3) {
      if(this.W[var1] != -2) {
         short var4 = this.Hb[var1];
         short var5 = this.f_ib[var1];
         short var6 = this.yb[var1];
         float var7 = this.p[var4];
         float var8 = this.p[var5];
         float var9 = this.p[var6];
         if(!var2 || var7 != -5000.0F && var8 != -5000.0F && var9 != -5000.0F) {
            float var10 = this.Ab[var4];
            float var11 = this.Ab[var5];
            float var12 = this.Ab[var6];
            if(this.f_lb[var1] != -1 || (var7 - var8) * (var12 - var11) - (var10 - var11) * (var9 - var8) > 0.0F) {
               if(var7 >= 0.0F && var8 >= 0.0F && var9 >= 0.0F && var7 <= (float)((int[])((int[])this.Eb[1]))[4] && var8 <= (float)((int[])((int[])this.Eb[1]))[4] && var9 <= (float)((int[])((int[])this.Eb[1]))[4]) {
                  this.f_hb.c = false;
               } else {
                  this.f_hb.c = true;
               }

               int var13;
               if(var3) {
                  var13 = this.f_lb[var1];
                  if(var13 == -1 || !((boolean[])((boolean[])this.s[var13][3]))[0]) {
                     this.j(var1);
                  }
               } else {
                  var13 = this.f_lb[var1];
                  if(var13 != -1) {
                     Object[] var14 = this.s[var13];
                     Object[] var15 = this.V[var13];
                     if(!((boolean[])((boolean[])var14[3]))[0]) {
                        this.t(var1);
                     }

                     ui.b(((int[])((int[])var15[1]))[5], ((int[])((int[])var15[1]))[2], ((float[])((float[])var15[0]))[0], ((int[])((int[])var15[1]))[4], ((int[])((int[])var15[1]))[7], ((short[])((short[])var14[0]))[2] & '\uffff', ((int[])((int[])var15[1]))[3], ((byte[])((byte[])var14[2]))[0], ((byte[])((byte[])var14[2]))[1], this.f_rb);
                  } else {
                     this.t(var1);
                  }
               }
            }

         }
      }
   }

   private final void s(int var1) {
      short var2 = this.Hb[var1];
      short var3 = this.f_ib[var1];
      short var4 = this.yb[var1];
      if(this.Lb != null && this.Lb[var1] != -1) {
         int var5 = -16777216;
         if(this.t != null) {
            var5 = 255 - (this.t[var1] & 255) << 24;
         }

         if(this.W[var1] == -1) {
            int var6 = var5 | this.M[var1] & 16777215;
            this.f_hb.h(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var6, var6, var6, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         } else {
            this.f_hb.h(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var5 | this.M[var1] & 16777215, var5 | this.Gb[var1] & 16777215, var5 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         }
      } else {
         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.W[var1] == -1) {
            this.f_hb.e(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], en.c[this.M[var1] & '\uffff']);
         } else {
            this.f_hb.a(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], (float)(this.M[var1] & '\uffff'), (float)(this.Gb[var1] & '\uffff'), (float)(this.W[var1] & '\uffff'));
         }
      }

   }

   private final void p() {
      if(!this.xb) {
         int var1 = 0;
         int var2 = 0;
         int var3 = 32767;
         int var4 = 32767;
         int var5 = 32767;
         int var6 = -32768;
         int var7 = -32768;
         int var8 = -32768;

         for(int var9 = 0; var9 < this.C; ++var9) {
            int var10 = this.A[var9];
            int var11 = this.I[var9];
            int var12 = this.O[var9];
            if(var10 < var3) {
               var3 = var10;
            }

            if(var10 > var6) {
               var6 = var10;
            }

            if(var11 < var4) {
               var4 = var11;
            }

            if(var11 > var7) {
               var7 = var11;
            }

            if(var12 < var5) {
               var5 = var12;
            }

            if(var12 > var8) {
               var8 = var12;
            }

            int var13 = var10 * var10 + var12 * var12;
            if(var13 > var1) {
               var1 = var13;
            }

            var13 += var11 * var11;
            if(var13 > var2) {
               var2 = var13;
            }
         }

         this.f_jb = (short)var3;
         this.f_bb = (short)var6;
         this.f_nb = (short)var4;
         this.q = (short)var7;
         this.f_db = (short)var5;
         this.f_ob = (short)var8;
         this.Y = (short)((int)(Math.sqrt((double)var1) + 0.99D));
         this.f_kb = (short)((int)(Math.sqrt((double)var2) + 0.99D));
         this.xb = true;
      }
   }

   private final void p(int var1) {
      short var2;
      short var3;
      short var4;
      float var6;
      float var7;
      if(!((boolean[])((boolean[])this.Eb[2]))[2]) {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         Object[] var5 = (Object[])((Object[])this.f_rb[13]);
         var6 = ((float[])((float[])var5[0]))[10];
         var7 = ((float[])((float[])var5[0]))[14];
         float var8 = ((float[])((float[])var5[0]))[11];
         float var9 = ((float[])((float[])var5[0]))[15];
         float var10 = var7 * var8 - var6 * var9;
         float var11 = (this.f_sb[var2] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var12 = (this.f_sb[var3] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var13 = (this.f_sb[var4] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var14 = var11 * var10 / (var11 * var8 - var6);
         float var15 = var12 * var10 / (var12 * var8 - var6);
         float var16 = var13 * var10 / (var13 * var8 - var6);
         float var17 = (var14 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var17 > 1.0F) {
            var17 = 1.0F;
         } else if(var17 < 0.0F) {
            var17 = 0.0F;
         }

         float var18 = (var15 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var18 > 1.0F) {
            var18 = 1.0F;
         } else if(var18 < 0.0F) {
            var18 = 0.0F;
         }

         float var19 = (var16 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var19 > 1.0F) {
            var19 = 1.0F;
         } else if(var19 < 0.0F) {
            var19 = 0.0F;
         }

         float var20 = var17 + var18 + var19;
         if(var20 >= 3.0F) {
            return;
         }

         if(var20 <= 0.0F) {
            this.s(var1);
            return;
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var21 = -16777216;
            if(this.t != null) {
               var21 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var22 = var21 | this.M[var1] & 16777215;
               this.f_hb.h(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var22, var22, var22, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.h(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var21 | this.M[var1] & 16777215, var21 | this.Gb[var1] & 16777215, var21 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.a(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 72, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 87, var18 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 109, var19 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.a(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 60, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 114, var18 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 103, var19 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      } else {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         float var23 = 0.0F;
         var6 = 0.0F;
         var7 = 0.0F;
         if(this.w[var2] > ((int[])((int[])this.Eb[1]))[3]) {
            var23 = 1.0F;
         } else if(this.w[var2] > ((int[])((int[])this.Eb[1]))[2]) {
            var23 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var2]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var3] > ((int[])((int[])this.Eb[1]))[3]) {
            var6 = 1.0F;
         } else if(this.w[var3] > ((int[])((int[])this.Eb[1]))[2]) {
            var6 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var3]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var4] > ((int[])((int[])this.Eb[1]))[3]) {
            var7 = 1.0F;
         } else if(this.w[var4] > ((int[])((int[])this.Eb[1]))[2]) {
            var7 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var4]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var24 = -16777216;
            if(this.t != null) {
               var24 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var25 = var24 | this.M[var1] & 16777215;
               this.f_hb.h(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var25, var25, var25, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.h(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var24 | this.M[var1] & 16777215, var24 | this.Gb[var1] & 16777215, var24 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.a(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 55, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 71, var6 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 124, var7 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.a(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 112, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 71, var6 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 120, var7 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      }

   }

   final void a(Object[] var1, lpa var2, int var3) {
      this.b(var1, var2, var3);
   }

   final ya p(ya var1) {
      return null;
   }

   final int ga() {
      return this.L;
   }

   final void K(int var1, int var2, int var3) {
      if(var1 != 0 && (this.R & 1) != 1) {
         throw new IllegalStateException();
      } else if(var2 != 0 && (this.R & 2) != 2) {
         throw new IllegalStateException();
      } else if(var3 != 0 && (this.R & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.Ib; ++var5) {
               this.A[var5] += var1;
               this.I[var5] += var2;
               this.O[var5] += var3;
            }

         }
      }
   }

   final Object[][] b() {
      return this.T;
   }

   final int LA() {
      if(!this.xb) {
         this.p();
      }

      return this.f_jb;
   }

   final void DA(short var1, short var2) {
      if(this.Lb != null) {
         if(!this.f_eb && var2 >= 0) {
            Object[] var3 = this.f_rb;
            Object[] var4 = ((ta)(this.f_rb == null?null:var3[6])).k.a(var2 & '\uffff', (byte)104);
            if(((byte[])((byte[])var4[0]))[5] != 0 || ((byte[])((byte[])var4[0]))[6] != 0) {
               this.f_eb = true;
            }
         }

         for(int var5 = 0; var5 < this.K; ++var5) {
            if(this.Lb[var5] == var1) {
               this.Lb[var5] = var2;
            }
         }

      }
   }

   final void O(int var1) {
      if((this.R & 5) != 5) {
         throw new IllegalStateException();
      } else if(var1 == 4096) {
         this.g();
      } else if(var1 == 8192) {
         this.k();
      } else if(var1 == 12288) {
         this.n();
      } else {
         int var2 = tda.p[var1];
         int var3 = tda.k[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.Ib; ++var5) {
               int var6 = this.O[var5] * var2 + this.A[var5] * var3 >> 14;
               this.O[var5] = this.O[var5] * var3 - this.A[var5] * var2 >> 14;
               this.A[var5] = var6;
            }

            this.o();
         }
      }
   }

   private final void g(int var1, boolean var2, boolean var3) {
      if(this.W[var1] != -2) {
         short var4 = this.Hb[var1];
         short var5 = this.f_ib[var1];
         short var6 = this.yb[var1];
         float var7 = this.p[var4];
         float var8 = this.p[var5];
         float var9 = this.p[var6];
         if(!var2 || var7 != -5000.0F && var8 != -5000.0F && var9 != -5000.0F) {
            float var10 = this.Ab[var4];
            float var11 = this.Ab[var5];
            float var12 = this.Ab[var6];
            if(this.f_lb[var1] != -1 || (var7 - var8) * (var12 - var11) - (var10 - var11) * (var9 - var8) > 0.0F) {
               if(var7 >= 0.0F && var8 >= 0.0F && var9 >= 0.0F && var7 <= (float)((int[])((int[])this.Eb[1]))[4] && var8 <= (float)((int[])((int[])this.Eb[1]))[4] && var9 <= (float)((int[])((int[])this.Eb[1]))[4]) {
                  this.f_hb.c = false;
               } else {
                  this.f_hb.c = true;
               }

               int var13;
               if(var3) {
                  var13 = this.f_lb[var1];
                  if(var13 == -1 || !((boolean[])((boolean[])this.s[var13][3]))[0]) {
                     this.d(var1);
                  }
               } else {
                  var13 = this.f_lb[var1];
                  if(var13 != -1) {
                     Object[] var14 = this.s[var13];
                     Object[] var15 = this.V[var13];
                     if(!((boolean[])((boolean[])var14[3]))[0]) {
                        this.g(var1);
                     }

                     ui.e(((int[])((int[])var15[1]))[5], ((int[])((int[])var15[1]))[2], ((float[])((float[])var15[0]))[0], ((int[])((int[])var15[1]))[4], ((int[])((int[])var15[1]))[7], ((short[])((short[])var14[0]))[2] & '\uffff', ((int[])((int[])var15[1]))[3], ((byte[])((byte[])var14[2]))[0], ((byte[])((byte[])var14[2]))[1], this.f_rb);
                  } else {
                     this.g(var1);
                  }
               }
            }

         }
      }
   }

   private final void h(boolean var1, boolean var2) {
      int var3;
      Object[] var4;
      if(this.s != null) {
         for(var3 = 0; var3 < this.f_mb; this.f_lb[((int[])((int[])var4[1]))[0]] = var3++) {
            var4 = this.s[var3];
         }
      }

      if(!this.B && this.s == null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            this.a(var3, var1, var2);
         }
      } else if((this.R & 256) == 0 && this.f_gb != null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            short var6 = this.f_gb[var3];
            this.a(var6, var1, var2);
         }
      } else {
         for(var3 = 0; var3 < this.K; ++var3) {
            if(!this.f(var3) && !this.e(var3)) {
               this.a(var3, var1, var2);
            }
         }

         if(this.Bb == null) {
            for(var3 = 0; var3 < this.K; ++var3) {
               if(this.f(var3) || this.e(var3)) {
                  this.a(var3, var1, var2);
               }
            }
         } else {
            for(var3 = 0; var3 < 12; ++var3) {
               for(int var5 = 0; var5 < this.K; ++var5) {
                  if(this.Bb[var5] == var3 && (this.f(var5) || this.e(var5))) {
                     this.a(var5, var1, var2);
                  }
               }
            }
         }
      }

   }

   final void G(int var1) {
      if(((int[])((int[])this.f_rb[1]))[10] > 1) {
         synchronized(this) {
            if((this.R & 65536) == 65536 && (var1 & 65536) == 0) {
               this.b(true);
            }

            this.R = var1;
         }
      } else {
         if((this.R & 65536) == 65536 && (var1 & 65536) == 0) {
            this.b(true);
         }

         this.R = var1;
      }

   }

   private final void n() {
      synchronized(this) {
         for(int var2 = 0; var2 < this.Ib; ++var2) {
            int var3 = this.O[var2];
            this.O[var2] = this.A[var2];
            this.A[var2] = -var3;
         }

         this.o();
      }
   }

   private final void f(int var1, boolean var2, boolean var3) {
      if(this.W[var1] != -2) {
         short var4 = this.Hb[var1];
         short var5 = this.f_ib[var1];
         short var6 = this.yb[var1];
         float var7 = this.p[var4];
         float var8 = this.p[var5];
         float var9 = this.p[var6];
         if(!var2 || var7 != -5000.0F && var8 != -5000.0F && var9 != -5000.0F) {
            float var10 = this.Ab[var4];
            float var11 = this.Ab[var5];
            float var12 = this.Ab[var6];
            if(this.f_lb[var1] != -1 || (var7 - var8) * (var12 - var11) - (var10 - var11) * (var9 - var8) > 0.0F) {
               if(var7 >= 0.0F && var8 >= 0.0F && var9 >= 0.0F && var7 <= (float)((int[])((int[])this.Eb[1]))[4] && var8 <= (float)((int[])((int[])this.Eb[1]))[4] && var9 <= (float)((int[])((int[])this.Eb[1]))[4]) {
                  this.f_hb.c = false;
               } else {
                  this.f_hb.c = true;
               }

               int var13;
               if(var3) {
                  var13 = this.f_lb[var1];
                  if(var13 == -1 || !((boolean[])((boolean[])this.s[var13][3]))[0]) {
                     this.c(var1);
                  }
               } else {
                  var13 = this.f_lb[var1];
                  if(var13 != -1) {
                     Object[] var14 = this.s[var13];
                     Object[] var15 = this.V[var13];
                     if(!((boolean[])((boolean[])var14[3]))[0]) {
                        this.q(var1);
                     }

                     ui.a(((int[])((int[])var15[1]))[5], ((int[])((int[])var15[1]))[2], ((float[])((float[])var15[0]))[0], ((int[])((int[])var15[1]))[4], ((int[])((int[])var15[1]))[7], ((short[])((short[])var14[0]))[2] & '\uffff', ((int[])((int[])var15[1]))[3], ((byte[])((byte[])var14[2]))[0], ((byte[])((byte[])var14[2]))[1], this.f_rb);
                  } else {
                     this.q(var1);
                  }
               }
            }

         }
      }
   }

   final void e() {
      if(((int[])((int[])this.f_rb[1]))[10] > 1) {
         synchronized(this) {
            this.f = false;
            this.notifyAll();
         }
      }

   }

   private final ka a(dpa var1, dpa var2, int var3, boolean var4, boolean var5) {
      var1.xb = this.xb;
      if(this.xb) {
         var1.f_bb = this.f_bb;
         var1.q = this.q;
         var1.f_ob = this.f_ob;
         var1.f_jb = this.f_jb;
         var1.f_nb = this.f_nb;
         var1.f_db = this.f_db;
         var1.Y = this.Y;
         var1.f_kb = this.f_kb;
      }

      var1.E = this.E;
      var1.L = this.L;
      var1.Ib = this.Ib;
      var1.C = this.C;
      var1.K = this.K;
      var1.f_mb = this.f_mb;
      if((var3 & 256) != 0) {
         var1.B = true;
      } else {
         var1.B = this.B;
      }

      var1.f_eb = this.f_eb;
      boolean var6 = (var3 & 7) == 7 | (var3 & 32) != 0;
      boolean var7 = var6 || (var3 & 1) != 0;
      boolean var8 = var6 || (var3 & 2) != 0;
      boolean var9 = var6 || (var3 & 4) != 0 || (var3 & 16) != 0;
      int var10;
      if(!var7 && !var8 && !var9) {
         var1.A = this.A;
         var1.I = this.I;
         var1.O = this.O;
      } else {
         if(var7) {
            if(var2.A != null && var2.A.length >= this.Ib) {
               var1.A = var2.A;
            } else {
               var1.A = var2.A = new int[this.Ib];
            }

            for(var10 = 0; var10 < this.Ib; ++var10) {
               var1.A[var10] = this.A[var10];
            }
         } else {
            var1.A = this.A;
         }

         if(var8) {
            if(var2.I != null && var2.I.length >= this.Ib) {
               var1.I = var2.I;
            } else {
               var1.I = var2.I = new int[this.Ib];
            }

            for(var10 = 0; var10 < this.Ib; ++var10) {
               var1.I[var10] = this.I[var10];
            }
         } else {
            var1.I = this.I;
         }

         if(var9) {
            if(var2.O != null && var2.O.length >= this.Ib) {
               var1.O = var2.O;
            } else {
               var1.O = var2.O = new int[this.Ib];
            }

            for(var10 = 0; var10 < this.Ib; ++var10) {
               var1.O[var10] = this.O[var10];
            }
         } else {
            var1.O = this.O;
         }
      }

      if((var3 & 540800) != 0) {
         if(var2.f_tb != null && var2.f_tb.length >= this.K) {
            var1.f_tb = var2.f_tb;
         } else {
            var10 = this.K;
            var1.f_tb = var2.f_tb = new short[var10];
         }

         for(var10 = 0; var10 < this.K; ++var10) {
            var1.f_tb[var10] = this.f_tb[var10];
         }
      } else {
         var1.f_tb = this.f_tb;
      }

      if((var3 & 618520) != 0) {
         var1.f_fb = 0;
         var1.W = null;
         var1.Gb = null;
         var1.M = null;
      } else if((var3 & 128) != 0) {
         if(var5) {
            this.b(false);
         }

         if(this.M != null) {
            if(var2.M != null && var2.M.length >= this.K) {
               var1.M = var2.M;
               var1.Gb = var2.Gb;
               var1.W = var2.W;
            } else {
               var10 = this.K;
               var1.M = var2.M = new int[var10];
               var1.Gb = var2.Gb = new int[var10];
               var1.W = var2.W = new int[var10];
            }

            for(var10 = 0; var10 < this.K; ++var10) {
               var1.M[var10] = this.M[var10];
               var1.Gb[var10] = this.Gb[var10];
               var1.W[var10] = this.W[var10];
            }
         }

         var1.f_fb = this.f_fb;
      } else {
         if(var5) {
            this.b(false);
         }

         var1.M = this.M;
         var1.Gb = this.Gb;
         var1.W = this.W;
         var1.f_fb = this.f_fb;
      }

      if((var3 & 256) != 0) {
         if(var2.t != null && var2.t.length >= this.K) {
            var1.t = var2.t;
         } else {
            var10 = this.K;
            var1.t = var2.t = new byte[var10];
         }

         if(this.t != null) {
            for(var10 = 0; var10 < this.K; ++var10) {
               var1.t[var10] = this.t[var10];
            }
         } else {
            for(var10 = 0; var10 < this.K; ++var10) {
               var1.t[var10] = 0;
            }
         }
      } else {
         var1.t = this.t;
      }

      if((var3 & 8) == 0 && (var3 & 16) == 0) {
         if(var5) {
            this.s();
         }

         var1.N = this.N;
         var1.f_vb = this.f_vb;
      } else {
         if(var2.N != null && var2.N.length >= this.C) {
            var1.N = var2.N;
         } else {
            var10 = this.C;
            var1.N = var2.N = new wc[var10];
         }

         if(this.N != null) {
            for(var10 = 0; var10 < this.C; ++var10) {
               var1.N[var10] = new wc(this.N[var10]);
            }
         } else {
            var1.N = null;
         }

         if(this.f_vb != null) {
            if(var2.f_vb != null && var2.f_vb.length >= this.K) {
               var1.f_vb = var2.f_vb;
            } else {
               var10 = this.K;
               var1.f_vb = var2.f_vb = new ifa[var10];
            }

            for(var10 = 0; var10 < this.K; ++var10) {
               var1.f_vb[var10] = this.f_vb[var10] != null?new ifa(this.f_vb[var10]):null;
            }
         } else {
            var1.f_vb = null;
         }
      }

      if((var3 & '\u8000') != 0) {
         if(this.Lb == null) {
            var1.Lb = null;
         } else {
            if(var2.Lb != null && var2.Lb.length >= this.K) {
               var1.Lb = var2.Lb;
            } else {
               var10 = this.K;
               var1.Lb = var2.Lb = new short[var10];
            }

            for(var10 = 0; var10 < this.K; ++var10) {
               var1.Lb[var10] = this.Lb[var10];
            }
         }
      } else {
         var1.Lb = this.Lb;
      }

      if((var3 & 65536) != 0) {
         if(this.Q == null) {
            var1.Q = null;
         } else {
            if(var2.Q != null && var2.Q.length >= this.K) {
               var1.Q = var2.Q;
            } else {
               var10 = var4?this.K + 100:this.K;
               var1.Q = var2.Q = new byte[var10];
            }

            for(var10 = 0; var10 < this.K; ++var10) {
               var1.Q[var10] = this.Q[var10];
            }
         }
      } else {
         var1.Q = this.Q;
      }

      if((var3 & '\uc580') != 0) {
         if(var2.V != null && var2.V.length >= this.f_mb) {
            var1.V = var2.V;

            for(var10 = 0; var10 < this.f_mb; ++var10) {
               Object[] var25 = var1.V[var10];
               Object[] var24 = this.V[var10];
               ((int[])((int[])var25[1]))[1] = ((int[])((int[])var24[1]))[1];
               ((int[])((int[])var25[1]))[0] = ((int[])((int[])var24[1]))[0];
               ((float[])((float[])var25[0]))[1] = ((float[])((float[])var24[0]))[1];
               ((int[])((int[])var25[1]))[6] = ((int[])((int[])var24[1]))[6];
               ((int[])((int[])var25[1]))[3] = ((int[])((int[])var24[1]))[3];
               ((float[])((float[])var25[0]))[2] = ((float[])((float[])var24[0]))[2];
            }
         } else {
            var10 = this.f_mb;
            var1.V = var2.V = new Object[var10][];

            for(int var11 = 0; var11 < this.f_mb; ++var11) {
               Object[][] var12 = var1.V;
               Object[] var15 = this.V[var11];
               Object[] var17 = new Object[2];
               int var18 = ((int[])((int[])var15[1]))[3];
               float var19 = ((float[])((float[])var15[0]))[2];
               if(null != var17 && -16 == ~var17.length && var17[1].equals(Integer.valueOf(0))) {
                  this.a(56, 5);
               }

               float var20 = ((float[])((float[])var15[0]))[1];
               int var21 = ((int[])((int[])var15[1]))[1];
               int var22 = ((int[])((int[])var15[1]))[6];
               int var23 = ((int[])((int[])var15[1]))[0];
               if(null == var17[1]) {
                  var17[1] = new int[8];
               }

               if(null == var17[0]) {
                  var17[0] = new float[3];
               }

               mn.a(var17, (int)0);
               ((int[])((int[])var17[1]))[0] = var23;
               ((float[])((float[])var17[0]))[2] = var19;
               ((int[])((int[])var17[1]))[3] = var18;
               ((int[])((int[])var17[1]))[6] = var22;
               ((int[])((int[])var17[1]))[1] = var21;
               ((float[])((float[])var17[0]))[1] = var20;
               var12[var11] = var17;
            }
         }
      } else {
         var1.V = this.V;
      }

      if(this.H != null && (var3 & 16) != 0) {
         if(var2.H != null && var2.H.length >= this.K) {
            var1.H = var2.H;
         } else {
            var10 = var4?this.K + 100:this.K;
            var1.H = var2.H = new float[var10][3];
         }

         for(var10 = 0; var10 < this.K; ++var10) {
            if(this.H[var10] != null) {
               var1.H[var10][0] = this.H[var10][0];
               var1.H[var10][1] = this.H[var10][1];
               var1.H[var10][2] = this.H[var10][2];
            }
         }

         if(var2.Cb != null && var2.Cb.length >= this.K) {
            var1.Cb = var2.Cb;
         } else {
            var10 = var4?this.K + 100:this.K;
            var1.Cb = var2.Cb = new float[var10][3];
         }

         for(var10 = 0; var10 < this.K; ++var10) {
            if(this.Cb[var10] != null) {
               var1.Cb[var10][0] = this.Cb[var10][0];
               var1.Cb[var10][1] = this.Cb[var10][1];
               var1.Cb[var10][2] = this.Cb[var10][2];
            }
         }
      } else {
         var1.H = this.H;
         var1.Cb = this.Cb;
      }

      var1.F = this.F;
      var1.D = this.D;
      var1.Kb = this.Kb;
      var1.f_ab = this.f_ab;
      var1.X = this.X;
      var1.Bb = this.Bb;
      var1.Hb = this.Hb;
      var1.f_ib = this.f_ib;
      var1.yb = this.yb;
      var1.y = this.y;
      var1.T = this.T;
      var1.s = this.s;
      var1.f_gb = this.f_gb;
      var1.R = var3;
      return var1;
   }

   private final void o(int var1) {
      short var2 = this.Hb[var1];
      short var3 = this.f_ib[var1];
      short var4 = this.yb[var1];
      if(this.Lb != null && this.Lb[var1] != -1) {
         int var5 = -16777216;
         if(this.t != null) {
            var5 = 255 - (this.t[var1] & 255) << 24;
         }

         if(this.W[var1] == -1) {
            int var6 = var5 | this.M[var1] & 16777215;
            this.f_hb.b(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var6, var6, var6, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         } else {
            this.f_hb.b(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var5 | this.M[var1] & 16777215, var5 | this.Gb[var1] & 16777215, var5 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         }
      } else {
         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.W[var1] == -1) {
            this.f_hb.b(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], en.c[this.M[var1] & '\uffff']);
         } else {
            this.f_hb.f(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], (float)(this.M[var1] & '\uffff'), (float)(this.Gb[var1] & '\uffff'), (float)(this.W[var1] & '\uffff'));
         }
      }

   }

   final void c() {
      if(((int[])((int[])this.f_rb[1]))[10] > 1) {
         synchronized(this) {
            while(this.f) {
               try {
                  this.wait();
               } catch (InterruptedException var4) {
                  ;
               }
            }

            this.f = true;
         }
      }

   }

   final void EA(int var1) {
      if((this.R & 13) != 13) {
         throw new IllegalStateException();
      } else {
         if(this.N != null) {
            if(var1 == 4096) {
               this.h();
               return;
            }

            if(var1 == 8192) {
               this.l();
               return;
            }

            if(var1 == 12288) {
               this.j();
               return;
            }

            int var2 = tda.p[var1];
            int var3 = tda.k[var1];
            synchronized(this) {
               int var5;
               int var6;
               for(var5 = 0; var5 < this.C; ++var5) {
                  var6 = this.O[var5] * var2 + this.A[var5] * var3 >> 14;
                  this.O[var5] = this.O[var5] * var3 - this.A[var5] * var2 >> 14;
                  this.A[var5] = var6;
                  if(this.N[var5] != null) {
                     var6 = this.N[var5].b * var2 + this.N[var5].d * var3 >> 14;
                     this.N[var5].b = this.N[var5].b * var3 - this.N[var5].d * var2 >> 14;
                     this.N[var5].d = var6;
                  }
               }

               if(this.f_vb != null) {
                  for(var5 = 0; var5 < this.K; ++var5) {
                     if(this.f_vb[var5] != null) {
                        var6 = this.f_vb[var5].c * var2 + this.f_vb[var5].a * var3 >> 14;
                        this.f_vb[var5].c = this.f_vb[var5].c * var3 - this.f_vb[var5].a * var2 >> 14;
                        this.f_vb[var5].a = var6;
                     }
                  }
               }

               for(var5 = this.C; var5 < this.Ib; ++var5) {
                  var6 = this.O[var5] * var2 + this.A[var5] * var3 >> 14;
                  this.O[var5] = this.O[var5] * var3 - this.A[var5] * var2 >> 14;
                  this.A[var5] = var6;
               }

               this.f_fb = 0;
               this.xb = false;
            }
         } else {
            this.O(var1);
         }

      }
   }

   private final void a(boolean var1, boolean var2) {
      int var3;
      Object[] var4;
      if(this.s != null) {
         for(var3 = 0; var3 < this.f_mb; this.f_lb[((int[])((int[])var4[1]))[0]] = var3++) {
            var4 = this.s[var3];
         }
      }

      if(!this.B && this.s == null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            this.g(var3, var1, var2);
         }
      } else if((this.R & 256) == 0 && this.f_gb != null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            short var6 = this.f_gb[var3];
            this.g(var6, var1, var2);
         }
      } else {
         for(var3 = 0; var3 < this.K; ++var3) {
            if(!this.f(var3) && !this.e(var3)) {
               this.g(var3, var1, var2);
            }
         }

         if(this.Bb == null) {
            for(var3 = 0; var3 < this.K; ++var3) {
               if(this.f(var3) || this.e(var3)) {
                  this.g(var3, var1, var2);
               }
            }
         } else {
            for(var3 = 0; var3 < 12; ++var3) {
               for(int var5 = 0; var5 < this.K; ++var5) {
                  if(this.Bb[var5] == var3 && (this.f(var5) || this.e(var5))) {
                     this.g(var5, var1, var2);
                  }
               }
            }
         }
      }

   }

   final int da() {
      if(!this.xb) {
         this.p();
      }

      return this.f_db;
   }

   final void a(ka var1, int var2, int var3, int var4, boolean var5) {
      dpa var6 = (dpa)var1;
      if((this.R & 65536) != 65536) {
         throw new IllegalStateException("");
      } else if((var6.R & 65536) != 65536) {
         throw new IllegalStateException("");
      } else {
         this.b(ui.a(this.f_rb, (Runnable)Thread.currentThread()));
         this.p();
         this.s();
         var6.p();
         var6.s();
         ++x;
         int var7 = 0;
         int[] var8 = var6.A;
         int var9 = var6.C;

         int var10;
         for(var10 = 0; var10 < this.C; ++var10) {
            wc var11 = this.N[var10];
            if(var11.a != 0) {
               int var12 = this.I[var10] - var3;
               if(var12 >= var6.f_nb && var12 <= var6.q) {
                  int var13 = this.A[var10] - var2;
                  if(var13 >= var6.f_jb && var13 <= var6.f_bb) {
                     int var14 = this.O[var10] - var4;
                     if(var14 >= var6.f_db && var14 <= var6.f_ob) {
                        for(int var15 = 0; var15 < var9; ++var15) {
                           wc var16 = var6.N[var15];
                           if(var13 == var8[var15] && var14 == var6.O[var15] && var12 == var6.I[var15] && var16.a != 0) {
                              if(this.f_cb == null) {
                                 this.f_cb = new wc[this.C];
                              }

                              if(var6.f_cb == null) {
                                 var6.f_cb = new wc[var9];
                              }

                              wc var17 = this.f_cb[var10];
                              if(var17 == null) {
                                 var17 = this.f_cb[var10] = new wc(var11);
                              }

                              wc var18 = var6.f_cb[var15];
                              if(var18 == null) {
                                 var18 = var6.f_cb[var15] = new wc(var16);
                              }

                              var17.d += var16.d;
                              var17.c += var16.c;
                              var17.b += var16.b;
                              var17.a += var16.a;
                              var18.d += var11.d;
                              var18.c += var11.c;
                              var18.b += var11.b;
                              var18.a += var11.a;
                              ++var7;
                              this.f_pb[var10] = x;
                              this.Db[var15] = x;
                           }
                        }
                     }
                  }
               }
            }
         }

         if(var7 >= 3 && var5) {
            for(var10 = 0; var10 < this.K; ++var10) {
               if(this.f_pb[this.Hb[var10]] == x && this.f_pb[this.f_ib[var10]] == x && this.f_pb[this.yb[var10]] == x) {
                  if(this.Q == null) {
                     this.Q = new byte[this.K];
                  }

                  this.Q[var10] = 2;
               }
            }

            for(var10 = 0; var10 < var6.K; ++var10) {
               if(this.Db[var6.Hb[var10]] == x && this.Db[var6.f_ib[var10]] == x && this.Db[var6.yb[var10]] == x) {
                  if(var6.Q == null) {
                     var6.Q = new byte[var6.K];
                  }

                  var6.Q[var10] = 2;
               }
            }

         }
      }
   }

   private final void c(int var1, boolean var2, boolean var3) {
      if(this.W[var1] != -2) {
         short var4 = this.Hb[var1];
         short var5 = this.f_ib[var1];
         short var6 = this.yb[var1];
         float var7 = this.p[var4];
         float var8 = this.p[var5];
         float var9 = this.p[var6];
         if(!var2 || var7 != -5000.0F && var8 != -5000.0F && var9 != -5000.0F) {
            float var10 = this.Ab[var4];
            float var11 = this.Ab[var5];
            float var12 = this.Ab[var6];
            if(this.f_lb[var1] != -1 || (var7 - var8) * (var12 - var11) - (var10 - var11) * (var9 - var8) > 0.0F) {
               if(var7 >= 0.0F && var8 >= 0.0F && var9 >= 0.0F && var7 <= (float)((int[])((int[])this.Eb[1]))[4] && var8 <= (float)((int[])((int[])this.Eb[1]))[4] && var9 <= (float)((int[])((int[])this.Eb[1]))[4]) {
                  this.f_hb.c = false;
               } else {
                  this.f_hb.c = true;
               }

               int var13;
               if(var3) {
                  var13 = this.f_lb[var1];
                  if(var13 == -1 || !((boolean[])((boolean[])this.s[var13][3]))[0]) {
                     this.k(var1);
                  }
               } else {
                  var13 = this.f_lb[var1];
                  if(var13 != -1) {
                     Object[] var14 = this.s[var13];
                     Object[] var15 = this.V[var13];
                     if(!((boolean[])((boolean[])var14[3]))[0]) {
                        this.o(var1);
                     }

                     ui.g(((int[])((int[])var15[1]))[5], ((int[])((int[])var15[1]))[2], ((float[])((float[])var15[0]))[0], ((int[])((int[])var15[1]))[4], ((int[])((int[])var15[1]))[7], ((short[])((short[])var14[0]))[2] & '\uffff', ((int[])((int[])var15[1]))[3], ((byte[])((byte[])var14[2]))[0], ((byte[])((byte[])var14[2]))[1], this.f_rb);
                  } else {
                     this.o(var1);
                  }
               }
            }

         }
      }
   }

   final void f() {}

   private final void j(int var1) {
      short var2;
      short var3;
      short var4;
      float var6;
      float var7;
      if(!((boolean[])((boolean[])this.Eb[2]))[2]) {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         Object[] var5 = (Object[])((Object[])this.f_rb[13]);
         var6 = ((float[])((float[])var5[0]))[10];
         var7 = ((float[])((float[])var5[0]))[14];
         float var8 = ((float[])((float[])var5[0]))[11];
         float var9 = ((float[])((float[])var5[0]))[15];
         float var10 = var7 * var8 - var6 * var9;
         float var11 = (this.f_sb[var2] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var12 = (this.f_sb[var3] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var13 = (this.f_sb[var4] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var14 = var11 * var10 / (var11 * var8 - var6);
         float var15 = var12 * var10 / (var12 * var8 - var6);
         float var16 = var13 * var10 / (var13 * var8 - var6);
         float var17 = (var14 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var17 > 1.0F) {
            var17 = 1.0F;
         } else if(var17 < 0.0F) {
            var17 = 0.0F;
         }

         float var18 = (var15 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var18 > 1.0F) {
            var18 = 1.0F;
         } else if(var18 < 0.0F) {
            var18 = 0.0F;
         }

         float var19 = (var16 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var19 > 1.0F) {
            var19 = 1.0F;
         } else if(var19 < 0.0F) {
            var19 = 0.0F;
         }

         float var20 = var17 + var18 + var19;
         if(var20 >= 3.0F) {
            return;
         }

         if(var20 <= 0.0F) {
            this.t(var1);
            return;
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var21 = -16777216;
            if(this.t != null) {
               var21 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var22 = var21 | this.M[var1] & 16777215;
               this.f_hb.a(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var22, var22, var22, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.a(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var21 | this.M[var1] & 16777215, var21 | this.Gb[var1] & 16777215, var21 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.c(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 103, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 122, var18 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 100, var19 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.c(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 90, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 65, var18 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 74, var19 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      } else {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         float var23 = 0.0F;
         var6 = 0.0F;
         var7 = 0.0F;
         if(this.w[var2] > ((int[])((int[])this.Eb[1]))[3]) {
            var23 = 1.0F;
         } else if(this.w[var2] > ((int[])((int[])this.Eb[1]))[2]) {
            var23 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var2]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var3] > ((int[])((int[])this.Eb[1]))[3]) {
            var6 = 1.0F;
         } else if(this.w[var3] > ((int[])((int[])this.Eb[1]))[2]) {
            var6 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var3]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var4] > ((int[])((int[])this.Eb[1]))[3]) {
            var7 = 1.0F;
         } else if(this.w[var4] > ((int[])((int[])this.Eb[1]))[2]) {
            var7 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var4]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var24 = -16777216;
            if(this.t != null) {
               var24 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var25 = var24 | this.M[var1] & 16777215;
               this.f_hb.a(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var25, var25, var25, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.a(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var24 | this.M[var1] & 16777215, var24 | this.Gb[var1] & 16777215, var24 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.c(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 74, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 126, var6 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 77, var7 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.c(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 95, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 93, var6 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 95, var7 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      }

   }

   private final void o() {
      this.N = null;
      this.f_cb = null;
      this.f_vb = null;
      this.xb = false;
   }

   final int va() {
      return this.R;
   }

   private final void b(Object[] var1) {
      this.f_hb = (uo)var1[17];
      if(var1 != this.Eb) {
         this.Eb = var1;
         this.w = (int[])((int[])this.Eb[20]);
         this.p = (float[])((float[])this.Eb[15]);
         this.Ab = (float[])((float[])this.Eb[13]);
         this.f_sb = (float[])((float[])this.Eb[24]);
         this.J = (float[])((float[])this.Eb[22]);
         this.Fb = (int[])((int[])this.Eb[26]);
         this.P = (int[])((int[])this.Eb[19]);
         this.f_wb = (int[])((int[])this.Eb[4]);
         this.f_pb = (int[])((int[])this.Eb[0]);
         this.Db = (int[])((int[])this.Eb[7]);
         this.f_lb = (int[])((int[])this.Eb[6]);
      }
   }

   final void C(int var1) {
      if((this.R & 8192) != 8192) {
         throw new IllegalStateException();
      } else {
         this.L = var1;
         this.f_fb = 0;
      }
   }

   final void q(short var1, short var2) {
      int var3;
      for(var3 = 0; var3 < this.K; ++var3) {
         if(this.f_tb[var3] == var1) {
            this.f_tb[var3] = var2;
         }
      }

      if(this.s != null) {
         for(var3 = 0; var3 < this.f_mb; ++var3) {
            Object[] var4 = this.s[var3];
            Object[] var5 = this.V[var3];
            ((int[])((int[])var5[1]))[3] = ((int[])((int[])var5[1]))[3] & -16777216 | en.c[spa.a(this.f_tb[((int[])((int[])var4[1]))[0]], (byte)68) & '\uffff'] & 16777215;
         }
      }

      if(this.f_fb == 2) {
         this.f_fb = 1;
      }

   }

   private final void s() {
      if(this.f_fb == 0 && this.N == null) {
         if(((int[])((int[])this.f_rb[1]))[10] > 1) {
            synchronized(this) {
               this.i();
            }
         } else {
            this.i();
         }

      }
   }

   private final int a(int var1, short var2, int var3) {
      int var5 = tpa.f[this.a(var1, var3)];
      Object[] var4 = this.f_rb;
      Object[] var6 = ((ta)(this.f_rb == null?null:var4[6])).k.a(var2 & '\uffff', (byte)60);
      int var7 = ((byte[])((byte[])var6[0]))[3] & 255;
      int var8;
      int var10;
      if(var7 != 0) {
         var8 = 131586 * var3;
         if(var7 == 256) {
            var5 = var8;
         } else {
            var10 = 256 - var7;
            var5 = ((var8 & 16711935) * var7 + (var5 & 16711935) * var10 & -16711936) + ((var8 & '\uff00') * var7 + (var5 & '\uff00') * var10 & 16711680) >> 8;
         }
      }

      var8 = ((byte[])((byte[])var6[0]))[1] & 255;
      if(var8 != 0) {
         var8 += 256;
         int var9 = ((var5 & 16711680) >> 16) * var8;
         if(var9 > '\uffff') {
            var9 = '\uffff';
         }

         var10 = ((var5 & '\uff00') >> 8) * var8;
         if(var10 > '\uffff') {
            var10 = '\uffff';
         }

         int var11 = (var5 & 255) * var8;
         if(var11 > '\uffff') {
            var11 = '\uffff';
         }

         var5 = (var9 << 8 & 16711680) + (var10 & '\uff00') + (var11 >> 8);
      }

      return var5;
   }

   final void fa(int var1) {
      if((this.R & 3) != 3) {
         throw new IllegalStateException();
      } else {
         int var2 = tda.p[var1];
         int var3 = tda.k[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.Ib; ++var5) {
               int var6 = this.I[var5] * var2 + this.A[var5] * var3 >> 14;
               this.I[var5] = this.I[var5] * var3 - this.A[var5] * var2 >> 14;
               this.A[var5] = var6;
            }

            this.o();
         }
      }
   }

   final Object[][] a() {
      return this.y;
   }

   final void a(int var1, int var2, int var3, int var4) {
      if((this.R & 524288) != 524288) {
         throw new IllegalStateException();
      } else {
         int var5;
         for(var5 = 0; var5 < this.K; ++var5) {
            int var6 = this.f_tb[var5] & '\uffff';
            int var7 = var6 >> 10 & 63;
            int var8 = var6 >> 7 & 7;
            int var9 = var6 & 127;
            if(var1 != -1) {
               var7 += (var1 - var7) * var4 >> 7;
            }

            if(var2 != -1) {
               var8 += (var2 - var8) * var4 >> 7;
            }

            if(var3 != -1) {
               var9 += (var3 - var9) * var4 >> 7;
            }

            this.f_tb[var5] = (short)(var7 << 10 | var8 << 7 | var9);
         }

         if(this.s != null) {
            for(var5 = 0; var5 < this.f_mb; ++var5) {
               Object[] var10 = this.s[var5];
               Object[] var11 = this.V[var5];
               ((int[])((int[])var11[1]))[3] = ((int[])((int[])var11[1]))[3] & -16777216 | en.c[spa.a(this.f_tb[((int[])((int[])var10[1]))[0]] & '\uffff', (byte)68) & '\uffff'] & 16777215;
            }
         }

         if(this.f_fb == 2) {
            this.f_fb = 1;
         }

      }
   }

   private final void b(int var1, boolean var2, boolean var3) {
      if(this.W[var1] != -2) {
         short var4 = this.Hb[var1];
         short var5 = this.f_ib[var1];
         short var6 = this.yb[var1];
         float var7 = this.p[var4];
         float var8 = this.p[var5];
         float var9 = this.p[var6];
         if(!var2 || var7 != -5000.0F && var8 != -5000.0F && var9 != -5000.0F) {
            float var10 = this.Ab[var4];
            float var11 = this.Ab[var5];
            float var12 = this.Ab[var6];
            if(this.f_lb[var1] != -1 || (var7 - var8) * (var12 - var11) - (var10 - var11) * (var9 - var8) > 0.0F) {
               if(var7 >= 0.0F && var8 >= 0.0F && var9 >= 0.0F && var7 <= (float)((int[])((int[])this.Eb[1]))[4] && var8 <= (float)((int[])((int[])this.Eb[1]))[4] && var9 <= (float)((int[])((int[])this.Eb[1]))[4]) {
                  this.f_hb.c = false;
               } else {
                  this.f_hb.c = true;
               }

               int var13;
               if(var3) {
                  var13 = this.f_lb[var1];
                  if(var13 == -1 || !((boolean[])((boolean[])this.s[var13][3]))[0]) {
                     this.p(var1);
                  }
               } else {
                  var13 = this.f_lb[var1];
                  if(var13 != -1) {
                     Object[] var14 = this.s[var13];
                     Object[] var15 = this.V[var13];
                     if(!((boolean[])((boolean[])var14[3]))[0]) {
                        this.s(var1);
                     }

                     ui.f(((int[])((int[])var15[1]))[5], ((int[])((int[])var15[1]))[2], ((float[])((float[])var15[0]))[0], ((int[])((int[])var15[1]))[4], ((int[])((int[])var15[1]))[7], ((short[])((short[])var14[0]))[2] & '\uffff', ((int[])((int[])var15[1]))[3], ((byte[])((byte[])var14[2]))[0], ((byte[])((byte[])var14[2]))[1], this.f_rb);
                  } else {
                     this.s(var1);
                  }
               }
            }

         }
      }
   }

   private final void k() {
      synchronized(this) {
         for(int var2 = 0; var2 < this.Ib; ++var2) {
            this.A[var2] = -this.A[var2];
            this.O[var2] = -this.O[var2];
         }

         this.o();
      }
   }

   private final void d(boolean var1, boolean var2) {
      int var3;
      Object[] var4;
      if(this.s != null) {
         for(var3 = 0; var3 < this.f_mb; this.f_lb[((int[])((int[])var4[1]))[0]] = var3++) {
            var4 = this.s[var3];
         }
      }

      if(!this.B && this.s == null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            this.f(var3, var1, var2);
         }
      } else if((this.R & 256) == 0 && this.f_gb != null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            short var6 = this.f_gb[var3];
            this.f(var6, var1, var2);
         }
      } else {
         for(var3 = 0; var3 < this.K; ++var3) {
            if(!this.f(var3) && !this.e(var3)) {
               this.f(var3, var1, var2);
            }
         }

         if(this.Bb == null) {
            for(var3 = 0; var3 < this.K; ++var3) {
               if(this.f(var3) || this.e(var3)) {
                  this.f(var3, var1, var2);
               }
            }
         } else {
            for(var3 = 0; var3 < 12; ++var3) {
               for(int var5 = 0; var5 < this.K; ++var5) {
                  if(this.Bb[var5] == var3 && (this.f(var5) || this.e(var5))) {
                     this.f(var5, var1, var2);
                  }
               }
            }
         }
      }

   }

   final int BA() {
      return this.E;
   }

   final ka a(byte var1, int var2, boolean var3) {
      this.a(Thread.currentThread());
      boolean var6 = false;
      dpa var4;
      dpa var5;
      if(var1 > 0 && var1 <= 7) {
         var5 = this.r[var1 - 1];
         var4 = this.f_qb[var1 - 1];
         var6 = true;
      } else {
         var4 = var5 = new dpa(this.f_rb);
      }

      return this.a(var4, var5, var2, var6, var3);
   }

   private final void b(boolean var1, boolean var2) {
      int var3;
      Object[] var4;
      if(this.s != null) {
         for(var3 = 0; var3 < this.f_mb; this.f_lb[((int[])((int[])var4[1]))[0]] = var3++) {
            var4 = this.s[var3];
         }
      }

      if(!this.B && this.s == null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            this.b(var3, var1, var2);
         }
      } else if((this.R & 256) == 0 && this.f_gb != null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            short var6 = this.f_gb[var3];
            this.b(var6, var1, var2);
         }
      } else {
         for(var3 = 0; var3 < this.K; ++var3) {
            if(!this.f(var3) && !this.e(var3)) {
               this.b(var3, var1, var2);
            }
         }

         if(this.Bb == null) {
            for(var3 = 0; var3 < this.K; ++var3) {
               if(this.f(var3) || this.e(var3)) {
                  this.b(var3, var1, var2);
               }
            }
         } else {
            for(var3 = 0; var3 < 12; ++var3) {
               for(int var5 = 0; var5 < this.K; ++var5) {
                  if(this.Bb[var5] == var3 && (this.f(var5) || this.e(var5))) {
                     this.b(var5, var1, var2);
                  }
               }
            }
         }
      }

   }

   private final void g() {
      synchronized(this) {
         for(int var2 = 0; var2 < this.Ib; ++var2) {
            int var3 = this.A[var2];
            this.A[var2] = this.O[var2];
            this.O[var2] = -var3;
         }

         this.o();
      }
   }

   private final void h(int var1) {
      short var2 = this.Hb[var1];
      short var3 = this.f_ib[var1];
      short var4 = this.yb[var1];
      if(this.Lb != null && this.Lb[var1] != -1) {
         int var5 = -16777216;
         if(this.t != null) {
            var5 = 255 - (this.t[var1] & 255) << 24;
         }

         if(this.W[var1] == -1) {
            int var6 = var5 | this.M[var1] & 16777215;
            this.f_hb.d(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var6, var6, var6, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         } else {
            this.f_hb.d(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var5 | this.M[var1] & 16777215, var5 | this.Gb[var1] & 16777215, var5 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         }
      } else {
         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.W[var1] == -1) {
            this.f_hb.c(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], en.c[this.M[var1] & '\uffff']);
         } else {
            this.f_hb.h(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], (float)(this.M[var1] & '\uffff'), (float)(this.Gb[var1] & '\uffff'), (float)(this.W[var1] & '\uffff'));
         }
      }

   }

   private final void d(int var1, boolean var2, boolean var3) {
      if(this.W[var1] != -2) {
         short var4 = this.Hb[var1];
         short var5 = this.f_ib[var1];
         short var6 = this.yb[var1];
         float var7 = this.p[var4];
         float var8 = this.p[var5];
         float var9 = this.p[var6];
         if(!var2 || var7 != -5000.0F && var8 != -5000.0F && var9 != -5000.0F) {
            float var10 = this.Ab[var4];
            float var11 = this.Ab[var5];
            float var12 = this.Ab[var6];
            if(this.f_lb[var1] != -1 || (var7 - var8) * (var12 - var11) - (var10 - var11) * (var9 - var8) > 0.0F) {
               if(var7 >= 0.0F && var8 >= 0.0F && var9 >= 0.0F && var7 <= (float)((int[])((int[])this.Eb[1]))[4] && var8 <= (float)((int[])((int[])this.Eb[1]))[4] && var9 <= (float)((int[])((int[])this.Eb[1]))[4]) {
                  this.f_hb.c = false;
               } else {
                  this.f_hb.c = true;
               }

               int var13;
               if(var3) {
                  var13 = this.f_lb[var1];
                  if(var13 == -1 || !((boolean[])((boolean[])this.s[var13][3]))[0]) {
                     this.n(var1);
                  }
               } else {
                  var13 = this.f_lb[var1];
                  if(var13 != -1) {
                     Object[] var14 = this.s[var13];
                     Object[] var15 = this.V[var13];
                     if(!((boolean[])((boolean[])var14[3]))[0]) {
                        this.r(var1);
                     }

                     ui.h(((int[])((int[])var15[1]))[5], ((int[])((int[])var15[1]))[2], ((float[])((float[])var15[0]))[0], ((int[])((int[])var15[1]))[4], ((int[])((int[])var15[1]))[7], ((short[])((short[])var14[0]))[2] & '\uffff', ((int[])((int[])var15[1]))[3], ((byte[])((byte[])var14[2]))[0], ((byte[])((byte[])var14[2]))[1], this.f_rb);
                  } else {
                     this.r(var1);
                  }
               }
            }

         }
      }
   }

   private final void g(boolean var1, boolean var2) {
      int var3;
      Object[] var4;
      if(this.s != null) {
         for(var3 = 0; var3 < this.f_mb; this.f_lb[((int[])((int[])var4[1]))[0]] = var3++) {
            var4 = this.s[var3];
         }
      }

      if(!this.B && this.s == null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            this.h(var3, var1, var2);
         }
      } else if((this.R & 256) == 0 && this.f_gb != null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            short var6 = this.f_gb[var3];
            this.h(var6, var1, var2);
         }
      } else {
         for(var3 = 0; var3 < this.K; ++var3) {
            if(!this.f(var3) && !this.e(var3)) {
               this.h(var3, var1, var2);
            }
         }

         if(this.Bb == null) {
            for(var3 = 0; var3 < this.K; ++var3) {
               if(this.f(var3) || this.e(var3)) {
                  this.h(var3, var1, var2);
               }
            }
         } else {
            for(var3 = 0; var3 < 12; ++var3) {
               for(int var5 = 0; var5 < this.K; ++var5) {
                  if(this.Bb[var5] == var3 && (this.f(var5) || this.e(var5))) {
                     this.h(var5, var1, var2);
                  }
               }
            }
         }
      }

   }

   private final void a(int var1, boolean var2, boolean var3) {
      if(this.W[var1] != -2) {
         short var4 = this.Hb[var1];
         short var5 = this.f_ib[var1];
         short var6 = this.yb[var1];
         float var7 = this.p[var4];
         float var8 = this.p[var5];
         float var9 = this.p[var6];
         if(!var2 || var7 != -5000.0F && var8 != -5000.0F && var9 != -5000.0F) {
            float var10 = this.Ab[var4];
            float var11 = this.Ab[var5];
            float var12 = this.Ab[var6];
            if(this.f_lb[var1] != -1 || (var7 - var8) * (var12 - var11) - (var10 - var11) * (var9 - var8) > 0.0F) {
               if(var7 >= 0.0F && var8 >= 0.0F && var9 >= 0.0F && var7 <= (float)((int[])((int[])this.Eb[1]))[4] && var8 <= (float)((int[])((int[])this.Eb[1]))[4] && var9 <= (float)((int[])((int[])this.Eb[1]))[4]) {
                  this.f_hb.c = false;
               } else {
                  this.f_hb.c = true;
               }

               int var13;
               if(var3) {
                  var13 = this.f_lb[var1];
                  if(var13 == -1 || !((boolean[])((boolean[])this.s[var13][3]))[0]) {
                     this.b(var1);
                  }
               } else {
                  var13 = this.f_lb[var1];
                  if(var13 != -1) {
                     Object[] var14 = this.s[var13];
                     Object[] var15 = this.V[var13];
                     if(!((boolean[])((boolean[])var14[3]))[0]) {
                        this.i(var1);
                     }

                     ui.c(((int[])((int[])var15[1]))[5], ((int[])((int[])var15[1]))[2], ((float[])((float[])var15[0]))[0], ((int[])((int[])var15[1]))[4], ((int[])((int[])var15[1]))[7], ((short[])((short[])var14[0]))[2] & '\uffff', ((int[])((int[])var15[1]))[3], ((byte[])((byte[])var14[2]))[0], ((byte[])((byte[])var14[2]))[1], this.f_rb);
                  } else {
                     this.i(var1);
                  }
               }
            }

         }
      }
   }

   final void a(Object[] var1) {
      this.b(ui.a(this.f_rb, (Runnable)Thread.currentThread()));
      Object[] var2 = (Object[])((Object[])this.Eb[27]);
      aqa.a(true, var1, var2);
      int var3;
      Object[] var4;
      Object[] var5;
      if(this.y != null) {
         for(var3 = 0; var3 < this.y.length; ++var3) {
            var4 = this.y[var3];
            var5 = var4;
            if(var4[2] != null) {
               var5 = (Object[])((Object[])var4[2]);
            }

            ((int[])((int[])var5[1]))[12] = (int)(((float[])((float[])var2[0]))[12] + ((float[])((float[])var2[0]))[0] * (float)this.A[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[4] * (float)this.I[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[8] * (float)this.O[((int[])((int[])var4[1]))[10]]);
            ((int[])((int[])var5[1]))[5] = (int)(((float[])((float[])var2[0]))[13] + ((float[])((float[])var2[0]))[1] * (float)this.A[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[5] * (float)this.I[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[9] * (float)this.O[((int[])((int[])var4[1]))[10]]);
            ((int[])((int[])var5[1]))[4] = (int)(((float[])((float[])var2[0]))[14] + ((float[])((float[])var2[0]))[2] * (float)this.A[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[6] * (float)this.I[((int[])((int[])var4[1]))[10]] + ((float[])((float[])var2[0]))[10] * (float)this.O[((int[])((int[])var4[1]))[10]]);
            ((int[])((int[])var5[1]))[2] = (int)(((float[])((float[])var2[0]))[12] + ((float[])((float[])var2[0]))[0] * (float)this.A[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[4] * (float)this.I[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[8] * (float)this.O[((int[])((int[])var4[1]))[3]]);
            ((int[])((int[])var5[1]))[9] = (int)(((float[])((float[])var2[0]))[13] + ((float[])((float[])var2[0]))[1] * (float)this.A[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[5] * (float)this.I[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[9] * (float)this.O[((int[])((int[])var4[1]))[3]]);
            ((int[])((int[])var5[1]))[7] = (int)(((float[])((float[])var2[0]))[14] + ((float[])((float[])var2[0]))[2] * (float)this.A[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[6] * (float)this.I[((int[])((int[])var4[1]))[3]] + ((float[])((float[])var2[0]))[10] * (float)this.O[((int[])((int[])var4[1]))[3]]);
            ((int[])((int[])var5[1]))[0] = (int)(((float[])((float[])var2[0]))[12] + ((float[])((float[])var2[0]))[0] * (float)this.A[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[4] * (float)this.I[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[8] * (float)this.O[((int[])((int[])var4[1]))[6]]);
            ((int[])((int[])var5[1]))[8] = (int)(((float[])((float[])var2[0]))[13] + ((float[])((float[])var2[0]))[1] * (float)this.A[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[5] * (float)this.I[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[9] * (float)this.O[((int[])((int[])var4[1]))[6]]);
            ((int[])((int[])var5[1]))[11] = (int)(((float[])((float[])var2[0]))[14] + ((float[])((float[])var2[0]))[2] * (float)this.A[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[6] * (float)this.I[((int[])((int[])var4[1]))[6]] + ((float[])((float[])var2[0]))[10] * (float)this.O[((int[])((int[])var4[1]))[6]]);
         }
      }

      if(this.T != null) {
         for(var3 = 0; var3 < this.T.length; ++var3) {
            var4 = this.T[var3];
            var5 = var4;
            if(var4[2] != null) {
               var5 = (Object[])((Object[])var4[2]);
            }

            if(var4[0] != null) {
               sea.a(var2, (Object[])((Object[])var4[0]), (byte)111);
            } else {
               var4[0] = ona.a(new Object[2], var2, (byte)125);
            }

            ((int[])((int[])var5[1]))[2] = (int)(((float[])((float[])var2[0]))[12] + ((float[])((float[])var2[0]))[0] * (float)this.A[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[4] * (float)this.I[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[8] * (float)this.O[((int[])((int[])var4[1]))[0]]);
            ((int[])((int[])var5[1]))[1] = (int)(((float[])((float[])var2[0]))[13] + ((float[])((float[])var2[0]))[1] * (float)this.A[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[5] * (float)this.I[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[9] * (float)this.O[((int[])((int[])var4[1]))[0]]);
            ((int[])((int[])var5[1]))[3] = (int)(((float[])((float[])var2[0]))[14] + ((float[])((float[])var2[0]))[2] * (float)this.A[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[6] * (float)this.I[((int[])((int[])var4[1]))[0]] + ((float[])((float[])var2[0]))[10] * (float)this.O[((int[])((int[])var4[1]))[0]]);
         }
      }

   }

   private final void b(Object[] var1, lpa var2, int var3) {
      if(this.C >= 1) {
         Object[] var4 = ui.a(this.f_rb, (Runnable)Thread.currentThread());
         Object[] var5 = (Object[])((Object[])var4[27]);
         aqa.a(true, var1, var5);
         Object[] var6 = (Object[])((Object[])this.f_rb[5]);
         Object[] var7 = (Object[])((Object[])this.f_rb[13]);
         if(!this.xb) {
            this.p();
         }

         boolean var8 = ppa.a(2, var5);
         float[] var9 = (float[])((float[])var4[5]);
         jn.a(0.0F, (float)this.f_nb, var9, var5, true, 0.0F);
         float var10 = var9[0];
         float var11 = var9[1];
         float var12 = var9[2];
         jn.a(0.0F, (float)this.q, var9, var5, true, 0.0F);
         float var13 = var9[0];
         float var14 = var9[1];
         float var15 = var9[2];

         float var19;
         float var18;
         for(int var16 = 0; var16 < 6; ++var16) {
            float[] var17 = ((float[][])((float[][])this.f_rb[4]))[var16];
            var18 = var17[0] * var10 + var17[1] * var11 + var17[2] * var12 + var17[3] + (float)this.Y;
            var19 = var17[0] * var13 + var17[1] * var14 + var17[2] * var15 + var17[3] + (float)this.Y;
            if(var18 < 0.0F && var19 < 0.0F) {
               return;
            }
         }

         float var51;
         float var52;
         if(var8) {
            var51 = ((float[])((float[])var6[0]))[14];
            var52 = ((float[])((float[])var6[0]))[6];
         } else {
            var51 = ((float[])((float[])var5[0]))[12] * ((float[])((float[])var6[0]))[2] + ((float[])((float[])var5[0]))[13] * ((float[])((float[])var6[0]))[6] + ((float[])((float[])var5[0]))[14] * ((float[])((float[])var6[0]))[10] + ((float[])((float[])var6[0]))[14];
            var52 = ((float[])((float[])var5[0]))[4] * ((float[])((float[])var6[0]))[2] + ((float[])((float[])var5[0]))[5] * ((float[])((float[])var6[0]))[6] + ((float[])((float[])var5[0]))[6] * ((float[])((float[])var6[0]))[10];
         }

         var18 = var51 + (float)this.f_nb * var52;
         var19 = var51 + (float)this.q * var52;
         float var20 = var18 > var19?var18 + (float)this.Y:var19 + (float)this.Y;
         float var21 = ((float[])((float[])var7[0]))[10] * var20 + ((float[])((float[])var7[0]))[14];
         if(((int[])((int[])this.f_rb[1]))[10] > 1) {
            synchronized(this) {
               while(this.Jb) {
                  try {
                     this.wait();
                  } catch (InterruptedException var48) {
                     ;
                  }
               }

               this.Jb = true;
            }
         }

         this.b(var4);
         Object[] var22 = (Object[])((Object[])this.Eb[9]);
         sea.a(var5, var22, (byte)53);
         vta.a((Object[])((Object[])this.f_rb[11]), var22, 113);
         if((var3 & 2) != 0) {
            this.f_hb.a(true);
         } else {
            this.f_hb.a(false);
         }

         boolean var23 = false;
         ((float[])((float[])this.Eb[18]))[3] = this.f_hb.r;
         ((float[])((float[])this.Eb[18]))[1] = this.f_hb.w;
         ((float[])((float[])this.Eb[18]))[0] = this.f_hb.k;
         ((float[])((float[])this.Eb[18]))[6] = 1.0F / this.f_hb.k;
         ((float[])((float[])this.Eb[18]))[5] = this.f_hb.t;
         ((float[])((float[])this.Eb[18]))[7] = this.f_hb.L;
         ((float[])((float[])this.Eb[18]))[2] = this.f_hb.z;
         ((int[])((int[])this.Eb[1]))[4] = this.f_hb.K;

         float var25;
         float var24;
         float var27;
         float var26;
         int var29;
         int var28;
         int var31;
         int var30;
         for(var31 = 0; var31 < this.Ib; ++var31) {
            var28 = this.A[var31];
            var29 = this.I[var31];
            var30 = this.O[var31];
            var24 = ((float[])((float[])var22[0]))[0] * (float)var28 + ((float[])((float[])var22[0]))[4] * (float)var29 + ((float[])((float[])var22[0]))[8] * (float)var30 + ((float[])((float[])var22[0]))[12];
            var25 = ((float[])((float[])var22[0]))[1] * (float)var28 + ((float[])((float[])var22[0]))[5] * (float)var29 + ((float[])((float[])var22[0]))[9] * (float)var30 + ((float[])((float[])var22[0]))[13];
            var26 = ((float[])((float[])var22[0]))[2] * (float)var28 + ((float[])((float[])var22[0]))[6] * (float)var29 + ((float[])((float[])var22[0]))[10] * (float)var30 + ((float[])((float[])var22[0]))[14];
            var27 = ((float[])((float[])var22[0]))[3] * (float)var28 + ((float[])((float[])var22[0]))[7] * (float)var29 + ((float[])((float[])var22[0]))[11] * (float)var30 + ((float[])((float[])var22[0]))[15];
            this.f_sb[var31] = ((float[])((float[])this.Eb[18]))[2] + ((float[])((float[])this.Eb[18]))[0] * var26 / var27;
            this.J[var31] = var27;
            if(var26 >= -var27) {
               this.p[var31] = (float)((int)(((float[])((float[])this.Eb[18]))[5] + ((float[])((float[])this.Eb[18]))[3] * var24 / var27));
               this.Ab[var31] = (float)((int)(((float[])((float[])this.Eb[18]))[7] + ((float[])((float[])this.Eb[18]))[1] * var25 / var27));
            } else {
               this.p[var31] = -5000.0F;
               var23 = true;
            }

            if(((boolean[])((boolean[])this.Eb[2]))[2]) {
               this.w[var31] = (int)(((float[])((float[])var5[0]))[13] + ((float[])((float[])var5[0]))[1] * (float)var28 + ((float[])((float[])var5[0]))[5] * (float)var29 + ((float[])((float[])var5[0]))[9] * (float)var30);
            }
         }

         float var38;
         float var39;
         float var37;
         float var42;
         float var40;
         float var41;
         if(this.s != null) {
            for(var31 = 0; var31 < this.f_mb; ++var31) {
               Object[] var32 = this.s[var31];
               Object[] var33 = this.V[var31];
               short var34 = this.Hb[((int[])((int[])var32[1]))[0]];
               short var35 = this.f_ib[((int[])((int[])var32[1]))[0]];
               short var36 = this.yb[((int[])((int[])var32[1]))[0]];
               var28 = (this.A[var34] + this.A[var35] + this.A[var36]) / 3;
               var29 = (this.I[var34] + this.I[var35] + this.I[var36]) / 3;
               var30 = (this.O[var34] + this.O[var35] + this.O[var36]) / 3;
               var24 = ((float[])((float[])var22[0]))[0] * (float)var28 + ((float[])((float[])var22[0]))[4] * (float)var29 + ((float[])((float[])var22[0]))[8] * (float)var30 + ((float[])((float[])var22[0]))[12];
               var25 = ((float[])((float[])var22[0]))[1] * (float)var28 + ((float[])((float[])var22[0]))[5] * (float)var29 + ((float[])((float[])var22[0]))[9] * (float)var30 + ((float[])((float[])var22[0]))[13];
               var26 = ((float[])((float[])var22[0]))[2] * (float)var28 + ((float[])((float[])var22[0]))[6] * (float)var29 + ((float[])((float[])var22[0]))[10] * (float)var30 + ((float[])((float[])var22[0]))[14];
               var27 = ((float[])((float[])var22[0]))[3] * (float)var28 + ((float[])((float[])var22[0]))[7] * (float)var29 + ((float[])((float[])var22[0]))[11] * (float)var30 + ((float[])((float[])var22[0]))[15];
               var26 += ((float[])((float[])var7[0]))[2] * (float)((int[])((int[])var33[1]))[1] + ((float[])((float[])var7[0]))[6] * (float)((int[])((int[])var33[1]))[6];
               var27 += ((float[])((float[])var7[0]))[3] * (float)((int[])((int[])var33[1]))[1] + ((float[])((float[])var7[0]))[7] * (float)((int[])((int[])var33[1]))[6];
               if(var26 > -var27) {
                  var24 += ((float[])((float[])var7[0]))[0] * (float)((int[])((int[])var33[1]))[1] + ((float[])((float[])var7[0]))[4] * (float)((int[])((int[])var33[1]))[6];
                  var25 += ((float[])((float[])var7[0]))[1] * (float)((int[])((int[])var33[1]))[1] + ((float[])((float[])var7[0]))[5] * (float)((int[])((int[])var33[1]))[6];
                  var37 = ((float[])((float[])this.f_rb[10]))[0] + ((float[])((float[])this.f_rb[10]))[2] * var24 / var27;
                  var38 = ((float[])((float[])this.f_rb[10]))[1] + ((float[])((float[])this.f_rb[10]))[3] * var25 / var27;
                  var39 = ((float[])((float[])var33[0]))[2] * (float)((short[])((short[])var32[0]))[1];
                  var40 = ((float[])((float[])var33[0]))[1] * (float)((short[])((short[])var32[0]))[0];
                  var41 = var24 + ((float[])((float[])var7[0]))[0] * var39 + ((float[])((float[])var7[0]))[4] * var40;
                  var42 = var25 + ((float[])((float[])var7[0]))[1] * var39 + ((float[])((float[])var7[0]))[5] * var40;
                  float var43 = var27 + ((float[])((float[])var7[0]))[3] * var39 + ((float[])((float[])var7[0]))[7] * var40;
                  float var44 = ((float[])((float[])this.f_rb[10]))[0] + ((float[])((float[])this.f_rb[10]))[2] * var41 / var43;
                  float var45 = ((float[])((float[])this.f_rb[10]))[1] + ((float[])((float[])this.f_rb[10]))[3] * var42 / var43;
                  ((int[])((int[])var33[1]))[5] = (int)var37;
                  ((int[])((int[])var33[1]))[2] = (int)var38;
                  ((float[])((float[])var33[0]))[0] = ((float[])((float[])this.f_rb[10]))[5] + ((float[])((float[])this.f_rb[10]))[4] * (var26 - ((float[])((float[])var7[0]))[10] * (float)((int[])((int[])var32[1]))[1]) / var27;
                  ((int[])((int[])var33[1]))[4] = (int)(var44 < var37?var37 - var44:var44 - var37);
                  ((int[])((int[])var33[1]))[7] = (int)(var45 < var38?var38 - var45:var45 - var38);
               } else {
                  ((int[])((int[])var33[1]))[7] = 0;
                  ((int[])((int[])var33[1]))[4] = 0;
               }
            }
         }

         boolean var57;
         boolean var56;
         if(var2 != null) {
            var56 = false;
            var57 = true;
            int var55 = this.f_jb + this.f_bb >> 1;
            int var60 = this.f_db + this.f_ob >> 1;
            short var53 = this.f_nb;
            var24 = ((float[])((float[])var22[0]))[0] * (float)var55 + ((float[])((float[])var22[0]))[4] * (float)var53 + ((float[])((float[])var22[0]))[8] * (float)var60 + ((float[])((float[])var22[0]))[12];
            var25 = ((float[])((float[])var22[0]))[1] * (float)var55 + ((float[])((float[])var22[0]))[5] * (float)var53 + ((float[])((float[])var22[0]))[9] * (float)var60 + ((float[])((float[])var22[0]))[13];
            var26 = ((float[])((float[])var22[0]))[2] * (float)var55 + ((float[])((float[])var22[0]))[6] * (float)var53 + ((float[])((float[])var22[0]))[10] * (float)var60 + ((float[])((float[])var22[0]))[14];
            var27 = ((float[])((float[])var22[0]))[3] * (float)var55 + ((float[])((float[])var22[0]))[7] * (float)var53 + ((float[])((float[])var22[0]))[11] * (float)var60 + ((float[])((float[])var22[0]))[15];
            if(var26 >= -var27) {
               var2.f_i = (int)(((float[])((float[])this.f_rb[10]))[0] + ((float[])((float[])this.f_rb[10]))[2] * var24 / var27);
               var2.f_l = (int)(((float[])((float[])this.f_rb[10]))[1] + ((float[])((float[])this.f_rb[10]))[3] * var25 / var27);
            } else {
               var56 = true;
            }

            var53 = this.q;
            float var59 = ((float[])((float[])var22[0]))[0] * (float)var55 + ((float[])((float[])var22[0]))[4] * (float)var53 + ((float[])((float[])var22[0]))[8] * (float)var60 + ((float[])((float[])var22[0]))[12];
            float var58 = ((float[])((float[])var22[0]))[1] * (float)var55 + ((float[])((float[])var22[0]))[5] * (float)var53 + ((float[])((float[])var22[0]))[9] * (float)var60 + ((float[])((float[])var22[0]))[13];
            var37 = ((float[])((float[])var22[0]))[2] * (float)var55 + ((float[])((float[])var22[0]))[6] * (float)var53 + ((float[])((float[])var22[0]))[10] * (float)var60 + ((float[])((float[])var22[0]))[14];
            var38 = ((float[])((float[])var22[0]))[3] * (float)var55 + ((float[])((float[])var22[0]))[7] * (float)var53 + ((float[])((float[])var22[0]))[11] * (float)var60 + ((float[])((float[])var22[0]))[15];
            if(var37 >= -var38) {
               var2.n = (int)(((float[])((float[])this.f_rb[10]))[0] + ((float[])((float[])this.f_rb[10]))[2] * var59 / var38);
               var2.m = (int)(((float[])((float[])this.f_rb[10]))[1] + ((float[])((float[])this.f_rb[10]))[3] * var58 / var38);
            } else {
               var56 = true;
            }

            if(var56) {
               if(var26 < -var27 && var37 < -var38) {
                  var57 = false;
               } else if(var26 < -var27) {
                  var39 = (var26 + var27) / (var37 + var38) - 1.0F;
                  var40 = var24 + var39 * (var59 - var24);
                  var41 = var25 + var39 * (var58 - var25);
                  var42 = var27 + var39 * (var38 - var27);
                  var2.f_i = (int)(((float[])((float[])this.f_rb[10]))[0] + ((float[])((float[])this.f_rb[10]))[2] * var40 / var42);
                  var2.f_l = (int)(((float[])((float[])this.f_rb[10]))[1] + ((float[])((float[])this.f_rb[10]))[3] * var41 / var42);
               } else if(var37 < -var38) {
                  var39 = (var37 + var38) / (var26 + var27) - 1.0F;
                  var40 = var59 + var39 * (var24 - var59);
                  var41 = var58 + var39 * (var25 - var58);
                  var42 = var38 + var39 * (var27 - var38);
                  var2.n = (int)(((float[])((float[])this.f_rb[10]))[0] + ((float[])((float[])this.f_rb[10]))[2] * var40 / var42);
                  var2.m = (int)(((float[])((float[])this.f_rb[10]))[1] + ((float[])((float[])this.f_rb[10]))[3] * var41 / var42);
               }
            }

            if(var57) {
               if(var26 / var27 > var37 / var38) {
                  var39 = var24 + ((float[])((float[])var7[0]))[0] * (float)this.Y + ((float[])((float[])var7[0]))[12];
                  var40 = var27 + ((float[])((float[])var7[0]))[3] * (float)this.Y + ((float[])((float[])var7[0]))[15];
                  var2.j = (int)(((float[])((float[])this.f_rb[10]))[0] - (float)var2.f_i + ((float[])((float[])this.f_rb[10]))[2] * var39 / var40);
               } else {
                  var39 = var59 + ((float[])((float[])var7[0]))[0] * (float)this.Y + ((float[])((float[])var7[0]))[12];
                  var40 = var38 + ((float[])((float[])var7[0]))[3] * (float)this.Y + ((float[])((float[])var7[0]))[15];
                  var2.j = (int)(((float[])((float[])this.f_rb[10]))[0] - (float)var2.n + ((float[])((float[])this.f_rb[10]))[2] * var39 / var40);
               }

               var2.k = true;
            }
         }

         this.b(true);
         this.f_hb.o = (var3 & 1) == 0;
         this.f_hb.x = false;

         try {
            var56 = this.f_rb[7] != null;
            var57 = this.f_rb[12] != null;
            boolean var54 = (var3 & 4) != 0;
            if(var56) {
               if(var57) {
                  if(var54) {
                     this.d(var23, ((boolean[])((boolean[])this.Eb[2]))[0] && var21 > ((float[])((float[])this.Eb[18]))[4] || ((boolean[])((boolean[])this.Eb[2]))[2]);
                  } else {
                     this.c(var23, ((boolean[])((boolean[])this.Eb[2]))[0] && var21 > ((float[])((float[])this.Eb[18]))[4] || ((boolean[])((boolean[])this.Eb[2]))[2]);
                  }
               } else if(var54) {
                  this.a(var23, ((boolean[])((boolean[])this.Eb[2]))[0] && var21 > ((float[])((float[])this.Eb[18]))[4] || ((boolean[])((boolean[])this.Eb[2]))[2]);
               } else {
                  this.e(var23, ((boolean[])((boolean[])this.Eb[2]))[0] && var21 > ((float[])((float[])this.Eb[18]))[4] || ((boolean[])((boolean[])this.Eb[2]))[2]);
               }
            } else if(var57) {
               if(var54) {
                  this.b(var23, ((boolean[])((boolean[])this.Eb[2]))[0] && var21 > ((float[])((float[])this.Eb[18]))[4] || ((boolean[])((boolean[])this.Eb[2]))[2]);
               } else {
                  this.g(var23, ((boolean[])((boolean[])this.Eb[2]))[0] && var21 > ((float[])((float[])this.Eb[18]))[4] || ((boolean[])((boolean[])this.Eb[2]))[2]);
               }
            } else if(var54) {
               this.f(var23, ((boolean[])((boolean[])this.Eb[2]))[0] && var21 > ((float[])((float[])this.Eb[18]))[4] || ((boolean[])((boolean[])this.Eb[2]))[2]);
            } else {
               this.h(var23, ((boolean[])((boolean[])this.Eb[2]))[0] && var21 > ((float[])((float[])this.Eb[18]))[4] || ((boolean[])((boolean[])this.Eb[2]))[2]);
            }
         } catch (Exception var49) {
            ;
         }

         if(this.s != null) {
            for(var31 = 0; var31 < this.K; ++var31) {
               this.f_lb[var31] = -1;
            }
         }

         this.f_hb = null;
         if(((int[])((int[])this.f_rb[1]))[10] > 1) {
            synchronized(this) {
               this.Jb = false;
               this.notifyAll();
            }
         }

      }
   }

   private final void c(int var1) {
      short var2;
      short var3;
      short var4;
      float var6;
      float var7;
      if(!((boolean[])((boolean[])this.Eb[2]))[2]) {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         Object[] var5 = (Object[])((Object[])this.f_rb[13]);
         var6 = ((float[])((float[])var5[0]))[10];
         var7 = ((float[])((float[])var5[0]))[14];
         float var8 = ((float[])((float[])var5[0]))[11];
         float var9 = ((float[])((float[])var5[0]))[15];
         float var10 = var7 * var8 - var6 * var9;
         float var11 = (this.f_sb[var2] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var12 = (this.f_sb[var3] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var13 = (this.f_sb[var4] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var14 = var11 * var10 / (var11 * var8 - var6);
         float var15 = var12 * var10 / (var12 * var8 - var6);
         float var16 = var13 * var10 / (var13 * var8 - var6);
         float var17 = (var14 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var17 > 1.0F) {
            var17 = 1.0F;
         } else if(var17 < 0.0F) {
            var17 = 0.0F;
         }

         float var18 = (var15 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var18 > 1.0F) {
            var18 = 1.0F;
         } else if(var18 < 0.0F) {
            var18 = 0.0F;
         }

         float var19 = (var16 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var19 > 1.0F) {
            var19 = 1.0F;
         } else if(var19 < 0.0F) {
            var19 = 0.0F;
         }

         float var20 = var17 + var18 + var19;
         if(var20 >= 3.0F) {
            return;
         }

         if(var20 <= 0.0F) {
            this.q(var1);
            return;
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var21 = -16777216;
            if(this.t != null) {
               var21 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var22 = var21 | this.M[var1] & 16777215;
               this.f_hb.c(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var22, var22, var22, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.c(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var21 | this.M[var1] & 16777215, var21 | this.Gb[var1] & 16777215, var21 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.f(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 79, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 77, var18 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 116, var19 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.f(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 120, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 118, var18 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 75, var19 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      } else {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         float var23 = 0.0F;
         var6 = 0.0F;
         var7 = 0.0F;
         if(this.w[var2] > ((int[])((int[])this.Eb[1]))[3]) {
            var23 = 1.0F;
         } else if(this.w[var2] > ((int[])((int[])this.Eb[1]))[2]) {
            var23 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var2]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var3] > ((int[])((int[])this.Eb[1]))[3]) {
            var6 = 1.0F;
         } else if(this.w[var3] > ((int[])((int[])this.Eb[1]))[2]) {
            var6 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var3]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var4] > ((int[])((int[])this.Eb[1]))[3]) {
            var7 = 1.0F;
         } else if(this.w[var4] > ((int[])((int[])this.Eb[1]))[2]) {
            var7 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var4]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var24 = -16777216;
            if(this.t != null) {
               var24 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var25 = var24 | this.M[var1] & 16777215;
               this.f_hb.c(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var25, var25, var25, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.c(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var24 | this.M[var1] & 16777215, var24 | this.Gb[var1] & 16777215, var24 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.f(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 58, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 110, var6 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 78, var7 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.f(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 107, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 74, var6 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 122, var7 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      }

   }

   final int MA() {
      if(!this.xb) {
         this.p();
      }

      return this.Y;
   }

   final void TA() {
      if(this.Z) {
         for(int var1 = 0; var1 < this.Ib; ++var1) {
            this.A[var1] = this.A[var1] + 7 >> 4;
            this.I[var1] = this.I[var1] + 7 >> 4;
            this.O[var1] = this.O[var1] + 7 >> 4;
         }

         this.Z = false;
      }

      if(this.U) {
         this.r();
         this.U = false;
      }

      this.xb = false;
   }

   final void YA(int var1, int var2, int var3, int var4) {
      int var5;
      int var10;
      if(var1 == 0) {
         var5 = 0;
         this.zb = 0;
         this.f_ub = 0;
         this.u = 0;

         for(var10 = 0; var10 < this.Ib; ++var10) {
            this.zb += this.A[var10];
            this.f_ub += this.I[var10];
            this.u += this.O[var10];
            ++var5;
         }

         if(var5 > 0) {
            this.zb = this.zb / var5 + var2;
            this.f_ub = this.f_ub / var5 + var3;
            this.u = this.u / var5 + var4;
         } else {
            this.zb = var2;
            this.f_ub = var3;
            this.u = var4;
         }

      } else if(var1 == 1) {
         for(var5 = 0; var5 < this.Ib; ++var5) {
            this.A[var5] += var2;
            this.I[var5] += var3;
            this.O[var5] += var4;
         }

      } else {
         int var7;
         int var8;
         if(var1 == 2) {
            for(var5 = 0; var5 < this.Ib; ++var5) {
               this.A[var5] -= this.zb;
               this.I[var5] -= this.f_ub;
               this.O[var5] -= this.u;
               if(var4 != 0) {
                  var10 = tda.p[var4];
                  var7 = tda.k[var4];
                  var8 = this.I[var5] * var10 + this.A[var5] * var7 + 16383 >> 14;
                  this.I[var5] = this.I[var5] * var7 - this.A[var5] * var10 + 16383 >> 14;
                  this.A[var5] = var8;
               }

               if(var2 != 0) {
                  var10 = tda.p[var2];
                  var7 = tda.k[var2];
                  var8 = this.I[var5] * var7 - this.O[var5] * var10 + 16383 >> 14;
                  this.O[var5] = this.I[var5] * var10 + this.O[var5] * var7 + 16383 >> 14;
                  this.I[var5] = var8;
               }

               if(var3 != 0) {
                  var10 = tda.p[var3];
                  var7 = tda.k[var3];
                  var8 = this.O[var5] * var10 + this.A[var5] * var7 + 16383 >> 14;
                  this.O[var5] = this.O[var5] * var7 - this.A[var5] * var10 + 16383 >> 14;
                  this.A[var5] = var8;
               }

               this.A[var5] += this.zb;
               this.I[var5] += this.f_ub;
               this.O[var5] += this.u;
            }

         } else if(var1 == 3) {
            for(var5 = 0; var5 < this.Ib; ++var5) {
               this.A[var5] -= this.zb;
               this.I[var5] -= this.f_ub;
               this.O[var5] -= this.u;
               this.A[var5] = this.A[var5] * var2 / 128;
               this.I[var5] = this.I[var5] * var3 / 128;
               this.O[var5] = this.O[var5] * var4 / 128;
               this.A[var5] += this.zb;
               this.I[var5] += this.f_ub;
               this.O[var5] += this.u;
            }

         } else {
            Object[] var6;
            Object[] var11;
            if(var1 == 5) {
               for(var5 = 0; var5 < this.K; ++var5) {
                  var10 = (this.t[var5] & 255) + var2 * 8;
                  if(var10 < 0) {
                     var10 = 0;
                  } else if(var10 > 255) {
                     var10 = 255;
                  }

                  this.t[var5] = (byte)var10;
               }

               if(this.s != null) {
                  for(var5 = 0; var5 < this.f_mb; ++var5) {
                     var6 = this.s[var5];
                     var11 = this.V[var5];
                     ((int[])((int[])var11[1]))[3] = ((int[])((int[])var11[1]))[3] & 16777215 | 255 - (this.t[((int[])((int[])var6[1]))[0]] & 255) << 24;
                  }
               }

            } else if(var1 == 7) {
               for(var5 = 0; var5 < this.K; ++var5) {
                  var10 = this.f_tb[var5] & '\uffff';
                  var7 = var10 >> 10 & 63;
                  var8 = var10 >> 7 & 7;
                  int var9 = var10 & 127;
                  var7 = var7 + var2 & 63;
                  var8 += var3;
                  if(var8 < 0) {
                     var8 = 0;
                  } else if(var8 > 7) {
                     var8 = 7;
                  }

                  var9 += var4;
                  if(var9 < 0) {
                     var9 = 0;
                  } else if(var9 > 127) {
                     var9 = 127;
                  }

                  this.f_tb[var5] = (short)(var7 << 10 | var8 << 7 | var9);
               }

               this.U = true;
               if(this.s != null) {
                  for(var5 = 0; var5 < this.f_mb; ++var5) {
                     var6 = this.s[var5];
                     var11 = this.V[var5];
                     ((int[])((int[])var11[1]))[3] = ((int[])((int[])var11[1]))[3] & -16777216 | en.c[spa.a(this.f_tb[((int[])((int[])var6[1]))[0]] & '\uffff', (byte)68) & '\uffff'] & 16777215;
                  }
               }

            } else if(var1 == 8) {
               for(var5 = 0; var5 < this.f_mb; ++var5) {
                  var6 = this.V[var5];
                  ((int[])((int[])var6[1]))[1] += var2;
                  ((int[])((int[])var6[1]))[6] += var3;
               }

            } else if(var1 == 10) {
               for(var5 = 0; var5 < this.f_mb; ++var5) {
                  var6 = this.V[var5];
                  ((float[])((float[])var6[0]))[2] = ((float[])((float[])var6[0]))[2] * (float)var2 / 128.0F;
                  ((float[])((float[])var6[0]))[1] = ((float[])((float[])var6[0]))[1] * (float)var3 / 128.0F;
               }

            } else if(var1 == 9) {
               for(var5 = 0; var5 < this.f_mb; ++var5) {
                  var6 = this.V[var5];
                  ((int[])((int[])var6[1]))[0] = ((int[])((int[])var6[1]))[0] + var2 & 16383;
               }

            }
         }
      }
   }

   final void ta(int var1, int var2, aa var3, aa var4, int var5, int var6, int var7) {
      if(var1 == 3) {
         if((this.R & 7) != 7) {
            throw new IllegalStateException();
         }
      } else if((this.R & 2) != 2) {
         throw new IllegalStateException();
      }

      if(!this.xb) {
         this.p();
      }

      int var8 = var5 + this.f_jb;
      int var9 = var5 + this.f_bb;
      int var10 = var7 + this.f_db;
      int var11 = var7 + this.f_ob;
      if(var1 == 4 || var8 >= 0 && var9 + var3.g >> var3.a < var3.f_i && var10 >= 0 && var11 + var3.g >> var3.a < var3.h) {
         int[][] var12 = var3.f;
         int[][] var13 = (int[][])null;
         if(var4 != null) {
            var13 = var4.f;
         }

         if(var1 != 4 && var1 != 5) {
            var8 >>= var3.a;
            var9 = var9 + (var3.g - 1) >> var3.a;
            var10 >>= var3.a;
            var11 = var11 + (var3.g - 1) >> var3.a;
            if(var12[var8][var10] == var6 && var12[var9][var10] == var6 && var12[var8][var11] == var6 && var12[var9][var11] == var6) {
               return;
            }
         } else {
            if(var4 == null) {
               return;
            }

            if(var8 < 0 || var9 + var4.g >> var4.a >= var4.f_i || var10 < 0 || var11 + var4.g >> var4.a >= var4.h) {
               return;
            }
         }

         synchronized(this) {
            int var15;
            int var17;
            int var16;
            int var19;
            int var18;
            int var21;
            int var20;
            int var23;
            int var22;
            int var25;
            int var24;
            if(var1 == 1) {
               var15 = var3.g - 1;

               for(var16 = 0; var16 < this.C; ++var16) {
                  var17 = this.A[var16] + var5;
                  var18 = this.O[var16] + var7;
                  var19 = var17 & var15;
                  var20 = var18 & var15;
                  var21 = var17 >> var3.a;
                  var22 = var18 >> var3.a;
                  var23 = var12[var21][var22] * (var3.g - var19) + var12[var21 + 1][var22] * var19 >> var3.a;
                  var24 = var12[var21][var22 + 1] * (var3.g - var19) + var12[var21 + 1][var22 + 1] * var19 >> var3.a;
                  var25 = var23 * (var3.g - var20) + var24 * var20 >> var3.a;
                  this.I[var16] = this.I[var16] + var25 - var6;
               }

               for(var16 = this.C; var16 < this.Ib; ++var16) {
                  var17 = this.A[var16] + var5;
                  var18 = this.O[var16] + var7;
                  var19 = var17 & var15;
                  var20 = var18 & var15;
                  var21 = var17 >> var3.a;
                  var22 = var18 >> var3.a;
                  if(var21 >= 0 && var21 < var12.length - 1 && var22 >= 0 && var22 < var12[0].length - 1) {
                     var23 = var12[var21][var22] * (var3.g - var19) + var12[var21 + 1][var22] * var19 >> var3.a;
                     var24 = var12[var21][var22 + 1] * (var3.g - var19) + var12[var21 + 1][var22 + 1] * var19 >> var3.a;
                     var25 = var23 * (var3.g - var20) + var24 * var20 >> var3.a;
                     this.I[var16] = this.I[var16] + var25 - var6;
                  }
               }
            } else {
               int var26;
               if(var1 == 2) {
                  var15 = var3.g - 1;

                  for(var16 = 0; var16 < this.C; ++var16) {
                     var17 = (this.I[var16] << 16) / this.f_nb;
                     if(var17 < var2) {
                        var18 = this.A[var16] + var5;
                        var19 = this.O[var16] + var7;
                        var20 = var18 & var15;
                        var21 = var19 & var15;
                        var22 = var18 >> var3.a;
                        var23 = var19 >> var3.a;
                        var24 = var12[var22][var23] * (var3.g - var20) + var12[var22 + 1][var23] * var20 >> var3.a;
                        var25 = var12[var22][var23 + 1] * (var3.g - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.a;
                        var26 = var24 * (var3.g - var21) + var25 * var21 >> var3.a;
                        this.I[var16] += (var26 - var6) * (var2 - var17) / var2;
                     } else {
                        this.I[var16] = this.I[var16];
                     }
                  }

                  for(var16 = this.C; var16 < this.Ib; ++var16) {
                     var17 = (this.I[var16] << 16) / this.f_nb;
                     if(var17 < var2) {
                        var18 = this.A[var16] + var5;
                        var19 = this.O[var16] + var7;
                        var20 = var18 & var15;
                        var21 = var19 & var15;
                        var22 = var18 >> var3.a;
                        var23 = var19 >> var3.a;
                        if(var22 >= 0 && var22 < var3.f_i - 1 && var23 >= 0 && var23 < var3.h - 1) {
                           var24 = var12[var22][var23] * (var3.g - var20) + var12[var22 + 1][var23] * var20 >> var3.a;
                           var25 = var12[var22][var23 + 1] * (var3.g - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.a;
                           var26 = var24 * (var3.g - var21) + var25 * var21 >> var3.a;
                           this.I[var16] += (var26 - var6) * (var2 - var17) / var2;
                        }
                     } else {
                        this.I[var16] = this.I[var16];
                     }
                  }
               } else if(var1 == 3) {
                  var15 = (var2 & 255) * 4;
                  var16 = (var2 >> 8 & 255) * 4;
                  var17 = (var2 >> 16 & 255) << 6;
                  var18 = (var2 >> 24 & 255) << 6;
                  if(var5 - (var15 >> 1) < 0 || var5 + (var15 >> 1) + var3.g >= var3.f_i << var3.a || var7 - (var16 >> 1) < 0 || var7 + (var16 >> 1) + var3.g >= var3.h << var3.a) {
                     return;
                  }

                  this.a(var15, var18, var3, var16, var7, (byte)126, var6, var17, var5);
               } else if(var1 == 4) {
                  var15 = var4.g - 1;
                  var16 = this.q - this.f_nb;

                  for(var17 = 0; var17 < this.C; ++var17) {
                     var18 = this.A[var17] + var5;
                     var19 = this.O[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var4.a;
                     var23 = var19 >> var4.a;
                     var24 = var13[var22][var23] * (var4.g - var20) + var13[var22 + 1][var23] * var20 >> var4.a;
                     var25 = var13[var22][var23 + 1] * (var4.g - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.a;
                     var26 = var24 * (var4.g - var21) + var25 * var21 >> var4.a;
                     this.I[var17] = this.I[var17] + (var26 - var6) + var16;
                  }

                  for(var17 = this.C; var17 < this.Ib; ++var17) {
                     var18 = this.A[var17] + var5;
                     var19 = this.O[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var4.a;
                     var23 = var19 >> var4.a;
                     if(var22 >= 0 && var22 < var4.f_i - 1 && var23 >= 0 && var23 < var4.h - 1) {
                        var24 = var13[var22][var23] * (var4.g - var20) + var13[var22 + 1][var23] * var20 >> var4.a;
                        var25 = var13[var22][var23 + 1] * (var4.g - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.a;
                        var26 = var24 * (var4.g - var21) + var25 * var21 >> var4.a;
                        this.I[var17] = this.I[var17] + (var26 - var6) + var16;
                     }
                  }
               } else if(var1 == 5) {
                  var15 = var4.g - 1;
                  var16 = this.q - this.f_nb;

                  int var27;
                  int var28;
                  for(var17 = 0; var17 < this.C; ++var17) {
                     var18 = this.A[var17] + var5;
                     var19 = this.O[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var3.a;
                     var23 = var19 >> var3.a;
                     var24 = var12[var22][var23] * (var3.g - var20) + var12[var22 + 1][var23] * var20 >> var3.a;
                     var25 = var12[var22][var23 + 1] * (var3.g - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.a;
                     var26 = var24 * (var3.g - var21) + var25 * var21 >> var3.a;
                     var24 = var13[var22][var23] * (var4.g - var20) + var13[var22 + 1][var23] * var20 >> var4.a;
                     var25 = var13[var22][var23 + 1] * (var4.g - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.a;
                     var27 = var24 * (var4.g - var21) + var25 * var21 >> var4.a;
                     var28 = var26 - var27 - var2;
                     this.I[var17] = ((this.I[var17] << 8) / var16 * var28 >> 8) - (var6 - var26);
                  }

                  for(var17 = this.C; var17 < this.Ib; ++var17) {
                     var18 = this.A[var17] + var5;
                     var19 = this.O[var17] + var7;
                     var20 = var18 & var15;
                     var21 = var19 & var15;
                     var22 = var18 >> var3.a;
                     var23 = var19 >> var3.a;
                     if(var22 >= 0 && var22 < var3.f_i - 1 && var22 < var4.f_i - 1 && var23 >= 0 && var23 < var3.h - 1 && var23 < var4.h - 1) {
                        var24 = var12[var22][var23] * (var3.g - var20) + var12[var22 + 1][var23] * var20 >> var3.a;
                        var25 = var12[var22][var23 + 1] * (var3.g - var20) + var12[var22 + 1][var23 + 1] * var20 >> var3.a;
                        var26 = var24 * (var3.g - var21) + var25 * var21 >> var3.a;
                        var24 = var13[var22][var23] * (var4.g - var20) + var13[var22 + 1][var23] * var20 >> var4.a;
                        var25 = var13[var22][var23 + 1] * (var4.g - var20) + var13[var22 + 1][var23 + 1] * var20 >> var4.a;
                        var27 = var24 * (var4.g - var21) + var25 * var21 >> var4.a;
                        var28 = var26 - var27 - var2;
                        this.I[var17] = ((this.I[var17] << 8) / var16 * var28 >> 8) - (var6 - var26);
                     }
                  }
               }
            }

            this.xb = false;
         }
      }
   }

   final void v(int var1, int var2, int var3) {
      if(var1 != 128 && (this.R & 1) != 1) {
         throw new IllegalStateException();
      } else if(var2 != 128 && (this.R & 2) != 2) {
         throw new IllegalStateException();
      } else if(var3 != 128 && (this.R & 4) != 4) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            for(int var5 = 0; var5 < this.Ib; ++var5) {
               this.A[var5] = this.A[var5] * var1 >> 7;
               this.I[var5] = this.I[var5] * var2 >> 7;
               this.O[var5] = this.O[var5] * var3 >> 7;
            }

            this.xb = false;
         }
      }
   }

   private final int a(int var1, int var2) {
      var2 = var2 * (var1 & 127) >> 7;
      if(var2 < 2) {
         var2 = 2;
      } else if(var2 > 126) {
         var2 = 126;
      }

      return (var1 & '\uff80') + var2;
   }

   final int D() {
      if(!this.xb) {
         this.p();
      }

      return this.f_ob;
   }

   private final void r() {
      if(this.f_fb == 0) {
         this.b(false);
      } else {
         if(((int[])((int[])this.f_rb[1]))[10] > 1) {
            synchronized(this) {
               this.q();
            }
         } else {
            this.q();
         }

      }
   }

   private final void j() {
      synchronized(this) {
         int var2;
         int var3;
         for(var2 = 0; var2 < this.C; ++var2) {
            var3 = this.O[var2];
            this.O[var2] = this.A[var2];
            this.A[var2] = -var3;
            if(this.N[var2] != null) {
               var3 = this.N[var2].b;
               this.N[var2].b = this.N[var2].d;
               this.N[var2].d = -var3;
            }
         }

         if(this.f_vb != null) {
            for(var2 = 0; var2 < this.K; ++var2) {
               if(this.f_vb[var2] != null) {
                  var3 = this.f_vb[var2].c;
                  this.f_vb[var2].c = this.f_vb[var2].a;
                  this.f_vb[var2].a = -var3;
               }
            }
         }

         for(var2 = this.C; var2 < this.Ib; ++var2) {
            var3 = this.O[var2];
            this.O[var2] = this.A[var2];
            this.A[var2] = -var3;
         }

         this.f_fb = 0;
         this.xb = false;
      }
   }

   private final void d(int var1) {
      short var2;
      short var3;
      short var4;
      float var6;
      float var7;
      if(!((boolean[])((boolean[])this.Eb[2]))[2]) {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         Object[] var5 = (Object[])((Object[])this.f_rb[13]);
         var6 = ((float[])((float[])var5[0]))[10];
         var7 = ((float[])((float[])var5[0]))[14];
         float var8 = ((float[])((float[])var5[0]))[11];
         float var9 = ((float[])((float[])var5[0]))[15];
         float var10 = var7 * var8 - var6 * var9;
         float var11 = (this.f_sb[var2] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var12 = (this.f_sb[var3] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var13 = (this.f_sb[var4] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var14 = var11 * var10 / (var11 * var8 - var6);
         float var15 = var12 * var10 / (var12 * var8 - var6);
         float var16 = var13 * var10 / (var13 * var8 - var6);
         float var17 = (var14 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var17 > 1.0F) {
            var17 = 1.0F;
         } else if(var17 < 0.0F) {
            var17 = 0.0F;
         }

         float var18 = (var15 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var18 > 1.0F) {
            var18 = 1.0F;
         } else if(var18 < 0.0F) {
            var18 = 0.0F;
         }

         float var19 = (var16 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var19 > 1.0F) {
            var19 = 1.0F;
         } else if(var19 < 0.0F) {
            var19 = 0.0F;
         }

         float var20 = var17 + var18 + var19;
         if(var20 >= 3.0F) {
            return;
         }

         if(var20 <= 0.0F) {
            this.g(var1);
            return;
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var21 = -16777216;
            if(this.t != null) {
               var21 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var22 = var21 | this.M[var1] & 16777215;
               this.f_hb.f(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var22, var22, var22, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.f(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var21 | this.M[var1] & 16777215, var21 | this.Gb[var1] & 16777215, var21 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.h(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 88, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 81, var18 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 90, var19 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.h(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 126, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 102, var18 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 85, var19 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      } else {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         float var23 = 0.0F;
         var6 = 0.0F;
         var7 = 0.0F;
         if(this.w[var2] > ((int[])((int[])this.Eb[1]))[3]) {
            var23 = 1.0F;
         } else if(this.w[var2] > ((int[])((int[])this.Eb[1]))[2]) {
            var23 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var2]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var3] > ((int[])((int[])this.Eb[1]))[3]) {
            var6 = 1.0F;
         } else if(this.w[var3] > ((int[])((int[])this.Eb[1]))[2]) {
            var6 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var3]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var4] > ((int[])((int[])this.Eb[1]))[3]) {
            var7 = 1.0F;
         } else if(this.w[var4] > ((int[])((int[])this.Eb[1]))[2]) {
            var7 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var4]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var24 = -16777216;
            if(this.t != null) {
               var24 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var25 = var24 | this.M[var1] & 16777215;
               this.f_hb.f(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var25, var25, var25, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.f(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var24 | this.M[var1] & 16777215, var24 | this.Gb[var1] & 16777215, var24 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.h(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 96, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 94, var6 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 104, var7 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.h(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 65, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 117, var6 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 119, var7 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      }

   }

   private final void a(Thread var1) {
      Object[] var2 = ui.a(this.f_rb, (Runnable)var1);
      if(var2 != this.v) {
         this.v = var2;
         this.f_qb = (dpa[])((dpa[])this.v[14]);
         this.r = (dpa[])((dpa[])this.v[3]);
      }
   }

   private final boolean f(int var1) {
      return this.t == null?false:this.t[var1] != 0;
   }

   final int ra() {
      if(!this.xb) {
         this.p();
      }

      return this.f_kb;
   }

   private final void k(int var1) {
      short var2;
      short var3;
      short var4;
      float var6;
      float var7;
      if(!((boolean[])((boolean[])this.Eb[2]))[2]) {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         Object[] var5 = (Object[])((Object[])this.f_rb[13]);
         var6 = ((float[])((float[])var5[0]))[10];
         var7 = ((float[])((float[])var5[0]))[14];
         float var8 = ((float[])((float[])var5[0]))[11];
         float var9 = ((float[])((float[])var5[0]))[15];
         float var10 = var7 * var8 - var6 * var9;
         float var11 = (this.f_sb[var2] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var12 = (this.f_sb[var3] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var13 = (this.f_sb[var4] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var14 = var11 * var10 / (var11 * var8 - var6);
         float var15 = var12 * var10 / (var12 * var8 - var6);
         float var16 = var13 * var10 / (var13 * var8 - var6);
         float var17 = (var14 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var17 > 1.0F) {
            var17 = 1.0F;
         } else if(var17 < 0.0F) {
            var17 = 0.0F;
         }

         float var18 = (var15 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var18 > 1.0F) {
            var18 = 1.0F;
         } else if(var18 < 0.0F) {
            var18 = 0.0F;
         }

         float var19 = (var16 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var19 > 1.0F) {
            var19 = 1.0F;
         } else if(var19 < 0.0F) {
            var19 = 0.0F;
         }

         float var20 = var17 + var18 + var19;
         if(var20 >= 3.0F) {
            return;
         }

         if(var20 <= 0.0F) {
            this.o(var1);
            return;
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var21 = -16777216;
            if(this.t != null) {
               var21 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var22 = var21 | this.M[var1] & 16777215;
               this.f_hb.b(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var22, var22, var22, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.b(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var21 | this.M[var1] & 16777215, var21 | this.Gb[var1] & 16777215, var21 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.b(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 100, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 62, var18 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 98, var19 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.b(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 83, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 87, var18 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 81, var19 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      } else {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         float var23 = 0.0F;
         var6 = 0.0F;
         var7 = 0.0F;
         if(this.w[var2] > ((int[])((int[])this.Eb[1]))[3]) {
            var23 = 1.0F;
         } else if(this.w[var2] > ((int[])((int[])this.Eb[1]))[2]) {
            var23 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var2]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var3] > ((int[])((int[])this.Eb[1]))[3]) {
            var6 = 1.0F;
         } else if(this.w[var3] > ((int[])((int[])this.Eb[1]))[2]) {
            var6 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var3]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var4] > ((int[])((int[])this.Eb[1]))[3]) {
            var7 = 1.0F;
         } else if(this.w[var4] > ((int[])((int[])this.Eb[1]))[2]) {
            var7 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var4]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var24 = -16777216;
            if(this.t != null) {
               var24 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var25 = var24 | this.M[var1] & 16777215;
               this.f_hb.b(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var25, var25, var25, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.b(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var24 | this.M[var1] & 16777215, var24 | this.Gb[var1] & 16777215, var24 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.b(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 125, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 115, var6 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 84, var7 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.b(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 102, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 85, var6 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 66, var7 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      }

   }

   final boolean m() {
      return this.f_eb;
   }

   final void i(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8) {
      int var9 = var2.length;
      int var10;
      int var11;
      int var15;
      int var50;
      int var49;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         if(!this.Z) {
            for(var10 = 0; var10 < this.Ib; ++var10) {
               this.A[var10] <<= 4;
               this.I[var10] <<= 4;
               this.O[var10] <<= 4;
            }

            this.Z = true;
         }

         var10 = 0;
         this.zb = 0;
         this.f_ub = 0;
         this.u = 0;

         for(var11 = 0; var11 < var9; ++var11) {
            var50 = var2[var11];
            if(var50 < this.F.length) {
               int[] var51 = this.F[var50];

               for(var49 = 0; var49 < var51.length; ++var49) {
                  var15 = var51[var49];
                  if(this.f_ab == null || (var7 & this.f_ab[var15]) != 0) {
                     this.zb += this.A[var15];
                     this.f_ub += this.I[var15];
                     this.u += this.O[var15];
                     ++var10;
                  }
               }
            }
         }

         if(var10 > 0) {
            this.zb = this.zb / var10 + var3;
            this.f_ub = this.f_ub / var10 + var4;
            this.u = this.u / var10 + var5;
            this.S = true;
         } else {
            this.zb = var3;
            this.f_ub = var4;
            this.u = var5;
         }

      } else {
         int[] var12;
         int var13;
         if(var1 == 1) {
            if(var8 != null) {
               var10 = var8[0] * var3 + var8[1] * var4 + var8[2] * var5 + 8192 >> 14;
               var11 = var8[3] * var3 + var8[4] * var4 + var8[5] * var5 + 8192 >> 14;
               var50 = var8[6] * var3 + var8[7] * var4 + var8[8] * var5 + 8192 >> 14;
               var3 = var10;
               var4 = var11;
               var5 = var50;
            }

            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;
            if(!this.Z) {
               for(var10 = 0; var10 < this.Ib; ++var10) {
                  this.A[var10] <<= 4;
                  this.I[var10] <<= 4;
                  this.O[var10] <<= 4;
               }

               this.Z = true;
            }

            for(var10 = 0; var10 < var9; ++var10) {
               var11 = var2[var10];
               if(var11 < this.F.length) {
                  var12 = this.F[var11];

                  for(var13 = 0; var13 < var12.length; ++var13) {
                     var49 = var12[var13];
                     if(this.f_ab == null || (var7 & this.f_ab[var49]) != 0) {
                        this.A[var49] += var3;
                        this.I[var49] += var4;
                        this.O[var49] += var5;
                     }
                  }
               }
            }

         } else {
            int var17;
            int var16;
            int var19;
            int var18;
            int var21;
            int var20;
            int var23;
            int var22;
            int var24;
            int var27;
            int var26;
            int var28;
            int var30;
            int var34;
            int[] var35;
            int var32;
            int var33;
            int var38;
            int var39;
            int var36;
            int var37;
            int var40;
            if(var1 == 2) {
               if(var8 != null) {
                  if(!this.Z) {
                     for(var10 = 0; var10 < this.Ib; ++var10) {
                        this.A[var10] <<= 4;
                        this.I[var10] <<= 4;
                        this.O[var10] <<= 4;
                     }

                     this.Z = true;
                  }

                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var50 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var49 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.S) {
                     var16 = var8[0] * this.zb + var8[3] * this.f_ub + var8[6] * this.u + 8192 >> 14;
                     var17 = var8[1] * this.zb + var8[4] * this.f_ub + var8[7] * this.u + 8192 >> 14;
                     var18 = var8[2] * this.zb + var8[5] * this.f_ub + var8[8] * this.u + 8192 >> 14;
                     var16 += var13;
                     var17 += var49;
                     var18 += var15;
                     this.zb = var16;
                     this.f_ub = var17;
                     this.u = var18;
                     this.S = false;
                  }

                  int[] var52 = new int[9];
                  var17 = tda.k[var3];
                  var18 = tda.p[var3];
                  var19 = tda.k[var4];
                  var20 = tda.p[var4];
                  var21 = tda.k[var5];
                  var22 = tda.p[var5];
                  var23 = var18 * var21 + 8192 >> 14;
                  var24 = var18 * var22 + 8192 >> 14;
                  var52[0] = var19 * var21 + var20 * var24 + 8192 >> 14;
                  var52[1] = -var19 * var22 + var20 * var23 + 8192 >> 14;
                  var52[2] = var20 * var17 + 8192 >> 14;
                  var52[3] = var17 * var22 + 8192 >> 14;
                  var52[4] = var17 * var21 + 8192 >> 14;
                  var52[5] = -var18;
                  var52[6] = -var20 * var21 + var19 * var24 + 8192 >> 14;
                  var52[7] = var20 * var22 + var19 * var23 + 8192 >> 14;
                  var52[8] = var19 * var17 + 8192 >> 14;
                  int var53 = var52[0] * -this.zb + var52[1] * -this.f_ub + var52[2] * -this.u + 8192 >> 14;
                  var26 = var52[3] * -this.zb + var52[4] * -this.f_ub + var52[5] * -this.u + 8192 >> 14;
                  var27 = var52[6] * -this.zb + var52[7] * -this.f_ub + var52[8] * -this.u + 8192 >> 14;
                  var28 = var53 + this.zb;
                  int var54 = var26 + this.f_ub;
                  var30 = var27 + this.u;
                  int[] var55 = new int[9];

                  for(var32 = 0; var32 < 3; ++var32) {
                     for(var33 = 0; var33 < 3; ++var33) {
                        var34 = 0;

                        for(int var56 = 0; var56 < 3; ++var56) {
                           var34 += var52[var32 * 3 + var56] * var8[var33 * 3 + var56];
                        }

                        var55[var32 * 3 + var33] = var34 + 8192 >> 14;
                     }
                  }

                  var32 = var52[0] * var13 + var52[1] * var49 + var52[2] * var15 + 8192 >> 14;
                  var33 = var52[3] * var13 + var52[4] * var49 + var52[5] * var15 + 8192 >> 14;
                  var34 = var52[6] * var13 + var52[7] * var49 + var52[8] * var15 + 8192 >> 14;
                  var32 += var28;
                  var33 += var54;
                  var34 += var30;
                  var35 = new int[9];

                  for(var36 = 0; var36 < 3; ++var36) {
                     for(var37 = 0; var37 < 3; ++var37) {
                        var38 = 0;

                        for(var39 = 0; var39 < 3; ++var39) {
                           var38 += var8[var36 * 3 + var39] * var55[var37 + var39 * 3];
                        }

                        var35[var36 * 3 + var37] = var38 + 8192 >> 14;
                     }
                  }

                  var36 = var8[0] * var32 + var8[1] * var33 + var8[2] * var34 + 8192 >> 14;
                  var37 = var8[3] * var32 + var8[4] * var33 + var8[5] * var34 + 8192 >> 14;
                  var38 = var8[6] * var32 + var8[7] * var33 + var8[8] * var34 + 8192 >> 14;
                  var36 += var10;
                  var37 += var11;
                  var38 += var50;

                  for(var39 = 0; var39 < var9; ++var39) {
                     var40 = var2[var39];
                     if(var40 < this.F.length) {
                        int[] var41 = this.F[var40];

                        for(int var42 = 0; var42 < var41.length; ++var42) {
                           int var43 = var41[var42];
                           if(this.f_ab == null || (var7 & this.f_ab[var43]) != 0) {
                              int var44 = var35[0] * this.A[var43] + var35[1] * this.I[var43] + var35[2] * this.O[var43] + 8192 >> 14;
                              int var45 = var35[3] * this.A[var43] + var35[4] * this.I[var43] + var35[5] * this.O[var43] + 8192 >> 14;
                              int var46 = var35[6] * this.A[var43] + var35[7] * this.I[var43] + var35[8] * this.O[var43] + 8192 >> 14;
                              var44 += var36;
                              var45 += var37;
                              var46 += var38;
                              this.A[var43] = var44;
                              this.I[var43] = var45;
                              this.O[var43] = var46;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.F.length) {
                        var12 = this.F[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var49 = var12[var13];
                           if(this.f_ab == null || (var7 & this.f_ab[var49]) != 0) {
                              this.A[var49] -= this.zb;
                              this.I[var49] -= this.f_ub;
                              this.O[var49] -= this.u;
                              if(var5 != 0) {
                                 var15 = tda.p[var5];
                                 var16 = tda.k[var5];
                                 var17 = this.I[var49] * var15 + this.A[var49] * var16 + 16383 >> 14;
                                 this.I[var49] = this.I[var49] * var16 - this.A[var49] * var15 + 16383 >> 14;
                                 this.A[var49] = var17;
                              }

                              if(var3 != 0) {
                                 var15 = tda.p[var3];
                                 var16 = tda.k[var3];
                                 var17 = this.I[var49] * var16 - this.O[var49] * var15 + 16383 >> 14;
                                 this.O[var49] = this.I[var49] * var15 + this.O[var49] * var16 + 16383 >> 14;
                                 this.I[var49] = var17;
                              }

                              if(var4 != 0) {
                                 var15 = tda.p[var4];
                                 var16 = tda.k[var4];
                                 var17 = this.O[var49] * var15 + this.A[var49] * var16 + 16383 >> 14;
                                 this.O[var49] = this.O[var49] * var16 - this.A[var49] * var15 + 16383 >> 14;
                                 this.A[var49] = var17;
                              }

                              this.A[var49] += this.zb;
                              this.I[var49] += this.f_ub;
                              this.O[var49] += this.u;
                           }
                        }
                     }
                  }
               }

            } else if(var1 == 3) {
               if(var8 != null) {
                  if(!this.Z) {
                     for(var10 = 0; var10 < this.Ib; ++var10) {
                        this.A[var10] <<= 4;
                        this.I[var10] <<= 4;
                        this.O[var10] <<= 4;
                     }

                     this.Z = true;
                  }

                  var10 = var8[9] << 4;
                  var11 = var8[10] << 4;
                  var50 = var8[11] << 4;
                  var13 = var8[12] << 4;
                  var49 = var8[13] << 4;
                  var15 = var8[14] << 4;
                  if(this.S) {
                     var16 = var8[0] * this.zb + var8[3] * this.f_ub + var8[6] * this.u + 8192 >> 14;
                     var17 = var8[1] * this.zb + var8[4] * this.f_ub + var8[7] * this.u + 8192 >> 14;
                     var18 = var8[2] * this.zb + var8[5] * this.f_ub + var8[8] * this.u + 8192 >> 14;
                     var16 += var13;
                     var17 += var49;
                     var18 += var15;
                     this.zb = var16;
                     this.f_ub = var17;
                     this.u = var18;
                     this.S = false;
                  }

                  var16 = var3 << 15 >> 7;
                  var17 = var4 << 15 >> 7;
                  var18 = var5 << 15 >> 7;
                  var19 = var16 * -this.zb + 8192 >> 14;
                  var20 = var17 * -this.f_ub + 8192 >> 14;
                  var21 = var18 * -this.u + 8192 >> 14;
                  var22 = var19 + this.zb;
                  var23 = var20 + this.f_ub;
                  var24 = var21 + this.u;
                  int[] var25 = new int[]{var16 * var8[0] + 8192 >> 14, var16 * var8[3] + 8192 >> 14, var16 * var8[6] + 8192 >> 14, var17 * var8[1] + 8192 >> 14, var17 * var8[4] + 8192 >> 14, var17 * var8[7] + 8192 >> 14, var18 * var8[2] + 8192 >> 14, var18 * var8[5] + 8192 >> 14, var18 * var8[8] + 8192 >> 14};
                  var26 = var16 * var13 + 8192 >> 14;
                  var27 = var17 * var49 + 8192 >> 14;
                  var28 = var18 * var15 + 8192 >> 14;
                  var26 += var22;
                  var27 += var23;
                  var28 += var24;
                  int[] var29 = new int[9];

                  int var31;
                  for(var30 = 0; var30 < 3; ++var30) {
                     for(var31 = 0; var31 < 3; ++var31) {
                        var32 = 0;

                        for(var33 = 0; var33 < 3; ++var33) {
                           var32 += var8[var30 * 3 + var33] * var25[var31 + var33 * 3];
                        }

                        var29[var30 * 3 + var31] = var32 + 8192 >> 14;
                     }
                  }

                  var30 = var8[0] * var26 + var8[1] * var27 + var8[2] * var28 + 8192 >> 14;
                  var31 = var8[3] * var26 + var8[4] * var27 + var8[5] * var28 + 8192 >> 14;
                  var32 = var8[6] * var26 + var8[7] * var27 + var8[8] * var28 + 8192 >> 14;
                  var30 += var10;
                  var31 += var11;
                  var32 += var50;

                  for(var33 = 0; var33 < var9; ++var33) {
                     var34 = var2[var33];
                     if(var34 < this.F.length) {
                        var35 = this.F[var34];

                        for(var36 = 0; var36 < var35.length; ++var36) {
                           var37 = var35[var36];
                           if(this.f_ab == null || (var7 & this.f_ab[var37]) != 0) {
                              var38 = var29[0] * this.A[var37] + var29[1] * this.I[var37] + var29[2] * this.O[var37] + 8192 >> 14;
                              var39 = var29[3] * this.A[var37] + var29[4] * this.I[var37] + var29[5] * this.O[var37] + 8192 >> 14;
                              var40 = var29[6] * this.A[var37] + var29[7] * this.I[var37] + var29[8] * this.O[var37] + 8192 >> 14;
                              var38 += var30;
                              var39 += var31;
                              var40 += var32;
                              this.A[var37] = var38;
                              this.I[var37] = var39;
                              this.O[var37] = var40;
                           }
                        }
                     }
                  }
               } else {
                  for(var10 = 0; var10 < var9; ++var10) {
                     var11 = var2[var10];
                     if(var11 < this.F.length) {
                        var12 = this.F[var11];

                        for(var13 = 0; var13 < var12.length; ++var13) {
                           var49 = var12[var13];
                           if(this.f_ab == null || (var7 & this.f_ab[var49]) != 0) {
                              this.A[var49] -= this.zb;
                              this.I[var49] -= this.f_ub;
                              this.O[var49] -= this.u;
                              this.A[var49] = this.A[var49] * var3 / 128;
                              this.I[var49] = this.I[var49] * var4 / 128;
                              this.O[var49] = this.O[var49] * var5 / 128;
                              this.A[var49] += this.zb;
                              this.I[var49] += this.f_ub;
                              this.O[var49] += this.u;
                           }
                        }
                     }
                  }
               }

            } else {
               Object[] var47;
               Object[] var48;
               if(var1 == 5) {
                  if(this.D != null && this.t != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.D.length) {
                           var12 = this.D[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var49 = var12[var13];
                              if(this.X == null || (var7 & this.X[var49]) != 0) {
                                 var15 = (this.t[var49] & 255) + var3 * 8;
                                 if(var15 < 0) {
                                    var15 = 0;
                                 } else if(var15 > 255) {
                                    var15 = 255;
                                 }

                                 this.t[var49] = (byte)var15;
                              }
                           }
                        }
                     }

                     if(this.s != null) {
                        for(var10 = 0; var10 < this.f_mb; ++var10) {
                           var47 = this.s[var10];
                           var48 = this.V[var10];
                           ((int[])((int[])var48[1]))[3] = ((int[])((int[])var48[1]))[3] & 16777215 | 255 - (this.t[((int[])((int[])var47[1]))[0]] & 255) << 24;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.D != null) {
                     for(var10 = 0; var10 < var9; ++var10) {
                        var11 = var2[var10];
                        if(var11 < this.D.length) {
                           var12 = this.D[var11];

                           for(var13 = 0; var13 < var12.length; ++var13) {
                              var49 = var12[var13];
                              if(this.X == null || (var7 & this.X[var49]) != 0) {
                                 var15 = this.f_tb[var49] & '\uffff';
                                 var16 = var15 >> 10 & 63;
                                 var17 = var15 >> 7 & 7;
                                 var18 = var15 & 127;
                                 var16 = var16 + var3 & 63;
                                 var17 += var4;
                                 if(var17 < 0) {
                                    var17 = 0;
                                 } else if(var17 > 7) {
                                    var17 = 7;
                                 }

                                 var18 += var5;
                                 if(var18 < 0) {
                                    var18 = 0;
                                 } else if(var18 > 127) {
                                    var18 = 127;
                                 }

                                 this.f_tb[var49] = (short)(var16 << 10 | var17 << 7 | var18);
                              }
                           }

                           this.U = true;
                        }
                     }

                     if(this.s != null) {
                        for(var10 = 0; var10 < this.f_mb; ++var10) {
                           var47 = this.s[var10];
                           var48 = this.V[var10];
                           ((int[])((int[])var48[1]))[3] = ((int[])((int[])var48[1]))[3] & -16777216 | en.c[spa.a(this.f_tb[((int[])((int[])var47[1]))[0]] & '\uffff', (byte)68) & '\uffff'] & 16777215;
                        }
                     }
                  }

               } else {
                  Object[] var14;
                  if(var1 == 8) {
                     if(this.Kb != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.Kb.length) {
                              var12 = this.Kb[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.V[var12[var13]];
                                 ((int[])((int[])var14[1]))[1] += var3;
                                 ((int[])((int[])var14[1]))[6] += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.Kb != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.Kb.length) {
                              var12 = this.Kb[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.V[var12[var13]];
                                 ((float[])((float[])var14[0]))[2] = ((float[])((float[])var14[0]))[2] * (float)var3 / 128.0F;
                                 ((float[])((float[])var14[0]))[1] = ((float[])((float[])var14[0]))[1] * (float)var4 / 128.0F;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.Kb != null) {
                        for(var10 = 0; var10 < var9; ++var10) {
                           var11 = var2[var10];
                           if(var11 < this.Kb.length) {
                              var12 = this.Kb[var11];

                              for(var13 = 0; var13 < var12.length; ++var13) {
                                 var14 = this.V[var12[var13]];
                                 ((int[])((int[])var14[1]))[0] = ((int[])((int[])var14[1]))[0] + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   private final void e(boolean var1, boolean var2) {
      int var3;
      Object[] var4;
      if(this.s != null) {
         for(var3 = 0; var3 < this.f_mb; this.f_lb[((int[])((int[])var4[1]))[0]] = var3++) {
            var4 = this.s[var3];
         }
      }

      if(!this.B && this.s == null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            this.e(var3, var1, var2);
         }
      } else if((this.R & 256) == 0 && this.f_gb != null) {
         for(var3 = 0; var3 < this.K; ++var3) {
            short var6 = this.f_gb[var3];
            this.e(var6, var1, var2);
         }
      } else {
         for(var3 = 0; var3 < this.K; ++var3) {
            if(!this.f(var3) && !this.e(var3)) {
               this.e(var3, var1, var2);
            }
         }

         if(this.Bb == null) {
            for(var3 = 0; var3 < this.K; ++var3) {
               if(this.f(var3) || this.e(var3)) {
                  this.e(var3, var1, var2);
               }
            }
         } else {
            for(var3 = 0; var3 < 12; ++var3) {
               for(int var5 = 0; var5 < this.K; ++var5) {
                  if(this.Bb[var5] == var3 && (this.f(var5) || this.e(var5))) {
                     this.e(var5, var1, var2);
                  }
               }
            }
         }
      }

   }

   private final int l(int var1) {
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return var1;
   }

   private final boolean e(int var1) {
      return this.f_lb == null?false:this.f_lb[var1] != -1;
   }

   private final void i() {
      this.N = new wc[this.C];

      int var1;
      for(var1 = 0; var1 < this.C; ++var1) {
         this.N[var1] = new wc();
      }

      for(var1 = 0; var1 < this.K; ++var1) {
         short var2 = this.Hb[var1];
         short var3 = this.f_ib[var1];
         short var4 = this.yb[var1];
         int var5 = this.A[var3] - this.A[var2];
         int var6 = this.I[var3] - this.I[var2];
         int var7 = this.O[var3] - this.O[var2];
         int var8 = this.A[var4] - this.A[var2];
         int var9 = this.I[var4] - this.I[var2];
         int var10 = this.O[var4] - this.O[var2];
         int var11 = var6 * var10 - var9 * var7;
         int var12 = var7 * var8 - var10 * var5;

         int var13;
         for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
            var11 >>= 1;
            var12 >>= 1;
         }

         int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
         if(var14 <= 0) {
            var14 = 1;
         }

         var11 = var11 * 256 / var14;
         var12 = var12 * 256 / var14;
         var13 = var13 * 256 / var14;
         byte var15;
         if(this.Q == null) {
            var15 = 0;
         } else {
            var15 = this.Q[var1];
         }

         if(var15 == 0) {
            wc var16 = this.N[var2];
            var16.d += var11;
            var16.c += var12;
            var16.b += var13;
            ++var16.a;
            var16 = this.N[var3];
            var16.d += var11;
            var16.c += var12;
            var16.b += var13;
            ++var16.a;
            var16 = this.N[var4];
            var16.d += var11;
            var16.c += var12;
            var16.b += var13;
            ++var16.a;
         } else if(var15 == 1) {
            if(this.f_vb == null) {
               this.f_vb = new ifa[this.K];
            }

            ifa var17 = this.f_vb[var1] = new ifa();
            var17.a = var11;
            var17.b = var12;
            var17.c = var13;
         }
      }

   }

   final void a(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var2.length;
      int var9;
      int var10;
      int var14;
      int var20;
      if(var1 == 0) {
         var3 <<= 4;
         var4 <<= 4;
         var5 <<= 4;
         if(!this.Z) {
            for(var9 = 0; var9 < this.Ib; ++var9) {
               this.A[var9] <<= 4;
               this.I[var9] <<= 4;
               this.O[var9] <<= 4;
            }

            this.Z = true;
         }

         var9 = 0;
         this.zb = 0;
         this.f_ub = 0;
         this.u = 0;

         for(var10 = 0; var10 < var8; ++var10) {
            int var21 = var2[var10];
            if(var21 < this.F.length) {
               int[] var22 = this.F[var21];

               for(var20 = 0; var20 < var22.length; ++var20) {
                  var14 = var22[var20];
                  this.zb += this.A[var14];
                  this.f_ub += this.I[var14];
                  this.u += this.O[var14];
                  ++var9;
               }
            }
         }

         if(var9 > 0) {
            this.zb = this.zb / var9 + var3;
            this.f_ub = this.f_ub / var9 + var4;
            this.u = this.u / var9 + var5;
         } else {
            this.zb = var3;
            this.f_ub = var4;
            this.u = var5;
         }

      } else {
         int[] var11;
         int var12;
         if(var1 == 1) {
            var3 <<= 4;
            var4 <<= 4;
            var5 <<= 4;
            if(!this.Z) {
               for(var9 = 0; var9 < this.Ib; ++var9) {
                  this.A[var9] <<= 4;
                  this.I[var9] <<= 4;
                  this.O[var9] <<= 4;
               }

               this.Z = true;
            }

            for(var9 = 0; var9 < var8; ++var9) {
               var10 = var2[var9];
               if(var10 < this.F.length) {
                  var11 = this.F[var10];

                  for(var12 = 0; var12 < var11.length; ++var12) {
                     var20 = var11[var12];
                     this.A[var20] += var3;
                     this.I[var20] += var4;
                     this.O[var20] += var5;
                  }
               }
            }

         } else {
            int var15;
            int var16;
            if(var1 == 2) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.F.length) {
                     var11 = this.F[var10];
                     if((var6 & 1) == 0) {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var20 = var11[var12];
                           this.A[var20] -= this.zb;
                           this.I[var20] -= this.f_ub;
                           this.O[var20] -= this.u;
                           if(var5 != 0) {
                              var14 = tda.p[var5];
                              var15 = tda.k[var5];
                              var16 = this.I[var20] * var14 + this.A[var20] * var15 + 16383 >> 14;
                              this.I[var20] = this.I[var20] * var15 - this.A[var20] * var14 + 16383 >> 14;
                              this.A[var20] = var16;
                           }

                           if(var3 != 0) {
                              var14 = tda.p[var3];
                              var15 = tda.k[var3];
                              var16 = this.I[var20] * var15 - this.O[var20] * var14 + 16383 >> 14;
                              this.O[var20] = this.I[var20] * var14 + this.O[var20] * var15 + 16383 >> 14;
                              this.I[var20] = var16;
                           }

                           if(var4 != 0) {
                              var14 = tda.p[var4];
                              var15 = tda.k[var4];
                              var16 = this.O[var20] * var14 + this.A[var20] * var15 + 16383 >> 14;
                              this.O[var20] = this.O[var20] * var15 - this.A[var20] * var14 + 16383 >> 14;
                              this.A[var20] = var16;
                           }

                           this.A[var20] += this.zb;
                           this.I[var20] += this.f_ub;
                           this.O[var20] += this.u;
                        }
                     } else {
                        for(var12 = 0; var12 < var11.length; ++var12) {
                           var20 = var11[var12];
                           this.A[var20] -= this.zb;
                           this.I[var20] -= this.f_ub;
                           this.O[var20] -= this.u;
                           if(var3 != 0) {
                              var14 = tda.p[var3];
                              var15 = tda.k[var3];
                              var16 = this.I[var20] * var15 - this.O[var20] * var14 + 16383 >> 14;
                              this.O[var20] = this.I[var20] * var14 + this.O[var20] * var15 + 16383 >> 14;
                              this.I[var20] = var16;
                           }

                           if(var5 != 0) {
                              var14 = tda.p[var5];
                              var15 = tda.k[var5];
                              var16 = this.I[var20] * var14 + this.A[var20] * var15 + 16383 >> 14;
                              this.I[var20] = this.I[var20] * var15 - this.A[var20] * var14 + 16383 >> 14;
                              this.A[var20] = var16;
                           }

                           if(var4 != 0) {
                              var14 = tda.p[var4];
                              var15 = tda.k[var4];
                              var16 = this.O[var20] * var14 + this.A[var20] * var15 + 16383 >> 14;
                              this.O[var20] = this.O[var20] * var15 - this.A[var20] * var14 + 16383 >> 14;
                              this.A[var20] = var16;
                           }

                           this.A[var20] += this.zb;
                           this.I[var20] += this.f_ub;
                           this.O[var20] += this.u;
                        }
                     }
                  }
               }

            } else if(var1 == 3) {
               for(var9 = 0; var9 < var8; ++var9) {
                  var10 = var2[var9];
                  if(var10 < this.F.length) {
                     var11 = this.F[var10];

                     for(var12 = 0; var12 < var11.length; ++var12) {
                        var20 = var11[var12];
                        this.A[var20] -= this.zb;
                        this.I[var20] -= this.f_ub;
                        this.O[var20] -= this.u;
                        this.A[var20] = this.A[var20] * var3 / 128;
                        this.I[var20] = this.I[var20] * var4 / 128;
                        this.O[var20] = this.O[var20] * var5 / 128;
                        this.A[var20] += this.zb;
                        this.I[var20] += this.f_ub;
                        this.O[var20] += this.u;
                     }
                  }
               }

            } else {
               Object[] var19;
               Object[] var18;
               if(var1 == 5) {
                  if(this.D != null && this.t != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.D.length) {
                           var11 = this.D[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var20 = var11[var12];
                              var14 = (this.t[var20] & 255) + var3 * 8;
                              if(var14 < 0) {
                                 var14 = 0;
                              } else if(var14 > 255) {
                                 var14 = 255;
                              }

                              this.t[var20] = (byte)var14;
                           }
                        }
                     }

                     if(this.s != null) {
                        for(var9 = 0; var9 < this.f_mb; ++var9) {
                           var18 = this.s[var9];
                           var19 = this.V[var9];
                           ((int[])((int[])var19[1]))[3] = ((int[])((int[])var19[1]))[3] & 16777215 | 255 - (this.t[((int[])((int[])var18[1]))[0]] & 255) << 24;
                        }
                     }
                  }

               } else if(var1 == 7) {
                  if(this.D != null) {
                     for(var9 = 0; var9 < var8; ++var9) {
                        var10 = var2[var9];
                        if(var10 < this.D.length) {
                           var11 = this.D[var10];

                           for(var12 = 0; var12 < var11.length; ++var12) {
                              var20 = var11[var12];
                              var14 = this.f_tb[var20] & '\uffff';
                              var15 = var14 >> 10 & 63;
                              var16 = var14 >> 7 & 7;
                              int var17 = var14 & 127;
                              var15 = var15 + var3 & 63;
                              var16 += var4;
                              if(var16 < 0) {
                                 var16 = 0;
                              } else if(var16 > 7) {
                                 var16 = 7;
                              }

                              var17 += var5;
                              if(var17 < 0) {
                                 var17 = 0;
                              } else if(var17 > 127) {
                                 var17 = 127;
                              }

                              this.f_tb[var20] = (short)(var15 << 10 | var16 << 7 | var17);
                           }

                           this.U = true;
                        }
                     }

                     if(this.s != null) {
                        for(var9 = 0; var9 < this.f_mb; ++var9) {
                           var18 = this.s[var9];
                           var19 = this.V[var9];
                           ((int[])((int[])var19[1]))[3] = ((int[])((int[])var19[1]))[3] & -16777216 | en.c[spa.a(this.f_tb[((int[])((int[])var18[1]))[0]] & '\uffff', (byte)68) & '\uffff'] & 16777215;
                        }
                     }
                  }

               } else {
                  Object[] var13;
                  if(var1 == 8) {
                     if(this.Kb != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.Kb.length) {
                              var11 = this.Kb[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.V[var11[var12]];
                                 ((int[])((int[])var13[1]))[1] += var3;
                                 ((int[])((int[])var13[1]))[6] += var4;
                              }
                           }
                        }
                     }

                  } else if(var1 == 10) {
                     if(this.Kb != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.Kb.length) {
                              var11 = this.Kb[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.V[var11[var12]];
                                 ((float[])((float[])var13[0]))[2] = ((float[])((float[])var13[0]))[2] * (float)var3 / 128.0F;
                                 ((float[])((float[])var13[0]))[1] = ((float[])((float[])var13[0]))[1] * (float)var4 / 128.0F;
                              }
                           }
                        }
                     }

                  } else if(var1 == 9) {
                     if(this.Kb != null) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10 = var2[var9];
                           if(var10 < this.Kb.length) {
                              var11 = this.Kb[var10];

                              for(var12 = 0; var12 < var11.length; ++var12) {
                                 var13 = this.V[var11[var12]];
                                 ((int[])((int[])var13[1]))[0] = ((int[])((int[])var13[1]))[0] + var3 & 16383;
                              }
                           }
                        }
                     }

                  }
               }
            }
         }
      }
   }

   final boolean a(int var1, int var2, Object[] var3, boolean var4, int var5) {
      this.b(ui.a(this.f_rb, (Runnable)Thread.currentThread()));
      Object[] var6 = (Object[])((Object[])this.Eb[27]);
      aqa.a(true, var3, var6);
      Object[] var7 = (Object[])((Object[])this.Eb[9]);
      sea.a(var6, var7, (byte)125);
      vta.a((Object[])((Object[])this.f_rb[11]), var7, 91);
      boolean var8 = false;
      int var16 = Integer.MAX_VALUE;
      int var17 = Integer.MIN_VALUE;
      int var18 = Integer.MAX_VALUE;
      int var19 = Integer.MIN_VALUE;
      if(!this.xb) {
         this.p();
      }

      int var20 = this.f_bb - this.f_jb >> 1;
      int var21 = this.q - this.f_nb >> 1;
      int var22 = this.f_ob - this.f_db >> 1;
      int var23 = this.f_jb + var20;
      int var24 = this.f_nb + var21;
      int var25 = this.f_db + var22;
      int var26 = var23 - (var20 << var5);
      int var27 = var24 - (var21 << var5);
      int var28 = var25 - (var22 << var5);
      int var29 = var23 + (var20 << var5);
      int var30 = var24 + (var21 << var5);
      int var31 = var25 + (var22 << var5);
      this.Fb[0] = var26;
      this.P[0] = var27;
      this.f_wb[0] = var28;
      this.Fb[1] = var29;
      this.P[1] = var27;
      this.f_wb[1] = var28;
      this.Fb[2] = var26;
      this.P[2] = var30;
      this.f_wb[2] = var28;
      this.Fb[3] = var29;
      this.P[3] = var30;
      this.f_wb[3] = var28;
      this.Fb[4] = var26;
      this.P[4] = var27;
      this.f_wb[4] = var31;
      this.Fb[5] = var29;
      this.P[5] = var27;
      this.f_wb[5] = var31;
      this.Fb[6] = var26;
      this.P[6] = var30;
      this.f_wb[6] = var31;
      this.Fb[7] = var29;
      this.P[7] = var30;
      this.f_wb[7] = var31;

      float var9;
      float var10;
      float var11;
      float var12;
      int var13;
      int var14;
      int var15;
      int var32;
      for(var32 = 0; var32 < 8; ++var32) {
         var13 = this.Fb[var32];
         var14 = this.P[var32];
         var15 = this.f_wb[var32];
         var11 = ((float[])((float[])var7[0]))[2] * (float)var13 + ((float[])((float[])var7[0]))[6] * (float)var14 + ((float[])((float[])var7[0]))[10] * (float)var15 + ((float[])((float[])var7[0]))[14];
         var12 = ((float[])((float[])var7[0]))[3] * (float)var13 + ((float[])((float[])var7[0]))[7] * (float)var14 + ((float[])((float[])var7[0]))[11] * (float)var15 + ((float[])((float[])var7[0]))[15];
         if(var11 >= -var12) {
            var9 = ((float[])((float[])var7[0]))[0] * (float)var13 + ((float[])((float[])var7[0]))[4] * (float)var14 + ((float[])((float[])var7[0]))[8] * (float)var15 + ((float[])((float[])var7[0]))[12];
            var10 = ((float[])((float[])var7[0]))[1] * (float)var13 + ((float[])((float[])var7[0]))[5] * (float)var14 + ((float[])((float[])var7[0]))[9] * (float)var15 + ((float[])((float[])var7[0]))[13];
            int var33 = (int)(((float[])((float[])this.f_rb[10]))[0] + ((float[])((float[])this.f_rb[10]))[2] * var9 / var12);
            int var34 = (int)(((float[])((float[])this.f_rb[10]))[1] + ((float[])((float[])this.f_rb[10]))[3] * var10 / var12);
            if(var33 < var16) {
               var16 = var33;
            }

            if(var33 > var17) {
               var17 = var33;
            }

            if(var34 < var18) {
               var18 = var34;
            }

            if(var34 > var19) {
               var19 = var34;
            }

            var8 = true;
         }
      }

      if(var8 && var1 > var16 && var1 < var17 && var2 > var18 && var2 < var19) {
         if(var4) {
            return true;
         }

         for(var32 = 0; var32 < this.Ib; ++var32) {
            var13 = this.A[var32];
            var14 = this.I[var32];
            var15 = this.O[var32];
            var11 = ((float[])((float[])var7[0]))[2] * (float)var13 + ((float[])((float[])var7[0]))[6] * (float)var14 + ((float[])((float[])var7[0]))[10] * (float)var15 + ((float[])((float[])var7[0]))[14];
            var12 = ((float[])((float[])var7[0]))[3] * (float)var13 + ((float[])((float[])var7[0]))[7] * (float)var14 + ((float[])((float[])var7[0]))[11] * (float)var15 + ((float[])((float[])var7[0]))[15];
            if(var11 >= -var12) {
               var9 = ((float[])((float[])var7[0]))[0] * (float)var13 + ((float[])((float[])var7[0]))[4] * (float)var14 + ((float[])((float[])var7[0]))[8] * (float)var15 + ((float[])((float[])var7[0]))[12];
               var10 = ((float[])((float[])var7[0]))[1] * (float)var13 + ((float[])((float[])var7[0]))[5] * (float)var14 + ((float[])((float[])var7[0]))[9] * (float)var15 + ((float[])((float[])var7[0]))[13];
               this.p[var32] = (float)((int)(((float[])((float[])this.f_rb[10]))[0] + ((float[])((float[])this.f_rb[10]))[2] * var9 / var12));
               this.Ab[var32] = (float)((int)(((float[])((float[])this.f_rb[10]))[1] + ((float[])((float[])this.f_rb[10]))[3] * var10 / var12));
            } else {
               this.p[var32] = -999999.0F;
            }
         }

         for(var32 = 0; var32 < this.K; ++var32) {
            if(this.p[this.Hb[var32]] != -999999.0F && this.p[this.f_ib[var32]] != -999999.0F && this.p[this.yb[var32]] != -999999.0F && this.a(var1, var2, this.Ab[this.Hb[var32]], this.Ab[this.f_ib[var32]], this.Ab[this.yb[var32]], this.p[this.Hb[var32]], this.p[this.f_ib[var32]], this.p[this.yb[var32]])) {
               return true;
            }
         }
      }

      return false;
   }

   private final void t(int var1) {
      short var2 = this.Hb[var1];
      short var3 = this.f_ib[var1];
      short var4 = this.yb[var1];
      if(this.Lb != null && this.Lb[var1] != -1) {
         int var5 = -16777216;
         if(this.t != null) {
            var5 = 255 - (this.t[var1] & 255) << 24;
         }

         if(this.W[var1] == -1) {
            int var6 = var5 | this.M[var1] & 16777215;
            this.f_hb.a(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var6, var6, var6, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         } else {
            this.f_hb.a(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var5 | this.M[var1] & 16777215, var5 | this.Gb[var1] & 16777215, var5 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         }
      } else {
         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.W[var1] == -1) {
            this.f_hb.d(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], en.c[this.M[var1] & '\uffff']);
         } else {
            this.f_hb.c(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], (float)(this.M[var1] & '\uffff'), (float)(this.Gb[var1] & '\uffff'), (float)(this.W[var1] & '\uffff'));
         }
      }

   }

   private final void b(int var1) {
      short var2;
      short var3;
      short var4;
      float var6;
      float var7;
      if(!((boolean[])((boolean[])this.Eb[2]))[2]) {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         Object[] var5 = (Object[])((Object[])this.f_rb[13]);
         var6 = ((float[])((float[])var5[0]))[10];
         var7 = ((float[])((float[])var5[0]))[14];
         float var8 = ((float[])((float[])var5[0]))[11];
         float var9 = ((float[])((float[])var5[0]))[15];
         float var10 = var7 * var8 - var6 * var9;
         float var11 = (this.f_sb[var2] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var12 = (this.f_sb[var3] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var13 = (this.f_sb[var4] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var14 = var11 * var10 / (var11 * var8 - var6);
         float var15 = var12 * var10 / (var12 * var8 - var6);
         float var16 = var13 * var10 / (var13 * var8 - var6);
         float var17 = (var14 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var17 > 1.0F) {
            var17 = 1.0F;
         } else if(var17 < 0.0F) {
            var17 = 0.0F;
         }

         float var18 = (var15 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var18 > 1.0F) {
            var18 = 1.0F;
         } else if(var18 < 0.0F) {
            var18 = 0.0F;
         }

         float var19 = (var16 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var19 > 1.0F) {
            var19 = 1.0F;
         } else if(var19 < 0.0F) {
            var19 = 0.0F;
         }

         float var20 = var17 + var18 + var19;
         if(var20 >= 3.0F) {
            return;
         }

         if(var20 <= 0.0F) {
            this.i(var1);
            return;
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var21 = -16777216;
            if(this.t != null) {
               var21 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var22 = var21 | this.M[var1] & 16777215;
               this.f_hb.e(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var22, var22, var22, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.e(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var21 | this.M[var1] & 16777215, var21 | this.Gb[var1] & 16777215, var21 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.e(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 66, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 77, var18 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 119, var19 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.e(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 63, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 115, var18 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 83, var19 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      } else {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         float var23 = 0.0F;
         var6 = 0.0F;
         var7 = 0.0F;
         if(this.w[var2] > ((int[])((int[])this.Eb[1]))[3]) {
            var23 = 1.0F;
         } else if(this.w[var2] > ((int[])((int[])this.Eb[1]))[2]) {
            var23 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var2]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var3] > ((int[])((int[])this.Eb[1]))[3]) {
            var6 = 1.0F;
         } else if(this.w[var3] > ((int[])((int[])this.Eb[1]))[2]) {
            var6 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var3]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var4] > ((int[])((int[])this.Eb[1]))[3]) {
            var7 = 1.0F;
         } else if(this.w[var4] > ((int[])((int[])this.Eb[1]))[2]) {
            var7 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var4]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var24 = -16777216;
            if(this.t != null) {
               var24 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var25 = var24 | this.M[var1] & 16777215;
               this.f_hb.e(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var25, var25, var25, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.e(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var24 | this.M[var1] & 16777215, var24 | this.Gb[var1] & 16777215, var24 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.e(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 94, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 110, var6 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 119, var7 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.e(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 73, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 78, var6 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 62, var7 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      }

   }

   final byte[] B() {
      return this.t;
   }

   private final void h() {
      synchronized(this) {
         int var2;
         int var3;
         for(var2 = 0; var2 < this.C; ++var2) {
            var3 = this.A[var2];
            this.A[var2] = this.O[var2];
            this.O[var2] = -var3;
            if(this.N[var2] != null) {
               var3 = this.N[var2].d;
               this.N[var2].d = this.N[var2].b;
               this.N[var2].b = -var3;
            }
         }

         if(this.f_vb != null) {
            for(var2 = 0; var2 < this.K; ++var2) {
               if(this.f_vb[var2] != null) {
                  var3 = this.f_vb[var2].a;
                  this.f_vb[var2].a = this.f_vb[var2].c;
                  this.f_vb[var2].c = -var3;
               }
            }
         }

         for(var2 = this.C; var2 < this.Ib; ++var2) {
            var3 = this.A[var2];
            this.A[var2] = this.O[var2];
            this.O[var2] = -var3;
         }

         this.f_fb = 0;
         this.xb = false;
      }
   }

   final void UA(int var1) {
      if((this.R & 6) != 6) {
         throw new IllegalStateException();
      } else {
         int var2 = tda.p[var1];
         int var3 = tda.k[var1];
         synchronized(this) {
            for(int var5 = 0; var5 < this.Ib; ++var5) {
               int var6 = this.I[var5] * var3 - this.O[var5] * var2 >> 14;
               this.O[var5] = this.I[var5] * var2 + this.O[var5] * var3 >> 14;
               this.I[var5] = var6;
            }

            this.o();
         }
      }
   }

   final boolean d() {
      if(this.Lb == null) {
         return true;
      } else {
         for(int var1 = 0; var1 < this.Lb.length; ++var1) {
            if(this.Lb[var1] != -1 && !ui.d(this.f_rb, this.Lb[var1])) {
               return false;
            }
         }

         return true;
      }
   }

   private final void e(int var1, boolean var2, boolean var3) {
      if(this.W[var1] != -2) {
         short var4 = this.Hb[var1];
         short var5 = this.f_ib[var1];
         short var6 = this.yb[var1];
         float var7 = this.p[var4];
         float var8 = this.p[var5];
         float var9 = this.p[var6];
         if(!var2 || var7 != -5000.0F && var8 != -5000.0F && var9 != -5000.0F) {
            float var10 = this.Ab[var4];
            float var11 = this.Ab[var5];
            float var12 = this.Ab[var6];
            if(this.f_lb[var1] != -1 || (var7 - var8) * (var12 - var11) - (var10 - var11) * (var9 - var8) > 0.0F) {
               if(var7 >= 0.0F && var8 >= 0.0F && var9 >= 0.0F && var7 <= (float)((int[])((int[])this.Eb[1]))[4] && var8 <= (float)((int[])((int[])this.Eb[1]))[4] && var9 <= (float)((int[])((int[])this.Eb[1]))[4]) {
                  this.f_hb.c = false;
               } else {
                  this.f_hb.c = true;
               }

               int var13;
               if(var3) {
                  var13 = this.f_lb[var1];
                  if(var13 == -1 || !((boolean[])((boolean[])this.s[var13][3]))[0]) {
                     this.m(var1);
                  }
               } else {
                  var13 = this.f_lb[var1];
                  if(var13 != -1) {
                     Object[] var14 = this.s[var13];
                     Object[] var15 = this.V[var13];
                     if(!((boolean[])((boolean[])var14[3]))[0]) {
                        this.h(var1);
                     }

                     ui.d(((int[])((int[])var15[1]))[5], ((int[])((int[])var15[1]))[2], ((float[])((float[])var15[0]))[0], ((int[])((int[])var15[1]))[4], ((int[])((int[])var15[1]))[7], ((short[])((short[])var14[0]))[2] & '\uffff', ((int[])((int[])var15[1]))[3], ((byte[])((byte[])var14[2]))[0], ((byte[])((byte[])var14[2]))[1], this.f_rb);
                  } else {
                     this.h(var1);
                  }
               }
            }

         }
      }
   }

   private final void q() {
      for(int var5 = 0; var5 < this.K; ++var5) {
         short var4 = this.Lb != null?this.Lb[var5]:-1;
         if(var4 == -1) {
            int var1 = this.f_tb[var5] & '\uffff';
            int var2 = (var1 & 127) * this.E >> 7;
            short var6 = spa.a(var1 & -128 | var2, (byte)68);
            int var3;
            if(this.W[var5] == -1) {
               var3 = this.M[var5] & -131072;
               this.M[var5] = var3 | bm.a(2, var3 >> 17, var6);
            } else if(this.W[var5] != -2) {
               var3 = this.M[var5] & -131072;
               this.M[var5] = var3 | bm.a(2, var3 >> 17, var6);
               var3 = this.Gb[var5] & -131072;
               this.Gb[var5] = var3 | bm.a(2, var3 >> 17, var6);
               var3 = this.W[var5] & -131072;
               this.W[var5] = var3 | bm.a(2, var3 >> 17, var6);
            }
         }
      }

      this.f_fb = 2;
   }

   final void S() {
      if((this.R & 16) != 16) {
         throw new IllegalStateException();
      } else {
         synchronized(this) {
            int var2;
            for(var2 = 0; var2 < this.Ib; ++var2) {
               this.O[var2] = -this.O[var2];
            }

            if(this.N != null) {
               for(var2 = 0; var2 < this.C; ++var2) {
                  if(this.N[var2] != null) {
                     this.N[var2].b = -this.N[var2].b;
                  }
               }
            }

            if(this.f_cb != null) {
               for(var2 = 0; var2 < this.C; ++var2) {
                  if(this.f_cb[var2] != null) {
                     this.f_cb[var2].b = -this.f_cb[var2].b;
                  }
               }
            }

            if(this.f_vb != null) {
               for(var2 = 0; var2 < this.K; ++var2) {
                  if(this.f_vb[var2] != null) {
                     this.f_vb[var2].c = -this.f_vb[var2].c;
                  }
               }
            }

            short[] var7 = this.Hb;
            this.Hb = this.yb;
            this.yb = var7;
            if(this.H != null) {
               for(int var3 = 0; var3 < this.K; ++var3) {
                  float var4;
                  if(this.H[var3] != null) {
                     var4 = this.H[var3][0];
                     this.H[var3][0] = this.H[var3][2];
                     this.H[var3][2] = var4;
                  }

                  if(this.Cb[var3] != null) {
                     var4 = this.Cb[var3][0];
                     this.Cb[var3][0] = this.Cb[var3][2];
                     this.Cb[var3][2] = var4;
                  }
               }
            }

            this.xb = false;
            this.f_fb = 0;
         }
      }
   }

   private final void q(int var1) {
      short var2 = this.Hb[var1];
      short var3 = this.f_ib[var1];
      short var4 = this.yb[var1];
      if(this.Lb != null && this.Lb[var1] != -1) {
         int var5 = -16777216;
         if(this.t != null) {
            var5 = 255 - (this.t[var1] & 255) << 24;
         }

         if(this.W[var1] == -1) {
            int var6 = var5 | this.M[var1] & 16777215;
            this.f_hb.c(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var6, var6, var6, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         } else {
            this.f_hb.c(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var5 | this.M[var1] & 16777215, var5 | this.Gb[var1] & 16777215, var5 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         }
      } else {
         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.W[var1] == -1) {
            this.f_hb.g(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], en.c[this.M[var1] & '\uffff']);
         } else {
            this.f_hb.e(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], (float)(this.M[var1] & '\uffff'), (float)(this.Gb[var1] & '\uffff'), (float)(this.W[var1] & '\uffff'));
         }
      }

   }

   private final void a(boolean var1) {
      if(this.f_fb == 1) {
         this.r();
      } else if(this.f_fb == 2) {
         if((this.R & 618648) == 0 && this.H == null) {
            this.f_tb = null;
         }

         if(var1) {
            this.Q = null;
         }

      } else {
         this.s();
         int var2 = ((int[])((int[])this.f_rb[1]))[2];
         int var3 = ((int[])((int[])this.f_rb[1]))[18];
         int var4 = ((int[])((int[])this.f_rb[1]))[3];
         int var5 = ((int[])((int[])this.f_rb[1]))[6] >> 8;
         int var6 = 0;
         int var7 = 0;
         if(this.L != 0) {
            var6 = ((int[])((int[])this.f_rb[1]))[5] * 768 / this.L;
            var7 = ((int[])((int[])this.f_rb[1]))[11] * 768 / this.L;
         }

         if(this.M == null) {
            this.M = new int[this.K];
            this.Gb = new int[this.K];
            this.W = new int[this.K];
         }

         for(int var8 = 0; var8 < this.K; ++var8) {
            byte var9;
            if(this.Q == null) {
               var9 = 0;
            } else {
               var9 = this.Q[var8];
            }

            byte var10;
            if(this.t == null) {
               var10 = 0;
            } else {
               var10 = this.t[var8];
            }

            short var11;
            if(this.Lb == null) {
               var11 = -1;
            } else {
               var11 = this.Lb[var8];
            }

            if(var10 == -2) {
               var9 = 3;
            }

            if(var10 == -1) {
               var9 = 2;
            }

            int var12;
            int var16;
            if(var11 == -1) {
               int var13;
               short var14;
               int var17;
               int var18;
               if(var9 == 0) {
                  var12 = this.f_tb[var8] & '\uffff';
                  var13 = (var12 & 127) * this.E >> 7;
                  var14 = spa.a(var12 & -128 | var13, (byte)68);
                  wc var15;
                  if(this.f_cb != null && this.f_cb[this.Hb[var8]] != null) {
                     var15 = this.f_cb[this.Hb[var8]];
                  } else {
                     var15 = this.N[this.Hb[var8]];
                  }

                  var17 = (var2 * var15.d + var3 * var15.c + var4 * var15.b) / var15.a >> 16;
                  var18 = var17 > 256?var6:var7;
                  var16 = (var5 >> 1) + (var18 * var17 >> 17);
                  this.M[var8] = var16 << 17 | bm.a(2, var16, var14);
                  if(this.f_cb != null && this.f_cb[this.f_ib[var8]] != null) {
                     var15 = this.f_cb[this.f_ib[var8]];
                  } else {
                     var15 = this.N[this.f_ib[var8]];
                  }

                  var17 = (var2 * var15.d + var3 * var15.c + var4 * var15.b) / var15.a >> 16;
                  var18 = var17 > 256?var6:var7;
                  var16 = (var5 >> 1) + (var18 * var17 >> 17);
                  this.Gb[var8] = var16 << 17 | bm.a(2, var16, var14);
                  if(this.f_cb != null && this.f_cb[this.yb[var8]] != null) {
                     var15 = this.f_cb[this.yb[var8]];
                  } else {
                     var15 = this.N[this.yb[var8]];
                  }

                  var17 = (var2 * var15.d + var3 * var15.c + var4 * var15.b) / var15.a >> 16;
                  var18 = var17 > 256?var6:var7;
                  var16 = (var5 >> 1) + (var18 * var17 >> 17);
                  this.W[var8] = var16 << 17 | bm.a(2, var16, var14);
               } else if(var9 == 1) {
                  var12 = this.f_tb[var8] & '\uffff';
                  var13 = (var12 & 127) * this.E >> 7;
                  var14 = spa.a(var12 & -128 | var13, (byte)68);
                  ifa var22 = this.f_vb[var8];
                  var16 = var2 * var22.a + var3 * var22.b + var4 * var22.c >> 16;
                  var17 = var16 > 256?var6:var7;
                  var18 = (var5 >> 1) + (var17 * var16 >> 17);
                  this.M[var8] = var18 << 17 | bm.a(2, var18, var14);
                  this.W[var8] = -1;
               } else if(var9 == 3) {
                  this.M[var8] = 128;
                  this.W[var8] = -1;
               } else {
                  this.W[var8] = -2;
               }
            } else {
               var12 = this.f_tb[var8] & '\uffff';
               int var20;
               int var23;
               if(var9 == 0) {
                  wc var19;
                  if(this.f_cb != null && this.f_cb[this.Hb[var8]] != null) {
                     var19 = this.f_cb[this.Hb[var8]];
                  } else {
                     var19 = this.N[this.Hb[var8]];
                  }

                  var23 = (var2 * var19.d + var3 * var19.c + var4 * var19.b) / var19.a >> 16;
                  var16 = var23 > 256?var6:var7;
                  var20 = this.l((var5 >> 2) + (var16 * var23 >> 18));
                  this.M[var8] = var20 << 24 | this.a(var12, var11, var20);
                  if(this.f_cb != null && this.f_cb[this.f_ib[var8]] != null) {
                     var19 = this.f_cb[this.f_ib[var8]];
                  } else {
                     var19 = this.N[this.f_ib[var8]];
                  }

                  var23 = (var2 * var19.d + var3 * var19.c + var4 * var19.b) / var19.a >> 16;
                  var16 = var23 > 256?var6:var7;
                  var20 = this.l((var5 >> 2) + (var16 * var23 >> 18));
                  this.Gb[var8] = var20 << 24 | this.a(var12, var11, var20);
                  if(this.f_cb != null && this.f_cb[this.yb[var8]] != null) {
                     var19 = this.f_cb[this.yb[var8]];
                  } else {
                     var19 = this.N[this.yb[var8]];
                  }

                  var23 = (var2 * var19.d + var3 * var19.c + var4 * var19.b) / var19.a >> 16;
                  var16 = var23 > 256?var6:var7;
                  var20 = this.l((var5 >> 2) + (var16 * var23 >> 18));
                  this.W[var8] = var20 << 24 | this.a(var12, var11, var20);
               } else if(var9 == 1) {
                  ifa var21 = this.f_vb[var8];
                  var20 = var2 * var21.a + var3 * var21.b + var4 * var21.c >> 16;
                  var23 = var20 > 256?var6:var7;
                  var16 = this.l((var5 >> 2) + (var23 * var20 >> 18));
                  this.M[var8] = var16 << 24 | this.a(var12, var11, var16);
                  this.W[var8] = -1;
               } else {
                  this.W[var8] = -2;
               }
            }
         }

         this.N = null;
         this.f_cb = null;
         this.f_vb = null;
         if((this.R & 618648) == 0 && this.H == null) {
            this.f_tb = null;
         }

         if(var1) {
            this.Q = null;
         }

         this.f_fb = 2;
      }
   }

   final int RA() {
      if(!this.xb) {
         this.p();
      }

      return this.f_bb;
   }

   final boolean XA() {
      return this.B;
   }

   private final void g(int var1) {
      short var2 = this.Hb[var1];
      short var3 = this.f_ib[var1];
      short var4 = this.yb[var1];
      if(this.Lb != null && this.Lb[var1] != -1) {
         int var5 = -16777216;
         if(this.t != null) {
            var5 = 255 - (this.t[var1] & 255) << 24;
         }

         if(this.W[var1] == -1) {
            int var6 = var5 | this.M[var1] & 16777215;
            this.f_hb.f(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var6, var6, var6, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         } else {
            this.f_hb.f(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var5 | this.M[var1] & 16777215, var5 | this.Gb[var1] & 16777215, var5 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], 0.0F, 0.0F, 0.0F, this.Lb[var1]);
         }
      } else {
         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.W[var1] == -1) {
            this.f_hb.f(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], en.c[this.M[var1] & '\uffff']);
         } else {
            this.f_hb.b(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], (float)(this.M[var1] & '\uffff'), (float)(this.Gb[var1] & '\uffff'), (float)(this.W[var1] & '\uffff'));
         }
      }

   }

   private final void n(int var1) {
      short var2;
      short var3;
      short var4;
      float var6;
      float var7;
      if(!((boolean[])((boolean[])this.Eb[2]))[2]) {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         Object[] var5 = (Object[])((Object[])this.f_rb[13]);
         var6 = ((float[])((float[])var5[0]))[10];
         var7 = ((float[])((float[])var5[0]))[14];
         float var8 = ((float[])((float[])var5[0]))[11];
         float var9 = ((float[])((float[])var5[0]))[15];
         float var10 = var7 * var8 - var6 * var9;
         float var11 = (this.f_sb[var2] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var12 = (this.f_sb[var3] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var13 = (this.f_sb[var4] - ((float[])((float[])this.Eb[18]))[2]) * ((float[])((float[])this.Eb[18]))[6];
         float var14 = var11 * var10 / (var11 * var8 - var6);
         float var15 = var12 * var10 / (var12 * var8 - var6);
         float var16 = var13 * var10 / (var13 * var8 - var6);
         float var17 = (var14 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var17 > 1.0F) {
            var17 = 1.0F;
         } else if(var17 < 0.0F) {
            var17 = 0.0F;
         }

         float var18 = (var15 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var18 > 1.0F) {
            var18 = 1.0F;
         } else if(var18 < 0.0F) {
            var18 = 0.0F;
         }

         float var19 = (var16 - ((float[])((float[])this.Eb[18]))[4]) / ((float[])((float[])this.Eb[18]))[8];
         if(var19 > 1.0F) {
            var19 = 1.0F;
         } else if(var19 < 0.0F) {
            var19 = 0.0F;
         }

         float var20 = var17 + var18 + var19;
         if(var20 >= 3.0F) {
            return;
         }

         if(var20 <= 0.0F) {
            this.r(var1);
            return;
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var21 = -16777216;
            if(this.t != null) {
               var21 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var22 = var21 | this.M[var1] & 16777215;
               this.f_hb.g(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var22, var22, var22, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.g(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var21 | this.M[var1] & 16777215, var21 | this.Gb[var1] & 16777215, var21 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var17 * 255.0F, var18 * 255.0F, var19 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.d(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 92, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 116, var18 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 57, var19 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.d(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 108, var17 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 63, var18 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 87, var19 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      } else {
         var2 = this.Hb[var1];
         var3 = this.f_ib[var1];
         var4 = this.yb[var1];
         float var23 = 0.0F;
         var6 = 0.0F;
         var7 = 0.0F;
         if(this.w[var2] > ((int[])((int[])this.Eb[1]))[3]) {
            var23 = 1.0F;
         } else if(this.w[var2] > ((int[])((int[])this.Eb[1]))[2]) {
            var23 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var2]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var3] > ((int[])((int[])this.Eb[1]))[3]) {
            var6 = 1.0F;
         } else if(this.w[var3] > ((int[])((int[])this.Eb[1]))[2]) {
            var6 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var3]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.w[var4] > ((int[])((int[])this.Eb[1]))[3]) {
            var7 = 1.0F;
         } else if(this.w[var4] > ((int[])((int[])this.Eb[1]))[2]) {
            var7 = (float)(((int[])((int[])this.Eb[1]))[2] - this.w[var4]) * 1.0F / (float)(((int[])((int[])this.Eb[1]))[2] - ((int[])((int[])this.Eb[1]))[3]);
         }

         if(this.t == null) {
            this.f_hb.J = 0;
         } else {
            this.f_hb.J = this.t[var1] & 255;
         }

         if(this.Lb != null && this.Lb[var1] != -1) {
            int var24 = -16777216;
            if(this.t != null) {
               var24 = 255 - (this.t[var1] & 255) << 24;
            }

            if(this.W[var1] == -1) {
               int var25 = var24 | this.M[var1] & 16777215;
               this.f_hb.g(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var25, var25, var25, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            } else {
               this.f_hb.g(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], this.J[var2], this.J[var3], this.J[var4], this.H[var1][0], this.H[var1][1], this.H[var1][2], this.Cb[var1][0], this.Cb[var1][1], this.Cb[var1][2], var24 | this.M[var1] & 16777215, var24 | this.Gb[var1] & 16777215, var24 | this.W[var1] & 16777215, ((int[])((int[])this.Eb[1]))[1], var23 * 255.0F, var6 * 255.0F, var7 * 255.0F, this.Lb[var1]);
            }
         } else if(this.W[var1] == -1) {
            this.f_hb.d(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 73, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 85, var6 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 71, var7 * 255.0F, en.c[this.M[var1] & '\uffff']));
         } else {
            this.f_hb.d(this.Ab[var2], this.Ab[var3], this.Ab[var4], this.p[var2], this.p[var3], this.p[var4], this.f_sb[var2], this.f_sb[var3], this.f_sb[var4], ms.a(((int[])((int[])this.Eb[1]))[1], 110, var23 * 255.0F, en.c[this.M[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 64, var6 * 255.0F, en.c[this.Gb[var1] & '\uffff']), ms.a(((int[])((int[])this.Eb[1]))[1], 100, var7 * 255.0F, en.c[this.W[var1] & '\uffff']));
         }
      }

   }

   dpa(Object[] var1) {
      this.f_rb = var1;
   }

   dpa(Object[] var1, ii var2, int var3, int var4, int var5, int var6) {
      this.f_rb = var1;
      this.R = var3;
      this.E = var4;
      this.L = var5;
      Object[] var7 = this.f_rb;
      qa var9 = ((ta)(this.f_rb == null?null:var7[6])).k;
      this.Ib = var2.u;
      this.C = var2.g;
      this.A = var2.f_l;
      this.I = var2.h;
      this.O = var2.z;
      this.K = var2.I;
      this.Hb = var2.p;
      this.f_ib = var2.b;
      this.yb = var2.J;
      this.Bb = var2.D;
      this.f_tb = var2.A;
      this.t = var2.d;
      this.X = var2.x;
      this.Q = var2.C;
      this.y = var2.s;
      this.T = var2.q;
      this.f_ab = var2.e;
      int[] var10 = new int[this.K];

      for(int var11 = 0; var11 < this.K; var10[var11] = var11++) {
         ;
      }

      long[] var56 = new long[this.K];
      boolean var12 = (this.R & 256) != 0;

      int var13;
      Object[] var15;
      int var16;
      byte var19;
      int var61;
      short var65;
      for(var13 = 0; var13 < this.K; ++var13) {
         int var14 = var10[var13];
         var15 = null;
         var16 = 0;
         byte var17 = 0;
         byte var18 = 0;
         var19 = 0;
         if(var2.v != null) {
            boolean var20 = false;

            for(int var21 = 0; var21 < var2.v.length; ++var21) {
               Object[] var22 = var2.v[var21];
               if(var14 == ((int[])((int[])var22[0]))[3]) {
                  Object[] var23 = hsa.a(((int[])((int[])var22[0]))[0], -93);
                  if(((boolean[])((boolean[])var23[0]))[0]) {
                     var20 = true;
                  }

                  if(((int[])((int[])var23[1]))[1] != -1) {
                     Object[] var24 = var9.a(((int[])((int[])var23[1]))[1], (byte)34);
                     if(((int[])((int[])var24[1]))[0] == 2) {
                        this.B = true;
                     }
                  }
               }
            }

            if(var20) {
               var56[var13] = Long.MAX_VALUE;
            }
         }

         var65 = -1;
         if(var2.y != null) {
            var65 = var2.y[var14];
            if(var65 != -1) {
               var15 = var9.a(var65 & '\uffff', (byte)61);
               if((var6 & 64) != 0 && ((boolean[])((boolean[])var15[3]))[7]) {
                  var65 = -1;
               } else {
                  var18 = ((byte[])((byte[])var15[0]))[4];
                  var19 = ((byte[])((byte[])var15[0]))[0];
               }
            }
         }

         boolean var71 = this.t != null && this.t[var14] != 0 || var15 != null && ((int[])((int[])var15[1]))[0] == 2;
         if((var12 || var71) && this.Bb != null) {
            var16 += this.Bb[var14] << 17;
         }

         if(var71) {
            var16 += 65536;
         }

         var16 += (var18 & 255) << 8;
         var16 += var19 & 255;
         var61 = var17 + ((var65 & '\uffff') << 16);
         var61 += var13 & '\uffff';
         var56[var13] = ((long)var16 << 32) + (long)var61;
         this.B |= var71;
      }

      cv.a(var10, (byte)-126, var56);
      Object[] var57;
      Object[] var72;
      if(var2.v != null) {
         this.f_mb = var2.v.length;
         this.s = new Object[this.f_mb][];
         this.V = new Object[this.f_mb][];

         for(var13 = 0; var13 < var2.v.length; ++var13) {
            var57 = var2.v[var13];
            var15 = hsa.a(((int[])((int[])var57[0]))[0], -48);
            var16 = en.c[var2.A[((int[])((int[])var57[0]))[3]] & '\uffff'] & 16777215;
            var16 |= 255 - (var2.d != null?var2.d[((int[])((int[])var57[0]))[3]] & 255:0) << 24;
            this.s[var13] = rea.a(((int[])((int[])var57[0]))[3], ((int[])((int[])var15[1]))[4], ((int[])((int[])var15[1]))[3], var2.p[((int[])((int[])var57[0]))[3]], new Object[4], ((boolean[])((boolean[])var15[0]))[0], ((int[])((int[])var57[0]))[2], var2.b[((int[])((int[])var57[0]))[3]], ((int[])((int[])var15[1]))[1], ((int[])((int[])var15[1]))[0], ((int[])((int[])var15[1]))[2], var2.J[((int[])((int[])var57[0]))[3]], 849);
            Object[][] var60 = this.V;
            var72 = new Object[2];
            if(var72[1] == null) {
               var72[1] = new int[8];
            }

            if(null == var72[0]) {
               var72[0] = new float[3];
            }

            mn.a(var72, (int)0);
            ((int[])((int[])var72[1]))[3] = var16;
            var60[var13] = var72;
         }
      }

      this.H = new float[this.K][];
      this.Cb = new float[this.K][];
      Object[] var58 = gba.a(var2, -30075, this.K, var10);
      var57 = ui.a(this.f_rb, (Runnable)Thread.currentThread());
      float[] var59 = (float[])((float[])var57[30]);
      boolean var63 = false;

      int var64;
      for(var61 = 0; var61 < this.K; ++var61) {
         var64 = var10[var61];
         if(var2.n == null) {
            var19 = -1;
         } else {
            var19 = var2.n[var64];
         }

         var65 = var2.y == null?-1:var2.y[var64];
         if(var65 != -1 && (var6 & 64) != 0) {
            Object[] var73 = var9.a(var65 & '\uffff', (byte)103);
            if(((boolean[])((boolean[])var73[3]))[7]) {
               var65 = -1;
            }
         }

         if(var65 != -1) {
            var63 = true;
            float[] var67 = this.H[var64] = new float[3];
            float[] var66 = this.Cb[var64] = new float[3];
            boolean var68 = false;
            if(var19 == -1) {
               var67[0] = 0.0F;
               var66[0] = 1.0F;
               var67[1] = 1.0F;
               var66[1] = 1.0F;
               var67[2] = 0.0F;
               var66[2] = 0.0F;
            } else {
               int var69 = var19 & 255;
               byte var75 = var2.G[var69];
               short var25;
               short var27;
               short var26;
               float var34;
               float var35;
               float var33;
               float var46;
               float var47;
               float var45;
               float var50;
               float var49;
               float var48;
               if(var75 == 0) {
                  var25 = this.Hb[var64];
                  var26 = this.f_ib[var64];
                  var27 = this.yb[var64];
                  short var28 = var2.r[var69];
                  short var29 = var2.F[var69];
                  short var30 = var2.E[var69];
                  float var31 = (float)this.A[var28];
                  float var32 = (float)this.I[var28];
                  var33 = (float)this.O[var28];
                  var34 = (float)this.A[var29] - var31;
                  var35 = (float)this.I[var29] - var32;
                  float var36 = (float)this.O[var29] - var33;
                  float var37 = (float)this.A[var30] - var31;
                  float var38 = (float)this.I[var30] - var32;
                  float var39 = (float)this.O[var30] - var33;
                  float var40 = (float)this.A[var25] - var31;
                  float var41 = (float)this.I[var25] - var32;
                  float var42 = (float)this.O[var25] - var33;
                  float var43 = (float)this.A[var26] - var31;
                  float var44 = (float)this.I[var26] - var32;
                  var45 = (float)this.O[var26] - var33;
                  var46 = (float)this.A[var27] - var31;
                  var47 = (float)this.I[var27] - var32;
                  var48 = (float)this.O[var27] - var33;
                  var49 = var35 * var39 - var36 * var38;
                  var50 = var36 * var37 - var34 * var39;
                  float var51 = var34 * var38 - var35 * var37;
                  float var52 = var38 * var51 - var39 * var50;
                  float var53 = var39 * var49 - var37 * var51;
                  float var54 = var37 * var50 - var38 * var49;
                  float var55 = 1.0F / (var52 * var34 + var53 * var35 + var54 * var36);
                  var67[0] = (var52 * var40 + var53 * var41 + var54 * var42) * var55;
                  var67[1] = (var52 * var43 + var53 * var44 + var54 * var45) * var55;
                  var67[2] = (var52 * var46 + var53 * var47 + var54 * var48) * var55;
                  var52 = var35 * var51 - var36 * var50;
                  var53 = var36 * var49 - var34 * var51;
                  var54 = var34 * var50 - var35 * var49;
                  var55 = 1.0F / (var52 * var37 + var53 * var38 + var54 * var39);
                  var66[0] = (var52 * var40 + var53 * var41 + var54 * var42) * var55;
                  var66[1] = (var52 * var43 + var53 * var44 + var54 * var45) * var55;
                  var66[2] = (var52 * var46 + var53 * var47 + var54 * var48) * var55;
               } else {
                  var25 = this.Hb[var64];
                  var26 = this.f_ib[var64];
                  var27 = this.yb[var64];
                  int var76 = ((int[])((int[])var58[1]))[var69];
                  int var79 = ((int[])((int[])var58[0]))[var69];
                  int var77 = ((int[])((int[])var58[3]))[var69];
                  float[] var78 = ((float[][])((float[][])var58[2]))[var69];
                  byte var80 = var2.K[var69];
                  var33 = (float)var2.B[var69] / 256.0F;
                  if(var75 == 1) {
                     var34 = (float)var2.t[var69] / 1024.0F;
                     uta.a(var78, var76, this.I[var25], var80, var33, var59, var79, this.O[var25], var34, (byte)-121, var77, this.A[var25]);
                     var67[0] = var59[0];
                     var66[0] = var59[1];
                     uta.a(var78, var76, this.I[var26], var80, var33, var59, var79, this.O[var26], var34, (byte)-121, var77, this.A[var26]);
                     var67[1] = var59[0];
                     var66[1] = var59[1];
                     uta.a(var78, var76, this.I[var27], var80, var33, var59, var79, this.O[var27], var34, (byte)-121, var77, this.A[var27]);
                     var67[2] = var59[0];
                     var66[2] = var59[1];
                     var35 = var34 / 2.0F;
                     if((var80 & 1) == 0) {
                        if(var67[1] - var67[0] > var35) {
                           var67[1] -= var34;
                        } else if(var67[0] - var67[1] > var35) {
                           var67[1] += var34;
                        }

                        if(var67[2] - var67[0] > var35) {
                           var67[2] -= var34;
                        } else if(var67[0] - var67[2] > var35) {
                           var67[2] += var34;
                        }
                     } else {
                        if(var66[1] - var66[0] > var35) {
                           var66[1] -= var34;
                        } else if(var66[0] - var66[1] > var35) {
                           var66[1] += var34;
                        }

                        if(var66[2] - var66[0] > var35) {
                           var66[2] -= var34;
                        } else if(var66[0] - var66[2] > var35) {
                           var66[2] += var34;
                        }
                     }
                  } else if(var75 == 2) {
                     var34 = (float)var2.w[var69] / 256.0F;
                     var35 = (float)var2.o[var69] / 256.0F;
                     int var81 = this.A[var26] - this.A[var25];
                     int var84 = this.I[var26] - this.I[var25];
                     int var83 = this.O[var26] - this.O[var25];
                     int var82 = this.A[var27] - this.A[var25];
                     int var86 = this.I[var27] - this.I[var25];
                     int var85 = this.O[var27] - this.O[var25];
                     int var87 = var84 * var85 - var86 * var83;
                     int var88 = var83 * var82 - var85 * var81;
                     int var89 = var81 * var86 - var82 * var84;
                     var45 = 64.0F / (float)var2.H[var69];
                     var46 = 64.0F / (float)var2.j[var69];
                     var47 = 64.0F / (float)var2.t[var69];
                     var48 = ((float)var87 * var78[0] + (float)var88 * var78[1] + (float)var89 * var78[2]) / var45;
                     var49 = ((float)var87 * var78[3] + (float)var88 * var78[4] + (float)var89 * var78[5]) / var46;
                     var50 = ((float)var87 * var78[6] + (float)var88 * var78[7] + (float)var89 * var78[8]) / var47;
                     int var74 = oka.a(var49, var48, var50, (byte)-118);
                     vha.a(var34, var35, var76, var78, var79, this.I[var25], (byte)-101, var80, this.A[var25], var74, var59, var77, this.O[var25], var33);
                     var67[0] = var59[0];
                     var66[0] = var59[1];
                     vha.a(var34, var35, var76, var78, var79, this.I[var26], (byte)-89, var80, this.A[var26], var74, var59, var77, this.O[var26], var33);
                     var67[1] = var59[0];
                     var66[1] = var59[1];
                     vha.a(var34, var35, var76, var78, var79, this.I[var27], (byte)-106, var80, this.A[var27], var74, var59, var77, this.O[var27], var33);
                     var67[2] = var59[0];
                     var66[2] = var59[1];
                  } else if(var75 == 3) {
                     ai.a(this.I[var25], var80, this.O[var25], var78, 4, var77, var33, this.A[var25], var76, var79, var59);
                     var67[0] = var59[0];
                     var66[0] = var59[1];
                     ai.a(this.I[var26], var80, this.O[var26], var78, 4, var77, var33, this.A[var26], var76, var79, var59);
                     var67[1] = var59[0];
                     var66[1] = var59[1];
                     ai.a(this.I[var27], var80, this.O[var27], var78, 4, var77, var33, this.A[var27], var76, var79, var59);
                     var67[2] = var59[0];
                     var66[2] = var59[1];
                     if((var80 & 1) == 0) {
                        if(var67[1] - var67[0] > 0.5F) {
                           --var67[1];
                        } else if(var67[0] - var67[1] > 0.5F) {
                           ++var67[1];
                        }

                        if(var67[2] - var67[0] > 0.5F) {
                           --var67[2];
                        } else if(var67[0] - var67[2] > 0.5F) {
                           ++var67[2];
                        }
                     } else {
                        if(var66[1] - var66[0] > 0.5F) {
                           --var66[1];
                        } else if(var66[0] - var66[1] > 0.5F) {
                           ++var66[1];
                        }

                        if(var66[2] - var66[0] > 0.5F) {
                           --var66[2];
                        } else if(var66[0] - var66[2] > 0.5F) {
                           ++var66[2];
                        }
                     }
                  }
               }
            }
         }
      }

      if(!var63) {
         this.Cb = (float[][])null;
         this.H = (float[][])null;
      }

      if(var2.f_i != null && (this.R & 32) != 0) {
         this.F = var2.a(true);
      }

      if(var2.m != null && (this.R & 384) != 0) {
         this.D = var2.a();
      }

      if(var2.v != null && (this.R & 1024) != 0) {
         this.Kb = var2.b();
      }

      if(var2.y != null) {
         this.Lb = new short[this.K];
         boolean var62 = false;

         for(var64 = 0; var64 < this.K; ++var64) {
            short var70 = var2.y[var64];
            if(var70 != -1) {
               Object[] var8 = this.f_rb;
               var72 = ((ta)(this.f_rb == null?null:var8[6])).k.a(var70, (byte)51);
               if((var6 & 64) != 0 && ((boolean[])((boolean[])var72[3]))[7]) {
                  this.Lb[var64] = -1;
               } else {
                  this.Lb[var64] = var70;
                  var62 = true;
                  if(((int[])((int[])var72[1]))[0] == 2) {
                     this.B = true;
                  }

                  if(((byte[])((byte[])var72[0]))[5] != 0 || ((byte[])((byte[])var72[0]))[6] != 0) {
                     this.f_eb = true;
                  }
               }
            } else {
               this.Lb[var64] = -1;
            }
         }

         if(!var62) {
            this.Lb = null;
         }
      } else {
         this.Lb = null;
      }

      if(this.B || this.s != null) {
         this.f_gb = new short[this.K];

         for(var61 = 0; var61 < this.K; ++var61) {
            this.f_gb[var61] = (short)var10[var61];
         }
      }

   }

   private final void b(boolean var1) {
      if(((int[])((int[])this.f_rb[1]))[10] > 1) {
         synchronized(this) {
            this.a(var1);
         }
      } else {
         this.a(var1);
      }

   }

}
