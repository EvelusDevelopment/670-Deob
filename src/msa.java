
final class msa {

   static int c;
   static int[] a;
   static long e = 1L;
   static int b;
   static int f;
   static int d;


   static final Object[] a(int var0, byte var1, Object[] var2) {
      if(var1 != -45) {
         e = 103L;
      }

      ++c;
      return null != var2[6] && 0 <= var0 && ~var0 >= ~((int[])((int[])var2[6])).length?ms.a(((int[])((int[])var2[6]))[var0], (byte)124):null;
   }

   static final void a(int var0, boolean var1, Object[] var2) {
      ++b;
      if(var0 <= 19) {
         a((Object[])((Object[])var2[1]), -87);
      }

      if(var1) {
         if(null != var2 && var2.length == 26) {
            return;
         }

         int var3 = iia.r >= wr.n?iia.r:wr.n;
         int var4 = qga.j < nma.a?nma.a:qga.j;
         int var5 = ((cga)var2[1]).f();
         int var6 = ((cga)var2[1]).d();
         int var7 = 0;
         int var8 = var3;
         int var9 = var3 * var6 / var5;
         int var10 = (var4 + -var9) / 2;
         if(var4 < var9) {
            var8 = var4 * var5 / var6;
            var9 = var4;
            var10 = 0;
            var7 = (var3 - var8) / 2;
         }

         ((cga)var2[1]).c(var7, var10, var8, var9);
      }

   }

   static final int a(Object[] var0, int var1) {
      ++d;
      if(var1 != -7125) {
         a = (int[])null;
      }

      return ((int[])((int[])var0[1]))[3];
   }

   static final void a(Object[] var0, int var1, int var2, byte var3, int var4, ta var5) {
      ++f;
      Object[] var6 = uqa.a(((int[])((int[])var0[1]))[34], rka.d, 121);
      if(0 != ~((int[])((int[])var6[1]))[0]) {
         if(!((boolean[])((boolean[])var0[0]))[4]) {
            var1 = 0;
         } else {
            var1 += ((int[])((int[])var0[1]))[23];
            var1 &= 3;
         }

         cga var7 = qba.a(var6, var5, true, ((boolean[])((boolean[])var0[0]))[0], var1);
         if(var7 != null) {
            if(var6 != null && var6.length == 5 && var6[1].equals(Boolean.valueOf(false))) {
               mba.a(110);
            }

            if(var3 != -32) {
               ((byte[])((byte[])var0[3]))[5] = -52;
            }

            int var8 = ((int[])((int[])var0[1]))[28];
            int var9 = ((int[])((int[])var0[1]))[10];
            if((var1 & 1) == 1) {
               var8 = ((int[])((int[])var0[1]))[10];
               var9 = ((int[])((int[])var0[1]))[28];
            }

            int var10 = var7.f();
            int var11 = var7.d();
            if(((boolean[])((boolean[])var6[2]))[0]) {
               var11 = var9 * 4;
               var10 = var8 * 4;
            }

            if(-1 == ~((int[])((int[])var6[1]))[1]) {
               var7.c(var2, -(4 * (-1 + var9)) + var4, var10, var11);
            } else {
               var7.b(var2, -(4 * var9) + 4 + var4, var10, var11, 0, ((int[])((int[])var6[1]))[1] | -16777216, 1);
            }

         }
      }
   }

}
