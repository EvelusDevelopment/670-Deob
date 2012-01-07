import java.io.IOException;

final class wta {

   static int h;
   static Object[] j = sd.a(new Object[1], 64, (byte)112);
   static int e;
   static int[][] f_i = new int[][]{{2, 4, 6, 0}, {0, 2, 4, 6}, {0, 2, 4}, {4, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 4, 7, 6}, {4, 7, 6, 0}, {0, 8, 6, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 4, 6, 10, 0}, {2, 4, 6, 0}};
   static int d;
   static int b;
   static int g;
   static int f;
   static int a;
   static asa c;


   static final void a(int var0, Object[] var1, byte var2, int var3, int var4, int var5, int var6, int var7) {
      ++d;
      int var8 = 0;
      if(var4 != var0) {
         var8 = (-var7 + var5 << 16) / (-var0 + var4);
      }

      if(var2 < 71) {
         a((Object[])null, ((byte[])((byte[])var1[5]))[0]);
      }

      int var9 = 0;
      if(var6 != var4) {
         var9 = (-var5 + var3 << 16) / (var6 + -var4);
      }

      int var10 = 0;
      if(var6 != var0) {
         var10 = (-var3 + var7 << 16) / (var0 - var6);
      }

      if(var4 >= var0 && var6 >= var0) {
         if(var6 > var4) {
            var3 = var7 <<= -1937480496;
            if(0 > var0) {
               var3 -= var10 * var0;
               var7 -= var8 * var0;
               var0 = 0;
            }

            var5 <<= 16;
            if(var4 < 0) {
               var5 -= var9 * var4;
               var4 = 0;
            }

            if((var4 == var0 || var10 >= var8) && (var0 != var4 || var10 <= var9)) {
               var6 -= var4;
               var4 -= var0;
               var0 *= ((int[])((int[])var1[1]))[0];

               while(true) {
                  --var4;
                  if(-1 < ~var4) {
                     if(null != var1 && -6 == ~var1.length && var1[4].equals(Integer.valueOf(0))) {
                        return;
                     } else {
                        while(true) {
                           --var6;
                           if(var6 < 0) {
                              return;
                           }

                           lp.a(-118, var5 >> 16, var3 >> 16, (byte[])((byte[])var1[2]), 0, var0);
                           var3 += var10;
                           var0 += ((int[])((int[])var1[1]))[0];
                           var5 += var9;
                        }
                     }
                  }

                  lp.a(-93, var7 >> 16, var3 >> 16, (byte[])((byte[])var1[2]), 0, var0);
                  var7 += var8;
                  var0 += ((int[])((int[])var1[1]))[0];
                  var3 += var10;
               }
            } else {
               var6 -= var4;
               var4 -= var0;
               var0 = ((int[])((int[])var1[1]))[0] * var0;

               while(true) {
                  --var4;
                  if(var4 < 0) {
                     while(true) {
                        --var6;
                        if(var6 < 0) {
                           if(var1 != null && (20 == var1.length || var1.length == 27 && var1[7].equals(Boolean.valueOf(false)) || 14 == var1.length && var1[13].equals(Boolean.valueOf(false)))) {
                              return;
                           } else {
                              return;
                           }
                        }

                        lp.a(-102, var3 >> 16, var5 >> 16, (byte[])((byte[])var1[2]), 0, var0);
                        var5 += var9;
                        var0 += ((int[])((int[])var1[1]))[0];
                        var3 += var10;
                     }
                  }

                  lp.a(-106, var3 >> 16, var7 >> 16, (byte[])((byte[])var1[2]), 0, var0);
                  var0 += ((int[])((int[])var1[1]))[0];
                  var7 += var8;
                  var3 += var10;
               }
            }
         } else {
            var5 = var7 <<= 16;
            var3 <<= 16;
            if(0 > var0) {
               var7 -= var0 * var8;
               var5 -= var0 * var10;
               var0 = 0;
            }

            if(var6 < 0) {
               var3 -= var6 * var9;
               var6 = 0;
            }

            if((var0 == var6 || var10 >= var8) && (var0 != var6 || var8 >= var9)) {
               if(null != var1 && 2 == var1.length) {
                  sm.a((Object[])null, 103, 72, 6779, -111, 92);
               }

               var4 -= var6;
               var6 -= var0;
               var0 *= ((int[])((int[])var1[1]))[0];

               while(true) {
                  --var6;
                  if(var6 < 0) {
                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        lp.a(-107, var7 >> 16, var3 >> 16, (byte[])((byte[])var1[2]), 0, var0);
                        var3 += var9;
                        var0 += ((int[])((int[])var1[1]))[0];
                        var7 += var8;
                     }
                  }

                  lp.a(-105, var7 >> 16, var5 >> 16, (byte[])((byte[])var1[2]), 0, var0);
                  var5 += var10;
                  var7 += var8;
                  var0 += ((int[])((int[])var1[1]))[0];
               }
            } else {
               var4 -= var6;
               var6 -= var0;
               var0 *= ((int[])((int[])var1[1]))[0];

               while(true) {
                  --var6;
                  if(var6 < 0) {
                     if(var1 != null && 5 == var1.length) {
                        ui.a((int)111, (Object[])null);
                     }

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        lp.a(-102, var3 >> 16, var7 >> 16, (byte[])((byte[])var1[2]), 0, var0);
                        var3 += var9;
                        var7 += var8;
                        var0 += ((int[])((int[])var1[1]))[0];
                     }
                  }

                  lp.a(-125, var5 >> 16, var7 >> 16, (byte[])((byte[])var1[2]), 0, var0);
                  var5 += var10;
                  var0 += ((int[])((int[])var1[1]))[0];
                  var7 += var8;
               }
            }
         }
      } else if(var4 > var6) {
         if(var0 < var4) {
            var5 = var3 <<= 16;
            var7 <<= 16;
            if(var6 < 0) {
               var5 -= var9 * var6;
               var3 -= var10 * var6;
               var6 = 0;
            }

            if(var0 < 0) {
               var7 -= var0 * var8;
               var0 = 0;
            }

            if(var10 > var9) {
               var4 -= var0;
               var0 -= var6;
               var6 *= ((int[])((int[])var1[1]))[0];
               if(null == var1 || -9 != ~var1.length) {
                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        while(true) {
                           --var4;
                           if(-1 < ~var4) {
                              return;
                           }

                           lp.a(-107, var5 >> 16, var7 >> 16, (byte[])((byte[])var1[2]), 0, var6);
                           var7 += var8;
                           var5 += var9;
                           var6 += ((int[])((int[])var1[1]))[0];
                        }
                     }

                     lp.a(-111, var5 >> 16, var3 >> 16, (byte[])((byte[])var1[2]), 0, var6);
                     var5 += var9;
                     var6 += ((int[])((int[])var1[1]))[0];
                     var3 += var10;
                  }
               }
            } else {
               var4 -= var0;
               var0 -= var6;
               var6 = ((int[])((int[])var1[1]))[0] * var6;

               while(true) {
                  --var0;
                  if(var0 < 0) {
                     while(true) {
                        --var4;
                        if(0 > var4) {
                           if(null != var1 && (2 == var1.length || -8 == ~var1.length)) {
                              lp.a(-128, -77, 6, (byte[])null, 103, -56);
                           }

                           return;
                        }

                        lp.a(-103, var7 >> 16, var5 >> 16, (byte[])((byte[])var1[2]), 0, var6);
                        var6 += ((int[])((int[])var1[1]))[0];
                        var5 += var9;
                        var7 += var8;
                     }
                  }

                  lp.a(-119, var3 >> 16, var5 >> 16, (byte[])((byte[])var1[2]), 0, var6);
                  var3 += var10;
                  var6 += ((int[])((int[])var1[1]))[0];
                  var5 += var9;
               }
            }
         } else {
            var7 = var3 <<= 16;
            if(0 > var6) {
               var7 -= var9 * var6;
               var3 -= var10 * var6;
               var6 = 0;
            }

            var5 <<= 16;
            if(0 > var4) {
               var5 -= var4 * var8;
               var4 = 0;
            }

            if(var9 < var10) {
               var0 -= var4;
               var4 -= var6;
               var6 *= ((int[])((int[])var1[1]))[0];

               while(true) {
                  --var4;
                  if(-1 < ~var4) {
                     while(true) {
                        --var0;
                        if(-1 < ~var0) {
                           return;
                        }

                        lp.a(-110, var5 >> 16, var3 >> 16, (byte[])((byte[])var1[2]), 0, var6);
                        var5 += var8;
                        var6 += ((int[])((int[])var1[1]))[0];
                        var3 += var10;
                     }
                  }

                  lp.a(-99, var7 >> 16, var3 >> 16, (byte[])((byte[])var1[2]), 0, var6);
                  var3 += var10;
                  var7 += var9;
                  var6 += ((int[])((int[])var1[1]))[0];
               }
            } else {
               var0 -= var4;
               if(null == var1 || var1.length != 28 || !var1[3].equals(Boolean.valueOf(false)) || !var1[3].equals(Integer.valueOf(1))) {
                  var4 -= var6;
                  var6 = ((int[])((int[])var1[1]))[0] * var6;

                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        while(true) {
                           --var0;
                           if(var0 < 0) {
                              return;
                           }

                           lp.a(-110, var3 >> 16, var5 >> 16, (byte[])((byte[])var1[2]), 0, var6);
                           var6 += ((int[])((int[])var1[1]))[0];
                           var5 += var8;
                           var3 += var10;
                        }
                     }

                     lp.a(-95, var3 >> 16, var7 >> 16, (byte[])((byte[])var1[2]), 0, var6);
                     var6 += ((int[])((int[])var1[1]))[0];
                     var7 += var9;
                     var3 += var10;
                  }
               }
            }
         }
      } else if(var6 >= var0) {
         var3 = var5 <<= -694650768;
         var7 <<= 16;
         if(0 > var4) {
            var5 -= var4 * var9;
            var3 -= var4 * var8;
            var4 = 0;
         }

         if(0 > var0) {
            var7 -= var0 * var10;
            var0 = 0;
         }

         if(var9 > var8) {
            var6 -= var0;
            var0 -= var4;
            var4 *= ((int[])((int[])var1[1]))[0];
            if(var1 == null || 1 != var1.length) {
               while(true) {
                  --var0;
                  if(0 > var0) {
                     while(true) {
                        --var6;
                        if(var6 < 0) {
                           return;
                        }

                        lp.a(-112, var7 >> 16, var5 >> 16, (byte[])((byte[])var1[2]), 0, var4);
                        var4 += ((int[])((int[])var1[1]))[0];
                        var7 += var10;
                        var5 += var9;
                     }
                  }

                  lp.a(-101, var3 >> 16, var5 >> 16, (byte[])((byte[])var1[2]), 0, var4);
                  var5 += var9;
                  var4 += ((int[])((int[])var1[1]))[0];
                  var3 += var8;
               }
            }
         } else {
            var6 -= var0;
            var0 -= var4;
            var4 *= ((int[])((int[])var1[1]))[0];
            if(null == var1 || 2 != var1.length) {
               while(true) {
                  --var0;
                  if(var0 < 0) {
                     while(true) {
                        --var6;
                        if(-1 < ~var6) {
                           return;
                        }

                        lp.a(-100, var5 >> 16, var7 >> 16, (byte[])((byte[])var1[2]), 0, var4);
                        var5 += var9;
                        var7 += var10;
                        var4 += ((int[])((int[])var1[1]))[0];
                     }
                  }

                  lp.a(-96, var5 >> 16, var3 >> 16, (byte[])((byte[])var1[2]), 0, var4);
                  var5 += var9;
                  var4 += ((int[])((int[])var1[1]))[0];
                  var3 += var8;
               }
            }
         }
      } else {
         var7 = var5 <<= 16;
         if(var4 < 0) {
            var7 -= var8 * var4;
            var5 -= var4 * var9;
            var4 = 0;
         }

         var3 <<= 16;
         if(var6 < 0) {
            var3 -= var6 * var10;
            var6 = 0;
         }

         if((var4 == var6 || var8 >= var9) && (var4 != var6 || var10 >= var8)) {
            if(var1 != null && (-6 == ~var1.length && var1[4].equals(Integer.valueOf(2)) && var1[4].equals(Boolean.valueOf(false)) || var1.length == 41 && var1[7].equals(Integer.valueOf(1)))) {
               ui.a((int)114, (Object[])null);
            }

            var0 -= var6;
            var6 -= var4;
            var4 = ((int[])((int[])var1[1]))[0] * var4;

            while(true) {
               --var6;
               if(-1 < ~var6) {
                  while(true) {
                     --var0;
                     if(0 > var0) {
                        return;
                     }

                     lp.a(-106, var3 >> 16, var7 >> 16, (byte[])((byte[])var1[2]), 0, var4);
                     var4 += ((int[])((int[])var1[1]))[0];
                     var7 += var8;
                     var3 += var10;
                  }
               }

               lp.a(-118, var5 >> 16, var7 >> 16, (byte[])((byte[])var1[2]), 0, var4);
               var7 += var8;
               var4 += ((int[])((int[])var1[1]))[0];
               var5 += var9;
            }
         } else {
            var0 -= var6;
            var6 -= var4;
            var4 *= ((int[])((int[])var1[1]))[0];
            if(var1 == null || (var1.length != 9 || !var1[3].equals(Integer.valueOf(0))) && (16 != var1.length || !var1[8].equals(Boolean.valueOf(false)) || !var1[8].equals(Boolean.valueOf(false))) && -18 != ~var1.length) {
               while(true) {
                  --var6;
                  if(var6 < 0) {
                     while(true) {
                        --var0;
                        if(-1 < ~var0) {
                           return;
                        }

                        lp.a(-125, var7 >> 16, var3 >> 16, (byte[])((byte[])var1[2]), 0, var4);
                        var3 += var10;
                        var7 += var8;
                        var4 += ((int[])((int[])var1[1]))[0];
                     }
                  }

                  lp.a(-106, var7 >> 16, var5 >> 16, (byte[])((byte[])var1[2]), 0, var4);
                  var4 += ((int[])((int[])var1[1]))[0];
                  var5 += var9;
                  var7 += var8;
               }
            }
         }
      }
   }

   static final void a(Object[] var0, int var1, int var2) {
      ++b;
      ((int[])((int[])var0[var1]))[0] = var2;
      synchronized(var0[4]) {
         dq.a(-90, (Object[])((Object[])var0[4]));
      }

      synchronized(var0[7]) {
         dq.a(var1 ^ 84, (Object[])((Object[])var0[7]));
      }
   }

   static final int a(int[] var0, int var1, int var2, int[] var3, int var4, Object[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13, int var14) {
      ++g;

      int var16;
      for(int var15 = 0; 128 > var15; ++var15) {
         if(null != var5 && (var5.length == 23 || 10 == var5.length)) {
            nm.a(-87, (byte)105, -61, -70, 101, -47, -69, 40, -113, -73, (Object[])null);
         }

         for(var16 = 0; var16 < 128; ++var16) {
            kda.c[var15][var16] = 0;
            woa.C[var15][var16] = 99999999;
         }
      }

      boolean var30;
      if(1 != var9) {
         if(var9 == 2) {
            var30 = hq.a(var7, var12, var1, var10, var4, var14, var2, -115, var5, var8, var11);
         } else {
            var30 = rla.a(var9, var4, var6 ^ -122, var5, var2, var8, var11, var14, var1, var10, var7, var12);
         }
      } else {
         var30 = nm.a(var7, (byte)-75, var11, var2, var1, var4, var8, var12, var10, var14, var5);
      }

      var16 = -64 + var14;
      int var17 = var4 - 64;
      if(var6 != -1) {
         return ((int[])((int[])j[14]))[27];
      } else {
         int var18 = cd.p;
         int var19 = jea.j;
         int var21;
         int var20;
         int var23;
         if(!var30) {
            if(!var13) {
               return -1;
            }

            var20 = Integer.MAX_VALUE;
            var21 = Integer.MAX_VALUE;
            if(null != var5 && 19 == var5.length) {
               a((int[])null, 38, -13, (int[])null, 93, (Object[])null, -1, -71, 31, -106, 83, 37, -111, true, 6);
            }

            byte var22 = 10;

            for(var23 = -var22 + var1; var22 + var1 >= var23; ++var23) {
               if(var5 != null && var5.length == 1) {
                  rla.a(60, 32, 121, new Object[8][], -51, -111, -114, 109, 51, -44, 4, -63);
               }

               for(int var24 = var2 - var22; var22 + var2 >= var24; ++var24) {
                  int var25 = -var16 + var23;
                  int var26 = -var17 + var24;
                  if(var25 >= 0 && 0 <= var26 && var25 < 128 && 128 > var26 && woa.C[var25][var26] < 100) {
                     int var27 = 0;
                     if(var23 >= var1) {
                        if(var23 > var1 - (-var7 + 1)) {
                           var27 = var23 - var1 + -var7 + 1;
                        }
                     } else {
                        var27 = -var23 + var1;
                     }

                     int var28 = 0;
                     if(var24 < var2) {
                        var28 = -var24 + var2;
                     } else if(-1 + var10 + var2 < var24) {
                        var28 = -var2 - var10 + 1 + var24;
                     }

                     int var29 = var27 * var27 + var28 * var28;
                     if(var20 > var29 || var20 == var29 && var21 > woa.C[var25][var26]) {
                        var21 = woa.C[var25][var26];
                        var18 = var23;
                        var19 = var24;
                        var20 = var29;
                     }
                  }
               }
            }

            if(Integer.MAX_VALUE == var20) {
               return -1;
            }
         }

         if(var18 == var14 && var4 == var19) {
            return 0;
         } else {
            byte var31 = 0;
            qd.a[var31] = var18;
            var20 = var31 + 1;
            oua.g[var31] = var19;
            if(var5 != null && -6 == ~var5.length && var5[0].equals(Integer.valueOf(2)) && var5[0].equals(Integer.valueOf(2))) {
               a((int[])null, 122, -114, (int[])null, -96, (Object[])null, -1, 111, -21, -63, -40, -82, -38, false, 19);
            }

            int var32;
            for(var21 = var32 = kda.c[-var16 + var18][var19 - var17]; var18 != var14 || var4 != var19; var21 = kda.c[-var16 + var18][-var17 + var19]) {
               if(var21 != var32) {
                  qd.a[var20] = var18;
                  var32 = var21;
                  oua.g[var20++] = var19;
               }

               if((var21 & 2) == 0) {
                  if(0 != (var21 & 8)) {
                     --var18;
                  }
               } else {
                  ++var18;
               }

               if(0 != (var21 & 1)) {
                  ++var19;
               } else if(0 != (4 & var21)) {
                  --var19;
               }
            }

            var23 = 0;

            while(-1 > ~(var20--)) {
               var0[var23] = qd.a[var20];
               var3[var23++] = oua.g[var20];
               if(~var23 <= ~var0.length) {
                  break;
               }
            }

            return var23;
         }
      }
   }

   static final String a(byte var0, Object[] var1) {
      ++e;
      byte[] var10000 = (byte[])((byte[])var1[2]);
      int[] var10001 = (int[])((int[])var1[1]);
      int var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      byte var2 = var10000[var10004];
      if(var2 != 0) {
         throw new IllegalStateException("");
      } else {
         if(var1 != null && var1.length == 7) {
            jta.a((byte)-114, (byte[])null, (Object[])null);
         }

         int var3 = ((int[])((int[])var1[1]))[0];

         do {
            var10000 = (byte[])((byte[])var1[2]);
            var10001 = (int[])((int[])var1[1]);
            var10004 = ((int[])((int[])var1[1]))[0];
            var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
         } while(var10000[var10004] != 0);

         int var5 = 44 % ((var0 - 28) / 48);
         int var4 = -1 + ((int[])((int[])var1[1]))[0] + -var3;
         return 0 != var4?bta.a(var3, (byte)-112, (byte[])((byte[])var1[2]), var4):"";
      }
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, byte var3, int var4) throws IOException {
      if(var3 != -100) {
         a((Object[])null, (byte)54);
      }

      ++a;
      if(null == var1[1]) {
         var1[1] = new int[2];
      }

      if(var1[4] == null) {
         var1[4] = new long[6];
      }

      ((int[])((int[])var1[1]))[0] = 0;
      ((long[])((long[])var1[4]))[1] = -1L;
      ((long[])((long[])var1[4]))[5] = -1L;
      var1[2] = var2;
      ((long[])((long[])var1[4]))[3] = ((long[])((long[])var1[4]))[2] = oca.a(true, var2);
      var1[3] = new byte[var4];
      var1[0] = new byte[var0];
      ((long[])((long[])var1[4]))[4] = 0L;
      return var1;
   }

   static final void a(Object[] var0, byte var1) {
      if(var0[0] == null) {
         var0[0] = new short[1];
      }

      if(null == var0[1]) {
         var0[1] = new byte[2];
      }

      if(var1 >= -35) {
         ((long[])((long[])((Object[])((Object[])j[5]))[14]))[15] = -17L;
      }

      ++h;
   }

}
