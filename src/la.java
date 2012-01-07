
final class la {

   static int k;
   static int e;
   static int g;
   static int f_i;
   static Object[] d = Class_fs.a(1, (byte)-121, new Object[1], 0, 13, 0);
   static int f;
   static int a;
   static int c;
   static int h;
   static int j;
   static short[] b = new short[256];
   static boolean f_l = false;
   static int m = 0;


   static final void a(int var0, Object[] var1, boolean var2, Object[] var3) {
      ++j;
      if(1 != var0) {
         if(0 != var0) {
            if(var0 != 5) {
               if(6 != var0) {
                  if(2 != var0) {
                     if(3 == var0) {
                        ((int[])((int[])var3[1]))[4] = de.a((int)0, var1);
                     } else if(var0 == 4) {
                        ((int[])((int[])var3[1]))[7] = de.a((int)0, var1);
                     }
                  } else {
                     ((int[])((int[])var3[1]))[2] = de.a((int)0, var1);
                  }
               } else {
                  ((int[])((int[])var3[1]))[1] = de.a((int)0, var1);
               }
            } else {
               ((int[])((int[])var3[1]))[6] = de.a((int)0, var1);
            }
         } else {
            ((int[])((int[])var3[1]))[3] = de.a((int)0, var1);
         }
      } else {
         ((int[])((int[])var3[1]))[5] = de.a((int)0, var1);
      }

      if(var2) {
         ((boolean[])((boolean[])d[0]))[4] = true;
      }

   }

   static final boolean a(int var0, int var1, int var2) {
      ++a;
      if(var0 >= -75) {
         a((cga[])null, ((int[])((int[])d[11]))[7]);
      }

      return (var2 & '\uc580') != 0;
   }

   static final boolean a(int var0, Object[] var1) {
      if(var0 != 6860) {
         m = ((int[])((int[])var1[2]))[4];
      }

      ++f;
      return (((int[])((int[])var1[1]))[0] >> 22 & 1) != 0;
   }

   static final void a(cga[] var0, int var1) {
      ++c;
      lk.d = var0.length;
      sf.g = new cga[10 + lk.d];
      rj.c = new int[lk.d + 10];
      if(var1 >= 84) {
         System.arraycopy(var0, 0, sf.g, 0, lk.d);

         int var2;
         for(var2 = 0; lk.d > var2; ++var2) {
            rj.c[var2] = sf.g[var2].d();
         }

         for(var2 = lk.d; var2 < sf.g.length; ++var2) {
            rj.c[var2] = 12;
         }

      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      lna.h[rw.t++] = lw.a(var8, var4, var2, var2, var5, var8, var6, new Object[var3], false, var4, var7, var1, var6, var0, var0, var5);
      ++f_i;
   }

   static final Object[] a(Object[] var0, Object[] var1, int var2, Object[] var3, int var4) {
      var3[0] = sj.a(16, new Object[3], (byte)-107);
      ++k;
      var3[var2] = var1;
      jla.a((Object[])((Object[])var3[1]), (byte)-93, 30);
      return var3;
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, byte var3, Object[] var4, Object[] var5, Object[] var6) {
      dga.a((byte)-93, var5);
      ++g;
      if(var3 != 38) {
         return new Object[1];
      } else {
         var5[0] = var6;
         if(var5[0] != null) {
            int var7 = oh.a((Object[])((Object[])var5[0]), (byte)104) - 1;
            jla.a((Object[])((Object[])var5[0]), (byte)-119, var7);
         }

         ck.a(var3 ^ 125, var4, var2, 2);
         return var5;
      }
   }

   static final Object[] a(int var0, long var1, int var3) {
      ++e;
      if(var0 != 0) {
         h = 99;
      }

      fra var4;
      Object[] var7 = (var4 = (fra)pm.a((long)var3 << 56 | var1, jq.a, false)) == null?null:var4.z;
      if(var7 == null) {
         var7 = fqa.a(var1, (byte)112, new Object[3], var3);
         di.a(jq.a, true, (lm)(var7 == null?null:var7[1]), ((lm)(var7 == null?null:var7[1])).e);
      }

      return var7;
   }

}
