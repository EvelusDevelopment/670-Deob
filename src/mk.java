
final class mk {

   static int c;
   static int d;
   static int e;
   static int a;
   static int b;


   static final int a(Object[] var0, int var1) {
      if(var1 != 8836) {
         return ((int[])((int[])var0[0]))[4];
      } else {
         ++a;
         return ((int[])((int[])((Object[])((Object[])var0[14]))[1]))[3];
      }
   }

   static final void a(Object[] var0, boolean var1) {
      ++c;
      if(var1) {
         Object[] var5 = new Object[1];
         up var7 = new up(var5);
         var5[0] = var7;
         Object[] var2;
         var0[4] = null != (var2 = var5)?var2[0]:null;
      }
   }

   static final void a(int var0, Object[] var1) {
      ++d;
      synchronized(var1) {
         if(null != var1 && (4 == var1.length || var1.length == 17)) {
            kb.a(28, (Object[])null, (int[])null, (Object[])null, 20, var0 - 26500);
         }

         hka var3;
         hka var4;
         for(Object[] var6 = (var3 = (hka)qt.a(var0 ^ var0, (Object[])((Object[])var1[2]))) == null?null:var3.p; null != var6; var6 = null == (var4 = (hka)nda.a(1, (Object[])((Object[])var1[2])))?null:var4.p) {
            ((lm)(null == var6?null:var6[5])).a((byte)84);
         }

      }
   }

