
final class eq extends lm {

   static Object[] f_l;
   static int o;
   static int k;
   static int m;
   static int n;
   Object[] j;


   static final int a(Object[] var0, int var1) {
      if(var1 != 3) {
         f_l = (Object[])null;
      }

      ++m;
      return ((int[])((int[])var0[1]))[0];
   }

   static final Object[] a(Object[] var0, byte var1, int var2, int var3) {
      ++n;
      int var5 = -125 / ((20 - var1) / 46);
      byte[] var4 = qn.a(var2, var3, var0, -68);
      return var4 == null?null:eha.a(1, var4, new Object[3]);
   }

   static final void b(Object[] var0, int var1) {
      ++o;
      synchronized(var0[3]) {
         lga.b(0, (Object[])((Object[])var0[3]));
         if(var1 != -3557) {
            b((Object[])null, -64);
         }
      }

      synchronized(var0[4]) {
         lga.b(0, (Object[])((Object[])var0[4]));
      }

      synchronized(var0[5]) {
         Object[] var3 = (Object[])((Object[])var0[5]);

         lb var4;
         lb var5;
         for(Object[] var8 = null == (var4 = (lb)gm.a((Object[])((Object[])var3[0]), var1 + 3557))?null:var4.x; null != var8; var8 = null == (var5 = (lb)dka.a((Object[])((Object[])var3[0]), (byte)81))?null:var5.x) {
            if(mia.a(30255, var8)) {
               ((lm)(null == var8?null:var8[2])).a((byte)81);
               ((tha)(null == var8?null:var8[2])).a(8192);
               ((int[])((int[])var3[1]))[1] += ((int[])((int[])var8[1]))[0];
            }
         }

      }
   }

   static final bua a(byte[] var0, Object[] var1, int var2, int var3, Object[] var4) {
      if(var3 >= -5) {
         return (bua)null;
      } else {
         ++k;
         return new bua(var1, var4, var0, var2);
      }
   }

   eq(Object[] var1) {
      this.j = var1;
   }

}
