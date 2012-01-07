
final class bga {

   static int a;
   static int[] b = new int[256];
   static int c;
   static int e;
   static int d;
   static int h;
   static int g;
   static int f_i;
   static Object[] f;


   static final int b(Object[] var0, int var1) {
      ((int[])((int[])var0[1]))[0] += 4;
      ++e;
      return var1 != 28556?-76:('\uff00' & ((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[0] - 4] << 8) + (((byte[])((byte[])var0[2]))[-2 + ((int[])((int[])var0[1]))[0]] << 24 & -16777216) + ((255 & ((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[0] - 1]) << 16) + (((byte[])((byte[])var0[2]))[-3 + ((int[])((int[])var0[1]))[0]] & 255);
   }

   static final boolean c(Object[] var0, int var1) {
      ++g;
      return var0 == null?false:(var1 != 6?true:jc.a(((int[])((int[])var0[0]))[6], ((int[])((int[])var0[0]))[0], ((int[])((int[])var0[0]))[5], -((int[])((int[])var0[0]))[6] + ((int[])((int[])var0[0]))[1], ((int[])((int[])var0[0]))[9] - ((int[])((int[])var0[0]))[5], -((int[])((int[])var0[0]))[0] + ((int[])((int[])var0[0]))[7], -68));
   }

   static final boolean a(boolean var0, boolean var1) {
      ++h;
      if(!var0) {
         b(new Object[1], ((int[])((int[])f[12]))[4]);
      }

      boolean var2 = lna.g.A();
      if(!var1 != !var2) {
         if(var1) {
            if(!lna.g.u()) {
               var1 = false;
            }
         } else {
            lna.g.e();
         }

         if(var1 != var2) {
            ih.a(tu.d, (Object[])((Object[])tu.d[9]), !var1?0:1, -63);
            uk.a((byte)89);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   static final long a(Object[] var0, int var1) {
      ++d;
      long var2 = 4294967295L & (long)fh.a(var0, false);
      long var4 = 4294967295L & (long)lr.a(1, var0);
      if(var1 != -790446368) {
         c((Object[])null, ((int[])((int[])var0[25]))[4]);
      }

      return (var2 << 32) + var4;
   }

   static final Object[] a(Object[] var0, Object[] var1, int var2) {
      if(null == var0[1]) {
         var0[1] = new int[1];
      }

      var0[0] = ab.a(new Object[2], (byte)74);
      var0[3] = var1;
      ++c;
      if(var2 > -75) {
         f_i = 61;
      }

      return var0;
   }

   static {
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(int var2 = 0; 8 > var2; ++var2) {
            if(-2 != ~(var0 & 1)) {
               var0 >>>= 1;
            } else {
               var0 = var0 >>> 1 ^ -306674912;
            }
         }

         b[var1] = var0;
      }

      f_i = 0;
      f = un.a((byte)83, new Object[0]);
   }
}
