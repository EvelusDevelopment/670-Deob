
final class id {

   static int h;
   static int g;
   static int d;
   static int c;
   static Object[] b = ed.a(1, new Object[1], (byte)-127, 21);
   static Object[] f = sj.a(260, new Object[3], (byte)-24);
   static boolean e = false;
   static Object[][] a;


   static final void a(int var0, byte var1, int var2, int var3, int var4, int var5) {
      ++g;
      int var6 = var2 - var5;
      int var7 = -var0 + var4;
      if(0 == var6) {
         if(var7 != 0) {
            dm.a(var0, var4, var3, -22172, var5);
         }

      } else if(var7 != 0) {
         int var12 = (var7 << 12) / var6;
         int var13 = -(var12 * var5 >> 12) + var0;
         int var8;
         int var10;
         if(hla.g <= var5) {
            if(td.r >= var5) {
               var8 = var5;
               var10 = var0;
            } else {
               var10 = (var12 * td.r >> 12) + var13;
               var8 = td.r;
            }
         } else {
            var8 = hla.g;
            var10 = var13 + (var12 * hla.g >> 12);
         }

         if(var1 <= 61) {
            a(((int[])((int[])f[3]))[2], (byte)25, 8, ((int[])((int[])b[15]))[0], -10, 110);
         }

         int var9;
         int var11;
         if(var2 >= hla.g) {
            if(td.r >= var2) {
               var9 = var2;
               var11 = var4;
            } else {
               var9 = td.r;
               var11 = (td.r * var12 >> 12) + var13;
            }
         } else {
            var9 = hla.g;
            var11 = (var12 * hla.g >> 12) + var13;
         }

         if(var11 < sea.k) {
            var9 = (sea.k + -var13 << 12) / var12;
            var11 = sea.k;
         } else if(sda.c < var11) {
            var9 = (sda.c + -var13 << 12) / var12;
            var11 = sda.c;
         }

         if(sea.k > var10) {
            var8 = (sea.k + -var13 << 12) / var12;
            var10 = sea.k;
         } else if(var10 > sda.c) {
            var8 = (-var13 + sda.c << 12) / var12;
            var10 = sda.c;
         }

         qi.a(var3, var9, var10, var8, 13429, var11);
      } else {
         qba.a(var0, var3, 1, var5, var2);
      }
   }

   static final Object[] a(int var0, Object[] var1) {
      ++h;
      return var0 != 6?(Object[])null:(Object[])((Object[])var1[6]);
   }

   static final int a(Object[] var0, int var1) {
      int var2 = -28 % ((40 - var1) / 34);
      ++d;
      byte[] var10000 = (byte[])((byte[])var0[2]);
      int[] var10001 = (int[])((int[])var0[1]);
      int var10004 = ((int[])((int[])var0[1]))[0];
      var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      return -var10000[var10004] + 0 & 255;
   }

   static final void a(int var0, int var1, Object[] var2) {
      ++c;
      if(var2 != null && 1 == var2.length) {
         eja.g = null;
      }

      if(kea.c) {
         Object[] var5 = ssa.a((byte)36);
         int var6 = 0;

         ni var3;
         ni var4;
         int var8;
         for(Object[] var7 = (var3 = (ni)gm.a((Object[])((Object[])var2[0]), var0 ^ 0)) == null?null:var3.t; var7 != null; var7 = (var4 = (ni)dka.a((Object[])((Object[])var2[0]), (byte)25)) != null?var4.t:null) {
            var8 = et.a(var5, var0 + 2, var7);
            if(var8 > var6) {
               var6 = var8;
            }
         }

         var6 += 8;
         sba.e = ((int[])((int[])var2[1]))[0] * kw.e + (isa.g?26:22);
         int var11 = 21 + kw.e * ((int[])((int[])var2[1]))[var0];
         var8 = kb.a + vta.v;
         if(~wr.n > ~(var6 + var8)) {
            var8 = -var6 + kb.a;
         }

         if(0 > var8) {
            var8 = 0;
         }

         int var9 = isa.g?20 + ((int[])((int[])var5[1]))[0] + 1:31;
         int var10 = -var9 + var1 + ((int[])((int[])var5[1]))[0] + 1;
         if(var10 + var11 > nma.a) {
            var10 = nma.a + -var11;
         }

         if(var10 < 0) {
            var10 = 0;
         }

         dga.n = var8;
         csa.f = var6;
         cj.k = var2;
         bma.k = var10;
      }
   }

}
