import jaclib.memory.Buffer;
import jaclib.memory.heap.NativeHeap;

class rqa {

   Buffer a;
   private Object[] b;


   final void a(byte[] var1, int var2) {
      if(this.a == null || this.a.a() < var2) {
         this.a = ((NativeHeap)this.b[19]).a(var2, false);
      }

      this.a.a(var1, 0, 0, var2);
   }

   rqa(Object[] var1, byte[] var2, int var3) {
      this.b = var1;
      this.a = ((NativeHeap)this.b[19]).a(var3, false);
      if(var2 != null) {
         this.a.a(var2, 0, 0, var3);
      }

   }

   rqa(Object[] var1, Buffer var2) {
      this.b = var1;
      this.a = var2;
   }
}
