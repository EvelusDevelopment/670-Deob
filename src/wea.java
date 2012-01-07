import jaggl.OpenGL;
import java.util.Random;

final class wea extends gv {

   static Object[] p = sd.a(new Object[1], 31, (byte)119);
   static int B;
   static int m;
   static int t;
   static int w;
   static int C;
   static int n;
   static int r;
   static int v;
   static int o;
   static int A;
   static int s;
   static int z;
   static int y;
   static int x;
   private Object[] k;
   static int q;
   static int u;
   static int[] f_l;


   final int a(int var1, int var2) {
      ++n;
      Object[] var4 = this.k;
      if(var4 != null) {
         int var3 = ew.a((byte)94, var4, var2, var1);
         if(client.f_vb == 0) {
            return var3;
         }
      }

      throw new IllegalStateException();
   }

   static final void b(int var0, Object[] var1) {
      ++C;
      if(null != var1[2]) {
         if(var0 != 9) {
            a(2, 52, ((float[])((float[])var1[5]))[2], 24, -1.0900615F, -1.2769029F, 1.3518347F, (Object[])((Object[])p[3]), (Class_s)null, ((int[])((int[])var1[0]))[1], 1.324191F, 0.85642004F);
         }

         ((lm)var1[2]).a((byte)39);
         var1[2] = null;
      } else {
         throw new IllegalStateException();
      }
   }

   final boolean b() {
      ++z;
      return ft.b(this.k, (byte)116);
   }

   static final void b(Object[] var0, int var1) {
      if(null == var0[8]) {
         var0[8] = new boolean[5];
      }

      int var2 = -96 % ((var1 - 27) / 50);
      ++A;
      if(null == var0[12]) {
         var0[12] = new int[11];
      }

   }

