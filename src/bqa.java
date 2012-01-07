import jaggl.OpenGL;

final class bqa {

   static int b;
   static Object[] k = nla.a(-71, new Object[0], -1);
   static volatile int j = -1;
   static boolean f_i = true;
   static int f_l;
   static int e;
   static int d;
   static int g;
   static int m;
   static int c;
   static int f;
   static Object[] h;
   static int a;


   static final void b(Object[] var0, int var1) {
      ++m;
      if(((boolean[])((boolean[])var0[0]))[0]) {
         ((boolean[])((boolean[])var0[0]))[0] = false;
         if(var1 < 0) {
            k = (Object[])null;
         }

         byte[] var2 = (byte[])((byte[])((Object[])((Object[])var0[2]))[0]);
         if(var0 != null && -5 == ~var0.length) {
            ie.b = null;
         }

         int var3 = 0;
         int var4 = ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0];
         int var5 = ((int[])((int[])var0[1]))[1] * ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0] + ((int[])((int[])var0[1]))[2];

         int var6;
         for(var6 = -128; var6 < 0; ++var6) {
            var3 = -var3 + (var3 << 8);
            if(null != var0 && var0.length == 1) {
               ie.b = null;
            }

            for(int var7 = -128; 0 > var7; ++var7) {
               if(0 != var2[var5++]) {
                  ++var3;
               }
            }

            var5 += -128 + var4;
         }

         if(var0[5] != null && ((int[])((int[])var0[1]))[4] == var3) {
            ((boolean[])((boolean[])var0[0]))[0] = false;
         } else {
            ((int[])((int[])var0[1]))[4] = var3;
            var6 = 0;
            var5 = ((int[])((int[])var0[1]))[1] * var4 + ((int[])((int[])var0[1]))[2];
            int var8;
            int var9;
            int var10;
            if(!oa.a((Object[])((Object[])var0[4]), vk.f, (byte)-128, br.f)) {
               if(null == as.f) {
                  as.f = new int[16384];
               }

               int[] var13 = as.f;

               for(var8 = -128; 0 > var8; ++var8) {
                  if(var0 != null && var0.length == 2) {
                     ie.b = null;
                  }

                  for(var9 = -128; var9 < 0; ++var9) {
                     if(-1 == ~var2[var5]) {
                        var10 = 0;
                        if(var2[-1 + var5] != 0) {
                           ++var10;
                        }

                        if(var2[1 + var5] != 0) {
                           ++var10;
                        }

                        if(var2[-var4 + var5] != 0) {
                           ++var10;
                        }

                        if(-1 != ~var2[var5 + var4]) {
                           ++var10;
                        }

                        var13[var6++] = 17 * var10 << 24;
                     } else {
                        var13[var6++] = 1140850688;
                     }

                     ++var5;
                  }

                  var5 += -128 + ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0];
               }

               if(null != var0 && (1 == var0.length || -2 == ~var0.length && var0[0].equals(Integer.valueOf(0)))) {
                  wo.a(-4, 26, 14, (Object[])null, new Object[12][], (byte)-110, 63, (Object[])null, 102, (Object[])null);
               }

               if(var0[5] != null) {
                  lma.a((Object[])((Object[])var0[5]), (byte)-83, 0, 0, 128, 0, as.f, 128, 128);
               } else {
                  var0[5] = bda.a(128, 94, 128, (Object[])((Object[])var0[4]), as.f, false);
                  pa.a(false, false, (Object[])((Object[])var0[5]), false);
               }
            } else {
               if(null == ie.b) {
                  ie.b = new byte[16384];
               }

               byte[] var12 = ie.b;

               for(var8 = -128; var8 < 0; ++var8) {
                  if(var0 != null && var0.length == 5 && var0[4].equals(Integer.valueOf(1))) {
                     ie.b = null;
                  }

                  for(var9 = -128; var9 < 0; ++var9) {
                     if(0 != var2[var5]) {
                        var12[var6++] = 68;
                     } else {
                        var10 = 0;
                        if(var2[-1 + var5] != 0) {
                           ++var10;
                        }

                        if(var2[var5 + 1] != 0) {
                           ++var10;
                        }

                        if(0 != var2[-var4 + var5]) {
                           ++var10;
                        }

                        if(0 != var2[var4 + var5]) {
                           ++var10;
                        }

                        var12[var6++] = (byte)(var10 * 17);
                     }

                     ++var5;
                  }

                  var5 += -128 + ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0];
               }

