import jaggl.OpenGL;

final class tca {

   static int d = 0;
   static int b;
   static int c;
   static int a;


   static final Object[] a(boolean var0, Object[] var1, Object[] var2, int var3, Object[] var4, Object[] var5, int var6) {
      dga.a(var2, (int)-17490);
      ++c;
      kk var8 = new kk(var2);
      var2[4] = var8;
      var2[2] = var5;
      var2[0] = var4;
      ((int[])((int[])var2[1]))[2] = var3;
      ((int[])((int[])var2[1]))[1] = var6;
      if(null != var4 && (var4.length == 3 && var4[2].equals(Integer.valueOf(2)) && var4[2].equals(Boolean.valueOf(false)) || var4.length == 4 && var4[0].equals(Integer.valueOf(0)) || -7 == ~var4.length && var4[3].equals(Integer.valueOf(0)))) {
         return null;
      } else {
         var2[3] = var1;
         if(var0) {
            a((Object[])((Object[])var1[0]), -110, (Object[])null, ((int[])((int[])var1[1]))[4]);
         }

         int[] var9 = new int[1];
         OpenGL.glGenRenderbuffersEXT(1, var9, 0);
         ((int[])((int[])var2[1]))[0] = var9[0];
         OpenGL.glBindRenderbufferEXT('\u8d41', ((int[])((int[])var2[1]))[0]);
         OpenGL.glRenderbufferStorageEXT('\u8d41', vb.a(-91, (Object[])((Object[])var2[2]), (Object[])((Object[])var2[0])), var6, var3);
         return var2;
      }
   }

   static final void a(Object[] var0, int var1, Object[] var2, int var3) {
      ++b;
      if(var1 != -2) {
         d = -117;
      }

      if(var3 == 1) {
         ((boolean[])((boolean[])var0[3]))[2] = fh.a(var2, false) == 1;
      } else if(var3 != 0) {
         if(2 == var3) {
            ((boolean[])((boolean[])var0[3]))[0] = 1 == fh.a(var2, false);
         }
      } else {
         ((boolean[])((boolean[])var0[3]))[1] = -2 == ~fh.a(var2, false);
      }

   }

   static final Object[][] a(int var0) {
      if(var0 != 19864) {
         a(true, (Object[])null, (Object[])null, 121, (Object[])null, (Object[])null, 64);
      }

      ++a;
      return new Object[][]{uca.c, mka.g, gpa.f_i, lu.f, qt.d, em.f, tpa.c, bta.a};
   }

}
