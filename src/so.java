import java.awt.Component;

final class so {

   static int a;
   static int[][][] f;
   static int c;
   static int d;
   static int e;
   static int b;


   static final Object[] a(Component var0, byte var1, int var2, int var3) {
      ++b;
      if(mc.a == 0) {
         throw new IllegalStateException();
      } else if(var3 >= 0 && 2 > var3) {
         if(var2 < 256) {
            var2 = 256;
         }

         try {
            Object[] var7 = new Object[10];
            tk.b(var7, 115);
            wka.a(-106, var7);
            ((boolean[])((boolean[])var7[0]))[2] = false;
            ((int[])((int[])var7[1]))[0] = var2;
            var7[2] = new int[(df.g?2:1) * 256];
            mp.a(var7, var0, -11);
            ((int[])((int[])var7[1]))[1] = (-1024 & var2) + 1024;
            if(((int[])((int[])var7[1]))[1] > 16384) {
               ((int[])((int[])var7[1]))[1] = 16384;
            }

            ou.a(6, var7, ((int[])((int[])var7[1]))[1]);
            if(Class_p.e > 0 && null == nk.h) {
               nk.h = sca.a(0, new Object[4]);
               Object[] var4 = nk.h;
               Thread var10000 = new Thread((Runnable)(nk.h == null?null:var4[0]));
               Thread var8 = var10000;
               var8.setDaemon(true);
               var8.start();
               var8.setPriority(Class_p.e);
            }

            if(var1 >= -78) {
               a((Component)null, (byte)109, -30, 10);
            }

            if(nk.h != null) {
               if(((Object[][])((Object[][])nk.h[1]))[var3] != null) {
                  throw new IllegalArgumentException();
               }

               ((Object[][])((Object[][])nk.h[1]))[var3] = var7;
            }

            return var7;
         } catch (Throwable var9) {
            return wka.a(86, new Object[7]);
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static final void a(int var0, byte var1, Object[] var2) {
      if(var1 != 51) {
         a = ((int[])((int[])var2[3]))[7];
      }

      ((int[])((int[])var2[12]))[28] = var0;
      ++e;
   }

   static final byte a(byte var0, char var1) {
      if(var0 != -102) {
         f = (int[][][])((int[][][])null);
      }

      ++c;
      byte var2;
      if((0 >= var1 || var1 >= 128) && (160 > var1 || var1 > 255)) {
         if(var1 == 8364) {
            var2 = -128;
         } else if(var1 != 8218) {
            if(var1 != 402) {
               if(8222 != var1) {
                  if(var1 == 8230) {
                     var2 = -123;
                  } else if(var1 != 8224) {
                     if(8225 == var1) {
                        var2 = -121;
                     } else if(var1 == 710) {
                        var2 = -120;
                     } else if(8240 != var1) {
                        if(352 != var1) {
                           if(8249 == var1) {
                              var2 = -117;
                           } else if(var1 != 338) {
                              if(var1 != 381) {
                                 if(var1 != 8216) {
                                    if(var1 == 8217) {
                                       var2 = -110;
                                    } else if(8220 != var1) {
                                       if(var1 != 8221) {
                                          if(8226 != var1) {
                                             if(8211 != var1) {
                                                if(8212 == var1) {
                                                   var2 = -105;
                                                } else if(var1 == 732) {
                                                   var2 = -104;
                                                } else if(var1 == 8482) {
                                                   var2 = -103;
                                                } else if(var1 != 353) {
                                                   if(8250 == var1) {
                                                      var2 = -101;
                                                   } else if(339 != var1) {
                                                      if(382 == var1) {
                                                         var2 = -98;
                                                      } else if(376 == var1) {
                                                         var2 = -97;
                                                      } else {
                                                         var2 = 63;
                                                      }
                                                   } else {
                                                      var2 = -100;
                                                   }
                                                } else {
                                                   var2 = -102;
                                                }
                                             } else {
                                                var2 = -106;
                                             }
                                          } else {
                                             var2 = -107;
                                          }
                                       } else {
                                          var2 = -108;
                                       }
                                    } else {
                                       var2 = -109;
                                    }
                                 } else {
                                    var2 = -111;
                                 }
                              } else {
                                 var2 = -114;
                              }
                           } else {
                              var2 = -116;
                           }
                        } else {
                           var2 = -118;
                        }
                     } else {
                        var2 = -119;
                     }
                  } else {
                     var2 = -122;
                  }
               } else {
                  var2 = -124;
               }
            } else {
               var2 = -125;
            }
         } else {
            var2 = -126;
         }
      } else {
         var2 = (byte)var1;
      }

      return var2;
   }

   static final void a(boolean var0, int var1) {
      if(var1 != -23105) {
         a(-47, (byte)97, (Object[])null);
      }

      ++d;
      if(null == eoa.b) {
         pv.a((byte)36);
      }

      if(var0) {
         Object[] var2 = eoa.b;
         synchronized(var2) {
            ((boolean[])((boolean[])var2[2]))[0] = true;
         }
      }

   }

}
