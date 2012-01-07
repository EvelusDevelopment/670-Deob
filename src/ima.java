
final class ima {

   static int d;
   static int[] g;
   static int a;
   static int b;
   static int e;
   static int c;
   static int[] h = new int[200];
   static int f;


   static final void a(int var0) {
      ++a;
      gea.v = (int)(34.46D * (double)rp.c);
      int var1 = 3 / ((var0 - 23) / 32);
      qja.k = 200;
      gea.v <<= 2;
      if(lna.g.m()) {
         gea.v += 512;
      }

   }

   static final boolean a(ya var0, int var1, int var2, Object[] var3, byte var4) {
      ++d;
      bca var5;
      Object[] var6 = null != (var5 = (bca)var0)?var5.I:null;
      var1 += ((int[])((int[])var6[1]))[3] + 1;
      var2 += ((int[])((int[])var6[1]))[2] + 1;
      if(var4 != -57) {
         ((boolean[])((boolean[])((Object[])((Object[])var3[2]))[1]))[2] = ((boolean[])((boolean[])var3[3]))[3];
      }

      int var7 = var1 + var2 * ((int[])((int[])var3[1]))[0];
      int var8 = ((int[])((int[])var6[1]))[1];
      if(null != var6 && var6.length == 10) {
         return true;
      } else {
         int var9 = ((int[])((int[])var6[1]))[0];
         int var10 = -var9 + ((int[])((int[])var3[1]))[0];
         int var11;
         if(0 >= var2) {
            var11 = 1 + -var2;
            var2 = 1;
            var7 += var11 * ((int[])((int[])var3[1]))[0];
            var8 -= var11;
         }

         if(var8 + var2 >= ((int[])((int[])var3[1]))[2]) {
            var11 = var8 + var2 + (1 - ((int[])((int[])var3[1]))[2]);
            var8 -= var11;
         }

         if(0 >= var1) {
            var11 = -var1 + 1;
            var1 = 1;
            var9 -= var11;
            var7 += var11;
            var10 += var11;
         }

         if(~((int[])((int[])var3[1]))[0] >= ~(var9 + var1)) {
            var11 = -((int[])((int[])var3[1]))[0] + (var1 - (-var9 - 1));
            var9 -= var11;
            var10 += var11;
         }

         if(var9 > 0 && var8 > 0) {
            byte var22 = 8;
            var10 += ((int[])((int[])var3[1]))[0] * (-1 + var22);
            byte[] var13 = (byte[])((byte[])var3[0]);
            int var14 = var7;
            int var15 = var9 % var22;
            int var16;
            if(0 != var15) {
               var16 = var22 - var15;
            } else {
               var16 = 0;
            }

            int var17 = -((-1 + var22 + var8) / var22);
            int var18 = -((-1 + var22 + var9) / var22);
            int var19 = var17;

            boolean var12;
            while(true) {
               if(0 <= var19) {
                  var12 = false;
                  break;
               }

               for(int var20 = var18; var20 < 0; ++var20) {
                  if(var13[var14] == 0) {
                     var12 = true;
                     return var12;
                  }

                  var14 += var22;
               }

               if(null != var6 && var6.length == 27) {
                  return false;
               }

               var14 -= var16;
               if(0 == var13[var14 - 1]) {
                  var12 = true;
                  break;
               }

               var14 += var10;
               ++var19;
            }

            return var12;
         } else {
            return false;
         }
      }
   }

   static final void a(int var0, byte var1, Object[] var2) {
      if(var1 == -81) {
         ++c;
         ((int[])((int[])var2[1]))[0] = var0;
      }
   }

   static final void a(ta var0, boolean var1, int var2, Object[] var3, int var4, Object[] var5, int var6, int var7) {
      ++f;
      if(var6 != 2) {
         h = (int[])((int[])var3[2]);
      }

      if(null != var3 && -24 == ~var3.length && var5[18] != null && var3[18] != null) {
         ((ka)var5[18]).a((ka)var3[18], var7, var4, var2, var1);
      }

   }

   static final Object[] a(int var0, byte[] var1, Object[] var2, Object[] var3, int var4) {
      if(var0 != -10426) {
         ((long[])((long[])var2[4]))[9] = 47L;
      }

      ++e;
      Object[] var6 = daa.a(24, new Object[6]);
      ((tha)(null != var6?var6[1]:null)).m = (long)var4;
      ((boolean[])((boolean[])var6[0]))[1] = false;
      ((int[])((int[])var6[4]))[0] = 2;
      var6[5] = var1;
      var6[2] = var2;
      lp.a(var3, var6, -5251);
      return var6;
   }

   static final void a(Object[] var0, boolean var1) {
      ++b;
      if(var1) {
         if(null != var0 && var0.length == 87) {
            ws.a(var0, -60);
         } else if(var0 != null && var0.length == 91) {
            ar.a((byte)112, var0);
         } else {
            throw new IllegalStateException();
         }
      }
   }

}
