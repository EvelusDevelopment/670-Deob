
final class bg {

   static byte f_i = -6;
   static Object[] h = im.a(new Object[2], (int)-16365);
   static int b;
   static int g;
   static int a;
   static int d;
   static int e;
   static int[] f = new int[13];
   static int c;


   static final int a(Object[] var0, int var1) {
      ++d;
      return var1 >= -111?((int[])((int[])h[3]))[2]:22;
   }

   static final int a(boolean var0, Object[] var1) {
      ++c;
      return !var0?((int[])((int[])var1[0]))[4]:((int[])((int[])var1[1]))[0];
   }

   static final boolean a(Object[] var0, byte var1) {
      ++a;
      if(var1 <= 103) {
         a(true, (Object[])null);
      }

      return false;
   }

   static final int a(int var0, Object[] var1) {
      ++g;
      if(var0 != 1) {
         a((Object[])null, (int)124);
      }

      return ((int[])((int[])var1[1]))[4];
   }

   static final String a(boolean var0, int var1, boolean var2, int var3, byte var4) {
      ++e;
      String var5 = "";
      int var6 = -75 / ((23 - var4) / 46);
      if(!var0) {
         var5 = var5 + "l" + var1 + '_' + var3;
      } else {
         var5 = var5 + "m" + var1 + '_' + var3;
      }

      if(var2) {
         var5 = 'u' + var5;
      }

      return var5;
   }

   static final Object[] a(Object[] var0, byte var1, int[] var2) {
      ++b;

      int var3;
      for(var3 = 1; var3 <= var2.length + (var2.length >> 1); var3 <<= 1) {
         ;
      }

      if(var1 != 89) {
         return (Object[])null;
      } else {
         if(var0 != null && var0.length == 8) {
            pe.a(new Object[5][], false, 77);
         }

         var0[0] = new int[var3 + var3];

         int var4;
         for(var4 = 0; var3 + var3 > var4; ++var4) {
            ((int[])((int[])var0[0]))[var4] = -1;
         }

         int var5;
         for(var4 = 0; var2.length > var4; ((int[])((int[])var0[0]))[var5 - (-var5 - 1)] = var4++) {
            for(var5 = var2[var4] & var3 - 1; ((int[])((int[])var0[0]))[1 + var5 + var5] != -1; var5 = var3 - 1 & var5 + 1) {
               ;
            }

            if(var0 != null && -4 == ~var0.length) {
               return new Object[5][];
            }

            ((int[])((int[])var0[0]))[var5 + var5] = var2[var4];
         }

         return var0;
      }
   }

}
