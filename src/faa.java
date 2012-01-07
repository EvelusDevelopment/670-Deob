
final class faa {

   private int n;
   private int s;
   private int q;
   private int f;
   private int a;
   private int f_l;
   private int b;
   private int h;
   private int e;
   private int m;
   private int r;
   private int f_i;
   int k;
   private static cga u;
   private static ka g;
   private int c;
   private static int[] p = new int[4];
   private int j;
   private static cga d;
   private cga o;
   private boolean t;


   private final void c(ta var1, faa var2) {
      b(var1);
      a(var1);
      var1.TA(p);
      var1.JA(0, 0, this.e, this.e);
      var1.Z(2, 0);
      var1.r(0, 0, this.e, this.e, -16777216 | this.b, 0);
      int var3 = 0;
      int var4 = 0;
      int var5 = 256;
      if(var2 != null) {
         if(var2.t) {
            var3 = -var2.s;
            var4 = -var2.c;
            var5 = -var2.m;
         } else {
            var3 = var2.s - this.s;
            var4 = var2.c - this.c;
            var5 = var2.m - this.m;
         }
      }

      int var6;
      int var7;
      int var8;
      if(this.q != 0) {
         var6 = tda.p[this.q];
         var7 = tda.k[this.q];
         var8 = var4 * var7 - var5 * var6 >> 14;
         var5 = var4 * var6 + var5 * var7 >> 14;
         var4 = var8;
      }

      if(this.a != 0) {
         var6 = tda.p[this.a];
         var7 = tda.k[this.a];
         var8 = var5 * var6 + var3 * var7 >> 14;
         var5 = var5 * var7 - var3 * var6 >> 14;
         var3 = var8;
      }

      ka var13 = g.a((byte)0, '\uc800', true);
      var13.DA((short)0, (short)this.f_i);
      var1.ka(1.0F);
      var1.FA(16777215, 1.0F, 1.0F, (float)var3, (float)var4, (float)var5);
      var7 = 1024 * this.e / (var13.RA() - var13.LA());
      if(this.b != 0) {
         var7 = var7 * 13 / 16;
      }

      Object[] var14 = var1.h();
      Object[] var9 = var1.v();
      nr.a(50.0F, (float)var7, (float)(this.e / 2), 50000.0F, var9, (byte)-121, (float)(this.e / 2), 1024.0F, (float)var7, (float)var1.e(30626).d(), (float)var1.e(30626).e());
      var1.a(var9);
      var1.d(im.a(new Object[2], (int)-16365));
      Object[] var10 = im.a(new Object[2], (int)-16365);
      pfa.a(9, var10, 0.0F, (float)(50 - var13.da()), 0.0F);
      var13.a(var10, (lpa)null, 1);
      int var11 = this.e * 13 / 16;
      int var12 = (this.e - var11) / 2;
      u.b(var12, var12, var11, var11, 0, -16777216 | this.b, 1);
      this.o = var1.a(0, 0, this.e, this.e, true);
      var1.Z(2, 0);
      var1.r(0, 0, this.e, this.e, 0, 0);
      d.b(0, 0, this.e, this.e, 1, 0, 0);
      this.o.a(0, 0, 3);
      var1.a(var14);
      var1.JA(p[0], p[1], p[2], p[3]);
   }

   static final void a() {
      g = null;
      d = null;
   }

