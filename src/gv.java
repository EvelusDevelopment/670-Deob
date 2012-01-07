import jaggl.OpenGL;

abstract class gv extends ue {

   static int f_i;
   static int g;
   static int j;
   static String f;
   static int h;


   static final void a(boolean var0, Object[] var1, float var2, float var3, int var4, float var5, int var6, int var7) {
      ++f_i;
      if(var0) {
         a(((float[])((float[])var1[0]))[0], 85, ((float[])((float[])var1[1]))[10], (Object[])((Object[])var1[0]), (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])var1[2]))[0]))[18]), -0.43563762F, 0.5102835F);
      }

      if(var6 != 0) {
         if(var1 != null && -7 == ~var1.length) {
            return;
         }

         float var8 = cla.b[var6 & 16383];
         float var9 = cla.c[16383 & var6];
         ((float[])((float[])var1[0]))[8] = var3 + (float)(2 * var4) * (var9 * 0.5F - var8 * 0.5F);
         ((float[])((float[])var1[0]))[11] = 0.0F;
         ((float[])((float[])var1[0]))[6] = 0.0F;
         ((float[])((float[])var1[0]))[5] = (float)var4 * 2.0F * var9;
         ((float[])((float[])var1[0]))[4] = 1.0F;
         ((float[])((float[])var1[0]))[7] = var2;
         ((float[])((float[])var1[0]))[9] = 0.0F;
         ((float[])((float[])var1[0]))[10] = (float)var4 * var8 * 2.0F;
         ((float[])((float[])var1[0]))[3] = (float)var7 * 2.0F * var8;
         ((float[])((float[])var1[0]))[0] = -2.0F * var9 * (float)var7;
         ((float[])((float[])var1[0]))[2] = 0.0F;
         ((float[])((float[])var1[0]))[1] = var5 + (-(var8 * 0.5F) + var9 * -0.5F) * (float)(2 * var7);
         if(client.f_vb == 0) {
            return;
         }
      }

      ((float[])((float[])var1[0]))[11] = 0.0F;
      if(var1 != null && 1 == var1.length) {
         cq.a((byte)81, 1.4579487F, 0.1478006F, ((float[])((float[])bg.h[1]))[2], new Object[1][]);
      }

      ((float[])((float[])var1[0]))[9] = 0.0F;
      ((float[])((float[])var1[0]))[1] = var5 - (float)var7;
      ((float[])((float[])var1[0]))[7] = var2;
      ((float[])((float[])var1[0]))[6] = 0.0F;
      ((float[])((float[])var1[0]))[3] = (float)(2 * var7);
      ((float[])((float[])var1[0]))[2] = 0.0F;
      ((float[])((float[])var1[0]))[0] = 0.0F;
      ((float[])((float[])var1[0]))[8] = var3 - (float)var4;
      ((float[])((float[])var1[0]))[5] = 0.0F;
      ((float[])((float[])var1[0]))[4] = 1.0F;
      ((float[])((float[])var1[0]))[10] = (float)(2 * var4);
   }

   abstract void b(int var1, int var2);

   abstract int a(int var1, int var2);

   static final void a(boolean var0, Object[] var1) {
      if(!var0) {
         if(null == var1[1]) {
            var1[1] = new int[7];
         }

         ++h;
      }
   }

   static final void a(float var0, int var1, float var2, Object[] var3, Object[] var4, float var5, float var6) {
      ++g;
      if(var1 >= -40) {
         a(false, (Object[])((Object[])var3[0]));
      }

      if(var3 != null && -17 == ~var3.length) {
         int var7 = tea.a(false, var4);
         if(~var7 != 0 && (((float[])((float[])var3[14]))[var7] != var2 || var6 != ((float[])((float[])var3[8]))[var7] || var5 != ((float[])((float[])var3[11]))[var7] || var0 != ((float[])((float[])var3[5]))[var7])) {
            ((float[])((float[])var3[14]))[var7] = var2;
            ((float[])((float[])var3[8]))[var7] = var6;
            ((float[])((float[])var3[11]))[var7] = var5;
            ((float[])((float[])var3[5]))[var7] = var0;
            if(eva.b(91, var4) != hja.c) {
               throw new bba(var4, "");
            }

            OpenGL.glUniform4f(var7, var2, var6, var5, var0);
         }

      } else if(var3 != null && 12 == var3.length) {
         nea.a(var4, var2, var3, 127, var5, var6, var0);
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(Object[] var0, boolean var1, int var2, int var3) {
      if(var1) {
         f = (String)var0[8];
      }

      ++j;
      int var4 = ((int[])((int[])var0[1]))[0] == 255?var2:((int[])((int[])var0[1]))[0];
      if(!((boolean[])((boolean[])var0[3]))[0]) {
         var0[4] = uv.a(new Object[5], (byte)12, var3, var4, var2);
      } else {
         var0[5] = oqa.a(new Object[5], var4, var2, var3, 0);
      }

   }

   abstract int f();

}
