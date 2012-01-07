
final class gt {

   static int d;
   static long a = 0L;
   static Object[] b = st.a(new Object[1], 7, 13, 22);
   static int h;
   static int f;
   static Object[] c;
   static Object[] g = ed.a(9, new Object[1], (byte)-124, 31);
   static int e = 0;


   static final void a(Object[] var0, int var1, nj var2) {
      if(var2.b != null) {
         var2.a(1);
      }

      if(var1 > -121) {
         a((Object[])null, 32, (nj)null);
      }

      ++h;
      var2.b = ((nj)var0[0]).b;
      var2.f = (nj)var0[0];
      var2.b.f = var2;
      var2.f.b = var2;
   }

   static final Object[] a(int var0, Object[] var1) {
      ++f;
      int var2 = 86 / ((var0 - 5) / 49);
      if(var1[1] == null) {
         var1[1] = new int[3];
      }

      if(var1[0] == null) {
         var1[0] = new char[1];
      }

      return var1;
   }

   static final void a(byte var0) {
      ++d;
      us.b = -1;
      rq.c = -1;
      oc.a(-7850, 0);

      int var5;
      int var6;
      int var7;
      for(var5 = 0; 4 > var5; ++var5) {
         for(var6 = 0; ~var6 > ~(rp.c >> 3); ++var6) {
            for(var7 = 0; var7 < wpa.a >> 3; ++var7) {
               va.m[var5][var6][var7] = -1;
            }
         }
      }

      wu var1;
      wu var2;
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      for(Object[] var23 = null == (var1 = (wu)dda.a(eb.h, 2))?null:var1.p; null != var23; var23 = null == (var2 = (wu)client.a(eb.h, -28280))?null:var2.p) {
         var6 = ((int[])((int[])var23[1]))[6];
         boolean var25 = (1 & var6) == 1;
         var8 = ((int[])((int[])var23[1]))[3] >> 3;
         var9 = ((int[])((int[])var23[1]))[7] >> 3;
         var10 = ((int[])((int[])var23[1]))[0];
         var11 = ((int[])((int[])var23[1]))[4];
         var12 = ((int[])((int[])var23[1]))[2];
         var13 = ((int[])((int[])var23[1]))[1];
         var14 = ((int[])((int[])var23[1]))[5];
         int var15 = ((int[])((int[])var23[1]))[8];
         int var17 = 0;
         int var18 = 0;
         byte var19 = 1;
         byte var20 = 1;
         if(var6 != 1) {
            if(2 != var6) {
               if(3 == var6) {
                  var20 = -1;
                  var17 = var15 - 1;
                  var19 = 1;
               }
            } else {
               var20 = -1;
               var19 = -1;
               var18 = -1 + var14;
               var17 = -1 + var15;
            }
         } else {
            var19 = -1;
            var18 = -1 + var14;
         }

         if(var23 != null && (-10 == ~var23.length || var23.length == 18 && var23[8].equals(Integer.valueOf(0)) && var23[8].equals(Integer.valueOf(2)))) {
            ((long[])((long[])nta.a[2]))[8] = 25L;
         }

         for(int var21 = var9; var9 + var15 > var21; ++var21) {
            if(var23 != null && 3 == var23.length && var23[0].equals(Integer.valueOf(2))) {
               mr.f = ((boolean[])((boolean[])pi.y[2]))[1];
            }

            int var16 = var18;

            for(int var22 = var8; ~var22 > ~(var14 + var8); ++var22) {
               if(var25) {
                  va.m[var13][var10 + var17][var11 + var16] = (var6 << 1) + (var22 << 14) + (var12 << 24) + (var21 << 3);
               } else {
                  va.m[var13][var16 + var10][var11 + var17] = (var22 << 14) + (var12 << 24) + (var21 << 3) + (var6 << 1);
               }

               var16 += var19;
            }

            var17 += var20;
         }
      }

      var5 = ffa.b.length;
      wu.n = new byte[var5][];
      pv.b = new int[var5];
      sia.b = null;
      du.d = new int[var5];
      epa.d = new int[var5];
      vla.h = new int[var5];
      mja.j = (byte[][])null;
      if(var0 != 125) {
         a(((int[])((int[])b[9]))[5], new Object[9]);
      }

      Class_f.d = new int[var5];
      ft.b = new byte[var5][];
      tqa.b = new byte[var5][];
      cf.h = new byte[var5][];
      var5 = 0;

      wu var3;
      wu var4;
      for(Object[] var24 = null != (var3 = (wu)dda.a(eb.h, var0 ^ 127))?var3.p:null; var24 != null; var24 = null != (var4 = (wu)client.a(eb.h, -28280))?var4.p:null) {
         var7 = ((int[])((int[])var24[1]))[3] >>> 3;
         var8 = ((int[])((int[])var24[1]))[7] >>> 3;
         var9 = ((int[])((int[])var24[1]))[5] + var7;
         if((7 & var9) == 0) {
            --var9;
         }

         var9 >>>= 3;
         var10 = var8 + ((int[])((int[])var24[1]))[8];
         if(0 == (var10 & 7)) {
            --var10;
         }

         var10 >>>= 3;

         for(var11 = var7 >>> 3; var11 <= var9; ++var11) {
            var12 = var8 >>> 3;

            while(var10 >= var12) {
               if(var24 != null && -2 == ~var24.length && var24[0].equals(Integer.valueOf(2))) {
                  ow.d = false;
               }

               var13 = var11 << 8 | var12;
               var14 = 0;

               while(true) {
                  if(var5 > var14) {
                     if(Class_f.d[var14] != var13) {
                        ++var14;
                        continue;
                     }
                  } else {
                     Class_f.d[var5] = var13;
                     du.d[var5] = dla.a(oe.f, 79, bg.a(true, var11, false, var12, (byte)-84));
                     epa.d[var5] = dla.a(oe.f, var0 - 69, bg.a(false, var11, false, var12, (byte)-24));
                     pv.b[var5] = dla.a(oe.f, 96, bg.a(true, var11, true, var12, (byte)125));
                     vla.h[var5] = dla.a(oe.f, 100, bg.a(false, var11, true, var12, (byte)-31));
                     ++var5;
                  }

                  ++var12;
                  break;
               }
            }
         }
      }

      gn.p = ffa.b;
      ffa.b = (int[][])null;
      mia.a(false, 13, rp.c >> 4, false, wpa.a >> 4);
   }

}
