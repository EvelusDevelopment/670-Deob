
final class lb extends tha {

   static int w;
   Object[] x;
   static Object[] t = st.a(new Object[1], 7, 20, 23);
   static int u;
   static Object[] v;
   static int y;


   static final void a(Object[] var0, int var1) {
      if(var1 != 3) {
         v = (Object[])null;
      }

      if(var0[5] == null) {
         var0[5] = new double[1];
      }

      ++w;
      if(null == var0[1]) {
         var0[1] = new int[2];
      }

   }

   static final void a(byte var0, Object[] var1) {
      if(~((long[])((long[])var1[3]))[0] != -1L) {
         el.a((Object[])((Object[])((Object[])((Object[])var1[2]))[0]), 69, ((long[])((long[])var1[3]))[0]);
         ((long[])((long[])var1[3]))[0] = 0L;
      }

      ++y;
      if(var0 > -17) {
         a((byte)-1, (Object[])null);
      }

   }

   static final Object[][] a(int var0, kra var1) {
      ++u;
      int[] var2 = var1.listmodes();
      Object[][] var3 = new Object[var2.length >> 2][];

      for(int var4 = var0; ~var4 > ~var3.length; ++var4) {
         Object[] var5 = os.a(var0 ^ 121, new Object[1]);
         var3[var4] = var5;
         ((int[])((int[])var5[0]))[2] = var2[var4 << 2];
         ((int[])((int[])var5[0]))[0] = var2[1 + (var4 << 2)];
         ((int[])((int[])var5[0]))[3] = var2[2 + (var4 << 2)];
         ((int[])((int[])var5[0]))[1] = var2[(var4 << 2) + 3];
      }

      return var3;
   }

   lb(Object[] var1) {
      this.x = var1;
   }

}
