
final class uh {

   static int a;
   static int h;
   static int b;
   static Object[] f;
   static int e;
   static int c;
   static boolean d = true;
   static Object[] g = iba.a(new Object[4], 16, 0);


   static final void a(Object[] var0, Object[] var1, boolean var2) {
      ++b;
      ((int[])((int[])var1[1]))[1] = lr.a(1, var0);
      if(!var2) {
         a((int[])null, ((boolean[])((boolean[])f[6]))[1], (int[])null, (Object[])((Object[])var1[1]));
      }

      ((int[])((int[])var1[1]))[0] = lr.a(1, var0);
   }

   static final void a(int[] var0, boolean var1, int[] var2, Object[] var3) {
      ++c;
      if(null == var3[23] && null != var2) {
         var3[23] = new int[((int[])((int[])hh.a[0])).length];
      } else if(var2 == null) {
         var3[23] = null;
         return;
      }

      if(var3 == null || 7 != var3.length) {
         if(!var1) {
            g = (Object[])null;
         }

         int var4;
         for(var4 = 0; ~var4 > ~((int[])((int[])var3[23])).length; ++var4) {
            ((int[])((int[])var3[23]))[var4] = -1;
         }

         for(var4 = 0; ~var4 > ~var2.length; ++var4) {
            int var5 = var0[var4];

            for(int var6 = 0; ((int[])((int[])var3[23])).length > var6; ++var6) {
               if(0 != (var5 & 1)) {
                  ((int[])((int[])var3[23]))[var6] = var2[var4];
               }

               var5 >>= 1;
            }
         }

      }
   }

   static final tha a(Object[] var0, long var1, byte var3) {
      if(var3 != 87) {
         a(-41, -123, 104, (Object[])null, -26, (byte)-42);
      }

      ++a;
      tha var4 = (tha)pm.a(var1, (Object[])((Object[])var0[3]), false);
      if(var4 != null) {
         ama.a(var4, (byte)-121, (Object[])((Object[])var0[0]));
      }

      return var4;
   }

   static final void a(Object[] var0, int var1) {
      ++h;
      ((boolean[])((boolean[])var0[8]))[1] = true;
      ((boolean[])((boolean[])var0[8]))[var1] = true;
      ((boolean[])((boolean[])var0[8]))[0] = true;
   }

   static final Object[] a(int var0, int var1, int var2, Object[] var3, int var4, byte var5) {
      ++e;
      if(var5 != 86) {
         return (Object[])((Object[])var3[15]);
      } else {
         poa.c(var3, var5 ^ -20790);
         ((int[])((int[])var3[0]))[3] = var0;
         ((int[])((int[])var3[0]))[1] = var1;
         ((int[])((int[])var3[0]))[2] = var4;
         ((int[])((int[])var3[0]))[0] = var2;
         return var3;
      }
   }

}
