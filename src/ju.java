
final class ju {

   static boolean[][] e;
   static Object[] f;
   static int b;
   static Object[][][][] g;
   static int d;
   static int a;
   static int c;


   static final void a(Object[] var0, byte var1, Object[] var2) {
      if(var1 > -2) {
         a((Object[])null, (Object[])null, (Object[])null, (byte)33);
      }

      ++b;
      var2[25] = var0;
   }

   static final void a(Object[] var0, Object[] var1, Object[] var2, byte var3) {
      ++d;
      if(var3 != -117) {
         a((Object[])null, ((byte[])((byte[])var1[0]))[4], (Object[])null);
      }

      int var4 = va.a(var1, (byte)105);
      int var5 = nba.a(var1, (byte)-108);
      if(eva.b(-70, var1) == wf.a) {
         if(var4 >= 0) {
            gj.a(var0, 16, hna.a((byte)48, wg.z, var2), (byte)120, var4);
         }

         if(0 <= var5) {
            gua.a(16, var5, hna.a((byte)91, wg.z, var2), 99, var0);
         }

      } else {
         throw new bba(var1, "");
      }
   }

   static final void a(int var0, int var1, Object[][] var2) {
      ++c;
      int var4 = 0;
      if(var1 > 16) {
         for(; var4 < var2.length; ++var4) {
            Object[] var5 = var2[var4];
            if(null != var5 && ((int[])((int[])var5[1]))[39] == var0 && !client.a(var5)) {
               if(((int[])((int[])var5[1]))[18] == 0) {
                  a(((int[])((int[])var5[1]))[3], 126, var2);
                  if(var5[7] != null) {
                     a(((int[])((int[])var5[1]))[3], 40, (Object[][])((Object[][])var5[7]));
                  }

                  oh var3;
                  Object[] var6 = (var3 = (oh)pm.a((long)((int[])((int[])var5[1]))[3], lfa.c, false)) == null?null:var3.p;
                  if(null != var6) {
                     ur.a(((int[])((int[])var6[1]))[1], true);
                  }
               }

               if(-7 == ~((int[])((int[])var5[1]))[18] && -1 != ((int[])((int[])var5[1]))[51]) {
                  if(null == var5[28]) {
                     var5[28] = ij.a(-22856, new Object[5]);
                     rs.a(((int[])((int[])var5[1]))[51], (Object[])((Object[])var5[28]), 115);
                  }

                  if(iha.a(Class_ds.c, (byte)-122, (Object[])((Object[])var5[28])) && ela.a((Object[])((Object[])var5[28]), 3)) {
                     hna.a(-57, (Object[])((Object[])var5[28]));
                  }
               }
            }
         }

      }
   }

   static final int a(Object[] var0, int var1, Object[][] var2, int var3, boolean var4) {
      ++a;
      long var5 = nba.e[((byte[])((byte[])var0[10]))[0]][var1][var3];
      if(var0 != null && 3 == var0.length) {
         dca.a(true, (Object[])null);
      }

      long var7 = 0L;

      int var9;
      int var10;
      for(var9 = 0; -49L <= ~var7; var7 += 16L) {
         var10 = (int)(var5 >> (int)var7 & 65535L);
         if(0 >= var10) {
            break;
         }

         var2[var9++] = (Object[])((Object[])qd.c[var10 - 1][3]);
      }

      for(var10 = var9; var10 < 4; ++var10) {
         var2[var10] = null;
      }

      return !var4?((int[])((int[])f[23]))[8]:var9;
   }

}
