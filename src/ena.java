import jaclib.hardware_info.HardwareInfo;
import jaggl.OpenGL;

final class ena {

   static int b;
   static int c;
   static int d;
   static int g;
   static int a;
   static int f;
   static Object[] e;
   static int h;


   static final Object[] a(boolean var0, Object[] var1, int var2) {
      if(null == var1[1]) {
         var1[1] = new int[15];
      }

      if(null == var1[0]) {
         var1[0] = new boolean[2];
      }

      ++h;
      var1[6] = fd.a((byte)-76, var1);
      if(var0) {
         if(!mna.h.startsWith("win")) {
            if(mna.h.startsWith("mac")) {
               ((int[])((int[])var1[1]))[3] = 2;
            } else if(mna.h.startsWith("linux")) {
               ((int[])((int[])var1[1]))[3] = 3;
            } else {
               ((int[])((int[])var1[1]))[3] = 4;
            }
         } else {
            ((int[])((int[])var1[1]))[3] = 1;
         }

         if(!gv.f.startsWith("amd64") && !gv.f.startsWith("x86_64")) {
            ((boolean[])((boolean[])var1[0]))[0] = false;
         } else {
            ((boolean[])((boolean[])var1[0]))[0] = true;
         }

         if(-2 == ~((int[])((int[])var1[1]))[3]) {
            if(bj.g.indexOf("4.0") != -1) {
               ((int[])((int[])var1[1]))[0] = 1;
            } else if(bj.g.indexOf("4.1") == -1) {
               if(bj.g.indexOf("4.9") == -1) {
                  if(0 != ~bj.g.indexOf("5.0")) {
                     ((int[])((int[])var1[1]))[0] = 4;
                  } else if(bj.g.indexOf("5.1") == -1) {
                     if(-1 == bj.g.indexOf("5.2")) {
                        if(~bj.g.indexOf("6.0") == 0) {
                           if(0 != ~bj.g.indexOf("6.1")) {
                              ((int[])((int[])var1[1]))[0] = 7;
                           } else if(~bj.g.indexOf("6.2") != 0) {
                              ((int[])((int[])var1[1]))[0] = 9;
                           }
                        } else {
                           ((int[])((int[])var1[1]))[0] = 6;
                        }
                     } else {
                        ((int[])((int[])var1[1]))[0] = 8;
                     }
                  } else {
                     ((int[])((int[])var1[1]))[0] = 5;
                  }
               } else {
                  ((int[])((int[])var1[1]))[0] = 3;
               }
            } else {
               ((int[])((int[])var1[1]))[0] = 2;
            }
         } else if(-3 == ~((int[])((int[])var1[1]))[3]) {
            if(bj.g.indexOf("10.4") == -1) {
               if(0 == ~bj.g.indexOf("10.5")) {
                  if(-1 != bj.g.indexOf("10.6")) {
                     ((int[])((int[])var1[1]))[0] = 22;
                  } else if(bj.g.indexOf("10.7") != -1) {
                     ((int[])((int[])var1[1]))[0] = 23;
                  }
               } else {
                  ((int[])((int[])var1[1]))[0] = 21;
               }
            } else {
               ((int[])((int[])var1[1]))[0] = 20;
            }
         }

         if(opa.a.toLowerCase().indexOf("sun") != -1) {
            ((int[])((int[])var1[1]))[9] = 1;
         } else if(~opa.a.toLowerCase().indexOf("microsoft") != 0) {
            ((int[])((int[])var1[1]))[9] = 2;
         } else if(~opa.a.toLowerCase().indexOf("apple") != 0) {
            ((int[])((int[])var1[1]))[9] = 3;
         } else {
            ((int[])((int[])var1[1]))[9] = 4;
         }

         int var3 = 2;
         int var4 = 0;

         char var5;
         try {
            while(~var3 > ~aba.a.length()) {
               var5 = aba.a.charAt(var3);
               if(var5 < 48 || var5 > 57) {
                  break;
               }

               var4 = -48 + var5 + var4 * 10;
               ++var3;
            }
         } catch (Exception var15) {
            ;
         }

         ((int[])((int[])var1[1]))[4] = var4;
         var4 = 0;
         var3 = 1 + aba.a.indexOf(46, 2);

         try {
            if(null != var1 && var1.length == 3) {
               hl.a((Object[])null, 106);
            }

            while(aba.a.length() > var3) {
               var5 = aba.a.charAt(var3);
               if(48 > var5 || 57 < var5) {
                  break;
               }

               var4 = -48 + var5 + var4 * 10;
               ++var3;
            }
         } catch (Exception var14) {
            ;
         }

         ((int[])((int[])var1[1]))[1] = var4;
         var3 = aba.a.indexOf(95, 4) + 1;
         var4 = 0;

         try {
            while(~var3 > ~aba.a.length()) {
               var5 = aba.a.charAt(var3);
               if(48 > var5 || var5 > 57) {
                  break;
               }

               var4 = 10 * var4 - (-var5 + 48);
               ++var3;
            }

            if(var1 != null && var1.length == 3 && var1[0].equals(Integer.valueOf(2))) {
               ula.a(-29661, new Object[4][], (Object[])null);
            }
         } catch (Exception var13) {
            ;
         }

         ((int[])((int[])var1[1]))[14] = var4;
         if(((int[])((int[])var1[1]))[4] > 3) {
            ((int[])((int[])var1[1]))[6] = nb.b;
         } else {
            ((int[])((int[])var1[1]))[6] = 0;
         }

         ((boolean[])((boolean[])var1[0]))[1] = false;
         ((int[])((int[])var1[1]))[11] = Class_e.f;

         try {
            int[] var16 = HardwareInfo.getCPUInfo();
            if(null != var16 && 7 == var16.length) {
               ((int[])((int[])var1[1]))[2] = var16[3];
               ((int[])((int[])var1[1]))[10] = var16[4];
               ((int[])((int[])var1[1]))[5] = var16[6];
               ((int[])((int[])var1[1]))[12] = var16[2];
               ((int[])((int[])var1[1]))[13] = var16[5];
            }

            String[] var6 = HardwareInfo.getDXDiagSystemProps();
            if(null != var6) {
               String var7 = "";
               String var8 = "";
               String var9 = "";

               for(int var10 = 0; var6.length > var10; var10 += 2) {
                  if(!var6[var10].equalsIgnoreCase("dwDirectXVersionMajor")) {
                     if(var6[var10].equalsIgnoreCase("dwDirectXVersionMinor")) {
                        var8 = var6[var10 + 1];
                     } else if(var6[var10].equalsIgnoreCase("dwDirectXVersionLetter")) {
                        var9 = var6[var10 + 1];
                     }
                  } else {
                     var7 = var6[var10 + 1];
                  }
               }

               var1[3] = var7 + "." + var8 + var9;
            }
         } catch (Throwable var12) {
            ((int[])((int[])var1[1]))[5] = 0;
         }
      }

      if(null == var1[4]) {
         var1[4] = "";
      }

      if(var1[5] == null) {
         var1[5] = "";
      }

      if(null == var1[3]) {
         var1[3] = "";
      }

      if(var2 != 14) {
         e[25] = (Object)null;
      }

      if(var1[2] == null) {
         var1[2] = "";
      }

      if(40 < ((String)var1[5]).length()) {
         var1[5] = ((String)var1[5]).substring(0, 40);
      }

      if(((String)var1[4]).length() > 40) {
         var1[4] = ((String)var1[4]).substring(0, 40);
      }

      if(-11 > ~((String)var1[3]).length()) {
         var1[3] = ((String)var1[3]).substring(0, 10);
      }

      if(((String)var1[2]).length() > 10) {
         var1[2] = ((String)var1[2]).substring(0, 10);
      }

      return var1;
   }

