import jaggl.OpenGL;
import java.util.zip.CRC32;

final class pna {

   static int d;
   static int c;
   static int e;
   static Object[] a = ho.a(3, 78, new Object[1], true);
   static Object[] b = ed.a(9, new Object[1], (byte)-118, 77);
   private Object[] f_i;
   static int h;
   static int g;
   static CRC32 j = new CRC32();
   static Object[] f = sd.a(new Object[1], 1, (byte)113);


   static final wha a(int var0, Object[] var1) {
      if(var0 != -2315) {
         a(((byte[])((byte[])a[2]))[2], (Object[])null);
      }

      ++e;
      return new wha(var1);
   }

   private final void a(byte var1) throws Throwable {
      if(var1 != -112) {
         this.f_i = (Object[])((Object[])a[0]);
      }

      ++c;
      super.finalize();
   }

   static final boolean a(byte var0, Object[] var1) {
      ++d;
      Object[] var2 = (Object[])((Object[])var1[1]);
      if(var0 != 108) {
         a(((byte[])((byte[])a[2]))[5], (Object[])null);
      }

      ej.a(3, var2);
      return true;
   }

   pna(Object[] var1) {
      this.f_i = var1;
   }

   protected final void finalize() throws Throwable {
      ++g;
      Object[] var1 = this.f_i;
      gla.a(false, var1);
      ((pna)var1[0]).a((byte)-112);
   }

