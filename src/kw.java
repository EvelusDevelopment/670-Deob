import jaggl.OpenGL;
import jagtheora.misc.SimplePeer;

final class kw {

   static Object[] c = nea.a(new Object[1], 1, (byte)-88);
   static int f;
   static int e = 16;
   static int h;
   static Object[] b;
   static int a;
   static int g;
   static int d;


   static final void b(int var0, Object[] var1, Object[] var2) {
      ((int[])((int[])var2[1]))[0] = 0;
      ++f;
      int var3 = fh.a(var2, false);
      ((byte[])((byte[])var1[10]))[8] = (byte)(1 & var3);
      boolean var4 = ((boolean[])((boolean[])var1[8]))[12];
      if(var1 == null || var1.length != 26 && 2 != var1.length && 22 != var1.length) {
         ((boolean[])((boolean[])var1[8]))[12] = (var3 & 2) != 0;
         boolean var5 = (var3 & 4) != 0;
         int var6 = th.a(var1, 28);
         so.a(((var3 & 57) >> 3) + 1, (byte)51, var1);
         if(var0 > -107) {
            a(48, 33, (Object[])((Object[])var2[0]), (Object[])null, (Object[])null, (byte)1);
         }

         boolean var7 = 0 != (var3 & 64);
         boolean var8 = (128 & var3) != 0;
         Object[] var9 = mha.a((byte)120, new Object[2], (Object[])((Object[])woa.a(5, var1)[1]));
         ((float[])((float[])var9[1]))[2] += (float)(-var6 + gn.a(var1, (byte)71) << 8);
         ((float[])((float[])var9[1]))[1] += (float)(-var6 + gn.a(var1, (byte)-99) << 8);
         sra.a(var1, var9, 1);
         if(!var7) {
            var1[41] = null;
         } else {
            var1[41] = wta.a((byte)96, var2);
         }

         if(var8) {
            var1[40] = wta.a((byte)-27, var2);
         } else {
            var1[40] = null;
         }

         ((int[])((int[])var1[12]))[54] = ipa.a(var2, (int)-95);
         ((int[])((int[])var1[12]))[47] = ipa.a(var2, (int)-76);
         ((boolean[])((boolean[])var1[8]))[15] = ipa.a(var2, (int)-88) == 1;
         if(mka.g == po.f_i && 2 <= oda.h) {
            ((boolean[])((boolean[])var1[8]))[15] = false;
         }

         ((int[])((int[])var1[12]))[43] = 0;
         int var10 = -1;
         int[] var11 = new int[((int[])((int[])hh.a[0])).length];
         Object[][] var12 = new Object[((int[])((int[])hh.a[0])).length][];
         Object[][] var13 = new Object[((int[])((int[])hh.a[0])).length][];

         int var14;
         int var15;
         int var17;
         int var16;
         int var18;
         for(var14 = 0; ~var14 > ~((int[])((int[])hh.a[0])).length; ++var14) {
            if(1 != ((int[])((int[])hh.a[0]))[var14]) {
               var15 = fh.a(var2, false);
               if(0 == var15) {
                  var11[var14] = 0;
               } else {
                  var16 = fh.a(var2, false);
                  var17 = var16 + (var15 << 8);
                  if(var14 == 0 && '\uffff' == var17) {
                     var10 = fma.c(-17126, var2);
                     ((int[])((int[])var1[12]))[43] = fh.a(var2, false);
                     break;
                  }

                  if(var17 < '\u8000') {
                     var11[var14] = Integer.MIN_VALUE | -256 + var17;
                  } else {
                     var17 = hj.c[-32768 + var17];
                     var11[var14] = var17 | 1073741824;
                     var13[var14] = us.a(var17, (byte)51, cqa.a);
                     var18 = ((int[])((int[])var13[var14][1]))[32];
                     if(var18 != 0) {
                        ((int[])((int[])var1[12]))[43] = var18;
                     }
                  }
               }
            }
         }

         if(-1 == var10) {
            var14 = de.a((int)0, var2);
            if(null != var1 && var1.length == 9) {
               tn.a(new Object[2][], false, (byte)55);
            }

            var15 = 0;

            for(var16 = 0; ~var16 > ~((int[])((int[])hh.a[0])).length; ++var16) {
               if(((int[])((int[])hh.a[0]))[var16] == 0) {
                  if(0 != (var14 & 1 << var15)) {
                     Object[] var20 = var13[var16];
                     if(null != var2 && -2 == ~var2.length) {
                        vg.a((byte)-10, (Object[])null);
                     }

                     Object[] var22 = new Object[]{null, new int[3], new int[2], new int[2], new int[3], null};
                     ((int[])((int[])var22[4]))[0] = ((int[])((int[])var20[1]))[21];
                     ((int[])((int[])var22[4]))[1] = ((int[])((int[])var20[1]))[23];
                     ((int[])((int[])var22[4]))[2] = ((int[])((int[])var20[1]))[24];
                     ((int[])((int[])var22[1]))[0] = ((int[])((int[])var20[1]))[1];
                     ((int[])((int[])var22[1]))[1] = ((int[])((int[])var20[1]))[5];
                     ((int[])((int[])var22[1]))[2] = ((int[])((int[])var20[1]))[37];
                     ((int[])((int[])var22[3]))[0] = ((int[])((int[])var20[1]))[38];
                     if(null != var9 && var9.length == 4 && var9[0].equals(Integer.valueOf(0))) {
                        return;
                     }

                     ((int[])((int[])var22[3]))[1] = ((int[])((int[])var20[1]))[39];
                     ((int[])((int[])var22[2]))[0] = ((int[])((int[])var20[1]))[10];
                     ((int[])((int[])var22[2]))[1] = ((int[])((int[])var20[1]))[16];
                     if(var20[0] != null) {
                        var22[5] = new short[((short[])((short[])var20[0])).length];
                        System.arraycopy(var20[0], 0, var22[5], 0, ((short[])((short[])var22[5])).length);
                     }

                     if(var20[13] != null) {
                        var22[0] = new short[((short[])((short[])var20[13])).length];
                        System.arraycopy(var20[13], 0, var22[0], 0, ((short[])((short[])var22[0])).length);
                     }

                     Object[] var23 = var22;
                     int var24 = fh.a(var2, false);
                     boolean var25 = 0 != (var24 & 1);
                     boolean var26 = (var24 & 2) != 0;
                     boolean var27 = (var24 & 4) != 0;
                     if(var25) {
                        ((int[])((int[])var22[4]))[0] = fma.c(-17126, var2);
                        ((int[])((int[])var22[1]))[0] = fma.c(-17126, var2);
                        if(0 != ~((int[])((int[])var20[1]))[23] || ~((int[])((int[])var20[1]))[5] != 0) {
                           ((int[])((int[])var22[4]))[1] = fma.c(-17126, var2);
                           ((int[])((int[])var22[1]))[1] = fma.c(-17126, var2);
                        }

                        if(~((int[])((int[])var20[1]))[24] != 0 || -1 != ((int[])((int[])var20[1]))[37]) {
                           ((int[])((int[])var22[4]))[2] = fma.c(-17126, var2);
                           ((int[])((int[])var22[1]))[2] = fma.c(-17126, var2);
                        }
                     }

                     boolean var28 = 0 != (var24 & 8);
                     if(var26) {
                        ((int[])((int[])var22[3]))[0] = fma.c(-17126, var2);
                        ((int[])((int[])var22[2]))[0] = fma.c(-17126, var2);
                        if(0 != ~((int[])((int[])var20[1]))[39] || -1 != ((int[])((int[])var20[1]))[16]) {
                           ((int[])((int[])var22[3]))[1] = fma.c(-17126, var2);
                           ((int[])((int[])var22[2]))[1] = fma.c(-17126, var2);
                        }
                     }

                     int var29;
                     int var31;
                     int[] var30;
                     if(var27) {
                        if(null != var1 && 1 == var1.length) {
                           return;
                        }

                        var29 = de.a((int)0, var2);
                        var30 = new int[]{15 & var29, 15 & var29 >> 4, var29 >> 8 & 15, 15 & var29 >> 12};

                        for(var31 = 0; var31 < 4; ++var31) {
                           if(var30[var31] != 15) {
                              ((short[])((short[])var23[5]))[var30[var31]] = (short)de.a((int)0, var2);
                           }
                        }
                     }

                     if(var28) {
                        var29 = fh.a(var2, false);
                        var30 = new int[]{var29 & 15, var29 >> 4 & 15};
                        if(var9 != null && var9.length == 7 && var9[6].equals(Integer.valueOf(2)) && var9[6].equals(Integer.valueOf(0))) {
                           return;
                        }

                        for(var31 = 0; 2 > var31; ++var31) {
                           if(-16 != ~var30[var31]) {
                              ((short[])((short[])var23[0]))[var30[var31]] = (short)de.a((int)0, var2);
                           }
                        }
                     }

                     var12[var16] = var23;
                  }

                  ++var15;
               }
            }
         }

         int[] var32 = new int[10];

         for(var15 = 0; 10 > var15; ++var15) {
            var16 = fh.a(var2, false);
            if(1 > sfa.a.length || 0 > var16 || ~var16 <= ~sfa.a[var15][0].length) {
               var16 = 0;
            }

            var32[var15] = var16;
         }

         ((int[])((int[])var1[12]))[42] = de.a((int)0, var2);
         var1[39] = ara.b((byte)61, var2);
         if(var1 == uta.g) {
            tsa.e = (String)var1[39];
         }

         var1[37] = var1[39];
         ((int[])((int[])var1[12]))[45] = fh.a(var2, false);
         if(!var5) {
            ((int[])((int[])var1[12]))[55] = 0;
            ((int[])((int[])var1[12]))[56] = fh.a(var2, false);
            ((int[])((int[])var1[12]))[53] = fh.a(var2, false);
            if(((int[])((int[])var1[12]))[53] == 255) {
               ((int[])((int[])var1[12]))[53] = -1;
            }
         } else {
            ((int[])((int[])var1[12]))[55] = de.a((int)0, var2);
            if('\uffff' == ((int[])((int[])var1[12]))[55]) {
               ((int[])((int[])var1[12]))[55] = -1;
            }

            ((int[])((int[])var1[12]))[56] = ((int[])((int[])var1[12]))[45];
            ((int[])((int[])var1[12]))[53] = -1;
         }

         var15 = ((int[])((int[])var1[12]))[46];
         ((int[])((int[])var1[12]))[46] = fh.a(var2, false);
         if(((int[])((int[])var1[12]))[46] == 0) {
            eha.a(var1, true);
         } else {
            var16 = ((int[])((int[])var1[12]))[44];
            var17 = ((int[])((int[])var1[12]))[51];
            var18 = ((int[])((int[])var1[12]))[41];
            int var19 = ((int[])((int[])var1[12]))[50];
            int var35 = ((int[])((int[])var1[12]))[49];
            ((int[])((int[])var1[12]))[44] = de.a((int)0, var2);
            ((int[])((int[])var1[12]))[51] = de.a((int)0, var2);
            ((int[])((int[])var1[12]))[41] = de.a((int)0, var2);
            ((int[])((int[])var1[12]))[50] = de.a((int)0, var2);
            ((int[])((int[])var1[12]))[49] = fh.a(var2, false);
            if(null != var2 && 2 == var2.length) {
               kf.a(-79, 89, (ta)null, (Object[])null);
            }

            if(((boolean[])((boolean[])var1[8]))[12] == !var4 || ((int[])((int[])var1[12]))[46] != var15 || var16 != ((int[])((int[])var1[12]))[44] || ((int[])((int[])var1[12]))[51] != var17 || ((int[])((int[])var1[12]))[41] != var18 || ((int[])((int[])var1[12]))[50] != var19 || ((int[])((int[])var1[12]))[49] != var35) {
               ln.a(var1, (byte)-50);
            }
         }

         if(null == var1[42]) {
            var1[42] = vr.a(1, new Object[6]);
         }

         var16 = ((int[])((int[])((Object[])((Object[])var1[42]))[1]))[1];
         int[] var33 = (int[])((int[])((Object[])((Object[])var1[42]))[5]);
         ola.a(var11, var12, -2 == ~((byte[])((byte[])var1[10]))[8], lra.a(var1, 81), var10, var32, (Object[])((Object[])var1[42]), (byte)51);
         if(var16 != var10) {
            var9 = mha.a((byte)122, new Object[2], (Object[])((Object[])woa.a(5, var1)[1]));
            ((float[])((float[])var9[1]))[2] = (float)((((int[])((int[])var1[33]))[0] << 9) + (gn.a(var1, (byte)49) << 8));
            ((float[])((float[])var9[1]))[1] = (float)((((int[])((int[])var1[14]))[0] << 9) + (gn.a(var1, (byte)-111) << 8));
            sra.a(var1, var9, 1);
         }

         if(((int[])((int[])var1[12]))[21] == dp.r && null != var33) {
            for(var18 = 0; var32.length > var18; ++var18) {
               if(var32[var18] != var33[var18]) {
                  rh.a(cqa.a, (int)2344);
                  break;
               }
            }
         }

         if(var1[16] != null) {
            ((ch)var1[16]).e();
         }

         if(wna.a((Object[])((Object[])var1[30]), 4) && ((boolean[])((boolean[])var1[8]))[7]) {
            Object[] var34 = ro.a((int)3, var1);
            if(!wka.a(var34, 3, lt.a((byte)-19, (Object[])((Object[])var1[30])))) {
               rs.a(-1, (Object[])((Object[])var1[30]), 127);
               ((boolean[])((boolean[])var1[8]))[7] = false;
            }
         }

      }
   }

