
final class gba extends za {

   static short o = 1;
   static int n;
   static cga r;
   static int m;
   static int q;
   Object[] p;


   gba(Object[] var1) {
      this.p = var1;
   }

   static final Object[] a(ii var0, int var1, int var2, int[] var3) {
      ++m;
      int[] var4 = null;
      int[] var5 = null;
      int[] var6 = null;
      if(var1 != -30075) {
         return (Object[])null;
      } else {
         float[][] var7 = (float[][])null;
         if(var0.n != null) {
            int var8 = var0.k;
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int[] var12 = new int[var8];
            int[] var13 = new int[var8];
            int[] var14 = new int[var8];

            int var15;
            for(var15 = 0; var15 < var8; ++var15) {
               var9[var15] = Integer.MAX_VALUE;
               var10[var15] = -2147483647;
               var11[var15] = Integer.MAX_VALUE;
               var12[var15] = -2147483647;
               var13[var15] = Integer.MAX_VALUE;
               var14[var15] = -2147483647;
            }

            var5 = new int[var8];
            var6 = new int[var8];

            int var20;
            for(var15 = 0; var2 > var15; ++var15) {
               int var16 = var3[var15];
               if(-1 != var0.n[var16]) {
                  int var17 = var0.n[var16] & 255;

                  for(int var18 = 0; var18 < 3; ++var18) {
                     short var19;
                     if(0 == var18) {
                        var19 = var0.p[var16];
                     } else if(var18 != 1) {
                        var19 = var0.J[var16];
                     } else {
                        var19 = var0.b[var16];
                     }

                     var20 = var0.f_l[var19];
                     int var21 = var0.h[var19];
                     int var22 = var0.z[var19];
                     if(var9[var17] > var20) {
                        var9[var17] = var20;
                     }

                     if(var10[var17] < var20) {
                        var10[var17] = var20;
                     }

                     if(var21 < var11[var17]) {
                        var11[var17] = var21;
                     }

                     if(var12[var17] < var21) {
                        var12[var17] = var21;
                     }

                     if(var22 < var13[var17]) {
                        var13[var17] = var22;
                     }

                     if(var22 > var14[var17]) {
                        var14[var17] = var22;
                     }
                  }
               }
            }

            var7 = new float[var8][];
            var4 = new int[var8];

            for(var15 = 0; var8 > var15; ++var15) {
               byte var37 = var0.G[var15];
               if(var37 > 0) {
                  var4[var15] = (var9[var15] + var10[var15]) / 2;
                  var5[var15] = (var12[var15] + var11[var15]) / 2;
                  var6[var15] = (var14[var15] + var13[var15]) / 2;
                  float var38;
                  float var39;
                  float var40;
                  if(1 == var37) {
                     var20 = var0.H[var15];
                     var39 = 64.0F / (float)var0.j[var15];
                     if(0 != var20) {
                        if(var20 <= 0) {
                           var40 = 1.0F;
                           var38 = (float)(-var20) / 1024.0F;
                        } else {
                           var40 = (float)var20 / 1024.0F;
                           var38 = 1.0F;
                        }
                     } else {
                        var38 = 1.0F;
                        var40 = 1.0F;
                     }
                  } else if(2 != var37) {
                     var39 = (float)var0.j[var15] / 1024.0F;
                     var38 = (float)var0.H[var15] / 1024.0F;
                     var40 = (float)var0.t[var15] / 1024.0F;
                  } else {
                     var38 = 64.0F / (float)var0.H[var15];
                     var39 = 64.0F / (float)var0.j[var15];
                     var40 = 64.0F / (float)var0.t[var15];
                  }

                  short var23 = var0.r[var15];
                  short var24 = var0.F[var15];
                  short var25 = var0.E[var15];
                  int var26 = 255 & var0.f[var15];
                  float[] var27 = new float[9];
                  float[] var28 = new float[9];
                  float var29 = (float)Math.cos((double)((float)var26 * 0.024543693F));
                  float var30 = (float)Math.sin((double)(0.024543693F * (float)var26));
                  var27[6] = -var30;
                  var27[8] = var29;
                  var27[5] = 0.0F;
                  var27[7] = 0.0F;
                  float var31 = 1.0F - var29;
                  var27[1] = 0.0F;
                  var27[0] = var29;
                  var27[3] = 0.0F;
                  var27[4] = 1.0F;
                  var27[2] = var30;
                  float[] var32 = new float[9];
                  float var33 = 1.0F;
                  var29 = (float)var24 / 32767.0F;
                  float var34 = 0.0F;
                  var31 = -var29 + 1.0F;
                  var30 = -((float)Math.sqrt((double)(1.0F - var29 * var29)));
                  float var35 = (float)Math.sqrt((double)(var25 * var25 + var23 * var23));
                  if(0.0F == var35 && var29 == 0.0F) {
                     var28 = var27;
                  } else {
                     if(0.0F != var35) {
                        var33 = (float)(-var25) / var35;
                        var34 = (float)var23 / var35;
                     }

                     var32[5] = var30 * var33;
                     var32[6] = var33 * var34 * var31;
                     var32[0] = var29 + var31 * var33 * var33;
                     var32[1] = var30 * var34;
                     var32[7] = var30 * -var33;
                     var32[4] = var29;
                     var32[8] = var34 * var34 * var31 + var29;
                     var32[2] = var33 * var34 * var31;
                     var32[3] = var30 * -var34;
                     var28[0] = var27[2] * var32[6] + var27[1] * var32[3] + var32[0] * var27[0];
                     var28[1] = var27[2] * var32[7] + var27[1] * var32[4] + var32[1] * var27[0];
                     var28[3] = var27[5] * var32[6] + var32[3] * var27[4] + var27[3] * var32[0];
                     var28[2] = var32[8] * var27[2] + var32[5] * var27[1] + var32[2] * var27[0];
                     var28[4] = var32[4] * var27[4] + var32[1] * var27[3] + var27[5] * var32[7];
                     var28[6] = var32[0] * var27[6] + var27[7] * var32[3] + var32[6] * var27[8];
                     var28[5] = var27[5] * var32[8] + var27[3] * var32[2] + var32[5] * var27[4];
                     var28[7] = var27[8] * var32[7] + var27[6] * var32[1] + var27[7] * var32[4];
                     var28[8] = var27[7] * var32[5] + var27[6] * var32[2] + var32[8] * var27[8];
                  }

                  var28[5] *= var39;
                  var28[4] *= var39;
                  var28[2] *= var38;
                  var28[8] *= var40;
                  var28[1] *= var38;
                  var28[6] *= var40;
                  var28[0] *= var38;
                  var28[3] *= var39;
                  var28[7] *= var40;
                  var7[var15] = var28;
               }
            }
         }

         return cva.a(var7, var5, var4, var6, false, new Object[4]);
      }
   }

