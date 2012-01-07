
final class Class_r extends ja implements Class_w {

   long nativeid;


   Class_r(ia var1, fa var2, Object[] var3, aea[] var4, cga[] var5) {
      super(var1, var3);
      byte[][] var6 = new byte[var4.length][];
      int[] var7 = new int[var4.length];
      int[] var8 = new int[var4.length];
      int[] var9 = new int[var4.length];
      int[] var10 = new int[var4.length];

      for(int var11 = 0; var11 < var4.length; ++var11) {
         aea var12 = var4[var11];
         if(var12.e != null) {
            var6[var11] = var12.e;
         } else {
            byte[] var13 = var12.c;
            byte[] var14 = var6[var11] = new byte[var13.length];

            for(int var15 = 0; var15 < var13.length; ++var15) {
               var14[var15] = (byte)(var13[var15] == 0?0:-1);
            }
         }

         var7[var11] = var12.a;
         var8[var11] = var12.h;
         var9[var11] = var12.f;
         var10[var11] = var12.b;
      }

      this.D(var1, var2, var6, var7, var8, var9, var10);
   }

   public final native void o(boolean var1);

   final native void HA(char var1, int var2, int var3, int var4, boolean var5);

   final void a(char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8) {
      this.V(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private final native void V(char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8);

   protected final void finalize() {
      if(this.nativeid != 0L) {
         lla.a(-81, this);
      }

   }

   private final native void D(ia var1, fa var2, byte[][] var3, int[] var4, int[] var5, int[] var6, int[] var7);
}
