
final class hm {

   static int c;
   static int b;
   static int a = 0;


   static final void a(Object[] var0, boolean var1, byte var2, int var3) {
      ++b;
      int var4 = var3 * 2;
      var2 = (byte)(((var2 & 255) >> 1) + 127);
      ((byte[])((byte[])var0[5]))[var4++] = var2;
      ((byte[])((byte[])var0[5]))[var4] = var2;
      if(var1) {
         a = ((int[])((int[])var0[23]))[17];
      }

   }

   static final void a(byte var0, Object[] var1) {
      if(var0 <= -46) {
         ((int[])((int[])var1[1]))[0] = -1;
         ++c;
      }
   }

}
