import java.lang.ref.SoftReference;

final class fua {

   static int c;
   static int f;
   static boolean b = false;
   static int a;
   static int d;
   static int e = 0;


   static final void a(byte var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      ++f;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int[] var15;
      int var17;
      int var16;
      int var21;
      int var20;
      if(hla.g <= -var1 + var6 && td.r >= var1 + var6 && ~sea.k >= ~(var2 + -var1) && sda.c >= var2 + var1) {
         pja.a((byte)16, var1);
         var7 = 0;
         var8 = var1 - var3;
         if(0 > var8) {
            var8 = 0;
         }

         var9 = var1;
         var10 = -var1;
         var11 = var8;
         var12 = -var8;
         var13 = -1;
         var14 = -1;
         var15 = fda.c[var2];
         var16 = -var8 + var6;
         fka.a(var5, var15, var16, var6 + -var1, (byte)120);
         var17 = var6 + var8;
         fka.a(var4, var15, var17, var16, (byte)-79);
         fka.a(var5, var15, var1 + var6, var17, (byte)-44);

         while(var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if(0 <= var12 && 1 <= var11) {
               th.c[var11] = var7;
               --var11;
               var12 -= var11 << 1;
            }

            ++var7;
            int var23;
            int var24;
            int[] var27;
            int[] var26;
            int var28;
            if(var10 >= 0) {
               --var9;
               var10 -= var9 << 1;
               if(var8 > var9) {
                  var27 = fda.c[var2 + var9];
                  var26 = fda.c[-var9 + var2];
                  var20 = th.c[var9];
                  var21 = var6 + var7;
                  var28 = var6 - var7;
                  var23 = var20 + var6;
                  var24 = -var20 + var6;
                  fka.a(var5, var27, var24, var28, (byte)-115);
                  fka.a(var4, var27, var23, var24, (byte)-61);
                  fka.a(var5, var27, var21, var23, (byte)85);
                  fka.a(var5, var26, var24, var28, (byte)-125);
                  fka.a(var4, var26, var23, var24, (byte)-73);
                  fka.a(var5, var26, var21, var23, (byte)49);
               } else {
                  var27 = fda.c[var2 + var9];
                  var26 = fda.c[-var9 + var2];
                  var20 = var7 + var6;
                  var21 = -var7 + var6;
                  fka.a(var5, var27, var20, var21, (byte)124);
                  fka.a(var5, var26, var20, var21, (byte)-100);
               }
            }

            var27 = fda.c[var7 + var2];
            var26 = fda.c[-var7 + var2];
            var20 = var6 + var9;
            var21 = -var9 + var6;
            if(var7 < var8) {
               var28 = var7 <= var11?var11:th.c[var7];
               var23 = var28 + var6;
               var24 = var6 + -var28;
               fka.a(var5, var27, var24, var21, (byte)-75);
               fka.a(var4, var27, var23, var24, (byte)54);
               fka.a(var5, var27, var20, var23, (byte)105);
               fka.a(var5, var26, var24, var21, (byte)57);
               fka.a(var4, var26, var23, var24, (byte)-79);
               fka.a(var5, var26, var20, var23, (byte)-45);
            } else {
               fka.a(var5, var27, var20, var21, (byte)-108);
               fka.a(var5, var26, var20, var21, (byte)126);
            }
         }
      } else {
         pja.a((byte)16, var1);
         var7 = 0;
         var8 = var1 + -var3;
         if(0 > var8) {
            var8 = 0;
         }

         var9 = var1;
         var10 = -var1;
         var11 = var8;
         var12 = -var8;
         var13 = -1;
         var14 = -1;
         int var19;
         int var18;
         if(var2 >= sea.k && sda.c >= var2) {
            var15 = fda.c[var2];
            var16 = eua.a(td.r, (byte)-53, var6 - var1, hla.g);
            var17 = eua.a(td.r, (byte)-53, var6 + var1, hla.g);
            var18 = eua.a(td.r, (byte)-53, -var8 + var6, hla.g);
            var19 = eua.a(td.r, (byte)-53, var8 + var6, hla.g);
            fka.a(var5, var15, var18, var16, (byte)-107);
            fka.a(var4, var15, var19, var18, (byte)-78);
            fka.a(var5, var15, var17, var19, (byte)-102);
         }

         while(var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if(0 <= var12 && 1 <= var11) {
               --var11;
               th.c[var11] = var7;
               var12 -= var11 << 1;
            }

            ++var7;
            int[] var22;
            int var25;
            if(0 <= var10) {
               --var9;
               var10 -= var9 << 1;
               var25 = var2 - var9;
               var16 = var2 + var9;
               if(var16 >= sea.k && var25 <= sda.c) {
                  if(var9 >= var8) {
                     var17 = eua.a(td.r, (byte)-53, var6 + var7, hla.g);
                     var18 = eua.a(td.r, (byte)-53, var6 + -var7, hla.g);
                     if(var16 <= sda.c) {
                        fka.a(var5, fda.c[var16], var17, var18, (byte)-89);
                     }

                     if(sea.k <= var25) {
                        fka.a(var5, fda.c[var25], var17, var18, (byte)-59);
                     }
                  } else {
                     var17 = th.c[var9];
                     var18 = eua.a(td.r, (byte)-53, var6 + var7, hla.g);
                     var19 = eua.a(td.r, (byte)-53, var6 + -var7, hla.g);
                     var20 = eua.a(td.r, (byte)-53, var6 + var17, hla.g);
                     var21 = eua.a(td.r, (byte)-53, var6 + -var17, hla.g);
                     if(sda.c >= var16) {
                        var22 = fda.c[var16];
                        fka.a(var5, var22, var21, var19, (byte)-110);
                        fka.a(var4, var22, var20, var21, (byte)-96);
                        fka.a(var5, var22, var18, var20, (byte)86);
                     }

                     if(var25 >= sea.k) {
                        var22 = fda.c[var25];
                        fka.a(var5, var22, var21, var19, (byte)121);
                        fka.a(var4, var22, var20, var21, (byte)96);
                        fka.a(var5, var22, var18, var20, (byte)88);
                     }
                  }
               }
            }

            var25 = -var7 + var2;
            var16 = var7 + var2;
            if(sea.k <= var16 && var25 <= sda.c) {
               var17 = var9 + var6;
               var18 = var6 - var9;
               if(var17 >= hla.g && td.r >= var18) {
                  var17 = eua.a(td.r, (byte)-53, var17, hla.g);
                  var18 = eua.a(td.r, (byte)-53, var18, hla.g);
                  if(var7 >= var8) {
                     if(var16 <= sda.c) {
                        fka.a(var5, fda.c[var16], var17, var18, (byte)-80);
                     }

                     if(var25 >= sea.k) {
                        fka.a(var5, fda.c[var25], var17, var18, (byte)-103);
                     }
                  } else {
                     var19 = var7 > var11?th.c[var7]:var11;
                     var20 = eua.a(td.r, (byte)-53, var19 + var6, hla.g);
                     var21 = eua.a(td.r, (byte)-53, var6 + -var19, hla.g);
                     if(sda.c >= var16) {
                        var22 = fda.c[var16];
                        fka.a(var5, var22, var21, var18, (byte)-81);
                        fka.a(var4, var22, var20, var21, (byte)-89);
                        fka.a(var5, var22, var17, var20, (byte)89);
                     }

                     if(var25 >= sea.k) {
                        var22 = fda.c[var25];
                        fka.a(var5, var22, var21, var18, (byte)-102);
                        fka.a(var4, var22, var20, var21, (byte)-106);
                        fka.a(var5, var22, var17, var20, (byte)59);
                     }
                  }
               }
            }
         }
      }

      if(var0 <= 86) {
         a = -33;
      }

   }

