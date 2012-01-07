import java.awt.Color;

final class bo {

   static int g;
   static int f;
   static int h;
   static Color[] f_i = new Color[]{new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381)};
   static int c;
   static int a;
   static int e;
   static Object[] d = ho.a(17, 40, new Object[1], true);
   static Object[] b = sd.a(new Object[1], 24, (byte)120);


   static final void a(Object[] var0, byte var1, int var2) {
      if(var1 != -100) {
         a(16, (byte[])null, (byte[])null, -94, -30, ((int[])((int[])d[6]))[2], 46, ((int[])((int[])var0[9]))[2], 95);
      }

      synchronized(var0[0]) {
         fua.a(-121, (Object[])((Object[])var0[0]), var2);
      }

      ++e;
   }

   static final ka a(Object[] var0, Object[] var1, Object[] var2, Object[] var3, Object[] var4, Object[] var5, byte var6, Object[] var7, int var8, ta var9, Object[] var10, Object[] var11, Object[] var12) {
      ++h;
      lja.c = false;
      if(var12 != null && 6 == var12.length) {
         Class_ls.m = (Object[])((Object[])ic.f[2]);
      }

      if(((int[])((int[])var5[1]))[44] == 0) {
         return null;
      } else {
         if(var6 <= 41) {
            a((Object[])null, -25);
         }

         if(((int[])((int[])var5[1]))[44] == 1 && ((int[])((int[])var5[1]))[61] == -1) {
            return null;
         } else {
            int var17;
            int var49;
            ii var57;
            if(((int[])((int[])var5[1]))[44] == 1) {
               if(null != var2 && 19 == var2.length) {
                  ic.f = (Object[])((Object[])Class_a.a[0]);
               }

               if(var1 != null) {
                  var8 |= mo.a(true, var1);
               }

               long var38 = -1L;
               long[] var42 = ph.d;
               if(var5[44] != null) {
                  var8 |= 16384;

                  for(var17 = 0; ((short[])((short[])var5[44])).length > var17; ++var17) {
                     var38 = var42[(int)((var38 ^ (long)(((short[])((short[])var5[44]))[var17] >> 8)) & 255L)] ^ var38 >>> 8;
                     var38 = var38 >>> 8 ^ var42[(int)(((long)((short[])((short[])var5[44]))[var17] ^ var38) & 255L)];
                     var38 = var38 >>> 8 ^ var42[(int)((var38 ^ (long)(((short[])((short[])var5[20]))[var17] >> 8)) & 255L)];
                     var38 = var38 >>> 8 ^ var42[(int)(((long)((short[])((short[])var5[20]))[var17] ^ var38) & 255L)];
                  }
               }

               if(var5[11] != null) {
                  if(var11 != null && var11.length == 9) {
                     ((boolean[])((boolean[])bda.d[3]))[0] = false;
                  }

                  var8 |= '\u8000';

                  for(var17 = 0; ((short[])((short[])var5[11])).length > var17; ++var17) {
                     var38 = var38 >>> 648452040 ^ var42[(int)((var38 ^ (long)(((short[])((short[])var5[11]))[var17] >> 8)) & 255L)];
                     var38 = var42[(int)(255L & ((long)((short[])((short[])var5[11]))[var17] ^ var38))] ^ var38 >>> 8;
                     var38 = var42[(int)(255L & ((long)(((short[])((short[])var5[59]))[var17] >> 8) ^ var38))] ^ var38 >>> 8;
                     var38 = var42[(int)((var38 ^ (long)((short[])((short[])var5[59]))[var17]) & 255L)] ^ var38 >>> 8;
                  }
               }

               long var45 = 274877906943L & var38 | (long)var9.G << 59 | (long)((int[])((int[])var5[1]))[44] << 54 | (long)((int[])((int[])var5[1]))[61] << 38;
               ka var46 = (ka)dna.a((byte)34, ic.f, var45);
               if(null == var46 || var9.d(var46.va(), var8) != 0) {
                  if(null != var46) {
                     var8 = var9.a(var8, var46.va());
                  }

                  var57 = ii.a(pt.c, ((int[])((int[])var5[1]))[61], (int)0);
                  if(null == var57) {
                     lja.c = true;
                     return null;
                  }

                  if(-14 < ~var57.a) {
                     var57.a(2);
                  }

                  var46 = var9.a(var57, var8, sm.b, 64, 768);
                  if(var5[44] != null) {
                     for(var49 = 0; var49 < ((short[])((short[])var5[44])).length; ++var49) {
                        var46.q(((short[])((short[])var5[44]))[var49], ((short[])((short[])var5[20]))[var49]);
                     }
                  }

                  if(null != var5[11]) {
                     for(var49 = 0; ((short[])((short[])var5[11])).length > var49; ++var49) {
                        var46.DA(((short[])((short[])var5[11]))[var49], ((short[])((short[])var5[59]))[var49]);
                     }
                  }

                  il.a(var45, var46, true, ic.f);
               }

               if(var1 != null) {
                  var46 = var46.a((byte)1, var8, true);
                  bqa.a(0, 1, var46, var1);
               }

               var46.G(var8);
               return var46;
            } else {
               ka var13;
               if(2 == ((int[])((int[])var5[1]))[44]) {
                  var13 = paa.a(var12, jra.a((byte)-101, ((int[])((int[])var5[1]))[61], var2), var9, var1, 75, var8, var4);
                  if(var13 == null) {
                     lja.c = true;
                     return null;
                  } else {
                     return var13;
                  }
               } else {
                  int var14;
                  ka var16;
                  Object[] var21;
                  int var25;
                  if(((int[])((int[])var5[1]))[44] == 3) {
                     if(null == var0) {
                        return null;
                     } else {
                        if(((int[])((int[])var0[1]))[1] == -1) {
                           label509: {
                              var14 = var1 == null?var8:mo.a(true, var1) | var8;
                              Object[] var40 = kg.a;
                              ka var36;
                              synchronized(kg.a) {
                                 var36 = (ka)dna.a((byte)34, kg.a, ((long[])((long[])var0[0]))[0]);
                              }

                              if(var36 == null || var9.d(var36.va(), var14) != 0) {
                                 if(var36 != null) {
                                    var14 = var9.a(var14, var36.va());
                                 }

                                 boolean var43 = false;

                                 int var19;
                                 Object[] var47;
                                 for(int var44 = 0; ~var44 > ~((int[])((int[])var0[2])).length; ++var44) {
                                    var19 = ((int[])((int[])var0[2]))[var44];
                                    Object[] var51 = null;
                                    if((1073741824 & var19) != 0) {
                                       if(null != var0[3] && ((Object[][])((Object[][])var0[3]))[var44] != null) {
                                          var51 = ((Object[][])((Object[][])var0[3]))[var44];
                                       }

                                       var47 = us.a(var19 & 1073741823, (byte)93, var7);
                                       boolean var53 = ((boolean[])((boolean[])var0[4]))[0];
                                       int var52;
                                       if(!var53) {
                                          if(null != var51 && null != var51[3]) {
                                             var25 = ((int[])((int[])var51[3]))[1];
                                             var52 = ((int[])((int[])var51[3]))[0];
                                          } else {
                                             var25 = ((int[])((int[])var47[1]))[39];
                                             var52 = ((int[])((int[])var47[1]))[38];
                                          }
                                       } else if(null != var51 && var51[2] != null) {
                                          var52 = ((int[])((int[])var51[2]))[0];
                                          var25 = ((int[])((int[])var51[2]))[1];
                                       } else {
                                          var25 = ((int[])((int[])var47[1]))[16];
                                          var52 = ((int[])((int[])var47[1]))[10];
                                       }

                                       boolean var50;
                                       if(~var52 == 0) {
                                          var50 = true;
                                       } else {
                                          boolean var58 = true;
                                          if(!Class_ss.a(0, 5, (Object[])((Object[])((Object[])((Object[])var47[7]))[7]), var52)) {
                                             var58 = false;
                                          }

                                          if(-1 != var25 && !Class_ss.a(0, 5, (Object[])((Object[])((Object[])((Object[])var47[7]))[7]), var25)) {
                                             var58 = false;
                                          }

                                          var50 = var58;
                                       }

                                       if(!var50) {
                                          var43 = true;
                                       }
                                    } else if(-1 != ~(Integer.MIN_VALUE & var19) && !pi.a((int)65, gba.a((byte)76, 1073741823 & var19, var3))) {
                                       var43 = true;
                                    }
                                 }

                                 if(null != var5 && 2 == var5.length) {
                                    tk.a((String)ic.f[1], (byte)-125, ((int[])((int[])bda.d[11]))[29], (Object[])null);
                                 }

                                 if(var43) {
                                    var13 = null;
                                    break label509;
                                 }

                                 ii[] var41 = new ii[((int[])((int[])var0[2])).length];
                                 var19 = 0;

                                 for(int var48 = 0; ((int[])((int[])var0[2])).length > var48; ++var48) {
                                    var49 = ((int[])((int[])var0[2]))[var48];
                                    var47 = null;
                                    ii var55;
                                    if(-1 == ~(1073741824 & var49)) {
                                       if((var49 & Integer.MIN_VALUE) != 0) {
                                          var55 = kla.c((byte)-120, gba.a((byte)54, var49 & 1073741823, var3));
                                          if(null != var55) {
                                             var41[var19++] = var55;
                                          }
                                       }
                                    } else {
                                       if(null != var0[3] && null != ((Object[][])((Object[][])var0[3]))[var48]) {
                                          var47 = ((Object[][])((Object[][])var0[3]))[var48];
                                       }

                                       var55 = gna.a(us.a(var49 & 1073741823, (byte)39, var7), var47, (byte)78, ((boolean[])((boolean[])var0[4]))[0]);
                                       if(null != var55) {
                                          var41[var19++] = var55;
                                       }
                                    }
                                 }

                                 var57 = new ii(var41, var19);
                                 int var39 = var14 | 16384;
                                 var36 = var9.a(var57, var39, sr.b, 64, 768);

                                 for(var49 = 0; var49 < 10; ++var49) {
                                    for(int var56 = 0; var56 < rsa.b[var49].length; ++var56) {
                                       if(~((int[])((int[])var0[5]))[var49] > ~sfa.a[var49][var56].length) {
                                          var36.q(rsa.b[var49][var56], sfa.a[var49][var56][((int[])((int[])var0[5]))[var49]]);
                                       }
                                    }

                                    if(null != var7 && (var7.length == 8 || 2 == var7.length && var7[1].equals(Integer.valueOf(1)))) {
                                       ((byte[])((byte[])pt.c[1]))[12] = 79;
                                    }
                                 }

                                 var36.G(var14);
                                 var21 = kg.a;
                                 synchronized(kg.a) {
                                    il.a(((long[])((long[])var0[0]))[0], var36, true, kg.a);
                                 }
                              }

                              if(null == var1) {
                                 var13 = var36;
                              } else {
                                 var16 = var36.a((byte)4, var14, true);
                                 bqa.a(0, 1, var16, var1);
                                 var13 = var16;
                              }
                           }
                        } else {
                           var13 = paa.a(var12, jra.a((byte)-3, ((int[])((int[])var0[1]))[1], var2), var9, var1, 3, var8, (Object[])null);
                        }

                        if(null != var13) {
                           return var13;
                        } else {
                           lja.c = true;
                           return null;
                        }
                     }
                  } else if(4 == ((int[])((int[])var5[1]))[44]) {
                     Object[] var34 = us.a(((int[])((int[])var5[1]))[61], (byte)29, var7);
                     ka var37 = woa.a(var0, 10, var34, var1, var9, false, var8);
                     if(null != var37) {
                        return var37;
                     } else {
                        lja.c = true;
                        return null;
                     }
                  } else if(-7 != ~((int[])((int[])var5[1]))[44]) {
                     if(7 != ((int[])((int[])var5[1]))[44]) {
                        return null;
                     } else if(null == var0) {
                        return null;
                     } else {
                        int var35 = ((int[])((int[])var5[1]))[61] >>> 16;
                        var14 = '\uffff' & ((int[])((int[])var5[1]))[61];
                        int var15 = ((int[])((int[])var5[1]))[49];
                        var17 = null != var1?mo.a(true, var1) | var8:var8;
                        long var18 = (long)var35 | (long)(var14 << 16) | (long)var15 << 32;
                        var21 = kg.a;
                        ka var20;
                        synchronized(kg.a) {
                           var20 = (ka)dna.a((byte)34, kg.a, var18);
                        }

                        label510: {
                           if(null == var20 || 0 != var9.d(var20.va(), var17)) {
                              if(null != var20) {
                                 var17 = var9.a(var17, var20.va());
                              }

                              ii[] var22 = new ii[3];
                              int var23 = 0;
                              if(!pi.a((int)91, gba.a((byte)108, var35, var3)) || !pi.a((int)107, gba.a((byte)94, var14, var3)) || !pi.a((int)44, gba.a((byte)72, var15, var3))) {
                                 var16 = null;
                                 break label510;
                              }

                              ii var24 = kla.c((byte)-114, gba.a((byte)119, var35, var3));
                              if(null != var24) {
                                 var22[var23++] = var24;
                              }

                              var24 = kla.c((byte)-91, gba.a((byte)109, var14, var3));
                              if(null != var24) {
                                 var22[var23++] = var24;
                              }

                              var24 = kla.c((byte)-62, gba.a((byte)115, var15, var3));
                              if(null != var24) {
                                 var22[var23++] = var24;
                              }

                              var49 = var17 | 16384;
                              var24 = new ii(var22, var23);
                              var20 = var9.a(var24, var49, sr.b, 64, 768);

                              for(var25 = 0; 10 > var25; ++var25) {
                                 if(var11 != null && var11.length == 2) {
                                    hga.h = 16;
                                 }

                                 for(int var26 = 0; ~var26 > ~rsa.b[var25].length; ++var26) {
                                    if(((int[])((int[])var0[5]))[var25] < sfa.a[var25][var26].length) {
                                       var20.q(rsa.b[var25][var26], sfa.a[var25][var26][((int[])((int[])var0[5]))[var25]]);
                                    }
                                 }
                              }

                              if(var12 != null && -2 == ~var12.length && var12[0].equals(Boolean.valueOf(false))) {
                                 kka.a((byte)126);
                              }

                              var20.G(var17);
                              Object[] var54 = kg.a;
                              synchronized(kg.a) {
                                 il.a(var18, var20, true, kg.a);
                              }
                           }

                           if(null != var1) {
                              var20 = var20.a((byte)4, var17, true);
                              var16 = var20;
                              bqa.a(0, 1, var20, var1);
                           } else {
                              var16 = var20;
                           }
                        }

                        if(null == var16) {
                           lja.c = true;
                           return null;
                        } else {
                           return var16;
                        }
                     }
                  } else {
                     var13 = ita.a(jra.a((byte)51, ((int[])((int[])var5[1]))[61], var2), 0, (int[])null, var4, 0, var1, (Object[][])null, var12, var8, var11, var9, (Object[])null);
                     if(var13 == null) {
                        lja.c = true;
                        return null;
                     } else {
                        return var13;
                     }
                  }
               }
            }
         }
      }
   }

   static final boolean a(Object[] var0, int var1) {
      ++f;

      for(int var2 = 0; var2 < 4; ++var2) {
         Object[] var3 = ((Object[][])((Object[][])var0[6]))[var2];
         if(var3 != null) {
            long var4 = dca.b(var3, 6);
            ks.a(var2, var0, var4, (byte)-41);
         }
      }

      if(var0[4] != null) {
         ica.a(var0, (byte)-119, du.a((int)30, (Object[])((Object[])var0[4])));
      }

      ((boolean[])((boolean[])var0[5]))[0] = true;
      if(null != var0 && (-3 == ~var0.length || -2 == ~var0.length)) {
         return false;
      } else {
         if(var1 != 44) {
            a((Object[])null, (byte)-101, ((int[])((int[])b[1]))[4]);
         }

         return ffa.a(var1 ^ -9044, var0);
      }
   }

   static final void a(int var0, byte[] var1, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      ++g;
      int var9 = -(var5 >> 2);
      if(var7 == -1) {
         var5 = -(var5 & 3);

         for(int var10 = -var0; 0 > var10; ++var10) {
            int var11;
            int var10001;
            for(var11 = var9; 0 > var11; ++var11) {
               var10001 = var3++;
               var2[var10001] -= var1[var4++];
               var10001 = var3++;
               var2[var10001] -= var1[var4++];
               var10001 = var3++;
               var2[var10001] -= var1[var4++];
               var10001 = var3++;
               var2[var10001] -= var1[var4++];
            }

            for(var11 = var5; 0 > var11; ++var11) {
               var10001 = var3++;
               var2[var10001] -= var1[var4++];
            }

            var3 += var6;
            var4 += var8;
         }

      }
   }

   static final int a(int var0, byte[] var1, int var2) {
      ++a;
      if(var0 != 19) {
         d = (Object[])((Object[])d[3]);
      }

      return hja.a(-1891070232, var1, var2, 0);
   }

   static final void a(byte var0) {
      if(var0 > -76) {
         f_i = (Color[])null;
      }

      ++c;
      int var1 = 0;
      if(tu.d != null) {
         var1 = bt.a((Object[])((Object[])tu.d[4]), (byte)-54);
      }

      int var2;
      int var3;
      if(var1 == 2) {
         var2 = 800 < rp.a?800:rp.a;
         wr.n = var2;
         var3 = 600 >= jma.h?jma.h:600;
         pa.f_i = (rp.a - var2) / 2;
         mr.e = 0;
         nma.a = var3;
      } else if(var1 != 1) {
         mr.e = 0;
         pa.f_i = 0;
         nma.a = jma.h;
         wr.n = rp.a;
      } else {
         var2 = rp.a > 1024?1024:rp.a;
         var3 = 768 >= jma.h?jma.h:768;
         wr.n = var2;
         pa.f_i = (-var2 + rp.a) / 2;
         nma.a = var3;
         mr.e = 0;
      }

   }

}
