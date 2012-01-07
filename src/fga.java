
final class fga {

   static Object[] a = Class_fs.a(1, (byte)-88, new Object[1], 0, 12, 0);
   static int b;
   static byte[][][] d;
   static int c;


   static final void a(int var0, byte var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      ++b;
      int var8 = -334 + var0;
      if(0 <= var8) {
         if(100 < var8) {
            var8 = 100;
         }
      } else {
         var8 = 0;
      }

      int var9 = psa.f + var8 * (-psa.f + sr.d) / 100;
      var2 = var9 * var2 >> 8;
      int var11 = -95 / ((var1 + 22) / 33);
      mja.h = mja.c * var9 >> 8;
      int var10 = 16383 & -var6 + 16384;
      int var12 = 16384 - var5 & 16383;
      int var13 = 0;
      int var14 = 0;
      int var15 = var2;
      if(var10 != 0) {
         var14 = -var2 * tda.p[var10] >> 14;
         var15 = tda.k[var10] * var2 >> 14;
      }

      if(var12 != 0) {
         var13 = var15 * tda.p[var12] >> 14;
         var15 = var15 * tda.k[var12] >> 14;
      }

      woa.M = var7 - var13;
      pta.f = var3 - var15;
      qaa.r = var6;
      qt.e = -var14 + var4;
      cp.a = var5;
      kk.f_l = 0;
   }

   static final ig a(int var0, byte var1, int var2, Object[] var3, int[][] var4, int var5) {
      if(var1 != 74) {
         return (ig)null;
      } else {
         ++c;
         return new ig(var3, var2, var5, var0, var4);
      }
   }

}
