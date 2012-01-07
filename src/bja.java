import jagdx.IUnknown;

final class bja {

   static int g;
   static int d;
   static int e;
   static int b;
   static float[] c;
   static int f;
   static Object[] a;


   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, byte[] var8) {
      ++e;
      int var9 = -(var0 >> 2);
      var0 = -(var0 & 3);
      int var10 = -var3;
      if(var6 != -1) {
         a((byte)77, (Object[])null);
      }

      while(var10 < 0) {
         int var11;
         int var10001;
         for(var11 = var9; 0 > var11; ++var11) {
            var10001 = var2++;
            var7[var10001] += var8[var4++];
            var10001 = var2++;
            var7[var10001] += var8[var4++];
            var10001 = var2++;
            var7[var10001] += var8[var4++];
            var10001 = var2++;
            var7[var10001] += var8[var4++];
         }

         for(var11 = var0; 0 > var11; ++var11) {
            var10001 = var2++;
            var7[var10001] += var8[var4++];
         }

         var4 += var5;
         var2 += var1;
         ++var10;
      }

   }

   static final Object[] a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Object[] var8, int var9, int var10, boolean var11, int var12, int var13, int var14, int var15, int var16) {
      taa.a(5, var8);
      ++f;
      wda.a(var7, var0, var4, var4 >> 9, 10, var8, var16, (byte)0, -var10 + Class_ds.a(var0, var16, var4, (byte)122), var16 >> 9, var16 >> 9, var4 >> 9, false);
      naa.a(var8, true);
      ((boolean[])((boolean[])var8[8]))[7] = false;
      ((int[])((int[])var8[12]))[13] = var13;
      ((int[])((int[])var8[12]))[10] = var10;
      ((int[])((int[])var8[12]))[9] = var6;
      ((int[])((int[])var8[12]))[5] = var12;
      ((int[])((int[])var8[12]))[12] = var9;
      ((int[])((int[])var8[12]))[4] = var3;
      ((boolean[])((boolean[])var8[8]))[5] = var11;
      if(var15 != 9581) {
         ((byte[])((byte[])var8[0]))[3] = 38;
      }

      ((int[])((int[])var8[12]))[6] = var5;
      ((int[])((int[])var8[12]))[7] = var2;
      ((int[])((int[])var8[12]))[11] = var14;
      ((int[])((int[])var8[12]))[3] = var1;
      int var17 = ((int[])((int[])qda.a(((int[])((int[])var8[12]))[3], (byte)-64, dfa.a)[1]))[4];
      if(null != var8 && (-2 == ~var8.length || -17 == ~var8.length && var8[7].equals(Boolean.valueOf(false)))) {
         fja.b(8, (Object[])null);
      }

      var8[19] = lea.a(var8, false, (byte)-114, new Object[6]);
      rs.a(var17, (Object[])((Object[])var8[19]), 127);
      toa.a(1, var8, 5029);
      return var8;
   }

   static final eu a(byte var0, Object[] var1) {
      if(var0 > -94) {
         return (eu)null;
      } else {
         ++b;
         return new eu(var1);
      }
   }

   static final void a(Object[] var0, int var1) {
      if(((long[])((long[])var0[4]))[0] != 0L) {
         IUnknown.Release(((long[])((long[])var0[4]))[0]);
         ((long[])((long[])var0[4]))[0] = 0L;
      }

      ++d;
      int var2 = 42 % ((var1 + 49) / 35);
   }

   static final int a(int var0, byte var1, int var2) {
      ++g;
      byte var3;
      if(20081 >= var0) {
         if(var0 > 10031) {
            var3 = 3;
            qla.a((byte)-65);
         } else if(var0 <= 5069) {
            wn.a(true, 114);
            var3 = 1;
         } else {
            var3 = 2;
            eqa.a((byte)-125);
         }
      } else {
         var3 = 4;
         lw.a((byte)124);
      }

      if(bg.a(true, (Object[])((Object[])tu.d[5])) == var2) {
         Class_a.a((Object[])((Object[])tu.d[5]), 3, tu.d, true);
         Class_b.a((byte)-126);
      } else {
         ih.a(tu.d, (Object[])((Object[])tu.d[21]), var2, -109);
         lg.a(false, var2, (byte)-126);
      }

      uk.a((byte)114);
      if(var1 < 96) {
         c = (float[])null;
      }

      return var3;
   }

   static {
      Object[] var1 = new Object[2];
      a = var1;
      c = new float[4];
   }
}
