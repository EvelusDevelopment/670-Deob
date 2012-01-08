import jaggl.OpenGL;
import java.io.IOException;

final class aka {

   static int d;
   static float e = 1.0F;
   static int c;
   static Object[] b = sl.a("9", 0, new Object[1], "9");
   static int a;


   static final void a(Object[] var0, int var1, int var2, Class_s var3, int var4, byte var5, int var6) {
      ++a;
      tg var7;
      Object[] var8 = null == (var7 = (tg)var3)?null:var7.f_l;
      Object[] var9 = (Object[])((Object[])var8[0]);
      lta.a(127, (Object[])((Object[])var0[3]), false);
      sm.a((Object[])((Object[])var0[0]), var5 + 171);
      moa.a((byte)108, (Object[])((Object[])var0[3]), (Object[])((Object[])var0[0]));
      za.a(1, -20929, (Object[])((Object[])var0[0]));
      nha.a((Object[])((Object[])var0[0]), 18806, 1);
      moa.a((byte)98, var9, (Object[])((Object[])var0[0]));
      el.a(8448, var5 + 30909, 7681, (Object[])((Object[])var0[0]));
      af.a(768, (Object[])((Object[])var0[0]), 30579, '\u8578', 0);
      kd.a(3042, (Object[])((Object[])var0[0]), 1);
      var2 += ((int[])((int[])var0[1]))[3];
      var1 += ((int[])((int[])var0[1]))[0];
      int var10 = var1 + ((int[])((int[])((Object[])((Object[])var0[3]))[1]))[6];
      int var11 = ((int[])((int[])((Object[])((Object[])var0[3]))[1]))[5] + var2;
      float var12 = ((float[])((float[])var9[6]))[0] / (float)((int[])((int[])var9[1]))[6];
      float var13 = ((float[])((float[])var9[6]))[1] / (float)((int[])((int[])var9[1]))[5];
      float var14 = var12 * (float)(var1 - var6);
      float var15 = var12 * (float)(var10 - var6);
      float var16 = -(var13 * (float)(-var4 + var2)) + ((float[])((float[])var9[6]))[1];
      float var17 = ((float[])((float[])var9[6]))[1] - (float)(-var4 + var11) * var13;
      OpenGL.glBegin(7);
      OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, ((float[])((float[])((Object[])((Object[])var0[3]))[6]))[1]);
      OpenGL.glMultiTexCoord2f('\u84c1', var14, var16);
      OpenGL.glVertex2i(var1, var2);
      OpenGL.glMultiTexCoord2f('\u84c0', 0.0F, 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var14, var17);
      OpenGL.glVertex2i(var1, ((int[])((int[])((Object[])((Object[])var0[3]))[1]))[5] + var2);
      if(var5 != -47) {
         e = ((float[])((float[])var0[13]))[20];
      }

