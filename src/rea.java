import java.io.File;
import java.io.IOException;

final class rea {

   static int c;
   static int j;
   static int d;
   static int h;
   static int e;
   static int k;
   static int g;
   static int b;
   static int f;
   static int a;
   static int f_i;


   static final void a(int var0, float var1, int var2, Object[] var3, int var4, float var5, float var6, int var7, boolean var8, int var9, float var10, float[] var11) {
      ++f;
      if(var3 == null) {
         if(var8) {
            a(-39, 0.022405794F, ((int[])((int[])var3[9]))[1], (Object[])null, ((int[])((int[])var3[0]))[2], ((float[])((float[])var3[3]))[1], 1.0640329F, ((int[])((int[])var3[0]))[0], ((boolean[])((boolean[])var3[1]))[0], 41, -0.62028813F, (float[])null);
         }

         throw new IllegalStateException();
      } else {
         pla.a((byte)87, var0, var5, var11, var6, var9, var2, var1, var10, var3, var7, var4);
      }
   }

   static final void a(int var0, Object[] var1, int var2, int var3, int var4, int var5, int var6) {
      if(var3 != -10640) {
         g = ((int[])((int[])var1[17]))[0];
      }

      ++j;
   }

   static final void a(Object[] var0, byte var1, byte[][] var2) {
      ++k;
      int var3 = var2.length;
      if(var1 == -43) {
         int var4;
         for(var4 = 0; var3 > var4; ++var4) {
            byte[] var5 = var2[var4];
            if(var5 != null) {
               Object[] var6 = jta.a((byte)-91, var5, new Object[3]);
               int var7 = Class_f.d[var4] >> 8;
               int var8 = 255 & Class_f.d[var4];
               int var9 = var7 * 64 + -rs.f;
               int var10 = 64 * var8 + -qm.d;
               afa.a((byte)-124);
               int var11 = rs.f;
               int var12 = qm.d;
               Object[][] var13 = hj.f_i;
               if(var0 != null && (4 == var0.length || 2 == var0.length)) {
                  mga.a(0, true);
               }

               if(var6 != null && (var6.length == 12 && var6[1].equals(Integer.valueOf(0)) || -13 == ~var6.length)) {
                  ppa.a(14150, ((int[])((int[])qja.f_l[10]))[3], false, -109);
               }

               int var14;
               int var17;
               int var16;
               int var19;
               int var18;
               int var21;
               int var22;
               if(!((boolean[])((boolean[])var0[3]))[0]) {
                  for(var14 = 0; var14 < 4; ++var14) {
                     Object[] var15 = var13[var14];

                     for(var16 = 0; 64 > var16; ++var16) {
                        if(null != var0 && -8 == ~var0.length) {
                           jca.b((byte)-124);
                        }

                        for(var17 = 0; 64 > var17; ++var17) {
                           var18 = var9 + var16;
                           var19 = var17 + var10;
                           if(var18 >= 0 && ~var18 > ~((int[])((int[])var0[1]))[0] && var19 >= 0 && ((int[])((int[])var0[1]))[2] > var19) {
                              var22 = var19 - ((int[])((int[])var15[1]))[0];
                              var21 = var18 - ((int[])((int[])var15[1]))[2];
                              ((int[][])((int[][])var15[0]))[var21][var22] &= -2097153;
                           }
                        }
                     }
                  }

                  if(null != var0 && 4 == var0.length && var0[2].equals(Boolean.valueOf(false)) && var0[2].equals(Integer.valueOf(2))) {
                     fg.a(-113, -90, ((int[])((int[])dka.g[0]))[12], (byte)104);
                  }
               }

               var14 = var11 + var9;
               int var31 = var12 + var10;

               for(var16 = 0; var16 < ((int[])((int[])var0[1]))[1]; ++var16) {
                  for(var17 = 0; var17 < 64; ++var17) {
                     if(null != var0 && var0.length == 1) {
                        nma.c = (Object[])((Object[])((Object[])((Object[])eo.g[10]))[0]);
                     }

                     for(var18 = 0; var18 < 64; ++var18) {
                        ora.a(var6, 0, 0, var18 + var10, var31 + var18, var16, var9 + var17, 0, var14 + var17, 1, false, var0);
                     }
                  }
               }

               ta var30 = lna.g;
               if(!((boolean[])((boolean[])var0[3]))[0]) {
                  boolean var32 = false;
                  Object[] var33 = null;

                  int var20;
                  while(((byte[])((byte[])var6[2])).length > ((int[])((int[])var6[1]))[0]) {
                     var17 = fh.a(var6, false);
                     if(var17 != 0) {
                        int var23;
                        int var24;
                        if(var17 == 1) {
                           var18 = fh.a(var6, false);
                           if(0 < var18) {
                              if(var33 != null && var33.length == 23 && var33[4].equals(Integer.valueOf(2)) && var33[4].equals(Integer.valueOf(1))) {
                                 gba.o = -102;
                              }

                              for(var19 = 0; var18 > var19; ++var19) {
                                 Object[] var37 = ta.a(var30, var6, (byte)-52, new Object[4], 2);
                                 Object[] var38;
                                 if(31 == ((int[])((int[])var37[1]))[2]) {
                                    var38 = sw.a(qja.f_l, -90, de.a((int)0, var6));
                                    od.a(((int[])((int[])var38[0]))[2], (byte)-65, ((int[])((int[])var38[0]))[3], ((int[])((int[])var38[0]))[1], ((int[])((int[])var38[0]))[0], var37);
                                 }

                                 if(var30.x() > 0) {
                                    var38 = (Object[])((Object[])var37[3]);
                                    var22 = lba.a(var38, -25699) + (var9 << 9);
                                    var23 = (var10 << 9) + fn.a(var38, -93);
                                    var24 = var22 >> 9;
                                    int var25 = var23 >> 9;
                                    if(var24 >= 0 && 0 <= var25 && ~var24 > ~((int[])((int[])var0[1]))[0] && ((int[])((int[])var0[1]))[2] > var25) {
                                       int var26 = ((int[][][])((int[][][])var0[4]))[((int[])((int[])var37[1]))[5]][var24][var25] - sla.a(var38, false);
                                       Class_cs.a((float)var23, (float)var22, (float)var26, (Object[])((Object[])var38[2]), (byte)125);
                                       ra.a(var37);
                                    }
                                 }
                              }
                           }
                        } else if(2 == var17) {
                           if(var33 == null) {
                              var33 = gs.a((byte)-117, new Object[4]);
                           }

                           tra.a(var6, (byte)63, var33);
                        } else if(var17 == 128) {
                           if(var33 == null) {
                              var33 = gs.a((byte)101, new Object[4]);
                           }

                           ug.a(var6, var33, (byte)101);
                        } else {
                           if(129 != var17) {
                              throw new IllegalStateException("");
                           }

                           if(null != var6 && (var6.length == 8 && var6[1].equals(Boolean.valueOf(false)) || 16 == var6.length)) {
                              pp.a((byte)-63, 9);
                           }

                           if(var0[2] == null) {
                              var0[2] = new byte[4][][];
                           }

                           var32 = true;

                           for(var18 = 0; 4 > var18; ++var18) {
                              byte var34 = ipa.a(var6, (int)-80);
                              if(0 == var34 && ((byte[][][])((byte[][][])var0[2]))[var18] != null) {
                                 var20 = var9;
                                 if(null != var6 && var6.length == 1) {
                                    vja.a(((int[])((int[])eo.g[3]))[1], ((float[])((float[])pi.y[0]))[0], ((boolean[])((boolean[])((Object[])((Object[])fv.d[6]))[6]))[0], ((float[])((float[])rka.d[5]))[9], -0.80502707F, var1 ^ -12282, 0.27128437F, (Object[])((Object[])ib.g[1]), -1.1349286F, 94);
                                 }

                                 var21 = var9 + 64;
                                 var22 = var10;
                                 var23 = 64 + var10;
                                 if(var10 >= 0) {
                                    if(var10 >= ((int[])((int[])var0[1]))[2]) {
                                       var22 = ((int[])((int[])var0[1]))[2];
                                    }
                                 } else {
                                    var22 = 0;
                                 }

                                 if(var9 >= 0) {
                                    if(((int[])((int[])var0[1]))[0] <= var9) {
                                       var20 = ((int[])((int[])var0[1]))[0];
                                    }
                                 } else {
                                    var20 = 0;
                                 }

                                 if(var21 < 0) {
                                    var21 = 0;
                                 } else if(((int[])((int[])var0[1]))[0] <= var21) {
                                    var21 = ((int[])((int[])var0[1]))[0];
                                 }

                                 if(var23 >= 0) {
                                    if(((int[])((int[])var0[1]))[2] <= var23) {
                                       var23 = ((int[])((int[])var0[1]))[2];
                                    }
                                 } else {
                                    var23 = 0;
                                 }

                                 while(var20 < var21) {
                                    if(null != var6 && -3 == ~var6.length && var6[0].equals(Integer.valueOf(2))) {
                                       dfa.a[0] = qb.b[4];
                                    }

                                    while(var22 < var23) {
                                       ((byte[][][])((byte[][][])var0[2]))[var18][var20][var22] = 0;
                                       ++var22;
                                    }

                                    ++var20;
                                 }
                              } else if(var34 == 1) {
                                 if(null == ((byte[][][])((byte[][][])var0[2]))[var18]) {
                                    ((byte[][][])((byte[][][])var0[2]))[var18] = new byte[((int[])((int[])var0[1]))[0] + 1][((int[])((int[])var0[1]))[2] + 1];
                                 }

                                 for(var20 = 0; var20 < 64; var20 += 4) {
                                    for(var21 = 0; var21 < 64; var21 += 4) {
                                       byte var36 = ipa.a(var6, var1 ^ 67);
                                       if(null != var6 && (var6.length == 16 || var6.length == 19 || var6.length == 1 && var6[0].equals(Integer.valueOf(1)))) {
                                          ura.a[1] = null;
                                       }

                                       for(var23 = var20 + var9; 4 + var20 + var9 > var23; ++var23) {
                                          for(var24 = var21 + var10; 4 + var21 + var10 > var24; ++var24) {
                                             if(0 <= var23 && ((int[])((int[])var0[1]))[0] > var23 && var24 >= 0 && ((int[])((int[])var0[1]))[2] > var24) {
                                                ((byte[][][])((byte[][][])var0[2]))[var18][var23][var24] = var36;
                                             }
                                          }

                                          if(var0 != null && (8 == var0.length || 24 == var0.length)) {
                                             opa.a(3, ((int[])((int[])ija.e[4]))[33], 77, -117);
                                          }
                                       }
                                    }

                                    if(var33 != null && var33.length == 10) {
                                       poa.g = ((int[])((int[])((Object[])((Object[])((Object[])((Object[])aaa.f[1]))[2]))[26]))[3];
                                    }
                                 }

                                 if(var33 != null && 1 == var33.length) {
                                    ki.b = -61;
                                 }
                              } else if(2 == var34) {
                                 if(null == ((byte[][][])((byte[][][])var0[2]))[var18]) {
                                    ((byte[][][])((byte[][][])var0[2]))[var18] = new byte[1 + ((int[])((int[])var0[1]))[0]][1 + ((int[])((int[])var0[1]))[2]];
                                 }

                                 if(var18 > 0) {
                                    var20 = var9;
                                    var21 = 64 + var9;
                                    var22 = var10;
                                    if(0 > var10) {
                                       var22 = 0;
                                    } else if(~var10 <= ~((int[])((int[])var0[1]))[2]) {
                                       var22 = ((int[])((int[])var0[1]))[2];
                                    }

                                    var23 = var10 + 64;
                                    if(var21 >= 0) {
                                       if(((int[])((int[])var0[1]))[0] <= var21) {
                                          var21 = ((int[])((int[])var0[1]))[0];
                                       }
                                    } else {
                                       var21 = 0;
                                    }

                                    if(var9 < 0) {
                                       var20 = 0;
                                    } else if(var9 >= ((int[])((int[])var0[1]))[0]) {
                                       var20 = ((int[])((int[])var0[1]))[0];
                                    }

                                    if(var23 < 0) {
                                       var23 = 0;
                                    } else if(~var23 <= ~((int[])((int[])var0[1]))[2]) {
                                       var23 = ((int[])((int[])var0[1]))[2];
                                    }

                                    while(var21 > var20) {
                                       while(var23 > var22) {
                                          ((byte[][][])((byte[][][])var0[2]))[var18][var20][var22] = ((byte[][][])((byte[][][])var0[2]))[-1 + var18][var20][var22];
                                          ++var22;
                                       }

                                       ++var20;
                                    }
                                 }
                              }
                           }
                        }
                     } else if(null == var33) {
                        Object[] var35 = new Object[4];
                        eta.a(var35, (byte)-43);
                        ((float[])((float[])var35[2]))[5] = 1.0F;
                        ((float[])((float[])var35[2]))[1] = 0.25F;
                        ((float[])((float[])var35[2]))[4] = 1.0F;
                        Class_p.a(var1 + 42, var6, var35);
                        var33 = var35;
                     } else {
                        Class_p.a(-1, var6, var33);
                     }
                  }

                  if(var33 != null) {
                     for(var17 = 0; var17 < 8; ++var17) {
                        if(null != var33 && (-12 == ~var33.length && var33[1].equals(Integer.valueOf(1)) || var33.length == 5 && var33[4].equals(Integer.valueOf(0)))) {
                           lg.a(3, ((int[])((int[])((Object[])((Object[])lja.a[2]))[3]))[4], 79, false, (Object[][][][])((Object[][][][])((Object[])((Object[])vra.d[0]))[4]), ((int[])((int[])((Object[])((Object[])he.b[0]))[4]))[15]);
                        }

                        for(var18 = 0; 8 > var18; ++var18) {
                           var19 = (var9 >> 3) + var17;
                           var20 = (var10 >> 3) + var18;
                           if(var19 >= 0 && ((int[])((int[])var0[1]))[0] >> 3 > var19 && 0 <= var20 && ((int[])((int[])var0[1]))[2] >> 3 > var20) {
                              pja.a(var33, 0, var20, var19);
                           }
                        }
                     }
                  }

                  if(!var32 && var0[2] != null) {
                     for(var17 = 0; var17 < 4; ++var17) {
                        if(null != ((byte[][][])((byte[][][])var0[2]))[var17]) {
                           for(var18 = 0; var18 < 16; ++var18) {
                              for(var19 = 0; 16 > var19; ++var19) {
                                 var20 = (var9 >> 2) + var18;
                                 var21 = (var10 >> 2) + var19;
                                 if(0 <= var20 && var20 < 26 && var21 >= 0 && 26 > var21) {
                                    ((byte[][][])((byte[][][])var0[2]))[var17][var20][var21] = 0;
                                 }
                              }
                           }

                           if(null != var6 && -2 == ~var6.length && var6[0].equals(Boolean.valueOf(false)) && var6[0].equals(Integer.valueOf(1))) {
                              nma.f = false;
                           }
                        }
                     }

                     if(null != var0 && var0.length == 4 && var0[0].equals(Boolean.valueOf(false))) {
                        wh.a = -124;
                     }
                  }
               }
            }
         }

         if(null != var0 && -3 == ~var0.length) {
            dna.a(123, 83, (String)null);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            int var27 = -rs.f + 64 * (Class_f.d[var4] >> 8);
            int var28 = 64 * (255 & Class_f.d[var4]) + -qm.d;
            byte[] var29 = var2[var4];
            if(var29 == null && 800 > ld.a) {
               afa.a((byte)108);
               pma.a(var27, var28, 64, var0, 64, (byte)125);
            }
         }

      }
   }

