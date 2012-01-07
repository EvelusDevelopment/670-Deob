
final class iga {

   static int c;
   static int e;
   static Object[] d = sd.a(new Object[1], 84, (byte)111);
   static int b;
   static int a;


   static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      ++e;
      int var6 = 0;
      int var7 = var2;
      int var8 = var5 * var5;
      int var9 = var2 * var2;
      int var10 = var9 << 1;
      int var11 = var8 << 1;
      int var12 = var2 << 1;
      int var13 = var8 * (-var12 + 1) + var10;
      int var14 = -((var12 - 1) * var11) + var9;
      int var15 = var8 << 2;
      int var16 = var9 << 2;
      int var17 = var10 * (3 + (var6 << 1));
      int var18 = var11 * (-3 + (var2 << 1));
      int var19 = (1 + var6) * var16;
      if(var3 != 9968) {
         a((Object[])null, -82);
      }

      fka.a(var1, fda.c[var0], var4 + var5, -var5 + var4, (byte)-73);
      int var20 = var15 * (var2 - 1);

      while(0 < var7) {
         if(0 > var13) {
            while(0 > var13) {
               var13 += var17;
               var14 += var19;
               var19 += var16;
               var17 += var16;
               ++var6;
            }
         }

         if(0 > var14) {
            var13 += var17;
            var14 += var19;
            var19 += var16;
            var17 += var16;
            ++var6;
         }

         var14 += -var18;
         var13 += -var20;
         var20 -= var15;
         var18 -= var15;
         --var7;
         int var21 = var0 - var7;
         int var22 = var0 + var7;
         int var23 = var6 + var4;
         int var24 = var4 - var6;
         fka.a(var1, fda.c[var21], var23, var24, (byte)-52);
         fka.a(var1, fda.c[var22], var23, var24, (byte)70);
      }

   }

   static final void a(Object[] var0, int var1) {
      ++b;
      if(fca.a(125, (Object[])((Object[])var0[0])) != uha.g) {
         ((int[])((int[])var0[1]))[0] = 1;
      } else if(se.a((Object[])((Object[])var0[0]), (byte)-122)) {
         ((int[])((int[])var0[1]))[0] = 0;
      }

      if(var1 <= 106) {
         d = (Object[])null;
      }

      if(0 != ((int[])((int[])var0[1]))[0] && ((int[])((int[])var0[1]))[0] != 1) {
         int[] var2 = (int[])((int[])var0[1]);
         byte var3 = 1;
         var2[0] = var3;
      }

   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      var0[0] = eha.a(0, var2);
      if(var1 > -89) {
         a(-63, ((int[])((int[])((Object[])((Object[])var2[0]))[8]))[19], ((int[])((int[])((Object[])((Object[])d[2]))[13]))[35], -88, -22, ((int[])((int[])var0[5]))[4]);
      }

      ++a;
      var0[1] = eha.a(0, var2);
   }

}
