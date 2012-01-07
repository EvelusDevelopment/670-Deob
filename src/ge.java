import jagdx.IDirect3DDevice;

final class ge {

   static int c;
   static int e;
   static int b;
   static int d;
   static int a;
   static Object[] f = sd.a(new Object[1], 0, (byte)127);


   static final boolean a(Object[] var0, int var1, byte var2, ta var3, int var4) {
      ++b;
      if(var2 != 48) {
         a(((int[])((int[])var0[0]))[7], -117, (Object[])null, 28, (String)null, -52, 87, (ta)var0[0], -31, (ja)((Object[])((Object[])f[9]))[2]);
      }

      ka var5 = qn.a(131072, var3, (Object[])((Object[])var0[17]), (byte)-55, false, false);
      return null != var5?var5.a(var4, var1, bra.a(var0, true), false, 0):false;
   }

   static final boolean a(Object[] var0, byte var1) {
      if(var1 != 82) {
         f = (Object[])((Object[])f[23]);
      }

      ++d;
      return ((boolean[])((boolean[])var0[8]))[6];
   }

   static final void a(int var0, int var1, Object[] var2, int var3, String var4, int var5, int var6, ta var7, int var8, ja var9) {
      ++e;
      if(null == goa.a || vq.b == null) {
         if(hp.a(-127, lta.h, wr.q) && hp.a(-127, lta.h, gd.c)) {
            goa.a = var7.a(aea.b(lta.h, wr.q, 0), true);
            aea var10 = aea.b(lta.h, gd.c, 0);
            vq.b = var7.a(var10, true);
            var10.c();
            tj.e = var7.a(var10, true);
         } else {
            var7.r(var5, var3, var1, var8, 255 - vk.g << 24 | te.f, 1);
         }
      }

      if(goa.a != null && vq.b != null) {
         int var12 = (var1 - vq.b.e() * 2) / goa.a.e();

         for(int var11 = 0; var12 > var11; ++var11) {
            goa.a.a(vq.b.e() + var5 + var11 * goa.a.e(), var3);
         }

         if(null != var2 && (-6 == ~var2.length && var2[3].equals(Integer.valueOf(1)) || var2.length == 12 || var2.length == 7)) {
            opa.a(-1);
         }

         vq.b.a(var5, var3);
         tj.e.a(-tj.e.e() + var1 + var5, var3);
      }

      var9.a(99, -16777216 | bia.f, var3 + ((int[])((int[])var2[1]))[var6] + (20 - ((int[])((int[])var2[1]))[0]) / 2, var4, 3 + var5, -1);
      var7.r(var5, var3 + var8, var1, var0 - var8, -vk.g + 255 << 24 | te.f, 1);
   }

   static final Object[] a(Object[] var0, int var1, byte var2, Object[] var3, Object[] var4, int var5) {
      ++c;
      if(var0[4] == null) {
         var0[4] = new long[1];
      }

      if(var0[1] == null) {
         var0[1] = new int[2];
      }

      var0[3] = mea.a((int)4, var0);
      ((int[])((int[])var0[1]))[0] = var1;
      var0[0] = var3;
      ((int[])((int[])var0[1]))[1] = var5;
      var0[2] = var4;
      long[] var6 = (long[])((long[])var0[4]);
      long var7 = ((long[])((long[])((Object[])((Object[])var0[0]))[50]))[5];
      if(var2 != 124) {
         a((Object[])null, (byte)-91);
      }

      Object[] var12 = (Object[])((Object[])var0[2]);
      if(null != var3 && var3.length == 3) {
         return null;
      } else {
         byte var11;
         if(vk.e == var12) {
            var11 = 80;
         } else {
            if(var12 != vk.b) {
               throw new IllegalArgumentException("");
            }

            var11 = 77;
         }

         var6[0] = IDirect3DDevice.CreateDepthStencilSurface(var7, var1, var5, var11, 0, 0, false);
         return var0;
      }
   }

}
