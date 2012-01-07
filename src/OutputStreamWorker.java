import java.nio.Buffer;
import java.nio.ByteBuffer;

final class OutputStreamWorker implements Runnable {

   static int c = 0;
   static int d;
   static int b;
   static int a;
   private Object[] wrapper;
   static short e = 32767;

   public final void run() {
      qi.processOutputStreamWorker(this.wrapper);
      ++b;
   }

   static final byte[] a(int var1, Object[] var2, int var3) {
      ++a;
      ((Buffer)var2[2]).position(var1);
      byte[] var4 = new byte[var3];
      ((ByteBuffer)var2[2]).get(var4, 0, var3);
      return var4;
   }

   OutputStreamWorker(Object[] wrapper) {
      this.wrapper = wrapper;
   }

   static final void newIAS1I1Wrapper(Object[] var1) {
      if(null == var1[1]) {
         var1[1] = new int[1];
      }
      ++d;
   }
}
