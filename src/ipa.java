import jaggl.OpenGL;

final class ipa {

   static int f;
   static int f_i;
   static int b;
   static int c;
   static int g;
   static int e;
   static int a;
   static int d = 2;
   static int h;


   static final int b(Object[] var0, byte var1) {
      ++f;
      if(var1 != 124) {
         d = -109;
      }

      int var2 = tg.a(var0, 8553, 2);
      int var3;
      if(0 == var2) {
         var3 = 0;
      } else if(1 == var2) {
         var3 = tg.a(var0, 8553, 5);
      } else if(var2 != 2) {
         var3 = tg.a(var0, 8553, 11);
      } else {
         var3 = tg.a(var0, var1 + 8429, 8);
      }

      return var3;
   }

   static final Object[] a(int var0, Object[] var1, int var2, boolean var3, int var4, byte[] var5, int var6, int var7, Object[] var8) {
      ++a;
      if(var6 != 2) {
         return (Object[])((Object[])((Object[])((Object[])var1[22]))[2]);
      } else {
         Object[] var10;
         int var18;
         if(!((boolean[])((boolean[])var8[63]))[23] && (!ol.a((byte)106, var2) || !ol.a((byte)30, var4))) {
            if(((boolean[])((boolean[])var8[63]))[27]) {
               var10 = new Object[8];
               wma.a(var10, 5);
               bca.a((byte)113, vk.f, var1, var4 * var2, var10, var8, '\u84f5', false);
               ((int[])((int[])var10[1]))[4] = var2;
               ((int[])((int[])var10[1]))[3] = var4;
               ah.a((Object[])((Object[])var10[5]), var10, (byte)86);
               OpenGL.glPixelStorei(3317, 1);
               OpenGL.glPixelStorei(3314, var0);
               OpenGL.glTexImage2Dub(((int[])((int[])var10[1]))[2], 0, vb.a(-106, (Object[])((Object[])var10[3]), (Object[])((Object[])var10[6])), var2, var4, 0, fv.a((Object[])((Object[])var10[6]), (int)0), 5121, var5, var7);
               OpenGL.glPixelStorei(3314, 0);
               OpenGL.glPixelStorei(3317, 4);
               if(var8 != null && 4 == var8.length) {
                  ja.a(1, 112, (Object[])null, (Object[])null, -88, (Object[])null);
               }

               return var10;
            } else {
               Object[] var9 = new Object[11];
               Object[] var30 = vk.f;
               var18 = fda.a(var2, (byte)81);
               if(null != var30 && (18 == var30.length || 3 == var30.length)) {
                  return null;
               } else {
                  Object[] var31 = om.a(118, var1, var9, var18, var8, fda.a(var4, (byte)81), var30);
                  ow.a(var31, var5, var1, 0, var7, 1, var2, var0, 0, var4);
                  return var31;
               }
            }
         } else {
            var10 = new Object[11];
            esa.a(var10, 1);
            bca.a((byte)121, vk.f, var1, var4 * var2, var10, var8, 3553, var3);
            ((int[])((int[])var10[1]))[4] = var2;
            ((int[])((int[])var10[1]))[3] = var4;
            ah.a((Object[])((Object[])var10[5]), var10, (byte)87);
            OpenGL.glPixelStorei(3317, 1);
            if(var3 && 0 == var0 && 0 == var7) {
               int var11 = ((int[])((int[])var10[1]))[2];
               int var12 = var2;
               int var13 = var4;
               if(0 < var2 && !ol.a((byte)114, var2)) {
                  throw new IllegalArgumentException("");
               }

               if(var4 > 0 && !ol.a((byte)-45, var4)) {
                  throw new IllegalArgumentException("");
               }

               int var14 = ((int[])((int[])((Object[])((Object[])var10[6]))[0]))[0];
               int var15 = 0;
               int var16 = var2 >= var4?var4:var2;
               int var17 = var2 >> 1;
               var18 = var4 >> 1;
               byte[] var19 = var5;
               byte[] var20 = new byte[var14 * var17 * var18];
               if(var8 != null && (var8.length == 2 || var8.length == 5 || var8.length == 11)) {
                  return null;
               }

               while(true) {
                  OpenGL.glTexImage2Dub(var11, var15, vb.a(-95, (Object[])((Object[])var10[3]), (Object[])((Object[])var10[6])), var12, var13, 0, fv.a((Object[])((Object[])var10[6]), var6 - 2), 5121, var19, 0);
                  if(1 >= var16) {
                     break;
                  }

                  int var23 = var12 * var14;
                  if(var10 != null && (-2 == ~var10.length || -6 == ~var10.length)) {
                     return null;
                  }

                  for(int var24 = 0; var14 > var24; ++var24) {
                     int var25 = var24;
                     if(null != var1 && (var1.length == 23 || -10 == ~var1.length)) {
                        return null;
                     }

                     int var26 = var24;
                     int var27 = var23 + var24;

                     for(int var28 = 0; var28 < var18; ++var28) {
                        for(int var29 = 0; var17 > var29; ++var29) {
                           byte var22 = var19[var26];
                           var26 += var14;
                           int var32 = var22 + var19[var26];
                           var26 += var14;
                           if(null != var8 && -2 == ~var8.length) {
                              kb.a((byte)125, (Object[])null, false);
                           }

                           var32 += var19[var27];
                           var27 += var14;
                           var32 += var19[var27];
                           var27 += var14;
                           var20[var25] = (byte)(var32 >> 2);
                           var25 += var14;
                        }

                        var27 += var23;
                        var26 += var23;
                        if(var1 != null && var1.length == 6 && var1[1].equals(Integer.valueOf(2))) {
                           return null;
                        }
                     }
                  }

                  byte[] var21 = var20;
                  var20 = var19;
                  var12 = var17;
                  var19 = var21;
                  var13 = var18;
                  var16 >>= 1;
                  var17 >>= 1;
                  var18 >>= 1;
                  ++var15;
               }
            } else {
               OpenGL.glPixelStorei(3314, var0);
               if(wb.c == var10[6]) {
                  OpenGL.glCompressedTexImage2Dub(((int[])((int[])var10[1]))[2], 0, '\u83f1', var2, var4, 0, var4 * var2 / 2, var5, var7);
               } else if(var10[6] == client.Kb) {
                  OpenGL.glCompressedTexImage2Dub(((int[])((int[])var10[1]))[2], 0, '\u83f3', var2, var4, 0, var4 * var2, var5, var7);
               } else {
                  OpenGL.glTexImage2Dub(((int[])((int[])var10[1]))[2], 0, vb.a(-113, (Object[])((Object[])var10[3]), (Object[])((Object[])var10[6])), var2, var4, 0, fv.a((Object[])((Object[])var10[6]), (int)0), 5121, var5, var7);
               }

               OpenGL.glPixelStorei(3314, 0);
            }

            OpenGL.glPixelStorei(3317, 4);
            return var10;
         }
      }
   }

