
final class kb {

   static int d;
   static int h;
   static int f;
   static int j;
   static int g;
   static int e;
   static Object[] b = sd.a(new Object[1], 69, (byte)118);
   static int[] f_i = new int[5];
   static int c = 0;
   static int a;


   static final void a(int var0) {
      if(var0 == 2) {
         ++g;
         dq.a(var0 - 129, uda.m);
      }
   }

   static final jc a(boolean var0, Object[] var1) {
      if(var0) {
         b(((boolean[])((boolean[])b[28]))[14], new Object[6]);
      }

      ++h;
      return new jc(var1);
   }

   static final boolean a(int var0, Object[] var1, int[] var2, Object[] var3, int var4, int var5) {
      ++e;
      ((int[])((int[])var1[1]))[5] = mc.a / 100;
      if(var5 != 32) {
         a(19, (Object[])((Object[])var1[10]));
      }

      if(((int[])((int[])var1[1]))[13] >= 0 && (var1[0] == null || ((on)var1[0]).e())) {
         ti.a(0, var1);
         ((lm)(null == var1?null:var1[2])).a((byte)110);
         if(-1 > ~((int[])((int[])var1[1]))[6] && var1 == ((Object[][][])((Object[][][])var3[21]))[((int[])((int[])var1[1]))[3]][((int[])((int[])var1[1]))[6]]) {
            ((Object[][][])((Object[][][])var3[21]))[((int[])((int[])var1[1]))[3]][((int[])((int[])var1[1]))[6]] = null;
         }

         return true;
      } else {
         int var8 = ((int[])((int[])var1[1]))[2];
         if(0 < var8) {
            var8 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)((int[])((int[])var3[11]))[((int[])((int[])var1[1]))[3]]) + 0.5D);
            if(var8 < 0) {
               var8 = 0;
            }

