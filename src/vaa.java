
final class vaa {

   static Object[] d = ed.a(10, new Object[1], (byte)-123, 71);
   static int c;
   static Object[] a;
   static int b;
   static int e;


   static final Object[] a(long var0, int var2, short[] var3, short[] var4, Object[] var5, int[] var6) {
      ++b;
      if(var5[2] == null) {
         var5[2] = new long[1];
      }

      var5[0] = var6;
      int var7 = 49 / ((var2 - 22) / 53);
      ((long[])((long[])var5[2]))[0] = var0;
      var5[3] = var4;
      var5[1] = var3;
      return var5;
   }

   static final void a(int var0, Object[] var1) {
      if(var1[var0] == null) {
         var1[1] = new int[2];
      }

      ++c;
   }

   static final void a(Object[] var0, int var1) {
      ++e;
      synchronized(var0) {
         if(nk.h != null) {
            boolean var3 = true;

            for(int var4 = 0; var4 < 2; ++var4) {
               if(((Object[][])((Object[][])nk.h[1]))[var4] == var0) {
                  ((Object[][])((Object[][])nk.h[1]))[var4] = null;
               }

               if(((Object[][])((Object[][])nk.h[1]))[var4] != null) {
                  var3 = false;
               }
            }

            if(var0 != null && -21 == ~var0.length && var0[14].equals(Integer.valueOf(2))) {
               ((int[])((int[])((Object[])((Object[])nk.h[24]))[1]))[0] = 105;
            }

            if(var3) {
               ((boolean[])((boolean[])nk.h[2]))[0] = true;

               while(((boolean[])((boolean[])nk.h[2]))[1]) {
                  qs.a(50L, 66);
               }

               nk.h = null;
            }
         }

         ha.a((byte)-66, var0);
         var0[var1] = null;
         ((boolean[])((boolean[])var0[0]))[1] = true;
      }
   }

}
