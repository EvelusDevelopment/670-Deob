import jaclib.memory.Stream;
import jagdx.IDirect3DDevice;

final class tua {

   static int b;
   static int c;
   static int g;
   static int d;
   static int h;
   static Object[] e = ho.a(9, 87, new Object[1], true);
   static int a;
   static int f;


   static final void a(Object[] var0, boolean var1, byte var2, Object[][] var3) {
      ++c;
      int var5 = -1 != ~((int[])((int[])var0[1]))[56]?((int[])((int[])var0[1]))[56]:((int[])((int[])var0[1]))[70];
      int var6 = 0 != ((int[])((int[])var0[1]))[55]?((int[])((int[])var0[1]))[55]:((int[])((int[])var0[1]))[2];
      hga.a(var6, var5, var1, var3, 0, ((int[])((int[])var0[1]))[3]);
      int var8 = 9 % ((var2 - 45) / 62);
      if(var0[7] != null) {
         hga.a(var6, var5, var1, (Object[][])((Object[][])var0[7]), 0, ((int[])((int[])var0[1]))[3]);
      }

      oh var4;
      Object[] var7 = (var4 = (oh)pm.a((long)((int[])((int[])var0[1]))[3], lfa.c, false)) == null?null:var4.p;
      if(null != var7) {
         kt.a(var1, var6, (byte)-22, ((int[])((int[])var7[1]))[1], var5);
      }

      if(var0 == mi.g) {
         int var9 = ofa.b;
         if(var7 != null && 23 == var7.length && var7[15].equals(Integer.valueOf(1))) {
            vma.a(true, 82);
         }

         int[] var10 = ot.a;

         int var11;
         for(var11 = 0; var9 > var11; ++var11) {
            Object[] var12 = vo.E[var10[var11]];
            if(null != var12) {
               nr.a(var6, var1, var5, -1, var12);
            }
         }

         for(var11 = 0; rba.h > var11; ++var11) {
            int var14 = gr.c[var11];
            hna var13 = (hna)pm.a((long)var14, hf.g, false);
            if(var13 != null) {
               nr.a(var6, var1, var5, -1, var13.k);
            }
         }
      }

   }

   static final void b(byte var0, Object[] var1) {
      rsa.a(-12423, (Object[])((Object[])var1[9]));
      ++f;
      mn.a((Object[])((Object[])var1[8]), (Object[])((Object[])var1[9]), (byte)74, 0, (Object[])((Object[])var1[18]));
      bpa.a((Object[])((Object[])var1[4]), (byte)75, (Object[])((Object[])var1[0]));
      vla.a((Object[])((Object[])var1[20]), true, (Object[])((Object[])var1[4]), (Object[])((Object[])var1[9]));
      kaa.a((Object[])((Object[])var1[6]), (Object[])((Object[])var1[9]), 77, (Object[])((Object[])var1[11]));
      fta.a((Object[])((Object[])var1[9]), ((float[])((float[])((Object[])((Object[])var1[16]))[0]))[0], (Object[])((Object[])var1[13]), ((float[])((float[])((Object[])((Object[])var1[16]))[0]))[1], ((float[])((float[])((Object[])((Object[])var1[16]))[0]))[2], (byte)21, ((float[])((float[])((Object[])((Object[])var1[16]))[0]))[3]);
      fta.a((Object[])((Object[])var1[9]), ((float[])((float[])((Object[])((Object[])var1[14]))[0]))[0], (Object[])((Object[])var1[19]), ((float[])((float[])((Object[])((Object[])var1[14]))[0]))[1], ((float[])((float[])((Object[])((Object[])var1[14]))[0]))[2], (byte)21, ((float[])((float[])((Object[])((Object[])var1[14]))[0]))[3]);
      if(var1 == null || var1.length != 25) {
         if(var0 != 88) {
            a(13, (Object[])null, 78);
         }

         hca.a(0, (Object[])((Object[])var1[2]), (Object[])((Object[])var1[0]), 0);
         ws.a(102, (Object[])((Object[])var1[3]), (Object[])((Object[])var1[0]));
         woa.a(2, dw.a, (byte)89, (Object[])((Object[])var1[0]), ((int[])((int[])var1[1]))[0]);
      }
   }

   static final void a(Object[] var0, int var1) {
      var0[0] = new float[16];
      ++d;
      if(var1 != 14) {
         e = (Object[])((Object[])var0[18]);
      }

   }

