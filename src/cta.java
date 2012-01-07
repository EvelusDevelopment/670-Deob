
final class cta extends kp {

   static int u;
   static int s;
   private Object[] r;
   static int o;
   static int v = 0;
   static int t;
   static int q;
   static int n;
   static vp p;


   cta(Object[] var1) {
      this.r = var1;
   }

   final kp b() {
      ++o;
      Object[] var2 = this.r;
      mt var3;
      Object[] var4 = (var3 = (mt)dda.a((Object[])((Object[])var2[0]), 2)) != null?var3.n:null;
      kp var1;
      if(null == var4) {
         var1 = null;
      } else if(null == var4[0]) {
         var1 = ra.a(124, var2);
      } else {
         var1 = (kp)var4[0];
      }

      return var1;
   }

   final void a(int var1) {
      iba.a(var1, this.r, -96);
      ++u;
   }

   final int d() {
      ++q;
      byte var1 = 0;
      return var1;
   }

   static final void a(int var0, ta var1, Object[] var2, int var3, Object[] var4, int var5, byte var6, int var7) {
      ++t;
      if(var4 == null || 20 != var4.length) {
         for(int var8 = 0; ~var8 > ~((Object[])((Object[])var2[18])).length; ++var8) {
            byte var9 = 0;
            if(var8 != 0) {
               if(var8 != 1) {
                  if(var8 != 2) {
                     if(var8 == 3) {
                        var9 = 7;
                     }
                  } else {
                     var9 = 1;
                  }
               } else {
                  var9 = 5;
               }
            } else {
               var9 = 2;
            }

            Object[] var10 = ((Object[][])((Object[][])var2[18]))[var8];
            if(((int[])((int[])var10[1]))[1] != -1 && !tt.a((Object[])((Object[])var10[0]), var6 - 32)) {
               Object[] var11 = qda.a(((int[])((int[])var10[1]))[1], (byte)-64, dfa.a);
               boolean var12 = 3 == ((byte[])((byte[])var11[3]))[0] && (var0 != 0 || var7 != 0);
               int var13 = var5;
               if(!var12) {
                  if(0 != ((int[])((int[])var10[1]))[0]) {
                     var13 = var5 | 5;
                  }

                  if(0 != ((int[])((int[])var10[1]))[2]) {
                     var13 |= 2;
                  }

                  if(0 <= ((int[])((int[])var10[1]))[3]) {
                     var13 |= 7;
                  }
               } else {
                  var13 = var5 | 7;
               }

               ka var14 = ((ka[])((ka[])var2[29]))[1 + var8] = rha.a(var9, (Object[])((Object[])var10[0]), var13, 107, var11, var1);
               if(var14 != null) {
                  if(0 <= ((int[])((int[])var10[1]))[3] && null != var4[8] && ((int[][])((int[][])var4[8]))[((int[])((int[])var10[1]))[3]] != null) {
                     int var15 = 0;
                     int var16 = 0;
                     int var17 = 0;
                     if(var4[8] != null && null != ((int[][])((int[][])var4[8]))[((int[])((int[])var10[1]))[3]]) {
                        var17 += ((int[][])((int[][])var4[8]))[((int[])((int[])var10[1]))[3]][2];
                        var16 += ((int[][])((int[][])var4[8]))[((int[])((int[])var10[1]))[3]][1];
                        var15 += ((int[][])((int[][])var4[8]))[((int[])((int[])var10[1]))[3]][0];
                     }

                     if(null != var4[5] && ((int[][])((int[][])var4[5]))[((int[])((int[])var10[1]))[3]] != null) {
                        var16 += ((int[][])((int[][])var4[5]))[((int[])((int[])var10[1]))[3]][1];
                        var15 += ((int[][])((int[][])var4[5]))[((int[])((int[])var10[1]))[3]][0];
                        var17 += ((int[][])((int[][])var4[5]))[((int[])((int[])var10[1]))[3]][2];
                     }

                     if(var17 != 0 || 0 != var15) {
                        int var18 = var3;
                        if(null != var2[26] && -1 != ((int[])((int[])var2[26]))[((int[])((int[])var10[1]))[3]]) {
                           var18 = ((int[])((int[])var2[26]))[((int[])((int[])var10[1]))[3]];
                        }

                        int var19 = 16383 & -var3 + 2048 * ((int[])((int[])var10[1]))[0] + var18;
                        if(0 != var19) {
                           var14.O(var19);
                        }

                        int var20 = tda.p[var19];
                        int var21 = tda.k[var19];
                        int var22 = var17 * var20 + var21 * var15 >> 14;
                        var17 = var21 * var17 - var20 * var15 >> 14;
                        var15 = var22;
                     }

                     var14.K(var15, var16, var17);
                  } else if(((int[])((int[])var10[1]))[0] != 0) {
                     var14.O(((int[])((int[])var10[1]))[0] * 2048);
                  }

                  if(-1 != ~((int[])((int[])var10[1]))[2]) {
                     var14.K(0, -((int[])((int[])var10[1]))[2] << 2, 0);
                  }

                  if(var12) {
                     if(0 != ((int[])((int[])var2[12]))[11]) {
                        var14.UA(((int[])((int[])var2[12]))[11]);
                     }

                     if(((int[])((int[])var2[12]))[25] != 0) {
                        var14.fa(((int[])((int[])var2[12]))[25]);
                     }

                     if(((int[])((int[])var2[12]))[37] != 0) {
                        var14.K(0, ((int[])((int[])var2[12]))[37], 0);
                     }
                  }
               }
            } else {
               ((ka[])((ka[])var2[29]))[var8 + 1] = null;
            }
         }

         if(var6 != 32) {
            a(-21, (ta)null, (Object[])((Object[])var4[18]), -43, (Object[])((Object[])var2[1]), -1, (byte)-45, 74);
         }

      }
   }

   final kp a() {
      ++n;
      return ra.a(107, this.r);
   }

   final void b(int[] var1, int var2, int var3) {
      ++s;
      fsa.a(this.r, var1, var2, true, var3);
   }

}
