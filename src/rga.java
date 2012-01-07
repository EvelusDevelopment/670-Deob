
final class rga {

   static int e;
   static int d = -1;
   static int a;
   static Object[] f = ura.a(-16, new Object[2]);
   static int c;
   static int b;


   static final void a(byte var0, Object[] var1) {
      ++a;
      if(null != var1 && (var1.length == 1 || var1.length == 1 && var1[0].equals(Boolean.valueOf(false)) || var1.length == 1)) {
         nga.g = null;
      }

      tda var2;
      tda var3;
      for(Object[] var5 = (var2 = (tda)dda.a(nga.g, 2)) == null?null:var2.f_l; null != var5; var5 = null == (var3 = (tda)client.a(nga.g, -28280))?null:var3.f_l) {
         if(var1 == var5[3]) {
            if(null != var5[6]) {
               ah.d.b((kp)var5[6]);
               var5[6] = null;
            }

            ((lm)(null != var5?var5[11]:null)).a((byte)114);
            return;
         }
      }

      int var6 = -41 % ((62 - var0) / 59);
   }

   static final int a(Object[] var0, byte var1) {
      ++b;
      if(var1 < 37) {
         d = ((int[])((int[])var0[17]))[7];
      }

      return ((int[])((int[])var0[3]))[0];
   }

}
