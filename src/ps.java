import jaggl.OpenGL;

final class ps {

   static int c;
   static int a;
   static String[] f_i = new String[8];
   static int g;
   static int k;
   static int d;
   static int e;
   static int f;
   static int j;
   static int h;
   static float b;


   static final int[] a(int var0, boolean var1, Object[] var2) {
      if(!var1) {
         ((int[])((int[])var2[2]))[0] = -123;
      }

      ++g;
      int[] var3 = od.a(-1704, var0, (Object[])((Object[])var2[5]));
      if(((boolean[])((boolean[])((Object[])((Object[])var2[5]))[4]))[0]) {
         int[] var4 = vea.a(var2, 0, var0, (byte)-8);

         for(int var5 = 0; var5 < fo.b; ++var5) {
            int var6 = var4[var5];
            var3[var5] = var6 >= ((int[])((int[])var2[1]))[1] && ((int[])((int[])var2[1]))[2] >= var6?4096:0;
         }

         if(var2 != null && var2.length == 15 && var2[6].equals(Integer.valueOf(1)) && var2[6].equals(Integer.valueOf(2))) {
            a(22, var1, (Object[])null);
         }
      }

      return var3;
   }

   static final void a(Object[] var0, int var1, int var2, boolean var3, boolean[][] var4, int var5, int var6) {
      if(null != var0 && (-15 == ~var0.length || var0.length == 26)) {
         bo.a(-84, (byte[])null, (byte[])null, 82, 10, 90, 13, -1, -106);
      }

      ++h;
      pda.a((Object[])((Object[])var0[4]), var5 - 21342, false);
      jma.a(125, false, (Object[])((Object[])var0[4]));
      jia.a((Object[])((Object[])var0[4]), var5 ^ var5, -2);
      za.a(1, -20929, (Object[])((Object[])var0[4]));
      kd.a(3042, (Object[])((Object[])var0[4]), 1);
      float var8 = 1.0F / (float)(128 * ((int[])((int[])((Object[])((Object[])var0[4]))[1]))[11]);
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      Object[] var24;
      if(!var3) {
         for(var9 = 0; ~var9 > ~((int[])((int[])var0[1]))[2]; ++var9) {
            var10 = var9 << ((int[])((int[])var0[1]))[4];
            if(null != var0 && -8 == ~var0.length && var0[0].equals(Boolean.valueOf(false))) {
               ma.a(-72, -21, -46, (byte[])null, ~var5, 22, 122);
            }

            var11 = var9 + 1 << ((int[])((int[])var0[1]))[4];

            for(var12 = 0; ((int[])((int[])var0[1]))[1] > var12; ++var12) {
               if(var0 != null && 4 == var0.length) {
                  return;
               }

               var13 = 0;
               var14 = var12 << ((int[])((int[])var0[1]))[4];
               var15 = var12 + 1 << ((int[])((int[])var0[1]))[4];
               Object[] var16 = (Object[])((Object[])((Object[])((Object[])var0[4]))[54]);
               ((int[])((int[])var16[1]))[0] = 0;

               for(int var17 = var10; var11 > var17; ++var17) {
                  if(~(-var1) >= ~(var17 + -var6) && var17 - var6 <= var1) {
                     Object[] var7;
                     int var18 = var14 + var17 * ((aa)((var7 = (Object[])((Object[])var0[3])) != null?var7[6]:null)).f_i;

                     for(int var19 = var14; var15 > var19; ++var19) {
                        if(-var1 <= var19 - var2 && var1 >= -var2 + var19 && var4[var1 + -var2 + var19][var1 + var17 + -var6]) {
                           short[] var20 = ((short[][])((short[][])((Object[])((Object[])var0[3]))[7]))[var18];
                           if(null != var20) {
                              int var21;
                              if(((boolean[])((boolean[])((Object[])((Object[])var0[4]))[17]))[11]) {
                                 for(var21 = 0; var20.length > var21; ++var21) {
                                    eda.a((byte)126, var16, '\uffff' & var20[var21]);
                                    ++var13;
                                 }

                                 if(var0 != null && (var0.length == 24 && var0[8].equals(Boolean.valueOf(false)) && var0[8].equals(Integer.valueOf(1)) || var0.length == 1 && var0[0].equals(Boolean.valueOf(false)))) {
                                    return;
                                 }
                              } else {
                                 for(var21 = 0; var20.length > var21; ++var21) {
                                    nua.a(var16, var5 + 1, var20[var21] & '\uffff');
                                    ++var13;
                                 }

                                 if(var0 != null && -22 == ~var0.length && var0[15].equals(Integer.valueOf(2))) {
                                    ola.a((byte)-86, (Object[])null, (Object[])null, (Object[])null);
                                 }
                              }
                           }
                        }

                        ++var18;
                     }

                     if(var16 != null && var16.length == 10) {
                        ws.b((Object[])null, var5 + 128);
                     }
                  }
               }

               if(0 < var13) {
                  OpenGL.glMatrixMode(5890);
                  OpenGL.glLoadIdentity();
                  OpenGL.glScalef(var8, var8, 1.0F);
                  OpenGL.glTranslatef((float)(-var12) / var8, (float)(-var9) / var8, 1.0F);
                  OpenGL.glMatrixMode(5888);
                  var24 = ((Object[][][])((Object[][][])var0[2]))[var12][var9];
                  byte[] var25 = (byte[])((byte[])var16[2]);
                  cma.a(5123, var25, (byte)49, 2 * var13, (Object[])((Object[])var24[2]));
                  gh.a((int)4, (Object[])((Object[])var24[2]), var24, var13);
               }
            }
         }
      } else {
         for(var9 = 0; var9 < ((int[])((int[])var0[1]))[2]; ++var9) {
            if(null != var0 && 7 == var0.length) {
               return;
            }

            var10 = var9 << ((int[])((int[])var0[1]))[4];
            var11 = 1 + var9 << ((int[])((int[])var0[1]))[4];
            var12 = 0;

            while(((int[])((int[])var0[1]))[1] > var12) {
               var13 = var12 << ((int[])((int[])var0[1]))[4];
               var14 = var12 + 1 << ((int[])((int[])var0[1]))[4];
               var15 = var13;

               while(true) {
                  if(var14 > var15) {
                     label146: {
                        if(-var1 <= var15 - var2 && var1 >= -var2 + var15) {
                           for(int var23 = var10; var23 < var11; ++var23) {
                              if(-var6 + var23 >= -var1 && var1 >= var23 + -var6 && var4[var1 + -var2 + var15][-var6 + var23 + var1]) {
                                 OpenGL.glMatrixMode(5890);
                                 OpenGL.glLoadIdentity();
                                 OpenGL.glScalef(var8, var8, 1.0F);
                                 OpenGL.glTranslatef((float)(-var12) / var8, (float)(-var9) / var8, 1.0F);
                                 OpenGL.glMatrixMode(5888);
                                 var24 = ((Object[][][])((Object[][][])var0[2]))[var12][var9];
                                 gh.a((int)4, (Object[])((Object[])var24[6]), var24, ((int[])((int[])var24[1]))[2]);
                                 break label146;
                              }
                           }

                           if(var0 != null && var0.length == 6) {
                              ws.b((Object[])null, 128);
                           }
                        }

                        ++var15;
                        continue;
                     }
                  }

                  ++var12;
                  break;
               }
            }
         }

         if(var0 != null && (3 == var0.length || 1 == var0.length)) {
            return;
         }
      }

      OpenGL.glMatrixMode(5890);
      OpenGL.glLoadIdentity();
      OpenGL.glMatrixMode(5888);
   }

