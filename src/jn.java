
final class jn {

   static boolean g = false;
   static aea e;
   static int a;
   static int d;
   static int f_i;
   static int h;
   static int f;
   static int b;
   static int c;


   static final void a(Object[] var0, int var1) {
      ++f_i;
      if(var1 != 27395) {
         a(-6, -30, ((int[])((int[])var0[4]))[0], (ka)var0[16], (Object[])((Object[])var0[3]), (ta)var0[0], ((byte[])((byte[])var0[8]))[0], -102, 124, -109, ((int[])((int[])var0[14]))[6], -99, ((int[])((int[])var0[2]))[0]);
      }

   }

   static final ka a(int var0, int var1, int var2, ka var3, Object[] var4, ta var5, byte var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      ++f;
      if(null == var3) {
         return null;
      } else if(var6 < 94) {
         return (ka)var4[5];
      } else {
         int var13 = 2055;
         if(var4 != null) {
            var13 |= mo.a(true, var4);
            var13 &= -513;
         }

         long var14 = (long)((var7 << 16) + var8 + (var11 << 24)) + ((long)var10 << 32) + ((long)var12 << 48);
         if(var4 != null && var4.length == 3 && var4[2].equals(Integer.valueOf(0))) {
            rra.f = 14;
         }

         Object[] var17 = vi.e;
         ka var16;
         synchronized(vi.e) {
            var16 = (ka)dna.a((byte)34, vi.e, var14);
         }

         if(null == var16 || var5.d(var16.va(), var13) != 0) {
            if(var16 != null) {
               var13 = var5.a(var13, var16.va());
            }

            if(var4 != null && 1 == var4.length && var4[0].equals(Integer.valueOf(2)) && var4[0].equals(Integer.valueOf(0))) {
               a(((int[])((int[])((Object[])((Object[])vi.e[16]))[0]))[0], 32, 44, (ka)null, (Object[])((Object[])((Object[])((Object[])vi.e[6]))[13]), (ta)vi.e[6], (byte)101, -33, ((int[])((int[])vi.e[12]))[5], 91, ((int[])((int[])vi.e[0]))[13], ((int[])((int[])vi.e[25]))[8], 104);
            }

            byte var33;
            if(1 != var8) {
               if(2 != var8) {
                  if(3 == var8) {
                     var33 = 15;
                  } else if(var8 == 4) {
                     var33 = 18;
                  } else {
                     var33 = 21;
                  }
               } else {
                  var33 = 12;
               }
            } else {
               var33 = 9;
            }

            byte var18 = 3;
            int[] var19 = new int[]{64, 96, 128};
            ii var20 = new ii(1 + var33 * var18, 2 * var18 * var33 + -var33, 0);
            int var21 = var20.c(0, 0, 0);
            int[][] var22 = new int[var18][var33];

            int var23;
            int var25;
            int var24;
            int var28;
            for(var23 = 0; var18 > var23; ++var23) {
               var24 = var19[var23];
               var25 = var19[var23];

               for(int var26 = 0; var33 > var26; ++var26) {
                  int var27 = (var26 << 15604174) / var33;
                  var28 = var24 * tda.p[var27] >> 14;
                  int var29 = var25 * tda.k[var27] >> 14;
                  var22[var23][var26] = var20.c(var28, 0, var29);
               }
            }

            for(var23 = 0; var23 < var18; ++var23) {
               var24 = (256 * var23 + 128) / var18;
               var25 = -var24 + 256;
               byte var39 = (byte)(var11 * var24 + var25 * var7 >> 8);
               if(null != var4 && (-11 == ~var4.length && var4[7].equals(Integer.valueOf(0)) && var4[7].equals(Integer.valueOf(0)) || var4.length == 8)) {
                  vi.e = null;
               }

               short var40 = (short)((32512 & var24 * (var12 & 127) + (127 & var10) * var25) + (229376 & var24 * (var12 & 896) + var25 * (896 & var10)) + (('\ufc00' & var10) * var25 + var24 * ('\ufc00' & var12) & 16515072) >> 8);

               for(var28 = 0; var33 > var28; ++var28) {
                  if(var23 == 0) {
                     var20.a(var21, var22[0][(var28 + 1) % var33], var22[0][var28], (byte)1, (byte)-1, var40, var39, (short)-1);
                  } else {
                     var20.a(var22[var23 - 1][var28], var22[var23 - 1][(var28 + 1) % var33], var22[var23][(1 + var28) % var33], (byte)1, (byte)-1, var40, var39, (short)-1);
                     var20.a(var22[-1 + var23][var28], var22[var23][(var28 + 1) % var33], var22[var23][var28], (byte)1, (byte)-1, var40, var39, (short)-1);
                  }
               }
            }

            var16 = var5.a(var20, var13, rra.f, 64, 768);
            Object[] var38 = vi.e;
            synchronized(vi.e) {
               il.a(var14, var16, true, vi.e);
            }
         }

         int var34 = var3.LA();
         int var36 = var3.RA();
         int var35 = var3.da();
         int var37 = var3.D();
         if(var4 != null) {
            var16 = var16.a((byte)3, var13, true);
            var16.v(-var34 + var36 >> 1, 128, var37 + -var35 >> 1);
            var16.K(var34 + var36 >> 1, 0, var35 + var37 >> 1);
            gsa.a(var16, 111, var4);
         } else {
            var16 = var16.a((byte)3, var13, true);
            var16.v(-var34 + var36 >> 1, 128, var37 - var35 >> 1);
            var16.K(var36 + var34 >> 1, 0, var35 + var37 >> 1);
         }

         if(var9 != 0) {
            var16.UA(var9);
         }

         if(var1 != 0) {
            var16.fa(var1);
         }

         if(0 != var2) {
            var16.K(0, var2, 0);
         }

         return var16;
      }
   }

