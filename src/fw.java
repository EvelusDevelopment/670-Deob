
final class fw {

   static int d;
   static Object[][] e = new Object[16][];
   static int f;
   static int a;
   static long b = 0L;
   static int c;


   static final Object[] a(int var0, Object[] var1, int[] var2, int var3, int var4) {
      if(null == var1[1]) {
         var1[1] = new int[2];
      }

      ++f;
      var1[0] = bu.b(var1, var3 ^ -26486);
      ((int[])((int[])var1[1]))[1] = var4;
      ((int[])((int[])var1[1]))[0] = var0;
      if(var3 != -26481) {
         e = (Object[][])((Object[][])var1[3]);
      }

      var1[2] = var2;
      return var1;
   }

   static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(var8 != -13544) {
         a((Object[])null, '\uffe9', -3, -122);
      }

      ++d;
      if(dea.a(var6, var8 ^ -12576, var7, var2)) {
         var6 = (int)vea.g[0];
         var7 = (int)vea.g[1];
         var2 = (int)vea.g[2];
         if(dea.a(var9, var8 ^ -12576, var5, var3)) {
            var9 = (int)vea.g[0];
            var5 = (int)vea.g[1];
            var3 = (int)vea.g[2];
            if(!dea.a(var1, 1528, var4, var0)) {
               return false;
            } else {
               var0 = (int)vea.g[2];
               var1 = (int)vea.g[0];
               var4 = (int)vea.g[1];
               return oqa.a(var3, var7, var5, var9, var0, var1, var4, var2, var6, var8 + 1417365236);
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   static final int a(Object[] var0, char var1, int var2, int var3) {
      ++c;
      if(var3 < 116) {
         a(((int[])((int[])((Object[])((Object[])var0[1]))[0]))[1], (Object[])null);
      }

      return null == var0[2]?0:((byte[][])((byte[][])var0[2]))[var2][var1];
   }

   static final int a(int var0, Object[] var1) {
      if(var0 != 1) {
         ((int[])((int[])var1[5]))[3] = ((int[])((int[])var1[13]))[8];
      }

      ++a;
      int var2 = ((int[])((int[])var1[1]))[1];
      return var2;
   }

}
