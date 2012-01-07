import jagdx.IDirect3DDevice;

final class qja extends lm {

   static int u;
   static Object[] f_l;
   static int o;
   static int t;
   static int q;
   Object[] r;
   static int p;
   static int j;
   static Object[] m = vra.a(536870911, 17, "", new Object[1]);
   static int k;
   static Object[] s = im.a(new Object[2], (int)-16365);
   static int n = 0;


   qja(Object[] var1) {
      this.r = var1;
   }

   static final int[][][] a(byte var0, Object[] var1) {
      try {
         ++o;
         if(((int[])((int[])var1[1]))[2] != ((int[])((int[])var1[1]))[0]) {
            throw new RuntimeException();
         } else {
            for(int var2 = 0; var2 < ((int[])((int[])var1[1]))[0]; ++var2) {
               ((Object[][])((Object[][])var1[4]))[var2] = vga.b;
            }

            if(var0 != -49) {
               s = new Object[9];
            }

            if(var1 != null && var1.length == 8) {
               a((byte)-49, (Object[])null);
            }

            return (int[][][])((int[][][])var1[3]);
         }
      } catch (RuntimeException var3) {
         throw vt.a(var3, "qja.D(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   static final void a(byte var0, int var1) {
      ++u;
      int var2 = -es.b + kda.d;
      if(var2 >= 100) {
         hh.b = -1;
         ha.e = 3;
         nca.a = -1;
      } else {
         int var3 = (int)qv.f_i;
         if(~var3 > ~(nn.G >> 8)) {
            var3 = nn.G >> 8;
         }

         if(ll.b[4] && var3 < 128 + hq.f_i[4]) {
            var3 = hq.f_i[4] + 128;
         }

         int var4 = cra.m + (int)sma.h & 16383;
         Object[] var5 = (Object[])((Object[])woa.a(5, uta.g)[1]);
         if(var5 != null && var5.length == 6) {
            ac.j = (int[])((int[])sc.e[3]);
         }

         fga.a(var1, (byte)-126, 600 + (var3 >> 3) * 3 << 2, hq.a, -200 + Class_ds.a(jca.n, (int)((float[])((float[])var5[1]))[2], (int)((float[])((float[])var5[1]))[1], (byte)122), var4, var3, fha.o);
         if(var0 != -112) {
            s = (Object[])((Object[])((Object[])((Object[])f_l[1]))[0]);
         }

         float var6 = -((float)((-var2 + 100) * (-var2 + 100) * (100 - var2)) / 1000000.0F) + 1.0F;
         woa.M = (int)(var6 * (float)(-sga.a + woa.M) + (float)sga.a);
         pta.f = (int)(var6 * (float)(-mra.f + pta.f) + (float)mra.f);
         qt.e = (int)((float)(qt.e + -go.a) * var6 + (float)go.a);
         qaa.r = (int)(var6 * (float)(qaa.r + -nt.g) + (float)nt.g);
         int var7 = -ln.d + cp.a;
         if(8192 >= var7) {
            if(var7 < -8192) {
               var7 += 16384;
            }
         } else {
            var7 -= 16384;
         }

         cp.a = (int)((float)ln.d + (float)var7 * var6);
         cp.a &= 16383;
      }
   }

   static final void a(int var0, int var1, Object[] var2, int var3) {
      ++p;
      int var4 = wra.d[var0];
      int var5 = bv.b[var1];
      int var6 = -84 % ((var3 + 30) / 46);
      float var7 = (float)Math.atan2((double)(var4 - 2048), (double)(var5 - 2048));
      if(-3.141592653589793D <= (double)var7 && -2.356194490192345D >= (double)var7) {
         kg.c = var0;
         uma.E = var1;
      } else if(-1.5707963267948966D >= (double)var7 && -2.356194490192345D <= (double)var7) {
         kg.c = var1;
         uma.E = var0;
      } else if((double)var7 <= -0.7853981633974483D && -1.5707963267948966D <= (double)var7) {
         uma.E = var0;
         kg.c = -var1 + fo.b;
      } else if(0.0F >= var7 && (double)var7 >= -0.7853981633974483D) {
         kg.c = var0;
         uma.E = -var1 + cka.d;
      } else if(var7 >= 0.0F && (double)var7 <= 0.7853981633974483D) {
         uma.E = cka.d - var1;
         kg.c = fo.b + -var0;
      } else if(0.7853981633974483D <= (double)var7 && 1.5707963267948966D >= (double)var7) {
         uma.E = -var0 + cka.d;
         kg.c = -var1 + fo.b;
      } else if(1.5707963267948966D <= (double)var7 && (double)var7 <= 2.356194490192345D) {
         kg.c = var1;
         uma.E = cka.d - var0;
      } else if((double)var7 >= 2.356194490192345D && 3.141592653589793D >= (double)var7) {
         uma.E = var1;
         kg.c = fo.b - var0;
      }

      kg.c &= td.q;
      uma.E &= wq.e;
   }

   static final void a(int var0, Object[] var1, boolean var2) {
      IDirect3DDevice.a(((long[])((long[])var1[50]))[5], 161, var2);
      if(var0 >= -78) {
         a(((byte[])((byte[])m[0]))[0], -91);
      }

      ++j;
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, Object[] var3, int var4, Object[] var5) {
      tr.a(var3, -108);
      ++t;
      var3[2] = var5;
      jla.a((Object[])((Object[])var3[2]), (byte)12, var4);
      var3[1] = var1;
      return var3;
   }

   static final int[] a(Object[] var0, int var1, boolean var2) {
      ++q;
      int[] var3 = od.a(-1704, var1, (Object[])((Object[])var0[5]));
      if(var2) {
         m = (Object[])((Object[])var0[2]);
      }

      if(((boolean[])((boolean[])((Object[])((Object[])var0[5]))[4]))[0]) {
         qo.a(var3, 0, fo.b, ((int[])((int[])var0[1]))[1]);
      }

      return var3;
   }

}
