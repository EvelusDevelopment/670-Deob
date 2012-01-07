import jagdx.D3DLIGHT;
import jagdx.IDirect3DDevice;

final class boa extends tha {

   static Object[] t = st.a(new Object[1], 7, 43, 11);
   static int u;
   Object[] v;
   static int w;
   static int x;


   static final void a(int var0, int var1, int var2, Object[] var3, Object[] var4) {
      Object[] var5 = ws.a(var0, var1, var2);
      if(var5 != null) {
         var5[8] = var3;
         var5[0] = var4;
         int var6 = jp.o == wd.a?1:0;
         if(eb.c(117, var3)) {
            if(kca.a(var3, 27381)) {
               var3[11] = usa.e[var6];
               usa.e[var6] = var3;
            } else {
               var3[11] = ri.f_l[var6];
               ri.f_l[var6] = var3;
               bla.b = true;
            }
         } else {
            var3[11] = sfa.g[var6];
            sfa.g[var6] = var3;
         }

         if(var4 != null) {
            if(eb.c(89, var4)) {
               if(kca.a(var4, 27381)) {
                  var4[11] = usa.e[var6];
                  usa.e[var6] = var4;
               } else {
                  var4[11] = ri.f_l[var6];
                  ri.f_l[var6] = var4;
                  bla.b = true;
               }
            } else {
               var4[11] = sfa.g[var6];
               sfa.g[var6] = var4;
            }
         }
      }

   }

   boa(Object[] var1) {
      this.v = var1;
   }

   static final Object[] a(byte var0, Object[] var1) {
      if(var0 != -122) {
         return (Object[])null;
      } else {
         ++w;
         gq.b((byte)-119, var1);
         return var1;
      }
   }

   static final void a(Object[] var0, int var1) {
      ++u;

      for(int var2 = 0; ((int[])((int[])var0[1]))[8] > var2; ++var2) {
         IDirect3DDevice.SetSamplerState(((long[])((long[])var0[50]))[5], var2, 7, 2);
         IDirect3DDevice.SetSamplerState(((long[])((long[])var0[50]))[5], var2, 6, 2);
         IDirect3DDevice.SetSamplerState(((long[])((long[])var0[50]))[5], var2, 5, 2);
         if(null != var0 && var0.length == 12 && var0[4].equals(Boolean.valueOf(false))) {
            return;
         }

         IDirect3DDevice.SetSamplerState(((long[])((long[])var0[50]))[5], var2, 1, 1);
         IDirect3DDevice.SetSamplerState(((long[])((long[])var0[50]))[5], var2, 2, 1);
         ((Object[][])((Object[][])var0[76]))[var2] = hw.e;
         boolean[] var3 = (boolean[])((boolean[])var0[80]);
         ((boolean[])((boolean[])var0[84]))[var2] = true;
         var3[var2] = true;
         ((boolean[])((boolean[])var0[85]))[var2] = false;
         ((int[])((int[])var0[81]))[var2] = 0;
      }

      IDirect3DDevice.SetTextureStageState(((long[])((long[])var0[50]))[5], 0, 6, 1);
      IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 9, 2);
      IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 23, 4);
      IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 25, 5);
      IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 24, 0);
      if(var0 != null && -19 == ~var0.length && var0[2].equals(Integer.valueOf(1))) {
         li.a(-114, 31961, 65, (Object[])null, -82, (Object[])null, 43);
      }

      IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 22, 2);
      IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 147, 1);
      IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 145, 1);
      IDirect3DDevice.a(((long[])((long[])var0[50]))[5], 38, 0.95F);
      IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 35, 3);
      IDirect3DDevice.a(((long[])((long[])var0[50]))[5], 154, 1.0F);
      D3DLIGHT.SetType(((long[])((long[])var0[50]))[3], 3);
      D3DLIGHT.SetType(((long[])((long[])var0[50]))[2], 3);
      if(var1 < -42) {
         D3DLIGHT.SetType(((long[])((long[])var0[50]))[4], 1);
         IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 206, 1);
         ((boolean[])((boolean[])var0[63]))[21] = false;
         if(var0 != null && var0.length == 87) {
            pa.a(var0, true, 7);
         } else {
            if(var0 == null || var0.length != 91) {
               throw new IllegalStateException();
            }

            sh.a(7, var0, false);
         }

         jga.a(true, var0);
      }
   }

}
