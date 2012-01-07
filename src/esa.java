
final class esa {

   static int f;
   static int e;
   static short[][] g;
   static int h;
   static boolean b = false;
   static int a = 4;
   static int c;
   static int d = -1;
   static int f_i;


   static final void a(ta var0, int var1, int var2) {
      ++h;
      cka.c = var0;
      if(cq.h && bqa.f_i) {
         if(nfa.d) {
            mt.a(10, ui.a);
         }

         cka.c.a(kua.f_i);
         if((int)((float)kua.f_i[0] / 3.0F) != sqa.e || ~gra.a != ~((int)((float)kua.f_i[1] / 3.0F))) {
            gra.a = (int)((float)kua.f_i[1] / 3.0F);
            sqa.e = (int)((float)kua.f_i[0] / 3.0F);
            wga.a = new int[gra.a * sqa.e];
         }

         ru.b = 0;

         int var3;
         for(var3 = 0; var3 < rw.t; ++var3) {
            rba.a(var1, lna.h[var3], cka.c, (byte)-122);
         }

         for(var3 = 0; var3 < kga.j; ++var3) {
            rba.a(var1, id.a[var3], cka.c, (byte)-122);
         }

         for(var3 = 0; var3 < caa.d; ++var3) {
            rba.a(var1, gj.O[var3], cka.c, (byte)-122);
         }

         tia.f_i = 0;
         if(~ru.b < var2) {
            var3 = wga.a.length;
            int var4 = 7 & var3 - var3;

            int var5;
            for(var5 = 0; var5 < var4; wga.a[var5++] = Integer.MAX_VALUE) {
               wga.a[var5++] = Integer.MAX_VALUE;
               wga.a[var5++] = Integer.MAX_VALUE;
               wga.a[var5++] = Integer.MAX_VALUE;
               wga.a[var5++] = Integer.MAX_VALUE;
               wga.a[var5++] = Integer.MAX_VALUE;
               wga.a[var5++] = Integer.MAX_VALUE;
               wga.a[var5++] = Integer.MAX_VALUE;
            }

            while(var5 < var3) {
               wga.a[var5++] = Integer.MAX_VALUE;
            }

            oja.a = 1;

            for(int var6 = 0; var6 < ru.b; ++var6) {
               Object[] var7 = pt.a[var6];
               oqa.a(((short[])((short[])var7[5]))[1], ((short[])((short[])var7[3]))[0], ((short[])((short[])var7[3]))[1], ((short[])((short[])var7[6]))[1], ((short[])((short[])var7[5]))[3], ((short[])((short[])var7[6]))[3], ((short[])((short[])var7[3]))[3], ((short[])((short[])var7[5]))[0], ((short[])((short[])var7[6]))[0], 1417351692);
               oqa.a(((short[])((short[])var7[5]))[2], ((short[])((short[])var7[3]))[1], ((short[])((short[])var7[3]))[2], ((short[])((short[])var7[6]))[2], ((short[])((short[])var7[5]))[3], ((short[])((short[])var7[6]))[3], ((short[])((short[])var7[3]))[3], ((short[])((short[])var7[5]))[1], ((short[])((short[])var7[6]))[1], var2 ^ -1417351693);
            }

            oja.a = 2;
         }

         if(nfa.d) {
            mt.a(var2 ^ -11, ui.a);
         }

      } else {
         ru.b = 0;
      }
   }

