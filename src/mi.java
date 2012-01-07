import jagdx.IDirect3DDevice;
import jaggl.OpenGL;

final class mi {

   static int f;
   static int h;
   static Object[] c = ed.a(-1, new Object[1], (byte)-116, 39);
   static int a;
   static int d;
   static Object[] e = ho.a(-1, 92, new Object[1], true);
   static float b;
   static Object[] g = null;
   static short f_i = 1;


   static final void a(byte var0, Object[] var1) {
      synchronized(var1[0]) {
         lga.b(0, (Object[])((Object[])var1[0]));
      }

      if(var0 >= 3) {
         ++a;
      }
   }

   static final long a(int var0, Object[] var1) {
      ++d;
      if(null != var1) {
         return vw.b(122, var1);
      } else {
         if(var0 != 36) {
            ((boolean[])((boolean[])e[13]))[0] = ((boolean[])((boolean[])var1[0]))[18];
         }

         throw new IllegalStateException();
      }
   }

   static final void b(byte var0, Object[] var1) {
      ++h;
      if(var1 != null && var1.length == 87) {
         if(((ta)var1[38]).E != null) {
            IDirect3DDevice.SetViewport(((long[])((long[])var1[50]))[5], ((int[])((int[])var1[1]))[36] + ((int[])((int[])var1[1]))[25], ((int[])((int[])var1[1]))[21] + ((int[])((int[])var1[1]))[0], ((int[])((int[])var1[1]))[20], ((int[])((int[])var1[1]))[30], ((float[])((float[])var1[0]))[6], ((float[])((float[])var1[0]))[1]);
         }

      } else {
         int var2 = 57 % ((var0 + 12) / 48);
         if(null != var1 && 91 == var1.length) {
            if(((ta)var1[38]).E != null) {
               OpenGL.glViewport(((int[])((int[])var1[1]))[36] + ((int[])((int[])var1[1]))[25], ((int[])((int[])var1[1]))[0] - (-((ta)var1[38]).E.d() + ((int[])((int[])var1[1]))[21] + ((int[])((int[])var1[1]))[30]), ((int[])((int[])var1[1]))[20], ((int[])((int[])var1[1]))[30]);
            }

            OpenGL.glDepthRange(((float[])((float[])var1[0]))[6], ((float[])((float[])var1[0]))[1]);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(int var0, int var1, byte var2, int var3, Object[] var4) {
      if(var4 != null && var4.length == 10) {
         go.a = -104;
      }

      ++f;
      int var5 = ((int[])((int[])var4[33]))[0];
      int var6 = ((int[])((int[])var4[14]))[0];
      if(var5 >= 0 && rp.c > var5 && 0 <= var6 && wpa.a > var6) {
         if(var1 >= 0 && rp.c > var1 && 0 <= var3 && wpa.a > var3) {
            int var7 = wta.a(ega.a, var1, var3, rba.c, var6, hj.f_i[((byte[])((byte[])var4[10]))[0]], var0 ^ 14348, 0, -4, gn.a(var4, (byte)13), 0, 0, 0, true, var5);
            if(var7 >= 1) {
               if(3 >= var7) {
                  for(int var8 = 0; var7 - 1 > var8; ++var8) {
                     nca.a(true, rba.c[var8], var4, ega.a[var8], var2);
                  }

                  if(var0 != -14349) {
                     g[0] = c[0];
                  }

               }
            }
         }
      }
   }

}
