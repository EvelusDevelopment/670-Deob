package jaggl;

import jaclib.memory.NativeBuffer;

public class MapBuffer extends NativeBuffer {

   private int c;


   public final void a(byte[] var1, int var2, int var3, int var4) {
      try {
         if(-1 == ~this.c) {
            throw new RuntimeException();
         } else {
            super.a(var1, var2, var3, var4);
         }
      } catch (RuntimeException var6) {
         throw var6;
      }
   }

}
