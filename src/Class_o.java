
final class Class_o implements lua, Class_w {

   private int b;
   private int a;
   long nativeid = 0L;


   public final void o(boolean var1) {
      this.UA(this.nativeid, var1);
   }

   public final int c() {
      return this.b;
   }

   private final native void ga(int var1, int var2);

   protected final void finalize() {
      if(this.nativeid != 0L) {
         lla.a(-112, this);
      }

   }

   private final native void UA(long var1, boolean var3);

   public final void a() {
      this.o(false);
   }

   Class_o(int var1, int var2) {
      this.b = var1;
      this.a = var2;
      this.ga(var1, var2);
   }

   public final int b() {
      return this.a;
   }
}
