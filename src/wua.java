import jaggl.OpenGL;

final class wua {

   static int h;
   static int e;
   static int b;
   static int a;
   static byte[] c = new byte[2048];
   static int d;
   static int g;
   static int f;


   static final void b(int var0, Object[] var1) {
      ++g;
      if(var0 != 0) {
         a(-14, (Object[])null);
      }

   }

   static final void a(int var0, byte var1, boolean var2, int var3, boolean var4, Object[] var5, int var6, int var7) {
      ++a;
      int var8 = 256;
      if(var4) {
         var8 |= 131072;
      }

      var6 -= ((int[])((int[])var5[1]))[2];
      if(var2) {
         var8 |= 1073741824;
      }

      var3 -= ((int[])((int[])var5[1]))[0];

      for(int var9 = var6; var0 + var6 > var9; ++var9) {
         if(var9 >= 0 && ((int[])((int[])var5[1]))[1] > var9) {
            if(null != var5 && var5.length == 9) {
               dma.a(-46, -23, 96, 5, 109, (byte)59, (Object[])null, -11, -98);
            }

            for(int var10 = var3; var7 + var3 > var10; ++var10) {
               if(var10 >= 0 && ((int[])((int[])var5[1]))[3] > var10) {
                  vpa.a(var8, -19707, var10, var5, var9);
               }
            }
         }
      }

      if(var1 < 71) {
         c = (byte[])((byte[])var5[9]);
      }

      if(var5 == null || var5.length != 21) {
         ;
      }
   }

   static final Object[] a(boolean var0, Object[] var1) {
      ++b;
      if(var1[0] == null) {
         var1[0] = new float[4];
      }

      var1[1] = oha.a(var1, (int)-152);
      if(!var0) {
         return (Object[])null;
      } else {
         mr.a(1, var1);
         return var1;
      }
   }

   static final boolean a(int var0, Object[] var1, Object[] var2, int var3) {
      ++f;
      if(0 != ((int[])((int[])var2[1]))[var0]) {
         cja.a(((Object[][])((Object[][])var2[3]))[((int[])((int[])var2[1]))[1] & Integer.MAX_VALUE], 97, var1, var3);
         return true;
      } else {
         return false;
      }
   }

   static final int a(Object[] var0, int var1) {
      ++d;
      if(null != var0 && -17 == ~var0.length) {
         return mk.a(var0, 8836);
      } else if(null != var0 && -21 == ~var0.length && var0[14].equals(Integer.valueOf(0))) {
         return dca.a((byte)-126, var0);
      } else if(null != var0 && var0.length == 22) {
         return sqa.a(var0, var1 ^ 10405);
      } else if(var0 != null && var0.length == 18) {
         return oda.a(var0, (int)3901);
      } else {
         if(var1 != 10405) {
            a(((byte[])((byte[])var0[17]))[19]);
         }

         if(null != var0 && var0.length == 23) {
            return bg.a(var0, (int)-112);
         } else {
            byte var2;
            if(null != var0 && var0.length == 17) {
               var2 = ((byte[])((byte[])var0[10]))[4];
               return var2;
            } else if(null != var0 && -21 == ~var0.length && ((int[])((int[])var0[12])).length == 4) {
               var2 = ((byte[])((byte[])var0[10]))[3];
               return var2;
            } else if(var0 != null && var0.length == 20 && ((boolean[])((boolean[])var0[8])).length == 7) {
               return hq.a(var0, false);
            } else {
               throw new IllegalStateException();
            }
         }
      }
   }

   static final void a(int var0, Object[] var1) {
      ++e;
      if(var0 == 27349) {
         if(((boolean[])((boolean[])var1[17]))[6]) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            ((boolean[])((boolean[])var1[17]))[6] = false;
         }

      }
   }

   static final void a(byte var0) {
      ++h;
      if(!gpa.a) {
         int var1 = 45 / ((var0 - 36) / 43);
         fja.d += (-fja.d + -24.0F) / 2.0F;
         aoa.b = true;
         gpa.a = true;
      }
   }

}
