
final class ofa {

   static Object[][] e;
   static volatile boolean c = true;
   static int f;
   static int b = 0;
   static int a = 1;
   static int d;


   static final void a(int var0, Object[] var1) {
      ++f;
      synchronized(var1[2]) {
         lga.b(0, (Object[])((Object[])var1[2]));
      }

      synchronized(var1[0]) {
         if(var0 >= -32) {
            a(((int[])((int[])var1[1]))[0], (Object[])null);
         }

         lga.b(0, (Object[])((Object[])var1[0]));
      }
   }

   static final oq a(boolean var0, Object[] var1) {
      if(var0) {
         ((long[])((long[])var1[15]))[1] = 64L;
      }

      ++d;
      return new oq(var1);
   }

}
