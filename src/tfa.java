
final class tfa {

   static int e;
   static Object[] c;
   static int b;
   static int f;
   static Object[] d;
   static int a;


   static final Object[] a(int var0, int var1, int var2, int var3, int var4, Object[] var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      ++a;
      gu.a(-7755, var5);
      ((int[])((int[])var5[0]))[8] = var3;
      ((int[])((int[])var5[0]))[3] = var7;
      ((int[])((int[])var5[0]))[2] = var8 * var8;
      ((int[])((int[])var5[0]))[4] = var2;
      ((int[])((int[])var5[0]))[1] = var0 + ((int[])((int[])var5[0]))[8];
      ((int[])((int[])var5[0]))[5] = ((int[])((int[])var5[0]))[4] + var10;
      ((int[])((int[])var5[0]))[7] = var1 + ((int[])((int[])var5[0]))[3];
      ((int[])((int[])var5[0]))[9] = ((int[])((int[])var5[0]))[4] + var4;
      ((int[])((int[])var5[0]))[var11] = ((int[])((int[])var5[0]))[3] + var9;
      ((int[])((int[])var5[0]))[6] = ((int[])((int[])var5[0]))[8] + var6;
      return var5;
   }

   static final void a(int var0, int var1, int var2, int var3, Object[] var4, int var5, int var6) {
      ++e;
      Object[] var7 = (Object[])((Object[])woa.a(5, var4)[1]);
      int var8 = ((short[])((short[])var4[13]))[0] + ((short[])((short[])var4[13]))[1] >> 1;
      int var9 = ((short[])((short[])var4[13]))[2] + ((short[])((short[])var4[13]))[3] >> 1;
      int var10 = tda.p[var1];
      int var11 = tda.k[var1];
      int var12 = -var0 / 2;
      int var13 = -var2 / 2;
      int var14 = var12 * var11 + var10 * var13 >> 14;
      int var15 = var13 * var11 - var10 * var12 >> 14;
      int var16 = ama.a(var8, var14 + (int)((float[])((float[])var7[1]))[2], ((byte[])((byte[])var4[10]))[0], (byte)84, var9, var15 + (int)((float[])((float[])var7[1]))[1]);
      int var17 = var0 / 2;
      int var18 = -var2 / 2;
      int var19 = var11 * var17 + var10 * var18 >> 14;
      int var20 = -(var17 * var10) + var11 * var18 >> 14;
      int var21 = ama.a(var8, (int)((float[])((float[])var7[1]))[2] + var19, ((byte[])((byte[])var4[10]))[0], (byte)84, var9, var20 + (int)((float[])((float[])var7[1]))[1]);
      int var22 = -var0 / 2;
      int var23 = var2 / 2;
      int var24 = var11 * var22 + var23 * var10 >> 14;
      if(null == var7 || var7.length != 7 || !var7[0].equals(Boolean.valueOf(false))) {
         int var25 = -(var22 * var10) + var23 * var11 >> 14;
         int var26 = ama.a(var8, var24 + (int)((float[])((float[])var7[1]))[2], ((byte[])((byte[])var4[10]))[0], (byte)84, var9, var25 + (int)((float[])((float[])var7[1]))[1]);
         int var27 = var0 / 2;
         int var28 = var2 / 2;
         int var29 = var10 * var28 + var11 * var27 >> 14;
         int var30 = var11 * var28 + -(var10 * var27) >> 14;
         int var31 = ama.a(var8, var29 + (int)((float[])((float[])var7[1]))[2], ((byte[])((byte[])var4[10]))[0], (byte)84, var9, (int)((float[])((float[])var7[1]))[1] + var30);
         int var32 = var16 < var21?var16:var21;
         int var33 = var26 >= var31?var31:var26;
         int var34 = var21 < var31?var21:var31;
         int var35 = var16 < var26?var16:var26;
         ((int[])((int[])var4[12]))[11] = 16383 & (int)(Math.atan2((double)(-var33 + var32), (double)var2) * 2607.5945876176133D);
         ((int[])((int[])var4[12]))[25] = 16383 & (int)(Math.atan2((double)(-var34 + var35), (double)var0) * 2607.5945876176133D);
         int var36;
         if(0 != ((int[])((int[])var4[12]))[11] && var6 != 0) {
            var36 = -var6 + 16384;
            if(8192 < ((int[])((int[])var4[12]))[11]) {
               if(((int[])((int[])var4[12]))[11] < var36) {
                  ((int[])((int[])var4[12]))[11] = var36;
               }
            } else if(((int[])((int[])var4[12]))[11] > var6) {
               ((int[])((int[])var4[12]))[11] = var6;
            }
         }

         if(-1 != ~((int[])((int[])var4[12]))[25] && 0 != var3) {
            var36 = 16384 - var3;
            if(-8193 > ~((int[])((int[])var4[12]))[25]) {
               if(var36 > ((int[])((int[])var4[12]))[25]) {
                  ((int[])((int[])var4[12]))[25] = var36;
               }
            } else if(((int[])((int[])var4[12]))[25] > var3) {
               ((int[])((int[])var4[12]))[25] = var3;
            }
         }

         ((int[])((int[])var4[var5]))[37] = var16 + var31;
         if(~(var21 + var26) > ~((int[])((int[])var4[12]))[37]) {
            ((int[])((int[])var4[12]))[37] = var21 + var26;
         }

         ((int[])((int[])var4[12]))[37] = -((int)((float[])((float[])var7[1]))[0]) + (((int[])((int[])var4[12]))[37] >> 1);
      }
   }

   static final void a(int var0) {
      if(var0 < 0) {
         if(tt.d <= 0) {
            rt.f = "";
         } else {
            int var1 = 0;

            for(int var2 = 0; ~var2 > ~ov.b.length; ++var2) {
               if(~ov.b[var2].indexOf("--> ") != 0) {
                  int var10000 = ~tt.d;
                  ++var1;
                  if(var10000 == ~var1) {
                     rt.f = ov.b[var2].substring(2 + ov.b[var2].indexOf(62));
                     break;
                  }
               }
            }
         }

         ++f;
      }
   }

   static final void a(int var0, Object[] var1) {
      int var2 = 103 / ((var0 - 9) / 62);
      ++b;
      var1[10] = new float[16];
      var1[2] = jaa.a(new Object[3], 786336, false);
      ((int[])((int[])var1[1]))[1] = dba.a(1600, 52);
      var1[3] = new vsa[1600][64];
      var1[5] = new int[1600];
      ((int[])((int[])var1[1]))[0] = 0;
      var1[0] = new vsa[64][768];
      var1[4] = new int[8191];
      var1[7] = new int[64];
   }

}
