import jaggl.OpenGL;

final class kf {

   static int c;
   static int b = 0;
   static int a;
   static int d;
   static boolean[][] g = new boolean[][]{{false, false, false, false}, {false, true, true, false}, {true, false, true, false}, {true, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {true, true, false, false}, {false, false, false, false}, {false, true, false, true}, {false, false, false, false}};
   static int f;
   static int e;
   static int k;
   static int f_i;
   static int j;
   static int h;


   static final int a(int var0, Object[] var1) {
      if(var0 != 0) {
         a((Object[])((Object[])((Object[])((Object[])var1[1]))[0]), ((int[])((int[])var1[0]))[0], -29, ((int[])((int[])var1[1]))[16], -40, 75, 6, -12);
      }

      ++c;
      return 1;
   }

   static final void a(Object[] var0, int var1) {
      ++h;
      byte var2 = 0;
      byte var3 = 0;
      if(-1 == ~((int[])((int[])var0[1]))[19]) {
         var2 = 0;
         var3 = 0;
      } else if(((int[])((int[])var0[1]))[19] != 1) {
         if(((int[])((int[])var0[1]))[19] == 2) {
            var3 = 1;
            var2 = 1;
         }
      } else {
         var3 = 0;
         var2 = 1;
      }

      if(var1 != 14176) {
         ((int[])((int[])var0[5]))[2] = 120;
      }

      if(var0[72] == ib.e) {
         OpenGL.glBlendFuncSeparate(770, 771, var2, var3);
      } else if(wma.f == var0[72]) {
         OpenGL.glBlendFuncSeparate(1, 1, var2, var3);
      } else if(ssa.f_i == var0[72]) {
         OpenGL.glBlendFuncSeparate(774, 1, var2, var3);
      }

   }

   static final boolean a(int var0, int var1, ta var2, Object[] var3) {
      ++d;
      int var4 = var1;
      Object[] var5 = ro.a((int)3, var3);
      Object[] var6 = (Object[])(wna.a((Object[])((Object[])var3[25]), 4) && !tt.a((Object[])((Object[])var3[25]), 0)?var3[25]:null);
      Object[] var7 = (Object[])(wna.a((Object[])((Object[])var3[30]), 4) && !((boolean[])((boolean[])var3[8]))[13] && (!((boolean[])((boolean[])var3[8]))[7] || var6 == null)?var3[30]:null);
      if(var6 != null && 7 == var6.length) {
         return false;
      } else {
         int var8 = ((int[])((int[])var5[1]))[16];
         int var9 = ((int[])((int[])var5[1]))[19];
         if(var8 != 0 || var9 != 0 || ((int[])((int[])var5[1]))[36] != 0 || ((int[])((int[])var5[1]))[30] != 0) {
            var1 |= 7;
         }

         int var10 = bca.a((Object[])((Object[])var3[35]), false);
         boolean var11 = ((byte[])((byte[])var3[10]))[7] != 0 && ((int[])((int[])var3[12]))[17] <= kda.d && kda.d < ((int[])((int[])var3[12]))[24];
         if(var11) {
            var1 |= 524288;
         }

         int var12 = -64 % ((-20 - var0) / 49);
         ka var13 = ((ka[])((ka[])var3[29]))[0] = pu.a(true, hh.a, (Object[])((Object[])var3[42]), cqa.a, 3, nt.f_i, cq.f_i, var7, (Object[][])((Object[][])var3[20]), eo.g, var2, var6, var1, (int[])((int[])var3[26]), he.b, im.a, var10);
         Object[] var15 = id.f;
         int var14;
         synchronized(id.f) {
            Object[] var17 = id.f;
            int var20 = 0;

            wg var19;
            wg var18;
            for(Object[] var21 = null == (var18 = (wg)gm.a((Object[])((Object[])var17[2]), 0))?null:var18.t; null != var21; var21 = null == (var19 = (wg)dka.a((Object[])((Object[])var17[2]), (byte)15))?null:var19.t) {
               if(!du.a((byte)-55, var21)) {
                  ++var20;
               }
            }

            var14 = var20;
         }

         if(96 > Class_e.f && var14 > 50) {
            ms.b(14);
         }

         if(po.f_i != mka.g && 50 > var14) {
            int var16;
            for(var16 = 50 - var14; var16 > he.h; ++he.h) {
               gi.S[he.h] = new byte[102400];
            }

            while(he.h > var16) {
               --he.h;
               gi.S[he.h] = null;
            }

            if(null != var5 && (2 == var5.length || var5.length == 6 && var5[0].equals(Boolean.valueOf(false)) || var5.length == 3 && var5[0].equals(Integer.valueOf(1)))) {
               return false;
            }
         } else if(mka.g != po.f_i) {
            he.h = 0;
            gi.S = new byte[50][];
         }

         if(null == var13) {
            return false;
         } else {
            ((int[])((int[])var3[12]))[7] = var13.pa();
            ((int[])((int[])var3[12]))[13] = var13.ra();
            ng.a(var13, (byte)-30, var3);
            if(var8 == 0 && 0 == var9) {
               tfa.a(gn.a(var3, (byte)79) << 9, var10, gn.a(var3, (byte)79) << 9, 0, var3, 12, 0);
            } else {
               tfa.a(var8, var10, var9, ((int[])((int[])var5[1]))[31], var3, 12, ((int[])((int[])var5[1]))[13]);
               if(-1 != ~((int[])((int[])var3[12]))[11]) {
                  var13.UA(((int[])((int[])var3[12]))[11]);
               }

               if(0 != ((int[])((int[])var3[12]))[25]) {
                  var13.fa(((int[])((int[])var3[12]))[25]);
               }

               if(((int[])((int[])var3[12]))[37] != 0) {
                  var13.K(0, ((int[])((int[])var3[12]))[37], 0);
               }
            }

            if(var11) {
               var13.a(((byte[])((byte[])var3[10]))[5], ((byte[])((byte[])var3[10]))[4], ((byte[])((byte[])var3[10]))[3], 255 & ((byte[])((byte[])var3[10]))[7]);
            }

            if(!((boolean[])((boolean[])var3[8]))[13]) {
               cta.a(var8, var2, var3, var10, var5, var4, (byte)32, var9);
            }

            return true;
         }
      }
   }

   static final void a(String var0, String var1, String var2, int var3, int var4, int var5, Object[] var6, String var7, String var8, int var9) {
      ++f;
      ((int[])((int[])var6[1]))[3] = wma.a(var5 ^ 9761);
      var6[3] = var1;
      ((int[])((int[])var6[1]))[4] = var9;
      ((int[])((int[])var6[1]))[0] = kda.d;
      var6[4] = var2;
      var6[2] = var0;
      if(var5 != 9764) {
         a(false, ((byte[])((byte[])var6[0]))[2]);
      }

      var6[0] = var7;
      ((int[])((int[])var6[1]))[2] = var4;
      if(null != var6 && (-8 == ~var6.length || var6.length == 4)) {
         su.a((String)null, (String)null, (String)null, 81, (Object[])null, (String)null, (String)null, -71, (byte)97, 13);
      }

      ((int[])((int[])var6[1]))[1] = var3;
      var6[5] = var8;
   }

   static final Object[] a(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var0[0] == null) {
         var0[0] = new int[6];
      }

      ++f_i;
      ((int[])((int[])var0[0]))[3] = var1;
      ((int[])((int[])var0[0]))[2] = 128;
      ((int[])((int[])var0[0]))[0] = 128;
      ((int[])((int[])var0[0]))[0] = var5;
      ((int[])((int[])var0[0]))[5] = var4;
      ((int[])((int[])var0[0]))[2] = var6;
      if(var3 < 58) {
         a(-103, -59, (ta)null, (Object[])((Object[])var0[10]));
      }

      ((int[])((int[])var0[0]))[4] = var7;
      ((int[])((int[])var0[0]))[1] = var2;
      return var0;
   }

