import java.io.IOException;
import java.io.RandomAccessFile;

final class oca {

   static int e;
   static Object[] b = ho.a(3, 51, new Object[1], true);
   static byte[] d = new byte[520];
   static int g;
   static int f;
   static int c;
   static int a;


   static final long a(boolean var0, Object[] var1) throws IOException {
      if(!var0) {
         return ((long[])((long[])((Object[])((Object[])((Object[])((Object[])b[1]))[0]))[5]))[0];
      } else {
         ++g;
         return ((RandomAccessFile)var1[2]).length();
      }
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2, boolean var3) {
      if(var3) {
         a(-32, (Object[])null, -60, -94, 31, ((int[])((int[])var0[2]))[28]);
      }

      ++a;
      lra.a(var2, 16830, var1, var0);
      return var2;
   }

   static final void a(int var0, Object[] var1, int var2, int var3, int var4, int var5) {
      ((int[])((int[])var1[1]))[0] = var0;
      ++f;
      ((int[])((int[])var1[1]))[3] = var5;
      ((int[])((int[])var1[1]))[4] = var4;
      ((int[])((int[])var1[1]))[var2] = var3;
      ((boolean[])((boolean[])var1[5]))[0] = ((int[])((int[])var1[1]))[0] != 0 || -1 != ~((int[])((int[])var1[1]))[3] || -1 != ~((int[])((int[])var1[1]))[4] || 0 != ((int[])((int[])var1[1]))[2];
   }

   static final void a(int var0, int var1, Object[] var2) {
      int var3 = -8 % ((var0 - 51) / 56);
      byte[] var10000 = (byte[])((byte[])var2[2]);
      int[] var10001 = (int[])((int[])var2[1]);
      int var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)(var1 >> 8);
      ++c;
      var10000 = (byte[])((byte[])var2[2]);
      var10001 = (int[])((int[])var2[1]);
      var10004 = ((int[])((int[])var2[1]))[0];
      var10001[0] = ((int[])((int[])var2[1]))[0] + 1;
      var10000[var10004] = (byte)(var1 + 128);
   }

   static final Object[] a(Object[] var0, byte var1, int var2) {
      if(var1 != 74) {
         ((int[])((int[])b[1]))[10] = ((int[])((int[])((Object[])((Object[])((Object[])((Object[])b[13]))[8]))[2]))[4];
      }

      ++e;
      return uh.a(var2, ((int[])((int[])var0[0]))[1], ((int[])((int[])var0[0]))[0], new Object[1], ((int[])((int[])var0[0]))[2], (byte)86);
   }

}
