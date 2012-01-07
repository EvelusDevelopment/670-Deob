
final class wb {

   static int d;
   static int a;
   static Object[] c = je.a(1, new Object[1], 2, (byte)-118);
   static int f = 0;
   static int b;
   static Object[] e;


   static final void a(boolean var0, Object[] var1) {
      ++a;
      synchronized(var1[0]) {
         if(!var0) {
            a(false, (Object[])((Object[])var1[3]));
         }

         dq.a(19, (Object[])((Object[])var1[0]));
      }
   }

   static final void putLong(Object[] var1, long value) {
      byte[] var10000 = (byte[])((byte[])var1[2]);
      int[] var10001 = (int[])((int[])var1[1]);
      int var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)((int)(value >> 56));
      ++d;
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)((int)(value >> 48));
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)((int)(value >> 40));
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)((int)(value >> 32));
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)((int)(value >> 24));
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)((int)(value >> 16));
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)((int)(value >> 8));
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)((int)value);
   }

   static final void a(boolean var0, int var1, int var2, byte var3, int var4, int var5, int var6) {
      ++b;
      if(!var0 && (512 > var6 || var1 < 512 || 512 * (-2 + rp.c) < var6 || var1 > (wpa.a + -2) * 512)) {
         og.a[1] = -1.0F;
         float[] var8 = og.a;
         var8[0] = -1.0F;
      } else {
         int var7 = -var4 + Class_ds.a(var5, var6, var1, (byte)122);
         lg.a(aha.e, lna.g.c(), -18072);
         cq.a((byte)81, (float)var2, 0.0F, 0.0F, aha.e);
         lna.g.d(aha.e);
         if(var0) {
            lna.g.b((float)var6, (float)var7, (float)var1, og.a);
         } else {
            lna.g.a((float)var6, (float)var7, (float)var1, og.a);
         }

         cq.a((byte)81, (float)(-var2), 0.0F, 0.0F, aha.e);
         if(var3 != -39) {
            c = (Object[])((Object[])((Object[])((Object[])c[5]))[1]);
         }

         lna.g.d(aha.e);
         og.a[1] -= (float)pka.b;
         og.a[0] -= (float)np.h;
      }
   }

}