   static final boolean a(Object[] var0, byte var1) {
      ++j;
      if(var1 != -83) {
         a((Object[])((Object[])var0[6]), (int)-34);
      }

      return ((boolean[])((boolean[])var0[0]))[0];
   }

   static final char a(boolean var0, byte var1) {
      if(!var0) {
         a(-58, (Object[])null);
      }

      ++k;
      int var2 = var1 & 255;
      if(0 == var2) {
         throw new IllegalArgumentException("" + Integer.toString(var2, 16));
      } else {
         if(var2 >= 128 && 160 > var2) {
            char var3 = mp.f_i[var2 - 128];
            if(0 == var3) {
               var3 = 63;
            }

            var2 = var3;
         }

         return (char)var2;
      }
   }

   static final void a(byte var0, boolean var1, String var2) {
      ++a;
      if(var2 != null) {
         if(kl.k >= 100) {
            kaa.a(gj.a(dp.y, -78, gj.B), -60, 4);
         } else {
            String var3 = dm.a((int)-84, var2);
            if(null != var3) {
               int var4;
               String var5;
               String var6;
               for(var4 = 0; var4 < kl.k; ++var4) {
                  var5 = dm.a((int)-72, eb.a[var4]);
                  if(var5 != null && var5.equals(var3)) {
                     kaa.a(var2 + gj.a(dp.y, -117, gj.A), -71, 4);
                     return;
                  }

                  if(le.b[var4] != null) {
                     var6 = dm.a((int)-15, le.b[var4]);
                     if(null != var6 && var6.equals(var3)) {
                        kaa.a(var2 + gj.a(dp.y, -77, gj.A), -78, 4);
                        return;
                     }
                  }
               }

               if(var0 < 86) {
                  a((String)null, (String)null, (String)null, 74, -56, 59, (Object[])null, (String)null, (String)null, -79);
               }

               for(var4 = 0; var4 < ola.c; ++var4) {
                  var5 = dm.a((int)-68, ir.a[var4]);
                  if(null != var5 && var5.equals(var3)) {
                     kaa.a(gj.a(dp.y, -47, gj.f) + var2 + gj.a(dp.y, -58, gj.f_nb), -93, 4);
                     return;
                  }

                  if(null != fc.b[var4]) {
                     var6 = dm.a((int)-73, fc.b[var4]);
                     if(null != var6 && var6.equals(var3)) {
                        kaa.a(gj.a(dp.y, -84, gj.f) + var2 + gj.a(dp.y, 127, gj.f_nb), -71, 4);
                        return;
                     }
                  }
               }

               if(dm.a((int)-123, (String)uta.g[37]).equals(var3)) {
                  kaa.a(gj.a(dp.y, 106, gj.o), -98, 4);
               } else {
                  ++ig.z;
                  Object[] var7 = hua.a(true);
                  Object[] var8 = ona.a((byte)123, (Object[])((Object[])var7[7]), fe.n);
                  if(null != var8 && -4 == ~var8.length) {
                     ht.a = null;
                  }

                  ek.putByte((Object[])((Object[])var8[0]), 1 + vs.a(var2, (byte)14));
                  bw.a(var2, (byte)0, (Object[])((Object[])var8[0]));
                  ek.putByte((Object[])((Object[])var8[0]), !var1?0:1);
                  lj.a(var8, 6, var7);
               }
            }
         }
      }
   }

   static final boolean a(int var0, int var1) {
      ++e;
      return var0 != 26?false:var1 == 10 || var1 == 13 || 1 == var1;
   }

}
