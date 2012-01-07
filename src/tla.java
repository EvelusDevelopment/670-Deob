
final class tla {

   private int[] f;
   private int[] a;
   private int[] b;
   private float[][] c;
   int e;
   private int d;


   private static final int a(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; ooa.a(var1, var2, 1) > var0; --var2) {
         ;
      }

      return var2;
   }

   final int b() {
      int var1;
      for(var1 = 0; this.b[var1] >= 0; var1 = pr.a() != 0?this.b[var1]:var1 + 1) {
         ;
      }

      return ~this.b[var1];
   }

   final float[] c() {
      return this.c[this.b()];
   }

   tla() {
      pr.a(24);
      this.e = pr.a(16);
      this.d = pr.a(24);
      this.a = new int[this.d];
      boolean var1 = pr.a() != 0;
      int var2;
      int var3;
      int var5;
      if(var1) {
         var2 = 0;

         for(var3 = pr.a(5) + 1; var2 < this.d; ++var3) {
            int var4 = pr.a(dba.a(this.d - var2, 74));

            for(var5 = 0; var5 < var4; ++var5) {
               this.a[var2++] = var3;
            }
         }
      } else {
         boolean var14 = pr.a() != 0;

         for(var3 = 0; var3 < this.d; ++var3) {
            if(var14 && pr.a() == 0) {
               this.a[var3] = 0;
            } else {
               this.a[var3] = pr.a(5) + 1;
            }
         }
      }

      this.a();
      var2 = pr.a(4);
      if(var2 > 0) {
         float var16 = pr.c(pr.a(32));
         float var15 = pr.c(pr.a(32));
         var5 = pr.a(4) + 1;
         boolean var6 = pr.a() != 0;
         int var7;
         if(var2 == 1) {
            var7 = a(this.d, this.e);
         } else {
            var7 = this.d * this.e;
         }

         this.f = new int[var7];

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            this.f[var8] = pr.a(var5);
         }

         this.c = new float[this.d][this.e];
         float var9;
         int var10;
         int var11;
         if(var2 == 1) {
            for(var8 = 0; var8 < this.d; ++var8) {
               var9 = 0.0F;
               var10 = 1;

               for(var11 = 0; var11 < this.e; ++var11) {
                  int var12 = var8 / var10 % var7;
                  float var13 = (float)this.f[var12] * var15 + var16 + var9;
                  this.c[var8][var11] = var13;
                  if(var6) {
                     var9 = var13;
                  }

                  var10 *= var7;
               }
            }
         } else {
            for(var8 = 0; var8 < this.d; ++var8) {
               var9 = 0.0F;
               var10 = var8 * this.e;

               for(var11 = 0; var11 < this.e; ++var11) {
                  float var17 = (float)this.f[var10] * var15 + var16 + var9;
                  this.c[var8][var11] = var17;
                  if(var6) {
                     var9 = var17;
                  }

                  ++var10;
               }
            }
         }
      }

   }

   private final void a() {
      int[] var1 = new int[this.d];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.d; ++var3) {
         var4 = this.a[var3];
         if(var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if(var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if(var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.b = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.d; ++var3) {
         var4 = this.a[var3];
         if(var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if((var5 & var8) != 0) {
                  if(this.b[var6] == 0) {
                     this.b[var6] = var11;
                  }

                  var6 = this.b[var6];
               } else {
                  ++var6;
               }

               if(var6 >= this.b.length) {
                  int[] var12 = new int[this.b.length * 2];

                  for(var10 = 0; var10 < this.b.length; ++var10) {
                     var12[var10] = this.b[var10];
                  }

                  this.b = var12;
               }

               var8 >>>= 1;
            }

            this.b[var6] = ~var3;
            if(var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }
}
