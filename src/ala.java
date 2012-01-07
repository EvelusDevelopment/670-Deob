import jaggl.OpenGL;

final class ala {

   static int a;
   static int d;
   static int f_i;
   static int e;
   static int b;
   static int f;
   static int h;
   static int[] g = new int[]{0, 1, 2, 3, 4, 5, 6, 14};
   static int c;


   static final boolean a(ta var0, Object[] var1, int var2, int var3, byte var4) {
      if(((int[])((int[])var1[1]))[3] != var2) {
         ((int[])((int[])var1[1]))[3] = var2;
         int var5 = uma.a(-32125, var2);
         if(var5 > 512) {
            var5 = 512;
         }

         if(var5 <= 0) {
            var5 = 1;
         }

         if(((int[])((int[])var1[1]))[11] != var5) {
            var1[3] = null;
            ((int[])((int[])var1[1]))[11] = var5;
         }

         if(null != var1[8]) {
            ((int[])((int[])var1[1]))[7] = 0;
            if(null != var1 && 1 == var1.length) {
               a((ta)null, (Object[])((Object[])tg.n[3]), -76, -76, (byte)-14);
            }

            int[] var6 = new int[((Object[])((Object[])var1[8])).length];

            for(int var7 = 0; ~var7 > ~((Object[])((Object[])var1[8])).length; ++var7) {
               faa var8 = ((faa[])((faa[])var1[8]))[var7];
               if(var8.a(((int[])((int[])var1[1]))[0], ((int[])((int[])var1[1]))[13], ((int[])((int[])var1[1]))[10], ((int[])((int[])var1[1]))[3])) {
                  var6[((int[])((int[])var1[1]))[7]] = var8.k;
                  faa[] var10000 = (faa[])((faa[])var1[5]);
                  int[] var10001 = (int[])((int[])var1[1]);
                  int var10004 = ((int[])((int[])var1[1]))[7];
                  var10001[7] = ((int[])((int[])var1[1]))[7] + 1;
                  var10000[var10004] = var8;
               }
            }

            jma.a(-1 + ((int[])((int[])var1[1]))[7], 0, (byte)25, (Object[])((Object[])var1[5]), var6);
         }

         ((boolean[])((boolean[])var1[2]))[1] = true;
      }

      ++f;
      if(var4 != -14) {
         return ((boolean[])((boolean[])var1[3]))[3];
      } else {
         boolean var11 = false;
         boolean var14;
         if(((boolean[])((boolean[])var1[2]))[1]) {
            ((boolean[])((boolean[])var1[2]))[1] = false;

            for(int var12 = -1 + ((int[])((int[])var1[1]))[7]; 0 <= var12; --var12) {
               var14 = ((faa[])((faa[])var1[5]))[var12].b(var0, (faa)var1[4]);
               var11 |= var14;
               ((boolean[])((boolean[])var1[2]))[1] |= !var14;
            }

            if(var1 != null && (var1.length == 6 || var1.length == 3)) {
               Class_cs.a((byte)96, (Object[])null);
            }
         }

         if(var3 != 0 && var0.j()) {
            if(null == var1[6] && ((int[])((int[])var1[1]))[2] >= 0) {
               try {
                  Object[] var13 = tg.n;
                  var14 = wl.a((byte)104, var13, ((int[])((int[])var1[1]))[2]);
                  if(var14) {
                     var0.FA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                     ii var15 = ii.a(tg.n, ((int[])((int[])var1[1]))[2], (int)0);
                     var1[6] = var0.a(var15, 1099776, 0, 255, 1);
                     byte[] var9 = ((ka)var1[6]).B();
                     if(var9 != null) {
                        var1[7] = new byte[var9.length];
                        System.arraycopy(var9, 0, var1[7], 0, var9.length);
                     } else {
                        var1[7] = null;
                     }
                  }
               } catch (Exception var10) {
                  ;
               }
            }
         } else {
            var1[6] = null;
         }

         if(null != var1[0] && var1[0] != var1) {
            ksa.a(var4 + 16, (Object[])((Object[])var1[0]));
            var11 |= a(var0, (Object[])((Object[])var1[0]), var2, var3, (byte)-14);
         }

         return var11;
      }
   }

   static final void a(Object[] var0, byte var1) {
      ++a;
      if(var1 == -64) {
         rs.b(2, var0);
         if(var0[86] != null) {
            ((OpenGL)var0[86]).a();
            ((OpenGL)var0[86]).release();
            var0[86] = null;
         }

      }
   }

