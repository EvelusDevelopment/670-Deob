import jagdx.IDirect3DDevice;

final class hk {

   static long e = 0L;
   static Object[] b = vra.a(536870911, 16, "", new Object[1]);
   static int d;
   static int a;
   static int c;


   static final void a(Object[] var0, byte var1) {
      if(var1 == -16) {
         ++c;
         if(null == var0) {
            wba.a((int)-16671, var0);
         } else {
            qea.a((byte)111, var0);
         }
      }
   }

   static final void a(byte var0, Object[] var1) {
      if(var0 < 113) {
         a((Object[])null, ((byte[])((byte[])b[1]))[2]);
      }

      wka.b(1, (Object[])((Object[])var1[2]));
      ++a;
      mk.a((Object[])((Object[])var1[1]), true);
   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      ++d;
      IDirect3DDevice.SetVertexDeclaration(((long[])((long[])var2[50]))[5], ((long[])((long[])var0[3]))[0]);
      if(var1 <= 3) {
         a((Object[])null, (byte)7);
      }

   }

}
