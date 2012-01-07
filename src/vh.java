
final class vh {

   static int c;
   static int e;
   static int d;
   static int a;
   static int g;
   static int[] f;
   static int[] b = new int[6];


   static final Object[] a(int var0, boolean var1, Object[] var2, Object[] var3, byte[] var4, int var5, int var6) {
      ++g;
      int var8 = 112 / ((-50 - var0) / 54);
      Object[] var7;
      if(null != var2 && -88 == ~var2.length) {
         var7 = mka.a(-124, var4, var3, var6, 0, 0, var2, var5, var1);
      } else {
         if(var2 == null || var2.length != 91) {
            throw new IllegalStateException();
         }

         var7 = ipa.a(0, var3, var6, var1, var5, var4, 2, 0, var2);
      }

      return var7;
   }

   static final void putIntLE(int var0, Object[] var1, int var2) {
      ++e;
      byte[] var10000 = (byte[])((byte[])var1[2]);
      int[] var10001 = (int[])((int[])var1[1]);
      int var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)var2;
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)(var2 >> 8);
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[var0];
      var10001[var0] = ((int[])((int[])var1[1]))[var0] + 1;
      var10000[var10004] = (byte)(var2 >> 16);
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)(var2 >> 24);
   }

   static final float a(boolean var0, float var1) {
      ++c;
      if(var0) {
         a((byte)25, -82L);
      }

      return ((-15.0F + var1 * 6.0F) * var1 + 10.0F) * var1 * var1 * var1;
   }

   static final void a(float[] var0, int var1, int var2, int var3, int[] var4, byte var5, int var6, int var7, float[] var8, int var9, int var10, int[] var11, int var12) {
      ++d;
      int var14 = 33 % ((79 - var5) / 38);
      int var13 = var3 + var10 * var12;
      int var15 = var7 * var1 + var2;
      int var16 = -var9 + var12;
      int var17 = -var9 + var1;
      int var19;
      int var18;
      if(null != var4) {
         if(null == var0) {
            for(var18 = 0; var6 > var18; ++var18) {
               for(var19 = var13 + var9; var19 > var13; var11[var15++] = var4[var13++]) {
                  ;
               }

               var13 += var16;
               var15 += var17;
            }
         } else {
            for(var18 = 0; var6 > var18; ++var18) {
               for(var19 = var13 + var9; var13 < var19; var8[var15++] = var0[var13++]) {
                  var11[var15] = var4[var13];
               }

               var15 += var17;
               var13 += var16;
            }
         }
      } else {
         for(var18 = 0; var6 > var18; ++var18) {
            for(var19 = var13 - -var9; var13 < var19; var8[var15++] = var0[var13++]) {
               ;
            }

            var13 += var16;
            var15 += var17;
         }
      }

   }

   static final void a(byte var0, long var1) {
      ++a;
      int var3 = vda.f;
      int var5;
      int var6;
      if(fha.o != var3) {
         var5 = var3 - fha.o;
         var6 = (int)((long)var5 * var1 / 320L);
         if(0 < var5) {
            if(var6 != 0) {
               if(var6 > var5) {
                  var6 = var5;
               }
            } else {
               var6 = 1;
            }
         } else if(var6 != 0) {
            if(var6 < var5) {
               var6 = var5;
            }
         } else {
            var6 = -1;
         }

         fha.o += var6;
      }

      int var4 = Class_b.h;
      qv.f_i += 8.0F * ((float)var1 * rba.k / 40.0F);
      if(var4 != hq.a) {
         var5 = -hq.a + var4;
         var6 = (int)(var1 * (long)var5 / 320L);
         if(0 < var5) {
            if(0 != var6) {
               if(var5 < var6) {
                  var6 = var5;
               }
            } else {
               var6 = 1;
            }
         } else if(var6 != 0) {
            if(var5 > var6) {
               var6 = var5;
            }
         } else {
            var6 = -1;
         }

         hq.a += var6;
      }

      sma.h += 8.0F * ((float)var1 * fja.d / 40.0F);
      woa.a((byte)-120);
      if(var0 > -44) {
         a(19, false, (Object[])null, (Object[])null, (byte[])null, 112, -115);
      }

   }

}
