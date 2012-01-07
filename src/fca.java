
final class fca {

   static int d;
   static int e;
   static Object[] g = tia.a(0, 0, new Object[2], (byte)-113);
   static int c;
   static String b;
   static int a;
   static Object[] f;


   static final Object[] a(Object[] var0, byte[] var1, byte var2) {
      ++e;
      OutputStreamWorker.newIAS1I1Wrapper(var0);
      var0[5] = dra.a(var2 ^ -56, var0);
      var0[4] = new byte[128];
      var0[0] = new Object[128][];
      var0[8] = new hb[128];
      var0[6] = new byte[128];
      var0[3] = new short[128];
      var0[7] = new int[128];
      var0[2] = new byte[128];
      Object[] var3 = jta.a((byte)-82, var1, new Object[3]);

      int var4;
      for(var4 = 0; ((byte[])((byte[])var3[2]))[var4 + ((int[])((int[])var3[1]))[0]] != 0; ++var4) {
         ;
      }

      byte[] var5 = new byte[var4];

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         var5[var6] = ipa.a(var3, (int)-76);
      }

      ++((int[])((int[])var3[1]))[0];
      ++var4;
      var6 = ((int[])((int[])var3[1]))[0];
      ((int[])((int[])var3[1]))[0] += var4;

      int var7;
      for(var7 = 0; 0 != ((byte[])((byte[])var3[2]))[((int[])((int[])var3[1]))[0] + var7]; ++var7) {
         ;
      }

      byte[] var8 = new byte[var7];

      int var9;
      for(var9 = 0; var7 > var9; ++var9) {
         var8[var9] = ipa.a(var3, var2 ^ 28);
      }

      ++var7;
      ++((int[])((int[])var3[1]))[0];
      var9 = ((int[])((int[])var3[1]))[0];
      ((int[])((int[])var3[1]))[0] += var7;

      int var10;
      for(var10 = 0; ((byte[])((byte[])var3[2]))[((int[])((int[])var3[1]))[0] + var10] != 0; ++var10) {
         ;
      }

      byte[] var11 = new byte[var10];

      for(int var12 = 0; var12 < var10; ++var12) {
         var11[var12] = ipa.a(var3, var2 + 20);
      }

      ++var10;
      ++((int[])((int[])var3[1]))[0];
      byte[] var37 = new byte[var10];
      int var13;
      int var15;
      if(1 >= var10) {
         var13 = var10;
      } else {
         var37[1] = 1;
         var13 = 2;
         int var14 = 1;

         for(var15 = 2; var10 > var15; ++var15) {
            int var16 = fh.a(var3, false);
            if(var16 != 0) {
               if(var14 >= var16) {
                  --var16;
               }

               var14 = var16;
            } else {
               var14 = var13++;
            }

            var37[var15] = (byte)var14;
         }
      }

      Object[][] var38 = new Object[var13][];

      int var21;
      for(var15 = 0; var38.length > var15; ++var15) {
         Object[] var19 = new Object[3];
         if(var19[1] == null) {
            var19[1] = new int[7];
         }

         Object[] var20 = var38[var15] = var19;
         var21 = fh.a(var3, false);
         if(0 < var21) {
            var20[2] = new byte[var21 * 2];
         }

         var21 = fh.a(var3, false);
         if(var21 > 0) {
            var20[0] = new byte[var21 * 2 + 2];
            ((byte[])((byte[])var20[0]))[1] = 64;
         }

         if(var0 != null && -8 == ~var0.length) {
            fp.a(var2 + 166, (Object[])null, (byte[])null, (int[])null, (Object[])null);
         }
      }

      var15 = fh.a(var3, false);
      byte[] var41 = var15 <= 0?null:new byte[2 * var15];
      var15 = fh.a(var3, false);
      byte[] var17 = 0 >= var15?null:new byte[2 * var15];

      int var18;
      for(var18 = 0; 0 != ((byte[])((byte[])var3[2]))[((int[])((int[])var3[1]))[0] + var18]; ++var18) {
         ;
      }

      byte[] var42 = new byte[var18];

      int var43;
      for(var43 = 0; var43 < var18; ++var43) {
         var42[var43] = ipa.a(var3, (int)-100);
      }

