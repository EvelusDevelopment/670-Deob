import jaggl.OpenGL;

final class nha {

   static int a;
   static int d;
   static Object[] b = ho.a(-2, 82, new Object[1], true);
   static int e;
   static int[] c;


   static final void a(Object[] var0, int var1, int var2) {
      if(~var2 != ~((int[])((int[])var0[1]))[6]) {
         OpenGL.glActiveTexture(var2 + '\u84c0');
         ((int[])((int[])var0[1]))[6] = var2;
      }

      if(var1 != 18806) {
         a(59, (Object[])null);
      }

      ++d;
   }

   static final void a(int var0, Object[] var1) {
      ((int[])((int[])var1[1]))[8] = 8;
      ++e;
      ((int[])((int[])var1[var0]))[2] = 16777215;
   }

   static final boolean a(Object[] var0, boolean var1) {
      if(!var1) {
         a((Object[])null, ((int[])((int[])b[0]))[2], ((int[])((int[])((Object[])((Object[])((Object[])((Object[])b[19]))[21]))[1]))[0]);
      }

      ++a;
      if(var0 != null && 12 == var0.length) {
         boolean var2;
         if(md.a(var0, (byte)21)) {
            Object[] var3 = (Object[])((Object[])var0[2]);
            if(!hp.a(-126, (Object[])((Object[])var0[5]), ((int[])((int[])var3[1]))[9])) {
               var2 = false;
            } else if(hp.a(-127, (Object[])((Object[])var0[5]), ((int[])((int[])var3[1]))[10])) {
               if(hp.a(-128, (Object[])((Object[])var0[5]), ((int[])((int[])var3[1]))[7])) {
                  if(hp.a(-128, (Object[])((Object[])var0[5]), ((int[])((int[])var3[1]))[11])) {
                     if(!hp.a(-127, (Object[])((Object[])var0[5]), ((int[])((int[])var3[1]))[12])) {
                        var2 = false;
                     } else if(!hp.a(-126, (Object[])((Object[])var0[5]), ((int[])((int[])var3[1]))[8])) {
                        var2 = false;
                     } else {
                        var2 = true;
                     }
                  } else {
                     var2 = false;
                  }
               } else {
                  var2 = false;
               }
            } else {
               var2 = false;
            }
         } else {
            var2 = false;
         }

         return var2;
      } else {
         return null != var0 && var0.length == 9?ul.a(1, var0):md.a(var0, (byte)21);
      }
   }

