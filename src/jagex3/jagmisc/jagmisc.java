package jagex3.jagmisc;


public class jagmisc {

   public static void quit() {
      Quit0();
   }

   private static native void Quit0();

   public static native boolean init();

   public static native long getAvailablePhysicalMemory();

   public static native long nanoTime();

   private static native int ping0(byte var0, byte var1, byte var2, byte var3, long var4);

   public static int ping(byte var0, byte var1, byte var2, byte var3, long var4) throws Throwable {
      int var6 = ping0(var0, var1, var2, var3, var4);
      if(0 <= var6) {
         return var6;
      } else {
         throw new Exception(String.valueOf(var6));
      }
   }

   public static native long getTotalPhysicalMemory();

}
