
final class wla {

   static int b;
   static int e;
   static int c;
   static int d;
   static int g;
   static ja f;
   static int a;


   static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      ++b;
      int var6 = 0;
      int var7 = var5;
      int var8 = var3 * var3;
      int var9 = var5 * var5;
      int var10 = var9 << 1;
      int var11 = var8 << 1;
      int var12 = var5 << 1;
      int var13 = var10 + (1 - var12) * var8;
      int var14 = var9 - (-1 + var12) * var11;
      int var15 = var8 << 2;
      int var16 = var9 << 2;
      int var17 = var10 * ((var6 << 1) + 3);
      int var18 = (-3 + (var5 << 1)) * var11;
      int var19 = var16 * (1 + var6);
      int var20 = (var5 - var4) * var15;
      int var21;
      int var22;
      if(var2 >= sea.k && sda.c >= var2) {
         var21 = eua.a(td.r, (byte)-53, var1 + var3, hla.g);
         var22 = eua.a(td.r, (byte)-53, -var3 + var1, hla.g);
         fka.a(var0, fda.c[var2], var21, var22, (byte)63);
      }

      while(var7 > 0) {
         if(0 > var13) {
            while(0 > var13) {
               var14 += var19;
               var13 += var17;
               ++var6;
               var17 += var16;
               var19 += var16;
            }
         }

         if(var14 < 0) {
            var14 += var19;
            var13 += var17;
            ++var6;
            var19 += var16;
            var17 += var16;
         }

         var14 += -var18;
         var13 += -var20;
         --var7;
         var20 -= var15;
         var18 -= var15;
         var21 = var2 - var7;
         var22 = var7 + var2;
         if(sea.k <= var22 && var21 <= sda.c) {
            int var23 = eua.a(td.r, (byte)-53, var6 + var1, hla.g);
            int var24 = eua.a(td.r, (byte)-53, var1 + -var6, hla.g);
            if(sea.k <= var21) {
               fka.a(var0, fda.c[var21], var23, var24, (byte)70);
            }

            if(var22 <= sda.c) {
               fka.a(var0, fda.c[var22], var23, var24, (byte)-71);
            }
         }
      }

   }

   static final void a(Object[] param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   static final lm a(byte var0, Object[] var1) {
      if(var0 <= 87) {
         a(((int[])((int[])var1[9]))[15], (Object[])null);
      }

      ++c;
      ((int[])((int[])var1[1]))[0] = 0;
      return em.a(0, var1);
   }

   static final String a(int var0, Object[] var1) {
      if(var0 >= -14) {
         f = (ja)var1[3];
      }

      ++d;
      return ((rd)var1[2]).b(true);
   }

   static final void b(Object[] var0, int var1) {
      if(var1 <= -19) {
         ++a;
         if(var0[1] == null) {
            var0[1] = new int[4];
         }

      }
   }

   static final void a(Object[] var0, int var1) {
      if(var0[var1] == null) {
         var0[1] = new int[2];
      }

      ++g;
   }

}
