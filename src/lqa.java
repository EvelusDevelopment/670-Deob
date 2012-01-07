
final class lqa {

   static int f;
   static int a;
   static Object[] e = ho.a(2, 60, new Object[1], true);
   static int d;
   static int g;
   static int b;
   static int[] c = new int[501];


   static final void a(Object[] var0, boolean var1) {
      ((int[])((int[])var0[1]))[1] = 4096;
      if(!var1) {
         ++g;
      }
   }

   static final boolean a(byte var0, Object[] var1) throws oqa {
      ++b;
      Object[] var3 = (Object[])((Object[])var1[39]);
      boolean var2;
      if(!((boolean[])((boolean[])((Object[])((Object[])var3[5]))[63]))[17]) {
         var2 = false;
      } else {
         if(var3[2] == null) {
            byte[] var4;
            if(null == lt.a) {
               var4 = ci.a(4.0F, 16.0F, kla.a(419684, new Object[1], false), 8, 0.6F, 0.5F, 4.0F, 16, var0 - 115, 128, 128);
               lt.a = fja.a(-137, var4, false);
            }

            if(null != var3 && var3.length == 22 && var3[1].equals(Boolean.valueOf(false))) {
               dja.a(var0 ^ 117, (Object[])null);
            }

            var4 = ad.a(false, lt.a, -106);
            byte[] var5 = new byte[4 * var4.length];
            int var6 = 0;

            for(int var7 = 0; var7 < 16; ++var7) {
               int var8 = var7 * 128 * 128;
               if(null != var3 && var3.length == 10 && var3[4].equals(Integer.valueOf(0))) {
                  return false;
               }

               int var9 = var8;

               for(int var10 = 0; 128 > var10; ++var10) {
                  int var11 = var9 + var10 * 128;
                  int var12 = (127 & -1 + var10) * 128 + var9;
                  int var13 = (var10 + 1 & 127) * 128 + var9;

                  for(int var14 = 0; 128 > var14; ++var14) {
                     float var15 = (float)((255 & var4[var12 + var14]) - (var4[var13 + var14] & 255));
                     float var16 = (float)(-(var4[var11 + (127 & var14 + 1)] & 255) + (var4[(-1 + var14 & 127) + var11] & 255));
                     float var17 = (float)(128.0D / Math.sqrt((double)(var15 * var15 + var16 * var16 + 16384.0F)));
                     var5[var6++] = (byte)((int)(var16 * var17 + 127.0F));
                     var5[var6++] = (byte)((int)(127.0F + var17 * 128.0F));
                     var5[var6++] = (byte)((int)(var17 * var15 + 127.0F));
                     var5[var6++] = var4[var8++];
                  }
               }
            }

            var3[2] = jga.a(128, var5, 128, 16, ah.f, var0 + 10090, (Object[])((Object[])var3[5]), true);
         }

         var2 = var3[2] != null;
      }

      if(!var2) {
         return false;
      } else {
         var1[28] = kt.a(-18810, (Object[])((Object[])var1[17]), "NormalSampler");
         var1[46] = kt.a(-18810, (Object[])((Object[])var1[17]), "EnvMapSampler");
         var1[45] = kt.a(-18810, (Object[])((Object[])var1[17]), "WVPMatrix");
         var1[33] = kt.a(-18810, (Object[])((Object[])var1[17]), "TexCoordMatrix");
         var1[41] = kt.a(-18810, (Object[])((Object[])var1[17]), "EyePosAndTime");
         var1[22] = kt.a(var0 - 18926, (Object[])((Object[])var1[17]), "SunDirectionAndExponent");
         var1[43] = kt.a(-18810, (Object[])((Object[])var1[17]), "SunColourAndWaveExponent");
         var1[27] = kt.a(-18810, (Object[])((Object[])var1[17]), "WaveIntensityAndBreakWaterDepthAndOffset");
         var1[38] = kt.a(-18810, (Object[])((Object[])var1[17]), "HeightFogPlane");
         var1[24] = kt.a(-18810, (Object[])((Object[])var1[17]), "HeightFogColour");
         var1[23] = kt.a(-18810, (Object[])((Object[])var1[17]), "DistanceFogPlane");
         if(var0 != 116) {
            return false;
         } else {
            var1[42] = kt.a(var0 ^ -18702, (Object[])((Object[])var1[17]), "DistanceFogColour");
            Object[] var18 = lca.a((Object[])((Object[])var1[17]), (byte)117, ((boolean[])((boolean[])var1[44]))[0]?"EnvMappedSea":"EnvMappedWater");
            if(var18 != null && (-2 == ~var18.length || -12 == ~var18.length)) {
               dja.a(var0 ^ 117, (Object[])null);
            }

            an.a(var18, (Object[])((Object[])var1[17]), true);
            return true;
         }
      }
   }

   static final String a(String var0, int var1) {
      ++f;
      StringBuffer var2 = new StringBuffer();
      int var3 = var0.length();
      if(var1 != -71) {
         e = (Object[])null;
      }

      for(int var4 = 0; var4 < var3; ++var4) {
         char var5 = var0.charAt(var4);
         if(37 == var5 && ~var3 < ~(2 + var4)) {
            var5 = var0.charAt(var4 + 1);
            boolean var6 = false;
            int var8;
            if(var5 >= 48 && 57 >= var5) {
               var8 = -48 + var5;
            } else if(var5 >= 97 && var5 <= 102) {
               var8 = var5 - 87;
            } else {
               if(65 > var5 || var5 > 70) {
                  var2.append('%');
                  continue;
               }

               var8 = -65 + var5 + 10;
            }

            var5 = var0.charAt(var4 + 2);
            var8 *= 16;
            if(48 <= var5 && var5 <= 57) {
               var8 += -48 + var5;
            } else if(var5 >= 97 && var5 <= 102) {
               var8 += -97 + var5 + 10;
            } else {
               if(65 > var5 || 70 < var5) {
                  var2.append('%');
                  continue;
               }

               var8 += -65 + 10 + var5;
            }

            var4 += 2;
            if(0 != var8 && et.a((byte)var8, (byte)71)) {
               var2.append(kf.a(true, (byte)var8));
            }
         } else if(var5 == 43) {
            var2.append(' ');
         } else {
            var2.append(var5);
         }
      }

      return var2.toString();
   }

   static final int a(Object[] var0, int var1, int var2) {
      if(null != var0[0]) {
         var1 = (int)((long)var1 * (long)((int[])((int[])var0[1]))[1] / (long)((int[])((int[])var0[1]))[0]) + 6;
      }

      if(var2 != 5) {
         return -65;
      } else {
         ++d;
         return var1;
      }
   }

}
