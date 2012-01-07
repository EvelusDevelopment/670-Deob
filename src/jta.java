
final class jta {

   static int m;
   static int h = 0;
   static Object[] f_i = ed.a(6, new Object[1], (byte)-108, 134);
   static int f;
   static int c;
   static int b;
   static int d;
   static int[] g = new int[1];
   static int f_l;
   static int k;
   static Object[] e = ve.a(new Object[1], (byte)3, 2);
   static int[] a = new int[2];
   static boolean[] j;


   static final Object[] a(byte var0, byte[] var1, Object[] var2) {
      ++c;
      if(var0 > -81) {
         g = (int[])null;
      }

      if(var2[1] == null) {
         var2[1] = new int[1];
      }

      tp var4 = new tp(var2);
      var2[2] = var1;
      ((int[])((int[])var2[1]))[0] = 0;
      var2[0] = var4;
      return var2;
   }

   static final lra a(Object[] var0, int var1) {
      ++b;
      if(var1 >= -40) {
         a = (int[])((int[])f_i[0]);
      }

      return new lra(var0);
   }

   static final byte[] a(String var0, int var1) {
      ++k;
      int var2 = var0.length();
      byte[] var3 = new byte[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if((var5 <= 0 || 128 <= var5) && (var5 < 160 || var5 > 255)) {
            if(var5 != 8364) {
               if(var5 == 8218) {
                  var3[var4] = -126;
               } else if(402 == var5) {
                  var3[var4] = -125;
               } else if(var5 == 8222) {
                  var3[var4] = -124;
               } else if(8230 == var5) {
                  var3[var4] = -123;
               } else if(8224 == var5) {
                  var3[var4] = -122;
               } else if(8225 == var5) {
                  var3[var4] = -121;
               } else if(var5 != 710) {
                  if(8240 == var5) {
                     var3[var4] = -119;
                  } else if(352 == var5) {
                     var3[var4] = -118;
                  } else if(8249 == var5) {
                     var3[var4] = -117;
                  } else if(var5 == 338) {
                     var3[var4] = -116;
                  } else if(381 != var5) {
                     if(var5 == 8216) {
                        var3[var4] = -111;
                     } else if(var5 != 8217) {
                        if(8220 != var5) {
                           if(var5 == 8221) {
                              var3[var4] = -108;
                           } else if(8226 != var5) {
                              if(var5 != 8211) {
                                 if(8212 == var5) {
                                    var3[var4] = -105;
                                 } else if(732 == var5) {
                                    var3[var4] = -104;
                                 } else if(8482 == var5) {
                                    var3[var4] = -103;
                                 } else if(var5 == 353) {
                                    var3[var4] = -102;
                                 } else if(var5 == 8250) {
                                    var3[var4] = -101;
                                 } else if(339 != var5) {
                                    if(var5 == 382) {
                                       var3[var4] = -98;
                                    } else if(var5 != 376) {
                                       var3[var4] = 63;
                                    } else {
                                       var3[var4] = -97;
                                    }
                                 } else {
                                    var3[var4] = -100;
                                 }
                              } else {
                                 var3[var4] = -106;
                              }
                           } else {
                              var3[var4] = -107;
                           }
                        } else {
                           var3[var4] = -109;
                        }
                     } else {
                        var3[var4] = -110;
                     }
                  } else {
                     var3[var4] = -114;
                  }
               } else {
                  var3[var4] = -120;
               }
            } else {
               var3[var4] = -128;
            }
         } else {
            var3[var4] = (byte)var5;
         }
      }

      if(var1 < 51) {
         b((Object[])((Object[])((Object[])((Object[])e[1]))[15]), (byte)-127);
      }

      return var3;
   }

   static final int b(Object[] var0, byte var1) {
      ++m;
      int var2 = 70 % ((45 - var1) / 49);
      ((int[])((int[])var0[1]))[0] += 2;
      return (255 & -128 + ((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[0] - 1]) + ((((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[0] - 2] & 255) << 8);
   }

   static final void a(int var0, Object[] var1) {
      ++f;
      if(null == var1[3]) {
         var1[3] = new boolean[1];
      }

      if(var0 != 21978) {
         a((Object[])((Object[])var1[0]), ((byte[])((byte[])((Object[])((Object[])var1[6]))[8]))[9]);
      }

      if(null == var1[1]) {
         var1[1] = new int[3];
      }

   }

   static final Object[] a(Object[] var0, byte var1) {
      ++f_l;
      return var1 <= 103?(Object[])null:kaa.a;
   }

}
