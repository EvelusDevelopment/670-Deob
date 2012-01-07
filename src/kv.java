import jaggl.OpenGL;

final class kv {

   static int j;
   static int f;
   static int c;
   static Object[] a = ed.a(-2, new Object[1], (byte)-99, 19);
   static Object[] e;
   static int g;
   static int b;
   static volatile long h = 0L;
   static int d = 0;
   static ja f_i;


   static final boolean a(int var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      ++f;
      if(sqa.e < var0) {
         var0 = sqa.e;
      }

      int var8 = 0 / ((-4 - var6) / 55);
      if(0 > var3) {
         var3 = 0;
      }

      if(var0 <= var3) {
         return true;
      } else {
         var2 = -var3 + var0 >> 2;
         var7 += var3 * var4;
         var5 += var3 - 1;
         if(1 == oja.a) {
            tia.f_i += var2;

            while(true) {
               --var2;
               if(-1 < ~var2) {
                  var2 = -var3 + var0 & 3;

                  while(true) {
                     --var2;
                     if(var2 < 0) {
                        return true;
                     }

                     int var10000 = ~var7;
                     ++var5;
                     if(var10000 > ~var1[var5]) {
                        var1[var5] = var7;
                     }

                     var7 += var4;
                  }
               }

               ++var5;
               if(var1[var5] > var7) {
                  var1[var5] = var7;
               }

               var7 += var4;
               ++var5;
               if(var1[var5] > var7) {
                  var1[var5] = var7;
               }

               var7 += var4;
               ++var5;
               if(var1[var5] > var7) {
                  var1[var5] = var7;
               }

               var7 += var4;
               ++var5;
               if(var1[var5] > var7) {
                  var1[var5] = var7;
               }

               var7 += var4;
            }
         } else {
            var7 -= '\u9900';

            while(true) {
               --var2;
               if(var2 < 0) {
                  var2 = 3 & -var3 + var0;

                  while(true) {
                     --var2;
                     if(-1 < ~var2) {
                        return true;
                     }

                     ++var5;
                     if(var1[var5] > var7) {
                        return false;
                     }

                     var7 += var4;
                  }
               }

               ++var5;
               if(var1[var5] > var7) {
                  return false;
               }

               var7 += var4;
               ++var5;
               if(var1[var5] > var7) {
                  return false;
               }

               var7 += var4;
               ++var5;
               if(var1[var5] > var7) {
                  return false;
               }

               var7 += var4;
               ++var5;
               if(var1[var5] > var7) {
                  return false;
               }

               var7 += var4;
            }
         }
      }
   }

   static final Object[] a(byte var0, Object[] var1, Object[] var2) {
      if(null == var2[0]) {
         var2[0] = new int[4];
      }

      ++j;
      sea.b(var1, var2, (byte)-122);
      ((int[])((int[])var2[0]))[1] = de.a((int)0, var1);
      int var3 = 122 % ((var0 - 14) / 51);
      ((int[])((int[])var2[0]))[3] = de.a((int)0, var1);
      ((int[])((int[])var2[0]))[2] = fh.a(var1, false);
      return var2;
   }

   static final Object[] a(int var0, Object[] var1, String var2, int var3) {
      ++g;
      jpa.a((byte)-63, var1);
      oia var5 = new oia(var1);
      var1[0] = var5;
      ((int[])((int[])var1[1]))[0] = (int)(he.a(var0 ^ -96) / 1000L);
      ((short[])((short[])var1[3]))[0] = (short)var3;
      var1[2] = var2;
      return var0 != -1?(Object[])((Object[])((Object[])((Object[])var1[0]))[10]):var1;
   }

   static final Object[] a(int var0, boolean var1, int var2, int var3, Object[] var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11, int var12, int var13) {
      ++b;
      if(var4[3] == null) {
         var4[3] = new boolean[1];
      }

      if(null == var4[0]) {
         var4[0] = new byte[1];
      }

      if(null == var4[1]) {
         var4[1] = new int[5];
      }

      if(var4[2] == null) {
         var4[2] = new short[3];
      }

      ((int[])((int[])var4[1]))[2] = var3;
      ((int[])((int[])var4[1]))[1] = var10;
      ((int[])((int[])var4[1]))[4] = var12;
      ((byte[])((byte[])var4[0]))[0] = (byte)var0;
      ((short[])((short[])var4[2]))[1] = (short)var5;
      ((int[])((int[])var4[1]))[3] = var8;
      ((short[])((short[])var4[2]))[0] = (short)var13;
      ((short[])((short[])var4[2]))[2] = (short)var9;
      ((boolean[])((boolean[])var4[var2]))[0] = var11;
      ((int[])((int[])var4[1]))[0] = var7;
      return var4;
   }

   static final void a(int var0, Object[] var1, byte var2, Object[] var3, float[] var4) {
      ++c;
      if(null != var3 && 16 == var3.length) {
         int var5 = tea.a(false, var1);
         if(-1 != var5) {
            OpenGL.glUniform4fv(var5, var0, var4, 0);
         }

      } else {
         if(var2 != -108) {
            a(35, (Object[])null, (String)null, ((int[])((int[])((Object[])((Object[])var3[2]))[2]))[21]);
         }

         if(var3 != null && 12 == var3.length) {
            Class_fs.a(var4, var0, true, var1, var3);
         } else {
            throw new IllegalStateException();
         }
      }
   }

}
