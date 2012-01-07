import jaggl.OpenGL;
import java.net.Socket;

final class vga {

   static int c;
   static int e;
   static Object[] a = pa.a("LIVE", false, 0, new Object[2]);
   static Object[] b = ql.a(0, new Object[2], (byte)-88, 0);
   static Socket d;


   static final Object[] a(Object[] var0, boolean var1, Object[][] var2) {
      ++e;

      int var3;
      for(var3 = 0; ~var3 > ~var2.length; ++var3) {
         if(null == var2[var3] || ((int[])((int[])var2[var3][1]))[0] <= 0) {
            return null;
         }
      }

      var3 = OpenGL.glCreateProgram();

      int var4;
      for(var4 = 0; var2.length > var4; ++var4) {
         OpenGL.glAttachShader(var3, ((int[])((int[])var2[var4][1]))[0]);
      }

      OpenGL.glLinkProgram(var3);
      OpenGL.glGetProgramiv(var3, '\u8b82', Class_is.e, 0);
      if(Class_is.e[0] == 0) {
         OpenGL.glGetProgramiv(var3, '\u8b84', Class_is.e, 1);
         if(-2 > ~Class_is.e[1]) {
            byte[] var5 = new byte[Class_is.e[1]];
            OpenGL.glGetProgramInfoLog(var3, Class_is.e[1], Class_is.e, 0, var5, 0);
            System.out.println(new String(var5));
         }

         if(Class_is.e[0] == 0) {
            if(var0 != null && -11 == ~var0.length) {
               return null;
            }

            for(var4 = 0; ~var4 > ~var2.length; ++var4) {
               OpenGL.glDetachShader(var3, ((int[])((int[])var2[var4][1]))[0]);
            }

            OpenGL.glDeleteProgram(var3);
            return null;
         }
      }

      if(var1) {
         d = (Socket)null;
      }

      return ro.a(var3, 65, var2, var0, new Object[3]);
   }

   static final void a(int var0, int var1, int var2, Object[] var3, long[] var4) {
      if(var0 < var1) {
         int var5 = (var1 + var0) / 2;
         int var6 = var0;
         long var7 = var4[var5];
         var4[var5] = var4[var1];
         var4[var1] = var7;
         Object var9 = var3[var5];
         var3[var5] = var3[var1];
         var3[var1] = var9;
         int var10 = Long.MAX_VALUE == var7?0:1;

         for(int var11 = var0; var11 < var1; ++var11) {
            if(var4[var11] < var7 - -((long)(var10 & var11))) {
               long var12 = var4[var11];
               var4[var11] = var4[var6];
               var4[var6] = var12;
               Object var14 = var3[var11];
               var3[var11] = var3[var6];
               var3[var6++] = var14;
            }
         }

         var4[var1] = var4[var6];
         var4[var6] = var7;
         var3[var1] = var3[var6];
         var3[var6] = var9;
         a(var0, -1 + var6, 0, var3, var4);
         a(var6 + 1, var1, 0, var3, var4);
      }

      ++c;
      if(var2 != 0) {
         ((boolean[])((boolean[])a[5]))[12] = false;
      }

   }

}
