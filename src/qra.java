
final class qra {

   static int b;
   static int d;
   static int c;
   static int f;
   static int e;
   static int[] a = new int[]{8, 11, 4, 6, 9, 7, 10, 0};


   static final Object[] a(Object[] var0, Object[][] var1, boolean var2, byte var3) {
      if(null == var0[0]) {
         var0[0] = new boolean[1];
      }

      var0[2] = var1;
      if(var3 != 122) {
         return (Object[])((Object[])var0[0]);
      } else {
         ++c;
         ((boolean[])((boolean[])var0[0]))[0] = var2;
         return var0;
      }
   }

   static final Object[] a(int var0, boolean var1, ta var2, Object[] var3, int var4) {
      ++b;
      if(var4 > -127) {
         a((int)11, (Object[])null);
      }

      Object[] var5 = mca.a(true, ((int[])((int[])var3[12]))[3], lja.d);
      aa var6;
      aa var7;
      if(!((boolean[])((boolean[])var3[8]))[5]) {
         var6 = bf.f_l[((byte[])((byte[])var3[10]))[1]];
         if(3 > ((byte[])((byte[])var3[10]))[1]) {
            var7 = bf.f_l[1 + ((byte[])((byte[])var3[10]))[1]];
         } else {
            var7 = null;
         }
      } else {
         var7 = bf.f_l[0];
         var6 = wd.a[((byte[])((byte[])var3[10]))[1]];
      }

      Object[] var8 = (Object[])((Object[])woa.a(5, var3)[1]);
      return lq.a(var7, var0, (int)((float[])((float[])var8[1]))[0], var1, 15790, (int)((float[])((float[])var8[1]))[1], (int)((float[])((float[])var8[1]))[2], var2, var6, (Object[])null, var5, ((byte[])((byte[])var3[10]))[3], ((byte[])((byte[])var3[10]))[2]);
   }

   static final Object[] a(byte var0, Object[] var1) {
      ++d;
      int var2 = -1;
      if(var0 != 97) {
         a((Object[])null, (Object[][])((Object[][])null), true, ((byte[])((byte[])var1[3]))[1]);
      }

      if(-1 != ((String)var1[85]).indexOf("nvidia")) {
         var2 = 4318;
      } else if(-1 != ((String)var1[85]).indexOf("intel")) {
         var2 = '\u8086';
      } else if(-1 != ((String)var1[85]).indexOf("ati")) {
         var2 = 4098;
      }

      return dda.a(((int[])((int[])var1[1]))[39], 0L, new Object[4], -111, (String)var1[90], "OpenGL", var2);
   }

   static final void a(int var0, Object[] var1) {
      if(var0 <= 50) {
         a((int)-109, (Object[])((Object[])var1[0]));
      }

      if(null == var1[0]) {
         var1[0] = new int[3];
      }

      ++e;
   }

}
