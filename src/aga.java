import java.awt.Component;

final class aga {

   static int a;
   static int b;
   static Object[] d = ed.a(4, new Object[1], (byte)-128, 100);
   static int e;
   static Object[] c = ed.a(-1, new Object[1], (byte)-120, 49);


   static final boolean a(char var0, int var1) {
      ++a;
      return var1 < 15?((boolean[])((boolean[])d[0]))[18]:48 <= var0 && var0 <= 57 || var0 >= 65 && 90 >= var0 || var0 >= 97 && 122 >= var0;
   }

   static final void a(Object[] var0, Component var1, boolean var2) throws Exception {
      ++e;
      if(var2) {
         d = (Object[])null;
      }

   }

   static final aa a(int var0, Object[] var1, int var2, int var3, int var4, int[][] var5, int var6, int var7, int[][] var8) {
      if(var6 != 14769) {
         c = (Object[])((Object[])d[7]);
      }

      ++b;
      Object[] var11 = new Object[25];
      if(null == var11[1]) {
         var11[1] = new int[8];
      }

      gka.b((byte)76, var11);
      var11[6] = fga.a(var3, (byte)74, var7, var11, var5, var4);
      ((int[])((int[])var11[1]))[7] = -2 + ((aa)var11[6]).a;
      var11[11] = var1;
      ((int[])((int[])var11[1]))[5] = 1 << ((int[])((int[])var11[1]))[7];
      var11[9] = new int[var7][var4][];
      ((int[])((int[])var11[1]))[1] = var2;
      var11[10] = new Object[var7][var4][][];
      var11[12] = new int[var7][var4][];
      ((int[])((int[])var11[1]))[3] = var0;
      if(var1 != null && 1 == var1.length) {
         qs.a((Object[])null, 124, 24, -87);
      }

      var11[17] = new float[((aa)var11[6]).f_i + 1][1 + ((aa)var11[6]).h];
      var11[18] = new int[var7][var4][];
      var11[15] = new float[1 + ((aa)var11[6]).f_i][((aa)var11[6]).h + 1];
      var11[24] = new float[1 + ((aa)var11[6]).f_i][((aa)var11[6]).h + 1];
      var11[19] = new int[var7][var4][];
      var11[2] = new byte[var7][var4];
      var11[13] = new byte[1 + var7][1 + var4];
      var11[23] = new int[var7][var4][];
      var11[7] = new short[var7 * var4][];

      for(int var12 = 1; ~var12 > ~((aa)var11[6]).h; ++var12) {
         if(null != var1 && var1.length == 3 && var1[0].equals(Integer.valueOf(2))) {
            dma.f = null;
         }

         for(int var13 = 1; ((aa)var11[6]).f_i > var13; ++var13) {
            int var14 = var8[var13 + 1][var12] + -var8[-1 + var13][var12];
            int var15 = var8[var13][1 + var12] - var8[var13][-1 + var12];
            float var16 = (float)(1.0D / Math.sqrt((double)(var3 * var3 * 4 + var14 * var14 + var15 * var15)));
            ((float[][])((float[][])var11[15]))[var13][var12] = var16 * (float)var14;
            ((float[][])((float[][])var11[17]))[var13][var12] = (float)(-var3 * 2) * var16;
            ((float[][])((float[][])var11[24]))[var13][var12] = var16 * (float)var15;
         }
      }

      var11[20] = nb.a((byte)87, 128, new Object[5]);
      if((((int[])((int[])var11[1]))[3] & 16) != 0) {
         var11[22] = ola.a((byte)87, new Object[5], (Object[])((Object[])var11[11]), var11);
      }

      return (aa)(var11 == null?null:var11[6]);
   }

}