   static final void a(int var0, int var1, int var2, int var3, byte var4, int var5, int var6) {
      if(var4 >= 22) {
         ++f_i;
         if(8 != var5 && 16 != var5) {
            Object[] var13 = ju.g[var2][var6][var1];
            if(null == var13) {
               var13 = jg.a(109, var2, new Object[10]);
            }

            if(1 == var5) {
               ((short[])((short[])var13[1]))[2] = (short)var3;
               ((short[])((short[])var13[1]))[0] = (short)var0;
            } else if(2 == var5) {
               ((short[])((short[])var13[1]))[1] = (short)var0;
               ((short[])((short[])var13[1]))[3] = (short)var3;
            }

            if(tra.f) {
               si.a(-79);
            }
         } else {
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            if(var5 == 8) {
               var7 = var6 << qqa.e;
               var8 = iia.n + var7;
               var9 = var1 << qqa.e;
               var10 = iia.n + var9;
               var11 = bf.f_l[var2].b(-49, var1, var6);
               var12 = bf.f_l[var2].b(-35, var1 + 1, var6 + 1);
               gj.O[caa.d++] = lw.a(var10, var11, var10, var9, var8, var9, var12, new Object[8], false, var11 - var0, var5, var2, -var0 + var12, var7, var7, var8);
            } else {
               var7 = iia.n + (var6 << qqa.e);
               var8 = var7 + -iia.n;
               var9 = var1 << qqa.e;
               var10 = var9 + iia.n;
               var11 = bf.f_l[var2].b(-37, var1, var6 + 1);
               var12 = bf.f_l[var2].b(-33, 1 + var1, var6);
               gj.O[caa.d++] = lw.a(var10, var11, var10, var9, var8, var9, var12, new Object[8], false, var11 - var0, var5, var2, var12 - var0, var7, var7, var8);
            }
         }

      }
   }

