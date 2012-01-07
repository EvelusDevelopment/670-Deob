import jaclib.memory.Stream;

final class uaa {

   static int a;
   static int f;
   static int b;
   static int e;
   static int d;
   static Object[] c = sd.a(new Object[1], 82, (byte)113);


   static final int a(Object[] var0, int var1) {
      ++d;
      int var2;
      if(var0 != null && var0.length == 16) {
         var2 = ((int[])((int[])((Object[])((Object[])var0[14]))[1]))[6];
         return var2;
      } else if(null != var0 && var0.length == 20 && var0[14].equals(Integer.valueOf(0))) {
         var2 = ((int[])((int[])((Object[])((Object[])var0[17]))[1]))[6];
         return var2;
      } else if(null != var0 && -23 == ~var0.length) {
         return fka.a((byte)-128, var0);
      } else if(null != var0 && var0.length == 18) {
         return bca.c(3, var0);
      } else if(var0 != null && var0.length == 23) {
         return vt.a(var0, (byte)44);
      } else if(null != var0 && 17 == var0.length) {
         return ol.a(var0, false);
      } else {
         if(var1 <= 112) {
            c = (Object[])((Object[])c[2]);
         }

         if(var0 != null && 20 == var0.length && -9 == ~((boolean[])((boolean[])var0[8])).length) {
            return vfa.a(0, var0);
         } else if(null != var0 && 20 == var0.length && -8 == ~((boolean[])((boolean[])var0[8])).length) {
            var2 = ((int[])((int[])((Object[])((Object[])var0[19]))[1]))[6];
            return var2;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final Object[] a(int var0, Object[] var1, int var2) {
      ++e;
      lv var3;
      Object[] var5 = null != (var3 = (lv)dna.a((byte)34, (Object[])((Object[])var1[3]), (long)var2))?var3.t:null;
      if(null == var5) {
         byte[] var6;
         if('\u8000' <= var2) {
            var6 = qn.a(1, 32767 & var2, (Object[])((Object[])var1[0]), 72);
         } else {
            var6 = qn.a(1, var2, (Object[])((Object[])var1[4]), 98);
         }

         var5 = wr.a(60, new Object[7]);
         int var7 = 122 % ((var0 + 93) / 32);
         var5[2] = var1;
         Object[] var8;
         int var9;
         if(null != var6) {
            var8 = jta.a((byte)-88, var6, new Object[3]);

            while(true) {
               var9 = fh.a(var8, false);
               if(var9 == 0) {
                  if(var8 != null && -3 == ~var8.length) {
                     eja.a(88, (Object[])null, (Object[])null, (Object[])null, (Object[])null, (byte)123);
                  }
                  break;
               }

               if(var9 == 1) {
                  var5[3] = ul.a(0, ara.b((byte)61, var8), '<');
               } else {
                  int var10;
                  int var11;
                  if(var9 == 2) {
                     var10 = fh.a(var8, false);
                     var5[5] = new int[var10];

                     for(var11 = 0; var11 < var10; ++var11) {
                        ((int[])((int[])var5[5]))[var11] = de.a((int)0, var8);
                     }
                  } else if(3 != var9) {
                     if(4 == var9) {
                        ((boolean[])((boolean[])var5[1]))[0] = false;
                     }
                  } else {
                     var10 = fh.a(var8, false);
                     var5[0] = new int[var10][];
                     var5[6] = new int[var10];

                     for(var11 = 0; var11 < var10; ++var11) {
                        int var12 = de.a((int)0, var8);
                        Object[] var13 = ms.a(var12, (byte)115);
                        if(var13 != null) {
                           ((int[])((int[])var5[6]))[var11] = var12;
                           ((int[][])((int[][])var5[0]))[var11] = new int[((int[])((int[])var13[0]))[3]];

                           for(int var14 = 0; ((int[])((int[])var13[0]))[3] > var14; ++var14) {
                              ((int[][])((int[][])var5[0]))[var11][var14] = de.a((int)0, var8);
                           }
                        }
                     }
                  }
               }
            }
         }

         if(var2 >= '\u8000') {
            var8 = var5;
            if(var5[5] != null) {
               for(var9 = 0; var9 < ((int[])((int[])var8[5])).length; ++var9) {
                  ((int[])((int[])var8[5]))[var9] |= '\u8000';
               }

               if(var8 != null && var8.length == 26) {
                  return null;
               }
            }
         }

         il.a((long)var2, var5 == null?null:var5[4], true, (Object[])((Object[])var1[3]));
         return var5;
      } else {
         return var5;
      }
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      gq.a(-66, ((int[])((int[])var0[1]))[0], (String)var0[2], var1);
      ++b;
      if(var2 != 4) {
         c = (Object[])null;
      }

   }

   static final void a(int var0, byte var1, Object[] var2, int var3, int var4, float var5) {
      ++a;
      int var8;
      int var9;
      if(0 != ~((int[])((int[])var2[1]))[2]) {
         Object[] var6;
         Object[] var7 = ((ta)(null != (var6 = (Object[])((Object[])var2[8]))?var6[38]:null)).k.a(((int[])((int[])var2[1]))[2], (byte)62);
         var8 = 255 & ((byte[])((byte[])var7[0]))[3];
         int var11;
         if(0 != var8 && 4 != ((byte[])((byte[])var7[0]))[4]) {
            if(0 <= var4) {
               if(var4 > 127) {
                  var9 = 16777215;
               } else {
                  var9 = 131586 * var4;
               }
            } else {
               var9 = 0;
            }

            if(256 != var8) {
               var11 = -var8 + 256;
               var0 = (-16711936 & var8 * (var9 & 16711935) + (var0 & 16711935) * var11) + (var11 * ('\uff00' & var0) + var8 * (var9 & '\uff00') & 16711680) >> 8;
            } else {
               var0 = var9;
            }
         }

         var9 = ((byte[])((byte[])var7[0]))[1] & 255;
         if(var9 != 0) {
            var9 += 256;
            int var10 = ((16711680 & var0) >> 16) * var9;
            if(var10 > '\uffff') {
               var10 = '\uffff';
            }

            var11 = (255 & var0 >> 8) * var9;
            if(var11 > '\uffff') {
               var11 = '\uffff';
            }

            int var12 = (var0 & 255) * var9;
            if('\uffff' < var12) {
               var12 = '\uffff';
            }

            var0 = (var11 & '\uff00') + (16711715 & var10 << 8) + (var12 >> 8);
         }
      }

      if(var5 != 1.0F) {
         int var14 = 255 & var0 >> 16;
         var8 = (var0 & '\uff16') >> 8;
         var9 = var0 & 255;
         var14 = (int)((float)var14 * var5);
         if(var2 != null && (4 == var2.length && var2[2].equals(Integer.valueOf(0)) || var2.length == 5)) {
            el.a(false, -109, (Object[])null);
         }

         var8 = (int)((float)var8 * var5);
         if(var14 < 0) {
            var14 = 0;
         } else if(var14 > 255) {
            var14 = 255;
         }

         if(var8 < 0) {
            var8 = 0;
         } else if(var8 > 255) {
            var8 = 255;
         }

         var9 = (int)((float)var9 * var5);
         if(var9 < 0) {
            var9 = 0;
         } else if(255 < var9) {
            var9 = 255;
         }

         var0 = var9 | var14 << 16 | var8 << 8;
      }

      ((Stream)var2[6]).d(var3 * 4);
      if(var1 == 31) {
         if(((int[])((int[])((Object[])((Object[])var2[8]))[1]))[9] == 0) {
            ((Stream)var2[6]).b((byte)var0);
            ((Stream)var2[6]).b((byte)(var0 >> 8));
            ((Stream)var2[6]).b((byte)(var0 >> 16));
         } else {
            ((Stream)var2[6]).b((byte)(var0 >> 16));
            ((Stream)var2[6]).b((byte)(var0 >> 8));
            ((Stream)var2[6]).b((byte)var0);
         }

      }
   }

   static final void a(int var0, Object[] var1) {
      if(null == var1[1]) {
         var1[1] = new int[1];
      }

      ++f;
      if(var0 >= -102) {
         ((byte[])((byte[])c[0]))[1] = 76;
      }

   }

}
