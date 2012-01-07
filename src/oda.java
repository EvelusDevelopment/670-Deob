
final class oda {

   static int b;
   static int g;
   static int e;
   static int a;
   static int d;
   static float f = 1.0F;
   static int c;
   static int h = 0;


   static final int a(Object[] var0, int var1) {
      ++g;
      return var1 != 3901?((int[])((int[])var0[31]))[10]:((byte[])((byte[])var0[10]))[3];
   }

   static final Object[] a(boolean var0, Object[] var1, ta var2) {
      ++e;
      if(var1[16] != null) {
         if(var0) {
            return (Object[])((Object[])var1[26]);
         } else {
            Object[] var3 = var2.k();
            lg.a(var3, bra.a(var1, true), -18072);
            cq.a((byte)81, (float)((short[])((short[])var1[13]))[0], 0.0F, (float)((short[])((short[])var1[13]))[1], var3);
            Object[] var4 = bva.a(-116, ((boolean[])((boolean[])var1[8]))[6]);
            ((ka)var1[16]).a(var3, ((lpa[])((lpa[])var1[9]))[0], 0);
            return var4;
         }
      } else {
         return null;
      }
   }

   static final void a(int var0, Object[] var1, byte var2) {
      if(var2 != -37) {
         f = -0.121634535F;
      }

      ((byte[])((byte[])var1[2]))[-var0 + ((int[])((int[])var1[1]))[0] - 1] = (byte)var0;
      ++c;
   }

   static final void a(boolean var0, Object[] var1) throws Throwable {
      ++a;
      Object[] var2 = (Object[])((Object[])var1[0]);
      if(var0) {
         long var3 = (long)((int[])((int[])var1[1]))[0];
         synchronized(var2) {
            lm var6 = new lm();
            var6.e = var3;
            client.a(-27, (Object[])((Object[])var2[50]), var6);
         }

         ((wha)var1[2]).a(124);
      }
   }

   static final Object[] a(boolean var0, Object[] var1, int var2, int var3) {
      if(var1[1] == null) {
         var1[1] = new int[2];
      }

      if(null == var1[2]) {
         var1[2] = new boolean[1];
      }

      ++d;
      if(var2 >= -35) {
         a(17, (Object[])null, (byte)-111);
      }

      qea.a(var1, (int)0);
      ((boolean[])((boolean[])var1[2]))[0] = var0;
      ((int[])((int[])var1[1]))[1] = var3;
      return var1;
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 != 44) {
         ((long[])((long[])var0[0]))[0] = 55L;
      }

      ++b;
      uf.b(0, qs.c[((int[])((int[])var0[0]))[1]]);
   }

}
