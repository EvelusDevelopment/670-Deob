import jagdx.D3DDISPLAYMODE;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.fna;

final class oi {

   static int e;
   static Object[][] d;
   static int c;
   static int a;
   static boolean f = false;
   static int b;


   static final Object[] a(int[] var0, Object[] var1, int var2, byte var3, boolean var4) {
      ++e;
      oh var5;
      Object[] var7 = (var5 = (oh)pm.a((long)var2, lfa.c, false)) == null?null:var5.p;
      if(var7 != null) {
         lba.a(var4, 4, var7, ~((int[])((int[])var1[1]))[1] != ~((int[])((int[])var7[1]))[1]);
      }

      di.a(lfa.c, true, (lm)(null == var1?null:var1[0]), (long)var2);
      if(var3 != -99) {
         a((Object[])null, -20);
      }

      gsa.a(true, var0, ((int[])((int[])var1[1]))[1]);
      Object[] var8 = hg.a(var2, (byte)-113);
      if(null != var8) {
         vr.a(var8, (int)24);
      }

      if(null != gka.e) {
         vr.a(gka.e, (int)24);
         gka.e = null;
      }

      rra.a(1);
      if(null != var8) {
         rha.a(2, !var4, var8, hca.f[((int[])((int[])var8[1]))[3] >>> 16]);
      }

      if(!var4) {
         wl.a(((int[])((int[])var1[1]))[1], (byte)-105, var0);
      }

      if(!var4 && -1 != bqa.j) {
         su.a(1, bqa.j, false);
      }

      return var1;
   }

   static final void a(Object[] var0, int var1) {
      ++a;
      int var2 = -126 % ((-7 - var1) / 56);
      if(0 > ((int[])((int[])var0[1]))[0] && ((int[])((int[])var0[1]))[0] > 127) {
         int[] var3 = (int[])((int[])var0[1]);
         byte var4 = 127;
         var3[0] = var4;
      }

   }

   static final boolean a(int var0, D3DPRESENT_PARAMETERS var1, int var2, long var3, int var5, byte var6) {
      ++b;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;

      try {
         if(var6 != 11) {
            a((int[])null, (Object[])null, -68, (byte)-79, false);
         }

         D3DDISPLAYMODE var10 = new D3DDISPLAYMODE();
         if(fna.a(false, IDirect3D.GetAdapterDisplayMode(var3, var5, var10))) {
            return false;
         } else {
            label81:
            for(; var2 >= 0; --var2) {
               if(1 != var2) {
                  var9 = var2 + 0;

                  for(int var11 = 0; sf.a.length > var11; ++var11) {
                     if(IDirect3D.CheckDeviceType(var3, var5, var0, var10.Format, sf.a[var11], true) == 0 && -1 == ~IDirect3D.CheckDeviceFormat(var3, var5, var0, var10.Format, 1, 1, sf.a[var11]) && (var2 == 0 || -1 == ~IDirect3D.CheckDeviceMultiSampleType(var3, var5, var0, sf.a[var11], true, var9))) {
                        for(int var12 = 0; var12 < nr.f_i.length; ++var12) {
                           if(0 == IDirect3D.CheckDeviceFormat(var3, var5, var0, var10.Format, 2, 1, nr.f_i[var12]) && -1 == ~IDirect3D.CheckDepthStencilMatch(var3, var5, var0, var10.Format, sf.a[var11], nr.f_i[var12]) && (0 == var2 || 0 == IDirect3D.CheckDeviceMultiSampleType(var3, var5, var0, nr.f_i[var11], true, var9))) {
                              var7 = nr.f_i[var12];
                              var8 = sf.a[var11];
                              break label81;
                           }
                        }
                     }
                  }
               }
            }

            if(var2 >= 0 && var8 != 0 && var7 != 0) {
               var1.AutoDepthStencilFormat = var7;
               var1.BackBufferFormat = var8;
               var1.MultiSampleType = var9;
               var1.MultiSampleQuality = 0;
               return true;
            } else {
               return false;
            }
         }
      } catch (Throwable var13) {
         return false;
      }
   }

   static final int[][] a(boolean var0, int var1, Object[] var2) {
      if(var0) {
         d = (Object[][])((Object[][])null);
      }

      ++c;
      int[][] var3 = loa.a((byte)-52, var1, (Object[])((Object[])var2[4]));
      if(((boolean[])((boolean[])((Object[])((Object[])var2[4]))[0]))[0]) {
         int[][] var4 = bsa.a(0, (byte)17, var1, var2);
         int[] var5 = var4[0];
         int[] var6 = var4[1];
         int[] var7 = var4[2];
         int[] var8 = var3[0];
         int[] var9 = var3[1];
         if(var2 != null && var2.length == 1) {
            return (int[][])null;
         }

         int[] var10 = var3[2];

         for(int var11 = 0; fo.b > var11; ++var11) {
            int var13 = var5[var11];
            int var12 = var13 - ((int[])((int[])var2[10]))[0];
            if(0 > var12) {
               var12 = -var12;
            }

            if(((int[])((int[])var2[1]))[4] >= var12) {
               int var14 = var6[var11];
               var12 = -((int[])((int[])var2[10]))[1] + var14;
               if(var12 < 0) {
                  var12 = -var12;
               }

               if(var12 <= ((int[])((int[])var2[1]))[4]) {
                  int var15 = var7[var11];
                  var12 = -((int[])((int[])var2[10]))[2] + var15;
                  if(var12 < 0) {
                     var12 = -var12;
                  }

                  if(~var12 < ~((int[])((int[])var2[1]))[4]) {
                     var8[var11] = var13;
                     var9[var11] = var14;
                     var10[var11] = var15;
                  } else {
                     var8[var11] = var13 * ((int[])((int[])var2[1]))[5] >> 12;
                     var9[var11] = ((int[])((int[])var2[1]))[2] * var14 >> 12;
                     var10[var11] = var15 * ((int[])((int[])var2[1]))[3] >> 12;
                     if(null != var2 && -3 == ~var2.length) {
                        return (int[][])null;
                     }
                  }
               } else {
                  var8[var11] = var13;
                  var9[var11] = var14;
                  var10[var11] = var7[var11];
               }
            } else {
               var8[var11] = var13;
               var9[var11] = var6[var11];
               var10[var11] = var7[var11];
            }
         }
      }

      return var3;
   }

}
