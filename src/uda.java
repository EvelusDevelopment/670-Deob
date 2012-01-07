
final class uda extends lm {

   static int k;
   static int j;
   static Object[] m = de.a(128, 4, 2, new Object[3]);
   static Object[] s = null;
   static int p;
   static int o;
   Object[] r;
   static Object[] q = ed.a(9, new Object[1], (byte)-115, 140);
   static int f_l;
   static cga[] n;


   static final void a(Object[] var0, int var1) {
      if(((int[])((int[])var0[1]))[0] < 0 || ((int[])((int[])var0[1]))[0] > 5) {
         ((int[])((int[])var0[1]))[0] = oc.b(-121, var0);
      }

      ++f_l;
      if(var1 != -5499) {
         s = (Object[])((Object[])var0[0]);
      }

   }

   uda(Object[] var1) {
      this.r = var1;
   }

   static final boolean a(ta var0, Object[] var1, int var2) {
      ++p;
      Object[] var3 = (Object[])((Object[])woa.a(var2 - 10, var1)[1]);
      byte var5 = ((byte[])((byte[])var1[10]))[1];
      int var6 = (int)((float[])((float[])var3[1]))[2] >> qqa.e;
      if(var2 != 15) {
         s[19] = (Object)null;
      }

      int var7 = (int)((float[])((float[])var3[1]))[1] >> qqa.e;
      boolean var4;
      if(cq.h && bqa.f_i) {
         if(tia.f_i < 102) {
            var4 = false;
         } else {
            if(null != var3 && var3.length == 8) {
               ps.a(29, -40, (Object[])null, 23, false, 114, 66, 4);
            }

            if(!lt.a(var5, var6, var7, 10412)) {
               var4 = false;
            } else {
               int var8 = var6 << qqa.e;
               int var9 = var7 << qqa.e;
               int var10 = jp.o[var5].b(var2 - 46, var7, var6) - 1;
               int var11 = var10 + dca.a(true, var1);
               if(-2 != ~((short[])((short[])var1[15]))[0]) {
                  if(((short[])((short[])var1[15]))[0] == 2) {
                     if(!fw.a(iia.n + var9, var8, iia.n + var9, var9 + iia.n, var11, var11, var8, var10, -13544, var8 + iia.n)) {
                        var4 = false;
                     } else if(!fw.a(var9 + iia.n, iia.n + var8, var9 + iia.n, var9 + iia.n, var11, var10, var8, var10, -13544, iia.n + var8)) {
                        var4 = false;
                     } else {
                        var4 = true;
                     }
                  } else if(4 != ((short[])((short[])var1[15]))[0]) {
                     if(((short[])((short[])var1[15]))[0] == 8) {
                        if(fw.a(var9, var8, var9, var9, var11, var11, var8, var10, -13544, iia.n + var8)) {
                           if(!fw.a(var9, iia.n + var8, var9, var9, var11, var10, var8, var10, -13544, var8 + iia.n)) {
                              var4 = false;
                           } else {
                              var4 = true;
                           }
                        } else {
                           var4 = false;
                        }
                     } else if(((short[])((short[])var1[15]))[0] != 16) {
                        if(-33 != ~((short[])((short[])var1[15]))[0]) {
                           if(64 == ((short[])((short[])var1[15]))[0]) {
                              if(jc.a(iba.b + var8, var10, var9, iba.b, iba.b, var11, -95)) {
                                 var4 = true;
                              } else {
                                 var4 = false;
                              }
                           } else if(-129 == ~((short[])((short[])var1[15]))[0]) {
                              if(!jc.a(var8, var10, var9, iba.b, iba.b, var11, -117)) {
                                 var4 = false;
                              } else {
                                 var4 = true;
                              }
                           } else {
                              var4 = true;
                           }
                        } else if(!jc.a(var8 + iba.b, var10, iba.b + var9, iba.b, iba.b, var11, -117)) {
                           var4 = false;
                        } else {
                           var4 = true;
                        }
                     } else if(jc.a(var8, var10, iba.b + var9, iba.b, iba.b, var11, var2 ^ -100)) {
                        var4 = true;
                     } else {
                        var4 = false;
                     }
                  } else if(fw.a(var9 + iia.n, iia.n + var8, var9, var9, var11, var11, var8 + iia.n, var10, -13544, iia.n + var8)) {
                     if(!fw.a(iia.n + var9, var8 + iia.n, var9, var9 + iia.n, var10, var11, var8 + iia.n, var10, var2 ^ -13545, var8 + iia.n)) {
                        var4 = false;
                     } else {
                        var4 = true;
                     }
                  } else {
                     var4 = false;
                  }
               } else if(!fw.a(var9 + iia.n, var8, var9, var9, var11, var11, var8, var10, -13544, var8)) {
                  var4 = false;
               } else if(!fw.a(var9 + iia.n, var8, var9, iia.n + var9, var10, var11, var8, var10, -13544, var8)) {
                  var4 = false;
               } else {
                  var4 = true;
               }
            }
         }
      } else {
         var4 = false;
      }

      return var4;
   }

