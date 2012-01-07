import jagdx.IDirect3DDevice;

final class Class_g {

   static int b;
   static int a;


   static final Object[] a(Object[] var0, Object[] var1, byte var2) {
      if(var2 < 117) {
         return (Object[])null;
      } else {
         var0[12] = var1;
         ++b;
         if(null == var0[1]) {
            var0[1] = new int[1];
         }

         ln.a(-28834, var0);
         oma.a((byte)125, var0);
         return var0;
      }
   }

   static final void a(byte var0, Object[] var1, Object[] var2) {
      ++a;
      pi.b(var1, false, var2);
      if(var0 >= -124) {
         a((byte)57, (Object[])null, (Object[])((Object[])((Object[])((Object[])var2[3]))[4]));
      }

      if(((boolean[])((boolean[])var1[80]))[((int[])((int[])var1[1]))[7]] == !((boolean[])((boolean[])var2[3]))[2]) {
         IDirect3DDevice.SetSamplerState(((long[])((long[])var1[50]))[5], ((int[])((int[])var1[1]))[7], 1, ((boolean[])((boolean[])var2[3]))[2]?1:3);
         ((boolean[])((boolean[])var1[80]))[((int[])((int[])var1[1]))[7]] = ((boolean[])((boolean[])var2[3]))[2];
      }

      if(!((boolean[])((boolean[])var1[84]))[((int[])((int[])var1[1]))[7]] == ((boolean[])((boolean[])var2[3]))[1]) {
         IDirect3DDevice.SetSamplerState(((long[])((long[])var1[50]))[5], ((int[])((int[])var1[1]))[7], 2, ((boolean[])((boolean[])var2[3]))[1]?1:3);
         ((boolean[])((boolean[])var1[84]))[((int[])((int[])var1[1]))[7]] = ((boolean[])((boolean[])var2[3]))[1];
      }

   }

}
