import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;

abstract class hsa extends ue {

   static int k;
   static int f;
   static int g;
   static int f_i = 0;
   static int h = 1;
   static int j;


   static final void a(Object[] var0, int var1) {
      ++j;
      if(var1 != -2375) {
         f_i = -91;
      }

      if(((Object[][])((Object[][])var0[64]))[((int[])((int[])var0[1]))[7]] != eb.m) {
         ((Object[][])((Object[][])var0[64]))[((int[])((int[])var0[1]))[7]] = eb.m;
         Class_ds.a(((Object[][])((Object[][])var0[59]))[((int[])((int[])var0[1]))[7]], (byte)121);
         ufa.a((byte)75, var0);
      }

   }

   static final int a(int var0, Object[] var1, boolean var2) {
      ++f;
      if(!var2) {
         a(-23, (Object[])((Object[])var1[1]), true);
      }

      return ((byte[])((byte[])var1[0]))[var0] & 255;
   }

   static final Object[] a(int var0, int var1) {
      ++k;
      Object[] var2 = (Object[])((Object[])dna.a((byte)34, wv.e, (long)var0));
      if(var2 == null) {
         if(var1 >= -45) {
            a(52, (Object[])null, true);
         }

         byte[] var3 = qn.a(0, var0, gm.c, 93);
         var2 = mea.a(new Object[2], -17000);
         if(null != var3) {
            psa.a(jta.a((byte)-124, var3, new Object[3]), (byte)38, var0, var2);
         }

         il.a((long)var0, var2, true, wv.e);
         return var2;
      } else {
         return var2;
      }
   }

   abstract void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8);

   abstract void a(int var1, re var2);

   abstract void a(lua var1);

   static final void a(int var0, int var1, Object[] var2) {
      var2[10] = ((NativeHeap)((Object[])((Object[])var2[2]))[19]).a(var0 * var1, true);
      ++g;
      var2[9] = new Stream((Buffer)var2[10]);
   }

   abstract boolean f();

}
