
final class hja {

   static int h;
   static int a;
   static int f_i;
   static int e;
   static Object[] b = sd.a(new Object[1], 13, (byte)121);
   static Object[] c = sd.a(new Object[1], 8, (byte)127);
   static Object[][] f;
   static Object[][] g = new Object[100][];
   static int d;


   static final void a(Object[] var0, byte var1) {
      ++e;
      int var2 = -1;
      if(var1 == 0) {
         byte[] var10000;
         for(int var3 = ((byte[])((byte[])var0[0])).length - 8; var2 < var3; var10000[var2] = 0) {
            var10000 = (byte[])((byte[])var0[0]);
            ++var2;
            var10000[var2] = 0;
            var10000 = (byte[])((byte[])var0[0]);
            ++var2;
            var10000[var2] = 0;
            var10000 = (byte[])((byte[])var0[0]);
            ++var2;
            var10000[var2] = 0;
            var10000 = (byte[])((byte[])var0[0]);
            ++var2;
            var10000[var2] = 0;
            var10000 = (byte[])((byte[])var0[0]);
            ++var2;
            var10000[var2] = 0;
            var10000 = (byte[])((byte[])var0[0]);
            ++var2;
            var10000[var2] = 0;
            var10000 = (byte[])((byte[])var0[0]);
            ++var2;
            var10000[var2] = 0;
            var10000 = (byte[])((byte[])var0[0]);
            ++var2;
         }

         while(var2 < ((byte[])((byte[])var0[0])).length - 1) {
            var10000 = (byte[])((byte[])var0[0]);
            ++var2;
            var10000[var2] = 0;
         }

      }
   }

   static final eq a(Object[] var0, boolean var1) {
      if(var1) {
         return (eq)null;
      } else {
         ++a;
         return new eq(var0);
      }
   }

   static final int a(int var0, byte[] var1, int var2, int var3) {
      ++f_i;
      int var4 = -1;
      if(var0 != -1891070232) {
         c = (Object[])null;
      }

      for(int var5 = var3; var2 > var5; ++var5) {
         var4 = var4 >>> 8 ^ bga.b[(var4 ^ var1[var5]) & 255];
      }

      var4 = ~var4;
      return var4;
   }

   static final void a(byte var0, int var1, Object[] var2) {
      byte[] var10000 = (byte[])((byte[])var2[2]);
      int[] var10001 = (int[])((int[])var2[1]);
      int var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)(-var1 + 128);
      if(var0 != 49) {
         a(-100, (byte[])((byte[])c[6]), ((int[])((int[])b[0]))[23], 42);
      }

      ++h;
   }

}
