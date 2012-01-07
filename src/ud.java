
final class ud {

   static int b;
   static int a;


   static final Object[] a(int var0, int var1, int var2) {
      Object[] var3 = ju.g[var0][var1][var2];
      if(var3 == null) {
         return null;
      } else {
         Object[] var4 = (Object[])((Object[])var3[7]);
         var3[7] = null;
         poa.a(var4);
         return var4;
      }
   }

   static final Object[] a(int var0, Object[] var1, int var2) {
      if(null == var1[1]) {
         var1[1] = new int[2];
      }

      ++a;
      uca.a(0, var1, false, true);
      lqa.a(var1, false);
      ((int[])((int[])var1[1]))[var0] = var2;
      return var1;
   }

   static final void a(Object[] var0, int var1, int var2, int var3, int var4) {
      ++b;
      int[] var10000 = (int[])((int[])var0[0]);
      Object[] var5;
      Object[] var10002 = var5 = (Object[])((Object[])var0[var1]);
      var10000[var3 + ((aa)(var10002 != null?var5[2]:null)).f_i * var2] |= 1 << var4;
      ++((int[])((int[])var0[1]))[4];
   }

}
