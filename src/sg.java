
final class sg {

   static String a;
   static int c;
   static int b;
   static int e;
   static int d;


   static final Object[] a(String var0, int var1, Object[] var2) {
      if(var1 != -19450) {
         a = (String)null;
      }

      ++e;
      ns var4 = new ns(var2);
      var2[1] = var4;
      var2[0] = var0;
      return var2;
   }

   static final void a(int var0) {
      ++c;
      if(ej.a(var0 + 25938) != kl.f) {
         try {
            String var1 = kqa.h.getParameter((String)go.f[0]);
            int var2 = var0 + (int)(he.a(var0 + 11661) / 86400000L);
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            fu.a((byte)-56, "document.cookie=\"" + var3 + "\"", kqa.h);
         } catch (Throwable var4) {
            ;
         }

      }
   }

   static final Object[] a(boolean var0, int var1, Object[] var2, int var3, Object[] var4, Object[] var5) {
      ++d;
      if(var0) {
         ((boolean[])((boolean[])((Object[])((Object[])var4[0]))[3]))[5] = ((boolean[])((boolean[])var4[0]))[9];
      }

      Object[] var7 = new Object[15];
      cr.a(0, var5, var3, var1, var2, 0, var7, 1025, var4);
      return var7;
   }

   static final Object[] a(Object[] var0, Object[] var1, byte var2) {
      ++b;
      if(var2 <= 5) {
         ((int[])((int[])var1[0]))[19] = 23;
      }

      im.a(127, var0);
      var0[2] = var1;
      var0[0] = raa.a(false, var0);
      hm.a((byte)-71, var0);
      return var0;
   }

}
