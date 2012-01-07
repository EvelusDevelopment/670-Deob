
final class ooa {

   static int a;
   static int d;
   static Object[] c = vra.a(536870911, 22, "", new Object[1]);
   static int f;
   static int b;
   static int e;


   static final int a(int var0, int var1, int var2) {
      ++a;

      int var3;
      for(var3 = var2; 1 < var0; var0 >>= 1) {
         if(0 != (var0 & 1)) {
            var3 *= var1;
         }

         var1 *= var1;
      }

      if(1 == var0) {
         return var3 * var1;
      } else {
         return var3;
      }
   }

   static final void b(int var0, int var1, int var2) {
      boolean var3 = ju.g[0][var1][var2] != null && ju.g[0][var1][var2][9] != null;

      for(int var4 = var0; var4 >= 0; --var4) {
         if(ju.g[var4][var1][var2] == null) {
            Object[] var5 = ju.g[var4][var1][var2] = jg.a(120, var4, new Object[10]);
            if(var3) {
               ++((byte[])((byte[])var5[5]))[0];
            }
         }
      }

   }

   static final void b(Object[] var0, int var1) {
      ++e;
      synchronized(var0[0]) {
         dq.a(24, (Object[])((Object[])var0[0]));
      }

      if(var1 != 1) {
         a(114, ((int[])((int[])c[1]))[44], -80);
      }

   }

   static final void a(int var0) {
      int var1 = -4 / ((var0 - 44) / 57);
      ++b;
      if(cj.k != null) {
         cj.k = null;
         ha.a(bma.k, csa.f, sba.e, dga.n, true);
      }
   }

   static final void a(Object[] var0, int var1) {
      if(var1 != 3) {
         a(((int[])((int[])((Object[])((Object[])((Object[])((Object[])var0[0]))[5]))[2]))[3], ((int[])((int[])var0[0]))[2], 125);
      }

      ++f;
      kaa.f = var0;
   }

   static final void a(Object[] var0, byte var1) {
      ++d;
      ((int[])((int[])var0[1]))[2] = 0;
      ((int[])((int[])var0[1]))[3] = 1;
      ((int[])((int[])var0[1]))[1] = 0;
      if(var1 >= -43) {
         a((Object[])((Object[])var0[2]), ((byte[])((byte[])((Object[])((Object[])((Object[])((Object[])c[7]))[3]))[11]))[5]);
      }

   }

}
