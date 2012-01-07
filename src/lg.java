
final class lg {

   static int b;
   static int a;
   static int g;
   static Object[] h;
   static int c;
   static int f;
   static int d;
   static int e;


   static final void a(int var0) {
      ++f;
      if(var0 > -103) {
         h = (Object[])null;
      }

      nq var1;
      nq var2;
      for(Object[] var5 = null != (var1 = (nq)gm.a(rpa.b, 0))?var1.u:null; null != var5; var5 = (var2 = (nq)dka.a(rpa.b, (byte)106)) != null?var2.u:null) {
         if(((int[])((int[])var5[1]))[0] > 1) {
            ((int[])((int[])var5[1]))[0] = 0;
            ni var4;
            il.a(((long[])((long[])((var4 = (ni)((tha)((Object[])((Object[])var5[0]))[0]).s) == null?null:var4.t)[2]))[0], null != var5?var5[2]:null, true, dla.c);
            bba.a((Object[])((Object[])var5[0]), -19425);
         }
      }

      fka.c = 0;
      nma.h = 0;
      nb.b(ssa.d, 0);
      ona.a(ov.a, -82);
      bba.a(rpa.b, -19425);
      kea.c = false;
   }

   static final void a(byte var0, Object[] var1) {
      ++g;
      if(var0 > 39) {
         if(null != var1 && var1.length == 12) {
            ola.a(7, var1);
         } else if(var1 != null && var1.length == 9) {
            cg.a(var1, (byte)-107);
            var1[6] = ib.a((Object[])((Object[])var1[5]), 16, ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[7]);
         } else {
            cg.a(var1, (byte)-107);
         }
      }
   }

   static final void a(Object[] var0, int var1) {
      hca.a(0, (Object[])((Object[])var0[39]), var0, 0);
      ++e;
      ws.a(98, (Object[])((Object[])var0[68]), var0);
      woa.a(1, rma.a, (byte)-109, var0, 0);
      if(var1 >= -116) {
         h = new Object[4];
      }

   }

