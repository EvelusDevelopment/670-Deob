package jaclib.memory;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public class NativeBuffer implements Buffer, Source {

   private long a;
   private int b = -1;


   public void a(byte[] var1, int var2, int var3, int var4) {
      try {
         if(var3 < 0 | var2 + var4 > var1.length | 0 > var2 | this.a == 0L | null == var1 | var4 + var3 > this.b) {
            throw new RuntimeException();
         } else {
            this.put(this.a, var1, var2, var3, var4);
         }
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

   public final int a() {
      return this.b;
   }

   public final long b() {
      return this.a;
   }

   private final native void put(long var1, byte[] var3, int var4, int var5, int var6);

   private final native void get(long var1, byte[] var3, int var4, int var5, int var6);

}
