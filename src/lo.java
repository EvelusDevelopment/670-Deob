import jaggl.OpenGL;
import java.io.File;

final class lo {

   static Object[] c = ab.a(new Object[2], (byte)-57);
   static int k;
   static int a;
   static int b;
   static int g;
   static int h;
   static int d;
   static int j;
   static int e;
   static Object[] f = sd.a(new Object[1], 58, (byte)116);
   static int f_i;


   static final void a(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, Object[] var7, Object[] var8, int var9) {
      ++d;
      if(null != var7 && var7.length == 15) {
         sn.a((byte)-90, var9, var0, var3, var4, var2, var1, var8, var7, var6);
      } else {
         vna.a(1, var0, var9, var8, var3, var2, var7, var6, var1, var4);
         if(var5 != 15) {
            c = (Object[])((Object[])c[2]);
         }

      }
   }

   static final long a(byte var0) {
      if(var0 < 52) {
         c = (Object[])null;
      }

      ++e;
      return ija.d.a((int)15);
   }

   static final Object[] a(Object[] var0, ta var1, byte var2) {
      ++g;
      int var4 = -106 % ((-27 - var2) / 56);
      Object[] var3 = (Object[])((Object[])woa.a(5, var0)[1]);
      if(var0[18] == null) {
         var0[18] = lv.a((int)((float[])((float[])var3[1]))[1], (int)((float[])((float[])var3[1]))[0], (int)((float[])((float[])var3[1]))[2], 0, sda.a(var1, (byte)126, var0, 0));
      }

      return (Object[])((Object[])var0[18]);
   }

   static final Object[] a(Object[] var0, byte var1, Object[] var2) {
      ++b;
      if(var1 < 64) {
         var2[2] = (Object)null;
      }

      aa.a(15022, var2, var0);
      return var0;
   }

   static final void a(int var0) {
      ++h;
      if(mra.a != null) {
         vaa.a(mra.a, 2);
      }

      if(null != lg.h) {
         vaa.a(lg.h, 2);
      }

      if(var0 != 18) {
         a((Object[])null, ((float[])((float[])f[1]))[2], (Object[])null, ((byte[])((byte[])f[27]))[2], (Object[])((Object[])f[0]), (Object[])null);
      }

   }

   static final File b(int var0) {
      ++a;
      if(var0 != 18) {
         a(((byte[])((byte[])c[4]))[2]);
      }

      return av.c;
   }

   static final void a(Object[] var0, int var1) {
      if(var1 == '\u8d00') {
         ++f_i;
         if(var0[0] == null) {
            OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8d00', '\u8d41', 0);
         } else {
            oo.a((byte)-114, '\u8d00', (Object[])((Object[])var0[0]));
         }

      }
   }

   static final rl a(Object[] var0, byte var1) {
      if(var1 <= 44) {
         f = (Object[])((Object[])c[5]);
      }

      ++k;
      return new rl(var0);
   }

   static final Object[] a(Object[] var0, float var1, Object[] var2, byte var3, Object[] var4, Object[] var5) {
      ++j;
      return var3 <= 3?new Object[5]:(0.5F > var1?var0:var5);
   }

}
