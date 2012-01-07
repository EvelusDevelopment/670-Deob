
final class jsa {

   static int d;
   static long c = -1L;
   static int e = 1400;
   static int b;
   static int a;


   static final void a(byte var0, int[] var1, Object[] var2, int var3, int var4) {
      int var5 = 106 % ((var0 + 64) / 37);
      synchronized(var2) {
         if(((tf)var2[12]).a()) {
            if(null != var2 && var2.length == 1 && var2[0].equals(Integer.valueOf(2))) {
               uka.a(93, 117, -65, new Object[0][]);
            }

            int var7 = ((int[])((int[])var2[1]))[2] * ((tf)var2[12]).b / mc.a;

            do {
               long var8 = (long)var7 * (long)var4 + ((long[])((long[])var2[18]))[0];
               if(0L <= ((long[])((long[])var2[18]))[1] - var8) {
                  ((long[])((long[])var2[18]))[0] = var8;
                  break;
               }

               int var10 = (int)((-1L + (long)var7 + ((long[])((long[])var2[18]))[1] + -((long[])((long[])var2[18]))[0]) / (long)var7);
               ((long[])((long[])var2[18]))[0] += (long)var7 * (long)var10;
               fsa.a((Object[])((Object[])var2[4]), var1, var3, true, var10);
               ka.a(12, var2);
               var4 -= var10;
               var3 += var10;
            } while(((tf)var2[12]).a());
         }

         fsa.a((Object[])((Object[])var2[4]), var1, var3, true, var4);
      }

      ++a;
   }

   static final void a(int var0, Object[] var1) {
      if(var0 != -1) {
         a(-36, (Object[])null);
      }

      var1[4] = null;
      var1[2] = null;
      ++d;
      var1[0] = null;
      var1[1] = null;
      var1[3] = null;
   }

}
