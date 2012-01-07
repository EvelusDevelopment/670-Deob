import jaggl.OpenGL;

final class sj {

   static int d;
   static int a;
   static int e;
   static int f;
   static Object[] c = ed.a(3, new Object[1], (byte)-128, 68);
   static int g;
   static int b;


   static final void a(Object[] var0, byte var1, int var2) {
      ++a;
      if(~var2 != ~((int[])((int[])var0[1]))[7]) {
         ((int[])((int[])var0[1]))[7] = var2;
         if(null == var0 || -88 != ~var0.length) {
            if(var0 == null || var0.length != 91) {
               throw new IllegalStateException();
            }

            OpenGL.glActiveTexture(((int[])((int[])var0[1]))[7] + '\u84c0');
         }
      }

      int var3 = 103 % ((34 - var1) / 32);
   }

   static final void a(int var0, Object[] var1) {
      ++b;
      if(null != var1 && var1.length == 8) {
         oe.a(var1, var0 ^ 0);
      } else if(null != var1 && 9 == var1.length) {
         oe.a(var1, (int)1);
      } else {
         oe.a(var1, var0);
      }
   }

   static final Object[] a(int var0, Object[] var1, byte var2) {
      if(var2 > -23) {
         var1[1] = var1[4];
      }

      de.a(var0, var0, 2, var1);
      ++d;
      return var1;
   }

   static final void a(int var0, Object[] var1, int var2, byte var3) {
      if(var3 != 47) {
         c = (Object[])null;
      }

      ++f;
   }

   static final void a(int var0, int var1) {
      ++e;
      Object[] var2 = la.a(var0 - 91, (long)var1, 10);
      aia.a(var2, 1);
      if(var0 != 91) {
         a((Object[])null, (byte)77, (int)95);
      }

   }

   static final Object[] a(Object[] var0, int var1, byte var2) {
      if(var2 != 24) {
         a(((int[])((int[])c[0]))[6], (Object[])null, 27, (byte)-36);
      }

      ++g;
      return ((Object[][])((Object[][])var0[3]))[var1];
   }

}