      OpenGL.glMultiTexCoord2f('\u84c0', ((float[])((float[])((Object[])((Object[])var0[3]))[6]))[0], 0.0F);
      OpenGL.glMultiTexCoord2f('\u84c1', var15, var17);
      OpenGL.glVertex2i(((int[])((int[])((Object[])((Object[])var0[3]))[1]))[6] + var1, var2 + ((int[])((int[])((Object[])((Object[])var0[3]))[1]))[5]);
      OpenGL.glMultiTexCoord2f('\u84c0', ((float[])((float[])((Object[])((Object[])var0[3]))[6]))[0], ((float[])((float[])((Object[])((Object[])var0[3]))[6]))[1]);
      OpenGL.glMultiTexCoord2f('\u84c1', var15, var16);
      OpenGL.glVertex2i(var1 + ((int[])((int[])((Object[])((Object[])var0[3]))[1]))[6], var2);
      OpenGL.glEnd();
      af.a(768, (Object[])((Object[])var0[0]), 30579, 5890, 0);
      za.a(0, -20929, (Object[])((Object[])var0[0]));
      moa.a((byte)93, (Object[])null, (Object[])((Object[])var0[0]));
      nha.a((Object[])((Object[])var0[0]), 18806, 0);
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      var0[7] = var1;
      if(var2 == -29358) {
         var0[0] = null;
         ++d;
      }
   }

   static final void a(int var0) {
      ++c;
      if(lt.h > 1) {
         --lt.h;
         eo.b = qr.a;
      }

      if(((boolean[])((boolean[])lba.f[11]))[0]) {
         ((boolean[])((boolean[])lba.f[11]))[0] = false;
         wv.a((byte)-71);
      } else {
         if(!kea.c) {
            ll.a((byte)-42);
         }

         for(int var11 = 0; var11 < 100 && cja.a(lba.f, -30323); ++var11) {
            ;
         }

         if(ipa.d == 10) {
            while(true) {
               al var12;
               Object[] var13 = (var12 = (al)dda.a(gha.c, 2)) == null?null:var12.m;
               boolean var57;
               if(null != var13) {
                  var57 = true;
               } else {
                  var57 = false;
               }

               Object[] var55;
               int var58;
               if(!var57) {
                  Object[] var56;
                  if(eb.e != null) {
                     if(0 != ~((int[])((int[])eb.e[1]))[0]) {
                        var56 = ona.a((byte)126, (Object[])((Object[])lba.f[7]), noa.c);
                        eda.putShort((Object[])((Object[])var56[0]), ((int[])((int[])eb.e[1]))[0]);
                        lj.a(var56, 6, lba.f);
                        eb.e = null;
                        tra.b = 30000L + he.a(54);
                     }
                  } else if(he.a(var0 - 31319) >= tra.b) {
                     eb.e = oea.a(os.k, (String)ma.q[0], 1);
                  }

                  bc var1;
                  var56 = null != (var1 = (bc)dda.a(cua.c, 2))?var1.m:null;
                  if(var56 != null && var56.length == 15) {
                     ((byte[])((byte[])qaa.j[3]))[6] = ((byte[])((byte[])os.k[13]))[16];
                  }

                  Object[] var14;
                  int var15;
                  int var17;
                  int var16;
                  int var19;
                  int var18;
                  if(var56 != null || he.a(-81) - 2000L > fo.g) {
                     var55 = null;
                     var58 = 0;

                     bc var2;
                     bc var3;
                     for(var14 = (var2 = (bc)dda.a(Class_d.e, 2)) != null?var2.m:null; var14 != null && (null == var55 || ((int[])((int[])((Object[])((Object[])var55[0]))[1]))[0] - var58 < 240); var14 = null != (var3 = (bc)client.a(Class_d.e, -28280))?var3.m:null) {
                        ((lm)(var14 != null?var14[0]:null)).a((byte)44);
                        var15 = jk.a(var14, 0);
                        if(var15 < -1) {
                           var15 = -1;
                        } else if(var15 > '\ufffe') {
                           var15 = '\ufffe';
                        }

                        var16 = hla.b(var14, 1);
                        if(var16 >= -1) {
                           if('\ufffe' < var16) {
                              var16 = '\ufffe';
                           }
                        } else {
                           var16 = -1;
                        }

                        if(vd.h != var16 || tra.g != var15) {
                           if(null == var55) {
                              ++fsa.h;
                              var55 = ona.a((byte)113, (Object[])((Object[])lba.f[7]), ora.p);
                              ek.putByte((Object[])((Object[])var55[0]), 0);
                              var58 = ((int[])((int[])((Object[])((Object[])var55[0]))[1]))[0];
                           }

                           var17 = -vd.h + var16;
                           vd.h = var16;
                           var18 = var15 - tra.g;
                           tra.g = var15;
                           var19 = (int)((wra.a(var14, var0 - 22323) - fo.g) / 20L);
                           if(var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                              var17 += 32;
                              var18 += 32;
                              eda.putShort((Object[])((Object[])var55[0]), (var19 << 12) + (var17 << 6) + var18);
                           } else if(32 > var19 && -128 <= var17 && var17 <= 127 && -128 <= var18 && 127 >= var18) {
                              var18 += 128;
                              ek.putByte((Object[])((Object[])var55[0]), var19 + 128);
                              var17 += 128;
                              eda.putShort((Object[])((Object[])var55[0]), var18 + (var17 << 8));
                           } else if(32 > var19) {
                              ek.putByte((Object[])((Object[])var55[0]), 192 + var19);
                              if(1 != var16 && -1 != var15) {
                                 op.putInt((Object[])((Object[])var55[0]), var15 << 16 | var16);
                              } else {
                                 op.putInt((Object[])((Object[])var55[0]), Integer.MIN_VALUE);
                              }
                           } else {
                              eda.putShort((Object[])((Object[])var55[0]), '\ue000' + var19);
                              if(var16 != 1 && var15 != -1) {
                                 op.putInt((Object[])((Object[])var55[0]), var16 | var15 << 16);
                              } else {
                                 op.putInt((Object[])((Object[])var55[0]), Integer.MIN_VALUE);
                              }
                           }

                           fo.g = wra.a(var14, 9076);
                        }
                     }

                     if(null != var55) {
                        oda.a(-var58 + ((int[])((int[])((Object[])((Object[])var55[0]))[1]))[0], (Object[])((Object[])var55[0]), (byte)-37);
                        lj.a(var55, 6, lba.f);
                     }

                     if(var55 != null && var55.length == 3) {
                        hq.a(-55);
                     }
                  }

                  Object[] var67;
                  if(var56 != null) {
                     long var59 = (wra.a(var56, 9076) + -hca.g) / 50L;
                     if(~var59 < -32768L) {
                        var59 = 32767L;
                     }

                     hca.g = wra.a(var56, var0 ^ 22995);
                     int var60 = jk.a(var56, 0);
                     if(0 > var60) {
                        var60 = 0;
                     } else if('\uffff' < var60) {
                        var60 = '\uffff';
                     }

                     var15 = hla.b(var56, 1);
                     if(var15 >= 0) {
                        if('\uffff' < var15) {
                           var15 = '\uffff';
                        }
                     } else {
                        var15 = 0;
                     }

                     if(var56 != null && (4 == var56.length || var56.length == 4 && var56[2].equals(Integer.valueOf(1)) || var56.length == 11)) {
                        uw.b((Object[])null, (byte)-108);
                     }

                     byte var63 = 0;
                     if(-3 == ~uta.a((byte)13, var56)) {
                        var63 = 1;
                     }

                     ++ol.d;
                     var17 = (int)var59;
                     var67 = ona.a((byte)116, (Object[])((Object[])lba.f[7]), aia.a);
                     vh.putIntLE(0, (Object[])((Object[])var67[0]), var60 << 16 | var15);
                     ij.a(var63 << 15 | var17, (byte)126, (Object[])((Object[])var67[0]));
                     lj.a(var67, 6, lba.f);
                  }

                  if(iua.a > 0) {
                     ++oha.h;
                     var55 = ona.a((byte)117, (Object[])((Object[])lba.f[7]), mi.e);
                     if(var55 != null && 13 == var55.length && var55[6].equals(Integer.valueOf(1))) {
                        ((boolean[])((boolean[])jv.g[3]))[7] = true;
                     }

                     ek.putByte((Object[])((Object[])var55[0]), 3 * iua.a);

                     for(var58 = 0; iua.a > var58; ++var58) {
                        if(null != var55 && (var55.length == 5 || 32 == var55.length)) {
                           pj.b = -29;
                        }

                        var14 = bva.b[var58];
                        if(null == var14) {
                           throw new IllegalStateException();
                        }

                        long var62 = vha.a(var14, (byte)78);
                        long var71 = (var62 + -ar.g) / 50L;
                        if(~var71 < -65536L) {
                           var71 = 65535L;
                        }

                        if(null == var14) {
                           throw new IllegalStateException();
                        }

                        long var66 = vha.a(var14, (byte)78);
                        ar.g = var66;
                        ek.putByte((Object[])((Object[])var55[0]), noa.a(true, var14));
                        eda.putShort((Object[])((Object[])var55[0]), (int)var71);
                     }

                     lj.a(var55, 6, lba.f);
                  }

                  if(0 < ki.b) {
                     --ki.b;
                  }

                  if(aoa.b && 0 >= ki.b) {
                     ++fv.e;
                     aoa.b = false;
                     ki.b = 20;
                     var55 = ona.a((byte)125, (Object[])((Object[])lba.f[7]), cj.a);
                     th.a((Object[])((Object[])var55[0]), (int)sma.h >> 3, (byte)-92);
                     ij.a((int)qv.f_i >> 3, (byte)126, (Object[])((Object[])var55[0]));
                     lj.a(var55, var0 ^ 31393, lba.f);
                  }

                  if(!kj.j != !pf.m) {
                     ++ae.d;
                     pf.m = kj.j;
                     var55 = ona.a((byte)112, (Object[])((Object[])lba.f[7]), cma.t);
                     ek.putByte((Object[])((Object[])var55[0]), !kj.j?0:1);
                     lj.a(var55, 6, lba.f);
                  }

                  if(!mr.f) {
                     ++qj.f;
                     var55 = ona.a((byte)112, (Object[])((Object[])lba.f[7]), jra.c);
                     ek.putByte((Object[])((Object[])var55[0]), 0);
                     var58 = ((int[])((int[])((Object[])((Object[])var55[0]))[1]))[0];
                     var14 = db.a(tu.d, (int)103);
                     lr.a(((int[])((int[])var14[1]))[0], (byte[])((byte[])var14[2]), 20244, 0, (Object[])((Object[])var55[0]));
                     oda.a(-var58 + ((int[])((int[])((Object[])((Object[])var55[0]))[1]))[0], (Object[])((Object[])var55[0]), (byte)-37);
                     lj.a(var55, var0 ^ 31393, lba.f);
                     mr.f = true;
                  }

                  if(null != ju.g) {
                     if(ha.e != 4) {
                        if(ha.e == 2) {
                           rd.a(var0 - 31397);
                        }
                     } else {
                        jl.a(var0 - 31143);
                     }
                  }

                  if(!gpa.a) {
                     fja.d /= 2.0F;
                  } else {
                     gpa.a = false;
                  }

                  if(ow.d) {
                     ow.d = false;
                  } else {
                     rba.k /= 2.0F;
                  }

                  if(-1 == ~qga.b((Object[])((Object[])tu.d[14]), 13687) && wia.d != jca.n) {
                     mia.a(false, 13, sla.b, false, ld.a);
                  } else {
                     esa.a(lna.g, 4);
                     if(jca.n != ra.b) {
                        pfa.a(4168);
                     }
                  }

                  if(10 != ipa.d) {
                     return;
                  }

                  uia.a((byte)44);
                  rra.b(10590);
                  gha.a(false);
                  ++((int[])((int[])lba.f[1]))[4];
                  if(((int[])((int[])lba.f[1]))[4] > 750) {
                     wv.a((byte)101);
                     return;
                  }

                  Object[] var69;
                  int var72;
                  if(4 != bw.b) {
                     Object[] var73;
                     int var75;
                     int var80;
                     if(bw.b == 2) {
                        var58 = ai.h;
                        if(ip.b != var58 || rka.c == null) {
                           ms.a(0);
                           ip.b = var58;
                           rka.c = md.g;
                        }

                        boolean var65;
                        label1377: {
                           if(rka.c == md.g) {
                              byte[] var61 = fd.a(-2, var58, nma.c);
                              if(null == var61) {
                                 var65 = false;
                                 break label1377;
                              }

                              var73 = jta.a((byte)-122, var61, new Object[3]);

                              do {
                                 while(true) {
                                    var17 = fh.a(var73, false);
                                    if(0 != var17) {
                                       break;
                                    }

                                    la.m = de.a((int)0, var73);
                                    ro.a = de.a((int)0, var73);
                                 }
                              } while(255 != var17);

                              if(null != var73 && -3 == ~var73.length) {
                                 ((boolean[])((boolean[])cba.a[12]))[0] = true;
                              }

                              var17 = fh.a(var73, false);

                              for(var18 = 0; var17 > var18; ++var18) {
                                 client.a(var0 ^ -31467, eb.h, (lm)(null != (var14 = aba.a(new Object[2], var73, 21929))?var14[0]:null));
                              }

                              var18 = tga.a((int)1, var73);
                              bw.f = new Object[var18][];

                              int var25;
                              for(var19 = 0; var18 > var19; ++var19) {
                                 Object[][] var20 = bw.f;
                                 Object[] var23 = new Object[7];
                                 int var24 = tga.a((int)1, var73);
                                 if(null != var73 && -2 == ~var73.length && var73[0].equals(Integer.valueOf(2))) {
                                    ((boolean[])((boolean[])lta.h[4]))[6] = false;
                                 }

                                 var23[0] = new int[var24];
                                 var23[1] = new int[var24];
                                 var23[5] = new int[var24];
                                 var23[3] = new int[var24];
                                 var23[2] = new int[var24];
                                 var23[4] = new int[var24];
                                 var23[6] = new int[var24];

                                 for(var25 = 0; var24 > var25; ++var25) {
                                    ((int[])((int[])var23[0]))[var25] = de.a((int)0, var73) - 5120;
                                    ((int[])((int[])var23[1]))[var25] = de.a(var0 - 31399, var73) - 5120;
                                    ((int[])((int[])var23[5]))[var25] = jia.c(var0 ^ -25923, var73);
                                    ((int[])((int[])var23[3]))[var25] = -5120 + de.a((int)0, var73);
                                    ((int[])((int[])var23[6]))[var25] = -5120 + de.a((int)0, var73);
                                    ((int[])((int[])var23[2]))[var25] = jia.c(-8166, var73);
                                    ((int[])((int[])var23[4]))[var25] = jia.c(var0 + -39565, var73);
                                 }

                                 var20[var19] = var23;
                              }

                              var19 = tga.a((int)1, var73);
                              ofa.e = new Object[var19][];

                              for(var75 = 0; var75 < var19; ++var75) {
                                 Object[][] var21 = ofa.e;
                                 Object[] var84 = new Object[4];
                                 if(null == var84[1]) {
                                    var84[1] = new int[2];
                                 }

                                 if(var84[2] == null) {
                                    var84[2] = new boolean[1];
                                 }

                                 ((boolean[])((boolean[])var84[2]))[0] = false;
                                 var84[0] = null;
                                 var84[3] = null;
                                 ((int[])((int[])var84[1]))[1] = var75;
                                 var25 = fh.a(var73, false);
                                 if(var25 == 0) {
                                    ((int[])((int[])var84[1]))[0] = fma.c(-17126, var73);
                                 } else if(var25 != 1) {
                                    ((int[])((int[])var84[1]))[0] = -1;
                                 } else {
                                    ((int[])((int[])var84[1]))[0] = -1;
                                 }

                                 ara.b((byte)61, var73);
                                 var21[var75] = var84;
                              }

                              var75 = tga.a((int)1, var73);
                              qs.c = new Object[var75][];

                              for(var80 = 0; var80 < var75; ++var80) {
                                 Object[][] var22 = qs.c;
                                 Object[] var82 = new Object[1];
                                 if(var82[0] == null) {
                                    var82[0] = new int[6];
                                 }

                                 ((int[])((int[])var82[0]))[1] = fma.c(-17126, var73);
                                 ((int[])((int[])var82[0]))[3] = fh.a(var73, false);
                                 var22[var80] = var82;
                              }

                              var80 = tga.a((int)1, var73);
                              wv.g = new Object[var80][];

                              int var27;
                              int var76;
                              for(var76 = 0; var80 > var76; ++var76) {
                                 Object[][] var78 = wv.g;
                                 Object[] var26 = new Object[2];
                                 var27 = tga.a((int)1, var73);
                                 var26[1] = new int[var27];
                                 var26[0] = new int[var27];

                                 for(int var28 = 0; var28 < var27; ++var28) {
                                    int var29 = fh.a(var73, false);
                                    ((int[])((int[])var26[1]))[var28] = var29;
                                    int var30 = de.a((int)0, var73);
                                    int var31 = de.a((int)0, var73);
                                    ((int[])((int[])var26[0]))[var28] = var31 + (var30 << 16);
                                 }

                                 if(null != var73 && var73.length == 6) {
                                    ((byte[])((byte[])uta.g[8]))[1] = -29;
                                 }

                                 var78[var76] = var26;
                              }

                              var76 = tga.a((int)1, var73);
                              sha.d = new Object[var76][];

                              for(int var83 = 0; var83 < var76; ++var83) {
                                 Object[][] var85 = sha.d;
                                 var27 = fh.a(var73, false);
                                 Object[] var86 = ct.a(var27, 88);
                                 Object[] var88 = null;
                                 int var50 = ((int[])((int[])var86[0]))[1];
                                 if(var50 == 19) {
                                    Object[] var87 = new Object[8];
                                    if(var87[0] == null) {
                                       var87[0] = new int[7];
                                    }

                                    sea.b(var73, var87, (byte)-128);
                                    ((int[])((int[])var87[0]))[1] = de.a((int)0, var73);
                                    var50 = fh.a(var73, false);
                                    if(-1 == ~(1 & var50)) {
                                       ((int[])((int[])var87[0]))[2] = -1;
                                       ((int[])((int[])var87[0]))[5] = -1;
                                    } else {
                                       ((int[])((int[])var87[0]))[2] = de.a(var0 ^ 31399, var73);
                                       ((int[])((int[])var87[0]))[5] = de.a(var0 ^ 31399, var73);
                                    }

                                    if(-1 == ~(var50 & 2)) {
                                       ((int[])((int[])var87[0]))[6] = -1;
                                       ((int[])((int[])var87[0]))[4] = -1;
                                    } else {
                                       ((int[])((int[])var87[0]))[6] = de.a(var0 - 31399, var73);
                                       ((int[])((int[])var87[0]))[4] = de.a((int)0, var73);
                                    }

                                    if(0 == (4 & var50)) {
                                       ((int[])((int[])var87[0]))[3] = -1;
                                    } else {
                                       int var51 = de.a((int)0, var73);
                                       int var52 = de.a((int)0, var73);
                                       int var53 = var51 * 255 / var52;
                                       if(0 < var51 && 1 > var53) {
                                          var53 = 1;
                                       }

                                       ((int[])((int[])var87[0]))[3] = var53;
                                    }

                                    var88 = var87;
                                 } else if(12 == var50) {
                                    var88 = ta.a(var73, false, -112, new Object[19]);
                                 } else if(var50 == 6) {
                                    var88 = ta.a(var73, true, var0 ^ -31448, new Object[19]);
                                 } else if(var50 != 7) {
                                    if(var50 != 5) {
                                       if(1 == var50) {
                                          var88 = ml.a((byte)126, new Object[27], var73);
                                       } else if(var50 == 8) {
                                          Object[] var35 = new Object[10];
                                          if(var35[0] == null) {
                                             var35[0] = new int[7];
                                          }

                                          sea.b(var73, var35, (byte)-120);
                                          ((int[])((int[])var35[0]))[5] = de.a((int)0, var73);
                                          ((int[])((int[])var35[0]))[3] = de.a(var0 - 31399, var73);
                                          ((int[])((int[])var35[0]))[6] = de.a((int)0, var73);
                                          ((int[])((int[])var35[0]))[1] = de.a((int)0, var73);
                                          ((int[])((int[])var35[0]))[4] = de.a((int)0, var73);
                                          ((int[])((int[])var35[0]))[2] = de.a((int)0, var73);
                                          var88 = var35;
                                       } else if(var50 == 14) {
                                          Object[] var37 = new Object[22];
                                          if(var37[0] == null) {
                                             var37[0] = new int[3];
                                          }

                                          sea.b(var73, var37, (byte)-119);
                                          ((int[])((int[])var37[0]))[1] = de.a(var0 - 31399, var73);
                                          ((int[])((int[])var37[0]))[2] = fma.c(-17126, var73);
                                          var88 = var37;
                                       } else if(var50 == 15) {
                                          var88 = dua.a(var73, false, new Object[9]);
                                       } else if(30 == var50) {
                                          Object[] var39 = new Object[16];
                                          if(null == var39[0]) {
                                             var39[0] = new int[3];
                                          }

                                          sea.b(var73, var39, (byte)-121);
                                          ((int[])((int[])var39[0]))[1] = de.a((int)0, var73);
                                          ((int[])((int[])var39[0]))[2] = fh.a(var73, false);
                                          var88 = var39;
                                       } else if(var50 == 25) {
                                          Object[] var41 = new Object[20];
                                          sea.b(var73, var41, (byte)-126);
                                          var88 = var41;
                                       } else if(16 != var50) {
                                          if(var50 == 26) {
                                             var88 = va.a((byte)44, var73, new Object[3], 0, 0);
                                          } else if(22 != var50) {
                                             if(var50 == 13) {
                                                Object[] var45 = new Object[11];
                                                if(null == var45[0]) {
                                                   var45[0] = new int[2];
                                                }

                                                sea.b(var73, var45, (byte)-125);
                                                var45[8] = ara.b((byte)61, var73);
                                                ((int[])((int[])var45[0]))[1] = de.a((int)0, var73);
                                                var88 = var45;
                                             } else if(28 != var50) {
                                                if(23 != var50) {
                                                   if(var50 != 2) {
                                                      if(var50 != 0) {
                                                         if(var50 != 4) {
                                                            if(21 != var50) {
                                                               if(29 == var50) {
                                                                  var88 = maa.a(new Object[14], var73, false);
                                                               } else if(var50 != 10) {
                                                                  if(var50 == 20) {
                                                                     var88 = va.a((byte)121, var73, new Object[3], 0, 1);
                                                                  } else if(9 != var50) {
                                                                     if(var50 != 24) {
                                                                        if(27 != var50) {
                                                                           if(18 == var50) {
                                                                              var88 = jk.a(true, var73, new Object[6]);
                                                                           }
                                                                        } else {
                                                                           var88 = va.a((byte)125, var73, new Object[3], 1, 0);
                                                                        }
                                                                     } else {
                                                                        var88 = fra.a(38, new Object[12], var73);
                                                                     }
                                                                  } else {
                                                                     Object[] var49 = new Object[23];
                                                                     if(var49[0] == null) {
                                                                        var49[0] = new int[3];
                                                                     }

                                                                     sea.b(var73, var49, (byte)-120);
                                                                     ((int[])((int[])var49[0]))[2] = de.a((int)0, var73);
                                                                     ((int[])((int[])var49[0]))[1] = lr.a(var0 - 31398, var73);
                                                                     var88 = var49;
                                                                  }
                                                               } else {
                                                                  Object[] var47 = new Object[17];
                                                                  if(null == var47[0]) {
                                                                     var47[0] = new int[6];
                                                                  }

                                                                  sea.b(var73, var47, (byte)-123);
                                                                  ((int[])((int[])var47[0]))[1] = de.a(var0 - 31399, var73);
                                                                  ((int[])((int[])var47[0]))[3] = de.a((int)0, var73);
                                                                  ((int[])((int[])var47[0]))[4] = de.a((int)0, var73);
                                                                  ((int[])((int[])var47[0]))[5] = de.a(var0 ^ 31399, var73);
                                                                  ((int[])((int[])var47[0]))[2] = de.a((int)0, var73);
                                                                  var88 = var47;
                                                               }
                                                            } else {
                                                               var88 = va.a((byte)9, var73, new Object[3], 1, 1);
                                                            }
                                                         } else {
                                                            var88 = ke.a(new Object[24], var73, var0 ^ -31482);
                                                         }
                                                      } else {
                                                         var88 = wka.a(var73, 119, new Object[15]);
                                                      }
                                                   } else {
                                                      var88 = pm.a(new Object[1], var73, (byte)-128);
                                                   }
                                                } else {
                                                   var88 = voa.a(var0 ^ 31428, var73, new Object[13]);
                                                }
                                             } else {
                                                var88 = qoa.a(new Object[21], var73, (byte)118);
                                             }
                                          } else {
                                             var88 = va.a(var73, new Object[5], -98);
                                          }
                                       } else {
                                          Object[] var43 = new Object[4];
                                          if(var43[0] == null) {
                                             var43[0] = new int[2];
                                          }

                                          sea.b(var73, var43, (byte)-120);
                                          ((int[])((int[])var43[0]))[1] = de.a((int)0, var73);
                                          var88 = var43;
                                       }
                                    } else {
                                       Object[] var33 = new Object[7];
                                       if(null == var33[0]) {
                                          var33[0] = new int[2];
                                       }

                                       sea.b(var73, var33, (byte)-122);
                                       ((int[])((int[])var33[0]))[1] = de.a((int)0, var73);
                                       var88 = var33;
                                    }
                                 } else {
                                    var88 = kta.a(new Object[18], var0 ^ -31436, var73);
                                 }

                                 var85[var83] = var88;
                              }

                              rka.c = md.f_i;
                           }

                           if(rka.c == md.f_i) {
                              boolean var74 = true;
                              Object[][] var70 = sha.d;

                              for(var17 = 0; var70.length > var17; ++var17) {
                                 var67 = var70[var17];
                                 if(!ora.a(var67, (byte)-120)) {
                                    var74 = false;
                                 }
                              }

                              if(var56 != null && (19 == var56.length || 8 == var56.length && var56[3].equals(Integer.valueOf(2)) || var56.length == 6)) {
                                 ata.a(0);
                              }

                              if(!var74) {
                                 var65 = false;
                                 break label1377;
                              }

                              rka.c = md.c;
                           }

                           var65 = true;
                        }

                        if(var65) {
                           gt.a((byte)125);
                           bw.b = 1;
                        }
                     }

                     if(bw.b == 1 && 13 != ipa.d) {
                        ona.a(ita.f, var0 ^ 31437);
                        af.t = 0;
                        we.g = kda.d;
                        bw.b = 0;
                        bna.a(-1);
                     }

                     if(bw.b == 0) {
                        var72 = -we.g + kda.d;
                        if(~af.t > ~sha.d.length) {
                           if(var56 != null && 10 == var56.length) {
                              ((boolean[])((boolean[])hi.c[1]))[7] = true;
                           }

                           do {
                              var13 = sha.d[af.t];
                              if(((int[])((int[])var13[0]))[0] > var72) {
                                 break;
                              }

                              if(var13 != null && -14 == ~var13.length) {
                                 var14 = qs.c[((int[])((int[])var13[0]))[2]];
                                 var15 = ((int[])((int[])var13[0]))[4];
                                 var16 = ((int[])((int[])var13[0]))[3];
                                 var17 = ((int[])((int[])var13[0]))[5];
                                 var18 = ((int[])((int[])var13[0]))[1];
                                 nfa.a(var18, ((int[])((int[])var14[0]))[3], true, var15, var16, tv.b[((int[])((int[])var14[0]))[3]], ((int[])((int[])var14[0]))[1], var17);
                                 ((int[])((int[])var14[0]))[5] = var15;
                                 ((int[])((int[])var14[0]))[4] = var17;
                                 ((int[])((int[])var14[0]))[0] = var18;
                                 ((int[])((int[])var14[0]))[2] = var16;
                              } else if(null != var13 && var13.length == 8) {
                                 lj.a(var0 - 27317, var13);
                              } else if(var13 != null && -8 == ~var13.length) {
                                 oda.a(var13, (byte)44);
                              } else if(null != var13 && var13.length == 4) {
                                 ec.a((byte)33, var13);
                              } else if(null != var13 && 12 == var13.length) {
                                 qv.a(((int[])((int[])var13[0]))[2] << 16, ((int[])((int[])var13[0]))[3], false, ((int[])((int[])var13[0]))[4], -59, ((int[])((int[])var13[0]))[1], ((int[])((int[])var13[0]))[5], za.a(ofa.e[((int[])((int[])var13[0]))[6]], (byte)93));
                              } else if(var13 != null && -25 == ~var13.length) {
                                 se.a(var13, (int)126);
                              } else if(var13 != null && var13.length == 10) {
                                 sr.a(false, bw.f[((int[])((int[])var13[0]))[5]], 0);
                                 sr.a(false, bw.f[((int[])((int[])var13[0]))[3]], 1);
                                 jj.z = 0;
                                 wb.f = ((int[])((int[])var13[0]))[1];
                                 sf.b = ((int[])((int[])var13[0]))[2];
                                 ka.n = ((int[])((int[])var13[0]))[4];
                                 nta.e = 1;
                                 mg.a = 0;
                                 wha.j = ((int[])((int[])var13[0]))[6];
                                 ha.e = 2;
                                 rd.a(2);
                                 cpa.f_i = true;
                              } else if(null != var13 && 20 == var13.length) {
                                 ew.f_l = null;
                                 cpa.f_i = false;
                                 bw.b = 3;
                                 ffa.b = (int[][])null;
                                 ms.a(var0 - 31399);
                                 lj.a(ona.a((byte)123, (Object[])((Object[])lba.f[7]), vf.f_l), 6, lba.f);
                              } else if(null != var13 && var13.length == 9) {
                                 fsa.a(((int[])((int[])var13[0]))[5], ofa.e[((int[])((int[])var13[0]))[4]], ((int[])((int[])var13[0]))[1], (byte)80, ((int[])((int[])var13[0]))[2], ((int[])((int[])var13[0]))[3]);
                              } else if(null != var13 && -4 == ~var13.length) {
                                 if(null != var56 && var56.length == 5) {
                                    tna.b = (int[])((int[])((Object[])((Object[])hi.c[14]))[2]);
                                 }

                                 Object[] var77;
                                 Object[] var81;
                                 if(-1 < ~((int[])((int[])var13[0]))[7]) {
                                    var81 = za.a(ofa.e[((int[])((int[])var13[0]))[11]], (byte)93);
                                    var77 = (Object[])((Object[])woa.a(var0 - 31394, var81)[1]);
                                    var15 = (int)((float[])((float[])var77[1]))[2];
                                    var19 = ((byte[])((byte[])var81[10]))[0];
                                    var16 = (int)((float[])((float[])var77[1]))[1];
                                 } else {
                                    var19 = ((int[])((int[])var13[0]))[12];
                                    var15 = 256 + 512 * ((int[])((int[])var13[0]))[7];
                                    var16 = ((int[])((int[])var13[0]))[5] * 512 + 256;
                                 }

                                 if(-1 < ~((int[])((int[])var13[0]))[5]) {
                                    var81 = za.a(ofa.e[((int[])((int[])var13[0]))[8]], (byte)93);
                                    var77 = (Object[])((Object[])woa.a(5, var81)[1]);
                                    var17 = (int)((float[])((float[])var77[1]))[2];
                                    if(0 > var19) {
                                       var19 = ((byte[])((byte[])var81[10]))[0];
                                    }

                                    var18 = (int)((float[])((float[])var77[1]))[1];
                                 } else {
                                    var17 = 256 + ((int[])((int[])var13[0]))[6] * 512;
                                    var18 = ((int[])((int[])var13[0]))[3] * 512 + 256;
                                 }

                                 var75 = ((int[])((int[])var13[0]))[4] << 2;
                                 var77 = bja.a(var19, ((int[])((int[])var13[0]))[1], ((int[])((int[])var13[0]))[10], ((int[])((int[])var13[0]))[13] + kda.d, var16, 1 + ((int[])((int[])var13[0]))[8], 0, var19, new Object[24], ((int[])((int[])var13[0]))[11] + 1, ((int[])((int[])var13[0]))[2] << 2, false, var75, kda.d, ((int[])((int[])var13[0]))[9] << 2, var0 - 21818, var15);
                                 fn.a(var18, kda.d + ((int[])((int[])var13[0]))[13], var17, var77, ((int[])((int[])var13[0]))[9] << 2, 109);
                                 client.a(126, gn.r, (lm)(null == (var14 = vm.a(var77, var0 ^ 15057, new Object[2]))?null:var14[1]));
                              } else if(var13 != null && var13.length == 11) {
                                 if(ai.h != -1) {
                                    ata.a(1, ai.h, ((int[])((int[])var13[0]))[1], (String)var13[8]);
                                 }
                              } else if(null != var13 && 22 == var13.length) {
                                 var14 = qs.c[((int[])((int[])var13[0]))[1]];
                                 qv.a(((int[])((int[])var14[0]))[3], ((int[])((int[])var14[0]))[2], ((int[])((int[])var14[0]))[0], 23439, ((int[])((int[])var13[0]))[2], ((int[])((int[])var14[0]))[5], tv.b[((int[])((int[])var14[0]))[3]], ((int[])((int[])var14[0]))[4]);
                              } else if(var13 != null && var13.length == 15) {
                                 mna.a(var13, 2898);
                              } else if(var13 != null && -22 == ~var13.length) {
                                 qpa.b(var13, var0 + -41082);
                              } else if(null != var13 && var13.length == 17) {
                                 ira.a(-81, var13);
                              } else if(null != var13 && var13.length == 6) {
                                 oa.a((lh)var13[3], ((int[])((int[])var13[0]))[1], true);
                              } else if(var13 != null && 19 == var13.length) {
                                 ma var64;
                                 var73 = null == (var64 = (ma)pm.a(((long[])((long[])var13[16]))[0], ita.f, false))?null:var64.s;
                                 if(null == var73) {
                                    di.a(ita.f, true, (lm)(null != (var69 = ps.a((byte)125, ((int[])((int[])var13[0]))[1], new Object[2]))?var69[0]:null), ((long[])((long[])var13[16]))[0]);
                                 } else {
                                    ((int[])((int[])var73[1]))[0] = ((int[])((int[])var13[0]))[1];
                                 }
                              } else if(var13 != null && var13.length == 27) {
                                 gw.a(var0 ^ 31396, var13);
                              } else if(var13 != null && -19 == ~var13.length) {
                                 rja.a(var13, (byte)81);
                              } else if(var13 != null && 1 == var13.length) {
                                 var14 = ofa.e[((int[])((int[])var13[0]))[3]];
                                 var69 = wv.g[((int[])((int[])var13[0]))[2]];
                                 var16 = ((int[])((int[])var13[0]))[1];
                                 var17 = ((int[])((int[])var69[0]))[0];
                                 Class_cs.a(-119, var17 >>> 16, var14, var16, var17 & '\uffff');
                                 var67 = za.a(var14, (byte)93);
                                 ((int[])((int[])var67[12]))[18] = 0;

                                 for(var19 = ((int[])((int[])var69[1])).length - 1; 0 <= var19; --var19) {
                                    var75 = ((int[])((int[])var69[1]))[var19];
                                    var80 = ((int[])((int[])var69[0]))[var19];
                                    ((int[])((int[])var67[33]))[((int[])((int[])var67[12]))[18]] = var80 >> 16;
                                    ((int[])((int[])var67[14]))[((int[])((int[])var67[12]))[18]] = '\uffff' & var80;
                                    byte var79 = 1;
                                    if(0 != var75) {
                                       if(var75 == 2) {
                                          var79 = 2;
                                       }
                                    } else {
                                       var79 = 0;
                                    }

                                    ((byte[])((byte[])var67[22]))[((int[])((int[])var67[12]))[18]] = var79;
                                    ++((int[])((int[])var67[12]))[18];
                                 }
                              } else if(null != var13 && -17 == ~var13.length) {
                                 gi.a((byte)-105, var13);
                              } else if(null != var13 && var13.length == 23) {
                                 fn.b = ff.d;
                                 np.a = pp.k;
                                 hv.h = kda.d + ((int[])((int[])var13[0]))[2];
                                 ep.e = ppa.d;
                                 kga.f_l = kda.d;
                                 rb.e = sha.j;
                                 ff.d = ((int[])((int[])var13[0]))[1] >>> 24;
                                 if(null != var56 && var56.length == 14) {
                                    client.a((Object[])null);
                                 }

                                 pp.k = -1543569153 & ((int[])((int[])var13[0]))[1] >>> 16;
                                 sha.j = ((int[])((int[])var13[0]))[1] & 255;
                                 ppa.d = ((int[])((int[])var13[0]))[1] >>> 8 & 1191182591;
                              } else if(null != var13 && var13.length == 14) {
                                 fta.b((byte)126, var13);
                              } else {
                                 if(var13 == null || 5 != var13.length) {
                                    throw new IllegalStateException();
                                 }

                                 hn.a(var13, 86);
                              }
                           } while(0 == bw.b && ++af.t < sha.d.length);
                        }

                        if(0 == bw.b) {
                           if(null != var56 && var56.length == 23 && var56[3].equals(Integer.valueOf(0)) && var56[3].equals(Integer.valueOf(2))) {
                              client.m(109);
                           }

                           for(var58 = 0; ~var58 > ~ofa.e.length; ++var58) {
                              var14 = ofa.e[var58];
                              if(((boolean[])((boolean[])var14[2]))[0]) {
                                 var69 = za.a(var14, (byte)93);
                                 hf.a(var69, true, (byte)105);
                              }
                           }
                        }
                     }
                  } else {
                     mda.b((byte)-117);

                     for(var72 = 0; rba.h > var72; ++var72) {
                        var58 = gr.c[var72];
                        hna var68 = (hna)pm.a((long)var58, hf.g, false);
                        if(null != var68) {
                           var69 = var68.k;
                           hf.a(var69, false, (byte)105);
                        }
                     }

                     if(null != var56 && 4 == var56.length) {
                        tra.g = 97;
                     }
                  }

                  ata.a(0);
                  if(!jn.g) {
                     joa.a(false);
                     jn.g = true;
                  }

                  haa.a(15);
                  if(lha.d != 0) {
                     moa.f += 20;
                     if(moa.f >= 400) {
                        lha.d = 0;
                     }
                  }

                  ++Class_ds.c;
                  if(null != fca.f) {
                     ++kb.c;
                     if(kb.c >= 15) {
                        vr.a(fca.f, (int)24);
                        fca.f = null;
                     }
                  }

                  tj.j = false;
                  ql.e = false;
                  wsa.g = null;
                  ona.d = null;
                  ora.a(-1, -11, -1, (Object[])null);
                  if(!ra.h) {
                     jf.c = -1;
                  }

                  ka.a(var0 ^ var0);
                  ++qr.a;
                  if(noa.e) {
                     ++rk.d;
                     var55 = ona.a((byte)116, (Object[])((Object[])lba.f[7]), cf.g);
                     vh.putIntLE(0, (Object[])((Object[])var55[0]), nja.a | iqa.f_l << 14 | fb.e << 28);
                     lj.a(var55, var0 ^ 31393, lba.f);
                     noa.e = false;
                  }

                  while(true) {
                     bs var5;
                     var55 = null == (var5 = (bs)jca.b((byte)-120, mna.a))?null:var5.o;
                     if(var55 == null) {
                        while(true) {
                           bs var6;
                           var55 = (var6 = (bs)jca.b((byte)-128, oq.a)) == null?null:var6.o;
                           if(null == var55) {
                              while(true) {
                                 bs var7;
                                 var55 = null != (var7 = (bs)jca.b((byte)-117, it.b))?var7.o:null;
                                 if(var55 == null) {
                                    if(null == ona.d) {
                                       pja.g = 0;
                                    }

                                    if(dca.e != null) {
                                       hq.a(-116);
                                    }

                                    if(oda.h > 0 && oc.a(lja.a, 82, (byte)-73) && oc.a(lja.a, 81, (byte)-23) && 0 != cea.f) {
                                       var72 = -cea.f + ((byte[])((byte[])uta.g[10]))[0];
                                       if(0 > var72) {
                                          var72 = 0;
                                       } else if(var72 > 3) {
                                          var72 = 3;
                                       }

                                       fi.a(var72, ((int[])((int[])uta.g[33]))[0] + rs.f, (byte)-109, qm.d + ((int[])((int[])uta.g[14]))[0]);
                                    }

                                    voa.a(false);

                                    for(var72 = 0; 5 > var72; ++var72) {
                                       ++kb.f_i[var72];
                                    }

                                    if(dn.d && he.a(var0 ^ -31434) - 60000L > jsa.c) {
                                       qv.a(-89);
                                    }

                                    oia var8;
                                    oia var9;
                                    for(var55 = (var8 = (oia)om.a(qc.a, false)) != null?var8.v:null; null != var55; var55 = null != (var9 = (oia)pw.a(qc.a, var0 ^ -31427))?var9.v:null) {
                                       if(he.a(var0 - 31491) / 1000L - 5L > (long)((int[])((int[])var55[1]))[0]) {
                                          if(-1 > ~((short[])((short[])var55[3]))[0]) {
                                             jl.a("", 5, 8191, "", "", 0, (String)var55[2] + gj.a(dp.y, 101, gj.Z));
                                          }

                                          if(-1 == ~((short[])((short[])var55[3]))[0]) {
                                             jl.a("", 5, var0 ^ 25944, "", "", 0, (String)var55[2] + gj.a(dp.y, var0 - 31280, gj.H));
                                          }

                                          ((nj)(null != var55?var55[0]:null)).a(var0 - 31398);
                                       }
                                    }

                                    ++ah.h;
                                    if(ah.h > 500) {
                                       ah.h = 0;
                                       var72 = (int)(8.0D * Math.random());
                                       if(-2 == ~(1 & var72)) {
                                          vq.d += pha.f_i;
                                       }

                                       if(4 == (4 & var72)) {
                                          cra.m += hsa.h;
                                       }

                                       if(-3 == ~(var72 & 2)) {
                                          ji.c += kk.h;
                                       }
                                    }

                                    if(vq.d < -50) {
                                       pha.f_i = 2;
                                    }

                                    if(-55 > ji.c) {
                                       kk.h = 2;
                                    }

                                    if(50 < vq.d) {
                                       pha.f_i = -2;
                                    }

                                    if(ji.c > 55) {
                                       kk.h = -2;
                                    }

                                    if(-40 > cra.m) {
                                       hsa.h = 1;
                                    }

                                    ++hha.b;
                                    if(40 < cra.m) {
                                       hsa.h = -1;
                                    }

                                    if(500 < hha.b) {
                                       hha.b = 0;
                                       var72 = (int)(Math.random() * 8.0D);
                                       if((var72 & 2) == 2) {
                                          kma.b += cd.n;
                                       }

                                       if((var72 & 1) == 1) {
                                          coa.v += cla.f;
                                       }
                                    }

                                    if(coa.v < -60) {
                                       cla.f = 2;
                                    }

                                    if(-20 > kma.b) {
                                       cd.n = 1;
                                    }

                                    if(60 < coa.v) {
                                       cla.f = -2;
                                    }

                                    if(kma.b > 10) {
                                       cd.n = -1;
                                    }

                                    ++((int[])((int[])lba.f[1]))[6];
                                    if(50 < ((int[])((int[])lba.f[1]))[6]) {
                                       ++dn.b;
                                       var55 = ona.a((byte)120, (Object[])((Object[])lba.f[7]), iba.f);
                                       lj.a(var55, var0 - 31393, lba.f);
                                    }

                                    if(ata.g) {
                                       iha.a(17061);
                                       ata.g = false;
                                    }

                                    try {
                                       dv.a((byte)126, lba.f);
                                    } catch (IOException var54) {
                                       wv.a((byte)90);
                                    }

                                    return;
                                 }

                                 var13 = (Object[])((Object[])var55[0]);
                                 if(((int[])((int[])var13[1]))[47] >= 0) {
                                    var14 = hg.a(((int[])((int[])var13[1]))[39], (byte)-117);
                                    if(var14 == null || null == var14[48] || ~((Object[])((Object[])var14[48])).length >= ~((int[])((int[])var13[1]))[47] || var13 != ((Object[][])((Object[][])var14[48]))[((int[])((int[])var13[1]))[47]]) {
                                       continue;
                                    }
                                 }

                                 ck.a(var55, true);
                              }
                           }

                           var13 = (Object[])((Object[])var55[0]);
                           if(((int[])((int[])var13[1]))[47] >= 0) {
                              var14 = hg.a(((int[])((int[])var13[1]))[39], (byte)-100);
                              if(null == var14 || null == var14[48] || ~((Object[])((Object[])var14[48])).length >= ~((int[])((int[])var13[1]))[47] || ((Object[][])((Object[][])var14[48]))[((int[])((int[])var13[1]))[47]] != var13) {
                                 continue;
                              }
                           }

                           ck.a(var55, true);
                        }
                     }

                     var13 = (Object[])((Object[])var55[0]);
                     if(-1 >= ~((int[])((int[])var13[1]))[47]) {
                        var14 = hg.a(((int[])((int[])var13[1]))[39], (byte)-125);
                        if(var14 == null || null == var14[48] || ~((Object[])((Object[])var14[48])).length >= ~((int[])((int[])var13[1]))[47] || ((Object[][])((Object[][])var14[48]))[((int[])((int[])var13[1]))[47]] != var13) {
                           continue;
                        }
                     }

                     ck.a(var55, true);
                  }
               }

               var55 = ona.a((byte)116, (Object[])((Object[])lba.f[7]), vm.b);
               ek.putByte((Object[])((Object[])var55[0]), 0);
               var58 = ((int[])((int[])((Object[])((Object[])var55[0]))[1]))[0];
               sda.a((Object[])((Object[])var55[0]), (byte)-101);
               oda.a(((int[])((int[])((Object[])((Object[])var55[0]))[1]))[0] - var58, (Object[])((Object[])var55[0]), (byte)-37);
               lj.a(var55, 6, lba.f);
            }
         }
      }
   }

}
