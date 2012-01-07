
final class nr {

   static int c;
   static int b = dba.a(1600, 122);
   static int d;
   static int g;
   static int a;
   static int f;
   static int[][] h = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12, 12, 5}, {5, 5, 1, 1}, {5, 1, 1, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 12, 12, 12, 12, 12}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 3, 1, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 7, 3, 7}, {12, 12, 12, 12}};
   static int e = 0;
   static int[] f_i = new int[]{77, 80};


   static final void a(int var0, boolean var1, int var2, int var3, Object[] var4) {
      ++d;
      if(bva.a(var4, (byte)-83)) {
         hga.a(var0, var2, var1, (Object[][])((Object[][])((Object[])((Object[])var4[32]))[2]), ~var3, var3);
      }
   }

   static final void a(boolean var0, int var1, int var2, int var3, Object[] var4, int var5, int var6, int var7, boolean var8, int var9) {
      ++c;
      int[] var10 = null;
      int[] var11 = null;
      if(var1 != 5981) {
         var4[2] = var4[17];
      }

      float[] var12 = null;
      if(var0 && var4[4] != null) {
         var11 = (int[])((int[])((Object[])((Object[])var4[2]))[7]);
         var10 = (int[])((int[])((Object[])((Object[])var4[4]))[2]);
      }

      float[] var13 = null;
      if(var8 && null != var4[0]) {
         var12 = (float[])((float[])((Object[])((Object[])var4[0]))[0]);
         var13 = (float[])((float[])((Object[])((Object[])var4[2]))[12]);
      }

      vh.a(var12, ((int[])((int[])((Object[])((Object[])var4[2]))[1]))[4], var9, var7, var10, (byte)117, var3, var2, var13, var6, var5, var11, ((int[])((int[])var4[1]))[0]);
   }

   static final int[] a(boolean var0, Object[] var1, int var2) {
      ++f;
      if(var0) {
         return (int[])null;
      } else if(!sda.a(var2, var1, 119)) {
         return null;
      } else {
         int[] var3 = ((int[][])((int[][])((Object[])((Object[])var1[3]))[2]))[var2];
         if(null == var3) {
            if(null != var1 && -23 == ~var1.length) {
               qn.a(38, -96, (Object[])null, 90);
            }

            var3 = new int[((int[])((int[])((Object[])((Object[])var1[3]))[7]))[var2]];

            for(int var4 = 0; var3.length > var4; var3[var4] = var4++) {
               ;
            }
         }

         return var3;
      }
   }

   static final void a(Object[] var0, int var1) {
      ++g;

      for(int var2 = 0; var2 < ((int[])((int[])var0[1]))[0]; ++var2) {
         ((int[][][])((int[][][])var0[3]))[var2][0] = null;
         ((int[][][])((int[][][])var0[3]))[var2][1] = null;
         ((int[][][])((int[][][])var0[3]))[var2][2] = null;
         ((int[][][])((int[][][])var0[3]))[var2] = (int[][])null;
      }

      var0[4] = null;
      var0[var1] = null;
      nb.b((Object[])((Object[])var0[2]), 0);
      var0[2] = null;
      if(null != var0 && -27 == ~var0.length) {
         qja.a((byte)-49, (Object[])null);
      }

   }

   static final void a(float var0, float var1, float var2, float var3, Object[] var4, byte var5, float var6, float var7, float var8, float var9, float var10) {
      if(var5 != -121) {
         ((boolean[])((boolean[])((Object[])((Object[])var4[0]))[1]))[1] = ((boolean[])((boolean[])var4[1]))[4];
      }

      ++a;
      dh.a(9, (-var2 + var10) * var7 / var8, (-var6 + var9) * var7 / var1, var0, var3, var4, -(var7 * var6) / var1, -(var2 * var7) / var8);
   }

}
