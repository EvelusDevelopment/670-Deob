import jagdx.IUnknown;

final class po {

   static int d;
   private Object[] a;
   static int c;
   static Object[] f_i;
   static int f;
   static int g;
   static int h;
   static int e;
   static Object[] b = ed.a(6, new Object[1], (byte)-126, 75);


   static final int a(int var0, Object[] var1) {
      ++e;
      return var0 != -17010?-46:((int[])((int[])var1[1]))[0] + ((int[])((int[])((Object[])((Object[])var1[3]))[1]))[6] + ((int[])((int[])var1[1]))[4];
   }

   static final Object[] a(Object[] var0, Object[] var1, int var2) {
      if(var2 != 0) {
         a((Object[])((Object[])b[0]), (String[])null, (int[])null, -95, (String)null, (cga[])((cga[])var0[0]));
      }

      if(null == var1[1]) {
         var1[1] = new int[2];
      }

      ++h;
      aa.a(var2 ^ 15022, var0, var1);
      return var1;
   }

   protected final void finalize() throws Throwable {
      ++f;
      Object[] var1 = this.a;
      if(null != var1 && var1.length == 8) {
         sw.a(var1, (byte)89);
         if(client.f_vb == 0) {
            return;
         }
      }

      kba.a((byte)19, var1);
   }

   static final void b(int var0, Object[] var1) {
      if(((long[])((long[])var1[2]))[0] != 0L) {
         IUnknown.Release(((long[])((long[])var1[2]))[0]);
         ((long[])((long[])var1[2]))[0] = 0L;
      }

      ++d;
      if(var0 > -36) {
         f_i = (Object[])((Object[])b[1]);
      }

   }

   po(Object[] var1) {
      this.a = var1;
   }

   static final int a(Object[] var0, String[] var1, int[] var2, int var3, String var4, cga[] var5) {
      ++g;
      if(var4 == null) {
         return 0;
      } else {
         int var6 = 0;
         int var7 = 0;
         int var8 = -1;
         int var9 = 0;
         byte var10 = 0;
         if(null != var0 && (var0.length == 6 || 2 == var0.length && var0[1].equals(Integer.valueOf(0)))) {
            uga.a((String)null, (Object[])null, (byte)-63);
         }

         int var11 = -1;
         int var12 = -1;
         int var13 = 0;
         int var14 = var4.length();

         for(int var15 = 0; var14 > var15; ++var15) {
            int var16 = 255 & so.a((byte)-102, var4.charAt(var15));
            int var17 = 0;
            if(var16 == 60) {
               var11 = var15;
            } else {
               int var18;
               if(-1 != var11) {
                  if(var16 != 62) {
                     continue;
                  }

                  var18 = var11;
                  String var19 = var4.substring(var11 + 1, var15);
                  var11 = -1;
                  if(var19.equals("br")) {
                     var1[var13] = var4.substring(var7, var15 + 1);
                     ++var13;
                     if(var13 >= var1.length) {
                        return 0;
                     }

                     var12 = -1;
                     var8 = -1;
                     var6 = 0;
                     var7 = 1 + var15;
                     continue;
                  }

                  if(var19.equals("lt")) {
                     var17 += hsa.a(60, var0, true);
                     if(var0[2] != null && -1 != var12) {
                        var17 += ((byte[][])((byte[][])var0[2]))[var12][60];
                     }

                     var12 = 60;
                  } else if(var19.equals("gt")) {
                     var17 += hsa.a(62, var0, true);
                     if(var0[2] != null && ~var12 != 0) {
                        var17 += ((byte[][])((byte[][])var0[2]))[var12][62];
                     }

                     var12 = 62;
                  } else if(!var19.equals("nbsp")) {
                     if(!var19.equals("shy")) {
                        if(var19.equals("times")) {
                           var17 += hsa.a(215, var0, true);
                           if(null != var0[2] && -1 != var12) {
                              var17 += ((byte[][])((byte[][])var0[2]))[var12][215];
                           }

                           var12 = 215;
                        } else if(!var19.equals("euro")) {
                           if(!var19.equals("copy")) {
                              if(var19.equals("reg")) {
                                 var17 += hsa.a(174, var0, true);
                                 if(null != var0[2] && -1 != var12) {
                                    var17 += ((byte[][])((byte[][])var0[2]))[var12][174];
                                 }

                                 var12 = 174;
                              } else if(var19.startsWith("img=") && null != var5) {
                                 try {
                                    int var20 = bca.a((byte)73, var19.substring(4));
                                    var12 = -1;
                                    var17 += var5[var20].f();
                                 } catch (Exception var21) {
                                    ;
                                 }
                              }
                           } else {
                              var17 += hsa.a(169, var0, true);
                              if(var0[2] != null && var12 != -1) {
                                 var17 += ((byte[][])((byte[][])var0[2]))[var12][169];
                              }

                              var12 = 169;
                           }
                        } else {
                           var17 += hsa.a(8364, var0, true);
                           if(null != var0[2] && ~var12 != 0) {
                              var17 += ((byte[][])((byte[][])var0[2]))[var12][8364];
                           }

                           var12 = 8364;
                        }
                     } else {
                        var17 += hsa.a(173, var0, true);
                        if(var0[2] != null && -1 != var12) {
                           var17 += ((byte[][])((byte[][])var0[2]))[var12][173];
                        }

                        var12 = 173;
                     }
                  } else {
                     var17 += hsa.a(160, var0, true);
                     if(null != var0[2] && -1 != var12) {
                        var17 += ((byte[][])((byte[][])var0[2]))[var12][160];
                     }

                     var12 = 160;
                  }

                  var16 = -1;
               } else {
                  var18 = var15;
                  var17 += hsa.a(var16, var0, true);
                  if(null != var0[2] && ~var12 != 0) {
                     var17 += ((byte[][])((byte[][])var0[2]))[var12][var16];
                  }

                  var12 = var16;
               }

               if(0 < var17) {
                  var6 += var17;
                  if(var2 != null) {
                     if(var16 == 32) {
                        var10 = 1;
                        var8 = var15;
                        var9 = var6;
                     }

                     if(var2[var2.length <= var13?var2.length + -1:var13] < var6) {
                        if(var8 < 0) {
                           var1[var13] = var4.substring(var7, var18);
                           ++var13;
                           if(var1.length <= var13) {
                              return 0;
                           }

                           var6 = var17;
                           var7 = var18;
                           var8 = -1;
                           var12 = -1;
                        } else {
                           var1[var13] = var4.substring(var7, -var10 + 1 + var8);
                           ++var13;
                           if(~var13 <= ~var1.length) {
                              return 0;
                           }

                           var7 = 1 + var8;
                           var6 -= var9;
                           var12 = -1;
                           var8 = -1;
                        }
                     }

                     if(45 == var16) {
                        var9 = var6;
                        var10 = 0;
                        var8 = var15;
                     }
                  }
               }
            }
         }

         if(var3 >= -63) {
            b(-72, (Object[])null);
         }

         if(var7 < var4.length()) {
            var1[var13] = var4.substring(var7, var4.length());
            ++var13;
         }

         return var13;
      }
   }

   final void a(byte var1) throws Throwable {
      ++c;
      super.finalize();
      int var2 = -34 / ((var1 - 48) / 36);
   }

}
