
final class en {

   static int b;
   static int[] c;
   static int e;
   static int d;
   static int a;


   static final Object[] a(int var0, Object[] var1, byte var2) {
      ++a;
      Object[] var3;
      synchronized(var1[0]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var1[0]), (long)var0));
         if(var2 > -104) {
            ((long[])((long[])var1[7]))[1] = -74L;
         }
      }

      if(null != var3) {
         return var3;
      } else {
         byte[] var4;
         synchronized(var1[3]) {
            var4 = qn.a(33, var0, (Object[])((Object[])var1[3]), 74);
         }

         var3 = tsa.a(new Object[2], 3584);
         var3[0] = var1;
         if(null != var4) {
            uca.a(jta.a((byte)-110, var4, new Object[3]), var3, 0);
         }

         synchronized(var1[0]) {
            il.a((long)var0, var3, true, (Object[])((Object[])var1[0]));
         }

         return var1 != null && var1.length == 3?null:var3;
      }
   }

   static final void a(int var0, int var1, int var2) {
      ++b;
      Object[] var3 = la.a(var0, (long)var1, 12);
      jqa.a((byte)105, var3);
      ((int[])((int[])var3[0]))[1] = var2;
   }

   static final cga a(boolean var0, int var1, int var2, byte var3, Object[] var4, int var5, int[] var6, int var7) {
      ++e;
      Object[] var8;
      return var3 != 44?(cga)null:(cga)((var8 = tta.a(var1, new Object[6], var6, (byte)-97, var4, var7, var5, var2)) == null?null:var8[2]);
   }

   static final void a(int var0, Object[] var1) {
      if(var0 > 110) {
         if(var1[1] == null) {
            var1[1] = new int[1];
         }

         ++d;
      }
   }

}
