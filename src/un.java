import jaggl.OpenGL;

final class un {

   static int d;
   static int e;
   static boolean g = false;
   static int[] b = new int[]{-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};
   static Object[] c;
   static int f;
   static int a;


   static final Object[] a(byte var0, Object[] var1) {
      if(var0 < 14) {
         b = (int[])null;
      }

      ++e;
      return var1;
   }

   static final ww a(boolean var0, Object[] var1) {
      ++f;
      return var0?(ww)var1[4]:new ww(var1);
   }

   static final void a(int var0, int var1, Object[] var2, int var3) {
      ++d;
      if(var2 != null && 2 == var2.length) {
         iea.a(var1, var0, (byte)85, var2);
      } else if(null == var2 || var2.length != 20 || !var2[3].equals(Integer.valueOf(2))) {
         int var9;
         if(null != var2 && var2.length == 10) {
            if(null != var2[4]) {
               nha.a((Object[])((Object[])var2[0]), 18806, 1);
               if(-1 == ~(var1 & 128)) {
                  if(1 != (var0 & 1)) {
                     if(((boolean[])((boolean[])((Object[])((Object[])var2[2]))[5]))[0]) {
                        moa.a((byte)95, (Object[])((Object[])((Object[])((Object[])var2[2]))[4]), (Object[])((Object[])var2[0]));
                     } else {
                        moa.a((byte)118, ((Object[][])((Object[][])((Object[])((Object[])var2[2]))[3]))[0], (Object[])((Object[])var2[0]));
                     }

                     OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
                  } else if(!((boolean[])((boolean[])((Object[])((Object[])var2[2]))[5]))[0]) {
                     var9 = ((int[])((int[])((Object[])((Object[])var2[0]))[1]))[33] % 4000 * 16 / 4000;
                     moa.a((byte)126, ((Object[][])((Object[][])((Object[])((Object[])var2[2]))[3]))[var9], (Object[])((Object[])var2[0]));
                     OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
                  } else {
                     moa.a((byte)120, (Object[])((Object[])((Object[])((Object[])var2[2]))[4]), (Object[])((Object[])var2[0]));
                     OpenGL.glProgramLocalParameter4fARB('\u8620', 65, ((float[])((float[])var2[3]))[0], 0.0F, 0.0F, 1.0F);
                  }
               } else {
                  moa.a((byte)127, (Object[])null, (Object[])((Object[])var2[0]));
               }

               nha.a((Object[])((Object[])var2[0]), 18806, 0);
               if((var1 & 64) != 0) {
                  OpenGL.glProgramLocalParameter4fARB('\u8620', 66, 1.0F, 1.0F, 1.0F, 1.0F);
               } else {
                  hha.c[1] = ((float[])((float[])((Object[])((Object[])var2[0]))[25]))[10] * ((float[])((float[])((Object[])((Object[])var2[0]))[25]))[17];
                  hha.c[2] = ((float[])((float[])((Object[])((Object[])var2[0]))[25]))[10] * ((float[])((float[])((Object[])((Object[])var2[0]))[25]))[15];
                  hha.c[0] = ((float[])((float[])((Object[])((Object[])var2[0]))[25]))[10] * ((float[])((float[])((Object[])((Object[])var2[0]))[25]))[7];
                  OpenGL.glProgramLocalParameter4fvARB('\u8620', 66, hha.c, 0);
               }

               var9 = 3 & var1;
               if(var9 == 2) {
                  OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.05F, 1.0F, 1.0F, 1.0F);
               } else if(var9 == 3) {
                  OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.1F, 1.0F, 1.0F, 1.0F);
               } else {
                  OpenGL.glProgramLocalParameter4fARB('\u8620', 64, 0.025F, 1.0F, 1.0F, 1.0F);
               }
            }

         } else if(null != var2 && 8 == var2.length) {
            kja.a(var1, var0, var2, 1);
         } else if(null == var2 || -4 != ~var2.length) {
            float var5;
            int var8;
            if(null != var2 && var2.length == 7) {
               if(((boolean[])((boolean[])var2[6]))[0]) {
                  var9 = 1 << (3 & var1);
                  var5 = (float)(1 << ((58 & var1) >> 3)) / 32.0F;
                  int var10 = var0 & '\uffff';
                  float var11 = (float)(3 & var0 >> 16) / 8.0F;
                  var8 = ((int[])((int[])((Object[])((Object[])var2[3]))[1]))[0];
                  OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var8, "time"), (float)(var9 * ((int[])((int[])((Object[])((Object[])var2[0]))[1]))[33] % '\u9c40') / 40000.0F);
                  OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var8, "scale"), var5);
                  OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var8, "breakWaterDepth"), (float)var10);
                  OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var8, "breakWaterOffset"), var11);
               }

            } else if(var2 != null && var2.length == 6) {
               uf.a(var0, var1, var2, -126);
            } else if(var2 != null && var2.length == 9) {
               tba.a(var1, var0, -4947, var2);
            } else {
               if(var3 != 66) {
                  a(((int[])((int[])((Object[])((Object[])c[1]))[0]))[4], -112, (Object[])null, 94);
               }

               if(var2 != null && -6 == ~var2.length) {
                  float var4 = (float)((3 & var1) + 1) * -5.0E-4F;
                  var5 = (float)(1 + ((28 & var1) >> 3)) * 5.0E-4F;
                  float var6 = (64 & var1) == 0?4.8828125E-4F:9.765625E-4F;
                  nha.a((Object[])((Object[])var2[0]), 18806, 1);
                  boolean var7 = -1 != ~(128 & var1);
                  if(var7) {
                     qma.b[3] = 0.0F;
                     qma.b[0] = var6;
                     qma.b[2] = 0.0F;
                     qma.b[1] = 0.0F;
                  } else {
                     qma.b[3] = 0.0F;
                     qma.b[1] = 0.0F;
                     qma.b[0] = 0.0F;
                     qma.b[2] = var6;
                  }

                  OpenGL.glTexGenfv(8192, 9474, qma.b, 0);
                  qma.b[1] = var6;
                  qma.b[3] = var4 * (float)((int[])((int[])((Object[])((Object[])var2[0]))[1]))[33] % 1.0F;
                  qma.b[0] = 0.0F;
                  qma.b[2] = 0.0F;
                  OpenGL.glTexGenfv(8193, 9474, qma.b, 0);
                  if(!((boolean[])((boolean[])((Object[])((Object[])var2[4]))[5]))[0]) {
                     var8 = (int)(var5 * (float)((int[])((int[])((Object[])((Object[])var2[0]))[1]))[33] * 16.0F);
                     moa.a((byte)120, ((Object[][])((Object[][])((Object[])((Object[])var2[4]))[0]))[var8 % 16], (Object[])((Object[])var2[0]));
                  } else {
                     qma.b[2] = 0.0F;
                     qma.b[1] = 0.0F;
                     qma.b[0] = 0.0F;
                     qma.b[3] = var5 * (float)((int[])((int[])((Object[])((Object[])var2[0]))[1]))[33] % 1.0F;
                     OpenGL.glTexGenfv(8194, 9473, qma.b, 0);
                  }

                  nha.a((Object[])((Object[])var2[0]), var3 ^ 18740, 0);
               } else if(null != var2 && var2.length == 4) {
                  fe.a(var2, var0, var1, (byte)45);
               } else {
                  throw new IllegalStateException();
               }
            }
         }
      }
   }

   static final void b(byte var0, Object[] var1) {
      ++a;
      if(var1 == null) {
         int var2 = 45 % ((19 - var0) / 56);
         throw new IllegalStateException();
      } else {
         fra.a(var1, true);
      }
   }

}
