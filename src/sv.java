import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.image.ImageObserver;

final class sv {

   static Object[] d = ed.a(4, new Object[1], (byte)-100, 129);
   static int e;
   static int a;
   static int b;
   static int c = -1;
   static int f = -1;
   static int h;
   static int f_i;
   static Object[] g = sl.a("15", 0, new Object[1], "15");


   static final void a(int var0, boolean var1, Object[] var2) {
      if(var0 != 2) {
         a(125, true, (Object[])((Object[])g[8]));
      }

      ++a;
      int var5;
      if(var2 != null && -5 == ~var2.length) {
         boolean var44 = true;
         Object[][] var46 = (Object[][])((Object[][])var2[2]);
         if(null != var2 && var2.length == 1) {
            vea.a(false, (Object[])null);
         }

         for(var5 = 0; var46.length > var5; ++var5) {
            Object[] var48 = var46[var5];
            if(null != var48) {
               boolean var50 = var44 || ((boolean[])((boolean[])var2[1]))[0];
               if(var48 != null && (-10 >= ~var48.length || var48.length == 7)) {
                  jga.a(var48, 3, var50);
               } else if(var48 != null && var48.length == 1) {
                  if(var50) {
                     lna.g.r(0, 0, wr.n, nma.a, ((int[])((int[])((Object[])((Object[])var48[0]))[1]))[0], 0);
                  }
               } else if(var48 != null && (var48.length == 8 || 3 == var48.length)) {
                  os.a(var48, false, var50);
               } else if(var48 != null && var48.length == 5) {
                  msa.a(102, var50, var48);
               } else if(var48 != null && 2 == var48.length) {
                  dla.a(var50, var48, -123);
               } else {
                  if(null == var48 || var48.length != 4) {
                     throw new IllegalStateException();
                  }

                  if(var50) {
                     int var51 = sb.a(iia.r, (byte)-77, (Object[])((Object[])((Object[])((Object[])var48[0]))[4]), ((int[])((int[])((Object[])((Object[])var48[0]))[1]))[4]) + ((int[])((int[])((Object[])((Object[])var48[0]))[1]))[2];
                     int var9 = roa.a(qga.j, 2, ((int[])((int[])((Object[])((Object[])var48[0]))[1]))[3], (Object[])((Object[])((Object[])((Object[])var48[0]))[3])) + ((int[])((int[])((Object[])((Object[])var48[0]))[1]))[7];
                     ((ja)var48[3]).a(((int[])((int[])((Object[])((Object[])var48[0]))[1]))[0], (String)((Object[])((Object[])var48[0]))[0], (cga[])null, ((int[])((int[])((Object[])((Object[])var48[0]))[1]))[4], ((int[])((int[])((Object[])((Object[])var48[0]))[1]))[6], ((int[])((int[])((Object[])((Object[])var48[0]))[1]))[3], ((int[])((int[])((Object[])((Object[])var48[0]))[1]))[9], ((int[])((int[])((Object[])((Object[])var48[0]))[1]))[1], (byte)-113, 0, 0, (Class_s)null, var9, ((int[])((int[])((Object[])((Object[])var48[0]))[1]))[8], (int[])null, var51);
                  }
               }
            }
         }

         ((boolean[])((boolean[])var2[1]))[0] = false;
         if(var2 != null && var2.length == 3) {
            a(var0 ^ 0, false, (Object[])null);
         }

      } else if(var2 != null && var2.length == 15) {
         if(!((boolean[])((boolean[])var2[6]))[2] && var2[8] == null) {
            try {
               String[] var3 = ul.a(0, sh.c, ',');
               if(23 != var3.length) {
                  ((boolean[])((boolean[])var2[6]))[2] = true;
               }

               ((boolean[])((boolean[])var2[6]))[1] = Boolean.parseBoolean(var3[0]);
               if(var2 != null && (var2.length == 1 || -6 == ~var2.length && var2[3].equals(Integer.valueOf(1)))) {
                  return;
               }

               ((boolean[])((boolean[])var2[6]))[0] = Boolean.parseBoolean(var3[1]);
               ((int[])((int[])var2[1]))[5] = bca.a((byte)-122, var3[2]);
               ((int[])((int[])var2[1]))[7] = bca.a((byte)62, var3[3]);
               ((int[])((int[])var2[1]))[6] = bca.a((byte)-120, var3[4]);
               ((int[])((int[])var2[1]))[0] = bca.a((byte)45, var3[5]);
               ((int[])((int[])var2[1]))[3] = bca.a((byte)44, var3[6]);
               ((int[])((int[])var2[1]))[4] = bca.a((byte)-122, var3[7]);
               ((int[])((int[])var2[1]))[1] = bca.a((byte)-120, var3[8]);
               ((int[])((int[])var2[1]))[2] = bca.a((byte)55, var3[9]);
               String var4 = var3[10];
               var5 = bca.a((byte)-124, var3[11]);
               int var6 = lia.a(90, var3[12].substring(2), 16);
               var2[8] = new Font(var4, 0, var5);
               var2[0] = kqa.h.getFontMetrics((Font)var2[8]);
               var2[14] = new Color(var6);
               MediaTracker var7 = new MediaTracker(ru.d);
               var2[13] = ioa.a(var2, var3[13], (byte)55);
               var7.addImage((Image)var2[13], 0);
               var2[12] = ioa.a(var2, var3[14], (byte)55);
               var7.addImage((Image)var2[12], 1);
               var2[10] = ioa.a(var2, var3[15], (byte)55);
               var7.addImage((Image)var2[10], 2);
               var2[11] = ioa.a(var2, var3[16], (byte)55);
               var7.addImage((Image)var2[11], 3);
               var2[9] = ioa.a(var2, var3[17], (byte)55);
               var7.addImage((Image)var2[9], 4);
               var2[2] = ioa.a(var2, var3[18], (byte)55);
               var7.addImage((Image)var2[2], 5);
               var2[3] = ioa.a(var2, var3[19], (byte)55);
               var7.addImage((Image)var2[3], 6);
               var2[7] = ioa.a(var2, var3[20], (byte)55);
               var7.addImage((Image)var2[7], 7);
               var2[5] = ioa.a(var2, var3[21], (byte)55);
               var7.addImage((Image)var2[5], 8);
               var7.waitForAll();
               ((int[])((int[])var2[1]))[8] = bca.a((byte)108, var3[22]);
            } catch (Exception var42) {
               ((boolean[])((boolean[])var2[6]))[2] = true;
            }
         }

         if(((boolean[])((boolean[])var2[6]))[2]) {
            nia.a(var0 ^ -84, var2);
         } else {
            Graphics var43 = ru.d.getGraphics();
            if(null == var43) {
               ru.d.repaint();
            } else {
               try {
                  Object[] var47 = eoa.b;
                  int var45 = ((int[])((int[])var47[1]))[0];
                  Object[] var8 = eoa.b;
                  String var49 = (String)var8[3];
                  if(cpa.j == null) {
                     cpa.j = ru.d.createImage(wr.n, nma.a);
                  }

                  Graphics var10 = cpa.j.getGraphics();
                  var10.setColor(Color.BLACK);
                  var10.fillRect(0, 0, wr.n, nma.a);
                  int var11 = ((Image)var2[3]).getWidth((ImageObserver)null);
                  int var12 = ((Image)var2[7]).getWidth((ImageObserver)null);
                  int var13 = ((Image)var2[5]).getWidth((ImageObserver)null);
                  int var14 = ((Image)var2[3]).getHeight((ImageObserver)null);
                  int var15 = ((Image)var2[7]).getHeight((ImageObserver)null);
                  int var16 = ((Image)var2[5]).getHeight((ImageObserver)null);
                  var10.drawImage((Image)var2[3], bl.a(var11, 0, var2) + ((int[])((int[])var2[1]))[3] - ((int[])((int[])var2[1]))[1] / 2, a(var0 + 18606, var14, var2) + ((int[])((int[])var2[1]))[4], (ImageObserver)null);
                  int var17 = var11 + -(((int[])((int[])var2[1]))[1] / 2) + ((int[])((int[])var2[1]))[3];
                  int var18 = ((int[])((int[])var2[1]))[1] / 2 + ((int[])((int[])var2[1]))[3];

                  int var19;
                  for(var19 = var17; var18 >= var19; var19 += var13) {
                     var10.drawImage((Image)var2[5], var19 + bl.a(var11, 0, var2) + ((int[])((int[])var2[1]))[3], a(var0 ^ 18610, var16, var2) + ((int[])((int[])var2[1]))[4], (ImageObserver)null);
                  }

                  var10.drawImage((Image)var2[7], bl.a(var12, 0, var2) - (-((int[])((int[])var2[1]))[3] + -(((int[])((int[])var2[1]))[1] / 2)), a(var0 ^ 18610, var15, var2) + ((int[])((int[])var2[1]))[4], (ImageObserver)null);
                  var19 = ((Image)var2[10]).getWidth((ImageObserver)null);
                  int var20 = ((Image)var2[10]).getHeight((ImageObserver)null);
                  int var21 = ((Image)var2[11]).getWidth((ImageObserver)null);
                  int var22 = ((Image)var2[11]).getHeight((ImageObserver)null);
                  int var23 = ((Image)var2[2]).getHeight((ImageObserver)null);
                  int var24 = ((Image)var2[9]).getWidth((ImageObserver)null);
                  int var25 = ((Image)var2[9]).getHeight((ImageObserver)null);
                  int var26 = ((Image)var2[2]).getWidth((ImageObserver)null);
                  int var27 = ((Image)var2[13]).getWidth((ImageObserver)null);
                  int var28 = ((Image)var2[12]).getWidth((ImageObserver)null);
                  int var29 = bl.a(((int[])((int[])var2[1]))[6], 0, var2) + ((int[])((int[])var2[1]))[5];
                  int var30 = a(18608, ((int[])((int[])var2[1]))[0], var2) + ((int[])((int[])var2[1]))[7];
                  var10.drawImage((Image)var2[10], var29, (((int[])((int[])var2[1]))[0] + -var20) / 2 + var30, (ImageObserver)null);
                  var10.drawImage((Image)var2[11], var29 - (-((int[])((int[])var2[1]))[6] + var21), var30 + (-var22 + ((int[])((int[])var2[1]))[0]) / 2, (ImageObserver)null);
                  if(var2[4] == null) {
                     var2[4] = ru.d.createImage(-var21 + -var19 + ((int[])((int[])var2[1]))[6], ((int[])((int[])var2[1]))[0]);
                  }

                  Graphics var31 = ((Image)var2[4]).getGraphics();
                  if(null != var47 && (1 == var47.length || 1 == var47.length)) {
                     vea.a(false, (Object[])null);
                  }

                  int var32;
                  for(var32 = 0; ((int[])((int[])var2[1]))[6] - var19 - var21 > var32; var32 += var24) {
                     var31.drawImage((Image)var2[9], var32, 0, (ImageObserver)null);
                  }

                  for(var32 = 0; ~var32 > ~(-var19 + ((int[])((int[])var2[1]))[6] + -var21); var32 += var26) {
                     var31.drawImage((Image)var2[2], var32, ((int[])((int[])var2[1]))[0] - var23, (ImageObserver)null);
                  }

                  var32 = (-var21 + (((int[])((int[])var2[1]))[6] - var19)) * var45 / 100;
                  if(var32 > 0) {
                     Image var33 = ru.d.createImage(var32, -var23 + ((int[])((int[])var2[1]))[0] + -var25);
                     int var34 = var33.getWidth((ImageObserver)null);
                     if(var2 != null && var2.length == 11) {
                        return;
                     }

                     Graphics var35 = var33.getGraphics();
                     int var36 = ((int[])((int[])var2[1]))[8];
                     Object[] var39 = eoa.b;
                     int var38 = ((int[])((int[])var39[1]))[1];
                     var38 = var36 * var38 / 10 % var27;

                     for(int var56 = var38 + -var27; var56 < var34; var56 += var27) {
                        var35.drawImage((Image)var2[13], var56, 0, (ImageObserver)null);
                     }

                     var31.drawImage(var33, 0, var25, (ImageObserver)null);
                  }

                  int var52 = var32;
                  var32 = -var21 + ((int[])((int[])var2[1]))[6] + (-var19 - var32);
                  if(var32 > 0) {
                     Image var55 = ru.d.createImage(var32, ((int[])((int[])var2[1]))[0] + -var25 + -var23);
                     int var54 = var55.getWidth((ImageObserver)null);
                     Graphics var53 = var55.getGraphics();

                     for(int var37 = 0; var54 > var37; var37 += var28) {
                        var53.drawImage((Image)var2[12], var37, 0, (ImageObserver)null);
                     }

                     var31.drawImage(var55, var52, var25, (ImageObserver)null);
                     if(var8 != null && 27 == var8.length) {
                        vea.a(false, (Object[])null);
                     }
                  }

                  var10.drawImage((Image)var2[4], var29 + var19, var30, (ImageObserver)null);
                  var10.setFont((Font)var2[8]);
                  var10.setColor((Color)var2[14]);
                  var10.drawString(var49, var29 + (((int[])((int[])var2[1]))[6] - ((FontMetrics)var2[0]).stringWidth(var49)) / 2, var30 + ((int[])((int[])var2[1]))[0] / 2 + 4 + ((int[])((int[])var2[1]))[2]);
                  var43.drawImage(cpa.j, 0, 0, (ImageObserver)null);
               } catch (Exception var41) {
                  ((boolean[])((boolean[])var2[6]))[2] = true;
               }
            }
         }

      } else {
         throw new IllegalStateException();
      }
   }

