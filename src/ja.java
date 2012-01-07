import java.util.Random;

abstract class ja {

   static int f_i;
   static int y;
   static int v;
   static int f_l;
   static int b;
   static int o;
   static int m;
   static int k;
   static int t;
   static int j;
   static int f;
   static int p;
   static int q;
   static int s;
   private Object[] g;
   static int d;
   static int u;
   static int z;
   static int a;
   private ta c;
   static Object[] w = ura.a(-50, new Object[2]);
   static int x;
   static int h;
   static int r;
   static Object[] n = sd.a(new Object[1], 85, (byte)126);
   static int e = 5010;


   final int a(int var1, String var2, cga[] var3, int var4, int var5, int var6, int var7, int var8, byte var9, int var10, int var11, Class_s var12, int var13, int var14, int[] var15, int var16) {
      if(var9 > -74) {
         return -29;
      } else {
         ++b;
         return this.a(var12, var2, 112, var7, var10, var13, var15, var8, var14, var16, var5, var4, var3, var1, var11, 0, var6);
      }
   }

   abstract void HA(char var1, int var2, int var3, int var4, boolean var5);

   static final Class_h a(Object[] var0, int var1) {
      if(var1 >= -38) {
         a(-61, -125, (Object[])null, (Object[])null, -49, (Object[])((Object[])w[1]));
      }

      ++t;
      return new Class_h(var0);
   }

   final void a(String var1, int[] var2, int var3, cga[] var4, int var5, int var6, int var7, int var8) {
      if(var7 != 15247) {
         n = (Object[])null;
      }

      ++j;
      if(var1 != null) {
         this.a((byte)82, var3, var5);
         this.a(var6, var1, 0, var4, (byte)-75, var8, var2, 0, (Class_s)null);
      }
   }

   static final Object[] a(int var0, int var1, Object[] var2, Object[] var3, int var4, Object[] var5) {
      ++v;
      return var0 != 1?(Object[])((Object[])n[8]):jt.a(var3, 1, var1, var5, var4, var2);
   }

   final void a(int var1, int var2, int var3, String var4, int var5, int var6) {
      ++f_i;
      if(var4 != null) {
         this.a((byte)82, var6, var2);
         this.a(var3, var4, 0, (cga[])null, (byte)-75, var5, (int[])null, 0, (Class_s)null);
         if(var1 <= 41) {
            a((byte)110, (Object[])null);
         }

      }
   }

   final void a(int var1, String var2, byte var3, int var4, int var5, int var6) {
      ++q;
      if(null != var2) {
         this.a((byte)82, var4, var6);
         this.a(var1, var2, 0, (cga[])null, (byte)-75, var5 - uga.a(var2, this.g, (byte)-12) / 2, (int[])null, 0, (Class_s)null);
         if(var3 > -95) {
            this.a(((int[])((int[])((Object[])((Object[])n[2]))[7]))[12], (String)null, ((int[])((int[])w[5]))[9], (cga[])null, (byte)-84, 96, (int[])null, ((int[])((int[])n[16]))[0], (Class_s)null);
         }

      }
   }