      if(var2 != -118) {
         a(-16, ((int[])((int[])((Object[])((Object[])g[2]))[3]))[0]);
      }

      ++((int[])((int[])var3[1]))[0];
      ++var18;
      var43 = 0;

      for(var21 = 0; 128 > var21; ++var21) {
         var43 += fh.a(var3, false);
         ((short[])((short[])var0[3]))[var21] = (short)var43;
      }

      var43 = 0;

      for(var21 = 0; 128 > var21; ++var21) {
         var43 += fh.a(var3, false);
         ((short[])((short[])var0[3]))[var21] = (short)(((short[])((short[])var0[3]))[var21] + (var43 << 8));
      }

      var21 = 0;
      int var22 = 0;
      int var23 = 0;

      int var24;
      for(var24 = 0; 128 > var24; ++var24) {
         if(var21 == 0) {
            if(~var22 <= ~var42.length) {
               var21 = -1;
            } else {
               var21 = var42[var22++];
            }

            var23 = nj.a(var3, true);
         }

         ((short[])((short[])var0[3]))[var24] = (short)(((short[])((short[])var0[3]))[var24] + ((-1 + var23 & 2) << 14));
         ((int[])((int[])var0[7]))[var24] = var23;
         --var21;
      }

      var21 = 0;
      var22 = 0;
      var24 = 0;

      int var25;
      for(var25 = 0; 128 > var25; ++var25) {
         if(0 != ((int[])((int[])var0[7]))[var25]) {
            if(0 == var21) {
               var24 = ((byte[])((byte[])var3[2]))[var6++] - 1;
               if(var5.length > var22) {
                  var21 = var5[var22++];
               } else {
                  var21 = -1;
               }
            }

            ((byte[])((byte[])var0[2]))[var25] = (byte)var24;
            --var21;
         }
      }

      var22 = 0;
      var21 = 0;
      var25 = 0;

      for(int var26 = 0; 128 > var26; ++var26) {
         if(((int[])((int[])var0[7]))[var26] != 0) {
            if(var21 == 0) {
               var25 = ((byte[])((byte[])var3[2]))[var9++] + 16 << 2;
               if(var8.length > var22) {
                  var21 = var8[var22++];
               } else {
                  var21 = -1;
               }
            }

            --var21;
            ((byte[])((byte[])var0[4]))[var26] = (byte)var25;
         }
      }

      var22 = 0;
      if(var0 != null && var0.length == 12) {
         dra.a(112, (Object[])null);
      }

      var21 = 0;
      Object[] var44 = null;

      int var27;
      for(var27 = 0; 128 > var27; ++var27) {
         if(-1 != ~((int[])((int[])var0[7]))[var27]) {
            if(var21 == 0) {
               var44 = var38[var37[var22]];
               if(var22 < var11.length) {
                  var21 = var11[var22++];
               } else {
                  var21 = -1;
               }
            }

            ((Object[][])((Object[][])var0[0]))[var27] = var44;
            --var21;
         }
      }

      var22 = 0;
      var21 = 0;
      var27 = 0;

      int var28;
      for(var28 = 0; var28 < 128; ++var28) {
         if(0 == var21) {
            if(var22 < var42.length) {
               var21 = var42[var22++];
            } else {
               var21 = -1;
            }

            if(0 < ((int[])((int[])var0[7]))[var28]) {
               var27 = fh.a(var3, false) + 1;
            }
         }

         ((byte[])((byte[])var0[6]))[var28] = (byte)var27;
         --var21;
      }

      ((int[])((int[])var0[1]))[0] = 1 + fh.a(var3, false);

      Object[] var29;
      int var30;
      for(var28 = 0; var28 < var13; ++var28) {
         var29 = var38[var28];
         if(var29[2] != null) {
            for(var30 = 1; ~var30 > ~((byte[])((byte[])var29[2])).length; var30 += 2) {
               ((byte[])((byte[])var29[2]))[var30] = ipa.a(var3, (int)-119);
            }
         }

         if(null != var29[0]) {
            for(var30 = 3; -2 + ((byte[])((byte[])var29[0])).length > var30; var30 += 2) {
               ((byte[])((byte[])var29[0]))[var30] = ipa.a(var3, (int)-122);
            }

            if(var3 != null && var3.length == 20 && var3[14].equals(Integer.valueOf(1))) {
               return null;
            }
         }
      }

