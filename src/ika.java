
final class ika {

   private int c = pr.a(6) + 1;
   private int e = pr.a(8);
   private int d = pr.a(24);
   private int a = pr.a(16);
   private int[] b;
   private int f = pr.a(24);
   private int g = pr.a(24) + 1;


   final void a(float[] var1, int var2, boolean var3) {
      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var1[var4] = 0.0F;
      }

      if(!var3) {
         var4 = pr.w[this.e].e;
         int var5 = this.f - this.d;
         int var6 = var5 / this.g;
         int[] var7 = new int[var6];

         for(int var8 = 0; var8 < 8; ++var8) {
            int var9 = 0;

            while(var9 < var6) {
               int var10;
               int var11;
               if(var8 == 0) {
                  var10 = pr.w[this.e].b();

                  for(var11 = var4 - 1; var11 >= 0; --var11) {
                     if(var9 + var11 < var6) {
                        var7[var9 + var11] = var10 % this.c;
                     }

                     var10 /= this.c;
                  }
               }

               for(var10 = 0; var10 < var4; ++var10) {
                  var11 = var7[var9];
                  int var12 = this.b[var11 * 8 + var8];
                  if(var12 >= 0) {
                     int var13 = this.d + var9 * this.g;
                     tla var14 = pr.w[var12];
                     int var15;
                     if(this.a == 0) {
                        var15 = this.g / var14.e;

                        for(int var19 = 0; var19 < var15; ++var19) {
                           float[] var20 = var14.c();

                           for(int var18 = 0; var18 < var14.e; ++var18) {
                              var1[var13 + var19 + var18 * var15] += var20[var18];
                           }
                        }
                     } else {
                        var15 = 0;

                        while(var15 < this.g) {
                           float[] var16 = var14.c();

                           for(int var17 = 0; var17 < var14.e; ++var17) {
                              var1[var13 + var15] += var16[var17];
                              ++var15;
                           }
                        }
                     }
                  }

                  ++var9;
                  if(var9 >= var6) {
                     break;
                  }
               }
            }
         }

      }
   }

   ika() {
      int[] var1 = new int[this.c];

      int var2;
      for(var2 = 0; var2 < this.c; ++var2) {
         int var3 = 0;
         int var4 = pr.a(3);
         boolean var5 = pr.a() != 0;
         if(var5) {
            var3 = pr.a(5);
         }

         var1[var2] = var3 << 3 | var4;
      }

      this.b = new int[this.c * 8];

      for(var2 = 0; var2 < this.c * 8; ++var2) {
         this.b[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0?pr.a(8):-1;
      }

   }
}
