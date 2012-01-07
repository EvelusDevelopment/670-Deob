
final class ra {

   static int j;
   static int b = -1;
   static int k;
   static int e;
   static boolean h = false;
   static int g;
   static int f;
   static int c;
   static int a;
   static int[][] f_i;
   static int d;


   static final Object[] a(int var0) {
      ++d;
      if(var0 != 31175) {
         return (Object[])null;
      } else {
         fra var1;
         Object[] var8 = (var1 = (fra)gm.a(tia.f_l, 0)) == null?null:var1.z;
         if(var8 != null) {
            ((lm)(var8 != null?var8[1]:null)).a((byte)25);
            ((tha)(var8 == null?null:var8[1])).a(8192);
            return var8;
         } else {
            do {
               fra var4;
               var8 = (var4 = (fra)gm.a(client.Db, var0 - 31175)) == null?null:var4.z;
               if(null == var8) {
                  return null;
               }

               if(hfa.a(var8, 1) > he.a(-121)) {
                  return null;
               }

               ((lm)(null != var8?var8[1]:null)).a((byte)99);
               ((tha)(var8 == null?null:var8[1])).a(8192);
            } while(~(Long.MIN_VALUE & ((tha)(null == var8?null:var8[1])).m) == -1L);

            return var8;
         }
      }
   }

   static final void a(int var0, int var1, int var2, Object[] var3, Object[] var4, int var5) {
      gea.u = var3;
      ++k;
      vta.x = var2;
      tn.a(var4, var5, var1, var0 + 0);
      if(var0 == 1) {
         gea.u = null;
      }
   }

   static final int[] a(int var0, int var1, Object[] var2) {
      if(var1 != 1) {
         return (int[])null;
      } else {
         ++e;
         int[] var3 = od.a(-1704, var0, (Object[])((Object[])var2[5]));
         if(((boolean[])((boolean[])((Object[])((Object[])var2[5]))[4]))[0]) {
            int var4 = bv.b[var0];

            for(int var5 = 0; fo.b > var5; ++var5) {
               int var6 = wra.d[var5];
               int var7;
               if(~var6 < ~((int[])((int[])var2[1]))[1] && 4096 + -((int[])((int[])var2[1]))[1] > var6 && var4 > -((int[])((int[])var2[1]))[1] + 2048 && ~var4 > ~(((int[])((int[])var2[1]))[1] + 2048)) {
                  var7 = -var6 + 2048;
                  var7 = 0 > var7?-var7:var7;
                  var7 <<= 12;
                  var7 /= -((int[])((int[])var2[1]))[1] + 2048;
                  var3[var5] = 4096 - var7;
               } else if(-((int[])((int[])var2[1]))[1] + 2048 < var6 && 2048 + ((int[])((int[])var2[1]))[1] > var6) {
                  var7 = -2048 + var4;
                  var7 = 0 > var7?-var7:var7;
                  var7 -= ((int[])((int[])var2[1]))[1];
                  var7 <<= 12;
                  var3[var5] = var7 / (-((int[])((int[])var2[1]))[1] + 2048);
               } else if(~var4 <= ~((int[])((int[])var2[1]))[1] && ~var4 >= ~(-((int[])((int[])var2[1]))[1] + 4096)) {
                  if(~var6 <= ~((int[])((int[])var2[1]))[1] && 4096 - ((int[])((int[])var2[1]))[1] >= var6) {
                     var3[var5] = 0;
                  } else {
                     var7 = -var4 + 2048;
                     var7 = 0 > var7?-var7:var7;
                     var7 <<= 12;
                     var7 /= 2048 - ((int[])((int[])var2[1]))[1];
                     var3[var5] = 4096 - var7;
                  }
               } else {
                  var7 = -2048 + var6;
                  var7 = var7 < 0?-var7:var7;
                  var7 -= ((int[])((int[])var2[1]))[1];
                  var7 <<= 12;
                  var3[var5] = var7 / (2048 - ((int[])((int[])var2[1]))[1]);
               }
            }

            if(null != var2 && (var2.length == 14 || 2 == var2.length)) {
               a(66, 1, new Object[0][]);
            }
         }

         return var3;
      }
   }

