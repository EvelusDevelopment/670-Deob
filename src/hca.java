
final class hca {

   static Object[][] f;
   static int e;
   static long g = -1L;
   static int c;
   static int d;
   static int b;
   static int a;


   static final void a(int var0, int var1, Object[] var2, int var3, int var4, int var5) {
      ((int[])((int[])var2[1]))[39] = var3;
      ((int[])((int[])var2[1]))[4] = var4;
      ++a;
      if(var0 == -2925) {
         ((int[])((int[])var2[1]))[1] = var1;
         ((int[])((int[])var2[1]))[0] = var5;
         dca.c(var2, var0 ^ -2937);
      }
   }

   static final int a(byte var0, Object[] var1) {
      boolean var2;
      label21: {
         ++e;
         Object[] var3 = (Object[])((Object[])var1[0]);
         String var4 = (String)var1[1];
         int var5 = dla.a(var3, 53, "");
         if(~var5 != 0) {
            var2 = jra.a("", var4, (byte)55, var3);
            if(client.f_vb == 0) {
               break label21;
            }
         }

         var2 = jra.a(var4, "", (byte)55, var3);
      }

      if(!var2) {
         if(var0 != 28) {
            a((Object[])((Object[])var1[0]), (int)45);
         }

         return 0;
      } else {
         return 100;
      }
   }

   static final void a(int var0, Object[] var1, Object[] var2, int var3) {
      if(var3 != 0) {
         ((int[])((int[])var2[15]))[15] = 67;
      }

      ++d;
      if(null != var2 && 87 == var2.length) {
         jna.a(var2, var0, var1, (byte)115);
      } else if(null != var2 && 91 == var2.length) {
         ((Object[][])((Object[][])var2[88]))[var0] = var1;
      } else {
         throw new IllegalStateException();
      }
   }

   static final boolean a(Object[] var0, int var1) {
      ++c;
      return var1 != 28069?((boolean[])((boolean[])var0[27]))[1]:true;
   }

   static final void a(Object[] var0, byte var1) throws Throwable {
      ++b;
      if(var0 != null) {
         jca.a((byte)78, var0);
      } else {
         ((rm)var0[0]).a(false);
         if(var1 > -8) {
            a(((byte[])((byte[])var0[1]))[2], (Object[])null);
         }

      }
   }

}
