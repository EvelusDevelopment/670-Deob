import jaggl.OpenGL;

final class pka {

   static int b = 0;
   static int c;
   static int a;
   static int d;


   static final void a(int var0, Object[] var1) {
      ++c;
      int var2 = ((int[])((int[])var1[75]))[((int[])((int[])var1[var0]))[7]];
      if(0 != var2) {
         ((int[])((int[])var1[75]))[((int[])((int[])var1[1]))[7]] = 0;
         OpenGL.glBindTexture(var2, 0);
         OpenGL.glDisable(var2);
      }

   }

   static final long a(byte var0, Object[] var1) {
      ++d;
      if(null != var1 && -6 == ~var1.length) {
         long var2 = 0L;
         return var2;
      } else {
         if(var0 != 17) {
            ((int[])((int[])var1[0]))[21] = -78;
         }

         if(var1 != null && var1.length == 2) {
            return cma.a(var1, (byte)89);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2) {
      ++a;
      cja.a(var1, true);
      if(var0 != -11503) {
         ((int[])((int[])var2[4]))[1] = ((int[])((int[])((Object[])((Object[])var1[13]))[10]))[2];
      }

      var1[3] = var2;
      ln.a(-28834, var1);
      return var1;
   }

}
