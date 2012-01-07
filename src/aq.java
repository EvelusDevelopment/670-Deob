
final class aq {

   static int a;
   static int b;


   static final void a(int var0, Object[] var1) {
      if(var0 < -116) {
         if(null == var1[12]) {
            var1[12] = new int[4];
         }

         if(null == var1[8]) {
            var1[8] = new boolean[8];
         }

         ++b;
         if(null == var1[10]) {
            var1[10] = new byte[3];
         }

      }
   }

   static final void a(Object[] var0, int var1) {
      ++a;
      if(0 != ((int[])((int[])var0[1]))[0]) {
         if(null == var0 || var0.length != 8 || !var0[3].equals(Integer.valueOf(2))) {
            ((int[])((int[])var0[1]))[4] = -1;
            ((int[])((int[])var0[1]))[1] = -1;
            if(var1 != 25737) {
               a(new Object[0], ((int[])((int[])var0[2]))[4]);
            }

            int var2 = 0;
            byte var3 = ((byte[])((byte[])var0[7]))[0];

            for(int var4 = 1; ((int[])((int[])var0[1]))[0] > var4; ++var4) {
               if(((byte[])((byte[])var0[7]))[var4] <= var3) {
                  if(0 == ~((int[])((int[])var0[1]))[4] && -126 == ~((byte[])((byte[])var0[7]))[var4]) {
                     ((int[])((int[])var0[1]))[4] = var4;
                  }
               } else {
                  if(var3 == 125) {
                     ((int[])((int[])var0[1]))[4] = var2;
                  }

                  var2 = var4;
                  var3 = ((byte[])((byte[])var0[7]))[var4];
               }
            }

            ((int[])((int[])var0[1]))[1] = var2;
            if(((int[])((int[])var0[1]))[1] != -1) {
               ((byte[])((byte[])var0[7]))[((int[])((int[])var0[1]))[1]] = 126;
            }

         }
      } else {
         ((int[])((int[])var0[1]))[1] = -1;
         ((int[])((int[])var0[1]))[4] = -1;
      }
   }

}
