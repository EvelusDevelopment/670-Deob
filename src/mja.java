
final class mja {

   static byte[][] j;
   static int f;
   static int f_i;
   static int b;
   static int d;
   private Object[] a;
   static int c = 7002;
   static int h = c;
   static int e;
   static int g;


   static final int a(Object[] var0, int var1) {
      ++d;
      ((int[])((int[])var0[1]))[0] += 3;
      if(var1 != -15308) {
         return 69;
      } else {
         int var2 = (((byte[])((byte[])var0[2]))[-3 + ((int[])((int[])var0[1]))[0]] << 16 & 16711680) - (-((((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[0] - 2] & 255) << 8) + -(((byte[])((byte[])var0[2]))[-1 + ((int[])((int[])var0[1]))[0]] & 255));
         if(var2 > 8388607) {
            var2 -= 16777216;
         }

         return var2;
      }
   }

   mja(Object[] var1) {
      this.a = var1;
   }

   static final int a(byte var0, Object[] var1, int var2) {
      ++g;
      return var0 > -125?-34:((int[])((int[])var1[2]))[var2];
   }

   static final Object[] a(Object[] var0, boolean var1) {
      ++f_i;
      return var1?(Object[])null:var0;
   }

   protected final void finalize() throws Throwable {
      ++f;
      Object[] var1 = this.a;
      Object[] var2 = (Object[])((Object[])var1[0]);
      long var3 = (long)((int[])((int[])var1[1]))[0];
      synchronized(var2) {
         lm var6 = new lm();
         var6.e = var3;
         client.a(120, (Object[])((Object[])var2[50]), var6);
      }

      ((mja)var1[2]).a(0);
   }

   private final void a(int var1) throws Throwable {
      super.finalize();
      if(var1 != 0) {
         a((byte)68, (Object[])((Object[])this.a[3]), -52);
      }

      ++b;
   }

}
