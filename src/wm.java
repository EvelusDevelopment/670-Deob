import jagdx.IDirect3DDevice;

final class wm {

   static int b;
   static int e;
   static Object[] c = ho.a(4, 91, new Object[1], true);
   static int a = -1;
   static boolean d = true;


   static final void a(Object[] var0, Object[] var1, int var2) {
      ++e;
      if(var1 != null && var1.length == 14) {
         hda.a(114, var1, var0);
      } else if(null != var1 && 8 == var1.length) {
         jk.a(2, var0, var1);
      } else {
         if(var2 != 8) {
            a((Object[])null, (Object[])null, 36);
         }

         if(null != var1 && -12 == ~var1.length) {
            soa.a(var0, false, var1);
         } else if(var1 != null && var1.length == 12) {
            jk.a(2, var0, var1);
         } else {
            jk.a(2, var0, var1);
         }
      }
   }

   static final void a(Object[] var0, int var1) {
      if(var1 == -21452) {
         ++b;
         if(var0 != null && -88 == ~var0.length) {
            int var2 = ((int[])((int[])((Object[])((Object[])var0[72]))[0]))[0];
            if(var2 == 1) {
               IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 19, 9);
               IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 20, 2);
            } else if(2 != var2) {
               if(0 != var2) {
                  if(3 == var2) {
                     IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 19, 5);
                     IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 20, 6);
                  }
               } else {
                  IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 19, 2);
                  IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 20, 2);
               }
            } else {
               IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 19, 2);
               IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 20, 1);
            }

            var2 = ((int[])((int[])var0[1]))[19];
            if(var2 != 0) {
               if(var2 == 2) {
                  IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 207, 2);
                  IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 208, 2);
               } else if(var2 == 1) {
                  IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 207, 2);
                  IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 208, 1);
               }
            } else {
               IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 207, 1);
               IDirect3DDevice.SetRenderState(((long[])((long[])var0[50]))[5], 208, 1);
            }

         } else if(null != var0 && var0.length == 91) {
            kf.a(var0, (int)14176);
         } else {
            throw new IllegalStateException();
         }
      }
   }

}
