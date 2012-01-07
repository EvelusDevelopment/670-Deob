import jaggl.OpenGL;
import java.awt.Canvas;

abstract class aa {

   int f_i;
   static int m;
   static int c;
   int a;
   static int n;
   int h;
   static int b;
   int g;
   static int k;
   static int e;
   int[][] f;
   static int f_l;
   static int d;
   static int j;


   abstract void a(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

   static final void b(Object[] var0, int var1) {
      if(null == var0[3]) {
         var0[3] = new float[1];
      }

      if(null == var0[var1]) {
         var0[1] = new int[1];
      }

      ++c;
   }

   abstract void a(int var1, int var2);

   final int a(int var1, int var2, int var3) {
      ++j;
      int var4 = var2 >> this.a;
      int var5 = var3 >> this.a;
      if(var4 >= 0 && var5 >= 0 && this.f_i - 1 >= var4 && -1 + this.h >= var5) {
         int var6 = var2 & -1 + this.g;
         int var7 = var3 & this.g - 1;
         int var8 = var6 * this.f[1 + var4][var5] + (this.g - var6) * this.f[var4][var5] >> this.a;
         int var9 = (-var6 + this.g) * this.f[var4][var5 + 1] + this.f[1 + var4][var1 + var5] * var6 >> this.a;
         return var9 * var7 + var8 * (-var7 + this.g) >> this.a;
      } else {
         return 0;
      }
   }

   abstract void ja(ya var1, int var2, int var3, int var4, int var5, boolean var6);

   static final void a(ta var0, Object[] var1, Object[] var2, boolean var3, ka[] var4, boolean var5) {
      if(!var5) {
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         int var10 = -1;
         int var11 = -1;
         Object[][][] var12 = new Object[var4.length][][];
         Object[][][] var13 = new Object[var4.length][][];

         for(int var14 = 0; var4.length > var14; ++var14) {
            if(var4[var14] != null) {
               var4[var14].a(var1);
               var12[var14] = var4[var14].a();
               var13[var14] = var4[var14].b();
               if(var13[var14] != null) {
                  ++var9;
                  var11 = var14;
                  var8 += var13[var14].length;
               }

               if(null != var12[var14]) {
                  var10 = var14;
                  var6 += var12[var14].length;
                  ++var7;
               }
            }
         }

         if((var2[16] == null || ((ch)var2[16]).r) && (var7 > 0 || 0 < var9)) {
            var2[16] = ch.b(kda.d, true);
         }

         if(null != var2[16]) {
            Object[][] var18 = (Object[][])null;
            int var16;
            if(var7 != 1) {
               var18 = new Object[var6][];
               if(null != var2 && var2.length == 4) {
                  bqa.a(90, 12, (Object[])null, 0);
               }

               int var15 = 0;

               for(var16 = 0; var4.length > var16; ++var16) {
                  if(var12[var16] != null) {
                     System.arraycopy(var12[var16], 0, var18, var15, var12[var16].length);
                     var15 += var12[var16].length;
                  }
               }
            } else {
               var18 = var12[var10];
            }

            Object[][] var19 = (Object[][])null;
            if(var9 == 1) {
               var19 = var13[var11];
            } else {
               var19 = new Object[var8][];
               var16 = 0;

               for(int var17 = 0; ~var17 > ~var4.length; ++var17) {
                  if(null != var13[var17]) {
                     System.arraycopy(var13[var17], 0, var19, var16, var13[var17].length);
                     var16 += var13[var17].length;
                  }
               }
            }

            ((ch)var2[16]).a(var0, (long)kda.d, var18, var19, false);
            ((boolean[])((boolean[])var2[8]))[5] = true;
         }
      } else if(var2[16] != null) {
         ((ch)var2[16]).a((long)kda.d);
      }

      if(!var3) {
         ++d;
         if(var2[16] != null) {
            ((ch)var2[16]).a(((byte[])((byte[])var2[10]))[0], ((short[])((short[])var2[13]))[1], ((short[])((short[])var2[13]))[0], ((short[])((short[])var2[13]))[3], ((short[])((short[])var2[13]))[2]);
         }

      }
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2) {
      ++e;
      if(var0 != 15022) {
         return (Object[])null;
      } else {
         fq.a(23376, var2);
         var2[0] = var1;
         int[] var3 = (int[])((int[])var2[1]);
         int var4;
         byte var5;
         if(var2 != null && 19 == var2.length) {
            var5 = 1;
            var4 = var5;
         } else if(null != var2 && -27 == ~var2.length && ((int[])((int[])var2[1])).length == 2 && ((int[])((int[])var2[1]))[1] == 2) {
            var4 = bd.a((byte)-127, var2);
         } else if(null != var2 && var2.length == 12 && ((int[])((int[])var2[1])).length == 2) {
            var4 = vpa.a(var0 - 14993, var2);
         } else if(null != var2 && -6 == ~var2.length && -3 == ~((int[])((int[])var2[1])).length) {
            var5 = 2;
            var4 = var5;
         } else if(var2 != null && var2.length == 25) {
            if(-2 <= ~ho.b(rpa.a((Object[])((Object[])var2[0]), (byte)78), (byte)123)) {
               var5 = 2;
            } else {
               var5 = 4;
            }

            var4 = var5;
         } else if(null != var2 && var2.length == 6) {
            var5 = 0;
            var4 = var5;
         } else if(null != var2 && var2.length == 16) {
            var5 = 0;
            var4 = var5;
         } else if(null != var2 && -6 == ~var2.length && ((int[])((int[])var2[1])).length == 1) {
            var4 = kr.a(var2, true);
         } else if(null != var2 && var2.length == 8) {
            var4 = kf.a(0, var2);
         } else if(var2 != null && var2.length == 2) {
            var4 = uua.a(var2, -23879);
         } else if(null != var2 && var2.length == 14) {
            var4 = vs.a((byte)-119, var2);
         } else if(var2 != null && 11 == var2.length && 1 == ((int[])((int[])var2[1])).length) {
            var4 = ita.b(var2, (byte)39);
         } else if(null != var2 && var2.length == 24) {
            int var6 = kf.a(rpa.a((Object[])((Object[])var2[0]), (byte)124), (byte)-83)?3:2;
            var4 = var6;
         } else if(null != var2 && -4 == ~var2.length) {
            var5 = 1;
            var4 = var5;
         } else if(var2 != null && 26 == var2.length && ((int[])((int[])var2[1])).length == 1) {
            var4 = gna.a(var2, 0);
         } else if(null != var2 && 12 == var2.length && -2 == ~((int[])((int[])var2[1])).length) {
            var5 = 127;
            var4 = var5;
         } else if(null != var2 && var2.length == 4) {
            var4 = oc.b(-124, var2);
         } else if(null != var2 && 22 == var2.length) {
            var4 = db.a((byte)-128, var2);
         } else if(var2 != null && var2.length == 18) {
            var4 = mo.a(var2, 3);
         } else if(null != var2 && var2.length == 20) {
            var4 = ra.b(1, var2);
         } else if(var2 != null && var2.length == 7) {
            var5 = 0;
            var4 = var5;
         } else if(var2 != null && var2.length == 9) {
            var4 = uha.a(6462, var2);
         } else if(null != var2 && var2.length == 23) {
            var5 = 1;
            var4 = var5;
         } else if(null != var2 && 17 == var2.length) {
            var5 = 3;
            var4 = var5;
         } else if(var2 != null && 15 == var2.length) {
            var5 = 1;
            var4 = var5;
         } else if(var2 != null && var2.length == 10) {
            var5 = 1;
            var4 = var5;
         } else if(var2 != null && 11 == var2.length && 2 == ((int[])((int[])var2[1])).length) {
            var5 = 1;
            var4 = var5;
         } else if(var2 != null && var2.length == 21) {
            if(96 <= lu.a(rpa.a((Object[])((Object[])var2[0]), (byte)71), (byte)-3)) {
               var5 = 2;
            } else {
               var5 = 0;
            }

            var4 = var5;
         } else if(var2 != null && var2.length == 26 && 2 == ((int[])((int[])var2[1])).length && -1 == ~((int[])((int[])var2[1]))[1]) {
            var5 = 1;
            var4 = var5;
         } else {
            if(null == var2 || -14 != ~var2.length) {
               throw new IllegalStateException();
            }

            var4 = cja.b(-125, var2);
         }

         var3[0] = var4;
         return var2;
      }
   }

   abstract ya h(int var1, int var2, ya var3);

   abstract void a(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Object[] var11, boolean var12);

   abstract void GA(ya var1, int var2, int var3, int var4, int var5, boolean var6);

   abstract void DA(int var1, int var2, int var3);

   static final Object[] a(Object[] var0, Canvas var1, int var2, Object[] var3) {
      int var4 = 113 / ((41 - var2) / 37);
      ++f_l;
      jra.a(var0, ((OpenGL)var0[86]).prepareSurface(var1), (byte)118, var1, var3);
      return var3;
   }

   final int b(int var1, int var2, int var3) {
      ++n;
      if(var1 >= -30) {
         this.a(-70, 7, 124);
      }

      return this.f[var3][var2];
   }

   static final void a(long var0, int var2, int var3, ta var4, Object[] var5, long var6, long var8, ka var10, Object[] var11) {
      ++k;
      long var12 = var8 * var8 + var0 * var0;
      if(var12 >= 262144L && ~var12 >= ~var6) {
         if(var3 == 20951) {
            int var14 = 16383 & (int)(Math.atan2((double)var0, (double)var8) * 2607.5945876176133D - (double)bca.a((Object[])((Object[])var11[35]), false));
            int var16 = ((int[])((int[])var11[12]))[11];
            int var17 = ((int[])((int[])var11[12]))[25];
            int var18 = ((int[])((int[])var11[12]))[37];
            if(null == var11 || -8 != ~var11.length || !var11[6].equals(Integer.valueOf(0))) {
               ka var15;
               label77: {
                  long var19 = (long)var2;
                  ka var21 = (ka)dna.a((byte)34, qma.c, var19);
                  short var22 = 2055;
                  if(var21 == null) {
                     ii var23 = ii.a(dl.b, var2, (int)0);
                     if(var23 == null) {
                        var15 = null;
                        break label77;
                     }

                     if(var23.a < 13) {
                        var23.a(2);
                     }

                     var21 = var4.a(var23, var22, jj.u, 64, 768);
                     il.a(var19, var21, true, qma.c);
                  }

                  var21 = var21.a((byte)6, var22, true);
                  if(0 != var14) {
                     var21.O(var14);
                  }

                  if(0 != var16) {
                     var21.UA(var16);
                  }

                  if(var17 != 0) {
                     var21.fa(var17);
                  }

                  if(0 != var18) {
                     var21.K(0, var18, 0);
                  }

                  if(var5 != null && var5.length == 3 && var5[1].equals(Integer.valueOf(2)) && var5[1].equals(Integer.valueOf(1))) {
                     a(92L, 64, 20951, (ta)null, (Object[])null, 58L, -83L, (ka)null, new Object[0][]);
                  }

                  var15 = var21;
               }

               if(null != var15) {
                  var4.c(false);
                  var15.a(var5, (lpa)null, 0);
                  var4.c(true);
               }

            }
         }
      }
   }

   static final void a(String var0, Object[] var1, int var2, int var3) {
      ++b;
      if(null == var1[63]) {
         var1[63] = nb.a((byte)122, 16, new Object[5]);
         Object[] var4;
         di.a((Object[])((Object[])var1[63]), true, (lm)((var4 = sg.a(var0, -19450, new Object[2])) != null?var4[1]:null), (long)var2);
      } else {
         ns var5;
         Object[] var7 = (var5 = (ns)pm.a((long)var2, (Object[])((Object[])var1[63]), false)) == null?null:var5.n;
         if(var3 >= -50) {
            a(115L, ((int[])((int[])((Object[])((Object[])var1[4]))[18]))[0], -56, (ta)null, (Object[])null, ((long[])((long[])var1[0]))[11], -93L, (ka)null, (Object[])null);
         }

         if(null != var7) {
            var7[0] = var0;
         } else {
            Object[] var6;
            di.a((Object[])((Object[])var1[63]), true, (lm)((var6 = sg.a(var0, -19450, new Object[2])) == null?null:var6[1]), (long)var2);
         }

      }
   }

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

   abstract boolean a(ya var1, int var2, int var3, int var4, int var5, boolean var6);

   abstract void a(Object[] var1, int[] var2);

   aa(int var1, int var2, int var3, int[][] var4) {
      this.h = var2;
      this.f_i = var1;

      int var5;
      for(var5 = 0; var3 > 1; var3 >>= 1) {
         ++var5;
      }

      this.g = 1 << var5;
      this.a = var5;
      this.f = var4;
   }

   abstract void l();

   static final void a(Object[] var0, int var1) {
      ++m;
      if(var0[var1] == null) {
         var0[1] = new int[6];
      }

      if(var0[5] == null) {
         var0[5] = new boolean[5];
      }

   }

   abstract void a(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Object[] var14, boolean var15);

}
