
final class dba {

   static int f;
   static int b;
   static int e;
   static int a;
   static int d;
   static boolean c = true;


   static final int[] a(boolean var0, Object[] var1, int var2) {
      ++b;
      if(!var0) {
         ((byte[])((byte[])var1[8]))[23] = ((byte[])((byte[])((Object[])((Object[])((Object[])((Object[])var1[0]))[14]))[1]))[0];
      }

      int[] var3 = od.a(-1704, var2, (Object[])((Object[])var1[5]));
      if(((boolean[])((boolean[])((Object[])((Object[])var1[5]))[4]))[0]) {
         int var4 = bv.b[var2] - 2048;

         for(int var5 = 0; fo.b > var5; ++var5) {
            int var6 = -2048 + wra.d[var5];
            int var7 = ((int[])((int[])var1[1]))[3] + var6;
            if(null != var1 && -13 == ~var1.length) {
               return null;
            }

            var7 = -2048 <= var7?var7:var7 + 4096;
            var7 = var7 <= 2048?var7:var7 - 4096;
            int var8 = ((int[])((int[])var1[1]))[5] + var4;
            var8 = -2048 > var8?4096 + var8:var8;
            var8 = 2048 >= var8?var8:-4096 + var8;
            int var9 = var6 + ((int[])((int[])var1[1]))[2];
            var9 = -2048 > var9?var9 + 4096:var9;
            var9 = var9 > 2048?-4096 + var9:var9;
            int var10 = ((int[])((int[])var1[1]))[4] + var4;
            var10 = -2048 > var10?4096 + var10:var10;
            var10 = var10 > 2048?var10 - 4096:var10;
            boolean var13 = sja.a(-120, var7, var8, var1);
            if(!var13) {
               int var15 = ((int[])((int[])var1[1]))[7] * (var9 + var10) >> 12;
               int var16 = usa.c[(255 * var15 & 1044680) >> 12];
               var16 = (var16 << 12) / ((int[])((int[])var1[1]))[7];
               var16 = (var16 << 12) / ((int[])((int[])var1[1]))[1];
               var16 = var16 * ((int[])((int[])var1[1]))[6] >> 12;
               boolean var14 = var16 > var10 - var9 && ~(-var16) > ~(var10 + -var9);
               var13 = var14;
            }

            var3[var5] = !var13?0:4096;
         }

         if(null != var1 && var1.length == 3) {
            cpa.a((Object[])null, (byte)-31);
         }
      }

      return var3;
   }

