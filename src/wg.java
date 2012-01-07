import jagdx.sta;

final class wg extends tha {

   static int v;
   static int w;
   static int x;
   Object[] t;
   static float[] z = new float[16];
   static int y;
   static int u;


   static final void b(int var0) {
      if(var0 == -24253) {
         if(cj.k != null) {
            cj.k = null;
            ha.a(bma.k, csa.f, sba.e, dga.n, true);
         }

         ++x;
         kea.c = false;
         ha.a(ff.a, vta.v, ld.b, kb.a, true);
      }
   }

   static final void a(Object[] var0, byte var1, int var2, Object[] var3, Object[] var4) {
      if(var1 <= 72) {
         b(((int[])((int[])var3[2]))[6]);
      }

      ++u;
      if(null != var4 && var4.length == 16) {
         qsa.a(var3, var4, var0, (byte)-123, var2);
      } else if(null != var4 && var4.length == 12) {
         qia.a(var3, var4, var0, -27549, var2);
      } else {
         throw new IllegalStateException();
      }
   }

   static final int a(Object[] var0, int var1) {
      if(var1 != 1) {
         var0[2] = (Object)null;
      }

      ++y;
      int var2 = 0;

      for(lm var3 = ((lm)var0[0]).f; var0[0] != var3; ++var2) {
         var3 = var3.f;
      }

      return var2;
   }

   static final void c(byte var0) {
      if(var0 >= 78) {
         ++w;

         mh var1;
         mh var3;
         for(Object[] var4 = (var1 = (mh)dda.a(gn.r, 2)) != null?var1.u:null; null != var4; var4 = null != (var3 = (mh)client.a(gn.r, -28280))?var3.u:null) {
            Object[] var5 = (Object[])((Object[])var4[0]);
            if(((int[])((int[])var5[12]))[4] >= kda.d) {
               if(~kda.d <= ~((int[])((int[])var5[12]))[13]) {
                  wea.b((byte)119, var5);
                  Object[] var6;
                  Object[] var8;
                  if(((int[])((int[])var5[12]))[6] > 0) {
                     Object[] var7;
                     if(0 == bw.b) {
                        var6 = za.a(ofa.e[((int[])((int[])var5[12]))[6] - 1], (byte)93);
                        if(var6 != null) {
                           var7 = (Object[])((Object[])woa.a(5, var6)[1]);
                           if((int)((float[])((float[])var7[1]))[2] >= 0 && (int)((float[])((float[])var7[1]))[2] < 512 * rp.c && -1 >= ~((int)((float[])((float[])var7[1]))[1]) && (int)((float[])((float[])var7[1]))[1] < 512 * wpa.a) {
                              fn.a((int)((float[])((float[])var7[1]))[1], kda.d, (int)((float[])((float[])var7[1]))[2], var5, Class_ds.a(((byte[])((byte[])var6[10]))[0], (int)((float[])((float[])var7[1]))[2], (int)((float[])((float[])var7[1]))[1], (byte)122) - ((int[])((int[])var5[12]))[11], 119);
                           }
                        }
                     } else {
                        hna var12 = (hna)pm.a((long)(-1 + ((int[])((int[])var5[12]))[6]), hf.g, false);
                        if(null != var12) {
                           var7 = var12.k;
                           var8 = (Object[])((Object[])woa.a(5, var7)[1]);
                           if((int)((float[])((float[])var8[1]))[2] >= 0 && ~((int)((float[])((float[])var8[1]))[2]) > ~(512 * rp.c) && (int)((float[])((float[])var8[1]))[1] >= 0 && (int)((float[])((float[])var8[1]))[1] < 512 * wpa.a) {
                              fn.a((int)((float[])((float[])var8[1]))[1], kda.d, (int)((float[])((float[])var8[1]))[2], var5, Class_ds.a(((byte[])((byte[])var5[10]))[0], (int)((float[])((float[])var8[1]))[2], (int)((float[])((float[])var8[1]))[1], (byte)122) + -((int[])((int[])var5[12]))[11], 118);
                           }
                        }
                     }
                  }

                  if(((int[])((int[])var5[12]))[6] < 0) {
                     int var14 = -((int[])((int[])var5[12]))[6] - 1;
                     if(var14 == dp.r) {
                        var6 = uta.g;
                     } else {
                        var6 = vo.E[var14];
                     }

                     if(null != var6) {
                        var8 = (Object[])((Object[])woa.a(5, var6)[1]);
                        if(-1 >= ~((int)((float[])((float[])var8[1]))[2]) && (int)((float[])((float[])var8[1]))[2] < 512 * rp.c && -1 >= ~((int)((float[])((float[])var8[1]))[1]) && ~((int)((float[])((float[])var8[1]))[1]) > ~(wpa.a * 512)) {
                           fn.a((int)((float[])((float[])var8[1]))[1], kda.d, (int)((float[])((float[])var8[1]))[2], var5, Class_ds.a(((byte[])((byte[])var5[10]))[0], (int)((float[])((float[])var8[1]))[2], (int)((float[])((float[])var8[1]))[1], (byte)122) - ((int[])((int[])var5[12]))[11], 113);
                        }
                     }
                  }

                  int var13 = Class_ds.c;
                  ((boolean[])((boolean[])var5[8]))[7] = true;
                  var8 = new Object[3];
                  Object[] var9 = woa.a(5, var5);
                  rca var11 = new rca(var8);
                  var8[0] = var11;
                  var8[2] = wua.a(true, new Object[2]);
                  var8[1] = nj.a(3, new Object[2]);
                  ib.a(1, var8, var9);
                  ((float[])((float[])((Object[])((Object[])var8[1]))[1]))[2] = (float)((double)((float[])((float[])((Object[])((Object[])var8[1]))[1]))[2] + (double)var13 * ((double[])((double[])var5[14]))[0]);
                  if(null != var5 && (var5.length == 5 || 12 == var5.length && var5[8].equals(Integer.valueOf(0)))) {
                     iea.a((byte)39);
                  }

                  ((float[])((float[])((Object[])((Object[])var8[1]))[1]))[1] = (float)((double)((float[])((float[])((Object[])((Object[])var8[1]))[1]))[1] + (double)var13 * ((double[])((double[])var5[14]))[3]);
                  if(((boolean[])((boolean[])var5[8]))[5]) {
                     ((float[])((float[])((Object[])((Object[])var8[1]))[1]))[0] = (float)(Class_ds.a(((byte[])((byte[])var5[10]))[0], (int)((float[])((float[])((Object[])((Object[])var8[1]))[1]))[2], (int)((float[])((float[])((Object[])((Object[])var8[1]))[1]))[1], (byte)122) + -((int[])((int[])var5[12]))[10]);
                  } else if(((int[])((int[])var5[12]))[7] == -1) {
                     ((float[])((float[])((Object[])((Object[])var8[1]))[1]))[0] = (float)((double)((float[])((float[])((Object[])((Object[])var8[1]))[1]))[0] + ((double[])((double[])var5[14]))[4] * (double)var13);
                  } else {
                     ((float[])((float[])((Object[])((Object[])var8[1]))[1]))[0] = (float)((double)((float[])((float[])((Object[])((Object[])var8[1]))[1]))[0] + (double)var13 * ((double[])((double[])var5[14]))[4] + (double)var13 * 0.5D * ((double[])((double[])var5[14]))[2] * (double)var13);
                     ((double[])((double[])var5[14]))[4] += (double)var13 * ((double[])((double[])var5[14]))[2];
                  }

                  rg.a((float)Math.atan2(((double[])((double[])var5[14]))[4], ((double[])((double[])var5[14]))[1]), 22362, (Object[])((Object[])var8[2]), bl.a((byte)-121, 1.0F, new Object[2], 0.0F, 0.0F));
                  Object[] var15 = wua.a(true, new Object[2]);
                  rg.a(-3.1415927F + (float)Math.atan2(((double[])((double[])var5[14]))[0], ((double[])((double[])var5[14]))[3]), 22362, var15, bl.a((byte)-104, 0.0F, new Object[2], 0.0F, 1.0F));
                  ija.a((Object[])((Object[])var8[2]), var15, false);
                  np.a(111, var8, var5);
                  if(iha.a(1, (byte)-115, (Object[])((Object[])var5[19])) && ela.a((Object[])((Object[])var5[19]), 3)) {
                     hna.a(-85, (Object[])((Object[])var5[19]));
                  }

                  eja.a(var5, true);
               }
            } else {
               ((lm)(var4 == null?null:var4[1])).a((byte)53);
               if(null != var5[18]) {
                  ((ch)var5[18]).d();
               }
            }
         }

      }
   }

