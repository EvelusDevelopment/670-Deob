import jaclib.memory.heap.NativeHeapBuffer;
import jagdx.IDirect3DDevice;

final class dj {

   static int d;
   static int b;
   static int e;
   static int c;
   static int a;


   static final long a(Object[] var0, int var1) {
      ++a;
      return var1 != 1?-51L:(0 != ((int[])((int[])var0[1]))[3]?0L:((NativeHeapBuffer)var0[2]).b());
   }

   static final void a(Object[] var0, Object[] var1, byte var2) {
      if(var2 > -1) {
         a(false, (Object[])null);
      }

      ++e;
      pi.b(var0, false, var1);
      if(!((boolean[])((boolean[])var0[80]))[((int[])((int[])var0[1]))[7]]) {
         IDirect3DDevice.SetSamplerState(((long[])((long[])var0[50]))[5], ((int[])((int[])var0[1]))[7], 1, 1);
         ((boolean[])((boolean[])var0[80]))[((int[])((int[])var0[1]))[7]] = true;
      }

      if(!((boolean[])((boolean[])var0[84]))[((int[])((int[])var0[1]))[7]]) {
         IDirect3DDevice.SetSamplerState(((long[])((long[])var0[50]))[5], ((int[])((int[])var0[1]))[7], 2, 1);
         ((boolean[])((boolean[])var0[84]))[((int[])((int[])var0[1]))[7]] = true;
      }

   }

   static final void a(int var0, Object[] var1) {
      if(var0 == 28599) {
         ++b;
         ((boolean[])((boolean[])var1[8]))[0] = false;
      }
   }

   static final void a(boolean var0, Object[] var1) {
      if(var0) {
         a((Object[])null, (int)109);
      }

      if(-3 != ~((int[])((int[])var1[1]))[23]) {
         el.a(122, var1);
         oh.a(false, var1, (byte)-40);
         jea.a(var1, (byte)93, false);
         am.a(false, (byte)104, var1);
         kh.a(false, (byte)90, var1);
         ((int[])((int[])var1[1]))[23] = 2;
      }

      ++c;
   }

   static final void a(Object[] var0, byte var1) {
      ++d;
      ((boolean[])((boolean[])var0[0]))[1] = false;
      ((int[])((int[])var0[1]))[7] = 32;
      ((long[])((long[])var0[5]))[0] = he.a(var1 - 168);
      ((long[])((long[])var0[5]))[2] = 0L;
      if(var1 == 90) {
         ((int[])((int[])var0[1]))[5] = 0;
         ((int[])((int[])var0[1]))[4] = 0;
         ((int[])((int[])var0[1]))[3] = 0;
         ((long[])((long[])var0[5]))[1] = 0L;
         ((boolean[])((boolean[])var0[0]))[0] = true;
         ((int[])((int[])var0[1]))[6] = 0;
         if(null != var0 && var0.length == 14 && var0[3].equals(Integer.valueOf(0))) {
            vaa.a((Object[])null, 2);
         }

         var0[3] = new kp[8];
         var0[4] = new kp[8];
      }
   }

}
