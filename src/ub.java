
final class ub extends vsa {

   private short E;
   private int D;
   private int G;
   private short J;
   private short I;
   Object[] F;
   private short L;
   private short H;
   private short K;


   final void b() {
      ((ch)this.F[4]).j[this.I] = null;
      mba.e[bga.f_i] = this;
      bga.f_i = bga.f_i + 1 & 1023;
      this.a(1);
      this.a((byte)-98);
   }

   final void a(long var1, int var3) {
      this.J = (short)(this.J - var3);
      if(this.J <= 0) {
         this.b();
      } else {
         int var10 = this.B >> 12;
         int var11 = this.z >> 12;
         int var12 = this.v >> 12;
         ch var13 = (ch)this.F[4];
         Object[] var14 = (Object[])((Object[])this.F[6]);
         if(((int[])((int[])var14[1]))[30] != 0) {
            int var15;
            if(this.E - this.J <= ((int[])((int[])var14[1]))[10]) {
               var15 = (this.A >> 8 & '\uff00') + (this.G >> 16 & 255) + ((int[])((int[])var14[1]))[9] * var3;
               int var16 = (this.A & '\uff00') + (this.G >> 8 & 255) + ((int[])((int[])var14[1]))[31] * var3;
               int var17 = (this.A << 8 & '\uff00') + (this.G & 255) + ((int[])((int[])var14[1]))[7] * var3;
               if(var15 < 0) {
                  var15 = 0;
               } else if(var15 > '\uffff') {
                  var15 = '\uffff';
               }

               if(var16 < 0) {
                  var16 = 0;
               } else if(var16 > '\uffff') {
                  var16 = '\uffff';
               }

               if(var17 < 0) {
                  var17 = 0;
               } else if(var17 > '\uffff') {
                  var17 = '\uffff';
               }

               this.A &= -16777216;
               this.A |= ((var15 & '\uff00') << 8) + (var16 & '\uff00') + ((var17 & '\uff00') >> 8);
               this.G &= -16777216;
               this.G |= ((var15 & 255) << 16) + ((var16 & 255) << 8) + (var17 & 255);
            }

            if(this.E - this.J <= ((int[])((int[])var14[1]))[13]) {
               var15 = (this.A >> 16 & '\uff00') + (this.G >> 24 & 255) + ((int[])((int[])var14[1]))[48] * var3;
               if(var15 < 0) {
                  var15 = 0;
               } else if(var15 > '\uffff') {
                  var15 = '\uffff';
               }

               this.A &= 16777215;
               this.A |= (var15 & '\uff00') << 16;
               this.G &= 16777215;
               this.G |= (var15 & 255) << 24;
            }
         }

         if(((int[])((int[])var14[1]))[46] != -1 && this.E - this.J <= ((int[])((int[])var14[1]))[34]) {
            this.D += ((int[])((int[])var14[1]))[24] * var3;
         }

         if(((int[])((int[])var14[1]))[4] != -1 && this.E - this.J <= ((int[])((int[])var14[1]))[29]) {
            this.C += ((int[])((int[])var14[1]))[35] * var3;
         }

         double var49 = (double)this.H;
         double var50 = (double)this.K;
         double var19 = (double)this.L;
         boolean var21 = false;
         int var23;
         int var22;
         int var25;
         int var24;
         long var26;
         if(((int[])((int[])var14[1]))[42] == 1) {
            var22 = var10 - ((int[])((int[])((Object[])((Object[])this.F[0]))[0]))[4];
            var23 = var11 - ((int[])((int[])((Object[])((Object[])this.F[0]))[0]))[1];
            var24 = var12 - ((int[])((int[])((Object[])((Object[])this.F[0]))[0]))[0];
            var25 = (int)Math.sqrt((double)(var22 * var22 + var23 * var23 + var24 * var24)) >> 2;
            var26 = (long)(((int[])((int[])var14[1]))[12] * var25 * var3);
            this.D = (int)((long)this.D - ((long)this.D * var26 >> 18));
         } else if(((int[])((int[])var14[1]))[42] == 2) {
            var22 = var10 - ((int[])((int[])((Object[])((Object[])this.F[0]))[0]))[4];
            var23 = var11 - ((int[])((int[])((Object[])((Object[])this.F[0]))[0]))[1];
            var24 = var12 - ((int[])((int[])((Object[])((Object[])this.F[0]))[0]))[0];
            var25 = var22 * var22 + var23 * var23 + var24 * var24;
            var26 = (long)(((int[])((int[])var14[1]))[12] * var25 * var3);
            this.D = (int)((long)this.D - ((long)this.D * var26 >> 28));
         }

         double var29;
         double var31;
         double var35;
         double var33;
         double var39;
         double var37;
         double var43;
         double var41;
         double var45;
         Object[] var57;
         if(var14[6] != null) {
            lm var51 = (lm)var13.q[0];

            for(lm var55 = var51.f; var55 != var51; var55 = var55.f) {
               qsa var4;
               var57 = (var4 = (qsa)var55) == null?null:var4.t;
               Object[] var53 = (Object[])((Object[])var57[4]);
               if(((int[])((int[])var53[1]))[3] != 1) {
                  boolean var62 = false;

                  for(int var27 = 0; var27 < ((int[])((int[])var14[6])).length; ++var27) {
                     if(((int[])((int[])var14[6]))[var27] == ((int[])((int[])var53[1]))[11]) {
                        var62 = true;
                        break;
                     }
                  }

                  if(var62) {
                     double var59 = (double)(var10 - ((int[])((int[])var57[1]))[1]);
                     var29 = (double)(var11 - ((int[])((int[])var57[1]))[2]);
                     var31 = (double)(var12 - ((int[])((int[])var57[1]))[0]);
                     var33 = var59 * var59 + var29 * var29 + var31 * var31;
                     if(var33 <= (double)((long[])((long[])var53[2]))[0]) {
                        var35 = Math.sqrt(var33);
                        if(var35 == 0.0D) {
                           var35 = 1.0D;
                        }

                        var37 = (var59 * (double)((float[])((float[])var57[3]))[0] + var29 * (double)((int[])((int[])var53[1]))[8] + var31 * (double)((float[])((float[])var57[3]))[1]) * 65535.0D / ((double)((int[])((int[])var53[1]))[0] * var35);
                        if(var37 >= (double)((int[])((int[])var53[1]))[1]) {
                           var39 = 0.0D;
                           if(((int[])((int[])var53[1]))[5] == 1) {
                              var39 = var35 / 16.0D * (double)((int[])((int[])var53[1]))[7];
                           } else if(((int[])((int[])var53[1]))[5] == 2) {
                              var39 = var35 / 16.0D * (var35 / 16.0D) * (double)((int[])((int[])var53[1]))[7];
                           }

                           if(((int[])((int[])var53[1]))[9] == 0) {
                              if(((int[])((int[])var53[1]))[2] == 0) {
                                 var49 += ((double)((float[])((float[])var57[3]))[0] - var39) * (double)var3;
                                 var50 += ((double)((int[])((int[])var53[1]))[8] - var39) * (double)var3;
                                 var19 += ((double)((float[])((float[])var57[3]))[1] - var39) * (double)var3;
                                 var21 = true;
                              } else {
                                 this.B = (int)((double)this.B + ((double)((float[])((float[])var57[3]))[0] - var39) * (double)var3);
                                 this.z = (int)((double)this.z + ((double)((int[])((int[])var53[1]))[8] - var39) * (double)var3);
                                 this.v = (int)((double)this.v + ((double)((float[])((float[])var57[3]))[1] - var39) * (double)var3);
                              }
                           } else {
                              var41 = var59 / var35 * (double)((int[])((int[])var53[1]))[0];
                              var43 = var29 / var35 * (double)((int[])((int[])var53[1]))[0];
                              var45 = var31 / var35 * (double)((int[])((int[])var53[1]))[0];
                              if(((int[])((int[])var53[1]))[2] == 0) {
                                 var49 += var41 * (double)var3;
                                 var50 += var43 * (double)var3;
                                 var19 += var45 * (double)var3;
                                 var21 = true;
                              } else {
                                 this.B = (int)((double)this.B + var41 * (double)var3);
                                 this.z = (int)((double)this.z + var43 * (double)var3);
                                 this.v = (int)((double)this.v + var45 * (double)var3);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if(var14[5] != null) {
            for(var22 = 0; var22 < ((int[])((int[])var14[5])).length; ++var22) {
               var57 = eia.c;
               long var54 = (long)((int[])((int[])var14[5]))[var22];
               ((long[])((long[])var57[0]))[0] = var54;
               tha var58 = ((tha[])((tha[])var57[2]))[(int)((long)(((int[])((int[])var57[1]))[0] - 1) & var54)];
               var57[3] = var58.s;

               tha var56;
               while(true) {
                  if(var57[3] != var58) {
                     if(~var54 != ~((tha)var57[3]).m) {
                        var57[3] = ((tha)var57[3]).s;
                        continue;
                     }

                     tha var28 = (tha)var57[3];
                     var57[3] = ((tha)var57[3]).s;
                     var56 = var28;
                     break;
                  }

                  var56 = null;
                  var57[3] = null;
                  break;
               }

               qsa var5;
               Object[] var61 = (var5 = (qsa)var56) == null?null:var5.t;

               while(var61 != null) {
                  Object[] var60 = (Object[])((Object[])var61[4]);
                  var29 = (double)(var10 - ((int[])((int[])var61[1]))[1]);
                  var31 = (double)(var11 - ((int[])((int[])var61[1]))[2]);
                  var33 = (double)(var12 - ((int[])((int[])var61[1]))[0]);
                  var35 = var29 * var29 + var31 * var31 + var33 * var33;
                  if(var35 > (double)((long[])((long[])var60[2]))[0]) {
                     qsa var6;
                     var61 = (var6 = (qsa)gna.b((byte)118, eia.c)) == null?null:var6.t;
                  } else {
                     var37 = Math.sqrt(var35);
                     if(var37 == 0.0D) {
                        var37 = 1.0D;
                     }

                     var39 = (var29 * (double)((float[])((float[])var61[3]))[0] + var31 * (double)((int[])((int[])var60[1]))[8] + var33 * (double)((float[])((float[])var61[3]))[1]) * 65535.0D / ((double)((int[])((int[])var60[1]))[0] * var37);
                     if(var39 < (double)((int[])((int[])var60[1]))[1]) {
                        qsa var7;
                        var61 = (var7 = (qsa)gna.b((byte)92, eia.c)) == null?null:var7.t;
                     } else {
                        var41 = 0.0D;
                        if(((int[])((int[])var60[1]))[5] == 1) {
                           var41 = var37 / 16.0D * (double)((int[])((int[])var60[1]))[7];
                        } else if(((int[])((int[])var60[1]))[5] == 2) {
                           var41 = var37 / 16.0D * (var37 / 16.0D) * (double)((int[])((int[])var60[1]))[7];
                        }

                        if(((int[])((int[])var60[1]))[9] == 0) {
                           if(((int[])((int[])var60[1]))[2] == 0) {
                              var49 += ((double)((float[])((float[])var61[3]))[0] - var41) * (double)var3;
                              var50 += ((double)((int[])((int[])var60[1]))[8] - var41) * (double)var3;
                              var19 += ((double)((float[])((float[])var61[3]))[1] - var41) * (double)var3;
                              var21 = true;
                           } else {
                              this.B = (int)((double)this.B + ((double)((float[])((float[])var61[3]))[0] - var41) * (double)var3);
                              this.z = (int)((double)this.z + ((double)((int[])((int[])var60[1]))[8] - var41) * (double)var3);
                              this.v = (int)((double)this.v + ((double)((float[])((float[])var61[3]))[1] - var41) * (double)var3);
                           }
                        } else {
                           var43 = var29 / var37 * (double)((int[])((int[])var60[1]))[0];
                           var45 = var31 / var37 * (double)((int[])((int[])var60[1]))[0];
                           double var47 = var33 / var37 * (double)((int[])((int[])var60[1]))[0];
                           if(((int[])((int[])var60[1]))[2] == 0) {
                              var49 += var43 * (double)var3;
                              var50 += var45 * (double)var3;
                              var19 += var47 * (double)var3;
                              var21 = true;
                           } else {
                              this.B = (int)((double)this.B + var43 * (double)var3);
                              this.z = (int)((double)this.z + var45 * (double)var3);
                              this.v = (int)((double)this.v + var47 * (double)var3);
                           }
                        }

                        qsa var8;
                        var61 = (var8 = (qsa)gna.b((byte)25, eia.c)) == null?null:var8.t;
                     }
                  }
               }
            }
         }

         if(var14[3] != null) {
            if(var14[2] == null) {
               var14[2] = new int[((int[])((int[])var14[3])).length];

               for(var22 = 0; var22 < ((int[])((int[])var14[3])).length; ++var22) {
                  cc.a(((int[])((int[])var14[3]))[var22], true);
                  ma var9;
                  ((int[])((int[])var14[2]))[var22] = ((int[])((int[])((var9 = (ma)pm.a((long)((int[])((int[])var14[3]))[var22], dna.f, false)) == null?null:var9.s)[1]))[0];
               }
            }

            for(var22 = 0; var22 < ((int[])((int[])var14[2])).length; ++var22) {
               Object[] var52 = fw.e[((int[])((int[])var14[2]))[var22]];
               if(((int[])((int[])var52[1]))[2] == 0) {
                  var49 += (double)(((int[])((int[])var52[1]))[6] * var3);
                  var50 += (double)(((int[])((int[])var52[1]))[8] * var3);
                  var19 += (double)(((int[])((int[])var52[1]))[10] * var3);
                  var21 = true;
               } else {
                  this.B += ((int[])((int[])var52[1]))[6] * var3;
                  this.z += ((int[])((int[])var52[1]))[8] * var3;
                  this.v += ((int[])((int[])var52[1]))[10] * var3;
               }
            }
         }

         if(var21) {
            while(var49 > 32767.0D || var50 > 32767.0D || var19 > 32767.0D || var49 < -32767.0D || var50 < -32767.0D || var19 < -32767.0D) {
               var49 /= 2.0D;
               var50 /= 2.0D;
               var19 /= 2.0D;
               this.D <<= 1;
            }

            this.H = (short)((int)var49);
            this.K = (short)((int)var50);
            this.L = (short)((int)var19);
         }

         this.B = (int)((long)this.B + ((long)this.H * (long)(this.D << 2) >> 23) * (long)var3);
         this.z = (int)((long)this.z + ((long)this.K * (long)(this.D << 2) >> 23) * (long)var3);
         this.v = (int)((long)this.v + ((long)this.L * (long)(this.D << 2) >> 23) * (long)var3);
      }
   }

   final void a(Object[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13, boolean var14) {
      this.F = var1;
      this.B = var2 << 12;
      this.z = var3 << 12;
      this.v = var4 << 12;
      this.A = var10;
      this.E = this.J = (short)var9;
      this.C = var11;
      this.x = var12;
      this.y = var14;
      this.H = (short)var5;
      this.K = (short)var6;
      this.L = (short)var7;
      this.D = var8;
      this.w = ((byte[])((byte[])((Object[])((Object[])this.F[2]))[0]))[0];
      this.a();
   }

   final void a(ta var1, long var2) {
      int var4 = this.B >> 12 + qqa.e;
      int var5 = this.v >> 12 + qqa.e;
      int var6 = this.z >> 12;
      if(var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < eja.c && var5 >= 0 && var5 < me.c) {
         ch var7 = (ch)this.F[4];
         Object[] var8 = (Object[])((Object[])this.F[6]);
         aa[] var9 = jp.o;
         int var10 = var7.w;
         Object[] var11 = ju.g[var7.w][var4][var5];
         if(var11 != null) {
            var10 = ((byte[])((byte[])var11[5]))[0];
         }

         int var12 = var9[var10].b(-87, var5, var4);
         int var13;
         if(var10 < ri.n - 1) {
            var13 = var9[var10 + 1].b(-127, var5, var4);
         } else {
            var13 = var12 - (8 << qqa.e);
         }

         if(((boolean[])((boolean[])var8[0]))[1]) {
            if(((int[])((int[])var8[1]))[0] == -1 && var6 > var12) {
               this.b();
               return;
            }

            if(((int[])((int[])var8[1]))[0] >= 0 && var6 > var9[((int[])((int[])var8[1]))[0]].b(-31, var5, var4)) {
               this.b();
               return;
            }

            if(((int[])((int[])var8[1]))[44] == -1 && var6 < var13) {
               this.b();
               return;
            }

            if(((int[])((int[])var8[1]))[44] >= 0 && var6 < var9[((int[])((int[])var8[1]))[44] + 1].b(-125, var5, var4)) {
               this.b();
               return;
            }
         }

         int var14;
         for(var14 = ri.n - 1; var14 > 0 && var6 > var9[var14].b(-68, var5, var4); --var14) {
            ;
         }

         if(((boolean[])((boolean[])var8[0]))[6] && var14 == 0 && var6 > var9[0].b(-87, var5, var4)) {
            this.b();
         } else if(var14 == ri.n - 1 && var9[var14].b(-39, var5, var4) - var6 > 8 << qqa.e) {
            this.b();
         } else {
            var11 = ju.g[var14][var4][var5];
            int var16;
            if(var11 == null) {
               if(var14 == 0 || ju.g[0][var4][var5] == null) {
                  var11 = ju.g[0][var4][var5] = jg.a(-45, 0, new Object[10]);
               }

               boolean var15 = ju.g[0][var4][var5][9] != null;
               if(var14 == 3 && var15) {
                  this.b();
                  return;
               }

               for(var16 = 1; var16 <= var14; ++var16) {
                  if(ju.g[var16][var4][var5] == null) {
                     var11 = ju.g[var16][var4][var5] = jg.a(-90, var16, new Object[10]);
                     if(var15) {
                        ++((byte[])((byte[])var11[5]))[0];
                     }
                  }
               }
            }

            if(((boolean[])((boolean[])var8[0]))[0]) {
               int var19 = this.B >> 12;
               var16 = this.v >> 12;
               Object[] var17;
               if(var11[4] != null) {
                  var17 = es.a((Object[])((Object[])var11[4]), (byte)-13, var1);
                  if(var17 != null && ep.a(var19, (byte)-125, var17, var16, var6)) {
                     this.b();
                     return;
                  }
               }

               if(var11[2] != null) {
                  var17 = es.a((Object[])((Object[])var11[2]), (byte)-13, var1);
                  if(var17 != null && ep.a(var19, (byte)-119, var17, var16, var6)) {
                     this.b();
                     return;
                  }
               }

               if(var11[6] != null) {
                  var17 = es.a((Object[])((Object[])var11[6]), (byte)-13, var1);
                  if(var17 != null && ep.a(var19, (byte)-90, var17, var16, var6)) {
                     this.b();
                     return;
                  }
               }

               for(var17 = (Object[])((Object[])var11[3]); var17 != null; var17 = (Object[])((Object[])var17[0])) {
                  Object[] var18 = es.a((Object[])((Object[])var17[1]), (byte)-13, var1);
                  if(var18 != null && ep.a(var19, (byte)-74, var18, var16, var6)) {
                     this.b();
                     return;
                  }
               }
            }

            uua.a((va)this, (Object[])((Object[])var7.f_l[0]), (byte)111);
         }
      } else {
         this.b();
      }
   }

   private final void a() {
      int var1 = ((ch)this.F[4]).s;
      if(((ch)this.F[4]).j[var1] != null) {
         ((ch)this.F[4]).j[var1].b();
      }

      ((ch)this.F[4]).j[var1] = this;
      this.I = (short)((ch)this.F[4]).s;
      ((ch)this.F[4]).s = var1 + 1 & 8191;
      gt.a((Object[])((Object[])this.F[5]), -122, this);
   }

   ub(Object[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13, boolean var14) {
      this.F = var1;
      this.B = var2 << 12;
      this.z = var3 << 12;
      this.v = var4 << 12;
      this.A = var10;
      this.E = this.J = (short)var9;
      this.C = var11;
      this.x = var12;
      this.y = var14;
      this.H = (short)var5;
      this.K = (short)var6;
      this.L = (short)var7;
      this.D = var8;
      this.w = ((byte[])((byte[])((Object[])((Object[])this.F[2]))[0]))[0];
      this.a();
   }
}