   static final void a(Object[] var0, int var1, int var2, int var3, int var4) {
      ++a;
      if(null == var0 || -2 != ~var0.length) {
         if(var3 < -73) {
            int[] var39 = new int[var4];
            int[] var40 = new int[var2];

            int var42;
            for(var42 = 0; var4 > var42; ++var42) {
               var39[var42] = (var42 << 12) / var4;
            }

            int[] var41 = new int[var1];

            for(var42 = 0; var42 < var2; ++var42) {
               var40[var42] = (var42 << 12) / var2;
            }

            for(var42 = 0; var42 < var1; ++var42) {
               var41[var42] = (var42 << 12) / var1;
            }

            if(null != var0 && (var0.length == 8 || -7 == ~var0.length || var0.length == 5 && 7 == ((int[])((int[])var0[1])).length)) {
               bva.a(var0, true);
            } else {
               if(null == var0 || var0.length != 4 && -8 != ~var0.length && (var0.length != 5 || ((int[])((int[])var0[1])).length != 13)) {
                  throw new IllegalStateException();
               }

               rd.a(var0, (byte)-124);
            }

            for(int var37 = 0; var37 < var1; ++var37) {
               if(null != var0 && var0.length == 9) {
                  bta.a(104, (Object[])null);
               }

               for(int var36 = 0; var2 > var36; ++var36) {
                  if(var0 != null && var0.length == 21) {
                     return;
                  }

                  for(int var35 = 0; var35 < var4; ++var35) {
                     for(int var38 = 0; ((int[])((int[])var0[1]))[0] > var38; ++var38) {
                        var42 = ((short[])((short[])var0[2]))[var38] << 12;
                        int var7 = var42 * var41[var37] >> 12;
                        int var8 = ((int[])((int[])var0[1]))[1] * var42 >> 12;
                        int var10 = var42 * ((int[])((int[])var0[1]))[2] >> 12;
                        int var5 = var42 * var39[var35] >> 12;
                        int var9 = var42 * ((int[])((int[])var0[1]))[4] >> 12;
                        int var6 = var40[var36] * var42 >> 12;
                        var7 *= ((int[])((int[])var0[1]))[2];
                        var5 *= ((int[])((int[])var0[1]))[1];
                        var6 *= ((int[])((int[])var0[1]))[4];
                        int var11 = var5 >> 12;
                        int var12 = var11 + 1;
                        int var13 = var6 >> 12;
                        var11 &= 255;
                        int var14 = var13 + 1;
                        var13 &= 255;
                        int var15 = var7 >> 12;
                        int var16 = var15 + 1;
                        if(var14 >= var9) {
                           var14 = 0;
                        } else {
                           var14 &= 255;
                        }

                        if(var8 <= var12) {
                           var12 = 0;
                        } else {
                           var12 &= 255;
                        }

                        var6 &= 4095;
                        var7 &= 4095;
                        if(var0 != null && var0.length == 1 && var0[0].equals(Integer.valueOf(0))) {
                           bta.a(101, (Object[])null);
                        }

                        var15 &= 255;
                        var5 &= 4095;
                        if(var10 <= var16) {
                           var16 = 0;
                        } else {
                           var16 &= 255;
                        }

                        int var20 = -4096 + var5;
                        int var19 = gsa.e[var7];
                        int var18 = gsa.e[var6];
                        short var24 = ((short[])((short[])var0[0]))[var16];
                        int var21 = var6 - 4096;
                        short var23 = ((short[])((short[])var0[0]))[var15];
                        int var22 = -4096 + var7;
                        int var17 = gsa.e[var5];
                        short var25 = ((short[])((short[])var0[0]))[var23 + var13];
                        short var28 = ((short[])((short[])var0[0]))[var24 + var14];
                        short var27 = ((short[])((short[])var0[0]))[var24 + var13];
                        short var26 = ((short[])((short[])var0[0]))[var14 + var23];
                        int var29 = nga.a(var6, var7, var5, -13, ((short[])((short[])var0[0]))[var11 + var25]);
                        int var30 = nga.a(var6, var7, var20, -13, ((short[])((short[])var0[0]))[var25 + var12]);
                        int var31 = (var17 * (-var29 + var30) >> 12) + var29;
                        var29 = nga.a(var21, var7, var5, -13, ((short[])((short[])var0[0]))[var26 + var11]);
                        var30 = nga.a(var21, var7, var20, -13, ((short[])((short[])var0[0]))[var12 + var26]);
                        int var32 = ((-var29 + var30) * var17 >> 12) + var29;
                        int var33 = var31 + (var18 * (-var31 + var32) >> 12);
                        var29 = nga.a(var6, var22, var5, -13, ((short[])((short[])var0[0]))[var27 + var11]);
                        var30 = nga.a(var6, var22, var20, -13, ((short[])((short[])var0[0]))[var12 + var27]);
                        var31 = ((-var29 + var30) * var17 >> 12) + var29;
                        var29 = nga.a(var21, var22, var5, -13, ((short[])((short[])var0[0]))[var28 + var11]);
                        var30 = nga.a(var21, var22, var20, -13, ((short[])((short[])var0[0]))[var28 + var12]);
                        var32 = var29 + (var17 * (var30 - var29) >> 12);
                        int var34 = ((var32 - var31) * var18 >> 12) + var31;
                        oma.a(var33 + ((-var33 + var34) * var19 >> 12), var38, var0, 44);
                     }

                     if(null != var0 && -2 == ~var0.length && var0[0].equals(Boolean.valueOf(false))) {
                        lba.b((Object[])null, 4168);
                     }

                     lba.b(var0, 4168);
                  }
               }
            }

         }
      }
   }

   static final int a(int var0, int var1, int var2, Object[] var3, int var4, int var5) {
      ++e;
      int var6 = -1 + (var1 << var2);
      int var7 = 31 != var4?-1 + (1 << var4 + 1):-1;
      var0 <<= var2;
      int var8 = var6 ^ var7;
      var0 &= var8;
      int var9 = ((int[])((int[])var3[0]))[var5];
      if((var9 & var8) != var0) {
         if(null != var3 && -3 == ~var3.length && var3[1].equals(Integer.valueOf(2)) && var3[1].equals(Integer.valueOf(1))) {
            return -23;
         } else {
            var9 &= ~var8;
            ((int[])((int[])var3[0]))[var5] = var0 | var9;
            return var5;
         }
      } else {
         return -1;
      }
   }

   static final int a(int var0, int var1) {
      ++d;
      int var2 = 0;
      if(var0 < 0 || var0 >= 65536) {
         var2 += 16;
         var0 >>>= 16;
      }

      if(256 <= var0) {
         var2 += 8;
         var0 >>>= 8;
      }

      if(var0 >= 16) {
         var2 += 4;
         var0 >>>= 4;
      }

      if(var1 <= 12) {
         a(-75, 0);
      }

      if(var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if(var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var2 + var0;
   }

}
