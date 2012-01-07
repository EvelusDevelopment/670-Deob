
final class sp {

   static Object[] f = ed.a(0, new Object[1], (byte)-118, 45);
   static int g;
   static Object[] a = kna.a(new Object[2], 89, 0, -1);
   static boolean d = false;
   static Object[] b = rca.a((byte)61);
   static String[] c;
   static Object[] e = sd.a(new Object[1], 29, (byte)117);


   static final void a(Object[] var0, boolean var1) {
      ++g;
      if(null != var0[3]) {
         for(int var2 = 0; var2 < ((int[])((int[])var0[3])).length; var2 += 2) {
            if(((int[])((int[])var0[1]))[15] <= ((int[])((int[])var0[3]))[var2]) {
               if(((int[])((int[])var0[3]))[var2] > ((int[])((int[])var0[1]))[27]) {
                  ((int[])((int[])var0[1]))[27] = ((int[])((int[])var0[3]))[var2];
               }
            } else {
               ((int[])((int[])var0[1]))[15] = ((int[])((int[])var0[3]))[var2];
            }

            if(~((int[])((int[])var0[1]))[16] < ~((int[])((int[])var0[3]))[1 + var2]) {
               ((int[])((int[])var0[1]))[16] = ((int[])((int[])var0[3]))[1 + var2];
            } else if(((int[])((int[])var0[3]))[1 + var2] > ((int[])((int[])var0[1]))[12]) {
               ((int[])((int[])var0[1]))[12] = ((int[])((int[])var0[3]))[var2 + 1];
            }
         }

         if(var0 != null && -19 == ~var0.length) {
            gq.a(new Object[19][], 29, (Object[])null);
         }
      }

      if(var1) {
         e = (Object[])null;
      }

   }

}
