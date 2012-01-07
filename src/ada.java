import jaggl.OpenGL;
import java.util.Vector;

final class ada {

   static Object[] a;
   static int b;
   static int e;
   static int f_i;
   static int h;
   static int[][] j;
   static int g;
   static int f;
   static int c;
   static int d;


   static final void c(Object[] var0, int var1) {
      if(null == var0[1]) {
         var0[1] = new int[1];
      }

      ++d;
      if(var1 != -22651) {
         a((Object[])null, true);
      }

   }

   static final void b(Object[] var0, int var1) {
      if(null == var0[1]) {
         var0[1] = new int[5];
      }

      if(var1 <= 65) {
         c((Object[])null, ((int[])((int[])var0[4]))[2]);
      }

      ++f;
      ((int[])((int[])var0[1]))[1] = 1;
   }

   static final void a(int var0, Object[] var1) {
      label11: {
         if(null != var1[var0]) {
            qm.a(var0 + 112, (Object[])((Object[])var1[3]), '\u8d00');
            if(client.f_vb == 0) {
               break label11;
            }
         }

         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8d00', '\u8d41', 0);
      }

      ++h;
   }

   static final Object[] a(Object[] var0, boolean var1) {
      if(var0[1] == null) {
         var0[1] = new int[12];
      }

      ++g;
      uca.a(0, var0, var1, true);
      lp.a(!var1, var0);
      return var0;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var2 != 3) {
         a((Object[])null, ((byte[])((byte[])a[0]))[0]);
      }

