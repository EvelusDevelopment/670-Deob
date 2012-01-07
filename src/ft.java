import jaggl.OpenGL;

final class ft {

   static int q;
   static int r;
   static int g;
   static int o;
   static Object[] c = ab.a(new Object[2], (byte)-127);
   static int h;
   static int k;
   static int f;
   static int d;
   static int f_l;
   static int j;
   private Object[] e;
   static byte[][] b;
   static Object[] p = st.a(new Object[1], 7, 70, 13);
   static int f_i;
   static Object[] a = sd.a(new Object[1], 81, (byte)111);
   static Object[][] n = new Object[0][];
   static int m = 0;


   static final void a(Object[] var0, boolean var1, int var2) {
      ++k;
      Object[] var3 = ro.a((int)3, var0);
      if(null != var0 && var0.length == 1) {
         nf.c[4] = null;
      }

      if(((int[])((int[])var0[12]))[18] == 0) {
         la.h = 0;
         ((int[])((int[])var0[12]))[12] = 0;
         jma.k = -1;
      } else {
         Object[] var4;
         if(wna.a((Object[])((Object[])var0[25]), 4) && !tt.a((Object[])((Object[])var0[25]), 0)) {
            var4 = nc.a(false, (Object[])((Object[])var0[25]));
            if(0 < ((int[])((int[])var0[12]))[20] && 0 == ((int[])((int[])var4[1]))[6]) {
               ++((int[])((int[])var0[12]))[12];
               la.h = 0;
               jma.k = -1;
               return;
            }

            if(-1 <= ~((int[])((int[])var0[12]))[20] && ((int[])((int[])var4[1]))[2] == 0) {
               ++((int[])((int[])var0[12]))[12];
               la.h = 0;
               jma.k = -1;
               return;
            }
         }

         for(int var17 = 0; ((Object[])((Object[])var0[18])).length > var17; ++var17) {
            if(((int[])((int[])((Object[][])((Object[][])var0[18]))[var17][1]))[1] != -1 && tt.a((Object[])((Object[])((Object[][])((Object[][])var0[18]))[var17][0]), 0)) {
               Object[] var5 = qda.a(((int[])((int[])((Object[][])((Object[][])var0[18]))[var17][1]))[1], (byte)-64, dfa.a);
               if(((boolean[])((boolean[])var5[6]))[0] && ((int[])((int[])var5[1]))[4] != -1) {
                  Object[] var6 = bs.a(he.b, -15, ((int[])((int[])var5[1]))[4]);
                  if(((int[])((int[])var0[12]))[20] > 0 && ((int[])((int[])var6[1]))[6] == 0) {
                     ++((int[])((int[])var0[12]))[12];
                     la.h = 0;
                     jma.k = -1;
                     return;
                  }

                  if(0 >= ((int[])((int[])var0[12]))[20] && -1 == ~((int[])((int[])var6[1]))[2]) {
                     ++((int[])((int[])var0[12]))[12];
                     la.h = 0;
                     jma.k = -1;
                     return;
                  }
               }
            }
         }

         var4 = mha.a((byte)120, new Object[2], (Object[])((Object[])woa.a(5, var0)[1]));
         int var18 = (int)((float[])((float[])var4[1]))[2];
         int var19 = (int)((float[])((float[])var4[1]))[1];
         int var7 = ((int[])((int[])var0[33]))[-1 + ((int[])((int[])var0[12]))[18]] * 512 + dg.a(-93, var0) * 256;
         int var8 = ((int[])((int[])var0[14]))[-1 + ((int[])((int[])var0[12]))[18]] * 512 + 256 * dg.a(-113, var0);
         if(var2 < 48) {
            a(92, (Object[])((Object[])a[0]), -108, (re)null);
         }

         if(var18 >= var7) {
            if(var18 > var7) {
               if(var19 >= var8) {
                  if(var19 <= var8) {
                     wsa.a(var0, (byte)113, 4096);
                  } else {
                     wsa.a(var0, (byte)113, 2048);
                  }
               } else {
                  wsa.a(var0, (byte)113, 6144);
               }
            } else if(var8 > var19) {
               wsa.a(var0, (byte)113, 8192);
            } else if(var8 < var19) {
               wsa.a(var0, (byte)113, 0);
            }
         } else if(var19 >= var8) {
            if(var19 <= var8) {
               wsa.a(var0, (byte)113, 12288);
            } else {
               wsa.a(var0, (byte)113, 14336);
            }
         } else {
            wsa.a(var0, (byte)113, 10240);
         }

         byte var9 = ((byte[])((byte[])var0[22]))[((int[])((int[])var0[12]))[18] - 1];
         if(!var1 && (-var18 + var7 > 1024 || 1023 < ~(var7 - var18) || 1024 < -var19 + var8 || var8 - var19 < -1024)) {
            sra.a(var0, bl.a((byte)-108, (float)var7, new Object[2], (float)var8, ((float[])((float[])var4[1]))[0]), 1);
            dd.a((byte)0, false, ((int[])((int[])var0[12]))[31], var0);
            --((int[])((int[])var0[12]))[18];
            if(((int[])((int[])var0[12]))[20] > 0) {
               --((int[])((int[])var0[12]))[20];
            }

            jma.k = -1;
            la.h = 0;
         } else {
            int var10 = 16;
            boolean var11 = true;
            if(var0 != null && 43 == var0.length && 10 == ((boolean[])((boolean[])var0[8])).length) {
               var11 = ((boolean[])((boolean[])((Object[])((Object[])var0[42]))[8]))[4];
            }

            int var12;
            if(var11) {
               var12 = ((int[])((int[])var0[12]))[31] - ((int[])((int[])((Object[])((Object[])var0[35]))[0]))[1];
               if(var12 != 0 && 0 == ~((int[])((int[])var0[12]))[14] && -1 != ~((int[])((int[])var0[12]))[27]) {
                  var10 = 8;
               }

               if(!var1 && -3 > ~((int[])((int[])var0[12]))[18]) {
                  var10 = 24;
               }

               if(!var1 && 3 < ((int[])((int[])var0[12]))[18]) {
                  var10 = 32;
               }
            } else {
               if(!var1 && ((int[])((int[])var0[12]))[18] > 1) {
                  var10 = 24;
               }

               if(!var1 && 2 < ((int[])((int[])var0[12]))[18]) {
                  var10 = 32;
               }
            }

            if(((int[])((int[])var0[12]))[12] > 0 && ((int[])((int[])var0[12]))[18] > 1) {
               var10 = 32;
               --((int[])((int[])var0[12]))[12];
            }

            if(2 != var9) {
               if(var9 == 0) {
                  var10 >>= 1;
               }
            } else {
               var10 <<= 1;
            }

            la.h = 0;
            if(((int[])((int[])var3[1]))[14] != -1) {
               var10 <<= 9;
               if(((int[])((int[])var0[12]))[18] == 1) {
                  var12 = ((int[])((int[])var0[12]))[30] * ((int[])((int[])var0[12]))[30];
                  int var13 = ((int)((float[])((float[])var4[1]))[2] <= var7?var7 + -((int)((float[])((float[])var4[1]))[2]):-var7 + (int)((float[])((float[])var4[1]))[2]) << 9;
                  int var14 = (var8 >= (int)((float[])((float[])var4[1]))[1]?-((int)((float[])((float[])var4[1]))[1]) + var8:(int)((float[])((float[])var4[1]))[1] - var8) << 9;
                  int var15 = var13 > var14?var13:var14;
                  int var16 = var15 * ((int[])((int[])var3[1]))[14] * 2;
                  if(var12 <= var16) {
                     if(var15 >= var12 / 2) {
                        if(((int[])((int[])var0[12]))[30] < var10) {
                           ((int[])((int[])var0[12]))[30] += ((int[])((int[])var3[1]))[14];
                           if(((int[])((int[])var0[12]))[30] > var10) {
                              ((int[])((int[])var0[12]))[30] = var10;
                           }
                        }
                     } else {
                        ((int[])((int[])var0[12]))[30] -= ((int[])((int[])var3[1]))[14];
                        if(((int[])((int[])var0[12]))[30] < 0) {
                           ((int[])((int[])var0[12]))[30] = 0;
                        }
                     }
                  } else {
                     ((int[])((int[])var0[12]))[30] /= 2;
                  }
               } else if(var10 > ((int[])((int[])var0[12]))[30]) {
                  ((int[])((int[])var0[12]))[30] += ((int[])((int[])var3[1]))[14];
                  if(((int[])((int[])var0[12]))[30] > var10) {
                     ((int[])((int[])var0[12]))[30] = var10;
                  }
               } else if(0 < ((int[])((int[])var0[12]))[30]) {
                  ((int[])((int[])var0[12]))[30] -= ((int[])((int[])var3[1]))[14];
                  if(0 > ((int[])((int[])var0[12]))[30]) {
                     ((int[])((int[])var0[12]))[30] = 0;
                  }
               }

               var10 = ((int[])((int[])var0[12]))[30] >> 9;
               if(1 > var10) {
                  var10 = 1;
               }
            }

            if(var18 == var7 && var8 == var19) {
               jma.k = -1;
            } else {
               if(var7 <= var18) {
                  if(var18 > var7) {
                     la.h |= 8;
                     ((float[])((float[])var4[1]))[2] -= (float)var10;
                     if((float)var7 > ((float[])((float[])var4[1]))[2]) {
                        ((float[])((float[])var4[1]))[2] = (float)var7;
                     }
                  }
               } else {
                  la.h |= 4;
                  ((float[])((float[])var4[1]))[2] += (float)var10;
                  if(((float[])((float[])var4[1]))[2] > (float)var7) {
                     ((float[])((float[])var4[1]))[2] = (float)var7;
                  }
               }

               if(var19 < var8) {
                  ((float[])((float[])var4[1]))[1] += (float)var10;
                  la.h |= 1;
                  if(((float[])((float[])var4[1]))[1] > (float)var8) {
                     ((float[])((float[])var4[1]))[1] = (float)var8;
                  }
               } else if(var8 < var19) {
                  la.h |= 2;
                  ((float[])((float[])var4[1]))[1] -= (float)var10;
                  if((float)var8 > ((float[])((float[])var4[1]))[1]) {
                     ((float[])((float[])var4[1]))[1] = (float)var8;
                  }
               }

               sra.a(var0, var4, 1);
               if(var10 >= 32) {
                  jma.k = 2;
               } else {
                  jma.k = var9;
               }
            }

            if((int)((float[])((float[])var4[1]))[2] == var7 && (int)((float[])((float[])var4[1]))[1] == var8) {
               --((int[])((int[])var0[12]))[18];
               if(-1 > ~((int[])((int[])var0[12]))[20]) {
                  --((int[])((int[])var0[12]))[20];
               }
            }

         }
      }
   }

