
final class vv {

   static int c;
   static int f;
   static int e;
   static byte[][] baS100cache = new byte[1000][];
   static boolean[][] b = new boolean[][]{{false, false, false, false}, {false, false, false, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}};
   static int d;
   static int a;


   static final long b(Object[] var0, int var1) {
      ++e;
      if(var1 != 0) {
         ((boolean[])((boolean[])var0[7]))[13] = ((boolean[])((boolean[])((Object[])((Object[])((Object[])((Object[])var0[4]))[17]))[15]))[0];
      }

      return System.nanoTime();
   }

   static final byte[] a(byte var0, Object[] var1) {
      try {
         ++d;
         if(!((boolean[])((boolean[])var1[0]))[0] && ~((int[])((int[])((Object[])((Object[])var1[3]))[1]))[0] <= ~(((byte[])((byte[])((Object[])((Object[])var1[3]))[2])).length + -((byte[])((byte[])var1[4]))[0])) {
            if(var0 != -28) {
               b = (boolean[][])((boolean[][])var1[28]);
            }

            return (byte[])((byte[])((Object[])((Object[])var1[3]))[2]);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw vt.a(var3, "vv.D(" + var0 + ',' + (var1 != null?"{...}":"null") + ')');
      }
   }

   static final void a(Object[] var0, int var1, boolean var2, Object[] var3) {
      int var4 = 105 % ((74 - var1) / 36);
      ++c;
      int var5 = ((hb)var0[3]).k.length;
      int var6;
      if(var2 && ((hb)var0[3]).n) {
         int var7 = var5 + var5 + -((hb)var0[3]).m;
         var6 = (int)((long)((int[])((int[])var3[20]))[((int[])((int[])var0[1]))[3]] * (long)var7 >> 6);
         var5 <<= 8;
         if(var5 <= var6) {
            var6 = var5 + var5 - (1 + var6);
            ((on)var0[0]).b(true);
         }
      } else {
         var6 = (int)((long)((int[])((int[])var3[20]))[((int[])((int[])var0[1]))[3]] * (long)var5 >> 6);
      }

      ((on)var0[0]).d(var6);
   }

   static final Object[] a(Object[] var0, byte var1, qa var2, Object[] var3) {
      if(var1 >= -121) {
         return (Object[])((Object[])var3[3]);
      } else {
         ++f;
         mda.a(false, var3);
         var3[1] = var2;
         var3[0] = var0;
         return var3;
      }
   }

   static final void a(Object[] var0, int var1) {
      if(var1 == 3939) {
         ++a;
         throw new IllegalStateException();
      }
   }

}
