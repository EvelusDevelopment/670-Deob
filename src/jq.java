import jaggl.OpenGL;

final class jq {

   static Object[] a = nb.a((byte)73, 16, new Object[5]);
   static int f;
   static int c;
   static int e;
   static int d;
   static int[] b = new int[32];


   static final boolean a(Object[] var0, int var1, int var2) {
      ++e;
      if(var0 != null && 10 == var0.length) {
         boolean var3 = true;
         return var3;
      } else {
         if(var2 != 1) {
            a(new Object[25], 11, ((int[])((int[])((Object[])((Object[])var0[0]))[1]))[34]);
         }

         if(null != var0 && var0.length == 9) {
            return qj.a(var1, 35, var0);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(int var0, int var1, int var2, byte[] var3, int var4, int var5) {
      ++d;
      if(var2 > var4) {
         var5 += var4;
         if(var1 == 1283390664) {
            var0 = var2 + -var4 >> 2;

            while(true) {
               --var0;
               if(var0 < 0) {
                  var0 = 3 & -var4 + var2;

                  while(true) {
                     --var0;
                     if(var0 < 0) {
                        return;
                     }

                     var3[var5++] = 1;
                  }
               }

               var3[var5++] = 1;
               var3[var5++] = 1;
               var3[var5++] = 1;
               var3[var5++] = 1;
            }
         }
      }
   }

   static final void a(Object[] var0, int var1, int var2, int[] var3, int var4, int var5) {
      ++c;
      if(var5 > 0 && !ol.a((byte)-84, var5)) {
         throw new IllegalArgumentException("");
      } else if(var4 > 0 && !ol.a((byte)-50, var4)) {
         throw new IllegalArgumentException("");
      } else if(ah.f != var0[6]) {
         throw new IllegalArgumentException("");
      } else {
         int var6 = var2;
         int var7 = var4 <= var5?var4:var5;
         int var8 = var5 >> 1;
         int var9 = var4 >> 1;
         int[] var10 = var3;
         int[] var11 = new int[var9 * var8];

         while(true) {
            OpenGL.glTexImage2Di(var1, var6, vb.a(-89, (Object[])((Object[])var0[3]), (Object[])((Object[])var0[6])), var5, var4, 0, '\u80e1', ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[40], var10, 0);
            if(1 >= var7) {
               return;
            }

            int var13 = 0;
            int var22 = 0;
            int var23 = var5 + var22;

            for(int var24 = 0; var24 < var9; ++var24) {
               if(null != var0 && 1 == var0.length && var0[0].equals(Integer.valueOf(2))) {
                  return;
               }

               for(int var25 = 0; var8 > var25; ++var25) {
                  int var14 = var10[var22++];
                  int var15 = var10[var22++];
                  int var16 = var10[var23++];
                  int var21 = var14 >> 24 & 255;
                  int var18 = (var14 & 16727774) >> 16;
                  int var17 = var10[var23++];
                  int var19 = var14 >> 8 & 255;
                  int var20 = var14 & 255;
                  var21 += var15 >> 24 & 255;
                  var20 += 255 & var15;
                  var19 += ('\uff77' & var15) >> 8;
                  var18 += var15 >> 16 & 255;
                  var19 += (var16 & '\uffb9') >> 8;
                  var18 += (16730989 & var16) >> 16;
                  if(null != var0 && -3 == ~var0.length) {
                     cd.a(-13, 5, (Object[])null);
                  }

                  var20 += 255 & var16;
                  var21 += var16 >> 24 & 255;
                  var21 += 255 & var17 >> 24;
                  var20 += var17 & 255;
                  var18 += (16714742 & var17) >> 16;
                  var19 += ('\uff02' & var17) >> 8;
                  var11[var13++] = var21 << 22 & -16777216 | (var18 & 1020) << 14 | (var19 & 1020) << 6 | var20 >> 2 & 255;
               }

               var22 += var5;
               var23 += var5;
            }

            int[] var12 = var11;
            var11 = var10;
            var10 = var12;
            var4 = var9;
            var5 = var8;
            var7 >>= 1;
            ++var6;
            var8 >>= 1;
            var9 >>= 1;
         }
      }
   }

}
