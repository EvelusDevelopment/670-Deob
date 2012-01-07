
final class wr extends lm {

   static int[] j = new int[]{16, 32, 64, 128};
   static int m;
   Object[] f_l;
   static int q;
   static int k;
   static int n;
   static int p;
   static int o = -1;


   static final Object[] a(int var0, Object[] var1) {
      if(var1[1] == null) {
         var1[1] = new boolean[1];
      }

      ++p;
      ((boolean[])((boolean[])var1[1]))[0] = true;
      if(var0 < 25) {
         a(112, (Object[])null);
      }

      var1[4] = pja.a(var1, -10961);
      return var1;
   }

   static final void a(Object[] var0, int var1, int var2) {
      ++m;
      sj.a((Object[])((Object[])var0[8]), (byte)-114, (int)0);
      mqa.a((Object[])((Object[])var0[8]), Class_t.c, (byte)114, pba.b);
      mb.a((Object[])((Object[])var0[8]), 13195, haa.b, 0);
      roa.a(pba.g, var2 ^ 121, (Object[])((Object[])var0[8]), var2);
      mb.a((Object[])((Object[])var0[8]), 13195, pba.g, 1);
      roa.a(pba.g, 90, (Object[])((Object[])var0[8]), 1);
      oja.b(var0, var2 ^ 8);
   }

   wr(Object[] var1) {
      this.f_l = var1;
   }

   static final void a(int var0, int var1) {
      if(var0 != 32) {
         a((Object[])null, 4, -55);
      }

      ++k;
      Object[] var2 = la.a(0, (long)var1, 16);
      aia.a(var2, var0 ^ 33);
   }

}
