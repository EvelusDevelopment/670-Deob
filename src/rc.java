import java.io.IOException;

final class rc {

   static Object[] c = ho.a(-1, 23, new Object[1], true);
   static int b;
   static int f;
   static int a;
   static Object[] e = im.a(new Object[2], (int)-16365);
   static int d;
   static cga g;


   static final Object[] a(int var0, Object[] var1, byte[] var2) {
      ++b;
      if(null != var1 && -20 == ~var1.length && var1[3].equals(Integer.valueOf(2)) && var1[3].equals(Integer.valueOf(0))) {
         a(3876, (Object[])null, (byte[])null);
      }

      int var3 = var2.length;
      if(var0 != 3876) {
         return (Object[])null;
      } else {
         var1[2] = var2;
         var1[1] = new int[var3];
         int[] var4 = new int[33];
         var1[0] = new int[8];
         int var5 = 0;

         for(int var6 = 0; var3 > var6; ++var6) {
            byte var7 = var2[var6];
            if(0 != var7) {
               int var8 = 1 << 32 + -var7;
               int var9 = var4[var7];
               ((int[])((int[])var1[1]))[var6] = var9;
               int var10;
               int var11;
               int var12;
               int var13;
               if((var8 & var9) != 0) {
                  var10 = var4[-1 + var7];
               } else {
                  var10 = var9 | var8;

                  for(var11 = var7 - 1; var11 >= 1; --var11) {
                     var12 = var4[var11];
                     if(var12 != var9) {
                        break;
                     }

                     var13 = 1 << -var11 + 32;
                     if(-1 != ~(var13 & var12)) {
                        var4[var11] = var4[-1 + var11];
                        break;
                     }

                     var4[var11] = var13 | var12;
                  }
               }

               var4[var7] = var10;

               for(var11 = var7 + 1; var11 <= 32; ++var11) {
                  if(var9 == var4[var11]) {
                     var4[var11] = var10;
                  }
               }

               var11 = 0;

               for(var12 = 0; var12 < var7; ++var12) {
                  var13 = Integer.MIN_VALUE >>> var12;
                  if(-1 != ~(var13 & var9)) {
                     if(((int[])((int[])var1[0]))[var11] == 0) {
                        ((int[])((int[])var1[0]))[var11] = var5;
                     }

                     var11 = ((int[])((int[])var1[0]))[var11];
                  } else {
                     ++var11;
                  }

                  var13 >>>= 1;
                  if(((int[])((int[])var1[0])).length <= var11) {
                     int[] var14 = new int[((int[])((int[])var1[0])).length * 2];

                     for(int var15 = 0; ~var15 > ~((int[])((int[])var1[0])).length; ++var15) {
                        var14[var15] = ((int[])((int[])var1[0]))[var15];
                     }

                     var1[0] = var14;
                  }
               }

               ((int[])((int[])var1[0]))[var11] = ~var6;
               if(var11 >= var5) {
                  var5 = var11 - -1;
               }
            }
         }

         return var1;
      }
   }

