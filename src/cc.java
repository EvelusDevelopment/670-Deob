import jaggl.OpenGL;

final class cc {

   static int f;
   static int f_i;
   static int h;
   static int b;
   static int e;
   static int a;
   static int g;
   static int c;
   static int d;


   static final void a(byte var0, Object[] var1) {
      ++h;
      if(null == var1[0]) {
         var1[0] = new int[1];
      }

      if(var0 > -82) {
         a(-81, (byte)57, (Object[])null, -16, ((int[])((int[])var1[2]))[16], ((int[])((int[])((Object[])((Object[])var1[1]))[1]))[0], 66, ((int[])((int[])var1[2]))[0]);
      }

   }

   static final boolean a(int var0, int var1, ta var2, Object[] var3, byte var4) {
      ++a;
      if(null != var3[42] && cf.a(131072, var3, 12, var2)) {
         Object[] var5 = bra.a(var3, true);
         if(var3 != null && (-20 == ~var3.length && var3[13].equals(Integer.valueOf(1)) || 5 == var3.length)) {
            return false;
         } else {
            boolean var6 = false;

            int var7;
            for(var7 = 0; ((Object[])((Object[])var3[29])).length > var7; ++var7) {
               if(null != ((ka[])((ka[])var3[29]))[var7]) {
                  boolean var10000;
                  label48: {
                     if(-1 <= ~((int[])((int[])((Object[])((Object[])var3[42]))[1]))[21]) {
                        label46: {
                           if(0 != ~((int[])((int[])((Object[])((Object[])var3[42]))[1]))[7]) {
                              if(((int[])((int[])((Object[])((Object[])var3[42]))[1]))[7] == 1) {
                                 break label46;
                              }
                           } else if(((int[])((int[])((Object[])((Object[])var3[42]))[1]))[18] == 1) {
                              break label46;
                           }

                           var10000 = false;
                           break label48;
                        }
                     }

                     var10000 = true;
                  }

                  boolean var9 = var10000;
                  boolean var8 = ((ka[])((ka[])var3[29]))[var7].a(var1, var0, var5, var9, ((int[])((int[])((Object[])((Object[])var3[42]))[1]))[21]);
                  if(var8) {
                     var6 = true;
                     break;
                  }
               }
            }

            var7 = 0;

            for(int var10 = 89 / ((var4 - 25) / 34); ((Object[])((Object[])var3[29])).length > var7; ++var7) {
               ((ka[])((ka[])var3[29]))[var7] = null;
            }

            return var6;
         }
      } else {
         return false;
      }
   }

   static final Object[] a(int var0, boolean var1) {
      ++c;
      Object[] var3 = (Object[])((Object[])dna.a((byte)34, bm.b, (long)var0));
      if(null != var3) {
         return var3;
      } else {
         byte[] var4 = qn.a(1, var0, vaa.a, -98);
         Object[] var6 = new Object[3];
         fd.a(var6, (byte)-72);
         ((int[])((int[])var6[1]))[9] = 0;
         ((int[])((int[])var6[1]))[2] = 0;
         ((boolean[])((boolean[])var6[0]))[0] = false;
         if(null != var6 && var6.length == 4 && var6[0].equals(Integer.valueOf(1))) {
            bm.b = new Object[1][];
         }

         ((int[])((int[])var6[1]))[11] = var0;
         if(null != var4) {
            sna.a(var6, var1, jta.a((byte)-116, var4, new Object[3]));
         }

         ((int[])((int[])var6[1]))[1] = tda.k[((int[])((int[])var6[1]))[4] << 3];
         long var7 = (long)((int[])((int[])var6[1]))[6];
         long var9 = (long)((int[])((int[])var6[1]))[8];
         long var11 = (long)((int[])((int[])var6[1]))[10];
         ((int[])((int[])var6[1]))[0] = (int)Math.sqrt((double)(var11 * var11 + var9 * var9 + var7 * var7));
         if(((int[])((int[])var6[1]))[7] == 0) {
            ((int[])((int[])var6[1]))[7] = 1;
         }

         if(0 != ((int[])((int[])var6[1]))[5]) {
            if(-2 == ~((int[])((int[])var6[1]))[5]) {
               ((long[])((long[])var6[2]))[0] = (long)(((int[])((int[])var6[1]))[0] * 8 / ((int[])((int[])var6[1]))[7]);
               ((long[])((long[])var6[2]))[0] *= ((long[])((long[])var6[2]))[0];
            } else if(((int[])((int[])var6[1]))[5] == 2) {
               ((long[])((long[])var6[2]))[0] = (long)(8 * ((int[])((int[])var6[1]))[0] / ((int[])((int[])var6[1]))[7]);
            }
         } else {
            ((long[])((long[])var6[2]))[0] = 2147483647L;
         }

         if(((boolean[])((boolean[])var6[0]))[0]) {
            ((int[])((int[])var6[1]))[0] *= -1;
         }

         if(-3 == ~((int[])((int[])var6[1]))[3] && null == pm.a((long)var0, dna.f, false)) {
            Object[] var2;
            di.a(dna.f, true, (lm)((var2 = ps.a((byte)-107, kh.e, new Object[2])) != null?var2[0]:null), (long)var0);
            fw.e[kh.e++] = var6;
         }

         il.a((long)var0, var6, var1, bm.b);
         return var6;
      }
   }

