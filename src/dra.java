import jagdx.IDirect3DDevice;
import jaggl.OpenGL;

final class dra {

   static int c;
   static int h;
   static int f_i = 0;
   static int b;
   static int j;
   static int a;
   static Object[] g;
   static int f;
   static int d;
   static int e;


   static final boolean a(long var0, int var2, int var3, int var4, Object[] var5) {
      ++a;
      return var4 > -99?((boolean[])((boolean[])g[5]))[0]:baa.a(false, var5, var0, var2, var3);
   }

   static final Object[] a(int var0, int var1, int var2, int var3, int var4, Object[] var5, int var6, boolean var7, int var8) {
      if(null == var5[13]) {
         var5[13] = new short[2];
      }

      var5[14] = Integer.valueOf(0);
      ++f;
      ct.a(var5, true);
      ((short[])((short[])var5[13]))[1] = (short)var4;
      if(var7) {
         a(-41, (String)g[0], (String)null, 109, (Object[])null);
      }

      ((byte[])((byte[])var5[10]))[1] = (byte)var0;
      ((byte[])((byte[])var5[10]))[0] = (byte)var6;
      ((short[])((short[])var5[13]))[0] = (short)var3;
      sra.a(var5, bl.a((byte)25, (float)var1, new Object[2], (float)var8, (float)var2), 1);
      return var5;
   }

   static final void a(Object[] var0, boolean var1, long var2) {
      if(!var1) {
         ++h;
         ((long[])((long[])var0[50]))[1] = var2;
         IDirect3DDevice.SetVertexShader(((long[])((long[])var0[50]))[5], var2);
      }
   }

   static final hka a(int var0, Object[] var1) {
      ++b;
      if(var0 <= 42) {
         a(-85L, 9, 36, 33, (Object[])null);
      }

      return new hka(var1);
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++d;
      ((int[])((int[])var1[1]))[var2] = var0;
   }

   static final int a(int var0, String var1, String var2, int var3, Object[] var4) {
      ++e;
      if(var1 != null) {
         int var5 = OpenGL.glCreateShader(var0);
         OpenGL.glShaderSource(var5, var1);
         if(var3 <= 100) {
            return -44;
         } else {
            OpenGL.glCompileShader(var5);
            OpenGL.glGetShaderiv(var5, '\u8b81', lp.g, 0);
            if(lp.g[0] == 0) {
               OpenGL.glDeleteShader(var5);
               var5 = 0;
            }

            return var5;
         }
      } else {
         return 0;
      }
   }

}