   static final void a(int var0, Object[] var1) {
      ++h;
      if(!((boolean[])((boolean[])var1[7]))[1]) {
         Class_ls var2;
         Object[] var4 = (var2 = (Class_ls)qt.a(0, (Object[])((Object[])var1[4]))) == null?null:var2.j;
         if(var0 != -5) {
            a(-22, (Object[])null, (Object[])null);
         }

         while(null != var4) {
            if(null != var4 && -5 == ~var4.length) {
               dl.a(var4, (byte)68);
            } else if(null != var4 && -11 == ~var4.length) {
               ip.a(1, var4);
            } else if(var4 != null && var4.length == 7) {
               vla.a(var0 ^ -7, var4);
            } else {
               if(null == var4 || 13 != var4.length) {
                  throw new IllegalStateException();
               }

               nn.b(var4, -124);
            }

            ((SimplePeer)var4[2]).a();
            Class_ls var3;
            var4 = (var3 = (Class_ls)nda.a(1, (Object[])((Object[])var1[4]))) != null?var3.j:null;
         }

         ((SimplePeer)var1[0]).a();
         if(null == var1 || 11 != var1.length) {
            ((SimplePeer)var1[1]).a();
            ((SimplePeer)var1[2]).a();
            ((boolean[])((boolean[])var1[7]))[1] = true;
         }
      }
   }

