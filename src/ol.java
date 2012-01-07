
final class ol {

   static int h;
   static int b;
   static boolean e = false;
   static int g;
   static int a;
   static int d;
   static int f_i;
   static int f;
   static float c = 1.0F;


   static final int a(Object[] var0, int var1) {
      ++f_i;
      if(((int[])((int[])var0[12]))[27] != 0) {
         if(var1 != 1) {
            e = ((boolean[])((boolean[])((Object[])((Object[])((Object[])((Object[])var0[2]))[0]))[1]))[0];
         }

         int var4;
         int var5;
         Object[] var6;
         if(0 != ~((int[])((int[])var0[12]))[14]) {
            Object[] var2 = null;
            if(((int[])((int[])var0[12]))[14] < '\u8000') {
               hna var3 = (hna)pm.a((long)((int[])((int[])var0[12]))[14], hf.g, false);
               if(null != var3) {
                  var2 = var3.k;
               }
            } else if('\u8000' <= ((int[])((int[])var0[12]))[14]) {
               var2 = vo.E[((int[])((int[])var0[12]))[14] - '\u8000'];
            }

            if(var2 != null) {
               var6 = qka.a((Object[])((Object[])woa.a(var1 ^ 4, var2)[1]), var1 ^ 117, (Object[])((Object[])woa.a(5, var0)[1]));
               var4 = (int)((float[])((float[])var6[1]))[2];
               var5 = (int)((float[])((float[])var6[1]))[1];
               if(var4 != 0 || var5 != 0) {
                  wsa.a(var0, (byte)113, 16383 & (int)(2607.5945876176133D * Math.atan2((double)var4, (double)var5)));
               }
            }
         }

         if(null != var0 && var0.length == 43 && -59 == ~((int[])((int[])var0[12])).length) {
            if(((int[])((int[])var0[12]))[52] != -1 && (((int[])((int[])var0[12]))[18] == 0 || ((int[])((int[])var0[12]))[12] > 0)) {
               wsa.a(var0, (byte)113, ((int[])((int[])var0[12]))[52]);
               ((int[])((int[])var0[12]))[52] = -1;
            }
         } else if(null != var0 && var0.length == 43 && ((byte[])((byte[])var0[10])).length == 8 && 0 != ~((int[])((int[])var0[12]))[44] && (-1 == ~((int[])((int[])var0[12]))[18] || -1 > ~((int[])((int[])var0[12]))[12])) {
            var6 = (Object[])((Object[])woa.a(5, var0)[1]);
            var4 = (int)((float[])((float[])var6[1]))[2] + -((-rs.f + ((int[])((int[])var0[12]))[44] + -rs.f) * 256);
            var5 = -(256 * (-qm.d + ((int[])((int[])var0[12]))[42] + -qm.d)) + (int)((float[])((float[])var6[1]))[1];
            if(0 != var4 || 0 != var5) {
               wsa.a(var0, (byte)113, (int)(2607.5945876176133D * Math.atan2((double)var4, (double)var5)) & 16383);
            }

            ((int[])((int[])var0[12]))[44] = -1;
         }

         return wj.b(var0, var1 - 105);
      } else {
         return 0;
      }
   }

   static final Object[] a(int var0, Object[] var1, Object[] var2) {
      ++a;
      oqa.a(0, var2);
      if(var0 != -19453) {
         a(-120, (Object[])null, (Object[])((Object[])var1[3]));
      }

      var2[9] = var1;
      ln.a(-28834, var2);
      ug.a(var2, (byte)-68);
      return var2;
   }

