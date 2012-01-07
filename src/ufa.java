import jaggl.OpenGL;

final class ufa extends Exception {

   static Object[] d = st.a(new Object[1], 7, 255, 25);
   static int e;
   static int a;
   static int f;
   static Object[] c = sl.a("31", 0, new Object[1], "31");
   static int b = 0;


   static final void a(int var0, int var1, Object[] var2, int var3) {
      ++e;
      if(var3 >= -99) {
         a();
      }

   }

   ufa(int var1, int var2) {
      super("");
   }

   static final void a() {
      gu.b = gu.h;
   }

   static final void a(byte var0, Object[] var1) {
      ++f;
      if(null != var1 && -88 == ~var1.length) {
         gha.a(var1, true);
      } else if(var1 != null && var1.length == 91) {
         OpenGL.glMatrixMode(5890);
         if(((Object[][])((Object[][])var1[64]))[((int[])((int[])var1[1]))[7]] == eb.m) {
            OpenGL.glLoadIdentity();
         } else {
            Object[] var3 = ((Object[][])((Object[][])var1[59]))[((int[])((int[])var1[1]))[7]];
            float[] var4 = (float[])((float[])var1[84]);
            System.arraycopy(var3[0], 0, var4, 0, 16);
            OpenGL.glLoadMatrixf(var4, 0);
         }

         OpenGL.glMatrixMode(5888);
      } else {
         if(var0 != 75) {
            a((byte)-99, new Object[7]);
         }

         throw new IllegalStateException();
      }
   }

   static final int a(Object[] var0, int var1) {
      ++a;
      if(var1 != 5890) {
         b = 77;
      }

      synchronized(var0) {
         return 0;
      }
   }

}