   static final boolean a(int var0, int var1, int var2, boolean var3, Object[][][][] var4, int var5) {
      ++b;
      byte var6 = !var3?(byte)(255 & OutputStreamWorker.c):1;
      if(~var6 == ~fga.d[jca.n][var1][var2]) {
         return false;
      } else if(0 == (4 & pd.b[jca.n][var1][var2])) {
         return false;
      } else {
         byte var7 = 0;
         if(var0 != 3) {
            h = (Object[])((Object[])h[0]);
         }

         int var8 = 0;
         gq.d[var7] = var1;
         int var24 = var7 + 1;
         jm.j[var7] = var2;
         fga.d[jca.n][var1][var2] = var6;

         while(var8 != var24) {
            int var9 = '\uffff' & gq.d[var8];
            int var10 = gq.d[var8] >> 16 & 255;
            int var11 = 255 & gq.d[var8] >> 24;
            int var12 = '\uffff' & jm.j[var8];
            int var13 = 255 & jm.j[var8] >> 16;
            var8 = 4095 & 1 + var8;
            boolean var14 = false;
            if(0 == (pd.b[jca.n][var9][var12] & 4)) {
               var14 = true;
            }

            boolean var15 = false;
            int var17;
            int var16;
            int var18;
            if(var4 != null) {
               label305:
               for(var16 = 1 + jca.n; var16 <= 3; ++var16) {
                  if(var4[var16] != null && (pd.b[var16][var9][var12] & 8) == 0) {
                     Object[] var19;
                     int var21;
                     Object[] var25;
                     Object[] var26;
                     if(var14 && null != var4[var16][var9][var12]) {
                        if(var4[var16][var9][var12][4] != null) {
                           var17 = qqa.a((byte)-71, var10);
                           if(var17 == ((short[])((short[])((Object[])((Object[])var4[var16][var9][var12][4]))[15]))[0] || var4[var16][var9][var12][2] != null && ((short[])((short[])((Object[])((Object[])var4[var16][var9][var12][2]))[15]))[0] == var17) {
                              continue;
                           }

                           if(0 != var11) {
                              var18 = qqa.a((byte)125, var11);
                              if(var18 == ((short[])((short[])((Object[])((Object[])var4[var16][var9][var12][4]))[15]))[0] || var4[var16][var9][var12][2] != null && var18 == ((short[])((short[])((Object[])((Object[])var4[var16][var9][var12][2]))[15]))[0]) {
                                 continue;
                              }
                           }

                           if(0 != var13) {
                              var18 = qqa.a((byte)125, var13);
                              if(((short[])((short[])((Object[])((Object[])var4[var16][var9][var12][4]))[15]))[0] == var18 || null != var4[var16][var9][var12][2] && ((short[])((short[])((Object[])((Object[])var4[var16][var9][var12][2]))[15]))[0] == var18) {
                                 continue;
                              }
                           }
                        }

                        var25 = var4[var16][var9][var12];
                        if(null != var25[3]) {
                           for(var26 = (Object[])((Object[])var25[3]); null != var26; var26 = (Object[])((Object[])var26[0])) {
                              var19 = (Object[])((Object[])var26[1]);
                              if(var19 != null && var19.length <= 18) {
                                 var21 = wua.a(var19, 10405);
                                 if(21 == var21) {
                                    var21 = 19;
                                 }

                                 int var22 = vm.a((byte)20, var19);
                                 int var23 = var21 | var22 << 6;
                                 if(var23 == var10 || 0 != var11 && var23 == var11 || 0 != var13 && var13 == var23) {
                                    continue label305;
                                 }
                              }
                           }
                        }
                     }

                     var25 = var4[var16][var9][var12];
                     if(null != var25 && var25[3] != null) {
                        if(null != var25 && 13 == var25.length) {
                           mca.g = null;
                        }

                        for(var26 = (Object[])((Object[])var25[3]); var26 != null; var26 = (Object[])((Object[])var26[0])) {
                           var19 = (Object[])((Object[])var26[1]);
                           if(~((short[])((short[])var19[13]))[0] != ~((short[])((short[])var19[13]))[1] || ~((short[])((short[])var19[13]))[3] != ~((short[])((short[])var19[13]))[2]) {
                              if(var25 != null && (var25.length == 4 && var25[1].equals(Integer.valueOf(0)) && var25[1].equals(Integer.valueOf(0)) || var25.length == 6 && var25[3].equals(Integer.valueOf(0)) && var25[3].equals(Integer.valueOf(1)))) {
                                 ((boolean[])((boolean[])dh.e[18]))[25] = true;
                              }

                              for(int var20 = ((short[])((short[])var19[13]))[1]; ~var20 >= ~((short[])((short[])var19[13]))[0]; ++var20) {
                                 for(var21 = ((short[])((short[])var19[13]))[3]; ((short[])((short[])var19[13]))[2] >= var21; ++var21) {
                                    fga.d[var16][var20][var21] = var6;
                                 }

                                 if(var19 != null && var19.length == 3 && var19[2].equals(Integer.valueOf(0))) {
                                    client.a((Object[])null);
                                 }
                              }
                           }
                        }
                     }

                     var15 = true;
                     fga.d[var16][var9][var12] = var6;
                  }
               }
            }

            if(var15) {
               var16 = jp.o[1 + jca.n].b(-100, var12, var9);
               if(var16 > qv.a[var5]) {
                  qv.a[var5] = var16;
               }

               var17 = var9 << 9;
               if(var17 < tp.m[var5]) {
                  tp.m[var5] = var17;
               } else if(~var17 < ~jta.a[var5]) {
                  jta.a[var5] = var17;
               }

               var18 = var12 << 9;
               if(var18 >= dg.c[var5]) {
                  if(var18 > dua.a[var5]) {
                     dua.a[var5] = var18;
                  }
               } else {
                  dg.c[var5] = var18;
               }
            }

            if(!var14) {
               if(1 <= var9 && var6 != fga.d[jca.n][var9 - 1][var12]) {
                  gq.d[var24] = var9 - 1 | 1179648 | -754974720;
                  jm.j[var24] = var12 | 1245184;
                  var24 = 1 + var24 & 4095;
                  fga.d[jca.n][-1 + var9][var12] = var6;
               }

               int var10000 = ~wpa.a;
               ++var12;
               if(var10000 < ~var12) {
                  if(-1 >= ~(-1 + var9) && ~var6 != ~fga.d[jca.n][-1 + var9][var12] && (pd.b[jca.n][var9][var12] & 4) == 0 && -1 == ~(4 & pd.b[jca.n][var9 - 1][-1 + var12])) {
                     gq.d[var24] = 1375731712 | -1 + var9 | 1179648;
                     jm.j[var24] = var12 | 1245184;
                     var24 = 4095 & var24 + 1;
                     fga.d[jca.n][var9 - 1][var12] = var6;
                  }

                  if(fga.d[jca.n][var9][var12] != var6) {
                     gq.d[var24] = var9 | 5373952 | 318767104;
                     jm.j[var24] = var12 | 5439488;
                     fga.d[jca.n][var9][var12] = var6;
                     var24 = 1 + var24 & 4095;
                  }

                  if(var9 + 1 < rp.c && fga.d[jca.n][var9 + 1][var12] != var6 && (4 & pd.b[jca.n][var9][var12]) == 0 && -1 == ~(4 & pd.b[jca.n][var9 + 1][-1 + var12])) {
                     gq.d[var24] = -1845493760 | 5373952 | var9 + 1;
                     jm.j[var24] = 5439488 | var12;
                     var24 = 4095 & 1 + var24;
                     fga.d[jca.n][1 + var9][var12] = var6;
                  }
               }

               --var12;
               if(rp.c > var9 + 1 && fga.d[jca.n][var9 + 1][var12] != var6) {
                  gq.d[var24] = 1392508928 | 1 + var9 | 9568256;
                  jm.j[var24] = 9633792 | var12;
                  fga.d[jca.n][var9 + 1][var12] = var6;
                  var24 = var24 + 1 & 4095;
               }

               --var12;
               if(-1 >= ~var12) {
                  if(-1 >= ~(var9 - 1) && fga.d[jca.n][-1 + var9][var12] != var6 && 0 == (pd.b[jca.n][var9][var12] & 4) && (pd.b[jca.n][-1 + var9][var12 + 1] & 4) == 0) {
                     gq.d[var24] = 301989888 | -1 + var9 | 13762560;
                     jm.j[var24] = 13828096 | var12;
                     var24 = 4095 & var24 + 1;
                     fga.d[jca.n][-1 + var9][var12] = var6;
                  }

                  if(~var6 != ~fga.d[jca.n][var9][var12]) {
                     gq.d[var24] = var9 | 13762560 | -1828716544;
                     jm.j[var24] = var12 | 13828096;
                     fga.d[jca.n][var9][var12] = var6;
                     var24 = var24 + 1 & 4095;
                  }

                  if(var9 + 1 < rp.c && ~var6 != ~fga.d[jca.n][var9 + 1][var12] && -1 == ~(pd.b[jca.n][var9][var12] & 4) && (4 & pd.b[jca.n][var9 + 1][1 + var12]) == 0) {
                     gq.d[var24] = -771751936 | 9568256 | var9 + 1;
                     jm.j[var24] = 9633792 | var12;
                     var24 = var24 + 1 & 4095;
                     fga.d[jca.n][var9 + 1][var12] = var6;
                  }
               }
            }
         }

         if(qv.a[var5] != -1000000) {
            qv.a[var5] += 40;
            tp.m[var5] -= 512;
            jta.a[var5] += 512;
            dua.a[var5] += 512;
            dg.c[var5] -= 512;
         }

         return true;
      }
   }

