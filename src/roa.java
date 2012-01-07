
final class roa {

   static kra b;
   static int c;
   static int d;
   static int a;
   static int e;


   static final int a(int var0, byte var1, String var2, String var3) {
      if(var1 > -27) {
         b = (kra)null;
      }

      ++c;
      int var4 = var3.length();
      int var5 = var2.length();
      int var6 = 0;
      int var7 = 0;
      char var8 = 0;
      char var9 = 0;

      while(var6 + -var8 < var4 || var7 + -var9 < var5) {
         if(~var4 >= ~(-var8 + var6)) {
            return -1;
         }

         if(-var9 + var7 >= var5) {
            return 1;
         }

         char var10;
         if(var8 == 0) {
            var10 = var3.charAt(var6++);
         } else {
            var10 = var8;
            boolean var15 = false;
         }

         char var11;
         if(var9 == 0) {
            var11 = var2.charAt(var7++);
         } else {
            var11 = var9;
            boolean var16 = false;
         }

         var8 = gh.a(var10, -106);
         var9 = gh.a(var11, -68);
         var10 = gfa.a(var0, -9253, var10);
         var11 = gfa.a(var0, -9253, var11);
         if(var10 != var11 && ~Character.toUpperCase(var10) != ~Character.toUpperCase(var11)) {
            var10 = Character.toLowerCase(var10);
            var11 = Character.toLowerCase(var11);
            if(var11 != var10) {
               return rs.a(true, var10, var0) + -rs.a(true, var11, var0);
            }
         }
      }

      int var19 = Math.min(var4, var5);

      char var13;
      int var18;
      for(var18 = 0; var18 < var19; ++var18) {
         if(var0 != 2) {
            var7 = var18;
            var6 = var18;
         } else {
            var7 = var5 + (-1 - var18);
            var6 = var4 - 1 + -var18;
         }

         char var12 = var3.charAt(var6);
         var13 = var2.charAt(var7);
         if(var12 != var13 && Character.toUpperCase(var12) != Character.toUpperCase(var13)) {
            var12 = Character.toLowerCase(var12);
            var13 = Character.toLowerCase(var13);
            if(var13 != var12) {
               return rs.a(true, var12, var0) + -rs.a(true, var13, var0);
            }
         }
      }

      var18 = -var5 + var4;
      if(var18 != 0) {
         return var18;
      } else {
         for(int var17 = 0; var17 < var19; ++var17) {
            var13 = var3.charAt(var17);
            char var14 = var2.charAt(var17);
            if(var13 != var14) {
               return rs.a(true, var13, var0) - rs.a(true, var14, var0);
            }
         }

         return 0;
      }
   }

   static final void a(Object[] var0, int var1, Object[] var2, int var3) {
      ++e;
      nq.a(false, var0, var3, (byte)-123, var2);
      if(var1 <= 77) {
         a(37, (byte)4, (String)null, (String)null);
      }

   }

   static final Object[] a(int var0, int var1) {
      ++d;
      if(var0 != 3) {
         a(-13, 91);
      }

      Object[] var2 = oda.a(false, new Object[3], var0 ^ -39, var1);
      return var2;
   }

   static final int a(int var0, int var1, int var2, Object[] var3) {
      ++a;
      int var4 = nma.a <= var0?var0:nma.a;
      return var1 != 2?-73:(var3 == vg.c?0:(sea.f_l != var3?(var3 == paa.a?(-var2 + var4) / 2:0):var4 + -var2));
   }

}
