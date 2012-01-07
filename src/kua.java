
final class kua {

   static int c = 0;
   static boolean h = false;
   static int[] f_i = new int[2];
   static int e;
   static int b;
   static int a;
   static int g;
   static int f;
   static int d;


   static final void a(lh var0, int var1, Object[] var2, boolean var3) {
      synchronized(var2) {
         if(var1 != -17) {
            return;
         }

         gma.a(31708, var3, var2, true, var0);
      }

      ++d;
   }

   static final int a(int var0, Object[] var1) {
      ++g;
      if(var0 >= -88) {
         a((byte)-14, (Object[])null);
      }

      int var2 = 255 & ((byte[])((byte[])var1[2]))[((int[])((int[])var1[1]))[0]];
      return 128 <= var2?de.a((int)0, var1) - '\uc000':fh.a(var1, false) - 64;
   }

   static final void a(Object[] var0, ta var1, byte var2) {
      ++e;
      if(var0 != null && -17 == ~var0.length) {
         nra.a(var0, 14, var1);
      } else if(null != var0 && 20 == var0.length && ((boolean[])((boolean[])var0[8])).length == 6) {
         fla.a((Object[])((Object[])var0[17]), -80, var1);
      } else if(var0 != null && var0.length == 22) {
         fla.a((Object[])((Object[])var0[18]), -69, var1);
      } else if(var0 != null && var0.length == 18) {
         bf.a(var1, var0, 24531);
      } else if(var0 != null && var0.length == 23) {
         tb.a(var0, false, var1);
      } else {
         if(var2 <= 58) {
            a((int)-65, (Object[])((Object[])var0[18]));
         }

         if(null != var0 && var0.length == 17) {
            dca.a(var1, 29075, var0);
         } else if(var0 != null && -21 == ~var0.length && ((int[])((int[])var0[12])).length == 4) {
            ya var3 = null;
            Object[] var4;
            if(var0[16] == null && ((boolean[])((boolean[])var0[8]))[6]) {
               var4 = qra.a(262144, true, var1, var0, -128);
               var3 = (ya)(null != var4?var4[0]:null);
            } else {
               var3 = (ya)var0[16];
               var0[16] = null;
            }

            var4 = (Object[])((Object[])woa.a(5, var0)[1]);
            if(null != var3) {
               wg.a(var3, ((byte[])((byte[])var0[10]))[1], (int)((float[])((float[])var4[1]))[2], (int)((float[])((float[])var4[1]))[1], (boolean[])null);
            }

         } else if(var0 != null && var0.length == 20 && 7 == ((boolean[])((boolean[])var0[8])).length) {
            fi.a(var0, var1, 16854);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void b(byte var0, Object[] var1) {
      if(var0 > 86) {
         ++f;
      }
   }

   static final void a(Object[] var0, int var1) {
      ++a;
      if(var1 <= -75) {
         if(null == var0[1]) {
            var0[1] = new int[2];
         }

      }
   }

   static final void a(byte var0, Object[] var1) {
      if(var0 < 30) {
         c = 63;
      }

      if(var1[0] == null) {
         var1[0] = new byte[1];
      }

      ++b;
      if(var1[1] == null) {
         var1[1] = new int[1];
      }

   }

}
