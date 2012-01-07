import java.awt.Canvas;

final class ru {

   static int a;
   static Object[] e = vra.a(536870911, 25, "", new Object[1]);
   static int b = 0;
   static int c = 1338;
   static Canvas d;


   static final Object[] a(qta var0, Object[] var1, int var2, Object[] var3) {
      if(null == var1[1]) {
         var1[1] = new int[3];
      }

      ++a;
      oq.a(12523, var1);
      var1[0] = kb.b(false, var1);
      var1[2] = var0.f;
      ((int[])((int[])var1[1]))[1] = var0.e.length;
      var1[5] = vla.a(((int[])((int[])var1[1]))[1], new Object[2], (byte)-124);

      int var4;
      for(var4 = 0; ~var4 > ~((int[])((int[])var1[1]))[1]; ++var4) {
         cc.a((String)var0.e[var4][6], var4, (Object[])((Object[])var1[5]), var2 ^ -2007, tk.a(var1, var0.e[var4], 0));
      }

      ((int[])((int[])var1[1]))[0] = var0.c.length;
      if(null != var3 && var3.length == 10 && var3[8].equals(Integer.valueOf(1))) {
         tk.a((Object[])null, (Object[])null, var2 ^ 1966);
      }

      var1[4] = vla.a(((int[])((int[])var1[1]))[0], new Object[2], (byte)-117);

      for(var4 = 0; ((int[])((int[])var1[1]))[0] > var4; ++var4) {
         cc.a((String)var0.c[var4][6], var4, (Object[])((Object[])var1[4]), -122, tk.a(var1, var0.c[var4], 0));
      }

      var1[3] = new Object[var0.h.length][];
      var4 = 0;
      if(var2 != 1966) {
         return (Object[])null;
      } else {
         while(var0.h.length > var4) {
            ((Object[][])((Object[][])var1[3]))[var4] = aoa.a(var3, 16, var1, var0.h[var4]);
            ++var4;
         }

         return var1;
      }
   }

}
