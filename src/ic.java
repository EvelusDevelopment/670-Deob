
final class ic {

   static int a;
   static Object[] f = sj.a(50, new Object[3], (byte)-113);
   static int e;
   static int g;
   static int b;
   static int[] d = new int[3];
   static Object[] c = sd.a(new Object[1], 49, (byte)121);


   static final String a(byte var0, Object[] var1) {
      if(var0 < 93) {
         return (String)null;
      } else {
         ++a;
         return (String)var1[2];
      }
   }

   static final void b(Object[] var0, int var1) {
      ++b;
      if(var1 <= 69) {
         f[2] = (Object)null;
      }

      ((boolean[])((boolean[])var0[3]))[2] = true;
      ((boolean[])((boolean[])var0[3]))[1] = true;
   }

   static final Object[] a(Object[] var0, int var1) {
      int var2 = 7 % ((var1 - 35) / 55);
      var0[0] = uw.a(var0, (int)72);
      ++g;
      return var0;
   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      ++e;
      int var3 = fh.a(var0, false);
      if((var3 & 1) != 0) {
         ((boolean[])((boolean[])var2[3]))[1] = true;
      }

      if((2 & var3) != 0) {
         ((boolean[])((boolean[])var2[3]))[0] = true;
      }

      ((lm)var2[6]).e = Class_i.a(false, var0);
      ((long[])((long[])var2[2]))[0] = Class_i.a(false, var0);
      var2[4] = ara.b((byte)61, var0);
      if(var1 != 3) {
         f = (Object[])((Object[])c[2]);
      }

      fh.a(var0, false);
      ((byte[])((byte[])var2[5]))[0] = ipa.a(var0, (int)-84);
      ((byte[])((byte[])var2[5]))[1] = ipa.a(var0, (int)-112);
      ((int[])((int[])var2[1]))[0] = de.a((int)0, var0);
      if(0 < ((int[])((int[])var2[1]))[0]) {
         var2[0] = new Object[((int[])((int[])var2[1]))[0]][];
         if(null != var0 && 2 == var0.length) {
            ao.a(true, (Object[])null, (Object[])null);
         }

         for(int var4 = 0; ~var4 > ~((int[])((int[])var2[1]))[0]; ++var4) {
            Object[] var6 = new Object[3];
            kua.a((byte)113, var6);
            if(((boolean[])((boolean[])var2[3]))[1]) {
               Class_i.a(false, var0);
            }

            if(((boolean[])((boolean[])var2[3]))[0]) {
               var6[2] = ara.b((byte)61, var0);
            }

            ((byte[])((byte[])var6[0]))[0] = ipa.a(var0, (int)-74);
            ((int[])((int[])var6[1]))[0] = de.a(var1 ^ 3, var0);
            ((Object[][])((Object[][])var2[0]))[var4] = var6;
         }
      }

   }

}
