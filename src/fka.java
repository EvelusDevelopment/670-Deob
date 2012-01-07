
final class fka {

   static int f_i;
   static int d;
   static int c = 0;
   static Object[] h = sd.a(new Object[1], 27, (byte)121);
   static int g;
   static int e;
   static int b;
   static int f = 0;
   static int a;
   static int j = -50;


   static final int a(byte var0, Object[] var1) {
      ++e;
      if(var0 > -124) {
         var1[1] = (Object)null;
      }

      return ((int[])((int[])((Object[])((Object[])var1[18]))[1]))[6];
   }

   static final boolean a(int var0, Object[] var1) {
      ++a;
      if(var0 != -20000) {
         h = (Object[])null;
      }

      if(var1[8] == null) {
         double var4 = (double)nk.b(var0 ^ -19999, (Object[])((Object[])var1[3]));
         return var4 == 0.0D || (double)he.a(92) >= (double)wn.a((Object[])((Object[])var1[3]), 114) + 1000.0D / var4;
      } else {
         Object[] var3 = (Object[])((Object[])var1[3]);
         boolean var2 = ((boolean[])((boolean[])var3[8]))[2];
         return !var2 || ae.a(-2, var1) > jj.a(3, (Object[])((Object[])var1[3]));
      }
   }

   static final int[] a(int var0, int var1, Object[] var2) {
      ++b;
      int[] var3 = od.a(-1704, var1, (Object[])((Object[])var2[5]));
      if(((boolean[])((boolean[])((Object[])((Object[])var2[5]))[4]))[0]) {
         int[] var4 = vea.a(var2, 1, var1, (byte)-8);
         if(null != var2 && (var2.length == 3 || -3 == ~var2.length)) {
            wga.b((Object[])null, 2);
         }

         int[] var5 = vea.a(var2, 2, var1, (byte)-8);

         for(int var6 = 0; var6 < fo.b; ++var6) {
            int var7 = (4091 & var4[var6]) >> 4;
            int var8 = ((int[])((int[])var2[1]))[2] * var5[var6] >> 12;
            int var9 = var8 * usa.c[var7] >> 12;
            int var10 = var8 * ad.c[var7] >> 12;
            int var11 = var6 + (var9 >> 12) & td.q;
            int var12 = wq.e & var1 + (var10 >> 12);
            int[] var13 = vea.a(var2, 0, var12, (byte)-8);
            var3[var6] = var13[var11];
         }
      }

      return var0 <= 6?(int[])((int[])h[4]):var3;
   }

   static final Object[] a(int[][] var0, int var1, Object[] var2, boolean var3, int var4) {
      ++f_i;
      return var1 != -21047?(Object[])((Object[])h[8]):td.a(var3, true, var4, new Object[9], var2, var0);
   }

   static final void a(int var0, int[] var1, int var2, int var3, byte var4) {
      --var3;
      ++g;
      --var2;
      int var5 = -7 + var2;

      for(int var6 = -47 % ((-6 - var4) / 35); var5 > var3; var1[var3] = var0) {
         ++var3;
         var1[var3] = var0;
         ++var3;
         var1[var3] = var0;
         ++var3;
         var1[var3] = var0;
         ++var3;
         var1[var3] = var0;
         ++var3;
         var1[var3] = var0;
         ++var3;
         var1[var3] = var0;
         ++var3;
         var1[var3] = var0;
         ++var3;
      }

      while(var3 < var2) {
         ++var3;
         var1[var3] = var0;
      }

   }

}
