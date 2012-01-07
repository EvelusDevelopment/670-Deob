import jagdx.IDirect3DDevice;

final class mm {

   static int b;
   static int f;
   static int e;
   static int d;
   static Object[] a = nla.a(82, new Object[0], 19);
   static int c;


   static final boolean a(int var0, Object[] var1) {
      ++e;
      if(var0 != 65536) {
         a(((int[])((int[])((Object[])((Object[])var1[6]))[29]))[28]);
      }

      return (2 & ((int[])((int[])var1[0]))[0]) != 0;
   }

   static final void a(Object[] var0, long var1, byte var3) {
      if(var3 < 34) {
         a((int)14, (Object[])null);
      }

      IDirect3DDevice.SetPixelShader(((long[])((long[])var0[50]))[5], var1);
      ++c;
   }

   static final void a(int var0, int var1) {
      ++b;
      if(var0 != 0) {
         a(((int[])((int[])a[0]))[0], ((int[])((int[])a[7]))[13]);
      }

      if(od.a(1)) {
         if(var1 != ce.a) {
            qca.f = "";
         }

         ce.a = var1;
         iea.a(12, (byte)-87);
      }
   }

   static final void a(int var0) {
      try {
         ++d;
         if(mh.a(102, (Object[])((Object[])tu.d[7])) == 2) {
            byte var1 = (byte)(255 & var0 + OutputStreamWorker.c);
            int var2 = OutputStreamWorker.c % rp.c;

            int var3;
            int var4;
            for(var3 = 0; var3 < 4; ++var3) {
               for(var4 = 0; wpa.a > var4; ++var4) {
                  fga.d[var3][var2][var4] = var1;
               }
            }

            if(jca.n != 3) {
               for(var3 = 0; var3 < 2; ++var3) {
                  qv.a[var3] = -1000000;
                  tp.m[var3] = 1000000;
                  jta.a[var3] = 0;
                  dg.c[var3] = 1000000;
                  dua.a[var3] = 0;
               }

               Object[] var15 = (Object[])((Object[])woa.a(var0 ^ -7, uta.g)[1]);
               var4 = (int)((float[])((float[])var15[1]))[2];
               int var5 = (int)((float[])((float[])var15[1]))[1];
               int var6;
               if(3 != ha.e && -1 == nca.a) {
                  var6 = Class_ds.a(jca.n, woa.M, pta.f, (byte)122);
                  if(3200 > -qt.e + var6 && -1 != ~(pd.b[jca.n][woa.M >> 9][pta.f >> 9] & 4)) {
                     lg.a(3, woa.M >> 9, pta.f >> 9, false, ju.g, 1);
                  }
               } else {
                  if(3 != ha.e) {
                     var4 = nca.a;
                     var5 = hh.b;
                  }

                  if((4 & pd.b[jca.n][var4 >> 9][var5 >> 9]) == 0) {
                     if(qaa.r < 2560) {
                        var6 = woa.M >> 9;
                        int var7 = pta.f >> 9;
                        int var8 = var4 >> 9;
                        int var9 = var5 >> 9;
                        if(null != var15 && var15.length == 20) {
                           ((boolean[])((boolean[])lha.h[0]))[2] = ((boolean[])((boolean[])cq.f_i[1]))[0];
                        }

                        int var10;
                        if(var6 >= var8) {
                           var10 = -var8 + var6;
                        } else {
                           var10 = var8 + -var6;
                        }

                        int var11;
                        if(var9 > var7) {
                           var11 = -var7 + var9;
                        } else {
                           var11 = var7 - var9;
                        }

                        if(0 == var10 && var11 == 0 || -rp.c >= var10 || var10 >= rp.c || ~var11 >= ~(-wpa.a) || wpa.a <= var11) {
                           taa.a(new RuntimeException(), 32, var6 + wu.o + var7 + " " + var8 + wu.o + var9 + " " + rs.f + wu.o + qm.d);
                           return;
                        }

                        int var12;
                        int var13;
                        if(var10 <= var11) {
                           var12 = var10 * 65536 / var11;
                           var13 = '\u8000';

                           while(var9 != var7) {
                              if(var9 <= var7) {
                                 if(var9 < var7) {
                                    --var7;
                                 }
                              } else {
                                 ++var7;
                              }

                              if((4 & pd.b[jca.n][var6][var7]) == 0) {
                                 var13 += var12;
                                 if(var13 < 65536) {
                                    continue;
                                 }

                                 var13 -= 65536;
                                 if(var6 < var8) {
                                    ++var6;
                                 } else if(var8 < var6) {
                                    --var6;
                                 }

                                 if(0 == (pd.b[jca.n][var6][var7] & 4)) {
                                    continue;
                                 }

                                 lg.a(var0 + 7, var6, var7, false, ju.g, 1);
                                 break;
                              }

                              lg.a(3, var6, var7, false, ju.g, 1);
                              break;
                           }
                        } else {
                           var12 = 65536 * var11 / var10;
                           if(null != var15 && var15.length == 6) {
                              via.d = 19;
                           }

                           var13 = '\u8000';

                           while(var8 != var6) {
                              if(var8 > var6) {
                                 ++var6;
                              } else if(var6 > var8) {
                                 --var6;
                              }

                              if(0 != (4 & pd.b[jca.n][var6][var7])) {
                                 lg.a(3, var6, var7, false, ju.g, 1);
                                 break;
                              }

                              var13 += var12;
                              if(var13 >= 65536) {
                                 var13 -= 65536;
                                 if(var9 > var7) {
                                    ++var7;
                                 } else if(var9 < var7) {
                                    --var7;
                                 }

                                 if((4 & pd.b[jca.n][var6][var7]) != 0) {
                                    lg.a(var0 + 7, var6, var7, false, ju.g, 1);
                                    break;
                                 }
                              }
                           }
                        }
                     }
                  } else {
                     lg.a(3, var4 >> 9, var5 >> 9, false, ju.g, 0);
                  }
               }

            }
         }
      } catch (RuntimeException var14) {
         throw vt.a(var14, "mm.A(" + var0 + ')');
      }
   }

   static final void a(byte var0, Object[] var1) {
      int var2 = 76 % ((30 - var0) / 34);
      ++f;
      synchronized(var1[1]) {
         lga.b(0, (Object[])((Object[])var1[1]));
      }

      synchronized(var1[2]) {
         lga.b(0, (Object[])((Object[])var1[2]));
      }
   }

}
