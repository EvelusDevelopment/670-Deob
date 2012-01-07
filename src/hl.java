import jagdx.IUnknown;

final class hl implements re {

   static int b;
   static int a;
   static int e;
   static int d;
   static Object[] c = vra.a(536870911, 10, "", new Object[1]);
   static int h;
   static String[][] g = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}};
   static int f_i;
   Object[] f;


   protected final void finalize() throws Throwable {
      ++e;
      Object[] var1 = this.f;
      if(~((long[])((long[])var1[3]))[0] != -1L) {
         el.a((Object[])((Object[])var1[2]), 42, ((long[])((long[])var1[3]))[0]);
         ((long[])((long[])var1[3]))[0] = 0L;
      }

      ((hl)var1[4]).a(false);
   }

   public final int c() {
      ++f_i;
      return hla.a(19848, this.f);
   }

   private final void a(boolean var1) throws Throwable {
      if(var1) {
         c = (Object[])null;
      }

      super.finalize();
      ++b;
   }

   static final int a(Object[] var0, int var1) {
      ++h;
      byte var2 = 23;
      String var5 = (String)var0[5];
      int var4 = var5.length() + 2;
      int var15 = var4 + var2;
      if(var1 <= 57) {
         a((Object[])null, -111);
      }

      String var8 = (String)var0[4];
      int var7 = var8.length() + 2;
      var15 += var7;
      String var11 = (String)var0[3];
      int var10 = 2 + var11.length();
      var15 += var10;
      String var14 = (String)var0[2];
      int var13 = 2 + var14.length();
      var15 += var13;
      return var15;
   }

   public final void a() {
      ++d;
      Object[] var1 = this.f;
      if(~((long[])((long[])var1[3]))[0] != -1L) {
         IUnknown.Release(((long[])((long[])var1[3]))[0]);
         ((long[])((long[])var1[3]))[0] = 0L;
      }

   }

   hl(Object[] var1) {
      this.f = var1;
   }

   public final int b() {
      ++a;
      Object[] var2 = this.f;
      int var1 = ((int[])((int[])var2[1]))[1];
      return var1;
   }

}
