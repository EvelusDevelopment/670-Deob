
final class wp {

   static Object[] c = nb.a((byte)50, 32, new Object[5]);
   static Object[] a = sd.a(new Object[1], 46, (byte)123);
   static int b;


   static final void a(Object[] var0, int var1, int var2, int var3) {
      Object[] var4;
      if(var2 < eja.c) {
         var4 = ju.g[var1][var2 + 1][var3];
         if(var4 != null && var4[6] != null && fja.a(9, (Object[])((Object[])var4[6]))) {
            wfa.a(0, 1, true, iia.n, mpa.b, 0, (Object[])((Object[])var4[6]), var0);
         }
      }

      if(var3 < eja.c) {
         var4 = ju.g[var1][var2][var3 + 1];
         if(var4 != null && var4[6] != null && fja.a(9, (Object[])((Object[])var4[6]))) {
            wfa.a(iia.n, 1, true, 0, mpa.b, 0, (Object[])((Object[])var4[6]), var0);
         }
      }

      if(var2 < eja.c && var3 < me.c) {
         var4 = ju.g[var1][var2 + 1][var3 + 1];
         if(var4 != null && var4[6] != null && fja.a(9, (Object[])((Object[])var4[6]))) {
            wfa.a(iia.n, 1, true, iia.n, mpa.b, 0, (Object[])((Object[])var4[6]), var0);
         }
      }

      if(var2 < eja.c && var3 > 0) {
         var4 = ju.g[var1][var2 + 1][var3 - 1];
         if(var4 != null && var4[6] != null && fja.a(9, (Object[])((Object[])var4[6]))) {
            wfa.a(-iia.n, 1, true, iia.n, mpa.b, 0, (Object[])((Object[])var4[6]), var0);
         }
      }

   }

   static final int a(Object[] var0, byte var1) {
      ++b;
      if(var1 >= -92) {
         a = (Object[])null;
      }

      return ((int[])((int[])var0[1]))[0];
   }

}
