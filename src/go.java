import jaggl.OpenGL;

final class go {

   static Object[] f = sl.a("13", 0, new Object[1], "13");
   static int a;
   static long d = 20000000L;
   static int c;
   static int e;
   static Object[] b = ho.a(8, 18, new Object[1], true);


   static final Object[] a(Object[] var0, byte var1, Object[] var2) {
      if(null == var2[5]) {
         var2[5] = new boolean[2];
      }

      ++c;
      hp.a(var0, var2, 27468);
      ((boolean[])((boolean[])var2[5]))[1] = false;
      if(((boolean[])((boolean[])var0[17]))[4]) {
         ((boolean[])((boolean[])var2[5]))[0] = -4 < ~((int[])((int[])var0[1]))[22];
         int var3 = ((boolean[])((boolean[])var2[5]))[0]?48:127;
         byte[][] var4 = new byte[6][4096];
         byte[][] var5 = new byte[6][4096];
         byte[][] var6 = new byte[6][4096];
         int var10 = 0;
         if(var0 != null && (-16 == ~var0.length && var0[4].equals(Integer.valueOf(2)) && var0[4].equals(Integer.valueOf(0)) || 11 == var0.length && var0[1].equals(Integer.valueOf(0)))) {
            return new Object[1][];
         }

         for(int var15 = 0; 64 > var15; ++var15) {
            if(null != var0 && 17 == var0.length) {
               return null;
            }

            for(int var16 = 0; 64 > var16; ++var16) {
               float var13 = -1.0F + 2.0F * (float)var15 / 64.0F;
               float var12 = (float)var16 * 2.0F / 64.0F - 1.0F;
               float var14 = (float)(1.0D / Math.sqrt((double)(1.0F + var12 * var12 + var13 * var13)));
               var12 *= var14;
               if(var0 != null && 32 == var0.length && var0[7].equals(Boolean.valueOf(false)) && var0[7].equals(Integer.valueOf(1))) {
                  return null;
               }

               var13 *= var14;

               for(int var17 = 0; var17 < 6; ++var17) {
                  float var11;
                  if(var17 != 0) {
                     if(1 == var17) {
                        var11 = var12;
                     } else if(2 != var17) {
                        if(var17 == 3) {
                           var11 = -var13;
                        } else if(4 == var17) {
                           var11 = -var14;
                        } else {
                           var11 = var14;
                        }
                     } else {
                        var11 = var13;
                     }
                  } else {
                     var11 = -var12;
                  }

                  int var7;
                  int var8;
                  int var9;
                  if(0.0F >= var11) {
                     var8 = 0;
                     var7 = 0;
                     var9 = 0;
                  } else {
                     var7 = (int)(Math.pow((double)var11, 96.0D) * (double)var3);
                     var8 = (int)((double)var3 * Math.pow((double)var11, 36.0D));
                     var9 = (int)(Math.pow((double)var11, 12.0D) * (double)var3);
                  }

                  var5[var17][var10] = (byte)var7;
                  var6[var17][var10] = (byte)var8;
                  var4[var17][var10] = (byte)var9;
               }

               ++var10;
            }
         }

         var2[3] = new Object[3][];
         ((Object[][])((Object[][])var2[3]))[0] = hla.a(false, var5, br.f, vk.f, (Object[])((Object[])var2[0]), new Object[6], (byte)-123, 64, br.f);
         ((Object[][])((Object[][])var2[3]))[1] = hla.a(false, var6, br.f, vk.f, (Object[])((Object[])var2[0]), new Object[6], (byte)-61, 64, br.f);
         ((Object[][])((Object[][])var2[3]))[2] = hla.a(false, var4, br.f, vk.f, (Object[])((Object[])var2[0]), new Object[6], (byte)-96, 64, br.f);
         var2[4] = qoa.a(2, new Object[1], 119, (Object[])((Object[])var2[0]));
         tia.a((Object[])((Object[])var2[4]), 0, -55);
         nha.a((Object[])((Object[])var2[0]), 18806, 1);
         OpenGL.glTexGeni(8192, 9472, '\u8511');
         OpenGL.glTexGeni(8193, 9472, '\u8511');
         OpenGL.glTexGeni(8194, 9472, '\u8511');
         OpenGL.glEnable(3168);
         OpenGL.glEnable(3169);
         OpenGL.glEnable(3170);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
         OpenGL.glMatrixMode(5888);
         if(!((boolean[])((boolean[])var2[5]))[0]) {
            el.a(8448, 30862, 7681, (Object[])((Object[])var2[0]));
            af.a(768, (Object[])((Object[])var2[0]), 30579, '\u8578', 0);
            nha.a((Object[])((Object[])var2[0]), 18806, 2);
            el.a(7681, 30862, 260, (Object[])((Object[])var2[0]));
            af.a(768, (Object[])((Object[])var2[0]), 30579, '\u8578', 0);
            af.a(770, (Object[])((Object[])var2[0]), 30579, '\u8578', 1);
            db.a(770, (Object[])((Object[])var2[0]), (byte)-68, 0, '\u8577');
         } else {
            el.a(7681, 30862, 260, (Object[])((Object[])var2[0]));
            af.a(770, (Object[])((Object[])var2[0]), 30579, 5890, 0);
            db.a(770, (Object[])((Object[])var2[0]), (byte)-68, 0, '\u8577');
         }

         nha.a((Object[])((Object[])var2[0]), 18806, 0);
         fta.a((byte)78, (Object[])((Object[])var2[4]));
         tia.a((Object[])((Object[])var2[4]), 1, -45);
         nha.a((Object[])((Object[])var2[0]), 18806, 1);
         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         OpenGL.glDisable(3170);
         if(null != var0 && (var0.length == 1 || 15 == var0.length && var0[8].equals(Boolean.valueOf(false)))) {
            return null;
         }

         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         if(((boolean[])((boolean[])var2[5]))[0]) {
            el.a(8448, 30862, 8448, (Object[])((Object[])var2[0]));
            af.a(768, (Object[])((Object[])var2[0]), 30579, 5890, 0);
            db.a(770, (Object[])((Object[])var2[0]), (byte)-68, 0, 5890);
         } else {
            el.a(8448, 30862, 8448, (Object[])((Object[])var2[0]));
            af.a(768, (Object[])((Object[])var2[0]), 30579, 5890, 0);
            nha.a((Object[])((Object[])var2[0]), 18806, 2);
            el.a(8448, 30862, 8448, (Object[])((Object[])var2[0]));
            af.a(768, (Object[])((Object[])var2[0]), 30579, 5890, 0);
            af.a(768, (Object[])((Object[])var2[0]), 30579, '\u8578', 1);
            db.a(770, (Object[])((Object[])var2[0]), (byte)-68, 0, 5890);
         }

         nha.a((Object[])((Object[])var2[0]), 18806, 0);
         fta.a((byte)95, (Object[])((Object[])var2[4]));
      }

      if(var1 > -77) {
         f = (Object[])null;
      }

      return var2;
   }

