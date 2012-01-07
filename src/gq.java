import jagdx.D3DCAPS;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.rfa;
import java.awt.Canvas;

final class gq {

   static int c;
   static int e;
   static int f;
   static int a;
   static int g = -1;
   static int[] d = new int[4096];
   static int b;


   static final void b(byte var0, Object[] var1) {
      ++b;
      if(var0 == -119) {
         if(var1[0] == null) {
            var1[0] = new int[3];
         }

      }
   }

   static final ta a(qa var0, int var1, int var2, Object[] var3, Canvas var4) {
      try {
         ++e;

         try {
            boolean var5 = eoa.a(true);
            if(!var5) {
               throw new RuntimeException("");
            } else if(!hp.a((byte)-39, "jagdx")) {
               throw new RuntimeException("");
            } else if(var1 != 0) {
               return (ta)null;
            } else {
               Integer var7 = Integer.valueOf(var2);
               Object[] var13 = null;

               try {
                  byte var14 = 0;
                  byte var15 = 1;
                  long var16 = IDirect3D.Direct3DCreate();
                  D3DCAPS var18 = new D3DCAPS();
                  IDirect3D.GetDeviceCaps(var16, var14, var15, var18);
                  if((var18.RasterCaps & 16777216) == 0) {
                     throw new RuntimeException("");
                  } else if(var18.MaxSimultaneousTextures >= 2) {
                     if(-1 == ~(2 & var18.TextureOpCaps)) {
                        throw new RuntimeException("");
                     } else if(0 != (var18.TextureOpCaps & 8)) {
                        if((64 & var18.TextureOpCaps) == 0) {
                           throw new RuntimeException("");
                        } else if((var18.TextureOpCaps & 512) != 0) {
                           if((33554432 & var18.TextureOpCaps) == 0) {
                              throw new RuntimeException("");
                           } else if((var18.DestBlendCaps & var18.SrcBlendCaps & 16) == 0) {
                              throw new RuntimeException("");
                           } else if(-1 == ~(var18.DestBlendCaps & var18.SrcBlendCaps & 32)) {
                              throw new RuntimeException("");
                           } else if((var18.SrcBlendCaps & var18.DestBlendCaps & 2) == 0) {
                              throw new RuntimeException("");
                           } else if(0 < var18.MaxActiveLights && var18.MaxActiveLights < 2) {
                              throw new RuntimeException("");
                           } else if(5 > var18.MaxStreams) {
                              throw new RuntimeException("");
                           } else {
                              D3DPRESENT_PARAMETERS var19 = new D3DPRESENT_PARAMETERS(var4);
                              var19.EnableAutoDepthStencil = true;
                              var19.Windowed = true;
                              var19.BackBufferWidth = var4.getWidth();
                              var19.BackBufferHeight = var4.getHeight();
                              var19.BackBufferCount = 1;
                              var19.PresentationInterval = Integer.MIN_VALUE;
                              if(!oi.a(var15, var19, var7.intValue(), var16, var14, (byte)11)) {
                                 throw new RuntimeException("");
                              } else {
                                 int var20 = 0;
                                 if(-1 != ~(1048576 & var18.DevCaps)) {
                                    var20 |= 16;
                                 }

                                 long var21 = 0L;

                                 try {
                                    var21 = IDirect3D.CreateDeviceContext(var16, var14, var15, var4, 64 | var20, var19);
                                 } catch (rfa var29) {
                                    var21 = IDirect3D.CreateDeviceContext(var16, var14, var15, var4, var20 & -1048577 | 32, var19);
                                 }

                                 var13 = cv.a(var15, var16, var0, var18, new Object[87], (byte)67, var7.intValue(), var19, var14, var3, var21);
                                 if(!((ta)(null != var13?var13[38]:null)).y.containsKey(var4)) {
                                    rca.a(94, var4);
                                    ta var23 = (ta)(var13 == null?null:var13[38]);
                                    Object[] var25 = new Object[8];
                                    int var28 = var4.getWidth();
                                    Object[] var10;
                                    var23.a(var4, (gv)((var10 = oha.a(var13, var28, var4, true, var1 - 120, var4.getHeight(), var25)) == null?null:var10[0]), 8);
                                 }

                                 if(null != var3 && -2 == ~var3.length) {
                                    a((qa)null, 0, 66, new Object[0][], (Canvas)null);
                                 }

                                 ((ta)(var13 == null?null:var13[38])).a(var4, var1 - 125);
                                 aqa.a(var13, false);
                                 ta var6 = (ta)(null == var13?null:var13[38]);
                                 return var6;
                              }
                           }
                        } else {
                           throw new RuntimeException("");
                        }
                     } else {
                        throw new RuntimeException("");
                     }
                  } else {
                     throw new RuntimeException("");
                  }
               } catch (RuntimeException var30) {
                  if(null != var13) {
                     el.a(var13, (byte)67);
                  }

                  throw var30;
               }
            }
         } catch (RuntimeException var31) {
            throw var31;
         } catch (Throwable var32) {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var33) {
         throw vt.a(var33, "gq.C(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ',' + (var4 != null?"{...}":"null") + ')');
      }
   }

   static final boolean a(int var0, int var1, String var2, Object[] var3) {
      if(var0 >= -46) {
         a((qa)var3[1], 29, -25, (Object[])((Object[])var3[11]), (Canvas)null);
      }

      ++f;
      if(null != var2) {
         if(-81 > ~var2.length()) {
            var2 = var2.substring(0, 80);
         }
      } else {
         var2 = "";
      }

      if(var3[9] == null) {
         var3[9] = nb.a((byte)105, 4, new Object[5]);
      } else {
         lm var8 = pm.a((long)var1, (Object[])((Object[])var3[9]), false);
         if(var8 != null) {
            ns var5;
            if(var8 instanceof ns && null != ((var5 = (ns)var8) == null?null:var5.n)) {
               ns var6;
               Object[] var10 = (var6 = (ns)var8) == null?null:var6.n;
               if(((String)var10[0]).equals(var2)) {
                  return false;
               }

               var10[0] = var2;
               return true;
            }

            var8.a((byte)29);
         }
      }

      Object[] var7;
      di.a((Object[])((Object[])var3[9]), true, (lm)((var7 = sg.a(var2, -19450, new Object[2])) != null?var7[1]:null), (long)var1);
      return true;
   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      ++a;

      while(true) {
         int var3 = fh.a(var2, false);
         if(var3 == 0) {
            if(null != var0 && var0.length == 4) {
               return;
            }

            if(var1 <= 16) {
               a((byte)13, (Object[])((Object[])((Object[])((Object[])var0[1]))[0]));
            }

            return;
         }

         if(var3 == 1) {
            ((int[])((int[])var0[1]))[21] = fma.c(-17126, var2);
         } else if(2 == var3) {
            ((int[])((int[])var0[1]))[13] = fma.c(-17126, var2);
         } else if(var3 == 3) {
            var0[2] = ara.b((byte)61, var2);
         } else if(4 == var3) {
            ((int[])((int[])var0[1]))[1] = td.a(var2, 88);
         } else if(5 == var3) {
            ((int[])((int[])var0[1]))[8] = td.a(var2, 82);
         } else if(6 == var3) {
            ((int[])((int[])var0[1]))[19] = fh.a(var2, false);
         } else {
            int var6;
            if(7 == var3) {
               var6 = fh.a(var2, false);
               if((1 & var6) == 0) {
                  ((boolean[])((boolean[])var0[9]))[1] = false;
               }

               if(-3 == ~(2 & var6)) {
                  ((boolean[])((boolean[])var0[9]))[0] = true;
               }
            } else if(var3 == 8) {
               ((boolean[])((boolean[])var0[9]))[3] = -2 == ~fh.a(var2, false);
            } else if(var3 == 9) {
               ((int[])((int[])var0[1]))[24] = de.a((int)0, var2);
               if(((int[])((int[])var0[1]))[24] == '\uffff') {
                  ((int[])((int[])var0[1]))[24] = -1;
               }

               ((int[])((int[])var0[1]))[2] = de.a((int)0, var2);
               if(((int[])((int[])var0[1]))[2] == '\uffff') {
                  ((int[])((int[])var0[1]))[2] = -1;
               }

               ((int[])((int[])var0[1]))[18] = lr.a(1, var2);
               ((int[])((int[])var0[1]))[3] = lr.a(1, var2);
            } else if(10 <= var3 && 14 >= var3) {
               ((String[])((String[])var0[4]))[var3 - 10] = ara.b((byte)61, var2);
            } else {
               int var7;
               if(15 != var3) {
                  if(16 == var3) {
                     ((boolean[])((boolean[])var0[9]))[2] = false;
                  } else if(var3 != 17) {
                     if(var3 == 18) {
                        ((int[])((int[])var0[1]))[20] = fma.c(-17126, var2);
                     } else if(var3 != 19) {
                        if(20 != var3) {
                           if(var3 != 21) {
                              if(var3 == 22) {
                                 ((int[])((int[])var0[1]))[25] = lr.a(1, var2);
                              } else if(23 != var3) {
                                 if(var3 != 24) {
                                    if(249 == var3) {
                                       var6 = fh.a(var2, false);
                                       if(var0[5] == null) {
                                          var7 = fda.a(var6, (byte)81);
                                          var0[5] = nb.a((byte)49, var7, new Object[5]);
                                       }

                                       if(var2 != null && var2.length == 1 && var2[0].equals(Boolean.valueOf(false))) {
                                          nra.a((String)null, 0, (Object[])null, -88);
                                       }

                                       for(var7 = 0; var7 < var6; ++var7) {
                                          boolean var11 = fh.a(var2, false) == 1;
                                          int var9 = td.a(var2, 115);
                                          lm var10;
                                          if(var11) {
                                             Object[] var4;
                                             var10 = (lm)(null != (var4 = sg.a(ara.b((byte)61, var2), -19450, new Object[2]))?var4[1]:null);
                                          } else {
                                             Object[] var5;
                                             var10 = (lm)(null != (var5 = ps.a((byte)98, lr.a(1, var2), new Object[2]))?var5[0]:null);
                                          }

                                          di.a((Object[])((Object[])var0[5]), true, var10, (long)var9);
                                       }
                                    }
                                 } else {
                                    ((int[])((int[])var0[1]))[23] = jia.c(-8166, var2);
                                    ((int[])((int[])var0[1]))[14] = jia.c(-8166, var2);
                                 }
                              } else {
                                 ((int[])((int[])var0[1]))[5] = fh.a(var2, false);
                                 ((int[])((int[])var0[1]))[9] = fh.a(var2, false);
                                 ((int[])((int[])var0[1]))[17] = fh.a(var2, false);
                              }
                           } else {
                              ((int[])((int[])var0[1]))[10] = lr.a(1, var2);
                           }
                        } else {
                           ((int[])((int[])var0[1]))[11] = de.a((int)0, var2);
                           if('\uffff' == ((int[])((int[])var0[1]))[11]) {
                              ((int[])((int[])var0[1]))[11] = -1;
                           }

                           ((int[])((int[])var0[1]))[26] = de.a((int)0, var2);
                           if(-65536 == ~((int[])((int[])var0[1]))[26]) {
                              ((int[])((int[])var0[1]))[26] = -1;
                           }

                           ((int[])((int[])var0[1]))[22] = lr.a(1, var2);
                           ((int[])((int[])var0[1]))[6] = lr.a(1, var2);
                        }
                     } else {
                        ((int[])((int[])var0[1]))[7] = de.a((int)0, var2);
                     }
                  } else {
                     var0[8] = ara.b((byte)61, var2);
                  }
               } else {
                  var6 = fh.a(var2, false);
                  var0[3] = new int[var6 * 2];

                  for(var7 = 0; 2 * var6 > var7; ++var7) {
                     ((int[])((int[])var0[3]))[var7] = jia.c(-8166, var2);
                  }

                  ((int[])((int[])var0[1]))[0] = lr.a(1, var2);
                  var7 = fh.a(var2, false);
                  var0[6] = new int[var7];

                  int var8;
                  for(var8 = 0; ((int[])((int[])var0[6])).length > var8; ++var8) {
                     ((int[])((int[])var0[6]))[var8] = lr.a(1, var2);
                  }

                  var0[7] = new byte[var6];

                  for(var8 = 0; var8 < var6; ++var8) {
                     ((byte[])((byte[])var0[7]))[var8] = ipa.a(var2, (int)-124);
                  }
               }
            }
         }
      }
   }

   static final void a(byte var0, Object[] var1) {
      ++c;
      if(var0 == -120) {
         if(var1[0] == null) {
            var1[0] = new int[4];
         }

      }
   }

}
