
final class bn {

   static int c;
   static int a;
   static int[] d = new int[120];
   static Object[] b;
   static int e;
   static int f;


   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, int var3) {
      ++a;
      lna.a((byte)68, var2, var0);
      ca.a(var2, (byte)116);
      if(var3 != 17034) {
         b((Object[])null, ((int[])((int[])var2[0]))[1]);
      }

      var2[9] = var0[5];
      var2[7] = var0[4];
      var2[8] = var1;
      return var2;
   }

   static final ag a(Object[] var0, int var1) {
      ++c;
      if(var1 != 9) {
         b((Object[])null, -91);
      }

      return new ag(var0);
   }

   static final void b(Object[] var0, int var1) {
      if(var0[var1] == null) {
         var0[1] = new int[4];
      }

      ++e;
   }

   static {
      int var0 = 0;

      for(int var1 = 0; 120 > var1; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)(300.0D * Math.pow(2.0D, (double)var2 / 7.0D) + (double)var2);
         var0 += var3;
         d[var1] = var0 / 4;
      }

      f = 0;
      b = sd.a(new Object[1], 87, (byte)119);
   }
}
