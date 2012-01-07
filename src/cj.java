import jaggl.OpenGL;

final class cj {

   static int b;
   static int[][] f = new int[][]{{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
   static int e;
   static int[] c = new int[1000];
   static int h;
   static Object[] a = ho.a(4, 35, new Object[1], true);
   static int j;
   static int f_i;
   static Object[] d = null;
   static Object[] k = null;
   static int[] g = new int[2048];


   static final void a(long var0, int var2) {
      ++j;
      int var3 = 41 % ((-54 - var2) / 50);

      try {
         Thread.sleep(var0);
      } catch (InterruptedException var5) {
         ;
      }

   }

   static final int a(int var0, int var1, Object[] var2) {
      ++b;
      if(var2 != null && var2.length == 3) {
         return mja.a((byte)-127, var2, var1);
      } else if(var2 != null && -1 == ~var2.length) {
         ma var4;
         Object[] var5 = (var4 = (ma)pm.a((long)var1, ita.f, false)) == null?null:var4.s;
         int var3;
         if(var5 != null) {
            var3 = ((int[])((int[])var5[1]))[0];
         } else {
            var3 = mja.a((byte)-126, eo.g, var1);
         }

         return var3;
      } else {
         if(var0 > -32) {
            a((byte)118);
         }

         throw new IllegalStateException();
      }
   }

   static final void a(boolean var0, byte var1, boolean var2, Object[] var3) {
      ++h;
      ah.a((Object[])((Object[])var3[5]), var3, (byte)86);
      if(var1 < 20) {
         g = (int[])null;
      }

      OpenGL.glTexParameteri(((int[])((int[])var3[1]))[2], 10242, var2?10497:'\u812f');
      OpenGL.glTexParameteri(((int[])((int[])var3[1]))[2], 10243, var0?10497:'\u812f');
   }

   static final Object[] a(Object[] var0, int var1, ta var2) {
      ++e;
      if(var0[42] != null && cf.a(2048, var0, 12, var2)) {
         Object[] var3 = bra.a(var0, true);
         Object[] var4 = woa.a(5, var0);
         Object[] var5 = var2.k();
         int var6 = bca.a((Object[])((Object[])var0[35]), false);
         Object[] var7 = ju.g[((byte[])((byte[])var0[10]))[0]][(int)((float[])((float[])((Object[])((Object[])var4[1]))[1]))[2] >> qqa.e][(int)((float[])((float[])((Object[])((Object[])var4[1]))[1]))[1] >> qqa.e];
         if(var7 != null && null != var7[6]) {
            int var8 = -((short[])((short[])((Object[])((Object[])var7[6]))[14]))[0] + ((int[])((int[])var0[12]))[22];
            ((int[])((int[])var0[12]))[22] = (int)((float)((int[])((int[])var0[12]))[22] - (float)var8 / 10.0F);
         } else {
            ((int[])((int[])var0[12]))[22] = (int)((float)((int[])((int[])var0[12]))[22] - (float)((int[])((int[])var0[12]))[22] / 10.0F);
         }

         lg.a(var5, var3, -18072);
         cq.a((byte)81, 0.0F, (float)(-20 + -((int[])((int[])var0[12]))[22]), 0.0F, var5);
         if(null != var7 && 2 == var7.length) {
            return null;
         } else {
            Object[] var14 = ro.a((int)3, var0);
            Object[] var9 = (Object[])(null == ((Object[])((Object[])var0[42]))[11]?var0[42]:ria.a(eo.g, (Object[])((Object[])var0[42]), var1 ^ -6821));
            ((boolean[])((boolean[])var0[8]))[6] = false;
            Object[] var10 = null;
            Object[] var11;
            if(lc.a((Object[])((Object[])tu.d[10]), var1 - 6826) == 1 && ((boolean[])((boolean[])var9[8]))[1] && ((boolean[])((boolean[])var14[7]))[0]) {
               var11 = (Object[])(wna.a((Object[])((Object[])var0[25]), 4) && tt.a((Object[])((Object[])var0[25]), var1 - 6826)?var0[25]:null);
               Object[] var12 = (Object[])(wna.a((Object[])((Object[])var0[30]), 4) && (!((boolean[])((boolean[])var0[8]))[7] || var11 == null)?var0[30]:null);
               ka var13 = jn.a(var6, ((int[])((int[])var0[12]))[25], ((int[])((int[])var0[12]))[37], ((ka[])((ka[])var0[29]))[0], var12 != null?var12:var11, var2, (byte)115, ((byte[])((byte[])((Object[])((Object[])var0[42]))[9]))[8] & 255, ((int[])((int[])((Object[])((Object[])var0[42]))[1]))[18], ((int[])((int[])var0[12]))[11], ((short[])((short[])((Object[])((Object[])var0[42]))[14]))[0] & '\uffff', 255 & ((byte[])((byte[])((Object[])((Object[])var0[42]))[9]))[6], ((short[])((short[])((Object[])((Object[])var0[42]))[14]))[1] & '\uffff');
               if(var13 != null) {
                  if(null == var0[9] || 1 + ((Object[])((Object[])var0[29])).length != ((Object[])((Object[])var0[9])).length) {
                     toa.a(1 + ((Object[])((Object[])var0[29])).length, var0, var1 - 1797);
                  }

                  var10 = bva.a(54, gs.a(var0, (byte)-59));
                  ((boolean[])((boolean[])var0[8]))[6] = true;
                  var2.c(false);
                  var13.a(var5, ((lpa[])((lpa[])var0[9]))[((Object[])((Object[])var0[29])).length], 0);
                  var2.c(true);
               }
            }

            if(var0[9] == null || ((Object[])((Object[])var0[29])).length != ((Object[])((Object[])var0[9])).length) {
               toa.a(((Object[])((Object[])var0[29])).length, var0, 5029);
            }

            if(null == var10) {
               var10 = bva.a(-125, gs.a(var0, (byte)-59));
            }

            aa.a(var2, var5, var0, false, (ka[])((ka[])var0[29]), false);
            if(var1 != 6826) {
               a((byte)110);
            }

            int var15;
            for(var15 = 0; var15 < ((Object[])((Object[])var0[29])).length; ++var15) {
               if(null != ((ka[])((ka[])var0[29]))[var15]) {
                  ((ka[])((ka[])var0[29]))[var15].a(var5, ((lpa[])((lpa[])var0[9]))[var15], 0);
               }
            }

            if(var0[16] != null) {
               var11 = ((ch)var0[16]).b();
               var2.c(var11);
            }

            for(var15 = 0; var15 < ((Object[])((Object[])var0[29])).length; ++var15) {
               if(((ka[])((ka[])var0[29]))[var15] != null) {
                  ((boolean[])((boolean[])var0[8]))[6] |= ((ka[])((ka[])var0[29]))[var15].XA();
               }

               ((ka[])((ka[])var0[29]))[var15] = null;
            }

            ((int[])((int[])var0[12]))[34] = OutputStreamWorker.c;
            return var10;
         }
      } else {
         return null;
      }
   }

   static final boolean a(byte var0) {
      ++f_i;
      if(var0 < 121) {
         d[10] = k[0];
      }

      return to.a != 7;
   }

}
