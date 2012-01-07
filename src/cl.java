import java.util.Random;

final class cl {

   static int e;
   static int f = 0;
   static int b;
   static int a;
   static int d;
   static byte[] c = null;


   static final void a(int var0, Object[] var1, byte var2) {
      ((int[])((int[])var1[1]))[0] = var0;
      if(var2 <= 45) {
         a(-5, (Object[])null, (byte)68);
      }

      ++d;
   }

   static final int a(int var0, Random var1, int var2) {
      ++a;
      if(0 >= var2) {
         throw new IllegalArgumentException();
      } else if(ol.a((byte)35, var2)) {
         return (int)((long)var2 * (4294967295L & (long)var1.nextInt()) >> 32);
      } else {
         int var3 = Integer.MIN_VALUE - (int)(4294967296L % (long)var2);

         int var4;
         do {
            var4 = var1.nextInt();
         } while(var4 >= var3);

         if(var0 < 20) {
            a(8, (Object[])null, (byte)-91);
         }

         int var6 = var2 - 1 & var4 >> 31;
         int var5 = ((var4 >>> 31) + var4) % var2 + var6;
         return var5;
      }
   }

   static final Object[] a(int var0, Object[] var1) {
      if(var0 != 0) {
         a(-90, (Object[])((Object[])var1[0]), (byte)-19);
      }

      ++b;
      return var1;
   }

}
