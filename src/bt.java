import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

final class bt {

   static Object[] c = sl.a("22", 0, new Object[1], "22");
   static int g;
   static int[] e = new int[5];
   static int b;
   static int f;
   static int a;
   static int d;


   static final void a(Object[] var0, boolean var1) {
      ++f;
      if(null != var0 && var0.length == 87) {
         be.a(var0, -85);
      } else if(var0 != null && 91 == var0.length) {
         nq.b(var0, (byte)124);
      } else {
         if(!var1) {
            c = (Object[])null;
         }

         throw new IllegalStateException();
      }
   }

   static final void a(int var0, int var1, int var2, int var3, byte var4) {
      ++d;
      if(var4 >= 70) {
         tda var5;
         tda var6;
         Object[] var11;
         for(var11 = null != (var5 = (tda)dda.a(fla.a, 2))?var5.f_l:null; var11 != null; var11 = (var6 = (tda)client.a(fla.a, -28280)) != null?var6.f_l:null) {
            kj.a(var0, var11, var1, var3, var2, (byte)-120);
         }

         tda var7;
         tda var8;
         byte var12;
         Object[] var13;
         int var14;
         int var15;
         Object[] var19;
         for(var11 = (var7 = (tda)dda.a(nga.g, 2)) == null?null:var7.f_l; var11 != null; var11 = null != (var8 = (tda)client.a(nga.g, -28280))?var8.f_l:null) {
            var12 = 1;
            var13 = ro.a((int)3, (Object[])((Object[])var11[3]));
            if(null != var13 && 12 == var13.length && var13[8].equals(Integer.valueOf(2))) {
               a(((int[])((int[])fla.a[4]))[4], ((int[])((int[])((Object[])((Object[])qn.g[1]))[3]))[0], 9, -16, (byte)125);
            }

            var14 = lt.a((byte)100, (Object[])((Object[])((Object[])((Object[])var11[3]))[30]));
            if(~var14 != 0 && !((boolean[])((boolean[])((Object[])((Object[])var11[3]))[8]))[7]) {
               if(((int[])((int[])var13[1]))[10] != var14 && ((int[])((int[])var13[1]))[25] != var14 && ((int[])((int[])var13[1]))[23] != var14 && ((int[])((int[])var13[1]))[28] != var14) {
                  if(((int[])((int[])var13[1]))[22] == var14 || ~var14 == ~((int[])((int[])var13[1]))[11] || ~var14 == ~((int[])((int[])var13[1]))[9] || ((int[])((int[])var13[1]))[37] == var14) {
                     var12 = 3;
                  }
               } else {
                  var12 = 2;
               }
            } else {
               var12 = 0;
            }

            if(((int[])((int[])var11[1]))[2] != var12) {
               var15 = ji.a((Object[])((Object[])var11[3]), (byte)120);
               Object[] var16 = (Object[])((Object[])((Object[])((Object[])var11[3]))[42]);
               if(var16[11] != null) {
                  var16 = ria.a(eo.g, var16, -73);
               }

               if(null != var16 && -1 != var15) {
                  if(((int[])((int[])var11[1]))[13] == var15 && ((boolean[])((boolean[])var16[8]))[0] != !((boolean[])((boolean[])var11[8]))[2]) {
                     ((int[])((int[])var11[1]))[12] = ((int[])((int[])var16[1]))[1];
                     ((int[])((int[])var11[1]))[2] = var12;
                  } else {
                     boolean var17 = false;
                     if(null == var11[6]) {
                        var17 = true;
                     } else {
                        ((int[])((int[])var11[1]))[12] -= 512;
                        if(((int[])((int[])var11[1]))[12] <= 0) {
                           ah.d.b((kp)var11[6]);
                           var11[6] = null;
                           var17 = true;
                        }
                     }

                     if(var17) {
                        ((boolean[])((boolean[])var11[8]))[2] = ((boolean[])((boolean[])var16[8]))[0];
                        var11[10] = null;
                        ((int[])((int[])var11[1]))[12] = ((int[])((int[])var16[1]))[1];
                        ((int[])((int[])var11[1]))[2] = var12;
                        var11[7] = null;
                        ((int[])((int[])var11[1]))[13] = var15;
                     }
                  }
               } else {
                  ((int[])((int[])var11[1]))[2] = var12;
                  ((boolean[])((boolean[])var11[8]))[2] = false;
                  ((int[])((int[])var11[1]))[13] = -1;
               }
            }

            var19 = (Object[])((Object[])woa.a(5, (Object[])((Object[])var11[3]))[1]);
            ((int[])((int[])var11[1]))[10] = (int)((float[])((float[])var19[1]))[2];
            ((int[])((int[])var11[1]))[1] = (int)((float[])((float[])var19[1]))[2] + (dg.a(-88, (Object[])((Object[])var11[3])) << 8);
            ((int[])((int[])var11[1]))[5] = (int)((float[])((float[])var19[1]))[1];
            ((int[])((int[])var11[1]))[4] = (int)((float[])((float[])var19[1]))[1] + (dg.a(-87, (Object[])((Object[])var11[3])) << 8);
            ((int[])((int[])var11[1]))[8] = ((byte[])((byte[])((Object[])((Object[])var11[3]))[10]))[0];
            kj.a(var0, var11, var1, var3, var2, (byte)-120);
         }

         tda var9;
         tda var10;
         for(var11 = (var9 = (tda)qt.a(0, qn.g)) != null?var9.f_l:null; null != var11; var11 = (var10 = (tda)nda.a(1, qn.g)) == null?null:var10.f_l) {
            if(var11 != null && (var11.length == 20 && var11[13].equals(Integer.valueOf(2)) || -11 == ~var11.length)) {
               fla.a = new Object[3][];
            }

            var12 = 1;
            var13 = ro.a((int)3, (Object[])((Object[])var11[5]));
            var14 = lt.a((byte)-114, (Object[])((Object[])((Object[])((Object[])var11[5]))[30]));
            if(-1 != var14 && !((boolean[])((boolean[])((Object[])((Object[])var11[5]))[8]))[7]) {
               if(((int[])((int[])var13[1]))[10] != var14 && var14 != ((int[])((int[])var13[1]))[25] && ((int[])((int[])var13[1]))[23] != var14 && ((int[])((int[])var13[1]))[28] != var14) {
                  if(var14 == ((int[])((int[])var13[1]))[22] || ((int[])((int[])var13[1]))[11] == var14 || ((int[])((int[])var13[1]))[9] == var14 || var14 == ((int[])((int[])var13[1]))[37]) {
                     var12 = 3;
                  }
               } else {
                  var12 = 2;
               }
            } else {
               var12 = 0;
            }

            if(((int[])((int[])var11[1]))[2] != var12) {
               var15 = cja.a((byte)-80, (Object[])((Object[])var11[5]));
               if(((int[])((int[])var11[1]))[13] == var15 && ((boolean[])((boolean[])((Object[])((Object[])var11[5]))[8]))[12] != !((boolean[])((boolean[])var11[8]))[2]) {
                  ((int[])((int[])var11[1]))[12] = ((int[])((int[])((Object[])((Object[])var11[5]))[12]))[49];
                  ((int[])((int[])var11[1]))[2] = var12;
               } else {
                  boolean var20 = false;
                  if(null != var11[6]) {
                     ((int[])((int[])var11[1]))[12] -= 512;
                     if(-1 <= ~((int[])((int[])var11[1]))[12]) {
                        ah.d.b((kp)var11[6]);
                        var20 = true;
                        var11[6] = null;
                     }
                  } else {
                     var20 = true;
                  }

                  if(var20) {
                     ((int[])((int[])var11[1]))[12] = ((int[])((int[])((Object[])((Object[])var11[5]))[12]))[49];
                     var11[7] = null;
                     ((boolean[])((boolean[])var11[8]))[2] = ((boolean[])((boolean[])((Object[])((Object[])var11[5]))[8]))[12];
                     ((int[])((int[])var11[1]))[2] = var12;
                     ((int[])((int[])var11[1]))[13] = var15;
                     var11[10] = null;
                  }
               }
            }

            var19 = (Object[])((Object[])woa.a(5, (Object[])((Object[])var11[5]))[1]);
            ((int[])((int[])var11[1]))[10] = (int)((float[])((float[])var19[1]))[2];
            ((int[])((int[])var11[1]))[1] = (int)((float[])((float[])var19[1]))[2] + (gn.a((Object[])((Object[])var11[5]), (byte)-108) << 8);
            ((int[])((int[])var11[1]))[5] = (int)((float[])((float[])var19[1]))[1];
            ((int[])((int[])var11[1]))[4] = (int)((float[])((float[])var19[1]))[1] + (gn.a((Object[])((Object[])var11[5]), (byte)-121) << 8);
            ((int[])((int[])var11[1]))[8] = ((byte[])((byte[])((Object[])((Object[])var11[5]))[10]))[0];
            kj.a(var0, var11, var1, var3, var2, (byte)-120);
         }

      }
   }

