
final class hra extends ap {

   private int[] E;


   final void a(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      if(var4 > 0 && var5 > 0) {
         int var11 = 0;
         int var12 = 0;
         int var13 = this.z + this.D + this.v;
         int var14 = this.j + this.u + this.a;
         int var15 = (var13 << 16) / var4;
         int var16 = (var14 << 16) / var5;
         int var17;
         if(this.z > 0) {
            var17 = ((this.z << 16) + var15 - 1) / var15;
            var1 += var17;
            var11 += var17 * var15 - (this.z << 16);
         }

         if(this.j > 0) {
            var17 = ((this.j << 16) + var16 - 1) / var16;
            var2 += var17;
            var12 += var17 * var16 - (this.j << 16);
         }

         if(this.D < var13) {
            var4 = ((this.D << 16) - var11 + var15 - 1) / var15;
         }

         if(this.u < var14) {
            var5 = ((this.u << 16) - var12 + var16 - 1) / var16;
         }

         var17 = var1 + var2 * ((int[])((int[])this.C[1]))[4];
         int var18 = ((int[])((int[])this.C[1]))[4] - var4;
         if(var2 + var5 > ((int[])((int[])this.C[1]))[1]) {
            var5 -= var2 + var5 - ((int[])((int[])this.C[1]))[1];
         }

         int var19;
         if(var2 < ((int[])((int[])this.C[1]))[16]) {
            var19 = ((int[])((int[])this.C[1]))[16] - var2;
            var5 -= var19;
            var17 += var19 * ((int[])((int[])this.C[1]))[4];
            var12 += var16 * var19;
         }

         if(var1 + var4 > ((int[])((int[])this.C[1]))[19]) {
            var19 = var1 + var4 - ((int[])((int[])this.C[1]))[19];
            var4 -= var19;
            var18 += var19;
         }

         if(var1 < ((int[])((int[])this.C[1]))[7]) {
            var19 = ((int[])((int[])this.C[1]))[7] - var1;
            var4 -= var19;
            var17 += var19;
            var11 += var15 * var19;
            var18 += var19;
         }

         float[] var29 = (float[])((float[])this.C[12]);
         int var21;
         int var20;
         int var23;
         int var22;
         int var25;
         int var24;
         int var26;
         if(var8 == 0) {
            if(var6 == 1) {
               var20 = var11;

               for(var21 = -var5; var21 < 0; ++var21) {
                  for(var22 = -var4; var22 < 0; ++var22) {
                     if(var3 < var29[var17] && var10) {
                        var29[var17] = var3;
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var20;
                  var17 += var18;
               }
            } else if(var6 == 0) {
               var20 = var11;

               for(var21 = -var5; var21 < 0; ++var21) {
                  for(var22 = -var4; var22 < 0; ++var22) {
                     if(var3 < var29[var17] && var10) {
                        var29[var17] = var3;
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var20;
                  var17 += var18;
               }
            } else if(var6 == 3) {
               var20 = var11;

               for(var21 = -var5; var21 < 0; ++var21) {
                  for(var22 = -var4; var22 < 0; ++var22) {
                     if(var3 < var29[var17] && var10) {
                        var29[var17] = var3;
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var20;
                  var17 += var18;
               }
            } else {
               if(var6 != 2) {
                  throw new IllegalArgumentException();
               }

               var20 = var7 >>> 24;
               var21 = 256 - var20;
               var22 = (var7 & 16711935) * var21 & -16711936;
               var23 = (var7 & '\uff00') * var21 & 16711680;
               var7 = (var22 | var23) >>> 8;
               var24 = var11;

               for(var25 = -var5; var25 < 0; ++var25) {
                  for(var26 = -var4; var26 < 0; ++var26) {
                     if(var3 < var29[var17] && var10) {
                        var29[var17] = var3;
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var24;
                  var17 += var18;
               }
            }
         } else {
            int var27;
            int var28;
            if(var8 == 1) {
               if(var6 == 1) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     var22 = (var12 >> 16) * this.D;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        if(var3 < var29[var17]) {
                           var24 = this.E[(var11 >> 16) + var22];
                           if(var24 != 0 && var10) {
                              var29[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else if(var6 == 0) {
                  var20 = var11;
                  if((var7 & 16777215) == 16777215) {
                     for(var21 = -var5; var21 < 0; ++var21) {
                        var22 = (var12 >> 16) * this.D;

                        for(var23 = -var4; var23 < 0; ++var23) {
                           if(var3 < var29[var17]) {
                              var24 = this.E[(var11 >> 16) + var22];
                              if(var24 != 0 && var10) {
                                 var29[var17] = var3;
                              }
                           }

                           var11 += var15;
                           ++var17;
                        }

                        var12 += var16;
                        var11 = var20;
                        var17 += var18;
                     }
                  } else {
                     var21 = var7 >>> 24;

                     for(var22 = -var5; var22 < 0; ++var22) {
                        var23 = (var12 >> 16) * this.D;

                        for(var24 = -var4; var24 < 0; ++var24) {
                           if(var3 < var29[var17]) {
                              var25 = this.E[(var11 >> 16) + var23];
                              if(var25 != 0) {
                                 if(var21 != 255) {
                                    if(var10) {
                                       var29[var17] = var3;
                                    }
                                 } else if(var10) {
                                    var29[var17] = var3;
                                 }
                              }
                           }

                           var11 += var15;
                           ++var17;
                        }

                        var12 += var16;
                        var11 = var20;
                        var17 += var18;
                     }
                  }
               } else if(var6 == 3) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     for(var22 = -var4; var22 < 0; ++var22) {
                        if(var3 < var29[var17] && var10) {
                           var29[var17] = var3;
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var20 = var7 >>> 24;
                  var21 = 256 - var20;
                  var22 = (var7 & 16711935) * var21 & -16711936;
                  var23 = (var7 & '\uff00') * var21 & 16711680;
                  var7 = (var22 | var23) >>> 8;
                  var24 = var11;

                  for(var25 = -var5; var25 < 0; ++var25) {
                     var26 = (var12 >> 16) * this.D;

                     for(var27 = -var4; var27 < 0; ++var27) {
                        if(var3 < var29[var17]) {
                           var28 = this.E[(var11 >> 16) + var26];
                           if(var28 != 0 && var10) {
                              var29[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var24;
                     var17 += var18;
                  }
               }
            } else {
               if(var8 != 2) {
                  throw new IllegalArgumentException();
               }

               if(var6 == 1) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     var22 = (var12 >> 16) * this.D;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        if(var3 < var29[var17]) {
                           var24 = this.E[(var11 >> 16) + var22];
                           if(var24 != 0 && var10) {
                              var29[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else if(var6 == 0) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     var22 = (var12 >> 16) * this.D;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        if(var3 < var29[var17]) {
                           var24 = this.E[(var11 >> 16) + var22];
                           if(var24 != 0 && var10) {
                              var29[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else if(var6 == 3) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     for(var22 = -var4; var22 < 0; ++var22) {
                        if(var3 < var29[var17] && var10) {
                           var29[var17] = var3;
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var20 = var7 >>> 24;
                  var21 = 256 - var20;
                  var22 = (var7 & 16711935) * var21 & -16711936;
                  var23 = (var7 & '\uff00') * var21 & 16711680;
                  var7 = (var22 | var23) >>> 8;
                  var24 = var11;

                  for(var25 = -var5; var25 < 0; ++var25) {
                     var26 = (var12 >> 16) * this.D;

                     for(var27 = -var4; var27 < 0; ++var27) {
                        if(var3 < var29[var17]) {
                           var28 = this.E[(var11 >> 16) + var26];
                           if(var28 != 0 && var10) {
                              var29[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var24;
                     var17 += var18;
                  }
               }
            }
         }

      }
   }

   final void a(int var1, int var2, Class_s var3, int var4, int var5) {
      if(ui.m(this.C)) {
         throw new IllegalStateException();
      } else {
         int[] var7 = (int[])((int[])this.C[7]);
         if(var7 != null) {
            var1 += this.z;
            var2 += this.j;
            int var8 = 0;
            int var9 = ((int[])((int[])this.C[1]))[4];
            int var10 = this.D;
            int var11 = this.u;
            int var12 = var9 - var10;
            int var13 = 0;
            int var14 = var1 + var2 * var9;
            int var15;
            if(var2 < ((int[])((int[])this.C[1]))[16]) {
               var15 = ((int[])((int[])this.C[1]))[16] - var2;
               var11 -= var15;
               var2 = ((int[])((int[])this.C[1]))[16];
               var8 += var15 * var10;
               var14 += var15 * var9;
            }

            if(var2 + var11 > ((int[])((int[])this.C[1]))[1]) {
               var11 -= var2 + var11 - ((int[])((int[])this.C[1]))[1];
            }

            if(var1 < ((int[])((int[])this.C[1]))[7]) {
               var15 = ((int[])((int[])this.C[1]))[7] - var1;
               var10 -= var15;
               var1 = ((int[])((int[])this.C[1]))[7];
               var8 += var15;
               var14 += var15;
               var13 += var15;
               var12 += var15;
            }

            if(var1 + var10 > ((int[])((int[])this.C[1]))[19]) {
               var15 = var1 + var10 - ((int[])((int[])this.C[1]))[19];
               var10 -= var15;
               var13 += var15;
               var12 += var15;
            }

            if(var10 > 0 && var11 > 0) {
               bk var6;
               Object[] var27 = (var6 = (bk)var3) == null?null:var6.f_l;
               int[] var16 = (int[])((int[])var27[0]);
               int[] var17 = (int[])((int[])var27[2]);
               int var18 = var2;
               if(var5 > var2) {
                  var18 = var5;
                  var14 += (var5 - var2) * var9;
                  var8 += (var5 - var2) * this.D;
               }

               int var19 = var5 + var16.length < var2 + var11?var5 + var16.length:var2 + var11;

               for(int var20 = var18; var20 < var19; ++var20) {
                  int var21 = var16[var20 - var5] + var4;
                  int var22 = var17[var20 - var5];
                  int var23 = var10;
                  int var24;
                  if(var1 > var21) {
                     var24 = var1 - var21;
                     if(var24 >= var22) {
                        var8 += var10 + var13;
                        var14 += var10 + var12;
                        continue;
                     }

                     var22 -= var24;
                  } else {
                     var24 = var21 - var1;
                     if(var24 >= var10) {
                        var8 += var10 + var13;
                        var14 += var10 + var12;
                        continue;
                     }

                     var8 += var24;
                     var23 = var10 - var24;
                     var14 += var24;
                  }

                  var24 = 0;
                  if(var23 < var22) {
                     var22 = var23;
                  } else {
                     var24 = var23 - var22;
                  }

                  for(int var25 = -var22; var25 < 0; ++var25) {
                     int var26 = this.E[var8++];
                     if(var26 != 0) {
                        var7[var14++] = var26;
                     } else {
                        ++var14;
                     }
                  }

                  var8 += var24 + var13;
                  var14 += var24 + var12;
               }

            }
         }
      }
   }

   final void b(int var1, int var2) {
      int[] var3 = (int[])((int[])this.C[7]);
      if(var3 != null) {
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var15;
         int var17;
         int var16;
         int var19;
         int var18;
         int var21;
         int var20;
         if(s == 0) {
            if(o == 0) {
               for(var5 = w; var5 < 0; m += A) {
                  var6 = m;
                  var7 = f_i;
                  var8 = H;
                  var9 = G;
                  if(var7 >= 0 && var8 >= 0 && var7 - (this.D << 12) < 0 && var8 - (this.u << 12) < 0) {
                     for(; var9 < 0; ++var9) {
                        var10 = (var8 >> 12) * this.D + (var7 >> 12);
                        var11 = var6++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var11] = this.E[var10];
                           } else if(var1 == 0) {
                              var15 = this.E[var10++];
                              var16 = (var15 & 16711680) * k & -16777216;
                              var17 = (var15 & '\uff00') * t & 16711680;
                              var18 = (var15 & 255) * x & '\uff00';
                              var3[var11] = (var16 | var17 | var18) >>> 8;
                           } else if(var1 == 3) {
                              var15 = this.E[var10++];
                              var16 = b;
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var15 = this.E[var10];
                              var16 = (var15 & 16711935) * y & -16711936;
                              var17 = (var15 & '\uff00') * y & 16711680;
                              var3[var11] = ((var16 | var17) >>> 8) + p;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var3[var11] = var15;
                              }
                           } else if(var1 == 0) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 if((b & 16777215) == 16777215) {
                                    var16 = b >>> 24;
                                    var17 = 256 - var16;
                                    var18 = var3[var11];
                                    var3[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & '\uff00') * var16 + (var18 & '\uff00') * var17 & 16711680) >> 8;
                                 } else if(y != 255) {
                                    var16 = (var15 & 16711680) * k & -16777216;
                                    var17 = (var15 & '\uff00') * t & 16711680;
                                    var18 = (var15 & 255) * x & '\uff00';
                                    var15 = (var16 | var17 | var18) >>> 8;
                                    var19 = var3[var11];
                                    var3[var11] = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                                 } else {
                                    var16 = (var15 & 16711680) * k & -16777216;
                                    var17 = (var15 & '\uff00') * t & 16711680;
                                    var18 = (var15 & 255) * x & '\uff00';
                                    var3[var11] = (var16 | var17 | var18) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var15 = this.E[var10];
                              var16 = b;
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var19 = var17 - var19 | var19 - (var19 >>> 8);
                              if(var15 == 0 && y != 255) {
                                 var15 = var19;
                                 var19 = var3[var11];
                                 var19 = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                              }

                              var3[var11] = var19;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = (var15 & 16711935) * y & -16711936;
                                 var17 = (var15 & '\uff00') * y & 16711680;
                                 var3[var11++] = ((var16 | var17) >>> 8) + p;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = var3[var11];
                                 var17 = var15 + var16;
                                 var18 = (var15 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = (var15 & 16711680) * k & -16777216;
                                 var17 = (var15 & '\uff00') * t & 16711680;
                                 var18 = (var15 & 255) * x & '\uff00';
                                 var15 = (var16 | var17 | var18) >>> 8;
                                 var19 = var3[var11];
                                 var20 = var15 + var19;
                                 var21 = (var15 & 16711935) + (var19 & 16711935);
                                 var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                 var3[var11] = var20 - var19 | var19 - (var19 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var15 = this.E[var10];
                              var16 = b;
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var15 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var3[var11];
                              var17 = var15 + var19;
                              var18 = (var15 & 16711935) + (var19 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                           } else if(var1 == 2) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = (var15 & 16711935) * y & -16711936;
                                 var17 = (var15 & '\uff00') * y & 16711680;
                                 var15 = ((var16 | var17) >>> 8) + p;
                                 var18 = var3[var11];
                                 var19 = var15 + var18;
                                 var20 = (var15 & 16711935) + (var18 & 16711935);
                                 var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                 var3[var11] = var19 - var18 | var18 - (var18 >>> 8);
                              }
                           }
                        }
                     }
                  }

                  ++var5;
               }
            } else if(o < 0) {
               for(var5 = w; var5 < 0; m += A) {
                  var6 = m;
                  var7 = f_i;
                  var8 = H + e;
                  var9 = G;
                  if(var7 >= 0 && var7 - (this.D << 12) < 0) {
                     if((var4 = var8 - (this.u << 12)) >= 0) {
                        var4 = (o - var4) / o;
                        var9 += var4;
                        var8 += o * var4;
                        var6 += var4;
                     }

                     if((var4 = (var8 - o) / o) > var9) {
                        var9 = var4;
                     }

                     while(var9 < 0) {
                        var10 = (var8 >> 12) * this.D + (var7 >> 12);
                        var11 = var6++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var11] = this.E[var10];
                           } else if(var1 == 0) {
                              var15 = this.E[var10++];
                              var16 = (var15 & 16711680) * k & -16777216;
                              var17 = (var15 & '\uff00') * t & 16711680;
                              var18 = (var15 & 255) * x & '\uff00';
                              var3[var11] = (var16 | var17 | var18) >>> 8;
                           } else if(var1 == 3) {
                              var15 = this.E[var10++];
                              var16 = b;
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var15 = this.E[var10];
                              var16 = (var15 & 16711935) * y & -16711936;
                              var17 = (var15 & '\uff00') * y & 16711680;
                              var3[var11] = ((var16 | var17) >>> 8) + p;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var3[var11] = var15;
                              }
                           } else if(var1 == 0) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 if((b & 16777215) == 16777215) {
                                    var16 = b >>> 24;
                                    var17 = 256 - var16;
                                    var18 = var3[var11];
                                    var3[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & '\uff00') * var16 + (var18 & '\uff00') * var17 & 16711680) >> 8;
                                 } else if(y != 255) {
                                    var16 = (var15 & 16711680) * k & -16777216;
                                    var17 = (var15 & '\uff00') * t & 16711680;
                                    var18 = (var15 & 255) * x & '\uff00';
                                    var15 = (var16 | var17 | var18) >>> 8;
                                    var19 = var3[var11];
                                    var3[var11] = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                                 } else {
                                    var16 = (var15 & 16711680) * k & -16777216;
                                    var17 = (var15 & '\uff00') * t & 16711680;
                                    var18 = (var15 & 255) * x & '\uff00';
                                    var3[var11] = (var16 | var17 | var18) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var15 = this.E[var10];
                              var16 = b;
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var19 = var17 - var19 | var19 - (var19 >>> 8);
                              if(var15 == 0 && y != 255) {
                                 var15 = var19;
                                 var19 = var3[var11];
                                 var19 = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                              }

                              var3[var11] = var19;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = (var15 & 16711935) * y & -16711936;
                                 var17 = (var15 & '\uff00') * y & 16711680;
                                 var3[var11++] = ((var16 | var17) >>> 8) + p;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = var3[var11];
                                 var17 = var15 + var16;
                                 var18 = (var15 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = (var15 & 16711680) * k & -16777216;
                                 var17 = (var15 & '\uff00') * t & 16711680;
                                 var18 = (var15 & 255) * x & '\uff00';
                                 var15 = (var16 | var17 | var18) >>> 8;
                                 var19 = var3[var11];
                                 var20 = var15 + var19;
                                 var21 = (var15 & 16711935) + (var19 & 16711935);
                                 var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                 var3[var11] = var20 - var19 | var19 - (var19 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var15 = this.E[var10];
                              var16 = b;
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var15 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var3[var11];
                              var17 = var15 + var19;
                              var18 = (var15 & 16711935) + (var19 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                           } else if(var1 == 2) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = (var15 & 16711935) * y & -16711936;
                                 var17 = (var15 & '\uff00') * y & 16711680;
                                 var15 = ((var16 | var17) >>> 8) + p;
                                 var18 = var3[var11];
                                 var19 = var15 + var18;
                                 var20 = (var15 & 16711935) + (var18 & 16711935);
                                 var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                 var3[var11] = var19 - var18 | var18 - (var18 >>> 8);
                              }
                           }
                        }

                        var8 += o;
                        ++var9;
                     }
                  }

                  ++var5;
                  f_i += B;
               }
            } else {
               for(var5 = w; var5 < 0; m += A) {
                  var6 = m;
                  var7 = f_i;
                  var8 = H + e;
                  var9 = G;
                  if(var7 >= 0 && var7 - (this.D << 12) < 0) {
                     if(var8 < 0) {
                        var4 = (o - 1 - var8) / o;
                        var9 += var4;
                        var8 += o * var4;
                        var6 += var4;
                     }

                     if((var4 = (1 + var8 - (this.u << 12) - o) / o) > var9) {
                        var9 = var4;
                     }

                     while(var9 < 0) {
                        var10 = (var8 >> 12) * this.D + (var7 >> 12);
                        var11 = var6++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var11] = this.E[var10];
                           } else if(var1 == 0) {
                              var15 = this.E[var10++];
                              var16 = (var15 & 16711680) * k & -16777216;
                              var17 = (var15 & '\uff00') * t & 16711680;
                              var18 = (var15 & 255) * x & '\uff00';
                              var3[var11] = (var16 | var17 | var18) >>> 8;
                           } else if(var1 == 3) {
                              var15 = this.E[var10++];
                              var16 = b;
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var15 = this.E[var10];
                              var16 = (var15 & 16711935) * y & -16711936;
                              var17 = (var15 & '\uff00') * y & 16711680;
                              var3[var11] = ((var16 | var17) >>> 8) + p;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var3[var11] = var15;
                              }
                           } else if(var1 == 0) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 if((b & 16777215) == 16777215) {
                                    var16 = b >>> 24;
                                    var17 = 256 - var16;
                                    var18 = var3[var11];
                                    var3[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & '\uff00') * var16 + (var18 & '\uff00') * var17 & 16711680) >> 8;
                                 } else if(y != 255) {
                                    var16 = (var15 & 16711680) * k & -16777216;
                                    var17 = (var15 & '\uff00') * t & 16711680;
                                    var18 = (var15 & 255) * x & '\uff00';
                                    var15 = (var16 | var17 | var18) >>> 8;
                                    var19 = var3[var11];
                                    var3[var11] = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                                 } else {
                                    var16 = (var15 & 16711680) * k & -16777216;
                                    var17 = (var15 & '\uff00') * t & 16711680;
                                    var18 = (var15 & 255) * x & '\uff00';
                                    var3[var11] = (var16 | var17 | var18) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var15 = this.E[var10];
                              var16 = b;
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var19 = var17 - var19 | var19 - (var19 >>> 8);
                              if(var15 == 0 && y != 255) {
                                 var15 = var19;
                                 var19 = var3[var11];
                                 var19 = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                              }

                              var3[var11] = var19;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = (var15 & 16711935) * y & -16711936;
                                 var17 = (var15 & '\uff00') * y & 16711680;
                                 var3[var11++] = ((var16 | var17) >>> 8) + p;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = var3[var11];
                                 var17 = var15 + var16;
                                 var18 = (var15 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = (var15 & 16711680) * k & -16777216;
                                 var17 = (var15 & '\uff00') * t & 16711680;
                                 var18 = (var15 & 255) * x & '\uff00';
                                 var15 = (var16 | var17 | var18) >>> 8;
                                 var19 = var3[var11];
                                 var20 = var15 + var19;
                                 var21 = (var15 & 16711935) + (var19 & 16711935);
                                 var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                 var3[var11] = var20 - var19 | var19 - (var19 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var15 = this.E[var10];
                              var16 = b;
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var15 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var3[var11];
                              var17 = var15 + var19;
                              var18 = (var15 & 16711935) + (var19 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                           } else if(var1 == 2) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = (var15 & 16711935) * y & -16711936;
                                 var17 = (var15 & '\uff00') * y & 16711680;
                                 var15 = ((var16 | var17) >>> 8) + p;
                                 var18 = var3[var11];
                                 var19 = var15 + var18;
                                 var20 = (var15 & 16711935) + (var18 & 16711935);
                                 var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                 var3[var11] = var19 - var18 | var18 - (var18 >>> 8);
                              }
                           }
                        }

                        var8 += o;
                        ++var9;
                     }
                  }

                  ++var5;
                  f_i += B;
               }
            }
         } else if(s < 0) {
            if(o == 0) {
               for(var5 = w; var5 < 0; m += A) {
                  var6 = m;
                  var7 = f_i + c;
                  var8 = H;
                  var9 = G;
                  if(var8 >= 0 && var8 - (this.u << 12) < 0) {
                     if((var4 = var7 - (this.D << 12)) >= 0) {
                        var4 = (s - var4) / s;
                        var9 += var4;
                        var7 += s * var4;
                        var6 += var4;
                     }

                     if((var4 = (var7 - s) / s) > var9) {
                        var9 = var4;
                     }

                     while(var9 < 0) {
                        var10 = (var8 >> 12) * this.D + (var7 >> 12);
                        var11 = var6++;
                        if(var2 == 0) {
                           if(var1 == 1) {
                              var3[var11] = this.E[var10];
                           } else if(var1 == 0) {
                              var15 = this.E[var10++];
                              var16 = (var15 & 16711680) * k & -16777216;
                              var17 = (var15 & '\uff00') * t & 16711680;
                              var18 = (var15 & 255) * x & '\uff00';
                              var3[var11] = (var16 | var17 | var18) >>> 8;
                           } else if(var1 == 3) {
                              var15 = this.E[var10++];
                              var16 = b;
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var15 = this.E[var10];
                              var16 = (var15 & 16711935) * y & -16711936;
                              var17 = (var15 & '\uff00') * y & 16711680;
                              var3[var11] = ((var16 | var17) >>> 8) + p;
                           }
                        } else if(var2 == 1) {
                           if(var1 == 1) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var3[var11] = var15;
                              }
                           } else if(var1 == 0) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 if((b & 16777215) == 16777215) {
                                    var16 = b >>> 24;
                                    var17 = 256 - var16;
                                    var18 = var3[var11];
                                    var3[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & '\uff00') * var16 + (var18 & '\uff00') * var17 & 16711680) >> 8;
                                 } else if(y != 255) {
                                    var16 = (var15 & 16711680) * k & -16777216;
                                    var17 = (var15 & '\uff00') * t & 16711680;
                                    var18 = (var15 & 255) * x & '\uff00';
                                    var15 = (var16 | var17 | var18) >>> 8;
                                    var19 = var3[var11];
                                    var3[var11] = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                                 } else {
                                    var16 = (var15 & 16711680) * k & -16777216;
                                    var17 = (var15 & '\uff00') * t & 16711680;
                                    var18 = (var15 & 255) * x & '\uff00';
                                    var3[var11] = (var16 | var17 | var18) >>> 8;
                                 }
                              }
                           } else if(var1 == 3) {
                              var15 = this.E[var10];
                              var16 = b;
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var19 = var17 - var19 | var19 - (var19 >>> 8);
                              if(var15 == 0 && y != 255) {
                                 var15 = var19;
                                 var19 = var3[var11];
                                 var19 = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                              }

                              var3[var11] = var19;
                           } else {
                              if(var1 != 2) {
                                 throw new IllegalArgumentException();
                              }

                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = (var15 & 16711935) * y & -16711936;
                                 var17 = (var15 & '\uff00') * y & 16711680;
                                 var3[var11++] = ((var16 | var17) >>> 8) + p;
                              }
                           }
                        } else {
                           if(var2 != 2) {
                              throw new IllegalArgumentException();
                           }

                           if(var1 == 1) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = var3[var11];
                                 var17 = var15 + var16;
                                 var18 = (var15 & 16711935) + (var16 & 16711935);
                                 var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                                 var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                              }
                           } else if(var1 == 0) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = (var15 & 16711680) * k & -16777216;
                                 var17 = (var15 & '\uff00') * t & 16711680;
                                 var18 = (var15 & 255) * x & '\uff00';
                                 var15 = (var16 | var17 | var18) >>> 8;
                                 var19 = var3[var11];
                                 var20 = var15 + var19;
                                 var21 = (var15 & 16711935) + (var19 & 16711935);
                                 var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                                 var3[var11] = var20 - var19 | var19 - (var19 >>> 8);
                              }
                           } else if(var1 == 3) {
                              var15 = this.E[var10];
                              var16 = b;
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var15 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var3[var11];
                              var17 = var15 + var19;
                              var18 = (var15 & 16711935) + (var19 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                           } else if(var1 == 2) {
                              var15 = this.E[var10];
                              if(var15 != 0) {
                                 var16 = (var15 & 16711935) * y & -16711936;
                                 var17 = (var15 & '\uff00') * y & 16711680;
                                 var15 = ((var16 | var17) >>> 8) + p;
                                 var18 = var3[var11];
                                 var19 = var15 + var18;
                                 var20 = (var15 & 16711935) + (var18 & 16711935);
                                 var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                                 var3[var11] = var19 - var18 | var18 - (var18 >>> 8);
                              }
                           }
                        }

                        var7 += s;
                        ++var9;
                     }
                  }

                  ++var5;
                  H += d;
               }
            } else if(o < 0) {
               for(var5 = w; var5 < 0; m += A) {
                  var6 = m;
                  var7 = f_i + c;
                  var8 = H + e;
                  var9 = G;
                  if((var4 = var7 - (this.D << 12)) >= 0) {
                     var4 = (s - var4) / s;
                     var9 += var4;
                     var7 += s * var4;
                     var8 += o * var4;
                     var6 += var4;
                  }

                  if((var4 = (var7 - s) / s) > var9) {
                     var9 = var4;
                  }

                  if((var4 = var8 - (this.u << 12)) >= 0) {
                     var4 = (o - var4) / o;
                     var9 += var4;
                     var7 += s * var4;
                     var8 += o * var4;
                     var6 += var4;
                  }

                  if((var4 = (var8 - o) / o) > var9) {
                     var9 = var4;
                  }

                  while(var9 < 0) {
                     var10 = (var8 >> 12) * this.D + (var7 >> 12);
                     var11 = var6++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var11] = this.E[var10];
                        } else if(var1 == 0) {
                           var15 = this.E[var10++];
                           var16 = (var15 & 16711680) * k & -16777216;
                           var17 = (var15 & '\uff00') * t & 16711680;
                           var18 = (var15 & 255) * x & '\uff00';
                           var3[var11] = (var16 | var17 | var18) >>> 8;
                        } else if(var1 == 3) {
                           var15 = this.E[var10++];
                           var16 = b;
                           var17 = var15 + var16;
                           var18 = (var15 & 16711935) + (var16 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var15 = this.E[var10];
                           var16 = (var15 & 16711935) * y & -16711936;
                           var17 = (var15 & '\uff00') * y & 16711680;
                           var3[var11] = ((var16 | var17) >>> 8) + p;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var3[var11] = var15;
                           }
                        } else if(var1 == 0) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              if((b & 16777215) == 16777215) {
                                 var16 = b >>> 24;
                                 var17 = 256 - var16;
                                 var18 = var3[var11];
                                 var3[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & '\uff00') * var16 + (var18 & '\uff00') * var17 & 16711680) >> 8;
                              } else if(y != 255) {
                                 var16 = (var15 & 16711680) * k & -16777216;
                                 var17 = (var15 & '\uff00') * t & 16711680;
                                 var18 = (var15 & 255) * x & '\uff00';
                                 var15 = (var16 | var17 | var18) >>> 8;
                                 var19 = var3[var11];
                                 var3[var11] = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                              } else {
                                 var16 = (var15 & 16711680) * k & -16777216;
                                 var17 = (var15 & '\uff00') * t & 16711680;
                                 var18 = (var15 & 255) * x & '\uff00';
                                 var3[var11] = (var16 | var17 | var18) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var15 = this.E[var10];
                           var16 = b;
                           var17 = var15 + var16;
                           var18 = (var15 & 16711935) + (var16 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var19 = var17 - var19 | var19 - (var19 >>> 8);
                           if(var15 == 0 && y != 255) {
                              var15 = var19;
                              var19 = var3[var11];
                              var19 = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                           }

                           var3[var11] = var19;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var16 = (var15 & 16711935) * y & -16711936;
                              var17 = (var15 & '\uff00') * y & 16711680;
                              var3[var11++] = ((var16 | var17) >>> 8) + p;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var16 = var3[var11];
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var16 = (var15 & 16711680) * k & -16777216;
                              var17 = (var15 & '\uff00') * t & 16711680;
                              var18 = (var15 & 255) * x & '\uff00';
                              var15 = (var16 | var17 | var18) >>> 8;
                              var19 = var3[var11];
                              var20 = var15 + var19;
                              var21 = (var15 & 16711935) + (var19 & 16711935);
                              var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                              var3[var11] = var20 - var19 | var19 - (var19 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var15 = this.E[var10];
                           var16 = b;
                           var17 = var15 + var16;
                           var18 = (var15 & 16711935) + (var16 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var15 = var17 - var19 | var19 - (var19 >>> 8);
                           var19 = var3[var11];
                           var17 = var15 + var19;
                           var18 = (var15 & 16711935) + (var19 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                        } else if(var1 == 2) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var16 = (var15 & 16711935) * y & -16711936;
                              var17 = (var15 & '\uff00') * y & 16711680;
                              var15 = ((var16 | var17) >>> 8) + p;
                              var18 = var3[var11];
                              var19 = var15 + var18;
                              var20 = (var15 & 16711935) + (var18 & 16711935);
                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var3[var11] = var19 - var18 | var18 - (var18 >>> 8);
                           }
                        }
                     }

                     var7 += s;
                     var8 += o;
                     ++var9;
                  }

                  ++var5;
                  f_i += B;
                  H += d;
               }
            } else {
               for(var5 = w; var5 < 0; m += A) {
                  var6 = m;
                  var7 = f_i + c;
                  var8 = H + e;
                  var9 = G;
                  if((var4 = var7 - (this.D << 12)) >= 0) {
                     var4 = (s - var4) / s;
                     var9 += var4;
                     var7 += s * var4;
                     var8 += o * var4;
                     var6 += var4;
                  }

                  if((var4 = (var7 - s) / s) > var9) {
                     var9 = var4;
                  }

                  if(var8 < 0) {
                     var4 = (o - 1 - var8) / o;
                     var9 += var4;
                     var7 += s * var4;
                     var8 += o * var4;
                     var6 += var4;
                  }

                  if((var4 = (1 + var8 - (this.u << 12) - o) / o) > var9) {
                     var9 = var4;
                  }

                  while(var9 < 0) {
                     var10 = (var8 >> 12) * this.D + (var7 >> 12);
                     var11 = var6++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var11] = this.E[var10];
                        } else if(var1 == 0) {
                           var15 = this.E[var10++];
                           var16 = (var15 & 16711680) * k & -16777216;
                           var17 = (var15 & '\uff00') * t & 16711680;
                           var18 = (var15 & 255) * x & '\uff00';
                           var3[var11] = (var16 | var17 | var18) >>> 8;
                        } else if(var1 == 3) {
                           var15 = this.E[var10++];
                           var16 = b;
                           var17 = var15 + var16;
                           var18 = (var15 & 16711935) + (var16 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var15 = this.E[var10];
                           var16 = (var15 & 16711935) * y & -16711936;
                           var17 = (var15 & '\uff00') * y & 16711680;
                           var3[var11] = ((var16 | var17) >>> 8) + p;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var3[var11] = var15;
                           }
                        } else if(var1 == 0) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              if((b & 16777215) == 16777215) {
                                 var16 = b >>> 24;
                                 var17 = 256 - var16;
                                 var18 = var3[var11];
                                 var3[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & '\uff00') * var16 + (var18 & '\uff00') * var17 & 16711680) >> 8;
                              } else if(y != 255) {
                                 var16 = (var15 & 16711680) * k & -16777216;
                                 var17 = (var15 & '\uff00') * t & 16711680;
                                 var18 = (var15 & 255) * x & '\uff00';
                                 var15 = (var16 | var17 | var18) >>> 8;
                                 var19 = var3[var11];
                                 var3[var11] = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                              } else {
                                 var16 = (var15 & 16711680) * k & -16777216;
                                 var17 = (var15 & '\uff00') * t & 16711680;
                                 var18 = (var15 & 255) * x & '\uff00';
                                 var3[var11] = (var16 | var17 | var18) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var15 = this.E[var10];
                           var16 = b;
                           var17 = var15 + var16;
                           var18 = (var15 & 16711935) + (var16 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var19 = var17 - var19 | var19 - (var19 >>> 8);
                           if(var15 == 0 && y != 255) {
                              var15 = var19;
                              var19 = var3[var11];
                              var19 = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                           }

                           var3[var11] = var19;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var16 = (var15 & 16711935) * y & -16711936;
                              var17 = (var15 & '\uff00') * y & 16711680;
                              var3[var11++] = ((var16 | var17) >>> 8) + p;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var16 = var3[var11];
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var16 = (var15 & 16711680) * k & -16777216;
                              var17 = (var15 & '\uff00') * t & 16711680;
                              var18 = (var15 & 255) * x & '\uff00';
                              var15 = (var16 | var17 | var18) >>> 8;
                              var19 = var3[var11];
                              var20 = var15 + var19;
                              var21 = (var15 & 16711935) + (var19 & 16711935);
                              var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                              var3[var11] = var20 - var19 | var19 - (var19 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var15 = this.E[var10];
                           var16 = b;
                           var17 = var15 + var16;
                           var18 = (var15 & 16711935) + (var16 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var15 = var17 - var19 | var19 - (var19 >>> 8);
                           var19 = var3[var11];
                           var17 = var15 + var19;
                           var18 = (var15 & 16711935) + (var19 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                        } else if(var1 == 2) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var16 = (var15 & 16711935) * y & -16711936;
                              var17 = (var15 & '\uff00') * y & 16711680;
                              var15 = ((var16 | var17) >>> 8) + p;
                              var18 = var3[var11];
                              var19 = var15 + var18;
                              var20 = (var15 & 16711935) + (var18 & 16711935);
                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var3[var11] = var19 - var18 | var18 - (var18 >>> 8);
                           }
                        }
                     }

                     var7 += s;
                     var8 += o;
                     ++var9;
                  }

                  ++var5;
                  f_i += B;
                  H += d;
               }
            }
         } else if(o == 0) {
            for(var5 = w; var5 < 0; m += A) {
               var6 = m;
               var7 = f_i + c;
               var8 = H;
               var9 = G;
               if(var8 >= 0 && var8 - (this.u << 12) < 0) {
                  if(var7 < 0) {
                     var4 = (s - 1 - var7) / s;
                     var9 += var4;
                     var7 += s * var4;
                     var6 += var4;
                  }

                  if((var4 = (1 + var7 - (this.D << 12) - s) / s) > var9) {
                     var9 = var4;
                  }

                  while(var9 < 0) {
                     var10 = (var8 >> 12) * this.D + (var7 >> 12);
                     var11 = var6++;
                     if(var2 == 0) {
                        if(var1 == 1) {
                           var3[var11] = this.E[var10];
                        } else if(var1 == 0) {
                           var15 = this.E[var10++];
                           var16 = (var15 & 16711680) * k & -16777216;
                           var17 = (var15 & '\uff00') * t & 16711680;
                           var18 = (var15 & 255) * x & '\uff00';
                           var3[var11] = (var16 | var17 | var18) >>> 8;
                        } else if(var1 == 3) {
                           var15 = this.E[var10++];
                           var16 = b;
                           var17 = var15 + var16;
                           var18 = (var15 & 16711935) + (var16 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var15 = this.E[var10];
                           var16 = (var15 & 16711935) * y & -16711936;
                           var17 = (var15 & '\uff00') * y & 16711680;
                           var3[var11] = ((var16 | var17) >>> 8) + p;
                        }
                     } else if(var2 == 1) {
                        if(var1 == 1) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var3[var11] = var15;
                           }
                        } else if(var1 == 0) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              if((b & 16777215) == 16777215) {
                                 var16 = b >>> 24;
                                 var17 = 256 - var16;
                                 var18 = var3[var11];
                                 var3[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & '\uff00') * var16 + (var18 & '\uff00') * var17 & 16711680) >> 8;
                              } else if(y != 255) {
                                 var16 = (var15 & 16711680) * k & -16777216;
                                 var17 = (var15 & '\uff00') * t & 16711680;
                                 var18 = (var15 & 255) * x & '\uff00';
                                 var15 = (var16 | var17 | var18) >>> 8;
                                 var19 = var3[var11];
                                 var3[var11] = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                              } else {
                                 var16 = (var15 & 16711680) * k & -16777216;
                                 var17 = (var15 & '\uff00') * t & 16711680;
                                 var18 = (var15 & 255) * x & '\uff00';
                                 var3[var11] = (var16 | var17 | var18) >>> 8;
                              }
                           }
                        } else if(var1 == 3) {
                           var15 = this.E[var10];
                           var16 = b;
                           var17 = var15 + var16;
                           var18 = (var15 & 16711935) + (var16 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var19 = var17 - var19 | var19 - (var19 >>> 8);
                           if(var15 == 0 && y != 255) {
                              var15 = var19;
                              var19 = var3[var11];
                              var19 = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                           }

                           var3[var11] = var19;
                        } else {
                           if(var1 != 2) {
                              throw new IllegalArgumentException();
                           }

                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var16 = (var15 & 16711935) * y & -16711936;
                              var17 = (var15 & '\uff00') * y & 16711680;
                              var3[var11++] = ((var16 | var17) >>> 8) + p;
                           }
                        }
                     } else {
                        if(var2 != 2) {
                           throw new IllegalArgumentException();
                        }

                        if(var1 == 1) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var16 = var3[var11];
                              var17 = var15 + var16;
                              var18 = (var15 & 16711935) + (var16 & 16711935);
                              var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                           }
                        } else if(var1 == 0) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var16 = (var15 & 16711680) * k & -16777216;
                              var17 = (var15 & '\uff00') * t & 16711680;
                              var18 = (var15 & 255) * x & '\uff00';
                              var15 = (var16 | var17 | var18) >>> 8;
                              var19 = var3[var11];
                              var20 = var15 + var19;
                              var21 = (var15 & 16711935) + (var19 & 16711935);
                              var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                              var3[var11] = var20 - var19 | var19 - (var19 >>> 8);
                           }
                        } else if(var1 == 3) {
                           var15 = this.E[var10];
                           var16 = b;
                           var17 = var15 + var16;
                           var18 = (var15 & 16711935) + (var16 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var15 = var17 - var19 | var19 - (var19 >>> 8);
                           var19 = var3[var11];
                           var17 = var15 + var19;
                           var18 = (var15 & 16711935) + (var19 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                        } else if(var1 == 2) {
                           var15 = this.E[var10];
                           if(var15 != 0) {
                              var16 = (var15 & 16711935) * y & -16711936;
                              var17 = (var15 & '\uff00') * y & 16711680;
                              var15 = ((var16 | var17) >>> 8) + p;
                              var18 = var3[var11];
                              var19 = var15 + var18;
                              var20 = (var15 & 16711935) + (var18 & 16711935);
                              var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var3[var11] = var19 - var18 | var18 - (var18 >>> 8);
                           }
                        }
                     }

                     var7 += s;
                     ++var9;
                  }
               }

