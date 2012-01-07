import jagdx.IUnknown;

final class hd {

   static Object[] c = ed.a(-2, new Object[1], (byte)-102, 104);
   static int e;
   static int a = 0;
   static int f;
   static int b;
   static Object[] d;
   static int g = -1;


   static final void a() {
      for(int var0 = 0; var0 < rga.e; ++var0) {
         if(!jta.j[var0]) {
            Object[] var1 = qd.c[var0];
            Object[] var2 = (Object[])((Object[])var1[3]);
            int var3 = ((int[])((int[])var1[1]))[5];
            int var4 = mc.a(false, var2) - iba.b;
            int var5 = 1 + (2 * var4 >> qqa.e);
            int var6 = 0;
            int[] var7 = new int[var5 * var5];
            int var8 = lba.a(var2, -25699) - var4 >> qqa.e;
            int var9 = fn.a(var2, -120) - var4 >> qqa.e;
            int var10 = fn.a(var2, 95) + var4 >> qqa.e;
            if(var9 < 0) {
               var6 -= var9;
               var9 = 0;
            }

            if(var10 >= me.c) {
               var10 = me.c - 1;
            }

            for(int var11 = var9; var11 <= var10; ++var11) {
               short var12 = ((short[])((short[])var1[0]))[var6];
               int var13 = var12 >>> 8;
               int var14 = var6 * var5 + var13;
               int var15 = var8 + (var12 >>> 8);
               int var16 = var15 + (var12 & 255) - 1;
               if(var15 < 0) {
                  var14 -= var15;
                  var15 = 0;
               }

               if(var16 >= eja.c) {
                  var16 = eja.c - 1;
               }

               for(int var17 = var15; var17 <= var16; ++var17) {
                  byte var18 = 1;
                  Object[] var19 = InputStreamWorker.a(var3, var17, var11, (ut)null);
                  if(var19 != null && ((byte[])((byte[])var19[10]))[2] != 0) {
                     boolean var21;
                     boolean var20;
                     int var23;
                     short var22;
                     int var24;
                     if(((byte[])((byte[])var19[10]))[2] == 1) {
                        var20 = var17 - 1 >= var15;
                        var21 = var17 + 1 <= var16;
                        if(!var20 && var11 + 1 <= var10) {
                           var22 = ((short[])((short[])var1[0]))[var6 + 1];
                           var23 = var8 + (var22 >>> 8);
                           var24 = var23 + (var22 & 255);
                           var20 = var17 > var23 && var17 < var24;
                        }

                        if(!var21 && var11 - 1 >= var9) {
                           var22 = ((short[])((short[])var1[0]))[var6 - 1];
                           var23 = var8 + (var22 >>> 8);
                           var24 = var23 + (var22 & 255);
                           var21 = var17 > var23 && var17 < var24;
                        }

                        if(var20 && !var21) {
                           var18 = 4;
                        } else if(var21 && !var20) {
                           var18 = 2;
                        }
                     } else {
                        var20 = var17 - 1 >= var15;
                        var21 = var17 + 1 <= var16;
                        if(!var20 && var11 - 1 >= var9) {
                           var22 = ((short[])((short[])var1[0]))[var6 - 1];
                           var23 = var8 + (var22 >>> 8);
                           var24 = var23 + (var22 & 255);
                           var20 = var17 > var23 && var17 < var24;
                        }

                        if(!var21 && var11 + 1 <= var10) {
                           var22 = ((short[])((short[])var1[0]))[var6 + 1];
                           var23 = var8 + (var22 >>> 8);
                           var24 = var23 + (var22 & 255);
                           var21 = var17 > var23 && var17 < var24;
                        }

                        if(var20 && !var21) {
                           var18 = 3;
                        } else if(var21 && !var20) {
                           var18 = 5;
                        }
                     }
                  }

                  var7[var14++] = var18;
               }

               ++var6;
            }

            jta.j[var0] = true;
            jp.o[var3].a(var2, var7);
         }
      }

   }

   static final void a(Object[] var0, byte var1) {
      if(var1 != -124) {
         g = 87;
      }

      if(((long[])((long[])var0[3]))[0] != 0L) {
         IUnknown.Release(((long[])((long[])var0[3]))[0]);
         ((long[])((long[])var0[3]))[0] = 0L;
      }

      ++e;
   }

