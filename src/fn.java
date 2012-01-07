import jaggl.OpenGL;
import java.nio.ByteBuffer;

final class fn {

   static boolean h = false;
   static int g;
   static int e;
   static Object[] c = vra.a(536870911, 13, "", new Object[1]);
   static int b;
   static int d;
   static int a;
   static int f;


   static final void a(int var0, Object[] var1) {
      ++a;
      if(var0 != 5890) {
         b = ((int[])((int[])c[4]))[16];
      }

      int var2 = 0;

      while(((int[])((int[])var1[1]))[0] > var2) {
         lm var3 = ((lm[])((lm[])var1[2]))[var2];
         if(var1 != null && (-9 == ~var1.length && var1[0].equals(Integer.valueOf(0)) || var1.length == 2)) {
            return;
         }

         while(true) {
            lm var4 = var3.f;
            if(var3 == var4) {
               ++var2;
               break;
            }

            var4.a((byte)96);
         }
      }

      var1[0] = null;
   }

   static final Object[] a(int[] var0, Object[] var1, Object[] var2, Object[] var3, Object[] var4, int var5) {
      ++f;
      uea.a(-126, var3);
      if(var3 != null && -10 == ~var3.length) {
         pf.a(58, 29, 114, -112, -53, (ByteBuffer)null, -85, (Object[])null, (byte)-84, (ByteBuffer)null);
      }

      var3[10] = uca.a(var3, (byte)-113);
      var3[0] = var4;
      var3[5] = var2;
      var3[8] = var1;
      int var33 = mc.a(false, (Object[])((Object[])var3[0])) - (((aa)(null != var2?var2[2]:null)).g >> 1);
      ((int[])((int[])var3[1]))[3] = -var33 + lba.a((Object[])((Object[])var3[0]), -25699) >> ((aa)(null != var2?var2[2]:null)).a;
      ((int[])((int[])var3[1]))[5] = var33 + lba.a((Object[])((Object[])var3[0]), -25699) >> ((aa)(null == var2?null:var2[2])).a;
      ((int[])((int[])var3[1]))[1] = -var33 + a((Object[])((Object[])var3[0]), -126) >> ((aa)(null != var2?var2[2]:null)).a;
      ((int[])((int[])var3[1]))[2] = var33 + a((Object[])((Object[])var3[0]), -124) >> ((aa)(var2 == null?null:var2[2])).a;
      int var34 = 1 + -((int[])((int[])var3[1]))[3] + ((int[])((int[])var3[1]))[5];
      int var35 = ((int[])((int[])var3[1]))[2] - (((int[])((int[])var3[1]))[1] - 1);
      var3[3] = new float[var34 + 1][var35 + 1];
      var3[7] = new float[1 + var34][1 + var35];
      var3[4] = new float[var34 + 1][var35 + 1];
      if(var5 != -26133) {
         return (Object[])null;
      } else {
         int var38;
         int var39;
         int var36;
         int var37;
         int var40;
         int var41;
         for(var36 = 0; var36 <= var35; ++var36) {
            var37 = ((int[])((int[])var3[1]))[1] + var36;
            Object[] var11;
            if(0 < var37 && ~var37 > ~(((aa)(null == (var11 = (Object[])((Object[])var3[5]))?null:var11[2])).h - 1)) {
               if(var3 != null && 4 == var3.length && var3[0].equals(Boolean.valueOf(false))) {
                  return null;
               }

               for(var38 = 0; var34 >= var38; ++var38) {
                  var39 = var38 + ((int[])((int[])var3[1]))[3];
                  Object[] var12;
                  if(0 < var39 && ((aa)(null == (var12 = (Object[])((Object[])var3[5]))?null:var12[2])).f_i - 1 > var39) {
                     var40 = ((aa)(null != var2?var2[2]:null)).b(var5 ^ 26225, var37, var39 + 1) + -((aa)(null == var2?null:var2[2])).b(-33, var37, var39 - 1);
                     var41 = ((aa)(var2 == null?null:var2[2])).b(-95, var37 + 1, var39) - ((aa)(null != var2?var2[2]:null)).b(-60, var37 - 1, var39);
                     float var42 = (float)(1.0D / Math.sqrt((double)(var40 * var40 - (-65536 - var41 * var41))));
                     ((float[][])((float[][])var3[4]))[var38][var36] = var42 * (float)var40;
                     ((float[][])((float[][])var3[7]))[var38][var36] = var42 * -256.0F;
                     ((float[][])((float[][])var3[3]))[var38][var36] = var42 * (float)var41;
                  }
               }
            }
         }

         var36 = 0;

         for(var37 = ((int[])((int[])var3[1]))[1]; ((int[])((int[])var3[1]))[2] >= var37; ++var37) {
            if(0 <= var37 && ((aa)(var2 != null?var2[2]:null)).h > var37) {
               for(var38 = ((int[])((int[])var3[1]))[3]; var38 <= ((int[])((int[])var3[1]))[5]; ++var38) {
                  if(0 <= var38 && ~var38 > ~((aa)(var2 != null?var2[2]:null)).f_i) {
                     var39 = var0[var36];
                     int[] var51 = ((int[][][])((int[][][])var2[0]))[var38][var37];
                     if(null != var51 && var39 != 0) {
                        if(1 != var39) {
                           ((int[])((int[])var3[1]))[4] += 3;
                        } else {
                           var41 = 0;

                           while(~var41 > ~var51.length) {
                              if(~var51[var41++] != 0 && ~var51[var41++] != 0 && ~var51[var41++] != 0) {
                                 ((int[])((int[])var3[1]))[4] += 3;
                              }
                           }

                           if(null != var4 && 8 == var4.length) {
                              return null;
                           }
                        }
                     }
                  }

                  ++var36;
               }

               if(var1 != null && (var1.length == 6 || var1.length == 15 && var1[6].equals(Integer.valueOf(2)))) {
                  return null;
               }
            } else {
               var36 += ((int[])((int[])var3[1]))[5] - ((int[])((int[])var3[1]))[3];
            }
         }

         if(((int[])((int[])var3[1]))[4] > 0) {
            var3[2] = nb.a((byte)99, fda.a(((int[])((int[])var3[1]))[4], (byte)81), new Object[5]);
            ByteBuffer var50 = (ByteBuffer)((Object[])((Object[])var3[8]))[57];
            var50.clear();
            var50.position(2097152);
            ByteBuffer var49 = var50.slice();
            var50.position(0);
            var50.limit(2097152);
            var39 = 0;
            var36 = 0;

            for(var40 = ((int[])((int[])var3[1]))[1]; var40 <= ((int[])((int[])var3[1]))[2]; ++var40) {
               if(var40 >= 0 && ((aa)(null != var2?var2[2]:null)).h > var40) {
                  if(var4 != null && -16 == ~var4.length) {
                     return null;
                  }

                  var41 = 0;

                  for(int var52 = ((int[])((int[])var3[1]))[3]; ((int[])((int[])var3[1]))[5] >= var52; ++var52) {
                     if(0 <= var52 && ((aa)(null != var2?var2[2]:null)).f_i > var52) {
                        int var43 = var0[var36];
                        int[] var44 = ((int[][][])((int[][][])var2[0]))[var52][var40];
                        if(var44 != null && 0 != var43) {
                           if(var43 == 1) {
                              int[] var45 = ((int[][][])((int[][][])var2[10]))[var52][var40];
                              if(null != var2 && var2.length == 5 && var2[2].equals(Boolean.valueOf(false))) {
                                 uca.a(new Object[4][], (byte)-116);
                              }

                              int[] var46 = ((int[][][])((int[][][])var2[5]))[var52][var40];
                              int var47 = 0;

                              while(~var47 > ~var44.length) {
                                 if(-1 != var44[var47] && -1 != var44[1 + var47] && 0 != ~var44[2 + var47]) {
                                    pf.a(var45[var47], var40, var39, var52, var41, var49, var46[var47], var3, (byte)-12, var50);
                                    ++var47;
                                    pf.a(var45[var47], var40, var39, var52, var41, var49, var46[var47], var3, (byte)-69, var50);
                                    ++var47;
                                    pf.a(var45[var47], var40, var39, var52, var41, var49, var46[var47], var3, (byte)-76, var50);
                                    ++var47;
                                 } else {
                                    var47 += 3;
                                 }
                              }
                           } else if(var43 != 3) {
                              if(2 == var43) {
                                 pf.a(((aa)(var2 != null?var2[2]:null)).g, var40, var39, var52, var41, var49, 0, var3, (byte)-116, var50);
                                 pf.a(((aa)(null != var2?var2[2]:null)).g, var40, var39, var52, var41, var49, ((aa)(null == var2?null:var2[2])).g, var3, (byte)-121, var50);
                                 pf.a(0, var40, var39, var52, var41, var49, 0, var3, (byte)-69, var50);
                              } else if(var43 == 5) {
                                 pf.a(((aa)(var2 != null?var2[2]:null)).g, var40, var39, var52, var41, var49, ((aa)(var2 == null?null:var2[2])).g, var3, (byte)-110, var50);
                                 pf.a(0, var40, var39, var52, var41, var49, ((aa)(var2 == null?null:var2[2])).g, var3, (byte)-52, var50);
                                 pf.a(((aa)(null == var2?null:var2[2])).g, var40, var39, var52, var41, var49, 0, var3, (byte)-90, var50);
                              } else if(4 == var43) {
                                 pf.a(0, var40, var39, var52, var41, var49, ((aa)(null != var2?var2[2]:null)).g, var3, (byte)-122, var50);
                                 pf.a(0, var40, var39, var52, var41, var49, 0, var3, (byte)-55, var50);
                                 pf.a(((aa)(var2 != null?var2[2]:null)).g, var40, var39, var52, var41, var49, ((aa)(null == var2?null:var2[2])).g, var3, (byte)-99, var50);
                              }
                           } else {
                              pf.a(0, var40, var39, var52, var41, var49, 0, var3, (byte)-110, var50);
                              pf.a(((aa)(var2 != null?var2[2]:null)).g, var40, var39, var52, var41, var49, 0, var3, (byte)-40, var50);
                              pf.a(0, var40, var39, var52, var41, var49, ((aa)(null != var2?var2[2]:null)).g, var3, (byte)-59, var50);
                           }
                        }
                     }

                     ++var36;
                     ++var41;
                  }
               } else {
                  var36 += ((int[])((int[])var3[1]))[5] + -((int[])((int[])var3[1]))[3];
               }

               ++var39;
            }

            var3[9] = rta.a((byte)124, (Object[])((Object[])var3[8]), false);
            if(null != var2 && 14 == var2.length) {
               return null;
            }

            bj.a(4, (Object[])((Object[])var3[9]), ((int[])((int[])var3[1]))[4]);
            var3[6] = mc.a(var5 + 26008, (Object[])((Object[])var3[8]), false);
            lm.a(16, (Object[])((Object[])var3[6]), 16 * ((int[])((int[])var3[1]))[0], var5 - 108);
            nda.a(var5 + 7890, (Object[])((Object[])var3[6]), var50.position(), 0, ((long[])((long[])((Object[])((Object[])var3[8]))[50]))[0]);
            nda.a(-18243, (Object[])((Object[])var3[9]), var49.position(), 0, ((long[])((long[])((Object[])((Object[])var3[8]))[50]))[0] - -2097152L);
         } else {
            var3[9] = null;
            var3[6] = null;
         }

         var3[7] = null;
         var3[4] = null;
         var3[3] = null;
         var3[2] = null;
         return var3;
      }
   }

