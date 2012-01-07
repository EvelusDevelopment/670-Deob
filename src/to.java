
final class to {

   static int a = 7;
   static int b = 16777215;
   static int c;
   static int d;


   static final float a(float var0, Object[] var1, byte var2) {
      ++d;
      if(var2 != 6) {
         a(1.9529009F, (Object[])null, (byte)5);
      }

      return var0 / (float)((int[])((int[])var1[1]))[4];
   }

   static final int a(Object[] var0, Object[] var1, int var2) {
      ++c;
      int var3 = ((int[])((int[])var0[1]))[9] + (((int[])((int[])var0[1]))[2] * ((int[])((int[])var0[1]))[8] >> 12);
      var3 += (((int[])((int[])var1[14]))[((int[])((int[])var0[1]))[3]] - 8192) * ((int[])((int[])var1[22]))[((int[])((int[])var0[1]))[3]] >> 12;
      Object[] var4 = (Object[])((Object[])var0[var2]);
      int var5;
      if(((int[])((int[])var4[1]))[6] > 0 && (((int[])((int[])var4[1]))[0] > 0 || -1 > ~((int[])((int[])var1[10]))[((int[])((int[])var0[1]))[3]])) {
         var5 = ((int[])((int[])var4[1]))[0] << 2;
         int var6 = ((int[])((int[])var4[1]))[1] << 1;
         if(((int[])((int[])var0[1]))[4] < var6) {
            var5 = ((int[])((int[])var0[1]))[4] * var5 / var6;
         }

         var5 += ((int[])((int[])var1[10]))[((int[])((int[])var0[1]))[3]] >> 7;
         double var7 = Math.sin((double)(((int[])((int[])var0[1]))[14] & 511) * 0.01227184630308513D);
         var3 += (int)((double)var5 * var7);
      }

      var5 = (int)(0.5D + (double)(((hb)var0[3]).f_l * 256) * Math.pow(2.0D, (double)var3 * 3.255208333333333E-4D) / (double)mc.a);
      return 1 > var5?1:var5;
   }

}
