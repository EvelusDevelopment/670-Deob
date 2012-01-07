
abstract class ap extends cga {

   static int H;
   static int B;
   static int p = 0;
   static int x = 0;
   static int o;
   int j;
   static int k = 0;
   private static int f_l;
   int a;
   int v;
   private static int f;
   static int m;
   static int t = 0;
   private static int h;
   static int s;
   static int c;
   int z;
   static int G;
   static int A;
   int D;
   private static int q;
   static int b;
   private int[] n;
   private static int g = 0;
   static int y = 0;
   static int d;
   int u;
   static int w;
   private static int F = 0;
   static int f_i;
   Object[] C;
   static int e;
   static int r = 0;


   abstract void a(int[] var1, int[] var2, int var3, int var4);

   final void a(int[] var1) {
      var1[0] = this.z;
      var1[1] = this.j;
      var1[2] = this.v;
      var1[3] = this.a;
   }

   abstract void a(int var1, int var2, Class_s var3, int var4, int var5);

   abstract void a(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10);

   abstract void g(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10);

   abstract void e(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10);

   final int f() {
      return this.z + this.D + this.v;
   }

   abstract void a(int var1, int var2, int var3, int var4, int var5);

   private final boolean a(float var1, float var2, float var3, float var4, float var5, float var6) {
      int var7 = this.z + this.D + this.v;
      int var8 = this.j + this.u + this.a;
      float var9;
      float var10;
      float var11;
      float var12;
      float var13;
      float var14;
      float var15;
      float var16;
      if(var7 != this.D || var8 != this.u) {
         var9 = (var3 - var1) / (float)var7;
         var10 = (var4 - var2) / (float)var7;
         var11 = (var5 - var1) / (float)var8;
         var12 = (var6 - var2) / (float)var8;
         var13 = var11 * (float)this.j;
         var14 = var12 * (float)this.j;
         var15 = var9 * (float)this.z;
         var16 = var10 * (float)this.z;
         float var17 = -var9 * (float)this.v;
         float var18 = -var10 * (float)this.v;
         float var19 = -var11 * (float)this.a;
         float var20 = -var12 * (float)this.a;
         var1 += var15 + var13;
         var2 += var16 + var14;
         var3 += var17 + var13;
         var4 += var18 + var14;
         var5 += var15 + var19;
         var6 += var16 + var20;
      }

      var9 = var5 + (var3 - var1);
      var10 = var4 + (var6 - var2);
      if(var1 < var3) {
         var11 = var1;
         var12 = var3;
      } else {
         var11 = var3;
         var12 = var1;
      }

      if(var5 < var11) {
         var11 = var5;
      }

      if(var9 < var11) {
         var11 = var9;
      }

      if(var5 > var12) {
         var12 = var5;
      }

      if(var9 > var12) {
         var12 = var9;
      }

      if(var2 < var4) {
         var13 = var2;
         var14 = var4;
      } else {
         var13 = var4;
         var14 = var2;
      }

      if(var6 < var13) {
         var13 = var6;
      }

      if(var10 < var13) {
         var13 = var10;
      }

      if(var6 > var14) {
         var14 = var6;
      }

      if(var10 > var14) {
         var14 = var10;
      }

      if(var11 < (float)((int[])((int[])this.C[1]))[7]) {
         var11 = (float)((int[])((int[])this.C[1]))[7];
      }

      if(var12 > (float)((int[])((int[])this.C[1]))[19]) {
         var12 = (float)((int[])((int[])this.C[1]))[19];
      }

      if(var13 < (float)((int[])((int[])this.C[1]))[16]) {
         var13 = (float)((int[])((int[])this.C[1]))[16];
      }

      if(var14 > (float)((int[])((int[])this.C[1]))[1]) {
         var14 = (float)((int[])((int[])this.C[1]))[1];
      }

      var12 = var11 - var12;
      if(var12 >= 0.0F) {
         return false;
      } else {
         var14 = var13 - var14;
         if(var14 >= 0.0F) {
            return false;
         } else {
            A = ((int[])((int[])this.C[1]))[4];
            m = (int)((float)((int)var13 * A) + var11);
            var15 = (var3 - var1) * (var6 - var2) - (var4 - var2) * (var5 - var1);
            var16 = (var5 - var1) * (var4 - var2) - (var6 - var2) * (var3 - var1);
            s = (int)((var6 - var2) * 4096.0F * (float)this.D / var15);
            o = (int)((var4 - var2) * 4096.0F * (float)this.u / var16);
            B = (int)((var5 - var1) * 4096.0F * (float)this.D / var16);
            d = (int)((var3 - var1) * 4096.0F * (float)this.u / var15);
            q = (int)(var11 * 16.0F + 8.0F - (var1 + var3 + var5 + var9) / 4.0F * 16.0F);
            f_l = (int)(var13 * 16.0F + 8.0F - (var2 + var4 + var6 + var10) / 4.0F * 16.0F);
            f_i = (this.D >> 1 << 12) + (f_l * B >> 4);
            H = (this.u >> 1 << 12) + (f_l * d >> 4);
            c = q * s >> 4;
            e = q * o >> 4;
            f = (int)var11;
            G = (int)var12;
            h = (int)var13;
            w = (int)var14;
            return true;
         }
      }
   }

