
final class oc extends lm {

   static Object[] s;
   static long f_l;
   static int u;
   static int p;
   Object[] n;
   static int r;
   static int k;
   static int t;
   static int j;
   static int q;
   static int o;
   static int m;


   static final qua b(Object[] var0, byte var1) {
      ++r;
      if(var1 != 24) {
         f_l = -105L;
      }

      return new qua(var0);
   }

   static final Object[] a(Object[] var0, int var1) {
      ++q;
      int var2 = 77 / ((51 - var1) / 36);
      if(null == var0[2]) {
         var0[2] = new boolean[1];
      }

      var0[0] = pi.a((byte)-92, var0);
      return var0;
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 != -62) {
         ((boolean[])((boolean[])s[32]))[1] = true;
      }

      if(var0[1] == null) {
         var0[1] = new int[5];
      }

      if(var0[3] == null) {
         var0[3] = new boolean[2];
      }

      ++t;
   }

   static final int b(int var0, Object[] var1) {
      if(var0 >= -120) {
         s = (Object[])null;
      }

      ((boolean[])((boolean[])var1[3]))[1] = true;
      ++u;
      return 2;
   }

   static final String a(int var0, Object[] var1) {
      if(var0 != 2) {
         a(-68, (Object[])null);
      }

      ++m;
      return (String)var1[3];
   }

   static final boolean a(Object[] var0, int var1, byte var2) {
      ++p;
      if(var2 >= -8) {
         s = (Object[])null;
      }

      if(null == var0) {
         throw new IllegalStateException();
      } else {
         boolean var3;
         if(0 <= var1 && var1 < 112) {
            var3 = ((boolean[])((boolean[])var0[2]))[var1];
         } else {
            var3 = false;
         }

         return var3;
      }
   }

   oc(Object[] var1) {
      this.n = var1;
   }

   static final boolean c(int var0, Object[] var1) {
      if(var0 >= -44) {
         a((Object[])null, 68, (byte)16);
      }

      ++k;
      synchronized(var1) {
         return ((tf)var1[12]).a();
      }
   }

   static final void a(int var0, int var1) {
      if(var0 != -7850) {
         f_l = 78L;
      }

      ++o;
      if(var1 != lj.a) {
         rp.c = wpa.a = rka.a[var1];
         ima.a(var0 + 7912);
         va.m = new int[4][rp.c >> 3][wpa.a >> 3];
         pj.d = new int[rp.c][wpa.a];
         ra.f_i = new int[rp.c][wpa.a];

         for(int var2 = 0; 4 > var2; ++var2) {
            hj.f_i[var2] = oma.a(rp.c, wpa.a, 1);
         }

         fga.d = new byte[4][rp.c][wpa.a];
         tia.a(rp.c, true, wpa.a, 4);
         af.a(rp.c >> 3, var0 ^ -7854, lna.g, wpa.a >> 3);
         lj.a = var1;
      }
   }

   static final int a(int var0) {
      ++j;
      return var0 != 15?62:15;
   }

}
