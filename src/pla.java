
final class pla {

   static int a;
   static int e;
   static int b = 0;
   static int d;
   static int c;


   static final Object[] a(int var0, Object[] var1, Object[] var2) {
      if(null == var1[1]) {
         var1[1] = new int[2];
      }

      ++a;
      aa.a(15022, var2, var1);
      if(var0 >= -104) {
         a((byte)16, ((int[])((int[])((Object[])((Object[])var1[13]))[1]))[6], -2.1516018F, (float[])((float[])var2[17]), ((float[])((float[])var1[1]))[7], -31, ((int[])((int[])var2[28]))[7], -0.16471273F, -1.0041313F, (Object[])((Object[])var2[7]), ((int[])((int[])var2[5]))[12], 37);
      }

      return var1;
   }

   static final boolean a(int var0, Object[] var1) {
      ++c;
      if(var0 != 8) {
         ((byte[])((byte[])((Object[])((Object[])var1[15]))[1]))[4] = 68;
      }

      return ((boolean[])((boolean[])var1[8]))[4];
   }

   static final void a(Object[] var0, boolean var1, byte var2) {
      if(null != var0[4] && var1) {
         if(!((boolean[])((boolean[])var0[5]))[0]) {
            nha.a((Object[])((Object[])var0[0]), 18806, 2);
            moa.a((byte)115, (Object[])((Object[])((Object[])((Object[])var0[0]))[7]), (Object[])((Object[])var0[0]));
            nha.a((Object[])((Object[])var0[0]), 18806, 0);
         }

         efa.a((Object[])((Object[])var0[4]), '\u0000', 0);
         ((boolean[])((boolean[])var0[5]))[1] = true;
      } else {
         db.a(770, (Object[])((Object[])var0[0]), (byte)-68, 0, '\u8578');
      }

      ++e;
      if(var2 != -28) {
         b = 29;
      }

   }

   static final void a(byte var0, int var1, float var2, float[] var3, float var4, int var5, int var6, float var7, float var8, Object[] var9, int var10, int var11) {
      if(var0 == 87) {
         ++d;
         int var12 = (int)((float)var1 * var4 - 1.0F);
         var12 &= 255;
         int var13 = (int)((float)var5 * var8 - 1.0F);
         var13 &= 255;
         int var14 = (int)((float)var6 * var2 - 1.0F);
         var14 &= 255;
         float var15 = (float)var10 * var2;
         int var16 = (int)var15;
         int var17 = 1 + var16;
         float var18 = (float)(-var16) + var15;
         float var19 = 1.0F - var18;
         float var20 = vh.a(false, var18);
         var17 &= var14;
         var16 &= var14;
         int var21 = ((int[])((int[])var9[0]))[var16];
         int var22 = ((int[])((int[])var9[0]))[var17];

         for(int var23 = 0; var23 < var5; ++var23) {
            float var24 = var8 * (float)var23;
            int var25 = (int)var24;
            if(null != var9 && 3 == var9.length && var9[1].equals(Integer.valueOf(2)) && var9[1].equals(Boolean.valueOf(false))) {
               a((byte)87, 100, -0.09153242F, (float[])null, 1.0848876F, 17, 110, 0.6141501F, -0.8493185F, (Object[])null, 26, -18);
            }

            int var26 = var25 + 1;
            float var27 = (float)(-var25) + var24;
            float var28 = 1.0F - var27;
            var26 &= var13;
            var25 &= var13;
            float var29 = vh.a(false, var27);
            int var30 = ((int[])((int[])var9[0]))[var21 + var25];
            int var31 = ((int[])((int[])var9[0]))[var26 + var21];
            int var32 = ((int[])((int[])var9[0]))[var22 + var25];
            int var33 = ((int[])((int[])var9[0]))[var22 + var26];

            for(int var34 = 0; var1 > var34; ++var34) {
               float var35 = var4 * (float)var34;
               int var36 = (int)var35;
               int var37 = var36 + 1;
               float var38 = var35 - (float)var36;
               float var39 = -var38 + 1.0F;
               var36 &= var12;
               var37 &= var12;
               float var40 = vh.a(false, var38);
               var3[var11++] = var7 * kj.a(-32, kj.a(-32, kj.a(-32, fma.a(7 & ((int[])((int[])var9[0]))[var30 + var36], (byte)53, var39, var28, var19), var40, fma.a(((int[])((int[])var9[0]))[var37 + var30] & 7, (byte)125, var38, var28, var19)), var29, kj.a(var0 - 119, fma.a(((int[])((int[])var9[0]))[var36 + var31] & 7, (byte)-68, var39, var27, var19), var40, fma.a(7 & ((int[])((int[])var9[0]))[var37 + var31], (byte)-93, var38, var27, var19))), var20, kj.a(var0 ^ -73, kj.a(var0 - 119, fma.a(7 & ((int[])((int[])var9[0]))[var32 + var36], (byte)-116, var39, var28, var18), var40, fma.a(7 & ((int[])((int[])var9[0]))[var37 + var32], (byte)-84, var38, var28, var18)), var29, kj.a(-32, fma.a(((int[])((int[])var9[0]))[var36 + var33] & 7, (byte)-128, var39, var27, var18), var40, fma.a(7 & ((int[])((int[])var9[0]))[var37 + var33], (byte)121, var38, var27, var18))));
            }
         }

      }
   }

}
