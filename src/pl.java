
final class pl {

   static int a;
   static int b;
   static int e;
   static Object[] d = st.a(new Object[1], 7, 33, 1);
   static int c;


   static final int a(boolean var0, int var1, int var2, int var3) {
      ++a;
      Object[] var4 = fk.a(Integer.MIN_VALUE, var3, var0);
      return var1 < 2?48:(var4 != null?(0 <= var2 && var2 < ((int[])((int[])var4[0])).length?((int[])((int[])var4[0]))[var2]:0):0);
   }

   static final Object[] a(Object[] var0, int var1, Object[] var2) {
      var0[10] = var2;
      ++c;
      ln.a(-28834, var0);
      if(var1 != -1192) {
         ((int[])((int[])d[0]))[5] = -105;
      }

      return var0;
   }

   static final void a(Object[] var0, float var1, float var2, float var3, int var4, float[] var5) {
      ++b;
      var5[1] = ((float[])((float[])var0[0]))[1] + ((float[])((float[])var0[0]))[11] * var3 + ((float[])((float[])var0[0]))[5] * var1 + ((float[])((float[])var0[0]))[3] * var2;
      var5[0] = ((float[])((float[])var0[0]))[8] + var3 * ((float[])((float[])var0[0]))[6] + ((float[])((float[])var0[0]))[0] * var2 + var1 * ((float[])((float[])var0[0]))[10];
      var5[2] = ((float[])((float[])var0[0]))[var4] + var3 * ((float[])((float[])var0[0]))[4] + var1 * ((float[])((float[])var0[0]))[9] + var2 * ((float[])((float[])var0[0]))[2];
   }

   static final Object[] a(byte var0, Object[] var1) {
      ++e;
      var1[1] = ura.a(-126, new Object[2]);
      var1[2] = dma.a(var1, false);
      var1[0] = new Thread((Runnable)(var1 != null?var1[2]:null));
      ((Thread)var1[0]).setDaemon(true);
      if(var0 != -23) {
         return (Object[])null;
      } else {
         ((Thread)var1[0]).start();
         return var1;
      }
   }

}
