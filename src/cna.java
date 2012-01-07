import jaggl.OpenGL;

final class cna {

   static int e;
   static Object[] b = ed.a(-1, new Object[1], (byte)-105, 62);
   static int d;
   static cga f;
   static int h;
   static int c;
   static String[] a;
   static int g;


   static final void a(Object[] var0, Object[] var1, byte var2) {
      ++c;
      OpenGL.glLoadMatrixf((float[])((float[])var0[0]), 0);
      if(var2 >= -28) {
         ((int[])((int[])var0[16]))[4] = 37;
      }

   }

   static final void a(int var0, byte var1) {
      ++h;
      if(var1 >= -107) {
         a((int)-20, (Object[])null);
      }

      Object[] var2 = la.a(0, (long)var0, 4);
      aia.a(var2, 1);
   }

   static final void a(byte var0, Object[] var1) {
      ++d;
      if(null != var1 && var1.length == 87) {
         eqa.a((byte)-42, var1);
      } else if(var0 == 48) {
         if(null != var1 && var1.length == 91) {
            md.a(var0 - 49, var1);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final boolean a(int var0, Object[] var1) {
      if(var0 != -19031) {
         return ((boolean[])((boolean[])b[11]))[3];
      } else {
         ++e;
         return var1[7] == ((Object[])((Object[])var1[6]))[79];
      }
   }

   static final void a(int var0, byte var1, Object[] var2, Object[] var3) {
      ++g;
      if(var1 <= 29) {
         a(-81, (byte)-125);
      }

      if(0 != var0) {
         if(5 == var0) {
            ((int[])((int[])var3[1]))[1] = fh.a(var2, false);
         } else if(var0 == 6) {
            ((int[])((int[])var3[1]))[3] = fh.a(var2, false);
         } else if(3 == var0) {
            ((int[])((int[])var3[1]))[6] = fh.a(var2, false);
         } else if(var0 == 1) {
            ((int[])((int[])var3[1]))[2] = fh.a(var2, false);
         } else if(var0 == 4) {
            ((int[])((int[])var3[1]))[5] = fh.a(var2, false);
         } else if(var0 == 2) {
            ((int[])((int[])var3[1]))[4] = de.a((int)0, var2);
         }
      } else {
         ((int[])((int[])var3[1]))[1] = ((int[])((int[])var3[1]))[3] = fh.a(var2, false);
      }

   }

}
