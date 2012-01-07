import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import java.awt.Component;

final class bk extends Class_s {

   static int p;
   static Object[] m = ho.a(3, 33, new Object[1], true);
   static int o;
   static int k;
   static int q;
   Object[] f_l;
   static int[] n;


   static final ka a(Object[] var0, int var1, int var2, int var3, int var4, boolean var5, ii var6) {
      if(var5) {
         a((Object[])null, (Object[])((Object[])m[0]), 40);
      }

      ++p;
      return new qna(var0, var6, var1, var2, var3, var4);
   }

   static final int a(Object[] var0, int var1, boolean var2) {
      ++q;
      if(var2) {
         n = (int[])((int[])m[0]);
      }

      return fca.a(-73, (Object[])((Object[])var0[0])) == uha.g?(se.a((Object[])((Object[])var0[0]), (byte)-122)?3:(0 != var1 && 1 != cf.a((int)-84, (Object[])((Object[])((Object[])((Object[])var0[0]))[3]))?2:1)):3;
   }

   bk(Object[] var1) {
      this.f_l = var1;
   }

   static final void b(Object[] var0, byte var1) {
      try {
         ++k;
         gua.a(true, var0);
         var0[7] = new D3DPRESENT_PARAMETERS((Component)var0[6]);
         if(var1 == -115) {
            ((D3DPRESENT_PARAMETERS)var0[7]).BackBufferWidth = ((int[])((int[])var0[2]))[0];
            ((D3DPRESENT_PARAMETERS)var0[7]).Windowed = true;
            ((D3DPRESENT_PARAMETERS)var0[7]).BackBufferHeight = ((int[])((int[])var0[2]))[1];
            ((D3DPRESENT_PARAMETERS)var0[7]).BackBufferCount = 1;
            if(((boolean[])((boolean[])var0[5]))[0]) {
               ((long[])((long[])var0[4]))[1] = IDirect3DDevice.GetSwapChain(((long[])((long[])((Object[])((Object[])var0[3]))[50]))[5], 0);
               ((long[])((long[])var0[4]))[2] = IDirect3DSwapChain.GetBackBuffer(((long[])((long[])var0[4]))[1], 0, 0);
               ((long[])((long[])var0[4]))[0] = IDirect3DDevice.GetDepthStencilSurface(((long[])((long[])((Object[])((Object[])var0[3]))[50]))[5]);
            } else {
               if(!oi.a(((int[])((int[])((Object[])((Object[])var0[3]))[1]))[39], (D3DPRESENT_PARAMETERS)var0[7], ((int[])((int[])((Object[])((Object[])var0[3]))[1]))[10], ((long[])((long[])((Object[])((Object[])var0[3]))[50]))[6], ((int[])((int[])((Object[])((Object[])var0[3]))[1]))[41], (byte)11)) {
                  throw new RuntimeException();
               }

               int var2 = ((D3DPRESENT_PARAMETERS)var0[7]).AutoDepthStencilFormat;
               ((long[])((long[])var0[4]))[1] = IDirect3DDevice.CreateAdditionalSwapChain(((long[])((long[])((Object[])((Object[])var0[3]))[50]))[5], (D3DPRESENT_PARAMETERS)var0[7]);
               ((long[])((long[])var0[4]))[2] = IDirect3DSwapChain.GetBackBuffer(((long[])((long[])var0[4]))[1], 0, 0);
               ((long[])((long[])var0[4]))[0] = IDirect3DDevice.CreateDepthStencilSurface(((long[])((long[])((Object[])((Object[])var0[3]))[50]))[5], ((int[])((int[])var0[2]))[0], ((int[])((int[])var0[2]))[1], var2, ((D3DPRESENT_PARAMETERS)var0[7]).MultiSampleType, ((D3DPRESENT_PARAMETERS)var0[7]).MultiSampleQuality, false);
            }

            if(((boolean[])((boolean[])var0[5]))[1]) {
               ko.b(1, var0);
            }

         }
      } catch (RuntimeException var3) {
         throw vt.a(var3, "bk.C(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      ++o;
      Object[] var4 = sba.a(var0, (byte)-72, var1);
      if(var4 != null) {
         ((lm)(var4 != null?var4[1]:null)).a((byte)15);
      }

      if(var2 != 5) {
         m = (Object[])null;
      }

   }

}
