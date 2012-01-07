import jaggl.OpenGL;

final class nh {

   static Object[] d;
   static int e;
   static int c;
   static int a;
   static int b;


   static final void a(int var0, Object[] var1) {
      if(null == var1[1]) {
         var1[1] = new int[49];
      }

      ++c;
      if(null == var1[var0]) {
         var1[4] = new short[4];
      }

      if(var1[0] == null) {
         var1[0] = new boolean[9];
      }

   }

   static final void a(Object[] var0, int var1, Object[] var2, float var3, float var4, float var5) {
      ++b;
      int var6 = va.a(var0, (byte)-61);
      int var7 = nba.a(var0, (byte)-72);
      if(eva.b(var1 ^ -2060, var0) == pc.a) {
         if(var6 >= 0) {
            var6 *= 4;
            ((float[])((float[])var2[5]))[0 + var6] = var3;
            ((float[])((float[])var2[5]))[1 + var6] = var5;
            ((float[])((float[])var2[5]))[2 + var6] = var4;
            ((boolean[])((boolean[])var2[8]))[1] = true;
         }

         if(var7 >= 0) {
            var7 *= 4;
            ((float[])((float[])var2[7]))[var7 + 0] = var3;
            ((float[])((float[])var2[7]))[1 + var7] = var5;
            ((float[])((float[])var2[7]))[var7 + 2] = var4;
            ((boolean[])((boolean[])var2[8]))[2] = true;
         }

         if(var1 != 2159) {
            a((int)-45, (Object[])null);
         }

      } else {
         throw new bba(var0, "");
      }
   }

   static final void a(Object[] var0, int var1) {
      if(null == var0[1]) {
         var0[1] = new int[2];
      }

      if(var1 != 4) {
         d = (Object[])((Object[])var0[2]);
      }

      ++a;
      ((int[])((int[])var0[1]))[1] = 1;
   }

   static final void a(byte var0, Object[] var1) {
      OpenGL.glMatrixMode(5888);
      if(var0 <= 22) {
         d = (Object[])((Object[])((Object[])((Object[])var1[2]))[1]);
      }

      ++e;
      OpenGL.glLoadMatrixf((float[])((float[])((Object[])((Object[])var1[28]))[0]), 0);
      OpenGL.glLightfv(16384, 4611, (float[])((float[])var1[53]), 0);
      OpenGL.glLightfv(16385, 4611, (float[])((float[])var1[62]), 0);
   }

}
