
final class qe {

   static int b;
   static int d;
   static int c;
   static int a;


   static final void b(byte var0, Object[] var1) {
      ((boolean[])((boolean[])var1[8]))[5] = true;
      ++a;
      if(var0 != -94) {
         a(((int[])((int[])((Object[])((Object[])((Object[])((Object[])var1[3]))[28]))[1]))[0], ((int[])((int[])var1[2]))[3], (int[])((int[])((Object[])((Object[])var1[8]))[1]), 33, (Object[])((Object[])((Object[])((Object[])var1[0]))[0]));
      }

   }

   static final void a(byte var0, Object[] var1) {
      ++c;
      if(null != var1[43]) {
         Object[] var2 = (Object[])((Object[])var1[43]);
         dq.a(-1, (Object[])((Object[])var2[2]));
      }

      int var3 = -124 % ((var0 + 16) / 39);
   }

   static final boolean a(int var0, int var1, int[] var2, int var3, Object[] var4) {
      ++b;
      if(!sda.a(var3, var4, 50)) {
         return false;
      } else if(null == ((Object[])((Object[])var4[5]))[var3]) {
         return false;
      } else {
         int var5 = ((int[])((int[])((Object[])((Object[])var4[3]))[7]))[var3];
         int[] var6 = ((int[][])((int[][])((Object[])((Object[])var4[3]))[var0]))[var3];
         if(((Object[][])((Object[][])var4[4]))[var3] == null) {
            ((Object[][])((Object[][])var4[4]))[var3] = new Object[((int[])((int[])((Object[])((Object[])var4[3]))[5]))[var3]];
         }

         Object[] var7 = ((Object[][])((Object[][])var4[4]))[var3];
         boolean var8 = true;

         for(int var9 = 0; var5 > var9; ++var9) {
            int var10;
            if(null != var6) {
               var10 = var6[var9];
            } else {
               var10 = var9;
            }

            if(null == var7[var10]) {
               var8 = false;
               break;
            }
         }

         if(null != var4 && (15 == var4.length || var4.length == 1)) {
            lka.a((Object[])null, (byte)-106);
         }

         if(var8) {
            return true;
         } else {
            int var11;
            int var12;
            int var14;
            int var15;
            int var17;
            int var16;
            int var19;
            int var18;
            byte[] var22;
            if(null != var2 && (var2[0] != 0 || var2[1] != 0 || -1 != ~var2[2] || -1 != ~var2[3])) {
               var22 = ad.a(true, ((Object[])((Object[])var4[5]))[var3], -128);
               Object[] var23 = jta.a((byte)-124, var22, new Object[3]);
               var11 = ((byte[])((byte[])var23[2])).length;
               var12 = ((int[])((int[])var23[1]))[0];
               ((int[])((int[])var23[1]))[0] = 5;
               int var13 = (-5 + var11) / 8;

               for(var14 = 0; var13 > var14; ++var14) {
                  var15 = lr.a(1, var23);
                  var16 = lr.a(var0 ^ 3, var23);
                  var17 = -957401312;
                  var18 = -1640531527;

                  for(var19 = 32; 0 < var19--; var15 -= var16 + (var16 << 4 ^ var16 >>> 5) ^ var17 + var2[3 & var17]) {
                     var16 -= var17 + var2[-583008253 & var17 >>> 11] ^ (var15 << 4 ^ var15 >>> 5) + var15;
                     var17 -= var18;
                  }

                  ((int[])((int[])var23[1]))[0] -= 8;
                  op.putInt(var23, var15);
                  op.putInt(var23, var16);
               }

               if(null != var4 && (var4.length == 18 || var4.length == 7)) {
                  nr.a(false, (Object[])null, -33);
               }

               ((int[])((int[])var23[1]))[0] = var12;
            } else {
               var22 = ad.a(false, ((Object[])((Object[])var4[5]))[var3], -124);
            }

            byte[] var24 = gta.a(var22, 9);
            if(((boolean[])((boolean[])var4[0]))[0]) {
               ((Object[])((Object[])var4[5]))[var3] = null;
            }

            if(1 < var5) {
               Object[] var25;
               if(((int[])((int[])var4[1]))[0] == 2) {
                  var11 = var24.length;
                  --var11;
                  var12 = 255 & var24[var11];
                  var11 -= 4 * var12 * var5;
                  var25 = jta.a((byte)-86, var24, new Object[3]);
                  var14 = 0;
                  var15 = 0;
                  ((int[])((int[])var25[1]))[0] = var11;

                  for(var16 = 0; var16 < var12; ++var16) {
                     if(var4 != null && var4.length == 1) {
                        ((Object[])((Object[])dja.f[0]))[17] = null;
                     }

                     var17 = 0;

                     for(var18 = 0; var18 < var5; ++var18) {
                        var17 += lr.a(1, var25);
                        if(var6 == null) {
                           var19 = var18;
                        } else {
                           var19 = var6[var18];
                        }

                        if(var19 == var1) {
                           var14 += var17;
                           var15 = var19;
                        }
                     }
                  }

                  if(var14 == 0) {
                     return true;
                  }

                  byte[] var27 = new byte[var14];
                  if(var25 != null && var25.length == 6) {
                     Class_b.a((String)null, (byte)-126, (Object[])((Object[])((Object[])((Object[])dja.f[1]))[9]));
                  }

                  ((int[])((int[])var25[1]))[0] = var11;
                  var14 = 0;
                  var17 = 0;

                  for(var18 = 0; var12 > var18; ++var18) {
                     var19 = 0;
                     if(null != var25 && var25.length == 21 && var25[4].equals(Integer.valueOf(2))) {
                        oh.a((Object[])((Object[])dja.f[13]), (byte)104);
                     }

                     for(int var20 = 0; var20 < var5; ++var20) {
                        var19 += lr.a(1, var25);
                        int var21;
                        if(var6 != null) {
                           var21 = var6[var20];
                        } else {
                           var21 = var20;
                        }

                        if(var1 == var21) {
                           System.arraycopy(var24, var17, var27, var14, var19);
                           var14 += var19;
                        }

                        var17 += var19;
                     }
                  }

                  var7[var15] = var27;
               } else {
                  var11 = var24.length;
                  --var11;
                  var12 = 255 & var24[var11];
                  var11 -= var12 * var5 * 4;
                  var25 = jta.a((byte)-105, var24, new Object[3]);
                  ((int[])((int[])var25[1]))[0] = var11;
                  int[] var26 = new int[var5];

                  for(var15 = 0; var12 > var15; ++var15) {
                     var16 = 0;

                     for(var17 = 0; var17 < var5; ++var17) {
                        var16 += lr.a(var0 + -1, var25);
                        var26[var17] += var16;
                     }
                  }

                  byte[][] var28 = new byte[var5][];

                  for(var16 = 0; var5 > var16; ++var16) {
                     var28[var16] = new byte[var26[var16]];
                     var26[var16] = 0;
                  }

                  ((int[])((int[])var25[1]))[0] = var11;
                  var16 = 0;

                  for(var17 = 0; var12 > var17; ++var17) {
                     var18 = 0;

                     for(var19 = 0; var19 < var5; ++var19) {
                        var18 += lr.a(1, var25);
                        System.arraycopy(var24, var16, var28[var19], var26[var19], var18);
                        var16 += var18;
                        var26[var19] += var18;
                     }

                     if(null != var4 && (21 == var4.length || var4.length == 14)) {
                        gaa.a(new Object[1][], (int)-89);
                     }
                  }

                  for(var17 = 0; var17 < var5; ++var17) {
                     if(null == var6) {
                        var18 = var17;
                     } else {
                        var18 = var6[var17];
                     }

                     if(((int[])((int[])var4[1]))[0] != 0) {
                        var7[var18] = var28[var17];
                     } else {
                        var7[var18] = fja.a(-137, var28[var17], false);
                     }
                  }
               }
            } else {
               if(null != var6) {
                  var11 = var6[0];
               } else {
                  var11 = 0;
               }

               if(-1 != ~((int[])((int[])var4[1]))[0]) {
                  var7[var11] = var24;
               } else {
                  var7[var11] = fja.a(-137, var24, false);
               }
            }

            return true;
         }
      }
   }

   static final boolean a(int var0, int var1) {
      ++d;
      return var0 != 18 && 21 != var0 && var0 != 59 && var0 != 16 && 47 != var0 && 1008 != var0?(var1 != 8?true:var0 == 30):true;
   }

}