   final boolean a(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      int var7;
      if(!this.t) {
         var5 = this.s - var1;
         var6 = this.c - var2;
         var7 = this.m - var3;
         this.k = (int)Math.sqrt((double)(var5 * var5 + var6 * var6 + var7 * var7));
         if(this.k == 0) {
            this.k = 1;
         }

         var5 = (var5 << 8) / this.k;
         var6 = (var6 << 8) / this.k;
         var7 = (var7 << 8) / this.k;
      } else {
         this.k = 1073741823;
         var5 = this.s;
         var6 = this.c;
         var7 = this.m;
      }

      int var8 = (int)(Math.sqrt((double)(var5 * var5 + var6 * var6 + var7 * var7)) * 256.0D);
      if(var8 > 128) {
         var5 = (var5 << 16) / var8;
         var6 = (var6 << 16) / var8;
         var7 = (var7 << 16) / var8;
         this.h = this.f * var4 / (this.t?1024:this.k);
      } else {
         this.h = 0;
      }

      if(this.h < 8) {
         this.o = null;
         return false;
      } else {
         int var9 = fda.a(this.h, (byte)81);
         if(var9 > var4) {
            var9 = uma.a(-32125, var4);
         }

         if(var9 > 512) {
            var9 = 512;
         }

         if(var9 != this.e) {
            this.e = var9;
         }

         this.q = (int)(Math.asin((double)((float)var6 / 256.0F)) * 2607.5945876176133D) & 16383;
         this.a = (int)(Math.atan2((double)var5, (double)(-var7)) * 2607.5945876176133D) & 16383;
         this.o = null;
         return true;
      }
   }

   final boolean b(ta var1, faa var2) {
      return this.o != null || this.a(var1, var2);
   }

   private final boolean a(ta var1, faa var2) {
      if(this.o == null) {
         if(this.f_l == 0) {
            if(ela.d.a(-20460, this.f_i)) {
               int[] var3 = ela.d.a(this.e, 0.7F, (byte)-87, this.e, false, this.f_i);
               this.o = var1.a(this.e, -7343, 0, var3, this.e, this.e);
            }
         } else if(this.f_l == 2) {
            this.d(var1, var2);
         } else if(this.f_l == 1) {
            this.c(var1, var2);
         }
      }

      return this.o != null;
   }

