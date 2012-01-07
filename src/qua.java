
final class qua {

   private Object[] e;
   static int d;
   static int a;
   static int c;
   static int b;


   protected final void finalize() throws Throwable {
      ++b;
      as.a(this.e, 1);
   }

   static final ja a(boolean var0, int var1, Object[] var2, Object[] var3, aea[] var4) {
      ++d;
      if(var1 != 3) {
         ((long[])((long[])((Object[])((Object[])var2[0]))[0]))[11] = 8L;
      }

      Object[] var5;
      return (ja)((var5 = qr.a(new Object[5], var3, var2, var4, var0)) != null?var5[3]:null);
   }

   static final ri a(int var0, Object[] var1) {
      ++c;
      int var2 = 49 / ((-40 - var0) / 50);
      return new ri(var1);
   }

   qua(Object[] var1) {
      this.e = var1;
   }

   final void a(int var1) throws Throwable {
      super.finalize();
      if(var1 != 3) {
         ((int[])((int[])this.e[11]))[2] = ((int[])((int[])((Object[])((Object[])this.e[3]))[11]))[13];
      }

      ++a;
   }

}
