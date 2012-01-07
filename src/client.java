import jagdx.IUnknown;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.GregorianCalendar;
import java.util.Vector;

public final class client extends gi {

   static int Lb;
   static int f_rb;
   static int f_eb;
   static int Ib;
   static int xb;
   static int f_db;
   static int f_lb;
   static int f_pb;
   static int Nb;
   static int f_sb;
   static int f_cb;
   static int f_tb;
   static int f_nb;
   static int Ab;
   static int f_hb;
   static int Z;
   static int Hb;
   static int Bb;
   static Object[] Db = osa.a(0, new Object[2]);
   static int Ob;
   static Object[] Kb = je.a(1, new Object[1], 6, (byte)-115);
   static Object[] f_ob = sd.a(new Object[1], 117, (byte)113);
   static int f_kb;
   static float Cb;
   public static int Fb;
   public static int f_vb;
   public static boolean f_mb;
   public static boolean f_fb;
   public static int yb;
   public static int Eb;
   public static int f_bb;
   public static int Gb;
   public static boolean f_wb;
   public static int f_gb;
   public static boolean Jb;
   public static int f_ab;
   public static int Mb;
   public static int f_ib;
   public static boolean zb;
   public static int f_jb;
   public static boolean f_ub;
   public static int f_qb;


   static final void c() {
      vja.c = 0;

      for(int var0 = 0; var0 < rba.h; ++var0) {
         Object[] var1 = ((hna)pm.a((long)gr.c[var0], hf.g, false)).k;
         if(((boolean[])((boolean[])var1[8]))[8] && fba.a((byte)28, var1) != -1) {
            int var2 = (dg.a(-101, var1) - 1) * 256 + 252;
            Object[] var3 = (Object[])((Object[])woa.a(5, var1)[1]);
            int var4 = (int)((float[])((float[])var3[1]))[2] - var2 >> 9;
            int var5 = (int)((float[])((float[])var3[1]))[1] - var2 >> 9;
            byte var7 = ((byte[])((byte[])var1[10]))[0];
            Object[] var8 = ju.g[var7][var4][var5];
            Object[] var6;
            if(null != var8) {
               Object[] var9 = null;
               if(null != var9 && var9.length == 2) {
                  sd.a((int)12, ((int[])((int[])cqa.a[24]))[1]);
               }

               int var10 = -1;

               for(Object[] var11 = (Object[])((Object[])var8[3]); null != var11; var11 = (Object[])((Object[])var11[0])) {
                  Object[] var12 = (Object[])((Object[])var11[1]);
                  if(var12 != null && var12.length == 43) {
                     int var14 = (-1 + dg.a(-107, var12)) * 256 + 252;
                     Object[] var15 = (Object[])((Object[])woa.a(5, var12)[1]);
                     int var16 = -var14 + (int)((float[])((float[])var15[1]))[2] >> 9;
                     int var17 = -var14 + (int)((float[])((float[])var15[1]))[1] >> 9;
                     int var18 = (int)((float[])((float[])var15[1]))[2] + var14 >> 9;
                     int var19 = var14 + (int)((float[])((float[])var15[1]))[1] >> 9;
                     if(var16 <= var4 && var5 >= var17 && var4 <= var18 && var19 >= var5) {
                        int var20 = (-var5 + var19 + 1) * (var18 - (-1 + var4));
                        if(var10 < var20) {
                           var9 = var12;
                           var10 = var20;
                        }
                     }
                  }
               }

               var6 = var9;
            } else {
               var6 = null;
            }

            if(var1 != null && (var1.length == 25 || var1.length == 3 && var1[0].equals(Integer.valueOf(1)))) {
               gn.k = (Object[])((Object[])sh.a[14]);
            }

            if(var6 != null) {
               int var21 = ((int[])((int[])var6[12]))[21];
               if(var6 != null && var6.length == 43 && ((int[])((int[])var6[12])).length == 46) {
                  var21 += 2048;
               }

               if(((int[])((int[])var6[12]))[6] == 0 && rr.a(false, var6) != -1) {
                  lqa.c[vja.c] = var21;
                  te.j[vja.c] = var21;
                  ++vja.c;
                  ++((int[])((int[])var6[12]))[6];
               }

               lqa.c[vja.c] = var21;
               te.j[vja.c] = ((int[])((int[])var1[12]))[21] + 2048;
               ++vja.c;
               ++((int[])((int[])var6[12]))[6];
            }
         }
      }

      rt.a(te.j, lqa.c, 0, vja.c - 1, 12042);
   }

   private final void f(byte var1) {
      ++Hb;
      if(11 != ipa.d) {
         long var2 = lo.a((byte)69) / 1000000L + -di.g;
         di.g = lo.a((byte)96) / 1000000L;

         boolean var4;
         int var15;
         int var16;
         int var19;
         int var76;
         boolean var79;
         label777: {
            Object[] var7;
            try {
               if(dl.d == 2) {
                  if(gta.a == null) {
                     gta.a = lh.a(bp.c, oq.d, bl.a);
                     if(null == gta.a) {
                        var4 = false;
                        break label777;
                     }
                  }

                  if(gma.d == null) {
                     var7 = new Object[4];
                     Object[] var8 = dja.b;
                     Object[] var9 = rsa.a;
                     ev.a(var7, 2519);
                     var7[2] = var8;
                     var7[1] = var9;
                     gma.d = var7;
                  }

                  Object[] var6 = qs.h;
                  if(null != rua.a) {
                     var6 = rua.a;
                  }

                  if(iaa.a(jea.h, gma.d, var6, 22050, gta.a, true)) {
                     qs.h = var6;
                     if(null != var6 && -16 == ~var6.length) {
                        ((long[])((long[])eo.g[0]))[3] = -5L;
                     }

                     hg.a(false, qs.h);
                     if(0 >= aha.j) {
                        dl.d = 0;
                        nqa.a(qs.h, (byte)98, sw.a);

                        for(var76 = 0; var76 < wma.e.length; ++var76) {
                           uka.a(var76, -124, wma.e[var76], qs.h);
                           wma.e[var76] = 255;
                        }

                        if(var6 != null && (7 == var6.length && var6[1].equals(Boolean.valueOf(false)) && var6[1].equals(Integer.valueOf(2)) || -13 == ~var6.length && var6[3].equals(Integer.valueOf(0)))) {
                           ((Object[])((Object[])bna.a[5]))[8] = ura.a[5];
                        }
                     } else {
                        dl.d = 3;
                        nqa.a(qs.h, (byte)119, aha.j > sw.a?sw.a:aha.j);

                        for(var76 = 0; wma.e.length > var76; ++var76) {
                           uka.a(var76, 114, wma.e[var76], qs.h);
                           wma.e[var76] = 255;
                        }
                     }

                     if(null == rua.a) {
                        if(-1L <= ~ei.d) {
                           kua.a(gta.a, -17, qs.h, kk.a);
                        } else {
                           var7 = qs.h;
                           lh var78 = gta.a;
                           var79 = kk.a;
                           long var10 = ei.d;
                           synchronized(var7) {
                              gma.a(31708, var79, var7, true, var78);
                              long var13 = var10 * (long)((tf)var7[12]).b;
                              if(null != var7 && var7.length == 24) {
                                 opa.a(3, 4, 72, -37);
                              }

                              label732:
                              while(~var13 <= ~((long[])((long[])var7[18]))[1]) {
                                 var15 = ((int[])((int[])var7[1]))[1];
                                 var16 = ((int[])((int[])var7[1]))[3];

                                 long var17;
                                 for(var17 = ((long[])((long[])var7[18]))[1]; ~var16 == ~((int[])((int[])var7[1]))[3]; var17 = ((tf)var7[12]).d(var16)) {
                                    while(~var16 == ~((tf)var7[12]).e[var15]) {
                                       ((tf)var7[12]).e(var15);
                                       var19 = ((tf)var7[12]).f(var15);
                                       if(var19 == 1) {
                                          ((tf)var7[12]).e();
                                          ((tf)var7[12]).c(var15);
                                          if(((tf)var7[12]).b()) {
                                             if(!((boolean[])((boolean[])var7[17]))[1] || var16 == 0) {
                                                jba.a(-5, var7, true);
                                                ((tf)var7[12]).f();
                                                break label732;
                                             }

                                             ((tf)var7[12]).a(var17);
                                          }
                                          break;
                                       }

                                       if(-1 != ~(128 & var19) && (240 & var19) != 144) {
                                          fba.a(var19, var7, -2002287193);
                                       }

                                       ((tf)var7[12]).a(var15);
                                       ((tf)var7[12]).c(var15);
                                    }

                                    ((long[])((long[])var7[18]))[0] = var17;
                                    var15 = ((tf)var7[12]).d();
                                    var16 = ((tf)var7[12]).e[var15];
                                 }

                                 ((int[])((int[])var7[1]))[3] = var16;
                                 ((long[])((long[])var7[18]))[1] = var17;
                                 ((int[])((int[])var7[1]))[1] = var15;
                              }
                           }
                        }
                     }

                     if(qf.b != null) {
                        Object[] var5 = qs.h;
                        rna.a((kp)(qs.h == null?null:var5[19]), -20224, qf.b);
                     }

                     ei.d = 0L;
                     gta.a = null;
                     bp.c = null;
                     rua.a = null;
                     gma.d = null;
                     var4 = true;
                     break label777;
                  }
               }
            } catch (Exception var74) {
               var74.printStackTrace();
               var7 = qs.h;
               synchronized(var7) {
                  synchronized(var7) {
                     ((tf)var7[12]).f();
                     var7[16] = null;
                     jba.a(-5, var7, true);
                  }
               }

               gta.a = null;
               rua.a = null;
               dl.d = 0;
               gma.d = null;
               bp.c = null;
            }

            var4 = false;
         }

         if(var4 && qk.d && mra.a != null) {
            tsa.a((int)-20503, mra.a);
         }

         var76 = ipa.d;
         boolean var75 = 9 == var76 || var76 == 5 || 15 == var76 || var76 == 10;
         if(var75) {
            if(~ig.A != -1L && ig.A < he.a(111)) {
               bsa.a((byte)-122, false, -1, -1, afa.b((byte)-85));
            } else if(!lna.g.q() && Class_ls.k) {
               mea.a((byte)-82);
            }
         }

         int var80;
         int var83;
         if(null == gf.b) {
            Object var77;
            if(opa.g == null) {
               var77 = this;
            } else {
               var77 = opa.g;
            }

            var80 = ((Container)var77).getSize().width;
            var83 = ((Container)var77).getSize().height;
            if(opa.g == var77) {
               Insets var11 = opa.g.getInsets();
               var80 -= var11.right + var11.left;
               var83 -= var11.top + var11.bottom;
            }

            if(var80 != rp.a || jma.h != var83 || jea.c) {
               if(null != lna.g && !lna.g.p()) {
                  jma.h = var83;
                  rp.a = var80;
               } else {
                  va.b(-32144);
               }

               ig.A = he.a(-29) + 500L;
               jea.c = false;
            }
         }

         boolean var81;
         if(eb.f && gf.b != null && !kj.j) {
            var80 = ipa.d;
            var81 = var80 == 9 || 5 == var80 || var80 == 15 || 10 == var80;
            if(var81) {
               bsa.a((byte)-122, false, -1, -1, Class_m.a((Object[])((Object[])tu.d[40]), -23352));
            }
         }

         var81 = false;
         if(var1 > -67) {
            a(false, (int[])((int[])((Object[])((Object[])f_ob[9]))[7]), ((int[])((int[])((Object[])((Object[])Kb[0]))[4]))[0], (Object[])null);
         }

         if(ofa.c) {
            ofa.c = false;
            var81 = true;
         }

         if(var81) {
            eoa.a(-96);
         }

         if(lna.g != null && lna.g.q() || -2 != ~afa.b((byte)-85)) {
            mg.b(true);
         }

         int var12;
         int var14;
         int var92;
         int var95;
         Object[] var91;
         Object[] var96;
         if(!fc.b(ipa.d, -3)) {
            var83 = ipa.d;
            var79 = var83 == 9 || var83 == 6 || var83 == 12;
            if(var79) {
               wra.a(121);
            } else {
               var12 = ipa.d;
               boolean var82 = 5 == var12 || 15 == var12;
               if(!var82) {
                  if(pp.a((byte)-63, ipa.d)) {
                     if(dha.a == 1) {
                        if(jl.c > hha.a) {
                           hha.a = jl.c;
                        }

                        var92 = (hha.a + -jl.c) * 50 / hha.a;
                        npa.a(-104, lna.g, gj.a(dp.y, -73, gj.f_vb) + cp.e + "(" + var92 + "%)", true, fha.m, nsa.c);
                     } else if(dha.a == 2) {
                        if(tr.f > jg.d) {
                           jg.d = tr.f;
                        }

                        var92 = 50 + 50 * (jg.d - tr.f) / jg.d;
                        npa.a(71, lna.g, gj.a(dp.y, 93, gj.f_vb) + cp.e + "(" + var92 + "%)", true, fha.m, nsa.c);
                     } else {
                        npa.a(106, lna.g, gj.a(dp.y, 87, gj.f_vb), true, fha.m, nsa.c);
                     }
                  } else if(ipa.d != 10) {
                     if(ipa.d != 14) {
                        if(ipa.d == 3) {
                           npa.a(13, lna.g, gj.a(dp.y, 80, gj.f_ob), false, fha.m, nsa.c);
                        }
                     } else {
                        npa.a(39, lna.g, gj.a(dp.y, 107, gj.s) + cp.e + gj.a(dp.y, 79, gj.W), false, fha.m, nsa.c);
                     }
                  } else {
                     if(ju.g != null) {
                        if(3 != ha.e && 5 != ha.e) {
                           if(ha.e == 1) {
                              vh.a((byte)-107, var2);
                           }
                        } else {
                           var91 = (Object[])((Object[])woa.a(5, uta.g)[1]);
                           var14 = vq.d + (int)((float[])((float[])var91[1]))[2];
                           var15 = (int)((float[])((float[])var91[1]))[1] + ji.c;
                           if(fha.o + -var14 < -2000 || fha.o + -var14 > 2000 || -2000 > -var15 + hq.a || 2000 < -var15 + hq.a) {
                              hq.a = var15;
                              fha.o = var14;
                           }

                           if(var14 != fha.o) {
                              var16 = -fha.o + var14;
                              var95 = (int)(var2 * (long)var16 / 320L);
                              if(0 >= var16) {
                                 if(0 == var95) {
                                    var95 = -1;
                                 } else if(var95 < var16) {
                                    var95 = var16;
                                 }
                              } else if(var95 != 0) {
                                 if(var16 < var95) {
                                    var95 = var16;
                                 }
                              } else {
                                 var95 = 1;
                              }

                              fha.o += var95;
                           }

                           if(var15 != hq.a) {
                              var16 = var15 + -hq.a;
                              var95 = (int)((long)var16 * var2 / 320L);
                              if(0 >= var16) {
                                 if(0 != var95) {
                                    if(var95 < var16) {
                                       var95 = var16;
                                    }
                                 } else {
                                    var95 = -1;
                                 }
                              } else if(0 == var95) {
                                 var95 = 1;
                              } else if(var16 < var95) {
                                 var95 = var16;
                              }

                              hq.a += var95;
                           }

                           qv.f_i += rba.k * (float)var2 / 6.0F;
                           sma.h += (float)var2 * fja.d / 6.0F;
                           woa.a((byte)-109);
                        }
                     }

                     tia.a(lna.g, (long)kda.d, (byte)-100);
                     if(-1 != bqa.j) {
                        ur.a(bqa.j, true);
                     }

                     for(var92 = 0; var92 < lw.c; ++var92) {
                        uja.a[var92] = qma.d[var92];
                        qma.d[var92] = false;
                     }

                     pt.d = kda.d;
                     hpa.c = -1;
                     wr.o = -1;
                     if(-1 != bqa.j) {
                        lw.c = 0;
                        ela.a(false);
                     }

                     lna.g.a();
                     ta var93 = lna.g;
                     if(kea.c) {
                        rj.a((byte)-120, var93);
                     } else {
                        pn.a(var93, (byte)88);
                     }

                     var14 = jf.a((byte)82);
                     if(var14 == -1) {
                        var14 = jf.c;
                     }

                     if(var14 == -1) {
                        var14 = InputStreamWorker.c;
                     }

                     jb.a(var14, (byte)-43);
                     var15 = gn.a(uta.g, (byte)-124) << 8;
                     var96 = (Object[])((Object[])woa.a(5, uta.g)[1]);
                     bt.a((int)((float[])((float[])var96[1]))[1] + var15, ((byte[])((byte[])uta.g[10]))[0], Class_ds.c, var15 + (int)((float[])((float[])var96[1]))[2], (byte)85);
                     Class_ds.c = 0;
                  }
               } else {
                  wra.a(98);
               }
            }
         } else {
            so.a(var81, -23105);
         }

         if(3 == hsa.f_i) {
            for(var80 = 0; lw.c > var80; ++var80) {
               Rectangle var86 = fma.X[var80];
               if(uja.a[var80]) {
                  lna.g.a(var86.y, (byte)-121, -65281, var86.width, var86.height, var86.x);
               } else {
                  lna.g.a(var86.y, (byte)-121, -16711936, var86.width, var86.height, var86.x);
               }
            }
         }

         var79 = et.b;
         int var87;
         if(var79) {
            ta var89 = lna.g;
            var89.JA(0, 0, wr.n, 350);
            var89.r(0, 0, wr.n, 350, bn.f << 24 | 3351159, 1);
            var87 = 350 / cl.e;
            if(gka.d > 0) {
               var12 = -4 + 346 + -cl.e;
               var92 = var87 * var12 / (var87 + (gka.d - 1));
               var14 = 4;
               if(1 < gka.d) {
                  var14 += (-var92 + var12) * (-jr.b + (gka.d - 1)) / (-1 + gka.d);
               }

               var89.r(wr.n - 16, var14, 12, var92, bn.f << 24 | 3351159, 2);

               for(var15 = jr.b; var15 < jr.b + var87 && var15 < gka.d; ++var15) {
                  String[] var94 = ul.a(0, ov.b[var15], '\b');
                  var95 = (-16 + -8 + wr.n) / var94.length;

                  for(int var18 = 0; var94.length > var18; ++var18) {
                     var19 = var18 * var95 + 8;
                     var89.JA(var19, 0, var95 + var19 - 8, 350);
                     fha.m.a(73, -1, -((-jr.b + var15) * cl.e) + -((int[])((int[])nsa.c[1]))[2] + -gra.e + 348, vqa.a((byte)35, var94[var18]), var19, -16777216);
                  }
               }
            }

            kv.f_i.a(-16777216, -1, true, wr.n - 25, 330, "670 1");
            var89.JA(0, 0, wr.n, 350);
            var89.a((int)-1, 0, -gra.e + 350, wr.n, (byte)-98);
            wla.f.a(46, -1, -1 + (350 - ((int[])((int[])pia.d[1]))[2]), "--> " + vqa.a((byte)-88, rt.f), 10, -16777216);
            if(kj.j) {
               var12 = -1;
               if(kda.d % 30 > 15) {
                  var12 = 16777215;
               }

               var89.a((byte)46, uga.a("--> " + vqa.a((byte)62, rt.f).substring(0, nr.e), pia.d, (byte)113) + 10, var12, -11 + 350 + -((int[])((int[])pia.d[1]))[2], (int)12);
            }

            var89.a();
         }

         if(!fc.b(ipa.d, -3) && !pp.a((byte)-63, ipa.d) && -1 != bqa.j) {
            try {
               lna.g.f(-68);
            } catch (cr var70) {
               taa.a(var70, 32, var70.getMessage() + " " + this.a((byte)72));
               lg.a(false, 0, (byte)-59);
            }
         }

         oc var84;
         oc var88;
         Object[] var90;
         for(var90 = (var84 = (oc)qt.a(0, fo.c)) == null?null:var84.n; null != var90; var90 = (var88 = (oc)nda.a(1, fo.c)) == null?null:var88.n) {
            if(((boolean[])((boolean[])var90[3]))[3]) {
               ((boolean[])((boolean[])var90[3]))[3] = false;
            } else {
               nia.a(-7027, ((int[])((int[])var90[1]))[0]);
            }
         }

         var83 = gua.b((Object[])((Object[])tu.d[27]), 2);
         if(0 != var83) {
            if(1 != var83) {
               if(var83 != 2) {
                  if(var83 == 3) {
                     qs.a(2L, 29);
                  }
               } else {
                  qs.a(5L, 88);
               }
            } else {
               qs.a(10L, 37);
            }
         } else {
            qs.a(15L, 40);
         }

         if(kca.a) {
            Object[] var85 = bca.F;
            synchronized(var85[0]) {
               fua.a(105, (Object[])((Object[])var85[0]), 5);
            }

            var90 = tfa.d;
            synchronized(var90[0]) {
               fua.a(99, (Object[])((Object[])var90[0]), 5);
            }

            var91 = im.a;
            synchronized(var91[0]) {
               fua.a(72, (Object[])((Object[])var91[0]), 5);
            }

            gf.a(5, lja.d, (byte)-77);
            Object[] var97 = nt.f_i;
            synchronized(var97[6]) {
               fua.a(-67, (Object[])((Object[])var97[6]), 5);
            }

            synchronized(var97[4]) {
               fua.a(103, (Object[])((Object[])var97[4]), 5);
            }

            synchronized(var97[7]) {
               fua.a(-68, (Object[])((Object[])var97[7]), 5);
            }

            if(var91 != null && var91.length == 1) {
               qr.a = ((int[])((int[])wsa.g[16]))[1];
            }

            Object[] var98 = cqa.a;
            synchronized(var98[3]) {
               fua.a(-77, (Object[])((Object[])var98[3]), 5);
            }

            synchronized(var98[4]) {
               fua.a(122, (Object[])((Object[])var98[4]), 5);
            }

            synchronized(var98[5]) {
               ava.a((Object[])((Object[])var98[5]), 8, 5);
            }

            var96 = he.b;
            synchronized(var96[1]) {
               fua.a(69, (Object[])((Object[])var96[1]), 5);
            }

            synchronized(var96[2]) {
               fua.a(87, (Object[])((Object[])var96[2]), 5);
            }

            rea.a(-71, dfa.a, 5);
            Object[] var101 = fv.d;
            synchronized(var101[0]) {
               fua.a(-47, (Object[])((Object[])var101[0]), 5);
            }

            Object[] var99 = nb.g;
            synchronized(var99[2]) {
               fua.a(-72, (Object[])((Object[])var99[2]), 5);
            }

            Object[] var100 = jv.g;
            synchronized(var100[0]) {
               fua.a(73, (Object[])((Object[])var100[0]), 5);
            }

            Object[] var20 = et.c;
            synchronized(var20[0]) {
               fua.a(102, (Object[])((Object[])var20[0]), 5);
            }

            Object[] var21 = cr.c;
            synchronized(var21[0]) {
               fua.a(-77, (Object[])((Object[])var21[0]), 5);
            }

            Object[] var22 = kw.b;
            synchronized(var22[0]) {
               fua.a(108, (Object[])((Object[])var22[0]), 5);
            }

            Object[] var23 = cq.f_i;
            synchronized(var23[0]) {
               fua.a(-112, (Object[])((Object[])var23[0]), 5);
            }

            cia.a(true, oe.g, 5);
            Object[] var24 = rka.d;
            synchronized(var24[2]) {
               fua.a(68, (Object[])((Object[])var24[2]), 5);
            }

            synchronized(var24[0]) {
               fua.a(73, (Object[])((Object[])var24[0]), 5);
            }

            uc.a(-55, bm.c, 5);
            qt.a(5211, 5, ib.g);
            Object[] var25 = ura.a;
            synchronized(var25[0]) {
               fua.a(74, (Object[])((Object[])var25[0]), 5);
            }

            bo.a(ira.f, (byte)-100, 5);
            qka.a(6762, 5, qja.f_l);
            bea.a(ena.e, 0, 5);
            kl.a((byte)35, lw.d, 5);
            ig.a(lv.w, 5, (byte)75);
            Object[] var26 = id.f;
            synchronized(id.f) {
               fua.a(95, id.f, 5);
            }

            var26 = kg.a;
            synchronized(kg.a) {
               fua.a(-106, kg.a, 5);
            }

            fua.a(112, fr.g, 50);
            fua.a(-68, ic.f, 50);
            fua.a(-103, jl.b, 50);
            fua.a(-69, Class_ls.m, 50);
            fua.a(104, np.f_i, 50);
            kh.a(false, 5);
            pha.a(5, -90);
            fua.a(-99, lha.h, 5);
            fua.a(-77, gs.d, 5);
            fua.a(-127, gg.b, 5);
            fua.a(-118, rw.x, 5);
            fua.a(126, mw.a, 5);
         }

         var90 = (Object[])((Object[])tu.d[15]);
         var87 = ((int[])((int[])var90[1]))[0];
         if(1 == var87 && ipa.d == 9 && ~bqa.j != 0) {
            ih.a(tu.d, (Object[])((Object[])tu.d[15]), 0, -113);
            uk.a((byte)50);
         }

      }
   }

