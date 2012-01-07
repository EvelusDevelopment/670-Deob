import jaggl.OpenGL;
import java.util.Random;

final class moa {

   static int f = 0;
   static int d;
   static int b;
   static int g;
   static int h;
   static int a;
   static int f_i;
   static int c = 0;
   static int e;


   static final void a(byte var0, Object[] var1, Object[] var2) {
      if(var0 < 91) {
         g = -8;
      }

      ++f_i;
      Object[] var3 = ((Object[][])((Object[][])var2[18]))[((int[])((int[])var2[1]))[6]];
      if(var1 != var3) {
         if(null != var1) {
            if(var3 == null) {
               OpenGL.glEnable(((int[])((int[])var1[1]))[2]);
            } else if(((int[])((int[])var1[1]))[2] != ((int[])((int[])var3[1]))[2]) {
               OpenGL.glDisable(((int[])((int[])var3[1]))[2]);
               OpenGL.glEnable(((int[])((int[])var1[1]))[2]);
            }

            OpenGL.glBindTexture(((int[])((int[])var1[1]))[2], ((int[])((int[])var1[1]))[1]);
         } else {
            OpenGL.glDisable(((int[])((int[])var3[1]))[2]);
         }

         ((Object[][])((Object[][])var2[18]))[((int[])((int[])var2[1]))[6]] = var1;
      }

      ((int[])((int[])var2[1]))[20] &= -2;
   }

