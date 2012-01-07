
final class si {

   static Object[] f;
   static int[] d = new int[6];
   static int e;
   static int g;
   static int c;
   static int a;
   static int b = -1;
   static int h;


   static final Object[] a(Object[] var0, int var1, Object[] var2, byte var3, Object[] var4) {
      var2[0] = sj.a(64, new Object[3], (byte)-41);
      ++c;
      var2[2] = var4;
      var2[1] = var0;
      if(var3 <= 90) {
         f = (Object[])null;
      }

      if(null != var2[1]) {
         jla.a((Object[])((Object[])var2[1]), (byte)127, 0);
      }

      if(var2[2] != null) {
         jla.a((Object[])((Object[])var2[2]), (byte)97, 0);
      }

      return var2;
   }

   static final void a(int var0) {
      int var1;
      for(var1 = 0; kga.j > var1; ++var1) {
         id.a[var1] = null;
      }

      ++a;
      kga.j = 0;

      int var2;
      int var3;
      Object[] var4;
      for(var1 = 0; var1 < ri.n; ++var1) {
         for(var2 = 0; var2 < eja.c; ++var2) {
            for(var3 = 0; me.c > var3; ++var3) {
               var4 = ju.g[var1][var3][var2];
               if(var4 != null) {
                  if(((short[])((short[])var4[1]))[1] > 0) {
                     ((short[])((short[])var4[1]))[1] = (short)(((short[])((short[])var4[1]))[1] * -1);
                  }

                  if(0 < ((short[])((short[])var4[1]))[0]) {
                     ((short[])((short[])var4[1]))[0] = (short)(((short[])((short[])var4[1]))[0] * -1);
                  }
               }
            }
         }
      }

      if(var0 > -10) {
         f[3] = f[7];
      }

      for(var1 = 0; var1 < ri.n; ++var1) {
         for(var2 = 0; eja.c > var2; ++var2) {
            for(var3 = 0; me.c > var3; ++var3) {
               var4 = ju.g[var1][var3][var2];
               if(null != var4) {
                  boolean var5 = ju.g[0][var3][var2] != null && ju.g[0][var3][var2][9] != null;
                  int var6;
                  int var7;
                  int var9;
                  Object[] var10;
                  int var11;
                  int var12;
                  int var13;
                  int var14;
                  int var15;
                  int var17;
                  int var16;
                  int var19;
                  int var18;
                  int var21;
                  int var20;
                  if(-1 < ~((short[])((short[])var4[1]))[0]) {
                     var6 = var2;
                     var7 = var2;
                     var9 = var1;
                     var10 = ju.g[var1][var3][-1 + var2];

                     for(var11 = bf.f_l[var1].b(-50, var2, var3); var6 > 0 && null != var10 && 0 > ((short[])((short[])var10[1]))[0] && ~((short[])((short[])var10[1]))[0] == ~((short[])((short[])var4[1]))[0] && ~((short[])((short[])var4[1]))[2] == ~((short[])((short[])var10[1]))[2] && var11 == bf.f_l[var1].b(-47, -1 + var6, var3) && (-1 + var6 <= 0 || var11 == bf.f_l[var1].b(-45, var6 - 2, var3)); var10 = ju.g[var1][var3][var6 - 1]) {
                        --var6;
                     }

                     for(var10 = ju.g[var1][var3][var2 + 1]; me.c > var7 && var10 != null && -1 < ~((short[])((short[])var10[1]))[0] && ~((short[])((short[])var4[1]))[0] == ~((short[])((short[])var10[1]))[0] && ((short[])((short[])var4[1]))[2] == ((short[])((short[])var10[1]))[2] && bf.f_l[var1].b(-53, 1 + var7, var3) == var11 && (1 + var7 >= me.c || var11 == bf.f_l[var1].b(-42, var7 + 2, var3)); var10 = ju.g[var1][var3][var7 + 1]) {
                        ++var7;
                     }

                     var12 = var1 - var1 + 1;
                     if(var4 != null && var4.length == 14 && var4[7].equals(Integer.valueOf(0)) && var4[7].equals(Boolean.valueOf(false))) {
                        wra.a(-13, -104, (byte)-107, 81, -1);
                     }

                     var13 = bf.f_l[!var5?var1:1 + var1].b(-73, var6, var3);
                     var14 = var13 + ((short[])((short[])var4[1]))[0] * var12;
                     var15 = bf.f_l[!var5?var1:var1 + 1].b(-81, var7 + 1, var3);
                     var16 = ((short[])((short[])var4[1]))[0] * var12 + var15;
                     var17 = var3 << qqa.e;
                     var18 = var6 << qqa.e;
                     var19 = (var7 << qqa.e) + iia.n;
                     id.a[kga.j++] = lw.a(var19, var13, var19, var18, ((short[])((short[])var4[1]))[2] + var17, var18, var15, new Object[8], false, var14, 1, var1, var16, var17 + ((short[])((short[])var4[1]))[2], var17 + ((short[])((short[])var4[1]))[2], var17 + ((short[])((short[])var4[1]))[2]);

                     for(var20 = var1; var9 >= var20; ++var20) {
                        if(var10 != null && (var10.length == 20 && var10[6].equals(Integer.valueOf(0)) || -5 == ~var10.length && var10[2].equals(Integer.valueOf(2)))) {
                           esa.a((ta)null, 70, -1);
                        }

                        for(var21 = var6; var7 >= var21; ++var21) {
                           ((short[])((short[])ju.g[var20][var3][var21][1]))[0] = (short)(((short[])((short[])ju.g[var20][var3][var21][1]))[0] * -1);
                        }
                     }
                  }

                  if(-1 < ~((short[])((short[])var4[1]))[1]) {
                     var6 = var3;
                     var7 = var3;
                     var9 = var1;
                     var10 = ju.g[var1][var3 - 1][var2];

                     for(var11 = bf.f_l[var1].b(-93, var2, var3); 0 < var6 && var10 != null && ((short[])((short[])var10[1]))[1] < 0 && ~((short[])((short[])var4[1]))[1] == ~((short[])((short[])var10[1]))[1] && ~((short[])((short[])var10[1]))[3] == ~((short[])((short[])var4[1]))[3] && var11 == bf.f_l[var1].b(-60, var2, var6 - 1) && (var6 - 1 <= 0 || bf.f_l[var1].b(-89, var2, var6 - 2) == var11); var10 = ju.g[var1][var6 - 1][var2]) {
                        --var6;
                     }

                     for(var10 = ju.g[var1][var3 + 1][var2]; eja.c > var7 && var10 != null && -1 < ~((short[])((short[])var10[1]))[1] && ~((short[])((short[])var4[1]))[1] == ~((short[])((short[])var10[1]))[1] && ~((short[])((short[])var4[1]))[3] == ~((short[])((short[])var10[1]))[3] && var11 == bf.f_l[var1].b(-45, var2, var7 + 1) && (1 + var7 >= eja.c || bf.f_l[var1].b(-106, var2, var7 + 2) == var11); var10 = ju.g[var1][1 + var7][var2]) {
                        ++var7;
                     }

                     var12 = 1 + var1 + -var1;
                     var13 = bf.f_l[var5?var1 + 1:var1].b(-87, var2, var6);
                     var14 = var13 + var12 * ((short[])((short[])var4[1]))[1];
                     var15 = bf.f_l[!var5?var1:1 + var1].b(-83, var2, var7 + 1);
                     var16 = var15 + var12 * ((short[])((short[])var4[1]))[1];
                     var17 = var6 << qqa.e;
                     var18 = (var7 << qqa.e) + iia.n;
                     if(var10 != null && (var10.length == 5 || var10.length == 1)) {
                        pt.a = (Object[][])null;
                     }

                     var19 = var2 << qqa.e;
                     id.a[kga.j++] = lw.a(((short[])((short[])var4[1]))[3] + var19, var13, var19 + ((short[])((short[])var4[1]))[3], ((short[])((short[])var4[1]))[3] + var19, var18, var19 + ((short[])((short[])var4[1]))[3], var15, new Object[8], false, var14, 2, var1, var16, var17, var17, var18);

                     for(var20 = var1; var9 >= var20; ++var20) {
                        if(null != var10 && (4 == var10.length || -4 == ~var10.length && var10[2].equals(Boolean.valueOf(false)) && var10[2].equals(Integer.valueOf(0)) || var10.length == 9)) {
                           ki.f_i = null;
                        }

                        for(var21 = var6; var7 >= var21; ++var21) {
                           ((short[])((short[])ju.g[var20][var21][var2][1]))[1] = (short)(((short[])((short[])ju.g[var20][var21][var2][1]))[1] * -1);
                        }
                     }
                  }
               }
            }
         }
      }

      tra.f = true;
   }

