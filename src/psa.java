
final class psa {

   static int e;
   static int d;
   static int a;
   static int b;
   static int c;
   static short f = 256;


   static final void a(Object[] var0, byte var1) {
      rsa.a(var1 ^ 12428, (Object[])((Object[])var0[17]));
      ++c;
      ((int[])((int[])var0[7]))[qr.a(true, (Object[])((Object[])var0[17]))] = -1;
      if(var1 == -11) {
         Class_ds.a(((Object[][])((Object[][])var0[2]))[0], (byte)116);
         Object[] var2 = var0;
         byte var3 = 0;
         if(var0 != null && (var0.length == 15 || var0.length == 4)) {
            maa.a((Object[])((Object[])ni.v[6]), (Object[])null, -101, var1 ^ -8);
         }

         int var4;
         for(var4 = 0; ((int[])((int[])var2[1]))[0] > var4; ++var4) {
            ((int[])((int[])var2[7]))[var4] |= 128 << var3;
         }

         boolean var12 = ((boolean[])((boolean[])((Object[])((Object[])var0[0]))[63]))[15];
         if(var0 != null && -48 == ~var0.length) {
            float var13 = (-Math.abs(((float[])((float[])((Object[])((Object[])var0[0]))[53]))[1]) + 1.0F) * 2.0F + 1.0F;
            float var15 = ((float[])((float[])((Object[])((Object[])var0[0]))[0]))[8];
            ((float[])((float[])((Object[])((Object[])var0[0]))[0]))[8] *= var13;
            sc.a((byte)-71, var0, var12);
            ((float[])((float[])((Object[])((Object[])var0[0]))[0]))[8] = var15;
         } else {
            sc.a((byte)-90, var0, var12);
         }

         Object[] var14 = dea.a(79, (Object[])((Object[])var0[0]));
         if(null != var0 && 47 == var0.length) {
            Object[] var16 = ab.a(new Object[2], (byte)83);
            vt.a(((float[])((float[])var0[34]))[0], (byte)127, var16, ((float[])((float[])var0[34]))[0], 1.0F, 1.0F);
            jt.a(var16, var14, 2, var16);
            oga.a(var1 ^ -47, var0, var16);
         } else {
            oga.a(var1 + 47, var0, var14);
         }

         if(var0[17] != null && moa.a((byte)75, (Object[])((Object[])var0[17]))) {
            var4 = qr.a(true, (Object[])((Object[])var0[17]));
            int var5 = ((int[])((int[])var0[7]))[var4];
            Object[] var6;
            Object[] var7;
            Object[] var8;
            Object[] var9;
            if(-1 != ~(1 & var5) && var0[9] != null) {
               var6 = (Object[])((Object[])var0[17]);
               var7 = (Object[])((Object[])var0[9]);
               var9 = (Object[])((Object[])var0[0]);
               var8 = (Object[])((Object[])var9[52]);
               vla.a(var7, true, var8, var6);
            }

            if(0 != (var5 & 2)) {
               if(null != var0[4]) {
                  vla.a((Object[])((Object[])var0[4]), true, mua.a((Object[])((Object[])var0[0]), (byte)-61), (Object[])((Object[])var0[17]));
               }

               if(var0[6] != null) {
                  ((float[])((float[])var0[19]))[2] = 0.0F;
                  ((float[])((float[])var0[19]))[1] = 0.0F;
                  ((float[])((float[])var0[19]))[0] = 0.0F;
                  var6 = poa.a((Object[])((Object[])var0[0]), (byte)127);
                  float var17 = ((float[])((float[])var0[19]))[0];
                  float var19 = ((float[])((float[])var0[19]))[1];
                  float var20 = ((float[])((float[])var0[19]))[2];
                  float[] var10 = (float[])((float[])var0[19]);
                  var17 -= ((float[])((float[])var6[0]))[8];
                  var19 -= ((float[])((float[])var6[0]))[1];
                  var20 -= ((float[])((float[])var6[0]))[7];
                  var10[2] = (float)((int)(var19 * ((float[])((float[])var6[0]))[11] + ((float[])((float[])var6[0]))[6] * var17 + var20 * ((float[])((float[])var6[0]))[4]));
                  var10[1] = (float)((int)(((float[])((float[])var6[0]))[3] * var19 + ((float[])((float[])var6[0]))[0] * var17 + var20 * ((float[])((float[])var6[0]))[2]));
                  var10[0] = (float)((int)(((float[])((float[])var6[0]))[9] * var20 + var19 * ((float[])((float[])var6[0]))[5] + var17 * ((float[])((float[])var6[0]))[10]));
                  eea.a(((float[])((float[])var0[19]))[2], ((float[])((float[])var0[19]))[0], false, (Object[])((Object[])var0[6]), (Object[])((Object[])var0[17]), ((float[])((float[])var0[19]))[1]);
               }
            }

            if((16 & var5) != 0 && null != var0[12]) {
               var6 = (Object[])((Object[])var0[17]);
               var7 = (Object[])((Object[])var0[12]);
               var9 = (Object[])((Object[])var0[0]);
               if(var9[24] != bsa.b) {
                  var8 = (Object[])((Object[])var9[52]);
               } else {
                  if(!((boolean[])((boolean[])var9[63]))[9]) {
                     uk.a(var9, false);
                  }

                  var8 = (Object[])((Object[])var9[61]);
               }

               vla.a(var7, true, var8, var6);
            }

            if((8 & var5) != 0 && var0[3] != null) {
               var6 = (Object[])((Object[])var0[17]);
               var7 = (Object[])((Object[])var0[3]);
               var9 = (Object[])((Object[])var0[0]);
               if(bsa.b == var9[24]) {
                  var8 = (Object[])((Object[])var9[3]);
               } else {
                  var8 = ota.z;
               }

               vla.a(var7, true, var8, var6);
            }

            if(0 != (4 & var5) && var0[5] != null) {
               vla.a((Object[])((Object[])var0[5]), true, bsa.a((Object[])((Object[])var0[0]), (byte)-128), (Object[])((Object[])var0[17]));
            }

            if(0 != (32 & var5) && null != var0[10]) {
               var6 = ni.v;
               var8 = (Object[])((Object[])var0[0]);
               if(var8[24] != bsa.b) {
                  var7 = (Object[])((Object[])var8[52]);
               } else {
                  if(!((boolean[])((boolean[])var8[63]))[9]) {
                     uk.a(var8, false);
                  }

                  var7 = (Object[])((Object[])var8[61]);
               }

               jt.a(bsa.a((Object[])((Object[])var0[0]), (byte)-127), var7, 2, var6);
               vla.a((Object[])((Object[])var0[10]), true, ni.v, (Object[])((Object[])var0[17]));
            }

            if(null != var14 && var14.length == 1) {
               maa.a((Object[])((Object[])ni.v[25]), (Object[])null, ((int[])((int[])ni.v[6]))[2], 13);
            }

            if(-1 != ~(var5 & 64) && null != var0[18]) {
               jt.a(bsa.a((Object[])((Object[])var0[0]), (byte)-126), mua.a((Object[])((Object[])var0[0]), (byte)-61), 2, ni.v);
               vla.a((Object[])((Object[])var0[18]), true, ni.v, (Object[])((Object[])var0[17]));
            }

            var7 = (Object[])((Object[])var0[0]);
            int var18 = ((int[])((int[])var7[1]))[7];
            if(var18 == 0 && (128 & ((int[])((int[])var0[7]))[var4]) != 0 && var0[20] != null) {
               kaa.a(dea.a(105, (Object[])((Object[])var0[0])), (Object[])((Object[])var0[17]), var1 + 137, (Object[])((Object[])var0[20]));
               ((int[])((int[])var0[7]))[var4] &= -129;
            }

            ((int[])((int[])var0[7]))[var4] = 0;
         }

         tea.b(false, var0);
      }
   }