   static final void a(Object[] var0, Object[] var1, int var2, byte var3, Object[] var4) {
      ++h;
      OpenGL.glPushAttrib(2048);
      OpenGL.glMatrixMode(5889);
      OpenGL.glPushMatrix();
      OpenGL.glLoadIdentity();
      OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
      int var15;
      int var17;
      int var16;
      if(var0[7] == null) {
         moa.a((byte)110, var1, (Object[])((Object[])var0[1]));
         Object[] var11;
         Object[] var12;
         ((ta)(null != (var11 = (Object[])((Object[])var0[1]))?var11[55]:null)).a((hsa)((var12 = (Object[])((Object[])var0[3])) != null?var12[3]:null), 59);
         Class_ds.a(false, 0, (Object[])((Object[])var0[3]));
         OpenGL.glViewport(0, 0, 256, 256);
         var15 = ((int[])((int[])((Object[])((Object[])var0[11]))[1]))[0];
         OpenGL.glUseProgram(var15);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var15, "sceneTex"), 0);
         if(null != var1 && (-2 == ~var1.length || -10 == ~var1.length)) {
            lj.b = 0.2225627F;
         }

         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var15, "params"), oda.f, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f((float)((int[])((int[])var0[4]))[1], 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f((float)((int[])((int[])var0[4]))[1], (float)((int[])((int[])var0[4]))[0]);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, (float)((int[])((int[])var0[4]))[0]);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      } else {
         Object[] var5;
         Object[] var6;
         ((ta)((var5 = (Object[])((Object[])var0[1])) == null?null:var5[55])).a((hsa)(null != (var6 = (Object[])((Object[])var0[8]))?var6[3]:null), 59);
         var15 = uma.a(-32125, ((int[])((int[])var0[4]))[1]);
         var16 = uma.a(-32125, ((int[])((int[])var0[4]))[0]);

         for(var17 = 0; 256 < var15 || var16 > 256; ++var17) {
            OpenGL.glViewport(0, 0, var15, var16);
            nn.a(false, 0, (Object[])((Object[])var0[8]), rs.a(0, 11024, ((Object[][])((Object[][])var0[7]))[var17]));
            if(256 < var15) {
               var15 >>= 1;
            }

            if(var17 == 0) {
               moa.a((byte)116, var1, (Object[])((Object[])var0[1]));
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f((float)((int[])((int[])var0[4]))[1], 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f((float)((int[])((int[])var0[4]))[1], (float)((int[])((int[])var0[4]))[0]);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, (float)((int[])((int[])var0[4]))[0]);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
            } else {
               moa.a((byte)113, ((Object[][])((Object[][])var0[7]))[-1 + var17], (Object[])((Object[])var0[1]));
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f(1.0F, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f(1.0F, 1.0F);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, 1.0F);
               OpenGL.glVertex2i(0, 1);
               if(null != var0 && 3 == var0.length) {
                  oda.f = -0.26413238F;
               }

               OpenGL.glEnd();
            }

            if(256 < var16) {
               var16 >>= 1;
            }
         }

         Object[] var7;
         Object[] var8;
         ((ta)(null != (var7 = (Object[])((Object[])var0[1]))?var7[55]:null)).a(true, (hsa)((var8 = (Object[])((Object[])var0[8])) == null?null:var8[3]));
         moa.a((byte)126, ((Object[][])((Object[][])var0[7]))[-1 + var17], (Object[])((Object[])var0[1]));
         Object[] var9;
         Object[] var10;
         ((ta)(null == (var9 = (Object[])((Object[])var0[1]))?null:var9[55])).a((hsa)((var10 = (Object[])((Object[])var0[3])) != null?var10[3]:null), 59);
         Class_ds.a(false, 0, (Object[])((Object[])var0[3]));
         OpenGL.glViewport(0, 0, 256, 256);
         int var18 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[0];
         OpenGL.glUseProgram(var18);
         OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var18, "sceneTex"), 0);
         OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var18, "params"), oda.f, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f(1.0F, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f(1.0F, 1.0F);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, 1.0F);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
      }

      Class_ds.a(false, 1, (Object[])((Object[])var0[3]));
      moa.a((byte)125, (Object[])((Object[])var0[9]), (Object[])((Object[])var0[1]));
      var15 = ((int[])((int[])((Object[])((Object[])var0[12]))[1]))[0];
      OpenGL.glUseProgram(var15);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var15, "baseTex"), 0);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var15, "step"), 0.00390625F, 0.0F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      Class_ds.a(false, 0, (Object[])((Object[])var0[3]));
      moa.a((byte)120, (Object[])((Object[])var0[10]), (Object[])((Object[])var0[1]));
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var15, "step"), 0.0F, 0.00390625F, 0.0F);
      OpenGL.glBegin(7);
      OpenGL.glTexCoord2f(0.0F, 0.0F);
      OpenGL.glVertex2i(0, 0);
      OpenGL.glTexCoord2f(1.0F, 0.0F);
      OpenGL.glVertex2i(1, 0);
      OpenGL.glTexCoord2f(1.0F, 1.0F);
      OpenGL.glVertex2i(1, 1);
      OpenGL.glTexCoord2f(0.0F, 1.0F);
      OpenGL.glVertex2i(0, 1);
      OpenGL.glEnd();
      OpenGL.glPopAttrib();
      OpenGL.glPopMatrix();
      OpenGL.glMatrixMode(5888);
      Object[] var13;
      Object[] var14;
      ((ta)((var13 = (Object[])((Object[])var0[1])) != null?var13[55]:null)).a(true, (hsa)(null == (var14 = (Object[])((Object[])var0[3]))?null:var14[3]));
      var16 = ((int[])((int[])((Object[])((Object[])var0[6]))[1]))[0];
      OpenGL.glUseProgram(var16);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var16, "sceneTex"), 0);
      OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var16, "bloomTex"), 1);
      OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var16, "params"), lj.b, aka.e, 0.0F);
      nha.a((Object[])((Object[])var0[1]), 18806, 1);
      moa.a((byte)98, (Object[])((Object[])var0[9]), (Object[])((Object[])var0[1]));
      if(null != var4 && var4.length == 5) {
         oda.f = -1.4477298F;
      }

      var17 = 49 % ((var3 - 14) / 44);
      nha.a((Object[])((Object[])var0[1]), 18806, 0);
      moa.a((byte)112, var1, (Object[])((Object[])var0[1]));
   }

}
