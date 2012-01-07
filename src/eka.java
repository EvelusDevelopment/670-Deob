
final class eka {

   static Object[] d;
   static Object[] e;
   private static Object[] E = nb.a((byte)96, 16, new Object[5]);
   static Object[] w;
   private static Object[] I;
   static Object[] M;
   static Object[] A;
   private static Object[] c;
   static Object[] x;
   static float L;
   static int z = (int)(Math.random() * 17.0D) - 8;
   private static int[] r = new int[1];
   static int J;
   static Object[] t = ura.a(-92, new Object[2]);
   static byte[][][] v;
   static Object[] j;
   static float h;
   private static byte[] G = new byte[1];
   static int y = (int)(Math.random() * 11.0D) - 5;
   static int g;
   private static byte[] o;
   static int u;
   static int C;
   static int k;
   private static byte[] s;
   static int H;
   static int f;
   static int a;
   private static short[] q;
   private static byte[] F;
   static int K;
   private static byte[] p;
   private static int[] f_l;
   static int D;
   static int n;
   private static Object[][][][] f_i;
   private static byte[] m;
   static int b;
   private static Object[] N;
   static int B;


   static final void a(qa var0, int var1, int var2) {
      for(int var3 = 0; var3 < ((int[])((int[])c[1]))[1]; ++var3) {
         f_l[var3 + 1] = a(var0, var3, var1, var2);
      }

   }

   static final Object[] b(int var0, int var1) {
      Object[] var5 = osa.a(0, new Object[2]);

      pi var2;
      pi var3;
      for(Object[] var6 = (var2 = (pi)qt.a(0, E)) == null?null:var2.x; var6 != null; var6 = (var3 = (pi)nda.a(1, E)) == null?null:var3.x) {
         if(((boolean[])((boolean[])var6[4]))[0] && cja.a(var6, var0, var1, (byte)-52)) {
            ama.a((tha)(var6 == null?null:var6[5]), (byte)-109, var5);
         }
      }

      return var5;
   }

   static final void b() {
      s = null;
      F = null;
      q = null;
      o = null;
      m = null;
      N = null;
      p = null;
      f_i = (Object[][][][])null;
      f_l = null;
   }

   private static final void a(byte[] var0, byte[] var1, short[] var2, int var3, int var4) {
      int[] var5 = new int[K];
      int[] var6 = new int[K];
      int[] var7 = new int[K];
      int[] var8 = new int[K];
      int[] var9 = new int[K];

      for(int var10 = -5; var10 < f; ++var10) {
         int var11 = var10 + 5;
         int var12 = var10 - 5;

         int var13;
         int var14;
         for(var13 = 0; var13 < K; ++var13) {
            Object[] var15;
            if(var11 < f) {
               var14 = var0[var11 + var13 * f] & 255;
               if(var14 > 0) {
                  var15 = cw.a(-109, var14 - 1, I);
                  var5[var13] += ((int[])((int[])var15[1]))[0];
                  var6[var13] += ((int[])((int[])var15[1]))[1];
                  var7[var13] += ((int[])((int[])var15[1]))[3];
                  var8[var13] += ((int[])((int[])var15[1]))[6];
                  ++var9[var13];
               }
            }

            if(var12 >= 0) {
               var14 = var0[var12 + var13 * f] & 255;
               if(var14 > 0) {
                  var15 = cw.a(89, var14 - 1, I);
                  var5[var13] -= ((int[])((int[])var15[1]))[0];
                  var6[var13] -= ((int[])((int[])var15[1]))[1];
                  var7[var13] -= ((int[])((int[])var15[1]))[3];
                  var8[var13] -= ((int[])((int[])var15[1]))[6];
                  --var9[var13];
               }
            }
         }

         if(var10 >= 0) {
            var13 = 0;
            var14 = 0;
            int var29 = 0;
            int var16 = 0;
            int var17 = 0;

            for(int var18 = -5; var18 < K; ++var18) {
               int var19 = var18 + 5;
               if(var19 < K) {
                  var13 += var5[var19];
                  var14 += var6[var19];
                  var29 += var7[var19];
                  var16 += var8[var19];
                  var17 += var9[var19];
               }

               int var20 = var18 - 5;
               if(var20 >= 0) {
                  var13 -= var5[var20];
                  var14 -= var6[var20];
                  var29 -= var7[var20];
                  var16 -= var8[var20];
                  var17 -= var9[var20];
               }

               if(var18 >= 0 && var17 > 0) {
                  int var21;
                  if((var0[var10 + var18 * f] & 255) == 0) {
                     var21 = var10 + var18 * f;
                     var1[var21] = 0;
                     var2[var21] = 0;
                  } else {
                     var21 = var16 == 0?0:kpa.a(var14 / var17, 89, var29 / var17, var13 * 256 / var16);
                     int var22 = (var21 & 127) + var4;
                     if(var22 < 0) {
                        var22 = 0;
                     } else if(var22 > 127) {
                        var22 = 127;
                     }

                     int var23 = (var21 + var3 & '\ufc00') + (var21 & 896) + var22;
                     int var24 = var10 + var18 * f;
                     int[] var25 = en.c;
                     byte var27 = 96;
                     int var26;
                     if(-1 == var23) {
                        var26 = 12345678;
                     } else {
                        int var30 = (127 & var23) * var27 >> 7;
                        if(var30 >= 2) {
                           if(var30 > 126) {
                              var30 = 126;
                           }
                        } else {
                           var30 = 2;
                        }

                        var26 = var30 + ('\uff80' & var23);
                     }

                     int var28 = var25[spa.a(var26, (byte)68) & '\uffff'];
                     var1[var24] = (byte)(var28 >> 16 & 255);
                     var2[var24] = (short)(var28 & '\uffff');
                  }
               }
            }
         }
      }

   }