   static final void a(int var0, int var1, byte var2) {
      ++g;
      if(var2 > -111) {
         ((byte[])((byte[])((Object[])((Object[])c[16]))[8]))[12] = -111;
      }

      if(!((boolean[])((boolean[])fk.j[0]))[2]) {
         if(nma.h == 1) {
            return;
         }

         if(bra.b && 2 == nma.h && ((String)kla.f[0]).equals(gj.a(dp.y, -105, gj.S))) {
            return;
         }
      }

      Object[] var8 = ssa.a((byte)36);
      int var9 = uga.a(gj.a(dp.y, -123, gj.f_l), var8, (byte)-27);
      int var10;
      Object[] var11;
      int var12;
      if(!uka.e) {
         ni var3;
         ni var4;
         for(var11 = null != (var3 = (ni)dda.a(ssa.d, 2))?var3.t:null; var11 != null; var11 = (var4 = (ni)client.a(ssa.d, -28280)) != null?var4.t:null) {
            var12 = et.a(var8, 2, var11);
            if(var12 > var9) {
               var9 = var12;
            }
         }

         ld.b = (!isa.g?22:26) + nma.h * kw.e;
         var9 += 8;
         var10 = nma.h * kw.e + 21;
      } else {
         nq var5;
         nq var6;
         for(var11 = (var5 = (nq)gm.a(rpa.b, 0)) != null?var5.u:null; null != var11; var11 = null != (var6 = (nq)dka.a(rpa.b, (byte)63))?var6.u:null) {
            if(1 == ((int[])((int[])var11[1]))[0]) {
               ni var7;
               var12 = et.a(var8, 2, (var7 = (ni)((tha)((Object[])((Object[])var11[0]))[0]).s) != null?var7.t:null);
            } else {
               String var14 = gj.a(-91, var11);
               int var13 = ob.a(var8, var14, false, sf.g);
               var12 = var13;
            }

            if(var9 < var12) {
               var9 = var12;
            }
         }

         if(null != var8 && var8.length == 6) {
            ((int[])((int[])tg.m[1]))[1] = 94;
         }

         var10 = 21 + fka.c * kw.e;
         var9 += 8;
         ld.b = fka.c * kw.e + (isa.g?26:22);
      }

      int var15 = var1 + -(var9 / 2);
      if(~wr.n > ~(var9 + var15)) {
         var15 = wr.n + -var9;
      }

      if(0 > var15) {
         var15 = 0;
      }

      var12 = var0;
      if(~nma.a > ~(var0 + var10)) {
         var12 = -var10 + nma.a;
      }

      if(0 > var12) {
         var12 = 0;
      }

      kb.a = var15;
      ff.a = var12;
      vta.v = var9;
      kea.c = true;
      if(var8 != null && 6 == var8.length) {
         joa.a(3, (Object[])null);
      }

   }

   static final int a(Object[] var0, byte var1) {
      if(var1 >= -38) {
         return 2;
      } else {
         ++a;
         return ((int[])((int[])var0[1]))[0];
      }
   }

   static final cga a(byte[] var0, byte var1) {
      try {
         ++b;
         int var2 = 35 / ((47 - var1) / 46);
         if(var0 == null) {
            throw new RuntimeException("");
         } else {
            while(true) {
               try {
                  Image var3 = Toolkit.getDefaultToolkit().createImage(var0);
                  MediaTracker var4 = new MediaTracker(kqa.h);
                  var4.addImage(var3, 0);
                  var4.waitForAll();
                  int var5 = var3.getWidth(kqa.h);
                  int var6 = var3.getHeight(kqa.h);
                  if(!var4.isErrorAny() && var5 >= 0 && 0 <= var6) {
                     int[] var7 = new int[var5 * var6];
                     PixelGrabber var8 = new PixelGrabber(var3, 0, 0, var5, var6, var7, 0, var5);
                     var8.grabPixels();
                     return lna.g.a(var5, -7343, 0, var7, var6, var5);
                  }

                  throw new RuntimeException("");
               } catch (InterruptedException var9) {
                  ;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw vt.a(var10, "bt.D(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

}