   static final void a(int var0, int var1, int var2, int var3, byte[][][] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int var10, byte var11, int var12, int var13, boolean var14, boolean var15, int var16, boolean var17) {
      bqa.f_i = true;
      ug.f = mpa.b.x() > 0;
      es.e = var15;
      bd.h = var1 >> qqa.e;
      oaa.a = var3 >> qqa.e;
      Class_cs.e = var1;
      pha.d = var3;
      mpa.d = var2;
      oia.z = bd.h - vt.d;
      if(oia.z < 0) {
         li.y = -oia.z;
         oia.z = 0;
      } else {
         li.y = 0;
      }

      tba.h = oaa.a - vt.d;
      if(tba.h < 0) {
         hq.k = -tba.h;
         tba.h = 0;
      } else {
         hq.k = 0;
      }

      ph.b = bd.h + vt.d;
      if(ph.b > eja.c) {
         ph.b = eja.c;
      }

      hja.d = oaa.a + vt.d;
      if(hja.d > me.c) {
         hja.d = me.c;
      }

      boolean[][] var21 = ju.e;
      boolean[][] var22 = uq.k;
      int var23;
      int var25;
      int var24;
      int var27;
      int var26;
      if(es.e) {
         for(var23 = 0; var23 < vt.d + vt.d + 2; ++var23) {
            var24 = 0;
            var25 = 0;

            for(var26 = 0; var26 < vt.d + vt.d + 2; ++var26) {
               if(var26 > 1) {
                  mta.b[var26 - 2] = var24;
               }

               var24 = var25;
               var27 = bd.h - vt.d + var23;
               int var28 = oaa.a - vt.d + var26;
               int var29;
               if(var27 >= 0 && var28 >= 0 && var27 < eja.c && var28 < me.c) {
                  var29 = var27 << qqa.e;
                  int var30 = var28 << qqa.e;
                  int var31 = bf.f_l[bf.f_l.length - 1].b(-95, var28, var27) - (1000 << qqa.e - 7);
                  int var32 = (wd.a != null?wd.a[0].b(-53, var28, var27) + iia.n:bf.f_l[0].b(-69, var28, var27) + iia.n) + (1000 << qqa.e - 7);
                  var25 = mpa.b.a(var29, var31, var30, var29, var32, var30);
                  uq.k[var23][var26] = var25 == 0;
               } else {
                  var25 = -1;
                  uq.k[var23][var26] = false;
               }

               if(var23 > 0 && var26 > 0) {
                  var29 = mta.b[var26 - 1] & mta.b[var26] & var24 & var25;
                  ju.e[var23 - 1][var26 - 1] = var29 == 0;
               }
            }

            mta.b[vt.d + vt.d] = var24;
            mta.b[vt.d + vt.d + 1] = var25;
         }

         if(!var17) {
            bqa.f_i = false;
         } else {
            aua.e = var5;
            bs.k = var6;
            jh.c = var7;
            ki.f_i = var8;
            jl.d = var9;
            esa.a(mpa.b, var10, -1);
         }
      } else {
         if(jma.d == null) {
            jma.d = new boolean[eja.c + eja.c + 1][me.c + eja.c + 1];
         }

         for(var23 = 0; var23 < jma.d.length; ++var23) {
            for(var24 = 0; var24 < jma.d[0].length; ++var24) {
               jma.d[var23][var24] = true;
            }
         }

         uq.k = jma.d;
         ju.e = jma.d;
         oia.z = 0;
         tba.h = 0;
         ph.b = eja.c;
         hja.d = me.c;
         bqa.f_i = false;
      }

      kj.a(mpa.b, -126);
      Object[] var33;
      if(!((boolean[])((boolean[])gu.b[2]))[0]) {
         Object[] var34 = (Object[])((Object[])gu.b[0]);

         uq var19;
         uq var18;
         for(var33 = (var18 = (uq)om.a(var34, false)) == null?null:var18.f_l; var33 != null; var33 = (var19 = (uq)pw.a(var34, -79)) == null?null:var19.f_l) {
            ((nj)(var33 == null?null:var33[0])).a(1);
            ie.a(var33, 23247);
         }
      }

      if(ug.f) {
         for(var23 = 0; var23 < rga.e; ++var23) {
            var33 = qd.c[var23];
            if(var14) {
               var25 = 2048;
            } else {
               var26 = ((int[])((int[])var33[1]))[6] * var0 / 50 + ((int[])((int[])var33[1]))[4] & 2047;
               var27 = ((int[])((int[])var33[1]))[3];
               if(var27 != 1) {
                  if(var27 == 5) {
                     var25 = (1024 > var26?var26:2048 + -var26) << 1;
                  } else if(var27 != 2) {
                     if(3 == var27) {
                        var25 = gpa.b[var26] >> 1;
                     } else if(4 != var27) {
                        var25 = 2048;
                     } else {
                        var25 = var26 >> 10 << 11;
                     }
                  } else {
                     var25 = var26;
                  }
               } else {
                  var25 = 1024 + (tda.p[var26 << 3] >> 4);
               }
            }

            tpa.a((Object[])((Object[])var33[3]), (byte)54, (float)(((int[])((int[])var33[1]))[1] + (var25 * ((int[])((int[])var33[1]))[0] >> 11)) / 2048.0F);
         }
      }

      if(et.a) {
         mpa.b.TA(bf.a);
         var23 = (bf.a[2] - bf.a[0]) / ofa.a;

         for(var24 = 0; var24 < ofa.a - 1; ++var24) {
            ima.g[var24] = var23 * (var24 + 1) + cu.a[var24];
         }

         for(var24 = 0; var24 < sc.b.length; ++var24) {
            sc.b[var24].c();
         }
      }

      if(sr.e != null) {
         if(et.a) {
            mna.a((int)0);
         }

         bs.b(true);
         mpa.b.b(-1, nt.a(63, 127, 1583160, new Object[1], 0, -21369, 40, 0, 0));
         uda.a(true, var4, var10, var11, var16);
         if(et.a) {
            nma.a();
         }

         mpa.b.ra();
         bs.b(false);
      }

      uda.a(false, var4, var10, var11, var16);
      if(et.a) {
         for(var23 = 0; var23 < ri.n; ++var23) {
            qj.a[var23] = rka.e[var23];
         }

         mna.a((int)0);

         for(var23 = 0; var23 < sc.b.length; ++var23) {
            sc.b[var23].c();
         }
      }

      if(et.a) {
         nma.a();

         for(var23 = 0; var23 < ri.n; ++var23) {
            rka.e[var23] = qj.a[var23];
         }

         if(bq.e == 2) {
            if(jca.r[0] < jca.r[1]) {
               if(ima.g[0] + cu.a[0] > bf.a[0]) {
                  ++cu.a[0];
               }
            } else if(jca.r[0] > jca.r[1] && ima.g[0] + cu.a[0] < bf.a[2]) {
               --cu.a[0];
            }
         }
      }

      if(!es.e) {
         ju.e = var21;
         uq.k = var22;
      }

   }

}