   static final void a(int var0, Object[] var1) {
      ++c;
      byte[] var2 = new byte[var0];

      int var4;
      try {
         gla.a((byte)49, 0L, cj.d);
         if(var1 != null && var1.length == 7) {
            av.c = (File)((Object[])((Object[])nu.a[6]))[19];
         }

         Object[] var3 = cj.d;
         mv.a(77, var2, 0, var2.length, var3);

         for(var4 = 0; var4 < 24 && -1 == ~var2[var4]; ++var4) {
            ;
         }

         if(24 <= var4) {
            throw new IOException();
         }
      } catch (Exception var5) {
         for(var4 = 0; 24 > var4; ++var4) {
            var2[var4] = -1;
         }

         if(var1 != null && (5 == var1.length || var1.length == 23 && var1[13].equals(Integer.valueOf(0)) && var1[13].equals(Integer.valueOf(2)))) {
            hk.e = 35L;
         }
      }

      lr.a(24, var2, var0 + 20220, 0, var1);
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++f_i;
      synchronized(var1[0]) {
         fua.a(102, (Object[])((Object[])var1[0]), var2);
      }

      if(var0 > -69) {
         a(30, -0.5140654F, -42, (Object[])((Object[])var1[12]), -45, ((float[])((float[])var1[0]))[5], -0.08269624F, 18, true, ((int[])((int[])var1[3]))[13], 1.1109546F, (float[])null);
      }

      synchronized(var1[4]) {
         fua.a(-47, (Object[])((Object[])var1[4]), var2);
      }
   }

