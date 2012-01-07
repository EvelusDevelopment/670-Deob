
final class lta {

   static int d;
   static int b;
   static int a;
   static int j;
   static int c = 0;
   static int k;
   static int f;
   static int e;
   static Object[] h;
   static int g;
   static int f_l;
   static int f_i;


   static final boolean a(int var0, Object[] var1) {
      ++b;
      return se.a((Object[])((Object[])var1[0]), (byte)-122)?false:fpa.a((int)0, (Object[])((Object[])((Object[])((Object[])var1[0]))[var0])) != 0;
   }

   static final void b(int var0, Object[] var1) {
      ++g;
      if(var0 != -32356) {
         a((Object[])null, ((int[])((int[])h[6]))[9], (Object[])((Object[])var1[14]), 74, ((int[])((int[])h[1]))[19], -77, 82);
      }

      if(null != var1 && var1.length == 6) {
         ep.a(var1, 1006);
      } else if(null != var1 && var1.length == 5) {
         vf.a(var1, (Object[])((Object[])var1[2]), var0 + 32361);
      } else {
         throw new IllegalStateException();
      }
   }

   static final boolean a(Object[] var0, Object[] var1, byte var2) {
      if(var2 != -75) {
         return ((boolean[])((boolean[])((Object[])((Object[])((Object[])((Object[])var1[34]))[11]))[8]))[0];
      } else {
         ++f;
         return null != var0 && jla.a(var1, lja.a, iua.a, 0, var0, bva.b);
      }
   }

   static final void a(int var0, int var1, int var2, Object[] var3, Object[] var4) {
      ++d;
      int[] var5 = ((int[][][])((int[][][])var3[10]))[var1][var0];
      int[] var6 = ((int[][][])((int[][][])var3[5]))[var1][var0];
      if(var4 != null && 16 == var4.length) {
         a(66, 127, -106, (Object[])null, (Object[])null);
      }

      int var7 = var5.length;
      int var8 = 52 % ((-34 - var2) / 38);
      if(nb.f_i.length < var7) {
         nea.d = new int[var7];
         nb.f_i = new int[var7];
      }

      int var9;
      for(var9 = 0; var7 > var9; ++var9) {
         nb.f_i[var9] = var5[var9] >> ((int[])((int[])((Object[])((Object[])var3[12]))[1]))[5];
         nea.d[var9] = var6[var9] >> ((int[])((int[])((Object[])((Object[])var3[12]))[1]))[5];
      }

      var9 = 0;

      while(var9 < var7) {
         int var10 = nb.f_i[var9];
         int var11 = nea.d[var9++];
         int var12 = nb.f_i[var9];
         int var13 = nea.d[var9++];
         int var14 = nb.f_i[var9];
         int var15 = nea.d[var9++];
         if((-var12 + var10) * (var13 + -var15) - (var14 - var12) * (var13 + -var11) > 0) {
            wta.a(var11, var4, (byte)98, var14, var13, var12, var15, var10);
         }
      }

   }

   static final void a(byte var0, Object[] var1) {
      dj.a(false, (Object[])((Object[])var1[0]));
      ++f_l;
      bpa.a((Object[])((Object[])var1[4]), (byte)88, (Object[])((Object[])var1[0]));
      ct.a(fma.f_wb, fma.f_wb, (Object[])((Object[])var1[4]), (Object[])((Object[])var1[0]), -92);
      sj.a((Object[])((Object[])var1[0]), (byte)-77, (int)0);
      if(var0 != 46) {
         a(-34, (Object[])null, true);
      }

      ah.a((Object[])((Object[])var1[0]), (Object[])((Object[])var1[8]), (byte)104);
      mb.a((Object[])((Object[])var1[0]), var0 + 13149, haa.b, 0);
      roa.a(haa.b, 125, (Object[])((Object[])var1[0]), 0);
      mb.a((Object[])((Object[])var1[0]), 13195, pja.d, 1);
      roa.a(pja.d, 104, (Object[])((Object[])var1[0]), 1);
      sea.a((Object[])((Object[])var1[6]), nt.c((Object[])((Object[])var1[0]), -102), (byte)67);
      we.a(tka.q, (Object[])((Object[])var1[0]), -21748);
      hca.a(0, (Object[])((Object[])var1[2]), (Object[])((Object[])var1[0]), 0);
      ws.a(95, (Object[])((Object[])var1[3]), (Object[])((Object[])var1[0]));
      woa.a(2, dw.a, (byte)99, (Object[])((Object[])var1[0]), ((int[])((int[])var1[1]))[0]);
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, boolean var12, int var13, int var14, int var15) {
      ++a;
      Object[] var17;
      int var18;
      if(var3 != 0 && -1 != var13) {
         var17 = null;
         if(var3 >= 0) {
            var18 = var3 - 1;
            hna var19 = (hna)pm.a((long)var18, hf.g, false);
            if(var19 != null) {
               var17 = var19.k;
            }
         } else {
            var18 = -1 + -var3;
            if(var18 == dp.r) {
               var17 = uta.g;
            } else {
               var17 = vo.E[var18];
            }
         }

         if(var17 != null) {
            Object[] var20 = ro.a((int)3, var17);
            if(null != var20[8] && ((int[][])((int[][])var20[8]))[var13] != null) {
               var2 -= ((int[][])((int[][])var20[8]))[var13][1];
            }

            if(var20[5] != null && null != ((int[][])((int[][])var20[5]))[var13]) {
               var2 -= ((int[][])((int[][])var20[5]))[var13][1];
            }
         }
      }

      var18 = -8 / ((-6 - var10) / 52);
      var17 = bja.a(pta.d, var7, var8, var0 + kda.d, var15, var5, var13, pta.d, new Object[24], var3, var2, var12, var14, kda.d + var4, var6, 9581, var9);
      fn.a(var1, kda.d + var4, var11, var17, Class_ds.a(pta.d, var11, var1, (byte)122) + -var6, 73);
      Object[] var16;
      client.a(118, gn.r, (lm)(null != (var16 = vm.a(var17, 16502, new Object[2]))?var16[1]:null));
   }

   static final long a(String var0, int var1) {
      ++k;
      if(var1 != 957755909) {
         return ((long[])((long[])h[5]))[6];
      } else {
         int var2 = var0.length();
         long var3 = 0L;

         for(int var5 = 0; var2 > var5; ++var5) {
            var3 = (long)var0.charAt(var5) + (var3 << 5) - var3;
         }

         return var3;
      }
   }

   static final Object[] a(Object[] var0, int var1, int var2, Object[] var3) {
      if(var2 >= -72) {
         return (Object[])((Object[])((Object[])((Object[])var0[0]))[12]);
      } else {
         bpa.a(18917, var0);
         ++e;
         lra.a(var0, 16830, var1, var3);
         return var0;
      }
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2, int var3, int var4, int var5, int var6) {
      ++j;
      dma.b((byte)-95, var0);
      tpa.a(-26562, var0);
      var0[2] = td.b(var0, -105);
      if(var6 > -3) {
         a((Object[])null, 93, -58, (Object[])null);
      }

      var0[0] = var2;
      var0[3] = fp.a(var2, var1, var4, (byte)74, var3, var5);
      return var0;
   }

   static final void a(int var0, Object[] var1, boolean var2) {
      ++f_i;
      boolean var3 = var2 && !((boolean[])((boolean[])var1[3]))[2];
      if(((boolean[])((boolean[])var1[3]))[1] == !var3) {
         ((boolean[])((boolean[])var1[3]))[1] = var3;
         Class_b.a(var1, 22775);
      }

      int var4 = 57 / ((var0 - 70) / 55);
   }

}
