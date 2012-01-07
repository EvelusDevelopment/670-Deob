
final class qba {

   static Object[] f = ho.a(16, 26, new Object[1], true);
   static int d;
   static int e;
   static int a;
   static int g;
   static int c;
   static int f_i;
   static Object[] h = mja.a(new Object[0], false);
   static Object[] b = nla.a(100, new Object[0], -1);


   static final void a(int var0) {
      ++g;
      Object[] var1 = new Object[7];
      String var2 = gj.a(dp.y, var0 ^ -126, gj.L);
      taa.b = dm.a(true, -1, -94, var2, jf.c, true, 0, (long)var0, 1007, 0, 0L, "", var1, false);
   }

   static final void a(int var0, int var1, int var2, int var3, int var4) {
      if(var2 != 1) {
         a(-122, (byte)95, (Object[])null);
      }

      if(var0 >= sea.k && sda.c >= var0) {
         var3 = eua.a(td.r, (byte)-53, var3, hla.g);
         var4 = eua.a(td.r, (byte)-53, var4, hla.g);
         eb.b(100, var3, var4, var0, var1);
      }

      ++d;
   }

   static final int a(int var0, byte var1, Object[] var2) {
      if(var1 != -99) {
         a(((int[])((int[])f[11]))[1], 86, ((int[])((int[])f[10]))[4], 115, ((int[])((int[])var2[0]))[9]);
      }

      ++e;
      Object[] var3 = vd.a(true, var0, et.c);
      int var4 = ((int[])((int[])var3[0]))[1];
      int var5 = -32 != ~((int[])((int[])var3[0]))[2]?(1 << ((int[])((int[])var3[0]))[2] + 1) - 1:-1;
      return (var5 & pn.a(var4, var2, -41)) >>> ((int[])((int[])var3[0]))[0];
   }

   static final void a(Object[] var0, byte var1, Object[] var2) {
      ++a;
      if(var2 != null && -40 == ~var2.length) {
         sea.a(var0, (Object[])((Object[])var2[30]), (byte)57);
         vta.a((Object[])((Object[])((Object[])((Object[])var2[8]))[51]), (Object[])((Object[])var2[30]), 123);
      } else {
         int var3 = 23 / ((63 - var1) / 35);
         if(null != var2 && 17 == var2.length) {
            ww.a((byte)-118, var0, var2);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final cga a(Object[] var0, ta var1, boolean var2, boolean var3, int var4) {
      ++f_i;
      long var5 = (long)(var1.G << 19 | var4 << 16 | ((int[])((int[])var0[1]))[0] | (var3?262144:0));
      cga var7 = (cga)dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var0[0]))[0]), var5);
      if(var7 != null) {
         return var7;
      } else if(!hp.a(-124, (Object[])((Object[])((Object[])((Object[])var0[0]))[1]), ((int[])((int[])var0[1]))[0])) {
         return null;
      } else {
         aea var8 = aea.b((Object[])((Object[])((Object[])((Object[])var0[0]))[1]), ((int[])((int[])var0[1]))[0], 0);
         if(null != var8) {
            var8.b = 0;
            var8.g = 0;
            var8.d = 0;
            var8.f = 0;
            if(var3) {
               var8.b();
            }

            for(int var12 = 0; var4 > var12; ++var12) {
               var8.d();
            }
         }

         var7 = var1.a(var8, var2);
         if(var7 != null) {
            il.a(var5, var7, true, (Object[])((Object[])((Object[])((Object[])var0[0]))[0]));
         }

         return var7;
      }
   }

}
