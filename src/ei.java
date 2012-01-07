
final class ei {

   static long d;
   static int a;
   static int c;
   static int b;


   static final void a(Object[] var0, byte var1) {
      ++a;
      if(var1 != 104) {
         d = -50L;
      }

      ((int[])((int[])var0[1]))[1] = 0;
   }

   static final void a(boolean var0, int var1, int var2, Object[] var3) {
      ++c;
      if(var3[63] != null) {
         ma var5;
         Object[] var7 = null == (var5 = (ma)pm.a((long)var1, (Object[])((Object[])var3[63]), var0))?null:var5.s;
         if(null != var7) {
            ((int[])((int[])var7[1]))[0] = var2;
         } else {
            Object[] var6;
            di.a((Object[])((Object[])var3[63]), true, (lm)((var6 = ps.a((byte)109, var2, new Object[2])) == null?null:var6[0]), (long)var1);
         }

      } else {
         var3[63] = nb.a((byte)87, 16, new Object[5]);
         Object[] var4;
         di.a((Object[])((Object[])var3[63]), true, (lm)(null != (var4 = ps.a((byte)93, var2, new Object[2]))?var4[0]:null), (long)var1);
      }
   }

   static final Object[] a(int var0, Object[] var1) {
      if(var0 != -12397) {
         return (Object[])null;
      } else {
         ++b;
         return var1;
      }
   }

}
