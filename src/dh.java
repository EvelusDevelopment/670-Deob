import jaggl.OpenGL;

final class dh {

   static int g;
   static int b;
   static int c;
   static int f;
   static String[] a;
   static Object[] e;
   static int d;


   static final void a(Object[] var0, int var1) {
      ++c;
      if(null != ((ta)var0[55]).E) {
         ((int[])((int[])var0[1]))[10] = 0;
         ((int[])((int[])var0[1]))[28] = 0;
         if(var1 < 2) {
            a((Object[])null, (int)-75);
         }

         ((int[])((int[])var0[1]))[25] = ((ta)var0[55]).E.e();
         ((int[])((int[])var0[1]))[15] = ((ta)var0[55]).E.d();
         OpenGL.glDisable(3089);
      }
   }

   static final int a(Object[] var0, int var1, int var2) {
      ++g;
      ma var3;
      Object[] var4 = (var3 = (ma)pm.a((long)var2, (Object[])((Object[])var0[var1]), false)) == null?null:var3.s;
      if(var4 == null) {
         Object[] var5 = rj.a(var2, nb.g, 84);
         return 105 != ((char[])((char[])var5[0]))[0]?-1:0;
      } else {
         return ((int[])((int[])var4[1]))[0];
      }
   }

   static final void a(int var0, float var1, float var2, float var3, float var4, Object[] var5, float var6, float var7) {
      ++f;
      ((float[])((float[])var5[0]))[0] = 2.0F / (-var7 + var1);
      ((float[])((float[])var5[0]))[1] = 0.0F;
      if(null != var5 && (-4 == ~var5.length || var5.length == 1 && var5[0].equals(Integer.valueOf(2)) && var5[0].equals(Integer.valueOf(1)) || var5.length == 3 && var5[1].equals(Integer.valueOf(0)) && var5[1].equals(Boolean.valueOf(false)))) {
         Class_ds.a((Object[])null, (byte)105);
      }

      ((float[])((float[])var5[0]))[2] = 0.0F;
      ((float[])((float[])var5[0]))[11] = 0.0F;
      ((float[])((float[])var5[0]))[4] = 0.0F;
      ((float[])((float[])var5[0]))[10] = 2.0F / (-var3 + var4);
      ((float[])((float[])var5[0]))[8] = 0.0F;
      ((float[])((float[])var5[0]))[7] = 0.0F;
      ((float[])((float[])var5[0]))[14] = -(var3 + var4) / (var4 - var3);
      ((float[])((float[])var5[0]))[12] = -(var7 + var1) / (-var7 + var1);
      ((float[])((float[])var5[0]))[6] = 0.0F;
      ((float[])((float[])var5[0]))[5] = 2.0F / (var2 - var6);
      ((float[])((float[])var5[0]))[13] = -(var2 + var6) / (var2 - var6);
      ((float[])((float[])var5[0]))[var0] = 0.0F;
      ((float[])((float[])var5[0]))[15] = 1.0F;
      ((float[])((float[])var5[0]))[3] = 0.0F;
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 >= -50) {
         a(new Object[28], (byte)62);
      }

      ++b;
      synchronized(var0[0]) {
         lga.b(0, (Object[])((Object[])var0[0]));
      }
   }

   static final void a(byte var0, Object[] var1) {
      if(((int[])((int[])var1[1]))[0] > 0) {
         md.a(14, ((int[])((int[])var1[1]))[0], joa.a(var1, (int)3), (Object[])((Object[])var1[5]));
         ((int[])((int[])var1[1]))[0] = 0;
      }

      if(var0 != 90) {
         a((Object[])((Object[])var1[6]), (int)-57);
      }

      ++d;
   }

}
