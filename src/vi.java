
final class vi {

   static Object[] e = sj.a(32, new Object[3], (byte)-126);
   static int d;
   static int a;
   static int b;
   static int c;


   static final int[][] a(int var0, Object[] var1, boolean var2) {
      if(var2) {
         return (int[][])((int[][])null);
      } else {
         ++b;
         int[][] var3 = loa.a((byte)-52, var0, (Object[])((Object[])var1[4]));
         if(((boolean[])((boolean[])((Object[])((Object[])var1[4]))[0]))[0] && hka.a(var1, (int)79)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = ((int[])((int[])var1[1]))[2] * (cka.d == ((int[])((int[])var1[1]))[3]?var0:((int[])((int[])var1[1]))[3] * var0 / cka.d);
            int var8;
            int var9;
            if(((int[])((int[])var1[1]))[2] != fo.b) {
               if(var1 != null && -8 == ~var1.length) {
                  of.a = (Object[])((Object[])of.a[1]);
               }

               for(var8 = 0; fo.b > var8; ++var8) {
                  var9 = ((int[])((int[])var1[1]))[2] * var8 / fo.b;
                  int var10 = ((int[])((int[])var1[7]))[var7 + var9];
                  var6[var8] = 4080 & var10 << 4;
                  var5[var8] = var10 >> 4 & 4080;
                  var4[var8] = 4080 & var10 >> 12;
               }
            } else {
               for(var8 = 0; fo.b > var8; ++var8) {
                  var9 = ((int[])((int[])var1[7]))[var7++];
                  var6[var8] = var9 << 4 & 4080;
                  var5[var8] = ('\uff00' & var9) >> 4;
                  var4[var8] = (var9 & 16711680) >> 12;
               }
            }
         }

         return var3;
      }
   }

   static final void a(ka var0, int var1, Object[] var2, ta var3, Object[] var4) {
      if(var1 < -115) {
         var0.a(var4);
         ++d;
         Object[][] var5 = var0.a();
         Object[][] var6 = var0.b();
         if((null == var2[19] || ((ch)var2[19]).r) && (null != var5 || var6 != null)) {
            var2[19] = ch.b(kda.d, true);
         }

         if(var2[19] != null) {
            ((ch)var2[19]).a(var3, (long)kda.d, var5, var6, false);
            ((ch)var2[19]).a(((byte[])((byte[])var2[10]))[0], ((short[])((short[])var2[13]))[1], ((short[])((short[])var2[13]))[0], ((short[])((short[])var2[13]))[3], ((short[])((short[])var2[13]))[2]);
         }

      }
   }

   static final hsa a(byte var0, Object[] var1) {
      ++a;
      if(var1 != null && var1.length == 87) {
         return jd.a(-31873, var1);
      } else if(var1 != null && 91 == var1.length) {
         Object[] var3;
         hsa var4 = (hsa)((var3 = noa.a(new Object[6], 18874, var1)) == null?null:var3[1]);
         return var4;
      } else {
         int var2 = 113 % ((var0 - 35) / 59);
         throw new IllegalStateException();
      }
   }

   static final Object[] a(Object[] var0, boolean var1, int var2) {
      if(!var1) {
         e = (Object[])null;
      }

      ++c;
      return ~var2 > ~((Object[])((Object[])var0[1])).length?((Object[][])((Object[][])var0[1]))[var2]:null;
   }

}
