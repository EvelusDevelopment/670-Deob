
final class ria {

   static int b;
   static Object[] a = uga.b(new Object[2], 68);
   static int e;
   static Object[] c = nla.a(95, new Object[0], 6);
   static float[] d = new float[16];


   static final Object[] a(Object[] var0, Object[] var1, int var2) {
      if(var2 >= -13) {
         return (Object[])null;
      } else {
         ++b;
         int var3 = -1;
         if(0 == ~((int[])((int[])var1[1]))[3]) {
            if(~((int[])((int[])var1[1]))[12] != 0) {
               var3 = cj.a(-106, ((int[])((int[])var1[1]))[12], var0);
            }
         } else {
            var3 = rg.a(1, ((int[])((int[])var1[1]))[3], var0);
         }

         if(0 <= var3 && -1 + ((int[])((int[])var1[11])).length > var3 && ((int[])((int[])var1[11]))[var3] != -1) {
            return jra.a((byte)-116, ((int[])((int[])var1[11]))[var3], (Object[])((Object[])var1[12]));
         } else {
            int var4 = ((int[])((int[])var1[11]))[-1 + ((int[])((int[])var1[11])).length];
            return -1 != var4?jra.a((byte)-128, var4, (Object[])((Object[])var1[12])):null;
         }
      }
   }

   static final void a(Object[] var0, int var1) throws oqa {
      var0[40] = ab.a(new Object[2], (byte)110);
      ++e;
      var0[29] = ab.a(new Object[2], (byte)-96);
      var0[32] = nj.a(3, new Object[2]);
      var0[26] = tja.a(1, new Object[2]);
      var0[var1] = tja.a(var1 - 36, new Object[2]);
      var0[35] = tja.a(1, new Object[2]);
      if(null == var0 || var0.length != 4) {
         var0[30] = tja.a(1, new Object[2]);
         var0[31] = nj.a(var1 ^ 38, new Object[2]);
         var0[25] = tja.a(1, new Object[2]);
         var0[36] = nj.a(var1 ^ 38, new Object[2]);
         ((float[])((float[])var0[34]))[0] = 0.0F;
         ab.a(new Object[2], (byte)-95);
      }
   }

}
