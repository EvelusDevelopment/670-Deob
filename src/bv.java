
final class bv {

   static int[] b;
   static int c;
   static int a;
   static int d;


   static final int a(int var0, int var1, int var2, int var3) {
      if(var1 != 5) {
         b = (int[])null;
      }

      ++d;
      return (pd.b[var3][var2][var0] & 8) == 0?(var3 > 0 && (pd.b[1][var2][var0] & 2) != 0?var3 - 1:var3):0;
   }

   static final int[] a(Object[] var0, int var1, byte var2) {
      ++c;
      int[] var3 = od.a(-1704, var1, (Object[])((Object[])var0[5]));
      if(var2 != 75) {
         return (int[])((int[])var0[21]);
      } else {
         if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
            int var4 = b[var1];
            if(var0 != null && (-6 == ~var0.length && var0[3].equals(Integer.valueOf(0)) || var0.length == 3)) {
               a((Object[])null, -27, (byte)75);
            }

            int var5 = var4 - 2048 >> 1;

            for(int var6 = 0; fo.b > var6; ++var6) {
               int var8 = wra.d[var6];
               int var9 = -2048 + var8 >> 1;
               int var7;
               if(((int[])((int[])var0[1]))[1] != 0) {
                  int var10 = var9 * var9 + var5 * var5 >> 12;
                  var7 = (int)(Math.sqrt((double)((float)var10 / 4096.0F)) * 4096.0D);
                  var7 = (int)((double)(((int[])((int[])var0[1]))[3] * var7) * 3.141592653589793D);
               } else {
                  var7 = (-var4 + var8) * ((int[])((int[])var0[1]))[3];
               }

               var7 -= -4096 & var7;
               if(((int[])((int[])var0[1]))[2] == 0) {
                  var7 = ad.c[255 & var7 >> 4] + 4096 >> 1;
               } else if(-3 == ~((int[])((int[])var0[1]))[2]) {
                  var7 -= 2048;
                  if(0 > var7) {
                     var7 = -var7;
                  }

                  var7 = -var7 + 2048 << 1;
               }

               var3[var6] = var7;
            }
         }

         return var3;
      }
   }

   static final void a(Object[] var0, byte var1) throws oqa {
      ++a;
      if(var1 < -10) {
         var0[29] = new Object[3][5][];
         var0[30] = ab.a(new Object[2], (byte)-81);
      }
   }

}
