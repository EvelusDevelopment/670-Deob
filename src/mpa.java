
final class mpa {

   static ta b;
   static int d;
   static int c;
   static int e;
   static int a;
   static int f;


   static final void a(Object[] var0, byte var1) {
      if(var1 == 19) {
         ++e;
         if(null != var0 && var0.length == 87) {
            tt.a(var0, true);
         } else {
            Class_e.a(var0, -117);
         }
      }
   }

   static final void a(Object[] var0, byte var1, String var2) {
      ++a;
      int var3 = var2.indexOf(0);
      if(var3 < 0) {
         byte[] var10000 = (byte[])((byte[])var0[2]);
         int[] var10001 = (int[])((int[])var0[1]);
         int var10004 = ((int[])((int[])var0[1]))[0];
         var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
         var10000[var10004] = 0;
         ((int[])((int[])var0[1]))[0] += nea.a(0, 4, (byte[])((byte[])var0[2]), var2.length(), ((int[])((int[])var0[1]))[0], var2);
         var10000 = (byte[])((byte[])var0[2]);
         var10001 = (int[])((int[])var0[1]);
         var10004 = ((int[])((int[])var0[1]))[0];
         var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
         var10000[var10004] = var1;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   static final Object[] a(int var0, Object[] var1) {
      if(null == var1[7]) {
         var1[7] = new boolean[1];
      }

      if(null == var1[1]) {
         var1[1] = new int[38];
      }

      ++f;
      gr.a(var1, var0 - 91);
      if(var0 != 1) {
         a((Object[])((Object[])var1[15]), (byte)-110);
      }

      return var1;
   }

   static final String a(int var0, Object[] var1, byte var2) {
      if(var2 > -100) {
         b = (ta)null;
      }

      ++c;
      return !pga.a(var0, client.c(var1), 1) && null == var1[61]?null:(var1[16] != null && ((Object[])((Object[])var1[16])).length > var0 && ((String[])((String[])var1[16]))[var0] != null && ((String[])((String[])var1[16]))[var0].trim().length() != 0?((String[])((String[])var1[16]))[var0]:(!jp.j?null:"Hidden-" + var0));
   }

}
