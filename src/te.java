import jaggl.OpenGL;
import java.util.Random;

final class te {

   static int h;
   static int a;
   static int c;
   static int f;
   static int k;
   static int f_i;
   static int b;
   static int d;
   static int g;
   static int[] j = new int[514];
   static int e;


   static final void a(Object[] var0, boolean var1, int var2) {
      ++f_i;
      an.a(((Object[][][])((Object[][][])var0[29]))[1][var2], (Object[])((Object[])var0[25]), !var1);
      rsa.a(-12423, (Object[])((Object[])var0[25]));
      bfa.a((Object[])((Object[])var0[4]), -4678, (Object[])((Object[])var0[25]), (Object[])((Object[])var0[20]));
      if(var1) {
         c = -37;
      }

      bb.a(var0, var2, (int)0);
   }

   static final void a(Object[] var0, boolean var1) {
      if(var1) {
         if(var0[2] == null) {
            var0[2] = new boolean[1];
         }

         ++b;
         if(null == var0[1]) {
            var0[1] = new int[1];
         }

      }
   }

   static final void b(int var0, Object[] var1) {
      ++a;
      if(var1 == null || -9 != ~var1.length) {
         if(null != var1 && -10 == ~var1.length) {
            kha.a(var1, var0 - 130);
         } else {
            if(var0 != 5) {
               ((int[])((int[])var1[0]))[9] = -76;
            }

            throw new IllegalStateException();
         }
      }
   }

