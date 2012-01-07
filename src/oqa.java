
class oqa extends Exception {

   static String c = null;
   static Object[] h = st.a(new Object[1], 7, 32, 30);
   static int d;
   static int a;
   static int b;
   static int e = 1403;
   static int f;
   static int g = 0;


   static final void a(int var0, Object[] var1) {
      if(var0 == 0) {
         if(null == var1[5]) {
            var1[5] = new long[1];
         }

         ++a;
      }
   }

   static final void a(Object[] var0, int var1, int var2) {
      ++b;
      if(var2 <= 12) {
         a(-106, ((int[])((int[])var0[2]))[0], -22, ((int[])((int[])((Object[])((Object[])var0[2]))[8]))[6], -73, -51, 94, ((int[])((int[])var0[10]))[0], -36, -35);
      }

      ((boolean[])((boolean[])var0[8]))[2] = true;
      et.a(false, var1, var0, 3, 1);
   }

   static final Object[] a(Object[] var0, int var1, int var2, int var3, int var4) {
      ++d;
      or.b(var0, (byte)72);
      ((int[])((int[])var0[1]))[1] = 0;
      ((int[])((int[])var0[1]))[0] = -1;
      var0[0] = ura.a(-109, new Object[2]);
      ((boolean[])((boolean[])var0[4]))[0] = false;
      ((int[])((int[])var0[1]))[3] = var2;
      ((int[])((int[])var0[1]))[2] = var1;
      var0[2] = new Object[((int[])((int[])var0[1]))[3]][];
      if(var4 != 0) {
         return (Object[])null;
      } else {
         var0[3] = new int[((int[])((int[])var0[1]))[2]][var3];
         return var0;
      }
   }

   static final boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(var9 != 1417351692) {
         e = -46;
      }

