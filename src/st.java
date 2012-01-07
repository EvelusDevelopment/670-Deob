
final class st {

   static int a;
   static int b;
   static int c = -60;


   static final Object[] a(Object[] var0, int var1, int var2, int var3) {
      ++a;
      if(var1 != 7) {
         c = -101;
      }

      if(var0[0] == null) {
         var0[0] = new int[2];
      }

      ((int[])((int[])var0[0]))[0] = var2;
      ((int[])((int[])var0[0]))[1] = var3;
      return var0;
   }

   static final int a(boolean var0, Object[] var1) {
      if(var0) {
         return ((int[])((int[])((Object[])((Object[])var1[2]))[0]))[10];
      } else {
         ++b;
         if(null != var1 && -5 == ~var1.length) {
            int var3 = 0;
            if(null != var1 && var1.length == 7 && var1[6].equals(Integer.valueOf(0))) {
               a(false, (Object[])null);
            }

            Object[][] var4 = (Object[][])((Object[][])var1[2]);

            for(int var5 = 0; var4.length > var5; ++var5) {
               Object[] var6 = var4[var5];
               if(null != var6) {
                  boolean var7;
                  if(var6 != null && (7 == var6.length || -10 >= ~var6.length)) {
                     var7 = nha.a(var6, !var0);
                  } else {
                     boolean var8;
                     if(null != var6 && var6.length == 1) {
                        var8 = true;
                        var7 = var8;
                     } else if(null != var6 && (3 == var6.length || var6.length == 8)) {
                        var7 = pu.a(var6, -104);
                     } else if(null != var6 && var6.length == 5) {
                        var7 = iv.b(var6, -7112);
                     } else if(null != var6 && var6.length == 2) {
                        var8 = eia.a((Object[])((Object[])var6[1]), 2);
                        var7 = var8;
                     } else {
                        if(null == var6 || 4 != var6.length) {
                           throw new IllegalStateException();
                        }

                        var7 = hc.a(-121, var6);
                     }
                  }

                  if(!var7) {
                     continue;
                  }
               }

               ++var3;
            }

            int var2 = var3 * 100 / ((Object[])((Object[])var1[2])).length;
            if(null != var1 && 8 == var1.length && var1[7].equals(Integer.valueOf(2)) && var1[7].equals(Integer.valueOf(1))) {
               sv.a(2, true, (Object[])null);
            }

            return var2;
         } else if(null != var1 && var1.length == 15) {
            return vda.a(21, var1);
         } else {
            throw new IllegalStateException();
         }
      }
   }

}
