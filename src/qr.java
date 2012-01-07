import jaggl.OpenGL;

final class qr {

   static int a = 1;
   static int f = 16;
   static int h;
   static int d;
   static int e;
   static int b;
   static int g;
   static int f_i;
   static int j;
   static int c;


   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, aea[] var3, boolean var4) {
      if(var0[2] == null) {
         var0[2] = new boolean[1];
      }

      if(var1 != null && var1.length == 11 && var1[1].equals(Integer.valueOf(2)) && var1[1].equals(Integer.valueOf(0))) {
         a((Object[])null, (Object[])null, new Object[1][], (aea[])null, false);
      }

      ta var8 = (ta)(var1 == null?null:var1[55]);
      nn var7 = new nn(var0, var8, var2);
      var0[3] = var7;
      var0[0] = var1;
      int var9 = 0;

      int var10;
      for(var10 = 0; var10 < 256; ++var10) {
         aea var11 = var3[var10];
         if(var11.h > var9) {
            var9 = var11.h;
         }

         if(var11.a > var9) {
            var9 = var11.a;
         }
      }

      var10 = var9 * 16;
      int var12;
      aea var13;
      int var15;
      int var17;
      int var16;
      int var19;
      int var18;
      int var21;
      int var22;
      if(var4) {
         byte[] var26 = new byte[var10 * var10];

         for(var12 = 0; var12 < 256; ++var12) {
            var13 = var3[var12];
            int var14 = var13.h;
            var15 = var13.a;
            var16 = var12 % 16 * var9;
            var17 = var12 / 16 * var9;
            var18 = var17 * var10 + var16;
            var19 = 0;
            byte[] var20;
            if(var13.e == null) {
               if(var1 != null && var1.length == 2) {
                  a((Object[])null, (Object[])null, (Object[])null, (aea[])null, false);
               }

               var20 = var13.c;

               for(var21 = 0; var21 < var14; ++var21) {
                  if(var0 != null && var0.length == 4 && var0[3].equals(Integer.valueOf(2))) {
                     a((Object[])null, '<', -121, -86, 10, false, (Class_s)null, 87, -22);
                  }

                  for(var22 = 0; var22 < var15; ++var22) {
                     var26[var18++] = (byte)(var20[var19++] == 0?0:-1);
                  }

                  var18 += var10 - var15;
               }
            } else {
               var20 = var13.e;

               for(var21 = 0; var21 < var14; ++var21) {
                  if(var2 != null && (var2.length == 2 || var2.length == 4)) {
                     a((Object[])null, '\uffb2', 75, 39, 68, true);
                  }

                  for(var22 = 0; var22 < var15; ++var22) {
                     var26[var18++] = var20[var19++];
                  }

                  var18 += var10 - var15;
               }
            }
         }

         var0[4] = lp.a(false, br.f, var10, var26, var1, (byte)-126, var10, br.f, vk.f);
         if(var0 != null && var0.length == 26) {
            return null;
         }

         ((boolean[])((boolean[])var0[2]))[0] = true;
      } else {
         int[] var27 = new int[var10 * var10];
         if(var1 != null && var1.length == 12) {
            return null;
         }

         var12 = 0;

         while(true) {
            if(var12 >= 256) {
               var0[4] = uka.a(var10, 0, 0, false, '\u84f5', var1, var10, var27);
               ((boolean[])((boolean[])var0[2]))[0] = false;
               break;
            }

            var13 = var3[var12];
            int[] var32 = var13.f_i;
            byte[] var31 = var13.e;
            byte[] var34 = var13.c;
            var17 = var13.h;
            if(var0 != null && var0.length == 2) {
               a((Object[])null, '6', 4, 14, 57, true, (Class_s)null, 46, -125);
            }

            var18 = var13.a;
            var19 = var12 % 16 * var9;
            int var35 = var12 / 16 * var9;
            var21 = var35 * var10 + var19;
            var22 = 0;
            int var23;
            int var24;
            if(var31 != null) {
               for(var23 = 0; var23 < var17; ++var23) {
                  for(var24 = 0; var24 < var18; ++var24) {
                     var27[var21++] = var31[var22] << 24 | var32[var34[var22] & 255];
                     ++var22;
                  }

                  if(var0 != null && var0.length == 8) {
                     return null;
                  }

                  var21 += var10 - var18;
               }
            } else {
               if(var0 != null && var0.length == 11) {
                  return null;
               }

               for(var23 = 0; var23 < var17; ++var23) {
                  for(var24 = 0; var24 < var18; ++var24) {
                     byte var25;
                     if((var25 = var34[var22++]) != 0) {
                        var27[var21++] = -16777216 | var32[var25 & 255];
                     } else {
                        ++var21;
                     }
                  }

                  if(var2 != null && (var2.length == 4 || var2.length == 9)) {
                     return null;
                  }

                  var21 += var10 - var18;
               }
            }

            ++var12;
         }
      }

      lta.a(-96, (Object[])((Object[])var0[4]), false);
      var0[1] = qoa.a(256, new Object[1], -78, var1);
      float var28 = ((float[])((float[])((Object[])((Object[])var0[4]))[6]))[0] / (float)((int[])((int[])((Object[])((Object[])var0[4]))[1]))[6];
      float var30 = ((float[])((float[])((Object[])((Object[])var0[4]))[6]))[1] / (float)((int[])((int[])((Object[])((Object[])var0[4]))[1]))[5];

      for(int var29 = 0; var29 < 256; ++var29) {
         aea var33 = var3[var29];
         var15 = var33.h;
         var16 = var33.a;
         var17 = var33.b;
         var18 = var33.f;
         float var36 = (float)(var29 % 16 * var9);
         float var37 = (float)(var29 / 16 * var9);
         float var41 = var36 * var28;
         float var40 = var37 * var30;
         float var39 = (var36 + (float)var16) * var28;
         float var38 = (var37 + (float)var15) * var30;
         tia.a((Object[])((Object[])var0[1]), var29, -66);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(var41, ((float[])((float[])((Object[])((Object[])var0[4]))[6]))[1] - var40);
         OpenGL.glVertex2i(var18, var17);
         OpenGL.glTexCoord2f(var41, ((float[])((float[])((Object[])((Object[])var0[4]))[6]))[1] - var38);
         OpenGL.glVertex2i(var18, var17 + var15);
         OpenGL.glTexCoord2f(var39, ((float[])((float[])((Object[])((Object[])var0[4]))[6]))[1] - var38);
         OpenGL.glVertex2i(var18 + var16, var17 + var15);
         OpenGL.glTexCoord2f(var39, ((float[])((float[])((Object[])((Object[])var0[4]))[6]))[1] - var40);
         OpenGL.glVertex2i(var18 + var16, var17);
         OpenGL.glEnd();
         fta.a((byte)89, (Object[])((Object[])var0[1]));
      }

      return var0;
   }

   static final void a(Object[] var0, int var1, Object[] var2, float[] var3) {
      if(var1 == 773) {
         ++b;
         kv.a(var3.length, var2, (byte)-108, ((Object[][])((Object[][])var0[3]))[((int[])((int[])var0[1]))[2]], var3);
      }
   }

   static final boolean a(int var0, Object[] var1) {
      ++e;
      if(var0 < 33) {
         f = -121;
      }

      return ((boolean[])((boolean[])var1[1]))[0];
   }

   static final int a(boolean var0, Object[] var1) {
      if(!var0) {
         a(87, (Object[])null);
      }

      ++c;
      return ((int[])((int[])var1[1]))[2];
   }

   static final void a(int var0, byte var1, int var2) {
      ++g;
      if(eka.h < eka.L) {
         eka.h = (float)((double)eka.h + (double)eka.h / 30.0D);
         if(eka.h > eka.L) {
            eka.h = eka.L;
         }

         sia.a((byte)-68);
         eka.J = (int)eka.h >> 1;
         eka.v = jt.a(19531, eka.J);
      } else if(eka.L < eka.h) {
         eka.h = (float)((double)eka.h - (double)eka.h / 30.0D);
         if(eka.h < eka.L) {
            eka.h = eka.L;
         }

         sia.a((byte)-68);
         eka.J = (int)eka.h >> 1;
         eka.v = jt.a(19531, eka.J);
      }

      if(-1 != rd.s && -1 != dq.f) {
         int var5 = -ln.b + rd.s;
         if(2 > var5 || 2 < var5) {
            var5 /= 8;
         }

         int var6 = -jw.c + dq.f;
         if(2 > var6 || var6 > 2) {
            var6 /= 8;
         }

         ln.b += var5;
         jw.c += var6;
         if(var5 == 0 && var6 == 0) {
            dq.f = -1;
            rd.s = -1;
         }

         sia.a((byte)-68);
      }

      if(qc.b <= 0) {
         sv.f = -1;
         wq.d = -1;
      } else {
         --rga.c;
         if(rga.c == 0) {
            rga.c = 100;
            --qc.b;
         }
      }

      if(var1 != 56) {
         a((byte)102, 118, (Object[])null);
      }

      daa var4;
      if(ui.c && up.c != null) {
         daa var3;
         for(Object[] var7 = null != (var3 = (daa)dda.a(up.c, 2))?var3.n:null; null != var7; var7 = null != (var4 = (daa)client.a(up.c, -28280))?var4.n:null) {
            Object[] var8 = ita.a(((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3], eka.e, var1 - 122);
            if(!lha.a(101, var0, var7, var2)) {
               if(((boolean[])((boolean[])((Object[])((Object[])var7[0]))[0]))[0]) {
                  ((boolean[])((boolean[])((Object[])((Object[])var7[0]))[0]))[0] = false;
                  tn.a(hk.b, ((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3], ((int[])((int[])var8[1]))[7], 1);
               }
            } else {
               if(null != var8[4]) {
                  if(null != ((String[])((String[])var8[4]))[4]) {
                     oja.a(0, (String)var8[8], (long)((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3], false, -1, false, ((int[])((int[])var8[1]))[7], true, ((String[])((String[])var8[4]))[4], -1, (byte)91, 1006, (long)((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3]);
                  }

                  if(((String[])((String[])var8[4]))[3] != null) {
                     oja.a(0, (String)var8[8], (long)((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3], false, -1, false, ((int[])((int[])var8[1]))[7], true, ((String[])((String[])var8[4]))[3], -1, (byte)-118, 1011, (long)((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3]);
                  }

                  if(null != ((String[])((String[])var8[4]))[2]) {
                     oja.a(0, (String)var8[8], (long)((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3], false, -1, false, ((int[])((int[])var8[1]))[7], true, ((String[])((String[])var8[4]))[2], -1, (byte)95, 1012, (long)((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3]);
                  }

                  if(((String[])((String[])var8[4]))[1] != null) {
                     oja.a(0, (String)var8[8], (long)((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3], false, -1, false, ((int[])((int[])var8[1]))[7], true, ((String[])((String[])var8[4]))[1], -1, (byte)-45, 1002, (long)((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3]);
                  }

                  if(null != ((String[])((String[])var8[4]))[0]) {
                     oja.a(0, (String)var8[8], (long)((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3], false, -1, false, ((int[])((int[])var8[1]))[7], true, ((String[])((String[])var8[4]))[0], -1, (byte)127, 1010, (long)((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3]);
                  }
               }

               if(!((boolean[])((boolean[])((Object[])((Object[])var7[0]))[0]))[0]) {
                  ((boolean[])((boolean[])((Object[])((Object[])var7[0]))[0]))[0] = true;
                  tn.a(ng.c, ((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3], ((int[])((int[])var8[1]))[7], 1);
               }

               if(((boolean[])((boolean[])((Object[])((Object[])var7[0]))[0]))[0]) {
                  tn.a(qja.m, ((int[])((int[])((Object[])((Object[])var7[0]))[1]))[3], ((int[])((int[])var8[1]))[7], 1);
               }
            }
         }
      }

   }

   static final void a(Object[] var0, char var1, int var2, int var3, int var4, boolean var5) {
      wu.a((Object[])((Object[])var0[0]), (byte)-128);
      moa.a((byte)116, (Object[])((Object[])var0[4]), (Object[])((Object[])var0[0]));
      if(!((boolean[])((boolean[])var0[2]))[0] && !var5) {
         el.a(7681, 30862, 7681, (Object[])((Object[])var0[0]));
      } else {
         el.a(8448, 30862, 7681, (Object[])((Object[])var0[0]));
         af.a(768, (Object[])((Object[])var0[0]), 30579, '\u8578', 0);
      }

      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      efa.a((Object[])((Object[])var0[1]), var1, 0);
      OpenGL.glLoadIdentity();
      if(((boolean[])((boolean[])var0[2]))[0] || var5) {
         af.a(768, (Object[])((Object[])var0[0]), 30579, 5890, 0);
      }

   }

   static final void a(Object[] var0, int var1) {
      ++h;
      ((boolean[])((boolean[])var0[1]))[var1] = false;
   }

   static final void a(Object[] var0, char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8) {
      tg var9;
      Object[] var10 = (var9 = (tg)var6) == null?null:var9.f_l;
      Object[] var11 = (Object[])((Object[])var10[0]);
      wu.a((Object[])((Object[])var0[0]), (byte)-120);
      moa.a((byte)114, (Object[])((Object[])var0[4]), (Object[])((Object[])var0[0]));
      if(!((boolean[])((boolean[])var0[2]))[0] && !var5) {
         el.a(7681, 30862, 7681, (Object[])((Object[])var0[0]));
      } else {
         el.a(8448, 30862, 7681, (Object[])((Object[])var0[0]));
         af.a(768, (Object[])((Object[])var0[0]), 30579, '\u8578', 0);
      }

      nha.a((Object[])((Object[])var0[0]), 18806, 1);
      moa.a((byte)113, var11, (Object[])((Object[])var0[0]));
      el.a(8448, 30862, 7681, (Object[])((Object[])var0[0]));
      af.a(768, (Object[])((Object[])var0[0]), 30579, '\u8578', 0);
      OpenGL.glTexGeni(8192, 9472, 9216);
      OpenGL.glTexGeni(8193, 9472, 9216);
      float var12 = ((float[])((float[])var11[6]))[0] / (float)((int[])((int[])var11[1]))[6];
      float var13 = ((float[])((float[])var11[6]))[1] / (float)((int[])((int[])var11[1]))[5];
      OpenGL.glTexGenfv(8192, 9474, new float[]{var12, 0.0F, 0.0F, (float)(-var7) * var12}, 0);
      OpenGL.glTexGenfv(8193, 9474, new float[]{0.0F, var13, 0.0F, (float)(-var8) * var13}, 0);
      if(var0 != null && var0.length == 2 && var0[0].equals(Integer.valueOf(2))) {
         a((Object[])null, '3', -30, -99, 112, false);
      }

      OpenGL.glEnable(3168);
      OpenGL.glEnable(3169);
      OpenGL.glColor4ub((byte)(var4 >> 16), (byte)(var4 >> 8), (byte)var4, (byte)(var4 >> 24));
      OpenGL.glTranslatef((float)var2, (float)var3, 0.0F);
      efa.a((Object[])((Object[])var0[1]), var1, 0);
      OpenGL.glLoadIdentity();
      OpenGL.glDisable(3168);
      OpenGL.glDisable(3169);
      af.a(768, (Object[])((Object[])var0[0]), 30579, 5890, 0);
      el.a(8448, 30862, 8448, (Object[])((Object[])var0[0]));
      moa.a((byte)124, (Object[])null, (Object[])((Object[])var0[0]));
      nha.a((Object[])((Object[])var0[0]), 18806, 0);
      if(((boolean[])((boolean[])var0[2]))[0] || var5) {
         af.a(768, (Object[])((Object[])var0[0]), 30579, 5890, 0);
      }

   }

   static final re a(Object[] var0, byte var1) {
      int var2 = -114 / ((var1 + 77) / 49);
      ++f_i;
      return rs.a(0, 11024, (Object[])((Object[])var0[3]));
   }

   static final int[] a(byte var0, int var1, Object[] var2) {
      ++j;
      int var3 = 120 / ((var0 + 16) / 58);
      int[] var4 = od.a(-1704, var1, (Object[])((Object[])var2[5]));
      if(((boolean[])((boolean[])((Object[])((Object[])var2[5]))[4]))[0]) {
         int var5 = bv.b[var1];
         int var7;
         if(((int[])((int[])var2[1]))[3] != 0) {
            for(int var6 = 0; var6 < fo.b; ++var6) {
               var7 = 0;
               short var8 = 0;
               int var9 = wra.d[var6];
               int var10 = ((int[])((int[])var2[1]))[3];
               if(var10 != 2) {
                  if(var10 != 1) {
                     if(3 == var10) {
                        var7 = 2048 + (var9 + -var5 >> 1);
                     }
                  } else {
                     var7 = var9;
                  }
               } else {
                  var7 = 2048 + (-4096 + var5 + var9 >> 1);
               }

               if(null != var2 && 3 == var2.length && var2[2].equals(Integer.valueOf(0))) {
                  ag.a(new Object[23][], 38);
               }

               for(var10 = 0; ((int[])((int[])var2[1]))[4] > var10; ++var10) {
                  if(((int[])((int[])var2[10]))[var10] <= var7 && ((int[])((int[])var2[10]))[1 + var10] > var7) {
                     if(var7 < ((int[])((int[])var2[7]))[var10]) {
                        var8 = 4096;
                     }
                     break;
                  }
               }

               var4[var6] = var8;
            }
         } else {
            short var11 = 0;

            for(var7 = 0; ~var7 > ~((int[])((int[])var2[1]))[4]; ++var7) {
               if(((int[])((int[])var2[10]))[var7] <= var5 && var5 < ((int[])((int[])var2[10]))[1 + var7]) {
                  if(~var5 > ~((int[])((int[])var2[7]))[var7]) {
                     var11 = 4096;
                  }
                  break;
               }
            }

            qo.a(var4, 0, fo.b, var11);
         }
      }

      return var4;
   }

}
