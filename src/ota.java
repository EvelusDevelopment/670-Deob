
final class ota extends tha {

   static int w;
   static int[] t = new int[32];
   static int v;
   static int y;
   static int u;
   static Object[] z = ab.a(new Object[2], (byte)-25);
   Object[] x;


   static final Object[] a(boolean var0, int var1, Object[] var2) {
      if(var0) {
         ((boolean[])((boolean[])((Object[])((Object[])var2[1]))[3]))[0] = ((boolean[])((boolean[])var2[0]))[5];
      }

      ++v;
      if(var2[0] == null) {
         var2[0] = new int[1];
      }

      ((int[])((int[])var2[0]))[0] = var1;
      return var2;
   }

   ota(Object[] var1) {
      this.x = var1;
   }

   static final void a(Object[] var0, int var1, int var2) {
      try {
         ++w;
         boolean var3 = -2 == ~tg.a(var0, 8553, 1);
         if(var3) {
            bi.f[lu.c++] = var2;
         }

         int var4 = tg.a(var0, 8553, 2);
         Object[] var5 = vo.E[var2];
         if(var4 != 0) {
            int var7;
            int var8;
            int var14;
            if(var4 != 1) {
               if(2 == var4) {
                  var14 = tg.a(var0, 8553, 4);
                  var7 = ((int[])((int[])var5[33]))[0];
                  var8 = ((int[])((int[])var5[14]))[0];
                  if(0 != var14) {
                     if(1 == var14) {
                        var8 -= 2;
                        --var7;
                     } else if(2 == var14) {
                        var8 -= 2;
                     } else if(3 == var14) {
                        ++var7;
                        var8 -= 2;
                     } else if(4 != var14) {
                        if(var14 != 5) {
                           if(var14 == 6) {
                              var7 += 2;
                              --var8;
                           } else if(7 == var14) {
                              var7 -= 2;
                           } else if(8 == var14) {
                              var7 += 2;
                           } else if(9 != var14) {
                              if(10 != var14) {
                                 if(var14 != 11) {
                                    if(var14 != 12) {
                                       if(var14 == 13) {
                                          var8 += 2;
                                       } else if(var14 != 14) {
                                          if(var14 == 15) {
                                             var7 += 2;
                                             var8 += 2;
                                          }
                                       } else {
                                          ++var7;
                                          var8 += 2;
                                       }
                                    } else {
                                       --var7;
                                       var8 += 2;
                                    }
                                 } else {
                                    var7 -= 2;
                                    var8 += 2;
                                 }
                              } else {
                                 var7 += 2;
                                 ++var8;
                              }
                           } else {
                              var7 -= 2;
                              ++var8;
                           }
                        } else {
                           var7 -= 2;
                           --var8;
                        }
                     } else {
                        var7 += 2;
                        var8 -= 2;
                     }
                  } else {
                     var8 -= 2;
                     var7 -= 2;
                  }

                  if(var3) {
                     ((int[])((int[])var5[12]))[57] = var7;
                     ((int[])((int[])var5[12]))[48] = var8;
                     ((boolean[])((boolean[])var5[8]))[11] = true;
                  } else {
                     una.a(var5, var7, wua.c[var2], var8, (byte)83);
                  }

               } else {
                  var14 = tg.a(var0, 8553, 1);
                  int var11;
                  int var12;
                  int var15;
                  int var16;
                  if(var14 == 0) {
                     if(var5 != null && -13 == ~var5.length) {
                        uja.h = (Object[][])null;
                     }

                     var7 = tg.a(var0, 8553, 12);
                     var8 = var7 >> 10;
                     var15 = (1013 & var7) >> 5;
                     if(var15 > 15) {
                        var15 -= 32;
                     }

                     var16 = var7 & 31;
                     if(var16 > 15) {
                        var16 -= 32;
                     }

                     var11 = var15 + ((int[])((int[])var5[33]))[0];
                     var12 = ((int[])((int[])var5[14]))[0] + var16;
                     if(var3) {
                        ((boolean[])((boolean[])var5[8]))[11] = true;
                        ((int[])((int[])var5[12]))[57] = var11;
                        ((int[])((int[])var5[12]))[48] = var12;
                     } else {
                        una.a(var5, var11, wua.c[var2], var12, (byte)83);
                     }

                     ((byte[])((byte[])var5[10]))[0] = ((byte[])((byte[])var5[10]))[1] = (byte)(3 & var8 + ((byte[])((byte[])var5[10]))[0]);
                     if(fr.a(var12, var11, (byte)51)) {
                        ++((byte[])((byte[])var5[10]))[1];
                     }

                     if(dp.r == var2) {
                        if(jca.n != ((byte[])((byte[])var5[10]))[0]) {
                           bla.b = true;
                        }

                        jca.n = ((byte[])((byte[])var5[10]))[0];
                     }

                  } else {
                     var7 = tg.a(var0, 8553, 30);
                     var8 = var7 >> 28;
                     var15 = (268429945 & var7) >> 14;
                     var16 = 16383 & var7;
                     var11 = -rs.f + (16383 & var15 + ((int[])((int[])var5[33]))[0] + rs.f);
                     var12 = (((int[])((int[])var5[14]))[0] + qm.d + var16 & 16383) - qm.d;
                     if(var3) {
                        ((int[])((int[])var5[12]))[57] = var11;
                        ((int[])((int[])var5[12]))[48] = var12;
                        ((boolean[])((boolean[])var5[8]))[11] = true;
                     } else {
                        una.a(var5, var11, wua.c[var2], var12, (byte)83);
                     }

                     ((byte[])((byte[])var5[10]))[0] = ((byte[])((byte[])var5[10]))[1] = (byte)(var8 + ((byte[])((byte[])var5[10]))[0] & 3);
                     if(fr.a(var12, var11, (byte)51)) {
                        ++((byte[])((byte[])var5[10]))[1];
                     }

                     if(dp.r == var2) {
                        jca.n = ((byte[])((byte[])var5[10]))[0];
                     }

                     if(var1 > -81) {
                        t = (int[])null;
                     }

                  }
               }
            } else {
               var14 = tg.a(var0, 8553, 3);
               var7 = ((int[])((int[])var5[33]))[0];
               var8 = ((int[])((int[])var5[14]))[0];
               if(var14 == 0) {
                  --var8;
                  --var7;
               } else if(var14 == 1) {
                  --var8;
               } else if(var14 != 2) {
                  if(var14 != 3) {
                     if(var14 == 4) {
                        ++var7;
                     } else if(5 != var14) {
                        if(6 != var14) {
                           if(7 == var14) {
                              ++var7;
                              ++var8;
                           }
                        } else {
                           ++var8;
                        }
                     } else {
                        ++var8;
                        --var7;
                     }
                  } else {
                     --var7;
                  }
               } else {
                  ++var7;
                  --var8;
               }

               if(var3) {
                  ((int[])((int[])var5[12]))[48] = var8;
                  ((int[])((int[])var5[12]))[57] = var7;
                  ((boolean[])((boolean[])var5[8]))[11] = true;
               } else {
                  una.a(var5, var7, wua.c[var2], var8, (byte)83);
               }

            }
         } else if(!var3) {
            if(dp.r != var2) {
               Object[][] var6 = uja.h;
               Object[] var9 = new Object[2];
               oea.a(var9, 31103);
               Object[] var10 = var6[var2] = var9;
               ((int[])((int[])var10[1]))[0] = (((int[])((int[])var5[14]))[0] + qm.d >> 6) + (rs.f + ((int[])((int[])var5[33]))[0] >> 6 << 14) + (((byte[])((byte[])var5[10]))[0] << 28);
               if(-1 != ((int[])((int[])var5[12]))[52]) {
                  ((int[])((int[])var10[1]))[1] = ((int[])((int[])var5[12]))[52];
               } else {
                  ((int[])((int[])var10[1]))[1] = bca.a((Object[])((Object[])var5[35]), false);
               }

               ((boolean[])((boolean[])var10[0]))[1] = ((boolean[])((boolean[])var5[8]))[10];
               ((boolean[])((boolean[])var10[0]))[0] = ((boolean[])((boolean[])var5[8]))[14];
               ((int[])((int[])var10[1]))[2] = ((int[])((int[])var5[12]))[14];
               if(-1 > ~((int[])((int[])var5[12]))[46]) {
                  eha.a(var5, true);
               }

               if(null != var10 && var10.length == 20) {
                  ot.a = null;
               }

               vo.E[var2] = null;
               if(0 != tg.a(var0, 8553, 1)) {
                  pca.a(var2, (byte)-117, var0);
               }

            } else {
               throw new RuntimeException();
            }
         } else {
            ((boolean[])((boolean[])var5[8]))[11] = false;
         }
      } catch (RuntimeException var13) {
         throw vt.a(var13, "ota.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ')');
      }
   }

   static final void a(int var0, Object[] var1) {
      ++y;
      int var2 = -84 / ((3 - var0) / 60);
   }

   static final void a(boolean var0, Object[] var1) {
      if(!var0) {
         ++u;
         if(null == var1[1]) {
            var1[1] = new int[6];
         }

      }
   }

}