      ++f;
      if(var1 <= 2010 && 2010 >= var2 && 2010 >= var6 && var8 <= 2010 && 2010 >= var3 && 2010 >= var5) {
         if(-2010 <= var1 && -2010 <= var2 && var6 >= -2010 && var8 >= -2010 && -2010 <= var3 && var5 >= -2010) {
            int var10;
            if(2 == oja.a) {
               var10 = var8 + sqa.e * var1;
               if(var10 >= 0 && ~var10 > ~wga.a.length && ~(-39168 + (var7 << 8)) > ~wga.a[var10]) {
                  return false;
               }

               var10 = var2 * sqa.e + var3;
               if(var10 >= 0 && wga.a.length > var10 && (var0 << 8) - '\u9900' < wga.a[var10]) {
                  return false;
               }

               var10 = var5 + sqa.e * var6;
               if(var10 >= 0 && wga.a.length > var10 && ~(-39168 + (var4 << -207223960)) > ~wga.a[var10]) {
                  return false;
               }
            }

            var10 = var3 + -var8;
            int var11 = -var1 + var2;
            int var12 = -var8 + var5;
            int var13 = -var1 + var6;
            int var14 = var0 - var7;
            int var15 = var4 - var7;
            if(var2 > var1 && var6 < var6) {
               --var1;
               if(var6 < var2) {
                  ++var2;
               } else {
                  ++var6;
               }
            } else if(var2 < var6) {
               --var2;
               if(var1 > var6) {
                  ++var1;
               } else {
                  ++var6;
               }
            } else {
               --var6;
               if(var1 <= var2) {
                  ++var2;
               } else {
                  ++var1;
               }
            }

            int var16 = 0;
            if(var2 != var1) {
               var16 = (-var8 + var3 << 12) / (-var1 + var2);
            }

            int var17 = 0;
            if(var2 != var6) {
               var17 = (var5 + -var3 << 12) / (var6 + -var2);
            }

            int var18 = 0;
            if(var6 != var1) {
               var18 = (-var5 + var8 << 12) / (var1 - var6);
            }

            int var19 = -(var11 * var12) + var10 * var13;
            if(0 == var19) {
               return false;
            } else {
               int var20 = (-(var15 * var11) + var13 * var14 << 8) / var19;
               int var21 = (-(var12 * var14) + var15 * var10 << 8) / var19;
               if(var1 <= var2 && var1 <= var6) {
                  if(var1 >= gra.a) {
                     return true;
                  } else {
                     if(gra.a < var6) {
                        var6 = gra.a;
                     }

                     var7 = (var7 << 8) - var8 * var20 + var20;
                     if(gra.a < var2) {
                        var2 = gra.a;
                     }

                     if(var2 >= var6) {
                        var3 = var8 <<= -3454388;
                        var5 <<= 12;
                        if(var1 < 0) {
                           var7 -= var21 * var1;
                           var8 -= var1 * var16;
                           var3 -= var18 * var1;
                           var1 = 0;
                        }

                        if(0 > var6) {
                           var5 -= var17 * var6;
                           var6 = 0;
                        }

                        if((var6 == var1 || var16 <= var18) && (var6 != var1 || var17 <= var16)) {
                           var2 -= var6;
                           var6 -= var1;
                           var1 *= sqa.e;

                           while(true) {
                              --var6;
                              if(var6 < 0) {
                                 while(true) {
                                    --var2;
                                    if(0 > var2) {
                                       return true;
                                    }

                                    if(!kv.a((var5 >> 12) + 1, wga.a, 0, (var8 >> 12) - 1, var20, var1, var9 + -1417351581, var7)) {
                                       return false;
                                    }

                                    var7 += var21;
                                    var1 += sqa.e;
                                    var5 += var17;
                                    var8 += var16;
                                 }
                              }

                              if(!kv.a(1 + (var3 >> 12), wga.a, 0, -1 + (var8 >> 12), var20, var1, -90, var7)) {
                                 return false;
                              }

                              var8 += var16;
                              var3 += var18;
                              var1 += sqa.e;
                              var7 += var21;
                           }
                        } else {
                           var2 -= var6;
                           var6 -= var1;
                           var1 = sqa.e * var1;

                           while(true) {
                              --var6;
                              if(-1 < ~var6) {
                                 while(true) {
                                    --var2;
                                    if(var2 < 0) {
                                       return true;
                                    }

                                    if(!kv.a(1 + (var8 >> 12), wga.a, 0, (var5 >> 12) - 1, var20, var1, var9 ^ -1417351732, var7)) {
                                       return false;
                                    }

                                    var1 += sqa.e;
                                    var8 += var16;
                                    var7 += var21;
                                    var5 += var17;
                                 }
                              }

                              if(!kv.a((var8 >> 12) + 1, wga.a, 0, -1 + (var3 >> 12), var20, var1, -63, var7)) {
                                 return false;
                              }

                              var7 += var21;
                              var8 += var16;
                              var3 += var18;
                              var1 += sqa.e;
                           }
                        }
                     } else {
                        var5 = var8 <<= 12;
                        var3 <<= 12;
                        if(var1 < 0) {
                           var7 -= var21 * var1;
                           var5 -= var18 * var1;
                           var8 -= var1 * var16;
                           var1 = 0;
                        }

                        if(0 > var2) {
                           var3 -= var2 * var17;
                           var2 = 0;
                        }

                        if((var2 == var1 || var18 >= var16) && (var1 != var2 || var18 <= var17)) {
                           var6 -= var2;
                           var2 -= var1;
                           var1 = sqa.e * var1;

                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 while(true) {
                                    --var6;
                                    if(var6 < 0) {
                                       return true;
                                    }

                                    if(!kv.a(1 + (var5 >> 12), wga.a, 0, -1 + (var3 >> 12), var20, var1, -116, var7)) {
                                       return false;
                                    }

                                    var5 += var18;
                                    var7 += var21;
                                    var1 += sqa.e;
                                    var3 += var17;
                                 }
                              }

                              if(!kv.a(1 + (var5 >> 12), wga.a, 0, (var8 >> 12) - 1, var20, var1, -78, var7)) {
                                 return false;
                              }

                              var1 += sqa.e;
                              var8 += var16;
                              var5 += var18;
                              var7 += var21;
                           }
                        } else {
                           var6 -= var2;
                           var2 -= var1;
                           var1 = sqa.e * var1;

                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 while(true) {
                                    --var6;
                                    if(-1 < ~var6) {
                                       return true;
                                    }

                                    if(!kv.a(1 + (var3 >> 12), wga.a, 0, -1 + (var5 >> 12), var20, var1, -68, var7)) {
                                       return false;
                                    }

                                    var5 += var18;
                                    var7 += var21;
                                    var3 += var17;
                                    var1 += sqa.e;
                                 }
                              }

                              if(!kv.a((var8 >> 12) + 1, wga.a, 0, -1 + (var5 >> 12), var20, var1, var9 + -1417351612, var7)) {
                                 return false;
                              }

                              var5 += var18;
                              var7 += var21;
                              var8 += var16;
                              var1 += sqa.e;
                           }
                        }
                     }
                  }
               } else if(var2 > var6) {
                  if(gra.a <= var6) {
                     return true;
                  } else {
                     if(var1 > gra.a) {
                        var1 = gra.a;
                     }

                     if(var2 > gra.a) {
                        var2 = gra.a;
                     }

                     var4 = -(var5 * var20) + (var4 << 8) + var20;
                     if(var1 >= var2) {
                        var8 = var5 <<= 12;
                        var3 <<= 12;
                        if(0 > var6) {
                           var4 -= var21 * var6;
                           var8 -= var6 * var17;
                           var5 -= var6 * var18;
                           var6 = 0;
                        }

                        if(0 > var2) {
                           var3 -= var16 * var2;
                           var2 = 0;
                        }

                        if(var17 >= var18) {
                           var1 -= var2;
                           var2 -= var6;
                           var6 *= sqa.e;

                           while(true) {
                              --var2;
                              if(0 > var2) {
                                 while(true) {
                                    --var1;
                                    if(var1 < 0) {
                                       return true;
                                    }

                                    if(!kv.a(1 + (var3 >> 12), wga.a, 0, (var5 >> 12) - 1, var20, var6, var9 + -1417351756, var4)) {
                                       return false;
                                    }

                                    var6 += sqa.e;
                                    var5 += var18;
                                    var3 += var16;
                                    var4 += var21;
                                 }
                              }

                              if(!kv.a(1 + (var8 >> 12), wga.a, 0, -1 + (var5 >> 12), var20, var6, 97, var4)) {
                                 return false;
                              }

                              var6 += sqa.e;
                              var4 += var21;
                              var8 += var17;
                              var5 += var18;
                           }
                        } else {
                           var1 -= var2;
                           var2 -= var6;
                           var6 *= sqa.e;

                           while(true) {
                              --var2;
                              if(var2 < 0) {
                                 while(true) {
                                    --var1;
                                    if(var1 < 0) {
                                       return true;
                                    }

                                    if(!kv.a(1 + (var5 >> 12), wga.a, 0, (var3 >> 12) - 1, var20, var6, -94, var4)) {
                                       return false;
                                    }

                                    var4 += var21;
                                    var5 += var18;
                                    var3 += var16;
                                    var6 += sqa.e;
                                 }
                              }

                              if(!kv.a((var5 >> 12) + 1, wga.a, 0, -1 + (var8 >> 12), var20, var6, 117, var4)) {
                                 return false;
                              }

                              var5 += var18;
                              var8 += var17;
                              var6 += sqa.e;
                              var4 += var21;
                           }
                        }
                     } else {
                        var3 = var5 <<= 12;
                        var8 <<= 12;
                        if(var6 < 0) {
                           var4 -= var6 * var21;
                           var3 -= var6 * var17;
                           var5 -= var6 * var18;
                           var6 = 0;
                        }

                        if(0 > var1) {
                           var8 -= var16 * var1;
                           var1 = 0;
                        }

                        if(var17 >= var18) {
                           var2 -= var1;
                           var1 -= var6;
                           var6 *= sqa.e;

                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 while(true) {
                                    --var2;
                                    if(-1 < ~var2) {
                                       return true;
                                    }

                                    if(!kv.a((var3 >> 12) + 1, wga.a, 0, -1 + (var8 >> 12), var20, var6, var9 + -1417351572, var4)) {
                                       return false;
                                    }

                                    var4 += var21;
                                    var3 += var17;
                                    var8 += var16;
                                    var6 += sqa.e;
                                 }
                              }

                              if(!kv.a((var3 >> 12) + 1, wga.a, 0, (var5 >> 12) - 1, var20, var6, -122, var4)) {
                                 return false;
                              }

                              var6 += sqa.e;
                              var5 += var18;
                              var4 += var21;
                              var3 += var17;
                           }
                        } else {
                           var2 -= var1;
                           var1 -= var6;
                           var6 *= sqa.e;

                           while(true) {
                              --var1;
                              if(var1 < 0) {
                                 while(true) {
                                    --var2;
                                    if(0 > var2) {
                                       return true;
                                    }

                                    if(!kv.a((var8 >> 12) + 1, wga.a, 0, -1 + (var3 >> 12), var20, var6, -106, var4)) {
                                       return false;
                                    }

                                    var6 += sqa.e;
                                    var3 += var17;
                                    var4 += var21;
                                    var8 += var16;
                                 }
                              }

                              if(!kv.a(1 + (var5 >> 12), wga.a, 0, (var3 >> 12) - 1, var20, var6, -116, var4)) {
                                 return false;
                              }

                              var6 += sqa.e;
                              var3 += var17;
                              var5 += var18;
                              var4 += var21;
                           }
                        }
                     }
                  }
               } else if(var2 >= gra.a) {
                  return true;
               } else {
                  var0 = -(var20 * var3) + (var0 << 8) + var20;
                  if(var6 > gra.a) {
                     var6 = gra.a;
                  }

                  if(gra.a < var1) {
                     var1 = gra.a;
                  }

                  if(var1 <= var6) {
                     var5 = var3 <<= 12;
                     var8 <<= 12;
                     if(0 > var2) {
                        var0 -= var2 * var21;
                        var5 -= var16 * var2;
                        var3 -= var17 * var2;
                        var2 = 0;
                     }

                     if(var1 < 0) {
                        var8 -= var18 * var1;
                        var1 = 0;
                     }

                     if(var16 < var17) {
                        var6 -= var1;
                        var1 -= var2;
                        var2 *= sqa.e;

                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              while(true) {
                                 --var6;
                                 if(-1 < ~var6) {
                                    return true;
                                 }

                                 if(!kv.a(1 + (var3 >> 12), wga.a, 0, -1 + (var8 >> 12), var20, var2, var9 + -1417351794, var0)) {
                                    return false;
                                 }

                                 var0 += var21;
                                 var3 += var17;
                                 var2 += sqa.e;
                                 var8 += var18;
                              }
                           }

                           if(!kv.a(1 + (var3 >> 12), wga.a, 0, -1 + (var5 >> 12), var20, var2, -85, var0)) {
                              return false;
                           }

                           var3 += var17;
                           var2 += sqa.e;
                           var5 += var16;
                           var0 += var21;
                        }
                     } else {
                        var6 -= var1;
                        var1 -= var2;
                        var2 *= sqa.e;

                        while(true) {
                           --var1;
                           if(var1 < 0) {
                              while(true) {
                                 --var6;
                                 if(var6 < 0) {
                                    return true;
                                 }

                                 if(!kv.a(1 + (var8 >> 12), wga.a, 0, (var3 >> 12) - 1, var20, var2, var9 ^ 1417351772, var0)) {
                                    return false;
                                 }

                                 var8 += var18;
                                 var3 += var17;
                                 var2 += sqa.e;
                                 var0 += var21;
                              }
                           }

                           if(!kv.a(1 + (var5 >> 12), wga.a, 0, (var3 >> 12) - 1, var20, var2, 120, var0)) {
                              return false;
                           }

                           var0 += var21;
                           var3 += var17;
                           var2 += sqa.e;
                           var5 += var16;
                        }
                     }
                  } else {
                     var8 = var3 <<= 12;
                     var5 <<= 12;
                     if(0 > var2) {
                        var0 -= var2 * var21;
                        var3 -= var2 * var17;
                        var8 -= var2 * var16;
                        var2 = 0;
                     }

                     if(var6 < 0) {
                        var5 -= var6 * var18;
                        var6 = 0;
                     }

                     if((var6 == var2 || var17 <= var16) && (var2 != var6 || var18 >= var16)) {
                        var1 -= var6;
                        var6 -= var2;
                        var2 *= sqa.e;

                        while(true) {
                           --var6;
                           if(var6 < 0) {
                              while(true) {
                                 --var1;
                                 if(0 > var1) {
                                    return true;
                                 }

                                 if(!kv.a(1 + (var8 >> 12), wga.a, 0, -1 + (var5 >> 12), var20, var2, 74, var0)) {
                                    return false;
                                 }

                                 var8 += var16;
                                 var5 += var18;
                                 var0 += var21;
                                 var2 += sqa.e;
                              }
                           }

                           if(!kv.a(1 + (var8 >> 12), wga.a, 0, (var3 >> 12) - 1, var20, var2, -75, var0)) {
                              return false;
                           }

                           var3 += var17;
                           var0 += var21;
                           var8 += var16;
                           var2 += sqa.e;
                        }
                     } else {
                        var1 -= var6;
                        var6 -= var2;
                        var2 *= sqa.e;

                        while(true) {
                           --var6;
                           if(var6 < 0) {
                              while(true) {
                                 --var1;
                                 if(-1 < ~var1) {
                                    return true;
                                 }

                                 if(!kv.a((var5 >> 12) + 1, wga.a, 0, -1 + (var8 >> 12), var20, var2, var9 ^ 1417351803, var0)) {
                                    return false;
                                 }

                                 var0 += var21;
                                 var5 += var18;
                                 var2 += sqa.e;
                                 var8 += var16;
                              }
                           }

                           if(!kv.a(1 + (var3 >> 12), wga.a, 0, (var8 >> 12) - 1, var20, var2, var9 ^ 1417351752, var0)) {
                              return false;
                           }

                           var3 += var17;
                           var2 += sqa.e;
                           var0 += var21;
                           var8 += var16;
                        }
                     }
                  }
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   oqa(String var1) {
      super(var1);
   }

}
