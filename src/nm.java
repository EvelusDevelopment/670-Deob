
final class nm {

   static int c;
   static int b;
   static int a;


   static final int a(long var0, boolean var2) {
      ew.a(var0, 9921);
      ++b;
      return !var2?45:ot.b.get(1);
   }

   static final byte[] a(boolean var0, byte[] var1) {
      ++c;
      if(var0) {
         a(-34L, false);
      }

      if(null != var1) {
         byte[] var2 = new byte[var1.length];
         System.arraycopy(var1, 0, var2, 0, var1.length);
         return var2;
      } else {
         return null;
      }
   }

   static final boolean a(int var0, byte var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Object[] var10) {
      ++a;
      int var11 = var9;
      int var12 = var5;
      int var13 = -119 % ((37 - var1) / 36);
      byte var14 = 64;
      byte var15 = 64;
      int var16 = -var14 + var9;
      int var17 = -var15 + var5;
      kda.c[var14][var15] = 99;
      woa.C[var14][var15] = 0;
      byte var18 = 0;
      qd.a[var18] = var9;
      int var19 = 0;
      byte var10001 = var18;
      int var26 = var18 + 1;
      oua.g[var10001] = var5;
      int[][] var20 = (int[][])((int[][])var10[0]);

      while(var26 != var19) {
         var11 = qd.a[var19];
         var12 = oua.g[var19];
         int var25 = -var16 + var11;
         int var21 = var11 - ((int[])((int[])var10[1]))[2];
         var19 = var19 + 1 & 4095;
         int var24 = -var17 + var12;
         int var22 = -((int[])((int[])var10[1]))[0] + var12;
         if(-2 != var6) {
            if(-1 != var6) {
               if(0 != var6 && var6 != 1 && 2 != var6 && var6 != 3 && var6 != 9) {
                  if(var6 == -3) {
                     if(ht.a(1, 77, var4, var8, var11, var12, var0, 1, var3)) {
                        cd.p = var11;
                        jea.j = var12;
                        return true;
                     }
                  } else if(var6 == -4) {
                     if(var11 == var4 && var12 == var3) {
                        cd.p = var11;
                        jea.j = var12;
                        return true;
                     }
                  } else if(dma.a(1, var11, var3, var4, var7, (byte)59, var10, var12, var6)) {
                     cd.p = var11;
                     jea.j = var12;
                     return true;
                  }
               } else if(pe.a(var4, var6, var10, var3, (byte)107, var7, var11, var12, 1)) {
                  jea.j = var12;
                  cd.p = var11;
                  return true;
               }
            } else if(rs.a(var12, var11, var2, var8, var4, 1, 1714392836, var3, var0, var10)) {
               cd.p = var11;
               jea.j = var12;
               return true;
            }
         } else if(tna.a(1, var10, var2, var12, var0, var3, var8, 1, var11, 19563, var4)) {
            jea.j = var12;
            cd.p = var11;
            return true;
         }

         int var23 = 1 + woa.C[var25][var24];
         if(var25 > 0 && 0 == kda.c[var25 - 1][var24] && 0 == (1109655552 & var20[-1 + var21][var22])) {
            qd.a[var26] = var11 - 1;
            oua.g[var26] = var12;
            kda.c[var25 - 1][var24] = 2;
            var26 = 4095 & 1 + var26;
            woa.C[-1 + var25][var24] = var23;
         }

         if(var25 < 127 && kda.c[var25 + 1][var24] == 0 && 0 == (var20[1 + var21][var22] & 1612972032)) {
            qd.a[var26] = var11 + 1;
            oua.g[var26] = var12;
            var26 = 4095 & var26 + 1;
            kda.c[var25 + 1][var24] = 8;
            woa.C[1 + var25][var24] = var23;
         }

         if(var24 > 0 && kda.c[var25][var24 - 1] == 0 && (var20[var21][var22 - 1] & 1084489728) == 0) {
            qd.a[var26] = var11;
            oua.g[var26] = -1 + var12;
            var26 = var26 + 1 & 4095;
            kda.c[var25][-1 + var24] = 1;
            woa.C[var25][var24 - 1] = var23;
         }

         if(var24 < 127 && kda.c[var25][1 + var24] == 0 && 0 == (1210318848 & var20[var21][1 + var22])) {
            qd.a[var26] = var11;
            oua.g[var26] = var12 + 1;
            var26 = var26 + 1 & 4095;
            kda.c[var25][var24 + 1] = 4;
            woa.C[var25][var24 + 1] = var23;
         }

         if(var25 > 0 && 0 < var24 && -1 == ~kda.c[-1 + var25][var24 - 1] && 0 == (1134821376 & var20[-1 + var21][-1 + var22]) && (1109655552 & var20[-1 + var21][var22]) == 0 && (1084489728 & var20[var21][var22 - 1]) == 0) {
            qd.a[var26] = var11 - 1;
            oua.g[var26] = var12 - 1;
            var26 = 4095 & var26 + 1;
            kda.c[-1 + var25][-1 + var24] = 3;
            woa.C[-1 + var25][-1 + var24] = var23;
         }

         if(var10 != null && var10.length == 9 && var10[3].equals(Boolean.valueOf(false))) {
            wta.a((int[])null, 87, -125, (int[])null, 107, (Object[])null, -1, -80, 98, -53, 66, -70, 61, false, -115);
         }

         if(var25 < 127 && var24 > 0 && 0 == kda.c[1 + var25][-1 + var24] && 0 == (var20[var21 + 1][-1 + var22] & 1625554944) && 0 == (var20[1 + var21][var22] & 1612972032) && -1 == ~(var20[var21][-1 + var22] & 1084489728)) {
            qd.a[var26] = 1 + var11;
            oua.g[var26] = -1 + var12;
            kda.c[1 + var25][var24 - 1] = 9;
            var26 = 1 + var26 & 4095;
            woa.C[1 + var25][var24 - 1] = var23;
         }

         if(0 < var25 && 127 > var24 && 0 == kda.c[var25 - 1][var24 + 1] && 0 == (1310982144 & var20[var21 - 1][var22 + 1]) && (var20[var21 - 1][var22] & 1109655552) == 0 && (1210318848 & var20[var21][var22 + 1]) == 0) {
            qd.a[var26] = -1 + var11;
            oua.g[var26] = var12 + 1;
            var26 = 1 + var26 & 4095;
            kda.c[-1 + var25][var24 + 1] = 6;
            woa.C[-1 + var25][1 + var24] = var23;
         }

         if(127 > var25 && var24 < 127 && kda.c[var25 + 1][var24 + 1] == 0 && (2015625216 & var20[var21 + 1][var22 + 1]) == 0 && (var20[1 + var21][var22] & 1612972032) == 0 && 0 == (1210318848 & var20[var21][var22 + 1])) {
            qd.a[var26] = 1 + var11;
            oua.g[var26] = 1 + var12;
            kda.c[var25 + 1][1 + var24] = 12;
            var26 = 4095 & var26 + 1;
            woa.C[var25 + 1][1 + var24] = var23;
         }
      }

      jea.j = var12;
      cd.p = var11;
      if(null != var10 && var10.length == 10) {
         woa.C = (int[][])null;
      }

      return false;
   }

}
