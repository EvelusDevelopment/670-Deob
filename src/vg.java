
final class vg {

   static int a;
   static int b;
   static Object[] e = nb.a((byte)65, 64, new Object[5]);
   static Object[] d = sd.a(new Object[1], 61, (byte)113);
   static Object[] c = vra.a(new Object[0], 33554431);


   static final void a(byte var0, Object[] var1) {
      ++b;
      if(var0 == -10) {
         throw new IllegalStateException();
      }
   }

   static final Object[] a(byte var0, Object[] var1, Object[][] var2) {
      Class_e.a(292, var1);
      ++a;
      if(null != var1 && 1 == var1.length) {
         Class_e.a(292, (Object[])null);
      }

      int var3 = 0;
      if(var0 != 15) {
         a(((byte[])((byte[])var1[2]))[8], (Object[])null, (Object[][])((Object[][])null));
      }

      while(var3 < var2.length) {
         Object[] var4 = var2[var3];
         long[] var10000 = (long[])((long[])var1[0]);
         long var10002 = ((long[])((long[])var1[0]))[0];
         int var10003 = ((int[])((int[])var4[1]))[0];
         int[] var10005 = (int[])((int[])var1[1]);
         int var10008 = ((int[])((int[])var1[1]))[0];
         var10005[0] = ((int[])((int[])var1[1]))[0] + 1;
         var10000[0] = var10002 | (long)(var10003 << eba.b * var10008);
         ++var3;
      }

      return var1;
   }

}
