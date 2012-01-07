import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

final class baa extends jqa implements Runnable {

   static int f_i;
   static int j;
   static int h;


   static final int a(Object[] var0, int var1) {
      ++f_i;
      if(var1 != 1) {
         ((int[])((int[])((Object[])((Object[])var0[7]))[10]))[4] = 47;
      }

      return ((int[])((int[])var0[1]))[2];
   }

   baa(Object[] var1) {
      super(var1);
   }

   static final boolean a(boolean var0, Object[] var1, long var2, int var4, int var5) {
      if(var0) {
         return false;
      } else {
         ++h;
         kea.a(22771, var1);
         if(-1 <= ~((int[])((int[])var1[1]))[3]) {
            ((NativeHeapBuffer)var1[2]).a.copy(((NativeHeapBuffer)var1[2]).b() - -((long)var5), var2, var4);
         } else {
            OpenGL.glBindBufferARB(((int[])((int[])var1[1]))[0], ((int[])((int[])var1[1]))[3]);
            OpenGL.glBufferSubDataARBa(((int[])((int[])var1[1]))[0], var5, var4, var2);
         }

         return true;
      }
   }

   static final void a(int var0, Object[] var1, int var2) {
      int var3 = 29 / ((26 - var2) / 62);
      OpenGL.glFramebufferTexture2DEXT('\u8d40', var0, ((int[])((int[])((Object[])((Object[])var1[0]))[1]))[2], ((int[])((int[])((Object[])((Object[])var1[0]))[1]))[0], ((int[])((int[])var1[1]))[0]);
      ++j;
   }

}
