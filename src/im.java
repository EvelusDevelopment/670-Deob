
final class im {

   static int f;
   static int g;
   static int d;
   static Object[] a;
   static int e;
   static int[] h;
   static int c;
   static int b;


   static final void a(Object[] var0, byte var1) {
      ++b;
      synchronized(var0[1]) {
         if(var1 > 109) {
            lga.b(0, (Object[])((Object[])var0[1]));
         }
      }
   }

   static final void a(int var0, Object[] var1) {
      ++f;
      if(null == var1[1]) {
         var1[1] = new int[1];
      }

      int var2 = 91 % ((-33 - var0) / 47);
   }

   static final Object[] a(int var0, int var1, int var2) {
      Object[] var3 = ju.g[var0][var1][var2];
      if(var3 != null) {
         poa.a((Object[])((Object[])var3[8]));
         if(var3[8] != null) {
            Object[] var4 = (Object[])((Object[])var3[8]);
            var3[8] = null;
            return var4;
         }
      }

      return null;
   }

   static final Object[] a(Object[] var0, int var1) {
      if(var1 != -16365) {
         a = (Object[])null;
      }

      ++c;
      tra.a(var0, (byte)21);
      var0[1] = mj.a(0, var0);
      kia.a(var0, 16863);
      return var0;
   }

   static final void a(int var0) {
      lf.d = var0;
      to.a = 7;
      jha.e = -2;
      ++e;
   }

   static final boolean a(boolean var0, Object[] var1) {
      ++d;
      if(!var0) {
         h = (int[])null;
      }

      return 115 == ((char[])((char[])var1[3]))[0];
   }

   static final int a(int var0, int var1, int var2, int var3) {
      var0 &= 3;
      if(var3 != 7) {
         h = (int[])null;
      }

      ++g;
      return var0 != 0?(var0 == 1?7 - var2:(var0 != 2?var2:7 + -var1)):var1;
   }

}
