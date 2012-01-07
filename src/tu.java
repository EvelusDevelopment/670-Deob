
final class tu {

   static Object[] d;
   static int b;
   static Object[] c = sd.a(new Object[1], 101, (byte)120);
   static int a;


   static final Object[] a(Object[] var0, byte var1) {
      if(var1 <= 25) {
         return (Object[])null;
      } else {
         if(var0[7] == null) {
            var0[7] = new long[1];
         }

         if(var0[1] == null) {
            var0[1] = new int[3];
         }

         if(null == var0[0]) {
            var0[0] = new byte[1];
         }

         ++a;
         var0[8] = osa.a(0, new Object[2]);
         var0[6] = osa.a(0, new Object[2]);
         var0[5] = osa.a(0, new Object[2]);
         var0[4] = osa.a(0, new Object[2]);
         var0[3] = hi.newByteBufferWrapper(6);
         ((int[])((int[])var0[1]))[0] = 0;
         ((byte[])((byte[])var0[0]))[0] = 0;
         ((int[])((int[])var0[1]))[1] = 0;
         var0[9] = hi.newByteBufferWrapper(10);
         return var0;
      }
   }

   static final int a(Object[] var0, int var1, byte var2) {
      if(var2 != 84) {
         a((Object[])null, 119, (byte)-75);
      }

      ++b;
      return 1;
   }

}
