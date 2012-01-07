import jaggl.OpenGL;

final class dq {

   static int c;
   static int g;
   static int f = -1;
   static byte[][] baS5000cache = new byte[250][];
   static Object[] a = sd.a(new Object[1], 5, (byte)112);
   static int f_i;
   static int e;
   static int h = 2;
   static Object[] d = ho.a(3, 34, new Object[1], true);


   static final Object[] a(int var0, int var1, int var2, Object[] var3) {
      try {
         ++g;
         if(var0 != 4) {
            f = ((int[])((int[])a[0]))[0];
         }

         if(var3 != null && (-7 == ~var3.length && var3[1].equals(Integer.valueOf(2)) || var3.length == 3)) {
            pna.j = null;
         }

         rw var4;
         Object[] var13 = null != (var4 = (rw)pm.a((long)var2, (Object[])((Object[])var3[2]), false))?var4.y:null;
         if(null != var13 && 0 == var1 && !((boolean[])((boolean[])var13[0]))[1] && ((boolean[])((boolean[])var13[0]))[0]) {
            ((lm)(null == var13?null:var13[1])).a((byte)95);
            var13 = null;
         }

         Object[] var16;
         if(null == var13) {
            if(0 == var1) {
               if(null != var3[7] && 0 != ~((byte[])((byte[])var3[12]))[var2]) {
                  var13 = dd.a(true, (Object[])((Object[])var3[7]), (Object[])((Object[])var3[10]), var2);
               } else {
                  if(rs.a(var0 ^ 8, (Object[])((Object[])var3[6]))) {
                     return null;
                  }

                  var13 = vla.a(var2, true, ((int[])((int[])var3[1]))[3], (Object[])((Object[])var3[6]), -101, (byte)2);
               }
            } else if(1 == var1) {
               if(var3[7] == null) {
                  throw new RuntimeException();
               }

               Object[] var15 = (Object[])((Object[])var3[10]);
               var16 = (Object[])((Object[])var3[7]);
               Object[] var18 = daa.a(24, new Object[6]);
               ((boolean[])((boolean[])var18[0]))[1] = false;
               ((tha)(var18 == null?null:var18[1])).m = (long)var2;
               var18[2] = var16;
               ((int[])((int[])var18[4]))[0] = 3;
               lp.a(var15, var18, -5251);
               var13 = var18;
            } else {
               if(2 != var1) {
                  throw new RuntimeException();
               }

               if(null == var3[7]) {
                  throw new RuntimeException();
               }

               if(((byte[])((byte[])var3[12]))[var2] != -1) {
                  throw new RuntimeException();
               }

               if(eh.a((Object[])((Object[])var3[6]), (byte)-127)) {
                  return null;
               }

               var13 = vla.a(var2, false, ((int[])((int[])var3[1]))[3], (Object[])((Object[])var3[6]), var0 - 118, (byte)2);
            }

            di.a((Object[])((Object[])var3[2]), true, (lm)(null != var13?var13[1]:null), (long)var2);
         }

         if(((boolean[])((boolean[])var13[0]))[0]) {
            return null;
         } else {
            byte[] var14 = sh.a(var13, (byte)84);
            byte[] var17;
            byte[] var23;
            int var22;
            int var25;
            if(null != var13 && 6 == var13.length) {
               try {
                  if(var14 != null && 2 < var14.length) {
                     pna.j.reset();
                     pna.j.update(var14, 0, -2 + var14.length);
                     var22 = (int)pna.j.getValue();
                     if(~var22 != ~((int[])((int[])((Object[])((Object[])var3[0]))[9]))[var2]) {
                        throw new RuntimeException();
                     } else {
                        if(((Object[])((Object[])var3[0]))[0] != null && null != ((byte[][])((byte[][])((Object[])((Object[])var3[0]))[0]))[var2]) {
                           var23 = ((byte[][])((byte[][])((Object[])((Object[])var3[0]))[0]))[var2];
                           var17 = vja.a(85, -2 + var14.length, var14, 0);

                           for(var25 = 0; var25 < 64; ++var25) {
                              if(~var23[var25] != ~var17[var25]) {
                                 throw new RuntimeException();
                              }
                           }

                           if(null != var13 && 9 == var13.length) {
                              wi.a(-91, (Object[])null);
                           }
                        }

                        if(var13 != null && 17 == var13.length && var13[15].equals(Integer.valueOf(0))) {
                           pna.j = null;
                        }

                        int var24 = (255 & var14[var14.length - 1]) + (var14[var14.length - 2] << 8 & '\uff00');
                        if(~var24 == ~('\uffff' & ((int[])((int[])((Object[])((Object[])var3[0]))[11]))[var2])) {
                           if(((byte[])((byte[])var3[12]))[var2] != 1) {
                              if(((byte[])((byte[])var3[12]))[var2] == 0) {
                                 ;
                              }

                              ++((int[])((int[])var3[1]))[0];
                              ((byte[])((byte[])var3[12]))[var2] = 1;
                           }

                           if(!((boolean[])((boolean[])var13[0]))[1]) {
                              ((lm)(null == var13?null:var13[1])).a((byte)73);
                           }

                           return var13;
                        } else {
                           throw new RuntimeException();
                        }
                     }
                  } else {
                     throw new RuntimeException();
                  }
               } catch (Exception var19) {
                  ((byte[])((byte[])var3[12]))[var2] = -1;
                  ((lm)(null == var13?null:var13[1])).a((byte)21);
                  if(((boolean[])((boolean[])var13[0]))[1] && !rs.a(12, (Object[])((Object[])var3[6]))) {
                     var13 = vla.a(var2, true, ((int[])((int[])var3[1]))[3], (Object[])((Object[])var3[6]), -114, (byte)2);
                     di.a((Object[])((Object[])var3[2]), true, (lm)(var13 != null?var13[1]:null), (long)var2);
                  }

                  return null;
               }
            } else {
               try {
                  if(var14 == null || -3 <= ~var14.length) {
                     throw new RuntimeException();
                  }

                  pna.j.reset();
                  pna.j.update(var14, 0, -2 + var14.length);
                  var22 = (int)pna.j.getValue();
                  if(var22 != ((int[])((int[])((Object[])((Object[])var3[0]))[9]))[var2]) {
                     throw new RuntimeException();
                  }

                  if(null != ((Object[])((Object[])var3[0]))[0] && null != ((byte[][])((byte[][])((Object[])((Object[])var3[0]))[0]))[var2]) {
                     if(null != var13 && (var13.length == 14 || -2 == ~var13.length)) {
                        pna.j = null;
                     }

                     var23 = ((byte[][])((byte[][])((Object[])((Object[])var3[0]))[0]))[var2];
                     var17 = vja.a(var0 ^ 117, var14.length - 2, var14, 0);

                     for(var25 = 0; 64 > var25; ++var25) {
                        if(~var17[var25] != ~var23[var25]) {
                           throw new RuntimeException();
                        }
                     }
                  }

                  ((int[])((int[])((Object[])((Object[])var3[6]))[1]))[0] = 0;
                  ((int[])((int[])((Object[])((Object[])var3[6]))[1]))[1] = 0;
               } catch (RuntimeException var20) {
                  var16 = (Object[])((Object[])var3[6]);
                  if(var16 == null) {
                     throw new IllegalStateException();
                  }

                  dg.a(var16, (byte)-54);
                  ((lm)(null != var13?var13[1]:null)).a((byte)56);
                  if(((boolean[])((boolean[])var13[0]))[1] && !rs.a(var0 ^ 8, (Object[])((Object[])var3[6]))) {
                     var13 = vla.a(var2, true, ((int[])((int[])var3[1]))[3], (Object[])((Object[])var3[6]), var0 ^ -127, (byte)2);
                     di.a((Object[])((Object[])var3[2]), true, (lm)(var13 == null?null:var13[1]), (long)var2);
                  }

                  return null;
               }

               var14[var14.length - 2] = (byte)(((int[])((int[])((Object[])((Object[])var3[0]))[11]))[var2] >>> 8);
               var14[-1 + var14.length] = (byte)((int[])((int[])((Object[])((Object[])var3[0]))[11]))[var2];
               if(null != var3[7]) {
                  ima.a(-10426, var14, (Object[])((Object[])var3[7]), (Object[])((Object[])var3[10]), var2);
                  if(-2 != ~((byte[])((byte[])var3[12]))[var2]) {
                     ++((int[])((int[])var3[1]))[0];
                     ((byte[])((byte[])var3[12]))[var2] = 1;
                  }
               }

               if(!((boolean[])((boolean[])var13[0]))[1]) {
                  ((lm)(null != var13?var13[1]:null)).a((byte)118);
               }

               return var13;
            }
         }
      } catch (RuntimeException var21) {
         throw vt.a(var21, "dq.B(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   static final Object[] a(Object[] var0, int var1, int var2, int var3, Object[] var4, int var5) {
      if(var5 != 3) {
         return (Object[])((Object[])var4[0]);
      } else {
         ++c;
         wta.a(var4, (byte)-89);
         ((short[])((short[])var4[0]))[0] = (short)var1;
         ((byte[])((byte[])var4[1]))[1] = (byte)var3;
         var4[2] = var0;
         ((byte[])((byte[])var4[1]))[0] = (byte)var2;
         return var4;
      }
   }

   static final void a(int var0, Object[] var1) {
      bba.a((Object[])((Object[])var1[2]), -19425);
      ++e;
      int var2 = -77 % ((var0 + 41) / 33);
      ona.a((Object[])((Object[])var1[0]), -104);
      ((int[])((int[])var1[1]))[0] = ((int[])((int[])var1[1]))[1];
   }

   static final Object[] a(float[] var0, Object[] var1, int var2, byte var3, Object[] var4, int var5, boolean var6, int var7, int var8) {
      ++f_i;
      if(var3 <= 6) {
         h = 87;
      }

      Object[] var10;
      int var18;
      if(!((boolean[])((boolean[])var1[63]))[23] && (!ol.a((byte)-74, var8) || !ol.a((byte)89, var7))) {
         if(((boolean[])((boolean[])var1[63]))[27]) {
            var10 = new Object[8];
            wma.a(var10, 5);
            bca.a((byte)110, vk.h, var4, var7 * var8, var10, var1, '\u84f5', false);
            ((int[])((int[])var10[1]))[3] = var7;
            ((int[])((int[])var10[1]))[4] = var8;
            ah.a((Object[])((Object[])var10[5]), var10, (byte)113);
            OpenGL.glPixelStorei(3314, var5);
            OpenGL.glTexImage2Df(((int[])((int[])var10[1]))[2], 0, vb.a(-123, (Object[])((Object[])var10[3]), (Object[])((Object[])var10[6])), var8, var7, 0, fv.a((Object[])((Object[])var10[6]), (int)0), 5126, var0, 4 * var2);
            OpenGL.glPixelStorei(3314, 0);
            return var10;
         } else {
            Object[] var9 = new Object[11];
            Object[] var30 = vk.h;
            if(var1 != null && var1.length == 9 && var1[6].equals(Integer.valueOf(1)) && var1[6].equals(Integer.valueOf(2))) {
               ja.a(1, 14, (Object[])null, (Object[])null, -67, (Object[])null);
            }

            var18 = fda.a(var8, (byte)81);
            Object[] var31 = om.a(113, var4, var9, var18, var1, fda.a(var7, (byte)81), var30);
            ah.a((Object[])((Object[])var31[5]), var31, (byte)90);
            OpenGL.glPixelStorei(3314, var5);
            OpenGL.glTexSubImage2Df(((int[])((int[])var31[1]))[2], 0, 0, 0, var8, var7, fv.a(var4, (int)0), 5121, var0, var2);
            OpenGL.glPixelStorei(3314, 0);
            return var31;
         }
      } else {
         var10 = new Object[11];
         esa.a(var10, 1);
         bca.a((byte)103, vk.h, var4, var7 * var8, var10, var1, 3553, var6);
         ((int[])((int[])var10[1]))[3] = var7;
         ((int[])((int[])var10[1]))[4] = var8;
         ah.a((Object[])((Object[])var10[5]), var10, (byte)112);
         if(var6 && 0 == var5 && 0 == var2) {
            int var11 = ((int[])((int[])var10[1]))[2];
            int var12 = var8;
            int var13 = var7;
            if(var8 > 0 && !ol.a((byte)126, var8)) {
               throw new IllegalArgumentException("");
            }

            if(0 < var7 && !ol.a((byte)-85, var7)) {
               throw new IllegalArgumentException("");
            }

            int var14 = ((int[])((int[])((Object[])((Object[])var10[6]))[0]))[0];
            int var15 = 0;
            int var16 = var8 < var7?var8:var7;
            int var17 = var8 >> 1;
            var18 = var7 >> 1;
            float[] var19 = var0;
            float[] var20 = new float[var14 * var17 * var18];

            while(true) {
               OpenGL.glTexImage2Df(var11, var15, vb.a(-120, (Object[])((Object[])var10[3]), (Object[])((Object[])var10[6])), var12, var13, 0, fv.a((Object[])((Object[])var10[6]), (int)0), 5126, var19, 0);
               if(1 >= var16) {
                  break;
               }

               int var23 = var12 * var14;

               for(int var24 = 0; var14 > var24; ++var24) {
                  int var25 = var24;
                  int var26 = var24;
                  if(null != var1 && 7 == var1.length && var1[4].equals(Integer.valueOf(0))) {
                     return null;
                  }

                  int var27 = var23 + var24;

                  for(int var28 = 0; var28 < var18; ++var28) {
                     for(int var29 = 0; var17 > var29; ++var29) {
                        float var22 = var19[var26];
                        var26 += var14;
                        var22 += var19[var26];
                        var26 += var14;
                        var22 += var19[var27];
                        var27 += var14;
                        var22 += var19[var27];
                        var20[var25] = var22 * 0.25F;
                        var27 += var14;
                        if(null != var10 && var10.length == 28) {
                           taa.a(9, (String)null, (Object[])null);
                        }

                        var25 += var14;
                     }

                     var27 += var23;
                     var26 += var23;
                     if(null != var4 && var4.length == 12) {
                        return null;
                     }
                  }
               }

               float[] var21 = var20;
               var20 = var19;
               var19 = var21;
               if(var10 != null && -9 == ~var10.length) {
                  return null;
               }

               var13 = var18;
               var12 = var17;
               var18 >>= 1;
               var16 >>= 1;
               var17 >>= 1;
               ++var15;
            }
         } else {
            OpenGL.glPixelStorei(3314, var5);
            OpenGL.glTexImage2Df(((int[])((int[])var10[1]))[2], 0, vb.a(-97, (Object[])((Object[])var10[3]), (Object[])((Object[])var10[6])), var8, var7, 0, fv.a((Object[])((Object[])var10[6]), (int)0), 5126, var0, var2 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }

         return var10;
      }
   }

}
