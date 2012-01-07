
final class kj {

   static int k;
   static int d;
   static int c;
   static int b;
   static int a;
   static int f_i;
   static int f;
   static boolean j;
   static int h = -1;
   static int g;
   static int e;


   static final void a(int var0, Object[] var1, int var2, int var3, int var4, byte var5) {
      ++d;
      if(0 != ~((int[])((int[])var1[1]))[13] || null != var1[2]) {
         int var6 = 0;
         int var7 = ((int[])((int[])var1[1]))[12] * hba.a((Object[])((Object[])tu.d[33]), 0) >> 8;
         if(null != var1 && var1.length == 10 && var1[2].equals(Boolean.valueOf(false)) && var1[2].equals(Integer.valueOf(0))) {
            qi.a(new Object[20][], true);
         }

         if(~var3 < ~((int[])((int[])var1[1]))[1]) {
            var6 += -((int[])((int[])var1[1]))[1] + var3;
         } else if(((int[])((int[])var1[1]))[10] > var3) {
            var6 += ((int[])((int[])var1[1]))[10] + -var3;
         }

         if(var0 <= ((int[])((int[])var1[1]))[4]) {
            if(~var0 > ~((int[])((int[])var1[1]))[5]) {
               var6 += ((int[])((int[])var1[1]))[5] - var0;
            }
         } else {
            var6 += -((int[])((int[])var1[1]))[4] + var0;
         }

         if(-1 != ~((int[])((int[])var1[1]))[0] && ~((int[])((int[])var1[1]))[0] <= ~(var6 - 256) && hba.a((Object[])((Object[])tu.d[33]), 0) != 0 && var2 == ((int[])((int[])var1[1]))[8]) {
            var6 -= 256;
            if(var6 < 0) {
               var6 = 0;
            }

            int var8 = -((int[])((int[])var1[1]))[14] + ((int[])((int[])var1[1]))[0];
            if(var5 == -120) {
               if(var8 < 0) {
                  var8 = ((int[])((int[])var1[1]))[0];
               }

               int var9 = var7;
               int var10 = var6 - ((int[])((int[])var1[1]))[14];
               gn.a(uta.g, (byte)32);
               if(var10 > 0 && var8 > 0) {
                  var9 = (-var10 + var8) * var7 / var8;
               }

               int var11 = 8192;
               int var12 = -var3 + (((int[])((int[])var1[1]))[10] + ((int[])((int[])var1[1]))[1]) / 2;
               int var13 = -var0 + (((int[])((int[])var1[1]))[4] + ((int[])((int[])var1[1]))[5]) / 2;
               if(0 != var12 || 0 != var13) {
                  int var14 = 16383 & -4096 + -cp.a + -((int)(Math.atan2((double)var12, (double)var13) * 2607.5945876176133D));
                  if(8192 < var14) {
                     var14 = -var14 + 16384;
                  }

                  int var15;
                  if(0 >= var6) {
                     var15 = 8192;
                  } else if(var6 < 4096) {
                     var15 = 8192 + var6 * 8192 / 4096;
                  } else {
                     var15 = 16384;
                  }

                  var11 = (-var15 + 16384 >> 1) + var14 * var15 / 8192;
               }

               on var18;
               if(var1[6] != null) {
                  ((on)var1[6]).f(var9);
                  ((on)var1[6]).g(var11);
               } else if(0 <= ((int[])((int[])var1[1]))[13]) {
                  var12 = -257 == ~((int[])((int[])var1[1]))[3] && 256 == ((int[])((int[])var1[1]))[11]?256:jt.a(2, ((int[])((int[])var1[1]))[11], ((int[])((int[])var1[1]))[3]);
                  if(!((boolean[])((boolean[])var1[8]))[2]) {
                     nka var19 = nka.a(ij.e, ((int[])((int[])var1[1]))[13], 0);
                     if(null != var19) {
                        hb var20 = var19.a().a(bd.b);
                        on var23 = on.a(var20, var12, var9 << 6, var11);
                        var23.e(-1);
                        ah.d.a((kp)var23);
                        var1[6] = var23;
                     }
                  } else {
                     if(var1[7] == null) {
                        var1[7] = pr.a(bqa.h, ((int[])((int[])var1[1]))[13]);
                     }

                     if(var1[7] != null) {
                        if(var1[10] == null) {
                           var1[10] = ((pr)var1[7]).a(new int[]{22050});
                        }

                        if(var1[10] != null) {
                           var18 = on.a((hb)var1[10], var12, var9 << 6, var11);
                           var18.e(-1);
                           ah.d.a((kp)var18);
                           var1[6] = var18;
                        }
                     }
                  }
               }

               if(var1[0] != null) {
                  ((on)var1[0]).f(var9);
                  ((on)var1[0]).g(var11);
                  if(!((lm)var1[0]).a(false)) {
                     var1[12] = null;
                     var1[4] = null;
                     var1[0] = null;
                  }
               } else if(var1[2] != null && (((int[])((int[])var1[1]))[7] -= var4) <= 0) {
                  var12 = 256 == ((int[])((int[])var1[1]))[3] && ((int[])((int[])var1[1]))[11] == 256?256:(int)(Math.random() * (double)(((int[])((int[])var1[1]))[3] + -((int[])((int[])var1[1]))[11])) + ((int[])((int[])var1[1]))[11];
                  if(((boolean[])((boolean[])var1[8]))[1]) {
                     if(var1[4] == null) {
                        var13 = (int)(Math.random() * (double)((int[])((int[])var1[2])).length);
                        var1[4] = pr.a(bqa.h, ((int[])((int[])var1[2]))[var13]);
                     }

                     if(null != var1[4]) {
                        if(null == var1[12]) {
                           var1[12] = ((pr)var1[4]).a(new int[]{22050});
                        }

                        if(null != var1[12]) {
                           var18 = on.a((hb)var1[12], var12, var9 << 6, var11);
                           var18.e(0);
                           ah.d.a((kp)var18);
                           ((int[])((int[])var1[1]))[7] = (int)((double)(-((int[])((int[])var1[1]))[9] + ((int[])((int[])var1[1]))[6]) * Math.random()) + ((int[])((int[])var1[1]))[9];
                           var1[0] = var18;
                        }
                     }
                  } else {
                     var13 = (int)((double)((int[])((int[])var1[2])).length * Math.random());
                     nka var21 = nka.a(ij.e, ((int[])((int[])var1[2]))[var13], 0);
                     if(var21 != null) {
                        hb var22 = var21.a().a(bd.b);
                        on var16 = on.a(var22, var12, var9 << 6, var11);
                        var16.e(0);
                        ah.d.a((kp)var16);
                        var1[0] = var16;
                        ((int[])((int[])var1[1]))[7] = (int)((double)(-((int[])((int[])var1[1]))[9] + ((int[])((int[])var1[1]))[6]) * Math.random()) + ((int[])((int[])var1[1]))[9];
                     }
                  }
               }

            }
         } else {
            if(null != var1[6]) {
               ah.d.b((kp)var1[6]);
               var1[6] = null;
               var1[10] = null;
               var1[7] = null;
            }

            if(null != var1[0]) {
               ah.d.b((kp)var1[0]);
               var1[0] = null;
               var1[12] = null;
               var1[4] = null;
            }

         }
      }
   }

