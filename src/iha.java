
final class iha {

   static int f;
   static int e;
   static int d;
   static int b;
   static Object[] h = st.a(new Object[1], 7, 31, 29);
   static int c;
   static int a;
   static int[] g = new int[]{2047, 16383, '\uffff'};


   static final void a(int var0) {
      ++f;
      if(var0 == 17061) {
         ++dra.c;
         Object[] var1 = ona.a((byte)111, (Object[])((Object[])lba.f[7]), ib.d);
         op.putInt((Object[])((Object[])var1[0]), dca.f_i);
         lj.a(var1, var0 - 17055, lba.f);
      }
   }

   static final boolean a(int var0, byte var1, Object[] var2) {
      ++b;
      if(null != var2[4] && 0 != var0) {
         if(((int[])((int[])var2[1]))[0] > 0) {
            if(~var0 >= ~((int[])((int[])var2[1]))[0]) {
               ((int[])((int[])var2[1]))[0] -= var0;
               return false;
            }

            var0 -= ((int[])((int[])var2[1]))[0];
            ((int[])((int[])var2[1]))[0] = 0;
            pia.a((Object[])((Object[])var2[4]), 16706, var2, ((int[])((int[])var2[1]))[4]);
         }

         var0 += ((int[])((int[])var2[1]))[3];
         if(var2 != null && var2.length == 1 && var2[0].equals(Integer.valueOf(2)) && var2[0].equals(Integer.valueOf(0))) {
            ((byte[])((byte[])((Object[])((Object[])kaa.f[12]))[0]))[14] = 77;
         }

         boolean var3 = ((boolean[])((boolean[])((Object[])((Object[])var2[4]))[4]))[0] | nta.c;
         if(100 < var0 && ((int[])((int[])((Object[])((Object[])var2[4]))[1]))[7] > 0) {
            if(null != var2 && -20 == ~var2.length) {
               ra.a(false, false, new Object[0][]);
            }

            int var4;
            for(var4 = ((int[])((int[])((Object[])((Object[])var2[4]))[7])).length + -((int[])((int[])((Object[])((Object[])var2[4]))[1]))[7]; ((int[])((int[])var2[1]))[4] < var4 && ((int[])((int[])((Object[])((Object[])var2[4]))[5]))[((int[])((int[])var2[1]))[4]] < var0; ++((int[])((int[])var2[1]))[4]) {
               var0 -= ((int[])((int[])((Object[])((Object[])var2[4]))[5]))[((int[])((int[])var2[1]))[4]];
            }

            if(((int[])((int[])var2[1]))[4] >= var4) {
               int var5 = 0;

               for(int var6 = var4; var6 < ((int[])((int[])((Object[])((Object[])var2[4]))[7])).length; ++var6) {
                  var5 += ((int[])((int[])((Object[])((Object[])var2[4]))[5]))[var6];
               }

               if(((int[])((int[])var2[1]))[2] == 0) {
                  ((int[])((int[])var2[1]))[1] += var0 / var5;
               }

               var0 %= var5;
            }

            ((int[])((int[])var2[1]))[5] = 1 + ((int[])((int[])var2[1]))[4];
            var3 = true;
            if(((int[])((int[])((Object[])((Object[])var2[4]))[7])).length <= ((int[])((int[])var2[1]))[5]) {
               ((int[])((int[])var2[1]))[5] -= ((int[])((int[])((Object[])((Object[])var2[4]))[1]))[7];
               if(((int[])((int[])var2[1]))[5] < 0 || ~((int[])((int[])((Object[])((Object[])var2[4]))[7])).length >= ~((int[])((int[])var2[1]))[5]) {
                  ((int[])((int[])var2[1]))[5] = -1;
               }
            }
         }

         if(var1 >= -102) {
            return false;
         } else {
            while(~var0 < ~((int[])((int[])((Object[])((Object[])var2[4]))[5]))[((int[])((int[])var2[1]))[4]]) {
               int[] var10001 = (int[])((int[])((Object[])((Object[])var2[4]))[5]);
               int[] var10002 = (int[])((int[])var2[1]);
               int var10005 = ((int[])((int[])var2[1]))[4];
               var10002[4] = ((int[])((int[])var2[1]))[4] + 1;
               var0 -= var10001[var10005];
               var3 = true;
               if(~((int[])((int[])var2[1]))[4] <= ~((int[])((int[])((Object[])((Object[])var2[4]))[7])).length) {
                  if(((int[])((int[])((Object[])((Object[])var2[4]))[1]))[7] != -1 && ((int[])((int[])var2[1]))[2] != 2) {
                     ((int[])((int[])var2[1]))[4] -= ((int[])((int[])((Object[])((Object[])var2[4]))[1]))[7];
                     if(((int[])((int[])var2[1]))[2] == 0) {
                        ++((int[])((int[])var2[1]))[1];
                     }
                  }

                  if(~((int[])((int[])((Object[])((Object[])var2[4]))[1]))[5] >= ~((int[])((int[])var2[1]))[1] || ((int[])((int[])var2[1]))[4] < 0 || ((int[])((int[])var2[1]))[4] >= ((int[])((int[])((Object[])((Object[])var2[4]))[7])).length) {
                     ((boolean[])((boolean[])var2[3]))[0] = true;
                     break;
                  }
               }

               pia.a((Object[])((Object[])var2[4]), 16706, var2, ((int[])((int[])var2[1]))[4]);
               ((int[])((int[])var2[1]))[5] = 1 + ((int[])((int[])var2[1]))[4];
               if(~((int[])((int[])((Object[])((Object[])var2[4]))[7])).length >= ~((int[])((int[])var2[1]))[5]) {
                  ((int[])((int[])var2[1]))[5] -= ((int[])((int[])((Object[])((Object[])var2[4]))[1]))[7];
                  if(0 > ((int[])((int[])var2[1]))[5] || ((int[])((int[])((Object[])((Object[])var2[4]))[7])).length <= ((int[])((int[])var2[1]))[5]) {
                     ((int[])((int[])var2[1]))[5] = -1;
                  }
               }
            }

            ((int[])((int[])var2[1]))[3] = var0;
            if(var3) {
               isa.a((int)127, var2);
            }

            return var3;
         }
      } else {
         return false;
      }
   }

