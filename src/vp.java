import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

final class vp {

   private static int h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".length();
   private boolean c = false;
   private int[] a = new int[4];
   private int e;
   private cga[] g;
   private static int[] d = new int[256];
   private int f;
   private int[] b;


   private final void a(ta var1, Font var2, FontMetrics var3, char var4, int var5, boolean var6) {
      int var7 = var3.charWidth(var4);
      int var8 = var7;
      if(var6) {
         try {
            if(var4 == 47) {
               var6 = false;
            }

            if(var4 == 102 || var4 == 116 || var4 == 119 || var4 == 118 || var4 == 107 || var4 == 120 || var4 == 121 || var4 == 65 || var4 == 86 || var4 == 87) {
               ++var7;
            }
         } catch (Exception var21) {
            ;
         }
      }

      int var9 = var3.getMaxAscent();
      int var10 = var3.getMaxAscent() + var3.getMaxDescent();
      int var11 = var3.getHeight();
      Image var12 = ru.d.createImage(var7, var10);
      Graphics var13 = var12.getGraphics();
      var13.setColor(Color.black);
      var13.fillRect(0, 0, var7, var10);
      var13.setColor(Color.white);
      var13.setFont(var2);
      var13.drawString(var4 + "", 0, var9);
      if(var6) {
         var13.drawString(var4 + "", 1, var9);
      }

      int[] var14 = new int[var7 * var10];
      PixelGrabber var15 = new PixelGrabber(var12, 0, 0, var7, var10, var14, 0, var7);

      try {
         var15.grabPixels();
      } catch (Exception var20) {
         ;
      }

      var12.flush();
      var12 = null;
      int var16 = 0;

      int var17;
      label64:
      for(var17 = 0; var17 < var10; ++var17) {
         for(int var18 = 0; var18 < var7; ++var18) {
            int var19 = var14[var18 + var17 * var7];
            if((var19 & 16777215) != 0) {
               var16 = var17;
               break label64;
            }
         }
      }

      for(var17 = 0; var17 < var14.length; ++var17) {
         if((var14[var17] & 16777215) == 0) {
            var14[var17] = 0;
         }
      }

      this.e = var9 - var16;
      this.f = var11;
      this.b[var5] = var8;
      this.g[var5] = var1.a(var7, -7343, 0, var14, var10, var7);
   }

   private final void a(ta var1, String var2, int[] var3, int var4, int var5, int var6, boolean var7) {
      if(var6 == 0) {
         var7 = false;
      }

      var6 |= -16777216;

      for(int var8 = 0; var8 < var2.length(); ++var8) {
         int var9 = d[var2.charAt(var8)];
         if(var7) {
            this.g[var9].a(var4 + 1, var5 + 1, 0, -16777216, 1);
         }

         this.g[var9].a(var4, var5, 0, var6, 1);
         var4 += this.b[var9];
      }

   }

   final int a(String var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         int var4 = d[var1.charAt(var3)];
         var2 += this.b[var4];
      }

      return var2;
   }

   final int a() {
      return this.e;
   }

   final void a(ta var1, String var2, int var3, int var4, int var5, boolean var6) {
      int var7 = this.a(var2) / 2;
      var1.TA(this.a);
      if(var3 - var7 <= this.a[2]) {
         if(var3 + var7 >= this.a[0]) {
            if(var4 - this.e <= this.a[3]) {
               if(var4 + this.f >= this.a[1]) {
                  this.a(var1, var2, this.a, var3 - var7, var4, var5, var6);
               }
            }
         }
      }
   }

   final int b() {
      return this.f - 1;
   }

   vp(ta var1, int var2, boolean var3, Component var4) {
      this.c = false;
      this.g = new cga[256];
      this.b = new int[256];
      Font var5 = new Font("Helvetica", var3?1:0, var2);
      FontMetrics var6 = var4.getFontMetrics(var5);

      int var7;
      for(var7 = 0; var7 < h; ++var7) {
         this.a(var1, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
      }

      if(var3 && this.c) {
         this.c = false;
         var5 = new Font("Helvetica", 0, var2);
         var6 = var4.getFontMetrics(var5);

         for(var7 = 0; var7 < h; ++var7) {
            this.a(var1, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, false);
         }

         if(!this.c) {
            this.c = false;

            for(var7 = 0; var7 < h; ++var7) {
               this.a(var1, var5, var6, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(var7), var7, true);
            }
         }
      }

   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         int var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(var0);
         if(var1 == -1) {
            var1 = 74;
         }

         d[var0] = var1;
      }

   }
}