   final int d() {
      return this.j + this.u + this.a;
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(ui.m(this.C)) {
         throw new IllegalStateException();
      } else {
         if(this.n == null) {
            this.n = new int[4];
         }

         ui.c(this.C, this.n);
         ui.c(this.C, ((int[])((int[])this.C[1]))[7], ((int[])((int[])this.C[1]))[16], var1 + var3, var2 + var4);
         int var8 = this.f();
         int var9 = this.d();
         int var10 = (var3 + var8 - 1) / var8;
         int var11 = (var4 + var9 - 1) / var9;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var12 * var9;

            for(int var14 = 0; var14 < var10; ++var14) {
               this.a(var1 + var14 * var8, var2 + var13, var5, var6, var7);
            }
         }

         ui.d(this.C, this.n[0], this.n[1], this.n[2], this.n[3]);
      }
   }

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class_s var8, int var9, int var10) {
      if(ui.m(this.C)) {
         throw new IllegalStateException();
      } else if(this.a(var1, var2, var3, var4, var5, var6)) {
         bk var11;
         Object[] var12 = (var11 = (bk)var8) == null?null:var11.f_l;
         this.a((int[])((int[])var12[0]), (int[])((int[])var12[2]), f - var9, -var10 - (w - h));
      }
   }

   abstract void c(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10);

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      if(ui.m(this.C)) {
         throw new IllegalStateException();
      } else if(this.a(var1, var2, var3, var4, var5, var6)) {
         b = var8;
         if(var7 != 1) {
            y = var8 >>> 24;
            r = 256 - y;
            if(var7 == 0) {
               k = (var8 & 16711680) >> 16;
               t = (var8 & '\uff00') >> 8;
               x = var8 & 255;
            } else if(var7 == 2) {
               F = var8 >>> 24;
               g = 256 - F;
               int var11 = (var8 & 16711935) * g & -16711936;
               int var12 = (var8 & '\uff00') * g & 16711680;
               p = (var11 | var12) >>> 8;
            }
         }

         if(var7 == 1) {
            if(var9 == 0) {
               this.b(1, 0);
            } else if(var9 == 1) {
               this.b(1, 1);
            } else if(var9 == 2) {
               this.b(1, 2);
            }
         } else if(var7 == 0) {
            if(var9 == 0) {
               this.b(0, 0);
            } else if(var9 == 1) {
               this.b(0, 1);
            } else if(var9 == 2) {
               this.b(0, 2);
            }
         } else if(var7 == 3) {
            if(var9 == 0) {
               this.b(3, 0);
            } else if(var9 == 1) {
               this.b(3, 1);
            } else if(var9 == 2) {
               this.b(3, 2);
            }
         } else if(var7 == 2) {
            if(var9 == 0) {
               this.b(2, 0);
            } else if(var9 == 1) {
               this.b(2, 1);
            } else if(var9 == 2) {
               this.b(2, 2);
            }
         }

      }
   }

   abstract void b(int var1, int var2);

   final int e() {
      return this.D;
   }

   abstract void b(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10);

   abstract void h(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10);

   abstract void d(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10);

   ap(Object[] var1, int var2, int var3) {
      this.C = var1;
      this.D = var2;
      this.u = var3;
   }

   abstract void f(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10);

   final void a(int var1, int var2, int var3, int var4) {
      this.z = var1;
      this.j = var2;
      this.v = var3;
      this.a = var4;
   }

   final int g() {
      return this.u;
   }

}
