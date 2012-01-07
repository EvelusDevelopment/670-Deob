import java.nio.Buffer;
import java.nio.ByteBuffer;

final class rba {

   static Object[] g = nla.a(-51, new Object[0], 16);
   static int f_i;
   static int e;
   static int j;
   static int f = 0;
   static int d;
   static int a;
   static int b;
   static int[] c = new int[50];
   static float k = 0.0F;
   static int h = 0;


   static final void a(byte var0) {
      ++a;
      if(ra.h) {
         if(var0 > 74) {
            Object[] var1 = nja.a(ft.f_i, 1, rw.A);
            if(null != var1 && null != var1[52]) {
               Object[] var2 = nga.b(new Object[7], (byte)87);
               var2[3] = var1[52];
               var2[0] = var1;
               ck.a(var2, true);
            }

            lca.d = -1;
            jf.c = -1;
            ra.h = false;
            if(null != var1) {
               vr.a(var1, (int)24);
            }

         }
      }
   }

   static final void a(int var0, Object[] var1, ta var2, byte var3) {
      if(var3 != -122) {
         ((int[])((int[])((Object[])((Object[])g[3]))[3]))[8] = -66;
      }

      ++j;
      cka.c = var2;
      int var4;
      if(null != aua.e && ~var0 >= ~((byte[])((byte[])var1[2]))[0]) {
         if(null != var1 && -2 == ~var1.length && var1[0].equals(Integer.valueOf(0)) && var1[0].equals(Integer.valueOf(1))) {
            tda.b(false);
         }

         for(var4 = 0; aua.e.length > var4; ++var4) {
            if(999999 != ~aua.e[var4] && (((int[])((int[])var1[7]))[0] <= aua.e[var4] || ~aua.e[var4] <= ~((int[])((int[])var1[7]))[1] || ((int[])((int[])var1[7]))[2] <= aua.e[var4] || ((int[])((int[])var1[7]))[3] <= aua.e[var4]) && (((int[])((int[])var1[0]))[0] <= jh.c[var4] || jh.c[var4] >= ((int[])((int[])var1[0]))[1] || ~jh.c[var4] <= ~((int[])((int[])var1[0]))[2] || ~jh.c[var4] <= ~((int[])((int[])var1[0]))[3]) && (((int[])((int[])var1[0]))[0] >= bs.k[var4] || ~((int[])((int[])var1[0]))[1] <= ~bs.k[var4] || ((int[])((int[])var1[0]))[2] >= bs.k[var4] || bs.k[var4] <= ((int[])((int[])var1[0]))[3]) && (((int[])((int[])var1[4]))[0] <= ki.f_i[var4] || ~((int[])((int[])var1[4]))[1] >= ~ki.f_i[var4] || ~((int[])((int[])var1[4]))[2] >= ~ki.f_i[var4] || ~ki.f_i[var4] <= ~((int[])((int[])var1[4]))[3]) && (jl.d[var4] <= ((int[])((int[])var1[4]))[0] || ~((int[])((int[])var1[4]))[1] <= ~jl.d[var4] || ~((int[])((int[])var1[4]))[2] <= ~jl.d[var4] || ~jl.d[var4] >= ~((int[])((int[])var1[4]))[3])) {
               return;
            }
         }
      }

      int var5;
      int var6;
      boolean var7;
      float var8;
      if(((byte[])((byte[])var1[2]))[1] == 1) {
         var4 = vt.d + ((short[])((short[])var1[1]))[2] - bd.h;
         if(var4 >= 0 && var4 <= vt.d + vt.d) {
            var5 = vt.d + ((short[])((short[])var1[1]))[0] - oaa.a;
            if(var5 >= 0) {
               if(var5 > vt.d + vt.d) {
                  return;
               }
            } else {
               var5 = 0;
            }

            var6 = ((short[])((short[])var1[1]))[1] + -oaa.a + vt.d;
            if(vt.d + vt.d < var6) {
               var6 = vt.d + vt.d;
            } else if(0 > var6) {
               return;
            }

            var7 = false;

            while(var6 >= var5) {
               if(ju.e[var4][var5++]) {
                  var7 = true;
                  break;
               }
            }

            if(var7) {
               var8 = (float)(-((int[])((int[])var1[0]))[0] + Class_cs.e);
               if(var8 < 0.0F) {
                  var8 *= -1.0F;
               }

               if((float)ji.g <= var8) {
                  if(kpa.a(0, var1, (byte)116)) {
                     if(kpa.a(1, var1, (byte)120)) {
                        if(kpa.a(2, var1, (byte)38)) {
                           if(kpa.a(3, var1, (byte)52)) {
                              if(null != var1 && var1.length == 7 && var1[2].equals(Boolean.valueOf(false))) {
                                 bga.c((Object[])null, var3 ^ -128);
                              }

                              pt.a[ru.b++] = var1;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else if(-3 != ~((byte[])((byte[])var1[2]))[1]) {
         if(-17 != ~((byte[])((byte[])var1[2]))[1] && ((byte[])((byte[])var1[2]))[1] != 8) {
            if(((byte[])((byte[])var1[2]))[1] == 4) {
               float var12 = (float)(((int[])((int[])var1[7]))[0] + -mpa.d);
               if((float)bf.b < var12) {
                  var5 = vt.d + -oaa.a + ((short[])((short[])var1[1]))[0];
                  if(0 > var5) {
                     var5 = 0;
                  } else if(vt.d + vt.d < var5) {
                     return;
                  }

                  var6 = vt.d + ((short[])((short[])var1[1]))[1] + -oaa.a;
                  if(~var6 >= ~(vt.d + vt.d)) {
                     if(var6 < 0) {
                        return;
                     }
                  } else {
                     var6 = vt.d + vt.d;
                  }

                  int var15 = vt.d + -bd.h + ((short[])((short[])var1[1]))[2];
                  if(0 <= var15) {
                     if(vt.d + vt.d < var15) {
                        return;
                     }
                  } else {
                     var15 = 0;
                  }

                  int var16 = ((short[])((short[])var1[1]))[3] - bd.h + vt.d;
                  if(~var16 < ~(vt.d + vt.d)) {
                     var16 = vt.d + vt.d;
                  } else if(var16 < 0) {
                     return;
                  }

                  boolean var9 = false;

                  label343:
                  for(int var10 = var15; var10 <= var16; ++var10) {
                     for(int var11 = var5; var6 >= var11; ++var11) {
                        if(ju.e[var10][var11]) {
                           var9 = true;
                           break label343;
                        }
                     }

                     if(var1 != null && -23 == ~var1.length && var1[6].equals(Boolean.valueOf(false))) {
                        pt.a = (Object[][])null;
                     }
                  }

                  if(var9) {
                     if(kpa.a(0, var1, (byte)55)) {
                        if(kpa.a(1, var1, (byte)85)) {
                           if(kpa.a(2, var1, (byte)83)) {
                              if(kpa.a(3, var1, (byte)103)) {
                                 pt.a[ru.b++] = var1;
                                 if(null != var1 && var1.length == 9 && var1[2].equals(Integer.valueOf(2)) && var1[2].equals(Integer.valueOf(0))) {
                                    wga.a = null;
                                 }

                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            var4 = vt.d + -bd.h + ((short[])((short[])var1[1]))[2];
            if(0 <= var4 && vt.d + vt.d >= var4) {
               var5 = ((short[])((short[])var1[1]))[0] - oaa.a + vt.d;
               if(var5 >= 0 && var5 <= vt.d + vt.d) {
                  if(ju.e[var4][var5]) {
                     float var13 = (float)(Class_cs.e - ((int[])((int[])var1[0]))[0]);
                     if(0.0F > var13) {
                        var13 *= -1.0F;
                     }

                     float var14 = (float)(pha.d + -((int[])((int[])var1[4]))[0]);
                     if(var14 < 0.0F) {
                        var14 *= -1.0F;
                     }

                     if(var13 >= (float)ji.g || var14 >= (float)ji.g) {
                        if(kpa.a(0, var1, (byte)41)) {
                           if(var1 != null && (-3 == ~var1.length || -16 == ~var1.length && var1[4].equals(Integer.valueOf(1)))) {
                              tda.b(false);
                           }

                           if(kpa.a(1, var1, (byte)53)) {
                              if(kpa.a(2, var1, (byte)118)) {
                                 if(kpa.a(3, var1, (byte)39)) {
                                    pt.a[ru.b++] = var1;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         var4 = ((short[])((short[])var1[1]))[0] + -oaa.a + vt.d;
         if(var4 >= 0 && vt.d + vt.d >= var4) {
            var5 = vt.d + -bd.h + ((short[])((short[])var1[1]))[2];
            if(0 <= var5) {
               if(var5 > vt.d + vt.d) {
                  return;
               }
            } else {
               var5 = 0;
            }

            var6 = -bd.h + ((short[])((short[])var1[1]))[3] + vt.d;
            if(~var6 < ~(vt.d + vt.d)) {
               var6 = vt.d + vt.d;
            } else if(var6 < 0) {
               return;
            }

            if(null != var1 && var1.length == 1) {
               bga.c((Object[])null, 6);
            }

            var7 = false;

            while(var5 <= var6) {
               if(ju.e[var5++][var4]) {
                  var7 = true;
                  break;
               }
            }

            if(var7) {
               var8 = (float)(-((int[])((int[])var1[4]))[0] + pha.d);
               if(var8 < 0.0F) {
                  var8 *= -1.0F;
               }

               if((float)ji.g <= var8) {
                  if(kpa.a(0, var1, (byte)80)) {
                     if(kpa.a(1, var1, (byte)83)) {
                        if(kpa.a(2, var1, (byte)59)) {
                           if(kpa.a(3, var1, (byte)42)) {
                              pt.a[ru.b++] = var1;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   static final void a(byte var0, Object[] var1, Object[] var2) {
      ++b;
      if(fh.a(var1, false) != 255) {
         --((int[])((int[])var1[1]))[0];
         Class_i.a(false, var1);
      }

      var2[2] = dv.a(var1, (byte)-30);
      ((int[])((int[])var2[1]))[0] = de.a((int)0, var1);
      if(var0 != 15) {
         a(-8, (Object[])((Object[])g[5]));
      }

      ((byte[])((byte[])var2[4]))[0] = ipa.a(var1, (int)-81);
      Class_i.a(false, var1);
   }

   static final Object[] a(int var0, Object[] var1, int var2) {
      ++e;
      if(null != var1 && (15 == var1.length || 23 == var1.length && var1[4].equals(Integer.valueOf(0)))) {
         return null;
      } else {
         if(var2 <= 62) {
            var1[1] = ((Object[])((Object[])var1[0]))[1];
         }

         noa.a(19313, var1);
         ((int[])((int[])var1[1]))[0] = var0;
         var1[2] = new tha[var0];

         for(int var3 = 0; var3 < var0; ++var3) {
            tha var4 = ((tha[])((tha[])var1[2]))[var3] = new tha();
            var4.r = var4;
            var4.s = var4;
         }

         return var1;
      }
   }

   static final byte[] a(int var0, Object[] var1) {
      ++f_i;
      if(var1 == null) {
         if(var0 != 2) {
            return (byte[])((byte[])((Object[])((Object[])g[20]))[17]);
         } else {
            throw new IllegalStateException();
         }
      } else {
         byte[] var3 = new byte[((Buffer)var1[2]).capacity()];
         ((Buffer)var1[2]).position(0);
         ((ByteBuffer)var1[2]).get(var3);
         return var3;
      }
   }

}