      if(var41 != null) {
         for(var28 = 1; var28 < var41.length; var28 += 2) {
            var41[var28] = ipa.a(var3, (int)-123);
         }

         if(null != var3 && var3.length == 1) {
            return null;
         }
      }

      if(var17 != null) {
         for(var28 = 1; ~var28 > ~var17.length; var28 += 2) {
            var17[var28] = ipa.a(var3, var2 + 13);
         }
      }

      for(var28 = 0; var13 > var28; ++var28) {
         var29 = var38[var28];
         if(var29[0] != null) {
            var43 = 0;
            if(var29 != null && var29.length == 1) {
               return null;
            }

            for(var30 = 2; ((byte[])((byte[])var29[0])).length > var30; var30 += 2) {
               var43 = 1 + var43 + fh.a(var3, false);
               ((byte[])((byte[])var29[0]))[var30] = (byte)var43;
            }
         }
      }

      for(var28 = 0; var28 < var13; ++var28) {
         var29 = var38[var28];
         if(null != var29[2]) {
            var43 = 0;

            for(var30 = 2; ~var30 > ~((byte[])((byte[])var29[2])).length; var30 += 2) {
               var43 = fh.a(var3, false) + 1 + var43;
               ((byte[])((byte[])var29[2]))[var30] = (byte)var43;
            }
         }
      }

      byte var31;
      int var34;
      int var35;
      int var33;
      int var46;
      byte var49;
      if(var41 != null) {
         var43 = fh.a(var3, false);
         var41[0] = (byte)var43;

         for(var28 = 2; var41.length > var28; var28 += 2) {
            var43 = fh.a(var3, false) + var43 + 1;
            var41[var28] = (byte)var43;
         }

         if(var44 != null && (var44.length == 1 || var44.length == 1 && var44[0].equals(Boolean.valueOf(false)))) {
            return null;
         }

         var49 = var41[0];
         byte var47 = var41[1];

         for(var30 = 0; var30 < var49; ++var30) {
            ((byte[])((byte[])var0[6]))[var30] = (byte)(var47 * ((byte[])((byte[])var0[6]))[var30] + 32 >> 6);
         }

         for(var30 = 2; var30 < var41.length; var49 = var31) {
            var31 = var41[var30];
            byte var32 = var41[1 + var30];
            var33 = (var31 + -var49) / 2 + var47 * (-var49 + var31);

            for(var34 = var49; var34 < var31; ++var34) {
               var35 = pq.a(var33, var31 + -var49, 89);
               var33 += var32 + -var47;
               ((byte[])((byte[])var0[6]))[var34] = (byte)(32 + ((byte[])((byte[])var0[6]))[var34] * var35 >> 6);
            }

            if(null != var3 && (17 == var3.length || var3.length == 1 && var3[0].equals(Integer.valueOf(1)) && var3[0].equals(Integer.valueOf(0)))) {
               return null;
            }

            var30 += 2;
            var47 = var32;
         }

         for(var46 = var49; var46 < 128; ++var46) {
            ((byte[])((byte[])var0[6]))[var46] = (byte)(var47 * ((byte[])((byte[])var0[6]))[var46] + 32 >> 6);
         }

         Object var40 = null;
      }