   static final void a(int var0, Object[] var1, int var2, int var3) {
      if(var3 == 4095) {
         ++a;
         if(var0 == 0) {
            ((int[])((int[])var1[1]))[8] = -(var2 >= 0?var2:-var2) + ((int[])((int[])var1[1]))[12];
            ((int[])((int[])var1[1]))[8] = ((int[])((int[])var1[1]))[8] * ((int[])((int[])var1[1]))[8] >> 12;
            ((int[])((int[])var1[1]))[11] = 4096;
            ((int[])((int[])var1[1]))[10] = ((int[])((int[])var1[1]))[8];
         } else {
            ((int[])((int[])var1[1]))[11] = ((int[])((int[])var1[1]))[8] * ((int[])((int[])var1[1]))[7] >> 12;
            ((int[])((int[])var1[1]))[8] = ((int[])((int[])var1[1]))[12] + -(var2 >= 0?var2:-var2);
            if(0 > ((int[])((int[])var1[1]))[11]) {
               ((int[])((int[])var1[1]))[11] = 0;
            } else if(4096 < ((int[])((int[])var1[1]))[11]) {
               ((int[])((int[])var1[1]))[11] = 4096;
            }

            ((int[])((int[])var1[1]))[8] = ((int[])((int[])var1[1]))[8] * ((int[])((int[])var1[1]))[8] >> 12;
            ((int[])((int[])var1[1]))[8] = ((int[])((int[])var1[1]))[8] * ((int[])((int[])var1[1]))[11] >> 12;
            ((int[])((int[])var1[1]))[10] += ((int[])((int[])var1[1]))[8] * ((int[])((int[])var1[1]))[5] >> 12;
            ((int[])((int[])var1[1]))[5] = ((int[])((int[])var1[1]))[5] * ((int[])((int[])var1[1]))[9] >> 12;
         }

      }
   }

