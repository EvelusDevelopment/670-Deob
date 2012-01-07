import jaggl.OpenGL;

final class nd {

   static int d;
   static int a;
   static int c;
   static int b;


   static final Object[] a(Object[] var0, int var1, int var2, int var3, int var4, boolean var5, int var6, byte var7, Object[] var8) {
      ne.a(var0, 101);
      ++d;
      qka.a(var2, var8, var4, var1, var3, 2, var0, var6);
      if('\u84f5' != ((int[])((int[])var0[1]))[2]) {
         ((float[])((float[])var0[6]))[1] = 1.0F;
         ((float[])((float[])var0[6]))[0] = 1.0F;
         ((boolean[])((boolean[])var0[3]))[3] = true;
      } else {
         ((float[])((float[])var0[6]))[1] = (float)var6;
         ((boolean[])((boolean[])var0[3]))[3] = false;
         ((float[])((float[])var0[6]))[0] = (float)var3;
      }

      ((int[])((int[])var0[1]))[5] = var6;
      ((boolean[])((boolean[])var0[3]))[2] = false;
      ((int[])((int[])var0[1]))[6] = var3;
      return var7 != -36?(Object[])null:var0;
   }

   static final boolean a(Object[] var0, int var1) {
      ++b;
      if(var1 >= -29) {
         b((Object[])null, ((int[])((int[])var0[1]))[7]);
      }

      int var2 = OpenGL.glCheckFramebufferStatusEXT('\u8d40');
      return '\u8cd5' == var2;
   }

   static final int a(Object[] var0, byte var1) {
      if(var1 != -127) {
         return 12;
      } else {
         ++a;
         return or.a((byte)127, (Object[])((Object[])var0[8])) + or.a((byte)-83, (Object[])((Object[])var0[6]));
      }
   }

   static final void b(Object[] var0, int var1) {
      ++c;
      eqa.a((byte)-92, var0);
      Class_s.c(117, var0);
      if(var1 != 3) {
         ((long[])((long[])var0[1]))[8] = 116L;
      }

   }

}
