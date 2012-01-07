
final class ie {

   static int c;
   static int d;
   static int a;
   static Object[] e = ab.a(new Object[2], (byte)-37);
   static byte[] b;


   static final void a(boolean var0, Object[] var1) {
      if(!var0) {
         if(null == var1[1]) {
            var1[1] = new int[1];
         }

         ++d;
      }
   }

   static final void a(int var0, int var1, Object[] var2, boolean var3, boolean var4, ta var5, Object[] var6, int var7) {
      ++a;
      if(!var3) {
         throw new IllegalStateException();
      }
   }

   static final void a(Object[] var0, int var1) {
      ++c;
      if(var1 != 23247) {
         b = (byte[])null;
      }

      var0[2] = null;
      Object[] var3 = jr.d;
      synchronized(jr.d) {
         if(200 > af.D) {
            gt.a(jr.d, -123, (nj)(var0 != null?var0[0]:null));
            ++af.D;
         }

      }
   }

}
