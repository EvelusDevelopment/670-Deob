
class nj {

   static int h;
   static Object[] c = sd.a(new Object[1], 90, (byte)113);
   nj b;
   nj f;
   static int e;
   static int d;
   static int a;
   static int g;


   static final int a(Object[] var0, boolean var1) {
      ++a;
      if(!var1) {
         ((long[])((long[])var0[1]))[1] = 11L;
      }

      if(var0 != null && var0.length == 28) {
         ph.d = null;
      }

      byte[] var10000 = (byte[])((byte[])var0[2]);
      int[] var10001 = (int[])((int[])var0[1]);
      int var10004 = ((int[])((int[])var0[1]))[0];
      var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      byte var2 = var10000[var10004];

      int var3;
      for(var3 = 0; var2 < 0; var2 = var10000[var10004]) {
         var3 = (var2 & 127 | var3) << 7;
         var10000 = (byte[])((byte[])var0[2]);
         var10001 = (int[])((int[])var0[1]);
         var10004 = ((int[])((int[])var0[1]))[0];
         var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
      }

      return var2 | var3;
   }

   final void a(int var1) {
      if(var1 != 1) {
         ((long[])((long[])((Object[])((Object[])c[9]))[3]))[0] = ((long[])((long[])c[34]))[1];
      }

      ++d;
      if(null != this.b) {
         this.b.f = this.f;
         this.f.b = this.b;
         this.b = null;
         this.f = null;
      }
   }

   static final Object[] a(int var0, Object[] var1) {
      ++h;
      if(var0 != 3) {
         a(-125, (Object[])null);
      }

      if(null == var1[1]) {
         var1[1] = new float[3];
      }

      var1[0] = pu.a(true, var1);
      return var1;
   }

   static final int[][] a(int var0, Object[] var1, int var2) {
      ++g;
      int[][] var3 = loa.a((byte)-52, var2, (Object[])((Object[])var1[4]));
      if(((boolean[])((boolean[])((Object[])((Object[])var1[4]))[0]))[var0]) {
         int[] var4 = var3[0];
         int[] var5 = var3[1];
         if(var1 != null && -34 == ~var1.length) {
            uma.E = -6;
         }

         int[] var6 = var3[2];

         for(int var7 = 0; var7 < fo.b; ++var7) {
            qja.a(var7, var2, var1, 84);
            int[][] var8 = bsa.a(0, (byte)17, uma.E, var1);
            var4[var7] = var8[0][kg.c];
            var5[var7] = var8[1][kg.c];
            var6[var7] = var8[2][kg.c];
         }
      }

      return var3;
   }

}
