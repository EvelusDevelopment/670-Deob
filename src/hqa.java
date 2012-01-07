
final class hqa {

   static Object[] c = nb.a((byte)80, 8, new Object[5]);
   static int a;
   static int e;
   static int d;
   static Object[][] b = new Object[128][];


   static final boolean a(Object[] var0, int var1) {
      ++e;
      if(var1 > -2) {
         a((Object[])null, ((int[])((int[])c[3]))[14]);
      }

      return ((boolean[])((boolean[])var0[3]))[0];
   }

   static final void a(int var0, Object[] var1) {
      ++a;
      if(null == var1[1]) {
         var1[1] = new int[4];
      }

      if(var0 <= 115) {
         a((Object[])null, (Object[][])((Object[][])null), ((byte[])((byte[])c[0]))[5]);
      }

   }

   static final int a(Object[] var0, Object[][] var1, byte var2) {
      try {
         ++d;
         Object[] var3 = (Object[])((Object[])woa.a(5, var0)[1]);
         int var4 = (int)((float[])((float[])var3[1]))[2] >> qqa.e;
         if(null != var0 && (var0.length == 8 && var0[3].equals(Integer.valueOf(1)) && var0[3].equals(Integer.valueOf(2)) || var0.length == 6)) {
            return 1;
         } else {
            int var5 = (int)((float[])((float[])var3[1]))[1] >> qqa.e;
            int var6 = 0;
            if(bd.h == var4) {
               ++var6;
            } else if(var4 > bd.h) {
               var6 += 2;
            }

            if(var5 == oaa.a) {
               var6 += 3;
            } else if(var5 < oaa.a) {
               var6 += 6;
            }

            int var8 = 39 % ((var2 + 17) / 45);
            int var7 = bia.b[var6];
            if((((short[])((short[])var0[15]))[0] & var7) == 0) {
               if(1 == ((short[])((short[])var0[15]))[0] && var4 > 0) {
                  return ju.a(var0, var4 - 1, var1, var5, true);
               } else if(-5 == ~((short[])((short[])var0[15]))[0] && var4 <= eja.c) {
                  return ju.a(var0, var4 + 1, var1, var5, true);
               } else if(-9 == ~((short[])((short[])var0[15]))[0] && var5 > 0) {
                  return ju.a(var0, var4, var1, -1 + var5, true);
               } else if(((short[])((short[])var0[15]))[0] == 2 && me.c >= var5) {
                  return ju.a(var0, var4, var1, var5 + 1, true);
               } else if(((short[])((short[])var0[15]))[0] == 16 && var4 > 0 && me.c >= var5) {
                  return ju.a(var0, -1 + var4, var1, 1 + var5, true);
               } else if(((short[])((short[])var0[15]))[0] == 32 && eja.c >= var4 && var5 <= me.c) {
                  return ju.a(var0, 1 + var4, var1, var5 + 1, true);
               } else if(-129 == ~((short[])((short[])var0[15]))[0] && var4 > 0 && 0 < var5) {
                  return ju.a(var0, var4 - 1, var1, var5 - 1, true);
               } else if(((short[])((short[])var0[15]))[0] == 64 && var4 <= eja.c && var5 > 0) {
                  return ju.a(var0, var4 + 1, var1, var5 - 1, true);
               } else {
                  throw new RuntimeException("");
               }
            } else {
               return ju.a(var0, var4, var1, var5, true);
            }
         }
      } catch (RuntimeException var9) {
         throw vt.a(var9, "hqa.A(" + (var0 != null?"{...}":"null") + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ')');
      }
   }

}
