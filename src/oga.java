
final class oga extends lm {

   static int r;
   static int n;
   static int p;
   Object[] k;
   static int o;
   static int j;
   static float[] q = new float[4];
   static Object[] f_l = ed.a(-2, new Object[1], (byte)-105, 128);
   static int m;


   static final void a(int var0, Object[] var1, int var2, byte[] var3, int var4) {
      ++n;
      if(var2 != 2) {
         q = (float[])null;
      }

      for(int var5 = var4 + (var0 - 1); var0 <= var5; --var5) {
         byte[] var10002 = (byte[])((byte[])var1[2]);
         int[] var10003 = (int[])((int[])var1[1]);
         int var10006 = ((int[])((int[])var1[1]))[0];
         var10003[0] = ((int[])((int[])var1[1]))[0] + 1;
         var3[var5] = var10002[var10006];
      }

   }

   static final Object[] a(ta var0, int var1, Object[] var2) {
      ++m;
      ka var3 = qn.a(2048, var0, (Object[])((Object[])var2[14]), (byte)-55, true, false);
      if(null == var3) {
         return null;
      } else {
         Object[] var4 = bra.a(var2, true);
         Object[] var5 = bva.a(-123, ((boolean[])((boolean[])var2[8]))[5]);
         tma.a((Object[])((Object[])var2[14]), 12, ((short[])((short[])var2[13]))[0], true, ((short[])((short[])var2[13]))[2], var4, var3, ((short[])((short[])var2[13]))[1], var0, ((short[])((short[])var2[13]))[3]);
         var3.a(var4, ((lpa[])((lpa[])var2[9]))[0], 0);
         Object[] var6;
         if(null != ((Object[])((Object[])var2[14]))[10]) {
            var6 = ((ch)((Object[])((Object[])var2[14]))[10]).b();
            var0.c(var6);
         }

         ((boolean[])((boolean[])var2[8]))[6] = var3.XA() || ((Object[])((Object[])var2[14]))[10] != null;
         if(var1 != 315) {
            return (Object[])((Object[])f_l[1]);
         } else {
            var6 = woa.a(var1 - 310, var2);
            if(var2[15] == null) {
               var2[15] = lv.a((int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[1], (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[0], (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[2], var1 - 315, var3);
            } else {
               rr.a(var3, (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[2], (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[1], 2, (Object[])((Object[])var2[15]), (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[0]);
            }

            return var5;
         }
      }
   }

   oga(Object[] var1) {
      this.k = var1;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      ++r;
      if(var4 >= 1 && 1 <= var0 && -2 + rp.c >= var4 && ~var0 >= ~(wpa.a - 2)) {
         int var9 = var5;
         if(var5 < 3 && fr.a(var0, var4, (byte)51)) {
            var9 = var5 + 1;
         }

         if(0 == qga.b((Object[])((Object[])tu.d[14]), 13687) && !tsa.a(wia.d, var0, true, var4, var9)) {
            return;
         }

         if(null == ju.g) {
            return;
         }

         Object[] var10 = je.f;
         ta var11 = lna.g;
         Object[] var12 = hj.f_i[var5];
         Object[] var13 = bpa.a(var10, (byte)-75, var4, var0, var8, var5);
         if(var13 != null) {
            Object[] var14 = mca.a(true, uaa.a(var13, 114), lja.d);
            int var15 = wua.a(var13, 10405);
            int var16 = vm.a((byte)20, var13);
            if(av.a(0, var14)) {
               pe.a((byte)-119, var14, var0, var5, var4);
            }

            if(kqa.a(var13, -11671)) {
               kua.a(var13, var11, (byte)117);
            }

            if(var8 != 0) {
               if(var8 == 1) {
                  im.a(var5, var4, var0);
                  ct.a(var5, var4, var0);
               } else if(2 == var8) {
                  tq.a(var5, var4, var0, ke.f);
                  if(((int[])((int[])var14[1]))[2] != 0 && ~(var4 + ((int[])((int[])var14[1]))[28]) > ~((int[])((int[])var10[1]))[0] && ~(((int[])((int[])var14[1]))[28] + var0) > ~((int[])((int[])var10[1]))[2] && ~((int[])((int[])var10[1]))[0] < ~(((int[])((int[])var14[1]))[10] + var4) && ((int[])((int[])var10[1]))[2] > ((int[])((int[])var14[1]))[10] + var0) {
                     int var19 = ((int[])((int[])var14[1]))[28];
                     int var20 = ((int[])((int[])var14[1]))[10];
                     boolean var21 = ((boolean[])((boolean[])var14[0]))[7];
                     boolean var22 = !((boolean[])((boolean[])var14[0]))[2];
                     int var23 = 256;
                     if(var21) {
                        var23 |= 131072;
                     }

                     if(var10 != null && -7 == ~var10.length) {
                        msa.e = 57L;
                     }

                     int var24;
                     if(1 == var16 || 3 == var16) {
                        var24 = var19;
                        var19 = var20;
                        var20 = var24;
                     }

                     if(var22) {
                        var23 |= 1073741824;
                     }

                     int var18 = var0 - ((int[])((int[])var12[1]))[0];
                     int var17 = var4 - ((int[])((int[])var12[1]))[2];

                     for(var24 = var17; var24 < var19 + var17; ++var24) {
                        if(var24 >= 0 && var24 < ((int[])((int[])var12[1]))[1]) {
                           for(int var25 = var18; var20 + var18 > var25; ++var25) {
                              if(0 <= var25 && ((int[])((int[])var12[1]))[3] > var25) {
                                 vt.a(32, var24, var12, var25, var23);
                              }
                           }
                        }
                     }
                  }

                  if(9 == var15) {
                     if(0 != (var16 & 1)) {
                        wra.a(16, var4, (byte)-50, var0, var5);
                     } else {
                        wra.a(8, var4, (byte)-74, var0, var5);
                     }
                  }
               } else if(3 == var8) {
                  gm.a(var5, var4, var0);
                  if(1 == ((int[])((int[])var14[1]))[2]) {
                     ql.a(var4, 1, var12, var0);
                  }
               }
            } else {
               we.a(var5, var4, var0);
               sr.a(var5, var4, var0);
               if(((int[])((int[])var14[1]))[2] != 0) {
                  tj.a(var12, !((boolean[])((boolean[])var14[0]))[2], var4, var0, 21727, var16, var15, ((boolean[])((boolean[])var14[0]))[7]);
               }

               if(-2 == ~((int[])((int[])var14[1]))[21]) {
                  if(0 == var16) {
                     wra.a(1, var4, (byte)-91, var0, var5);
                  } else if(var16 == 1) {
                     wra.a(2, var4, (byte)-119, 1 + var0, var5);
                  } else if(2 == var16) {
                     wra.a(1, var4 + 1, (byte)-109, var0, var5);
                  } else if(3 == var16) {
                     wra.a(2, var4, (byte)-68, var0, var5);
                  }
               }
            }
         }

         if(var6 >= 0) {
            int var26 = fsa.a((Object[])((Object[])tu.d[36]), 16711680);
            ih.a(tu.d, (Object[])((Object[])tu.d[36]), 1, -87);
            nl.a(hj.f_i[var5], -22648, lna.g, var2, var6, var0, var9, je.f, var7, var5, var4, var1);
            ih.a(tu.d, (Object[])((Object[])tu.d[36]), var26, -56);
         }
      }

      if(var3 <= 51) {
         q = (float[])null;
      }

   }

   static final int a(Object[] var0, boolean var1) {
      ++p;
      return !var1?((int[])((int[])var0[4]))[0]:-cba.a(26951, var0);
   }

   static final int a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var1 &= 3;
      if(var6 < 13) {
         f_l = (Object[])((Object[])f_l[5]);
      }

      ++j;
      if(-2 == ~(var0 & 1)) {
         int var7 = var5;
         var5 = var4;
         var4 = var7;
      }

      return var1 != 0?(1 != var1?(2 == var1?7 - var2 + -var5 + 1:-var3 + 7 + -var4 + 1):var3):var2;
   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      if(var0 != 36) {
         f_l = (Object[])null;
      }

      if(null != var1[17] && moa.a((byte)75, (Object[])((Object[])var1[17]))) {
         Object[] var4 = (Object[])((Object[])var1[0]);
         int var3 = ((int[])((int[])var4[1]))[7];
         if(var3 == 0) {
            int var5 = qr.a(true, (Object[])((Object[])var1[17]));
            if(-1 != ~(128 & ((int[])((int[])var1[7]))[var5]) && null != var1[20]) {
               kaa.a(var2, (Object[])((Object[])var1[17]), var0 ^ 87, (Object[])((Object[])var1[20]));
               ((int[])((int[])var1[7]))[var5] &= -129;
            }
         }
      }

      ++o;
   }

}