   static final void a(int var0, Object[] var1) {
      if(var0 < 71) {
         b = ((float[])((float[])var1[5]))[0];
      }

      var1[0] = ura.a(-113, new Object[2]);
      ++j;
      var1[2] = new jua();
   }

   static final Object[] a(Object[] var0, int var1) {
      if(null == var0[1]) {
         var0[1] = new int[1];
      }

      if(var1 != 3351) {
         a(((byte[])((byte[])((Object[])((Object[])var0[7]))[1]))[2], 21, (Object[])((Object[])var0[4]));
      }

      ++a;
      return var0;
   }

   static final String a(byte var0) {
      ++k;
      String var1 = "www";
      if(po.f_i == tpa.c) {
         var1 = "www-wtrc";
      } else if(qt.d == po.f_i) {
         var1 = "www-wtqa";
      } else if(em.f == po.f_i) {
         var1 = "www-wtwip";
      } else if(po.f_i == lu.f) {
         var1 = "www-wti";
      }

      if(var0 != -19) {
         return (String)null;
      } else {
         String var2 = "";
         if(null != rna.d) {
            var2 = "/p=" + rna.d;
         }

         String var3 = (String)fsa.g[2] + ".com";
         return "http://" + var1 + "." + var3 + "/l=" + dp.y + "/a=" + ji.f + var2 + "/";
      }
   }

