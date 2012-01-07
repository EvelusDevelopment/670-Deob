import java.nio.ByteBuffer;

final class hga {

   static int d;
   static int h = 1408;
   static int e;
   static int f;
   static int g = 0;
   static int c;
   static int b;
   static int a;


   static final Object[] a(boolean var0, int var1, int var2, boolean var3, Object[] var4, int var5, int var6, int var7, int var8, int var9, int var10, ta var11, Object[] var12) {
      ++d;
      jk.a(127, var4);
      if(var4 != null && (-8 == ~var4.length || var4.length == 5)) {
         sda.a((ta)null, (byte)123, (Object[])null, -80);
      }

      int var19;
      if(var8 != 1 && 3 != var8) {
         var19 = ira.h[3 & var10];
      } else {
         var19 = vn.c[var10 & 3];
      }

      ps.a(var1, var2, var4, var6, false, var5, var7, var19);
      ((boolean[])((boolean[])var4[8]))[4] = var0;
      ((int[])((int[])var4[12]))[3] = ((int[])((int[])var12[1]))[13];
      if(var9 != -3485) {
         a(-76, -98, ((boolean[])((boolean[])var12[2]))[0], (Object[][])((Object[][])null), 97, ((int[])((int[])((Object[])((Object[])var4[6]))[15]))[6]);
      }

      ((byte[])((byte[])var4[10]))[2] = (byte)var10;
      ((boolean[])((boolean[])var4[8]))[7] = ((int[])((int[])var12[1]))[11] != 0 && !var3;
      ((byte[])((byte[])var4[10]))[3] = (byte)var8;
      ((boolean[])((boolean[])var4[8]))[5] = var3;
      ((boolean[])((boolean[])var4[8]))[6] = var11.n() && ((boolean[])((boolean[])var12[0]))[10] && !((boolean[])((boolean[])var4[8]))[5] && ft.a((Object[])((Object[])tu.d[13]), (int)-14072) != 0;
      int var20 = 2048;
      if(((boolean[])((boolean[])var4[8]))[4]) {
         var20 |= 65536;
      }

      Object[] var21 = qra.a(var20, ((boolean[])((boolean[])var4[8]))[6], var11, var4, -128);
      if(var21 != null) {
         var4[19] = var21[1];
         var4[16] = var21[0];
         if(((boolean[])((boolean[])var4[8]))[4]) {
            var4[19] = ((ka)var4[19]).a((byte)0, var20, false);
         }
      }

      toa.a(1, var4, var9 + 8514);
      return var4;
   }

   static final void a(byte var0, kp var1) {
      var1.f_l = false;
      if(null != var1.k) {
         var1.k.j = 0;
      }

      ++b;
      if(var0 <= -10) {
         for(kp var2 = var1.b(); null != var2; var2 = var1.a()) {
            a((byte)-74, var2);
         }

      }
   }

   static final lm b(Object[] var0, int var1) {
      ++f;
      lm var2 = (lm)var0[1];
      if(var2 == var0[0]) {
         var0[1] = null;
         return null;
      } else {
         if(var1 != 14570) {
            a(-69, 106, ((boolean[])((boolean[])var0[0]))[8], (Object[][])((Object[][])null), 19, -23);
         }

         var0[1] = var2.d;
         return var2;
      }
   }

   static final void a(Object[] var0, boolean var1) {
      ++c;
      if(var0[1] == null) {
         var0[1] = new int[7];
      }

      if(var1) {
         g = -4;
      }

   }

   static final void a(int var0, int var1, boolean var2, Object[][] var3, int var4, int var5) {
      for(int var6 = var4; ~var6 > ~var3.length; ++var6) {
         Object[] var7 = var3[var6];
         if(var7 != null && ((int[])((int[])var7[1]))[39] == var5) {
            wea.a(var1, var2, var7, var0, 2);
            kia.a(var7, var0, var1, -83);
            if(((int[])((int[])var7[1]))[0] > -((int[])((int[])var7[1]))[70] + ((int[])((int[])var7[1]))[56]) {
               ((int[])((int[])var7[1]))[0] = ((int[])((int[])var7[1]))[56] - ((int[])((int[])var7[1]))[70];
            }

            if(((int[])((int[])var7[1]))[0] < 0) {
               ((int[])((int[])var7[1]))[0] = 0;
            }

            if(((int[])((int[])var7[1]))[7] > -((int[])((int[])var7[1]))[2] + ((int[])((int[])var7[1]))[55]) {
               ((int[])((int[])var7[1]))[7] = ((int[])((int[])var7[1]))[55] + -((int[])((int[])var7[1]))[2];
            }

            if(((int[])((int[])var7[1]))[7] < 0) {
               ((int[])((int[])var7[1]))[7] = 0;
            }

            if(null != var7 && 4 == var7.length && var7[1].equals(Boolean.valueOf(false)) && var7[1].equals(Boolean.valueOf(false))) {
               fc.b = (String[])((String[])pi.y[0]);
            }

            if(((int[])((int[])var7[1]))[18] == 0) {
               tua.a(var7, var2, (byte)112, var3);
            }
         }
      }

      ++a;
   }

   static final void a(Object[] var0, int var1) {
      ++e;
      if(null == var0[0]) {
         var0[0] = mc.a(-103, (Object[])((Object[])var0[10]), false);
         lm.a(4, (Object[])((Object[])var0[0]), 12, -26241);
         if(var1 != -390) {
            g = 1;
         }

         ByteBuffer var2 = (ByteBuffer)((Object[])((Object[])var0[10]))[57];
         if(var0 != null && var0.length == 1) {
            oma.a((Object[])null, -8, 110, (Object[])null, (byte)87);
         }

         var2.clear();
         var2.putFloat(0.0F);
         var2.putFloat(1.0F);
         var2.putFloat(2.0F);
         nda.a(-18243, (Object[])((Object[])var0[0]), var2.position(), 0, ((long[])((long[])((Object[])((Object[])var0[10]))[50]))[0]);
         var0[11] = ao.a(new Object[][]{sv.a(var1 + 32065, new Object[2], eba.k)}, (Object[])((Object[])var0[10]), false);
      }
   }

}
