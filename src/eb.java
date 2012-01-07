
final class eb {

   static Object[] m = mu.a(new Object[1], -24490, 1);
   static int g;
   static Object[] e;
   static int d;
   static boolean f = true;
   static int f_i;
   static int j;
   static int f_l;
   static Object[] h = ura.a(-86, new Object[2]);
   static int k;
   static String[] a = new String[100];
   static int b;
   static int c;


   static final Object[] a(boolean var0, Object[] var1) {
      bm.a((byte)-78, var1);
      ++c;
      uca.a(1, var1, var0, true);
      return var1;
   }

   static final boolean c(int var0, Object[] var1) {
      if(var0 < 29) {
         a(((int[])((int[])h[10]))[32], (Object[])((Object[])((Object[])((Object[])h[1]))[0]));
      }

      ++f_i;
      boolean var2;
      if(var1 != null && var1.length == 16 && 3 == ((int[])((int[])var1[12])).length) {
         var2 = false;
         return var2;
      } else if(var1 != null && -44 == ~var1.length) {
         return tv.a((byte)92, var1);
      } else if(var1 != null && var1.length == 20 && ((byte[])((byte[])var1[10])).length == 2 && var1[14].equals(Integer.valueOf(0))) {
         var2 = false;
         return var2;
      } else if(null != var1 && 20 == var1.length && ((int[])((int[])var1[12])).length == 7) {
         return gs.a((int)-72, var1);
      } else if(var1 != null && var1.length == 16 && -12 == ~((int[])((int[])var1[12])).length) {
         return bg.a(var1, (byte)123);
      } else if(var1 != null && var1.length == 22) {
         return qpa.a(var1, (int)3314);
      } else if(null != var1 && var1.length == 18) {
         return kaa.a(16, var1);
      } else {
         if(null != var1 && var1.length == 3) {
            ri.a(12, (ta)null, (Object[])null);
         }

         if(null != var1 && var1.length == 23) {
            return qd.a(18, var1);
         } else if(var1 != null && -18 == ~var1.length) {
            return ata.a(var1, -74);
         } else if(null != var1 && -25 == ~var1.length) {
            var2 = false;
            return var2;
         } else if(var1 != null && var1.length == 20 && ((boolean[])((boolean[])var1[8])).length == 8) {
            if(var1[19] == null) {
               var2 = true;
            } else {
               var2 = !((ka)var1[19]).m();
            }

            return var2;
         } else if(null != var1 && var1.length == 20 && 7 == ((boolean[])((boolean[])var1[8])).length) {
            var2 = false;
            return var2;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(int var0, aa var1) {
      jp.o[var0] = var1;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, byte[][][] var5, int var6, ta var7, int var8, int var9, int var10, int var11, byte var12) {
      ++j;
      if(var4 != 0 && var0 != 0) {
         if(var12 != 38) {
            a(((int[])((int[])m[1]))[4], -56, 90, -81, 26);
         }

         if(var4 == 9) {
            var3 = var3 + 1 & 3;
            var4 = 1;
         }

         if(var4 == 10) {
            var3 = 3 + var3 & 3;
            var4 = 1;
         }

         if(var4 == 11) {
            var4 = 8;
            var3 = 3 & var3 + 3;
         }

         var7.oa(var11, var6, var9, var10, var2, var1, var5[-1 + var4][var3], var0, var8);
      }
   }

   static final int a(byte var0) {
      ++d;
      boolean var1 = true;
      boolean var2 = false;
      boolean var3 = false;
      if(-513 < ~((int[])((int[])mca.g[1]))[5] && ((int[])((int[])mca.g[1]))[5] != 0) {
         var1 = false;
      }

      if(!mna.h.startsWith("win")) {
         var2 = true;
      } else {
         var2 = true;
         var3 = true;
      }

      if(os.j) {
         var3 = false;
      }

      if(me.a) {
         var1 = false;
      }

      if(eaa.d) {
         var2 = false;
      }

      if(!var1 && !var2 && !var3) {
         return mha.a(false);
      } else {
         int var4 = -1;
         int var5 = -1;
         if(var0 != -9) {
            m = (Object[])null;
         }

         int var6 = -1;
         if(var1) {
            try {
               var4 = wfa.a(2, (byte)52, 1000);
            } catch (Exception var13) {
               ;
            }
         }

         if(var3) {
            try {
               var6 = wfa.a(3, (byte)104, 1000);
               if(bg.a(true, (Object[])((Object[])tu.d[5])) == 3) {
                  Object[] var7 = lna.g.E();
                  long var8 = ((long[])((long[])var7[2]))[0] & 281474976710655L;
                  int var10 = ((int[])((int[])var7[1]))[1];
                  if(4098 == var10) {
                     var2 &= ~var8 <= -60129613780L;
                  } else if(4318 == var10) {
                     var2 &= 64425238954L <= var8;
                  }
               }
            } catch (Exception var12) {
               ;
            }
         }

         if(var2) {
            try {
               var5 = wfa.a(1, (byte)96, 1000);
            } catch (Exception var11) {
               ;
            }
         }

         if(var4 == -1 && ~var5 == 0 && ~var6 == 0) {
            return mha.a(false);
         } else {
            var5 = (int)((float)var5 * 1.1F);
            var6 = (int)((float)var6 * 1.1F);
            if(var4 > var6 && var4 > var5) {
               byte var14;
               if(12023 < var4) {
                  lw.a((byte)124);
                  var14 = 4;
               } else if(var4 > 5058) {
                  var14 = 3;
                  qla.a((byte)-65);
               } else if(2020 >= var4) {
                  wn.a(true, 115);
                  var14 = 1;
               } else {
                  eqa.a((byte)-127);
                  var14 = 2;
               }

               if(2 != bg.a(true, (Object[])((Object[])tu.d[5]))) {
                  ih.a(tu.d, (Object[])((Object[])tu.d[21]), 2, -72);
                  lg.a(false, 2, (byte)-120);
               } else {
                  Class_a.a((Object[])((Object[])tu.d[5]), 3, tu.d, true);
                  Class_b.a((byte)-101);
               }

               uk.a((byte)57);
               return var14;
            } else {
               return var5 >= var6?bja.a(var5, (byte)125, 1):bja.a(var6, (byte)109, 3);
            }
         }
      }
   }

   static final void b(int var0, int var1, int var2, int var3, int var4) {
      ++b;
      if(var2 < var1) {
         fka.a(var4, fda.c[var3], var1, var2, (byte)-112);
      } else {
         fka.a(var4, fda.c[var3], var2, var1, (byte)-95);
      }

      if(var0 != 100) {
         ((boolean[])((boolean[])h[0]))[15] = ((boolean[])((boolean[])e[0]))[29];
      }

   }

   static final void a(int var0, Object[] var1) {
      synchronized(var1[0]) {
         lga.b(0, (Object[])((Object[])var1[0]));
         int var3 = 96 / ((var0 - 38) / 60);
      }

      ++f_l;
   }

   static final int a(int var0, int var1, int var2, int var3, int var4) {
      if(var0 != -9976) {
         b(((int[])((int[])((Object[])((Object[])m[3]))[0]))[3], 64, -108, 41, 42);
      }

      ++k;
      int var5 = -tda.k[8192 * var3 / var1] + 65536 >> 1;
      return (var2 * (-var5 + 65536) >> 16) + (var5 * var4 >> 16);
   }

   static final void b(int var0, Object[] var1) throws Throwable {
      if(var0 != 3) {
         a(-95, ((int[])((int[])h[3]))[12], -45, 76, ((int[])((int[])h[2]))[0], (byte[][][])((byte[][][])null), 84, (ta)null, -100, -34, -72, -4, (byte)-92);
      }

      ++g;
      if(null != var1 && -5 == ~var1.length) {
         if(0L != ((long[])((long[])var1[3]))[0]) {
            el.a((Object[])((Object[])var1[2]), -70, ((long[])((long[])var1[3]))[0]);
            ((long[])((long[])var1[3]))[0] = 0L;
         }

         ((ft)var1[1]).a(84);
      } else {
         ((ft)var1[1]).a(84);
      }
   }

}