   static final ka a(Object[] var0, Object[] var1, int var2, int var3, aa var4, int var5, int var6, ta var7, int var8, aa var9, Object[] var10, int var11, int var12) {
      ++h;
      if(var10 != null && (-3 == ~var10.length || var10.length == 24)) {
         ria.a = null;
      }

      boolean var13 = 4 <= var6 && var6 <= 8;
      if(var13) {
         var6 = 4;
      }

      long var14 = (long)((((int[])((int[])var0[1]))[13] << 10) + (var6 << 3) + var2);
      var14 |= (long)(var7.G << 29);
      if(var1 != null) {
         var14 |= ((long[])((long[])var1[2]))[0] << 32;
      }

      if(null != var10) {
         var3 |= mo.a(true, var10);
      }

      if(((byte[])((byte[])var0[14]))[2] != 3) {
         if(((byte[])((byte[])var0[14]))[2] != 0 || -1 != ~((int[])((int[])var0[1]))[27]) {
            var3 |= 2;
         }

         if(0 != ((int[])((int[])var0[1]))[26]) {
            var3 |= 1;
         }

         if(0 != ((int[])((int[])var0[1]))[1]) {
            var3 |= 4;
         }
      } else {
         var3 |= 7;
      }

      if(var6 == 10 && var2 > 3) {
         var3 |= 5;
      }

      ka var17;
      synchronized(((Object[])((Object[])var0[7]))[8]) {
         var17 = (ka)dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var0[7]))[8]), var14);
      }

      if(null == var17 || 0 != var7.d(var17.va(), var3)) {
         if(null != var17) {
            var3 = var7.a(var3, var17.va());
         }

         var17 = wi.a(var6, var7, var2, var1, (byte)76, var0, var3);
         if(null == var17) {
            return null;
         }

         synchronized(((Object[])((Object[])var0[7]))[8]) {
            il.a(var14, var17, true, (Object[])((Object[])((Object[])((Object[])var0[7]))[8]));
         }
      }

      boolean var18 = false;
      if(var10 != null) {
         var18 = true;
         var17 = var17.a((byte)1, var3, true);
         bqa.a(var2 & 3, var8 + 1, var17, var10);
      }

      if(10 == var6 && var2 > 3) {
         if(!var18) {
            var18 = true;
            var17 = var17.a((byte)3, var3, true);
         }

         var17.O(2048);
      }

      if(var8 != ((byte[])((byte[])var0[14]))[2]) {
         if(!var18) {
            var18 = true;
            var17 = var17.a((byte)3, var3, true);
         }

         var17.ta(((byte[])((byte[])var0[14]))[2], ((int[])((int[])var0[1]))[17], var4, var9, var11, var12, var5);
      }

      if(0 != ((int[])((int[])var0[1]))[26] || ((int[])((int[])var0[1]))[27] != 0 || -1 != ~((int[])((int[])var0[1]))[1]) {
         if(!var18) {
            var18 = true;
            var17 = var17.a((byte)3, var3, true);
         }

         var17.K(((int[])((int[])var0[1]))[26], ((int[])((int[])var0[1]))[27], ((int[])((int[])var0[1]))[1]);
      }

      if(var18) {
         var17.G(var3);
      }

      return var17;
   }

   static final void a(int var0, Object[] var1, ta var2, long var3) {
      ++e;
      if(var0 != 1) {
         g = (int[])null;
      }

      for(ub var5 = (ub)om.a((Object[])((Object[])var1[5]), false); null != var5; var5 = (ub)pw.a((Object[])((Object[])var1[5]), -93)) {
         var5.a(var2, var3);
      }

      if(null == var1 || var1.length != 7 && 2 != var1.length) {
         ;
      }
   }

   static final boolean a(int var0, int var1, int var2, int var3, int var4) {
      ++c;
      if(cq.h && bqa.f_i) {
         if(tia.f_i >= 102) {
            if(lt.a(var3, var1, var0, 10412)) {
               if(var2 < 115) {
                  g = (int[])null;
               }

               int var5 = var1 << qqa.e;
               int var6 = var0 << qqa.e;
               return jc.a(var5, jp.o[var3].b(-32, var0, var1), var6, iia.n, iia.n, var4, -123);
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   static final boolean a(Object[] var0, boolean var1, byte[][][] var2, int var3, byte var4) {
      if(!es.e) {
         return false;
      } else {
         Object[] var5 = (Object[])((Object[])woa.a(5, var0)[1]);
         int var6 = (int)((float[])((float[])var5[1]))[2] >> qqa.e;
         int var7 = var6;
         int var8 = (int)((float[])((float[])var5[1]))[1] >> qqa.e;
         int var9 = var8;
         if(var0 != null && (var0.length == 16 && ((boolean[])((boolean[])var0[8])).length == 7 || var0.length == 17 || var0.length == 20 && ((byte[])((byte[])var0[10])).length == 3 || var0.length >= 24)) {
            var7 = ((short[])((short[])var0[13]))[0];
            var9 = ((short[])((short[])var0[13]))[2];
            var6 = ((short[])((short[])var0[13]))[1];
            var8 = ((short[])((short[])var0[13]))[3];
         }

         for(int var10 = var6; var10 <= var7; ++var10) {
            for(int var11 = var8; var11 <= var9; ++var11) {
               if(((byte[])((byte[])var0[10]))[1] < ri.n && var10 >= oia.z && var10 < ph.b && var11 >= tba.h && var11 < hja.d) {
                  if(var2 == null || ((byte[])((byte[])var0[10]))[0] < var3 || var2[((byte[])((byte[])var0[10]))[0]][var10][var11] != var4) {
                     boolean var12;
                     if(var0 != null && (var0.length == 20 && 7 == ((int[])((int[])var0[12])).length || var0.length == 17 || var0.length == 16 && 3 == ((byte[])((byte[])var0[10])).length || -25 >= ~var0.length)) {
                        var12 = du.c(true, var0);
                     } else {
                        boolean var13;
                        Object[] var14;
                        if(var0 != null && var0.length == 20 && (((boolean[])((boolean[])var0[8])).length == 7 || ((boolean[])((boolean[])var0[8])).length == 8)) {
                           var14 = (Object[])((Object[])woa.a(5, var0)[1]);
                           var13 = ju.e[((int)((float[])((float[])var14[1]))[2] >> qqa.e) - (bd.h - vt.d)][((int)((float[])((float[])var14[1]))[1] >> qqa.e) + -oaa.a + vt.d];
                           var12 = var13;
                        } else if(var0 != null && (-19 == ~var0.length || 20 == var0.length && 3 == ((int[])((int[])var0[12])).length && ((boolean[])((boolean[])var0[8])).length == 6)) {
                           var14 = (Object[])((Object[])woa.a(5, var0)[1]);
                           var13 = ju.e[vt.d + ((int)((float[])((float[])var14[1]))[2] >> qqa.e) + -bd.h][((int)((float[])((float[])var14[1]))[1] >> qqa.e) - (oaa.a + -vt.d)];
                           var12 = var13;
                        } else if(null != var0 && var0.length == 16 && ((boolean[])((boolean[])var0[8])).length == 5) {
                           var12 = ag.b(var0, 1);
                        } else {
                           if(null == var0 || var0.length < 21 || var0.length > 23) {
                              throw new IllegalStateException();
                           }

                           var12 = ipa.a(1, var0);
                        }
                     }

                     if(var12 && !Class_ds.a((byte)11, var0, mpa.b)) {
                        return false;
                     }
                  }

                  if(!var1 && var10 >= bd.h - 16 && var10 <= bd.h + 16 && var11 >= oaa.a - 16 && var11 <= oaa.a + 16) {
                     if(et.a) {
                        uua.a(ar.b[kua.c++], 3, var0);
                        kua.c %= ofa.a;
                     } else {
                        tja.a(mpa.b, (byte)108, var0);
                     }
                  }

                  return true;
               }
            }
         }

         return true;
      }
   }

}
