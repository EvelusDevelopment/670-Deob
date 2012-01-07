import jaggl.OpenGL;

final class df {

   static int d;
   static Object[] e = sl.a("26", 0, new Object[1], "26");
   static int h;
   static int c;
   static int b;
   static int a = 1401;
   static Object[] f = ed.a(6, new Object[1], (byte)-101, 65);
   static boolean g;


   static final void a(int var0, Object[] var1) {
      if(var0 == 23060) {
         ++d;
         ah.a((Object[])((Object[])var1[5]), var1, (byte)102);
         if(hw.e == var1[2]) {
            OpenGL.glTexParameteri(((int[])((int[])var1[1]))[2], 10241, ((boolean[])((boolean[])var1[4]))[0]?9987:9729);
            OpenGL.glTexParameteri(((int[])((int[])var1[1]))[2], 10240, 9729);
         } else {
            OpenGL.glTexParameteri(((int[])((int[])var1[1]))[2], 10241, !((boolean[])((boolean[])var1[4]))[0]?9728:9984);
            OpenGL.glTexParameteri(((int[])((int[])var1[1]))[2], 10240, 9728);
         }

      }
   }

   static final void a(Object[] var0, byte var1, boolean var2) {
      if(var1 == -84) {
         ++c;
         ((boolean[])((boolean[])var0[4]))[0] = var2;
         ni.a(true, var0);
      }
   }

   static final Object[] a(byte var0, Object[] var1) {
      ++h;
      fe.c(1, var1);
      tfa.a(118, var1);
      if(var0 < 38) {
         a(true, (Object[])((Object[])((Object[])((Object[])f[3]))[3]));
      }

      return var1;
   }

   static final void a(boolean var0, Object[] var1) {
      ++b;
      if(var0) {
         f = (Object[])((Object[])e[6]);
      }

      synchronized(var1[0]) {
         dq.a(56, (Object[])((Object[])var1[0]));
      }
   }

}
