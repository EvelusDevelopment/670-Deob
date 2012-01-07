import java.io.IOException;
import java.net.Socket;

final class jca extends lm {

   static Object[] s;
   static int m;
   static int q;
   static int p;
   static int k;
   static int n;
   static long[] r = new long[10];
   static int f_l;
   static int j;
   static int o;


   static final lm b(byte var0, Object[] var1) {
      int var2 = 104 % ((var0 + 52) / 59);
      ++q;
      lm var3 = ((lm)var1[0]).f;
      if(var1[0] != var3) {
         var3.a((byte)20);
         return var3;
      } else {
         return null;
      }
   }

   jca(Object[] var1) {}

   static final void b(byte var0) {
      ++o;
      int var1 = 0;

      for(int var2 = 0; rp.c > var2; ++var2) {
         for(int var3 = 0; var3 < wpa.a; ++var3) {
            if(lg.a(3, var2, var3, true, ju.g, var1)) {
               ++var1;
            }

            if(var1 >= 512) {
               return;
            }
         }
      }

      if(var0 > -64) {
         b((byte)17, (Object[])null);
      }

   }

   static final void a(byte var0, float var1, float var2, float var3, Object[] var4, float var5) {
      ++k;
      float var6 = (float)Math.cos((double)var5);
      float var7 = (float)Math.sin((double)var5);
      ((float[])((float[])var4[0]))[3] = var6 + var3 * var3 * (-var6 + 1.0F);
      ((float[])((float[])var4[0]))[4] = (-var6 + 1.0F) * var2 * var2 + var6;
      ((float[])((float[])var4[0]))[5] = (1.0F - var6) * var1 * var3 + var2 * var7;
      ((float[])((float[])var4[0]))[6] = var7 * var3 + var2 * var1 * (1.0F - var6);
      ((float[])((float[])var4[0]))[8] = 0.0F;
      ((float[])((float[])var4[0]))[7] = 0.0F;
      ((float[])((float[])var4[0]))[11] = var2 * var3 * (-var6 + 1.0F) + -var1 * var7;
      ((float[])((float[])var4[0]))[2] = var2 * var3 * (-var6 + 1.0F) + var7 * var1;
      ((float[])((float[])var4[0]))[0] = var3 * var1 * (-var6 + 1.0F) + -var2 * var7;
      ((float[])((float[])var4[0]))[10] = (-var6 + 1.0F) * var1 * var1 + var6;
      ((float[])((float[])var4[0]))[1] = 0.0F;
      ((float[])((float[])var4[0]))[9] = -var3 * var7 + (1.0F - var6) * var2 * var1;
      if(var0 >= -75) {
         ((Object[])((Object[])var4[4]))[20] = (Object)null;
      }

   }

   static final void a(Object[] var0, int var1) {
      ++p;
      var0[0] = new lm();
      if(var1 <= 56) {
         a((byte)35, (Object[])((Object[])var0[11]));
      }

   }

   static final void a(byte var0, Object[] var1) {
      try {
         ((Socket)var1[3]).close();
      } catch (IOException var8) {
         ;
      }

      ++j;
      coa.b((Object[])((Object[])var1[2]), 3);
      Object[] var2 = (Object[])((Object[])var1[1]);
      int var3 = -49 % ((var0 - 43) / 34);
      synchronized(var2 == null?null:var2[0]) {
         if(null == var2[3]) {
            var2[3] = new IOException("");
         }

         var2[0].notifyAll();
      }

      try {
         ((Thread)var2[5]).join();
      } catch (InterruptedException var7) {
         ;
      }

   }

}