   static final boolean a(int var0, Object[] var1) {
      ++f_i;
      Object[] var2 = (Object[])((Object[])woa.a(var0 ^ 4, var1)[var0]);
      return ju.e[vt.d + ((int)((float[])((float[])var2[1]))[2] >> qqa.e) + -bd.h][-oaa.a + ((int)((float[])((float[])var2[1]))[1] >> qqa.e) + vt.d];
   }

   static final byte a(Object[] var0, int var1) {
      ++h;
      if(var1 >= -73) {
         a((byte)-51, (Object[])null, (ta)((Object[])((Object[])var0[2]))[5], 10);
      }

      byte[] var10000 = (byte[])((byte[])var0[2]);
      int[] var10001 = (int[])((int[])var0[1]);
      int var10004 = ((int[])((int[])var0[1]))[0];
      var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      return var10000[var10004];
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 != -50) {
         b((Object[])((Object[])var0[10]), ((int[])((int[])var0[3]))[10]);
      }

      ++c;
      if(var0[1] == null) {
         var0[1] = new int[6];
      }

   }

   static final void c(Object[] var0, byte var1) {
      int var2 = 124 % ((-41 - var1) / 46);
      ++b;
      if(null == var0[1]) {
         var0[1] = new boolean[1];
      }

   }

   static final ka a(byte var0, Object[] var1, ta var2, int var3) {
      if(var0 != -125) {
         return (ka)null;
      } else {
         ++g;
         Object[] var4 = qda.a(((int[])((int[])var1[12]))[3], (byte)-64, dfa.a);
         return rha.a((byte)2, (Object[])((Object[])var1[19]), var3, 91, var4, var2);
      }
   }

   static final mja b(Object[] var0, int var1) {
      int var2 = -5 % ((-27 - var1) / 49);
      ++e;
      return new mja(var0);
   }

}
