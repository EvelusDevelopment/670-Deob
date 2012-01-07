import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;

final class ho {

   static int e;
   static int a;
   static int c;
   static int b;
   static Object[][] d;


   static final NativeHeapBuffer a(int var0, boolean var1, int var2, Object[] var3) {
      ++c;
      if(var2 != 46) {
         d = (Object[][])((Object[][])null);
      }

      return ((NativeHeap)var3[46]).a(var0, var1);
   }

   static final Object[] a(int var0, int var1, Object[] var2, boolean var3) {
      ++a;
      lca.a(var2, (int)-105);
      if(!var3) {
         return (Object[])((Object[])var2[0]);
      } else {
         ((int[])((int[])var2[0]))[1] = var0;
         ((int[])((int[])var2[0]))[0] = var1;
         return var2;
      }
   }

   static final int b(Object[] var0, byte var1) {
      int var2 = -72 / ((var1 - 69) / 43);
      ++e;
      return ((int[])((int[])var0[1]))[1];
   }

   static final int a(Object[] var0, byte var1) {
      ++b;
      if(var1 <= 107) {
         a(((int[])((int[])var0[16]))[10], true, 124, (Object[])null);
      }

      return 0;
   }

}
