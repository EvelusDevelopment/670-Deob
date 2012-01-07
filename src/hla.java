import jaggl.OpenGL;

final class hla {

   static int b;
   static Object[] f = sd.a(new Object[1], 59, (byte)127);
   static int e;
   static int d;
   static int h;
   static int a;
   static int c;
   static int g = 0;


   static final ma a(Object[] var0, int var1) {
      if(var1 != '\u8515') {
         b((Object[])null, -6);
      }

      ++b;
      return new ma(var0);
   }

   static final void b(int var0, Object[] var1) {
      ++d;
      if(var0 != 26206) {
         b((Object[])null, -107);
      }

      var1[0] = "null";
   }

   static final Object[] a(boolean var0, byte[][] var1, Object[] var2, Object[] var3, Object[] var4, Object[] var5, byte var6, int var7, Object[] var8) {
      ++a;
      wla.b(var5, -50);
      np.a(1, var2, var4, '\u8513', var5, var3, var0, 6 * var7 * var7);
      ((int[])((int[])var5[1]))[3] = var7;
      if(null != var5 && var5.length == 2 && var5[0].equals(Integer.valueOf(0))) {
         kca.a(42, (Object[])null, -2, (Object[])null, (Object[])null, (Object[])null);
      }

      if(var6 > -24) {
         g = -92;
      }

      moa.a((byte)113, var5, (Object[])((Object[])var5[4]));

      for(int var9 = 0; 6 > var9; ++var9) {
         OpenGL.glTexImage2Dub(var9 + '\u8515', 0, bu.a(110, (Object[])((Object[])var5[5]), (Object[])((Object[])var5[2])), var7, var7, 0, rha.b(8, var8), 5121, var1[var9], 0);
      }

      gg.a((byte)-113, var5, true);
      return var5;
   }

   static final int a(int var0, Object[] var1) {
      ++h;
      if(var0 != 19848) {
         g = ((int[])((int[])((Object[])((Object[])f[3]))[2]))[0];
      }

      return ((int[])((int[])var1[1]))[0];
   }

   static final void a(int var0, boolean var1, int var2, int var3, Object[] var4, byte var5, int var6) {
      sw.a = var0;
      dl.d = 1;
      kk.a = var1;
      if(var5 != -46) {
         b(((int[])((int[])var4[13]))[4], (Object[])null);
      }

      pda.c = var3;
      oq.d = var6;
      rua.a = null;
      bl.a = var2;
      ++e;
      bp.c = var4;
   }

   static final int b(Object[] var0, int var1) {
      if(var1 != 1) {
         f = (Object[])null;
      }

      ++c;
      if(null == var0) {
         throw new IllegalStateException();
      } else {
         int var2 = ((int[])((int[])var0[1]))[3];
         return var2;
      }
   }

}
