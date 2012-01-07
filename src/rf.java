import java.io.File;
import java.io.RandomAccessFile;

final class rf {

   static int f;
   static int c;
   static int b;
   static int e;
   static int g;
   static int d;
   static int a;


   static final void a(int var0, Object[] var1, int var2, int var3, byte var4, boolean var5, int var6) {
      if(var4 == -59) {
         ++b;
         if(0 >= var0) {
            uia.a(var4 ^ 17369, var3, var5, var2, var1, var6);
         } else {
            sw.a = var6;
            oq.d = var2;
            dl.d = 1;
            bp.c = var1;
            kk.a = var5;
            bl.a = var3;
            rua.a = null;
            pda.c = cia.b(3, qs.h) / var0;
            if(1 > pda.c) {
               pda.c = 1;
            }
         }

      }
   }

   static final File a(String var0, int var1) {
      try {
         ++a;
         if(!qu.a) {
            throw new RuntimeException("");
         } else {
            File var2 = (File)qda.g.get(var0);
            if(null != var2) {
               return var2;
            } else {
               File var3 = new File(kta.o, var0);
               RandomAccessFile var4 = null;

               try {
                  File var5 = new File(var3.getParent());
                  if(var5.exists()) {
                     var4 = new RandomAccessFile(var3, "rw");
                     int var6 = var4.read();
                     var4.seek(0L);
                     var4.write(var6);
                     var4.seek((long)var1);
                     var4.close();
                     qda.g.put(var0, var3);
                     return var3;
                  } else {
                     throw new RuntimeException("");
                  }
               } catch (Exception var8) {
                  try {
                     if(var4 != null) {
                        var4.close();
                        var4 = null;
                     }
                  } catch (Exception var7) {
                     ;
                  }

                  throw new RuntimeException();
               }
            }
         }
      } catch (RuntimeException var9) {
         throw vt.a(var9, "rf.A(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final void a(aa var0, int[][] var1, aa var2, ta var3, aa var4, int var5, int var6, Object[] var7) {
      ++d;
      if(var7 != null && -7 == ~var7.length) {
         eb.a(-9976, -77, 24, 81, 90);
      }

      byte[][] var8 = ((byte[][][])((byte[][][])var7[6]))[var5];
      byte[][] var9 = ((byte[][][])((byte[][][])var7[10]))[var5];
      byte[][] var10 = ((byte[][][])((byte[][][])var7[11]))[var5];
      byte[][] var11 = ((byte[][][])((byte[][][])var7[5]))[var5];
      if(var6 != 9) {
         f = 93;
      }

      for(int var12 = 0; ((int[])((int[])var7[1]))[0] > var12; ++var12) {
         int var13 = ((int[])((int[])var7[1]))[0] - 1 <= var12?var12:1 + var12;

         for(int var14 = 0; var14 < ((int[])((int[])var7[1]))[2]; ++var14) {
            int var15 = ~var14 <= ~(-1 + ((int[])((int[])var7[1]))[2])?var14:1 + var14;
            if(hd.g == -1 || tsa.a(hd.g, var14, true, var12, var5)) {
               boolean var16 = false;
               boolean var17 = false;
               boolean[] var18 = new boolean[4];
               int var19 = var8[var12][var14];
               int var20 = var9[var12][var14];
               int var21 = var11[var12][var14] & 255;
               int var22 = 255 & var10[var12][var14];
               int var23 = 255 & var10[var12][var15];
               int var24 = var10[var13][var15] & 255;
               int var25 = var10[var13][var14] & 255;
               if(var21 != 0 || var22 != 0) {
                  Object[] var26 = var21 != 0?tp.a((Object[])((Object[])var7[0]), -1 + var21, (int)7):null;
                  if(var19 == 0 && null == var26) {
                     var19 = 12;
                  }

                  Object[] var27 = 0 == var22?null:cw.a(-103, -1 + var22, (Object[])((Object[])var7[9]));
                  Object[] var28 = var26;
                  if(null != var26) {
                     if(0 == ~((int[])((int[])var26[1]))[2] && 0 == ~((int[])((int[])var26[1]))[5]) {
                        var28 = var26;
                        var26 = null;
                     } else if(var27 != null && 0 != var19) {
                        var17 = ((boolean[])((boolean[])var26[2]))[2];
                     }
                  }

                  int var34;
                  int var33;
                  int var70;
                  int var71;
                  int var72;
                  if((0 == var19 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < ((int[])((int[])var7[1]))[0] && ((int[])((int[])var7[1]))[2] > var14) {
                     byte var29 = 0;
                     byte var30 = 0;
                     byte var31 = 0;
                     byte var32 = 0;
                     var72 = var29 + (var10[var12 - 1][-1 + var14] == var22?1:-1);
                     var70 = var30 + (var10[var13][-1 + var14] == var22?1:-1);
                     var71 = var31 + (var10[var13][var15] == var22?1:-1);
                     int var73 = var32 - (var22 == var10[-1 + var12][var15]?1:1);
                     if(null != var26 && 10 == var26.length) {
                        nra.d = false;
                     }

                     if(var22 == var10[var12][-1 + var14]) {
                        ++var72;
                        ++var70;
                     } else {
                        --var70;
                        --var72;
                     }

                     if(var10[var13][var14] == var22) {
                        ++var70;
                        ++var71;
                     } else {
                        --var70;
                        --var71;
                     }

                     if(~var22 == ~var10[var12][var15]) {
                        ++var71;
                        ++var73;
                     } else {
                        --var73;
                        --var71;
                     }

                     if(~var22 == ~var10[var12 - 1][var14]) {
                        ++var73;
                        ++var72;
                     } else {
                        --var72;
                        --var73;
                     }

                     var33 = -var71 + var72;
                     if(0 > var33) {
                        var33 = -var33;
                     }

                     var34 = -var73 + var70;
                     if(0 > var34) {
                        var34 = -var34;
                     }

                     if(var33 == var34) {
                        var33 = var0.b(var6 ^ -89, var14, var12) + -var0.b(-78, var15, var13);
                        if(var33 < 0) {
                           var33 = -var33;
                        }

                        var34 = var0.b(-91, var14, var13) - var0.b(-98, var15, var12);
                        if(var34 < 0) {
                           var34 = -var34;
                        }
                     }

                     var20 = var33 < var34?1:0;
                  }

                  for(var72 = 0; 13 > var72; ++var72) {
                     ue.d[var72] = -1;
                     sf.d[var72] = 1;
                  }

                  boolean[] var74 = var26 != null && ((boolean[])((boolean[])var26[2]))[2]?kf.g[var19]:vv.b[var19];
                  var70 = ((int[])((int[])var7[1]))[0];
                  var71 = ((int[])((int[])var7[1]))[2];
                  boolean[] var76 = null != var26 && ((boolean[])((boolean[])var26[2]))[2]?kf.g[var19]:vv.b[var19];
                  byte var35;
                  int var36;
                  int var37;
                  Object[] var75;
                  if(var14 > 0) {
                     if(0 < var12) {
                        var33 = var11[-1 + var12][var14 - 1] & 255;
                        if(var33 > 0) {
                           var75 = tp.a((Object[])((Object[])var7[0]), var33 - 1, (int)7);
                           if(-1 != ((int[])((int[])var75[1]))[2] && ((boolean[])((boolean[])var75[2]))[2]) {
                              var35 = var8[-1 + var12][-1 + var14];
                              var36 = 7 & 2 * var9[var12 - 1][-1 + var14] + 4;
                              var37 = ng.a(var3, (int)28, var75);
                              if(hw.d[var35][var36]) {
                                 raa.a[0] = ((int[])((int[])var75[1]))[2];
                                 osa.f[0] = var37;
                                 bea.f[0] = ((int[])((int[])var75[1]))[6];
                                 bg.f[0] = ((int[])((int[])var75[1]))[8];
                                 ue.d[0] = ((int[])((int[])var75[1]))[3];
                                 sf.d[0] = 256;
                              }
                           }
                        }
                     }

                     if(var12 < -1 + var70) {
                        var33 = 255 & var11[var12 + 1][var14 - 1];
                        if(0 < var33) {
                           var75 = tp.a((Object[])((Object[])var7[0]), -1 + var33, (int)7);
                           if(~((int[])((int[])var75[1]))[2] != 0 && ((boolean[])((boolean[])var75[2]))[2]) {
                              var35 = var8[1 + var12][-1 + var14];
                              var36 = 7 & 6 + var9[1 + var12][var14 - 1] * 2;
                              var37 = ng.a(var3, var6 + 103, var75);
                              if(hw.d[var35][var36]) {
                                 raa.a[2] = ((int[])((int[])var75[1]))[2];
                                 osa.f[2] = var37;
                                 bea.f[2] = ((int[])((int[])var75[1]))[6];
                                 bg.f[2] = ((int[])((int[])var75[1]))[8];
                                 ue.d[2] = ((int[])((int[])var75[1]))[3];
                                 sf.d[2] = 512;
                              }
                           }
                        }
                     }
                  }

                  if(var14 < var71 - 1) {
                     if(0 < var12) {
                        var33 = var11[var12 - 1][var14 + 1] & 255;
                        if(var33 > 0) {
                           var75 = tp.a((Object[])((Object[])var7[0]), var33 - 1, (int)7);
                           if(-1 != ((int[])((int[])var75[1]))[2] && ((boolean[])((boolean[])var75[2]))[2]) {
                              var35 = var8[var12 - 1][1 + var14];
                              var36 = 7 & var9[-1 + var12][1 + var14] * 2 + 2;
                              var37 = ng.a(var3, (int)60, var75);
                              if(hw.d[var35][var36]) {
                                 raa.a[6] = ((int[])((int[])var75[1]))[2];
                                 osa.f[6] = var37;
                                 bea.f[6] = ((int[])((int[])var75[1]))[6];
                                 bg.f[6] = ((int[])((int[])var75[1]))[8];
                                 ue.d[6] = ((int[])((int[])var75[1]))[3];
                                 sf.d[6] = 64;
                              }
                           }
                        }
                     }

                     if(~var12 > ~(var70 - 1)) {
                        var33 = var11[var12 + 1][var14 + 1] & 255;
                        if(var33 > 0) {
                           var75 = tp.a((Object[])((Object[])var7[0]), -1 + var33, (int)7);
                           if(((int[])((int[])var75[1]))[2] != -1 && ((boolean[])((boolean[])var75[2]))[2]) {
                              var35 = var8[1 + var12][var14 + 1];
                              var36 = 2 * var9[var12 + 1][1 + var14] + 0 & 7;
                              var37 = ng.a(var3, (int)-120, var75);
                              if(hw.d[var35][var36]) {
                                 raa.a[4] = ((int[])((int[])var75[1]))[2];
                                 osa.f[4] = var37;
                                 bea.f[4] = ((int[])((int[])var75[1]))[6];
                                 bg.f[4] = ((int[])((int[])var75[1]))[8];
                                 ue.d[4] = ((int[])((int[])var75[1]))[3];
                                 sf.d[4] = 128;
                              }
                           }
                        }
                     }
                  }

                  int var38;
                  int var39;
                  int var40;
                  byte var81;
                  if(var14 > 0) {
                     var33 = var11[var12][var14 - 1] & 255;
                     if(var33 > 0) {
                        var75 = tp.a((Object[])((Object[])var7[0]), var33 - 1, (int)7);
                        if(0 != ~((int[])((int[])var75[1]))[2]) {
                           var35 = var8[var12][var14 - 1];
                           var81 = var9[var12][var14 - 1];
                           if(((boolean[])((boolean[])var75[2]))[2]) {
                              var37 = 2;
                              var38 = 4 + var81 * 2;
                              var39 = ng.a(var3, (int)-111, var75);

                              for(var40 = 0; var40 < 3; ++var40) {
                                 var38 &= 7;
                                 var37 &= 7;
                                 if(hw.d[var35][var38] && ((int[])((int[])var75[1]))[3] >= ue.d[var37]) {
                                    raa.a[var37] = ((int[])((int[])var75[1]))[2];
                                    osa.f[var37] = var39;
                                    bea.f[var37] = ((int[])((int[])var75[1]))[6];
                                    bg.f[var37] = ((int[])((int[])var75[1]))[8];
                                    if(~ue.d[var37] != ~((int[])((int[])var75[1]))[3]) {
                                       sf.d[var37] = 32;
                                    } else {
                                       sf.d[var37] |= 32;
                                    }

                                    ue.d[var37] = ((int[])((int[])var75[1]))[3];
                                 }

                                 --var37;
                                 ++var38;
                              }

                              if(!var76[3 & 0 + var20]) {
                                 var18[0] = kf.g[var35][3 & var81 + 2];
                              }

                              if(var75 != null && (var75.length == 2 && var75[0].equals(Integer.valueOf(1)) || -5 == ~var75.length && var75[0].equals(Boolean.valueOf(false)))) {
                                 InputStreamWorker.a(75, var6 ^ 115, 66, 101);
                              }
                           } else if(!var76[3 & var20 + 0]) {
                              var18[0] = vv.b[var35][var81 + 2 & 3];
                           }
                        }
                     }
                  }

                  if(~var14 > ~(var71 - 1)) {
                     var33 = 255 & var11[var12][var14 + 1];
                     if(var33 > 0) {
                        var75 = tp.a((Object[])((Object[])var7[0]), -1 + var33, (int)7);
                        if(~((int[])((int[])var75[1]))[2] != 0) {
                           var35 = var8[var12][var14 + 1];
                           var81 = var9[var12][1 + var14];
                           if(!((boolean[])((boolean[])var75[2]))[2]) {
                              if(!var76[3 & var20 + 2]) {
                                 var18[2] = vv.b[var35][3 & 0 + var81];
                              }
                           } else {
                              var37 = 4;
                              if(null != var75 && 13 == var75.length && var75[8].equals(Integer.valueOf(2))) {
                                 eva.a = true;
                              }

                              var38 = 2 * var81 + 2;
                              var39 = ng.a(var3, (int)-126, var75);

                              for(var40 = 0; var40 < 3; ++var40) {
                                 var37 &= 7;
                                 var38 &= 7;
                                 if(hw.d[var35][var38] && ~((int[])((int[])var75[1]))[3] <= ~ue.d[var37]) {
                                    raa.a[var37] = ((int[])((int[])var75[1]))[2];
                                    osa.f[var37] = var39;
                                    bea.f[var37] = ((int[])((int[])var75[1]))[6];
                                    bg.f[var37] = ((int[])((int[])var75[1]))[8];
                                    if(~((int[])((int[])var75[1]))[3] != ~ue.d[var37]) {
                                       sf.d[var37] = 16;
                                    } else {
                                       sf.d[var37] |= 16;
                                    }

                                    ue.d[var37] = ((int[])((int[])var75[1]))[3];
                                 }

                                 --var38;
                                 ++var37;
                              }

                              if(!var76[2 + var20 & 3]) {
                                 var18[2] = kf.g[var35][3 & var81 + 0];
                              }
                           }
                        }
                     }
                  }

                  if(0 < var12) {
                     var33 = 255 & var11[var12 - 1][var14];
                     if(0 < var33) {
                        var75 = tp.a((Object[])((Object[])var7[0]), -1 + var33, (int)7);
                        if(((int[])((int[])var75[1]))[2] != -1) {
                           var35 = var8[var12 - 1][var14];
                           var81 = var9[var12 - 1][var14];
                           if(!((boolean[])((boolean[])var75[2]))[2]) {
                              if(!var76[3 & var20 + 3]) {
                                 var18[3] = vv.b[var35][3 & 1 + var81];
                              }
                           } else {
                              var37 = 6;
                              var38 = 4 + 2 * var81;
                              var39 = ng.a(var3, var6 ^ 101, var75);

                              for(var40 = 0; var40 < 3; ++var40) {
                                 var37 &= 7;
                                 var38 &= 7;
                                 if(hw.d[var35][var38] && ~((int[])((int[])var75[1]))[3] <= ~ue.d[var37]) {
                                    raa.a[var37] = ((int[])((int[])var75[1]))[2];
                                    osa.f[var37] = var39;
                                    bea.f[var37] = ((int[])((int[])var75[1]))[6];
                                    bg.f[var37] = ((int[])((int[])var75[1]))[8];
                                    if(~ue.d[var37] != ~((int[])((int[])var75[1]))[3]) {
                                       sf.d[var37] = 8;
                                    } else {
                                       sf.d[var37] |= 8;
                                    }

                                    ue.d[var37] = ((int[])((int[])var75[1]))[3];
                                 }

                                 ++var37;
                                 --var38;
                              }

                              if(!var76[3 + var20 & 3]) {
                                 var18[3] = kf.g[var35][3 & var81 + 1];
                              }
                           }
                        }
                     }
                  }

                  if(-1 + var70 > var12) {
                     var33 = var11[var12 + 1][var14] & 255;
                     if(0 < var33) {
                        var75 = tp.a((Object[])((Object[])var7[0]), -1 + var33, (int)7);
                        if(~((int[])((int[])var75[1]))[2] != 0) {
                           var35 = var8[var12 + 1][var14];
                           var81 = var9[var12 + 1][var14];
                           if(((boolean[])((boolean[])var75[2]))[2]) {
                              if(var27 != null && var27.length == 4) {
                                 eb.a(var6 ^ -9983, 96, 58, 105, 111);
                              }

                              var37 = 4;
                              var38 = 2 * var81 + 6;
                              var39 = ng.a(var3, (int)-96, var75);

                              for(var40 = 0; 3 > var40; ++var40) {
                                 var37 &= 7;
                                 var38 &= 7;
                                 if(hw.d[var35][var38] && ((int[])((int[])var75[1]))[3] >= ue.d[var37]) {
                                    raa.a[var37] = ((int[])((int[])var75[1]))[2];
                                    osa.f[var37] = var39;
                                    bea.f[var37] = ((int[])((int[])var75[1]))[6];
                                    bg.f[var37] = ((int[])((int[])var75[1]))[8];
                                    if(((int[])((int[])var75[1]))[3] == ue.d[var37]) {
                                       sf.d[var37] |= 4;
                                    } else {
                                       sf.d[var37] = 4;
                                    }

                                    ue.d[var37] = ((int[])((int[])var75[1]))[3];
                                 }

                                 ++var38;
                                 --var37;
                              }

                              if(!var76[3 & var20 + 1]) {
                                 var18[1] = kf.g[var35][3 + var81 & 3];
                              }
                           } else if(!var76[3 & var20 + 1]) {
                              var18[1] = vv.b[var35][3 + var81 & 3];
                           }
                        }
                     }
                  }

                  int var80;
                  if(var26 != null) {
                     var33 = ng.a(var3, (int)112, var26);
                     if(((boolean[])((boolean[])var26[2]))[2]) {
                        for(var34 = 0; 8 > var34; ++var34) {
                           var80 = 7 & -(2 * var20) + var34;
                           if(hw.d[var19][var34] && ~ue.d[var80] >= ~((int[])((int[])var26[1]))[3]) {
                              raa.a[var80] = ((int[])((int[])var26[1]))[2];
                              osa.f[var80] = var33;
                              bea.f[var80] = ((int[])((int[])var26[1]))[6];
                              bg.f[var80] = ((int[])((int[])var26[1]))[8];
                              if(ue.d[var80] == ((int[])((int[])var26[1]))[3]) {
                                 sf.d[var80] |= 2;
                              } else {
                                 sf.d[var80] = 2;
                              }

                              ue.d[var80] = ((int[])((int[])var26[1]))[3];
                           }
                        }

                        if(null != var26 && (var26.length == 8 || -13 == ~var26.length && var26[0].equals(Boolean.valueOf(false)))) {
                           kma.f = null;
                        }
                     }
                  }

                  boolean var77 = null != var26 && ~((int[])((int[])var26[1]))[5] != ~((int[])((int[])var26[1]))[2];
                  if(!var77) {
                     for(var33 = 0; var33 < 8; ++var33) {
                        if(-1 >= ~ue.d[var33] && ~raa.a[var33] != ~osa.f[var33]) {
                           var77 = true;
                           break;
                        }
                     }
                  }

                  if(!var74[3 & var20 + 1]) {
                     var18[1] |= (sf.d[2] & sf.d[4]) == 0;
                  }

                  if(!var74[var20 + 3 & 3]) {
                     var18[3] |= 0 == (sf.d[0] & sf.d[6]);
                  }

                  if(!var74[var20 + 0 & 3]) {
                     var18[0] |= 0 == (sf.d[2] & sf.d[0]);
                  }

                  if(!var74[var20 + 2 & 3]) {
                     var18[2] |= 0 == (sf.d[6] & sf.d[4]);
                  }

                  if(!var17 && (var19 == 0 || 12 == var19)) {
                     if(var18[0] && !var18[1] && !var18[2] && var18[3]) {
                        var18[3] = false;
                        var19 = var19 == 0?13:14;
                        var18[0] = false;
                        var20 = 0;
                     } else if(var18[0] && var18[1] && !var18[2] && !var18[3]) {
                        var18[1] = false;
                        var19 = var19 != 0?14:13;
                        var18[0] = false;
                        var20 = 3;
                     } else if(!var18[0] && var18[1] && var18[2] && !var18[3]) {
                        var18[2] = false;
                        var19 = 0 != var19?14:13;
                        var18[1] = false;
                        var20 = 2;
                     } else if(!var18[0] && !var18[1] && var18[2] && var18[3]) {
                        var18[3] = false;
                        var18[2] = false;
                        var20 = 1;
                        var19 = 0 != var19?14:13;
                     }
                  }

                  boolean var78 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                  int[] var83 = null;
                  int[] var79;
                  int[] var84;
                  int[] var82;
                  if(var78) {
                     var79 = uha.a[var19];
                     var82 = hv.f[var19];
                     var34 = null == var27?0:kqa.f[var19];
                     var84 = Class_f.k[var19];
                     var80 = var26 != null?ln.c[var19]:0;
                  } else if(var17) {
                     var83 = cj.f[var19];
                     var80 = var26 == null?0:mma.e[var19];
                     var82 = nr.h[var19];
                     var79 = vfa.e[var19];
                     var34 = null != var27?tga.c[var19]:0;
                     var84 = ada.j[var19];
                  } else {
                     var80 = null == var26?0:eg.c[var19];
                     var83 = Class_e.a[var19];
                     var79 = rsa.e[var19];
                     var82 = sc.a[var19];
                     var84 = wta.f_i[var19];
                     var34 = null != var27?cja.f[var19]:0;
                  }

                  var40 = var80 + var34;
                  if(var40 > 0) {
                     if(var18[0]) {
                        ++var40;
                     }

                     if(var18[2]) {
                        ++var40;
                     }

                     if(var18[1]) {
                        ++var40;
                     }

                     if(var18[3]) {
                        ++var40;
                     }

                     int var41 = 0;
                     int var42 = 0;
                     int var43 = var40 * 3;
                     int[] var45 = var77?new int[var43]:null;
                     int[] var46 = new int[var43];
                     int[] var47 = new int[var43];
                     int[] var48 = new int[var43];
                     int[] var49 = new int[var43];
                     int[] var50 = new int[var43];
                     int[] var51 = var2 != null?new int[var43]:null;
                     int[] var52 = var2 == null && var4 == null?null:new int[var43];
                     int var53 = -1;
                     int var54 = -1;
                     int var55 = 256;
                     boolean var44;
                     int var59;
                     int var58;
                     int var57;
                     int var56;
                     int var63;
                     int var62;
                     int var61;
                     int var60;
                     int var64;
                     int var65;
                     int var66;
                     byte var85;
                     if(var26 != null) {
                        var53 = ((int[])((int[])var26[1]))[2];
                        if(var27 != null && (var27.length == 1 && var27[0].equals(Integer.valueOf(0)) || 18 == var27.length)) {
                           a((aa)null, (int[][])null, (aa)null, (ta)null, (aa)null, 52, 9, (Object[])null);
                        }

                        var55 = ((int[])((int[])var26[1]))[8];
                        var54 = ((int[])((int[])var26[1]))[6];
                        var56 = ng.a(var3, var6 + 61, var26);

                        for(var57 = 0; var57 < var80; ++var57) {
                           var44 = false;
                           if(var18[0 + -var20 & 3] && var83[0] == var41) {
                              vh.b[0] = var79[var41];
                              vh.b[1] = 1;
                              vh.b[2] = var82[var41];
                              vh.b[3] = 1;
                              vh.b[4] = var84[var41];
                              vh.b[5] = var82[var41];
                              var85 = 6;
                           } else if(var18[2 + -var20 & 3] && var83[2] == var41) {
                              vh.b[0] = var79[var41];
                              vh.b[1] = 5;
                              vh.b[2] = var82[var41];
                              vh.b[3] = 5;
                              vh.b[4] = var84[var41];
                              vh.b[5] = var82[var41];
                              var85 = 6;
                           } else if(var18[1 - var20 & 3] && var41 == var83[1]) {
                              vh.b[0] = var79[var41];
                              vh.b[1] = 3;
                              vh.b[2] = var82[var41];
                              vh.b[3] = 3;
                              vh.b[4] = var84[var41];
                              vh.b[5] = var82[var41];
                              var85 = 6;
                           } else if(var18[3 & -var20 + 3] && var83[3] == var41) {
                              vh.b[0] = var79[var41];
                              vh.b[1] = 7;
                              vh.b[2] = var82[var41];
                              vh.b[3] = 7;
                              vh.b[4] = var84[var41];
                              vh.b[5] = var82[var41];
                              var85 = 6;
                           } else {
                              vh.b[0] = var79[var41];
                              vh.b[1] = var84[var41];
                              vh.b[2] = var82[var41];
                              var85 = 3;
                           }

                           if(var26 != null && var26.length == 4 && var26[0].equals(Boolean.valueOf(false))) {
                              bd.a(15, 10, 109, (Object[])null, -59, -1, -128);
                           }

                           ++var41;

                           for(var58 = 0; var58 < var85; ++var58) {
                              var59 = vh.b[var58];
                              var60 = 7 & var59 + -(var20 * 2);
                              var61 = ((int[])((int[])var7[12]))[var59];
                              var63 = ((int[])((int[])var7[7]))[var59];
                              if(var20 != 1) {
                                 if(2 != var20) {
                                    if(3 != var20) {
                                       var62 = var61;
                                       var64 = var63;
                                    } else {
                                       var64 = var61;
                                       var62 = -var63 + 512;
                                    }
                                 } else {
                                    var62 = 512 + -var61;
                                    var64 = 512 + -var63;
                                 }
                              } else {
                                 var62 = var63;
                                 var64 = -var61 + 512;
                              }

                              var46[var42] = var62;
                              var47[var42] = var64;
                              if(var51 != null && hw.d[var19][var59]) {
                                 var65 = (var12 << 9) + var62;
                                 var66 = (var14 << 9) + var64;
                                 var51[var42] = var2.a(1, var65, var66) - var0.a(1, var65, var66);
                              }

                              if(null != var52) {
                                 if(null != var2 && !hw.d[var19][var59]) {
                                    var65 = (var12 << 9) + var62;
                                    var66 = var64 + (var14 << 9);
                                    var52[var42] = var0.a(1, var65, var66) + -var2.a(1, var65, var66);
                                 } else if(var4 != null && !cva.k[var19][var59]) {
                                    var65 = (var12 << 9) + var62;
                                    var66 = var64 + (var14 << 9);
                                    var52[var42] = var4.a(1, var65, var66) - var0.a(1, var65, var66);
                                 }
                              }

                              if(null != var7 && 15 == var7.length && var7[6].equals(Boolean.valueOf(false)) && var7[6].equals(Integer.valueOf(0))) {
                                 gl.d = true;
                              }

                              if(var59 < 8 && ((int[])((int[])var26[1]))[3] < ue.d[var60]) {
                                 if(null != var45) {
                                    var45[var42] = osa.f[var60];
                                 }

                                 var50[var42] = bg.f[var60];
                                 var49[var42] = bea.f[var60];
                                 var48[var42] = raa.a[var60];
                              } else {
                                 if(var45 != null) {
                                    var45[var42] = var56;
                                 }

                                 var49[var42] = ((int[])((int[])var26[1]))[6];
                                 var50[var42] = ((int[])((int[])var26[1]))[8];
                                 var48[var42] = var53;
                              }

                              ++var42;
                           }
                        }

                        if(!((boolean[])((boolean[])var7[3]))[0] && var5 == 0) {
                           pma.a(var12, var14, ((int[])((int[])var26[1]))[1], 8 * ((int[])((int[])var26[1]))[4], ((int[])((int[])var26[1]))[11], ((int[])((int[])var26[1]))[9], ((int[])((int[])var26[1]))[7], ((int[])((int[])var26[1]))[10]);
                        }

                        if(12 != var19 && 0 != ~((int[])((int[])var26[1]))[2] && ((boolean[])((boolean[])var26[2]))[1]) {
                           var16 = true;
                        }
                     } else if(!var78) {
                        if(var17) {
                           var41 += mma.e[var19];
                        } else {
                           var41 += eg.c[var19];
                        }
                     } else {
                        var41 += ln.c[var19];
                     }

                     if(var27 != null) {
                        if(0 == var23) {
                           var23 = var22;
                        }

                        if(0 == var24) {
                           var24 = var22;
                        }

                        if(var25 == 0) {
                           var25 = var22;
                        }

                        Object[] var86 = cw.a(-112, -1 + var22, (Object[])((Object[])var7[9]));
                        Object[] var87 = cw.a(-122, var23 - 1, (Object[])((Object[])var7[9]));
                        Object[] var91 = cw.a(var6 - 118, -1 + var24, (Object[])((Object[])var7[9]));
                        Object[] var90 = cw.a(-94, -1 + var25, (Object[])((Object[])var7[9]));

                        for(var60 = 0; var60 < var34; ++var60) {
                           var44 = false;
                           if(var18[3 & -var20 + 0] && ~var41 == ~var83[0]) {
                              vh.b[0] = var79[var41];
                              vh.b[1] = 1;
                              vh.b[2] = var82[var41];
                              vh.b[3] = 1;
                              vh.b[4] = var84[var41];
                              var85 = 6;
                              vh.b[5] = var82[var41];
                           } else if(var18[3 & -var20 + 2] && var41 == var83[2]) {
                              vh.b[0] = var79[var41];
                              vh.b[1] = 5;
                              vh.b[2] = var82[var41];
                              vh.b[3] = 5;
                              vh.b[4] = var84[var41];
                              vh.b[5] = var82[var41];
                              var85 = 6;
                           } else if(var18[3 & 1 - var20] && ~var41 == ~var83[1]) {
                              vh.b[0] = var79[var41];
                              vh.b[1] = 3;
                              vh.b[2] = var82[var41];
                              vh.b[3] = 3;
                              vh.b[4] = var84[var41];
                              vh.b[5] = var82[var41];
                              var85 = 6;
                           } else if(var18[-var20 + 3 & 3] && var83[3] == var41) {
                              vh.b[0] = var79[var41];
                              vh.b[1] = 7;
                              vh.b[2] = var82[var41];
                              vh.b[3] = 7;
                              vh.b[4] = var84[var41];
                              vh.b[5] = var82[var41];
                              var85 = 6;
                           } else {
                              vh.b[0] = var79[var41];
                              vh.b[1] = var84[var41];
                              vh.b[2] = var82[var41];
                              var85 = 3;
                           }

                           if(var28 != null && var28.length == 1 && var28[0].equals(Boolean.valueOf(false))) {
                              wea.f_l = null;
                           }

                           for(var61 = 0; var61 < var85; ++var61) {
                              var62 = vh.b[var61];
                              var63 = -(2 * var20) + var62 & 7;
                              var64 = ((int[])((int[])var7[12]))[var62];
                              var66 = ((int[])((int[])var7[7]))[var62];
                              int var67;
                              if(1 != var20) {
                                 if(var20 != 2) {
                                    if(var20 != 3) {
                                       var67 = var66;
                                       var65 = var64;
                                    } else {
                                       var65 = 512 + -var66;
                                       var67 = var64;
                                    }
                                 } else {
                                    var65 = 512 + -var64;
                                    var67 = 512 + -var66;
                                 }
                              } else {
                                 var67 = -var64 + 512;
                                 var65 = var66;
                              }

                              var46[var42] = var65;
                              var47[var42] = var67;
                              if(null != var28 && (1 == var28.length || -10 == ~var28.length && var28[3].equals(Integer.valueOf(1)) && var28[3].equals(Integer.valueOf(1)))) {
                                 hd.g = -17;
                              }

                              int var68;
                              int var69;
                              if(var51 != null && hw.d[var19][var62]) {
                                 var68 = (var12 << 9) + var65;
                                 var69 = (var14 << 9) + var67;
                                 var51[var42] = var2.a(1, var68, var69) + -var0.a(1, var68, var69);
                              }

                              if(null != var52) {
                                 if(var2 != null && !hw.d[var19][var62]) {
                                    var68 = var65 + (var12 << 9);
                                    var69 = var67 + (var14 << 9);
                                    var52[var42] = var0.a(1, var68, var69) + -var2.a(var6 - 8, var68, var69);
                                 } else if(var4 != null && !cva.k[var19][var62]) {
                                    var68 = (var12 << 9) + var65;
                                    var69 = (var14 << 9) + var67;
                                    var52[var42] = var4.a(var6 - 8, var68, var69) - var0.a(1, var68, var69);
                                 }
                              }

                              if(var62 < 8 && 0 <= ue.d[var63]) {
                                 if(var45 != null) {
                                    var45[var42] = osa.f[var63];
                                 }

                                 var50[var42] = bg.f[var63];
                                 var49[var42] = bea.f[var63];
                                 var48[var42] = raa.a[var63];
                              } else {
                                 if(var17 && hw.d[var19][var62]) {
                                    var49[var42] = var54;
                                    var50[var42] = var55;
                                    var48[var42] = var53;
                                 } else if(var65 == 0 && 0 == var67) {
                                    var48[var42] = var1[var12][var14];
                                    var49[var42] = ((int[])((int[])var86[1]))[2];
                                    var50[var42] = ((int[])((int[])var86[1]))[4];
                                 } else if(var65 == 0 && var67 == 512) {
                                    var48[var42] = var1[var12][var15];
                                    var49[var42] = ((int[])((int[])var87[1]))[2];
                                    var50[var42] = ((int[])((int[])var87[1]))[4];
                                 } else if(var65 == 512 && var67 == 512) {
                                    var48[var42] = var1[var13][var15];
                                    var49[var42] = ((int[])((int[])var91[1]))[2];
                                    var50[var42] = ((int[])((int[])var91[1]))[4];
                                 } else if(var65 == 512 && var67 == 0) {
                                    var48[var42] = var1[var13][var14];
                                    var49[var42] = ((int[])((int[])var90[1]))[2];
                                    var50[var42] = ((int[])((int[])var90[1]))[4];
                                 } else {
                                    if(256 > var65) {
                                       if(256 <= var67) {
                                          var49[var42] = ((int[])((int[])var87[1]))[2];
                                          var50[var42] = ((int[])((int[])var87[1]))[4];
                                       } else {
                                          var49[var42] = ((int[])((int[])var86[1]))[2];
                                          var50[var42] = ((int[])((int[])var86[1]))[4];
                                       }
                                    } else if(var67 >= 256) {
                                       var49[var42] = ((int[])((int[])var91[1]))[2];
                                       var50[var42] = ((int[])((int[])var91[1]))[4];
                                    } else {
                                       var49[var42] = ((int[])((int[])var90[1]))[2];
                                       var50[var42] = ((int[])((int[])var90[1]))[4];
                                    }

                                    var68 = InputStreamWorker.a(var1[var13][var14], 119, var65 << 7 >> 9, var1[var12][var14]);
                                    var69 = InputStreamWorker.a(var1[var13][var15], var6 ^ 58, var65 << 7 >> 9, var1[var12][var15]);
                                    var48[var42] = InputStreamWorker.a(var69, 122, var67 << 7 >> 9, var68);
                                 }

                                 if(var45 != null) {
                                    var45[var42] = var48[var42];
                                 }
                              }

                              ++var42;
                           }

                           ++var41;
                        }

                        if(null != var86 && var86.length == 1) {
                           nf.a(10, -1, 14, 103);
                        }

                        if(var19 != 0 && ((boolean[])((boolean[])var27[0]))[1]) {
                           var16 = true;
                        }
                     }

                     var56 = var0.b(-69, var14, var12);
                     var57 = var0.b(-114, var14, var13);
                     var58 = var0.b(-52, var15, var13);
                     var59 = var0.b(-32, var15, var12);
                     boolean var89 = fr.a(var14, var12, (byte)51);
                     if(var89 && var5 > 1 || !var89 && 0 < var5) {
                        boolean var88 = true;
                        if(var27 != null && !((boolean[])((boolean[])var27[0]))[0]) {
                           var88 = false;
                        } else if(var22 == 0 && 0 != var19) {
                           var88 = false;
                        } else if(var21 > 0 && var28 != null && !((boolean[])((boolean[])var28[2]))[0]) {
                           var88 = false;
                        }

                        if(var88 && var57 == var56 && var56 == var58 && var56 == var59) {
                           ((byte[][][])((byte[][][])var7[8]))[var5][var12][var14] = (byte)(((byte[][][])((byte[][][])var7[8]))[var5][var12][var14] | 4);
                        }
                     }

                     Object[] var92 = gea.a(-17513, new Object[1]);
                     if(((boolean[])((boolean[])var7[3]))[0]) {
                        ((int[])((int[])var92[0]))[1] = jp.a(var12, var14);
                        ((int[])((int[])var92[0]))[5] = nn.a(var12, var14);
                        ((int[])((int[])var92[0]))[0] = jba.a(var12, var14);
                        ((int[])((int[])var92[0]))[6] = kta.a(var12, var14);
                        ((int[])((int[])var92[0]))[4] = Class_d.a(var12, var14);
                        ((int[])((int[])var92[0]))[2] = rta.a(var12, var14);
                     }

                     var0.a(var12, var14, var46, var51, var47, var52, var48, var45, var49, var50, var92, var16);
                     ooa.b(var5, var12, var14);
                  } else {
                     ooa.b(var5, var12, var14);
                  }
               }
            }
         }

         if(var7 != null && (var7.length == 1 || -2 == ~var7.length && var7[0].equals(Integer.valueOf(1)) && var7[0].equals(Integer.valueOf(0)))) {
            rw.w = null;
         }
      }

   }

   static final void a(byte var0, Object[] var1, Object[] var2) {
      ++g;
      int var3 = ((int[])((int[])var2[1]))[0];
      long var4 = ((long[])((long[])var2[4]))[0];
      if(var0 >= 64) {
         if(var1[9] != null) {
            lm var10 = pm.a((long)var3, (Object[])((Object[])var1[9]), false);
            if(null != var10) {
               uda var7;
               if(var10 instanceof uda && (null != (var7 = (uda)var10)?var7.r:null) != null) {
                  uda var8;
                  Object[] var12 = null == (var8 = (uda)var10)?null:var8.r;
                  if(~((long[])((long[])var12[1]))[0] != ~var4) {
                     ((long[])((long[])var12[1]))[0] = var4;
                  }

                  return;
               }

               var10.a((byte)125);
            }
         } else {
            var1[9] = nb.a((byte)80, 4, new Object[5]);
         }

         Object[] var9;
         di.a((Object[])((Object[])var1[9]), true, (lm)((var9 = pm.a(new Object[2], 0, var4)) != null?var9[0]:null), (long)var3);
      }
   }

   static final Object[] a(int var0, int var1, Object[] var2, int var3) {
      if(var1 != -1476) {
         a(68, (Object[])((Object[])var2[3]), 86, ((int[])((int[])((Object[])((Object[])var2[2]))[0]))[14], ((byte[])((byte[])var2[6]))[0], ((boolean[])((boolean[])var2[0]))[4], 7);
      }

      vt.a(var2, false);
      ++e;
      oh var5 = new oh(var2);
      var2[0] = var5;
      ((int[])((int[])var2[1]))[0] = var0;
      ((int[])((int[])var2[1]))[1] = var3;
      return var2;
   }

   static final void a(int var0, int var1, Object[] var2) {
      if(var1 >= 22) {
         ((int[])((int[])var2[1]))[4] = 0;
         ++c;
         ((int[])((int[])var2[1]))[5] = ((int[])((int[])((Object[])((Object[])var2[4]))[7])).length <= 1?-1:1;
         ((int[])((int[])var2[1]))[1] = 0;
         ((int[])((int[])var2[1]))[0] = var0;
         ((int[])((int[])var2[1]))[3] = 0;
         ((boolean[])((boolean[])var2[3]))[0] = false;
         if(null != var2[4]) {
            pia.a((Object[])((Object[])var2[4]), 16706, var2, ((int[])((int[])var2[1]))[4]);
            isa.a((int)118, var2);
         }

      }
   }

}
