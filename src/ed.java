
final class ed {

   static int b;
   static int a;
   static boolean c = false;


   static final Object[] a(Object[] var0, Object[] var1, int var2, boolean var3, Object[] var4, int var5, Object[] var6, Object[] var7) {
      ++b;
      if(var7[8] == null) {
         var7[8] = new boolean[1];
      }

      if(null == var7[1]) {
         var7[1] = new int[3];
      }

      ppa.a(false, var7);
      var7[7] = var0;
      ((int[])((int[])var7[1]))[1] = var2;
      var7[2] = var6;
      var7[6] = var1;
      var7[9] = var4;
      ((boolean[])((boolean[])var7[8]))[0] = var3;
      if(var7[2] == null) {
         ((int[])((int[])var7[1]))[0] = 0;
      } else {
         int var8 = -1 + oh.a((Object[])((Object[])var7[2]), (byte)104);
         ((int[])((int[])var7[1]))[0] = jla.a((Object[])((Object[])var7[2]), (byte)-122, var8) + var8 * 256;
      }

      if(var7[9] != uha.g) {
         var7[0] = new String[]{null, null, gj.a(((int[])((int[])var7[1]))[1], var5 ^ 2642, gj.f_eb), null, null, null};
      } else {
         var7[0] = new String[]{null, null, gj.a(((int[])((int[])var7[1]))[1], 95, gj.f_eb), null, null, gj.a(((int[])((int[])var7[1]))[1], var5 ^ 2682, gj.f_pb)};
      }

      var7[11] = new String[]{null, null, null, null, gj.a(((int[])((int[])var7[1]))[1], var5 ^ -2575, gj.f_ub)};
      return var5 != 2617?(Object[])null:var7;
   }

   static final Object[] a(int var0, Object[] var1, byte var2, int var3) {
      aaa.a(var1, 87);
      ++a;
      ((int[])((int[])var1[0]))[0] = var0;
      if(var2 > -97) {
         a(73, new Object[1], ((byte[])((byte[])var1[1]))[0], 94);
      }

      ((int[])((int[])var1[0]))[1] = var3;
      return var1;
   }

}
