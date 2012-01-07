import jaggl.OpenGL;

final class kea {

   static int b;
   static Object[] a = ed.a(8, new Object[1], (byte)-108, 136);
   static int d;
   static boolean c = false;


   static final void a(int var0, Object[] var1) {
      ++d;
      if(-1 < ~((int[])((int[])var1[1]))[3]) {
         if(var0 == 22771) {
            if(!((boolean[])((boolean[])((Object[])((Object[])var1[3]))[63]))[24]) {
               ((int[])((int[])var1[1]))[3] = 0;
            } else {
               OpenGL.glGenBuffersARB(1, jta.g, 0);
               ((int[])((int[])var1[1]))[3] = jta.g[0];
               OpenGL.glBindBufferARB(((int[])((int[])var1[1]))[0], ((int[])((int[])var1[1]))[3]);
            }

         }
      }
   }

   static final int b(int var0, Object[] var1) {
      if(var0 <= 11) {
         return 60;
      } else {
         ++b;
         return ((int[])((int[])var1[1]))[0];
      }
   }

}
