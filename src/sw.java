
final class sw {

   static int c;
   static Object[] f = ed.a(8, new Object[1], (byte)-110, 69);
   static int b;
   static int d;
   static int e;
   static int a;


   static final Object[] a(Object[] var0, int var1, int var2) {
      ++d;
      Object[] var3;
      synchronized(var0[1]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var0[1]), (long)var2));
      }

      if(null == var3) {
         byte[] var4;
         synchronized(var0[0]) {
            var4 = qn.a(31, var2, (Object[])((Object[])var0[0]), -44);
         }

         var3 = dd.a(new Object[1], 2);
         if(var4 != null) {
            bp.a(var3, 30584, jta.a((byte)-112, var4, new Object[3]));
         }

         if(var1 > -20) {
            f = (Object[])null;
         }

         synchronized(var0[1]) {
            il.a((long)var2, var3, true, (Object[])((Object[])var0[1]));
            return var3;
         }
      } else {
         return var3;
      }
   }

   static final void a(Object[] var0, boolean var1) {
      ++c;
      if(var1) {
         f = (Object[])null;
      }

      if(var0[1] == null) {
         var0[1] = new int[7];
      }

   }

   static final void a(Object[] var0, byte var1) throws Throwable {
      for(int var2 = 0; qsa.a((byte)-9, var0) > var2; ++var2) {
         sha.a(true, sm.a(3, var2, var0));
      }

      ac.b(-11392, var0);
      if(null != var0 && -3 == ~var0.length && var0[1].equals(Integer.valueOf(0))) {
         cna.a((int)-19031, (Object[])null);
      }

      ++b;
      if(var1 < 64) {
         ((int[])((int[])((Object[])((Object[])f[2]))[0]))[33] = ((int[])((int[])var0[2]))[1];
      }

      ((po)var0[0]).a((byte)90);
   }

   static final void a(int var0, int var1, ka var2, byte var3, Object[] var4) {
      if(var3 > -57) {
         a = 18;
      }

      ++e;
      if(ih.a(var4, 0)) {
         var2.a((byte)-12, ((int[])((int[])var4[1]))[3], ((boolean[])((boolean[])((Object[])((Object[])var4[4]))[4]))[1], (int[])null, (Object[])((Object[])((Object[])((Object[])var4[2]))[3]), (Object[])((Object[])((Object[])((Object[])var4[2]))[2]), var0, var1, ((int[])((int[])((Object[])((Object[])var4[2]))[1]))[0], ((int[])((int[])((Object[])((Object[])var4[2]))[1]))[1], ((int[])((int[])((Object[])((Object[])var4[4]))[5]))[((int[])((int[])var4[1]))[4]]);
         if(((boolean[])((boolean[])var4[3]))[1] && null != ((Object[])((Object[])var4[4]))[3] && ((boolean[])((boolean[])((Object[])((Object[])var4[0]))[0]))[0]) {
            var2.a((byte)-12, ((int[])((int[])var4[1]))[3], ((boolean[])((boolean[])((Object[])((Object[])var4[4]))[4]))[1], (int[])null, (Object[])((Object[])((Object[])((Object[])var4[0]))[3]), (Object[])((Object[])((Object[])((Object[])var4[0]))[2]), var0, var1, ((int[])((int[])((Object[])((Object[])var4[0]))[1]))[0], ((int[])((int[])((Object[])((Object[])var4[0]))[1]))[1], ((int[])((int[])((Object[])((Object[])var4[4]))[5]))[((int[])((int[])var4[1]))[4]]);
         }
      }

   }

}