   private final void k(int var1) {
      try {
         ++f_lb;
         if(ipa.d != 11) {
            ++kda.d;
            if(1 == kda.d % 1000) {
               GregorianCalendar var4 = new GregorianCalendar();
               cea.b = var4.get(11) * 600 - (-(var4.get(12) * 10) - var4.get(13) / 6);
               wha.e.setSeed((long)cea.b);
            }

            gma.a(5, lba.f);
            gma.a(var1 ^ -1267693939, lba.h);
            this.h((byte)-97);
            Object[] var6;
            int var12;
            if(wb.e != null) {
               Object[] var37 = wb.e;
               if(var37[6] != null) {
                  int var5;
                  for(var5 = 0; var5 < ((Object[])((Object[])var37[6])).length; ++var5) {
                     if(((Object[][])((Object[][])var37[6]))[var5] != null) {
                        wi.a(-22, ((Object[][])((Object[][])var37[6]))[var5]);
                     }
                  }

                  if(null != var37 && var37.length == 3) {
                     lna.g = null;
                  }

                  for(var5 = 0; ~var5 > ~((Object[])((Object[])var37[6])).length; ++var5) {
                     if(null != ((Object[][])((Object[][])var37[6]))[var5]) {
                        var6 = ((Object[][])((Object[][])var37[6]))[var5];
                        if(null != var6[9]) {
                           if(null == lq.b(true, var6)) {
                              continue;
                           }

                           boolean var10;
                           lm var11;
                           if(((boolean[])((boolean[])var6[13]))[1]) {
                              var10 = true;

                              for(var11 = dda.a((Object[])((Object[])var6[9]), 2); null != var11; var11 = a((Object[])((Object[])var6[9]), -28280)) {
                                 var12 = (int)var11.e;
                                 if(0 == ((byte[])((byte[])var6[12]))[var12]) {
                                    dq.a(4, 1, var12, var6);
                                 }

                                 if(-1 != ~((byte[])((byte[])var6[12]))[var12]) {
                                    var11.a((byte)32);
                                 } else {
                                    var10 = false;
                                 }
                              }

                              if(var6 != null && (2 == var6.length && var6[1].equals(Integer.valueOf(0)) || var6.length == 2)) {
                                 sna.a = true;
                              }

                              while(((int[])((int[])var6[1]))[1] < ((int[])((int[])((Object[])((Object[])var6[0]))[7])).length) {
                                 if(((int[])((int[])((Object[])((Object[])var6[0]))[7]))[((int[])((int[])var6[1]))[1]] != 0) {
                                    if(-251 >= ~((int[])((int[])((Object[])((Object[])var6[10]))[1]))[0]) {
                                       var10 = false;
                                       break;
                                    }

                                    if(0 == ((byte[])((byte[])var6[12]))[((int[])((int[])var6[1]))[1]]) {
                                       dq.a(4, 1, ((int[])((int[])var6[1]))[1], var6);
                                    }

                                    if(0 == ((byte[])((byte[])var6[12]))[((int[])((int[])var6[1]))[1]]) {
                                       var11 = new lm();
                                       var11.e = (long)((int[])((int[])var6[1]))[1];
                                       a(-49, (Object[])((Object[])var6[9]), var11);
                                       var10 = false;
                                    }

                                    ++((int[])((int[])var6[1]))[1];
                                 } else {
                                    ++((int[])((int[])var6[1]))[1];
                                 }
                              }

                              if(var10) {
                                 ((boolean[])((boolean[])var6[13]))[1] = false;
                                 ((int[])((int[])var6[1]))[1] = 0;
                              }
                           } else if(((boolean[])((boolean[])var6[13]))[0]) {
                              var10 = true;

                              for(var11 = dda.a((Object[])((Object[])var6[9]), 2); var11 != null; var11 = a((Object[])((Object[])var6[9]), -28280)) {
                                 var12 = (int)var11.e;
                                 if(((byte[])((byte[])var6[12]))[var12] != 1) {
                                    dq.a(var1 + 1267693948, 2, var12, var6);
                                 }

                                 if(((byte[])((byte[])var6[12]))[var12] != 1) {
                                    var10 = false;
                                 } else {
                                    var11.a((byte)98);
                                 }
                              }

                              while(~((int[])((int[])((Object[])((Object[])var6[0]))[7])).length < ~((int[])((int[])var6[1]))[1]) {
                                 if(0 != ((int[])((int[])((Object[])((Object[])var6[0]))[7]))[((int[])((int[])var6[1]))[1]]) {
                                    if(eh.a((Object[])((Object[])var6[6]), (byte)-124)) {
                                       var10 = false;
                                       break;
                                    }

                                    if(-2 != ~((byte[])((byte[])var6[12]))[((int[])((int[])var6[1]))[1]]) {
                                       dq.a(4, 2, ((int[])((int[])var6[1]))[1], var6);
                                    }

                                    if(1 != ((byte[])((byte[])var6[12]))[((int[])((int[])var6[1]))[1]]) {
                                       var11 = new lm();
                                       var11.e = (long)((int[])((int[])var6[1]))[1];
                                       var10 = false;
                                       a(115, (Object[])((Object[])var6[9]), var11);
                                    }

                                    ++((int[])((int[])var6[1]))[1];
                                 } else {
                                    ++((int[])((int[])var6[1]))[1];
                                 }
                              }

                              if(var10) {
                                 ((boolean[])((boolean[])var6[13]))[0] = false;
                                 ((int[])((int[])var6[1]))[1] = 0;
                              }

                              if(null != var6 && -14 == ~var6.length && var6[6].equals(Boolean.valueOf(false))) {
                                 joa.a(false);
                              }
                           } else {
                              var6[9] = null;
                           }
                        }

                        if(((boolean[])((boolean[])var6[13]))[2] && he.a(-121) >= ((long[])((long[])var6[4]))[0]) {
                           if(var37 != null && 3 == var37.length && var37[2].equals(Boolean.valueOf(false))) {
                              hf.a((Object[])null, false, (byte)105);
                           }

                           rw var7;
                           rw var8;
                           for(Object[] var52 = (var7 = (rw)qt.a(0, (Object[])((Object[])var6[2]))) != null?var7.y:null; null != var52; var52 = null == (var8 = (rw)nda.a(1, (Object[])((Object[])var6[2])))?null:var8.y) {
                              if(!((boolean[])((boolean[])var52[0]))[0]) {
                                 if(!((boolean[])((boolean[])var52[0]))[2]) {
                                    ((boolean[])((boolean[])var52[0]))[2] = true;
                                 } else {
                                    if(!((boolean[])((boolean[])var52[0]))[1]) {
                                       throw new RuntimeException();
                                    }

                                    ((lm)(var52 == null?null:var52[1])).a((byte)53);
                                 }
                              }
                           }

                           ((long[])((long[])var6[4]))[0] = he.a(-87) - -1000L;
                        }
                     }
                  }
               }
            }

            if(var1 == -1267693944) {
               joa.b(true);
               afa.a((byte)62);
               bi.a((byte)71);
               hq.a(17900, lja.a);
               Class_b.j.a(var1 ^ -1267693856);
               if(lna.g != null) {
                  lna.g.b((int)he.a(65));
               }

               iua.a = 0;
               qpa.e = 0;
               Object[] var38 = lja.a;
               if(var38 == null) {
                  throw new IllegalStateException();
               } else {
                  var6 = bpa.a(9603, (Object)jca.b((byte)-113, (Object[])((Object[])var38[4])));

                  boolean var9;
                  int var39;
                  Object[] var43;
                  Object[] var41;
                  for(var6 = var6; null != var6; var6 = var43) {
                     var39 = gs.b(var1 + 1267693945, var6);
                     if(var39 != 2 && var39 != 3) {
                        if(0 == var39 && iua.a < 75) {
                           bva.b[iua.a] = var6;
                           ++iua.a;
                        }
                     } else {
                        char var42 = Class_t.a(var6, var1 ^ -1267693944);
                        if(qma.a(false) && (var42 == 96 || 167 == var42 || 178 == var42)) {
                           var9 = et.b;
                           if(!var9) {
                              if(qma.a(false)) {
                                 if(ov.b == null) {
                                    pc.a(-128);
                                 }

                                 et.b = true;
                                 bn.f = 0;
                              }
                           } else {
                              mq.a(-127);
                           }
                        } else if(qpa.e < 128) {
                           hqa.b[qpa.e] = var6;
                           ++qpa.e;
                        }
                     }

                     var41 = lja.a;
                     if(var41 == null) {
                        throw new IllegalStateException();
                     }

                     var43 = bpa.a(var1 ^ -1267686645, (Object)jca.b((byte)82, (Object[])((Object[])var41[4])));
                  }

                  cea.f = 0;

                  boolean var44;
                  for(var6 = Class_b.j.c((byte)-68); var6 != null; var6 = Class_b.j.c((byte)-107)) {
                     var39 = uta.a((byte)13, var6);
                     if(-1 == var39) {
                        a(-52, Class_d.e, (lm)(null == var6?null:var6[0]));
                     } else if(var39 != 6) {
                        var44 = var39 == 0 || 1 == var39 || 2 == var39;
                        if(var44) {
                           a(-123, cua.c, (lm)(var6 != null?var6[0]:null));
                           if(-11 > ~wg.a(cua.c, 1)) {
                              jca.b((byte)-124, cua.c);
                           }
                        }
                     } else {
                        cea.f += fg.b(var6, (byte)-85);
                     }
                  }

                  boolean var40 = et.b;
                  if(var40) {
                     bf.a((byte)104);
                  }

                  int var15;
                  Object[] var47;
                  int var45;
                  int var55;
                  Object[] var53;
                  Object[] var58;
                  Object[] var63;
                  if(!fc.b(ipa.d, -3)) {
                     if(pp.a((byte)-63, ipa.d)) {
                        lra.a(false, (byte)-70);
                        jl.c = 0;
                        var44 = true;

                        for(var45 = 0; cf.h.length > var45; ++var45) {
                           if(-1 != du.d[var45] && null == cf.h[var45]) {
                              cf.h[var45] = qn.a(du.d[var45], 0, oe.f, 68);
                              if(null == cf.h[var45]) {
                                 var44 = false;
                                 ++jl.c;
                              }
                           }

                           if(-1 != epa.d[var45] && null == ft.b[var45]) {
                              ft.b[var45] = mn.a(gn.p[var45], 0, epa.d[var45], (byte)124, oe.f);
                              if(null == ft.b[var45]) {
                                 var44 = false;
                                 ++jl.c;
                              }
                           }

                           if(pv.b[var45] != -1 && null == tqa.b[var45]) {
                              tqa.b[var45] = qn.a(pv.b[var45], 0, oe.f, var1 + 1267694022);
                              if(tqa.b[var45] == null) {
                                 ++jl.c;
                                 var44 = false;
                              }
                           }

                           if(0 != ~vla.h[var45] && wu.n[var45] == null) {
                              wu.n[var45] = qn.a(vla.h[var45], 0, oe.f, -124);
                              if(wu.n[var45] == null) {
                                 var44 = false;
                                 ++jl.c;
                              }
                           }

                           if(null != sia.b && mja.j[var45] == null && 0 != ~sia.b[var45]) {
                              mja.j[var45] = mn.a(gn.p[var45], 0, sia.b[var45], (byte)-114, oe.f);
                              if(mja.j[var45] == null) {
                                 ++jl.c;
                                 var44 = false;
                              }
                           }
                        }

                        if(qv.c == null) {
                           if(dqa.c != null && nma.a(be.c, (String)dqa.c[0] + "_staticelements", -25057)) {
                              if(!Class_b.a((String)dqa.c[0] + "_staticelements", (byte)-83, be.c)) {
                                 var44 = false;
                                 ++jl.c;
                              } else {
                                 qv.c = hba.a(wba.c, (String)dqa.c[0] + "_staticelements", (byte)105, be.c);
                              }
                           } else {
                              qv.c = vd.a(0, false, new Object[3]);
                           }
                        }

                        if(!var44) {
                           dha.a = 1;
                        } else {
                           var44 = true;
                           tr.f = 0;

                           int var50;
                           for(var45 = 0; var45 < cf.h.length; ++var45) {
                              byte[] var49 = ft.b[var45];
                              if(null != var49) {
                                 var50 = -rs.f + 64 * (Class_f.d[var45] >> 8);
                                 var12 = 64 * (255 & Class_f.d[var45]) - qm.d;
                                 if(rq.c != 0) {
                                    var50 = 10;
                                    var12 = 10;
                                 }

                                 var44 &= lfa.a(var12, var49, var50, rp.c, wpa.a, var1 + 1267706301);
                              }

                              var49 = wu.n[var45];
                              if(null != var49) {
                                 var50 = -rs.f + (Class_f.d[var45] >> 8) * 64;
                                 var12 = 64 * (255 & Class_f.d[var45]) + -qm.d;
                                 if(0 != rq.c) {
                                    var12 = 10;
                                    var50 = 10;
                                 }

                                 var44 &= lfa.a(var12, var49, var50, rp.c, wpa.a, var1 + 1267706301);
                              }
                           }

                           if(!var44) {
                              dha.a = 2;
                           } else {
                              if(dha.a != 0) {
                                 npa.a(104, lna.g, gj.a(dp.y, -58, gj.f_vb) + cp.e + "(100%)", true, fha.m, nsa.c);
                              }

                              afa.a((byte)115);
                              pa.a(0);
                              il.a(var1 + 1267693822);
                              var9 = false;
                              if(lna.g.w() && 2 == pda.a(true, (Object[])((Object[])tu.d[25]))) {
                                 for(var55 = 0; cf.h.length > var55; ++var55) {
                                    if(null != wu.n[var55] || tqa.b[var55] != null) {
                                       var9 = true;
                                       break;
                                    }
                                 }
                              }

                              if(-2 == ~Class_ss.b((Object[])((Object[])tu.d[38]), 0)) {
                                 var55 = Class_s.b[lj.a];
                              } else {
                                 var55 = hha.f[lj.a];
                              }

                              if(lna.g.m()) {
                                 ++var55;
                              }

                              uua.a(lna.g, tea.b, 9, 4, rp.c, wpa.a, var55, var9, lna.g.x() > 0);
                              qpa.a(hm.a);
                              if(0 == hm.a) {
                                 hr.a((ja)null);
                              } else {
                                 hr.a(kv.f_i);
                              }

                              for(var50 = 0; 4 > var50; ++var50) {
                                 kh.a(121, hj.f_i[var50]);
                              }

                              if(var38 != null && (var38.length == 10 && var38[7].equals(Integer.valueOf(1)) || var38.length == 9 && var38[8].equals(Integer.valueOf(1)))) {
                                 ((byte[])((byte[])gn.r[2]))[2] = 87;
                              }

                              int var13;
                              for(var50 = 0; pd.b.length > var50; ++var50) {
                                 for(var12 = 0; var12 < pd.b[0].length; ++var12) {
                                    if(var38 != null && (var38.length == 19 && var38[14].equals(Integer.valueOf(0)) || var38.length == 27 && var38[8].equals(Boolean.valueOf(false)) && var38[8].equals(Integer.valueOf(0)))) {
                                       ((int[])((int[])((Object[])((Object[])lka.d[3]))[7]))[5] = ((int[])((int[])((Object[])((Object[])fh.b[9]))[1]))[18];
                                    }

                                    for(var13 = 0; var13 < pd.b[0][0].length; ++var13) {
                                       pd.b[var50][var12][var13] = 0;
                                    }
                                 }
                              }

                              bf.a(false, (byte)109);
                              qk.a((byte)74);
                              rl.p = false;
                              afa.a((byte)51);
                              System.gc();
                              lra.a(true, (byte)-70);
                              vk.a = true;
                              nua.e = ft.a((Object[])((Object[])tu.d[13]), (int)-14072);
                              uk.d = Class_e.f >= 96;
                              rd.m = 2 == pda.a(true, (Object[])((Object[])tu.d[25]));
                              nra.d = oua.a((byte)-26, (Object[])((Object[])tu.d[6])) == 1;
                              hd.g = qga.b((Object[])((Object[])tu.d[14]), 13687) == 1?-1:wia.d;
                              gl.d = -2 == ~cf.a((int)100, (Object[])((Object[])tu.d[3]));
                              eva.a = -2 == ~fpa.a((int)0, (Object[])((Object[])tu.d[24]));
                              je.f = jna.a(false, (byte)89, 4, rp.c, new Object[13], wpa.a);
                              if(0 != rq.c) {
                                 cc.a(true, je.f, cf.h);
                              } else {
                                 rea.a(je.f, (byte)-43, cf.h);
                              }

                              var50 = rp.c >> 4;
                              var12 = wpa.a >> 4;
                              var47 = uia.d[var50][var12];
                              if(null != var47) {
                                 st.c = ((int[])((int[])var47[1]))[0];
                                 dm.g = ((int[])((int[])var47[1]))[3];
                                 fka.j = ((int[])((int[])var47[1]))[4];
                              }

                              br.e.ka((0.7F + (float)bqa.a((Object[])((Object[])tu.d[34]), 128) * 0.1F) * tja.f_i);
                              br.e.FA(bma.f_l, bka.e, ps.b, (float)(dm.g << 2), (float)(st.c << 2), (float)(fka.j << 2));
                              br.e.b(ep.b);
                              uia.a((byte)118);
                              if(var9) {
                                 bs.b(true);
                                 pi.y = jna.a(true, (byte)81, 1, rp.c, new Object[13], wpa.a);
                                 if(0 == rq.c) {
                                    rea.a(pi.y, (byte)-43, tqa.b);
                                    lra.a(true, (byte)-70);
                                 } else {
                                    cc.a(true, pi.y, tqa.b);
                                    lra.a(true, (byte)-70);
                                 }

                                 pv.a(0, var1 ^ -1267689351, pi.y, ((int[][][])((int[][][])je.f[4]))[0]);
                                 rr.a(lna.g, (int[][][])null, var1 ^ -1267693944, pi.y, (Object[][])null);
                                 bs.b(false);
                              }

                              rr.a(lna.g, (int[][][])(!var9?null:pi.y[4]), 0, je.f, hj.f_i);
                              int var14;
                              int var17;
                              int var16;
                              int var19;
                              int var18;
                              if(0 == rq.c) {
                                 lra.a(true, (byte)-70);
                                 oja.a(ft.b, 25925, je.f);
                                 if(mja.j != null) {
                                    var13 = mja.j.length;

                                    for(var14 = 0; var13 > var14; ++var14) {
                                       if(mja.j[var14] != null) {
                                          var15 = -1;

                                          for(var16 = 0; var16 < ct.f; ++var16) {
                                             if(~om.d[var16] == ~Class_f.d[var14]) {
                                                var15 = var16;
                                                break;
                                             }
                                          }

                                          if(null != var6 && (-8 == ~var6.length || 4 == var6.length || var6.length == 14)) {
                                             ((Object[])((Object[])it.b[0]))[1] = null;
                                          }

                                          if(-1 == var15) {
                                             om.d[ct.f] = Class_f.d[var14];
                                             var15 = ct.f++;
                                          }

                                          var58 = jta.a((byte)-83, mja.j[var14], new Object[3]);
                                          var17 = 0;

                                          while(mja.j[var14].length > ((int[])((int[])var58[1]))[0] && 511 > var17 && 1023 > rba.h) {
                                             var18 = var17++ << 6 | var15;
                                             var19 = de.a(var1 ^ -1267693944, var58);
                                             int var20 = var19 >> 14;
                                             int var21 = (var19 & 8188) >> 7;
                                             int var22 = var19 & 63;
                                             int var23 = (Class_f.d[var14] >> 8) * 64 - (rs.f + -var21);
                                             int var24 = var22 + ((Class_f.d[var14] & 255) * 64 - qm.d);
                                             Object[] var25 = jra.a((byte)117, de.a((int)0, var58), nt.f_i);
                                             hna var26 = (hna)pm.a((long)var18, hf.g, false);
                                             if(null == var26 && 0 < (1 & ((byte[])((byte[])var25[9]))[3]) && var20 == wia.d && var23 >= 0 && rp.c > ((int[])((int[])var25[1]))[18] + var23 && var24 >= 0 && ~wpa.a < ~(((int[])((int[])var25[1]))[18] + var24)) {
                                                Object[] var27 = ema.a((byte)126, new Object[43]);
                                                ((int[])((int[])var27[12]))[21] = var18;
                                                hna var28 = new hna(var27);
                                                di.a(hf.g, true, var28, (long)var18);
                                                qoa.b[oqa.g++] = var28;
                                                if(null != var27 && var27.length == 6 && var27[1].equals(Integer.valueOf(0))) {
                                                   oi.a((int[])null, (Object[])((Object[])fv.d[6]), 95, (byte)-99, true);
                                                }

                                                gr.c[rba.h++] = var18;
                                                ((int[])((int[])var27[12]))[33] = kda.d;
                                                tq.a(var27, var25, var1 ^ 1267693943);
                                                so.a(((int[])((int[])((Object[])((Object[])var27[42]))[1]))[18], (byte)51, var27);
                                                ((int[])((int[])var27[12]))[27] = ((int[])((int[])((Object[])((Object[])var27[42]))[1]))[30] << 3;
                                                dd.a((byte)0, true, ((byte[])((byte[])((Object[])((Object[])var27[42]))[9]))[7] + 4 << 11 & 14762, var27);
                                                el.a(var20, true, 109, var24, var27, var23, dg.a(-97, var27));
                                             }
                                          }
                                       }
                                    }

                                    if(var38 != null && -9 == ~var38.length) {
                                       mw.a(((int[])((int[])be.c[30]))[6], -105, true, true, 31, ((int[])((int[])bea.e[0]))[6], 72, 73, ((int[])((int[])dfa.a[1]))[10]);
                                    }
                                 }
                              } else {
                                 lra.a(true, (byte)-70);
                                 fea.a(false, ft.b, je.f);
                              }

                              pa.a(0);
                              if(Class_e.f < 96) {
                                 ms.b(14);
                              }

                              lra.a(true, (byte)-70);
                              rg.a(lna.g, je.f, true, (aa)null, var9?wd.a[0]:null);
                              gaa.a(lna.g, false, je.f, (byte)29);
                              lra.a(true, (byte)-70);
                              if(var9) {
                                 bs.b(true);
                                 lra.a(true, (byte)-70);
                                 if(0 != rq.c) {
                                    fea.a(false, wu.n, pi.y);
                                 } else {
                                    oja.a(wu.n, var1 ^ -1267670067, pi.y);
                                 }

                                 pa.a(0);
                                 lra.a(true, (byte)-70);
                                 rg.a(lna.g, pi.y, true, bf.f_l[0], (aa)null);
                                 gaa.a(lna.g, true, pi.y, (byte)51);
                                 lra.a(true, (byte)-70);
                                 bs.b(false);
                              }

                              msa.a = null;
                              kma.f = null;
                              wea.f_l = null;
                              nha.c = null;
                              vk.a = false;
                              rw.w = null;
                              var13 = ((int[])((int[])je.f[1]))[3];
                              if(var13 > jca.n) {
                                 var13 = jca.n;
                              }

                              if(~var13 > ~(-1 + jca.n)) {
                                 var13 = jca.n - 1;
                              }

                              if(0 != qga.b((Object[])((Object[])tu.d[14]), 13687)) {
                                 cp.a(0);
                              } else {
                                 cp.a(var13);
                              }

                              for(var14 = 0; 4 > var14; ++var14) {
                                 for(var15 = 0; var15 < rp.c; ++var15) {
                                    for(var16 = 0; var16 < wpa.a; ++var16) {
                                       fg.a(var14, var15, var16, (byte)122);
                                    }
                                 }

                                 if(null != var6 && var6.length == 15 && var6[6].equals(Integer.valueOf(2)) && var6[6].equals(Integer.valueOf(0))) {
                                    kla.h = ((int[])((int[])dh.e[0]))[2];
                                 }
                              }

                              pfa.a(4168);
                              afa.a((byte)63);
                              hg.a((byte)-115);
                              pa.a(0);
                              spa.a((byte)-116);
                              if(ej.a(14193) == kl.f && lba.f[8] != null && 13 == ipa.d) {
                                 ++ac.b;
                                 var53 = ona.a((byte)127, (Object[])((Object[])lba.f[7]), dg.e);
                                 op.putInt((Object[])((Object[])var53[0]), 1057001181);
                                 lj.a(var53, 6, lba.f);
                              }

                              if(0 == rq.c) {
                                 var14 = (-(rp.c >> 4) + sla.b) / 8;
                                 var15 = ((rp.c >> 4) + sla.b) / 8;
                                 if(null != var6 && -11 == ~var6.length && var6[8].equals(Integer.valueOf(0))) {
                                    aaa.f = (Object[])((Object[])gs.d[0]);
                                 }

                                 var16 = (ld.a + -(wpa.a >> 4)) / 8;
                                 var17 = (ld.a + (wpa.a >> 4)) / 8;

                                 for(var18 = var14 - 1; var18 <= 1 + var15; ++var18) {
                                    if(null != var6 && -19 == ~var6.length && var6[6].equals(Integer.valueOf(2))) {
                                       fua.e = -55;
                                    }

                                    for(var19 = var16 - 1; var17 + 1 >= var19; ++var19) {
                                       if(var14 > var18 || var18 > var15 || var16 > var19 || var17 < var19) {
                                          ke.a(bg.a(true, var18, false, var19, (byte)118), oe.f, false);
                                          ke.a(bg.a(false, var18, false, var19, (byte)-99), oe.f, false);
                                          ke.a(bg.a(true, var18, true, var19, (byte)72), oe.f, false);
                                          ke.a(bg.a(false, var18, true, var19, (byte)109), oe.f, false);
                                       }
                                    }
                                 }
                              }

                              if(8 != ipa.d) {
                                 if(0 != ipa.d) {
                                    if(ipa.d == 7) {
                                       iea.a(15, (byte)-22);
                                    } else {
                                       iea.a(10, (byte)-102);
                                       if(null != lba.f[8]) {
                                          var53 = ona.a((byte)121, (Object[])((Object[])lba.f[7]), iw.e);
                                          lj.a(var53, 6, lba.f);
                                       }
                                    }
                                 } else {
                                    iea.a(5, (byte)-76);
                                 }
                              } else {
                                 iea.a(9, (byte)-100);
                              }

                              if(null != var38 && var38.length == 10) {
                                 a((Object[])((Object[])aaa.f[14]), (Object[][])null, ((int[])((int[])oc.s[2]))[8], -34, -26, -36, -126, 7, 34, ((int[])((int[])ul.p[1]))[14], 105);
                              }

                              iaa.a(false);
                              afa.a((byte)-54);
                              ka.a((byte)72);
                              bla.b = true;
                              if(esa.b) {
                                 qs.a((byte)116, Long.toString(he.a(56) + -oc.f_l));
                                 esa.b = false;
                              }
                           }
                        }
                     }
                  } else {
                     if(null == nv.c) {
                        Object[][] var51 = new Object[][]{ec.C, ec.o, ec.s, ec.w, ec.E, ec.x, ec.B, ec.p, ec.g, ec.q, ec.A, ec.h, ec.D, ec.j, ec.n, ec.c, ec.r, ec.f_l, ec.f_i, ec.f, ec.m};
                        nv.c = var51;
                        ela.g = nv.c[0];
                        fj.e = he.a(-63);
                     }

                     if(eoa.b == null) {
                        pv.a((byte)36);
                     }

                     var41 = ela.g;
                     var45 = ana.a(111);
                     if(ela.g == var41) {
                        fca.b = gj.a(dp.y, var1 + 1267693827, (Object[])((Object[])ela.g[2]));
                        if(((boolean[])((boolean[])ela.g[3]))[0]) {
                           sm.d = var45 * (((int[])((int[])ela.g[1]))[1] - ((int[])((int[])ela.g[1]))[2]) / 100 + ((int[])((int[])ela.g[1]))[2];
                        }

                        if(((boolean[])((boolean[])ela.g[3]))[1]) {
                           fca.b = fca.b + sm.d + "%";
                        }
                     } else if(ela.g == ec.m) {
                        eoa.b = null;
                        iea.a(9, (byte)-106);
                     } else {
                        fca.b = gj.a(dp.y, -58, (Object[])((Object[])var41[0]));
                        if(((boolean[])((boolean[])ela.g[3]))[1]) {
                           fca.b = fca.b + ((int[])((int[])var41[1]))[1] + "%";
                        }

                        sm.d = ((int[])((int[])var41[1]))[1];
                        if(((boolean[])((boolean[])ela.g[3]))[0] || ((boolean[])((boolean[])var41[3]))[0]) {
                           fj.e = he.a(90);
                        }
                     }

                     if(eoa.b != null) {
                        nua.a(eoa.b, fj.e, (byte)-121, ela.g, fca.b, sm.d);
                        if(null != sfa.f_i) {
                           for(var55 = 1 + eda.b; sfa.f_i.length > var55; ++var55) {
                              if(st.a(false, sfa.f_i[var55]) >= 100 && var55 - 1 == eda.b && 2 != ipa.d) {
                                 Object[] var61 = eoa.b;
                                 boolean var56;
                                 synchronized(var61) {
                                    var63 = (Object[])((Object[])var61[4]);
                                    long var62 = ((long[])((long[])var61[6]))[0];
                                    boolean var59;
                                    boolean var67;
                                    if(var63 != null && -5 == ~var63.length) {
                                       var67 = ~he.a(-116) <= ~(var62 - -((long)((int[])((int[])((Object[])((Object[])var63[3]))[1]))[1]));
                                       var59 = var67;
                                    } else {
                                       if(null == var63 || -16 != ~var63.length) {
                                          throw new IllegalStateException();
                                       }

                                       var67 = true;
                                       var59 = var67;
                                    }

                                    var56 = var59;
                                 }

                                 if(var56) {
                                    try {
                                       var47 = sfa.f_i[var55];
                                       if(null != var47 && 4 == var47.length) {
                                          if(var47[0] != lna.g) {
                                             var47[0] = lna.g;
                                             ((boolean[])((boolean[])var47[1]))[0] = true;
                                          }

                                          ((ta)var47[0]).Z(3, 0);
                                          Object[][] var65 = (Object[][])((Object[][])var47[2]);

                                          for(var15 = 0; var65.length > var15; ++var15) {
                                             var58 = var65[var15];
                                             if(null != var58) {
                                                Class_s.a(true, var58);
                                             }
                                          }
                                       } else if(var47 == null || 15 != var47.length) {
                                          throw new IllegalStateException();
                                       }
                                    } catch (Exception var34) {
                                       sfa.f_i = (Object[][])null;
                                       break;
                                    }

                                    var47 = eoa.b;
                                    var53 = sfa.f_i[var55];
                                    synchronized(var47) {
                                       var47[7] = var47[4];
                                       var47[4] = var53;
                                       ((long[])((long[])var47[6]))[0] = he.a(60);
                                    }

                                    ++eda.b;
                                    if(~eda.b <= ~(sfa.f_i.length - 1) && sfa.f_i.length > 1) {
                                       eda.b = aaa.a((int)16777, aqa.d)?0:-1;
                                    }
                                 }
                              }
                           }
                        }
                     }

                     ka.a((byte)-110);
                  }

                  if(sd.a(var1 ^ -1267693948, ipa.d) && !pp.a((byte)-63, ipa.d)) {
                     this.l(var1 ^ -1267693943);
                     if(opa.e != 73) {
                        try {
                           label1263: {
                              if(2000 < ++cv.d) {
                                 ica.a(lba.h, false);
                                 if(pv.d >= 2) {
                                    opa.e = 73;
                                    tea.a = -5;
                                    break label1263;
                                 }

                                 fd.a(ri.j, true);
                                 opa.e = 163;
                                 ++pv.d;
                                 cv.d = 0;
                              }

                              if(opa.e == 163) {
                                 lba.h[8] = cq.createSocketWorker(sf.createSocket(ri.j), 15000);
                                 dv.a((byte)73, lba.h);
                                 opa.e = 228;
                              }

                              if(opa.e == 228 && ke.a((Object[])((Object[])lba.h[8]), -107, 1)) {
                                 at.readBytesFromInputStreamWorker((Object[])((Object[])lba.h[8]), (byte[])((byte[])((Object[])((Object[])lba.h[4]))[2]), 0, 1);
                                 int var48 = 255 & ((byte[])((byte[])((Object[])((Object[])lba.h[4]))[2]))[0];
                                 opa.e = 73;
                                 tea.a = var48;
                                 ica.a(lba.h, false);
                              }
                           }
                        } catch (IOException var33) {
                           ica.a(lba.h, false);
                           if(2 <= pv.d) {
                              opa.e = 73;
                              tea.a = -4;
                           } else {
                              fd.a(ri.j, true);
                              opa.e = 163;
                              cv.d = 0;
                              ++pv.d;
                           }
                        }
                     }

                     ok.a((byte)-79);
                  } else if(jpa.a(ipa.d, -113) && !pp.a((byte)-63, ipa.d)) {
                     this.l(var1 ^ -1267693943);
                     ok.a((byte)-79);
                  } else if(1 == ipa.d) {
                     ok.a((byte)-79);
                  } else if(kf.a(var1 + 1267693970, ipa.d) && !pp.a((byte)-63, ipa.d)) {
                     aka.a(31399);
                  } else if(14 == ipa.d || ipa.d == 3) {
                     ok.a((byte)-79);
                     if(jha.e != -3 && 2 != jha.e && jha.e != 15) {
                        if(3 != ipa.d) {
                           hna.a(-93, false);
                        } else {
                           wda.c = vt.e;
                           md.d = jha.e;
                           oka.c = dl.e;
                           if(!iba.d) {
                              hna.a(-98, ff.c);
                           } else {
                              hj.a(((int[])((int[])gda.c[1]))[0], 3, (String)gda.c[0]);
                              lba.f[8] = null;
                              iea.a(14, (byte)-34);
                           }
                        }
                     }
                  }

                  ta var54 = lna.g;
                  if(wg.a(wv.d, var1 ^ -1267693943) != 0) {
                     if(bg.a(true, (Object[])((Object[])tu.d[5])) == 0) {
                        ri var46;
                        ri var64;
                        for(var63 = (var46 = (ri)dda.a(wv.d, var1 + 1267693946)) == null?null:var46.o; null != var63; var63 = null == (var64 = (ri)a(wv.d, -28280))?null:var64.o) {
                           uq.a(var54, 1, ((int[])((int[])var63[1]))[4], false, ((int[])((int[])var63[1]))[0], ((int[])((int[])var63[1]))[3], var54, false, (Object[])(((boolean[])((boolean[])var63[2]))[0]?uta.g[42]:null), kv.f_i, cqa.a, ((int[])((int[])var63[1]))[1], ((int[])((int[])var63[1]))[2]);
                           ((lm)(var63 == null?null:var63[0])).a((byte)38);
                        }

                        mg.b(true);
                     } else {
                        if(ob.e == null) {
                           Canvas var66 = new Canvas();
                           var66.setSize(36, 32);
                           ob.e = jla.a(var66, 0, uf.f, 0, true, nqa.d);
                           vja.f = ob.e.a(eq.a(nf.c, (byte)66, haa.c, 0), aea.a(lta.h, haa.c, 0), true);
                        }

                        ri var57;
                        ri var60;
                        for(var63 = (var60 = (ri)dda.a(wv.d, var1 ^ -1267693942)) != null?var60.o:null; var63 != null; var63 = null != (var57 = (ri)a(wv.d, -28280))?var57.o:null) {
                           uq.a(ob.e, var1 + 1267693945, ((int[])((int[])var63[1]))[4], false, ((int[])((int[])var63[1]))[0], ((int[])((int[])var63[1]))[3], var54, false, (Object[])(((boolean[])((boolean[])var63[2]))[0]?uta.g[42]:null), vja.f, cqa.a, ((int[])((int[])var63[1]))[1], ((int[])((int[])var63[1]))[2]);
                           ((lm)(null == var63?null:var63[0])).a((byte)72);
                        }

                        if(null != var38 && 8 == var38.length) {
                           ck.e = -59;
                        }
                     }
                  }

                  jca.b((byte)64, cua.c);
               }
            }
         }
      } catch (RuntimeException var36) {
         throw vt.a(var36, "client.IA(" + var1 + ')');
      }
   }

