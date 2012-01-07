
final class aja {

   static int c;
   static int b;
   static int a;


   static final void a(int var0, int var1, byte var2) {
      ++a;
      Object[] var3 = la.a(0, (long)var1, 7);
      jqa.a((byte)71, var3);
      ((int[])((int[])var3[0]))[1] = var0;
      if(var2 == -13) {
         ;
      }
   }

   static final void a(boolean var0, Object[] var1, int var2, Object[] var3) {
      if(var0) {
         a(((int[])((int[])var1[8]))[3], 55, ((byte[])((byte[])var1[2]))[0]);
      }

      if(1 == var2) {
         ((int[])((int[])var3[1]))[2] = fh.a(var1, false);
      } else if(0 == var2) {
         ((int[])((int[])var3[1]))[1] = fh.a(var1, false);
      }

      ++b;
   }

   static final Object[] a(boolean var0, int var1) {
      ++c;
      Object[][] var2 = tca.a(19864);
      if(var0) {
         a(false, (Object[])null, 117, (Object[])null);
      }

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Object[] var4 = var2[var3];
         if(~var1 == ~((int[])((int[])var4[0]))[0]) {
            return var4;
         }
      }

      return null;
   }

}
