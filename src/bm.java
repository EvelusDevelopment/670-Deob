
final class bm {

   static int e;
   static int g;
   static Object[] c;
   static int d;
   static Object[] b = sj.a(64, new Object[3], (byte)-48);
   static boolean a = false;
   static String f = "";


   static final int a(int var0, int var1, int var2) {
      ++d;
      var1 = (127 & var2) * var1 >> 7;
      if(var1 < var0) {
         var1 = 2;
         if(client.f_vb == 0) {
            return var1 + (var2 & '\uff80');
         }
      }

      if(var1 > 126) {
         var1 = 126;
      }

      return var1 + (var2 & '\uff80');
   }

   static final void a(byte var0, Object[] var1) {
      ++g;
      if(var0 > -76) {
         a((Object[])((Object[])c[14]), ((int[])((int[])var1[0]))[1]);
      }

      if(null == var1[1]) {
         var1[1] = new int[2];
      }

      ((int[])((int[])var1[1]))[1] = 0;
   }

   static final void a(Object[] var0, int var1) {
      an.a((Object[])((Object[])var0[15]), (Object[])((Object[])var0[9]), true);
      ++e;
      if(var1 >= -29) {
         a = true;
      }

      tua.b((byte)88, var0);
   }

}