   private final void a(byte var1, int var2) {
      if(var1 < 103) {
         Db = (Object[])null;
      }

      ++xb;
      dna.a = null;
      vga.d = null;
      no.k = 0;
      ++((int[])((int[])dka.g[1]))[0];
      ((int[])((int[])dka.g[1]))[1] = var2;
   }

   static final void a(byte var0, int var1, Object[] var2) {
      ++f_db;
      if(var0 <= 93) {
         b((Object[])null);
      }

      if(sda.a(var1, var2, 108)) {
         if(null != var2[4]) {
            ((Object[][])((Object[][])var2[4]))[var1] = null;
         }

      }
   }

   static final void a(boolean var0, int[] var1, int var2, Object[] var3) {
      ++f_sb;
      int var5 = ((int[])((int[])var3[1]))[2] * bv.b[var2];
      if(var0) {
         Db = new Object[27];
      }

      int var4;
      int var6;
      int var8;
      short var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var17;
      int var16;
      int var18;
      if(1 == ((int[])((int[])var3[1]))[4]) {
         var9 = ((short[])((short[])var3[6]))[0];
         var8 = ((short[])((short[])var3[8]))[0] << 12;
         var13 = ((int[])((int[])var3[1]))[2] * var8 >> 12;
         var11 = var5 * var8 >> 12;
         var12 = ((int[])((int[])var3[1]))[1] * var8 >> 12;
         var15 = var11 >> 12;
         var16 = 1 + var15;
         var11 &= 4095;
         if(var13 <= var16) {
            var16 = 0;
         }

         var17 = 255 & ((byte[])((byte[])var3[7]))[var15 & 255];
         var14 = gsa.e[var11];
         if(var3 != null && -12 == ~var3.length) {
            return;
         }

         var18 = ((byte[])((byte[])var3[7]))[var16 & 255] & 255;
         if(((boolean[])((boolean[])var3[3]))[1]) {
            for(var10 = 0; fo.b > var10; ++var10) {
               var4 = wra.d[var10] * ((int[])((int[])var3[1]))[1];
               var6 = coa.a(var17, var14, var11, var3, (byte)98, var4 * var8 >> 12, var18, var12);
               var6 = var6 * var9 >> 12;
               var1[var10] = 2048 + (var6 >> 1);
            }

            if(var3 != null && -5 == ~var3.length) {
               gn.a(-3, true, -104, -29, 54, 44, -1.766045F, 101, -124);
            }
         } else {
            for(var10 = 0; fo.b > var10; ++var10) {
               var4 = wra.d[var10] * ((int[])((int[])var3[1]))[1];
               var6 = coa.a(var17, var14, var11, var3, (byte)88, var4 * var8 >> 12, var18, var12);
               var1[var10] = var9 * var6 >> 12;
            }

            if(null != var3 && var3.length == 13) {
               return;
            }
         }
      } else {
         var9 = ((short[])((short[])var3[6]))[0];
         if(8 < var9 || -8 > var9) {
            var8 = ((short[])((short[])var3[8]))[0] << 12;
            var13 = var8 * ((int[])((int[])var3[1]))[2] >> 12;
            var12 = var8 * ((int[])((int[])var3[1]))[1] >> 12;
            var11 = var5 * var8 >> 12;
            var15 = var11 >> 12;
            var16 = 1 + var15;
            if(var16 >= var13) {
               var16 = 0;
            }

            var11 &= 4095;
            if(null != var3 && var3.length == 13) {
               mqa.a((Object[])null, -1);
            }

            var17 = 255 & ((byte[])((byte[])var3[7]))[var15 & 255];
            var18 = 255 & ((byte[])((byte[])var3[7]))[var16 & 255];
            var14 = gsa.e[var11];

            for(var10 = 0; fo.b > var10; ++var10) {
               var4 = ((int[])((int[])var3[1]))[1] * wra.d[var10];
               var6 = coa.a(var17, var14, var11, var3, (byte)102, var8 * var4 >> 12, var18, var12);
               var1[var10] = var9 * var6 >> 12;
            }
         }

         for(int var7 = 1; ((int[])((int[])var3[1]))[4] > var7; ++var7) {
            var9 = ((short[])((short[])var3[6]))[var7];
            if(8 < var9 || -8 > var9) {
               var8 = ((short[])((short[])var3[8]))[var7] << 12;
               var12 = var8 * ((int[])((int[])var3[1]))[1] >> 12;
               var11 = var5 * var8 >> 12;
               var13 = ((int[])((int[])var3[1]))[2] * var8 >> 12;
               var15 = var11 >> 12;
               var16 = var15 + 1;
               if(var16 >= var13) {
                  var16 = 0;
               }

               if(null != var3 && 2 == var3.length && var3[1].equals(Boolean.valueOf(false))) {
                  mqa.a((Object[])null, -1);
               }

               var11 &= 4095;
               var18 = 255 & ((byte[])((byte[])var3[7]))[var16 & 255];
               var17 = 255 & ((byte[])((byte[])var3[7]))[255 & var15];
               var14 = gsa.e[var11];
               if(((boolean[])((boolean[])var3[3]))[1] && ~var7 == ~(((int[])((int[])var3[1]))[4] - 1)) {
                  if(null != var3 && var3.length == 7) {
                     coa.a(-60, 118, -74, (Object[])null, (byte)115, 13, 62, -8);
                  }

                  for(var10 = 0; fo.b > var10; ++var10) {
                     var4 = wra.d[var10] * ((int[])((int[])var3[1]))[1];
                     var6 = coa.a(var17, var14, var11, var3, (byte)114, var4 * var8 >> 12, var18, var12);
                     var6 = (var6 * var9 >> 12) + var1[var10];
                     var1[var10] = (var6 >> 1) + 2048;
                  }
               } else {
                  for(var10 = 0; var10 < fo.b; ++var10) {
                     var4 = wra.d[var10] * ((int[])((int[])var3[1]))[1];
                     var6 = coa.a(var17, var14, var11, var3, (byte)69, var8 * var4 >> 12, var18, var12);
                     var1[var10] += var6 * var9 >> 12;
                  }

                  if(null != var3 && var3.length == 2 && var3[1].equals(Boolean.valueOf(false)) && var3[1].equals(Integer.valueOf(2))) {
                     return;
                  }
               }
            }
         }
      }

   }