   static final void a(int var0, Object[] var1) {
      ++j;
      if(var0 == 24796) {
         ((boolean[])((boolean[])var1[63]))[9] = false;
      }
   }

   static final void a(int var0) {
      ++k;
      if(null != eoa.b) {
         qaa.a(eoa.b, (byte)26);
      }

      if(var0 != -6133) {
         ((int[])((int[])((Object[])((Object[])q[0]))[13]))[0] = 26;
      }

      if(null != tia.k) {
         while(true) {
            try {
               tia.k.join();
               break;
            } catch (InterruptedException var2) {
               ;
            }
         }
      }

   }

   static final String a(byte var0, Object[] var1) {
      ++o;
      if(var0 >= -59) {
         a((int)-12, (Object[])null);
      }

      return (String)var1[4];
   }

   static final void a(boolean var0, byte[][][] var1, int var2, byte var3, int var4) {
      int var5 = var0?1:0;
      jia.Bc = 0;
      oia.y = 0;
      ++nda.c;
      Object[] var6;
      if((var4 & 2) == 0) {
         for(var6 = ri.f_l[var5]; var6 != null; var6 = (Object[])((Object[])var6[11])) {
            if(!ala.a(var6, var0, var1, var2, var3)) {
               jja.a(var6);
               if(((int[])((int[])var6[12]))[0] != -1) {
                  sca.a[jia.Bc++] = var6;
               }
            }
         }
      }

      int var15;
      if((var4 & 1) == 0) {
         for(var6 = usa.e[var5]; var6 != null; var6 = (Object[])((Object[])var6[11])) {
            if(!ala.a(var6, var0, var1, var2, var3)) {
               jja.a(var6);
               if(((int[])((int[])var6[12]))[0] != -1) {
                  hja.f[oia.y++] = var6;
               }
            }
         }

         if(sqa.c) {
            for(var6 = sfa.g[var5]; var6 != null; var6 = (Object[])((Object[])var6[11])) {
               jja.a(var6);
               if(kca.a(var6, 27381)) {
                  hja.f[oia.y++] = var6;
               } else {
                  sca.a[jia.Bc++] = var6;
               }
            }
         } else {
            for(var6 = sfa.g[var5]; var6 != null; var6 = (Object[])((Object[])var6[11])) {
               if(!ala.a(var6, var0, var1, var2, var3)) {
                  jja.a(var6);
                  if(((int[])((int[])var6[12]))[0] != -1) {
                     if(kca.a(var6, 27381)) {
                        hja.f[oia.y++] = var6;
                     } else {
                        sca.a[jia.Bc++] = var6;
                     }
                  }
               }
            }
         }

         if(!var0) {
            for(var15 = 0; var15 < aha.b; ++var15) {
               if(!ala.a(mqa.g[var15], var0, var1, var2, var3)) {
                  jja.a(mqa.g[var15]);
                  if(((int[])((int[])mqa.g[var15][12]))[0] != -1) {
                     if(kca.a(mqa.g[var15], 27381)) {
                        hja.f[oia.y++] = mqa.g[var15];
                     } else {
                        sca.a[jia.Bc++] = mqa.g[var15];
                     }
                  }
               }
            }
         }
      }

      if(jia.Bc > 0) {
         nc.a(sca.a, 0, jia.Bc - 1);

         for(var15 = 0; var15 < jia.Bc; ++var15) {
            lia.a(sca.a[var15], true);
         }
      }

      if(ug.f) {
         mpa.b.a(0, (Object[][])null);
      }

      if((var4 & 2) == 0) {
         for(var15 = hga.g; var15 < ri.n; ++var15) {
            int var7;
            int var8;
            boolean[][] var9;
            int var10;
            int var11;
            int var12;
            if(var15 >= var2 && var1 != null) {
               var7 = ju.e.length;
               if(oia.z + ju.e.length > eja.c) {
                  var7 -= oia.z + ju.e.length - eja.c;
               }

               var8 = ju.e[0].length;
               if(tba.h + ju.e[0].length > me.c) {
                  var8 -= tba.h + ju.e[0].length - me.c;
               }

               var9 = uq.k;
               if(es.e) {
                  if(et.a) {
                     var9 = rka.e[var15];
                  }

                  for(var10 = li.y; var10 < var7; ++var10) {
                     var11 = var10 + oia.z - li.y;

                     for(var12 = hq.k; var12 < var8; ++var12) {
                        var9[var10][var12] = false;
                        if(ju.e[var10][var12]) {
                           int var13 = var12 + tba.h - hq.k;

                           for(int var14 = var15; var14 >= 0; --var14) {
                              if(ju.g[var14][var11][var13] != null && ((byte[])((byte[])ju.g[var14][var11][var13][5]))[0] == var15) {
                                 if((var14 < var2 || var1[var14][var11][var13] != var3) && !lt.a(var15, var11, var13, 10412)) {
                                    var9[var10][var12] = true;
                                 } else {
                                    var9[var10][var12] = false;
                                 }
                                 break;
                              }
                           }
                        }
                     }
                  }
               }

               if(et.a) {
                  jp.o[var15].a(0, 0, 0, (boolean[][])null, false, var4);

                  for(var10 = 0; var10 < bq.e; ++var10) {
                     hh.a(ar.b[var10], (byte)-93, eba.a(var15 + 1, new Object[2], (byte)-74));
                  }
               } else {
                  jp.o[var15].a(bd.h, oaa.a, vt.d, uq.k, false, var4);
               }
            } else {
               var7 = ju.e.length;
               if(oia.z + ju.e.length > eja.c) {
                  var7 -= oia.z + ju.e.length - eja.c;
               }

               var8 = ju.e[0].length;
               if(tba.h + ju.e[0].length > me.c) {
                  var8 -= tba.h + ju.e[0].length - me.c;
               }

               var9 = uq.k;
               if(es.e) {
                  if(et.a) {
                     var9 = rka.e[var15];
                  }

                  for(var10 = li.y; var10 < var7; ++var10) {
                     var11 = var10 + oia.z - li.y;

                     for(var12 = hq.k; var12 < var8; ++var12) {
                        if(ju.e[var10][var12] && !lt.a(var15, var11, var12 + tba.h - hq.k, 10412)) {
                           var9[var10][var12] = true;
                        } else {
                           var9[var10][var12] = false;
                        }
                     }
                  }
               }

               if(et.a) {
                  jp.o[var15].a(0, 0, 0, (boolean[][])null, false, var4);

                  for(var10 = 0; var10 < bq.e; ++var10) {
                     hh.a(ar.b[var10], (byte)-78, eba.a(var15 + 1, new Object[2], (byte)-74));
                  }
               } else {
                  jp.o[var15].a(bd.h, oaa.a, vt.d, uq.k, true, var4);
               }
            }
         }
      }

      if(oia.y > 0) {
         kfa.a(hja.f, 0, oia.y - 1);

         for(var15 = 0; var15 < oia.y; ++var15) {
            lia.a(hja.f[var15], true);
         }
      }

   }

}
