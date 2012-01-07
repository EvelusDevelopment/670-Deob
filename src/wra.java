
final class wra {

   static int b;
   static int c;
   static int f;
   static int a;
   static int h;
   static Object[] g = nb.a((byte)51, 512, new Object[5]);
   static int[] d;
   static int e;


   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      ++e;
      int var9 = var0 - var4;
      int var8 = var6 + var4;

      int var12;
      for(var12 = var6; var12 < var8; ++var12) {
         fka.a(var5, fda.c[var12], var3, var2, (byte)33);
      }

      int var10 = var2 + var4;

      for(var12 = var0; var12 > var9; --var12) {
         fka.a(var5, fda.c[var12], var3, var2, (byte)-67);
      }

      int var11 = -var4 + var3;
      var12 = var8;
      if(var1 != 0) {
         d = (int[])((int[])g[0]);
      }

      while(var9 >= var12) {
         int[] var13 = fda.c[var12];
         fka.a(var5, var13, var10, var2, (byte)29);
         fka.a(var7, var13, var11, var10, (byte)102);
         fka.a(var5, var13, var3, var11, (byte)96);
         ++var12;
      }

   }

   static final int a(byte var0, Object[] var1) {
      ++a;
      if(kea.c) {
         return 6;
      } else {
         int var2 = 106 % ((var0 + 88) / 35);
         if(var1 == null) {
            return 0;
         } else {
            int var3 = ((int[])((int[])var1[1]))[1];
            if(!wga.a(var3, (byte)71)) {
               if(qe.a(var3, 8)) {
                  return 2;
               } else if(!mka.a(-71, var3)) {
                  if(Class_m.a(var3, -106)) {
                     return 4;
                  } else {
                     boolean var4 = 4 == var3 || 23 == var3 || var3 == 20 || var3 == 15 || var3 == 49 || var3 == 57 || 53 == var3 || 60 == var3 || 13 == var3 || var3 == 5 || 44 == var3;
                     return var4?7:(var3 != 8?5:8);
                  }
               } else {
                  return 3;
               }
            } else {
               return 1;
            }
         }
      }
   }

   static final void a(int var0, int var1, byte var2, int var3, int var4) {
      ++f;
      if(var0 != 8 && 16 != var0) {
         Object[] var7 = ju.g[var4][var1][var3];
         if(null != var7) {
            if(1 == var0) {
               ((short[])((short[])var7[1]))[0] = 0;
            } else if(2 == var0) {
               ((short[])((short[])var7[1]))[1] = 0;
            }
         }

         si.a(-41);
      } else {
         for(int var5 = 0; var5 < caa.d; ++var5) {
            Object[] var6 = gj.O[var5];
            if(var0 == ((byte[])((byte[])var6[2]))[1] && var1 == ((short[])((short[])var6[1]))[2] && ~var3 == ~((short[])((short[])var6[1]))[0] || ((short[])((short[])var6[1]))[3] == var1 && ~var3 == ~((short[])((short[])var6[1]))[0]) {
               if(var5 != caa.d) {
                  System.arraycopy(gj.O, 1 + var5, gj.O, var5, gj.O.length - 1 - var5);
               }

               --caa.d;
               return;
            }
         }
      }

      if(var2 > -35) {
         g[14] = (Object)null;
      }

   }

   static final void a(int var0) {
      ++h;
      tia.a(lna.g, (long)kda.d, (byte)-36);
      if(~bqa.j != 0) {
         ur.a(bqa.j, true);
      }

      for(int var1 = 0; var1 < lw.c; ++var1) {
         uja.a[var1] = qma.d[var1];
         qma.d[var1] = false;
      }

      pt.d = kda.d;
      if(bqa.j != -1) {
         lw.c = 0;
         ela.a(false);
      }

      if(var0 < 10) {
         a(117, ((int[])((int[])g[1]))[3], ((byte[])((byte[])g[4]))[1], ((int[])((int[])g[1]))[6], 7);
      }

      lna.g.a();
      ta var3 = lna.g;
      if(kea.c) {
         rj.a((byte)101, var3);
      } else {
         pn.a(var3, (byte)115);
      }

      int var2 = jf.a((byte)81);
      if(-1 == var2) {
         var2 = jf.c;
      }

      if(-1 == var2) {
         var2 = InputStreamWorker.c;
      }

      jb.a(var2, (byte)-43);
      Class_ds.c = 0;
   }

   static final long a(Object[] var0, int var1) {
      if(var1 != 9076) {
         d = (int[])((int[])var0[1]);
      }

      ++c;
      if(var0 != null) {
         long var2 = ((long[])((long[])var0[2]))[0];
         return var2;
      } else {
         throw new IllegalStateException();
      }
   }

   static final int a(int var0, Object[] var1) {
      if(var0 > -79) {
         a(((int[])((int[])var1[7]))[13]);
      }

      ++b;
      return ((int[])((int[])var1[1]))[0];
   }

}