   static final int b(int var0, Object[] var1) {
      ++f;
      if(var0 != 1) {
         a(109, ((int[])((int[])var1[1]))[3], (Object[])null);
      }

      return 0;
   }

   static final void a(Object[] var0) {
      if(rga.e < '\uff98') {
         Object[] var1 = (Object[])((Object[])var0[3]);
         qd.c[rga.e] = var0;
         jta.j[rga.e] = false;
         ++rga.e;
         int var2 = ((int[])((int[])var0[1]))[5];
         if(((boolean[])((boolean[])var0[2]))[1]) {
            var2 = 0;
         }

         int var3 = ((int[])((int[])var0[1]))[5];
         if(((boolean[])((boolean[])var0[2]))[0]) {
            var3 = ri.n - 1;
         }

         for(int var4 = var2; var4 <= var3; ++var4) {
            int var5 = 0;
            int var6 = fn.a(var1, 14) - mc.a(false, var1) + iba.b >> qqa.e;
            if(var6 < 0) {
               var5 -= var6;
               var6 = 0;
            }

            int var7 = fn.a(var1, 63) + mc.a(false, var1) - iba.b >> qqa.e;
            if(var7 >= me.c) {
               var7 = me.c - 1;
            }

            for(int var8 = var6; var8 <= var7; ++var8) {
               short var9 = ((short[])((short[])var0[0]))[var5++];
               int var10 = (lba.a(var1, -25699) - mc.a(false, var1) + iba.b >> qqa.e) + (var9 >>> 8);
               int var11 = var10 + (var9 & 255) - 1;
               if(var10 < 0) {
                  var10 = 0;
               }

               if(var11 >= eja.c) {
                  var11 = eja.c - 1;
               }

               for(int var12 = var10; var12 <= var11; ++var12) {
                  long var13 = nba.e[var4][var12][var8];
                  if((var13 & 65535L) == 0L) {
                     nba.e[var4][var12][var8] = var13 | (long)rga.e;
                  } else if((var13 & 4294901760L) == 0L) {
                     nba.e[var4][var12][var8] = var13 | (long)rga.e << 16;
                  } else if((var13 & 281470681743360L) == 0L) {
                     nba.e[var4][var12][var8] = var13 | (long)rga.e << 32;
                  } else if((var13 & -281474976710656L) == 0L) {
                     nba.e[var4][var12][var8] = var13 | (long)rga.e << 48;
                  }
               }
            }
         }

      }
   }

   static final kp a(int var0, Object[] var1) {
      ++j;
      if(var0 < 58) {
         return (kp)null;
      } else if(var1 != null && (-2 == ~var1.length || var1.length == 2 || -3 == ~var1.length && var1[1].equals(Integer.valueOf(1)) && var1[1].equals(Integer.valueOf(1)))) {
         return null;
      } else {
         Object[] var3;
         do {
            mt var2;
            var3 = (var2 = (mt)client.a((Object[])((Object[])var1[0]), -28280)) == null?null:var2.n;
            if(var3 == null) {
               return null;
            }
         } while(null == var3[0]);

         return (kp)var3[0];
      }
   }

   static final void a(int var0, Object[] var1, lsa var2) {
      var1[var0] = var2;
      ++g;
   }

   static final void a(Object[] var0, boolean var1) {
      ++a;
      var0[2] = hw.e;
      if(var1) {
         a(new Object[2]);
      }

   }

   static final Object[] a(boolean var0, boolean var1, Object[] var2) {
      if(null == var2[3]) {
         var2[3] = new boolean[2];
      }

      if(var2[1] == null) {
         var2[1] = new int[6];
      }

      ++c;
      ((boolean[])((boolean[])var2[3]))[0] = false;
      ((int[])((int[])var2[1]))[2] = 0;
      ((boolean[])((boolean[])var2[3]))[1] = false;
      if(var0) {
         a(((int[])((int[])var2[8]))[11], ((int[])((int[])var2[3]))[2], 100, (Object[])null, (Object[])((Object[])var2[3]), -33);
      }

      ((boolean[])((boolean[])var2[3]))[1] = var1;
      var2[2] = gn.c(new Object[4], (byte)38);
      if(!((boolean[])((boolean[])var2[3]))[1]) {
         var2[0] = null;
      } else {
         var2[0] = gn.c(new Object[4], (byte)111);
      }

      return var2;
   }

}
