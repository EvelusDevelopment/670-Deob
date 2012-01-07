import jaggl.OpenGL;

final class vqa extends lm {

   static int q;
   static int o;
   static Object[] j = iha.a(4, (int)0, new Object[1]);
   static int r;
   static Object[] n = gka.a(new Object[3], true, (byte)-41);
   static int p;
   static int k;
   static int m;
   static boolean f_l;


   static final Object[] a(Object[] var0, byte var1) {
      ++r;
      Object[][] var2 = (Object[][])((Object[][])var0[3]);

      for(int var3 = 0; ~var3 > ~var2.length; ++var3) {
         Object[] var4 = var2[var3];
         if(ui.f(var4, -48)) {
            return var4;
         }
      }

      if(var1 != 52) {
         j = (Object[])null;
      }

      if(null != var0 && var0.length == 14 && var0[13].equals(Integer.valueOf(2))) {
         Class_cs.a((Object[])null, 3, (Object[])null);
      }

      return null;
   }

   static final String a(byte var0, String var1) {
      int var2 = -23 / ((-30 - var0) / 44);
      ++m;
      String var3 = null;
      int var4 = var1.indexOf("--> ");
      if(var4 >= 0) {
         var3 = var1.substring(0, var4 + 4);
         var1 = var1.substring(4 + var4);
      }

      if(var1.startsWith("directlogin ")) {
         int var5 = var1.indexOf(" ", "directlogin ".length());
         if(var5 >= 0) {
            int var6 = var1.length();
            var1 = var1.substring(0, var5) + " ";

            for(int var7 = 1 + var5; var7 < var6; ++var7) {
               var1 = var1 + "*";
            }
         }
      }

      return var3 != null?var3 + var1:var1;
   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      if(var0 != 4) {
         n = (Object[])null;
      }

      Class_e.b = ((float[])((float[])var2[25]))[10];
      ++o;
      caa.a(var2, (byte)47);
      OpenGL.glDisable(16384);
      OpenGL.glDisable(16385);
      jma.a(120, false, var2);
      OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
   }

   vqa(Object[] var1) {}

   static final void a(int var0, Object[] var1) {
      if(var0 >= 44) {
         if(((boolean[])((boolean[])var1[6]))[0]) {
            nha.a((Object[])((Object[])var1[0]), 18806, 1);
            moa.a((byte)117, (Object[])null, (Object[])((Object[])var1[0]));
            nha.a((Object[])((Object[])var1[0]), 18806, 0);
            moa.a((byte)108, (Object[])null, (Object[])((Object[])var1[0]));
            OpenGL.glUseProgram(0);
            ((boolean[])((boolean[])var1[6]))[0] = false;
         }

         ++k;
      }
   }

   static final rd a(Object[] var0, int var1) {
      ++q;
      int var2 = 57 % ((5 - var1) / 51);
      return new rd(var0);
   }

   static final void a(byte var0, Object[] var1) {
      ++p;
      ((int[])((int[])var1[1]))[1] = 4096;
      ((boolean[])((boolean[])var1[3]))[1] = true;
      if(var0 != -123) {
         a(-8, (Object[])((Object[])((Object[])((Object[])var1[1]))[15]), (Object[])null);
      }

   }

}