   static final void a(Object[] var0, byte var1) {
      try {
         ++d;
         if(null == var0[7]) {
            var0[7] = new int[][]{{0, 0}, {4096, 4096}};
         }

         if(((Object[])((Object[])var0[7])).length >= 2) {
            int var2 = 56 / ((var1 - 25) / 46);
            int[] var6;
            if(((int[])((int[])var0[1]))[1] == 2) {
               int[] var3 = ((int[][])((int[][])var0[7]))[0];
               int[] var4 = ((int[][])((int[][])var0[7]))[1];
               int[] var5 = ((int[][])((int[][])var0[7]))[((Object[])((Object[])var0[7])).length - 2];
               var6 = ((int[][])((int[][])var0[7]))[-1 + ((Object[])((Object[])var0[7])).length];
               var0[12] = new int[]{var5[0] - var6[0] + var5[0], var5[1] + -var6[1] + var5[1]};
               var0[11] = new int[]{-var4[0] + var3[0] + var3[0], -var4[1] + var3[1] + var3[1]};
            }

            pma.a(1);
            int var23 = ((int[])((int[])var0[1]))[1];
            int[] var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var25;
            int var24;
            if(var23 == 2) {
               for(var23 = 0; 257 > var23; ++var23) {
                  var25 = var23 << 4;

                  for(var24 = 1; -1 + ((Object[])((Object[])var0[7])).length > var24 && ~var25 <= ~((int[][])((int[][])var0[7]))[var24][0]; ++var24) {
                     ;
                  }

                  var6 = ((int[][])((int[][])var0[7]))[-1 + var24];
                  var7 = ((int[][])((int[][])var0[7]))[var24];
                  var8 = up.a(var0, true, var24 - 2)[1];
                  var9 = var6[1];
                  var10 = var7[1];
                  var11 = up.a(var0, true, var24 + 1)[1];
                  int var12 = (var25 + -var6[0] << 12) / (var7[0] - var6[0]);
                  int var13 = var12 * var12 >> 12;
                  int var14 = var9 + -var8 + -var10 + var11;
                  if(null != var0 && var0.length == 31 && var0[2].equals(Integer.valueOf(1))) {
                     ig.a((Object[])null, (byte)85);
                  }

                  int var15 = -var14 + var8 + -var9;
                  int var16 = -var8 + var10;
                  int var18 = var13 * (var14 * var12 >> 12) >> 12;
                  int var19 = var15 * var13 >> 12;
                  int var20 = var16 * var12 >> 12;
                  int var21 = var20 + var18 + var19 + var9;
                  if(var21 <= -32768) {
                     var21 = -32767;
                  }

                  if('\u8000' <= var21) {
                     var21 = 32767;
                  }

                  ((short[])((short[])var0[9]))[var23] = (short)var21;
               }
            } else if(var23 == 1) {
               for(var23 = 0; 257 > var23; ++var23) {
                  var25 = var23 << 4;

                  for(var24 = 1; -1 + ((Object[])((Object[])var0[7])).length > var24 && var25 >= ((int[][])((int[][])var0[7]))[var24][0]; ++var24) {
                     ;
                  }

                  var6 = ((int[][])((int[][])var0[7]))[-1 + var24];
                  var7 = ((int[][])((int[][])var0[7]))[var24];
                  var8 = (-var6[0] + var25 << 12) / (-var6[0] + var7[0]);
                  var9 = -usa.c[var8 >> 5 & 255] + 4096 >> 1;
                  var10 = -var9 + 4096;
                  var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                  if(var11 <= -32768) {
                     var11 = -32767;
                  }

                  if(var0 != null && 3 == var0.length && var0[2].equals(Integer.valueOf(1))) {
                     return;
                  }

                  if(var11 >= '\u8000') {
                     var11 = 32767;
                  }

                  ((short[])((short[])var0[9]))[var23] = (short)var11;
               }
            } else {
               for(var23 = 0; 257 > var23; ++var23) {
                  var25 = var23 << 4;

                  for(var24 = 1; -1 + ((Object[])((Object[])var0[7])).length > var24 && ((int[][])((int[][])var0[7]))[var24][0] <= var25; ++var24) {
                     ;
                  }

                  if(null != var0 && var0.length == 5) {
                     return;
                  }

                  var6 = ((int[][])((int[][])var0[7]))[-1 + var24];
                  var7 = ((int[][])((int[][])var0[7]))[var24];
                  var8 = (-var6[0] + var25 << 12) / (var7[0] + -var6[0]);
                  var9 = -var8 + 4096;
                  var10 = var7[1] * var8 + var9 * var6[1] >> 12;
                  if(-32768 >= var10) {
                     var10 = -32767;
                  }

                  if('\u8000' <= var10) {
                     var10 = 32767;
                  }

                  ((short[])((short[])var0[9]))[var23] = (short)var10;
               }
            }

         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var22) {
         throw vt.a(var22, "iha.A(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final void a(Object[] var0, int var1) {
      if(var1 != 9656) {
         h = (Object[])null;
      }

      ((float[])((float[])var0[0]))[0] = -((float[])((float[])var0[0]))[0];
      ((float[])((float[])var0[0]))[3] = -((float[])((float[])var0[0]))[3];
      ((float[])((float[])var0[0]))[2] = -((float[])((float[])var0[0]))[2];
      ++e;
   }

   static final Object[] a(int var0, int var1, Object[] var2) {
      ++a;
      if(var2[0] == null) {
         var2[0] = new int[1];
      }

      ((int[])((int[])var2[0]))[var1] = var0;
      return var2;
   }

}
