
final class sna {

   static int[] c = new int[257];
   static int d;
   static int f;
   static int b;
   static int e;
   static boolean a = true;


   static final boolean a(int var0, int var1, int var2) {
      if(var0 < 99) {
         return true;
      } else {
         ++e;
         return (32 & var2) != 0;
      }
   }

   static final void a(Object[] var0, boolean var1, Object[] var2) {
      ++d;

      while(true) {
         int var3 = fh.a(var2, !var1);
         if(0 == var3) {
            if(null != var0 && (1 == var0.length || var0.length == 5 && var0[3].equals(Integer.valueOf(1)))) {
               cc.a(-39, true);
            }

            if(!var1) {
               f = ((int[])((int[])var0[3]))[9];
            }

            return;
         }

         spa.a(var3, -96, var0, var2);
      }
   }

   static final int[] a(Object[] var0, byte var1, Object[] var2) {
      ++b;
      if(var2 != null && var2.length == 2 && var2[0].equals(Integer.valueOf(0)) && var2[0].equals(Integer.valueOf(1))) {
         ((boolean[])((boolean[])((Object[])((Object[])fr.g[2]))[0]))[1] = true;
      }

      int var3 = fh.a(var2, false);
      if(var3 == 0) {
         return null;
      } else {
         int[] var4 = new int[var3];
         if(var1 <= 93) {
            f = 43;
         }

         for(int var5 = 0; var3 > var5; ++var5) {
            var4[var5] = lr.a(1, var2);
         }

         return var4;
      }
   }

}
