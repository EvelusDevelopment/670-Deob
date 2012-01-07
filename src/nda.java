
final class nda {

   static Object[] e = sl.a("17", 0, new Object[1], "17");
   static int b;
   static Object[] a = sd.a(new Object[1], 78, (byte)113);
   static int d;
   static int c;


   static final lm a(int var0, Object[] var1) {
      ++b;
      lm var2;
      if(-1 > ~((int[])((int[])var1[var0]))[0] && var1[2] != ((lm[])((lm[])var1[4]))[((int[])((int[])var1[1]))[0] - 1]) {
         var2 = (lm)var1[2];
         var1[2] = var2.f;
         return var2;
      } else {
         do {
            if(~((int[])((int[])var1[1]))[0] <= ~((int[])((int[])var1[1]))[1]) {
               return null;
            }

            lm[] var10000 = (lm[])((lm[])var1[4]);
            int[] var10001 = (int[])((int[])var1[1]);
            int var10004 = ((int[])((int[])var1[1]))[0];
            var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
            var2 = var10000[var10004].f;
         } while(var2 == ((lm[])((lm[])var1[4]))[((int[])((int[])var1[1]))[0] - 1]);

         var1[2] = var2.f;
         return var2;
      }
   }

   static final boolean a(int var0, Object[] var1, int var2, int var3, long var4) {
      ++d;
      if(var1 != null && var1.length == 8) {
         return vw.a(var1, var4, var2, (byte)127, var3);
      } else if(var1 != null && 8 <= var1.length) {
         boolean var6;
         if(var1 != null && var1.length == 8) {
            var6 = vw.a(var1, var4, var2, (byte)123, var3);
         } else if(null != var1 && var1.length == 9) {
            var6 = dra.a(var4, var2, var3, -110, var1);
         } else {
            var6 = baa.a(false, var1, var4, var2, var3);
         }

         return var6;
      } else if(var1 != null && 9 == var1.length) {
         return dra.a(var4, var2, var3, -128, var1);
      } else if(var0 != -18243) {
         return ((boolean[])((boolean[])a[0]))[0];
      } else if(var1 != null && 6 == var1.length) {
         return lw.a(103, var1, var3, var2, var4);
      } else if(null != var1 && 7 == var1.length) {
         return ava.a(54, var4, var1, var2, var3);
      } else {
         throw new IllegalStateException();
      }
   }

}
