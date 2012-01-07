import jagdx.IDirect3DDevice;
import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

final class nia {

   static int d;
   static int e;
   static int a;
   static Object[] c = ho.a(8, 86, new Object[1], true);
   static int b;
   static int f;


   static final void a(int var0, int var1) {
      if(var0 != -7027) {
         b(116, (Object[])((Object[])c[0]));
      }

      ++d;
      oc var2;
      Object[] var4 = (var2 = (oc)pm.a((long)var1, fo.c, false)) == null?null:var2.n;
      if(null != var4) {
         kw.a(var0 + 7022, (Object[])((Object[])var4[2]));
         he.a(((int[])((int[])var4[1]))[0], ((boolean[])((boolean[])var4[3]))[2], 57);
         ((lm)(null != var4?var4[0]:null)).a((byte)33);
      }

   }

   static final void a(int var0, int var1, int var2, byte var3, int var4, int var5, int var6) {
      int var7 = -57 / ((var3 - 38) / 61);
      int var8;
      int var9;
      int var10;
      if(hla.g <= var4 && var2 <= td.r && var5 >= sea.k && sda.c >= var6) {
         if(1 != var0) {
            noa.a(var6, var0, 4, var1, var2, var4, var5);
         } else {
            var8 = var5 + 1;
            fka.a(var1, fda.c[var5], var2, var4, (byte)49);
            var9 = var6 - 1;
            fka.a(var1, fda.c[var6], var2, var4, (byte)-78);

            for(var10 = var8; var9 >= var10; ++var10) {
               int[] var18 = fda.c[var10];
               var18[var4] = var18[var2] = var1;
            }
         }
      } else if(var0 != 1) {
         int var12 = eua.a(sda.c, (byte)-53, var5, sea.k);
         int var13 = eua.a(sda.c, (byte)-53, var6, sea.k);
         int var14 = eua.a(td.r, (byte)-53, var4, hla.g);
         int var15 = eua.a(td.r, (byte)-53, var2, hla.g);
         var8 = eua.a(sda.c, (byte)-53, var5 + var0, sea.k);
         var9 = eua.a(sda.c, (byte)-53, var6 - var0, sea.k);

         int var16;
         for(var16 = var12; var8 > var16; ++var16) {
            fka.a(var1, fda.c[var16], var15, var14, (byte)-109);
         }

         for(var16 = var13; var16 > var9; --var16) {
            fka.a(var1, fda.c[var16], var15, var14, (byte)-77);
         }

         var10 = eua.a(td.r, (byte)-53, var4 + var0, hla.g);
         int var11 = eua.a(td.r, (byte)-53, var2 - var0, hla.g);

         for(var16 = var8; var16 <= var9; ++var16) {
            int[] var17 = fda.c[var16];
            fka.a(var1, var17, var10, var14, (byte)114);
            fka.a(var1, var17, var15, var11, (byte)42);
         }
      } else {
         uca.a(var1, var6, var5, 111, var2, var4);
      }

      ++f;
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++e;
      if(var2 != -92) {
         b(32, (Object[])null);
      }

      if(null != var1 && var1.length == 87) {
         int var3 = 0 != (var0 & 2)?2:3;
         IDirect3DDevice.SetRenderState(((long[])((long[])var1[50]))[5], 8, var3);
      } else if(null != var1 && -92 == ~var1.length) {
         OpenGL.glPolygonMode(1028, 0 != (var0 & 2)?6913:6914);
      } else {
         throw new IllegalStateException();
      }
   }

   static final Object[] b(int var0, Object[] var1) {
      if(var0 != 28469) {
         c = (Object[])((Object[])var1[0]);
      }

      ota.a(false, var1);
      ++a;
      uca.a(0, var1, false, true);
      ((int[])((int[])var1[1]))[4] = 0;
      ((int[])((int[])var1[1]))[3] = 2000;
      ((int[])((int[])var1[1]))[1] = 0;
      ((int[])((int[])var1[1]))[2] = 4096;
      ((int[])((int[])var1[1]))[5] = 16;
      return var1;
   }

