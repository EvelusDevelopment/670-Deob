import jaggl.OpenGL;

final class bda {

   static int c;
   static int e;
   static int b;
   static int f;
   static Object[] a = ho.a(9, 25, new Object[1], true);
   static Object[] d;


   static final Object[] a(int var0, int var1, int var2, Object[] var3, int[] var4, boolean var5) {
      if(var1 < 32) {
         return (Object[])null;
      } else {
         ++b;
         return fg.a(var4, var3, 121, var5, var0, var2, 0, 0);
      }
   }

   static final void a(int var0, int var1) {
      ++f;
      Object[] var2 = la.a(0, (long)var0, 20);
      if(var1 <= -116) {
         aia.a(var2, 1);
      }
   }

   static final int a(Object[] var0, boolean var1, int var2) {
      ++c;
      if(!var1) {
         d = (Object[])null;
      }

      return 2 == var2?2:1;
   }

   static final void a(boolean var0, Object[] var1) {
      oga.q[3] = 1.0F;
      ++e;
      oga.q[0] = ((float[])((float[])var1[25]))[7] * ((float[])((float[])var1[25]))[18];
      oga.q[1] = ((float[])((float[])var1[25]))[17] * ((float[])((float[])var1[25]))[18];
      oga.q[2] = ((float[])((float[])var1[25]))[15] * ((float[])((float[])var1[25]))[18];
      OpenGL.glLightfv(16384, 4609, oga.q, 0);
      oga.q[0] = ((float[])((float[])var1[25]))[7] * -((float[])((float[])var1[25]))[16];
      oga.q[1] = ((float[])((float[])var1[25]))[17] * -((float[])((float[])var1[25]))[16];
      if(var1 != null && -5 == ~var1.length && var1[3].equals(Integer.valueOf(1)) && var1[3].equals(Integer.valueOf(0))) {
         dma.f = null;
      }

      oga.q[2] = ((float[])((float[])var1[25]))[15] * -((float[])((float[])var1[25]))[16];
      oga.q[3] = 1.0F;
      OpenGL.glLightfv(16385, 4609, oga.q, 0);
      if(!var0) {
         a(-31, 37);
      }

   }

}
