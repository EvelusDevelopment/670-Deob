import jaggl.OpenGL;

final class Class_m {

   static int b;
   static int e;
   static Object[][] f = new Object[0][];
   static int c;
   static Object[] a;
   static int d;


   static final boolean a(int var0, int var1) {
      ++c;
      if(51 != var0 && var0 != 3 && var0 != 2 && var0 != 50 && 25 != var0 && 1003 != var0) {
         if(var1 > -51) {
            ((boolean[])((boolean[])a[6]))[0] = false;
         }

         return var0 == 17;
      } else {
         return true;
      }
   }

   static final void a(int var0, Object[] var1) {
      ++d;
      if(!((boolean[])((boolean[])var1[63]))[0]) {
         OpenGL.glDisable(16384);
         OpenGL.glDisable(16385);
      } else {
         OpenGL.glEnable(16384);
         OpenGL.glEnable(16385);
      }

      int var2 = -109 % ((var0 + 51) / 52);
   }

   static final int a(Object[] var0, int var1) {
      if(var1 != -23352) {
         a = (Object[])null;
      }

      ++e;
      return ((int[])((int[])var0[1]))[0];
   }

   static final void a(Object[] var0, Object[] var1, boolean var2, int var3) {
      ++b;
      if(var2) {
         if(1 == var3) {
            fh.a(var0, false);
         } else {
            int var4;
            int var5;
            if(var3 != 2) {
               if(3 != var3) {
                  if(var3 == 40) {
                     var4 = fh.a(var0, false);
                     if(null != var1 && var1.length == 1) {
                        return;
                     }

                     var1[3] = new short[var4];
                     var1[1] = new short[var4];

                     for(var5 = 0; var4 > var5; ++var5) {
                        ((short[])((short[])var1[1]))[var5] = (short)de.a((int)0, var0);
                        ((short[])((short[])var1[3]))[var5] = (short)de.a((int)0, var0);
                     }
                  } else if(var3 == 41) {
                     var4 = fh.a(var0, false);
                     if(var0 != null && 1 == var0.length && var0[0].equals(Integer.valueOf(2)) && var0[0].equals(Boolean.valueOf(false))) {
                        kla.c((byte)-66, (Object[])null);
                     }

                     var1[5] = new short[var4];
                     var1[2] = new short[var4];

                     for(var5 = 0; var4 > var5; ++var5) {
                        ((short[])((short[])var1[5]))[var5] = (short)de.a((int)0, var0);
                        ((short[])((short[])var1[2]))[var5] = (short)de.a((int)0, var0);
                     }
                  } else if(60 <= var3 && 70 > var3) {
                     ((int[])((int[])var1[4]))[var3 - 60] = fma.c(-17126, var0);
                  }
               }
            } else {
               var4 = fh.a(var0, false);
               var1[6] = new int[var4];
               if(null != var1 && -6 == ~var1.length && var1[1].equals(Boolean.valueOf(false))) {
                  kla.c((byte)-111, (Object[])null);
               }

               for(var5 = 0; var5 < var4; ++var5) {
                  ((int[])((int[])var1[6]))[var5] = fma.c(-17126, var0);
               }
            }
         }

      }
   }

}
