import java.util.Random;

final class rh {

   static int f;
   static int h;
   static int d;
   static int c;
   static int g;
   static int a;
   static int b;
   static int e;


   static final void a(int var0, int var1, int var2, Object[] var3, Class_s var4, int var5, int var6, cga var7) {
      ++f;
      if(var7 != null) {
         if(var3 != null && var3.length == 13 && var3[7].equals(Integer.valueOf(1)) && var3[7].equals(Integer.valueOf(2))) {
            msa.a((Object[])null, -79, ((int[])((int[])ja.w[4]))[2], (byte)-32, -5, (ta)((Object[])((Object[])ja.w[0]))[6]);
         }

         int var8;
         if(ha.e != 1) {
            var8 = 16383 & coa.v + (int)sma.h;
         } else {
            var8 = 16383 & (int)sma.h;
         }

         int var9 = Math.max(((int[])((int[])var3[1]))[70] / 2, ((int[])((int[])var3[1]))[2] / 2) + 10;
         int var10 = var6 * var6 + var5 * var5;
         if(var10 <= var9 * var9) {
            if(var2 != 8) {
               a((Object[])null, ((byte[])((byte[])var3[1]))[10]);
            }

            int var11 = tda.p[var8];
            int var12 = tda.k[var8];
            if(1 != ha.e) {
               var12 = 256 * var12 / (kma.b + 256);
               var11 = 256 * var11 / (kma.b + 256);
            }

            int var13 = var5 * var12 + var11 * var6 >> 14;
            int var14 = -(var11 * var5) + var12 * var6 >> 14;
            var7.a(((int[])((int[])var3[1]))[70] / 2 + var1 + (var13 - var7.f() / 2), var0 + ((int[])((int[])var3[1]))[2] / 2 - (var14 + var7.d() / 2), var4, var1, var0);
         }
      }
   }

   static final tha a(int var0, Object[] var1) {
      ++a;
      tha var2 = ((tha)((Object[])((Object[])var1[1]))[0]).s;
      if(var2 == ((Object[])((Object[])var1[1]))[0]) {
         var1[0] = null;
         return null;
      } else {
         var1[0] = var2.s;
         return var0 != -26995?(tha)null:var2;
      }
   }

   static final Object[] a(Object var0, int var1, Object[] var2, Object[] var3, byte var4) {
      en.a(114, var3);
      var3[2] = epa.b(19153, var3);
      ((int[])((int[])var3[1]))[0] = var1;
      var3[0] = var2;
      ++e;
      var3[3] = var0;
      return var4 != 87?(Object[])null:var3;
   }

   static final int a(Object[] var0, byte var1) {
      ++b;
      if(var0 != null && 8 == var0.length) {
         return bsa.b(121, var0);
      } else if(var0 != null && var0.length == 9) {
         return fw.a(1, var0);
      } else {
         int var2 = ((int[])((int[])var0[1]))[1];
         if(var1 <= 3) {
            a((Object[])((Object[])var0[1]), (byte)38);
         }

         return var2;
      }
   }

   static final Object[] a(boolean var0, Object[] var1) {
      ++h;
      return var0?(Object[])null:var1;
   }

   static final void a(byte var0, Object[] var1) {
      ++d;
      if(var0 == 22) {
         Random var2 = new Random((long)((int[])((int[])var1[1]))[8]);
         ((int[])((int[])var1[1]))[2] = ((int[])((int[])var1[1]))[11] / 2;
         ((int[])((int[])var1[1]))[10] = 4096 / ((int[])((int[])var1[1]))[8];
         ((int[])((int[])var1[1]))[6] = 4096 / ((int[])((int[])var1[1]))[7];
         int var3 = ((int[])((int[])var1[1]))[6] / 2;
         var1[7] = new int[((int[])((int[])var1[1]))[8]][((int[])((int[])var1[1]))[7] + 1];
         int var4 = ((int[])((int[])var1[1]))[10] / 2;
         var1[8] = new int[((int[])((int[])var1[1]))[8] + 1];
         var1[9] = new int[((int[])((int[])var1[1]))[8]][((int[])((int[])var1[1]))[7]];
         ((int[])((int[])var1[8]))[0] = 0;

         for(int var5 = 0; ((int[])((int[])var1[1]))[8] > var5; ++var5) {
            int var6;
            int var7;
            if(0 < var5) {
               var6 = ((int[])((int[])var1[1]))[10];
               var7 = (cl.a(81, var2, (int)4096) - 2048) * ((int[])((int[])var1[1]))[3] >> 12;
               var6 += var7 * var4 >> 12;
               ((int[])((int[])var1[8]))[var5] = ((int[])((int[])var1[8]))[-1 + var5] + var6;
            }

            ((int[][])((int[][])var1[7]))[var5][0] = 0;
            if(var1 != null && 18 == var1.length) {
               lp.a(true, (Object[])null);
            }

            for(var6 = 0; var6 < ((int[])((int[])var1[1]))[7]; ++var6) {
               if(0 < var6) {
                  var7 = ((int[])((int[])var1[1]))[6];
                  int var8 = (cl.a(41, var2, (int)4096) - 2048) * ((int[])((int[])var1[1]))[5] >> 12;
                  var7 += var3 * var8 >> 12;
                  ((int[][])((int[][])var1[7]))[var5][var6] = ((int[][])((int[][])var1[7]))[var5][-1 + var6] + var7;
               }

               ((int[][])((int[][])var1[9]))[var5][var6] = 0 >= ((int[])((int[])var1[1]))[9]?4096:4096 - cl.a(54, var2, ((int[])((int[])var1[1]))[9]);
            }

            ((int[][])((int[][])var1[7]))[var5][((int[])((int[])var1[1]))[7]] = 4096;
         }

         ((int[])((int[])var1[8]))[((int[])((int[])var1[1]))[8]] = 4096;
         if(var1 == null || -4 != ~var1.length) {
            ;
         }
      }
   }

   static final void a(Object[] var0, int var1) {
      ++c;
      synchronized(var0[5]) {
         if(var1 != 2344) {
            ((boolean[])((boolean[])var0[2]))[1] = true;
         }

         cr.a((Object[])((Object[])var0[5]), (int)1);
      }
   }

   static final void a(int var0, int var1, Object[] var2) {
      ++g;
      byte[] var10000 = (byte[])((byte[])var2[2]);
      int[] var10001 = (int[])((int[])var2[1]);
      int var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)(0 + -var1);
      int var3 = 86 % ((78 - var0) / 40);
   }

}
