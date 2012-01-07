
final class pg {

   static long c = 0L;
   static int b;
   static int d;
   static int e;
   static int a;


   static final Object[] a(double var0, short[][] var2, Object[] var3, byte var4) {
      if(null == var3[2]) {
         var3[2] = new double[1];
      }

      ++a;
      if(var4 > -79) {
         return new Object[15];
      } else {
         ota var6 = new ota(var3);
         ((double[])((double[])var3[2]))[0] = var0;
         var3[1] = var2;
         var3[0] = var6;
         return var3;
      }
   }

   static final void a(byte var0, Object[] var1) {
      if(null == var1[1]) {
         var1[1] = new int[1];
      }

      ++d;
      if(var0 != -58) {
         c = ((long[])((long[])var1[3]))[10];
      }

   }

   static final int[] a(Object[] var0, int var1, int var2) {
      ++e;
      if(var1 < 83) {
         return (int[])((int[])var0[1]);
      } else {
         int[] var3 = od.a(-1704, var2, (Object[])((Object[])var0[5]));
         if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
            client.a(false, var3, var2, var0);
         }

         return var3;
      }
   }

   static final Object[] a(byte var0, Object[] var1, ta var2) {
      ++b;
      if(null != var1 && 2 == var1.length) {
         return null;
      } else if(var0 < 0) {
         return (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])var1[5]))[16]))[1]);
      } else {
         ka var3 = rta.a(((int[])((int[])var1[12]))[5], var2, var1, (((int[])((int[])var1[12]))[4] != 0?5:0) | 2048, true);
         if(var3 != null) {
            if(-1 != ~((int[])((int[])var1[12]))[4]) {
               var3.O(((int[])((int[])var1[12]))[4] * 2048);
            }

            Object[] var4 = bra.a(var1, true);
            vi.a(var3, -122, var1, var2, var4);
            Object[] var5 = bva.a(-108, false);
            var3.a(var4, ((lpa[])((lpa[])var1[9]))[0], 0);
            if(var1[19] != null) {
               Object[] var6 = ((ch)var1[19]).b();
               var2.c(var6);
            }

            ((boolean[])((boolean[])var1[8]))[5] = var3.XA();
            ((int[])((int[])var1[12]))[6] = var3.pa();
            ((int[])((int[])var1[12]))[3] = var3.ra();
            return var5;
         } else {
            return null;
         }
      }
   }

}
