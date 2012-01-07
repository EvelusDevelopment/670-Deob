import jaggl.OpenGL;

final class rla {

   static int b;
   static int a;
   static int c;
   static int d;


   static final String a(boolean var0, String var1, String var2, String var3) {
      if(var0) {
         return (String)null;
      } else {
         ++c;

         for(int var4 = var3.indexOf(var2); -1 != var4; var4 = var3.indexOf(var2, var1.length() + var4)) {
            var3 = var3.substring(0, var4) + var1 + var3.substring(var4 + var2.length());
         }

         return var3;
      }
   }

   static final void b(Object[] var0, int var1) {
      ++a;
      if(var0 != null && var0.length == 87) {
         rd.a(var0, (int)-104);
      } else if(var1 == 6) {
         if(var0 != null && 91 == var0.length) {
            if(((boolean[])((boolean[])var0[63]))[15] && !((boolean[])((boolean[])var0[63]))[2]) {
               OpenGL.glEnable(2896);
            } else {
               OpenGL.glDisable(2896);
            }

         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final boolean a(int var0, int var1, int var2, Object[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      ++b;
      int var12 = var7;
      int var13 = var1;
      byte var14 = 64;
      byte var15 = 64;
      if(var2 != 121) {
         a(1, ((int[])((int[])var3[4]))[0], -92, (Object[])null, ((int[])((int[])var3[1]))[1], ((int[])((int[])var3[2]))[3], ((int[])((int[])var3[0]))[7], 74, ((int[])((int[])var3[1]))[9], 39, 36, 85);
      }

      int var16 = -var14 + var7;
      int var17 = -var15 + var1;
      kda.c[var14][var15] = 99;
      woa.C[var14][var15] = 0;
      if(var3 != null && var3.length == 1) {
         jea.j = 104;
      }

      byte var18 = 0;
      qd.a[var18] = var7;
      int var19 = 0;
      int var27 = var18 + 1;
      oua.g[var18] = var1;
      int[][] var20 = (int[][])((int[][])var3[0]);

      label359:
      while(var27 != var19) {
         var12 = qd.a[var19];
         var13 = oua.g[var19];
         var19 = 4095 & 1 + var19;
         int var26 = var12 - var16;
         int var25 = -var17 + var13;
         int var21 = var12 + -((int[])((int[])var3[1]))[2];
         int var22 = -((int[])((int[])var3[1]))[0] + var13;
         if(var5 != 0 && var5 != 1 && 2 != var5 && 3 != var5 && var5 != 9) {
            if(var5 != -3) {
               if(-2 == var5) {
                  if(tna.a(var0, var3, var6, var13, var10, var4, var9, var0, var12, 19563, var8)) {
                     jea.j = var13;
                     cd.p = var12;
                     return true;
                  }
               } else if(-1 == var5) {
                  if(rs.a(var13, var12, var6, var9, var8, var0, var2 ^ 1714392957, var4, var10, var3)) {
                     jea.j = var13;
                     cd.p = var12;
                     return true;
                  }
               } else if(-4 == var5) {
                  if(var12 == var8 && var4 == var13) {
                     cd.p = var12;
                     jea.j = var13;
                     return true;
                  }
               } else if(dma.a(var0, var12, var4, var8, var11, (byte)59, var3, var13, var5)) {
                  jea.j = var13;
                  cd.p = var12;
                  return true;
               }
            } else if(ht.a(var0, 98, var8, var9, var12, var13, var10, var0, var4)) {
               jea.j = var13;
               cd.p = var12;
               return true;
            }
         } else if(pe.a(var8, var5, var3, var4, (byte)-45, var11, var12, var13, var0)) {
            jea.j = var13;
            cd.p = var12;
            return true;
         }

         int var23 = woa.C[var26][var25] + 1;
         int var24;
         if(var26 > 0 && -1 == ~kda.c[var26 - 1][var25] && (var20[var21 - 1][var22] & 1134821376) == 0 && -1 == ~(var20[var21 - 1][var0 + (var22 - 1)] & 1310982144)) {
            var24 = 1;

            while(true) {
               if(var0 - 1 <= var24) {
                  qd.a[var27] = -1 + var12;
                  oua.g[var27] = var13;
                  if(null != var3 && (var3.length == 4 || -18 == ~var3.length || -19 == ~var3.length && var3[0].equals(Boolean.valueOf(false)))) {
                     a(-15, 118, 121, (Object[])null, -88, 107, 109, 106, 90, -118, -46, 38);
                  }

                  var27 = 1 + var27 & 4095;
                  kda.c[var26 - 1][var25] = 2;
                  woa.C[var26 - 1][var25] = var23;
                  break;
               }

               if(0 != (1336147968 & var20[-1 + var21][var22 + var24])) {
                  break;
               }

               ++var24;
            }
         }

         if(~var26 > ~(-var0 + 128)) {
            if(null != var3 && 20 == var3.length) {
               jea.j = -33;
            }

            if(kda.c[1 + var26][var25] == 0 && (1625554944 & var20[var21 + var0][var22]) == 0 && 0 == (var20[var21 + var0][var0 + var22 - 1] & 2015625216)) {
               var24 = 1;

               while(true) {
                  if(var24 >= var0 - 1) {
                     qd.a[var27] = var12 + 1;
                     oua.g[var27] = var13;
                     kda.c[var26 + 1][var25] = 8;
                     var27 = 4095 & 1 + var27;
                     woa.C[var26 + 1][var25] = var23;
                     break;
                  }

                  if((var20[var21 + var0][var24 + var22] & 2028208128) != 0) {
                     break;
                  }

                  ++var24;
               }
            }
         }

         if(var25 > 0 && -1 == ~kda.c[var26][var25 - 1] && (1134821376 & var20[var21][-1 + var22]) == 0 && (1625554944 & var20[var21 + var0 - 1][var22 - 1]) == 0) {
            var24 = 1;

            while(true) {
               if(-1 + var0 <= var24) {
                  qd.a[var27] = var12;
                  oua.g[var27] = -1 + var13;
                  kda.c[var26][-1 + var25] = 1;
                  var27 = 4095 & 1 + var27;
                  woa.C[var26][-1 + var25] = var23;
                  break;
               }

               if((1675886592 & var20[var24 + var21][-1 + var22]) != 0) {
                  break;
               }

               ++var24;
            }
         }

         if(~var25 > ~(-var0 + 128) && -1 == ~kda.c[var26][1 + var25] && 0 == (1310982144 & var20[var21][var0 + var22]) && -1 == ~(var20[-1 + var0 + var21][var22 + var0] & 2015625216)) {
            var24 = 1;

            while(true) {
               if(var24 >= var0 - 1) {
                  qd.a[var27] = var12;
                  oua.g[var27] = 1 + var13;
                  var27 = 4095 & 1 + var27;
                  if(null != var3 && var3.length == 14) {
                     wta.a((int[])null, 121, -117, (int[])null, -47, (Object[])null, -1, 58, -79, 1, 38, 93, 112, false, 59);
                  }

                  kda.c[var26][1 + var25] = 4;
                  woa.C[var26][var25 + 1] = var23;
                  break;
               }

               if((var20[var24 + var21][var0 + var22] & 2116288512) != 0) {
                  break;
               }

               ++var24;
            }
         }

         if(0 < var26 && var25 > 0 && -1 == ~kda.c[var26 - 1][-1 + var25] && -1 == ~(1134821376 & var20[var21 - 1][var22 - 1])) {
            var24 = 1;

            while(true) {
               if(var24 >= var0) {
                  qd.a[var27] = var12 - 1;
                  oua.g[var27] = -1 + var13;
                  var27 = 4095 & var27 + 1;
                  kda.c[-1 + var26][var25 - 1] = 3;
                  woa.C[var26 - 1][var25 - 1] = var23;
                  break;
               }

               if(0 != (var20[-1 + var21][-1 + var22 + var24] & 1336147968) || 0 != (1675886592 & var20[var24 + var21 - 1][-1 + var22])) {
                  break;
               }

               ++var24;
            }
         }

         if(var3 != null && -5 == ~var3.length) {
            a(104, -32, 121, (Object[])null, -104, -57, 63, -114, -22, 107, -128, -116);
         }

         if(128 - var0 > var26 && var25 > 0 && -1 == ~kda.c[1 + var26][var25 - 1]) {
            if(null != var3 && var3.length == 9 && var3[4].equals(Integer.valueOf(0)) && var3[4].equals(Boolean.valueOf(false))) {
               oua.g = null;
            }

            if(-1 == ~(var20[var21 + var0][-1 + var22] & 1625554944)) {
               var24 = 1;

               while(true) {
                  if(var24 >= var0) {
                     qd.a[var27] = 1 + var12;
                     oua.g[var27] = var13 - 1;
                     var27 = 1 + var27 & 4095;
                     kda.c[1 + var26][-1 + var25] = 9;
                     woa.C[1 + var26][var25 - 1] = var23;
                     break;
                  }

                  if(0 != (var20[var21 + var0][var24 - 1 + var22] & 2028208128) || -1 != ~(1675886592 & var20[var24 + var21][var22 - 1])) {
                     break;
                  }

                  ++var24;
               }
            }
         }

         if(var26 > 0 && 128 + -var0 > var25 && 0 == kda.c[var26 - 1][var25 + 1] && (var20[-1 + var21][var0 + var22] & 1310982144) == 0) {
            var24 = 1;

            while(true) {
               if(var0 <= var24) {
                  qd.a[var27] = -1 + var12;
                  oua.g[var27] = var13 + 1;
                  kda.c[-1 + var26][var25 + 1] = 6;
                  var27 = var27 + 1 & 4095;
                  woa.C[-1 + var26][1 + var25] = var23;
                  if(null != var3 && (-2 == ~var3.length || var3.length == 11 && var3[2].equals(Boolean.valueOf(false)))) {
                     qd.a = null;
                  }
                  break;
               }

               if((1336147968 & var20[var21 - 1][var24 + var22]) != 0 || (2116288512 & var20[-1 + var21 + var24][var0 + var22]) != 0) {
                  break;
               }

               ++var24;
            }
         }

         if(~var26 > ~(-var0 + 128) && -var0 + 128 > var25 && kda.c[1 + var26][var25 + 1] == 0 && (var20[var0 + var21][var0 + var22] & 2015625216) == 0) {
            for(var24 = 1; var24 < var0; ++var24) {
               if(-1 != ~(var20[var24 + var21][var22 + var0] & 2116288512) || (2028208128 & var20[var21 + var0][var22 + var24]) != 0) {
                  continue label359;
               }
            }

            if(null != var3 && (-6 == ~var3.length && var3[4].equals(Boolean.valueOf(false)) || var3.length == 14 && var3[6].equals(Boolean.valueOf(false)))) {
               nm.a(-31, (byte)-93, -128, -22, 67, 115, 21, 120, -40, 127, new Object[23][]);
            }

            qd.a[var27] = 1 + var12;
            oua.g[var27] = 1 + var13;
            var27 = 4095 & 1 + var27;
            kda.c[var26 + 1][var25 + 1] = 12;
            woa.C[var26 + 1][var25 + 1] = var23;
         }
      }

      jea.j = var13;
      cd.p = var12;
      return false;
   }

   static final void a(Object[] var0, int var1) {
      if(var1 == -14431) {
         ++d;
         if(~((long[])((long[])var0[4]))[0] != -1L) {
            el.a((Object[])((Object[])var0[0]), -125, ((long[])((long[])var0[4]))[0]);
            ((long[])((long[])var0[4]))[0] = 0L;
            ((int[])((int[])var0[1]))[0] = 0;
            ((int[])((int[])var0[1]))[1] = 0;
         }

      }
   }

}