   static final boolean a(int var0, Object[] var1) {
      ++c;
      if(var0 != 24510) {
         a(((int[])((int[])var1[9]))[5], new Object[5]);
      }

      return ((lm)var1[0]).f == var1[0];
   }

   static final void a(boolean var0, Object[] var1) {
      ++e;
      float var2 = ((float[])((float[])var1[0]))[8];
      float var3 = ((float[])((float[])var1[0]))[1];
      float var4 = ((float[])((float[])var1[0]))[0];
      ((float[])((float[])var1[0]))[0] = ((float[])((float[])var1[0]))[5];
      ((float[])((float[])var1[0]))[5] = var4;
      float var5 = ((float[])((float[])var1[0]))[6];
      ((float[])((float[])var1[0]))[6] = ((float[])((float[])var1[0]))[9];
      if(!var0) {
         a(true, (Object[])((Object[])var1[11]));
      }

      ((float[])((float[])var1[0]))[9] = var5;
      float var6 = ((float[])((float[])var1[0]))[11];
      ((float[])((float[])var1[0]))[11] = ((float[])((float[])var1[0]))[2];
      if(null != var1 && 3 == var1.length) {
         im.a((Object[])null, (int)-16365);
      }

      ((float[])((float[])var1[0]))[1] = -(((float[])((float[])var1[0]))[11] * ((float[])((float[])var1[0]))[7] + var3 * ((float[])((float[])var1[0]))[3] + ((float[])((float[])var1[0]))[5] * var2);
      ((float[])((float[])var1[0]))[8] = -(((float[])((float[])var1[0]))[0] * var3 + var2 * ((float[])((float[])var1[0]))[10] + ((float[])((float[])var1[0]))[6] * ((float[])((float[])var1[0]))[7]);
      ((float[])((float[])var1[0]))[2] = var6;
      ((float[])((float[])var1[0]))[7] = -(((float[])((float[])var1[0]))[4] * ((float[])((float[])var1[0]))[7] + var3 * ((float[])((float[])var1[0]))[2] + var2 * ((float[])((float[])var1[0]))[9]);
   }

