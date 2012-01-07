
final class fda {

   static int[][] c;
   static int d;
   static int a;
   static int b;
   static int e;


   static final int a(int var0, byte var1) {
      --var0;
      ++b;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      if(var1 != 81) {
         return -118;
      } else {
         var0 |= var0 >>> 8;
         var0 |= var0 >>> 16;
         return 1 + var0;
      }
   }

   static final float[] a(int var0, float[] var1, Object[] var2) {
      ++e;
      if(var0 != 20504) {
         return (float[])null;
      } else {
         float var3 = -((float[])((float[])var2[0]))[1] + ((float[])((float[])var2[0]))[3];
         float var4 = ((float[])((float[])var2[0]))[7] - ((float[])((float[])var2[0]))[5];
         float var5 = ((float[])((float[])var2[0]))[11] - ((float[])((float[])var2[0]))[9];
         double var6 = Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
         var1[1] = (float)((double)var4 / var6);
         var1[2] = (float)((double)var5 / var6);
         var1[3] = (float)((double)(-((float[])((float[])var2[0]))[13] + ((float[])((float[])var2[0]))[15]) / var6);
         var1[0] = (float)((double)var3 / var6);
         return var1;
      }
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 >= -112) {
         a = -94;
      }

      if(null == var0[1]) {
         var0[1] = new int[2];
      }

      if(var0[3] == null) {
         var0[3] = new boolean[1];
      }

      if(null == var0[0]) {
         var0[0] = new short[3];
      }

      if(var0[2] == null) {
         var0[2] = new byte[2];
      }

      ++d;
   }

}
