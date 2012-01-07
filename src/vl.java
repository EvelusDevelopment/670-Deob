import jaggl.OpenGL;

final class vl {

   static Object[] a = sl.a("10", 0, new Object[1], "10");
   static int d;
   static int f;
   static int e;
   static Object[] c = ed.a(3, new Object[1], (byte)-120, 146);
   static boolean b = false;


   static final void a(byte var0, Object[] var1) {
      ++d;
      if(((boolean[])((boolean[])var1[17]))[16] && ((ta)var1[55]).E != null) {
         int var2 = ((int[])((int[])var1[1]))[28];
         int var3 = ((int[])((int[])var1[1]))[25];
         int var4 = ((int[])((int[])var1[1]))[10];
         int var5 = ((int[])((int[])var1[1]))[15];
         dh.a(var1, (int)58);
         if(var1 != null && -4 == ~var1.length) {
            dma.f = null;
         }

         int var6 = ((int[])((int[])var1[1]))[4];
         int var7 = ((int[])((int[])var1[1]))[39];
         int var8 = ((int[])((int[])var1[1]))[1];
         int var9 = ((int[])((int[])var1[1]))[0];
         sea.a(-21614, var1);
         OpenGL.glReadBuffer(1028);
         OpenGL.glDrawBuffer(1029);
         kr.a(var1, var0 ^ -31);
         cka.a(20, var1, false);
         pda.a(var1, var0 ^ 21373, false);
         wma.a(-1000, var1, false);
         jma.a(123, false, var1);
         moa.a((byte)99, (Object[])null, var1);
         jia.a(var1, var0 ^ -33, -2);
         za.a(1, var0 ^ 20960, var1);
         if(var0 != -33) {
            a((byte)-30, (Object[])null);
         }

         kd.a(3042, var1, 0);
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadIdentity();
         OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadIdentity();
         OpenGL.glRasterPos2i(0, 0);
         OpenGL.glCopyPixels(0, 0, ((ta)var1[55]).E.e(), ((ta)var1[55]).E.d(), 6144);
         OpenGL.glFlush();
         OpenGL.glReadBuffer(1029);
         OpenGL.glDrawBuffer(1029);
         ena.a(var5, var2, var1, var4, (byte)-128, var3);
         hca.a(-2925, var8, var1, var7, var6, var9);
      }
   }

}
