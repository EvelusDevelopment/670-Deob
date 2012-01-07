import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

final class nea {

   static int[] d = new int[1];
   static int f_i;
   static int e;
   static int h;
   static int a;
   static int c;
   static int f;
   static int b;
   static int g;


   static final int a(int var0, int var1, byte[] var2, int var3, int var4, String var5) {
      ++c;
      int var6 = var3 + -var0;
      if(var1 != 4) {
         a((byte)94, (Object[])null, 80);
      }

      for(int var7 = 0; var6 > var7; ++var7) {
         char var8 = var5.charAt(var7 + var0);
         if((var8 <= 0 || 128 <= var8) && (var8 < 160 || var8 > 255)) {
            if(8364 != var8) {
               if(var8 == 8218) {
                  var2[var4 + var7] = -126;
               } else if(402 == var8) {
                  var2[var7 + var4] = -125;
               } else if(var8 == 8222) {
                  var2[var7 + var4] = -124;
               } else if(8230 == var8) {
                  var2[var4 + var7] = -123;
               } else if(8224 != var8) {
                  if(var8 == 8225) {
                     var2[var7 + var4] = -121;
                  } else if(var8 == 710) {
                     var2[var7 + var4] = -120;
                  } else if(8240 == var8) {
                     var2[var7 + var4] = -119;
                  } else if(352 != var8) {
                     if(var8 == 8249) {
                        var2[var4 + var7] = -117;
                     } else if(var8 != 338) {
                        if(var8 != 381) {
                           if(8216 == var8) {
                              var2[var4 + var7] = -111;
                           } else if(8217 != var8) {
                              if(var8 == 8220) {
                                 var2[var4 + var7] = -109;
                              } else if(8221 == var8) {
                                 var2[var7 + var4] = -108;
                              } else if(8226 == var8) {
                                 var2[var7 + var4] = -107;
                              } else if(var8 != 8211) {
                                 if(8212 == var8) {
                                    var2[var4 + var7] = -105;
                                 } else if(var8 != 732) {
                                    if(var8 != 8482) {
                                       if(353 == var8) {
                                          var2[var4 + var7] = -102;
                                       } else if(8250 != var8) {
                                          if(var8 != 339) {
                                             if(var8 == 382) {
                                                var2[var4 + var7] = -98;
                                             } else if(var8 == 376) {
                                                var2[var7 + var4] = -97;
                                             } else {
                                                var2[var7 + var4] = 63;
                                             }
                                          } else {
                                             var2[var4 + var7] = -100;
                                          }
                                       } else {
                                          var2[var7 + var4] = -101;
                                       }
                                    } else {
                                       var2[var4 + var7] = -103;
                                    }
                                 } else {
                                    var2[var7 + var4] = -104;
                                 }
                              } else {
                                 var2[var7 + var4] = -106;
                              }
                           } else {
                              var2[var7 + var4] = -110;
                           }
                        } else {
                           var2[var4 + var7] = -114;
                        }
                     } else {
                        var2[var4 + var7] = -116;
                     }
                  } else {
                     var2[var7 + var4] = -118;
                  }
               } else {
                  var2[var7 + var4] = -122;
               }
            } else {
               var2[var7 + var4] = -128;
            }
         } else {
            var2[var7 + var4] = (byte)var8;
         }
      }

      return var6;
   }

   static final InputStreamWorker newInputStreamWorker(Object[] var0) {
      ++e;
      return new InputStreamWorker(var0);
   }

   static final void a(int var0, Object[] var1, int var2) throws LineUnavailableException {
      ++f_i;

      try {
         Info var3 = new Info(SourceDataLine.class, (AudioFormat)var1[7], var2 << (!df.g?1:2));
         var1[9] = AudioSystem.getLine(var3);
         ((Line)var1[9]).open();
         ((DataLine)var1[9]).start();
         if(var0 > -26) {
            d = (int[])((int[])var1[4]);
         }

         ((int[])((int[])var1[1]))[8] = var2;
      } catch (LineUnavailableException var4) {
         if(pm.a(var2, (byte)-65) == 1) {
            var1[9] = null;
            throw var4;
         } else {
            a((int)-123, var1, fda.a(var2, (byte)81));
         }
      }
   }

