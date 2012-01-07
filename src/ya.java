
abstract class ya extends tha {

   static int u;
   static short v;
   static Object[] x = ed.a(-2, new Object[1], (byte)-105, 98);
   static int w;
   static int t;


   static final Object[] a(boolean var0, Object[] var1) {
      if(!var0) {
         a((Object[])null, (Object[])null, (Object[])((Object[])((Object[])((Object[])var1[0]))[5]), (Object[])null, 46);
      }

      ++u;
      gh.a((byte)20, var1);
      System.nanoTime();
      return var1;
   }

   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, Object[] var3, int var4) {
      jba.a(var2, var4 ^ var4, var0, var1);
      ++w;
      var2[11] = var0;
      var2[10] = var3;
      return var2;
   }

   static final int a(int var0, Object[] var1) {
      int var2 = -94 % ((var0 + 51) / 53);
      ++t;
      if(var1 != null && 4 == var1.length) {
         int var3;
         if(Class_b.a((String)var1[1], (byte)-61, (Object[])((Object[])var1[0]))) {
            var3 = 100;
            if(client.f_vb == 0) {
               return var3;
            }
         }

         var3 = eca.a((Object[])((Object[])var1[0]), (String)var1[1], 0);
         return var3;
      } else if(null != var1 && -2 == ~var1.length) {
         return qga.b(false, var1);
      } else if(var1 != null && 2 == var1.length) {
         return hca.a((byte)28, var1);
      } else if(null != var1 && var1.length == 3) {
         return ph.a(-1, var1);
      } else {
         throw new IllegalStateException();
      }
   }

}
