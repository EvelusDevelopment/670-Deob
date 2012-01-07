
final class rm {

   static int d;
   static int c;
   static int b;
   static int e;
   Object[] a;


   protected final void finalize() throws Throwable {
      ++d;
      hca.a(this.a, (byte)-84);
   }

   rm(Object[] var1) {
      this.a = var1;
   }

   final void a(boolean var1) throws Throwable {
      ++e;
      super.finalize();
      if(var1) {
         a((Object[])null, ((int[])((int[])this.a[2]))[3], (Object[])null);
      }

   }

   static final void a(Object[] var0, int var1) {
      if(var0[var1] == null) {
         var0[3] = new boolean[2];
      }

      ++b;
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2) {
      aa.a(15022, var2, var0);
      ++c;
      if(var1 != 3) {
         a((Object[])null, ((int[])((int[])var2[0]))[6]);
      }

      return var0;
   }

}
