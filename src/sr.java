import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

final class sr {

   static int a;
   static int c;
   static short d = 320;
   static int b;
   static Object[][][][] e;


   static final Object[] a(int var0, int var1, int var2) {
      Object[] var3 = ju.g[var0][var1][var2];
      if(var3 != null) {
         poa.a((Object[])((Object[])var3[2]));
         if(var3[2] != null) {
            Object[] var4 = (Object[])((Object[])var3[2]);
            var3[2] = null;
            return var4;
         }
      }

      return null;
   }

   static final void a(int var0, Object[] var1, byte var2) {
      if(var2 != -35) {
         b = ((int[])((int[])var1[0]))[17];
      }

      ((int[])((int[])var1[1]))[0] = ((int[])((int[])((Object[])((Object[])var1[5]))[0]))[1] * var0;
      ++a;
      if(~((int[])((int[])var1[1]))[1] > ~((int[])((int[])var1[1]))[0]) {
         if(~((long[])((long[])var1[6]))[0] != -1L) {
            IUnknown.Release(((long[])((long[])var1[6]))[0]);
         }

         int var4 = 8;
         byte var3;
         if(((boolean[])((boolean[])var1[3]))[0]) {
            var3 = 0;
            var4 |= 512;
         } else {
            var3 = 1;
         }

         ((long[])((long[])var1[6]))[0] = IDirect3DDevice.CreateIndexBuffer(((long[])((long[])((Object[])((Object[])var1[4]))[50]))[5], ((int[])((int[])var1[1]))[0], var4, var1[5] == vk.e?101:102, var3);
         ((int[])((int[])var1[1]))[1] = ((int[])((int[])var1[1]))[0];
      }

   }

   static final void a(boolean var0, Object[] var1, int var2) {
      ++c;
      int[][] var3 = new int[((int[])((int[])var1[0])).length << 1][4];

      for(int var4 = 0; ((int[])((int[])var1[0])).length > var4; ++var4) {
         var3[var4 * 2][0] = ((int[])((int[])var1[0]))[var4];
         var3[2 * var4][1] = ((int[])((int[])var1[5]))[var4];
         var3[var4 * 2][2] = ((int[])((int[])var1[1]))[var4];
         var3[var4 * 2][3] = ((int[])((int[])var1[4]))[var4];
         var3[1 + var4 * 2][0] = ((int[])((int[])var1[3]))[var4];
         var3[1 + var4 * 2][1] = ((int[])((int[])var1[2]))[var4];
         var3[1 + var4 * 2][2] = ((int[])((int[])var1[6]))[var4];
         var3[2 * var4 + 1][3] = ((int[])((int[])var1[4]))[var4];
      }

      if(!var0) {
         rq.a[var2] = var3;
         if(var1 == null || -10 != ~var1.length) {
            ;
         }
      }
   }

}