   static final void a(Object[] var0, byte var1, int var2, Object[] var3) {
      if(null != var3 && 13 == var3.length && var3[2].equals(Boolean.valueOf(false))) {
         gm.c = null;
      }

      ++e;

      while(true) {
         int var4 = fh.a(var0, false);
         if(0 == var4) {
            if(var1 != 38) {
               f = 30;
            }

            return;
         }

         bca.a(var3, var0, var4, -25240, var2);
      }
   }

   static final void a(boolean var0, Object[] var1, Object[] var2) {
      if(!var0) {
         a(false, (Object[])null, (Object[])null);
      }

      ++a;
      float var3 = ((float[])((float[])var1[0]))[2];
      float var4 = ((float[])((float[])var1[0]))[3];
      float var5 = ((float[])((float[])var1[0]))[1];
      float var6 = ((float[])((float[])var1[0]))[0];
      ((float[])((float[])var1[0]))[3] = var5 * ((float[])((float[])var2[0]))[9] + var3 * ((float[])((float[])var2[0]))[1] + var4 * ((float[])((float[])var2[0]))[5] + ((float[])((float[])var2[0]))[13] * var6;
      ((float[])((float[])var1[0]))[1] = ((float[])((float[])var2[0]))[10] * var5 + var4 * ((float[])((float[])var2[0]))[6] + var3 * ((float[])((float[])var2[0]))[2] + ((float[])((float[])var2[0]))[14] * var6;
      ((float[])((float[])var1[0]))[0] = ((float[])((float[])var2[0]))[7] * var4 + ((float[])((float[])var2[0]))[3] * var3 + var5 * ((float[])((float[])var2[0]))[11] + var6 * ((float[])((float[])var2[0]))[15];
      ((float[])((float[])var1[0]))[2] = ((float[])((float[])var2[0]))[8] * var5 + var3 * ((float[])((float[])var2[0]))[0] + ((float[])((float[])var2[0]))[4] * var4 + var6 * ((float[])((float[])var2[0]))[12];
   }

   static final int a(Object[] var0, Object[][] var1, int var2) {
      if(var2 != 0) {
         a(((boolean[])((boolean[])((Object[])((Object[])((Object[])((Object[])var0[4]))[27]))[0]))[2], (Object[])((Object[])var0[1]), (Object[])null);
      }

      ++b;
      Object[] var3 = (Object[])((Object[])woa.a(5, var0)[1]);
      return ju.a(var0, (int)((float[])((float[])var3[1]))[2] >> qqa.e, var1, (int)((float[])((float[])var3[1]))[1] >> qqa.e, true);
   }

}
