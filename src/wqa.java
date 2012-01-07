import jaggl.OpenGL;

final class wqa {

   static int b;
   static int a = 1406;
   static int c;
   static int e;
   static int d;


   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, Object[] var3, boolean var4, int var5, int var6, int var7, boolean var8, int var9, byte[] var10, Object[] var11) {
      ++e;
      vt.a(var0, var5 ^ -118);
      if(null != var11 && var11.length == 10) {
         return null;
      } else {
         np.a(var5 + 0, var1, var11, var6, var0, var2, var8, var9 * var7);
         ((int[])((int[])var0[1]))[3] = var9;
         ((int[])((int[])var0[1]))[4] = var7;
         int var13;
         int var14;
         int var15;
         int var16;
         if(var4) {
            byte[] var12 = new byte[var10.length];
            if(var0 != null && -18 == ~var0.length && var0[7].equals(Integer.valueOf(1))) {
               return null;
            }

            for(var13 = 0; var7 > var13; ++var13) {
               var14 = var9 * var13;
               var15 = var9 * (var7 + (-var13 - 1));
               if(null != var11 && var11.length == 24) {
                  return new Object[0][];
               }

               for(var16 = 0; var16 < var9; ++var16) {
                  var12[var14++] = var10[var15++];
               }
            }

            var10 = var12;
         }

         moa.a((byte)126, var0, (Object[])((Object[])var0[4]));
         OpenGL.glPixelStorei(3317, var5);
         if(var8 && ((int[])((int[])var0[1]))[2] != '\u84f5') {
            int var31 = bu.a(88, (Object[])((Object[])var0[5]), (Object[])((Object[])var0[2]));
            var13 = var9;
            var14 = var7;
            if(0 < var9 && !ol.a((byte)-42, var9)) {
               throw new IllegalArgumentException("");
            }

            if(var7 > 0 && !ol.a((byte)111, var7)) {
               throw new IllegalArgumentException("");
            }

            if(null != var2 && var2.length == 2) {
               return null;
            }

            var15 = ((int[])((int[])var3[0]))[0];
            var16 = 0;
            int var17 = var7 <= var9?var7:var9;
            int var18 = var9 >> 1;
            int var19 = var7 >> 1;
            byte[] var20 = var10;
            byte[] var21 = new byte[var15 * var19 * var18];

            while(true) {
               OpenGL.glTexImage2Dub(var6, var16, var31, var13, var14, 0, rha.b(8, var3), 5121, var20, 0);
               if(var17 <= 1) {
                  nb.a(false, true, var0);
                  break;
               }

               int var24 = var13 * var15;
               if(null != var2 && var2.length == 4 && var2[0].equals(Boolean.valueOf(false)) && var2[0].equals(Boolean.valueOf(false))) {
                  return null;
               }

               for(int var25 = 0; var15 > var25; ++var25) {
                  int var26 = var25;
                  if(var11 != null && 21 == var11.length && var11[2].equals(Integer.valueOf(1))) {
                     return null;
                  }

                  int var27 = var25;
                  int var28 = var24 + var25;

                  for(int var29 = 0; var19 > var29; ++var29) {
                     for(int var30 = 0; var30 < var18; ++var30) {
                        byte var23 = var20[var27];
                        var27 += var15;
                        int var32 = var23 + var20[var27];
                        var27 += var15;
                        var32 += var20[var28];
                        if(var0 != null && -17 == ~var0.length) {
                           return null;
                        }

                        var28 += var15;
                        var32 += var20[var28];
                        var21[var26] = (byte)(var32 >> 2);
                        var28 += var15;
                        var26 += var15;
                     }

                     var27 += var24;
                     var28 += var24;
                  }
               }

               byte[] var22 = var21;
               var21 = var20;
               var13 = var18;
               var14 = var19;
               var20 = var22;
               var18 >>= 1;
               var19 >>= 1;
               var17 >>= 1;
               ++var16;
            }
         } else {
            OpenGL.glTexImage2Dub(((int[])((int[])var0[1]))[2], 0, bu.a(124, (Object[])((Object[])var0[5]), (Object[])((Object[])var0[2])), ((int[])((int[])var0[1]))[3], ((int[])((int[])var0[1]))[4], 0, rha.b(var5 ^ 9, var3), 5121, var10, 0);
            nb.a(false, false, var0);
         }

         OpenGL.glPixelStorei(3317, 4);
         gg.a((byte)-107, var0, true);
         return var0;
      }
   }

   static final void a(Object[] var0, int var1, int var2) {
      if(var1 <= -56) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', var2, '\u8d41', ((int[])((int[])var0[1]))[1]);
         ++d;
      }
   }

   static final void a(Object[] var0, byte var1, int var2) throws Exception {
      if(var1 == -80) {
         ++b;
      }
   }

}
