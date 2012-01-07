
final class iua {

   private Object[] c;
   static int d;
   static int[] e = new int[]{1, -1, -1, 1};
   static int a = 0;
   static int b;


   final void a(boolean var1) throws Throwable {
      if(var1) {
         e = (int[])((int[])this.c[2]);
      }

      super.finalize();
      ++b;
   }

   protected final void finalize() throws Throwable {
      wca.a(this.c, 1);
      ++d;
   }

   iua(Object[] var1) {
      this.c = var1;
   }

}