   public final void init() {
      try {
         ++Nb;
         if(this.f(-111)) {
            Object[][] var1 = new Object[][]{ufa.c, go.f, uoa.c, qta.g, iaa.c, di.a, bj.d, nda.e, rt.c, sb.d, tr.c, dqa.e, aka.b, sv.g, bd.e, npa.a, kfa.c, df.e, aca.a, es.h, dma.g, sma.a, op.a, bt.c, gta.c, vl.a, qv.h, wt.b, sra.a, ib.f};
            Object[][] var2 = var1;

            int var3;
            int var6;
            String var26;
            for(var3 = 0; var3 < var2.length; ++var3) {
               Object[] var4 = var2[var3];
               String var5 = this.getParameter((String)var4[0]);
               if(null != var5) {
                  var6 = Integer.parseInt((String)var4[0]);
                  if(12 == var6) {
                     ji.f = Integer.parseInt(var5);
                  } else if(var6 == 29) {
                     if(var5.equalsIgnoreCase(ffa.d)) {
                        ol.e = true;
                     } else {
                        ol.e = false;
                     }
                  } else if(var6 == 18) {
                     bb.g = Integer.parseInt(var5);
                  } else if(var6 == 22) {
                     if(null == ri.j) {
                        ri.j = oe.a(new Object[3]);
                     }

                     ri.j[0] = var5;
                  } else if(9 == var6) {
                     fsa.g = gn.a(Integer.parseInt(var5), 110);
                  } else if(11 == var6) {
                     if(var5.equalsIgnoreCase(ffa.d)) {
                        lv.x = true;
                     } else {
                        lv.x = false;
                     }
                  } else if(var6 == 15) {
                     oqa.c = var5;
                  } else if(var6 != 13) {
                     if(10 == var6) {
                        ai.c = var5;
                        if(ai.c.length() > 50) {
                           ai.c = null;
                        }
                     } else if(var6 == 28) {
                        sh.c = var5;
                     } else if(25 == var6) {
                        vha.a = oe.a(new Object[3]);
                        ((int[])((int[])vha.a[1]))[0] = Integer.parseInt(var5);
                     } else if(var6 == 7) {
                        if(var5.equalsIgnoreCase(ffa.d)) {
                           ke.b = true;
                        }
                     } else if(var6 == 27) {
                        if(ri.j == null) {
                           ri.j = oe.a(new Object[3]);
                        }

                        ((int[])((int[])ri.j[1]))[0] = Integer.parseInt(var5);
                     } else if(var6 == 31) {
                        if(var5.equalsIgnoreCase(ffa.d)) {
                           mu.b = true;
                        } else {
                           mu.b = false;
                        }
                     } else if(var6 == 16) {
                        if(var5.equalsIgnoreCase(ffa.d)) {
                           hfa.a = true;
                        } else {
                           hfa.a = false;
                        }
                     } else if(8 == var6) {
                        dp.y = Integer.parseInt(var5);
                     } else {
                        int var9;
                        if(var6 == 14) {
                           if(var5 != null) {
                              var26 = lqa.a(var5, -71);
                              int var27 = var26.length();
                              byte[] var25;
                              if(0 != var27) {
                                 var9 = -4 & 3 + var27;
                                 int var28 = var9 / 4 * 3;
                                 if(var9 - 2 < var27 && 0 != ~cra.a(var26.charAt(-2 + var9), (byte)-101)) {
                                    if(var27 <= var9 - 1 || -1 == cra.a(var26.charAt(-1 + var9), (byte)81)) {
                                       --var28;
                                    }
                                 } else {
                                    var28 -= 2;
                                 }

                                 byte[] var11 = new byte[var28];
                                 int var12 = 0;
                                 int var13 = var26.length();
                                 if(var4 != null && var4.length == 13 && var4[2].equals(Integer.valueOf(2))) {
                                    opa.a(3, 109, ((int[])((int[])ura.a[2]))[0], -26);
                                 }

                                 for(int var14 = 0; var13 > var14; var14 += 4) {
                                    int var15 = cra.a(var26.charAt(var14), (byte)69);
                                    int var16 = 1 + var14 < var13?cra.a(var26.charAt(1 + var14), (byte)-88):-1;
                                    int var17 = var13 > var14 + 2?cra.a(var26.charAt(var14 + 2), (byte)62):-1;
                                    int var18 = 3 + var14 < var13?cra.a(var26.charAt(3 + var14), (byte)86):-1;
                                    var11[var12++] = (byte)(var15 << 2 | var16 >>> 4);
                                    if(~var17 == 0) {
                                       break;
                                    }

                                    var11[var12++] = (byte)(var16 << 4 & 240 | var17 >>> 2);
                                    if(-1 == var18) {
                                       break;
                                    }

                                    var11[var12++] = (byte)(var18 | 192 & var17 << 6);
                                 }

                                 var25 = var11;
                              } else {
                                 var25 = new byte[0];
                              }

                              cl.c = var25;
                              if(cl.c.length < 16) {
                                 cl.c = null;
                              }
                           }
                        } else if(var6 != 5) {
                           if(var6 != 21) {
                              if(var6 == 1) {
                                 if(!var5.equals(ffa.d)) {
                                    nma.f = false;
                                 } else {
                                    nma.f = true;
                                 }
                              } else if(23 == var6) {
                                 po.f_i = aja.a(false, Integer.parseInt(var5));
                                 if(po.f_i != uca.c) {
                                    if(!mga.b(po.f_i, -11605) && mka.g != po.f_i) {
                                       po.f_i = mka.g;
                                    }
                                 } else {
                                    po.f_i = em.f;
                                 }
                              } else if(3 == var6) {
                                 if(!var5.equals(ffa.d)) {
                                    oo.c = false;
                                 } else {
                                    oo.c = true;
                                 }
                              } else if(30 == var6) {
                                 rna.d = var5;
                              } else if(var6 == 26) {
                                 poa.g = Integer.parseInt(var5);
                              } else if(var6 != 2) {
                                 if(var6 == 6) {
                                    sg.a = var5;
                                 } else if(var6 == 20) {
                                    if(!var5.equalsIgnoreCase(ffa.d)) {
                                       vn.e = false;
                                    } else {
                                       vn.e = true;
                                    }
                                 } else if(24 == var6) {
                                    ida.q = var5;
                                 } else if(var6 == 17) {
                                    ih.e = Long.parseLong(var5);
                                 } else if(var6 != 4) {
                                    taa.a(new RuntimeException(), 32, "");
                                 }
                              } else if(!var5.equalsIgnoreCase(ffa.d)) {
                                 vl.b = false;
                              } else {
                                 vl.b = true;
                              }
                           } else {
                              jra.f_i = Integer.parseInt(var5);
                              if(jra.f_i < 0 || tj.f.length <= jra.f_i) {
                                 jra.f_i = 0;
                              }
                           }
                        } else {
                           int var7 = Integer.parseInt(var5);
                           if(var4 != null && 8 == var4.length && var4[2].equals(Integer.valueOf(1))) {
                              cr.c = null;
                           }

                           Object[][] var8 = Class_k.a(true);
                           var9 = 0;

                           Object[] var24;
                           while(true) {
                              if(var8.length <= var9) {
                                 var24 = null;
                                 break;
                              }

                              Object[] var10 = var8[var9];
                              if(var7 == ((int[])((int[])var10[1]))[0]) {
                                 var24 = var10;
                                 break;
                              }

                              ++var9;
                           }

                           dja.c = var24;
                           if(sia.d != dja.c && dja.c != du.h && dja.c != js.e && vga.a != dja.c) {
                              dja.c = vga.a;
                           }
                        }
                     }
                  }
               }
            }

            if(rna.d == null) {
               rna.d = "";
            }

            if(fsa.g != uha.g && fsa.g != bu.b && op.h != fsa.g) {
               if(fsa.g == vw.e) {
                  iia.r = 640;
                  qga.j = 480;
               }
            } else {
               qga.j = 503;
               iia.r = 765;
            }

            Object[] var21 = new Object[2];
            var3 = iia.r;
            int var22 = qga.j;
            int var23 = bka.d;
            var6 = qr.f;
            var26 = (String)fsa.g[0];
            if(null == var21[1]) {
               var21[1] = new int[4];
            }

            ((int[])((int[])var21[1]))[3] = var23;
            ((int[])((int[])var21[1]))[0] = var3;
            var21[0] = var26;
            ((int[])((int[])var21[1]))[1] = var6;
            ((int[])((int[])var21[1]))[2] = var22;
            kqa.h = this;
            this.a(1, (byte)-30, (String)dja.c[0], (String)fsa.g[2], 670, ((int[])((int[])dja.c[1]))[0] + 32, var21, 37, vn.e);
         }
      } catch (RuntimeException var20) {
         throw vt.a(var20, "client.init()");
      }
   }

   static final void m(int var0) {
      int var1 = ofa.b;
      int[] var2 = ot.a;
      int var3;
      if(bw.b == 0) {
         var3 = ofa.e.length;
      } else {
         var3 = var1 + rba.h;
      }

      for(int var4 = 0; var4 < var3; ++var4) {
         Object[] var5;
         if(bw.b == 0) {
            Object[] var6 = ofa.e[var4];
            if(!((boolean[])((boolean[])var6[2]))[0]) {
               continue;
            }

            var5 = za.a(var6, (byte)93);
         } else {
            if(var4 < var1) {
               var5 = vo.E[var2[var4]];
            } else {
               var5 = ((hna)pm.a((long)gr.c[var4 - var1], hf.g, false)).k;
            }

            if(((byte[])((byte[])var5[10]))[0] != var0 || ((int[])((int[])var5[12]))[15] < 0) {
               continue;
            }
         }

         int var15 = dg.a(-107, var5);
         Object[] var7 = (Object[])((Object[])woa.a(5, var5)[1]);
         if((var15 & 1) == 0) {
            if(((int)((float[])((float[])var7[1]))[2] & 511) != 0 || ((int)((float[])((float[])var7[1]))[1] & 511) != 0) {
               continue;
            }
         } else if(((int)((float[])((float[])var7[1]))[2] & 511) != 256 || ((int)((float[])((float[])var7[1]))[1] & 511) != 256) {
            continue;
         }

         int var8;
         int var9;
         if(var15 == 1) {
            var8 = (int)((float[])((float[])var7[1]))[2] >> 9;
            var9 = (int)((float[])((float[])var7[1]))[1] >> 9;
            if(((int[])((int[])var5[12]))[15] > ra.f_i[var8][var9]) {
               ra.f_i[var8][var9] = ((int[])((int[])var5[12]))[15];
               pj.d[var8][var9] = 1;
            } else if(((int[])((int[])var5[12]))[15] == ra.f_i[var8][var9]) {
               ++pj.d[var8][var9];
            }
         } else {
            var8 = (var15 - 1) * 256 + 60;
            if(var7 != null && var7.length == 3 && var7[1].equals(Integer.valueOf(1))) {
               kf.a((byte)114, ((boolean[])((boolean[])lv.w[5]))[16], (String)os.k[0]);
            }

            var9 = (int)((float[])((float[])var7[1]))[2] - var8 >> 9;
            int var10 = (int)((float[])((float[])var7[1]))[1] - var8 >> 9;
            int var11 = (int)((float[])((float[])var7[1]))[2] + var8 >> 9;
            int var12 = (int)((float[])((float[])var7[1]))[1] + var8 >> 9;

            for(int var13 = var9; var13 <= var11; ++var13) {
               if(var7 != null && var7.length == 3 && var7[2].equals(Integer.valueOf(2))) {
                  dl.b = null;
               }

               for(int var14 = var10; var14 <= var12; ++var14) {
                  if(((int[])((int[])var5[12]))[15] > ra.f_i[var13][var14]) {
                     ra.f_i[var13][var14] = ((int[])((int[])var5[12]))[15];
                     pj.d[var13][var14] = 1;
                  } else if(((int[])((int[])var5[12]))[15] == ra.f_i[var13][var14]) {
                     ++pj.d[var13][var14];
                  }
               }
            }
         }
      }

   }

   static final void b(int var0, Object[] var1) {
      ++Lb;
      if(var1[var0] == null) {
         var1[1] = new int[1];
      }

   }

   private final void l(int var1) {
      ++Ab;
      int var8;
      if(ipa.d == 5 && !cj.a((byte)126) || ipa.d == 15 && 42 == jha.e) {
         if(lt.h > 1) {
            --lt.h;
            eo.b = qr.a;
         }

         if(!kea.c) {
            ll.a((byte)-87);
         }

         for(var8 = 0; 100 > var8 && cja.a(lba.h, var1 - 30324); ++var8) {
            ;
         }
      }

      haa.a(var1 + 14);
      ++Class_ds.c;
      hpa.c = -1;
      wr.o = -1;
      if(var1 != 1) {
         Db = (Object[])null;
      }

      ora.a(-1, var1 - 12, -1, (Object[])null);
      ka.a((int)0);
      ++qr.a;

      Object[] var9;
      for(var8 = 0; oqa.g > var8; ++var8) {
         var9 = qoa.b[var8].k;
         if(null != var9) {
            byte var10 = ((byte[])((byte[])((Object[])((Object[])var9[42]))[9]))[3];
            if((1 & var10) != 0) {
               if(var9 != null && -2 == ~var9.length) {
                  kg.a(((int[])((int[])mi.g[11]))[2], 111, 93, 111, -91, -18649);
               }

               int var11 = dg.a(-102, var9);
               int var12;
               if(-1 != ~(var10 & 2) && ((int[])((int[])var9[12]))[18] == 0 && 1000.0D * Math.random() < 10.0D) {
                  var12 = (int)Math.round(-5.0D + Math.random() * 10.0D);
                  int var13 = (int)Math.round(10.0D * Math.random() - 5.0D);
                  if(0 != var12 || 0 != var13) {
                     int var14 = ((int[])((int[])var9[33]))[0] + var12;
                     int var15 = ((int[])((int[])var9[14]))[0] + var13;
                     if(var14 >= 0) {
                        if(var14 > -1 + -var11 + rp.c) {
                           var14 = -1 + rp.c + -var11;
                        }
                     } else {
                        var14 = 0;
                     }

                     if(var15 < 0) {
                        var15 = 0;
                     } else if(-1 + wpa.a - var11 < var15) {
                        var15 = wpa.a - (var11 + 1);
                     }

                     int var16 = wta.a(ega.a, var14, var15, rba.c, ((int[])((int[])var9[14]))[0], hj.f_i[((byte[])((byte[])var9[10]))[0]], -1, var11, -1, var11, var11, 0, 0, true, ((int[])((int[])var9[33]))[0]);
                     if(0 < var16) {
                        if(var16 > 9) {
                           var16 = 9;
                        }

                        if(var9 != null && 1 == var9.length && var9[0].equals(Integer.valueOf(0))) {
                           qaa.r = ((int[])((int[])ij.e[20]))[1];
                        }

                        for(int var17 = 0; var16 > var17; ++var17) {
                           ((int[])((int[])var9[33]))[var17] = ega.a[-1 + var16 + -var17];
                           ((int[])((int[])var9[14]))[var17] = rba.c[-1 + var16 + -var17];
                           ((byte[])((byte[])var9[22]))[var17] = 1;
                        }

                        ((int[])((int[])var9[12]))[18] = var16;
                     }
                  }
               }

               ft.a(var9, true, 65);
               var12 = ol.a(var9, 1);
               aba.a(-60, var9);
               uja.a(la.h, var12, 126, var9, jma.k);
               tm.a((byte)-119, jma.k, var9);
               lga.a(true, var9);
               Object[] var22 = wua.a(true, new Object[2]);
               ao.a(0, mw.a(bca.a((Object[])((Object[])var9[35]), false), (byte)68), var22, mw.a(bca.a((Object[])((Object[])var9[24]), false), (byte)48), mw.a(bca.a((Object[])((Object[])var9[28]), false), (byte)127));
               una.a(var22, (byte)-63, var9);
            }
         }
      }

      if((9 == ipa.d || ipa.d == 15 || ipa.d == 5) && (!cj.a((byte)127) || ipa.d == 15 && 42 == jha.e) && opa.e == 73) {
         if(4 == ha.e) {
            jl.a(256);
         } else {
            rd.a(2);
         }

         if(14 > woa.M >> 9 || ~(woa.M >> 9) <= ~(rp.c - 14) || 14 > pta.f >> 9 || pta.f >> 9 >= -14 + wpa.a) {
            jka.a(var1 ^ -7680);
         }
      }

      while(true) {
         bs var2;
         Object[] var20 = (var2 = (bs)jca.b((byte)11, mna.a)) == null?null:var2.o;
         Object[] var21;
         if(var20 == null) {
            while(true) {
               bs var3;
               var20 = (var3 = (bs)jca.b((byte)31, oq.a)) == null?null:var3.o;
               if(null == var20) {
                  while(true) {
                     bs var4;
                     var20 = null != (var4 = (bs)jca.b((byte)-118, it.b))?var4.o:null;
                     if(null == var20) {
                        if(dca.e != null) {
                           hq.a(var1 ^ -103);
                        }

                        if(-1 == ~(kda.d % 1500)) {
                           us.a(var1 ^ 13);
                        }

                        if(ipa.d == 5 && !cj.a((byte)126) || ipa.d == 15 && jha.e == 42) {
                           voa.a(false);
                        }

                        mw.a((byte)-117);
                        if(dn.d && ~(he.a(-56) - 60000L) < ~jsa.c) {
                           qv.a(89);
                        }

                        oia var5;
                        oia var6;
                        for(var20 = (var5 = (oia)om.a(qc.a, false)) == null?null:var5.v; null != var20; var20 = (var6 = (oia)pw.a(qc.a, var1 ^ -115)) == null?null:var6.v) {
                           if(~(-5L + he.a(125) / 1000L) < ~((long)((int[])((int[])var20[1]))[0])) {
                              if(-1 > ~((short[])((short[])var20[3]))[0]) {
                                 jl.a("", 5, 8191, "", "", 0, (String)var20[2] + gj.a(dp.y, -40, gj.Z));
                              }

                              if(0 == ((short[])((short[])var20[3]))[0]) {
                                 jl.a("", 5, var1 ^ 8190, "", "", 0, (String)var20[2] + gj.a(dp.y, var1 + 91, gj.H));
                              }

                              ((nj)(null != var20?var20[0]:null)).a(var1 + 0);
                           }
                        }

                        if(5 == ipa.d && !cj.a((byte)123) || 15 == ipa.d && 42 == jha.e) {
                           if(15 != ipa.d && lba.h[8] == null) {
                              hna.a(-127, false);
                              return;
                           }

                           if(lba.h != null) {
                              ++((int[])((int[])lba.h[1]))[6];
                              if(-51 > ~((int[])((int[])lba.h[1]))[6]) {
                                 ++dn.b;
                                 var20 = ona.a((byte)112, (Object[])((Object[])lba.h[7]), iba.f);
                                 lj.a(var20, 6, lba.h);
                              }

                              try {
                                 dv.a((byte)83, lba.h);
                              } catch (IOException var19) {
                                 if(ipa.d == 15) {
                                    ica.a(lba.h, false);
                                 } else {
                                    hna.a(-118, false);
                                 }
                              }
                           }
                        }

                        return;
                     }

                     var9 = (Object[])((Object[])var20[0]);
                     if(-1 >= ~((int[])((int[])var9[1]))[47]) {
                        var21 = hg.a(((int[])((int[])var9[1]))[39], (byte)-90);
                        if(var21 == null || null == var21[48] || ~((Object[])((Object[])var21[48])).length >= ~((int[])((int[])var9[1]))[47] || ((Object[][])((Object[][])var21[48]))[((int[])((int[])var9[1]))[47]] != var9) {
                           continue;
                        }
                     }

                     ck.a(var20, true);
                  }
               }

               var9 = (Object[])((Object[])var20[0]);
               if(((int[])((int[])var9[1]))[47] >= 0) {
                  var21 = hg.a(((int[])((int[])var9[1]))[39], (byte)-107);
                  if(null == var21 || null == var21[48] || ((Object[])((Object[])var21[48])).length <= ((int[])((int[])var9[1]))[47] || ((Object[][])((Object[][])var21[48]))[((int[])((int[])var9[1]))[47]] != var9) {
                     continue;
                  }
               }

               ck.a(var20, true);
            }
         }

         var9 = (Object[])((Object[])var20[0]);
         if(((int[])((int[])var9[1]))[47] >= 0) {
            var21 = hg.a(((int[])((int[])var9[1]))[39], (byte)-100);
            if(null == var21 || var21[48] == null || ((Object[])((Object[])var21[48])).length <= ((int[])((int[])var9[1]))[47] || var9 != ((Object[][])((Object[][])var21[48]))[((int[])((int[])var9[1]))[47]]) {
               continue;
            }
         }

         ck.a(var20, true);
      }
   }

   static final void b(Object[] var0, int var1) {
      if(var0[12] == null) {
         var0[12] = var0[0];
      }

      ++Ob;
      if(var1 != 2) {
         f_ob = (Object[])null;
      }

   }

   static final void j(int var0) {
      int var1 = ofa.b;
      int[] var2 = ot.a;
      int var3;
      if(bw.b == 0) {
         var3 = ofa.e.length;
      } else {
         var3 = tn.g?var1:var1 + rba.h;
      }

      for(int var4 = 0; var4 < var3; ++var4) {
         Object[] var5;
         if(bw.b == 0) {
            Object[] var6 = ofa.e[var4];
            if(!((boolean[])((boolean[])var6[2]))[0]) {
               continue;
            }

            var5 = za.a(var6, (byte)93);
         } else {
            if(var4 < var1) {
               var5 = vo.E[var2[var4]];
            } else {
               var5 = ((hna)pm.a((long)gr.c[var4 - var1], hf.g, false)).k;
            }

            if(((byte[])((byte[])var5[10]))[0] != var0) {
               continue;
            }

            if(((int[])((int[])var5[12]))[15] < 0) {
               ((boolean[])((boolean[])var5[8]))[8] = false;
               continue;
            }
         }

         ((int[])((int[])var5[12]))[6] = 0;
         int var15 = dg.a(-92, var5);
         Object[] var7 = (Object[])((Object[])woa.a(5, var5)[1]);
         if((var15 & 1) == 0) {
            if(((int)((float[])((float[])var7[1]))[2] & 511) != 0 || ((int)((float[])((float[])var7[1]))[1] & 511) != 0) {
               ((boolean[])((boolean[])var5[8]))[8] = false;
               continue;
            }
         } else if(((int)((float[])((float[])var7[1]))[2] & 511) != 256 || ((int)((float[])((float[])var7[1]))[1] & 511) != 256) {
            ((boolean[])((boolean[])var5[8]))[8] = false;
            continue;
         }

         int var14;
         if(bw.b != 0) {
            int var8;
            int var9;
            if(var15 == 1) {
               var8 = (int)((float[])((float[])var7[1]))[2] >> 9;
               var9 = (int)((float[])((float[])var7[1]))[1] >> 9;
               if(((int[])((int[])var5[12]))[15] != ra.f_i[var8][var9]) {
                  ((boolean[])((boolean[])var5[8]))[8] = true;
                  continue;
               }

               if(pj.d[var8][var9] > 1) {
                  --pj.d[var8][var9];
                  ((boolean[])((boolean[])var5[8]))[8] = true;
                  continue;
               }
            } else {
               var8 = (var15 - 1) * 256 + 252;
               var9 = (int)((float[])((float[])var7[1]))[2] - var8 >> 9;
               int var10 = (int)((float[])((float[])var7[1]))[1] - var8 >> 9;
               int var11 = (int)((float[])((float[])var7[1]))[2] + var8 >> 9;
               int var12 = (int)((float[])((float[])var7[1]))[1] + var8 >> 9;
               if(!kg.a(var11, var10, var9, var12, ((int[])((int[])var5[12]))[15], -18649)) {
                  for(int var13 = var9; var13 <= var11; ++var13) {
                     for(var14 = var10; var14 <= var12; ++var14) {
                        if(((int[])((int[])var5[12]))[15] == ra.f_i[var13][var14]) {
                           --pj.d[var13][var14];
                        }
                     }

                     if(var7 != null && var7.length == 1) {
                        ld.d = null;
                     }
                  }

                  if(var7 != null && var7.length == 23 && var7[2].equals(Integer.valueOf(1)) && var7[2].equals(Integer.valueOf(0))) {
                     kca.b = (String)aaa.f[0];
                  }

                  ((boolean[])((boolean[])var5[8]))[8] = true;
                  continue;
               }
            }
         }

         ((boolean[])((boolean[])var5[8]))[8] = false;
         Object[] var16 = new Object[2];
         float var17 = ((float[])((float[])var7[1]))[2];
         var14 = Class_ds.a(((byte[])((byte[])var5[10]))[0], (int)((float[])((float[])var7[1]))[2], (int)((float[])((float[])var7[1]))[1], (byte)122);
         sra.a(var5, bl.a((byte)-118, var17, var16, ((float[])((float[])var7[1]))[1], (float)var14), 1);
         eja.a(var5, true);
      }

   }