   static final void a(Object[] var0, byte var1) {
      try {
         ++r;
         Object[] var15 = (Object[])((Object[])lba.f[4]);
         int var17;
         int var16;
         int var19;
         int var18;
         int var21;
         int var20;
         int var23;
         int var22;
         int var25;
         if(csa.c != var0) {
            int var41;
            if(var0 != je.b) {
               int var27;
               int var26;
               int var31;
               int var30;
               Object[] var40;
               int var48;
               if(bqa.k != var0) {
                  int var49;
                  if(mm.a == var0) {
                     var16 = fh.a(var15, false);
                     var17 = kla.h * 2 + ((var16 & 250) >> 4);
                     var18 = 2 * tl.d + (var16 & 15);
                     var19 = fh.a(var15, false);
                     boolean var39 = 0 != (var19 & 1);
                     boolean var38 = 0 != (2 & var19);
                     var22 = !var38?-1:var19 >> 2;
                     var23 = ipa.a(var15, (int)-86) + var17;
                     var41 = var18 + ipa.a(var15, (int)-92);
                     var25 = jia.c(-8166, var15);
                     var26 = jia.c(-8166, var15);
                     var27 = de.a((int)0, var15);
                     var49 = fh.a(var15, false);
                     if(!var38) {
                        var49 *= 4;
                     } else {
                        var49 = (byte)var49;
                     }

                     if(var15 != null && 5 == var15.length) {
                        mw.a(((int[])((int[])((Object[])((Object[])((Object[])((Object[])Class_f.b[5]))[0]))[2]))[0], ((int[])((int[])pja.f[7]))[5], true, ((boolean[])((boolean[])tfa.d[5]))[2], -24, ((int[])((int[])po.f_i[10]))[12], 127, -21, ((int[])((int[])((Object[])((Object[])os.k[1]))[8]))[0]);
                     }

                     var48 = 4 * fh.a(var15, false);
                     var30 = de.a((int)0, var15);
                     var31 = de.a((int)0, var15);
                     int var32 = fh.a(var15, false);
                     if(var32 == 255) {
                        var32 = -1;
                     }

                     int var33 = de.a((int)0, var15);
                     if(0 <= var17 && 0 <= var18 && 2 * rp.c > var17 && var18 < rp.c * 2 && 0 <= var23 && var41 >= 0 && ~var23 > ~(2 * wpa.a) && ~var41 > ~(wpa.a * 2) && '\uffff' != var27) {
                        var48 <<= 2;
                        var33 <<= 2;
                        var17 *= 256;
                        var18 = 256 * var18;
                        var49 <<= 2;
                        var41 *= 256;
                        var23 = 256 * var23;
                        lta.a(var31, var41, var49, var25, var30, var26, var48, var27, var32, var17, 62, var23, var39, var22, var33, var18);
                     }

                  } else if(var0 != nb.f) {
                     Object[] var43;
                     if(fk.o == var0) {
                        var16 = fh.a(var15, false);
                        var17 = kla.h + ((var16 & 120) >> 4);
                        var18 = (var16 & 7) + tl.d;
                        var19 = de.a((int)0, var15);
                        if(var19 == '\uffff') {
                           var19 = -1;
                        }

                        var20 = fh.a(var15, false);
                        var21 = de.a((int)0, var15);
                        var22 = fh.a(var15, false);
                        if(0 <= var17 && 0 <= var18 && var17 < rp.c && var18 < wpa.a) {
                           if(-1 == var19) {
                              ag var7;
                              var40 = null == (var7 = (ag)pba.a(hi.c, 27753, (long)(var18 | var17 << 16)))?null:var7.v;
                              if(var40 != null) {
                                 Object[] var44 = (Object[])((Object[])var40[1]);
                                 if(null != var44[19]) {
                                    ((ch)var44[19]).d();
                                 }

                                 ((lm)(null == var40?null:var40[0])).a((byte)48);
                              }
                           } else {
                              var23 = var17 * 512 + 256;
                              var41 = 512 * var18 + 256;
                              var25 = pta.d;
                              if(null != var15 && -6 == ~var15.length && var15[2].equals(Integer.valueOf(2))) {
                                 dfa.a[0] = null;
                              }

                              if(var25 < 3 && fr.a(var18, var17, (byte)51)) {
                                 ++var25;
                              }

                              var43 = new Object[20];
                              var48 = pta.d;
                              Object[] var51 = tha.a(Class_ds.a(pta.d, var23, var41, (byte)122) - var20, var21, var48, var17, var23, var22, 12, var18, false, var25, var41, var18, var19, var17, var43);
                              Object[] var9;
                              wf.a((long)(var18 | var17 << 16), -103, hi.c, (lm)((var9 = kd.a(var51, new Object[2], -100)) == null?null:var9[0]));
                           }
                        }

                        if(var15 != null && -7 == ~var15.length) {
                           cja.a((Object[])null, -30323);
                        }

                     } else if(bca.y != var0) {
                        if(var0 != rl.r) {
                           var16 = 23 / ((30 - var1) / 36);
                           if(qba.b == var0) {
                              fh.a(var15, false);
                              var17 = fh.a(var15, false);
                              var18 = ((var17 & 124) >> 4) + kla.h;
                              var19 = tl.d + (7 & var17);
                              var20 = de.a((int)0, var15);
                              if(var0 != null && -6 == ~var0.length && var0[1].equals(Integer.valueOf(2))) {
                                 wha.e = (Random)lw.d[1];
                              }

                              var21 = fh.a(var15, false);
                              var22 = td.a(var15, 80);
                              String var46 = ara.b((byte)61, var15);
                              de.a(var18, 9677, pta.d, var19, var21, var20, var46, var22);
                           } else if(tg.q != var0) {
                              if(ve.a == var0) {
                                 var17 = fh.a(var15, false);
                                 var18 = var17 >> 2;
                                 var19 = var17 & 3;
                                 var20 = caa.c[var18];
                                 var21 = ro.a(var15, -80);
                                 var22 = (var21 >> 4 & 7) + kla.h;
                                 var23 = (7 & var21) + tl.d;
                                 if(wha.a((byte)-77, rq.c) || var22 >= 0 && var23 >= 0 && var22 < rp.c && wpa.a > var23) {
                                    nfa.a(var19, var18, true, pta.d, var22, var20, -1, var23);
                                 }

                              } else if(var0 == vn.d) {
                                 var17 = fh.a(var15, false);
                                 var18 = ((var17 & 112) >> 4) + kla.h;
                                 var19 = tl.d + (var17 & 7);
                                 var20 = de.a((int)0, var15);
                                 if(var20 == '\uffff') {
                                    var20 = -1;
                                 }

                                 var21 = fh.a(var15, false);
                                 var22 = (255 & var21) >> 4;
                                 var23 = 7 & var21;
                                 var41 = fh.a(var15, false);
                                 var25 = fh.a(var15, false);
                                 var26 = de.a((int)0, var15);
                                 if(var18 >= 0 && 0 <= var19 && rp.c > var18 && var19 < wpa.a) {
                                    var27 = var22 - -1;
                                    if(~(-var27 + var18) >= ~((int[])((int[])uta.g[33]))[0] && var18 + var27 >= ((int[])((int[])uta.g[33]))[0] && var19 + -var27 <= ((int[])((int[])uta.g[14]))[0] && ((int[])((int[])uta.g[14]))[0] <= var27 + var19) {
                                       br.a(var26, var22 + (var19 << 8) + (pta.d << 24) + (var18 << 16), var41, var23, var25, 12, var20);
                                    }
                                 }

                              } else if(ria.c != var0) {
                                 if(gr.b == var0) {
                                    var17 = lr.a(1, var15);
                                    var18 = fh.a(var15, false);
                                    hua.a((byte)65, var18, mca.a(true, var17, lja.d));
                                 } else if(var0 != rba.g) {
                                    taa.a(new RuntimeException(), 32, "" + var0);
                                    hna.a(-128, false);
                                 } else {
                                    var17 = fh.a(var15, false);
                                    boolean var35 = -1 != ~(var17 & 128);
                                    var19 = kla.h + ((61 & var17) >> 3);
                                    var20 = (7 & var17) + tl.d;
                                    var21 = ipa.a(var15, (int)-86) + var19;
                                    var22 = ipa.a(var15, (int)-115) + var20;
                                    var23 = jia.c(-8166, var15);
                                    var41 = de.a((int)0, var15);
                                    var25 = fh.a(var15, false) * 4;
                                    var26 = 4 * fh.a(var15, false);
                                    var27 = de.a((int)0, var15);
                                    var49 = de.a((int)0, var15);
                                    var48 = fh.a(var15, false);
                                    var30 = de.a((int)0, var15);
                                    if(var48 == 255) {
                                       var48 = -1;
                                    }

                                    if(0 <= var19 && var20 >= 0 && var19 < rp.c && wpa.a > var20 && 0 <= var21 && var22 >= 0 && var21 < rp.c && var22 < wpa.a && '\uffff' != var41) {
                                       var25 <<= 2;
                                       if(null != var15 && 2 == var15.length && var15[0].equals(Integer.valueOf(1))) {
                                          cd.a(-1, -95, ((int[])((int[])((Object[])((Object[])((Object[])((Object[])cua.c[3]))[4]))[1]))[14], -48, -3, -125, 38);
                                       }

                                       var22 = 512 * var22 + 256;
                                       var19 = 256 + 512 * var19;
                                       var26 <<= 2;
                                       var30 <<= 2;
                                       var21 = var21 * 512 + 256;
                                       var20 = 256 + var20 * 512;
                                       Object[] var52 = bja.a(pta.d, var41, var48, var49 + kda.d, var20, var23, -1, pta.d, new Object[24], 0, var25, var35, var30, var27 + kda.d, var26, 9581, var19);
                                       fn.a(var22, var27 + kda.d, var21, var52, -var26 + Class_ds.a(pta.d, var21, var22, (byte)122), 121);
                                       Object[] var14;
                                       client.a(-116, gn.r, (lm)(null != (var14 = vm.a(var52, 16502, new Object[2]))?var14[1]:null));
                                    }

                                 }
                              } else {
                                 var17 = cp.a((byte)60, var15);
                                 var18 = ((112 & var17) >> 4) + kla.h;
                                 var19 = (var17 & 7) + tl.d;
                                 var20 = cp.a((byte)60, var15);
                                 var21 = var20 >> 2;
                                 var22 = 3 & var20;
                                 var23 = caa.c[var21];
                                 var41 = lr.a(1, var15);
                                 if(null != var0 && (var0.length == 1 || var0.length == 6)) {
                                    tqa.b = (byte[][])null;
                                 }

                                 if(wha.a((byte)-101, rq.c) || var18 >= 0 && 0 <= var19 && var18 < rp.c && var19 < wpa.a) {
                                    nfa.a(var22, var21, true, pta.d, var18, var23, var41, var19);
                                 }

                              }
                           } else {
                              var17 = fh.a(var15, false);
                              var18 = (7 & var17) + tl.d;
                              var19 = qm.d + var18;
                              var20 = (var17 >> 4 & 7) + kla.h;
                              if(null != var0 && var0.length == 1) {
                                 ((boolean[])((boolean[])((Object[])((Object[])nb.g[0]))[0]))[8] = true;
                              }

                              var21 = var20 + rs.f;
                              var22 = de.a((int)0, var15);
                              var23 = de.a((int)0, var15);
                              var41 = de.a((int)0, var15);
                              if(vg.e != null) {
                                 oga var10;
                                 Object[] var45 = (var10 = (oga)pm.a((long)(var21 | pta.d << 28 | var19 << 14), vg.e, false)) == null?null:var10.k;
                                 if(var45 != null) {
                                    gn var11;
                                    gn var12;
                                    for(var43 = (var11 = (gn)dda.a((Object[])((Object[])var45[0]), 2)) == null?null:var11.j; var43 != null; var43 = (var12 = (gn)client.a((Object[])((Object[])var45[0]), -28280)) != null?var12.j:null) {
                                       if((var22 & 32767) == ((int[])((int[])var43[1]))[1] && ~var23 == ~((int[])((int[])var43[1]))[0]) {
                                          ((lm)(var43 == null?null:var43[0])).a((byte)97);
                                          ((int[])((int[])var43[1]))[0] = var41;
                                          bia.a((byte)126, var19, pta.d, var21, var43);
                                          break;
                                       }
                                    }

                                    if(0 <= var20 && 0 <= var18 && rp.c > var20 && wpa.a > var18) {
                                       fg.a(pta.d, var20, var18, (byte)72);
                                    }

                                    if(var45 != null && 4 == var45.length) {
                                       hfa.h = (int[])((int[])((Object[])((Object[])Class_f.b[5]))[0]);
                                    }
                                 }
                              }

                           }
                        } else {
                           var16 = id.a(var15, -88);
                           var17 = kla.h + (var16 >> 4 & 7);
                           var18 = (var16 & 7) + tl.d;
                           var19 = kqa.a(var15, true);
                           var20 = id.a(var15, 101);
                           var21 = var20 >> 2;
                           var22 = var20 & 3;
                           var23 = caa.c[var21];
                           qv.a(var21, var17, var22, 23439, var19, pta.d, var23, var18);
                        }
                     } else {
                        var16 = fh.a(var15, false);
                        var17 = kla.h + (7 & var16 >> 4);
                        var18 = (7 & var16) + tl.d;
                        var19 = de.a((int)0, var15);
                        if(var19 == '\uffff') {
                           var19 = -1;
                        }

                        if(var0 != null && (7 == var0.length && var0[0].equals(Integer.valueOf(2)) || -8 == ~var0.length && var0[3].equals(Integer.valueOf(0)) && var0[3].equals(Integer.valueOf(0)))) {
                           cqa.a = null;
                        }

                        var20 = fh.a(var15, false);
                        var21 = 15 & var20 >> 4;
                        var22 = 7 & var20;
                        var23 = fh.a(var15, false);
                        var41 = fh.a(var15, false);
                        var25 = de.a((int)0, var15);
                        if(0 <= var17 && var18 >= 0 && rp.c > var17 && var18 < wpa.a) {
                           var26 = 1 + var21;
                           if(-var26 + var17 <= ((int[])((int[])uta.g[33]))[0] && ~(var17 + var26) <= ~((int[])((int[])uta.g[33]))[0] && ~((int[])((int[])uta.g[14]))[0] <= ~(var18 - var26) && ((int[])((int[])uta.g[14]))[0] <= var18 + var26) {
                              var27 = var21 + (var17 << 16) + (pta.d << 24) + (var18 << 8);
                              if(-1 != ~hba.a((Object[])((Object[])tu.d[12]), 0) && 0 != var22 && ct.e < 50 && ~var19 != 0) {
                                 Class_a.c[ct.e++] = dk.a((Object[])null, var19, var41, var27, var25, new Object[7], (byte)2, var23, var22, (byte)17);
                              }
                           }
                        }

                     }
                  } else {
                     var16 = lga.a(var15, -70);
                     var17 = id.a(var15, -38);
                     var18 = (7 & var17) + tl.d;
                     var19 = qm.d + var18;
                     var20 = kla.h + ((var17 & 114) >> 4);
                     var21 = var20 + rs.f;
                     oga var2;
                     Object[] var36 = (var2 = (oga)pm.a((long)(var19 << 14 | pta.d << 28 | var21), vg.e, false)) == null?null:var2.k;
                     if(null != var36) {
                        if(var15 != null && -2 == ~var15.length && var15[0].equals(Integer.valueOf(2)) && var15[0].equals(Boolean.valueOf(false))) {
                           ib.g = (Object[])((Object[])lw.d[0]);
                        }

                        gn var3;
                        gn var4;
                        for(var40 = (var3 = (gn)dda.a((Object[])((Object[])var36[0]), 2)) == null?null:var3.j; var40 != null; var40 = (var4 = (gn)client.a((Object[])((Object[])var36[0]), -28280)) != null?var4.j:null) {
                           if(((int[])((int[])var40[1]))[1] == (32767 & var16)) {
                              ((lm)(null == var40?null:var40[0])).a((byte)127);
                              break;
                           }
                        }

                        if(kj.a(24510, (Object[])((Object[])var36[0]))) {
                           ((lm)(null == var36?null:var36[1])).a((byte)59);
                        }

                        if(0 <= var20 && 0 <= var18 && var20 < rp.c && wpa.a > var18) {
                           fg.a(pta.d, var20, var18, (byte)106);
                        }
                     }

                  }
               } else {
                  var16 = id.a(var15, -100);
                  var17 = kla.h + ((var16 & 123) >> 4);
                  var18 = tl.d + (var16 & 7);
                  var19 = fh.a(var15, false);
                  var20 = var19 >> 2;
                  var21 = caa.c[var20];
                  var22 = sda.a(18, var15);
                  var40 = mca.a(true, var22, lja.d);
                  if(11 == var20) {
                     var20 = 10;
                  }

                  var41 = fh.a(var15, false);
                  var25 = 0;
                  if(var40[2] != null) {
                     var26 = -1;

                     for(var27 = 0; var27 < ((byte[])((byte[])var40[2])).length; ++var27) {
                        if(~var20 == ~((byte[])((byte[])var40[2]))[var27]) {
                           var26 = var27;
                           break;
                        }
                     }

                     var25 = ((int[][])((int[][])var40[17]))[var26].length;
                  }

                  var26 = 0;
                  if(null != var40[8]) {
                     var26 = ((short[])((short[])var40[8])).length;
                  }

                  var27 = 0;
                  if(var40[4] != null) {
                     var27 = ((short[])((short[])var40[4])).length;
                  }

                  if(null != var15 && 3 == var15.length) {
                     ev.a((byte)-77, (String[])null);
                  }

                  if(1 != (1 & var41)) {
                     int[] var42 = null;
                     if((2 & var41) == 2) {
                        var42 = new int[var25];
                        if(var40 != null && (9 == var40.length && var40[6].equals(Boolean.valueOf(false)) || var40.length == 3 && var40[1].equals(Integer.valueOf(2)) && var40[1].equals(Boolean.valueOf(false)))) {
                           uua.a(true, ((int[])((int[])fca.f[3]))[0], 83, -72, -26, -126);
                        }

                        for(var48 = 0; var25 > var48; ++var48) {
                           var42[var48] = lr.a(1, var15);
                        }
                     }

                     short[] var50 = null;
                     if(-5 == ~(var41 & 4)) {
                        if(var15 != null && (var15.length == 1 || -3 == ~var15.length)) {
                           ha.a(-3, ((int[])((int[])oo.d[1]))[1], -8, -106, true);
                        }

                        var50 = new short[var26];

                        for(var30 = 0; var30 < var26; ++var30) {
                           var50[var30] = (short)de.a((int)0, var15);
                        }
                     }

                     short[] var47 = null;
                     if(-9 == ~(8 & var41)) {
                        var47 = new short[var27];
                        if(var40 != null && 2 == var40.length && var40[1].equals(Boolean.valueOf(false)) && var40[1].equals(Integer.valueOf(2))) {
                           ((byte[])((byte[])dl.b[2]))[8] = ((byte[])((byte[])dqa.c[11]))[1];
                        }

                        for(var31 = 0; var31 < var27; ++var31) {
                           var47[var31] = (short)de.a((int)0, var15);
                        }
                     }

                     bna.a(pta.d, 95, vaa.a((long)(msa.e++), -59, var50, var47, new Object[4], var42), var17, var21, var18);
                  } else {
                     bna.a(pta.d, 89, (Object[])null, var17, var21, var18);
                  }

               }
            } else {
               if(null != var0 && var0.length == 5) {
                  jm.j = (int[])((int[])kw.b[0]);
               }

               var16 = cp.a((byte)60, var15);
               var17 = tl.d + (var16 & 7);
               var18 = var17 + qm.d;
               var19 = (7 & var16 >> 4) + kla.h;
               var20 = var19 + rs.f;
               var21 = jta.b(var15, (byte)-90);
               var22 = nqa.a(122, var15);
               boolean var37 = 0 <= var19 && 0 <= var17 && var19 < rp.c && wpa.a > var17;
               if(var37 || wha.a((byte)-108, rq.c)) {
                  var41 = pta.d;
                  Object[] var28 = new Object[2];
                  if(null == var28[1]) {
                     var28[1] = new int[2];
                  }

                  var28[0] = bma.b(var28, 8);
                  ((int[])((int[])var28[1]))[1] = var22;
                  ((int[])((int[])var28[1]))[0] = var21;
                  bia.a((byte)117, var18, var41, var20, var28);
                  if(var37) {
                     fg.a(pta.d, var19, var17, (byte)103);
                  }
               }

            }
         } else {
            var16 = fh.a(var15, false);
            var17 = tl.d + (7 & var16);
            var18 = var17 + qm.d;
            var19 = kla.h + (var16 >> 4 & 7);
            var20 = rs.f + var19;
            var21 = jta.b(var15, (byte)118);
            var22 = jta.b(var15, (byte)119);
            if(null != var0 && (var0.length == 14 || var0.length == 2 && var0[1].equals(Integer.valueOf(1)))) {
               uw.b((Object[])null, (byte)-82);
            }

            var23 = de.a((int)0, var15);
            if(dp.r != var23) {
               boolean var24 = var19 >= 0 && 0 <= var17 && var19 < rp.c && wpa.a > var17;
               if(var24 || wha.a((byte)-87, rq.c)) {
                  var25 = pta.d;
                  Object[] var29 = new Object[2];
                  if(var29[1] == null) {
                     var29[1] = new int[2];
                  }

                  var29[0] = bma.b(var29, 8);
                  ((int[])((int[])var29[1]))[0] = var22;
                  ((int[])((int[])var29[1]))[1] = var21;
                  bia.a((byte)67, var18, var25, var20, var29);
                  if(var24) {
                     fg.a(pta.d, var19, var17, (byte)82);
                  }
               }
            }

         }
      } catch (RuntimeException var34) {
         throw vt.a(var34, "wea.G(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final void b(byte var0, Object[] var1) {
      ++m;
      if(!((boolean[])((boolean[])var1[8]))[7]) {
         if(-1 != ~((int[])((int[])var1[12]))[12]) {
            Object[] var2 = null;
            if(bw.b == 0) {
               var2 = za.a(ofa.e[-1 + ((int[])((int[])var1[12]))[12]], (byte)93);
            } else {
               int var3;
               if(((int[])((int[])var1[12]))[12] < 0) {
                  var3 = -1 + -((int[])((int[])var1[12]))[12];
                  if(dp.r == var3) {
                     var2 = uta.g;
                  } else {
                     var2 = vo.E[var3];
                  }
               } else {
                  var3 = -1 + ((int[])((int[])var1[12]))[12];
                  hna var4 = (hna)pm.a((long)var3, hf.g, false);
                  if(var4 != null) {
                     var2 = var4.k;
                  }
               }
            }

            if(var2 != null) {
               Object[] var21 = (Object[])((Object[])woa.a(5, var2)[1]);
               if(null != var1 && var1.length == 18 && var1[15].equals(Integer.valueOf(1)) && var1[15].equals(Boolean.valueOf(false))) {
                  return;
               }

               Object[] var5 = new Object[2];
               float var6 = ((float[])((float[])var21[1]))[2];
               int var10 = Class_ds.a(((byte[])((byte[])var1[10]))[0], (int)((float[])((float[])var21[1]))[2], (int)((float[])((float[])var21[1]))[1], (byte)122) + -((int[])((int[])var1[12]))[10];
               sra.a(var1, bl.a((byte)92, var6, var5, ((float[])((float[])var21[1]))[1], (float)var10), 1);
               if(((int[])((int[])var1[12]))[9] >= 0) {
                  Object[] var11 = ro.a((int)3, var2);
                  int var12 = 0;
                  int var13 = 0;
                  if(var11[8] != null && null != ((int[][])((int[][])var11[8]))[((int[])((int[])var1[12]))[9]]) {
                     var13 += ((int[][])((int[][])var11[8]))[((int[])((int[])var1[12]))[9]][2];
                     var12 += ((int[][])((int[][])var11[8]))[((int[])((int[])var1[12]))[9]][0];
                  }

                  if(null != var11[5] && ((int[][])((int[][])var11[5]))[((int[])((int[])var1[12]))[9]] != null) {
                     var13 += ((int[][])((int[][])var11[5]))[((int[])((int[])var1[12]))[9]][2];
                     var12 += ((int[][])((int[][])var11[5]))[((int[])((int[])var1[12]))[9]][0];
                  }

                  if(0 != var12 || var13 != 0) {
                     int var14 = bca.a((Object[])((Object[])var2[35]), false);
                     int var15 = var14;
                     if(null != var2[26] && ~((int[])((int[])var2[26]))[((int[])((int[])var1[12]))[9]] != 0) {
                        var15 = ((int[])((int[])var2[26]))[((int[])((int[])var1[12]))[9]];
                     }

                     int var16 = 16383 & var15 + -var14;
                     int var17 = tda.p[var16];
                     int var18 = tda.k[var16];
                     int var19 = var18 * var12 + var13 * var17 >> 14;
                     if(var21 != null && 4 == var21.length) {
                        ipa.a((byte)-125, (Object[])null, (ta)null, -54);
                     }

                     var13 = -(var17 * var12) + var18 * var13 >> 14;
                     Object[] var20 = mha.a((byte)127, new Object[2], (Object[])((Object[])woa.a(5, var1)[1]));
                     ((float[])((float[])var20[1]))[1] += (float)var13;
                     ((float[])((float[])var20[1]))[2] += (float)var19;
                     sra.a(var1, var20, 1);
                  }
               }
            }
         }

         if(var0 <= 112) {
            a(-58, ((boolean[])((boolean[])p[4]))[0], (Object[])null, 46, -57);
         }

      }
   }

   final int f() {
      ++v;
      Object[] var2 = this.k;
      if(null != var2) {
         int var1 = kr.a(var2, (byte)-126);
         if(client.f_vb == 0) {
            return var1;
         }
      }

      throw new IllegalStateException();
   }

   final void c() {
      ++o;
      Object[] var1 = this.k;
      if(var1 == null || client.f_vb != 0) {
         throw new IllegalStateException();
      }
   }

   static final void a(int var0, int var1, float var2, int var3, float var4, float var5, float var6, Object[] var7, Class_s var8, int var9, float var10, float var11) {
      ++y;
      tg var12;
      Object[] var13 = (Object[])((Object[])(null != (var12 = (tg)var8)?var12.f_l:null)[0]);
      float var14;
      float var15;
      float var17;
      float var16;
      if(((boolean[])((boolean[])var7[5]))[0]) {
         var14 = (float)po.a(-17010, var7);
         var15 = (float)uka.a(var7, (byte)59);
         var16 = (-var11 + var5) / var14;
         var17 = (-var4 + var10) / var14;
         float var18 = (var6 - var11) / var15;
         float var19 = (var2 - var4) / var15;
         float var20 = (float)((int[])((int[])var7[1]))[3] * var18;
         float var21 = var19 * (float)((int[])((int[])var7[1]))[3];
         float var22 = (float)((int[])((int[])var7[1]))[0] * var16;
         float var23 = var17 * (float)((int[])((int[])var7[1]))[0];
         if(var13 != null && -10 == ~var13.length && var13[6].equals(Boolean.valueOf(false))) {
            po.a(-17010, new Object[21][]);
         }

         float var24 = (float)((int[])((int[])var7[1]))[4] * -var16;
         float var25 = -var17 * (float)((int[])((int[])var7[1]))[4];
         float var26 = (float)((int[])((int[])var7[1]))[2] * -var18;
         var5 = var20 + var24 + var5;
         float var27 = (float)((int[])((int[])var7[1]))[2] * -var19;
         var6 = var6 + var22 + var26;
         var11 = var20 + var22 + var11;
         var10 = var21 + var25 + var10;
         var4 = var21 + var23 + var4;
         var2 = var2 + var23 + var27;
      }

      var14 = var6 + -var11 + var5;
      var15 = var10 + (var2 - var4);
      lta.a(127, (Object[])((Object[])var7[3]), (1 & var3) != 0);
      sm.a((Object[])((Object[])var7[0]), 122);
      moa.a((byte)107, (Object[])((Object[])var7[3]), (Object[])((Object[])var7[0]));
      za.a(1, var9 + -40166, (Object[])((Object[])var7[0]));
      nha.a((Object[])((Object[])var7[0]), 18806, 1);
      moa.a((byte)124, var13, (Object[])((Object[])var7[0]));
      el.a(8448, var9 + 11625, 7681, (Object[])((Object[])var7[0]));
      af.a(768, (Object[])((Object[])var7[0]), 30579, '\u8578', 0);
      kd.a(var9 - 16195, (Object[])((Object[])var7[0]), 1);
      if(var9 != 19237) {
         b((int)-101, (Object[])null);
      }

      var16 = ((float[])((float[])var13[6]))[0] / (float)((int[])((int[])var13[1]))[6];
      var17 = ((float[])((float[])var13[6]))[1] / (float)((int[])((int[])var13[1]))[5];
      OpenGL.glBegin(7);
      OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, ((float[])((float[])((Object[])((Object[])var7[3]))[6]))[1]);
      OpenGL.glMultiTexCoord2f('\u84c1', var16 * (var11 - (float)var1), ((float[])((float[])var13[6]))[1] - var17 * ((float)(-var0) + var4));
      OpenGL.glVertex2f(var11, var4);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', (var6 - (float)var1) * var16, -((var2 - (float)var0) * var17) + ((float[])((float[])var13[6]))[1]);
      OpenGL.glVertex2f(var6, var2);
      OpenGL.glMultiTexCoord2f('\u84c0', ((float[])((float[])((Object[])((Object[])var7[3]))[6]))[0], 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', (var14 - (float)var1) * var16, -(((float)(-var0) + var15) * var17) + ((float[])((float[])var13[6]))[1]);
      OpenGL.glVertex2f(var14, var15);
      OpenGL.glMultiTexCoord2f('\u84c0', ((float[])((float[])((Object[])((Object[])var7[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var7[3]))[6]))[1]);
      OpenGL.glMultiTexCoord2f('\u84c1', var16 * ((float)(-var1) + var5), -(var17 * (var10 - (float)var0)) + ((float[])((float[])var13[6]))[1]);
      OpenGL.glVertex2f(var5, var10);
      OpenGL.glEnd();
      if(null != var7 && var7.length == 25 && var7[3].equals(Integer.valueOf(1))) {
         aka.a((Object[])null, -101, 105, (Class_s)null, -85, (byte)-47, 56);
      }

      af.a(768, (Object[])((Object[])var7[0]), 30579, 5890, 0);
      za.a(0, var9 + -40166, (Object[])((Object[])var7[0]));
      moa.a((byte)102, (Object[])null, (Object[])((Object[])var7[0]));
      nha.a((Object[])((Object[])var7[0]), var9 ^ 595, 0);
   }

   final int d() {
      ++B;
      return jfa.a((byte)72, this.k);
   }

   static final void a(int var0, boolean var1, Object[] var2, int var3, int var4) {
      ++w;
      int var6 = ((int[])((int[])var2[1]))[70];
      if(((byte[])((byte[])var2[45]))[2] == 0) {
         ((int[])((int[])var2[1]))[70] = ((int[])((int[])var2[1]))[43];
      } else if(((byte[])((byte[])var2[45]))[2] == 1) {
         ((int[])((int[])var2[1]))[70] = var0 + -((int[])((int[])var2[1]))[43];
      } else if(((byte[])((byte[])var2[45]))[2] == 2) {
         ((int[])((int[])var2[1]))[70] = ((int[])((int[])var2[1]))[43] * var0 >> 14;
      }

      int var7 = ((int[])((int[])var2[1]))[2];
      if(-1 == ~((byte[])((byte[])var2[45]))[3]) {
         ((int[])((int[])var2[1]))[2] = ((int[])((int[])var2[1]))[41];
      } else if(-2 == ~((byte[])((byte[])var2[45]))[3]) {
         ((int[])((int[])var2[1]))[2] = var3 + -((int[])((int[])var2[1]))[41];
      } else if(-3 == ~((byte[])((byte[])var2[45]))[3]) {
         ((int[])((int[])var2[1]))[2] = ((int[])((int[])var2[1]))[41] * var3 >> 14;
      }

      if(4 == ((byte[])((byte[])var2[45]))[var4]) {
         ((int[])((int[])var2[1]))[70] = ((int[])((int[])var2[1]))[67] * ((int[])((int[])var2[1]))[2] / ((int[])((int[])var2[1]))[23];
      }

      if(4 == ((byte[])((byte[])var2[45]))[3]) {
         ((int[])((int[])var2[1]))[2] = ((int[])((int[])var2[1]))[70] * ((int[])((int[])var2[1]))[23] / ((int[])((int[])var2[1]))[67];
      }

      if(jp.j && (((int[])((int[])client.c(var2)[1]))[0] != 0 || ((int[])((int[])var2[1]))[18] == 0)) {
         if(5 > ((int[])((int[])var2[1]))[2] && 5 > ((int[])((int[])var2[1]))[70]) {
            ((int[])((int[])var2[1]))[70] = 5;
            ((int[])((int[])var2[1]))[2] = 5;
         } else {
            if(((int[])((int[])var2[1]))[2] <= 0) {
               ((int[])((int[])var2[1]))[2] = 5;
            }

            if(-1 <= ~((int[])((int[])var2[1]))[70]) {
               ((int[])((int[])var2[1]))[70] = 5;
            }
         }
      }

      if(((int[])((int[])var2[1]))[30] == Class_d.c) {
         mi.g = var2;
      }

      if(null != var2 && (var2.length == 2 || var2.length == 7 && var2[1].equals(Integer.valueOf(1)) && var2[1].equals(Boolean.valueOf(false)))) {
         lra.a(((boolean[])((boolean[])pja.f[5]))[5], (byte)-70);
      }

      if(var1 && null != var2[39] && (((int[])((int[])var2[1]))[70] != var6 || ((int[])((int[])var2[1]))[2] != var7)) {
         Object[] var8 = nga.b(new Object[7], (byte)87);
         var8[3] = var2[39];
         var8[0] = var2;
         client.a(-67, it.b, (lm)(var8 == null?null:var8[2]));
      }

   }

   final boolean a() {
      ++t;
      return uj.a(this.k, true);
   }

   static final int a(Object[] var0, int var1) {
      ++q;
      if(var1 != 31819) {
         p = (Object[])null;
      }

      return 1;
   }

   wea(Object[] var1) {
      this.k = var1;
   }

   static final void c(int var0, Object[] var1) {
      ((boolean[])((boolean[])var1[3]))[1] = false;
      ++x;
      if(var0 != -6574) {
         b((Object[])null, 16);
      }

   }

   final int e() {
      ++u;
      Object[] var2 = this.k;
      int var1 = ((int[])((int[])var2[1]))[0];
      return var1;
   }

   final void b(int var1, int var2) {
      ++s;
      Object[] var3 = this.k;
      if(((int[])((int[])var3[1]))[0] != var1 || ((int[])((int[])var3[1]))[1] != var2) {
         ((int[])((int[])var3[1]))[0] = var1;
         ((int[])((int[])var3[1]))[1] = var2;
         hk.a(var3, (byte)-16);
      }

   }

}
