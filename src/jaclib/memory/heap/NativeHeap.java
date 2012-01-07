package jaclib.memory.heap;

import jaclib.memory.heap.NativeHeapBuffer;

public final class NativeHeap {

   private boolean a;
   long peer;
   private int b;


   final synchronized native void get(int var1, byte[] var2, int var3, int var4, int var5);

   final synchronized native long getBufferAddress(int var1);

   private final native void allocateHeap(int var1);

   final synchronized native int allocateBuffer(int var1, boolean var2);

   public final NativeHeapBuffer a(int var1, boolean var2) {
      if(this.a) {
         return new NativeHeapBuffer(this, this.allocateBuffer(var1, var2), var1);
      } else {
         throw new IllegalStateException();
      }
   }

   private final native void deallocateHeap();

   final synchronized boolean b() {
      return this.a;
   }

   protected final synchronized void finalize() throws Throwable {
      super.finalize();
      this.a();
   }

   final synchronized native void put(int var1, byte[] var2, int var3, int var4, int var5);

   final synchronized native void deallocateBuffer(int var1);

   public final synchronized void a() {
      if(this.a) {
         this.deallocateHeap();
      }

      this.a = false;
   }

   public NativeHeap(int var1) {
      this.b = var1;
      this.allocateHeap(this.b);
      this.a = true;
   }

   public final synchronized native void copy(long var1, long var3, int var5);
}
