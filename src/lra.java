import java.io.IOException;

final class lra extends tha {

   static int u;
   static int v;
   Object[] x;
   static int w;
   static int t;


   static final Object[] a(Object[] var0, int var1, int var2, Object[] var3) {
      fq.a(23376, var0);
      ++v;
      var0[0] = var3;
      ((int[])((int[])var0[1]))[0] = var2;
      return var1 != 16830?(Object[])null:var0;
   }

   static final int a(Object[] var0, int var1) {
      if(var1 <= 20) {
         a((Object[])null, (Object[][])((Object[][])null));
      }

      ++t;
      return ((int[])((int[])var0[12]))[42];
   }

   static final Object[] a(byte var0, Object[] var1, Object[] var2, Object[] var3, Object[] var4) {
      ++w;
      if(null == var4[1]) {
         var4[1] = new int[2];
      }

      vda.a(var2, var1, var4, 24843, var3);
      return var0 <= 79?(Object[])null:var4;
   }

   static final void a(Object[] var0, Object[][] var1) {
      int var2;
      int var3;
      Object[] var4;
      if(ug.f) {
         if(null != var0 && (var0.length == 17 || var0.length == 20 && ((int[])((int[])var0[12])).length == 7 || -25 >= ~var0.length || var0.length == 16 && 7 == ((boolean[])((boolean[])var0[8])).length)) {
            var4 = var0;
            Object[][] var5 = var1;
            int var6 = 0;

            int var7;
            int var8;
            int var13;
            label231:
            for(var7 = ((short[])((short[])var0[13]))[1]; ((short[])((short[])var4[13]))[0] >= var7; ++var7) {
               var8 = ((short[])((short[])var4[13]))[3];

               while(~var8 >= ~((short[])((short[])var4[13]))[2]) {
                  long var9 = nba.e[((byte[])((byte[])var4[10]))[0]][var7][var8];
                  long var11 = 0L;

                  label227:
                  while(true) {
                     if(var11 <= 48L) {
                        var13 = (int)(65535L & var9 >>> (int)var11);
                        if(var13 > 0) {
                           Object[] var14 = qd.c[-1 + var13];
                           if(var14 != null && 20 == var14.length) {
                              qf.a((Object[])null, false);
                           }

                           int var15 = 0;

                           while(true) {
                              if(var15 < var6) {
                                 if(var14[3] != var5[var15]) {
                                    ++var15;
                                    continue;
                                 }

                                 var11 += 16L;
                                 continue label227;
                              }

                              var5[var6++] = (Object[])((Object[])var14[3]);
                              if(4 == var6) {
                                 break label231;
                              }

                              var11 += 16L;
                              continue label227;
                           }
                        }
                     }

                     ++var8;
                     break;
                  }
               }

               if(var4 != null && var4.length == 18) {
                  pha.d = -124;
               }
            }

            for(var7 = var6; var7 < 4; ++var7) {
               var5[var7] = null;
            }

            if(var0 != null && (var0.length == 6 && var0[1].equals(Boolean.valueOf(false)) || var0.length == 4)) {
               cu.a(((int[])((int[])gu.h[1]))[6], ((int[])((int[])((Object[])((Object[])gu.b[4]))[1]))[0], 118);
            }

            if(((byte[])((byte[])var4[10]))[2] != 0) {
               int var26 = ((short[])((short[])var4[13]))[1] + -bd.h;
               int var12 = -oaa.a + ((short[])((short[])var4[13]))[3];
               short var10;
               int var25;
               short var24;
               if(1 != ((byte[])((byte[])var4[10]))[2]) {
                  if(-var26 >= var12) {
                     var10 = ((short[])((short[])var4[13]))[3];
                     var8 = ((short[])((short[])var4[13]))[3] + 1;
                     var24 = ((short[])((short[])var4[13]))[1];
                     var25 = ((short[])((short[])var4[13]))[1] + 1;
                  } else {
                     var25 = ((short[])((short[])var4[13]))[1] - 1;
                     var24 = ((short[])((short[])var4[13]))[1];
                     var10 = ((short[])((short[])var4[13]))[3];
                     var8 = -1 + ((short[])((short[])var4[13]))[3];
                  }
               } else if(var12 <= var26) {
                  var10 = ((short[])((short[])var4[13]))[3];
                  var8 = 1 + ((short[])((short[])var4[13]))[3];
                  var24 = ((short[])((short[])var4[13]))[1];
                  var25 = ((short[])((short[])var4[13]))[1] - 1;
               } else {
                  var25 = ((short[])((short[])var4[13]))[1] + 1;
                  var24 = ((short[])((short[])var4[13]))[1];
                  var8 = -1 + ((short[])((short[])var4[13]))[3];
                  var10 = ((short[])((short[])var4[13]))[3];
               }

               label190:
               for(var13 = 0; var13 < var6; ++var13) {
                  long var27 = nba.e[((byte[])((byte[])var4[10]))[0]][var24][var8];

                  while(true) {
                     Object[] var28;
                     if(~var27 != -1L) {
                        var28 = qd.c[(int)(-1L + (var27 & 65535L))];
                        var27 >>>= 16;
                        if(var28[3] != var5[var13]) {
                           continue;
                        }
                        break;
                     }

                     var27 = nba.e[((byte[])((byte[])var4[10]))[0]][var25][var10];

                     while(true) {
                        if(var27 != 0L) {
                           var28 = qd.c[(int)(-1L + (var27 & 65535L))];
                           var27 >>>= 16;
                           if(var5[var13] != var28[3]) {
                              continue;
                           }
                           continue label190;
                        }

                        for(int var16 = var13; -1 + var6 > var16; ++var16) {
                           var5[var16] = var5[var16 + 1];
                        }

                        if(null != var4 && var4.length == 11) {
                           es.e = ((boolean[])((boolean[])gu.h[1]))[6];
                        }

                        --var6;
                        continue label190;
                     }
                  }
               }
            }

            var2 = var6;
         } else if(null != var0 && var0.length == 20 && (-8 == ~((boolean[])((boolean[])var0[8])).length || 8 == ((boolean[])((boolean[])var0[8])).length)) {
            var2 = hqa.a(var0, var1, (byte)-108);
         } else if(null != var0 && (var0.length == 18 || var0.length == 20 && -4 == ~((int[])((int[])var0[12])).length && 6 == ((boolean[])((boolean[])var0[8])).length)) {
            var4 = (Object[])((Object[])woa.a(5, var0)[1]);
            var3 = ju.a(var0, (int)((float[])((float[])var4[1]))[2] >> qqa.e, var1, (int)((float[])((float[])var4[1]))[1] >> qqa.e, true);
            var2 = var3;
         } else if(null != var0 && var0.length == 16 && 2 == ((byte[])((byte[])var0[10])).length) {
            var4 = (Object[])((Object[])woa.a(5, var0)[1]);
            var3 = ju.a(var0, (int)((float[])((float[])var4[1]))[2] >> qqa.e, var1, (int)((float[])((float[])var4[1]))[1] >> qqa.e, true);
            var2 = var3;
         } else {
            if(null == var0 || var0.length < 21 || var0.length > 23) {
               throw new IllegalStateException();
            }

            var2 = psa.a(var0, var1, 0);
         }

         mpa.b.a(var2, var1);
      }

      if(wd.a == jp.o) {
         boolean var20 = false;
         boolean var19 = false;
         var4 = (Object[])((Object[])woa.a(5, var0)[1]);
         if(var0 != null && (var0.length >= 24 || var0.length == 20 && ((int[])((int[])var0[12])).length == 7 || var0.length == 16 && ((boolean[])((boolean[])var0[8])).length == 7 || var0.length == 17)) {
            var2 = ((short[])((short[])var0[13]))[1];
            var3 = ((short[])((short[])var0[13]))[3];
         } else {
            var2 = (int)((float[])((float[])var4[1]))[2] >> qqa.e;
            var3 = (int)((float[])((float[])var4[1]))[1] >> qqa.e;
         }

         Object[] var23 = new Object[1];
         if(var23[0] == null) {
            var23[0] = new int[7];
         }

         ((int[])((int[])var23[0]))[1] = jp.a(var2, var3);
         ((int[])((int[])var23[0]))[5] = nn.a(var2, var3);
         ((int[])((int[])var23[0]))[0] = jba.a(var2, var3);
         ((int[])((int[])var23[0]))[6] = kta.a(var2, var3);
         ((int[])((int[])var23[0]))[4] = Class_d.a(var2, var3);
         ((int[])((int[])var23[0]))[2] = rta.a(var2, var3);
         mpa.b.a(bf.f_l[0].a(1, (int)((float[])((float[])var4[1]))[2], (int)((float[])((float[])var4[1]))[1]), var23);
      }

      Object[] var21 = ri.a(12, mpa.b, var0);
      if(var21 != null) {
         if(((boolean[])((boolean[])var21[3]))[0]) {
            var21[2] = var0;
            if(et.a) {
               Object[] var22 = gu.b;
               synchronized(gu.b) {
                  jj.a(var21, gu.b, -9835);
               }
            } else {
               jj.a(var21, gu.b, -9835);
            }
         } else {
            ie.a(var21, 23247);
         }
      }

   }

   static final void a(boolean var0, byte var1) {
      afa.a((byte)-54);
      ++u;
      if(var1 == -70) {
         if(kf.a(26, ipa.d)) {
            Object[][] var2 = lba.d;

            for(int var3 = 0; ~var3 > ~var2.length; ++var3) {
               Object[] var4 = var2[var3];
               ++((int[])((int[])var4[1]))[6];
               if(((int[])((int[])var4[1]))[6] < 50 && !var0) {
                  return;
               }

               ((int[])((int[])var4[1]))[6] = 0;
               if(!((boolean[])((boolean[])var4[11]))[0] && var4[8] != null) {
                  ++dn.b;
                  Object[] var5 = ona.a((byte)111, (Object[])((Object[])var4[7]), iba.f);
                  lj.a(var5, 6, var4);

                  try {
                     dv.a((byte)125, var4);
                  } catch (IOException var7) {
                     ((boolean[])((boolean[])var4[11]))[0] = true;
                  }
               }
            }

            afa.a((byte)39);
         }
      }
   }

   lra(Object[] var1) {
      this.x = var1;
   }

}