   static final void a(Object[] var0, int var1) {
      ++g;
      float[] var2 = (float[])((float[])var0[25]);
      Object[] var4 = (Object[])((Object[])var0[45]);
      float var3 = (((float[])((float[])var4[0]))[14] - ((float[])((float[])var4[0]))[15]) / (-((float[])((float[])var4[0]))[10] + ((float[])((float[])var4[0]))[11]);
      var2[5] = var3;
      if(var0 != null && -10 == ~var0.length) {
         dma.f = null;
      }

      float[] var5 = (float[])((float[])var0[25]);
      Object[] var7 = (Object[])((Object[])var0[45]);
      float var6 = -(((float[])((float[])var7[0]))[14] + ((float[])((float[])var7[0]))[15]) / (((float[])((float[])var7[0]))[10] + ((float[])((float[])var7[0]))[11]);
      var5[1] = var6;
      pea.a(17, var0);
      if(var1 != 7379) {
         c((Object[])null, -16);
      }

      if(((int[])((int[])var0[1]))[12] == 2) {
         vea.a((float[])((float[])((Object[])((Object[])var0[45]))[0]), var0, (byte)-103);
      } else if(((int[])((int[])var0[1]))[12] == 1) {
         vea.a((float[])((float[])((Object[])((Object[])var0[2]))[0]), var0, (byte)-103);
      }

   }

   static final String[] b(Object[] var0, int var1) {
      ++h;
      String[] var2 = new String[((int[])((int[])var0[1]))[0] + 1];
      if(var1 != 25) {
         c(new Object[0], ((int[])((int[])f[0]))[0]);
      }

      System.arraycopy(var0[0], 0, var2, 0, ((int[])((int[])var0[1]))[0] + 1);
      return var2;
   }

   static final String c(Object[] var0, int var1) {
      ++e;
      if(0 != ct.a(client.c(var0), 2)) {
         if(null != var0[60] && ((String)var0[60]).trim().length() != 0) {
            if(var1 > -82) {
               d = (int[])null;
            }

            return (String)var0[60];
         } else {
            return jp.j?"Hidden-use":null;
         }
      } else {
         return null;
      }
   }

}