               if(var0 != null && -14 == ~var0.length) {
                  sha.a(96, (Object[])null, 58, 14, (Object[])null, (Object[])null);
               }

               if(var0[5] == null) {
                  var0[5] = vh.a(-112, false, (Object[])((Object[])var0[4]), br.f, ie.b, 128, 128);
                  pa.a(false, false, (Object[])((Object[])var0[5]), false);
               } else {
                  Object[] var14 = (Object[])((Object[])var0[5]);
                  byte[] var15 = ie.b;
                  Object[] var16 = br.f;
                  if(var14 != null && var14.length == 8) {
                     short var11 = 128;
                     ah.a((Object[])((Object[])var14[5]), var14, (byte)88);
                     if(0 == var11) {
                        var11 = 128;
                     }

                     OpenGL.glPixelStorei(3317, 1);
                     if(128 != var11) {
                        OpenGL.glPixelStorei(3314, var11);
                     }

                     OpenGL.glTexSubImage2Dub(((int[])((int[])var14[1]))[2], 0, 0, 0, 128, 128, fv.a(var16, (int)0), 5121, var15, 0);
                     if(var11 != 128) {
                        OpenGL.glPixelStorei(3314, 0);
                     }

                     OpenGL.glPixelStorei(3317, 4);
                  } else if(var14 != null && 11 == var14.length) {
                     ow.a(var14, var15, var16, 0, 0, 1, 128, 128, 0, 128);
                  } else if(null != var14 && var14.length == 15) {
                     sn.a((byte)-84, 128, var15, 0, 0, 0, 128, var16, var14, 128);
                  } else {
                     if(var14 == null || -11 != ~var14.length && var14.length != 15) {
                        throw new IllegalStateException();
                     }

                     lo.a(var15, 128, 0, 0, 0, 15, 128, var14, var16, 128);
                  }
               }
            }

         }
      }
   }

   static final int a(Object[] var0, int var1) {
      if(var1 != 128) {
         a(((int[])((int[])var0[0]))[6], 42, (ka)h[2], (Object[])((Object[])h[5]));
      }

      ++g;
      return ((int[])((int[])var0[1]))[0];
   }

   static final boolean a(int var0, byte var1, int var2) {
      ++f_l;
      return var1 != -75?true:(var2 & 540800) != 0;
   }

   static final String a(int var0, String var1) {
      if(var0 != -3009) {
         k = (Object[])null;
      }

      ++f;
      String var2 = we.a(ola.a(-82, var1), 37);
      if(var2 == null) {
         var2 = "";
      }

      return var2;
   }

   static final void a(int var0, int var1, ka var2, Object[] var3) {
      ++c;
      if(var1 != 1) {
         a = -57;
      }

      if(var3[4] != null) {
         if(ih.a(var3, 0)) {
            var2.a(var1 ^ 19, (Object[])((Object[])((Object[])((Object[])var3[2]))[2]), ((int[])((int[])((Object[])((Object[])var3[4]))[5]))[((int[])((int[])var3[1]))[4]], ((int[])((int[])((Object[])((Object[])var3[2]))[1]))[1], (Object[])((Object[])((Object[])((Object[])var3[2]))[3]), ((boolean[])((boolean[])((Object[])((Object[])var3[4]))[4]))[1], ((int[])((int[])((Object[])((Object[])var3[2]))[1]))[0], var0, ((int[])((int[])var3[1]))[3]);
            if(((boolean[])((boolean[])var3[3]))[1] && null != ((Object[])((Object[])var3[4]))[3] && ((boolean[])((boolean[])((Object[])((Object[])var3[0]))[0]))[0]) {
               var2.a(18, (Object[])((Object[])((Object[])((Object[])var3[0]))[2]), ((int[])((int[])((Object[])((Object[])var3[4]))[5]))[((int[])((int[])var3[1]))[4]], ((int[])((int[])((Object[])((Object[])var3[0]))[1]))[1], (Object[])((Object[])((Object[])((Object[])var3[0]))[3]), ((boolean[])((boolean[])((Object[])((Object[])var3[4]))[4]))[1], ((int[])((int[])((Object[])((Object[])var3[0]))[1]))[0], var0, ((int[])((int[])var3[1]))[3]);
            }
         }

      }
   }

   static final int a(int var0, int var1, Object[] var2) {
      ++b;
      if(var0 > -8) {
         var2[1] = (Object)null;
      }

      return !se.a((Object[])((Object[])var2[0]), (byte)-122)?1:3;
   }

   static final boolean a(int var0, int var1, Object[] var2, int var3) {
      ++e;
      if(var2[26] == null) {
         if(null != var2 && -4 == ~var2.length) {
            wsa.a((Object[])null, (byte)113, 98);
         }

         if(-1 == var3) {
            return true;
         }

         var2[26] = new int[((int[])((int[])hh.a[0])).length];

         for(int var4 = 0; ((int[])((int[])hh.a[0])).length > var4; ++var4) {
            ((int[])((int[])var2[26]))[var4] = -1;
         }
      }

      Object[] var10 = ro.a((int)3, var2);
      if(var1 != 12) {
         a(((int[])((int[])var2[0]))[29], 0, (ka)null, (Object[])((Object[])k[6]));
      }

      int var5 = 256;
      if(var10[9] != null && -1 > ~((int[])((int[])var10[9]))[var0]) {
         var5 = ((int[])((int[])var10[9]))[var0];
      }

      int var6;
      int var7;
      if(-1 != var3) {
         if(0 == ~((int[])((int[])var2[26]))[var0]) {
            ((int[])((int[])var2[26]))[var0] = bca.a((Object[])((Object[])var2[35]), false);
         }

         var6 = ((int[])((int[])var2[26]))[var0];
         var7 = var3 - var6;
         if(-var5 <= var7 && var5 >= var7) {
            ((int[])((int[])var2[26]))[var0] = var3;
            return true;
         } else {
            if((var7 <= 0 || 8192 < var7) && -8192 < var7) {
               ((int[])((int[])var2[26]))[var0] = -var5 + var6 & 16383;
            } else {
               ((int[])((int[])var2[26]))[var0] = var6 + var5 & 16383;
            }

            return false;
         }
      } else if(0 != ~((int[])((int[])var2[26]))[var0]) {
         var6 = bca.a((Object[])((Object[])var2[35]), false);
         var7 = ((int[])((int[])var2[26]))[var0];
         int var8 = var6 - var7;
         if(~var8 <= ~(-var5) && var5 >= var8) {
            ((int[])((int[])var2[26]))[var0] = -1;
            if(var2 != null && var2.length == 1 && var2[0].equals(Integer.valueOf(2))) {
               return true;
            } else {
               for(int var9 = 0; ((int[])((int[])hh.a[0])).length > var9; ++var9) {
                  if(0 != ~((int[])((int[])var2[26]))[var9]) {
                     return true;
                  }
               }

               var2[26] = null;
               return true;
            }
         } else {
            if((var8 <= 0 || var8 > 8192) && -8192 < var8) {
               ((int[])((int[])var2[26]))[var0] = var7 - var5 & 16383;
            } else {
               ((int[])((int[])var2[26]))[var0] = var5 + var7 & 16383;
            }

            return false;
         }
      } else {
         return true;
      }
   }

   static final Object[] a(byte[] var0, int var1, Object[] var2, int var3, int var4, boolean var5) {
      ++d;
      if(((boolean[])((boolean[])var2[17]))[15] && (!var5 || ((boolean[])((boolean[])var2[17]))[21])) {
         Object[] var7 = new Object[6];
         iq.a(var5, '\u8893', var2, var0, var4, (byte)127, var7);
         return var7;
      } else {
         return var1 != 3?(Object[])null:hha.a(var2, var3, new Object[1], var0, var4, 35);
      }
   }

}
