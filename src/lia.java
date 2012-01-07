
final class lia {

   static int c;
   static int d;
   static int b;
   static Object[] a = vra.a(536870911, 11, "", new Object[1]);


   static final void a(Object[] var0, boolean var1) {
      if(et.a) {
         if(var1) {
            wha.a(var0, ar.b[ar.b.length - 1], (byte)-122);
         } else {
            int var2 = ioa.a(((int[])((int[])var0[12]))[1]);
            ta var3 = mpa.b;
            int var4;
            int var5;
            int var6;
            if(null != var0 && -17 == ~var0.length && -4 == ~((byte[])((byte[])var0[10])).length) {
               var4 = rsa.a(var0, (byte)-78);
            } else if(var0 != null && 43 == var0.length) {
               var4 = dma.a((int)13, var0);
            } else if(var0 != null && var0.length == 20 && ((int[])((int[])var0[12])).length == 3 && var0[14].equals(Integer.valueOf(0))) {
               Object[] var7 = (Object[])((Object[])var0[17]);
               var6 = ((int[])((int[])var7[1]))[0];
               var4 = var6;
            } else if(var0 != null && var0.length == 20 && ((int[])((int[])var0[12])).length == 7) {
               var4 = tga.a((byte)-120, var0);
            } else if(var0 != null && var0.length == 16 && ((byte[])((byte[])var0[10])).length == 2) {
               var5 = ((int[])((int[])var0[12]))[3];
               var4 = var5;
            } else if(var0 != null && 22 == var0.length) {
               var4 = lf.a(var0, (byte)-8);
            } else if(var0 != null && var0.length == 18) {
               var4 = wda.a(var0, (byte)-74);
            } else if(null != var0 && var0.length == 23) {
               var5 = null == var0[18]?0:((ka)var0[18]).ra();
               var4 = var5;
            } else if(null != var0 && var0.length == 17) {
               var4 = lp.a(16, var0);
            } else if(var0 != null && var0.length == 24) {
               var4 = fja.b(8, var0);
            } else if(null != var0 && var0.length == 20 && 4 == ((byte[])((byte[])var0[10])).length) {
               var5 = var0[19] == null?0:((ka)var0[19]).ra();
               var4 = var5;
            } else {
               if(null == var0 || var0.length != 20 || -8 != ~((boolean[])((boolean[])var0[8])).length) {
                  throw new IllegalStateException();
               }

               var4 = ita.a(var0, (int)19);
            }

            var3.c((float)var4, 0.0F, (float)((int[])((int[])var0[12]))[0], pga.h);
            var5 = (int)pga.h[0];
            var6 = ioa.a(((int[])((int[])var0[12]))[1] - var5);
            int var8 = ioa.a(((int[])((int[])var0[12]))[1] + var5);
            if(var6 == var8) {
               wha.a(var0, ar.b[var2], (byte)-122);
            } else if(var8 - var6 == 1) {
               wha.a(var0, ar.b[ofa.a + var6], (byte)-122);
            } else {
               wha.a(var0, ar.b[ar.b.length - 1], (byte)-122);
            }
         }
      } else {
         lra.a(var0, gfa.e);
      }

   }

   static final void a(boolean var0, int var1, Object[] var2) {
      el.a(7681, 30862, 8448, (Object[])((Object[])var2[0]));
      ++d;
      int var3 = -5 % ((var1 - 23) / 32);
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, Object[] var3) {
      if(var0 != 12) {
         return (Object[])null;
      } else {
         ++b;
         return ya.a(var3, var2, new Object[12], var1, 25192);
      }
   }

   static final int a(int var0, String var1, int var2) {
      if(var0 < 87) {
         a(new Object[0], ((boolean[])((boolean[])((Object[])((Object[])a[22]))[6]))[6]);
      }

      ++c;
      return bi.a(var2, -49, var1, true);
   }

}
