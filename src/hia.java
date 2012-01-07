
final class hia {

   static int b;
   static int f;
   static Object[] e = st.a(new Object[1], 7, 12, 2);
   static Object[] a = ed.a(2, new Object[1], (byte)-109, 44);
   static int d;
   static int c;


   static final void a(Object[] var0, byte var1) {
      ++c;
      if(null == var0[4]) {
         var0[4] = new boolean[1];
      }

      if(var0[0] == null) {
         var0[0] = new long[2];
      }

      if(var1 >= 92) {
         if(null == var0[1]) {
            var0[1] = new int[2];
         }

      }
   }

   static final Object[] a(byte var0, Object[] var1) {
      if(var0 <= 0) {
         return (Object[])null;
      } else {
         ++f;
         jra.a(var1, true);
         ((int[])((int[])var1[1]))[0] = -1;
         ((int[])((int[])var1[1]))[1] = -1;
         ((int[])((int[])var1[1]))[3] = 0;
         ((int[])((int[])var1[1]))[2] = -1;
         return var1;
      }
   }

   static final tha b(byte var0, Object[] var1) {
      if(var0 != 127) {
         return (tha)e[0];
      } else {
         ++b;
         tha var2 = ((tha)var1[0]).s;
         if(var1[0] != var2) {
            var2.a(8192);
            return var2;
         } else {
            return null;
         }
      }
   }

   static final boolean a(Object[] var0, int var1) {
      ++d;
      return var1 != 1429?((boolean[])((boolean[])e[8]))[5]:false;
   }

}
