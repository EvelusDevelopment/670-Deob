
final class gga {

   static int c;
   static int b;
   static int a;


   static final Object[] a(int var0, Object[] var1) {
      if(var0 >= -79) {
         return (Object[])null;
      } else {
         ++b;
         fk.a((byte)-76, var1);
         oj.a(var1, false, 10);
         gn.b(var1, (byte)-39);
         return var1;
      }
   }

   static final long a(Object[] var0, int var1) {
      if(var1 != -21270) {
         return 83L;
      } else {
         ++c;
         return ((long[])((long[])var0[3]))[0];
      }
   }

   static final Object[] a(int var0, Object[] var1, int var2, boolean var3, boolean var4, int var5, Object[] var6) {
      aa.a(var1, 1);
      ++a;
      lga.a((byte)120, var1);
      var1[2] = rca.a(var1, (byte)113);
      var1[0] = var6;
      ((int[])((int[])var1[1]))[4] = var0;
      ((int[])((int[])var1[1]))[3] = var5;
      if(var3) {
         Object[] var7 = kta.a(106, vk.f, !var4?hf.d:ah.f, var6, var5, var0);
         var1[3] = gj.a(var7, 0, (byte)42);
         var1[4] = var7;
      } else {
         Object[] var9 = var4?ah.f:hf.d;
         Object[] var10 = vk.f;
         Object[] var8;
         if(var6 != null && 87 == var6.length) {
            Object[] var13 = new Object[10];
            cr.a(1, var6, var0, var5, var10, 0, var13, 0, var9);
            var8 = var13;
         } else {
            if(var6 == null || var6.length != 91) {
               throw new IllegalStateException();
            }

            var8 = ja.a(1, var5, var10, var9, var0, var6);
         }

         var1[3] = null;
         var1[4] = var8;
      }

      if(null != var6 && (var6.length == 14 || var6.length == 19)) {
         rca.a((Object[])null, (byte)113);
      }

      pa.a(false, true, (Object[])((Object[])var1[4]), true);
      ((boolean[])((boolean[])var1[5]))[1] = il.c((byte)-98, (Object[])((Object[])var1[4])) != var0;
      ((boolean[])((boolean[])var1[5]))[4] = ~var5 != ~cua.a(true, (Object[])((Object[])var1[4]));
      ((boolean[])((boolean[])var1[5]))[0] = !((boolean[])((boolean[])var1[5]))[1] && Class_i.a(var2 + 110, (Object[])((Object[])var1[4]));
      ((boolean[])((boolean[])var1[5]))[3] = !((boolean[])((boolean[])var1[5]))[4] && Class_i.a((int)98, (Object[])((Object[])var1[4]));
      ul.a((Object[])((Object[])var1[0]), var2, -79);
      return var1;
   }

}
