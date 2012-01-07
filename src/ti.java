
final class ti {

   static int c;
   static Object[] a = ho.a(8, 79, new Object[1], true);
   static int b;


   static final int a(int var0, int var1, int var2, int var3, int var4, byte var5, int var6) {
      var1 &= 3;
      ++c;
      if((1 & var4) == 1) {
         int var7 = var3;
         var3 = var2;
         var2 = var7;
      }

      if(0 == var1) {
         return var0;
      } else if(var1 == 1) {
         return 1 - (var3 - 7) - var6;
      } else if(2 != var1) {
         if(var5 <= 65) {
            a = (Object[])null;
         }

         return var6;
      } else {
         return -var0 + 8 + -var2;
      }
   }

   static final void a(int var0, Object[] var1) {
      var1[4] = null;
      var1[var0] = null;
      var1[5] = null;
      ++b;
      var1[3] = null;
   }

}
