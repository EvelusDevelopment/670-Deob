import jagdx.IDirect3DDevice;
import jagdx.fna;
import java.awt.Canvas;
import java.awt.Dimension;

final class jla {

   static int e;
   static int b;
   static int f;
   static int c;
   static int a;
   static int d;


   static final void a(byte var0, Object[] var1) {
      ++c;
      if(var1[1] == null) {
         var1[1] = new int[2];
      }

      if(var0 >= 61) {
         ;
      }
   }

   static final boolean a(Object[] var0, Object[] var1, int var2, int var3, Object[] var4, Object[][] var5) {
      ++e;
      if(var3 != 0) {
         return false;
      } else if(var4 != null && var4.length == 3) {
         boolean var6;
         if(var0 != null) {
            if(var1 != null && -13 == ~var1.length && var1[0].equals(Boolean.valueOf(false))) {
               a((Object[])null, (Object[])null, -17, 0, (Object[])null, (Object[][])null);
            }

            if(~((int[])((int[])var4[1]))[0] != ~uta.a((byte)13, var0)) {
               var6 = false;
               return var6;
            }

            if(((int[])((int[])var4[1]))[1] > fg.b(var0, (byte)-68)) {
               var6 = false;
               return var6;
            }

            if(var4 != null && -15 == ~var4.length) {
               return true;
            }

            int[] var7 = (int[])((int[])var4[0]);

            for(int var8 = 0; var7.length > var8; ++var8) {
               int var9 = var7[var8];
               if(!oc.a(var1, var9, (byte)-62)) {
                  var6 = false;
                  return var6;
               }
            }
         } else if(~((int[])((int[])var4[1]))[0] != 0) {
            var6 = false;
            return var6;
         }

         var6 = true;
         return var6;
      } else if(var4 != null && var4.length == 2) {
         return oq.a(-69, var5, var1, var2, var4, var0);
      } else if(var4 != null && var4.length == 1) {
         return gh.a(123, var2, var5, var4, var1, var0);
      } else {
         throw new IllegalStateException();
      }
   }

   static final ta a(Canvas var0, int var1, qa var2, int var3, boolean var4, Object[] var5) {
      ++a;
      if(!var4) {
         ((byte[])((byte[])var5[7]))[0] = -113;
      }

      int var6 = 0;
      int var7 = 0;
      if(null != var0) {
         Dimension var8 = var0.getSize();
         var6 = var8.width;
         var7 = var8.height;
      }

      return ta.a(var6, var1, var2, var3, var7, var0, 128, var5);
   }

   static final boolean a(int var0, Object[] var1) {
      if(var0 != -29005) {
         a((Canvas)null, ((int[])((int[])((Object[])((Object[])var1[4]))[7]))[3], (qa)null, ((int[])((int[])var1[1]))[2], true, (Object[])((Object[])((Object[])((Object[])var1[11]))[9]));
      }

      ++f;
      if(var1 != null && var1.length == 8) {
         ((boolean[])((boolean[])var1[5]))[1] = false;
         boolean var2 = fna.a(IDirect3DDevice.SetDepthStencilSurface(((long[])((long[])((Object[])((Object[])var1[3]))[50]))[5], 0L), (byte)125);
         return var2;
      } else if(null != var1 && -7 == ~var1.length) {
         return kr.a((byte)69, var1);
      } else {
         throw new IllegalStateException();
      }
   }

   static final int a(Object[] var0, byte var1, int var2) {
      ++b;
      if(sda.a(var2, var0, 124)) {
         int var3 = -14 % ((-33 - var1) / 38);
         return ((int[])((int[])((Object[])((Object[])var0[3]))[5]))[var2];
      } else {
         return 0;
      }
   }

   static final String a(int[] var0, int var1) {
      ++d;
      StringBuffer var2 = new StringBuffer();
      if(var1 != 11557) {
         return (String)null;
      } else {
         int var3 = lk.d;

         for(int var4 = 0; var0.length > var4; ++var4) {
            Object[] var6 = ib.g;
            int var7 = var0[var4];
            Object[] var8;
            synchronized(var6[0]) {
               var8 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var6[0]), (long)var7));
            }

