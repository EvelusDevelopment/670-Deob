
final class gl {

   static Object[][] a = new Object[50][];
   static int f;
   static int e;
   static int b;
   static boolean d = false;
   static int c;


   static final void a(Object[] var0, int var1) {
      int var2 = ((int[])((int[])var0[1]))[2];
      if(9 != var2) {
         if(var2 != 8) {
            if(var2 == 5) {
               ((int[])((int[])var0[1]))[1] = 0;
               ((int[])((int[])var0[1]))[6] = 8192;
               ((int[])((int[])var0[1]))[3] = 4;
               ((int[])((int[])var0[1]))[0] = 2048;
            } else if(4 == var2) {
               ((int[])((int[])var0[1]))[6] = 2048;
               ((int[])((int[])var0[1]))[0] = 2048;
               ((int[])((int[])var0[1]))[3] = 4;
               ((int[])((int[])var0[1]))[1] = 0;
            } else if(var2 == 2) {
               ((int[])((int[])var0[1]))[1] = 0;
               ((int[])((int[])var0[1]))[3] = 1;
               ((int[])((int[])var0[1]))[0] = 2048;
               ((int[])((int[])var0[1]))[6] = 2048;
            } else if(var2 != 3) {
               if(var2 == 13) {
                  ((int[])((int[])var0[1]))[0] = 2048;
                  ((int[])((int[])var0[1]))[3] = 2;
                  ((int[])((int[])var0[1]))[6] = 8192;
                  ((int[])((int[])var0[1]))[1] = 0;
               } else if(11 == var2) {
                  ((int[])((int[])var0[1]))[1] = 1536;
                  ((int[])((int[])var0[1]))[3] = 3;
                  ((int[])((int[])var0[1]))[0] = 512;
                  ((int[])((int[])var0[1]))[6] = 4096;
               } else if(12 == var2) {
                  ((int[])((int[])var0[1]))[1] = 0;
                  ((int[])((int[])var0[1]))[6] = 2048;
                  ((int[])((int[])var0[1]))[0] = 2048;
                  ((int[])((int[])var0[1]))[3] = 2;
               } else if(var2 == 6) {
                  ((int[])((int[])var0[1]))[1] = 1280;
                  ((int[])((int[])var0[1]))[0] = 768;
                  ((int[])((int[])var0[1]))[3] = 3;
                  ((int[])((int[])var0[1]))[6] = 2048;
               } else if(15 != var2) {
                  if(16 != var2) {
                     if(7 == var2) {
                        ((int[])((int[])var0[1]))[1] = 1280;
                        ((int[])((int[])var0[1]))[6] = 4096;
                        ((int[])((int[])var0[1]))[0] = 768;
                        ((int[])((int[])var0[1]))[3] = 3;
                     } else if(10 != var2) {
                        if(14 == var2) {
                           ((int[])((int[])var0[1]))[1] = 1280;
                           ((int[])((int[])var0[1]))[6] = 2048;
                           ((int[])((int[])var0[1]))[3] = 1;
                           ((int[])((int[])var0[1]))[0] = 768;
                        } else {
                           ((int[])((int[])var0[1]))[3] = 0;
                           ((int[])((int[])var0[1]))[1] = 0;
                           ((int[])((int[])var0[1]))[6] = 2048;
                           ((int[])((int[])var0[1]))[0] = 2048;
                        }
                     } else {
                        ((int[])((int[])var0[1]))[0] = 512;
                        ((int[])((int[])var0[1]))[3] = 3;
                        ((int[])((int[])var0[1]))[1] = 1536;
                        ((int[])((int[])var0[1]))[6] = 2048;
                     }
                  } else {
                     ((int[])((int[])var0[1]))[3] = 1;
                     ((int[])((int[])var0[1]))[1] = 1792;
                     ((int[])((int[])var0[1]))[0] = 256;
                     ((int[])((int[])var0[1]))[6] = 8192;
                  }
               } else {
                  ((int[])((int[])var0[1]))[0] = 512;
                  ((int[])((int[])var0[1]))[6] = 4096;
                  ((int[])((int[])var0[1]))[3] = 1;
                  ((int[])((int[])var0[1]))[1] = 1536;
               }
            } else {
               ((int[])((int[])var0[1]))[0] = 2048;
               ((int[])((int[])var0[1]))[3] = 1;
               ((int[])((int[])var0[1]))[1] = 0;
               ((int[])((int[])var0[1]))[6] = 4096;
            }
         } else {
            ((int[])((int[])var0[1]))[6] = 2048;
            ((int[])((int[])var0[1]))[0] = 1024;
            ((int[])((int[])var0[1]))[3] = 3;
            ((int[])((int[])var0[1]))[1] = 1024;
         }
      } else {
         ((int[])((int[])var0[1]))[1] = 1024;
         ((int[])((int[])var0[1]))[3] = 3;
         ((int[])((int[])var0[1]))[0] = 1024;
         ((int[])((int[])var0[1]))[6] = 4096;
      }

      if(var1 != -1527) {
         a = (Object[][])((Object[][])null);
      }

      ++b;
   }

   static final boolean a(boolean var0, Object[] var1) {
      ++c;
      if(null != var1[11]) {
         if(var1 != null && (var1.length == 4 || 14 == var1.length || var1.length == 34 && var1[4].equals(Boolean.valueOf(false)))) {
            ita.a((byte)-77, (Object[])null);
         }

         for(int var2 = 0; var2 < ((int[])((int[])var1[11])).length; ++var2) {
            if(~((int[])((int[])var1[11]))[var2] != 0) {
               Object[] var3 = jra.a((byte)7, ((int[])((int[])var1[11]))[var2], (Object[])((Object[])var1[12]));
               if(~((int[])((int[])var3[1]))[20] != 0 || 0 != ~((int[])((int[])var3[1]))[27] || 0 != ~((int[])((int[])var3[1]))[10]) {
                  return true;
               }
            }
         }

         if(!var0) {
            a(((int[])((int[])((Object[])((Object[])var1[24]))[4]))[1], (Object[])null);
         }

         return false;
      } else {
         return ((int[])((int[])var1[1]))[20] != -1 || ~((int[])((int[])var1[1]))[27] != 0 || ((int[])((int[])var1[1]))[10] != -1;
      }
   }

   static final pf a(int var0, Object[] var1) {
      if(var0 <= 2) {
         return (pf)var1[13];
      } else {
         ++e;
         return new pf(var1);
      }
   }

   static final void a(int var0, int var1, int var2, Object[] var3, byte var4, int var5, int var6, int var7) {
      pma.a(var3, var5, var6, var7, 1, var2, -126, var0, var1);
      int var8 = 48 / ((27 - var4) / 45);
      ++f;
   }

}
