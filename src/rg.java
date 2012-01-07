import jaggl.OpenGL;

final class rg {

   static int c;
   static int f;
   static int h;
   static int a;
   static int d;
   static int g;
   static int e;
   static int b;


   static final ppa a(Object[] var0, int var1) {
      ++g;
      if(var1 < 55) {
         ((boolean[])((boolean[])var0[0]))[0] = false;
      }

      return new ppa(var0);
   }

   static final void a(Object[] var0, boolean var1, Object[] var2, int var3) {
      ++d;
      hca.a(0, (Object[])((Object[])var2[17]), var2, 0);
      if(var1) {
         ws.a(121, (Object[])((Object[])var2[23]), var2);
         woa.a(var3, var0, (byte)109, var2, 0);
      }
   }

   static final void a(float var0, Object[] var1, int var2) {
      ++b;
      if(((float[])((float[])var1[var2]))[17] != var0) {
         ((float[])((float[])var1[0]))[17] = var0;
         eg.a((byte)-95, var1);
         ql.a(var1, 0);
      }

   }

   static final void a(ta var0, Object[] var1, boolean var2, aa var3, aa var4) {
      ++a;
      if(var1 != null && -2 == ~var1.length && var1[0].equals(Integer.valueOf(2))) {
         vk.a = true;
      }

      if(var2) {
         if(null == kma.f || kma.f.length != ((int[])((int[])var1[1]))[2]) {
            rw.w = new int[((int[])((int[])var1[1]))[2]];
            wea.f_l = new int[((int[])((int[])var1[1]))[2]];
            nha.c = new int[((int[])((int[])var1[1]))[2]];
            msa.a = new int[((int[])((int[])var1[1]))[2]];
            kma.f = new int[((int[])((int[])var1[1]))[2]];
         }

         int[][] var5 = new int[((int[])((int[])var1[1]))[0]][((int[])((int[])var1[1]))[2]];

         int var6;
         for(var6 = 0; ((int[])((int[])var1[1]))[1] > var6; ++var6) {
            int var7;
            for(var7 = 0; ((int[])((int[])var1[1]))[2] > var7; ++var7) {
               kma.f[var7] = 0;
               rw.w[var7] = 0;
               nha.c[var7] = 0;
               msa.a[var7] = 0;
               wea.f_l[var7] = 0;
            }

            int var10;
            int var14;
            int var15;
            int var46;
            for(var7 = -5; ((int[])((int[])var1[1]))[0] > var7; ++var7) {
               int var8;
               int var9;
               for(var8 = 0; ((int[])((int[])var1[1]))[2] > var8; ++var8) {
                  var9 = 5 + var7;
                  if(var9 < ((int[])((int[])var1[1]))[0]) {
                     var10 = 255 & ((byte[][][])((byte[][][])var1[11]))[var6][var9][var8];
                     if(0 < var10) {
                        Object[] var11 = cw.a(-117, -1 + var10, (Object[])((Object[])var1[9]));
                        kma.f[var8] += ((int[])((int[])var11[1]))[0];
                        rw.w[var8] += ((int[])((int[])var11[1]))[1];
                        nha.c[var8] += ((int[])((int[])var11[1]))[3];
                        msa.a[var8] += ((int[])((int[])var11[1]))[6];
                        ++wea.f_l[var8];
                     }
                  }

                  var10 = -5 + var7;
                  if(var10 >= 0) {
                     var46 = ((byte[][][])((byte[][][])var1[11]))[var6][var10][var8] & 255;
                     if(var46 > 0) {
                        Object[] var12 = cw.a(109, -1 + var46, (Object[])((Object[])var1[9]));
                        kma.f[var8] -= ((int[])((int[])var12[1]))[0];
                        rw.w[var8] -= ((int[])((int[])var12[1]))[1];
                        nha.c[var8] -= ((int[])((int[])var12[1]))[3];
                        msa.a[var8] -= ((int[])((int[])var12[1]))[6];
                        --wea.f_l[var8];
                     }
                  }
               }

               if(var1 != null && 1 == var1.length) {
                  jta.a(21978, (Object[])null);
               }

               if(var7 >= 0) {
                  var8 = 0;
                  var9 = 0;
                  var10 = 0;
                  var46 = 0;
                  int var48 = 0;

                  for(int var13 = -5; ~var13 > ~((int[])((int[])var1[1]))[2]; ++var13) {
                     var14 = var13 + 5;
                     if(((int[])((int[])var1[1]))[2] > var14) {
                        var46 += msa.a[var14];
                        var10 += nha.c[var14];
                        var8 += kma.f[var14];
                        var9 += rw.w[var14];
                        var48 += wea.f_l[var14];
                     }

                     var15 = -5 + var13;
                     if(var15 >= 0) {
                        var46 -= msa.a[var15];
                        var8 -= kma.f[var15];
                        var48 -= wea.f_l[var15];
                        var10 -= nha.c[var15];
                        var9 -= rw.w[var15];
                     }

                     if(var13 >= 0 && 0 < var46 && 0 < var48) {
                        var5[var7][var13] = kpa.a(var9 / var48, -65, var10 / var48, 256 * var8 / var46);
                     }
                  }
               }
            }

            if(!gl.d) {
               aa var44 = jp.o[var6];
               aa var47 = var6 == 0?var4:null;
               aa var45 = 0 == var6?var3:null;

               for(var10 = 0; var10 < ((int[])((int[])var1[1]))[0]; ++var10) {
                  if(null != var1 && var1.length == 2) {
                     mra.a(12, 23, (byte)44);
                  }

                  for(var46 = 0; ((int[])((int[])var1[1]))[2] > var46; ++var46) {
                     if(~hd.g == 0 || tsa.a(hd.g, var46, true, var10, var6)) {
                        byte var50 = ((byte[][][])((byte[][][])var1[6]))[var6][var10][var46];
                        byte var49 = ((byte[][][])((byte[][][])var1[10]))[var6][var10][var46];
                        var14 = 255 & ((byte[][][])((byte[][][])var1[5]))[var6][var10][var46];
                        var15 = ((byte[][][])((byte[][][])var1[11]))[var6][var10][var46] & 255;
                        Object[] var16 = var14 == 0?null:tp.a((Object[])((Object[])var1[0]), -1 + var14, (int)7);
                        Object[] var17 = 0 == var15?null:cw.a(111, -1 + var15, (Object[])((Object[])var1[9]));
                        if(0 == var50 && null == var16) {
                           var50 = 12;
                        }

                        Object[] var18 = var16;
                        if(null != var16 && ((int[])((int[])var16[1]))[2] == -1 && -1 == ((int[])((int[])var16[1]))[5]) {
                           var18 = var16;
                           var16 = null;
                        }

                        if(null != var16 || var17 != null) {
                           int var19 = kqa.f[var50];
                           int var20 = ln.c[var50];
                           int var21 = (null == var16?0:var20) + (null == var17?0:var19);
                           int var22 = 0;
                           int var23 = 0;
                           int var24 = null == var16?-1:((int[])((int[])var16[1]))[6];
                           int var25 = var17 != null?((int[])((int[])var17[1]))[2]:-1;
                           int[] var26 = new int[var21];
                           int[] var27 = new int[var21];
                           int[] var28 = new int[var21];
                           int[] var29 = new int[var21];
                           int[] var30 = new int[var21];
                           int[] var31 = new int[var21];
                           int[] var32 = var16 != null && 0 != ~((int[])((int[])var16[1]))[5]?new int[var21]:null;
                           int var33;
                           if(null == var16) {
                              var23 += var20;
                           } else {
                              for(var33 = 0; var20 > var33; ++var33) {
                                 var26[var22] = uha.a[var50][var23];
                                 var27[var22] = Class_f.k[var50][var23];
                                 var28[var22] = hv.f[var50][var23];
                                 var30[var22] = var24;
                                 var31[var22] = ((int[])((int[])var16[1]))[8];
                                 var29[var22] = ((int[])((int[])var16[1]))[2];
                                 if(var32 != null) {
                                    var32[var22] = ((int[])((int[])var16[1]))[5];
                                 }

                                 ++var23;
                                 ++var22;
                              }

                              if(!((boolean[])((boolean[])var1[3]))[0] && 0 == var6) {
                                 pma.a(var10, var46, ((int[])((int[])var16[1]))[1], ((int[])((int[])var16[1]))[4] * 8, ((int[])((int[])var16[1]))[11], ((int[])((int[])var16[1]))[9], ((int[])((int[])var16[1]))[7], ((int[])((int[])var16[1]))[10]);
                              }

                              if(var17 != null && -12 == ~var17.length) {
                                 mra.a(123, 83, (byte)-116);
                              }
                           }

                           if(var17 != null) {
                              if(null != var17 && (11 == var17.length && var17[4].equals(Integer.valueOf(1)) || var17.length == 3)) {
                                 a((ta)null, (Object[])null, true, (aa)null, (aa)null);
                              }

                              for(var33 = 0; var33 < var19; ++var33) {
                                 var26[var22] = uha.a[var50][var23];
                                 var27[var22] = Class_f.k[var50][var23];
                                 var28[var22] = hv.f[var50][var23];
                                 var30[var22] = var25;
                                 var31[var22] = ((int[])((int[])var17[1]))[4];
                                 var29[var22] = var5[var10][var46];
                                 if(var32 != null) {
                                    var32[var22] = var29[var22];
                                 }

                                 ++var22;
                                 ++var23;
                              }
                           }

                           var33 = ((int[])((int[])var1[12])).length;
                           int[] var34 = new int[var33];
                           int[] var35 = new int[var33];
                           int[] var36 = var45 == null?null:new int[var33];
                           int[] var37 = null == var45 && null == var47?null:new int[var33];

                           int var38;
                           int var39;
                           int var40;
                           int var41;
                           for(var38 = 0; var38 < var33; ++var38) {
                              var39 = ((int[])((int[])var1[12]))[var38];
                              var40 = ((int[])((int[])var1[7]))[var38];
                              if(0 == var49) {
                                 var34[var38] = var39;
                                 var35[var38] = var40;
                              } else if(1 == var49) {
                                 var34[var38] = var40;
                                 var35[var38] = -var39 + 512;
                              } else if(2 != var49) {
                                 if(3 == var49) {
                                    var34[var38] = -var40 + 512;
                                    var35[var38] = var39;
                                 }
                              } else {
                                 var34[var38] = 512 + -var39;
                                 var35[var38] = -var40 + 512;
                              }

                              int var42;
                              if(var36 != null && hw.d[var50][var38]) {
                                 var41 = (var10 << 9) + var34[var38];
                                 var42 = var35[var38] + (var46 << 9);
                                 var36[var38] = var45.a(1, var41, var42) + -var44.a(1, var41, var42);
                              }

                              if(var37 != null) {
                                 if(var45 != null && !hw.d[var50][var38]) {
                                    var41 = (var10 << 9) + var34[var38];
                                    var42 = var35[var38] + (var46 << 9);
                                    var37[var38] = var44.a(1, var41, var42) - var45.a(1, var41, var42);
                                 } else if(null != var47 && !cva.k[var50][var38]) {
                                    var41 = var34[var38] + (var10 << 9);
                                    var42 = var35[var38] + (var46 << 9);
                                    var37[var38] = var47.a(1, var41, var42) - var44.a(1, var41, var42);
                                 }
                              }
                           }

                           var38 = var44.b(-69, var46, var10);
                           var39 = var44.b(-60, var46, 1 + var10);
                           var40 = var44.b(-58, var46 + 1, var10 + 1);
                           var41 = var44.b(-108, var46 + 1, var10);
                           boolean var51 = fr.a(var46, var10, (byte)51);
                           if(var51 && 1 < var6 || !var51 && var6 > 0) {
                              boolean var43 = true;
                              if(var17 != null && !((boolean[])((boolean[])var17[0]))[0]) {
                                 var43 = false;
                              } else if(var15 == 0 && 0 != var50) {
                                 var43 = false;
                              } else if(var14 > 0 && null != var18 && !((boolean[])((boolean[])var18[2]))[0]) {
                                 var43 = false;
                              }

                              if(var43 && var39 == var38 && var40 == var38 && var38 == var41) {
                                 ((byte[][][])((byte[][][])var1[8]))[var6][var10][var46] = (byte)(((byte[][][])((byte[][][])var1[8]))[var6][var10][var46] | 4);
                              }
                           }

                           Object[] var52 = gea.a(-17513, new Object[1]);
                           if(((boolean[])((boolean[])var1[3]))[0]) {
                              ((int[])((int[])var52[0]))[1] = jp.a(var10, var46);
                              ((int[])((int[])var52[0]))[5] = nn.a(var10, var46);
                              ((int[])((int[])var52[0]))[0] = jba.a(var10, var46);
                              ((int[])((int[])var52[0]))[6] = kta.a(var10, var46);
                              ((int[])((int[])var52[0]))[4] = Class_d.a(var10, var46);
                              ((int[])((int[])var52[0]))[2] = rta.a(var10, var46);
                           }

                           var44.a(var10, var46, var34, var36, var35, var37, var26, var27, var28, var29, var32, var30, var31, var52, false);
                           ooa.b(var6, var10, var46);
                        }
                     }
                  }
               }

               if(null != var1 && -2 == ~var1.length && var1[0].equals(Integer.valueOf(0))) {
                  pv.a(55, 7921, (Object[])null, (int[][])null);
               }
            } else {
               rf.a(jp.o[var6], var5, var6 == 0?var3:null, var0, var6 != 0?null:var4, var6, 9, var1);
            }

            ((byte[][][])((byte[][][])var1[11]))[var6] = (byte[][])null;
            ((byte[][][])((byte[][][])var1[5]))[var6] = (byte[][])null;
            ((byte[][][])((byte[][][])var1[6]))[var6] = (byte[][])null;
            ((byte[][][])((byte[][][])var1[10]))[var6] = (byte[][])null;
         }

         if(!((boolean[])((boolean[])var1[3]))[0]) {
            if(0 != nua.e) {
               oua.a();
            }

            if(nra.d) {
               hd.a();
            }
         }

         for(var6 = 0; ~var6 > ~((int[])((int[])var1[1]))[1]; ++var6) {
            jp.o[var6].l();
         }

      }
   }

