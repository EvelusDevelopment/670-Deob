import jaclib.memory.Stream;

final class uu {

   static int d = 1407;
   static int c;
   static int a;
   static int b;


   static final void a(float var0, int var1, int var2, Object[] var3, int var4, int var5) {
      ++b;
      int var8;
      int var9;
      if(-1 != ((int[])((int[])var3[1]))[0]) {
         Object[] var6;
         Object[] var7 = ((ta)(null != (var6 = (Object[])((Object[])var3[2]))?var6[55]:null)).k.a(((int[])((int[])var3[1]))[0], (byte)60);
         var8 = 255 & ((byte[])((byte[])var7[0]))[3];
         int var11;
         if(var8 != 0 && ((byte[])((byte[])var7[0]))[4] != 4) {
            if(0 > var5) {
               var9 = 0;
            } else if(127 >= var5) {
               var9 = 131586 * var5;
            } else {
               var9 = 16777215;
            }

            if(var8 != 256) {
               var11 = 256 + -var8;
               var4 = (var11 * (var4 & 16711935) + var8 * (16711935 & var9) & -16711936) + (16711680 & var8 * ('\uff00' & var9) + var11 * (var4 & '\uff00')) >> 8;
            } else {
               var4 = var9;
            }
         }

         var9 = ((byte[])((byte[])var7[0]))[1] & 255;
         if(var9 != 0) {
            var9 += 256;
            int var10 = (255 & var4 >> 16) * var9;
            if(var10 > '\uffff') {
               var10 = '\uffff';
            }

            var11 = ((var4 & '\uff00') >> 8) * var9;
            if(var11 > '\uffff') {
               var11 = '\uffff';
            }

            int var12 = var9 * (255 & var4);
            if(var12 > '\uffff') {
               var12 = '\uffff';
            }

            var4 = (var12 >> 8) + (var11 & '\uff00') + (16711703 & var10 << 8);
         }
      }

      if(var0 != 1.0F) {
         int var14 = (16757542 & var4) >> 16;
         var8 = var4 >> 8 & 255;
         var9 = var4 & 255;
         var14 = (int)((float)var14 * var0);
         var8 = (int)((float)var8 * var0);
         if(var14 >= 0) {
            if(255 < var14) {
               var14 = 255;
            }
         } else {
            var14 = 0;
         }

         if(0 > var8) {
            var8 = 0;
         } else if(var8 > 255) {
            var8 = 255;
         }

         var9 = (int)((float)var9 * var0);
         if(0 <= var9) {
            if(255 < var9) {
               var9 = 255;
            }
         } else {
            var9 = 0;
         }

         var4 = var8 << 8 | var14 << 16 | var9;
      }

      ((Stream)var3[9]).d(4 * var2);
      ((Stream)var3[9]).b((byte)(var4 >> 16));
      ((Stream)var3[9]).b((byte)(var4 >> 8));
      if(var1 != 23364) {
         a(-0.84312403F, 77, -83, (Object[])null, -53, -120);
      }

      ((Stream)var3[9]).b((byte)var4);
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(var9 != -1) {
         d = 32;
      }

      if(var8 >= hla.g && var8 <= td.r && hla.g <= var5 && td.r >= var5 && var6 >= hla.g && td.r >= var6 && var3 >= hla.g && td.r >= var3 && sea.k <= var4 && var4 <= sda.c && var1 >= sea.k && var1 <= sda.c && var2 >= sea.k && var2 <= sda.c && sea.k <= var0 && sda.c >= var0) {
         vo.a(var9 + -1341515443, var3, var4, var6, var2, var0, var5, var1, var8, var7);
      } else if(var8 == var5 && var4 == var1 && var3 == var6 && var0 == var2) {
         id.a(var4, (byte)65, var3, var7, var0, var8);
      } else {
         int var10 = var8;
         int var11 = var4;
         int var12 = var8 * 3;
         int var13 = var4 * 3;
         int var14 = var5 * 3;
         int var15 = var1 * 3;
         int var16 = 3 * var6;
         int var17 = var2 * 3;
         int var18 = var3 + -var16 + (var14 - var8);
         int var19 = var0 + -var17 + var15 + -var4;
         int var20 = var12 + var16 + -var14 + -var14;
         int var21 = var17 - (var15 - (-var15 + var13));
         int var22 = -var12 + var14;
         int var23 = -var13 + var15;

         for(int var24 = 128; 4096 >= var24; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var25 * var24 >> 12;
            int var27 = var26 * var18;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var25 * var21;
            int var31 = var22 * var24;
            int var32 = var23 * var24;
            int var33 = var8 + (var31 + var27 + var29 >> 12);
            int var34 = (var28 + var30 + var32 >> 12) + var4;
            id.a(var11, (byte)81, var33, var7, var34, var10);
            var11 = var34;
            var10 = var33;
         }
      }

      ++c;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, byte var5, Object[] var6, int var7) {
      ++a;
      int var8 = 0;
      if(var3 != var2) {
         var8 = (var0 + -var7 << 16) / (var2 + -var3);
      }

      int var9 = 0;
      if(var5 != 71) {
         ((boolean[])((boolean[])((Object[])((Object[])var6[45]))[2]))[2] = true;
      }

      if(var2 != var4) {
         var9 = (var1 + -var0 << 16) / (-var2 + var4);
      }

      int var10 = 0;
      if(var3 != var4) {
         var10 = (var7 + -var1 << 16) / (-var4 + var3);
      }

      if(var2 >= var3 && var3 <= var4) {
         if(var2 >= var4) {
            var0 = var7 <<= -1566794768;
            var1 <<= 16;
            if(0 > var3) {
               var0 -= var3 * var10;
               var7 -= var3 * var8;
               var3 = 0;
            }

            if(0 > var4) {
               var1 -= var4 * var9;
               var4 = 0;
            }

            if((var3 == var4 || var8 <= var10) && (var3 != var4 || var8 >= var9)) {
               var2 -= var4;
               var4 -= var3;
               var3 *= ((int[])((int[])var6[1]))[3];

               while(true) {
                  --var4;
                  if(-1 < ~var4) {
                     if(var6 != null && (4 == var6.length || var6.length == 1 && var6[0].equals(Integer.valueOf(2)) && var6[0].equals(Integer.valueOf(0)) || -2 == ~var6.length && var6[0].equals(Integer.valueOf(2)) && var6[0].equals(Integer.valueOf(1)))) {
                        jq.a(105, 1283390664, -58, (byte[])null, -2, 26);
                     }

                     while(true) {
                        --var2;
                        if(0 > var2) {
                           return;
                        }

                        jq.a(0, 1283390664, var1 >> 16, (byte[])((byte[])var6[0]), var7 >> 16, var3);
                        var7 += var8;
                        var3 += ((int[])((int[])var6[1]))[3];
                        var1 += var9;
                     }
                  }

                  jq.a(0, 1283390664, var0 >> 16, (byte[])((byte[])var6[0]), var7 >> 16, var3);
                  var0 += var10;
                  var7 += var8;
                  var3 += ((int[])((int[])var6[1]))[3];
               }
            } else {
               var2 -= var4;
               var4 -= var3;
               var3 = ((int[])((int[])var6[1]))[3] * var3;

               while(true) {
                  --var4;
                  if(-1 < ~var4) {
                     while(true) {
                        --var2;
                        if(0 > var2) {
                           return;
                        }

                        jq.a(0, 1283390664, var7 >> 16, (byte[])((byte[])var6[0]), var1 >> 16, var3);
                        var7 += var8;
                        var3 += ((int[])((int[])var6[1]))[3];
                        var1 += var9;
                     }
                  }

                  jq.a(0, 1283390664, var7 >> 16, (byte[])((byte[])var6[0]), var0 >> 16, var3);
                  var7 += var8;
                  var0 += var10;
                  var3 += ((int[])((int[])var6[1]))[3];
               }
            }
         } else {
            var1 = var7 <<= 16;
            if(0 > var3) {
               var1 -= var3 * var10;
               var7 -= var8 * var3;
               var3 = 0;
            }

            var0 <<= 16;
            if(0 > var2) {
               var0 -= var9 * var2;
               var2 = 0;
            }

            if((var3 == var2 || var10 >= var8) && (var2 != var3 || var9 >= var10)) {
               var4 -= var2;
               var2 -= var3;
               var3 *= ((int[])((int[])var6[1]))[3];

               while(true) {
                  --var2;
                  if(-1 < ~var2) {
                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        jq.a(0, 1283390664, var1 >> 16, (byte[])((byte[])var6[0]), var0 >> 16, var3);
                        var3 += ((int[])((int[])var6[1]))[3];
                        var1 += var10;
                        var0 += var9;
                     }
                  }

                  jq.a(0, 1283390664, var1 >> 16, (byte[])((byte[])var6[0]), var7 >> 16, var3);
                  var7 += var8;
                  var3 += ((int[])((int[])var6[1]))[3];
                  var1 += var10;
               }
            } else {
               var4 -= var2;
               var2 -= var3;
               var3 = ((int[])((int[])var6[1]))[3] * var3;

               while(true) {
                  --var2;
                  if(0 > var2) {
                     while(true) {
                        --var4;
                        if(-1 < ~var4) {
                           return;
                        }

                        jq.a(0, var5 ^ 1283390607, var0 >> 16, (byte[])((byte[])var6[0]), var1 >> 16, var3);
                        var3 += ((int[])((int[])var6[1]))[3];
                        var0 += var9;
                        var1 += var10;
                     }
                  }

                  jq.a(0, 1283390664, var7 >> 16, (byte[])((byte[])var6[0]), var1 >> 16, var3);
                  var3 += ((int[])((int[])var6[1]))[3];
                  var1 += var10;
                  var7 += var8;
               }
            }
         }
      } else if(var4 >= var2) {
         if(var3 > var4) {
            var7 = var0 <<= 16;
            if(0 > var2) {
               var7 -= var2 * var8;
               var0 -= var9 * var2;
               var2 = 0;
            }

            var1 <<= 16;
            if(var4 < 0) {
               var1 -= var10 * var4;
               var4 = 0;
            }

            if((var2 == var4 || var9 <= var8) && (var2 != var4 || var8 <= var10)) {
               var3 -= var4;
               var4 -= var2;
               var2 *= ((int[])((int[])var6[1]))[3];
               if(null == var6 || 2 != var6.length) {
                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        while(true) {
                           --var3;
                           if(-1 < ~var3) {
                              return;
                           }

                           jq.a(0, 1283390664, var7 >> 16, (byte[])((byte[])var6[0]), var1 >> 16, var2);
                           var7 += var8;
                           var1 += var10;
                           var2 += ((int[])((int[])var6[1]))[3];
                        }
                     }

                     jq.a(0, 1283390664, var7 >> 16, (byte[])((byte[])var6[0]), var0 >> 16, var2);
                     var2 += ((int[])((int[])var6[1]))[3];
                     var7 += var8;
                     var0 += var9;
                  }
               }
            } else {
               var3 -= var4;
               var4 -= var2;
               var2 *= ((int[])((int[])var6[1]))[3];
               if(null != var6 && var6.length == 8) {
                  cb.a((Object[])null, 124, (Object[])null, -90, -35);
               }

               while(true) {
                  --var4;
                  if(0 > var4) {
                     while(true) {
                        --var3;
                        if(-1 < ~var3) {
                           return;
                        }

                        jq.a(0, 1283390664, var1 >> 16, (byte[])((byte[])var6[0]), var7 >> 16, var2);
                        var7 += var8;
                        var2 += ((int[])((int[])var6[1]))[3];
                        var1 += var10;
                     }
                  }

                  jq.a(0, 1283390664, var0 >> 16, (byte[])((byte[])var6[0]), var7 >> 16, var2);
                  var0 += var9;
                  var2 += ((int[])((int[])var6[1]))[3];
                  var7 += var8;
               }
            }
         } else {
            var1 = var0 <<= 16;
            var7 <<= 16;
            if(0 > var2) {
               var1 -= var2 * var8;
               var0 -= var9 * var2;
               var2 = 0;
            }

            if(0 > var3) {
               var7 -= var10 * var3;
               var3 = 0;
            }

            if(var8 < var9) {
               var4 -= var3;
               if(var6 != null && 1 == var6.length) {
                  a(92, -40, 46, 60, 92, (byte)71, (Object[])null, 66);
               }

               var3 -= var2;
               var2 = ((int[])((int[])var6[1]))[3] * var2;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           return;
                        }

                        jq.a(0, var5 ^ 1283390607, var0 >> 16, (byte[])((byte[])var6[0]), var7 >> 16, var2);
                        var2 += ((int[])((int[])var6[1]))[3];
                        var0 += var9;
                        var7 += var10;
                     }
                  }

                  jq.a(0, var5 ^ 1283390607, var0 >> 16, (byte[])((byte[])var6[0]), var1 >> 16, var2);
                  var1 += var8;
                  var2 += ((int[])((int[])var6[1]))[3];
                  var0 += var9;
               }
            } else {
               var4 -= var3;
               var3 -= var2;
               var2 = ((int[])((int[])var6[1]))[3] * var2;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     while(true) {
                        --var4;
                        if(var4 < 0) {
                           if(var6 != null && -7 == ~var6.length && var6[4].equals(Boolean.valueOf(false))) {
                              jv.a((byte)-11, (Object[])null);
                           }

                           return;
                        }

                        jq.a(0, 1283390664, var7 >> 16, (byte[])((byte[])var6[0]), var0 >> 16, var2);
                        var7 += var10;
                        var2 += ((int[])((int[])var6[1]))[3];
                        var0 += var9;
                     }
                  }

                  jq.a(0, 1283390664, var1 >> 16, (byte[])((byte[])var6[0]), var0 >> 16, var2);
                  var1 += var8;
                  var0 += var9;
                  var2 += ((int[])((int[])var6[1]))[3];
               }
            }
         }
      } else if(var3 >= var2) {
         var7 = var1 <<= 16;
         if(0 > var4) {
            var1 -= var4 * var10;
            var7 -= var4 * var9;
            var4 = 0;
         }

         var0 <<= 16;
         if(0 > var2) {
            var0 -= var8 * var2;
            var2 = 0;
         }

         if(var9 < var10) {
            var3 -= var2;
            var2 -= var4;
            var4 = ((int[])((int[])var6[1]))[3] * var4;

            while(true) {
               --var2;
               if(-1 < ~var2) {
                  while(true) {
                     --var3;
                     if(var3 < 0) {
                        return;
                     }

                     jq.a(0, 1283390664, var1 >> 16, (byte[])((byte[])var6[0]), var0 >> 16, var4);
                     var0 += var8;
                     var1 += var10;
                     var4 += ((int[])((int[])var6[1]))[3];
                  }
               }

               jq.a(0, 1283390664, var1 >> 16, (byte[])((byte[])var6[0]), var7 >> 16, var4);
               var7 += var9;
               var1 += var10;
               var4 += ((int[])((int[])var6[1]))[3];
            }
         } else {
            var3 -= var2;
            var2 -= var4;
            var4 = ((int[])((int[])var6[1]))[3] * var4;

            while(true) {
               --var2;
               if(0 > var2) {
                  while(true) {
                     --var3;
                     if(0 > var3) {
                        if(var6 != null && 4 == var6.length) {
                           return;
                        } else {
                           return;
                        }
                     }

                     jq.a(0, 1283390664, var0 >> 16, (byte[])((byte[])var6[0]), var1 >> 16, var4);
                     var4 += ((int[])((int[])var6[1]))[3];
                     var1 += var10;
                     var0 += var8;
                  }
               }

               jq.a(0, var5 ^ 1283390607, var7 >> 16, (byte[])((byte[])var6[0]), var1 >> 16, var4);
               var1 += var10;
               var4 += ((int[])((int[])var6[1]))[3];
               var7 += var9;
            }
         }
      } else {
         var0 = var1 <<= 16;
         var7 <<= 16;
         if(0 > var4) {
            var1 -= var10 * var4;
            var0 -= var9 * var4;
            var4 = 0;
         }

         if(var3 < 0) {
            var7 -= var3 * var8;
            var3 = 0;
         }

         if(var10 > var9) {
            var2 -= var3;
            var3 -= var4;
            var4 *= ((int[])((int[])var6[1]))[3];

            while(true) {
               --var3;
               if(-1 < ~var3) {
                  if(var6 != null && 1 == var6.length) {
                     vw.a(1, new Object[3][]);
                  }

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        return;
                     }

                     jq.a(0, 1283390664, var7 >> 16, (byte[])((byte[])var6[0]), var0 >> 16, var4);
                     var0 += var9;
                     var7 += var8;
                     var4 += ((int[])((int[])var6[1]))[3];
                  }
               }

               jq.a(0, 1283390664, var1 >> 16, (byte[])((byte[])var6[0]), var0 >> 16, var4);
               var4 += ((int[])((int[])var6[1]))[3];
               var0 += var9;
               var1 += var10;
            }
         } else {
            var2 -= var3;
            var3 -= var4;
            var4 *= ((int[])((int[])var6[1]))[3];

            while(true) {
               --var3;
               if(0 > var3) {
                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        if(null != var6 && (2 == var6.length && var6[1].equals(Integer.valueOf(2)) || var6.length == 9 && var6[8].equals(Boolean.valueOf(false)) && var6[8].equals(Boolean.valueOf(false)))) {
                           jq.a(25, 1283390664, 67, (byte[])null, 6, 64);
                        }

                        return;
                     }

                     jq.a(0, 1283390664, var0 >> 16, (byte[])((byte[])var6[0]), var7 >> 16, var4);
                     var0 += var9;
                     var4 += ((int[])((int[])var6[1]))[3];
                     var7 += var8;
                  }
               }

               jq.a(0, 1283390664, var0 >> 16, (byte[])((byte[])var6[0]), var1 >> 16, var4);
               var4 += ((int[])((int[])var6[1]))[3];
               var1 += var10;
               var0 += var9;
            }
         }
      }
   }

}
