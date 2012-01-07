import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;

final class lka {

   static int a;
   static int b;
   static int c;
   static int e;
   static Object[] d;


   static final void a(int var0, int var1, int var2) {
      ++c;
      Object[] var3 = la.a(0, (long)var1 << 32 | (long)var0, 18);
      aia.a(var3, 1);
      if(var2 < 47) {
         d = (Object[])null;
      }

   }

   static final Object[] a(int var0, int var1, int var2, int var3, int var4, Object[] var5, int var6, int var7, Object[] var8, int var9, Object[] var10) {
      ++a;
      mta.a(1, var10);
      if(var8 != null && var8.length == 11) {
         a(-72, -107, 106, -109, -59, (Object[])null, -24, 13965, (Object[])null, -43, (Object[])null);
      }

      ((int[])((int[])var10[1]))[6] = var1;
      ((int[])((int[])var10[1]))[0] = var4;
      ((int[])((int[])var10[1]))[5] = var6;
      if(var7 != 13965) {
         d = (Object[])null;
      }

      var10[0] = var8;
      ((int[])((int[])var10[1]))[1] = var3;
      var10[2] = var5;
      ((int[])((int[])var10[1]))[2] = var9;
      ((int[])((int[])var10[1]))[3] = var0;
      ((int[])((int[])var10[1]))[4] = var2;
      return var10;
   }