   static final void a(int var0, Object[] var1) {
      ++h;
      if(null != var1 && -88 == ~var1.length) {
         eo.a(var1, (byte)-68);
      } else {
         if(var0 != 25385) {
            a((Object[])((Object[])((Object[])((Object[])var1[3]))[21]), 89);
         }

         if(null != var1 && var1.length == 91) {
            OpenGL.glTexEnvi(8960, '\u8572', hj.a((byte)-57, ((Object[][])((Object[][])var1[22]))[((int[])((int[])var1[1]))[7]]));
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(boolean var0, byte var1) {
      ++g;
      if(var0 && eka.M != null) {
         lca.j = ((int[])((int[])eka.M[1]))[2];
      } else {
         lca.j = -1;
      }

      eka.M = null;
      up.c = null;
      ona.d = null;
      dp.q = 0;
      eka.b();
      nb.b(eka.t, 0);
      eka.j = null;
      cta.p = null;
      fba.d = null;
      rd.s = -1;
      dq.f = -1;
      eba.f_l = null;
      int var2 = 12 % ((21 - var1) / 40);
      nga.f_i = null;
      ek.c = null;
      cba.b = null;
      cpa.b = null;
      js.b = null;
      tl.a = null;
      Object[] var3;
      if(null != eka.e) {
         var3 = eka.e;
         synchronized(var3[1]) {
            dq.a(-124, (Object[])((Object[])var3[1]));
         }

         synchronized(var3[3]) {
            dq.a(-95, (Object[])((Object[])var3[3]));
         }

         qia.a((byte)-117, 128, 64, eka.e);
      }

      if(eka.x != null) {
         var3 = eka.x;
         var3[2] = sj.a(64, new Object[3], (byte)-64);
         var3[0] = sj.a(64, new Object[3], (byte)-127);
      }

      if(eka.w != null) {
         var3 = eka.w;
         var3[4] = sj.a(64, new Object[3], (byte)-53);
      }

      jk.a(64, 12, fv.d);
   }

   static final int[] a(Object[] var0, int var1, int var2) {
      ++d;
      if(null != var0 && var0.length == 6 && -9 == ~((int[])((int[])var0[1])).length) {
         return dba.a(true, var0, var2);
      } else if(null != var0 && var0.length == 11 && 7 == ((int[])((int[])var0[1])).length) {
         return jk.a(var2, var0, -24112);
      } else {
         int[] var4;
         int var5;
         int var9;
         int var10;
         int var11;
         int var12;
         int var14;
         int var15;
         int var17;
         int var19;
         int var18;
         int var23;
         int var25;
         int var24;
         int var27;
         int var26;
         int var41;
         int var50;
         if(null != var0 && var0.length == 7) {
            var4 = od.a(-1704, var2, (Object[])((Object[])var0[5]));
            if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
               var5 = ((int[])((int[])var0[1]))[2] >> 1;
               int[][] var46 = bs.a(2, (Object[])((Object[])var0[5]));
               Random var43 = new Random((long)((int[])((int[])var0[1]))[1]);
               if(var0 != null && (var0.length == 1 || -3 == ~var0.length && var0[0].equals(Integer.valueOf(1)) && var0[0].equals(Integer.valueOf(2)))) {
                  return null;
               }

               for(var41 = 0; var41 < ((int[])((int[])var0[1]))[3]; ++var41) {
                  var9 = -1 <= ~((int[])((int[])var0[1]))[2]?((int[])((int[])var0[1]))[4]:((int[])((int[])var0[1]))[4] + (cl.a(118, var43, ((int[])((int[])var0[1]))[2]) - var5);
                  var9 = 255 & var9 >> 4;
                  var10 = cl.a(27, var43, fo.b);
                  var11 = cl.a(90, var43, cka.d);
                  var12 = var10 + (usa.c[var9] * ((int[])((int[])var0[1]))[5] >> 12);
                  var50 = (((int[])((int[])var0[1]))[5] * ad.c[var9] >> 12) + var11;
                  var14 = -var11 + var50;
                  var15 = -var10 + var12;
                  if(0 != var15 || var14 != 0) {
                     if(0 > var14) {
                        var14 = -var14;
                     }

                     if(var15 < 0) {
                        var15 = -var15;
                     }

                     boolean var51 = var15 < var14;
                     if(var51) {
                        var17 = var10;
                        var18 = var12;
                        var10 = var11;
                        var11 = var17;
                        var12 = var50;
                        var50 = var18;
                     }

                     if(var12 < var10) {
                        var17 = var10;
                        var18 = var11;
                        var10 = var12;
                        var12 = var17;
                        var11 = var50;
                        var50 = var18;
                     }

                     var17 = var11;
                     var18 = var12 - var10;
                     var19 = -var11 + var50;
                     int var53 = -var18 / 2;
                     int var55 = 2048 / var18;
                     int var54 = -(cl.a(50, var43, (int)4096) >> 2) + 1024;
                     var23 = var11 < var50?1:-1;
                     if(var19 < 0) {
                        var19 = -var19;
                     }

                     for(var24 = var10; var24 < var12; ++var24) {
                        var25 = (-var10 + var24) * var55 + var54 + 1024;
                        var26 = var24 & td.q;
                        var27 = wq.e & var17;
                        var53 += var19;
                        if(!var51) {
                           var46[var26][var27] = var25;
                        } else {
                           var46[var27][var26] = var25;
                        }

                        if(var53 > 0) {
                           var17 += var23;
                           var53 += -var18;
                        }
                     }
                  }
               }
            }

            return var4;
         } else {
            int var6;
            int var39;
            if(var0 != null && -7 == ~var0.length && 3 == ((int[])((int[])var0[1])).length) {
               var4 = od.a(-1704, var2, (Object[])((Object[])var0[5]));
               if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
                  var5 = ((int[])((int[])var0[1]))[1] + ((int[])((int[])var0[1]))[1] + 1;
                  var6 = 65536 / var5;
                  var39 = 1 + ((int[])((int[])var0[1]))[2] + ((int[])((int[])var0[1]))[2];
                  var41 = 65536 / var39;
                  int[][] var52 = new int[var5][];

                  for(var10 = var2 - ((int[])((int[])var0[1]))[1]; ((int[])((int[])var0[1]))[1] + var2 >= var10; ++var10) {
                     int[] var48 = vea.a(var0, 0, var10 & wq.e, (byte)-8);
                     int[] var49 = new int[fo.b];
                     if(var0 != null && var0.length == 33) {
                        cf.a((byte)-118, new Object[12][]);
                     }

                     var50 = 0;

                     for(var14 = -((int[])((int[])var0[1]))[2]; var14 <= ((int[])((int[])var0[1]))[2]; ++var14) {
                        var50 += var48[var14 & td.q];
                     }

                     for(var14 = 0; fo.b > var14; var50 += var48[var14 + ((int[])((int[])var0[1]))[2] & td.q]) {
                        var49[var14] = var41 * var50 >> 16;
                        var50 -= var48[td.q & var14 - ((int[])((int[])var0[1]))[2]];
                        ++var14;
                     }

                     var52[-var2 + var10 + ((int[])((int[])var0[1]))[1]] = var49;
                  }

                  for(var10 = 0; fo.b > var10; ++var10) {
                     var11 = 0;

                     for(var12 = 0; var5 > var12; ++var12) {
                        var11 += var52[var12][var10];
                     }

                     var4[var10] = var11 * var6 >> 16;
                     if(var0 != null && -2 == ~var0.length && var0[0].equals(Boolean.valueOf(false))) {
                        oha.a(false, (Object[])null);
                     }
                  }
               }

               return var4;
            } else {
               int[] var7;
               int[] var8;
               int[] var42;
               int[][] var45;
               if(null != var0 && 26 == var0.length && 2 == ((int[])((int[])var0[1])).length) {
                  var4 = od.a(-1704, var2, (Object[])((Object[])var0[5]));
                  if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
                     var45 = bsa.a(0, (byte)17, var2, var0);
                     var42 = var45[0];
                     if(var0 != null && -4 == ~var0.length) {
                        return null;
                     }

                     var7 = var45[1];
                     var8 = var45[2];

                     for(var9 = 0; fo.b > var9; ++var9) {
                        var4[var9] = (var8[var9] + var42[var9] + var7[var9]) / 3;
                     }
                  }

                  return var4;
               } else if(null != var0 && var0.length == 18) {
                  return tia.a(var2, var0, 105);
               } else {
                  int[] var40;
                  if(null != var0 && 23 == var0.length) {
                     var4 = od.a(-1704, var2, (Object[])((Object[])var0[5]));
                     if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
                        var40 = vea.a(var0, 0, var2, (byte)-8);
                        if(null != var0 && -2 == ~var0.length) {
                           ja.a(35, -122, (byte)54, (Object[])null);
                        }

                        var42 = vea.a(var0, 1, var2, (byte)-8);
                        var7 = vea.a(var0, 2, var2, (byte)-8);

                        for(var41 = 0; var41 < fo.b; ++var41) {
                           var9 = var7[var41];
                           if(var9 != 4096) {
                              if(0 != var9) {
                                 var4[var41] = var40[var41] * var9 + (-var9 + 4096) * var42[var41] >> 12;
                              } else {
                                 var4[var41] = var42[var41];
                              }
                           } else {
                              var4[var41] = var40[var41];
                           }
                        }
                     }

                     return var4;
                  } else if(var0 != null && -18 == ~var0.length && -3 == ~((int[])((int[])var0[1])).length) {
                     return cp.a(var0, -85, var2);
                  } else if(var0 != null && var0.length == 14) {
                     var4 = od.a(var1 - 1708, var2, (Object[])((Object[])var0[5]));
                     if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
                        var42 = vea.a(var0, 0, var2, (byte)-8);

                        for(var39 = 0; fo.b > var39; ++var39) {
                           var5 = var42[var39] >> 4;
                           if(0 > var5) {
                              var5 = 0;
                           }

                           if(256 < var5) {
                              var5 = 256;
                           }

                           var4[var39] = ((short[])((short[])var0[9]))[var5];
                        }
                     }

                     return var4;
                  } else {
                     int[] var3;
                     int var16;
                     if(var0 != null && 25 == var0.length && -12 == ~((int[])((int[])var0[1])).length) {
                        var4 = od.a(-1704, var2, (Object[])((Object[])var0[5]));
                        if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
                           var45 = bs.a(2, (Object[])((Object[])var0[5]));
                           var6 = 0;
                           var39 = 0;
                           var41 = 0;
                           var9 = 0;
                           var10 = 0;
                           boolean var44 = true;
                           boolean var47 = true;
                           var50 = 0;
                           var14 = 0;
                           var15 = fo.b * ((int[])((int[])var0[1]))[9] >> 12;
                           var16 = ((int[])((int[])var0[1]))[1] * fo.b >> 12;
                           var17 = ((int[])((int[])var0[1]))[6] * cka.d >> 12;
                           var18 = ((int[])((int[])var0[1]))[10] * cka.d >> 12;
                           if(var18 <= 1) {
                              var3 = var45[var2];
                              return var3;
                           }

                           ((int[])((int[])var0[1]))[7] = fo.b / 8 * ((int[])((int[])var0[1]))[8] >> 12;
                           var19 = 1 + fo.b / var15;
                           int[][] var20 = new int[var19][3];
                           int[][] var21 = new int[var19][3];
                           Random var22 = new Random((long)((int[])((int[])var0[1]))[4]);

                           label790:
                           while(true) {
                              while(true) {
                                 var24 = var15 + cl.a(111, var22, -var15 + var16);
                                 var25 = var17 + cl.a(46, var22, var18 - var17);
                                 var26 = var24 + var9;
                                 if(var26 > fo.b) {
                                    var24 = -var9 + fo.b;
                                    var26 = fo.b;
                                 }

                                 int var29;
                                 if(var47) {
                                    var23 = 0;
                                 } else {
                                    var27 = var10;
                                    int[] var28 = var21[var10];
                                    var29 = 0;
                                    if(null != var0 && 2 == var0.length) {
                                       nba.a((byte)96, (Object[])null);
                                    }

                                    int var30 = var6 + var26;
                                    if(0 > var30) {
                                       var30 += fo.b;
                                    }

                                    if(fo.b < var30) {
                                       var30 -= fo.b;
                                    }

                                    var23 = var28[2];

                                    while(true) {
                                       int[] var31 = var21[var27];
                                       if(~var30 <= ~var31[0] && var31[1] >= var30) {
                                          if(var10 != var27) {
                                             int var58 = var9 + var6;
                                             if(var58 < 0) {
                                                var58 += fo.b;
                                             }

                                             if(fo.b < var58) {
                                                var58 -= fo.b;
                                             }

                                             int var32;
                                             int[] var33;
                                             for(var32 = 1; var29 >= var32; ++var32) {
                                                var33 = var21[(var10 + var32) % var50];
                                                var23 = Math.max(var23, var33[2]);
                                             }

                                             for(var32 = 0; var32 <= var29; ++var32) {
                                                var33 = var21[(var10 + var32) % var50];
                                                int var34 = var33[2];
                                                if(var34 != var23) {
                                                   int var37 = var33[0];
                                                   int var38 = var33[1];
                                                   int var35;
                                                   int var36;
                                                   if(var30 <= var58) {
                                                      if(0 != var37) {
                                                         var35 = Math.max(var58, var37);
                                                         var36 = fo.b;
                                                      } else {
                                                         var36 = Math.min(var30, var38);
                                                         var35 = 0;
                                                      }
                                                   } else {
                                                      var35 = Math.max(var58, var37);
                                                      var36 = Math.min(var30, var38);
                                                   }

                                                   moa.a(var22, -var34 + var23, var36 + -var35, var41 + var35, var0, 2092904780, var34, var45);
                                                }
                                             }
                                          }

                                          var10 = var27;
                                          break;
                                       }

                                       ++var29;
                                       ++var27;
                                       if(var27 >= var50) {
                                          var27 = 0;
                                       }
                                    }
                                 }

                                 if(var23 + var25 <= cka.d) {
                                    var44 = false;
                                 } else {
                                    var25 = cka.d + -var23;
                                 }

                                 int[] var56;
                                 if(fo.b == var26) {
                                    moa.a(var22, var25, var24, var39 + var9, var0, 2092904780, var23, var45);
                                    if(var44) {
                                       break label790;
                                    }

                                    var44 = true;
                                    var56 = var20[var14++];
                                    var56[0] = var9;
                                    var56[2] = var25 + var23;
                                    var56[1] = var26;
                                    int[][] var57 = var21;
                                    var21 = var20;
                                    var20 = var57;
                                    var50 = var14;
                                    var41 = var39;
                                    var14 = 0;
                                    var39 = cl.a(79, var22, fo.b);
                                    var6 = var39 - var41;
                                    var9 = 0;
                                    var29 = var6;
                                    if(var6 < 0) {
                                       var29 = var6 + fo.b;
                                    }

                                    var10 = 0;
                                    if(var29 > fo.b) {
                                       var29 -= fo.b;
                                    }

                                    var47 = false;

                                    while(true) {
                                       int[] var59 = var21[var10];
                                       if(var29 >= var59[0] && var29 <= var59[1]) {
                                          break;
                                       }

                                       int var10000 = ~var50;
                                       ++var10;
                                       if(var10000 >= ~var10) {
                                          var10 = 0;
                                       }
                                    }
                                 } else {
                                    var56 = var20[var14++];
                                    var56[1] = var26;
                                    var56[0] = var9;
                                    var56[2] = var25 + var23;
                                    moa.a(var22, var25, var24, var39 + var9, var0, 2092904780, var23, var45);
                                    var9 = var26;
                                 }
                              }
                           }
                        }

                        var3 = var4;
                        return var3;
                     } else if(var0 != null && var0.length == 25 && ((int[])((int[])var0[1])).length == 5) {
                        return gp.a(var0, (byte)117, var2);
                     } else if(null != var0 && var0.length == 24) {
                        return bv.a(var0, var2, (byte)75);
                     } else if(var0 != null && 17 == var0.length && 1 == ((int[])((int[])var0[1])).length) {
                        var4 = od.a(-1704, var2, (Object[])((Object[])var0[5]));
                        if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
                           qo.a(var4, 0, fo.b, bv.b[var2]);
                        }

                        return var4;
                     } else if(var0 != null && 22 == var0.length) {
                        return aj.a(var2, var0, var1 - 105);
                     } else if(null != var0 && 11 == var0.length && -4 == ~((int[])((int[])var0[1])).length) {
                        var4 = od.a(-1704, var2, (Object[])((Object[])var0[5]));
                        if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
                           var40 = vea.a(var0, 0, var2, (byte)-8);

                           for(var6 = 0; fo.b > var6; ++var6) {
                              var39 = var40[var6];
                              if(((int[])((int[])var0[1]))[2] > var39) {
                                 var4[var6] = ((int[])((int[])var0[1]))[2];
                              } else if(((int[])((int[])var0[1]))[1] < var39) {
                                 var4[var6] = ((int[])((int[])var0[1]))[1];
                              } else {
                                 var4[var6] = var39;
                              }
                           }

                           if(var0 != null && var0.length == 1 && var0[0].equals(Integer.valueOf(1))) {
                              nba.a((byte)121, (Object[])null);
                           }
                        }

                        return var4;
                     } else if(var1 != 4) {
                        return (int[])null;
                     } else if(var0 != null && var0.length == 12 && -2 == ~((int[])((int[])var0[1])).length) {
                        var4 = od.a(-1704, var2, (Object[])((Object[])var0[5]));
                        if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
                           var40 = vea.a(var0, 0, var2, (byte)-8);
                           if(null != var0 && 2 == var0.length) {
                              return null;
                           }

                           for(var6 = 0; var6 < fo.b; ++var6) {
                              var4[var6] = -var40[var6] + 4096;
                           }
                        }

                        return var4;
                     } else if(null != var0 && 10 == var0.length) {
                        var4 = od.a(-1704, var2, (Object[])((Object[])var0[5]));
                        if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
                           var41 = 0;

                           for(var10 = ((int[])((int[])var0[1]))[1] + bv.b[var2]; var10 < 0; var10 += 4096) {
                              ;
                           }

                           while(var10 > 4096) {
                              var10 -= 4096;
                           }

                           while(var41 < ((int[])((int[])var0[1]))[8] && ((int[])((int[])var0[8]))[var41] <= var10) {
                              ++var41;
                           }

                           if(var0 != null && -3 == ~var0.length && var0[1].equals(Boolean.valueOf(false)) && var0[1].equals(Integer.valueOf(2))) {
                              ms.a(28, var1 - 21);
                           }

                           var12 = -1 + var41;
                           boolean var13 = (1 & var41) == 0;
                           var16 = ((int[])((int[])var0[8]))[var41];
                           var17 = ((int[])((int[])var0[8]))[-1 + var41];
                           if(var17 + ((int[])((int[])var0[1]))[2] < var10 && -((int[])((int[])var0[1]))[2] + var16 > var10) {
                              for(var5 = 0; fo.b > var5; ++var5) {
                                 var6 = var13?((int[])((int[])var0[1]))[4]:-((int[])((int[])var0[1]))[4];
                                 var39 = 0;
                                 if(null != var0 && (var0.length == 1 && var0[0].equals(Integer.valueOf(1)) && var0[0].equals(Integer.valueOf(2)) || -4 == ~var0.length && var0[2].equals(Boolean.valueOf(false)) && var0[2].equals(Integer.valueOf(2)))) {
                                    return null;
                                 }

                                 for(var9 = (((int[])((int[])var0[1]))[6] * var6 >> 12) + wra.d[var5]; var9 < 0; var9 += 4096) {
                                    ;
                                 }

                                 while(var9 > 4096) {
                                    var9 -= 4096;
                                 }

                                 while(var39 < ((int[])((int[])var0[1]))[7] && var9 >= ((int[][])((int[][])var0[7]))[var12][var39]) {
                                    ++var39;
                                 }

                                 var11 = -1 + var39;
                                 var14 = ((int[][])((int[][])var0[7]))[var12][var11];
                                 var15 = ((int[][])((int[][])var0[7]))[var12][var39];
                                 if(~var9 < ~(((int[])((int[])var0[1]))[2] + var14) && var15 + -((int[])((int[])var0[1]))[2] > var9) {
                                    var4[var5] = ((int[][])((int[][])var0[9]))[var12][var11];
                                 } else {
                                    var4[var5] = 0;
                                 }
                              }

                              if(var0 != null && var0.length == 1) {
                                 return null;
                              }
                           } else {
                              qo.a(var4, 0, fo.b, 0);
                           }
                        }

