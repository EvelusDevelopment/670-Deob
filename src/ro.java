
final class ro {

   static int g;
   static int h;
   static int b;
   static int e;
   static Object[] f = ed.a(0, new Object[1], (byte)-121, 60);
   static Object[] d = ed.a(-2, new Object[1], (byte)-116, 56);
   static Object[] c = ho.a(-1, 83, new Object[1], true);
   static int a = 0;


   static final Object[] a(int var0, Object[] var1) {
      if(var0 != 3) {
         c = (Object[])((Object[])f[25]);
      }

      ++g;
      int var2;
      if(null != var1 && var1.length == 43 && ((byte[])((byte[])var1[10])).length == 8) {
         int var3;
         label34: {
            if(((Object[])((Object[])var1[42]))[11] != null) {
               Object[] var4 = ria.a(eo.g, (Object[])((Object[])var1[42]), var0 ^ -29);
               if(var4 != null && 0 != ~((int[])((int[])var4[1]))[4]) {
                  var3 = ((int[])((int[])var4[1]))[4];
                  break label34;
               }
            }

            var3 = ((int[])((int[])((Object[])((Object[])var1[42]))[1]))[4];
         }

         var2 = var3;
      } else {
         if(var1 == null || 43 != var1.length || ((int[])((int[])var1[12])).length != 58) {
            throw new IllegalStateException();
         }

         var2 = lra.a(var1, 127);
      }

      return var2 == -1?np.f:Class_h.a(cq.f_i, var2, 124);
   }

   static final Object[] a(int var0, int var1, Object[][] var2, Object[] var3, Object[] var4) {
      kj.b(var4, 4);
      ++e;
      var4[2] = ipa.b(var4, (int)107);
      var4[0] = var3;
      if(var1 < 63) {
         return (Object[])null;
      } else {
         ((int[])((int[])var4[1]))[0] = var0;
         return var4;
      }
   }

   static final int a(byte var0, Object[] var1) {
      ++b;
      return var0 > -57?-85:((int[])((int[])var1[1]))[3];
   }

   static final int a(Object[] var0, int var1) {
      if(var1 >= -31) {
         return 14;
      } else {
         ++h;
         byte[] var10002 = (byte[])((byte[])var0[2]);
         int[] var10003 = (int[])((int[])var0[1]);
         int var10006 = ((int[])((int[])var0[1]))[0];
         var10003[0] = ((int[])((int[])var0[1]))[0] + 1;
         return 255 & 128 - var10002[var10006];
      }
   }

   static final void a() {
      int var0;
      int var1;
      int var2;
      Object[] var3;
      Object[] var4;
      Object[] var5;
      if(fo.f_i != null) {
         for(var0 = 0; var0 < fo.f_i.length; ++var0) {
            for(var1 = 0; var1 < eja.c; ++var1) {
               for(var2 = 0; var2 < me.c; ++var2) {
                  if(fo.f_i[var0][var1][var2] != null) {
                     var3 = fo.f_i[var0][var1][var2];
                     if(var3 != null && -4 == ~var3.length && var3[2].equals(Integer.valueOf(0))) {
                        nc.a((Object[][])null, 108, -45);
                     }

                     while(var3[3] != null) {
                        var4 = (Object[])((Object[])((Object[])((Object[])var3[3]))[0]);
                        var5 = (Object[])((Object[])var3[3]);
                        var3[3] = var4;
                        if(nf.e < 500) {
                           var5[1] = null;
                           var5[0] = jca.s;
                           jca.s = var5;
                           ++nf.e;
                        }
                     }
                  }

                  fo.f_i[var0][var1][var2] = null;
               }
            }
         }
      }

      fo.f_i = (Object[][][][])null;
      bf.f_l = null;
      if(sr.e != null) {
         for(var0 = 0; var0 < sr.e.length; ++var0) {
            for(var1 = 0; var1 < eja.c; ++var1) {
               for(var2 = 0; var2 < me.c; ++var2) {
                  if(sr.e[var0][var1][var2] != null) {
                     var3 = sr.e[var0][var1][var2];

                     while(var3[3] != null) {
                        var4 = (Object[])((Object[])((Object[])((Object[])var3[3]))[0]);
                        var5 = (Object[])((Object[])var3[3]);
                        var3[3] = var4;
                        if(nf.e < 500) {
                           var5[1] = null;
                           var5[0] = jca.s;
                           ++nf.e;
                           jca.s = var5;
                        }
                     }
                  }

                  sr.e[var0][var1][var2] = null;
               }
            }
         }
      }

      sr.e = (Object[][][][])null;
      wd.a = null;
      ju.g = (Object[][][][])null;
      jp.o = null;
      ju.e = (boolean[][])null;
      uq.k = (boolean[][])null;
      mta.b = null;
      rka.e = (boolean[][][])null;
      qj.a = (boolean[][][])null;
      if(lna.h != null) {
         for(var0 = 0; rw.t > var0; ++var0) {
            lna.h[var0] = null;
         }

         lna.h = (Object[][])null;
      }

      if(id.a != null) {
         for(var0 = 0; var0 < kga.j; ++var0) {
            id.a[var0] = null;
         }

         id.a = (Object[][])null;
      }

      if(gj.O != null) {
         for(var0 = 0; caa.d > var0; ++var0) {
            gj.O[var0] = null;
         }

         gj.O = (Object[][])null;
      }

      so.f = (int[][][])null;
      sqa.e = -1;
      gra.a = -1;
      wga.a = null;
      pt.a = (Object[][])null;
      if(mqa.g != null) {
         for(var0 = 0; var0 < aha.b; ++var0) {
            mqa.g[var0] = null;
         }

         aha.b = 0;
      }

      ri.f_l = (Object[][])null;
      usa.e = (Object[][])null;
      sfa.g = (Object[][])null;
      if(sca.a != null) {
         for(var0 = 0; var0 < sca.a.length; ++var0) {
            sca.a[var0] = null;
         }

         jia.Bc = 0;
      }

      if(hja.f != null) {
         for(var0 = 0; var0 < hja.f.length; ++var0) {
            hja.f[var0] = null;
         }

         oia.y = 0;
      }

      if(qd.c != null) {
         for(var0 = 0; var0 < rga.e; ++var0) {
            qd.c[var0] = null;
         }

         for(var0 = 0; var0 < ri.n; ++var0) {
            for(var1 = 0; var1 < eja.c; ++var1) {
               for(var2 = 0; var2 < me.c; ++var2) {
                  nba.e[var0][var1][var2] = 0L;
               }
            }
         }

         rga.e = 0;
      }

      Object[] var8 = jr.d;
      synchronized(jr.d) {
         jr.d = aqa.a(new Object[2], 22);
         af.D = 0;
      }

      gu.b = gu.h;
      pq.a((byte)119, gu.b);
      wk.e = (byte[][])null;
      rb.d = (int[][])null;
      esa.g = (short[][])null;
      jaa.f_i = (byte[][])null;
      mf.e = (byte[][])null;
      mca.d = (byte[][])null;
      if(sc.b != null) {
         oq.a();
         mpa.b.g(1);
         mpa.b.h(0);
      }

      if(ar.b != null) {
         ar.b = (Object[][])null;
      }

      mpa.b = null;
   }

}
