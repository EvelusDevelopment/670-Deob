import jaggl.OpenGL;
import java.nio.ByteBuffer;

final class tka extends hsa {

   static int F;
   static int G;
   static int z;
   static int r;
   static int t;
   static int n;
   static float[][] p = new float[][]{{-0.333333F, -0.333333F, -0.333333F}, {0.333333F, -0.333333F, -0.333333F}, {-0.333333F, 0.333333F, -0.333333F}, {0.333333F, 0.333333F, -0.333333F}, {-0.333333F, -0.333333F, 0.333333F}, {0.333333F, -0.333333F, 0.333333F}, {-0.333333F, 0.333333F, 0.333333F}, {0.333333F, 0.333333F, 0.333333F}};
   static int v;
   static int A;
   static int C;
   static int f_l;
   static int y;
   static int s;
   static int x;
   static int o;
   private Object[] u;
   static int B;
   static int m = -1;
   static int D;
   static Object[] q = mu.a(new Object[1], -24490, 3);
   static Object[] w = ho.a(9, 41, new Object[1], true);
   static int E;


   final void a(lua var1) {
      eaa.a(this.u, var1, (byte)16);
      ++D;
   }

   final int d() {
      ++o;
      Object[] var2 = this.u;
      int var1 = ((int[])((int[])var2[1]))[1];
      return var1;
   }

   final boolean b() {
      ++x;
      return Class_v.a((byte)-126, this.u);
   }

   static final Object[] a(int var0, int var1, int var2) {
      Object[] var3 = ju.g[var0][var1][var2];
      return var3 == null?null:(Object[])((Object[])var3[2]);
   }

   protected final void finalize() throws Throwable {
      ++z;
      Object[] var1 = this.u;
      ((tka)var1[3]).a(-63);
      if(((int[])((int[])var1[1]))[4] != 0) {
         nra.a(-8305, (Object[])((Object[])var1[2]), ((int[])((int[])var1[1]))[4]);
         ((int[])((int[])var1[1]))[4] = 0;
      }

   }

   final boolean a() {
      ++n;
      return ht.a(this.u, true);
   }

