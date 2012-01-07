
final class ts {

   static int d;
   static int b;
   static int a;
   static int f;
   static int c;
   static String e;


   static final Object[] a(int var0, re var1) {
      ++c;
      if(!(var1 instanceof hl)) {
         if(var1 instanceof oha) {
            return ((oha)var1).e;
         } else {
            if(var0 != -7865) {
               e = (String)null;
            }

            return null;
         }
      } else {
         return ((hl)var1).f;
      }
   }

   static final void a(ta var0, int var1) {
      ++f;
      rt.g = new Object[aqa.n.length][];

      for(int var2 = 0; ~var2 > ~aqa.n.length; ++var2) {
         int var3 = aqa.n[var2];
         Object[] var4 = jh.a(var3, false, uha.d);
         ja var5 = var0.a(var4, aea.a(oma.f, var3), true);
         rt.g[var2] = qh.a(new Object[2], -97, var4, var5);
      }

      if(var1 != 9016) {
         e = (String)null;
      }

   }

   static final int[][] a(Object[] var0, int var1, int var2) {
      ++d;
      if(null != var0 && var0.length == 17 && ((int[])((int[])var0[1])).length == 4) {
         return ppa.a(var0, -4597, var2);
      } else {
         if(var1 != -1149) {
            a((Object[])((Object[])var0[1]), ((int[])((int[])var0[6]))[0], -119);
         }

         if(var0 != null && var0.length == 21) {
            return es.a((byte)127, var0, var2);
         } else if(null != var0 && 13 == var0.length) {
            return fq.a(var2, 14185, var0);
         } else if(null != var0 && -7 == ~var0.length && 3 == ((int[])((int[])var0[1])).length) {
            return mta.b(var2, 26611, var0);
         } else if(null != var0 && 11 == var0.length && ((int[])((int[])var0[1])).length == 5 && ((int[])((int[])var0[1]))[1] == 1) {
            return Class_b.a((byte)-125, var0, var2);
         } else {
            int[][] var4;
            int[] var5;
            int[] var8;
            int[] var9;
            int[][] var25;
            int[] var34;
            int[] var33;
            int[] var38;
            int[] var39;
            int[] var36;
            int[] var37;
            int[] var40;
            if(null != var0 && -24 == ~var0.length) {
               var4 = loa.a((byte)-52, var2, (Object[])((Object[])var0[4]));
               if(((boolean[])((boolean[])((Object[])((Object[])var0[4]))[0]))[0]) {
                  var5 = vea.a(var0, 2, var2, (byte)-8);
                  int[][] var31 = bsa.a(0, (byte)17, var2, var0);
                  var25 = bsa.a(1, (byte)17, var2, var0);
                  var8 = var4[0];
                  var9 = var4[1];
                  var33 = var4[2];
                  var36 = var31[0];
                  var34 = var31[1];
                  var37 = var31[2];
                  var38 = var25[0];
                  var40 = var25[1];
                  var39 = var25[2];

                  for(int var41 = 0; var41 < fo.b; ++var41) {
                     int var44 = var5[var41];
                     if(4096 != var44) {
                        if(var44 == 0) {
                           var8[var41] = var38[var41];
                           var9[var41] = var40[var41];
                           var33[var41] = var39[var41];
                        } else {
                           int var43 = -var44 + 4096;
                           var8[var41] = var43 * var38[var41] + var36[var41] * var44 >> 12;
                           var9[var41] = var34[var41] * var44 + var43 * var40[var41] >> 12;
                           var33[var41] = var44 * var37[var41] + var39[var41] * var43 >> 12;
                        }
                     } else {
                        var8[var41] = var36[var41];
                        var9[var41] = var34[var41];
                        var33[var41] = var37[var41];
                     }
                  }
               }

               return var4;
            } else if(var0 != null && (11 == var0.length && ((int[])((int[])var0[1])).length == 4 || var0.length == 8)) {
               return wd.a(var0, var2, true);
            } else {
               int[] var6;
               int[] var7;
               int var10;
               int var11;
               int var23;
               int var30;
               if(var0 != null && var0.length == 15) {
                  var4 = loa.a((byte)-52, var2, (Object[])((Object[])var0[4]));
                  if(((boolean[])((boolean[])((Object[])((Object[])var0[4]))[0]))[0]) {
                     var23 = ((int[])((int[])var0[1]))[2] * (((int[])((int[])var0[1]))[1] == cka.d?var2:((int[])((int[])var0[1]))[1] * var2 / cka.d);
                     var6 = var4[0];
                     var7 = var4[1];
                     var8 = var4[2];
                     if(fo.b == ((int[])((int[])var0[1]))[2]) {
                        for(var30 = 0; var30 < fo.b; ++var30) {
                           var10 = ((int[])((int[])var0[13]))[var23++];
                           var8[var30] = var10 << 4 & 4080;
                           var7[var30] = var10 >> 4 & 4080;
                           var6[var30] = (var10 & 16711680) >> 12;
                        }
                     } else {
                        for(var30 = 0; fo.b > var30; ++var30) {
                           var10 = var30 * ((int[])((int[])var0[1]))[2] / fo.b;
                           var11 = ((int[])((int[])var0[13]))[var23 + var10];
                           var8[var30] = 4080 & var11 << 4;
                           var7[var30] = (var11 & '\uff00') >> 4;
                           var6[var30] = (var11 & 16711680) >> 12;
                        }
                     }
                  }

                  return var4;
               } else if(var0 != null && var0.length == 22) {
                  return iia.a(var2, var0, 71);
               } else if(null != var0 && var0.length == 11 && -4 == ~((int[])((int[])var0[1])).length) {
                  return uk.a((byte)-103, var2, var0);
               } else {
                  int var12;
                  if(var0 != null && -13 == ~var0.length && ((int[])((int[])var0[1])).length == 1) {
                     var4 = loa.a((byte)-52, var2, (Object[])((Object[])var0[4]));
                     if(((boolean[])((boolean[])((Object[])((Object[])var0[4]))[0]))[0]) {
                        if(var0 != null && 1 == var0.length) {
                           cv.a(false, (Object[])null);
                        }

                        int[][] var26 = bsa.a(0, (byte)17, var2, var0);
                        var6 = var26[0];
                        var7 = var26[1];
                        var8 = var26[2];
                        var9 = var4[0];
                        var33 = var4[1];
                        var36 = var4[2];

                        for(var12 = 0; var12 < fo.b; ++var12) {
                           var9[var12] = 4096 - var6[var12];
                           var33[var12] = -var7[var12] + 4096;
                           var36[var12] = 4096 - var8[var12];
                        }
                     }

                     return var4;
                  } else if(var0 != null && var0.length == 12 && ((int[])((int[])var0[1])).length == 2) {
                     return nj.a(var1 ^ -1149, var0, var2);
                  } else if(null != var0 && 12 == var0.length && ((int[])((int[])var0[1])).length == 3) {
                     return tka.a(var0, var1 + 1149, var2);
                  } else if(null != var0 && var0.length == 6 && ((int[])((int[])var0[1])).length == 10) {
                     return oaa.a(var2, true, var0);
                  } else {
                     int var24;
                     int[][] var32;
                     if(var0 != null && 25 == var0.length && 2 == ((int[])((int[])var0[1])).length) {
                        var4 = loa.a((byte)-52, var2, (Object[])((Object[])var0[4]));
                        if(((boolean[])((boolean[])((Object[])((Object[])var0[4]))[0]))[0]) {
                           var32 = bsa.a(0, (byte)17, var2, var0);
                           int[][] var35 = bsa.a(1, (byte)17, var2, var0);
                           var37 = var4[0];
                           var38 = var4[1];
                           var40 = var4[2];
                           var39 = var32[0];
                           if(null != var0 && var0.length == 2) {
                              return (int[][])null;
                           }

                           int[] var42 = var32[1];
                           int[] var18 = var32[2];
                           int[] var19 = var35[0];
                           int[] var20 = var35[1];
                           int[] var21 = var35[2];
                           int var22 = ((int[])((int[])var0[1]))[1];
                           if(var22 == 1) {
                              for(var22 = 0; fo.b > var22; ++var22) {
                                 var37[var22] = var19[var22] + var39[var22];
                                 var38[var22] = var20[var22] + var42[var22];
                                 var40[var22] = var21[var22] + var18[var22];
                              }
                           } else if(var22 != 3) {
                              int var28;
                              if(6 != var22) {
                                 int var27;
                                 if(var22 != 9) {
                                    if(var22 != 5) {
                                       if(var22 == 2) {
                                          for(var22 = 0; fo.b > var22; ++var22) {
                                             var37[var22] = -var19[var22] + var39[var22];
                                             var38[var22] = var42[var22] - var20[var22];
                                             var40[var22] = -var21[var22] + var18[var22];
                                          }
                                       } else if(8 != var22) {
                                          if(10 != var22) {
                                             if(4 != var22) {
                                                if(var22 == 7) {
                                                   for(var22 = 0; fo.b > var22; ++var22) {
                                                      var24 = var42[var22];
                                                      var27 = var18[var22];
                                                      var23 = var39[var22];
                                                      var37[var22] = 4096 == var23?4096:(var19[var22] << 12) / (-var23 + 4096);
                                                      var38[var22] = 4096 == var24?4096:(var20[var22] << 12) / (4096 - var24);
                                                      var40[var22] = 4096 == var27?4096:(var21[var22] << 12) / (-var27 + 4096);
                                                   }
                                                } else if(12 != var22) {
                                                   if(11 == var22) {
                                                      for(var22 = 0; var22 < fo.b; ++var22) {
                                                         var24 = var42[var22];
                                                         var23 = var39[var22];
                                                         var10 = var21[var22];
                                                         var28 = var19[var22];
                                                         var30 = var20[var22];
                                                         var27 = var18[var22];
                                                         var37[var22] = var23 <= var28?var28 + -var23:-var28 + var23;
                                                         var38[var22] = var30 < var24?var24 - var30:var30 + -var24;
                                                         var40[var22] = var10 < var27?-var10 + var27:-var27 + var10;
                                                      }
                                                   }
                                                } else {
                                                   for(var22 = 0; fo.b > var22; ++var22) {
                                                      var10 = var21[var22];
                                                      var24 = var42[var22];
                                                      var27 = var18[var22];
                                                      var30 = var20[var22];
                                                      var23 = var39[var22];
                                                      var28 = var19[var22];
                                                      var37[var22] = -(var28 * var23 >> 11) + var23 + var28;
                                                      var38[var22] = -(var24 * var30 >> 11) + var30 + var24;
                                                      var40[var22] = var10 + var27 + -(var10 * var27 >> 11);
                                                   }
                                                }
                                             } else {
                                                for(var22 = 0; fo.b > var22; ++var22) {
                                                   var30 = var20[var22];
                                                   var10 = var21[var22];
                                                   var28 = var19[var22];
                                                   var37[var22] = var28 == 0?4096:(var39[var22] << 12) / var28;
                                                   var38[var22] = var30 != 0?(var42[var22] << 12) / var30:4096;
                                                   var40[var22] = var10 == 0?4096:(var18[var22] << 12) / var10;
                                                }
                                             }
                                          } else {
                                             for(var22 = 0; var22 < fo.b; ++var22) {
                                                var27 = var18[var22];
                                                var30 = var20[var22];
                                                var23 = var39[var22];
                                                var28 = var19[var22];
                                                var10 = var21[var22];
                                                var24 = var42[var22];
                                                var37[var22] = var23 <= var28?var28:var23;
                                                var38[var22] = var30 < var24?var24:var30;
                                                var40[var22] = var27 > var10?var27:var10;
                                             }
                                          }
                                       } else {
                                          for(var22 = 0; var22 < fo.b; ++var22) {
                                             var23 = var39[var22];
                                             var24 = var42[var22];
                                             var27 = var18[var22];
                                             var37[var22] = 0 == var23?0:-((4096 - var19[var22] << 12) / var23) + 4096;
                                             var38[var22] = 0 == var24?0:4096 + -((4096 + -var20[var22] << 12) / var24);
                                             var40[var22] = var27 == 0?0:4096 - (4096 - var21[var22] << 12) / var27;
                                          }
                                       }
                                    } else {
                                       for(var22 = 0; fo.b > var22; ++var22) {
                                          var37[var22] = -((4096 - var39[var22]) * (4096 - var19[var22]) >> 12) + 4096;
                                          var38[var22] = -((4096 + -var42[var22]) * (4096 + -var20[var22]) >> 12) + 4096;
                                          var40[var22] = -((-var18[var22] + 4096) * (4096 + -var21[var22]) >> 12) + 4096;
                                       }
                                    }
                                 } else {
                                    for(var22 = 0; fo.b > var22; ++var22) {
                                       var28 = var19[var22];
                                       var27 = var18[var22];
                                       var10 = var21[var22];
                                       var30 = var20[var22];
                                       var24 = var42[var22];
                                       var23 = var39[var22];
                                       var37[var22] = var23 >= var28?var28:var23;
                                       var38[var22] = var30 <= var24?var30:var24;
                                       var40[var22] = var27 >= var10?var10:var27;
                                    }
                                 }
                              } else {
                                 for(var22 = 0; fo.b > var22; ++var22) {
                                    var30 = var20[var22];
                                    var28 = var19[var22];
                                    var10 = var21[var22];
                                    var37[var22] = 2048 <= var28?4096 - ((-var28 + 4096) * (-var39[var22] + 4096) >> 11):var28 * var39[var22] >> 11;
                                    var38[var22] = 2048 <= var30?4096 + -((-var30 + 4096) * (-var42[var22] + 4096) >> 11):var42[var22] * var30 >> 11;
                                    var40[var22] = 2048 > var10?var10 * var18[var22] >> 11:-((4096 + -var18[var22]) * (4096 - var10) >> 11) + 4096;
                                 }
                              }
                           } else {
                              for(var22 = 0; var22 < fo.b; ++var22) {
                                 var37[var22] = var19[var22] * var39[var22] >> 12;
                                 var38[var22] = var42[var22] * var20[var22] >> 12;
                                 var40[var22] = var21[var22] * var18[var22] >> 12;
                              }
                           }
                        }

                        return var4;
                     } else {
                        int var15;
                        int var16;
                        if(var0 != null && -27 == ~var0.length && ((int[])((int[])var0[1])).length == 1) {
                           var4 = loa.a((byte)-52, var2, (Object[])((Object[])var0[4]));
                           if(((boolean[])((boolean[])((Object[])((Object[])var0[4]))[0]))[0]) {
                              var23 = fo.b;
                              var24 = cka.d;
                              var25 = new int[var24][var23];
                              int[][][] var29 = qja.a((byte)-49, (Object[])((Object[])var0[4]));
                              hw.a(-124, var25, var0);

                              for(var30 = 0; var30 < cka.d; ++var30) {
                                 var33 = var25[var30];
                                 var32 = var29[var30];
                                 var34 = var32[0];
                                 if(null != var0 && 2 == var0.length) {
                                    cp.a(116, (Object[])null, -102);
                                 }

                                 var37 = var32[1];
                                 var38 = var32[2];

                                 for(var15 = 0; var15 < fo.b; ++var15) {
                                    var16 = var33[var15];
                                    var38[var15] = 4080 & var16 << 4;
                                    var37[var15] = ('\uff00' & var16) >> 4;
                                    var34[var15] = 4080 & var16 >> 12;
                                 }
                              }
                           }

                           return var4;
                        } else if(null != var0 && var0.length == 19) {
                           return ks.a(var0, (byte)90, var2);
                        } else if(null != var0 && var0.length == 11 && -7 == ~((int[])((int[])var0[1])).length) {
                           return oi.a(false, var2, var0);
                        } else if(var0 != null && -18 == ~var0.length && 3 == ((int[])((int[])var0[1])).length) {
                           var4 = loa.a((byte)-52, var2, (Object[])((Object[])var0[4]));
                           if(((boolean[])((boolean[])((Object[])((Object[])var0[4]))[0]))[0]) {
                              var5 = vea.a(var0, 1, var2, (byte)-8);
                              var6 = vea.a(var0, 2, var2, (byte)-8);
                              var7 = var4[0];
                              var8 = var4[1];
                              var9 = var4[2];

                              for(var10 = 0; fo.b > var10; ++var10) {
                                 var11 = 255 * var5[var10] >> 12 & 255;
                                 var12 = var6[var10] * ((int[])((int[])var0[1]))[2] >> 12;
                                 int var13 = var12 * usa.c[var11] >> 12;
                                 int var14 = var12 * ad.c[var11] >> 12;
                                 var15 = var10 + (var13 >> 12) & td.q;
                                 var16 = wq.e & var2 + (var14 >> 12);
                                 int[][] var17 = bsa.a(0, (byte)17, var16, var0);
                                 var7[var10] = var17[0][var15];
                                 var8[var10] = var17[1][var15];
                                 var9[var10] = var17[2][var15];
                              }
                           }

                           return var4;
                        } else {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   static final int a(Object[] var0, int var1) {
      if(((int[])((int[])var0[var1]))[3] == 0) {
         fg.d(var1 ^ 0, var0);
         ((int[])((int[])var0[1]))[3] = 256;
      }

      ++a;
      return ((int[])((int[])var0[2]))[--((int[])((int[])var0[1]))[3]];
   }

   static final hb a(int var0, Object[] var1, byte var2, int[] var3) {
      try {
         ++b;
         if(var2 < 96) {
            e = (String)null;
         }

         if(oh.a((Object[])((Object[])var1[1]), (byte)104) != 1) {
            if(jla.a((Object[])((Object[])var1[1]), (byte)83, var0) != 1) {
               throw new RuntimeException();
            } else {
               return hd.a(0, var0, var3, (byte)-117, var1);
            }
         } else {
            return hd.a(var0, 0, var3, (byte)-58, var1);
         }
      } catch (RuntimeException var5) {
         throw vt.a(var5, "ts.D(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

}
