
final class gu {

   static int g;
   static int e;
   static Object[] a = ed.a(-2, new Object[1], (byte)-127, 25);
   static int c;
   static int f;
   static Object[] h;
   static int d;
   static Object[] b = h = gka.a(new Object[3], false, (byte)-41);


   static final void a(int var0, Object[] var1) {
      ++c;
      if(var1[0] == null) {
         var1[0] = new int[10];
      }

      if(var0 != -7755) {
         a(((byte[])((byte[])var1[1]))[27], ((int[])((int[])var1[4]))[0], (Object[])null);
      }

   }

   static final void a(Object[] var0, int var1, byte[] var2, long var3) {
      try {
         ++d;
         int var5 = 0;
         int var6 = -((int)var3 & 7) + 8 & 7;
         int var7 = 7 & ((int[])((int[])var0[1]))[0];
         long var9 = var3;
         int var12 = -68 % ((24 - var1) / 40);
         int var11 = 31;

         for(int var13 = 0; 0 <= var11; --var11) {
            var13 += (255 & (int)var9) + (((byte[])((byte[])var0[4]))[var11] & 255);
            ((byte[])((byte[])var0[4]))[var11] = (byte)var13;
            var13 >>>= 8;
            var9 >>>= 8;
         }

         int var8;
         while(var3 > 8L) {
            var8 = 255 & var2[var5] << var6 | (var2[var5 + 1] & 255) >>> -var6 + 8;
            if(0 > var8 || var8 >= 256) {
               throw new RuntimeException();
            }

            ((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[1]] = (byte)(((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[1]] | var8 >>> var7);
            ++((int[])((int[])var0[1]))[1];
            if(var0 != null && 2 == var0.length && var0[0].equals(Integer.valueOf(0))) {
               pc.f = null;
            }

            ((int[])((int[])var0[1]))[0] += -var7 + 8;
            if(((int[])((int[])var0[1]))[0] == 512) {
               fta.d(1504631792, var0);
               ((int[])((int[])var0[1]))[1] = 0;
               ((int[])((int[])var0[1]))[0] = 0;
            }

            ((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[1]] = (byte)(var8 << -var7 + 8 & 255);
            ++var5;
            ((int[])((int[])var0[1]))[0] += var7;
            var3 -= 8L;
         }

         if(-1L <= ~var3) {
            var8 = 0;
         } else {
            var8 = var2[var5] << var6 & 255;
            ((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[1]] = (byte)(((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[1]] | var8 >>> var7);
         }

         if(~((long)var7 + var3) <= -9L) {
            ++((int[])((int[])var0[1]))[1];
            ((int[])((int[])var0[1]))[0] += 8 + -var7;
            var3 -= (long)(8 + -var7);
            if(-513 == ~((int[])((int[])var0[1]))[0]) {
               fta.d(1504631792, var0);
               ((int[])((int[])var0[1]))[1] = 0;
               ((int[])((int[])var0[1]))[0] = 0;
            }

            ((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[1]] = (byte)(255 & var8 << 8 - var7);
            ((int[])((int[])var0[1]))[0] += (int)var3;
         } else {
            ((int[])((int[])var0[1]))[0] = (int)((long)((int[])((int[])var0[1]))[0] + var3);
         }

      } catch (RuntimeException var14) {
         throw vt.a(var14, "gu.D(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ')');
      }
   }

   static final Object[] a(byte var0, int var1, Object[] var2) {
      fk.a((byte)102, var2);
      ++e;
      oj.a(var2, false, var1);
      gn.b(var2, (byte)-39);
      if(var0 <= 55) {
         a = (Object[])null;
      }

      return var2;
   }

   static final void b(int var0, Object[] var1) {
      if(var1[1] == null) {
         var1[1] = new int[1];
      }

      ++g;
      if(var0 != -2) {
         b(50, (Object[])null);
      }

   }

   static final void a(Object[] var0, int var1) {
      if(var1 != 255) {
         h = (Object[])null;
      }

      if(!((boolean[])((boolean[])var0[63]))[1]) {
         ((boolean[])((boolean[])var0[63]))[1] = true;
      }

      ++f;
   }

}
