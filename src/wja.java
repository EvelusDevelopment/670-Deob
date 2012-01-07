
final class wja {

   private static Object[] a = sf.a(new Object[18], 13);


   private static final void e(Object[] var0) {
      ((int[])((int[])var0[1]))[4] = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if(((boolean[])((boolean[])var0[2]))[var1]) {
            ((byte[])((byte[])var0[7]))[((int[])((int[])var0[1]))[4]] = (byte)var1;
            ++((int[])((int[])var0[1]))[4];
         }
      }

   }

   private static final void c(Object[] var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      ((int[])((int[])var0[1]))[5] = 1;
      if(oa.e == null) {
         oa.e = new int[((int[])((int[])var0[1]))[5] * 100000];
      }

      boolean var26 = true;

      while(var26) {
         byte var1 = d(var0);
         if(var1 == 23) {
            return;
         }

         var1 = d(var0);
         var1 = d(var0);
         var1 = d(var0);
         var1 = d(var0);
         var1 = d(var0);
         var1 = d(var0);
         var1 = d(var0);
         var1 = d(var0);
         var1 = d(var0);
         var1 = a(var0);
         if(var1 != 0) {
            ;
         }

         ((int[])((int[])var0[1]))[7] = 0;
         var1 = d(var0);
         ((int[])((int[])var0[1]))[7] = ((int[])((int[])var0[1]))[7] << 8 | var1 & 255;
         var1 = d(var0);
         ((int[])((int[])var0[1]))[7] = ((int[])((int[])var0[1]))[7] << 8 | var1 & 255;
         var1 = d(var0);
         ((int[])((int[])var0[1]))[7] = ((int[])((int[])var0[1]))[7] << 8 | var1 & 255;

         int var35;
         for(var35 = 0; var35 < 16; ++var35) {
            var1 = a(var0);
            if(var1 == 1) {
               ((boolean[])((boolean[])var0[3]))[var35] = true;
            } else {
               ((boolean[])((boolean[])var0[3]))[var35] = false;
            }
         }

         for(var35 = 0; var35 < 256; ++var35) {
            ((boolean[])((boolean[])var0[2]))[var35] = false;
         }

         int var36;
         for(var35 = 0; var35 < 16; ++var35) {
            if(((boolean[])((boolean[])var0[3]))[var35]) {
               for(var36 = 0; var36 < 16; ++var36) {
                  var1 = a(var0);
                  if(var1 == 1) {
                     ((boolean[])((boolean[])var0[2]))[var35 * 16 + var36] = true;
                  }
               }
            }
         }

         e(var0);
         int var38 = ((int[])((int[])var0[1]))[4] + 2;
         int var39 = a(3, var0);
         int var40 = a(15, var0);
         var35 = 0;

         while(var35 < var40) {
            var36 = 0;

            while(true) {
               var1 = a(var0);
               if(var1 == 0) {
                  ((byte[])((byte[])var0[11]))[var35] = (byte)var36;
                  ++var35;
                  break;
               }

               ++var36;
            }
         }

         byte[] var27 = new byte[6];

         byte var29;
         for(var29 = 0; var29 < var39; var27[var29] = var29++) {
            ;
         }

         for(var35 = 0; var35 < var40; ++var35) {
            var29 = ((byte[])((byte[])var0[11]))[var35];

            byte var28;
            for(var28 = var27[var29]; var29 > 0; --var29) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            ((byte[])((byte[])var0[9]))[var35] = var28;
         }

         int var37;
         for(var37 = 0; var37 < var39; ++var37) {
            int var49 = a(5, var0);
            var35 = 0;

            while(var35 < var38) {
               while(true) {
                  var1 = a(var0);
                  if(var1 == 0) {
                     ((byte[][])((byte[][])var0[14]))[var37][var35] = (byte)var49;
                     ++var35;
                     break;
                  }

                  var1 = a(var0);
                  if(var1 == 0) {
                     ++var49;
                  } else {
                     --var49;
                  }
               }
            }
         }

         for(var37 = 0; var37 < var39; ++var37) {
            byte var2 = 32;
            byte var3 = 0;

            for(var35 = 0; var35 < var38; ++var35) {
               if(((byte[][])((byte[][])var0[14]))[var37][var35] > var3) {
                  var3 = ((byte[][])((byte[][])var0[14]))[var37][var35];
               }

               if(((byte[][])((byte[][])var0[14]))[var37][var35] < var2) {
                  var2 = ((byte[][])((byte[][])var0[14]))[var37][var35];
               }
            }

            a(((int[][])((int[][])var0[12]))[var37], ((int[][])((int[][])var0[8]))[var37], ((int[][])((int[][])var0[15]))[var37], ((byte[][])((byte[][])var0[14]))[var37], var2, var3, var38);
            ((int[])((int[])var0[6]))[var37] = var2;
         }

         int var42 = ((int[])((int[])var0[1]))[4] + 1;
         int var41 = -1;
         byte var43 = 0;

         for(var35 = 0; var35 <= 255; ++var35) {
            ((int[])((int[])var0[10]))[var35] = 0;
         }

         int var56 = 4095;

         int var55;
         int var54;
         for(var55 = 15; var55 >= 0; --var55) {
            for(var54 = 15; var54 >= 0; --var54) {
               ((byte[])((byte[])var0[0]))[var56] = (byte)(var55 * 16 + var54);
               --var56;
            }

            ((int[])((int[])var0[5]))[var55] = var56 + 1;
         }

         int var47 = 0;
         byte var53;
         if(var43 == 0) {
            ++var41;
            var43 = 50;
            var53 = ((byte[])((byte[])var0[9]))[var41];
            var22 = ((int[])((int[])var0[6]))[var53];
            var23 = ((int[][])((int[][])var0[12]))[var53];
            var25 = ((int[][])((int[][])var0[15]))[var53];
            var24 = ((int[][])((int[][])var0[8]))[var53];
         }

         int var45 = var43 - 1;
         int var51 = var22;

         int var50;
         byte var52;
         for(var50 = a(var22, var0); var50 > var23[var51]; var50 = var50 << 1 | var52) {
            ++var51;
            var52 = a(var0);
         }

         int var44 = var25[var50 - var24[var51]];

         while(var44 != var42) {
            if(var44 != 0 && var44 != 1) {
               int var33 = var44 - 1;
               int var30;
               if(var33 < 16) {
                  var30 = ((int[])((int[])var0[5]))[0];

                  for(var1 = ((byte[])((byte[])var0[0]))[var30 + var33]; var33 > 3; var33 -= 4) {
                     int var34 = var30 + var33;
                     ((byte[])((byte[])var0[0]))[var34] = ((byte[])((byte[])var0[0]))[var34 - 1];
                     ((byte[])((byte[])var0[0]))[var34 - 1] = ((byte[])((byte[])var0[0]))[var34 - 2];
                     ((byte[])((byte[])var0[0]))[var34 - 2] = ((byte[])((byte[])var0[0]))[var34 - 3];
                     ((byte[])((byte[])var0[0]))[var34 - 3] = ((byte[])((byte[])var0[0]))[var34 - 4];
                  }

                  while(var33 > 0) {
                     ((byte[])((byte[])var0[0]))[var30 + var33] = ((byte[])((byte[])var0[0]))[var30 + var33 - 1];
                     --var33;
                  }

                  ((byte[])((byte[])var0[0]))[var30] = var1;
               } else {
                  int var31 = var33 / 16;
                  int var32 = var33 % 16;
                  var30 = ((int[])((int[])var0[5]))[var31] + var32;

                  for(var1 = ((byte[])((byte[])var0[0]))[var30]; var30 > ((int[])((int[])var0[5]))[var31]; --var30) {
                     ((byte[])((byte[])var0[0]))[var30] = ((byte[])((byte[])var0[0]))[var30 - 1];
                  }

                  ++((int[])((int[])var0[5]))[var31];

                  while(var31 > 0) {
                     --((int[])((int[])var0[5]))[var31];
                     ((byte[])((byte[])var0[0]))[((int[])((int[])var0[5]))[var31]] = ((byte[])((byte[])var0[0]))[((int[])((int[])var0[5]))[var31 - 1] + 16 - 1];
                     --var31;
                  }

                  --((int[])((int[])var0[5]))[0];
                  ((byte[])((byte[])var0[0]))[((int[])((int[])var0[5]))[0]] = var1;
                  if(((int[])((int[])var0[5]))[0] == 0) {
                     var56 = 4095;

                     for(var55 = 15; var55 >= 0; --var55) {
                        for(var54 = 15; var54 >= 0; --var54) {
                           ((byte[])((byte[])var0[0]))[var56] = ((byte[])((byte[])var0[0]))[((int[])((int[])var0[5]))[var55] + var54];
                           --var56;
                        }

                        ((int[])((int[])var0[5]))[var55] = var56 + 1;
                     }
                  }
               }

               ++((int[])((int[])var0[10]))[((byte[])((byte[])var0[7]))[var1 & 255] & 255];
               oa.e[var47] = ((byte[])((byte[])var0[7]))[var1 & 255] & 255;
               ++var47;
               if(var45 == 0) {
                  ++var41;
                  var45 = 50;
                  var53 = ((byte[])((byte[])var0[9]))[var41];
                  var22 = ((int[])((int[])var0[6]))[var53];
                  var23 = ((int[][])((int[][])var0[12]))[var53];
                  var25 = ((int[][])((int[][])var0[15]))[var53];
                  var24 = ((int[][])((int[][])var0[8]))[var53];
               }

               --var45;
               var51 = var22;

               for(var50 = a(var22, var0); var50 > var23[var51]; var50 = var50 << 1 | var52) {
                  ++var51;
                  var52 = a(var0);
               }

               var44 = var25[var50 - var24[var51]];
            } else {
               int var46 = -1;
               int var48 = 1;

               do {
                  if(var44 == 0) {
                     var46 += 1 * var48;
                  } else if(var44 == 1) {
                     var46 += 2 * var48;
                  }

                  var48 *= 2;
                  if(var45 == 0) {
                     ++var41;
                     var45 = 50;
                     var53 = ((byte[])((byte[])var0[9]))[var41];
                     var22 = ((int[])((int[])var0[6]))[var53];
                     var23 = ((int[][])((int[][])var0[12]))[var53];
                     var25 = ((int[][])((int[][])var0[15]))[var53];
                     var24 = ((int[][])((int[][])var0[8]))[var53];
                  }

                  --var45;
                  var51 = var22;

                  for(var50 = a(var22, var0); var50 > var23[var51]; var50 = var50 << 1 | var52) {
                     ++var51;
                     var52 = a(var0);
                  }

                  var44 = var25[var50 - var24[var51]];
               } while(var44 == 0 || var44 == 1);

               ++var46;
               var1 = ((byte[])((byte[])var0[7]))[((byte[])((byte[])var0[0]))[((int[])((int[])var0[5]))[0]] & 255];

               for(((int[])((int[])var0[10]))[var1 & 255] += var46; var46 > 0; --var46) {
                  oa.e[var47] = var1 & 255;
                  ++var47;
               }
            }
         }

         ((int[])((int[])var0[1]))[10] = 0;
         ((byte[])((byte[])var0[13]))[0] = 0;
         ((int[])((int[])var0[16]))[0] = 0;

         for(var35 = 1; var35 <= 256; ++var35) {
            ((int[])((int[])var0[16]))[var35] = ((int[])((int[])var0[10]))[var35 - 1];
         }

         for(var35 = 1; var35 <= 256; ++var35) {
            ((int[])((int[])var0[16]))[var35] += ((int[])((int[])var0[16]))[var35 - 1];
         }

         for(var35 = 0; var35 < var47; ++var35) {
            var1 = (byte)(oa.e[var35] & 255);
            oa.e[((int[])((int[])var0[16]))[var1 & 255]] |= var35 << 8;
            ++((int[])((int[])var0[16]))[var1 & 255];
         }

         ((int[])((int[])var0[1]))[13] = oa.e[((int[])((int[])var0[1]))[7]] >> 8;
         ((int[])((int[])var0[1]))[11] = 0;
         ((int[])((int[])var0[1]))[13] = oa.e[((int[])((int[])var0[1]))[13]];
         ((int[])((int[])var0[1]))[9] = (byte)(((int[])((int[])var0[1]))[13] & 255);
         ((int[])((int[])var0[1]))[13] >>= 8;
         ++((int[])((int[])var0[1]))[11];
         ((int[])((int[])var0[1]))[0] = var47;
         b(var0);
         if(((int[])((int[])var0[1]))[11] == ((int[])((int[])var0[1]))[0] + 1 && ((int[])((int[])var0[1]))[10] == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }

   }

   private static final int a(int var0, Object[] var1) {
      while(((int[])((int[])var1[1]))[8] < var0) {
         ((int[])((int[])var1[1]))[14] = ((int[])((int[])var1[1]))[14] << 8 | ((byte[])((byte[])var1[4]))[((int[])((int[])var1[1]))[1]] & 255;
         ((int[])((int[])var1[1]))[8] += 8;
         ++((int[])((int[])var1[1]))[1];
         ++((int[])((int[])var1[1]))[2];
         if(((int[])((int[])var1[1]))[2] == 0) {
            ;
         }
      }

      int var2 = ((int[])((int[])var1[1]))[14] >> ((int[])((int[])var1[1]))[8] - var0 & (1 << var0) - 1;
      ((int[])((int[])var1[1]))[8] -= var0;
      return var2;
   }

   private static final void b(Object[] var0) {
      byte var2 = ((byte[])((byte[])var0[13]))[0];
      int var3 = ((int[])((int[])var0[1]))[10];
      int var4 = ((int[])((int[])var0[1]))[11];
      int var5 = ((int[])((int[])var0[1]))[9];
      int[] var6 = oa.e;
      int var7 = ((int[])((int[])var0[1]))[13];
      byte[] var8 = (byte[])((byte[])var0[17]);
      int var9 = ((int[])((int[])var0[1]))[6];
      int var10 = ((int[])((int[])var0[1]))[3];
      int var12 = ((int[])((int[])var0[1]))[0] + 1;

      label63:
      while(true) {
         if(var3 > 0) {
            while(true) {
               if(var10 == 0) {
                  break label63;
               }

               if(var3 == 1) {
                  if(var10 == 0) {
                     var3 = 1;
                     break label63;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         while(var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            ++var4;
            if(var1 != var5) {
               var5 = var1;
               if(var10 == 0) {
                  var3 = 1;
                  break label63;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            } else {
               if(var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  ++var4;
                  if(var4 != var12) {
                     if(var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        ++var4;
                        if(var4 != var12) {
                           if(var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                           }
                        }
                     }
                  }
                  continue label63;
               }

               if(var10 == 0) {
                  var3 = 1;
                  break label63;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = ((int[])((int[])var0[1]))[12];
      ((int[])((int[])var0[1]))[12] += var10 - var10;
      if(((int[])((int[])var0[1]))[12] < var13) {
         ;
      }

      ((byte[])((byte[])var0[13]))[0] = var2;
      ((int[])((int[])var0[1]))[10] = var3;
      ((int[])((int[])var0[1]))[11] = var4;
      ((int[])((int[])var0[1]))[9] = var5;
      oa.e = var6;
      ((int[])((int[])var0[1]))[13] = var7;
      var0[17] = var8;
      ((int[])((int[])var0[1]))[6] = var9;
      ((int[])((int[])var0[1]))[3] = var10;
   }

   private static final byte d(Object[] var0) {
      return (byte)a(8, var0);
   }

   static final int a(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      Object[] var5 = a;
      synchronized(a) {
         a[4] = var2;
         ((int[])((int[])a[1]))[1] = var4;
         a[17] = var0;
         ((int[])((int[])a[1]))[6] = 0;
         ((int[])((int[])a[1]))[3] = var1;
         ((int[])((int[])a[1]))[8] = 0;
         ((int[])((int[])a[1]))[14] = 0;
         ((int[])((int[])a[1]))[2] = 0;
         ((int[])((int[])a[1]))[12] = 0;
         c(a);
         var1 -= ((int[])((int[])a[1]))[3];
         a[4] = null;
         a[17] = null;
         return var1;
      }
   }

   private static final void a(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if(var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }

   private static final byte a(Object[] var0) {
      return (byte)a(1, var0);
   }

}
