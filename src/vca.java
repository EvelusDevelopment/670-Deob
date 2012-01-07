
final class vca extends aa {

   private float z;
   private float D;
   private float x;
   private float M;
   private byte[][] t;
   private Object[] E;
   private co[][] o;
   private float p;
   private float F;
   private float y;
   private float q;
   private float I;
   private int H;
   private byte[][] L;
   private nw[][] u;
   private float r;
   private float A;
   private float s;
   private tc[][] G;
   private cm[][] K;
   private float N;
   private float v;
   private float J;
   private dc[][] w;
   private float C;


   final void l() {
      this.t = (byte[][])null;
      this.L = (byte[][])null;
   }

   private final void a(int var1, int var2, uo var3, float[] var4, float[] var5, float[] var6, float[] var7, float[] var8, int var9) {
      cm var10 = this.K[var1][var2];
      int var12;
      int var14;
      float var15;
      float var17;
      float var16;
      float var18;
      float var23;
      float var25;
      float var24;
      float var27;
      float var26;
      float var28;
      if(var10 != null) {
         if((var10.e & 2) == 0) {
            if(var9 != 0) {
               if((var10.e & 4) != 0) {
                  if((var9 & 1) != 0) {
                     return;
                  }
               } else if((var9 & 2) != 0) {
                  return;
               }
            }

            int var48 = var1 * this.g;
            var12 = var48 + this.g;
            int var49 = var2 * this.g;
            var14 = var49 + this.g;
            float var31;
            float var34;
            float var35;
            float var32;
            float var33;
            float var38;
            float var39;
            float var36;
            float var37;
            float var42;
            int var43;
            float var40;
            float var41;
            float var51;
            float var50;
            float var54;
            float var53;
            float var52;
            float var56;
            if((var10.e & 1) != 0) {
               var43 = this.f[var1][var2];
               float var44 = this.M * (float)var43;
               float var45 = this.D * (float)var43;
               var35 = this.N + this.p * (float)var48 + var44 + this.F * (float)var49;
               var39 = this.x + this.v * (float)var48 + var45 + this.q * (float)var49;
               if(var35 < -var39) {
                  return;
               }

               var36 = this.N + this.p * (float)var12 + var44 + this.F * (float)var49;
               var40 = this.x + this.v * (float)var12 + var45 + this.q * (float)var49;
               if(var36 < -var40) {
                  return;
               }

               var37 = this.N + this.p * (float)var12 + var44 + this.F * (float)var14;
               var41 = this.x + this.v * (float)var12 + var45 + this.q * (float)var14;
               if(var37 < -var41) {
                  return;
               }

               var38 = this.N + this.p * (float)var48 + var44 + this.F * (float)var14;
               var42 = this.x + this.v * (float)var48 + var45 + this.q * (float)var14;
               if(var38 < -var42) {
                  return;
               }

               float var46 = this.z * (float)var43;
               float var47 = this.y * (float)var43;
               var27 = this.I + this.s * (float)var48 + var46 + this.r * (float)var49;
               var15 = var3.t + var3.r * var27 / var39;
               var31 = this.C + this.J * (float)var48 + var47 + this.A * (float)var49;
               var52 = var3.L + var3.w * var31 / var39;
               var23 = var3.z + var3.k * var35 / var39;
               var28 = this.I + this.s * (float)var12 + var46 + this.r * (float)var49;
               var16 = var3.t + var3.r * var28 / var40;
               var32 = this.C + this.J * (float)var12 + var47 + this.A * (float)var49;
               var50 = var3.L + var3.w * var32 / var40;
               var24 = var3.z + var3.k * var36 / var40;
               var56 = this.I + this.s * (float)var12 + var46 + this.r * (float)var14;
               var17 = var3.t + var3.r * var56 / var41;
               var33 = this.C + this.J * (float)var12 + var47 + this.A * (float)var14;
               var53 = var3.L + var3.w * var33 / var41;
               var25 = var3.z + var3.k * var37 / var41;
               var54 = this.I + this.s * (float)var48 + var46 + this.r * (float)var14;
               var18 = var3.t + var3.r * var54 / var42;
               var34 = this.C + this.J * (float)var48 + var47 + this.A * (float)var14;
               var51 = var3.L + var3.w * var34 / var42;
               var26 = var3.z + var3.k * var38 / var42;
            } else {
               var43 = this.f[var1][var2];
               int var59 = this.f[var1 + 1][var2];
               int var57 = this.f[var1 + 1][var2 + 1];
               int var58 = this.f[var1][var2 + 1];
               var35 = this.N + this.p * (float)var48 + this.M * (float)var43 + this.F * (float)var49;
               var39 = this.x + this.v * (float)var48 + this.D * (float)var43 + this.q * (float)var49;
               if(var35 < -var39) {
                  return;
               }

               var36 = this.N + this.p * (float)var12 + this.M * (float)var59 + this.F * (float)var49;
               var40 = this.x + this.v * (float)var12 + this.D * (float)var59 + this.q * (float)var49;
               if(var36 < -var40) {
                  return;
               }

               var37 = this.N + this.p * (float)var12 + this.M * (float)var57 + this.F * (float)var14;
               var41 = this.x + this.v * (float)var12 + this.D * (float)var57 + this.q * (float)var14;
               if(var37 < -var41) {
                  return;
               }

               var38 = this.N + this.p * (float)var48 + this.M * (float)var58 + this.F * (float)var14;
               var42 = this.x + this.v * (float)var48 + this.D * (float)var58 + this.q * (float)var14;
               if(var38 < -var42) {
                  return;
               }

               var27 = this.I + this.s * (float)var48 + this.z * (float)var43 + this.r * (float)var49;
               var15 = var3.t + var3.r * var27 / var39;
               var31 = this.C + this.J * (float)var48 + this.y * (float)var43 + this.A * (float)var49;
               var52 = var3.L + var3.w * var31 / var39;
               var23 = var3.z + var3.k * var35 / var39;
               var28 = this.I + this.s * (float)var12 + this.z * (float)var59 + this.r * (float)var49;
               var16 = var3.t + var3.r * var28 / var40;
               var32 = this.C + this.J * (float)var12 + this.y * (float)var59 + this.A * (float)var49;
               var50 = var3.L + var3.w * var32 / var40;
               var24 = var3.z + var3.k * var36 / var40;
               var56 = this.I + this.s * (float)var12 + this.z * (float)var57 + this.r * (float)var14;
               var17 = var3.t + var3.r * var56 / var41;
               var33 = this.C + this.J * (float)var12 + this.y * (float)var57 + this.A * (float)var14;
               var53 = var3.L + var3.w * var33 / var41;
               var25 = var3.z + var3.k * var37 / var41;
               var54 = this.I + this.s * (float)var48 + this.z * (float)var58 + this.r * (float)var14;
               var18 = var3.t + var3.r * var54 / var42;
               var34 = this.C + this.J * (float)var48 + this.y * (float)var58 + this.A * (float)var14;
               var51 = var3.L + var3.w * var34 / var42;
               var26 = var3.z + var3.k * var38 / var42;
            }

            if((var17 - var18) * (var50 - var51) - (var53 - var51) * (var16 - var18) > 0.0F) {
               var3.c = var17 < 0.0F || var18 < 0.0F || var16 < 0.0F || var17 > (float)var3.K || var18 > (float)var3.K || var16 > (float)var3.K;
               if(var10.a >= 0) {
                  var3.g(var53, var51, var50, var17, var18, var16, var25, var26, var24, var41, var42, var40, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | en.c[var10.f & '\uffff'] & 16777215, -16777216 | en.c[var10.g & '\uffff'] & 16777215, -16777216 | en.c[var10.c & '\uffff'] & 16777215, 0, 0.0F, 0.0F, 0.0F, var10.a);
               } else {
                  var3.g(var53, var51, var50, var17, var18, var16, var25, var26, var24, (float)(var10.f & '\uffff'), (float)(var10.g & '\uffff'), (float)(var10.c & '\uffff'));
               }
            }

            if((var15 - var16) * (var51 - var50) - (var52 - var50) * (var18 - var16) > 0.0F) {
               var3.c = var15 < 0.0F || var16 < 0.0F || var18 < 0.0F || var15 > (float)var3.K || var16 > (float)var3.K || var18 > (float)var3.K;
               if(var10.a >= 0) {
                  var3.g(var52, var50, var51, var15, var16, var18, var23, var24, var26, var39, var40, var42, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | en.c[var10.b & '\uffff'] & 16777215, -16777216 | en.c[var10.c & '\uffff'] & 16777215, -16777216 | en.c[var10.g & '\uffff'] & 16777215, 0, 0.0F, 0.0F, 0.0F, var10.a);
               } else {
                  var3.g(var52, var50, var51, var15, var16, var18, var23, var24, var26, (float)(var10.b & '\uffff'), (float)(var10.c & '\uffff'), (float)(var10.g & '\uffff'));
               }
            }

         }
      } else {
         co var11 = this.o[var1][var2];
         if(var11 != null) {
            if(var9 != 0) {
               if((var11.m & 4) != 0) {
                  if((var9 & 1) != 0) {
                     return;
                  }
               } else if((var9 & 2) != 0) {
                  return;
               }
            }

            int var19;
            for(var19 = 0; var19 < var11.f_l; ++var19) {
               var12 = var11.k[var19] + (var1 << this.a);
               short var13 = var11.d[var19];
               var14 = var11.a[var19] + (var2 << this.a);
               var17 = this.N + this.p * (float)var12 + this.M * (float)var13 + this.F * (float)var14;
               var18 = this.x + this.v * (float)var12 + this.D * (float)var13 + this.q * (float)var14;
               if(var17 < -var18) {
                  return;
               }

               var15 = this.I + this.s * (float)var12 + this.z * (float)var13 + this.r * (float)var14;
               var16 = this.C + this.J * (float)var12 + this.y * (float)var13 + this.A * (float)var14;
               var4[var19] = var3.t + var3.r * var15 / var18;
               var5[var19] = var3.L + var3.w * var16 / var18;
               var6[var19] = var3.z + var3.k * var17 / var18;
               var7[var19] = var18;
            }

            short var21;
            short var20;
            short var22;
            if(var11.f != null) {
               for(var19 = 0; var19 < var11.g; ++var19) {
                  var20 = var11.f_i[var19];
                  var21 = var11.j[var19];
                  var22 = var11.e[var19];
                  var23 = var4[var20];
                  var24 = var4[var21];
                  var25 = var4[var22];
                  var26 = var5[var20];
                  var27 = var5[var21];
                  var28 = var5[var22];
                  if((var23 - var24) * (var28 - var27) - (var26 - var27) * (var25 - var24) > 0.0F) {
                     var3.c = var23 < 0.0F || var24 < 0.0F || var25 < 0.0F || var23 > (float)var3.K || var24 > (float)var3.K || var25 > (float)var3.K;
                     short var29 = var11.f[var19];
                     if(var29 != -1) {
                        var3.g(var26, var27, var28, var23, var24, var25, var6[var20], var6[var21], var6[var22], var7[var20], var7[var21], var7[var22], (float)var11.k[var20] / (float)this.g, (float)var11.k[var21] / (float)this.g, (float)var11.k[var22] / (float)this.g, (float)var11.a[var20] / (float)this.g, (float)var11.a[var21] / (float)this.g, (float)var11.a[var22] / (float)this.g, -16777216 | en.c[var11.c[var20] & '\uffff'] & 16777215, -16777216 | en.c[var11.c[var21] & '\uffff'] & 16777215, -16777216 | en.c[var11.c[var22] & '\uffff'] & 16777215, 0, 0.0F, 0.0F, 0.0F, var29);
                     } else {
                        int var30 = var11.h[var19];
                        if(var30 != -1) {
                           var3.g(var26, var27, var28, var23, var24, var25, var6[var20], var6[var21], var6[var22], (float)bm.a(2, var11.c[var20], var30), (float)bm.a(2, var11.c[var21], var30), (float)bm.a(2, var11.c[var22], var30));
                        }
                     }
                  }
               }
            } else {
               for(var19 = 0; var19 < var11.g; ++var19) {
                  var20 = var11.f_i[var19];
                  var21 = var11.j[var19];
                  var22 = var11.e[var19];
                  var23 = var4[var20];
                  var24 = var4[var21];
                  var25 = var4[var22];
                  var26 = var5[var20];
                  var27 = var5[var21];
                  var28 = var5[var22];
                  if((var23 - var24) * (var28 - var27) - (var26 - var27) * (var25 - var24) > 0.0F) {
                     int var55 = var11.h[var19];
                     if(var55 != -1) {
                        var3.c = var23 < 0.0F || var24 < 0.0F || var25 < 0.0F || var23 > (float)var3.K || var24 > (float)var3.K || var25 > (float)var3.K;
                        var3.g(var26, var27, var28, var23, var24, var25, var6[var20], var6[var21], var6[var22], (float)bm.a(2, var11.c[var20], var55), (float)bm.a(2, var11.c[var21], var55), (float)bm.a(2, var11.c[var22], var55));
                     }
                  }
               }
            }
         }

      }
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8) {
      Object[] var9 = ui.a(this.E, (Runnable)Thread.currentThread());
      uo var10 = (uo)var9[17];
      var10.J = 0;
      var10.c = true;
      ui.a(this.E);
      if(this.w == null && this.G == null) {
         if(this.K != null) {
            this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, (float[])((float[])var9[10]), (float[])((float[])var9[25]));
         }
      } else {
         this.b(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, (float[])((float[])var9[10]), (float[])((float[])var9[25]));
      }

   }

   final void GA(ya var1, int var2, int var3, int var4, int var5, boolean var6) {}

   private final void b(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8, Object[] var9, uo var10, float[] var11, float[] var12) {
      int var13 = (var7 - var5) * var3 / 256;
      int var14 = var3 >> 8;
      boolean var15 = ((boolean[])((boolean[])var9[2]))[1];
      ui.c(this.E, false);
      var10.o = false;
      var10.x = false;
      int var16 = var1;
      int var17 = var2 + var13;

      for(int var18 = var4; var18 < var6; ++var18) {
         for(int var19 = var5; var19 < var7; ++var19) {
            if(var8[var18 - var4][var19 - var5]) {
               int var21;
               int var23;
               int var22;
               float var25;
               int var24;
               float var27;
               float var26;
               float var29;
               float var28;
               int var31;
               float var30;
               if(this.w != null) {
                  if(this.w[var18][var19] == null) {
                     if(this.u[var18][var19] != null) {
                        nw var32 = this.u[var18][var19];

                        for(var21 = 0; var21 < var32.k; ++var21) {
                           var11[var21] = (float)(var16 + var32.c[var21] * var14 / this.g);
                           var12[var21] = (float)(var17 - var32.b[var21] * var14 / this.g);
                        }

                        for(var21 = 0; var21 < var32.f_i; ++var21) {
                           var22 = var21 * 3;
                           var23 = var22 + 1;
                           var24 = var23 + 1;
                           var25 = var11[var22];
                           var26 = var11[var23];
                           var27 = var11[var24];
                           var28 = var12[var22];
                           var29 = var12[var23];
                           var30 = var12[var24];
                           if(var32.e != null && var32.e[var21] != 0 && (var32.d == null || var32.d != null && var32.d[var21] == -1)) {
                              var31 = var32.e[var21];
                              var10.d(var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, bca.b(var31, '\uff00', -16777216 - (var32.h[var22] & -16777216)), bca.b(var31, '\uff00', -16777216 - (var32.h[var23] & -16777216)), bca.b(var31, '\uff00', -16777216 - (var32.h[var24] & -16777216)));
                           } else if(var32.d != null && var32.d[var21] != -1) {
                              var31 = ui.h(this.E, var32.d[var21]);
                              var10.g(var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)var31, (float)var31, (float)var31);
                           } else {
                              var10.d(var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var32.h[var22], var32.h[var23], var32.h[var24]);
                           }
                        }
                     }
                  } else {
                     dc var33 = this.w[var18][var19];
                     if(var33.f_i != -1 && (var33.c & 2) == 0 && var33.k == 0) {
                        var21 = ui.h(this.E, var33.f_i);
                        var10.g((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)bm.a(2, var33.d, var21), (float)bm.a(2, var33.f, var21), (float)bm.a(2, var33.e, var21));
                        var10.g((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)bm.a(2, var33.b, var21), (float)bm.a(2, var33.e, var21), (float)bm.a(2, var33.f, var21));
                     } else if(var33.k == 0) {
                        var10.d((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, var33.d, var33.f, var33.e);
                        var10.d((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, var33.b, var33.e, var33.f);
                     } else {
                        var21 = var33.k;
                        var10.d((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, bca.b(var21, '\uff00', var33.d & -16777216), bca.b(var21, '\uff00', var33.f & -16777216), bca.b(var21, '\uff00', var33.e & -16777216));
                        var10.d((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, bca.b(var21, '\uff00', var33.b & -16777216), bca.b(var21, '\uff00', var33.e & -16777216), bca.b(var21, '\uff00', var33.f & -16777216));
                     }
                  }
               } else if(this.G[var18][var19] != null) {
                  tc var20 = this.G[var18][var19];

                  for(var21 = 0; var21 < var20.b; ++var21) {
                     var11[var21] = (float)(var16 + var20.f_i[var21] * var14 / this.g);
                     var12[var21] = (float)(var17 - var20.g[var21] * var14 / this.g);
                  }

                  for(var21 = 0; var21 < var20.a; ++var21) {
                     var22 = var21 * 3;
                     var23 = var22 + 1;
                     var24 = var23 + 1;
                     var25 = var11[var22];
                     var26 = var11[var23];
                     var27 = var11[var24];
                     var28 = var12[var22];
                     var29 = var12[var23];
                     var30 = var12[var24];
                     if(var20.j != null && var20.j[var21] != 0) {
                        var31 = var20.j[var21];
                        var10.d(var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var31, var31, var31);
                     } else {
                        var10.d(var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, var20.k[var22], var20.k[var23], var20.k[var24]);
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = var2 + var13;
         var16 += var14;
      }

      var10.o = true;
      ui.c(this.E, var15);
   }

   final void a(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Object[] var14, boolean var15) {
      if(this.K == null) {
         this.K = new cm[this.f_i][this.h];
         this.o = new co[this.f_i][this.h];
      } else if(this.w != null || this.G != null) {
         throw new IllegalStateException();
      }

      boolean var19 = false;
      int var21;
      int var22;
      if(var10.length == 2 && var7.length == 2 && (var10[0] == var10[1] || var12[0] != -1 && var12[0] == var12[1])) {
         var19 = true;

         for(int var20 = 1; var20 < 2; ++var20) {
            var21 = var3[var7[var20]];
            var22 = var5[var7[var20]];
            if(var21 != 0 && var21 != this.g || var22 != 0 && var22 != this.g) {
               var19 = false;
               break;
            }
         }
      }

      if(!var19) {
         co var28 = new co();
         short var31 = (short)var3.length;
         short var29 = (short)var10.length;
         var28.f_l = var31;
         var28.c = new short[var31];
         var28.k = new short[var31];
         var28.d = new short[var31];
         var28.a = new short[var31];

         int var25;
         int var24;
         int var26;
         for(int var23 = 0; var23 < var31; ++var23) {
            var24 = var3[var23];
            var25 = var5[var23];
            int var27;
            if(var24 == 0 && var25 == 0) {
               var28.c[var23] = (short)(this.t[var1][var2] - this.L[var1][var2]);
            } else if(var24 == 0 && var25 == this.g) {
               var28.c[var23] = (short)(this.t[var1][var2 + 1] - this.L[var1][var2 + 1]);
            } else if(var24 == this.g && var25 == this.g) {
               var28.c[var23] = (short)(this.t[var1 + 1][var2 + 1] - this.L[var1 + 1][var2 + 1]);
            } else if(var24 == this.g && var25 == 0) {
               var28.c[var23] = (short)(this.t[var1 + 1][var2] - this.L[var1 + 1][var2]);
            } else {
               var26 = (this.t[var1][var2] - this.L[var1][var2]) * (this.g - var24) + (this.t[var1 + 1][var2] - this.L[var1 + 1][var2]) * var24;
               var27 = (this.t[var1][var2 + 1] - this.L[var1][var2 + 1]) * (this.g - var24) + (this.t[var1 + 1][var2 + 1] - this.L[var1 + 1][var2 + 1]) * var24;
               var28.c[var23] = (short)(var26 * (this.g - var25) + var27 * var25 >> 2 * this.a);
            }

            var26 = (var1 << this.a) + var24;
            var27 = (var2 << this.a) + var25;
            var28.k[var23] = (short)var24;
            var28.a[var23] = (short)var25;
            var28.d[var23] = (short)(this.a(1, var26, var27) + (var4 != null?var4[var23]:0));
            if(var28.c[var23] < 2) {
               var28.c[var23] = 2;
            }
         }

         boolean var33 = false;
         var24 = 0;

         for(var25 = 0; var25 < var29; ++var25) {
            if(var10[var25] >= 0 || var11 != null && var11[var25] >= 0) {
               ++var24;
            }

            var26 = var12[var25];
            if(var26 != -1) {
               Object[] var16 = this.E;
               Object[] var35 = ((ta)(this.E == null?null:var16[6])).k.a(var26, (byte)87);
               if(!((boolean[])((boolean[])var35[3]))[7]) {
                  var33 = true;
                  if(this.a(((byte[])((byte[])var35[0]))[4]) || ((byte[])((byte[])var35[0]))[5] != 0 || ((byte[])((byte[])var35[0]))[6] != 0) {
                     var28.m = (byte)(var28.m | 4);
                  }
               }
            }
         }

         var28.h = new int[var24];
         if(var11 != null) {
            var28.b = new int[var24];
         }

         var28.f_i = new short[var24];
         var28.j = new short[var24];
         var28.e = new short[var24];
         if(var33) {
            var28.f = new short[var24];
            var28.n = new short[var24];
         }

         for(var25 = 0; var25 < var29; ++var25) {
            if(var10[var25] >= 0 || var11 != null && var11[var25] >= 0) {
               if(var10[var25] >= 0) {
                  var28.h[var28.g] = spa.a(var10[var25], (byte)68);
               } else {
                  var28.h[var28.g] = -1;
               }

               if(var11 != null) {
                  if(var11[var25] != -1) {
                     var28.b[var28.g] = spa.a(var11[var25], (byte)68);
                  } else {
                     var28.b[var28.g] = -1;
                  }
               }

               var28.f_i[var28.g] = (short)var7[var25];
               var28.j[var28.g] = (short)var8[var25];
               var28.e[var28.g] = (short)var9[var25];
               if(var33) {
                  label162: {
                     if(var12[var25] != -1) {
                        Object[] var17 = this.E;
                        if(!((boolean[])((boolean[])((ta)(this.E == null?null:var17[6])).k.a(var12[var25], (byte)113)[3]))[7]) {
                           var28.f[var28.g] = (short)var12[var25];
                           var28.n[var28.g] = (short)var13[var25];
                           break label162;
                        }
                     }

                     var28.f[var28.g] = -1;
                  }
               }

               ++var28.g;
            }
         }

         this.o[var1][var2] = var28;
      } else if(var10[0] >= 0 || var11 != null && var11[0] >= 0) {
         cm var30 = new cm();
         var21 = var10[0];
         var22 = var12[0];
         if(var11 != null) {
            var30.d = bm.a(2, this.t[var1][var2] - this.L[var1][var2], spa.a(var11[0], (byte)68));
            if(var21 == -1) {
               var30.e = (byte)(var30.e | 2);
            }
         }

         if(this.f[var1][var2] == this.f[var1 + 1][var2] && this.f[var1][var2] == this.f[var1 + 1][var2 + 1] && this.f[var1][var2] == this.f[var1][var2 + 1]) {
            var30.e = (byte)(var30.e | 1);
         }

         Object[] var34 = null;
         if(var22 != -1) {
            Object[] var18 = this.E;
            var34 = ((ta)(this.E == null?null:var18[6])).k.a(var22, (byte)94);
         }

         if(var34 != null && (var30.e & 2) == 0 && !((boolean[])((boolean[])var34[3]))[7]) {
            var30.b = (short)(this.t[var1][var2] - this.L[var1][var2]);
            var30.c = (short)(this.t[var1 + 1][var2] - this.L[var1 + 1][var2]);
            var30.f = (short)(this.t[var1 + 1][var2 + 1] - this.L[var1 + 1][var2 + 1]);
            var30.g = (short)(this.t[var1][var2 + 1] - this.L[var1][var2 + 1]);
            var30.a = (short)var22;
            if(this.a(((byte[])((byte[])var34[0]))[4]) || ((byte[])((byte[])var34[0]))[5] != 0 || ((byte[])((byte[])var34[0]))[6] != 0) {
               var30.e = (byte)(var30.e | 4);
            }
         } else {
            short var32 = spa.a(var21, (byte)68);
            var30.b = (short)bm.a(2, this.t[var1][var2] - this.L[var1][var2], var32);
            var30.c = (short)bm.a(2, this.t[var1 + 1][var2] - this.L[var1 + 1][var2], var32);
            var30.f = (short)bm.a(2, this.t[var1 + 1][var2 + 1] - this.L[var1 + 1][var2 + 1], var32);
            var30.g = (short)bm.a(2, this.t[var1][var2 + 1] - this.L[var1][var2 + 1], var32);
            var30.a = -1;
         }

         this.K[var1][var2] = var30;
      }

   }

   private static final int b(int var0, int var1) {
      int var2 = (var0 & 16711680) * var1 >> 23;
      if(var2 < 2) {
         var2 = 2;
      } else if(var2 > 253) {
         var2 = 253;
      }

      int var3 = (var0 & '\uff00') * var1 >> 15;
      if(var3 < 2) {
         var3 = 2;
      } else if(var3 > 253) {
         var3 = 253;
      }

      int var4 = (var0 & 255) * var1 >> 7;
      if(var4 < 2) {
         var4 = 2;
      } else if(var4 > 253) {
         var4 = 253;
      }

      return var2 << 16 | var3 << 8 | var4;
   }

   final void a(Object[] var1, int[] var2) {}

   private final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8, Object[] var9, uo var10, float[] var11, float[] var12) {
      int var13 = (var7 - var5) * var3 / 256;
      int var14 = var3 >> 8;
      boolean var15 = ((boolean[])((boolean[])var9[2]))[1];
      ui.c(this.E, false);
      var10.o = false;
      var10.x = false;
      int var16 = var1;
      int var17 = var2 + var13;

      for(int var18 = var4; var18 < var6; ++var18) {
         for(int var19 = var5; var19 < var7; ++var19) {
            if(var8[var18 - var4][var19 - var5]) {
               int var21;
               if(this.K[var18][var19] != null) {
                  cm var32 = this.K[var18][var19];
                  if(var32.a != -1 && (var32.e & 2) == 0 && var32.d == -1) {
                     var21 = ui.h(this.E, var32.a);
                     var10.g((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)bm.a(2, var32.f & '\uffff', var21), (float)bm.a(2, var32.g & '\uffff', var21), (float)bm.a(2, var32.c & '\uffff', var21));
                     var10.g((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)bm.a(2, var32.b & '\uffff', var21), (float)bm.a(2, var32.c & '\uffff', var21), (float)bm.a(2, var32.g & '\uffff', var21));
                  } else if(var32.d == -1) {
                     var10.g((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)(var32.f & '\uffff'), (float)(var32.g & '\uffff'), (float)(var32.c & '\uffff'));
                     var10.g((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)(var32.b & '\uffff'), (float)(var32.c & '\uffff'), (float)(var32.g & '\uffff'));
                  } else {
                     var21 = var32.d;
                     var10.g((float)(var17 - var14), (float)(var17 - var14), (float)var17, (float)(var16 + var14), (float)var16, (float)(var16 + var14), 100.0F, 100.0F, 100.0F, (float)var21, (float)var21, (float)var21);
                     var10.g((float)var17, (float)var17, (float)(var17 - var14), (float)var16, (float)(var16 + var14), (float)var16, 100.0F, 100.0F, 100.0F, (float)var21, (float)var21, (float)var21);
                  }
               } else if(this.o[var18][var19] != null) {
                  co var20 = this.o[var18][var19];

                  for(var21 = 0; var21 < var20.f_l; ++var21) {
                     var11[var21] = (float)(var16 + var20.k[var21] * var14 / this.g);
                     var12[var21] = (float)(var17 - var20.a[var21] * var14 / this.g);
                  }

                  for(var21 = 0; var21 < var20.g; ++var21) {
                     short var22 = var20.f_i[var21];
                     short var23 = var20.j[var21];
                     short var24 = var20.e[var21];
                     float var25 = var11[var22];
                     float var26 = var11[var23];
                     float var27 = var11[var24];
                     float var28 = var12[var22];
                     float var29 = var12[var23];
                     float var30 = var12[var24];
                     int var31;
                     if(var20.b != null && var20.b[var21] != -1) {
                        var31 = var20.b[var21];
                        var10.g(var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)bm.a(2, var20.c[var22], var31), (float)bm.a(2, var20.c[var23], var31), (float)bm.a(2, var20.c[var24], var31));
                     } else if(var20.f != null && var20.f[var21] != -1) {
                        var31 = ui.h(this.E, var20.f[var21]);
                        var10.g(var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)bm.a(2, var20.c[var22], var31), (float)bm.a(2, var20.c[var23], var31), (float)bm.a(2, var20.c[var24], var31));
                     } else {
                        var31 = var20.h[var21];
                        var10.g(var28, var29, var30, var25, var26, var27, 100.0F, 100.0F, 100.0F, (float)bm.a(2, var20.c[var22], var31), (float)bm.a(2, var20.c[var23], var31), (float)bm.a(2, var20.c[var24], var31));
                     }
                  }
               }
            }

            var17 -= var14;
         }

         var17 = var2 + var13;
         var16 += var14;
      }

      var10.o = true;
      ui.c(this.E, var15);
   }

   final void a(int var1, int var2) {
      if(this.E[7] != null && this.E[12] != null) {
         this.c(var1, var2, 0);
      } else {
         throw new IllegalStateException("");
      }
   }

   private final boolean a(int var1) {
      return (this.H & 8) == 0?false:(var1 == 4?true:(var1 == 8?true:var1 == 9));
   }

   vca(Object[] var1, int var2, int var3, int var4, int var5, int[][] var6, int[][] var7, int var8) {
      super(var4, var5, var8, var6);
      this.E = var1;
      this.H = var3;
      this.t = new byte[var4 + 1][var5 + 1];
      int var9 = ((int[])((int[])this.E[1]))[6] >> 9;

      for(int var10 = 1; var10 < var5; ++var10) {
         for(int var11 = 1; var11 < var4; ++var11) {
            int var13 = var7[var11 + 1][var10] - var7[var11 - 1][var10];
            int var14 = var7[var11][var10 + 1] - var7[var11][var10 - 1];
            int var15 = (int)Math.sqrt((double)(var13 * var13 + 512 * var8 + var14 * var14));
            int var16 = (var13 << 8) / var15;
            int var17 = -512 * var8 / var15;
            int var18 = (var14 << 8) / var15;
            int var12 = var9 + (((int[])((int[])this.E[1]))[2] * var16 + ((int[])((int[])this.E[1]))[18] * var17 + ((int[])((int[])this.E[1]))[3] * var18 >> 17);
            var12 >>= 1;
            if(var12 < 2) {
               var12 = 2;
            } else if(var12 > 126) {
               var12 = 126;
            }

            this.t[var11][var10] = (byte)var12;
         }
      }

      this.L = new byte[var4 + 1][var5 + 1];
   }

   final void ja(ya var1, int var2, int var3, int var4, int var5, boolean var6) {}

   final boolean a(ya var1, int var2, int var3, int var4, int var5, boolean var6) {
      return false;
   }

   final void a(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Object[] var11, boolean var12) {
      boolean var25 = (this.H & 32) == 0;
      if(this.w == null && !var25) {
         this.w = new dc[this.f_i][this.h];
         this.u = new nw[this.f_i][this.h];
      } else if(this.G == null && var25) {
         this.G = new tc[this.f_i][this.h];
      } else if(this.K != null) {
         throw new IllegalStateException();
      }

      if(var3 != null && var3.length != 0) {
         int var26;
         for(var26 = 0; var26 < var7.length; ++var26) {
            if(var7[var26] == -1) {
               var7[var26] = 0;
            } else {
               var7[var26] = en.c[spa.a(var7[var26], (byte)68) & '\uffff'] << 8 | 255;
            }
         }

         if(var8 != null) {
            for(var26 = 0; var26 < var8.length; ++var26) {
               if(var8[var26] == -1) {
                  var8[var26] = 0;
               } else {
                  var8[var26] = en.c[spa.a(var8[var26], (byte)68) & '\uffff'] << 8 | 255;
               }
            }
         }

         int var27;
         int var29;
         int var28;
         int var31;
         int var32;
         int var33;
         int var42;
         int var47;
         if(var25) {
            tc var41 = new tc();
            var41.b = (short)var3.length;
            var41.a = (short)(var3.length / 3);
            var41.f_i = new short[var41.b];
            var41.c = new short[var41.b];
            var41.g = new short[var41.b];
            var41.k = new int[var41.b];
            var41.f = new short[var41.b];
            var41.h = new short[var41.b];
            var41.e = new byte[var41.b];
            if(var6 != null) {
               var41.d = new short[var41.b];
            }

            for(var27 = 0; var27 < var41.b; ++var27) {
               var28 = var3[var27];
               var29 = var5[var27];
               boolean var30 = false;
               if(var28 == 0 && var29 == 0) {
                  var42 = this.t[var1][var2] - this.L[var1][var2];
               } else if(var28 == 0 && var29 == this.g) {
                  var42 = this.t[var1][var2 + 1] - this.L[var1][var2 + 1];
               } else if(var28 == this.g && var29 == this.g) {
                  var42 = this.t[var1 + 1][var2 + 1] - this.L[var1 + 1][var2 + 1];
               } else if(var28 == this.g && var29 == 0) {
                  var42 = this.t[var1 + 1][var2] - this.L[var1 + 1][var2];
               } else {
                  var31 = (this.t[var1][var2] - this.L[var1][var2]) * (this.g - var28) + (this.t[var1 + 1][var2] - this.L[var1 + 1][var2]) * var28;
                  var32 = (this.t[var1][var2 + 1] - this.L[var1][var2 + 1]) * (this.g - var28) + (this.t[var1 + 1][var2 + 1] - this.L[var1 + 1][var2 + 1]) * var28;
                  var42 = var31 * (this.g - var29) + var32 * var29 >> 2 * this.a;
               }

               var31 = (var1 << this.a) + var28;
               var32 = (var2 << this.a) + var29;
               var41.f_i[var27] = (short)var28;
               var41.g[var27] = (short)var29;
               var41.c[var27] = (short)(this.a(1, var31, var32) + (var4 != null?var4[var27]:0));
               if(var42 < 0) {
                  var42 = 0;
               }

               if(var7[var27] == 0) {
                  var41.k[var27] = 0;
                  if(var8 != null) {
                     var41.e[var27] = (byte)var42;
                  }
               } else {
                  var33 = 0;
                  if(var6 != null) {
                     short var34 = var41.d[var27] = (short)var6[var27];
                     if(((int[])((int[])var11[0]))[5] != 0) {
                        var33 = 255 * var34 / ((int[])((int[])var11[0]))[5];
                        if(var33 < 0) {
                           var33 = 0;
                        } else if(var33 > 255) {
                           var33 = 255;
                        }
                     }
                  }

                  var47 = -16777216;
                  if(var9[var27] != -1) {
                     Object[] var13 = this.E;
                     if(this.a(((byte[])((byte[])((ta)(this.E == null?null:var13[6])).k.a(var9[var27], (byte)126)[0]))[4])) {
                        var47 = -1694498816;
                     }
                  }

                  var41.k[var27] = var47 | fg.a(b(var7[var27] >> 8, var42), ((int[])((int[])var11[0]))[1], var33, (int)92);
                  if(var8 != null) {
                     var41.e[var27] = (byte)var42;
                  }
               }

               var41.f[var27] = (short)var9[var27];
               var41.h[var27] = (short)var10[var27];
            }

            if(var8 != null) {
               var41.j = new int[var41.a];
            }

            for(var27 = 0; var27 < var41.a; ++var27) {
               var28 = var27 * 3;
               if(var8 != null && var8[var28] != 0) {
                  var41.j[var27] = -16777216 | var8[var28] >> 8;
               }
            }

            this.G[var1][var2] = var41;
         } else {
            boolean var40 = true;
            var27 = -1;
            var28 = -1;
            var29 = -1;
            var42 = -1;
            if(var3.length == 6) {
               for(var31 = 0; var31 < 6; ++var31) {
                  if(var3[var31] == 0 && var5[var31] == 0) {
                     if(var27 != -1 && var7[var27] != var7[var31]) {
                        var40 = false;
                        break;
                     }

                     var27 = var31;
                  } else if(var3[var31] == this.g && var5[var31] == 0) {
                     if(var28 != -1 && var7[var28] != var7[var31]) {
                        var40 = false;
                        break;
                     }

                     var28 = var31;
                  } else if(var3[var31] == this.g && var5[var31] == this.g) {
                     if(var29 != -1 && var7[var29] != var7[var31]) {
                        var40 = false;
                        break;
                     }

                     var29 = var31;
                  } else if(var3[var31] == 0 && var5[var31] == this.g) {
                     if(var42 != -1 && var7[var42] != var7[var31]) {
                        var40 = false;
                        break;
                     }

                     var42 = var31;
                  }
               }

               if(var27 == -1 || var28 == -1 || var29 == -1 || var42 == -1) {
                  var40 = false;
               }

               if(var40) {
                  if(var4 != null) {
                     for(var31 = 0; var31 < 4; ++var31) {
                        if(var4[var31] != 0) {
                           var40 = false;
                           break;
                        }
                     }
                  }

                  if(var40) {
                     for(var31 = 1; var31 < 4; ++var31) {
                        if(var3[var31] != var3[0] && var3[var31] != var3[0] + this.g && var3[var31] != var3[0] - this.g) {
                           var40 = false;
                           break;
                        }

                        if(var5[var31] != var5[0] && var5[var31] != var5[0] + this.g && var5[var31] != var5[0] - this.g) {
                           var40 = false;
                           break;
                        }
                     }
                  }
               }
            } else {
               var40 = false;
            }

            if(var40) {
               dc var43 = new dc();
               var32 = var7[0];
               var33 = var9[0];
               if(var8 != null) {
                  var43.k = var8[0] >> 8;
                  if(var32 == 0) {
                     var43.c = (byte)(var43.c | 2);
                  }
               } else if(var32 == 0) {
                  return;
               }

               if(this.f[var1][var2] == this.f[var1 + 1][var2] && this.f[var1][var2] == this.f[var1 + 1][var2 + 1] && this.f[var1][var2] == this.f[var1][var2 + 1]) {
                  var43.c = (byte)(var43.c | 1);
               }

               label755: {
                  if(var33 != -1 && (var43.c & 2) == 0) {
                     Object[] var14 = this.E;
                     if(!((boolean[])((boolean[])((ta)(this.E == null?null:var14[6])).k.a(var33, (byte)102)[3]))[7]) {
                        if(var6 != null && ((int[])((int[])var11[0]))[5] != 0) {
                           var47 = 255 * var6[var27] / ((int[])((int[])var11[0]))[5];
                           if(var47 < 0) {
                              var47 = 0;
                           } else if(var47 > 255) {
                              var47 = 255;
                           }
                        } else {
                           var47 = 0;
                        }

                        var43.b = fg.a(b(var7[var27] >> 8, this.t[var1][var2] - this.L[var1][var2]), ((int[])((int[])var11[0]))[1], var47, (int)68);
                        if(var43.k != 0) {
                           var43.b |= 255 - (this.t[var1][var2] - this.L[var1][var2]) << 25;
                        }

                        if(var6 != null && ((int[])((int[])var11[0]))[5] != 0) {
                           var47 = 255 * var6[var28] / ((int[])((int[])var11[0]))[5];
                           if(var47 < 0) {
                              var47 = 0;
                           } else if(var47 > 255) {
                              var47 = 255;
                           }
                        } else {
                           var47 = 0;
                        }

                        var43.e = fg.a(b(var7[var28] >> 8, this.t[var1 + 1][var2] - this.L[var1 + 1][var2]), ((int[])((int[])var11[0]))[1], var47, (int)89);
                        if(var43.k != 0) {
                           var43.e |= 255 - (this.t[var1 + 1][var2] - this.L[var1 + 1][var2]) << 25;
                        }

                        if(var6 != null && ((int[])((int[])var11[0]))[5] != 0) {
                           var47 = 255 * var6[var29] / ((int[])((int[])var11[0]))[5];
                           if(var47 < 0) {
                              var47 = 0;
                           } else if(var47 > 255) {
                              var47 = 255;
                           }
                        } else {
                           var47 = 0;
                        }

                        var43.d = fg.a(b(var7[var29] >> 8, this.t[var1 + 1][var2 + 1] - this.L[var1 + 1][var2 + 1]), ((int[])((int[])var11[0]))[1], var47, (int)115);
                        if(var43.k != 0) {
                           var43.d |= 255 - (this.t[var1 + 1][var2 + 1] - this.L[var1 + 1][var2 + 1]) << 25;
                        }

                        if(var6 != null && ((int[])((int[])var11[0]))[5] != 0) {
                           var47 = 255 * var6[var42] / ((int[])((int[])var11[0]))[5];
                           if(var47 < 0) {
                              var47 = 0;
                           } else if(var47 > 255) {
                              var47 = 255;
                           }
                        } else {
                           var47 = 0;
                        }

                        var43.f = fg.a(b(var7[var42] >> 8, this.t[var1][var2 + 1] - this.L[var1][var2 + 1]), ((int[])((int[])var11[0]))[1], var47, (int)49);
                        var43.f_i = (short)var33;
                        break label755;
                     }
                  }

                  if(var6 != null && ((int[])((int[])var11[0]))[5] != 0) {
                     var47 = 255 * var6[var27] / ((int[])((int[])var11[0]))[5];
                     if(var47 < 0) {
                        var47 = 0;
                     } else if(var47 > 255) {
                        var47 = 255;
                     }
                  } else {
                     var47 = 0;
                  }

                  var43.b = fg.a(b(var7[var27] >> 8, this.t[var1][var2] - this.L[var1][var2]), ((int[])((int[])var11[0]))[1], var47, (int)121);
                  if(var43.k != 0) {
                     var43.b |= 255 - (this.t[var1][var2] - this.L[var1][var2]) << 25;
                  }

                  if(var6 != null && ((int[])((int[])var11[0]))[5] != 0) {
                     var47 = 255 * var6[var28] / ((int[])((int[])var11[0]))[5];
                     if(var47 < 0) {
                        var47 = 0;
                     } else if(var47 > 255) {
                        var47 = 255;
                     }
                  } else {
                     var47 = 0;
                  }

                  var43.e = fg.a(b(var7[var28] >> 8, this.t[var1 + 1][var2] - this.L[var1 + 1][var2]), ((int[])((int[])var11[0]))[1], var47, (int)119);
                  if(var43.k != 0) {
                     var43.e |= 255 - (this.t[var1 + 1][var2] - this.L[var1 + 1][var2]) << 25;
                  }

                  if(var6 != null && ((int[])((int[])var11[0]))[5] != 0) {
                     var47 = 255 * var6[var29] / ((int[])((int[])var11[0]))[5];
                     if(var47 < 0) {
                        var47 = 0;
                     } else if(var47 > 255) {
                        var47 = 255;
                     }
                  } else {
                     var47 = 0;
                  }

                  var43.d = fg.a(b(var7[var29] >> 8, this.t[var1 + 1][var2 + 1] - this.L[var1 + 1][var2 + 1]), ((int[])((int[])var11[0]))[1], var47, (int)119);
                  if(var43.k != 0) {
                     var43.d |= 255 - (this.t[var1 + 1][var2 + 1] - this.L[var1 + 1][var2 + 1]) << 25;
                  }

                  if(var6 != null && ((int[])((int[])var11[0]))[5] != 0) {
                     var47 = 255 * var6[var42] / ((int[])((int[])var11[0]))[5];
                     if(var47 < 0) {
                        var47 = 0;
                     } else if(var47 > 255) {
                        var47 = 255;
                     }
                  } else {
                     var47 = 0;
                  }

                  var43.f = fg.a(b(var7[var42] >> 8, this.t[var1][var2 + 1] - this.L[var1][var2 + 1]), ((int[])((int[])var11[0]))[1], var47, (int)42);
                  if(var43.k != 0) {
                     var43.f |= 255 - (this.t[var1][var2 + 1] - this.L[var1][var2 + 1]) << 25;
                  }

                  var43.f_i = -1;
               }

               if(var6 != null) {
                  var43.g = (short)var6[var29];
                  var43.h = (short)var6[var42];
                  var43.j = (short)var6[var28];
                  var43.a = (short)var6[var27];
               }

               this.w[var1][var2] = var43;
            } else {
               nw var45 = new nw();
               var45.k = (short)var3.length;
               var45.f_i = (short)(var3.length / 3);
               var45.c = new short[var45.k];
               var45.j = new short[var45.k];
               var45.b = new short[var45.k];
               var45.h = new int[var45.k];
               if(var6 != null) {
                  var45.g = new short[var45.k];
               }

               int var36;
               int var46;
               for(var32 = 0; var32 < var45.k; ++var32) {
                  var33 = var3[var32];
                  var47 = var5[var32];
                  boolean var35 = false;
                  int var37;
                  if(var33 == 0 && var47 == 0) {
                     var46 = this.t[var1][var2] - this.L[var1][var2];
                  } else if(var33 == 0 && var47 == this.g) {
                     var46 = this.t[var1][var2 + 1] - this.L[var1][var2 + 1];
                  } else if(var33 == this.g && var47 == this.g) {
                     var46 = this.t[var1 + 1][var2 + 1] - this.L[var1 + 1][var2 + 1];
                  } else if(var33 == this.g && var47 == 0) {
                     var46 = this.t[var1 + 1][var2] - this.L[var1 + 1][var2];
                  } else {
                     var36 = (this.t[var1][var2] - this.L[var1][var2]) * (this.g - var33) + (this.t[var1 + 1][var2] - this.L[var1 + 1][var2]) * var33;
                     var37 = (this.t[var1][var2 + 1] - this.L[var1][var2 + 1]) * (this.g - var33) + (this.t[var1 + 1][var2 + 1] - this.L[var1 + 1][var2 + 1]) * var33;
                     var46 = var36 * (this.g - var47) + var37 * var47 >> 2 * this.a;
                  }

                  var36 = (var1 << this.a) + var33;
                  var37 = (var2 << this.a) + var47;
                  var45.c[var32] = (short)var33;
                  var45.b[var32] = (short)var47;
                  var45.j[var32] = (short)(this.a(1, var36, var37) + (var4 != null?var4[var32]:0));
                  if(var46 < 0) {
                     var46 = 0;
                  }

                  if(var7[var32] == 0) {
                     if(var8 != null) {
                        var45.h[var32] = var46 << 25;
                     } else {
                        var45.h[var32] = 0;
                     }
                  } else {
                     int var38 = 0;
                     if(var6 != null) {
                        short var39 = var45.g[var32] = (short)var6[var32];
                        if(((int[])((int[])var11[0]))[5] != 0) {
                           var38 = 255 * var39 / ((int[])((int[])var11[0]))[5];
                           if(var38 < 0) {
                              var38 = 0;
                           } else if(var38 > 255) {
                              var38 = 255;
                           }
                        }
                     }

                     var45.h[var32] = fg.a(b(var7[var32] >> 8, var46), ((int[])((int[])var11[0]))[1], var38, (int)73);
                     if(var8 != null) {
                        var45.h[var32] |= var46 << 25;
                     }
                  }
               }

               boolean var44 = false;

               for(var33 = 0; var33 < var45.f_i; ++var33) {
                  if(var9[var33 * 3] != -1) {
                     Object[] var15 = this.E;
                     if(!((boolean[])((boolean[])((ta)(this.E == null?null:var15[6])).k.a(var9[var33 * 3], (byte)99)[3]))[7]) {
                        var44 = true;
                     }
                  }
               }

               if(var8 != null) {
                  var45.e = new int[var45.f_i];
               }

               if(var44) {
                  var45.d = new short[var45.f_i];
                  var45.a = new short[var45.f_i];
               }

               for(var33 = 0; var33 < var45.f_i; ++var33) {
                  var47 = var33 * 3;
                  if(var8 != null && var8[var47] != 0) {
                     var45.e[var33] = var8[var47] >> 8;
                  }

                  if(var44) {
                     boolean var50;
                     boolean var49;
                     int var48;
                     label525: {
                        var46 = var47 + 1;
                        var36 = var46 + 1;
                        var49 = false;
                        var50 = true;
                        var48 = var9[var47];
                        if(var48 != -1) {
                           Object[] var16 = this.E;
                           if(!((boolean[])((boolean[])((ta)(this.E == null?null:var16[6])).k.a(var48, (byte)65)[3]))[7]) {
                              var49 = true;
                              break label525;
                           }
                        }

                        var50 = false;
                     }

                     label519: {
                        var48 = var9[var46];
                        if(var48 != -1) {
                           Object[] var17 = this.E;
                           if(!((boolean[])((boolean[])((ta)(this.E == null?null:var17[6])).k.a(var48, (byte)65)[3]))[7]) {
                              var49 = true;
                              break label519;
                           }
                        }

                        var50 = false;
                     }

                     label513: {
                        var48 = var9[var36];
                        if(var48 != -1) {
                           Object[] var18 = this.E;
                           if(!((boolean[])((boolean[])((ta)(this.E == null?null:var18[6])).k.a(var48, (byte)108)[3]))[7]) {
                              var49 = true;
                              break label513;
                           }
                        }

                        var50 = false;
                     }

                     if(var50) {
                        var45.d[var33] = (short)var48;
                        var45.a[var33] = (short)var10[var47];
                     } else {
                        if(var49) {
                           var48 = var9[var47];
                           if(var48 != -1) {
                              Object[] var19 = this.E;
                              if(!((boolean[])((boolean[])((ta)(this.E == null?null:var19[6])).k.a(var48, (byte)95)[3]))[7]) {
                                 Object[] var20 = this.E;
                                 var45.h[var47] = en.c[spa.a(((short[])((short[])((ta)(this.E == null?null:var20[6])).k.a(var48, (byte)80)[2]))[0] & '\uffff', (byte)68) & '\uffff'];
                              }
                           }

                           var48 = var9[var46];
                           if(var48 != -1) {
                              Object[] var21 = this.E;
                              if(!((boolean[])((boolean[])((ta)(this.E == null?null:var21[6])).k.a(var48, (byte)47)[3]))[7]) {
                                 Object[] var22 = this.E;
                                 var45.h[var46] = en.c[spa.a(((short[])((short[])((ta)(this.E == null?null:var22[6])).k.a(var48, (byte)41)[2]))[0] & '\uffff', (byte)68) & '\uffff'];
                              }
                           }

                           var48 = var9[var36];
                           if(var48 != -1) {
                              Object[] var23 = this.E;
                              if(!((boolean[])((boolean[])((ta)(this.E == null?null:var23[6])).k.a(var48, (byte)51)[3]))[7]) {
                                 Object[] var24 = this.E;
                                 var45.h[var36] = en.c[spa.a(((short[])((short[])((ta)(this.E == null?null:var24[6])).k.a(var48, (byte)62)[2]))[0] & '\uffff', (byte)68) & '\uffff'];
                              }
                           }
                        }

                        var45.d[var33] = -1;
                     }
                  }
               }

               this.u[var1][var2] = var45;
            }
         }

      }
   }

   private final void c(int var1, int var2, int var3) {
      Object[] var4 = ui.a(this.E, (Runnable)Thread.currentThread());
      ((uo)var4[17]).J = 0;
      if(this.w != null) {
         this.a(var1, var2, ((boolean[])((boolean[])var4[2]))[2], var4, (uo)var4[17], (float[])((float[])var4[10]), (float[])((float[])var4[25]), (float[])((float[])var4[8]), (float[])((float[])var4[21]), (float[])((float[])var4[11]), var3);
      } else if(this.K != null) {
         this.a(var1, var2, (uo)var4[17], (float[])((float[])var4[10]), (float[])((float[])var4[25]), (float[])((float[])var4[8]), (float[])((float[])var4[21]), (float[])((float[])var4[11]), var3);
      } else if(this.G != null) {
         this.b(var1, var2, ((boolean[])((boolean[])var4[2]))[2], var4, (uo)var4[17], (float[])((float[])var4[10]), (float[])((float[])var4[25]), (float[])((float[])var4[8]), (float[])((float[])var4[21]), (float[])((float[])var4[11]), var3);
      }

   }

   private final void a(int var1, int var2, boolean var3, Object[] var4, uo var5, float[] var6, float[] var7, float[] var8, float[] var9, float[] var10, int var11) {
      dc var17 = this.w[var1][var2];
      int var19;
      int var21;
      int var20;
      float var23;
      float var22;
      float var25;
      float var24;
      float var26;
      float var28;
      float var31;
      float var34;
      float var35;
      float var32;
      float var33;
      float var36;
      float var37;
      if(var17 != null) {
         if((var17.c & 2) == 0) {
            if(var11 != 0) {
               if((var17.c & 4) != 0) {
                  if((var11 & 1) != 0) {
                     return;
                  }
               } else if((var11 & 2) != 0) {
                  return;
               }
            }

            int var60 = var1 * this.g;
            var19 = var60 + this.g;
            var20 = var2 * this.g;
            var21 = var20 + this.g;
            float var50 = 0.0F;
            float var51 = 0.0F;
            float var52 = 0.0F;
            float var53 = 0.0F;
            float var42;
            float var43;
            float var40;
            float var41;
            float var46;
            float var47;
            float var44;
            float var45;
            float var49;
            float var48;
            int var55;
            float var54;
            int var57;
            float var63;
            float var62;
            float var61;
            float var69;
            float var65;
            float var66;
            if((var17.c & 1) != 0 && !var3) {
               var55 = this.f[var1][var2];
               var69 = this.M * (float)var55;
               float var68 = this.D * (float)var55;
               var42 = this.N + this.p * (float)var60 + var69 + this.F * (float)var20;
               var46 = this.x + this.v * (float)var60 + var68 + this.q * (float)var20;
               if(var42 < -var46) {
                  return;
               }

               var43 = this.N + this.p * (float)var19 + var69 + this.F * (float)var20;
               var47 = this.x + this.v * (float)var19 + var68 + this.q * (float)var20;
               if(var43 < -var47) {
                  return;
               }

               var44 = this.N + this.p * (float)var19 + var69 + this.F * (float)var21;
               var48 = this.x + this.v * (float)var19 + var68 + this.q * (float)var21;
               if(var44 < -var48) {
                  return;
               }

               var45 = this.N + this.p * (float)var60 + var69 + this.F * (float)var21;
               var49 = this.x + this.v * (float)var60 + var68 + this.q * (float)var21;
               if(var45 < -var49) {
                  return;
               }

               var61 = var5.z + var5.k * var42 / var46;
               var31 = var5.z + var5.k * var43 / var47;
               var32 = var5.z + var5.k * var44 / var48;
               var33 = var5.z + var5.k * var45 / var49;
               if(((boolean[])((boolean[])var4[2]))[0]) {
                  var54 = var42 - ((float[])((float[])var4[18]))[4];
                  if(var54 > 0.0F) {
                     var50 = var54 / ((float[])((float[])var4[18]))[8];
                     if(var50 > 1.0F) {
                        var50 = 1.0F;
                     }
                  }

                  var54 = var43 - ((float[])((float[])var4[18]))[4];
                  if(var54 > 0.0F) {
                     var51 = var54 / ((float[])((float[])var4[18]))[8];
                     if(var51 > 1.0F) {
                        var51 = 1.0F;
                     }
                  }

                  var54 = var44 - ((float[])((float[])var4[18]))[4];
                  if(var54 > 0.0F) {
                     var52 = var54 / ((float[])((float[])var4[18]))[8];
                     if(var52 > 1.0F) {
                        var52 = 1.0F;
                     }
                  }

                  var54 = var45 - ((float[])((float[])var4[18]))[4];
                  if(var54 > 0.0F) {
                     var53 = var54 / ((float[])((float[])var4[18]))[8];
                     if(var53 > 1.0F) {
                        var53 = 1.0F;
                     }
                  }
               }

               float var70 = this.z * (float)var55;
               float var71 = this.y * (float)var55;
               var34 = this.I + this.s * (float)var60 + var70 + this.r * (float)var20;
               var22 = var5.t + var5.r * var34 / var46;
               var65 = this.C + this.J * (float)var60 + var71 + this.A * (float)var20;
               var26 = var5.L + var5.w * var65 / var46;
               var35 = this.I + this.s * (float)var19 + var70 + this.r * (float)var20;
               var23 = var5.t + var5.r * var35 / var47;
               var66 = this.C + this.J * (float)var19 + var71 + this.A * (float)var20;
               var62 = var5.L + var5.w * var66 / var47;
               var36 = this.I + this.s * (float)var19 + var70 + this.r * (float)var21;
               var24 = var5.t + var5.r * var36 / var48;
               var40 = this.C + this.J * (float)var19 + var71 + this.A * (float)var21;
               var28 = var5.L + var5.w * var40 / var48;
               var37 = this.I + this.s * (float)var60 + var70 + this.r * (float)var21;
               var25 = var5.t + var5.r * var37 / var49;
               var41 = this.C + this.J * (float)var60 + var71 + this.A * (float)var21;
               var63 = var5.L + var5.w * var41 / var49;
            } else {
               var55 = this.f[var1][var2];
               int var56 = this.f[var1 + 1][var2];
               var57 = this.f[var1 + 1][var2 + 1];
               int var58 = this.f[var1][var2 + 1];
               var42 = this.N + this.p * (float)var60 + this.M * (float)var55 + this.F * (float)var20;
               var46 = this.x + this.v * (float)var60 + this.D * (float)var55 + this.q * (float)var20;
               if(var42 < -var46) {
                  return;
               }

               var43 = this.N + this.p * (float)var19 + this.M * (float)var56 + this.F * (float)var20;
               var47 = this.x + this.v * (float)var19 + this.D * (float)var56 + this.q * (float)var20;
               if(var43 < -var47) {
                  return;
               }

               var44 = this.N + this.p * (float)var19 + this.M * (float)var57 + this.F * (float)var21;
               var48 = this.x + this.v * (float)var19 + this.D * (float)var57 + this.q * (float)var21;
               if(var44 < -var48) {
                  return;
               }

               var45 = this.N + this.p * (float)var60 + this.M * (float)var58 + this.F * (float)var21;
               var49 = this.x + this.v * (float)var60 + this.D * (float)var58 + this.q * (float)var21;
               if(var45 < -var49) {
                  return;
               }

               var61 = var5.z + var5.k * var42 / var46;
               var31 = var5.z + var5.k * var43 / var47;
               var32 = var5.z + var5.k * var44 / var48;
               var33 = var5.z + var5.k * var45 / var49;
               if(var3) {
                  var54 = var42 - ((float[])((float[])var4[18]))[4];
                  int var59;
                  if(var54 > 0.0F) {
                     var54 /= ((float[])((float[])var4[18]))[8];
                     if(var54 > 1.0F) {
                        var54 = 1.0F;
                     }

                     var50 = var54;
                     var59 = (int)((float)var17.a * var54);
                     if(var59 > 0) {
                        var55 -= var59;
                     }
                  }

                  var54 = var43 - ((float[])((float[])var4[18]))[4];
                  if(var54 > 0.0F) {
                     var54 /= ((float[])((float[])var4[18]))[8];
                     if(var54 > 1.0F) {
                        var54 = 1.0F;
                     }

                     var51 = var54;
                     var59 = (int)((float)var17.j * var54);
                     if(var59 > 0) {
                        var56 -= var59;
                     }
                  }

                  var54 = var44 - ((float[])((float[])var4[18]))[4];
                  if(var54 > 0.0F) {
                     var54 /= ((float[])((float[])var4[18]))[8];
                     if(var54 > 1.0F) {
                        var54 = 1.0F;
                     }

                     var52 = var54;
                     var59 = (int)((float)var17.g * var54);
                     if(var59 > 0) {
                        var57 -= var59;
                     }
                  }

                  var54 = var45 - ((float[])((float[])var4[18]))[4];
                  if(var54 > 0.0F) {
                     var54 /= ((float[])((float[])var4[18]))[8];
                     if(var54 > 1.0F) {
                        var54 = 1.0F;
                     }

                     var53 = var54;
                     var59 = (int)((float)var17.h * var54);
                     if(var59 > 0) {
                        var58 -= var59;
                     }
                  }
               } else if(((boolean[])((boolean[])var4[2]))[0]) {
                  var54 = var42 - ((float[])((float[])var4[18]))[4];
                  if(var54 > 0.0F) {
                     var50 = var54 / ((float[])((float[])var4[18]))[8];
                     if(var50 > 1.0F) {
                        var50 = 1.0F;
                     }
                  }

                  var54 = var43 - ((float[])((float[])var4[18]))[4];
                  if(var54 > 0.0F) {
                     var51 = var54 / ((float[])((float[])var4[18]))[8];
                     if(var51 > 1.0F) {
                        var51 = 1.0F;
                     }
                  }

                  var54 = var44 - ((float[])((float[])var4[18]))[4];
                  if(var54 > 0.0F) {
                     var52 = var54 / ((float[])((float[])var4[18]))[8];
                     if(var52 > 1.0F) {
                        var52 = 1.0F;
                     }
                  }

                  var54 = var45 - ((float[])((float[])var4[18]))[4];
                  if(var54 > 0.0F) {
                     var53 = var54 / ((float[])((float[])var4[18]))[8];
                     if(var53 > 1.0F) {
                        var53 = 1.0F;
                     }
                  }
               }

               var34 = this.I + this.s * (float)var60 + this.z * (float)var55 + this.r * (float)var20;
               var22 = var5.t + var5.r * var34 / var46;
               var65 = this.C + this.J * (float)var60 + this.y * (float)var55 + this.A * (float)var20;
               var26 = var5.L + var5.w * var65 / var46;
               var35 = this.I + this.s * (float)var19 + this.z * (float)var56 + this.r * (float)var20;
               var23 = var5.t + var5.r * var35 / var47;
               var66 = this.C + this.J * (float)var19 + this.y * (float)var56 + this.A * (float)var20;
               var62 = var5.L + var5.w * var66 / var47;
               var36 = this.I + this.s * (float)var19 + this.z * (float)var57 + this.r * (float)var21;
               var24 = var5.t + var5.r * var36 / var48;
               var40 = this.C + this.J * (float)var19 + this.y * (float)var57 + this.A * (float)var21;
               var28 = var5.L + var5.w * var40 / var48;
               var37 = this.I + this.s * (float)var60 + this.z * (float)var58 + this.r * (float)var21;
               var25 = var5.t + var5.r * var37 / var49;
               var41 = this.C + this.J * (float)var60 + this.y * (float)var58 + this.A * (float)var21;
               var63 = var5.L + var5.w * var41 / var49;
            }

            boolean var10000;
            label398: {
               if(var17.f_i != -1) {
                  Object[] var12 = this.E;
                  if(this.a(((byte[])((byte[])((ta)(this.E == null?null:var12[6])).k.a(var17.f_i, (byte)127)[0]))[4])) {
                     var10000 = true;
                     break label398;
                  }
               }

               var10000 = false;
            }

            boolean var67 = var10000;
            var69 = var51 + var52 + var53;
            if((var24 - var25) * (var62 - var63) - (var28 - var63) * (var23 - var25) > 0.0F) {
               var5.c = var24 < 0.0F || var25 < 0.0F || var23 < 0.0F || var24 > (float)var5.K || var25 > (float)var5.K || var23 > (float)var5.K;
               if(var69 < 3.0F) {
                  if(var69 > 0.0F) {
                     if(var17.f_i >= 0) {
                        var57 = -16777216;
                        if(var67) {
                           var57 = -1694498816;
                        }

                        var5.g(var28, var63, var62, var24, var25, var23, var32, var33, var31, var48, var49, var47, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var57 | var17.d & 16777215, var57 | var17.f & 16777215, var57 | var17.e & 16777215, ((int[])((int[])var4[1]))[1], var52 * 255.0F, var53 * 255.0F, var51 * 255.0F, var17.f_i);
                     } else {
                        if(var67) {
                           var5.J = 100;
                        }

                        var5.d(var28, var63, var62, var24, var25, var23, var32, var33, var31, bca.b(var17.d, '\uff00', (int)(var52 * 255.0F) << 24 | ((int[])((int[])var4[1]))[1]), bca.b(var17.f, '\uff00', (int)(var53 * 255.0F) << 24 | ((int[])((int[])var4[1]))[1]), bca.b(var17.e, '\uff00', (int)(var51 * 255.0F) << 24 | ((int[])((int[])var4[1]))[1]));
                        var5.J = 0;
                     }
                  } else if(var17.f_i >= 0) {
                     var57 = -16777216;
                     if(var67) {
                        var57 = -1694498816;
                     }

                     var5.g(var28, var63, var62, var24, var25, var23, var32, var33, var31, var48, var49, var47, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, var57 | var17.d & 16777215, var57 | var17.f & 16777215, var57 | var17.e & 16777215, 0, 0.0F, 0.0F, 0.0F, var17.f_i);
                  } else {
                     if(var67) {
                        var5.J = 100;
                     }

                     var5.d(var28, var63, var62, var24, var25, var23, var32, var33, var31, var17.d, var17.f, var17.e);
                     var5.J = 0;
                  }
               } else {
                  var5.h(var28, var63, var62, var24, var25, var23, var32, var33, var31, ((int[])((int[])var4[1]))[1]);
               }
            }

            var69 = var50 + var51 + var53;
            if((var22 - var23) * (var63 - var62) - (var26 - var62) * (var25 - var23) > 0.0F) {
               var5.c = var22 < 0.0F || var23 < 0.0F || var25 < 0.0F || var22 > (float)var5.K || var23 > (float)var5.K || var25 > (float)var5.K;
               if(var69 < 3.0F) {
                  if(var67) {
                     var5.J = -1694498816;
                  }

                  if(var69 > 0.0F) {
                     if(var17.f_i >= 0) {
                        var57 = -16777216;
                        if(var67) {
                           var57 = -1694498816;
                        }

                        var5.g(var26, var62, var63, var22, var23, var25, var61, var31, var33, var46, var47, var49, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var57 | var17.b & 16777215, var57 | var17.e & 16777215, var57 | var17.f & 16777215, ((int[])((int[])var4[1]))[1], var50 * 255.0F, var51 * 255.0F, var53 * 255.0F, var17.f_i);
                     } else {
                        if(var67) {
                           var5.J = 100;
                        }

                        var5.d(var26, var62, var63, var22, var23, var25, var61, var31, var33, bca.b(var17.b, '\uff00', (int)(var50 * 255.0F) << 24 | ((int[])((int[])var4[1]))[1]), bca.b(var17.e, '\uff00', (int)(var51 * 255.0F) << 24 | ((int[])((int[])var4[1]))[1]), bca.b(var17.f, '\uff00', (int)(var53 * 255.0F) << 24 | ((int[])((int[])var4[1]))[1]));
                        var5.J = 0;
                     }
                  } else if(var17.f_i >= 0) {
                     var57 = -16777216;
                     if(var67) {
                        var57 = -1694498816;
                     }

                     var5.g(var26, var62, var63, var22, var23, var25, var61, var31, var33, var46, var47, var49, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, var57 | var17.b & 16777215, var57 | var17.e & 16777215, var57 | var17.f & 16777215, 0, 0.0F, 0.0F, 0.0F, var17.f_i);
                  } else {
                     if(var67) {
                        var5.J = 100;
                     }

                     var5.d(var26, var62, var63, var22, var23, var25, var61, var31, var33, var17.b, var17.e, var17.f);
                     var5.J = 0;
                  }
               } else {
                  var5.h(var26, var62, var63, var22, var23, var25, var61, var31, var33, ((int[])((int[])var4[1]))[1]);
               }
            }

         }
      } else {
         nw var18 = this.u[var1][var2];
         if(var18 != null) {
            if(var11 != 0) {
               if((var18.f & 4) != 0) {
                  if((var11 & 1) != 0) {
                     return;
                  }
               } else if((var11 & 2) != 0) {
                  return;
               }
            }

            int var27;
            int var29;
            for(var27 = 0; var27 < var18.k; ++var27) {
               var19 = var18.c[var27] + (var1 << this.a);
               var20 = var18.j[var27];
               var21 = var18.b[var27] + (var2 << this.a);
               var24 = this.N + this.p * (float)var19 + this.M * (float)var20 + this.F * (float)var21;
               var25 = this.x + this.v * (float)var19 + this.D * (float)var20 + this.q * (float)var21;
               if(var24 < -var25) {
                  return;
               }

               var26 = var5.z + var5.k * var24 / var25;
               var10[var27] = 0.0F;
               if(var3) {
                  var28 = var24 - ((float[])((float[])var4[18]))[4];
                  if(var28 > 0.0F) {
                     var28 /= ((float[])((float[])var4[18]))[8];
                     if(var28 > 1.0F) {
                        var28 = 1.0F;
                     }

                     var10[var27] = var28;
                     var29 = (int)((float)var18.g[var27] * var28);
                     if(var29 > 0) {
                        var20 -= var29;
                     }
                  }
               } else if(((boolean[])((boolean[])var4[2]))[0]) {
                  var28 = var24 - ((float[])((float[])var4[18]))[4];
                  if(var28 > 0.0F) {
                     var10[var27] = var28 / ((float[])((float[])var4[18]))[8];
                     if(var10[var27] > 1.0F) {
                        var10[var27] = 1.0F;
                     }
                  }
               }

               var22 = this.I + this.s * (float)var19 + this.z * (float)var20 + this.r * (float)var21;
               var23 = this.C + this.J * (float)var19 + this.y * (float)var20 + this.A * (float)var21;
               var6[var27] = var5.t + var5.r * var22 / var25;
               var7[var27] = var5.L + var5.w * var23 / var25;
               var8[var27] = var26;
               var9[var27] = var25;
            }

            int var30;
            int var64;
            if(var18.d != null) {
               for(var27 = 0; var27 < var18.f_i; ++var27) {
                  var64 = var27 * 3;
                  var29 = var64 + 1;
                  var30 = var29 + 1;
                  var31 = var6[var64];
                  var32 = var6[var29];
                  var33 = var6[var30];
                  var34 = var7[var64];
                  var35 = var7[var29];
                  var36 = var7[var30];
                  var37 = var10[var64] + var10[var29] + var10[var30];
                  if((var31 - var32) * (var36 - var35) - (var34 - var35) * (var33 - var32) > 0.0F) {
                     var5.c = var31 < 0.0F || var32 < 0.0F || var33 < 0.0F || var31 > (float)var5.K || var32 > (float)var5.K || var33 > (float)var5.K;
                     short var38 = var18.d[var27];
                     if(var37 < 3.0F) {
                        int var39;
                        if(var37 > 0.0F) {
                           if(var38 != -1) {
                              var39 = -16777216;
                              if(var38 != -1) {
                                 Object[] var13 = this.E;
                                 if(this.a(((byte[])((byte[])((ta)(this.E == null?null:var13[6])).k.a(var38, (byte)72)[0]))[4])) {
                                    var39 = -1694498816;
                                 }
                              }

                              var5.g(var34, var35, var36, var31, var32, var33, var8[var64], var8[var29], var8[var30], var9[var64], var9[var29], var9[var30], (float)var18.c[var64] / (float)this.g, (float)var18.c[var29] / (float)this.g, (float)var18.c[var30] / (float)this.g, (float)var18.b[var64] / (float)this.g, (float)var18.b[var29] / (float)this.g, (float)var18.b[var30] / (float)this.g, var39 | var18.h[var64] & 16777215, var39 | var18.h[var29] & 16777215, var39 | var18.h[var30] & 16777215, ((int[])((int[])var4[1]))[1], var10[var64] * 255.0F, var10[var29] * 255.0F, var10[var30] * 255.0F, var38);
                           } else if((var18.h[var64] & 16777215) != 0) {
                              if(var38 != -1) {
                                 Object[] var14 = this.E;
                                 if(this.a(((byte[])((byte[])((ta)(this.E == null?null:var14[6])).k.a(var38, (byte)85)[0]))[4])) {
                                    var5.J = -1694498816;
                                 }
                              }

                              var5.d(var34, var35, var36, var31, var32, var33, var8[var64], var8[var29], var8[var30], bca.b(var18.h[var64], '\uff00', (int)(var10[var64] * 255.0F) << 24 | ((int[])((int[])var4[1]))[1]), bca.b(var18.h[var29], '\uff00', (int)(var10[var29] * 255.0F) << 24 | ((int[])((int[])var4[1]))[1]), bca.b(var18.h[var30], '\uff00', (int)(var10[var30] * 255.0F) << 24 | ((int[])((int[])var4[1]))[1]));
                              var5.J = 0;
                           }
                        } else if(var38 != -1) {
                           var39 = -16777216;
                           if(var38 != -1) {
                              Object[] var15 = this.E;
                              if(this.a(((byte[])((byte[])((ta)(this.E == null?null:var15[6])).k.a(var38, (byte)97)[0]))[4])) {
                                 var39 = -1694498816;
                              }
                           }

                           var5.g(var34, var35, var36, var31, var32, var33, var8[var64], var8[var29], var8[var30], var9[var64], var9[var29], var9[var30], (float)var18.c[var64] / (float)this.g, (float)var18.c[var29] / (float)this.g, (float)var18.c[var30] / (float)this.g, (float)var18.b[var64] / (float)this.g, (float)var18.b[var29] / (float)this.g, (float)var18.b[var30] / (float)this.g, var39 | var18.h[var64] & 16777215, var39 | var18.h[var29] & 16777215, var39 | var18.h[var30] & 16777215, 0, 0.0F, 0.0F, 0.0F, var38);
                        } else if((var18.h[var64] & 16777215) != 0) {
                           if(var38 != -1) {
                              Object[] var16 = this.E;
                              if(this.a(((byte[])((byte[])((ta)(this.E == null?null:var16[6])).k.a(var38, (byte)101)[0]))[4])) {
                                 var5.J = -1694498816;
                              }
                           }

                           var5.d(var34, var35, var36, var31, var32, var33, var8[var64], var8[var29], var8[var30], var18.h[var64], var18.h[var29], var18.h[var30]);
                           var5.J = 0;
                        }
                     } else {
                        var5.h(var34, var35, var36, var31, var32, var33, var8[var64], var8[var29], var8[var30], ((int[])((int[])var4[1]))[1]);
                     }
                  }
               }
            } else {
               for(var27 = 0; var27 < var18.f_i; ++var27) {
                  var64 = var27 * 3;
                  var29 = var64 + 1;
                  var30 = var29 + 1;
                  var31 = var6[var64];
                  var32 = var6[var29];
                  var33 = var6[var30];
                  var34 = var7[var64];
                  var35 = var7[var29];
                  var36 = var7[var30];
                  var37 = var10[var64] + var10[var29] + var10[var30];
                  if((var31 - var32) * (var36 - var35) - (var34 - var35) * (var33 - var32) > 0.0F) {
                     var5.c = var31 < 0.0F || var32 < 0.0F || var33 < 0.0F || var31 > (float)var5.K || var32 > (float)var5.K || var33 > (float)var5.K;
                     if(var37 < 3.0F) {
                        if(var37 > 0.0F) {
                           if((var18.h[var64] & 16777215) != 0) {
                              var5.d(var34, var35, var36, var31, var32, var33, var8[var64], var8[var29], var8[var30], ms.a(((int[])((int[])var4[1]))[1], 63, var10[var64] * 255.0F, var18.h[var64]), ms.a(((int[])((int[])var4[1]))[1], 79, var10[var29] * 255.0F, var18.h[var29]), ms.a(((int[])((int[])var4[1]))[1], 112, var10[var30] * 255.0F, var18.h[var30]));
                           }
                        } else if((var18.h[var64] & 16777215) != 0) {
                           var5.d(var34, var35, var36, var31, var32, var33, var8[var64], var8[var29], var8[var30], var18.h[var64], var18.h[var29], var18.h[var30]);
                        }
                     } else {
                        var5.h(var34, var35, var36, var31, var32, var33, var8[var64], var8[var29], var8[var30], ((int[])((int[])var4[1]))[1]);
                     }
                  }
               }
            }
         }

      }
   }

   final void a(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6) {
      if(this.E[7] != null && this.E[12] != null) {
         Object[] var7 = (Object[])((Object[])this.E[11]);
         this.s = ((float[])((float[])var7[0]))[0];
         this.J = ((float[])((float[])var7[0]))[1];
         this.p = ((float[])((float[])var7[0]))[2];
         this.v = ((float[])((float[])var7[0]))[3];
         this.z = ((float[])((float[])var7[0]))[4];
         this.y = ((float[])((float[])var7[0]))[5];
         this.M = ((float[])((float[])var7[0]))[6];
         this.D = ((float[])((float[])var7[0]))[7];
         this.r = ((float[])((float[])var7[0]))[8];
         this.A = ((float[])((float[])var7[0]))[9];
         this.F = ((float[])((float[])var7[0]))[10];
         this.q = ((float[])((float[])var7[0]))[11];
         this.I = ((float[])((float[])var7[0]))[12];
         this.C = ((float[])((float[])var7[0]))[13];
         this.N = ((float[])((float[])var7[0]))[14];
         this.x = ((float[])((float[])var7[0]))[15];

         for(int var8 = 0; var8 < var3 + var3; ++var8) {
            for(int var9 = 0; var9 < var3 + var3; ++var9) {
               if(var4[var8][var9]) {
                  int var10 = var1 - var3 + var8;
                  int var11 = var2 - var3 + var9;
                  if(var10 >= 0 && var10 < this.f_i && var11 >= 0 && var11 < this.h) {
                     this.c(var10, var11, var6);
                  }
               }
            }
         }

      } else {
         throw new IllegalStateException("");
      }
   }

   final void DA(int var1, int var2, int var3) {
      if(this.L[var1][var2] < var3) {
         this.L[var1][var2] = (byte)var3;
      }

   }

   private final void b(int var1, int var2, boolean var3, Object[] var4, uo var5, float[] var6, float[] var7, float[] var8, float[] var9, float[] var10, int var11) {
      tc var12 = this.G[var1][var2];
      if(var11 == 0 || (var11 & 2) == 0) {
         if(var12 != null) {
            int var22;
            for(int var20 = 0; var20 < var12.b; ++var20) {
               int var13 = var12.f_i[var20] + (var1 << this.a);
               int var14 = var12.c[var20];
               int var15 = var12.g[var20] + (var2 << this.a);
               float var18 = this.N + this.p * (float)var13 + this.M * (float)var14 + this.F * (float)var15;
               float var19 = this.x + this.v * (float)var13 + this.D * (float)var14 + this.q * (float)var15;
               if(var18 < -var19) {
                  return;
               }

               var10[var20] = 0.0F;
               float var21;
               if(var3) {
                  var21 = var18 - ((float[])((float[])var4[18]))[4];
                  if(var21 > 0.0F) {
                     var21 /= ((float[])((float[])var4[18]))[8];
                     if(var21 > 1.0F) {
                        var21 = 1.0F;
                     }

                     var10[var20] = var21;
                     var22 = (int)((float)var12.d[var20] * var21);
                     if(var22 > 0) {
                        var14 -= var22;
                     }
                  }
               } else if(((boolean[])((boolean[])var4[2]))[0]) {
                  var21 = var18 - ((float[])((float[])var4[18]))[4];
                  if(var21 > 0.0F) {
                     var10[var20] = var21 / ((float[])((float[])var4[18]))[8];
                     if(var10[var20] > 1.0F) {
                        var10[var20] = 1.0F;
                     }
                  }
               }

               float var16 = this.I + this.s * (float)var13 + this.z * (float)var14 + this.r * (float)var15;
               float var17 = this.C + this.J * (float)var13 + this.y * (float)var14 + this.A * (float)var15;
               var6[var20] = var5.t + var5.r * var16 / var19;
               var7[var20] = var5.L + var5.w * var17 / var19;
               var8[var20] = var5.z + var5.k * var18 / var19;
               var9[var20] = var19;
            }

            float var33 = (float)this.g;

            for(int var34 = 0; var34 < var12.a; ++var34) {
               var22 = var34 * 3;
               int var23 = var22 + 1;
               int var24 = var23 + 1;
               float var25 = var6[var22];
               float var26 = var6[var23];
               float var27 = var6[var24];
               float var28 = var7[var22];
               float var29 = var7[var23];
               float var30 = var7[var24];
               if((var25 - var26) * (var30 - var29) - (var28 - var29) * (var27 - var26) > 0.0F) {
                  var5.c = var25 < 0.0F || var26 < 0.0F || var27 < 0.0F || var25 > (float)var5.K || var26 > (float)var5.K || var27 > (float)var5.K;
                  if(var10[var22] + var10[var23] + var10[var24] < 3.0F) {
                     int var31 = var1 << this.a;
                     int var32 = var2 << this.a;
                     if((var12.k[var22] & 16777215) != 0) {
                        if(var12.f[var22] == var12.f[var23] && var12.f[var22] == var12.f[var24] && var12.h[var22] == var12.h[var23] && var12.h[var22] == var12.h[var24]) {
                           var5.g(var28, var29, var30, var25, var26, var27, var8[var22], var8[var23], var8[var24], var9[var22], var9[var23], var9[var24], (float)(var31 + var12.f_i[var22]) / (float)var12.h[var22], (float)(var31 + var12.f_i[var23]) / (float)var12.h[var23], (float)(var31 + var12.f_i[var24]) / (float)var12.h[var24], (float)(var32 + var12.g[var22]) / (float)var12.h[var22], (float)(var32 + var12.g[var23]) / (float)var12.h[var23], (float)(var32 + var12.g[var24]) / (float)var12.h[var24], var12.k[var22], var12.k[var23], var12.k[var24], ((int[])((int[])var4[1]))[1], var10[var22] * 255.0F, var10[var23] * 255.0F, var10[var24] * 255.0F, var12.f[var22]);
                        } else {
                           var5.a(var28, var29, var30, var25, var26, var27, var8[var22], var8[var23], var8[var24], var9[var22], var9[var23], var9[var24], (float)(var31 + var12.f_i[var22]) / var33, (float)(var31 + var12.f_i[var23]) / var33, (float)(var31 + var12.f_i[var24]) / var33, (float)(var32 + var12.g[var22]) / var33, (float)(var32 + var12.g[var23]) / var33, (float)(var32 + var12.g[var24]) / var33, var12.k[var22], var12.k[var23], var12.k[var24], ((int[])((int[])var4[1]))[1], var10[var22] * 255.0F, var10[var23] * 255.0F, var10[var24] * 255.0F, var12.f[var22], var33 / (float)var12.h[var22], var12.f[var23], var33 / (float)var12.h[var23], var12.f[var24], var33 / (float)var12.h[var24]);
                        }
                     }
                  } else {
                     var5.h(var28, var29, var30, var25, var26, var27, var8[var22], var8[var23], var8[var24], ((int[])((int[])var4[1]))[1]);
                  }
               }
            }
         }

      }
   }

   final ya h(int var1, int var2, ya var3) {
      return null;
   }
}
