
final class ll {

   static boolean[] b = new boolean[5];
   static int c;
   static int a;


   static final void a(byte var0) {
      ++a;
      if(var0 <= -24) {
         nq var1;
         nq var2;
         for(Object[] var5 = (var1 = (nq)gm.a(rpa.b, 0)) == null?null:var1.u; null != var5; var5 = (var2 = (nq)dka.a(rpa.b, (byte)92)) != null?var2.u:null) {
            if(((int[])((int[])var5[1]))[0] > 1) {
               ((int[])((int[])var5[1]))[0] = 0;
               ni var4;
               il.a(((long[])((long[])(null == (var4 = (ni)((tha)((Object[])((Object[])var5[0]))[0]).s)?null:var4.t)[2]))[0], null == var5?null:var5[2], true, dla.c);
               bba.a((Object[])((Object[])var5[0]), -19425);
            }
         }

         fka.c = 0;
         nma.h = 0;
         nb.b(ssa.d, 0);
         ona.a(ov.a, 108);
         bba.a(rpa.b, -19425);
         tja.b(109, taa.b);
      }
   }

   static final String a(int var0, int var1, boolean var2, byte var3) {
      ++c;
      if(2 <= var0 && var0 <= 36) {
         if(var2 && 0 <= var1) {
            int var4 = 2;

            for(int var5 = var1 / var0; var5 != 0; ++var4) {
               var5 /= var0;
            }

            if(var3 != -94) {
               b = (boolean[])null;
            }

            char[] var6 = new char[var4];
            var6[0] = 43;

            for(int var7 = var4 - 1; 0 < var7; --var7) {
               int var8 = var1;
               var1 /= var0;
               int var9 = -(var0 * var1) + var8;
               if(10 <= var9) {
                  var6[var7] = (char)(87 + var9);
               } else {
                  var6[var7] = (char)(48 + var9);
               }
            }

            return new String(var6);
         } else {
            return Integer.toString(var1, var0);
         }
      } else {
         throw new IllegalArgumentException("" + var0);
      }
   }

}