      if(var17 != null) {
         var43 = fh.a(var3, false);
         var17[0] = (byte)var43;

         for(var28 = 2; ~var28 > ~var17.length; var28 += 2) {
            var43 = 1 + var43 + fh.a(var3, false);
            var17[var28] = (byte)var43;
         }

         var49 = var17[0];
         int var45 = var17[1] << 1;
         if(null != var44 && (var44.length == 6 || 10 == var44.length && var44[7].equals(Integer.valueOf(0)))) {
            return null;
         }

         for(var30 = 0; var49 > var30; ++var30) {
            var46 = (((byte[])((byte[])var0[4]))[var30] & 255) + var45;
            if(0 > var46) {
               var46 = 0;
            }

            if(var46 > 128) {
               var46 = 128;
            }

            ((byte[])((byte[])var0[4]))[var30] = (byte)var46;
         }

         int var48;
         for(var30 = 2; ~var30 > ~var17.length; var45 = var48) {
            var31 = var17[var30];
            var48 = var17[var30 + 1] << 1;
            var33 = var45 * (var31 + -var49) + (-var49 + var31) / 2;

            for(var34 = var49; var34 < var31; ++var34) {
               var35 = pq.a(var33, var31 - var49, 80);
               int var36 = var35 + (255 & ((byte[])((byte[])var0[4]))[var34]);
               if(0 > var36) {
                  var36 = 0;
               }

               if(var36 > 128) {
                  var36 = 128;
               }

               ((byte[])((byte[])var0[4]))[var34] = (byte)var36;
               var33 += -var45 + var48;
            }

            var49 = var31;
            if(null != var3 && -8 == ~var3.length) {
               return null;
            }

            var30 += 2;
         }

         Object var39 = null;

         for(var46 = var49; 128 > var46; ++var46) {
            var48 = (((byte[])((byte[])var0[4]))[var46] & 255) + var45;
            if(0 > var48) {
               var48 = 0;
            }

            if(128 < var48) {
               var48 = 128;
            }

            ((byte[])((byte[])var0[4]))[var46] = (byte)var48;
         }
      }

      for(var28 = 0; var13 > var28; ++var28) {
         ((int[])((int[])var38[var28][1]))[2] = fh.a(var3, false);
      }

      for(var28 = 0; var28 < var13; ++var28) {
         var29 = var38[var28];
         if(null != var29[2]) {
            ((int[])((int[])var29[1]))[3] = fh.a(var3, false);
         }

         if(var29[0] != null) {
            ((int[])((int[])var29[1]))[5] = fh.a(var3, false);
         }

         if(-1 > ~((int[])((int[])var29[1]))[2]) {
            ((int[])((int[])var29[1]))[4] = fh.a(var3, false);
         }
      }

      for(var28 = 0; var28 < var13; ++var28) {
         ((int[])((int[])var38[var28][1]))[6] = fh.a(var3, false);
      }

      for(var28 = 0; var28 < var13; ++var28) {
         var29 = var38[var28];
         if(-1 > ~((int[])((int[])var29[1]))[6]) {
            ((int[])((int[])var29[1]))[0] = fh.a(var3, false);
         }
      }

      for(var28 = 0; var13 > var28; ++var28) {
         var29 = var38[var28];
         if(((int[])((int[])var29[1]))[0] > 0) {
            ((int[])((int[])var29[1]))[1] = fh.a(var3, false);
         }
      }

