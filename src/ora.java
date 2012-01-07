
final class ora extends lm {

   static int k;
   static int n;
   static int j;
   static int f_l;
   static int m;
   static Object[] p = ho.a(-1, 71, new Object[1], true);
   static int o;


   static final boolean a(Object[] var0, byte var1) {
      if(var1 > -78) {
         p = (Object[])((Object[])var0[5]);
      }

      ++o;
      if(null != var0 && var0.length == 6) {
         if(null == var0[3]) {
            var0[3] = lh.a(vra.d, ((int[])((int[])var0[0]))[2], 0);
         }

         boolean var2;
         if(var0[3] == null) {
            var2 = false;
         } else {
            lh var4 = (lh)var0[3];
            boolean var3;
            if(var4 == null) {
               var3 = true;
            } else {
               label56: {
                  bp.c = null;
                  gma.d = null;
                  if(sfa.h != var4) {
                     sfa.h = var4;
                     kt.d = 0;
                  }

                  gta.a = null;
                  dl.d = 0;
                  rua.a = null;
                  if(0 == kt.d) {
                     Object[] var6 = new Object[4];
                     Object[] var7 = dja.b;
                     Object[] var8 = rsa.a;
                     ev.a(var6, 2519);
                     var6[2] = var7;
                     var6[1] = var8;
                     hv.g = var6;
                     mk.a(26532, qs.h);
                     kt.d = 1;
                  }

                  if(kt.d == 1) {
                     if(!iaa.a(jea.h, hv.g, qs.h, 22050, var4, true)) {
                        var3 = false;
                        break label56;
                     }

                     kt.d = 0;
                     hv.g = null;
                     sfa.h = null;
                  }

                  var3 = true;
               }
            }

            if(!var3) {
               var2 = false;
            } else {
               var2 = true;
            }
         }

         return var2;
      } else {
         return it.a(-2, var0);
      }
   }

