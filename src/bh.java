
final class bh extends tha {

   Object[] y;
   static int u;
   static int x;
   static Object[] w = sd.a(new Object[1], 39, (byte)115);
   static Object[] A = ed.a(5, new Object[1], (byte)-122, 123);
   static int t;
   static int z;
   static int v;


   static final void a(Object[] var0, Object[] var1, int var2) {
      ++t;
      if(null != var1 && var1.length == 12) {
         ih.a(true, (Object[])null);
      }

      if(var2 != 1) {
         z = ((int[])((int[])var0[0]))[0];
      }

      while(true) {
         int var3 = fh.a(var1, false);
         if(var3 == 0) {
            return;
         }

         if(var3 == 1) {
            ((int[])((int[])var0[0]))[1] = de.a((int)0, var1);
            ((int[])((int[])var0[0]))[2] = fh.a(var1, false);
            ((int[])((int[])var0[0]))[0] = fh.a(var1, false);
         }
      }
   }

   static final int a(Object[] var0, int var1) {
      if(var1 > -43) {
         z = 12;
      }

      ++x;
      return ((int[])((int[])var0[1]))[1];
   }

   static final void b(Object[] var0, byte var1) throws Throwable {
      if(var1 != -117) {
         a((Object[])null, (Object[])((Object[])A[0]), 16);
      }

      ++u;
      if(0L != ((long[])((long[])var0[4]))[0]) {
         el.a((Object[])((Object[])var0[0]), 124, ((long[])((long[])var0[4]))[0]);
         ((long[])((long[])var0[4]))[0] = 0L;
      }

      ((oa)var0[3]).a(var1 + 118);
   }

   static final void a(int var0, Object[] var1) {
      var1[1] = sj.a(128, new Object[3], (byte)-41);
      ++v;
      var1[3] = sj.a(var0, new Object[3], (byte)-81);
   }

   bh(Object[] var1) {
      this.y = var1;
   }

}
