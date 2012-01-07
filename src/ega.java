import jaggl.OpenGL;

final class ega {

   static int b;
   static int e;
   static int c;
   static int[] a = new int[50];
   static int d;


   static final Object[] a(int var0, Object[] var1, byte[] var2) {
      var1[0] = rua.a(-13, var1);
      if(var0 > -18) {
         return (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])var1[29]))[0]))[14]);
      } else {
         ++e;
         var1[1] = var2;
         return var1;
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int[] var6, int var7) {
      ++b;
      if(0 < var2 && !ol.a((byte)67, var2)) {
         throw new IllegalArgumentException("");
      } else if(var7 > 0 && !ol.a((byte)99, var7)) {
         throw new IllegalArgumentException("");
      } else if(var1 != '\u80e1') {
         throw new IllegalArgumentException("");
      } else {
         int var8 = 0;
         if(var0 != -768979816) {
            a(false, (byte)-42, -19);
         }

         int var9 = var2 >= var7?var7:var2;
         int var10 = var2 >> 1;
         int var11 = var7 >> 1;
         int[] var12 = var6;
         int[] var13 = new int[var10 * var11];

         while(true) {
            OpenGL.glTexImage2Di(var5, var8, var3, var2, var7, 0, var1, var4, var12, 0);
            if(1 >= var9) {
               return;
            }

            int var15 = 0;
            int var24 = 0;
            int var25 = var2 + var24;
            int[] var14 = var13;

            for(int var26 = 0; var26 < var11; ++var26) {
               for(int var27 = 0; var27 < var10; ++var27) {
                  int var16 = var12[var24++];
                  int var18 = var12[var25++];
                  int var17 = var12[var24++];
                  int var22 = 255 & var16;
                  int var19 = var12[var25++];
                  int var21 = 255 & var16 >> 8;
                  int var20 = 255 & var16 >> 16;
                  int var23 = var16 >> 24 & 255;
                  var21 += 255 & var17 >> 8;
                  var23 += var17 >> 24 & 255;
                  var22 += var17 & 255;
                  var20 += var17 >> 16 & 255;
                  var20 += (var18 & 16734982) >> 16;
                  var22 += var18 & 255;
                  var21 += var18 >> 8 & 255;
                  var23 += 255 & var18 >> 24;
                  var23 += 255 & var19 >> 24;
                  var20 += var19 >> 16 & 255;
                  var21 += 255 & var19 >> 8;
                  var22 += 255 & var19;
                  var13[var15++] = var22 >> 2 & 255 | (var21 & 1020) << 6 | (1020 & var23) << 22 | (var20 & 1020) << 14;
               }

               var24 += var2;
               var25 += var2;
            }

            var13 = var12;
            var12 = var14;
            var7 = var11;
            var2 = var10;
            var9 >>= 1;
            var11 >>= 1;
            var10 >>= 1;
            ++var8;
         }
      }
   }

   static final void a(boolean var0, byte var1, int var2) {
      ++d;
      Object[] var4 = fk.a(Integer.MIN_VALUE, var2, var0);
      if(var4 != null) {
         if(var1 >= -118) {
            a(true, (byte)86, 116);
         }

         ((lm)(null != var4?var4[1]:null)).a((byte)33);
      }
   }

   static final void a(Object[] var0, byte var1) throws Throwable {
      Class_t.a(true, var0);
      ++c;
      ((jj)var0[4]).b(0);
      if(var1 != 123) {
         a = (int[])((int[])var0[0]);
      }

   }

}
