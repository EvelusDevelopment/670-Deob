import java.io.IOException;
import java.util.Date;

final class qs {

   static int f_i;
   static int a;
   static int g = -1;
   static int d;
   static int f;
   static Object[][] c;
   static int e;
   static Object[] h;
   static int b;


   static final void a(Object[] var0, Object[] var1, byte var2) {
      sea.a(var0, (Object[])((Object[])var1[45]), (byte)114);
      ++f;
      mra.b(13, var1);
      si.a(var1, 7379);
      if(var2 != -1) {
         h = (Object[])null;
      }

   }

   static final void a(Object[] var0, int var1) throws IOException {
      ++f_i;
      if(-1L != ((long[])((long[])var0[4]))[5]) {
         if(((long[])((long[])var0[4]))[0] != ((long[])((long[])var0[4]))[5]) {
            dm.a(((long[])((long[])var0[4]))[5], 1, (Object[])((Object[])var0[2]));
            ((long[])((long[])var0[4]))[0] = ((long[])((long[])var0[4]))[5];
         }

         mr.a(0, (Object[])((Object[])var0[2]), var1 + 19434, (byte[])((byte[])var0[3]), ((int[])((int[])var0[1]))[0]);
         ((long[])((long[])var0[4]))[0] += (long)((int[])((int[])var0[1]))[0];
         if(null != var0 && var0.length == 1) {
            return;
         }

         if(((long[])((long[])var0[4]))[0] > ((long[])((long[])var0[4]))[2]) {
            ((long[])((long[])var0[4]))[2] = ((long[])((long[])var0[4]))[0];
         }

         long var2 = -1L;
         if(((long[])((long[])var0[4]))[1] <= ((long[])((long[])var0[4]))[5] && ((long[])((long[])var0[4]))[5] < ((long[])((long[])var0[4]))[1] + (long)((int[])((int[])var0[1]))[1]) {
            var2 = ((long[])((long[])var0[4]))[5];
         } else if(~((long[])((long[])var0[4]))[5] >= ~((long[])((long[])var0[4]))[1] && ~((long[])((long[])var0[4]))[1] > ~(((long[])((long[])var0[4]))[5] + (long)((int[])((int[])var0[1]))[0])) {
            var2 = ((long[])((long[])var0[4]))[1];
         }

         long var4 = -1L;
         if((long)((int[])((int[])var0[1]))[0] + ((long[])((long[])var0[4]))[5] > ((long[])((long[])var0[4]))[1] && ~(((long[])((long[])var0[4]))[1] - -((long)((int[])((int[])var0[1]))[1])) <= ~(((long[])((long[])var0[4]))[5] + (long)((int[])((int[])var0[1]))[0])) {
            var4 = (long)((int[])((int[])var0[1]))[0] + ((long[])((long[])var0[4]))[5];
         } else if((long)((int[])((int[])var0[1]))[1] + ((long[])((long[])var0[4]))[1] > ((long[])((long[])var0[4]))[5] && ((long[])((long[])var0[4]))[1] + (long)((int[])((int[])var0[1]))[1] <= (long)((int[])((int[])var0[1]))[0] + ((long[])((long[])var0[4]))[5]) {
            var4 = ((long[])((long[])var0[4]))[1] - -((long)((int[])((int[])var0[1]))[1]);
         }

         if(0L > ~var2 && ~var4 < ~var2) {
            int var6 = (int)(-var2 + var4);
            System.arraycopy(var0[3], (int)(var2 + -((long[])((long[])var0[4]))[5]), var0[0], (int)(-((long[])((long[])var0[4]))[1] + var2), var6);
         }

         ((long[])((long[])var0[4]))[5] = -1L;
         ((int[])((int[])var0[1]))[0] = 0;
      }

      if(var1 != 10) {
         g = -27;
      }

   }

   static final void a(byte var0, String var1) {
      int var2 = 32 / ((var0 - 71) / 42);
      ++a;
      if(ov.b == null) {
         pc.a(-110);
      }

      hp.e.setTime(new Date(he.a(-81)));
      int var3 = hp.e.get(11);
      int var4 = hp.e.get(12);
      int var5 = hp.e.get(13);
      String var6 = Integer.toString(var3 / 10) + var3 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10;
      String[] var7 = ul.a(0, var1, '\n');

      for(int var8 = 0; var8 < var7.length; ++var8) {
         for(int var9 = gka.d; var9 > 0; --var9) {
            ov.b[var9] = ov.b[var9 - 1];
         }

         ov.b[0] = var6 + ": " + var7[var8];
         if(null != tl.f) {
            try {
               tl.f.write(jta.a(ov.b[0] + "\n", (int)57));
            } catch (IOException var10) {
               ;
            }
         }

         if(~gka.d > ~(ov.b.length - 1)) {
            ++gka.d;
            if(0 < jr.b) {
               ++jr.b;
            }
         }
      }

   }

   static final void a(Object[] var0, byte var1) {
      ++e;
      if(null == var0[1]) {
         var0[1] = new float[3];
      }

      if(var1 > -100) {
         g = 124;
      }

   }

   static final void a(Object[] var0, int var1, int var2, int var3) {
      synchronized(var0) {
         Object[] var7 = ps.a((byte)-70, var1, new Object[2]);
         ((lm)(var7 != null?var7[0]:null)).e = (long)var3;
         client.a(113, (Object[])((Object[])var0[var2]), (lm)(null != var7?var7[0]:null));
      }

      ++d;
   }

   static final void a(long var0, int var2) {
      ++b;
      if(var2 > 11) {
         if(-1L > ~var0) {
            if(var0 % 10L == 0L) {
               cj.a(-1L + var0, -119);
               cj.a(1L, 66);
            } else {
               cj.a(var0, 101);
            }

         }
      }
   }

}
