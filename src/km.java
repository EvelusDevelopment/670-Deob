import java.util.Random;

final class km {

   private static int[] a = new int['\u8000'];
   private koa e;
   private koa y;
   private int c = 100;
   int g = 0;
   private static int[] s;
   private koa b;
   private koa r;
   int d = 500;
   private koa x;
   private int[] k = new int[]{0, 0, 0, 0, 0};
   private koa n;
   private koa t;
   private int j = 0;
   private int[] q = new int[]{0, 0, 0, 0, 0};
   private static int[] h;
   private koa m;
   private static int[] f_i;
   private static int[] v;
   private static int[] p;
   private ba f;
   private static int[] w;
   private koa u;
   private int[] o = new int[]{0, 0, 0, 0, 0};
   private static int[] f_l;


   final int[] a(int var1, int var2) {
      qo.a(h, 0, var1);
      if(var2 < 10) {
         return h;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0D);
         this.m.a();
         this.y.a();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if(this.n != null) {
            this.n.a();
            this.t.a();
            var5 = (int)((double)(this.n.b - this.n.c) * 32.768D / var3);
            var6 = (int)((double)this.n.c * 32.768D / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if(this.r != null) {
            this.r.a();
            this.e.a();
            var8 = (int)((double)(this.r.b - this.r.c) * 32.768D / var3);
            var9 = (int)((double)this.r.c * 32.768D / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if(this.q[var11] != 0) {
               w[var11] = 0;
               f_i[var11] = (int)((double)this.o[var11] * var3);
               v[var11] = (this.q[var11] << 14) / 100;
               f_l[var11] = (int)((double)(this.m.b - this.m.c) * 32.768D * Math.pow(1.0057929410678534D, (double)this.k[var11]) / var3);
               p[var11] = (int)((double)this.m.c * 32.768D / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.m.a(var1);
            var13 = this.y.a(var1);
            if(this.n != null) {
               var14 = this.n.a(var1);
               var15 = this.t.a(var1);
               var12 += this.a(var7, var15, this.n.k) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if(this.r != null) {
               var14 = this.r.a(var1);
               var15 = this.e.a(var1);
               var13 = var13 * ((this.a(var10, var15, this.r.k) >> 1) + '\u8000') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if(this.q[var14] != 0) {
                  var15 = var11 + f_i[var14];
                  if(var15 < var1) {
                     h[var15] += this.a(w[var14], var13 * v[var14] >> 15, this.m.k);
                     w[var14] += (var12 * f_l[var14] >> 16) + p[var14];
                  }
               }
            }
         }

         int var16;
         if(this.b != null) {
            this.b.a();
            this.u.a();
            var11 = 0;
            boolean var19 = false;
            boolean var18 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.b.a(var1);
               var16 = this.u.a(var1);
               if(var18) {
                  var12 = this.b.c + ((this.b.b - this.b.c) * var15 >> 8);
               } else {
                  var12 = this.b.c + ((this.b.b - this.b.c) * var16 >> 8);
               }

               var11 += 256;
               if(var11 >= var12) {
                  var11 = 0;
                  var18 = !var18;
               }

               if(var18) {
                  h[var14] = 0;
               }
            }
         }

         if(this.j > 0 && this.c > 0) {
            var11 = (int)((double)this.j * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               h[var12] += h[var12 - var11] * this.c / 100;
            }
         }

         if(this.f.c[0] > 0 || this.f.c[1] > 0) {
            this.x.a();
            var11 = this.x.a(var1 + 1);
            var12 = this.f.a(0, (float)var11 / 65536.0F);
            var13 = this.f.a(1, (float)var11 / 65536.0F);
            if(var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if(var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)h[var14 + var12] * (long)ba.f >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)h[var14 + var12 - 1 - var17] * (long)ba.g[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)h[var14 - 1 - var17] * (long)ba.g[1][var17] >> 16);
                  }

                  h[var14] = var16;
                  var11 = this.x.a(var1 + 1);
                  ++var14;
               }

               var15 = 128;

               while(true) {
                  if(var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  while(var14 < var15) {
                     var16 = (int)((long)h[var14 + var12] * (long)ba.f >> 16);

                     for(var17 = 0; var17 < var12; ++var17) {
                        var16 += (int)((long)h[var14 + var12 - 1 - var17] * (long)ba.g[0][var17] >> 16);
                     }

                     for(var17 = 0; var17 < var13; ++var17) {
                        var16 -= (int)((long)h[var14 - 1 - var17] * (long)ba.g[1][var17] >> 16);
                     }

                     h[var14] = var16;
                     var11 = this.x.a(var1 + 1);
                     ++var14;
                  }

                  if(var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var16 = 0;

                        for(var17 = var14 + var12 - var1; var17 < var12; ++var17) {
                           var16 += (int)((long)h[var14 + var12 - 1 - var17] * (long)ba.g[0][var17] >> 16);
                        }

                        for(var17 = 0; var17 < var13; ++var17) {
                           var16 -= (int)((long)h[var14 - 1 - var17] * (long)ba.g[1][var17] >> 16);
                        }

                        h[var14] = var16;
                        this.x.a(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.f.a(0, (float)var11 / 65536.0F);
                  var13 = this.f.a(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if(h[var11] < -32768) {
               h[var11] = -32768;
            }

            if(h[var11] > 32767) {
               h[var11] = 32767;
            }
         }

         return h;
      }
   }

   private final int a(int var1, int var2, int var3) {
      return var3 == 1?((var1 & 32767) < 16384?var2:-var2):(var3 == 2?s[var1 & 32767] * var2 >> 14:(var3 == 3?((var1 & 32767) * var2 >> 14) - var2:(var3 == 4?a[var1 / 2607 & 32767] * var2:0)));
   }

   final void a(Object[] var1) {
      this.m = new koa();
      this.m.b(var1);
      this.y = new koa();
      this.y.b(var1);
      int var2 = fh.a(var1, false);
      if(var2 != 0) {
         --((int[])((int[])var1[1]))[0];
         this.n = new koa();
         this.n.b(var1);
         this.t = new koa();
         this.t.b(var1);
      }

      var2 = fh.a(var1, false);
      if(var2 != 0) {
         --((int[])((int[])var1[1]))[0];
         this.r = new koa();
         this.r.b(var1);
         this.e = new koa();
         this.e.b(var1);
      }

      var2 = fh.a(var1, false);
      if(var2 != 0) {
         --((int[])((int[])var1[1]))[0];
         this.b = new koa();
         this.b.b(var1);
         this.u = new koa();
         this.u.b(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = tga.a((int)1, var1);
         if(var4 == 0) {
            break;
         }

         this.q[var3] = var4;
         this.k[var3] = kua.a((int)-107, var1);
         this.o[var3] = tga.a((int)1, var1);
      }

      this.j = tga.a((int)1, var1);
      this.c = tga.a((int)1, var1);
      this.d = de.a((int)0, var1);
      this.g = de.a((int)0, var1);
      this.f = new ba();
      this.x = new koa();
      this.f.a(var1, this.x);
   }

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < '\u8000'; ++var1) {
         a[var1] = (var0.nextInt() & 2) - 1;
      }

      s = new int['\u8000'];

      for(var1 = 0; var1 < '\u8000'; ++var1) {
         s[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      h = new int[220500];
      v = new int[5];
      f_i = new int[5];
      w = new int[5];
      p = new int[5];
      f_l = new int[5];
   }
}
