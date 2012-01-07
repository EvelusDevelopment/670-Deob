
final class hw {

   static int c;
   static boolean[][] d = new boolean[][]{{true, true, true, true, true, true, true, true, true, true, true, true, true}, {true, true, true, false, false, false, true, true, false, false, false, false, true}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, true, false, false, false, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {false, true, true, true, true, true, true, true, false, false, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, true, true, false, false, false, false, false, false, false, true, true, false}, {false, false, false, false, false, false, false, false, false, false, false, false, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, {false, false, false, false, false, false, false, false, false, false, false, false, false}};
   static int a;
   static int b;
   static Object[] e;


   static final Object[] a(int var0, Object[] var1, int var2) {
      if(var1[0] == null) {
         var1[0] = new int[6];
      }

      ++c;
      ((int[])((int[])var1[0]))[3] = var0;
      if(var2 != 3124) {
         a(((int[])((int[])var1[22]))[2], (Object[])((Object[])e[4]), -27);
      }

      ((int[])((int[])var1[0]))[0] = 128;
      ((int[])((int[])var1[0]))[2] = 128;
      return var1;
   }

   static final void a(int var0, int[][] var1, Object[] var2) {
      ++b;
      int var3 = fo.b;
      if(var0 > -96) {
         a((Object[])null, -127);
      }

      int var4 = cka.d;
      uba.a(var1, (int)3);
      int var5 = td.q;
      int var6 = wq.e;
      td.r = var5;
      sda.c = var6;
      hla.g = 0;
      sea.k = 0;
      if(var2[22] != null) {
         if(null != var2 && -4 == ~var2.length) {
            poa.b((Object[])null, 12976);
         }

         for(int var7 = 0; ((Object[])((Object[])var2[22])).length > var7; ++var7) {
            Object[] var8 = ((Object[][])((Object[][])var2[22]))[var7];
            int var9 = ((int[])((int[])var8[0]))[2];
            int var10 = ((int[])((int[])var8[0]))[0];
            int var11;
            int var12;
            int var13;
            int var14;
            int var15;
            int var17;
            int var16;
            int var18;
            if(0 <= var9) {
               if(var10 < 0) {
                  if(null == var8 || var8.length != 2) {
                     if(null != var8 && var8.length == 3) {
                        pma.a(var3, 7478, var4, var8);
                     } else if(null != var8 && -5 == ~var8.length) {
                        je.a(var3, var4, var8, 110);
                     } else {
                        if(null == var8 || var8.length != 1) {
                           throw new IllegalStateException();
                        }

                        var11 = ((int[])((int[])var8[0]))[4] * var3 >> 12;
                        var12 = var3 * ((int[])((int[])var8[0]))[5] >> 12;
                        var13 = ((int[])((int[])var8[0]))[3] * var4 >> 12;
                        var14 = ((int[])((int[])var8[0]))[6] * var4 >> 12;
                        var15 = ((int[])((int[])var8[0]))[2];
                        if(var11 >= hla.g && td.r >= var12 && var13 >= sea.k && sda.c >= var14) {
                           sha.a(var13, var12, var11, var15, 4, var14);
                        } else {
                           var16 = eua.a(sda.c, (byte)-53, var13, sea.k);
                           var17 = eua.a(sda.c, (byte)-53, var14, sea.k);
                           var18 = eua.a(td.r, (byte)-53, var11, hla.g);
                           int var19 = eua.a(td.r, (byte)-53, var12, hla.g);

                           for(int var20 = var16; var17 >= var20; ++var20) {
                              fka.a(var15, fda.c[var20], var19, var18, (byte)115);
                           }
                        }
                     }
                  }
               } else {
                  kca.a(var4, var8, '\u8515', var3);
               }
            } else if(var10 >= 0) {
               if(var8 != null && -3 == ~var8.length) {
                  var11 = ((int[])((int[])var8[0]))[9] * var3 >> 12;
                  var12 = var4 * ((int[])((int[])var8[0]))[8] >> 12;
                  var13 = var3 * ((int[])((int[])var8[0]))[3] >> 12;
                  var14 = var4 * ((int[])((int[])var8[0]))[10] >> 12;
                  var15 = ((int[])((int[])var8[0]))[7] * var3 >> 12;
                  var16 = var4 * ((int[])((int[])var8[0]))[5] >> 12;
                  var17 = var3 * ((int[])((int[])var8[0]))[4] >> 12;
                  var18 = var4 * ((int[])((int[])var8[0]))[6] >> 12;
                  uu.a(var18, var14, var16, var17, var12, var13, var15, ((int[])((int[])var8[0]))[0], var11, -1);
               } else if(null != var8 && 3 == var8.length) {
                  tka.a(var8, var4, var3, -16553);
               } else if(var8 != null && var8.length == 4) {
                  eia.a(var3, var8, var4, 0);
               } else {
                  if(null == var8 || -2 != ~var8.length) {
                     throw new IllegalStateException();
                  }

                  var11 = ((int[])((int[])var8[0]))[4] * var3 >> 12;
                  var12 = ((int[])((int[])var8[0]))[5] * var3 >> 12;
                  var13 = ((int[])((int[])var8[0]))[3] * var4 >> 12;
                  var14 = var4 * ((int[])((int[])var8[0]))[6] >> 12;
                  nia.a(((int[])((int[])var8[0]))[1], ((int[])((int[])var8[0]))[0], var12, (byte)-98, var11, var13, var14);
               }
            }
         }
      }

   }

   static final void a(Object[] var0, int var1) {
      ++a;
      if(var1 != -16774) {
         a(76, (int[][])((int[][])var0[1]), (Object[])null);
      }

      if(((int[])((int[])var0[1]))[1] > 0) {
         qs.a((Object[])((Object[])var0[4]), qka.a(-23864, var0), 24, ((int[])((int[])var0[1]))[1]);
         ((int[])((int[])var0[1]))[1] = 0;
      }

   }

   static {
      Object[] var1 = new Object[0];
      e = var1;
   }
}