   static final void b(Object[] var0, int var1) {
      ++e;
      ((int[])((int[])var0[var1]))[1] = -1;
   }

   static final void a(Object[] var0, int var1) {
      ++g;
      Object[] var3 = (Object[])((Object[])var0[5]);
      int var2 = ((int[])((int[])var3[1]))[7];
      int var5 = ((int[])((int[])((Object[])((Object[])var0[5]))[75]))[var2];
      if(var5 != ((int[])((int[])var0[1]))[2]) {
         if(0 != var5) {
            OpenGL.glBindTexture(var5, 0);
            OpenGL.glDisable(var5);
         }

         OpenGL.glEnable(((int[])((int[])var0[1]))[2]);
         ((int[])((int[])((Object[])((Object[])var0[5]))[75]))[var2] = ((int[])((int[])var0[1]))[2];
      }

      OpenGL.glBindTexture(((int[])((int[])var0[1]))[2], ((int[])((int[])var0[1]))[0]);
      if(var1 != 6) {
         a((String)null, ((int[])((int[])var0[0]))[1], (Object[])null, -127, (Object[])((Object[])var0[8]));
      }

   }

   static final void a(boolean var0, Object[] var1, byte[][] var2) {
      if(!var0) {
         d = ((int[])((int[])var1[8]))[12];
      }

      ++b;

      int var3;
      int var4;
      int var5;
      int var6;
      for(var3 = 0; ((int[])((int[])var1[1]))[1] > var3; ++var3) {
         if(var1 != null && 9 == var1.length) {
            sf.e = ((int[])((int[])he.b[14]))[2];
         }

         afa.a((byte)-108);

         for(var4 = 0; rp.c >> 3 > var4; ++var4) {
            for(var5 = 0; ~var5 > ~(wpa.a >> 3); ++var5) {
               var6 = va.m[var3][var4][var5];
               if(~var6 != 0) {
                  int var7 = var6 >> 24 & 3;
                  if(!((boolean[])((boolean[])var1[3]))[0] || 0 == var7) {
                     int var8 = 3 & var6 >> 1;
                     int var9 = var6 >> 14 & 1023;
                     int var10 = var6 >> 3 & 2047;
                     if(var1 != null && var1.length == 5) {
                        Class_n.a(1, -22, -83, ((int[])((int[])bea.e[1]))[2], -65);
                     }

                     int var11 = var10 / 8 + (var9 / 8 << 8);

                     for(int var12 = 0; ~var12 > ~Class_f.d.length; ++var12) {
                        if(~var11 == ~Class_f.d[var12] && null != var2[var12]) {
                           Object[] var13 = jta.a((byte)-121, var2[var12], new Object[3]);
                           ml.a(var8, hj.f_i, var9, var10, var3, (byte)57, var1, var7, 8 * var5, var13, 8 * var4);
                           ta var14 = lna.g;
                           int var15 = 8 * var4;
                           int var16 = var5 * 8;
                           if(((boolean[])((boolean[])var1[3]))[0]) {
                              break;
                           }

                           boolean var17 = false;
                           Object[] var18 = null;
                           int var19 = (var9 & 7) * 8;
                           int var20 = 8 * (var10 & 7);

                           int var21;
                           int var22;
                           int var24;
                           int var31;
                           while(~((int[])((int[])var13[1]))[0] > ~((byte[])((byte[])var13[2])).length) {
                              var21 = fh.a(var13, !var0);
                              if(0 == var21) {
                                 if(null == var18) {
                                    Object[] var32 = new Object[4];
                                    eta.a(var32, (byte)-67);
                                    ((float[])((float[])var32[2]))[5] = 1.0F;
                                    ((float[])((float[])var32[2]))[4] = 1.0F;
                                    ((float[])((float[])var32[2]))[1] = 0.25F;
                                    Class_p.a(-1, var13, var32);
                                    var18 = var32;
                                 } else {
                                    Class_p.a(-1, var13, var18);
                                 }
                              } else {
                                 int var27;
                                 int var29;
                                 int var28;
                                 int var34;
                                 if(var21 == 1) {
                                    var22 = fh.a(var13, false);
                                    if(0 < var22) {
                                       for(var31 = 0; var22 > var31; ++var31) {
                                          Object[] var33 = ta.a(var14, var13, (byte)-125, new Object[4], 2);
                                          Object[] var35;
                                          if(((int[])((int[])var33[1]))[2] == 31) {
                                             var35 = sw.a(qja.f_l, -94, de.a((int)0, var13));
                                             od.a(((int[])((int[])var35[0]))[2], (byte)-71, ((int[])((int[])var35[0]))[3], ((int[])((int[])var35[0]))[1], ((int[])((int[])var35[0]))[0], var33);
                                          }

                                          if(0 < var14.x()) {
                                             var35 = (Object[])((Object[])var33[3]);
                                             var34 = lba.a(var35, -25699) >> 9;
                                             var27 = fn.a(var35, -115) >> 9;
                                             if(((int[])((int[])var33[1]))[5] == var7 && var34 >= var19 && var19 + 8 > var34 && var20 <= var27 && var27 < 8 + var20) {
                                                var28 = vd.a(var8, 1, 4095 & lba.a(var35, -25699), 4095 & fn.a(var35, 34)) + (var15 << 9);
                                                var29 = ava.a(4095 & lba.a(var35, -25699), var8, fn.a(var35, 38) & 4095, -108) + (var16 << 9);
                                                var34 = var28 >> 9;
                                                var27 = var29 >> 9;
                                                if(0 <= var34 && 0 <= var27 && ((int[])((int[])var1[1]))[0] > var34 && var27 < ((int[])((int[])var1[1]))[2]) {
                                                   jha.a(((int[][][])((int[][][])var1[4]))[var7][var34][var27] + -sla.a(var35, !var0), var28, var35, var29, 110);
                                                   ra.a(var33);
                                                }
                                             }
                                          }
                                       }
                                    }
                                 } else if(var21 == 2) {
                                    if(var18 == null) {
                                       var18 = gs.a((byte)126, new Object[4]);
                                    }

                                    tra.a(var13, (byte)63, var18);
                                 } else if(128 == var21) {
                                    if(var18 == null) {
                                       var18 = gs.a((byte)115, new Object[4]);
                                    }

                                    ug.a(var13, var18, (byte)101);
                                 } else {
                                    if(var21 != 129) {
                                       throw new IllegalStateException("");
                                    }

                                    if(null == var1[2]) {
                                       var1[2] = new byte[4][][];
                                    }

                                    for(var22 = 0; 4 > var22; ++var22) {
                                       byte var23 = ipa.a(var13, (int)-108);
                                       int var25;
                                       if(0 == var23 && ((byte[][][])((byte[][][])var1[2]))[var3] != null) {
                                          if(var7 >= var22) {
                                             if(var18 != null && 6 == var18.length) {
                                                rv.c = (Object[][])((Object[][])vg.e[3]);
                                             }

                                             var24 = var15;
                                             var25 = 7 + var15;
                                             var34 = var16;
                                             if(0 <= var16) {
                                                if(((int[])((int[])var1[1]))[2] <= var16) {
                                                   var34 = ((int[])((int[])var1[1]))[2];
                                                }
                                             } else {
                                                var34 = 0;
                                             }

                                             var27 = 7 + var16;
                                             if(0 <= var15) {
                                                if(((int[])((int[])var1[1]))[0] <= var15) {
                                                   var24 = ((int[])((int[])var1[1]))[0];
                                                }
                                             } else {
                                                var24 = 0;
                                             }

                                             if(var25 >= 0) {
                                                if(~var25 <= ~((int[])((int[])var1[1]))[0]) {
                                                   var25 = ((int[])((int[])var1[1]))[0];
                                                }
                                             } else {
                                                var25 = 0;
                                             }

                                             if(0 > var27) {
                                                var27 = 0;
                                             } else if(((int[])((int[])var1[1]))[2] <= var27) {
                                                var27 = ((int[])((int[])var1[1]))[2];
                                             }

                                             while(var25 > var24) {
                                                if(var1 != null && (-3 == ~var1.length || var1.length == 27 && var1[1].equals(Integer.valueOf(0)))) {
                                                   ((boolean[])((boolean[])dh.e[0]))[0] = ((boolean[])((boolean[])lfa.c[7]))[21];
                                                }

                                                while(var27 > var34) {
                                                   ((byte[][][])((byte[][][])var1[2]))[var3][var24][var34] = 0;
                                                   ++var34;
                                                }

                                                ++var24;
                                             }
                                          }
                                       } else if(var23 != 1) {
                                          if(2 == var23) {
                                             ;
                                          }
                                       } else {
                                          if(((byte[][][])((byte[][][])var1[2]))[var3] == null) {
                                             ((byte[][][])((byte[][][])var1[2]))[var3] = new byte[1 + ((int[])((int[])var1[1]))[0]][((int[])((int[])var1[1]))[2] + 1];
                                          }

                                          for(var24 = 0; var24 < 64; var24 += 4) {
                                             if(var1 != null && (var1.length == 28 || -3 == ~var1.length)) {
                                                noa.a(-54, 1, (Object[])null);
                                             }

                                             for(var25 = 0; var25 < 64; var25 += 4) {
                                                byte var26 = ipa.a(var13, (int)-127);
                                                if(var7 >= var22) {
                                                   for(var27 = var24; var27 < 4 + var24; ++var27) {
                                                      if(null != var1 && -4 == ~var1.length) {
                                                         oja.a((byte[][])((byte[][])ht.a[36]), 25925, (Object[])null);
                                                      }

                                                      for(var28 = var25; var25 + 4 > var28; ++var28) {
                                                         if(var19 <= var27 && ~var27 > ~(8 + var19) && var20 <= var28 && var28 < 8 + var20) {
                                                            var29 = var15 + qm.a(var27 & 7, var8, 7, var28 & 7);
                                                            int var30 = var16 + im.a(var8, 7 & var28, var27 & 7, 7);
                                                            if(var29 >= 0 && ((int[])((int[])var1[1]))[0] > var29 && var30 >= 0 && ((int[])((int[])var1[1]))[2] > var30) {
                                                               var17 = true;
                                                               ((byte[][][])((byte[][][])var1[2]))[var3][var29][var30] = var26;
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }

                           if(var18 != null) {
                              pja.a(var18, 0, var16 >> 3, var15 >> 3);
                           }

                           if(!var17 && var1[2] != null && ((byte[][][])((byte[][][])var1[2]))[var3] != null) {
                              var21 = 7 + var15;
                              var22 = 7 + var16;

                              for(var31 = var15; var31 < var21; ++var31) {
                                 for(var24 = var16; var24 < var22; ++var24) {
                                    ((byte[][][])((byte[][][])var1[2]))[var3][var31][var24] = 0;
                                 }

                                 if(var13 != null && var13.length == 21) {
                                    kma.a((Object[])null, 1, (Object[])null);
                                 }
                              }
                           }

                           if(var18 != null && 5 == var18.length) {
                              om.d = null;
                           }
                           break;
                        }
                     }
                  }
               }
            }

            if(null != var1 && var1.length == 1) {
               sma.a(118);
            }
         }
      }

      for(var3 = 0; ~var3 > ~((int[])((int[])var1[1]))[1]; ++var3) {
         afa.a((byte)34);
         if(null != var1 && -2 == ~var1.length) {
            ah.h = 21;
         }

         for(var4 = 0; rp.c >> 3 > var4; ++var4) {
            for(var5 = 0; wpa.a >> 3 > var5; ++var5) {
               var6 = va.m[var3][var4][var5];
               if(var6 == -1) {
                  bd.a(8 * var4, 8, var3, var1, 8, -1, var5 * 8);
               }
            }
         }
      }

      if(null != var1 && (var1.length == 7 || -4 == ~var1.length)) {
         Class_ds.a(12, 32, -46, (byte)122);
      }

   }

   static final void a(int var0, byte var1, Object[] var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 < 52) {
         b((Object[])((Object[])var2[3]), ((int[])((int[])var2[24]))[11]);
      }

      ++f;
      if(!((boolean[])((boolean[])((Object[])((Object[])var2[0]))[17]))[2]) {
         Object[] var8 = (Object[])((Object[])var2[3]);
         Object[] var9;
         ue var10 = ((ta)(null != (var9 = (Object[])((Object[])var8[4]))?var9[55]:null)).e(30626);
         if(var10 != null) {
            int var11 = -var7 + -var6 + var10.d();
            moa.a((byte)125, var8, (Object[])((Object[])var8[4]));
            OpenGL.glCopyTexSubImage2D(((int[])((int[])var8[1]))[2], 0, var5, ((int[])((int[])var8[1]))[4] - (var6 + var4), var0, var11, var3, var6);
            OpenGL.glFlush();
         }
      } else {
         int[] var12 = Class_h.a(-30937, var7, var0, (Object[])((Object[])var2[0]), var3, var6);
         if(var12 != null) {
            for(int var13 = 0; var13 < var12.length; ++var13) {
               var12[var13] |= -16777216;
            }

            if(var2 != null && (var2.length == 7 || var2.length == 15)) {
               lta.a(new Object[0][], -94, (Object[])null, 99, -124, 49, -4);
            }

            sda.a(var12, (Object[])((Object[])var2[3]), var5, true, var3, 0, var6, 0, var4, var3);
         }
      }

   }

   static final void a(String var0, int var1, Object[] var2, int var3, Object[] var4) {
      ++f_i;
      if(var4 != null && 1 == var4.length && var4[0].equals(Boolean.valueOf(false))) {
         oea.a(1, (Object[])null, 102);
      }

      Object[] var8 = qca.a(var0, 110, var2);
      if(var8 != null && var1 != ((int[])((int[])var8[1]))[0]) {
         throw new IllegalArgumentException(var0);
      } else {
         oea.a(1, var2, var1);
         int var9;
         if(((Object[])((Object[])var2[1])).length <= var1) {
            for(var9 = ((Object[])((Object[])var2[1])).length; var1 >= var9; var9 += var9) {
               ;
            }

            if(null != var2 && (var2.length == 1 || var2.length == 1)) {
               vi.a((Object[])null, true, -88);
            }

            var2[0] = nb.a((byte)64, var9, new Object[5]);

            for(int var10 = 0; ((Object[])((Object[])var2[1])).length > var10; ++var10) {
               Object[] var11 = ((Object[][])((Object[][])var2[1]))[var10];
               if(null != var11) {
                  di.a((Object[])((Object[])var2[0]), true, (lm)(var11 == null?null:var11[2]), ((lm)(var11 != null?var11[2]:null)).e);
               }
            }

            Object[][] var13 = new Object[var9][];

            for(int var12 = 0; ~var12 > ~((Object[])((Object[])var2[1])).length; ++var12) {
               var13[var12] = ((Object[][])((Object[][])var2[1]))[var12];
            }

            var2[1] = var13;
         }

         ((int[])((int[])var4[1]))[0] = var1;
         var4[0] = var0;
         di.a((Object[])((Object[])var2[0]), true, (lm)(null == var4?null:var4[2]), lta.a(var0, 957755909));
         var9 = 98 / ((var3 - 31) / 51);
         ((Object[][])((Object[][])var2[1]))[var1] = var4;
      }
   }

}
