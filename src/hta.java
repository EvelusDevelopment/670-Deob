
final class hta {

   static int a;
   static int b;


   static final byte[] a(int var0, int var1, byte var2, Object[] var3) {
      if(var2 < 108) {
         return (byte[])((byte[])var3[17]);
      } else {
         ++a;
         if(var3 != null) {
            return OutputStreamWorker.a(var1, var3, var0);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final boolean a(int var0, Object[] var1, Object[] var2) {
      ++b;
      int var3;
      if(-1 != ((int[])((int[])var1[1]))[2]) {
         var3 = cj.a(-55, ((int[])((int[])var1[1]))[2], var2);
      } else {
         if(((int[])((int[])var1[1]))[24] == -1) {
            return true;
         }

         var3 = rg.a(1, ((int[])((int[])var1[1]))[24], var2);
      }

      if(((int[])((int[])var1[1]))[18] <= var3 && ((int[])((int[])var1[1]))[3] >= var3) {
         boolean var4 = false;
         if(var0 > -25) {
            return false;
         } else {
            int var5;
            if(-1 == ((int[])((int[])var1[1]))[26]) {
               if(-1 == ((int[])((int[])var1[1]))[11]) {
                  return true;
               }

               var5 = rg.a(1, ((int[])((int[])var1[1]))[11], var2);
            } else {
               var5 = cj.a(-101, ((int[])((int[])var1[1]))[26], var2);
            }

            return ((int[])((int[])var1[1]))[22] <= var5 && var5 <= ((int[])((int[])var1[1]))[6];
         }
      } else {
         return false;
      }
   }

}