   static final Object[] a(int var0, int var1, Object[] var2, Object[] var3, Object[] var4, byte var5) {
      nb.a(false, var2);
      ++g;
      if(null != var3 && 1 == var3.length) {
         gn.a(25, 22790, (Object[])null);
      }

      var2[0] = tna.a(var2, true);
      if(var5 != 19) {
         return (Object[])null;
      } else {
         var2[8] = var3;
         var2[2] = ((Object[])((Object[])var2[8]))[11];
         var2[6] = var4;
         Object[] var6;
         Object[] var7;
         var2[3] = new int[((aa)(null == (var7 = (Object[])((Object[])var2[8]))?null:var7[6])).h * ((aa)((var6 = (Object[])((Object[])var2[8])) == null?null:var6[6])).f_i];
         ((int[])((int[])var2[1]))[0] = var0;
         ((float[])((float[])var2[4]))[0] = (float)var1;
         var2[7] = hha.a((Object[])((Object[])var2[2]), 5123, new Object[1], (byte[])null, 1, 35);
         return var2;
      }
   }

   static final void a(int var0, Object[] var1, int var2, int[] var3, int var4, int var5, int var6, byte var7, int var8) {
      ++a;
      ah.a((Object[])((Object[])var1[5]), var1, (byte)97);
      if(var7 > -112) {
         a(((int[])((int[])c[4]))[18], (Object[])null);
      }

      if(0 == var4) {
         var4 = var0;
      }

      if(var0 != var4) {
         OpenGL.glPixelStorei(3314, var4);
      }

      OpenGL.glTexSubImage2Di(((int[])((int[])var1[1]))[2], 0, var5, var8, var0, var2, '\u80e1', ((int[])((int[])((Object[])((Object[])var1[5]))[1]))[40], var3, var6);
      if(var4 != var0) {
         OpenGL.glPixelStorei(3314, 0);
      }

   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      ++d;
      Object[] var3 = bua.a(var0, var2, var1);
      int var4;
      int var5;
      if(null == var3) {
         var4 = wr.n;
         var5 = nma.a;
      } else {
         var4 = ((int[])((int[])var3[1]))[70];
         var5 = ((int[])((int[])var3[1]))[2];
      }

      wea.a(var4, false, var1, var5, var0 + 1);
      kia.a(var1, var5, var4, -103);
   }

}
