
final class ua extends Class_s implements Class_w {

   long nativeid;


   protected final void finalize() {
      if(this.nativeid != 0L) {
         lla.a(-78, this);
      }

   }

   ua(ia var1, fa var2, int var3, int var4, int[] var5, int[] var6) {
      this.R(var1, var2, var3, var4, var5, var6);
   }

   public final native void o(boolean var1);

   private final native void R(ia var1, fa var2, int var3, int var4, int[] var5, int[] var6);
}
