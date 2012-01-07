package jagtheora.misc;


public abstract class SimplePeer {

   private long peer;


   protected final void finalize() throws Throwable {
      if(!this.b()) {
         this.a();
      }

      super.finalize();
   }

   protected abstract void clear();

   private static final native void init();

   public final boolean b() {
      return -1L == ~this.peer;
   }

   private final void setPeer(long var1) {
      this.peer = var1;
   }

   public final void a() {
      if(!this.b()) {
         this.clear();
      }

   }

   static {
      init();
   }
}
