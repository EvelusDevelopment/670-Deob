
final class ita {

   static int g = -1;
   static int f_i;
   static int a;
   static int e;
   static int d;
   static int c;
   static Object[] f = nb.a((byte)97, 32, new Object[5]);
   static int b;
   static int h;


   static final Object[] a(byte var0, Object[] var1) {
      ++f_i;
      md.a(var1, true);
      ((int[])((int[])var1[1]))[0] = -1;
      ((int[])((int[])var1[1]))[31] = 0;
      ((int[])((int[])var1[1]))[12] = -1;
      ((int[])((int[])var1[1]))[13] = -1;
      ((int[])((int[])var1[1]))[23] = -1;
      ((int[])((int[])var1[1]))[4] = -1;
      ((boolean[])((boolean[])var1[8]))[3] = true;
      ((boolean[])((boolean[])var1[8]))[7] = true;
      var1[0] = "null";
      ((int[])((int[])var1[1]))[18] = 1;
      ((byte[])((byte[])var1[9]))[1] = 0;
      ((boolean[])((boolean[])var1[8]))[5] = false;
      ((boolean[])((boolean[])var1[8]))[1] = true;
      ((int[])((int[])var1[1]))[11] = -1;
      ((boolean[])((boolean[])var1[8]))[2] = false;
      ((int[])((int[])var1[1]))[24] = -1;
      ((short[])((short[])var1[14]))[0] = 0;
      ((int[])((int[])var1[1]))[3] = -1;
      ((int[])((int[])var1[1]))[14] = 128;
      ((int[])((int[])var1[1]))[19] = 0;
      ((int[])((int[])var1[1]))[22] = -1;
      ((boolean[])((boolean[])var1[8]))[6] = false;
      ((int[])((int[])var1[1]))[32] = 128;
      ((int[])((int[])var1[1]))[9] = -1;
      ((int[])((int[])var1[1]))[29] = -1;
      ((byte[])((byte[])var1[9]))[8] = -96;
      ((short[])((short[])var1[14]))[1] = 0;
      ((int[])((int[])var1[1]))[30] = 32;
      ((boolean[])((boolean[])var1[8]))[4] = true;
      if(null != var1 && 4 == var1.length) {
         a((Object[])null, var0 + 77, (int[])null, (Object[])null, 19, (Object[])null, (Object[][])null, (Object[])null, -82, (Object[])null, (ta)null, (Object[])null);
      }

      ((int[])((int[])var1[1]))[10] = -1;
      ((int[])((int[])var1[1]))[27] = -1;
      ((int[])((int[])var1[1]))[25] = -1;
      ((int[])((int[])var1[1]))[5] = 0;
      ((int[])((int[])var1[1]))[26] = -1;
      ((int[])((int[])var1[1]))[21] = 0;
      ((int[])((int[])var1[1]))[20] = -1;
      ((int[])((int[])var1[1]))[16] = 256;
      ((byte[])((byte[])var1[9]))[6] = -16;
      ((int[])((int[])var1[1]))[28] = 0;
      ((int[])((int[])var1[1]))[6] = -1;
      ((int[])((int[])var1[1]))[1] = 255;
      ((byte[])((byte[])var1[9]))[0] = -1;
      ((byte[])((byte[])var1[9]))[3] = 0;
      ((int[])((int[])var1[1]))[15] = -1;
      ((int[])((int[])var1[1]))[2] = 256;
      ((int[])((int[])var1[1]))[7] = -1;
      ((int[])((int[])var1[1]))[8] = -1;
      ((byte[])((byte[])var1[9]))[7] = 4;
      if(var0 != -77) {
         f = (Object[])null;
      }

      return var1;
   }

   static final hl a(Object[] var0, byte var1) {
      int var2 = -64 % ((-58 - var1) / 37);
      ++c;
      return new hl(var0);
   }

   static final int b(Object[] var0, byte var1) {
      if(var1 != 39) {
         b((Object[])null, (byte)-103);
      }

      ++e;
      return 2;
   }

   static final int a(boolean var0, Object[] var1) {
      ++h;
      if(var0) {
         g = ((int[])((int[])f[3]))[3];
      }

      return null != var1[3]?100 * ((int[])((int[])((Object[])((Object[])var1[3]))[1]))[0] / (-((byte[])((byte[])var1[4]))[0] + ((byte[])((byte[])((Object[])((Object[])var1[3]))[2])).length):0;
   }

