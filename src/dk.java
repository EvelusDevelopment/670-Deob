
final class dk {

   static int e;
   static int d;
   static int b;
   static int a;
   static int c;
   static Object[] f = sd.a(new Object[1], 48, (byte)123);


   static final boolean a(Object[] var0, boolean var1) {
      ++e;
      return !var1;
   }

   static final void a(Object[] var0, byte var1) {
      hca.a(0, (Object[])((Object[])var0[0]), (Object[])((Object[])var0[10]), 0);
      ++a;
      ws.a(117, (Object[])((Object[])var0[11]), (Object[])((Object[])var0[10]));
      if(var1 != 124) {
         f = (Object[])null;
      }

      woa.a(1, vqa.j, (byte)127, (Object[])((Object[])var0[10]), 0);
   }

   static final Object[] a(Object[] var0, int var1, int var2, int var3, int var4, Object[] var5, byte var6, int var7, int var8, byte var9) {
      if(var9 != 17) {
         ((boolean[])((boolean[])var0[0]))[25] = true;
      }

      ++b;
      tl.a(var5, true);
      ((int[])((int[])var5[1]))[0] = var1;
      ((int[])((int[])var5[1]))[5] = var7;
      ((int[])((int[])var5[1]))[3] = var8;
      ((int[])((int[])var5[1]))[4] = var3;
      ((byte[])((byte[])var5[4]))[0] = var6;
      var5[5] = var0;
      ((int[])((int[])var5[1]))[2] = var4;
      ((int[])((int[])var5[1]))[1] = var2;
      return var5;
   }

   static final void a(byte var0, Object[] var1) {
      ++c;
      if(var1[1] == null) {
         var1[1] = new int[1];
      }

      int var2 = -110 / ((5 - var0) / 35);
   }

   static final Object[] a(int[] var0, Object[] var1, int var2, byte var3, boolean var4) {
      ++d;
      if(null != var1 && (-2 == ~var1.length || -21 == ~var1.length || -13 == ~var1.length)) {
         fh.a(-113, 25401, (int[])null);
      }

      if(wl.a((byte)91, bda.d, var2)) {
         int var5 = jla.a(bda.d, (byte)-121, var2);
         Object[][] var6;
         if(0 == var5) {
            var6 = new Object[0][];
         } else if(null != var1) {
            var6 = (Object[][])((Object[][])var1[2]);
         } else {
            var6 = new Object[var5][];
         }

         if(null == var1) {
            var1 = qra.a(new Object[3], var6, var4, (byte)122);
         } else {
            ((boolean[])((boolean[])var1[0]))[0] = var4;
            var1[2] = var6;
         }

         if(var3 < 57) {
            ((boolean[])((boolean[])var1[8]))[1] = ((boolean[])((boolean[])f[4]))[1];
         }

         for(int var7 = 0; var5 > var7; ++var7) {
            if(((Object[][])((Object[][])var1[2]))[var7] == null) {
               byte[] var8 = mn.a(var0, var7, var2, (byte)-119, bda.d);
               if(null != var8) {
                  Object[] var9 = ((Object[][])((Object[][])var1[2]))[var7] = wi.a(new Object[65], (int)5);
                  ((int[])((int[])var9[1]))[3] = (var2 << 16) + var7;
                  if(-1 != var8[0]) {
                     throw new IllegalStateException();
                  }

                  vr.a(var9, (byte)-122, jta.a((byte)-85, var8, new Object[3]));
               }
            }
         }

         return var1;
      } else {
         return null;
      }
   }

}
