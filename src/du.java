import jaclib.memory.Stream;

final class du {

   static int f_i;
   static int b;
   static int c;
   static Object[] h = pa.a("RC", false, 1, new Object[2]);
   static int e;
   static int f;
   static int g;
   static Object[] a = sd.a(new Object[1], 26, (byte)111);
   static int[] d;


   static final boolean a(byte var0, Object[] var1) {
      ++f;
      boolean var2;
      if(var1 != null && -4 == ~var1.length) {
         var2 = true;
         return var2;
      } else {
         if(var0 > -7) {
            a((byte)45, (Object[])((Object[])h[3]));
         }

         if(null != var1 && var1.length == 4) {
            var2 = false;
            return var2;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final boolean c(boolean var0, Object[] var1) {
      if(!var0) {
         return false;
      } else {
         ++b;

         for(int var2 = ((short[])((short[])var1[13]))[1]; ((short[])((short[])var1[13]))[0] >= var2; ++var2) {
            for(int var3 = ((short[])((short[])var1[13]))[3]; ((short[])((short[])var1[13]))[2] >= var3; ++var3) {
               int var4 = -bd.h + var2 + vt.d;
               if(var4 >= 0 && var4 < ju.e.length) {
                  int var5 = -oaa.a + var3 + vt.d;
                  if(0 <= var5 && ju.e.length > var5 && ju.e[var4][var5]) {
                     return true;
                  }
               }
            }
         }

         if(null != var1 && var1.length == 3) {
            c(var0, (Object[])null);
         }

         return false;
      }
   }

   static final long a(boolean var0, Object[] var1) {
      if(var0) {
         a(false, (Object[])((Object[])var1[1]));
      }

      ++g;
      return ((long[])((long[])var1[0]))[1];
   }

   static final void b(boolean var0, Object[] var1) {
      if(!var0) {
         a(77, -25, (Object[])null);
      }

      ++c;
      sj.a(64, new Object[3], (byte)-62);
   }

   static final void a(int var0, int var1, Object[] var2) {
      if(var0 != -23874) {
         d = (int[])((int[])a[6]);
      }

      ((Stream)var2[9]).d(3 + 4 * var1);
      ++f_i;
      ((Stream)var2[9]).b(-1);
   }

   static final long a(int var0, Object[] var1) {
      ++e;
      int var2 = -46 / ((-36 - var0) / 54);
      if(null != var1 && var1.length == 4) {
         return eca.b(var1, -23950);
      } else if(var1 != null && 5 == var1.length) {
         return iba.a((byte)76, var1);
      } else {
         throw new IllegalStateException();
      }
   }

}