   private final void a(int var1, String var2, int var3, cga[] var4, byte var5, int var6, int[] var7, int var8, Class_s var9) {
      var1 -= ((int[])((int[])this.g[1]))[1];
      ++u;
      int var10 = -1;
      int var11 = -1;
      if(var5 == -75) {
         int var12 = var2.length();

         for(int var13 = 0; var12 > var13; ++var13) {
            char var14 = (char)(so.a((byte)-102, var2.charAt(var13)) & 255);
            if(var14 != 60) {
               if(62 == var14 && ~var10 != 0) {
                  String var15 = var2.substring(1 + var10, var13);
                  var10 = -1;
                  if(var15.equals("lt")) {
                     var14 = 60;
                  } else if(!var15.equals("gt")) {
                     if(!var15.equals("nbsp")) {
                        if(!var15.equals("shy")) {
                           if(var15.equals("times")) {
                              var14 = 215;
                           } else if(var15.equals("euro")) {
                              var14 = 8364;
                           } else if(!var15.equals("copy")) {
                              if(!var15.equals("reg")) {
                                 if(var15.startsWith("img=")) {
                                    try {
                                       int var16 = bca.a((byte)-127, var15.substring(4));
                                       cga var17 = var4[var16];
                                       int var18 = var7 == null?var17.d():var7[var16];
                                       if(16777215 != ~(-16777216 & hd.a)) {
                                          var17.a(var6, var1 + ((int[])((int[])this.g[1]))[1] - var18, 0, 16777215 | -16777216 & hd.a, 1);
                                       } else {
                                          var17.a(var6, var1 + ((int[])((int[])this.g[1]))[1] - var18, 1, 0, 1);
                                       }

                                       var6 += var4[var16].f();
                                       var11 = -1;
                                    } catch (Exception var19) {
                                       ;
                                    }
                                 } else {
                                    this.a(var15, (byte)-104);
                                 }
                                 continue;
                              }

                              var14 = 174;
                           } else {
                              var14 = 169;
                           }
                        } else {
                           var14 = 173;
                        }
                     } else {
                        var14 = 160;
                     }
                  } else {
                     var14 = 62;
                  }
               }

               if(-1 == var10) {
                  if(var11 != -1) {
                     var6 += fw.a(this.g, var14, var11, 123);
                  }

                  if(32 == var14) {
                     if(cta.v > 0) {
                        wsa.e += cta.v;
                        var6 += wsa.e >> 8;
                        wsa.e &= 255;
                     }
                  } else if(var9 != null) {
                     if(0 != (sea.a & -16777216)) {
                        this.a(var14, 1 + var6, var1 + 1, sea.a, true, var9, var3, var8);
                     }

                     this.a(var14, var6, var1, hd.a, false, var9, var3, var8);
                  } else {
                     if((sea.a & -16777216) != 0) {
                        this.HA(var14, var6 + 1, 1 + var1, sea.a, true);
                     }

                     this.HA(var14, var6, var1, hd.a, false);
                  }

                  int var20 = hsa.a(var14, this.g, true);
                  if(-1 != sv.c) {
                     this.c.a(sv.c, var6, (int)(0.7D * (double)((int[])((int[])this.g[1]))[1]) + var1, var20, (byte)-57);
                  }

                  if(~kj.h != 0) {
                     this.c.a(kj.h, var6, 1 + ((int[])((int[])this.g[1]))[1] + var1, var20, (byte)-112);
                  }

                  var11 = var14;
                  var6 += var20;
               }
            } else {
               var10 = var13;
            }
         }

      }
   }

