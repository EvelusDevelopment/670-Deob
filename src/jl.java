
final class jl {

   static int f;
   static int a;
   static Object[] e = vra.a(536870911, 14, "", new Object[1]);
   static int[] d;
   static int g;
   static int c = 0;
   static Object[] b = sj.a(8, new Object[3], (byte)-47);


   static final void a(String var0, int var1, int var2, String var3, String var4, int var5, String var6) {
      laa.a((String)null, -1, var0, var1, var3, var6, var5, var4, 0);
      ++f;
      if(var2 != 8191) {
         a((String)null, -41, ((int[])((int[])e[12]))[6], (String)null, (String)null, ((int[])((int[])b[1]))[7], (String)null);
      }

   }

   static final void a(int var0) {
      ++a;
      int var1 = ks.c * 512 + 256;
      int var2 = 512 * moa.g + 256;
      int var3 = Class_ds.a(jca.n, var1, var2, (byte)122) + -cja.g;
      if(bqa.a >= 100) {
         woa.M = 256 + 512 * ks.c;
         pta.f = 256 + 512 * moa.g;
         qt.e = Class_ds.a(jca.n, woa.M, pta.f, (byte)122) + -cja.g;
      } else {
         if(woa.M < var1) {
            woa.M += gha.f_i + bqa.a * (-woa.M + var1) / 1000;
            if(var1 < woa.M) {
               woa.M = var1;
            }
         }

         if(var3 > qt.e) {
            qt.e += gha.f_i + (var3 + -qt.e) * bqa.a / 1000;
            if(qt.e > var3) {
               qt.e = var3;
            }
         }

         if(woa.M > var1) {
            woa.M -= gha.f_i + bqa.a * (woa.M - var1) / 1000;
            if(woa.M < var1) {
               woa.M = var1;
            }
         }

         if(var2 > pta.f) {
            pta.f += gha.f_i + bqa.a * (-pta.f + var2) / 1000;
            if(pta.f > var2) {
               pta.f = var2;
            }
         }

         if(qt.e > var3) {
            qt.e -= (-var3 + qt.e) * bqa.a / 1000 + gha.f_i;
            if(qt.e < var3) {
               qt.e = var3;
            }
         }

         if(pta.f > var2) {
            pta.f -= gha.f_i + (-var2 + pta.f) * bqa.a / 1000;
            if(var2 > pta.f) {
               pta.f = var2;
            }
         }
      }

      var2 = var0 + 512 * mka.b;
      var1 = 512 * pia.b + 256;
      var3 = Class_ds.a(jca.n, var1, var2, (byte)122) + -of.b;
      int var4 = -woa.M + var1;
      int var5 = var3 + -qt.e;
      int var6 = -pta.f + var2;
      int var7 = (int)Math.sqrt((double)(var4 * var4 + var6 * var6));
      int var8 = (int)(2607.5945876176133D * Math.atan2((double)var5, (double)var7)) & 16383;
      if(1024 > var8) {
         var8 = 1024;
      }

      int var9 = 16383 & (int)(Math.atan2((double)var4, (double)var6) * -2607.5945876176133D);
      if(3072 < var8) {
         var8 = 3072;
      }

      if(var8 > qaa.r) {
         qaa.r += mma.a * (var8 + -qaa.r >> 3) / 1000 + rf.f << 3;
         if(var8 < qaa.r) {
            qaa.r = var8;
         }
      }

      if(qaa.r > var8) {
         qaa.r -= (qaa.r + -var8 >> 3) * mma.a / 1000 + rf.f << 3;
         if(qaa.r < var8) {
            qaa.r = var8;
         }
      }

      int var10 = -cp.a + var9;
      if(8192 < var10) {
         var10 -= 16384;
      }

      if(var10 < -8192) {
         var10 += 16384;
      }

      var10 >>= 3;
      if(var10 > 0) {
         cp.a += rf.f + var10 * mma.a / 1000 << 3;
         cp.a &= 16383;
      }

      if(0 > var10) {
         cp.a -= rf.f + mma.a * -var10 / 1000 << 3;
         cp.a &= 16383;
      }

      int var11 = var9 - cp.a;
      if(var11 > 8192) {
         var11 -= 16384;
      }

      if(var11 < -8192) {
         var11 += 16384;
      }

      if(var11 < 0 && var10 > 0 || var11 > 0 && var10 < 0) {
         cp.a = var9;
      }

      kk.f_l = 0;
   }

}