   static final int a(int var0, int var1, Object[] var2) {
      ++c;
      if(var0 != 1) {
         ((int[])((int[])var2[19]))[2] = -46;
      }

      if(null != var2 && 3 == var2.length) {
         return ok.a(false, var2, var1);
      } else if(var2 != null && 0 == var2.length) {
         return Class_n.a(90, var2, var1);
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(float var0, int var1, Object[] var2, Object[] var3) {
      if(var1 != 22362) {
         a((ta)null, (Object[])((Object[])var3[0]), ((boolean[])((boolean[])((Object[])((Object[])var2[0]))[0]))[3], (aa)var2[7], (aa)var2[5]);
      }

      vo.a(((float[])((float[])var3[1]))[2], ((float[])((float[])var3[1]))[1], var2, ((float[])((float[])var3[1]))[0], var0, (byte)7);
      ++h;
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      if(var1[58] != var0) {
         if(((boolean[])((boolean[])var1[17]))[15]) {
            OpenGL.glBindBufferARB('\u8893', uga.b((byte)-86, var0));
         }

         var1[58] = var0;
      }

      ++f;
      if(var2 != 58) {
         a(113, -103, (Object[])null);
      }

   }

   static final short[] a(short[] var0, int var1) {
      ++e;
      if(var0 == null) {
         return null;
      } else {
         int var3 = 115 % ((-1 - var1) / 62);
         short[] var2 = new short[var0.length];
         System.arraycopy(var0, 0, var2, 0, var0.length);
         return var2;
      }
   }

}
