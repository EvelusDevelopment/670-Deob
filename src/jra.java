import java.awt.Canvas;

final class jra {

   static int e;
   static int b;
   static int f;
   static Object[] a = vra.a(536870911, 24, "", new Object[1]);
   static int g;
   static int f_i = 0;
   static int d;
   static int j;
   static int h;
   static Object[] c = ho.a(-1, 50, new Object[1], true);


   static final void a(int var0, Object[] var1) {
      ++f;
      if(var0 != -27497) {
         ((int[])((int[])c[1]))[0] = -104;
      }

   }

   static final int b(int var0, Object[] var1) {
      if(var0 >= -108) {
         c = (Object[])((Object[])((Object[])((Object[])c[8]))[0]);
      }

      ++h;
      return 4;
   }

   static final void c(int var0, Object[] var1) {
      if(((boolean[])((boolean[])var1[5]))[1]) {
         if(!((boolean[])((boolean[])var1[5]))[0]) {
            nha.a((Object[])((Object[])var1[0]), 18806, 2);
            moa.a((byte)116, (Object[])null, (Object[])((Object[])var1[0]));
         }

         nha.a((Object[])((Object[])var1[0]), 18806, 1);
         moa.a((byte)111, (Object[])null, (Object[])((Object[])var1[0]));
         nha.a((Object[])((Object[])var1[0]), 18806, 0);
         efa.a((Object[])((Object[])var1[4]), '\u0001', 0);
         ((boolean[])((boolean[])var1[5]))[1] = false;
      } else {
         db.a(770, (Object[])((Object[])var1[0]), (byte)-68, 0, 5890);
      }

      ++b;
      el.a(8448, 30862, 8448, (Object[])((Object[])var1[0]));
      if(var0 < 56) {
         c = (Object[])null;
      }

   }

   static final Object[] a(byte var0, int var1, Object[] var2) {
      ++g;
      if(null != var2 && (var2.length == 1 && var2[0].equals(Integer.valueOf(2)) || var2.length == 3 || var2.length == 2 && var2[0].equals(Boolean.valueOf(false)) && var2[0].equals(Boolean.valueOf(false)))) {
         mca.a((int)4971, (Object[])null);
      }

      Object[] var3;
      synchronized(var2[6]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var2[6]), (long)var1));
      }

      if(null == var3) {
         byte[] var4;
         synchronized(var2[2]) {
            int var7 = -90 / ((var0 + 59) / 40);
            Object[] var6 = (Object[])((Object[])var2[2]);
            int var8 = var1 >>> 7;
            var4 = qn.a(var8, Class_fs.a(false, var1), var6, -39);
         }

         var3 = ita.a((byte)-77, new Object[18]);
         var3[12] = var2;
         ((int[])((int[])var3[1]))[17] = var1;
         var3[2] = ((Object[])((Object[])var2[0])).clone();
         if(var4 != null) {
            Object[] var5 = jta.a((byte)-87, var4, new Object[3]);
            if(var2 != null && -26 == ~var2.length) {
               return null;
            }

            while(true) {
               int var14 = fh.a(var5, false);
               if(var14 == 0) {
                  break;
               }

               ol.a(var3, var14, 16383, var5);
            }
         }

         if(-1 == ((byte[])((byte[])var3[9]))[0]) {
            if(((Object[])((Object[])var3[12]))[3] == uha.g) {
               ((byte[])((byte[])var3[9]))[0] = 1;
            } else {
               ((byte[])((byte[])var3[9]))[0] = 0;
            }
         }

         if(var3[16] == null) {
            var3[16] = new int[0];
         }

         synchronized(var2[6]) {
            il.a((long)var1, var3, true, (Object[])((Object[])var2[6]));
            return var3;
         }
      } else {
         return var3;
      }
   }

   static final void a(Object[] var0, boolean var1) {
      if(null == var0[1]) {
         var0[1] = new int[4];
      }

      ++j;
      if(!var1) {
         a((Object[])null, true);
      }

   }

   static final Object[] a(Object[] var0, long var1, byte var3, Canvas var4, Object[] var5) {
      ++e;
      kla.b((byte)67, var5);
      int var6 = -37 / ((var3 - 69) / 49);
      qt.a(var0, 0, var5);
      ((long[])((long[])var5[4]))[0] = var1;
      var5[2] = var4;
      var5[3] = var0[86];
      hv.a((int)3444, var5);
      return var5;
   }

   static final boolean a(String var0, String var1, byte var2, Object[] var3) {
      ++d;
      if(!ev.a(var2 ^ 4143, var3)) {
         return false;
      } else {
         var0 = var0.toLowerCase();
         var1 = var1.toLowerCase();
         int var4 = pe.a((Object[])((Object[])((Object[])((Object[])var3[3]))[4]), false, hp.a(var0, (int)1));
         if(sda.a(var4, var3, 53)) {
            if(var2 != 55) {
               c(-66, new Object[7]);
            }

            int var5 = pe.a(((Object[][])((Object[][])((Object[])((Object[])var3[3]))[6]))[var4], false, hp.a(var1, (int)1));
            return Class_ss.a(var5, 5, var3, var4);
         } else {
            return false;
         }
      }
   }

}
