
final class foa {

   static int d;
   static int e;
   static int b;
   static int c = 0;
   static int a;


   static final void a(byte var0, Object[] var1) {
      ++a;
      if(var0 > -32) {
         a((byte)-43, (Object[])null);
      }

      synchronized(var1) {
         ((boolean[])((boolean[])var1[3]))[1] = true;
      }
   }

   static final void a(byte var0, int var1, int var2) {
      if(var0 == -97) {
         ++b;
         int var3;
         if(var2 != fo.b) {
            wra.d = new int[var2];

            for(var3 = 0; var2 > var3; ++var3) {
               wra.d[var3] = (var3 << 12) / var2;
            }

            Class_is.a = 32 * var2;
            td.q = -1 + var2;
            fo.b = var2;
         }

         if(var1 != cka.d) {
            if(fo.b != var1) {
               bv.b = new int[var1];

               for(var3 = 0; var1 > var3; ++var3) {
                  bv.b[var3] = (var3 << 12) / var1;
               }
            } else {
               bv.b = wra.d;
            }

            wq.e = var1 - 1;
            cka.d = var1;
         }

      }
   }

   static final boolean a(Object[] var0, byte var1) {
      ++e;
      return var1 < 74?true:((boolean[])((boolean[])var0[8]))[7];
   }

}
