import jaggl.OpenGL;

final class lca {

   static int a;
   static int h;
   static Object[] b = ed.a(-2, new Object[1], (byte)-116, 110);
   static int c;
   static int k;
   static int g;
   static int f;
   static byte[] e = new byte['\u8080'];
   static int f_i;
   static int j;
   static int d;


   static final void a(int var0, int var1, int var2, Object[] var3) {
      if(var1 != 17398) {
         a((Object[])null, (int)102);
      }

      ++f;
      if(null == dca.e && !kea.c) {
         if(null != var3 && null != vt.a((int)122, var3)) {
            dca.e = var3;
            gn.k = vt.a(var1 ^ 17301, var3);
            jr.e = 0;
            pla.b = var0;
            ft.m = var2;
            id.e = false;
         }
      }
   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      ++g;
      if(null != var2 && (-10 == ~var2.length && var2[1].equals(Integer.valueOf(1)) || var2.length == 3)) {
         nta.c = true;
      }

      if(var1 != 256) {
         a(-57, (int[])null, 117, (String[])((String[])var0[34]), (byte)82);
      }

      while(true) {
         int var3 = fh.a(var0, false);
         if(0 == var3) {
            return;
         }

         int var4;
         int var5;
         if(var3 == 1) {
            var4 = de.a((int)0, var0);
            if(var0 != null && 1 == var0.length && var0[0].equals(Boolean.valueOf(false))) {
               ue.a((Object[])null, true);
            }

            var2[5] = new int[var4];

            for(var5 = 0; var4 > var5; ++var5) {
               ((int[])((int[])var2[5]))[var5] = de.a((int)0, var0);
            }

            var2[7] = new int[var4];

            for(var5 = 0; var4 > var5; ++var5) {
               ((int[])((int[])var2[7]))[var5] = de.a((int)0, var0);
            }

            for(var5 = 0; var4 > var5; ++var5) {
               ((int[])((int[])var2[7]))[var5] += de.a((int)0, var0) << 16;
            }
         } else if(var3 == 2) {
            ((int[])((int[])var2[1]))[7] = de.a((int)0, var0);
         } else if(3 != var3) {
            if(5 == var3) {
               ((int[])((int[])var2[1]))[1] = fh.a(var0, false);
            } else if(6 == var3) {
               ((int[])((int[])var2[1]))[0] = de.a((int)0, var0);
            } else if(var3 == 7) {
               ((int[])((int[])var2[1]))[8] = de.a((int)0, var0);
            } else if(8 == var3) {
               ((int[])((int[])var2[1]))[5] = fh.a(var0, false);
            } else if(9 == var3) {
               ((int[])((int[])var2[1]))[6] = fh.a(var0, false);
            } else if(10 == var3) {
               ((int[])((int[])var2[1]))[2] = fh.a(var0, false);
            } else if(var3 == 11) {
               ((int[])((int[])var2[1]))[4] = fh.a(var0, false);
            } else if(12 == var3) {
               var4 = fh.a(var0, false);
               var2[3] = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  ((int[])((int[])var2[3]))[var5] = de.a((int)0, var0);
               }

               for(var5 = 0; var5 < var4; ++var5) {
                  ((int[])((int[])var2[3]))[var5] += de.a(var1 ^ 256, var0) << 16;
               }

               if(var2 != null && (var2.length == 2 || -3 == ~var2.length)) {
                  nta.c = true;
               }
            } else if(var3 != 13) {
               if(14 == var3) {
                  ((boolean[])((boolean[])var2[4]))[1] = true;
               } else if(15 != var3) {
                  if(16 != var3) {
                     if(18 == var3) {
                        ((boolean[])((boolean[])var2[4]))[2] = true;
                     } else if(19 != var3) {
                        if(20 == var3) {
                           if(null == var2[8] || null == var2[0]) {
                              var2[8] = new int[((Object[])((Object[])var2[6])).length];
                              if(null != var2 && (var2.length == 1 && var2[0].equals(Boolean.valueOf(false)) || var2.length == 3)) {
                                 a((Object[])null, (int)256, (Object[])null);
                              }

                              var2[0] = new int[((Object[])((Object[])var2[6])).length];

                              for(var4 = 0; var4 < ((Object[])((Object[])var2[6])).length; ++var4) {
                                 ((int[])((int[])var2[8]))[var4] = 256;
                                 ((int[])((int[])var2[0]))[var4] = 256;
                              }
                           }

                           var4 = fh.a(var0, false);
                           ((int[])((int[])var2[8]))[var4] = de.a((int)0, var0);
                           ((int[])((int[])var2[0]))[var4] = de.a((int)0, var0);
                        }
                     } else {
                        if(null == var2[2]) {
                           var2[2] = new int[((Object[])((Object[])var2[6])).length];
                           if(null != var2 && 33 == var2.length && var2[0].equals(Boolean.valueOf(false))) {
                              a((Object[])null, (int)256, (Object[])null);
                           }

                           for(var4 = 0; ((Object[])((Object[])var2[6])).length > var4; ++var4) {
                              ((int[])((int[])var2[2]))[var4] = 255;
                           }
                        }

                        ((int[])((int[])var2[2]))[fh.a(var0, false)] = fh.a(var0, false);
                     }
                  }
               } else {
                  ((boolean[])((boolean[])var2[4]))[0] = true;
               }
            } else {
               var4 = de.a((int)0, var0);
               var2[6] = new int[var4][];
               if(null != var0 && var0.length == 11) {
                  br.a((Object[])null, -15536);
               }

               for(var5 = 0; var5 < var4; ++var5) {
                  int var6 = fh.a(var0, false);
                  if(0 < var6) {
                     ((int[][])((int[][])var2[6]))[var5] = new int[var6];
                     if(var0 != null && (5 == var0.length || var0.length == 18)) {
                        nta.c = true;
                     }

                     ((int[][])((int[][])var2[6]))[var5][0] = td.a(var0, 115);

                     for(int var7 = 1; var6 > var7; ++var7) {
                        ((int[][])((int[][])var2[6]))[var5][var7] = de.a((int)0, var0);
                     }
                  }
               }
            }
         } else {
            var2[9] = new boolean[256];
            var4 = fh.a(var0, false);
            if(null != var0 && (-2 == ~var0.length && var0[0].equals(Integer.valueOf(1)) || -7 == ~var0.length && var0[3].equals(Boolean.valueOf(false)))) {
               nta.c = true;
            }

            for(var5 = 0; var4 > var5; ++var5) {
               ((boolean[])((boolean[])var2[9]))[fh.a(var0, false)] = true;
            }
         }
      }
   }

   static final Object[] a(Object[] var0, byte var1) {
      ++f_i;
      if(var1 > -110) {
         a((byte)81, (Object[])null, (Object[])null, (Object[])((Object[])var0[2]));
      }

      il.a((byte)79, var0);
      uca.a(0, var0, false, false);
      cma.b(-114, var0);
      return var0;
   }

   static final Object[] a(Object[] var0, byte var1, String var2) throws mo {
      ++h;
      if(null != var0 && (var0.length == 16 && var0[1].equals(Integer.valueOf(0)) || 26 == var0.length && var0[13].equals(Integer.valueOf(1)) && var0[13].equals(Boolean.valueOf(false)))) {
         return null;
      } else {
         if(var1 != 117) {
            a((Object[])((Object[])var0[6]), (int)-10, (Object[])null);
         }

         Object[][] var3 = (Object[][])((Object[][])var0[3]);

         for(int var4 = 0; ~var4 > ~var3.length; ++var4) {
            Object[] var5 = var3[var4];
            String var6 = (String)var5[3];
            if(var6 != null && var6.equals(var2)) {
               return var5;
            }
         }

         throw new mo(var2);
      }
   }

   static final void a(int var0, int[] var1, int var2, String[] var3, byte var4) {
      int var5 = 36 / ((-51 - var4) / 51);
      if(var2 > var0) {
         int var6 = (var0 + var2) / 2;
         int var7 = var0;
         String var8 = var3[var6];
         var3[var6] = var3[var2];
         var3[var2] = var8;
         int var9 = var1[var6];
         var1[var6] = var1[var2];
         var1[var2] = var9;

         for(int var10 = var0; var10 < var2; ++var10) {
            if(var8 == null || null != var3[var10] && var3[var10].compareTo(var8) < (var10 & 1)) {
               String var11 = var3[var10];
               var3[var10] = var3[var7];
               var3[var7] = var11;
               int var12 = var1[var10];
               var1[var10] = var1[var7];
               var1[var7++] = var12;
            }
         }

         var3[var2] = var3[var7];
         var3[var7] = var8;
         var1[var2] = var1[var7];
         var1[var7] = var9;
         a(var0, var1, var7 - 1, var3, (byte)109);
         a(1 + var7, var1, var2, var3, (byte)62);
      }

      ++a;
   }

   static final void a(byte var0, Object[] var1, Object[] var2, Object[] var3) {
      ++k;
      if(null != var1 && 16 == var1.length) {
         int var4 = tea.a(false, var3);
         if(~var4 != 0) {
            float[] var7 = fta.P;
            var7[0] = ((float[])((float[])var2[0]))[0];
            var7[2] = ((float[])((float[])var2[0]))[2];
            var7[1] = ((float[])((float[])var2[0]))[1];
            var7[3] = ((float[])((float[])var2[0]))[4];
            var7[4] = ((float[])((float[])var2[0]))[5];
            var7[5] = ((float[])((float[])var2[0]))[6];
            var7[6] = ((float[])((float[])var2[0]))[8];
            var7[7] = ((float[])((float[])var2[0]))[9];
            var7[8] = ((float[])((float[])var2[0]))[10];
            OpenGL.glUniform3fv(var4, 3, var7, 0);
         }

      } else if(var1 != null && var1.length == 12) {
         lp.a((byte)-106, var1, var2, var3);
      } else if(var0 < -115) {
         throw new IllegalStateException();
      }
   }

   static final void a(Object[] var0, int var1) {
      if(null == var0[0]) {
         var0[0] = new int[2];
      }

      ++c;
      int var2 = 42 / ((var1 - 1) / 36);
   }

   static {
      int var0 = 0;

      for(int var1 = 0; 256 > var1; ++var1) {
         for(int var2 = 0; var1 >= var2; ++var2) {
            e[var0++] = (byte)((int)(255.0D / Math.sqrt((double)((float)('\uffff' + var2 * var2 + var1 * var1) / 65535.0F))));
         }
      }

      d = -1;
   }
}
