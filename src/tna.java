import jaggl.OpenGL;

final class tna {

   static int c;
   static int a;
   static int h;
   static int g;
   static int e;
   static int d;
   static int f;
   static int[] b = new int[32];


   static final Object[] a(Object[] var0, int var1, Object[] var2) {
      try {
         ++h;
         if(null == var2[1]) {
            var2[1] = new int[1];
         }

         if(null == var2[2]) {
            var2[2] = new long[1];
         }

         if(var1 != -14960) {
            a((Object[])null, ((boolean[])((boolean[])var2[0]))[1]);
         }

         cn.a(var2, (byte)122);
         ((long[])((long[])var2[2]))[0] = Class_i.a(false, var0);
         ((int[])((int[])var2[1]))[0] = lr.a(1, var0);

         for(int var4 = fh.a(var0, false); 0 != var4; var4 = fh.a(var0, false)) {
            Object[] var5;
            if(var4 == 3) {
               var5 = ar.a((byte)-32, new Object[8], var2);
            } else if(var4 == 1) {
               var5 = ol.a(-19453, var2, new Object[13]);
            } else if(var4 != 13) {
               if(4 == var4) {
                  var5 = lw.a(29929, var2, new Object[4]);
               } else if(var4 == 6) {
                  var5 = Class_g.a(new Object[15], var2, (byte)127);
               } else {
                  Object[] var7;
                  if(5 != var4) {
                     if(var4 == 2) {
                        var5 = tta.a(2, new Object[10], var2);
                     } else if(var4 != 7) {
                        if(var4 == 8) {
                           var5 = jp.b(new Object[9], false, var2);
                        } else if(9 != var4) {
                           if(10 == var4) {
                              var7 = new Object[7];
                              uaa.a(-119, var7);
                              var7[3] = var2;
                              ln.a(-28834, var7);
                              var5 = var7;
                           } else if(var4 != 11) {
                              if(var4 != 12) {
                                 throw new RuntimeException("");
                              }

                              var5 = pl.a(new Object[11], var1 + 13768, var2);
                           } else {
                              var5 = wsa.a((byte)-64, new Object[12], var2);
                           }
                        } else {
                           var5 = pka.a(-11503, new Object[5], var2);
                        }
                     } else {
                        var5 = uta.a((byte)94, var2, new Object[6]);
                     }
                  } else {
                     var7 = new Object[3];
                     if(var7[1] == null) {
                        var7[1] = new int[1];
                     }

                     var7[2] = var2;
                     ln.a(-28834, var7);
                     ksa.b(13, var7);
                     var5 = var7;
                  }
               }
            } else {
               var5 = uoa.a(var2, 10, new Object[14]);
            }

            if(null != var5 && -8 == ~var5.length) {
               ((int[])((int[])var5[1]))[0] = lr.a(1, var0);
               var5[2] = ara.b((byte)61, var0);
            } else if(var5 != null && -16 == ~var5.length) {
               fea.a(var0, (byte)122, var5);
            } else if(null != var5 && var5.length == 13) {
               if(255 != fh.a(var0, false)) {
                  --((int[])((int[])var0[1]))[0];
                  ((long[])((long[])var5[5]))[0] = Class_i.a(false, var0);
               }

               var5[2] = dv.a(var0, (byte)-30);
            } else if(null != var5 && var5.length == 10) {
               ((int[])((int[])var5[1]))[0] = de.a((int)0, var0);
               ((byte[])((byte[])var5[6]))[0] = ipa.a(var0, var1 ^ 14902);
            } else {
               if(null != var2 && var2.length == 4) {
                  return null;
               }

               if(null != var5 && var5.length == 6) {
                  wv.a(var0, var1 + 14882, var5);
               } else if(null != var5 && 8 == var5.length) {
                  if(-256 != ~fh.a(var0, false)) {
                     --((int[])((int[])var0[1]))[0];
                     ((long[])((long[])var5[5]))[0] = Class_i.a(false, var0);
                  }

                  var5[7] = dv.a(var0, (byte)-30);
               } else if(var5 != null && var5.length == 4) {
                  te.a(var5, var0, -66);
               } else if(var5 != null && var5.length == 3) {
                  sb.a(1, var0, var5);
               } else if(var5 != null && -12 == ~var5.length) {
                  var5[5] = ara.b((byte)61, var0);
                  lr.a(1, var0);
               } else if(null != var5 && var5.length == 12) {
                  dka.a(0, var5, var0);
               } else if(var5 != null && -10 == ~var5.length) {
                  uh.a(var0, var5, true);
               } else if(null != var5 && -15 == ~var5.length) {
                  fd.a(var5, var0, (byte)127);
               } else {
                  if(null == var5 || var5.length != 5) {
                     throw new IllegalStateException();
                  }

                  sh.a(var1 ^ -14888, var0, var5);
               }
            }

            client.a(var1 ^ -14854, (Object[])((Object[])var2[0]), (lm)(var5 == null?null:var5[0]));
         }

         return var2;
      } catch (RuntimeException var8) {
         throw vt.a(var8, "tna.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final void a(int var0, Object[] var1) {
      if(var0 != 1) {
         b = (int[])((int[])var1[8]);
      }

      ++f;
      if(var1 != null && 10 == var1.length) {
         gb.a(var1, true);
      } else if(null != var1 && var1.length == 5) {
         pj.a((byte)-106, var1);
      } else {
         throw new IllegalStateException();
      }
   }

   static final eha a(Object[] var0, boolean var1) {
      if(!var1) {
         b = (int[])null;
      }

      ++e;
      return new eha(var0);
   }

   static final void a(Object[] var0, ta var1, int var2) {
      ++d;
      if(var0[42] != null) {
         if(((boolean[])((boolean[])var0[8]))[5] || cf.a(0, var0, var2 + 17, var1)) {
            Object[] var3 = var1.k();
            lg.a(var3, bra.a(var0, true), -18072);
            if(var0 != null && (2 == var0.length || var0.length == 15 && var0[6].equals(Integer.valueOf(0)) || var0.length == 24 && var0[3].equals(Integer.valueOf(1)))) {
               tq.a((Object[])null, (Object[])null, -1);
            }

            cq.a((byte)81, 0.0F, (float)var2, 0.0F, var3);
            aa.a(var1, var3, var0, false, (ka[])((ka[])var0[29]), ((boolean[])((boolean[])var0[8]))[5]);

            for(int var4 = 0; var4 < ((Object[])((Object[])var0[29])).length; ++var4) {
               ((ka[])((ka[])var0[29]))[var4] = null;
            }

         }
      }
   }

   static final void a(Object[] var0, int var1, byte var2) {
      ++a;
      if(var0 != null && 87 == var0.length) {
         af.a(var0, (byte)-106, var1);
      } else {
         int var3;
         if(null != var0 && -92 == ~var0.length) {
            var3 = var1;
            synchronized(var0) {
               int var16 = 0;
               var3 &= Integer.MAX_VALUE;

               Object[] var17;
               while(!kj.a(24510, (Object[])((Object[])var0[89]))) {
                  ma var5;
                  var17 = null != (var5 = (ma)jca.b((byte)10, (Object[])((Object[])var0[89])))?var5.s:null;
                  ((int[])((int[])var0[83]))[var16++] = (int)((lm)(null != var17?var17[0]:null)).e;
                  ((int[])((int[])var0[1]))[32] -= ((int[])((int[])var17[1]))[0];
                  if(1000 == var16) {
                     OpenGL.glDeleteBuffersARB(var16, (int[])((int[])var0[83]), 0);
                     var16 = 0;
                  }
               }

               if(0 < var16) {
                  OpenGL.glDeleteBuffersARB(var16, (int[])((int[])var0[83]), 0);
                  var16 = 0;
               }

               while(!kj.a(24510, (Object[])((Object[])var0[81]))) {
                  ma var7;
                  var17 = (var7 = (ma)jca.b((byte)-128, (Object[])((Object[])var0[81]))) != null?var7.s:null;
                  ((int[])((int[])var0[83]))[var16++] = (int)((lm)(null == var17?null:var17[0])).e;
                  ((int[])((int[])var0[1]))[17] -= ((int[])((int[])var17[1]))[0];
                  if(var16 == 1000) {
                     OpenGL.glDeleteTextures(var16, (int[])((int[])var0[83]), 0);
                     var16 = 0;
                  }
               }

               if(var16 > 0) {
                  OpenGL.glDeleteTextures(var16, (int[])((int[])var0[83]), 0);
                  var16 = 0;
               }

               while(!kj.a(24510, (Object[])((Object[])var0[77]))) {
                  ma var9;
                  var17 = (var9 = (ma)jca.b((byte)-116, (Object[])((Object[])var0[77]))) != null?var9.s:null;
                  ((int[])((int[])var0[83]))[var16++] = ((int[])((int[])var17[1]))[0];
                  if(var16 == 1000) {
                     OpenGL.glDeleteFramebuffersEXT(var16, (int[])((int[])var0[83]), 0);
                     var16 = 0;
                  }
               }

               if(var16 > 0) {
                  OpenGL.glDeleteFramebuffersEXT(var16, (int[])((int[])var0[83]), 0);
                  var16 = 0;
               }

               while(!kj.a(24510, (Object[])((Object[])var0[87]))) {
                  ma var10;
                  var17 = null == (var10 = (ma)jca.b((byte)53, (Object[])((Object[])var0[87])))?null:var10.s;
                  ((int[])((int[])var0[83]))[var16++] = (int)((lm)(var17 != null?var17[0]:null)).e;
                  ((int[])((int[])var0[1]))[34] -= ((int[])((int[])var17[1]))[0];
                  if(var16 == 1000) {
                     OpenGL.glDeleteRenderbuffersEXT(var16, (int[])((int[])var0[83]), 0);
                     var16 = 0;
                  }
               }

               if(var16 > 0) {
                  OpenGL.glDeleteRenderbuffersEXT(var16, (int[])((int[])var0[83]), 0);
                  boolean var22 = false;
               }

               while(!kj.a(24510, (Object[])((Object[])var0[82]))) {
                  ma var12;
                  var17 = (var12 = (ma)jca.b((byte)10, (Object[])((Object[])var0[82]))) != null?var12.s:null;
                  OpenGL.glDeleteLists((int)((lm)(var17 == null?null:var17[0])).e, ((int[])((int[])var17[1]))[0]);
               }

               lm var20;
               while(!kj.a(24510, (Object[])((Object[])var0[80]))) {
                  var20 = jca.b((byte)115, (Object[])((Object[])var0[80]));
                  OpenGL.glDeleteProgram((int)var20.e);
               }

               while(!kj.a(24510, (Object[])((Object[])var0[74]))) {
                  var20 = jca.b((byte)-125, (Object[])((Object[])var0[74]));
                  OpenGL.glDeleteShader((int)var20.e);
               }

               while(!kj.a(24510, (Object[])((Object[])var0[82]))) {
                  ma var14;
                  var17 = (var14 = (ma)jca.b((byte)113, (Object[])((Object[])var0[82]))) == null?null:var14.s;
                  OpenGL.glDeleteLists((int)((lm)(null != var17?var17[0]:null)).e, ((int[])((int[])var17[1]))[0]);
               }

               int var21 = ((int[])((int[])var0[1]))[34] + ((int[])((int[])var0[1]))[32] + ((int[])((int[])var0[1]))[17];
               if(var21 > 100663296 && ((long[])((long[])var0[50]))[1] + 60000L < he.a(74)) {
                  System.gc();
                  ((long[])((long[])var0[50]))[1] = he.a(-76);
               }

               ws.a(-90, var3, var0);
            }
         } else {
            ws.a(-117, var1, var0);
            var3 = -31 / ((-48 - var2) / 53);
         }
      }
   }

   static final void a(Object[] var0, Object[] var1, int var2, boolean var3) {
      ++c;
      if(var2 != 3) {
         if(2 == var2) {
            ((int[])((int[])var1[1]))[1] = de.a((int)0, var0);
         } else if(var2 == 5) {
            ((int[])((int[])var1[1]))[8] = de.a((int)0, var0);
         } else if(1 == var2) {
            ((int[])((int[])var1[1]))[9] = de.a((int)0, var0);
         } else if(var2 == 4) {
            ((int[])((int[])var1[1]))[10] = de.a((int)0, var0);
         } else if(7 != var2) {
            if(0 != var2) {
               if(var2 != 8) {
                  if(var2 == 6) {
                     ((int[])((int[])var1[1]))[5] = fh.a(var0, false);
                  }
               } else {
                  ((int[])((int[])var1[1]))[3] = de.a((int)0, var0);
               }
            } else {
               ((int[])((int[])var1[1]))[4] = fh.a(var0, !var3);
            }
         } else {
            ((int[])((int[])var1[1]))[2] = de.a((int)0, var0);
         }
      } else {
         ((int[])((int[])var1[1]))[6] = de.a((int)0, var0);
      }

      if(!var3) {
         a((Object[])null, 65, ((byte[])((byte[])var1[4]))[1]);
      }

   }

   static final boolean a(int var0, Object[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      ++g;
      if(var9 != 19563) {
         return ((boolean[])((boolean[])var1[1]))[0];
      } else {
         int var11 = var8 + var0;
         int var12 = var7 + var3;
         int var13 = var10 + var4;
         int var14 = var6 + var5;
         int var15;
         int var16;
         if(var8 == var13 && -1 == ~(var2 & 2)) {
            var15 = var5 >= var3?var5:var3;

            for(var16 = var12 < var14?var12:var14; var15 < var16; ++var15) {
               if(0 == (8 & ((int[][])((int[][])var1[0]))[-((int[])((int[])var1[1]))[2] + var13 - 1][-((int[])((int[])var1[1]))[0] + var15])) {
                  return true;
               }
            }
         } else if(var10 == var11 && 0 == (var2 & 8)) {
            if(null != var1 && (-4 == ~var1.length && var1[0].equals(Integer.valueOf(0)) && var1[0].equals(Boolean.valueOf(false)) || var1.length == 9 || var1.length == 42)) {
               wua.a(5, (byte)78, false, 46, false, (Object[])null, -6, -89);
            }

            var15 = var3 > var5?var3:var5;

            for(var16 = var12 < var14?var12:var14; var16 > var15; ++var15) {
               if((((int[][])((int[][])var1[0]))[var10 - ((int[])((int[])var1[1]))[2]][var15 - ((int[])((int[])var1[1]))[0]] & 128) == 0) {
                  return true;
               }
            }
         } else if(var3 == var14 && (var2 & 1) == 0) {
            var15 = var8 > var10?var8:var10;

            for(var16 = var13 > var11?var11:var13; var15 < var16; ++var15) {
               if(-1 == ~(((int[][])((int[][])var1[0]))[-((int[])((int[])var1[1]))[2] + var15][var14 - 1 + -((int[])((int[])var1[1]))[0]] & 2)) {
                  return true;
               }
            }
         } else if(var5 == var12 && (var2 & 4) == 0) {
            if(null != var1 && var1.length == 1 && var1[0].equals(Integer.valueOf(2))) {
               return true;
            }

            var15 = var8 > var10?var8:var10;

            for(var16 = var13 > var11?var11:var13; var15 < var16; ++var15) {
               if(-1 == ~(((int[][])((int[][])var1[0]))[var15 + -((int[])((int[])var1[1]))[2]][var5 + -((int[])((int[])var1[1]))[0]] & 32)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

}
