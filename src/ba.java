
final class ba {

   private static float[][] a = new float[2][8];
   static int[][] g = new int[2][8];
   private int[] b = new int[2];
   static int f;
   int[] c = new int[2];
   private static float e;
   private int[][][] h = new int[2][2][4];
   private int[][][] d = new int[2][2][4];


   private final float b(int var1, int var2, float var3) {
      float var4 = (float)this.h[var1][0][var2] + var3 * (float)(this.h[var1][1][var2] - this.h[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return a(var4);
   }

   final void a(Object[] var1, koa var2) {
      int var3 = fh.a(var1, false);
      this.c[0] = var3 >> 4;
      this.c[1] = var3 & 15;
      if(var3 != 0) {
         this.b[0] = de.a((int)0, var1);
         this.b[1] = de.a((int)0, var1);
         int var4 = fh.a(var1, false);

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.c[var5]; ++var6) {
               this.h[var5][0][var6] = de.a((int)0, var1);
               this.d[var5][0][var6] = de.a((int)0, var1);
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.c[var5]; ++var6) {
               if((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.h[var5][1][var6] = de.a((int)0, var1);
                  this.d[var5][1][var6] = de.a((int)0, var1);
               } else {
                  this.h[var5][1][var6] = this.h[var5][0][var6];
                  this.d[var5][1][var6] = this.d[var5][0][var6];
               }
            }
         }

         if(var4 != 0 || this.b[1] != this.b[0]) {
            var2.a(var1);
         }
      } else {
         int[] var7 = this.b;
         this.b[1] = 0;
         var7[0] = 0;
      }

   }

   final int a(int var1, float var2) {
      float var3;
      if(var1 == 0) {
         var3 = (float)this.b[0] + (float)(this.b[1] - this.b[0]) * var2;
         var3 *= 0.0030517578F;
         e = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         f = (int)(e * 65536.0F);
      }

      if(this.c[var1] == 0) {
         return 0;
      } else {
         var3 = this.a(var1, 0, var2);
         a[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.b(var1, 0, var2));
         a[var1][1] = var3 * var3;

         int var4;
         for(var4 = 1; var4 < this.c[var1]; ++var4) {
            var3 = this.a(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.b(var1, var4, var2));
            float var6 = var3 * var3;
            a[var1][var4 * 2 + 1] = a[var1][var4 * 2 - 1] * var6;
            a[var1][var4 * 2] = a[var1][var4 * 2 - 1] * var5 + a[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               a[var1][var7] += a[var1][var7 - 1] * var5 + a[var1][var7 - 2] * var6;
            }

            a[var1][1] += a[var1][0] * var5 + var6;
            a[var1][0] += var5;
         }

         if(var1 == 0) {
            for(var4 = 0; var4 < this.c[0] * 2; ++var4) {
               a[0][var4] *= e;
            }
         }

         for(var4 = 0; var4 < this.c[var1] * 2; ++var4) {
            g[var1][var4] = (int)(a[var1][var4] * 65536.0F);
         }

         return this.c[var1] * 2;
      }
   }

   private final float a(int var1, int var2, float var3) {
      float var4 = (float)this.d[var1][0][var2] + var3 * (float)(this.d[var1][1][var2] - this.d[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   private static final float a(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

}