   static final Object[] a(int var0, int var1, int var2, int var3, Object[] var4, boolean var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      ++e;
      if(var12 != 849) {
         a(((int[])((int[])var4[4]))[9], 1.3738855F, 20, (Object[])((Object[])var4[0]), -121, ((float[])((float[])var4[0]))[30], ((float[])((float[])var4[0]))[22], ((int[])((int[])var4[1]))[1], false, ((int[])((int[])var4[12]))[1], ((float[])((float[])((Object[])((Object[])var4[4]))[7]))[0], (float[])null);
      }

      fda.a(var4, (byte)-118);
      ((int[])((int[])var4[1]))[0] = var0;
      ((short[])((short[])var4[0]))[1] = (short)var10;
      if(null != var4 && -10 == ~var4.length) {
         return null;
      } else {
         ((boolean[])((boolean[])var4[3]))[0] = var5;
         ((short[])((short[])var4[0]))[0] = (short)var9;
         ((byte[])((byte[])var4[2]))[0] = (byte)var1;
         ((int[])((int[])var4[1]))[1] = var6;
         ((byte[])((byte[])var4[2]))[1] = (byte)var2;
         ((short[])((short[])var4[0]))[2] = (short)var8;
         return var4;
      }
   }

   static final li b(Object[] var0, int var1) {
      int var2 = -124 / ((var1 - 31) / 55);
      ++d;
      return new li(var0);
   }

   static final long a(int var0, int var1, int var2, Object[] var3) {
      if(var0 != 1) {
         return 65L;
      } else {
         ++b;
         return rpa.a(var2, var1, var3, var0 + 118);
      }
   }

   static final byte a(Object[] var0, int var1) {
      if(var1 < 50) {
         g = -55;
      }

      ++h;
      byte[] var10000 = (byte[])((byte[])var0[2]);
      int[] var10001 = (int[])((int[])var0[1]);
      int var10004 = ((int[])((int[])var0[1]))[0];
      var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      return (byte)(-var10000[var10004] + 128);
   }

   static final void a(int var0, float var1, Object[] var2) {
      if(((float[])((float[])var2[25]))[10] != var1) {
         ((float[])((float[])var2[25]))[10] = var1;
         ioa.a(var2, -39);
      }

      ++a;
      if(var0 != 14033) {
         a(83, new Object[1], -72);
      }

   }

}
