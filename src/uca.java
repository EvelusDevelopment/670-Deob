
final class uca {

   static int b;
   static Object[] c = lfa.a("", 9, "", new Object[1], 4, "");
   static int a;
   static int f;
   static int d;
   static int e;


   static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = -5 / ((var3 - 39) / 55);
      if(sda.c >= var2 && sea.k <= var1) {
         boolean var7;
         if(hla.g <= var5) {
            if(var5 <= td.r) {
               var7 = true;
            } else {
               var5 = td.r;
               var7 = false;
            }
         } else {
            var5 = hla.g;
            var7 = false;
         }

         boolean var8;
         if(var4 < hla.g) {
            var4 = hla.g;
            var8 = false;
         } else if(td.r < var4) {
            var8 = false;
            var4 = td.r;
         } else {
            var8 = true;
         }

         if(var2 < sea.k) {
            var2 = sea.k;
         } else {
            fka.a(var0, fda.c[var2++], var4, var5, (byte)66);
         }

         if(sda.c >= var1) {
            fka.a(var0, fda.c[var1--], var4, var5, (byte)-62);
         } else {
            var1 = sda.c;
         }

         int var9;
         if(var7 && var8) {
            for(var9 = var2; var9 <= var1; ++var9) {
               int[] var10 = fda.c[var9];
               var10[var5] = var10[var4] = var0;
            }
         } else if(var7) {
            for(var9 = var2; var1 >= var9; ++var9) {
               fda.c[var9][var5] = var0;
            }
         } else if(var8) {
            for(var9 = var2; var9 <= var1; ++var9) {
               fda.c[var9][var4] = var0;
            }
         }
      }

      ++f;
   }

   static final ora a(Object[] var0, byte var1) {
      ++e;
      return var1 >= -51?(ora)c[9]:new ora(var0);
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      ++a;

      while(true) {
         int var3 = fh.a(var0, false);
         if(0 == var3) {
            if(null != var1 && -10 == ~var1.length) {
               return;
            }

            if(var2 != 0) {
               a(true, -10, (byte)28, (Object[])null);
            }

            return;
         }

         if(var3 == 1) {
            ((int[])((int[])var1[1]))[1] = fma.c(-17126, var0);
         } else if(2 == var3) {
            ((int[])((int[])var1[1]))[0] = fh.a(var0, false);
            ((int[])((int[])var1[1]))[2] = fh.a(var0, false);
         }
      }
   }

   static final Object[] a(int var0, Object[] var1, boolean var2, boolean var3) {
      ++d;
      cf.a((byte)-109, var1);
      iqa var5 = new iqa(var1);
      var1[2] = new Object[var0][];
      ((boolean[])((boolean[])var1[3]))[0] = var3;
      var1[0] = var5;
      return var2?(Object[])((Object[])var1[3]):var1;
   }

   static final void a(boolean var0, int var1, byte var2, Object[] var3) {
      ++b;
      tma.a(104, 0, var3, 0, var0, var1);
      if(var2 >= -52) {
         c = (Object[])null;
      }

   }

}
