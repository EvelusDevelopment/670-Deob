
final class hea extends lm {

   private int k;
   int j;
   private int[] m;
   private static int[] n;
   int f_l;
   boolean o;


   final int[] a() {
      return this.m;
   }

   final void a(int var1, int var2) {
      if(var1 != 0 || var2 != 0) {
         if(n == null || n.length != this.m.length) {
            n = new int[this.m.length];
         }

         int var3 = this.m.length;
         int var4 = var1;
         int var5 = this.k - 1;
         int var6 = this.k * var2;
         int var7 = var3 - 1;

         for(int var8 = 0; var8 < var3; var8 += this.k) {
            int var9 = var8 + var6 & var7;

            for(int var10 = 0; var10 < this.k; ++var10) {
               int var11 = var8 + var10;
               int var12 = var9 + (var10 + var4 & var5);
               n[var11] = this.m[var12];
            }
         }

         int[] var13 = this.m;
         this.m = n;
         n = var13;
      }
   }

   hea(int var1, int var2, int[] var3, boolean var4) {
      this.f_l = var1;
      this.k = var2;
      this.m = var3;
      if(var4) {
         int[] var5 = new int[this.k];
         int[] var6 = new int[this.k];
         int[] var7 = new int[this.k];
         int[] var8 = new int[this.k];
         if(n == null || n.length != this.m.length) {
            n = new int[this.m.length];
         }

         int var13 = this.k;
         int var14 = this.k;
         int var15 = var13 - 1;
         int var16 = var14 - 1;
         int var17 = var13 * var14;
         int var12;
         int var11 = var12 = 1 * var13;

         int var9;
         int var18;
         for(var18 = 2; var18 >= 0; --var18) {
            for(var9 = var15; var9 >= 0; --var9) {
               --var12;
               int var10 = this.m[var12];
               var5[var9] += var10 >> 24 & 255;
               var6[var9] += var10 >> 16 & 255;
               var7[var9] += var10 >> 8 & 255;
               var8[var9] += var10 & 255;
            }

            if(var12 == 0) {
               var12 = var17;
            }
         }

         int var24 = var17;

         for(int var31 = var16; var31 >= 0; --var31) {
            int var25 = 1;
            int var26 = 1;
            int var30 = 0;
            int var29 = 0;
            int var28 = 0;
            int var27 = 0;

            for(var9 = 2; var9 >= 0; --var9) {
               --var26;
               var27 += var5[var26];
               var28 += var6[var26];
               var30 += var7[var26];
               var29 += var8[var26];
               if(var26 == 0) {
                  var26 = var13;
               }
            }

            for(var9 = var15; var9 >= 0; --var9) {
               --var26;
               --var25;
               var18 = var27 / 9;
               int var19 = var28 / 9;
               int var20 = var30 / 9;
               int var21 = var29 / 9;
               --var24;
               n[var24] = var18 << 24 | var19 << 16 | var20 << 8 | var21;
               var27 += var5[var26] - var5[var25];
               var28 += var6[var26] - var6[var25];
               var29 += var8[var26] - var8[var25];
               var30 += var7[var26] - var7[var25];
               if(var26 == 0) {
                  var26 = var13;
               }

               if(var25 == 0) {
                  var25 = var13;
               }
            }

            for(var9 = var15; var9 >= 0; --var9) {
               --var12;
               int var23 = this.m[var12];
               --var11;
               int var22 = this.m[var11];
               var5[var9] += (var23 >> 24 & 255) - (var22 >> 24 & 255);
               var6[var9] += (var23 >> 16 & 255) - (var22 >> 16 & 255);
               var7[var9] += (var23 >> 8 & 255) - (var22 >> 8 & 255);
               var8[var9] += (var23 & 255) - (var22 & 255);
            }

            if(var12 == 0) {
               var12 = var17;
            }

            if(var11 == 0) {
               var11 = var17;
            }
         }

         int[] var32 = this.m;
         this.m = n;
         n = var32;
      }

   }
}
