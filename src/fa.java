
final class fa extends za implements Class_w {

   long nativeid;


   final native void a();

   final native void oa();

   protected final void finalize() {
      if(this.nativeid != 0L) {
         lla.a(-68, this);
      }

   }

   public final native void o(boolean var1);

   fa(ia var1, int var2) {
      this.U(var1, var2);
   }

   private final native void U(ia var1, int var2);
}
