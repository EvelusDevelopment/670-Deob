
final class vn {

   static boolean e = false;
   static int a;
   static int b;
   static Object[] d = nla.a(57, new Object[0], 8);
   static int[] c = new int[]{16, 32, 64, 128};


   static final int a(Object[] var0, int var1, int var2) {
      ++a;
      if(!ev.a((int)4120, var0)) {
         return -1;
      } else {
         int var3 = pe.a((Object[])((Object[])((Object[])((Object[])var0[var1]))[4]), false, var2);
         return !sda.a(var3, var0, 75)?-1:var3;
      }
   }

   static final int a(boolean var0, Object[] var1, lm[] var2) {
      ++b;
      if(var1 != null && var1.length == 32 && var1[15].equals(Integer.valueOf(2))) {
         mla.b((Object[])null, (byte)123);
      }

      int var3 = 0;

      for(int var4 = 0; var4 < ((int[])((int[])var1[1]))[1]; ++var4) {
         if(var1 != null && var1.length == 16) {
            qt.a(0, (Object[])null);
         }

         lm var5 = ((lm[])((lm[])var1[4]))[var4];

         for(lm var6 = var5.f; var6 != var5; var6 = var6.f) {
            var2[var3++] = var6;
         }
      }

      if(var0) {
         ((int[])((int[])d[0]))[2] = 22;
      }

      return var3;
   }

}
