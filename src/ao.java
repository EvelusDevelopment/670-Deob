
final class ao {

   static int e;
   static int a;
   static Object[] c = ed.a(-1, new Object[1], (byte)-99, 7);
   static int b;
   static int d;
   static int f;


   static final Object[] a(boolean var0, Object[] var1, Object[] var2) {
      ++f;
      if(var1[2] == null) {
         var1[2] = new long[1];
      }

      if(null == var1[5]) {
         var1[5] = new byte[2];
      }

      if(var1[1] == null) {
         var1[1] = new int[1];
      }

      if(var1[3] == null) {
         var1[3] = new boolean[2];
      }

      if(!var0) {
         a(false, (Object[])null, (Object[])null);
      }

      var1[4] = null;
      ((boolean[])((boolean[])var1[3]))[0] = true;
      ((int[])((int[])var1[1]))[0] = 0;
      jca var4 = new jca(var1);
      var1[6] = var4;
      ic.a(var2, 3, var1);
      return var1;
   }

   static final Object[] a(Object[][] var0, Object[] var1, boolean var2) {
      ++a;
      if(var2) {
         return (Object[])null;
      } else if(null != var1 && -88 == ~var1.length) {
         return dua.a(var1, var0, false);
      } else if(var1 != null && -92 == ~var1.length) {
         return lha.a(var1, 2, var0);
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(int var0, float var1, Object[] var2, float var3, float var4) {
      rg.a(var1, 22362, var2, jga.a(0.0F, 0.0F, 2, 1.0F));
      ++e;
      Object[][] var7 = Class_m.f;
      Object[] var5;
      synchronized(Class_m.f) {
         if(0 == te.c) {
            var5 = wua.a(true, new Object[2]);
         } else {
            mr.a(1, Class_m.f[--te.c]);
            var5 = Class_m.f[te.c];
         }
      }

      rg.a(var4, 22362, var5, jga.a(0.0F, 1.0F, 2, 0.0F));
      ija.a(var2, var5, false);
      rg.a(var3, var0 + 22362, var5, jga.a(1.0F, 0.0F, var0 + 2, (float)var0));
      ija.a(var2, var5, false);
      mia.a(var5, 1);
   }

   static final int a(Object[] var0, byte var1) {
      ++b;
      if(var0[5] != rna.f_i) {
         throw new bba(var0, var0[5].toString().toLowerCase());
      } else {
         if(var1 != -96) {
            a(-99, 0.08143611F, (Object[])((Object[])c[2]), -0.45937204F, 0.88031304F);
         }

         return ((int[])((int[])var0[1]))[1];
      }
   }

   static final void a(int var0, Object[] var1) {
      if(var0 == 8785) {
         if(var1[0] != null) {
            ona.a((Object[])((Object[])var1[0]), 108);
         }

         ++d;
      }
   }

}
