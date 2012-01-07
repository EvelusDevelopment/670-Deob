import java.awt.Canvas;

final class ui {

   static int b;
   static boolean c = false;
   static int f;
   static int e;
   static int d;
   static Object[] a;


   static final boolean p(Object[] var0) {
      return true;
   }

   static final void l(Object[] var0, int var1) {}

   static final void g(int var0, int var1, float var2, int var3, int var4, int var5, int var6, int var7, int var8, Object[] var9) {
      if(var3 != 0 && var4 != 0) {
         if(var5 != '\uffff') {
            Object[] var10 = ((ta)var9[6]).k.a(var5, (byte)95);
            if(!((boolean[])((boolean[])var10[3]))[7]) {
               if(((int[])((int[])var9[1]))[14] != var5) {
                  cga var11 = (cga)dna.a((byte)34, (Object[])((Object[])var9[0]), (long)var5);
                  if(var11 == null) {
                     int[] var12 = n(var9, var5);
                     if(var12 == null) {
                        return;
                     }

                     int var13 = b(var9, var5)?64:((int[])((int[])var9[1]))[8];
                     var11 = ((ta)var9[6]).a(var13, -7343, 0, var12, var13, var13);
                     il.a((long)var5, var11, true, (Object[])((Object[])var9[0]));
                  }

                  ((int[])((int[])var9[1]))[14] = var5;
                  var9[9] = var11;
               }

               ((ap)var9[9]).e(var0 - var3, var1 - var4, var2, var3 << 1, var4 << 1, var7, var6, var8, 1, ((int[])((int[])var10[1]))[0] != 2);
               return;
            }
         }

         b(var0, var1, var2, var3, var6, var8, var9);
      }
   }

   static final void a(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9) {
      if(var0[7] != null) {
         if(var3 > 0 && var4 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (var8 << 16) / var3;
            int var13 = (var7.length / var8 << 16) / var4;
            int var14 = var1 + var2 * ((int[])((int[])var0[1]))[4];
            if(var0 != null && var0.length == 5 && var0[2].equals(Integer.valueOf(1)) && var0[2].equals(Integer.valueOf(1))) {
               x((Object[])null);
            }

            int var15 = ((int[])((int[])var0[1]))[4] - var3;
            if(var2 + var4 > ((int[])((int[])var0[1]))[1]) {
               var4 -= var2 + var4 - ((int[])((int[])var0[1]))[1];
            }

            int var16;
            if(var2 < ((int[])((int[])var0[1]))[16]) {
               var16 = ((int[])((int[])var0[1]))[16] - var2;
               var4 -= var16;
               var14 += var16 * ((int[])((int[])var0[1]))[4];
               var11 += var13 * var16;
            }

            if(var1 + var3 > ((int[])((int[])var0[1]))[19]) {
               var16 = var1 + var3 - ((int[])((int[])var0[1]))[19];
               var3 -= var16;
               var15 += var16;
            }

            if(var1 < ((int[])((int[])var0[1]))[7]) {
               var16 = ((int[])((int[])var0[1]))[7] - var1;
               var3 -= var16;
               var14 += var16;
               var10 += var12 * var16;
               var15 += var16;
            }

            var16 = var5 >>> 24;
            int var17 = var6 >>> 24;
            int var19;
            int var18;
            int var21;
            int var20;
            if(var9 != 0 && (var9 != 1 || var16 != 255 || var17 != 255)) {
               int var23;
               int var22;
               int var25;
               int var24;
               if(var9 == 1) {
                  var18 = var10;

                  for(var19 = -var4; var19 < 0; ++var19) {
                     if(var0 != null && var0.length == 10) {
                        f((Object[])null);
                     }

                     var20 = (var11 >> 16) * var8;

                     for(var21 = -var3; var21 < 0; ++var21) {
                        var22 = var5;
                        if(var7[(var10 >> 16) + var20] != 0) {
                           var22 = var6;
                        }

                        var23 = var22 >>> 24;
                        var24 = 255 - var23;
                        var25 = ((int[])((int[])var0[7]))[var14];
                        ((int[])((int[])var0[7]))[var14++] = ((var22 & 16711935) * var23 + (var25 & 16711935) * var24 & -16711936) + ((var22 & '\uff00') * var23 + (var25 & '\uff00') * var24 & 16711680) >> 8;
                        var10 += var12;
                     }

                     var11 += var13;
                     var10 = var18;
                     var14 += var15;
                  }
               } else {
                  if(var9 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var0 != null && (var0.length == 10 || var0.length == 25 && var0[7].equals(Integer.valueOf(2)))) {
                     w((Object[])null);
                  }

                  var18 = var10;

                  for(var19 = -var4; var19 < 0; ++var19) {
                     if(var0 != null && (var0.length == 10 || var0.length == 9 || var0.length == 8)) {
                        return;
                     }

                     var20 = (var11 >> 16) * var8;

                     for(var21 = -var3; var21 < 0; ++var21) {
                        var22 = var5;
                        if(var7[(var10 >> 16) + var20] != 0) {
                           var22 = var6;
                        }

                        if(var22 != 0) {
                           var23 = ((int[])((int[])var0[7]))[var14];
                           var24 = var22 + var23;
                           var25 = (var22 & 16711935) + (var23 & 16711935);
                           var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                           ((int[])((int[])var0[7]))[var14++] = var24 - var23 | var23 - (var23 >>> 8);
                        } else {
                           ++var14;
                        }

                        var10 += var12;
                     }

                     var11 += var13;
                     var10 = var18;
                     var14 += var15;
                  }
               }
            } else {
               var18 = var10;
               if(var0 != null && var0.length == 3 && var0[2].equals(Integer.valueOf(2))) {
                  return;
               }

               for(var19 = -var4; var19 < 0; ++var19) {
                  var20 = (var11 >> 16) * var8;

                  for(var21 = -var3; var21 < 0; ++var21) {
                     if(var7[(var10 >> 16) + var20] != 0) {
                        ((int[])((int[])var0[7]))[var14++] = var6;
                     } else {
                        ((int[])((int[])var0[7]))[var14++] = var5;
                     }

                     var10 += var12;
                  }

                  var11 += var13;
                  var10 = var18;
                  var14 += var15;
               }
            }

         }
      }
   }

   static final void a(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9) {
      if(var0[7] != null) {
         bk var10;
         Object[] var11 = (var10 = (bk)var7) == null?null:var10.f_l;
         if(var11 == null || var11.length != 18) {
            int[] var12 = (int[])((int[])var11[0]);
            int[] var13 = (int[])((int[])var11[2]);
            int var14 = ((int[])((int[])var0[1]))[16] > var9?((int[])((int[])var0[1]))[16]:var9;
            int var15 = ((int[])((int[])var0[1]))[1] < var9 + var12.length?((int[])((int[])var0[1]))[1]:var9 + var12.length;
            var3 -= var1;
            var4 -= var2;
            if(var3 + var4 < 0) {
               var1 += var3;
               var3 = -var3;
               var2 += var4;
               var4 = -var4;
            }

            int var17;
            int var16;
            int var19;
            int var18;
            int var21;
            int var20;
            int var23;
            int var22;
            int var24;
            if(var3 > var4) {
               var2 <<= 16;
               var2 += '\u8000';
               var4 <<= 16;
               var16 = (int)Math.floor((double)var4 / (double)var3 + 0.5D);
               var3 += var1;
               if(var1 < ((int[])((int[])var0[1]))[7]) {
                  var2 += var16 * (((int[])((int[])var0[1]))[7] - var1);
                  var1 = ((int[])((int[])var0[1]))[7];
               }

               if(var3 >= ((int[])((int[])var0[1]))[19]) {
                  var3 = ((int[])((int[])var0[1]))[19] - 1;
               }

               var17 = var5 >>> 24;
               if(var6 != 0 && (var6 != 1 || var17 != 255)) {
                  if(var6 == 1) {
                     if(var0 != null && var0.length == 4) {
                        c((Object[])null, (int[])null);
                     }

                     var5 = ((var5 & 16711935) * var17 >> 8 & 16711935) + ((var5 & '\uff00') * var17 >> 8 & '\uff00') + (var17 << 24);

                     for(var18 = 256 - var17; var1 <= var3; ++var1) {
                        var19 = var2 >> 16;
                        var20 = var19 - var9;
                        if(var19 >= var14 && var19 < var15) {
                           var21 = var8 + var12[var20];
                           if(var1 >= var21 && var1 < var21 + var13[var20]) {
                              var22 = var1 + var19 * ((int[])((int[])var0[1]))[4];
                              var23 = ((int[])((int[])var0[7]))[var22];
                              var23 = ((var23 & 16711935) * var18 >> 8 & 16711935) + ((var23 & '\uff00') * var18 >> 8 & '\uff00');
                              ((int[])((int[])var0[7]))[var22] = var5 + var23;
                           }
                        }

                        var2 += var16;
                     }
                  } else {
                     if(var6 != 2) {
                        throw new IllegalArgumentException();
                     }

                     while(var1 <= var3) {
                        var18 = var2 >> 16;
                        var19 = var18 - var9;
                        if(var18 >= var14 && var18 < var15) {
                           var20 = var8 + var12[var19];
                           if(var1 >= var20 && var1 < var20 + var13[var19]) {
                              var21 = var1 + var18 * ((int[])((int[])var0[1]))[4];
                              var22 = ((int[])((int[])var0[7]))[var21];
                              var23 = var5 + var22;
                              var24 = (var5 & 16711935) + (var22 & 16711935);
                              var22 = (var24 & 16777472) + (var23 - var24 & 65536);
                              ((int[])((int[])var0[7]))[var21] = var23 - var22 | var22 - (var22 >>> 8);
                           }
                        }

                        var2 += var16;
                        ++var1;
                     }
                  }
               } else {
                  while(var1 <= var3) {
                     var18 = var2 >> 16;
                     var19 = var18 - var9;
                     if(var18 >= var14 && var18 < var15) {
                        var20 = var8 + var12[var19];
                        if(var1 >= var20 && var1 < var20 + var13[var19]) {
                           ((int[])((int[])var0[7]))[var1 + var18 * ((int[])((int[])var0[1]))[4]] = var5;
                        }
                     }

                     var2 += var16;
                     ++var1;
                  }

                  if(var11 != null && var11.length == 4) {
                     return;
                  }
               }
            } else {
               var1 <<= 16;
               var1 += '\u8000';
               var3 <<= 16;
               var16 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
               var4 += var2;
               if(var2 < var14) {
                  var1 += var16 * (var14 - var2);
                  var2 = var14;
               }

               if(var4 >= var15) {
                  var4 = var15 - 1;
               }

               var17 = var5 >>> 24;
               if(var6 != 0 && (var6 != 1 || var17 != 255)) {
                  if(var6 == 1) {
                     var5 = ((var5 & 16711935) * var17 >> 8 & 16711935) + ((var5 & '\uff00') * var17 >> 8 & '\uff00') + (var17 << 24);
                     if(var11 != null && (var11.length == 6 || var11.length == 2)) {
                        d((Object[])null, 49);
                     }

                     for(var18 = 256 - var17; var2 <= var4; ++var2) {
                        var19 = var1 >> 16;
                        var20 = var2 - var9;
                        var21 = var8 + var12[var20];
                        if(var19 >= ((int[])((int[])var0[1]))[7] && var19 < ((int[])((int[])var0[1]))[19] && var19 >= var21 && var19 < var21 + var13[var20]) {
                           var22 = var19 + var2 * ((int[])((int[])var0[1]))[4];
                           var23 = ((int[])((int[])var0[7]))[var22];
                           var23 = ((var23 & 16711935) * var18 >> 8 & 16711935) + ((var23 & '\uff00') * var18 >> 8 & '\uff00');
                           ((int[])((int[])var0[7]))[var19 + var2 * ((int[])((int[])var0[1]))[4]] = var5 + var23;
                        }

                        var1 += var16;
                     }
                  } else {
                     if(var6 != 2) {
                        throw new IllegalArgumentException();
                     }

                     while(var2 <= var4) {
                        var18 = var1 >> 16;
                        var19 = var2 - var9;
                        var20 = var8 + var12[var19];
                        if(var18 >= ((int[])((int[])var0[1]))[7] && var18 < ((int[])((int[])var0[1]))[19] && var18 >= var20 && var18 < var20 + var13[var19]) {
                           var21 = var18 + var2 * ((int[])((int[])var0[1]))[4];
                           var22 = ((int[])((int[])var0[7]))[var21];
                           var23 = var5 + var22;
                           var24 = (var5 & 16711935) + (var22 & 16711935);
                           var22 = (var24 & 16777472) + (var23 - var24 & 65536);
                           ((int[])((int[])var0[7]))[var21] = var23 - var22 | var22 - (var22 >>> 8);
                        }

                        var1 += var16;
                        ++var2;
                     }

                     if(var0 != null && var0.length == 1) {
                        a((Object[])null, -107, (Object[])null);
                     }
                  }
               } else {
                  if(var0 != null && var0.length == 12) {
                     return;
                  }

                  while(var2 <= var4) {
                     var18 = var1 >> 16;
                     var19 = var2 - var9;
                     var20 = var8 + var12[var19];
                     if(var18 >= ((int[])((int[])var0[1]))[7] && var18 < ((int[])((int[])var0[1]))[19] && var18 >= var20 && var18 < var20 + var13[var19]) {
                        ((int[])((int[])var0[7]))[var18 + var2 * ((int[])((int[])var0[1]))[4]] = var5;
                     }

                     var1 += var16;
                     ++var2;
                  }
               }
            }

         }
      }
   }

   static final re d(Object[] var0, int var1, int var2) {
      Object[] var5 = new Object[3];
      fw.a(var1, var5, new int[var1 * var2], -26481, var2);
      return (re)(var5 == null?null:var5[0]);
   }

   static final void a(byte var0, Object[] var1) {
      if(var0 > -70) {
         a((Object[])((Object[])a[0]), (int[])null);
      }

      if(null == var1[5]) {
         var1[5] = new int[4];
      }

      ++f;
   }

   static final boolean c(Object[] var0) {
      return true;
   }

   static final boolean e(Object[] var0) {
      return false;
   }

   static final bca a(int var0, Object[] var1) {
      if(var0 <= 109) {
         b((Object[])null, 127, 78, -127, 16, 33);
      }

      ++d;
      return new bca(var1);
   }

   private static final void a(vsa var0, int var1, int var2, float var3, int var4, Object[] var5) {
      int var6 = var0.x;
      int var7 = var4;
      var4 <<= 1;
      if(var6 == -1) {
         b(var1, var2, var3, var7, var0.A, 1, var5);
      } else {
         if(((int[])((int[])var5[1]))[14] != var6) {
            cga var8 = (cga)dna.a((byte)34, (Object[])((Object[])var5[0]), (long)var6);
            if(var8 == null) {
               int[] var9 = n(var5, var6);
               if(var9 == null) {
                  return;
               }

               int var10 = b(var5, var6)?64:((int[])((int[])var5[1]))[8];
               var8 = ((ta)var5[6]).a(var10, -7343, 0, var9, var10, var10);
               il.a((long)var6, var8, true, (Object[])((Object[])var5[0]));
            }

            ((int[])((int[])var5[1]))[14] = var6;
            var5[9] = var8;
         }

         ++var4;
         ((ap)var5[9]).b(var1 - var7, var2 - var7, var3, var4, var4, 0, var0.A, 1, 1, false);
      }

   }

   static final void a(Object[] var0, float var1, float var2, float var3, float var4, float var5, float var6) {}

