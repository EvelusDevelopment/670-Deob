import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import java.io.IOException;
import java.math.BigInteger;

final class ana {

   static int b;
   static int a;
   static int d;
   static int c;


   static final Object[] a(int var0, int var1, Object[] var2) {
      ++c;
      int var4 = -1;
      if(var1 != -17398) {
         ((boolean[])((boolean[])var2[0]))[3] = true;
      }

      Object var7 = dna.a((byte)34, (Object[])((Object[])var2[2]), (long)var0);
      Object[] var3;
      if(null != var7) {
         jaa var5;
         var3 = null == (var5 = (jaa)var7)?null:var5.c;
      } else if(!((qa)var2[1]).a(-20460, var0)) {
         var3 = null;
      } else {
         Object[] var9 = ((qa)var2[1]).a(var0, (byte)54);
         if(-1 == var4) {
            var4 = !((boolean[])((boolean[])var9[3]))[4]?((int[])((int[])((Object[])((Object[])var2[0]))[1]))[13]:64;
         }

         Object[] var8;
         if(((boolean[])((boolean[])var9[3]))[0] && iq.a((byte)-73, (Object[])((Object[])var2[0]))) {
            float[] var37 = ((qa)var2[1]).a(var4, (byte)90, var0, var4, false, 0.7F);
            if(null != var9 && -2 == ~var9.length) {
               a(75, -17398, (Object[])null);
            }

            Object[] var38 = new Object[6];
            Object[] var13 = (Object[])((Object[])var2[0]);
            Object[] var14 = ah.f;
            Object[] var15 = vk.f_i;
            boolean var16 = ((byte[])((byte[])var9[0]))[2] != 0;
            Object[] var17 = ah.f;
            vt.a(var38, (int)48);
            np.a(1, var14, var13, 3553, var38, var15, var16, var4 * var4);
            ((int[])((int[])var38[1]))[3] = var4;
            ((int[])((int[])var38[1]))[4] = var4;
            moa.a((byte)119, var38, (Object[])((Object[])var38[4]));
            if(var16 && ((int[])((int[])var38[1]))[2] != '\u84f5') {
               int var18 = bu.a(var1 ^ -17348, (Object[])((Object[])var38[5]), (Object[])((Object[])var38[2]));
               int var19 = var4;
               int var20 = var4;
               if(var4 > 0 && !ol.a((byte)109, var4)) {
                  throw new IllegalArgumentException("");
               }

               if(0 < var4 && !ol.a((byte)83, var4)) {
                  throw new IllegalArgumentException("");
               }

               int var21 = ((int[])((int[])var17[0]))[0];
               int var22 = 0;
               int var23 = var4 > var4?var4:var4;
               int var24 = var4 >> 1;
               int var25 = var4 >> 1;
               float[] var26 = var37;
               float[] var27 = new float[var21 * var25 * var24];

               while(true) {
                  OpenGL.glTexImage2Df(3553, var22, var18, var19, var20, 0, rha.b(var1 ^ -17406, var17), 5126, var26, 0);
                  if(1 >= var23) {
                     if(var9 != null && (var9.length == 37 && var9[6].equals(Boolean.valueOf(false)) || -6 == ~var9.length && var9[4].equals(Integer.valueOf(2)))) {
                        return null;
                     }

                     nb.a(false, true, var38);
                     break;
                  }

                  int var30 = var19 * var21;

                  for(int var31 = 0; var31 < var21; ++var31) {
                     if(null != var15 && var15.length == 5) {
                        return null;
                     }

                     int var32 = var31;
                     int var33 = var31;
                     int var34 = var31 + var30;

                     for(int var35 = 0; var35 < var25; ++var35) {
                        for(int var36 = 0; var24 > var36; ++var36) {
                           float var29 = var26[var33];
                           var33 += var21;
                           var29 += var26[var33];
                           var33 += var21;
                           var29 += var26[var34];
                           var34 += var21;
                           var29 += var26[var34];
                           var27[var32] = var29 * 0.25F;
                           var34 += var21;
                           var32 += var21;
                        }

                        var33 += var30;
                        var34 += var30;
                     }
                  }

                  float[] var28 = var27;
                  var27 = var26;
                  var26 = var28;
                  var19 = var24;
                  var20 = var25;
                  var25 >>= 1;
                  var24 >>= 1;
                  ++var22;
                  var23 >>= 1;
               }
            } else {
               OpenGL.glTexImage2Df(((int[])((int[])var38[1]))[2], 0, bu.a(103, (Object[])((Object[])var38[5]), (Object[])((Object[])var38[2])), ((int[])((int[])var38[1]))[3], ((int[])((int[])var38[1]))[4], 0, rha.b(8, var17), 5126, var37, 0);
               nb.a(false, false, var38);
            }

            gg.a((byte)-128, var38, true);
            var8 = var38;
         } else {
            int[] var10;
            label117: {
               if(((int[])((int[])var9[1]))[0] != 2) {
                  byte var12 = ((byte[])((byte[])var9[0]))[4];
                  boolean var11 = 1 != var12 && 7 != var12;
                  if(var11) {
                     var10 = ((qa)var2[1]).a(var4, 0.7F, true, -6300, var4, var0);
                     break label117;
                  }
               }

               var10 = ((qa)var2[1]).a(var4, 0.7F, (byte)-87, var4, false, var0);
            }

            var8 = qpa.a(0 != ((byte[])((byte[])var9[0]))[2], 115, new Object[6], false, 0, var10, (Object[])((Object[])var2[0]), var4, var4, 0, 3553);
         }

         pda.a(((boolean[])((boolean[])var9[3]))[1], false, var8, ((boolean[])((boolean[])var9[3]))[5]);
         il.a((long)var0, null != var8?var8[0]:null, true, (Object[])((Object[])var2[2]));
         var3 = var8;
      }

      return var3;
   }

   static final void newIAS3I1Wrapper(Object[] var1) {
      ++d;
      if(var1[1] == null) {
         var1[1] = new int[3];
      }
   }

