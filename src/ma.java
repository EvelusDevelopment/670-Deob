import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.fna;

final class ma extends lm {

   static int k;
   Object[] s;
   static int f_l;
   static Object[] q;
   static Object[] m = sj.a(64, new Object[3], (byte)-77);
   static int p;
   static int j;
   static int o;
   static int r;
   static boolean n = true;


   static final int b(Object[] var0, int var1) {
      ++j;
      if(var1 != 0) {
         ((byte[])((byte[])((Object[])((Object[])q[27]))[4]))[2] = 85;
      }

      return ((int[])((int[])var0[1]))[0];
   }

   static final boolean a(Object[] var0, int var1) {
      ++k;
      int var2 = IDirect3DDevice.TestCooperativeLevel(((long[])((long[])var0[var1]))[5]);
      if(0 == var2 || -2005530519 == var2) {
         IDirect3DDevice.SetDepthStencilSurface(((long[])((long[])var0[50]))[5], 0L);

         int var3;
         for(var3 = 0; 4 > var3; ++var3) {
            IDirect3DDevice.SetRenderTarget(((long[])((long[])var0[50]))[5], var3, 0L);
         }

         for(var3 = 0; 4 > var3; ++var3) {
            IDirect3DDevice.SetStreamSource(((long[])((long[])var0[50]))[5], var3, 0L, 0, 0);
         }

         for(var3 = 0; var3 < 4; ++var3) {
            IDirect3DDevice.SetTexture(((long[])((long[])var0[50]))[5], var3, 0L);
         }

         IDirect3DDevice.SetIndices(((long[])((long[])var0[50]))[5], 0L);
         tt.a(var0, true);
         ((D3DPRESENT_PARAMETERS)var0[83]).BackBufferWidth = 0;
         if(null != var0 && 6 == var0.length) {
            Class_k.a(true, (Object[])null);
         }

         ((D3DPRESENT_PARAMETERS)var0[83]).BackBufferHeight = 0;
         if(oi.a(((int[])((int[])var0[1]))[39], (D3DPRESENT_PARAMETERS)var0[83], ((int[])((int[])var0[1]))[10], ((long[])((long[])var0[50]))[6], ((int[])((int[])var0[1]))[41], (byte)11)) {
            var3 = IDirect3DDevice.Reset(((long[])((long[])var0[50]))[5], (D3DPRESENT_PARAMETERS)var0[83]);
            if(fna.a(var3, (byte)90)) {
               fea.a(var0, (byte)117);
               boa.a(var0, -125);
               return true;
            }

            System.exit(0);
         }
      }

      return false;
   }

   ma(Object[] var1) {
      this.s = var1;
   }

   static final void a(Object[] var0, int var1, int var2) {
      ((int[])((int[])var0[1]))[var2] = var1;
      ++p;
   }

   static final void a(Object[] var0, byte var1, boolean var2) {
      ++o;
      int var3 = -42 / ((var1 + 65) / 40);
      el.a(8448, 30862, 260, (Object[])((Object[])var0[0]));
   }

   static final boolean a(int var0, int var1, int var2, byte[] var3, int var4, int var5, int var6) {
      ++f_l;
      int var7 = var2 % var1;
      int var8;
      if(0 != var7) {
         var8 = var1 - var7;
      } else {
         var8 = 0;
      }

      int var9 = -((-1 + var5 + var1) / var1);
      int var10 = -((var2 - (-var1 - var4)) / var1);

      for(int var11 = var9; 0 > var11; ++var11) {
         for(int var12 = var10; 0 > var12; ++var12) {
            if(-1 == ~var3[var0]) {
               return true;
            }

            var0 += var1;
         }

         var0 -= var8;
         if(var3[-1 + var0] == 0) {
            return true;
         }

         var0 += var6;
      }

      return false;
   }

}
