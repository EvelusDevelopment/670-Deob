
final class gm {

   static int a;
   static int d;
   static int b;
   static Object[] c;


   static final void a(int var0, Object[] var1, Object[] var2) {
      ++d;
      if(var0 > -35) {
         a((Object[])null, ((int[])((int[])c[9]))[3]);
      }

      int var3 = rda.d(0, var1);
      var2[0] = bj.a((byte)7)[var3];
      int var4;
      if(rna.f_i == var2[0]) {
         var4 = rda.d(0, var1);
         var2[3] = bj.a((byte)7)[var4];
         ((int[])((int[])var2[1]))[0] = rda.d(0, var1);
      }

      var2[6] = eha.a(0, var1);
      var2[2] = eha.a(0, var1);
      var4 = rda.d(0, var1);
      var2[5] = new int[var4];
      var2[4] = new int[var4];

      for(int var5 = 0; var5 < var4; ++var5) {
         ((int[])((int[])var2[4]))[var5] = rda.d(0, var1);
         ((int[])((int[])var2[5]))[var5] = rda.d(0, var1);
      }

      if(var2 != null && (-3 == ~var2.length || var2.length == 23)) {
         nn.a((Object[])null, (byte)-30);
      }

   }

   static final tha a(Object[] var0, int var1) {
      ++b;
      tha var2 = ((tha)var0[0]).s;
      if(var2 != var0[var1]) {
         var0[1] = var2.s;
         return var2;
      } else {
         var0[1] = null;
         return null;
      }
   }

   static final Object[] a(int var0, int var1, int var2) {
      Object[] var3 = ju.g[var0][var1][var2];
      if(var3 == null) {
         return null;
      } else {
         poa.a((Object[])((Object[])var3[6]));
         if(var3[6] != null) {
            Object[] var4 = (Object[])((Object[])var3[6]);
            var3[6] = null;
            return var4;
         } else {
            return null;
         }
      }
   }

}
