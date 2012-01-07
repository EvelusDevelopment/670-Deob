
final class nc {

   static int[] a = new int[4];
   static Object[] d = ed.a(6, new Object[1], (byte)-111, 132);
   static int e;
   static int c;
   static int b;


   static final void a(Object[][] var0, int var1, int var2) {
      if(var1 < var2) {
         int var3 = (var1 + var2) / 2;
         int var4 = var1;
         Object[] var5 = var0[var3];
         var0[var3] = var0[var2];
         var0[var2] = var5;
         int var6 = ((int[])((int[])var5[12]))[0];

         for(int var7 = var1; var7 < var2; ++var7) {
            if(((int[])((int[])var0[var7][12]))[0] < var6 + (var7 & 1)) {
               Object[] var8 = var0[var7];
               var0[var7] = var0[var4];
               var0[var4++] = var8;
            }
         }

         var0[var2] = var0[var4];
         var0[var4] = var5;
         a(var0, var1, var4 - 1);
         a(var0, var4 + 1, var2);
      }

   }

   static final Object[] a(boolean var0, Object[] var1) {
      if(var0) {
         d = (Object[])((Object[])var1[7]);
      }

      ++e;
      return (Object[])((Object[])var1[4]);
   }

   static final int a(Object[] var0, int var1) {
      if(var1 != 1794) {
         a = (int[])((int[])d[10]);
      }

      ++b;
      return ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[3];
   }

}