   private static final int a(qa var0, int var1, int var2, int var3) {
      Object[] var4 = tp.a(c, var1, (int)7);
      if(var4 == null) {
         return 0;
      } else {
         int var5 = ((int[])((int[])var4[1]))[6];
         if(var5 >= 0 && ((boolean[])((boolean[])var0.a(var5, (byte)35)[3]))[7]) {
            var5 = -1;
         }

         int var6;
         int var7;
         int var8;
         int var9;
         if(((int[])((int[])var4[1]))[5] >= 0) {
            var7 = ((int[])((int[])var4[1]))[5];
            var8 = (var7 & 127) + var3;
            if(var8 < 0) {
               var8 = 0;
            } else if(var8 > 127) {
               var8 = 127;
            }

            var9 = (var7 + var2 & '\ufc00') + (var7 & 896) + var8;
            var6 = -16777216 | en.c[spa.a(eu.a(var9, 96, true), (byte)68) & '\uffff'];
         } else if(var5 >= 0) {
            var6 = -16777216 | en.c[spa.a(eu.a(((short[])((short[])var0.a(var5, (byte)84)[2]))[0], 96, true), (byte)68) & '\uffff'];
         } else if(((int[])((int[])var4[1]))[2] == -1) {
            var6 = 0;
         } else {
            var7 = ((int[])((int[])var4[1]))[2];
            var8 = (var7 & 127) + var3;
            if(var8 < 0) {
               var8 = 0;
            } else if(var8 > 127) {
               var8 = 127;
            }

            var9 = (var7 + var2 & '\ufc00') + (var7 & 896) + var8;
            var6 = -16777216 | en.c[spa.a(eu.a(var9, 96, true), (byte)68) & '\uffff'];
         }

         return var6;
      }
   }

   static final void b(int var0) {
      pi var1;
      M = (var1 = (pi)pm.a((long)var0, E, false)) == null?null:var1.x;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      H = var0 - n;
      b = var1 - u;
      a = var2 - n;
      k = var3 - u;
      C = var4;
      D = var5;
      B = var6;
      g = var7;
   }

   static final void a(ta var0, int var1, int var2) {
      Object[] var3 = jta.a((byte)-128, sra.a((String)M[0], A, "area", true), new Object[3]);
      int var4 = fh.a(var3, false);
      int[] var5 = new int[var4];

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         var5[var6] = fh.a(var3, false);
      }

      var6 = fh.a(var3, false);
      int[] var7 = new int[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = fh.a(var3, false);
      }

      int var10;
      int var11;
      int var14;
      while(((int[])((int[])var3[1]))[0] < ((byte[])((byte[])var3[2])).length) {
         int var9;
         int var12;
         int var13;
         if(fh.a(var3, false) == 0) {
            var8 = fh.a(var3, false);
            var9 = fh.a(var3, false);

            for(var10 = 0; var10 < 64; ++var10) {
               for(var11 = 0; var11 < 64; ++var11) {
                  var12 = var8 * 64 + var10 - n;
                  var13 = var9 * 64 + var11 - u;
                  a(var0, var3, var8, var9, var12, var13, var5, var7);
               }
            }
         } else {
            var8 = fh.a(var3, false);
            var9 = fh.a(var3, false);
            var10 = fh.a(var3, false);
            var11 = fh.a(var3, false);

            for(var12 = 0; var12 < 8; ++var12) {
               for(var13 = 0; var13 < 8; ++var13) {
                  var14 = var8 * 64 + var10 * 8 + var12 - n;
                  int var15 = var9 * 64 + var11 * 8 + var13 - u;
                  a(var0, var3, var8, var9, var14, var15, var5, var7);
               }
            }
         }
      }