   static final int a(boolean var0, int var1, Object[] var2) {
      ++f_rb;
      if(var1 != 0) {
         c();
      }

      long var8 = he.a(78);

      uda var3;
      uda var4;
      for(Object[] var10 = null != (var3 = (uda)(var0?qt.a(0, (Object[])((Object[])var2[1])):nda.a(1, (Object[])((Object[])var2[1]))))?var3.r:null; null != var10; var10 = null != (var4 = (uda)nda.a(1, (Object[])((Object[])var2[1])))?var4.r:null) {
         if(~(((long[])((long[])var10[1]))[0] & 4611686018427387903L) > ~var8) {
            if((4611686018427387904L & ((long[])((long[])var10[1]))[0]) != 0L) {
               int var11 = (int)((lm)(null == var10?null:var10[0])).e;
               ((int[])((int[])var2[2]))[var11] = ((int[])((int[])var2[0]))[var11];
               ((lm)(var10 != null?var10[0]:null)).a((byte)121);
               return var11;
            }

            ((lm)(var10 == null?null:var10[0])).a((byte)79);
         }
      }

      if(null != var2 && -13 == ~var2.length && var2[3].equals(Integer.valueOf(1))) {
         tba.f = null;
      }

      return -1;
   }

   private final void h(byte var1) {
      ++f_cb;
      Object[] var3 = dka.g;
      if(var3 == null) {
         throw new IllegalStateException();
      } else {
         if(var3 != null && (var3.length == 18 && var3[7].equals(Integer.valueOf(0)) || var3.length == 6)) {
            tra.b = ((long[])((long[])qaa.j[35]))[2];
         }

         if(var3[10] != null) {
            long var20 = he.a(var1 + 5);
            int var22 = (int)(-((long[])((long[])var3[7]))[0] + var20);
            ((long[])((long[])var3[7]))[0] = var20;
            if(var22 > 200) {
               var22 = 200;
            }

            ((int[])((int[])var3[1]))[2] += var22;
            if(((int[])((int[])var3[1]))[2] > 30000) {
               try {
                  qi.a((Object[])((Object[])var3[10]), (int)4);
               } catch (Exception var36) {
                  ;
               }

               var3[10] = null;
            }
         }

         boolean var4;
         if(null != var3[10]) {
            try {
               rw var5;
               rw var6;
               Object[] var38;
               for(var38 = null == (var5 = (rw)gm.a((Object[])((Object[])var3[8]), 0))?null:var5.y; null != var38; var38 = null == (var6 = (rw)dka.a((Object[])((Object[])var3[8]), (byte)119))?null:var6.y) {
                  ((int[])((int[])((Object[])((Object[])var3[3]))[1]))[0] = 0;
                  ek.putByte((Object[])((Object[])var3[3]), 1);
                  uk.put40BitInteger((Object[])((Object[])var3[3]), ((tha)(var38 != null?var38[1]:null)).m);
                  oua.writeBytesToOutputStreamWorker((Object[])((Object[])var3[10]), (byte[])((byte[])((Object[])((Object[])var3[3]))[2]), 0, ((byte[])((byte[])((Object[])((Object[])var3[3]))[2])).length);
                  ama.a((tha)(var38 != null?var38[1]:null), (byte)-128, (Object[])((Object[])var3[6]));
               }

               rw var9;
               rw var10;
               for(var38 = null == (var9 = (rw)gm.a((Object[])((Object[])var3[5]), 0))?null:var9.y; null != var38; var38 = (var10 = (rw)dka.a((Object[])((Object[])var3[5]), (byte)59)) == null?null:var10.y) {
                  ((int[])((int[])((Object[])((Object[])var3[3]))[1]))[0] = 0;
                  ek.putByte((Object[])((Object[])var3[3]), 0);
                  uk.put40BitInteger((Object[])((Object[])var3[3]), ((tha)(null == var38?null:var38[1])).m);
                  oua.writeBytesToOutputStreamWorker((Object[])((Object[])var3[10]), (byte[])((byte[])((Object[])((Object[])var3[3]))[2]), 0, ((byte[])((byte[])((Object[])((Object[])var3[3]))[2])).length);
                  ama.a((tha)(var38 == null?null:var38[1]), (byte)-95, (Object[])((Object[])var3[4]));
               }

               for(int var40 = 0; 100 > var40; ++var40) {
                  int var21 = va.b((Object[])((Object[])var3[10]), (byte)85);
                  if(0 > var21) {
                     throw new IOException();
                  }

                  if(0 == var21) {
                     break;
                  }

                  ((int[])((int[])var3[1]))[2] = 0;
                  byte var39 = 0;
                  if(var3[2] != null) {
                     if(((int[])((int[])((Object[])((Object[])var3[2]))[2]))[0] == 0) {
                        var39 = 1;
                     }
                  } else {
                     var39 = 10;
                  }

                  int var23;
                  int var25;
                  int var24;
                  if(0 < var39) {
                     var23 = var39 + -((int[])((int[])((Object[])((Object[])var3[9]))[1]))[0];
                     if(var23 > var21) {
                        var23 = var21;
                     }

                     at.readBytesFromInputStreamWorker((Object[])((Object[])var3[10]), (byte[])((byte[])((Object[])((Object[])var3[9]))[2]), ((int[])((int[])((Object[])((Object[])var3[9]))[1]))[0], var23);
                     if(-1 != ~((byte[])((byte[])var3[0]))[0]) {
                        if(null != var3 && var3.length == 1) {
                           ((byte[])((byte[])oo.d[19]))[10] = ((byte[])((byte[])dca.e[3]))[18];
                        }

                        for(var24 = 0; var24 < var23; ++var24) {
                           ((byte[])((byte[])((Object[])((Object[])var3[9]))[2]))[var24 + ((int[])((int[])((Object[])((Object[])var3[9]))[1]))[0]] ^= ((byte[])((byte[])var3[0]))[0];
                        }
                     }

                     ((int[])((int[])((Object[])((Object[])var3[9]))[1]))[0] += var23;
                     if(((int[])((int[])((Object[])((Object[])var3[9]))[1]))[0] >= var39) {
                        if(null != var3[2]) {
                           if(-1 != ~((int[])((int[])((Object[])((Object[])var3[2]))[2]))[0]) {
                              throw new IOException();
                           }

                           if(-1 == ((byte[])((byte[])((Object[])((Object[])var3[9]))[2]))[0]) {
                              ((int[])((int[])((Object[])((Object[])var3[9]))[1]))[0] = 0;
                              ((int[])((int[])((Object[])((Object[])var3[2]))[2]))[0] = 1;
                           } else {
                              var3[2] = null;
                           }
                        } else {
                           if(null != var3 && (-3 == ~var3.length && var3[0].equals(Boolean.valueOf(false)) || var3.length == 3)) {
                              tq.a(true, -20, (Object[][])null);
                           }

                           ((int[])((int[])((Object[])((Object[])var3[9]))[1]))[0] = 0;
                           var24 = fh.a((Object[])((Object[])var3[9]), false);
                           var25 = lr.a(1, (Object[])((Object[])var3[9]));
                           int var26 = fh.a((Object[])((Object[])var3[9]), false);
                           int var27 = lr.a(1, (Object[])((Object[])var3[9]));
                           int var28 = 127 & var26;
                           boolean var29 = -1 != ~(var26 & 128);
                           long var30 = (long)var25 + ((long)var24 << 32);
                           Object[] var32 = null;
                           if(!var29) {
                              rw var17;
                              rw var16;
                              for(var32 = (var16 = (rw)gm.a((Object[])((Object[])var3[6]), 0)) != null?var16.y:null; var32 != null && ~var30 != ~((tha)(null == var32?null:var32[1])).m; var32 = null != (var17 = (rw)dka.a((Object[])((Object[])var3[6]), (byte)93))?var17.y:null) {
                                 ;
                              }

                              if(null != var3 && -8 == ~var3.length) {
                                 qv.a(var1 ^ -26);
                              }
                           } else {
                              if(null != var3 && var3.length == 18) {
                                 jl.a(256);
                              }

                              rw var13;
                              rw var14;
                              for(var32 = (var13 = (rw)gm.a((Object[])((Object[])var3[4]), 0)) == null?null:var13.y; null != var32 && ~((tha)(var32 != null?var32[1]:null)).m != ~var30; var32 = (var14 = (rw)dka.a((Object[])((Object[])var3[4]), (byte)98)) == null?null:var14.y) {
                                 ;
                              }
                           }

                           if(var32 == null) {
                              throw new IOException();
                           }

                           int var33 = var28 == 0?5:9;
                           var3[2] = var32;
                           ((Object[])((Object[])var3[2]))[3] = hi.newByteBufferWrapper(((byte[])((byte[])((Object[])((Object[])var3[2]))[4]))[0] + var27 + var33);
                           ek.putByte((Object[])((Object[])((Object[])((Object[])var3[2]))[3]), var28);
                           op.putInt((Object[])((Object[])((Object[])((Object[])var3[2]))[3]), var27);
                           ((int[])((int[])((Object[])((Object[])var3[2]))[2]))[0] = 10;
                           ((int[])((int[])((Object[])((Object[])var3[9]))[1]))[0] = 0;
                        }
                     }
                  } else {
                     var23 = -((byte[])((byte[])((Object[])((Object[])var3[2]))[4]))[0] + ((byte[])((byte[])((Object[])((Object[])((Object[])((Object[])var3[2]))[3]))[2])).length;
                     var24 = -((int[])((int[])((Object[])((Object[])var3[2]))[2]))[0] + 512;
                     if(-((int[])((int[])((Object[])((Object[])((Object[])((Object[])var3[2]))[3]))[1]))[0] + var23 < var24) {
                        var24 = var23 - ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var3[2]))[3]))[1]))[0];
                     }

                     if(var24 > var21) {
                        var24 = var21;
                     }

