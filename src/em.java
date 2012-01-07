
final class em {

   static Object[] b = Class_fs.a(4, (byte)-104, new Object[1], 1, 9, 0);
   static int d;
   static int g;
   static Object[] a = ed.a(8, new Object[1], (byte)-103, 8);
   static int e;
   static int c = -1;
   static Object[] f = lfa.a("", 9, "", new Object[1], 3, "");


   static final void a(Object[] var0, boolean var1, int var2, boolean var3, int var4, ta var5, Object[] var6, int var7) {
      ++g;
      if(var1) {
         a((Object[])null, false, 87, false, 91, (ta)null, (Object[])null, -108);
      }

      throw new IllegalStateException();
   }

   static final lm a(int var0, Object[] var1) {
      ++d;
      if(var1 != null && (7 == var1.length || 7 == var1.length)) {
         return null;
      } else {
         lm var2;
         if(((int[])((int[])var1[1]))[var0] > 0 && var1[0] != ((lm[])((lm[])((Object[])((Object[])var1[2]))[4]))[-1 + ((int[])((int[])var1[1]))[0]]) {
            var2 = (lm)var1[0];
            var1[0] = var2.f;
            return var2;
         } else {
            do {
               if(((int[])((int[])((Object[])((Object[])var1[2]))[1]))[1] <= ((int[])((int[])var1[1]))[0]) {
                  return null;
               }

               lm[] var10000 = (lm[])((lm[])((Object[])((Object[])var1[2]))[4]);
               int[] var10001 = (int[])((int[])var1[1]);
               int var10004 = ((int[])((int[])var1[1]))[0];
               var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
               var2 = var10000[var10004].f;
            } while(((lm[])((lm[])((Object[])((Object[])var1[2]))[4]))[-1 + ((int[])((int[])var1[1]))[0]] == var2);

            var1[0] = var2.f;
            return var2;
         }
      }
   }

   static final void b(int var0, Object[] var1) {
      ++e;
      ((int[])((int[])var1[0]))[4] = var0;
   }

}
