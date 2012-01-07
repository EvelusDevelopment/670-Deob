
final class mta {

   static int[] f = new int[8];
   static Object[] c = sd.a(new Object[1], 92, (byte)124);
   static int e;
   static int a;
   static int[] b;
   static int d;


   static final int[][] b(int var0, int var1, Object[] var2) {
      ++d;
      int[][] var3 = loa.a((byte)-52, var0, (Object[])((Object[])var2[4]));
      if(((boolean[])((boolean[])((Object[])((Object[])var2[4]))[0]))[0]) {
         int var4 = 1 + ((int[])((int[])var2[1]))[1] + ((int[])((int[])var2[1]))[1];
         int var5 = 65536 / var4;
         int var6 = ((int[])((int[])var2[1]))[2] + ((int[])((int[])var2[1]))[2] + 1;
         int var7 = 65536 / var6;
         int[][][] var8 = new int[var4][][];

         int var12;
         int var13;
         int var14;
         for(int var9 = -((int[])((int[])var2[1]))[1] + var0; ((int[])((int[])var2[1]))[1] + var0 >= var9; ++var9) {
            int[][] var10 = bsa.a(0, (byte)17, var9 & wq.e, var2);
            int[][] var11 = new int[3][fo.b];
            var12 = 0;
            var13 = 0;
            var14 = 0;
            int[] var15 = var10[0];
            if(null != var2 && -19 == ~var2.length && var2[3].equals(Integer.valueOf(1))) {
               return (int[][])null;
            }

            int[] var16 = var10[1];
            int[] var17 = var10[2];

            for(int var18 = -((int[])((int[])var2[1]))[2]; ~var18 >= ~((int[])((int[])var2[1]))[2]; ++var18) {
               int var19 = var18 & td.q;
               var12 += var15[var19];
               var13 += var16[var19];
               var14 += var17[var19];
            }

            int[] var30 = var11[0];
            int[] var29 = var11[1];
            int[] var20 = var11[2];

            int var22;
            for(int var21 = 0; var21 < fo.b; var12 += var15[var22]) {
               var30[var21] = var12 * var7 >> 16;
               var29[var21] = var13 * var7 >> 16;
               var20[var21] = var7 * var14 >> 16;
               var22 = td.q & var21 + -((int[])((int[])var2[1]))[2];
               var12 -= var15[var22];
               if(var2 != null && -2 == ~var2.length) {
                  return (int[][])null;
               }

               ++var21;
               var13 -= var16[var22];
               var14 -= var17[var22];
               var22 = var21 + ((int[])((int[])var2[1]))[2] & td.q;
               var14 += var17[var22];
               var13 += var16[var22];
            }

            var8[var9 + ((int[])((int[])var2[1]))[1] + -var0] = var11;
         }

         int[] var23 = var3[0];
         int[] var25 = var3[1];
         int[] var24 = var3[2];
         if(var2 != null && var2.length == 9 && var2[4].equals(Integer.valueOf(0))) {
            ff.a(new Object[8][], (byte)-71);
         }

         for(var12 = 0; fo.b > var12; ++var12) {
            var13 = 0;
            var14 = 0;
            int var26 = 0;

            for(int var27 = 0; var27 < var4; ++var27) {
               int[][] var28 = var8[var27];
               var26 += var28[2][var12];
               var14 += var28[1][var12];
               var13 += var28[0][var12];
            }

            var23[var12] = var13 * var5 >> 16;
            var25[var12] = var5 * var14 >> 16;
            var24[var12] = var5 * var26 >> 16;
         }
      }

      if(var1 != 26611) {
         a(((int[])((int[])c[6]))[0], ((int[])((int[])c[2]))[5], (Object[])((Object[])var2[2]));
      }

      return var3;
   }

   static final void a(int var0, Object[] var1) {
      ++e;
      if(null == var1[var0]) {
         var1[1] = new int[7];
      }

   }

   static final Object[] a(int var0, int var1, Object[] var2) {
      if(null != var2 && var2.length == 4) {
         a(2, 110, (Object[])null);
      }

      ++a;
      if(var0 != 2) {
         return (Object[])((Object[])c[1]);
      } else {
         Object[] var3;
         synchronized(var2[0]) {
            var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var2[0]), (long)var1));
         }

         if(null != var3) {
            return var3;
         } else {
            Object[] var4 = (Object[])((Object[])var2[1]);
            int var5 = var1 >>> 8;
            byte[] var6 = qn.a(var5, fc.a(var1, 3), var4, var0 - 107);
            var3 = aba.a(new Object[5], (byte)64);
            if(var6 != null) {
               ht.a(var3, false, jta.a((byte)-86, var6, new Object[3]));
            }

            synchronized(var2[0]) {
               il.a((long)var1, var3, true, (Object[])((Object[])var2[0]));
               return var3;
            }
         }
      }
   }

}
