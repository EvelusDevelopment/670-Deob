import jaggl.OpenGL;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;

final class ioa {

   static int b;
   static int d;
   static int c;
   static int[] a = new int[1000];


   static final int a(int var0) {
      int var1 = -1;

      for(int var2 = 0; var2 < ofa.a - 1; ++var2) {
         if(var0 < ima.g[var2] + cu.a[var2]) {
            var1 = var2;
            break;
         }
      }

      if(var1 == -1) {
         var1 = ofa.a - 1;
      }

      return var1;
   }

   static final void a(Object[] var0, int var1) {
      oga.q[1] = ((float[])((float[])var0[25]))[10] * ((float[])((float[])var0[25]))[17];
      oga.q[3] = 1.0F;
      ++d;
      oga.q[2] = ((float[])((float[])var0[25]))[15] * ((float[])((float[])var0[25]))[10];
      int var2 = -128 / ((var1 - 65) / 32);
      oga.q[0] = ((float[])((float[])var0[25]))[7] * ((float[])((float[])var0[25]))[10];
      OpenGL.glLightModelfv(2899, oga.q, 0);
   }

   static final Image a(Object[] var0, String var1, byte var2) throws IOException {
      ++b;

      try {
         if(null != var0 && -13 == ~var0.length) {
            return null;
         } else {
            InputStream var3 = wna.class.getResourceAsStream(var1);
            byte[] var4 = new byte[3000];
            int var6 = 0;
            if(var2 != 55) {
               return (Image)null;
            } else {
               int var5;
               while(0 != ~(var5 = var3.read())) {
                  var4[var6++] = (byte)var5;
               }

               Image var7 = Toolkit.getDefaultToolkit().createImage(var4);
               return var7;
            }
         }
      } catch (Exception var9) {
         throw new IOException();
      }
   }

   static final void a(Object[] var0, int var1, int var2) {
      iia.a(2, true, var2, var0);
      ++c;
      if(var1 != -11998) {
         ((boolean[])((boolean[])((Object[])((Object[])var0[8]))[3]))[18] = true;
      }

   }

}
