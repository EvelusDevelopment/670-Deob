
final class jh {

   static int e;
   static int[] c;
   static int b;
   static int a;
   static int d;


   static final void a(int var0, byte var1, Object[] var2, byte[] var3) {
      ((byte[])((byte[])var2[2]))[((int[])((int[])var2[1]))[1]] = (byte)(((byte[])((byte[])var2[2]))[((int[])((int[])var2[1]))[1]] | 128 >>> (((int[])((int[])var2[1]))[0] & 7));
      ++e;
      ++((int[])((int[])var2[1]))[1];
      int var10004;
      int[] var10001;
      byte[] var10000;
      if(((int[])((int[])var2[1]))[1] > 32) {
         while(64 > ((int[])((int[])var2[1]))[1]) {
            var10000 = (byte[])((byte[])var2[2]);
            var10001 = (int[])((int[])var2[1]);
            var10004 = ((int[])((int[])var2[1]))[1];
            var10001[1] = ((int[])((int[])var2[1]))[1] + 1;
            var10000[var10004] = 0;
         }

         fta.d(1504631792, var2);
         ((int[])((int[])var2[1]))[1] = 0;
         if(var2 != null && 45 == var2.length) {
            pc.f = null;
         }
      }

      while(((int[])((int[])var2[1]))[1] < 32) {
         var10000 = (byte[])((byte[])var2[2]);
         var10001 = (int[])((int[])var2[1]);
         var10004 = ((int[])((int[])var2[1]))[1];
         var10001[1] = ((int[])((int[])var2[1]))[1] + 1;
         var10000[var10004] = 0;
      }

      System.arraycopy(var2[4], 0, var2[2], 32, 32);
      fta.d(1504631792, var2);
      if(var1 < -46) {
         int var4 = 0;

         for(int var5 = var0; var4 < 8; var5 += 8) {
            long var6 = ((long[])((long[])var2[0]))[var4];
            var3[var5] = (byte)((int)(var6 >>> 56));
            var3[var5 + 1] = (byte)((int)(var6 >>> 48));
            var3[var5 + 2] = (byte)((int)(var6 >>> 40));
            var3[var5 + 3] = (byte)((int)(var6 >>> 32));
            var3[var5 + 4] = (byte)((int)(var6 >>> 24));
            var3[var5 + 5] = (byte)((int)(var6 >>> 16));
            var3[var5 + 6] = (byte)((int)(var6 >>> 8));
            var3[7 + var5] = (byte)((int)var6);
            ++var4;
         }

         if(var2 != null && (var2.length == 18 && var2[4].equals(Integer.valueOf(1)) && var2[4].equals(Integer.valueOf(1)) || -3 == ~var2.length && var2[0].equals(Integer.valueOf(1)))) {
            gu.a((Object[])null, -45, (byte[])null, 42L);
         }

      }
   }

   static final Object[] a(int var0, boolean var1, Object[] var2) {
      ++b;
      if(var1) {
         c = (int[])null;
      }

      byte[] var3 = fd.a(-2, var0, var2);
      return null == var3?null:eha.a(1, var3, new Object[3]);
   }

   static final void a(int var0, int var1) {
      jw.c = var0;
      ++d;
      dq.f = -1;
      int var2 = 98 / ((77 - var1) / 46);
      dq.f = -1;
      sia.a((byte)-68);
   }

   static final Object[] a(int var0, Object[][] var1, Object[] var2) {
      ++a;
      jja.a(var2, var1, false);
      if(var0 != 1) {
         a(((int[])((int[])var2[0]))[1], (byte)90, (Object[])null, (byte[])((byte[])var2[4]));
      }

      return var2;
   }

}
