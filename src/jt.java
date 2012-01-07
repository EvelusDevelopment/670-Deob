import jaclib.memory.Stream;
import jaggl.OpenGL;

final class jt {

   static int e;
   static int b;
   static int g;
   static int a;
   static int f;
   static int d;
   static int c;


   static final void a(Object[] var0, boolean var1, int var2) {
      ++g;
      ((Stream)var0[6]).d(3 + 4 * var2);
      if(var1) {
         ((Stream)var0[6]).b(-1);
      }
   }

   static final byte[][][] a(int var0, int var1) {
      ++f;
      byte[][][] var2 = new byte[8][4][];
      int var3 = var1;
      int var4 = var1;
      byte[] var5 = new byte[var1 * var1];
      int var6 = 0;

      int var7;
      int var8;
      for(var7 = 0; var4 > var7; ++var7) {
         for(var8 = 0; var3 > var8; ++var8) {
            if(var7 >= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[0][0] = var5;
      var6 = 0;
      var5 = new byte[var4 * var3];

      for(var7 = -1 + var4; var7 >= 0; --var7) {
         for(var8 = 0; var4 > var8; ++var8) {
            if(var7 >= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[0][1] = var5;
      var6 = 0;
      var5 = new byte[var3 * var4];

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 >= var7) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[0][2] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var3 > var8; ++var8) {
            if(var8 >= var7) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[0][3] = var5;
      var6 = 0;
      var5 = new byte[var3 * var4];

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var3 > var8; ++var8) {
            if(var7 >> 1 >= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[1][0] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(0 <= var6 && var5.length > var6) {
               if(var7 << 1 <= var8) {
                  var5[var6] = -1;
               }

               ++var6;
            } else {
               ++var6;
            }
         }
      }

      var2[1][1] = var5;
      var6 = 0;
      var5 = new byte[var4 * var3];

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 + -1; 0 <= var8; --var8) {
            if(var7 >> 1 >= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[1][2] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; 0 <= var7; --var7) {
         for(var8 = -1 + var3; var8 >= 0; --var8) {
            if(var7 << 1 <= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[1][3] = var5;
      var6 = 0;
      var5 = new byte[var4 * var3];

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = -1 + var3; var8 >= 0; --var8) {
            if(var7 >> 1 >= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[2][0] = var5;
      var6 = 0;
      var5 = new byte[var4 * var3];

      for(var7 = -1 + var4; var7 >= 0; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var7 << 1 <= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[2][1] = var5;
      var6 = 0;
      var5 = new byte[var3 * var4];

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var7 >> 1 >= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[2][2] = var5;
      var6 = 0;
      var5 = new byte[var4 * var3];

      for(var7 = 0; var4 > var7; ++var7) {
         for(var8 = -1 + var3; var8 >= 0; --var8) {
            if(~var8 <= ~(var7 << 1)) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[2][3] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; 0 <= var7; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(~var8 <= ~(var7 >> 1)) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[3][0] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var4 > var7; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var8 <= var7 << -1407886911) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[3][1] = var5;
      var6 = 0;
      var5 = new byte[var3 * var4];

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = var3 - 1; 0 <= var8; --var8) {
            if(var8 >= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[3][2] = var5;
      var6 = 0;
      var5 = new byte[var3 * var4];

      for(var7 = -1 + var4; var7 >= 0; --var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(~var8 >= ~(var7 << 1)) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[3][3] = var5;
      var6 = 0;
      var5 = new byte[var4 * var3];

      for(var7 = -1 + var4; var7 >= 0; --var7) {
         for(var8 = -1 + var3; 0 <= var8; --var8) {
            if(var8 >= var7 >> 1) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[4][0] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = var4 - 1; 0 <= var7; --var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var7 << 1 >= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[4][1] = var5;
      var6 = 0;
      var5 = new byte[var4 * var3];

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var3 > var8; ++var8) {
            if(var7 >> 1 <= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      if(var0 != 19531) {
         a((byte)-122, (Object[])null);
      }

      var2[4][2] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var4 > var7; ++var7) {
         for(var8 = -1 + var3; 0 <= var8; --var8) {
            if(var7 << 1 >= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[4][3] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(var3 / 2 >= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[5][0] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = 0; var4 > var7; ++var7) {
         for(var8 = 0; var8 < var3; ++var8) {
            if(~var7 >= ~(var4 / 2)) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[5][1] = var5;
      var6 = 0;
      var5 = new byte[var4 * var3];

      for(var7 = 0; var4 > var7; ++var7) {
         for(var8 = 0; var3 > var8; ++var8) {
            if(~var8 <= ~(var3 / 2)) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[5][2] = var5;
      var6 = 0;
      var5 = new byte[var4 * var3];

      for(var7 = 0; var4 > var7; ++var7) {
         for(var8 = 0; var3 > var8; ++var8) {
            if(~var7 <= ~(var4 / 2)) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[5][3] = var5;
      var6 = 0;
      var5 = new byte[var3 * var4];

      for(var7 = 0; var4 > var7; ++var7) {
         for(var8 = 0; var3 > var8; ++var8) {
            if(var7 + -(var4 / 2) >= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[6][0] = var5;
      var6 = 0;
      var5 = new byte[var3 * var4];

      for(var7 = var4 - 1; 0 <= var7; --var7) {
         for(var8 = 0; var3 > var8; ++var8) {
            if(var7 + -(var4 / 2) >= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[6][1] = var5;
      var6 = 0;
      var5 = new byte[var3 * var4];

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = var3 - 1; 0 <= var8; --var8) {
            if(var7 - var4 / 2 >= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[6][2] = var5;
      var6 = 0;
      var5 = new byte[var3 * var4];

      for(var7 = 0; var4 > var7; ++var7) {
         for(var8 = var3 - 1; var8 >= 0; --var8) {
            if(var7 - var4 / 2 >= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[6][3] = var5;
      var6 = 0;
      var5 = new byte[var4 * var3];

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = 0; var3 > var8; ++var8) {
            if(var8 >= -(var4 / 2) + var7) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[7][0] = var5;
      var5 = new byte[var4 * var3];
      var6 = 0;

      for(var7 = var4 - 1; var7 >= 0; --var7) {
         for(var8 = 0; var3 > var8; ++var8) {
            if(var8 >= var7 + -(var4 / 2)) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[7][1] = var5;
      var5 = new byte[var3 * var4];
      var6 = 0;

      for(var7 = -1 + var4; 0 <= var7; --var7) {
         for(var8 = var3 - 1; 0 <= var8; --var8) {
            if(var7 - var4 / 2 <= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[7][2] = var5;
      var6 = 0;
      var5 = new byte[var4 * var3];

      for(var7 = 0; var7 < var4; ++var7) {
         for(var8 = -1 + var3; var8 >= 0; --var8) {
            if(var7 - var4 / 2 <= var8) {
               var5[var6] = -1;
            }

            ++var6;
         }
      }

      var2[7][3] = var5;
      return var2;
   }

   static final void a(Object[] var0, boolean var1) {
      ((int[])((int[])var0[1]))[2] = 0;
      if(!var1) {
         ((boolean[])((boolean[])var0[6]))[18] = false;
      }

      ((int[])((int[])var0[1]))[9] = 0;
      ((int[])((int[])var0[1]))[3] = 0;
      ++d;
   }

   static final Object[] a(Object[] var0, int var1, int var2, Object[] var3, int var4, Object[] var5) {
      if(var1 != 1) {
         return (Object[])null;
      } else {
         ++b;
         if(!((boolean[])((boolean[])var3[63]))[23] && (!ol.a((byte)122, var4) || !ol.a((byte)126, var2))) {
            if(((boolean[])((boolean[])var3[63]))[27]) {
               Object[] var7 = new Object[8];
               wma.a(var7, 5);
               bca.a((byte)120, var5, var0, var2 * var4, var7, var3, '\u84f5', false);
               ((int[])((int[])var7[1]))[3] = var2;
               ((int[])((int[])var7[1]))[4] = var4;
               ah.a((Object[])((Object[])var7[5]), var7, (byte)112);
               OpenGL.glTexImage2Dub(((int[])((int[])var7[1]))[2], 0, vb.a(var1 ^ -121, (Object[])((Object[])var7[3]), (Object[])((Object[])var7[6])), var4, var2, 0, fv.a((Object[])((Object[])var7[6]), (int)0), ac.a(true, (Object[])((Object[])var7[3])), (byte[])null, 0);
               return var7;
            } else {
               Object[] var6 = new Object[11];
               int var10 = fda.a(var4, (byte)81);
               return om.a(116, var0, var6, var10, var3, fda.a(var2, (byte)81), var5);
            }
         } else {
            return om.a(120, var0, new Object[11], var4, var3, var2, var5);
         }
      }
   }

   static final int a(int var0, int var1, int var2) {
      ++c;
      double var3 = Math.log((double)var2) / Math.log(2.0D);
      double var5 = Math.log((double)var1) / Math.log(2.0D);
      double var7 = var5 + (var3 - var5) * Math.random();
      return var0 != 2?119:(int)(0.5D + Math.pow(2.0D, var7));
   }

   static final int a(byte var0, Object[] var1) {
      if(var0 < 46) {
         return ((int[])((int[])var1[4]))[2];
      } else {
         ++a;
         return ((int[])((int[])var1[1]))[3] + ((int[])((int[])var1[1]))[0] + ((int[])((int[])var1[1]))[1];
      }
   }

   static final void a(Object[] var0, Object[] var1, int var2, Object[] var3) {
      ++e;
      float var4 = ((float[])((float[])var1[0]))[2] * ((float[])((float[])var0[0]))[8] + ((float[])((float[])var0[0]))[0] * ((float[])((float[])var1[0]))[0] + ((float[])((float[])var1[0]))[1] * ((float[])((float[])var0[0]))[4] + ((float[])((float[])var1[0]))[3] * ((float[])((float[])var0[0]))[12];
      float var5 = ((float[])((float[])var1[0]))[3] * ((float[])((float[])var0[0]))[13] + ((float[])((float[])var0[0]))[9] * ((float[])((float[])var1[0]))[2] + ((float[])((float[])var1[0]))[0] * ((float[])((float[])var0[0]))[1] + ((float[])((float[])var1[0]))[1] * ((float[])((float[])var0[0]))[5];
      float var6 = ((float[])((float[])var1[0]))[3] * ((float[])((float[])var0[0]))[14] + ((float[])((float[])var1[0]))[0] * ((float[])((float[])var0[0]))[var2] + ((float[])((float[])var1[0]))[1] * ((float[])((float[])var0[0]))[6] + ((float[])((float[])var1[0]))[2] * ((float[])((float[])var0[0]))[10];
      float var7 = ((float[])((float[])var0[0]))[15] * ((float[])((float[])var1[0]))[3] + ((float[])((float[])var0[0]))[11] * ((float[])((float[])var1[0]))[2] + ((float[])((float[])var0[0]))[7] * ((float[])((float[])var1[0]))[1] + ((float[])((float[])var0[0]))[3] * ((float[])((float[])var1[0]))[0];
      float var8 = ((float[])((float[])var1[0]))[4] * ((float[])((float[])var0[0]))[0] + ((float[])((float[])var1[0]))[5] * ((float[])((float[])var0[0]))[4] + ((float[])((float[])var1[0]))[6] * ((float[])((float[])var0[0]))[8] + ((float[])((float[])var1[0]))[7] * ((float[])((float[])var0[0]))[12];
      float var9 = ((float[])((float[])var1[0]))[6] * ((float[])((float[])var0[0]))[9] + ((float[])((float[])var1[0]))[4] * ((float[])((float[])var0[0]))[1] + ((float[])((float[])var0[0]))[5] * ((float[])((float[])var1[0]))[5] + ((float[])((float[])var0[0]))[13] * ((float[])((float[])var1[0]))[7];
      float var10 = ((float[])((float[])var0[0]))[6] * ((float[])((float[])var1[0]))[5] + ((float[])((float[])var1[0]))[4] * ((float[])((float[])var0[0]))[2] + ((float[])((float[])var1[0]))[6] * ((float[])((float[])var0[0]))[10] + ((float[])((float[])var0[0]))[14] * ((float[])((float[])var1[0]))[7];
      float var11 = ((float[])((float[])var0[0]))[11] * ((float[])((float[])var1[0]))[6] + ((float[])((float[])var0[0]))[3] * ((float[])((float[])var1[0]))[4] + ((float[])((float[])var1[0]))[5] * ((float[])((float[])var0[0]))[7] + ((float[])((float[])var0[0]))[15] * ((float[])((float[])var1[0]))[7];
      float var12 = ((float[])((float[])var1[0]))[11] * ((float[])((float[])var0[0]))[12] + ((float[])((float[])var1[0]))[8] * ((float[])((float[])var0[0]))[0] + ((float[])((float[])var1[0]))[9] * ((float[])((float[])var0[0]))[4] + ((float[])((float[])var0[0]))[8] * ((float[])((float[])var1[0]))[10];
      float var13 = ((float[])((float[])var1[0]))[11] * ((float[])((float[])var0[0]))[13] + ((float[])((float[])var0[0]))[9] * ((float[])((float[])var1[0]))[10] + ((float[])((float[])var0[0]))[5] * ((float[])((float[])var1[0]))[9] + ((float[])((float[])var1[0]))[8] * ((float[])((float[])var0[0]))[1];
      float var14 = ((float[])((float[])var1[0]))[10] * ((float[])((float[])var0[0]))[10] + ((float[])((float[])var1[0]))[8] * ((float[])((float[])var0[0]))[2] + ((float[])((float[])var1[0]))[9] * ((float[])((float[])var0[0]))[6] + ((float[])((float[])var1[0]))[11] * ((float[])((float[])var0[0]))[14];
      float var15 = ((float[])((float[])var0[0]))[15] * ((float[])((float[])var1[0]))[11] + ((float[])((float[])var1[0]))[9] * ((float[])((float[])var0[0]))[7] + ((float[])((float[])var0[0]))[3] * ((float[])((float[])var1[0]))[8] + ((float[])((float[])var1[0]))[10] * ((float[])((float[])var0[0]))[11];
      if(var3 != null && -6 == ~var3.length) {
         fma.f_wb[0] = null;
      }

      float var16 = ((float[])((float[])var1[0]))[13] * ((float[])((float[])var0[0]))[4] + ((float[])((float[])var0[0]))[0] * ((float[])((float[])var1[0]))[12] + ((float[])((float[])var1[0]))[14] * ((float[])((float[])var0[0]))[8] + ((float[])((float[])var1[0]))[15] * ((float[])((float[])var0[0]))[12];
      float var17 = ((float[])((float[])var0[0]))[13] * ((float[])((float[])var1[0]))[15] + ((float[])((float[])var0[0]))[5] * ((float[])((float[])var1[0]))[13] + ((float[])((float[])var1[0]))[12] * ((float[])((float[])var0[0]))[1] + ((float[])((float[])var1[0]))[14] * ((float[])((float[])var0[0]))[9];
      float var18 = ((float[])((float[])var0[0]))[2] * ((float[])((float[])var1[0]))[12] + ((float[])((float[])var0[0]))[6] * ((float[])((float[])var1[0]))[13] + ((float[])((float[])var1[0]))[14] * ((float[])((float[])var0[0]))[10] + ((float[])((float[])var0[0]))[14] * ((float[])((float[])var1[0]))[15];
      ((float[])((float[])var3[0]))[1] = var5;
      ((float[])((float[])var3[0]))[2] = var6;
      ((float[])((float[])var3[0]))[0] = var4;
      float var19 = ((float[])((float[])var0[0]))[11] * ((float[])((float[])var1[0]))[14] + ((float[])((float[])var1[0]))[13] * ((float[])((float[])var0[0]))[7] + ((float[])((float[])var0[0]))[3] * ((float[])((float[])var1[0]))[12] + ((float[])((float[])var0[0]))[15] * ((float[])((float[])var1[0]))[15];
      ((float[])((float[])var3[0]))[10] = var14;
      ((float[])((float[])var3[0]))[3] = var7;
      ((float[])((float[])var3[0]))[13] = var17;
      ((float[])((float[])var3[0]))[7] = var11;
      ((float[])((float[])var3[0]))[11] = var15;
      ((float[])((float[])var3[0]))[12] = var16;
      ((float[])((float[])var3[0]))[14] = var18;
      ((float[])((float[])var3[0]))[5] = var9;
      ((float[])((float[])var3[0]))[6] = var10;
      ((float[])((float[])var3[0]))[15] = var19;
      ((float[])((float[])var3[0]))[4] = var8;
      ((float[])((float[])var3[0]))[9] = var13;
      ((float[])((float[])var3[0]))[8] = var12;
   }

}