   static final void a(Random var0, int var1, int var2, int var3, Object[] var4, int var5, int var6, int[][] var7) {
      ++b;
      int var8 = ((int[])((int[])var4[1]))[3] > 0?4096 - cl.a(85, var0, ((int[])((int[])var4[1]))[3]):4096;
      if(var5 != 2092904780) {
         ((byte[])((byte[])((Object[])((Object[])var4[16]))[18]))[3] = -1;
      }

      int var9 = ((int[])((int[])var4[1]))[7] * ((int[])((int[])var4[1]))[2] >> 12;
      int var10 = ((int[])((int[])var4[1]))[7] - (var9 <= 0?0:cl.a(106, var0, var9));
      if(var3 >= fo.b) {
         var3 -= fo.b;
      }

      int var11;
      int var12;
      if(var10 <= 0) {
         if(var2 + var3 <= fo.b) {
            if(var4 != null && var4.length == 2 && var4[0].equals(Integer.valueOf(0))) {
               ib.b(new Object[6][], (byte)-58);
            }

            for(var11 = 0; var11 < var1; ++var11) {
               qo.a(var7[var6 + var11], var3, var2, var8);
            }
         } else {
            var11 = fo.b - var3;
            if(var4 != null && -7 == ~var4.length && var4[4].equals(Integer.valueOf(0))) {
               tna.a(new Object[6][], (Object[])null, 34, true);
            }

            for(var12 = 0; var1 > var12; ++var12) {
               int[] var13 = var7[var12 + var6];
               qo.a(var13, var3, var11, var8);
               qo.a(var13, 0, -var11 + var2, var8);
            }
         }
      } else {
         if(0 >= var1 || var2 <= 0) {
            return;
         }

         var11 = var2 / 2;
         if(var4 != null && var4.length == 1 && var4[0].equals(Integer.valueOf(2))) {
            return;
         }

         var12 = var1 / 2;
         int var23 = var11 < var10?var11:var10;
         int var14 = var10 <= var12?var10:var12;
         int var15 = var3 + var23;
         int var16 = var2 + -(2 * var23);

         for(int var17 = 0; var1 > var17; ++var17) {
            int[] var18 = var7[var17 + var6];
            int var19;
            int var21;
            int var20;
            if(var14 > var17) {
               var19 = var17 * var8 / var14;
               if(((int[])((int[])var4[1]))[5] != 0) {
                  if(var4 != null && -3 == ~var4.length && var4[1].equals(Boolean.valueOf(false))) {
                     a((Random)null, 39, -36, 115, (Object[])null, 2092904780, 51, (int[][])null);
                  }

                  for(var20 = 0; var20 < var23; ++var20) {
                     var21 = var8 * var20 / var23;
                     var18[var3 + var20 & td.q] = var18[td.q & -var20 + var3 - (-var2 + 1)] = var21 < var19?var21:var19;
                  }
               } else {
                  for(var20 = 0; var23 > var20; ++var20) {
                     var21 = var20 * var8 / var23;
                     var18[td.q & var20 + var3] = var18[td.q & -1 + var3 - (-var2 + var20)] = var19 * var21 >> 12;
                  }

                  if(null != var4 && (-9 == ~var4.length || 10 == var4.length)) {
                     a((Random)null, 77, 13, -108, (Object[])null, var5 + 0, -83, (int[][])null);
                  }
               }

               if(var15 + var16 <= fo.b) {
                  qo.a(var18, var15, var16, var19);
               } else {
                  var20 = -var15 + fo.b;
                  qo.a(var18, var15, var20, var19);
                  qo.a(var18, 0, -var20 + var16, var19);
               }
            } else {
               if(var4 != null && (21 == var4.length || 8 == var4.length || -6 == ~var4.length)) {
                  tna.a((Object[])null, (Object[])null, -108, true);
               }

               var19 = var1 + (-var17 - 1);
               if(var19 >= var14) {
                  for(var20 = 0; var20 < var23; ++var20) {
                     var18[td.q & var20 + var3] = var18[td.q & -1 + -var20 + var3 + var2] = var8 * var20 / var23;
                  }

                  if(fo.b < var15 + var16) {
                     var20 = fo.b - var15;
                     qo.a(var18, var15, var20, var8);
                     qo.a(var18, 0, -var20 + var16, var8);
                  } else {
                     qo.a(var18, var15, var16, var8);
                  }
               } else {
                  var20 = var19 * var8 / var14;
                  int var22;
                  if(0 != ((int[])((int[])var4[1]))[5]) {
                     if(var4 != null && var4.length == 4) {
                        return;
                     }

                     for(var21 = 0; var23 > var21; ++var21) {
                        var22 = var8 * var21 / var23;
                        var18[td.q & var21 + var3] = var18[td.q & -1 + (var3 - (-var2 + var21))] = var20 > var22?var22:var20;
                     }
                  } else {
                     if(var4 != null && 19 == var4.length && var4[4].equals(Boolean.valueOf(false))) {
                        a((Random)null, -124, -30, -45, (Object[])null, var5 + 0, -23, (int[][])null);
                     }

                     for(var21 = 0; var21 < var23; ++var21) {
                        var22 = var21 * var8 / var23;
                        var18[td.q & var3 + var21] = var18[td.q & -1 + -var21 + var2 + var3] = var20 * var22 >> 12;
                     }
                  }

                  if(var15 + var16 > fo.b) {
                     var21 = -var15 + fo.b;
                     qo.a(var18, var15, var21, var20);
                     qo.a(var18, 0, var16 - var21, var20);
                  } else {
                     qo.a(var18, var15, var16, var20);
                  }
               }
            }
         }
      }

   }

   static final void a(Object[] var0, int var1) {
      if(var1 >= 49) {
         var0[0] = sj.a(64, new Object[3], (byte)-70);
         ++a;
      }
   }

   static final long a(int var0, int var1) {
      ++e;
      return var0 > -19?124L:86400000L * (long)(11745 + var1);
   }

   static final void a(Object[] var0, float var1, float var2, float var3, int var4, float var5) {
      ++d;
      if(var4 != 2481) {
         a((byte)19, (Object[])null, (Object[])null);
      }

      oga.q[2] = var3;
      oga.q[0] = var1;
      oga.q[1] = var5;
      oga.q[3] = var2;
      OpenGL.glTexEnvfv(8960, 8705, oga.q, 0);
   }

   static final boolean a(byte var0, Object[] var1) {
      ++h;
      if(var0 != 75) {
         c = 14;
      }

      if(var1 != null && var1.length == 8) {
         return cna.a((int)-19031, var1);
      } else if(null != var1 && var1.length == 9) {
         return upa.a(var1, (byte)-97);
      } else {
         throw new IllegalStateException();
      }
   }

}
