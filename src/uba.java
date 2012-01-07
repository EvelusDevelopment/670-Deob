import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;

final class uba {

   static int f_i;
   static int d;
   static Object[] b = sd.a(new Object[1], 116, (byte)115);
   static int h;
   static int e;
   static int a;
   static int f;
   static Object[] g;
   static int c;


   static final boolean a(int var0, Object[] var1) {
      ++h;
      if(var0 < 28) {
         a((int[][])((int[][])null), (int)-83);
      }

      return null == var1[18] || ela.a((Object[])((Object[])var1[18]), 3);
   }

   static final void a(int[] var0, int var1, Object[] var2) {
      var0[0] = ((int[])((int[])var2[1]))[28];
      var0[3] = ((int[])((int[])var2[1]))[15];
      var0[1] = ((int[])((int[])var2[1]))[10];
      var0[2] = ((int[])((int[])var2[1]))[25];
      int var3 = -105 % ((var1 - 51) / 50);
      ++e;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if(eb.f && gf.b != null && (3 != var4 || var2 != wh.e || fda.a != var1)) {
         kra var6 = roa.b;
         Frame var7 = gf.b;
         var6.exit();
         var7.setVisible(false);
         var7.dispose();
         gf.b = null;
      }

      ++c;
      if(eb.f && 3 == var4 && gf.b == null) {
         Frame var12;
         label129: {
            kra var13 = roa.b;
            int var8 = 0;
            if(0 == var8) {
               Object[][] var9 = lb.a((int)0, var13);
               if(var9 == null) {
                  var12 = null;
                  break label129;
               }

               boolean var10 = false;

               for(int var11 = 0; var9.length > var11; ++var11) {
                  if(((int[])((int[])var9[var11][0]))[2] == var2 && var1 == ((int[])((int[])var9[var11][0]))[0] && (!var10 || ((int[])((int[])var9[var11][0]))[3] > var8)) {
                     var8 = ((int[])((int[])var9[var11][0]))[3];
                     var10 = true;
                  }
               }

               if(!var10) {
                  var12 = null;
                  break label129;
               }
            }

            Frame var17 = new Frame("Jagex Full Screen");
            var17.setResizable(false);
            var13.enter(var17, var2, var1, var8, 0);
            var12 = var17;
         }

         gf.b = var12;
         if(null != gf.b) {
            fda.a = var1;
            wh.e = var2;
            uk.a((byte)118);
         }
      }

      if(var4 == 3 && (!eb.f || null == gf.b)) {
         a(1, -1, -1, var3, Class_m.a((Object[])((Object[])tu.d[40]), -23352), true);
      } else {
         if(var0 != 1) {
            g = (Object[])((Object[])b[20]);
         }

         Insets var14;
         Object var15;
         if(null != gf.b) {
            rp.a = var2;
            var15 = gf.b;
            jma.h = var1;
         } else if(null == opa.g) {
            var15 = kqa.h;
            rp.a = ((Container)var15).getSize().width;
            jma.h = ((Container)var15).getSize().height;
         } else {
            var14 = opa.g.getInsets();
            rp.a = opa.g.getSize().width + -var14.left - var14.right;
            int var10001 = var14.bottom + var14.top;
            jma.h = opa.g.getSize().height - var10001;
            var15 = opa.g;
         }

         if(var4 != 1) {
            bo.a((byte)-124);
         } else {
            mr.e = 0;
            pa.f_i = (rp.a + -iia.r) / 2;
            wr.n = iia.r;
            nma.a = qga.j;
         }

         if(po.f_i != mka.g && 1024 > wr.n && nma.a < 768) {
            ;
         }

         if(!var5) {
            ru.d.setSize(wr.n, nma.a);
            lna.g.a(nma.a, ru.d, wr.n, true);
            if(var15 == opa.g) {
               var14 = opa.g.getInsets();
               ru.d.setLocation(pa.f_i + var14.left, mr.e + var14.top);
            } else {
               ru.d.setLocation(pa.f_i, mr.e);
            }
         } else {
            mea.a((byte)-82);
         }

         if(var4 >= 2) {
            wm.d = true;
         } else {
            wm.d = false;
         }

         if(-1 != bqa.j) {
            kt.a(true, nma.a, (byte)21, bqa.j, wr.n);
         }

         if(null != lba.f[8] && kf.a(26, ipa.d)) {
            tb.a(false);
         }

         for(int var16 = 0; 104 > var16; ++var16) {
            qma.d[var16] = true;
         }

         ofa.c = true;
      }
   }

   static final cta a(Object[] var0, byte var1) {
      ++a;
      if(var1 != 80) {
         a((Object[])((Object[])((Object[])((Object[])g[0]))[14]), (Object[])null, 27);
      }

      return new cta(var0);
   }

   static final void a(int[][] var0, int var1) {
      ++f;
      if(var1 != 3) {
         g = (Object[])null;
      }

      fda.c = var0;
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      if(var2 != -22245) {
         a((int[])((int[])b[0]), ((int[])((int[])var1[11]))[28], (Object[])null);
      }

      ++f_i;
      lm.a(24, (Object[])((Object[])var1[7]), 786336, -26241);
   }

   static final void a(int var0, ta var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Object[] var10, int var11) {
      ++d;
      if(var7 <= 12) {
         a(-20, (ta)g[1], ((int[])((int[])g[1]))[0], ((int[])((int[])var10[0]))[0], ((int[])((int[])g[13]))[24], ((int[])((int[])((Object[])((Object[])g[1]))[1]))[7], 100, -46, 5, ((int[])((int[])b[14]))[6], (Object[])null, -125);
      }

      wj.a(0, var8, var5, true, var4, var9, var10, 0, var2, var11, var1, var3, var0, false);
   }

}
