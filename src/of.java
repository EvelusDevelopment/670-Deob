
final class of {

   static int c;
   static int d;
   static Object[] a;
   static int b;


   static final void a(int var0, int var1, Object[] var2, Object[] var3) {
      if(0 != (4 & ((int[])((int[])((Object[])((Object[])var2[3]))[9]))[((int[])((int[])var3[var1]))[3]]) && ((int[])((int[])var3[1]))[13] < 0) {
         int var4 = ((int[])((int[])((Object[])((Object[])var2[3]))[23]))[((int[])((int[])var3[1]))[3]] / mc.a;
         int var5 = (-((int[])((int[])var3[1]))[1] + 1048575 + var4) / var4;
         ((int[])((int[])var3[1]))[1] = 1048575 & ((int[])((int[])var3[1]))[1] + var0 * var4;
         if(var5 <= var0) {
            label27: {
               if(0 != ((int[])((int[])((Object[])((Object[])var2[3]))[20]))[((int[])((int[])var3[1]))[3]]) {
                  var3[0] = on.a((hb)var3[3], ((on)var3[0]).f(), 0, ((on)var3[0]).l());
                  vv.a(var3, var1 ^ 26, ((short[])((short[])((Object[])((Object[])var3[5]))[3]))[((int[])((int[])var3[1]))[16]] < 0, (Object[])((Object[])var2[3]));
                  if(client.f_vb == 0) {
                     break label27;
                  }
               }

               var3[0] = on.a((hb)var3[3], ((on)var3[0]).f(), ((on)var3[0]).g(), ((on)var3[0]).l());
            }

            if(((short[])((short[])((Object[])((Object[])var3[5]))[3]))[((int[])((int[])var3[1]))[16]] < 0) {
               ((on)var3[0]).e(-1);
            }

            var0 = ((int[])((int[])var3[1]))[1] / var4;
         }
      }

      ++d;
      ((on)var3[0]).a(var0);
   }

   static final Object[] a(int var0, Object[] var1) {
      ++c;
      if(var0 < 55) {
         a = (Object[])((Object[])((Object[])((Object[])var1[8]))[1]);
      }

      return var1;
   }

}
