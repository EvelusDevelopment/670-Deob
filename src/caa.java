import jaggl.OpenGL;

final class caa {

   static int b;
   static int a;
   static int d;
   static int[] c = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};


   static final void a(Object[] var0, byte var1) {
      ++a;
      int var2 = 113 / ((-64 - var1) / 59);
      if(((int[])((int[])var0[1]))[20] != 8) {
         if(((int[])((int[])var0[1]))[12] != 2) {
            ((int[])((int[])var0[1]))[12] = 2;
            vea.a((float[])((float[])((Object[])((Object[])var0[45]))[0]), var0, (byte)-103);
            OpenGL.glLoadIdentity();
            OpenGL.glMultMatrixf((float[])((float[])((Object[])((Object[])var0[46]))[0]), 0);
            if(((boolean[])((boolean[])var0[17]))[24]) {
               tba.a((Object[])((Object[])((Object[])((Object[])var0[12]))[4]), (byte)-20);
            }

            pga.a(var0, 0);
            sea.a(var0, (byte)-28);
            dca.c(var0, 20);
            kja.a(var0, 121);
            ((int[])((int[])var0[1]))[20] &= -8;
         }

         cka.a(20, var0, true);
         wma.a(-1000, var0, true);
         jma.a(119, true, var0);
         kd.a(3042, var0, 1);
         ((int[])((int[])var0[1]))[20] = 8;
      }

   }

   static final int a(int var0, Object[] var1) {
      if(var0 > -33) {
         d = -3;
      }

      ++b;
      return ((byte[])((byte[])var1[5]))[0];
   }

}
