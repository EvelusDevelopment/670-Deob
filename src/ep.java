import java.awt.Canvas;

final class ep {

   static int g;
   static int f;
   static int h;
   static Object[] f_i = ed.a(-2, new Object[1], (byte)-100, 139);
   static int c;
   static int e;
   static int a;
   static Object[] b;
   static int d;


   static final Object[] a(int var0, boolean var1, Object[] var2, Object[] var3, byte var4) {
      if(var4 != 14) {
         return (Object[])null;
      } else {
         if(var3[1] == null) {
            var3[1] = new int[4];
         }

         if(var3[4] == null) {
            var3[4] = new boolean[1];
         }

         ++f;
         ((int[])((int[])var3[1]))[3] = -1;
         if(var2 != null && (var2.length == 16 && var2[13].equals(Integer.valueOf(0)) && var2[13].equals(Integer.valueOf(0)) || -6 == ~var2.length)) {
            dj.a((Object[])null, (int)1);
         }

         pna var6 = new pna(var3);
         var3[3] = var2;
         var3[0] = var6;
         ((int[])((int[])var3[1]))[0] = var0;
         ((boolean[])((boolean[])var3[4]))[0] = var1;
         return var3;
      }
   }

   static final void a(Object[] var0, boolean var1, Object[] var2) {
      if(!var1) {
         b = (Object[])null;
      }

      ++a;
      if(null == var0 || 2 != var0.length) {
         while(true) {
            int var3 = fh.a(var0, false);
            if(var3 == 0) {
               return;
            }

            if(var3 != 1) {
               if(2 != var3) {
                  if(3 != var3) {
                     if(4 == var3) {
                        ((int[])((int[])var2[1]))[0] = -1;
                     }
                  } else {
                     ((boolean[])((boolean[])var2[2]))[0] = true;
                  }
               } else {
                  ((int[])((int[])var2[1]))[1] = td.a(var0, 84);
               }
            } else {
               ((int[])((int[])var2[1]))[0] = fma.c(-17126, var0);
            }
         }
      }
   }

   static final int a(byte var0) {
      ++g;
      ta var1 = lna.g;
      boolean var2 = false;
      if(0 != bg.a(true, (Object[])((Object[])tu.d[5]))) {
         Canvas var3 = new Canvas();
         var3.setSize(100, 100);
         var2 = true;
         var1 = jla.a(var3, 0, (qa)null, 0, true, (Object[])null);
      }

      long var6 = he.a(-122);
      if(var0 >= -50) {
         b[8] = ((Object[])((Object[])b[3]))[8];
      }

      int var5;
      for(var5 = 0; 10000 > var5; ++var5) {
         var1.a(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
      }

      var5 = (int)(he.a(-46) - var6);
      var1.d(100, 0, 100, 0, -16777216, 14851);
      if(var2) {
         var1.a((byte)17);
      }

      return var5;
   }

   static final void a(Object[] var0, int var1) {
      ++d;
      rg.a(var0, (Object[])((Object[])var0[2]), 58);
      if(var1 != 1006) {
         a(((int[])((int[])((Object[])((Object[])f_i[0]))[8]))[13], ((byte[])((byte[])b[1]))[3], (Object[])((Object[])f_i[10]), ((int[])((int[])b[5]))[10], 58);
      }

   }

   static final boolean a(int var0, byte var1, Object[] var2, int var3, int var4) {
      ++c;
      if(((int[])((int[])var2[0]))[6] <= var0 && ((int[])((int[])var2[0]))[1] >= var0) {
         if(((int[])((int[])var2[0]))[0] <= var4 && ~var4 >= ~((int[])((int[])var2[0]))[7]) {
            if(((int[])((int[])var2[0]))[5] <= var3 && ~var3 >= ~((int[])((int[])var2[0]))[9]) {
               int var5 = var0 - ((int[])((int[])var2[0]))[8];
               if(var1 > -71) {
                  a(-106, ((boolean[])((boolean[])b[3]))[1], (Object[])null, (Object[])((Object[])b[0]), (byte)31);
               }

               int var6 = var3 - ((int[])((int[])var2[0]))[4];
               return ~(var6 * var6 + var5 * var5) > ~((int[])((int[])var2[0]))[2];
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

}