   static final int a(int var0, int var1, boolean var2, Object[] var3, Object[] var4) {
      ++e;
      int var5;
      int var6;
      if(1 != var1) {
         if(2 == var1) {
            return roa.a(dp.y, (byte)-84, (String)sma.a(1, var3)[0], (String)sma.a(1, var4)[0]);
         } else if(3 == var1) {
            return !((String)var4[1]).equals("-")?(((String)var3[1]).equals("-")?(!var2?-1:1):roa.a(dp.y, (byte)-66, (String)var3[1], (String)var4[1])):(((String)var3[1]).equals("-")?0:(!var2?1:-1));
         } else if(var0 > -40) {
            return -65;
         } else {
            boolean var7;
            if(4 != var1) {
               if(var1 != 5) {
                  boolean var9;
                  if(6 == var1) {
                     var9 = 0 != (4 & ((int[])((int[])var4[0]))[0]);
                     if(!var9) {
                        var7 = (4 & ((int[])((int[])var3[0]))[0]) != 0;
                        var5 = !var7?0:-1;
                     } else {
                        var7 = 0 != (4 & ((int[])((int[])var3[0]))[0]);
                        var5 = !var7?1:0;
                     }

                     return var5;
                  } else if(7 != var1) {
                     if(var1 != 8) {
                        return -((int[])((int[])var3[0]))[3] + ((int[])((int[])var4[0]))[3];
                     } else {
                        var5 = ((int[])((int[])var4[0]))[4];
                        var6 = ((int[])((int[])var3[0]))[4];
                        if(var2) {
                           if(1000 == var6) {
                              var6 = -1;
                           }

                           if(1000 == var5) {
                              var5 = -1;
                           }
                        } else {
                           if(-1 == var6) {
                              var6 = 1000;
                           }

                           if(-1 == var5) {
                              var5 = 1000;
                           }
                        }

                        return var5 + -var6;
                     }
                  } else {
                     var9 = 0 != (1 & ((int[])((int[])var4[0]))[0]);
                     if(var9) {
                        var7 = (((int[])((int[])var3[0]))[0] & 1) != 0;
                        var5 = var7?0:1;
                     } else {
                        var7 = (1 & ((int[])((int[])var3[0]))[0]) != 0;
                        var5 = !var7?0:-1;
                     }

                     return var5;
                  }
               } else {
                  return mm.a(65536, var4)?(!mm.a(65536, var3)?1:0):(mm.a(65536, var3)?-1:0);
               }
            } else {
               boolean var8 = 0 != (8 & ((int[])((int[])var4[0]))[0]);
               if(!var8) {
                  var7 = (8 & ((int[])((int[])var3[0]))[0]) != 0;
                  var6 = var7?-1:0;
               } else {
                  var7 = (8 & ((int[])((int[])var3[0]))[0]) != 0;
                  var6 = !var7?1:0;
               }

               return var6;
            }
         }
      } else {
         var5 = ((int[])((int[])var4[0]))[2];
         var6 = ((int[])((int[])var3[0]))[2];
         if(!var2) {
            if(~var6 == 0) {
               var6 = 2001;
            }

            if(var5 == -1) {
               var5 = 2001;
            }
         }

         return -var6 + var5;
      }
   }

}