   final int a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String var9, int[] var10, cga[] var11, int[] var12, Random var13, int var14, int var15) {
      ++f_l;
      if(var9 != null) {
         var13.setSeed((long)var6);
         int var16 = 192 + (31 & var13.nextInt());
         this.a((byte)82, var16 << 24 | var1 & 16777215, var16 << 24 | 16777215 & var2);
         int var17 = var9.length();
         int[] var18 = new int[var17];
         int var19 = 0;
         if(var7 < 82) {
            a(7, ((int[])((int[])this.g[5]))[3], (Object[])null, (Object[])((Object[])((Object[])((Object[])n[11]))[1]), -125, (Object[])null);
         }

         int var20;
         for(var20 = 0; var20 < var17; ++var20) {
            var18[var20] = var19;
            if((3 & var13.nextInt()) == 0) {
               ++var19;
            }
         }

         var20 = var5;
         int var21 = var8 + ((int[])((int[])this.g[1]))[0];
         if(1 != var15) {
            if(2 == var15) {
               var21 = var8 + var14 - ((int[])((int[])this.g[1]))[2];
            }
         } else {
            var21 += (-((int[])((int[])this.g[1]))[2] + var14 + -((int[])((int[])this.g[1]))[0]) / 2;
         }

         int var22 = -1;
         if(1 != var4) {
            if(var4 == 2) {
               var22 = uga.a(var9, this.g, (byte)123) + var19;
               var20 = var5 + -var22 + var3;
            }
         } else {
            var22 = uga.a(var9, this.g, (byte)-98) + var19;
            var20 = var5 + (-var22 + var3) / 2;
         }

         this.a((int[])null, var12, true, var18, var21, var20, var9, var11);
         if(null != var10) {
            if(var22 == -1) {
               var22 = var19 + uga.a(var9, this.g, (byte)113);
            }

            var10[0] = var20;
            var10[2] = var22;
            var10[3] = ((int[])((int[])this.g[1]))[0] + ((int[])((int[])this.g[1]))[2];
            var10[1] = -((int[])((int[])this.g[1]))[0] + var21;
         }

         return var19;
      } else {
         return 0;
      }
   }

   final void a(int var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      ++f;
      if(null != var2) {
         this.a((byte)82, var5, var1);
         int var8 = var2.length();
         if(var3 != -202) {
            this.g = (Object[])null;
         }

         int[] var9 = new int[var8];
         int[] var10 = new int[var8];

         for(int var11 = 0; var8 > var11; ++var11) {
            var9[var11] = (int)(Math.sin((double)var7 / 5.0D + (double)var11 / 5.0D) * 5.0D);
            var10[var11] = (int)(Math.sin((double)var7 / 5.0D + (double)var11 / 3.0D) * 5.0D);
         }

         this.a(var10, (int[])null, true, var9, var6, -(uga.a(var2, this.g, (byte)113) / 2) + var4, var2, (cga[])null);
      }
   }

   final void a(int var1, byte var2, int var3, int var4, int var5, int var6, String var7) {
      ++z;
      if(var7 != null) {
         this.a((byte)82, var1, var5);
         int var8 = var7.length();
         int[] var9 = new int[var8];

         for(int var10 = 0; var8 > var10; ++var10) {
            var9[var10] = (int)(5.0D * Math.sin((double)var6 / 5.0D + (double)var10 / 2.0D));
         }

         this.a(var9, (int[])null, true, (int[])null, var3, var4 - uga.a(var7, this.g, (byte)21) / 2, var7, (cga[])null);
         if(var2 != 118) {
            a((Object[])null, (int)-32);
         }

      }
   }

   final void a(int var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      ++y;
      if(var2 != null) {
         this.a((byte)82, var8, var6);
         double var9 = -((double)var1 / 8.0D) + 7.0D;
         if(var9 < 0.0D) {
            var9 = 0.0D;
         }

         int var11 = var2.length();
         int[] var12 = new int[var11];

         for(int var13 = 0; var13 < var11; ++var13) {
            var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var7 / 1.0D) * var9);
         }

         this.a(var12, (int[])null, true, (int[])null, var4, var5 - uga.a(var2, this.g, (byte)-27) / var3, var2, (cga[])null);
      }
   }

   private final void a(int[] var1, int[] var2, boolean var3, int[] var4, int var5, int var6, String var7, cga[] var8) {
      ++k;
      var5 -= ((int[])((int[])this.g[1]))[1];
      int var9 = -1;
      int var10 = -1;
      int var11 = 0;
      int var12 = var7.length();
      if(!var3) {
         a(((byte[])((byte[])n[6]))[17], (Object[])null);
      }

      for(int var13 = 0; var12 > var13; ++var13) {
         char var14 = (char)(255 & so.a((byte)-102, var7.charAt(var13)));
         if(var14 == 60) {
            var9 = var13;
         } else {
            int var17;
            int var16;
            if(var14 == 62 && ~var9 != 0) {
               String var15 = var7.substring(1 + var9, var13);
               var9 = -1;
               if(var15.equals("lt")) {
                  var14 = 60;
               } else if(!var15.equals("gt")) {
                  if(var15.equals("nbsp")) {
                     var14 = 160;
                  } else if(var15.equals("shy")) {
                     var14 = 173;
                  } else if(!var15.equals("times")) {
                     if(var15.equals("euro")) {
                        var14 = 8364;
                     } else if(var15.equals("copy")) {
                        var14 = 169;
                     } else {
                        if(!var15.equals("reg")) {
                           if(!var15.startsWith("img=")) {
                              this.a(var15, (byte)-124);
                           } else {
                              try {
                                 if(var4 != null) {
                                    var16 = var4[var11];
                                 } else {
                                    var16 = 0;
                                 }

                                 if(null != var1) {
                                    var17 = var1[var11];
                                 } else {
                                    var17 = 0;
                                 }

                                 ++var11;
                                 int var18 = bca.a((byte)-122, var15.substring(4));
                                 cga var19 = var8[var18];
                                 int var20 = var2 != null?var2[var18]:var19.d();
                                 var19.a(var6 + var16, var5 - (-((int[])((int[])this.g[1]))[1] + var20 - var17), 1, 0, 1);
                                 var10 = -1;
                                 var6 += var8[var18].f();
                              } catch (Exception var21) {
                                 ;
                              }
                           }
                           continue;
                        }

                        var14 = 174;
                     }
                  } else {
                     var14 = 215;
                  }
               } else {
                  var14 = 62;
               }
            }

            if(-1 == var9) {
               if(-1 != var10) {
                  var6 += fw.a(this.g, var14, var10, 126);
               }

               int var22;
               if(null == var4) {
                  var22 = 0;
               } else {
                  var22 = var4[var11];
               }

               if(null != var1) {
                  var16 = var1[var11];
               } else {
                  var16 = 0;
               }

               ++var11;
               if(32 == var14) {
                  if(0 < cta.v) {
                     wsa.e += cta.v;
                     var6 += wsa.e >> 8;
                     wsa.e &= 255;
                  }
               } else {
                  if(0 != (sea.a & -16777216)) {
                     this.HA(var14, var22 + var6 + 1, 1 + var5 + var16, sea.a, true);
                  }

                  this.HA(var14, var22 + var6, var16 + var5, hd.a, false);
               }

               var17 = hsa.a(var14, this.g, true);
               if(-1 != sv.c) {
                  this.c.a(sv.c, var6, var5 + (int)((double)((int[])((int[])this.g[1]))[1] * 0.7D), var17, (byte)-121);
               }

               if(-1 != kj.h) {
                  this.c.a(kj.h, var6, var5 + ((int[])((int[])this.g[1]))[1], var17, (byte)91);
               }

               var10 = var14;
               var6 += var17;
            }
         }
      }

   }

   abstract void a(char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8);

   private final void a(boolean var1, int var2, String var3) {
      if(!var1) {
         e = -77;
      }

      ++r;
      int var4 = 0;
      boolean var5 = false;

      for(int var6 = 0; ~var6 > ~var3.length(); ++var6) {
         char var7 = var3.charAt(var6);
         if(var7 == 60) {
            var5 = true;
         } else if(var7 == 62) {
            var5 = false;
         } else if(!var5 && 32 == var7) {
            ++var4;
         }
      }

      if(0 < var4) {
         cta.v = (-uga.a(var3, this.g, (byte)119) + var2 << 8) / var4;
      }

   }

   private final void a(byte var1, int var2, int var3) {
      if(~var2 == 0) {
         var2 = 0;
      }

      ++s;
      vb.a = var3;
      hd.a = var3;
      sv.c = -1;
      if(var1 == 82) {
         kj.h = -1;
         cta.v = 0;
         wsa.e = 0;
         foa.c = var2;
         sea.a = var2;
      }
   }

   private final void a(String var1, byte var2) {
      ++x;

      try {
         if(!var1.startsWith("col=")) {
            if(var1.equals("/col")) {
               hd.a = hd.a & -16777216 | vb.a & 16777215;
            }
         } else {
            hd.a = -16777216 & hd.a | 16777215 & lia.a(115, var1.substring(4), 16);
         }

         if(!var1.startsWith("argb=")) {
            if(!var1.equals("/argb")) {
               if(var1.startsWith("str=")) {
                  sv.c = -16777216 & hd.a | lia.a(108, var1.substring(4), 16);
               } else if(!var1.equals("str")) {
                  if(var1.equals("/str")) {
                     sv.c = -1;
                  } else if(!var1.startsWith("u=")) {
                     if(var1.equals("u")) {
                        kj.h = -16777216 & hd.a;
                     } else if(var1.equals("/u")) {
                        kj.h = -1;
                     } else if(var1.equalsIgnoreCase("shad=-1")) {
                        sea.a = 0;
                     } else if(var1.startsWith("shad=")) {
                        sea.a = hd.a & -16777216 | lia.a(124, var1.substring(5), 16);
                     } else if(!var1.equals("shad")) {
                        if(!var1.equals("/shad")) {
                           if(var1.equals("br")) {
                              this.a((byte)82, foa.c, vb.a);
                           }
                        } else {
                           sea.a = foa.c;
                        }
                     } else {
                        sea.a = hd.a & -16777216;
                     }
                  } else {
                     kj.h = hd.a & -16777216 | lia.a(101, var1.substring(2), 16);
                  }
               } else {
                  sv.c = 8388608 | hd.a & -16777216;
               }
            } else {
               hd.a = vb.a;
            }
         } else {
            hd.a = lia.a(107, var1.substring(5), 16);
         }

         if(var2 > -86) {
            ((byte[])((byte[])w[13]))[9] = 63;
         }
      } catch (Exception var4) {
         ;
      }

   }

   ja(ta var1, Object[] var2) {
      this.g = var2;
      this.c = var1;
   }

   static final Object[] a(byte var0, Object[] var1, int var2) {
      ++a;
      Object[] var5;
      synchronized(var1[0]) {
         boa var3;
         var5 = null != (var3 = (boa)dna.a((byte)34, (Object[])((Object[])var1[0]), (long)var2))?var3.v:null;
      }

      if(null != var5) {
         return var5;
      } else {
         byte[] var6;
         synchronized(var1[1]) {
            var6 = qn.a(5, var2, (Object[])((Object[])var1[1]), -52);
            if(var0 >= -75) {
               a(-40, 102, (byte)121, (Object[])null);
            }
         }

         Object[] var8 = new Object[2];
         if(var1 != null && (var1.length == 7 && var1[0].equals(Integer.valueOf(2)) && var1[0].equals(Boolean.valueOf(false)) || -29 == ~var1.length)) {
            a((byte)-99, new Object[5][], -59);
         }

         Class_s.a(-127, var8);
         ((int[])((int[])var8[1]))[0] = 0;
         boa var10 = new boa(var8);
         var8[0] = var10;
         var5 = var8;
         if(null != var6) {
            Object[] var9 = jta.a((byte)-122, var6, new Object[3]);

            while(true) {
               int var15 = fh.a(var9, false);
               if(0 == var15) {
                  if(null != var9 && var9.length == 1) {
                     return null;
                  }
                  break;
               }

               if(2 == var15) {
                  ((int[])((int[])var5[1]))[0] = de.a((int)0, var9);
               }
            }
         }

         synchronized(var1[0]) {
            il.a((long)var2, var5 == null?null:var5[0], true, (Object[])((Object[])var1[0]));
            return var5;
         }
      }
   }

   static final void a(byte var0, Object[] var1) {
      ++p;
      Object[] var2 = jh.a(((int[])((int[])((Object[])((Object[])var1[0]))[1]))[5], false, (Object[])((Object[])var1[1]));
      if(var0 > -17) {
         a(((int[])((int[])var1[7]))[0], -45, (Object[])null, (Object[])null, 106, (Object[])((Object[])((Object[])((Object[])var1[0]))[9]));
      }

      var1[3] = lna.g.a(var2, aea.a((Object[])((Object[])var1[2]), ((int[])((int[])((Object[])((Object[])var1[0]))[1]))[5]), true);
   }

   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, int var3) {
      ++d;
      if(var3 != 24000) {
         a((Object[])null, (int)20);
      }

      lna.a((byte)105, var2, var1);
      var2[8] = var0;
      var2[7] = null;
      return var2;
   }

   static final void a(int var0, int var1, byte var2, Object[] var3) {
      ++o;
      if(var3 != null && 15 == var3.length) {
         maa.a(var3, var0, -126, var1);
      } else {
         gv.a(var3, false, var1, var0);
         if(var2 <= 3) {
            n = new Object[15];
         }

      }
   }

   final void a(int var1, int var2, boolean var3, int var4, int var5, String var6) {
      ++m;
      if(var6 != null) {
         this.a((byte)82, var1, var2);
         this.a(var5, var6, 0, (cga[])null, (byte)-75, -uga.a(var6, this.g, (byte)118) + var4, (int[])null, 0, (Class_s)null);
         if(!var3) {
            n = (Object[])null;
         }

      }
   }

   final int a(Class_s var1, String var2, int var3, int var4, int var5, int var6, int[] var7, int var8, int var9, int var10, int var11, int var12, cga[] var13, int var14, int var15, int var16, int var17) {
      ++h;
      if(null == var2) {
         return 0;
      } else {
         this.a((byte)82, var8, var11);
         if(var3 < 97) {
            return ((int[])((int[])this.g[2]))[6];
         } else {
            if(var9 == 0) {
               var9 = ((int[])((int[])this.g[1]))[1];
            }

            int[] var18;
            if(~var17 > ~(((int[])((int[])this.g[1]))[0] + ((int[])((int[])this.g[1]))[2] + var9) && var9 + var9 > var17) {
               var18 = null;
            } else {
               var18 = new int[]{var12};
            }

            if(-1 == var16) {
               var16 = var17 / var9;
               if(0 >= var16) {
                  var16 = 1;
               }
            }

            int var19 = po.a(this.g, eca.c, var18, -74, var2, var13);
            if(0 < var16 && var16 <= var19) {
               var19 = var16;
               eca.c[-1 + var16] = gi.a(eca.c[var16 - 1], var13, var12, this.g, (byte)-103);
            }

            if(var14 == 3 && var19 == 1) {
               var14 = 1;
            }

            int var21;
            int var20;
            if(var14 == 0) {
               var20 = var6 + ((int[])((int[])this.g[1]))[0];
            } else if(1 != var14) {
               if(2 == var14) {
                  var20 = -((-1 + var19) * var9) + -((int[])((int[])this.g[1]))[2] + var6 + var17;
               } else {
                  var21 = (-(var9 * (var19 - 1)) + -((int[])((int[])this.g[1]))[2] + -((int[])((int[])this.g[1]))[0] + var17) / (1 + var19);
                  if(var21 < 0) {
                     var21 = 0;
                  }

                  var9 += var21;
                  var20 = var6 + ((int[])((int[])this.g[1]))[0] + var21;
               }
            } else {
               var20 = ((int[])((int[])this.g[1]))[0] + var6 + (var17 + -((int[])((int[])this.g[1]))[0] - ((int[])((int[])this.g[1]))[2] + -(var9 * (-1 + var19))) / 2;
            }

            for(var21 = 0; var21 < var19; ++var21) {
               if(0 != var4) {
                  if(1 == var4) {
                     this.a(var20, eca.c[var21], var5, var13, (byte)-75, (var12 - uga.a(eca.c[var21], this.g, (byte)117)) / 2 + var10, var7, var15, var1);
                  } else if(var4 != 2) {
                     if(var19 - 1 == var21) {
                        this.a(var20, eca.c[var21], var5, var13, (byte)-75, var10, var7, var15, var1);
                     } else {
                        this.a(true, var12, eca.c[var21]);
                        this.a(var20, eca.c[var21], var5, var13, (byte)-75, var10, var7, var15, var1);
                        cta.v = 0;
                     }
                  } else {
                     this.a(var20, eca.c[var21], var5, var13, (byte)-75, -uga.a(eca.c[var21], this.g, (byte)120) + var12 + var10, var7, var15, var1);
                  }
               } else {
                  this.a(var20, eca.c[var21], var5, var13, (byte)-75, var10, var7, var15, var1);
               }

               var20 += var9;
            }

            return var19;
         }
      }
   }

}
