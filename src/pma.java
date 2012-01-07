import jaclib.memory.Buffer;

final class pma {

   static int f;
   static int b;
   static int c;
   static int j;
   static int d;
   static int f_i;
   static int f_l;
   static int a;
   static int k;
   static Object[] h = ed.a(4, new Object[1], (byte)-111, 37);
   static int g;
   static Object[] e = ed.a(0, new Object[1], (byte)-128, 125);


   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(rb.d != null) {
         rb.d[var0][var1] = -16777216 | var2;
      }

      if(esa.g != null) {
         esa.g[var0][var1] = (short)var3;
      }

      if(wk.e != null) {
         wk.e[var0][var1] = (byte)var4;
      }

      if(jaa.f_i != null) {
         jaa.f_i[var0][var1] = (byte)var5;
      }

      if(mf.e != null) {
         mf.e[var0][var1] = (byte)var6;
      }

      if(mca.d != null) {
         mca.d[var0][var1] = (byte)var7;
      }

   }

   static final void a(int var0, int var1, int var2, Object[] var3) {
      ++k;
      if(var1 != 7478) {
         a(((int[])((int[])var3[5]))[15], 75, -83, false, (Object[])((Object[])h[22]), (Buffer)((Object[])((Object[])e[14]))[1]);
      }

      int var4 = ((int[])((int[])var3[0]))[3] * var0 >> 12;
      int var5 = ((int[])((int[])var3[0]))[6] * var0 >> 12;
      int var6 = ((int[])((int[])var3[0]))[5] * var2 >> 12;
      int var7 = var2 * ((int[])((int[])var3[0]))[4] >> 12;
      ag.a(false, var7, var5, ((int[])((int[])var3[0]))[2], var4, var6);
   }

   static final Object[] a(int var0, int var1, int var2, boolean var3, Object[] var4, Buffer var5) {
      ++f;
      int var6 = -71 / ((var1 - 45) / 44);
      return ((boolean[])((boolean[])var4[17]))[15] && (!var3 || ((boolean[])((boolean[])var4[17]))[21])?ks.a(var4, var0, var5, new Object[5], var3, var2, (byte)33):upa.a(var4, 8, var2, var5, new Object[2]);
   }

   static final tha a(Object[] var0, boolean var1) {
      ++f_l;
      if(var1) {
         return (tha)null;
      } else {
         tha var2 = (tha)var0[0];
         if(var2 == ((Object[])((Object[])var0[1]))[0]) {
            var0[0] = null;
            return null;
         } else {
            var0[0] = var2.s;
            return var2;
         }
      }
   }

   static final void a(qa var0, ta var1, byte var2) {
      ++d;
      if(null != eka.M) {
         if(dp.q < 10) {
            if(!Class_b.a((String)eka.M[0], (byte)-115, eka.A)) {
               dp.q = eca.a(be.c, (String)eka.M[0], 0) / 10;
               return;
            }

            rk.a(false);
            dp.q = 10;
         }

         if(10 == dp.q) {
            eka.u = ((int[])((int[])eka.M[1]))[5] >> 6 << 6;
            eka.n = ((int[])((int[])eka.M[1]))[3] >> 6 << 6;
            eka.f = -eka.n + (((int[])((int[])eka.M[1]))[4] >> 6 << 6) + 64;
            eka.K = 64 + -eka.u + (((int[])((int[])eka.M[1]))[0] >> 6 << 6);
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            Object[] var6 = (Object[])((Object[])woa.a(5, uta.g)[1]);
            if(wfa.a(((byte[])((byte[])uta.g[10]))[0], ((int)((float[])((float[])var6[1]))[2] >> 9) + rs.f, var2 ^ -20, ((int)((float[])((float[])var6[1]))[1] >> 9) + qm.d, var3, eka.M)) {
               var5 = -eka.u + var3[2];
               var4 = var3[1] - eka.n;
            }

            if(!lga.f_i && var4 >= 0 && eka.f > var4 && 0 <= var5 && var5 < eka.K) {
               var4 += (int)(Math.random() * 10.0D) - 5;
               var5 += (int)(Math.random() * 10.0D) - 5;
               ln.b = var4;
               jw.c = var5;
            } else if(-1 != gja.b && -1 != una.a) {
               cq.a(gja.b, var3, true, una.a, eka.M);
               una.a = -1;
               lga.f_i = false;
               gja.b = -1;
               if(var3 != null) {
                  ln.b = var3[1] - eka.n;
                  jw.c = var3[2] - eka.u;
               }
            } else {
               cq.a((((int[])((int[])eka.M[1]))[6] & 268431881) >> 14, var3, true, 16383 & ((int[])((int[])eka.M[1]))[6], eka.M);
               jw.c = -eka.u + var3[2];
               ln.b = -eka.n + var3[1];
            }

            if(37 != ((int[])((int[])eka.M[1]))[7]) {
               if(((int[])((int[])eka.M[1]))[7] != 50) {
                  if(-76 == ~((int[])((int[])eka.M[1]))[7]) {
                     eka.h = 6.0F;
                     eka.L = 6.0F;
                  } else if(-101 != ~((int[])((int[])eka.M[1]))[7]) {
                     if(((int[])((int[])eka.M[1]))[7] == 200) {
                        eka.h = 16.0F;
                        eka.L = 16.0F;
                     } else {
                        eka.L = 8.0F;
                        eka.h = 8.0F;
                     }
                  } else {
                     eka.L = 8.0F;
                     eka.h = 8.0F;
                  }
               } else {
                  eka.L = 4.0F;
                  eka.h = 4.0F;
               }
            } else {
               eka.h = 3.0F;
               eka.L = 3.0F;
            }

            eka.J = (int)eka.h >> 1;
            eka.v = jt.a(19531, eka.J);
            sia.a((byte)-68);
            eka.a();
            up.c = ura.a(-30, new Object[2]);
            eka.y += (int)(Math.random() * 5.0D) - 2;
            if(eka.y < -8) {
               eka.y = -8;
            }

            if(var6 != null && (var6.length == 7 || 1 == var6.length)) {
               up.c[3] = null;
            }

            if(eka.y > 8) {
               eka.y = 8;
            }

            eka.z += (int)(5.0D * Math.random()) - 2;
            if(-16 > eka.z) {
               eka.z = -16;
            }

            if(eka.z > 16) {
               eka.z = 16;
            }

            eka.a(var0, eka.y >> 2 << 10, eka.z >> 1);
            qia.a((byte)-117, 1024, 256, eka.e);
            Object[] var7 = eka.x;
            var7[2] = sj.a(256, new Object[3], (byte)-53);
            var7[0] = sj.a(256, new Object[3], (byte)-52);
            Object[] var8 = eka.w;
            var8[4] = sj.a(4096, new Object[3], (byte)-128);
            jk.a(256, 12, fv.d);
            dp.q = 20;
         } else if(dp.q != 20) {
            if(dp.q == 60) {
               if(!nma.a(eka.A, (String)eka.M[0] + "_staticelements", -25057)) {
                  eka.j = vd.a(0, false, new Object[3]);
               } else {
                  if(!Class_b.a((String)eka.M[0] + "_staticelements", (byte)-45, eka.A)) {
                     return;
                  }

                  eka.j = hba.a(wba.c, (String)eka.M[0] + "_staticelements", (byte)105, eka.A);
               }

               eka.c();
               dp.q = 70;
               lra.a(true, (byte)-70);
               ka.a((byte)-107);
            } else if(dp.q == 70) {
               fba.d = new vp(var1, 11, true, ru.d);
               dp.q = 73;
               lra.a(true, (byte)-70);
               ka.a((byte)104);
            } else if(73 == dp.q) {
               tl.a = new vp(var1, 12, true, ru.d);
               dp.q = 76;
               lra.a(true, (byte)-70);
               ka.a((byte)75);
            } else if(76 != dp.q) {
               if(79 != dp.q) {
                  if(82 != dp.q) {
                     if(dp.q == 85) {
                        cta.p = new vp(var1, 22, true, ru.d);
                        dp.q = 88;
                        lra.a(true, (byte)-70);
                        ka.a((byte)101);
                     } else if(dp.q != 88) {
                        cba.b = new vp(var1, 30, true, ru.d);
                        dp.q = 100;
                        lra.a(true, (byte)-70);
                        ka.a((byte)-114);
                        if(var2 == -72) {
                           System.gc();
                        }
                     } else {
                        eba.f_l = new vp(var1, 26, true, ru.d);
                        dp.q = 91;
                        lra.a(true, (byte)-70);
                        ka.a((byte)-124);
                     }
                  } else {
                     js.b = new vp(var1, 19, true, ru.d);
                     dp.q = 85;
                     lra.a(true, (byte)-70);
                     ka.a((byte)11);
                  }
               } else {
                  nga.f_i = new vp(var1, 17, true, ru.d);
                  dp.q = 82;
                  lra.a(true, (byte)-70);
                  ka.a((byte)-128);
               }
            } else {
               ek.c = new vp(var1, 14, true, ru.d);
               dp.q = 79;
               lra.a(true, (byte)-70);
               ka.a((byte)-117);
            }
         } else {
            lra.a(true, (byte)-70);
            eka.a(var1, eka.y, eka.z);
            dp.q = 60;
            lra.a(true, (byte)-70);
            ka.a((byte)-116);
         }
      }
   }

   static final void a(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      var8 = (int)((float)var8 + 1.0F);
      ++g;
      var2 = (int)((float)var2 + 1.0F);
      var7 = (int)((float)var7 + 1.0F);
      var1 = (int)((float)var1 + 1.0F);
      float var10 = (float)(-var1 + var2);
      float var11 = (float)(-var8 + var7);
      float var12 = 1.0F / (float)Math.sqrt((double)(var10 * var10 + var11 * var11));
      var10 *= var12;
      var11 *= var12;
      var8 = (int)((float)var8 - var11);
      var1 = (int)((float)var1 - var10);
      int var14 = -116 / ((-3 - var6) / 46);
      float var13 = -var11;
      if(null != var0 && (9 == var0.length && var0[2].equals(Integer.valueOf(0)) || var0.length == 2 && var0[1].equals(Boolean.valueOf(false)))) {
         ov.a(-128, (byte)-121, new Object[2][], 40);
      }

      var13 *= 0.5F * (float)var4;
      float var15 = var10 * (float)var4 * 0.5F;
      Object[] var9;
      ((cga)(null != (var9 = (Object[])((Object[])var0[65]))?var9[2]:null)).a(-var13 + (float)var1, (float)var8 - var15, -var13 + (float)var2, (float)var7 - var15, var13 + (float)var1, var15 + (float)var8, 0, var5, var3);
   }

   static final void a(byte var0, int var1, Object[] var2, int var3, int var4, int var5, int var6) {
      ++b;
      if(var0 < -92) {
         gl.a(var5, var5, var1, var2, (byte)74, var4, var4 + var3, var6);
      }
   }

   static final Object[] a(Object[] var0, int var1) {
      ++f_i;
      Object[] var2 = qv.a((byte)-12, var0);
      int var3 = lr.a(1, var0);
      if(var1 != -15156) {
         return (Object[])null;
      } else {
         int var4 = lr.a(1, var0);
         Object[] var6 = new Object[4];
         Object[] var7 = (Object[])((Object[])var2[2]);
         Object[] var8 = (Object[])((Object[])var2[0]);
         int var9 = ((int[])((int[])var2[1]))[2];
         int var10 = ((int[])((int[])var2[1]))[3];
         int var11 = ((int[])((int[])var2[1]))[1];
         int var12 = ((int[])((int[])var2[1]))[0];
         int var13 = ((int[])((int[])var2[1]))[6];
         int var14 = ((int[])((int[])var2[1]))[5];
         int var15 = ((int[])((int[])var2[1]))[4];
         sca.a(var6, (byte)-117);
         lka.a(var10, var13, var15, var11, var12, var7, var14, 13965, var8, var9, var6);
         ((int[])((int[])var6[1]))[8] = var4;
         ((int[])((int[])var6[1]))[7] = var3;
         return var6;
      }
   }

   static final void a(int var0, Object[] var1) {
      if(var0 == 73) {
         ++j;
         if(0 > ((int[])((int[])var1[1]))[0] || 4 < ((int[])((int[])var1[1]))[0]) {
            ((int[])((int[])var1[1]))[0] = mo.a(var1, 3);
         }

      }
   }

   static final void a(int var0) {
      ++a;
      if(var0 == 1) {
         if(ad.c == null || null == usa.c) {
            ad.c = new int[256];
            usa.c = new int[256];

            for(int var1 = 0; 256 > var1; ++var1) {
               double var2 = 6.283185307179586D * ((double)var1 / 255.0D);
               ad.c[var1] = (int)(Math.sin(var2) * 4096.0D);
               usa.c[var1] = (int)(4096.0D * Math.cos(var2));
            }
         }

      }
   }

   static final void a(int var0, int var1, int var2, Object[] var3, int var4, byte var5) {
      ++c;
      if(var5 >= 87) {
         for(int var6 = 0; ~var6 > ~((int[])((int[])var3[1]))[1]; ++var6) {
            bd.a(var0, var2, var6, var3, var4, -1, var1);
         }

         if(null != var3 && (-8 == ~var3.length && var3[2].equals(Integer.valueOf(0)) || var3.length == 6 && var3[2].equals(Boolean.valueOf(false)))) {
            uk.d = true;
         }

      }
   }

}
