
final class wi {

   static int b;
   static int f;
   static int d = 0;
   static int e;
   static int g;
   static Object[] a = ed.a(-1, new Object[1], (byte)-120, 46);
   static int c;


   static final void a(Object[] var0, byte var1) {
      ++f;
      bba.a((Object[])((Object[])var0[0]), -19425);
      ona.a((Object[])((Object[])var0[3]), var1 + 34);
      var0[2] = new tha();
      ((int[])((int[])var0[1]))[0] = ((int[])((int[])var0[1]))[1];
      if(var1 != 65) {
         a((Object[])((Object[])a[1]), ((int[])((int[])a[3]))[9]);
      }

   }

   static final ka a(int var0, ta var1, int var2, Object[] var3, byte var4, Object[] var5, int var6) {
      if(var4 <= 63) {
         a(((int[])((int[])((Object[])((Object[])var5[3]))[0]))[2], (ta)null, 32, (Object[])null, (byte)111, (Object[])null, -63);
      }

      ++e;
      int var7 = 64 + ((int[])((int[])var5[1]))[16];
      int var8 = 850 + ((int[])((int[])var5[1]))[3];
      int var9 = var6;
      boolean var10 = ((boolean[])((boolean[])var5[0]))[15] || 2 == var0 && var2 > 3;
      if(var10) {
         var6 |= 16;
      }

      if(0 != var2) {
         var6 |= 13;
      } else {
         if(((int[])((int[])var5[1]))[6] != 128 || ((int[])((int[])var5[1]))[19] != 0) {
            var6 |= 1;
         }

         if(((int[])((int[])var5[1]))[31] != 128 || ((int[])((int[])var5[1]))[12] != 0) {
            var6 |= 4;
         }
      }

      if(((int[])((int[])var5[1]))[30] != 128 || ((int[])((int[])var5[1]))[9] != 0) {
         var6 |= 2;
      }

      if(null != var5[13]) {
         var6 |= 16384;
      }

      if(var5[18] != null) {
         var6 |= '\u8000';
      }

      if(((byte[])((byte[])var5[14]))[4] != 0) {
         var6 |= 524288;
      }

      if(null != var3 && var3.length == 14 && var3[13].equals(Integer.valueOf(2))) {
         rsa.c = (ii[])((ii[])ria.a[4]);
      }

      ka var11 = null;
      if(var5[2] == null) {
         return null;
      } else {
         int var12 = -1;

         for(int var13 = 0; ((byte[])((byte[])var5[2])).length > var13; ++var13) {
            if(var0 == ((byte[])((byte[])var5[2]))[var13]) {
               var12 = var13;
               break;
            }
         }

         if(var12 == -1) {
            return null;
         } else {
            int[] var29 = (int[])(var3 != null && null != var3[0]?var3[0]:((Object[])((Object[])var5[17]))[var12]);
            int var14 = var29.length;
            int var17;
            if(0 < var14) {
               long var15 = (long)var1.G;

               for(var17 = 0; var14 > var17; ++var17) {
                  var15 = (long)var29[var17] + 67783L * var15;
               }

               synchronized(((Object[])((Object[])var5[7]))[2]) {
                  var11 = (ka)dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var5[7]))[2]), var15);
               }

               if(var11 != null) {
                  if(~var7 != ~var11.BA()) {
                     var6 |= 4096;
                  }

                  if(var11.ga() != var8) {
                     var6 |= 8192;
                  }
               }

