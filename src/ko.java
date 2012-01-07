import jagdx.IDirect3DDevice;
import jagdx.fna;

final class ko {

   static int d;
   static int c = -1;
   static int b;
   static int a;


   static final void a(int var0, Object[] var1) {
      ++a;
      ((int[])((int[])var1[1]))[5] = Math.abs(((int[])((int[])var1[1]))[5]);
      if(((int[])((int[])var1[1]))[5] >= 4096) {
         ((int[])((int[])var1[1]))[5] = 4095;
      }

      int var10001 = var0 + 0;
      byte var10002 = (byte)(((int[])((int[])var1[1]))[5] >> 4);
      int[] var10003 = (int[])((int[])var1[1]);
      int var10006 = ((int[])((int[])var1[1]))[6];
      var10003[6] = ((int[])((int[])var1[1]))[6] + 1;
      woa.a(var1, var10001, var10002, var10006);
      ((int[])((int[])var1[1]))[var0] = 0;
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      ++b;
      if(var2 == 10080) {
         ((boolean[])((boolean[])var0[2]))[0] = false;
         un.b((byte)108, var0);
         ((lm)(null == var0?null:var0[0])).a((byte)87);
         cg.c(var1, (byte)127);
      }
   }

   static final boolean b(int var0, Object[] var1) {
      ++d;
      ((boolean[])((boolean[])var1[5]))[var0] = true;
      return fna.a(false, IDirect3DDevice.SetRenderTarget(((long[])((long[])((Object[])((Object[])var1[3]))[50]))[5], 0, ((long[])((long[])var1[4]))[2]))?false:(fna.a(false, IDirect3DDevice.SetDepthStencilSurface(((long[])((long[])((Object[])((Object[])var1[3]))[50]))[5], ((long[])((long[])var1[4]))[0]))?false:pna.a((byte)108, var1));
   }

}