   static final void a(Object[] var0, float var1, Object[] var2, int var3, float var4, float var5, float var6) {
      int var7 = 127 / ((var3 + 64) / 39);
      ++h;
      int var8 = va.a(var0, (byte)-64);
      int var9 = nba.a(var0, (byte)-84);
      if(eva.b(-105, var0) == hja.c) {
         if(var8 >= 0) {
            var8 *= 4;
            ((float[])((float[])var2[5]))[var8 + 0] = var1;
            ((float[])((float[])var2[5]))[var8 + 1] = var5;
            ((float[])((float[])var2[5]))[var8 + 2] = var4;
            ((float[])((float[])var2[5]))[var8 + 3] = var6;
            ((boolean[])((boolean[])var2[8]))[1] = true;
         }

         if(0 <= var9) {
            var9 *= 4;
            ((float[])((float[])var2[7]))[var9 - 0] = var1;
            ((float[])((float[])var2[7]))[1 + var9] = var5;
            ((float[])((float[])var2[7]))[var9 + 2] = var4;
            ((float[])((float[])var2[7]))[3 + var9] = var6;
            ((boolean[])((boolean[])var2[8]))[2] = true;
         }

      } else {
         throw new bba(var0, "");
      }
   }

   static final Object[] a(Object[] var0, int var1, byte var2) {
      ++a;
      eta.b(var0, -2747);
      if(var2 > -67) {
         return (Object[])null;
      } else {
         ((int[])((int[])var0[0]))[0] = var1;
         return var0;
      }
   }

   static final Object[] a(byte var0, Object[] var1, int var2) {
      if(null == var1[0]) {
         var1[0] = new int[1];
      }

      ++b;
      if(var0 >= -22) {
         d = (int[])null;
      }

      ((int[])((int[])var1[0]))[0] = var2;
      return var1;
   }

   static final void a(int var0, Object[] var1) {
      var1[var0] = ib.a((Object[])((Object[])var1[0]), 16, ((int[])((int[])((Object[])((Object[])var1[1]))[1]))[1]);
      ++g;
   }

   static final int[] a(boolean var0, Object[] var1, qa var2, Object[] var3, int var4, double var5, int var7, boolean var8) {
      wga.f = var2;
      ++f;
      of.a = var3;

      for(int var9 = 0; ~var9 > ~((Object[])((Object[])var1[4])).length; ++var9) {
         ja.a(var7, var4, (byte)90, ((Object[][])((Object[][])var1[4]))[var9]);
      }

      jw.a(3, var5);
      foa.a((byte)-97, var4, var7);
      if(var3 != null && (var3.length == 1 || 16 == var3.length)) {
         hha.e = 1.539397097246091D;
      }

      int[] var22 = new int[var7 * var4];
      int var10 = 0;
      int var11 = 0;
      if(var8) {
         a((byte)-89, (Object[])null, 98);
      }

      for(; var4 > var11; ++var11) {
         int[] var12;
         int[] var13;
         int[] var14;
         int[] var23;
         if(!((boolean[])((boolean[])((Object[])((Object[])var1[2]))[3]))[0]) {
            int[][] var15 = ts.a((Object[])((Object[])var1[2]), -1149, var11);
            var13 = var15[1];
            var12 = var15[0];
            var14 = var15[2];
         } else {
            var23 = te.a((Object[])((Object[])var1[2]), 4, var11);
            var14 = var23;
            var13 = var23;
            var12 = var23;
         }

         if(var0) {
            var10 = var11;
         }

         if(((boolean[])((boolean[])((Object[])((Object[])var1[1]))[3]))[0]) {
            var23 = te.a((Object[])((Object[])var1[1]), 4, var11);
         } else {
            var23 = ts.a((Object[])((Object[])var1[1]), -1149, var11)[0];
         }

         for(int var16 = -1 + var7; 0 <= var16; --var16) {
            int var17 = var12[var16] >> 4;
            if(var17 > 255) {
               var17 = 255;
            }

            if(0 > var17) {
               var17 = 0;
            }

            if(null != var3 && var3.length == 1) {
               jw.a(3, 0.169375651357251D);
            }

            int var18 = var13[var16] >> 4;
            if(255 < var18) {
               var18 = 255;
            }

            if(0 > var18) {
               var18 = 0;
            }

            int var19 = var14[var16] >> 4;
            if(var19 > 255) {
               var19 = 255;
            }

            var18 = fe.o[var18];
            if(0 > var19) {
               var19 = 0;
            }

            var17 = fe.o[var17];
            var19 = fe.o[var19];
            int var20;
            if(0 == var17 && 0 == var18 && var19 == 0) {
               var20 = 0;
            } else {
               var20 = var23[var16] >> 4;
               if(255 < var20) {
                  var20 = 255;
               }

               if(0 > var20) {
                  var20 = 0;
               }
            }

            var22[var10++] = (var18 << 8) + (var17 << 16) + (var20 << 24) + var19;
            if(var0) {
               var10 += var7 - 1;
            }
         }

         if(null != var1 && var1.length == 2) {
            hha.e = -0.563208228289488D;
         }
      }

      for(var11 = 0; ~var11 > ~((Object[])((Object[])var1[4])).length; ++var11) {
         oha.a(false, ((Object[][])((Object[][])var1[4]))[var11]);
      }

      return var22;
   }

}
