
final class jm {

   static int b;
   static int f;
   static int h;
   static Object[] k = ed.a(-1, new Object[1], (byte)-125, 118);
   static int g;
   static int e;
   static int d;
   static int f_i;
   static int a;
   static int[] j = new int[4096];
   static Object[] f_l = sd.a(new Object[1], 43, (byte)122);
   static int c;


   static final void a(int var0, Object[] var1) {
      ++c;
      if(var1 != null && 4 == var1.length && var1[3].equals(Integer.valueOf(1))) {
         aba.a((Object[])null, (byte)49);
      }

      int var14 = -31 % ((-83 - var0) / 38);
      Object[] var20;
      int var22;
      if(!(var1[2] instanceof Integer[])) {
         Object[] var18 = (Object[])((Object[])var1[2]);
         var1[4] = nb.a((byte)118, ura.a(var18, -113), new Object[5]);
         Object[] var19 = nb.a((byte)67, ura.a(var18, -105), new Object[5]);

         ma var7;
         ma var8;
         Object[] var21;
         for(var20 = null == (var7 = (ma)qt.a(0, var18))?null:var7.s; var20 != null; var20 = (var8 = (ma)nda.a(1, var18)) == null?null:var8.s) {
            ma var9;
            var21 = null != (var9 = (ma)pm.a((long)((int[])((int[])var20[1]))[0], var19, false))?var9.s:null;
            if(null == var21) {
               var21 = ps.a((byte)98, 0, new Object[2]);
               di.a(var19, true, (lm)(null == var21?null:var21[0]), (long)((int[])((int[])var20[1]))[0]);
            }

            ++((int[])((int[])var21[1]))[0];
         }

         if(var1 != null && 17 == var1.length) {
            hla.b(26206, (Object[])null);
         }

         ma var11;
         ma var12;
         for(var20 = null != (var11 = (ma)qt.a(0, var18))?var11.s:null; var20 != null; var20 = null == (var12 = (ma)nda.a(1, var18))?null:var12.s) {
            gp var13;
            var21 = (var13 = (gp)pm.a((long)((int[])((int[])var20[1]))[0], (Object[])((Object[])var1[4]), false)) != null?var13.q:null;
            ma var15;
            var22 = ((int[])((int[])(null != (var15 = (ma)pm.a((long)((int[])((int[])var20[1]))[0], var19, false))?var15.s:null)[1]))[0]--;
            if(null == var21) {
               var21 = bna.a(var1, var22, new Object[3], (byte)69);
               di.a((Object[])((Object[])var1[4]), true, (lm)(var21 == null?null:var21[0]), (long)((int[])((int[])var20[1]))[0]);
            }

            ((int[])((int[])var21[1]))[((int[])((int[])var21[1])).length - var22] = (int)((lm)(null == var20?null:var20[0])).e;
         }
      } else {
         Integer[] var26 = (Integer[])((Integer[])var1[2]);
         int var25 = fda.a(var26.length, (byte)81);
         var1[4] = nb.a((byte)57, var25, new Object[5]);
         if(var1 != null && var1.length == 8) {
            return;
         }

         var20 = nb.a((byte)72, var25, new Object[5]);

         Object[] var23;
         int var27;
         for(var27 = 0; var26.length > var27; ++var27) {
            if(var26[var27] != null) {
               var22 = var26[var27].intValue();
               ma var2;
               var23 = null == (var2 = (ma)pm.a((long)var22, var20, false))?null:var2.s;
               if(var23 == null) {
                  var23 = ps.a((byte)92, 0, new Object[2]);
                  di.a(var20, true, (lm)(null != var23?var23[0]:null), (long)var22);
               }

               ++((int[])((int[])var23[1]))[0];
            }
         }

         for(var27 = 0; var26.length > var27; ++var27) {
            if(null != var26[var27]) {
               var22 = var26[var27].intValue();
               gp var4;
               var23 = null != (var4 = (gp)pm.a((long)var22, (Object[])((Object[])var1[4]), false))?var4.q:null;
               ma var5;
               int var24 = ((int[])((int[])(null == (var5 = (ma)pm.a((long)var22, var20, false))?null:var5.s)[1]))[0]--;
               if(null == var23) {
                  var23 = bna.a(var1, var24, new Object[3], (byte)78);
                  di.a((Object[])((Object[])var1[4]), true, (lm)(null != var23?var23[0]:null), (long)var22);
               }

               ((int[])((int[])var23[1]))[((int[])((int[])var23[1])).length + -var24] = var27;
            }
         }
      }

   }