      var3 = null;
      F = new byte[f * K];
      q = new short[f * K];

      for(var8 = 0; var8 < 3; ++var8) {
         byte[] var16 = new byte[f * K];

         ku var17;
         Object[] var18;
         for(var10 = 0; var10 < f_i[var8].length; ++var10) {
            for(var11 = 0; var11 < f_i[var8][0].length; ++var11) {
               var18 = f_i[var8][var10][var11];
               if(var18 != null) {
                  for(var17 = (ku)om.a(var18, false); var17 != null; var17 = (ku)pw.a(var18, 94)) {
                     var16[var10 * 64 + var17.f_i + (var11 * 64 + var17.o) * f] = (byte)var17.f_l;
                  }
               }
            }
         }

         a(var16, F, q, var1, var2);

         for(var10 = 0; var10 < f_i[var8].length; ++var10) {
            for(var11 = 0; var11 < f_i[var8][0].length; ++var11) {
               var18 = f_i[var8][var10][var11];
               if(var18 != null) {
                  for(var17 = (ku)om.a(var18, false); var17 != null; var17 = (ku)pw.a(var18, 92)) {
                     var14 = var10 * 64 + var17.f_i + (var11 * 64 + var17.o) * f;
                     var17.f_l = (F[var14] & 255) << 16 | q[var14] & '\uffff';
                     if(var17.f_l != 0) {
                        var17.f_l |= -16777216;
                     }
                  }
               }
            }
         }
      }

