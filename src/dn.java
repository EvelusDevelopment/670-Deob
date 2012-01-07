
final class dn {

   static int b;
   static Object[] a;
   static int c;
   static boolean d = false;
   static int e;


   static final Object[] a(int var0, int var1, int[] var2, Object[] var3, int[] var4, int var5) {
      ++e;
      if(var1 <= 62) {
         d = ((boolean[])((boolean[])((Object[])((Object[])var3[10]))[0]))[2];
      }

      byte[] var6 = new byte[var0 * var5];

      for(int var7 = 0; var0 > var7; ++var7) {
         if(var3 != null && (var3.length == 11 || var3.length == 15 && var3[8].equals(Integer.valueOf(0)))) {
            return null;
         }

         int var8 = var7 * var5 + var4[var7];

         for(int var9 = 0; var9 < var2[var7]; ++var9) {
            var6[var8++] = -1;
         }
      }

      return ela.a((byte)-25, var0, new Object[2], var5, var6, var3);
   }

   static final boolean a(int var0, Object[] var1) {
      ++c;
      if(var0 > -46) {
         d = true;
      }

      return ((boolean[])((boolean[])var1[8]))[7];
   }

}