                        return var4;
                     } else if(var0 != null && -26 == ~var0.length && ((int[])((int[])var0[1])).length == 4) {
                        return rb.a(false, var2, var0);
                     } else if(var0 != null && 9 == var0.length) {
                        return pg.a(var0, 91, var2);
                     } else if(null != var0 && 12 == var0.length && -3 == ~((int[])((int[])var0[1])).length) {
                        var4 = od.a(var1 - 1708, var2, (Object[])((Object[])var0[5]));
                        if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
                           for(var5 = 0; var5 < fo.b; ++var5) {
                              qja.a(var5, var2, var0, 32);
                              var42 = vea.a(var0, 0, uma.E, (byte)-8);
                              var4[var5] = var42[kg.c];
                           }
                        }

                        return var4;
                     } else if(null != var0 && var0.length == 12 && ((int[])((int[])var0[1])).length == 3) {
                        var4 = od.a(-1704, var2, (Object[])((Object[])var0[5]));
                        if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
                           var6 = fo.b / ((int[])((int[])var0[1]))[1];
                           var39 = cka.d / ((int[])((int[])var0[1]))[2];
                           if(var39 <= 0) {
                              var40 = vea.a(var0, 0, 0, (byte)-8);
                           } else {
                              var41 = var2 % var39;
                              var40 = vea.a(var0, 0, var41 * cka.d / var39, (byte)-8);
                           }

                           for(var41 = 0; var41 < fo.b; ++var41) {
                              if(var6 > 0) {
                                 var9 = var41 % var6;
                                 var4[var41] = var40[fo.b * var9 / var6];
                              } else {
                                 var4[var41] = var40[0];
                              }
                           }
                        }

                        return var4;
                     } else if(null != var0 && var0.length == 11 && ((int[])((int[])var0[1])).length == 5 && ((int[])((int[])var0[1]))[1] == 0) {
                        return qr.a((byte)116, var2, var0);
                     } else if(var0 != null && var0.length == 11 && ((int[])((int[])var0[1])).length == 1) {
                        var3 = wra.d;
                        return var3;
                     } else if(var0 != null && var0.length == 20) {
                        return ra.a(var2, 1, var0);
                     } else if(null != var0 && var0.length == 16) {
                        return di.a(121, var0, var2);
                     } else if(var0 != null && 25 == var0.length && ((int[])((int[])var0[1])).length == 2) {
                        var4 = od.a(var1 - 1708, var2, (Object[])((Object[])var0[5]));
                        if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
                           var7 = vea.a(var0, 0, var2, (byte)-8);
                           var8 = vea.a(var0, 1, var2, (byte)-8);
                           var9 = ((int[])((int[])var0[1]))[1];
                           if(3 == var9) {
                              for(var9 = 0; fo.b > var9; ++var9) {
                                 var4[var9] = var8[var9] * var7[var9] >> 12;
                              }
                           } else if(4 != var9) {
                              if(var9 == 10) {
                                 for(var9 = 0; var9 < fo.b; ++var9) {
                                    var6 = var8[var9];
                                    var5 = var7[var9];
                                    var4[var9] = var5 > var6?var5:var6;
                                 }
                              } else if(1 != var9) {
                                 if(11 != var9) {
                                    if(var9 != 5) {
                                       if(7 != var9) {
                                          if(var9 == 6) {
                                             for(var9 = 0; var9 < fo.b; ++var9) {
                                                var6 = var8[var9];
                                                var4[var9] = 2048 > var6?var7[var9] * var6 >> 11:4096 + -((-var7[var9] + 4096) * (4096 - var6) >> 11);
                                             }
                                          } else if(var9 != 2) {
                                             if(var9 != 8) {
                                                if(12 == var9) {
                                                   for(var9 = 0; fo.b > var9; ++var9) {
                                                      var6 = var8[var9];
                                                      var5 = var7[var9];
                                                      var4[var9] = var6 + var5 - (var5 * var6 >> 11);
                                                   }
                                                } else if(9 == var9) {
                                                   for(var9 = 0; fo.b > var9; ++var9) {
                                                      var6 = var8[var9];
                                                      var5 = var7[var9];
                                                      var4[var9] = var6 <= var5?var6:var5;
                                                   }
                                                }
                                             } else {
                                                for(var9 = 0; var9 < fo.b; ++var9) {
                                                   var5 = var7[var9];
                                                   var4[var9] = var5 == 0?0:-((-var8[var9] + 4096 << 12) / var5) + 4096;
                                                }
                                             }
                                          } else {
                                             for(var9 = 0; fo.b > var9; ++var9) {
                                                var4[var9] = -var8[var9] + var7[var9];
                                             }
                                          }
                                       } else {
                                          for(var9 = 0; var9 < fo.b; ++var9) {
                                             var5 = var7[var9];
                                             var4[var9] = var5 == 4096?4096:(var8[var9] << 12) / (-var5 + 4096);
                                          }
                                       }
                                    } else {
                                       for(var9 = 0; var9 < fo.b; ++var9) {
                                          var4[var9] = -((-var7[var9] + 4096) * (-var8[var9] + 4096) >> 12) + 4096;
                                       }
                                    }
                                 } else {
                                    for(var9 = 0; fo.b > var9; ++var9) {
                                       var6 = var8[var9];
                                       var5 = var7[var9];
                                       var4[var9] = var6 < var5?-var6 + var5:-var5 + var6;
                                    }
                                 }
                              } else {
                                 for(var9 = 0; var9 < fo.b; ++var9) {
                                    var4[var9] = var8[var9] + var7[var9];
                                 }
                              }
                           } else {
                              for(var9 = 0; fo.b > var9; ++var9) {
                                 var6 = var8[var9];
                                 var4[var9] = 0 != var6?(var7[var9] << 12) / var6:4096;
                              }
                           }
                        }

                        return var4;
                     } else if(var0 != null && var0.length == 25 && ((int[])((int[])var0[1])).length == 3) {
                        return ps.a(var2, true, var0);
                     } else if(var0 != null && 26 == var0.length && ((int[])((int[])var0[1])).length == 1) {
                        var4 = od.a(var1 ^ -1700, var2, (Object[])((Object[])var0[5]));
                        if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
                           hw.a(-124, bs.a(2, (Object[])((Object[])var0[5])), var0);
                        }

                        return var4;
                     } else {
                        if(null != var0 && 1 == var0.length) {
                           cv.a(false, (Object[])null);
                        }

                        return null != var0 && -20 == ~var0.length?cja.a(var2, -58, var0):(null != var0 && 11 == var0.length && ((int[])((int[])var0[1])).length == 2?qja.a(var0, var2, false):(var0 != null && var0.length == 17 && -4 == ~((int[])((int[])var0[1])).length?fka.a(37, var2, var0):cp.a(-119, var0, var2)));
                     }
                  }
               }
            }
         }
      }
   }

   static final void a(Object[] var0, int var1) {
      ++k;
      if(var1 != 1) {
         ((int[])((int[])var0[1]))[6] = -47;
      }

      if(var0[3] == null) {
         var0[3] = new boolean[1];
      }

      if(var0[2] == null) {
         var0[2] = new long[1];
      }

   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      if(var2 <= -44) {
         ++e;
         ((boolean[])((boolean[])var0[3]))[0] = -2 == ~fh.a(var1, false);
         ((byte[])((byte[])var0[1]))[0] = ipa.a(var1, (int)-104);
         ((byte[])((byte[])var0[1]))[1] = ipa.a(var1, (int)-118);
         ((byte[])((byte[])var0[1]))[3] = ipa.a(var1, (int)-119);
         ((byte[])((byte[])var0[1]))[2] = ipa.a(var1, (int)-104);
      }
   }

}
