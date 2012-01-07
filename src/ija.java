
final class ija {

   static int c;
   static int a;
   static Object[] e;
   static int b;
   static cq d;


   static final void a(Object[] var0, Object[] var1, boolean var2) {
      if(!var2) {
         gfa.a(-(((float[])((float[])var1[0]))[0] * ((float[])((float[])var0[0]))[3]) + ((float[])((float[])var1[0]))[3] * ((float[])((float[])var0[0]))[0] + ((float[])((float[])var0[0]))[1] * ((float[])((float[])var1[0]))[2] + ((float[])((float[])var0[0]))[2] * ((float[])((float[])var1[0]))[1], -76, -(((float[])((float[])var1[0]))[3] * ((float[])((float[])var0[0]))[3]) + (((float[])((float[])var1[0]))[1] * ((float[])((float[])var0[0]))[1] - ((float[])((float[])var1[0]))[2] * ((float[])((float[])var0[0]))[2]) - ((float[])((float[])var0[0]))[0] * ((float[])((float[])var1[0]))[0], var0, ((float[])((float[])var0[0]))[2] * ((float[])((float[])var1[0]))[0] + ((float[])((float[])var0[0]))[1] * ((float[])((float[])var1[0]))[3] + -(((float[])((float[])var1[0]))[2] * ((float[])((float[])var0[0]))[0]) + ((float[])((float[])var1[0]))[1] * ((float[])((float[])var0[0]))[3], ((float[])((float[])var1[0]))[0] * ((float[])((float[])var0[0]))[1] + (((float[])((float[])var1[0]))[1] * ((float[])((float[])var0[0]))[0] + ((float[])((float[])var1[0]))[2] * ((float[])((float[])var0[0]))[3] - ((float[])((float[])var0[0]))[2] * ((float[])((float[])var1[0]))[3]));
         ++a;
      }
   }

   static final boolean a(boolean var0, char var1) {
      ++c;
      if(Character.isISOControl(var1)) {
         return false;
      } else if(!aga.a(var1, 50)) {
         char[] var2 = nta.f;

         int var3;
         char var4;
         for(var3 = 0; ~var3 > ~var2.length; ++var3) {
            var4 = var2[var3];
            if(var1 == var4) {
               return true;
            }
         }

         var2 = bi.c;

         for(var3 = 0; var2.length > var3; ++var3) {
            var4 = var2[var3];
            if(var1 == var4) {
               return true;
            }
         }

         if(var0) {
            a((Object[])null, (Object[])null, ((boolean[])((boolean[])e[5]))[0]);
         }

         return false;
      } else {
         return true;
      }
   }

}