   static final boolean b(Object[] var0, byte var1) {
      ((boolean[])((boolean[])var0[4]))[0] = false;
      ++h;
      return var1 <= 102?true:true;
   }

   static final int a(Object[] var0, int var1) {
      ++g;
      return var1 != -14072?-31:((int[])((int[])var0[1]))[0];
   }

   ft(Object[] var1) {
      this.e = var1;
   }

   static final int a(Object[] var0, byte var1) {
      ++r;
      if(var1 > -89) {
         f_i = 115;
      }

      return ((byte[])((byte[])var0[10]))[2];
   }

   static final int a(byte var0, Object[] var1) {
      ++f_l;
      if(var1 != null && var1.length == 6) {
         return gka.a(var1, (byte)-37);
      } else if(var1 != null && -8 == ~var1.length) {
         return mca.a((byte)60, var1);
      } else {
         if(var0 >= -114) {
            b((Object[])null, (byte)-75);
         }

         throw new IllegalStateException();
      }
   }

   static final void a(Object[] var0, int var1, Class_s var2, ta var3, int var4, boolean var5, int var6, int var7, int var8) {
      ++o;
      Object[] var9 = ita.a(var7, oe.g, -96);
      if(null != var9 && ((boolean[])((boolean[])var9[9]))[0] && hta.a(-49, var9, eo.g)) {
         int var11;
         int var15;
         int var17;
         int var16;
         int var18;
         if(null != var9[3]) {
            int[] var10 = new int[((int[])((int[])var9[3])).length];

            int var12;
            int var13;
            int var14;
            for(var11 = 0; var11 < var10.length / 2; ++var11) {
               if(ha.e == 1) {
                  var12 = 16383 & (int)sma.h;
               } else {
                  var12 = (int)sma.h + coa.v & 16383;
               }

               var13 = tda.p[var12];
               var14 = tda.k[var12];
               if(1 != ha.e) {
                  var14 = var14 * 256 / (kma.b + 256);
                  var13 = var13 * 256 / (kma.b + 256);
               }

               var10[2 * var11] = ((int[])((int[])var0[1]))[70] / 2 + var6 + ((4 * ((int[])((int[])var9[3]))[var11 * 2] + var1) * var14 + (var8 + 4 * ((int[])((int[])var9[3]))[1 + var11 * 2]) * var13 >> 14);
               var10[1 + var11 * 2] = -(-(var13 * (((int[])((int[])var9[3]))[2 * var11] * 4 + var1)) + (var8 + 4 * ((int[])((int[])var9[3]))[2 * var11 + 1]) * var14 >> 14) + ((int[])((int[])var0[1]))[2] / 2 + var4;
            }

            Object[] var26 = coa.a(var3, var0, (byte)-100);
            if(null != var26) {
               fm.a(var3, var10, ((int[])((int[])var9[1]))[0], (int[])((int[])var26[3]), (int[])((int[])var26[0]));
            }

            if(((int[])((int[])var9[1]))[5] <= 0) {
               for(var12 = 0; var10.length / 2 - 1 > var12; ++var12) {
                  var3.a(var10[var12 * 2], var10[var12 * 2 + 1], var10[2 * (1 + var12)], var10[(1 + var12) * 2 + 1], ((int[])((int[])var9[6]))[255 & ((byte[])((byte[])var9[7]))[var12]], 1, var2, var6, var4);
               }

               if(null != var0 && (var0.length == 7 || -9 == ~var0.length)) {
                  em.c = -17;
               }

               var3.a(var10[-2 + var10.length], var10[-1 + var10.length], var10[0], var10[1], ((int[])((int[])var9[6]))[((byte[])((byte[])var9[7]))[-1 + ((byte[])((byte[])var9[7])).length] & 255], 1, var2, var6, var4);
            } else {
               for(var12 = 0; var10.length / 2 - 1 > var12; ++var12) {
                  var13 = var10[var12 * 2];
                  var14 = var10[1 + var12 * 2];
                  var15 = var10[2 * var12 + 2];
                  var16 = var10[2 + 2 * var12 + 1];
                  if(var15 >= var13) {
                     if(var15 == var13 && var14 > var16) {
                        var17 = var14;
                        var14 = var16;
                        var16 = var17;
                     }
                  } else {
                     var17 = var13;
                     var13 = var15;
                     var18 = var14;
                     var14 = var16;
                     var15 = var17;
                     var16 = var18;
                  }

                  var3.a(var13, var14, var15, var16, ((int[])((int[])var9[6]))[255 & ((byte[])((byte[])var9[7]))[var12]], 1, var2, var6, var4, ((int[])((int[])var9[1]))[5], ((int[])((int[])var9[1]))[9], ((int[])((int[])var9[1]))[17]);
               }

               var12 = var10[var10.length - 2];
               var13 = var10[-1 + var10.length];
               var14 = var10[0];
               var15 = var10[1];
               if(var12 > var14) {
                  var16 = var12;
                  var17 = var13;
                  var12 = var14;
                  var14 = var16;
                  var13 = var15;
                  var15 = var17;
               } else if(var12 == var14 && var15 < var13) {
                  var16 = var13;
                  var13 = var15;
                  var15 = var16;
               }

               var3.a(var12, var13, var14, var15, ((int[])((int[])var9[6]))[255 & ((byte[])((byte[])var9[7]))[((byte[])((byte[])var9[7])).length - 1]], 1, var2, var6, var4, ((int[])((int[])var9[1]))[5], ((int[])((int[])var9[1]))[9], ((int[])((int[])var9[1]))[17]);
               if(null != var26 && 21 == var26.length && var26[3].equals(Integer.valueOf(1))) {
                  bma.m = 64;
               }
            }
         }

         cga var25 = null;
         if(~((int[])((int[])var9[1]))[21] != 0) {
            var25 = gja.a(var3, false, 1, var9);
            if(var25 != null) {
               rh.a(var4, var6, 8, var0, var2, var1, var8, var25);
            }
         }

         if(null != var9[2]) {
            var11 = 0;
            if(var25 != null) {
               var11 = var25.g();
            }

            ja var27 = kv.f_i;
            Object[] var28 = ec.d;
            if(((int[])((int[])var9[1]))[19] == 1) {
               var28 = nsa.c;
               var27 = fha.m;
            }

            if(-3 == ~((int[])((int[])var9[1]))[19]) {
               var28 = pia.d;
               var27 = wla.f;
            }

            String var29 = (String)var9[2];
            var15 = ((int[])((int[])var9[1]))[1];
            if(ha.e != 1) {
               var16 = coa.v + (int)sma.h & 16383;
            } else {
               var16 = (int)sma.h & 16383;
            }

            if(null != var9 && (-6 == ~var9.length || var9.length == 5 && var9[0].equals(Integer.valueOf(0)))) {
               esa.a((ta)((Object[])((Object[])ja.w[5]))[30], 4);
            }

            var17 = 10 + Math.max(((int[])((int[])var0[1]))[70] / 2, ((int[])((int[])var0[1]))[2] / 2);
            var18 = var8 * var8 + var1 * var1;
            if(var17 * var17 >= var18) {
               int var19 = tda.p[var16];
               int var20 = tda.k[var16];
               if(1 != ha.e) {
                  var20 = 256 * var20 / (256 + kma.b);
                  var19 = var19 * 256 / (kma.b + 256);
               }

               int var21 = var19 * var8 + var20 * var1 >> 14;
               int var22 = -(var1 * var19) + var20 * var8 >> 14;
               int var23 = ina.a(var28, var29, -60, (cga[])null, 100);
               int var24 = qc.a((cga[])null, 100, 0, var29, var28, -32183);
               var21 -= var23 / 2;
               if(-((int[])((int[])var0[1]))[70] <= var21 && var21 <= ((int[])((int[])var0[1]))[70] && -((int[])((int[])var0[1]))[2] <= var22 && ~var22 >= ~((int[])((int[])var0[1]))[2]) {
                  var27.a(0, var29, (cga[])null, var23, var15, 50, 1, 0, (byte)-80, var6, var4, var2, -var24 + -var22 + var4 + ((int[])((int[])var0[1]))[2] / 2 + -var11, 0, (int[])null, var21 + var6 + ((int[])((int[])var0[1]))[70] / 2);
               }
            }
         }
      }

      if(!var5) {
         n = (Object[][])((Object[][])null);
      }

   }