   private static final void b(ta var0) {
      if(g == null) {
         ii var1 = new ii(580, 1104, 1);
         var1.a((short)0, (short)32767, (short)0, (short)1024, (short)1024, (short)1024, (byte)0, (byte)0, (byte)0);
         var1.c(0, 128, 0);
         var1.c(0, -128, 0);

         for(int var2 = 0; var2 <= 24; ++var2) {
            int var3 = var2 * 8192 / 24;
            int var4 = tda.p[var3];
            int var5 = tda.k[var3];

            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            for(var6 = 1; var6 < 24; ++var6) {
               var7 = var6 * 8192 / 24;
               var8 = tda.k[var7] >> 7;
               var9 = tda.p[var7] * var4 >> 21;
               var10 = tda.p[var7] * var5 >> 21;
               var1.c(var10, var8, -var9);
            }

            if(var2 > 0) {
               var6 = var2 * 23 + 2;
               var7 = var6 - 23;
               var1.a(0, var7, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);

               for(var8 = 1; var8 < 23; ++var8) {
                  var9 = var7 + 1;
                  var10 = var6 + 1;
                  var1.a(var7, var9, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
                  var1.a(var9, var10, var6, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
                  var7 = var9;
                  var6 = var10;
               }

               var1.a(var6, var7, 1, (byte)0, (byte)0, (short)127, (byte)0, (short)0);
            }
         }

         var1.g = var1.u;
         var1.m = null;
         var1.f_i = null;
         var1.D = null;
         g = var0.a(var1, '\uc800', 33, 64, 768);
      }

   }

   private final void d(ta var1, faa var2) {
      ii var3 = ii.a(tg.n, this.f_i, (int)0);
      if(var3 != null) {
         var1.TA(p);
         var1.JA(0, 0, this.e, this.e);
         var1.Z(2, 0);
         var1.r(0, 0, this.e, this.e, 0, 0);
         int var4 = 0;
         int var5 = 0;
         int var6 = 256;
         if(var2 != null) {
            if(var2.t) {
               var4 = -var2.s;
               var5 = -var2.c;
               var6 = -var2.m;
            } else {
               var4 = this.s - var2.s;
               var5 = this.c - var2.c;
               var6 = this.m - var2.m;
            }
         }

         int var7;
         int var8;
         int var9;
         int var10;
         if(this.q != 0) {
            var7 = -this.q & 16383;
            var8 = tda.p[var7];
            var9 = tda.k[var7];
            var10 = var5 * var9 - var6 * var8 >> 14;
            var6 = var5 * var8 + var6 * var9 >> 14;
            var5 = var10;
         }

         if(this.a != 0) {
            var7 = -this.a & 16383;
            var8 = tda.p[var7];
            var9 = tda.k[var7];
            var10 = var6 * var8 + var4 * var9 >> 14;
            var6 = var6 * var9 - var4 * var8 >> 14;
            var4 = var10;
         }

         var1.ka(1.0F);
         var1.FA(this.b, 1.0F, 1.0F, (float)var4, (float)var5, (float)var6);
         var3.a(this.n & 16383, this.r & 16383, this.j & 16383);
         ka var16 = var1.a(var3, 2048, 0, 64, 768);
         var8 = var16.RA() - var16.LA();
         var9 = var16.N() - var16.pa();
         var10 = var8 > var9?var8:var9;
         int var11 = 1024 * this.e / var10;
         Object[] var12 = var1.h();
         Object[] var13 = var1.v();
         nr.a(50.0F, (float)var11, (float)(this.e / 2), 50000.0F, var13, (byte)-121, (float)(this.e / 2), 1024.0F, (float)var11, (float)var1.e(30626).d(), (float)var1.e(30626).e());
         var1.a(var13);
         Object[] var14 = im.a(new Object[2], (int)-16365);
         var1.d(var14);
         Object[] var15 = var1.k();
         pfa.a(9, var15, 0.0F, (float)(50 - var16.da()), 0.0F);
         var16.a(var15, (lpa)null, 1);
         this.o = var1.a(0, 0, this.e, this.e, true);
         this.o.a(0, 0, 3);
         var1.a(var12);
         var1.JA(p[0], p[1], p[2], p[3]);
      }
   }

   private static final void a(ta var0) {
      if(d == null) {
         int[] var1 = new int[16384];
         int[] var2 = new int[16384];

         for(int var3 = 0; var3 < 64; ++var3) {
            int var4 = 64 - var3;
            var4 *= var4;
            int var5 = 128 - var3 - 1;
            int var6 = var3 * 128;
            int var7 = var5 * 128;

            for(int var8 = 0; var8 < 64; ++var8) {
               int var9 = 64 - var8;
               var9 *= var9;
               int var10 = 128 - var8 - 1;
               int var11 = 256 - (var9 + var4 << 8) / 4096;
               var11 = var11 * 16 * 192 / 1536;
               if(var11 < 0) {
                  var11 = 0;
               } else if(var11 > 255) {
                  var11 = 255;
               }

               int var12 = var11 / 2;
               var2[var6 + var8] = var2[var6 + var10] = var2[var7 + var8] = var2[var7 + var10] = -16777216 | var11 << 16;
               var1[var6 + var8] = var1[var6 + var10] = var1[var7 + var8] = var1[var7 + var10] = 127 - var12 << 24 | 16777215;
            }
         }

         d = var0.a(128, -7343, 0, var2, 128, 128);
         u = var0.a(128, -7343, 0, var1, 128, 128);
      }

   }

   final void a(ta var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if(this.o != null) {
         float[] var12 = new float[3];
         float var13 = (float)(-(this.s - var8 << 16));
         float var14 = (float)(this.c - var9 << 15);
         float var15 = (float)(-(this.m - var10 << 16));
         float[] var16 = new float[3];
         aba.a(var16, var1.c(), false);
         var13 += var16[0];
         var14 += var16[1];
         var15 += var16[2];
         var1.b(var13, var14, var15, var12);
         if(var12[2] >= 0.0F) {
            int var17 = (int)(var12[0] - (float)(this.h / 2));
            int var18 = (int)(var12[1] - (float)(this.h / 2));
            if(var18 < var5 && var18 + this.h > 0 && var17 < var4 && var17 + this.h > 0) {
               this.o.b(var17, var18, this.h, this.h, 0, var11 << 24 | 16777215, 1);
            }
         }

      }
   }

   faa(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11) {
      this.s = var3;
      this.c = var4;
      this.m = var5;
      this.t = var8;
      this.f_i = var2;
      this.b = var7;
      this.f = var6;
      this.f_l = var1;
      this.n = var9;
      this.r = var10;
      this.j = var11;
   }

}
