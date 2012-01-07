import jagdx.IDirect3DDevice;
import jagdx.fna;

final class eia {

   static int e;
   static int f;
   static int a;
   static int h;
   static int d;
   static int b;
   static Object[] c = rba.a(8, new Object[4], 125);
   static int g;


   static final boolean a(Object[] var0, int var1) {
      ++f;
      if(((boolean[])((boolean[])var0[var1]))[0]) {
         return true;
      } else {
         if(var0[1] == null) {
            var0[1] = new Thread((Runnable)(var0 == null?null:var0[0]));
            ((Thread)var0[1]).start();
         }

         return ((boolean[])((boolean[])var0[2]))[0];
      }
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++h;
      sj.a((Object[])((Object[])var1[8]), (byte)-31, (int)0);
      if(var0 <= 117) {
         a(new Object[3], 43);
      }

      mqa.a((Object[])((Object[])var1[8]), Class_t.c, (byte)104, pba.b);
      mb.a((Object[])((Object[])var1[8]), 13195, haa.b, 0);
      roa.a(pba.g, 106, (Object[])((Object[])var1[8]), 0);
      mb.a((Object[])((Object[])var1[8]), 13195, pba.g, 1);
      roa.a(pba.g, 98, (Object[])((Object[])var1[8]), 1);
      oja.b(var1, 8);
   }

   static final void a(Object[] var0, int var1, int var2, int var3, int var4) {
      if(var4 == -27919) {
         ++b;
         int[] var10000 = (int[])((int[])var0[3]);
         Object[] var5;
         int var10001 = ((aa)(null != (var5 = (Object[])((Object[])var0[8]))?var5[6]:null)).f_i * var3 + var2;
         var10000[var10001] |= 1 << var1;
      }
   }

   static final void a(Object[] var0, int var1, int var2, int var3) throws cr {
      int var4 = -54 % ((var2 - 45) / 36);
      ++d;
      if(var0 != null && 87 == var0.length) {
         IDirect3DDevice.EndScene(((long[])((long[])var0[50]))[5]);
         int var6 = ((ta)var0[38]).m.f();
         if(fna.a(false, var6)) {
            label33: {
               if(var6 == -2005530520) {
                  ((ta)var0[38]).m.c();
                  ma.a(var0, 50);
                  ww var5;
                  bk.b((var5 = (ww)((ta)var0[38]).m) == null?null:var5.m, (byte)-115);
                  if(client.f_vb == 0) {
                     break label33;
                  }
               }

               if(++((int[])((int[])var0[1]))[43] > 50) {
                  throw new cr();
               }
            }
         } else {
            ((int[])((int[])var0[1]))[43] = 0;
         }

         IDirect3DDevice.BeginScene(((long[])((long[])var0[50]))[5]);
      } else if(null != var0 && var0.length == 91) {
         ((ta)var0[38]).m.f();
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(int var0, Object[] var1, int var2, int var3) {
      ++g;
      int var4 = ((int[])((int[])var1[0]))[3] * var0 >> 12;
      int var5 = var0 * ((int[])((int[])var1[0]))[4] >> 12;
      int var6 = var2 * ((int[])((int[])var1[0]))[5] >> 12;
      int var7 = var2 * ((int[])((int[])var1[0]))[6] >> 12;
      id.a(var6, (byte)109, var5, ((int[])((int[])var1[var3]))[0], var7, var4);
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Object[] var10) {
      ++e;
      if(fh.a(var9, 25401, (int[])null)) {
         if(var10 != null) {
            boolean var11;
            if(null != var10 && -6 == ~var10.length) {
               var11 = kd.b(var10, 1);
            } else if(var10 != null && var10.length == 6) {
               var11 = iu.a(1, var10);
            } else {
               boolean var12;
               if(var10 != null && var10.length == 3) {
                  Object[] var14 = (Object[])((Object[])var10[2]);
                  int var16 = ((int[])((int[])((Object[])((Object[])var14[0]))[1]))[2];
                  int var17 = -rs.f + ((int[])((int[])((Object[])((Object[])var14[0]))[1]))[1];
                  int var18 = -qm.d + ((int[])((int[])((Object[])((Object[])var14[0]))[1]))[0];
                  Object[] var15;
                  if(0 <= var17 && var18 >= 0 && rp.c > var17 && var18 < wpa.a) {
                     int var19 = kja.c(0, var14);
                     if(var19 != 3) {
                        if(2 == var19) {
                           var15 = InputStreamWorker.a(var16, var17, var18, ke.f);
                        } else if(0 != var19) {
                           if(var19 != 1) {
                              var15 = null;
                           } else {
                              var15 = kaa.a(var16, var17, var18);
                           }
                        } else {
                           var15 = cu.a(var16, var17, var18);
                        }
                     } else {
                        var15 = cba.a(var16, var17, var18);
                     }
                  } else {
                     var15 = null;
                  }

                  Object[] var21;
                  if(null != var15) {
                     if(uaa.a(var15, 123) != ((int[])((int[])var14[1]))[1]) {
                        var21 = null;
                     } else {
                        var21 = var15;
                     }
                  } else {
                     var21 = null;
                  }

                  if(var21 != null) {
                     Object[] var23 = rj.b;
                     var17 = ((int[])((int[])var10[1]))[1];
                     cda.e = var21;
                     tn.a(var23, var17, -1, 1);
                     cda.e = null;
                     var12 = true;
                  } else {
                     var12 = false;
                  }

                  var11 = var12;
               } else if(null != var10 && var10.length == 4) {
                  hna var13 = (hna)pm.a((long)((int[])((int[])var10[1]))[2], hf.g, false);
                  if(var13 != null) {
                     ra.a(1, -1, ((int[])((int[])var10[1]))[2], var13.k, jra.a, ((int[])((int[])var10[1]))[1]);
                     var12 = true;
                  } else {
                     var12 = false;
                  }

                  var11 = var12;
               } else {
                  var12 = true;
                  var11 = var12;
               }
            }

            if(!var11) {
               lba.a(false, 4, var10, true);
               return;
            }
         }

         int var22 = -52 % ((var1 + 24) / 35);
         Object[] var20 = hca.f[var9];
         client.a(var20, fb.a(false, var20), -1, var2, var7, var4, var6, var3, var8, var0, var5);
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, Object[] var5) {
      ++a;
      if(var4 != -14733) {
         c = (Object[])null;
      }

      if(var2 >= 1 && 1 <= var1 && ~var2 >= ~(-2 + rp.c) && -2 + wpa.a >= var1) {
         if(ju.g == null) {
            return;
         }

         Object[] var6 = bpa.a(je.f, (byte)-65, var2, var1, var3, var0);
         if(null != var6) {
            if(null != var6 && var6.length == 16) {
               aka.a((Object[])((Object[])var6[14]), var5, -29358);
            } else if(null != var6 && var6.length == 22) {
               aka.a((Object[])((Object[])var6[18]), var5, -29358);
            } else if(var6 != null && var6.length == 20 && -8 == ~((boolean[])((boolean[])var6[8])).length) {
               nba.a(-108, var5, var6);
            } else if(null != var6 && var6.length == 20 && ((boolean[])((boolean[])var6[8])).length == 6) {
               vja.a(var6, -13754, var5);
            }
         }
      }

   }

}