   static final void a(boolean var0, int var1, byte var2) {
      ++d;
      if(var2 >= -35) {
         a(((int[])((int[])h[1]))[12], (Object[])null, 11, ((int[])((int[])((Object[])((Object[])h[0]))[8]))[0]);
      }

      cf.a((byte)-92, var0, var1, gj.a(dp.y, -45, gj.f_vb));
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      ((float[])((float[])var0[0]))[0] = ((float[])((float[])var1[0]))[0];
      ((float[])((float[])var0[0]))[11] = ((float[])((float[])var1[0]))[11];
      ((float[])((float[])var0[0]))[8] = ((float[])((float[])var1[0]))[8];
      ((float[])((float[])var0[0]))[9] = ((float[])((float[])var1[0]))[9];
      ((float[])((float[])var0[0]))[10] = ((float[])((float[])var1[0]))[10];
      ((float[])((float[])var0[0]))[6] = ((float[])((float[])var1[0]))[6];
      if(var2 != -18072) {
         a((byte)-28, (Object[])((Object[])var0[2]));
      }

      ((float[])((float[])var0[0]))[1] = ((float[])((float[])var1[0]))[1];
      ++c;
      ((float[])((float[])var0[0]))[3] = ((float[])((float[])var1[0]))[3];
      ((float[])((float[])var0[0]))[5] = ((float[])((float[])var1[0]))[5];
      if(null != var1 && (var1.length == 3 || -19 == ~var1.length && var1[14].equals(Integer.valueOf(1)))) {
         mv.a((byte)104, (Object[])null, (Object[])null);
      }

      ((float[])((float[])var0[0]))[4] = ((float[])((float[])var1[0]))[4];
      ((float[])((float[])var0[0]))[2] = ((float[])((float[])var1[0]))[2];
      ((float[])((float[])var0[0]))[7] = ((float[])((float[])var1[0]))[7];
   }

}
