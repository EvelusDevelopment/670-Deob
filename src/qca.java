
final class qca {

   static int e;
   static int c;
   static int a;
   static Object[] b;
   static int d;
   static String f = "";


   static final Object[] a(String var0, int var1, Object[] var2) {
      ++e;
      long var5 = lta.a(var0, 957755909);
      rd var3;
      Object[] var7 = (var3 = (rd)pm.a(var5, (Object[])((Object[])var2[0]), false)) == null?null:var3.n;

      rd var4;
      for(int var8 = 3 % ((24 - var1) / 59); var7 != null; var7 = (var4 = (rd)mla.b((Object[])((Object[])var2[0]), (byte)123)) == null?null:var4.n) {
         if(((String)var7[0]).equals(var0)) {
            return var7;
         }
      }

      return null;
   }

   static final boolean a(int var0, Object[] var1) {
      ++d;
      return var0 > -87?true:((boolean[])((boolean[])var1[8]))[5];
   }

   static final Object[] a(int var0) {
      ++a;
      if(var0 != saa.c) {
         return aaa.f_i[--saa.c];
      } else {
         Object[] var2 = new Object[4];
         wh.a(var2, -116);
         mn var4 = new mn(var2);
         var2[2] = var4;
         return var2;
      }
   }

   static final void b(int var0) {
      eia.c = rba.a(8, new Object[4], var0 - 10679);
      ++c;
      dra.f_i = 0;

      for(ch var1 = (ch)om.a(tsa.h, false); var1 != null; var1 = (ch)pw.a(tsa.h, 61)) {
         var1.f();
      }

      if(var0 != 10752) {
         a(((int[])((int[])b[4]))[4]);
      }

   }

}
