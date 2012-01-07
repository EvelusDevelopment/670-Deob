
final class ai {

   static int f_i;
   static short b = 32767;
   static Object[] f;
   static Object[] d;
   static int h = -1;
   static String c = null;
   static Object[] e;
   static Object[] a;
   static Object[] g;


   static final void a(int var0, int var1, int var2, float[] var3, int var4, int var5, float var6, int var7, int var8, int var9, float[] var10) {
      var2 -= var5;
      ++f_i;
      var7 -= var8;
      var0 -= var9;
      float var11 = (float)var2 * var3[2] + (float)var0 * var3[1] + var3[0] * (float)var7;
      float var12 = (float)var0 * var3[var4] + var3[3] * (float)var7 + (float)var2 * var3[5];
      float var13 = var3[8] * (float)var2 + (float)var7 * var3[6] + var3[7] * (float)var0;
      float var14 = (float)Math.sqrt((double)(var13 * var13 + var11 * var11 + var12 * var12));
      float var15 = 0.5F + (float)Math.atan2((double)var11, (double)var13) / 6.2831855F;
      float var16 = var6 + (float)Math.asin((double)(var12 / var14)) / 3.1415927F + 0.5F;
      float var17;
      if(1 != var1) {
         if(2 != var1) {
            if(3 == var1) {
               var17 = var15;
               var15 = var16;
               var16 = -var17;
            }
         } else {
            var16 = -var16;
            var15 = -var15;
         }
      } else {
         var17 = var15;
         var15 = -var16;
         var16 = var17;
      }

      var10[1] = var16;
      var10[0] = var15;
   }

   static {
      Object[] var1 = new Object[0];
      e = var1;
      var1 = new Object[0];
      a = var1;
      var1 = new Object[0];
      d = var1;
      var1 = new Object[0];
      g = var1;
      f = sd.a(new Object[1], 98, (byte)115);
   }
}