   static final void a(Object[] var0, int var1, float[] var2) {
      ++c;
      float var3 = var2[0];
      float var4 = var2[1];
      float var5 = var2[var1];
      var2[1] = ((float[])((float[])var0[0]))[2] * var5 + var4 * ((float[])((float[])var0[0]))[3] + var3 * ((float[])((float[])var0[0]))[0];
      var2[0] = var5 * ((float[])((float[])var0[0]))[9] + ((float[])((float[])var0[0]))[10] * var3 + var4 * ((float[])((float[])var0[0]))[5];
      var2[2] = var5 * ((float[])((float[])var0[0]))[4] + var4 * ((float[])((float[])var0[0]))[11] + ((float[])((float[])var0[0]))[6] * var3;
   }

   static final void a(int var0, String[] var1, int var2, int var3, short[] var4) {
      ++b;
      if(var3 != 1) {
         a((Object[])null, -30);
      }

      if(var2 < var0) {
         int var5 = (var2 + var0) / 2;
         int var6 = var2;
         String var7 = var1[var5];
         var1[var5] = var1[var0];
         var1[var0] = var7;
         short var8 = var4[var5];
         var4[var5] = var4[var0];
         var4[var0] = var8;

         for(int var9 = var2; var0 > var9; ++var9) {
            if(var7 == null || null != var1[var9] && (var9 & 1) > var1[var9].compareTo(var7)) {
               String var10 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6] = var10;
               short var11 = var4[var9];
               var4[var9] = var4[var6];
               var4[var6++] = var11;
            }
         }

         var1[var0] = var1[var6];
         var1[var6] = var7;
         var4[var0] = var4[var6];
         var4[var6] = var8;
         a(-1 + var6, var1, var2, 1, var4);
         a(var0, var1, 1 + var6, 1, var4);
      }

   }

   static final void a(int var0, int var1, Object[] var2, int var3, byte var4, int var5) {
      ++g;
      if(null != ((ta)var2[55]).E) {
         if(var1 < 0) {
            var1 = 0;
         }

         if(0 > var3) {
            var3 = 0;
         }

         int var6 = -111 % ((-58 - var4) / 47);
         if(((ta)var2[55]).E.e() < var5) {
            var5 = ((ta)var2[55]).E.e();
         }

         if(((ta)var2[55]).E.d() < var0) {
            var0 = ((ta)var2[55]).E.d();
         }

         if(var2 != null && var2.length == 31 && var2[8].equals(Boolean.valueOf(false)) && var2[8].equals(Integer.valueOf(2))) {
            nra.a(-8305, (Object[])null, -34);
         }

         ((int[])((int[])var2[1]))[28] = var1;
         ((int[])((int[])var2[1]))[10] = var3;
         ((int[])((int[])var2[1]))[15] = var0;
         ((int[])((int[])var2[1]))[25] = var5;
         OpenGL.glEnable(3089);
         no.a(true, var2);
      }
   }

   static final void a(Object[] var0, int var1) {
      ++d;
      if(ju.g != null) {
         Object[] var2 = null;
         if(((int[])((int[])var0[1]))[9] == 0) {
            var2 = cu.a(((int[])((int[])var0[1]))[3], ((int[])((int[])var0[1]))[5], ((int[])((int[])var0[1]))[0]);
         }

         if(-2 == ~((int[])((int[])var0[1]))[9]) {
            var2 = kaa.a(((int[])((int[])var0[1]))[3], ((int[])((int[])var0[1]))[5], ((int[])((int[])var0[1]))[0]);
         }

         if(var1 < 63) {
            ((long[])((long[])((Object[])((Object[])var0[1]))[4]))[0] = -99L;
         }

         if(((int[])((int[])var0[1]))[9] == 2) {
            var2 = InputStreamWorker.a(((int[])((int[])var0[1]))[3], ((int[])((int[])var0[1]))[5], ((int[])((int[])var0[1]))[0], ke.f);
         }

         if(((int[])((int[])var0[1]))[9] == 3) {
            var2 = cba.a(((int[])((int[])var0[1]))[3], ((int[])((int[])var0[1]))[5], ((int[])((int[])var0[1]))[0]);
         }

         if(var2 != null) {
            ((int[])((int[])var0[1]))[2] = uaa.a(var2, 124);
            ((int[])((int[])var0[1]))[7] = wua.a(var2, 10405);
            ((int[])((int[])var0[1]))[4] = vm.a((byte)20, var2);
         } else {
            ((int[])((int[])var0[1]))[2] = -1;
            ((int[])((int[])var0[1]))[4] = 0;
            ((int[])((int[])var0[1]))[7] = 0;
         }

      }
   }

   static final void a(int var0, Object[] var1, Object[] var2) {
      ++a;

      while(true) {
         int var3 = fh.a(var2, false);
         if(0 == var3) {
            if(var2 != null && var2.length == 1) {
               qfa.a((Object[])null, (byte)-61);
            }

            if(var0 != 1) {
               ((long[])((long[])var1[32]))[0] = 99L;
            }

            return;
         }

         if(var3 == 1) {
            ((int[])((int[])var1[1]))[2] = fma.c(var0 - 17127, var2);
         } else if(var3 == 2) {
            ((int[])((int[])var1[1]))[4] = fma.c(-17126, var2);
         } else if(var3 == 4) {
            ((int[])((int[])var1[1]))[5] = de.a((int)0, var2);
         } else if(var3 == 5) {
            ((int[])((int[])var1[1]))[1] = de.a((int)0, var2);
         } else if(var3 == 6) {
            ((int[])((int[])var1[1]))[3] = de.a((int)0, var2);
         } else if(7 == var3) {
            ((int[])((int[])var1[1]))[0] = fh.a(var2, false);
         } else if(8 == var3) {
            ((int[])((int[])var1[1]))[8] = fh.a(var2, false);
         } else if(var3 == 9) {
            ((byte[])((byte[])var1[3]))[0] = 3;
            ((int[])((int[])var1[1]))[6] = 8224;
         } else if(10 == var3) {
            ((boolean[])((boolean[])var1[6]))[0] = true;
         } else if(11 == var3) {
            ((byte[])((byte[])var1[3]))[0] = 1;
         } else if(12 == var3) {
            ((byte[])((byte[])var1[3]))[0] = 4;
         } else if(var3 == 13) {
            ((byte[])((byte[])var1[3]))[0] = 5;
         } else if(var3 == 14) {
            ((byte[])((byte[])var1[3]))[0] = 2;
            ((int[])((int[])var1[1]))[6] = 256 * fh.a(var2, false);
         } else if(var3 == 15) {
            ((byte[])((byte[])var1[3]))[0] = 3;
            ((int[])((int[])var1[1]))[6] = de.a((int)0, var2);
         } else if(var3 == 16) {
            ((byte[])((byte[])var1[3]))[0] = 3;
            ((int[])((int[])var1[1]))[6] = lr.a(1, var2);
         } else {
            int var4;
            int var5;
            if(40 != var3) {
               if(var3 == 41) {
                  var4 = fh.a(var2, false);
                  var1[4] = new short[var4];
                  if(null != var1 && -6 == ~var1.length && var1[0].equals(Integer.valueOf(0))) {
                     return;
                  }

                  var1[2] = new short[var4];

                  for(var5 = 0; var5 < var4; ++var5) {
                     ((short[])((short[])var1[4]))[var5] = (short)de.a((int)0, var2);
                     ((short[])((short[])var1[2]))[var5] = (short)de.a((int)0, var2);
                  }
               }
            } else {
               var4 = fh.a(var2, false);
               var1[7] = new short[var4];
               var1[5] = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  ((short[])((short[])var1[7]))[var5] = (short)de.a((int)0, var2);
                  ((short[])((short[])var1[5]))[var5] = (short)de.a((int)0, var2);
               }

               if(null != var1 && 2 == var1.length) {
                  rha.a((byte)-76, (Object[])null, -83, 78, (Object[])null, (ta)null);
               }
            }
         }
      }
   }

}
