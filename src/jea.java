
final class jea {

   static int e;
   static Object[] g = sd.a(new Object[1], 9, (byte)115);
   static int f;
   static int a;
   static int f_i;
   static int d;
   static int b;
   static boolean c = false;
   static int j;
   static Object[] h;


   static final void a(Object[] var0, byte var1) {
      ++e;
      var0[2] = nj.a(3, new Object[2]);
      if(var1 >= -127) {
         h = (Object[])null;
      }

   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, int var3) {
      ++b;
      lra.a(var2, 16830, var0, var1);
      return var3 != 1?(Object[])null:var2;
   }

   static final boolean a(Object[] var0, int var1) {
      ++d;

      for(int var2 = 1; 4 > var2; ++var2) {
         Object[] var3 = ((Object[][])((Object[][])var0[6]))[var2];
         if(var3 != null) {
            ks.a(var2, var0, 0L, (byte)-44);
         }
      }

      if(var0[4] != null) {
         ica.a(var0, (byte)44, 0L);
      }

      ((boolean[])((boolean[])var0[5]))[0] = false;
      if(var0 != null && 2 == var0.length) {
         return false;
      } else {
         if(var1 != 6) {
            c = true;
         }

         return true;
      }
   }

   static final void a(int var0) {
      ++f_i;
      Object[] var2 = (Object[])((Object[])tu.d[22]);
      int var1 = ((int[])((int[])var2[1]))[0];
      oa.a(1 == var1, (byte)10, 22050, 2);
      mra.a = so.a(ru.d, (byte)-123, 22050, 0);
      if(var0 <= 5) {
         a(-16);
      }

      Class_d.a(true, false, jia.a((Object[])null, (byte)39));
      if(var2 != null && 3 == var2.length) {
         wma.a(((int[])((int[])mra.a[2]))[0], ((int[])((int[])((Object[])((Object[])mra.a[1]))[0]))[5], -54, (byte)122);
      }

      lg.h = so.a(ru.d, (byte)-125, 2048, 1);
      ah.d = new jua();
      rna.a(ah.d, -20224, lg.h);
      bd.b = qi.a(new Object[2], 22050, mc.a, 1);
      ac.a((byte)-92);
   }

   static final void a(Object[] var0, byte var1, boolean var2) {
      if(!var2 == ((boolean[])((boolean[])var0[63]))[15]) {
         ((boolean[])((boolean[])var0[63]))[15] = var2;
         rla.b(var0, 6);
         ((int[])((int[])var0[1]))[23] &= -8;
      }

      if(var1 == 93) {
         ++a;
      }
   }

   static final int b(Object[] var0, int var1) {
      if(var1 != 2) {
         c = false;
      }

      ++f;
      return ((int[])((int[])var0[1]))[2];
   }

}
