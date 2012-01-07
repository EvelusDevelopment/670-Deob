
final class bd {

   static Object[] e = sl.a("29", 0, new Object[1], "29");
   static int d;
   static int c;
   static int h;
   static Object[] b;
   static int f;
   static int g;
   static int a;


   static final int a(byte var0, Object[] var1) {
      if(var0 != -127) {
         return -49;
      } else {
         ++g;
         return 0;
      }
   }

   static final String a(Object[] var0, int var1, String var2, byte var3) {
      ++c;
      if(null != var0[1]) {
         if(var3 > -118) {
            b = (Object[])null;
         }

         ns var4;
         Object[] var5 = (var4 = (ns)pm.a((long)var1, (Object[])((Object[])var0[1]), false)) == null?null:var4.n;
         return var5 == null?var2:(String)var5[0];
      } else {
         return var2;
      }
   }

   static final gea a(int var0, Object[] var1) {
      ++d;
      if(var0 != -1) {
         b = new Object[4];
      }

      return new gea(var1);
   }

   static final void a(int var0, int var1, int var2, Object[] var3, int var4, int var5, int var6) {
      ++a;

      int var7;
      for(var7 = var6; var1 + var6 > var7; ++var7) {
         for(int var8 = var0; ~var8 > ~(var0 + var4); ++var8) {
            if(var8 >= 0 && ~var8 > ~((int[])((int[])var3[1]))[0] && var7 >= 0 && ~var7 > ~((int[])((int[])var3[1]))[2]) {
               ((int[][][])((int[][][])var3[4]))[var2][var8][var7] = 0 >= var2?0:((int[][][])((int[][][])var3[4]))[-1 + var2][var8][var7] - 960;
            }
         }

         if(null != var3 && (var3.length == 1 || var3.length == 4)) {
            rg.a((ta)null, (Object[])null, true, (aa)null, (aa)null);
         }
      }

      if(0 < var0 && ((int[])((int[])var3[1]))[0] > var0) {
         for(var7 = var6 + 1; ~var7 > ~(var1 + var6); ++var7) {
            if(0 <= var7 && var7 < ((int[])((int[])var3[1]))[2]) {
               ((int[][][])((int[][][])var3[4]))[var2][var0][var7] = ((int[][][])((int[][][])var3[4]))[var2][var0 - 1][var7];
            }
         }
      }

      if(var5 > ~var6 && ((int[])((int[])var3[1]))[2] > var6) {
         if(var3 != null && (var3.length == 1 && var3[0].equals(Boolean.valueOf(false)) || var3.length == 1 && var3[0].equals(Boolean.valueOf(false)) && var3[0].equals(Boolean.valueOf(false)))) {
            kma.f = null;
         }

         for(var7 = var0 + 1; var4 + var0 > var7; ++var7) {
            if(0 <= var7 && var7 < ((int[])((int[])var3[1]))[0]) {
               ((int[][][])((int[][][])var3[4]))[var2][var7][var6] = ((int[][][])((int[][][])var3[4]))[var2][var7][-1 + var6];
            }
         }
      }

      if(var0 >= 0 && 0 <= var6 && ((int[])((int[])var3[1]))[0] > var0 && var6 < ((int[])((int[])var3[1]))[2]) {
         if(0 == var2) {
            if(0 < var0 && ((int[][][])((int[][][])var3[4]))[var2][-1 + var0][var6] != 0) {
               ((int[][][])((int[][][])var3[4]))[var2][var0][var6] = ((int[][][])((int[][][])var3[4]))[var2][var0 - 1][var6];
            } else if(var6 > 0 && -1 != ~((int[][][])((int[][][])var3[4]))[var2][var0][var6 - 1]) {
               ((int[][][])((int[][][])var3[4]))[var2][var0][var6] = ((int[][][])((int[][][])var3[4]))[var2][var0][var6 - 1];
            } else if(var0 > 0 && var6 > 0 && -1 != ~((int[][][])((int[][][])var3[4]))[var2][var0 - 1][var6 - 1]) {
               ((int[][][])((int[][][])var3[4]))[var2][var0][var6] = ((int[][][])((int[][][])var3[4]))[var2][var0 - 1][var6 - 1];
            }
         } else if(0 < var0 && ((int[][][])((int[][][])var3[4]))[var2 - 1][-1 + var0][var6] != ((int[][][])((int[][][])var3[4]))[var2][var0 - 1][var6]) {
            ((int[][][])((int[][][])var3[4]))[var2][var0][var6] = ((int[][][])((int[][][])var3[4]))[var2][var0 - 1][var6];
         } else if(var6 > 0 && ((int[][][])((int[][][])var3[4]))[var2][var0][var6 - 1] != ((int[][][])((int[][][])var3[4]))[-1 + var2][var0][-1 + var6]) {
            ((int[][][])((int[][][])var3[4]))[var2][var0][var6] = ((int[][][])((int[][][])var3[4]))[var2][var0][-1 + var6];
         } else if(0 < var0 && var6 > 0 && ((int[][][])((int[][][])var3[4]))[var2 - 1][var0 - 1][-1 + var6] != ((int[][][])((int[][][])var3[4]))[var2][-1 + var0][-1 + var6]) {
            ((int[][][])((int[][][])var3[4]))[var2][var0][var6] = ((int[][][])((int[][][])var3[4]))[var2][var0 - 1][-1 + var6];
         }
      }

      if(null != var3 && var3.length == 2 && var3[0].equals(Integer.valueOf(0))) {
         vk.a = true;
      }

   }

   static final void a(Object[] var0, int var1) {
      ++f;
      synchronized(var0[3]) {
         dq.a(-113, (Object[])((Object[])var0[3]));
      }

      synchronized(var0[4]) {
         if(var1 < 87) {
            return;
         }

         dq.a(39, (Object[])((Object[])var0[4]));
      }

      synchronized(var0[5]) {
         cr.a((Object[])((Object[])var0[5]), (int)1);
      }
   }

}
