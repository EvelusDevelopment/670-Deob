
final class tda extends lm {

   static Object[] n = ed.a(8, new Object[1], (byte)-124, 34);
   static int[] o = new int[1];
   static int m;
   static int[] k = new int[16384];
   Object[] f_l;
   static int[] p = new int[16384];
   static int j;


   static final void b(boolean var0) {
      ++m;
      si.a(-108);
      if(var0) {
         b(false);
      }

   }

   tda(Object[] var1) {
      this.f_l = var1;
   }

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         p[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
         k[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
      }

      j = 0;
   }
}