   static final int[] a(int var0, int var1, Object[] var2, int var3, ja var4, ta var5, Object[] var6, int var7, ta var8, int var9, boolean var10) {
      ++e;
      ii var11 = ii.a((Object[])((Object[])((Object[])((Object[])var2[7]))[7]), ((int[])((int[])var2[1]))[8], (int)0);
      if(var11 == null) {
         return null;
      } else {
         if(var11.a < 13) {
            var11.a(2);
         }

         int var12;
         if(var2[14] != null) {
            if(var2 != null && 5 == var2.length) {
               pn.a((Object[])null, (Object[])null, (Object[])null, 17);
            }

            for(var12 = 0; var12 < ((short[])((short[])var2[14])).length; ++var12) {
               if(var2[4] != null && var12 < ((byte[])((byte[])var2[4])).length) {
                  var11.b(((short[])((short[])var2[14]))[var12], la.b[((byte[])((byte[])var2[4]))[var12] & 255]);
               } else {
                  var11.b(((short[])((short[])var2[14]))[var12], ((short[])((short[])var2[0]))[var12]);
               }
            }
         }

         if(null != var2[5]) {
            if(null != var2 && -23 == ~var2.length) {
               la.b = null;
            }

            for(var12 = 0; ((short[])((short[])var2[5])).length > var12; ++var12) {
               var11.a(((short[])((short[])var2[5]))[var12], ((short[])((short[])var2[13]))[var12]);
            }
         }

         if(null != var6) {
            for(var12 = 0; var12 < 10; ++var12) {
               if(var2 != null && var2.length == 26 && var2[6].equals(Integer.valueOf(2)) && var2[6].equals(Boolean.valueOf(false))) {
                  uga.a((Object[])null, -21482, -101);
               }

               for(int var13 = 0; ~var13 > ~rsa.b[var12].length; ++var13) {
                  if(sfa.a[var12][var13].length > ((int[])((int[])var6[5]))[var12]) {
                     var11.b(rsa.b[var12][var13], sfa.a[var12][var13][((int[])((int[])var6[5]))[var12]]);
                  }
               }
            }

            if(var2 != null && var2.length == 3 && var2[1].equals(Integer.valueOf(0))) {
               la.b = null;
            }
         }

         var12 = 2048;
         boolean var26 = false;
         if(((int[])((int[])var2[1]))[30] != 128 || ((int[])((int[])var2[1]))[13] != 128 || ((int[])((int[])var2[1]))[47] != 128) {
            var12 |= 7;
            var26 = true;
         }

         ka var14 = var5.a(var11, var12, 64, ((int[])((int[])var2[1]))[7] + 64, 768 + ((int[])((int[])var2[1]))[27]);
         if(!var14.d()) {
            return null;
         } else {
            if(var26) {
               var14.v(((int[])((int[])var2[1]))[30], ((int[])((int[])var2[1]))[13], ((int[])((int[])var2[1]))[47]);
            }

            cga var15 = null;
            if(((int[])((int[])var2[1]))[35] == -1) {
               if(((int[])((int[])var2[1]))[4] != -1) {
                  var15 = uq.a(var5, var3 + 10503, ((int[])((int[])var2[1]))[48], false, 0, var0, var8, true, var6, var4, (Object[])((Object[])var2[7]), var1, var9);
                  if(null == var15) {
                     return null;
                  }
               } else if(0 != ~((int[])((int[])var2[1]))[45]) {
                  var15 = uq.a(var5, 1, ((int[])((int[])var2[1]))[11], false, 0, var0, var8, true, var6, var4, (Object[])((Object[])var2[7]), var1, var9);
                  if(null == var15) {
                     return null;
                  }
               }
            } else {
               var15 = uq.a(var5, var3 ^ -10501, ((int[])((int[])var2[1]))[29], true, 0, 10, var8, true, var6, var4, (Object[])((Object[])var2[7]), 0, 1);
               if(var15 == null) {
                  return null;
               }
            }

            int var16;
            if(!var10) {
               if(var9 != 2) {
                  var16 = ((int[])((int[])var2[1]))[17] << 2;
               } else {
                  var16 = (int)((double)((int[])((int[])var2[1]))[17] * 1.04D) << 2;
               }
            } else {
               var16 = (int)(1.5D * (double)((int[])((int[])var2[1]))[17]) << 2;
            }

            Object[] var17 = var5.h();
            Object[] var18 = var5.v();
            pq.a(512.0F, (float)var5.e(30626).d(), (float)var5.e(30626).e(), 16.0F, 16.0F, 512.0F, 2.14748365E9F, 50.0F, false, var18);
            var5.a(var18);
            Object[] var19 = im.a(new Object[2], (int)-16365);
            var5.d(var19);
            var5.ka(1.0F);
            var5.FA(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
            Object[] var20 = var5.k();
            jca.a((byte)-99, 0.0F, 1.0F, 0.0F, var20, mw.a(-((int[])((int[])var2[1]))[3] << 3, (byte)114));
            ha.a(0.0F, 1.0F, var20, 24515, mw.a(((int[])((int[])var2[1]))[25] << 3, (byte)109), 0.0F);
            cq.a((byte)81, (float)(((int[])((int[])var2[1]))[12] << 2), (float)((var16 * tda.p[((int[])((int[])var2[1]))[26] << 3] >> 14) - var14.pa() / 2 + (((int[])((int[])var2[1]))[6] << 2)), (float)((var16 * tda.k[((int[])((int[])var2[1]))[26] << 3] >> 14) + (((int[])((int[])var2[1]))[6] << 2)), var20);
            ha.a(0.0F, 0.0F, var20, 24515, mw.a(((int[])((int[])var2[1]))[26] << 3, (byte)119), 1.0F);
            var5.Z(2, 0);
            var5.a();
            var5.r(0, 0, 36, 32, 0, 0);
            var14.a(var20, (lpa)null, 1);
            var5.a(var17);
            int[] var21 = var5.Y(0, 0, 36, 32);
            if(var3 != -10502) {
               a(67, 104, (Object[])null, -72, (ja)var6[0], (ta)null, (Object[])((Object[])var6[0]), ((int[])((int[])var2[11]))[9], (ta)null, ((int[])((int[])var6[10]))[3], false);
            }

            if(1 <= var9) {
               var21 = up.a(var2, var21, var3 ^ 10559, -16777214);
               if(2 <= var9) {
                  var21 = up.a(var2, var21, 113, -1);
               }
            }

            if(0 != var1) {
               jna.a(var1, var3 ^ -14528, var2, var21);
            }

            var5.a(36, -7343, 0, var21, 32, 36).a(0, 0);
            if(-1 != ((int[])((int[])var2[1]))[35]) {
               var15.a(0, 0);
            } else if(((int[])((int[])var2[1]))[4] == -1) {
               if(((int[])((int[])var2[1]))[45] != -1) {
                  var15.a(0, 0);
               }
            } else {
               var15.a(0, 0);
            }

            if(var7 == 1 || 2 == var7 && (1 == ((int[])((int[])var2[1]))[15] || var0 != 1) && ~var0 != 0) {
               int var24 = ((int[])((int[])((Object[])((Object[])var2[7]))[1]))[1];
               String var23;
               if(100000 > var0) {
                  var23 = "<col=ffff00>" + var0 + "</col>";
               } else if(10000000 > var0) {
                  var23 = "<col=ffffff>" + var0 / 1000 + gj.a(var24, 101, gj.M) + "</col>";
               } else {
                  var23 = "<col=00ff80>" + var0 / 1000000 + gj.a(var24, -44, gj.e) + "</col>";
               }

               var4.a(57, -256, 9, var23, 0, -16777215);
            }

            var21 = var5.Y(0, 0, 36, 32);

            for(int var22 = 0; var22 < var21.length; ++var22) {
               if(-1 == ~(var21[var22] & 16777215)) {
                  var21[var22] = 0;
               } else {
                  var21[var22] |= -16777216;
               }
            }

            if(null != var18 && var18.length == 6) {
               uga.a((Object[])null, var3 - 10980, 42);
            }

            return var21;
         }
      }
   }

   static final void a(boolean var0, int var1, boolean var2, Object[] var3) {
      ++b;
      if(var1 == 3) {
         if(ev.a((int)4120, var3)) {
            if(var0) {
               ((Object[])((Object[])var3[3]))[8] = null;
               ((Object[])((Object[])var3[3]))[6] = null;
            }

            if(var2) {
               ((Object[])((Object[])var3[3]))[3] = null;
               ((Object[])((Object[])var3[3]))[4] = null;
            }

         }
      }
   }

}
