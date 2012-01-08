
final class lh extends lm {

   Object[] j;
   byte[] k;


   final void b() {
      if(this.j == null) {
         this.j = nb.a((byte)81, 16, new Object[5]);
         int[] var3 = new int[16];
         int[] var4 = new int[16];
         var4[9] = 128;
         var3[9] = 128;
         tf var6 = new tf(this.k);
         int var7 = var6.c();

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            var6.e(var8);
            var6.a(var8);
            var6.c(var8);
         }

         while(true) {
            var8 = var6.d();
            int var9 = var6.e[var8];

            while(var6.e[var8] == var9) {
               var6.e(var8);
               int var10 = var6.f(var8);
               if(var10 == 1) {
                  var6.e();
                  var6.c(var8);
                  if(var6.b()) {
                     return;
                  }
                  break;
               }

               int var11 = var10 & 240;
               int var12;
               int var13;
               int var14;
               if(var11 == 176) {
                  var12 = var10 & 15;
                  var13 = var10 >> 8 & 127;
                  var14 = var10 >> 16 & 127;
                  if(var13 == 0) {
                     var3[var12] = (var3[var12] & -2080769) + (var14 << 14);
                  }

                  if(var13 == 32) {
                     var3[var12] = (var3[var12] & -16257) + (var14 << 7);
                  }
               }

               if(var11 == 192) {
                  var12 = var10 & 15;
                  var13 = var10 >> 8 & 127;
                  var4[var12] = var3[var12] + var13;
               }

               if(var11 == 144) {
                  var12 = var10 & 15;
                  var13 = var10 >> 8 & 127;
                  var14 = var10 >> 16 & 127;
                  if(var14 > 0) {
                     int var15 = var4[var12];
                     kga var1;
                     Object[] var16 = (var1 = (kga)pm.a((long)var15, this.j, false)) == null?null:var1.k;
                     if(var16 == null) {
                        var16 = ega.a(-24, new Object[2], new byte[128]);
                        di.a(this.j, true, (lm)(var16 == null?null:var16[0]), (long)var15);
                     }

                     ((byte[])((byte[])var16[1]))[var13] = 1;
                  }
               }

               var6.a(var8);
               var6.c(var8);
            }
         }
      }
   }

   final void a() {
      this.j = null;
   }

   static final lh a(Object[] var0, int var1, int var2) {
      byte[] var3 = qn.a(var1, var2, var0, 48);
      return var3 == null?null:new lh(jta.a((byte)-114, var3, new Object[3]));
   }

   private lh(Object[] var1) {
      ((int[])((int[])var1[1]))[0] = ((byte[])((byte[])var1[2])).length - 3;
      int var2 = fh.a(var1, false);
      int var3 = de.a((int)0, var1);
      int var4 = 14 + var2 * 10;
      ((int[])((int[])var1[1]))[0] = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;

      int var14;
      int var15;
      while(var13 < var2) {
         var14 = -1;

         while(true) {
            var15 = fh.a(var1, false);
            if(var15 != var14) {
               ++var4;
            }

            var14 = var15 & 15;
            if(var15 == 7) {
               ++var13;
               break;
            }

            if(var15 == 23) {
               ++var5;
            } else if(var14 == 0) {
               ++var7;
            } else if(var14 == 1) {
               ++var8;
            } else if(var14 == 2) {
               ++var6;
            } else if(var14 == 3) {
               ++var9;
            } else if(var14 == 4) {
               ++var10;
            } else if(var14 == 5) {
               ++var11;
            } else {
               if(var14 != 6) {
                  throw new RuntimeException();
               }

               ++var12;
            }
         }
      }

      var4 += 5 * var5;
      var4 += 2 * (var7 + var8 + var6 + var9 + var11);
      var4 += var10 + var12;
      var13 = ((int[])((int[])var1[1]))[0];
      var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;

      for(var15 = 0; var15 < var14; ++var15) {
         nj.a(var1, true);
      }

      var4 += ((int[])((int[])var1[1]))[0] - var13;
      var15 = ((int[])((int[])var1[1]))[0];
      int var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      int var20 = 0;
      int var21 = 0;
      int var22 = 0;
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28 = 0;

      int var29;
      for(var29 = 0; var29 < var6; ++var29) {
         var28 = var28 + fh.a(var1, false) & 127;
         if(var28 != 0 && var28 != 32) {
            if(var28 == 1) {
               ++var16;
            } else if(var28 == 33) {
               ++var17;
            } else if(var28 == 7) {
               ++var18;
            } else if(var28 == 39) {
               ++var19;
            } else if(var28 == 10) {
               ++var20;
            } else if(var28 == 42) {
               ++var21;
            } else if(var28 == 99) {
               ++var22;
            } else if(var28 == 98) {
               ++var23;
            } else if(var28 == 101) {
               ++var24;
            } else if(var28 == 100) {
               ++var25;
            } else if(var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
               ++var27;
            } else {
               ++var26;
            }
         } else {
            ++var12;
         }
      }

      var29 = 0;
      int var30 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var26;
      int var31 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var11;
      int var32 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var10;
      int var33 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var9;
      int var34 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var16;
      int var35 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var18;
      int var36 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var20;
      int var37 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var7 + var8 + var11;
      int var38 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var7;
      int var39 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var27;
      int var40 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var8;
      int var41 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var17;
      int var42 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var19;
      int var43 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var21;
      int var44 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var12;
      int var45 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var9;
      int var46 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var22;
      int var47 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var23;
      int var48 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var24;
      int var49 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var25;
      int var50 = ((int[])((int[])var1[1]))[0];
      ((int[])((int[])var1[1]))[0] += var5 * 3;
      this.k = new byte[var4];
      Object[] var51 = jta.a((byte)-113, this.k, new Object[3]);
      op.putInt(var51, 1297377380);
      op.putInt(var51, 6);
      eda.putShort(var51, var2 > 1?1:0);
      eda.putShort(var51, var2);
      eda.putShort(var51, var3);
      ((int[])((int[])var1[1]))[0] = var13;
      int var52 = 0;
      int var53 = 0;
      int var54 = 0;
      int var55 = 0;
      int var56 = 0;
      int var57 = 0;
      int var58 = 0;
      int[] var59 = new int[128];
      var28 = 0;
      int var60 = 0;

      while(var60 < var2) {
         op.putInt(var51, 1297379947);
         ((int[])((int[])var51[1]))[0] += 4;
         int var61 = ((int[])((int[])var51[1]))[0];
         int var62 = -1;

         while(true) {
            int var63 = nj.a(var1, true);
            ev.a(var51, var63, (byte)-62);
            int var64 = ((byte[])((byte[])var1[2]))[var29++] & 255;
            boolean var65 = var64 != var62;
            var62 = var64 & 15;
            if(var64 == 7) {
               if(var65) {
                  ek.putByte(var51, 255);
               }

               ek.putByte(var51, 47);
               ek.putByte(var51, 0);
               var64 = ((int[])((int[])var51[1]))[0] - var61;
               ((byte[])((byte[])var51[2]))[-var64 + ((int[])((int[])var51[1]))[0] - 4] = (byte)(var64 >> 24);
               ((byte[])((byte[])var51[2]))[-3 + ((int[])((int[])var51[1]))[0] + -var64] = (byte)(var64 >> 16);
               ((byte[])((byte[])var51[2]))[-2 + ((int[])((int[])var51[1]))[0] + -var64] = (byte)(var64 >> 8);
               ((byte[])((byte[])var51[2]))[((int[])((int[])var51[1]))[0] - (var64 + 1)] = (byte)var64;
               ++var60;
               break;
            }

            if(var64 == 23) {
               if(var65) {
                  ek.putByte(var51, 255);
               }

               ek.putByte(var51, 81);
               ek.putByte(var51, 3);
               ek.putByte(var51, ((byte[])((byte[])var1[2]))[var50++]);
               ek.putByte(var51, ((byte[])((byte[])var1[2]))[var50++]);
               ek.putByte(var51, ((byte[])((byte[])var1[2]))[var50++]);
            } else {
               var52 ^= var64 >> 4;
               if(var62 == 0) {
                  if(var65) {
                     ek.putByte(var51, 144 + var52);
                  }

                  var53 += ((byte[])((byte[])var1[2]))[var37++];
                  var54 += ((byte[])((byte[])var1[2]))[var38++];
                  ek.putByte(var51, var53 & 127);
                  ek.putByte(var51, var54 & 127);
               } else if(var62 == 1) {
                  if(var65) {
                     ek.putByte(var51, 128 + var52);
                  }

                  var53 += ((byte[])((byte[])var1[2]))[var37++];
                  var55 += ((byte[])((byte[])var1[2]))[var40++];
                  ek.putByte(var51, var53 & 127);
                  ek.putByte(var51, var55 & 127);
               } else if(var62 == 2) {
                  if(var65) {
                     ek.putByte(var51, 176 + var52);
                  }

                  var28 = var28 + ((byte[])((byte[])var1[2]))[var15++] & 127;
                  ek.putByte(var51, var28);
                  byte var66;
                  if(var28 != 0 && var28 != 32) {
                     if(var28 == 1) {
                        var66 = ((byte[])((byte[])var1[2]))[var34++];
                     } else if(var28 == 33) {
                        var66 = ((byte[])((byte[])var1[2]))[var41++];
                     } else if(var28 == 7) {
                        var66 = ((byte[])((byte[])var1[2]))[var35++];
                     } else if(var28 == 39) {
                        var66 = ((byte[])((byte[])var1[2]))[var42++];
                     } else if(var28 == 10) {
                        var66 = ((byte[])((byte[])var1[2]))[var36++];
                     } else if(var28 == 42) {
                        var66 = ((byte[])((byte[])var1[2]))[var43++];
                     } else if(var28 == 99) {
                        var66 = ((byte[])((byte[])var1[2]))[var46++];
                     } else if(var28 == 98) {
                        var66 = ((byte[])((byte[])var1[2]))[var47++];
                     } else if(var28 == 101) {
                        var66 = ((byte[])((byte[])var1[2]))[var48++];
                     } else if(var28 == 100) {
                        var66 = ((byte[])((byte[])var1[2]))[var49++];
                     } else if(var28 != 64 && var28 != 65 && var28 != 120 && var28 != 121 && var28 != 123) {
                        var66 = ((byte[])((byte[])var1[2]))[var39++];
                     } else {
                        var66 = ((byte[])((byte[])var1[2]))[var30++];
                     }
                  } else {
                     var66 = ((byte[])((byte[])var1[2]))[var44++];
                  }

                  int var67 = var66 + var59[var28];
                  var59[var28] = var67;
                  ek.putByte(var51, var67 & 127);
               } else if(var62 == 3) {
                  if(var65) {
                     ek.putByte(var51, 224 + var52);
                  }

                  var56 += ((byte[])((byte[])var1[2]))[var45++];
                  var56 += ((byte[])((byte[])var1[2]))[var33++] << 7;
                  ek.putByte(var51, var56 & 127);
                  ek.putByte(var51, var56 >> 7 & 127);
               } else if(var62 == 4) {
                  if(var65) {
                     ek.putByte(var51, 208 + var52);
                  }

                  var57 += ((byte[])((byte[])var1[2]))[var32++];
                  ek.putByte(var51, var57 & 127);
               } else if(var62 == 5) {
                  if(var65) {
                     ek.putByte(var51, 160 + var52);
                  }

                  var53 += ((byte[])((byte[])var1[2]))[var37++];
                  var58 += ((byte[])((byte[])var1[2]))[var31++];
                  ek.putByte(var51, var53 & 127);
                  ek.putByte(var51, var58 & 127);
               } else {
                  if(var62 != 6) {
                     throw new RuntimeException();
                  }

                  if(var65) {
                     ek.putByte(var51, 192 + var52);
                  }

                  ek.putByte(var51, ((byte[])((byte[])var1[2]))[var44++]);
               }
            }
         }
      }

   }
}
