import jaggl.OpenGL;

final class wca {

   static int d;
   static int c;
   static int e;
   static int b;
   static int a;


   static final void a(Object[] var0, int var1) throws Throwable {
      if(((long[])((long[])var0[6]))[0] != 0L) {
         el.a((Object[])((Object[])var0[4]), var1 - 103, ((long[])((long[])var0[6]))[0]);
         ((long[])((long[])var0[6]))[0] = 0L;
      }

      ((int[])((int[])var0[1]))[1] = 0;
      ((int[])((int[])var0[1]))[0] = 0;
      if(var1 == 1) {
         ++e;
         ((iua)var0[2]).a(false);
      }
   }

   static final boolean a(int var0, int var1, int var2) {
      ++b;
      boolean var3 = (33 & var2) != 0;
      if(var1 >= -30) {
         a(50, -45, -124);
      }

      boolean var4 = isa.a(0, var0, var2) | var3 | uma.b((byte)71, var2, var0);
      boolean var5 = (2048 & var2) != 0;
      return var5 & var4;
   }

   static final void a(Object[] var0, int[] var1, int var2) {
      int var3 = var2;
      if(df.g) {
         var3 = var2 << 1;
      }

      qo.a(var1, 0, var3);
      ((int[])((int[])var0[1]))[3] -= var2;
      if(var0[6] != null && ((int[])((int[])var0[1]))[3] <= 0) {
         ((int[])((int[])var0[1]))[3] += mc.a >> 4;
         if(var0 != null && var0.length == 2) {
            hga.a((byte)-123, (kp)null);
         }

         hga.a((byte)-33, (kp)var0[6]);
         fc.a(((kp)var0[6]).c(), var0, 3, (kp)var0[6]);
         int var4 = 0;
         int var5 = 255;

         int var6;
         kp var10;
         label136:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if(var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if((var9 & 1) != 0) {
                  if(var0 != null && var0.length == 23) {
                     df.g = true;
                  }

                  var5 &= ~(1 << var7);
                  var10 = null;
                  kp var11 = ((kp[])((kp[])var0[4]))[var7];

                  while(var11 != null) {
                     vj var12 = var11.k;
                     if(var12 != null && var12.j > var8) {
                        var5 |= 1 << var7;
                        var10 = var11;
                        var11 = var11.m;
                     } else {
                        var11.f_l = true;
                        int var13 = var11.d();
                        var4 += var13;
                        if(var12 != null) {
                           var12.j += var13;
                        }

                        if(var4 >= ((int[])((int[])var0[1]))[7]) {
                           break label136;
                        }

                        kp var14 = var11.b();
                        if(var14 != null) {
                           if(var0 != null && var0.length == 5) {
                              ((Object[])((Object[])nk.h[1]))[7] = nk.h[4];
                           }

                           for(int var15 = var11.j; var14 != null; var14 = var11.a()) {
                              fc.a(var15 * var14.c() >> 8, var0, 3, var14);
                           }
                        }

                        kp var18 = var11.m;
                        var11.m = null;
                        if(var10 == null) {
                           ((kp[])((kp[])var0[4]))[var7] = var18;
                        } else {
                           var10.m = var18;
                        }

                        if(var18 == null) {
                           ((kp[])((kp[])var0[3]))[var7] = var10;
                        }

                        var11 = var18;
                        if(var0 != null && var0.length == 6 && var0[0].equals(Integer.valueOf(1)) && var0[0].equals(Integer.valueOf(1))) {
                           ha.a((byte)-66, (Object[])null);
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            kp var16 = ((kp[])((kp[])var0[4]))[var6];
            if(var0 != null && var0.length == 13 && var0[3].equals(Integer.valueOf(2))) {
               fc.a(29, new Object[0][], 3, (kp)null);
            }

            kp[] var17 = (kp[])((kp[])var0[4]);
            ((kp[])((kp[])var0[3]))[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.m;
               var16.m = null;
            }
         }
      }

      if(((int[])((int[])var0[1]))[3] < 0) {
         ((int[])((int[])var0[1]))[3] = 0;
      }

      if(var0[6] != null) {
         ((kp)var0[6]).b(var1, 0, var2);
      }

      ((long[])((long[])var0[5]))[0] = he.a(-42);
   }

   static final void a(boolean var0, Object[] var1) {
      ((int[])((int[])var1[1]))[11] = -1;
      ((int[])((int[])var1[1]))[9] = 0;
      ((int[])((int[])var1[1]))[3] = -1;
      ((int[])((int[])var1[1]))[8] = -1;
      ((int[])((int[])var1[1]))[1] = 16777215;
      ((int[])((int[])var1[1]))[0] = 0;
      ((int[])((int[])var1[1]))[2] = -1;
      ((int[])((int[])var1[1]))[7] = -1;
      if(var0) {
         ++a;
         ((int[])((int[])var1[1]))[10] = 70;
         ((int[])((int[])var1[1]))[5] = 0;
         ((int[])((int[])var1[1]))[4] = -1;
         ((int[])((int[])var1[1]))[6] = -1;
         var1[0] = "";
         if(null != var1 && (var1.length == 1 && var1[0].equals(Integer.valueOf(0)) || 1 == var1.length)) {
            tpa.a((Object[])null, (int)7, (ta)null);
         }

      }
   }

   static final void a(Object[] var0, boolean var1) {
      OpenGL.glDepthMask(((boolean[])((boolean[])var0[63]))[3] && ((boolean[])((boolean[])var0[63]))[10]);
      if(!var1) {
         a((Object[])null, (int[])((int[])((Object[])((Object[])var0[2]))[1]), ((int[])((int[])var0[4]))[20]);
      }

      ++c;
   }

}
