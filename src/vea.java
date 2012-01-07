import jaggl.OpenGL;

final class vea {

   static int d;
   static int h;
   static float[] g = new float[3];
   static int b;
   static int f;
   static int e;
   static String f_i = null;
   static int c;
   static int a;


   static final void a(int var0, long[] var1, int var2, int[] var3, int var4) {
      if(var0 < var4) {
         int var5 = (var4 + var0) / 2;
         int var6 = var0;
         long var7 = var1[var5];
         var1[var5] = var1[var4];
         var1[var4] = var7;
         int var9 = var3[var5];
         var3[var5] = var3[var4];
         var3[var4] = var9;
         int var10 = Long.MIN_VALUE != ~var7?1:0;

         for(int var11 = var0; var11 < var4; ++var11) {
            if(~(var7 - -((long)(var10 & var11))) < ~var1[var11]) {
               long var12 = var1[var11];
               var1[var11] = var1[var6];
               var1[var6] = var12;
               int var14 = var3[var11];
               var3[var11] = var3[var6];
               var3[var6++] = var14;
            }
         }

         var1[var4] = var1[var6];
         var1[var6] = var7;
         var3[var4] = var3[var6];
         var3[var6] = var9;
         a(var0, var1, -9634, var3, -1 + var6);
         a(var6 + 1, var1, -9634, var3, var4);
      }

      if(var2 != -9634) {
         f_i = (String)null;
      }

      ++f;
   }