   static final void a(int var0, boolean var1, Object[] var2, Object[] var3, int var4, boolean[][] var5, int var6, int var7) {
      ++f_l;
      if(var4 >= -32) {
         p = (float[][])((float[][])null);
      }

      float var9 = 1.0F / (float)(((int[])((int[])((Object[])((Object[])var3[4]))[1]))[38] * 128);
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var30;
      if(!var1) {
         int[] var10 = new int[((int[])((int[])var3[1]))[3] * ((int[])((int[])var3[1]))[1]];
         ByteBuffer var11 = (ByteBuffer)((Object[])((Object[])var3[4]))[57];
         var11.clear();
         var12 = 0;

         for(var13 = 0; ((int[])((int[])var3[1]))[1] > var13; ++var13) {
            var14 = var13 << ((int[])((int[])var3[1]))[4];
            var15 = var13 + 1 << ((int[])((int[])var3[1]))[4];

            for(var16 = 0; var16 < ((int[])((int[])var3[1]))[3]; ++var16) {
               Object[] var17 = ((Object[][][])((Object[][][])var3[2]))[var16][var13];
               int var18 = 0;
               if(null != var17) {
                  int var19 = var16 << ((int[])((int[])var3[1]))[4];
                  if(var2 != null && -15 == ~var2.length && var2[2].equals(Integer.valueOf(2)) && var2[2].equals(Integer.valueOf(2))) {
                     return;
                  }

                  int var20 = var16 + 1 << ((int[])((int[])var3[1]))[4];

                  for(int var21 = var14; var21 < var15; ++var21) {
                     if(-var7 <= -var6 + var21 && -var6 + var21 <= var7) {
                        Object[] var8;
                        int var22 = var19 + ((aa)((var8 = (Object[])((Object[])var3[3])) != null?var8[2]:null)).f_i * var21;

                        for(int var23 = var19; var20 > var23; ++var23) {
                           if(~(-var7) >= ~(var23 + -var0) && -var0 + var23 <= var7 && var5[var23 - (var0 + -var7)][-var6 + var21 + var7]) {
                              short[] var24 = ((short[][])((short[][])((Object[])((Object[])var3[3]))[4]))[var22];
                              if(var24 != null) {
                                 if(var2 != null && (-5 == ~var2.length && var2[2].equals(Boolean.valueOf(false)) || -12 == ~var2.length && var2[2].equals(Boolean.valueOf(false)) && var2[2].equals(Integer.valueOf(1)) || var2.length == 1)) {
                                    return;
                                 }

                                 for(int var25 = 0; var25 < var24.length; ++var25) {
                                    var11.putShort(var24[var25]);
                                    ++var18;
                                 }
                              }
                           }

                           ++var22;
                        }
                     }
                  }
               }

               var10[var12] = var18;
               ++var12;
            }

            if(var2 != null && var2.length == 1) {
               return;
            }
         }

         if(-1 == ~var11.position()) {
            return;
         }

         var13 = var11.position();
         if(null != var2 && (14 == var2.length || var2.length == 4)) {
            return;
         }

         Object[] var29 = fea.a((Object[])((Object[])var3[4]), (byte)-115, var13 / 2);
         nda.a(-18243, var29, var13, 0, ((long[])((long[])((Object[])((Object[])var3[4]))[50]))[0]);
         var15 = 0;
         var12 = 0;

         for(var16 = 0; ((int[])((int[])var3[1]))[1] > var16; ++var16) {
            for(var30 = 0; ((int[])((int[])var3[1]))[3] > var30; ++var30) {
               if(var10[var12] != 0) {
                  vt.a(var9, (byte)-119, (Object[])((Object[])var2[9]), var9, 1.0F, 1.0F);
                  ((float[])((float[])((Object[])((Object[])var2[9]))[0]))[12] = (float)(-var30);
                  ((float[])((float[])((Object[])((Object[])var2[9]))[0]))[13] = (float)(-var16);
                  sha.a(var10[var12] / 3, ((Object[][][])((Object[][][])var3[2]))[var30][var16], var15, 72, var29, var2);
                  var15 += var10[var12];
               }

               ++var12;
            }

            if(null != var29 && (-3 == ~var29.length || var29.length == 17)) {
               return;
            }
         }
      } else {
         for(int var28 = 0; ((int[])((int[])var3[1]))[1] > var28; ++var28) {
            if(var3 != null && var3.length == 4 && var3[1].equals(Integer.valueOf(2))) {
               return;
            }

            int var27 = var28 << ((int[])((int[])var3[1]))[4];
            var12 = var28 + 1 << ((int[])((int[])var3[1]))[4];

            label172:
            for(var13 = 0; ~var13 > ~((int[])((int[])var3[1]))[3]; ++var13) {
               if(null != ((Object[][][])((Object[][][])var3[2]))[var13][var28]) {
                  var14 = var13 << ((int[])((int[])var3[1]))[4];
                  var15 = var13 + 1 << ((int[])((int[])var3[1]))[4];

                  for(var16 = var14; var16 < var15; ++var16) {
                     if(~(var16 - var0) <= ~(-var7) && var7 >= -var0 + var16) {
                        if(var2 != null && 11 == var2.length) {
                           js.a(43, 122, 99, 64, (Object[])null, -1);
                        }

                        for(var30 = var27; var30 < var12; ++var30) {
                           if(~(-var7) >= ~(-var6 + var30) && ~var7 <= ~(var30 + -var6) && var5[-var0 + var16 + var7][var30 + -var6 + var7]) {
                              vt.a(var9, (byte)125, (Object[])((Object[])var2[9]), var9, 1.0F, 1.0F);
                              ((float[])((float[])((Object[])((Object[])var2[9]))[0]))[13] = (float)(-var28);
                              ((float[])((float[])((Object[])((Object[])var2[9]))[0]))[12] = (float)(-var13);
                              Object[] var31 = ((Object[][][])((Object[][][])var3[2]))[var13][var28];
                              sha.a(((int[])((int[])var31[1]))[5], var31, 0, 74, (Object[])((Object[])var31[3]), var2);
                              continue label172;
                           }
                        }
                     }
                  }
               }
            }
         }

         if(var3 != null && (-3 == ~var3.length && var3[1].equals(Integer.valueOf(1)) && var3[1].equals(Boolean.valueOf(false)) || var3.length == 9)) {
            gpa.a((Object[])null, -10942, (Object[])null, (Object[])null);
         }
      }

   }

