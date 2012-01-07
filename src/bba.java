import jaggl.OpenGL;

final class bba extends IllegalArgumentException {

   static int b;
   static Object[] a = sd.a(new Object[1], 38, (byte)126);
   static String d = null;
   static int c;


   static final void a(Object[] var0, int var1) {
      while(true) {
         tha var2 = ((tha)var0[0]).s;
         if(var0[0] == var2) {
            ++c;
            if(null != var0 && var0.length == 3 && var0[2].equals(Boolean.valueOf(false)) && var0[2].equals(Integer.valueOf(1))) {
               return;
            }

            var0[1] = null;
            if(var1 != -19425) {
               a(((int[])((int[])a[2]))[0], (Object[])null, (Object[])((Object[])var0[12]), (Object[])null, -1.6383586F);
            }

            return;
         }

         var2.a(8192);
      }
   }

   static final boolean a(int var0, Object[] var1, Object[] var2, Object[] var3, float var4) {
      ++b;
      if(fi.a(var3, var0 ^ 0)) {
         Object[] var10 = (Object[])((Object[])((Object[])((Object[])var3[0]))[30]);
         Object[] var11 = ib.a(vk.f, ah.f, new Object[5], ((int[])((int[])var2[1]))[var0], (Object[])((Object[])var3[0]), var0 - 2, ((int[])((int[])var2[1]))[4]);
         Object[] var5;
         ((ta)((var5 = (Object[])((Object[])var3[0])) != null?var5[55]:null)).a((hsa)(null != var10?var10[3]:null), var0 ^ 56);
         boolean var12 = false;
         nn.a(false, 0, var10, (re)(null == var11?null:var11[4]));
         if(nd.a(var10, var0 - 100)) {
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, ((int[])((int[])var2[1]))[3], ((int[])((int[])var2[1]))[4]);
            OpenGL.glUseProgram(((int[])((int[])((Object[])((Object[])var3[1]))[1]))[0]);
            OpenGL.glUniform1i(OpenGL.glGetUniformLocation(((int[])((int[])((Object[])((Object[])var3[1]))[1]))[0], "heightMap"), 0);
            OpenGL.glUniform1f(OpenGL.glGetUniformLocation(((int[])((int[])((Object[])((Object[])var3[1]))[1]))[0], "rcpRelief"), 1.0F / var4);
            OpenGL.glUniform2f(OpenGL.glGetUniformLocation(((int[])((int[])((Object[])((Object[])var3[1]))[1]))[0], "sampleSize"), 1.0F / (float)((int[])((int[])var1[1]))[3], 1.0F / (float)((int[])((int[])var1[1]))[4]);

            for(int var13 = 0; var13 < ((int[])((int[])var2[1]))[5]; ++var13) {
               float var14 = (float)var13 / (float)((int[])((int[])var2[1]))[5];
               moa.a((byte)107, var1, (Object[])((Object[])var3[0]));
               OpenGL.glBegin(7);
               if(var3 != null && var3.length == 5 && var3[3].equals(Integer.valueOf(1))) {
                  fi.a((Object[])null, 3);
               }

               OpenGL.glTexCoord3f(0.0F, 0.0F, var14);
               OpenGL.glVertex2f(0.0F, 0.0F);
               OpenGL.glTexCoord3f(1.0F, 0.0F, var14);
               OpenGL.glVertex2f(1.0F, 0.0F);
               OpenGL.glTexCoord3f(1.0F, 1.0F, var14);
               OpenGL.glVertex2f(1.0F, 1.0F);
               OpenGL.glTexCoord3f(0.0F, 1.0F, var14);
               OpenGL.glVertex2f(0.0F, 1.0F);
               OpenGL.glEnd();
               int var15 = ((int[])((int[])var2[1]))[3];
               int var16 = ((int[])((int[])var2[1]))[4];
               moa.a((byte)126, var2, (Object[])((Object[])var2[4]));
               OpenGL.glCopyTexSubImage3D(((int[])((int[])var2[1]))[2], 0, 0, 0, var13, 0, 0, var15, var16);
               OpenGL.glFlush();
            }

            OpenGL.glUseProgram(0);
            if(null != var1 && 4 == var1.length && var1[2].equals(Integer.valueOf(0)) && var1[2].equals(Integer.valueOf(2))) {
               fi.a((Object[])null, 3);
            }

            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            OpenGL.glPopMatrix();
            var12 = true;
         }

         nn.a(false, 0, var10, (re)null);
         Object[] var8;
         ((ta)(null != (var8 = (Object[])((Object[])var3[0]))?var8[55]:null)).a(true, (hsa)(null == var10?null:var10[3]));
         return var12;
      } else {
         return false;
      }
   }

   bba(Object[] var1, String var2) {
      super("");
   }

}
