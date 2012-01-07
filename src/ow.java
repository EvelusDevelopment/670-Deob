import jaggl.OpenGL;

final class ow {

   static int a;
   static Object[] b = ed.a(4, new Object[1], (byte)-128, 131);
   static int c = 0;
   static int e;
   static boolean d = false;


   static final void a(Object[] var0, byte[] var1, Object[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      ++e;
      ah.a((Object[])((Object[])var0[5]), var0, (byte)114);
      OpenGL.glPixelStorei(3317, 1);
      OpenGL.glPixelStorei(3314, var7);
      OpenGL.glTexSubImage2Dub(((int[])((int[])var0[var5]))[2], 0, var8, var3, var6, var9, fv.a(var2, (int)0), 5121, var1, var4);
      OpenGL.glPixelStorei(3314, 0);
      OpenGL.glPixelStorei(3317, 4);
   }

   static final void a(int var0, int var1, byte var2) {
      ++a;
      Object[] var3 = la.a(0, (long)var1, 13);
      if(var2 == -39) {
         jqa.a((byte)99, var3);
         ((int[])((int[])var3[0]))[1] = var0;
      }
   }

}