   static final int a(byte var0, Object[] var1, Object[] var2) {
      if(var0 <= 3) {
         return ((int[])((int[])var2[5]))[15];
      } else {
         ++v;
         int var3 = ((int[])((int[])var2[0]))[0];
         if(6 == var3) {
            var3 = ((int[])((int[])var1[0]))[1];
            if(4 == var3) {
               return 28;
            }

            if(2 == var3) {
               return sta.b;
            }

            if(8 == var3) {
               return 77;
            }

            if(1 == var3) {
               return 51;
            }

            if(7 == var3) {
               return 21;
            }

            if(var3 == 6) {
               return sta.a;
            }

            if(9 == var3) {
               return 22;
            }

            if(var3 == 5) {
               return 50;
            }
         } else if(0 != var3) {
            if(var3 == 1 && var1 == ah.f) {
               return 113;
            }
         } else if(ah.f == var1) {
            return 116;
         }

         throw new IllegalArgumentException("");
      }
   }

   static final void a(ya var0, int var1, int var2, int var3, boolean[] var4) {
      if(jp.o != wd.a) {
         int var5 = bf.f_l[var1].a(1, var2, var3);

         for(int var6 = 0; var6 <= var1; ++var6) {
            if(var4 == null || var4[var6]) {
               aa var7 = bf.f_l[var6];
               if(var7 != null) {
                  var7.GA(var0, var2, var5 - var7.a(1, var2, var3), var3, 0, false);
               }
            }
         }
      }

   }

   wg(Object[] var1) {
      this.t = var1;
   }

}
