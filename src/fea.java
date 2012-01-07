import java.awt.Component;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.Socket;

final class fea {

   static int f_i;
   static int d;
   static int g;
   static int c;
   static int e;
   static int f;
   static int a;
   static int h;
   static int b;


   static final Object[] a(int var0, Object[] var1, boolean var2, int[][] var3, int var4) {
      if(var4 != 91) {
         a((Object[])null, ((byte[])((byte[])((Object[])((Object[])var1[1]))[5]))[2], (Object[])((Object[])var1[4]));
      }

      ++h;
      if(null != var1 && var1.length == 87) {
         return fka.a(var3, -21047, var1, var2, var0);
      } else if(var1 != null && var1.length == 91) {
         return bva.a(var0, var1, var2, var3, 1);
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(Object[] var0, byte var1) {
      ++f;
      int var4 = 62 / ((var1 - 1) / 57);

      for(lm var3 = dda.a((Object[])((Object[])var0[75]), 2); null != var3; var3 = client.a((Object[])((Object[])var0[75]), -28280)) {
         ava var2;
         Object[] var5 = null != (var2 = (ava)var3)?var2.m:null;
         Object[] var6 = (Object[])((Object[])var5[0]);
         Class_is.a((byte)-92, var6);
         Object var7;
         if(null == var6) {
            var7 = null;
         } else {
            var7 = var6[0];
         }

         if(var7 == ((ta)var0[38]).E) {
            if(null == var6) {
               throw new IllegalStateException();
            }

            ko.b(1, var6);
         }
      }

      ml.a((byte)-48, var0);
      if(var0 != null && (4 == var0.length && var0[3].equals(Integer.valueOf(2)) && var0[3].equals(Integer.valueOf(1)) || var0.length == 6 && var0[3].equals(Boolean.valueOf(false)))) {
         fka.a((int[][])null, -21047, (Object[])null, true, 75);
      }

   }

   static final Object[][] b(int var0) {
      ++d;
      return var0 != -1?(Object[][])((Object[][])null):new Object[][]{Class_fs.f, vta.y, rca.b, vd.b, he.c, mb.d, ri.m, ao.c, em.a, eca.g, od.e, uj.f, lha.b, nja.g, uka.h, lea.d, gs.b, wna.c, eva.f, kv.a, rl.k, id.b, et.j, ava.p, cva.n, gu.a, lna.e, rma.d, ob.d, paa.c, hfa.f, gt.g, eta.b, cn.k, tda.n, jqa.e, gd.f, pma.h, bs.m, mi.c, au.c, woa.D, pba.c, jp.f_l, hia.a, sp.f, wi.a, pea.a, mga.s, aga.c, cda.b, iaa.f, gna.c, br.d, cpa.h, hj.b, ro.d, gja.c, js.f, rk.c, ro.f, lw.f_i, cna.b, qqa.a, bla.a, df.f, nq.t, lr.e, sj.c, sw.f, vfa.c, vaa.d, hna.q, jqa.b, qga.h, po.b, eua.b, pna.b, cf.a, efa.b, fj.c, qka.a, gja.a, uqa.d, ira.a, jp.k, th.a, fk.b, gea.x, qh.c, dv.b, gj.p, mw.e, jfa.e, sma.f, mt.m, rka.g, rsa.g, ya.x, hfa.g, aga.d, af.s, no.b, uk.e, hd.c, Class_d.a, oq.b, iv.e, uq.n, oma.b, lca.b, ae.e, vm.a, hv.a, cea.e, kta.p, fd.h, hj.f, jm.k, pea.f, cia.f, ij.a, bs.f_l, bh.A, tja.b, pma.e, era.d, fj.f, oga.f_l, sv.d, bfa.b, ow.b, nc.d, kc.g, jta.f_i, sm.c, kea.a, sba.c, pba.e, ep.f_i, uda.q, mca.c, ri.p, ot.d, fta.S, di.e, vl.c, vra.g, be.d, hn.c, dw.b, naa.d};
   }

   static final void a(Object[] var0, byte var1, Object[] var2) {
      ++f_i;
      if(var1 != 122) {
         ((byte[])((byte[])var2[20]))[31] = ((byte[])((byte[])((Object[])((Object[])var2[10]))[8]))[20];
      }

      ((int[])((int[])var2[1]))[0] = de.a(var1 - 122, var0);
   }

   static final Socket b(Object[] var0, int var1) throws IOException {
      ++e;
      if(var1 != 112) {
         b(124);
      }

      return new Socket((String)var0[0], ((int[])((int[])var0[1]))[0]);
   }

   static final Object[] a(Object[] var0, byte var1, int var2) {
      if(~(2 * var2) < ~jv.a((Object[])((Object[])var0[71]), (byte)-79)) {
         bj.a(4, (Object[])((Object[])var0[71]), var2);
      }

      if(var1 > -23) {
         a((Object[])null, ((byte[])((byte[])var0[0]))[1], new Object[13]);
      }

      ++c;
      return (Object[])((Object[])var0[71]);
   }

   static final void a(Object[] var0, int var1) {
      ++b;
      if(var0[3] != null) {
         ((Component)var0[3]).removeKeyListener((KeyListener)(var0 == null?null:var0[0]));
         ((Component)var0[3]).removeFocusListener((FocusListener)(null == var0?null:var0[0]));
         var0[3] = null;
         if(var1 > 21) {
            for(int var4 = 0; 112 > var4; ++var4) {
               ((boolean[])((boolean[])var0[2]))[var4] = false;
            }

            nb.b((Object[])((Object[])var0[4]), 0);
            if(var0 != null && (var0.length == 2 || var0.length == 10 && var0[6].equals(Integer.valueOf(2)))) {
               sca.b = null;
            }

            nb.b((Object[])((Object[])var0[1]), 0);
         }
      }
   }

   static final void a(boolean var0, byte[][] var1, Object[] var2) {
      if(null != var2 && (2 == var2.length && var2[0].equals(Integer.valueOf(0)) && var2[0].equals(Integer.valueOf(0)) || 10 == var2.length && var2[4].equals(Integer.valueOf(0)) && var2[4].equals(Integer.valueOf(0)))) {
         ((byte[])((byte[])tfa.c[18]))[1] = 122;
      }

      ++g;
      if(!var0) {
         for(int var3 = 0; var3 < ((int[])((int[])var2[1]))[1]; ++var3) {
            afa.a((byte)39);
            if(var2 != null && (-16 == ~var2.length || var2.length == 5 && var2[0].equals(Integer.valueOf(2)))) {
               uba.a(1, 84, ((int[])((int[])ij.e[3]))[2], 97, 5, true);
            }

            for(int var4 = 0; rp.c >> 3 > var4; ++var4) {
               if(var2 != null && (-11 == ~var2.length || -7 == ~var2.length && var2[0].equals(Boolean.valueOf(false)) && var2[0].equals(Integer.valueOf(0)))) {
                  tsa.a(((int[])((int[])je.f[0]))[1], -16857, (String)null);
               }

               for(int var5 = 0; var5 < wpa.a >> 3; ++var5) {
                  int var6 = va.m[var3][var4][var5];
                  if(-1 != var6) {
                     int var7 = (var6 & 53766054) >> 24;
                     if(!((boolean[])((boolean[])var2[3]))[0] || var7 == 0) {
                        int var8 = (var6 & 6) >> 1;
                        int var9 = var6 >> 14 & 1023;
                        int var10 = 2047 & var6 >> 3;
                        int var11 = (var9 / 8 << 8) + var10 / 8;

                        label158:
                        for(int var12 = 0; Class_f.d.length > var12; ++var12) {
                           if(var11 == Class_f.d[var12] && null != var1[var12]) {
                              ta var13 = lna.g;
                              byte[] var14 = var1[var12];
                              int var15 = var4 * 8;
                              int var16 = var5 * 8;
                              int var17 = 8 * (var9 & 7);
                              int var18 = 8 * (7 & var10);
                              Object[][] var19 = hj.f_i;
                              Object[] var20 = jta.a((byte)-82, var14, new Object[3]);
                              int var21 = -1;

                              while(true) {
                                 int var22 = fv.a(-68, var20);
                                 if(0 == var22) {
                                    break label158;
                                 }

                                 var21 += var22;
                                 if(null != var2 && var2.length == 4 && var2[3].equals(Integer.valueOf(1)) && var2[3].equals(Integer.valueOf(1))) {
                                    ((boolean[])((boolean[])lw.d[9]))[0] = false;
                                 }

                                 int var23 = 0;

                                 while(true) {
                                    int var24 = tga.a((int)1, var20);
                                    if(0 == var24) {
                                       break;
                                    }

                                    var23 += -1 + var24;
                                    int var25 = var23 & 63;
                                    if(null != var2 && -5 == ~var2.length && var2[0].equals(Integer.valueOf(2))) {
                                       a(-113);
                                    }

                                    int var26 = (4091 & var23) >> 6;
                                    int var27 = var23 >> 12;
                                    int var28 = fh.a(var20, var0);
                                    int var29 = var28 >> 2;
                                    int var30 = 3 & var28;
                                    if(var27 == var7 && var26 >= var17 && var17 + 8 > var26 && var18 <= var25 && var25 < var18 + 8) {
                                       Object[] var31 = mca.a(true, var21, lja.d);
                                       int var32 = oga.a(var30, var8, var26 & 7, 7 & var25, ((int[])((int[])var31[1]))[10], ((int[])((int[])var31[1]))[28], 34) + var15;
                                       int var33 = ti.a(var25 & 7, var8, ((int[])((int[])var31[1]))[10], ((int[])((int[])var31[1]))[28], var30, (byte)103, 7 & var26) + var16;
                                       if(0 < var32 && var33 > 0 && ((int[])((int[])var2[1]))[0] - 1 > var32 && -1 + ((int[])((int[])var2[1]))[2] > var33) {
                                          Object[] var34 = null;
                                          if(!((boolean[])((boolean[])var2[3]))[0]) {
                                             int var35 = var3;
                                             if(-3 == ~(pd.b[1][var32][var33] & 2)) {
                                                var35 = var3 - 1;
                                             }

                                             if(var35 >= 0) {
                                                var34 = var19[var35];
                                             }
                                          }

                                          nl.a(var34, -22648, var13, 3 & var8 + var30, var21, var33, var3, var2, var29, var3, var32, -1);
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        if(var2 != null && 5 == var2.length) {
                           ((boolean[])((boolean[])nma.c[0]))[0] = true;
                        }
                     }
                  }
               }
            }
         }

      }
   }

   static final void a(int var0) {
      ++a;
      gca.d = 0;
      Object[] var1 = (Object[])((Object[])woa.a(5, uta.g)[1]);
      if(var0 <= -80) {
         int var2 = ((int)((float[])((float[])var1[1]))[2] >> 9) + rs.f;
         int var3 = ((int)((float[])((float[])var1[1]))[1] >> 9) + qm.d;
         if(3053 <= var2 && 3156 >= var2 && var3 >= 3056 && 3136 >= var3) {
            gca.d = 1;
         }

         if(var2 >= 3072 && var2 <= 3118 && 9492 <= var3 && 9535 >= var3) {
            gca.d = 1;
         }

         if(1 == gca.d && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && 3062 >= var3) {
            gca.d = 0;
         }

      }
   }

}