   static final Object[] a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int var9, int var10, Object[] var11, int var12, ta var13, int var14, boolean var15, Object[] var16) {
      if(null == var16[12]) {
         var16[12] = new int[4];
      }

      if(var16[10] == null) {
         var16[10] = new byte[5];
      }

      if(null == var16[8]) {
         var16[8] = new boolean[9];
      }

      ++g;
      if(var3 != -15903) {
         a((Object[])((Object[])k[0]), false);
      }

      boolean var26 = -2 == ~((int[])((int[])var11[1]))[7];
      if(var11 != null && 7 == var11.length) {
         return null;
      } else {
         byte var38;
         if(var0 == 9) {
            if(-1 == ~(var8 & 1)) {
               var38 = 1;
            } else {
               var38 = 2;
            }
         } else {
            var38 = 0;
         }

         wda.a(var6, var2, var10, var12, 10, var16, var14, var38, var1, var5, var4, var9, var26);
         ((int[])((int[])var16[12]))[3] = ((int[])((int[])var11[1]))[13];
         ((byte[])((byte[])var16[10]))[3] = (byte)var8;
         ((boolean[])((boolean[])var16[8]))[5] = var7;
         ((boolean[])((boolean[])var16[8]))[8] = ((int[])((int[])var11[1]))[11] != 0 && !var7;
         ((boolean[])((boolean[])var16[8]))[7] = var15;
         ((byte[])((byte[])var16[10]))[4] = (byte)var0;
         ((byte[])((byte[])var16[10]))[1] = (byte)var6;
         ((boolean[])((boolean[])var16[8]))[6] = var13.n() && ((boolean[])((boolean[])var11[0]))[10] && !((boolean[])((boolean[])var16[8]))[5] && ft.a((Object[])((Object[])tu.d[13]), (int)-14072) != 0;
         int var39 = 2048;
         if(((boolean[])((boolean[])var16[8]))[7]) {
            var39 |= 65536;
         }

         Object[] var40 = oja.a(var16, var13, var3 + 15903, var39, ((boolean[])((boolean[])var16[8]))[6]);
         if(var40 != null) {
            var16[16] = var40[1];
            var16[14] = var40[0];
            if(((boolean[])((boolean[])var16[8]))[7]) {
               var16[16] = ((ka)var16[16]).a((byte)0, var39, false);
            }
         }

         toa.a(1, var16, var3 ^ -11708);
         return var16;
      }
   }

   static final void a(byte var0, Object[] var1) {
      if(var0 != 122) {
         a(((boolean[])((boolean[])var1[1]))[0], ((int[])((int[])((Object[])((Object[])f_l[7]))[2]))[3], ((int[])((int[])f_l[2]))[22]);
      }

      ++d;
      if(null == var1[1]) {
         var1[1] = new int[1];
      }

   }

   static final void a(boolean var0, int var1, int var2) {
      ++a;
      Object[] var3 = fk.a(Integer.MIN_VALUE, var2, var0);
      if(var3 != null) {
         if(var3 != null && -29 == ~var3.length && var3[15].equals(Integer.valueOf(1)) && var3[15].equals(Boolean.valueOf(false))) {
            ma.r = 38;
         }

         for(int var4 = var1; ~var4 > ~((int[])((int[])var3[2])).length; ++var4) {
            ((int[])((int[])var3[2]))[var4] = -1;
            ((int[])((int[])var3[0]))[var4] = 0;
         }

      }
   }

   static final void a(Object[] var0, int var1, int var2) {
      if(null == var0[0]) {
         var0[0] = new Object[var1][];
      } else {
         qo.a((Object[])((Object[])var0[0]), 0, (Object[])(var0[0] = new Object[var1][]), 0, ((int[])((int[])var0[1]))[0]);
      }

      if(var2 < -74) {
         ++f_i;
      }
   }

   static final void a(Object[] var0, int var1) {
      ++e;
      synchronized(var0[6]) {
         dq.a(-106, (Object[])((Object[])var0[6]));
      }

      synchronized(var0[4]) {
         dq.a(111, (Object[])((Object[])var0[4]));
      }

      synchronized(var0[7]) {
         if(var1 != 24716) {
            ((boolean[])((boolean[])f_l[28]))[4] = false;
         }

         dq.a(41, (Object[])((Object[])var0[7]));
      }
   }

   static final cga a(Object[] var0, int var1, ta var2) {
      ++h;
      cga var3 = (cga)dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var0[0]))[3]), (long)(131072 | ((int[])((int[])var0[1]))[20] | var2.G << 29));
      if(null != var3) {
         return var3;
      } else {
         hp.a(-125, (Object[])((Object[])((Object[])((Object[])var0[0]))[0]), ((int[])((int[])var0[1]))[20]);
         if(var1 >= -76) {
            return (cga)null;
         } else {
            aea var4 = aea.b((Object[])((Object[])((Object[])((Object[])var0[0]))[0]), ((int[])((int[])var0[1]))[20], 0);
            if(var4 != null) {
               var3 = var2.a(var4, true);
               il.a((long)(var2.G << 29 | 131072 | ((int[])((int[])var0[1]))[20]), var3, true, (Object[])((Object[])((Object[])((Object[])var0[0]))[3]));
            }

            return var3;
         }
      }
   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      ++b;
      if(var1 == 1) {
         if(null != var0) {
            ((lm)(var0 == null?null:var0[2])).a((byte)113);
            ((tha)(var0 == null?null:var0[2])).a(8192);
            ((int[])((int[])var2[1]))[1] += ((int[])((int[])var0[1]))[0];
         }

      }
   }

   static final void a(Object[] var0, boolean var1) {
      if(null == var0[1]) {
         var0[1] = new int[2];
      }

      if(var1) {
         ++f;
      }
   }

}
