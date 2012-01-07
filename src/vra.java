
final class vra {

   static Object[] g = ed.a(-1, new Object[1], (byte)-102, 147);
   static int a;
   static Object[] d;
   static int b;
   static int e;
   static int c;
   static int[] f = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};


   static final Object[] a(Object[] var0, int var1) {
      ++b;
      if(var1 != 33554431) {
         a((Object[])null, -120);
      }

      return var0;
   }

   static final Object[] a(int var0, int var1, String var2, Object[] var3) {
      ++c;
      if(var0 != 536870911) {
         d[22] = (Object)null;
      }

      if(null == var3[0]) {
         var3[0] = new int[1];
      }

      ((int[])((int[])var3[0]))[0] = var1;
      return var3;
   }

   static final void a(Object[] var0, int var1, byte var2) {
      --((int[])((int[])var0[1]))[0];
      ++e;
      if(0 == ((int[])((int[])var0[1]))[0]) {
         var0[0] = null;
      } else {
         qo.a((Object[])((Object[])var0[0]), var1 + 1, (Object[])((Object[])var0[0]), var1, ((int[])((int[])var0[1]))[0] + -var1);
      }

      var0[7] = null;
      if(var2 != -106) {
         a(126, ((int[])((int[])g[6]))[0], (String)null, new Object[6]);
      }

   }

   static final void a(int var0, Object[] var1) {
      if(null == var1[1]) {
         var1[1] = new int[1];
      }

      ++a;
      if(var0 != -16808) {
         a((Object[])null, -10, ((byte[])((byte[])g[1]))[7]);
      }

      if(null == var1[6]) {
         var1[6] = new byte[1];
      }

   }

}
