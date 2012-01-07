
final class ri extends lm {

   static int k = 0;
   Object[] o;
   static int q;
   static Object[] j;
   static Object[] m = ed.a(3, new Object[1], (byte)-120, 6);
   static Object[] p = ed.a(10, new Object[1], (byte)-100, 142);
   static Object[][] f_l;
   static int n;


   static final Object[] a(int var0, ta var1, Object[] var2) {
      ++q;
      if(null != var2 && var2.length == 16 && 3 == ((int[])((int[])var2[12])).length) {
         return oga.a(var1, 315, var2);
      } else {
         Object[] var3;
         Object[] var5;
         Object[] var6;
         int var9;
         Object[] var10;
         ka var31;
         Object[] var32;
         int var33;
         if(null != var2 && -21 == ~var2.length && 2 == ((byte[])((byte[])var2[10])).length && var2[14].equals(Integer.valueOf(0))) {
            var31 = qn.a(2048, var1, (Object[])((Object[])var2[17]), (byte)-55, true, false);
            if(var31 == null) {
               var3 = null;
            } else {
               var5 = var1.k();
               lg.a(var5, bra.a(var2, true), -18072);
               cq.a((byte)81, (float)((short[])((short[])var2[13]))[0], 0.0F, (float)((short[])((short[])var2[13]))[1], var5);
               var6 = woa.a(5, var2);
               var32 = bva.a(82, ((boolean[])((boolean[])var2[8]))[4]);
               var33 = (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[2] >> 9;
               var9 = (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[1] >> 9;
               tma.a((Object[])((Object[])var2[17]), 12, var33, true, var9, var5, var31, var33, var1, var9);
               var31.a(var5, ((lpa[])((lpa[])var2[9]))[0], 0);
               if(null != ((Object[])((Object[])var2[17]))[10]) {
                  var10 = ((ch)((Object[])((Object[])var2[17]))[10]).b();
                  var1.c(var10);
               }

               ((boolean[])((boolean[])var2[8]))[5] = var31.XA() || ((Object[])((Object[])var2[17]))[10] != null;
               var3 = var32;
               if(null == var2[18]) {
                  var2[18] = lv.a((int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[1], (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[0], (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[2], 0, var31);
               } else {
                  rr.a(var31, (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[2], (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[1], 2, (Object[])((Object[])var2[18]), (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[0]);
               }

               if(var2 != null && -5 == ~var2.length && var2[2].equals(Integer.valueOf(1))) {
                  Class_ds.a((byte)-114, new Object[1][], (ta)null);
               }
            }

            return var3;
         } else if(var0 != 12) {
            return new Object[6];
         } else if(null != var2 && -21 == ~var2.length && -4 == ~((byte[])((byte[])var2[10])).length) {
            return pg.a((byte)29, var2, var1);
         } else {
            Object[] var4;
            int var7;
            Object[] var8;
            int var15;
            int var16;
            Object[] var34;
            int var35;
            if(null != var2 && -17 == ~var2.length && ((byte[])((byte[])var2[10])).length == 2) {
               var4 = mha.a((byte)123, new Object[2], (Object[])((Object[])woa.a(5, var2)[1]));
               var5 = wh.a(((byte[])((byte[])var2[10]))[0], (int)((float[])((float[])var4[1]))[2] >> qqa.e, (int)((float[])((float[])var4[1]))[1] >> qqa.e);
               var6 = cba.a(((byte[])((byte[])var2[10]))[0], (int)((float[])((float[])var4[1]))[2] >> qqa.e, (int)((float[])((float[])var4[1]))[1] >> qqa.e);
               var7 = 0;
               if(var5 != null && ((boolean[])((boolean[])((Object[])((Object[])var5[1]))[8]))[4]) {
                  var7 = dca.a(true, (Object[])((Object[])var5[1]));
               }

               if(null != var6 && ((short[])((short[])var6[14]))[0] > -var7) {
                  var7 = -((short[])((short[])var6[14]))[0];
               }

               if(((int[])((int[])var2[12]))[8] != var7) {
                  ((float[])((float[])var4[1]))[0] += (float)(-((int[])((int[])var2[12]))[8] + var7);
                  sra.a(var2, var4, var0 - 11);
                  ((int[])((int[])var2[12]))[8] = var7;
               }

               var8 = var1.k();
               kia.a(var8, 16863);
               if(0 == ((int[])((int[])var2[12]))[8]) {
                  boolean var37 = false;
                  boolean var41 = false;
                  boolean var38 = false;
                  aa var43 = jp.o[((byte[])((byte[])var2[10]))[1]];
                  int var46 = ((int[])((int[])var2[12]))[3] << 1;
                  var15 = -var46 / 2;
                  var16 = -var46 / 2;
                  int var48 = var43.a(1, (int)((float[])((float[])var4[1]))[2] + var15, var16 + (int)((float[])((float[])var4[1]))[1]);
                  int var18 = var46 / 2;
                  int var19 = -var46 / 2;
                  int var20 = var43.a(var0 - 11, var18 + (int)((float[])((float[])var4[1]))[2], (int)((float[])((float[])var4[1]))[1] + var19);
                  int var21 = -var46 / 2;
                  int var22 = var46 / 2;
                  int var23 = var43.a(1, (int)((float[])((float[])var4[1]))[2] + var21, var22 + (int)((float[])((float[])var4[1]))[1]);
                  int var24 = var46 / 2;
                  int var25 = var46 / 2;
                  int var26 = var43.a(1, var24 + (int)((float[])((float[])var4[1]))[2], (int)((float[])((float[])var4[1]))[1] + var25);
                  int var27 = var20 > var48?var48:var20;
                  int var28 = var26 <= var23?var26:var23;
                  int var29 = var20 < var26?var20:var26;
                  int var30 = var48 >= var23?var23:var48;
                  if(0 != var46) {
                     var9 = 16383 & (int)(Math.atan2((double)(var27 + -var28), (double)var46) * 2607.5945876176133D);
                     if(var9 != 0) {
                        ha.a(0.0F, 0.0F, var8, 24515, mw.a(var9, (byte)46), 1.0F);
                     }
                  }

                  if(0 != var46) {
                     var35 = (int)(2607.5945876176133D * Math.atan2((double)(var30 - var29), (double)var46)) & 16383;
                     if(0 != var35) {
                        ha.a(1.0F, 0.0F, var8, var0 + 24503, mw.a(-var35, (byte)67), 0.0F);
                     }
                  }

                  int var39 = var48 + var26;
                  if(~var39 < ~(var20 + var23)) {
                     var39 = var23 + var20;
                  }

                  var39 = -((int)((float[])((float[])var4[1]))[0]) + (var39 >> 1);
                  if(0 != var39) {
                     cq.a((byte)81, 0.0F, (float)var39, 0.0F, var8);
                  }
               }

               var34 = (Object[])((Object[])woa.a(var0 ^ 9, var2)[1]);
               cq.a((byte)81, ((float[])((float[])var34[1]))[2], ((float[])((float[])var34[1]))[0] - 10.0F, ((float[])((float[])var34[1]))[1], var8);
               var10 = bva.a(94, true);
               ((int[])((int[])var2[12]))[3] = 0;
               ((boolean[])((boolean[])var2[8]))[4] = false;
               ka var42;
               if(-1 != ((int[])((int[])var2[12]))[9]) {
                  var42 = woa.a((Object[])null, ((int[])((int[])var2[12]))[5], us.a(((int[])((int[])var2[12]))[9], (byte)117, cqa.a), (Object[])null, var1, false, 2048);
                  if(var42 != null) {
                     var42.a(var8, ((lpa[])((lpa[])var2[9]))[2], 0);
                     ((boolean[])((boolean[])var2[8]))[4] |= var42.XA();
                     ((int[])((int[])var2[12]))[3] = var42.ra();
                  }
               }

               if(0 != ~((int[])((int[])var2[12]))[6]) {
                  var42 = woa.a((Object[])null, ((int[])((int[])var2[12]))[7], us.a(((int[])((int[])var2[12]))[6], (byte)81, cqa.a), (Object[])null, var1, false, 2048);
                  if(var42 != null) {
                     var42.a(var8, ((lpa[])((lpa[])var2[9]))[1], 0);
                     ((boolean[])((boolean[])var2[8]))[4] |= var42.XA();
                     if(~var42.ra() < ~((int[])((int[])var2[12]))[3]) {
                        ((int[])((int[])var2[12]))[3] = var42.ra();
                     }
                  }
               }

               var42 = woa.a((Object[])null, ((int[])((int[])var2[12]))[4], us.a(((int[])((int[])var2[12]))[10], (byte)21, cqa.a), (Object[])null, var1, false, 2048);
               if(null != var42) {
                  var42.a(var8, ((lpa[])((lpa[])var2[9]))[0], 0);
                  ((boolean[])((boolean[])var2[8]))[4] |= var42.XA();
                  if(var42.ra() > ((int[])((int[])var2[12]))[3]) {
                     ((int[])((int[])var2[12]))[3] = var42.ra();
                  }
               }

               if(null != var5 && (var5.length == 16 || 1 == var5.length || 6 == var5.length)) {
                  kca.a((Object[])null, var0 + 27369);
               }

               return var10;
            } else if(null != var2 && 22 == var2.length) {
               return aia.a(var1, (byte)67, var2);
            } else if(null != var2 && 3 == var2.length && var2[0].equals(Integer.valueOf(2)) && var2[0].equals(Integer.valueOf(2))) {
               return null;
            } else if(var2 != null && 43 == var2.length && 8 == ((byte[])((byte[])var2[10])).length) {
               return cj.a(var2, var0 + 6814, var1);
            } else if(var2 != null && var2.length == 18) {
               return oda.a(false, var2, var1);
            } else if(var2 != null && 23 == var2.length) {
               if(var2[18] == null) {
                  var3 = null;
               } else {
                  var4 = bra.a(var2, true);
                  var5 = bva.a(var0 + 76, ((boolean[])((boolean[])var2[8]))[4]);
                  var3 = var5;
                  ((ka)var2[18]).a(var4, ((lpa[])((lpa[])var2[9]))[0], 0);
               }

               return var3;
            } else if(null != var2 && -18 == ~var2.length) {
               return kqa.a(var1, var2, (byte)92);
            } else if(null != var2 && var2.length == 24) {
               return th.a((byte)14, var1, var2);
            } else if(null != var2 && 20 == var2.length && 4 == ((int[])((int[])var2[12])).length) {
               return fk.a(var2, 91, var1);
            } else if(null != var2 && -21 == ~var2.length && 7 == ((boolean[])((boolean[])var2[8])).length) {
               var31 = qn.a(2048, var1, (Object[])((Object[])var2[19]), (byte)-55, true, false);
               if(var2 != null && -4 == ~var2.length) {
                  return null;
               } else {
                  if(var31 == null) {
                     var3 = null;
                  } else {
                     var5 = bra.a(var2, true);
                     var6 = woa.a(5, var2);
                     var32 = bva.a(-121, ((boolean[])((boolean[])var2[8]))[5]);
                     var33 = (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[2] >> 9;
                     var9 = (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[1] >> 9;
                     tma.a((Object[])((Object[])var2[19]), 12, var33, true, var9, var5, var31, var33, var1, var9);
                     var31.a(var5, ((lpa[])((lpa[])var2[9]))[0], 0);
                     if(null != ((Object[])((Object[])var2[19]))[10]) {
                        var10 = ((ch)((Object[])((Object[])var2[19]))[10]).b();
                        var1.c(var10);
                     }

                     ((boolean[])((boolean[])var2[8]))[4] = var31.XA() || null != ((Object[])((Object[])var2[19]))[10];
                     if(null != var2[18]) {
                        rr.a(var31, (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[2], (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[1], 2, (Object[])((Object[])var2[18]), (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[0]);
                     } else {
                        var2[18] = lv.a((int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[1], (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[0], (int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[2], 0, var31);
                     }

                     var3 = var32;
                  }

                  return var3;
               }
            } else if(var2 != null && var2.length == 43 && -10 == ~((byte[])((byte[])var2[10])).length) {
               if(null != var2[42] && kf.a(-81, 2048, var1, var2)) {
                  var4 = var1.k();
                  var5 = bra.a(var2, true);
                  var6 = woa.a(5, var2);
                  var7 = bca.a((Object[])((Object[])var2[35]), false);
                  var8 = ju.g[((byte[])((byte[])var2[10]))[0]][(int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[2] >> qqa.e][(int)((float[])((float[])((Object[])((Object[])var6[1]))[1]))[1] >> qqa.e];
                  if(null != var8 && var8[6] != null) {
                     var9 = ((int[])((int[])var2[12]))[22] + -((short[])((short[])((Object[])((Object[])var8[6]))[14]))[0];
                     ((int[])((int[])var2[12]))[22] = (int)((float)((int[])((int[])var2[12]))[22] - (float)var9 / 10.0F);
                  } else {
                     ((int[])((int[])var2[12]))[22] = (int)((float)((int[])((int[])var2[12]))[22] - (float)((int[])((int[])var2[12]))[22] / 10.0F);
                  }

                  lg.a(var4, var5, -18072);
                  cq.a((byte)81, 0.0F, (float)(-((int[])((int[])var2[12]))[22] - 20), 0.0F, var4);
                  var34 = null;
                  ((boolean[])((boolean[])var2[8]))[6] = false;
                  Object[] var11;
                  Object[] var12;
                  if(1 == lc.a((Object[])((Object[])tu.d[10]), 0)) {
                     var10 = ro.a((int)3, var2);
                     if(((boolean[])((boolean[])var10[7]))[0] && (((int[])((int[])((Object[])((Object[])var2[42]))[1]))[1] == -1 || ((boolean[])((boolean[])jra.a((byte)77, ((int[])((int[])((Object[])((Object[])var2[42]))[1]))[1], nt.f_i)[8]))[1])) {
                        var11 = (Object[])(wna.a((Object[])((Object[])var2[25]), 4) && tt.a((Object[])((Object[])var2[25]), 0)?var2[25]:null);
                        var12 = (Object[])(wna.a((Object[])((Object[])var2[30]), var0 - 8) && (!((boolean[])((boolean[])var2[8]))[7] || null == var11)?var2[30]:null);
                        ka var13 = jn.a(var7, ((int[])((int[])var2[12]))[25], ((int[])((int[])var2[12]))[37], ((ka[])((ka[])var2[29]))[0], null == var12?var11:var12, var1, (byte)97, 160, 1, ((int[])((int[])var2[12]))[11], 0, 240, 0);
                        if(null != var13) {
                           if(var2[9] == null || 1 + ((Object[])((Object[])var2[29])).length != ((Object[])((Object[])var2[9])).length) {
                              toa.a(1 + ((Object[])((Object[])var2[29])).length, var2, 5029);
                           }

                           var34 = bva.a(118, true);
                           ((boolean[])((boolean[])var2[8]))[6] = true;
                           var1.c(false);
                           var13.a(var4, ((lpa[])((lpa[])var2[9]))[((Object[])((Object[])var2[29])).length], 0);
                           var1.c(true);
                        }
                     }
                  }

                  if(var2 == uta.g) {
                     for(var35 = gqa.b.length - 1; 0 <= var35; --var35) {
                        var11 = gqa.b[var35];
                        if(null != var11 && ~((int[])((int[])var11[0]))[0] != 0) {
                           Object[] var44;
                           if(((int[])((int[])var11[0]))[9] == 1) {
                              hna var36 = (hna)pm.a((long)((int[])((int[])var11[0]))[5], hf.g, false);
                              if(null != var36) {
                                 var44 = var36.k;
                                 Object[] var14 = qka.a((Object[])((Object[])woa.a(5, uta.g)[1]), -1, (Object[])((Object[])woa.a(var0 - 7, var44)[1]));
                                 var15 = (int)((float[])((float[])var14[1]))[2];
                                 var16 = (int)((float[])((float[])var14[1]))[1];
                                 aa.a((long)var15, ((int[])((int[])var11[0]))[0], 20951, var1, var4, 92160000L, (long)var16, ((ka[])((ka[])var2[29]))[0], var2);
                              }
                           }

                           if(-3 == ~((int[])((int[])var11[0]))[9]) {
                              var12 = (Object[])((Object[])woa.a(5, uta.g)[1]);
                              long var40 = (long)(-((int)((float[])((float[])var12[1]))[2]) + ((int[])((int[])var11[0]))[8]);
                              long var45 = (long)(-((int)((float[])((float[])var12[1]))[1]) + ((int[])((int[])var11[0]))[2]);
                              long var17 = (long)(((int[])((int[])var11[0]))[6] << 9);
                              var17 *= var17;
                              aa.a(var40, ((int[])((int[])var11[0]))[0], 20951, var1, var4, var17, var45, ((ka[])((ka[])var2[29]))[0], var2);
                           }

                           if(((int[])((int[])var11[0]))[9] == 10 && ((int[])((int[])var11[0]))[5] >= 0 && vo.E.length > ((int[])((int[])var11[0]))[5]) {
                              var12 = vo.E[((int[])((int[])var11[0]))[5]];
                              if(var12 != null) {
                                 var44 = qka.a((Object[])((Object[])woa.a(5, uta.g)[1]), var0 + 108, (Object[])((Object[])woa.a(5, var12)[1]));
                                 int var47 = (int)((float[])((float[])var44[1]))[2];
                                 var15 = (int)((float[])((float[])var44[1]))[1];
                                 aa.a((long)var47, ((int[])((int[])var11[0]))[0], 20951, var1, var4, 92160000L, (long)var15, ((ka[])((ka[])var2[29]))[0], var2);
                              }
                           }
                        }
                     }

                     if(null != var34 && var34.length == 7 && var34[3].equals(Integer.valueOf(2)) && var34[3].equals(Boolean.valueOf(false))) {
                        return null;
                     }
                  }

                  lg.a(var4, var5, -18072);
                  cq.a((byte)81, 0.0F, (float)(-5 - ((int[])((int[])var2[12]))[22]), 0.0F, var4);
                  if(var2[9] == null || ~((Object[])((Object[])var2[29])).length != ~((Object[])((Object[])var2[9])).length) {
                     toa.a(((Object[])((Object[])var2[29])).length, var2, 5029);
                  }

                  if(null == var34) {
                     var34 = bva.a(var0 + 50, true);
                  }

                  aa.a(var1, var4, var2, false, (ka[])((ka[])var2[29]), false);

                  for(var35 = 0; ~var35 > ~((Object[])((Object[])var2[29])).length; ++var35) {
                     if(null != ((ka[])((ka[])var2[29]))[var35]) {
                        ((ka[])((ka[])var2[29]))[var35].a(var4, ((lpa[])((lpa[])var2[9]))[var35], uta.g != var2?0:1);
                     }
                  }

                  if(var2[16] != null) {
                     var10 = ((ch)var2[16]).b();
                     var1.c(var10);
                  }

                  for(var35 = 0; ((Object[])((Object[])var2[29])).length > var35; ++var35) {
                     if(null != ((ka[])((ka[])var2[29]))[var35]) {
                        ((boolean[])((boolean[])var2[8]))[6] |= ((ka[])((ka[])var2[29]))[var35].XA();
                     }

                     ((ka[])((ka[])var2[29]))[var35] = null;
                  }

                  ((int[])((int[])var2[12]))[34] = OutputStreamWorker.c;
                  if(var2 != null && -4 == ~var2.length) {
                     return null;
                  }

                  var3 = var34;
               } else {
                  var3 = null;
               }

               return var3;
            } else {
               throw new IllegalStateException();
            }
         }
      }
   }

   ri(Object[] var1) {
      this.o = var1;
   }

}
