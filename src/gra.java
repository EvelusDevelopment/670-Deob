
final class gra {

   static int b;
   static Object[] c = nea.a(new Object[1], 0, (byte)-89);
   static int e;
   static int a = -1;
   static int d;


   static final void a(byte var0) {
      if(var0 <= 116) {
         a(((int[])((int[])c[7]))[10], 62, (Object[])null);
      }

      ++d;
      dq.a(-4, np.f_i);
   }

   static final Object[] a(int var0, int var1, Object[] var2) {
      ++b;
      Object[] var3;
      synchronized(var2[0]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var2[0]), (long)var0));
      }

      if(null == var3) {
         byte[] var4;
         synchronized(var2[2]) {
            var4 = qn.a(47, var0, (Object[])((Object[])var2[2]), 102);
         }

         var3 = gt.a(61, new Object[2]);
         if(null != var4) {
            aha.a(var3, jta.a((byte)-106, var4, new Object[3]), (byte)-22);
         }

         synchronized(var2[0]) {
            il.a((long)var0, var3, true, (Object[])((Object[])var2[0]));
         }

         return var1 < 72?(Object[])null:var3;
      } else {
         return var3;
      }
   }

}