   static final void a(boolean var0, byte var1, boolean var2, Object[] var3, int var4) {
      ++d;
      if(var1 != -35) {
         b = 74;
      }

      if(var4 != ((int[])((int[])var3[1]))[21] || ((boolean[])((boolean[])var3[17]))[8] == !((boolean[])((boolean[])var3[17]))[24]) {
         Object[] var5 = null;
         int var6 = 0;
         byte var7 = 0;
         int var8 = 0;
         int var9 = !((boolean[])((boolean[])var3[17]))[8]?0:3;
         Object[] var10;
         if(0 <= var4) {
            var5 = ana.a(var4, -17398, (Object[])((Object[])var3[49]));
            var10 = ((ta)var3[55]).k.a(var4, (byte)123);
            if(0 == ((byte[])((byte[])var10[0]))[5] && 0 == ((byte[])((byte[])var10[0]))[6]) {
               wua.a(27349, var3);
            } else {
               float var11 = (float)(((int[])((int[])var3[1]))[33] % 128000) / 1000.0F * (float)((byte[])((byte[])var10[0]))[5] / 64.0F % 1.0F;
               float var12 = (float)((byte[])((byte[])var10[0]))[6] * ((float)(((int[])((int[])var3[1]))[33] % 128000) / 1000.0F) / 64.0F % 1.0F;
               OpenGL.glMatrixMode(5890);
               if(((boolean[])((boolean[])var3[17]))[6]) {
                  OpenGL.glLoadIdentity();
               }

               OpenGL.glTranslatef(var11, var12, 0.0F);
               OpenGL.glMatrixMode(5888);
               ((boolean[])((boolean[])var3[17]))[6] = true;
            }

            if(!((boolean[])((boolean[])var3[17]))[8]) {
               var7 = ((byte[])((byte[])var10[0]))[0];
               var9 = ((byte[])((byte[])var10[0]))[4];
               var8 = ((int[])((int[])var10[1]))[2];
            }

            var6 = ((int[])((int[])var10[1]))[1];
         } else {
            wua.a(27349, var3);
         }

         var10 = (Object[])((Object[])var3[12]);
         int var22 = var9;
         int var23 = var8;
         Object[] var16 = (Object[])((Object[])var10[0]);
         boolean var15 = pm.a(3, (Object[])((Object[])var16[12]), var1 ^ 1394);
         boolean var13 = var2 & var15;
         if(!var13 && (4 == var9 || 8 == var9 || var9 == 9)) {
            if(var9 == 4) {
               var23 = var7;
            }

            var22 = 2;
         }

         if(var22 != 0 && var0) {
            var22 |= Integer.MIN_VALUE;
         }

         if(~var22 != ~((int[])((int[])var10[1]))[1]) {
            Object[] var17;
            Object[] var18;
            if(-1 != ~((int[])((int[])var10[1]))[1]) {
               var17 = ((Object[][])((Object[][])var10[3]))[((int[])((int[])var10[1]))[1] & Integer.MAX_VALUE];
               if(var17 != null && 2 == var17.length) {
                  var18 = (Object[])((Object[])var17[0]);
                  if(((boolean[])((boolean[])var18[17]))[14]) {
                     ((boolean[])((boolean[])var18[17]))[14] = false;
                     if(((boolean[])((boolean[])var18[17]))[10] && !((boolean[])((boolean[])var18[17]))[14]) {
                        OpenGL.glEnable(2896);
                     } else {
                        OpenGL.glDisable(2896);
                     }
                  }
               } else if(null != var17 && 10 == var17.length) {
                  ci.a(var17, (int)0);
               } else if(var17 != null && 8 == var17.length) {
                  jra.c(88, var17);
               } else if(var17 != null && -4 == ~var17.length) {
                  if(((boolean[])((boolean[])var17[1]))[0]) {
                     efa.a((Object[])((Object[])var17[2]), '\u0001', 0);
                     nha.a((Object[])((Object[])var17[0]), 18806, 1);
                     moa.a((byte)100, (Object[])null, (Object[])((Object[])var17[0]));
                     nha.a((Object[])((Object[])var17[0]), var1 + 18841, 0);
                  } else {
                     db.a(770, (Object[])((Object[])var17[0]), (byte)-68, 0, 5890);
                  }

                  el.a(8448, var1 + 30897, 8448, (Object[])((Object[])var17[0]));
                  ((boolean[])((boolean[])var17[1]))[0] = false;
               } else if(var17 != null && 7 == var17.length) {
                  vqa.a((int)87, var17);
               } else if(null != var17 && 6 == var17.length) {
                  iea.a(var1 ^ -4828, var17);
               } else if(var17 != null && var17.length == 9) {
                  kl.a(var1 + 88, var17);
               } else {
                  if(var16 != null && (var16.length == 10 && var16[0].equals(Boolean.valueOf(false)) || var16.length == 2)) {
                     esa.a = 56;
                  }

                  if(var17 != null && 5 == var17.length) {
                     opa.a(var17, 104);
                  } else {
                     if(null == var17 || var17.length != 4) {
                        throw new IllegalStateException();
                     }

                     efa.a((Object[])((Object[])var17[2]), '\u0001', 0);
                     if(-1 > ~((int[])((int[])((Object[])((Object[])var17[0]))[1]))[23]) {
                        nha.a((Object[])((Object[])var17[0]), 18806, 1);
                        moa.a((byte)124, (Object[])null, (Object[])((Object[])var17[0]));
                        var18 = (Object[])((Object[])var17[0]);
                        ((float[])((float[])var18[25]))[14] = 0.0F;
                        ((float[])((float[])var18[25]))[2] = 1.0F;
                        pea.a(var1 ^ -52, var18);
                        nha.a((Object[])((Object[])var17[0]), var1 ^ -18773, 0);
                     }

                     el.a(8448, var1 + 30897, 8448, (Object[])((Object[])var17[0]));
                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPopMatrix();
                     OpenGL.glMatrixMode(5888);
                  }
               }
            }

            if(var22 != 0) {
               var17 = ((Object[][])((Object[][])var10[3]))[Integer.MAX_VALUE & var22];
               if(var17 != null && 2 == var17.length) {
                  var18 = (Object[])((Object[])var17[0]);
                  if(!((boolean[])((boolean[])var18[17]))[14]) {
                     ((boolean[])((boolean[])var18[17]))[14] = true;
                     if(((boolean[])((boolean[])var18[17]))[10] && !((boolean[])((boolean[])var18[17]))[14]) {
                        OpenGL.glEnable(2896);
                     } else {
                        OpenGL.glDisable(2896);
                     }
                  }
               } else if(null != var17 && var17.length == 10) {
                  jga.a(115, var0, var17);
               } else if(null != var17 && -9 == ~var17.length) {
                  pla.a(var17, var0, (byte)-28);
               } else if(null != var17 && 3 == var17.length) {
                  fta.a(false, var0, var17);
               } else {
                  Object[] var19;
                  if(null != var17 && -8 == ~var17.length) {
                     var19 = (Object[])((Object[])var17[0]);
                     var18 = var19[57] != null?jna.a((byte)127, (Object[])((Object[])var19[57])):null;
                     if(((boolean[])((boolean[])var17[6]))[1] && var18 != null) {
                        nha.a((Object[])((Object[])var17[0]), 18806, 1);
                        moa.a((byte)104, var18, (Object[])((Object[])var17[0]));
                        nha.a((Object[])((Object[])var17[0]), 18806, 0);
                        moa.a((byte)111, (Object[])((Object[])((Object[])((Object[])var17[5]))[2]), (Object[])((Object[])var17[0]));
                        int var21 = ((int[])((int[])((Object[])((Object[])var17[3]))[1]))[0];
                        OpenGL.glUseProgram(var21);
                        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var21, "normalSampler"), 0);
                        OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var21, "envMapSampler"), 1);
                        OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var21, "sunDir"), -((float[])((float[])((Object[])((Object[])var17[0]))[5]))[0], -((float[])((float[])((Object[])((Object[])var17[0]))[5]))[1], -((float[])((float[])((Object[])((Object[])var17[0]))[5]))[2]);
                        OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var21, "sunColour"), ((float[])((float[])((Object[])((Object[])var17[0]))[25]))[7], ((float[])((float[])((Object[])((Object[])var17[0]))[25]))[17], ((float[])((float[])((Object[])((Object[])var17[0]))[25]))[15], 1.0F);
                        if(var16 != null && -6 == ~var16.length) {
                           dma.f = null;
                        }

                        OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var21, "sunExponent"), 96.0F + Math.abs(((float[])((float[])((Object[])((Object[])var17[0]))[5]))[1]) * 928.0F);
                        ((boolean[])((boolean[])var17[6]))[0] = true;
                     }
                  } else if(null != var17 && -7 == ~var17.length) {
                     gp.a(var17, var0, 0);
                  } else if(var17 != null && var17.length == 9) {
                     mr.a(var17, var0, 1);
                  } else if(null != var17 && var17.length == 5) {
                     sma.a(var0, -19312, var17);
                  } else {
                     if(var17 == null || -5 != ~var17.length) {
                        throw new IllegalStateException();
                     }

                     if(((int[])((int[])((Object[])((Object[])var17[0]))[1]))[23] > 0) {
                        float var24 = -0.5F / (float)((int[])((int[])((Object[])((Object[])var17[0]))[1]))[23];
                        nha.a((Object[])((Object[])var17[0]), 18806, 1);
                        if(null != var3 && var3.length == 4 && var3[3].equals(Boolean.valueOf(false)) && var3[3].equals(Integer.valueOf(2))) {
                           db.a(-37, (Object[])null, (byte)-68, -27, -88);
                        }

                        Class_fs.a[1] = 0.0F;
                        Class_fs.a[0] = 0.0F;
                        Class_fs.a[3] = 0.25F + var24 * ((float[])((float[])((Object[])((Object[])var17[0]))[25]))[13];
                        Class_fs.a[2] = var24;
                        OpenGL.glPushMatrix();
                        OpenGL.glLoadIdentity();
                        OpenGL.glTexGenfv(8192, 9474, Class_fs.a, 0);
                        OpenGL.glPopMatrix();
                        var19 = (Object[])((Object[])var17[0]);
                        float var20 = (float)((int[])((int[])((Object[])((Object[])var17[0]))[1]))[23];
                        ((float[])((float[])var19[25]))[14] = var20;
                        ((float[])((float[])var19[25]))[2] = 0.5F;
                        pea.a(var1 ^ -52, var19);
                        moa.a((byte)97, (Object[])((Object[])var17[3]), (Object[])((Object[])var17[0]));
                        nha.a((Object[])((Object[])var17[0]), 18806, 0);
                     }

                     efa.a((Object[])((Object[])var17[2]), '\u0000', var1 + 35);
                     OpenGL.glMatrixMode(5890);
                     OpenGL.glPushMatrix();
                     OpenGL.glScalef(0.25F, 0.25F, 1.0F);
                     OpenGL.glMatrixMode(5888);
                  }
               }

               db.a(((Object[][])((Object[][])var10[3]))[Integer.MAX_VALUE & var22], var0, (byte)67);
               un.a(var23, var7, ((Object[][])((Object[][])var10[3]))[var22 & Integer.MAX_VALUE], 66);
            }

            ((int[])((int[])var10[1]))[1] = var22;
            ((int[])((int[])var10[1]))[2] = var7;
            ((int[])((int[])var10[1]))[0] = var23;
         } else if(((int[])((int[])var10[1]))[1] != 0) {
            db.a(((Object[][])((Object[][])var10[3]))[((int[])((int[])var10[1]))[1] & Integer.MAX_VALUE], var0, (byte)-93);
            if(var7 != ((int[])((int[])var10[1]))[2] || var23 != ((int[])((int[])var10[1]))[0]) {
               un.a(var23, var7, ((Object[][])((Object[][])var10[3]))[Integer.MAX_VALUE & ((int[])((int[])var10[1]))[1]], 66);
               ((int[])((int[])var10[1]))[2] = var7;
               ((int[])((int[])var10[1]))[0] = var23;
            }
         }

         if(!wua.a(1, var5, (Object[])((Object[])var3[12]), var6)) {
            moa.a((byte)97, var5, var3);
            za.a(var6, -20929, var3);
         }

         ((int[])((int[])var3[1]))[21] = var4;
         ((boolean[])((boolean[])var3[17]))[24] = ((boolean[])((boolean[])var3[17]))[8];
      }

      ((int[])((int[])var3[1]))[20] &= -8;
   }

   static final void a(int var0, int var1, int var2, Object[] var3, int var4, int var5) {
      ++e;
      Object[] var6 = mha.a((byte)124, new Object[2], (Object[])((Object[])woa.a(5, var3)[1]));
      if(!((boolean[])((boolean[])var3[8]))[7]) {
         float var7 = -((float[])((float[])var6[1]))[2] + (float)var2;
         float var8 = -((float[])((float[])var6[1]))[1] + (float)var0;
         float var9 = (float)Math.sqrt((double)(var7 * var7 + var8 * var8));
         if(0.0F != var9) {
            ((float[])((float[])var6[1]))[2] += var7 * (float)((int[])((int[])var3[12]))[5] / var9;
            ((float[])((float[])var6[1]))[1] += var8 * (float)((int[])((int[])var3[12]))[5] / var9;
         }

         if(((boolean[])((boolean[])var3[8]))[5]) {
            ((float[])((float[])var6[1]))[0] = (float)(Class_ds.a(((byte[])((byte[])var3[10]))[0], (int)((float[])((float[])var6[1]))[2], (int)((float[])((float[])var6[1]))[1], (byte)122) + -((int[])((int[])var3[12]))[10]);
         }

         sra.a(var3, var6, 1);
      }

      double var10 = (double)(-var1 + 1 + ((int[])((int[])var3[12]))[4]);
      ((double[])((double[])var3[14]))[3] = (double)((float)var0 - ((float[])((float[])var6[1]))[1]) / var10;
      ((double[])((double[])var3[14]))[0] = (double)((float)var2 - ((float[])((float[])var6[1]))[2]) / var10;
      if(var5 <= 68) {
         a(-73, 111, ((int[])((int[])var3[7]))[1], (Object[])((Object[])c[7]), 69, ((int[])((int[])var3[4]))[0]);
      }

      ((double[])((double[])var3[14]))[1] = Math.sqrt(((double[])((double[])var3[14]))[3] * ((double[])((double[])var3[14]))[3] + ((double[])((double[])var3[14]))[0] * ((double[])((double[])var3[14]))[0]);
      if(0 != ~((int[])((int[])var3[12]))[7]) {
         if(!((boolean[])((boolean[])var3[8]))[7]) {
            ((double[])((double[])var3[14]))[4] = -((double[])((double[])var3[14]))[1] * Math.tan(0.02454369D * (double)((int[])((int[])var3[12]))[7]);
         }

         ((double[])((double[])var3[14]))[2] = 2.0D * ((double)(-((float[])((float[])var6[1]))[0] + (float)var4) - ((double[])((double[])var3[14]))[4] * var10) / (var10 * var10);
      } else {
         ((double[])((double[])var3[14]))[4] = (double)((float)var4 - ((float[])((float[])var6[1]))[0]) / var10;
      }

   }

   static final int a(Object[] var0, int var1) {
      ++g;
      int var2 = 75 / ((-46 - var1) / 46);
      return (int)((float[])((float[])((Object[])((Object[])var0[2]))[1]))[1];
   }

}
