import jaggl.OpenGL;

final class rsa {

   static short[][] b;
   static int d;
   static Object[] g = ed.a(6, new Object[1], (byte)-110, 97);
   static ii[] c = new ii[4];
   static int f;
   static int[][] e = new int[][]{{0, 2, 4, 6}, {6, 0, 2, 4}, {6, 0, 2}, {2, 6, 0}, {0, 2, 6}, {6, 0, 2}, {5, 6, 0, 1, 2, 4}, {7, 2, 4, 4}, {2, 4, 4, 7}, {6, 6, 4, 0, 2, 2}, {0, 2, 2, 6, 6, 4}, {0, 2, 2, 4, 6, 6}, {0, 2, 4, 6}};
   static Object[] a;


   static final void a(int var0, Object[] var1) {
      ++d;
      if(null != var1 && -9 == ~var1.length) {
         if(((Object[])((Object[])var1[6]))[79] != var1[7]) {
            if(var1[7] == null) {
               throw new vb();
            }

            OpenGL.glUseProgram(((int[])((int[])var1[1]))[3]);
            ((Object[])((Object[])var1[6]))[79] = var1[7];
         }

      } else if(null != var1 && var1.length == 9) {
         av.a(var1, 8);
      } else if(var0 == -12423) {
         throw new IllegalStateException();
      }
   }

   static final int a(Object[] var0, byte var1) {
      ++f;
      Object[] var3 = (Object[])((Object[])var0[14]);
      int var2 = ((int[])((int[])var3[1]))[0];
      if(var1 > -63) {
         c = (ii[])((ii[])g[11]);
      }

      return var2;
   }

}
