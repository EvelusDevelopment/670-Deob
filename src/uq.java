import jaclib.memory.Stream;

final class uq extends nj {

   Object[] f_l;
   static boolean[][] k;
   static int f_i;
   static int m;
   static int j;
   static int o;
   static Object[] n = ed.a(-1, new Object[1], (byte)-124, 108);


   uq(Object[] var1) {
      this.f_l = var1;
   }

   static final cga a(ta var0, int var1, int var2, boolean var3, int var4, int var5, ta var6, boolean var7, Object[] var8, ja var9, Object[] var10, int var11, int var12) {
      ++o;
      cga var13 = dla.a(5, var10, var6, var12, var5, var11, var2, var4, var8);
      if(var13 != null) {
         return var13;
      } else {
         Object[] var14 = us.a(var2, (byte)72, var10);
         if(var5 > var1 && var14[9] != null) {
            if(var10 != null && 13 == var10.length && var10[2].equals(Integer.valueOf(1))) {
               return null;
            }

            int var15 = -1;

            for(int var16 = 0; 10 > var16; ++var16) {
               if(~var5 <= ~((int[])((int[])var14[2]))[var16] && -1 != ~((int[])((int[])var14[2]))[var16]) {
                  var15 = ((int[])((int[])var14[9]))[var16];
               }
            }

            if(-1 != var15) {
               var14 = us.a(var15, (byte)35, var10);
            }
         }

         int[] var21 = mk.a(var5, var11, var14, -10502, var9, var0, var8, var4, var6, var12, var3);
         if(null != var21) {
            cga var20;
            if(var7) {
               var20 = var0.a(36, -7343, 0, var21, 32, 36);
            } else {
               var20 = var6.a(36, -7343, 0, var21, 32, 36);
            }

            if(!var7) {
               Object[] var17 = wha.a(new Object[2], (byte)-119);
               if(null != var10 && (4 == var10.length && var10[1].equals(Integer.valueOf(1)) || var10.length == 2 && var10[1].equals(Integer.valueOf(1)) && var10[1].equals(Integer.valueOf(2)))) {
                  bd.a(new Object[4][], 119);
               }

               ((int[])((int[])var17[1]))[5] = var11;
               ((int[])((int[])var17[1]))[4] = var4;
               ((int[])((int[])var17[1]))[1] = var5;
               ((int[])((int[])var17[1]))[0] = var2;
               ((boolean[])((boolean[])var17[0]))[0] = null != var8;
               ((int[])((int[])var17[1]))[3] = var6.G;
               ((int[])((int[])var17[1]))[2] = var12;
               Object[] var18 = (Object[])((Object[])var10[5]);
               ira.a(1, var20, var17, var18, (byte)91);
            }

            return var20;
         } else {
            return null;
         }
      }
   }

   static final Object[] a(int var0, int var1, Object[] var2, boolean var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, Object[] var11, int var12, int var13, int var14, ta var15, int var16) {
      ++f_i;
      hh.a(var11, -71);
      boolean var26 = -2 == ~((int[])((int[])var2[1]))[var5];
      byte var38;
      if(9 != var12) {
         var38 = 0;
      } else if((var16 & 1) == 0) {
         var38 = 1;
      } else {
         var38 = 2;
      }

      wda.a(var10, var8, var14, var4, 10, var11, var9, var38, var6, var1, var13, var0, var26);
      nqa.a(var11, (byte)41);
      var11[14] = pga.a(var12, var3, var2, ((byte[])((byte[])var11[10]))[0], new Object[11], var16, var7, var5 - 134, var10, var15, var11);
      ((boolean[])((boolean[])var11[8]))[5] = ((int[])((int[])var2[1]))[11] != 0 && !var3;
      toa.a(1, var11, var5 + 5022);
      return var11;
   }

   static final void putFloatLE(int var0, float var1, Object[] var2) {
      ++m;
      int var3 = Stream.floatToRawIntBits(var1);
      byte[] var10000 = (byte[])((byte[])var2[2]);
      int[] var10001 = (int[])((int[])var2[1]);
      int var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)var3;
      var10000 = (byte[])((byte[])var2[2]);
      var10001 = (int[])((int[])var2[var0]);
      var10004 = ((int[])((int[])var2[var0]))[0];
      var10001[0] = ((int[])((int[])var2[var0]))[0] + 1;
      var10000[var10004] = (byte)(var3 >> 8);
      var10000 = (byte[])((byte[])var2[2]);
      var10001 = (int[])((int[])var2[1]);
      var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)(var3 >> 16);
      var10000 = (byte[])((byte[])var2[2]);
      var10001 = (int[])((int[])var2[1]);
      var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)(var3 >> 24);
   }

   static final int a(Object[] var0, int var1, int var2, int var3) {
      ++j;
      int var4 = -33 % ((-51 - var2) / 33);
      return 0;
   }

}
