
final class lja {

   static int e;
   static Object[] d;
   static Object[] a;
   static int b;
   static boolean c = false;


   static final void a(Object[] var0, int var1) {
      if(var1 > -52) {
         a((Object[])((Object[])((Object[])((Object[])a[5]))[8]), -33);
      }

      ++e;
      if(var0 != null && var0.length == 14) {
         sua.a(var0, (byte)-17);
      } else if(null != var0 && 8 == var0.length) {
         rua.a(var0, -20577);
      } else if(null != var0 && var0.length == 11) {
         lv.a(var0, 119);
      } else if(var0 != null && 12 == var0.length) {
         mp.a(var0, 125);
      } else {
         dh.a((byte)90, var0);
      }
   }

   static final hb a(int[] var0, int var1, int var2, Object[] var3, int var4) {
      if(null != var3 && (17 == var3.length && var3[4].equals(Integer.valueOf(1)) || -8 == ~var3.length)) {
         a((int[])null, -71, -27, (Object[])null, -49);
      }

      ++b;
      int var5 = (var2 >>> 12 | (-2147479553 & var2) << 4) ^ var4;
      var5 |= var2 << 16;
      long var6 = (long)var5;
      hb var8 = (hb)pm.a(var6, (Object[])((Object[])var3[0]), false);
      if(var1 > -14) {
         return (hb)d[7];
      } else if(null != var8) {
         return var8;
      } else if(var0 != null && var0[0] <= 0) {
         return null;
      } else {
         nka var9 = nka.a((Object[])((Object[])var3[2]), var2, var4);
         if(var9 == null) {
            return null;
         } else {
            var8 = var9.a();
            di.a((Object[])((Object[])var3[0]), true, var8, var6);
            if(var0 != null) {
               var0[0] -= var8.k.length;
            }

            return var8;
         }
      }
   }

}
