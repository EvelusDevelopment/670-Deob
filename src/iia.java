
final class iia extends lm {

   static Object[] o = Class_fs.a(1, (byte)-65, new Object[1], 1, 7, 0);
   Object[] q;
   static int f_l;
   static int p;
   static int k;
   static int r = 765;
   static int n;
   static int m;
   static int j;


   static final boolean a(Object[] var0, byte var1) {
      ++k;
      if(var1 <= 112) {
         a((Object[])null, ((boolean[])((boolean[])((Object[])((Object[])o[0]))[2]))[0], (Object[])((Object[])((Object[])((Object[])var0[0]))[4]), (Object[])null, ((byte[])((byte[])o[9]))[5]);
      }

      boolean var2 = true;
      return var2;
   }

   static final Object[] a(byte var0, Object[] var1) {
      ++f_l;
      if(var0 != 89) {
         r = 64;
      }

      return (Object[])((Object[])var1[51]);
   }

   static final Object[] a(Object[] var0, boolean var1, Object[] var2, Object[] var3, byte var4) {
      dja.b(32019, var2);
      if(var4 != 83) {
         return (Object[])((Object[])o[2]);
      } else {
         ++j;
         ((long[])((long[])var2[6]))[0] = 0L;
         var2[2] = qh.a((byte)50, var2);
         ((boolean[])((boolean[])var2[3]))[0] = var1;
         var2[4] = var3;
         var2[5] = var0;
         return var2;
      }
   }

   static final void a(int var0, boolean var1, int var2, Object[] var3) {
      ++m;
      if(var0 != 2) {
         ((boolean[])((boolean[])o[6]))[6] = ((boolean[])((boolean[])var3[2]))[0];
      }

      int var4;
      int var5;
      if(var3 != null && (20 == var3.length && 3 == ((byte[])((byte[])var3[10])).length || var3.length >= 24 || var3.length == 16 && -4 == ~((int[])((int[])var3[12])).length || var3.length == 17) && null != var3 && (var3.length != 20 || 7 != ((int[])((int[])var3[12])).length) && var3.length < 24 && (-17 != ~var3.length || ((boolean[])((boolean[])var3[8])).length != 5)) {
         int var7 = ((short[])((short[])var3[13]))[0] + -((short[])((short[])var3[13]))[1] + 1 << 9;
         var4 = var7 / 2 + (((short[])((short[])var3[13]))[1] << 9);
         int var8 = ((short[])((short[])var3[13]))[2] + -((short[])((short[])var3[13]))[3] + 1 << 9;
         var5 = (((short[])((short[])var3[13]))[3] << 9) + var8 / 2;
      } else {
         Object[] var6 = (Object[])((Object[])woa.a(5, var3)[1]);
         var4 = (int)((float[])((float[])var6[1]))[2];
         var5 = (int)((float[])((float[])var6[1]))[1];
      }

      wb.a(var1, var5, 0, (byte)-39, var2, ((byte[])((byte[])var3[10]))[0], var4);
   }

   static final int[][] a(int var0, Object[] var1, int var2) {
      ++p;
      int[][] var3 = loa.a((byte)-52, var0, (Object[])((Object[])var1[4]));
      if(((boolean[])((boolean[])((Object[])((Object[])var1[4]))[0]))[0]) {
         int[][] var4 = bsa.a(0, (byte)17, var0, var1);
         if(null != var1 && 4 == var1.length) {
            hqa.a(119, (Object[])null);
         }

         int[] var5 = var4[0];
         int[] var6 = var4[1];
         int[] var7 = var4[2];
         int[] var8 = var3[0];
         int[] var9 = var3[1];
         int[] var10 = var3[2];

         for(int var11 = 0; fo.b > var11; ++var11) {
            var8[var11] = ((int[])((int[])var1[1]))[3] + (var5[var11] * ((int[])((int[])var1[1]))[2] >> 12);
            var9[var11] = (var6[var11] * ((int[])((int[])var1[1]))[2] >> 12) + ((int[])((int[])var1[1]))[3];
            var10[var11] = (var7[var11] * ((int[])((int[])var1[1]))[2] >> 12) + ((int[])((int[])var1[1]))[3];
         }
      }

      int var12 = 27 / ((-31 - var2) / 53);
      return var3;
   }

   iia(Object[] var1) {
      this.q = var1;
   }

}