                     at.readBytesFromInputStreamWorker((Object[])((Object[])var3[10]), (byte[])((byte[])((Object[])((Object[])((Object[])((Object[])var3[2]))[3]))[2]), ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var3[2]))[3]))[1]))[0], var24);
                     if(0 != ((byte[])((byte[])var3[0]))[0]) {
                        if(null != var3 && var3.length == 6 && var3[1].equals(Integer.valueOf(0))) {
                           cba.a = null;
                        }

                        for(var25 = 0; var25 < var24; ++var25) {
                           ((byte[])((byte[])((Object[])((Object[])((Object[])((Object[])var3[2]))[3]))[2]))[var25 + ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var3[2]))[3]))[1]))[0]] ^= ((byte[])((byte[])var3[0]))[0];
                        }
                     }

                     ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var3[2]))[3]))[1]))[0] += var24;
                     ((int[])((int[])((Object[])((Object[])var3[2]))[2]))[0] += var24;
                     if(null != var3 && var3.length == 1) {
                        lra.a(false, (byte)-70);
                     }

                     if(~var23 != ~((int[])((int[])((Object[])((Object[])((Object[])((Object[])var3[2]))[3]))[1]))[0]) {
                        if(512 == ((int[])((int[])((Object[])((Object[])var3[2]))[2]))[0]) {
                           ((int[])((int[])((Object[])((Object[])var3[2]))[2]))[0] = 0;
                        }
                     } else {
                        Object[] var19;
                        ((tha)((var19 = (Object[])((Object[])var3[2])) == null?null:var19[1])).a(8192);
                        ((boolean[])((boolean[])((Object[])((Object[])var3[2]))[0]))[0] = false;
                        var3[2] = null;
                     }
                  }
               }

               var4 = true;
               if(null != var3 && var3.length == 4) {
                  nh.d = null;
               }
            } catch (IOException var37) {
               try {
                  qi.a((Object[])((Object[])var3[10]), (int)4);
               } catch (Exception var35) {
                  ;
               }

               var3[10] = null;
               ++((int[])((int[])var3[1]))[0];
               ((int[])((int[])var3[1]))[1] = -2;
               if(nd.a(var3, (byte)-127) == 0 && 0 == cv.a(var3, false)) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }
         } else if(-1 == ~nd.a(var3, (byte)-127) && cv.a(var3, false) == 0) {
            var4 = true;
         } else {
            var4 = false;
         }

         if(var1 != -97) {
            a((Object[])((Object[])f_ob[7]));
         }

         if(!var4) {
            this.g((byte)58);
         }

      }
   }

   static final void d() {
      int var0 = ofa.b;
      int[] var1 = ot.a;
      int var2 = vr.b((Object[])((Object[])tu.d[29]), (byte)38);
      boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;

      int var4;
      Object[] var5;
      boolean var6;
      for(var4 = 0; var4 < var0; ++var4) {
         var5 = vo.E[var1[var4]];
         if(var5[42] != null) {
            var6 = true;
         } else {
            var6 = false;
         }

         if(!var6) {
            ((int[])((int[])var5[12]))[15] = -1;
         } else if(((boolean[])((boolean[])var5[8]))[15]) {
            ((int[])((int[])var5[12]))[15] = -1;
         } else {
            hr.a(var5, 21357);
            if(var5 != null && var5.length == 4 && var5[1].equals(Integer.valueOf(0)) && var5[1].equals(Integer.valueOf(1))) {
               se.a(-57, -114, -18191, -21, -12, (Object[])null, 124, 22, ((int[])((int[])be.c[29]))[7], (Object[])((Object[])rka.d[11]));
            }

            if(((short[])((short[])var5[13]))[1] >= 0 && ((short[])((short[])var5[13]))[3] >= 0 && ((short[])((short[])var5[13]))[0] < rp.c && ((short[])((short[])var5[13]))[2] < wpa.a) {
               ((boolean[])((boolean[])var5[8]))[13] = ((boolean[])((boolean[])var5[8]))[7]?var3:false;
               if(var5 == uta.g) {
                  ((int[])((int[])var5[12]))[15] = Integer.MAX_VALUE;
               } else {
                  int var7 = 0;
                  if(!((boolean[])((boolean[])var5[8]))[8]) {
                     ++var7;
                  }

                  if(((int[])((int[])var5[12]))[10] > kda.d) {
                     var7 += 2;
                  }

                  var7 += 5 - gn.a(var5, (byte)-118) << 2;
                  if(!((boolean[])((boolean[])var5[8]))[14] && !((boolean[])((boolean[])var5[8]))[10]) {
                     if(tqa.f == 0) {
                        var7 += 32;
                     } else {
                        var7 += 128;
                     }

                     var7 += 256;
                  } else {
                     var7 += 512;
                  }

                  ((int[])((int[])var5[12]))[15] = var7 + 1;
               }
            } else {
               ((int[])((int[])var5[12]))[15] = -1;
            }
         }
      }

      Object[] var12;
      for(var4 = 0; var4 < rba.h; ++var4) {
         var5 = ((hna)pm.a((long)gr.c[var4], hf.g, false)).k;
         if(Class_i.a((byte)76, var5)) {
            var12 = (Object[])((Object[])var5[42]);
            Object[] var8 = eo.g;
            if(null != var12[11]) {
               int var9 = -1;
               if(~((int[])((int[])var12[1]))[3] == 0) {
                  if(-1 != ((int[])((int[])var12[1]))[12]) {
                     var9 = cj.a(-113, ((int[])((int[])var12[1]))[12], var8);
                  }
               } else {
                  var9 = rg.a(1, ((int[])((int[])var12[1]))[3], var8);
               }

               if(0 <= var9 && ((int[])((int[])var12[11])).length - 1 > var9 && ((int[])((int[])var12[11]))[var9] != -1) {
                  var6 = true;
               } else {
                  int var10 = ((int[])((int[])var12[11]))[((int[])((int[])var12[11])).length - 1];
                  if(-1 != var10) {
                     var6 = true;
                  } else {
                     var6 = false;
                  }
               }
            } else {
               var6 = true;
            }

            if(var6) {
               if(var5 != null && var5.length == 16 && var5[4].equals(Integer.valueOf(0))) {
                  a((Object[])((Object[])lka.d[10]));
               }

               hr.a(var5, 21357);
               if(((short[])((short[])var5[13]))[1] >= 0 && ((short[])((short[])var5[13]))[3] >= 0 && ((short[])((short[])var5[13]))[0] < rp.c && ((short[])((short[])var5[13]))[2] < wpa.a) {
                  int var11 = 0;
                  if(!((boolean[])((boolean[])var5[8]))[8]) {
                     ++var11;
                  }

                  if(((int[])((int[])var5[12]))[10] > kda.d) {
                     var11 += 2;
                  }

                  var11 += 5 - dg.a(-120, var5) << 2;
                  if(tqa.f == 0) {
                     if(((boolean[])((boolean[])((Object[])((Object[])var5[42]))[8]))[2]) {
                        var11 += 64;
                     } else {
                        var11 += 128;
                     }
                  } else if(tqa.f == 1) {
                     if(((boolean[])((boolean[])((Object[])((Object[])var5[42]))[8]))[2]) {
                        var11 += 32;
                     } else {
                        var11 += 64;
                     }
                  }

                  if(((boolean[])((boolean[])((Object[])((Object[])var5[42]))[8]))[6]) {
                     var11 += 1024;
                  } else if(!((boolean[])((boolean[])((Object[])((Object[])var5[42]))[8]))[5]) {
                     var11 += 256;
                  }

                  ((int[])((int[])var5[12]))[15] = var11 + 1;
               } else {
                  ((int[])((int[])var5[12]))[15] = -1;
               }
               continue;
            }
         }

         ((int[])((int[])var5[12]))[15] = -1;
      }

      for(var4 = 0; var4 < gqa.b.length; ++var4) {
         var5 = gqa.b[var4];
         if(var5 != null) {
            if(((int[])((int[])var5[0]))[9] == 1) {
               hna var13 = (hna)pm.a((long)((int[])((int[])var5[0]))[5], hf.g, false);
               if(var13 != null) {
                  var12 = var13.k;
                  if(((int[])((int[])var12[12]))[15] >= 0) {
                     ((int[])((int[])var12[12]))[15] += 2048;
                  }
               }
            } else if(((int[])((int[])var5[0]))[9] == 10) {
               Object[] var14 = vo.E[((int[])((int[])var5[0]))[5]];
               if(var14 != null && var14 != uta.g && ((int[])((int[])var14[12]))[15] >= 0) {
                  ((int[])((int[])var14[12]))[15] += 2048;
               }
            }
         }
      }

   }

   static final void a(int var0, Object[] var1, lm var2) {
      if(var2.d != null) {
         var2.a((byte)123);
      }

      ++f_kb;
      var2.d = ((lm)var1[0]).d;
      int var3 = 100 % ((var0 - 43) / 63);
      var2.f = (lm)var1[0];
      var2.d.f = var2;
      var2.f.d = var2;
   }

   static final void b(byte var0, Object[] var1) throws Throwable {
      ++Z;
      if(var0 == -35) {
         if(null != var1 && var1.length == 8) {
            if(-1L != ~((long[])((long[])var1[4]))[2]) {
               IUnknown.Release(((long[])((long[])var1[4]))[2]);
               ((long[])((long[])var1[4]))[2] = 0L;
            }

            if(-1L != ~((long[])((long[])var1[4]))[0]) {
               IUnknown.Release(((long[])((long[])var1[4]))[0]);
               ((long[])((long[])var1[4]))[0] = 0L;
            }

            if(((long[])((long[])var1[4]))[1] != 0L) {
               IUnknown.Release(((long[])((long[])var1[4]))[1]);
               ((long[])((long[])var1[4]))[1] = 0L;
            }

            bk.a(var1, (Object[])((Object[])var1[3]), 5);
            ((ww)var1[0]).a(27142);
         } else {
            ((ww)var1[0]).a(27142);
         }
      }
   }

   final String a(byte var1) {
      ++Bb;
      String var2 = " ";

      try {
         var2 = var2 + rs.f + wu.o + qm.d + wu.o + rp.c + wu.o + wpa.a + " ";
         if(uta.g != null) {
            var2 = var2 + jca.n + wu.o + (rs.f + ((int[])((int[])uta.g[33]))[0]) + wu.o + (((int[])((int[])uta.g[14]))[0] + qm.d) + " ";
         } else {
            var2 = var2 + jca.n + wu.o + jca.n + wu.o + jca.n + wu.o + " ";
         }

         var2 = var2 + bg.a(true, (Object[])((Object[])tu.d[5])) + " " + kea.b(55, (Object[])((Object[])tu.d[16])) + " " + afa.b((byte)-85) + " " + wr.n + wu.o + nma.a + " ";
         var2 = var2 + oua.a((byte)-26, (Object[])((Object[])tu.d[6])) + " ";
         var2 = var2 + ft.a((Object[])((Object[])tu.d[13]), (int)-14072) + " ";
         var2 = var2 + pda.a(true, (Object[])((Object[])tu.d[25])) + " ";
         int var3 = 85 % ((var1 - 9) / 59);
         var2 = var2 + fpa.a((int)0, (Object[])((Object[])tu.d[24])) + " ";
         var2 = var2 + uha.a(false, (Object[])((Object[])tu.d[9])) + " ";
         var2 = var2 + qga.b((Object[])((Object[])tu.d[14]), 13687) + " ";
         var2 = var2 + Class_e.f + " ";
         var2 = var2 + ipa.d;
         if(mca.g == null) {
            var2 = var2 + -1;
         } else {
            var2 = var2 + ((int[])((int[])mca.g[1]))[5];
         }

         try {
            if(bg.a(true, (Object[])((Object[])tu.d[5])) == 2) {
               Class var4 = Class.forName("java.lang.ClassLoader");
               Field var5 = var4.getDeclaredField("nativeLibraries");
               Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
               Method var7 = var6.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
               var7.invoke(var5, new Object[]{Boolean.TRUE});
               Vector var8 = (Vector)var5.get(client.class.getClassLoader());

               for(int var9 = 0; var8.size() > var9; ++var9) {
                  try {
                     Object var10 = var8.elementAt(var9);
                     Field var11 = var10.getClass().getDeclaredField("name");
                     var7.invoke(var11, new Object[]{Boolean.TRUE});

                     try {
                        String var12 = (String)var11.get(var10);
                        if(var12 != null && -1 != var12.indexOf("sw3d.dll")) {
                           Field var13 = var10.getClass().getDeclaredField("handle");
                           var7.invoke(var13, new Object[]{Boolean.TRUE});
                           var2 = var2 + " " + Long.toHexString(var13.getLong(var10));
                           var7.invoke(var13, new Object[]{Boolean.FALSE});
                        }
                     } catch (Throwable var15) {
                        ;
                     }

                     var7.invoke(var11, new Object[]{Boolean.FALSE});
                  } catch (Throwable var16) {
                     ;
                  }
               }
            }
         } catch (Throwable var17) {
            ;
         }
      } catch (Throwable var18) {
         ;
      }

      return var2;
   }

   static final Object[] b(Object[] var0) {
      int var1 = soa.a(c(var0), false);
      if(var1 == 0) {
         return null;
      } else {
         for(int var2 = 0; var2 < var1; ++var2) {
            var0 = hg.a(((int[])((int[])var0[1]))[39], (byte)-99);
            if(var0 == null) {
               return null;
            }
         }

         if(var0 != null && var0.length == 6) {
            mga.a(0, true);
         }

         return var0;
      }
   }

   private final void g(byte var1) {
      ++f_pb;
      if(((int[])((int[])dka.g[1]))[0] > Class_p.a) {
         fd.a(ma.q, true);
         pj.b = (-50 + 50 * ((int[])((int[])dka.g[1]))[0]) * 5;
         if(pj.b > 3000) {
            pj.b = 3000;
         }

         if(((int[])((int[])dka.g[1]))[0] >= 2 && -7 == ~((int[])((int[])dka.g[1]))[1]) {
            this.a("js5connect_outofdate", (byte)67);
            ipa.d = 11;
            return;
         }

         if(((int[])((int[])dka.g[1]))[0] >= 4 && ((int[])((int[])dka.g[1]))[1] == -1) {
            this.a("js5crc", (byte)67);
            ipa.d = 11;
            return;
         }

         if(((int[])((int[])dka.g[1]))[0] >= 4 && fc.b(ipa.d, -3)) {
            if(((int[])((int[])dka.g[1]))[1] != 7 && ((int[])((int[])dka.g[1]))[1] != 9) {
               if(0 < ((int[])((int[])dka.g[1]))[1]) {
                  if(null != bba.d) {
                     this.a("js5proxy_" + bba.d.trim(), (byte)67);
                  } else {
                     this.a("js5connect", (byte)67);
                  }
               } else {
                  this.a("js5io", (byte)67);
               }
            } else {
               this.a("js5connect_full", (byte)67);
            }

            ipa.d = 11;
            return;
         }
      }

      Class_p.a = ((int[])((int[])dka.g[1]))[0];
      if(pj.b > 0) {
         --pj.b;
      } else {
         try {
            int var3 = 59 / ((-29 - var1) / 49);
            if(0 == no.k) {
               vga.d = sf.createSocket(ma.q);
               ++no.k;
            }

            if(no.k == 1) {
               dna.a = cq.createSocketWorker(vga.d, 25000);
               Object[] var4 = hi.newByteBufferWrapper(9);
               ek.putByte(var4, ((int[])((int[])dfa.UPDATESERVERPACKET[0]))[0]);
               op.putInt(var4, 670);
               op.putInt(var4, 1);
               oua.writeBytesToOutputStreamWorker(dna.a, (byte[])((byte[]) var4[2]), 0, 9);
               ++no.k;
               ab.c = he.a(-113);
            }

            int var5;
            if(no.k == 2) {
               if(!ke.a(dna.a, -95, 1)) {
                  if(he.a(109) + -ab.c > 30000L) {
                     this.a((byte)117, 1001);
                     return;
                  }
               } else {
                  byte[] response = new byte[1];
                  var5 = at.readBytesFromInputStreamWorker(dna.a, response, 0, 1);
                  if(0 != response[0]) {
                     this.a((byte)125, var5);
                     return;
                  }
                  ++no.k;
               }
            }
            if(no.k == 3) {
               Object[][] var14 = pp.a(125);
               var5 = var14.length * 4;
               if(ke.a(dna.a, -52, var5)) {
                  Object[] var6 = hi.newByteBufferWrapper(var5);
                  at.readBytesFromInputStreamWorker(dna.a, (byte[])((byte[])var6[2]), 0, ((byte[])((byte[])var6[2])).length);

                  for(int var7 = 0; var14.length > var7; ++var7) {
                     pp.a(-82, lr.a(1, var6), var14[var7]);
                  }

                  boolean var15 = fc.b(ipa.d, -3) || sd.a((int)12, ipa.d) || jpa.a(ipa.d, -128);
                  Object[] var8 = dka.g;
                  Object[] var2 = dna.a;
                  Object var9 = null == dna.a?null:var2[0];
                  boolean var10 = !var15;
                  if(var8 == null) {
                     throw new IllegalStateException();
                  }

                  lv.a(var10, true, var9, var8);
                  if(var8 != null && -8 == ~var8.length) {
                     cla.f = ((int[])((int[])dh.e[11]))[1];
                  }

                  dna.a = null;
                  no.k = 0;
                  vga.d = null;
               }
            }
         } catch (IOException var12) {
            this.a((byte)110, 1002);
         }

      }
   }

   static final void a(Object[] var0, Object[][] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var0 != null && var0.length == 2) {
         oc.a(-7850, 5);
      }

      label1819:
      for(int var48 = 0; var48 < var1.length; ++var48) {
         Object[] var49 = var1[var48];
         if(var49 != null && ((int[])((int[])var49[1]))[39] == var2) {
            int var50 = ((int[])((int[])var49[1]))[20] + var7;
            int var51 = ((int[])((int[])var49[1]))[27] + var8;
            int var55;
            int var54;
            int var53;
            int var52;
            if(((int[])((int[])var49[1]))[18] == 2) {
               var52 = var3;
               var53 = var4;
               var54 = var5;
               var55 = var6;
            } else {
               int var56 = var50 + ((int[])((int[])var49[1]))[70];
               int var57 = var51 + ((int[])((int[])var49[1]))[2];
               if(((int[])((int[])var49[1]))[18] == 9) {
                  ++var56;
                  ++var57;
               }

               var52 = var50 > var3?var50:var3;
               var53 = var51 > var4?var51:var4;
               var54 = var56 < var5?var56:var5;
               var55 = var57 < var6?var57:var6;
            }

            if(((int[])((int[])var49[1]))[18] != 0 && !((boolean[])((boolean[])var49[5]))[17] && ((int[])((int[])c(var49)[1]))[0] == 0 && var49 != gn.k && ((int[])((int[])var49[1]))[30] != ru.c && ((int[])((int[])var49[1]))[30] != wqa.a && ((int[])((int[])var49[1]))[30] != Class_d.c && ((int[])((int[])var49[1]))[30] != oqa.e) {
               if(var52 < var54 && var53 < var55) {
                  ij.b(127, var49);
               }
            } else if(!a(var49)) {
               if(var49 == dca.e && vt.a((int)88, dca.e) != null) {
                  ql.e = true;
                  wm.a = var50;
                  ko.c = var51;
               }

               if(((boolean[])((boolean[])var49[5]))[4] || var52 < var54 && var53 < var55) {
                  if(((boolean[])((boolean[])var49[5]))[9] && var9 >= var52 && var10 >= var53 && var9 < var54 && var10 < var55) {
                     bs var11;
                     bs var12;
                     for(Object[] var95 = (var11 = (bs)dda.a(it.b, 2)) == null?null:var11.o; var95 != null; var95 = (var12 = (bs)a(it.b, -28280)) == null?null:var12.o) {
                        if(((boolean[])((boolean[])var95[6]))[0]) {
                           ((lm)(var95 == null?null:var95[2])).a((byte)63);
                           ((boolean[])((boolean[])((Object[])((Object[])var95[0]))[5]))[10] = false;
                        }
                     }

                     if(jr.e == 0) {
                        dca.e = null;
                        gn.k = null;
                     }

                     pja.g = 0;
                     ui.c = false;
                     noa.e = false;
                     if(!kea.c) {
                        ll.a((byte)-127);
                     }
                  }

                  boolean var94 = ((boolean[])((boolean[])var49[5]))[3] && ((int[])((int[])var49[1]))[18] == 5 && ((int[])((int[])var49[1]))[1] == 0 && ((int[])((int[])var49[1]))[29] < 0 && ((int[])((int[])var49[1]))[13] == -1 && ((int[])((int[])var49[1]))[46] == -1 && !((boolean[])((boolean[])var49[5]))[15] && ((int[])((int[])var49[1]))[31] == 0;
                  boolean var93 = false;
                  int var61;
                  if(Class_b.j.d(104) >= var52 && Class_b.j.e(18677) >= var53 && Class_b.j.d(104) < var54 && Class_b.j.e(18677) < var55) {
                     if(var94) {
                        Object[] var58 = coa.a(lna.g, var49, (byte)-100);
                        if(var58 != null && ((int[])((int[])var58[1]))[0] == ((int[])((int[])var49[1]))[70] && ((int[])((int[])var58[1]))[2] == ((int[])((int[])var49[1]))[2]) {
                           int var59 = Class_b.j.d(104) - var50;
                           int var60 = Class_b.j.e(18677) - var51;
                           if(var60 >= 0 && var60 < ((int[])((int[])var58[3])).length) {
                              var61 = ((int[])((int[])var58[3]))[var60];
                              if(var59 >= var61 && var59 <= var61 + ((int[])((int[])var58[0]))[var60]) {
                                 var93 = true;
                              }
                           }
                        } else {
                           var93 = true;
                        }
                     } else {
                        var93 = true;
                     }
                  }

                  if(!ra.h && var93) {
                     if(((int[])((int[])var49[1]))[63] >= 0) {
                        jf.c = ((int[])((int[])var49[1]))[63];
                     } else if(((boolean[])((boolean[])var49[5]))[9]) {
                        jf.c = -1;
                     }
                  }

                  if(!kea.c && var93 && !((boolean[])((boolean[])var0[0]))[0]) {
                     ha.a(749712384, var9 - var50, var49, var10 - var51);
                  }

                  boolean var100 = false;
                  if(Class_b.j.b((int)104) && var93) {
                     var100 = true;
                  }

                  boolean var99 = false;
                  bc var14;
                  Object[] var101 = (var14 = (bc)dda.a(cua.c, 2)) == null?null:var14.m;
                  int var63;
                  int var62;
                  int var64;
                  Object[] var97;
                  if(var101 != null && uta.a((byte)13, var101) == 0 && hla.b(var101, 1) >= var52 && jk.a(var101, 0) >= var53 && hla.b(var101, 1) < var54 && jk.a(var101, 0) < var55) {
                     if(var94) {
                        var97 = coa.a(lna.g, var49, (byte)-100);
                        if(var97 != null && ((int[])((int[])var97[1]))[0] == ((int[])((int[])var49[1]))[70] && ((int[])((int[])var97[1]))[2] == ((int[])((int[])var49[1]))[2]) {
                           var62 = hla.b(var101, 1) - var50;
                           var63 = jk.a(var101, 0) - var51;
                           if(var63 >= 0 && var63 < ((int[])((int[])var97[3])).length) {
                              var64 = ((int[])((int[])var97[3]))[var63];
                              if(var62 >= var64 && var62 <= var64 + ((int[])((int[])var97[0]))[var63]) {
                                 var99 = true;
                              }
                           }
                        } else {
                           var99 = true;
                        }
                     } else {
                        var99 = true;
                     }
                  }

                  boolean var96;
                  Object[] var113;
                  if(var49[25] != null) {
                     var96 = et.b;
                     if(!var96) {
                        for(var62 = 0; var62 < ((byte[])((byte[])var49[25])).length; ++var62) {
                           if(!oc.a(lja.a, ((byte[])((byte[])var49[25]))[var62], (byte)-104)) {
                              if(var49[8] != null) {
                                 ((int[])((int[])var49[8]))[var62] = 0;
                              }
                           } else if(var49[8] == null || kda.d >= ((int[])((int[])var49[8]))[var62]) {
                              byte var98 = ((byte[])((byte[])var49[34]))[var62];
                              if(var98 == 0 || ((var98 & 8) == 0 || !oc.a(lja.a, 86, (byte)-50) && !oc.a(lja.a, 82, (byte)-46) && !oc.a(lja.a, 81, (byte)-73)) && ((var98 & 2) == 0 || oc.a(lja.a, 86, (byte)-72)) && ((var98 & 1) == 0 || oc.a(lja.a, 82, (byte)-42)) && ((var98 & 4) == 0 || oc.a(lja.a, 81, (byte)-69))) {
                                 if(var62 < 10) {
                                    wba.a(var62 + 1, "", ((int[])((int[])var49[1]))[47], 7, ((int[])((int[])var49[1]))[3]);
                                 } else if(var62 == 10) {
                                    rba.a((byte)83);
                                    var113 = c(var49);
                                    ksa.a(var49, ct.a(var113, 2), ((int[])((int[])var113[1]))[1], (byte)-33);
                                    qp.b = si.c(var49, -110);
                                    if(qp.b == null) {
                                       qp.b = "Null";
                                    }

                                    kca.b = (String)var49[15] + el.a(16777215, 0);
                                 }

                                 var64 = ((int[])((int[])var49[0]))[var62];
                                 if(var49[8] == null) {
                                    var49[8] = new int[((byte[])((byte[])var49[25])).length];
                                 }

                                 if(var64 != 0) {
                                    ((int[])((int[])var49[8]))[var62] = kda.d + var64;
                                 } else {
                                    ((int[])((int[])var49[8]))[var62] = Integer.MAX_VALUE;
                                 }
                              }
                           }
                        }

                        if(var49 != null && var49.length == 4) {
                           haa.a(15);
                        }
                     }
                  }

                  if(var99) {
                     lca.a(hla.b(var101, 1) - var50, 17398, jk.a(var101, 0) - var51, var49);
                  }

                  if(dca.e != null && dca.e != var49 && var93 && ib.a((byte)88, c(var49))) {
                     wsa.g = var49;
                  }

                  if(var49 == gn.k) {
                     tj.j = true;
                     nf.d = var50;
                     esa.d = var51;
                  }

                  if(((boolean[])((boolean[])var49[5]))[17] || ((int[])((int[])var49[1]))[30] != 0) {
                     if(var93 && cea.f != 0 && var49[54] != null) {
                        var97 = nga.b(new Object[7], (byte)87);
                        ((boolean[])((boolean[])var97[6]))[0] = true;
                        var97[0] = var49;
                        ((int[])((int[])var97[1]))[5] = cea.f;
                        var97[3] = var49[54];
                        a(-64, it.b, (lm)(var97 == null?null:var97[2]));
                     }

                     if(dca.e != null) {
                        var99 = false;
                        var100 = false;
                     } else if(kea.c || ((int[])((int[])var49[1]))[30] != jsa.e && pja.g > 0) {
                        var99 = false;
                        var100 = false;
                        var93 = false;
                     }

                     Object[] var112;
                     if(((int[])((int[])var49[1]))[30] != 0) {
                        int var70;
                        int var71;
                        Object[] var117;
                        if(((int[])((int[])var49[1]))[30] == Class_d.c || ((int[])((int[])var49[1]))[30] == oqa.e) {
                           mi.g = var49;
                           if(lu.b != null) {
                              ala.a(lna.g, lu.b, ((int[])((int[])var49[1]))[2], fg.a((byte)93, (Object[])((Object[])tu.d[1])), (byte)-14);
                           }

                           if(((int[])((int[])var49[1]))[30] == Class_d.c && !kea.c && var9 >= var52 && var10 >= var53 && var9 < var54 && var10 < var55) {
                              ta var125 = lna.g;
                              if(var9 >= 0 && var10 >= 0 && null != uda.s) {
                                 Object[] var104 = var125.v();
                                 var125.a(uda.s);
                                 var125.d(qja.s);
                                 var125.JA(wr.o, hpa.c, wr.o + di.c, au.b + hpa.c);
                                 if(null != var49 && (var49.length == 1 || var49.length == 6)) {
                                    eq.f_l[0] = null;
                                 }

                                 var125.a(wr.o, hpa.c, di.c, au.b);
                                 aqa.a(true, qja.s, var104);
                                 vta.a(uda.s, var104, 124);
                                 ah.a(var104, (byte)20);
                                 int var84;
                                 int var83;
                                 int var139;
                                 Object[] var131;
                                 if(bf.f_l != null && (!ra.h || (64 & kd.c) != 0)) {
                                    var70 = -1;
                                    var71 = -1;
                                    if(var104 != null && var104.length == 24 && var104[2].equals(Boolean.valueOf(false)) && var104[2].equals(Boolean.valueOf(false))) {
                                       tua.a((Object[])null, false, (byte)109, (Object[][])null);
                                    }

                                    float var78 = (float)var9 * 2.0F / (float)di.c - 1.0F;
                                    float var79 = -1.0F + (float)var10 * 2.0F / (float)au.b;
                                    jn.a(var78, var79, eja.g, var104, true, -1.0F);
                                    float var114 = eja.g[1] / eja.g[3];
                                    float var118 = eja.g[0] / eja.g[3];
                                    float var74 = eja.g[2] / eja.g[3];
                                    jn.a(var78, var79, eja.g, var104, true, 1.0F);
                                    float var77 = eja.g[2] / eja.g[3];
                                    float var76 = eja.g[1] / eja.g[3];
                                    float var75 = eja.g[0] / eja.g[3];
                                    float var80 = kka.a(var118, var76, var75, var114, var74, -1, 4, var77);
                                    if(var80 > 0.0F) {
                                       float var81 = var75 - var118;
                                       float var82 = -var74 + var77;
                                       var83 = (int)(var118 + var81 * var80);
                                       var84 = (int)(var74 + var82 * var80);
                                       var70 = var83 + (-1 + gn.a(uta.g, (byte)84) << 8) >> 9;
                                       var71 = (gn.a(uta.g, (byte)-127) - 1 << 8) + var84 >> 9;
                                       byte var85 = ((byte[])((byte[])uta.g[10]))[0];
                                       if(var85 < 3 && -1 != ~(2 & pd.b[1][var83 >> 9][var84 >> 9])) {
                                          var139 = var85 + 1;
                                       }
                                    }

                                    if(-1 != var70 && -1 != var71) {
                                       if(ra.h && 0 != (64 & kd.c)) {
                                          var131 = nja.a(ft.f_i, 1, rw.A);
                                          if(var131 == null) {
                                             rba.a((byte)102);
                                          } else {
                                             oja.a(var71, " " + iv.a + " ", (long)(var70 << 0 | var71), false, aj.a, true, var70, true, qp.b, -1, (byte)-91, 58, 0L);
                                          }
                                       } else {
                                          if(bra.b) {
                                             oja.a(var71, "", (long)(var70 << 0 | var71), false, -1, true, var70, true, gj.a(dp.y, 72, gj.S), -1, (byte)-27, 11, 0L);
                                          }

                                          oja.a(var71, "", (long)(var71 | var70 << 0), false, dw.c, true, var70, true, vw.f_i, -1, (byte)-116, 10, 0L);
                                          ++ge.a;
                                       }
                                    }
                                 }

                                 for(var70 = 0; (mka.e?2:1) > var70; ++var70) {
                                    boolean var115 = 0 == var70;
                                    var117 = !var115?vqa.n:gu.b;
                                    int var116 = var9;
                                    int var127 = var10;
                                    Object[] var126 = (Object[])((Object[])var117[0]);

                                    uq var103;
                                    uq var107;
                                    for(Object[] var124 = null != (var107 = (uq)om.a(var126, false))?var107.f_l:null; null != var124; var124 = (var103 = (uq)pw.a(var126, 108)) != null?var103.f_l:null) {
                                       if(var0 != null && (2 == var0.length && var0[0].equals(Integer.valueOf(0)) || -8 == ~var0.length)) {
                                          ksa.a((Object[])null, 85, 65, (byte)-33);
                                       }

                                       if((dba.c || ((byte[])((byte[])((Object[])((Object[])var124[2]))[10]))[0] == ((byte[])((byte[])uta.g[10]))[0]) && Class_b.a(var125, (byte)109, var116, var127, var124)) {
                                          boolean var123 = false;
                                          boolean var121 = false;
                                          Object[] var119;
                                          int var122;
                                          int var120;
                                          Object[] var132;
                                          if(null != (var119 = (Object[])((Object[])var124[2])) && (-17 == ~var119.length && 3 == ((byte[])((byte[])var119[10])).length || var119.length >= 24 || 17 == var119.length || 20 == var119.length && ((byte[])((byte[])var119[10])).length == 3)) {
                                             var120 = ((short[])((short[])((Object[])((Object[])var124[2]))[13]))[3];
                                             var122 = ((short[])((short[])((Object[])((Object[])var124[2]))[13]))[1];
                                          } else {
                                             var132 = (Object[])((Object[])woa.a(5, (Object[])((Object[])var124[2]))[1]);
                                             var122 = (int)((float[])((float[])var132[1]))[2] >> 9;
                                             var120 = (int)((float[])((float[])var132[1]))[1] >> 9;
                                          }

                                          hna var87;
                                          int var86;
                                          int var92;
                                          Object[] var89;
                                          Object[] var88;
                                          int var91;
                                          int var90;
                                          int[] var140;
                                          int var143;
                                          Object[] var128;
                                          Object[] var135;
                                          if((var132 = (Object[])((Object[])var124[2])) != null && -44 == ~var132.length && -10 == ~((byte[])((byte[])var132[10])).length) {
                                             var131 = (Object[])((Object[])var124[2]);
                                             int var129 = gn.a(var131, (byte)-123);
                                             var128 = (Object[])((Object[])woa.a(5, var131)[1]);
                                             if(-1 == ~(var129 & 1) && (511 & (int)((float[])((float[])var128[1]))[2]) == 0 && -1 == ~((int)((float[])((float[])var128[1]))[1] & 511) || 1 == (1 & var129) && -257 == ~(511 & (int)((float[])((float[])var128[1]))[2]) && ((int)((float[])((float[])var128[1]))[1] & 511) == 256) {
                                                var84 = (int)((float[])((float[])var128[1]))[2] - (-1 + gn.a(var131, (byte)-100) << 8);
                                                var139 = (int)((float[])((float[])var128[1]))[1] + -(gn.a(var131, (byte)41) - 1 << 8);

                                                for(var86 = 0; rba.h > var86; ++var86) {
                                                   var87 = (hna)pm.a((long)gr.c[var86], hf.g, false);
                                                   if(var87 != null) {
                                                      var88 = var87.k;
                                                      if(kda.d != ((int[])((int[])var88[12]))[8] && ((boolean[])((boolean[])var88[8]))[8]) {
                                                         var89 = (Object[])((Object[])woa.a(5, var88)[1]);
                                                         var90 = -(-1 + ((int[])((int[])((Object[])((Object[])var88[42]))[1]))[18] << 8) + (int)((float[])((float[])var89[1]))[2];
                                                         var91 = (int)((float[])((float[])var89[1]))[1] - (((int[])((int[])((Object[])((Object[])var88[42]))[1]))[18] - 1 << 8);
                                                         if(var90 >= var84 && ((int[])((int[])((Object[])((Object[])var88[42]))[1]))[18] <= -(-var84 + var90 >> 9) + gn.a(var131, (byte)-117) && var139 <= var91 && ((int[])((int[])((Object[])((Object[])var88[42]))[1]))[18] <= -(-var139 + var91 >> 9) + gn.a(var131, (byte)118)) {
                                                            lj.a(113, ~((byte[])((byte[])uta.g[10]))[0] != ~((byte[])((byte[])((Object[])((Object[])var124[2]))[10]))[0], var88);
                                                            ((int[])((int[])var88[12]))[8] = kda.d;
                                                         }
                                                      }
                                                   }
                                                }

                                                var86 = ofa.b;
                                                var140 = ot.a;

                                                for(var143 = 0; var86 > var143; ++var143) {
                                                   var89 = vo.E[var140[var143]];
                                                   if(var89 != null && kda.d != ((int[])((int[])var89[12]))[8] && var89 != var131 && ((boolean[])((boolean[])var89[8]))[8]) {
                                                      var135 = (Object[])((Object[])woa.a(5, var89)[1]);
                                                      var91 = (int)((float[])((float[])var135[1]))[2] - (gn.a(var89, (byte)-128) - 1 << 8);
                                                      var92 = (int)((float[])((float[])var135[1]))[1] + -(gn.a(var89, (byte)-128) - 1 << 8);
                                                      if(var84 <= var91 && ~gn.a(var89, (byte)36) >= ~(-(var91 + -var84 >> 9) + gn.a(var131, (byte)19)) && var139 <= var92 && ~gn.a(var89, (byte)-118) >= ~(-(-var139 + var92 >> 9) + gn.a(var131, (byte)30))) {
                                                         uma.a(var89, ((byte[])((byte[])((Object[])((Object[])var124[2]))[10]))[0] != ((byte[])((byte[])uta.g[10]))[0], (byte)-110);
                                                         ((int[])((int[])var89[12]))[8] = kda.d;
                                                      }
                                                   }
                                                }
                                             }

                                             if(((int[])((int[])var131[12]))[8] == kda.d) {
                                                continue;
                                             }

                                             uma.a(var131, ~((byte[])((byte[])uta.g[10]))[0] != ~((byte[])((byte[])((Object[])((Object[])var124[2]))[10]))[0], (byte)-110);
                                             ((int[])((int[])var131[12]))[8] = kda.d;
                                          }

                                          Object[] var130;
                                          if(null != (var131 = (Object[])((Object[])var124[2])) && var131.length == 43 && ((boolean[])((boolean[])var131[8])).length == 10) {
                                             var130 = (Object[])((Object[])var124[2]);
                                             if(null != var130[42]) {
                                                var128 = (Object[])((Object[])woa.a(5, var130)[1]);
                                                if(0 == (((int[])((int[])((Object[])((Object[])var130[42]))[1]))[18] & 1) && -1 == ~((int)((float[])((float[])var128[1]))[2] & 511) && ((int)((float[])((float[])var128[1]))[1] & 511) == 0 || (((int[])((int[])((Object[])((Object[])var130[42]))[1]))[18] & 1) == 1 && -257 == ~(511 & (int)((float[])((float[])var128[1]))[2]) && ((int)((float[])((float[])var128[1]))[1] & 511) == 256) {
                                                   var84 = -(-1 + ((int[])((int[])((Object[])((Object[])var130[42]))[1]))[18] << 8) + (int)((float[])((float[])var128[1]))[2];
                                                   var139 = (int)((float[])((float[])var128[1]))[1] - (((int[])((int[])((Object[])((Object[])var130[42]))[1]))[18] - 1 << 8);

                                                   for(var86 = 0; rba.h > var86; ++var86) {
                                                      var87 = (hna)pm.a((long)gr.c[var86], hf.g, false);
                                                      if(var87 != null) {
                                                         var88 = var87.k;
                                                         if(kda.d != ((int[])((int[])var88[12]))[8] && var88 != var130 && ((boolean[])((boolean[])var88[8]))[8]) {
                                                            var89 = (Object[])((Object[])woa.a(5, var88)[1]);
                                                            var90 = (int)((float[])((float[])var89[1]))[2] - (((int[])((int[])((Object[])((Object[])var88[42]))[1]))[18] - 1 << 8);
                                                            var91 = (int)((float[])((float[])var89[1]))[1] + -(-1 + ((int[])((int[])((Object[])((Object[])var88[42]))[1]))[18] << 8);
                                                            if(var84 <= var90 && ((int[])((int[])((Object[])((Object[])var88[42]))[1]))[18] <= ((int[])((int[])((Object[])((Object[])var130[42]))[1]))[18] - (-var84 + var90 >> 9) && var139 <= var91 && ~(-(var91 - var139 >> 9) + ((int[])((int[])((Object[])((Object[])var130[42]))[1]))[18]) <= ~((int[])((int[])((Object[])((Object[])var88[42]))[1]))[18]) {
                                                               lj.a(-122, ((byte[])((byte[])uta.g[10]))[0] != ((byte[])((byte[])((Object[])((Object[])var124[2]))[10]))[0], var88);
                                                               ((int[])((int[])var88[12]))[8] = kda.d;
                                                            }
                                                         }
                                                      }
                                                   }

                                                   var86 = ofa.b;
                                                   var140 = ot.a;

                                                   for(var143 = 0; var86 > var143; ++var143) {
                                                      var89 = vo.E[var140[var143]];
                                                      if(var89 != null && kda.d != ((int[])((int[])var89[12]))[8] && ((boolean[])((boolean[])var89[8]))[8]) {
                                                         var135 = (Object[])((Object[])woa.a(5, var89)[1]);
                                                         var91 = (int)((float[])((float[])var135[1]))[2] - (gn.a(var89, (byte)41) - 1 << 8);
                                                         var92 = (int)((float[])((float[])var135[1]))[1] + -(gn.a(var89, (byte)46) - 1 << 8);
                                                         if(var91 >= var84 && gn.a(var89, (byte)-109) <= ((int[])((int[])((Object[])((Object[])var130[42]))[1]))[18] + -(-var84 + var91 >> 9) && var139 <= var92 && gn.a(var89, (byte)66) <= ((int[])((int[])((Object[])((Object[])var130[42]))[1]))[18] - (-var139 + var92 >> 9)) {
                                                            uma.a(var89, ((byte[])((byte[])((Object[])((Object[])var124[2]))[10]))[0] != ((byte[])((byte[])uta.g[10]))[0], (byte)-110);
                                                            ((int[])((int[])var89[12]))[8] = kda.d;
                                                         }
                                                      }
                                                   }

                                                   if(null != var130 && -4 == ~var130.length) {
                                                      aka.a(31399);
                                                   }
                                                }

                                                if(((int[])((int[])var130[12]))[8] == kda.d) {
                                                   continue;
                                                }

                                                lj.a(-58, ~((byte[])((byte[])((Object[])((Object[])var124[2]))[10]))[0] != ~((byte[])((byte[])uta.g[10]))[0], var130);
                                                ((int[])((int[])var130[12]))[8] = kda.d;
                                             }
                                          }

                                          Object[] var141;
                                          if((var130 = (Object[])((Object[])var124[2])) != null && var130.length == 16 && ((int[])((int[])var130[12])).length == 11) {
                                             var83 = rs.f + var122;
                                             var84 = var120 + qm.d;
                                             oga var102;
                                             var141 = (var102 = (oga)pm.a((long)(var84 << 14 | ((byte[])((byte[])((Object[])((Object[])var124[2]))[10]))[0] << 28 | var83), vg.e, false)) != null?var102.k:null;
                                             if(var141 != null) {
                                                var86 = 0;

                                                gn var106;
                                                for(Object[] var142 = (var106 = (gn)od.a(2, (Object[])((Object[])var141[0]))) != null?var106.j:null; var142 != null; ++var86) {
                                                   var88 = us.a(((int[])((int[])var142[1]))[1], (byte)48, cqa.a);
                                                   if(ra.h && ((byte[])((byte[])uta.g[10]))[0] == ((byte[])((byte[])((Object[])((Object[])var124[2]))[10]))[0]) {
                                                      var89 = -1 != ck.e?jd.a(ck.e, (byte)-121, bm.c):null;
                                                      if((1 & kd.c) != 0 && (null == var89 || jfa.a(false, ck.e, var88, ((int[])((int[])var89[1]))[0]) != ((int[])((int[])var89[1]))[0])) {
                                                         oja.a(var120, kca.b + " " + iv.a + " " + el.a(16748608, 0) + (String)var88[12], (long)var86, false, aj.a, false, var122, true, qp.b, -1, (byte)-48, 30, (long)((int[])((int[])var142[1]))[1]);
                                                         ++lqa.a;
                                                      }
                                                   }

                                                   if(((byte[])((byte[])uta.g[10]))[0] == ((byte[])((byte[])((Object[])((Object[])var124[2]))[10]))[0]) {
                                                      if(null != var101 && var101.length == 6) {
                                                         tra.e = 33;
                                                      }

                                                      String[] var134 = (String[])((String[])var88[8]);

                                                      for(var90 = -1 + var134.length; var90 >= 0; --var90) {
                                                         if(null != var134[var90]) {
                                                            short var137 = 0;
                                                            if(0 == var90) {
                                                               var137 = 18;
                                                            }

                                                            var92 = fha.t;
                                                            if(var90 == 1) {
                                                               var137 = 21;
                                                            }

                                                            if(2 == var90) {
                                                               var137 = 59;
                                                            }

                                                            if(var90 == 3) {
                                                               var137 = 16;
                                                            }

                                                            if(var90 == 4) {
                                                               var137 = 47;
                                                            }

                                                            if(5 == var90) {
                                                               var137 = 1008;
                                                            }

                                                            if(((int[])((int[])var88[1]))[0] == var90) {
                                                               var92 = ((int[])((int[])var88[1]))[44];
                                                            }

                                                            if(var101 != null && (var101.length == 6 || var101.length == 15)) {
                                                               jma.k = -19;
                                                            }

                                                            if(~var90 == ~((int[])((int[])var88[1]))[40]) {
                                                               var92 = ((int[])((int[])var88[1]))[9];
                                                            }

                                                            ++ena.f;
                                                            oja.a(var120, el.a(16748608, 0) + (String)var88[12], (long)var86, false, var92, false, var122, true, var134[var90], -1, (byte)98, var137, (long)((int[])((int[])var142[1]))[1]);
                                                         }
                                                      }
                                                   }

                                                   gn var110;
                                                   var142 = (var110 = (gn)hga.b((Object[])((Object[])var141[0]), 14570)) == null?null:var110.j;
                                                }

                                                if(var0 != null && var0.length == 1) {
                                                   hna.a((String)null, 15);
                                                }
                                             }
                                          }

                                          if(null != (var128 = (Object[])((Object[])var124[2])) && (var128.length != 16 || -3 != ~((byte[])((byte[])var128[10])).length) && (20 != var128.length || ((int[])((int[])var128[12])).length != 7) && var128.length < 24) {
                                             Object[] var138 = (Object[])((Object[])var124[2]);
                                             var141 = mca.a(true, uaa.a(var138, 114), lja.d);
                                             if(var141[11] != null) {
                                                var141 = vs.a(eo.g, var141, (byte)-72);
                                             }

                                             if(var141 != null) {
                                                if(ra.h && ((byte[])((byte[])uta.g[10]))[0] == ((byte[])((byte[])((Object[])((Object[])var124[2]))[10]))[0]) {
                                                   Object[] var144 = -1 != ck.e?jd.a(ck.e, (byte)-126, bm.c):null;
                                                   if((4 & kd.c) != 0 && (null == var144 || kda.a(ck.e, 12, ((int[])((int[])var144[1]))[0], var141) != ((int[])((int[])var144[1]))[0])) {
                                                      oja.a(var120, kca.b + " " + iv.a + " " + el.a('\uffff', 0) + (String)var141[16], (long)lf.b(var138, (byte)93).hashCode(), false, aj.a, false, var122, true, qp.b, -1, (byte)-106, 48, sv.a(var120, 1, var138, var122));
                                                      ++daa.m;
                                                   }
                                                }

                                                if(((byte[])((byte[])((Object[])((Object[])var124[2]))[10]))[0] == ((byte[])((byte[])uta.g[10]))[0]) {
                                                   String[] var145 = (String[])((String[])var141[3]);
                                                   if(null != var145) {
                                                      for(int var146 = -1 + var145.length; var146 >= 0; --var146) {
                                                         if(null != var145[var146]) {
                                                            short var136 = 0;
                                                            int var133 = fha.t;
                                                            if(0 == var146) {
                                                               var136 = 46;
                                                            }

                                                            if(var146 == 1) {
                                                               var136 = 12;
                                                            }

                                                            if(var146 == 2) {
                                                               var136 = 19;
                                                            }

                                                            if(3 == var146) {
                                                               var136 = 52;
                                                            }

                                                            if(var146 == 4) {
                                                               var136 = 1001;
                                                            }

                                                            if(((int[])((int[])var141[1]))[35] == var146) {
                                                               var133 = ((int[])((int[])var141[1]))[36];
                                                            }

                                                            if(var146 == 5) {
                                                               var136 = 1009;
                                                            }

                                                            if(((int[])((int[])var141[1]))[38] == var146) {
                                                               var133 = ((int[])((int[])var141[1]))[33];
                                                            }

                                                            oja.a(var120, el.a('\uffff', 0) + (String)var141[16], (long)lf.b(var138, (byte)39).hashCode(), false, var133, false, var122, true, var145[var146], -1, (byte)-22, var136, sv.a(var120, 1, var138, var122));
                                                            ++be.e;
                                                         }
                                                      }

                                                      if(var124 != null && var124.length == 8 && var124[0].equals(Integer.valueOf(2)) && var124[0].equals(Integer.valueOf(2))) {
                                                         ((int[])((int[])pn.b[1]))[19] = 122;
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }

                              kta var17;
                              kta var16;
                              for(var112 = (var16 = (kta)om.a(vja.f_i, false)) == null?null:var16.f_l; var112 != null; var112 = (var17 = (kta)pw.a(vja.f_i, 65)) == null?null:var17.f_l) {
                                 if(var9 >= ((int[])((int[])var112[1]))[1] && var9 < ((int[])((int[])var112[1]))[3] && var10 >= ((int[])((int[])var112[1]))[0] && var10 < ((int[])((int[])var112[1]))[2]) {
                                    ll.a((byte)-93);
                                    pta.a((Object[])((Object[])var112[0]), false);
                                 }
                              }

                              if(var101 != null && var101.length == 37 && var101[8].equals(Integer.valueOf(2))) {
                                 ((boolean[])((boolean[])dh.e[1]))[2] = false;
                              }
                           }

                           if(var49 != null && var49.length == 1) {
                              et.c = null;
                           }

                           var61 = ofa.b;
                           int[] var108 = ot.a;

                           for(var63 = 0; var63 < var61; ++var63) {
                              var113 = vo.E[var108[var63]];
                              if(var113 != null) {
                                 ra.a(1, -1, var108[var63], var113, bb.b, -1);
                                 qk.a(var52, var9, var54, var51 - ((int[])((int[])var49[1]))[7], var55, var53, var113, var50 - ((int[])((int[])var49[1]))[0], 0, var10);
                              }
                           }

                           var63 = 0;

                           while(true) {
                              if(var63 >= rba.h) {
                                 continue label1819;
                              }

                              var64 = gr.c[var63];
                              hna var105 = (hna)pm.a((long)var64, hf.g, false);
                              if(var105 != null) {
                                 ra.a(1, -1, var64, var105.k, ooa.c, ((int[])((int[])((Object[])((Object[])var105.k[42]))[1]))[17]);
                                 qk.a(var52, var9, var54, var51 - ((int[])((int[])var49[1]))[7], var55, var53, var105.k, var50 - ((int[])((int[])var49[1]))[0], 0, var10);
                              }

                              ++var63;
                           }
                        }

                        if(((int[])((int[])var49[1]))[30] == ru.c) {
                           var97 = coa.a(lna.g, var49, (byte)-100);
                           if(var97 == null || bma.m != 0 && bma.m != 3 || kea.c || var9 < var52 || var10 < var53 || var9 >= var54 || var10 >= var55) {
                              continue;
                           }

                           var62 = var9 - var50;
                           var63 = var10 - var51;
                           var64 = ((int[])((int[])var97[3]))[var63];
                           if(var62 < var64 || var62 > var64 + ((int[])((int[])var97[0]))[var63]) {
                              continue;
                           }

                           var62 -= ((int[])((int[])var49[1]))[70] / 2;
                           var63 -= ((int[])((int[])var49[1]))[2] / 2;
                           int var111;
                           if(ha.e == 1) {
                              var111 = (int)sma.h & 16383;
                           } else {
                              var111 = (int)sma.h + coa.v & 16383;
                           }

                           int var66 = tda.p[var111];
                           int var109 = tda.k[var111];
                           if(ha.e != 1) {
                              var66 = var66 * (kma.b + 256) >> 8;
                              var109 = var109 * (kma.b + 256) >> 8;
                           }

                           int var68 = var63 * var66 + var62 * var109 >> 14;
                           int var69 = var63 * var109 - var62 * var66 >> 14;
                           if(var101 != null && var101.length == 5) {
                              tra.b = ((long[])((long[])he.b[0]))[5];
                           }

                           if(ha.e == 1) {
                              var70 = (vda.f >> 9) + (var68 >> 2);
                              var71 = (Class_b.h >> 9) - (var69 >> 2);
                           } else {
                              int var72 = (gn.a(uta.g, (byte)20) - 1) * 256;
                              Object[] var73 = (Object[])((Object[])woa.a(5, uta.g)[1]);
                              var70 = ((int)((float[])((float[])var73[1]))[2] - var72 >> 9) + (var68 >> 2);
                              var71 = ((int)((float[])((float[])var73[1]))[1] - var72 >> 9) - (var69 >> 2);
                           }

                           if(ra.h && (kd.c & 64) != 0) {
                              var117 = nja.a(ft.f_i, 1, rw.A);
                              if(var117 != null) {
                                 oja.a(var71, " " + iv.a, (long)(((int[])((int[])var49[1]))[47] << 32 | ((int[])((int[])var49[1]))[3]), false, aj.a, true, var70, true, qp.b, ((int[])((int[])var49[1]))[13], (byte)117, 58, 1L);
                              } else {
                                 rba.a((byte)109);
                              }
                              continue;
                           }

                           if(fsa.g == vw.e) {
                              oja.a(var71, "", 0L, false, -1, true, var70, true, gj.a(dp.y, -126, gj.S), -1, (byte)98, 11, 1L);
                           }

                           oja.a(var71, "", 0L, false, dw.c, true, var70, true, vw.f_i, -1, (byte)-75, 10, 1L);
                           continue;
                        }

                        if(((int[])((int[])var49[1]))[30] == jsa.e) {
                           ona.d = var49;
                           if(var93) {
                              ui.c = true;
                           }

                           if(var99) {
                              var61 = (int)((double)(hla.b(var101, 1) - var50 - ((int[])((int[])var49[1]))[70] / 2) * 2.0D / (double)eka.h);
                              var62 = (int)(-((double)(jk.a(var101, 0) - var51 - ((int[])((int[])var49[1]))[2] / 2) * 2.0D / (double)eka.h));
                              var63 = ln.b + var61 + eka.n;
                              var64 = jw.c + var62 + eka.u;
                              Object[] var65 = eka.M;
                              if(var65 == null) {
                                 continue;
                              }

                              int[] var67 = new int[3];
                              ila.a(var63, (byte)5, var67, var65, var64);
                              if(var67 != null) {
                                 if(oc.a(lja.a, 82, (byte)-84) && oda.h > 0) {
                                    fi.a(var67[0], var67[1], (byte)-125, var67[2]);
                                    continue;
                                 }

                                 noa.e = true;
                                 fb.e = var67[0];
                                 iqa.f_l = var67[1];
                                 nja.a = var67[2];
                              }

                              pja.g = 1;
                              fn.h = false;
                              pla.b = Class_b.j.d(104);
                              ft.m = Class_b.j.e(18677);
                              continue;
                           }

                           if(var100 && pja.g > 0) {
                              if(pja.g == 1 && (pla.b != Class_b.j.d(104) || ft.m != Class_b.j.e(18677))) {
                                 rna.k = ln.b;
                                 rea.g = jw.c;
                                 pja.g = 2;
                              }

                              if(pja.g == 2) {
                                 fn.h = true;
                                 var61 = rna.k + (int)((double)(pla.b - Class_b.j.d(104)) * 2.0D / (double)eka.L);
                                 rd.s = -1;
                                 dq.f = -1;
                                 ln.b = var61;
                                 sia.a((byte)-68);
                                 jh.a(rea.g - (int)((double)(ft.m - Class_b.j.e(18677)) * 2.0D / (double)eka.L), -58);
                              }
                              continue;
                           }

                           if(pja.g > 0 && !fn.h) {
                              if((tda.j == 1 || jga.a(115)) && nma.h > 2) {
                                 uja.a(ft.m, -14829, pla.b);
                              } else {
                                 var96 = 0 < nma.h;
                                 if(var96) {
                                    uja.a(ft.m, -14829, pla.b);
                                 }
                              }
                           }

                           pja.g = 0;
                           continue;
                        }

                        if(((int[])((int[])var49[1]))[30] == df.a) {
                           if(var100) {
                              wh.a(Class_b.j.e(18677) - var51, ((int[])((int[])var49[1]))[70], true, Class_b.j.d(104) - var50, ((int[])((int[])var49[1]))[2]);
                           }
                           continue;
                        }

                        if(((int[])((int[])var49[1]))[30] == wqa.a) {
                           ora.a(var50, -11, var51, var49);
                           continue;
                        }
                     }

                     if(!((boolean[])((boolean[])var49[5]))[0] && var99) {
                        ((boolean[])((boolean[])var49[5]))[0] = true;
                        if(var49[14] != null) {
                           var97 = nga.b(new Object[7], (byte)87);
                           ((boolean[])((boolean[])var97[6]))[0] = true;
                           var97[0] = var49;
                           ((int[])((int[])var97[1]))[1] = hla.b(var101, 1) - var50;
                           ((int[])((int[])var97[1]))[5] = jk.a(var101, 0) - var51;
                           var97[3] = var49[14];
                           a(110, it.b, (lm)(var97 == null?null:var97[2]));
                        }
                     }

                     if(((boolean[])((boolean[])var49[5]))[0] && var100 && var49[22] != null) {
                        var97 = nga.b(new Object[7], (byte)87);
                        ((boolean[])((boolean[])var97[6]))[0] = true;
                        var97[0] = var49;
                        ((int[])((int[])var97[1]))[1] = Class_b.j.d(104) - var50;
                        ((int[])((int[])var97[1]))[5] = Class_b.j.e(18677) - var51;
                        var97[3] = var49[22];
                        a(110, it.b, (lm)(var97 == null?null:var97[2]));
                     }

                     if(((boolean[])((boolean[])var49[5]))[0] && !var100) {
                        ((boolean[])((boolean[])var49[5]))[0] = false;
                        if(var49[10] != null) {
                           var97 = nga.b(new Object[7], (byte)87);
                           ((boolean[])((boolean[])var97[6]))[0] = true;
                           var97[0] = var49;
                           ((int[])((int[])var97[1]))[1] = Class_b.j.d(104) - var50;
                           ((int[])((int[])var97[1]))[5] = Class_b.j.e(18677) - var51;
                           var97[3] = var49[10];
                           a(125, oq.a, (lm)(var97 == null?null:var97[2]));
                        }
                     }

                     if(var100 && var49[55] != null) {
                        var97 = nga.b(new Object[7], (byte)87);
                        ((boolean[])((boolean[])var97[6]))[0] = true;
                        var97[0] = var49;
                        ((int[])((int[])var97[1]))[1] = Class_b.j.d(104) - var50;
                        ((int[])((int[])var97[1]))[5] = Class_b.j.e(18677) - var51;
                        var97[3] = var49[55];
                        a(-28, it.b, (lm)(var97 == null?null:var97[2]));
                     }

                     if(!((boolean[])((boolean[])var49[5]))[10] && var93) {
                        ((boolean[])((boolean[])var49[5]))[10] = true;
                        if(var49[36] != null) {
                           var97 = nga.b(new Object[7], (byte)87);
                           ((boolean[])((boolean[])var97[6]))[0] = true;
                           var97[0] = var49;
                           ((int[])((int[])var97[1]))[1] = Class_b.j.d(104) - var50;
                           ((int[])((int[])var97[1]))[5] = Class_b.j.e(18677) - var51;
                           var97[3] = var49[36];
                           a(-65, it.b, (lm)(var97 == null?null:var97[2]));
                        }
                     }

                     if(((boolean[])((boolean[])var49[5]))[10] && var93 && var49[41] != null) {
                        var97 = nga.b(new Object[7], (byte)87);
                        ((boolean[])((boolean[])var97[6]))[0] = true;
                        var97[0] = var49;
                        ((int[])((int[])var97[1]))[1] = Class_b.j.d(104) - var50;
                        ((int[])((int[])var97[1]))[5] = Class_b.j.e(18677) - var51;
                        var97[3] = var49[41];
                        a(119, it.b, (lm)(var97 == null?null:var97[2]));
                     }

                     if(((boolean[])((boolean[])var49[5]))[10] && !var93) {
                        ((boolean[])((boolean[])var49[5]))[10] = false;
                        if(var49[38] != null) {
                           var97 = nga.b(new Object[7], (byte)87);
                           ((boolean[])((boolean[])var97[6]))[0] = true;
                           var97[0] = var49;
                           ((int[])((int[])var97[1]))[1] = Class_b.j.d(104) - var50;
                           ((int[])((int[])var97[1]))[5] = Class_b.j.e(18677) - var51;
                           var97[3] = var49[38];
                           a(115, oq.a, (lm)(var97 == null?null:var97[2]));
                        }
                     }

                     if(var101 != null && (var101.length == 27 || var101.length == 2)) {
                        iia.a(2, ((boolean[])((boolean[])((Object[])((Object[])lta.h[1]))[14]))[0], ((int[])((int[])eq.f_l[0]))[1], (Object[])null);
                     }

                     if(var49[17] != null) {
                        var97 = nga.b(new Object[7], (byte)87);
                        var97[0] = var49;
                        var97[3] = var49[17];
                        a(-125, mna.a, (lm)(var97 == null?null:var97[2]));
                     }

                     if(var49[46] != null && kv.d > ((int[])((int[])var49[1]))[21]) {
                        if(var49[26] != null && kv.d - ((int[])((int[])var49[1]))[21] <= 32) {
                           label1672:
                           for(var61 = ((int[])((int[])var49[1]))[21]; var61 < kv.d; ++var61) {
                              var62 = aua.b[var61 & 31];

                              for(var63 = 0; var63 < ((int[])((int[])var49[26])).length; ++var63) {
                                 if(((int[])((int[])var49[26]))[var63] == var62) {
                                    var113 = nga.b(new Object[7], (byte)87);
                                    var113[0] = var49;
                                    var113[3] = var49[46];
                                    a(114, it.b, (lm)(var113 == null?null:var113[2]));
                                    break label1672;
                                 }
                              }

                              if(var101 != null && var101.length == 29) {
                                 ioa.a((Object[])null, -11998, ((int[])((int[])wn.c[4]))[5]);
                              }
                           }
                        } else {
                           var97 = nga.b(new Object[7], (byte)87);
                           var97[0] = var49;
                           var97[3] = var49[46];
                           a(-116, it.b, (lm)(var97 == null?null:var97[2]));
                        }

                        ((int[])((int[])var49[1]))[21] = kv.d;
                     }

                     if(var49[42] != null && rha.s > ((int[])((int[])var49[1]))[28]) {
                        if(var49[37] != null && rha.s - ((int[])((int[])var49[1]))[28] <= 32) {
                           label1653:
                           for(var61 = ((int[])((int[])var49[1]))[28]; var61 < rha.s; ++var61) {
                              var62 = qn.c[var61 & 31];

                              for(var63 = 0; var63 < ((int[])((int[])var49[37])).length; ++var63) {
                                 if(((int[])((int[])var49[37]))[var63] == var62) {
                                    var113 = nga.b(new Object[7], (byte)87);
                                    var113[0] = var49;
                                    var113[3] = var49[42];
                                    a(-75, it.b, (lm)(var113 == null?null:var113[2]));
                                    break label1653;
                                 }
                              }
                           }
                        } else {
                           var97 = nga.b(new Object[7], (byte)87);
                           var97[0] = var49;
                           var97[3] = var49[42];
                           a(112, it.b, (lm)(var97 == null?null:var97[2]));
                        }

                        ((int[])((int[])var49[1]))[28] = rha.s;
                     }

                     if(var49[3] != null && kk.g > ((int[])((int[])var49[1]))[58]) {
                        if(var49[23] != null && kk.g - ((int[])((int[])var49[1]))[58] <= 32) {
                           label1634:
                           for(var61 = ((int[])((int[])var49[1]))[58]; var61 < kk.g; ++var61) {
                              var62 = tna.b[var61 & 31];

                              for(var63 = 0; var63 < ((int[])((int[])var49[23])).length; ++var63) {
                                 if(((int[])((int[])var49[23]))[var63] == var62) {
                                    var113 = nga.b(new Object[7], (byte)87);
                                    var113[0] = var49;
                                    var113[3] = var49[3];
                                    a(112, it.b, (lm)(var113 == null?null:var113[2]));
                                    break label1634;
                                 }
                              }

                              if(var0 != null && var0.length == 13) {
                                 jaa.d = true;
                              }
                           }
                        } else {
                           var97 = nga.b(new Object[7], (byte)87);
                           var97[0] = var49;
                           var97[3] = var49[3];
                           a(114, it.b, (lm)(var97 == null?null:var97[2]));
                        }

                        ((int[])((int[])var49[1]))[58] = kk.g;
                     }

                     if(var49[56] != null && rca.g > ((int[])((int[])var49[1]))[6]) {
                        if(var49[4] != null && rca.g - ((int[])((int[])var49[1]))[6] <= 32) {
                           label1615:
                           for(var61 = ((int[])((int[])var49[1]))[6]; var61 < rca.g; ++var61) {
                              var62 = ota.t[var61 & 31];

                              for(var63 = 0; var63 < ((int[])((int[])var49[4])).length; ++var63) {
                                 if(((int[])((int[])var49[4]))[var63] == var62) {
                                    var113 = nga.b(new Object[7], (byte)87);
                                    var113[0] = var49;
                                    var113[3] = var49[56];
                                    a(115, it.b, (lm)(var113 == null?null:var113[2]));
                                    break label1615;
                                 }
                              }

                              if(var0 != null && var0.length == 12 && var0[3].equals(Boolean.valueOf(false))) {
                                 su.a(((int[])((int[])ena.e[10]))[7], -89, false);
                              }
                           }
                        } else {
                           var97 = nga.b(new Object[7], (byte)87);
                           var97[0] = var49;
                           var97[3] = var49[56];
                           a(-24, it.b, (lm)(var97 == null?null:var97[2]));
                        }

                        ((int[])((int[])var49[1]))[6] = rca.g;
                     }

                     if(var49[33] != null && kf.b > ((int[])((int[])var49[1]))[69]) {
                        if(var49[27] != null && kf.b - ((int[])((int[])var49[1]))[69] <= 32) {
                           label1596:
                           for(var61 = ((int[])((int[])var49[1]))[69]; var61 < kf.b; ++var61) {
                              var62 = afa.a[var61 & 31];

                              for(var63 = 0; var63 < ((int[])((int[])var49[27])).length; ++var63) {
                                 if(((int[])((int[])var49[27]))[var63] == var62) {
                                    var113 = nga.b(new Object[7], (byte)87);
                                    var113[0] = var49;
                                    var113[3] = var49[33];
                                    a(-127, it.b, (lm)(var113 == null?null:var113[2]));
                                    break label1596;
                                 }
                              }

                              if(var0 != null && (var0.length == 1 || var0.length == 15 && var0[7].equals(Boolean.valueOf(false)))) {
                                 kf.a(26, -99);
                              }
                           }
                        } else {
                           var97 = nga.b(new Object[7], (byte)87);
                           var97[0] = var49;
                           var97[3] = var49[33];
                           a(114, it.b, (lm)(var97 == null?null:var97[2]));
                        }

                        ((int[])((int[])var49[1]))[69] = kf.b;
                     }

                     if(var49[35] != null && eqa.b > ((int[])((int[])var49[1]))[17]) {
                        if(var49[29] != null && eqa.b - ((int[])((int[])var49[1]))[17] <= 32) {
                           label1567:
                           for(var61 = ((int[])((int[])var49[1]))[17]; var61 < eqa.b; ++var61) {
                              var62 = hfa.h[var61 & 31];
                              if(var49 != null && (var49.length == 3 || var49.length == 9 && var49[2].equals(Integer.valueOf(2)))) {
                                 rba.a((byte)81);
                              }

                              for(var63 = 0; var63 < ((int[])((int[])var49[29])).length; ++var63) {
                                 if(((int[])((int[])var49[29]))[var63] == var62) {
                                    var113 = nga.b(new Object[7], (byte)87);
                                    var113[0] = var49;
                                    var113[3] = var49[35];
                                    a(118, it.b, (lm)(var113 == null?null:var113[2]));
                                    break label1567;
                                 }
                              }
                           }
                        } else {
                           var97 = nga.b(new Object[7], (byte)87);
                           var97[0] = var49;
                           var97[3] = var49[35];
                           a(127, it.b, (lm)(var97 == null?null:var97[2]));
                        }

                        ((int[])((int[])var49[1]))[17] = eqa.b;
                     }

                     if(sja.f > ((int[])((int[])var49[1]))[12] && var49[47] != null) {
                        var97 = nga.b(new Object[7], (byte)87);
                        var97[0] = var49;
                        var97[3] = var49[47];
                        a(126, it.b, (lm)(var97 == null?null:var97[2]));
                     }

                     if(lta.c > ((int[])((int[])var49[1]))[12] && var49[19] != null) {
                        var97 = nga.b(new Object[7], (byte)87);
                        var97[0] = var49;
                        var97[3] = var49[19];
                        a(120, it.b, (lm)(var97 == null?null:var97[2]));
                     }

                     if(wh.a > ((int[])((int[])var49[1]))[12] && var49[12] != null) {
                        var97 = nga.b(new Object[7], (byte)87);
                        var97[0] = var49;
                        var97[3] = var49[12];
                        a(-34, it.b, (lm)(var97 == null?null:var97[2]));
                     }

                     if(ow.c > ((int[])((int[])var49[1]))[12] && var49[51] != null) {
                        var97 = nga.b(new Object[7], (byte)87);
                        var97[0] = var49;
                        var97[3] = var49[51];
                        a(127, it.b, (lm)(var97 == null?null:var97[2]));
                     }

                     if(il.f > ((int[])((int[])var49[1]))[12] && var49[64] != null) {
                        var97 = nga.b(new Object[7], (byte)87);
                        var97[0] = var49;
                        var97[3] = var49[64];
                        a(108, it.b, (lm)(var97 == null?null:var97[2]));
                     }

                     if(jta.h > ((int[])((int[])var49[1]))[12] && var49[43] != null) {
                        var97 = nga.b(new Object[7], (byte)87);
                        var97[0] = var49;
                        var97[3] = var49[43];
                        a(114, it.b, (lm)(var97 == null?null:var97[2]));
                     }

                     if(eo.b > ((int[])((int[])var49[1]))[12] && var49[24] != null) {
                        var97 = nga.b(new Object[7], (byte)87);
                        var97[0] = var49;
                        var97[3] = var49[24];
                        a(-21, it.b, (lm)(var97 == null?null:var97[2]));
                     }

                     ((int[])((int[])var49[1]))[12] = qr.a;
                     if(var49[31] != null) {
                        for(var61 = 0; var61 < qpa.e; ++var61) {
                           var112 = nga.b(new Object[7], (byte)87);
                           var112[0] = var49;
                           ((int[])((int[])var112[1]))[4] = noa.a(true, hqa.b[var61]);
                           ((int[])((int[])var112[1]))[2] = Class_t.a(hqa.b[var61], (int)0);
                           var112[3] = var49[31];
                           a(113, it.b, (lm)(var112 == null?null:var112[2]));
                        }

                        if(var49 != null && var49.length == 1) {
                           it.b = null;
                        }
                     }

                     if(uja.f && var49[21] != null) {
                        var97 = nga.b(new Object[7], (byte)87);
                        var97[0] = var49;
                        var97[3] = var49[21];
                        a(124, it.b, (lm)(var97 == null?null:var97[2]));
                     }
                  }

                  if(((int[])((int[])var49[1]))[18] == 5 && ((int[])((int[])var49[1]))[29] != -1) {
                     ala.a(lna.g, va.a(ura.a, 108, var49, ira.f), ((int[])((int[])var49[1]))[2], fg.a((byte)103, (Object[])((Object[])tu.d[1])), (byte)-14);
                  }

                  ij.b(67, var49);
                  if(((int[])((int[])var49[1]))[18] == 0) {
                     a(var0, var1, ((int[])((int[])var49[1]))[3], var52, var53, var54, var55, var50 - ((int[])((int[])var49[1]))[0], var51 - ((int[])((int[])var49[1]))[7], var9, var10);
                     if(var49[7] != null) {
                        a(var0, (Object[][])((Object[][])var49[7]), ((int[])((int[])var49[1]))[3], var52, var53, var54, var55, var50 - ((int[])((int[])var49[1]))[0], var51 - ((int[])((int[])var49[1]))[7], var9, var10);
                     }

                     oh var47;
                     var97 = (var47 = (oh)pm.a((long)((int[])((int[])var49[1]))[3], lfa.c, false)) == null?null:var47.p;
                     if(var97 != null) {
                        if(fsa.g == uha.g && ((int[])((int[])var97[1]))[0] == 0 && !kea.c && var93 && !jp.j) {
                           ll.a((byte)-46);
                        }

                        eia.a(var9, 107, var52, var50, var54, var10, var55, var53, var51, ((int[])((int[])var97[1]))[1], var97);
                     }
                  }
               }
            }
         }
      }

   }

   static final void b() {
      int var0 = ofa.b;
      int[] var1 = ot.a;
      int var2;
      if(bw.b == 0) {
         var2 = ofa.e.length;
      } else {
         var2 = tn.g?var0:var0 + rba.h;
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         Object[] var4;
         if(bw.b == 0) {
            Object[] var5 = ofa.e[var3];
            if(!((boolean[])((boolean[])var5[2]))[0]) {
               continue;
            }

            var4 = za.a(var5, (byte)93);
         } else {
            if(var3 < var0) {
               var4 = vo.E[var1[var3]];
            } else {
               var4 = ((hna)pm.a((long)gr.c[var3 - var0], hf.g, false)).k;
            }

            if(((int[])((int[])var4[12]))[15] < 0) {
               continue;
            }
         }

         int var14 = dg.a(-103, var4);
         Object[] var6 = (Object[])((Object[])woa.a(5, var4)[1]);
         if((var14 & 1) == 0) {
            if(((int)((float[])((float[])var6[1]))[2] & 511) == 0 && ((int)((float[])((float[])var6[1]))[1] & 511) == 0) {
               continue;
            }
         } else if(((int)((float[])((float[])var6[1]))[2] & 511) == 256 && ((int)((float[])((float[])var6[1]))[1] & 511) == 256) {
            continue;
         }

         Object[] var8 = new Object[2];
         float var9 = ((float[])((float[])var6[1]))[2];
         int var13 = Class_ds.a(((byte[])((byte[])var4[10]))[0], (int)((float[])((float[])var6[1]))[2], (int)((float[])((float[])var6[1]))[1], (byte)122);
         sra.a(var4, bl.a((byte)-97, var9, var8, ((float[])((float[])var6[1]))[1], (float)var13), 1);
         eja.a(var4, true);
      }

   }

   final void d(byte var1) {
      label19: {
         ++Ib;
         if(2 != bg.a(true, (Object[])((Object[])tu.d[5]))) {
            this.f((byte)-124);
            if(f_vb == 0) {
               break label19;
            }
         }

         try {
            this.f((byte)-104);
         } catch (ThreadDeath var3) {
            throw var3;
         } catch (Throwable var4) {
            taa.a(var4, 32, var4.getMessage() + " " + this.a((byte)70));
            ag.E = true;
            lg.a(false, 0, (byte)-120);
         }
      }

      int var2 = -2 / ((var1 + 38) / 61);
   }

   static final lm a(Object[] var0, int var1) {
      if(var1 != -28280) {
         Kb = new Object[12];
      }

      ++f_tb;
      lm var2 = (lm)var0[1];
      if(var2 != var0[0]) {
         var0[1] = var2.f;
         return var2;
      } else {
         var0[1] = null;
         return null;
      }
   }

   final void d(int var1) {
      if(dn.d) {
         qv.a(119);
      }

      ++f_eb;
      if(var1 != 28) {
         ((int[])((int[])f_ob[0]))[10] = -69;
      }

      uda.a(-6133);
      if(null != lna.g) {
         lna.g.a((byte)17);
      }

      if(eb.f && gf.b != null) {
         kra var2 = roa.b;
         Frame var3 = gf.b;
         var2.exit();
         var3.setVisible(false);
         var3.dispose();
         gf.b = null;
      }

      ica.a(lba.f, false);
      ica.a(lba.h, false);
      lo.a((int)18);
      Object[] var13 = dka.g;
      if(null != var13) {
         if(null != var13[10]) {
            qi.a((Object[])((Object[])var13[10]), (int)4);
            if(f_vb != 0) {
               throw new IllegalStateException();
            }
         }

         Object[] var14 = wga.h;
         ((boolean[])((boolean[])var14[2]))[0] = true;
         synchronized(var14[3]) {
            var14[3].notifyAll();
         }

         try {
            ((Thread)var14[4]).join();
         } catch (InterruptedException var11) {
            ;
         }

         var14[4] = null;
         if(null != os.k) {
            Object[] var4 = os.k;
            if(var4[0] != null) {
               lm var5 = new lm();
               synchronized(var4[1]) {
                  a(127, (Object[])((Object[])var4[1]), var5);
                  var4[1].notify();
               }

               try {
                  ((Thread)var4[0]).join();
               } catch (InterruptedException var9) {
                  ;
               }

               var4[0] = null;
            }

            os.k = null;
         }

         try {
            tba.a((byte)76);
         } catch (Exception var8) {
            ;
         }

      } else {
         throw new IllegalStateException();
      }
   }

   static final Object[] c(Object[] var0) {
      rl var1;
      Object[] var2 = (var1 = (rl)pm.a(((long)((int[])((int[])var0[1]))[3] << 32) + (long)((int[])((int[])var0[1]))[47], wra.g, false)) == null?null:var1.o;
      return (Object[])(var2 != null?var2:var0[9]);
   }

   static final boolean a(Object[] var0) {
      if(jp.j) {
         if(((int[])((int[])c(var0)[1]))[0] != 0) {
            return false;
         }

         if(((int[])((int[])var0[1]))[18] == 0) {
            return false;
         }
      }

      return ((boolean[])((boolean[])var0[5]))[18];
   }

   final void a(int var1) {
      ++f_hb;
      Frame var2 = new Frame(" ");
      var2.pack();
      var2.dispose();
      va.b(-32144);
      wga.h = pia.a((byte)-10, new Object[5]);
      Object[] var4 = new Object[11];
      tu.a(var4, (byte)60);
      dka.g = var4;
      bc.a(new int[]{20, 260}, -119, new int[]{1000, 100});
      if(mka.g != po.f_i) {
         gi.S = new byte[50][];
      }

      Object[] var6 = null;
      Object[] var8 = new Object[42];
      Object[] var9 = fsa.g;
      var8[18] = tp.a(48, var8);
      var8[28] = var9;
      Object[] var11 = new Object[2];
      int var12 = Class_e.f;
      int var16 = nb.b;
      var8[23] = aha.a(-119, 0 != ~gv.f.toLowerCase().indexOf("arm"), var16, var12, var11);
      var8[5] = ef.a(false, 0, var8, new Object[4]);
      dt.a(var8, 26, true);
      if(null != var8 && var8.length == 11) {
         mia.a(false, -98, ((int[])((int[])((Object[])((Object[])ij.e[1]))[8]))[4], true, ((int[])((int[])aha.e[0]))[12]);
      }

      Object[] var10 = var8;

      try {
         if(var9 != null && var9.length == 6) {
            this.init();
         }

         var6 = ug.a("", (String)fsa.g[2], 3, false);
         byte[] var21 = new byte[(int)oca.a(true, var6)];

         int var13;
         for(var12 = 0; var21.length > var12; var12 += var13) {
            var13 = bpa.a(var21.length + -var12, (byte)34, var6, var21, var12);
            if(~var13 == 0) {
               throw new IOException();
            }
         }

         Object[] var22 = new Object[42];
         Object[] var14 = jta.a((byte)-90, var21, new Object[3]);
         var10 = dua.a(var22, fsa.g, var14, 0, (byte)-83);
      } catch (Exception var20) {
         ;
      }

      try {
         if(var6 != null) {
            it.a(var6, false);
         }
      } catch (Exception var19) {
         ;
      }

      tu.d = var10;
      if(mka.g == po.f_i) {
         vha.a[0] = this.getCodeBase().getHost();
      } else if(mga.b(po.f_i, -11605)) {
         vha.a[0] = this.getCodeBase().getHost();
         ((int[])((int[])vha.a[1]))[2] = ((int[])((int[])vha.a[1]))[0] + '\u9c40';
         ((int[])((int[])ri.j[1]))[2] = '\u9c40' + ((int[])((int[])ri.j[1]))[0];
         ((int[])((int[])vha.a[1]))[1] = ((int[])((int[])vha.a[1]))[0] + '\uc350';
         ((int[])((int[])ri.j[1]))[1] = '\uc350' + ((int[])((int[])ri.j[1]))[0];
      } else if(uca.c == po.f_i) {
         vha.a[0] = cd.j;
         ri.j[0] = cd.j;
         ((int[])((int[])vha.a[1]))[2] = '\u9c40' + ((int[])((int[])vha.a[1]))[0];
         ((int[])((int[])vha.a[1]))[1] = ((int[])((int[])vha.a[1]))[0] + '\uc350';
         ((int[])((int[])ri.j[1]))[2] = '\u9c40' + ((int[])((int[])ri.j[1]))[0];
         ((int[])((int[])ri.j[1]))[1] = ((int[])((int[])ri.j[1]))[0] + '\uc350';
      }

      ma.q = vha.a;
      gj.D = ona.a = qga.n = la.b = new short[256];
      if(uha.g == fsa.g) {
         dba.c = false;
      }

      try {
         if(var1 > -123) {
            Kb = (Object[])((Object[])f_ob[7]);
         }

         jg.c = kqa.h.getToolkit().getSystemClipboard();
      } catch (Exception var18) {
         ;
      }

      lja.a = sra.a(ru.d, 0, false, false);
      if(var4 != null && var4.length == 12) {
         Class_n.a(1, ((int[])((int[])((Object[])((Object[])sh.a[1]))[8]))[13], ((int[])((int[])bqa.h[4]))[0], -58, ((int[])((int[])dja.c[6]))[0]);
      }

      Class_b.j = lw.a(true, ru.d, -32260);
      if(mka.g != po.f_i) {
         su.d = true;
      }

      vea.f_i = gj.a(dp.y, 98, gj.f_vb);
   }

   final void b(byte var1) {
      ++f_nb;
      if(var1 != 98) {
         Cb = -0.47447008F;
      }

      if(2 == bg.a(true, (Object[])((Object[])tu.d[5]))) {
         try {
            this.k(-1267693944);
            return;
         } catch (ThreadDeath var3) {
            throw var3;
         } catch (Throwable var4) {
            taa.a(var4, 32, var4.getMessage() + " " + this.a((byte)-60));
            ag.E = true;
            lg.a(false, 0, (byte)-45);
            if(f_vb == 0) {
               return;
            }
         }
      }

      this.k(var1 ^ -1267693846);
   }

   static final void a() {
      for(int var0 = 0; var0 < rp.c; ++var0) {
         int[] var1 = ra.f_i[var0];

         for(int var2 = 0; var2 < wpa.a; ++var2) {
            var1[var2] = 0;
         }
      }

   }

}