   static final void a(int var0, Object[] var1, int var2, re var3) {
      try {
         ++f;
         if(var2 <= 126) {
            ((long[])((long[])c[5]))[1] = 36L;
         }

         int var6 = 1 << var0;
         Object[] var7 = ng.a(var3, 62);
         if(null != var3) {
            if(-1 != ~((int[])((int[])var1[5]))[0]) {
               if(~((int[])((int[])var1[5]))[3] != ~pc.a((byte)-121, var7).c() || ~((int[])((int[])var1[5]))[4] != ~pc.a((byte)125, var7).b()) {
                  throw new RuntimeException();
               }
            } else {
               ((int[])((int[])var1[5]))[4] = pc.a((byte)-75, var7).b();
               ((int[])((int[])var1[5]))[3] = pc.a((byte)-106, var7).c();
               il.b((byte)101, var1);
            }

            ((int[])((int[])var1[5]))[0] |= var6;
            ((Object[][])((Object[][])var1[2]))[var0] = var7;
         } else {
            ((int[])((int[])var1[5]))[0] &= ~var6;
            ((Object[][])((Object[][])var1[2]))[var0] = null;
            if(((int[])((int[])var1[5]))[0] == 0) {
               ((int[])((int[])var1[5]))[4] = 0;
               ((int[])((int[])var1[5]))[3] = 0;
            }
         }

         Object[] var5;
         if((var1 == null?null:var1[1]) != ((ta)((var5 = (Object[])((Object[])var1[4])) != null?var5[38]:null)).e(30626)) {
            ((int[])((int[])var1[5]))[1] |= var6;
         } else {
            Object[] var8 = ((Object[][])((Object[][])var1[2]))[var0];
            if(var8 == null) {
               OpenGL.glFramebufferRenderbufferEXT('\u8d40', var0 + '\u8ce0', '\u8d41', 0);
            } else {
               qm.a(75, var8, '\u8ce0' + var0);
            }
         }

      } catch (RuntimeException var9) {
         throw vt.a(var9, "ft.E(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   static final boolean a(byte var0, String var1) {
      ++j;
      if(var0 > -44) {
         a((Object[])null, 1, (Class_s)null, (ta)null, ((int[])((int[])((Object[])((Object[])p[2]))[9]))[6], true, 60, ((int[])((int[])p[6]))[5], 31);
      }

      boolean var3 = false;
      boolean var4 = false;
      int var5 = 0;
      int var6 = var1.length();
      int var7 = 0;

      boolean var2;
      while(true) {
         if(var7 >= var6) {
            var2 = var4;
            break;
         }

         label76: {
            char var8 = var1.charAt(var7);
            if(var7 == 0) {
               if(45 == var8) {
                  var3 = true;
                  break label76;
               }

               if(var8 == 43) {
                  break label76;
               }
            }

            int var10;
            if(48 <= var8 && var8 <= 57) {
               var10 = var8 - 48;
            } else if(var8 >= 65 && var8 <= 90) {
               var10 = var8 - 55;
            } else {
               if(var8 < 97 || var8 > 122) {
                  var2 = false;
                  break;
               }

               var10 = var8 - 87;
            }

            if(10 <= var10) {
               var2 = false;
               break;
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var10 + 10 * var5;
            if(var9 / 10 != var5) {
               var2 = false;
               break;
            }

            var5 = var9;
            var4 = true;
         }

         ++var7;
      }

      return var2;
   }

   final void a(int var1) throws Throwable {
      if(var1 != 84) {
         a(((int[])((int[])a[3]))[32], (Object[])null, ((int[])((int[])p[2]))[32], (re)null);
      }

      ++d;
      super.finalize();
   }

   protected final void finalize() throws Throwable {
      eb.b(3, this.e);
      ++q;
   }

}
