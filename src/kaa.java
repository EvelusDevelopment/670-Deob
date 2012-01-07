import jaggl.OpenGL;

final class kaa {

   static Object[] a = ve.a(new Object[1], (byte)3, 2);
   static int e;
   static int d;
   static int c;
   static int b;
   static Object[] f;
   static int h;
   static int g;


   static final boolean a(int var0, Object[] var1) {
      ++e;
      return var1[var0] == null?true:!((ka)var1[16]).m();
   }

   static final void a(byte var0, byte var1, int var2, Object[] var3) {
      if(var0 != 45) {
         a(((int[])((int[])a[9]))[0], -34, -65);
      }

      ++b;
      byte[] var10000 = (byte[])((byte[])var3[3]);
      int[] var10001 = (int[])((int[])var3[1]);
      int var10004 = ((int[])((int[])var3[1]))[6];
      var10001[6] = ((int[])((int[])var3[1]))[6] + 1;
      var10000[var10004] = (byte)(127 + ((255 & var1) >> 1));
   }

   static final void a(Object[] var0, Object[] var1, int var2, Object[] var3) {
      rv.a(-17242, var0, var3, ((Object[][])((Object[][])var1[3]))[((int[])((int[])var1[1]))[2]]);
      ++h;
      if(var2 <= 71) {
         a((Object[])null, (byte)-35);
      }

   }

   static final void a(String var0, int var1, int var2) {
      if(var1 <= -48) {
         ++d;
         jl.a("", var2, 8191, "", "", 0, var0);
      }
   }

   static final Object[] a(int var0, int var1, Object[] var2, Object[] var3, int var4, Object[] var5, Object[] var6, int var7) {
      ++g;
      vt.a(var3, (int)-122);
      np.a(var7 - 1, var2, var6, var0, var3, var5, false, var1 * var4);
      ((int[])((int[])var3[1]))[3] = var1;
      ((int[])((int[])var3[1]))[4] = var4;
      moa.a((byte)126, var3, (Object[])((Object[])var3[4]));
      OpenGL.glTexImage2Dub(((int[])((int[])var3[1]))[2], 0, bu.a(50, (Object[])((Object[])var3[5]), (Object[])((Object[])var3[var7])), var1, var4, 0, rha.b(var7 ^ 10, (Object[])((Object[])var3[2])), 5121, (byte[])null, 0);
      gg.a((byte)-34, var3, true);
      return var3;
   }

   static final Object[] a(int var0, int var1, int var2) {
      Object[] var3 = ju.g[var0][var1][var2];
      return var3 == null?null:(Object[])((Object[])var3[8]);
   }

   static final void a(Object[] var0, byte var1) {
      if(null == var0[1]) {
         var0[1] = new int[2];
      }

      ++c;
      if(var1 <= 68) {
         a = (Object[])null;
      }

   }

}