   static final ka a(Object[] var0, int var1, int[] var2, Object[] var3, int var4, Object[] var5, Object[][] var6, Object[] var7, int var8, Object[] var9, ta var10, Object[] var11) {
      ++d;
      if(null != var0[11]) {
         Object[] var36 = ria.a(var7, var0, -116);
         return var36 != null?a(var36, 0, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11):null;
      } else {
         int var12 = var8;
         if(((int[])((int[])var0[1]))[32] != 128) {
            var12 = var8 | 2;
         }

         if(((int[])((int[])var0[1]))[14] != 128) {
            var12 |= 5;
         }

         boolean var13 = false;
         int var14 = null == var6?0:var6.length;
         if(var0 != null && var0.length == 2) {
            qga.n = null;
         }

         for(int var15 = var1; var15 < var14; ++var15) {
            if(var6[var15] != null) {
               var13 = true;
               var12 |= mo.a(true, var6[var15]);
            }
         }

         if(var5 != null) {
            var13 = true;
            var12 |= mo.a(true, var5);
         }

         if(var11 != null) {
            var12 |= mo.a(true, var11);
            var13 = true;
         }

         long var37 = (long)(((int[])((int[])var0[1]))[17] | var10.G << 16);
         if(null != var3) {
            var37 |= ((long[])((long[])var3[0]))[0] << 24;
         }

         ka var17;
         synchronized(((Object[])((Object[])var0[12]))[4]) {
            var17 = (ka)dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var0[12]))[4]), var37);
         }

         Object[] var18 = null;
         if(((int[])((int[])var0[1]))[4] != -1) {
            var18 = Class_h.a(var9, ((int[])((int[])var0[1]))[4], var1 + 110);
         }

         int var23;
         if(null == var17 || var12 != (var12 & var17.va())) {
            if(null != var17) {
               var12 |= var17.va();
            }

            int var19 = var12;
            if(null != var0[4]) {
               var19 = var12 | 16384;
            }

            if(null != var0[6]) {
               var19 |= '\u8000';
            }

            if(((byte[])((byte[])var0[9]))[1] != 0) {
               var19 |= 524288;
            }

            int[] var20 = (int[])(var3 != null && var3[1] != null?var3[1]:var0[16]);
            boolean var21 = false;
            synchronized(((Object[])((Object[])var0[12]))[5]) {
               for(var23 = 0; var20.length > var23; ++var23) {
                  if(~var20[var23] != 0 && !Class_ss.a(0, 5, (Object[])((Object[])((Object[])((Object[])var0[12]))[5]), var20[var23])) {
                     var21 = true;
                  }
               }

               if(null != var5 && var5.length == 17 && var5[3].equals(Boolean.valueOf(false))) {
                  qga.n = null;
               }
            }

            if(var21) {
               return null;
            }

            ii[] var44 = new ii[var20.length];

            int var24;
            for(var24 = 0; var20.length > var24; ++var24) {
               if(0 != ~var20[var24]) {
                  synchronized(((Object[])((Object[])var0[12]))[5]) {
                     var44[var24] = ii.a((Object[])((Object[])((Object[])((Object[])var0[12]))[5]), var20[var24], (int)0);
                  }

                  if(null != var44[var24]) {
                     if(13 > var44[var24].a) {
                        var44[var24].a(2);
                     }

                     if(null != var0[13] && null != ((int[][])((int[][])var0[13]))[var24]) {
                        var44[var24].b(((int[][])((int[][])var0[13]))[var24][0], ((int[][])((int[][])var0[13]))[var24][1], ((int[][])((int[][])var0[13]))[var24][2]);
                     }
                  }
               }
            }

            int var25;
            if(null != var18 && null != var18[8]) {
               if(null != var18 && var18.length == 1) {
                  a((Object[])null, 0, (int[])null, (Object[])null, -72, (Object[])null, (Object[][])null, new Object[0][], -36, (Object[])null, (ta)null, (Object[])null);
               }

               for(var24 = 0; var24 < ((Object[])((Object[])var18[8])).length; ++var24) {
                  if(var44.length > var24 && null != var44[var24]) {
                     if(null != var11 && 12 == var11.length && var11[8].equals(Integer.valueOf(2)) && var11[8].equals(Boolean.valueOf(false))) {
                        a((Object[])null, 0, (int[])null, (Object[])null, 110, (Object[])null, (Object[][])null, new Object[0][], 99, new Object[6][], (ta)null, (Object[])null);
                     }

                     var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     int var30 = 0;
                     if(null != ((int[][])((int[][])var18[8]))[var24]) {
                        var30 = ((int[][])((int[][])var18[8]))[var24][5] << 3;
                        var25 = ((int[][])((int[][])var18[8]))[var24][0];
                        var26 = ((int[][])((int[][])var18[8]))[var24][1];
                        var28 = ((int[][])((int[][])var18[8]))[var24][3] << 3;
                        var29 = ((int[][])((int[][])var18[8]))[var24][4] << 3;
                        var27 = ((int[][])((int[][])var18[8]))[var24][2];
                     }

                     if(var28 != 0 || 0 != var29 || var30 != 0) {
                        var44[var24].a(var28, var29, var30);
                     }

                     if(0 != var25 || 0 != var26 || 0 != var27) {
                        var44[var24].b(var25, var26, var27);
                     }
                  }
               }
            }

            ii var22;
            if(-2 == ~var44.length) {
               var22 = var44[0];
            } else {
               var22 = new ii(var44, var44.length);
            }

            var17 = var10.a(var22, var19, ((int[])((int[])((Object[])((Object[])var0[12]))[1]))[0], ((int[])((int[])var0[1]))[19] + 64, 850 + ((int[])((int[])var0[1]))[31]);
            short[] var43;
            if(var0[4] != null) {
               if(var5 != null && var5.length == 2) {
                  qga.n = null;
               }

               if(null != var3 && var3[3] != null) {
                  var43 = (short[])((short[])var3[3]);
               } else {
                  var43 = (short[])((short[])var0[3]);
               }

               for(var25 = 0; var25 < ((short[])((short[])var0[4])).length; ++var25) {
                  if(null != var0[15] && var25 < ((byte[])((byte[])var0[15])).length) {
                     var17.q(((short[])((short[])var0[4]))[var25], qga.n[((byte[])((byte[])var0[15]))[var25] & 255]);
                  } else {
                     var17.q(((short[])((short[])var0[4]))[var25], var43[var25]);
                  }
               }
            }

            if(var0[6] != null) {
               if(null != var3 && var3[2] != null) {
                  var43 = (short[])((short[])var3[2]);
               } else {
                  var43 = (short[])((short[])var0[10]);
               }

               if(null != var0 && var0.length == 4) {
                  a((Object[])null, 0, (int[])null, (Object[])null, -82, (Object[])null, (Object[][])null, (Object[])null, 88, (Object[])null, (ta)null, (Object[])null);
               }

               for(var25 = 0; ((short[])((short[])var0[6])).length > var25; ++var25) {
                  var17.DA(((short[])((short[])var0[6]))[var25], var43[var25]);
               }
            }

            if(null != var9 && (var9.length == 4 || 1 == var9.length)) {
               ria.a((Object[])null, (Object[])null, var1 - 18);
            }

            if(-1 != ~((byte[])((byte[])var0[9]))[1]) {
               var17.a(((byte[])((byte[])var0[9]))[5], ((byte[])((byte[])var0[9]))[2], ((byte[])((byte[])var0[9]))[4], ((byte[])((byte[])var0[9]))[1] & 255);
            }

            var17.G(var12);
            synchronized(((Object[])((Object[])var0[12]))[4]) {
               il.a(var37, var17, true, (Object[])((Object[])((Object[])((Object[])var0[12]))[4]));
            }
         }

         ka var41 = var17.a((byte)4, var12, true);
         boolean var38 = false;
         if(null != var2) {
            for(int var42 = 0; 12 > var42; ++var42) {
               if(0 != ~var2[var42]) {
                  var38 = true;
               }
            }

            if(var0 != null && -10 == ~var0.length) {
               qga.n = null;
            }
         }

         if(!var13 && !var38) {
            return var41;
         } else {
            Object[][] var39 = (Object[][])null;
            if(var18 != null) {
               var39 = nqa.b(var18, (byte)-126);
            }

            int var40;
            if(var38 && var39 != null) {
               if(var7 != null && var7.length == 20 && var7[13].equals(Integer.valueOf(1))) {
                  qga.n = null;
               }

               for(var40 = 0; var40 < 12; ++var40) {
                  if(var39[var40] != null) {
                     var41.a(var39[var40], 1 << var40, true);
                  }
               }
            }

            var40 = 0;

            for(var23 = 1; var40 < var14; ++var40) {
               if(var6[var40] != null) {
                  sw.a(var23, 0, var41, (byte)-64, var6[var40]);
               }

               var23 <<= 1;
            }

            if(var38) {
               for(var40 = 0; 12 > var40; ++var40) {
                  if(0 != ~var2[var40]) {
                     var23 = -var4 + var2[var40];
                     var23 &= 16383;
                     Object[] var45 = im.a(new Object[2], (int)-16365);
                     jca.a((byte)-94, 0.0F, 0.0F, 1.0F, var45, mw.a(var23, (byte)44));
                     var41.a(var45, 1 << var40, false);
                  }
               }

               if(var18 != null && 8 == var18.length) {
                  md.a((Object[])null, true);
               }
            }

            if(var38 && var39 != null) {
               if(null != var3 && -24 == ~var3.length) {
                  qga.n = null;
               }

               for(var40 = 0; var40 < 12; ++var40) {
                  if(null != var39[var40]) {
                     var41.a(var39[var40], 1 << var40, false);
                  }
               }
            }

            if(var5 != null && var11 != null) {
               bca.a(var5, (byte)108, var41, var11);
            } else if(null == var5) {
               if(var11 != null) {
                  bqa.a(0, 1, var41, var11);
               }
            } else {
               bqa.a(0, 1, var41, var5);
            }

            if(128 != ((int[])((int[])var0[1]))[14] || ((int[])((int[])var0[1]))[32] != 128) {
               var41.v(((int[])((int[])var0[1]))[14], ((int[])((int[])var0[1]))[32], ((int[])((int[])var0[1]))[14]);
            }

            var41.G(var8);
            return var41;
         }
      }
   }

   static final Object[] a(int var0, Object[] var1, int var2) {
      ++a;
      Object[] var3;
      synchronized(var1[1]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var1[1]), (long)var0));
      }

      if(var3 == null) {
         byte[] var4;
         synchronized(var1[2]) {
            var4 = qn.a(36, var0, (Object[])((Object[])var1[2]), 119);
         }

         Object[] var6 = new Object[10];
         if(var6[1] == null) {
            var6[1] = new int[28];
         }

         if(var6[9] == null) {
            var6[9] = new boolean[4];
         }

         ((int[])((int[])var6[1]))[19] = 0;
         ((boolean[])((boolean[])var6[9]))[2] = true;
         ((int[])((int[])var6[1]))[11] = -1;
         ((int[])((int[])var6[1]))[26] = -1;
         var6[4] = new String[5];
         ((int[])((int[])var6[1]))[9] = -1;
         ((int[])((int[])var6[1]))[12] = Integer.MIN_VALUE;
         ((int[])((int[])var6[1]))[21] = -1;
         ((int[])((int[])var6[1]))[5] = -1;
         ((int[])((int[])var6[1]))[2] = -1;
         ((int[])((int[])var6[1]))[15] = Integer.MAX_VALUE;
         ((int[])((int[])var6[1]))[17] = -1;
         ((int[])((int[])var6[1]))[8] = -1;
         ((int[])((int[])var6[1]))[27] = Integer.MIN_VALUE;
         ((int[])((int[])var6[1]))[24] = -1;
         ((boolean[])((boolean[])var6[9]))[1] = true;
         ((boolean[])((boolean[])var6[9]))[3] = true;
         ((boolean[])((boolean[])var6[9]))[0] = false;
         ((int[])((int[])var6[1]))[20] = -1;
         ((int[])((int[])var6[1]))[16] = Integer.MAX_VALUE;
         ((int[])((int[])var6[1]))[13] = -1;
         if(null != var6 && (var6.length == 1 || 1 == var6.length || 4 == var6.length)) {
            qia.a((byte)-117, 21, -20, (Object[])null);
         }

         ((int[])((int[])var6[1]))[7] = -1;
         if(var2 > -63) {
            return (Object[])null;
         } else {
            var3 = var6;
            var6[0] = var1;
            ((int[])((int[])var6[1]))[4] = var0;
            if(null != var4) {
               gq.a(var6, 64, jta.a((byte)-86, var4, new Object[3]));
            }

            sp.a(var6, false);
            synchronized(var1[1]) {
               il.a((long)var0, var3, true, (Object[])((Object[])var1[1]));
               return var3;
            }
         }
      } else {
         return var3;
      }
   }

   static final int a(Object[] var0, int var1) {
      ++b;
      Object[] var3 = (Object[])((Object[])var0[var1]);
      int var2 = ((int[])((int[])var3[1]))[0];
      return var2;
   }

}
