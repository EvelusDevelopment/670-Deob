
final class dg {

   static int g;
   static Object[] e = ho.a(4, 17, new Object[1], true);
   static int f;
   static int b;
   static int a;
   static int d;
   static int[] c = new int[2];


   static final void a(Object[] var0, boolean var1) {
      ++g;
      ((int[])((int[])var0[1]))[3] = ((int[])((int[])var0[1]))[3] << 8 | ((int[])((int[])var0[1]))[0];
      if(var1) {
         a(new Object[0], ((boolean[])((boolean[])e[4]))[0]);
      }

   }

   static final void a(lua var0, Object[] var1, int var2, Object[] var3, hsa var4, Object[] var5, byte var6) {
      ++a;
      int var9 = -8 % ((-5 - var6) / 60);
      float var7 = ck.a(87, (Object[])((Object[])var1[0]));
      float var8 = (float)var4.e();
      float var10 = (float)var4.d();
      Object[] var11 = var5;
      float[] var12 = new float[]{-1.0F, 1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 2.0F, 3.0F, 1.0F, 2.0F, 0.0F};
      int var13 = (int)var8;
      int var14 = (int)var10;
      int var15 = var13;
      int var16 = var14;
      if(var2 != 0) {
         if(1 != var2) {
            if(var2 != 2) {
               if(var2 == 3) {
                  var11 = var3;
                  an.a((Object[])((Object[])var1[3]), (Object[])((Object[])var1[4]), true);
                  mn.a(var5, (Object[])((Object[])var1[4]), (byte)74, 1, (Object[])((Object[])var1[12]));
                  rsa.a(-12423, (Object[])((Object[])var1[4]));
               }
            } else {
               var13 = 256;
               var14 = 256;
               var16 = var14;
               an.a((Object[])((Object[])var1[2]), (Object[])((Object[])var1[4]), true);
               var15 = var13;
               rsa.a(-12423, (Object[])((Object[])var1[4]));
               li.a((byte)-56, (Object[])((Object[])var1[4]), 0.0F, (Object[])((Object[])var1[5]), wfa.f / var10);
            }
         } else {
            var13 = 256;
            var14 = 256;
            var16 = var14;
            an.a((Object[])((Object[])var1[2]), (Object[])((Object[])var1[4]), true);
            var15 = var13;
            rsa.a(-12423, (Object[])((Object[])var1[4]));
            li.a((byte)-56, (Object[])((Object[])var1[4]), wfa.f / var8, (Object[])((Object[])var1[5]), 0.0F);
         }
      } else {
         var13 = 256;
         var14 = 256;
         an.a((Object[])((Object[])var1[6]), (Object[])((Object[])var1[4]), true);
         rsa.a(-12423, (Object[])((Object[])var1[4]));
      }

      if(null != var3 && var3.length == 1) {
         ol.c = 1.2671772F;
      }

      float var17 = (float)var13 / var8;
      float var18 = (float)var14 / var10;
      float var19 = (float)var15 / var8;
      var12[8] = -1.0F + (var12[8] + 1.0F) * var17;
      float var20 = (float)var16 / var10;
      var12[5] = 1.0F + (var12[5] - 1.0F) * var18;
      var12[10] *= var19;
      var12[7] *= var20;
      qr.a((Object[])((Object[])var1[4]), 773, (Object[])((Object[])var1[10]), var12);
      mn.a(var11, (Object[])((Object[])var1[4]), (byte)74, 0, (Object[])((Object[])var1[9]));
      fta.a((Object[])((Object[])var1[4]), 0.0F, (Object[])((Object[])var1[7]), dua.e, ol.c, (byte)21, gd.e);
      fta.a((Object[])((Object[])var1[4]), 256.0F / var10, (Object[])((Object[])var1[13]), 256.0F / var8, var7 / var8, (byte)21, var7 / var10);
      dd.a(0, var14, (byte)-100, var13, 0, (Object[])((Object[])var1[0]));
      dfa.a(0, -95, 0, var13, (Object[])((Object[])var1[0]), var14);
   }

   static final int a(int var0, Object[] var1) {
      ++f;
      if(var0 >= -84) {
         a(new Object[1], true);
      }

      return null != var1 && var1.length == 43 && ((int[])((int[])var1[12])).length == 58?gn.a(var1, (byte)-103):th.a(var1, 28);
   }

   static final void a(int var0, int var1, int var2, int var3, int var4) {
      ++d;
      int var5 = var3;
      int var6 = var2;
      int var7 = -var2;
      fka.a(var1, fda.c[var4], var2 + var0, -var2 + var0, (byte)-47);
      int var8 = -1;

      while(var6 > var5) {
         var8 += 2;
         var7 += var8;
         ++var5;
         if(var7 >= 0) {
            --var6;
            var7 -= var6 << 1;
            int[] var9 = fda.c[var4 + var6];
            int[] var10 = fda.c[-var6 + var4];
            int var11 = var5 + var0;
            int var12 = var0 - var5;
            fka.a(var1, var9, var11, var12, (byte)-50);
            fka.a(var1, var10, var11, var12, (byte)127);
         }

         int var13 = var6 + var0;
         int var15 = var0 + -var6;
         int[] var14 = fda.c[var5 + var4];
         int[] var16 = fda.c[var4 + -var5];
         fka.a(var1, var14, var13, var15, (byte)32);
         fka.a(var1, var16, var13, var15, (byte)91);
      }

   }

   static final void a(Object[] var0, byte var1) {
      try {
         qi.a((Object[])((Object[])var0[10]), (int)4);
      } catch (Exception var3) {
         ;
      }

      if(var1 != -54) {
         a((Object[])null, (byte)66);
      }

      ++b;
      var0[10] = null;
      ++((int[])((int[])var0[1]))[0];
      ((int[])((int[])var0[1]))[1] = -1;
      ((byte[])((byte[])var0[0]))[0] = (byte)((int)(Math.random() * 255.0D + 1.0D));
   }

}