   final void c() {
      ++A;
      Object[] var1 = this.u;
      if(-1 != ~((int[])((int[])var1[1]))[4]) {
         nra.a(-8305, (Object[])((Object[])var1[2]), ((int[])((int[])var1[1]))[4]);
         ((int[])((int[])var1[1]))[4] = 0;
      }

   }

   static final int[][] a(Object[] var0, int var1, int var2) {
      ++B;
      int[][] var3 = loa.a((byte)-52, var2, (Object[])((Object[])var0[4]));
      if(((boolean[])((boolean[])((Object[])((Object[])var0[4]))[var1]))[0]) {
         int var5 = fo.b / ((int[])((int[])var0[1]))[1];
         int var6 = cka.d / ((int[])((int[])var0[1]))[2];
         int[][] var4;
         if(var6 > 0) {
            int var7 = var2 % var6;
            var4 = bsa.a(0, (byte)17, var7 * cka.d / var6, var0);
         } else {
            var4 = bsa.a(0, (byte)17, 0, var0);
         }

         int[] var16 = var4[0];
         int[] var8 = var4[1];
         int[] var9 = var4[2];
         if(null != var0 && 2 == var0.length) {
            gb.b((Object[])null, 0);
         }

         int[] var10 = var3[0];
         int[] var11 = var3[1];
         int[] var12 = var3[2];

         for(int var13 = 0; fo.b > var13; ++var13) {
            int var14;
            if(var5 > 0) {
               int var15 = var13 % var5;
               var14 = var15 * fo.b / var5;
            } else {
               var14 = 0;
            }

            var10[var13] = var16[var14];
            var11[var13] = var8[var14];
            var12[var13] = var9[var14];
         }
      }

      return var3;
   }

   final void a(int var1, re var2) {
      ++s;
      nn.a(false, var1, this.u, var2);
   }

   static final void a(Object[] var0, int var1, int var2, int var3) {
      ++r;
      if(var3 != -16553) {
         ((int[])((int[])q[0]))[24] = ((int[])((int[])q[16]))[3];
      }

   }

   static final void a(Object[] var0, byte var1) {
      ++v;
      OpenGL.glDepthFunc(515);
      OpenGL.glEnable(2884);
      OpenGL.glCullFace(1029);
      OpenGL.glClearDepth(1.0F);
      OpenGL.glAlphaFunc(516, 0.0F);
      OpenGL.glPolygonMode(1028, 6914);

      for(int var2 = ((int[])((int[])var0[1]))[8] - 1; var2 >= 0; --var2) {
         OpenGL.glActiveTexture('\u84c0' + var2);
         OpenGL.glTexEnvi(8960, 8704, '\u8570');
         OpenGL.glTexEnvi(8960, '\u8571', 8448);
         OpenGL.glTexEnvi(8960, '\u8582', '\u8576');
         OpenGL.glTexEnvi(8960, '\u8572', 8448);
         OpenGL.glTexEnvi(8960, '\u858a', '\u8576');
      }

      if(var1 > -81) {
         a(((int[])((int[])var0[5]))[8], 55, -47);
      }

      OpenGL.glTexEnvi(8960, '\u858a', '\u8578');
      OpenGL.glShadeModel(7425);
      OpenGL.glMatrixMode(5888);
      OpenGL.glLoadIdentity();
      OpenGL.glColorMaterial(1028, 5634);
      OpenGL.glEnable(2903);
      float[] var5 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};