   static final int a(int var0) {
      try {
         ++b;
         Object[] var3 = (Object[])((Object[])tu.d[15]);
         int var2 = ((int[])((int[])var3[1]))[0];
         int var4;
         if(0 == var2) {
            for(var4 = 0; qpa.e > var4; ++var4) {
               if(115 == Class_t.a(hqa.b[var4], (int)0) || 83 == Class_t.a(hqa.b[var4], (int)0)) {
                  ih.a(tu.d, (Object[])((Object[])tu.d[15]), 1, -105);
                  kua.h = true;
                  break;
               }
            }

            if(null != var3 && -4 == ~var3.length) {
               a(102);
            }
         }

         int var5;
         if(ec.C == ela.g) {
            Runtime var87 = Runtime.getRuntime();
            var5 = (int)((var87.totalMemory() - var87.freeMemory()) / 1024L);
            long var6 = he.a(-73);
            if(gt.a == 0L) {
               gt.a = var6;
            }

            if(var5 > 16384 && ~(var6 + -gt.a) > -5001L) {
               if(~(-hma.a + var6) < -1001L) {
                  System.gc();
                  hma.a = var6;
               }

               return 0;
            }
         }

         Object[] var7;
         Object[] var10;
         int var11;
         boolean var89;
         Object[] var88;
         Object[] var90;
         if(ela.g == ec.o) {
            if(null == wb.e) {
               var88 = new Object[7];
               var90 = dka.g;
               var7 = wga.h;
               BigInteger var8 = uia.a;
               BigInteger var9 = cr.a;
               var88[3] = var9;
               var88[2] = var90;
               var88[0] = var7;
               var88[5] = var8;
               if(!rs.a(12, (Object[])((Object[])var88[2]))) {
                  var88[1] = vla.a(255, true, 255, (Object[])((Object[])var88[2]), -73, (byte)0);
               }

               wb.e = var88;
            }

            if(!gk.a(111, wb.e)) {
               return 0;
            }

            jp.a(true, (byte)-68, 0, (String)null);

            try {
               var90 = new Object[1];
               byte[] var99 = pua.c;
               var10 = jta.a((byte)-92, var99, new Object[3]);
               ((int[])((int[])var10[1]))[0] = var99.length - 4;
               var11 = laa.a((byte)66, var10);
               ((int[])((int[])var10[1]))[0] = 0;
               byte[] var12 = new byte[var11];
               wf.a(var90, var10, (byte)-101, var12);
               if(var90 != null && -9 == ~var90.length) {
                  mka.d = ((int[])((int[])((Object[])((Object[])((Object[])((Object[])ph.f[20]))[11]))[4]))[0];
               }

               var89 = true;
               bt.a(var12, (byte)110);
            } catch (Exception var83) {
               var89 = false;
            }

            ug.b = !var89;
            wga.g = ppa.a(14150, 1, false, ug.b?34:32);
            ph.f = ppa.a(14150, 1, false, 33);
            nf.c = ppa.a(14150, 1, false, 13);
         }

         Object[] var13;
         Object[] var14;
         Object[] var26;
         Object[] var29;
         Object[] var95;
         int var91;
         Object[] var106;
         Object[] var104;
         Object[] var117;
         Object[] var116;
         Object[] var115;
         Object[] var123;
         if(ela.g == ec.s) {
            var89 = kna.a(110, ph.f);
            var5 = rd.a(100, bpa.d[33]);
            var5 += rd.a(100, bpa.d[!ug.b?32:34]);
            var5 += rd.a(100, bpa.d[13]);
            var5 += var89?100:rl.a(ph.f, (byte)125);
            if(400 != var5) {
               return var5 / 4;
            }

            ws.o = lka.a(wga.g, (byte)-23);
            bi.a = lka.a(ph.f, (byte)-71);
            var90 = wga.g;
            haa.c = dla.a(var90, 114, "p11_full");
            il.a = dla.a(var90, 56, "p12_full");
            fha.n = dla.a(var90, 55, "b12_full");
            var95 = (Object[])((Object[])tu.d[39]);
            var91 = ((int[])((int[])var95[1]))[0];
            var104 = new Object[4];
            var106 = fsa.g;
            var13 = ph.f;
            mj.a(var104, 8505);
            var104[2] = var13;
            jla.a((Object[])((Object[])var104[2]), (byte)71, 1);
            var14 = jta.a((byte)-88, qn.a(0, 0, (Object[])((Object[])var104[2]), 97), new Object[3]);
            int var15 = null != var14[2] && ((byte[])((byte[])var14[2])).length >= 1?fh.a(var14, false):-1;
            int var20;
            if(-1 != var15 && 3 >= var15) {
               int var16 = fh.a(var14, false);
               Object[][] var17 = new Object[][]{no.a, ld.e, kaa.a, qj.b, nsa.a, gca.e, nt.j, jta.e, we.d, sd.f};
               Object[][] var18 = var17;
               boolean var19 = true;
               int var21;
               if(var17.length == var16) {
                  for(var20 = 0; ~var20 > ~var18.length; ++var20) {
                     var21 = fh.a(var14, false);
                     if(((int[])((int[])var18[var20][0]))[0] != var21) {
                        var19 = false;
                        break;
                     }
                  }

                  if(var95 != null && 25 == var95.length && var95[7].equals(Integer.valueOf(2))) {
                     so.a(true, -23105);
                  }
               } else {
                  var19 = false;
               }

               if(!var19) {
                  var104[3] = new boolean[0];
                  var104[0] = new int[0][];
                  ((int[])((int[])var104[1]))[0] = -1;
               } else {
                  var20 = fh.a(var14, false);
                  var21 = fh.a(var14, false);
                  if(var15 > 2) {
                     ((int[])((int[])var104[1]))[0] = jia.c(-8166, var14);
                  } else {
                     ((int[])((int[])var104[1]))[0] = -1;
                  }

                  var104[3] = new boolean[var21 + 1];
                  var104[0] = new int[var21 + 1][];
                  if(var106 != null && 14 == var106.length && var106[7].equals(Integer.valueOf(0))) {
                     pu.a(256);
                  }

                  int var22;
                  for(var22 = 0; var20 > var22; ++var22) {
                     int var23 = fh.a(var14, false);
                     ((boolean[])((boolean[])var104[3]))[var23] = fh.a(var14, false) == 1;
                     int var24 = de.a((int)0, var14);
                     int var25;
                     if(~((int[])((int[])var104[1]))[0] != 0) {
                        ((int[][])((int[][])var104[0]))[var23] = new int[1 + var24];
                        if(null != var90 && 9 == var90.length) {
                           ph.f[7] = ((Object[])((Object[])ph.f[0]))[0];
                        }

                        ((int[][])((int[][])var104[0]))[var23][0] = ((int[])((int[])var104[1]))[0];

                        for(var25 = 0; var24 > var25; ++var25) {
                           ((int[][])((int[][])var104[0]))[var23][1 + var25] = de.a((int)0, var14);
                        }
                     } else {
                        ((int[][])((int[][])var104[0]))[var23] = new int[var24];

                        for(var25 = 0; var24 > var25; ++var25) {
                           ((int[][])((int[][])var104[0]))[var23][var25] = de.a((int)0, var14);
                        }
                     }
                  }

                  for(var22 = 0; var21 + 1 > var22; ++var22) {
                     if(((int[][])((int[][])var104[0]))[var22] == null) {
                        if(0 != ~((int[])((int[])var104[1]))[0]) {
                           ((int[][])((int[][])var104[0]))[var22] = new int[]{((int[])((int[])var104[1]))[0]};
                        } else {
                           ((int[][])((int[][])var104[0]))[var22] = new int[0];
                        }
                     }
                  }
               }
            } else {
               var104[0] = new int[0][];
               var104[3] = new boolean[0];
               ((int[])((int[])var104[1]))[0] = -1;
            }

            aqa.d = var104;
            int[] var114 = lr.a(var91, aqa.d, (byte)125);
            if(0 == var114.length) {
               var114 = lr.a(0, aqa.d, (byte)95);
            }

            var115 = new Object[3];
            var116 = wga.g;
            var117 = nf.c;
            var115[2] = var116;
            var115[0] = var117;
            Object[] var118 = var115;
            if(0 < var114.length) {
               if(var106 != null && (var106.length == 11 || -13 == ~var106.length)) {
                  ws.o = 74;
               }

               sfa.f_i = new Object[var114.length][];

               for(var20 = 0; sfa.f_i.length > var20; ++var20) {
                  Object[][] var121 = sfa.f_i;
                  if(null != var116 && 17 == var116.length) {
                     ((int[])((int[])wga.g[7]))[11] = 50;
                  }

                  var123 = new Object[4];
                  var26 = aqa.d;
                  int var27 = var114[var20];
                  byte[] var28 = qn.a(1, var27, (Object[])((Object[])var26[2]), 109);
                  var29 = gha.a((byte)123, new Object[2]);
                  bi.a(var29, jta.a((byte)-122, var28, new Object[3]), 0);
                  cma.a(var123, false);
                  var123[3] = var29;
                  if(var118 != null && 20 == var118.length) {
                     hma.a = 116L;
                  }

                  var123[2] = new Object[((Object[])((Object[])((Object[])((Object[])var123[3]))[0])).length][];

                  for(int var126 = 0; ~var126 > ~((Object[])((Object[])var123[2])).length; ++var126) {
                     ((Object[][])((Object[][])var123[2]))[var126] = cb.a(((Object[][])((Object[][])((Object[])((Object[])var123[3]))[0]))[var126], var118, 9316);
                  }

                  var121[var20] = var123;
               }
            }
         }

         if(ec.w == ela.g) {
            ov.a(nf.c, pf.a((byte)126), wga.g, 0);
         }

         if(ec.E == ela.g) {
            var4 = nla.a(18197);
            if(aqa.n != null) {
               var5 = aqa.n.length * 2;
            } else {
               var5 = 0;
            }

            if(var4 < var5) {
               return var4 * 100 / var5;
            }
         }

         if(ec.x == ela.g) {
            if(sfa.f_i != null && sfa.f_i.length > 0) {
               if(st.a(false, sfa.f_i[0]) < 100) {
                  return 0;
               }

               if(sfa.f_i.length > 1 && aaa.a((int)16777, aqa.d) && st.a(false, sfa.f_i[1]) < 100) {
                  return 0;
               }
            }

            ts.a(lna.g, 9016);
            de.a(true, lna.g);
            iea.a(16, (byte)-108);
         }

         if(ela.g == ec.B) {
            for(var4 = 0; var4 < 4; ++var4) {
               hj.f_i[var4] = oma.a(rp.c, wpa.a, 1);
            }

            if(null != var3 && (var3.length == 1 || 7 == var3.length)) {
               wsa.a((byte)-1);
            }
         }

         if(ec.p == ela.g) {
            lta.h = ppa.a(14150, 1, false, 8);
            bea.e = ppa.a(14150, 1, false, 0);
            oo.d = ppa.a(14150, 1, false, 1);
            ha.f_i = ppa.a(14150, 1, false, 2);
            if(null != var3 && 7 == var3.length && var3[4].equals(Integer.valueOf(2)) && var3[4].equals(Integer.valueOf(2))) {
               a(89);
            }

            sc.e = ppa.a(14150, 1, false, 3);
            ij.e = ppa.a(14150, 1, false, 4);
            oe.f = ppa.a(14150, 1, true, 5);
            vra.d = ppa.a(14150, 1, true, 6);
            dl.b = ppa.a(14150, 1, false, 7);
            wo.b = ppa.a(14150, 1, false, 9);
            oc.s = ppa.a(14150, 1, false, 10);
            nh.d = ppa.a(14150, 1, false, 11);
            ht.a = ppa.a(14150, 1, false, 12);
            bqa.h = ppa.a(14150, 1, false, 14);
            Class_f.b = ppa.a(14150, 1, false, 15);
            dn.a = ppa.a(14150, 1, false, 16);
            qb.b = ppa.a(14150, 1, false, 17);
            hn.b = ppa.a(14150, 1, false, 18);
            cba.a = ppa.a(14150, 1, false, 19);
            pja.f = ppa.a(14150, 1, false, 20);
            wn.c = ppa.a(14150, 1, false, 21);
            dh.e = ppa.a(14150, 1, false, 22);
            be.c = ppa.a(14150, 1, true, 23);
            bna.a = ppa.a(14150, 1, false, 24);
            eq.f_l = ppa.a(14150, 1, false, 25);
            lb.v = ppa.a(14150, 1, true, 26);
            ad.f = ppa.a(14150, 1, false, 27);
            si.f = ppa.a(14150, 1, true, 28);
            un.c = ppa.a(14150, 1, false, 29);
            nma.c = ppa.a(14150, 1, true, 35);
            fha.s = ppa.a(14150, 1, true, 30);
            nqa.d = ppa.a(14150, 1, true, 31);
            dra.g = ppa.a(14150, 2, true, 36);
         }

         if(ec.g == ela.g) {
            var4 = 0;

            for(var5 = 0; var5 < 37; ++var5) {
               if(null != bpa.d[var5]) {
                  var4 += rd.a(100, bpa.d[var5]) * ce.c[var5] / 100;
               }
            }

            if(100 != var4) {
               if(mka.d < 0) {
                  mka.d = var4;
               }

               return 100 * (-mka.d + var4) / (100 + -mka.d);
            }

            var88 = lta.h;
            cc.d = dla.a(var88, 125, "hitbar_default");
            mv.a = dla.a(var88, 97, "timerbar_default");
            coa.u = dla.a(var88, 124, "headicons_pk");
            jfa.a = dla.a(var88, 66, "headicons_prayer");
            ct.a = dla.a(var88, 71, "hint_headicons");
            vl.e = dla.a(var88, 51, "hint_mapmarkers");
            boa.x = dla.a(var88, 53, "mapflag");
            qi.f = dla.a(var88, 54, "cross");
            dra.j = dla.a(var88, 113, "mapdots");
            iha.c = dla.a(var88, 98, "scrollbar");
            psa.d = dla.a(var88, 89, "name_icons");
            kt.m = dla.a(var88, 99, "floorshadows");
            qra.f = dla.a(var88, 64, "compass");
            ee.e = dla.a(var88, 122, "otherlevel");
            ssa.h = dla.a(var88, 124, "hint_mapedge");
            ov.a(nf.c, pf.a((byte)126), lta.h, 0);
            if(var3 != null && (12 == var3.length || var3.length == 3 && var3[0].equals(Integer.valueOf(2)))) {
               aqa.d = null;
            }
         }

         if(ec.q == ela.g) {
            byte[] var93 = fd.a(-2, 4, si.f);
            if(var93 == null) {
               return 0;
            }

            eda.a((byte)53, var93);
            jea.a(34);
            iea.a(4, (byte)-89);
         }

         Object[] var96;
         if(ec.A == ela.g) {
            var96 = fha.s;
            var88 = null;
            eoa.g = var96;
            iu.a = "";
            hha.d = null;
            if(!ela.b.startsWith("win") && !ela.b.startsWith("windows 7")) {
               if(!ela.b.startsWith("linux")) {
                  if(ela.b.startsWith("mac")) {
                     iu.a = iu.a + "macos/";
                  }
               } else {
                  iu.a = iu.a + "linux/";
               }
            } else {
               iu.a = iu.a + "windows/";
            }

            if(hha.d != null && hha.d.k) {
               iu.a = iu.a + "msjava/";
            } else if(!ela.f.startsWith("amd64") && !ela.f.startsWith("x86_64")) {
               if(!ela.f.startsWith("i386") && !ela.f.startsWith("i486") && !ela.f.startsWith("i586") && !ela.f.startsWith("x86")) {
                  if(!ela.f.startsWith("ppc")) {
                     iu.a = iu.a + "universal/";
                  } else {
                     iu.a = iu.a + "ppc/";
                  }
               } else {
                  iu.a = iu.a + "x86/";
               }
            } else {
               iu.a = iu.a + "x86_64/";
            }
         }

         int var92;
         int var101;
         int var98;
         int var111;
         if(ec.h == ela.g) {
            label1449: {
               if(pp.I == 0) {
                  pp.a(pp.w, 28870, lr.a(-1, new Object[3], "jaclib"));
                  if(ya.a(-113, pp.a((int)4462, pp.w)) != 100) {
                     var4 = 1;
                     break label1449;
                  }

                  if(!qr.a(105, pp.a((int)4462, pp.w))) {
                     kqa.h.a(true);
                  }

                  pp.I = 1;
               }

               if(pp.I == 1) {
                  lna.d = pp.a(123);
                  pp.a(pp.u, 28870, lba.a(new Object[1], (byte)90, si.f));
                  pp.a(pp.B, 28870, lr.a(-1, new Object[3], "jaggl"));
                  pp.a(pp.L, 28870, lr.a(-1, new Object[3], "jagdx"));
                  pp.a(pp.M, 28870, lr.a(-1, new Object[3], "jagmisc"));
                  pp.a(pp.K, 28870, lr.a(-1, new Object[3], "sw3d"));
                  pp.a(pp.G, 28870, lr.a(-1, new Object[3], "hw3d"));
                  pp.a(pp.h, 28870, lr.a(-1, new Object[3], "jagtheora"));
                  pp.a(pp.e, 28870, lba.a(new Object[1], (byte)75, nqa.d));
                  pp.a(pp.q, 28870, lba.a(new Object[1], (byte)82, lb.v));
                  if(var3 != null && (var3.length == 3 || 2 == var3.length)) {
                     so.a(((boolean[])((boolean[])((Object[])((Object[])aqa.d[5]))[15]))[11], -23105);
                  }

                  pp.a(pp.E, 28870, lba.a(new Object[1], (byte)123, ha.f_i));
                  pp.a(pp.f_i, 28870, lba.a(new Object[1], (byte)111, dn.a));
                  pp.a(pp.c, 28870, lba.a(new Object[1], (byte)74, qb.b));
                  pp.a(pp.C, 28870, lba.a(new Object[1], (byte)75, hn.b));
                  pp.a(pp.n, 28870, lba.a(new Object[1], (byte)61, cba.a));
                  pp.a(pp.z, 28870, lba.a(new Object[1], (byte)118, pja.f));
                  pp.a(pp.O, 28870, lba.a(new Object[1], (byte)54, wn.c));
                  pp.a(pp.p, 28870, lba.a(new Object[1], (byte)112, dh.e));
                  pp.a(pp.A, 28870, lba.a(new Object[1], (byte)107, bna.a));
                  pp.a(pp.v, 28870, lba.a(new Object[1], (byte)115, eq.f_l));
                  pp.a(pp.m, 28870, lba.a(new Object[1], (byte)116, ad.f));
                  pp.a(pp.a, 28870, lba.a(new Object[1], (byte)127, un.c));
                  pp.a(pp.f, 28870, ama.a(-125, "huffman", oc.s, new Object[2]));
                  pp.a(pp.N, 28870, lba.a(new Object[1], (byte)55, sc.e));
                  pp.a(pp.F, 28870, lba.a(new Object[1], (byte)48, ht.a));
                  pp.a(pp.f_l, 28870, lba.a(new Object[1], (byte)91, nf.c));
                  var88 = pp.x;
                  var7 = new Object[4];
                  var95 = be.c;
                  var7[0] = var95;
                  var7[1] = "details";
                  pp.a(var88, 28870, var7);

                  for(var101 = 0; lna.d.length > var101; ++var101) {
                     if(null == pp.a((int)4462, lna.d[var101])) {
                        throw new RuntimeException();
                     }
                  }

                  var101 = 0;
                  Object[][] var105 = lna.d;

                  for(var11 = 0; var11 < var105.length; ++var11) {
                     var106 = var105[var11];
                     int var112 = pp.a(var106, (byte)97);
                     int var113 = ya.a(56, pp.a((int)4462, var106));
                     var101 += var112 * var113 / 100;
                  }

                  if(null != var95 && 4 == var95.length) {
                     fj.e = -87L;
                  }

                  dl.f = var101;
                  pp.I = 2;
               }

               if(lna.d == null) {
                  var4 = 100;
               } else {
                  var5 = 0;
                  var92 = 0;
                  boolean var94 = true;
                  if(var3 != null && var3.length == 4) {
                     uda.a(-6133);
                  }

                  Object[][] var100 = lna.d;

                  for(var101 = 0; ~var101 > ~var100.length; ++var101) {
                     var10 = var100[var101];
                     var11 = pp.a(var10, (byte)97);
                     var111 = ya.a(27, pp.a((int)4462, var10));
                     var5 += var11;
                     if(100 > var111) {
                        var94 = false;
                     }

                     var92 += var11 * var111 / 100;
                  }

                  if(var94) {
                     if(!qr.a(116, pp.a((int)4462, pp.M))) {
                        kqa.h.c((byte)-112);
                     }

                     if(!qr.a(124, pp.a((int)4462, pp.h))) {
                        ed.c = kqa.h.h(101);
                     }

                     lna.d = (Object[][])null;
                  }

                  var92 -= dl.f;
                  if(var3 != null && var3.length == 10 && var3[4].equals(Boolean.valueOf(false))) {
                     a(115);
                  }

                  var5 -= dl.f;
                  var98 = var5 > 0?100 * var92 / var5:100;
                  if(!var94 && 99 < var98) {
                     var98 = 99;
                  }

                  var4 = var98;
               }
            }

            if(100 > var4) {
               return var4;
            }

            byte[] var97 = fd.a(-2, 1, si.f);
            var7 = jta.a((byte)-111, var97, new Object[3]);

            while(true) {
               var98 = fh.a(var7, false);
               if(0 == var98) {
                  fk.j = tr.a(new Object[6], -12933, si.f);
                  rsa.b = (short[][])((short[][])fk.j[3]);
                  sfa.a = (short[][][])((short[][][])fk.j[2]);
                  hh.a = coa.a(76, si.f, new Object[4]);
                  tg.m = cda.a(9, new Object[8], si.f);
                  if(var3 != null && 8 == var3.length) {
                     ((long[])((long[])wga.g[0]))[1] = ((long[])((long[])ph.f[3]))[1];
                  }
                  break;
               }

               if(1 == var98) {
                  int[] var109 = oka.a = new int[6];
                  var109[0] = de.a((int)0, var7);
                  var109[1] = de.a((int)0, var7);
                  var109[2] = de.a((int)0, var7);
                  var109[3] = de.a((int)0, var7);
                  var109[4] = de.a((int)0, var7);
                  var109[5] = de.a((int)0, var7);
               }
            }
         }

         int var102;
         if(ec.D == ela.g) {
            if(~((int[])((int[])fk.j[1]))[5] != 0 && !Class_ss.a(0, 5, dl.b, ((int[])((int[])fk.j[1]))[5])) {
               return 99;
            }

            var88 = new Object[6];
            var90 = lb.v;
            var7 = wo.b;
            var95 = lta.h;
            client.b((int)1, var88);
            wu.a(var88, (int)-81);
            var88[5] = bia.b(-20, var88);
            var88[0] = var95;
            var88[2] = var7;
            Object[] var110 = jta.a((byte)-102, qn.a(0, 0, var90, 90), new Object[3]);
            ((int[])((int[])var88[1]))[0] = de.a((int)0, var110);
            var88[3] = new Object[((int[])((int[])var88[1]))[0]][];

            for(var102 = 0; ~var102 > ~((int[])((int[])var88[1]))[0]; ++var102) {
               if(fh.a(var110, false) == 1) {
                  Object[][] var108 = (Object[][])((Object[][])var88[3]);
                  var14 = new Object[4];
                  if(var14[1] == null) {
                     var14[1] = new int[3];
                  }

                  if(var14[2] == null) {
                     var14[2] = new short[1];
                  }

                  if(null == var14[0]) {
                     var14[0] = new byte[7];
                  }

                  if(var14[3] == null) {
                     var14[3] = new boolean[8];
                  }

                  var108[var102] = var14;
               }
            }

            for(var102 = 0; ((int[])((int[])var88[1]))[0] > var102; ++var102) {
               if(null != ((Object[][])((Object[][])var88[3]))[var102]) {
                  ((boolean[])((boolean[])((Object[][])((Object[][])var88[3]))[var102][3]))[7] = fh.a(var110, false) == 0;
               }
            }

            for(var102 = 0; ((int[])((int[])var88[1]))[0] > var102; ++var102) {
               if(((Object[][])((Object[][])var88[3]))[var102] != null) {
                  ((boolean[])((boolean[])((Object[][])((Object[][])var88[3]))[var102][3]))[4] = fh.a(var110, false) == 1;
               }
            }

            for(var102 = 0; ~var102 > ~((int[])((int[])var88[1]))[0]; ++var102) {
               if(((Object[][])((Object[][])var88[3]))[var102] != null) {
                  ((boolean[])((boolean[])((Object[][])((Object[][])var88[3]))[var102][3]))[3] = fh.a(var110, false) == 1;
               }
            }

            for(var102 = 0; ((int[])((int[])var88[1]))[0] > var102; ++var102) {
               if(((Object[][])((Object[][])var88[3]))[var102] != null) {
                  ((byte[])((byte[])((Object[][])((Object[][])var88[3]))[var102][0]))[1] = ipa.a(var110, (int)-100);
               }
            }

            for(var102 = 0; ((int[])((int[])var88[1]))[0] > var102; ++var102) {
               if(null != ((Object[][])((Object[][])var88[3]))[var102]) {
                  ((byte[])((byte[])((Object[][])((Object[][])var88[3]))[var102][0]))[3] = ipa.a(var110, (int)-93);
               }
            }

            for(var102 = 0; var102 < ((int[])((int[])var88[1]))[0]; ++var102) {
               if(((Object[][])((Object[][])var88[3]))[var102] != null) {
                  ((byte[])((byte[])((Object[][])((Object[][])var88[3]))[var102][0]))[4] = ipa.a(var110, (int)-103);
               }
            }

            if(null != var110 && var110.length == 14 && var110[0].equals(Integer.valueOf(2))) {
               ((boolean[])((boolean[])eoa.b[31]))[8] = true;
            }

            for(var102 = 0; ((int[])((int[])var88[1]))[0] > var102; ++var102) {
               if(null != ((Object[][])((Object[][])var88[3]))[var102]) {
                  ((byte[])((byte[])((Object[][])((Object[][])var88[3]))[var102][0]))[0] = ipa.a(var110, (int)-126);
               }
            }

            for(var102 = 0; ((int[])((int[])var88[1]))[0] > var102; ++var102) {
               if(((Object[][])((Object[][])var88[3]))[var102] != null) {
                  ((short[])((short[])((Object[][])((Object[][])var88[3]))[var102][2]))[0] = (short)de.a((int)0, var110);
               }
            }

            for(var102 = 0; ~var102 > ~((int[])((int[])var88[1]))[0]; ++var102) {
               if(null != ((Object[][])((Object[][])var88[3]))[var102]) {
                  ((byte[])((byte[])((Object[][])((Object[][])var88[3]))[var102][0]))[5] = ipa.a(var110, (int)-124);
               }
            }

            for(var102 = 0; ((int[])((int[])var88[1]))[0] > var102; ++var102) {
               if(null != ((Object[][])((Object[][])var88[3]))[var102]) {
                  ((byte[])((byte[])((Object[][])((Object[][])var88[3]))[var102][0]))[6] = ipa.a(var110, (int)-97);
               }
            }

            for(var102 = 0; var102 < ((int[])((int[])var88[1]))[0]; ++var102) {
               if(null != ((Object[][])((Object[][])var88[3]))[var102]) {
                  ((boolean[])((boolean[])((Object[][])((Object[][])var88[3]))[var102][3]))[6] = fh.a(var110, false) == 1;
               }
            }

            for(var102 = 0; ((int[])((int[])var88[1]))[0] > var102; ++var102) {
               if(((Object[][])((Object[][])var88[3]))[var102] != null) {
                  ((boolean[])((boolean[])((Object[][])((Object[][])var88[3]))[var102][3]))[2] = -2 == ~fh.a(var110, false);
               }
            }

            for(var102 = 0; ~var102 > ~((int[])((int[])var88[1]))[0]; ++var102) {
               if(((Object[][])((Object[][])var88[3]))[var102] != null) {
                  ((byte[])((byte[])((Object[][])((Object[][])var88[3]))[var102][0]))[2] = ipa.a(var110, (int)-106);
               }
            }

            for(var102 = 0; var102 < ((int[])((int[])var88[1]))[0]; ++var102) {
               if(null != ((Object[][])((Object[][])var88[3]))[var102]) {
                  ((boolean[])((boolean[])((Object[][])((Object[][])var88[3]))[var102][3]))[1] = fh.a(var110, false) == 1;
               }
            }

            for(var102 = 0; ((int[])((int[])var88[1]))[0] > var102; ++var102) {
               if(null != ((Object[][])((Object[][])var88[3]))[var102]) {
                  ((boolean[])((boolean[])((Object[][])((Object[][])var88[3]))[var102][3]))[5] = 1 == fh.a(var110, false);
               }
            }

            for(var102 = 0; ((int[])((int[])var88[1]))[0] > var102; ++var102) {
               if(((Object[][])((Object[][])var88[3]))[var102] != null) {
                  ((boolean[])((boolean[])((Object[][])((Object[][])var88[3]))[var102][3]))[0] = fh.a(var110, false) == 1;
               }
            }

            for(var102 = 0; ~var102 > ~((int[])((int[])var88[1]))[0]; ++var102) {
               if(null != ((Object[][])((Object[][])var88[3]))[var102]) {
                  ((int[])((int[])((Object[][])((Object[][])var88[3]))[var102][1]))[1] = fh.a(var110, false);
               }
            }

            for(var102 = 0; var102 < ((int[])((int[])var88[1]))[0]; ++var102) {
               if(null != ((Object[][])((Object[][])var88[3]))[var102]) {
                  ((int[])((int[])((Object[][])((Object[][])var88[3]))[var102][1]))[2] = lr.a(1, var110);
               }
            }

            for(var102 = 0; var102 < ((int[])((int[])var88[1]))[0]; ++var102) {
               if(null != ((Object[][])((Object[][])var88[3]))[var102]) {
                  ((int[])((int[])((Object[][])((Object[][])var88[3]))[var102][1]))[0] = fh.a(var110, false);
               }
            }

            uf.f = (qa)(var88 != null?var88[5]:null);
            bm.c = ah.a(dp.y, ha.f_i, fsa.g, new Object[2], (byte)87);
            cq.f_i = qja.a(dp.y, hh.a, fsa.g, new Object[3], 32, ha.f_i);
            ena.e = dd.a(ha.f_i, false, fsa.g, lta.h, new Object[4], dp.y);
            var10 = new Object[2];
            var104 = qb.b;
            var10[0] = sj.a(128, new Object[3], (byte)-128);
            var10[1] = var104;
            if(null != var10[1]) {
               var111 = -1 + oh.a((Object[])((Object[])var10[1]), (byte)104);
               jla.a((Object[])((Object[])var10[1]), (byte)-98, var111);
            }

            de.g = var10;
            var13 = new Object[3];
            var14 = ha.f_i;
            if(null == var13[1]) {
               var13[1] = new int[2];
            }

            eta.a((byte)56, var13);
            var13[2] = var14;
            ((int[])((int[])var13[1]))[1] = jla.a((Object[])((Object[])var13[2]), (byte)80, 4);
            bca.F = var13;
            var115 = new Object[2];
            var116 = fsa.g;
            var117 = ha.f_i;
            var115[0] = sj.a(128, new Object[3], (byte)-31);
            var115[1] = var117;
            jla.a((Object[])((Object[])var115[1]), (byte)54, 1);
            tfa.d = var115;
            Object[] var120 = new Object[4];
            Object[] var122 = ha.f_i;
            Object[] var119 = lta.h;
            var120[0] = sj.a(20, new Object[3], (byte)-54);
            var120[2] = sj.a(64, new Object[3], (byte)-105);
            var120[1] = var119;
            var120[3] = var122;
            jla.a((Object[])((Object[])var120[3]), (byte)-77, 46);
            lv.w = var120;
            var123 = new Object[3];
            Object[] var125 = ha.f_i;
            var26 = dl.b;
            moa.a(var123, 87);
            var123[2] = var26;
            var123[1] = var125;
            jla.a((Object[])((Object[])var123[1]), (byte)-111, 3);
            im.a = var123;
            gna.a = aqa.a(fsa.g, ha.f_i, new Object[2], 3, dp.y);
            qja.f_l = gj.a(fsa.g, new Object[2], ha.f_i, 1550, dp.y);
            lja.d = io.a((byte)-117, fsa.g, true, dl.b, dp.y, new Object[10], dn.a);
            Object[] var124 = new Object[4];
            var29 = ha.f_i;
            Object[] var30 = lta.h;
            bh.a(64, var124);
            var124[2] = var29;
            var124[0] = var30;
            jla.a((Object[])((Object[])var124[2]), (byte)74, 36);
            oe.g = var124;
            Object[] var32 = new Object[4];
            Object[] var33 = ha.f_i;
            Object[] var34 = lta.h;
            var32[2] = sj.a(64, new Object[3], (byte)-120);
            var32[0] = sj.a(64, new Object[3], (byte)-85);
            var32[3] = var33;
            var32[1] = var34;
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            jla.a((Object[])((Object[])var32[3]), (byte)107, 34);
            rka.d = var32;
            Object[] var36 = new Object[9];
            Object[] var37 = fsa.g;
            int var38 = dp.y;
            Object[] var39 = hn.b;
            Object[] var40 = dl.b;
            mca.a((int)4971, var36);
            tja.a(var36, (int)50);
            var36[3] = var37;
            if(null != var37 && -2 == ~var37.length && var37[0].equals(Boolean.valueOf(false))) {
               uda.a(-6133);
            }

            ((boolean[])((boolean[])var36[8]))[0] = true;
            var36[5] = var40;
            var36[2] = var39;
            ((int[])((int[])var36[1]))[1] = var38;
            if(var36[2] != null) {
               int var41 = -1 + oh.a((Object[])((Object[])var36[2]), (byte)104);
               jla.a((Object[])((Object[])var36[2]), (byte)117, var41);
            }

            if(var36[3] != uha.g) {
               var36[0] = new String[]{null, null, null, null, null, null};
            } else {
               var36[0] = new String[]{null, null, null, null, null, gj.a(((int[])((int[])var36[1]))[1], 111, gj.f_pb)};
            }

            nt.f_i = var36;
            cqa.a = ed.a(dl.b, bm.c, dp.y, true, fsa.g, 2617, cba.a, new Object[12]);
            ib.g = qj.a(fsa.g, new Object[2], dp.y, 103, ha.f_i);
            he.b = la.a(dp.y, fsa.g, oo.d, (byte)38, bea.e, new Object[3], pja.f);
            Object[] var42 = new Object[2];
            Object[] var43 = ha.f_i;
            var42[0] = sj.a(16, new Object[3], (byte)-118);
            var42[1] = var43;
            jla.a((Object[])((Object[])var42[1]), (byte)-88, 29);
            ura.a = var42;
            ira.f = la.a(fsa.g, ha.f_i, 1, new Object[2], dp.y);
            Object[] var45 = new Object[5];
            Object[] var46 = wn.c;
            Object[] var47 = dl.b;
            if(null == var45[1]) {
               var45[1] = new int[1];
            }

            bna.a(var45, true);
            var45[2] = var47;
            var45[3] = var46;
            int var48 = oh.a((Object[])((Object[])var45[3]), (byte)104) - 1;
            jla.a((Object[])((Object[])var45[3]), (byte)10, var48);
            dfa.a = var45;
            Object[] var49 = new Object[2];
            Object[] var50 = ha.f_i;
            ka.a(var49, 118);
            var49[1] = var50;
            jla.a((Object[])((Object[])var49[1]), (byte)-98, 26);
            lw.d = var49;
            mla.c = sga.a(new Object[2], (byte)72, dp.y, ha.f_i, fsa.g);
            tfa.c = lha.a(-99, new Object[3], fsa.g, ha.f_i, dp.y);
            fv.d = poa.a(fsa.g, -105, dh.e, new Object[2], dp.y);
            nb.g = nqa.a(ha.f_i, 1, dp.y, fsa.g, new Object[3]);
            Object[] var52 = new Object[2];
            Object[] var53 = ha.f_i;
            gua.a(var52, 0);
            var52[1] = var53;
            if(var52[1] != null) {
               jla.a((Object[])((Object[])var52[1]), (byte)-128, 24);
            }

            jv.g = var52;
            Object[] var55 = new Object[2];
            Object[] var56 = ha.f_i;
            or.a(var55, (int)-114);
            var55[1] = var56;
            if(var55[1] != null) {
               jla.a((Object[])((Object[])var55[1]), (byte)119, 25);
            }

            et.c = var55;
            Object[] var58 = new Object[3];
            if(var120 != null && (var120.length == 29 && var120[13].equals(Boolean.valueOf(false)) && var120[13].equals(Integer.valueOf(2)) || 3 == var120.length)) {
               pv.a((byte)36);
            }

            Object[] var59 = ha.f_i;
            rb.a(1, var58);
            dl.a(0, var58);
            var58[2] = var59;
            if(var58[2] != null) {
               ((int[])((int[])var58[1]))[0] = jla.a((Object[])((Object[])var58[2]), (byte)9, 47);
            } else {
               ((int[])((int[])var58[1]))[0] = 0;
            }

            cr.c = var58;
            kw.b = qsa.a((byte)-119, dp.y, new Object[2], ha.f_i, fsa.g);
            Object[] var60 = sc.e;
            Object[] var61 = dl.b;
            Object[] var62 = lta.h;
            bda.d = var60;
            Class_a.a = var62;
            pt.c = var61;
            hca.f = new Object[oh.a(bda.d, (byte)104)][];
            cb.n = new boolean[oh.a(bda.d, (byte)104)];
            fh.a(-8, un.c);
            aaa.f = si.a(bna.a, dp.y, new Object[3], (byte)93, eq.f_l);
            Object[] var63 = new Object[5];
            int var64 = dp.y;
            Object[] var67 = bna.a;
            Object[] var71 = eq.f_l;
            pt.b = eja.a(var64, var67, of.a(80, new Object[0]), var71, var63, (byte)85);
            int[] var72 = new int[((int[])((int[])cqa.a[1]))[0]];
            int var73 = 0;

            int var74;
            for(var74 = 0; ~var74 > ~((int[])((int[])cqa.a[1]))[0]; ++var74) {
               Object[] var75 = us.a(var74, (byte)105, cqa.a);
               if(0 <= ((int[])((int[])var75[1]))[21] || ((int[])((int[])var75[1]))[1] >= 0) {
                  var72[var73++] = var74;
               }
            }

            if(null != var116 && 4 == var116.length) {
               uda.a(-6133);
            }

            hj.c = new int[var73];

            for(var74 = 0; var73 > var74; ++var74) {
               hj.c[var74] = var72[var74];
            }

            ira.a(lja.d, -1 == ~qga.b((Object[])((Object[])tu.d[14]), 13687), (byte)79);
            eo.g = kja.a(9548, new Object[3]);
            iea.a((byte)39);
            ooa.a(he.b, (int)3);
            mka.a((int)1024, ad.f);
            jw.a(uf.f, dl.b, (byte)-74);
            Object[] var128 = rc.a(3876, new Object[3], sra.a("huffman", oc.s, "", true));
            ns.a((int)3810, var128);

            try {
               jagmisc.init();
            } catch (Throwable var82) {
               ;
            }

            Object var127;
            try {
               var127 = new kn();
            } catch (Throwable var85) {
               Object[] var76 = new Object[4];
               if(null == var76[0]) {
                  var76[0] = new long[3];
               }

               if(var76[1] == null) {
                  var76[1] = new int[2];
               }

               ((int[])((int[])var76[1]))[0] = 1;
               ((long[])((long[])var76[0]))[0] = 0L;
               ((long[])((long[])var76[0]))[1] = 0L;
               var76[2] = new long[10];
               ((int[])((int[])var76[1]))[1] = 0;
               ((long[])((long[])var76[0]))[2] = 0L;
               cb var78 = new cb(var76);
               var76[3] = var78;
               ((long[])((long[])var76[0]))[1] = System.nanoTime();
               ((long[])((long[])var76[0]))[2] = System.nanoTime();
               var127 = (cq)(var76 == null?null:var76[3]);
            }

            ija.d = (cq)var127;
            mca.g = ena.a(true, new Object[7], 14);
         }

         if(ela.g == ec.n) {
            var88 = lta.h;
            var92 = 0;
            if(hp.a(-126, var88, cc.d)) {
               ++var92;
            }

            if(hp.a(-127, var88, mv.a)) {
               ++var92;
            }

            if(hp.a(-127, var88, coa.u)) {
               ++var92;
            }

            if(hp.a(-126, var88, jfa.a)) {
               ++var92;
            }

            if(hp.a(-128, var88, ct.a)) {
               ++var92;
            }

            if(hp.a(-128, var88, vl.e)) {
               ++var92;
            }

            if(hp.a(-127, var88, boa.x)) {
               ++var92;
            }

            if(hp.a(-126, var88, qi.f)) {
               ++var92;
            }

            if(hp.a(-126, var88, dra.j)) {
               ++var92;
            }

            if(hp.a(-128, var88, iha.c)) {
               ++var92;
            }

            if(hp.a(-126, var88, psa.d)) {
               ++var92;
            }

            if(hp.a(-125, var88, kt.m)) {
               ++var92;
            }

            if(null != var88 && (var88.length == 3 && var88[1].equals(Boolean.valueOf(false)) || 1 == var88.length || 1 == var88.length)) {
               sfa.f_i = (Object[][])((Object[][])wga.g[1]);
            }

            if(hp.a(-127, var88, qra.f)) {
               ++var92;
            }

            if(hp.a(-127, var88, ee.e)) {
               ++var92;
            }

            if(hp.a(-124, var88, ssa.h)) {
               ++var92;
            }

            var92 += js.a(true, -1332625561);
            var91 = oc.a(15);
            if(null != aqa.n) {
               var98 = aqa.n.length * 2;
            } else {
               var98 = 0;
            }

            var101 = var91 + var98;
            if(var101 > var92) {
               return 100 * var92 / var101;
            }
         }

         if(ec.c == ela.g) {
            eka.a(be.c, bca.F, tfa.d, lja.d, oe.g, rka.d, eo.g);
         }

         if(ec.r == ela.g) {
            nt.e = new boolean[((int[])((int[])tfa.c[1]))[0]];
            hg.f = new int[((int[])((int[])tfa.c[1]))[0]];
            if(null != var3 && -15 == ~var3.length && var3[4].equals(Integer.valueOf(0)) && var3[4].equals(Integer.valueOf(0))) {
               eda.a((byte)53, (byte[])((byte[])aqa.d[0]));
            }

            cna.a = new String[((int[])((int[])mla.c[1]))[0]];

            for(var4 = 0; ~var4 > ~((int[])((int[])tfa.c[1]))[0]; ++var4) {
               if(0 == ((int[])((int[])hr.a(var4, 0, tfa.c)[1]))[0]) {
                  nt.e[var4] = true;
                  ++sga.d;
               }

               hg.f[var4] = -1;
            }

            var96 = null;

            try {
               var96 = ug.a("2", (String)fsa.g[2], 3, false);
               byte[] var103 = new byte[(int)oca.a(true, var96)];
               if(null != var96 && (var96.length == 7 && var96[4].equals(Integer.valueOf(0)) || var96.length == 25)) {
                  ((int[])((int[])ela.g[0]))[2] = -44;
               }

               for(var92 = 0; var103.length > var92; var92 += var91) {
                  var91 = bpa.a(-var92 + var103.length, (byte)34, var96, var103, var92);
                  if(-1 == var91) {
                     throw new IOException();
                  }
               }

               var7 = jta.a((byte)-98, var103, new Object[3]);
               if(-((int[])((int[])var7[1]))[0] + ((byte[])((byte[])var7[2])).length >= 1) {
                  var98 = fh.a(var7, false);
                  if(var7 != null && var7.length == 2 && var7[0].equals(Integer.valueOf(0)) && var7[0].equals(Integer.valueOf(1))) {
                     a(96);
                  }

                  if(0 <= var98 && var98 <= 1 && ((byte[])((byte[])var7[2])).length + -((int[])((int[])var7[1]))[0] >= 2) {
                     var101 = de.a((int)0, var7);
                     if(6 * var101 <= -((int[])((int[])var7[1]))[0] + ((byte[])((byte[])var7[2])).length) {
                        for(var102 = 0; var101 > var102; ++var102) {
                           var11 = de.a((int)0, var7);
                           var111 = lr.a(1, var7);
                           if(var11 < hg.f.length && nt.e[var11] && (49 != ((char[])((char[])hr.a(var11, 0, tfa.c)[0]))[0] || ~var111 <= 0 && var111 <= 1)) {
                              hg.f[var11] = var111;
                           }
                        }
                     }
                  }
               }
            } catch (Exception var84) {
               ;
            }

            try {
               if(var96 != null) {
                  it.a(var96, false);
               }
            } catch (Exception var81) {
               ;
            }

            mk.a(true, 3, false, oe.f);
            mk.a(true, 3, true, vra.d);
            mk.a(true, 3, true, lta.h);
            mk.a(true, 3, true, nf.c);
            mk.a(true, 3, true, oc.s);
            ((int[])((int[])ha.f_i[1]))[0] = 2;
            kca.a = true;
            ((int[])((int[])qb.b[1]))[0] = 2;
            ((int[])((int[])dn.a[1]))[0] = 2;
            ((int[])((int[])hn.b[1]))[0] = 2;
            ((int[])((int[])cba.a[1]))[0] = 2;
            ((int[])((int[])pja.f[1]))[0] = 2;
            ((int[])((int[])wn.c[1]))[0] = 2;
         }

         if(ec.f_l == ela.g) {
            if(!fh.a(((int[])((int[])fk.j[1]))[1], 25401, (int[])null)) {
               return 0;
            }

            if(var3 != null && var3.length == 1 && var3[0].equals(Integer.valueOf(1))) {
               ((byte[])((byte[])wga.g[0]))[15] = -98;
            }

            var89 = true;

            for(var5 = 0; var5 < ((Object[])((Object[])hca.f[((int[])((int[])fk.j[1]))[1]][2])).length; ++var5) {
               var90 = ((Object[][])((Object[][])hca.f[((int[])((int[])fk.j[1]))[1]][2]))[var5];
               if(5 == ((int[])((int[])var90[1]))[18] && 0 != ~((int[])((int[])var90[1]))[57] && !Class_ss.a(0, 5, lta.h, ((int[])((int[])var90[1]))[57])) {
                  var89 = false;
               }
            }

            if(!var89) {
               return 0;
            }
         }

         if(var3 != null && (var3.length == 4 || var3.length == 2)) {
            uda.a(-6133);
         }

         if(ec.f_i == ela.g) {
            vma.a(true, 74);
         }

         if(ec.f == ela.g) {
            var96 = eoa.b;
            ((boolean[])((boolean[])var96[2]))[1] = true;

            try {
               tia.k.join();
            } catch (InterruptedException var80) {
               return 0;
            }

            sfa.f_i = (Object[][])null;
            eoa.b = null;
            aqa.d = null;
            wga.g = null;
            tia.k = null;
            ph.f = null;
            kb.a(2);
            var90 = (Object[])((Object[])tu.d[15]);
            var5 = ((int[])((int[])var90[1]))[0];
            Class_ls.f_l = var5 == 1;
            if(null != var3 && var3.length == 17 && var3[7].equals(Integer.valueOf(2)) && var3[7].equals(Integer.valueOf(0))) {
               uda.a(-6133);
            }

            ih.a(tu.d, (Object[])((Object[])tu.d[15]), 1, -39);
            if(Class_ls.f_l) {
               ih.a(tu.d, (Object[])((Object[])tu.d[21]), 0, -50);
            } else if(((boolean[])((boolean[])((Object[])((Object[])tu.d[21]))[3]))[1] && 512 > ((int[])((int[])mca.g[1]))[5] && ((int[])((int[])mca.g[1]))[5] != 0) {
               ih.a(tu.d, (Object[])((Object[])tu.d[21]), 0, -50);
            }

            uk.a((byte)110);
            if(Class_ls.f_l) {
               lg.a(false, 0, (byte)-80);
            } else {
               lg.a(false, bg.a(true, (Object[])((Object[])tu.d[21])), (byte)-62);
            }

            bsa.a((byte)-122, false, -1, -1, Class_m.a((Object[])((Object[])tu.d[40]), -23352));
            ts.a(lna.g, 9016);
            de.a(true, lna.g);
            mc.a(lta.h, (byte)65, lna.g);
            la.a(jp.m, 90);
         }

         if(var0 < 86) {
            newIAS3I1Wrapper(new Object[3]);
         }

         var5 = ((int[])((int[])ela.g[1]))[0];
         if(~var5 > ~(nv.c.length - 1)) {
            ela.g = nv.c[var5 + 1];
         }

         byte var107 = 100;
         return var107;
      } catch (RuntimeException var86) {
         throw vt.a(var86, "ana.C(" + var0 + ')');
      }
   }

}
