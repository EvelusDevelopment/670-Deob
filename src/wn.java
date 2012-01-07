import java.nio.Buffer;
import java.nio.ByteBuffer;

final class wn {

   static int f;
   static int e;
   static Object[] b = null;
   static int a;
   static Object[] c;
   static int d;


   static final long a(Object[] var0, int var1) {
      if(var1 <= 41) {
         a((byte)36, (Object[])null);
      }

      ++a;
      return ((long[])((long[])var0[9]))[0];
   }

   static final boolean a(byte var0, Object[] var1) {
      int var2 = 85 % ((var0 - 90) / 32);
      ++d;
      return false;
   }

   static final void a(boolean var0, int var1) {
      ih.a(tu.d, (Object[])((Object[])tu.d[2]), 0, -74);
      ++e;
      ih.a(tu.d, (Object[])((Object[])tu.d[14]), 0, -115);
      ih.a(tu.d, (Object[])((Object[])tu.d[11]), 1, -57);
      ih.a(tu.d, (Object[])((Object[])tu.d[7]), 1, -67);
      ih.a(tu.d, (Object[])((Object[])tu.d[36]), 0, -105);
      ih.a(tu.d, (Object[])((Object[])tu.d[38]), 0, -112);
      ih.a(tu.d, (Object[])((Object[])tu.d[3]), 0, -66);
      ih.a(tu.d, (Object[])((Object[])tu.d[29]), 0, -38);
      ih.a(tu.d, (Object[])((Object[])tu.d[41]), 0, -86);
      ih.a(tu.d, (Object[])((Object[])tu.d[10]), 0, -100);
      ih.a(tu.d, (Object[])((Object[])tu.d[13]), 0, -123);
      ih.a(tu.d, (Object[])((Object[])tu.d[24]), 0, -59);
      ih.a(tu.d, (Object[])((Object[])tu.d[6]), 0, -113);
      ih.a(tu.d, (Object[])((Object[])tu.d[25]), 0, -36);
      ih.a(tu.d, (Object[])((Object[])tu.d[16]), 0, -107);
      ih.a(tu.d, (Object[])((Object[])tu.d[37]), 0, -99);
      if(var1 <= 90) {
         a((Object[])null, ((int[])((int[])c[0]))[0]);
      }

      ih.a(tu.d, (Object[])((Object[])tu.d[17]), 0, -106);
      ih.a(tu.d, (Object[])((Object[])tu.d[19]), 0, -75);
      ih.a(tu.d, (Object[])((Object[])tu.d[9]), 0, -54);
      ih.a(tu.d, (Object[])((Object[])tu.d[1]), 0, -39);
      fd.a(109);
      ih.a(tu.d, (Object[])((Object[])tu.d[4]), 2, -78);
      ih.a(tu.d, (Object[])((Object[])tu.d[20]), 1, -97);
      iea.a((byte)39);
      tea.a((byte)-118);
      jea.c = true;
   }

   static final void a(Object[] var0, byte[] var1, int var2) {
      if(var2 == 2) {
         ++f;
         if(null != var0) {
            var0[2] = ByteBuffer.allocateDirect(var1.length);
            ((Buffer)var0[2]).position(0);
            ((ByteBuffer)var0[2]).put(var1);
         } else {
            throw new IllegalStateException();
         }
      }
   }

}
