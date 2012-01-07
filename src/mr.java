import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

final class mr {

   static int a;
   static int f_i;
   static int e = 0;
   static int g;
   static boolean f = true;
   static int d;
   static int c;
   static int b;
   static int h;


   static final void a(int var0, Object[] var1, int var2, byte[] var3, int var4) throws IOException {
      ++b;
      if(var2 == 19444) {
         if(((long[])((long[])var1[1]))[0] < (long)var4 + ((long[])((long[])var1[1]))[1]) {
            ((RandomAccessFile)var1[2]).seek(((long[])((long[])var1[1]))[0]);
            ((RandomAccessFile)var1[2]).write(1);
            throw new EOFException();
         } else {
            ((RandomAccessFile)var1[2]).write(var3, var0, var4);
            ((long[])((long[])var1[1]))[1] += (long)var4;
         }
      }
   }

   static final Object[] a(Object[] var0, int var1) {
      ++d;
      if(var1 != 0) {
         a(95, 88, new Object[19]);
      }

      return (Object[])((Object[])var0[33]);
   }

   static final void a(Object[] var0, boolean var1, int var2) {
      ((boolean[])((boolean[])var0[8]))[3] = var1;
      ++g;
      nha.a((Object[])((Object[])var0[0]), 18806, var2);
      moa.a((byte)122, (Object[])((Object[])var0[5]), (Object[])((Object[])var0[0]));
      el.a(7681, 30862, '\u8575', (Object[])((Object[])var0[0]));
      af.a(768, (Object[])((Object[])var0[0]), var2 ^ 30578, '\u8576', 0);
      af.a(770, (Object[])((Object[])var0[0]), 30579, 5890, 2);
      db.a(770, (Object[])((Object[])var0[0]), (byte)-68, 0, '\u8578');
      nha.a((Object[])((Object[])var0[0]), 18806, 0);
      tba.a(var0, (byte)-43);
   }

   static final void a(int var0, Object[] var1) {
      ((float[])((float[])var1[0]))[2] = 0.0F;
      ((float[])((float[])var1[0]))[0] = 0.0F;
      ((float[])((float[])var1[0]))[1] = (float)var0;
      ++h;
      ((float[])((float[])var1[0]))[3] = 0.0F;
   }

   static final void a(Object[] var0, byte var1) {
      fua.a(-73, (Object[])((Object[])var0[2]), 5);
      int var2 = -125 / ((var1 - 31) / 62);
      ++a;
   }

   static final Object[] a(int var0, int var1, Object[] var2) {
      if(var2[0] == null) {
         var2[0] = new int[1];
      }

      ++c;
      ((int[])((int[])var2[0]))[var1] = var0;
      return var2;
   }

}