   static final void a(int var0, Object[] var1) {
      ++b;
      Object[] var3 = eoa.b;
      if(null == var1 || -5 != ~var1.length && var1.length != 10) {
         int var2 = ((int[])((int[])var3[1]))[0];
         int var4 = var2;
         Object[] var6 = eoa.b;
         String var5 = (String)var6[3];
         String var7 = var5;
         Color var8 = tj.f[jra.f_i];
         Color var9 = rd.v[jra.f_i];
         Color var10 = bo.f_i[jra.f_i];
         if(var0 >= -47) {
            c = (Object[])((Object[])var1[6]);
         }

         try {
            Graphics var11 = ru.d.getGraphics();
            if(cka.f == null) {
               cka.f = new Font("Helvetica", 1, 13);
            }

            if(var8 == null) {
               var8 = new Color(140, 17, 17);
            }

            if(var9 == null) {
               var9 = new Color(140, 17, 17);
            }

            if(null == var10) {
               var10 = new Color(255, 255, 255);
            }

            int var13;
            int var14;
            try {
               if(cpa.j == null) {
                  cpa.j = ru.d.createImage(wr.n, nma.a);
               }

               Graphics var12 = cpa.j.getGraphics();
               var12.setColor(Color.black);
               var12.fillRect(0, 0, wr.n, nma.a);
               var13 = wr.n / 2 - 152;
               var14 = nma.a / 2 - 18;
               var12.setColor(var9);
               var12.drawRect(var13, var14, 303, 33);
               var12.setColor(var8);
               var12.fillRect(2 + var13, var14 + 2, 3 * var4, 30);
               var12.setColor(Color.black);
               var12.drawRect(1 + var13, var14 + 1, 301, 31);
               var12.fillRect(var13 + 2 + var4 * 3, var14 + 2, -(var4 * 3) + 300, 30);
               if(var1 != null && -8 == ~var1.length) {
                  sv.a(18608, 28, (Object[])null);
               }

               var12.setFont(cka.f);
               var12.setColor(var10);
               var12.drawString(var7, (304 + -(var7.length() * 6)) / 2 + var13, 22 + var14);
               if(null != vea.f_i) {
                  var12.setFont(cka.f);
                  var12.setColor(var10);
                  var12.drawString(vea.f_i, wr.n / 2 + -(vea.f_i.length() * 6 / 2), -26 + nma.a / 2);
               }

               var11.drawImage(cpa.j, 0, 0, (ImageObserver)null);
            } catch (Exception var15) {
               var11.setColor(Color.black);
               var11.fillRect(0, 0, wr.n, nma.a);
               var13 = -152 + wr.n / 2;
               var14 = -18 + nma.a / 2;
               var11.setColor(var9);
               var11.drawRect(var13, var14, 303, 33);
               var11.setColor(var8);
               if(var3 != null && 12 == var3.length) {
                  pu.b((Object[])null, 1);
               }

               var11.fillRect(2 + var13, 2 + var14, 3 * var4, 30);
               var11.setColor(Color.black);
               var11.drawRect(1 + var13, var14 + 1, 301, 31);
               var11.fillRect(var13 + 2 + var4 * 3, 2 + var14, -(3 * var4) + 300, 30);
               var11.setFont(cka.f);
               var11.setColor(var10);
               if(null != vea.f_i) {
                  var11.setFont(cka.f);
                  var11.setColor(var10);
                  var11.drawString(vea.f_i, wr.n / 2 + -(vea.f_i.length() * 6 / 2), nma.a / 2 - 26);
               }

               var11.drawString(var7, var13 + (304 + -(6 * var7.length())) / 2, 22 + var14);
            }
         } catch (Exception var16) {
            ru.d.repaint();
         }

      }
   }

}