   static final void b(Object[] var0, int var1) {
      ++f;
      if(var0[1] == null) {
         var0[1] = new int[1];
      }

      if(var1 != 4) {
         a(((boolean[])((boolean[])((Object[])((Object[])((Object[])((Object[])var0[6]))[1]))[0]))[7], (Object[])((Object[])((Object[])((Object[])var0[37]))[2]));
      }

   }

   static final void a(Object[] var0, int var1) {
      ((int[])((int[])var0[0]))[2] = 0;
      ((int[])((int[])var0[0]))[0] = 2048;
      ++f_i;
      ((int[])((int[])var0[0]))[1] = 2048;
      ((int[])((int[])var0[0]))[3] = 0;
      if(var1 > -114) {
         a(((int[])((int[])var0[3]))[0], (Object[])((Object[])var0[10]));
      }

   }

   static final void a(ta var0, int var1) {
      if(var1 >= -122) {
         j = true;
      }

      ++b;

      for(ch var2 = (ch)om.a(tsa.h, false); null != var2; var2 = (ch)pw.a(tsa.h, 77)) {
         if(var2.k) {
            var2.a(var0);
         }
      }

   }

   static final long b(int var0, Object[] var1) {
      if(var0 != -20125) {
         return ((long[])((long[])var1[3]))[8];
      } else {
         ++g;
         if(var1 != null && var1.length == 6) {
            long var2 = 0L;
            return var2;
         } else if(null != var1 && -2 == ~var1.length) {
            return kha.a(var1, false);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final float a(int var0, float var1, float var2, float var3) {
      ++a;
      if(var0 != -32) {
         j = true;
      }

      return (var3 - var1) * var2 + var1;
   }

   static final void a(Object[] var0, ta var1, int var2, int var3, int var4) {
      ++k;
      nb.b(up.c, 0);
      if(var0 != null && (var0.length == 12 && var0[8].equals(Integer.valueOf(0)) || var0.length == 10)) {
         csa.a((byte)45, -51, 29);
      }

      if(!bf.k) {
         rda var5;
         rda var6;
         for(Object[] var7 = null == (var5 = (rda)dda.a(var0, 2))?null:var5.o; var7 != null; var7 = null == (var6 = (rda)client.a(var0, -28280))?null:var6.o) {
            Object[] var8 = ita.a(((int[])((int[])var7[1]))[3], eka.e, var3 ^ -122);
            if(bca.b(2, var8)) {
               int var11 = Integer.MAX_VALUE;
               int var12 = Integer.MIN_VALUE;
               int var13 = Integer.MAX_VALUE;
               int var14 = Integer.MIN_VALUE;
               if(null != var8[3]) {
                  var12 = eka.C + (eka.B + -eka.C) * (((int[])((int[])var8[1]))[27] + ((int[])((int[])var7[1]))[0] + -eka.H) / (-eka.H + eka.a);
                  var14 = eka.g - (eka.g - eka.D) * (-eka.k + ((int[])((int[])var8[1]))[16] + ((int[])((int[])var7[1]))[4]) / (-eka.k + eka.b);
                  var11 = (-eka.H + ((int[])((int[])var8[1]))[15] + ((int[])((int[])var7[1]))[0]) * (eka.B - eka.C) / (-eka.H + eka.a) + eka.C;
                  var13 = eka.g + -((-eka.k + ((int[])((int[])var7[1]))[4] + ((int[])((int[])var8[1]))[12]) * (eka.g + -eka.D) / (eka.b - eka.k));
               }

               cga var15 = null;
               int var16 = 0;
               int var17 = 0;
               int var18 = 0;
               int var19 = 0;
               if(~((int[])((int[])var8[1]))[21] != 0) {
                  if(((boolean[])((boolean[])var7[0]))[0] && 0 != ~((int[])((int[])var8[1]))[13]) {
                     var15 = gja.a(var1, true, var3 - 12, var8);
                  } else {
                     var15 = gja.a(var1, false, 1, var8);
                  }

                  if(null != var15) {
                     var16 = ((int[])((int[])var7[1]))[2] + -(var15.f() + 1 >> 1);
                     if(var11 > var16) {
                        var11 = var16;
                     }

                     var17 = ((int[])((int[])var7[1]))[2] + (var15.f() + 1 >> 1);
                     if(var12 < var17) {
                        var12 = var17;
                     }

                     var18 = ((int[])((int[])var7[1]))[5] - (var15.d() + 1 >> 1);
                     var19 = ((int[])((int[])var7[1]))[5] + (1 + var15.d() >> 1);
                     if(var13 > var18) {
                        var13 = var18;
                     }

                     if(var19 > var14) {
                        var14 = var19;
                     }
                  }
               }

               vp var20 = null;
               int var21 = 0;
               int var22 = 0;
               int var23 = 0;
               int var24 = 0;
               int var25 = 0;
               if(null != var7 && 26 == var7.length && var7[1].equals(Integer.valueOf(0))) {
                  tw.a(6, -29, -49, true, true);
               }

               int var26 = 0;
               int var27 = 0;
               int var28 = 0;
               int var29;
               int var31;
               if(null != var8[2]) {
                  var20 = no.a(9059, ((int[])((int[])var8[1]))[19]);
                  if(var20 != null) {
                     var21 = po.a(ec.d, at.a, (int[])null, -79, (String)var8[2], (cga[])null);
                     var22 = ((int[])((int[])var8[1]))[23] * (-eka.C + eka.B) / (eka.a + -eka.H) + ((int[])((int[])var7[1]))[2];
                     if(var7 != null && (var7.length == 15 || -9 == ~var7.length)) {
                        pea.a(19);
                     }

                     var23 = ((int[])((int[])var7[1]))[5] + -((-eka.D + eka.g) * ((int[])((int[])var8[1]))[14] / (-eka.k + eka.b));
                     if(var15 == null) {
                        var23 -= var21 * var20.a() / 2;
                     } else {
                        var23 -= (var15.d() >> 1) + var20.b() * var21;
                     }

                     for(var29 = 0; var21 > var29; ++var29) {
                        String var30 = at.a[var29];
                        if(var21 - 1 > var29) {
                           var30 = var30.substring(0, -4 + var30.length());
                        }

                        var31 = var20.a(var30);
                        if(var31 > var24) {
                           var24 = var31;
                        }
                     }

                     var25 = -(var24 / 2) + var22 + var4;
                     if(var25 < var11) {
                        var11 = var25;
                     }

                     var26 = var22 - (-(var24 / 2) + -var4);
                     if(var12 < var26) {
                        var12 = var26;
                     }

                     var27 = var23 + var2;
                     var28 = var23 + var21 * var20.b() + var2;
                     if(var27 < var13) {
                        var13 = var27;
                     }

                     if(var28 > var14) {
                        var14 = var28;
                     }
                  }
               }

               boolean var9;
               if(eka.C <= var12 && var11 <= eka.B && var14 >= eka.D && eka.g >= var13) {
                  eka.a(var1, var7, var8);
                  int var40;
                  if(null != var15) {
                     if(qc.b > 0 && (~wq.d != 0 && ((int[])((int[])var7[1]))[3] == wq.d || -1 != sv.f && ((int[])((int[])var8[1]))[7] == sv.f)) {
                        if(50 >= rga.c) {
                           var29 = rga.c * 2;
                        } else {
                           var29 = 200 - 2 * rga.c;
                        }

                        var40 = 16776960 | var29 << 24;
                        var1.a(((int[])((int[])var7[1]))[5], var40, var15.e() / 2 + 7, var3 ^ 12, ((int[])((int[])var7[1]))[2]);
                        var1.a(((int[])((int[])var7[1]))[5], var40, 5 + var15.e() / 2, 1, ((int[])((int[])var7[1]))[2]);
                        var1.a(((int[])((int[])var7[1]))[5], var40, 3 + var15.e() / 2, 1, ((int[])((int[])var7[1]))[2]);
                        var1.a(((int[])((int[])var7[1]))[5], var40, 1 + var15.e() / 2, 1, ((int[])((int[])var7[1]))[2]);
                        var1.a(((int[])((int[])var7[1]))[5], var40, var15.e() / 2, 1, ((int[])((int[])var7[1]))[2]);
                     }

                     var15.a(((int[])((int[])var7[1]))[2] - (var15.f() >> 1), ((int[])((int[])var7[1]))[5] + -(var15.d() >> 1));
                  }

                  if(null != var8[2] && var20 != null) {
                     var29 = var23;
                     if(null != var7 && (-10 == ~var7.length && var7[7].equals(Integer.valueOf(0)) || var7.length == 21 && var7[6].equals(Integer.valueOf(2)))) {
                        pea.a(19);
                     }

                     var40 = -5 + var22 + -(var24 / 2);
                     var31 = 2 + var23;
                     if(0 != ((int[])((int[])var8[1]))[25]) {
                        var1.d(-var31 + var23 + var21 * var20.b() + 1, var31, 10 + var24, var40, ((int[])((int[])var8[1]))[25], 14851);
                     }

                     if(((int[])((int[])var8[1]))[10] != 0) {
                        var1.a(var31, (byte)-121, ((int[])((int[])var8[1]))[10], var24 + 10, -var31 + var23 - (-(var20.b() * var21) - 1), var40);
                     }

                     int var32 = ((int[])((int[])var8[1]))[1];
                     if(((boolean[])((boolean[])var7[0]))[0] && -1 != ((int[])((int[])var8[1]))[8]) {
                        var32 = ((int[])((int[])var8[1]))[8];
                     }

                     for(int var33 = 0; var33 < var21; ++var33) {
                        String var34 = at.a[var33];
                        if(~var33 > ~(-1 + var21)) {
                           var34 = var34.substring(0, -4 + var34.length());
                        }

                        var20.a(var1, var34, var22, var29, var32, true);
                        var29 += var20.b();
                     }
                  }

                  if(-1 != ((int[])((int[])var8[1]))[21] || null != var8[2]) {
                     Object[] var43 = new Object[3];
                     if(var43 != null && (38 == var43.length && var43[15].equals(Integer.valueOf(2)) && var43[15].equals(Integer.valueOf(2)) || -7 == ~var43.length)) {
                        tw.a(-107, -106, -92, true, false);
                     }

                     nk.a(14945, var43);
                     ((int[])((int[])var43[1]))[0] = Integer.MAX_VALUE;
                     ((int[])((int[])var43[1]))[1] = Integer.MAX_VALUE;
                     ((int[])((int[])var43[1]))[5] = Integer.MAX_VALUE;
                     ((int[])((int[])var43[1]))[2] = Integer.MIN_VALUE;
                     ((int[])((int[])var43[1]))[6] = Integer.MAX_VALUE;
                     ((int[])((int[])var43[1]))[3] = Integer.MIN_VALUE;
                     ((int[])((int[])var43[1]))[7] = Integer.MIN_VALUE;
                     ((int[])((int[])var43[1]))[4] = Integer.MIN_VALUE;
                     var43[2] = kqa.a(-127, var43);
                     var43[0] = var7;
                     ((int[])((int[])var43[1]))[5] = var16;
                     ((int[])((int[])var43[1]))[2] = var28;
                     ((int[])((int[])var43[1]))[3] = var17;
                     ((int[])((int[])var43[1]))[6] = var25;
                     ((int[])((int[])var43[1]))[7] = var26;
                     ((int[])((int[])var43[1]))[0] = var18;
                     ((int[])((int[])var43[1]))[1] = var27;
                     ((int[])((int[])var43[1]))[4] = var19;
                     Object[] var10;
                     client.a(110, up.c, (lm)((var10 = var43) != null?var10[2]:null));
                  }

                  var9 = false;
               } else {
                  var9 = true;
               }

               if(var9) {
                  cga var35 = jm.a(var8, -82, var1);
                  if(var35 != null) {
                     var13 = var35.e();
                     if(var35.g() > var13) {
                        var13 = var35.g();
                     }

                     byte var36 = 10;
                     int var37 = ((int[])((int[])var7[1]))[2];
                     var16 = ((int[])((int[])var7[1]))[5];
                     var17 = 0;
                     var18 = 0;
                     var19 = 0;
                     int var39;
                     if(null != var8[2]) {
                        var17 = po.a(ec.d, at.a, (int[])null, -89, (String)var8[2], (cga[])null);

                        for(var39 = 0; var17 > var39; ++var39) {
                           String var38 = at.a[var39];
                           if(var39 < var17 - 1) {
                              var38 = var38.substring(0, var38.length() - 4);
                           }

                           var22 = ek.c.a(var38);
                           if(var18 < var22) {
                              var18 = var22;
                           }
                        }

                        var19 = ek.c.b() * var17 + ek.c.a() / 2;
                        if(var7 != null && (9 == var7.length || 21 == var7.length && var7[1].equals(Integer.valueOf(1)))) {
                           wh.a(92, -106, true, -127, ((int[])((int[])bja.a[1]))[4]);
                        }
                     }

                     var39 = ((int[])((int[])var7[1]))[2] + var13 / 2;
                     if(var13 + eka.C > var37) {
                        var37 = eka.C;
                        var39 = 5 + eka.C - (-(var13 / 2) - var36) + var18 / 2;
                     } else if(~var37 < ~(-var13 + eka.B)) {
                        var37 = -var13 + eka.B;
                        var39 = -(var18 / 2) + -var36 + eka.B - (var13 / 2 + 5);
                     }

                     var21 = ((int[])((int[])var7[1]))[5];
                     if(eka.D + var13 <= var16) {
                        if(var16 > -var13 + eka.g) {
                           var21 = -var19 + -var36 + (eka.g - var13 / 2);
                           var16 = eka.g + -var13;
                        }
                     } else {
                        var21 = var13 / 2 + eka.D + var36;
                        var16 = eka.D;
                     }

                     var22 = '\uffff' & (int)(Math.atan2((double)(var37 + -((int[])((int[])var7[1]))[2]), (double)(var16 - ((int[])((int[])var7[1]))[5])) / 3.141592653589793D * 32767.0D);
                     var35.a((float)var37 + (float)var13 / 2.0F, (float)var13 / 2.0F + (float)var16, 4096, var22);
                     var23 = -2;
                     var24 = -2;
                     if(null != var8 && (13 == var8.length && var8[0].equals(Integer.valueOf(1)) || 1 == var8.length)) {
                        pea.a(19);
                     }

                     var25 = -2;
                     var26 = -2;
                     if(var8[2] != null) {
                        var23 = -5 + var39 - var18 / 2;
                        var24 = var21;
                        var25 = 10 + var18 + var23;
                        var26 = 3 + var21 + ek.c.b() * var17;
                        if(var8 != null && 12 == var8.length) {
                           dp.q = ((int[])((int[])soa.f[10]))[4];
                        }

                        if(0 != ((int[])((int[])var8[1]))[25]) {
                           var1.d(var26 - var21, var21, -var23 + var25, var23, ((int[])((int[])var8[1]))[25], 14851);
                        }

                        if(0 != ((int[])((int[])var8[1]))[10]) {
                           var1.a(var21, (byte)-121, ((int[])((int[])var8[1]))[10], -var23 + var25, var26 + -var21, var23);
                        }

                        for(var27 = 0; var27 < var17; ++var27) {
                           String var41 = at.a[var27];
                           if(var17 - 1 > var27) {
                              var41 = var41.substring(0, -4 + var41.length());
                           }

                           ek.c.a(var1, var41, var39, var21, ((int[])((int[])var8[1]))[1], true);
                           var21 += ek.c.b();
                        }
                     }

                     if(~((int[])((int[])var8[1]))[21] != 0 || null != var8[2]) {
                        if(var8 != null && -3 == ~var8.length) {
                           no.a(9059, 59);
                        }

                        Object[] var42 = new Object[3];
                        nk.a(var3 + 14932, var42);
                        ((int[])((int[])var42[1]))[3] = Integer.MIN_VALUE;
                        ((int[])((int[])var42[1]))[5] = Integer.MAX_VALUE;
                        ((int[])((int[])var42[1]))[4] = Integer.MIN_VALUE;
                        ((int[])((int[])var42[1]))[7] = Integer.MIN_VALUE;
                        ((int[])((int[])var42[1]))[0] = Integer.MAX_VALUE;
                        ((int[])((int[])var42[1]))[6] = Integer.MAX_VALUE;
                        ((int[])((int[])var42[1]))[2] = Integer.MIN_VALUE;
                        ((int[])((int[])var42[1]))[1] = Integer.MAX_VALUE;
                        var42[2] = kqa.a(var3 ^ -125, var42);
                        var42[0] = var7;
                        var13 >>= 1;
                        ((int[])((int[])var42[1]))[3] = var37 + var13;
                        ((int[])((int[])var42[1]))[4] = var16 + var13;
                        ((int[])((int[])var42[1]))[6] = var23;
                        ((int[])((int[])var42[1]))[1] = var24;
                        ((int[])((int[])var42[1]))[2] = var26;
                        ((int[])((int[])var42[1]))[7] = var25;
                        ((int[])((int[])var42[1]))[5] = var37 - var13;
                        ((int[])((int[])var42[1]))[0] = var16 + -var13;
                        client.a(var3 ^ 123, up.c, (lm)(null != var42?var42[2]:null));
                     }
                  }
               }
            }
         }

         if(var3 != 13) {
            a((Object[])null, (ta)null, ((int[])((int[])var0[1]))[4], ((int[])((int[])var0[1]))[6], -120);
         }

      }
   }

   static {
      je.a(4, new Object[1], 3, (byte)-121);
   }
}