   static final void a(byte var0, Object[] var1) {
      ++e;
      if(var0 != -56) {
         d = (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])d[1]))[0]))[3]);
      }

      if(((int[])((int[])var1[1]))[7] <= 0) {
         var1[16] = null;
      } else {
         byte[][] var16 = new byte[((aa)var1[2]).f_i + 1][1 + ((aa)var1[2]).h];

         int var18;
         for(int var17 = 1; ((aa)var1[2]).f_i > var17; ++var17) {
            if(var1 != null && (var1.length == 13 || -13 == ~var1.length)) {
               iq.c = null;
            }

            for(var18 = 1; ((aa)var1[2]).h > var18; ++var18) {
               var16[var17][var18] = (byte)((((byte[][])((byte[][])var1[17]))[var17][var18] >> 1) + (((byte[][])((byte[][])var1[17]))[var17 + 1][var18] >> 3) + (((byte[][])((byte[][])var1[17]))[var17 - 1][var18] >> 2) - (-(((byte[][])((byte[][])var1[17]))[var17][-1 + var18] >> 2) - (((byte[][])((byte[][])var1[17]))[var17][1 + var18] >> 3)));
            }
         }

         lm[] var84 = new lm[oha.a((Object[])((Object[])var1[22]), (byte)-119)];
         vn.a(false, (Object[])((Object[])var1[22]), var84);

         for(var18 = 0; var84.length > var18; ++var18) {
            cn var2;
            kca.a(((int[])((int[])var1[1]))[7], var0 ^ -64, (var2 = (cn)var84[var18]) == null?null:var2.j);
         }

         var18 = 20;
         if(null != var1[9]) {
            var18 += 4;
         }

         if(0 != (((int[])((int[])var1[1]))[6] & 7)) {
            var18 += 12;
         }

         NativeHeapBuffer var19 = ((NativeHeap)((Object[])((Object[])var1[12]))[46]).a(((int[])((int[])var1[1]))[7] * 4, false);
         NativeHeapBuffer var20 = ((NativeHeap)((Object[])((Object[])var1[12]))[46]).a(((int[])((int[])var1[1]))[7] * var18, false);
         Stream var21 = new Stream(var20);
         Stream var22 = new Stream(var19);
         Object[][] var23 = new Object[((int[])((int[])var1[1]))[7]][];
         int var24 = uma.a(-32125, ((int[])((int[])var1[1]))[7] / 4);
         if(1 > var24) {
            var24 = 1;
         }

         Object[] var25 = nb.a((byte)83, var24, new Object[5]);
         Object[][] var26 = new Object[((int[])((int[])var1[1]))[3]][];

         int var27;
         int var28;
         for(var27 = 0; ~var27 > ~((aa)var1[2]).f_i; ++var27) {
            for(var28 = 0; ~var28 > ~((aa)var1[2]).h; ++var28) {
               if(null != ((int[][][])((int[][][])var1[0]))[var27][var28]) {
                  Object[][] var29 = ((Object[][][][])((Object[][][][])var1[13]))[var27][var28];
                  int[] var30 = ((int[][][])((int[][][])var1[10]))[var27][var28];
                  int[] var31 = ((int[][][])((int[][][])var1[5]))[var27][var28];
                  int[] var32 = ((int[][][])((int[][][])var1[21]))[var27][var28];
                  int[] var33 = ((int[][][])((int[][][])var1[0]))[var27][var28];
                  int[] var34 = (int[])(null == var1[20]?null:((Object[][])((Object[][])var1[20]))[var27][var28]);
                  if(var32 == null) {
                     var32 = var33;
                  }

                  int[] var35 = (int[])(var1[9] != null?((Object[][])((Object[][])var1[9]))[var27][var28]:null);
                  float var36 = ((float[][])((float[][])var1[15]))[var27][var28];
                  float var37 = ((float[][])((float[][])var1[6]))[var27][var28];
                  float var38 = ((float[][])((float[][])var1[19]))[var27][var28];
                  float var39 = ((float[][])((float[][])var1[15]))[var27][var28 + 1];
                  float var40 = ((float[][])((float[][])var1[6]))[var27][var28 + 1];
                  float var41 = ((float[][])((float[][])var1[19]))[var27][1 + var28];
                  float var42 = ((float[][])((float[][])var1[15]))[1 + var27][1 + var28];
                  float var43 = ((float[][])((float[][])var1[6]))[1 + var27][var28 + 1];
                  float var44 = ((float[][])((float[][])var1[19]))[var27 + 1][1 + var28];
                  float var45 = ((float[][])((float[][])var1[15]))[var27 + 1][var28];
                  float var46 = ((float[][])((float[][])var1[6]))[var27 + 1][var28];
                  float var47 = ((float[][])((float[][])var1[19]))[var27 + 1][var28];
                  int var48 = 255 & var16[var27][var28];
                  int var49 = var16[var27][var28 + 1] & 255;
                  int var50 = 255 & var16[1 + var27][var28 + 1];
                  int var51 = var16[1 + var27][var28] & 255;
                  int var52 = 0;
                  int var53 = 0;

                  int var55;
                  while(~var53 > ~var33.length) {
                     Object[] var54 = var29[var53];
                     var55 = 0;

                     while(true) {
                        if(var52 > var55) {
                           if(var54 != var26[var55]) {
                              ++var55;
                              continue;
                           }
                        } else {
                           var26[var52++] = var54;
                           if(null != var1 && 7 == var1.length) {
                              ur.f = 46;
                           }
                        }

                        ++var53;
                        break;
                     }
                  }

                  short[] var100 = ((short[][])((short[][])var1[4]))[var27 + var28 * ((aa)var1[2]).f_i] = new short[var33.length];

                  for(int var101 = 0; ~var101 > ~var33.length; ++var101) {
                     int var56 = (var27 << ((aa)var1[2]).a) + var30[var101];
                     int var57 = (var28 << ((aa)var1[2]).a) + var31[var101];
                     int var58 = var56 >> ((int[])((int[])var1[1]))[0];
                     if(null != var25 && 9 == var25.length) {
                        mt.a((int[])null, 10, (Object[])null, (Object[])null);
                     }

                     int var59 = var57 >> ((int[])((int[])var1[1]))[0];
                     int var60 = var33[var101];
                     int var61 = var32[var101];
                     int var62 = null != var34?var34[var101]:0;
                     long var63 = (long)(var58 << 16) | (long)var60 << 32 | (long)var61 << 48 | (long)var59;
                     int var65 = var30[var101];
                     int var66 = var31[var101];
                     byte var67 = 74;
                     int var68 = 0;
                     float var69;
                     float var70;
                     float var71;
                     float var76;
                     int var102;
                     if(var65 == 0 && 0 == var66) {
                        var71 = var38;
                        var69 = var36;
                        var102 = var67 - var48;
                        var70 = var37;
                     } else if(0 == var65 && ~var66 == ~((aa)var1[2]).g) {
                        var70 = var40;
                        var71 = var41;
                        var69 = var39;
                        var102 = var67 - var49;
                     } else if(var65 == ((aa)var1[2]).g && ((aa)var1[2]).g == var66) {
                        var71 = var44;
                        var69 = var42;
                        var102 = var67 - var50;
                        var70 = var43;
                     } else if(((aa)var1[2]).g == var65 && var66 == 0) {
                        var70 = var46;
                        var102 = var67 - var51;
                        var71 = var47;
                        var69 = var45;
                     } else {
                        float var73 = (float)var65 / (float)((aa)var1[2]).g;
                        float var74 = (float)var66 / (float)((aa)var1[2]).g;
                        float var75 = (-var36 + var45) * var73 + var36;
                        var76 = var73 * (-var37 + var46) + var37;
                        float var77 = var38 + (var47 - var38) * var73;
                        float var78 = var39 + (var42 - var39) * var73;
                        float var79 = var40 + (-var40 + var43) * var73;
                        float var80 = var41 + (-var41 + var44) * var73;
                        var69 = (-var75 + var78) * var74 + var75;
                        var70 = (var79 - var76) * var74 + var76;
                        if(var1 != null && -3 == ~var1.length) {
                           dha.a(32, (int[])null, (int[])null, (int[])null, (Object[])null, (int[])null, (int[])null, (int[])null, (int[])null, 29603, (int[])null, true, (Object[])null, 23);
                        }

                        var71 = var77 + var74 * (-var77 + var80);
                        int var81 = (var65 * (-var48 + var51) >> ((aa)var1[2]).a) + var48;
                        int var82 = (var65 * (var50 - var49) >> ((aa)var1[2]).a) + var49;
                        var102 = var67 - ((var66 * (var82 + -var81) >> ((aa)var1[2]).a) + var81);
                     }

                     float var72 = 1.0F;
                     if(var60 != -1) {
                        int var103 = var102 * (var60 & 127) >> 7;
                        if(2 <= var103) {
                           if(126 < var103) {
                              var103 = 126;
                           }
                        } else {
                           var103 = 2;
                        }

                        var68 = tpa.f['\uff80' & var60 | var103];
                        if(0 == (((int[])((int[])var1[1]))[6] & 7)) {
                           var72 = ((float[])((float[])((Object[])((Object[])var1[12]))[53]))[2] * var71 + ((float[])((float[])((Object[])((Object[])var1[12]))[53]))[0] * var69 + var70 * ((float[])((float[])((Object[])((Object[])var1[12]))[53]))[1];
                           var72 = (0.0F >= var72?((float[])((float[])((Object[])((Object[])var1[12]))[0]))[0]:((float[])((float[])((Object[])((Object[])var1[12]))[0]))[8]) * var72 + ((float[])((float[])((Object[])((Object[])var1[12]))[0]))[17];
                        }
                     }

                     lm var109 = null;
                     if((-1 + ((int[])((int[])var1[1]))[4] & var56) == 0 && -1 == ~(var57 & -1 + ((int[])((int[])var1[1]))[4])) {
                        var109 = pm.a(var63, var25, false);
                     }

                     int var110;
                     if(null != var109) {
                        dga var4;
                        var100[var101] = ((short[])((short[])(null != (var4 = (dga)var109)?var4.f_l:null)[0]))[0];
                        var55 = var100[var101] & '\uffff';
                        Object[] var5;
                        Object[] var6;
                        if(var60 != -1 && ~((lm)(null == (var6 = var23[var55])?null:var6[5])).e < ~((lm)(null == (var5 = var29[var101])?null:var5[5])).e) {
                           var23[var55] = var29[var101];
                        }
                     } else {
                        if(var60 != var61) {
                           int var108 = (var61 & 127) * var102 >> 7;
                           if(var108 < 2) {
                              var108 = 2;
                           } else if(126 < var108) {
                              var108 = 126;
                           }

                           var110 = tpa.f[var108 | var61 & '\uff80'];
                           if(0 == (((int[])((int[])var1[1]))[6] & 7)) {
                              var76 = var71 * ((float[])((float[])((Object[])((Object[])var1[12]))[53]))[2] + ((float[])((float[])((Object[])((Object[])var1[12]))[53]))[0] * var69 + ((float[])((float[])((Object[])((Object[])var1[12]))[53]))[1] * var70;
                              if(null != var1 && -6 == ~var1.length && var1[1].equals(Integer.valueOf(2))) {
                                 ur.f = 16;
                              }

                              var76 = (var72 > 0.0F?((float[])((float[])((Object[])((Object[])var1[12]))[0]))[8]:((float[])((float[])((Object[])((Object[])var1[12]))[0]))[0]) * var72 + ((float[])((float[])((Object[])((Object[])var1[12]))[0]))[17];
                              int var106 = 255 & var110 >> 16;
                              int var105 = var110 >> 8 & 255;
                              int var104 = var110 & 255;
                              var106 = (int)((float)var106 * var76);
                              if(var106 >= 0) {
                                 if(255 < var106) {
                                    var106 = 255;
                                 }
                              } else {
                                 var106 = 0;
                              }

                              var105 = (int)((float)var105 * var76);
                              if(0 <= var105) {
                                 if(255 < var105) {
                                    var105 = 255;
                                 }
                              } else {
                                 var105 = 0;
                              }

                              var104 = (int)((float)var104 * var76);
                              if(0 > var104) {
                                 var104 = 0;
                              } else if(255 < var104) {
                                 var104 = 255;
                              }

                              var110 = var104 | var106 << 16 | var105 << 8;
                           }
                        } else {
                           var110 = var68;
                        }

                        boolean var107 = Stream.b;
                        if(!var107) {
                           var21.a((float)var56);
                           var21.a((float)(((aa)var1[2]).a(1, var56, var57) + var62));
                           var21.a((float)var57);
                           var21.a((float)var56);
                           var21.a((float)var57);
                           if(null != var1[9]) {
                              var21.a(var35 == null?0.0F:(float)(-1 + var35[var101]));
                           }

                           if((7 & ((int[])((int[])var1[1]))[6]) != 0) {
                              var21.a(var69);
                              var21.a(var70);
                              var21.a(var71);
                           }
                        } else {
                           var21.b((float)var56);
                           var21.b((float)(var62 + ((aa)var1[2]).a(1, var56, var57)));
                           var21.b((float)var57);
                           var21.b((float)var56);
                           var21.b((float)var57);
                           if(null != var1[9]) {
                              var21.b(null == var35?0.0F:(float)(-1 + var35[var101]));
                           }

                           if((((int[])((int[])var1[1]))[6] & 7) != 0) {
                              var21.b(var69);
                              var21.b(var70);
                              var21.b(var71);
                           }
                        }

                        if(null != var25 && var25.length == 7 && var25[1].equals(Integer.valueOf(2))) {
                           mf.a(36, (int[][])null, new Object[11][], -80, (byte)-46, 76);
                        }

                        if(((int[])((int[])((Object[])((Object[])var1[12]))[1]))[9] != 0) {
                           var22.c(var110 | -16777216);
                        } else {
                           var22.a(var110 | -16777216);
                        }

                        int[] var10000 = (int[])((int[])var1[1]);
                        int var10003 = ((int[])((int[])var1[1]))[5];
                        var10000[5] = ((int[])((int[])var1[1]))[5] + 1;
                        var55 = var10003;
                        var100[var101] = (short)var55;
                        if(var60 != -1) {
                           var23[var55] = var29[var101];
                        }

                        Object[] var3;
                        di.a(var25, true, (lm)((var3 = jha.a(52, var100[var101], new Object[2])) != null?var3[1]:null), var63);
                     }

                     for(var110 = 0; var52 > var110; ++var110) {
                        uaa.a(var68, (byte)31, var26[var110], var55, var102, var72);
                     }

                     ++((int[])((int[])var1[1]))[1];
                  }

                  if(var25 != null && var25.length == 3) {
                     ur.f = -61;
                  }
               }
            }

            if(null != var1 && (11 == var1.length || 4 == var1.length && var1[2].equals(Integer.valueOf(1)))) {
               nea.d = null;
            }
         }

         for(var27 = 0; ((int[])((int[])var1[1]))[5] > var27; ++var27) {
            Object[] var85 = var23[var27];
            if(null != var85) {
               jt.a(var85, true, var27);
            }
         }

         int var87;
         int var88;
         for(var27 = 0; ((aa)var1[2]).f_i > var27; ++var27) {
            for(var28 = 0; ((aa)var1[2]).h > var28; ++var28) {
               short[] var90 = ((short[][])((short[][])var1[4]))[var27 + var28 * ((aa)var1[2]).f_i];
               if(var90 != null) {
                  if(null != var25 && var25.length == 2) {
                     li.a(-68, (byte)122, 73, 33, 114, -91, (int[][])null, (Object[])null, (Object[])null, (int[][])null);
                  }

                  var87 = 0;

                  for(var88 = 0; var90.length > var88; ++var87) {
                     int var93 = var90[var88++] & '\uffff';
                     int var94 = '\uffff' & var90[var88++];
                     int var97 = var90[var88++] & '\uffff';
                     Object[] var96 = var23[var93];
                     Object[] var95 = var23[var94];
                     Object[] var99 = var23[var97];
                     Object[] var98 = null;
                     if(var96 != null) {
                        var98 = var96;
                        ud.a(var96, 3, var28, var27, var87);
                     }

                     if(var95 != null) {
                        ud.a(var95, 3, var28, var27, var87);
                        if(null == var98 || ((lm)(var98 != null?var98[5]:null)).e > ((lm)(null == var95?null:var95[5])).e) {
                           var98 = var95;
                        }
                     }

                     if(var99 != null) {
                        ud.a(var99, 3, var28, var27, var87);
                        if(var98 == null || ~((lm)(null == var98?null:var98[5])).e < ~((lm)(null != var99?var99[5]:null)).e) {
                           var98 = var99;
                        }
                     }

                     if(null != var98) {
                        if(var96 != null) {
                           jt.a(var98, true, var93);
                        }

                        if(var95 != null) {
                           jt.a(var98, true, var94);
                        }

                        if(var99 != null) {
                           jt.a(var98, true, var97);
                        }

                        ud.a(var98, 3, var28, var27, var87);
                     }
                  }
               }
            }

            if(null != var25 && -4 == ~var25.length && var25[1].equals(Boolean.valueOf(false))) {
               kt.a(var0 + 56, -67, 10, (Object[])null, -24);
            }
         }

         var21.b();
         var22.b();
         if(var1 != null && (var1.length == 9 && var1[8].equals(Boolean.valueOf(false)) || var1.length == 4)) {
            ur.f = -86;
         }

         var1[14] = mc.a(-127, (Object[])((Object[])var1[12]), false);
         pha.a(4 * ((int[])((int[])var1[1]))[5], 0, var19, (Object[])((Object[])var1[14]), 4);
         var1[11] = mc.a(var0 ^ 90, (Object[])((Object[])var1[12]), false);
         pha.a(((int[])((int[])var1[1]))[5] * var18, 0, var20, (Object[])((Object[])var1[11]), var18);
         if((((int[])((int[])var1[1]))[6] & 7) == 0) {
            if(null == var1[9]) {
               var1[18] = ao.a(new Object[][]{vg.a((byte)15, new Object[2], new Object[][]{eba.a, eba.e}), sv.a(31675, new Object[2], eba.d)}, (Object[])((Object[])var1[12]), false);
            } else {
               var1[18] = ao.a(new Object[][]{vg.a((byte)15, new Object[2], new Object[][]{eba.a, eba.e, eba.k}), sv.a(var0 ^ -31629, new Object[2], eba.d)}, (Object[])((Object[])var1[12]), false);
            }
         } else if(var1[9] != null) {
            var1[18] = ao.a(new Object[][]{vg.a((byte)15, new Object[2], new Object[][]{eba.a, eba.e, eba.k, eba.h}), sv.a(31675, new Object[2], eba.d)}, (Object[])((Object[])var1[12]), false);
         } else {
            var1[18] = ao.a(new Object[][]{vg.a((byte)15, new Object[2], new Object[][]{eba.a, eba.e, eba.h}), sv.a(31675, new Object[2], eba.d)}, (Object[])((Object[])var1[12]), false);
         }

         var27 = 0;

         Object[] var92;
         for(var28 = 0; ~var28 > ~var84.length; ++var28) {
            cn var11;
            var92 = (var11 = (cn)var84[var28]) == null?null:var11.j;
            if(0 < ((int[])((int[])var92[1]))[4]) {
               var84[var27++] = (lm)(null != var92?var92[5]:null);
            }
         }

         var1[3] = new lm[var27];
         long[] var86 = new long[var27];

         for(int var91 = 0; var91 < var27; ++var91) {
            cn var13;
            Object[] var89 = null != (var13 = (cn)var84[var91])?var13.j:null;
            var86[var91] = ((lm)(null != var89?var89[5]:null)).e;
            ((lm[])((lm[])var1[3]))[var91] = (lm)(null == var89?null:var89[5]);
            el.a(false, ((int[])((int[])var1[1]))[5], var89);
         }

         ica.a(var86, (Object[])((Object[])var1[3]), -108);
         if(var1[16] != null) {
            var92 = (Object[])((Object[])var1[16]);
            var92[2] = new Object[((int[])((int[])var92[1]))[3]][((int[])((int[])var92[1]))[1]][];

            for(var87 = 0; ~var87 > ~((int[])((int[])var92[1]))[1]; ++var87) {
               if(null != var25 && var25.length == 3) {
                  mt.a((int[])null, 10, (Object[])null, (Object[])null);
               }

               for(var88 = 0; ~var88 > ~((int[])((int[])var92[1]))[3]; ++var88) {
                  ((Object[][][])((Object[][][])var92[2]))[var88][var87] = wo.a(((int[])((int[])var92[1]))[4], var88, 1 + var88 * 128, new Object[6], var92, (byte)-128, 1 + var87 * 128, (Object[])((Object[])var92[4]), var87, (Object[])((Object[])var92[3]));
                  if(((int[])((int[])((Object[][][])((Object[][][])var92[2]))[var88][var87][1]))[5] == 0) {
                     ((Object[][][])((Object[][][])var92[2]))[var88][var87] = null;
                  }
               }
            }

            if(var25 != null && (var25.length == 9 || 11 == var25.length)) {
               nea.d = null;
            }
         }
      }

      var1[9] = null;
      var1[21] = null;
      if((2 & ((int[])((int[])var1[1]))[2]) == 0) {
         var1[0] = null;
         var1[5] = null;
         var1[10] = null;
      }

      var1[20] = null;
      var1[13] = null;
      var1[17] = null;
      if(var1 != null && var1.length == 14) {
         iq.c = null;
      }

      var1[15] = null;
      var1[6] = null;
      var1[22] = null;
      var1[19] = null;
   }

   static final int a(Object[] var0, byte var1) {
      ++b;
      if(var1 > -10) {
         return ((int[])((int[])d[5]))[5];
      } else if(!ev.a((int)4120, var0)) {
         throw new IllegalStateException("");
      } else {
         return ((int[])((int[])((Object[])((Object[])var0[3]))[1]))[3];
      }
   }

}
