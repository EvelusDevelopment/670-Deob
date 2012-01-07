import jagdx.IUnknown;

final class gua {

   static Object[] f;
   static int c;
   static int a;
   static int b;
   static int d;
   static int e;


   static final int b(Object[] var0, int var1) {
      if(var1 != 2) {
         a(105, 43, (float[])null, 16, (Object[])null);
      }

      ++a;
      return ((int[])((int[])var0[1]))[0];
   }

   static final void a(int var0, float var1, float var2, int var3, float var4, int var5, byte[] var6, int var7, int var8, Object[] var9, int var10, float var11, int var12, float var13) {
      ++c;
      int var14 = var7 * var8;
      if(var10 < -20) {
         float[] var15 = new float[var14];

         int var17;
         int var16;
         for(var16 = 0; var5 > var16; ++var16) {
            rea.a(var7, var13 * 127.0F, var3, var9, 0, var1 / (float)var3, var11 / (float)var7, var0, false, var8, var4 / (float)var8, var15);
            var17 = var12;
            var11 *= 2.0F;
            var1 *= 2.0F;
            var13 *= var2;

            for(int var18 = 0; var18 < var14; ++var18) {
               var6[var17] = (byte)((int)((float)var6[var17] + var15[var18]));
               ++var17;
            }

            var4 *= 2.0F;
         }

         var16 = var12;

         for(var17 = 0; var14 > var17; ++var17) {
            var6[var16] = (byte)(127 + var6[var16]);
            ++var16;
         }

      }
   }

   static final void a(boolean var0, Object[] var1) {
      if(!var0) {
         a(40, ((int[])((int[])f[1]))[39], (float[])null, -21, (Object[])null);
      }

      if(((long[])((long[])var1[4]))[2] != 0L) {
         IUnknown.Release(((long[])((long[])var1[4]))[2]);
         ((long[])((long[])var1[4]))[2] = 0L;
      }

      ++b;
      if(0L != ((long[])((long[])var1[4]))[0]) {
         IUnknown.Release(((long[])((long[])var1[4]))[0]);
         ((long[])((long[])var1[4]))[0] = 0L;
      }

      if(0L != ((long[])((long[])var1[4]))[1]) {
         IUnknown.Release(((long[])((long[])var1[4]))[1]);
         ((long[])((long[])var1[4]))[1] = 0L;
      }

      bk.a(var1, (Object[])((Object[])var1[3]), 5);
   }

   static final void a(Object[] var0, int var1) {
      var0[var1] = sj.a(64, new Object[3], (byte)-76);
      ++e;
   }

   static final void a(int var0, int var1, float[] var2, int var3, Object[] var4) {
      qo.a(var2, 0, (float[])((float[])var4[7]), var1 * 4, var0);
      ++d;
      ((boolean[])((boolean[])var4[8]))[2] = true;
      int var5 = -15 / ((var3 + 42) / 42);
   }

}
