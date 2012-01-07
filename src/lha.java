import jaggl.OpenGL;

final class lha {

   static int f_i;
   static int e;
   static int a;
   static Object[] b = ed.a(1, new Object[1], (byte)-102, 12);
   static int d = 0;
   static int c;
   static int f;
   static int j;
   static Object[] h = sj.a(4, new Object[3], (byte)-79);
   static int g;


   static final Object[] a(Object[] var0, boolean var1, int var2) {
      pba.a(1, var0);
      ++j;
      if(!var1) {
         return (Object[])null;
      } else {
         wg var4 = new wg(var0);
         var0[0] = var4;
         ((int[])((int[])var0[1]))[0] = var2;
         return var0;
      }
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, Object[] var3, int var4) {
      ++e;
      if(var0 >= -59) {
         return (Object[])null;
      } else {
         mo.b(var1, -1511823029);
         uc.a(var1, 30837);
         var1[2] = var3;
         ((int[])((int[])var1[1]))[0] = jla.a((Object[])((Object[])var1[2]), (byte)-99, 19);
         return var1;
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Object[] var7) {
      td.a((byte)-65, var7);
      ++a;
      kd.a(3042, var7, var6);
      float var8 = (float)var0 - (float)var3;
      float var9 = (float)(-var4) + (float)var5;
      if(var7 != null && 16 == var7.length && var7[0].equals(Integer.valueOf(0)) && var7[0].equals(Integer.valueOf(2))) {
         dma.f = null;
      }

      if(0.0F == var8 && 0.0F == var9) {
         var8 = 1.0F;
      } else {
         float var10 = (float)(1.0D / Math.sqrt((double)(var8 * var8 + var9 * var9)));
         var8 *= var10;
         var9 *= var10;
      }

      OpenGL.glColor4ub((byte)(var1 >> 16), (byte)(var1 >> 8), (byte)var1, (byte)(var1 >> 24));
      OpenGL.glBegin(1);
      if(var2 < 70) {
         a(-61, ((int[])((int[])var7[9]))[14], -116, 111, 79, -46, 30, (Object[])null);
      }

      OpenGL.glVertex2f(0.35F + (float)var3, 0.35F + (float)var4);
      OpenGL.glVertex2f(var8 + (float)var0 + 0.35F, (float)var5 + var9 + 0.35F);
      OpenGL.glEnd();
   }

   static final boolean a(int var0, int var1, Object[] var2, int var3) {
      if(var0 < 45) {
         a(45, -116, ((int[])((int[])((Object[])((Object[])h[0]))[1]))[0], -32, 72, -57, 82, (Object[])null);
      }

      ++f_i;
      return ((int[])((int[])var2[1]))[5] <= var1 && ~var1 >= ~((int[])((int[])var2[1]))[3] && var3 >= ((int[])((int[])var2[1]))[0] && ((int[])((int[])var2[1]))[4] >= var3?true:~var1 <= ~((int[])((int[])var2[1]))[6] && ((int[])((int[])var2[1]))[7] >= var1 && var3 >= ((int[])((int[])var2[1]))[1] && ~var3 >= ~((int[])((int[])var2[1]))[2];
   }

   static final Object[] a(Object[] var0, int var1, Object[][] var2) {
      if(var1 != 2) {
         a(30, ((int[])((int[])b[5]))[9], (Object[])null, 14);
      }

      ++c;
      return jh.a(1, var2, new Object[2]);
   }

}