   static final long a(int var0, int var1, Object[] var2, int var3) {
      ++b;
      long var4 = 4194304L;
      long var6 = Long.MIN_VALUE;
      Object[] var8 = mca.a(true, uaa.a(var2, 115), lja.d);
      long var9 = (long)(var3 | var0 << 7 | wua.a(var2, var1 ^ 10404) << 14 | vm.a((byte)20, var2) << 20 | 1073741824);
      if(0 == ((int[])((int[])var8[1]))[11]) {
         var9 |= var6;
      }

      if(((int[])((int[])var8[var1]))[7] == 1) {
         var9 |= var4;
      }

      var9 |= (long)uaa.a(var2, 127) << 32;
      return var9;
   }

   static final void a(Object[] var0, int var1, int var2) {
      ++h;
      int var3 = -44 / ((-57 - var2) / 61);
      ((int[])((int[])var0[1]))[0] = var1;
   }

   static final int a(int var0, int var1, Object[] var2) {
      if(var0 != 18608) {
         d = (Object[])((Object[])var2[3]);
      }

      ++e;
      return !((boolean[])((boolean[])var2[6]))[0]?0:(-var1 + nma.a) / 2;
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2) {
      Class_e.a(292, var1);
      if(var0 != 31675) {
         a(49, 85, (Object[])((Object[])((Object[])((Object[])d[5]))[6]), 112);
      }

      ++f_i;
      ((int[])((int[])var1[1]))[0] = 1;
      ((long[])((long[])var1[0]))[0] = (long)((int[])((int[])var2[1]))[0];
      return var1;
   }

}
