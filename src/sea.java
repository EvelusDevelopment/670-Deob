import jaggl.OpenGL;
import java.util.Iterator;

final class sea implements Iterable {

   private Object[] j;
   static int c;
   static int f;
   static int b;
   static int e;
   static int d;
   static Object[] f_l = vra.a(new Object[0], 33554431);
   static int f_i;
   static Object[] g = Class_fs.a(4, (byte)-127, new Object[1], 0, 2, 4);
   static int k = 0;
   static int h;
   static int a = 0;


   static final Object[] a(Object[] var0, boolean var1) {
      if(var1) {
         a(118, (Object[])null);
      }

      ++f;
      return ai.g;
   }

   public final Iterator iterator() {
      ++b;
      Object[] var2 = this.j;
      Object[] var5 = new Object[5];
      rha.a(-63, var5);
      al.a((byte)-6, var5);
      var5[0] = rg.a(var5, 96);
      var5[3] = var2;
      var5[4] = ((lm[])((lm[])((Object[])((Object[])var5[3]))[2]))[0].f;
      var5[2] = null;
      ((int[])((int[])var5[1]))[0] = 1;
      Iterator var1 = (Iterator)(null != var5?var5[0]:null);
      return var1;
   }

   static final void a(Object[] var0, byte var1) {
      ++h;

      int var2;
      for(var2 = 0; ((int[])((int[])var0[1]))[7] > var2; ++var2) {
         Object[] var3 = ((Object[][])((Object[][])var0[14]))[var2];
         int var4 = var2 + 16386;
         bja.c[0] = (float)lba.a(var3, var1 ^ 25721);
         bja.c[1] = (float)sla.a(var3, false);
         bja.c[2] = (float)fn.a(var3, 51);
         bja.c[3] = 1.0F;
         OpenGL.glLightfv(var4, 4611, bja.c, 0);
         int var5 = gaa.a(var3, (byte)-69);
         float var6 = sba.a(0, var3) / 255.0F;
         bja.c[1] = var6 * (float)(255 & var5 >> 8);
         bja.c[0] = (float)((16717498 & var5) >> 16) * var6;
         bja.c[2] = (float)(var5 & 255) * var6;
         OpenGL.glLightfv(var4, 4609, bja.c, 0);
         OpenGL.glLightf(var4, 4617, 1.0F / (float)(mc.a(false, var3) * mc.a(false, var3)));
         OpenGL.glEnable(var4);
         if(null != var0 && var0.length == 30 && var0[7].equals(Boolean.valueOf(false))) {
            fn.a(true, (byte)-35, true, (Object[])null, 26);
         }
      }

      while(((int[])((int[])var0[1]))[27] > var2) {
         OpenGL.glDisable(16386 + var2);
         ++var2;
      }

      if(var1 != -28) {
         g = (Object[])null;
      }

      if(var0 != null && -2 == ~var0.length) {
         esa.a = 54;
      }

      ((int[])((int[])var0[1]))[27] = ((int[])((int[])var0[1]))[7];
   }

   static final Object[] b(Object[] var0, Object[] var1, byte var2) {
      if(var1[0] == null) {
         var1[0] = new int[1];
      }

      ++c;
      if(var2 >= -118) {
         b((Object[])((Object[])((Object[])((Object[])((Object[])((Object[])var0[0]))[2]))[0]), (Object[])null, (byte)-124);
      }

      ((int[])((int[])var1[0]))[0] = de.a((int)0, var0);
      return var1;
   }

   sea(Object[] var1) {
      this.j = var1;
   }

   static final void a(int var0, Object[] var1) {
      ((int[])((int[])var1[1]))[4] = 0;
      ((int[])((int[])var1[1]))[39] = 0;
      ++e;
      ((int[])((int[])var1[1]))[1] = ((ta)var1[55]).E.e();
      ((int[])((int[])var1[1]))[0] = ((ta)var1[55]).E.d();
      if(var0 != -21614) {
         k = -77;
      }

      dca.c(var1, 20);
   }

   static final void a(Object[] var0, Object[] var1, byte var2) {
      ++f_i;
      if(var2 <= 50) {
         ((boolean[])((boolean[])f_l[8]))[9] = ((boolean[])((boolean[])((Object[])((Object[])((Object[])((Object[])g[10]))[9]))[2]))[0];
      }

      System.arraycopy(var0[0], 0, var1[0], 0, 16);
   }

   static final void a(Object[] var0, boolean var1, Object[] var2) {
      label16: {
         if(var2 != var0) {
            ((float[])((float[])var2[0]))[0] = ((float[])((float[])var0[0]))[5];
            ((float[])((float[])var2[0]))[6] = ((float[])((float[])var0[0]))[9];
            ((float[])((float[])var2[0]))[10] = ((float[])((float[])var0[0]))[10];
            ((float[])((float[])var2[0]))[3] = ((float[])((float[])var0[0]))[3];
            ((float[])((float[])var2[0]))[5] = ((float[])((float[])var0[0]))[0];
            ((float[])((float[])var2[0]))[9] = ((float[])((float[])var0[0]))[6];
            ((float[])((float[])var2[0]))[11] = ((float[])((float[])var0[0]))[2];
            ((float[])((float[])var2[0]))[8] = -(((float[])((float[])var0[0]))[8] * ((float[])((float[])var2[0]))[10] + ((float[])((float[])var2[0]))[0] * ((float[])((float[])var0[0]))[1] + ((float[])((float[])var2[0]))[6] * ((float[])((float[])var0[0]))[7]);
            ((float[])((float[])var2[0]))[4] = ((float[])((float[])var0[0]))[4];
            ((float[])((float[])var2[0]))[2] = ((float[])((float[])var0[0]))[11];
            ((float[])((float[])var2[0]))[1] = -(((float[])((float[])var2[0]))[3] * ((float[])((float[])var0[0]))[1] + ((float[])((float[])var2[0]))[5] * ((float[])((float[])var0[0]))[8] + ((float[])((float[])var0[0]))[7] * ((float[])((float[])var2[0]))[11]);
            ((float[])((float[])var2[0]))[7] = -(((float[])((float[])var0[0]))[1] * ((float[])((float[])var2[0]))[2] + ((float[])((float[])var0[0]))[8] * ((float[])((float[])var2[0]))[9] + ((float[])((float[])var2[0]))[4] * ((float[])((float[])var0[0]))[7]);
            if(client.f_vb == 0) {
               break label16;
            }
         }

         kj.a(true, var2);
      }

      ++d;
      if(!var1) {
         a(-104, (Object[])null);
      }

   }

}
