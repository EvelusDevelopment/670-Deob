import jaggl.OpenGL;

final class pm {

   static int b;
   static int d;
   static int g;
   static int a;
   static int e;
   static int c;
   static int f;


   static final boolean a(int var0, Object[] var1, int var2) {
      ++f;
      return var2 != -1361?((boolean[])((boolean[])var1[0]))[10]:wk.a(((Object[][])((Object[][])var1[3]))[var0], -10057);
   }

   static final int a(int var0, byte var1) {
      ++c;
      var0 = ((-1431655766 & var0) >>> 1) + (var0 & 1431655765);
      var0 = (858993459 & var0) + (1932735283 & var0 >>> 2);
      var0 = 252645135 & var0 + (var0 >>> 4);
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      if(var1 != -65) {
         a(-58, -94, -78, (Object[])null);
      }

      return var0 & 255;
   }

   static final Object[] a(Object[] var0, int var1, long var2) {
      ++e;
      qia.a(var0, false);
      var0[var1] = ih.a(var1 - 29, var0);
      ((long[])((long[])var0[1]))[0] = var2;
      return var0;
   }

   static final Object[] a(Object[] var0, Object[] var1, byte var2) {
      ++b;
      sc.a(9, var0);
      if(var2 > -106) {
         return (Object[])((Object[])var0[20]);
      } else {
         sea.b(var1, var0, (byte)-128);
         ((int[])((int[])var0[0]))[3] = de.a((int)0, var1);
         ((int[])((int[])var0[0]))[2] = de.a((int)0, var1);
         ((int[])((int[])var0[0]))[1] = fh.a(var1, false);
         return var0;
      }
   }

   static final lm a(long var0, Object[] var2, boolean var3) {
      ++d;
      ((long[])((long[])var2[3]))[0] = var0;
      lm var4 = ((lm[])((lm[])var2[4]))[(int)(var0 & (long)(-1 + ((int[])((int[])var2[1]))[1]))];
      if(null != var2 && var2.length == 9) {
         nb.a((byte)64, 73, (Object[])null);
      }

      if(var3) {
         ((long[])((long[])var2[12]))[12] = 40L;
      }

      for(var2[0] = var4.f; var2[0] != var4; var2[0] = ((lm)var2[0]).f) {
         if(var0 == ((lm)var2[0]).e) {
            lm var5 = (lm)var2[0];
            var2[0] = ((lm)var2[0]).f;
            return var5;
         }
      }

      var2[0] = null;
      return null;
   }

   static final Object[] a(int var0, Object[] var1) {
      gk.b(var1, var0);
      ++a;
      ((boolean[])((boolean[])var1[2]))[0] = true;
      return var1;
   }

   static final void a(int var0, int var1, int var2, Object[] var3) {
      ((OpenGL)var3[var2]).surfaceResized(((long[])((long[])var3[4]))[0]);
      ++g;
      hv.a(var2 + 3441, var3);
      kr.a(var1, var0, var3, 7235);
   }

}