               if(null == var11 || var1.d(var11.va(), var6) != 0) {
                  var17 = var6 | 127007;
                  if(null != var11) {
                     var17 = var1.a(var17, var11.va());
                  }

                  ii var18 = null;
                  ii[] var19 = rsa.c;
                  synchronized(rsa.c) {
                     for(int var20 = 0; var14 > var20; ++var20) {
                        synchronized(((Object[])((Object[])var5[7]))[7]) {
                           var18 = ii.a((Object[])((Object[])((Object[])((Object[])var5[7]))[7]), '\uffff' & var29[var20], (int)0);
                        }

                        if(var18 == null) {
                           return null;
                        }

                        if(13 > var18.a) {
                           var18.a(2);
                        }

                        if(var14 > 1) {
                           rsa.c[var20] = var18;
                        }
                     }

                     if(1 < var14) {
                        var18 = new ii(rsa.c, var14);
                     }
                  }

                  var11 = var1.a(var18, var17, ((int[])((int[])((Object[])((Object[])var5[7]))[1]))[1], var7, var8);
                  synchronized(((Object[])((Object[])var5[7]))[2]) {
                     il.a(var15, var11, true, (Object[])((Object[])((Object[])((Object[])var5[7]))[2]));
                  }
               }
            }

            if(null == var11) {
               return null;
            } else {
               ka var30 = var11.a((byte)0, var6, true);
               if(var7 != var11.BA()) {
                  var30.W(var7);
               }

               if(var8 != var11.ga()) {
                  var30.C(var8);
               }

               if(var10) {
                  var30.S();
               }

               if(var0 == 4 && 3 < var2) {
                  var30.EA(2048);
                  var30.K(180, 0, -180);
               }

               var2 &= 3;
               if(1 == var2) {
                  var30.EA(4096);
               } else if(2 == var2) {
                  var30.EA(8192);
               } else if(3 == var2) {
                  var30.EA(12288);
               }

               short[] var16;
               if(null != var5[13]) {
                  if(var5 != null && var5.length == 8) {
                     ((Object[])((Object[])ria.a[37]))[2] = null;
                  }

                  if(var3 != null && var3[1] != null) {
                     var16 = (short[])((short[])var3[1]);
                  } else {
                     var16 = (short[])((short[])var5[8]);
                  }

                  for(var17 = 0; ((short[])((short[])var5[13])).length > var17; ++var17) {
                     if(null != var5[10] && ((byte[])((byte[])var5[10])).length > var17) {
                        var30.q(((short[])((short[])var5[13]))[var17], ona.a[255 & ((byte[])((byte[])var5[10]))[var17]]);
                     } else {
                        var30.q(((short[])((short[])var5[13]))[var17], var16[var17]);
                     }
                  }
               }

               if(var5[18] != null) {
                  if(var3 != null && null != var3[3]) {
                     var16 = (short[])((short[])var3[3]);
                  } else {
                     var16 = (short[])((short[])var5[4]);
                  }

                  for(var17 = 0; ~var17 > ~((short[])((short[])var5[18])).length; ++var17) {
                     var30.DA(((short[])((short[])var5[18]))[var17], var16[var17]);
                  }
               }

               if(-1 != ~((byte[])((byte[])var5[14]))[4]) {
                  var30.a(((byte[])((byte[])var5[14]))[3], ((byte[])((byte[])var5[14]))[0], ((byte[])((byte[])var5[14]))[1], ((byte[])((byte[])var5[14]))[4] & 255);
               }

               if(((int[])((int[])var5[1]))[6] != 128 || ((int[])((int[])var5[1]))[30] != 128 || 128 != ((int[])((int[])var5[1]))[31]) {
                  var30.v(((int[])((int[])var5[1]))[6], ((int[])((int[])var5[1]))[30], ((int[])((int[])var5[1]))[31]);
               }

               if(0 != ((int[])((int[])var5[1]))[19] || ((int[])((int[])var5[1]))[9] != 0 || ((int[])((int[])var5[1]))[12] != 0) {
                  var30.K(((int[])((int[])var5[1]))[19], ((int[])((int[])var5[1]))[9], ((int[])((int[])var5[1]))[12]);
               }

               var30.G(var9);
               return var30;
            }
         }
      }
   }

   static final void b(int var0, Object[] var1) {
      ((int[])((int[])var1[var0]))[2] = '\uaa4a';
      ++g;
      ((boolean[])((boolean[])var1[2]))[0] = true;
      ((int[])((int[])var1[1]))[1] = 443;
      ((boolean[])((boolean[])var1[2]))[1] = false;
   }

   static final void a(int var0, Object[] var1) {
      ++c;
      int var2 = 113 % ((45 - var0) / 53);
      if(var1[9] != null) {
         if(lq.b(true, var1) != null) {
            for(lm var3 = dda.a((Object[])((Object[])var1[5]), 2); null != var3; var3 = client.a((Object[])((Object[])var1[5]), -28280)) {
               int var4 = (int)var3.e;
               if(var4 >= 0 && ((int[])((int[])((Object[])((Object[])var1[0]))[1]))[1] > var4 && ((int[])((int[])((Object[])((Object[])var1[0]))[7]))[var4] != 0) {
                  if(((byte[])((byte[])var1[12]))[var4] == 0) {
                     dq.a(4, 1, var4, var1);
                  }

                  if(-1 == ((byte[])((byte[])var1[12]))[var4]) {
                     dq.a(4, 2, var4, var1);
                  }

                  if(-2 == ~((byte[])((byte[])var1[12]))[var4]) {
                     var3.a((byte)109);
                  }
               } else {
                  var3.a((byte)18);
               }
            }

            if(null != var1 && (1 == var1.length || -2 == ~var1.length && var1[0].equals(Boolean.valueOf(false)))) {
               pna.j = null;
            }

         }
      }
   }

   static final Object[] a(Object[] var0, int var1) {
      ++b;
      if(var1 != 5) {
         ((long[])((long[])((Object[])((Object[])var0[1]))[14]))[9] = -71L;
      }

      if(var0[45] == null) {
         var0[45] = new byte[4];
      }

      if(var0[1] == null) {
         var0[1] = new int[73];
      }

      if(null == var0[5]) {
         var0[5] = new boolean[19];
      }

      ((int[])((int[])var0[1]))[55] = 0;
      ((int[])((int[])var0[1]))[1] = 0;
      ((int[])((int[])var0[1]))[47] = -1;
      ((int[])((int[])var0[1]))[39] = -1;
      ((boolean[])((boolean[])var0[5]))[15] = false;
      ((int[])((int[])var0[1]))[11] = 0;
      ((byte[])((byte[])var0[45]))[3] = 0;
      ((byte[])((byte[])var0[45]))[2] = 0;
      ((int[])((int[])var0[1]))[48] = -1;
      ((int[])((int[])var0[1]))[34] = -1;
      ((byte[])((byte[])var0[45]))[0] = 0;
      ((int[])((int[])var0[1]))[57] = -1;
      ((boolean[])((boolean[])var0[5]))[18] = false;
      ((int[])((int[])var0[1]))[19] = 0;
      ((int[])((int[])var0[1]))[20] = 0;
      ((int[])((int[])var0[1]))[7] = 0;
      ((boolean[])((boolean[])var0[5]))[7] = false;
      ((int[])((int[])var0[1]))[15] = 0;
      ((boolean[])((boolean[])var0[5]))[13] = false;
      ((int[])((int[])var0[1]))[63] = -1;
      ((int[])((int[])var0[1]))[3] = -1;
      ((boolean[])((boolean[])var0[5]))[9] = false;
      ((int[])((int[])var0[1]))[30] = 0;
      ((int[])((int[])var0[1]))[2] = 0;
      ((int[])((int[])var0[1]))[27] = 0;
      ((int[])((int[])var0[1]))[56] = 0;
      ((int[])((int[])var0[1]))[0] = 0;
      ((int[])((int[])var0[1]))[43] = 0;
      ((int[])((int[])var0[1]))[23] = 1;
      ((int[])((int[])var0[1]))[53] = 0;
      ((int[])((int[])var0[1]))[70] = 0;
      ((int[])((int[])var0[1]))[67] = 1;
      ((int[])((int[])var0[1]))[31] = 0;
      ((int[])((int[])var0[1]))[38] = 1;
      ((byte[])((byte[])var0[45]))[1] = 0;
      ((int[])((int[])var0[1]))[41] = 0;
      if(null != var0 && 12 == var0.length) {
         jl.b = (Object[])((Object[])((Object[])((Object[])fr.g[6]))[7]);
      }

      ((boolean[])((boolean[])var0[5]))[0] = false;
      ((int[])((int[])var0[1]))[62] = 0;
      ((int[])((int[])var0[1]))[24] = -1;
      ((int[])((int[])var0[1]))[16] = -1;
      ((int[])((int[])var0[1]))[42] = -1;
      ((int[])((int[])var0[1]))[52] = 0;
      ((int[])((int[])var0[1]))[21] = 0;
      ((int[])((int[])var0[1]))[72] = 0;
      var0[9] = sp.a;
      ((boolean[])((boolean[])var0[5]))[8] = false;
      ((boolean[])((boolean[])var0[5]))[4] = false;
      ((int[])((int[])var0[1]))[25] = 0;
      ((boolean[])((boolean[])var0[5]))[6] = false;
      ((int[])((int[])var0[1]))[8] = 0;
      ((int[])((int[])var0[1]))[68] = 0;
      ((int[])((int[])var0[1]))[32] = 0;
      ((int[])((int[])var0[1]))[28] = 0;
      ((int[])((int[])var0[1]))[51] = -1;
      ((int[])((int[])var0[1]))[5] = 0;
      ((int[])((int[])var0[1]))[45] = 0;
      ((boolean[])((boolean[])var0[5]))[5] = false;
      ((int[])((int[])var0[1]))[17] = 0;
      ((int[])((int[])var0[1]))[12] = -1;
      ((int[])((int[])var0[1]))[54] = 0;
      ((boolean[])((boolean[])var0[5]))[10] = false;
      ((int[])((int[])var0[1]))[14] = 0;
      ((int[])((int[])var0[1]))[69] = 0;
      ((int[])((int[])var0[1]))[46] = -1;
      ((boolean[])((boolean[])var0[5]))[3] = true;
      ((int[])((int[])var0[1]))[64] = 0;
      ((boolean[])((boolean[])var0[5]))[2] = false;
      ((boolean[])((boolean[])var0[5]))[16] = true;
      var0[15] = "";
      ((int[])((int[])var0[1]))[36] = 0;
      ((int[])((int[])var0[1]))[35] = 0;
      ((int[])((int[])var0[1]))[65] = 0;
      ((int[])((int[])var0[1]))[13] = -1;
      var0[58] = "";
      ((int[])((int[])var0[1]))[49] = -1;
      var0[60] = "";
      ((int[])((int[])var0[1]))[58] = 0;
      ((int[])((int[])var0[1]))[6] = 0;
      ((boolean[])((boolean[])var0[5]))[17] = false;
      ((int[])((int[])var0[1]))[40] = dt.e;
      ((int[])((int[])var0[1]))[59] = 0;
      var0[49] = null;
      ((int[])((int[])var0[1]))[4] = -1;
      ((int[])((int[])var0[1]))[66] = 0;
      ((int[])((int[])var0[1]))[10] = 100;
      ((int[])((int[])var0[1]))[29] = -1;
      ((int[])((int[])var0[1]))[37] = 0;
      ((int[])((int[])var0[1]))[71] = 2;
      ((boolean[])((boolean[])var0[5]))[11] = false;
      ((int[])((int[])var0[1]))[44] = 1;
      return var0;
   }

}