   static final void b(Object[] var0, int var1, byte var2) {
      ++c;
      if(null != var0 && 39 == var0.length) {
         an.a(((Object[][][])((Object[][][])var0[29]))[0][var1], (Object[])((Object[])var0[25]), true);
         rsa.a(-12423, (Object[])((Object[])var0[25]));
         bb.a(var0, var1, (int)0);
      } else if(null != var0 && 17 == var0.length) {
         sj.a((Object[])((Object[])var0[8]), (byte)100, (int)0);
         mqa.a((Object[])((Object[])var0[8]), Class_t.c, (byte)79, Class_t.c);
         mb.a((Object[])((Object[])var0[8]), 13195, haa.b, 0);
         roa.a(haa.b, 99, (Object[])((Object[])var0[8]), 0);
         mb.a((Object[])((Object[])var0[8]), 13195, pba.g, 1);
         roa.a(pba.g, 112, (Object[])((Object[])var0[8]), 1);
         oja.b(var0, 8);
      } else {
         if(var2 < 91) {
            f_i = (String[])null;
         }

         throw new IllegalStateException();
      }
   }

   static final Object[] a(int var0, int var1, Object[] var2, int var3, boolean var4, int var5, int var6, int var7) {
      if(var4) {
         return (Object[])((Object[])var2[6]);
      } else {
         if(null == var2[15]) {
            var2[15] = new short[1];
         }

         var2[14] = Integer.valueOf(1);
         ++d;
         ct.a(var2, true);
         ((byte[])((byte[])var2[10]))[1] = (byte)var5;
         ((short[])((short[])var2[15]))[0] = (short)var7;
         ((byte[])((byte[])var2[10]))[0] = (byte)var0;
         sra.a(var2, bl.a((byte)67, (float)var1, new Object[2], (float)var3, (float)var6), 1);
         return var2;
      }
   }

   static final int a(Object[] var0, int var1, byte var2) {
      ++e;
      Object[] var3 = hda.a(fv.d, var1, -97);
      int var4 = ((int[])((int[])var3[0]))[1];
      int var5 = -32 == ~((int[])((int[])var3[0]))[0]?-1:-1 + (1 << 1 + ((int[])((int[])var3[0]))[0]);
      if(var2 < 38) {
         ((int[])((int[])var0[0]))[0] = -81;
      }

      return (var5 & dh.a(var0, 0, var4)) >>> ((int[])((int[])var3[0]))[2];
   }

   static final Object[] a(byte var0, int var1, Object[] var2) {
      if(null == var2[1]) {
         var2[1] = new int[1];
      }

      int var3 = -96 / ((47 - var0) / 43);
      ++f;
      var2[0] = hla.a(var2, '\u8515');
      ((int[])((int[])var2[1]))[0] = var1;
      return var2;
   }

}
