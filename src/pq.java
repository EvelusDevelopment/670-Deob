
final class pq {

   static int g;
   static int f;
   static int a;
   static int b;
   static int e;
   static int d;
   static int c;


   static final void a(byte var0, Object[] var1) {
      int var2 = -71 / ((var0 - 48) / 49);
      ++d;
      if(null == var1 || -12 != ~var1.length) {
         while(true) {
            uq var3;
            Object[] var5 = (var3 = (uq)rv.a((Object[])((Object[])var1[0]), -60)) == null?null:var3.f_l;
            if(var5 == null) {
               return;
            }

            ((nj)(null == var5?null:var5[0])).a(1);
            ie.a(var5, 23247);
         }
      }
   }

   static final int b(Object[] var0, int var1) {
      if(var1 >= -5) {
         b((Object[])null, -117);
      }

      ++b;
      if(null != var0 && var0.length == 43 && 10 == ((boolean[])((boolean[])var0[8])).length) {
         int var2;
         if(null != ((Object[])((Object[])var0[42]))[11]) {
            Object[] var3 = ria.a(eo.g, (Object[])((Object[])var0[42]), -59);
            if(var3 != null && -1 != ((int[])((int[])var3[1]))[6]) {
               var2 = ((int[])((int[])var3[1]))[6];
               return var2;
            }
         }

         var2 = -1 == ((int[])((int[])((Object[])((Object[])var0[42]))[1]))[6]?a(var0, false):((int[])((int[])((Object[])((Object[])var0[42]))[1]))[6];
         return var2;
      } else {
         return a(var0, false);
      }
   }

   static final void a(Object[] var0, int var1) {
      if(var0[3] == null) {
         var0[3] = new boolean[2];
      }

      if(var1 <= -22) {
         if(null == var0[1]) {
            var0[1] = new int[10];
         }

         ++f;
      }
   }

   static final int a(int var0, int var1, int var2) {
      ++g;
      if(var2 <= 34) {
         return -17;
      } else {
         int var3 = var0 >>> 31;
         return -var3 + (var3 + var0) / var1;
      }
   }

   static final void a(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8, Object[] var9) {
      ++a;
      if(var8) {
         b((Object[])((Object[])var9[1]), -23);
      }

      ((float[])((float[])var9[0]))[3] = 0.0F;
      ((float[])((float[])var9[0]))[5] = var0 * 2.0F / var1;
      ((float[])((float[])var9[0]))[1] = 0.0F;
      ((float[])((float[])var9[0]))[2] = 0.0F;
      ((float[])((float[])var9[0]))[4] = 0.0F;
      ((float[])((float[])var9[0]))[0] = var5 * 2.0F / var2;
      ((float[])((float[])var9[0]))[6] = 0.0F;
      ((float[])((float[])var9[0]))[7] = 0.0F;
      if(null == var9 || 1 != var9.length) {
         ((float[])((float[])var9[0]))[14] = 2.0F * var6 * var7 / (-var6 + var7);
         ((float[])((float[])var9[0]))[13] = 0.0F;
         ((float[])((float[])var9[0]))[15] = 0.0F;
         ((float[])((float[])var9[0]))[10] = (var6 + var7) / (var6 - var7);
         ((float[])((float[])var9[0]))[9] = -1.0F + 2.0F * var3 / var1;
         ((float[])((float[])var9[0]))[12] = 0.0F;
         ((float[])((float[])var9[0]))[11] = 1.0F;
         ((float[])((float[])var9[0]))[8] = -1.0F + var4 * 2.0F / var2;
      }
   }

   private static final int a(Object[] var0, boolean var1) {
      ++c;
      Object[] var2 = ro.a((int)3, var0);
      int var3;
      if(~((int[])((int[])var2[1]))[32] != 0) {
         var3 = ((int[])((int[])var2[1]))[32];
      } else if(((int[])((int[])var0[12]))[7] == -32768) {
         var3 = 200;
      } else {
         var3 = -((int[])((int[])var0[12]))[7];
      }

      Object[] var4 = woa.a(5, var0);
      int var5 = (int)((float[])((float[])((Object[])((Object[])var4[1]))[1]))[2] >> 9;
      if(var1) {
         a(0.34805495F, ((float[])((float[])var0[2]))[16], 0.12718847F, ((float[])((float[])var0[1]))[19], -1.9739654F, -0.8637656F, -2.3007548F, 0.9451383F, ((boolean[])((boolean[])var0[7]))[0], (Object[])((Object[])var0[1]));
      }

      int var6 = (int)((float[])((float[])((Object[])((Object[])var4[1]))[1]))[1] >> 9;
      if(var5 >= 1 && 1 <= var6 && var5 <= -1 + rp.c && wpa.a - 1 >= var6) {
         Object[] var7 = ju.g[((byte[])((byte[])var0[10]))[0]][var5][var6];
         if(null != var7 && var7[6] != null) {
            return ((short[])((short[])((Object[])((Object[])var7[6]))[14]))[0] + var3;
         }
      }

      return var3;
   }

   static final Object[] a(int var0, Object[] var1) {
      ++e;
      rca var3 = new rca(var1);
      var1[0] = var3;
      if(var0 != 14852) {
         return (Object[])null;
      } else {
         var1[2] = wua.a(true, new Object[2]);
         var1[1] = nj.a(var0 ^ 14855, new Object[2]);
         return var1;
      }
   }

}
