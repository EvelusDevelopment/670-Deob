
final class gsa {

   static int d;
   static int[] e = new int[4096];
   static int f;
   static int c;
   static int a;
   static int g;
   static int b;
   static int h;


   static final boolean a(int var0, Object[] var1) {
      ++a;
      if(var0 != 6) {
         e = (int[])null;
      }

      return true;
   }

   static final void a(byte var0, int var1) {
      ++c;
      if(var0 == 96) {
         if(dl.d == 0) {
            nqa.a(qs.h, (byte)-93, var1);
         } else {
            sw.a = var1;
         }

      }
   }

   static final void a(ka var0, int var1, Object[] var2) {
      int var3 = 95 / ((var1 + 55) / 52);
      if(ih.a(var2, 0)) {
         var0.a(0, (Object[])((Object[])((Object[])((Object[])var2[2]))[2]), ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[0]);
         if(((boolean[])((boolean[])var2[3]))[1] && ((Object[])((Object[])var2[4]))[3] != null && ((boolean[])((boolean[])((Object[])((Object[])var2[0]))[0]))[0]) {
            var0.a(0, (Object[])((Object[])((Object[])((Object[])var2[0]))[2]), ((int[])((int[])((Object[])((Object[])var2[0]))[1]))[0]);
         }
      }

      ++h;
   }

   static final void a(boolean var0, int[] var1, int var2) {
      ++g;
      if(fh.a(var2, 25401, var1)) {
         if(var0) {
            Object[][] var3 = (Object[][])((Object[][])hca.f[var2][2]);

            for(int var4 = 0; var3.length > var4; ++var4) {
               Object[] var5 = var3[var4];
               if(var5 != null && null != var5[28]) {
                  hna.a(-77, (Object[])((Object[])var5[28]));
               }
            }

         }
      }
   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      ++f;
      var0[9] = hq.a(var2, 196584, true, 24, (byte[])null, false);
      var0[8] = dq.a((Object[])((Object[])var0[9]), 5126, 2, 0, new Object[3], var1 + 0);
      var0[6] = dq.a((Object[])((Object[])var0[9]), 5126, 3, 8, new Object[var1], 3);
      var0[11] = dq.a((Object[])((Object[])var0[9]), 5121, 4, 20, new Object[3], 3);
   }

   static final void a(byte var0, Object[] var1, Object[] var2) {
      var1[1] = eha.a(0, var2);
      ++d;
      var1[3] = eha.a(0, var2);
      var1[2] = eha.a(0, var2);
      int var3 = rda.d(0, var2);
      int var4 = 4 % ((var0 - 34) / 61);
      int var5 = rda.d(0, var2);
      var1[4] = var5 != 0?new Object[var5][]:null;
      var1[0] = var3 != 0?new Object[var3][]:null;

      int var6;
      Object[][] var7;
      Object[] var10;
      for(var6 = 0; var6 < var3; ++var6) {
         var7 = (Object[][])((Object[][])var1[0]);
         var10 = new Object[2];
         var7[var6] = var10;
         iga.a(((Object[][])((Object[][])var1[0]))[var6], -123, var2);
      }

      for(var6 = 0; var5 > var6; ++var6) {
         var7 = (Object[][])((Object[][])var1[4]);
         var10 = new Object[2];
         var7[var6] = var10;
         iga.a(((Object[][])((Object[][])var1[4]))[var6], -90, var2);
      }

   }

   static {
      for(int var0 = 0; 4096 > var0; ++var0) {
         int[] var1 = e;
         int var4 = var0 * (var0 * var0 >> 12) >> 12;
         int var5 = -61440 + var0 * 6;
         int var6 = (var5 * var0 >> 12) + '\ua000';
         int var3 = var4 * var6 >> 12;
         var1[var0] = var3;
      }

   }
}
