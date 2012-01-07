package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeap;

public final class NativeHeapBuffer implements Buffer, Source {

   private int b;
   private boolean c = true;
   public NativeHeap a;
   private int d;


   public final void a(Source var1) {
      this.a(var1, 0L, 0L, var1.a());
   }

   public final long b() {
      return this.a.getBufferAddress(this.b);
   }

   public final int a() {
      return this.d;
   }

   private final synchronized void a(Source var1, long var2, long var4, int var6) {
      if(-1L != ~var1.b() && -1L != ~this.b()) {
         this.a.copy(this.b() - -var4, var2 + var1.b(), var6);
      } else {
         throw new NullPointerException();
      }
   }

   protected final synchronized void finalize() throws Throwable {
      super.finalize();
      this.c();
   }

   public final synchronized void a(byte[] var1, int var2, int var3, int var4) {
      try {
         if(!(var3 < 0 | var2 < 0 | !this.d() | null == var1 | var4 + var2 > var1.length | var4 + var3 > this.d)) {
            this.a.put(this.b, var1, var2, var3, var4);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

   public final synchronized void c() {
      if(this.d()) {
         this.a.deallocateBuffer(this.b);
      }

      this.c = false;
   }

   private final synchronized boolean d() {
      return this.a.b() && this.c;
   }

   NativeHeapBuffer(NativeHeap var1, int var2, int var3) {
      this.a = var1;
      this.d = var3;
      this.b = var2;
   }
}
