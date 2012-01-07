
final class uo {

   private int[] E;
   private int q = 0;
   float r;
   int K;
   private float[] G;
   float z = 0.0F;
   private int[] g = null;
   private int s = 0;
   float w;
   int[] y = new int[4096];
   private float B = 0.0F;
   private int[] f_i = null;
   private Object[] F;
   boolean c = false;
   private int A = -1;
   private int v = 0;
   float t;
   private int a = 0;
   private Object[] j;
   private int e;
   private int d;
   private float b = 0.0F;
   private int M = 0;
   int J = 0;
   private int u = 0;
   private int[] I = null;
   private boolean h = false;
   private int f_l = -1;
   boolean x = false;
   private int H = 0;
   private float m = 0.0F;
   float k = 1.0F;
   private boolean D = false;
   float L;
   private int f = -1;
   private boolean p = true;
   int n;
   boolean o = true;


   private final void f(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         var7 += var8 * (float)var5;
         if(((boolean[])((boolean[])this.j[2]))[1]) {
            if(this.J == 0) {
               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        if(var7 < this.G[var2]) {
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                     }
                  }

                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
               }
            } else if(this.J == 254) {
               if(var5 != 0 && var6 <= this.K - 1) {
                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        var4 = var6 - var5 & 3;

                        while(true) {
                           --var4;
                           if(var4 < 0) {
                              return;
                           }

                           ++var2;
                           if(var7 < this.G[var2]) {
                              ;
                           }

                           var7 += var8;
                        }
                     }

                     ++var2;
                     if(var7 < this.G[var2]) {
                        ;
                     }

                     var7 += var8;
                     ++var2;
                     if(var7 < this.G[var2]) {
                        ;
                     }

                     var7 += var8;
                     ++var2;
                     if(var7 < this.G[var2]) {
                        ;
                     }

                     var7 += var8;
                     ++var2;
                     if(var7 < this.G[var2]) {
                        ;
                     }

                     var7 += var8;
                  }
               }
            } else {
               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        if(var7 < this.G[var2]) {
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                     }
                  }

                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
               }
            }
         }
      }
   }

   final void g(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      if(this.D) {
         Object[] var11 = this.F;
         ((ta)(this.F == null?null:var11[6])).a(var10, (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var12 = this.F;
         ((ta)(this.F == null?null:var12[6])).a(var10, (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(var10, (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var14 = var5 - var4;
         float var15 = var2 - var1;
         float var16 = var6 - var4;
         float var17 = var3 - var1;
         float var18 = var8 - var7;
         float var19 = var9 - var7;
         float var20 = 0.0F;
         if(var2 != var1) {
            var20 = (var5 - var4) / (var2 - var1);
         }

         float var21 = 0.0F;
         if(var3 != var2) {
            var21 = (var6 - var5) / (var3 - var2);
         }

         float var22 = 0.0F;
         if(var3 != var1) {
            var22 = (var4 - var6) / (var1 - var3);
         }

         float var23 = var14 * var17 - var16 * var15;
         if(var23 != 0.0F) {
            float var24 = (var18 * var17 - var19 * var15) / var23;
            float var25 = (var19 * var14 - var18 * var16) / var23;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var7 = var7 - var24 * var4 + var24;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var21 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var22 >= var20) && (var1 != var2 || var22 <= var21)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.g(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.g(this.E, (int)var1, var10, 0, (int)var5, (int)var6, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.g(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.g(this.E, (int)var1, var10, 0, (int)var6, (int)var5, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var21 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var22 >= var20) && (var1 != var3 || var21 <= var20)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.g(this.E, (int)var1, var10, 0, (int)var4, (int)var5, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.g(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.g(this.E, (int)var1, var10, 0, (int)var5, (int)var4, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.g(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var8 = var8 - var24 * var5 + var24;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var22 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var20 >= var21) && (var2 != var3 || var20 <= var22)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.g(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.g(this.E, (int)var2, var10, 0, (int)var6, (int)var4, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.g(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.g(this.E, (int)var2, var10, 0, (int)var4, (int)var6, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var22 * var1;
                        var1 = 0.0F;
                     }

                     if(var20 < var21) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.g(this.E, (int)var2, var10, 0, (int)var6, (int)var5, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.g(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.g(this.E, (int)var2, var10, 0, (int)var5, (int)var6, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.g(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var9 = var9 - var24 * var6 + var24;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var20 * var1;
                     var1 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.g(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.g(this.E, (int)var3, var10, 0, (int)var5, (int)var4, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.g(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.g(this.E, (int)var3, var10, 0, (int)var4, (int)var5, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var20 * var2;
                     var2 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.g(this.E, (int)var3, var10, 0, (int)var4, (int)var6, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.g(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.g(this.E, (int)var3, var10, 0, (int)var6, (int)var4, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.g(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   private final void g(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         var7 += var8 * (float)var5;
         int var9;
         int var10;
         int var11;
         if(((boolean[])((boolean[])this.j[2]))[1]) {
            if(this.J == 0) {
               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = var3;
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                     }
                  }

                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2] = var3;
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2] = var3;
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2] = var3;
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2] = var3;
                     this.G[var2] = var7;
                  }

                  var7 += var8;
               }
            } else if(this.J == 254) {
               if(var5 != 0 && var6 <= this.K - 1) {
                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        var4 = var6 - var5 & 3;

                        while(true) {
                           --var4;
                           if(var4 < 0) {
                              return;
                           }

                           ++var2;
                           if(var7 < this.G[var2]) {
                              var1[var2 - 1] = var1[var2];
                           }

                           var7 += var8;
                        }
                     }

                     ++var2;
                     if(var7 < this.G[var2]) {
                        var1[var2 - 1] = var1[var2];
                     }

                     var7 += var8;
                     ++var2;
                     if(var7 < this.G[var2]) {
                        var1[var2 - 1] = var1[var2];
                     }

                     var7 += var8;
                     ++var2;
                     if(var7 < this.G[var2]) {
                        var1[var2 - 1] = var1[var2];
                     }

                     var7 += var8;
                     ++var2;
                     if(var7 < this.G[var2]) {
                        var1[var2 - 1] = var1[var2];
                     }

                     var7 += var8;
                  }
               }
            } else {
               var9 = this.J;
               var10 = 256 - this.J;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        if(var7 < this.G[var2]) {
                           var11 = var1[var2];
                           var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                     }
                  }

                  ++var2;
                  if(var7 < this.G[var2]) {
                     var11 = var1[var2];
                     var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var11 = var1[var2];
                     var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var11 = var1[var2];
                     var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var11 = var1[var2];
                     var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                     this.G[var2] = var7;
                  }

                  var7 += var8;
               }
            }
         } else if(this.J == 0) {
            while(true) {
               --var4;
               if(var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        return;
                     }

                     ++var2;
                     if(var7 < this.G[var2]) {
                        var1[var2] = var3;
                     }

                     var7 += var8;
                  }
               }

               ++var2;
               if(var7 < this.G[var2]) {
                  var1[var2] = var3;
               }

               var7 += var8;
               ++var2;
               if(var7 < this.G[var2]) {
                  var1[var2] = var3;
               }

               var7 += var8;
               ++var2;
               if(var7 < this.G[var2]) {
                  var1[var2] = var3;
               }

               var7 += var8;
               ++var2;
               if(var7 < this.G[var2]) {
                  var1[var2] = var3;
               }

               var7 += var8;
            }
         } else if(this.J == 254) {
            if(var5 != 0 && var6 <= this.K - 1) {
               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2 - 1] = var1[var2];
                        }

                        var7 += var8;
                     }
                  }

                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2 - 1] = var1[var2];
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2 - 1] = var1[var2];
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2 - 1] = var1[var2];
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2 - 1] = var1[var2];
                  }

                  var7 += var8;
               }
            }
         } else {
            var9 = this.J;
            var10 = 256 - this.J;
            var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

            while(true) {
               --var4;
               if(var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        return;
                     }

                     ++var2;
                     if(var7 < this.G[var2]) {
                        var11 = var1[var2];
                        var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                     }

                     var7 += var8;
                  }
               }

               ++var2;
               if(var7 < this.G[var2]) {
                  var11 = var1[var2];
                  var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               }

               var7 += var8;
               ++var2;
               if(var7 < this.G[var2]) {
                  var11 = var1[var2];
                  var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               }

               var7 += var8;
               ++var2;
               if(var7 < this.G[var2]) {
                  var11 = var1[var2];
                  var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               }

               var7 += var8;
               ++var2;
               if(var7 < this.G[var2]) {
                  var11 = var1[var2];
                  var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               }

               var7 += var8;
            }
         }
      }
   }

   final void c(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      this.d(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   final void e(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      if(this.D) {
         Object[] var11 = this.F;
         ((ta)(this.F == null?null:var11[6])).a(var10, (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var12 = this.F;
         ((ta)(this.F == null?null:var12[6])).a(var10, (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(var10, (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var14 = var5 - var4;
         float var15 = var2 - var1;
         float var16 = var6 - var4;
         float var17 = var3 - var1;
         float var18 = var8 - var7;
         float var19 = var9 - var7;
         float var20 = 0.0F;
         if(var2 != var1) {
            var20 = (var5 - var4) / (var2 - var1);
         }

         float var21 = 0.0F;
         if(var3 != var2) {
            var21 = (var6 - var5) / (var3 - var2);
         }

         float var22 = 0.0F;
         if(var3 != var1) {
            var22 = (var4 - var6) / (var1 - var3);
         }

         float var23 = var14 * var17 - var16 * var15;
         if(var23 != 0.0F) {
            float var24 = (var18 * var17 - var19 * var15) / var23;
            float var25 = (var19 * var14 - var18 * var16) / var23;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var7 = var7 - var24 * var4 + var24;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var21 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var22 >= var20) && (var1 != var2 || var22 <= var21)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.b(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.b(this.E, (int)var1, var10, 0, (int)var5, (int)var6, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.b(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.b(this.E, (int)var1, var10, 0, (int)var6, (int)var5, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var21 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var22 >= var20) && (var1 != var3 || var21 <= var20)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.b(this.E, (int)var1, var10, 0, (int)var4, (int)var5, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.b(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.b(this.E, (int)var1, var10, 0, (int)var5, (int)var4, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.b(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var8 = var8 - var24 * var5 + var24;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var22 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var20 >= var21) && (var2 != var3 || var20 <= var22)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.b(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.b(this.E, (int)var2, var10, 0, (int)var6, (int)var4, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.b(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.b(this.E, (int)var2, var10, 0, (int)var4, (int)var6, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var22 * var1;
                        var1 = 0.0F;
                     }

                     if(var20 < var21) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.b(this.E, (int)var2, var10, 0, (int)var6, (int)var5, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.b(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.b(this.E, (int)var2, var10, 0, (int)var5, (int)var6, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.b(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var9 = var9 - var24 * var6 + var24;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var20 * var1;
                     var1 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.b(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.b(this.E, (int)var3, var10, 0, (int)var5, (int)var4, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.b(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.b(this.E, (int)var3, var10, 0, (int)var4, (int)var5, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var20 * var2;
                     var2 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.b(this.E, (int)var3, var10, 0, (int)var4, (int)var6, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.b(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.b(this.E, (int)var3, var10, 0, (int)var6, (int)var4, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.b(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   final void g(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12) {
      if(this.D) {
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(en.c[(int)var10 & '\uffff'], (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var14 = this.F;
         ((ta)(this.F == null?null:var14[6])).a(en.c[(int)var10 & '\uffff'], (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var15 = this.F;
         ((ta)(this.F == null?null:var15[6])).a(en.c[(int)var10 & '\uffff'], (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var16 = var5 - var4;
         float var17 = var2 - var1;
         float var18 = var6 - var4;
         float var19 = var3 - var1;
         float var20 = var11 - var10;
         float var21 = var12 - var10;
         float var22 = var8 - var7;
         float var23 = var9 - var7;
         float var24;
         if(var3 != var2) {
            var24 = (var6 - var5) / (var3 - var2);
         } else {
            var24 = 0.0F;
         }

         float var25;
         if(var2 != var1) {
            var25 = var16 / var17;
         } else {
            var25 = 0.0F;
         }

         float var26;
         if(var3 != var1) {
            var26 = var18 / var19;
         } else {
            var26 = 0.0F;
         }

         float var27 = var16 * var19 - var18 * var17;
         if(var27 != 0.0F) {
            float var28 = (var20 * var19 - var21 * var17) / var27;
            float var29 = (var21 * var16 - var20 * var18) / var27;
            float var30 = (var22 * var19 - var23 * var17) / var27;
            float var31 = (var23 * var16 - var22 * var18) / var27;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var10 = var10 - var28 * var4 + var28;
                  var7 = var7 - var30 * var4 + var30;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var26 * var1;
                        var4 -= var25 * var1;
                        var10 -= var29 * var1;
                        var7 -= var31 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var24 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var26 >= var25) && (var1 != var2 || var26 <= var24)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.a(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var10, var28, var7, var30);
                           var6 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.a(this.E, (int)var1, 0, 0, (int)var5, (int)var6, var10, var28, var7, var30);
                           var6 += var26;
                           var5 += var24;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.a(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var10, var28, var7, var30);
                           var6 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.a(this.E, (int)var1, 0, 0, (int)var6, (int)var5, var10, var28, var7, var30);
                           var6 += var26;
                           var5 += var24;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var26 * var1;
                        var4 -= var25 * var1;
                        var10 -= var29 * var1;
                        var7 -= var31 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var24 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var26 >= var25) && (var1 != var3 || var24 <= var25)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.a(this.E, (int)var1, 0, 0, (int)var4, (int)var5, var10, var28, var7, var30);
                           var5 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var2 >= 0.0F) {
                           this.a(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var10, var28, var7, var30);
                           var6 += var24;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.a(this.E, (int)var1, 0, 0, (int)var5, (int)var4, var10, var28, var7, var30);
                           var5 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var2 >= 0.0F) {
                           this.a(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var10, var28, var7, var30);
                           var6 += var24;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var11 = var11 - var28 * var5 + var28;
                  var8 = var8 - var30 * var5 + var30;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var25 * var2;
                        var5 -= var24 * var2;
                        var11 -= var29 * var2;
                        var8 -= var31 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var26 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var25 >= var24) && (var2 != var3 || var25 <= var26)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.a(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var11, var28, var8, var30);
                           var4 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var1 >= 0.0F) {
                           this.a(this.E, (int)var2, 0, 0, (int)var6, (int)var4, var11, var28, var8, var30);
                           var4 += var25;
                           var6 += var26;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.a(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var11, var28, var8, var30);
                           var4 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var1 >= 0.0F) {
                           this.a(this.E, (int)var2, 0, 0, (int)var4, (int)var6, var11, var28, var8, var30);
                           var4 += var25;
                           var6 += var26;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var25 * var2;
                        var5 -= var24 * var2;
                        var11 -= var29 * var2;
                        var8 -= var31 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var26 * var1;
                        var1 = 0.0F;
                     }

                     if(var25 < var24) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.a(this.E, (int)var2, 0, 0, (int)var6, (int)var5, var11, var28, var8, var30);
                           var6 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.a(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var11, var28, var8, var30);
                           var4 += var26;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.a(this.E, (int)var2, 0, 0, (int)var5, (int)var6, var11, var28, var8, var30);
                           var6 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.a(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var11, var28, var8, var30);
                           var4 += var26;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var12 = var12 - var28 * var6 + var28;
               var9 = var9 - var30 * var6 + var30;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var24 * var3;
                     var6 -= var26 * var3;
                     var12 -= var29 * var3;
                     var9 -= var31 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var25 * var1;
                     var1 = 0.0F;
                  }

                  if(var24 < var26) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.a(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var12, var28, var9, var30);
                        var5 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var2 >= 0.0F) {
                        this.a(this.E, (int)var3, 0, 0, (int)var5, (int)var4, var12, var28, var9, var30);
                        var5 += var24;
                        var4 += var25;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.a(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var12, var28, var9, var30);
                        var5 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var2 >= 0.0F) {
                        this.a(this.E, (int)var3, 0, 0, (int)var4, (int)var5, var12, var28, var9, var30);
                        var5 += var24;
                        var4 += var25;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var24 * var3;
                     var6 -= var26 * var3;
                     var12 -= var29 * var3;
                     var9 -= var31 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var25 * var2;
                     var2 = 0.0F;
                  }

                  if(var24 < var26) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.a(this.E, (int)var3, 0, 0, (int)var4, (int)var6, var12, var28, var9, var30);
                        var4 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var1 >= 0.0F) {
                        this.a(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var12, var28, var9, var30);
                        var5 += var25;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.a(this.E, (int)var3, 0, 0, (int)var6, (int)var4, var12, var28, var9, var30);
                        var4 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var1 >= 0.0F) {
                        this.a(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var12, var28, var9, var30);
                        var5 += var25;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   private final void b(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         var7 += var8 * (float)var5;
         if(((boolean[])((boolean[])this.j[2]))[1]) {
            if(this.J == 0) {
               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        if(var7 < this.G[var2]) {
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                     }
                  }

                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
               }
            } else if(this.J == 254) {
               if(var5 != 0 && var6 <= this.K - 1) {
                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        var4 = var6 - var5 & 3;

                        while(true) {
                           --var4;
                           if(var4 < 0) {
                              return;
                           }

                           ++var2;
                           if(var7 < this.G[var2]) {
                              ;
                           }

                           var7 += var8;
                        }
                     }

                     ++var2;
                     if(var7 < this.G[var2]) {
                        ;
                     }

                     var7 += var8;
                     ++var2;
                     if(var7 < this.G[var2]) {
                        ;
                     }

                     var7 += var8;
                     ++var2;
                     if(var7 < this.G[var2]) {
                        ;
                     }

                     var7 += var8;
                     ++var2;
                     if(var7 < this.G[var2]) {
                        ;
                     }

                     var7 += var8;
                  }
               }
            } else {
               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        if(var7 < this.G[var2]) {
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                     }
                  }

                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     this.G[var2] = var7;
                  }

                  var7 += var8;
               }
            }
         }
      }
   }

   private final void c(int[] var1, int[] var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23) {
      int var24 = var5 - var4;
      float var25 = 1.0F / (float)var24;
      float var26 = (var9 - var8) * var25;
      float var27 = (var11 - var10) * var25;
      float var28 = (var13 - var12) * var25;
      float var29 = (var15 - var14) * var25;
      float var30 = (var17 - var16) * var25;
      float var31 = (var19 - var18) * var25;
      float var32 = (var21 - var20) * var25;
      float var33 = (var23 - var22) * var25;
      if(this.c) {
         if(var5 > this.K) {
            var5 = this.K;
         }

         if(var4 < 0) {
            var8 -= var26 * (float)var4;
            var10 -= var27 * (float)var4;
            var12 -= var28 * (float)var4;
            var14 -= var29 * (float)var4;
            var16 -= var30 * (float)var4;
            var18 -= var31 * (float)var4;
            var20 -= var32 * (float)var4;
            var22 -= var33 * (float)var4;
            var4 = 0;
         }
      }

      if(var4 < var5) {
         var24 = var5 - var4;

         for(var3 += var4; var24-- > 0; var22 += var33) {
            float var34 = 1.0F / var8;
            int var35 = (int)(var10 * var34 * (float)this.H);
            if(this.p) {
               var35 &= this.a;
            } else if(var35 < 0) {
               var35 = 0;
            } else if(var35 > this.a) {
               var35 = this.a;
            }

            int var36 = (int)(var12 * var34 * (float)this.H);
            if(this.p) {
               var36 &= this.a;
            } else if(var36 < 0) {
               var36 = 0;
            } else if(var36 > this.a) {
               var36 = this.a;
            }

            int var37 = this.g[var36 * this.H + var35];
            boolean var38 = true;
            int var42;
            if(this.s == 2) {
               var42 = var37 >> 24 & 255;
            } else if(this.s == 1) {
               var42 = var37 == 0?0:255;
            } else {
               var42 = (int)var16;
            }

            if(var42 != 0) {
               int var39;
               int var40;
               int var41;
               if(var42 != 255) {
                  var39 = -16777216 | (int)(var18 * (float)(var37 >> 16 & 255)) << 8 & 16711680 | (int)(var20 * (float)(var37 >> 8 & 255)) & '\uff00' | (int)(var22 * (float)(var37 & 255)) >> 8;
                  if(var14 != 0.0F) {
                     var40 = (int)(255.0F - var14);
                     var41 = ((this.d & 16711935) * (int)var14 & -16711936 | (this.d & '\uff00') * (int)var14 & 16711680) >>> 8;
                     var39 = (((var39 & 16711935) * var40 & -16711936 | (var39 & '\uff00') * var40 & 16711680) >>> 8) + var41;
                  }

                  var40 = var1[var3];
                  var41 = 255 - var42;
                  var39 = ((var40 & 16711935) * var41 + (var39 & 16711935) * var42 & -16711936) + ((var40 & '\uff00') * var41 + (var39 & '\uff00') * var42 & 16711680) >> 8;
                  var1[var3] = var39;
               } else {
                  var39 = -16777216 | (int)(var18 * (float)(var37 >> 16 & 255)) << 8 & 16711680 | (int)(var20 * (float)(var37 >> 8 & 255)) & '\uff00' | (int)(var22 * (float)(var37 & 255)) >> 8;
                  if(var14 != 0.0F) {
                     var40 = (int)(255.0F - var14);
                     var41 = ((this.d & 16711935) * (int)var14 & -16711936 | (this.d & '\uff00') * (int)var14 & 16711680) >>> 8;
                     var39 = (((var39 & 16711935) * var40 & -16711936 | (var39 & '\uff00') * var40 & 16711680) >>> 8) + var41;
                  }

                  var1[var3] = var39;
               }
            }

            ++var3;
            var8 += var26;
            var10 += var27;
            var12 += var28;
            var14 += var29;
            var16 += var30;
            var18 += var31;
            var20 += var32;
         }

      }
   }

   private final void a(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var2 += var5 - 1;
         var7 += var8 * (float)var5;
         var9 += var10 * (float)var5;
         int var11;
         int var12;
         int var13;
         if(((boolean[])((boolean[])this.j[2]))[1]) {
            if(this.o) {
               var4 = var6 - var5 >> 2;
               var8 *= 4.0F;
               if(this.J == 0) {
                  if(var4 > 0) {
                     do {
                        var3 = en.c[(int)var7 & '\uffff'];
                        var7 += var8;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var1[var2] = var3;
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var1[var2] = var3;
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var1[var2] = var3;
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var1[var2] = var3;
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = en.c[(int)var7 & '\uffff'];

                     do {
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var1[var2] = var3;
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        --var4;
                     } while(var4 > 0);
                  }
               } else {
                  var11 = this.J;
                  var12 = 256 - this.J;
                  if(var4 > 0) {
                     do {
                        var3 = en.c[(int)var7 & '\uffff'];
                        var7 += var8;
                        var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var13 = var1[var2];
                           var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var13 = var1[var2];
                           var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var13 = var1[var2];
                           var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var13 = var1[var2];
                           var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');

                     do {
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var13 = var1[var2];
                           var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        --var4;
                     } while(var4 > 0);
                  }
               }
            } else {
               var4 = var6 - var5;
               if(this.J == 0) {
                  do {
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var1[var2] = en.c[(int)var7 & '\uffff'];
                        this.G[var2] = var9;
                     }

                     var9 += var10;
                     var7 += var8;
                     --var4;
                  } while(var4 > 0);
               } else {
                  var11 = this.J;
                  var12 = 256 - this.J;

                  do {
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var3 = en.c[(int)var7 & '\uffff'];
                        var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                        var13 = var1[var2];
                        var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                        this.G[var2] = var9;
                     }

                     var7 += var8;
                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }
            }
         } else if(this.o) {
            var4 = var6 - var5 >> 2;
            var8 *= 4.0F;
            if(this.J == 0) {
               if(var4 > 0) {
                  do {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var7 += var8;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var1[var2] = var3;
                     }

                     var9 += var10;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var1[var2] = var3;
                     }

                     var9 += var10;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var1[var2] = var3;
                     }

                     var9 += var10;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var1[var2] = var3;
                     }

                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if(var4 > 0) {
                  var3 = en.c[(int)var7 & '\uffff'];

                  do {
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var1[var2] = var3;
                     }

                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var11 = this.J;
               var12 = 256 - this.J;
               if(var4 > 0) {
                  do {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var13 = var1[var2];
                        var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     }

                     var9 += var10;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var13 = var1[var2];
                        var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     }

                     var9 += var10;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var13 = var1[var2];
                        var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     }

                     var9 += var10;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var13 = var1[var2];
                        var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     }

                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if(var4 > 0) {
                  var3 = en.c[(int)var7 & '\uffff'];
                  var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');

                  do {
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var13 = var1[var2];
                        var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     }

                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if(this.J == 0) {
               do {
                  ++var2;
                  if(var9 < this.G[var2]) {
                     var1[var2] = en.c[(int)var7 & '\uffff'];
                  }

                  var9 += var10;
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var11 = this.J;
               var12 = 256 - this.J;

               do {
                  ++var2;
                  if(var9 < this.G[var2]) {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                     var13 = var1[var2];
                     var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                  }

                  var7 += var8;
                  var9 += var10;
                  --var4;
               } while(var4 > 0);
            }
         }

      }
   }

   final void h(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12) {
      if(this.D) {
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(en.c[(int)var10 & '\uffff'], (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var14 = this.F;
         ((ta)(this.F == null?null:var14[6])).a(en.c[(int)var10 & '\uffff'], (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var15 = this.F;
         ((ta)(this.F == null?null:var15[6])).a(en.c[(int)var10 & '\uffff'], (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var16 = var5 - var4;
         float var17 = var2 - var1;
         float var18 = var6 - var4;
         float var19 = var3 - var1;
         float var20 = var11 - var10;
         float var21 = var12 - var10;
         float var22 = var8 - var7;
         float var23 = var9 - var7;
         float var24;
         if(var3 != var2) {
            var24 = (var6 - var5) / (var3 - var2);
         } else {
            var24 = 0.0F;
         }

         float var25;
         if(var2 != var1) {
            var25 = var16 / var17;
         } else {
            var25 = 0.0F;
         }

         float var26;
         if(var3 != var1) {
            var26 = var18 / var19;
         } else {
            var26 = 0.0F;
         }

         float var27 = var16 * var19 - var18 * var17;
         if(var27 != 0.0F) {
            float var28 = (var20 * var19 - var21 * var17) / var27;
            float var29 = (var21 * var16 - var20 * var18) / var27;
            float var30 = (var22 * var19 - var23 * var17) / var27;
            float var31 = (var23 * var16 - var22 * var18) / var27;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var10 = var10 - var28 * var4 + var28;
                  var7 = var7 - var30 * var4 + var30;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var26 * var1;
                        var4 -= var25 * var1;
                        var10 -= var29 * var1;
                        var7 -= var31 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var24 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var26 >= var25) && (var1 != var2 || var26 <= var24)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.c(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var10, var28, var7, var30);
                           var6 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.c(this.E, (int)var1, 0, 0, (int)var5, (int)var6, var10, var28, var7, var30);
                           var6 += var26;
                           var5 += var24;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.c(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var10, var28, var7, var30);
                           var6 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.c(this.E, (int)var1, 0, 0, (int)var6, (int)var5, var10, var28, var7, var30);
                           var6 += var26;
                           var5 += var24;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var26 * var1;
                        var4 -= var25 * var1;
                        var10 -= var29 * var1;
                        var7 -= var31 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var24 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var26 >= var25) && (var1 != var3 || var24 <= var25)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.c(this.E, (int)var1, 0, 0, (int)var4, (int)var5, var10, var28, var7, var30);
                           var5 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var2 >= 0.0F) {
                           this.c(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var10, var28, var7, var30);
                           var6 += var24;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.c(this.E, (int)var1, 0, 0, (int)var5, (int)var4, var10, var28, var7, var30);
                           var5 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var2 >= 0.0F) {
                           this.c(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var10, var28, var7, var30);
                           var6 += var24;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var11 = var11 - var28 * var5 + var28;
                  var8 = var8 - var30 * var5 + var30;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var25 * var2;
                        var5 -= var24 * var2;
                        var11 -= var29 * var2;
                        var8 -= var31 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var26 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var25 >= var24) && (var2 != var3 || var25 <= var26)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.c(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var11, var28, var8, var30);
                           var4 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var1 >= 0.0F) {
                           this.c(this.E, (int)var2, 0, 0, (int)var6, (int)var4, var11, var28, var8, var30);
                           var4 += var25;
                           var6 += var26;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.c(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var11, var28, var8, var30);
                           var4 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var1 >= 0.0F) {
                           this.c(this.E, (int)var2, 0, 0, (int)var4, (int)var6, var11, var28, var8, var30);
                           var4 += var25;
                           var6 += var26;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var25 * var2;
                        var5 -= var24 * var2;
                        var11 -= var29 * var2;
                        var8 -= var31 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var26 * var1;
                        var1 = 0.0F;
                     }

                     if(var25 < var24) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.c(this.E, (int)var2, 0, 0, (int)var6, (int)var5, var11, var28, var8, var30);
                           var6 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.c(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var11, var28, var8, var30);
                           var4 += var26;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.c(this.E, (int)var2, 0, 0, (int)var5, (int)var6, var11, var28, var8, var30);
                           var6 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.c(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var11, var28, var8, var30);
                           var4 += var26;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var12 = var12 - var28 * var6 + var28;
               var9 = var9 - var30 * var6 + var30;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var24 * var3;
                     var6 -= var26 * var3;
                     var12 -= var29 * var3;
                     var9 -= var31 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var25 * var1;
                     var1 = 0.0F;
                  }

                  if(var24 < var26) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.c(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var12, var28, var9, var30);
                        var5 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var2 >= 0.0F) {
                        this.c(this.E, (int)var3, 0, 0, (int)var5, (int)var4, var12, var28, var9, var30);
                        var5 += var24;
                        var4 += var25;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.c(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var12, var28, var9, var30);
                        var5 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var2 >= 0.0F) {
                        this.c(this.E, (int)var3, 0, 0, (int)var4, (int)var5, var12, var28, var9, var30);
                        var5 += var24;
                        var4 += var25;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var24 * var3;
                     var6 -= var26 * var3;
                     var12 -= var29 * var3;
                     var9 -= var31 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var25 * var2;
                     var2 = 0.0F;
                  }

                  if(var24 < var26) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.c(this.E, (int)var3, 0, 0, (int)var4, (int)var6, var12, var28, var9, var30);
                        var4 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var1 >= 0.0F) {
                        this.c(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var12, var28, var9, var30);
                        var5 += var25;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.c(this.E, (int)var3, 0, 0, (int)var6, (int)var4, var12, var28, var9, var30);
                        var4 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var1 >= 0.0F) {
                        this.c(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var12, var28, var9, var30);
                        var5 += var25;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   final void f(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      if(this.D) {
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(-16777216 | var10, (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var14 = this.F;
         ((ta)(this.F == null?null:var14[6])).a(-16777216 | var10, (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var15 = this.F;
         ((ta)(this.F == null?null:var15[6])).a(-16777216 | var10, (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var16 = var5 - var4;
         float var17 = var2 - var1;
         float var18 = var6 - var4;
         float var19 = var3 - var1;
         float var20 = var8 - var7;
         float var21 = var9 - var7;
         float var22 = (float)((var11 & 16711680) - (var10 & 16711680));
         float var23 = (float)((var12 & 16711680) - (var10 & 16711680));
         float var24 = (float)((var11 & '\uff00') - (var10 & '\uff00'));
         float var25 = (float)((var12 & '\uff00') - (var10 & '\uff00'));
         float var26 = (float)((var11 & 255) - (var10 & 255));
         float var27 = (float)((var12 & 255) - (var10 & 255));
         float var28;
         if(var3 != var2) {
            var28 = (var6 - var5) / (var3 - var2);
         } else {
            var28 = 0.0F;
         }

         float var29;
         if(var2 != var1) {
            var29 = var16 / var17;
         } else {
            var29 = 0.0F;
         }

         float var30;
         if(var3 != var1) {
            var30 = var18 / var19;
         } else {
            var30 = 0.0F;
         }

         float var31 = var16 * var19 - var18 * var17;
         if(var31 != 0.0F) {
            float var32 = (var20 * var19 - var21 * var17) / var31;
            float var33 = (var21 * var16 - var20 * var18) / var31;
            float var34 = (var22 * var19 - var23 * var17) / var31;
            float var35 = (var23 * var16 - var22 * var18) / var31;
            float var36 = (var24 * var19 - var25 * var17) / var31;
            float var37 = (var25 * var16 - var24 * var18) / var31;
            float var38 = (var26 * var19 - var27 * var17) / var31;
            float var39 = (var27 * var16 - var26 * var18) / var31;
            float var42;
            float var40;
            float var41;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var7 = var7 - var32 * var4 + var32;
                  var40 = (float)(var10 & 16711680) - var34 * var4 + var34;
                  var41 = (float)(var10 & '\uff00') - var36 * var4 + var36;
                  var42 = (float)(var10 & 255) - var38 * var4 + var38;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var30 * var1;
                        var4 -= var29 * var1;
                        var7 -= var33 * var1;
                        var40 -= var35 * var1;
                        var41 -= var37 * var1;
                        var42 -= var39 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var28 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var30 >= var29) && (var1 != var2 || var30 <= var28)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.a(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.a(this.E, (int)var1, 0, 0, (int)var5, (int)var6, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var5 += var28;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.a(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.a(this.E, (int)var1, 0, 0, (int)var6, (int)var5, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var5 += var28;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var30 * var1;
                        var4 -= var29 * var1;
                        var7 -= var33 * var1;
                        var40 -= var35 * var1;
                        var41 -= var37 * var1;
                        var42 -= var39 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var28 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var30 >= var29) && (var1 != var3 || var28 <= var29)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.a(this.E, (int)var1, 0, 0, (int)var4, (int)var5, var7, var32, var40, var34, var41, var36, var42, var38);
                           var5 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var2 >= 0.0F) {
                           this.a(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var28;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.a(this.E, (int)var1, 0, 0, (int)var5, (int)var4, var7, var32, var40, var34, var41, var36, var42, var38);
                           var5 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var2 >= 0.0F) {
                           this.a(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var28;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var8 = var8 - var32 * var5 + var32;
                  var40 = (float)(var11 & 16711680) - var34 * var5 + var34;
                  var41 = (float)(var11 & '\uff00') - var36 * var5 + var36;
                  var42 = (float)(var11 & 255) - var38 * var5 + var38;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var29 * var2;
                        var5 -= var28 * var2;
                        var8 -= var33 * var2;
                        var40 -= var35 * var2;
                        var41 -= var37 * var2;
                        var42 -= var39 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var30 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var29 >= var28) && (var2 != var3 || var29 <= var30)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.a(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var1 >= 0.0F) {
                           this.a(this.E, (int)var2, 0, 0, (int)var6, (int)var4, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var6 += var30;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.a(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var1 >= 0.0F) {
                           this.a(this.E, (int)var2, 0, 0, (int)var4, (int)var6, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var6 += var30;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var29 * var2;
                        var5 -= var28 * var2;
                        var8 -= var33 * var2;
                        var40 -= var35 * var2;
                        var41 -= var37 * var2;
                        var42 -= var39 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var30 * var1;
                        var1 = 0.0F;
                     }

                     if(var29 < var28) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.a(this.E, (int)var2, 0, 0, (int)var6, (int)var5, var8, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.a(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var30;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.a(this.E, (int)var2, 0, 0, (int)var5, (int)var6, var8, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.a(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var30;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var9 = var9 - var32 * var6 + var32;
               var40 = (float)(var12 & 16711680) - var34 * var6 + var34;
               var41 = (float)(var12 & '\uff00') - var36 * var6 + var36;
               var42 = (float)(var12 & 255) - var38 * var6 + var38;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var28 * var3;
                     var6 -= var30 * var3;
                     var9 -= var33 * var3;
                     var40 -= var35 * var3;
                     var41 -= var37 * var3;
                     var42 -= var39 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var29 * var1;
                     var1 = 0.0F;
                  }

                  if(var28 < var30) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.a(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var2 >= 0.0F) {
                        this.a(this.E, (int)var3, 0, 0, (int)var5, (int)var4, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var4 += var29;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.a(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var2 >= 0.0F) {
                        this.a(this.E, (int)var3, 0, 0, (int)var4, (int)var5, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var4 += var29;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var28 * var3;
                     var6 -= var30 * var3;
                     var9 -= var33 * var3;
                     var40 -= var35 * var3;
                     var41 -= var37 * var3;
                     var42 -= var39 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var29 * var2;
                     var2 = 0.0F;
                  }

                  if(var28 < var30) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.a(this.E, (int)var3, 0, 0, (int)var4, (int)var6, var9, var32, var40, var34, var41, var36, var42, var38);
                        var4 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var1 >= 0.0F) {
                        this.a(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var29;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.a(this.E, (int)var3, 0, 0, (int)var6, (int)var4, var9, var32, var40, var34, var41, var36, var42, var38);
                        var4 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var1 >= 0.0F) {
                        this.a(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var29;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   private final void a(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         int var15;
         int var17;
         int var16;
         int var19;
         int var18;
         int var20;
         if(this.h) {
            var2 += var5;
            var9 += var10 * (float)var5;
            var11 += var12 * (float)var5;
            var13 += var14 * (float)var5;
            if(this.o) {
               var4 = var6 - var5 >> 2;
               var10 *= 4.0F;
               var12 *= 4.0F;
               var14 *= 4.0F;
               if(this.J == 0) {
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var1[var2++] = var3;
                        var1[var2++] = var3;
                        var1[var2++] = var3;
                        var1[var2++] = var3;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        var1[var2++] = var3;
                        --var4;
                     } while(var4 > 0);
                  }
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');

                     do {
                        var17 = var1[var2];
                        var1[var2++] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }
               } else {
                  if(var4 > 0) {
                     do {
                        var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        --var4;
                     } while(var4 > 0);
                  }
               }
            } else {
               var4 = var6 - var5;
               if(this.J == 0) {
                  do {
                     var1[var2++] = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;

                  do {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                     var17 = var1[var2];
                     var1[var2++] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               } else {
                  do {
                     var16 = var2++;
                     var17 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var18 = var1[var16];
                     var19 = var17 + var18;
                     var20 = (var17 & 16711935) + (var18 & 16711935);
                     var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                     var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var2 += var5 - 1;
            var7 += var8 * (float)var5;
            var9 += var10 * (float)var5;
            var11 += var12 * (float)var5;
            var13 += var14 * (float)var5;
            if(((boolean[])((boolean[])this.j[2]))[1]) {
               if(this.o) {
                  var4 = var6 - var5 >> 2;
                  var10 *= 4.0F;
                  var12 *= 4.0F;
                  var14 *= 4.0F;
                  if(this.J == 0) {
                     if(var4 > 0) {
                        do {
                           var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var9 += var10;
                           var11 += var12;
                           var13 += var14;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var1[var2] = var3;
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var1[var2] = var3;
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var1[var2] = var3;
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var1[var2] = var3;
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           --var4;
                        } while(var4 > 0);
                     }

                     var4 = var6 - var5 & 3;
                     if(var4 > 0) {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                        do {
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var1[var2] = var3;
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           --var4;
                        } while(var4 > 0);
                     }
                  } else if(!this.x) {
                     var15 = this.J;
                     var16 = 256 - this.J;
                     if(var4 > 0) {
                        do {
                           var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var9 += var10;
                           var11 += var12;
                           var13 += var14;
                           var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var17 = var1[var2];
                              var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var17 = var1[var2];
                              var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var17 = var1[var2];
                              var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var17 = var1[var2];
                              var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           --var4;
                        } while(var4 > 0);
                     }

                     var4 = var6 - var5 & 3;
                     if(var4 > 0) {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');

                        do {
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var17 = var1[var2];
                              var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           --var4;
                        } while(var4 > 0);
                     }
                  } else {
                     if(var4 > 0) {
                        do {
                           var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var9 += var10;
                           var11 += var12;
                           var13 += var14;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var18 = var1[var2];
                              var19 = var3 + var18;
                              var20 = (var3 & 16711935) + (var18 & 16711935);
                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var18 = var1[var2];
                              var19 = var3 + var18;
                              var20 = (var3 & 16711935) + (var18 & 16711935);
                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var18 = var1[var2];
                              var19 = var3 + var18;
                              var20 = (var3 & 16711935) + (var18 & 16711935);
                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var18 = var1[var2];
                              var19 = var3 + var18;
                              var20 = (var3 & 16711935) + (var18 & 16711935);
                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           --var4;
                        } while(var4 > 0);
                     }

                     var4 = var6 - var5 & 3;
                     if(var4 > 0) {
                        var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                        do {
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var18 = var1[var2];
                              var19 = var3 + var18;
                              var20 = (var3 & 16711935) + (var18 & 16711935);
                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           --var4;
                        } while(var4 > 0);
                     }
                  }

               } else {
                  var4 = var6 - var5;
                  if(this.J == 0) {
                     do {
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        --var4;
                     } while(var4 > 0);
                  } else if(!this.x) {
                     var15 = this.J;
                     var16 = 256 - this.J;

                     do {
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                           var17 = var1[var2];
                           var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        --var4;
                     } while(var4 > 0);
                  } else {
                     do {
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var17 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var18 = var1[var2];
                           var19 = var17 + var18;
                           var20 = (var17 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        --var4;
                     } while(var4 > 0);
                  }

               }
            } else if(this.o) {
               var4 = var6 - var5 >> 2;
               var10 *= 4.0F;
               var12 *= 4.0F;
               var14 *= 4.0F;
               if(this.J == 0) {
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = var3;
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = var3;
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = var3;
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = var3;
                        }

                        var7 += var8;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = var3;
                        }

                        var7 += var8;
                        --var4;
                     } while(var4 > 0);
                  }
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var17 = var1[var2];
                           var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var17 = var1[var2];
                           var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var17 = var1[var2];
                           var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var17 = var1[var2];
                           var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        }

                        var7 += var8;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');

                     do {
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var17 = var1[var2];
                           var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        }

                        var7 += var8;
                        --var4;
                     } while(var4 > 0);
                  }
               } else {
                  if(var4 > 0) {
                     do {
                        var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        }

                        var7 += var8;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        }

                        var7 += var8;
                        --var4;
                     } while(var4 > 0);
                  }
               }

            } else {
               var4 = var6 - var5;
               if(this.J == 0) {
                  do {
                     ++var2;
                     if(var7 < this.G[var2]) {
                        var1[var2] = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     }

                     var7 += var8;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;

                  do {
                     ++var2;
                     if(var7 < this.G[var2]) {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                     }

                     var7 += var8;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               } else {
                  do {
                     ++var2;
                     if(var7 < this.G[var2]) {
                        var17 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var18 = var1[var2];
                        var19 = var17 + var18;
                        var20 = (var17 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                     }

                     var7 += var8;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               }

            }
         }
      }
   }

   final void g(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      if(this.D) {
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(-16777216 | var10, (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var14 = this.F;
         ((ta)(this.F == null?null:var14[6])).a(-16777216 | var10, (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var15 = this.F;
         ((ta)(this.F == null?null:var15[6])).a(-16777216 | var10, (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var16 = var5 - var4;
         float var17 = var2 - var1;
         float var18 = var6 - var4;
         float var19 = var3 - var1;
         float var20 = var8 - var7;
         float var21 = var9 - var7;
         float var22 = (float)((var11 & 16711680) - (var10 & 16711680));
         float var23 = (float)((var12 & 16711680) - (var10 & 16711680));
         float var24 = (float)((var11 & '\uff00') - (var10 & '\uff00'));
         float var25 = (float)((var12 & '\uff00') - (var10 & '\uff00'));
         float var26 = (float)((var11 & 255) - (var10 & 255));
         float var27 = (float)((var12 & 255) - (var10 & 255));
         float var28;
         if(var3 != var2) {
            var28 = (var6 - var5) / (var3 - var2);
         } else {
            var28 = 0.0F;
         }

         float var29;
         if(var2 != var1) {
            var29 = var16 / var17;
         } else {
            var29 = 0.0F;
         }

         float var30;
         if(var3 != var1) {
            var30 = var18 / var19;
         } else {
            var30 = 0.0F;
         }

         float var31 = var16 * var19 - var18 * var17;
         if(var31 != 0.0F) {
            float var32 = (var20 * var19 - var21 * var17) / var31;
            float var33 = (var21 * var16 - var20 * var18) / var31;
            float var34 = (var22 * var19 - var23 * var17) / var31;
            float var35 = (var23 * var16 - var22 * var18) / var31;
            float var36 = (var24 * var19 - var25 * var17) / var31;
            float var37 = (var25 * var16 - var24 * var18) / var31;
            float var38 = (var26 * var19 - var27 * var17) / var31;
            float var39 = (var27 * var16 - var26 * var18) / var31;
            float var42;
            float var40;
            float var41;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var7 = var7 - var32 * var4 + var32;
                  var40 = (float)(var10 & 16711680) - var34 * var4 + var34;
                  var41 = (float)(var10 & '\uff00') - var36 * var4 + var36;
                  var42 = (float)(var10 & 255) - var38 * var4 + var38;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var30 * var1;
                        var4 -= var29 * var1;
                        var7 -= var33 * var1;
                        var40 -= var35 * var1;
                        var41 -= var37 * var1;
                        var42 -= var39 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var28 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var30 >= var29) && (var1 != var2 || var30 <= var28)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.d(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.d(this.E, (int)var1, 0, 0, (int)var5, (int)var6, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var5 += var28;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.d(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.d(this.E, (int)var1, 0, 0, (int)var6, (int)var5, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var5 += var28;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var30 * var1;
                        var4 -= var29 * var1;
                        var7 -= var33 * var1;
                        var40 -= var35 * var1;
                        var41 -= var37 * var1;
                        var42 -= var39 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var28 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var30 >= var29) && (var1 != var3 || var28 <= var29)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.d(this.E, (int)var1, 0, 0, (int)var4, (int)var5, var7, var32, var40, var34, var41, var36, var42, var38);
                           var5 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var2 >= 0.0F) {
                           this.d(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var28;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.d(this.E, (int)var1, 0, 0, (int)var5, (int)var4, var7, var32, var40, var34, var41, var36, var42, var38);
                           var5 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var2 >= 0.0F) {
                           this.d(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var28;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var8 = var8 - var32 * var5 + var32;
                  var40 = (float)(var11 & 16711680) - var34 * var5 + var34;
                  var41 = (float)(var11 & '\uff00') - var36 * var5 + var36;
                  var42 = (float)(var11 & 255) - var38 * var5 + var38;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var29 * var2;
                        var5 -= var28 * var2;
                        var8 -= var33 * var2;
                        var40 -= var35 * var2;
                        var41 -= var37 * var2;
                        var42 -= var39 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var30 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var29 >= var28) && (var2 != var3 || var29 <= var30)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.d(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var1 >= 0.0F) {
                           this.d(this.E, (int)var2, 0, 0, (int)var6, (int)var4, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var6 += var30;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.d(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var1 >= 0.0F) {
                           this.d(this.E, (int)var2, 0, 0, (int)var4, (int)var6, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var6 += var30;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var29 * var2;
                        var5 -= var28 * var2;
                        var8 -= var33 * var2;
                        var40 -= var35 * var2;
                        var41 -= var37 * var2;
                        var42 -= var39 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var30 * var1;
                        var1 = 0.0F;
                     }

                     if(var29 < var28) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.d(this.E, (int)var2, 0, 0, (int)var6, (int)var5, var8, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.d(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var30;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.d(this.E, (int)var2, 0, 0, (int)var5, (int)var6, var8, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.d(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var30;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var9 = var9 - var32 * var6 + var32;
               var40 = (float)(var12 & 16711680) - var34 * var6 + var34;
               var41 = (float)(var12 & '\uff00') - var36 * var6 + var36;
               var42 = (float)(var12 & 255) - var38 * var6 + var38;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var28 * var3;
                     var6 -= var30 * var3;
                     var9 -= var33 * var3;
                     var40 -= var35 * var3;
                     var41 -= var37 * var3;
                     var42 -= var39 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var29 * var1;
                     var1 = 0.0F;
                  }

                  if(var28 < var30) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.d(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var2 >= 0.0F) {
                        this.d(this.E, (int)var3, 0, 0, (int)var5, (int)var4, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var4 += var29;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.d(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var2 >= 0.0F) {
                        this.d(this.E, (int)var3, 0, 0, (int)var4, (int)var5, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var4 += var29;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var28 * var3;
                     var6 -= var30 * var3;
                     var9 -= var33 * var3;
                     var40 -= var35 * var3;
                     var41 -= var37 * var3;
                     var42 -= var39 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var29 * var2;
                     var2 = 0.0F;
                  }

                  if(var28 < var30) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.d(this.E, (int)var3, 0, 0, (int)var4, (int)var6, var9, var32, var40, var34, var41, var36, var42, var38);
                        var4 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var1 >= 0.0F) {
                        this.d(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var29;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.d(this.E, (int)var3, 0, 0, (int)var6, (int)var4, var9, var32, var40, var34, var41, var36, var42, var38);
                        var4 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var1 >= 0.0F) {
                        this.d(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var29;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   private final void b(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         int var15;
         int var17;
         int var16;
         int var19;
         int var18;
         int var20;
         if(this.h) {
            var2 += var5;
            var9 += var10 * (float)var5;
            var11 += var12 * (float)var5;
            var13 += var14 * (float)var5;
            if(this.o) {
               var4 = var6 - var5 >> 2;
               var10 *= 4.0F;
               var12 *= 4.0F;
               var14 *= 4.0F;
               if(this.J == 0) {
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var1[var2++] = var3;
                        var1[var2++] = var3;
                        var1[var2++] = var3;
                        var1[var2++] = var3;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        var1[var2++] = var3;
                        --var4;
                     } while(var4 > 0);
                  }
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');

                     do {
                        var17 = var1[var2];
                        var1[var2++] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }
               } else {
                  if(var4 > 0) {
                     do {
                        var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        --var4;
                     } while(var4 > 0);
                  }
               }
            } else {
               var4 = var6 - var5;
               if(this.J == 0) {
                  do {
                     var1[var2++] = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;

                  do {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                     var17 = var1[var2];
                     var1[var2++] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               } else {
                  do {
                     var16 = var2++;
                     var17 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var18 = var1[var16];
                     var19 = var17 + var18;
                     var20 = (var17 & 16711935) + (var18 & 16711935);
                     var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                     var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var2 += var5 - 1;
            var9 += var10 * (float)var5;
            var11 += var12 * (float)var5;
            var13 += var14 * (float)var5;
            if(((boolean[])((boolean[])this.j[2]))[1]) {
               if(this.o) {
                  var4 = var6 - var5 >> 2;
                  var10 *= 4.0F;
                  var12 *= 4.0F;
                  var14 *= 4.0F;
                  if(this.J == 0) {
                     if(var4 > 0) {
                        do {
                           var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var9 += var10;
                           var11 += var12;
                           var13 += var14;
                           ++var2;
                           var1[var2] = var3;
                           ++var2;
                           var1[var2] = var3;
                           ++var2;
                           var1[var2] = var3;
                           ++var2;
                           var1[var2] = var3;
                           --var4;
                        } while(var4 > 0);
                     }

                     var4 = var6 - var5 & 3;
                     if(var4 > 0) {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                        do {
                           ++var2;
                           var1[var2] = var3;
                           --var4;
                        } while(var4 > 0);
                     }
                  } else if(!this.x) {
                     var15 = this.J;
                     var16 = 256 - this.J;
                     if(var4 > 0) {
                        do {
                           var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var9 += var10;
                           var11 += var12;
                           var13 += var14;
                           var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                           ++var2;
                           var17 = var1[var2];
                           var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                           ++var2;
                           var17 = var1[var2];
                           var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                           ++var2;
                           var17 = var1[var2];
                           var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                           ++var2;
                           var17 = var1[var2];
                           var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                           --var4;
                        } while(var4 > 0);
                     }

                     var4 = var6 - var5 & 3;
                     if(var4 > 0) {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');

                        do {
                           ++var2;
                           var17 = var1[var2];
                           var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                           --var4;
                        } while(var4 > 0);
                     }
                  } else {
                     if(var4 > 0) {
                        do {
                           var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var9 += var10;
                           var11 += var12;
                           var13 += var14;
                           ++var2;
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                           ++var2;
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                           ++var2;
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                           ++var2;
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                           --var4;
                        } while(var4 > 0);
                     }

                     var4 = var6 - var5 & 3;
                     if(var4 > 0) {
                        var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                        do {
                           ++var2;
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                           --var4;
                        } while(var4 > 0);
                     }
                  }

               } else {
                  var4 = var6 - var5;
                  if(this.J == 0) {
                     do {
                        ++var2;
                        var1[var2] = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        --var4;
                     } while(var4 > 0);
                  } else if(!this.x) {
                     var15 = this.J;
                     var16 = 256 - this.J;

                     do {
                        ++var2;
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        --var4;
                     } while(var4 > 0);
                  } else {
                     do {
                        ++var2;
                        var17 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var18 = var1[var2];
                        var19 = var17 + var18;
                        var20 = (var17 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        --var4;
                     } while(var4 > 0);
                  }

               }
            } else if(this.o) {
               var4 = var6 - var5 >> 2;
               var10 *= 4.0F;
               var12 *= 4.0F;
               var14 *= 4.0F;
               if(this.J == 0) {
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        ++var2;
                        var1[var2] = var3;
                        ++var2;
                        var1[var2] = var3;
                        ++var2;
                        var1[var2] = var3;
                        ++var2;
                        var1[var2] = var3;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        ++var2;
                        var1[var2] = var3;
                        --var4;
                     } while(var4 > 0);
                  }
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                        ++var2;
                        var17 = var1[var2];
                        var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        ++var2;
                        var17 = var1[var2];
                        var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        ++var2;
                        var17 = var1[var2];
                        var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        ++var2;
                        var17 = var1[var2];
                        var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');

                     do {
                        ++var2;
                        var17 = var1[var2];
                        var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }
               } else {
                  if(var4 > 0) {
                     do {
                        var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        ++var2;
                        var18 = var1[var2];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        ++var2;
                        var18 = var1[var2];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        ++var2;
                        var18 = var1[var2];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        ++var2;
                        var18 = var1[var2];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        ++var2;
                        var18 = var1[var2];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        --var4;
                     } while(var4 > 0);
                  }
               }

            } else {
               var4 = var6 - var5;
               if(this.J == 0) {
                  do {
                     ++var2;
                     var1[var2] = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;

                  do {
                     ++var2;
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                     var17 = var1[var2];
                     var1[var2] = (var16 | var17 >> 24) << 24 | var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               } else {
                  do {
                     ++var2;
                     var17 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var18 = var1[var2];
                     var19 = var17 + var18;
                     var20 = (var17 & 16711935) + (var18 & 16711935);
                     var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                     var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               }

            }
         }
      }
   }

   final void e(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   private final void d(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         int var15;
         int var17;
         int var16;
         int var19;
         int var18;
         int var20;
         if(this.h) {
            var2 += var5;
            var9 += var10 * (float)var5;
            var11 += var12 * (float)var5;
            var13 += var14 * (float)var5;
            if(this.o) {
               var4 = var6 - var5 >> 2;
               var10 *= 4.0F;
               var12 *= 4.0F;
               var14 *= 4.0F;
               if(this.J == 0) {
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var1[var2++] = var3;
                        var1[var2++] = var3;
                        var1[var2++] = var3;
                        var1[var2++] = var3;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        var1[var2++] = var3;
                        --var4;
                     } while(var4 > 0);
                  }
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');

                     do {
                        var17 = var1[var2];
                        var1[var2++] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }
               } else {
                  if(var4 > 0) {
                     do {
                        var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        --var4;
                     } while(var4 > 0);
                  }
               }
            } else {
               var4 = var6 - var5;
               if(this.J == 0) {
                  do {
                     var1[var2++] = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;

                  do {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                     var17 = var1[var2];
                     var1[var2++] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               } else {
                  do {
                     var16 = var2++;
                     var17 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var18 = var1[var16];
                     var19 = var17 + var18;
                     var20 = (var17 & 16711935) + (var18 & 16711935);
                     var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                     var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var2 += var5 - 1;
            var9 += var10 * (float)var5;
            var11 += var12 * (float)var5;
            var13 += var14 * (float)var5;
            if(((boolean[])((boolean[])this.j[2]))[1]) {
               if(this.o) {
                  var4 = var6 - var5 >> 2;
                  var10 *= 4.0F;
                  var12 *= 4.0F;
                  var14 *= 4.0F;
                  if(this.J == 0) {
                     if(var4 > 0) {
                        do {
                           var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var9 += var10;
                           var11 += var12;
                           var13 += var14;
                           ++var2;
                           var1[var2] = var3;
                           ++var2;
                           var1[var2] = var3;
                           ++var2;
                           var1[var2] = var3;
                           ++var2;
                           var1[var2] = var3;
                           --var4;
                        } while(var4 > 0);
                     }

                     var4 = var6 - var5 & 3;
                     if(var4 > 0) {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                        do {
                           ++var2;
                           var1[var2] = var3;
                           --var4;
                        } while(var4 > 0);
                     }
                  } else if(!this.x) {
                     var15 = this.J;
                     var16 = 256 - this.J;
                     if(var4 > 0) {
                        do {
                           var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var9 += var10;
                           var11 += var12;
                           var13 += var14;
                           var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                           ++var2;
                           var17 = var1[var2];
                           var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                           ++var2;
                           var17 = var1[var2];
                           var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                           ++var2;
                           var17 = var1[var2];
                           var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                           ++var2;
                           var17 = var1[var2];
                           var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                           --var4;
                        } while(var4 > 0);
                     }

                     var4 = var6 - var5 & 3;
                     if(var4 > 0) {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');

                        do {
                           ++var2;
                           var17 = var1[var2];
                           var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                           --var4;
                        } while(var4 > 0);
                     }
                  } else {
                     if(var4 > 0) {
                        do {
                           var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var9 += var10;
                           var11 += var12;
                           var13 += var14;
                           ++var2;
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                           ++var2;
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                           ++var2;
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                           ++var2;
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                           --var4;
                        } while(var4 > 0);
                     }

                     var4 = var6 - var5 & 3;
                     if(var4 > 0) {
                        var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                        do {
                           ++var2;
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                           --var4;
                        } while(var4 > 0);
                     }
                  }

               } else {
                  var4 = var6 - var5;
                  if(this.J == 0) {
                     do {
                        ++var2;
                        var1[var2] = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        --var4;
                     } while(var4 > 0);
                  } else if(!this.x) {
                     var15 = this.J;
                     var16 = 256 - this.J;

                     do {
                        ++var2;
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        --var4;
                     } while(var4 > 0);
                  } else {
                     do {
                        ++var2;
                        var17 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var18 = var1[var2];
                        var19 = var17 + var18;
                        var20 = (var17 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        --var4;
                     } while(var4 > 0);
                  }

               }
            } else if(this.o) {
               var4 = var6 - var5 >> 2;
               var10 *= 4.0F;
               var12 *= 4.0F;
               var14 *= 4.0F;
               if(this.J == 0) {
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        ++var2;
                        var1[var2] = var3;
                        ++var2;
                        var1[var2] = var3;
                        ++var2;
                        var1[var2] = var3;
                        ++var2;
                        var1[var2] = var3;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        ++var2;
                        var1[var2] = var3;
                        --var4;
                     } while(var4 > 0);
                  }
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                        ++var2;
                        var17 = var1[var2];
                        var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        ++var2;
                        var17 = var1[var2];
                        var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        ++var2;
                        var17 = var1[var2];
                        var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        ++var2;
                        var17 = var1[var2];
                        var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');

                     do {
                        ++var2;
                        var17 = var1[var2];
                        var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }
               } else {
                  if(var4 > 0) {
                     do {
                        var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        ++var2;
                        var18 = var1[var2];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        ++var2;
                        var18 = var1[var2];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        ++var2;
                        var18 = var1[var2];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        ++var2;
                        var18 = var1[var2];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        ++var2;
                        var18 = var1[var2];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        --var4;
                     } while(var4 > 0);
                  }
               }

            } else {
               var4 = var6 - var5;
               if(this.J == 0) {
                  do {
                     ++var2;
                     var1[var2] = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;

                  do {
                     ++var2;
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                     var17 = var1[var2];
                     var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               } else {
                  do {
                     ++var2;
                     var17 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var18 = var1[var2];
                     var19 = var17 + var18;
                     var20 = (var17 & 16711935) + (var18 & 16711935);
                     var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                     var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               }

            }
         }
      }
   }

   private final void d(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         int var9;
         int var10;
         int var11;
         if(((boolean[])((boolean[])this.j[2]))[1]) {
            if(this.J == 0) {
               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        var1[var2] = var3;
                     }
                  }

                  ++var2;
                  var1[var2] = var3;
                  ++var2;
                  var1[var2] = var3;
                  ++var2;
                  var1[var2] = var3;
                  ++var2;
                  var1[var2] = var3;
               }
            } else if(this.J == 254) {
               if(var5 != 0 && var6 <= this.K - 1) {
                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        var4 = var6 - var5 & 3;

                        while(true) {
                           --var4;
                           if(var4 < 0) {
                              return;
                           }

                           ++var2;
                           var1[var2 - 1] = var1[var2];
                        }
                     }

                     ++var2;
                     var1[var2 - 1] = var1[var2];
                     ++var2;
                     var1[var2 - 1] = var1[var2];
                     ++var2;
                     var1[var2 - 1] = var1[var2];
                     ++var2;
                     var1[var2 - 1] = var1[var2];
                  }
               }
            } else {
               var9 = this.J;
               var10 = 256 - this.J;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        var11 = var1[var2];
                        var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                     }
                  }

                  ++var2;
                  var11 = var1[var2];
                  var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                  ++var2;
                  var11 = var1[var2];
                  var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                  ++var2;
                  var11 = var1[var2];
                  var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                  ++var2;
                  var11 = var1[var2];
                  var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               }
            }
         } else if(this.J == 0) {
            while(true) {
               --var4;
               if(var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        return;
                     }

                     ++var2;
                     var1[var2] = var3;
                  }
               }

               ++var2;
               var1[var2] = var3;
               ++var2;
               var1[var2] = var3;
               ++var2;
               var1[var2] = var3;
               ++var2;
               var1[var2] = var3;
            }
         } else if(this.J == 254) {
            if(var5 != 0 && var6 <= this.K - 1) {
               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        var1[var2 - 1] = var1[var2];
                     }
                  }

                  ++var2;
                  var1[var2 - 1] = var1[var2];
                  ++var2;
                  var1[var2 - 1] = var1[var2];
                  ++var2;
                  var1[var2 - 1] = var1[var2];
                  ++var2;
                  var1[var2 - 1] = var1[var2];
               }
            }
         } else {
            var9 = this.J;
            var10 = 256 - this.J;
            var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

            while(true) {
               --var4;
               if(var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        return;
                     }

                     ++var2;
                     var11 = var1[var2];
                     var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                  }
               }

               ++var2;
               var11 = var1[var2];
               var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               ++var2;
               var11 = var1[var2];
               var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               ++var2;
               var11 = var1[var2];
               var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               ++var2;
               var11 = var1[var2];
               var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
            }
         }
      }
   }

   final void f(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      if(this.D) {
         Object[] var11 = this.F;
         ((ta)(this.F == null?null:var11[6])).a(var10, (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var12 = this.F;
         ((ta)(this.F == null?null:var12[6])).a(var10, (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(var10, (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var14 = var5 - var4;
         float var15 = var2 - var1;
         float var16 = var6 - var4;
         float var17 = var3 - var1;
         float var18 = var8 - var7;
         float var19 = var9 - var7;
         float var20 = 0.0F;
         if(var2 != var1) {
            var20 = (var5 - var4) / (var2 - var1);
         }

         float var21 = 0.0F;
         if(var3 != var2) {
            var21 = (var6 - var5) / (var3 - var2);
         }

         float var22 = 0.0F;
         if(var3 != var1) {
            var22 = (var4 - var6) / (var1 - var3);
         }

         float var23 = var14 * var17 - var16 * var15;
         if(var23 != 0.0F) {
            float var24 = (var18 * var17 - var19 * var15) / var23;
            float var25 = (var19 * var14 - var18 * var16) / var23;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var7 = var7 - var24 * var4 + var24;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var21 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var22 >= var20) && (var1 != var2 || var22 <= var21)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.c(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.c(this.E, (int)var1, var10, 0, (int)var5, (int)var6, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.c(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.c(this.E, (int)var1, var10, 0, (int)var6, (int)var5, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var21 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var22 >= var20) && (var1 != var3 || var21 <= var20)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.c(this.E, (int)var1, var10, 0, (int)var4, (int)var5, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.c(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.c(this.E, (int)var1, var10, 0, (int)var5, (int)var4, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.c(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var8 = var8 - var24 * var5 + var24;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var22 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var20 >= var21) && (var2 != var3 || var20 <= var22)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.c(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.c(this.E, (int)var2, var10, 0, (int)var6, (int)var4, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.c(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.c(this.E, (int)var2, var10, 0, (int)var4, (int)var6, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var22 * var1;
                        var1 = 0.0F;
                     }

                     if(var20 < var21) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.c(this.E, (int)var2, var10, 0, (int)var6, (int)var5, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.c(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.c(this.E, (int)var2, var10, 0, (int)var5, (int)var6, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.c(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var9 = var9 - var24 * var6 + var24;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var20 * var1;
                     var1 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.c(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.c(this.E, (int)var3, var10, 0, (int)var5, (int)var4, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.c(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.c(this.E, (int)var3, var10, 0, (int)var4, (int)var5, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var20 * var2;
                     var2 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.c(this.E, (int)var3, var10, 0, (int)var4, (int)var6, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.c(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.c(this.E, (int)var3, var10, 0, (int)var6, (int)var4, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.c(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   final void c(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12) {
      this.d(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   final void d(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   private final void h(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var4 = var6 - var5 >> 2;
         if(((boolean[])((boolean[])this.j[2]))[1]) {
            if(this.J == 0) {
               do {
                  --var4;
               } while(var4 >= 0);

               var4 = var6 - var5 & 3;

               do {
                  --var4;
               } while(var4 >= 0);

            } else if(this.J == 254) {
               if(var5 != 0 && var6 <= this.K - 1) {
                  do {
                     --var4;
                  } while(var4 >= 0);

                  var4 = var6 - var5 & 3;

                  do {
                     --var4;
                  } while(var4 >= 0);

               }
            } else {
               do {
                  --var4;
               } while(var4 >= 0);

               var4 = var6 - var5 & 3;

               do {
                  --var4;
               } while(var4 >= 0);

            }
         }
      }
   }

   final void f(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12) {
      this.b(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   final void d(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      if(this.D) {
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(-16777216 | var10, (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var14 = this.F;
         ((ta)(this.F == null?null:var14[6])).a(-16777216 | var10, (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var15 = this.F;
         ((ta)(this.F == null?null:var15[6])).a(-16777216 | var10, (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var16 = var5 - var4;
         float var17 = var2 - var1;
         float var18 = var6 - var4;
         float var19 = var3 - var1;
         float var20 = var8 - var7;
         float var21 = var9 - var7;
         float var22 = (float)((var11 & 16711680) - (var10 & 16711680));
         float var23 = (float)((var12 & 16711680) - (var10 & 16711680));
         float var24 = (float)((var11 & '\uff00') - (var10 & '\uff00'));
         float var25 = (float)((var12 & '\uff00') - (var10 & '\uff00'));
         float var26 = (float)((var11 & 255) - (var10 & 255));
         float var27 = (float)((var12 & 255) - (var10 & 255));
         float var28;
         if(var3 != var2) {
            var28 = (var6 - var5) / (var3 - var2);
         } else {
            var28 = 0.0F;
         }

         float var29;
         if(var2 != var1) {
            var29 = var16 / var17;
         } else {
            var29 = 0.0F;
         }

         float var30;
         if(var3 != var1) {
            var30 = var18 / var19;
         } else {
            var30 = 0.0F;
         }

         float var31 = var16 * var19 - var18 * var17;
         if(var31 != 0.0F) {
            float var32 = (var20 * var19 - var21 * var17) / var31;
            float var33 = (var21 * var16 - var20 * var18) / var31;
            float var34 = (var22 * var19 - var23 * var17) / var31;
            float var35 = (var23 * var16 - var22 * var18) / var31;
            float var36 = (var24 * var19 - var25 * var17) / var31;
            float var37 = (var25 * var16 - var24 * var18) / var31;
            float var38 = (var26 * var19 - var27 * var17) / var31;
            float var39 = (var27 * var16 - var26 * var18) / var31;
            float var42;
            float var40;
            float var41;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var7 = var7 - var32 * var4 + var32;
                  var40 = (float)(var10 & 16711680) - var34 * var4 + var34;
                  var41 = (float)(var10 & '\uff00') - var36 * var4 + var36;
                  var42 = (float)(var10 & 255) - var38 * var4 + var38;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var30 * var1;
                        var4 -= var29 * var1;
                        var7 -= var33 * var1;
                        var40 -= var35 * var1;
                        var41 -= var37 * var1;
                        var42 -= var39 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var28 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var30 >= var29) && (var1 != var2 || var30 <= var28)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.c(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.c(this.E, (int)var1, 0, 0, (int)var5, (int)var6, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var5 += var28;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.c(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.c(this.E, (int)var1, 0, 0, (int)var6, (int)var5, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var5 += var28;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var30 * var1;
                        var4 -= var29 * var1;
                        var7 -= var33 * var1;
                        var40 -= var35 * var1;
                        var41 -= var37 * var1;
                        var42 -= var39 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var28 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var30 >= var29) && (var1 != var3 || var28 <= var29)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.c(this.E, (int)var1, 0, 0, (int)var4, (int)var5, var7, var32, var40, var34, var41, var36, var42, var38);
                           var5 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var2 >= 0.0F) {
                           this.c(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var28;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.c(this.E, (int)var1, 0, 0, (int)var5, (int)var4, var7, var32, var40, var34, var41, var36, var42, var38);
                           var5 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var2 >= 0.0F) {
                           this.c(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var28;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var8 = var8 - var32 * var5 + var32;
                  var40 = (float)(var11 & 16711680) - var34 * var5 + var34;
                  var41 = (float)(var11 & '\uff00') - var36 * var5 + var36;
                  var42 = (float)(var11 & 255) - var38 * var5 + var38;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var29 * var2;
                        var5 -= var28 * var2;
                        var8 -= var33 * var2;
                        var40 -= var35 * var2;
                        var41 -= var37 * var2;
                        var42 -= var39 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var30 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var29 >= var28) && (var2 != var3 || var29 <= var30)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.c(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var1 >= 0.0F) {
                           this.c(this.E, (int)var2, 0, 0, (int)var6, (int)var4, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var6 += var30;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.c(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var1 >= 0.0F) {
                           this.c(this.E, (int)var2, 0, 0, (int)var4, (int)var6, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var6 += var30;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var29 * var2;
                        var5 -= var28 * var2;
                        var8 -= var33 * var2;
                        var40 -= var35 * var2;
                        var41 -= var37 * var2;
                        var42 -= var39 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var30 * var1;
                        var1 = 0.0F;
                     }

                     if(var29 < var28) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.c(this.E, (int)var2, 0, 0, (int)var6, (int)var5, var8, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.c(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var30;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.c(this.E, (int)var2, 0, 0, (int)var5, (int)var6, var8, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.c(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var30;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var9 = var9 - var32 * var6 + var32;
               var40 = (float)(var12 & 16711680) - var34 * var6 + var34;
               var41 = (float)(var12 & '\uff00') - var36 * var6 + var36;
               var42 = (float)(var12 & 255) - var38 * var6 + var38;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var28 * var3;
                     var6 -= var30 * var3;
                     var9 -= var33 * var3;
                     var40 -= var35 * var3;
                     var41 -= var37 * var3;
                     var42 -= var39 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var29 * var1;
                     var1 = 0.0F;
                  }

                  if(var28 < var30) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.c(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var2 >= 0.0F) {
                        this.c(this.E, (int)var3, 0, 0, (int)var5, (int)var4, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var4 += var29;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.c(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var2 >= 0.0F) {
                        this.c(this.E, (int)var3, 0, 0, (int)var4, (int)var5, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var4 += var29;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var28 * var3;
                     var6 -= var30 * var3;
                     var9 -= var33 * var3;
                     var40 -= var35 * var3;
                     var41 -= var37 * var3;
                     var42 -= var39 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var29 * var2;
                     var2 = 0.0F;
                  }

                  if(var28 < var30) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.c(this.E, (int)var3, 0, 0, (int)var4, (int)var6, var9, var32, var40, var34, var41, var36, var42, var38);
                        var4 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var1 >= 0.0F) {
                        this.c(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var29;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.c(this.E, (int)var3, 0, 0, (int)var6, (int)var4, var9, var32, var40, var34, var41, var36, var42, var38);
                        var4 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var1 >= 0.0F) {
                        this.c(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var29;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, int var19, int var20, int var21, int var22, float var23, float var24, float var25, int var26) {
      this.d(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   final void d(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, int var19, int var20, int var21, int var22, float var23, float var24, float var25, int var26) {
      if(var26 != this.A) {
         this.g = ui.n(this.F, var26);
         if(this.g == null) {
            this.g(var1, var2, var3, var4, var5, var6, var7, var8, var9, ms.a(var22, 76, var23, var19), ms.a(var22, 108, var24, var20), ms.a(var22, 67, var25, var21));
            return;
         }

         this.H = ui.b(this.F, var26)?64:((int[])((int[])this.F[1]))[8];
         this.a = this.H - 1;
         this.s = ui.a(this.F, var26);
         this.p = ui.o(this.F, var26);
      }

      this.d = var22;
      float var27;
      if(var1 > var2 || var1 > var3) {
         int var28;
         if(var2 <= var3) {
            var27 = var4;
            var4 = var5;
            var5 = var27;
            var27 = var1;
            var1 = var2;
            var2 = var27;
            var27 = var7;
            var7 = var8;
            var8 = var27;
            var27 = var13;
            var13 = var14;
            var14 = var27;
            var27 = var16;
            var16 = var17;
            var17 = var27;
            var27 = var10;
            var10 = var11;
            var11 = var27;
            var27 = var23;
            var23 = var24;
            var24 = var27;
            var28 = var19;
            var19 = var20;
            var20 = var28;
         } else {
            var27 = var4;
            var4 = var6;
            var6 = var27;
            var27 = var1;
            var1 = var3;
            var3 = var27;
            var27 = var7;
            var7 = var9;
            var9 = var27;
            var27 = var13;
            var13 = var15;
            var15 = var27;
            var27 = var16;
            var16 = var18;
            var18 = var27;
            var27 = var10;
            var10 = var12;
            var12 = var27;
            var27 = var23;
            var23 = var25;
            var25 = var27;
            var28 = var19;
            var19 = var21;
            var21 = var28;
         }
      }

      var13 /= var10;
      var14 /= var11;
      var15 /= var12;
      var16 /= var10;
      var17 /= var11;
      var18 /= var12;
      var7 = 1.0F / var7;
      var8 = 1.0F / var8;
      var9 = 1.0F / var9;
      var10 = 1.0F / var10;
      var11 = 1.0F / var11;
      var12 = 1.0F / var12;
      var27 = (float)(var19 >> 24 & 255);
      float var70 = (float)(var20 >> 24 & 255);
      float var29 = (float)(var21 >> 24 & 255);
      float var30 = (float)(var19 >> 16 & 255);
      float var31 = (float)(var20 >> 16 & 255);
      float var32 = (float)(var21 >> 16 & 255);
      float var33 = (float)(var19 >> 8 & 255);
      float var34 = (float)(var20 >> 8 & 255);
      float var35 = (float)(var21 >> 8 & 255);
      float var36 = (float)(var19 & 255);
      float var37 = (float)(var20 & 255);
      float var38 = (float)(var21 & 255);
      float var39 = 0.0F;
      float var40 = 0.0F;
      float var41 = 0.0F;
      float var42 = 0.0F;
      float var43 = 0.0F;
      float var44 = 0.0F;
      float var45 = 0.0F;
      float var46 = 0.0F;
      float var47 = 0.0F;
      float var48 = 0.0F;
      float var49;
      if(var2 != var1) {
         var49 = var2 - var1;
         var39 = (var5 - var4) / var49;
         var40 = (var8 - var7) / var49;
         var41 = (var11 - var10) / var49;
         var42 = (var14 - var13) / var49;
         var43 = (var17 - var16) / var49;
         var44 = (var24 - var23) / var49;
         var45 = (var70 - var27) / var49;
         var46 = (var31 - var30) / var49;
         var47 = (var34 - var33) / var49;
         var48 = (var37 - var36) / var49;
      }

      var49 = 0.0F;
      float var50 = 0.0F;
      float var51 = 0.0F;
      float var52 = 0.0F;
      float var53 = 0.0F;
      float var54 = 0.0F;
      float var55 = 0.0F;
      float var56 = 0.0F;
      float var57 = 0.0F;
      float var58 = 0.0F;
      float var59;
      if(var3 != var2) {
         var59 = var3 - var2;
         var49 = (var6 - var5) / var59;
         var50 = (var9 - var8) / var59;
         var51 = (var12 - var11) / var59;
         var52 = (var15 - var14) / var59;
         var53 = (var18 - var17) / var59;
         var54 = (var25 - var24) / var59;
         var55 = (var29 - var70) / var59;
         var56 = (var32 - var31) / var59;
         var57 = (var35 - var34) / var59;
         var58 = (var38 - var37) / var59;
      }

      var59 = 0.0F;
      float var60 = 0.0F;
      float var61 = 0.0F;
      float var62 = 0.0F;
      float var63 = 0.0F;
      float var64 = 0.0F;
      float var65 = 0.0F;
      float var66 = 0.0F;
      float var67 = 0.0F;
      float var68 = 0.0F;
      if(var1 != var3) {
         float var69 = var1 - var3;
         var59 = (var4 - var6) / var69;
         var60 = (var7 - var9) / var69;
         var61 = (var10 - var12) / var69;
         var62 = (var13 - var15) / var69;
         var63 = (var16 - var18) / var69;
         var64 = (var23 - var25) / var69;
         var65 = (var27 - var29) / var69;
         var66 = (var30 - var32) / var69;
         var67 = (var33 - var35) / var69;
         var68 = (var36 - var38) / var69;
      }

      if(var1 < (float)this.n) {
         if(var2 > (float)this.n) {
            var2 = (float)this.n;
         }

         if(var3 > (float)this.n) {
            var3 = (float)this.n;
         }

         if(var2 < var3) {
            var6 = var4;
            var9 = var7;
            var12 = var10;
            var15 = var13;
            var18 = var16;
            var25 = var23;
            var29 = var27;
            var32 = var30;
            var35 = var33;
            var38 = var36;
            if(var1 < 0.0F) {
               var4 -= var39 * var1;
               var6 -= var59 * var1;
               var7 -= var40 * var1;
               var9 -= var60 * var1;
               var10 -= var41 * var1;
               var12 -= var61 * var1;
               var13 -= var42 * var1;
               var15 -= var62 * var1;
               var16 -= var43 * var1;
               var18 -= var63 * var1;
               var23 -= var44 * var1;
               var25 -= var64 * var1;
               var27 -= var45 * var1;
               var29 -= var65 * var1;
               var30 -= var45 * var1;
               var32 -= var65 * var1;
               var33 -= var45 * var1;
               var35 -= var65 * var1;
               var36 -= var45 * var1;
               var38 -= var65 * var1;
               var1 = 0.0F;
            }

            if(var2 < 0.0F) {
               var5 -= var49 * var2;
               var8 -= var50 * var2;
               var11 -= var51 * var2;
               var14 -= var52 * var2;
               var17 -= var53 * var2;
               var24 -= var54 * var2;
               var70 -= var55 * var2;
               var31 -= var56 * var2;
               var34 -= var57 * var2;
               var37 -= var58 * var2;
               var2 = 0.0F;
            }

            if((var1 == var2 || var59 >= var39) && (var1 != var2 || var59 <= var49)) {
               var1 = (float)((int)(var1 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F)) - var2;
               var2 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                  this.c(this.E, this.g, (int)var1, (int)var4, (int)var6, var7, var9, var10, var12, var13, var15, var16, var18, var23, var25, var27, var29, var30, var32, var33, var35, var36, var38);
                  var4 += var39;
                  var6 += var59;
                  var7 += var40;
                  var9 += var60;
                  var10 += var41;
                  var12 += var61;
                  var13 += var42;
                  var15 += var62;
                  var16 += var43;
                  var18 += var63;
                  var23 += var44;
                  var25 += var64;
                  var27 += var45;
                  var29 += var65;
                  var30 += var46;
                  var32 += var66;
                  var33 += var47;
                  var35 += var67;
                  var36 += var48;
                  var38 += var68;
               }

               while(--var3 >= 0.0F) {
                  this.c(this.E, this.g, (int)var1, (int)var5, (int)var6, var8, var9, var11, var12, var14, var15, var17, var18, var24, var25, var70, var29, var31, var32, var34, var35, var37, var38);
                  var5 += var49;
                  var6 += var59;
                  var8 += var50;
                  var9 += var60;
                  var11 += var51;
                  var12 += var61;
                  var14 += var52;
                  var15 += var62;
                  var17 += var53;
                  var18 += var63;
                  var24 += var54;
                  var25 += var64;
                  var70 += var55;
                  var29 += var65;
                  var31 += var56;
                  var32 += var66;
                  var34 += var57;
                  var35 += var67;
                  var37 += var58;
                  var38 += var68;
                  var1 += (float)this.e;
               }
            } else {
               var1 = (float)((int)(var1 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F)) - var2;
               var2 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                  this.c(this.E, this.g, (int)var1, (int)var6, (int)var4, var9, var7, var12, var10, var15, var13, var18, var16, var25, var23, var29, var27, var32, var30, var35, var33, var38, var36);
                  var4 += var39;
                  var6 += var59;
                  var7 += var40;
                  var9 += var60;
                  var10 += var41;
                  var12 += var61;
                  var13 += var42;
                  var15 += var62;
                  var16 += var43;
                  var18 += var63;
                  var23 += var44;
                  var25 += var64;
                  var27 += var45;
                  var29 += var65;
                  var30 += var46;
                  var32 += var66;
                  var33 += var47;
                  var35 += var67;
                  var36 += var48;
                  var38 += var68;
               }

               while(--var3 >= 0.0F) {
                  this.c(this.E, this.g, (int)var1, (int)var6, (int)var5, var9, var8, var12, var11, var15, var14, var18, var17, var25, var24, var29, var70, var32, var31, var35, var34, var38, var37);
                  var5 += var49;
                  var6 += var59;
                  var8 += var50;
                  var9 += var60;
                  var11 += var51;
                  var12 += var61;
                  var14 += var52;
                  var15 += var62;
                  var17 += var53;
                  var18 += var63;
                  var24 += var54;
                  var25 += var64;
                  var70 += var55;
                  var29 += var65;
                  var31 += var56;
                  var32 += var66;
                  var34 += var57;
                  var35 += var67;
                  var37 += var58;
                  var38 += var68;
                  var1 += (float)this.e;
               }
            }
         } else {
            var5 = var4;
            var8 = var7;
            var11 = var10;
            var14 = var13;
            var17 = var16;
            var24 = var23;
            var70 = var27;
            var31 = var30;
            var34 = var33;
            var37 = var36;
            if(var1 < 0.0F) {
               var4 -= var39 * var1;
               var5 -= var59 * var1;
               var7 -= var40 * var1;
               var8 -= var60 * var1;
               var10 -= var41 * var1;
               var11 -= var61 * var1;
               var13 -= var42 * var1;
               var14 -= var62 * var1;
               var16 -= var43 * var1;
               var17 -= var63 * var1;
               var23 -= var44 * var1;
               var24 -= var64 * var1;
               var27 -= var45 * var1;
               var70 -= var65 * var1;
               var30 -= var45 * var1;
               var31 -= var65 * var1;
               var33 -= var45 * var1;
               var34 -= var65 * var1;
               var36 -= var45 * var1;
               var37 -= var65 * var1;
               var1 = 0.0F;
            }

            if(var3 < 0.0F) {
               var6 -= var49 * var3;
               var9 -= var50 * var3;
               var12 -= var51 * var3;
               var15 -= var52 * var3;
               var18 -= var53 * var3;
               var25 -= var54 * var3;
               var29 -= var55 * var3;
               var32 -= var56 * var3;
               var35 -= var57 * var3;
               var38 -= var58 * var3;
               var3 = 0.0F;
            }

            if((var1 == var3 || var59 >= var39) && (var1 != var3 || var49 <= var39)) {
               var1 = (float)((int)(var1 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F)) - var3;
               var3 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                  this.c(this.E, this.g, (int)var1, (int)var4, (int)var5, var7, var8, var10, var11, var13, var14, var16, var17, var23, var24, var27, var70, var30, var31, var33, var34, var36, var37);
                  var5 += var59;
                  var4 += var39;
                  var8 += var60;
                  var7 += var40;
                  var11 += var61;
                  var10 += var41;
                  var14 += var62;
                  var13 += var42;
                  var17 += var63;
                  var16 += var43;
                  var24 += var64;
                  var23 += var44;
                  var70 += var65;
                  var27 += var45;
                  var31 += var66;
                  var30 += var46;
                  var34 += var67;
                  var33 += var47;
                  var37 += var68;
                  var36 += var48;
               }

               while(--var2 >= 0.0F) {
                  this.c(this.E, this.g, (int)var1, (int)var4, (int)var6, var7, var9, var10, var12, var13, var15, var16, var18, var23, var25, var27, var29, var30, var32, var33, var35, var36, var38);
                  var4 += var39;
                  var6 += var49;
                  var7 += var40;
                  var9 += var50;
                  var10 += var41;
                  var12 += var51;
                  var13 += var42;
                  var15 += var52;
                  var16 += var43;
                  var18 += var53;
                  var23 += var44;
                  var25 += var54;
                  var27 += var45;
                  var29 += var55;
                  var30 += var46;
                  var32 += var56;
                  var33 += var47;
                  var35 += var57;
                  var36 += var48;
                  var38 += var58;
                  var1 += (float)this.e;
               }
            } else {
               var1 = (float)((int)(var1 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F)) - var3;
               var3 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                  this.c(this.E, this.g, (int)var1, (int)var5, (int)var4, var8, var7, var11, var10, var14, var13, var17, var16, var24, var23, var70, var27, var31, var30, var34, var33, var37, var36);
                  var4 += var39;
                  var5 += var59;
                  var7 += var40;
                  var8 += var60;
                  var10 += var41;
                  var11 += var61;
                  var13 += var42;
                  var14 += var62;
                  var16 += var43;
                  var17 += var63;
                  var23 += var44;
                  var24 += var64;
                  var27 += var45;
                  var70 += var65;
                  var30 += var46;
                  var31 += var66;
                  var33 += var47;
                  var34 += var67;
                  var36 += var48;
                  var37 += var68;
               }

               while(--var2 >= 0.0F) {
                  this.c(this.E, this.g, (int)var1, (int)var6, (int)var4, var9, var7, var12, var10, var15, var13, var18, var16, var25, var23, var29, var27, var32, var30, var35, var33, var38, var36);
                  var6 += var49;
                  var4 += var39;
                  var9 += var50;
                  var7 += var40;
                  var12 += var51;
                  var10 += var41;
                  var15 += var52;
                  var13 += var42;
                  var18 += var53;
                  var16 += var43;
                  var25 += var54;
                  var23 += var44;
                  var29 += var55;
                  var27 += var45;
                  var32 += var56;
                  var30 += var46;
                  var35 += var57;
                  var33 += var47;
                  var38 += var58;
                  var36 += var48;
                  var1 += (float)this.e;
               }
            }
         }

      }
   }

   private final void d(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var2 += var5 - 1;
         var7 += var8 * (float)var5;
         var9 += var10 * (float)var5;
         int var11;
         int var12;
         int var13;
         if(((boolean[])((boolean[])this.j[2]))[1]) {
            if(this.o) {
               var4 = var6 - var5 >> 2;
               var8 *= 4.0F;
               if(this.J == 0) {
                  if(var4 > 0) {
                     do {
                        var3 = en.c[(int)var7 & '\uffff'];
                        var7 += var8;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var1[var2] = var3;
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var1[var2] = var3;
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var1[var2] = var3;
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var1[var2] = var3;
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = en.c[(int)var7 & '\uffff'];

                     do {
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var1[var2] = var3;
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        --var4;
                     } while(var4 > 0);
                  }
               } else {
                  var11 = this.J;
                  var12 = 256 - this.J;
                  if(var4 > 0) {
                     do {
                        var3 = en.c[(int)var7 & '\uffff'];
                        var7 += var8;
                        var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var13 = var1[var2];
                           var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var13 = var1[var2];
                           var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var13 = var1[var2];
                           var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var13 = var1[var2];
                           var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');

                     do {
                        ++var2;
                        if(var9 < this.G[var2]) {
                           var13 = var1[var2];
                           var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                           this.G[var2] = var9;
                        }

                        var9 += var10;
                        --var4;
                     } while(var4 > 0);
                  }
               }
            } else {
               var4 = var6 - var5;
               if(this.J == 0) {
                  do {
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var1[var2] = en.c[(int)var7 & '\uffff'];
                        this.G[var2] = var9;
                     }

                     var9 += var10;
                     var7 += var8;
                     --var4;
                  } while(var4 > 0);
               } else {
                  var11 = this.J;
                  var12 = 256 - this.J;

                  do {
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var3 = en.c[(int)var7 & '\uffff'];
                        var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                        var13 = var1[var2];
                        var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                        this.G[var2] = var9;
                     }

                     var7 += var8;
                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }
            }
         } else if(this.o) {
            var4 = var6 - var5 >> 2;
            var8 *= 4.0F;
            if(this.J == 0) {
               if(var4 > 0) {
                  do {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var7 += var8;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var1[var2] = var3;
                     }

                     var9 += var10;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var1[var2] = var3;
                     }

                     var9 += var10;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var1[var2] = var3;
                     }

                     var9 += var10;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var1[var2] = var3;
                     }

                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if(var4 > 0) {
                  var3 = en.c[(int)var7 & '\uffff'];

                  do {
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var1[var2] = var3;
                     }

                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var11 = this.J;
               var12 = 256 - this.J;
               if(var4 > 0) {
                  do {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var13 = var1[var2];
                        var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     }

                     var9 += var10;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var13 = var1[var2];
                        var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     }

                     var9 += var10;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var13 = var1[var2];
                        var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     }

                     var9 += var10;
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var13 = var1[var2];
                        var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     }

                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if(var4 > 0) {
                  var3 = en.c[(int)var7 & '\uffff'];
                  var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');

                  do {
                     ++var2;
                     if(var9 < this.G[var2]) {
                        var13 = var1[var2];
                        var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     }

                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if(this.J == 0) {
               do {
                  ++var2;
                  if(var9 < this.G[var2]) {
                     var1[var2] = en.c[(int)var7 & '\uffff'];
                  }

                  var9 += var10;
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var11 = this.J;
               var12 = 256 - this.J;

               do {
                  ++var2;
                  if(var9 < this.G[var2]) {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                     var13 = var1[var2];
                     var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                  }

                  var7 += var8;
                  var9 += var10;
                  --var4;
               } while(var4 > 0);
            }
         }

      }
   }

   private final void b(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var2 += var5 - 1;
         var7 += var8 * (float)var5;
         int var11;
         int var12;
         int var13;
         if(((boolean[])((boolean[])this.j[2]))[1]) {
            if(this.o) {
               var4 = var6 - var5 >> 2;
               var8 *= 4.0F;
               if(this.J == 0) {
                  if(var4 > 0) {
                     do {
                        var3 = en.c[(int)var7 & '\uffff'];
                        var7 += var8;
                        ++var2;
                        var1[var2] = var3;
                        ++var2;
                        var1[var2] = var3;
                        ++var2;
                        var1[var2] = var3;
                        ++var2;
                        var1[var2] = var3;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = en.c[(int)var7 & '\uffff'];

                     do {
                        ++var2;
                        var1[var2] = var3;
                        --var4;
                     } while(var4 > 0);
                  }
               } else {
                  var11 = this.J;
                  var12 = 256 - this.J;
                  if(var4 > 0) {
                     do {
                        var3 = en.c[(int)var7 & '\uffff'];
                        var7 += var8;
                        var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                        ++var2;
                        var13 = var1[var2];
                        var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                        ++var2;
                        var13 = var1[var2];
                        var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                        ++var2;
                        var13 = var1[var2];
                        var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                        ++var2;
                        var13 = var1[var2];
                        var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');

                     do {
                        ++var2;
                        var13 = var1[var2];
                        var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }
               }
            } else {
               var4 = var6 - var5;
               if(this.J == 0) {
                  do {
                     ++var2;
                     var1[var2] = en.c[(int)var7 & '\uffff'];
                     var7 += var8;
                     --var4;
                  } while(var4 > 0);
               } else {
                  var11 = this.J;
                  var12 = 256 - this.J;

                  do {
                     ++var2;
                     var3 = en.c[(int)var7 & '\uffff'];
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                     var13 = var1[var2];
                     var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     var7 += var8;
                     --var4;
                  } while(var4 > 0);
               }
            }
         } else if(this.o) {
            var4 = var6 - var5 >> 2;
            var8 *= 4.0F;
            if(this.J == 0) {
               if(var4 > 0) {
                  do {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var7 += var8;
                     ++var2;
                     var1[var2] = var3;
                     ++var2;
                     var1[var2] = var3;
                     ++var2;
                     var1[var2] = var3;
                     ++var2;
                     var1[var2] = var3;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if(var4 > 0) {
                  var3 = en.c[(int)var7 & '\uffff'];

                  do {
                     ++var2;
                     var1[var2] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var11 = this.J;
               var12 = 256 - this.J;
               if(var4 > 0) {
                  do {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                     ++var2;
                     var13 = var1[var2];
                     var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     ++var2;
                     var13 = var1[var2];
                     var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     ++var2;
                     var13 = var1[var2];
                     var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     ++var2;
                     var13 = var1[var2];
                     var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if(var4 > 0) {
                  var3 = en.c[(int)var7 & '\uffff'];
                  var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');

                  do {
                     ++var2;
                     var13 = var1[var2];
                     var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if(this.J == 0) {
               do {
                  ++var2;
                  var1[var2] = en.c[(int)var7 & '\uffff'];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var11 = this.J;
               var12 = 256 - this.J;

               do {
                  ++var2;
                  var3 = en.c[(int)var7 & '\uffff'];
                  var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                  var13 = var1[var2];
                  var1[var2] = (var12 | var13 >> 24) << 24 | var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            }
         }

      }
   }

   private final void a(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         var7 += var8 * (float)var5;
         int var9;
         int var10;
         int var11;
         if(((boolean[])((boolean[])this.j[2]))[1]) {
            if(this.J == 0) {
               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = var3;
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                     }
                  }

                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2] = var3;
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2] = var3;
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2] = var3;
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2] = var3;
                     this.G[var2] = var7;
                  }

                  var7 += var8;
               }
            } else if(this.J == 254) {
               if(var5 != 0 && var6 <= this.K - 1) {
                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        var4 = var6 - var5 & 3;

                        while(true) {
                           --var4;
                           if(var4 < 0) {
                              return;
                           }

                           ++var2;
                           if(var7 < this.G[var2]) {
                              var1[var2 - 1] = var1[var2];
                           }

                           var7 += var8;
                        }
                     }

                     ++var2;
                     if(var7 < this.G[var2]) {
                        var1[var2 - 1] = var1[var2];
                     }

                     var7 += var8;
                     ++var2;
                     if(var7 < this.G[var2]) {
                        var1[var2 - 1] = var1[var2];
                     }

                     var7 += var8;
                     ++var2;
                     if(var7 < this.G[var2]) {
                        var1[var2 - 1] = var1[var2];
                     }

                     var7 += var8;
                     ++var2;
                     if(var7 < this.G[var2]) {
                        var1[var2 - 1] = var1[var2];
                     }

                     var7 += var8;
                  }
               }
            } else {
               var9 = this.J;
               var10 = 256 - this.J;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        if(var7 < this.G[var2]) {
                           var11 = var1[var2];
                           var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                     }
                  }

                  ++var2;
                  if(var7 < this.G[var2]) {
                     var11 = var1[var2];
                     var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var11 = var1[var2];
                     var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var11 = var1[var2];
                     var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                     this.G[var2] = var7;
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var11 = var1[var2];
                     var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                     this.G[var2] = var7;
                  }

                  var7 += var8;
               }
            }
         } else if(this.J == 0) {
            while(true) {
               --var4;
               if(var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        return;
                     }

                     ++var2;
                     if(var7 < this.G[var2]) {
                        var1[var2] = var3;
                     }

                     var7 += var8;
                  }
               }

               ++var2;
               if(var7 < this.G[var2]) {
                  var1[var2] = var3;
               }

               var7 += var8;
               ++var2;
               if(var7 < this.G[var2]) {
                  var1[var2] = var3;
               }

               var7 += var8;
               ++var2;
               if(var7 < this.G[var2]) {
                  var1[var2] = var3;
               }

               var7 += var8;
               ++var2;
               if(var7 < this.G[var2]) {
                  var1[var2] = var3;
               }

               var7 += var8;
            }
         } else if(this.J == 254) {
            if(var5 != 0 && var6 <= this.K - 1) {
               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2 - 1] = var1[var2];
                        }

                        var7 += var8;
                     }
                  }

                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2 - 1] = var1[var2];
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2 - 1] = var1[var2];
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2 - 1] = var1[var2];
                  }

                  var7 += var8;
                  ++var2;
                  if(var7 < this.G[var2]) {
                     var1[var2 - 1] = var1[var2];
                  }

                  var7 += var8;
               }
            }
         } else {
            var9 = this.J;
            var10 = 256 - this.J;
            var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

            while(true) {
               --var4;
               if(var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        return;
                     }

                     ++var2;
                     if(var7 < this.G[var2]) {
                        var11 = var1[var2];
                        var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                     }

                     var7 += var8;
                  }
               }

               ++var2;
               if(var7 < this.G[var2]) {
                  var11 = var1[var2];
                  var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               }

               var7 += var8;
               ++var2;
               if(var7 < this.G[var2]) {
                  var11 = var1[var2];
                  var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               }

               var7 += var8;
               ++var2;
               if(var7 < this.G[var2]) {
                  var11 = var1[var2];
                  var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               }

               var7 += var8;
               ++var2;
               if(var7 < this.G[var2]) {
                  var11 = var1[var2];
                  var1[var2] = var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               }

               var7 += var8;
            }
         }
      }
   }

   final void b(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, int var19, int var20, int var21, int var22, float var23, float var24, float var25, int var26) {
      this.b(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12) {
      this.e(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   private final void c(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var2 += var5 - 1;
         var4 = var6 - var5 >> 2;
         int var9;
         int var10;
         int var11;
         if(((boolean[])((boolean[])this.j[2]))[1]) {
            if(this.J == 0) {
               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        var1[var2] = var3;
                     }
                  }

                  ++var2;
                  var1[var2] = var3;
                  ++var2;
                  var1[var2] = var3;
                  ++var2;
                  var1[var2] = var3;
                  ++var2;
                  var1[var2] = var3;
               }
            } else if(this.J == 254) {
               if(var5 != 0 && var6 <= this.K - 1) {
                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        var4 = var6 - var5 & 3;

                        while(true) {
                           --var4;
                           if(var4 < 0) {
                              return;
                           }

                           ++var2;
                           var1[var2 - 1] = var1[var2];
                        }
                     }

                     ++var2;
                     var1[var2 - 1] = var1[var2];
                     ++var2;
                     var1[var2 - 1] = var1[var2];
                     ++var2;
                     var1[var2 - 1] = var1[var2];
                     ++var2;
                     var1[var2 - 1] = var1[var2];
                  }
               }
            } else {
               var9 = this.J;
               var10 = 256 - this.J;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        var11 = var1[var2];
                        var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                     }
                  }

                  ++var2;
                  var11 = var1[var2];
                  var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                  ++var2;
                  var11 = var1[var2];
                  var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                  ++var2;
                  var11 = var1[var2];
                  var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                  ++var2;
                  var11 = var1[var2];
                  var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               }
            }
         } else if(this.J == 0) {
            while(true) {
               --var4;
               if(var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        return;
                     }

                     ++var2;
                     var1[var2] = var3;
                  }
               }

               ++var2;
               var1[var2] = var3;
               ++var2;
               var1[var2] = var3;
               ++var2;
               var1[var2] = var3;
               ++var2;
               var1[var2] = var3;
            }
         } else if(this.J == 254) {
            if(var5 != 0 && var6 <= this.K - 1) {
               while(true) {
                  --var4;
                  if(var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        ++var2;
                        var1[var2 - 1] = var1[var2];
                     }
                  }

                  ++var2;
                  var1[var2 - 1] = var1[var2];
                  ++var2;
                  var1[var2 - 1] = var1[var2];
                  ++var2;
                  var1[var2 - 1] = var1[var2];
                  ++var2;
                  var1[var2 - 1] = var1[var2];
               }
            }
         } else {
            var9 = this.J;
            var10 = 256 - this.J;
            var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

            while(true) {
               --var4;
               if(var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        return;
                     }

                     ++var2;
                     var11 = var1[var2];
                     var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
                  }
               }

               ++var2;
               var11 = var1[var2];
               var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               ++var2;
               var11 = var1[var2];
               var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               ++var2;
               var11 = var1[var2];
               var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
               ++var2;
               var11 = var1[var2];
               var1[var2] = (var10 | var11 >> 24) << 24 | var3 + ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & '\uff00') * var9 >> 8 & '\uff00');
            }
         }
      }
   }

   private final void c(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var2 += var5 - 1;
         var7 += var8 * (float)var5;
         int var11;
         int var12;
         int var13;
         if(((boolean[])((boolean[])this.j[2]))[1]) {
            if(this.o) {
               var4 = var6 - var5 >> 2;
               var8 *= 4.0F;
               if(this.J == 0) {
                  if(var4 > 0) {
                     do {
                        var3 = en.c[(int)var7 & '\uffff'];
                        var7 += var8;
                        ++var2;
                        var1[var2] = var3;
                        ++var2;
                        var1[var2] = var3;
                        ++var2;
                        var1[var2] = var3;
                        ++var2;
                        var1[var2] = var3;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = en.c[(int)var7 & '\uffff'];

                     do {
                        ++var2;
                        var1[var2] = var3;
                        --var4;
                     } while(var4 > 0);
                  }
               } else {
                  var11 = this.J;
                  var12 = 256 - this.J;
                  if(var4 > 0) {
                     do {
                        var3 = en.c[(int)var7 & '\uffff'];
                        var7 += var8;
                        var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                        ++var2;
                        var13 = var1[var2];
                        var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                        ++var2;
                        var13 = var1[var2];
                        var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                        ++var2;
                        var13 = var1[var2];
                        var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                        ++var2;
                        var13 = var1[var2];
                        var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');

                     do {
                        ++var2;
                        var13 = var1[var2];
                        var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }
               }
            } else {
               var4 = var6 - var5;
               if(this.J == 0) {
                  do {
                     ++var2;
                     var1[var2] = en.c[(int)var7 & '\uffff'];
                     var7 += var8;
                     --var4;
                  } while(var4 > 0);
               } else {
                  var11 = this.J;
                  var12 = 256 - this.J;

                  do {
                     ++var2;
                     var3 = en.c[(int)var7 & '\uffff'];
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                     var13 = var1[var2];
                     var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     var7 += var8;
                     --var4;
                  } while(var4 > 0);
               }
            }
         } else if(this.o) {
            var4 = var6 - var5 >> 2;
            var8 *= 4.0F;
            if(this.J == 0) {
               if(var4 > 0) {
                  do {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var7 += var8;
                     ++var2;
                     var1[var2] = var3;
                     ++var2;
                     var1[var2] = var3;
                     ++var2;
                     var1[var2] = var3;
                     ++var2;
                     var1[var2] = var3;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if(var4 > 0) {
                  var3 = en.c[(int)var7 & '\uffff'];

                  do {
                     ++var2;
                     var1[var2] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var11 = this.J;
               var12 = 256 - this.J;
               if(var4 > 0) {
                  do {
                     var3 = en.c[(int)var7 & '\uffff'];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                     ++var2;
                     var13 = var1[var2];
                     var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     ++var2;
                     var13 = var1[var2];
                     var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     ++var2;
                     var13 = var1[var2];
                     var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     ++var2;
                     var13 = var1[var2];
                     var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if(var4 > 0) {
                  var3 = en.c[(int)var7 & '\uffff'];
                  var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');

                  do {
                     ++var2;
                     var13 = var1[var2];
                     var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }
            }
         } else {
            var4 = var6 - var5;
            if(this.J == 0) {
               do {
                  ++var2;
                  var1[var2] = en.c[(int)var7 & '\uffff'];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var11 = this.J;
               var12 = 256 - this.J;

               do {
                  ++var2;
                  var3 = en.c[(int)var7 & '\uffff'];
                  var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                  var13 = var1[var2];
                  var1[var2] = var3 + ((var13 & 16711935) * var11 >> 8 & 16711935) + ((var13 & '\uff00') * var11 >> 8 & '\uff00');
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            }
         }

      }
   }

   final void e(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, int var19, int var20, int var21, int var22, float var23, float var24, float var25, int var26) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   final int b() {
      return this.y[0] % this.e;
   }

   final void c(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, int var19, int var20, int var21, int var22, float var23, float var24, float var25, int var26) {
      if(var26 != this.A) {
         this.g = ui.n(this.F, var26);
         if(this.g == null) {
            this.f(var1, var2, var3, var4, var5, var6, var7, var8, var9, ms.a(var22, 73, var23, var19), ms.a(var22, 106, var24, var20), ms.a(var22, 82, var25, var21));
            return;
         }

         this.H = ui.b(this.F, var26)?64:((int[])((int[])this.F[1]))[8];
         this.a = this.H - 1;
         this.s = ui.a(this.F, var26);
         this.p = ui.o(this.F, var26);
      }

      this.d = var22;
      float var27;
      if(var1 > var2 || var1 > var3) {
         int var28;
         if(var2 <= var3) {
            var27 = var4;
            var4 = var5;
            var5 = var27;
            var27 = var1;
            var1 = var2;
            var2 = var27;
            var27 = var7;
            var7 = var8;
            var8 = var27;
            var27 = var13;
            var13 = var14;
            var14 = var27;
            var27 = var16;
            var16 = var17;
            var17 = var27;
            var27 = var10;
            var10 = var11;
            var11 = var27;
            var27 = var23;
            var23 = var24;
            var24 = var27;
            var28 = var19;
            var19 = var20;
            var20 = var28;
         } else {
            var27 = var4;
            var4 = var6;
            var6 = var27;
            var27 = var1;
            var1 = var3;
            var3 = var27;
            var27 = var7;
            var7 = var9;
            var9 = var27;
            var27 = var13;
            var13 = var15;
            var15 = var27;
            var27 = var16;
            var16 = var18;
            var18 = var27;
            var27 = var10;
            var10 = var12;
            var12 = var27;
            var27 = var23;
            var23 = var25;
            var25 = var27;
            var28 = var19;
            var19 = var21;
            var21 = var28;
         }
      }

      var13 /= var10;
      var14 /= var11;
      var15 /= var12;
      var16 /= var10;
      var17 /= var11;
      var18 /= var12;
      var7 = 1.0F / var7;
      var8 = 1.0F / var8;
      var9 = 1.0F / var9;
      var10 = 1.0F / var10;
      var11 = 1.0F / var11;
      var12 = 1.0F / var12;
      var27 = (float)(var19 >> 24 & 255);
      float var70 = (float)(var20 >> 24 & 255);
      float var29 = (float)(var21 >> 24 & 255);
      float var30 = (float)(var19 >> 16 & 255);
      float var31 = (float)(var20 >> 16 & 255);
      float var32 = (float)(var21 >> 16 & 255);
      float var33 = (float)(var19 >> 8 & 255);
      float var34 = (float)(var20 >> 8 & 255);
      float var35 = (float)(var21 >> 8 & 255);
      float var36 = (float)(var19 & 255);
      float var37 = (float)(var20 & 255);
      float var38 = (float)(var21 & 255);
      float var39 = 0.0F;
      float var40 = 0.0F;
      float var41 = 0.0F;
      float var42 = 0.0F;
      float var43 = 0.0F;
      float var44 = 0.0F;
      float var45 = 0.0F;
      float var46 = 0.0F;
      float var47 = 0.0F;
      float var48 = 0.0F;
      float var49;
      if(var2 != var1) {
         var49 = var2 - var1;
         var39 = (var5 - var4) / var49;
         var40 = (var8 - var7) / var49;
         var41 = (var11 - var10) / var49;
         var42 = (var14 - var13) / var49;
         var43 = (var17 - var16) / var49;
         var44 = (var24 - var23) / var49;
         var45 = (var70 - var27) / var49;
         var46 = (var31 - var30) / var49;
         var47 = (var34 - var33) / var49;
         var48 = (var37 - var36) / var49;
      }

      var49 = 0.0F;
      float var50 = 0.0F;
      float var51 = 0.0F;
      float var52 = 0.0F;
      float var53 = 0.0F;
      float var54 = 0.0F;
      float var55 = 0.0F;
      float var56 = 0.0F;
      float var57 = 0.0F;
      float var58 = 0.0F;
      float var59;
      if(var3 != var2) {
         var59 = var3 - var2;
         var49 = (var6 - var5) / var59;
         var50 = (var9 - var8) / var59;
         var51 = (var12 - var11) / var59;
         var52 = (var15 - var14) / var59;
         var53 = (var18 - var17) / var59;
         var54 = (var25 - var24) / var59;
         var55 = (var29 - var70) / var59;
         var56 = (var32 - var31) / var59;
         var57 = (var35 - var34) / var59;
         var58 = (var38 - var37) / var59;
      }

      var59 = 0.0F;
      float var60 = 0.0F;
      float var61 = 0.0F;
      float var62 = 0.0F;
      float var63 = 0.0F;
      float var64 = 0.0F;
      float var65 = 0.0F;
      float var66 = 0.0F;
      float var67 = 0.0F;
      float var68 = 0.0F;
      if(var1 != var3) {
         float var69 = var1 - var3;
         var59 = (var4 - var6) / var69;
         var60 = (var7 - var9) / var69;
         var61 = (var10 - var12) / var69;
         var62 = (var13 - var15) / var69;
         var63 = (var16 - var18) / var69;
         var64 = (var23 - var25) / var69;
         var65 = (var27 - var29) / var69;
         var66 = (var30 - var32) / var69;
         var67 = (var33 - var35) / var69;
         var68 = (var36 - var38) / var69;
      }

      if(var1 < (float)this.n) {
         if(var2 > (float)this.n) {
            var2 = (float)this.n;
         }

         if(var3 > (float)this.n) {
            var3 = (float)this.n;
         }

         if(var2 < var3) {
            var6 = var4;
            var9 = var7;
            var12 = var10;
            var15 = var13;
            var18 = var16;
            var25 = var23;
            var29 = var27;
            var32 = var30;
            var35 = var33;
            var38 = var36;
            if(var1 < 0.0F) {
               var4 -= var39 * var1;
               var6 -= var59 * var1;
               var7 -= var40 * var1;
               var9 -= var60 * var1;
               var10 -= var41 * var1;
               var12 -= var61 * var1;
               var13 -= var42 * var1;
               var15 -= var62 * var1;
               var16 -= var43 * var1;
               var18 -= var63 * var1;
               var23 -= var44 * var1;
               var25 -= var64 * var1;
               var27 -= var45 * var1;
               var29 -= var65 * var1;
               var30 -= var45 * var1;
               var32 -= var65 * var1;
               var33 -= var45 * var1;
               var35 -= var65 * var1;
               var36 -= var45 * var1;
               var38 -= var65 * var1;
               var1 = 0.0F;
            }

            if(var2 < 0.0F) {
               var5 -= var49 * var2;
               var8 -= var50 * var2;
               var11 -= var51 * var2;
               var14 -= var52 * var2;
               var17 -= var53 * var2;
               var24 -= var54 * var2;
               var70 -= var55 * var2;
               var31 -= var56 * var2;
               var34 -= var57 * var2;
               var37 -= var58 * var2;
               var2 = 0.0F;
            }

            if((var1 == var2 || var59 >= var39) && (var1 != var2 || var59 <= var49)) {
               var1 = (float)((int)(var1 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F)) - var2;
               var2 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                  this.d(this.E, this.g, (int)var1, (int)var4, (int)var6, var7, var9, var10, var12, var13, var15, var16, var18, var23, var25, var27, var29, var30, var32, var33, var35, var36, var38);
                  var4 += var39;
                  var6 += var59;
                  var7 += var40;
                  var9 += var60;
                  var10 += var41;
                  var12 += var61;
                  var13 += var42;
                  var15 += var62;
                  var16 += var43;
                  var18 += var63;
                  var23 += var44;
                  var25 += var64;
                  var27 += var45;
                  var29 += var65;
                  var30 += var46;
                  var32 += var66;
                  var33 += var47;
                  var35 += var67;
                  var36 += var48;
                  var38 += var68;
               }

               while(--var3 >= 0.0F) {
                  this.d(this.E, this.g, (int)var1, (int)var5, (int)var6, var8, var9, var11, var12, var14, var15, var17, var18, var24, var25, var70, var29, var31, var32, var34, var35, var37, var38);
                  var5 += var49;
                  var6 += var59;
                  var8 += var50;
                  var9 += var60;
                  var11 += var51;
                  var12 += var61;
                  var14 += var52;
                  var15 += var62;
                  var17 += var53;
                  var18 += var63;
                  var24 += var54;
                  var25 += var64;
                  var70 += var55;
                  var29 += var65;
                  var31 += var56;
                  var32 += var66;
                  var34 += var57;
                  var35 += var67;
                  var37 += var58;
                  var38 += var68;
                  var1 += (float)this.e;
               }
            } else {
               var1 = (float)((int)(var1 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F)) - var2;
               var2 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                  this.d(this.E, this.g, (int)var1, (int)var6, (int)var4, var9, var7, var12, var10, var15, var13, var18, var16, var25, var23, var29, var27, var32, var30, var35, var33, var38, var36);
                  var4 += var39;
                  var6 += var59;
                  var7 += var40;
                  var9 += var60;
                  var10 += var41;
                  var12 += var61;
                  var13 += var42;
                  var15 += var62;
                  var16 += var43;
                  var18 += var63;
                  var23 += var44;
                  var25 += var64;
                  var27 += var45;
                  var29 += var65;
                  var30 += var46;
                  var32 += var66;
                  var33 += var47;
                  var35 += var67;
                  var36 += var48;
                  var38 += var68;
               }

               while(--var3 >= 0.0F) {
                  this.d(this.E, this.g, (int)var1, (int)var6, (int)var5, var9, var8, var12, var11, var15, var14, var18, var17, var25, var24, var29, var70, var32, var31, var35, var34, var38, var37);
                  var5 += var49;
                  var6 += var59;
                  var8 += var50;
                  var9 += var60;
                  var11 += var51;
                  var12 += var61;
                  var14 += var52;
                  var15 += var62;
                  var17 += var53;
                  var18 += var63;
                  var24 += var54;
                  var25 += var64;
                  var70 += var55;
                  var29 += var65;
                  var31 += var56;
                  var32 += var66;
                  var34 += var57;
                  var35 += var67;
                  var37 += var58;
                  var38 += var68;
                  var1 += (float)this.e;
               }
            }
         } else {
            var5 = var4;
            var8 = var7;
            var11 = var10;
            var14 = var13;
            var17 = var16;
            var24 = var23;
            var70 = var27;
            var31 = var30;
            var34 = var33;
            var37 = var36;
            if(var1 < 0.0F) {
               var4 -= var39 * var1;
               var5 -= var59 * var1;
               var7 -= var40 * var1;
               var8 -= var60 * var1;
               var10 -= var41 * var1;
               var11 -= var61 * var1;
               var13 -= var42 * var1;
               var14 -= var62 * var1;
               var16 -= var43 * var1;
               var17 -= var63 * var1;
               var23 -= var44 * var1;
               var24 -= var64 * var1;
               var27 -= var45 * var1;
               var70 -= var65 * var1;
               var30 -= var45 * var1;
               var31 -= var65 * var1;
               var33 -= var45 * var1;
               var34 -= var65 * var1;
               var36 -= var45 * var1;
               var37 -= var65 * var1;
               var1 = 0.0F;
            }

            if(var3 < 0.0F) {
               var6 -= var49 * var3;
               var9 -= var50 * var3;
               var12 -= var51 * var3;
               var15 -= var52 * var3;
               var18 -= var53 * var3;
               var25 -= var54 * var3;
               var29 -= var55 * var3;
               var32 -= var56 * var3;
               var35 -= var57 * var3;
               var38 -= var58 * var3;
               var3 = 0.0F;
            }

            if((var1 == var3 || var59 >= var39) && (var1 != var3 || var49 <= var39)) {
               var1 = (float)((int)(var1 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F)) - var3;
               var3 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                  this.d(this.E, this.g, (int)var1, (int)var4, (int)var5, var7, var8, var10, var11, var13, var14, var16, var17, var23, var24, var27, var70, var30, var31, var33, var34, var36, var37);
                  var5 += var59;
                  var4 += var39;
                  var8 += var60;
                  var7 += var40;
                  var11 += var61;
                  var10 += var41;
                  var14 += var62;
                  var13 += var42;
                  var17 += var63;
                  var16 += var43;
                  var24 += var64;
                  var23 += var44;
                  var70 += var65;
                  var27 += var45;
                  var31 += var66;
                  var30 += var46;
                  var34 += var67;
                  var33 += var47;
                  var37 += var68;
                  var36 += var48;
               }

               while(--var2 >= 0.0F) {
                  this.d(this.E, this.g, (int)var1, (int)var4, (int)var6, var7, var9, var10, var12, var13, var15, var16, var18, var23, var25, var27, var29, var30, var32, var33, var35, var36, var38);
                  var4 += var39;
                  var6 += var49;
                  var7 += var40;
                  var9 += var50;
                  var10 += var41;
                  var12 += var51;
                  var13 += var42;
                  var15 += var52;
                  var16 += var43;
                  var18 += var53;
                  var23 += var44;
                  var25 += var54;
                  var27 += var45;
                  var29 += var55;
                  var30 += var46;
                  var32 += var56;
                  var33 += var47;
                  var35 += var57;
                  var36 += var48;
                  var38 += var58;
                  var1 += (float)this.e;
               }
            } else {
               var1 = (float)((int)(var1 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F)) - var3;
               var3 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                  this.d(this.E, this.g, (int)var1, (int)var5, (int)var4, var8, var7, var11, var10, var14, var13, var17, var16, var24, var23, var70, var27, var31, var30, var34, var33, var37, var36);
                  var4 += var39;
                  var5 += var59;
                  var7 += var40;
                  var8 += var60;
                  var10 += var41;
                  var11 += var61;
                  var13 += var42;
                  var14 += var62;
                  var16 += var43;
                  var17 += var63;
                  var23 += var44;
                  var24 += var64;
                  var27 += var45;
                  var70 += var65;
                  var30 += var46;
                  var31 += var66;
                  var33 += var47;
                  var34 += var67;
                  var36 += var48;
                  var37 += var68;
               }

               while(--var2 >= 0.0F) {
                  this.d(this.E, this.g, (int)var1, (int)var6, (int)var4, var9, var7, var12, var10, var15, var13, var18, var16, var25, var23, var29, var27, var32, var30, var35, var33, var38, var36);
                  var6 += var49;
                  var4 += var39;
                  var9 += var50;
                  var7 += var40;
                  var12 += var51;
                  var10 += var41;
                  var15 += var52;
                  var13 += var42;
                  var18 += var53;
                  var16 += var43;
                  var25 += var54;
                  var23 += var44;
                  var29 += var55;
                  var27 += var45;
                  var32 += var56;
                  var30 += var46;
                  var35 += var57;
                  var33 += var47;
                  var38 += var58;
                  var36 += var48;
                  var1 += (float)this.e;
               }
            }
         }

      }
   }

   final void h(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      if(this.D) {
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(-16777216 | var10, (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var14 = this.F;
         ((ta)(this.F == null?null:var14[6])).a(-16777216 | var10, (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var15 = this.F;
         ((ta)(this.F == null?null:var15[6])).a(-16777216 | var10, (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var16 = var5 - var4;
         float var17 = var2 - var1;
         float var18 = var6 - var4;
         float var19 = var3 - var1;
         float var20 = var8 - var7;
         float var21 = var9 - var7;
         float var22 = (float)((var11 & 16711680) - (var10 & 16711680));
         float var23 = (float)((var12 & 16711680) - (var10 & 16711680));
         float var24 = (float)((var11 & '\uff00') - (var10 & '\uff00'));
         float var25 = (float)((var12 & '\uff00') - (var10 & '\uff00'));
         float var26 = (float)((var11 & 255) - (var10 & 255));
         float var27 = (float)((var12 & 255) - (var10 & 255));
         float var28;
         if(var3 != var2) {
            var28 = (var6 - var5) / (var3 - var2);
         } else {
            var28 = 0.0F;
         }

         float var29;
         if(var2 != var1) {
            var29 = var16 / var17;
         } else {
            var29 = 0.0F;
         }

         float var30;
         if(var3 != var1) {
            var30 = var18 / var19;
         } else {
            var30 = 0.0F;
         }

         float var31 = var16 * var19 - var18 * var17;
         if(var31 != 0.0F) {
            float var32 = (var20 * var19 - var21 * var17) / var31;
            float var33 = (var21 * var16 - var20 * var18) / var31;
            float var34 = (var22 * var19 - var23 * var17) / var31;
            float var35 = (var23 * var16 - var22 * var18) / var31;
            float var36 = (var24 * var19 - var25 * var17) / var31;
            float var37 = (var25 * var16 - var24 * var18) / var31;
            float var38 = (var26 * var19 - var27 * var17) / var31;
            float var39 = (var27 * var16 - var26 * var18) / var31;
            float var42;
            float var40;
            float var41;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var7 = var7 - var32 * var4 + var32;
                  var40 = (float)(var10 & 16711680) - var34 * var4 + var34;
                  var41 = (float)(var10 & '\uff00') - var36 * var4 + var36;
                  var42 = (float)(var10 & 255) - var38 * var4 + var38;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var30 * var1;
                        var4 -= var29 * var1;
                        var7 -= var33 * var1;
                        var40 -= var35 * var1;
                        var41 -= var37 * var1;
                        var42 -= var39 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var28 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var30 >= var29) && (var1 != var2 || var30 <= var28)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.b(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.b(this.E, (int)var1, 0, 0, (int)var5, (int)var6, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var5 += var28;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.b(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.b(this.E, (int)var1, 0, 0, (int)var6, (int)var5, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var30;
                           var5 += var28;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var30 * var1;
                        var4 -= var29 * var1;
                        var7 -= var33 * var1;
                        var40 -= var35 * var1;
                        var41 -= var37 * var1;
                        var42 -= var39 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var28 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var30 >= var29) && (var1 != var3 || var28 <= var29)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.b(this.E, (int)var1, 0, 0, (int)var4, (int)var5, var7, var32, var40, var34, var41, var36, var42, var38);
                           var5 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var2 >= 0.0F) {
                           this.b(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var28;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.b(this.E, (int)var1, 0, 0, (int)var5, (int)var4, var7, var32, var40, var34, var41, var36, var42, var38);
                           var5 += var30;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var2 >= 0.0F) {
                           this.b(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var7, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var28;
                           var4 += var29;
                           var7 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var8 = var8 - var32 * var5 + var32;
                  var40 = (float)(var11 & 16711680) - var34 * var5 + var34;
                  var41 = (float)(var11 & '\uff00') - var36 * var5 + var36;
                  var42 = (float)(var11 & 255) - var38 * var5 + var38;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var29 * var2;
                        var5 -= var28 * var2;
                        var8 -= var33 * var2;
                        var40 -= var35 * var2;
                        var41 -= var37 * var2;
                        var42 -= var39 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var30 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var29 >= var28) && (var2 != var3 || var29 <= var30)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.b(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var1 >= 0.0F) {
                           this.b(this.E, (int)var2, 0, 0, (int)var6, (int)var4, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var6 += var30;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.b(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var1 >= 0.0F) {
                           this.b(this.E, (int)var2, 0, 0, (int)var4, (int)var6, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var29;
                           var6 += var30;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var29 * var2;
                        var5 -= var28 * var2;
                        var8 -= var33 * var2;
                        var40 -= var35 * var2;
                        var41 -= var37 * var2;
                        var42 -= var39 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var30 * var1;
                        var1 = 0.0F;
                     }

                     if(var29 < var28) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.b(this.E, (int)var2, 0, 0, (int)var6, (int)var5, var8, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.b(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var30;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.b(this.E, (int)var2, 0, 0, (int)var5, (int)var6, var8, var32, var40, var34, var41, var36, var42, var38);
                           var6 += var29;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var3 >= 0.0F) {
                           this.b(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var8, var32, var40, var34, var41, var36, var42, var38);
                           var4 += var30;
                           var5 += var28;
                           var8 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var9 = var9 - var32 * var6 + var32;
               var40 = (float)(var12 & 16711680) - var34 * var6 + var34;
               var41 = (float)(var12 & '\uff00') - var36 * var6 + var36;
               var42 = (float)(var12 & 255) - var38 * var6 + var38;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var28 * var3;
                     var6 -= var30 * var3;
                     var9 -= var33 * var3;
                     var40 -= var35 * var3;
                     var41 -= var37 * var3;
                     var42 -= var39 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var29 * var1;
                     var1 = 0.0F;
                  }

                  if(var28 < var30) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.b(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var2 >= 0.0F) {
                        this.b(this.E, (int)var3, 0, 0, (int)var5, (int)var4, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var4 += var29;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.b(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var2 >= 0.0F) {
                        this.b(this.E, (int)var3, 0, 0, (int)var4, (int)var5, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var28;
                        var4 += var29;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var28 * var3;
                     var6 -= var30 * var3;
                     var9 -= var33 * var3;
                     var40 -= var35 * var3;
                     var41 -= var37 * var3;
                     var42 -= var39 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var29 * var2;
                     var2 = 0.0F;
                  }

                  if(var28 < var30) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.b(this.E, (int)var3, 0, 0, (int)var4, (int)var6, var9, var32, var40, var34, var41, var36, var42, var38);
                        var4 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var1 >= 0.0F) {
                        this.b(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var29;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.b(this.E, (int)var3, 0, 0, (int)var6, (int)var4, var9, var32, var40, var34, var41, var36, var42, var38);
                        var4 += var28;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var1 >= 0.0F) {
                        this.b(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var9, var32, var40, var34, var41, var36, var42, var38);
                        var5 += var29;
                        var6 += var30;
                        var9 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   final void h(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, int var19, int var20, int var21, int var22, float var23, float var24, float var25, int var26) {
      this.e(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   final void b(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      if(this.D) {
         Object[] var11 = this.F;
         ((ta)(this.F == null?null:var11[6])).a(var10, (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var12 = this.F;
         ((ta)(this.F == null?null:var12[6])).a(var10, (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(var10, (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var14 = var5 - var4;
         float var15 = var2 - var1;
         float var16 = var6 - var4;
         float var17 = var3 - var1;
         float var18 = var8 - var7;
         float var19 = var9 - var7;
         float var20 = 0.0F;
         if(var2 != var1) {
            var20 = (var5 - var4) / (var2 - var1);
         }

         float var21 = 0.0F;
         if(var3 != var2) {
            var21 = (var6 - var5) / (var3 - var2);
         }

         float var22 = 0.0F;
         if(var3 != var1) {
            var22 = (var4 - var6) / (var1 - var3);
         }

         float var23 = var14 * var17 - var16 * var15;
         if(var23 != 0.0F) {
            float var24 = (var18 * var17 - var19 * var15) / var23;
            float var25 = (var19 * var14 - var18 * var16) / var23;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var7 = var7 - var24 * var4 + var24;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var21 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var22 >= var20) && (var1 != var2 || var22 <= var21)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.e(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.e(this.E, (int)var1, var10, 0, (int)var5, (int)var6, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.e(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.e(this.E, (int)var1, var10, 0, (int)var6, (int)var5, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var21 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var22 >= var20) && (var1 != var3 || var21 <= var20)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.e(this.E, (int)var1, var10, 0, (int)var4, (int)var5, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.e(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.e(this.E, (int)var1, var10, 0, (int)var5, (int)var4, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.e(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var8 = var8 - var24 * var5 + var24;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var22 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var20 >= var21) && (var2 != var3 || var20 <= var22)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.e(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.e(this.E, (int)var2, var10, 0, (int)var6, (int)var4, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.e(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.e(this.E, (int)var2, var10, 0, (int)var4, (int)var6, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var22 * var1;
                        var1 = 0.0F;
                     }

                     if(var20 < var21) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.e(this.E, (int)var2, var10, 0, (int)var6, (int)var5, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.e(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.e(this.E, (int)var2, var10, 0, (int)var5, (int)var6, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.e(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var9 = var9 - var24 * var6 + var24;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var20 * var1;
                     var1 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.e(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.e(this.E, (int)var3, var10, 0, (int)var5, (int)var4, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.e(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.e(this.E, (int)var3, var10, 0, (int)var4, (int)var5, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var20 * var2;
                     var2 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.e(this.E, (int)var3, var10, 0, (int)var4, (int)var6, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.e(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.e(this.E, (int)var3, var10, 0, (int)var6, (int)var4, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.e(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, int var19, int var20, int var21, int var22, float var23, float var24, float var25, int var26, float var27, int var28, float var29, int var30, float var31) {
      if(var26 != this.A) {
         this.g = ui.k(this.F, var26);
         if(this.g == null) {
            this.d(var1, var2, var3, var4, var5, var6, var7, var8, var9, ms.a(var22, 111, var23, var19), ms.a(var22, 73, var24, var20), ms.a(var22, 96, var25, var21));
            return;
         }

         this.H = ui.b(this.F, var26)?64:((int[])((int[])this.F[1]))[8];
         this.a = this.H - 1;
         this.s = ui.a(this.F, var26);
      }

      this.m = var27;
      if(var28 != this.f) {
         this.f_i = ui.k(this.F, var28);
         if(this.f_i == null) {
            this.d(var1, var2, var3, var4, var5, var6, var7, var8, var9, ms.a(var22, 83, var23, var19), ms.a(var22, 59, var24, var20), ms.a(var22, 113, var25, var21));
            return;
         }

         this.q = ui.b(this.F, var28)?64:((int[])((int[])this.F[1]))[8];
         this.M = this.q - 1;
      }

      this.B = var29;
      if(var30 != this.f_l) {
         this.I = ui.k(this.F, var30);
         if(this.I == null) {
            this.d((float)((int)var1), (float)((int)var2), (float)((int)var3), (float)((int)var4), (float)((int)var5), (float)((int)var6), (float)((int)var7), (float)((int)var8), (float)((int)var9), ms.a(var22, 55, var23, var19), ms.a(var22, 62, var24, var20), ms.a(var22, 110, var25, var21));
            return;
         }

         this.u = ui.b(this.F, var30)?64:((int[])((int[])this.F[1]))[8];
         this.v = this.u - 1;
      }

      this.b = var31;
      this.d = var22;
      float var32 = (float)(var19 >> 24 & 255);
      float var33 = (float)(var20 >> 24 & 255);
      float var34 = (float)(var21 >> 24 & 255);
      float var35 = (float)(var19 >> 16 & 255);
      float var36 = (float)(var20 >> 16 & 255);
      float var37 = (float)(var21 >> 16 & 255);
      float var38 = (float)(var19 >> 8 & 255);
      float var39 = (float)(var20 >> 8 & 255);
      float var40 = (float)(var21 >> 8 & 255);
      float var41 = (float)(var19 & 255);
      float var42 = (float)(var20 & 255);
      float var43 = (float)(var21 & 255);
      var13 /= var10;
      var14 /= var11;
      var15 /= var12;
      var16 /= var10;
      var17 /= var11;
      var18 /= var12;
      var7 = 1.0F / var7;
      var8 = 1.0F / var8;
      var9 = 1.0F / var9;
      var10 = 1.0F / var10;
      var11 = 1.0F / var11;
      var12 = 1.0F / var12;
      float var44 = 1.0F;
      float var45 = 0.0F;
      float var46 = 0.0F;
      float var47 = 0.0F;
      float var48 = 1.0F;
      float var49 = 0.0F;
      float var50 = 0.0F;
      float var51 = 0.0F;
      float var52 = 0.0F;
      float var53 = 0.0F;
      float var54 = 0.0F;
      float var55 = 0.0F;
      float var56 = 0.0F;
      float var57 = 0.0F;
      float var58 = 0.0F;
      float var59 = 0.0F;
      float var60 = 0.0F;
      float var61 = 0.0F;
      float var62;
      if(var2 != var1) {
         var62 = var2 - var1;
         var50 = (var5 - var4) / var62;
         var51 = (var8 - var7) / var62;
         var52 = (var11 - var10) / var62;
         var53 = (var14 - var13) / var62;
         var54 = (var17 - var16) / var62;
         var55 = (var24 - var23) / var62;
         var56 = (var33 - var32) / var62;
         var57 = (var36 - var35) / var62;
         var58 = (var39 - var38) / var62;
         var59 = (var42 - var41) / var62;
         var60 = (var45 - var44) / var62;
         var61 = (var48 - var47) / var62;
      }

      var62 = 0.0F;
      float var63 = 0.0F;
      float var64 = 0.0F;
      float var65 = 0.0F;
      float var66 = 0.0F;
      float var67 = 0.0F;
      float var68 = 0.0F;
      float var69 = 0.0F;
      float var70 = 0.0F;
      float var71 = 0.0F;
      float var72 = 0.0F;
      float var73 = 0.0F;
      float var74;
      if(var3 != var2) {
         var74 = var3 - var2;
         var62 = (var6 - var5) / var74;
         var63 = (var9 - var8) / var74;
         var64 = (var12 - var11) / var74;
         var65 = (var15 - var14) / var74;
         var66 = (var18 - var17) / var74;
         var67 = (var25 - var24) / var74;
         var68 = (var34 - var33) / var74;
         var69 = (var37 - var36) / var74;
         var70 = (var40 - var39) / var74;
         var71 = (var43 - var42) / var74;
         var72 = (var46 - var45) / var74;
         var73 = (var49 - var48) / var74;
      }

      var74 = 0.0F;
      float var75 = 0.0F;
      float var76 = 0.0F;
      float var77 = 0.0F;
      float var78 = 0.0F;
      float var79 = 0.0F;
      float var80 = 0.0F;
      float var81 = 0.0F;
      float var82 = 0.0F;
      float var83 = 0.0F;
      float var84 = 0.0F;
      float var85 = 0.0F;
      if(var1 != var3) {
         float var86 = var1 - var3;
         var74 = (var4 - var6) / var86;
         var75 = (var7 - var9) / var86;
         var76 = (var10 - var12) / var86;
         var77 = (var13 - var15) / var86;
         var78 = (var16 - var18) / var86;
         var79 = (var23 - var25) / var86;
         var80 = (var32 - var34) / var86;
         var81 = (var35 - var37) / var86;
         var82 = (var38 - var40) / var86;
         var83 = (var41 - var43) / var86;
         var84 = (var44 - var46) / var86;
         var85 = (var47 - var49) / var86;
      }

      if(var1 <= var2 && var1 <= var3) {
         if(var1 < (float)this.n) {
            if(var2 > (float)this.n) {
               var2 = (float)this.n;
            }

            if(var3 > (float)this.n) {
               var3 = (float)this.n;
            }

            if(var2 < var3) {
               var6 = var4;
               var9 = var7;
               var12 = var10;
               var15 = var13;
               var18 = var16;
               var25 = var23;
               var34 = var32;
               var37 = var35;
               var40 = var38;
               var43 = var41;
               var46 = var44;
               var49 = var47;
               if(var1 < 0.0F) {
                  var4 -= var50 * var1;
                  var6 -= var74 * var1;
                  var7 -= var51 * var1;
                  var9 -= var75 * var1;
                  var10 -= var52 * var1;
                  var12 -= var76 * var1;
                  var13 -= var53 * var1;
                  var15 -= var77 * var1;
                  var16 -= var54 * var1;
                  var18 -= var78 * var1;
                  var23 -= var55 * var1;
                  var25 -= var79 * var1;
                  var32 -= var56 * var1;
                  var34 -= var80 * var1;
                  var35 -= var57 * var1;
                  var37 -= var81 * var1;
                  var38 -= var58 * var1;
                  var40 -= var82 * var1;
                  var41 -= var59 * var1;
                  var43 -= var83 * var1;
                  var44 -= var60 * var1;
                  var46 -= var84 * var1;
                  var47 -= var61 * var1;
                  var49 -= var85 * var1;
                  var1 = 0.0F;
               }

               if(var2 < 0.0F) {
                  var5 -= var62 * var2;
                  var8 -= var63 * var2;
                  var11 -= var64 * var2;
                  var14 -= var65 * var2;
                  var17 -= var66 * var2;
                  var24 -= var67 * var2;
                  var33 -= var68 * var2;
                  var36 -= var69 * var2;
                  var39 -= var70 * var2;
                  var42 -= var71 * var2;
                  var45 -= var72 * var2;
                  var48 -= var73 * var2;
                  var2 = 0.0F;
               }

               if((var1 == var2 || var74 >= var50) && (var1 != var2 || var74 <= var62)) {
                  var1 = (float)((int)(var1 + 0.5F));
                  var2 = (float)((int)(var2 + 0.5F));
                  var3 = (float)((int)(var3 + 0.5F)) - var2;
                  var2 -= var1;

                  for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                     this.a(this.E, this.g, (int)var1, (int)var4, (int)var6, var7, var9, var10, var12, var13, var15, var16, var18, var23, var25, var32, var34, var35, var37, var38, var40, var41, var43, var44, var46, var47, var49);
                     var4 += var50;
                     var6 += var74;
                     var7 += var51;
                     var9 += var75;
                     var10 += var52;
                     var12 += var76;
                     var13 += var53;
                     var15 += var77;
                     var16 += var54;
                     var18 += var78;
                     var23 += var55;
                     var25 += var79;
                     var32 += var56;
                     var34 += var80;
                     var35 += var57;
                     var37 += var81;
                     var38 += var58;
                     var40 += var82;
                     var41 += var59;
                     var43 += var83;
                     var44 += var60;
                     var46 += var84;
                     var47 += var61;
                     var49 += var85;
                  }

                  while(--var3 >= 0.0F) {
                     this.a(this.E, this.g, (int)var1, (int)var5, (int)var6, var8, var9, var11, var12, var14, var15, var17, var18, var24, var25, var33, var34, var36, var37, var39, var40, var42, var43, var45, var46, var48, var49);
                     var5 += var62;
                     var6 += var74;
                     var8 += var63;
                     var9 += var75;
                     var11 += var64;
                     var12 += var76;
                     var14 += var65;
                     var15 += var77;
                     var17 += var66;
                     var18 += var78;
                     var24 += var67;
                     var25 += var79;
                     var33 += var68;
                     var34 += var80;
                     var36 += var69;
                     var37 += var81;
                     var39 += var70;
                     var40 += var82;
                     var42 += var71;
                     var43 += var83;
                     var45 += var72;
                     var46 += var84;
                     var48 += var73;
                     var49 += var85;
                     var1 += (float)this.e;
                  }

               } else {
                  var1 = (float)((int)(var1 + 0.5F));
                  var2 = (float)((int)(var2 + 0.5F));
                  var3 = (float)((int)(var3 + 0.5F)) - var2;
                  var2 -= var1;

                  for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                     this.a(this.E, this.g, (int)var1, (int)var6, (int)var4, var9, var7, var12, var10, var15, var13, var18, var16, var25, var23, var34, var32, var37, var35, var40, var38, var43, var41, var46, var44, var49, var47);
                     var4 += var50;
                     var6 += var74;
                     var7 += var51;
                     var9 += var75;
                     var10 += var52;
                     var12 += var76;
                     var13 += var53;
                     var15 += var77;
                     var16 += var54;
                     var18 += var78;
                     var23 += var55;
                     var25 += var79;
                     var32 += var56;
                     var34 += var80;
                     var35 += var57;
                     var37 += var81;
                     var38 += var58;
                     var40 += var82;
                     var41 += var59;
                     var43 += var83;
                     var44 += var60;
                     var46 += var84;
                     var47 += var61;
                     var49 += var61;
                  }

                  while(--var3 >= 0.0F) {
                     this.a(this.E, this.g, (int)var1, (int)var6, (int)var5, var9, var8, var12, var11, var15, var14, var18, var17, var25, var24, var34, var33, var37, var36, var40, var39, var43, var42, var46, var45, var49, var48);
                     var5 += var62;
                     var6 += var74;
                     var8 += var63;
                     var9 += var75;
                     var11 += var64;
                     var12 += var76;
                     var14 += var65;
                     var15 += var77;
                     var17 += var66;
                     var18 += var78;
                     var24 += var67;
                     var25 += var79;
                     var33 += var68;
                     var34 += var80;
                     var36 += var69;
                     var37 += var81;
                     var39 += var70;
                     var40 += var82;
                     var42 += var71;
                     var43 += var83;
                     var45 += var72;
                     var46 += var84;
                     var48 += var73;
                     var49 += var85;
                     var1 += (float)this.e;
                  }

               }
            } else {
               var5 = var4;
               var8 = var7;
               var11 = var10;
               var14 = var13;
               var17 = var16;
               var24 = var23;
               var33 = var32;
               var36 = var35;
               var39 = var38;
               var42 = var41;
               var45 = var44;
               var48 = var47;
               if(var1 < 0.0F) {
                  var4 -= var50 * var1;
                  var5 -= var74 * var1;
                  var7 -= var51 * var1;
                  var8 -= var75 * var1;
                  var10 -= var52 * var1;
                  var11 -= var76 * var1;
                  var13 -= var53 * var1;
                  var14 -= var77 * var1;
                  var16 -= var54 * var1;
                  var17 -= var78 * var1;
                  var23 -= var55 * var1;
                  var24 -= var79 * var1;
                  var32 -= var56 * var1;
                  var33 -= var80 * var1;
                  var35 -= var57 * var1;
                  var36 -= var81 * var1;
                  var38 -= var58 * var1;
                  var39 -= var82 * var1;
                  var41 -= var59 * var1;
                  var42 -= var83 * var1;
                  var44 -= var60 * var1;
                  var45 -= var84 * var1;
                  var47 -= var61 * var1;
                  var48 -= var85 * var1;
                  var1 = 0.0F;
               }

               if(var3 < 0.0F) {
                  var6 -= var62 * var3;
                  var9 -= var63 * var3;
                  var12 -= var64 * var3;
                  var15 -= var65 * var3;
                  var18 -= var66 * var3;
                  var25 -= var67 * var3;
                  var34 -= var68 * var3;
                  var37 -= var69 * var3;
                  var40 -= var70 * var3;
                  var43 -= var71 * var3;
                  var46 -= var72 * var3;
                  var49 -= var73 * var3;
                  var3 = 0.0F;
               }

               if((var1 == var3 || var74 >= var50) && (var1 != var3 || var62 <= var50)) {
                  var1 = (float)((int)(var1 + 0.5F));
                  var3 = (float)((int)(var3 + 0.5F));
                  var2 = (float)((int)(var2 + 0.5F)) - var3;
                  var3 -= var1;

                  for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                     this.a(this.E, this.g, (int)var1, (int)var4, (int)var5, var7, var8, var10, var11, var13, var14, var16, var17, var23, var24, var32, var33, var35, var36, var38, var39, var41, var42, var44, var45, var47, var48);
                     var5 += var74;
                     var4 += var50;
                     var8 += var75;
                     var7 += var51;
                     var11 += var76;
                     var10 += var52;
                     var14 += var77;
                     var13 += var53;
                     var17 += var78;
                     var16 += var54;
                     var24 += var79;
                     var23 += var55;
                     var33 += var80;
                     var32 += var56;
                     var36 += var81;
                     var35 += var57;
                     var39 += var82;
                     var38 += var58;
                     var42 += var83;
                     var41 += var59;
                     var45 += var84;
                     var44 += var60;
                     var48 += var85;
                     var47 += var61;
                  }

                  while(--var2 >= 0.0F) {
                     this.a(this.E, this.g, (int)var1, (int)var4, (int)var6, var7, var9, var10, var12, var13, var15, var16, var18, var23, var25, var32, var34, var35, var37, var38, var40, var41, var43, var44, var46, var47, var49);
                     var4 += var50;
                     var6 += var62;
                     var7 += var51;
                     var9 += var63;
                     var10 += var52;
                     var12 += var64;
                     var13 += var53;
                     var15 += var65;
                     var16 += var54;
                     var18 += var66;
                     var23 += var55;
                     var25 += var67;
                     var32 += var56;
                     var34 += var68;
                     var35 += var57;
                     var37 += var69;
                     var38 += var58;
                     var40 += var70;
                     var41 += var59;
                     var43 += var71;
                     var44 += var60;
                     var46 += var72;
                     var47 += var61;
                     var49 += var73;
                     var1 += (float)this.e;
                  }

               } else {
                  var1 = (float)((int)(var1 + 0.5F));
                  var3 = (float)((int)(var3 + 0.5F));
                  var2 = (float)((int)(var2 + 0.5F)) - var3;
                  var3 -= var1;

                  for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                     this.a(this.E, this.g, (int)var1, (int)var5, (int)var4, var8, var7, var11, var10, var14, var13, var17, var16, var24, var23, var33, var32, var36, var35, var39, var38, var42, var41, var45, var44, var48, var47);
                     var4 += var50;
                     var5 += var74;
                     var7 += var51;
                     var8 += var75;
                     var10 += var52;
                     var11 += var76;
                     var13 += var53;
                     var14 += var77;
                     var16 += var54;
                     var17 += var78;
                     var23 += var55;
                     var24 += var79;
                     var32 += var56;
                     var33 += var80;
                     var35 += var57;
                     var36 += var81;
                     var38 += var58;
                     var39 += var82;
                     var41 += var59;
                     var42 += var83;
                     var44 += var60;
                     var45 += var84;
                     var47 += var61;
                     var48 += var85;
                  }

                  while(--var2 >= 0.0F) {
                     this.a(this.E, this.g, (int)var1, (int)var6, (int)var4, var9, var7, var12, var10, var15, var13, var18, var16, var25, var23, var34, var32, var37, var35, var40, var38, var43, var41, var46, var44, var49, var47);
                     var6 += var62;
                     var4 += var50;
                     var9 += var63;
                     var7 += var51;
                     var12 += var64;
                     var10 += var52;
                     var15 += var65;
                     var13 += var53;
                     var18 += var66;
                     var16 += var54;
                     var25 += var67;
                     var23 += var55;
                     var34 += var68;
                     var32 += var56;
                     var37 += var69;
                     var35 += var57;
                     var40 += var70;
                     var38 += var58;
                     var43 += var71;
                     var41 += var59;
                     var46 += var72;
                     var44 += var60;
                     var49 += var73;
                     var47 += var61;
                     var1 += (float)this.e;
                  }

               }
            }
         }
      } else if(var2 <= var3) {
         if(var2 < (float)this.n) {
            if(var3 > (float)this.n) {
               var3 = (float)this.n;
            }

            if(var1 > (float)this.n) {
               var1 = (float)this.n;
            }

            if(var3 < var1) {
               var4 = var5;
               var7 = var8;
               var10 = var11;
               var13 = var14;
               var16 = var17;
               var23 = var24;
               var32 = var33;
               var35 = var36;
               var38 = var39;
               var41 = var42;
               var44 = var45;
               var47 = var48;
               if(var2 < 0.0F) {
                  var4 = var5 - var50 * var2;
                  var5 -= var62 * var2;
                  var7 = var8 - var51 * var2;
                  var8 -= var63 * var2;
                  var10 = var11 - var52 * var2;
                  var11 -= var64 * var2;
                  var13 = var14 - var53 * var2;
                  var14 -= var65 * var2;
                  var16 = var17 - var54 * var2;
                  var17 -= var66 * var2;
                  var23 = var24 - var55 * var2;
                  var24 -= var67 * var2;
                  var32 = var33 - var56 * var2;
                  var33 -= var68 * var2;
                  var35 = var36 - var57 * var2;
                  var36 -= var69 * var2;
                  var38 = var39 - var58 * var2;
                  var39 -= var70 * var2;
                  var41 = var42 - var59 * var2;
                  var42 -= var71 * var2;
                  var44 = var45 - var60 * var2;
                  var45 -= var72 * var2;
                  var47 = var48 - var61 * var2;
                  var48 -= var73 * var2;
                  var2 = 0.0F;
               }

               if(var3 < 0.0F) {
                  var6 -= var74 * var3;
                  var9 -= var75 * var3;
                  var12 -= var76 * var3;
                  var15 -= var77 * var3;
                  var18 -= var78 * var3;
                  var25 -= var79 * var3;
                  var34 -= var80 * var3;
                  var37 -= var81 * var3;
                  var40 -= var82 * var3;
                  var43 -= var83 * var3;
                  var46 -= var84 * var3;
                  var49 -= var85 * var3;
                  var3 = 0.0F;
               }

               if((var2 == var3 || var50 >= var62) && (var2 != var3 || var50 <= var74)) {
                  var2 = (float)((int)(var2 + 0.5F));
                  var3 = (float)((int)(var3 + 0.5F));
                  var1 = (float)((int)(var1 + 0.5F)) - var3;
                  var3 -= var2;

                  for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                     this.a(this.E, this.g, (int)var2, (int)var5, (int)var4, var8, var7, var11, var10, var14, var13, var17, var16, var24, var23, var33, var32, var36, var35, var39, var38, var42, var41, var45, var44, var48, var47);
                     var5 += var62;
                     var4 += var50;
                     var8 += var63;
                     var7 += var51;
                     var11 += var64;
                     var10 += var52;
                     var14 += var65;
                     var13 += var53;
                     var17 += var66;
                     var16 += var54;
                     var24 += var67;
                     var23 += var55;
                     var33 += var68;
                     var32 += var56;
                     var36 += var69;
                     var35 += var57;
                     var39 += var70;
                     var38 += var58;
                     var42 += var71;
                     var41 += var59;
                     var46 += var72;
                     var44 += var60;
                     var48 += var73;
                     var47 += var61;
                  }

                  while(--var1 >= 0.0F) {
                     this.a(this.E, this.g, (int)var2, (int)var6, (int)var4, var9, var7, var12, var10, var15, var13, var18, var16, var25, var23, var34, var32, var37, var35, var40, var38, var43, var41, var46, var44, var49, var47);
                     var6 += var74;
                     var4 += var50;
                     var9 += var75;
                     var7 += var51;
                     var12 += var76;
                     var10 += var52;
                     var15 += var77;
                     var13 += var53;
                     var18 += var78;
                     var16 += var54;
                     var25 += var79;
                     var23 += var55;
                     var34 += var80;
                     var32 += var56;
                     var37 += var81;
                     var35 += var57;
                     var40 += var82;
                     var38 += var58;
                     var43 += var83;
                     var41 += var59;
                     var46 += var84;
                     var44 += var60;
                     var49 += var85;
                     var47 += var61;
                     var2 += (float)this.e;
                  }

               } else {
                  var2 = (float)((int)(var2 + 0.5F));
                  var3 = (float)((int)(var3 + 0.5F));
                  var1 = (float)((int)(var1 + 0.5F)) - var3;
                  var3 -= var2;

                  for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                     this.a(this.E, this.g, (int)var2, (int)var4, (int)var5, var7, var8, var10, var11, var13, var14, var16, var17, var23, var24, var32, var33, var35, var36, var38, var39, var41, var42, var44, var45, var47, var48);
                     var4 += var50;
                     var5 += var62;
                     var7 += var51;
                     var8 += var63;
                     var10 += var52;
                     var11 += var64;
                     var13 += var53;
                     var14 += var65;
                     var16 += var54;
                     var17 += var66;
                     var23 += var55;
                     var24 += var67;
                     var32 += var56;
                     var33 += var68;
                     var35 += var57;
                     var36 += var69;
                     var38 += var58;
                     var39 += var70;
                     var41 += var59;
                     var42 += var71;
                     var44 += var60;
                     var45 += var72;
                     var47 += var61;
                     var48 += var73;
                  }

                  while(--var1 >= 0.0F) {
                     this.a(this.E, this.g, (int)var2, (int)var4, (int)var6, var7, var9, var10, var12, var13, var15, var16, var18, var23, var25, var32, var34, var35, var37, var38, var40, var41, var43, var44, var46, var47, var49);
                     var4 += var50;
                     var6 += var74;
                     var7 += var51;
                     var9 += var75;
                     var10 += var52;
                     var12 += var76;
                     var13 += var53;
                     var15 += var77;
                     var16 += var54;
                     var18 += var78;
                     var23 += var55;
                     var25 += var79;
                     var32 += var56;
                     var34 += var80;
                     var35 += var57;
                     var37 += var81;
                     var38 += var58;
                     var40 += var82;
                     var41 += var59;
                     var43 += var83;
                     var44 += var60;
                     var46 += var84;
                     var47 += var61;
                     var49 += var85;
                     var2 += (float)this.e;
                  }

               }
            } else {
               var6 = var5;
               var9 = var8;
               var12 = var11;
               var15 = var14;
               var18 = var17;
               var25 = var24;
               var34 = var33;
               var37 = var36;
               var40 = var39;
               var43 = var42;
               var46 = var45;
               var49 = var48;
               if(var2 < 0.0F) {
                  var6 = var5 - var50 * var2;
                  var5 -= var62 * var2;
                  var9 = var8 - var51 * var2;
                  var8 -= var63 * var2;
                  var12 = var11 - var52 * var2;
                  var11 -= var64 * var2;
                  var15 = var14 - var53 * var2;
                  var14 -= var65 * var2;
                  var18 = var17 - var54 * var2;
                  var17 -= var66 * var2;
                  var25 = var24 - var55 * var2;
                  var24 -= var67 * var2;
                  var34 = var33 - var56 * var2;
                  var33 -= var68 * var2;
                  var37 = var36 - var57 * var2;
                  var36 -= var69 * var2;
                  var40 = var39 - var58 * var2;
                  var39 -= var70 * var2;
                  var43 = var42 - var59 * var2;
                  var42 -= var71 * var2;
                  var46 = var45 - var60 * var2;
                  var45 -= var72 * var2;
                  var49 = var48 - var61 * var2;
                  var48 -= var73 * var2;
                  var2 = 0.0F;
               }

               if(var1 < 0.0F) {
                  var4 -= var74 * var1;
                  var7 -= var75 * var1;
                  var10 -= var76 * var1;
                  var13 -= var77 * var1;
                  var16 -= var78 * var1;
                  var23 -= var79 * var1;
                  var32 -= var80 * var1;
                  var35 -= var81 * var1;
                  var38 -= var82 * var1;
                  var41 -= var83 * var1;
                  var44 -= var84 * var1;
                  var47 -= var85 * var1;
                  var1 = 0.0F;
               }

               var2 = (float)((int)(var2 + 0.5F));
               var1 = (float)((int)(var1 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F)) - var1;
               var1 -= var2;
               var2 = (float)this.y[(int)var2];
               if(var50 < var62) {
                  while(--var1 >= 0.0F) {
                     this.a(this.E, this.g, (int)var2, (int)var6, (int)var5, var9, var8, var12, var11, var15, var14, var18, var17, var25, var24, var34, var33, var37, var36, var40, var39, var43, var42, var46, var45, var49, var48);
                     var6 += var50;
                     var5 += var62;
                     var9 += var51;
                     var8 += var63;
                     var12 += var52;
                     var11 += var64;
                     var15 += var53;
                     var14 += var65;
                     var18 += var54;
                     var17 += var66;
                     var25 += var55;
                     var24 += var67;
                     var34 += var56;
                     var33 += var68;
                     var37 += var57;
                     var36 += var69;
                     var40 += var58;
                     var39 += var70;
                     var43 += var59;
                     var42 += var71;
                     var46 += var60;
                     var45 += var72;
                     var49 += var61;
                     var48 += var73;
                     var2 += (float)this.e;
                  }

                  while(--var3 >= 0.0F) {
                     this.a(this.E, this.g, (int)var2, (int)var4, (int)var5, var7, var8, var10, var11, var13, var14, var16, var17, var23, var24, var32, var33, var35, var36, var38, var39, var41, var42, var44, var45, var47, var48);
                     var4 += var74;
                     var5 += var62;
                     var7 += var75;
                     var8 += var63;
                     var10 += var76;
                     var11 += var64;
                     var13 += var77;
                     var14 += var65;
                     var16 += var78;
                     var17 += var66;
                     var23 += var79;
                     var24 += var67;
                     var32 += var80;
                     var33 += var68;
                     var35 += var81;
                     var36 += var69;
                     var38 += var82;
                     var39 += var70;
                     var41 += var83;
                     var42 += var71;
                     var44 += var84;
                     var45 += var72;
                     var47 += var85;
                     var48 += var73;
                     var2 += (float)this.e;
                  }

               } else {
                  while(--var1 >= 0.0F) {
                     this.a(this.E, this.g, (int)var2, (int)var5, (int)var6, var8, var9, var11, var12, var14, var15, var17, var18, var24, var25, var33, var34, var36, var37, var39, var40, var42, var43, var45, var46, var48, var49);
                     var5 += var62;
                     var6 += var50;
                     var8 += var63;
                     var9 += var51;
                     var11 += var64;
                     var12 += var52;
                     var14 += var65;
                     var15 += var53;
                     var17 += var66;
                     var18 += var54;
                     var24 += var67;
                     var25 += var55;
                     var33 += var68;
                     var34 += var56;
                     var36 += var69;
                     var37 += var57;
                     var39 += var70;
                     var40 += var58;
                     var42 += var71;
                     var43 += var59;
                     var45 += var72;
                     var46 += var60;
                     var48 += var73;
                     var49 += var61;
                     var2 += (float)this.e;
                  }

                  while(--var3 >= 0.0F) {
                     this.a(this.E, this.g, (int)var2, (int)var5, (int)var4, var8, var7, var11, var10, var14, var13, var17, var16, var24, var23, var33, var32, var36, var35, var39, var38, var42, var41, var45, var44, var48, var47);
                     var5 += var62;
                     var4 += var74;
                     var8 += var63;
                     var7 += var75;
                     var11 += var64;
                     var10 += var76;
                     var14 += var65;
                     var13 += var77;
                     var17 += var66;
                     var16 += var78;
                     var24 += var67;
                     var23 += var79;
                     var33 += var68;
                     var32 += var80;
                     var36 += var69;
                     var35 += var81;
                     var39 += var70;
                     var38 += var82;
                     var42 += var71;
                     var41 += var83;
                     var45 += var72;
                     var44 += var84;
                     var48 += var73;
                     var47 += var85;
                     var2 += (float)this.e;
                  }

               }
            }
         }
      } else if(var3 < (float)this.n) {
         if(var1 > (float)this.n) {
            var1 = (float)this.n;
         }

         if(var2 > (float)this.n) {
            var2 = (float)this.n;
         }

         if(var1 < var2) {
            var5 = var6;
            var8 = var9;
            var11 = var12;
            var14 = var15;
            var17 = var18;
            var24 = var25;
            var33 = var34;
            var36 = var37;
            var39 = var40;
            var42 = var43;
            var45 = var46;
            var48 = var49;
            if(var3 < 0.0F) {
               var6 -= var74 * var3;
               var5 -= var62 * var3;
               var9 -= var75 * var3;
               var8 -= var63 * var3;
               var12 -= var76 * var3;
               var11 -= var64 * var3;
               var15 -= var77 * var3;
               var14 -= var65 * var3;
               var18 -= var78 * var3;
               var17 -= var66 * var3;
               var25 -= var79 * 3.0F;
               var24 -= var67 * var3;
               var34 -= var80 * var3;
               var33 -= var68 * var3;
               var37 -= var81 * var3;
               var36 -= var69 * var3;
               var40 -= var82 * var3;
               var39 -= var70 * var3;
               var43 -= var83 * var3;
               var42 -= var71 * var3;
               var46 -= var84 * var3;
               var45 -= var72 * var3;
               var49 -= var85 * var3;
               var48 -= var73 * var3;
               var3 = 0.0F;
            }

            if(var1 < 0.0F) {
               var4 -= var50 * var1;
               var7 -= var51 * var1;
               var10 -= var52 * var1;
               var13 -= var53 * var1;
               var16 -= var54 * var1;
               var23 -= var55 * var1;
               var32 -= var56 * var1;
               var35 -= var57 * var1;
               var38 -= var58 * var1;
               var41 -= var59 * var1;
               var44 -= var60 * var1;
               var47 -= var61 * var1;
               var1 = 0.0F;
            }

            if(var62 < var74) {
               var3 = (float)((int)(var3 + 0.5F));
               var1 = (float)((int)(var1 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F)) - var1;
               var1 -= var3;

               for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                  this.a(this.E, this.g, (int)var3, (int)var5, (int)var6, var8, var9, var11, var12, var14, var15, var17, var18, var24, var25, var33, var34, var36, var37, var39, var40, var42, var43, var45, var46, var48, var49);
                  var5 += var62;
                  var6 += var74;
                  var8 += var63;
                  var9 += var75;
                  var11 += var64;
                  var12 += var76;
                  var14 += var65;
                  var15 += var77;
                  var17 += var66;
                  var18 += var78;
                  var24 += var67;
                  var25 += var79;
                  var33 += var68;
                  var34 += var80;
                  var36 += var69;
                  var37 += var81;
                  var39 += var70;
                  var40 += var82;
                  var42 += var71;
                  var43 += var83;
                  var45 += var72;
                  var46 += var84;
                  var48 += var73;
                  var49 += var85;
               }

               while(--var2 >= 0.0F) {
                  this.a(this.E, this.g, (int)var3, (int)var5, (int)var4, var8, var7, var11, var10, var14, var13, var17, var16, var24, var23, var33, var32, var36, var35, var39, var38, var42, var41, var45, var44, var48, var47);
                  var5 += var62;
                  var4 += var50;
                  var8 += var63;
                  var7 += var51;
                  var11 += var64;
                  var10 += var52;
                  var14 += var65;
                  var13 += var53;
                  var17 += var66;
                  var16 += var54;
                  var24 += var67;
                  var23 += var55;
                  var33 += var68;
                  var32 += var56;
                  var36 += var69;
                  var35 += var57;
                  var39 += var70;
                  var38 += var58;
                  var42 += var71;
                  var41 += var59;
                  var45 += var72;
                  var44 += var60;
                  var48 += var73;
                  var47 += var61;
                  var3 += (float)this.e;
               }

            } else {
               var3 = (float)((int)(var3 + 0.5F));
               var1 = (float)((int)(var1 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F)) - var1;
               var1 -= var3;

               for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                  this.a(this.E, this.g, (int)var3, (int)var6, (int)var5, var9, var8, var12, var11, var15, var14, var18, var17, var25, var24, var34, var33, var37, var36, var40, var39, var43, var42, var46, var45, var49, var48);
                  var6 += var74;
                  var5 += var62;
                  var9 += var75;
                  var8 += var63;
                  var12 += var76;
                  var11 += var64;
                  var15 += var77;
                  var14 += var65;
                  var18 += var78;
                  var17 += var66;
                  var25 += var79;
                  var24 += var67;
                  var34 += var80;
                  var33 += var68;
                  var37 += var81;
                  var36 += var69;
                  var40 += var82;
                  var39 += var70;
                  var43 += var83;
                  var42 += var71;
                  var46 += var84;
                  var45 += var72;
                  var49 += var85;
                  var48 += var73;
               }

               while(--var2 >= 0.0F) {
                  this.a(this.E, this.g, (int)var3, (int)var4, (int)var5, var7, var8, var10, var11, var13, var14, var16, var17, var23, var24, var32, var33, var35, var36, var38, var39, var41, var42, var44, var45, var47, var48);
                  var4 += var50;
                  var5 += var62;
                  var7 += var51;
                  var8 += var63;
                  var10 += var52;
                  var11 += var64;
                  var13 += var53;
                  var14 += var65;
                  var16 += var54;
                  var17 += var66;
                  var23 += var55;
                  var24 += var67;
                  var32 += var56;
                  var33 += var68;
                  var35 += var57;
                  var36 += var69;
                  var38 += var58;
                  var39 += var70;
                  var41 += var59;
                  var42 += var71;
                  var44 += var60;
                  var45 += var72;
                  var47 += var61;
                  var48 += var73;
                  var3 += (float)this.e;
               }

            }
         } else {
            var4 = var6;
            var7 = var9;
            var10 = var12;
            var13 = var15;
            var16 = var18;
            var23 = var25;
            var32 = var34;
            var35 = var37;
            var38 = var40;
            var41 = var43;
            var44 = var46;
            var47 = var49;
            if(var3 < 0.0F) {
               var6 -= var74 * var3;
               var4 -= var62 * var3;
               var9 -= var75 * var3;
               var7 -= var63 * var3;
               var12 -= var76 * var3;
               var10 -= var64 * var3;
               var15 -= var77 * var3;
               var13 -= var65 * var3;
               var18 -= var78 * var3;
               var16 -= var66 * var3;
               var25 -= var79 * 3.0F;
               var23 -= var67 * var3;
               var34 -= var80 * var3;
               var32 -= var68 * var3;
               var37 -= var81 * var3;
               var35 -= var69 * var3;
               var40 -= var82 * var3;
               var38 -= var70 * var3;
               var43 -= var83 * var3;
               var41 -= var71 * var3;
               var46 -= var84 * var3;
               var44 -= var72 * var3;
               var49 -= var85 * var3;
               var47 -= var73 * var3;
               var3 = 0.0F;
            }

            if(var2 < 0.0F) {
               var5 -= var50 * var2;
               var8 -= var51 * var2;
               var11 -= var52 * var2;
               var14 -= var53 * var2;
               var17 -= var54 * var2;
               var24 -= var55 * var2;
               var33 -= var56 * var2;
               var36 -= var57 * var2;
               var39 -= var58 * var2;
               var42 -= var59 * var2;
               var45 -= var60 * var2;
               var48 -= var61 * var2;
               var2 = 0.0F;
            }

            if(var62 < var74) {
               var3 = (float)((int)(var3 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F));
               var1 = (float)((int)(var1 + 0.5F)) - var2;
               var2 -= var3;

               for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                  this.a(this.E, this.g, (int)var3, (int)var4, (int)var6, var7, var9, var10, var12, var13, var15, var16, var18, var23, var25, var32, var34, var35, var37, var38, var40, var41, var43, var44, var46, var47, var49);
                  var4 += var62;
                  var6 += var74;
                  var7 += var63;
                  var9 += var75;
                  var10 += var64;
                  var12 += var76;
                  var13 += var65;
                  var15 += var77;
                  var16 += var66;
                  var18 += var78;
                  var23 += var67;
                  var25 += var79;
                  var32 += var68;
                  var34 += var80;
                  var35 += var69;
                  var37 += var81;
                  var38 += var70;
                  var40 += var82;
                  var41 += var71;
                  var43 += var83;
                  var44 += var72;
                  var46 += var84;
                  var47 += var73;
                  var49 += var85;
               }

               while(--var1 >= 0.0F) {
                  this.a(this.E, this.g, (int)var3, (int)var5, (int)var6, var8, var9, var11, var12, var14, var15, var17, var18, var24, var25, var33, var34, var36, var37, var39, var40, var42, var43, var45, var46, var48, var49);
                  var5 += var50;
                  var6 += var74;
                  var8 += var51;
                  var9 += var75;
                  var11 += var52;
                  var12 += var76;
                  var14 += var53;
                  var15 += var77;
                  var17 += var54;
                  var18 += var78;
                  var24 += var55;
                  var25 += var79;
                  var33 += var56;
                  var34 += var80;
                  var36 += var57;
                  var37 += var81;
                  var39 += var58;
                  var40 += var82;
                  var42 += var59;
                  var43 += var83;
                  var45 += var60;
                  var46 += var84;
                  var48 += var61;
                  var49 += var85;
                  var3 += (float)this.e;
               }

            } else {
               var3 = (float)((int)(var3 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F));
               var1 = (float)((int)(var1 + 0.5F)) - var2;
               var2 -= var3;

               for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                  this.a(this.E, this.g, (int)var3, (int)var6, (int)var4, var9, var7, var12, var10, var15, var13, var18, var16, var25, var23, var34, var32, var37, var35, var40, var38, var43, var41, var46, var44, var49, var47);
                  var6 += var74;
                  var4 += var62;
                  var9 += var75;
                  var7 += var63;
                  var12 += var76;
                  var10 += var64;
                  var15 += var77;
                  var13 += var65;
                  var18 += var78;
                  var16 += var66;
                  var25 += var79;
                  var23 += var67;
                  var34 += var80;
                  var32 += var68;
                  var37 += var81;
                  var35 += var69;
                  var40 += var82;
                  var38 += var70;
                  var43 += var83;
                  var41 += var71;
                  var46 += var84;
                  var44 += var72;
                  var49 += var85;
                  var47 += var73;
               }

               while(--var1 >= 0.0F) {
                  this.a(this.E, this.g, (int)var3, (int)var6, (int)var5, var9, var8, var12, var11, var15, var14, var18, var17, var25, var24, var34, var33, var37, var36, var40, var39, var43, var42, var46, var45, var49, var48);
                  var6 += var74;
                  var5 += var50;
                  var9 += var75;
                  var8 += var51;
                  var12 += var76;
                  var11 += var52;
                  var15 += var77;
                  var14 += var53;
                  var18 += var78;
                  var17 += var54;
                  var25 += var79;
                  var24 += var55;
                  var34 += var80;
                  var33 += var56;
                  var37 += var81;
                  var36 += var57;
                  var40 += var82;
                  var39 += var58;
                  var43 += var83;
                  var42 += var59;
                  var46 += var84;
                  var45 += var60;
                  var49 += var85;
                  var48 += var61;
                  var3 += (float)this.e;
               }

            }
         }
      }
   }

   final void h(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      if(this.D) {
         Object[] var11 = this.F;
         ((ta)(this.F == null?null:var11[6])).a(var10, (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var12 = this.F;
         ((ta)(this.F == null?null:var12[6])).a(var10, (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(var10, (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var14 = var5 - var4;
         float var15 = var2 - var1;
         float var16 = var6 - var4;
         float var17 = var3 - var1;
         float var18 = var8 - var7;
         float var19 = var9 - var7;
         float var20 = 0.0F;
         if(var2 != var1) {
            var20 = (var5 - var4) / (var2 - var1);
         }

         float var21 = 0.0F;
         if(var3 != var2) {
            var21 = (var6 - var5) / (var3 - var2);
         }

         float var22 = 0.0F;
         if(var3 != var1) {
            var22 = (var4 - var6) / (var1 - var3);
         }

         float var23 = var14 * var17 - var16 * var15;
         if(var23 != 0.0F) {
            float var24 = (var18 * var17 - var19 * var15) / var23;
            float var25 = (var19 * var14 - var18 * var16) / var23;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var7 = var7 - var24 * var4 + var24;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var21 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var22 >= var20) && (var1 != var2 || var22 <= var21)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.a(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.a(this.E, (int)var1, var10, 0, (int)var5, (int)var6, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.a(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.a(this.E, (int)var1, var10, 0, (int)var6, (int)var5, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var21 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var22 >= var20) && (var1 != var3 || var21 <= var20)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.a(this.E, (int)var1, var10, 0, (int)var4, (int)var5, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.a(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.a(this.E, (int)var1, var10, 0, (int)var5, (int)var4, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.a(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var8 = var8 - var24 * var5 + var24;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var22 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var20 >= var21) && (var2 != var3 || var20 <= var22)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.a(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.a(this.E, (int)var2, var10, 0, (int)var6, (int)var4, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.a(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.a(this.E, (int)var2, var10, 0, (int)var4, (int)var6, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var22 * var1;
                        var1 = 0.0F;
                     }

                     if(var20 < var21) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.a(this.E, (int)var2, var10, 0, (int)var6, (int)var5, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.a(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.a(this.E, (int)var2, var10, 0, (int)var5, (int)var6, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.a(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var9 = var9 - var24 * var6 + var24;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var20 * var1;
                     var1 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.a(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.a(this.E, (int)var3, var10, 0, (int)var5, (int)var4, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.a(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.a(this.E, (int)var3, var10, 0, (int)var4, (int)var5, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var20 * var2;
                     var2 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.a(this.E, (int)var3, var10, 0, (int)var4, (int)var6, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.a(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.a(this.E, (int)var3, var10, 0, (int)var6, (int)var4, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.a(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   final void a(boolean var1) {
      this.D = var1;
   }

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      this.e(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   private final void c(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         int var15;
         int var17;
         int var16;
         int var19;
         int var18;
         int var20;
         if(this.h) {
            var2 += var5;
            var9 += var10 * (float)var5;
            var11 += var12 * (float)var5;
            var13 += var14 * (float)var5;
            if(this.o) {
               var4 = var6 - var5 >> 2;
               var10 *= 4.0F;
               var12 *= 4.0F;
               var14 *= 4.0F;
               if(this.J == 0) {
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var1[var2++] = var3;
                        var1[var2++] = var3;
                        var1[var2++] = var3;
                        var1[var2++] = var3;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        var1[var2++] = var3;
                        --var4;
                     } while(var4 > 0);
                  }
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2++] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');

                     do {
                        var17 = var1[var2];
                        var1[var2++] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        --var4;
                     } while(var4 > 0);
                  }
               } else {
                  if(var4 > 0) {
                     do {
                        var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        var16 = var2++;
                        var18 = var1[var16];
                        var19 = var3 + var18;
                        var20 = (var3 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        --var4;
                     } while(var4 > 0);
                  }
               }
            } else {
               var4 = var6 - var5;
               if(this.J == 0) {
                  do {
                     var1[var2++] = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;

                  do {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                     var17 = var1[var2];
                     var1[var2++] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               } else {
                  do {
                     var16 = var2++;
                     var17 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var18 = var1[var16];
                     var19 = var17 + var18;
                     var20 = (var17 & 16711935) + (var18 & 16711935);
                     var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                     var1[var16] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var2 += var5 - 1;
            var7 += var8 * (float)var5;
            var9 += var10 * (float)var5;
            var11 += var12 * (float)var5;
            var13 += var14 * (float)var5;
            if(((boolean[])((boolean[])this.j[2]))[1]) {
               if(this.o) {
                  var4 = var6 - var5 >> 2;
                  var10 *= 4.0F;
                  var12 *= 4.0F;
                  var14 *= 4.0F;
                  if(this.J == 0) {
                     if(var4 > 0) {
                        do {
                           var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var9 += var10;
                           var11 += var12;
                           var13 += var14;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var1[var2] = var3;
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var1[var2] = var3;
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var1[var2] = var3;
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var1[var2] = var3;
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           --var4;
                        } while(var4 > 0);
                     }

                     var4 = var6 - var5 & 3;
                     if(var4 > 0) {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                        do {
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var1[var2] = var3;
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           --var4;
                        } while(var4 > 0);
                     }
                  } else if(!this.x) {
                     var15 = this.J;
                     var16 = 256 - this.J;
                     if(var4 > 0) {
                        do {
                           var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var9 += var10;
                           var11 += var12;
                           var13 += var14;
                           var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var17 = var1[var2];
                              var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var17 = var1[var2];
                              var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var17 = var1[var2];
                              var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var17 = var1[var2];
                              var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           --var4;
                        } while(var4 > 0);
                     }

                     var4 = var6 - var5 & 3;
                     if(var4 > 0) {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');

                        do {
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var17 = var1[var2];
                              var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           --var4;
                        } while(var4 > 0);
                     }
                  } else {
                     if(var4 > 0) {
                        do {
                           var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var9 += var10;
                           var11 += var12;
                           var13 += var14;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var18 = var1[var2];
                              var19 = var3 + var18;
                              var20 = (var3 & 16711935) + (var18 & 16711935);
                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var18 = var1[var2];
                              var19 = var3 + var18;
                              var20 = (var3 & 16711935) + (var18 & 16711935);
                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var18 = var1[var2];
                              var19 = var3 + var18;
                              var20 = (var3 & 16711935) + (var18 & 16711935);
                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var18 = var1[var2];
                              var19 = var3 + var18;
                              var20 = (var3 & 16711935) + (var18 & 16711935);
                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           --var4;
                        } while(var4 > 0);
                     }

                     var4 = var6 - var5 & 3;
                     if(var4 > 0) {
                        var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                        do {
                           ++var2;
                           if(var7 < this.G[var2]) {
                              var18 = var1[var2];
                              var19 = var3 + var18;
                              var20 = (var3 & 16711935) + (var18 & 16711935);
                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                              this.G[var2] = var7;
                           }

                           var7 += var8;
                           --var4;
                        } while(var4 > 0);
                     }
                  }

               } else {
                  var4 = var6 - var5;
                  if(this.J == 0) {
                     do {
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        --var4;
                     } while(var4 > 0);
                  } else if(!this.x) {
                     var15 = this.J;
                     var16 = 256 - this.J;

                     do {
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                           var17 = var1[var2];
                           var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        --var4;
                     } while(var4 > 0);
                  } else {
                     do {
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var17 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                           var18 = var1[var2];
                           var19 = var17 + var18;
                           var20 = (var17 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                           this.G[var2] = var7;
                        }

                        var7 += var8;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        --var4;
                     } while(var4 > 0);
                  }

               }
            } else if(this.o) {
               var4 = var6 - var5 >> 2;
               var10 *= 4.0F;
               var12 *= 4.0F;
               var14 *= 4.0F;
               if(this.J == 0) {
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = var3;
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = var3;
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = var3;
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = var3;
                        }

                        var7 += var8;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var1[var2] = var3;
                        }

                        var7 += var8;
                        --var4;
                     } while(var4 > 0);
                  }
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;
                  if(var4 > 0) {
                     do {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var17 = var1[var2];
                           var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var17 = var1[var2];
                           var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var17 = var1[var2];
                           var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var17 = var1[var2];
                           var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        }

                        var7 += var8;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');

                     do {
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var17 = var1[var2];
                           var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                        }

                        var7 += var8;
                        --var4;
                     } while(var4 > 0);
                  }
               } else {
                  if(var4 > 0) {
                     do {
                        var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        }

                        var7 += var8;
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        }

                        var7 += var8;
                        --var4;
                     } while(var4 > 0);
                  }

                  var4 = var6 - var5 & 3;
                  if(var4 > 0) {
                     var3 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;

                     do {
                        ++var2;
                        if(var7 < this.G[var2]) {
                           var18 = var1[var2];
                           var19 = var3 + var18;
                           var20 = (var3 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                        }

                        var7 += var8;
                        --var4;
                     } while(var4 > 0);
                  }
               }

            } else {
               var4 = var6 - var5;
               if(this.J == 0) {
                  do {
                     ++var2;
                     if(var7 < this.G[var2]) {
                        var1[var2] = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                     }

                     var7 += var8;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               } else if(!this.x) {
                  var15 = this.J;
                  var16 = 256 - this.J;

                  do {
                     ++var2;
                     if(var7 < this.G[var2]) {
                        var3 = -16777216 | (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var3 = ((var3 & 16711935) * var16 >> 8 & 16711935) + ((var3 & '\uff00') * var16 >> 8 & '\uff00');
                        var17 = var1[var2];
                        var1[var2] = var3 + ((var17 & 16711935) * var15 >> 8 & 16711935) + ((var17 & '\uff00') * var15 >> 8 & '\uff00');
                     }

                     var7 += var8;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               } else {
                  do {
                     ++var2;
                     if(var7 < this.G[var2]) {
                        var17 = (int)var9 & 16711680 | (int)var11 & '\uff00' | (int)var13 & 255;
                        var18 = var1[var2];
                        var19 = var17 + var18;
                        var20 = (var17 & 16711935) + (var18 & 16711935);
                        var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                        var1[var2] = -16777216 | var19 - var18 | var18 - (var18 >>> 8);
                     }

                     var7 += var8;
                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     --var4;
                  } while(var4 > 0);
               }

            }
         }
      }
   }

   final void g(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, int var19, int var20, int var21, int var22, float var23, float var24, float var25, int var26) {
      if(var26 != this.A) {
         this.g = ui.n(this.F, var26);
         if(this.g == null) {
            this.d(var1, var2, var3, var4, var5, var6, var7, var8, var9, ms.a(var22, 78, var23, var19), ms.a(var22, 97, var24, var20), ms.a(var22, 122, var25, var21));
            return;
         }

         this.H = ui.b(this.F, var26)?64:((int[])((int[])this.F[1]))[8];
         this.a = this.H - 1;
         this.s = ui.a(this.F, var26);
         this.p = ui.o(this.F, var26);
      }

      this.d = var22;
      float var27;
      if(var1 > var2 || var1 > var3) {
         int var28;
         if(var2 <= var3) {
            var27 = var4;
            var4 = var5;
            var5 = var27;
            var27 = var1;
            var1 = var2;
            var2 = var27;
            var27 = var7;
            var7 = var8;
            var8 = var27;
            var27 = var13;
            var13 = var14;
            var14 = var27;
            var27 = var16;
            var16 = var17;
            var17 = var27;
            var27 = var10;
            var10 = var11;
            var11 = var27;
            var27 = var23;
            var23 = var24;
            var24 = var27;
            var28 = var19;
            var19 = var20;
            var20 = var28;
         } else {
            var27 = var4;
            var4 = var6;
            var6 = var27;
            var27 = var1;
            var1 = var3;
            var3 = var27;
            var27 = var7;
            var7 = var9;
            var9 = var27;
            var27 = var13;
            var13 = var15;
            var15 = var27;
            var27 = var16;
            var16 = var18;
            var18 = var27;
            var27 = var10;
            var10 = var12;
            var12 = var27;
            var27 = var23;
            var23 = var25;
            var25 = var27;
            var28 = var19;
            var19 = var21;
            var21 = var28;
         }
      }

      var13 /= var10;
      var14 /= var11;
      var15 /= var12;
      var16 /= var10;
      var17 /= var11;
      var18 /= var12;
      var7 = 1.0F / var7;
      var8 = 1.0F / var8;
      var9 = 1.0F / var9;
      var10 = 1.0F / var10;
      var11 = 1.0F / var11;
      var12 = 1.0F / var12;
      var27 = (float)(var19 >> 24 & 255);
      float var70 = (float)(var20 >> 24 & 255);
      float var29 = (float)(var21 >> 24 & 255);
      float var30 = (float)(var19 >> 16 & 255);
      float var31 = (float)(var20 >> 16 & 255);
      float var32 = (float)(var21 >> 16 & 255);
      float var33 = (float)(var19 >> 8 & 255);
      float var34 = (float)(var20 >> 8 & 255);
      float var35 = (float)(var21 >> 8 & 255);
      float var36 = (float)(var19 & 255);
      float var37 = (float)(var20 & 255);
      float var38 = (float)(var21 & 255);
      float var39 = 0.0F;
      float var40 = 0.0F;
      float var41 = 0.0F;
      float var42 = 0.0F;
      float var43 = 0.0F;
      float var44 = 0.0F;
      float var45 = 0.0F;
      float var46 = 0.0F;
      float var47 = 0.0F;
      float var48 = 0.0F;
      float var49;
      if(var2 != var1) {
         var49 = var2 - var1;
         var39 = (var5 - var4) / var49;
         var40 = (var8 - var7) / var49;
         var41 = (var11 - var10) / var49;
         var42 = (var14 - var13) / var49;
         var43 = (var17 - var16) / var49;
         var44 = (var24 - var23) / var49;
         var45 = (var70 - var27) / var49;
         var46 = (var31 - var30) / var49;
         var47 = (var34 - var33) / var49;
         var48 = (var37 - var36) / var49;
      }

      var49 = 0.0F;
      float var50 = 0.0F;
      float var51 = 0.0F;
      float var52 = 0.0F;
      float var53 = 0.0F;
      float var54 = 0.0F;
      float var55 = 0.0F;
      float var56 = 0.0F;
      float var57 = 0.0F;
      float var58 = 0.0F;
      float var59;
      if(var3 != var2) {
         var59 = var3 - var2;
         var49 = (var6 - var5) / var59;
         var50 = (var9 - var8) / var59;
         var51 = (var12 - var11) / var59;
         var52 = (var15 - var14) / var59;
         var53 = (var18 - var17) / var59;
         var54 = (var25 - var24) / var59;
         var55 = (var29 - var70) / var59;
         var56 = (var32 - var31) / var59;
         var57 = (var35 - var34) / var59;
         var58 = (var38 - var37) / var59;
      }

      var59 = 0.0F;
      float var60 = 0.0F;
      float var61 = 0.0F;
      float var62 = 0.0F;
      float var63 = 0.0F;
      float var64 = 0.0F;
      float var65 = 0.0F;
      float var66 = 0.0F;
      float var67 = 0.0F;
      float var68 = 0.0F;
      if(var1 != var3) {
         float var69 = var1 - var3;
         var59 = (var4 - var6) / var69;
         var60 = (var7 - var9) / var69;
         var61 = (var10 - var12) / var69;
         var62 = (var13 - var15) / var69;
         var63 = (var16 - var18) / var69;
         var64 = (var23 - var25) / var69;
         var65 = (var27 - var29) / var69;
         var66 = (var30 - var32) / var69;
         var67 = (var33 - var35) / var69;
         var68 = (var36 - var38) / var69;
      }

      if(var1 < (float)this.n) {
         if(var2 > (float)this.n) {
            var2 = (float)this.n;
         }

         if(var3 > (float)this.n) {
            var3 = (float)this.n;
         }

         if(var2 < var3) {
            var6 = var4;
            var9 = var7;
            var12 = var10;
            var15 = var13;
            var18 = var16;
            var25 = var23;
            var29 = var27;
            var32 = var30;
            var35 = var33;
            var38 = var36;
            if(var1 < 0.0F) {
               var4 -= var39 * var1;
               var6 -= var59 * var1;
               var7 -= var40 * var1;
               var9 -= var60 * var1;
               var10 -= var41 * var1;
               var12 -= var61 * var1;
               var13 -= var42 * var1;
               var15 -= var62 * var1;
               var16 -= var43 * var1;
               var18 -= var63 * var1;
               var23 -= var44 * var1;
               var25 -= var64 * var1;
               var27 -= var45 * var1;
               var29 -= var65 * var1;
               var30 -= var45 * var1;
               var32 -= var65 * var1;
               var33 -= var45 * var1;
               var35 -= var65 * var1;
               var36 -= var45 * var1;
               var38 -= var65 * var1;
               var1 = 0.0F;
            }

            if(var2 < 0.0F) {
               var5 -= var49 * var2;
               var8 -= var50 * var2;
               var11 -= var51 * var2;
               var14 -= var52 * var2;
               var17 -= var53 * var2;
               var24 -= var54 * var2;
               var70 -= var55 * var2;
               var31 -= var56 * var2;
               var34 -= var57 * var2;
               var37 -= var58 * var2;
               var2 = 0.0F;
            }

            if((var1 == var2 || var59 >= var39) && (var1 != var2 || var59 <= var49)) {
               var1 = (float)((int)(var1 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F)) - var2;
               var2 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                  this.b(this.E, this.g, (int)var1, (int)var4, (int)var6, var7, var9, var10, var12, var13, var15, var16, var18, var23, var25, var27, var29, var30, var32, var33, var35, var36, var38);
                  var4 += var39;
                  var6 += var59;
                  var7 += var40;
                  var9 += var60;
                  var10 += var41;
                  var12 += var61;
                  var13 += var42;
                  var15 += var62;
                  var16 += var43;
                  var18 += var63;
                  var23 += var44;
                  var25 += var64;
                  var27 += var45;
                  var29 += var65;
                  var30 += var46;
                  var32 += var66;
                  var33 += var47;
                  var35 += var67;
                  var36 += var48;
                  var38 += var68;
               }

               while(--var3 >= 0.0F) {
                  this.b(this.E, this.g, (int)var1, (int)var5, (int)var6, var8, var9, var11, var12, var14, var15, var17, var18, var24, var25, var70, var29, var31, var32, var34, var35, var37, var38);
                  var5 += var49;
                  var6 += var59;
                  var8 += var50;
                  var9 += var60;
                  var11 += var51;
                  var12 += var61;
                  var14 += var52;
                  var15 += var62;
                  var17 += var53;
                  var18 += var63;
                  var24 += var54;
                  var25 += var64;
                  var70 += var55;
                  var29 += var65;
                  var31 += var56;
                  var32 += var66;
                  var34 += var57;
                  var35 += var67;
                  var37 += var58;
                  var38 += var68;
                  var1 += (float)this.e;
               }
            } else {
               var1 = (float)((int)(var1 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F)) - var2;
               var2 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                  this.b(this.E, this.g, (int)var1, (int)var6, (int)var4, var9, var7, var12, var10, var15, var13, var18, var16, var25, var23, var29, var27, var32, var30, var35, var33, var38, var36);
                  var4 += var39;
                  var6 += var59;
                  var7 += var40;
                  var9 += var60;
                  var10 += var41;
                  var12 += var61;
                  var13 += var42;
                  var15 += var62;
                  var16 += var43;
                  var18 += var63;
                  var23 += var44;
                  var25 += var64;
                  var27 += var45;
                  var29 += var65;
                  var30 += var46;
                  var32 += var66;
                  var33 += var47;
                  var35 += var67;
                  var36 += var48;
                  var38 += var68;
               }

               while(--var3 >= 0.0F) {
                  this.b(this.E, this.g, (int)var1, (int)var6, (int)var5, var9, var8, var12, var11, var15, var14, var18, var17, var25, var24, var29, var70, var32, var31, var35, var34, var38, var37);
                  var5 += var49;
                  var6 += var59;
                  var8 += var50;
                  var9 += var60;
                  var11 += var51;
                  var12 += var61;
                  var14 += var52;
                  var15 += var62;
                  var17 += var53;
                  var18 += var63;
                  var24 += var54;
                  var25 += var64;
                  var70 += var55;
                  var29 += var65;
                  var31 += var56;
                  var32 += var66;
                  var34 += var57;
                  var35 += var67;
                  var37 += var58;
                  var38 += var68;
                  var1 += (float)this.e;
               }
            }
         } else {
            var5 = var4;
            var8 = var7;
            var11 = var10;
            var14 = var13;
            var17 = var16;
            var24 = var23;
            var70 = var27;
            var31 = var30;
            var34 = var33;
            var37 = var36;
            if(var1 < 0.0F) {
               var4 -= var39 * var1;
               var5 -= var59 * var1;
               var7 -= var40 * var1;
               var8 -= var60 * var1;
               var10 -= var41 * var1;
               var11 -= var61 * var1;
               var13 -= var42 * var1;
               var14 -= var62 * var1;
               var16 -= var43 * var1;
               var17 -= var63 * var1;
               var23 -= var44 * var1;
               var24 -= var64 * var1;
               var27 -= var45 * var1;
               var70 -= var65 * var1;
               var30 -= var45 * var1;
               var31 -= var65 * var1;
               var33 -= var45 * var1;
               var34 -= var65 * var1;
               var36 -= var45 * var1;
               var37 -= var65 * var1;
               var1 = 0.0F;
            }

            if(var3 < 0.0F) {
               var6 -= var49 * var3;
               var9 -= var50 * var3;
               var12 -= var51 * var3;
               var15 -= var52 * var3;
               var18 -= var53 * var3;
               var25 -= var54 * var3;
               var29 -= var55 * var3;
               var32 -= var56 * var3;
               var35 -= var57 * var3;
               var38 -= var58 * var3;
               var3 = 0.0F;
            }

            if((var1 == var3 || var59 >= var39) && (var1 != var3 || var49 <= var39)) {
               var1 = (float)((int)(var1 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F)) - var3;
               var3 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                  this.b(this.E, this.g, (int)var1, (int)var4, (int)var5, var7, var8, var10, var11, var13, var14, var16, var17, var23, var24, var27, var70, var30, var31, var33, var34, var36, var37);
                  var5 += var59;
                  var4 += var39;
                  var8 += var60;
                  var7 += var40;
                  var11 += var61;
                  var10 += var41;
                  var14 += var62;
                  var13 += var42;
                  var17 += var63;
                  var16 += var43;
                  var24 += var64;
                  var23 += var44;
                  var70 += var65;
                  var27 += var45;
                  var31 += var66;
                  var30 += var46;
                  var34 += var67;
                  var33 += var47;
                  var37 += var68;
                  var36 += var48;
               }

               while(--var2 >= 0.0F) {
                  this.b(this.E, this.g, (int)var1, (int)var4, (int)var6, var7, var9, var10, var12, var13, var15, var16, var18, var23, var25, var27, var29, var30, var32, var33, var35, var36, var38);
                  var4 += var39;
                  var6 += var49;
                  var7 += var40;
                  var9 += var50;
                  var10 += var41;
                  var12 += var51;
                  var13 += var42;
                  var15 += var52;
                  var16 += var43;
                  var18 += var53;
                  var23 += var44;
                  var25 += var54;
                  var27 += var45;
                  var29 += var55;
                  var30 += var46;
                  var32 += var56;
                  var33 += var47;
                  var35 += var57;
                  var36 += var48;
                  var38 += var58;
                  var1 += (float)this.e;
               }
            } else {
               var1 = (float)((int)(var1 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F)) - var3;
               var3 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                  this.b(this.E, this.g, (int)var1, (int)var5, (int)var4, var8, var7, var11, var10, var14, var13, var17, var16, var24, var23, var70, var27, var31, var30, var34, var33, var37, var36);
                  var4 += var39;
                  var5 += var59;
                  var7 += var40;
                  var8 += var60;
                  var10 += var41;
                  var11 += var61;
                  var13 += var42;
                  var14 += var62;
                  var16 += var43;
                  var17 += var63;
                  var23 += var44;
                  var24 += var64;
                  var27 += var45;
                  var70 += var65;
                  var30 += var46;
                  var31 += var66;
                  var33 += var47;
                  var34 += var67;
                  var36 += var48;
                  var37 += var68;
               }

               while(--var2 >= 0.0F) {
                  this.b(this.E, this.g, (int)var1, (int)var6, (int)var4, var9, var7, var12, var10, var15, var13, var18, var16, var25, var23, var29, var27, var32, var30, var35, var33, var38, var36);
                  var6 += var49;
                  var4 += var39;
                  var9 += var50;
                  var7 += var40;
                  var12 += var51;
                  var10 += var41;
                  var15 += var52;
                  var13 += var42;
                  var18 += var53;
                  var16 += var43;
                  var25 += var54;
                  var23 += var44;
                  var29 += var55;
                  var27 += var45;
                  var32 += var56;
                  var30 += var46;
                  var35 += var57;
                  var33 += var47;
                  var38 += var58;
                  var36 += var48;
                  var1 += (float)this.e;
               }
            }
         }

      }
   }

   final void a(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      if(this.D) {
         Object[] var11 = this.F;
         ((ta)(this.F == null?null:var11[6])).a(var10, (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var12 = this.F;
         ((ta)(this.F == null?null:var12[6])).a(var10, (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(var10, (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var14 = var5 - var4;
         float var15 = var2 - var1;
         float var16 = var6 - var4;
         float var17 = var3 - var1;
         float var18 = var8 - var7;
         float var19 = var9 - var7;
         float var20 = 0.0F;
         if(var2 != var1) {
            var20 = (var5 - var4) / (var2 - var1);
         }

         float var21 = 0.0F;
         if(var3 != var2) {
            var21 = (var6 - var5) / (var3 - var2);
         }

         float var22 = 0.0F;
         if(var3 != var1) {
            var22 = (var4 - var6) / (var1 - var3);
         }

         float var23 = var14 * var17 - var16 * var15;
         if(var23 != 0.0F) {
            float var24 = (var18 * var17 - var19 * var15) / var23;
            float var25 = (var19 * var14 - var18 * var16) / var23;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var7 = var7 - var24 * var4 + var24;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var21 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var22 >= var20) && (var1 != var2 || var22 <= var21)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.h(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.h(this.E, (int)var1, var10, 0, (int)var5, (int)var6, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.h(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.h(this.E, (int)var1, var10, 0, (int)var6, (int)var5, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var21 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var22 >= var20) && (var1 != var3 || var21 <= var20)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.h(this.E, (int)var1, var10, 0, (int)var4, (int)var5, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.h(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.h(this.E, (int)var1, var10, 0, (int)var5, (int)var4, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.h(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var8 = var8 - var24 * var5 + var24;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var22 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var20 >= var21) && (var2 != var3 || var20 <= var22)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.h(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.h(this.E, (int)var2, var10, 0, (int)var6, (int)var4, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.h(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.h(this.E, (int)var2, var10, 0, (int)var4, (int)var6, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var22 * var1;
                        var1 = 0.0F;
                     }

                     if(var20 < var21) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.h(this.E, (int)var2, var10, 0, (int)var6, (int)var5, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.h(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.h(this.E, (int)var2, var10, 0, (int)var5, (int)var6, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.h(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var9 = var9 - var24 * var6 + var24;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var20 * var1;
                     var1 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.h(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.h(this.E, (int)var3, var10, 0, (int)var5, (int)var4, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.h(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.h(this.E, (int)var3, var10, 0, (int)var4, (int)var5, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var20 * var2;
                     var2 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.h(this.E, (int)var3, var10, 0, (int)var4, (int)var6, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.h(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.h(this.E, (int)var3, var10, 0, (int)var6, (int)var4, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.h(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   final void f(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, int var19, int var20, int var21, int var22, float var23, float var24, float var25, int var26) {
      if(var26 != this.A) {
         this.g = ui.n(this.F, var26);
         if(this.g == null) {
            this.h(var1, var2, var3, var4, var5, var6, var7, var8, var9, ms.a(var22, 83, var23, var19), ms.a(var22, 85, var24, var20), ms.a(var22, 120, var25, var21));
            return;
         }

         this.H = ui.b(this.F, var26)?64:((int[])((int[])this.F[1]))[8];
         this.a = this.H - 1;
         this.s = ui.a(this.F, var26);
         this.p = ui.o(this.F, var26);
      }

      this.d = var22;
      float var27;
      if(var1 > var2 || var1 > var3) {
         int var28;
         if(var2 <= var3) {
            var27 = var4;
            var4 = var5;
            var5 = var27;
            var27 = var1;
            var1 = var2;
            var2 = var27;
            var27 = var7;
            var7 = var8;
            var8 = var27;
            var27 = var13;
            var13 = var14;
            var14 = var27;
            var27 = var16;
            var16 = var17;
            var17 = var27;
            var27 = var10;
            var10 = var11;
            var11 = var27;
            var27 = var23;
            var23 = var24;
            var24 = var27;
            var28 = var19;
            var19 = var20;
            var20 = var28;
         } else {
            var27 = var4;
            var4 = var6;
            var6 = var27;
            var27 = var1;
            var1 = var3;
            var3 = var27;
            var27 = var7;
            var7 = var9;
            var9 = var27;
            var27 = var13;
            var13 = var15;
            var15 = var27;
            var27 = var16;
            var16 = var18;
            var18 = var27;
            var27 = var10;
            var10 = var12;
            var12 = var27;
            var27 = var23;
            var23 = var25;
            var25 = var27;
            var28 = var19;
            var19 = var21;
            var21 = var28;
         }
      }

      var13 /= var10;
      var14 /= var11;
      var15 /= var12;
      var16 /= var10;
      var17 /= var11;
      var18 /= var12;
      var7 = 1.0F / var7;
      var8 = 1.0F / var8;
      var9 = 1.0F / var9;
      var10 = 1.0F / var10;
      var11 = 1.0F / var11;
      var12 = 1.0F / var12;
      var27 = (float)(var19 >> 24 & 255);
      float var70 = (float)(var20 >> 24 & 255);
      float var29 = (float)(var21 >> 24 & 255);
      float var30 = (float)(var19 >> 16 & 255);
      float var31 = (float)(var20 >> 16 & 255);
      float var32 = (float)(var21 >> 16 & 255);
      float var33 = (float)(var19 >> 8 & 255);
      float var34 = (float)(var20 >> 8 & 255);
      float var35 = (float)(var21 >> 8 & 255);
      float var36 = (float)(var19 & 255);
      float var37 = (float)(var20 & 255);
      float var38 = (float)(var21 & 255);
      float var39 = 0.0F;
      float var40 = 0.0F;
      float var41 = 0.0F;
      float var42 = 0.0F;
      float var43 = 0.0F;
      float var44 = 0.0F;
      float var45 = 0.0F;
      float var46 = 0.0F;
      float var47 = 0.0F;
      float var48 = 0.0F;
      float var49;
      if(var2 != var1) {
         var49 = var2 - var1;
         var39 = (var5 - var4) / var49;
         var40 = (var8 - var7) / var49;
         var41 = (var11 - var10) / var49;
         var42 = (var14 - var13) / var49;
         var43 = (var17 - var16) / var49;
         var44 = (var24 - var23) / var49;
         var45 = (var70 - var27) / var49;
         var46 = (var31 - var30) / var49;
         var47 = (var34 - var33) / var49;
         var48 = (var37 - var36) / var49;
      }

      var49 = 0.0F;
      float var50 = 0.0F;
      float var51 = 0.0F;
      float var52 = 0.0F;
      float var53 = 0.0F;
      float var54 = 0.0F;
      float var55 = 0.0F;
      float var56 = 0.0F;
      float var57 = 0.0F;
      float var58 = 0.0F;
      float var59;
      if(var3 != var2) {
         var59 = var3 - var2;
         var49 = (var6 - var5) / var59;
         var50 = (var9 - var8) / var59;
         var51 = (var12 - var11) / var59;
         var52 = (var15 - var14) / var59;
         var53 = (var18 - var17) / var59;
         var54 = (var25 - var24) / var59;
         var55 = (var29 - var70) / var59;
         var56 = (var32 - var31) / var59;
         var57 = (var35 - var34) / var59;
         var58 = (var38 - var37) / var59;
      }

      var59 = 0.0F;
      float var60 = 0.0F;
      float var61 = 0.0F;
      float var62 = 0.0F;
      float var63 = 0.0F;
      float var64 = 0.0F;
      float var65 = 0.0F;
      float var66 = 0.0F;
      float var67 = 0.0F;
      float var68 = 0.0F;
      if(var1 != var3) {
         float var69 = var1 - var3;
         var59 = (var4 - var6) / var69;
         var60 = (var7 - var9) / var69;
         var61 = (var10 - var12) / var69;
         var62 = (var13 - var15) / var69;
         var63 = (var16 - var18) / var69;
         var64 = (var23 - var25) / var69;
         var65 = (var27 - var29) / var69;
         var66 = (var30 - var32) / var69;
         var67 = (var33 - var35) / var69;
         var68 = (var36 - var38) / var69;
      }

      if(var1 < (float)this.n) {
         if(var2 > (float)this.n) {
            var2 = (float)this.n;
         }

         if(var3 > (float)this.n) {
            var3 = (float)this.n;
         }

         if(var2 < var3) {
            var6 = var4;
            var9 = var7;
            var12 = var10;
            var15 = var13;
            var18 = var16;
            var25 = var23;
            var29 = var27;
            var32 = var30;
            var35 = var33;
            var38 = var36;
            if(var1 < 0.0F) {
               var4 -= var39 * var1;
               var6 -= var59 * var1;
               var7 -= var40 * var1;
               var9 -= var60 * var1;
               var10 -= var41 * var1;
               var12 -= var61 * var1;
               var13 -= var42 * var1;
               var15 -= var62 * var1;
               var16 -= var43 * var1;
               var18 -= var63 * var1;
               var23 -= var44 * var1;
               var25 -= var64 * var1;
               var27 -= var45 * var1;
               var29 -= var65 * var1;
               var30 -= var45 * var1;
               var32 -= var65 * var1;
               var33 -= var45 * var1;
               var35 -= var65 * var1;
               var36 -= var45 * var1;
               var38 -= var65 * var1;
               var1 = 0.0F;
            }

            if(var2 < 0.0F) {
               var5 -= var49 * var2;
               var8 -= var50 * var2;
               var11 -= var51 * var2;
               var14 -= var52 * var2;
               var17 -= var53 * var2;
               var24 -= var54 * var2;
               var70 -= var55 * var2;
               var31 -= var56 * var2;
               var34 -= var57 * var2;
               var37 -= var58 * var2;
               var2 = 0.0F;
            }

            if((var1 == var2 || var59 >= var39) && (var1 != var2 || var59 <= var49)) {
               var1 = (float)((int)(var1 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F)) - var2;
               var2 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                  this.a(this.E, this.g, (int)var1, (int)var4, (int)var6, var7, var9, var10, var12, var13, var15, var16, var18, var23, var25, var27, var29, var30, var32, var33, var35, var36, var38);
                  var4 += var39;
                  var6 += var59;
                  var7 += var40;
                  var9 += var60;
                  var10 += var41;
                  var12 += var61;
                  var13 += var42;
                  var15 += var62;
                  var16 += var43;
                  var18 += var63;
                  var23 += var44;
                  var25 += var64;
                  var27 += var45;
                  var29 += var65;
                  var30 += var46;
                  var32 += var66;
                  var33 += var47;
                  var35 += var67;
                  var36 += var48;
                  var38 += var68;
               }

               while(--var3 >= 0.0F) {
                  this.a(this.E, this.g, (int)var1, (int)var5, (int)var6, var8, var9, var11, var12, var14, var15, var17, var18, var24, var25, var70, var29, var31, var32, var34, var35, var37, var38);
                  var5 += var49;
                  var6 += var59;
                  var8 += var50;
                  var9 += var60;
                  var11 += var51;
                  var12 += var61;
                  var14 += var52;
                  var15 += var62;
                  var17 += var53;
                  var18 += var63;
                  var24 += var54;
                  var25 += var64;
                  var70 += var55;
                  var29 += var65;
                  var31 += var56;
                  var32 += var66;
                  var34 += var57;
                  var35 += var67;
                  var37 += var58;
                  var38 += var68;
                  var1 += (float)this.e;
               }
            } else {
               var1 = (float)((int)(var1 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F)) - var2;
               var2 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                  this.a(this.E, this.g, (int)var1, (int)var6, (int)var4, var9, var7, var12, var10, var15, var13, var18, var16, var25, var23, var29, var27, var32, var30, var35, var33, var38, var36);
                  var4 += var39;
                  var6 += var59;
                  var7 += var40;
                  var9 += var60;
                  var10 += var41;
                  var12 += var61;
                  var13 += var42;
                  var15 += var62;
                  var16 += var43;
                  var18 += var63;
                  var23 += var44;
                  var25 += var64;
                  var27 += var45;
                  var29 += var65;
                  var30 += var46;
                  var32 += var66;
                  var33 += var47;
                  var35 += var67;
                  var36 += var48;
                  var38 += var68;
               }

               while(--var3 >= 0.0F) {
                  this.a(this.E, this.g, (int)var1, (int)var6, (int)var5, var9, var8, var12, var11, var15, var14, var18, var17, var25, var24, var29, var70, var32, var31, var35, var34, var38, var37);
                  var5 += var49;
                  var6 += var59;
                  var8 += var50;
                  var9 += var60;
                  var11 += var51;
                  var12 += var61;
                  var14 += var52;
                  var15 += var62;
                  var17 += var53;
                  var18 += var63;
                  var24 += var54;
                  var25 += var64;
                  var70 += var55;
                  var29 += var65;
                  var31 += var56;
                  var32 += var66;
                  var34 += var57;
                  var35 += var67;
                  var37 += var58;
                  var38 += var68;
                  var1 += (float)this.e;
               }
            }
         } else {
            var5 = var4;
            var8 = var7;
            var11 = var10;
            var14 = var13;
            var17 = var16;
            var24 = var23;
            var70 = var27;
            var31 = var30;
            var34 = var33;
            var37 = var36;
            if(var1 < 0.0F) {
               var4 -= var39 * var1;
               var5 -= var59 * var1;
               var7 -= var40 * var1;
               var8 -= var60 * var1;
               var10 -= var41 * var1;
               var11 -= var61 * var1;
               var13 -= var42 * var1;
               var14 -= var62 * var1;
               var16 -= var43 * var1;
               var17 -= var63 * var1;
               var23 -= var44 * var1;
               var24 -= var64 * var1;
               var27 -= var45 * var1;
               var70 -= var65 * var1;
               var30 -= var45 * var1;
               var31 -= var65 * var1;
               var33 -= var45 * var1;
               var34 -= var65 * var1;
               var36 -= var45 * var1;
               var37 -= var65 * var1;
               var1 = 0.0F;
            }

            if(var3 < 0.0F) {
               var6 -= var49 * var3;
               var9 -= var50 * var3;
               var12 -= var51 * var3;
               var15 -= var52 * var3;
               var18 -= var53 * var3;
               var25 -= var54 * var3;
               var29 -= var55 * var3;
               var32 -= var56 * var3;
               var35 -= var57 * var3;
               var38 -= var58 * var3;
               var3 = 0.0F;
            }

            if((var1 == var3 || var59 >= var39) && (var1 != var3 || var49 <= var39)) {
               var1 = (float)((int)(var1 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F)) - var3;
               var3 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                  this.a(this.E, this.g, (int)var1, (int)var4, (int)var5, var7, var8, var10, var11, var13, var14, var16, var17, var23, var24, var27, var70, var30, var31, var33, var34, var36, var37);
                  var5 += var59;
                  var4 += var39;
                  var8 += var60;
                  var7 += var40;
                  var11 += var61;
                  var10 += var41;
                  var14 += var62;
                  var13 += var42;
                  var17 += var63;
                  var16 += var43;
                  var24 += var64;
                  var23 += var44;
                  var70 += var65;
                  var27 += var45;
                  var31 += var66;
                  var30 += var46;
                  var34 += var67;
                  var33 += var47;
                  var37 += var68;
                  var36 += var48;
               }

               while(--var2 >= 0.0F) {
                  this.a(this.E, this.g, (int)var1, (int)var4, (int)var6, var7, var9, var10, var12, var13, var15, var16, var18, var23, var25, var27, var29, var30, var32, var33, var35, var36, var38);
                  var4 += var39;
                  var6 += var49;
                  var7 += var40;
                  var9 += var50;
                  var10 += var41;
                  var12 += var51;
                  var13 += var42;
                  var15 += var52;
                  var16 += var43;
                  var18 += var53;
                  var23 += var44;
                  var25 += var54;
                  var27 += var45;
                  var29 += var55;
                  var30 += var46;
                  var32 += var56;
                  var33 += var47;
                  var35 += var57;
                  var36 += var48;
                  var38 += var58;
                  var1 += (float)this.e;
               }
            } else {
               var1 = (float)((int)(var1 + 0.5F));
               var3 = (float)((int)(var3 + 0.5F));
               var2 = (float)((int)(var2 + 0.5F)) - var3;
               var3 -= var1;

               for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                  this.a(this.E, this.g, (int)var1, (int)var5, (int)var4, var8, var7, var11, var10, var14, var13, var17, var16, var24, var23, var70, var27, var31, var30, var34, var33, var37, var36);
                  var4 += var39;
                  var5 += var59;
                  var7 += var40;
                  var8 += var60;
                  var10 += var41;
                  var11 += var61;
                  var13 += var42;
                  var14 += var62;
                  var16 += var43;
                  var17 += var63;
                  var23 += var44;
                  var24 += var64;
                  var27 += var45;
                  var70 += var65;
                  var30 += var46;
                  var31 += var66;
                  var33 += var47;
                  var34 += var67;
                  var36 += var48;
                  var37 += var68;
               }

               while(--var2 >= 0.0F) {
                  this.a(this.E, this.g, (int)var1, (int)var6, (int)var4, var9, var7, var12, var10, var15, var13, var18, var16, var25, var23, var29, var27, var32, var30, var35, var33, var38, var36);
                  var6 += var49;
                  var4 += var39;
                  var9 += var50;
                  var7 += var40;
                  var12 += var51;
                  var10 += var41;
                  var15 += var52;
                  var13 += var42;
                  var18 += var53;
                  var16 += var43;
                  var25 += var54;
                  var23 += var44;
                  var29 += var55;
                  var27 += var45;
                  var32 += var56;
                  var30 += var46;
                  var35 += var57;
                  var33 += var47;
                  var38 += var58;
                  var36 += var48;
                  var1 += (float)this.e;
               }
            }
         }

      }
   }

   final void b(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      this.b(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   final void b(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12) {
      if(this.D) {
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(en.c[(int)var10 & '\uffff'], (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var14 = this.F;
         ((ta)(this.F == null?null:var14[6])).a(en.c[(int)var10 & '\uffff'], (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var15 = this.F;
         ((ta)(this.F == null?null:var15[6])).a(en.c[(int)var10 & '\uffff'], (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var16 = var5 - var4;
         float var17 = var2 - var1;
         float var18 = var6 - var4;
         float var19 = var3 - var1;
         float var20 = var11 - var10;
         float var21 = var12 - var10;
         float var22 = var8 - var7;
         float var23 = var9 - var7;
         float var24;
         if(var3 != var2) {
            var24 = (var6 - var5) / (var3 - var2);
         } else {
            var24 = 0.0F;
         }

         float var25;
         if(var2 != var1) {
            var25 = var16 / var17;
         } else {
            var25 = 0.0F;
         }

         float var26;
         if(var3 != var1) {
            var26 = var18 / var19;
         } else {
            var26 = 0.0F;
         }

         float var27 = var16 * var19 - var18 * var17;
         if(var27 != 0.0F) {
            float var28 = (var20 * var19 - var21 * var17) / var27;
            float var29 = (var21 * var16 - var20 * var18) / var27;
            float var30 = (var22 * var19 - var23 * var17) / var27;
            float var31 = (var23 * var16 - var22 * var18) / var27;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var10 = var10 - var28 * var4 + var28;
                  var7 = var7 - var30 * var4 + var30;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var26 * var1;
                        var4 -= var25 * var1;
                        var10 -= var29 * var1;
                        var7 -= var31 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var24 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var26 >= var25) && (var1 != var2 || var26 <= var24)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.b(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var10, var28, var7, var30);
                           var6 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.b(this.E, (int)var1, 0, 0, (int)var5, (int)var6, var10, var28, var7, var30);
                           var6 += var26;
                           var5 += var24;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.b(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var10, var28, var7, var30);
                           var6 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.b(this.E, (int)var1, 0, 0, (int)var6, (int)var5, var10, var28, var7, var30);
                           var6 += var26;
                           var5 += var24;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var26 * var1;
                        var4 -= var25 * var1;
                        var10 -= var29 * var1;
                        var7 -= var31 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var24 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var26 >= var25) && (var1 != var3 || var24 <= var25)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.b(this.E, (int)var1, 0, 0, (int)var4, (int)var5, var10, var28, var7, var30);
                           var5 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var2 >= 0.0F) {
                           this.b(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var10, var28, var7, var30);
                           var6 += var24;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.b(this.E, (int)var1, 0, 0, (int)var5, (int)var4, var10, var28, var7, var30);
                           var5 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var2 >= 0.0F) {
                           this.b(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var10, var28, var7, var30);
                           var6 += var24;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var11 = var11 - var28 * var5 + var28;
                  var8 = var8 - var30 * var5 + var30;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var25 * var2;
                        var5 -= var24 * var2;
                        var11 -= var29 * var2;
                        var8 -= var31 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var26 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var25 >= var24) && (var2 != var3 || var25 <= var26)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.b(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var11, var28, var8, var30);
                           var4 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var1 >= 0.0F) {
                           this.b(this.E, (int)var2, 0, 0, (int)var6, (int)var4, var11, var28, var8, var30);
                           var4 += var25;
                           var6 += var26;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.b(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var11, var28, var8, var30);
                           var4 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var1 >= 0.0F) {
                           this.b(this.E, (int)var2, 0, 0, (int)var4, (int)var6, var11, var28, var8, var30);
                           var4 += var25;
                           var6 += var26;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var25 * var2;
                        var5 -= var24 * var2;
                        var11 -= var29 * var2;
                        var8 -= var31 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var26 * var1;
                        var1 = 0.0F;
                     }

                     if(var25 < var24) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.b(this.E, (int)var2, 0, 0, (int)var6, (int)var5, var11, var28, var8, var30);
                           var6 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.b(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var11, var28, var8, var30);
                           var4 += var26;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.b(this.E, (int)var2, 0, 0, (int)var5, (int)var6, var11, var28, var8, var30);
                           var6 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.b(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var11, var28, var8, var30);
                           var4 += var26;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var12 = var12 - var28 * var6 + var28;
               var9 = var9 - var30 * var6 + var30;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var24 * var3;
                     var6 -= var26 * var3;
                     var12 -= var29 * var3;
                     var9 -= var31 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var25 * var1;
                     var1 = 0.0F;
                  }

                  if(var24 < var26) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.b(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var12, var28, var9, var30);
                        var5 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var2 >= 0.0F) {
                        this.b(this.E, (int)var3, 0, 0, (int)var5, (int)var4, var12, var28, var9, var30);
                        var5 += var24;
                        var4 += var25;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.b(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var12, var28, var9, var30);
                        var5 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var2 >= 0.0F) {
                        this.b(this.E, (int)var3, 0, 0, (int)var4, (int)var5, var12, var28, var9, var30);
                        var5 += var24;
                        var4 += var25;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var24 * var3;
                     var6 -= var26 * var3;
                     var12 -= var29 * var3;
                     var9 -= var31 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var25 * var2;
                     var2 = 0.0F;
                  }

                  if(var24 < var26) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.b(this.E, (int)var3, 0, 0, (int)var4, (int)var6, var12, var28, var9, var30);
                        var4 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var1 >= 0.0F) {
                        this.b(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var12, var28, var9, var30);
                        var5 += var25;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.b(this.E, (int)var3, 0, 0, (int)var6, (int)var4, var12, var28, var9, var30);
                        var4 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var1 >= 0.0F) {
                        this.b(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var12, var28, var9, var30);
                        var5 += var25;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   private final void d(int[] var1, int[] var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23) {
      int var24 = var5 - var4;
      float var25 = 1.0F / (float)var24;
      float var26 = (var7 - var6) * var25;
      float var27 = (var9 - var8) * var25;
      float var28 = (var11 - var10) * var25;
      float var29 = (var13 - var12) * var25;
      float var30 = (var15 - var14) * var25;
      float var31 = (var17 - var16) * var25;
      float var32 = (var19 - var18) * var25;
      float var33 = (var21 - var20) * var25;
      float var34 = (var23 - var22) * var25;
      if(this.c) {
         if(var5 > this.K) {
            var5 = this.K;
         }

         if(var4 < 0) {
            var6 -= var26 * (float)var4;
            var8 -= var27 * (float)var4;
            var10 -= var28 * (float)var4;
            var12 -= var29 * (float)var4;
            var14 -= var30 * (float)var4;
            var16 -= var31 * (float)var4;
            var18 -= var32 * (float)var4;
            var20 -= var33 * (float)var4;
            var22 -= var34 * (float)var4;
            var4 = 0;
         }
      }

      if(var4 < var5) {
         var24 = var5 - var4;

         for(var3 += var4; var24-- > 0; var22 += var34) {
            float var35 = 1.0F / var6;
            float var36 = 1.0F / var8;
            if(var35 < this.G[var3]) {
               int var37 = (int)(var10 * var36 * (float)this.H);
               if(this.p) {
                  var37 &= this.a;
               } else if(var37 < 0) {
                  var37 = 0;
               } else if(var37 > this.a) {
                  var37 = this.a;
               }

               int var38 = (int)(var12 * var36 * (float)this.H);
               if(this.p) {
                  var38 &= this.a;
               } else if(var38 < 0) {
                  var38 = 0;
               } else if(var38 > this.a) {
                  var38 = this.a;
               }

               int var39 = this.g[var38 * this.H + var37];
               boolean var40 = true;
               int var44;
               if(this.s == 2) {
                  var44 = var39 >> 24 & 255;
               } else if(this.s == 1) {
                  var44 = var39 == 0?0:255;
               } else {
                  var44 = (int)var16;
               }

               if(var44 != 0) {
                  int var42;
                  int var43;
                  int var41;
                  if(var44 != 255) {
                     var41 = -16777216 | (int)(var18 * (float)(var39 >> 16 & 255)) << 8 & 16711680 | (int)(var20 * (float)(var39 >> 8 & 255)) & '\uff00' | (int)(var22 * (float)(var39 & 255)) >> 8;
                     if(var14 != 0.0F) {
                        var42 = (int)(255.0F - var14);
                        var43 = ((this.d & 16711935) * (int)var14 & -16711936 | (this.d & '\uff00') * (int)var14 & 16711680) >>> 8;
                        var41 = (((var41 & 16711935) * var42 & -16711936 | (var41 & '\uff00') * var42 & 16711680) >>> 8) + var43;
                     }

                     var42 = var1[var3];
                     var43 = 255 - var44;
                     var41 = ((var42 & 16711935) * var43 + (var41 & 16711935) * var44 & -16711936) + ((var42 & '\uff00') * var43 + (var41 & '\uff00') * var44 & 16711680) >> 8;
                     var1[var3] = (var44 | var1[var3] >> 24) << 24 | var41;
                     this.G[var3] = var35;
                  } else {
                     var41 = -16777216 | (int)(var18 * (float)(var39 >> 16 & 255)) << 8 & 16711680 | (int)(var20 * (float)(var39 >> 8 & 255)) & '\uff00' | (int)(var22 * (float)(var39 & 255)) >> 8;
                     if(var14 != 0.0F) {
                        var42 = (int)(255.0F - var14);
                        var43 = ((this.d & 16711935) * (int)var14 & -16711936 | (this.d & '\uff00') * (int)var14 & 16711680) >>> 8;
                        var41 = (((var41 & 16711935) * var42 & -16711936 | (var41 & '\uff00') * var42 & 16711680) >>> 8) + var43;
                     }

                     var1[var3] = var44 << 24 | var41;
                     this.G[var3] = var35;
                  }
               }
            }

            ++var3;
            var6 += var26;
            var8 += var27;
            var10 += var28;
            var12 += var29;
            var14 += var30;
            var16 += var31;
            var18 += var32;
            var20 += var33;
         }

      }
   }

   final void e(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12) {
      if(this.D) {
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(en.c[(int)var10 & '\uffff'], (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var14 = this.F;
         ((ta)(this.F == null?null:var14[6])).a(en.c[(int)var10 & '\uffff'], (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var15 = this.F;
         ((ta)(this.F == null?null:var15[6])).a(en.c[(int)var10 & '\uffff'], (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var16 = var5 - var4;
         float var17 = var2 - var1;
         float var18 = var6 - var4;
         float var19 = var3 - var1;
         float var20 = var11 - var10;
         float var21 = var12 - var10;
         float var22 = var8 - var7;
         float var23 = var9 - var7;
         float var24;
         if(var3 != var2) {
            var24 = (var6 - var5) / (var3 - var2);
         } else {
            var24 = 0.0F;
         }

         float var25;
         if(var2 != var1) {
            var25 = var16 / var17;
         } else {
            var25 = 0.0F;
         }

         float var26;
         if(var3 != var1) {
            var26 = var18 / var19;
         } else {
            var26 = 0.0F;
         }

         float var27 = var16 * var19 - var18 * var17;
         if(var27 != 0.0F) {
            float var28 = (var20 * var19 - var21 * var17) / var27;
            float var29 = (var21 * var16 - var20 * var18) / var27;
            float var30 = (var22 * var19 - var23 * var17) / var27;
            float var31 = (var23 * var16 - var22 * var18) / var27;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var10 = var10 - var28 * var4 + var28;
                  var7 = var7 - var30 * var4 + var30;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var26 * var1;
                        var4 -= var25 * var1;
                        var10 -= var29 * var1;
                        var7 -= var31 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var24 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var26 >= var25) && (var1 != var2 || var26 <= var24)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.d(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var10, var28, var7, var30);
                           var6 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.d(this.E, (int)var1, 0, 0, (int)var5, (int)var6, var10, var28, var7, var30);
                           var6 += var26;
                           var5 += var24;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.d(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var10, var28, var7, var30);
                           var6 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.d(this.E, (int)var1, 0, 0, (int)var6, (int)var5, var10, var28, var7, var30);
                           var6 += var26;
                           var5 += var24;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var26 * var1;
                        var4 -= var25 * var1;
                        var10 -= var29 * var1;
                        var7 -= var31 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var24 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var26 >= var25) && (var1 != var3 || var24 <= var25)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.d(this.E, (int)var1, 0, 0, (int)var4, (int)var5, var10, var28, var7, var30);
                           var5 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var2 >= 0.0F) {
                           this.d(this.E, (int)var1, 0, 0, (int)var4, (int)var6, var10, var28, var7, var30);
                           var6 += var24;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.d(this.E, (int)var1, 0, 0, (int)var5, (int)var4, var10, var28, var7, var30);
                           var5 += var26;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                        }

                        while(--var2 >= 0.0F) {
                           this.d(this.E, (int)var1, 0, 0, (int)var6, (int)var4, var10, var28, var7, var30);
                           var6 += var24;
                           var4 += var25;
                           var10 += var29;
                           var7 += var31;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var11 = var11 - var28 * var5 + var28;
                  var8 = var8 - var30 * var5 + var30;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var25 * var2;
                        var5 -= var24 * var2;
                        var11 -= var29 * var2;
                        var8 -= var31 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var26 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var25 >= var24) && (var2 != var3 || var25 <= var26)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.d(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var11, var28, var8, var30);
                           var4 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var1 >= 0.0F) {
                           this.d(this.E, (int)var2, 0, 0, (int)var6, (int)var4, var11, var28, var8, var30);
                           var4 += var25;
                           var6 += var26;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.d(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var11, var28, var8, var30);
                           var4 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var1 >= 0.0F) {
                           this.d(this.E, (int)var2, 0, 0, (int)var4, (int)var6, var11, var28, var8, var30);
                           var4 += var25;
                           var6 += var26;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var25 * var2;
                        var5 -= var24 * var2;
                        var11 -= var29 * var2;
                        var8 -= var31 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var26 * var1;
                        var1 = 0.0F;
                     }

                     if(var25 < var24) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.d(this.E, (int)var2, 0, 0, (int)var6, (int)var5, var11, var28, var8, var30);
                           var6 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.d(this.E, (int)var2, 0, 0, (int)var4, (int)var5, var11, var28, var8, var30);
                           var4 += var26;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.d(this.E, (int)var2, 0, 0, (int)var5, (int)var6, var11, var28, var8, var30);
                           var6 += var25;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                        }

                        while(--var3 >= 0.0F) {
                           this.d(this.E, (int)var2, 0, 0, (int)var5, (int)var4, var11, var28, var8, var30);
                           var4 += var26;
                           var5 += var24;
                           var11 += var29;
                           var8 += var31;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var12 = var12 - var28 * var6 + var28;
               var9 = var9 - var30 * var6 + var30;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var24 * var3;
                     var6 -= var26 * var3;
                     var12 -= var29 * var3;
                     var9 -= var31 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var25 * var1;
                     var1 = 0.0F;
                  }

                  if(var24 < var26) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.d(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var12, var28, var9, var30);
                        var5 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var2 >= 0.0F) {
                        this.d(this.E, (int)var3, 0, 0, (int)var5, (int)var4, var12, var28, var9, var30);
                        var5 += var24;
                        var4 += var25;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.d(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var12, var28, var9, var30);
                        var5 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var2 >= 0.0F) {
                        this.d(this.E, (int)var3, 0, 0, (int)var4, (int)var5, var12, var28, var9, var30);
                        var5 += var24;
                        var4 += var25;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var24 * var3;
                     var6 -= var26 * var3;
                     var12 -= var29 * var3;
                     var9 -= var31 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var25 * var2;
                     var2 = 0.0F;
                  }

                  if(var24 < var26) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.d(this.E, (int)var3, 0, 0, (int)var4, (int)var6, var12, var28, var9, var30);
                        var4 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var1 >= 0.0F) {
                        this.d(this.E, (int)var3, 0, 0, (int)var5, (int)var6, var12, var28, var9, var30);
                        var5 += var25;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.d(this.E, (int)var3, 0, 0, (int)var6, (int)var4, var12, var28, var9, var30);
                        var4 += var24;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                     }

                     while(--var1 >= 0.0F) {
                        this.d(this.E, (int)var3, 0, 0, (int)var6, (int)var5, var12, var28, var9, var30);
                        var5 += var25;
                        var6 += var26;
                        var12 += var29;
                        var9 += var31;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   private final void e(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if(this.c) {
         if(var6 > this.K) {
            var6 = this.K;
         }

         if(var5 < 0) {
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var4 = var6 - var5 >> 2;
         if(((boolean[])((boolean[])this.j[2]))[1]) {
            if(this.J == 0) {
               do {
                  --var4;
               } while(var4 >= 0);

               var4 = var6 - var5 & 3;

               do {
                  --var4;
               } while(var4 >= 0);

            } else if(this.J == 254) {
               if(var5 != 0 && var6 <= this.K - 1) {
                  do {
                     --var4;
                  } while(var4 >= 0);

                  var4 = var6 - var5 & 3;

                  do {
                     --var4;
                  } while(var4 >= 0);

               }
            } else {
               do {
                  --var4;
               } while(var4 >= 0);

               var4 = var6 - var5 & 3;

               do {
                  --var4;
               } while(var4 >= 0);

            }
         }
      }
   }

   private final void a(int[] var1, int[] var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25, float var26, float var27) {
      int var28 = var5 - var4;
      float var29 = 1.0F / (float)var28;
      float var30 = (var7 - var6) * var29;
      float var31 = (var9 - var8) * var29;
      float var32 = (var11 - var10) * var29;
      float var33 = (var13 - var12) * var29;
      float var34 = (var15 - var14) * var29;
      float var35 = (var19 - var18) * var29;
      float var36 = (var21 - var20) * var29;
      float var37 = (var23 - var22) * var29;
      float var38 = (var25 - var24) * var29;
      float var39 = (var27 - var26) * var29;
      if(this.c) {
         if(var5 > this.K) {
            var5 = this.K;
         }

         if(var4 < 0) {
            var6 -= var30 * (float)var4;
            var8 -= var31 * (float)var4;
            var10 -= var32 * (float)var4;
            var12 -= var33 * (float)var4;
            var14 -= var34 * (float)var4;
            var18 -= var35 * (float)var4;
            var20 -= var36 * (float)var4;
            var22 -= var37 * (float)var4;
            var24 -= var38 * (float)var4;
            var26 -= var39 * (float)var4;
            var4 = 0;
         }
      }

      if(var4 < var5) {
         var28 = var5 - var4;

         for(var3 += var4; var28-- > 0; var26 += var39) {
            float var40 = 1.0F / var6;
            float var41 = 1.0F / var8;
            if(var40 < this.G[var3]) {
               float var42 = var10 * var41;
               float var43 = var12 * var41;
               int var44 = (int)(var42 * (float)this.H * this.m) & this.a;
               int var45 = (int)(var43 * (float)this.H * this.m) & this.a;
               int var46 = this.g[var45 * this.H + var44];
               var44 = (int)(var42 * (float)this.q * this.B) & this.M;
               var45 = (int)(var43 * (float)this.q * this.B) & this.M;
               int var47 = this.f_i[var45 * this.q + var44];
               var44 = (int)(var42 * (float)this.u * this.b) & this.v;
               var45 = (int)(var43 * (float)this.u * this.b) & this.v;
               int var48 = this.I[var45 * this.u + var44];
               float var49 = 1.0F - (var24 + var26);
               var46 = -16777216 | (int)(var24 * (float)(var46 >> 16 & 255)) << 16 | (int)(var24 * (float)(var46 >> 8 & 255)) << 8 | (int)(var24 * (float)(var46 & 255));
               var47 = -16777216 | (int)(var26 * (float)(var47 >> 16 & 255)) << 16 | (int)(var26 * (float)(var47 >> 8 & 255)) << 8 | (int)(var26 * (float)(var47 & 255));
               var48 = -16777216 | (int)(var49 * (float)(var48 >> 16 & 255)) << 16 | (int)(var49 * (float)(var48 >> 8 & 255)) << 8 | (int)(var49 * (float)(var48 & 255));
               int var50 = var46 + var47 + var48;
               int var51 = -16777216 | (int)(var18 * (float)(var50 >> 16 & 255)) << 8 & 16711680 | (int)(var20 * (float)(var50 >> 8 & 255)) & '\uff00' | (int)(var22 * (float)(var50 & 255)) >> 8;
               if(var14 != 0.0F) {
                  int var52 = (int)(255.0F - var14);
                  int var53 = ((this.d & 16711935) * (int)var14 & -16711936 | (this.d & '\uff00') * (int)var14 & 16711680) >>> 8;
                  var51 = (((var51 & 16711935) * var52 & -16711936 | (var51 & '\uff00') * var52 & 16711680) >>> 8) + var53;
               }

               var1[var3] = var51;
               this.G[var3] = var40;
            }

            ++var3;
            var6 += var30;
            var8 += var31;
            var10 += var32;
            var12 += var33;
            var14 += var34;
            var18 += var35;
            var20 += var36;
            var22 += var37;
            var24 += var38;
         }

      }
   }

   final void c(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      if(this.D) {
         Object[] var11 = this.F;
         ((ta)(this.F == null?null:var11[6])).a(var10, (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var12 = this.F;
         ((ta)(this.F == null?null:var12[6])).a(var10, (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(var10, (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var14 = var5 - var4;
         float var15 = var2 - var1;
         float var16 = var6 - var4;
         float var17 = var3 - var1;
         float var18 = var8 - var7;
         float var19 = var9 - var7;
         float var20 = 0.0F;
         if(var2 != var1) {
            var20 = (var5 - var4) / (var2 - var1);
         }

         float var21 = 0.0F;
         if(var3 != var2) {
            var21 = (var6 - var5) / (var3 - var2);
         }

         float var22 = 0.0F;
         if(var3 != var1) {
            var22 = (var4 - var6) / (var1 - var3);
         }

         float var23 = var14 * var17 - var16 * var15;
         if(var23 != 0.0F) {
            float var24 = (var18 * var17 - var19 * var15) / var23;
            float var25 = (var19 * var14 - var18 * var16) / var23;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var7 = var7 - var24 * var4 + var24;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var21 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var22 >= var20) && (var1 != var2 || var22 <= var21)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.d(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.d(this.E, (int)var1, var10, 0, (int)var5, (int)var6, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.d(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.d(this.E, (int)var1, var10, 0, (int)var6, (int)var5, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var21 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var22 >= var20) && (var1 != var3 || var21 <= var20)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.d(this.E, (int)var1, var10, 0, (int)var4, (int)var5, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.d(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.d(this.E, (int)var1, var10, 0, (int)var5, (int)var4, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.d(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var8 = var8 - var24 * var5 + var24;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var22 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var20 >= var21) && (var2 != var3 || var20 <= var22)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.d(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.d(this.E, (int)var2, var10, 0, (int)var6, (int)var4, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.d(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.d(this.E, (int)var2, var10, 0, (int)var4, (int)var6, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var22 * var1;
                        var1 = 0.0F;
                     }

                     if(var20 < var21) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.d(this.E, (int)var2, var10, 0, (int)var6, (int)var5, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.d(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.d(this.E, (int)var2, var10, 0, (int)var5, (int)var6, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.d(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var9 = var9 - var24 * var6 + var24;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var20 * var1;
                     var1 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.d(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.d(this.E, (int)var3, var10, 0, (int)var5, (int)var4, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.d(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.d(this.E, (int)var3, var10, 0, (int)var4, (int)var5, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var20 * var2;
                     var2 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.d(this.E, (int)var3, var10, 0, (int)var4, (int)var6, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.d(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.d(this.E, (int)var3, var10, 0, (int)var6, (int)var4, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.d(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   private final void a(int[] var1, int[] var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23) {
      int var24 = var5 - var4;
      float var25 = 1.0F / (float)var24;
      float var26 = (var9 - var8) * var25;
      float var27 = (var11 - var10) * var25;
      float var28 = (var13 - var12) * var25;
      float var29 = (var15 - var14) * var25;
      float var30 = (var17 - var16) * var25;
      float var31 = (var19 - var18) * var25;
      float var32 = (var21 - var20) * var25;
      float var33 = (var23 - var22) * var25;
      if(this.c) {
         if(var5 > this.K) {
            var5 = this.K;
         }

         if(var4 < 0) {
            var8 -= var26 * (float)var4;
            var10 -= var27 * (float)var4;
            var12 -= var28 * (float)var4;
            var14 -= var29 * (float)var4;
            var16 -= var30 * (float)var4;
            var18 -= var31 * (float)var4;
            var20 -= var32 * (float)var4;
            var22 -= var33 * (float)var4;
            var4 = 0;
         }
      }

      if(var4 < var5) {
         var24 = var5 - var4;

         for(var3 += var4; var24-- > 0; var22 += var33) {
            float var34 = 1.0F / var8;
            int var35 = (int)(var10 * var34 * (float)this.H);
            if(this.p) {
               var35 &= this.a;
            } else if(var35 < 0) {
               var35 = 0;
            } else if(var35 > this.a) {
               var35 = this.a;
            }

            int var36 = (int)(var12 * var34 * (float)this.H);
            if(this.p) {
               var36 &= this.a;
            } else if(var36 < 0) {
               var36 = 0;
            } else if(var36 > this.a) {
               var36 = this.a;
            }

            int var37 = this.g[var36 * this.H + var35];
            boolean var38 = true;
            int var42;
            if(this.s == 2) {
               var42 = var37 >> 24 & 255;
            } else if(this.s == 1) {
               var42 = var37 == 0?0:255;
            } else {
               var42 = (int)var16;
            }

            if(var42 != 0) {
               int var39;
               int var40;
               int var41;
               if(var42 != 255) {
                  var39 = -16777216 | (int)(var18 * (float)(var37 >> 16 & 255)) << 8 & 16711680 | (int)(var20 * (float)(var37 >> 8 & 255)) & '\uff00' | (int)(var22 * (float)(var37 & 255)) >> 8;
                  if(var14 != 0.0F) {
                     var40 = (int)(255.0F - var14);
                     var41 = ((this.d & 16711935) * (int)var14 & -16711936 | (this.d & '\uff00') * (int)var14 & 16711680) >>> 8;
                     var39 = (((var39 & 16711935) * var40 & -16711936 | (var39 & '\uff00') * var40 & 16711680) >>> 8) + var41;
                  }

                  var40 = var1[var3];
                  var41 = 255 - var42;
                  var39 = ((var40 & 16711935) * var41 + (var39 & 16711935) * var42 & -16711936) + ((var40 & '\uff00') * var41 + (var39 & '\uff00') * var42 & 16711680) >> 8;
                  var1[var3] = (var42 | var1[var3] >> 24) << 24 | var39;
               } else {
                  var39 = -16777216 | (int)(var18 * (float)(var37 >> 16 & 255)) << 8 & 16711680 | (int)(var20 * (float)(var37 >> 8 & 255)) & '\uff00' | (int)(var22 * (float)(var37 & 255)) >> 8;
                  if(var14 != 0.0F) {
                     var40 = (int)(255.0F - var14);
                     var41 = ((this.d & 16711935) * (int)var14 & -16711936 | (this.d & '\uff00') * (int)var14 & 16711680) >>> 8;
                     var39 = (((var39 & 16711935) * var40 & -16711936 | (var39 & '\uff00') * var40 & 16711680) >>> 8) + var41;
                  }

                  var1[var3] = var42 << 24 | var39;
               }
            }

            ++var3;
            var8 += var26;
            var10 += var27;
            var12 += var28;
            var14 += var29;
            var16 += var30;
            var18 += var31;
            var20 += var32;
         }

      }
   }

   private final void b(int[] var1, int[] var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23) {
      int var24 = var5 - var4;
      float var25 = 1.0F / (float)var24;
      float var26 = (var7 - var6) * var25;
      float var27 = (var9 - var8) * var25;
      float var28 = (var11 - var10) * var25;
      float var29 = (var13 - var12) * var25;
      float var30 = (var15 - var14) * var25;
      float var31 = (var17 - var16) * var25;
      float var32 = (var19 - var18) * var25;
      float var33 = (var21 - var20) * var25;
      float var34 = (var23 - var22) * var25;
      if(this.c) {
         if(var5 > this.K) {
            var5 = this.K;
         }

         if(var4 < 0) {
            var6 -= var26 * (float)var4;
            var8 -= var27 * (float)var4;
            var10 -= var28 * (float)var4;
            var12 -= var29 * (float)var4;
            var14 -= var30 * (float)var4;
            var16 -= var31 * (float)var4;
            var18 -= var32 * (float)var4;
            var20 -= var33 * (float)var4;
            var22 -= var34 * (float)var4;
            var4 = 0;
         }
      }

      if(var4 < var5) {
         var24 = var5 - var4;

         for(var3 += var4; var24-- > 0; var22 += var34) {
            float var35 = 1.0F / var6;
            float var36 = 1.0F / var8;
            if(var35 < this.G[var3]) {
               int var37 = (int)(var10 * var36 * (float)this.H);
               if(this.p) {
                  var37 &= this.a;
               } else if(var37 < 0) {
                  var37 = 0;
               } else if(var37 > this.a) {
                  var37 = this.a;
               }

               int var38 = (int)(var12 * var36 * (float)this.H);
               if(this.p) {
                  var38 &= this.a;
               } else if(var38 < 0) {
                  var38 = 0;
               } else if(var38 > this.a) {
                  var38 = this.a;
               }

               int var39 = this.g[var38 * this.H + var37];
               boolean var40 = true;
               int var44;
               if(this.s == 2) {
                  var44 = var39 >> 24 & 255;
               } else if(this.s == 1) {
                  var44 = var39 == 0?0:255;
               } else {
                  var44 = (int)var16;
               }

               if(var44 != 0) {
                  int var42;
                  int var43;
                  int var41;
                  if(var44 != 255) {
                     var41 = -16777216 | (int)(var18 * (float)(var39 >> 16 & 255)) << 8 & 16711680 | (int)(var20 * (float)(var39 >> 8 & 255)) & '\uff00' | (int)(var22 * (float)(var39 & 255)) >> 8;
                     if(var14 != 0.0F) {
                        var42 = (int)(255.0F - var14);
                        var43 = ((this.d & 16711935) * (int)var14 & -16711936 | (this.d & '\uff00') * (int)var14 & 16711680) >>> 8;
                        var41 = (((var41 & 16711935) * var42 & -16711936 | (var41 & '\uff00') * var42 & 16711680) >>> 8) + var43;
                     }

                     var42 = var1[var3];
                     var43 = 255 - var44;
                     var41 = ((var42 & 16711935) * var43 + (var41 & 16711935) * var44 & -16711936) + ((var42 & '\uff00') * var43 + (var41 & '\uff00') * var44 & 16711680) >> 8;
                     var1[var3] = var41;
                     this.G[var3] = var35;
                  } else {
                     var41 = -16777216 | (int)(var18 * (float)(var39 >> 16 & 255)) << 8 & 16711680 | (int)(var20 * (float)(var39 >> 8 & 255)) & '\uff00' | (int)(var22 * (float)(var39 & 255)) >> 8;
                     if(var14 != 0.0F) {
                        var42 = (int)(255.0F - var14);
                        var43 = ((this.d & 16711935) * (int)var14 & -16711936 | (this.d & '\uff00') * (int)var14 & 16711680) >>> 8;
                        var41 = (((var41 & 16711935) * var42 & -16711936 | (var41 & '\uff00') * var42 & 16711680) >>> 8) + var43;
                     }

                     var1[var3] = var41;
                     this.G[var3] = var35;
                  }
               }
            }

            ++var3;
            var6 += var26;
            var8 += var27;
            var10 += var28;
            var12 += var29;
            var14 += var30;
            var16 += var31;
            var18 += var32;
            var20 += var33;
         }

      }
   }

   final int a() {
      return this.y[0] / this.e;
   }

   final void d(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      if(this.D) {
         Object[] var11 = this.F;
         ((ta)(this.F == null?null:var11[6])).a(var10, (int)var5, (int)var2, (int)var1, (byte)-71, (int)var4);
         Object[] var12 = this.F;
         ((ta)(this.F == null?null:var12[6])).a(var10, (int)var6, (int)var3, (int)var2, (byte)-71, (int)var5);
         Object[] var13 = this.F;
         ((ta)(this.F == null?null:var13[6])).a(var10, (int)var4, (int)var1, (int)var3, (byte)-71, (int)var6);
      } else {
         float var14 = var5 - var4;
         float var15 = var2 - var1;
         float var16 = var6 - var4;
         float var17 = var3 - var1;
         float var18 = var8 - var7;
         float var19 = var9 - var7;
         float var20 = 0.0F;
         if(var2 != var1) {
            var20 = (var5 - var4) / (var2 - var1);
         }

         float var21 = 0.0F;
         if(var3 != var2) {
            var21 = (var6 - var5) / (var3 - var2);
         }

         float var22 = 0.0F;
         if(var3 != var1) {
            var22 = (var4 - var6) / (var1 - var3);
         }

         float var23 = var14 * var17 - var16 * var15;
         if(var23 != 0.0F) {
            float var24 = (var18 * var17 - var19 * var15) / var23;
            float var25 = (var19 * var14 - var18 * var16) / var23;
            if(var1 <= var2 && var1 <= var3) {
               if(var1 < (float)this.n) {
                  if(var2 > (float)this.n) {
                     var2 = (float)this.n;
                  }

                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  var7 = var7 - var24 * var4 + var24;
                  if(var2 < var3) {
                     var6 = var4;
                     if(var1 < 0.0F) {
                        var6 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var2 < 0.0F) {
                        var5 -= var21 * var2;
                        var2 = 0.0F;
                     }

                     if((var1 == var2 || var22 >= var20) && (var1 != var2 || var22 <= var21)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.f(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.f(this.E, (int)var1, var10, 0, (int)var5, (int)var6, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var2;
                        var2 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var2 >= 0.0F; var1 += (float)this.e) {
                           this.f(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.f(this.E, (int)var1, var10, 0, (int)var6, (int)var5, var7, var24);
                           var6 += var22;
                           var5 += var21;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  } else {
                     var5 = var4;
                     if(var1 < 0.0F) {
                        var5 = var4 - var22 * var1;
                        var4 -= var20 * var1;
                        var7 -= var25 * var1;
                        var1 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var21 * var3;
                        var3 = 0.0F;
                     }

                     if((var1 == var3 || var22 >= var20) && (var1 != var3 || var21 <= var20)) {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.f(this.E, (int)var1, var10, 0, (int)var4, (int)var5, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.f(this.E, (int)var1, var10, 0, (int)var4, (int)var6, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     } else {
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var2 = (float)((int)(var2 + 0.5F)) - var3;
                        var3 -= var1;

                        for(var1 = (float)this.y[(int)var1]; --var3 >= 0.0F; var1 += (float)this.e) {
                           this.f(this.E, (int)var1, var10, 0, (int)var5, (int)var4, var7, var24);
                           var5 += var22;
                           var4 += var20;
                           var7 += var25;
                        }

                        while(--var2 >= 0.0F) {
                           this.f(this.E, (int)var1, var10, 0, (int)var6, (int)var4, var7, var24);
                           var6 += var21;
                           var4 += var20;
                           var7 += var25;
                           var1 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var2 <= var3) {
               if(var2 < (float)this.n) {
                  if(var3 > (float)this.n) {
                     var3 = (float)this.n;
                  }

                  if(var1 > (float)this.n) {
                     var1 = (float)this.n;
                  }

                  var8 = var8 - var24 * var5 + var24;
                  if(var3 < var1) {
                     var4 = var5;
                     if(var2 < 0.0F) {
                        var4 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var3 < 0.0F) {
                        var6 -= var22 * var3;
                        var3 = 0.0F;
                     }

                     if((var2 == var3 || var20 >= var21) && (var2 != var3 || var20 <= var22)) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.f(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.f(this.E, (int)var2, var10, 0, (int)var6, (int)var4, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F)) - var3;
                        var3 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var3 >= 0.0F; var2 += (float)this.e) {
                           this.f(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var1 >= 0.0F) {
                           this.f(this.E, (int)var2, var10, 0, (int)var4, (int)var6, var8, var24);
                           var4 += var20;
                           var6 += var22;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  } else {
                     var6 = var5;
                     if(var2 < 0.0F) {
                        var6 = var5 - var20 * var2;
                        var5 -= var21 * var2;
                        var8 -= var25 * var2;
                        var2 = 0.0F;
                     }

                     if(var1 < 0.0F) {
                        var4 -= var22 * var1;
                        var1 = 0.0F;
                     }

                     if(var20 < var21) {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.f(this.E, (int)var2, var10, 0, (int)var6, (int)var5, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.f(this.E, (int)var2, var10, 0, (int)var4, (int)var5, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     } else {
                        var2 = (float)((int)(var2 + 0.5F));
                        var1 = (float)((int)(var1 + 0.5F));
                        var3 = (float)((int)(var3 + 0.5F)) - var1;
                        var1 -= var2;

                        for(var2 = (float)this.y[(int)var2]; --var1 >= 0.0F; var2 += (float)this.e) {
                           this.f(this.E, (int)var2, var10, 0, (int)var5, (int)var6, var8, var24);
                           var6 += var20;
                           var5 += var21;
                           var8 += var25;
                        }

                        while(--var3 >= 0.0F) {
                           this.f(this.E, (int)var2, var10, 0, (int)var5, (int)var4, var8, var24);
                           var4 += var22;
                           var5 += var21;
                           var8 += var25;
                           var2 += (float)this.e;
                        }

                     }
                  }
               }
            } else if(var3 < (float)this.n) {
               if(var1 > (float)this.n) {
                  var1 = (float)this.n;
               }

               if(var2 > (float)this.n) {
                  var2 = (float)this.n;
               }

               var9 = var9 - var24 * var6 + var24;
               if(var1 < var2) {
                  var5 = var6;
                  if(var3 < 0.0F) {
                     var5 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var1 < 0.0F) {
                     var4 -= var20 * var1;
                     var1 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.f(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.f(this.E, (int)var3, var10, 0, (int)var5, (int)var4, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F)) - var1;
                     var1 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var1 >= 0.0F; var3 += (float)this.e) {
                        this.f(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var2 >= 0.0F) {
                        this.f(this.E, (int)var3, var10, 0, (int)var4, (int)var5, var9, var24);
                        var5 += var21;
                        var4 += var20;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               } else {
                  var4 = var6;
                  if(var3 < 0.0F) {
                     var4 = var6 - var21 * var3;
                     var6 -= var22 * var3;
                     var9 -= var25 * var3;
                     var3 = 0.0F;
                  }

                  if(var2 < 0.0F) {
                     var5 -= var20 * var2;
                     var2 = 0.0F;
                  }

                  if(var21 < var22) {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.f(this.E, (int)var3, var10, 0, (int)var4, (int)var6, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.f(this.E, (int)var3, var10, 0, (int)var5, (int)var6, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  } else {
                     var3 = (float)((int)(var3 + 0.5F));
                     var2 = (float)((int)(var2 + 0.5F));
                     var1 = (float)((int)(var1 + 0.5F)) - var2;
                     var2 -= var3;

                     for(var3 = (float)this.y[(int)var3]; --var2 >= 0.0F; var3 += (float)this.e) {
                        this.f(this.E, (int)var3, var10, 0, (int)var6, (int)var4, var9, var24);
                        var4 += var21;
                        var6 += var22;
                        var9 += var25;
                     }

                     while(--var1 >= 0.0F) {
                        this.f(this.E, (int)var3, var10, 0, (int)var6, (int)var5, var9, var24);
                        var5 += var20;
                        var6 += var22;
                        var9 += var25;
                        var3 += (float)this.e;
                     }

                  }
               }
            }
         }
      }
   }

   uo(Object[] var1, Object[] var2) {
      this.F = var1;
      this.j = var2;
      this.e = ((int[])((int[])this.F[1]))[4];
      this.E = (int[])((int[])this.F[7]);
      this.G = (float[])((float[])this.F[12]);
   }
}