      a(s, F, q, var1, var2);
      s = null;
      d();
   }

   private static final void a(ta var0, Object[] var1, int var2, int var3, int var4, int var5) {
      ((int[])((int[])var1[1]))[2] = C + (var4 + var2 * (((int[])((int[])var1[1]))[0] - H) >> 16);
      ((int[])((int[])var1[1]))[5] = g - (var5 + var3 * (((int[])((int[])var1[1]))[4] - k) >> 16);
   }

   static final Object[] a(int var0, int var1) {
      pi var2;
      pi var3;
      for(Object[] var4 = (var2 = (pi)qt.a(0, E)) == null?null:var2.x; var4 != null; var4 = (var3 = (pi)nda.a(1, E)) == null?null:var3.x) {
         if(((boolean[])((boolean[])var4[4]))[0] && cja.a(var4, var0, var1, (byte)-52)) {
            return var4;
         }
      }

      return null;
   }

   static final void c() {
      int[] var1 = new int[3];

      for(int var2 = 0; var2 < ((int[])((int[])j[1]))[0]; ++var2) {
         boolean var3 = wfa.a(((int[])((int[])j[2]))[var2] >> 28 & 3, ((int[])((int[])j[2]))[var2] >> 14 & 16383, 68, ((int[])((int[])j[2]))[var2] & 16383, var1, M);
         if(var3) {
            Object[] var4 = opa.a(((int[])((int[])j[0]))[var2], (byte)127, new Object[3]);
            ((int[])((int[])var4[1]))[0] = var1[1] - n;
            ((int[])((int[])var4[1]))[4] = var1[2] - u;
            client.a(120, t, (lm)(var4 == null?null:var4[2]));
         }
      }

   }

   static final void a(Object[] var0, Object[] var1, Object[] var2, Object[] var3, Object[] var4, Object[] var5, Object[] var6) {
      A = var0;
      c = var1;
      I = var2;
      w = var3;
      e = var4;
      x = var5;
      d = var6;
      ona.a(E, 88);
      int var8 = dla.a(A, 96, "details");
      int[] var9 = nr.a(false, A, var8);
      if(var9 != null) {
         for(int var10 = 0; var10 < var9.length; ++var10) {
            Object[] var11 = toa.a(A, var9[var10], 9, var8);
            di.a(E, true, (lm)(var11 == null?null:var11[5]), (long)((int[])((int[])var11[1]))[2]);
         }
      }

      tia.a(-927416089, false, true);
   }

   private static final void b(ta var0, int var1, int var2, int var3, int var4) {
      int var5 = a - H;
      int var6 = b - k;
      if(a < f) {
         ++var5;
      }

      if(b < K) {
         ++var6;
      }

      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var19;
      int var18;
      for(var7 = 0; var7 < var5; ++var7) {
         var8 = (var3 + var1 * var7 >> 16) + C;
         var9 = (var3 + var1 * (var7 + 1) >> 16) + C;
         var10 = var9 - var8;
         if(var10 > 0) {
            var11 = H + var7;
            if(var11 >= 0 && var11 < f) {
               for(var12 = 0; var12 < var6; ++var12) {
                  var13 = g - (var4 + var2 * (var12 + 1) >> 16);
                  var14 = g - (var4 + var2 * var12 >> 16);
                  var15 = var14 - var13;
                  if(var15 > 0) {
                     var16 = var12 + k;
                     int var17 = var11 + var16 * f;
                     var18 = 0;
                     var19 = 0;
                     Object var20 = null;
                     if(var16 >= 0 && var16 < K) {
                        var18 = (F[var17] & 255) << 16 | q[var17] & '\uffff';
                        if(var18 != 0) {
                           var18 |= -16777216;
                        }

                        var19 = o[var17] & 255;
                        var20 = N[var17];
                     }

                     if(var18 == 0 && var19 == 0 && var20 == null) {
                        if(((int[])((int[])M[1]))[1] != -1) {
                           var18 = -16777216 | ((int[])((int[])M[1]))[1];
                        } else if((var7 + H & 4) != (var12 + b & 4)) {
                           var18 = -11840664;
                        } else {
                           var18 = f_l[((int[])((int[])c[1]))[0] + 1];
                        }

                        if(var18 == 0) {
                           var18 = -16777216;
                        }

                        var0.r(var8, var13, var10, var15, var18, 0);
                     } else if(var20 != null) {
                        if(var20 instanceof pra) {
                           pra var21 = (pra)var20;
                           if(var21 != null) {
                              a(var0, var8, var13, var10, var15, var18, var19, m[var17], var21.k, var21.j, true);
                           }
                        } else {
                           Integer var29 = (Integer)var20;
                           r[0] = var29.intValue();
                           G[0] = p[var17];
                           a(var0, var8, var13, var10, var15, var18, var19, m[var17], r, G, true);
                        }
                     } else {
                        a(var0, var8, var13, var10, var15, var18, var19, m[var17], (int[])null, (byte[])null, true);
                     }
                  }
               }
            } else {
               for(var12 = 0; var12 < var6; ++var12) {
                  var13 = g - (var4 + var2 * (var12 + 1) >> 16);
                  var14 = g - (var4 + var2 * var12 >> 16);
                  var15 = var14 - var13;
                  if(((int[])((int[])M[1]))[1] != -1) {
                     var16 = -16777216 | ((int[])((int[])M[1]))[1];
                  } else if((var7 + H & 4) != (var12 + b & 4)) {
                     var16 = -11840664;
                  } else {
                     var16 = f_l[((int[])((int[])c[1]))[0] + 1];
                  }

                  if(var16 == 0) {
                     var16 = -16777216;
                  }

                  var0.r(var8, var13, var10, var15, var16, 0);
               }
            }
         }
      }

      for(var7 = -16; var7 < var5 + 16; ++var7) {
         var8 = (var3 + var1 * var7 >> 16) + C;
         var9 = (var3 + var1 * (var7 + 1) >> 16) + C;
         var10 = var9 - var8;
         if(var10 > 0) {
            var11 = var7 + H;
            if(var11 >= 0 && var11 < f) {
               for(var12 = -16; var12 < var6 + 16; ++var12) {
                  var13 = g - (var4 + var2 * (var12 + 1) >> 16);
                  var14 = g - (var4 + var2 * var12 >> 16);
                  var15 = var14 - var13;
                  if(var15 > 0) {
                     var16 = var12 + k;
                     if(var16 >= 0 && var16 < K) {
                        Object var26 = N[var11 + var16 * f];
                        if(var26 != null) {
                           if(var26 instanceof pra) {
                              pra var28 = (pra)var26;
                              if(var28 != null) {
                                 a(var0, var8, var13, var10, var15, var28.k, var28.j);
                              }
                           } else {
                              Integer var31 = (Integer)var26;
                              r[0] = var31.intValue();
                              G[0] = p[var11 + var16 * f];
                              a(var0, var8, var13, var10, var15, r, G);
                           }
                        } else {
                           a(var0, var8, var13, var10, var15, (int[])null, (byte[])null);
                        }
                     }
                  }
               }
            }
         }
      }

      var7 = H >> 6;
      var8 = k >> 6;
      if(var7 < 0) {
         var7 = 0;
      }

      if(var8 < 0) {
         var8 = 0;
      }

      var9 = a >> 6;
      var10 = b >> 6;
      if(var9 >= f_i[0].length) {
         var9 = f_i[0].length - 1;
      }

      if(var10 >= f_i[0][0].length) {
         var10 = f_i[0][0].length - 1;
      }

      for(var11 = 0; var11 < 3; ++var11) {
         int var23;
         int var22;
         ku var25;
         Object[] var24;
         int var27;
         int var30;
         for(var12 = var7; var12 <= var9; ++var12) {
            for(var13 = var8; var13 <= var10; ++var13) {
               var24 = f_i[var11][var12][var13];
               if(var24 != null) {
                  var15 = (var12 + (n >> 6)) * 64;
                  var16 = (var13 + (u >> 6)) * 64;

                  for(var25 = (ku)om.a(var24, false); var25 != null; var25 = (ku)pw.a(var24, 117)) {
                     var18 = var15 + var25.f_i - n - H;
                     var19 = var16 + var25.o - u - k;
                     var27 = (var3 + var1 * var18 >> 16) + C;
                     var30 = (var3 + var1 * (var18 + 1) >> 16) + C;
                     var22 = g - (var4 + var2 * (var19 + 1) >> 16);
                     var23 = g - (var4 + var2 * var19 >> 16);
                     a(var0, var27, var22, var30 - var27, var23 - var22, var25.f_l, var25.j & 255, var25.m, var25.k, var25.n, false);
                  }
               }
            }
         }

         for(var12 = var7; var12 <= var9; ++var12) {
            for(var13 = var8; var13 <= var10; ++var13) {
               var24 = f_i[var11][var12][var13];
               if(var24 != null) {
                  var15 = (var12 + (n >> 6)) * 64;
                  var16 = (var13 + (u >> 6)) * 64;

                  for(var25 = (ku)om.a(var24, false); var25 != null; var25 = (ku)pw.a(var24, -77)) {
                     var18 = var15 + var25.f_i - n - H;
                     var19 = var16 + var25.o - u - k;
                     var27 = (var3 + var1 * var18 >> 16) + C;
                     var30 = (var3 + var1 * (var18 + 1) >> 16) + C;
                     var22 = g - (var4 + var2 * (var19 + 1) >> 16);
                     var23 = g - (var4 + var2 * var19 >> 16);
                     a(var0, var27, var22, var30 - var27, var23 - var22, var25.k, var25.n);
                  }
               }
            }
         }
      }

   }

   static final Object[] a(int var0) {
      pi var1;
      return (var1 = (pi)pm.a((long)var0, E, false)) == null?null:var1.x;
   }

   private static final void a(ta var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8, byte[] var9, boolean var10) {
      int var11;
      int var12;
      if(var10 || var5 != 0 || var6 > 0) {
         if(var6 == 0) {
            var0.r(var1, var2, var3, var4, var5, 0);
         } else {
            var11 = var7 & 63;
            if(var11 != 0 && var3 > 1 && var4 > 1) {
               var12 = var10?0:1;
               eb.a(J, f_l[var6], var5, var7 >> 6 & 3, var11, v, var2, var0, var12, var3, var4, var1, (byte)38);
            } else {
               var12 = f_l[var6];
               if(var10 || var12 != 0) {
                  var0.r(var1, var2, var3, var4, var12, 0);
               }
            }
         }
      }

      if(var8 != null) {
         if(var3 == 1) {
            var11 = var1;
         } else {
            var11 = var1 + var3 - 1;
         }

         if(var4 == 1) {
            var12 = var2;
         } else {
            var12 = var2 + var4 - 1;
         }

         for(int var13 = 0; var13 < var8.length; ++var13) {
            int var14 = var9[var13] & 63;
            if(var14 == 0 || var14 == 2 || var14 == 3 || var14 == 9) {
               Object[] var15 = mca.a(true, var8[var13], w);
               if(((int[])((int[])var15[1]))[34] == -1) {
                  int var16 = -3355444;
                  if(((int[])((int[])var15[1]))[11] == 1) {
                     var16 = -3407872;
                  }

                  int var17 = var9[var13] >> 6 & 3;
                  if(var14 == 0) {
                     if(var17 == 0) {
                        var0.HA(var1, var2, var4, var16, 0);
                     } else if(var17 == 1) {
                        var0.T(var1, var2, var3, var16, 0);
                     } else if(var17 == 2) {
                        var0.HA(var11, var2, var4, var16, 0);
                     } else {
                        var0.T(var1, var12, var3, var16, 0);
                     }
                  } else if(var14 == 2) {
                     if(var17 == 0) {
                        var0.HA(var1, var2, var4, -1, 0);
                        var0.T(var1, var2, var3, var16, 0);
                     } else if(var17 == 1) {
                        var0.HA(var11, var2, var4, -1, 0);
                        var0.T(var1, var2, var3, var16, 0);
                     } else if(var17 == 2) {
                        var0.HA(var11, var2, var4, -1, 0);
                        var0.T(var1, var12, var3, var16, 0);
                     } else {
                        var0.HA(var1, var2, var4, -1, 0);
                        var0.T(var1, var12, var3, var16, 0);
                     }
                  } else if(var14 == 3) {
                     if(var17 == 0) {
                        var0.T(var1, var2, 1, var16, 0);
                     } else if(var17 == 1) {
                        var0.T(var11, var2, 1, var16, 0);
                     } else if(var17 == 2) {
                        var0.T(var11, var12, 1, var16, 0);
                     } else {
                        var0.T(var1, var12, 1, var16, 0);
                     }
                  } else if(var14 == 9) {
                     int var18;
                     if(var17 != 0 && var17 != 2) {
                        for(var18 = 0; var18 < var4; ++var18) {
                           var0.T(var1 + var18, var2 + var18, 1, var16, 0);
                        }
                     } else {
                        for(var18 = 0; var18 < var4; ++var18) {
                           var0.T(var1 + var18, var12 - var18, 1, var16, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   private static final void a(ta var0, int var1, int var2, int var3, int var4, int[] var5, byte[] var6) {
      if(var5 != null) {
         for(int var7 = 0; var7 < var5.length; ++var7) {
            Object[] var8 = mca.a(true, var5[var7], w);
            int var9 = ((int[])((int[])var8[1]))[34];
            if(var9 != -1) {
               Object[] var10 = uqa.a(var9, x, 121);
               cga var11 = qba.a(var10, var0, true, ((boolean[])((boolean[])var8[0]))[0]?((boolean[])((boolean[])var8[0]))[15]:false, ((boolean[])((boolean[])var8[0]))[4]?var6[var7] >> 6 & 3:0);
               if(var11 != null) {
                  int var12 = var3 * var11.f() >> 2;
                  int var13 = var4 * var11.d() >> 2;
                  if(((boolean[])((boolean[])var10[2]))[0]) {
                     int var14 = ((int[])((int[])var8[1]))[28];
                     int var15 = ((int[])((int[])var8[1]))[10];
                     if((var6[var7] >> 6 & 1) == 1) {
                        int var16 = var14;
                        var14 = var15;
                        var15 = var16;
                     }

                     var12 = var14 * var3;
                     var13 = var15 * var4;
                  }

                  if(var12 != 0 && var13 != 0) {
                     if(((int[])((int[])var10[1]))[1] != 0) {
                        var11.b(var1, var2 - var13 + var4, var12, var13, 0, -16777216 | ((int[])((int[])var10[1]))[1], 1);
                     } else {
                        var11.c(var1, var2 - var13 + var4, var12, var13);
                     }
                  }
               }
            }
         }

      }
   }

   private static final void a(ta var0, Object[] var1, int var2, int var3, int var4, int var5, int[] var6, int[] var7) {
      int var8 = fh.a(var1, false);
      if((var8 & 1) == 0) {
         boolean var9 = (var8 & 2) == 0;
         int var10 = var8 >> 2 & 63;
         if(var10 == 62) {
            return;
         }

         if(var10 == 63) {
            var10 = fh.a(var1, false);
         } else if(var9) {
            var10 = var6[var10];
         } else {
            var10 = var7[var10];
         }

         if(var9) {
            s[var4 + var5 * f] = (byte)var10;
            o[var4 + var5 * f] = 0;
         } else {
            o[var4 + var5 * f] = (byte)var10;
            m[var4 + var5 * f] = 0;
            s[var4 + var5 * f] = ipa.a(var1, (int)-96);
         }
      } else {
         int var20 = (var8 >> 1 & 3) + 1;
         boolean var21 = (var8 & 8) != 0;
         boolean var11 = (var8 & 16) != 0;

         for(int var12 = 0; var12 < var20; ++var12) {
            int var13 = fh.a(var1, false);
            int var14 = 0;
            int var15 = 0;
            if(var21) {
               var14 = fh.a(var1, false);
               var15 = fh.a(var1, false);
            }

            int var16 = 0;
            if(var11) {
               var16 = fh.a(var1, false);
            }

            int[] var17;
            int var19;
            byte[] var18;
            if(var12 == 0) {
               s[var4 + var5 * f] = (byte)var13;
               o[var4 + var5 * f] = (byte)var14;
               m[var4 + var5 * f] = (byte)var15;
               if(var16 == 1) {
                  N[var4 + var5 * f] = new Integer(fma.c(-17126, var1));
                  p[var4 + var5 * f] = ipa.a(var1, (int)-102);
               } else if(var16 > 1) {
                  var17 = new int[var16];
                  var18 = new byte[var16];

                  for(var19 = 0; var19 < var16; ++var19) {
                     var17[var19] = fma.c(-17126, var1);
                     var18[var19] = ipa.a(var1, (int)-119);
                  }

                  N[var4 + var5 * f] = new pra(var17, var18);
               }
            } else {
               var17 = null;
               var18 = null;
               if(var16 > 0) {
                  var17 = new int[var16];
                  var18 = new byte[var16];

                  for(var19 = 0; var19 < var16; ++var19) {
                     var17[var19] = fma.c(-17126, var1);
                     var18[var19] = ipa.a(var1, (int)-100);
                  }
               }

               if(f_i[var12 - 1][var2 - (n >> 6)][var3 - (u >> 6)] == null) {
                  f_i[var12 - 1][var2 - (n >> 6)][var3 - (u >> 6)] = aqa.a(new Object[2], 20);
               }

               ku var22 = new ku(var4 & 63, var5 & 63, var13, var14, var15, var17, var18);
               gt.a(f_i[var12 - 1][var2 - (n >> 6)][var3 - (u >> 6)], -127, var22);
            }
         }
      }

   }

   private static final void d() {
      int var3;
      int var4;
      int var16;
      Object[] var18;
      for(var3 = 0; var3 < f; ++var3) {
         for(var4 = 0; var4 < K; ++var4) {
            Object var5 = N[var3 + var4 * f];
            if(var5 != null) {
               if(var5 instanceof pra) {
                  pra var6 = (pra)var5;
                  if(var6 != null) {
                     for(int var7 = 0; var7 < var6.k.length; ++var7) {
                        Object[] var8 = mca.a(true, var6.k[var7], w);
                        int var9 = ((int[])((int[])var8[1]))[25];
                        if(var8[11] != null) {
                           var8 = vs.a(d, var8, (byte)-78);
                           if(var8 != null) {
                              var9 = ((int[])((int[])var8[1]))[25];
                           }
                        }

                        if(var9 != -1) {
                           Object[] var10 = opa.a(var9, (byte)127, new Object[3]);
                           ((int[])((int[])var10[1]))[0] = var3;
                           ((int[])((int[])var10[1]))[4] = var4;
                           client.a(106, t, (lm)(var10 == null?null:var10[2]));
                        }
                     }
                  }
               } else {
                  Integer var14 = (Integer)var5;
                  Object[] var15 = mca.a(true, var14.intValue(), w);
                  var16 = ((int[])((int[])var15[1]))[25];
                  if(var15[11] != null) {
                     var15 = vs.a(d, var15, (byte)-93);
                     if(var15 != null) {
                        var16 = ((int[])((int[])var15[1]))[25];
                     }
                  }

                  if(var16 != -1) {
                     var18 = opa.a(var16, (byte)108, new Object[3]);
                     ((int[])((int[])var18[1]))[0] = var3;
                     ((int[])((int[])var18[1]))[4] = var4;
                     client.a(-60, t, (lm)(var18 == null?null:var18[2]));
                  }
               }
            }
         }
      }

      for(var3 = 0; var3 < 3; ++var3) {
         for(var4 = 0; var4 < f_i[0].length; ++var4) {
            for(int var12 = 0; var12 < f_i[0][0].length; ++var12) {
               Object[] var13 = f_i[var3][var4][var12];
               if(var13 != null) {
                  for(ku var17 = (ku)om.a(var13, false); var17 != null; var17 = (ku)pw.a(var13, 121)) {
                     if(var17.k != null) {
                        for(var16 = 0; var16 < var17.k.length; ++var16) {
                           var18 = mca.a(true, var17.k[var16], w);
                           int var19 = ((int[])((int[])var18[1]))[25];
                           if(var18[11] != null) {
                              var18 = vs.a(d, var18, (byte)-93);
                              if(var18 != null) {
                                 var19 = ((int[])((int[])var18[1]))[25];
                              }
                           }

                           if(var19 != -1) {
                              Object[] var11 = opa.a(var19, (byte)125, new Object[3]);
                              ((int[])((int[])var11[1]))[0] = (var4 + (n >> 6)) * 64 + var17.f_i - n;
                              ((int[])((int[])var11[1]))[4] = (var12 + (u >> 6)) * 64 + var17.o - u;
                              client.a(-124, t, (lm)(var11 == null?null:var11[2]));
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static final void b(ta var0) {
      int var1 = a - H;
      int var2 = b - k;
      int var3 = (B - C << 16) / var1;
      int var4 = (g - D << 16) / var2;
      b(var0, var3, var4, 0, 0);
   }

   static final void a(ta var0, Object[] var1, Object[] var2) {
      if(var2[3] != null) {
         int[] var3 = new int[((int[])((int[])var2[3])).length];

         int var4;
         int var5;
         int var6;
         for(var4 = 0; var4 < var3.length / 2; ++var4) {
            var5 = ((int[])((int[])var2[3]))[var4 * 2] + ((int[])((int[])var1[1]))[0];
            var6 = ((int[])((int[])var2[3]))[var4 * 2 + 1] + ((int[])((int[])var1[1]))[4];
            var3[var4 * 2] = C + (B - C) * (var5 - H) / (a - H);
            var3[var4 * 2 + 1] = g - (g - D) * (var6 - k) / (b - k);
         }

         fm.a(var0, var3, ((int[])((int[])var2[1]))[0]);
         if(((int[])((int[])var2[1]))[5] > 0) {
            int var7;
            int var8;
            int var9;
            for(var4 = 0; var4 < var3.length / 2 - 1; ++var4) {
               var5 = var3[var4 * 2];
               var6 = var3[var4 * 2 + 1];
               var7 = var3[(var4 + 1) * 2];
               var8 = var3[(var4 + 1) * 2 + 1];
               if(var7 < var5) {
                  var9 = var5;
                  int var10 = var6;
                  var5 = var7;
                  var6 = var8;
                  var7 = var9;
                  var8 = var10;
               } else if(var7 == var5 && var8 < var6) {
                  var9 = var6;
                  var6 = var8;
                  var8 = var9;
               }

               var0.a(var5, var6, var7, var8, ((int[])((int[])var2[6]))[((byte[])((byte[])var2[7]))[var4] & 255], 1, ((int[])((int[])var2[1]))[5], ((int[])((int[])var2[1]))[9], ((int[])((int[])var2[1]))[17]);
            }

            var4 = var3[var3.length - 2];
            var5 = var3[var3.length - 1];
            var6 = var3[0];
            var7 = var3[1];
            if(var6 < var4) {
               var8 = var4;
               var9 = var5;
               var4 = var6;
               var5 = var7;
               var6 = var8;
               var7 = var9;
            } else if(var6 == var4 && var7 < var5) {
               var8 = var5;
               var5 = var7;
               var7 = var8;
            }

            var0.a(var4, var5, var6, var7, ((int[])((int[])var2[6]))[((byte[])((byte[])var2[7]))[((byte[])((byte[])var2[7])).length - 1] & 255], 1, ((int[])((int[])var2[1]))[5], ((int[])((int[])var2[1]))[9], ((int[])((int[])var2[1]))[17]);
         } else {
            for(var4 = 0; var4 < var3.length / 2 - 1; ++var4) {
               var0.a(((int[])((int[])var2[6]))[((byte[])((byte[])var2[7]))[var4] & 255], var3[(var4 + 1) * 2], var3[(var4 + 1) * 2 + 1], var3[var4 * 2 + 1], (byte)-71, var3[var4 * 2]);
            }

            var0.a(((int[])((int[])var2[6]))[((byte[])((byte[])var2[7]))[((byte[])((byte[])var2[7])).length - 1] & 255], var3[0], var3[1], var3[var3.length - 1], (byte)-71, var3[var3.length - 2]);
         }
      }

   }

   static final void a() {
      s = new byte[f * K];
      o = new byte[f * K];
      m = new byte[f * K];
      N = new Object[f * K];
      p = new byte[f * K];
      f_i = new Object[3][f >> 6][K >> 6][];
      f_l = new int[((int[])((int[])c[1]))[1] + 1];
   }

   static final Object[] a(ta var0) {
      int var1 = a - H;
      int var2 = b - k;
      int var3 = (B - C << 16) / var1;
      int var4 = (g - D << 16) / var2;
      return a(var0, var3, var4, 0, 0);
   }

   private static final Object[] a(ta var0, int var1, int var2, int var3, int var4) {
      rda var5;
      rda var6;
      for(Object[] var7 = (var5 = (rda)dda.a(t, 2)) == null?null:var5.o; var7 != null; var7 = (var6 = (rda)client.a(t, -28280)) == null?null:var6.o) {
         a(var0, var7, var1, var2, var3, var4);
      }

      return t;
   }

}
