import java.util.Random;

final class gma {

   static int c;
   static int f;
   static int a;
   static int g;
   static Object[] d;
   static int b;
   static int e;


   static final boolean a(Object[] var0, int var1) {
      ++b;
      if(var1 >= -35) {
         d = (Object[])((Object[])d[2]);
      }

      return false;
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2) {
      kpa.a(var2, -71);
      ++c;
      var2[0] = var0;
      int var3 = -40 % ((-8 - var1) / 35);
      return var2;
   }

   static final void a(int var0, Object[] var1) {
      if(var0 != 5) {
         a((Object[])null, ((int[])((int[])d[0]))[0]);
      }

      ++e;
      if(kda.d % 50 == 0) {
         ((int[])((int[])var1[1]))[7] = ((int[])((int[])var1[1]))[1];
         ((int[])((int[])var1[1]))[0] = ((int[])((int[])var1[1]))[5];
         ((int[])((int[])var1[1]))[1] = 0;
         ((int[])((int[])var1[1]))[5] = 0;
      }

   }

   static final byte[] a(int var0, int var1) {
      ++a;
      bh var2;
      Object[] var4 = null == (var2 = (bh)uh.a(uh.g, (long)var0, (byte)87))?null:var2.y;
      if(null == var4) {
         byte[] var5 = new byte[512];
         Random var6 = new Random((long)var0);

         int var7;
         for(var7 = 0; var7 < 255; ++var7) {
            var5[var7] = (byte)var7;
         }

         for(var7 = 0; var7 < 255; ++var7) {
            int var8 = 255 + -var7;
            int var9 = cl.a(63, var6, var8);
            byte var10 = var5[var9];
            var5[var9] = var5[var8];
            var5[var8] = var5[511 + -var7] = var10;
         }

         var4 = qk.a(new Object[2], var5, -19091);
         hj.a(uh.g, 0, (tha)(var4 == null?null:var4[1]), (long)var0);
      }

      if(var1 <= 32) {
         a(new Object[30], ((int[])((int[])((Object[])((Object[])d[14]))[0]))[17], (Object[])null);
      }

      return (byte[])((byte[])var4[0]);
   }

   static final void a(int var0, boolean var1, Object[] var2, boolean var3, lh var4) {
      ++g;
      synchronized(var2) {
         synchronized(var2) {
            ((tf)var2[12]).f();
            var2[16] = null;
            jba.a(-5, var2, var3);
         }

         if(var0 != 31708) {
            d = (Object[])null;
         }

         ((tf)var2[12]).a(var4.k);
         ((long[])((long[])var2[18]))[0] = 0L;
         ((boolean[])((boolean[])var2[17]))[1] = var1;
         int var6 = ((tf)var2[12]).c();

         for(int var7 = 0; var6 > var7; ++var7) {
            ((tf)var2[12]).e(var7);
            ((tf)var2[12]).a(var7);
            ((tf)var2[12]).c(var7);
         }

         ((int[])((int[])var2[1]))[1] = ((tf)var2[12]).d();
         ((int[])((int[])var2[1]))[3] = ((tf)var2[12]).e[((int[])((int[])var2[1]))[1]];
         ((long[])((long[])var2[18]))[1] = ((tf)var2[12]).d(((int[])((int[])var2[1]))[3]);
         if(var2 == null || 1 != var2.length) {
            ;
         }
      }
   }

}