   static final void a(int var0, byte var1, Object[] var2) {
      byte[] var10000 = (byte[])((byte[])var2[2]);
      int[] var10001 = (int[])((int[])var2[1]);
      int var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)(128 + var0);
      ++n;
      if(var1 <= 62) {
         p = (Object[])null;
      }

   }

   ora(Object[] var1) {}

   static final void a(Object[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, Object[] var11) {
      ++f_l;
      if(1 != var7) {
         if(2 != var7) {
            if(var7 == 3) {
               var1 = 1;
            }
         } else {
            var2 = 1;
            var1 = 1;
         }
      } else {
         var2 = 1;
      }

      if(var9 == 1) {
         int var12;
         if(var6 >= 0 && ~var6 > ~((int[])((int[])var11[1]))[0] && var3 >= 0 && var3 < ((int[])((int[])var11[1]))[2]) {
            if(var11 != null && var11.length == 2) {
               vk.a = false;
            }

            if(!((boolean[])((boolean[])var11[3]))[0] && !var10) {
               pd.b[var5][var6][var3] = 0;
            }

            while(true) {
               var12 = fh.a(var0, false);
               if(var12 != 0) {
                  if(var12 != 1) {
                     if(49 >= var12) {
                        if(var10) {
                           fh.a(var0, false);
                        } else {
                           ((byte[][][])((byte[][][])var11[5]))[var5][var6][var3] = ipa.a(var0, (int)-124);
                           ((byte[][][])((byte[][][])var11[6]))[var5][var6][var3] = (byte)((-2 + var12) / 4);
                           ((byte[][][])((byte[][][])var11[10]))[var5][var6][var3] = (byte)(3 & var7 + var12 - 2);
                        }
                     } else if(var12 <= 81) {
                        if(!((boolean[])((boolean[])var11[3]))[0] && !var10) {
                           pd.b[var5][var6][var3] = (byte)(var12 - 49);
                        }
                     } else if(!var10) {
                        ((byte[][][])((byte[][][])var11[11]))[var5][var6][var3] = (byte)(-81 + var12);
                     }
                     continue;
                  }

                  int var19 = fh.a(var0, false);
                  if(((boolean[])((boolean[])var11[3]))[0]) {
                     ((int[][][])((int[][][])var11[4]))[0][var1 + var6][var3 + var2] = 8 * var19 << 2;
                  } else {
                     if(var19 == 1) {
                        var19 = 0;
                     }

                     if(var5 == 0) {
                        ((int[][][])((int[][][])var11[4]))[0][var1 + var6][var3 + var2] = -var19 * 8 << 2;
                     } else {
                        ((int[][][])((int[][][])var11[4]))[var5][var1 + var6][var3 + var2] = -(var19 * 8 << 2) + ((int[][][])((int[][][])var11[4]))[var5 - 1][var1 + var6][var2 + var3];
                     }
                  }
                  break;
               }

               if(((boolean[])((boolean[])var11[3]))[0]) {
                  ((int[][][])((int[][][])var11[4]))[0][var1 + var6][var3 + var2] = 0;
               } else if(0 != var5) {
                  ((int[][][])((int[][][])var11[4]))[var5][var1 + var6][var2 + var3] = ((int[][][])((int[][][])var11[4]))[var5 - 1][var6 + var1][var2 + var3] - 960;
               } else {
                  int[] var13 = ((int[][][])((int[][][])var11[4]))[0][var6 + var1];
                  int var14 = var3 + var2;
                  int var16 = var8 + 932731;
                  int var17 = var4 + 556238;
                  int var18 = nf.a(4, -1, var16 - -45365, var17 + 91923) - (128 - ((-128 + nf.a(2, var9 ^ -2, var16 + 10294, '\u93bd' + var17) >> 1) + (nf.a(1, var9 ^ -2, var16, var17) - 128 >> 2)));
                  var18 = 35 + (int)((double)var18 * 0.3D);
                  if(var18 >= 10) {
                     if(60 < var18) {
                        var18 = 60;
                     }
                  } else {
                     var18 = 10;
                  }

                  var13[var14] = -var18 * 8 << 2;
               }
               break;
            }
         } else {
            if(null != var11 && var11.length == 1) {
               nua.e = -77;
            }

            while(true) {
               var12 = fh.a(var0, false);
               if(var12 == 0) {
                  break;
               }

               if(1 == var12) {
                  fh.a(var0, false);
                  break;
               }

               if(var12 <= 49) {
                  fh.a(var0, false);
               }
            }
         }

      }
   }

   static final void a(byte var0, Object[] var1) {
      var1[5] = null;
      ((int[])((int[])var1[1]))[5] = 0;
      ++m;
      if(var0 >= -72) {
         p = (Object[])((Object[])var1[10]);
      }

      ((int[])((int[])var1[1]))[3] = 0;
      ((int[])((int[])var1[1]))[1] = -1;
      ((int[])((int[])var1[1]))[4] = -1;
   }

   static final void a(int var0, int var1, int var2, Object[] var3) {
      gg.a = var3;
      ++k;
      gq.g = var0;
      vla.g = var2;
      if(var1 != -11) {
         ((byte[])((byte[])p[8]))[3] = ((byte[])((byte[])((Object[])((Object[])p[1]))[0]))[9];
      }

   }

   static final void a(int[] var0, int[] var1, int[] var2, Object[] var3, int var4) {
      ++j;
      int var5 = 0;
      if(var4 != 18784) {
         a((int[])null, (int[])null, (int[])null, (Object[])null, -126);
      }

      while(var1.length > var5) {
         int var6 = var1[var5];
         int var7 = var0[var5];
         if(null != var3 && (-7 == ~var3.length || var3.length == 1)) {
            lta.c = -28;
         }

         int var8 = var2[var5];

         for(int var9 = 0; 0 != var7 && ((Object[])((Object[])var3[20])).length > var9; var7 >>>= 1) {
            if(-1 != ~(var7 & 1)) {
               if(-1 != var6) {
                  Object[] var10 = bs.a(he.b, -15, var6);
                  int var11 = ((int[])((int[])var10[1]))[4];
                  Object[] var12 = ((Object[][])((Object[][])var3[20]))[var9];
                  if(var12 != null && wna.a(var12, 4)) {
                     if(var6 == lt.a((byte)-82, var12)) {
                        if(var11 == 0) {
                           var12 = null;
                           ((Object[][])((Object[][])var3[20]))[var9] = null;
                        } else if(1 != var11) {
                           if(var11 == 2) {
                              ei.a(var12, (byte)104);
                           }
                        } else {
                           hna.a(var4 - 18910, var12);
                           ((int[])((int[])var12[1]))[6] = var8;
                        }
                     } else if(~((int[])((int[])var10[1]))[1] <= ~((int[])((int[])nc.a(false, var12)[1]))[1]) {
                        var12 = null;
                        ((Object[][])((Object[][])var3[20]))[var9] = null;
                     }
                  }

                  if(null == var12 || !wna.a(var12, var4 ^ 18788)) {
                     Object[][] var13 = (Object[][])((Object[][])var3[20]);
                     Object[] var16 = new Object[6];
                     sw.a(var16, false);
                     lea.a(var3, false, (byte)-106, var16);
                     var12 = var13[var9] = var16;
                     rs.a(var6, var12, 118);
                     ((int[])((int[])var12[1]))[6] = var8;
                  }
               } else {
                  ((Object[][])((Object[][])var3[20]))[var9] = null;
               }
            }

            ++var9;
         }

         ++var5;
      }

      if(null != var3 && (var3.length == 6 || 5 == var3.length && var3[0].equals(Integer.valueOf(2)) && var3[0].equals(Integer.valueOf(0)))) {
         ira.f[2] = null;
      }

   }

}
