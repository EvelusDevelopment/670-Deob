import jagdx.D3DLIGHT;
import jaggl.OpenGL;
import java.lang.ref.SoftReference;

final class eg {

   static int e;
   static int a;
   static int[] c = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   static long d;
   static int b;


   static final Object[] a(int var0, Object[] var1, Object[] var2, int var3, Object var4) {
      if(var3 > -3) {
         c = (int[])null;
      }

      ++b;
      en.a(124, var2);
      var2[2] = epa.b(19153, var2);
      ((int[])((int[])var2[1]))[0] = var0;
      var2[0] = var1;
      var2[4] = new SoftReference(var4);
      return var2;
   }

   static final void a(Object[] var0, char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8) {
      if(((Object[])((Object[])var0[6]))[7] != null) {
         if(var6 == null) {
            a(var0, var1, var2, var3, var4, var5);
         } else {
            var2 += ((int[])((int[])var0[2]))[var1];
            var3 += ((int[])((int[])var0[4]))[var1];
            int var9 = ((int[])((int[])var0[0]))[var1];
            int var10 = ((int[])((int[])var0[3]))[var1];
            int var11 = ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[4];
            int var12 = var2 + var3 * var11;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[16]) {
               var16 = ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[16] - var3;
               var10 -= var16;
               var3 = ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[16];
               var15 += var16 * var9;
               var12 += var16 * var11;
            }

            if(var0 != null && (var0.length == 1 || var0.length == 3)) {
               a((Object[])null, '\uffee', -77, 41, -96, true);
            }

            if(var3 + var10 > ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[1]) {
               var10 -= var3 + var10 - ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[1];
            }

            if(var2 < ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[7]) {
               var16 = ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[7] - var2;
               var9 -= var16;
               var2 = ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[7];
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var2 + var9 > ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[19]) {
               var16 = var2 + var9 - ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[19];
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               if((var4 & -16777216) == -16777216) {
                  b(var0, ((byte[][])((byte[][])var0[1]))[var1], (int[])((int[])((Object[])((Object[])var0[6]))[7]), var4, var15, var12, var9, var10, var13, var14, var2, var3, ((int[])((int[])var0[0]))[var1], var6, var7, var8);
               } else {
                  a(var0, ((byte[][])((byte[][])var0[1]))[var1], (int[])((int[])((Object[])((Object[])var0[6]))[7]), var4, var15, var12, var9, var10, var13, var14, var2, var3, ((int[])((int[])var0[0]))[var1], var6, var7, var8);
               }

            }
         }
      }
   }

   private static final woa a(Object[] var0, ta var1, Object[] var2) {
      return new woa(var0, var1, var2);
   }

   private static final void b(Object[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for(int var11 = -var7; var11 < 0; ++var11) {
         int var12;
         for(var12 = var10; var12 < 0; ++var12) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         for(var12 = var6; var12 < 0; ++var12) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         var5 += var8;
         if(var0 != null && var0.length == 12 && var0[1].equals(Integer.valueOf(1))) {
            b((Object[])null, (byte[])null, (int[])null, -45, 13, -103, -3, -9, -33, 124, 40, 62, 23, (Class_s)null, 25, 34);
         }

         var4 += var9;
      }

      if(var0 != null && var0.length == 4) {
         a((Object[])null, (ta)null, (Object[])null);
      }

   }

   private static final void a(Object[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class_s var13, int var14, int var15) {
      bk var16;
      Object[] var17 = (var16 = (bk)var13) == null?null:var16.f_l;
      int[] var18 = (int[])((int[])var17[0]);
      int[] var19 = (int[])((int[])var17[2]);
      if(var0 == null || var0.length != 23 || !var0[4].equals(Integer.valueOf(0)) || !var0[4].equals(Integer.valueOf(1))) {
         int var20 = var10 - ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[7];
         int var21 = var11;
         if(var15 > var11) {
            var21 = var15;
            var5 += (var15 - var11) * ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[4];
            var4 += (var15 - var11) * var12;
         }

         int var22 = var15 + var18.length < var11 + var7?var15 + var18.length:var11 + var7;
         int var23 = var3 >>> 24;
         int var24 = 255 - var23;

         for(int var25 = var21; var25 < var22; ++var25) {
            int var26 = var18[var25 - var15] + var14;
            int var27 = var19[var25 - var15];
            int var28 = var6;
            int var29;
            if(var20 > var26) {
               var29 = var20 - var26;
               if(var29 >= var27) {
                  var4 += var6 + var9;
                  var5 += var6 + var8;
                  continue;
               }

               var27 -= var29;
            } else {
               var29 = var26 - var20;
               if(var29 >= var6) {
                  var4 += var6 + var9;
                  var5 += var6 + var8;
                  continue;
               }

               var4 += var29;
               var28 = var6 - var29;
               var5 += var29;
            }

            var29 = 0;
            if(var28 < var27) {
               var27 = var28;
            } else {
               var29 = var28 - var27;
            }

            for(int var30 = -var27; var30 < 0; ++var30) {
               if(var1[var4++] != 0) {
                  int var31 = ((var3 & 16711935) * var23 & -16711936) + ((var3 & '\uff00') * var23 & 16711680) >> 8;
                  int var32 = var2[var5];
                  var2[var5++] = (((var32 & 16711935) * var24 & -16711936) + ((var32 & '\uff00') * var24 & 16711680) >> 8) + var31;
               } else {
                  ++var5;
               }
            }

            var4 += var29 + var9;
            if(var17 != null && var17.length == 2 && var17[0].equals(Integer.valueOf(2))) {
               return;
            }

            var5 += var29 + var8;
         }

      }
   }

   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, aea[] var3, int[] var4, int[] var5) {
      if(var2 != null && var2.length == 2) {
         a((Object[])null, '\ufff9', 83, 67, -117, false);
      }

      var0[5] = a(var0, (ta)(var1 == null?null:var1[6]), var2);
      var0[6] = var1;
      var0[0] = var4;
      var0[3] = var5;
      var0[1] = new byte[var3.length][];
      var0[4] = new int[var3.length];
      var0[2] = new int[var3.length];

      for(int var7 = 0; var7 < var3.length; ++var7) {
         ((byte[][])((byte[][])var0[1]))[var7] = var3[var7].c;
         ((int[])((int[])var0[4]))[var7] = var3[var7].b;
         ((int[])((int[])var0[2]))[var7] = var3[var7].f;
      }

      return var0;
   }

   private static final void b(Object[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class_s var13, int var14, int var15) {
      bk var16;
      Object[] var17 = (var16 = (bk)var13) == null?null:var16.f_l;
      int[] var18 = (int[])((int[])var17[0]);
      if(var0 != null && var0.length == 6 && var0[3].equals(Integer.valueOf(1)) && var0[3].equals(Integer.valueOf(0))) {
         a((Object[])null, (Object[])null, (Object[])null, (aea[])null, (int[])null, (int[])null);
      }

      int[] var19 = (int[])((int[])var17[2]);
      int var20 = var11;
      if(var15 > var11) {
         var20 = var15;
         var5 += (var15 - var11) * ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[4];
         var4 += (var15 - var11) * var12;
      }

      int var21 = var15 + var18.length < var11 + var7?var15 + var18.length:var11 + var7;

      for(int var22 = var20; var22 < var21; ++var22) {
         int var23 = var14 + var18[var22 - var15];
         int var24 = var19[var22 - var15];
         int var25 = var6;
         int var26;
         if(var10 > var23) {
            var26 = var10 - var23;
            if(var26 >= var24) {
               var4 += var6 + var9;
               var5 += var6 + var8;
               continue;
            }

            var24 -= var26;
         } else {
            var26 = var23 - var10;
            if(var26 >= var6) {
               var4 += var6 + var9;
               var5 += var6 + var8;
               continue;
            }

            var4 += var26;
            var25 = var6 - var26;
            var5 += var26;
         }

         var26 = 0;
         if(var25 < var24) {
            var24 = var25;
         } else {
            var26 = var25 - var24;
         }

         for(int var27 = 0; var27 < var24; ++var27) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         var4 += var26 + var9;
         var5 += var26 + var8;
      }

   }

   static final void a(byte var0, Object[] var1) {
      if(var0 > -79) {
         c = (int[])null;
      }

      ++e;
      if(var1 != null && 87 == var1.length) {
         if(((boolean[])((boolean[])var1[63]))[16]) {
            D3DLIGHT.SetAmbient(((long[])((long[])var1[50]))[3], ((float[])((float[])var1[0]))[11] * ((float[])((float[])var1[0]))[17], ((float[])((float[])var1[0]))[2] * ((float[])((float[])var1[0]))[17], ((float[])((float[])var1[0]))[17] * ((float[])((float[])var1[0]))[3], 0.0F);
            ((boolean[])((boolean[])var1[63]))[21] = false;
         }

      } else if(var1 != null && -92 == ~var1.length) {
         ((float[])((float[])var1[76]))[2] = ((float[])((float[])var1[0]))[3] * ((float[])((float[])var1[0]))[17];
         ((float[])((float[])var1[76]))[0] = ((float[])((float[])var1[0]))[11] * ((float[])((float[])var1[0]))[17];
         ((float[])((float[])var1[76]))[3] = 1.0F;
         ((float[])((float[])var1[76]))[1] = ((float[])((float[])var1[0]))[2] * ((float[])((float[])var1[0]))[17];
         OpenGL.glLightModelfv(2899, (float[])((float[])var1[76]), 0);
      } else {
         throw new IllegalStateException();
      }
   }

   static final int a(Object[] var0, int var1) {
      ((int[])((int[])var0[1]))[0] += 2;
      ++a;
      int var2 = (255 & ((byte[])((byte[])var0[2]))[-2 + ((int[])((int[])var0[1]))[0]]) + (((byte[])((byte[])var0[2]))[-1 + ((int[])((int[])var0[1]))[0]] << 8 & '\uff00');
      if(var2 > 32767) {
         var2 -= 65536;
      }

      if(var1 != -16403) {
         b((Object[])((Object[])var0[2]), (byte[])((byte[])((Object[])((Object[])var0[10]))[1]), (int[])null, 57, 55, -97, ((int[])((int[])var0[1]))[3], ((int[])((int[])var0[3]))[1], -63, ((int[])((int[])var0[0]))[7]);
      }

      return var2;
   }

   private static final void a(Object[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = var3 >>> 24;
      if(var0 == null || var0.length != 2 && var0.length != 6) {
         int var11 = 255 - var10;

         for(int var12 = -var7; var12 < 0; ++var12) {
            for(int var13 = -var6; var13 < 0; ++var13) {
               if(var1[var4++] != 0) {
                  int var14 = ((var3 & 16711935) * var10 & -16711936) + ((var3 & '\uff00') * var10 & 16711680) >> 8;
                  int var15 = var2[var5];
                  var2[var5++] = (((var15 & 16711935) * var11 & -16711936) + ((var15 & '\uff00') * var11 & 16711680) >> 8) + var14;
               } else {
                  ++var5;
               }
            }

            var5 += var8;
            if(var0 != null && var0.length == 3) {
               a((Object[])null, 's', -120, -24, -58, true);
            }

            var4 += var9;
         }

      }
   }

   static final void a(Object[] var0, char var1, int var2, int var3, int var4, boolean var5) {
      if(((Object[])((Object[])var0[6]))[7] != null) {
         var2 += ((int[])((int[])var0[2]))[var1];
         var3 += ((int[])((int[])var0[4]))[var1];
         int var6 = ((int[])((int[])var0[0]))[var1];
         int var7 = ((int[])((int[])var0[3]))[var1];
         int var8 = ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[4];
         int var9 = var2 + var3 * var8;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[16]) {
            var13 = ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[16] - var3;
            var7 -= var13;
            var3 = ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[16];
            var12 += var13 * var6;
            var9 += var13 * var8;
         }

         if(var3 + var7 > ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[1]) {
            var7 -= var3 + var7 - ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[1];
         }

         if(var2 < ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[7]) {
            var13 = ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[7] - var2;
            var6 -= var13;
            var2 = ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[7];
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var2 + var6 > ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[19]) {
            var13 = var2 + var6 - ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[19];
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            if((var4 & -16777216) == -16777216) {
               b(var0, ((byte[][])((byte[][])var0[1]))[var1], (int[])((int[])((Object[])((Object[])var0[6]))[7]), var4, var12, var9, var6, var7, var10, var11);
            } else if((var4 & -16777216) != 0) {
               a(var0, ((byte[][])((byte[][])var0[1]))[var1], (int[])((int[])((Object[])((Object[])var0[6]))[7]), var4, var12, var9, var6, var7, var10, var11);
            }

         }
      }
   }

}
