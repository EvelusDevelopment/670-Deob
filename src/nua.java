import jaggl.OpenGL;
import java.util.Hashtable;

final class nua {

   static Object[] g = ho.a(8, 13, new Object[1], true);
   static Hashtable d = new Hashtable();
   static int b;
   static int e = 0;
   static int a;
   static int f;
   static int h = 0;
   static int c;


   static final void a(int var0, boolean var1, Object[] var2, Object[] var3) {
      ++c;
      moa.a((byte)95, var3, (Object[])((Object[])var2[0]));
      if(var1) {
         ((boolean[])((boolean[])var3[0]))[2] = ((boolean[])((boolean[])var2[3]))[2];
      }

      za.a(var0, -20929, (Object[])((Object[])var2[0]));
   }

   static final int a(int var0, Object[] var1) {
      ++b;
      if(null != var1 && -9 == ~var1.length) {
         return ad.a(var1, 1);
      } else {
         if(var0 != 5828) {
            d = (Hashtable)null;
         }

         if(var1 != null && var1.length == 6) {
            byte var2 = 0;
            ((OpenGL)var1[3]).swapBuffers(((long[])((long[])var1[4]))[0]);
            return var2;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(Object[] var0, int var1, int var2) {
      byte[] var10000 = (byte[])((byte[])var0[2]);
      int[] var10001 = (int[])((int[])var0[var1]);
      int var10004 = ((int[])((int[])var0[var1]))[0];
      var10001[0] = ((int[])((int[])var0[var1]))[0] + 1;
      var10000[var10004] = (byte)var2;
      ++a;
      var10000 = (byte[])((byte[])var0[2]);
      var10001 = (int[])((int[])var0[1]);
      var10004 = ((int[])((int[])var0[1]))[0];
      var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      var10000[var10004] = (byte)(var2 >> 8);
   }

   static final void a(Object[] var0, long var1, byte var3, Object[] var4, String var5, int var6) {
      synchronized(var0) {
         int var8 = -66 / ((-74 - var3) / 45);
         var0[5] = var4;
         ((int[])((int[])var0[1]))[0] = var6;
         var0[3] = var5;
         ((long[])((long[])var0[6]))[1] = var1;
      }

      ++f;
   }

}