   static final int a(boolean var0, Object[] var1) {
      ++h;
      if(var1 != null && var1.length == 4) {
         return vfa.a(var1, (byte)15);
      } else if(var1 != null && var1.length == 15) {
         return eca.a(-26, var1);
      } else if(var0) {
         return -73;
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(int var0) {
      ++a;
      Object[] var1 = (Object[])((Object[])lba.f[4]);
      int var2 = fh.a(var1, false);
      rq.c = fh.a(var1, false);
      boolean var3 = (var2 & 1) != 0;
      int var4 = jta.b(var1, (byte)-45);
      int var5 = fh.a(var1, false);
      int var6 = lga.a(var1, 101);
      cfa.a(0);
      oc.a(-7850, var5);
      aqa.b(var1, -22852);

      int var7;
      int var8;
      int var9;
      int var10;
      for(var7 = 0; 4 > var7; ++var7) {
         if(null != var1 && var1.length == 22 && var1[2].equals(Integer.valueOf(2))) {
            sga.f = null;
         }

         for(var8 = 0; rp.c >> 3 > var8; ++var8) {
            if(null != var1 && var1.length == 2 && var1[0].equals(Integer.valueOf(1)) && var1[0].equals(Integer.valueOf(0))) {
               vr.a((Object[])null, (int)24);
            }

            for(var9 = 0; ~var9 > ~(wpa.a >> 3); ++var9) {
               var10 = tg.a(var1, 8553, 1);
               if(var10 != 1) {
                  va.m[var7][var8][var9] = -1;
               } else {
                  va.m[var7][var8][var9] = tg.a(var1, 8553, 26);
               }
            }
         }
      }

      ki.a(1, var1);
      var7 = (-((int[])((int[])var1[1]))[0] + ((int[])((int[])lba.f[1]))[2]) / 16;
      gn.p = new int[var7][4];

      for(var8 = 0; var8 < var7; ++var8) {
         if(null != var1 && 14 == var1.length && var1[0].equals(Integer.valueOf(1)) && var1[0].equals(Integer.valueOf(0))) {
            cc.a(true, (Object[])null, (byte[][])((byte[][])tu.d[0]));
         }

         for(var9 = 0; var9 < 4; ++var9) {
            gn.p[var8][var9] = lr.a(1, var1);
         }
      }

      Class_f.d = new int[var7];
      cf.h = new byte[var7][];
      pv.b = new int[var7];
      du.d = new int[var7];
      epa.d = new int[var7];
      sia.b = null;
      mja.j = (byte[][])null;
      vla.h = new int[var7];
      ft.b = new byte[var7][];
      if(var1 != null && (-3 == ~var1.length && var1[0].equals(Boolean.valueOf(false)) || -4 == ~var1.length)) {
         tea.b = 120;
      }

      tqa.b = new byte[var7][];
      wu.n = new byte[var7][];
      var7 = 0;
      if(var0 > -84) {
         a(35);
      }

      for(var8 = 0; var8 < 4; ++var8) {
         for(var9 = 0; ~var9 > ~(rp.c >> 3); ++var9) {
            for(var10 = 0; wpa.a >> 3 > var10; ++var10) {
               int var11 = va.m[var8][var9][var10];
               if(var11 != -1) {
                  int var12 = 1023 & var11 >> 14;
                  int var13 = (var11 & 16381) >> 3;
                  int var14 = var13 / 8 + (var12 / 8 << 8);

                  int var15;
                  for(var15 = 0; var7 > var15; ++var15) {
                     if(Class_f.d[var15] == var14) {
                        var14 = -1;
                        break;
                     }
                  }

                  if(null != var1 && var1.length == 1 && var1[0].equals(Integer.valueOf(1))) {
                     ka.n = ((int[])((int[])hf.g[14]))[2];
                  }

                  if(-1 != var14) {
                     Class_f.d[var7] = var14;
                     var15 = ('\uff37' & var14) >> 8;
                     int var16 = 255 & var14;
                     du.d[var7] = dla.a(oe.f, 63, bg.a(true, var15, false, var16, (byte)123));
                     epa.d[var7] = dla.a(oe.f, 110, bg.a(false, var15, false, var16, (byte)-100));
                     pv.b[var7] = dla.a(oe.f, 106, bg.a(true, var15, true, var16, (byte)-32));
                     vla.h[var7] = dla.a(oe.f, 80, bg.a(false, var15, true, var16, (byte)-89));
                     ++var7;
                  }
               }
            }

            if(null != var1 && -4 == ~var1.length) {
               ((int[])((int[])de.g[1]))[0] = -62;
            }
         }
      }

      mia.a(false, 13, var6, var3, var4);
   }

   static final void a(float[] var0, Object[] var1, byte var2) {
      ++b;
      float[] var3 = new float[16];
      System.arraycopy(var0, 0, var3, 0, 16);
      var3[13] = -var3[13];
      var3[5] = -var3[5];
      var3[9] = -var3[9];
      if(var2 != -103) {
         a((Object[])((Object[])var1[0]), ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var1[17]))[1]))[2]))[2], 86, ((byte[])((byte[])var1[16]))[0]);
      }

      var3[1] = -var3[1];
      OpenGL.glMatrixMode(5889);
      OpenGL.glLoadMatrixf(var3, 0);
      OpenGL.glMatrixMode(5888);
   }

   static final int[] a(Object[] var0, int var1, int var2, byte var3) {
      ++c;
      if(var3 != -8) {
         f_i = (String)null;
      }

      return !((boolean[])((boolean[])((Object[][])((Object[][])var0[2]))[var1][3]))[0]?ts.a(((Object[][])((Object[][])var0[2]))[var1], -1149, var2)[0]:te.a(((Object[][])((Object[][])var0[2]))[var1], var3 ^ -4, var2);
   }

   static final void a(int var0, ta var1, Object[] var2, long var3, boolean var5, boolean var6) {
      int var7;
      if(((boolean[])((boolean[])var2[3]))[1]) {
         var5 = false;
      } else if(~dq.h <= ~((int[])((int[])((Object[])((Object[])var2[6]))[1]))[26]) {
         if(iha.g[dq.h] >= da.b) {
            if(((boolean[])((boolean[])var2[3]))[0]) {
               var5 = false;
            } else if(0 != ~((int[])((int[])((Object[])((Object[])var2[6]))[1]))[2]) {
               var7 = (int)(-((long[])((long[])var2[9]))[0] + var3);
               if(!((boolean[])((boolean[])((Object[])((Object[])var2[6]))[0]))[4] && ((int[])((int[])((Object[])((Object[])var2[6]))[1]))[2] < var7) {
                  var5 = false;
               } else {
                  var7 %= ((int[])((int[])((Object[])((Object[])var2[6]))[1]))[2];
               }

               if(!((boolean[])((boolean[])((Object[])((Object[])var2[6]))[0]))[8] && ~var7 > ~((int[])((int[])((Object[])((Object[])var2[6]))[1]))[43]) {
                  var5 = false;
               }

               if(((boolean[])((boolean[])((Object[])((Object[])var2[6]))[0]))[8] && ((int[])((int[])((Object[])((Object[])var2[6]))[1]))[43] <= var7) {
                  var5 = false;
               }
            }
         } else {
            var5 = false;
         }
      } else {
         var5 = false;
      }

      ++e;
      if(var5) {
         var7 = (((int[])((int[])((Object[])((Object[])var2[0]))[0]))[9] + ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[11] + ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[10]) / 3;
         int var8 = (((int[])((int[])((Object[])((Object[])var2[0]))[0]))[8] - (-((int[])((int[])((Object[])((Object[])var2[0]))[0]))[3] + -((int[])((int[])((Object[])((Object[])var2[0]))[0]))[6])) / 3;
         int var9 = (((int[])((int[])((Object[])((Object[])var2[0]))[0]))[5] + ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[2] + ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[7]) / 3;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var17;
         int var16;
         int var18;
         if(((int[])((int[])((Object[])((Object[])var2[0]))[0]))[4] != var7 || ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[1] != var8 || var9 != ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[0]) {
            ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[1] = var8;
            ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[4] = var7;
            ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[0] = var9;
            var10 = ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[10] + -((int[])((int[])((Object[])((Object[])var2[0]))[0]))[11];
            var11 = ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[3] + -((int[])((int[])((Object[])((Object[])var2[0]))[0]))[8];
            var12 = -((int[])((int[])((Object[])((Object[])var2[0]))[0]))[5] + ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[2];
            var13 = -((int[])((int[])((Object[])((Object[])var2[0]))[0]))[11] + ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[9];
            var14 = ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[6] - ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[8];
            var15 = -((int[])((int[])((Object[])((Object[])var2[0]))[0]))[5] + ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[7];
            if(null != var2 && -3 == ~var2.length && var2[0].equals(Integer.valueOf(1))) {
               qf.a(new Object[5][], (Object[])null, -128L, (ta)null, (ch)null, 9);
            }

            ((int[])((int[])var2[1]))[7] = var14 * var10 - var11 * var13;
            ((int[])((int[])var2[1]))[8] = -(var14 * var12) + var11 * var15;

            for(((int[])((int[])var2[1]))[4] = -(var15 * var10) + var12 * var13; -32768 > ~((int[])((int[])var2[1]))[8] || ((int[])((int[])var2[1]))[4] > 32767 || ((int[])((int[])var2[1]))[7] > 32767 || ((int[])((int[])var2[1]))[8] < -32767 || ((int[])((int[])var2[1]))[4] < -32767 || ((int[])((int[])var2[1]))[7] < -32767; ((int[])((int[])var2[1]))[4] >>= 1) {
               ((int[])((int[])var2[1]))[8] >>= 1;
               ((int[])((int[])var2[1]))[7] >>= 1;
            }

            var16 = (int)Math.sqrt((double)(((int[])((int[])var2[1]))[8] * ((int[])((int[])var2[1]))[8] + ((int[])((int[])var2[1]))[4] * ((int[])((int[])var2[1]))[4] + ((int[])((int[])var2[1]))[7] * ((int[])((int[])var2[1]))[7]));
            if(var16 <= 0) {
               var16 = 1;
            }

            ((int[])((int[])var2[1]))[8] = ((int[])((int[])var2[1]))[8] * 32767 / var16;
            ((int[])((int[])var2[1]))[7] = ((int[])((int[])var2[1]))[7] * 32767 / var16;
            ((int[])((int[])var2[1]))[4] = ((int[])((int[])var2[1]))[4] * 32767 / var16;
            if(((short[])((short[])((Object[])((Object[])var2[6]))[4]))[0] > 0 || ((short[])((short[])((Object[])((Object[])var2[6]))[4]))[2] > 0) {
               var17 = (int)(Math.atan2((double)((int[])((int[])var2[1]))[7], (double)((int[])((int[])var2[1]))[8]) * 2607.5945876176133D);
               var18 = (int)(Math.atan2((double)((int[])((int[])var2[1]))[4], Math.sqrt((double)(((int[])((int[])var2[1]))[8] * ((int[])((int[])var2[1]))[8] + ((int[])((int[])var2[1]))[7] * ((int[])((int[])var2[1]))[7]))) * 2607.5945876176133D);
               ((int[])((int[])var2[1]))[2] = ((short[])((short[])((Object[])((Object[])var2[6]))[4]))[0] - ((short[])((short[])((Object[])((Object[])var2[6]))[4]))[3];
               ((int[])((int[])var2[1]))[3] = -((short[])((short[])((Object[])((Object[])var2[6]))[4]))[1] + ((short[])((short[])((Object[])((Object[])var2[6]))[4]))[2];
               ((int[])((int[])var2[1]))[5] = -(((int[])((int[])var2[1]))[2] >> 1) + var17 + ((short[])((short[])((Object[])((Object[])var2[6]))[4]))[3];
               ((int[])((int[])var2[1]))[1] = ((short[])((short[])((Object[])((Object[])var2[6]))[4]))[1] + (var18 - (((int[])((int[])var2[1]))[3] >> 1));
            }
         }

         ((int[])((int[])var2[1]))[0] += (int)((double)var0 * ((double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[45] + Math.random() * (double)(-((int[])((int[])((Object[])((Object[])var2[6]))[1]))[45] + ((int[])((int[])((Object[])((Object[])var2[6]))[1]))[39])));
         if(((int[])((int[])var2[1]))[0] > 63) {
            var10 = ((int[])((int[])var2[1]))[0] >> 6;
            ((int[])((int[])var2[1]))[0] &= 63;
            if(null != var2 && 3 == var2.length) {
               return;
            }

            for(var14 = 0; var14 < var10; ++var14) {
               int var19;
               int var20;
               if(((short[])((short[])((Object[])((Object[])var2[6]))[4]))[0] <= 0 && ((short[])((short[])((Object[])((Object[])var2[6]))[4]))[2] <= 0) {
                  var11 = ((int[])((int[])var2[1]))[8];
                  var12 = ((int[])((int[])var2[1]))[4];
                  var13 = ((int[])((int[])var2[1]))[7];
               } else {
                  var15 = (int)(Math.random() * (double)((int[])((int[])var2[1]))[2]) + ((int[])((int[])var2[1]))[5];
                  var15 &= 16383;
                  var16 = tda.p[var15];
                  var17 = tda.k[var15];
                  var18 = ((int[])((int[])var2[1]))[1] + (int)(Math.random() * (double)((int[])((int[])var2[1]))[3]);
                  var18 &= 8191;
                  var19 = tda.p[var18];
                  var20 = tda.k[var18];
                  byte var21 = 13;
                  var11 = var17 * var19 >> var21;
                  var12 = (var20 << 1) * -1;
                  if(var2 != null && (-4 == ~var2.length || 23 == var2.length || var2.length == 2)) {
                     a(26, (ta)null, (Object[])null, 51L, false, false);
                  }

                  var13 = var16 * var19 >> var21;
               }

               float var41 = (float)Math.random();
               float var43 = (float)Math.random();
               if(var41 + var43 > 1.0F) {
                  var41 = -var41 + 1.0F;
                  var43 = 1.0F - var43;
               }

               float var42 = -var43 - var41 + 1.0F;
               var18 = (int)(var41 * (float)((int[])((int[])((Object[])((Object[])var2[0]))[0]))[11] + var43 * (float)((int[])((int[])((Object[])((Object[])var2[0]))[0]))[10] + var42 * (float)((int[])((int[])((Object[])((Object[])var2[0]))[0]))[9]);
               var19 = (int)(var43 * (float)((int[])((int[])((Object[])((Object[])var2[0]))[0]))[3] + var41 * (float)((int[])((int[])((Object[])((Object[])var2[0]))[0]))[8] + var42 * (float)((int[])((int[])((Object[])((Object[])var2[0]))[0]))[6]);
               var20 = (int)((float)((int[])((int[])((Object[])((Object[])var2[0]))[0]))[2] * var43 + (float)((int[])((int[])((Object[])((Object[])var2[0]))[0]))[5] * var41 + var42 * (float)((int[])((int[])((Object[])((Object[])var2[0]))[0]))[7]);
               int var44 = (int)(var42 * (float)((int[])((int[])((Object[])((Object[])var2[7]))[0]))[9] + (float)((int[])((int[])((Object[])((Object[])var2[7]))[0]))[11] * var41 + var43 * (float)((int[])((int[])((Object[])((Object[])var2[7]))[0]))[10]);
               int var22 = (int)(var42 * (float)((int[])((int[])((Object[])((Object[])var2[7]))[0]))[6] + (float)((int[])((int[])((Object[])((Object[])var2[7]))[0]))[8] * var41 + var43 * (float)((int[])((int[])((Object[])((Object[])var2[7]))[0]))[3]);
               int var23 = (int)(var41 * (float)((int[])((int[])((Object[])((Object[])var2[7]))[0]))[5] + var43 * (float)((int[])((int[])((Object[])((Object[])var2[7]))[0]))[2] + (float)((int[])((int[])((Object[])((Object[])var2[7]))[0]))[7] * var42);
               int var24 = var18 + -var44;
               int var25 = -var22 + var19;
               int var26 = var20 - var23;
               int var27 = (int)((double)var44 + (double)var24 * Math.random());
               int var28 = (int)((double)var22 + Math.random() * (double)var25);
               int var29 = (int)((double)var23 + (double)var26 * Math.random());
               int var30 = ((int[])((int[])((Object[])((Object[])var2[6]))[1]))[40] + (int)((double)(((int[])((int[])((Object[])((Object[])var2[6]))[1]))[47] + -((int[])((int[])((Object[])((Object[])var2[6]))[1]))[40]) * Math.random());
               int var31 = (int)((double)(((int[])((int[])((Object[])((Object[])var2[6]))[1]))[28] + -((int[])((int[])((Object[])((Object[])var2[6]))[1]))[17]) * Math.random()) + ((int[])((int[])((Object[])((Object[])var2[6]))[1]))[17];
               int var32 = ((int[])((int[])((Object[])((Object[])var2[6]))[1]))[33] + (int)(Math.random() * (double)(((int[])((int[])((Object[])((Object[])var2[6]))[1]))[11] - ((int[])((int[])((Object[])((Object[])var2[6]))[1]))[33]));
               int var33;
               if(((boolean[])((boolean[])((Object[])((Object[])var2[6]))[0]))[5]) {
                  double var34 = Math.random();
                  var33 = (int)(var34 * (double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[1] + (double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[21]) | (int)((double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[23] + (double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[8] * var34) << 8 | (int)((double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[15] + var34 * (double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[32]) << 16 | (int)((double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[27] * Math.random() + (double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[38]) << 24;
               } else {
                  var33 = (int)((double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[27] * Math.random() + (double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[38]) << 24 | (int)((double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[15] + Math.random() * (double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[32]) << 16 | (int)(Math.random() * (double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[8] + (double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[23]) << 8 | (int)((double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[1] * Math.random() + (double)((int[])((int[])((Object[])((Object[])var2[6]))[1]))[21]);
               }

               int var45 = ((int[])((int[])((Object[])((Object[])var2[6]))[1]))[18];
               if(!var1.o() && !((boolean[])((boolean[])((Object[])((Object[])var2[6]))[0]))[2]) {
                  var45 = -1;
               }

               if(bga.f_i != wba.a) {
                  ub var35 = mba.e[wba.a];
                  wba.a = 1 + wba.a & 1023;
                  var35.a(var2, var27, var28, var29, var11, var12, var13, var30, var31, var33, var32, var45, ((boolean[])((boolean[])((Object[])((Object[])var2[6]))[0]))[3], ((boolean[])((boolean[])((Object[])((Object[])var2[6]))[0]))[7]);
               } else {
                  new ub(var2, var27, var28, var29, var11, var12, var13, var30, var31, var33, var32, var45, ((boolean[])((boolean[])((Object[])((Object[])var2[6]))[0]))[3], ((boolean[])((boolean[])((Object[])((Object[])var2[6]))[0]))[7]);
               }
            }
         }
      }

      Object[] var37 = (Object[])((Object[])var2[0]);
      Object[] var38 = (Object[])((Object[])var2[7]);
      boolean var36;
      if(~((int[])((int[])var37[0]))[4] == ~((int[])((int[])var38[0]))[4] && ((int[])((int[])var38[0]))[1] == ((int[])((int[])var37[0]))[1] && ((int[])((int[])var38[0]))[0] == ((int[])((int[])var37[0]))[0]) {
         var36 = true;
      } else {
         var36 = false;
      }

      if(!var36) {
         Object[] var40 = (Object[])((Object[])var2[7]);
         var2[7] = var2[0];
         var2[0] = var40;
         ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[5] = ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[4];
         ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[11] = ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[12];
         ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[8] = ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[5];
         ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[10] = ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[2];
         if(var40 != null && var40.length == 3 && var40[0].equals(Integer.valueOf(0))) {
            return;
         }

         ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[0] = ((int[])((int[])((Object[])((Object[])var2[7]))[0]))[0];
         ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[7] = ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[11];
         ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[3] = ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[9];
         ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[9] = ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[0];
         ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[2] = ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[7];
         ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[6] = ((int[])((int[])((Object[])((Object[])var2[2]))[1]))[8];
         ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[4] = ((int[])((int[])((Object[])((Object[])var2[7]))[0]))[4];
         ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[1] = ((int[])((int[])((Object[])((Object[])var2[7]))[0]))[1];
      }

      ((int[])((int[])var2[1]))[6] = 0;

      for(ub var39 = (ub)om.a((Object[])((Object[])var2[5]), var6); var39 != null; var39 = (ub)pw.a((Object[])((Object[])var2[5]), -78)) {
         var39.a(var3, var0);
         ++((int[])((int[])var2[1]))[6];
      }

      if(null == var38 || var38.length != 9 || !var38[0].equals(Integer.valueOf(2))) {
         gd.f_i += ((int[])((int[])var2[1]))[6];
      }
   }

   static final float a(byte var0, Object[] var1, float var2) {
      if(var0 != -36) {
         return ((float[])((float[])var1[2]))[4];
      } else {
         ++d;
         return var2 / (float)((int[])((int[])var1[9]))[1];
      }
   }

}
