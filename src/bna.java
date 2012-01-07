
final class bna {

   static int f;
   static cga[] g;
   static int e;
   static int d;
   static int h;
   static int b;
   static int c;
   static Object[] a;


   static final void a(int var0, int var1, Object[] var2, int var3, int var4, int var5) {
      ++f;
      if(var2 != null && var2.length == 23 && var2[4].equals(Integer.valueOf(2))) {
         hg.a((byte)-70);
      }

      Object[] var9 = null;
      if(var1 < 8) {
         g = (cga[])((cga[])var2[11]);
      }

      ew var6;
      ew var7;
      for(Object[] var10 = null == (var6 = (ew)dda.a(pf.j, 2))?null:var6.k; var10 != null; var10 = null != (var7 = (ew)client.a(pf.j, -28280))?var7.k:null) {
         if(((int[])((int[])var10[1]))[3] == var0 && ((int[])((int[])var10[1]))[5] == var3 && var5 == ((int[])((int[])var10[1]))[0] && ~var4 == ~((int[])((int[])var10[1]))[9]) {
            var9 = var10;
            break;
         }
      }

      if(var9 == null) {
         var9 = ec.a(new Object[4], (byte)126);
         ((int[])((int[])var9[1]))[9] = var4;
         ((int[])((int[])var9[1]))[5] = var3;
         ((int[])((int[])var9[1]))[0] = var5;
         ((int[])((int[])var9[1]))[3] = var0;
         client.a(-21, pf.j, (lm)(null != var9?var9[2]:null));
      }

      ((boolean[])((boolean[])var9[3]))[1] = false;
      var9[0] = var2;
      ((boolean[])((boolean[])var9[3]))[0] = true;
   }

   static final void a(int var0, Object[] var1) {
      ++b;
      if(var1[1] == null) {
         var1[1] = new int[2];
      }

      if(var0 != 2) {
         a(127, 28, ((int[])((int[])a[2]))[13]);
      }

      if(null == var1[0]) {
         var1[0] = new boolean[1];
      }

   }

   static final void a(int var0) {
      ++h;
      nn.D = mi.f_i;
      jba.f = OutputStreamWorker.e;
      tn.e = ai.b;
      ya.v = gba.o;
      fua.b = true;
      if(~ro.a != var0 && 0 != la.m) {
         gba.o = 334;
         ai.b = mi.f_i = (short)(ro.a * 512 / la.m);
         OutputStreamWorker.e = 334;
      }

   }

   static final void a(Object[] var0, boolean var1) {
      ++d;
      if(!var1) {
         a(-121, 106, -30);
      }

      var0[0] = sj.a(64, new Object[3], (byte)-83);
      var0[4] = sj.a(60, new Object[3], (byte)-75);
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2, byte var3) {
      var2[2] = var0;
      if(var3 < 33) {
         a(((int[])((int[])var2[0]))[9], 97, -19);
      }

      ++c;
      gp var5 = new gp(var2);
      var2[0] = var5;
      var2[1] = new int[var1];
      return var2;
   }

   static final boolean a(int var0, int var1, int var2) {
      if(var1 < 83) {
         return false;
      } else {
         ++e;
         return (2048 & var0) != 0;
      }
   }

}
