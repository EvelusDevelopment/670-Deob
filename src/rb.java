import java.awt.Canvas;

final class rb {

   static int b;
   static int e;
   static int[][] d;
   static Object[][] a;
   static int c;
   static int g;
   static int f;


   static final Object[] a(Object[] var0, byte var1, long var2, Canvas var4, Object[] var5) {
      if(var1 != 37) {
         a(-22, (Object[])((Object[])var0[2]));
      }

      if(var0[1] == null) {
         var0[1] = new int[2];
      }

      if(var0[5] == null) {
         var0[5] = new boolean[1];
      }

      if(var0[6] == null) {
         var0[6] = new long[1];
      }

      ++c;
      aua.b(var0, -86);
      var0[4] = aha.a((int)-23716, var0);
      var0[0] = var4;
      ((long[])((long[])var0[6]))[0] = var2;
      var0[3] = var5[27];
      var0[2] = var5;
      no.b(false, var0);
      return var0;
   }

   static final Object[] a(byte var0, Object[] var1, Object[] var2) {
      ++b;
      aa.a(15022, var2, var1);
      if(var0 <= 76) {
         a(((byte[])((byte[])((Object[])((Object[])var2[0]))[1]))[1], (Object[])null, (Object[])null);
      }

      return var1;
   }

   static final void a(int var0, Object[] var1) {
      if(var1[var0] == null) {
         var1[1] = new int[1];
      }

      ++g;
   }

   static final int[] a(boolean var0, int var1, Object[] var2) {
      ++f;
      int[] var3 = od.a(-1704, var1, (Object[])((Object[])var2[5]));
      if(var0) {
         return (int[])null;
      } else {
         if(((boolean[])((boolean[])((Object[])((Object[])var2[5]))[4]))[0]) {
            if(var2 != null && var2.length == 18 && var2[4].equals(Integer.valueOf(0)) && var2[4].equals(Integer.valueOf(1))) {
               return null;
            }

            for(int var4 = 0; var4 < fo.b; ++var4) {
               int var5 = wra.d[var4];
               int var6 = bv.b[var1];
               int var7 = var5 * ((int[])((int[])var2[1]))[1] >> 12;
               int var8 = ((int[])((int[])var2[1]))[3] * var6 >> 12;
               int var9 = ((int[])((int[])var2[1]))[1] * (var5 % (4096 / ((int[])((int[])var2[1]))[1]));
               int var10 = ((int[])((int[])var2[1]))[3] * (var6 % (4096 / ((int[])((int[])var2[1]))[3]));
               if(((int[])((int[])var2[1]))[2] > var10) {
                  var7 -= var8;
                  if(null != var2 && (-18 == ~var2.length && var2[3].equals(Integer.valueOf(0)) || -5 == ~var2.length)) {
                     return null;
                  }

                  while(0 > var7) {
                     var7 += 4;
                  }

                  while(3 < var7) {
                     var7 -= 4;
                  }

                  if(var7 != 1) {
                     var3[var4] = 0;
                     continue;
                  }

                  if(((int[])((int[])var2[1]))[2] > var9) {
                     var3[var4] = 0;
                     continue;
                  }
               }

               if(((int[])((int[])var2[1]))[2] > var9) {
                  for(var7 -= var8; var7 < 0; var7 += 4) {
                     ;
                  }

                  if(var2 != null && 4 == var2.length) {
                     joa.a((Object[])null, (byte)-4);
                  }

                  while(3 < var7) {
                     var7 -= 4;
                  }

                  if(0 < var7) {
                     var3[var4] = 0;
                     continue;
                  }
               }

               var3[var4] = 4096;
            }
         }

         return var3;
      }
   }

}
