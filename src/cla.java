
final class cla {

   static float[] c = new float[16384];
   static int a;
   static float[] b = new float[16384];
   static int e;
   static int d;
   static int f;


   static final void a(int var0, int var1, Object[] var2) {
      ((int[])((int[])var2[1]))[0] = var1;
      int var3 = 27 % ((69 - var0) / 52);
      ++e;
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 <= -98) {
         if(var0[63] == null) {
            var0[63] = new boolean[29];
         }

         if(var0[1] == null) {
            var0[1] = new int[42];
         }

         if(null == var0[50]) {
            var0[50] = new long[2];
         }

         ++d;
      }
   }

   static final void b(int var0, int var1, Object[] var2) {
      if(var0 != 63) {
         c = (float[])null;
      }

      ++a;
      if(null != var2[18] && !ela.a((Object[])((Object[])var2[18]), var0 ^ 60)) {
         iha.a(var1, (byte)-121, (Object[])((Object[])var2[18]));
      }

   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; 16384 > var2; ++var2) {
         c[var2] = (float)Math.sin(var0 * (double)var2);
         b[var2] = (float)Math.cos(var0 * (double)var2);
      }

      f = 2;
   }
}
