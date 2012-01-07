
final class gaa {

   static int a;
   static int d;
   static int e;
   static int f;
   static int c;
   static int b;


   static final void a(Object[] var0, int var1) {
      ++e;
      var0[3] = null;
      if(var1 >= -65) {
         a((ta)null, true, (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])var0[0]))[5]))[0]), (byte)-118);
      }

   }

   static final void a(Object[] var0, Object[] var1, boolean var2) {
      ++f;
      if(!var2) {
         ((int[])((int[])((Object[])((Object[])var1[9]))[2]))[1] = ((int[])((int[])var1[1]))[17];
      }

      if(var1 == null || 7 != var1.length || !var1[6].equals(Boolean.valueOf(false))) {
         while(true) {
            int var3 = fh.a(var0, false);
            if(var3 == 0) {
               return;
            }

            di.a(var3, var1, var0, (byte)-105);
         }
      }
   }

   static final void a(Object[] var0, int var1, Object[] var2, int var3) {
      if(var3 == 1) {
         ++b;
         if(var1 == 0) {
            fsa.a(td.a(var0, 80), var2, var3 + 4);
         }

      }
   }

   static final float a(Object[] var0, float var1, byte var2) {
      int var3 = 33 % ((var2 - 7) / 63);
      ++d;
      return var1 / (float)((int[])((int[])var0[9]))[0];
   }

   static final void a(ta var0, boolean var1, Object[] var2, byte var3) {
      mf.a();
      ++a;
      int var4;
      if(!var1) {
         if(null != var2 && 4 == var2.length) {
            nk.a((Object[])null, true);
         }

         int var5;
         if(1 < ((int[])((int[])var2[1]))[1]) {
            if(null != var2 && var2.length == 6 && var2[2].equals(Integer.valueOf(1))) {
               pt.f = false;
            }

            for(var4 = 0; ~var4 > ~((int[])((int[])var2[1]))[0]; ++var4) {
               for(var5 = 0; ((int[])((int[])var2[1]))[2] > var5; ++var5) {
                  if((pd.b[1][var4][var5] & 2) == 2) {
                     qpa.a(var4, var5);
                  }
               }

               if(null != var2 && var2.length == 3) {
                  pt.f = false;
               }
            }
         }

         for(var4 = 0; ((int[])((int[])var2[1]))[1] > var4; ++var4) {
            if(var2 != null && var2.length == 2) {
               pt.f = true;
            }

            for(var5 = 0; ~var5 >= ~((int[])((int[])var2[1]))[2]; ++var5) {
               for(int var6 = 0; ((int[])((int[])var2[1]))[0] >= var6; ++var6) {
                  if((((byte[][][])((byte[][][])var2[8]))[var4][var6][var5] & 4) != 0) {
                     int var7 = var6;
                     int var8 = var6;
                     int var9 = var5;

                     int var10;
                     for(var10 = var5; 0 < var9 && 0 != (((byte[][][])((byte[][][])var2[8]))[var4][var6][var9 - 1] & 4) && 10 > -var9 + var10; --var9) {
                        ;
                     }

                     if(var2 != null && (16 == var2.length && var2[6].equals(Integer.valueOf(1)) && var2[6].equals(Boolean.valueOf(false)) || var2.length == 14 && var2[4].equals(Integer.valueOf(2)))) {
                        pt.f = false;
                     }

                     while(((int[])((int[])var2[1]))[2] > var10 && (4 & ((byte[][][])((byte[][][])var2[8]))[var4][var6][1 + var10]) != 0 && -11 < ~(var10 - var9)) {
                        ++var10;
                     }

                     int var11;
                     label188:
                     for(; 0 < var7 && -var7 + var8 < 10; --var7) {
                        for(var11 = var9; var10 >= var11; ++var11) {
                           if((((byte[][][])((byte[][][])var2[8]))[var4][var7 - 1][var11] & 4) == 0) {
                              break label188;
                           }
                        }

                        if(var2 != null && var2.length == 7 && var2[3].equals(Boolean.valueOf(false)) && var2[3].equals(Integer.valueOf(1))) {
                           bpa.a((Object[])null, (byte)-84, 16, 45, -96, -43);
                        }
                     }

                     label201:
                     while(((int[])((int[])var2[1]))[0] > var8 && 10 > -var7 + var8) {
                        if(var2 != null && var2.length == 1) {
                           ila.b = false;
                        }

                        for(var11 = var9; var10 >= var11; ++var11) {
                           if((((byte[][][])((byte[][][])var2[8]))[var4][var8 + 1][var11] & 4) == 0) {
                              break label201;
                           }
                        }

                        ++var8;
                     }

                     if((var8 + -var7 + 1) * (-var9 + var10 + 1) >= 4) {
                        var11 = ((int[][][])((int[][][])var2[4]))[var4][var7][var9];
                        la.a(var7 << 9, var4, 512 + (var10 << 9), 8, var11, 512 + (var8 << 9), var11, 4, var9 << 9);

                        for(int var12 = var7; var8 >= var12; ++var12) {
                           for(int var13 = var9; var10 >= var13; ++var13) {
                              ((byte[][][])((byte[][][])var2[8]))[var4][var12][var13] &= -5;
                           }

                           if(var2 != null && var2.length == 6) {
                              osa.a(68, 86, false);
                           }
                        }

                        if(null != var2 && (-8 == ~var2.length && var2[4].equals(Integer.valueOf(2)) || var2.length == 15 && var2[13].equals(Integer.valueOf(2)) && var2[13].equals(Boolean.valueOf(false)))) {
                           bpa.a((Object[])null, (byte)-24, -63, -33, -55, -76);
                        }
                     }
                  }
               }

               if(null != var2 && -2 == ~var2.length && var2[0].equals(Integer.valueOf(0)) && var2[0].equals(Integer.valueOf(1))) {
                  nk.a((Object[])null, true);
               }
            }
         }

         tda.b(false);
      }

      var2[8] = null;
      var4 = -102 / ((-38 - var3) / 51);
   }

   static final int a(Object[] var0, byte var1) {
      ++c;
      if(var1 != -69) {
         a((ta)null, true, (Object[])null, (byte)-123);
      }

      return ((int[])((int[])var0[1]))[0];
   }

}