   static final void a(int var0, Object[] var1) {
      Class_fs.a(var1, 0);
      if(var0 != 96) {
         g = true;
      }

      ++d;
   }

   static final vta a(byte var0, Object[] var1) {
      int var2 = -117 % ((34 - var0) / 60);
      ++h;
      return new vta(var1);
   }

   static final void a(float var0, float var1, float[] var2, Object[] var3, boolean var4, float var5) {
      if(var4) {
         var2[1] = ((float[])((float[])var3[0]))[13] + ((float[])((float[])var3[0]))[9] * var5 + var1 * ((float[])((float[])var3[0]))[5] + ((float[])((float[])var3[0]))[1] * var0;
         var2[2] = ((float[])((float[])var3[0]))[14] + ((float[])((float[])var3[0]))[6] * var1 + ((float[])((float[])var3[0]))[2] * var0 + var5 * ((float[])((float[])var3[0]))[10];
         ++a;
         var2[0] = ((float[])((float[])var3[0]))[8] * var5 + ((float[])((float[])var3[0]))[0] * var0 + ((float[])((float[])var3[0]))[4] * var1 + ((float[])((float[])var3[0]))[12];
         if(var2.length > 3) {
            var2[3] = var5 * ((float[])((float[])var3[0]))[11] + ((float[])((float[])var3[0]))[3] * var0 + var1 * ((float[])((float[])var3[0]))[7] + ((float[])((float[])var3[0]))[15];
         }

      }
   }

   static final Object[] b(byte var0, Object[] var1) {
      ++b;
      int var2 = 0 % ((var0 + 27) / 52);
      return ai.d;
   }

   static final lm b(int var0, Object[] var1) {
      if(var0 != 26224) {
         a(((int[])((int[])var1[0]))[1], -53, -48, (ka)((Object[])((Object[])var1[1]))[8], (Object[])((Object[])var1[22]), (ta)null, (byte)-90, 51, ((int[])((int[])((Object[])((Object[])var1[8]))[3]))[2], -112, 42, -125, -112);
      }

      ++c;
      lm var2 = ((lm)((Object[])((Object[])var1[0]))[0]).f;
      if(((Object[])((Object[])var1[0]))[0] != var2) {
         var1[1] = var2.f;
         return var2;
      } else {
         var1[1] = null;
         return null;
      }
   }

}
