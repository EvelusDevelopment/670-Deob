
final class ea extends ja implements Class_w {

   long nativeid;


   protected final void finalize() {
      if(this.nativeid != 0L) {
         lla.a(-118, this);
      }

   }

   private final native void X(ia var1, fa var2, byte[][] var3, int[] var4, int[] var5, int[] var6, int[] var7);

   ea(ia var1, fa var2, Object[] var3, aea[] var4, cga[] var5) {
      super(var1, var3);
      byte[][] var6 = new byte[var4.length][];
      int[] var7 = new int[var4.length];
      int[] var8 = new int[var4.length];
      int[] var9 = new int[var4.length];
      int[] var10 = new int[var4.length];

      for(int var11 = 0; var11 < var4.length; ++var11) {
         var6[var11] = var4[var11].c;
         var7[var11] = var4[var11].a;
         var8[var11] = var4[var11].h;
         var9[var11] = var4[var11].f;
         var10[var11] = var4[var11].b;
      }

      this.X(var1, var2, var6, var7, var8, var9, var10);
   }

   private final native void oa(char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8);

   public final native void o(boolean var1);

   final void a(char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8) {
      this.oa(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   final native void HA(char var1, int var2, int var3, int var4, boolean var5);
}
