import java.io.File;

final class ph {

   static int c;
   static long[] d = new long[256];
   static Object[] e;
   static int a;
   static int b;
   static Object[] f;


   static final Object[] a(Object[] var0, int var1, ta var2) {
      if(var1 != 2) {
         a((Object[])((Object[])f[6]), ((int[])((int[])((Object[])((Object[])e[5]))[4]))[3], (ta)null);
      }

      ++c;
      Object[] var3 = (Object[])((Object[])woa.a(5, var0)[1]);
      if(var0[22] == null) {
         var0[22] = lv.a((int)((float[])((float[])var3[1]))[1], (int)((float[])((float[])var3[1]))[0], (int)((float[])((float[])var3[1]))[2], 0, sda.a(var0, var2, var1 - 11123, 0));
      }

      return (Object[])((Object[])var0[22]);
   }

   static final int a(int var0, Object[] var1) {
      ++a;
      if(((boolean[])((boolean[])var1[1]))[0]) {
         return 100;
      } else {
         String var3 = (String)var1[2];
         int var2;
         if(null != hha.d && !hha.d.f) {
            var2 = -1;
         } else if(!nua.d.containsKey(var3)) {
            String var4;
            if(!ela.b.startsWith("win")) {
               if(!ela.b.startsWith("linux")) {
                  if(ela.b.startsWith("mac")) {
                     var4 = "lib" + var3 + ".dylib";
                  } else {
                     var4 = null;
                  }
               } else {
                  var4 = "lib" + var3 + ".so";
               }
            } else {
               var4 = var3 + ".dll";
            }

            if(var4 == null) {
               var2 = -1;
            } else {
               String var6 = iu.a + var4;
               Object[] var8 = eoa.g;
               String var10 = "";
               boolean var7;
               if(!ev.a((int)4120, var8)) {
                  var7 = false;
               } else {
                  String var9 = var6.toLowerCase();
                  var10 = var10.toLowerCase();
                  int var11 = pe.a((Object[])((Object[])((Object[])((Object[])var8[3]))[4]), false, hp.a(var9, (int)1));
                  if(0 > var11) {
                     var7 = false;
                  } else {
                     int var12 = pe.a(((Object[][])((Object[][])((Object[])((Object[])var8[3]))[6]))[var11], false, hp.a(var10, var0 ^ -2));
                     if(0 <= var12) {
                        var7 = true;
                     } else {
                        var7 = false;
                     }
                  }
               }

               if(var7) {
                  if(!Class_b.a(var6, (byte)-41, eoa.g)) {
                     var2 = eca.a(eoa.g, var6, 0);
                  } else {
                     label86: {
                        byte[] var20 = sra.a(var6, eoa.g, "", true);
                        File var21 = null;
                        if(!qw.d) {
                           var21 = rf.a(var4, 0);
                        } else {
                           var21 = qw.a(-2, var4);
                        }

                        try {
                           hha.d.a(var21, var20, 69);
                        } catch (Throwable var19) {
                           var2 = -1;
                           break label86;
                        }

                        var2 = 100;
                        nua.d.put(var3, var21);
                     }
                  }
               } else {
                  var2 = -1;
               }
            }
         } else {
            var2 = 100;
         }

         if(~var2 <= var0 && 100 >= var2) {
            return var2;
         } else {
            ((boolean[])((boolean[])var1[1]))[0] = true;
            return 100;
         }
      }
   }

   static {
      for(int var2 = 0; 256 > var2; ++var2) {
         long var0 = (long)var2;

         for(int var3 = 0; 8 > var3; ++var3) {
            if((var0 & 1L) == 1L) {
               var0 = -3932672073523589310L ^ var0 >>> 1;
            } else {
               var0 >>>= 1;
            }
         }

         d[var2] = var0;
      }

   }
}
