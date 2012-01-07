import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class fr {

   static int c;
   static Object[] g = de.a(3000000, 200, 2, new Object[3]);
   static int a;
   static Object[] d = ho.a(15, 74, new Object[1], true);
   static int e;
   static int b;
   static int f;


   static final void a(int var0, int var1, Object[] var2, int var3) {
      ++a;
      Object[] var4 = hda.a(fv.d, var1, -127);
      if(var0 > -69) {
         ((byte[])((byte[])d[1]))[3] = -1;
      }

      int var5 = ((int[])((int[])var4[0]))[1];
      int var6 = ((int[])((int[])var4[0]))[2];
      int var7 = ((int[])((int[])var4[0]))[0];
      int var8 = tba.f[var7 + -var6];
      if(0 > var3 || var3 > var8) {
         var3 = 0;
      }

      var8 <<= var6;
      gs.a(70, var2, var8 & var3 << var6 | ((int[])((int[])var2[0]))[var5] & ~var8, var5);
   }

   static final void a(Object[] var0, int var1) {
      ++b;
      synchronized(var0) {
         if(!((boolean[])((boolean[])var0[0]))[1]) {
            long var3 = he.a(-38);

            try {
               if(((long[])((long[])var0[5]))[0] - -6000L < var3) {
                  ((long[])((long[])var0[5]))[0] = -6000L + var3;
               }

               while(~(((long[])((long[])var0[5]))[0] + 5000L) > ~var3) {
                  jr.a(var0, 3, 256);
                  ((long[])((long[])var0[5]))[0] += (long)(256000 / mc.a);
                  var3 = he.a(73);
               }
            } catch (Exception var10) {
               ((long[])((long[])var0[5]))[0] = var3;
            }

            if(null != var0[2]) {
               try {
                  if(0L != ((long[])((long[])var0[5]))[2]) {
                     if(var3 < ((long[])((long[])var0[5]))[2]) {
                        return;
                     }

                     ou.a(6, var0, ((int[])((int[])var0[1]))[1]);
                     ((boolean[])((boolean[])var0[0]))[0] = true;
                     ((long[])((long[])var0[5]))[2] = 0L;
                  }

                  int var5 = aqa.c(var0, -62);
                  if(~(-var5 + ((int[])((int[])var0[1]))[6]) < ~((int[])((int[])var0[1]))[5]) {
                     ((int[])((int[])var0[1]))[5] = ((int[])((int[])var0[1]))[6] + -var5;
                  }

                  int var6 = ((int[])((int[])var0[1]))[2] + ((int[])((int[])var0[1]))[0];
                  if(256 + var6 > 16384) {
                     var6 = 16128;
                  }

                  if(var0 != null && (2 == var0.length || -7 == ~var0.length)) {
                     a((Object[])null, 11);
                  }

                  if(~(256 + var6) < ~((int[])((int[])var0[1]))[1]) {
                     ((int[])((int[])var0[1]))[1] += 1024;
                     if(16384 < ((int[])((int[])var0[1]))[1]) {
                        ((int[])((int[])var0[1]))[1] = 16384;
                     }

                     ha.a((byte)-66, var0);
                     ou.a(6, var0, ((int[])((int[])var0[1]))[1]);
                     var5 = 0;
                     if(256 + var6 > ((int[])((int[])var0[1]))[1]) {
                        var6 = -256 + ((int[])((int[])var0[1]))[1];
                        ((int[])((int[])var0[1]))[2] = var6 + -((int[])((int[])var0[1]))[0];
                     }

                     ((boolean[])((boolean[])var0[0]))[0] = true;
                  }

                  while(var6 > var5) {
                     wca.a(var0, (int[])((int[])var0[2]), 256);
                     var5 += 256;
                     if(var0 != null && 10 == var0.length) {
                        fla.a(var0);
                     } else {
                        vla.a(var0, 20);
                     }
                  }

                  if(~var3 < ~((long[])((long[])var0[5]))[1]) {
                     if(!((boolean[])((boolean[])var0[0]))[0]) {
                        if(0 == ((int[])((int[])var0[1]))[5] && ((int[])((int[])var0[1]))[4] == 0) {
                           ha.a((byte)-66, var0);
                           ((long[])((long[])var0[5]))[2] = var3 + 2000L;
                           return;
                        }

                        ((int[])((int[])var0[1]))[2] = Math.min(((int[])((int[])var0[1]))[4], ((int[])((int[])var0[1]))[5]);
                        ((int[])((int[])var0[1]))[4] = ((int[])((int[])var0[1]))[5];
                     } else {
                        ((boolean[])((boolean[])var0[0]))[0] = false;
                     }

                     ((int[])((int[])var0[1]))[5] = 0;
                     ((long[])((long[])var0[5]))[1] = var3 + 2000L;
                  }

                  ((int[])((int[])var0[1]))[6] = var5;
                  int var7 = 70 / ((var1 + 70) / 42);
               } catch (Exception var9) {
                  ha.a((byte)-66, var0);
                  ((long[])((long[])var0[5]))[2] = 2000L + var3;
               }

            }
         }
      }
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++c;
      Object[] var5 = new Object[8];
      if(var5[1] == null) {
         var5[1] = new int[2];
      }

      al var7 = new al(var5);
      var5[4] = var7;
      Object[] var6 = var5;
      ((int[])((int[])var5[1]))[1] = fh.a(var1, false);
      ((int[])((int[])var5[1]))[0] = lr.a(1, var1);
      var5[3] = new int[((int[])((int[])var5[1]))[1]];
      var5[0] = new int[((int[])((int[])var5[1]))[1]];
      var5[2] = new int[((int[])((int[])var5[1]))[1]];
      var5[7] = new Field[((int[])((int[])var5[1]))[1]];
      if(var5 != null && var5.length == 11 && var5[2].equals(Integer.valueOf(2)) && var5[2].equals(Integer.valueOf(0))) {
         sda.a((Object[])null, (byte)-101);
      }

      var5[5] = new Method[((int[])((int[])var5[1]))[1]];
      var5[6] = new byte[((int[])((int[])var5[1]))[1]][][];

      for(int var21 = 0; ((int[])((int[])var6[1]))[1] > var21; ++var21) {
         try {
            int var8 = fh.a(var1, false);
            String var9;
            String var10;
            int var11;
            if(0 != var8 && var8 != 1 && 2 != var8) {
               if(3 == var8 || var8 == 4) {
                  var9 = ara.b((byte)61, var1);
                  var10 = ara.b((byte)61, var1);
                  var11 = fh.a(var1, false);
                  String[] var12 = new String[var11];

                  for(int var13 = 0; var13 < var11; ++var13) {
                     var12[var13] = ara.b((byte)61, var1);
                  }

                  byte[][] var22 = new byte[var11][];
                  int var15;
                  if(3 == var8) {
                     for(int var14 = 0; var14 < var11; ++var14) {
                        var15 = lr.a(1, var1);
                        var22[var14] = new byte[var15];
                        Class_h.a((byte)-71, var15, var1, var22[var14], 0);
                     }

                     if(null != var1 && var1.length == 17) {
                        eu.b(2);
                     }
                  }

                  ((int[])((int[])var6[0]))[var21] = var8;
                  Class[] var23 = new Class[var11];

                  for(var15 = 0; var15 < var11; ++var15) {
                     var23[var15] = bta.getClassByName(var12[var15], true);
                  }

                  if(bta.getClassByName(var9, true).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  ((Method[])((Method[])var6[5]))[var21] = bta.getClassByName(var9, true).getDeclaredMethod(var10, var23);
                  ((byte[][][])((byte[][][])var6[6]))[var21] = var22;
                  if(var1 != null && var1.length == 23 && var1[13].equals(Boolean.valueOf(false))) {
                     eu.b(2);
                  }
               }
            } else {
               var9 = ara.b((byte)61, var1);
               var10 = ara.b((byte)61, var1);
               var11 = 0;
               if(1 == var8) {
                  var11 = lr.a(1, var1);
               }

               ((int[])((int[])var6[0]))[var21] = var8;
               ((int[])((int[])var6[3]))[var21] = var11;
               if(null == bta.getClassByName(var9, true).getClassLoader()) {
                  throw new SecurityException();
               }

               ((Field[])((Field[])var6[7]))[var21] = bta.getClassByName(var9, true).getDeclaredField(var10);
            }
         } catch (ClassNotFoundException var16) {
            ((int[])((int[])var6[2]))[var21] = -1;
         } catch (SecurityException var17) {
            ((int[])((int[])var6[2]))[var21] = -2;
         } catch (NullPointerException var18) {
            ((int[])((int[])var6[2]))[var21] = -3;
         } catch (Exception var19) {
            ((int[])((int[])var6[2]))[var21] = -4;
         } catch (Throwable var20) {
            ((int[])((int[])var6[2]))[var21] = -5;
         }
      }

      client.a(116, gha.c, (lm)(var6 == null?null:var6[4]));
      if(var0 >= -124) {
         a((Object[])((Object[])d[4]), 36);
      }

   }

   static final boolean a(int var0, int var1, byte var2) {
      ++e;
      if(0 <= var1 && var0 >= 0 && var1 < pd.b[1].length && ~var0 > ~pd.b[1][var1].length) {
         if(var2 != 51) {
            g = (Object[])null;
         }

         return 0 != (2 & pd.b[1][var1][var0]);
      } else {
         return false;
      }
   }

}
