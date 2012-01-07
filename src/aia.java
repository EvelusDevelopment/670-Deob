
final class aia {

   static Object[] a = ho.a(6, 94, new Object[1], true);
   static int f;
   static int c;
   static int d;
   static int e;
   static int b;


   static final void a(int var0, Object[] var1, Object[] var2) {
      ++b;
      int var3 = 116 % ((var0 - 19) / 61);
      efa.a(var2, var1, (Object[])((Object[])var1[45]), -111);
   }

   static final void a(boolean var0, Object[] var1, int var2) {
      ++c;
      int var3 = 88 % ((var2 + 59) / 58);
   }

   static final void a(Object[] var0, int var1) {
      ++f;
      ((tha)var0[var1]).m = ((tha)var0[1]).m & Long.MIN_VALUE | he.a(var1 + 96) - -500L;
      ama.a((tha)(var0 == null?null:var0[1]), (byte)-77, client.Db);
   }

   static final Object[] a(ta var0, byte var1, Object[] var2) {
      if(var1 <= 52) {
         a = new Object[8];
      }

      ++e;
      ka var3 = qn.a(2048, var0, (Object[])((Object[])var2[18]), (byte)-55, true, false);
      if(var3 == null) {
         return null;
      } else {
         if(null != var2 && (var2.length == 5 || 4 == var2.length)) {
            rja.b((Object[])null, false);
         }

         Object[] var4 = bra.a(var2, true);
         Object[] var5 = woa.a(5, var2);
         Object[] var6 = bva.a(105, ((boolean[])((boolean[])var2[8]))[5]);
         int var7 = (int)((float[])((float[])((Object[])((Object[])var5[1]))[1]))[2] >> 9;
         int var8 = (int)((float[])((float[])((Object[])((Object[])var5[1]))[1]))[1] >> 9;
         tma.a((Object[])((Object[])var2[18]), 12, var7, true, var8, var4, var3, var7, var0, var8);
         var3.a(var4, ((lpa[])((lpa[])var2[9]))[0], 0);
         if(((Object[])((Object[])var2[18]))[10] != null) {
            Object[] var9 = ((ch)((Object[])((Object[])var2[18]))[10]).b();
            var0.c(var9);
         }

         ((boolean[])((boolean[])var2[8]))[4] = var3.XA() || null != ((Object[])((Object[])var2[18]))[10];
         if(null != var2[17]) {
            rr.a(var3, (int)((float[])((float[])((Object[])((Object[])var5[1]))[1]))[2], (int)((float[])((float[])((Object[])((Object[])var5[1]))[1]))[1], 2, (Object[])((Object[])var2[17]), (int)((float[])((float[])((Object[])((Object[])var5[1]))[1]))[0]);
         } else {
            var2[17] = lv.a((int)((float[])((float[])((Object[])((Object[])var5[1]))[1]))[1], (int)((float[])((float[])((Object[])((Object[])var5[1]))[1]))[0], (int)((float[])((float[])((Object[])((Object[])var5[1]))[1]))[2], 0, var3);
         }

         return var6;
      }
   }

}
