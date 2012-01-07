import jagdx.IDirect3DSwapChain;
import jaggl.OpenGL;

final class jha {

   static int a;
   static int f;
   static int b;
   static int c;
   static int d;
   static int g;
   static int h;
   static int e = -2;


   static final void b(int var0, Object[] var1) {
      if(var0 > -122) {
         e = 46;
      }

      ++g;
      throw new IllegalStateException();
   }

   static final void a(int var0, int var1, Object[] var2, int var3, int var4) {
      Class_cs.a((float)var3, (float)var1, (float)var0, (Object[])((Object[])var2[2]), (byte)125);
      ++b;
      if(var4 <= 58) {
         e = -37;
      }

   }

   static final void a(Object[] var0, int var1) {
      ((int[])((int[])var0[1]))[0] = 0;
      if(var1 != -16345) {
         a(92, (Object[])null);
      }

      var0[4] = null;
      ++c;
      ((long[])((long[])var0[12]))[0] = -1L;
   }

   static final Object[] a(int var0, short var1, Object[] var2) {
      if(var0 <= 48) {
         e = -100;
      }

      if(null == var2[0]) {
         var2[0] = new short[1];
      }

      ++f;
      var2[1] = eba.a((byte)-18, var2);
      ((short[])((short[])var2[0]))[0] = var1;
      return var2;
   }

   static final int a(int var0, int var1, boolean var2, int var3) {
      ++a;
      Object[] var4 = fk.a(var3 + -2147477531, var0, var2);
      return var3 != -6117?22:(null == var4?-1:(0 <= var1 && ((int[])((int[])var4[2])).length > var1?((int[])((int[])var4[2]))[var1]:-1));
   }

   static final void a(int var0, Object[] var1) {
      ++d;
      if(0 < ((int[])((int[])var1[1]))[1]) {
         int[] var2 = new int[]{((int[])((int[])var1[1]))[1]};
         OpenGL.glDeleteRenderbuffersEXT(1, var2, 0);
         ((int[])((int[])var1[1]))[1] = 0;
      }

      int var3 = 85 % ((-30 - var0) / 55);
   }

   static final int a(int var0, int var1, boolean var2, Object[] var3) {
      ++h;
      if(var2) {
         a(38, (Object[])null);
      }

      if(var3 != null && var3.length == 8) {
         int var4 = IDirect3DSwapChain.Present(((long[])((long[])var3[4]))[1], 0);
         return var4;
      } else if(null != var3 && var3.length == 6) {
         return uq.a(var3, var1, -84, var0);
      } else {
         throw new IllegalStateException();
      }
   }

}
