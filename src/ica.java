import jagdx.IDirect3DDevice;
import jagdx.fna;

final class ica extends lm {

   static int k;
   static int f_l;
   Object[] m;
   static int j;


   static final void a(long[] var0, Object[] var1, int var2) {
      if(var2 <= -3) {
         vga.a(0, -1 + var0.length, 0, var1, var0);
         ++k;
      }
   }

   static final void a(Object[] var0, boolean var1) {
      if(!var1) {
         ++f_l;
         if(var0[8] != null) {
            qi.a((Object[])((Object[])var0[8]), (int)4);
            var0[8] = null;
         }

      }
   }

   static final boolean a(Object[] var0, byte var1, long var2) {
      int var4 = -47 / ((var1 + 31) / 50);
      ++j;
      return fna.a(IDirect3DDevice.SetDepthStencilSurface(((long[])((long[])((Object[])((Object[])var0[2]))[50]))[5], var2), (byte)107);
   }

   ica(Object[] var1) {
      this.m = var1;
   }

}