               ++var5;
               f_i += B;
               H += d;
            }
         } else if(o < 0) {
            for(var5 = w; var5 < 0; ++var5) {
               var6 = m;
               var7 = f_i + c;
               var8 = H + e;
               var9 = G;
               if(var7 < 0) {
                  var4 = (s - 1 - var7) / s;
                  var9 += var4;
                  var7 += s * var4;
                  var8 += o * var4;
                  var6 += var4;
               }

               if((var4 = (1 + var7 - (this.D << 12) - s) / s) > var9) {
                  var9 = var4;
               }

               if((var4 = var8 - (this.u << 12)) >= 0) {
                  var4 = (o - var4) / o;
                  var9 += var4;
                  var7 += s * var4;
                  var8 += o * var4;
                  var6 += var4;
               }

               if((var4 = (var8 - o) / o) > var9) {
                  var9 = var4;
               }

               while(var9 < 0) {
                  var10 = (var8 >> 12) * this.D + (var7 >> 12);
                  var11 = var6++;
                  if(var2 == 0) {
                     if(var1 == 1) {
                        var3[var11] = this.E[var10];
                     } else if(var1 == 0) {
                        var15 = this.E[var10++];
                        var16 = (var15 & 16711680) * k & -16777216;
                        var17 = (var15 & '\uff00') * t & 16711680;
                        var18 = (var15 & 255) * x & '\uff00';
                        var3[var11] = (var16 | var17 | var18) >>> 8;
                     } else if(var1 == 3) {
                        var15 = this.E[var10++];
                        var16 = b;
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var15 = this.E[var10];
                        var16 = (var15 & 16711935) * y & -16711936;
                        var17 = (var15 & '\uff00') * y & 16711680;
                        var3[var11] = ((var16 | var17) >>> 8) + p;
                     }
                  } else if(var2 == 1) {
                     if(var1 == 1) {
                        var15 = this.E[var10];
                        if(var15 != 0) {
                           var3[var11] = var15;
                        }
                     } else if(var1 == 0) {
                        var15 = this.E[var10];
                        if(var15 != 0) {
                           if((b & 16777215) == 16777215) {
                              var16 = b >>> 24;
                              var17 = 256 - var16;
                              var18 = var3[var11];
                              var3[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & '\uff00') * var16 + (var18 & '\uff00') * var17 & 16711680) >> 8;
                           } else if(y != 255) {
                              var16 = (var15 & 16711680) * k & -16777216;
                              var17 = (var15 & '\uff00') * t & 16711680;
                              var18 = (var15 & 255) * x & '\uff00';
                              var15 = (var16 | var17 | var18) >>> 8;
                              var19 = var3[var11];
                              var3[var11] = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                           } else {
                              var16 = (var15 & 16711680) * k & -16777216;
                              var17 = (var15 & '\uff00') * t & 16711680;
                              var18 = (var15 & 255) * x & '\uff00';
                              var3[var11] = (var16 | var17 | var18) >>> 8;
                           }
                        }
                     } else if(var1 == 3) {
                        var15 = this.E[var10];
                        var16 = b;
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                        if(var15 == 0 && y != 255) {
                           var15 = var19;
                           var19 = var3[var11];
                           var19 = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                        }

                        var3[var11] = var19;
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var15 = this.E[var10];
                        if(var15 != 0) {
                           var16 = (var15 & 16711935) * y & -16711936;
                           var17 = (var15 & '\uff00') * y & 16711680;
                           var3[var11++] = ((var16 | var17) >>> 8) + p;
                        }
                     }
                  } else {
                     if(var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var1 == 1) {
                        var15 = this.E[var10];
                        if(var15 != 0) {
                           var16 = var3[var11];
                           var17 = var15 + var16;
                           var18 = (var15 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if(var1 == 0) {
                        var15 = this.E[var10];
                        if(var15 != 0) {
                           var16 = (var15 & 16711680) * k & -16777216;
                           var17 = (var15 & '\uff00') * t & 16711680;
                           var18 = (var15 & 255) * x & '\uff00';
                           var15 = (var16 | var17 | var18) >>> 8;
                           var19 = var3[var11];
                           var20 = var15 + var19;
                           var21 = (var15 & 16711935) + (var19 & 16711935);
                           var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                           var3[var11] = var20 - var19 | var19 - (var19 >>> 8);
                        }
                     } else if(var1 == 3) {
                        var15 = this.E[var10];
                        var16 = b;
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                        var19 = var3[var11];
                        var17 = var15 + var19;
                        var18 = (var15 & 16711935) + (var19 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                     } else if(var1 == 2) {
                        var15 = this.E[var10];
                        if(var15 != 0) {
                           var16 = (var15 & 16711935) * y & -16711936;
                           var17 = (var15 & '\uff00') * y & 16711680;
                           var15 = ((var16 | var17) >>> 8) + p;
                           var18 = var3[var11];
                           var19 = var15 + var18;
                           var20 = (var15 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var3[var11] = var19 - var18 | var18 - (var18 >>> 8);
                        }
                     }
                  }

                  var7 += s;
                  var8 += o;
                  ++var9;
               }

               f_i += B;
               H += d;
               m += A;
            }
         } else {
            for(var5 = w; var5 < 0; ++var5) {
               var6 = m;
               var7 = f_i + c;
               var8 = H + e;
               var9 = G;
               if(var7 < 0) {
                  var4 = (s - 1 - var7) / s;
                  var9 += var4;
                  var7 += s * var4;
                  var8 += o * var4;
                  var6 += var4;
               }

               if((var4 = (1 + var7 - (this.D << 12) - s) / s) > var9) {
                  var9 = var4;
               }

               if(var8 < 0) {
                  var4 = (o - 1 - var8) / o;
                  var9 += var4;
                  var7 += s * var4;
                  var8 += o * var4;
                  var6 += var4;
               }

               if((var4 = (1 + var8 - (this.u << 12) - o) / o) > var9) {
                  var9 = var4;
               }

               while(var9 < 0) {
                  var10 = (var8 >> 12) * this.D + (var7 >> 12);
                  var11 = var6++;
                  if(var2 == 0) {
                     if(var1 == 1) {
                        var3[var11] = this.E[var10];
                     } else if(var1 == 0) {
                        var15 = this.E[var10++];
                        var16 = (var15 & 16711680) * k & -16777216;
                        var17 = (var15 & '\uff00') * t & 16711680;
                        var18 = (var15 & 255) * x & '\uff00';
                        var3[var11] = (var16 | var17 | var18) >>> 8;
                     } else if(var1 == 3) {
                        var15 = this.E[var10++];
                        var16 = b;
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var15 = this.E[var10];
                        var16 = (var15 & 16711935) * y & -16711936;
                        var17 = (var15 & '\uff00') * y & 16711680;
                        var3[var11] = ((var16 | var17) >>> 8) + p;
                     }
                  } else if(var2 == 1) {
                     if(var1 == 1) {
                        var15 = this.E[var10];
                        if(var15 != 0) {
                           var3[var11] = var15;
                        }
                     } else if(var1 == 0) {
                        var15 = this.E[var10];
                        if(var15 != 0) {
                           if((b & 16777215) == 16777215) {
                              var16 = b >>> 24;
                              var17 = 256 - var16;
                              var18 = var3[var11];
                              var3[var11] = ((var15 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((var15 & '\uff00') * var16 + (var18 & '\uff00') * var17 & 16711680) >> 8;
                           } else if(y != 255) {
                              var16 = (var15 & 16711680) * k & -16777216;
                              var17 = (var15 & '\uff00') * t & 16711680;
                              var18 = (var15 & 255) * x & '\uff00';
                              var15 = (var16 | var17 | var18) >>> 8;
                              var19 = var3[var11];
                              var3[var11] = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                           } else {
                              var16 = (var15 & 16711680) * k & -16777216;
                              var17 = (var15 & '\uff00') * t & 16711680;
                              var18 = (var15 & 255) * x & '\uff00';
                              var3[var11] = (var16 | var17 | var18) >>> 8;
                           }
                        }
                     } else if(var1 == 3) {
                        var15 = this.E[var10];
                        var16 = b;
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var19 = var17 - var19 | var19 - (var19 >>> 8);
                        if(var15 == 0 && y != 255) {
                           var15 = var19;
                           var19 = var3[var11];
                           var19 = ((var15 & 16711935) * y + (var19 & 16711935) * r & -16711936) + ((var15 & '\uff00') * y + (var19 & '\uff00') * r & 16711680) >> 8;
                        }

                        var3[var11] = var19;
                     } else {
                        if(var1 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var15 = this.E[var10];
                        if(var15 != 0) {
                           var16 = (var15 & 16711935) * y & -16711936;
                           var17 = (var15 & '\uff00') * y & 16711680;
                           var3[var11++] = ((var16 | var17) >>> 8) + p;
                        }
                     }
                  } else {
                     if(var2 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var1 == 1) {
                        var15 = this.E[var10];
                        if(var15 != 0) {
                           var16 = var3[var11];
                           var17 = var15 + var16;
                           var18 = (var15 & 16711935) + (var16 & 16711935);
                           var16 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var3[var11] = var17 - var16 | var16 - (var16 >>> 8);
                        }
                     } else if(var1 == 0) {
                        var15 = this.E[var10];
                        if(var15 != 0) {
                           var16 = (var15 & 16711680) * k & -16777216;
                           var17 = (var15 & '\uff00') * t & 16711680;
                           var18 = (var15 & 255) * x & '\uff00';
                           var15 = (var16 | var17 | var18) >>> 8;
                           var19 = var3[var11];
                           var20 = var15 + var19;
                           var21 = (var15 & 16711935) + (var19 & 16711935);
                           var19 = (var21 & 16777472) + (var20 - var21 & 65536);
                           var3[var11] = var20 - var19 | var19 - (var19 >>> 8);
                        }
                     } else if(var1 == 3) {
                        var15 = this.E[var10];
                        var16 = b;
                        var17 = var15 + var16;
                        var18 = (var15 & 16711935) + (var16 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var15 = var17 - var19 | var19 - (var19 >>> 8);
                        var19 = var3[var11];
                        var17 = var15 + var19;
                        var18 = (var15 & 16711935) + (var19 & 16711935);
                        var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                        var3[var11] = var17 - var19 | var19 - (var19 >>> 8);
                     } else if(var1 == 2) {
                        var15 = this.E[var10];
                        if(var15 != 0) {
                           var16 = (var15 & 16711935) * y & -16711936;
                           var17 = (var15 & '\uff00') * y & 16711680;
                           var15 = ((var16 | var17) >>> 8) + p;
                           var18 = var3[var11];
                           var19 = var15 + var18;
                           var20 = (var15 & 16711935) + (var18 & 16711935);
                           var18 = (var20 & 16777472) + (var19 - var20 & 65536);
                           var3[var11] = var19 - var18 | var18 - (var18 >>> 8);
                        }
                     }
                  }

                  var7 += s;
                  var8 += o;
                  ++var9;
               }

               f_i += B;
               H += d;
               m += A;
            }
         }

      }
   }

   final void h(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      if(var4 > 0 && var5 > 0) {
         int var11 = 0;
         int var12 = 0;
         int var13 = this.z + this.D + this.v;
         int var14 = this.j + this.u + this.a;
         int var15 = (var13 << 16) / var4;
         int var16 = (var14 << 16) / var5;
         int var17;
         if(this.z > 0) {
            var17 = ((this.z << 16) + var15 - 1) / var15;
            var1 += var17;
            var11 += var17 * var15 - (this.z << 16);
         }

         if(this.j > 0) {
            var17 = ((this.j << 16) + var16 - 1) / var16;
            var2 += var17;
            var12 += var17 * var16 - (this.j << 16);
         }

         if(this.D < var13) {
            var4 = ((this.D << 16) - var11 + var15 - 1) / var15;
         }

         if(this.u < var14) {
            var5 = ((this.u << 16) - var12 + var16 - 1) / var16;
         }

         var17 = var1 + var2 * ((int[])((int[])this.C[1]))[4];
         int var18 = ((int[])((int[])this.C[1]))[4] - var4;
         if(var2 + var5 > ((int[])((int[])this.C[1]))[1]) {
            var5 -= var2 + var5 - ((int[])((int[])this.C[1]))[1];
         }

         int var19;
         if(var2 < ((int[])((int[])this.C[1]))[16]) {
            var19 = ((int[])((int[])this.C[1]))[16] - var2;
            var5 -= var19;
            var17 += var19 * ((int[])((int[])this.C[1]))[4];
            var12 += var16 * var19;
         }

         if(var1 + var4 > ((int[])((int[])this.C[1]))[19]) {
            var19 = var1 + var4 - ((int[])((int[])this.C[1]))[19];
            var4 -= var19;
            var18 += var19;
         }

         if(var1 < ((int[])((int[])this.C[1]))[7]) {
            var19 = ((int[])((int[])this.C[1]))[7] - var1;
            var4 -= var19;
            var17 += var19;
            var11 += var15 * var19;
            var18 += var19;
         }

         int[] var34 = (int[])((int[])this.C[7]);
         int var21;
         int var20;
         int var23;
         int var22;
         int var25;
         int var24;
         int var27;
         int var26;
         int var29;
         int var28;
         int var30;
         if(var8 == 0) {
            if(var6 == 1) {
               var20 = var11;

               for(var21 = -var5; var21 < 0; ++var21) {
                  var22 = (var12 >> 16) * this.D;

                  for(var23 = -var4; var23 < 0; ++var23) {
                     var34[var17] = this.E[(var11 >> 16) + var22];
                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var20;
                  var17 += var18;
               }
            } else if(var6 == 0) {
               var20 = (var7 & 16711680) >> 16;
               var21 = (var7 & '\uff00') >> 8;
               var22 = var7 & 255;
               var23 = var11;

               for(var24 = -var5; var24 < 0; ++var24) {
                  var25 = (var12 >> 16) * this.D;

                  for(var26 = -var4; var26 < 0; ++var26) {
                     var27 = this.E[(var11 >> 16) + var25];
                     var28 = (var27 & 16711680) * var20 & -16777216;
                     var29 = (var27 & '\uff00') * var21 & 16711680;
                     var30 = (var27 & 255) * var22 & '\uff00';
                     var34[var17] = (var28 | var29 | var30) >>> 8;
                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var23;
                  var17 += var18;
               }
            } else if(var6 == 3) {
               var20 = var11;

               for(var21 = -var5; var21 < 0; ++var21) {
                  var22 = (var12 >> 16) * this.D;

                  for(var23 = -var4; var23 < 0; ++var23) {
                     var24 = this.E[(var11 >> 16) + var22];
                     var25 = var24 + var7;
                     var26 = (var24 & 16711935) + (var7 & 16711935);
                     var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                     var34[var17] = var25 - var27 | var27 - (var27 >>> 8);
                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var20;
                  var17 += var18;
               }
            } else {
               if(var6 != 2) {
                  throw new IllegalArgumentException();
               }

               var20 = var7 >>> 24;
               var21 = 256 - var20;
               var22 = (var7 & 16711935) * var21 & -16711936;
               var23 = (var7 & '\uff00') * var21 & 16711680;
               var7 = (var22 | var23) >>> 8;
               var24 = var11;

               for(var25 = -var5; var25 < 0; ++var25) {
                  var26 = (var12 >> 16) * this.D;

                  for(var27 = -var4; var27 < 0; ++var27) {
                     var28 = this.E[(var11 >> 16) + var26];
                     var22 = (var28 & 16711935) * var20 & -16711936;
                     var23 = (var28 & '\uff00') * var20 & 16711680;
                     var34[var17] = ((var22 | var23) >>> 8) + var7;
                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var24;
                  var17 += var18;
               }
            }
         } else {
            int var31;
            int var32;
            int var33;
            if(var8 == 1) {
               if(var6 == 1) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     var22 = (var12 >> 16) * this.D;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = this.E[(var11 >> 16) + var22];
                        if(var24 != 0) {
                           var34[var17] = var24;
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else if(var6 == 0) {
                  var20 = var11;
                  if((var7 & 16777215) == 16777215) {
                     var21 = var7 >>> 24;
                     var22 = 256 - var21;

                     for(var23 = -var5; var23 < 0; ++var23) {
                        var24 = (var12 >> 16) * this.D;

                        for(var25 = -var4; var25 < 0; ++var25) {
                           var26 = this.E[(var11 >> 16) + var24];
                           if(var26 != 0) {
                              var27 = var34[var17];
                              var34[var17] = ((var26 & 16711935) * var21 + (var27 & 16711935) * var22 & -16711936) + ((var26 & '\uff00') * var21 + (var27 & '\uff00') * var22 & 16711680) >> 8;
                           }

                           var11 += var15;
                           ++var17;
                        }

                        var12 += var16;
                        var11 = var20;
                        var17 += var18;
                     }
                  } else {
                     var21 = (var7 & 16711680) >> 16;
                     var22 = (var7 & '\uff00') >> 8;
                     var23 = var7 & 255;
                     var24 = var7 >>> 24;
                     var25 = 256 - var24;

                     for(var26 = -var5; var26 < 0; ++var26) {
                        var27 = (var12 >> 16) * this.D;

                        for(var28 = -var4; var28 < 0; ++var28) {
                           var29 = this.E[(var11 >> 16) + var27];
                           if(var29 != 0) {
                              if(var24 != 255) {
                                 var30 = (var29 & 16711680) * var21 & -16777216;
                                 var31 = (var29 & '\uff00') * var22 & 16711680;
                                 var32 = (var29 & 255) * var23 & '\uff00';
                                 var29 = (var30 | var31 | var32) >>> 8;
                                 var33 = var34[var17];
                                 var34[var17] = ((var29 & 16711935) * var24 + (var33 & 16711935) * var25 & -16711936) + ((var29 & '\uff00') * var24 + (var33 & '\uff00') * var25 & 16711680) >> 8;
                              } else {
                                 var30 = (var29 & 16711680) * var21 & -16777216;
                                 var31 = (var29 & '\uff00') * var22 & 16711680;
                                 var32 = (var29 & 255) * var23 & '\uff00';
                                 var34[var17] = (var30 | var31 | var32) >>> 8;
                              }
                           }

                           var11 += var15;
                           ++var17;
                        }

                        var12 += var16;
                        var11 = var20;
                        var17 += var18;
                     }
                  }
               } else if(var6 == 3) {
                  var20 = var11;
                  var21 = var7 >>> 24;
                  var22 = 256 - var21;

                  for(var23 = -var5; var23 < 0; ++var23) {
                     var24 = (var12 >> 16) * this.D;

                     for(var25 = -var4; var25 < 0; ++var25) {
                        var26 = this.E[(var11 >> 16) + var24];
                        var27 = var26 + var7;
                        var28 = (var26 & 16711935) + (var7 & 16711935);
                        var29 = (var28 & 16777472) + (var27 - var28 & 65536);
                        var29 = var27 - var29 | var29 - (var29 >>> 8);
                        if(var26 == 0 && var21 != 255) {
                           var26 = var29;
                           var29 = var34[var17];
                           var29 = ((var26 & 16711935) * var21 + (var29 & 16711935) * var22 & -16711936) + ((var26 & '\uff00') * var21 + (var29 & '\uff00') * var22 & 16711680) >> 8;
                        }

                        var34[var17] = var29;
                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var20 = var7 >>> 24;
                  var21 = 256 - var20;
                  var22 = (var7 & 16711935) * var21 & -16711936;
                  var23 = (var7 & '\uff00') * var21 & 16711680;
                  var7 = (var22 | var23) >>> 8;
                  var24 = var11;

                  for(var25 = -var5; var25 < 0; ++var25) {
                     var26 = (var12 >> 16) * this.D;

                     for(var27 = -var4; var27 < 0; ++var27) {
                        var28 = this.E[(var11 >> 16) + var26];
                        if(var28 != 0) {
                           var22 = (var28 & 16711935) * var20 & -16711936;
                           var23 = (var28 & '\uff00') * var20 & 16711680;
                           var34[var17] = ((var22 | var23) >>> 8) + var7;
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var24;
                     var17 += var18;
                  }
               }
            } else {
               if(var8 != 2) {
                  throw new IllegalArgumentException();
               }

               if(var6 == 1) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     var22 = (var12 >> 16) * this.D;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = this.E[(var11 >> 16) + var22];
                        if(var24 != 0) {
                           var25 = var34[var17];
                           var26 = var24 + var25;
                           var27 = (var24 & 16711935) + (var25 & 16711935);
                           var25 = (var27 & 16777472) + (var26 - var27 & 65536);
                           var34[var17] = var26 - var25 | var25 - (var25 >>> 8);
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else if(var6 == 0) {
                  var20 = var11;
                  var21 = (var7 & 16711680) >> 16;
                  var22 = (var7 & '\uff00') >> 8;
                  var23 = var7 & 255;

                  for(var24 = -var5; var24 < 0; ++var24) {
                     var25 = (var12 >> 16) * this.D;

                     for(var26 = -var4; var26 < 0; ++var26) {
                        var27 = this.E[(var11 >> 16) + var25];
                        if(var27 != 0) {
                           var28 = (var27 & 16711680) * var21 & -16777216;
                           var29 = (var27 & '\uff00') * var22 & 16711680;
                           var30 = (var27 & 255) * var23 & '\uff00';
                           var27 = (var28 | var29 | var30) >>> 8;
                           var31 = var34[var17];
                           var32 = var27 + var31;
                           var33 = (var27 & 16711935) + (var31 & 16711935);
                           var31 = (var33 & 16777472) + (var32 - var33 & 65536);
                           var34[var17] = var32 - var31 | var31 - (var31 >>> 8);
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else if(var6 == 3) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     var22 = (var12 >> 16) * this.D;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = this.E[(var11 >> 16) + var22];
                        var25 = var24 + var7;
                        var26 = (var24 & 16711935) + (var7 & 16711935);
                        var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                        var24 = var25 - var27 | var27 - (var27 >>> 8);
                        var27 = var34[var17];
                        var25 = var24 + var27;
                        var26 = (var24 & 16711935) + (var27 & 16711935);
                        var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                        var34[var17] = var25 - var27 | var27 - (var27 >>> 8);
                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var20 = var7 >>> 24;
                  var21 = 256 - var20;
                  var22 = (var7 & 16711935) * var21 & -16711936;
                  var23 = (var7 & '\uff00') * var21 & 16711680;
                  var7 = (var22 | var23) >>> 8;
                  var24 = var11;

                  for(var25 = -var5; var25 < 0; ++var25) {
                     var26 = (var12 >> 16) * this.D;

                     for(var27 = -var4; var27 < 0; ++var27) {
                        var28 = this.E[(var11 >> 16) + var26];
                        if(var28 != 0) {
                           var22 = (var28 & 16711935) * var20 & -16711936;
                           var23 = (var28 & '\uff00') * var20 & 16711680;
                           var28 = ((var22 | var23) >>> 8) + var7;
                           var29 = var34[var17];
                           var30 = var28 + var29;
                           var31 = (var28 & 16711935) + (var29 & 16711935);
                           var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                           var34[var17] = var30 - var29 | var29 - (var29 >>> 8);
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var24;
                     var17 += var18;
                  }
               }
            }
         }

      }
   }

   hra(Object[] var1, int var2, int var3) {
      super(var1, var2, var3);
      this.E = new int[var2 * var3];
   }

   final void a(int[] var1, int[] var2, int var3, int var4) {
      int[] var5 = (int[])((int[])this.C[7]);
      if(var5 != null) {
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         if(s == 0) {
            if(o == 0) {
               for(var7 = w; var7 < 0; m += A) {
                  var8 = var7 + var4;
                  if(var8 >= 0) {
                     if(var8 >= var1.length) {
                        return;
                     }

                     var9 = m;
                     var10 = f_i;
                     var11 = H;
                     var12 = G;
                     if(var10 >= 0 && var11 >= 0 && var10 - (this.D << 12) < 0 && var11 - (this.u << 12) < 0) {
                        var13 = var1[var8] - var3;
                        var14 = -var2[var8];
                        var15 = var13 - (var9 - m);
                        if(var15 > 0) {
                           var9 += var15;
                           var12 += var15;
                           var10 += s * var15;
                           var11 += o * var15;
                        } else {
                           var14 -= var15;
                        }

                        if(var12 < var14) {
                           var12 = var14;
                        }

                        for(; var12 < 0; ++var12) {
                           var16 = this.E[(var11 >> 12) * this.D + (var10 >> 12)];
                           if(var16 != 0) {
                              var5[var9++] = var16;
                           } else {
                              ++var9;
                           }
                        }
                     }
                  }

                  ++var7;
               }
            } else if(o < 0) {
               for(var7 = w; var7 < 0; m += A) {
                  var8 = var7 + var4;
                  if(var8 >= 0) {
                     if(var8 >= var1.length) {
                        return;
                     }

                     var9 = m;
                     var10 = f_i;
                     var11 = H + e;
                     var12 = G;
                     if(var10 >= 0 && var10 - (this.D << 12) < 0) {
                        if((var6 = var11 - (this.u << 12)) >= 0) {
                           var6 = (o - var6) / o;
                           var12 += var6;
                           var11 += o * var6;
                           var9 += var6;
                        }

                        if((var6 = (var11 - o) / o) > var12) {
                           var12 = var6;
                        }

                        var13 = var1[var8] - var3;
                        var14 = -var2[var8];
                        var15 = var13 - (var9 - m);
                        if(var15 > 0) {
                           var9 += var15;
                           var12 += var15;
                           var10 += s * var15;
                           var11 += o * var15;
                        } else {
                           var14 -= var15;
                        }

                        if(var12 < var14) {
                           var12 = var14;
                        }

                        while(var12 < 0) {
                           var16 = this.E[(var11 >> 12) * this.D + (var10 >> 12)];
                           if(var16 != 0) {
                              var5[var9++] = var16;
                           } else {
                              ++var9;
                           }

                           var11 += o;
                           ++var12;
                        }
                     }
                  }

                  ++var7;
                  f_i += B;
               }
            } else {
               for(var7 = w; var7 < 0; m += A) {
                  var8 = var7 + var4;
                  if(var8 >= 0) {
                     if(var8 >= var1.length) {
                        return;
                     }

                     var9 = m;
                     var10 = f_i;
                     var11 = H + e;
                     var12 = G;
                     if(var10 >= 0 && var10 - (this.D << 12) < 0) {
                        if(var11 < 0) {
                           var6 = (o - 1 - var11) / o;
                           var12 += var6;
                           var11 += o * var6;
                           var9 += var6;
                        }

                        if((var6 = (1 + var11 - (this.u << 12) - o) / o) > var12) {
                           var12 = var6;
                        }

                        var13 = var1[var8] - var3;
                        var14 = -var2[var8];
                        var15 = var13 - (var9 - m);
                        if(var15 > 0) {
                           var9 += var15;
                           var12 += var15;
                           var10 += s * var15;
                           var11 += o * var15;
                        } else {
                           var14 -= var15;
                        }

                        if(var12 < var14) {
                           var12 = var14;
                        }

                        while(var12 < 0) {
                           var16 = this.E[(var11 >> 12) * this.D + (var10 >> 12)];
                           if(var16 != 0) {
                              var5[var9++] = var16;
                           } else {
                              ++var9;
                           }

                           var11 += o;
                           ++var12;
                        }
                     }
                  }

                  ++var7;
                  f_i += B;
               }
            }
         } else if(s < 0) {
            if(o == 0) {
               for(var7 = w; var7 < 0; m += A) {
                  var8 = var7 + var4;
                  if(var8 >= 0) {
                     if(var8 >= var1.length) {
                        return;
                     }

                     var9 = m;
                     var10 = f_i + c;
                     var11 = H;
                     var12 = G;
                     if(var11 >= 0 && var11 - (this.u << 12) < 0) {
                        if((var6 = var10 - (this.D << 12)) >= 0) {
                           var6 = (s - var6) / s;
                           var12 += var6;
                           var10 += s * var6;
                           var9 += var6;
                        }

                        if((var6 = (var10 - s) / s) > var12) {
                           var12 = var6;
                        }

                        var13 = var1[var8] - var3;
                        var14 = -var2[var8];
                        var15 = var13 - (var9 - m);
                        if(var15 > 0) {
                           var9 += var15;
                           var12 += var15;
                           var10 += s * var15;
                           var11 += o * var15;
                        } else {
                           var14 -= var15;
                        }

                        if(var12 < var14) {
                           var12 = var14;
                        }

                        while(var12 < 0) {
                           var16 = this.E[(var11 >> 12) * this.D + (var10 >> 12)];
                           if(var16 != 0) {
                              var5[var9++] = var16;
                           } else {
                              ++var9;
                           }

                           var10 += s;
                           ++var12;
                        }
                     }
                  }

                  ++var7;
                  H += d;
               }
            } else if(o < 0) {
               for(var7 = w; var7 < 0; m += A) {
                  var8 = var7 + var4;
                  if(var8 >= 0) {
                     if(var8 >= var1.length) {
                        return;
                     }

                     var9 = m;
                     var10 = f_i + c;
                     var11 = H + e;
                     var12 = G;
                     if((var6 = var10 - (this.D << 12)) >= 0) {
                        var6 = (s - var6) / s;
                        var12 += var6;
                        var10 += s * var6;
                        var11 += o * var6;
                        var9 += var6;
                     }

                     if((var6 = (var10 - s) / s) > var12) {
                        var12 = var6;
                     }

                     if((var6 = var11 - (this.u << 12)) >= 0) {
                        var6 = (o - var6) / o;
                        var12 += var6;
                        var10 += s * var6;
                        var11 += o * var6;
                        var9 += var6;
                     }

                     if((var6 = (var11 - o) / o) > var12) {
                        var12 = var6;
                     }

                     var13 = var1[var8] - var3;
                     var14 = -var2[var8];
                     var15 = var13 - (var9 - m);
                     if(var15 > 0) {
                        var9 += var15;
                        var12 += var15;
                        var10 += s * var15;
                        var11 += o * var15;
                     } else {
                        var14 -= var15;
                     }

                     if(var12 < var14) {
                        var12 = var14;
                     }

                     while(var12 < 0) {
                        var16 = this.E[(var11 >> 12) * this.D + (var10 >> 12)];
                        if(var16 != 0) {
                           var5[var9++] = var16;
                        } else {
                           ++var9;
                        }

                        var10 += s;
                        var11 += o;
                        ++var12;
                     }
                  }

                  ++var7;
                  f_i += B;
                  H += d;
               }
            } else {
               for(var7 = w; var7 < 0; m += A) {
                  var8 = var7 + var4;
                  if(var8 >= 0) {
                     if(var8 >= var1.length) {
                        return;
                     }

                     var9 = m;
                     var10 = f_i + c;
                     var11 = H + e;
                     var12 = G;
                     if((var6 = var10 - (this.D << 12)) >= 0) {
                        var6 = (s - var6) / s;
                        var12 += var6;
                        var10 += s * var6;
                        var11 += o * var6;
                        var9 += var6;
                     }

                     if((var6 = (var10 - s) / s) > var12) {
                        var12 = var6;
                     }

                     if(var11 < 0) {
                        var6 = (o - 1 - var11) / o;
                        var12 += var6;
                        var10 += s * var6;
                        var11 += o * var6;
                        var9 += var6;
                     }

                     if((var6 = (1 + var11 - (this.u << 12) - o) / o) > var12) {
                        var12 = var6;
                     }

                     var13 = var1[var8] - var3;
                     var14 = -var2[var8];
                     var15 = var13 - (var9 - m);
                     if(var15 > 0) {
                        var9 += var15;
                        var12 += var15;
                        var10 += s * var15;
                        var11 += o * var15;
                     } else {
                        var14 -= var15;
                     }

                     if(var12 < var14) {
                        var12 = var14;
                     }

                     while(var12 < 0) {
                        var16 = this.E[(var11 >> 12) * this.D + (var10 >> 12)];
                        if(var16 != 0) {
                           var5[var9++] = var16;
                        } else {
                           ++var9;
                        }

                        var10 += s;
                        var11 += o;
                        ++var12;
                     }
                  }

                  ++var7;
                  f_i += B;
                  H += d;
               }
            }
         } else if(o == 0) {
            for(var7 = w; var7 < 0; m += A) {
               var8 = var7 + var4;
               if(var8 >= 0) {
                  if(var8 >= var1.length) {
                     return;
                  }

                  var9 = m;
                  var10 = f_i + c;
                  var11 = H;
                  var12 = G;
                  if(var11 >= 0 && var11 - (this.u << 12) < 0) {
                     if(var10 < 0) {
                        var6 = (s - 1 - var10) / s;
                        var12 += var6;
                        var10 += s * var6;
                        var9 += var6;
                     }

                     if((var6 = (1 + var10 - (this.D << 12) - s) / s) > var12) {
                        var12 = var6;
                     }

                     var13 = var1[var8] - var3;
                     var14 = -var2[var8];
                     var15 = var13 - (var9 - m);
                     if(var15 > 0) {
                        var9 += var15;
                        var12 += var15;
                        var10 += s * var15;
                        var11 += o * var15;
                     } else {
                        var14 -= var15;
                     }

                     if(var12 < var14) {
                        var12 = var14;
                     }

                     while(var12 < 0) {
                        var16 = this.E[(var11 >> 12) * this.D + (var10 >> 12)];
                        if(var16 != 0) {
                           var5[var9++] = var16;
                        } else {
                           ++var9;
                        }

                        var10 += s;
                        ++var12;
                     }
                  }
               }

               ++var7;
               f_i += B;
               H += d;
            }
         } else if(o < 0) {
            for(var7 = w; var7 < 0; m += A) {
               var8 = var7 + var4;
               if(var8 >= 0) {
                  if(var8 >= var1.length) {
                     return;
                  }

                  var9 = m;
                  var10 = f_i + c;
                  var11 = H + e;
                  var12 = G;
                  if(var10 < 0) {
                     var6 = (s - 1 - var10) / s;
                     var12 += var6;
                     var10 += s * var6;
                     var11 += o * var6;
                     var9 += var6;
                  }

                  if((var6 = (1 + var10 - (this.D << 12) - s) / s) > var12) {
                     var12 = var6;
                  }

                  if((var6 = var11 - (this.u << 12)) >= 0) {
                     var6 = (o - var6) / o;
                     var12 += var6;
                     var10 += s * var6;
                     var11 += o * var6;
                     var9 += var6;
                  }

                  if((var6 = (var11 - o) / o) > var12) {
                     var12 = var6;
                  }

                  var13 = var1[var8] - var3;
                  var14 = -var2[var8];
                  var15 = var13 - (var9 - m);
                  if(var15 > 0) {
                     var9 += var15;
                     var12 += var15;
                     var10 += s * var15;
                     var11 += o * var15;
                  } else {
                     var14 -= var15;
                  }

                  if(var12 < var14) {
                     var12 = var14;
                  }

                  while(var12 < 0) {
                     var16 = this.E[(var11 >> 12) * this.D + (var10 >> 12)];
                     if(var16 != 0) {
                        var5[var9++] = var16;
                     } else {
                        ++var9;
                     }

                     var10 += s;
                     var11 += o;
                     ++var12;
                  }
               }

               ++var7;
               f_i += B;
               H += d;
            }
         } else {
            for(var7 = w; var7 < 0; m += A) {
               var8 = var7 + var4;
               if(var8 >= 0) {
                  if(var8 >= var1.length) {
                     return;
                  }

                  var9 = m;
                  var10 = f_i + c;
                  var11 = H + e;
                  var12 = G;
                  if(var10 < 0) {
                     var6 = (s - 1 - var10) / s;
                     var12 += var6;
                     var10 += s * var6;
                     var11 += o * var6;
                     var9 += var6;
                  }

                  if((var6 = (1 + var10 - (this.D << 12) - s) / s) > var12) {
                     var12 = var6;
                  }

                  if(var11 < 0) {
                     var6 = (o - 1 - var11) / o;
                     var12 += var6;
                     var10 += s * var6;
                     var11 += o * var6;
                     var9 += var6;
                  }

                  if((var6 = (1 + var11 - (this.u << 12) - o) / o) > var12) {
                     var12 = var6;
                  }

                  var13 = var1[var8] - var3;
                  var14 = -var2[var8];
                  var15 = var13 - (var9 - m);
                  if(var15 > 0) {
                     var9 += var15;
                     var12 += var15;
                     var10 += s * var15;
                     var11 += o * var15;
                  } else {
                     var14 -= var15;
                  }

                  if(var12 < var14) {
                     var12 = var14;
                  }

                  while(var12 < 0) {
                     var16 = this.E[(var11 >> 12) * this.D + (var10 >> 12)];
                     if(var16 != 0) {
                        var5[var9++] = var16;
                     } else {
                        ++var9;
                     }

                     var10 += s;
                     var11 += o;
                     ++var12;
                  }
               }

               ++var7;
               f_i += B;
               H += d;
            }
         }

      }
   }

   final void b(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      if(var4 > 0 && var5 > 0) {
         int var11 = 0;
         int var12 = 0;
         int var13 = this.z + this.D + this.v;
         int var14 = this.j + this.u + this.a;
         int var15 = (var13 << 16) / var4;
         int var16 = (var14 << 16) / var5;
         int var17;
         if(this.z > 0) {
            var17 = ((this.z << 16) + var15 - 1) / var15;
            var1 += var17;
            var11 += var17 * var15 - (this.z << 16);
         }

         if(this.j > 0) {
            var17 = ((this.j << 16) + var16 - 1) / var16;
            var2 += var17;
            var12 += var17 * var16 - (this.j << 16);
         }

         if(this.D < var13) {
            var4 = ((this.D << 16) - var11 + var15 - 1) / var15;
         }

         if(this.u < var14) {
            var5 = ((this.u << 16) - var12 + var16 - 1) / var16;
         }

         var17 = var1 + var2 * ((int[])((int[])this.C[1]))[4];
         int var18 = ((int[])((int[])this.C[1]))[4] - var4;
         if(var2 + var5 > ((int[])((int[])this.C[1]))[1]) {
            var5 -= var2 + var5 - ((int[])((int[])this.C[1]))[1];
         }

         int var19;
         if(var2 < ((int[])((int[])this.C[1]))[16]) {
            var19 = ((int[])((int[])this.C[1]))[16] - var2;
            var5 -= var19;
            var17 += var19 * ((int[])((int[])this.C[1]))[4];
            var12 += var16 * var19;
         }

         if(var1 + var4 > ((int[])((int[])this.C[1]))[19]) {
            var19 = var1 + var4 - ((int[])((int[])this.C[1]))[19];
            var4 -= var19;
            var18 += var19;
         }

         if(var1 < ((int[])((int[])this.C[1]))[7]) {
            var19 = ((int[])((int[])this.C[1]))[7] - var1;
            var4 -= var19;
            var17 += var19;
            var11 += var15 * var19;
            var18 += var19;
         }

         int[] var34 = (int[])((int[])this.C[7]);
         int var21;
         int var20;
         int var23;
         int var22;
         int var25;
         int var24;
         int var27;
         int var26;
         int var29;
         int var28;
         int var30;
         if(var8 == 0) {
            if(var6 == 1) {
               var20 = var11;

               for(var21 = -var5; var21 < 0; ++var21) {
                  var22 = (var12 >> 16) * this.D;

                  for(var23 = -var4; var23 < 0; ++var23) {
                     var34[var17] = this.E[(var11 >> 16) + var22];
                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var20;
                  var17 += var18;
               }
            } else if(var6 == 0) {
               var20 = (var7 & 16711680) >> 16;
               var21 = (var7 & '\uff00') >> 8;
               var22 = var7 & 255;
               var23 = var11;

               for(var24 = -var5; var24 < 0; ++var24) {
                  var25 = (var12 >> 16) * this.D;

                  for(var26 = -var4; var26 < 0; ++var26) {
                     var27 = this.E[(var11 >> 16) + var25];
                     var28 = (var27 & 16711680) * var20 & -16777216;
                     var29 = (var27 & '\uff00') * var21 & 16711680;
                     var30 = (var27 & 255) * var22 & '\uff00';
                     var34[var17] = (var28 | var29 | var30) >>> 8;
                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var23;
                  var17 += var18;
               }
            } else if(var6 == 3) {
               var20 = var11;

               for(var21 = -var5; var21 < 0; ++var21) {
                  var22 = (var12 >> 16) * this.D;

                  for(var23 = -var4; var23 < 0; ++var23) {
                     var24 = this.E[(var11 >> 16) + var22];
                     var25 = var24 + var7;
                     var26 = (var24 & 16711935) + (var7 & 16711935);
                     var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                     var34[var17] = var25 - var27 | var27 - (var27 >>> 8);
                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var20;
                  var17 += var18;
               }
            } else {
               if(var6 != 2) {
                  throw new IllegalArgumentException();
               }

               var20 = var7 >>> 24;
               var21 = 256 - var20;
               var22 = (var7 & 16711935) * var21 & -16711936;
               var23 = (var7 & '\uff00') * var21 & 16711680;
               var7 = (var22 | var23) >>> 8;
               var24 = var11;

               for(var25 = -var5; var25 < 0; ++var25) {
                  var26 = (var12 >> 16) * this.D;

                  for(var27 = -var4; var27 < 0; ++var27) {
                     var28 = this.E[(var11 >> 16) + var26];
                     var22 = (var28 & 16711935) * var20 & -16711936;
                     var23 = (var28 & '\uff00') * var20 & 16711680;
                     var34[var17] = ((var22 | var23) >>> 8) + var7;
                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var24;
                  var17 += var18;
               }
            }
         } else {
            int var31;
            int var32;
            int var33;
            if(var8 == 1) {
               if(var6 == 1) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     var22 = (var12 >> 16) * this.D;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = this.E[(var11 >> 16) + var22];
                        if(var24 != 0) {
                           var34[var17] = var24;
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else if(var6 == 0) {
                  var20 = var11;
                  if((var7 & 16777215) == 16777215) {
                     var21 = var7 >>> 24;
                     var22 = 256 - var21;

                     for(var23 = -var5; var23 < 0; ++var23) {
                        var24 = (var12 >> 16) * this.D;

                        for(var25 = -var4; var25 < 0; ++var25) {
                           var26 = this.E[(var11 >> 16) + var24];
                           if(var26 != 0) {
                              var27 = var34[var17];
                              var34[var17] = ((var26 & 16711935) * var21 + (var27 & 16711935) * var22 & -16711936) + ((var26 & '\uff00') * var21 + (var27 & '\uff00') * var22 & 16711680) >> 8;
                           }

                           var11 += var15;
                           ++var17;
                        }

                        var12 += var16;
                        var11 = var20;
                        var17 += var18;
                     }
                  } else {
                     var21 = (var7 & 16711680) >> 16;
                     var22 = (var7 & '\uff00') >> 8;
                     var23 = var7 & 255;
                     var24 = var7 >>> 24;
                     var25 = 256 - var24;

                     for(var26 = -var5; var26 < 0; ++var26) {
                        var27 = (var12 >> 16) * this.D;

                        for(var28 = -var4; var28 < 0; ++var28) {
                           var29 = this.E[(var11 >> 16) + var27];
                           if(var29 != 0) {
                              if(var24 != 255) {
                                 var30 = (var29 & 16711680) * var21 & -16777216;
                                 var31 = (var29 & '\uff00') * var22 & 16711680;
                                 var32 = (var29 & 255) * var23 & '\uff00';
                                 var29 = (var30 | var31 | var32) >>> 8;
                                 var33 = var34[var17];
                                 var34[var17] = ((var29 & 16711935) * var24 + (var33 & 16711935) * var25 & -16711936) + ((var29 & '\uff00') * var24 + (var33 & '\uff00') * var25 & 16711680) >> 8;
                              } else {
                                 var30 = (var29 & 16711680) * var21 & -16777216;
                                 var31 = (var29 & '\uff00') * var22 & 16711680;
                                 var32 = (var29 & 255) * var23 & '\uff00';
                                 var34[var17] = (var30 | var31 | var32) >>> 8;
                              }
                           }

                           var11 += var15;
                           ++var17;
                        }

                        var12 += var16;
                        var11 = var20;
                        var17 += var18;
                     }
                  }
               } else if(var6 == 3) {
                  var20 = var11;
                  var21 = var7 >>> 24;
                  var22 = 256 - var21;

                  for(var23 = -var5; var23 < 0; ++var23) {
                     var24 = (var12 >> 16) * this.D;

                     for(var25 = -var4; var25 < 0; ++var25) {
                        var26 = this.E[(var11 >> 16) + var24];
                        var27 = var26 + var7;
                        var28 = (var26 & 16711935) + (var7 & 16711935);
                        var29 = (var28 & 16777472) + (var27 - var28 & 65536);
                        var29 = var27 - var29 | var29 - (var29 >>> 8);
                        if(var26 == 0 && var21 != 255) {
                           var26 = var29;
                           var29 = var34[var17];
                           var29 = ((var26 & 16711935) * var21 + (var29 & 16711935) * var22 & -16711936) + ((var26 & '\uff00') * var21 + (var29 & '\uff00') * var22 & 16711680) >> 8;
                        }

                        var34[var17] = var29;
                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var20 = var7 >>> 24;
                  var21 = 256 - var20;
                  var22 = (var7 & 16711935) * var21 & -16711936;
                  var23 = (var7 & '\uff00') * var21 & 16711680;
                  var7 = (var22 | var23) >>> 8;
                  var24 = var11;

                  for(var25 = -var5; var25 < 0; ++var25) {
                     var26 = (var12 >> 16) * this.D;

                     for(var27 = -var4; var27 < 0; ++var27) {
                        var28 = this.E[(var11 >> 16) + var26];
                        if(var28 != 0) {
                           var22 = (var28 & 16711935) * var20 & -16711936;
                           var23 = (var28 & '\uff00') * var20 & 16711680;
                           var34[var17] = ((var22 | var23) >>> 8) + var7;
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var24;
                     var17 += var18;
                  }
               }
            } else {
               if(var8 != 2) {
                  throw new IllegalArgumentException();
               }

               if(var6 == 1) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     var22 = (var12 >> 16) * this.D;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = this.E[(var11 >> 16) + var22];
                        if(var24 != 0) {
                           var25 = var34[var17];
                           var26 = var24 + var25;
                           var27 = (var24 & 16711935) + (var25 & 16711935);
                           var25 = (var27 & 16777472) + (var26 - var27 & 65536);
                           var34[var17] = var26 - var25 | var25 - (var25 >>> 8);
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else if(var6 == 0) {
                  var20 = var11;
                  var21 = (var7 & 16711680) >> 16;
                  var22 = (var7 & '\uff00') >> 8;
                  var23 = var7 & 255;

                  for(var24 = -var5; var24 < 0; ++var24) {
                     var25 = (var12 >> 16) * this.D;

                     for(var26 = -var4; var26 < 0; ++var26) {
                        var27 = this.E[(var11 >> 16) + var25];
                        if(var27 != 0) {
                           var28 = (var27 & 16711680) * var21 & -16777216;
                           var29 = (var27 & '\uff00') * var22 & 16711680;
                           var30 = (var27 & 255) * var23 & '\uff00';
                           var27 = (var28 | var29 | var30) >>> 8;
                           var31 = var34[var17];
                           var32 = var27 + var31;
                           var33 = (var27 & 16711935) + (var31 & 16711935);
                           var31 = (var33 & 16777472) + (var32 - var33 & 65536);
                           var34[var17] = var32 - var31 | var31 - (var31 >>> 8);
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else if(var6 == 3) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     var22 = (var12 >> 16) * this.D;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = this.E[(var11 >> 16) + var22];
                        var25 = var24 + var7;
                        var26 = (var24 & 16711935) + (var7 & 16711935);
                        var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                        var24 = var25 - var27 | var27 - (var27 >>> 8);
                        var27 = var34[var17];
                        var25 = var24 + var27;
                        var26 = (var24 & 16711935) + (var27 & 16711935);
                        var27 = (var26 & 16777472) + (var25 - var26 & 65536);
                        var34[var17] = var25 - var27 | var27 - (var27 >>> 8);
                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var20 = var7 >>> 24;
                  var21 = 256 - var20;
                  var22 = (var7 & 16711935) * var21 & -16711936;
                  var23 = (var7 & '\uff00') * var21 & 16711680;
                  var7 = (var22 | var23) >>> 8;
                  var24 = var11;

                  for(var25 = -var5; var25 < 0; ++var25) {
                     var26 = (var12 >> 16) * this.D;

                     for(var27 = -var4; var27 < 0; ++var27) {
                        var28 = this.E[(var11 >> 16) + var26];
                        if(var28 != 0) {
                           var22 = (var28 & 16711935) * var20 & -16711936;
                           var23 = (var28 & '\uff00') * var20 & 16711680;
                           var28 = ((var22 | var23) >>> 8) + var7;
                           var29 = var34[var17];
                           var30 = var28 + var29;
                           var31 = (var28 & 16711935) + (var29 & 16711935);
                           var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                           var34[var17] = var30 - var29 | var29 - (var29 >>> 8);
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var24;
                     var17 += var18;
                  }
               }
            }
         }

      }
   }

   final void c(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      if(var4 > 0 && var5 > 0) {
         int var11 = 0;
         int var12 = 0;
         int var13 = this.z + this.D + this.v;
         int var14 = this.j + this.u + this.a;
         int var15 = (var13 << 16) / var4;
         int var16 = (var14 << 16) / var5;
         int var17;
         if(this.z > 0) {
            var17 = ((this.z << 16) + var15 - 1) / var15;
            var1 += var17;
            var11 += var17 * var15 - (this.z << 16);
         }

         if(this.j > 0) {
            var17 = ((this.j << 16) + var16 - 1) / var16;
            var2 += var17;
            var12 += var17 * var16 - (this.j << 16);
         }

         if(this.D < var13) {
            var4 = ((this.D << 16) - var11 + var15 - 1) / var15;
         }

         if(this.u < var14) {
            var5 = ((this.u << 16) - var12 + var16 - 1) / var16;
         }

         var17 = var1 + var2 * ((int[])((int[])this.C[1]))[4];
         int var18 = ((int[])((int[])this.C[1]))[4] - var4;
         if(var2 + var5 > ((int[])((int[])this.C[1]))[1]) {
            var5 -= var2 + var5 - ((int[])((int[])this.C[1]))[1];
         }

         int var19;
         if(var2 < ((int[])((int[])this.C[1]))[16]) {
            var19 = ((int[])((int[])this.C[1]))[16] - var2;
            var5 -= var19;
            var17 += var19 * ((int[])((int[])this.C[1]))[4];
            var12 += var16 * var19;
         }

         if(var1 + var4 > ((int[])((int[])this.C[1]))[19]) {
            var19 = var1 + var4 - ((int[])((int[])this.C[1]))[19];
            var4 -= var19;
            var18 += var19;
         }

         if(var1 < ((int[])((int[])this.C[1]))[7]) {
            var19 = ((int[])((int[])this.C[1]))[7] - var1;
            var4 -= var19;
            var17 += var19;
            var11 += var15 * var19;
            var18 += var19;
         }

         float[] var29 = (float[])((float[])this.C[12]);
         int var21;
         int var20;
         int var23;
         int var22;
         int var25;
         int var24;
         int var26;
         if(var8 == 0) {
            if(var6 == 1) {
               var20 = var11;

               for(var21 = -var5; var21 < 0; ++var21) {
                  for(var22 = -var4; var22 < 0; ++var22) {
                     if(var3 < var29[var17] && var10) {
                        var29[var17] = var3;
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var20;
                  var17 += var18;
               }
            } else if(var6 == 0) {
               var20 = var11;

               for(var21 = -var5; var21 < 0; ++var21) {
                  for(var22 = -var4; var22 < 0; ++var22) {
                     if(var3 < var29[var17] && var10) {
                        var29[var17] = var3;
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var20;
                  var17 += var18;
               }
            } else if(var6 == 3) {
               var20 = var11;

               for(var21 = -var5; var21 < 0; ++var21) {
                  for(var22 = -var4; var22 < 0; ++var22) {
                     if(var3 < var29[var17] && var10) {
                        var29[var17] = var3;
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var20;
                  var17 += var18;
               }
            } else {
               if(var6 != 2) {
                  throw new IllegalArgumentException();
               }

               var20 = var7 >>> 24;
               var21 = 256 - var20;
               var22 = (var7 & 16711935) * var21 & -16711936;
               var23 = (var7 & '\uff00') * var21 & 16711680;
               var7 = (var22 | var23) >>> 8;
               var24 = var11;

               for(var25 = -var5; var25 < 0; ++var25) {
                  for(var26 = -var4; var26 < 0; ++var26) {
                     if(var3 < var29[var17] && var10) {
                        var29[var17] = var3;
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var24;
                  var17 += var18;
               }
            }
         } else {
            int var27;
            int var28;
            if(var8 == 1) {
               if(var6 == 1) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     var22 = (var12 >> 16) * this.D;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        if(var3 < var29[var17]) {
                           var24 = this.E[(var11 >> 16) + var22];
                           if(var24 != 0 && var10) {
                              var29[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else if(var6 == 0) {
                  var20 = var11;
                  if((var7 & 16777215) == 16777215) {
                     for(var21 = -var5; var21 < 0; ++var21) {
                        var22 = (var12 >> 16) * this.D;

                        for(var23 = -var4; var23 < 0; ++var23) {
                           if(var3 < var29[var17]) {
                              var24 = this.E[(var11 >> 16) + var22];
                              if(var24 != 0 && var10) {
                                 var29[var17] = var3;
                              }
                           }

                           var11 += var15;
                           ++var17;
                        }

                        var12 += var16;
                        var11 = var20;
                        var17 += var18;
                     }
                  } else {
                     var21 = var7 >>> 24;

                     for(var22 = -var5; var22 < 0; ++var22) {
                        var23 = (var12 >> 16) * this.D;

                        for(var24 = -var4; var24 < 0; ++var24) {
                           if(var3 < var29[var17]) {
                              var25 = this.E[(var11 >> 16) + var23];
                              if(var25 != 0) {
                                 if(var21 != 255) {
                                    if(var10) {
                                       var29[var17] = var3;
                                    }
                                 } else if(var10) {
                                    var29[var17] = var3;
                                 }
                              }
                           }

                           var11 += var15;
                           ++var17;
                        }

                        var12 += var16;
                        var11 = var20;
                        var17 += var18;
                     }
                  }
               } else if(var6 == 3) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     for(var22 = -var4; var22 < 0; ++var22) {
                        if(var3 < var29[var17] && var10) {
                           var29[var17] = var3;
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var20 = var7 >>> 24;
                  var21 = 256 - var20;
                  var22 = (var7 & 16711935) * var21 & -16711936;
                  var23 = (var7 & '\uff00') * var21 & 16711680;
                  var7 = (var22 | var23) >>> 8;
                  var24 = var11;

                  for(var25 = -var5; var25 < 0; ++var25) {
                     var26 = (var12 >> 16) * this.D;

                     for(var27 = -var4; var27 < 0; ++var27) {
                        if(var3 < var29[var17]) {
                           var28 = this.E[(var11 >> 16) + var26];
                           if(var28 != 0 && var10) {
                              var29[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var24;
                     var17 += var18;
                  }
               }
            } else {
               if(var8 != 2) {
                  throw new IllegalArgumentException();
               }

               if(var6 == 1) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     var22 = (var12 >> 16) * this.D;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        if(var3 < var29[var17]) {
                           var24 = this.E[(var11 >> 16) + var22];
                           if(var24 != 0 && var10) {
                              var29[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else if(var6 == 0) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     var22 = (var12 >> 16) * this.D;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        if(var3 < var29[var17]) {
                           var24 = this.E[(var11 >> 16) + var22];
                           if(var24 != 0 && var10) {
                              var29[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else if(var6 == 3) {
                  var20 = var11;

                  for(var21 = -var5; var21 < 0; ++var21) {
                     for(var22 = -var4; var22 < 0; ++var22) {
                        if(var3 < var29[var17] && var10) {
                           var29[var17] = var3;
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var20;
                     var17 += var18;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var20 = var7 >>> 24;
                  var21 = 256 - var20;
                  var22 = (var7 & 16711935) * var21 & -16711936;
                  var23 = (var7 & '\uff00') * var21 & 16711680;
                  var7 = (var22 | var23) >>> 8;
                  var24 = var11;

                  for(var25 = -var5; var25 < 0; ++var25) {
                     var26 = (var12 >> 16) * this.D;

                     for(var27 = -var4; var27 < 0; ++var27) {
                        if(var3 < var29[var17]) {
                           var28 = this.E[(var11 >> 16) + var26];
                           if(var28 != 0 && var10) {
                              var29[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var24;
                     var17 += var18;
                  }
               }
            }
         }

      }
   }

   final void g(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      if(var4 <= 0 || var5 <= 0) {
         ;
      }
   }

   hra(Object[] var1, int[] var2, int var3, int var4) {
      super(var1, var3, var4);
      this.E = var2;
   }

   final void a(int var1, int var2, int var3, int var4, int var5) {
      if(ui.m(this.C)) {
         throw new IllegalStateException();
      } else {
         int[] var6 = (int[])((int[])this.C[7]);
         if(var6 != null) {
            int var7 = ((int[])((int[])this.C[1]))[4];
            var1 += this.z;
            var2 += this.j;
            int var8 = var2 * var7 + var1;
            int var9 = 0;
            int var10 = this.u;
            int var11 = this.D;
            int var12 = var7 - var11;
            int var13 = 0;
            int var14;
            if(var2 < ((int[])((int[])this.C[1]))[16]) {
               var14 = ((int[])((int[])this.C[1]))[16] - var2;
               var10 -= var14;
               var2 = ((int[])((int[])this.C[1]))[16];
               var9 += var14 * var11;
               var8 += var14 * var7;
            }

            if(var2 + var10 > ((int[])((int[])this.C[1]))[1]) {
               var10 -= var2 + var10 - ((int[])((int[])this.C[1]))[1];
            }

            if(var1 < ((int[])((int[])this.C[1]))[7]) {
               var14 = ((int[])((int[])this.C[1]))[7] - var1;
               var11 -= var14;
               var1 = ((int[])((int[])this.C[1]))[7];
               var9 += var14;
               var8 += var14;
               var13 += var14;
               var12 += var14;
            }

            if(var1 + var11 > ((int[])((int[])this.C[1]))[19]) {
               var14 = var1 + var11 - ((int[])((int[])this.C[1]))[19];
               var11 -= var14;
               var13 += var14;
               var12 += var14;
            }

            if(var11 > 0 && var10 > 0) {
               int var15;
               int var17;
               int var16;
               int var19;
               int var18;
               int var21;
               int var20;
               int var22;
               if(var5 == 0) {
                  if(var3 == 1) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = var8 + var11 - 3; var8 < var15; var6[var8++] = this.E[var9++]) {
                           var6[var8++] = this.E[var9++];
                           var6[var8++] = this.E[var9++];
                           var6[var8++] = this.E[var9++];
                        }

                        for(var15 += 3; var8 < var15; var6[var8++] = this.E[var9++]) {
                           ;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if(var3 == 0) {
                     var14 = (var4 & 16711680) >> 16;
                     var15 = (var4 & '\uff00') >> 8;
                     var16 = var4 & 255;

                     for(var17 = -var10; var17 < 0; ++var17) {
                        for(var18 = -var11; var18 < 0; ++var18) {
                           var19 = this.E[var9++];
                           var20 = (var19 & 16711680) * var14 & -16777216;
                           var21 = (var19 & '\uff00') * var15 & 16711680;
                           var22 = (var19 & 255) * var16 & '\uff00';
                           var6[var8++] = (var20 | var21 | var22) >>> 8;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else if(var3 == 3) {
                     for(var14 = -var10; var14 < 0; ++var14) {
                        for(var15 = -var11; var15 < 0; ++var15) {
                           var16 = this.E[var9++];
                           var17 = var16 + var4;
                           var18 = (var16 & 16711935) + (var4 & 16711935);
                           var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                           var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  } else {
                     if(var3 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var14 = var4 >>> 24;
                     var15 = 256 - var14;
                     var16 = (var4 & 16711935) * var15 & -16711936;
                     var17 = (var4 & '\uff00') * var15 & 16711680;
                     var4 = (var16 | var17) >>> 8;

                     for(var18 = -var10; var18 < 0; ++var18) {
                        for(var19 = -var11; var19 < 0; ++var19) {
                           var20 = this.E[var9++];
                           var16 = (var20 & 16711935) * var14 & -16711936;
                           var17 = (var20 & '\uff00') * var14 & 16711680;
                           var6[var8++] = ((var16 | var17) >>> 8) + var4;
                        }

                        var8 += var12;
                        var9 += var13;
                     }
                  }
               } else {
                  int var23;
                  int var25;
                  int var24;
                  if(var5 == 1) {
                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           var15 = var8 + var11 - 3;

                           while(var8 < var15) {
                              var16 = this.E[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.E[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.E[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }

                              var16 = this.E[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var15 += 3;

                           while(var8 < var15) {
                              var16 = this.E[var9++];
                              if(var16 != 0) {
                                 var6[var8++] = var16;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 0) {
                        if((var4 & 16777215) == 16777215) {
                           var14 = var4 >>> 24;
                           var15 = 256 - var14;

                           for(var16 = -var10; var16 < 0; ++var16) {
                              for(var17 = -var11; var17 < 0; ++var17) {
                                 var18 = this.E[var9++];
                                 if(var18 != 0) {
                                    var19 = var6[var8];
                                    var6[var8++] = ((var18 & 16711935) * var14 + (var19 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var19 & '\uff00') * var15 & 16711680) >> 8;
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        } else {
                           var14 = (var4 & 16711680) >> 16;
                           var15 = (var4 & '\uff00') >> 8;
                           var16 = var4 & 255;
                           var17 = var4 >>> 24;
                           var18 = 256 - var17;

                           for(var19 = -var10; var19 < 0; ++var19) {
                              for(var20 = -var11; var20 < 0; ++var20) {
                                 var21 = this.E[var9++];
                                 if(var21 != 0) {
                                    if(var17 != 255) {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var21 = (var22 | var23 | var24) >>> 8;
                                       var25 = var6[var8];
                                       var6[var8++] = ((var21 & 16711935) * var17 + (var25 & 16711935) * var18 & -16711936) + ((var21 & '\uff00') * var17 + (var25 & '\uff00') * var18 & 16711680) >> 8;
                                    } else {
                                       var22 = (var21 & 16711680) * var14 & -16777216;
                                       var23 = (var21 & '\uff00') * var15 & 16711680;
                                       var24 = (var21 & 255) * var16 & '\uff00';
                                       var6[var8++] = (var22 | var23 | var24) >>> 8;
                                    }
                                 } else {
                                    ++var8;
                                 }
                              }

                              var8 += var12;
                              var9 += var13;
                           }
                        }
                     } else if(var3 == 3) {
                        var14 = var4 >>> 24;
                        var15 = 256 - var14;

                        for(var16 = -var10; var16 < 0; ++var16) {
                           for(var17 = -var11; var17 < 0; ++var17) {
                              var18 = this.E[var9++];
                              var19 = var18 + var4;
                              var20 = (var18 & 16711935) + (var4 & 16711935);
                              var21 = (var20 & 16777472) + (var19 - var20 & 65536);
                              var21 = var19 - var21 | var21 - (var21 >>> 8);
                              if(var18 == 0 && var14 != 255) {
                                 var18 = var21;
                                 var21 = var6[var8];
                                 var21 = ((var18 & 16711935) * var14 + (var21 & 16711935) * var15 & -16711936) + ((var18 & '\uff00') * var14 + (var21 & '\uff00') * var15 & 16711680) >> 8;
                              }

                              var6[var8++] = var21;
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if(var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var20 = this.E[var9++];
                              if(var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var6[var8++] = ((var16 | var17) >>> 8) + var4;
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     if(var3 == 1) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.E[var9++];
                              if(var16 != 0) {
                                 var17 = var6[var8];
                                 var18 = var16 + var17;
                                 var19 = (var16 & 16711935) + (var17 & 16711935);
                                 var17 = (var19 & 16777472) + (var18 - var19 & 65536);
                                 var6[var8++] = var18 - var17 | var17 - (var17 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 0) {
                        var14 = (var4 & 16711680) >> 16;
                        var15 = (var4 & '\uff00') >> 8;
                        var16 = var4 & 255;

                        for(var17 = -var10; var17 < 0; ++var17) {
                           for(var18 = -var11; var18 < 0; ++var18) {
                              var19 = this.E[var9++];
                              if(var19 != 0) {
                                 var20 = (var19 & 16711680) * var14 & -16777216;
                                 var21 = (var19 & '\uff00') * var15 & 16711680;
                                 var22 = (var19 & 255) * var16 & '\uff00';
                                 var19 = (var20 | var21 | var22) >>> 8;
                                 var23 = var6[var8];
                                 var24 = var19 + var23;
                                 var25 = (var19 & 16711935) + (var23 & 16711935);
                                 var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                                 var6[var8++] = var24 - var23 | var23 - (var23 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else if(var3 == 3) {
                        for(var14 = -var10; var14 < 0; ++var14) {
                           for(var15 = -var11; var15 < 0; ++var15) {
                              var16 = this.E[var9++];
                              var17 = var16 + var4;
                              var18 = (var16 & 16711935) + (var4 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var16 = var17 - var19 | var19 - (var19 >>> 8);
                              var19 = var6[var8];
                              var17 = var16 + var19;
                              var18 = (var16 & 16711935) + (var19 & 16711935);
                              var19 = (var18 & 16777472) + (var17 - var18 & 65536);
                              var6[var8++] = var17 - var19 | var19 - (var19 >>> 8);
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     } else {
                        if(var3 != 2) {
                           throw new IllegalArgumentException();
                        }

                        var14 = var4 >>> 24;
                        var15 = 256 - var14;
                        var16 = (var4 & 16711935) * var15 & -16711936;
                        var17 = (var4 & '\uff00') * var15 & 16711680;
                        var4 = (var16 | var17) >>> 8;

                        for(var18 = -var10; var18 < 0; ++var18) {
                           for(var19 = -var11; var19 < 0; ++var19) {
                              var20 = this.E[var9++];
                              if(var20 != 0) {
                                 var16 = (var20 & 16711935) * var14 & -16711936;
                                 var17 = (var20 & '\uff00') * var14 & 16711680;
                                 var20 = ((var16 | var17) >>> 8) + var4;
                                 var21 = var6[var8];
                                 var22 = var20 + var21;
                                 var23 = (var20 & 16711935) + (var21 & 16711935);
                                 var21 = (var23 & 16777472) + (var22 - var23 & 65536);
                                 var6[var8++] = var22 - var21 | var21 - (var21 >>> 8);
                              } else {
                                 ++var8;
                              }
                           }

                           var8 += var12;
                           var9 += var13;
                        }
                     }
                  }
               }

            }
         }
      }
   }

   final void e(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      if(var4 <= 0 || var5 <= 0) {
         ;
      }
   }

   final void d(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      if(var4 > 0 && var5 > 0) {
         int var11 = 0;
         int var12 = 0;
         int var13 = this.z + this.D + this.v;
         int var14 = this.j + this.u + this.a;
         int var15 = (var13 << 16) / var4;
         int var16 = (var14 << 16) / var5;
         int var17;
         if(this.z > 0) {
            var17 = ((this.z << 16) + var15 - 1) / var15;
            var1 += var17;
            var11 += var17 * var15 - (this.z << 16);
         }

         if(this.j > 0) {
            var17 = ((this.j << 16) + var16 - 1) / var16;
            var2 += var17;
            var12 += var17 * var16 - (this.j << 16);
         }

         if(this.D < var13) {
            var4 = ((this.D << 16) - var11 + var15 - 1) / var15;
         }

         if(this.u < var14) {
            var5 = ((this.u << 16) - var12 + var16 - 1) / var16;
         }

         var17 = var1 + var2 * ((int[])((int[])this.C[1]))[4];
         int var18 = ((int[])((int[])this.C[1]))[4] - var4;
         if(var2 + var5 > ((int[])((int[])this.C[1]))[1]) {
            var5 -= var2 + var5 - ((int[])((int[])this.C[1]))[1];
         }

         int var19;
         if(var2 < ((int[])((int[])this.C[1]))[16]) {
            var19 = ((int[])((int[])this.C[1]))[16] - var2;
            var5 -= var19;
            var17 += var19 * ((int[])((int[])this.C[1]))[4];
            var12 += var16 * var19;
         }

         if(var1 + var4 > ((int[])((int[])this.C[1]))[19]) {
            var19 = var1 + var4 - ((int[])((int[])this.C[1]))[19];
            var4 -= var19;
            var18 += var19;
         }

         if(var1 < ((int[])((int[])this.C[1]))[7]) {
            var19 = ((int[])((int[])this.C[1]))[7] - var1;
            var4 -= var19;
            var17 += var19;
            var11 += var15 * var19;
            var18 += var19;
         }

         float[] var35 = (float[])((float[])this.C[12]);
         int[] var20 = (int[])((int[])this.C[7]);
         int var21;
         int var23;
         int var22;
         int var25;
         int var24;
         int var27;
         int var26;
         int var29;
         int var28;
         int var31;
         int var30;
         if(var8 == 0) {
            if(var6 == 1) {
               var21 = var11;

               for(var22 = -var5; var22 < 0; ++var22) {
                  var23 = (var12 >> 16) * this.D;

                  for(var24 = -var4; var24 < 0; ++var24) {
                     if(var3 < var35[var17]) {
                        var20[var17] = this.E[(var11 >> 16) + var23];
                        if(var10) {
                           var35[var17] = var3;
                        }
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var21;
                  var17 += var18;
               }
            } else if(var6 == 0) {
               var21 = (var7 & 16711680) >> 16;
               var22 = (var7 & '\uff00') >> 8;
               var23 = var7 & 255;
               var24 = var11;

               for(var25 = -var5; var25 < 0; ++var25) {
                  var26 = (var12 >> 16) * this.D;

                  for(var27 = -var4; var27 < 0; ++var27) {
                     if(var3 < var35[var17]) {
                        var28 = this.E[(var11 >> 16) + var26];
                        var29 = (var28 & 16711680) * var21 & -16777216;
                        var30 = (var28 & '\uff00') * var22 & 16711680;
                        var31 = (var28 & 255) * var23 & '\uff00';
                        var20[var17] = (var29 | var30 | var31) >>> 8;
                        if(var10) {
                           var35[var17] = var3;
                        }
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var24;
                  var17 += var18;
               }
            } else if(var6 == 3) {
               var21 = var11;

               for(var22 = -var5; var22 < 0; ++var22) {
                  var23 = (var12 >> 16) * this.D;

                  for(var24 = -var4; var24 < 0; ++var24) {
                     if(var3 < var35[var17]) {
                        var25 = this.E[(var11 >> 16) + var23];
                        var26 = var25 + var7;
                        var27 = (var25 & 16711935) + (var7 & 16711935);
                        var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                        var20[var17] = var26 - var28 | var28 - (var28 >>> 8);
                        if(var10) {
                           var35[var17] = var3;
                        }
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var21;
                  var17 += var18;
               }
            } else {
               if(var6 != 2) {
                  throw new IllegalArgumentException();
               }

               var21 = var7 >>> 24;
               var22 = 256 - var21;
               var23 = (var7 & 16711935) * var22 & -16711936;
               var24 = (var7 & '\uff00') * var22 & 16711680;
               var7 = (var23 | var24) >>> 8;
               var25 = var11;

               for(var26 = -var5; var26 < 0; ++var26) {
                  var27 = (var12 >> 16) * this.D;

                  for(var28 = -var4; var28 < 0; ++var28) {
                     if(var3 < var35[var17]) {
                        var29 = this.E[(var11 >> 16) + var27];
                        var23 = (var29 & 16711935) * var21 & -16711936;
                        var24 = (var29 & '\uff00') * var21 & 16711680;
                        var20[var17] = ((var23 | var24) >>> 8) + var7;
                        if(var10) {
                           var35[var17] = var3;
                        }
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var25;
                  var17 += var18;
               }
            }
         } else {
            int var34;
            int var32;
            int var33;
            if(var8 == 1) {
               if(var6 == 1) {
                  var21 = var11;

                  for(var22 = -var5; var22 < 0; ++var22) {
                     var23 = (var12 >> 16) * this.D;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        if(var3 < var35[var17]) {
                           var25 = this.E[(var11 >> 16) + var23];
                           if(var25 != 0) {
                              var20[var17] = var25;
                              if(var10) {
                                 var35[var17] = var3;
                              }
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var21;
                     var17 += var18;
                  }
               } else if(var6 == 0) {
                  var21 = var11;
                  if((var7 & 16777215) == 16777215) {
                     var22 = var7 >>> 24;
                     var23 = 256 - var22;

                     for(var24 = -var5; var24 < 0; ++var24) {
                        var25 = (var12 >> 16) * this.D;

                        for(var26 = -var4; var26 < 0; ++var26) {
                           if(var3 < var35[var17]) {
                              var27 = this.E[(var11 >> 16) + var25];
                              if(var27 != 0) {
                                 var28 = var20[var17];
                                 var20[var17] = ((var27 & 16711935) * var22 + (var28 & 16711935) * var23 & -16711936) + ((var27 & '\uff00') * var22 + (var28 & '\uff00') * var23 & 16711680) >> 8;
                                 if(var10) {
                                    var35[var17] = var3;
                                 }
                              }
                           }

                           var11 += var15;
                           ++var17;
                        }

                        var12 += var16;
                        var11 = var21;
                        var17 += var18;
                     }
                  } else {
                     var22 = (var7 & 16711680) >> 16;
                     var23 = (var7 & '\uff00') >> 8;
                     var24 = var7 & 255;
                     var25 = var7 >>> 24;
                     var26 = 256 - var25;

                     for(var27 = -var5; var27 < 0; ++var27) {
                        var28 = (var12 >> 16) * this.D;

                        for(var29 = -var4; var29 < 0; ++var29) {
                           if(var3 < var35[var17]) {
                              var30 = this.E[(var11 >> 16) + var28];
                              if(var30 != 0) {
                                 if(var25 != 255) {
                                    var31 = (var30 & 16711680) * var22 & -16777216;
                                    var32 = (var30 & '\uff00') * var23 & 16711680;
                                    var33 = (var30 & 255) * var24 & '\uff00';
                                    var30 = (var31 | var32 | var33) >>> 8;
                                    var34 = var20[var17];
                                    var20[var17] = ((var30 & 16711935) * var25 + (var34 & 16711935) * var26 & -16711936) + ((var30 & '\uff00') * var25 + (var34 & '\uff00') * var26 & 16711680) >> 8;
                                    if(var10) {
                                       var35[var17] = var3;
                                    }
                                 } else {
                                    var31 = (var30 & 16711680) * var22 & -16777216;
                                    var32 = (var30 & '\uff00') * var23 & 16711680;
                                    var33 = (var30 & 255) * var24 & '\uff00';
                                    var20[var17] = (var31 | var32 | var33) >>> 8;
                                    if(var10) {
                                       var35[var17] = var3;
                                    }
                                 }
                              }
                           }

                           var11 += var15;
                           ++var17;
                        }

                        var12 += var16;
                        var11 = var21;
                        var17 += var18;
                     }
                  }
               } else if(var6 == 3) {
                  var21 = var11;
                  var22 = var7 >>> 24;
                  var23 = 256 - var22;

                  for(var24 = -var5; var24 < 0; ++var24) {
                     var25 = (var12 >> 16) * this.D;

                     for(var26 = -var4; var26 < 0; ++var26) {
                        if(var3 < var35[var17]) {
                           var27 = this.E[(var11 >> 16) + var25];
                           var28 = var27 + var7;
                           var29 = (var27 & 16711935) + (var7 & 16711935);
                           var30 = (var29 & 16777472) + (var28 - var29 & 65536);
                           var30 = var28 - var30 | var30 - (var30 >>> 8);
                           if(var27 == 0 && var22 != 255) {
                              var27 = var30;
                              var30 = var20[var17];
                              var30 = ((var27 & 16711935) * var22 + (var30 & 16711935) * var23 & -16711936) + ((var27 & '\uff00') * var22 + (var30 & '\uff00') * var23 & 16711680) >> 8;
                           }

                           var20[var17] = var30;
                           if(var10) {
                              var35[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var21;
                     var17 += var18;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var21 = var7 >>> 24;
                  var22 = 256 - var21;
                  var23 = (var7 & 16711935) * var22 & -16711936;
                  var24 = (var7 & '\uff00') * var22 & 16711680;
                  var7 = (var23 | var24) >>> 8;
                  var25 = var11;

                  for(var26 = -var5; var26 < 0; ++var26) {
                     var27 = (var12 >> 16) * this.D;

                     for(var28 = -var4; var28 < 0; ++var28) {
                        if(var3 < var35[var17]) {
                           var29 = this.E[(var11 >> 16) + var27];
                           if(var29 != 0) {
                              var23 = (var29 & 16711935) * var21 & -16711936;
                              var24 = (var29 & '\uff00') * var21 & 16711680;
                              var20[var17] = ((var23 | var24) >>> 8) + var7;
                              if(var10) {
                                 var35[var17] = var3;
                              }
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var25;
                     var17 += var18;
                  }
               }
            } else {
               if(var8 != 2) {
                  throw new IllegalArgumentException();
               }

               if(var6 == 1) {
                  var21 = var11;

                  for(var22 = -var5; var22 < 0; ++var22) {
                     var23 = (var12 >> 16) * this.D;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        if(var3 < var35[var17]) {
                           var25 = this.E[(var11 >> 16) + var23];
                           if(var25 != 0) {
                              var26 = var20[var17];
                              var27 = var25 + var26;
                              var28 = (var25 & 16711935) + (var26 & 16711935);
                              var26 = (var28 & 16777472) + (var27 - var28 & 65536);
                              var20[var17] = var27 - var26 | var26 - (var26 >>> 8);
                              if(var10) {
                                 var35[var17] = var3;
                              }
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var21;
                     var17 += var18;
                  }
               } else if(var6 == 0) {
                  var21 = var11;
                  var22 = (var7 & 16711680) >> 16;
                  var23 = (var7 & '\uff00') >> 8;
                  var24 = var7 & 255;

                  for(var25 = -var5; var25 < 0; ++var25) {
                     var26 = (var12 >> 16) * this.D;

                     for(var27 = -var4; var27 < 0; ++var27) {
                        if(var3 < var35[var17]) {
                           var28 = this.E[(var11 >> 16) + var26];
                           if(var28 != 0) {
                              var29 = (var28 & 16711680) * var22 & -16777216;
                              var30 = (var28 & '\uff00') * var23 & 16711680;
                              var31 = (var28 & 255) * var24 & '\uff00';
                              var28 = (var29 | var30 | var31) >>> 8;
                              var32 = var20[var17];
                              var33 = var28 + var32;
                              var34 = (var28 & 16711935) + (var32 & 16711935);
                              var32 = (var34 & 16777472) + (var33 - var34 & 65536);
                              var20[var17] = var33 - var32 | var32 - (var32 >>> 8);
                              if(var10) {
                                 var35[var17] = var3;
                              }
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var21;
                     var17 += var18;
                  }
               } else if(var6 == 3) {
                  var21 = var11;

                  for(var22 = -var5; var22 < 0; ++var22) {
                     var23 = (var12 >> 16) * this.D;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        if(var3 < var35[var17]) {
                           var25 = this.E[(var11 >> 16) + var23];
                           var26 = var25 + var7;
                           var27 = (var25 & 16711935) + (var7 & 16711935);
                           var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                           var25 = var26 - var28 | var28 - (var28 >>> 8);
                           var28 = var20[var17];
                           var26 = var25 + var28;
                           var27 = (var25 & 16711935) + (var28 & 16711935);
                           var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                           var20[var17] = var26 - var28 | var28 - (var28 >>> 8);
                           if(var10) {
                              var35[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var21;
                     var17 += var18;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var21 = var7 >>> 24;
                  var22 = 256 - var21;
                  var23 = (var7 & 16711935) * var22 & -16711936;
                  var24 = (var7 & '\uff00') * var22 & 16711680;
                  var7 = (var23 | var24) >>> 8;
                  var25 = var11;

                  for(var26 = -var5; var26 < 0; ++var26) {
                     var27 = (var12 >> 16) * this.D;

                     for(var28 = -var4; var28 < 0; ++var28) {
                        if(var3 < var35[var17]) {
                           var29 = this.E[(var11 >> 16) + var27];
                           if(var29 != 0) {
                              var23 = (var29 & 16711935) * var21 & -16711936;
                              var24 = (var29 & '\uff00') * var21 & 16711680;
                              var29 = ((var23 | var24) >>> 8) + var7;
                              var30 = var20[var17];
                              var31 = var29 + var30;
                              var32 = (var29 & 16711935) + (var30 & 16711935);
                              var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                              var20[var17] = var31 - var30 | var30 - (var30 >>> 8);
                              if(var10) {
                                 var35[var17] = var3;
                              }
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var25;
                     var17 += var18;
                  }
               }
            }
         }

      }
   }

   final void a(int var1, int var2, int var3) {
      throw new IllegalStateException("");
   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if(ui.m(this.C)) {
         throw new IllegalStateException();
      } else if(var3 > 0 && var4 > 0) {
         int[] var9 = (int[])((int[])this.C[7]);
         if(var9 != null) {
            int var10 = 0;
            int var11 = 0;
            int var12 = ((int[])((int[])this.C[1]))[4];
            int var13 = this.z + this.D + this.v;
            int var14 = this.j + this.u + this.a;
            int var15 = (var13 << 16) / var3;
            int var16 = (var14 << 16) / var4;
            int var17;
            if(this.z > 0) {
               var17 = ((this.z << 16) + var15 - 1) / var15;
               var1 += var17;
               var10 += var17 * var15 - (this.z << 16);
            }

            if(this.j > 0) {
               var17 = ((this.j << 16) + var16 - 1) / var16;
               var2 += var17;
               var11 += var17 * var16 - (this.j << 16);
            }

            if(this.D < var13) {
               var3 = ((this.D << 16) - var10 + var15 - 1) / var15;
            }

            if(this.u < var14) {
               var4 = ((this.u << 16) - var11 + var16 - 1) / var16;
            }

            var17 = var1 + var2 * var12;
            int var18 = var12 - var3;
            if(var2 + var4 > ((int[])((int[])this.C[1]))[1]) {
               var4 -= var2 + var4 - ((int[])((int[])this.C[1]))[1];
            }

            int var19;
            if(var2 < ((int[])((int[])this.C[1]))[16]) {
               var19 = ((int[])((int[])this.C[1]))[16] - var2;
               var4 -= var19;
               var17 += var19 * var12;
               var11 += var16 * var19;
            }

            if(var1 + var3 > ((int[])((int[])this.C[1]))[19]) {
               var19 = var1 + var3 - ((int[])((int[])this.C[1]))[19];
               var3 -= var19;
               var18 += var19;
            }

            if(var1 < ((int[])((int[])this.C[1]))[7]) {
               var19 = ((int[])((int[])this.C[1]))[7] - var1;
               var3 -= var19;
               var17 += var19;
               var10 += var15 * var19;
               var18 += var19;
            }

            int var21;
            int var20;
            int var23;
            int var22;
            int var25;
            int var24;
            int var27;
            int var26;
            int var29;
            int var28;
            if(var7 == 0) {
               if(var5 == 1) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.D;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var9[var17++] = this.E[(var10 >> 16) + var21];
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var19;
                     var17 += var18;
                  }
               } else if(var5 == 0) {
                  var19 = (var6 & 16711680) >> 16;
                  var20 = (var6 & '\uff00') >> 8;
                  var21 = var6 & 255;
                  var22 = var10;

                  for(var23 = -var4; var23 < 0; ++var23) {
                     var24 = (var11 >> 16) * this.D;

                     for(var25 = -var3; var25 < 0; ++var25) {
                        var26 = this.E[(var10 >> 16) + var24];
                        var27 = (var26 & 16711680) * var19 & -16777216;
                        var28 = (var26 & '\uff00') * var20 & 16711680;
                        var29 = (var26 & 255) * var21 & '\uff00';
                        var9[var17++] = (var27 | var28 | var29) >>> 8;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var22;
                     var17 += var18;
                  }
               } else if(var5 == 3) {
                  var19 = var10;

                  for(var20 = -var4; var20 < 0; ++var20) {
                     var21 = (var11 >> 16) * this.D;

                     for(var22 = -var3; var22 < 0; ++var22) {
                        var23 = this.E[(var10 >> 16) + var21];
                        var24 = var23 + var6;
                        var25 = (var23 & 16711935) + (var6 & 16711935);
                        var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                        var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var19;
                     var17 += var18;
                  }
               } else {
                  if(var5 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var19 = var6 >>> 24;
                  var20 = 256 - var19;
                  var21 = (var6 & 16711935) * var20 & -16711936;
                  var22 = (var6 & '\uff00') * var20 & 16711680;
                  var6 = (var21 | var22) >>> 8;
                  var23 = var10;

                  for(var24 = -var4; var24 < 0; ++var24) {
                     var25 = (var11 >> 16) * this.D;

                     for(var26 = -var3; var26 < 0; ++var26) {
                        var27 = this.E[(var10 >> 16) + var25];
                        var21 = (var27 & 16711935) * var19 & -16711936;
                        var22 = (var27 & '\uff00') * var19 & 16711680;
                        var9[var17++] = ((var21 | var22) >>> 8) + var6;
                        var10 += var15;
                     }

                     var11 += var16;
                     var10 = var23;
                     var17 += var18;
                  }
               }
            } else {
               int var31;
               int var30;
               int var32;
               if(var7 == 1) {
                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.D;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.E[(var10 >> 16) + var21];
                           if(var23 != 0) {
                              var9[var17++] = var23;
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if(var5 == 0) {
                     var19 = var10;
                     if((var6 & 16777215) == 16777215) {
                        var20 = var6 >>> 24;
                        var21 = 256 - var20;

                        for(var22 = -var4; var22 < 0; ++var22) {
                           var23 = (var11 >> 16) * this.D;

                           for(var24 = -var3; var24 < 0; ++var24) {
                              var25 = this.E[(var10 >> 16) + var23];
                              if(var25 != 0) {
                                 var26 = var9[var17];
                                 var9[var17++] = ((var25 & 16711935) * var20 + (var26 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var26 & '\uff00') * var21 & 16711680) >> 8;
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     } else {
                        var20 = (var6 & 16711680) >> 16;
                        var21 = (var6 & '\uff00') >> 8;
                        var22 = var6 & 255;
                        var23 = var6 >>> 24;
                        var24 = 256 - var23;

                        for(var25 = -var4; var25 < 0; ++var25) {
                           var26 = (var11 >> 16) * this.D;

                           for(var27 = -var3; var27 < 0; ++var27) {
                              var28 = this.E[(var10 >> 16) + var26];
                              if(var28 != 0) {
                                 if(var23 != 255) {
                                    var29 = (var28 & 16711680) * var20 & -16777216;
                                    var30 = (var28 & '\uff00') * var21 & 16711680;
                                    var31 = (var28 & 255) * var22 & '\uff00';
                                    var28 = (var29 | var30 | var31) >>> 8;
                                    var32 = var9[var17];
                                    var9[var17++] = ((var28 & 16711935) * var23 + (var32 & 16711935) * var24 & -16711936) + ((var28 & '\uff00') * var23 + (var32 & '\uff00') * var24 & 16711680) >> 8;
                                 } else {
                                    var29 = (var28 & 16711680) * var20 & -16777216;
                                    var30 = (var28 & '\uff00') * var21 & 16711680;
                                    var31 = (var28 & 255) * var22 & '\uff00';
                                    var9[var17++] = (var29 | var30 | var31) >>> 8;
                                 }
                              } else {
                                 ++var17;
                              }

                              var10 += var15;
                           }

                           var11 += var16;
                           var10 = var19;
                           var17 += var18;
                        }
                     }
                  } else if(var5 == 3) {
                     var19 = var10;
                     var20 = var6 >>> 24;
                     var21 = 256 - var20;

                     for(var22 = -var4; var22 < 0; ++var22) {
                        var23 = (var11 >> 16) * this.D;

                        for(var24 = -var3; var24 < 0; ++var24) {
                           var25 = this.E[(var10 >> 16) + var23];
                           var26 = var25 + var6;
                           var27 = (var25 & 16711935) + (var6 & 16711935);
                           var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                           var28 = var26 - var28 | var28 - (var28 >>> 8);
                           if(var25 == 0 && var20 != 255) {
                              var25 = var28;
                              var28 = var9[var17];
                              var28 = ((var25 & 16711935) * var20 + (var28 & 16711935) * var21 & -16711936) + ((var25 & '\uff00') * var20 + (var28 & '\uff00') * var21 & 16711680) >> 8;
                           }

                           var9[var17++] = var28;
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var19 = var6 >>> 24;
                     var20 = 256 - var19;
                     var21 = (var6 & 16711935) * var20 & -16711936;
                     var22 = (var6 & '\uff00') * var20 & 16711680;
                     var6 = (var21 | var22) >>> 8;
                     var23 = var10;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        var25 = (var11 >> 16) * this.D;

                        for(var26 = -var3; var26 < 0; ++var26) {
                           var27 = this.E[(var10 >> 16) + var25];
                           if(var27 != 0) {
                              var21 = (var27 & 16711935) * var19 & -16711936;
                              var22 = (var27 & '\uff00') * var19 & 16711680;
                              var9[var17++] = ((var21 | var22) >>> 8) + var6;
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var23;
                        var17 += var18;
                     }
                  }
               } else {
                  if(var7 != 2) {
                     throw new IllegalArgumentException();
                  }

                  if(var5 == 1) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.D;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.E[(var10 >> 16) + var21];
                           if(var23 != 0) {
                              var24 = var9[var17];
                              var25 = var23 + var24;
                              var26 = (var23 & 16711935) + (var24 & 16711935);
                              var24 = (var26 & 16777472) + (var25 - var26 & 65536);
                              var9[var17++] = var25 - var24 | var24 - (var24 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if(var5 == 0) {
                     var19 = var10;
                     var20 = (var6 & 16711680) >> 16;
                     var21 = (var6 & '\uff00') >> 8;
                     var22 = var6 & 255;

                     for(var23 = -var4; var23 < 0; ++var23) {
                        var24 = (var11 >> 16) * this.D;

                        for(var25 = -var3; var25 < 0; ++var25) {
                           var26 = this.E[(var10 >> 16) + var24];
                           if(var26 != 0) {
                              var27 = (var26 & 16711680) * var20 & -16777216;
                              var28 = (var26 & '\uff00') * var21 & 16711680;
                              var29 = (var26 & 255) * var22 & '\uff00';
                              var26 = (var27 | var28 | var29) >>> 8;
                              var30 = var9[var17];
                              var31 = var26 + var30;
                              var32 = (var26 & 16711935) + (var30 & 16711935);
                              var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                              var9[var17++] = var31 - var30 | var30 - (var30 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else if(var5 == 3) {
                     var19 = var10;

                     for(var20 = -var4; var20 < 0; ++var20) {
                        var21 = (var11 >> 16) * this.D;

                        for(var22 = -var3; var22 < 0; ++var22) {
                           var23 = this.E[(var10 >> 16) + var21];
                           var24 = var23 + var6;
                           var25 = (var23 & 16711935) + (var6 & 16711935);
                           var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                           var23 = var24 - var26 | var26 - (var26 >>> 8);
                           var26 = var9[var17];
                           var24 = var23 + var26;
                           var25 = (var23 & 16711935) + (var26 & 16711935);
                           var26 = (var25 & 16777472) + (var24 - var25 & 65536);
                           var9[var17++] = var24 - var26 | var26 - (var26 >>> 8);
                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var19;
                        var17 += var18;
                     }
                  } else {
                     if(var5 != 2) {
                        throw new IllegalArgumentException();
                     }

                     var19 = var6 >>> 24;
                     var20 = 256 - var19;
                     var21 = (var6 & 16711935) * var20 & -16711936;
                     var22 = (var6 & '\uff00') * var20 & 16711680;
                     var6 = (var21 | var22) >>> 8;
                     var23 = var10;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        var25 = (var11 >> 16) * this.D;

                        for(var26 = -var3; var26 < 0; ++var26) {
                           var27 = this.E[(var10 >> 16) + var25];
                           if(var27 != 0) {
                              var21 = (var27 & 16711935) * var19 & -16711936;
                              var22 = (var27 & '\uff00') * var19 & 16711680;
                              var27 = ((var21 | var22) >>> 8) + var6;
                              var28 = var9[var17];
                              var29 = var27 + var28;
                              var30 = (var27 & 16711935) + (var28 & 16711935);
                              var28 = (var30 & 16777472) + (var29 - var30 & 65536);
                              var9[var17++] = var29 - var28 | var28 - (var28 >>> 8);
                           } else {
                              ++var17;
                           }

                           var10 += var15;
                        }

                        var11 += var16;
                        var10 = var23;
                        var17 += var18;
                     }
                  }
               }
            }

         }
      }
   }

   hra(Object[] var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var5, var6);
      if(var7) {
         this.E = new int[var5 * var6];
      } else {
         this.E = var2;
      }

      var4 -= this.D;
      int var8 = 0;

      for(int var9 = 0; var9 < var6; ++var9) {
         for(int var10 = 0; var10 < var5; ++var10) {
            int var11 = var2[var3++];
            if(var11 >>> 24 == 255) {
               this.E[var8++] = (var11 & 16777215) == 0?-16777215:var11;
            } else {
               this.E[var8++] = 0;
            }
         }

         var3 += var4;
      }

   }

   final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = (int[])((int[])this.C[7]);
      if(var7 == null) {
         throw new IllegalStateException("");
      } else {
         for(int var8 = 0; var8 < var4; ++var8) {
            int var9 = (var2 + var8) * this.D + var1;
            int var10 = (var6 + var8) * ((int[])((int[])this.C[1]))[4] + var5;

            for(int var11 = 0; var11 < var3; ++var11) {
               this.E[var9 + var11] = var7[var10 + var11];
            }
         }

      }
   }

   final re h() {
      Object[] var1;
      return (re)((var1 = fw.a(this.D, new Object[3], this.E, -26481, this.u)) == null?null:var1[0]);
   }

   final void f(int var1, int var2, float var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      if(var4 > 0 && var5 > 0) {
         int var11 = 0;
         int var12 = 0;
         int var13 = this.z + this.D + this.v;
         int var14 = this.j + this.u + this.a;
         int var15 = (var13 << 16) / var4;
         int var16 = (var14 << 16) / var5;
         int var17;
         if(this.z > 0) {
            var17 = ((this.z << 16) + var15 - 1) / var15;
            var1 += var17;
            var11 += var17 * var15 - (this.z << 16);
         }

         if(this.j > 0) {
            var17 = ((this.j << 16) + var16 - 1) / var16;
            var2 += var17;
            var12 += var17 * var16 - (this.j << 16);
         }

         if(this.D < var13) {
            var4 = ((this.D << 16) - var11 + var15 - 1) / var15;
         }

         if(this.u < var14) {
            var5 = ((this.u << 16) - var12 + var16 - 1) / var16;
         }

         var17 = var1 + var2 * ((int[])((int[])this.C[1]))[4];
         int var18 = ((int[])((int[])this.C[1]))[4] - var4;
         if(var2 + var5 > ((int[])((int[])this.C[1]))[1]) {
            var5 -= var2 + var5 - ((int[])((int[])this.C[1]))[1];
         }

         int var19;
         if(var2 < ((int[])((int[])this.C[1]))[16]) {
            var19 = ((int[])((int[])this.C[1]))[16] - var2;
            var5 -= var19;
            var17 += var19 * ((int[])((int[])this.C[1]))[4];
            var12 += var16 * var19;
         }

         if(var1 + var4 > ((int[])((int[])this.C[1]))[19]) {
            var19 = var1 + var4 - ((int[])((int[])this.C[1]))[19];
            var4 -= var19;
            var18 += var19;
         }

         if(var1 < ((int[])((int[])this.C[1]))[7]) {
            var19 = ((int[])((int[])this.C[1]))[7] - var1;
            var4 -= var19;
            var17 += var19;
            var11 += var15 * var19;
            var18 += var19;
         }

         float[] var35 = (float[])((float[])this.C[12]);
         int[] var20 = (int[])((int[])this.C[7]);
         int var21;
         int var23;
         int var22;
         int var25;
         int var24;
         int var27;
         int var26;
         int var29;
         int var28;
         int var31;
         int var30;
         if(var8 == 0) {
            if(var6 == 1) {
               var21 = var11;

               for(var22 = -var5; var22 < 0; ++var22) {
                  var23 = (var12 >> 16) * this.D;

                  for(var24 = -var4; var24 < 0; ++var24) {
                     if(var3 < var35[var17]) {
                        var20[var17] = this.E[(var11 >> 16) + var23];
                        if(var10) {
                           var35[var17] = var3;
                        }
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var21;
                  var17 += var18;
               }
            } else if(var6 == 0) {
               var21 = (var7 & 16711680) >> 16;
               var22 = (var7 & '\uff00') >> 8;
               var23 = var7 & 255;
               var24 = var11;

               for(var25 = -var5; var25 < 0; ++var25) {
                  var26 = (var12 >> 16) * this.D;

                  for(var27 = -var4; var27 < 0; ++var27) {
                     if(var3 < var35[var17]) {
                        var28 = this.E[(var11 >> 16) + var26];
                        var29 = (var28 & 16711680) * var21 & -16777216;
                        var30 = (var28 & '\uff00') * var22 & 16711680;
                        var31 = (var28 & 255) * var23 & '\uff00';
                        var20[var17] = (var29 | var30 | var31) >>> 8;
                        if(var10) {
                           var35[var17] = var3;
                        }
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var24;
                  var17 += var18;
               }
            } else if(var6 == 3) {
               var21 = var11;

               for(var22 = -var5; var22 < 0; ++var22) {
                  var23 = (var12 >> 16) * this.D;

                  for(var24 = -var4; var24 < 0; ++var24) {
                     if(var3 < var35[var17]) {
                        var25 = this.E[(var11 >> 16) + var23];
                        var26 = var25 + var7;
                        var27 = (var25 & 16711935) + (var7 & 16711935);
                        var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                        var20[var17] = var26 - var28 | var28 - (var28 >>> 8);
                        if(var10) {
                           var35[var17] = var3;
                        }
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var21;
                  var17 += var18;
               }
            } else {
               if(var6 != 2) {
                  throw new IllegalArgumentException();
               }

               var21 = var7 >>> 24;
               var22 = 256 - var21;
               var23 = (var7 & 16711935) * var22 & -16711936;
               var24 = (var7 & '\uff00') * var22 & 16711680;
               var7 = (var23 | var24) >>> 8;
               var25 = var11;

               for(var26 = -var5; var26 < 0; ++var26) {
                  var27 = (var12 >> 16) * this.D;

                  for(var28 = -var4; var28 < 0; ++var28) {
                     if(var3 < var35[var17]) {
                        var29 = this.E[(var11 >> 16) + var27];
                        var23 = (var29 & 16711935) * var21 & -16711936;
                        var24 = (var29 & '\uff00') * var21 & 16711680;
                        var20[var17] = ((var23 | var24) >>> 8) + var7;
                        if(var10) {
                           var35[var17] = var3;
                        }
                     }

                     var11 += var15;
                     ++var17;
                  }

                  var12 += var16;
                  var11 = var25;
                  var17 += var18;
               }
            }
         } else {
            int var34;
            int var32;
            int var33;
            if(var8 == 1) {
               if(var6 == 1) {
                  var21 = var11;

                  for(var22 = -var5; var22 < 0; ++var22) {
                     var23 = (var12 >> 16) * this.D;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        if(var3 < var35[var17]) {
                           var25 = this.E[(var11 >> 16) + var23];
                           if(var25 != 0) {
                              var20[var17] = var25;
                              if(var10) {
                                 var35[var17] = var3;
                              }
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var21;
                     var17 += var18;
                  }
               } else if(var6 == 0) {
                  var21 = var11;
                  if((var7 & 16777215) == 16777215) {
                     var22 = var7 >>> 24;
                     var23 = 256 - var22;

                     for(var24 = -var5; var24 < 0; ++var24) {
                        var25 = (var12 >> 16) * this.D;

                        for(var26 = -var4; var26 < 0; ++var26) {
                           if(var3 < var35[var17]) {
                              var27 = this.E[(var11 >> 16) + var25];
                              if(var27 != 0) {
                                 var28 = var20[var17];
                                 var20[var17] = ((var27 & 16711935) * var22 + (var28 & 16711935) * var23 & -16711936) + ((var27 & '\uff00') * var22 + (var28 & '\uff00') * var23 & 16711680) >> 8;
                                 if(var10) {
                                    var35[var17] = var3;
                                 }
                              }
                           }

                           var11 += var15;
                           ++var17;
                        }

                        var12 += var16;
                        var11 = var21;
                        var17 += var18;
                     }
                  } else {
                     var22 = (var7 & 16711680) >> 16;
                     var23 = (var7 & '\uff00') >> 8;
                     var24 = var7 & 255;
                     var25 = var7 >>> 24;
                     var26 = 256 - var25;

                     for(var27 = -var5; var27 < 0; ++var27) {
                        var28 = (var12 >> 16) * this.D;

                        for(var29 = -var4; var29 < 0; ++var29) {
                           if(var3 < var35[var17]) {
                              var30 = this.E[(var11 >> 16) + var28];
                              if(var30 != 0) {
                                 if(var25 != 255) {
                                    var31 = (var30 & 16711680) * var22 & -16777216;
                                    var32 = (var30 & '\uff00') * var23 & 16711680;
                                    var33 = (var30 & 255) * var24 & '\uff00';
                                    var30 = (var31 | var32 | var33) >>> 8;
                                    var34 = var20[var17];
                                    var20[var17] = ((var30 & 16711935) * var25 + (var34 & 16711935) * var26 & -16711936) + ((var30 & '\uff00') * var25 + (var34 & '\uff00') * var26 & 16711680) >> 8;
                                    if(var10) {
                                       var35[var17] = var3;
                                    }
                                 } else {
                                    var31 = (var30 & 16711680) * var22 & -16777216;
                                    var32 = (var30 & '\uff00') * var23 & 16711680;
                                    var33 = (var30 & 255) * var24 & '\uff00';
                                    var20[var17] = (var31 | var32 | var33) >>> 8;
                                    if(var10) {
                                       var35[var17] = var3;
                                    }
                                 }
                              }
                           }

                           var11 += var15;
                           ++var17;
                        }

                        var12 += var16;
                        var11 = var21;
                        var17 += var18;
                     }
                  }
               } else if(var6 == 3) {
                  var21 = var11;
                  var22 = var7 >>> 24;
                  var23 = 256 - var22;

                  for(var24 = -var5; var24 < 0; ++var24) {
                     var25 = (var12 >> 16) * this.D;

                     for(var26 = -var4; var26 < 0; ++var26) {
                        if(var3 < var35[var17]) {
                           var27 = this.E[(var11 >> 16) + var25];
                           var28 = var27 + var7;
                           var29 = (var27 & 16711935) + (var7 & 16711935);
                           var30 = (var29 & 16777472) + (var28 - var29 & 65536);
                           var30 = var28 - var30 | var30 - (var30 >>> 8);
                           if(var27 == 0 && var22 != 255) {
                              var27 = var30;
                              var30 = var20[var17];
                              var30 = ((var27 & 16711935) * var22 + (var30 & 16711935) * var23 & -16711936) + ((var27 & '\uff00') * var22 + (var30 & '\uff00') * var23 & 16711680) >> 8;
                           }

                           var20[var17] = var30;
                           if(var10) {
                              var35[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var21;
                     var17 += var18;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var21 = var7 >>> 24;
                  var22 = 256 - var21;
                  var23 = (var7 & 16711935) * var22 & -16711936;
                  var24 = (var7 & '\uff00') * var22 & 16711680;
                  var7 = (var23 | var24) >>> 8;
                  var25 = var11;

                  for(var26 = -var5; var26 < 0; ++var26) {
                     var27 = (var12 >> 16) * this.D;

                     for(var28 = -var4; var28 < 0; ++var28) {
                        if(var3 < var35[var17]) {
                           var29 = this.E[(var11 >> 16) + var27];
                           if(var29 != 0) {
                              var23 = (var29 & 16711935) * var21 & -16711936;
                              var24 = (var29 & '\uff00') * var21 & 16711680;
                              var20[var17] = ((var23 | var24) >>> 8) + var7;
                              if(var10) {
                                 var35[var17] = var3;
                              }
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var25;
                     var17 += var18;
                  }
               }
            } else {
               if(var8 != 2) {
                  throw new IllegalArgumentException();
               }

               if(var6 == 1) {
                  var21 = var11;

                  for(var22 = -var5; var22 < 0; ++var22) {
                     var23 = (var12 >> 16) * this.D;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        if(var3 < var35[var17]) {
                           var25 = this.E[(var11 >> 16) + var23];
                           if(var25 != 0) {
                              var26 = var20[var17];
                              var27 = var25 + var26;
                              var28 = (var25 & 16711935) + (var26 & 16711935);
                              var26 = (var28 & 16777472) + (var27 - var28 & 65536);
                              var20[var17] = var27 - var26 | var26 - (var26 >>> 8);
                              if(var10) {
                                 var35[var17] = var3;
                              }
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var21;
                     var17 += var18;
                  }
               } else if(var6 == 0) {
                  var21 = var11;
                  var22 = (var7 & 16711680) >> 16;
                  var23 = (var7 & '\uff00') >> 8;
                  var24 = var7 & 255;

                  for(var25 = -var5; var25 < 0; ++var25) {
                     var26 = (var12 >> 16) * this.D;

                     for(var27 = -var4; var27 < 0; ++var27) {
                        if(var3 < var35[var17]) {
                           var28 = this.E[(var11 >> 16) + var26];
                           if(var28 != 0) {
                              var29 = (var28 & 16711680) * var22 & -16777216;
                              var30 = (var28 & '\uff00') * var23 & 16711680;
                              var31 = (var28 & 255) * var24 & '\uff00';
                              var28 = (var29 | var30 | var31) >>> 8;
                              var32 = var20[var17];
                              var33 = var28 + var32;
                              var34 = (var28 & 16711935) + (var32 & 16711935);
                              var32 = (var34 & 16777472) + (var33 - var34 & 65536);
                              var20[var17] = var33 - var32 | var32 - (var32 >>> 8);
                              if(var10) {
                                 var35[var17] = var3;
                              }
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var21;
                     var17 += var18;
                  }
               } else if(var6 == 3) {
                  var21 = var11;

                  for(var22 = -var5; var22 < 0; ++var22) {
                     var23 = (var12 >> 16) * this.D;

                     for(var24 = -var4; var24 < 0; ++var24) {
                        if(var3 < var35[var17]) {
                           var25 = this.E[(var11 >> 16) + var23];
                           var26 = var25 + var7;
                           var27 = (var25 & 16711935) + (var7 & 16711935);
                           var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                           var25 = var26 - var28 | var28 - (var28 >>> 8);
                           var28 = var20[var17];
                           var26 = var25 + var28;
                           var27 = (var25 & 16711935) + (var28 & 16711935);
                           var28 = (var27 & 16777472) + (var26 - var27 & 65536);
                           var20[var17] = var26 - var28 | var28 - (var28 >>> 8);
                           if(var10) {
                              var35[var17] = var3;
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var21;
                     var17 += var18;
                  }
               } else {
                  if(var6 != 2) {
                     throw new IllegalArgumentException();
                  }

                  var21 = var7 >>> 24;
                  var22 = 256 - var21;
                  var23 = (var7 & 16711935) * var22 & -16711936;
                  var24 = (var7 & '\uff00') * var22 & 16711680;
                  var7 = (var23 | var24) >>> 8;
                  var25 = var11;

                  for(var26 = -var5; var26 < 0; ++var26) {
                     var27 = (var12 >> 16) * this.D;

                     for(var28 = -var4; var28 < 0; ++var28) {
                        if(var3 < var35[var17]) {
                           var29 = this.E[(var11 >> 16) + var27];
                           if(var29 != 0) {
                              var23 = (var29 & 16711935) * var21 & -16711936;
                              var24 = (var29 & '\uff00') * var21 & 16711680;
                              var29 = ((var23 | var24) >>> 8) + var7;
                              var30 = var20[var17];
                              var31 = var29 + var30;
                              var32 = (var29 & 16711935) + (var30 & 16711935);
                              var30 = (var32 & 16777472) + (var31 - var32 & 65536);
                              var20[var17] = var31 - var30 | var30 - (var30 >>> 8);
                              if(var10) {
                                 var35[var17] = var3;
                              }
                           }
                        }

                        var11 += var15;
                        ++var17;
                     }

                     var12 += var16;
                     var11 = var25;
                     var17 += var18;
                  }
               }
            }
         }

      }
   }
}