   static final Object[] a(byte var0, byte[] var1) {
      ++b;
      Object[] var3 = js.a(new Object[9], true);
      Object[] var4 = jta.a((byte)-83, var1, new Object[3]);
      ((int[])((int[])var4[1]))[0] = ((byte[])((byte[])var4[2])).length - 2;
      int var5 = de.a((int)0, var4);
      if(var0 != 95) {
         ((long[])((long[])c[4]))[3] = 26L;
      }

      int var6 = ((byte[])((byte[])var4[2])).length - (2 + var5 + 16);
      ((int[])((int[])var4[1]))[0] = var6;
      int var7 = lr.a(1, var4);
      ((int[])((int[])var3[1]))[4] = de.a((int)0, var4);
      ((int[])((int[])var3[1]))[1] = de.a((int)0, var4);
      ((int[])((int[])var3[1]))[0] = de.a(var0 - 95, var4);
      ((int[])((int[])var3[1]))[2] = de.a((int)0, var4);
      ((int[])((int[])var3[1]))[5] = de.a((int)0, var4);
      ((int[])((int[])var3[1]))[3] = de.a(var0 ^ 95, var4);
      int var8 = fh.a(var4, false);
      if(var4 != null && -8 == ~var4.length) {
         dqa.b = null;
      }

      int var9;
      int var10;
      if(var8 > 0) {
         var3[2] = new Object[var8][];
         if(null != var4 && -24 == ~var4.length && var4[1].equals(Boolean.valueOf(false))) {
            dqa.b = null;
         }

         for(var9 = 0; var9 < var8; ++var9) {
            if(null != var4 && (-10 == ~var4.length || -2 == ~var4.length)) {
               fca.a(var0 - 205, ((int[])((int[])dqa.b[15]))[4]);
            }

            var10 = de.a((int)0, var4);
            Object[] var11 = nb.a((byte)110, fda.a(var10, (byte)81), new Object[5]);
            ((Object[][])((Object[][])var3[2]))[var9] = var11;

            while(var10-- > 0) {
               int var12 = lr.a(1, var4);
               int var13 = lr.a(var0 ^ 94, var4);
               Object[] var2;
               di.a(var11, true, (lm)(null != (var2 = ps.a((byte)102, var13, new Object[2]))?var2[0]:null), (long)var12);
            }
         }
      }

      ((int[])((int[])var4[1]))[0] = 0;
      var3[3] = dv.a(var4, (byte)-30);
      var3[0] = new int[var7];

      for(var9 = 0; var6 > ((int[])((int[])var4[1]))[0]; ((int[])((int[])var3[0]))[var9++] = var10) {
         var10 = de.a(var0 ^ 95, var4);
         if(var10 == 3) {
            if(var3[5] == null) {
               var3[5] = new String[var7];
            }

            ((Object[])((Object[])var3[5]))[var9] = ara.b((byte)61, var4).intern();
         } else if(var10 != 54) {
            if(null == var3[6]) {
               var3[6] = new int[var7];
            }

            if(var10 < 150 && 21 != var10 && 38 != var10 && var10 != 39) {
               ((int[])((int[])var3[6]))[var9] = lr.a(1, var4);
            } else {
               ((int[])((int[])var3[6]))[var9] = fh.a(var4, false);
            }
         } else {
            if(null == var3[7]) {
               var3[7] = new long[var7];
            }

            ((long[])((long[])var3[7]))[var9] = Class_i.a(false, var4);
         }
      }

      return var3;
   }

   static final hb a(int var0, int var1, int[] var2, byte var3, Object[] var4) {
      ++f;
      int var5 = var0 ^ ((var1 & -1610608641) << 4 | var1 >>> 12);
      var5 |= var1 << 16;
      long var6 = (long)var5 ^ 4294967296L;
      hb var8 = (hb)pm.a(var6, (Object[])((Object[])var4[0]), false);
      if(null == var8) {
         if(null != var2 && 0 >= var2[0]) {
            return null;
         } else {
            pr var9 = (pr)pm.a(var6, (Object[])((Object[])var4[3]), false);
            if(null == var9) {
               var9 = pr.a((Object[])((Object[])var4[1]), var1, var0);
               if(var9 == null) {
                  return null;
               }

               di.a((Object[])((Object[])var4[3]), true, var9, var6);
            }

            var8 = var9.a(var2);
            if(null != var8) {
               var9.a((byte)95);
               if(var3 >= -27) {
                  a((Object[])null, ((byte[])((byte[])var4[0]))[9]);
               }

               di.a((Object[])((Object[])var4[0]), true, var8, var6);
               if(var4 != null && -8 == ~var4.length && var4[4].equals(Boolean.valueOf(false)) && var4[4].equals(Integer.valueOf(0))) {
                  ev.a((Object[])null, 2519);
               }

               return var8;
            } else {
               return null;
            }
         }
      } else {
         return var8;
      }
   }

}