      for(int var3 = 0; var3 < 8; ++var3) {
         int var4 = var3 + 16384;
         OpenGL.glLightfv(var4, 4608, var5, 0);
         OpenGL.glLightf(var4, 4615, 0.0F);
         OpenGL.glLightf(var4, 4616, 0.0F);
      }

      if(var0 != null && var0.length == 1 && var0[0].equals(Boolean.valueOf(false))) {
         dq.a((float[])null, new Object[0][], -68, (byte)63, (Object[])null, -2, true, 115, -59);
      }

      OpenGL.glFogf(2914, 0.95F);
      OpenGL.glFogi(2917, 9729);
      OpenGL.glHint(3156, 4353);
      ((OpenGL)var0[86]).setSwapInterval(0);
      if(var0 != null && -88 == ~var0.length) {
         pa.a(var0, true, 7);
      } else {
         if(var0 == null || -92 != ~var0.length) {
            throw new IllegalStateException();
         }

         sh.a(7, var0, false);
      }

      jga.a(true, var0);
   }

   final boolean f() {
      ++y;
      return nd.a(this.u, (int)-46);
   }

   final int e() {
      ++t;
      return baa.a(this.u, 1);
   }

   tka(Object[] var1) {
      this.u = var1;
   }

   static final Object[] b(int var0, Object[] var1) {
      ++E;
      int var2 = fma.c(-17126, var1);
      Object[] var3 = fpa.a(124)[fh.a(var1, false)];
      Object[] var4 = iw.a((byte)-122)[fh.a(var1, false)];
      if(var0 != 128) {
         q[1] = (Object)null;
      }

      int var5 = jia.c(-8166, var1);
      int var6 = jia.c(var0 - 8294, var1);
      return tj.a(var5, var6, new Object[6], (byte)-128, var4, var2, var3);
   }

   private final void a(int var1) throws Throwable {
      if(var1 <= -29) {
         ++F;
         super.finalize();
      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      rt.a(var2, '\u8ca8', var3, var4, this.u, var8, var5, var6, var7, var1);
      ++G;
   }

   static final void b(byte var0, Object[] var1) {
      ((float[])((float[])var1[0]))[16] = ((float[])((float[])var1[0]))[14] - (float)((int[])((int[])var1[1]))[22];
      ++C;
      if(var0 > -112) {
         w = (Object[])((Object[])q[7]);
      }

      ((float[])((float[])var1[0]))[13] = (float)(-((int[])((int[])var1[1]))[4]) + ((float[])((float[])var1[0]))[16];
      if(((float[])((float[])var1[0]))[7] > ((float[])((float[])var1[0]))[13]) {
         ((float[])((float[])var1[0]))[13] = ((float[])((float[])var1[0]))[7];
      }

      if(((boolean[])((boolean[])var1[63]))[16]) {
         OpenGL.glFogf(2915, ((float[])((float[])var1[0]))[13]);
         OpenGL.glFogf(2916, ((float[])((float[])var1[0]))[16]);
         ((float[])((float[])var1[76]))[2] = (float)(255 & ((int[])((int[])var1[1]))[15]) / 255.0F;
         ((float[])((float[])var1[76]))[0] = (float)(((int[])((int[])var1[1]))[15] & 16711680) / 1.671168E7F;
         ((float[])((float[])var1[76]))[1] = (float)(((int[])((int[])var1[1]))[15] & '\uff00') / 65280.0F;
         OpenGL.glFogfv(2918, (float[])((float[])var1[76]), 0);
      }

   }

}
