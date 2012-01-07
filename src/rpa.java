import jaggl.OpenGL;

final class rpa {

   static int c;
   static int d;
   static Object[] b = osa.a(0, new Object[2]);
   static int a;


   static final long a(int var0, int var1, Object[] var2, int var3) {
      if(var3 <= 74) {
         return -85L;
      } else {
         OpenGL.glBindBufferARB(((int[])((int[])var2[1]))[0], ((int[])((int[])var2[1]))[3]);
         ++c;
         return OpenGL.glMapBufferARB(((int[])((int[])var2[1]))[0], '\u88b9') + (long)var0;
      }
   }

   static final String a(byte var0, Object[] var1) {
      ++d;
      if(var0 != -98) {
         a(((byte[])((byte[])var1[1]))[13], (Object[])((Object[])var1[1]));
      }

      return "[" + sb.a((Object[])((Object[])var1[2]), 0) + "|" + bl.a((byte)110, (Object[])((Object[])var1[1])) + "]";
   }

   static final Object[] a(Object[] var0, byte var1) {
      ++a;
      return var1 < 50?(Object[])((Object[])((Object[])((Object[])b[1]))[0]):(Object[])((Object[])var0[23]);
   }

}