      return var0;
   }

   static final Object[] a(int var0, int var1) {
      try {
         ++a;
         coa var2;
         Object[] var4 = null != (var2 = (coa)uh.a(dqa.b, (long)var1, (byte)87))?var2.D:null;
         if(var4 != null) {
            return var4;
         } else {
            byte[] var5 = qn.a(var1, 0, ht.a, 66);
            if(var0 > -56) {
               return (Object[])null;
            } else if(var5 != null && -2 > ~var5.length) {
               try {
                  var4 = hd.a((byte)95, var5);
               } catch (Exception var7) {
                  throw new RuntimeException(var7.getMessage() + " " + var1);
               }

               hj.a(dqa.b, 0, (tha)(var4 == null?null:var4[8]), (long)var1);
               return var4;
            } else {
               return null;
            }
         }
      } catch (RuntimeException var8) {
         throw vt.a(var8, "fca.B(" + var0 + ',' + var1 + ')');
      }
   }

   static final Object[] a(int var0, Object[] var1) {
      int var2 = 114 / ((var0 - 35) / 39);
      ++c;
      return (Object[])((Object[])var1[28]);
   }

   static final void a(Object[] var0, int var1, int var2) {
      try {
         ++d;
         lu.c = 0;
         if(var2 < 95) {
            a(108, (Object[])null);
         }

         int var3 = 0;
         aqa.b(var0, -22852);

         int var4;
         int var5;
         int var6;
         for(var4 = 0; var4 < ofa.b; ++var4) {
            var5 = ot.a[var4];
            if((1 & pua.a[var5]) == 0) {
               if(0 >= var3) {
                  var6 = tg.a(var0, 8553, 1);
                  if(var6 != 0) {
                     ota.a(var0, -103, var5);
                  } else {
                     var3 = ipa.b(var0, (byte)124);
                     pua.a[var5] = (byte)(pua.a[var5] | 2);
                  }
               } else {
                  --var3;
                  pua.a[var5] = (byte)(pua.a[var5] | 2);
               }
            }
         }

         ki.a(1, var0);
         if(var3 != 0) {
            throw new RuntimeException();
         } else {
            aqa.b(var0, -22852);

            for(var4 = 0; ofa.b > var4; ++var4) {
               var5 = ot.a[var4];
               if(-1 != ~(pua.a[var5] & 1)) {
                  if(0 < var3) {
                     pua.a[var5] = (byte)(pua.a[var5] | 2);
                     --var3;
                  } else {
                     var6 = tg.a(var0, 8553, 1);
                     if(0 == var6) {
                        var3 = ipa.b(var0, (byte)124);
                        pua.a[var5] = (byte)(pua.a[var5] | 2);
                     } else {
                        ota.a(var0, -115, var5);
                     }
                  }
               }
            }

            ki.a(1, var0);
            if(var3 != 0) {
               throw new RuntimeException();
            } else {
               aqa.b(var0, -22852);

               for(var4 = 0; var4 < ca.a; ++var4) {
                  var5 = cj.g[var4];
                  if(-1 != ~(1 & pua.a[var5])) {
                     if(0 < var3) {
                        pua.a[var5] = (byte)(pua.a[var5] | 2);
                        --var3;
                     } else {
                        var6 = tg.a(var0, 8553, 1);
                        if(0 != var6) {
                           if(pca.a(var5, (byte)-124, var0)) {
                              pua.a[var5] = (byte)(pua.a[var5] | 2);
                           }
                        } else {
                           var3 = ipa.b(var0, (byte)124);
                           pua.a[var5] = (byte)(pua.a[var5] | 2);
                        }
                     }
                  }
               }

               ki.a(1, var0);
               if(0 != var3) {
                  throw new RuntimeException();
               } else {
                  aqa.b(var0, -22852);

                  for(var4 = 0; ca.a > var4; ++var4) {
                     var5 = cj.g[var4];
                     if((1 & pua.a[var5]) == 0) {
                        if(var3 > 0) {
                           pua.a[var5] = (byte)(pua.a[var5] | 2);
                           --var3;
                        } else {
                           var6 = tg.a(var0, 8553, 1);
                           if(0 == var6) {
                              var3 = ipa.b(var0, (byte)124);
                              pua.a[var5] = (byte)(pua.a[var5] | 2);
                           } else if(pca.a(var5, (byte)-108, var0)) {
                              pua.a[var5] = (byte)(pua.a[var5] | 2);
                           }
                        }
                     }
                  }

                  ki.a(1, var0);
                  if(0 != var3) {
                     throw new RuntimeException();
                  } else {
                     if(var0 != null && var0.length == 9) {
                        uja.h = (Object[][])null;
                     }

                     ca.a = 0;
                     ofa.b = 0;

                     Object[] var17;
                     for(var4 = 1; var4 < 2048; ++var4) {
                        pua.a[var4] = (byte)(pua.a[var4] >> 1);
                        var17 = vo.E[var4];
                        if(null == var17) {
                           cj.g[ca.a++] = var4;
                        } else {
                           ot.a[ofa.b++] = var4;
                        }
                     }

                     for(var3 = 0; lu.c > var3; ++var3) {
                        var4 = bi.f[var3];
                        var17 = vo.E[var4];
                        var6 = fh.a(var0, false);
                        if((128 & var6) != 0) {
                           var6 += fh.a(var0, false) << 8;
                        }

                        if((512 & var6) != 0) {
                           var6 += fh.a(var0, false) << 16;
                        }

                        byte var7 = -1;
                        int var8;
                        int var9;
                        int var10;
                        int var11;
                        int var12;
                        int var13;
                        if(0 != (1 & var6)) {
                           var8 = cp.a((byte)60, var0);
                           if(var8 > 0) {
                              for(var9 = 0; var8 > var9; ++var9) {
                                 var11 = -1;
                                 var12 = -1;
                                 var13 = -1;
                                 var10 = tga.a((int)1, var0);
                                 if(var10 != 32767) {
                                    if(32766 != var10) {
                                       var12 = tga.a((int)1, var0);
                                    } else {
                                       var10 = -1;
                                    }
                                 } else {
                                    var10 = tga.a((int)1, var0);
                                    var12 = tga.a((int)1, var0);
                                    var11 = tga.a((int)1, var0);
                                    var13 = tga.a((int)1, var0);
                                 }

                                 int var14 = tga.a((int)1, var0);
                                 int var15 = cp.a((byte)60, var0);
                                 waa.a(var13, (byte)-117, var10, var15, kda.d, var17, var14, var12, var11);
                              }

                              if(null != var17 && (-3 == ~var17.length || 3 == var17.length)) {
                                 ota.a((Object[])null, -108, -124);
                              }
                           }
                        }

                        if(0 != (var6 & 16)) {
                           if(var0 != null && var0.length == 7 && var0[3].equals(Integer.valueOf(0))) {
                              ipa.b(new Object[4][], (byte)124);
                           }

                           int[] var18 = new int[4];

                           for(var9 = 0; var9 < 4; ++var9) {
                              var18[var9] = fma.c(-17126, var0);
                           }

                           var9 = id.a(var0, -77);
                           aj.a(var17, var18, var9, -128, false);
                        }

                        if(0 != (var6 & 131072)) {
                           ((boolean[])((boolean[])var17[8]))[10] = -2 == ~fh.a(var0, false);
                        }

                        if(-1 != ~(4096 & var6)) {
                           ((int[])((int[])var17[12]))[38] = ipa.a(var0, (int)-94);
                           ((int[])((int[])var17[12]))[3] = mua.b(3, var0);
                           ((int[])((int[])var17[12]))[26] = pga.a(false, var0);
                           ((int[])((int[])var17[12]))[36] = mua.b(3, var0);
                           ((int[])((int[])var17[12]))[29] = de.a((int)0, var0) + kda.d;
                           ((int[])((int[])var17[12]))[35] = de.a((int)0, var0) + kda.d;
                           ((int[])((int[])var17[12]))[5] = fh.a(var0, false);
                           ((int[])((int[])var17[12]))[20] = 0;
                           if(((boolean[])((boolean[])var17[8]))[11]) {
                              ((int[])((int[])var17[12]))[26] += ((int[])((int[])var17[12]))[57];
                              ((int[])((int[])var17[12]))[3] += ((int[])((int[])var17[12]))[48];
                              ((int[])((int[])var17[12]))[18] = 0;
                              ((int[])((int[])var17[12]))[38] += ((int[])((int[])var17[12]))[57];
                              ((int[])((int[])var17[12]))[36] += ((int[])((int[])var17[12]))[48];
                           } else {
                              ((int[])((int[])var17[12]))[18] = 1;
                              ((int[])((int[])var17[12]))[36] += ((int[])((int[])var17[14]))[0];
                              ((int[])((int[])var17[12]))[38] += ((int[])((int[])var17[33]))[0];
                              ((int[])((int[])var17[12]))[26] += ((int[])((int[])var17[33]))[0];
                              ((int[])((int[])var17[12]))[3] += ((int[])((int[])var17[14]))[0];
                           }
                        }

                        int[] var19;
                        int[] var20;
                        if(-1 != ~(var6 & 524288)) {
                           var8 = fh.a(var0, false);
                           if(var17 != null && var17.length == 8 && var17[1].equals(Integer.valueOf(0)) && var17[1].equals(Integer.valueOf(2))) {
                              a((Object[])null, -68, 110);
                           }

                           var20 = new int[var8];
                           var19 = new int[var8];

                           for(var11 = 0; var11 < var8; ++var11) {
                              var12 = de.a((int)0, var0);
                              if('\uc000' == (var12 & '\uc000')) {
                                 var13 = nqa.a(123, var0);
                                 var20[var11] = var13 | var12 << 16;
                              } else {
                                 var20[var11] = var12;
                              }

                              var19[var11] = lga.a(var0, 75);
                           }

                           uh.a(var19, true, var20, var17);
                        }

                        if(0 != (var6 & 256)) {
                           var8 = jta.b(var0, (byte)102);
                           ((int[])((int[])var17[12]))[39] = fh.a(var0, false);
                           ((int[])((int[])var17[12]))[4] = fh.a(var0, false);
                           ((int[])((int[])var17[12]))[9] = var8 & 32767;
                           ((boolean[])((boolean[])var17[8]))[9] = ('\u8000' & var8) != 0;
                           ((int[])((int[])var17[12]))[19] = ((int[])((int[])var17[12]))[9] + kda.d + ((int[])((int[])var17[12]))[39];
                        }

                        if((8192 & var6) != 0) {
                           ((boolean[])((boolean[])var17[8]))[14] = cp.a((byte)60, var0) == 1;
                        }

                        if((4 & var6) != 0) {
                           ((int[])((int[])var17[12]))[52] = jta.b(var0, (byte)124);
                           if(-1 == ~((int[])((int[])var17[12]))[18]) {
                              wsa.a(var17, (byte)113, ((int[])((int[])var17[12]))[52]);
                              ((int[])((int[])var17[12]))[52] = -1;
                           }
                        }

                        boolean var25;
                        if(-1 != ~(var6 & '\u8000')) {
                           var8 = de.a((int)0, var0);
                           var9 = lr.a(1, var0);
                           if('\uffff' == var8) {
                              var8 = -1;
                           }

                           var10 = cp.a((byte)60, var0);
                           var11 = 7 & var10;
                           var12 = (var10 & 120) >> 3;
                           if(var12 == 15) {
                              var12 = -1;
                           }

                           var25 = (var10 & 215) >> 7 == 1;
                           qv.a(var9, var11, var25, var12, -84, var8, 1, var17);
                        }

                        if(-1 != ~(2 & var6)) {
                           var8 = nqa.a(117, var0);
                           if(var8 == '\uffff') {
                              var8 = -1;
                           }

                           ((int[])((int[])var17[12]))[14] = var8;
                        }

                        if((2097152 & var6) != 0) {
                           var8 = jta.b(var0, (byte)112);
                           var9 = bga.b(var0, 28556);
                           if('\uffff' == var8) {
                              var8 = -1;
                           }

                           var10 = cp.a((byte)60, var0);
                           var11 = 7 & var10;
                           var12 = (120 & var10) >> 3;
                           if(var12 == 15) {
                              var12 = -1;
                           }

                           var25 = -2 == ~((var10 & 190) >> 7);
                           qv.a(var9, var11, var25, var12, -118, var8, 3, var17);
                        }

                        if(-1 != ~(1024 & var6)) {
                           String var21 = ara.b((byte)61, var0);
                           if(var21.charAt(0) == 126) {
                              var21 = var21.substring(1);
                              jl.a((String)var17[39], 2, 8191, tk.a(106, var17, false), tn.a(var17, true, (byte)55), 0, var21);
                           } else if(var17 == uta.g) {
                              jl.a((String)var17[39], 2, 8191, tk.a(90, var17, false), tn.a(var17, true, (byte)55), 0, var21);
                           }

                           cb.a(1, var21, var17, tw.a((byte)12) * ((int[])((int[])fk.j[1]))[2], 0, 0);
                        }

                        if(0 != (var6 & 16384)) {
                           var8 = cp.a((byte)60, var0);
                           var20 = new int[var8];
                           var19 = new int[var8];
                           int[] var24 = new int[var8];

                           for(var12 = 0; var12 < var8; ++var12) {
                              var20[var12] = fma.c(-17126, var0);
                              var19[var12] = ro.a(var0, -76);
                              var24[var12] = nqa.a(-35, var0);
                           }

                           ora.a(var24, var20, var19, var17, 18784);
                        }

                        if((32 & var6) != 0) {
                           wua.c[var4] = rea.a(var0, 59);
                        }

                        if(-1 != ~(var6 & 4194304)) {
                           ao.a(8785, (Object[])((Object[])var17[38]));
                           byte[] var10001 = (byte[])((byte[])var0[2]);
                           int[] var10002 = (int[])((int[])var0[1]);
                           int var10005 = ((int[])((int[])var0[1]))[0];
                           var10002[0] = ((int[])((int[])var0[1]))[0] + 1;
                           var8 = 255 & var10001[var10005];

                           for(var9 = 0; var8 > var9; ++var9) {
                              var10 = jta.b(var0, (byte)115);
                              var11 = kqa.a(var0, true);
                              kha.a(var10, var11, 31439, (Object[])((Object[])var17[38]));
                           }

                           if(null != var0 && 13 == var0.length) {
                              lu.c = 35;
                           }
                        }

                        if((var6 & 8) != 0) {
                           var8 = fh.a(var0, false);
                           byte[] var22 = new byte[var8];
                           Object[] var23 = jta.a((byte)-121, var22, new Object[3]);
                           oga.a(0, var0, 2, var22, var8);
                           jga.g[var4] = var23;
                           kw.b(-125, var17, var23);
                        }

                        if(0 != (262144 & var6)) {
                           var8 = nqa.a(127, var0);
                           var9 = lr.a(1, var0);
                           if(var8 == '\uffff') {
                              var8 = -1;
                           }

                           var10 = ro.a(var0, -74);
                           var11 = var10 & 7;
                           var12 = (var10 & 127) >> 3;
                           if(15 == var12) {
                              var12 = -1;
                           }

                           var25 = 1 == (var10 & 230) >> 7;
                           qv.a(var9, var11, var25, var12, -71, var8, 2, var17);
                        }

                        if((var6 & 65536) != 0) {
                           if(var0 != null && (var0.length == 2 || -2 == ~var0.length || 19 == var0.length && var0[14].equals(Integer.valueOf(2)) && var0[14].equals(Boolean.valueOf(false)))) {
                              lu.c = 9;
                           }

                           byte[] var10000 = (byte[])((byte[])var0[2]);
                           int[] var27 = (int[])((int[])var0[1]);
                           int var10004 = ((int[])((int[])var0[1]))[0];
                           var27[0] = ((int[])((int[])var0[1]))[0] + 1;
                           var8 = var10000[var10004] & 255;

                           for(var9 = 0; var8 > var9; ++var9) {
                              var10 = nqa.a(-13, var0);
                              var11 = kqa.a(var0, true);
                              kha.a(var10, var11, 31439, (Object[])((Object[])var17[38]));
                           }
                        }

                        if((64 & var6) != 0) {
                           var8 = de.a((int)0, var0);
                           if('\uffff' == var8) {
                              var8 = -1;
                           }

                           var9 = lr.a(1, var0);
                           var10 = fh.a(var0, false);
                           var11 = var10 & 7;
                           var12 = 15 & var10 >> 3;
                           if(15 == var12) {
                              var12 = -1;
                           }

                           var25 = (1 & var10 >> 7) == 1;
                           qv.a(var9, var11, var25, var12, -109, var8, 0, var17);
                        }

                        if((1048576 & var6) != 0) {
                           ((byte[])((byte[])var17[10]))[5] = pga.a(false, var0);
                           ((byte[])((byte[])var17[10]))[4] = rea.a(var0, 104);
                           ((byte[])((byte[])var17[10]))[3] = mua.b(3, var0);
                           ((byte[])((byte[])var17[10]))[7] = (byte)id.a(var0, 121);
                           ((int[])((int[])var17[12]))[17] = kda.d + lga.a(var0, 93);
                           ((int[])((int[])var17[12]))[24] = kda.d + jta.b(var0, (byte)122);
                        }

                        if((var6 & 2048) != 0) {
                           var7 = mua.b(3, var0);
                        }

                        if(((boolean[])((boolean[])var17[8]))[11]) {
                           if(var7 != 127) {
                              byte var26;
                              if(-1 != var7) {
                                 var26 = var7;
                              } else {
                                 var26 = wua.c[var4];
                              }

                              tm.a((byte)-95, var26, var17);
                              una.a(var17, ((int[])((int[])var17[12]))[57], var26, ((int[])((int[])var17[12]))[48], (byte)83);
                           } else {
                              ul.a(0, ((int[])((int[])var17[12]))[48], var17, ((int[])((int[])var17[12]))[57]);
                           }
                        }
                     }

                     if(var0 != null && var0.length == 2) {
                        a((Object[])null, 31, 121);
                     }

                     if(((int[])((int[])var0[1]))[0] != var1) {
                        throw new RuntimeException(((int[])((int[])var0[1]))[0] + " " + var1);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var16) {
         throw vt.a(var16, "fca.A(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + var2 + ')');
      }
   }

}
