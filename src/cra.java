
final class cra extends lm {

   static int f_l;
   static int m = 0;
   Object[] k;
   static int n;
   static short[] j = new short[]{(short)4, (short)23, (short)20, (short)15, (short)49, (short)57, (short)53, (short)60};


   static final int a(char var0, byte var1) {
      ++f_l;
      if(0 <= var0 && var0 < qh.f.length) {
         return qh.f[var0];
      } else {
         int var2 = 25 / ((var1 + 26) / 55);
         return -1;
      }
   }

   static final void a(boolean var0, Object[] var1, float var2, Object[] var3) {
      ++n;
      if(var1 != null && var1.length == 16) {
         mh.a(var3, var1, false, var2);
      } else {
         if(var0) {
            a('\uffb4', (byte)120);
         }

         if(var1 != null && var1.length == 12) {
            kt.a(119, var2, var1, var3);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   cra(Object[] var1) {
      this.k = var1;
   }

}
