import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

final class kc {

   static int a;
   static int e;
   static int f;
   static int d;
   static int b;
   static Object[] g = ed.a(7, new Object[1], (byte)-102, 133);
   static long[] c = new long[1000];


   static final float[] a(int var0, float[] var1, Object[] var2) {
      ++d;
      float var3 = ((float[])((float[])var2[0]))[3] - ((float[])((float[])var2[0]))[0];
      float var4 = -((float[])((float[])var2[0]))[4] + ((float[])((float[])var2[0]))[7];
      float var5 = -((float[])((float[])var2[0]))[8] + ((float[])((float[])var2[0]))[11];
      double var6 = Math.sqrt((double)(var5 * var5 + var4 * var4 + var3 * var3));
      var1[3] = (float)((double)(-((float[])((float[])var2[0]))[12] + ((float[])((float[])var2[var0]))[15]) / var6);
      var1[0] = (float)((double)var3 / var6);
      var1[1] = (float)((double)var4 / var6);
      var1[2] = (float)((double)var5 / var6);
      return var1;
   }

   static final void a(File var0, byte[] var1, int var2, int var3) throws IOException {
      ++b;
      DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(var0)));

      try {
         var4.readFully(var1, 0, var3);
         if(var2 > -124) {
            a(-82, (float[])null, (Object[])null);
         }
      } catch (EOFException var6) {
         ;
      }

      var4.close();
   }

   static final void b(int var0, Object[] var1) {
      if(var0 != 133) {
         ((boolean[])((boolean[])g[3]))[3] = false;
      }

      ++e;
      if(null != var1[4]) {
         for(int var2 = 0; ~var2 > ~((Object[])((Object[])var1[4])).length; ++var2) {
            ((Object[][])((Object[][])var1[4]))[var2] = null;
         }

         if(var1 != null && -21 == ~var1.length) {
            ((int[])((int[])dja.f[0]))[15] = 17;
         }
      }

   }

   static final void a(byte var0, Object[] var1, int var2) {
      ++f;
      synchronized(var1) {
         lm var4 = new lm();
         var4.e = (long)var2;
         client.a(-37, (Object[])((Object[])var1[80]), var4);
      }

      if(var0 != -123) {
         a((byte)45, (Object[])null, ((int[])((int[])var1[2]))[32]);
      }

   }

   static final boolean a(int var0, Object[] var1) {
      ++a;
      return var0 != -29946?false:2 == ((byte[])((byte[])var1[4]))[0] || 3 == ((byte[])((byte[])var1[4]))[0];
   }

}