   static final void a(Object[] var0, int var1, int var2, Object[] var3) {
      ++h;
      if(var2 != 16383) {
         g = 11;
      }

      int var6;
      int var7;
      if(var1 == 1) {
         var6 = fh.a(var3, false);
         var0[16] = new int[var6];

         for(var7 = 0; var7 < var6; ++var7) {
            ((int[])((int[])var0[16]))[var7] = fma.c(-17126, var3);
         }
      } else if(var1 != 2) {
         if(12 != var1) {
            if(30 <= var1 && 35 > var1) {
               ((String[])((String[])var0[2]))[-30 + var1] = ara.b((byte)61, var3);
            } else if(var1 != 40) {
               if(41 != var1) {
                  if(var1 != 42) {
                     if(var1 == 60) {
                        var6 = fh.a(var3, false);
                        var0[5] = new int[var6];
                        if(var0 != null && (-5 == ~var0.length && var0[2].equals(Integer.valueOf(0)) && var0[2].equals(Integer.valueOf(1)) || -28 == ~var0.length)) {
                           qga.n = null;
                        }

                        for(var7 = 0; var6 > var7; ++var7) {
                           ((int[])((int[])var0[5]))[var7] = fma.c(-17126, var3);
                        }
                     } else if(93 != var1) {
                        if(95 != var1) {
                           if(97 == var1) {
                              ((int[])((int[])var0[1]))[14] = de.a((int)0, var3);
                           } else if(var1 == 98) {
                              ((int[])((int[])var0[1]))[32] = de.a((int)0, var3);
                           } else if(var1 == 99) {
                              ((boolean[])((boolean[])var0[8]))[6] = true;
                           } else if(100 == var1) {
                              ((int[])((int[])var0[1]))[19] = ipa.a(var3, (int)-87);
                           } else if(var1 != 101) {
                              if(102 == var1) {
                                 ((int[])((int[])var0[1]))[22] = de.a((int)0, var3);
                              } else if(103 == var1) {
                                 ((int[])((int[])var0[1]))[30] = de.a((int)0, var3);
                              } else {
                                 int var8;
                                 if(106 != var1 && 118 != var1) {
                                    if(var1 != 107) {
                                       if(109 != var1) {
                                          if(111 != var1) {
                                             if(var1 != 113) {
                                                if(114 == var1) {
                                                   ((byte[])((byte[])var0[9]))[8] = ipa.a(var3, var2 - 16501);
                                                   ((byte[])((byte[])var0[9]))[6] = ipa.a(var3, var2 ^ -16286);
                                                } else if(var1 != 119) {
                                                   if(var1 != 121) {
                                                      if(var1 != 122) {
                                                         if(123 == var1) {
                                                            ((int[])((int[])var0[1]))[6] = de.a((int)0, var3);
                                                         } else if(125 != var1) {
                                                            if(var1 != 127) {
                                                               if(128 == var1) {
                                                                  fh.a(var3, false);
                                                               } else if(134 != var1) {
                                                                  if(135 == var1) {
                                                                     ((int[])((int[])var0[1]))[13] = fh.a(var3, false);
                                                                     ((int[])((int[])var0[1]))[0] = de.a((int)0, var3);
                                                                  } else if(var1 == 136) {
                                                                     ((int[])((int[])var0[1]))[29] = fh.a(var3, false);
                                                                     ((int[])((int[])var0[1]))[23] = de.a((int)0, var3);
                                                                  } else if(var1 == 137) {
                                                                     ((int[])((int[])var0[1]))[11] = de.a((int)0, var3);
                                                                  } else if(var1 != 138) {
                                                                     if(139 == var1) {
                                                                        ((int[])((int[])var0[1]))[15] = fma.c(-17126, var3);
                                                                     } else if(140 != var1) {
                                                                        if(var1 != 141) {
                                                                           if(142 != var1) {
                                                                              if(143 == var1) {
                                                                                 ((boolean[])((boolean[])var0[8]))[5] = true;
                                                                              } else if(150 <= var1 && var1 < 155) {
                                                                                 ((String[])((String[])var0[2]))[-150 + var1] = ara.b((byte)61, var3);
                                                                                 if(!((boolean[])((boolean[])((Object[])((Object[])var0[12]))[8]))[0]) {
                                                                                    ((String[])((String[])var0[2]))[var1 - 150] = null;
                                                                                 }
                                                                              } else if(155 != var1) {
                                                                                 if(var1 == 158) {
                                                                                    ((byte[])((byte[])var0[9]))[0] = 1;
                                                                                 } else if(var1 != 159) {
                                                                                    if(var1 != 160) {
                                                                                       if(162 == var1) {
                                                                                          ((boolean[])((boolean[])var0[8]))[0] = true;
                                                                                       } else if(var1 == 163) {
                                                                                          ((int[])((int[])var0[1]))[7] = fh.a(var3, false);
                                                                                       } else if(164 == var1) {
                                                                                          ((int[])((int[])var0[1]))[16] = de.a((int)0, var3);
                                                                                          ((int[])((int[])var0[1]))[2] = de.a(var2 ^ 16383, var3);
                                                                                       } else if(var1 != 165) {
                                                                                          if(var1 != 168) {
                                                                                             if(var1 == 249) {
                                                                                                var6 = fh.a(var3, false);
                                                                                                if(null == var0[17]) {
                                                                                                   var7 = fda.a(var6, (byte)81);
                                                                                                   var0[17] = nb.a((byte)100, var7, new Object[5]);
                                                                                                }

                                                                                                for(var7 = 0; var7 < var6; ++var7) {
                                                                                                   boolean var11 = 1 == fh.a(var3, false);
                                                                                                   int var9 = td.a(var3, 103);
                                                                                                   lm var10;
                                                                                                   if(var11) {
                                                                                                      Object[] var4;
                                                                                                      var10 = (lm)(null == (var4 = sg.a(ara.b((byte)61, var3), var2 ^ -29703, new Object[2]))?null:var4[1]);
                                                                                                   } else {
                                                                                                      Object[] var5;
                                                                                                      var10 = (lm)(null == (var5 = ps.a((byte)-16, lr.a(1, var3), new Object[2]))?null:var5[0]);
                                                                                                   }

                                                                                                   di.a((Object[])((Object[])var0[17]), true, var10, (long)var9);
                                                                                                }

                                                                                                if(var3 != null && -6 == ~var3.length && var3[3].equals(Integer.valueOf(1))) {
                                                                                                   ria.a((Object[])null, (Object[])null, -44);
                                                                                                }
                                                                                             }
                                                                                          } else {
                                                                                             ((int[])((int[])var0[1]))[28] = fh.a(var3, false);
                                                                                          }
                                                                                       } else {
                                                                                          ((int[])((int[])var0[1]))[21] = fh.a(var3, false);
                                                                                       }
                                                                                    } else {
                                                                                       var6 = fh.a(var3, false);
                                                                                       var0[7] = new int[var6];
                                                                                       if(null != var0 && 2 == var0.length && var0[1].equals(Integer.valueOf(0))) {
                                                                                          qga.n = null;
                                                                                       }

                                                                                       for(var7 = 0; var7 < var6; ++var7) {
                                                                                          ((int[])((int[])var0[7]))[var7] = de.a(var2 - 16383, var3);
                                                                                       }
                                                                                    }
                                                                                 } else {
                                                                                    ((byte[])((byte[])var0[9]))[0] = 0;
                                                                                 }
                                                                              } else {
                                                                                 ((byte[])((byte[])var0[9]))[5] = ipa.a(var3, var2 ^ -16286);
                                                                                 ((byte[])((byte[])var0[9]))[2] = ipa.a(var3, (int)-127);
                                                                                 ((byte[])((byte[])var0[9]))[4] = ipa.a(var3, (int)-109);
                                                                                 ((byte[])((byte[])var0[9]))[1] = ipa.a(var3, (int)-96);
                                                                              }
                                                                           } else {
                                                                              ((int[])((int[])var0[1]))[26] = de.a((int)0, var3);
                                                                           }
                                                                        } else {
                                                                           ((boolean[])((boolean[])var0[8]))[2] = true;
                                                                        }
                                                                     } else {
                                                                        ((int[])((int[])var0[1]))[1] = fh.a(var3, false);
                                                                     }
                                                                  } else {
                                                                     ((int[])((int[])var0[1]))[9] = fma.c(-17126, var3);
                                                                  }
                                                               } else {
                                                                  ((int[])((int[])var0[1]))[20] = de.a((int)0, var3);
                                                                  if(-65536 == ~((int[])((int[])var0[1]))[20]) {
                                                                     ((int[])((int[])var0[1]))[20] = -1;
                                                                  }

                                                                  ((int[])((int[])var0[1]))[8] = de.a((int)0, var3);
                                                                  if(((int[])((int[])var0[1]))[8] == '\uffff') {
                                                                     ((int[])((int[])var0[1]))[8] = -1;
                                                                  }

                                                                  ((int[])((int[])var0[1]))[27] = de.a((int)0, var3);
                                                                  if(((int[])((int[])var0[1]))[27] == '\uffff') {
                                                                     ((int[])((int[])var0[1]))[27] = -1;
                                                                  }

                                                                  ((int[])((int[])var0[1]))[10] = de.a((int)0, var3);
                                                                  if(((int[])((int[])var0[1]))[10] == '\uffff') {
                                                                     ((int[])((int[])var0[1]))[10] = -1;
                                                                  }

                                                                  ((int[])((int[])var0[1]))[5] = fh.a(var3, false);
                                                               }
                                                            } else {
                                                               ((int[])((int[])var0[1]))[4] = de.a((int)0, var3);
                                                            }
                                                         } else {
                                                            ((byte[])((byte[])var0[9]))[7] = ipa.a(var3, (int)-120);
                                                         }
                                                      } else {
                                                         ((int[])((int[])var0[1]))[25] = fma.c(var2 ^ -32027, var3);
                                                      }
                                                   } else {
                                                      var0[13] = new int[((int[])((int[])var0[16])).length][];
                                                      var6 = fh.a(var3, false);
                                                      if(null != var3 && 2 == var3.length) {
                                                         ria.a((Object[])null, (Object[])null, var2 - 16474);
                                                      }

                                                      for(var7 = 0; var6 > var7; ++var7) {
                                                         var8 = fh.a(var3, false);
                                                         int[] var12 = ((int[][])((int[][])var0[13]))[var8] = new int[3];
                                                         var12[0] = ipa.a(var3, (int)-90);
                                                         var12[1] = ipa.a(var3, (int)-80);
                                                         var12[2] = ipa.a(var3, (int)-97);
                                                      }
                                                   }
                                                } else {
                                                   ((byte[])((byte[])var0[9]))[3] = ipa.a(var3, (int)-113);
                                                }
                                             } else {
                                                ((short[])((short[])var0[14]))[0] = (short)de.a((int)0, var3);
                                                ((short[])((short[])var0[14]))[1] = (short)de.a((int)0, var3);
                                             }
                                          } else {
                                             ((boolean[])((boolean[])var0[8]))[1] = false;
                                          }
                                       } else {
                                          ((boolean[])((boolean[])var0[8]))[4] = false;
                                       }
                                    } else {
                                       ((boolean[])((boolean[])var0[8]))[3] = false;
                                    }
                                 } else {
                                    if(var0 != null && -2 == ~var0.length) {
                                       qga.n = null;
                                    }

                                    ((int[])((int[])var0[1]))[3] = de.a((int)0, var3);
                                    if(-65536 == ~((int[])((int[])var0[1]))[3]) {
                                       ((int[])((int[])var0[1]))[3] = -1;
                                    }

                                    ((int[])((int[])var0[1]))[12] = de.a((int)0, var3);
                                    if('\uffff' == ((int[])((int[])var0[1]))[12]) {
                                       ((int[])((int[])var0[1]))[12] = -1;
                                    }

                                    var6 = -1;
                                    if(118 == var1) {
                                       var6 = de.a(var2 ^ 16383, var3);
                                       if(var6 == '\uffff') {
                                          var6 = -1;
                                       }
                                    }

                                    var7 = fh.a(var3, false);
                                    var0[11] = new int[var7 + 2];

                                    for(var8 = 0; var7 >= var8; ++var8) {
                                       ((int[])((int[])var0[11]))[var8] = de.a((int)0, var3);
                                       if(-65536 == ~((int[])((int[])var0[11]))[var8]) {
                                          ((int[])((int[])var0[11]))[var8] = -1;
                                       }
                                    }

                                    ((int[])((int[])var0[11]))[1 + var7] = var6;
                                 }
                              }
                           } else {
                              ((int[])((int[])var0[1]))[31] = 5 * ipa.a(var3, var2 - 16510);
                           }
                        } else {
                           ((int[])((int[])var0[1]))[24] = de.a((int)0, var3);
                        }
                     } else {
                        ((boolean[])((boolean[])var0[8]))[7] = false;
                     }
                  } else {
                     if(null != var0 && 9 == var0.length && var0[7].equals(Boolean.valueOf(false))) {
                        qga.n = null;
                     }

                     var6 = fh.a(var3, false);
                     var0[15] = new byte[var6];

                     for(var7 = 0; var6 > var7; ++var7) {
                        ((byte[])((byte[])var0[15]))[var7] = ipa.a(var3, (int)-108);
                     }
                  }
               } else {
                  var6 = fh.a(var3, false);
                  var0[10] = new short[var6];
                  var0[6] = new short[var6];

                  for(var7 = 0; var7 < var6; ++var7) {
                     ((short[])((short[])var0[6]))[var7] = (short)de.a((int)0, var3);
                     ((short[])((short[])var0[10]))[var7] = (short)de.a((int)0, var3);
                  }
               }
            } else {
               var6 = fh.a(var3, false);
               var0[4] = new short[var6];
               if(null != var3 && var3.length == 7 && var3[1].equals(Integer.valueOf(1))) {
                  ita.a((byte)-77, (Object[])null);
               }

               var0[3] = new short[var6];

               for(var7 = 0; var6 > var7; ++var7) {
                  ((short[])((short[])var0[4]))[var7] = (short)de.a((int)0, var3);
                  ((short[])((short[])var0[3]))[var7] = (short)de.a((int)0, var3);
               }
            }
         } else {
            ((int[])((int[])var0[1]))[18] = fh.a(var3, false);
         }
      } else {
         var0[0] = ara.b((byte)61, var3);
      }

   }

   static final int a(Object[] var0, boolean var1) {
      if(var1) {
         e = false;
      }

      ++b;
      return ((int[])((int[])var0[12]))[3];
   }

   static final boolean a(byte var0, int var1) {
      ++f;
      int var2 = 71 / ((-5 - var0) / 35);
      return (-var1 & var1) == var1;
   }

}