   static final long a(int var0, Object[] var1, int var2) {
      --var2;
      ++f;
      if(0 <= var2 && 7 >= var2) {
         int var3 = var2 * 8;

         long var4;
         for(var4 = (long)var0; var3 >= 0; var3 -= 8) {
            byte[] var10001 = (byte[])((byte[])var1[2]);
            int[] var10002 = (int[])((int[])var1[1]);
            int var10005 = ((int[])((int[])var1[1]))[0];
            var10002[0] = ((int[])((int[])var1[1]))[0] + 1;
            var4 |= ((long)var10001[var10005] & 255L) << var3;
         }

         return var4;
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void a(ta var0, int var1) {
      ++c;
      if(var1 == 4) {
         if(mqa.j != ((byte[])((byte[])uta.g[10]))[0]) {
            if(null != ju.g) {
               byte var3 = ((byte[])((byte[])uta.g[10]))[0];
               int var6 = rp.c;
               int var7 = wpa.a;
               int var8 = var6 / 2;
               byte var9 = 0;
               byte var10 = 0;
               boolean var11 = true;

               int var12;
               int var14;
               for(var12 = var9; var6 + var9 > var12; ++var12) {
                  for(int var13 = var10; var10 + var7 > var13; ++var13) {
                     for(var14 = var3; var14 <= 3; ++var14) {
                        if(tsa.a(var3, var13, true, var12, var14)) {
                           int var15 = var14;
                           if(fr.a(var13, var12, (byte)51)) {
                              var15 = var14 - 1;
                           }

                           if(var15 >= 0) {
                              boolean var19 = true;
                              Object[] var18 = cu.a(var15, var12, var13);
                              if(var18 != null) {
                                 var19 &= kb.a(var1 ^ 5, var18);
                              }

                              var18 = InputStreamWorker.a(var15, var12, var13, ke.f);
                              if(null != var18) {
                                 var19 &= kb.a(1, var18);
                              }

                              var18 = cba.a(var15, var12, var13);
                              if(null != var18) {
                                 var19 &= kb.a(1, var18);
                              }

                              var11 &= var19;
                           }
                        }
                     }
                  }
               }

               boolean var2;
               if(var11) {
                  var12 = var6 * 4 + 48 + 48;
                  int[] var45 = new int[var12 * var12];

                  for(var14 = 0; var14 < var45.length; ++var14) {
                     var45[var14] = -16777216;
                  }

                  hsa var46 = null;
                  byte var47 = 0;
                  byte var16 = 0;
                  if(!as.a) {
                     pc.d = var0.a(var12, -7343, 0, var45, var12, var12);
                  } else {
                     pc.d = var0.a(var12, var12, false, true);
                     var46 = var0.f();
                     var46.a(0, pc.d.h());
                     lua var17 = var0.e(var12, var12);
                     var46.a(var17);
                     var0.a(var46, 59);
                     var8 = var6;
                     var47 = 48;
                     var16 = 48;
                     var0.Z(1, 0);
                  }

                  oja.a(255);
                  int var48 = -10 + (int)(20.0D * Math.random()) + 238 + (-10 + (int)(Math.random() * 20.0D) + 238 << 8) + (228 + (int)(20.0D * Math.random()) << 16) | -16777216;
                  int var49 = (210501376 | -10 + (int)(20.0D * Math.random()) + 238) << 16;
                  int var50 = (int)(Math.random() * 8.0D) | (int)(Math.random() * 8.0D) << 16 | (int)(Math.random() * 8.0D) << 8;
                  boolean[][] var20 = new boolean[var8 + 3][1 + var8 + 2];

                  int var21;
                  int var23;
                  int var22;
                  int var24;
                  int var27;
                  int var26;
                  int var29;
                  int var28;
                  int var31;
                  int var34;
                  int var32;
                  int var33;
                  for(var21 = var9; var21 < var6 + var9; var21 += var8) {
                     for(var22 = var10; var10 + var7 > var22; var22 += var8) {
                        var23 = var47;
                        var24 = var16;
                        int var25 = var21;
                        if(0 < var21) {
                           var23 = var47 + 4;
                           var25 = var21 - 1;
                        }

                        var26 = var22;
                        if(var22 > 0) {
                           var26 = var22 - 1;
                        }

                        var27 = var21 + var8;
                        if(var6 > var27) {
                           ++var27;
                        }

                        var28 = var22 + var8;
                        if(var7 > var28) {
                           var24 = var16 + 4;
                           ++var28;
                        }

                        if(!un.g) {
                           var0.JA(0, 0, var23 + 4 * var8, 4 * var8 + var24);
                        } else {
                           var0.a();
                        }

                        var0.Z(3, -16777216);
                        var29 = var8;
                        if(var6 - 1 < var8) {
                           var29 = var6 - 1;
                        }

                        int var35;
                        for(int var30 = var3; 3 >= var30; ++var30) {
                           for(var31 = 0; var31 <= var29; ++var31) {
                              for(var32 = 0; var32 <= var29; ++var32) {
                                 var20[var31][var32] = tsa.a(var3, var32 + var26, true, var25 + var31, var30);
                              }
                           }

                           bf.f_l[var30].a(var47, var16, 1024, var25, var26, var27, var28, var20);
                           if(!sp.d) {
                              for(var31 = -4; var8 > var31; ++var31) {
                                 for(var32 = -4; var32 < var8; ++var32) {
                                    var33 = var21 + var31;
                                    var34 = var22 + var32;
                                    if(var9 <= var33 && var10 <= var34 && tsa.a(var3, var34, true, var33, var30)) {
                                       var35 = var30;
                                       if(fr.a(var34, var33, (byte)51)) {
                                          var35 = var30 - 1;
                                       }

                                       if(var35 >= 0) {
                                          int var36 = var31 * 4 + var23;
                                          int var37 = -4 + 4 * (-var32 + var8) + var24;
                                          Object[] var38 = cu.a(var35, var33, var34);
                                          Object[] var39;
                                          int var42;
                                          int var40;
                                          int var41;
                                          if(null != var38) {
                                             var39 = mca.a(true, uaa.a(var38, 127), lja.d);
                                             var40 = 3 & vm.a((byte)20, var38);
                                             var41 = wua.a(var38, 10405);
                                             if(0 != ~((int[])((int[])var39[1]))[34]) {
                                                msa.a(var39, var40, var36, (byte)-32, var37, var0);
                                             } else {
                                                var42 = var48;
                                                if(0 < ((int[])((int[])var39[1]))[11]) {
                                                   var42 = var49;
                                                }

                                                if(var41 == 0 || 2 == var41) {
                                                   if(0 == var40) {
                                                      var0.a((byte)-101, var36, var42, var37, (int)4);
                                                   } else if(var40 != 1) {
                                                      if(var40 != 2) {
                                                         if(3 == var40) {
                                                            var0.a(var42, var36, var37 + 3, 4, (byte)-57);
                                                         }
                                                      } else {
                                                         var0.a((byte)70, var36 + 3, var42, var37, (int)4);
                                                      }
                                                   } else {
                                                      var0.a(var42, var36, var37, 4, (byte)-43);
                                                   }
                                                }

                                                if(3 == var41) {
                                                   if(var40 == 0) {
                                                      var0.d(1, var37, 1, var36, var42, 14851);
                                                   } else if(1 == var40) {
                                                      var0.d(1, var37, 1, 3 + var36, var42, 14851);
                                                   } else if(2 != var40) {
                                                      if(3 == var40) {
                                                         var0.d(1, var37 + 3, 1, var36, var42, 14851);
                                                      }
                                                   } else {
                                                      var0.d(1, 3 + var37, 1, 3 + var36, var42, var1 + 14847);
                                                   }
                                                }

                                                if(2 == var41) {
                                                   if(0 == var40) {
                                                      var0.a(var42, var36, var37, 4, (byte)101);
                                                   } else if(var40 == 1) {
                                                      var0.a((byte)-101, 3 + var36, var42, var37, (int)4);
                                                   } else if(2 == var40) {
                                                      var0.a(var42, var36, var37 + 3, 4, (byte)-127);
                                                   } else if(3 == var40) {
                                                      var0.a((byte)23, var36, var42, var37, (int)4);
                                                   }
                                                }
                                             }
                                          }

                                          var38 = InputStreamWorker.a(var35, var33, var34, ke.f);
                                          if(null != var38) {
                                             var39 = mca.a(true, uaa.a(var38, 119), lja.d);
                                             var40 = vm.a((byte)20, var38) & 3;
                                             var41 = wua.a(var38, 10405);
                                             if(~((int[])((int[])var39[1]))[34] == 0) {
                                                if(9 == var41) {
                                                   var42 = -1118482;
                                                   if(((int[])((int[])var39[1]))[11] > 0) {
                                                      var42 = -1179648;
                                                   }

                                                   if(var40 != 0 && 2 != var40) {
                                                      var0.a(var42, var36 + 3, 3 + var37, var37, (byte)-71, var36);
                                                   } else {
                                                      var0.a(var42, 3 + var36, var37, var37 + 3, (byte)-71, var36);
                                                   }
                                                }
                                             } else {
                                                msa.a(var39, var40, var36, (byte)-32, var37, var0);
                                             }
                                          }

                                          var38 = cba.a(var35, var33, var34);
                                          if(var38 != null) {
                                             var39 = mca.a(true, uaa.a(var38, 126), lja.d);
                                             var40 = vm.a((byte)20, var38) & 3;
                                             if(-1 != ((int[])((int[])var39[1]))[34]) {
                                                msa.a(var39, var40, var36, (byte)-32, var37, var0);
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        if(sp.d) {
                           Object[] var54 = hj.f_i[var3];

                           for(var31 = 0; var31 < var8; ++var31) {
                              for(var32 = 0; var32 < var8; ++var32) {
                                 var33 = var31 + var21;
                                 var34 = var32 + var22;
                                 var35 = ((int[][])((int[][])var54[0]))[-((int[])((int[])var54[1]))[2] + var33][var34 + -((int[])((int[])var54[1]))[0]];
                                 if((1076101120 & var35) == 0) {
                                    if((var35 & 8388608) == 0) {
                                       if((33554432 & var35) != 0) {
                                          var0.a((byte)-126, 3 + var31 * 4 + var23, -1713569622, 4 * (var8 + -var32) + (var24 - 4), (int)4);
                                       } else if((134217728 & var35) == 0) {
                                          if(-1 != ~(536870912 & var35)) {
                                             var0.a((byte)69, var23 + var31 * 4, -1713569622, var24 + (-var32 + var8) * 4 - 4, (int)4);
                                          }
                                       } else {
                                          var0.a(-1713569622, var31 * 4 + var23, 3 + -4 + 4 * (-var32 + var8) + var24, 4, (byte)-52);
                                       }
                                    } else {
                                       var0.a(-1713569622, var23 + 4 * var31, var24 + (-var32 + var8) * 4 - 4, 4, (byte)106);
                                    }
                                 } else {
                                    var0.d(4, -4 + (-var32 + var8) * 4 + var24, 4, 4 * var31 + var23, -1713569622, 14851);
                                 }
                              }

                              if(var54 != null && var54.length == 3) {
                                 ((long[])((long[])ja.w[9]))[2] = -116L;
                              }
                           }

                           if(var54 != null && 4 == var54.length) {
                              ((boolean[])((boolean[])ja.w[12]))[22] = ((boolean[])((boolean[])ja.w[12]))[12];
                           }
                        }

                        var0.r(var23, var24, 4 * var8, var8 * 4, var50, 2);
                        if(!as.a) {
                           pc.d.a(4 * (-var9 + var21) + 48, -(4 * var8) + -((-var10 + var22) * 4) + var7 * 4 + 48, 4 * var8, var8 * 4, var23, var24);
                           if(un.g) {
                              pc.d.a(256, 0);

                              try {
                                 var0.f(107);
                                 qs.a(2000L, var1 ^ 102);
                              } catch (Exception var44) {
                                 ;
                              }
                           }
                        }
                     }
                  }

                  if(as.a) {
                     var0.a(true, var46);
                     if(un.g) {
                        pc.d.a(256, 0);

                        try {
                           var0.f(var1 + 111);
                           qs.a(2000L, 113);
                        } catch (Exception var43) {
                           ;
                        }
                     }
                  }

                  var0.a();
                  var0.Z(1, 1);
                  mg.b(true);
                  gi.j = 0;
                  nb.b(ja.w, var1 ^ 4);
                  if(!sp.d) {
                     Object[] var52;
                     for(var21 = var9; var21 < var9 + var6; ++var21) {
                        for(var22 = var10; var7 + var10 > var22; ++var22) {
                           for(var23 = var3; ~var23 >= ~(var3 + 1) && var23 <= 3; ++var23) {
                              if(tsa.a(var3, var22, true, var21, var23)) {
                                 Object[] var53 = cba.a(var23, var21, var22);
                                 if(null == var53) {
                                    var53 = InputStreamWorker.a(var23, var21, var22, ke.f);
                                 }

                                 if(var53 == null) {
                                    var53 = cu.a(var23, var21, var22);
                                 }

                                 if(var53 == null) {
                                    var53 = kaa.a(var23, var21, var22);
                                 }

                                 if(var53 != null) {
                                    var52 = mca.a(true, uaa.a(var53, 118), lja.d);
                                    if(!((boolean[])((boolean[])var52[0]))[3] || wba.c) {
                                       var26 = ((int[])((int[])var52[1]))[25];
                                       Object[] var56;
                                       if(var52[11] != null) {
                                          if(null != var52 && 4 == var52.length) {
                                             kb.a(1, (Object[])null);
                                          }

                                          for(var27 = 0; ((int[])((int[])var52[11])).length > var27; ++var27) {
                                             if(-1 != ((int[])((int[])var52[11]))[var27]) {
                                                var56 = mca.a(true, ((int[])((int[])var52[11]))[var27], lja.d);
                                                if(-1 >= ~((int[])((int[])var56[1]))[25]) {
                                                   var26 = ((int[])((int[])var56[1]))[25];
                                                }
                                             }
                                          }
                                       }

                                       if(var26 >= 0) {
                                          boolean var51 = false;
                                          if(var26 >= 0) {
                                             var56 = ita.a(var26, oe.g, -105);
                                             if(var56 != null && ((boolean[])((boolean[])var56[9]))[3]) {
                                                var51 = true;
                                             }
                                          }

                                          var28 = var21;
                                          var29 = var22;
                                          if(var51) {
                                             if(null != var52 && var52.length == 7) {
                                                rh.a(-44, 76, 8, (Object[])((Object[])ja.w[0]), (Class_s)ja.w[9], -50, -121, (cga)ja.w[5]);
                                             }

                                             int[][] var55 = (int[][])((int[][])hj.f_i[var23][0]);
                                             var31 = ((int[])((int[])hj.f_i[var23][1]))[2];
                                             var32 = ((int[])((int[])hj.f_i[var23][1]))[0];

                                             for(var33 = 0; var33 < 10; ++var33) {
                                                var34 = (int)(Math.random() * 4.0D);
                                                if(0 == var34 && var28 > var9 && var28 > var21 - 3 && -1 == ~(var55[-1 + (var28 - var31)][var29 - var32] & 2883848)) {
                                                   --var28;
                                                }

                                                if(var34 == 1 && ~var28 > ~(-1 + var6 + var9) && var21 + 3 > var28 && -1 == ~(var55[-var31 + var28 + 1][-var32 + var29] & 2883968)) {
                                                   ++var28;
                                                }

                                                if(var34 == 2 && var29 > var10 && var22 - 3 < var29 && (var55[var28 - var31][-var32 + -1 + var29] & 2883842) == 0) {
                                                   --var29;
                                                }

                                                if(3 == var34 && var10 + (var7 - 1) > var29 && var29 < 3 + var22 && (var55[var28 + -var31][-var32 + var29 + 1] & 2883872) == 0) {
                                                   ++var29;
                                                }
                                             }
                                          }

                                          ca.c[gi.j] = ((int[])((int[])var52[1]))[13];
                                          opa.b[gi.j] = var28;
                                          fq.c[gi.j] = var29;
                                          ++gi.j;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if(qv.c != null) {
                        ((int[])((int[])ha.f_i[1]))[0] = 1;
                        qia.a((byte)-117, 1024, 64, oe.g);

                        for(var21 = 0; ~var21 > ~((int[])((int[])qv.c[1]))[0]; ++var21) {
                           var22 = ((int[])((int[])qv.c[2]))[var21];
                           if(~((byte[])((byte[])uta.g[10]))[0] == ~(var22 >> 28)) {
                              var23 = -rs.f + ((268432664 & var22) >> 14);
                              var24 = -qm.d + (16383 & var22);
                              if(0 <= var23 && var23 < rp.c && var24 >= 0 && wpa.a > var24) {
                                 Object[] var4;
                                 client.a(112, ja.w, (lm)(null != (var4 = ps.a((byte)-75, var21, new Object[2]))?var4[0]:null));
                              } else {
                                 var52 = ita.a(((int[])((int[])qv.c[0]))[var21], oe.g, var1 ^ -108);
                                 if(var52[3] != null && -1 >= ~(((int[])((int[])var52[1]))[27] + var23) && ~rp.c < ~(((int[])((int[])var52[1]))[15] + var23) && -1 >= ~(var24 + ((int[])((int[])var52[1]))[12]) && var24 + ((int[])((int[])var52[1]))[16] < wpa.a) {
                                    Object[] var5;
                                    client.a(-40, ja.w, (lm)((var5 = ps.a((byte)-85, var21, new Object[2])) == null?null:var5[0]));
                                 }
                              }
                           }
                        }

                        qia.a((byte)-117, 128, 64, oe.g);
                        ((int[])((int[])ha.f_i[1]))[0] = 2;
                        kc.b(var1 ^ 129, ha.f_i);
                     }
                  }

                  var2 = true;
               } else {
                  var2 = false;
               }

               if(var2) {
                  mqa.j = ((byte[])((byte[])uta.g[10]))[0];
               }

            }
         }
      }
   }

   static final String a(boolean var0, long var1, Object[] var3, int[] var4, Object[] var5) {
      ++e;
      if(var5[2] != null) {
         Object[] var7 = (Object[])((Object[])var5[2]);
         if(var7 == null) {
            throw new IllegalStateException();
         }

         String var8;
         Object[] var9;
         if(et.f_i != var3) {
            if(var3 != ng.a && no.e != var3) {
               if(var3 != nf.b && iia.o != var3 && var3 != ag.x) {
                  var8 = null;
               } else {
                  var8 = qk.a(-122, (int)var1, mta.a(2, var4[0], de.g));
               }
            } else {
               var9 = us.a((int)var1, (byte)61, cqa.a);
               var8 = (String)var9[12];
            }
         } else {
            var9 = mta.a(2, var4[0], de.g);
            var8 = qk.a(-121, (int)var1, var9);
         }

         if(var8 != null) {
            return var8;
         }
      }

      return !var0?(String)null:Long.toString(var1);
   }

   static final void a(Object[] var0, int var1) {
      if(null == var0[var1]) {
         var0[1] = new int[5];
      }

      ++f_i;
   }

}
