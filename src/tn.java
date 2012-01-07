
final class tn {

   static short e;
   static int c;
   static int b;
   static boolean g = false;
   static int d;
   private Object[] f;
   static int a;
   static int h;
   static int f_i;


   tn(Object[] var1) {
      this.f = var1;
   }

   static final int b(Object[] var0, byte var1) {
      if(var1 > -19) {
         g = false;
      }

      ++b;
      return ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[3];
   }

   static final String a(Object[] var0, boolean var1, byte var2) {
      ++a;
      String var3 = "";
      if(var0[41] != null) {
         var3 = (String)var0[41];
      }

      if(!var1) {
         var3 = var3 + var0[37];
      } else {
         var3 = var3 + var0[39];
      }

      if(null != var0[40]) {
         var3 = var3 + var0[40];
      }

      return var2 != 55?(String)null:var3;
   }

   static final void a(Object[] var0, int var1, int var2, int var3) {
      if(var3 != 1) {
         a((Object[])((Object[])var0[1]), true, (byte)-98);
      }

      ++c;
      Object[] var4 = dja.a(var2, var0, 8860, var1);
      if(null != var4) {
         nba.a = new int[((int[])((int[])var4[1]))[4]];
         sp.c = new String[((int[])((int[])var4[1]))[1]];
         if(ng.c != var4[4] && var4[4] != qja.m && hk.b != var4[4]) {
            if(bb.b == var4[4]) {
               nba.a[0] = vta.x;
            }
         } else {
            int var5 = 0;
            int var6 = 0;
            if(null != ona.d) {
               var6 = ((int[])((int[])ona.d[1]))[27];
               var5 = ((int[])((int[])ona.d[1]))[20];
            }

            nba.a[0] = Class_b.j.d(104) + -var5;
            nba.a[1] = -var6 + Class_b.j.e(18677);
         }

         wla.a(var4, 200000, 16);
      }
   }

   protected final void finalize() throws Throwable {
      dm.a((byte)-51, this.f);
      ++h;
   }

   static final boolean a(Object[] var0, byte var1) {
      if(var1 > -119) {
         g = true;
      }

      ++f_i;
      return (((int[])((int[])var0[1]))[0] & 1) != 0;
   }

   static final void a(Object[] var0, int var1, int var2) {
      ++d;
      if(((int[])((int[])var0[1]))[19] != var1) {
         ((int[])((int[])var0[1]))[19] = var1;
         wm.a(var0, -21452);
      }

      if(var2 != -28232) {
         a(new Object[8], 65, -59);
      }

   }

}
