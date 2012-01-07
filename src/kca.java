import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaggl.OpenGL;

final class kca {

   static int d;
   static int f;
   static int e;
   static String b = null;
   static boolean a = false;
   static int c;


   static final void a(int var0, int var1, Object[] var2) {
      ++d;
      var2[2] = ho.a(4 * var0, true, var1 ^ 38, (Object[])((Object[])var2[var1]));
      var2[6] = new Stream((Buffer)var2[2], 0, 4 * var0);
   }

   static final void a(int var0, Object[] var1, int var2, int var3) {
      ++c;
      if(null == var1 || var1.length != 2) {
         if(var1 != null && -4 == ~var1.length) {
            pta.a(-104, var0, var3, var1);
         } else if(var2 == '\u8515') {
            if(var1 != null && 4 == var1.length) {
               waa.a(var0, var1, var3, 30);
            } else if(null != var1 && -2 == ~var1.length) {
               mma.a(var0, -904, var3, var1);
            } else {
               throw new IllegalStateException();
            }
         }
      }
   }

   static final Object[] a(int var0, Object[] var1, int var2, Object[] var3, Object[] var4, Object[] var5) {
      wla.b(var5, var2 - 95);
      ++e;
      np.a(1, var1, var4, '\u8513', var5, var3, false, 6 * var0 * var0);
      ((int[])((int[])var5[1]))[3] = var0;
      moa.a((byte)97, var5, (Object[])((Object[])var5[4]));

      for(int var6 = 0; var6 < 6; ++var6) {
         OpenGL.glTexImage2Dub(var6 + '\u8515', 0, bu.a(var2 + 122, (Object[])((Object[])var5[5]), (Object[])((Object[])var5[2])), var0, var0, 0, rha.b(8, (Object[])((Object[])var5[2])), 5121, (byte[])null, 0);
      }

      gg.a((byte)-126, var5, true);
      if(var2 != -2) {
         b = (String)null;
      }

      return var5;
   }

   static final boolean a(Object[] var0, int var1) {
      ++f;
      boolean var2;
      if(null != var0 && -17 == ~var0.length && 3 == ((byte[])((byte[])var0[10])).length) {
         var2 = ((boolean[])((boolean[])var0[8]))[6];
         return var2;
      } else if(null != var0 && -44 == ~var0.length) {
         var2 = ((boolean[])((boolean[])var0[8]))[6];
         return var2;
      } else if(var0 != null && -21 == ~var0.length && 2 == ((byte[])((byte[])var0[10])).length && var0[14].equals(Integer.valueOf(0))) {
         return qca.a(-90, var0);
      } else if(null != var0 && var0.length == 20 && 3 == ((byte[])((byte[])var0[10])).length) {
         return csa.a(var0, (byte)91);
      } else {
         if(null != var0 && var0.length == 1 && var0[0].equals(Integer.valueOf(0))) {
            fja.a(9, (Object[])null);
         }

         if(null != var0 && 16 == var0.length && ((boolean[])((boolean[])var0[8])).length == 5) {
            return pla.a(var1 - 27373, var0);
         } else if(var0 != null && -23 == ~var0.length) {
            return lna.a(var0, (int)6);
         } else if(null != var0 && var0.length == 18) {
            return io.a((int)16, var0);
         } else {
            if(var1 != 27381) {
               a = true;
            }

            if(var0 != null && var0.length == 23) {
               return dua.a(var0, (int)122);
            } else if(null != var0 && -18 == ~var0.length) {
               return ww.a(var0, (byte)-83);
            } else if(var0 != null && -25 == ~var0.length) {
               var2 = ((boolean[])((boolean[])var0[8]))[6];
               return var2;
            } else if(var0 != null && -21 == ~var0.length && ((int[])((int[])var0[12])).length == 4) {
               if(var0[19] == null) {
                  var2 = false;
               } else {
                  var2 = ((ka)var0[19]).XA();
               }

               return var2;
            } else if(null != var0 && var0.length == 20 && -8 == ~((boolean[])((boolean[])var0[8])).length) {
               return taa.a(var0, (byte)-85);
            } else {
               throw new IllegalStateException();
            }
         }
      }
   }

}
