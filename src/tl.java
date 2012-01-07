import java.io.FileOutputStream;

final class tl {

   static int e;
   static int d;
   static int b;
   static int c;
   static vp a;
   static FileOutputStream f;


   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      ++e;
      int var8 = 0;
      int var9 = var7;
      int var10 = 0;
      int var11 = -var6 + var3;
      int var12 = -var6 + var7;
      int var13 = var3 * var3;
      int var14 = var7 * var7;
      int var15 = var11 * var11;
      int var16 = var12 * var12;
      int var17 = var14 << 1;
      int var18 = var13 << 1;
      int var19 = var16 << 1;
      int var20 = var15 << 1;
      int var21 = var7 << 1;
      int var22 = var12 << 1;
      int var23 = var13 * (1 - var21) + var17;
      int var24 = var14 + -(var18 * (-1 + var21));
      int var25 = (-var22 + 1) * var15 + var19;
      int var26 = -(var20 * (-1 + var22)) + var16;
      int var27 = var13 << 2;
      int var28 = var14 << 2;
      int var29 = var15 << 2;
      int var30 = var16 << 2;
      int var31 = var17 * 3;
      if(var2 == 669944674) {
         int var32 = (-3 + var21) * var18;
         int var33 = var19 * 3;
         int var34 = var20 * (-3 + var22);
         int var35 = var28;
         int var36 = (-1 + var7) * var27;
         int var37 = var30;
         int var38 = (var12 - 1) * var29;
         int[] var39 = fda.c[var0];
         fka.a(var4, var39, -var11 + var5, -var3 + var5, (byte)-57);
         fka.a(var1, var39, var11 + var5, -var11 + var5, (byte)87);
         fka.a(var4, var39, var5 + var3, var5 + var11, (byte)-101);

         while(0 < var9) {
            boolean var40 = var12 >= var9;
            if(var23 < 0) {
               while(0 > var23) {
                  var23 += var31;
                  var24 += var35;
                  var31 += var28;
                  var35 += var28;
                  ++var8;
               }
            }

            if(var40) {
               if(0 > var25) {
                  while(0 > var25) {
                     var25 += var33;
                     var26 += var37;
                     ++var10;
                     var33 += var30;
                     var37 += var30;
                  }
               }

               if(0 > var26) {
                  var25 += var33;
                  var26 += var37;
                  var37 += var30;
                  ++var10;
                  var33 += var30;
               }

               var25 += -var38;
               var26 += -var34;
               var34 -= var29;
               var38 -= var29;
            }

            if(var24 < 0) {
               var24 += var35;
               var23 += var31;
               ++var8;
               var31 += var28;
               var35 += var28;
            }

            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            --var9;
            int var41 = var0 + -var9;
            int var42 = var9 + var0;
            int var43 = var5 + var8;
            int var44 = var5 - var8;
            if(!var40) {
               fka.a(var4, fda.c[var41], var43, var44, (byte)50);
               fka.a(var4, fda.c[var42], var43, var44, (byte)120);
            } else {
               int var45 = var5 + var10;
               int var46 = -var10 + var5;
               fka.a(var4, fda.c[var41], var46, var44, (byte)-90);
               fka.a(var1, fda.c[var41], var45, var46, (byte)97);
               fka.a(var4, fda.c[var41], var43, var45, (byte)-99);
               fka.a(var4, fda.c[var42], var46, var44, (byte)109);
               fka.a(var1, fda.c[var42], var45, var46, (byte)-121);
               fka.a(var4, fda.c[var42], var43, var45, (byte)-65);
            }
         }

      }
   }

   static final void a(byte var0, Object[] var1) {
      ++c;
      if(var1 != null && var1.length == 16) {
         aha.a((byte)121, var1);
      } else if(null == var1 || 20 != var1.length || !var1[14].equals(Integer.valueOf(0))) {
         if(null == var1 || -23 != ~var1.length) {
            if(var1 != null && var1.length == 18) {
               or.b(var1, (int)16);
            } else if(null != var1 && 23 == var1.length) {
               if(null != var1[18]) {
                  ((ka)var1[18]).f();
               }

            } else if(var1 != null && var1.length == 17) {
               if(null != var1[16]) {
                  ((ka)var1[16]).f();
               }

            } else if(null != var1 && var1.length == 20 && -9 == ~((boolean[])((boolean[])var1[8])).length) {
               if(var1[19] != null) {
                  ((ka)var1[19]).f();
               }

            } else if(var1 == null || -21 != ~var1.length || ((boolean[])((boolean[])var1[8])).length != 7) {
               if(var0 != 4) {
                  a((byte)109, (Object[])((Object[])var1[5]));
               }

               throw new IllegalStateException();
            }
         }
      }
   }

   static final void a(Object[] var0, boolean var1) {
      ++b;
      if(!var1) {
         a = (vp)null;
      }

      if(var0[4] == null) {
         var0[4] = new byte[1];
      }

      if(var0[1] == null) {
         var0[1] = new int[6];
      }

   }

}
