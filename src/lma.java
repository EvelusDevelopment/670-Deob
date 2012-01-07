
final class lma {

   static int[][] a = new int[6][];
   static int d;
   static int c;
   static int b;


   static final Object[] a(Object[] var0, byte var1) {
      ++b;
      if(var1 >= -114) {
         a((Object[])null, ((byte[])((byte[])var0[25]))[8], ((int[])((int[])var0[0]))[16], -70, -50, ((int[])((int[])var0[0]))[15], (int[])null, 31, 55);
      }

      return cc.a(((int[])((int[])var0[1]))[4], true);
   }

   static final void a(Object[] var0, byte var1, int var2, int var3, int var4, int var5, int[] var6, int var7, int var8) {
      if(var1 == -83) {
         ++c;
         if(null != var0 && var0.length == 8) {
            kw.a(var4, var0, var8, var6, var7, var2, var5, (byte)-127, var3);
         } else if(var0 != null && -12 == ~var0.length) {
            vs.a(var7, var8, var0, var6, 5, var2, var4, var5, var3);
         } else if(null != var0 && -16 == ~var0.length) {
            gla.a(0, var7, var4, var3, var5, var6, var0, var2, var8);
         } else if(null != var0 && (15 == var0.length || var0.length == 10)) {
            jda.a(var2, var6, true, var4, var0, var3, var7, var8, var5);
         } else {
            throw new IllegalStateException();
         }
      }
   }

}
