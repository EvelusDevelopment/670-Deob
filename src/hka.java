
final class hka extends lm {

   static int j;
   static int n;
   static int f_l;
   Object[] p;
   static int o;
   static long k;
   static int m;


   static final void b(Object[] var0, byte var1) {
      ++n;
      if(var1 == 98) {
         ((int[])((int[])var0[1]))[1] = 585;
      }
   }

   hka(Object[] var1) {
      this.p = var1;
   }

   static final boolean a(byte var0, Object[] var1) {
      ++o;
      return var0 < 54?((boolean[])((boolean[])var1[19]))[0]:((boolean[])((boolean[])var1[8]))[5];
   }

   static final void a(Object[] var0, byte var1) {
      if(var0[1] == null) {
         var0[1] = new int[2];
      }

      ++m;
      ((int[])((int[])var0[1]))[1] = 0;
      if(var1 != -36) {
         k = -22L;
      }

   }

   static final void a(int var0, int var1, Object[] var2, int var3, Object[] var4, ta var5, int var6, boolean var7) {
      ++f_l;
      if(var3 != 1) {
         b((Object[])null, (byte)-107);
      }

      throw new IllegalStateException();
   }

   static final boolean a(Object[] var0, int var1) {
      ++j;
      if(var1 <= 48) {
         a((Object[])((Object[])var0[1]), (int)-46);
      }

      if(var0[7] != null) {
         return true;
      } else if(0 <= ((int[])((int[])var0[1]))[1]) {
         aea var2 = 0 <= cea.g?aea.b(of.a, cea.g, ((int[])((int[])var0[1]))[1]):aea.b(of.a, ((int[])((int[])var0[1]))[1]);
         var2.e();
         var0[7] = var2.f();
         ((int[])((int[])var0[1]))[2] = var2.a;
         ((int[])((int[])var0[1]))[3] = var2.h;
         return true;
      } else {
         return false;
      }
   }

}