            ((int[])((int[])var1[1]))[2] = var8;
         }

         ((on)var1[0]).h(to.a(var1, var3, 4));
         Object[] var9 = (Object[])((Object[])var1[4]);
         ++((int[])((int[])var1[1]))[4];
         boolean var10 = false;
         ((int[])((int[])var1[1]))[14] += ((int[])((int[])var9[1]))[6];
         double var11 = 5.086263020833333E-6D * (double)((((int[])((int[])var1[1]))[2] * ((int[])((int[])var1[1]))[8] >> 12) + (((int[])((int[])var1[1]))[16] - 60 << 8));
         if(0 < ((int[])((int[])var9[1]))[2]) {
            if(0 >= ((int[])((int[])var9[1]))[4]) {
               ((int[])((int[])var1[1]))[10] += 128;
            } else {
               ((int[])((int[])var1[1]))[10] += (int)(128.0D * Math.pow(2.0D, var11 * (double)((int[])((int[])var9[1]))[4]) + 0.5D);
            }

            if(((int[])((int[])var9[1]))[2] * ((int[])((int[])var1[1]))[10] >= 819200) {
               var10 = true;
            }
         }

         if(var9[2] != null) {
            if(((int[])((int[])var9[1]))[3] > 0) {
               ((int[])((int[])var1[1]))[0] += (int)(0.5D + 128.0D * Math.pow(2.0D, (double)((int[])((int[])var9[1]))[3] * var11));
            } else {
               ((int[])((int[])var1[1]))[0] += 128;
            }

            while(((byte[])((byte[])var9[2])).length - 2 > ((int[])((int[])var1[1]))[15] && ~((int[])((int[])var1[1]))[0] < ~((((byte[])((byte[])var9[2]))[2 + ((int[])((int[])var1[1]))[15]] & 255) << 8)) {
               ((int[])((int[])var1[1]))[15] += 2;
            }

            if(~((int[])((int[])var1[1]))[15] == ~(((byte[])((byte[])var9[2])).length - 2) && ((byte[])((byte[])var9[2]))[((int[])((int[])var1[1]))[15] + 1] == 0) {
               var10 = true;
            }
         }

         if(0 <= ((int[])((int[])var1[1]))[13] && var9[0] != null && -1 == ~(1 & ((int[])((int[])var3[9]))[((int[])((int[])var1[1]))[3]]) && (0 > ((int[])((int[])var1[1]))[6] || var1 != ((Object[][][])((Object[][][])var3[21]))[((int[])((int[])var1[1]))[3]][((int[])((int[])var1[1]))[6]])) {
            if(var1 != null && (var1.length == 2 && var1[0].equals(Integer.valueOf(1)) && var1[0].equals(Integer.valueOf(0)) || 32 == var1.length && var1[0].equals(Boolean.valueOf(false)))) {
               return false;
            }

            if(0 >= ((int[])((int[])var9[1]))[5]) {
               ((int[])((int[])var1[1]))[13] += 128;
            } else {
               ((int[])((int[])var1[1]))[13] += (int)(128.0D * Math.pow(2.0D, (double)((int[])((int[])var9[1]))[5] * var11) + 0.5D);
            }

            while(~(((byte[])((byte[])var9[0])).length - 2) < ~((int[])((int[])var1[1]))[12] && ~((int[])((int[])var1[1]))[13] < ~(((byte[])((byte[])var9[0]))[((int[])((int[])var1[1]))[12] + 2] << 8 & '\uff00')) {
               ((int[])((int[])var1[1]))[12] += 2;
            }

            if(((byte[])((byte[])var9[0])).length - 2 == ((int[])((int[])var1[1]))[12]) {
               var10 = true;
            }
         }

         if(!var10) {
            ((on)var1[0]).a(((int[])((int[])var1[1]))[5], br.a(var1, var3, 1), qga.a(var1, (byte)122, var3));
            return false;
         } else {
            ((on)var1[0]).c(((int[])((int[])var1[1]))[5]);
            if(var2 == null) {
               ((on)var1[0]).a(var0);
            } else {
               ((on)var1[0]).b(var2, var4, var0);
            }

            if(((on)var1[0]).h()) {
               ((jua)((Object[])((Object[])var3[4]))[2]).a((kp)var1[0]);
            }

            ti.a(0, var1);
            if(((int[])((int[])var1[1]))[13] >= 0) {
               ((lm)(null == var1?null:var1[2])).a((byte)124);
               if(0 < ((int[])((int[])var1[1]))[6] && ((Object[][][])((Object[][][])var3[21]))[((int[])((int[])var1[1]))[3]][((int[])((int[])var1[1]))[6]] == var1) {
                  ((Object[][][])((Object[][][])var3[21]))[((int[])((int[])var1[1]))[3]][((int[])((int[])var1[1]))[6]] = null;
               }
            }

            return true;
         }
      }
   }

   static final Object[] a(byte var0, Object[] var1, boolean var2) {
      ++j;
      if(var0 < 109) {
         a = -42;
      }

      return ina.a(vk.e, var2, false, new Object[8], var1);
   }

   static final po b(boolean var0, Object[] var1) {
      ++f;
      if(var0) {
         a(-116, (Object[])((Object[])b[7]), (int[])((int[])var1[1]), (Object[])((Object[])var1[7]), -94, -13);
      }

      return new po(var1);
   }

   static final boolean a(int var0, Object[] var1) {
      ++d;
      Object[] var2 = mca.a(true, uaa.a(var1, 116), lja.d);
      if(((int[])((int[])var2[1]))[34] != -1) {
         Object[] var3 = uqa.a(((int[])((int[])var2[1]))[34], rka.d, 121);
         if(((int[])((int[])var3[var0]))[0] == -1) {
            return true;
         } else {
            boolean var4 = hp.a(-128, (Object[])((Object[])((Object[])((Object[])var3[0]))[1]), ((int[])((int[])var3[1]))[0]);
            return var4;
         }
      } else {
         return true;
      }
   }

}