   static final void a(int var0, boolean var1, Object[] var2) {
      if(var1) {
         ((int[])((int[])var2[1]))[0] = var0;
         ++c;
      }
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++d;
      if(null != var1 && -2 == ~var1.length) {
         ava.a(false, 83, new Object[0][], -89L, (Object)null);
      }

      int var6 = 107 / ((10 - var0) / 57);
      if(sp.b != null) {
         wg var3;
         wg var4;
         for(Object[] var15 = (var3 = (wg)gm.a((Object[])((Object[])var1[2]), 0)) == null?null:var3.t; var15 != null; var15 = null != (var4 = (wg)dka.a((Object[])((Object[])var1[2]), (byte)14))?var4.t:null) {
            if(!du.a((byte)-100, var15)) {
               if((long)var2 < ++((tha)(null == var15?null:var15[0])).m) {
                  Object[] var17 = sp.b;
                  if(null == var17) {
                     throw new IllegalStateException();
                  }

                  Object[] var19 = new Object[3];
                  Object var20 = cq.a((byte)81, var15);
                  int var22 = ((int[])((int[])var15[1]))[0];
                  pba.a(1, var19);
                  wg var24 = new wg(var19);
                  var19[0] = var24;
                  ((int[])((int[])var19[1]))[0] = var22;
                  var19[2] = new SoftReference(var20);
                  Object[] var9;
                  di.a((Object[])((Object[])var1[0]), true, (lm)((var9 = var19) != null?var9[0]:null), ((lm)(null == var15?null:var15[0])).e);
                  mh.a((tha)(null != var15?var15[0]:null), (byte)-75, (tha)(var19 != null?var19[0]:null));
                  ((lm)(null == var15?null:var15[0])).a((byte)22);
                  ((tha)(var15 != null?var15[0]:null)).a(8192);
               }
            } else if(null == cq.a((byte)81, var15)) {
               ((lm)(var15 != null?var15[0]:null)).a((byte)116);
               ((tha)(null != var15?var15[0]:null)).a(8192);
               ((int[])((int[])var1[1]))[0] += ((int[])((int[])var15[1]))[0];
            }
         }

         if(var1 != null && var1.length == 1) {
            lga.b(0, (Object[])null);
         }
      }

   }

}