      ++b;
      if(var1 == var6) {
         fua.a((byte)101, var1, var5, var0, var7, var4, var3);
      } else {
         if(~hla.g >= ~(var3 - var1) && var1 + var3 <= td.r && -var6 + var5 >= sea.k && var6 + var5 <= sda.c) {
            tl.a(var5, var7, 669944674, var1, var4, var3, var0, var6);
         } else {
            int var8 = 0;
            int var9 = var6;
            int var10 = 0;
            int var11 = -var0 + var1;
            int var12 = -var0 + var6;
            int var13 = var1 * var1;
            int var14 = var6 * var6;
            int var15 = var11 * var11;
            int var16 = var12 * var12;
            int var17 = var14 << 1;
            int var18 = var13 << 1;
            int var19 = var16 << 1;
            int var20 = var15 << 1;
            int var21 = var6 << 1;
            int var22 = var12 << 1;
            int var23 = var13 * (1 - var21) + var17;
            int var24 = -((-1 + var21) * var18) + var14;
            int var25 = var19 + (1 - var22) * var15;
            int var26 = var16 + -((-1 + var22) * var20);
            int var27 = var13 << 2;
            int var28 = var14 << 2;
            int var29 = var15 << 2;
            int var30 = var16 << 2;
            int var31 = var17 * 3;
            int var32 = (-3 + var21) * var18;
            int var33 = 3 * var19;
            int var34 = var20 * (var22 - 3);
            int var35 = var28;
            int var36 = var27 * (var6 - 1);
            int var37 = var30;
            int var38 = (-1 + var12) * var29;
            int var42;
            int var43;
            int var40;
            int var41;
            if(var5 >= sea.k && sda.c >= var5) {
               int[] var39 = fda.c[var5];
               var40 = eua.a(td.r, (byte)-53, -var1 + var3, hla.g);
               var41 = eua.a(td.r, (byte)-53, var1 + var3, hla.g);
               var42 = eua.a(td.r, (byte)-53, var3 + -var11, hla.g);
               var43 = eua.a(td.r, (byte)-53, var3 + var11, hla.g);
               fka.a(var4, var39, var42, var40, (byte)-59);
               fka.a(var7, var39, var43, var42, (byte)58);
               fka.a(var4, var39, var41, var43, (byte)111);
            }

            while(var9 > 0) {
               boolean var47 = var9 <= var12;
               if(var47) {
                  if(var25 < 0) {
                     while(var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        ++var10;
                        var33 += var30;
                     }
                  }

                  if(var26 < 0) {
                     var26 += var37;
                     var25 += var33;
                     ++var10;
                     var37 += var30;
                     var33 += var30;
                  }

                  var25 += -var38;
                  var26 += -var34;
                  var34 -= var29;
                  var38 -= var29;
               }

               if(var23 < 0) {
                  while(0 > var23) {
                     var24 += var35;
                     var23 += var31;
                     var31 += var28;
                     var35 += var28;
                     ++var8;
                  }
               }

               if(var24 < 0) {
                  var23 += var31;
                  var24 += var35;
                  ++var8;
                  var35 += var28;
                  var31 += var28;
               }

               var24 += -var32;
               var23 += -var36;
               var32 -= var27;
               --var9;
               var36 -= var27;
               var40 = -var9 + var5;
               var41 = var9 + var5;
               if(sea.k <= var41 && var40 <= sda.c) {
                  var42 = eua.a(td.r, (byte)-53, var8 + var3, hla.g);
                  var43 = eua.a(td.r, (byte)-53, var3 - var8, hla.g);
                  if(var47) {
                     int var44 = eua.a(td.r, (byte)-53, var3 + var10, hla.g);
                     int var45 = eua.a(td.r, (byte)-53, var3 + -var10, hla.g);
                     int[] var46;
                     if(var40 >= sea.k) {
                        var46 = fda.c[var40];
                        fka.a(var4, var46, var45, var43, (byte)117);
                        fka.a(var7, var46, var44, var45, (byte)-114);
                        fka.a(var4, var46, var42, var44, (byte)-100);
                     }

                     if(sda.c >= var41) {
                        var46 = fda.c[var41];
                        fka.a(var4, var46, var45, var43, (byte)-47);
                        fka.a(var7, var46, var44, var45, (byte)118);
                        fka.a(var4, var46, var42, var44, (byte)81);
                     }
                  } else {
                     if(var40 >= sea.k) {
                        fka.a(var4, fda.c[var40], var42, var43, (byte)107);
                     }

                     if(sda.c >= var41) {
                        fka.a(var4, fda.c[var41], var42, var43, (byte)-121);
                     }
                  }
               }
            }
         }

      }
   }

   static final Object[] a(Object[] var0, byte var1) {
      if(var1 >= -11) {
         j = (int[][])((int[][])null);
      }

      ++e;
      int var3 = fh.a(var0, false);
      Object[][] var4 = new Object[][]{Class_is.b, gra.c, kw.c};
      Object[][] var5 = var4;
      if(var0 != null && (var0.length == 2 || -2 == ~var0.length && var0[0].equals(Integer.valueOf(2)))) {
         a((Object[])null, (byte)-101);
      }

      int var6 = 0;

      Object[] var2;
      while(true) {
         if(var5.length <= var6) {
            var2 = null;
            if(null != var0 && var0.length == 10 && var0[6].equals(Boolean.valueOf(false))) {
               a((Object[])null, (byte)-22);
            }
            break;
         }

         Object[] var7 = var5[var6];
         if(((int[])((int[])var7[0]))[0] == var3) {
            var2 = var7;
            break;
         }

         ++var6;
      }

      int var12;
      if(gra.c != var2) {
         if(var2 != kw.c) {
            return Class_is.b != var2?null:hj.a(var0, (byte)-117);
         } else {
            var6 = fh.a(var0, false);
            var12 = fh.a(var0, false);
            Object[] var13 = new Object[2];
            if(var13[1] == null) {
               var13[1] = new int[2];
            }

            ((int[])((int[])var13[1]))[1] = var6;
            ((int[])((int[])var13[1]))[0] = var12;
            return var13;
         }
      } else if(var2 != null && (var2.length == 3 || var2.length == 10 && var2[0].equals(Boolean.valueOf(false)))) {
         return new Object[4][];
      } else {
         var6 = fh.a(var0, false);
         var12 = fh.a(var0, false);
         int var8 = fh.a(var0, false);
         int[] var9 = new int[var8];

         for(int var10 = 0; var10 < var8; ++var10) {
            var9[var10] = fh.a(var0, false);
         }

         Object[] var11 = new Object[3];
         if(var11[1] == null) {
            var11[1] = new int[2];
         }

         var11[0] = var9;
         ((int[])((int[])var11[1]))[1] = var12;
         ((int[])((int[])var11[1]))[0] = var6;
         return var11;
      }
   }

   static final void a(Object[] var0, int var1) throws Throwable {
      lb.a((byte)-58, var0);
      ++c;
      int var2 = -74 / ((var1 + 51) / 50);
      ((oha)var0[0]).a(18242);
   }

   static final void d(Object[] var0, int var1) {
      try {
         ++f_i;
         hga.a(var0, -390);
         if(var0 == null || var0.length != 3 && (var0.length != 1 || !var0[0].equals(Boolean.valueOf(false)))) {
            int var4 = ((int[])((int[])var0[1]))[1];
            if(var4 != 2) {
               if(1 == var4) {
                  var0[4] = vk.f_i;
               } else {
                  if(var4 != 0) {
                     throw new RuntimeException();
                  }

                  var0[4] = vk.f;
               }
            } else {
               var0[4] = vk.h;
            }

            Object[] var2;
            var0[2] = ((ta)(null == (var2 = (Object[])((Object[])var0[10]))?null:var2[38])).f();
            var0[13] = kta.a(80, (Object[])((Object[])var0[4]), ah.f, (Object[])((Object[])var0[10]), ((int[])((int[])var0[1]))[2], ((int[])((int[])var0[1]))[0]);
            var0[9] = gj.a((Object[])((Object[])var0[13]), var1, (byte)122);
            var0[6] = kta.a(-67, (Object[])((Object[])var0[4]), ah.f, (Object[])((Object[])var0[10]), ((int[])((int[])var0[1]))[2], ((int[])((int[])var0[1]))[0]);
            var0[3] = gj.a((Object[])((Object[])var0[6]), 0, (byte)40);
            var0[7] = kta.a(-99, (Object[])((Object[])var0[4]), ah.f, (Object[])((Object[])var0[10]), ((int[])((int[])var0[1]))[2], ((int[])((int[])var0[1]))[0]);
            var0[12] = gj.a((Object[])((Object[])var0[7]), 0, (byte)82);
            Object[] var3;
            var0[5] = ((ta)(null != (var3 = (Object[])((Object[])var0[10]))?var3[38]:null)).e(((int[])((int[])var0[1]))[0], ((int[])((int[])var0[1]))[2]);
            var4 = ((Vector)var0[14]).size();

            for(int var5 = 0; var4 > var5; ++var5) {
               Object[] var6 = (Object[])((Object[])((Vector)var0[14]).elementAt(var5));
               mia.a(var6, ((int[])((int[])var0[1]))[0], ((int[])((int[])var0[1]))[2], -121);
            }

         }
      } catch (RuntimeException var7) {
         throw vt.a(var7, "ada.B(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static {
      Object[] var1 = new Object[0];
      a = var1;
      j = new int[][]{{2, 4, 6, 0}, {0, 2, 3, 5, 6, 4}, {0, 1, 4, 5}, {4, 6, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 1, 2, 4, 6, 7}, {4, 7, 6, 0}, {0, 8, 6, 1, 9, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 3, 7, 10, 10, 6, 6}, {2, 4, 6, 0}};
   }
}
