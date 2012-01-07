
final class Class_u extends ya implements Class_w {

   long nativeid;


   protected final void finalize() {
      if(this.nativeid != 0L) {
         lla.a(-75, this);
      }

   }

   public final native void o(boolean var1);

   Class_u(ia var1) {}
}
