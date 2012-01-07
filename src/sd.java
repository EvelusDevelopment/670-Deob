import java.math.BigInteger;

final class sd {

   static int d;
   static int b;
   static BigInteger a = new BigInteger("c63e1a700e97d422de60a3d522cb00b56305b6e631f14bdbdbc9ec127d48ed8fc5188a2ec46178219ed1c11d7d27f4e597550ab53e6cc7079ddc537df5eb5ed9", 16);
   static int e;
   static int g;
   static int c;
   static Object[] f = ve.a(new Object[1], (byte)3, 2);


   static final void a(Object[] var0, int var1) {
      synchronized(var0[0]) {
         lga.b(var1 ^ var1, (Object[])((Object[])var0[0]));
      }

      ++d;
   }

   static final void a(byte var0, int var1) {
      ++e;
      if(null == fga.d) {
         fga.d = new byte[4][rp.c][wpa.a];
      }

      for(int var2 = var1; var2 < 4; ++var2) {
         for(int var3 = 0; rp.c > var3; ++var3) {
            for(int var4 = 0; wpa.a > var4; ++var4) {
               fga.d[var2][var3][var4] = var0;
            }
         }
      }

   }

   static final boolean a(int var0, int var1) {
      ++b;
      if(var0 != 12) {
         a((byte)-116, 41);
      }

      return 9 == var1 || 8 == var1 || 6 == var1 || var1 == 12;
   }

   static final void a(byte var0) {
      ++c;
      if(en.c == null) {
         en.c = new int[65536];
         double var1 = 0.7D + -0.015D + Math.random() * 0.03D;
         if(var0 > -36) {
            ((byte[])((byte[])f[0]))[0] = -67;
         }

         int var3 = 0;

         for(int var4 = 0; var4 < 512; ++var4) {
            float var5 = (0.0078125F + (float)(var4 >> 3) / 64.0F) * 360.0F;
            float var6 = (float)(var4 & 7) / 8.0F + 0.0625F;

            for(int var7 = 0; 128 > var7; ++var7) {
               float var8 = (float)var7 / 128.0F;
               float var9 = 0.0F;
               float var10 = 0.0F;
               float var11 = 0.0F;
               float var12 = var5 / 60.0F;
               int var13 = (int)var12;
               int var14 = var13 % 6;
               float var15 = var12 - (float)var13;
               float var16 = var8 * (-var6 + 1.0F);
               float var17 = (-(var6 * var15) + 1.0F) * var8;
               float var18 = (-(var6 * (1.0F - var15)) + 1.0F) * var8;
               if(0 != var14) {
                  if(1 != var14) {
                     if(2 != var14) {
                        if(3 == var14) {
                           var11 = var8;
                           var9 = var16;
                           var10 = var17;
                        } else if(var14 != 4) {
                           if(var14 == 5) {
                              var10 = var16;
                              var9 = var8;
                              var11 = var17;
                           }
                        } else {
                           var11 = var8;
                           var9 = var18;
                           var10 = var16;
                        }
                     } else {
                        var10 = var8;
                        var9 = var16;
                        var11 = var18;
                     }
                  } else {
                     var9 = var17;
                     var10 = var8;
                     var11 = var16;
                  }
               } else {
                  var11 = var16;
                  var10 = var18;
                  var9 = var8;
               }

               var9 = (float)Math.pow((double)var9, var1);
               var10 = (float)Math.pow((double)var10, var1);
               var11 = (float)Math.pow((double)var11, var1);
               int var19 = (int)(256.0F * var9);
               int var20 = (int)(256.0F * var10);
               int var21 = (int)(256.0F * var11);
               int var22 = (var20 << 8) + (var19 << 16) + -16777216 + var21;
               en.c[var3++] = var22;
            }
         }

      }
   }

   static final Object[] a(Object[] var0, int var1, byte var2) {
      jv.b(var0, (byte)-88);
      if(var2 < 110) {
         return (Object[])null;
      } else {
         ++g;
         ((int[])((int[])var0[0]))[0] = var1;
         return var0;
      }
   }

}
