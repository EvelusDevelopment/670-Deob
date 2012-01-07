import jagdx.IDirect3DDevice;

final class pi extends tha {

   static int v;
   static int D;
   Object[] x;
   static int z;
   static int t;
   static int u;
   static Object[] B = ho.a(1, 62, new Object[1], true);
   static int A;
   static int C;
   static Object[] w = ho.a(9, 6, new Object[1], true);
   static Object[] y;


   static final Object[] a(Object[] var0, int var1, byte var2, Object[] var3) {
      ++v;
      lra.a(var0, 16830, var1, var3);
      int var4 = 97 % ((var2 - 30) / 62);
      return var0;
   }

   static final void b(Object[] var0, boolean var1, Object[] var2) {
      ++D;
      long var3 = ((long[])((long[])var0[50]))[5];
      int var5 = ((int[])((int[])var0[1]))[7];
      long var6;
      if(var2 != null && -14 == ~var2.length) {
         var6 = hi.a(var2, true);
      } else if(null != var2 && (10 == var2.length || -16 == ~var2.length)) {
         var6 = rv.a(15, var2);
      } else {
         long var8 = ((long[])((long[])var2[2]))[0];
         var6 = var8;
      }

      IDirect3DDevice.SetTexture(var3, var5, var6);
      if(var1) {
         y = (Object[])null;
      }

      if(((boolean[])((boolean[])var0[63]))[16] && !((boolean[])((boolean[])var0[78]))[((int[])((int[])var0[1]))[7]]) {
         ((boolean[])((boolean[])var0[78]))[((int[])((int[])var0[1]))[7]] = true;
         eo.a(var0, (byte)-63);
         sn.a(var0, (byte)-111);
      }

   }

   pi(Object[] var1) {
      this.x = var1;
   }

   static final void a(int var0, Object[] var1, Class_s var2, long var3, int var5, int var6, int var7, int var8, int var9) {
      ++u;
      int var10 = var7 * var7 + var5 * var5;
      if(~((long)var10) >= ~var3) {
         int var11 = Math.min(((int[])((int[])var1[var9]))[70] / 2, ((int[])((int[])var1[1]))[2] / 2);
         if(var11 * var11 >= var10) {
            rh.a(var0, var8, 8, var1, var2, var5, var7, gfa.c[var6]);
         } else {
            var11 -= 10;
            int var12;
            if(1 != ha.e) {
               var12 = 16383 & coa.v + (int)sma.h;
            } else {
               var12 = 16383 & (int)sma.h;
            }

            int var13 = tda.p[var12];
            int var14 = tda.k[var12];
            if(1 != ha.e) {
               var14 = 256 * var14 / (kma.b + 256);
               var13 = 256 * var13 / (kma.b + 256);
            }

            int var15 = var14 * var5 + var7 * var13 >> 14;
            int var16 = -(var13 * var5) + var14 * var7 >> 14;
            double var17 = Math.atan2((double)var15, (double)var16);
            int var19 = (int)((double)var11 * Math.sin(var17));
            int var20 = (int)((double)var11 * Math.cos(var17));
            if(var1 != null && -2 == ~var1.length && var1[0].equals(Integer.valueOf(1))) {
               ((Object[])((Object[])ja.w[5]))[3] = null;
            }

            fra.B[var6].a((float)var8 + (float)((int[])((int[])var1[1]))[70] / 2.0F + (float)var19, (float)var0 + (float)((int[])((int[])var1[1]))[2] / 2.0F - (float)var20, 4096, (int)(65535.0D * (-var17 / 6.283185307179586D)));
         }

      }
   }

   static final boolean a(int var0, Object[] var1) {
      ++C;
      boolean var2 = true;
      if(var0 < 42) {
         w = (Object[])null;
      }

      synchronized(((Object[])((Object[])var1[0]))[2]) {
         for(int var4 = 0; var4 < 5; ++var4) {
            if(-1 != ((int[])((int[])var1[4]))[var4] && !Class_ss.a(0, 5, (Object[])((Object[])((Object[])((Object[])var1[0]))[2]), ((int[])((int[])var1[4]))[var4])) {
               var2 = false;
            }
         }

         if(null != var1 && var1.length == 6 && var1[4].equals(Integer.valueOf(2))) {
            kla.c((byte)-65, (Object[])null);
         }

         return var2;
      }
   }

   static final Object[] a(Object[] var0, byte var1, int var2, int var3, int var4, int var5, int var6) {
      ++A;
      if(var0[1] == null) {
         var0[1] = new int[13];
      }

      if(null == var0[0]) {
         var0[0] = new byte[1];
      }

      ((int[])((int[])var0[1]))[6] = var3;
      ((int[])((int[])var0[1]))[1] = var4;
      ((int[])((int[])var0[1]))[3] = var5;
      ((int[])((int[])var0[var2]))[10] = var6;
      ((byte[])((byte[])var0[0]))[0] = var1;
      return var0;
   }

   static final nqa a(byte var0, Object[] var1) {
      ++t;
      if(var0 >= -48) {
         b((Object[])((Object[])((Object[])((Object[])var1[3]))[15]), true, (Object[])null);
      }

      return new nqa(var1);
   }

   static final void a(Object[] var0, byte var1, int var2, int var3, int var4, ta var5) {
      if(var1 != -58) {
         a((Object[])((Object[])y[2]), ((byte[])((byte[])((Object[])((Object[])var0[5]))[0]))[6], ((int[])((int[])y[0]))[0], ((int[])((int[])B[0]))[0], 68, -66, -126);
      }

      ++z;
      if(null != var0 && var0.length == 1) {
         a((Object[])null, (byte)-58, 35, 27, -78, (ta)null);
      }

      for(int var6 = 7; 0 <= var6; --var6) {
         if(var0 != null && 8 == var0.length && var0[1].equals(Integer.valueOf(0))) {
            a((Object[])null, (byte)-58, 6, -29, 109, (ta)null);
         }

         for(int var7 = 127; 0 <= var7; --var7) {
            tia.a(-927416089, true, false);
            int var8 = var7 & 127 | (var6 & 7) << 7 | (var2 & 63) << 10;
            int var9 = tpa.f[var8];
            dla.a(false, 32396, true);
            var5.r(var4 + (var7 * ((int[])((int[])var0[1]))[70] >> 7), ((-var6 + 7) * ((int[])((int[])var0[1]))[2] >> 3) + var3, (((int[])((int[])var0[1]))[70] >> 7) + 1, (((int[])((int[])var0[1]))[2] >> 3) + 1, var9, 0);
         }
      }

   }

}
