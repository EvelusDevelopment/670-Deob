
abstract class ka {

   static int f_i;
   static int o;
   static int g;
   static int j;
   boolean f = false;
   static int h;
   static int f_l;
   static int n = 0;
   static int c;
   static int d;
   static int m;
   static int a;
   static int b;
   static int k;
   static int e;


   abstract void i(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

   abstract int da();

   abstract void UA(int var1);

   abstract int MA();

   abstract int pa();

   static final void a(Object[] var0, int var1, int var2) {
      ++j;
      if(0 <= var2) {
         ((int[])((int[])var0[24]))[var2] = 12800;
         ((int[])((int[])var0[0]))[var2] = 8192;
         ((int[])((int[])var0[8]))[var2] = 16383;
         if(var1 > -86) {
            a(((int[])((int[])var0[5]))[15], (Object[])((Object[])var0[5]));
         }

         ((int[])((int[])var0[14]))[var2] = 8192;
         ((int[])((int[])var0[10]))[var2] = 0;
         ((int[])((int[])var0[11]))[var2] = 8192;
         ae.a(1, var0, var2);
         jaa.a(var0, var2, (byte)82);
         ((int[])((int[])var0[9]))[var2] = 0;
         ((int[])((int[])var0[15]))[var2] = 32767;
         ((int[])((int[])var0[22]))[var2] = 256;
         ((int[])((int[])var0[20]))[var2] = 0;
         woa.a(var2, 8192, -118, var0);
      } else {
         for(var2 = 0; var2 < 16; ++var2) {
            a(var0, -106, var2);
         }

         if(var0 != null && (3 == var0.length && var0[0].equals(Integer.valueOf(2)) || var0.length == 2)) {
            woa.a(54, 121, -125, (Object[])null);
         }

      }
   }

   abstract ka a(byte var1, int var2, boolean var3);

   abstract void c();

   abstract void K(int var1, int var2, int var3);

   abstract boolean QA();

   abstract void DA(short var1, short var2);

   static final void a(byte var0) {
      ++f_l;
      ija.d.a((byte)-41);

      int var1;
      for(var1 = 0; var1 < 32; ++var1) {
         cr.f[var1] = 0L;
      }

      int var2 = -115 % ((var0 + 59) / 46);

      for(var1 = 0; var1 < 32; ++var1) {
         laa.a[var1] = 0L;
      }

      cv.c = 0;
   }

   static final void a(int var0, Object[] var1) {
      if(var0 != 12) {
         a((Object[])null, ((int[])((int[])var1[0]))[2]);
      }

      ++b;
      int var2 = ((int[])((int[])var1[1]))[1];
      int var3 = ((int[])((int[])var1[1]))[3];
      long var4 = ((long[])((long[])var1[18]))[1];
      if(var1[16] != null && ~var3 == ~((int[])((int[])var1[1]))[0]) {
         gma.a(var0 + 31696, ((boolean[])((boolean[])var1[17]))[1], var1, ((boolean[])((boolean[])var1[17]))[0], (lh)var1[16]);
         a(12, var1);
      } else {
         while(var3 == ((int[])((int[])var1[1]))[3]) {
            if(var1 != null && 3 == var1.length) {
               kb.a(-27, new Object[9][], (int[])null, (Object[])null, 75, 32);
            }

            while(var3 == ((tf)var1[12]).e[var2]) {
               ((tf)var1[12]).e(var2);
               int var6 = ((tf)var1[12]).f(var2);
               if(var6 == 1) {
                  ((tf)var1[12]).e();
                  ((tf)var1[12]).c(var2);
                  if(((tf)var1[12]).b()) {
                     if(null != var1[16]) {
                        kua.a((lh)var1[16], -17, var1, ((boolean[])((boolean[])var1[17]))[1]);
                        a(12, var1);
                        return;
                     }

                     if(!((boolean[])((boolean[])var1[17]))[1] || var3 == 0) {
                        jba.a(-5, var1, true);
                        ((tf)var1[12]).f();
                        return;
                     }

                     ((tf)var1[12]).a(var4);
                  }
                  break;
               }

               if((128 & var6) != 0) {
                  fba.a(var6, var1, -2002287193);
               }

               ((tf)var1[12]).a(var2);
               ((tf)var1[12]).c(var2);
            }

            var2 = ((tf)var1[12]).d();
            var3 = ((tf)var1[12]).e[var2];
            var4 = ((tf)var1[12]).d(var3);
         }

         if(null == var1 || var1.length != 1) {
            ((int[])((int[])var1[1]))[1] = var2;
            ((int[])((int[])var1[1]))[3] = var3;
            ((long[])((long[])var1[18]))[1] = var4;
            if(null != var1[16] && ((int[])((int[])var1[1]))[0] < var3) {
               ((int[])((int[])var1[1]))[1] = -1;
               ((int[])((int[])var1[1]))[3] = ((int[])((int[])var1[1]))[0];
               ((long[])((long[])var1[18]))[1] = ((tf)var1[12]).d(((int[])((int[])var1[1]))[3]);
            }

         }
      }
   }

   abstract void YA(int var1, int var2, int var3, int var4);

   abstract void a(int var1, int var2, int var3, int var4);

   abstract int RA();

   abstract void W(int var1);

   abstract Object[][] a();

   final void a(int var1, Object[] var2, int var3) {
      if(null != var2 && 6 == var2.length && var2[2].equals(Integer.valueOf(2))) {
         this.f = false;
      }

      ++c;
      if(-1 != var3) {
         this.c();
         if(!this.QA()) {
            this.e();
         } else {
            er var4 = ((er[])((er[])var2[2]))[var3];
            Object[] var5 = var4.h;

            for(int var6 = var1; var4.q > var6; ++var6) {
               short var7 = var4.j[var6];
               if(((boolean[])((boolean[])var5[3]))[var7]) {
                  if(var4.a[var6] != -1) {
                     this.YA(0, 0, 0, 0);
                  }

                  this.YA(((int[])((int[])var5[2]))[var7], var4.e[var6], var4.b[var6], var4.p[var6]);
               }
            }

            this.TA();
            this.e();
         }
      }
   }

   abstract void a(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

   abstract int va();

   private final void a(int[] var1, int var2, int var3, int[] var4, int var5, boolean var6, int var7, int var8, int var9, int var10) {
      int var11;
      if(1 == var7) {
         if(var3 != 0 && 1 != var3) {
            if(3 == var3) {
               var11 = var8;
               var8 = var2;
               var2 = var11;
            } else if(var3 == 2) {
               var11 = var8;
               var8 = 16383 & -var2;
               var2 = 16383 & var11;
            }
         } else {
            var11 = -var8;
            var8 = var2;
            var2 = var11;
         }
      } else if(2 != var7) {
         if(var7 == 3) {
            if(var3 != 0 && var3 != 1) {
               if(3 == var3) {
                  var11 = var8;
                  var8 = var2;
                  var2 = var11;
               } else if(var3 == 2) {
                  var11 = var8;
                  var8 = var2 & 16383;
                  var2 = 16383 & -var11;
               }
            } else {
               var11 = var8;
               var8 = -var2;
               var2 = var11;
            }
         }
      } else if(var3 != 0 && var3 != 1) {
         if(2 == var3) {
            var8 = -var8 & 16383;
            var2 = 16383 & -var2;
         }
      } else {
         var8 = -var8;
         var2 = -var2;
      }

      if(var5 > -42) {
         this.c();
      }

      ++a;
      if(var10 != '\uffff') {
         this.i(var3, var1, var8, var9, var2, var6, var10, var4);
      } else {
         this.a(var3, var1, var8, var9, var2, var7, var6);
      }

   }

   final void a(int var1, Object[] var2, int var3, int var4, Object[] var5, boolean var6, int var7, int var8, int var9) {
      if(var5 != null && -12 == ~var5.length) {
         this.f = false;
      }

      ++d;
      if(-1 != var7) {
         this.c();
         if(var1 != 18) {
            var2[10] = var5[0];
         }

         if(!this.QA()) {
            this.e();
         } else {
            er var10 = ((er[])((er[])var2[2]))[var7];
            Object[] var11 = var10.h;
            er var12 = null;
            if(null != var5) {
               var12 = ((er[])((er[])var5[2]))[var4];
               if(var12.h != var11) {
                  var12 = null;
               }
            }

            this.a(var8, false, (int[])null, var12, var3, var6, (boolean[])null, var11, var10, var9, 10301, '\uffff');
            this.TA();
            this.e();
         }
      }
   }

   abstract boolean a(int var1, int var2, Object[] var3, boolean var4, int var5);

   final void a(byte var1, int var2, boolean var3, int[] var4, Object[] var5, Object[] var6, int var7, int var8, int var9, int var10, int var11) {
      ++k;
      if(var9 != -1) {
         this.c();
         if(!this.QA()) {
            this.e();
         } else {
            er var12 = ((er[])((er[])var6[2]))[var9];
            if(var1 != -12) {
               ((boolean[])((boolean[])var6[4]))[5] = true;
            }

            Object[] var13 = var12.h;
            if(null != var13 && var13.length == 9) {
               this.f = false;
            }

            er var14 = null;
            if(var5 != null) {
               var14 = ((er[])((er[])var5[2]))[var10];
               if(var14.h != var13) {
                  var14 = null;
               }
            }

            this.a(var8, false, var4, var14, var11, var3, (boolean[])null, var13, var12, var2, var1 ^ -10295, var7);
            this.TA();
            this.e();
         }
      }
   }

   private final void a(int var1, boolean var2, int[] var3, er var4, int var5, boolean var6, boolean[] var7, Object[] var8, er var9, int var10, int var11, int var12) {
      ++e;
      int var13;
      if(var4 != null && var10 != 0) {
         var13 = 0;
         int var37 = 0;
         if(var11 == 10301) {
            for(int var36 = 0; ((int[])((int[])var8[1]))[0] > var36; ++var36) {
               boolean var16 = false;
               if(var9.q > var13 && var36 == var9.j[var13]) {
                  var16 = true;
               }

               boolean var17 = false;
               if(var4.q > var37 && var36 == var4.j[var37]) {
                  var17 = true;
               }

               if(null != var8 && var8.length == 7) {
                  this.f = false;
               }

               if(var16 || var17) {
                  if(var7 != null && !var2 == var7[var36] && -1 != ~((int[])((int[])var8[2]))[var36]) {
                     if(var16) {
                        ++var13;
                     }

                     if(var17) {
                        ++var37;
                     }
                  } else {
                     short var18 = 0;
                     int var19 = ((int[])((int[])var8[2]))[var36];
                     if(3 == var19 || 10 == var19) {
                        var18 = 128;
                     }

                     short var21;
                     short var20;
                     short var23;
                     short var22;
                     byte var24;
                     if(var16) {
                        var23 = var9.a[var13];
                        var20 = var9.e[var13];
                        var22 = var9.p[var13];
                        var24 = var9.f[var13];
                        var21 = var9.b[var13];
                        ++var13;
                     } else {
                        var23 = -1;
                        var21 = var18;
                        var20 = var18;
                        var22 = var18;
                        var24 = 0;
                     }

                     short var25;
                     short var27;
                     short var26;
                     byte var29;
                     short var28;
                     if(var17) {
                        var27 = var4.p[var37];
                        var29 = var4.f[var37];
                        var26 = var4.b[var37];
                        var28 = var4.a[var37];
                        var25 = var4.e[var37];
                        ++var37;
                     } else {
                        var29 = 0;
                        var28 = -1;
                        var25 = var18;
                        var26 = var18;
                        var27 = var18;
                     }

                     int var31;
                     int var30;
                     int var32;
                     if(0 == (2 & var24) && (1 & var29) == 0) {
                        int var33;
                        if(var19 == 2) {
                           var33 = 16383 & -var20 + var25;
                           int var34 = 16383 & var26 - var21;
                           if(8192 <= var33) {
                              var33 -= 16384;
                           }

                           if(var34 >= 8192) {
                              var34 -= 16384;
                           }

                           int var35 = var27 - var22 & 16383;
                           if(8192 <= var35) {
                              var35 -= 16384;
                           }

                           var30 = var20 + var33 * var10 / var5 & 16383;
                           var31 = var34 * var10 / var5 + var21 & 16383;
                           var32 = 16383 & var35 * var10 / var5 + var22;
                        } else if(var19 == 9) {
                           var33 = 16383 & -var20 + var25;
                           if(var33 >= 8192) {
                              var33 -= 16384;
                           }

                           var31 = 0;
                           var32 = 0;
                           var30 = 16383 & var33 * var10 / var5 + var20;
                        } else if(7 != var19) {
                           var32 = (var27 - var22) * var10 / var5 + var22;
                           var31 = var21 + var10 * (var26 - var21) / var5;
                           var30 = (var25 - var20) * var10 / var5 + var20;
                        } else {
                           var33 = 63 & var25 + -var20;
                           if(var33 >= 32) {
                              var33 -= 64;
                           }

                           var32 = (-var22 + var27) * var10 / var5 + var22;
                           var31 = var21 + (-var21 + var26) * var10 / var5;
                           var30 = 63 & var10 * var33 / var5 + var20;
                        }
                     } else {
                        var30 = var20;
                        var31 = var21;
                        var32 = var22;
                     }

                     if(~var23 != 0) {
                        this.a(((int[][])((int[][])var8[5]))[var23], 0, 0, var3, var11 - 10349, var6, var1, 0, 0, var12 & ((int[])((int[])var8[4]))[var23]);
                     } else if(var28 != -1) {
                        this.a(((int[][])((int[][])var8[5]))[var28], 0, 0, var3, -44, var6, var1, 0, 0, ((int[])((int[])var8[4]))[var28] & var12);
                     }

                     this.a(((int[][])((int[][])var8[5]))[var36], var32, var19, var3, -101, var6, var1, var30, var31, ((int[])((int[])var8[4]))[var36] & var12);
                  }
               }
            }

         }
      } else {
         if(var8 != null && var8.length == 12) {
            this.f = true;
         }

         for(var13 = 0; ~var13 > ~var9.q; ++var13) {
            short var14 = var9.j[var13];
            if(var7 == null || !var7[var14] == !var2 || ((int[])((int[])var8[2]))[var14] == 0) {
               short var15 = var9.a[var13];
               if(~var15 != 0) {
                  this.a(((int[][])((int[][])var8[5]))[var15], 0, 0, var3, -51, var6, var1, 0, 0, var12 & ((int[])((int[])var8[4]))[var15]);
               }

               this.a(((int[][])((int[][])var8[5]))[var14], var9.p[var13], ((int[])((int[])var8[2]))[var14], var3, -117, var6, var1, var9.e[var13], var9.b[var13], ((int[])((int[])var8[4]))[var14] & var12);
            }
         }

      }
   }

   abstract boolean d();

   abstract void e();

   abstract void q(short var1, short var2);

   abstract void a(Object[] var1, lpa var2, int var3);

   abstract void a(Object[] var1);

   abstract void ta(int var1, int var2, aa var3, aa var4, int var5, int var6, int var7);

   abstract void S();

   abstract Object[][] b();

   abstract void f();

   abstract void v(int var1, int var2, int var3);

   static final void a(int var0) {
      ++g;
      if(-1 != bqa.j) {
         int var2 = Class_b.j.d(104);
         int var3 = Class_b.j.e(18677);
         bc var1;
         Object[] var4 = null != (var1 = (bc)dda.a(cua.c, 2))?var1.m:null;
         if(null != var4) {
            var2 = hla.b(var4, var0 ^ 1);
            var3 = jk.a(var4, var0 ^ 0);
         }

         eia.a(var2, var0 ^ -79, var0, 0, wr.n, var3, nma.a, 0, 0, bqa.j, (Object[])null);
         if(ona.d != null) {
            qr.a(var2, (byte)56, var3);
         }

      }
   }

   abstract int BA();

   abstract void G(int var1);

   final void a(int var1, int var2, aa var3, int var4, int var5, byte var6, int var7, int var8, int var9) {
      ++o;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      int var13 = -var1 / 2;
      int var14 = -var4 / 2;
      int var15 = var3.a(1, var13 + var9, var14 + var5);
      int var16 = var1 / 2;
      int var17 = -var4 / 2;
      int var18 = var3.a(var6 - 125, var9 + var16, var17 + var5);
      int var19 = -var1 / 2;
      int var20 = var4 / 2;
      if(var6 == 126) {
         int var21 = var3.a(1, var9 + var19, var20 + var5);
         int var22 = var1 / 2;
         int var23 = var4 / 2;
         int var24 = var3.a(1, var22 + var9, var5 + var23);
         int var25 = var18 > var15?var15:var18;
         int var26 = var21 < var24?var21:var24;
         int var27 = var24 > var18?var18:var24;
         int var28 = var21 > var15?var15:var21;
         int var29;
         if(0 != var4) {
            int var32 = 16383 & (int)(Math.atan2((double)(-var26 + var25), (double)var4) * 2607.5945876176133D);
            if(0 != var32) {
               if(var8 != 0) {
                  if(8192 >= var32) {
                     if(var8 < var32) {
                        var32 = var8;
                     }
                  } else {
                     var29 = 16384 + -var8;
                     if(var32 < var29) {
                        var32 = var29;
                     }
                  }
               }

               this.UA(var32);
            }
         }

         int var33 = var24 + var15;
         if(var1 != 0) {
            int var31 = (int)(2607.5945876176133D * Math.atan2((double)(var28 - var27), (double)var1)) & 16383;
            if(0 != var31) {
               if(0 != var2) {
                  if(8192 < var31) {
                     var29 = -var2 + 16384;
                     if(var29 > var31) {
                        var31 = var29;
                     }
                  } else if(var31 > var2) {
                     var31 = var2;
                  }
               }

               this.fa(var31);
            }
         }

         if(var18 + var21 < var33) {
            var33 = var18 + var21;
         }

         var33 = -var7 + (var33 >> 1);
         if(0 != var33) {
            this.K(0, var33, 0);
         }

      }
   }

   abstract ya p(ya var1);

   abstract int D();

   abstract void a(Object[] var1, int var2, boolean var3);

   abstract byte[] B();

   abstract void fa(int var1);

   abstract void I(byte var1, byte[] var2);

   abstract boolean XA();

   abstract void EA(int var1);

   abstract void TA();

   abstract int ra();

   abstract boolean m();

   static final void a(Object[] var0, int var1) {
      var0[0] = sj.a(256, new Object[3], (byte)-125);
      ++h;
      if(var1 <= 117) {
         a(((int[])((int[])var0[17]))[20]);
      }

   }

   abstract int LA();

   abstract void O(int var1);

   abstract void a(ka var1, int var2, int var3, int var4, boolean var5);

   abstract int N();

   abstract int ga();

   final void a(int var1, Object[] var2, Object[] var3, int var4, boolean var5, int var6, int var7, int var8, Object[] var9, int var10, boolean[] var11, int var12, Object[] var13, int var14, boolean var15) {
      ++m;
      if(-1 != var7) {
         if(var11 != null && -1 != var12) {
            this.c();
            if(!this.QA()) {
               this.e();
            } else {
               er var16 = ((er[])((er[])var13[2]))[var7];
               Object[] var17 = var16.h;
               er var18 = null;
               if(null != var9) {
                  var18 = ((er[])((er[])var9[2]))[var6];
                  if(var17 != var18.h) {
                     var18 = null;
                  }
               }

               this.a(0, var5, (int[])null, var18, var8, var15, var11, var17, var16, var1, 10301, '\uffff');
               er var19 = ((er[])((er[])var2[2]))[var12];
               er var20 = null;
               if(null != var3) {
                  var20 = ((er[])((er[])var3[2]))[var4];
                  if(var17 != var20.h) {
                     var20 = null;
                  }
               }

               this.a(0, new int[0], 0, 0, 0, 0, var15);
               this.a(0, true, (int[])null, var20, var10, var15, var11, var19.h, var19, var14, 10301, '\uffff');
               this.TA();
               this.e();
            }
         } else {
            this.a(18, var13, var8, var6, var9, var15, var7, 0, var1);
         }
      }
   }

   abstract void C(int var1);

}