            if(null != var6 && var6.length == 12) {
               nma.a((Object[])((Object[])((Object[])((Object[])((Object[])((Object[])uda.s[0]))[0]))[0]), (int)7);
            }

            Object[] var5;
            if(var8 != null) {
               var5 = var8;
            } else {
               byte[] var9;
               synchronized(var6[1]) {
                  var9 = qn.a(35, var7, (Object[])((Object[])var6[1]), -116);
               }

               var8 = iu.a(true, new Object[17]);
               if(var9 != null) {
                  Object[] var10 = jta.a((byte)-83, var9, new Object[3]);
                  if(var6 != null && var6.length == 5) {
                     lk.d = ((int[])((int[])((Object[])((Object[])kla.f[31]))[1]))[0];
                  }

                  while(true) {
                     int var11 = fh.a(var10, false);
                     if(var11 == 0) {
                        break;
                     }

                     if(1 == var11) {
                        var8[0] = wta.a((byte)108, var10);
                     } else if(var11 == 2) {
                        var8[12] = wta.a((byte)-70, var10);
                     } else {
                        int var14;
                        int var15;
                        if(var11 != 3) {
                           if(var11 == 4) {
                              var14 = fh.a(var10, false);
                              var8[5] = new int[var14][3];

                              for(var15 = 0; var14 > var15; ++var15) {
                                 ((int[][])((int[][])var8[5]))[var15][0] = de.a(var1 - 11557, var10);
                                 ((int[][])((int[][])var8[5]))[var15][1] = lr.a(1, var10);
                                 ((int[][])((int[][])var8[5]))[var15][2] = lr.a(1, var10);
                              }

                              if(var10 != null && 2 == var10.length) {
                                 pn.a((ta)null, (byte)-109);
                              }
                           } else if(var11 == 5) {
                              de.a((int)0, var10);
                           } else if(var11 == 6) {
                              fh.a(var10, false);
                           } else if(var11 == 7) {
                              fh.a(var10, false);
                           } else if(8 != var11) {
                              if(9 == var11) {
                                 fh.a(var10, false);
                              } else if(var11 == 10) {
                                 var14 = fh.a(var10, false);
                                 var8[13] = new int[var14];

                                 for(var15 = 0; var15 < var14; ++var15) {
                                    ((int[])((int[])var8[13]))[var15] = lr.a(1, var10);
                                 }

                                 if(null != var10 && 7 == var10.length) {
                                    rw.x = null;
                                 }
                              } else if(var11 == 12) {
                                 lr.a(1, var10);
                              } else if(13 == var11) {
                                 var14 = fh.a(var10, false);
                                 var8[14] = new int[var14];

                                 for(var15 = 0; var15 < var14; ++var15) {
                                    ((int[])((int[])var8[14]))[var15] = de.a(var1 - 11557, var10);
                                 }

                                 if(null != var10 && var10.length == 1 && var10[0].equals(Integer.valueOf(1))) {
                                    au.b = ((int[])((int[])rpa.b[8]))[16];
                                 }
                              } else if(14 == var11) {
                                 var14 = fh.a(var10, false);
                                 var8[8] = new int[var14][2];

                                 for(var15 = 0; var15 < var14; ++var15) {
                                    ((int[][])((int[][])var8[8]))[var15][0] = fh.a(var10, false);
                                    ((int[][])((int[][])var8[8]))[var15][1] = fh.a(var10, false);
                                 }
                              } else if(var11 == 15) {
                                 de.a(var1 ^ 11557, var10);
                              } else if(17 == var11) {
                                 ((int[])((int[])var8[1]))[0] = fma.c(var1 - 28683, var10);
                              } else if(var11 == 18) {
                                 var14 = fh.a(var10, false);
                                 var8[10] = new int[var14];
                                 if(var6 != null && var6.length == 3 && var6[0].equals(Integer.valueOf(2))) {
                                    mqa.a(63, (byte)-119);
                                 }

                                 var8[9] = new String[var14];
                                 var8[3] = new int[var14];
                                 var8[7] = new int[var14];

                                 for(var15 = 0; var14 > var15; ++var15) {
                                    ((int[])((int[])var8[10]))[var15] = lr.a(1, var10);
                                    ((int[])((int[])var8[7]))[var15] = lr.a(var1 ^ 11556, var10);
                                    ((int[])((int[])var8[3]))[var15] = lr.a(var1 - 11556, var10);
                                    ((String[])((String[])var8[9]))[var15] = ara.b((byte)61, var10);
                                 }
                              } else if(19 == var11) {
                                 var14 = fh.a(var10, false);
                                 var8[11] = new int[var14];
                                 if(var10 != null && -2 == ~var10.length) {
                                    lta.a((Object[])null, (Object[])null, (byte)-75);
                                 }

                                 var8[15] = new String[var14];
                                 var8[6] = new int[var14];
                                 var8[16] = new int[var14];

                                 for(var15 = 0; var14 > var15; ++var15) {
                                    ((int[])((int[])var8[11]))[var15] = lr.a(var1 - 11556, var10);
                                    ((int[])((int[])var8[16]))[var15] = lr.a(var1 ^ 11556, var10);
                                    ((int[])((int[])var8[6]))[var15] = lr.a(1, var10);
                                    ((String[])((String[])var8[15]))[var15] = ara.b((byte)61, var10);
                                 }
                              } else if(249 == var11) {
                                 var14 = fh.a(var10, false);
                                 if(null == var8[4]) {
                                    var15 = fda.a(var14, (byte)81);
                                    var8[4] = nb.a((byte)66, var15, new Object[5]);
                                 }

                                 for(var15 = 0; var14 > var15; ++var15) {
                                    boolean var16 = -2 == ~fh.a(var10, false);
                                    int var17 = td.a(var10, 78);
                                    lm var18;
                                    if(!var16) {
                                       Object[] var13;
                                       var18 = (lm)(null != (var13 = ps.a((byte)-15, lr.a(1, var10), new Object[2]))?var13[0]:null);
                                    } else {
                                       Object[] var12;
                                       var18 = (lm)(null != (var12 = sg.a(ara.b((byte)61, var10), var1 - 31007, new Object[2]))?var12[1]:null);
                                    }

                                    di.a((Object[])((Object[])var8[4]), true, var18, (long)var17);
                                 }

                                 if(null != var10 && (var10.length == 13 || var10.length == 16)) {
                                    mka.a(104, ((int[])((int[])((Object[])((Object[])((Object[])((Object[])qja.s[36]))[0]))[7]))[10]);
                                 }
                              }
                           }
                        } else {
                           var14 = fh.a(var10, false);
                           var8[2] = new int[var14][3];

                           for(var15 = 0; var14 > var15; ++var15) {
                              ((int[][])((int[][])var8[2]))[var15][0] = de.a((int)0, var10);
                              ((int[][])((int[][])var8[2]))[var15][1] = lr.a(1, var10);
                              ((int[][])((int[][])var8[2]))[var15][2] = lr.a(1, var10);
                           }

                           if(null != var6 && 10 == var6.length) {
                              aw.a(-98, -30, -43, 58, true, -25, (ta)ij.f[0], -42);
                           }
                        }
                     }
                  }
               }

               client.b(var8, 2);
               var5 = var8;
               synchronized(var6[0]) {
                  il.a((long)var7, var8, true, (Object[])((Object[])var6[0]));
               }
            }

            if(0 != ~((int[])((int[])var5[1]))[0]) {
               cga var23 = (cga)dna.a((byte)34, rw.x, (long)((int[])((int[])var5[1]))[0]);
               if(null == var23) {
                  aea var24 = aea.b(lta.h, ((int[])((int[])var5[1]))[0], 0);
                  if(null != var24) {
                     var23 = lna.g.a(var24, true);
                     il.a((long)((int[])((int[])var5[1]))[0], var23, true, rw.x);
                  }
               }

               if(null != var23) {
                  sf.g[var3] = var23;
                  var2.append(" <img=").append(var3).append(">");
                  ++var3;
               }
            }
         }

         return var2.toString();
      }
   }

}