   static final void a(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6, Class_s var7, int var8, int var9, int var10, int var11, int var12) {
      if(var0[7] != null) {
         bk var13;
         Object[] var14 = (var13 = (bk)var7) == null?null:var13.f_l;
         int[] var15 = (int[])((int[])var14[0]);
         int[] var16 = (int[])((int[])var14[2]);
         int var17 = ((int[])((int[])var0[1]))[16] > var9?((int[])((int[])var0[1]))[16]:var9;
         if(var0 != null && (var0.length == 12 || var0.length == 7 || var0.length == 6 && var0[4].equals(Integer.valueOf(1)))) {
            i((Object[])null);
         }

         int var18 = ((int[])((int[])var0[1]))[1] < var9 + var15.length?((int[])((int[])var0[1]))[1]:var9 + var15.length;
         var12 <<= 8;
         var10 <<= 8;
         var11 <<= 8;
         int var19 = var10 + var11;
         var12 %= var19;
         var3 -= var1;
         var4 -= var2;
         int var21;
         int var20;
         if(var3 + var4 < 0) {
            var20 = (int)(Math.sqrt((double)(var3 * var3 + var4 * var4)) * 256.0D);
            var21 = var20 % var19;
            var12 = var19 + var10 - var12 - var21;
            var12 %= var19;
            if(var12 < 0) {
               var12 += var19;
            }

            var1 += var3;
            var3 = -var3;
            var2 += var4;
            var4 = -var4;
         }

         int var23;
         int var22;
         int var25;
         int var24;
         int var27;
         int var26;
         int var28;
         if(var3 > var4) {
            var2 <<= 16;
            var2 += '\u8000';
            var4 <<= 16;
            var20 = (int)Math.floor((double)var4 / (double)var3 + 0.5D);
            var3 += var1;
            var21 = var5 >>> 24;
            var22 = (int)Math.sqrt((double)(65536 + (var20 >> 8) * (var20 >> 8)));
            if(var6 != 0 && (var6 != 1 || var21 != 255)) {
               if(var6 == 1) {
                  var5 = ((var5 & 16711935) * var21 >> 8 & 16711935) + ((var5 & '\uff00') * var21 >> 8 & '\uff00') + (var21 << 24);
                  var23 = 256 - var21;
                  if(var0 != null && var0.length == 2 && var0[0].equals(Integer.valueOf(2))) {
                     return;
                  }

                  while(var1 <= var3) {
                     var24 = var2 >> 16;
                     var25 = var24 - var9;
                     if(var1 >= ((int[])((int[])var0[1]))[7] && var1 < ((int[])((int[])var0[1]))[19] && var24 >= var17 && var24 < var18 && var12 < var10) {
                        var26 = var8 + var15[var25];
                        if(var1 >= var26 && var1 < var26 + var16[var25]) {
                           var27 = var1 + var24 * ((int[])((int[])var0[1]))[4];
                           var28 = ((int[])((int[])var0[7]))[var27];
                           var28 = ((var28 & 16711935) * var23 >> 8 & 16711935) + ((var28 & '\uff00') * var23 >> 8 & '\uff00');
                           ((int[])((int[])var0[7]))[var27] = var5 + var28;
                        }
                     }

                     var2 += var20;
                     ++var1;
                     var12 += var22;
                     var12 %= var19;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  while(var1 <= var3) {
                     var23 = var2 >> 16;
                     var24 = var23 - var9;
                     if(var1 >= ((int[])((int[])var0[1]))[7] && var1 < ((int[])((int[])var0[1]))[19] && var23 >= var17 && var23 < var18 && var12 < var10) {
                        var25 = var8 + var15[var24];
                        if(var1 >= var25 && var1 < var25 + var16[var24]) {
                           var26 = var1 + var23 * ((int[])((int[])var0[1]))[4];
                           var27 = ((int[])((int[])var0[7]))[var26];
                           var28 = var5 + var27;
                           int var29 = (var5 & 16711935) + (var27 & 16711935);
                           var27 = (var29 & 16777472) + (var28 - var29 & 65536);
                           ((int[])((int[])var0[7]))[var26] = var28 - var27 | var27 - (var27 >>> 8);
                        }
                     }

                     var2 += var20;
                     ++var1;
                     var12 += var22;
                     var12 %= var19;
                  }

                  if(var14 != null && var14.length == 4 && var14[1].equals(Integer.valueOf(2)) && var14[1].equals(Integer.valueOf(2))) {
                     g(new Object[4][]);
                  }
               }
            } else {
               if(var0 != null && (var0.length == 9 && var0[3].equals(Integer.valueOf(1)) && var0[3].equals(Integer.valueOf(2)) || var0.length == 7)) {
                  return;
               }

               while(var1 <= var3) {
                  var23 = var2 >> 16;
                  var24 = var23 - var9;
                  if(var1 >= ((int[])((int[])var0[1]))[7] && var1 < ((int[])((int[])var0[1]))[19] && var23 >= var17 && var23 < var18 && var12 < var10) {
                     var25 = var8 + var15[var24];
                     if(var1 >= var25 && var1 < var25 + var16[var24]) {
                        ((int[])((int[])var0[7]))[var1 + var23 * ((int[])((int[])var0[1]))[4]] = var5;
                     }
                  }

                  var2 += var20;
                  ++var1;
                  var12 += var22;
                  var12 %= var19;
               }
            }
         } else {
            var1 <<= 16;
            var1 += '\u8000';
            var3 <<= 16;
            var20 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
            var21 = (int)Math.sqrt((double)(65536 + (var20 >> 8) * (var20 >> 8)));
            var4 += var2;
            var22 = var5 >>> 24;
            if(var6 != 0 && (var6 != 1 || var22 != 255)) {
               if(var6 == 1) {
                  var5 = ((var5 & 16711935) * var22 >> 8 & 16711935) + ((var5 & '\uff00') * var22 >> 8 & '\uff00') + (var22 << 24);
                  var23 = 256 - var22;
                  if(var14 != null && (var14.length == 11 && var14[1].equals(Integer.valueOf(0)) || var14.length == 1)) {
                     d((Object[])null);
                  }

                  while(var2 <= var4) {
                     var24 = var1 >> 16;
                     var25 = var2 - var9;
                     if(var2 >= var17 && var2 < var18 && var24 >= ((int[])((int[])var0[1]))[7] && var24 < ((int[])((int[])var0[1]))[19] && var12 < var10 && var24 >= var8 + var15[var25] && var24 < var8 + var15[var25] + var16[var25]) {
                        var26 = var24 + var2 * ((int[])((int[])var0[1]))[4];
                        var27 = ((int[])((int[])var0[7]))[var26];
                        var27 = ((var27 & 16711935) * var23 >> 8 & 16711935) + ((var27 & '\uff00') * var23 >> 8 & '\uff00');
                        ((int[])((int[])var0[7]))[var24 + var2 * ((int[])((int[])var0[1]))[4]] = var5 + var27;
                     }

                     var1 += var20;
                     ++var2;
                     var12 += var21;
                     var12 %= var19;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var0 != null && var0.length == 2) {
                     a((Object[])null, 0.7680642F, 0.14173535F, 1.01628F, (float[])null);
                  }

                  while(var2 <= var4) {
                     var23 = var1 >> 16;
                     var24 = var2 - var9;
                     if(var2 >= var17 && var2 < var18 && var23 >= ((int[])((int[])var0[1]))[7] && var23 < ((int[])((int[])var0[1]))[19] && var12 < var10 && var23 >= var8 + var15[var24] && var23 < var8 + var15[var24] + var16[var24]) {
                        var25 = var23 + var2 * ((int[])((int[])var0[1]))[4];
                        var26 = ((int[])((int[])var0[7]))[var25];
                        var27 = var5 + var26;
                        var28 = (var5 & 16711935) + (var26 & 16711935);
                        var26 = (var28 & 16777472) + (var27 - var28 & 65536);
                        ((int[])((int[])var0[7]))[var25] = var27 - var26 | var26 - (var26 >>> 8);
                     }

                     var1 += var20;
                     ++var2;
                     var12 += var21;
                     var12 %= var19;
                  }
               }
            } else {
               while(var2 <= var4) {
                  var23 = var1 >> 16;
                  var24 = var2 - var9;
                  if(var2 >= var17 && var2 < var18 && var23 >= ((int[])((int[])var0[1]))[7] && var23 < ((int[])((int[])var0[1]))[19] && var12 < var10 && var23 >= var8 + var15[var24] && var23 < var8 + var15[var24] + var16[var24]) {
                     ((int[])((int[])var0[7]))[var23 + var2 * ((int[])((int[])var0[1]))[4]] = var5;
                  }

                  var1 += var20;
                  ++var2;
                  var12 += var21;
                  var12 %= var19;
               }

               if(var0 != null && (var0.length == 14 || var0.length == 17 && var0[4].equals(Boolean.valueOf(false)))) {
                  h((Object[])null, (Object[])null);
               }
            }
         }

      }
   }

   private static final void a(int var0, int var1, float var2, int var3, int var4, int var5, Object[] var6) {
      if(var6[7] != null) {
         if(var3 < 0) {
            var3 = -var3;
         }

         int var7 = var1 - var3;
         if(var7 < ((int[])((int[])var6[1]))[16]) {
            var7 = ((int[])((int[])var6[1]))[16];
         }

         int var8 = var1 + var3 + 1;
         if(var8 > ((int[])((int[])var6[1]))[1]) {
            var8 = ((int[])((int[])var6[1]))[1];
         }

         int var9 = var7;
         int var10 = var3 * var3;
         int var11 = 0;
         int var12 = var1 - var7;
         int var13 = var12 * var12;
         int var14 = var13 - var12;
         if(var1 > var8) {
            var1 = var8;
         }

         int var15 = var4 >>> 24;
         if(var6 != null && (var6.length == 1 && var6[0].equals(Integer.valueOf(1)) || var6.length == 1)) {
            a((Object[])null, -121, 115, -120, -53, -43, 106);
         }

         int var17;
         int var16;
         int var19;
         int var18;
         if(var5 != 0 && (var5 != 1 || var15 != 255)) {
            int var21;
            int var20;
            if(var5 == 1) {
               var4 = ((var4 & 16711935) * var15 >> 8 & 16711935) + ((var4 & '\uff00') * var15 >> 8 & '\uff00') + (var15 << 24);

               for(var16 = 256 - var15; var9 < var1; var14 -= var12 + var12) {
                  while(var14 <= var10 || var13 <= var10) {
                     var13 += var11 + var11;
                     var14 += var11++ + var11;
                  }

                  var17 = var0 - var11 + 1;
                  if(var17 < ((int[])((int[])var6[1]))[7]) {
                     var17 = ((int[])((int[])var6[1]))[7];
                  }

                  var18 = var0 + var11;
                  if(var18 > ((int[])((int[])var6[1]))[19]) {
                     var18 = ((int[])((int[])var6[1]))[19];
                  }

                  var19 = var17 + var9 * ((int[])((int[])var6[1]))[4];

                  for(var20 = var17; var20 < var18; ++var20) {
                     if(var2 < ((float[])((float[])var6[12]))[var19]) {
                        var21 = ((int[])((int[])var6[7]))[var19];
                        var21 = ((var21 & 16711935) * var16 >> 8 & 16711935) + ((var21 & '\uff00') * var16 >> 8 & '\uff00');
                        ((int[])((int[])var6[7]))[var19] = var4 + var21;
                     }

                     ++var19;
                  }

                  ++var9;
                  if(var6 != null && var6.length == 3 && var6[1].equals(Boolean.valueOf(false))) {
                     g((Object[])null);
                  }

                  var13 -= var12-- + var12;
               }

               var11 = var3;
               var12 = -var12;
               var14 = var12 * var12 + var10;
               var13 = var14 - var3;

               for(var14 -= var12; var9 < var8; var13 += var12++ + var12) {
                  while(var14 > var10 && var13 > var10) {
                     var14 -= var11-- + var11;
                     var13 -= var11 + var11;
                  }

                  var17 = var0 - var11;
                  if(var17 < ((int[])((int[])var6[1]))[7]) {
                     var17 = ((int[])((int[])var6[1]))[7];
                  }

                  var18 = var0 + var11;
                  if(var18 > ((int[])((int[])var6[1]))[19] - 1) {
                     var18 = ((int[])((int[])var6[1]))[19] - 1;
                  }

                  var19 = var17 + var9 * ((int[])((int[])var6[1]))[4];

                  for(var20 = var17; var20 <= var18; ++var20) {
                     if(var2 < ((float[])((float[])var6[12]))[var19]) {
                        var21 = ((int[])((int[])var6[7]))[var19];
                        var21 = ((var21 & 16711935) * var16 >> 8 & 16711935) + ((var21 & '\uff00') * var16 >> 8 & '\uff00');
                        ((int[])((int[])var6[7]))[var19] = var4 + var21;
                     }

                     ++var19;
                  }

                  ++var9;
                  if(var6 != null && var6.length == 1 && var6[0].equals(Integer.valueOf(0))) {
                     return;
                  }

                  var14 += var12 + var12;
               }

               if(var6 != null && var6.length == 9) {
                  v((Object[])null);
               }
            } else {
               if(var5 != 2) {
                  throw new IllegalArgumentException();
               }

               int var22;
               while(var9 < var1) {
                  if(var6 != null && var6.length == 17) {
                     return;
                  }

                  while(var14 <= var10 || var13 <= var10) {
                     var13 += var11 + var11;
                     var14 += var11++ + var11;
                  }

                  var16 = var0 - var11 + 1;
                  if(var16 < ((int[])((int[])var6[1]))[7]) {
                     var16 = ((int[])((int[])var6[1]))[7];
                  }

                  var17 = var0 + var11;
                  if(var17 > ((int[])((int[])var6[1]))[19]) {
                     var17 = ((int[])((int[])var6[1]))[19];
                  }

                  var18 = var16 + var9 * ((int[])((int[])var6[1]))[4];

                  for(var19 = var16; var19 < var17; ++var19) {
                     if(var2 < ((float[])((float[])var6[12]))[var18]) {
                        var20 = ((int[])((int[])var6[7]))[var18];
                        var21 = var4 + var20;
                        var22 = (var4 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        ((int[])((int[])var6[7]))[var18] = var21 - var20 | var20 - (var20 >>> 8);
                     }

                     ++var18;
                  }

                  ++var9;
                  var13 -= var12-- + var12;
                  var14 -= var12 + var12;
               }

               var11 = var3;
               var12 = -var12;
               if(var6 != null && var6.length == 1) {
                  i((Object[])null);
               }

               var14 = var12 * var12 + var10;
               var13 = var14 - var3;

               for(var14 -= var12; var9 < var8; var13 += var12++ + var12) {
                  while(var14 > var10 && var13 > var10) {
                     var14 -= var11-- + var11;
                     var13 -= var11 + var11;
                  }

                  var16 = var0 - var11;
                  if(var16 < ((int[])((int[])var6[1]))[7]) {
                     var16 = ((int[])((int[])var6[1]))[7];
                  }

                  var17 = var0 + var11;
                  if(var17 > ((int[])((int[])var6[1]))[19] - 1) {
                     var17 = ((int[])((int[])var6[1]))[19] - 1;
                  }

                  var18 = var16 + var9 * ((int[])((int[])var6[1]))[4];

                  for(var19 = var16; var19 <= var17; ++var19) {
                     if(var2 < ((float[])((float[])var6[12]))[var18]) {
                        var20 = ((int[])((int[])var6[7]))[var18];
                        var21 = var4 + var20;
                        var22 = (var4 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        ((int[])((int[])var6[7]))[var18] = var21 - var20 | var20 - (var20 >>> 8);
                     }

                     ++var18;
                  }

                  ++var9;
                  var14 += var12 + var12;
                  if(var6 != null && var6.length == 27 && var6[6].equals(Integer.valueOf(2))) {
                     return;
                  }
               }
            }
         } else {
            while(var9 < var1) {
               while(var14 <= var10 || var13 <= var10) {
                  var13 += var11 + var11;
                  var14 += var11++ + var11;
               }

               var16 = var0 - var11 + 1;
               if(var16 < ((int[])((int[])var6[1]))[7]) {
                  var16 = ((int[])((int[])var6[1]))[7];
               }

               var17 = var0 + var11;
               if(var17 > ((int[])((int[])var6[1]))[19]) {
                  var17 = ((int[])((int[])var6[1]))[19];
               }

               var18 = var16 + var9 * ((int[])((int[])var6[1]))[4];
               if(var6 != null && var6.length == 2) {
                  b((Object[])null, 4, (Object[])null);
               }

               for(var19 = var16; var19 < var17; ++var19) {
                  if(var2 < ((float[])((float[])var6[12]))[var18]) {
                     ((int[])((int[])var6[7]))[var18] = var4;
                  }

                  ++var18;
               }

               ++var9;
               var13 -= var12-- + var12;
               var14 -= var12 + var12;
            }

            var11 = var3;
            if(var6 != null && var6.length == 8) {
               return;
            }

            var12 = var9 - var1;
            var14 = var12 * var12 + var10;
            var13 = var14 - var3;

            for(var14 -= var12; var9 < var8; var13 += var12++ + var12) {
               while(var14 > var10 && var13 > var10) {
                  var14 -= var11-- + var11;
                  var13 -= var11 + var11;
               }

               var16 = var0 - var11;
               if(var16 < ((int[])((int[])var6[1]))[7]) {
                  var16 = ((int[])((int[])var6[1]))[7];
               }

               var17 = var0 + var11;
               if(var6 != null && var6.length == 13 && var6[3].equals(Integer.valueOf(0)) && var6[3].equals(Integer.valueOf(2))) {
                  k((Object[])null, 100);
               }

               if(var17 > ((int[])((int[])var6[1]))[19] - 1) {
                  var17 = ((int[])((int[])var6[1]))[19] - 1;
               }

               var18 = var16 + var9 * ((int[])((int[])var6[1]))[4];

               for(var19 = var16; var19 <= var17; ++var19) {
                  if(var2 < ((float[])((float[])var6[12]))[var18]) {
                     ((int[])((int[])var6[7]))[var18] = var4;
                  }

                  ++var18;
               }

               ++var9;
               var14 += var12 + var12;
            }
         }

      }
   }

   static final void b(Object[] var0, int[] var1) {
      var1[0] = ((int[])((int[])var0[1]))[4];
      var1[1] = ((int[])((int[])var0[1]))[12];
   }

   private static final void h(Object[] var0, Object[] var1) {
      if(var0 != null && var0.length == 3) {
         j(new Object[16][], 48);
      }

      Object[] var2 = a(var1, (Runnable)Thread.currentThread());
      va var3 = (va)((Object[])((Object[])var0[0]))[1];

      for(va var4 = var3.p; var4 != var3; var4 = var4.p) {
         vsa var5 = (vsa)var4;
         int var6 = var5.B >> 12;
         int var7 = var5.z >> 12;
         int var8 = var5.v >> 12;
         float var9 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[14] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[2] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[6] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[10] * (float)var8;
         float var10 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[15] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[3] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[7] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[11] * (float)var8;
         if(var9 >= -var10) {
            float var11 = ((float[])((float[])var1[10]))[5] + ((float[])((float[])var1[10]))[4] * var9 / var10;
            if(var9 <= ((float[])((float[])var2[18]))[4]) {
               float var12 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[0] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[4] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[8] * (float)var8;
               float var13 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[1] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[5] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[9] * (float)var8;
               if(var12 >= -var10 && var12 <= var10 && var13 >= -var10 && var13 <= var10) {
                  if(var2 != null && var2.length == 7 && var2[3].equals(Integer.valueOf(1))) {
                     return;
                  }

                  float var14 = (float)var5.C / 4096.0F;
                  float var15 = var12 + ((float[])((float[])((Object[])((Object[])var1[13]))[0]))[0] * var14;
                  float var16 = var10 + ((float[])((float[])((Object[])((Object[])var1[13]))[0]))[3] * var14;
                  float var17 = ((float[])((float[])var1[10]))[0] + ((float[])((float[])var1[10]))[2] * var12 / var10;
                  float var18 = ((float[])((float[])var1[10]))[1] + ((float[])((float[])var1[10]))[3] * var13 / var10;
                  float var19 = ((float[])((float[])var1[10]))[0] + ((float[])((float[])var1[10]))[2] * var15 / var16;
                  c(var5, (int)var17, (int)var18, var11, (int)(var19 < var17?var17 - var19:var19 - var17), var1);
               }
            }
         }
      }

   }

   static final int o(Object[] var0) {
      return 0;
   }

   static final Object[] C(Object[] var0) {
      Object[] var1 = a(var0, (Runnable)Thread.currentThread());
      return (Object[])((Object[])var1[29]);
   }

   static final void j(Object[] var0) {}

   static final void c(Object[] var0, int var1) {
      Object[] var2 = ((Object[][])((Object[][])var0[3]))[var1];
      Thread var3 = Thread.currentThread();
      var2[12] = var3;
   }

   static final Object[] F(Object[] var0) {
      Object[] var1 = a(var0, (Runnable)Thread.currentThread());
      return (Object[])((Object[])var1[28]);
   }

   static final void a(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var0[7] != null) {
         if(var1 < ((int[])((int[])var0[1]))[7]) {
            var3 -= ((int[])((int[])var0[1]))[7] - var1;
            var1 = ((int[])((int[])var0[1]))[7];
         }

         if(var2 < ((int[])((int[])var0[1]))[16]) {
            var4 -= ((int[])((int[])var0[1]))[16] - var2;
            var2 = ((int[])((int[])var0[1]))[16];
         }

         if(var1 + var3 > ((int[])((int[])var0[1]))[19]) {
            var3 = ((int[])((int[])var0[1]))[19] - var1;
         }

         if(var2 + var4 > ((int[])((int[])var0[1]))[1]) {
            var4 = ((int[])((int[])var0[1]))[1] - var2;
         }

         if(var3 > 0 && var4 > 0 && var1 <= ((int[])((int[])var0[1]))[19] && var2 <= ((int[])((int[])var0[1]))[1]) {
            int var7 = ((int[])((int[])var0[1]))[4] - var3;
            int var8 = var1 + var2 * ((int[])((int[])var0[1]))[4];
            int var9 = var5 >>> 24;
            int var10;
            int var11;
            int var12;
            if(var6 != 0 && (var6 != 1 || var9 != 255)) {
               int var13;
               if(var6 == 1) {
                  if(var0 != null && (var0.length == 16 || var0.length == 18 && var0[8].equals(Integer.valueOf(2)))) {
                     return;
                  }

                  var5 = ((var5 & 16711935) * var9 >> 8 & 16711935) + (((var5 & -16711936) >>> 8) * var9 & -16711936);
                  var10 = 256 - var9;

                  for(var11 = 0; var11 < var4; ++var11) {
                     for(var12 = -var3; var12 < 0; ++var12) {
                        var13 = ((int[])((int[])var0[7]))[var8];
                        var13 = ((var13 & 16711935) * var10 >> 8 & 16711935) + (((var13 & -16711936) >>> 8) * var10 & -16711936);
                        ((int[])((int[])var0[7]))[var8++] = var5 + var13;
                     }

                     var8 += var7;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var0 != null && (var0.length == 2 && var0[1].equals(Boolean.valueOf(false)) || var0.length == 11)) {
                     return;
                  }

                  for(var10 = 0; var10 < var4; ++var10) {
                     if(var0 != null && var0.length == 28 && var0[3].equals(Integer.valueOf(0))) {
                        a((Object[])null, -99, -125, (int[])null, (int[])null);
                     }

                     for(var11 = -var3; var11 < 0; ++var11) {
                        var12 = ((int[])((int[])var0[7]))[var8];
                        var13 = var5 + var12;
                        int var14 = (var5 & 16711935) + (var12 & 16711935);
                        var12 = (var14 & 16777472) + (var13 - var14 & 65536);
                        ((int[])((int[])var0[7]))[var8++] = var13 - var12 | var12 - (var12 >>> 8);
                     }

                     var8 += var7;
                  }
               }
            } else {
               var10 = var3 >> 3;
               var11 = var3 & 7;
               var3 = var8 - 1;
               if(var0 != null && var0.length == 2) {
                  j((Object[])null, -79);
               }

               for(var12 = -var4; var12 < 0; ++var12) {
                  int[] var10000;
                  if(var10 > 0) {
                     var1 = var10;

                     do {
                        var10000 = (int[])((int[])var0[7]);
                        ++var3;
                        var10000[var3] = var5;
                        var10000 = (int[])((int[])var0[7]);
                        ++var3;
                        var10000[var3] = var5;
                        var10000 = (int[])((int[])var0[7]);
                        ++var3;
                        var10000[var3] = var5;
                        var10000 = (int[])((int[])var0[7]);
                        ++var3;
                        var10000[var3] = var5;
                        var10000 = (int[])((int[])var0[7]);
                        ++var3;
                        var10000[var3] = var5;
                        var10000 = (int[])((int[])var0[7]);
                        ++var3;
                        var10000[var3] = var5;
                        var10000 = (int[])((int[])var0[7]);
                        ++var3;
                        var10000[var3] = var5;
                        var10000 = (int[])((int[])var0[7]);
                        ++var3;
                        var10000[var3] = var5;
                        --var1;
                     } while(var1 > 0);

                     if(var0 != null && (var0.length == 4 && var0[2].equals(Integer.valueOf(0)) && var0[2].equals(Integer.valueOf(0)) || var0.length == 4 && var0[2].equals(Integer.valueOf(2)) && var0[2].equals(Boolean.valueOf(false)) || var0.length == 32)) {
                        H(new Object[11][]);
                     }
                  }

                  if(var11 > 0) {
                     var1 = var11;

                     do {
                        var10000 = (int[])((int[])var0[7]);
                        ++var3;
                        var10000[var3] = var5;
                        --var1;
                     } while(var1 > 0);
                  }

                  var3 += var7;
               }
            }

            if(var0 == null || var0.length != 3) {
               ;
            }
         }
      }
   }

   static final void c(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var0[7] != null) {
         var3 -= var1;
         var4 -= var2;
         if(var4 == 0) {
            if(var3 >= 0) {
               c(var0, var1, var2, var3 + 1, var5, var6);
            } else {
               c(var0, var1 + var3, var2, -var3 + 1, var5, var6);
            }

         } else if(var3 == 0) {
            if(var4 >= 0) {
               b(var0, var1, var2, var4 + 1, var5, var6);
            } else {
               b(var0, var1, var2 + var4, -var4 + 1, var5, var6);
            }

         } else {
            if(var3 + var4 < 0) {
               var1 += var3;
               var3 = -var3;
               var2 += var4;
               var4 = -var4;
            }

            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            if(var3 > var4) {
               var2 <<= 16;
               var2 += '\u8000';
               var4 <<= 16;
               var7 = (int)Math.floor((double)var4 / (double)var3 + 0.5D);
               var3 += var1;
               if(var1 < ((int[])((int[])var0[1]))[7]) {
                  var2 += var7 * (((int[])((int[])var0[1]))[7] - var1);
                  var1 = ((int[])((int[])var0[1]))[7];
               }

               if(var3 >= ((int[])((int[])var0[1]))[19]) {
                  var3 = ((int[])((int[])var0[1]))[19] - 1;
               }

               var8 = var5 >>> 24;
               if(var6 != 0 && (var6 != 1 || var8 != 255)) {
                  if(var6 == 1) {
                     if(var0 != null && var0.length == 5) {
                        return;
                     }

                     var5 = ((var5 & 16711935) * var8 >> 8 & 16711935) + ((var5 & '\uff00') * var8 >> 8 & '\uff00') + (var8 << 24);

                     for(var9 = 256 - var8; var1 <= var3; ++var1) {
                        var10 = var2 >> 16;
                        if(var10 >= ((int[])((int[])var0[1]))[16] && var10 < ((int[])((int[])var0[1]))[1]) {
                           var11 = var1 + var10 * ((int[])((int[])var0[1]))[4];
                           var12 = ((int[])((int[])var0[7]))[var11];
                           var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                           ((int[])((int[])var0[7]))[var11] = var5 + var12;
                        }

                        var2 += var7;
                     }
                  } else {
                     if(var6 != 2) {
                        throw new IllegalArgumentException();
                     }

                     while(var1 <= var3) {
                        var9 = var2 >> 16;
                        if(var9 >= ((int[])((int[])var0[1]))[16] && var9 < ((int[])((int[])var0[1]))[1]) {
                           var10 = var1 + var9 * ((int[])((int[])var0[1]))[4];
                           var11 = ((int[])((int[])var0[7]))[var10];
                           var12 = var5 + var11;
                           var13 = (var5 & 16711935) + (var11 & 16711935);
                           var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                           ((int[])((int[])var0[7]))[var10] = var12 - var11 | var11 - (var11 >>> 8);
                        }

                        var2 += var7;
                        ++var1;
                     }

                     if(var0 != null && (var0.length == 8 && var0[7].equals(Integer.valueOf(0)) && var0[7].equals(Integer.valueOf(0)) || var0.length == 2)) {
                        m((Object[])null);
                     }
                  }
               } else {
                  while(var1 <= var3) {
                     var9 = var2 >> 16;
                     if(var9 >= ((int[])((int[])var0[1]))[16] && var9 < ((int[])((int[])var0[1]))[1]) {
                        ((int[])((int[])var0[7]))[var1 + var9 * ((int[])((int[])var0[1]))[4]] = var5;
                     }

                     var2 += var7;
                     ++var1;
                  }

                  if(var0 != null && var0.length == 2) {
                     return;
                  }
               }
            } else {
               var1 <<= 16;
               var1 += '\u8000';
               var3 <<= 16;
               var7 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
               var4 += var2;
               if(var2 < ((int[])((int[])var0[1]))[16]) {
                  var1 += var7 * (((int[])((int[])var0[1]))[16] - var2);
                  var2 = ((int[])((int[])var0[1]))[16];
               }

               if(var4 >= ((int[])((int[])var0[1]))[1]) {
                  var4 = ((int[])((int[])var0[1]))[1] - 1;
               }

               var8 = var5 >>> 24;
               if(var6 != 0 && (var6 != 1 || var8 != 255)) {
                  if(var6 == 1) {
                     var5 = ((var5 & 16711935) * var8 >> 8 & 16711935) + ((var5 & '\uff00') * var8 >> 8 & '\uff00') + (var8 << 24);

                     for(var9 = 256 - var8; var2 <= var4; ++var2) {
                        var10 = var1 >> 16;
                        if(var10 >= ((int[])((int[])var0[1]))[7] && var10 < ((int[])((int[])var0[1]))[19]) {
                           var11 = var10 + var2 * ((int[])((int[])var0[1]))[4];
                           var12 = ((int[])((int[])var0[7]))[var11];
                           var12 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                           ((int[])((int[])var0[7]))[var10 + var2 * ((int[])((int[])var0[1]))[4]] = var5 + var12;
                        }

                        var1 += var7;
                     }
                  } else {
                     if(var6 != 2) {
                        throw new IllegalArgumentException();
                     }

                     while(var2 <= var4) {
                        var9 = var1 >> 16;
                        if(var9 >= ((int[])((int[])var0[1]))[7] && var9 < ((int[])((int[])var0[1]))[19]) {
                           var10 = var9 + var2 * ((int[])((int[])var0[1]))[4];
                           var11 = ((int[])((int[])var0[7]))[var10];
                           var12 = var5 + var11;
                           var13 = (var5 & 16711935) + (var11 & 16711935);
                           var11 = (var13 & 16777472) + (var12 - var13 & 65536);
                           ((int[])((int[])var0[7]))[var10] = var12 - var11 | var11 - (var11 >>> 8);
                        }

                        var1 += var7;
                        ++var2;
                     }
                  }
               } else {
                  if(var0 != null && var0.length == 11) {
                     m((Object[])null, -34);
                  }

                  while(var2 <= var4) {
                     var9 = var1 >> 16;
                     if(var9 >= ((int[])((int[])var0[1]))[7] && var9 < ((int[])((int[])var0[1]))[19]) {
                        ((int[])((int[])var0[7]))[var9 + var2 * ((int[])((int[])var0[1]))[4]] = var5;
                     }

                     var1 += var7;
                     ++var2;
                  }
               }
            }

         }
      }
   }

   private static final Object[] a(Object[] var0, qa var1) {
      if(var0[8] == null) {
         var0[8] = new boolean[3];
      }

      if(var0[1] == null) {
         var0[1] = new int[20];
      }

      if(var0[10] == null) {
         var0[10] = new float[6];
      }

      x(var0);
      fta var3 = new fta(var0, var1);
      var0[6] = var3;

      try {
         var0[2] = sj.a(256, new Object[3], (byte)-43);
         var0[14] = im.a(new Object[2], (int)-16365);
         var0[5] = ab.a(new Object[2], (byte)93);
         var0[13] = ab.a(new Object[2], (byte)94);
         var0[11] = ab.a(new Object[2], (byte)115);
         m(var0, 1);
         c(var0, 0);
         tia.a(-927416089, true, true);
         if(var0 != null && var0.length == 4) {
            return null;
         } else {
            ((boolean[])((boolean[])var0[8]))[0] = true;
            ((int[])((int[])var0[1]))[0] = (int)he.a(-128);
            return var0;
         }
      } catch (Throwable var5) {
         var5.printStackTrace();
         ((ta)var0[6]).a((byte)17);
         throw new RuntimeException("");
      }
   }

   static final boolean D(Object[] var0) {
      return false;
   }

   static final aa a(Object[] var0, int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7) {
      return new vca(var0, var6, var7, var1, var2, var3, var4, var5);
   }

   static final Object[] a(Object[] var0, Canvas var1, qa var2, int var3, int var4) {
      a(var0, var2);

      try {
         ((ta)var0[6]).a(var3, var1, var4, -128);
         ((ta)var0[6]).a(var1, -128);
         return var0;
      } catch (Throwable var6) {
         var6.printStackTrace();
         ((ta)var0[6]).a((byte)17);
         throw new RuntimeException("");
      }
   }

   static final cga a(Object[] var0, int var1, int var2, boolean var3, boolean var4) {
      return (cga)(var3?new um(var0, var1, var2):new hra(var0, var1, var2));
   }

   static final void a(Object[] var0, float var1) {
      ((int[])((int[])var0[1]))[6] = (int)(var1 * 65535.0F);
   }

   static final void a(Object[] var0, int var1, Class_s var2, int var3, int var4) {
      if(var0[7] != null) {
         bk var5;
         Object[] var6 = (var5 = (bk)var2) == null?null:var5.f_l;
         int[] var7 = (int[])((int[])var6[0]);
         int[] var8 = (int[])((int[])var6[2]);
         int var9;
         if(((int[])((int[])var0[1]))[1] < var4 + var7.length) {
            var9 = ((int[])((int[])var0[1]))[1] - var4;
         } else {
            var9 = var7.length;
         }

         int var10;
         if(((int[])((int[])var0[1]))[16] > var4) {
            var10 = ((int[])((int[])var0[1]))[16] - var4;
            var4 = ((int[])((int[])var0[1]))[16];
         } else {
            var10 = 0;
         }

         if(var6 != null && (var6.length == 8 && var6[7].equals(Integer.valueOf(1)) || var6.length == 19)) {
            b((Object[])null, 7, -28, 52, 0);
         }

         if(var9 - var10 > 0) {
            int var11 = var4 * ((int[])((int[])var0[1]))[4];

            for(int var12 = var10; var12 < var9; ++var12) {
               int var13 = var3 + var7[var12];
               int var14 = var8[var12];
               if(var6 != null && var6.length == 4) {
                  return;
               }

               if(((int[])((int[])var0[1]))[7] > var13) {
                  var14 -= ((int[])((int[])var0[1]))[7] - var13;
                  var13 = ((int[])((int[])var0[1]))[7];
               }

               if(((int[])((int[])var0[1]))[19] < var13 + var14) {
                  var14 = ((int[])((int[])var0[1]))[19] - var13;
               }

               var13 += var11;

               for(int var15 = -var14; var15 < 0; ++var15) {
                  ((int[])((int[])var0[7]))[var13++] = var1;
               }

               var11 += ((int[])((int[])var0[1]))[4];
            }

         }
      }
   }

   private static final void b(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var0[7] != null) {
         if(var2 >= ((int[])((int[])var0[1]))[16] && var2 < ((int[])((int[])var0[1]))[1]) {
            int var9 = var1 + var2 * ((int[])((int[])var0[1]))[4];
            int var10 = var4 >>> 24;
            int var11 = var6 + var7;
            int var12 = var8 % var11;
            int var13;
            if(var5 != 0 && (var5 != 1 || var10 != 255)) {
               int var14;
               int var15;
               if(var5 == 1) {
                  var4 = ((var4 & 16711935) * var10 >> 8 & 16711935) + ((var4 & '\uff00') * var10 >> 8 & '\uff00') + (var10 << 24);
                  var13 = 256 - var10;
                  if(var0 != null && var0.length == 5) {
                     f((Object[])null);
                  }

                  for(var14 = 0; var14 < var3; var12 %= var11) {
                     if(var1 + var14 >= ((int[])((int[])var0[1]))[7] && var1 + var14 < ((int[])((int[])var0[1]))[19] && var12 < var6) {
                        var15 = ((int[])((int[])var0[7]))[var9 + var14];
                        var15 = ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        ((int[])((int[])var0[7]))[var9 + var14] = var4 + var15;
                     }

                     ++var14;
                     ++var12;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  for(var13 = 0; var13 < var3; var12 %= var11) {
                     if(var1 + var13 >= ((int[])((int[])var0[1]))[7] && var1 + var13 < ((int[])((int[])var0[1]))[19] && var12 < var6) {
                        var14 = ((int[])((int[])var0[7]))[var9 + var13];
                        var15 = var4 + var14;
                        int var16 = (var4 & 16711935) + (var14 & 16711935);
                        var14 = (var16 & 16777472) + (var15 - var16 & 65536);
                        ((int[])((int[])var0[7]))[var9 + var13] = var15 - var14 | var14 - (var14 >>> 8);
                     }

                     ++var13;
                     ++var12;
                  }
               }
            } else {
               if(var0 != null && (var0.length == 1 || var0.length == 11 && var0[4].equals(Integer.valueOf(0)) || var0.length == 4 && var0[1].equals(Boolean.valueOf(false)))) {
                  return;
               }

               for(var13 = 0; var13 < var3; var12 %= var11) {
                  if(var1 + var13 >= ((int[])((int[])var0[1]))[7] && var1 + var13 < ((int[])((int[])var0[1]))[19] && var12 < var6) {
                     ((int[])((int[])var0[7]))[var9 + var13] = var4;
                  }

                  ++var13;
                  ++var12;
               }
            }

         }
      }
   }

   static final boolean A(Object[] var0) {
      return true;
   }

   static final boolean b(Object[] var0, int var1) {
      return ((boolean[])((boolean[])var0[8]))[2] || ((boolean[])((boolean[])((ta)var0[6]).k.a(var1, (byte)76)[3]))[4];
   }

   static final void d(Object[] var0, int var1, int var2, int var3, int var4) {
      if(var1 < 0) {
         var1 = 0;
      }

      if(var2 < 0) {
         var2 = 0;
      }

      if(var3 > ((int[])((int[])var0[1]))[4]) {
         var3 = ((int[])((int[])var0[1]))[4];
      }

      if(var4 > ((int[])((int[])var0[1]))[12]) {
         var4 = ((int[])((int[])var0[1]))[12];
      }

      ((int[])((int[])var0[1]))[7] = var1;
      ((int[])((int[])var0[1]))[19] = var3;
      ((int[])((int[])var0[1]))[16] = var2;
      ((int[])((int[])var0[1]))[1] = var4;
      G(var0);
   }

   static final void b(Object[] var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0[7] != null) {
         if(var1 >= ((int[])((int[])var0[1]))[7] && var1 < ((int[])((int[])var0[1]))[19]) {
            if(var2 < ((int[])((int[])var0[1]))[16]) {
               var3 -= ((int[])((int[])var0[1]))[16] - var2;
               var2 = ((int[])((int[])var0[1]))[16];
            }

            if(var2 + var3 > ((int[])((int[])var0[1]))[1]) {
               var3 = ((int[])((int[])var0[1]))[1] - var2;
            }

            int var6 = var1 + var2 * ((int[])((int[])var0[1]))[4];
            int var7 = var4 >>> 24;
            int var8;
            if(var5 != 0 && (var5 != 1 || var7 != 255)) {
               int var9;
               int var10;
               int var11;
               if(var5 == 1) {
                  var4 = ((var4 & 16711935) * var7 >> 8 & 16711935) + ((var4 & '\uff00') * var7 >> 8 & '\uff00') + (var7 << 24);
                  var8 = 256 - var7;

                  for(var9 = 0; var9 < var3; ++var9) {
                     var10 = var6 + var9 * ((int[])((int[])var0[1]))[4];
                     var11 = ((int[])((int[])var0[7]))[var10];
                     var11 = ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & '\uff00') * var8 >> 8 & '\uff00');
                     ((int[])((int[])var0[7]))[var10] = var4 + var11;
                  }

                  if(var0 != null && var0.length == 5) {
                     c((Object[])null, 108, 116, 112, 28);
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  for(var8 = 0; var8 < var3; ++var8) {
                     var9 = var6 + var8 * ((int[])((int[])var0[1]))[4];
                     var10 = ((int[])((int[])var0[7]))[var9];
                     var11 = var4 + var10;
                     int var12 = (var4 & 16711935) + (var10 & 16711935);
                     var10 = (var12 & 16777472) + (var11 - var12 & 65536);
                     ((int[])((int[])var0[7]))[var9] = var11 - var10 | var10 - (var10 >>> 8);
                  }

                  if(var0 != null && (var0.length == 6 || var0.length == 2)) {
                     b((Object[])null, (Object[])(new Object[2][]));
                  }
               }
            } else {
               for(var8 = 0; var8 < var3; ++var8) {
                  ((int[])((int[])var0[7]))[var6 + var8 * ((int[])((int[])var0[1]))[4]] = var4;
               }

               if(var0 != null && var0.length == 16 && var0[15].equals(Integer.valueOf(0)) && var0[15].equals(Integer.valueOf(0))) {
                  return;
               }
            }

         }
      }
   }

   private static final void g(Object[] var0, Object[] var1) {
      if(var0 != null && var0.length == 3) {
         j(new Object[16][], 48);
      }

      Object[] var2 = a(var1, (Runnable)Thread.currentThread());
      va var3 = (va)((Object[])((Object[])var0[0]))[1];

      for(va var4 = var3.p; var4 != var3; var4 = var4.p) {
         vsa var5 = (vsa)var4;
         int var6 = var5.B >> 12;
         int var7 = var5.z >> 12;
         int var8 = var5.v >> 12;
         float var9 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[14] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[2] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[6] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[10] * (float)var8;
         float var10 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[15] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[3] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[7] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[11] * (float)var8;
         if(var9 >= -var10) {
            float var11 = ((float[])((float[])var1[10]))[5] + ((float[])((float[])var1[10]))[4] * var9 / var10;
            if(var9 <= ((float[])((float[])var2[18]))[4]) {
               float var12 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[0] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[4] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[8] * (float)var8;
               float var13 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[1] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[5] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[9] * (float)var8;
               if(var12 >= -var10 && var12 <= var10 && var13 >= -var10 && var13 <= var10) {
                  if(var2 != null && var2.length == 7 && var2[3].equals(Integer.valueOf(1))) {
                     return;
                  }

                  float var14 = (float)var5.C / 4096.0F;
                  float var15 = var12 + ((float[])((float[])((Object[])((Object[])var1[13]))[0]))[0] * var14;
                  float var16 = var10 + ((float[])((float[])((Object[])((Object[])var1[13]))[0]))[3] * var14;
                  float var17 = ((float[])((float[])var1[10]))[0] + ((float[])((float[])var1[10]))[2] * var12 / var10;
                  float var18 = ((float[])((float[])var1[10]))[1] + ((float[])((float[])var1[10]))[3] * var13 / var10;
                  float var19 = ((float[])((float[])var1[10]))[0] + ((float[])((float[])var1[10]))[2] * var15 / var16;
                  d(var5, (int)var17, (int)var18, var11, (int)(var19 < var17?var17 - var19:var19 - var17), var1);
               }
            }
         }
      }

   }

   static final boolean l(Object[] var0) {
      return false;
   }

   static final void a(Object[] var0, float var1, float var2) {
      ((float[])((float[])var0[10]))[4] = var2 - var1;
      if(var0 != null && (var0.length == 10 || var0.length == 11 && var0[6].equals(Integer.valueOf(0)) || var0.length == 9)) {
         h((Object[])null);
      }

      ((float[])((float[])var0[10]))[5] = var1 + var2 - 1.0F;

      for(int var3 = 0; var3 < ((int[])((int[])var0[1]))[10]; ++var3) {
         Object[] var4 = ((Object[][])((Object[][])var0[3]))[var3];
         uo var5 = (uo)var4[17];
         var5.k = ((float[])((float[])var0[10]))[4];
         var5.z = ((float[])((float[])var0[10]))[5];
      }

   }

   static final boolean f(Object[] var0) {
      return false;
   }

   static final void a(Object[] var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < ((Object[])((Object[])var0[3])).length; ++var4) {
         Object[] var5 = ((Object[][])((Object[][])var0[3]))[var4];
         ((int[])((int[])var5[1]))[1] = var1 & 16777215;
         int var6 = ((int[])((int[])var5[1]))[1] >>> 16 & 255;
         if(var6 < 2) {
            var6 = 2;
         }

         int var7 = ((int[])((int[])var5[1]))[1] >> 8 & 255;
         if(var7 < 2) {
            var7 = 2;
         }

         int var8 = ((int[])((int[])var5[1]))[1] & 255;
         if(var8 < 2) {
            var8 = 2;
         }

         ((int[])((int[])var5[1]))[1] = var6 << 16 | var7 << 8 | var8;
         if(var2 < 0) {
            ((boolean[])((boolean[])var5[2]))[0] = false;
         } else {
            ((boolean[])((boolean[])var5[2]))[0] = true;
         }

         if(var0 != null && var0.length == 2) {
            a(new Object[20][], 16, -0.28115314F, -0.8825201F, -0.01830374F, 0.68673223F, 1.1775116F);
         }
      }

      if(var0 == null || var0.length != 3) {
         ;
      }
   }

   static final int[] e(Object[] var0, int var1, int var2, int var3, int var4) {
      if(var0[7] == null) {
         throw new IllegalStateException("");
      } else {
         int[] var5 = new int[var3 * var4];
         int var6 = 0;
         if(var0 != null && var0.length == 13 && var0[4].equals(Integer.valueOf(0))) {
            return null;
         } else {
            for(int var7 = 0; var7 < var4; ++var7) {
               int var8 = (var2 + var7) * ((int[])((int[])var0[1]))[4] + var1;

               for(int var9 = 0; var9 < var3; ++var9) {
                  var5[var6++] = ((int[])((int[])var0[7]))[var8 + var9];
               }
            }

            return var5;
         }
      }
   }

   static final void f(int var0, int var1, float var2, int var3, int var4, int var5, int var6, int var7, int var8, Object[] var9) {
      if(var3 != 0 && var4 != 0) {
         if(var5 != '\uffff') {
            Object[] var10 = ((ta)var9[6]).k.a(var5, (byte)80);
            if(!((boolean[])((boolean[])var10[3]))[7]) {
               if(((int[])((int[])var9[1]))[14] != var5) {
                  cga var11 = (cga)dna.a((byte)34, (Object[])((Object[])var9[0]), (long)var5);
                  if(var11 == null) {
                     int[] var12 = n(var9, var5);
                     if(var12 == null) {
                        return;
                     }

                     int var13 = b(var9, var5)?64:((int[])((int[])var9[1]))[8];
                     var11 = ((ta)var9[6]).a(var13, -7343, 0, var12, var13, var13);
                     il.a((long)var5, var11, true, (Object[])((Object[])var9[0]));
                  }

                  ((int[])((int[])var9[1]))[14] = var5;
                  var9[9] = var11;
               }

               ((ap)var9[9]).a(var0 - var3, var1 - var4, var2, var3 << 1, var4 << 1, var7, var6, var8, 1, ((int[])((int[])var10[1]))[0] != 2);
               return;
            }
         }

         a(var0, var1, var2, var3, var6, var8, var9);
      }
   }

   static final void c(Object[] var0, boolean var1) {
      Object[] var2 = a(var0, (Runnable)Thread.currentThread());
      ((boolean[])((boolean[])var2[2]))[1] = var1;
   }

   private static final void G(Object[] var0) {
      int var1 = ((int[])((int[])var0[1]))[19] - ((int[])((int[])var0[1]))[7];
      int var2 = ((int[])((int[])var0[1]))[1] - ((int[])((int[])var0[1]))[16];
      float var3 = ((float[])((float[])var0[10]))[2] = (float)((int[])((int[])var0[1]))[17] / 2.0F;
      float var4 = ((float[])((float[])var0[10]))[3] = (float)((int[])((int[])var0[1]))[15] / 2.0F;
      ((float[])((float[])var0[10]))[0] = (float)((int[])((int[])var0[1]))[13] + var3;
      ((float[])((float[])var0[10]))[1] = (float)((int[])((int[])var0[1]))[9] + var4;

      int var5;
      for(var5 = 0; var5 < ((int[])((int[])var0[1]))[10]; ++var5) {
         Object[] var6 = ((Object[][])((Object[][])var0[3]))[var5];
         uo var7 = (uo)var6[17];
         var7.r = var3;
         var7.w = var4;
         var7.t = ((float[])((float[])var0[10]))[0] - (float)((int[])((int[])var0[1]))[7];
         var7.L = ((float[])((float[])var0[10]))[1] - (float)((int[])((int[])var0[1]))[16];
         var7.K = var1;
         var7.n = var2;
      }

      var5 = ((int[])((int[])var0[1]))[16] * ((int[])((int[])var0[1]))[4] + ((int[])((int[])var0[1]))[7];
      if(var0 != null && var0.length == 3) {
         a(new Object[2][], -0.80471635F, -0.069041125F, -0.82455355F, -0.22734867F, 1.6203324F, -0.6519949F);
      }

      for(int var8 = ((int[])((int[])var0[1]))[16]; var8 < ((int[])((int[])var0[1]))[1]; ++var8) {
         for(int var9 = 0; var9 < ((int[])((int[])var0[1]))[10]; ++var9) {
            ((uo)((Object[][])((Object[][])var0[3]))[var9][17]).y[var8 - ((int[])((int[])var0[1]))[16]] = var5;
         }

         var5 += ((int[])((int[])var0[1]))[4];
         if(var0 != null && var0.length == 1) {
            C((Object[])null);
         }
      }

   }

   static final void b(Object[] var0, int var1, int var2, int var3, int var4) {
      ((int[])((int[])var0[1]))[13] = var1;
      ((int[])((int[])var0[1]))[9] = var2;
      ((int[])((int[])var0[1]))[17] = var3;
      ((int[])((int[])var0[1]))[15] = var4;
      G(var0);
   }

   static final void i(Object[] var0) {
      for(int var1 = 0; var1 < ((Object[])((Object[])var0[3])).length; ++var1) {
         ((int[])((int[])((Object[][])((Object[][])var0[3]))[var1][1]))[1] = ((int[])((int[])((Object[][])((Object[][])var0[3]))[var1][1]))[0];
         ((boolean[])((boolean[])((Object[][])((Object[][])var0[3]))[var1][2]))[2] = false;
      }

      if(var0 == null || var0.length != 1 || !var0[0].equals(Integer.valueOf(0))) {
         ;
      }
   }

   private static final void a(Object[] var0, Object[] var1) {
      if(var0 != null && var0.length == 3) {
         j(new Object[16][], 48);
      }

      Object[] var2 = a(var1, (Runnable)Thread.currentThread());
      va var3 = (va)((Object[])((Object[])var0[0]))[1];

      for(va var4 = var3.p; var4 != var3; var4 = var4.p) {
         vsa var5 = (vsa)var4;
         int var6 = var5.B >> 12;
         int var7 = var5.z >> 12;
         int var8 = var5.v >> 12;
         float var9 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[14] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[2] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[6] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[10] * (float)var8;
         float var10 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[15] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[3] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[7] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[11] * (float)var8;
         if(var9 >= -var10) {
            float var11 = ((float[])((float[])var1[10]))[5] + ((float[])((float[])var1[10]))[4] * var9 / var10;
            if(var9 <= ((float[])((float[])var2[18]))[4]) {
               float var12 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[0] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[4] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[8] * (float)var8;
               float var13 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[1] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[5] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[9] * (float)var8;
               if(var12 >= -var10 && var12 <= var10 && var13 >= -var10 && var13 <= var10) {
                  if(var2 != null && var2.length == 7 && var2[3].equals(Integer.valueOf(1))) {
                     return;
                  }

                  float var14 = (float)var5.C / 4096.0F;
                  float var15 = var12 + ((float[])((float[])((Object[])((Object[])var1[13]))[0]))[0] * var14;
                  float var16 = var10 + ((float[])((float[])((Object[])((Object[])var1[13]))[0]))[3] * var14;
                  float var17 = ((float[])((float[])var1[10]))[0] + ((float[])((float[])var1[10]))[2] * var12 / var10;
                  float var18 = ((float[])((float[])var1[10]))[1] + ((float[])((float[])var1[10]))[3] * var13 / var10;
                  float var19 = ((float[])((float[])var1[10]))[0] + ((float[])((float[])var1[10]))[2] * var15 / var16;
                  e(var5, (int)var17, (int)var18, var11, (int)(var19 < var17?var17 - var19:var19 - var17), var1);
               }
            }
         }
      }

   }

   static final int[] k(Object[] var0, int var1) {
      hea var2;
      synchronized(var0[2]) {
         var2 = (hea)dna.a((byte)34, (Object[])((Object[])var0[2]), (long)var1);
         if(var2 == null) {
            if(!((ta)var0[6]).k.a(-20460, var1)) {
               return null;
            }

            Object[] var4 = ((ta)var0[6]).k.a(var1, (byte)60);
            int var5 = !((boolean[])((boolean[])var4[3]))[4] && !((boolean[])((boolean[])var0[8]))[2]?((int[])((int[])var0[1]))[8]:64;
            var2 = new hea(var1, var5, ((ta)var0[6]).k.a(var5, 0.7F, true, -6300, var5, var1), ((int[])((int[])var4[1]))[0] != 1);
            il.a((long)var1, var2, true, (Object[])((Object[])var0[2]));
         }
      }

      var2.o = true;
      return var2.a();
   }

   private static final void a(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(var0[7] != null) {
         if(var1 >= ((int[])((int[])var0[1]))[7] && var1 < ((int[])((int[])var0[1]))[19]) {
            int var9 = var1 + var2 * ((int[])((int[])var0[1]))[4];
            int var10 = var4 >>> 24;
            int var11 = var6 + var7;
            int var12 = var8 % var11;
            int var13;
            if(var5 != 0 && (var5 != 1 || var10 != 255)) {
               int var14;
               int var15;
               int var16;
               if(var5 == 1) {
                  var4 = ((var4 & 16711935) * var10 >> 8 & 16711935) + ((var4 & '\uff00') * var10 >> 8 & '\uff00') + (var10 << 24);
                  if(var0 != null && (var0.length == 10 || var0.length == 5 || var0.length == 12 && var0[1].equals(Integer.valueOf(1)) && var0[1].equals(Integer.valueOf(2)))) {
                     return;
                  }

                  var13 = 256 - var10;

                  for(var14 = 0; var14 < var3; var12 %= var11) {
                     if(var2 + var14 >= ((int[])((int[])var0[1]))[16] && var2 + var14 < ((int[])((int[])var0[1]))[1] && var12 < var6) {
                        var15 = var9 + var14 * ((int[])((int[])var0[1]))[4];
                        var16 = ((int[])((int[])var0[7]))[var15];
                        var16 = ((var16 & 16711935) * var13 >> 8 & 16711935) + ((var16 & '\uff00') * var13 >> 8 & '\uff00');
                        ((int[])((int[])var0[7]))[var15] = var4 + var16;
                     }

                     ++var14;
                     ++var12;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var0 != null && var0.length == 6) {
                     a((Object[])null);
                  }

                  for(var13 = 0; var13 < var3; var12 %= var11) {
                     if(var2 + var13 >= ((int[])((int[])var0[1]))[16] && var2 + var13 < ((int[])((int[])var0[1]))[1] && var12 < var6) {
                        var14 = var9 + var13 * ((int[])((int[])var0[1]))[4];
                        var15 = ((int[])((int[])var0[7]))[var14];
                        var16 = var4 + var15;
                        int var17 = (var4 & 16711935) + (var15 & 16711935);
                        var15 = (var17 & 16777472) + (var16 - var17 & 65536);
                        ((int[])((int[])var0[7]))[var14] = var16 - var15 | var15 - (var15 >>> 8);
                     }

                     ++var13;
                     ++var12;
                  }
               }
            } else {
               for(var13 = 0; var13 < var3; var12 %= var11) {
                  if(var2 + var13 >= ((int[])((int[])var0[1]))[16] && var2 + var13 < ((int[])((int[])var0[1]))[1] && var12 < var6) {
                     ((int[])((int[])var0[7]))[var9 + var13 * ((int[])((int[])var0[1]))[4]] = var4;
                  }

                  ++var13;
                  ++var12;
               }

               if(var0 != null && (var0.length == 6 || var0.length == 25 && var0[1].equals(Boolean.valueOf(false)) && var0[1].equals(Boolean.valueOf(false)) || var0.length == 11 && var0[0].equals(Integer.valueOf(0)) && var0[0].equals(Integer.valueOf(1)))) {
                  c((Object[])null, 96, 60, 101, -101);
               }
            }

         }
      }
   }

   static final void c(Object[] var0, int var1, int var2, int var3, int var4) {
      if(((int[])((int[])var0[1]))[7] < var1) {
         ((int[])((int[])var0[1]))[7] = var1;
      }

      if(((int[])((int[])var0[1]))[16] < var2) {
         ((int[])((int[])var0[1]))[16] = var2;
      }

      if(((int[])((int[])var0[1]))[19] > var3) {
         ((int[])((int[])var0[1]))[19] = var3;
      }

      if(((int[])((int[])var0[1]))[1] > var4) {
         ((int[])((int[])var0[1]))[1] = var4;
      }

      G(var0);
   }

   static final void a(Object[] var0, int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13) {
      boolean var14 = var0[7] != null;
      boolean var15 = var0[12] != null;
      if(var14 || var15) {
         Object[] var16 = a(var0, (Runnable)Thread.currentThread());
         uo var17 = (uo)var16[17];
         var17.o = false;
         var1 -= ((int[])((int[])var0[1]))[7];
         var4 -= ((int[])((int[])var0[1]))[7];
         var7 -= ((int[])((int[])var0[1]))[7];
         var2 -= ((int[])((int[])var0[1]))[16];
         var5 -= ((int[])((int[])var0[1]))[16];
         var8 -= ((int[])((int[])var0[1]))[16];
         var17.c = var1 < 0 || var1 > var17.K || var4 < 0 || var4 > var17.K || var7 < 0 || var7 > var17.K;
         int var18 = var10 >>> 24;
         if(var16 != null && var16.length == 16) {
            y((Object[])null);
         }

         if(var13 != 0 && (var13 != 1 || var18 != 255)) {
            if(var13 == 1) {
               var17.J = 255 - var18;
               var17.x = false;
               if(var14) {
                  if(var15) {
                     var17.d((float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
                  } else {
                     var17.g((float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
                  }
               } else if(var15) {
                  var17.c((float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
               } else {
                  var17.e((float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
               }
            } else {
               if(var13 != 2) {
                  throw new IllegalArgumentException();
               }

               var17.J = 128;
               var17.x = true;
               if(var14) {
                  if(var15) {
                     var17.d((float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
                  } else {
                     var17.g((float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
                  }
               } else if(var15) {
                  var17.c((float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
               } else {
                  var17.e((float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
               }
            }
         } else {
            var17.J = 0;
            var17.x = false;
            if(var14) {
               if(var15) {
                  var17.d((float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
               } else {
                  var17.g((float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
               }
            } else if(var15) {
               var17.c((float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
            } else {
               var17.e((float)var2, (float)var5, (float)var8, (float)var1, (float)var4, (float)var7, var3, var6, var9, var10, var11, var12);
            }
         }

         var17.o = true;
      }
   }

   static final int a(Object[] var0, int var1) {
      return ((int[])((int[])((ta)var0[6]).k.a(var1, (byte)76)[1]))[0];
   }

   static final void b(Object[] var0, float var1, float var2, float var3, float[] var4) {
      float var5 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[14] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[2] * var1 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[6] * var2 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[10] * var3;
      float var6 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[15] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[3] * var1 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[7] * var2 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[11] * var3;
      if(var5 >= -var6 && var5 <= var6) {
         float var7 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[0] * var1 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[4] * var2 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[8] * var3;
         if(var7 >= -var6 && var7 <= var6) {
            float var8 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[1] * var1 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[5] * var2 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[9] * var3;
            if(var8 >= -var6 && var8 <= var6) {
               float var9 = ((float[])((float[])((Object[])((Object[])var0[5]))[0]))[14] + ((float[])((float[])((Object[])((Object[])var0[5]))[0]))[2] * var1 + ((float[])((float[])((Object[])((Object[])var0[5]))[0]))[6] * var2 + ((float[])((float[])((Object[])((Object[])var0[5]))[0]))[10] * var3;
               var4[0] = ((float[])((float[])var0[10]))[0] + ((float[])((float[])var0[10]))[2] * var7 / var6;
               if(var0 == null || var0.length != 7 && var0.length != 6) {
                  var4[1] = ((float[])((float[])var0[10]))[1] + ((float[])((float[])var0[10]))[3] * var8 / var6;
                  var4[2] = var9;
               }
            } else {
               var4[2] = Float.NaN;
               var4[1] = Float.NaN;
               var4[0] = Float.NaN;
            }
         } else {
            var4[2] = Float.NaN;
            var4[1] = Float.NaN;
            var4[0] = Float.NaN;
         }
      } else {
         var4[2] = Float.NaN;
         var4[1] = Float.NaN;
         var4[0] = Float.NaN;
      }
   }

   private static final void s(Object[] var0) {
      aqa.a(true, (Object[])((Object[])var0[14]), (Object[])((Object[])var0[5]));
      sea.a((Object[])((Object[])var0[5]), (Object[])((Object[])var0[11]), (byte)82);
      vta.a((Object[])((Object[])var0[13]), (Object[])((Object[])var0[11]), 117);
      dp.a(((float[][])((float[][])var0[4]))[0], 95, (Object[])((Object[])var0[11]));
      rt.a((Object[])((Object[])var0[11]), ((float[][])((float[][])var0[4]))[1], (byte)90);
      bj.a((byte)-79, ((float[][])((float[][])var0[4]))[2], (Object[])((Object[])var0[11]));
      kc.a(0, ((float[][])((float[][])var0[4]))[3], (Object[])((Object[])var0[11]));
      bia.a(((float[][])((float[][])var0[4]))[4], (Object[])((Object[])var0[11]), 110);
      fda.a(20504, ((float[][])((float[][])var0[4]))[5], (Object[])((Object[])var0[11]));
      float var1 = cd.a(-20710, (Object[])((Object[])var0[13]));
      float var2 = ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[10] * (var1 - 255.0F) + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[14];
      if(var0 == null || var0.length != 7 || !var0[6].equals(Integer.valueOf(1))) {
         float var3 = ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[10] * var1 + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[14];
         float var4 = var3 - var2;

         for(int var5 = 0; var5 < ((int[])((int[])var0[1]))[10]; ++var5) {
            Object[] var6 = ((Object[][])((Object[][])var0[3]))[var5];
            ((float[])((float[])var6[18]))[4] = var2;
            ((float[])((float[])var6[18]))[8] = var4;
         }

      }
   }

   static final hsa B(Object[] var0) {
      Object[] var3 = new Object[5];
      Class_s.b(7, var3);
      cpa.a((byte)-110, var3);
      mga var5 = new mga(var3);
      var3[3] = var5;
      var3[2] = var0;
      return (hsa)(var3 == null?null:var3[3]);
   }

   static final void a(Object[] var0, int var1, float var2, float var3, float var4, float var5, float var6) {
      ((int[])((int[])var0[1]))[5] = (int)(var2 * 65535.0F);
      ((int[])((int[])var0[1]))[11] = (int)(var3 * 65535.0F);
      float var7 = (float)Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6));
      ((int[])((int[])var0[1]))[2] = (int)(var4 * 65535.0F / var7);
      ((int[])((int[])var0[1]))[18] = (int)(var5 * 65535.0F / var7);
      ((int[])((int[])var0[1]))[3] = (int)(var6 * 65535.0F / var7);
   }

   static final void a(Object[] var0, int var1, Object[][] var2) {}

   static final void h(int var0, int var1, float var2, int var3, int var4, int var5, int var6, int var7, int var8, Object[] var9) {
      if(var3 != 0 && var4 != 0) {
         if(var5 != '\uffff') {
            Object[] var10 = ((ta)var9[6]).k.a(var5, (byte)127);
            if(!((boolean[])((boolean[])var10[3]))[7]) {
               if(((int[])((int[])var9[1]))[14] != var5) {
                  cga var11 = (cga)dna.a((byte)34, (Object[])((Object[])var9[0]), (long)var5);
                  if(var11 == null) {
                     int[] var12 = n(var9, var5);
                     if(var12 == null) {
                        return;
                     }

                     int var13 = b(var9, var5)?64:((int[])((int[])var9[1]))[8];
                     var11 = ((ta)var9[6]).a(var13, -7343, 0, var12, var13, var13);
                     il.a((long)var5, var11, true, (Object[])((Object[])var9[0]));
                  }

                  ((int[])((int[])var9[1]))[14] = var5;
                  var9[9] = var11;
               }

               ((ap)var9[9]).f(var0 - var3, var1 - var4, var2, var3 << 1, var4 << 1, var7, var6, var8, 1, ((int[])((int[])var10[1]))[0] != 2);
               return;
            }
         }

         a(var0, var1, var2, var3, var6, var8, var9);
      }
   }

   static final int b(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = 0;
      float var8 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[14] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[2] * (float)var1 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[6] * (float)var2 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[10] * (float)var3;
      float var9 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[14] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[2] * (float)var4 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[6] * (float)var5 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[10] * (float)var6;
      float var10 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[15] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[3] * (float)var1 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[7] * (float)var2 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[11] * (float)var3;
      float var11 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[15] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[3] * (float)var4 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[7] * (float)var5 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[11] * (float)var6;
      if(var8 < -var10 && var9 < -var11) {
         var7 |= 16;
      } else if(var8 > var10 && var9 > var11) {
         var7 |= 32;
      }

      float var12 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[0] * (float)var1 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[4] * (float)var2 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[8] * (float)var3;
      if(var0 != null && var0.length == 6) {
         return -108;
      } else {
         float var13 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[0] * (float)var4 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[4] * (float)var5 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[8] * (float)var6;
         if(var12 < -var10 && var13 < -var11) {
            var7 |= 1;
         }

         if(var12 > var10 && var13 > var11) {
            var7 |= 2;
         }

         float var14 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[1] * (float)var1 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[5] * (float)var2 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[9] * (float)var3;
         float var15 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[1] * (float)var4 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[5] * (float)var5 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[9] * (float)var6;
         if(var14 < -var10 && var15 < -var11) {
            var7 |= 4;
         }

         if(var14 > var10 && var15 > var11) {
            var7 |= 8;
         }

         return var7;
      }
   }

   static final void a(int var0, int var1, float var2, int var3, int var4, int var5, int var6, int var7, int var8, Object[] var9) {
      if(var3 != 0 && var4 != 0) {
         if(var5 != '\uffff') {
            Object[] var10 = ((ta)var9[6]).k.a(var5, (byte)49);
            if(!((boolean[])((boolean[])var10[3]))[7]) {
               if(((int[])((int[])var9[1]))[14] != var5) {
                  cga var11 = (cga)dna.a((byte)34, (Object[])((Object[])var9[0]), (long)var5);
                  if(var11 == null) {
                     int[] var12 = n(var9, var5);
                     if(var12 == null) {
                        return;
                     }

                     int var13 = b(var9, var5)?64:((int[])((int[])var9[1]))[8];
                     var11 = ((ta)var9[6]).a(var13, -7343, 0, var12, var13, var13);
                     il.a((long)var5, var11, true, (Object[])((Object[])var9[0]));
                  }

                  ((int[])((int[])var9[1]))[14] = var5;
                  var9[9] = var11;
               }

               ((ap)var9[9]).d(var0 - var3, var1 - var4, var2, var3 << 1, var4 << 1, var7, var6, var8, 1, ((int[])((int[])var10[1]))[0] != 2);
               return;
            }
         }

         a(var0, var1, var2, var3, var6, var8, var9);
      }
   }

   static final void a(Object[] var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0[7] != null) {
         if(var3 < 0) {
            var3 = -var3;
         }

         int var6 = var2 - var3;
         if(var6 < ((int[])((int[])var0[1]))[16]) {
            var6 = ((int[])((int[])var0[1]))[16];
         }

         int var7 = var2 + var3 + 1;
         if(var7 > ((int[])((int[])var0[1]))[1]) {
            var7 = ((int[])((int[])var0[1]))[1];
         }

         int var8 = var6;
         if(var0 == null || (var0.length != 5 || !var0[4].equals(Boolean.valueOf(false))) && var0.length != 1) {
            int var9 = var3 * var3;
            int var10 = 0;
            int var11 = var2 - var6;
            int var12 = var11 * var11;
            int var13 = var12 - var11;
            if(var2 > var7) {
               var2 = var7;
            }

            int var14 = var4 >>> 24;
            int var15;
            int var17;
            int var16;
            int var18;
            if(var5 != 0 && (var5 != 1 || var14 != 255)) {
               int var19;
               int var20;
               if(var5 == 1) {
                  var4 = ((var4 & 16711935) * var14 >> 8 & 16711935) + ((var4 & '\uff00') * var14 >> 8 & '\uff00') + (var14 << 24);

                  for(var15 = 256 - var14; var8 < var2; var13 -= var11 + var11) {
                     while(var13 <= var9 || var12 <= var9) {
                        var12 += var10 + var10;
                        var13 += var10++ + var10;
                     }

                     var16 = var1 - var10 + 1;
                     if(var16 < ((int[])((int[])var0[1]))[7]) {
                        var16 = ((int[])((int[])var0[1]))[7];
                     }

                     var17 = var1 + var10;
                     if(var17 > ((int[])((int[])var0[1]))[19]) {
                        var17 = ((int[])((int[])var0[1]))[19];
                     }

                     if(var0 != null && var0.length == 3 && var0[1].equals(Integer.valueOf(1)) && var0[1].equals(Integer.valueOf(2))) {
                        return;
                     }

                     var18 = var16 + var8 * ((int[])((int[])var0[1]))[4];

                     for(var19 = var16; var19 < var17; ++var19) {
                        var20 = ((int[])((int[])var0[7]))[var18];
                        var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & '\uff00') * var15 >> 8 & '\uff00');
                        ((int[])((int[])var0[7]))[var18++] = var4 + var20;
                     }

                     ++var8;
                     var12 -= var11-- + var11;
                  }

                  if(var0 != null && (var0.length == 2 || var0.length == 3)) {
                     return;
                  }

                  var10 = var3;
                  var11 = -var11;
                  var13 = var11 * var11 + var9;
                  var12 = var13 - var3;

                  for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                     while(var13 > var9 && var12 > var9) {
                        var13 -= var10-- + var10;
                        var12 -= var10 + var10;
                     }

                     var16 = var1 - var10;
                     if(var16 < ((int[])((int[])var0[1]))[7]) {
                        var16 = ((int[])((int[])var0[1]))[7];
                     }

                     var17 = var1 + var10;
                     if(var17 > ((int[])((int[])var0[1]))[19] - 1) {
                        var17 = ((int[])((int[])var0[1]))[19] - 1;
                     }

                     if(var0 != null && var0.length == 27 && var0[13].equals(Integer.valueOf(2)) && var0[13].equals(Integer.valueOf(2))) {
                        m((Object[])null);
                     }

                     var18 = var16 + var8 * ((int[])((int[])var0[1]))[4];

                     for(var19 = var16; var19 <= var17; ++var19) {
                        var20 = ((int[])((int[])var0[7]))[var18];
                        var20 = ((var20 & 16711935) * var15 >> 8 & 16711935) + ((var20 & '\uff00') * var15 >> 8 & '\uff00');
                        ((int[])((int[])var0[7]))[var18++] = var4 + var20;
                     }

                     ++var8;
                     var13 += var11 + var11;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var0 != null && var0.length == 3) {
                     g((Object[])null, 123, -103);
                  }

                  int var21;
                  while(var8 < var2) {
                     while(var13 <= var9 || var12 <= var9) {
                        var12 += var10 + var10;
                        var13 += var10++ + var10;
                     }

                     var15 = var1 - var10 + 1;
                     if(var15 < ((int[])((int[])var0[1]))[7]) {
                        var15 = ((int[])((int[])var0[1]))[7];
                     }

                     var16 = var1 + var10;
                     if(var16 > ((int[])((int[])var0[1]))[19]) {
                        var16 = ((int[])((int[])var0[1]))[19];
                     }

                     var17 = var15 + var8 * ((int[])((int[])var0[1]))[4];

                     for(var18 = var15; var18 < var16; ++var18) {
                        var19 = ((int[])((int[])var0[7]))[var17];
                        var20 = var4 + var19;
                        var21 = (var4 & 16711935) + (var19 & 16711935);
                        var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                        ((int[])((int[])var0[7]))[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                     }

                     if(var0 != null && var0.length == 1) {
                        v((Object[])null);
                     }

                     ++var8;
                     var12 -= var11-- + var11;
                     var13 -= var11 + var11;
                  }

                  var10 = var3;
                  var11 = -var11;
                  var13 = var11 * var11 + var9;
                  var12 = var13 - var3;

                  for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                     while(var13 > var9 && var12 > var9) {
                        var13 -= var10-- + var10;
                        var12 -= var10 + var10;
                     }

                     var15 = var1 - var10;
                     if(var15 < ((int[])((int[])var0[1]))[7]) {
                        var15 = ((int[])((int[])var0[1]))[7];
                     }

                     if(var0 != null && var0.length == 8 && var0[3].equals(Boolean.valueOf(false))) {
                        return;
                     }

                     var16 = var1 + var10;
                     if(var16 > ((int[])((int[])var0[1]))[19] - 1) {
                        var16 = ((int[])((int[])var0[1]))[19] - 1;
                     }

                     var17 = var15 + var8 * ((int[])((int[])var0[1]))[4];

                     for(var18 = var15; var18 <= var16; ++var18) {
                        var19 = ((int[])((int[])var0[7]))[var17];
                        var20 = var4 + var19;
                        var21 = (var4 & 16711935) + (var19 & 16711935);
                        var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                        ((int[])((int[])var0[7]))[var17++] = var20 - var19 | var19 - (var19 >>> 8);
                     }

                     ++var8;
                     var13 += var11 + var11;
                  }
               }
            } else {
               while(var8 < var2) {
                  while(var13 <= var9 || var12 <= var9) {
                     var12 += var10 + var10;
                     var13 += var10++ + var10;
                  }

                  var15 = var1 - var10 + 1;
                  if(var15 < ((int[])((int[])var0[1]))[7]) {
                     var15 = ((int[])((int[])var0[1]))[7];
                  }

                  if(var0 != null && var0.length == 3) {
                     return;
                  }

                  var16 = var1 + var10;
                  if(var16 > ((int[])((int[])var0[1]))[19]) {
                     var16 = ((int[])((int[])var0[1]))[19];
                  }

                  var17 = var15 + var8 * ((int[])((int[])var0[1]))[4];

                  for(var18 = var15; var18 < var16; ++var18) {
                     ((int[])((int[])var0[7]))[var17++] = var4;
                  }

                  ++var8;
                  var12 -= var11-- + var11;
                  var13 -= var11 + var11;
               }

               var10 = var3;
               var11 = var8 - var2;
               var13 = var11 * var11 + var9;
               var12 = var13 - var3;

               for(var13 -= var11; var8 < var7; var12 += var11++ + var11) {
                  while(var13 > var9 && var12 > var9) {
                     var13 -= var10-- + var10;
                     var12 -= var10 + var10;
                  }

                  if(var0 != null && var0.length == 1 && var0[0].equals(Boolean.valueOf(false)) && var0[0].equals(Integer.valueOf(0))) {
                     return;
                  }

                  var15 = var1 - var10;
                  if(var15 < ((int[])((int[])var0[1]))[7]) {
                     var15 = ((int[])((int[])var0[1]))[7];
                  }

                  var16 = var1 + var10;
                  if(var16 > ((int[])((int[])var0[1]))[19] - 1) {
                     var16 = ((int[])((int[])var0[1]))[19] - 1;
                  }

                  var17 = var15 + var8 * ((int[])((int[])var0[1]))[4];

                  for(var18 = var15; var18 <= var16; ++var18) {
                     ((int[])((int[])var0[7]))[var17++] = var4;
                  }

                  ++var8;
                  var13 += var11 + var11;
               }
            }

         }
      }
   }

   static final boolean r(Object[] var0) {
      return false;
   }

   static final void h(Object[] var0) {
      if(((boolean[])((boolean[])var0[8]))[0]) {
         dla.a(true, 32396, false);
         ((boolean[])((boolean[])var0[8]))[0] = false;
      }

      ((boolean[])((boolean[])var0[8]))[1] = true;
   }

   static final int h(Object[] var0, int var1) {
      return ((short[])((short[])((ta)var0[6]).k.a(var1, (byte)102)[2]))[0] & '\uffff';
   }

   private static final void e(vsa var0, int var1, int var2, float var3, int var4, Object[] var5) {
      int var6 = var0.x;
      int var7 = var4;
      var4 <<= 1;
      if(var6 == -1) {
         a(var1, var2, var3, var7, var0.A, 1, var5);
      } else {
         if(((int[])((int[])var5[1]))[14] != var6) {
            cga var8 = (cga)dna.a((byte)34, (Object[])((Object[])var5[0]), (long)var6);
            if(var8 == null) {
               int[] var9 = n(var5, var6);
               if(var9 == null) {
                  return;
               }

               int var10 = b(var5, var6)?64:((int[])((int[])var5[1]))[8];
               var8 = ((ta)var5[6]).a(var10, -7343, 0, var9, var10, var10);
               il.a((long)var6, var8, true, (Object[])((Object[])var5[0]));
            }

            ((int[])((int[])var5[1]))[14] = var6;
            var5[9] = var8;
         }

         ++var4;
         ((ap)var5[9]).f(var1 - var7, var2 - var7, var3, var4, var4, 0, var0.A, 1, 1, false);
      }

   }

   private static final void x(Object[] var0) {
      ((boolean[])((boolean[])var0[8]))[1] = false;
      ((boolean[])((boolean[])var0[8]))[0] = false;
      ((int[])((int[])var0[1]))[7] = 0;
      ((int[])((int[])var0[1]))[19] = 0;
      ((int[])((int[])var0[1]))[16] = 0;
      ((int[])((int[])var0[1]))[1] = 0;
      ((int[])((int[])var0[1]))[5] = '\ub2ff';
      ((int[])((int[])var0[1]))[11] = 78642;
      if(var0 != null && var0.length == 3 && var0[2].equals(Integer.valueOf(2))) {
         a((Object[])null, (aea)null, false);
      }

      ((int[])((int[])var0[1]))[6] = 75518;
      var0[4] = new float[6][4];
      ((float[])((float[])var0[10]))[4] = 1.0F;
      ((float[])((float[])var0[10]))[5] = 0.0F;
      ((int[])((int[])var0[1]))[8] = 128;
      ((boolean[])((boolean[])var0[8]))[2] = false;
      var0[0] = sj.a(16, new Object[3], (byte)-75);
      ((int[])((int[])var0[1]))[14] = -1;
   }

   static final Object[] a(Object[] var0, Runnable var1) {
      for(int var2 = 0; var2 < ((int[])((int[])var0[1]))[10]; ++var2) {
         if(((Object[][])((Object[][])var0[3]))[var2][12] == var1) {
            return ((Object[][])((Object[][])var0[3]))[var2];
         }
      }

      return null;
   }

   static final void b(int var0, int var1, float var2, int var3, int var4, int var5, int var6, int var7, int var8, Object[] var9) {
      if(var3 != 0 && var4 != 0) {
         if(var5 != '\uffff') {
            Object[] var10 = ((ta)var9[6]).k.a(var5, (byte)86);
            if(!((boolean[])((boolean[])var10[3]))[7]) {
               if(((int[])((int[])var9[1]))[14] != var5) {
                  cga var11 = (cga)dna.a((byte)34, (Object[])((Object[])var9[0]), (long)var5);
                  if(var11 == null) {
                     int[] var12 = n(var9, var5);
                     if(var12 == null) {
                        return;
                     }

                     int var13 = b(var9, var5)?64:((int[])((int[])var9[1]))[8];
                     var11 = ((ta)var9[6]).a(var13, -7343, 0, var12, var13, var13);
                     il.a((long)var5, var11, true, (Object[])((Object[])var9[0]));
                  }

                  ((int[])((int[])var9[1]))[14] = var5;
                  var9[9] = var11;
               }

               ((ap)var9[9]).c(var0 - var3, var1 - var4, var2, var3 << 1, var4 << 1, var7, var6, var8, 1, ((int[])((int[])var10[1]))[0] != 2);
               return;
            }
         }

         a(var0, var1, var2, var3, var6, var8, var9);
      }
   }

   static final Object[] u(Object[] var0) {
      return ona.a(new Object[2], (Object[])((Object[])var0[13]), (byte)125);
   }

   static final void y(Object[] var0) {}

   static final void a(Object[] var0, int var1, int var2) {
      if((var1 & 1) != 0) {
         a(var0, 0, 0, ((int[])((int[])var0[1]))[4], ((int[])((int[])var0[1]))[12], var2, 0);
      }

      if((var1 & 2) != 0) {
         a(var0);
      }

   }

   private static final void c(vsa var0, int var1, int var2, float var3, int var4, Object[] var5) {
      int var6 = var0.x;
      int var7 = var4;
      var4 <<= 1;
      if(var6 == -1) {
         b(var1, var2, var3, var7, var0.A, 1, var5);
      } else {
         if(((int[])((int[])var5[1]))[14] != var6) {
            cga var8 = (cga)dna.a((byte)34, (Object[])((Object[])var5[0]), (long)var6);
            if(var8 == null) {
               int[] var9 = n(var5, var6);
               if(var9 == null) {
                  return;
               }

               int var10 = b(var5, var6)?64:((int[])((int[])var5[1]))[8];
               var8 = ((ta)var5[6]).a(var10, -7343, 0, var9, var10, var10);
               il.a((long)var6, var8, true, (Object[])((Object[])var5[0]));
            }

            ((int[])((int[])var5[1]))[14] = var6;
            var5[9] = var8;
         }

         ++var4;
         ((ap)var5[9]).g(var1 - var7, var2 - var7, var3, var4, var4, 0, var0.A, 1, 1, false);
      }

   }

   static final boolean d(Object[] var0) {
      return false;
   }

   static final void i(Object[] var0, int var1) {
      int var2 = var1 - ((int[])((int[])var0[1]))[0];

      Object var13;
      label69:
      for(Object var3 = kja.b(-23, (Object[])((Object[])var0[2])); var3 != null; var3 = var13) {
         hea var4 = (hea)var3;
         if(var4.o) {
            var4.j += var2;
            int var5 = var4.j / 50;
            if(var5 > 0) {
               Object[] var6 = ((ta)var0[6]).k.a(var4.f_l, (byte)66);
               float var7 = ((boolean[])((boolean[])var6[3]))[4]?64.0F:128.0F;
               var4.a((int)((float)var2 / 1000.0F * (float)((byte[])((byte[])var6[0]))[5] / 64.0F * var7), (int)((float)var2 / 1000.0F * (float)((byte[])((byte[])var6[0]))[6] / 64.0F * var7));
               var4.j -= var5 * 50;
            }

            var4.o = false;
         }

         Object[] var14 = (Object[])((Object[])var0[2]);
         if(var14 != null && (1 == var14.length || var14.length == 1)) {
            return;
         }

         Object[] var12;
         wg var15;
         for(Object[] var10 = null == (var15 = (wg)nda.a(1, (Object[])((Object[])var14[0])))?null:var15.t; null != var10; ((int[])((int[])var14[1]))[0] += ((int[])((int[])var12[1]))[0]) {
            Object var11 = cq.a((byte)81, var10);
            if(var11 != null) {
               var13 = var11;
               continue label69;
            }

            var12 = var10;
            wg var16;
            var10 = null != (var16 = (wg)nda.a(1, (Object[])((Object[])var14[0])))?var16.t:null;
            ((lm)(var12 == null?null:var12[0])).a((byte)106);
            ((tha)(var12 != null?var12[0]:null)).a(8192);
         }

         var13 = null;
      }

      ((int[])((int[])var0[1]))[0] = var1;
      fua.a(-47, (Object[])((Object[])var0[0]), 5);
      fua.a(-55, (Object[])((Object[])var0[2]), 5);
   }

   static final void j(Object[] var0, int var1) {
      Object[] var2 = ((Object[][])((Object[][])var0[3]))[var1];
      Object var3 = null;
      var2[12] = var3;
   }

   static final void c(int var0, int var1, float var2, int var3, int var4, int var5, int var6, int var7, int var8, Object[] var9) {
      if(var3 != 0 && var4 != 0) {
         if(var5 != '\uffff') {
            Object[] var10 = ((ta)var9[6]).k.a(var5, (byte)88);
            if(!((boolean[])((boolean[])var10[3]))[7]) {
               if(((int[])((int[])var9[1]))[14] != var5) {
                  cga var11 = (cga)dna.a((byte)34, (Object[])((Object[])var9[0]), (long)var5);
                  if(var11 == null) {
                     int[] var12 = n(var9, var5);
                     if(var12 == null) {
                        return;
                     }

                     int var13 = b(var9, var5)?64:((int[])((int[])var9[1]))[8];
                     var11 = ((ta)var9[6]).a(var13, -7343, 0, var12, var13, var13);
                     il.a((long)var5, var11, true, (Object[])((Object[])var9[0]));
                  }

                  ((int[])((int[])var9[1]))[14] = var5;
                  var9[9] = var11;
               }

               ((ap)var9[9]).g(var0 - var3, var1 - var4, var2, var3 << 1, var4 << 1, var7, var6, var8, 1, ((int[])((int[])var10[1]))[0] != 2);
               return;
            }
         }

         b(var0, var1, var2, var3, var6, var8, var9);
      }
   }

   static final Object[] z(Object[] var0) {
      return dda.a(1, 0L, new Object[4], -127, "CPU", "Pure Java", 0);
   }

   static final String a(int var0, byte var1, int var2) {
      ++e;
      int var3 = -var2 + var0;
      if(-9 > var3) {
         return el.a(16711680, 0);
      } else {
         if(var1 <= 80) {
            a((Object[])((Object[])a[0]), 9, (Class_s)a[0], ((int[])((int[])a[0]))[5], 60);
         }

         return -6 > var3?el.a(16723968, 0):(-3 <= var3?(var3 < 0?el.a(16756736, 0):(9 < var3?el.a('\uff00', 0):(6 >= var3?(3 >= var3?(var3 <= 0?el.a(16776960, 0):el.a(12648192, 0)):el.a(8453888, 0)):el.a(4259584, 0)))):el.a(16740352, 0));
      }
   }

   static final ja a(Object[] var0, Object[] var1, aea[] var2, boolean var3) {
      if(var1 != null && var1.length == 20 && var1[2].equals(Boolean.valueOf(false))) {
         return null;
      } else {
         int[] var7 = new int[var2.length];
         int[] var8 = new int[var2.length];
         boolean var9 = false;

         for(int var10 = 0; var10 < var2.length; ++var10) {
            var7[var10] = var2[var10].a;
            var8[var10] = var2[var10].h;
            if(var2[var10].e != null) {
               var9 = true;
            }
         }

         if(var3) {
            if(var9) {
               Object[] var4;
               return (ja)((var4 = ok.a(new Object[7], var0, var1, var2, var7, var8)) == null?null:var4[1]);
            } else {
               Object[] var5;
               return (ja)((var5 = eg.a(new Object[7], var0, var1, var2, var7, var8)) == null?null:var5[5]);
            }
         } else if(var9) {
            throw new IllegalArgumentException("");
         } else {
            Object[] var6;
            return (ja)((var6 = ib.a(new Object[8], var0, var1, var2, var7, var8)) == null?null:var6[4]);
         }
      }
   }

   static final void c(Object[] var0, float var1, float var2, float var3, float[] var4) {
      float var5 = ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[15] + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[3] * var1 + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[7] * var2 + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[11] * var3;
      float var6 = ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[0] * var1 + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[4] * var2 + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[8] * var3;
      float var7 = ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[1] * var1 + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[5] * var2 + ((float[])((float[])((Object[])((Object[])var0[13]))[0]))[9] * var3;
      var4[0] = ((float[])((float[])var0[10]))[0] + ((float[])((float[])var0[10]))[2] * var6 / var5;
      var4[1] = ((float[])((float[])var0[10]))[1] + ((float[])((float[])var0[10]))[3] * var7 / var5;
      var4[2] = var3;
   }

   static final boolean v(Object[] var0) {
      return false;
   }

   static final void e(int var0, int var1, float var2, int var3, int var4, int var5, int var6, int var7, int var8, Object[] var9) {
      if(var3 != 0 && var4 != 0) {
         if(var5 != '\uffff') {
            Object[] var10 = ((ta)var9[6]).k.a(var5, (byte)34);
            if(!((boolean[])((boolean[])var10[3]))[7]) {
               if(((int[])((int[])var9[1]))[14] != var5) {
                  cga var11 = (cga)dna.a((byte)34, (Object[])((Object[])var9[0]), (long)var5);
                  if(var11 == null) {
                     int[] var12 = n(var9, var5);
                     if(var12 == null) {
                        return;
                     }

                     int var13 = b(var9, var5)?64:((int[])((int[])var9[1]))[8];
                     var11 = ((ta)var9[6]).a(var13, -7343, 0, var12, var13, var13);
                     il.a((long)var5, var11, true, (Object[])((Object[])var9[0]));
                  }

                  ((int[])((int[])var9[1]))[14] = var5;
                  var9[9] = var11;
               }

               ((ap)var9[9]).h(var0 - var3, var1 - var4, var2, var3 << 1, var4 << 1, var7, var6, var8, 1, ((int[])((int[])var10[1]))[0] != 2);
               return;
            }
         }

         b(var0, var1, var2, var3, var6, var8, var9);
      }
   }

   static final void m(Object[] var0, int var1) {
      ((int[])((int[])var0[1]))[10] = var1;
      var0[3] = new Object[((int[])((int[])var0[1]))[10]][];

      for(int var2 = 0; var2 < ((int[])((int[])var0[1]))[10]; ++var2) {
         Object[][] var3 = (Object[][])((Object[][])var0[3]);
         Object[] var6 = new Object[31];
         if(null == var6[18]) {
            var6[18] = new float[9];
         }

         if(var6[2] == null) {
            var6[2] = new boolean[3];
         }

         if(null == var6[1]) {
            var6[1] = new int[5];
         }

         ((float[])((float[])var6[18]))[4] = 0.85F;
         ((float[])((float[])var6[18]))[8] = -((float[])((float[])var6[18]))[4] + 1.0F;
         ((boolean[])((boolean[])var6[2]))[2] = false;
         ((int[])((int[])var6[1]))[1] = 0;
         ((int[])((int[])var6[1]))[0] = 0;
         ((boolean[])((boolean[])var6[2]))[1] = true;
         ((int[])((int[])var6[1]))[2] = 0;
         ((int[])((int[])var6[1]))[3] = 0;
         var6[28] = ab.a(new Object[2], (byte)-85);
         var6[29] = im.a(new Object[2], (int)-16365);
         if(var6 != null && -3 == ~var6.length) {
            return;
         }

         var6[16] = im.a(new Object[2], (int)-16365);
         var6[27] = ab.a(new Object[2], (byte)76);
         var6[9] = ab.a(new Object[2], (byte)122);
         ((float[])((float[])var6[18]))[6] = 1.0F;
         var6[7] = new int[10000];
         ((float[])((float[])var6[18]))[0] = 1.0F;
         var6[25] = new float[64];
         var6[5] = new float[3];
         var6[21] = new float[64];
         var6[15] = new float[dpa.z];
         var6[22] = new float[dpa.z];
         var6[0] = new int[10000];
         var6[14] = new dpa[7];
         var6[8] = new float[64];
         var6[4] = new int[8];
         var6[11] = new float[64];
         var6[26] = new int[8];
         var6[3] = new dpa[7];
         var6[13] = new float[dpa.z];
         var6[10] = new float[64];
         ((float[])((float[])var6[18]))[2] = 0.0F;
         var6[24] = new float[dpa.z];
         var6[20] = new int[dpa.z];
         var6[30] = new float[2];
         var6[19] = new int[8];
         var6[23] = var0;
         var6[17] = new uo(var0, var6);

         int var7;
         for(var7 = 0; 7 > var7; ++var7) {
            ((dpa[])((dpa[])var6[14]))[var7] = new dpa((Object[])((Object[])var6[23]));
            ((dpa[])((dpa[])var6[3]))[var7] = new dpa((Object[])((Object[])var6[23]));
         }

         var6[6] = new int[dpa.G];

         for(var7 = 0; dpa.G > var7; ++var7) {
            ((int[])((int[])var6[6]))[var7] = -1;
         }

         if(null != var0 && 3 == var0.length) {
            v((Object[])null);
         }

         var3[var2] = var6;
      }

   }

   static final boolean o(Object[] var0, int var1) {
      return ((boolean[])((boolean[])((ta)var0[6]).k.a(var1, (byte)37)[3]))[1] || ((boolean[])((boolean[])((ta)var0[6]).k.a(var1, (byte)92)[3]))[5];
   }

   private static final void b(int var0, int var1, float var2, int var3, int var4, int var5, Object[] var6) {
      if(var6[7] != null) {
         if(var3 < 0) {
            var3 = -var3;
         }

         int var7 = var1 - var3;
         if(var7 < ((int[])((int[])var6[1]))[16]) {
            var7 = ((int[])((int[])var6[1]))[16];
         }

         int var8 = var1 + var3 + 1;
         if(var8 > ((int[])((int[])var6[1]))[1]) {
            var8 = ((int[])((int[])var6[1]))[1];
         }

         int var9 = var7;
         int var10 = var3 * var3;
         int var11 = 0;
         int var12 = var1 - var7;
         int var13 = var12 * var12;
         int var14 = var13 - var12;
         if(var1 > var8) {
            var1 = var8;
         }

         int var15 = var4 >>> 24;
         if(var6 != null && (var6.length == 1 && var6[0].equals(Integer.valueOf(1)) || var6.length == 1)) {
            a((Object[])null, -121, 115, -120, -53, -43, 106);
         }

         int var17;
         int var16;
         int var19;
         int var18;
         if(var5 != 0 && (var5 != 1 || var15 != 255)) {
            int var21;
            int var20;
            if(var5 == 1) {
               var4 = ((var4 & 16711935) * var15 >> 8 & 16711935) + ((var4 & '\uff00') * var15 >> 8 & '\uff00') + (var15 << 24);

               for(var16 = 256 - var15; var9 < var1; var14 -= var12 + var12) {
                  while(var14 <= var10 || var13 <= var10) {
                     var13 += var11 + var11;
                     var14 += var11++ + var11;
                  }

                  var17 = var0 - var11 + 1;
                  if(var17 < ((int[])((int[])var6[1]))[7]) {
                     var17 = ((int[])((int[])var6[1]))[7];
                  }

                  var18 = var0 + var11;
                  if(var18 > ((int[])((int[])var6[1]))[19]) {
                     var18 = ((int[])((int[])var6[1]))[19];
                  }

                  var19 = var17 + var9 * ((int[])((int[])var6[1]))[4];

                  for(var20 = var17; var20 < var18; ++var20) {
                     var21 = ((int[])((int[])var6[7]))[var19];
                     var21 = ((var21 & 16711935) * var16 >> 8 & 16711935) + ((var21 & '\uff00') * var16 >> 8 & '\uff00');
                     ((int[])((int[])var6[7]))[var19] = var4 + var21;
                     ++var19;
                  }

                  ++var9;
                  if(var6 != null && var6.length == 3 && var6[1].equals(Boolean.valueOf(false))) {
                     g((Object[])null);
                  }

                  var13 -= var12-- + var12;
               }

               var11 = var3;
               var12 = -var12;
               var14 = var12 * var12 + var10;
               var13 = var14 - var3;

               for(var14 -= var12; var9 < var8; var13 += var12++ + var12) {
                  while(var14 > var10 && var13 > var10) {
                     var14 -= var11-- + var11;
                     var13 -= var11 + var11;
                  }

                  var17 = var0 - var11;
                  if(var17 < ((int[])((int[])var6[1]))[7]) {
                     var17 = ((int[])((int[])var6[1]))[7];
                  }

                  var18 = var0 + var11;
                  if(var18 > ((int[])((int[])var6[1]))[19] - 1) {
                     var18 = ((int[])((int[])var6[1]))[19] - 1;
                  }

                  var19 = var17 + var9 * ((int[])((int[])var6[1]))[4];

                  for(var20 = var17; var20 <= var18; ++var20) {
                     var21 = ((int[])((int[])var6[7]))[var19];
                     var21 = ((var21 & 16711935) * var16 >> 8 & 16711935) + ((var21 & '\uff00') * var16 >> 8 & '\uff00');
                     ((int[])((int[])var6[7]))[var19] = var4 + var21;
                     ++var19;
                  }

                  ++var9;
                  if(var6 != null && var6.length == 1 && var6[0].equals(Integer.valueOf(0))) {
                     return;
                  }

                  var14 += var12 + var12;
               }

               if(var6 != null && var6.length == 9) {
                  v((Object[])null);
               }
            } else {
               if(var5 != 2) {
                  throw new IllegalArgumentException();
               }

               int var22;
               while(var9 < var1) {
                  if(var6 != null && var6.length == 17) {
                     return;
                  }

                  while(var14 <= var10 || var13 <= var10) {
                     var13 += var11 + var11;
                     var14 += var11++ + var11;
                  }

                  var16 = var0 - var11 + 1;
                  if(var16 < ((int[])((int[])var6[1]))[7]) {
                     var16 = ((int[])((int[])var6[1]))[7];
                  }

                  var17 = var0 + var11;
                  if(var17 > ((int[])((int[])var6[1]))[19]) {
                     var17 = ((int[])((int[])var6[1]))[19];
                  }

                  var18 = var16 + var9 * ((int[])((int[])var6[1]))[4];

                  for(var19 = var16; var19 < var17; ++var19) {
                     var20 = ((int[])((int[])var6[7]))[var18];
                     var21 = var4 + var20;
                     var22 = (var4 & 16711935) + (var20 & 16711935);
                     var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                     ((int[])((int[])var6[7]))[var18] = var21 - var20 | var20 - (var20 >>> 8);
                     ++var18;
                  }

                  ++var9;
                  var13 -= var12-- + var12;
                  var14 -= var12 + var12;
               }

               var11 = var3;
               var12 = -var12;
               if(var6 != null && var6.length == 1) {
                  i((Object[])null);
               }

               var14 = var12 * var12 + var10;
               var13 = var14 - var3;

               for(var14 -= var12; var9 < var8; var13 += var12++ + var12) {
                  while(var14 > var10 && var13 > var10) {
                     var14 -= var11-- + var11;
                     var13 -= var11 + var11;
                  }

                  var16 = var0 - var11;
                  if(var16 < ((int[])((int[])var6[1]))[7]) {
                     var16 = ((int[])((int[])var6[1]))[7];
                  }

                  var17 = var0 + var11;
                  if(var17 > ((int[])((int[])var6[1]))[19] - 1) {
                     var17 = ((int[])((int[])var6[1]))[19] - 1;
                  }

                  var18 = var16 + var9 * ((int[])((int[])var6[1]))[4];

                  for(var19 = var16; var19 <= var17; ++var19) {
                     var20 = ((int[])((int[])var6[7]))[var18];
                     var21 = var4 + var20;
                     var22 = (var4 & 16711935) + (var20 & 16711935);
                     var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                     ((int[])((int[])var6[7]))[var18] = var21 - var20 | var20 - (var20 >>> 8);
                     ++var18;
                  }

                  ++var9;
                  var14 += var12 + var12;
                  if(var6 != null && var6.length == 27 && var6[6].equals(Integer.valueOf(2))) {
                     return;
                  }
               }
            }
         } else {
            while(var9 < var1) {
               while(var14 <= var10 || var13 <= var10) {
                  var13 += var11 + var11;
                  var14 += var11++ + var11;
               }

               var16 = var0 - var11 + 1;
               if(var16 < ((int[])((int[])var6[1]))[7]) {
                  var16 = ((int[])((int[])var6[1]))[7];
               }

               var17 = var0 + var11;
               if(var17 > ((int[])((int[])var6[1]))[19]) {
                  var17 = ((int[])((int[])var6[1]))[19];
               }

               var18 = var16 + var9 * ((int[])((int[])var6[1]))[4];
               if(var6 != null && var6.length == 2) {
                  b((Object[])null, 4, (Object[])null);
               }

               for(var19 = var16; var19 < var17; ++var19) {
                  ((int[])((int[])var6[7]))[var18] = var4;
                  ++var18;
               }

               ++var9;
               var13 -= var12-- + var12;
               var14 -= var12 + var12;
            }

            var11 = var3;
            if(var6 != null && var6.length == 8) {
               return;
            }

            var12 = var9 - var1;
            var14 = var12 * var12 + var10;
            var13 = var14 - var3;

            for(var14 -= var12; var9 < var8; var13 += var12++ + var12) {
               while(var14 > var10 && var13 > var10) {
                  var14 -= var11-- + var11;
                  var13 -= var11 + var11;
               }

               var16 = var0 - var11;
               if(var16 < ((int[])((int[])var6[1]))[7]) {
                  var16 = ((int[])((int[])var6[1]))[7];
               }

               var17 = var0 + var11;
               if(var6 != null && var6.length == 13 && var6[3].equals(Integer.valueOf(0)) && var6[3].equals(Integer.valueOf(2))) {
                  k((Object[])null, 100);
               }

               if(var17 > ((int[])((int[])var6[1]))[19] - 1) {
                  var17 = ((int[])((int[])var6[1]))[19] - 1;
               }

               var18 = var16 + var9 * ((int[])((int[])var6[1]))[4];

               for(var19 = var16; var19 <= var17; ++var19) {
                  ((int[])((int[])var6[7]))[var18] = var4;
                  ++var18;
               }

               ++var9;
               var14 += var12 + var12;
            }
         }

      }
   }

   static final cga a(Object[] var0, aea var1, boolean var2) {
      int[] var3 = var1.f_i;
      byte[] var4 = var1.c;
      int var5 = var1.a;
      int var6 = var1.h;
      Object var7;
      int[] var8;
      byte[] var9;
      int var10;
      int var11;
      int var12;
      if(var2 && var1.e == null) {
         var8 = new int[var3.length];
         var9 = new byte[var5 * var6];
         if(var0 != null && var0.length == 2 && var0[0].equals(Integer.valueOf(2)) && var0[0].equals(Integer.valueOf(0))) {
            return null;
         }

         for(var10 = 0; var10 < var6; ++var10) {
            var11 = var10 * var5;

            for(var12 = 0; var12 < var5; ++var12) {
               var9[var11 + var12] = var4[var11 + var12];
            }
         }

         for(var10 = 0; var10 < var3.length; ++var10) {
            var8[var10] = var3[var10];
         }

         var7 = new hs(var0, var9, var8, var5, var6);
      } else {
         var8 = new int[var5 * var6];
         var9 = var1.e;
         if(var9 != null) {
            var10 = 0;

            while(true) {
               if(var10 >= var6) {
                  if(var0 != null && var0.length == 20 && var0[2].equals(Boolean.valueOf(false))) {
                     a((Object[])null, 38);
                  }

                  var7 = new um(var0, var8, var5, var6);
                  break;
               }

               if(var0 != null && (var0.length == 2 || var0.length == 2)) {
                  return null;
               }

               var11 = var10 * var5;

               for(var12 = 0; var12 < var5; ++var12) {
                  var8[var11 + var12] = var3[var4[var11 + var12] & 255] | var9[var11 + var12] << 24;
               }

               ++var10;
            }
         } else {
            if(var0 != null && var0.length == 3) {
               d((Object[])null, 91, 103, 75, 16);
            }

            for(var10 = 0; var10 < var6; ++var10) {
               if(var0 != null && var0.length == 2 && var0[1].equals(Boolean.valueOf(false))) {
                  return null;
               }

               var11 = var10 * var5;

               for(var12 = 0; var12 < var5; ++var12) {
                  int var13 = var3[var4[var11 + var12] & 255];
                  var8[var11 + var12] = var13 != 0?-16777216 | var13:0;
               }
            }

            var7 = new hra(var0, var8, var5, var6);
         }
      }

      ((cga)var7).a(var1.f, var1.b, var1.d, var1.g);
      return (cga)var7;
   }

   private static final void e(Object[] var0, Object[] var1) {
      if(var0 != null && var0.length == 3) {
         j(new Object[16][], 48);
      }

      Object[] var2 = a(var1, (Runnable)Thread.currentThread());
      va var3 = (va)((Object[])((Object[])var0[0]))[1];

      for(va var4 = var3.p; var4 != var3; var4 = var4.p) {
         vsa var5 = (vsa)var4;
         int var6 = var5.B >> 12;
         int var7 = var5.z >> 12;
         int var8 = var5.v >> 12;
         float var9 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[14] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[2] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[6] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[10] * (float)var8;
         float var10 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[15] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[3] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[7] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[11] * (float)var8;
         if(var9 >= -var10) {
            float var11 = ((float[])((float[])var1[10]))[5] + ((float[])((float[])var1[10]))[4] * var9 / var10;
            if(var9 <= ((float[])((float[])var2[18]))[4]) {
               float var12 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[0] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[4] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[8] * (float)var8;
               float var13 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[1] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[5] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[9] * (float)var8;
               if(var12 >= -var10 && var12 <= var10 && var13 >= -var10 && var13 <= var10) {
                  if(var2 != null && var2.length == 7 && var2[3].equals(Integer.valueOf(1))) {
                     return;
                  }

                  float var14 = (float)var5.C / 4096.0F;
                  float var15 = var12 + ((float[])((float[])((Object[])((Object[])var1[13]))[0]))[0] * var14;
                  float var16 = var10 + ((float[])((float[])((Object[])((Object[])var1[13]))[0]))[3] * var14;
                  float var17 = ((float[])((float[])var1[10]))[0] + ((float[])((float[])var1[10]))[2] * var12 / var10;
                  float var18 = ((float[])((float[])var1[10]))[1] + ((float[])((float[])var1[10]))[3] * var13 / var10;
                  float var19 = ((float[])((float[])var1[10]))[0] + ((float[])((float[])var1[10]))[2] * var15 / var16;
                  a(var5, (int)var17, (int)var18, var11, (int)(var19 < var17?var17 - var19:var19 - var17), var1);
               }
            }
         }
      }

   }

   static final boolean f(Object[] var0, int var1) {
      ++b;
      if(var0 != null && var0.length == 16) {
         return pta.a(-29708, var0);
      } else {
         if(var1 > -12) {
            c = true;
         }

         if(var0 != null && var0.length == 12) {
            return qga.a(var0, (byte)120);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void J(Object[] var0) {
      dq.a(-122, (Object[])((Object[])var0[2]));
      dq.a(-97, (Object[])((Object[])var0[0]));
   }

   static final void K(Object[] var0) {}

   static final void c(Object[] var0, int var1, int var2) throws cr {
      ((ta)var0[6]).m.a(var1, var2);
   }

   static final int f(Object[] var0, int var1, int var2) {
      var1 |= 133120;
      return var1 & var2 ^ var2;
   }

   static final za g(Object[] var0, int var1) {
      return null;
   }

   static final void i(Object[] var0, Object[] var1) {
      sea.a(var1, (Object[])((Object[])var0[13]), (byte)67);
      s(var0);
   }

   static final void d(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      c(var0, var1, var2, var3, var5, var6);
      c(var0, var1, var2 + var4 - 1, var3, var5, var6);
      b(var0, var1, var2 + 1, var4 - 2, var5, var6);
      b(var0, var1 + var3 - 1, var2 + 1, var4 - 2, var5, var6);
   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      Object[] var3 = a(var0, (Runnable)Thread.currentThread());
      ((int[])((int[])var3[1]))[2] = var1;
      ((int[])((int[])var3[1]))[1] = ((int[])((int[])var2[0]))[1];
      ((int[])((int[])var3[1]))[3] = ((int[])((int[])var2[0]))[5];
   }

   static final void t(Object[] var0) {}

   static final boolean I(Object[] var0) {
      return false;
   }

   static final cga a(Object[] var0, int var1, int var2, int var3, int var4, boolean var5) {
      if(var0[7] == null) {
         throw new IllegalStateException("");
      } else {
         int[] var6 = new int[var3 * var4];
         int var7 = var2 * ((int[])((int[])var0[1]))[4] + var1;
         int var8 = ((int[])((int[])var0[1]))[4] - var3;
         if(var0 != null && var0.length == 10) {
            m((Object[])null);
         }

         for(int var9 = 0; var9 < var4; ++var9) {
            int var10 = var9 * var3;

            for(int var11 = 0; var11 < var3; ++var11) {
               var6[var10 + var11] = ((int[])((int[])var0[7]))[var7++];
            }

            if(var0 != null && var0.length == 1 && var0[0].equals(Integer.valueOf(0)) && var0[0].equals(Integer.valueOf(0))) {
               a((Object[])null, -13, 34, 17, 72, -97);
            }

            var7 += var8;
         }

         if(var5) {
            return new um(var0, var6, var3, var4);
         } else {
            return new hra(var0, var6, var3, var4);
         }
      }
   }

   static final void b(Object[] var0, Object[] var1) {
      boolean var2 = var0[7] != null;
      boolean var3 = var0[12] != null;
      if(var2) {
         if(var3) {
            a(var1, var0);
         } else {
            e(var1, var0);
         }
      } else if(var3) {
         g(var1, var0);
      } else {
         h(var1, var0);
      }

   }

   static final void a(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(var0[7] != null) {
         var3 -= var1;
         var4 -= var2;
         int var10;
         if(var4 == 0) {
            if(var3 >= 0) {
               b(var0, var1, var2, var3 + 1, var5, var6, var7, var8, var9);
            } else {
               var10 = var7 + var8;
               var9 %= var10;
               var9 = var10 + var7 - var9 - (-var3 + 1) % var10;
               var9 %= var10;
               if(var9 < 0) {
                  var9 += var10;
               }

               b(var0, var1 + var3, var2, -var3 + 1, var5, var6, var7, var8, var9);
            }

         } else if(var3 == 0) {
            if(var4 >= 0) {
               a(var0, var1, var2, var4 + 1, var5, var6, var7, var8, var9);
            } else {
               var10 = var7 + var8;
               var9 %= var10;
               var9 = var10 + var7 - var9 - (-var4 + 1) % var10;
               var9 %= var10;
               if(var9 < 0) {
                  var9 += var10;
               }

               a(var0, var1, var2 + var4, -var4 + 1, var5, var6, var7, var8, var9);
            }

         } else {
            var9 <<= 8;
            var7 <<= 8;
            var8 <<= 8;
            var10 = var7 + var8;
            var9 %= var10;
            int var11;
            int var12;
            if(var3 + var4 < 0) {
               var11 = (int)(Math.sqrt((double)(var3 * var3 + var4 * var4)) * 256.0D);
               var12 = var11 % var10;
               var9 = var10 + var7 - var9 - var12;
               var9 %= var10;
               if(var9 < 0) {
                  var9 += var10;
               }

               var1 += var3;
               var3 = -var3;
               var2 += var4;
               var4 = -var4;
            }

            int var13;
            int var14;
            int var15;
            int var17;
            int var16;
            int var18;
            if(var3 > var4) {
               var2 <<= 16;
               var2 += '\u8000';
               var4 <<= 16;
               var11 = (int)Math.floor((double)var4 / (double)var3 + 0.5D);
               var3 += var1;
               var12 = var5 >>> 24;
               var13 = (int)Math.sqrt((double)(65536 + (var11 >> 8) * (var11 >> 8)));
               if(var6 != 0 && (var6 != 1 || var12 != 255)) {
                  if(var6 == 1) {
                     var5 = ((var5 & 16711935) * var12 >> 8 & 16711935) + ((var5 & '\uff00') * var12 >> 8 & '\uff00') + (var12 << 24);

                     for(var14 = 256 - var12; var1 <= var3; var9 %= var10) {
                        var15 = var2 >> 16;
                        if(var1 >= ((int[])((int[])var0[1]))[7] && var1 < ((int[])((int[])var0[1]))[19] && var15 >= ((int[])((int[])var0[1]))[16] && var15 < ((int[])((int[])var0[1]))[1] && var9 < var7) {
                           var16 = var1 + var15 * ((int[])((int[])var0[1]))[4];
                           var17 = ((int[])((int[])var0[7]))[var16];
                           var17 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & '\uff00') * var14 >> 8 & '\uff00');
                           ((int[])((int[])var0[7]))[var16] = var5 + var17;
                        }

                        var2 += var11;
                        ++var1;
                        var9 += var13;
                     }

                     if(var0 != null && var0.length == 5) {
                        return;
                     }
                  } else {
                     if(var6 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var0 != null && var0.length == 6) {
                        c((Object[])null, -20, 14, 119, -111, 91);
                     }

                     while(var1 <= var3) {
                        var14 = var2 >> 16;
                        if(var1 >= ((int[])((int[])var0[1]))[7] && var1 < ((int[])((int[])var0[1]))[19] && var14 >= ((int[])((int[])var0[1]))[16] && var14 < ((int[])((int[])var0[1]))[1] && var9 < var7) {
                           var15 = var1 + var14 * ((int[])((int[])var0[1]))[4];
                           var16 = ((int[])((int[])var0[7]))[var15];
                           var17 = var5 + var16;
                           var18 = (var5 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           ((int[])((int[])var0[7]))[var15] = var17 - var16 | var16 - (var16 >>> 8);
                        }

                        var2 += var11;
                        ++var1;
                        var9 += var13;
                        var9 %= var10;
                     }
                  }
               } else {
                  while(var1 <= var3) {
                     var14 = var2 >> 16;
                     if(var1 >= ((int[])((int[])var0[1]))[7] && var1 < ((int[])((int[])var0[1]))[19] && var14 >= ((int[])((int[])var0[1]))[16] && var14 < ((int[])((int[])var0[1]))[1] && var9 < var7) {
                        ((int[])((int[])var0[7]))[var1 + var14 * ((int[])((int[])var0[1]))[4]] = var5;
                     }

                     var2 += var11;
                     ++var1;
                     var9 += var13;
                     var9 %= var10;
                  }

                  if(var0 != null && var0.length == 5) {
                     return;
                  }
               }
            } else {
               var1 <<= 16;
               var1 += '\u8000';
               var3 <<= 16;
               var11 = (int)Math.floor((double)var3 / (double)var4 + 0.5D);
               var4 += var2;
               var12 = var5 >>> 24;
               var13 = (int)Math.sqrt((double)(65536 + (var11 >> 8) * (var11 >> 8)));
               if(var6 != 0 && (var6 != 1 || var12 != 255)) {
                  if(var6 == 1) {
                     var5 = ((var5 & 16711935) * var12 >> 8 & 16711935) + ((var5 & '\uff00') * var12 >> 8 & '\uff00') + (var12 << 24);

                     for(var14 = 256 - var12; var2 <= var4; var9 %= var10) {
                        var15 = var1 >> 16;
                        if(var2 >= ((int[])((int[])var0[1]))[16] && var2 < ((int[])((int[])var0[1]))[1] && var15 >= ((int[])((int[])var0[1]))[7] && var15 < ((int[])((int[])var0[1]))[19] && var9 < var7) {
                           var16 = var15 + var2 * ((int[])((int[])var0[1]))[4];
                           var17 = ((int[])((int[])var0[7]))[var16];
                           var17 = ((var17 & 16711935) * var14 >> 8 & 16711935) + ((var17 & '\uff00') * var14 >> 8 & '\uff00');
                           ((int[])((int[])var0[7]))[var15 + var2 * ((int[])((int[])var0[1]))[4]] = var5 + var17;
                        }

                        var1 += var11;
                        ++var2;
                        var9 += var13;
                     }
                  } else {
                     if(var6 != 2) {
                        throw new IllegalArgumentException();
                     }

                     while(var2 <= var4) {
                        var14 = var1 >> 16;
                        if(var2 >= ((int[])((int[])var0[1]))[16] && var2 < ((int[])((int[])var0[1]))[1] && var14 >= ((int[])((int[])var0[1]))[7] && var14 < ((int[])((int[])var0[1]))[19] && var9 < var7) {
                           var15 = var14 + var2 * ((int[])((int[])var0[1]))[4];
                           var16 = ((int[])((int[])var0[7]))[var15];
                           var17 = var5 + var16;
                           var18 = (var5 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           ((int[])((int[])var0[7]))[var15] = var17 - var16 | var16 - (var16 >>> 8);
                        }

                        var1 += var11;
                        ++var2;
                        var9 += var13;
                        var9 %= var10;
                     }

                     if(var0 != null && var0.length == 29) {
                        a(new Object[5][], 0.17529264F, -0.89877075F, -0.90677905F, (float[])null);
                     }
                  }
               } else {
                  while(var2 <= var4) {
                     var14 = var1 >> 16;
                     if(var2 >= ((int[])((int[])var0[1]))[16] && var2 < ((int[])((int[])var0[1]))[1] && var14 >= ((int[])((int[])var0[1]))[7] && var14 < ((int[])((int[])var0[1]))[19] && var9 < var7) {
                        ((int[])((int[])var0[7]))[var14 + var2 * ((int[])((int[])var0[1]))[4]] = var5;
                     }

                     var1 += var11;
                     ++var2;
                     var9 += var13;
                     var9 %= var10;
                  }

                  if(var0 != null && var0.length == 5) {
                     return;
                  }
               }
            }

            if(var0 != null && var0.length == 12) {
               c((Object[])null, (Object[])null);
            }

         }
      }
   }

   static final void d(Object[] var0, Object[] var1) {
      var0[14] = var1;
      s(var0);
   }

   static final void b(Object[] var0, int var1, Object[] var2) {
      if(var0 == null || var0.length != 2) {
         for(int var3 = 0; var3 < ((Object[])((Object[])var0[3])).length; ++var3) {
            ((int[])((int[])((Object[][])((Object[][])var0[3]))[var3][1]))[0] = ((int[])((int[])((Object[][])((Object[][])var0[3]))[var3][1]))[1];
            ((int[])((int[])((Object[][])((Object[][])var0[3]))[var3][1]))[2] = var1;
            ((int[])((int[])((Object[][])((Object[][])var0[3]))[var3][1]))[1] = ((int[])((int[])var2[0]))[1];
            ((int[])((int[])((Object[][])((Object[][])var0[3]))[var3][1]))[3] = ((int[])((int[])var2[0]))[5];
            ((boolean[])((boolean[])((Object[][])((Object[][])var0[3]))[var3][2]))[2] = true;
         }

      }
   }

   static final void c(Object[] var0, int var1, int var2, int var3, int var4, int var5) {
      if(var0[7] != null) {
         if(var2 >= ((int[])((int[])var0[1]))[16] && var2 < ((int[])((int[])var0[1]))[1]) {
            if(var1 < ((int[])((int[])var0[1]))[7]) {
               var3 -= ((int[])((int[])var0[1]))[7] - var1;
               var1 = ((int[])((int[])var0[1]))[7];
            }

            if(var1 + var3 > ((int[])((int[])var0[1]))[19]) {
               var3 = ((int[])((int[])var0[1]))[19] - var1;
            }

            int var6 = var1 + var2 * ((int[])((int[])var0[1]))[4];
            int var7 = var4 >>> 24;
            int var8;
            if(var5 != 0 && (var5 != 1 || var7 != 255)) {
               int var9;
               int var10;
               if(var5 == 1) {
                  if(var0 != null && var0.length == 2) {
                     return;
                  }

                  var4 = ((var4 & 16711935) * var7 >> 8 & 16711935) + ((var4 & '\uff00') * var7 >> 8 & '\uff00') + (var7 << 24);
                  var8 = 256 - var7;

                  for(var9 = 0; var9 < var3; ++var9) {
                     var10 = ((int[])((int[])var0[7]))[var6 + var9];
                     var10 = ((var10 & 16711935) * var8 >> 8 & 16711935) + ((var10 & '\uff00') * var8 >> 8 & '\uff00');
                     ((int[])((int[])var0[7]))[var6 + var9] = var4 + var10;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  for(var8 = 0; var8 < var3; ++var8) {
                     var9 = ((int[])((int[])var0[7]))[var6 + var8];
                     var10 = var4 + var9;
                     int var11 = (var4 & 16711935) + (var9 & 16711935);
                     var9 = (var11 & 16777472) + (var10 - var11 & 65536);
                     ((int[])((int[])var0[7]))[var6 + var8] = var10 - var9 | var9 - (var9 >>> 8);
                  }

                  if(var0 != null && var0.length == 13 && var0[4].equals(Boolean.valueOf(false))) {
                     G((Object[])null);
                  }
               }
            } else {
               for(var8 = 0; var8 < var3; ++var8) {
                  ((int[])((int[])var0[7]))[var6 + var8] = var4;
               }

               if(var0 != null && var0.length == 3 && var0[0].equals(Integer.valueOf(1)) && var0[0].equals(Integer.valueOf(2))) {
                  l((Object[])null);
               }
            }

         }
      }
   }

   static final boolean b(Object[] var0) {
      return false;
   }

   static final Object[] g(Object[] var0) {
      Object[] var2 = new Object[2];
      Object[] var3 = (Object[])((Object[])var0[14]);
      tra.a(var2, (byte)21);
      var2[1] = mj.a(0, var2);
      lg.a(var2, var3, -18072);
      return var2;
   }

   static final void a(Object[] var0) {
      if(var0[12] != null) {
         int var1;
         int var2;
         int var3;
         if(((int[])((int[])var0[1]))[7] == 0 && ((int[])((int[])var0[1]))[19] == ((int[])((int[])var0[1]))[4] && ((int[])((int[])var0[1]))[16] == 0 && ((int[])((int[])var0[1]))[1] == ((int[])((int[])var0[1]))[12]) {
            var1 = ((float[])((float[])var0[12])).length;
            var2 = var1 - (var1 & 7);

            for(var3 = 0; var3 < var2; ((float[])((float[])var0[12]))[var3++] = 2.14748365E9F) {
               ((float[])((float[])var0[12]))[var3++] = 2.14748365E9F;
               ((float[])((float[])var0[12]))[var3++] = 2.14748365E9F;
               ((float[])((float[])var0[12]))[var3++] = 2.14748365E9F;
               ((float[])((float[])var0[12]))[var3++] = 2.14748365E9F;
               ((float[])((float[])var0[12]))[var3++] = 2.14748365E9F;
               ((float[])((float[])var0[12]))[var3++] = 2.14748365E9F;
               ((float[])((float[])var0[12]))[var3++] = 2.14748365E9F;
            }

            if(var0 != null && var0.length == 1) {
               return;
            }

            while(var3 < var1) {
               ((float[])((float[])var0[12]))[var3++] = 2.14748365E9F;
            }
         } else {
            var1 = ((int[])((int[])var0[1]))[19] - ((int[])((int[])var0[1]))[7];
            var2 = ((int[])((int[])var0[1]))[1] - ((int[])((int[])var0[1]))[16];
            if(var0 != null && var0.length == 2) {
               d((Object[])null, -81, 7, -117, -3, 78, -98);
            }

            var3 = ((int[])((int[])var0[1]))[4] - var1;
            int var4 = ((int[])((int[])var0[1]))[7] + ((int[])((int[])var0[1]))[16] * ((int[])((int[])var0[1]))[4];
            int var5 = var1 >> 3;
            int var6 = var1 & 7;
            var1 = var4 - 1;

            for(int var8 = -var2; var8 < 0; ++var8) {
               int var7;
               float[] var10000;
               if(var5 > 0) {
                  var7 = var5;

                  do {
                     var10000 = (float[])((float[])var0[12]);
                     ++var1;
                     var10000[var1] = 2.14748365E9F;
                     var10000 = (float[])((float[])var0[12]);
                     ++var1;
                     var10000[var1] = 2.14748365E9F;
                     var10000 = (float[])((float[])var0[12]);
                     ++var1;
                     var10000[var1] = 2.14748365E9F;
                     var10000 = (float[])((float[])var0[12]);
                     ++var1;
                     var10000[var1] = 2.14748365E9F;
                     var10000 = (float[])((float[])var0[12]);
                     ++var1;
                     var10000[var1] = 2.14748365E9F;
                     var10000 = (float[])((float[])var0[12]);
                     ++var1;
                     var10000[var1] = 2.14748365E9F;
                     var10000 = (float[])((float[])var0[12]);
                     ++var1;
                     var10000[var1] = 2.14748365E9F;
                     var10000 = (float[])((float[])var0[12]);
                     ++var1;
                     var10000[var1] = 2.14748365E9F;
                     --var7;
                  } while(var7 > 0);

                  if(var0 != null && var0.length == 14) {
                     a(new Object[2][], (Canvas)null, (qa)null, 0, -81);
                  }
               }

               if(var6 > 0) {
                  if(var0 != null && var0.length == 5) {
                     b((Object[])null, -85, -15, 11, 95);
                  }

                  var7 = var6;

                  do {
                     var10000 = (float[])((float[])var0[12]);
                     ++var1;
                     var10000[var1] = 2.14748365E9F;
                     --var7;
                  } while(var7 > 0);
               }

               var1 += var3;
            }
         }

      }
   }

   static final void d(int var0, int var1, float var2, int var3, int var4, int var5, int var6, int var7, int var8, Object[] var9) {
      if(var3 != 0 && var4 != 0) {
         if(var5 != '\uffff') {
            Object[] var10 = ((ta)var9[6]).k.a(var5, (byte)79);
            if(!((boolean[])((boolean[])var10[3]))[7]) {
               if(((int[])((int[])var9[1]))[14] != var5) {
                  cga var11 = (cga)dna.a((byte)34, (Object[])((Object[])var9[0]), (long)var5);
                  if(var11 == null) {
                     int[] var12 = n(var9, var5);
                     if(var12 == null) {
                        return;
                     }

                     int var13 = b(var9, var5)?64:((int[])((int[])var9[1]))[8];
                     var11 = ((ta)var9[6]).a(var13, -7343, 0, var12, var13, var13);
                     il.a((long)var5, var11, true, (Object[])((Object[])var9[0]));
                  }

                  ((int[])((int[])var9[1]))[14] = var5;
                  var9[9] = var11;
               }

               ((ap)var9[9]).b(var0 - var3, var1 - var4, var2, var3 << 1, var4 << 1, var7, var6, var8, 1, ((int[])((int[])var10[1]))[0] != 2);
               return;
            }
         }

         b(var0, var1, var2, var3, var6, var8, var9);
      }
   }

   static final void f(Object[] var0, Object[] var1) {}

   static final Class_s a(Object[] var0, int var1, int var2, int[] var3, int[] var4) {
      Object[] var7 = new Object[3];
      var7[1] = tr.b(var7, 77);
      var7[2] = var4;
      var7[0] = var3;
      Object[] var5;
      return (Class_s)((var5 = var7) == null?null:var5[1]);
   }

   private static final void d(vsa var0, int var1, int var2, float var3, int var4, Object[] var5) {
      int var6 = var0.x;
      int var7 = var4;
      var4 <<= 1;
      if(var6 == -1) {
         a(var1, var2, var3, var7, var0.A, 1, var5);
      } else {
         if(((int[])((int[])var5[1]))[14] != var6) {
            cga var8 = (cga)dna.a((byte)34, (Object[])((Object[])var5[0]), (long)var6);
            if(var8 == null) {
               int[] var9 = n(var5, var6);
               if(var9 == null) {
                  return;
               }

               int var10 = b(var5, var6)?64:((int[])((int[])var5[1]))[8];
               var8 = ((ta)var5[6]).a(var10, -7343, 0, var9, var10, var10);
               il.a((long)var6, var8, true, (Object[])((Object[])var5[0]));
            }

            ((int[])((int[])var5[1]))[14] = var6;
            var5[9] = var8;
         }

         ++var4;
         ((ap)var5[9]).c(var1 - var7, var2 - var7, var3, var4, var4, 0, var0.A, 1, 1, false);
      }

   }

   static final boolean m(Object[] var0) {
      return ((boolean[])((boolean[])var0[8]))[1];
   }

   static final void c(Object[] var0, int[] var1) {
      var1[0] = ((int[])((int[])var0[1]))[7];
      var1[1] = ((int[])((int[])var0[1]))[16];
      var1[2] = ((int[])((int[])var0[1]))[19];
      var1[3] = ((int[])((int[])var0[1]))[1];
   }

   static final int w(Object[] var0) {
      return 0;
   }

   private static final void b(vsa var0, int var1, int var2, float var3, int var4, Object[] var5) {
      int var6 = var0.x;
      int var7 = var4;
      var4 <<= 1;
      if(var6 == -1) {
         a(var1, var2, var3, var7, var0.A, 1, var5);
      } else {
         if(((int[])((int[])var5[1]))[14] != var6) {
            cga var8 = (cga)dna.a((byte)34, (Object[])((Object[])var5[0]), (long)var6);
            if(var8 == null) {
               int[] var9 = n(var5, var6);
               if(var9 == null) {
                  return;
               }

               int var10 = b(var5, var6)?64:((int[])((int[])var5[1]))[8];
               var8 = ((ta)var5[6]).a(var10, -7343, 0, var9, var10, var10);
               il.a((long)var6, var8, true, (Object[])((Object[])var5[0]));
            }

            ((int[])((int[])var5[1]))[14] = var6;
            var5[9] = var8;
         }

         ++var4;
         ((ap)var5[9]).d(var1 - var7, var2 - var7, var3, var4, var4, 0, var0.A, 1, 1, false);
      }

   }

   static final Object[] e(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      return null;
   }

   static final gv a(Object[] var0, Canvas var1, int var2, int var3) {
      Object[] var6 = ina.a(var1, var2, new Object[8], var0, var3, 65);
      return (gv)(var6 == null?null:var6[3]);
   }

   static final void a(Object[] var0, int[] var1) {
      var1[0] = ((int[])((int[])var0[1]))[13];
      var1[1] = ((int[])((int[])var0[1]))[9];
      var1[2] = ((int[])((int[])var0[1]))[17];
      var1[3] = ((int[])((int[])var0[1]))[15];
   }

   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, float var3, Object[] var4) {
      return null;
   }

   static final void e(Object[] var0, int var1) {
      dpa.z = var1;
      dpa.G = var1;
      if(((int[])((int[])var0[1]))[10] > 1) {
         throw new IllegalStateException();
      } else {
         m(var0, ((int[])((int[])var0[1]))[10]);
         c(var0, 0);
      }
   }

   private static final void c(Object[] var0, Object[] var1) {
      if(var0 != null && var0.length == 3) {
         j(new Object[16][], 48);
      }

      Object[] var2 = a(var1, (Runnable)Thread.currentThread());
      va var3 = (va)((Object[])((Object[])var0[0]))[1];

      for(va var4 = var3.p; var4 != var3; var4 = var4.p) {
         vsa var5 = (vsa)var4;
         int var6 = var5.B >> 12;
         int var7 = var5.z >> 12;
         int var8 = var5.v >> 12;
         float var9 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[14] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[2] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[6] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[10] * (float)var8;
         float var10 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[15] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[3] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[7] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[11] * (float)var8;
         if(var9 >= -var10) {
            float var11 = ((float[])((float[])var1[10]))[5] + ((float[])((float[])var1[10]))[4] * var9 / var10;
            if(var9 <= ((float[])((float[])var2[18]))[4]) {
               float var12 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[0] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[4] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[8] * (float)var8;
               float var13 = ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[1] * (float)var6 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[5] * (float)var7 + ((float[])((float[])((Object[])((Object[])var1[11]))[0]))[9] * (float)var8;
               if(var12 >= -var10 && var12 <= var10 && var13 >= -var10 && var13 <= var10) {
                  if(var2 != null && var2.length == 7 && var2[3].equals(Integer.valueOf(1))) {
                     return;
                  }

                  float var14 = (float)var5.C / 4096.0F;
                  float var15 = var12 + ((float[])((float[])((Object[])((Object[])var1[13]))[0]))[0] * var14;
                  float var16 = var10 + ((float[])((float[])((Object[])((Object[])var1[13]))[0]))[3] * var14;
                  float var17 = ((float[])((float[])var1[10]))[0] + ((float[])((float[])var1[10]))[2] * var12 / var10;
                  float var18 = ((float[])((float[])var1[10]))[1] + ((float[])((float[])var1[10]))[3] * var13 / var10;
                  float var19 = ((float[])((float[])var1[10]))[0] + ((float[])((float[])var1[10]))[2] * var15 / var16;
                  b(var5, (int)var17, (int)var18, var11, (int)(var19 < var17?var17 - var19:var19 - var17), var1);
               }
            }
         }
      }

   }

   static final boolean H(Object[] var0) {
      return true;
   }

   static final void b(Object[] var0, boolean var1) {
      ((boolean[])((boolean[])var0[8]))[2] = var1;
      dq.a(-85, (Object[])((Object[])var0[2]));
   }

   static final boolean k(Object[] var0) {
      return false;
   }

   static final void q(Object[] var0) {
      ((int[])((int[])var0[1]))[7] = 0;
      ((int[])((int[])var0[1]))[16] = 0;
      ((int[])((int[])var0[1]))[19] = ((int[])((int[])var0[1]))[4];
      ((int[])((int[])var0[1]))[1] = ((int[])((int[])var0[1]))[12];
      G(var0);
   }

   static final cga a(Object[] var0, int[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      boolean var7 = false;
      int var8 = var2;

      for(int var9 = 0; var9 < var5; ++var9) {
         for(int var10 = 0; var10 < var4; ++var10) {
            int var11 = var1[var8++] >>> 24;
            if(var11 != 0 && var11 != 255) {
               var7 = true;
               return (cga)(var7?new um(var0, var1, var2, var3, var4, var5, var6):new hra(var0, var1, var2, var3, var4, var5, var6));
            }
         }

         if(var0 != null && var0.length == 21) {
            return null;
         }
      }

      return (cga)(var7?new um(var0, var1, var2, var3, var4, var5, var6):new hra(var0, var1, var2, var3, var4, var5, var6));
   }

   static final void a(Object[] var0, za var1) {}

   static final Object[] a(Object[] var0, int var1, int var2, int var3, int var4, int var5, float var6) {
      return null;
   }

   static final boolean d(Object[] var0, int var1) {
      return ((ta)var0[6]).k.a(-20460, var1);
   }

   static final void a(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var0[7] != null) {
         Object[] var8 = a(var0, (Runnable)Thread.currentThread());
         uo var9 = (uo)var8[17];
         int var10 = var3 - var1;
         int var11 = var4 - var2;
         int var12 = var10 >= 0?var10:-var10;
         int var13 = var11 >= 0?var11:-var11;
         int var14 = var12;
         if(var12 < var13) {
            var14 = var13;
         }

         if(var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            var10 += var15 >> 16;
            var11 += var16 >> 16;
            if(var16 <= var15) {
               var15 = -var15;
            } else {
               var16 = -var16;
            }

            int var17 = var6 * var16 >> 17;
            int var18 = var6 * var16 + 1 >> 17;
            int var19 = var6 * var15 >> 17;
            int var20 = var6 * var15 + 1 >> 17;
            var1 -= var9.b();
            var2 -= var9.a();
            int var21 = var1 + var17;
            if(var8 == null || var8.length != 5) {
               int var22 = var1 - var18;
               int var23 = var1 + var10 - var18;
               int var24 = var1 + var10 + var17;
               int var25 = var2 + var19;
               int var26 = var2 - var20;
               int var27 = var2 + var11 - var20;
               int var28 = var2 + var11 + var19;
               if(var7 == 0) {
                  var9.J = 0;
               } else {
                  if(var7 != 1) {
                     throw new IllegalArgumentException();
                  }

                  var9.J = 255 - (var5 >>> 24);
               }

               c(var0, false);
               var9.c = var21 < 0 || var21 > var9.K || var22 < 0 || var22 > var9.K || var23 < 0 || var23 > var9.K;
               var9.c((float)var25, (float)var26, (float)var27, (float)var21, (float)var22, (float)var23, 100.0F, 100.0F, 100.0F, var5);
               var9.c = var21 < 0 || var21 > var9.K || var23 < 0 || var23 > var9.K || var24 < 0 || var24 > var9.K;
               var9.c((float)var25, (float)var27, (float)var28, (float)var21, (float)var23, (float)var24, 100.0F, 100.0F, 100.0F, var5);
               c(var0, true);
            }
         }
      }
   }

   static final void a(Object[] var0, int var1, int var2, int[] var3, float[] var4) {
      ((int[])((int[])var0[1]))[4] = var1;
      ((int[])((int[])var0[1]))[12] = var2;
      var0[7] = var3;
      var0[12] = var4;

      for(int var5 = 0; var5 < ((int[])((int[])var0[1]))[10]; ++var5) {
         Object[] var6 = ((Object[][])((Object[][])var0[3]))[var5];
         var6[17] = new uo((Object[])((Object[])var6[23]), var6);
      }

      q(var0);
      n(var0);
      if(var0 != null && (var0.length == 32 || var0.length == 6)) {
         a((Object[])null, false);
      }

   }

   static final void a(Object[] var0, float var1, float var2, float var3, float[] var4) {
      float var5 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[15] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[3] * var1 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[7] * var2 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[11] * var3;
      float var6 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[12] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[0] * var1 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[4] * var2 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[8] * var3;
      float var7 = ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[13] + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[1] * var1 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[5] * var2 + ((float[])((float[])((Object[])((Object[])var0[11]))[0]))[9] * var3;
      float var8 = ((float[])((float[])((Object[])((Object[])var0[5]))[0]))[14] + ((float[])((float[])((Object[])((Object[])var0[5]))[0]))[2] * var1 + ((float[])((float[])((Object[])((Object[])var0[5]))[0]))[6] * var2 + ((float[])((float[])((Object[])((Object[])var0[5]))[0]))[10] * var3;
      var4[0] = ((float[])((float[])var0[10]))[0] + ((float[])((float[])var0[10]))[2] * var6 / var5;
      var4[1] = ((float[])((float[])var0[10]))[1] + ((float[])((float[])var0[10]))[3] * var7 / var5;
      var4[2] = var8;
   }

   static final lua b(Object[] var0, int var1, int var2) {
      Object[] var5 = new Object[3];
      if(var5[1] == null) {
         var5[1] = new int[2];
      }

      kia var7 = new kia(var5);
      ((int[])((int[])var5[1]))[0] = var2;
      var5[2] = var7;
      ((int[])((int[])var5[1]))[1] = var1;
      var5[0] = new float[((int[])((int[])var5[1]))[1] * ((int[])((int[])var5[1]))[0]];
      Object[] var3;
      return (lua)((var3 = var5) == null?null:var3[2]);
   }

   static final ka a(Object[] var0, ii var1, int var2, int var3, int var4, int var5) {
      return new dpa(var0, var1, var2, var4, var5, var3);
   }

   static final void n(Object[] var0) {
      ((int[])((int[])var0[1]))[13] = 0;
      ((int[])((int[])var0[1]))[9] = 0;
      ((int[])((int[])var0[1]))[17] = ((int[])((int[])var0[1]))[4];
      ((int[])((int[])var0[1]))[15] = ((int[])((int[])var0[1]))[12];
      G(var0);
   }

   static final boolean E(Object[] var0) {
      return true;
   }

   static final void a(Object[] var0, int var1, int var2, int var3, int var4) {}

   static final int[] n(Object[] var0, int var1) {
      hea var2;
      synchronized(var0[2]) {
         var2 = (hea)dna.a((byte)34, (Object[])((Object[])var0[2]), (long)var1 | Long.MIN_VALUE);
         if(var2 == null) {
            if(!((ta)var0[6]).k.a(-20460, var1)) {
               return null;
            }

            Object[] var4 = ((ta)var0[6]).k.a(var1, (byte)90);
            int var5 = !((boolean[])((boolean[])var4[3]))[4] && !((boolean[])((boolean[])var0[8]))[2]?((int[])((int[])var0[1]))[8]:64;
            var2 = new hea(var1, var5, ((ta)var0[6]).k.a(var5, 0.7F, (byte)-87, var5, true, var1), ((int[])((int[])var4[1]))[0] != 1);
            il.a((long)var1 | Long.MIN_VALUE, var2, true, (Object[])((Object[])var0[2]));
         }
      }

      var2.o = true;
      return var2.a();
   }

   static final int e(Object[] var0, int var1, int var2) {
      return var1 | var2;
   }

   static final void g(Object[] var0, int var1, int var2) {
      int var3 = var2 * ((int[])((int[])var0[1]))[4] + var1;
      if(var3 != 0) {
         int[] var4 = (int[])((int[])var0[7]);
         float[] var5 = (float[])((float[])var0[12]);
         int var6;
         if(var4 != null) {
            if(var3 < 0) {
               var6 = var4.length + var3;
               System.arraycopy(var4, -var3, var4, 0, var6);
            } else if(var3 > 0) {
               var6 = var4.length - var3;
               System.arraycopy(var4, 0, var4, var3, var6);
            }
         }

         if(var5 != null) {
            if(var3 < 0) {
               var6 = var5.length + var3;
               System.arraycopy(var5, -var3, var5, 0, var6);
            } else if(var3 > 0) {
               var6 = var5.length - var3;
               System.arraycopy(var5, 0, var5, var3, var6);
            }
         }

      }
   }

   static final void a(Object[] var0, boolean var1) {}

}