   static final void putFloat(Object[] var0, byte var1, float var2) {
      if(var1 < -125) {
         ++b;
         int var3 = Stream.floatToRawIntBits(var2);
         byte[] var10000 = (byte[])((byte[])var0[2]);
         int[] var10001 = (int[])((int[])var0[1]);
         int var10004 = ((int[])((int[])var0[1]))[0];
         var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
         var10000[var10004] = (byte)(var3 >> 24);
         var10000 = (byte[])((byte[])var0[2]);
         var10001 = (int[])((int[])var0[1]);
         var10004 = ((int[])((int[])var0[1]))[0];
         var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
         var10000[var10004] = (byte)(var3 >> 16);
         var10000 = (byte[])((byte[])var0[2]);
         var10001 = (int[])((int[])var0[1]);
         var10004 = ((int[])((int[])var0[1]))[0];
         var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
         var10000[var10004] = (byte)(var3 >> 8);
         var10000 = (byte[])((byte[])var0[2]);
         var10001 = (int[])((int[])var0[1]);
         var10004 = ((int[])((int[])var0[1]))[0];
         var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
         var10000[var10004] = (byte)var3;
      }
   }

   static final Object[] a(int var0, Object[] var1, int var2) {
      ++a;
      Object[] var3;
      synchronized(var1[2]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var1[2]), (long)var2));
      }

      if(null != var3) {
         return var3;
      } else {
         byte[] var4;
         synchronized(var1[var0]) {
            var4 = qn.a(46, var2, (Object[])((Object[])var1[3]), var0 ^ -56);
         }

         var3 = je.a(new Object[3], true);
         var3[2] = var1;
         if(var4 != null) {
            Object[] var5 = jta.a((byte)-96, var4, new Object[3]);

            while(true) {
               int var6 = fh.a(var5, false);
               if(var6 == 0) {
                  if(null != var5 && -8 == ~var5.length) {
                     vk.a(false, (Object[])null);
                  }
                  break;
               }

               if(1 == var6) {
                  ((int[])((int[])var3[1]))[11] = fma.c(-17126, var5);
               } else if(var6 != 2) {
                  if(3 != var6) {
                     if(var6 == 4) {
                        ((int[])((int[])var3[1]))[2] = fma.c(-17126, var5);
                     } else if(5 != var6) {
                        if(6 != var6) {
                           if(var6 != 7) {
                              if(8 != var6) {
                                 if(var6 != 9) {
                                    if(var6 == 10) {
                                       ((int[])((int[])var3[1]))[0] = jia.c(var0 - 8169, var5);
                                    } else if(11 != var6) {
                                       if(var6 != 12) {
                                          if(13 == var6) {
                                             ((int[])((int[])var3[1]))[5] = jia.c(-8166, var5);
                                          } else if(14 == var6) {
                                             ((int[])((int[])var3[1]))[3] = de.a((int)0, var5);
                                          }
                                       } else {
                                          ((int[])((int[])var3[1]))[8] = fh.a(var5, false);
                                       }
                                    } else {
                                       ((int[])((int[])var3[1]))[3] = 0;
                                    }
                                 } else {
                                    ((int[])((int[])var3[1]))[10] = de.a((int)0, var5);
                                 }
                              } else {
                                 var3[0] = wta.a((byte)116, var5);
                              }
                           } else {
                              ((int[])((int[])var3[1]))[9] = jia.c(-8166, var5);
                           }
                        } else {
                           ((int[])((int[])var3[1]))[4] = fma.c(var0 - 17129, var5);
                        }
                     } else {
                        ((int[])((int[])var3[1]))[7] = fma.c(-17126, var5);
                     }
                  } else {
                     ((int[])((int[])var3[1]))[6] = fma.c(-17126, var5);
                  }
               } else {
                  ((int[])((int[])var3[1]))[1] = td.a(var5, var0 + 91);
               }
            }
         }

         synchronized(var1[2]) {
            il.a((long)var2, var3, true, (Object[])((Object[])var1[2]));
            return var3;
         }
      }
   }

   static final void a(byte var0, Object[] var1) {
      if(var0 != 8) {
         a(new Object[4], true, (byte)0, (Object[][])((Object[][])null));
      }

      ++g;
      IDirect3DDevice.a(((long[])((long[])var1[50]))[5], 27, ((boolean[])((boolean[])var1[63]))[8]);
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 != 57) {
         a((byte)15, (Object[])null);
      }

      ++h;
   }

}