   static final byte[] a(Object[] var0, int var1, int var2) {
      ++f;
      synchronized(var0[3]) {
         try {
            if(mea.a((byte)-78, (Object[])((Object[])var0[0])) < (long)(6 * var1 + 6)) {
               return null;
            } else {
               gla.a((byte)-126, (long)(6 * var1), (Object[])((Object[])var0[0]));
               int var4 = -82 % ((var2 - 67) / 43);
               mv.a(-112, oca.d, 0, 6, (Object[])((Object[])var0[0]));
               int var5 = ((oca.d[0] & 255) << 16) + (oca.d[1] << 8 & '\uff00') + (255 & oca.d[2]);
               int var6 = (16711680 & oca.d[3] << 16) - (-('\uff00' & oca.d[4] << 8) - (255 & oca.d[5]));
               if(0 > var5 || ~var5 < ~((int[])((int[])var0[1]))[0]) {
                  return null;
               } else {
                  if(null != var0 && var0.length == 1) {
                     nsa.a(-110, false, 4, (byte[])null, -120, (Object[])null);
                  }

                  if(var6 <= 0 || (long)var6 > mea.a((byte)-96, (Object[])((Object[])var0[3])) / 520L) {
                     return null;
                  } else {
                     byte[] var7 = new byte[var5];
                     int var8 = 0;
                     int var9 = 0;

                     while(true) {
                        if(var5 > var8) {
                           if(var6 != 0) {
                              gla.a((byte)-105, (long)(520 * var6), (Object[])((Object[])var0[3]));
                              int var10 = -var8 + var5;
                              int var11;
                              int var12;
                              int var13;
                              int var14;
                              byte var15;
                              if('\uffff' < var1) {
                                 if(510 < var10) {
                                    var10 = 510;
                                 }

                                 var15 = 10;
                                 mv.a(50, oca.d, 0, var10 + var15, (Object[])((Object[])var0[3]));
                                 var13 = (16711680 & oca.d[6] << 16) + ((255 & oca.d[7]) << 8) + (oca.d[8] & 255);
                                 var12 = ('\uff00' & oca.d[4] << 8) + (255 & oca.d[5]);
                                 var11 = (oca.d[3] & 255) + ((oca.d[2] & 255) << 8) + (-16777216 & oca.d[0] << 24) + (16711680 & oca.d[1] << 16);
                                 var14 = 255 & oca.d[9];
                              } else {
                                 var15 = 8;
                                 if(var10 > 512) {
                                    var10 = 512;
                                 }

                                 mv.a(-114, oca.d, 0, var15 + var10, (Object[])((Object[])var0[3]));
                                 var13 = ((255 & oca.d[5]) << 8) + ((255 & oca.d[4]) << 16) + (oca.d[6] & 255);
                                 var14 = 255 & oca.d[7];
                                 var11 = (255 & oca.d[1]) + (oca.d[0] << 8 & '\uff00');
                                 var12 = ((255 & oca.d[2]) << 8) + (oca.d[3] & 255);
                              }

                              if(var1 == var11 && var9 == var12 && var14 == ((int[])((int[])var0[1]))[1]) {
                                 if(null != var0 && var0.length == 17) {
                                    ot.a(false, -54, (byte[])null, -118, (Object[])null);
                                 }

                                 if(0 <= var13 && ~(mea.a((byte)105, (Object[])((Object[])var0[3])) / 520L) <= ~((long)var13)) {
                                    int var16 = var10 + var15;
                                    var6 = var13;

                                    for(int var17 = var15; var16 > var17; ++var17) {
                                       var7[var8++] = oca.d[var17];
                                    }

                                    ++var9;
                                    continue;
                                 }

                                 return null;
                              }

                              return null;
                           }

                           return null;
                        }

                        byte[] var10000 = var7;
                        return var10000;
                     }
                  }
               }
            }
         } catch (IOException var19) {
            return null;
         }
      }
   }

   static final Object[] a(Object[] var0, int var1) {
      gv.a(false, var0);
      if(var1 != 2048) {
         g = (cga)null;
      }

      ++d;
      uca.a(0, var0, false, true);
      var0[6] = new byte[512];
      ((int[])((int[])var0[1]))[5] = 1;
      ((int[])((int[])var0[1]))[1] = 5;
      ((int[])((int[])var0[1]))[3] = 5;
      ((int[])((int[])var0[1]))[4] = 2048;
      ((int[])((int[])var0[1]))[2] = 0;
      ((int[])((int[])var0[1]))[6] = 2;
      var0[8] = new short[512];
      return var0;
   }

   static final void a(Object[] var0, boolean var1) {
      if(!var1) {
         g = (cga)e[0];
      }

      ++a;
      if(null == var0[1]) {
         var0[1] = new int[2];
      }

   }

}