   static final Object[][] b(byte var0) {
      if(null == rv.c) {
         Object[][] var1 = lb.a((int)0, roa.b);
         Object[][] var2 = new Object[var1.length][];
         int var3 = 0;
         int var4 = bt.a((Object[])((Object[])tu.d[4]), (byte)-39);

         label82:
         for(int var5 = 0; var5 < var1.length; ++var5) {
            Object[] var6 = var1[var5];
            if((-1 <= ~((int[])((int[])var6[0]))[3] || -25 >= ~((int[])((int[])var6[0]))[3]) && ((int[])((int[])var6[0]))[2] >= 800 && -601 >= ~((int[])((int[])var6[0]))[0] && (var4 != 2 || 800 >= ((int[])((int[])var6[0]))[2] && 600 >= ((int[])((int[])var6[0]))[0]) && (1 != var4 || -1025 <= ~((int[])((int[])var6[0]))[2] && -769 <= ~((int[])((int[])var6[0]))[0])) {
               for(int var7 = 0; var7 < var3; ++var7) {
                  Object[] var8 = var2[var7];
                  if(~((int[])((int[])var6[0]))[2] == ~((int[])((int[])var8[0]))[2] && ((int[])((int[])var6[0]))[0] == ((int[])((int[])var8[0]))[0]) {
                     if(~((int[])((int[])var6[0]))[3] < ~((int[])((int[])var8[0]))[3]) {
                        var2[var7] = var6;
                     }
                     continue label82;
                  }
               }

               if(null != var6 && 5 == var6.length) {
                  ks.a(0, 61);
               }

               var2[var3] = var6;
               ++var3;
            }
         }

         rv.c = new Object[var3][];
         System.arraycopy(var2, 0, rv.c, 0, var3);
         int[] var9 = new int[rv.c.length];

         for(int var10 = 0; rv.c.length > var10; ++var10) {
            Object[] var11 = rv.c[var10];
            var9[var10] = ((int[])((int[])var11[0]))[0] * ((int[])((int[])var11[0]))[2];
         }

         hfa.a(-114, var9, rv.c);
      }

      if(var0 >= -85) {
         b((byte)-46);
      }

      ++n;
      return rv.c;
   }

   static final Object[] a(byte var0, int var1, Object[] var2) {
      if(var2 != null && var2.length == 14) {
         moa.a((Object[])null, 68);
      }

      ++q;
      Object[] var3;
      synchronized(var2[0]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var2[0]), (long)var1));
      }

      if(null == var3) {
         byte[] var4;
         synchronized(var2[1]) {
            if(var0 < 34) {
               return (Object[])null;
            }

            var4 = qn.a(3, var1, (Object[])((Object[])var2[1]), -54);
         }

         var3 = qda.a(new Object[7], -115);
         var3[0] = var2;
         if(var4 != null) {
            pu.a(96, var3, jta.a((byte)-113, var4, new Object[3]));
         }

         synchronized(var2[0]) {
            il.a((long)var1, var3, true, (Object[])((Object[])var2[0]));
            return var3;
         }
      } else {
         return var3;
      }
   }

}
