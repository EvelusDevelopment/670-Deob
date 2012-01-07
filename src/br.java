
final class br {

   static int g;
   static int a;
   static int f_i;
   static Object[] f = je.a(1, new Object[1], 4, (byte)-127);
   static int b;
   static Object[] d = ed.a(-1, new Object[1], (byte)-109, 53);
   static int h;
   static int c;
   static Object[] j;
   static ta e;


   static final void a(Object[] var0, int var1) {
      ((int[])((int[])var0[1]))[0] = -1;
      ((int[])((int[])var0[1]))[7] = -1;
      ++a;
      ((int[])((int[])var0[1]))[8] = -1;
      ((boolean[])((boolean[])var0[4]))[2] = false;
      ((int[])((int[])var0[1]))[2] = -1;
      ((int[])((int[])var0[1]))[5] = 99;
      ((boolean[])((boolean[])var0[4]))[1] = false;
      if(var1 != -15536) {
         a((Object[])((Object[])((Object[])((Object[])f[0]))[0]), (Object[])((Object[])f[9]), 27);
      }

      ((int[])((int[])var0[1]))[6] = -1;
      ((int[])((int[])var0[1]))[1] = 5;
      ((int[])((int[])var0[1]))[4] = 2;
      ((boolean[])((boolean[])var0[4]))[0] = false;
   }

   static final int a(int var0, Object[] var1) {
      if(var0 != 3112) {
         return ((int[])((int[])f[1]))[10];
      } else {
         ++f_i;
         int var2;
         if(null != var1 && -9 == ~var1.length) {
            var2 = ((int[])((int[])var1[2]))[0];
            return var2;
         } else if(null != var1 && -7 == ~var1.length) {
            var2 = ((int[])((int[])var1[5]))[0];
            return var2;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final int a(Object[] var0, Object[] var1, int var2) {
      ++c;
      if(-1 == ~((int[])((int[])var1[13]))[((int[])((int[])var0[1]))[3]]) {
         return 0;
      } else {
         Object[] var3 = (Object[])((Object[])var0[4]);
         int var4 = ((int[])((int[])var1[24]))[((int[])((int[])var0[1]))[3]] * ((int[])((int[])var1[8]))[((int[])((int[])var0[1]))[3]] + 4096 >> 13;
         var4 = 16384 + var4 * var4 >> 15;
         var4 = 16384 + var4 * ((int[])((int[])var0[1]))[11] >> 15;
         if(null != var3 && -3 == ~var3.length && var3[0].equals(Boolean.valueOf(false)) && var3[0].equals(Integer.valueOf(1))) {
            return 35;
         } else {
            var4 = var4 * ((int[])((int[])var1[1]))[4] + 128 >> 8;
            var4 = ((int[])((int[])var1[13]))[((int[])((int[])var0[1]))[3]] * var4 + 128 >> 8;
            if(((int[])((int[])var3[var2]))[2] > 0) {
               var4 = (int)(Math.pow(0.5D, (double)((int[])((int[])var3[1]))[2] * 1.953125E-5D * (double)((int[])((int[])var0[1]))[10]) * (double)var4 + 0.5D);
            }

            int var5;
            int var6;
            int var7;
            int var8;
            if(var3[2] != null) {
               var5 = ((int[])((int[])var0[1]))[0];
               var6 = ((byte[])((byte[])var3[2]))[1 + ((int[])((int[])var0[1]))[15]];
               if(~((int[])((int[])var0[1]))[15] > ~(-2 + ((byte[])((byte[])var3[2])).length)) {
                  var7 = ((byte[])((byte[])var3[2]))[((int[])((int[])var0[1]))[15]] << 8 & '\uff00';
                  var8 = '\uff00' & ((byte[])((byte[])var3[2]))[2 + ((int[])((int[])var0[1]))[15]] << 8;
                  var6 += (var5 + -var7) * (-var6 + ((byte[])((byte[])var3[2]))[((int[])((int[])var0[1]))[15] + 3]) / (var8 + -var7);
               }

               var4 = var6 * var4 + 32 >> 6;
            }

            if(-1 > ~((int[])((int[])var0[1]))[13] && var3[0] != null) {
               var5 = ((int[])((int[])var0[1]))[13];
               var6 = ((byte[])((byte[])var3[0]))[((int[])((int[])var0[1]))[12] + 1];
               if(~(-2 + ((byte[])((byte[])var3[0])).length) < ~((int[])((int[])var0[1]))[12]) {
                  var7 = '\uff00' & ((byte[])((byte[])var3[0]))[((int[])((int[])var0[1]))[12]] << 8;
                  var8 = (((byte[])((byte[])var3[0]))[2 + ((int[])((int[])var0[1]))[12]] & 255) << 8;
                  var6 += (((byte[])((byte[])var3[0]))[((int[])((int[])var0[1]))[12] + 3] + -var6) * (-var7 + var5) / (-var7 + var8);
               }

               var4 = 32 + var6 * var4 >> 6;
            }

            return var4;
         }
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      ++h;
      if(-1 != ~hba.a((Object[])((Object[])tu.d[var5]), 0) && var3 != 0 && 50 > ct.e && -1 != var6) {
         Class_a.c[ct.e++] = dk.a((Object[])null, var6, var4, var1, var0, new Object[7], (byte)1, var2, var3, (byte)17);
      }

   }

   static final void a(int var0, int[] var1, boolean var2, int var3, Object[] var4) {
      if(!var2) {
         ++g;
         var1[2] = ((int[])((int[])var4[1]))[3] - (((int[])((int[])var4[1]))[8] - var3);
         var1[0] = ((int[])((int[])var4[1]))[7];
         var1[1] = -((int[])((int[])var4[1]))[2] + ((int[])((int[])var4[1]))[5] + var0;
      }
   }

   static final pha b(Object[] var0, int var1) {
      ++b;
      return var1 != 1?(pha)null:new pha(var0);
   }

}
